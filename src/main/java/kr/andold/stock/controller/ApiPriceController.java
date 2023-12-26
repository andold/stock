package kr.andold.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.andold.stock.domain.StockPriceDomain;
import kr.andold.stock.param.StockItemParam;
import kr.andold.stock.param.StockPriceParam;
import kr.andold.stock.service.StockPriceService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.StockParserService.StockParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/price")
public class ApiPriceController {
	@Autowired private StockPriceService service;

	@PostMapping(value = {"search"})
	public List<StockPriceDomain> search(@RequestBody StockPriceParam param) {
		log.info("{} search({})", Utility.indentStart(), param);

		List<StockPriceDomain> list = service.search(param);

		log.info("{} #{} - search({})", Utility.indentEnd(), Utility.size(list), param);
		return list;
	}

	@ResponseBody
	@PostMapping(value = "crawl")
	public StockParserResult crawl(@RequestBody StockItemParam param) {
		log.info("{} crawl({})", Utility.indentStart(), param);

		StockParserResult result = service.crawl(param);

		log.info("{} {} - crawl({})", Utility.indentEnd(), result, param);
		return result;
	}

}
