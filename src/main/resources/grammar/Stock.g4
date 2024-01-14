grammar Stock;

import	Common;

@header {
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.stock.service.ParserService;
}

@members	{
	private final Logger log = LoggerFactory.getLogger(getClass());
}

stockDocument
:	crawlDividendHistoryCompanyThread	// KSD증권정보포털(SEIBro) > 주식 > 배당정보 > 배당내역전체겁색 > 조회
|	crawlDividendHistoryEtfThread	// KSD증권정보포털(SEIBro) > ETF > ???
|	crawlItemDividendTopCompany		// KSD증권정보포털(SEIBro) > 주식 > 배당정보 > 배당순위
|	crawlItemEtf					// KSD증권정보포털(SEIBro) > ETF > 종목발행현황
|	crawlItemDetailCompanyThread	// KSD증권정보포털(SEIBro) > 주식 > 종목별상세정보 > 종목종합내역 (KSD증권정보포털(SEIBro) > 기업 > 기업기본정보와 동일)
|	crawlEtfDetailThread			// KSD증권정보포털(SEIBro) > ETF > ETF종합정보 > 종목상세
|	crawlPriceCompany				// KSD증권정보포털(SEIBro) > 주식 > 종목별상세정보 > 일자별시세
|	crawlPriceEtf					// KSD 증권정보포털 SEIBro > ETF > ETF종합정보 > 기준가추이
|	crawlPriceKrx					// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 개별종목 시세 추이
|	companyAllPrice					// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목시세 > 전종목 시세
|	etfAllPrice						// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 전종목 시세
|	krxBasicInfoCompany				// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목정보 > 전종목 기본정보
|	krxBasicInfoEtf					// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 전종목 기본정보
|	krxItemInfoCompany				// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목정보 > 개별정보 종합정보
|	krxItemInfoEtf					// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 개별종목 종합정보
|	krxPriceCompany					// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목시세 > 개별종목 시세 추이
|	krxPriceEtf						// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 개별종목 시세 추이
;


// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목시세 > 개별종목 시세 추이
krxPriceCompany:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 주식 > 종목시세 > 개별종목 시세 추이 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020103 
	(
		(
			NUMBER TAB										NEWLINE		//	175330 	 
			NUMBER TAB										NEWLINE		//	175330 	 
			NUMBER TAB										NEWLINE		//	175330 	 
			NUMBER TAB										NEWLINE		//	175330 	 
			NUMBER TAB										NEWLINE		//	175330 	 
			NUMBER TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			NUMBER TAB TAB TAB										NEWLINE		//	175330 	 	 	 
			NUMBER TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			NUMBER TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			NUMBER TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 
			NUMBER TAB										NEWLINE		//	175330 	 
			NUMBER TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			NUMBER TAB TAB TAB										NEWLINE		//	175330 	 	 	 
			NUMBER TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			NUMBER TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			NUMBER TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 
			NUMBER TAB										NEWLINE		//	175330 	 
			NUMBER TAB										NEWLINE		//	175330 	 
			NUMBER TAB										NEWLINE		//	175330 	 
			NUMBER TAB										NEWLINE		//	175330 	 
			NUMBER TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			NUMBER TAB TAB TAB										NEWLINE		//	175330 	 	 	 
			NUMBER TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			NUMBER TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			NUMBER TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 
			NUMBER TAB										NEWLINE		//	175330 	 
			NUMBER TAB										NEWLINE		//	175330 	 
			NUMBER TAB										NEWLINE		//	175330 	 
			NUMBER TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			NUMBER TAB TAB TAB										NEWLINE		//	175330 	 	 	 
			NUMBER TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			NUMBER TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			NUMBER TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 
			NUMBER TAB WORD										NEWLINE		//	175330 	 일자종가대비등락률시가고가저가거래량거래대금시가총액상장주식수 
			NUMBER TAB										NEWLINE		//	175330 	 
			(
				code=NUMBER TAB base=DATE										NEWLINE		//	175330 	 2021/01/13 
				NUMBER TAB closing=NUMBER										NEWLINE		//	175330 	 5,740 
				NUMBER TAB NUMBER										NEWLINE		//	175330 	 50 
				NUMBER TAB NUMBER										NEWLINE		//	175330 	 +0.88 
				NUMBER TAB market=NUMBER				NEWLINE		//	402970 	 10,050 
				NUMBER TAB high=NUMBER					NEWLINE		//	402970 	 10,140 
				NUMBER TAB low=NUMBER					NEWLINE		//	402970 	 10,050 
				NUMBER TAB volume=NUMBER				NEWLINE		//	402970 	 42,219 
				NUMBER TAB NUMBER						NEWLINE		//	175330 	 5,470,752,030 
				NUMBER TAB NUMBER						NEWLINE		//	175330 	 1,130,681,811,560 
				NUMBER TAB volumeOfListedShares=NUMBER	NEWLINE		//	175330 	 196,982,894 
				NUMBER TAB								NEWLINE		//	175330 	 
				{
					ParserService.price(20240112
						, $code.text
						, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
					);
				}
			)+ 	 	 	 
		)+
		WORD TAB WORD TAB DATE							NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 주식 > 종목시세 > 개별종목 시세 추이 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020103 
;


// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 개별종목 시세 추이
krxPriceEtf:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 증권상품 > ETF > 개별종목 시세 추이 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201030103
	(
		(
			NUMBER TAB									NEWLINE		//	402970 	 
			NUMBER TAB TAB TAB							NEWLINE		//	402970 	 	 	 
			NUMBER TAB TAB TAB							NEWLINE		//	402970 	 	 	 
			NUMBER TAB TAB TAB							NEWLINE		//	402970 	 	 	 
			NUMBER TAB TAB TAB							NEWLINE		//	402970 	 	 	 
			NUMBER TAB TAB TAB							NEWLINE		//	402970 	 	 	 
			NUMBER TAB TAB TAB							NEWLINE		//	402970 	 	 	 
			NUMBER TAB TAB TAB WORD						NEWLINE		//	402970 	 	 	 일자종가대비등락률순자산가치(NAV)시가고가저가거래량거래대금시가총액순자산총액상장좌수지수명종가대비등락률 
			NUMBER TAB TAB TAB							NEWLINE		//	402970
			(
				code=word TAB base=DATE					NEWLINE		//	402970 	 2021/10/21 
				NUMBER TAB closing=NUMBER					NEWLINE		//	402970 	 10,080 
				NUMBER TAB NUMBER						NEWLINE		//	402970 	 85 
				NUMBER TAB NUMBER						NEWLINE		//	402970 	 +0.85 
				NUMBER TAB nav=NUMBER					NEWLINE		//	402970 	 10,108.12 
				NUMBER TAB market=NUMBER				NEWLINE		//	402970 	 10,050 
				NUMBER TAB high=NUMBER					NEWLINE		//	402970 	 10,140 
				NUMBER TAB low=NUMBER					NEWLINE		//	402970 	 10,050 
				NUMBER TAB volume=NUMBER				NEWLINE		//	402970 	 42,219 
				NUMBER TAB NUMBER						NEWLINE		//	402970 	 425,885,480 
				NUMBER TAB NUMBER						NEWLINE		//	402970 	 10,080,000,000 
				NUMBER TAB NUMBER						NEWLINE		//	402970 	 10,108,122,720 
				NUMBER TAB volumeOfListedShares=NUMBER	NEWLINE		//	402970 	 1,000,000 
				NUMBER TAB word+						NEWLINE		//	402970 	 Dow Jones U.S. Dividend 100 Price Return Index 
				NUMBER TAB word							NEWLINE		//	402970 	 5,507.43 
				NUMBER TAB word							NEWLINE		//	402970 	 - 
				NUMBER TAB word							NEWLINE		//	402970 	 - 
				NUMBER TAB								NEWLINE		//	402970 	 
				{
					ParserService.price(20240112
						, $code.text
						, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
					);
				}
			)+ 	 	 	 
		)+
		WORD TAB WORD TAB DATE							NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 증권상품 > ETF > 개별종목 시세 추이 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201030103 
;


// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목정보 > 개별정보 종합정보
krxItemInfoCompany:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 주식 > 종목정보 > 개별정보 종합정보 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020203 

	KEYWORD TAB type=WORD 										NEWLINE		//	KEYWORD 	 KOSPI 
	WORD TAB WORD TAB
			symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* TAB
			word+ TAB											NEWLINE		//	한글명 	 영문명 	 JB금융지주 	 JB Financial Group Co., Ltd. 	 
	WORD TAB WORD TAB WORD TAB code=word TAB					NEWLINE		//	표준코드 	 종목코드 	 KR7175330000 	 175330 	 
	WORD TAB WORD TAB word TAB NUMBER TAB						NEWLINE		//	액면가 	 결산월 	 5,000 	 12 	 
	WORD TAB WORD TAB volumeOfListedShares=NUMBER TAB WORD TAB	NEWLINE		//	상장주식수(주) 	 소속부 	 196,982,894 	 - 	 
	WORD TAB WORD TAB ipo=DATE TAB DATE TAB						NEWLINE		//	상장일 	 설립일 	 2013/07/18 	 2013/07/01 	 
	WORD TAB WORD TAB
			category=word category1=word? category2=word? category3=word? category4=word? category5=word? category6=word? category7=word* TAB
			word+ TAB											NEWLINE		//	업종명 	 대표이사 	 기타 금융업 	 김기홍 	 
	WORD TAB word+ TAB											NEWLINE		//	주소 	 전라북도 전주시 덕진구 백제대로 566 	 
	WORD TAB (NUMBER TAB)? word* TAB							NEWLINE		//	전화번호 	 02-2128-2714 	 
																			//	WORD TAB NUMBER TAB WORD TAB	NEWLINE		//	전화번호 	 02 	 -2088-8526 	 
	WORD TAB WORD TAB											NEWLINE		//	홈페이지 	 www.jbfg.com 	 

	WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 

	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 주식 > 종목정보 > 개별정보 종합정보 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020203 
	{
		ParserService.item(20240112
			, $code.text
			, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
			, $category.text, $category1.text, $category2.text, $category3.text, $category4.text, $category5.text, $category6.text, $category7.text
			, $type.text
			, $ipo.text
			, $volumeOfListedShares.text
			, null
		);
	}
;


// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 개별종목 종합정보
krxItemInfoEtf:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 증권상품 > ETF > 개별종목 종합정보 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201030105 

	KEYWORD TAB symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*		NEWLINE
	WORD TAB WORD TAB word+ TAB word+ TAB									NEWLINE
					//	ETF종목명 	 자산운용사 	 미래에셋 TIGER 미국나스닥100커버드콜증권상장지수투자신탁(주식-파생형)(합성) 	 미래에셋자산운용 	 
	WORD TAB WORD TAB WORD TAB code=word TAB								NEWLINE		//	표준코드 	 단축코드 	 KR7441680006 	 441680 	 
	WORD TAB WORD TAB word+ TAB word+ TAB									NEWLINE		//	기초지수명 	 지수산출기관 	 Cboe Nasdaq-100 BuyWrite V2 지수 (Total Return) 	 NASDAQ 	 
	WORD TAB WORD TAB NUMBER TAB volumeOfListedShares=NUMBER TAB			NEWLINE		//	순자산규모(백만원) 	 상장좌수(좌) 	 252,027 	 25,400,000 	 
	WORD TAB WORD TAB NUMBER TAB ipo=DATE TAB								NEWLINE		//	전일NAV 	 상장일 	 9,922.33 	 2022/09/22 	 
	WORD TAB WORD TAB WORD TAB WORD TAB										NEWLINE		//	펀드형태 	 과세유형 	 수익증권형 	 배당소득세(보유기간과세) 	 
	WORD TAB WORD TAB WORD TAB WORD TAB										NEWLINE		//	추적배수 	 복제방법 	 일반 	 합성(패시브) 	 
	WORD TAB WORD TAB WORD TAB
			category=word category1=word? category2=word? category3=word? category4=word? category5=word? category6=word? category7=word* TAB	NEWLINE
					//	기초시장(국내/해외여부) 	 기초자산(주식/시장대표) 	 해외 	 주식-전략-구조화 	 
	WORD WORD TAB word+ TAB													NEWLINE		//	분배금 기준일 	 매월 마지막 영업일 	 
	WORD TAB word+ TAB														NEWLINE		//	유동성공급자(LP) 	 신한증권, 한국증권, 대신증권, 미래에셋증권, 메리츠, NH투자증권, KB증권, 삼성증권, 키움증권, 이베스트 	 

	WORD TAB WORD TAB DATE													NEWLINE		//	andold 	 since 	 2023-11-27 

	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD TAB WORD				NEWLINE		//	KEYWORD 	 KRX 	 증권상품 > ETF > 개별종목 종합정보 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201030105 
	{
		ParserService.item(20240112
			, $code.text
			, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
			, $category.text, $category1.text, $category2.text, $category3.text, $category4.text, $category5.text, $category6.text, $category7.text
			, "ETF"
			, $ipo.text
			, $volumeOfListedShares.text
			, null
		);
	}
;


// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 전종목 기본정보
krxBasicInfoEtf:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD TAB WORD					NEWLINE		//	KEYWORD 	 KRX 	 증권상품 > ETF > 전종목 기본정보 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201030104 
	(
		WORD TAB										NEWLINE		//	ETF 	 
		WORD TAB TAB TAB										NEWLINE		//	ETF 	 	 	 
		WORD TAB TAB TAB										NEWLINE		//	ETF 	 	 	 
		WORD TAB TAB TAB										NEWLINE		//	ETF 	 	 	 
		WORD TAB TAB TAB										NEWLINE		//	ETF 	 	 	 
		WORD TAB TAB TAB										NEWLINE		//	ETF 	 	 	 
		WORD TAB TAB TAB										NEWLINE		//	ETF 	 	 	 
		WORD TAB TAB TAB										NEWLINE		//	ETF 	 	 	 
		WORD TAB TAB TAB										NEWLINE		//	ETF 	 	 	 
		WORD TAB TAB TAB										NEWLINE		//	ETF 	 	 	 
		WORD TAB TAB TAB										NEWLINE		//	ETF 	 	 	 
		WORD TAB TAB TAB										NEWLINE		//	ETF 	 	 	 
		WORD TAB TAB TAB										NEWLINE		//	ETF 	 	 	 
		WORD TAB TAB TAB										NEWLINE		//	ETF 	 	 	 
		WORD TAB TAB TAB										NEWLINE		//	ETF 	 	 	 
		WORD TAB TAB TAB										NEWLINE		//	ETF 	 	 	 
		WORD TAB TAB TAB										NEWLINE		//	ETF 	 	 	 
		WORD TAB TAB TAB										NEWLINE		//	ETF 	 	 	 
		WORD TAB TAB TAB										NEWLINE		//	ETF 	 	 	 
		WORD TAB TAB TAB WORD									NEWLINE		//	ETF 	 	 	 표준코드단축코드한글종목명한글종목약명영문종목명상장일기초지수명지수산출기관추적배수복제방법기초시장분류기초자산분류상장좌수운용사CU수량총보수과세유형 
		WORD TAB TAB TAB										NEWLINE		//	ETF 	 	 	 
		((
			WORD TAB WORD									NEWLINE		//	ETF 	 KR7391680006 
			WORD TAB code=word								NEWLINE		//	ETF 	 391680 
			WORD TAB										NEWLINE		//	ETF 	 
			WORD TAB TAB word+								NEWLINE		//	ETF 	 	 흥국 HK 하이볼액티브증권상장지수투자신탁(주식) 
			WORD TAB TAB symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*	NEWLINE		//	ETF 	 	 HK 하이볼액티브 
			WORD TAB										NEWLINE		//	ETF 	 
			WORD TAB word+									NEWLINE		//	ETF 	 Heungkuk HK HighVol Active ETF 
			WORD TAB ipo=DATE								NEWLINE		//	ETF 	 2021/07/06 
			WORD TAB word+									NEWLINE		//	ETF 	 코스피 200 
			WORD TAB word+									NEWLINE		//	ETF 	 KRX | (ICE Data Indices, LLC)
			WORD TAB word+									NEWLINE		//	ETF 	 일반 | (2X 레버리지)
			WORD TAB WORD									NEWLINE		//	ETF 	 실물(액티브) 
			WORD TAB										NEWLINE		//	ETF 	 
			WORD TAB TAB WORD								NEWLINE		//	ETF 	 	 국내 
			WORD TAB TAB WORD								NEWLINE		//	ETF 	 	 주식 
			WORD TAB TAB									NEWLINE		//	ETF 	 	 
			WORD TAB volumeOfListedShares=NUMBER			NEWLINE		//	ETF 	 550,000 
			WORD TAB word+									NEWLINE		//	ETF 	 흥국자산운용 
			WORD TAB NUMBER									NEWLINE		//	ETF 	 50,000 
			WORD TAB fee=NUMBER								NEWLINE		//	ETF 	 0.300000 
			WORD TAB WORD									NEWLINE		//	ETF 	 배당소득세(보유기간과세) 
			WORD TAB										NEWLINE		//	ETF 	 
			{
				ParserService.item(20240112
					, $code.text
					, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
					, null, null, null, null, null, null, null, null
					, null
					, $ipo.text
					, $volumeOfListedShares.text
					, null
				);
			}
		))+

		WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
	)+ 

	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD TAB WORD					NEWLINE		//	KEYWORD 	 KRX 	 증권상품 > ETF > 전종목 기본정보 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201030104 
;


// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목정보 > 전종목 기본정보
krxBasicInfoCompany:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 주식 > 종목정보 > 전종목 기본정보 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020201 
	(
		KEYWORD TAB										NEWLINE		//	KEYWORD 	 
		KEYWORD TAB										NEWLINE		//	KEYWORD 	 
		KEYWORD TAB										NEWLINE		//	KEYWORD 	 
		KEYWORD TAB										NEWLINE		//	KEYWORD 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 
		KEYWORD TAB										NEWLINE		//	KEYWORD 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 
		KEYWORD TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 
		KEYWORD TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB										NEWLINE		//	KEYWORD 	 	 
		KEYWORD TAB										NEWLINE		//	KEYWORD 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 
		KEYWORD TAB										NEWLINE		//	KEYWORD 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 
		KEYWORD TAB										NEWLINE		//	KEYWORD 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 
		KEYWORD TAB										NEWLINE		//	KEYWORD 	 
		KEYWORD TAB										NEWLINE		//	KEYWORD 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 
		KEYWORD TAB										NEWLINE		//	KEYWORD 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 
		KEYWORD TAB										NEWLINE		//	KEYWORD 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 
		KEYWORD TAB WORD										NEWLINE		//	KEYWORD 	 표준코드단축코드한글종목명한글종목약명영문종목명상장일시장구분증권구분소속부주식종류액면가상장주식수 
		KEYWORD TAB										NEWLINE		//	KEYWORD 	 
		((
			KEYWORD TAB WORD							NEWLINE		//	KEYWORD 	 KR7098120009 
			KEYWORD TAB code=word						NEWLINE		//	KEYWORD 	 098120 | 00104K
			KEYWORD TAB									NEWLINE		//	KEYWORD 	 
			KEYWORD TAB TAB								NEWLINE		//	KEYWORD 	 	 
			KEYWORD TAB TAB TAB word+					NEWLINE		//	KEYWORD 	 	 	 (주)마이크로컨텍솔루션 
			KEYWORD TAB TAB TAB symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*	NEWLINE		//	KEYWORD 	 	 	 마이크로컨텍솔 
			KEYWORD TAB TAB TAB word+					NEWLINE		//	KEYWORD 	 	 	 Micro Contact Solution Co.,Ltd. 
			KEYWORD TAB TAB TAB							NEWLINE		//	KEYWORD 	 	 	 
			KEYWORD TAB TAB TAB							NEWLINE		//	KEYWORD 	 	 	 
			KEYWORD TAB TAB								NEWLINE		//	KEYWORD 	 	 
			KEYWORD TAB ipo=DATE						NEWLINE		//	KEYWORD 	 2008/09/23 
			KEYWORD TAB type=WORD word*					NEWLINE		//	KEYWORD 	 KOSDAQ 
			KEYWORD TAB WORD							NEWLINE		//	KEYWORD 	 주권 
			KEYWORD TAB word*							NEWLINE		//	KEYWORD 	 중견기업부 
			KEYWORD TAB WORD							NEWLINE		//	KEYWORD 	 보통주 
			KEYWORD TAB word							NEWLINE		//	KEYWORD 	 500 | 무액면
			KEYWORD TAB volumeOfListedShares=NUMBER		NEWLINE		//	KEYWORD 	 8,312,766 
			KEYWORD TAB									NEWLINE		//	KEYWORD 	 
			{
				ParserService.item(20240112
					, $code.text
					, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
					, null, null, null, null, null, null, null, null
					, $type.text
					, $ipo.text
					, $volumeOfListedShares.text
					, null
				);
			}
		))+

		WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
	)+ 

	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 주식 > 종목정보 > 전종목 기본정보 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020201 
;


// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 전종목 시세
etfAllPrice:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 ETF > 전종목 시세 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020101 
	(
		WORD TAB DATE TAB										NEWLINE		//	ETF 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	ETF 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	ETF 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	ETF 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	ETF 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	ETF 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	ETF 	 2024-01-09 	 
		WORD TAB DATE TAB WORD									NEWLINE		//	ETF 	 2024-01-09 	 종목코드종목명종가대비등락률순자산가치(NAV)시가고가저가거래량거래대금시가총액순자산총액상장좌수지수명종가대비등락률 
		WORD TAB DATE TAB										NEWLINE		//	ETF 	 2024-01-09 	 
		((
			WORD TAB DATE TAB code=NUMBER						NEWLINE		//	ETF 	 2024-01-09 	 305080 
			WORD TAB DATE TAB symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*		NEWLINE		//	ETF 	 2024-01-09 	 TIGER 미국채10년선물 
			WORD TAB DATE TAB closing=NUMBER					NEWLINE		//	ETF 	 2024-01-09 	 11,580 
			WORD TAB DATE TAB NUMBER							NEWLINE		//	ETF 	 2024-01-09 	 20 
			WORD TAB DATE TAB NUMBER							NEWLINE		//	ETF 	 2024-01-09 	 +0.17 
			WORD TAB DATE TAB NUMBER							NEWLINE		//	ETF 	 2024-01-09 	 11,588.94 
			WORD TAB DATE TAB market=NUMBER						NEWLINE		//	ETF 	 2024-01-09 	 11,560 
			WORD TAB DATE TAB high=NUMBER						NEWLINE		//	ETF 	 2024-01-09 	 11,590 
			WORD TAB DATE TAB low=NUMBER						NEWLINE		//	ETF 	 2024-01-09 	 11,525 
			WORD TAB DATE TAB volume=NUMBER						NEWLINE		//	ETF 	 2024-01-09 	 60,629 
			WORD TAB DATE TAB NUMBER							NEWLINE		//	ETF 	 2024-01-09 	 700,419,695 
			WORD TAB DATE TAB NUMBER							NEWLINE		//	ETF 	 2024-01-09 	 119,274,000,000 
			WORD TAB DATE TAB NUMBER							NEWLINE		//	ETF 	 2024-01-09 	 0 
			WORD TAB DATE TAB volumeOfListedShares=NUMBER		NEWLINE		//	ETF 	 2024-01-09 	 10,300,000 
			WORD TAB DATE TAB word+								NEWLINE		//	ETF 	 2024-01-09 	 S&P 10-Year U.S. Treasury Note Futures(ER) 
			WORD TAB DATE TAB word								NEWLINE		//	ETF 	 2024-01-09 	 192.52 
			WORD TAB DATE TAB word								NEWLINE		//	ETF 	 2024-01-09 	 0.00 
			WORD TAB DATE TAB word								NEWLINE		//	ETF 	 2024-01-09 	 0.00 
			WORD TAB base=DATE TAB								NEWLINE		//	ETF 	 2024-01-09 	 
			{
				ParserService.price(20240112
					, $code.text
					, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
				);
				ParserService.item(20240112
					, $code.text
					, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
					, null, null, null, null, null, null, null, null
					, "ETF"
					, null
					, $volumeOfListedShares.text
					, null
				);
			}
		) | (
			WORD TAB DATE TAB NUMBER symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* closing=NUMBER	NEWLINE		//	ETF 	 2024-01-09 	 078935 GS우 KOSPI 34,250 
			WORD TAB base=DATE TAB NUMBER NUMBER NUMBER NUMBER NUMBER NUMBER NUMBER		NEWLINE		//	ETF 	 2024-01-09 	 34,300 34,500 34,100 1,993 68,209,450 61,130,290,500 1,784,826 
			{
				ParserService.price(20240112
					, $code.text
					, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
				);
			}
		))+

		WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
	)+ 
	KEYWORD TAB WORD TAB WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 ETF > 전종목 시세 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020101 
;


// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목시세 > 전종목 시세
companyAllPrice:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 주식 > 종목시세 > 전종목 시세 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020101 
	(
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB								NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB							NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB								NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB							NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB							NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB							NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB								NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB							NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB								NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB							NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 
		WORD TAB DATE TAB WORD									NEWLINE		//	COMPANY 	 2024-01-09 	 종목코드종목명시장구분소속부종가대비등락률시가고가저가거래량거래대금시가총액상장주식수 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		((
			WORD TAB DATE TAB code=word							NEWLINE		//	COMPANY 	 2024-01-09 	 00104K 
			WORD TAB DATE TAB symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*	NEWLINE		//	COMPANY 	 2024-01-09 	 3S 
			WORD TAB DATE TAB type=word word*					NEWLINE		//	COMPANY 	 2024-01-09 	 KOSDAQ GLOBAL 
			WORD TAB DATE TAB WORD?								NEWLINE		//	COMPANY 	 2024-01-09 	 중견기업부 
			WORD TAB DATE TAB closing=NUMBER					NEWLINE		//	COMPANY 	 2024-01-09 	 3,740 
			WORD TAB DATE TAB NUMBER							NEWLINE		//	COMPANY 	 2024-01-09 	 215 
			WORD TAB DATE TAB NUMBER							NEWLINE		//	COMPANY 	 2024-01-09 	 +6.10 
			WORD TAB DATE TAB market=NUMBER						NEWLINE		//	COMPANY 	 2024-01-09 	 3,650 
			WORD TAB DATE TAB high=NUMBER						NEWLINE		//	COMPANY 	 2024-01-09 	 3,740 
			WORD TAB DATE TAB low=NUMBER						NEWLINE		//	COMPANY 	 2024-01-09 	 3,470 
			WORD TAB DATE TAB volume=NUMBER						NEWLINE		//	COMPANY 	 2024-01-09 	 3,336,537 
			WORD TAB DATE TAB NUMBER							NEWLINE		//	COMPANY 	 2024-01-09 	 12,249,855,340 
			WORD TAB DATE TAB NUMBER							NEWLINE		//	COMPANY 	 2024-01-09 	 181,527,041,080 
			WORD TAB DATE TAB volumeOfListedShares=NUMBER		NEWLINE		//	COMPANY 	 2024-01-09 	 48,536,642 
			WORD TAB base=DATE TAB								NEWLINE		//	COMPANY 	 2024-01-09 	 
			{
				ParserService.price(20240112
					, $code.text
					, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
				);
				ParserService.item(20240112
					, $code.text
					, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
					, null, null, null, null, null, null, null, null
					, $type.text
					, null
					, $volumeOfListedShares.text
					, null
				);
			}
		) | (
			WORD TAB DATE TAB NUMBER symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* closing=NUMBER	NEWLINE		//	ETF 	 2024-01-09 	 078935 GS우 KOSPI 34,250 
			WORD TAB base=DATE TAB NUMBER NUMBER NUMBER NUMBER NUMBER NUMBER NUMBER		NEWLINE		//	ETF 	 2024-01-09 	 34,300 34,500 34,100 1,993 68,209,450 61,130,290,500 1,784,826 
			{
				ParserService.price(20240112
					, $code.text
					, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
				);
			}
		))+

		WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
	)+ 
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 주식 > 종목시세 > 전종목 시세 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020101 
;


// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 개별종목 시세 추이
// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목시세 > 개별종목 시세 추이
crawlPriceKrx:
	KEYWORD TAB WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 주가일별시세 	 CrawlPriceThread 	 http://data.krx.co.kr/
	(
		(
			NUMBER TAB WORD WORD TAB										NEWLINE		//	253250 	 데이터가 없습니다.
		) | (((
				WORD TAB NUMBER TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB							NEWLINE
					//	ETF 	 175330 	 일자 	 종가 	 대비 	 등락률 	 시가 	 고가 	 저가 	 거래량 	 거래대금 	 시가총액 	 상장주식수 	 
				(
					WORD TAB code=NUMBER TAB base=DATE TAB closing=NUMBER TAB NUMBER TAB NUMBER TAB market=NUMBER TAB high=NUMBER TAB low=NUMBER TAB volume=NUMBER TAB NUMBER TAB NUMBER TAB NUMBER TAB		NEWLINE
							//	ETF 	 175330 	 2022/06/20 	 7,830 	 110 	 -1.39 	 7,980 	 8,000 	 7,720 	 225,863 	 1,768,097,000 	 1,542,376,060,020 	 196,982,894 	 
					{
						ParserService.price(20240112
							, $code.text
							, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
						);
					}
				)+
			) | (
				WORD TAB NUMBER TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB	NEWLINE
					//	ETF 	 441680 	 일자 	 종가 	 대비 	 등락률 	 순자산가치(NAV) 	 시가 	 고가 	 저가 	 거래량 	 거래대금 	 시가총액 	 순자산총액 	 상장좌수 	 지수명 	 종가 	 대비 	 등락률
				(
					WORD TAB code=NUMBER TAB base=DATE TAB closing=NUMBER TAB NUMBER TAB NUMBER TAB NUMBER TAB market=NUMBER TAB high=NUMBER TAB low=NUMBER TAB volume=NUMBER TAB NUMBER TAB NUMBER TAB NUMBER TAB NUMBER TAB
						symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* TAB
						NUMBER TAB NUMBER TAB NUMBER TAB		NEWLINE
							//	ETF 	 441680 	 2022/11/22 	 9,710 	 10 	 +0.10 	 9,769.51 	 9,725 	 9,750 	 9,680 	 36,868 	 357,580,550 	 30,101,000,000 	 30,285,495,972 	 3,100,000 	 Cboe Nasdaq-100 BuyWrite V2 지수 (Total Return) 	 747.74 	 6.63 	 +0.89 	 
					{
						ParserService.price(20240112
							, $code.text
							, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
						);
					}
				)+
			))
		)+
		WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
	)+ 
	KEYWORD TAB WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 주가일별시세 	 CrawlPriceThread 	 http://data.krx.co.kr/ 
