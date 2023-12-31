package kr.andold.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.andold.stock.crawler.CrawlerService;
import kr.andold.stock.domain.Result;
import kr.andold.stock.param.PriceParam;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/crawl")
public class ApiCrawlerController {
	@Autowired private CrawlerService service;

	@ResponseBody
	@PostMapping(value = "price/all")
	public Result<ParserResult> crawlPriceAll(@RequestBody PriceParam param) {
		log.info("{} crawlPriceAll({})", Utility.indentStart(), param);

		Result<ParserResult> result = service.crawlPrice(param.getBase());
		
		log.info("{} {} - crawlPriceAll({})", Utility.indentEnd(), result, param);
		return result;
	}

}
