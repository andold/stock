package kr.andold.stock.job;

import java.time.ZonedDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.ApplicationContextProvider;
import kr.andold.stock.crawler.CrawlerService;
import kr.andold.stock.crawler.Seibro;
import kr.andold.stock.domain.Result;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.JobService.Job;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.utils.Utility;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@Service
public class CrawlDividendSeibroEtfJob implements Job {
	@Builder.Default @Getter @Setter private Long timeout = 600L;
	@Getter @Setter private ZonedDateTime start;

	@Autowired private Seibro seibro;
	@Autowired private CrawlerService service;

	@Override
	public STATUS call() throws Exception {
		log.debug("{} CrawlDividendSeibroEtfJob::call()", Utility.indentStart());
		long started = System.currentTimeMillis();

		CrawlDividendSeibroEtfJob that = (CrawlDividendSeibroEtfJob) ApplicationContextProvider.getBean(CrawlDividendSeibroEtfJob.class);
		STATUS result = that.main();

		log.debug("{} 『#{}』 CrawlPriceLatestSeibroEtfJob::call() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	protected STATUS main() {
		log.debug("{} CrawlDividendSeibroEtfJob::main()", Utility.indentStart());
		long started = System.currentTimeMillis();

		Result<ParserResult> result = seibro.dividendEtf(Date.from(start.toInstant()));
		if (result.getStatus() == STATUS.SUCCESS) {
			service.put(result.getResult());
		}
		
		log.debug("{} 『{}』 CrawlDividendSeibroEtfJob::main() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result.getStatus();
	}


}