;

// KSD증권정보포털(SEIBro) > ETF > 종목발행현황
crawlItemEtf:
	KEYWORD TAB WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 crawlItemEtf 	 ETF 종목 발행현황 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06025V.xml&menuNo=174 
	(
		WORD TAB										NEWLINE		//	ETF 	 
		WORD TAB WORD TAB WORD TAB TAB WORD TAB WORD TAB WORD TAB WORD		NEWLINE		//	ETF 	 선택 	 종목명 	 	 유형 	 순자산 	 종가 	 거래량 
		WORD TAB TAB TAB WORD TAB TAB TAB TAB TAB TAB WORD TAB WORD TAB		NEWLINE		//	(3개월평균) 	 	 	 수익률(%) 	 	 	 	 	 	 총보수(%) 	 운용사 	 
		(
			type=WORD TAB TAB
			symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* TAB
			code=NUMBER TAB
			category=word category1=word? category2=word? category3=word? category4=word? category5=word? category6=word? category7=word* TAB
			asset=NUMBER TAB
			closing=NUMBER TAB
			amount=NUMBER TAB
			TAB TAB
			priceEarningsRatio=NUMBER? TAB
			TAB TAB TAB TAB TAB
			fee=NUMBER? TAB
			operator=WORD TAB		NEWLINE
					//	ETF 	 	 TIGER CD금리투자KIS(합성) 	 357870 	 채권/단기자금 	 66,923 	 53,580 	 232,520 	 	 	 0.91 	 	 	 	 	 	 0.03 	 미래에셋자산운용 	 
			{
				ParserService.item(20240112
					, $code.text
					, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
					, $category.text, $category1.text, $category2.text, $category3.text, $category4.text, $category5.text, $category6.text, $category7.text
					, "ETF"
					, null
					, null
					, $fee.text
				);
			}
		)+
		WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 crawlItemEtf 	 ETF 종목 발행현황 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06025V.xml&menuNo=174 
;


// KSD 증권정보포털 SEIBro > ETF > ETF종합정보 > 기준가추이
crawlPriceEtf:
	KEYWORD TAB WORD WORD TAB WORD TAB WORD TAB WORD								NEWLINE		//	KEYWORD 	 ETF 일별시세 	 CrawlPriceEtfThread 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06033V.xml&menuNo=182 
	(
		code=NUMBER TAB word+														NEWLINE		//	143860 	 TIGER 헬스케어
		(
			KEYWORD TAB symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*					NEWLINE 
			KEYWORD TAB category=word category1=word? category2=word? category3=word? category4=word? category5=word? category6=word? category7=word*	NEWLINE 
			KEYWORD TAB ea=NUMBER																														NEWLINE 
			{
				ParserService.item(20240112
					, $code.text
					, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
					, $category.text, $category1.text, $category2.text, $category3.text, $category4.text, $category5.text, $category6.text, $category7.text
					, "ETF"
					, null
					, $ea.text
					, null
				);
			}
		) 
		(
			WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB		NEWLINE		//	일자 	 종가 	 전일비 	 시가 	 고가 	 저가 	 거래량 	 거래대금 	 
			((
				TAB TAB TAB TAB TAB TAB TAB TAB											NEWLINE		//		 	 	 	 	 	 	 	 
			) | (
				base=DATE? TAB closing=NUMBER? TAB NUMBER? TAB market=NUMBER? TAB high=NUMBER? TAB low=NUMBER TAB volume=NUMBER TAB NUMBER? TAB		NEWLINE
						//	2023/12/15 	 32,300 	 320 	 32,165 	 32,320 	 32,070 	 121,115 	 3,900 	 
				{
					ParserService.price(20240112
						, $code.text
						, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
					);
				}
			))+
		)+
		WORD TAB WORD TAB DATE							NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD WORD TAB WORD TAB WORD TAB WORD	NEWLINE		//	KEYWORD 	 ETF 일별시세 	 CrawlPriceEtfThread 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06033V.xml&menuNo=182 
;


// KSD증권정보포털(SEIBro) > 주식 > 종목별상세정보 > 일자별시세
crawlPriceCompany:
KEYWORD TAB WORD WORD TAB WORD TAB WORD TAB WORD						NEWLINE		//	KEYWORD 	 주식 일자별시세 	 CrawlCompanyPriceThread 	 URL 	 https://finance.naver.com/item/sise.naver?code= 
(
	code=NUMBER TAB symbol=word+										NEWLINE		//	072870 	 메가스터디 
	(
		WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB		NEWLINE		//	일자 	 종가 	 전일비 	 시가 	 고가 	 저가 	 거래량 	 
		((
			TAB TAB TAB TAB TAB TAB TAB										NEWLINE		//		 	 	 	 	 	 	 
		) | (
			base=DATE TAB closing=NUMBER TAB NUMBER TAB market=NUMBER TAB high=NUMBER TAB low=NUMBER TAB volume=NUMBER TAB		NEWLINE
					//	2023/12/18 	 11,430 	 30 	 11,400 	 11,500 	 11,370 	 16,124 
			{
				ParserService.price(20240112
					, $code.text
					, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
				);
			}
		))+
	)+
	WORD TAB WORD TAB DATE												NEWLINE		//	andold 	 since 	 2023-11-27 
)+
KEYWORD TAB WORD WORD TAB WORD TAB WORD TAB WORD						NEWLINE		//	KEYWORD 	 주식 일자별시세 	 CrawlCompanyPriceThread 	 URL 	 https://finance.naver.com/item/sise.naver?code= 
;


// KSD증권정보포털(SEIBro) > 기업 > 기업기본정보
crawlItemDetailCompanyThread:
KEYWORD TAB WORD WORD TAB WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 주식 상세 	 CrawlCompanyDetailThread 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/stock/BIP_CNTS02006V.xml&menuNo=44 
(
	KEYWORD TAB code=NUMBER TAB type=WORD TAB symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*	NEWLINE
			//	KEYWORD 	 093920 	 서원인텍 

	KEYWORD TAB category=STRING									NEWLINE		//	KEYWORD 	 "부동산업" 
	KEYWORD TAB fics=STRING										NEWLINE		//	KEYWORD 	 "> >" 
	KEYWORD TAB ea=NUMBER WORD									NEWLINE		//	KEYWORD 	 18,600,000 주 
	KEYWORD TAB ipo=DATE										NEWLINE		//	KEYWORD 	 2007/12/20 
	WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27
	{
		ParserService.item(20240112
			, $code.text
			, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
			, $category.text, $fics.text, null, null, null, null, null, null
			, null
			, $ipo.text
			, $ea.text
			, null
		);
	}
)+
KEYWORD TAB WORD WORD TAB WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 주식 상세 	 CrawlCompanyDetailThread 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/stock/BIP_CNTS02006V.xml&menuNo=44 
;


// KSD증권정보포털(SEIBro) > 주식 > 배당정보 > 배당순위
crawlItemDividendTopCompany:
KEYWORD TAB WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 crawlItemDividendTopCompany 	 주식 상위 배당 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01042V.xml&menuNo=286 
(
	WORD TAB										NEWLINE		//	KOSPI 	 
	WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB		NEWLINE		//	KOSPI 	 순위 	 종목코드 	 종목명 	 주식종류 	 시장구분 	 주당배당금 	 시가배당율 	 액면가배당율 	 액면가 	 결산월 	 
	(
		type=WORD TAB NUMBER TAB code=NUMBER? TAB word+ TAB WORD TAB WORD TAB NUMBER TAB NUMBER TAB NUMBER TAB NUMBER TAB NUMBER TAB		NEWLINE
				//	5 	 175330 	 JB금융지주 	 보통주 	 유가증권시장 	 835 	 10.10 	 16.70 	 5,000 	 12 	 
		{
			ParserService.item(20240112
				, $code.text
				, null, null, null, null, null, null, null, null
				, null, null, null, null, null, null, null, null
				, $type.text
				, null
				, null
				, null
			);
		}
	)+ 	 	 
	WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
)+
KEYWORD TAB WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 crawlItemDividendTopCompany 	 주식 상위 배당 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01042V.xml&menuNo=286 
;


// KSD증권정보포털(SEIBro) > ETF > ETF종합정보 > 종목상세
crawlEtfDetailThread:
	KEYWORD TAB WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 ETF 상세 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS906032V.xml&menuNo=514 
	(
		KEYWORD TAB code=NUMBER TAB word*		NEWLINE
		symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*					NEWLINE		//	KODEX 에너지화학[117460] 
		category=word category1=word? category2=word? category3=word? category4=word? category5=word? category6=word? category7=word*	NEWLINE		//	섹터/소재 
		ipo=DATE WORD*							NEWLINE		//	2009/10/09 (14년 2개월) 
		fee=word								NEWLINE		//	0.45 
		WORD TAB WORD TAB DATE					NEWLINE		//	andold 	 since 	 2023-11-27 
		{
			ParserService.item(20240112
				, $code.text
				, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
				, $category.text, $category1.text, $category2.text, $category3.text, $category4.text, $category5.text, $category6.text, $category7.text
				, null
				, $ipo.text
				, null
				, $fee.text
			);
		}
	)+
	KEYWORD TAB WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 ETF 상세 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS906032V.xml&menuNo=514 
;


crawlDividendHistoryEtfThread:
	KEYWORD TAB WORD WORD WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 ETF 배당금 내역 	 KSD 증권정보포털 SEIBro 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06030V.xml&menuNo=179 
	(
		WORD TAB WORD? TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB		NEWLINE		//	종목명 	 	 운용사 	 유형 	 지급기준일 	 실지급일 	 배당구분 	 주당분배금 	 결산과표기준가 	 시가대비분배율 	 
		(
			(
				TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB						NEWLINE		//		 	 	 	 	 	 	 	 	 	 
			) | (
				symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* TAB
				code=WORD TAB WORD TAB word* TAB base=DATE? TAB pay=DATE TAB WORD? TAB dividend=NUMBER TAB price=NUMBER? TAB ratio=NUMBER? TAB		NEWLINE
						//	TIGER 200커버드콜5%OTM 	 	 미래에셋자산운용 	 파생상품/구조화 	 2023/11/30 	 2023/12/04 	 이익분배 	 54 	 11,308.35 	 0.45 	 
				{
					ParserService.crawlDividendHistoryEtfThread(20231127
						, $code.text
						, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
						, $base.text, $pay.text
						, $dividend.text
						, $price.text
						, $ratio.text
					);
				}
			)
		)+
		WORD TAB WORD TAB DATE											NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD WORD WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 ETF 배당금 내역 	 KSD 증권정보포털 SEIBro 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06030V.xml&menuNo=179 
;


// KSD증권정보포털(SEIBro) > 주식 > 배당정보 > 배당내역전체겁색 > 조회
crawlDividendHistoryCompanyThread:
	KEYWORD TAB WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 CrawlDividendHistoryCompanyThread 	 주식(기업) 배당금 내역 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01041V.xml&menuNo=285 
	(
		(
			WORD TAB WORD								NEWLINE		//	배정기준일 	 현금배당 
			WORD TAB WORD								NEWLINE		//	지급일 	 주식 
			WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB		NEWLINE		//	유통(교부)일 	 종목코드 	 종목명 	 시장구분 	 배당구분 	 명의개서대리인 	 주식종류 	 주당배당금 	 주당배당률(일반) 	 주당배당률(차등) 	 액면가 	 결산월 	 
			WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB															NEWLINE		//	일반 	 차등 	 현금 	 주식 	 현금 	 주식 
			(
				(
					TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB											NEWLINE		//		 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 
				) | (
					base=DATE TAB pay=DATE? TAB DATE? TAB code=NUMBER TAB symbol=word+ TAB WORD TAB WORD TAB WORD TAB WORD TAB dividend=NUMBER TAB NUMBER? TAB NUMBER TAB NUMBER TAB NUMBER? TAB TAB NUMBER TAB NUMBER TAB		NEWLINE
							//	2022/12/31 	 2023/04/21 	 	 000850 	 화천기공 	 유가증권시장 	 현금배당 	 국민은행 	 보통주 	 2,500 	 	 50.00 	 0.00 	 	 	 5,000 	 12 	 
					{
						ParserService.crawlDividendHistoryCompanyThread(20231127
							, $base.text , $pay.text
							, $code.text , $symbol.text
							, $dividend.text
						);
					}
				)
			)+
		)+
		WORD TAB WORD TAB DATE						NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 CrawlDividendHistoryCompanyThread 	 주식(기업) 배당금 내역 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01041V.xml&menuNo=285 
;
