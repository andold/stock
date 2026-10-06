# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## 언어 규칙 (항상 적용)

- 모든 사용자 응답은 한글(한국어)로 한다.
- 모든 생성되는 문서는 한글(한국어)로 작성한다.

## 개요

배당 중심 주식 분석 도구. Spring Boot 3 (Java 21) WAR 애플리케이션으로, 외부 사이트(Seibro, KIND, data.go.kr 공공 API 등)에서 종목·시세·배당 정보를 크롤링해 PostgreSQL에 저장하고 REST API(`/stock/api/...`)로 제공한다. 데이터 출처별 사용 여부는 README.md 참고 (2024-03 이후 KRX·네이버는 사용하지 않음).

## 빌드 / 테스트

```bash
./gradlew build -Pprofile=dev -x test     # 배포용 WAR (build/libs/stock-<version>.war)
./gradlew test --tests "kr.andold.stock.job.CrawlPriceLatestDataGoKrEtfJobTest"            # 단일 테스트 클래스
./gradlew test --tests "kr.andold.stock.job.CrawlPriceLatestDataGoKrEtfJobTest.main"       # 단일 테스트 메서드
```

- 의존성 `kr.andold:utils`는 GitHub Packages(`maven.pkg.github.com/andold/utils`)에서 받으므로 Gradle 속성 `mavenUser`, `mavenPassword`(예: `~/.gradle/gradle.properties`)가 필요하다.
- **리소스 프로파일**: `-Pprofile=<name>`을 주면 `src/main/resources` + `src/main/resources-<name>`(dev, linux)을 사용한다. 주지 않으면 `src/main/resources` + `src/test/resources` + `src/test/resources-local`을 사용한다 (`resources-local`은 gitignore 대상, 로컬에만 존재). `src/test/resources-n150`, `-opi5`는 다른 머신용 설정.
- 대부분의 테스트는 `@SpringBootTest`로 실제 DB·외부 사이트·ZooKeeper에 접속하는 통합/수동 실행용 테스트다. assertion이 거의 없고 로그로 결과를 확인한다. Spring 없이 도는 것은 `NoSpringTest`, `*NoSpringBootTest` 정도.
- Selenium 크롤링은 Chrome/chromedriver가 필요하다 (`application.selenium.webdriver.chrome.driver` 속성).

## ANTLR 문법

`src/main/resources/grammar/*.g4`(Stock, Seibro, SeibroEtf, KrxEtf; Common은 공통 import)에서 `src/main/java/kr/andold/stock/antlr/`의 파서가 생성된다. 생성 코드는 커밋되어 있으며 직접 수정하지 않는다. 문법 수정 후 재생성:

```bat
antlr.bat   :: 프로젝트 루트에서 실행 (antlr-4.13.0-complete.jar 사용)
```

배포 스크립트(`resources-*/deploy-stock-*.sh`)는 빌드 전에 antlr-4.10.1로 재생성하며, `build.gradle`도 `antlr4-runtime`을 4.10.1로 강제한다. 파싱된 결과는 `service/ParserService`가 소비한다.

## 아키텍처

계층: `controller`(REST) → `service` → `repository`(Spring Data JPA + `*Specification`) → `entity`. 서비스 간 데이터 전달은 `domain/*Domain`, 검색 조건은 `param/*Param`. 핵심 테이블은 `stock_item`, `stock_dividend_history`, `stock_price` (`sqlmap/schema.sql`, `ddl-auto=none`).

### 잡 큐 시스템 (여러 파일에 걸친 핵심 흐름)

- `service/JobService`가 우선순위 큐 4개(`queue0`~`queue3`, `ConcurrentLinkedDeque<Job>`)를 정적 필드로 보유한다. 낮은 번호가 먼저 처리된다.
- `ScheduledTasks.secondly()`가 계속 `jobService.run()`을 호출해 큐에서 하나씩 꺼내 실행한다. 실행 후 네트워크 사용량(분당 약 1MB)에 맞춰 스로틀링한다.
- `Job`은 `Callable<STATUS>` 인터페이스(`JobService.Job`). `getTimeout()`(초) 안에 단일 스레드 executor로 실행되며, 일부 내부 잡(`BackupJob`, `DeduplicatePriceJob`, `StockCompileJob`, `ItemPriceJob` 등 `JobService` 내부 클래스)은 `run(Job)`에서 `instanceof`로 직접 분기 처리된다.
- `job/` 패키지의 잡들은 `@Service` 빈이며 정적 `regist(deque, ...)`로 등록한다. `regist`는 모든 큐를 훑어 같은 종류의 잡이 이미 있으면 파라미터(시작일 등)만 병합하고, 없으면 `ApplicationContextProvider.getBean(...)`으로 빈을 얻어 큐에 넣는다. 새 잡을 추가할 때 이 패턴을 따른다.
- `ScheduledTasks`의 daily/weekly/monthly/yearly 크론이 잡을 등록하며, **ZooKeeper 리더 선출에서 master인 인스턴스만** 등록한다 (`ZookeeperClient.isMaster()`, `application.zookeeper.*`). znode 경로에 `test`가 포함되면 테스트 환경으로 간주한다.

### 크롤러

`crawler/` 패키지에 출처별 크롤러(`Seibro`, `Kind`, `Krx`, `Naver`)가 있고, `CrawlerService`가 Selenium(`kr.andold.utils.ChromeDriverWrapper`) 기반 공통 처리를 한다. data.go.kr 공공 API는 `service/DataGoKrService`(응답 모델 `domain/ResultDataGoKr`)로 호출한다. 크롤러 결과는 `ParserService.ParserResult`(items/histories/prices)로 모아 각 서비스의 `put`으로 저장한다.

## 배포

`src/main/resources-<profile>/deploy-stock-<profile>.sh`: ANTLR 재생성 → `gradlew build -Pprofile=<profile> -x test` → 외부 Tomcat 중지 → WAR를 doc_base에 압축 해제 → Tomcat 재시작. 컨텍스트 경로는 `/stock`.

## 코드 컨벤션

- 들여쓰기는 탭. Lombok(`@Slf4j`, `@Builder`, `@Data`, `@Getter`) 사용.
- 메서드 로깅 관례: 시작 시 `log.xxx("{} method(...)", Utility.indentStart(), ...)`, 종료 시 `log.xxx("{} 『결과』 method(...) - {}", Utility.indentEnd(), ..., Utility.toStringPastTimeReadable(started))`. 결과 값은 `『』`로 감싼다.
- 결과 상태는 `domain/Result.STATUS` enum으로 반환한다.
- `Utility`가 두 개 있다: 공통 라이브러리 `kr.andold.utils.Utility`와 이를 확장한 프로젝트용 `kr.andold.stock.service.Utility`. 주변 코드가 쓰는 쪽을 따른다.
