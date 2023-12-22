package kr.andold.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.andold.stock.domain.StockItemDomain;
import kr.andold.stock.param.StockItemParam;
import kr.andold.stock.service.StockItemService;
import kr.andold.stock.service.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/item")
public class ApiStockItemController {
	@Autowired
	private StockItemService service;

	@PostMapping(value = { "search" })
	public StockItemParam search(@RequestBody StockItemParam param, @PageableDefault(size = 32) Pageable pageable) {
		log.info("{} search({})", Utility.indentStart(), param);

		StockItemParam result = service.search(param, pageable);

		log.info("{} #{} - search({})", Utility.indentEnd(), result, param);
		return result;
	}

	@ResponseBody
	@PutMapping(value = { "{id}" })
	public StockItemDomain update(@PathVariable(name = "id") Integer id, @RequestBody StockItemDomain domain) {
		log.info("{} update({}, {})", Utility.indentStart(), id, domain);

		domain.setId(id);
		StockItemDomain updated = service.update(domain);

		log.info("{} {} - update({}, {})", Utility.indentEnd(), updated, id, domain);
		return updated;
	}

}
