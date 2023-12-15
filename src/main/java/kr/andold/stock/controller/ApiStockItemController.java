package kr.andold.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.andold.stock.domain.StockItemDomain;
import kr.andold.stock.param.StockItemParam;
import kr.andold.stock.service.StockCrawlerService;
import kr.andold.stock.service.StockItemService;
import kr.andold.stock.service.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/item")
public class ApiStockItemController {
	@Autowired private StockItemService service;

	@Autowired
	private StockCrawlerService stockCrawlerService;

	@PostMapping(value = {"search"})
	public List<StockItemDomain> search(@RequestBody StockItemParam param) {
		log.info("{} search({})", Utility.indentStart(), param.toString());

		List<StockItemDomain> list = service.search(param);

		log.info("{} #{} - search({})", Utility.indentEnd(), Utility.size(list), param.toString());
		return list;
	}

	@ResponseBody
	@PutMapping(value = {"{id}"})
	public StockItemDomain update(@PathVariable(name = "id") Integer id, @RequestBody StockItemDomain domain) {
		log.info("{} update({}, {})", Utility.indentStart(), id, domain);

		domain.setId(id);
		StockItemDomain updated = service.update(domain);

		log.info("{} {} - update({}, {})", Utility.indentEnd(), updated, id, domain);
		return updated;
	}

	@ResponseBody
	@PostMapping(value = "crawl")
	public StockItemDomain crawl(@RequestBody StockItemParam param) {
		log.info("{} crawl()", Utility.indentStart());

		StockItemDomain response = stockCrawlerService.crawlItemDetail(param);

		log.info("{} {} - crawl()", Utility.indentEnd(), response);
		return response;
	}

}
