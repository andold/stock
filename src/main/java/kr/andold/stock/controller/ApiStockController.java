package kr.andold.stock.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.andold.stock.domain.StockDividendDomain;
import kr.andold.stock.param.StockPriceParam;
import kr.andold.stock.service.StockCrawlerService;
import kr.andold.stock.service.StockService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.StockParserService.StockParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/stock")
public class ApiStockController {
	@Autowired private StockService service;
	@Autowired private StockCrawlerService stockCrawlerService;

	@PostMapping(value = {"search"})
	public List<StockDividendDomain> search(@RequestBody StockDividendDomain param) {
		log.info("{} search({})", Utility.indentStart(), param.toString());

		List<StockDividendDomain> list = service.search(param);

		log.info("{} #{} - search({})", Utility.indentEnd(), Utility.size(list), param.toString());
		return list;
	}

	@ResponseBody
	@GetMapping(value = "crawl")
	public StockParserResult crawl() {
		log.info("{} crawl()", Utility.indentStart());

		StockParserResult result = stockCrawlerService.crawl();

		log.info("{} {} - crawl()", Utility.indentEnd(), result);
		return result;
	}

	@ResponseBody
	@GetMapping(value = "crawl/items")
	public StockParserResult crawlItems() {
		log.info("{} crawlItems()", Utility.indentStart());

		StockParserResult result = stockCrawlerService.crawlItems();

		log.info("{} {} - crawlItems()", Utility.indentEnd(), result);
		return result;
	}

	@ResponseBody
	@GetMapping(value = "crawl/item/details")
	public StockParserResult crawlItemDetails() {
		log.info("{} crawlItemDetails()", Utility.indentStart());

		StockParserResult result = stockCrawlerService.crawlItemDetails();

		log.info("{} {} - crawlItemDetails()", Utility.indentEnd(), result);
		return result;
	}

	@ResponseBody
	@PostMapping(value = "crawl/price")
	public StockParserResult crawlPrice(@RequestBody StockPriceParam param) {
		log.info("{} crawlPrice({})", Utility.indentStart(), param);

		StockParserResult result = stockCrawlerService.crawlPrice(param);

		log.info("{} {} - crawlPrice({})", Utility.indentEnd(), result, param);
		return result;
	}

	@ResponseBody
	@GetMapping(value = "crawl/dividend/history/etf")
	public StockParserResult crawlDividendHistoryEtf() {
		log.info("{} crawlDividendHistoryEtf()", Utility.indentStart());

		StockParserResult result = stockCrawlerService.crawlDividendHistoryEtf();

		log.info("{} {} - crawlDividendHistoryEtf()", Utility.indentEnd(), result);
		return result;
	}

}
