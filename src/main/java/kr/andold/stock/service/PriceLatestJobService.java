package kr.andold.stock.service;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.crawler.CrawlerService;
import kr.andold.stock.domain.Job;
import kr.andold.stock.domain.Result;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PriceLatestJobService implements Job {
	@Autowired private CrawlerService crawlerService;
	@Autowired private StockCompileJobService stockCompileJobService;

	@Override
	public STATUS run() {
		log.info("{} run()", Utility.indentStart());
		long started = System.currentTimeMillis();

		Result<ParserResult> crawlPriceResult = crawlerService.crawlPrice(Date.from(LocalDate.now().atStartOfDay().toInstant(Utility.ZONE_OFFSET_KST)));
		JobService.getQueue1().push(stockCompileJobService);

		log.info("{} 『{}』 run() - 『{}』 - {}", Utility.indentEnd(), STATUS.SUCCESS, crawlPriceResult, Utility.toStringPastTimeReadable(started));
		return STATUS.SUCCESS;
	}

}
