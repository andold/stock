package kr.andold.stock.controller;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.andold.stock.crawler.CrawlerService;
import kr.andold.stock.domain.Result;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.job.CrawlDividendLatestDataGoKrCompanyJob;
import kr.andold.stock.job.CrawlDividendSeibroEtfJob;
import kr.andold.stock.job.CrawlItemIpoCloseKindJob;
import kr.andold.stock.job.CrawlPriceLatestDataGoKrCompanyJob;
import kr.andold.stock.job.CrawlPriceLatestDataGoKrEtfJob;
import kr.andold.stock.param.ItemParam;
import kr.andold.stock.param.PriceParam;
import kr.andold.stock.service.JobService;
import kr.andold.utils.Utility;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/crawl")
public class ApiCrawlerController {
	@Autowired private CrawlerService service;

	@ResponseBody
	@PostMapping(value = "item")
	public Result<ParserResult> crawlItem(@RequestBody ItemParam param) {
		log.info("{} crawlItem({})", Utility.indentStart(), param);

		Result<ParserResult> result = service.crawlItem(param);
		
		log.info("{} 『{}』 - crawlItem({})", Utility.indentEnd(), result, param);
		return result;
	}

	@ResponseBody
	@PostMapping(value = "price/all")
	public Result<ParserResult> crawlPriceAll(@RequestBody PriceParam param) {
		log.info("{} crawlPriceAll({})", Utility.indentStart(), param);

		ZonedDateTime oneWeekAgo = ZonedDateTime.now().truncatedTo(ChronoUnit.DAYS).minusWeeks(1);
		CrawlPriceLatestDataGoKrCompanyJob.regist(JobService.getQueue1(), oneWeekAgo);
		CrawlPriceLatestDataGoKrEtfJob.regist(JobService.getQueue1(), oneWeekAgo);
		Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.SUCCESS).build();

		log.info("{} 『{}』 - crawlPriceAll({})", Utility.indentEnd(), result, param);
		return result;
	}

	@ResponseBody
	@GetMapping(value = "item/all")
	public Result<ParserResult> crawlItemAll() {
		log.info("{} crawlItemAll()", Utility.indentStart());

		Result<ParserResult> result = service.crawlItemAll();
		
		log.info("{} 『{}』 - crawlItemAll()", Utility.indentEnd(), result);
		return result;
	}

	@ResponseBody
	@GetMapping(value = "item/ipo-close/all")
	public Result<ParserResult> crawlItemIpoCloseAll() {
		log.info("{} crawlItemIpoCloseAll()", Utility.indentStart());

		CrawlItemIpoCloseKindJob.regist(JobService.getQueue2(), ZonedDateTime.now().truncatedTo(ChronoUnit.DAYS).minusYears(12));
		
		Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.SUCCESS).build();
		log.info("{} 『{}』 - crawlItemIpoCloseAll()", Utility.indentEnd(), result);
		return result;
	}

	@ResponseBody
	@GetMapping(value = "item/ipo-close/recent")
	public Result<ParserResult> crawlItemIpoCloseRecent(@RequestBody(required = false) PriceParam param) {
		log.info("{} crawlItemIpoCloseRecent({})", Utility.indentStart(), param);

		Date start = param == null ? Date.from(LocalDate.now().minusMonths(12).atStartOfDay().toInstant(Utility.ZONE_OFFSET_KST)) : param.getStart();
		CrawlItemIpoCloseKindJob.regist(JobService.getQueue2(), ZonedDateTime.ofInstant(start.toInstant(), Utility.ZONE_ID_KST));
		Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.SUCCESS).build();

		log.info("{} 『{}』 - crawlItemIpoCloseRecent()", Utility.indentEnd(), result);
		return result;
	}

	@ResponseBody
	@GetMapping(value = "dividend/all/recent")
	public Result<ParserResult> crawlDividendAllRecent() {
		log.info("{} crawlDividendAllRecent()", Utility.indentStart());

		ZonedDateTime sixMonthAgo = ZonedDateTime.now().truncatedTo(ChronoUnit.DAYS).minusMonths(6);
		CrawlDividendLatestDataGoKrCompanyJob.regist(JobService.getQueue1());
		JobService.getQueue1().addLast(CrawlDividendSeibroEtfJob.builder().start(sixMonthAgo).build());
		Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.SUCCESS).build();
		
		log.info("{} 『{}』 - crawlDividendAllRecent()", Utility.indentEnd(), result);
		return result;
	}

}
