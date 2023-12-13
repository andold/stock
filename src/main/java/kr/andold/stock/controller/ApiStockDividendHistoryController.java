package kr.andold.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.andold.stock.domain.StockDividendHistoryDomain;
import kr.andold.stock.param.StockDividendHistoryParam;
import kr.andold.stock.service.StockDividendHistoryService;
import kr.andold.stock.service.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/stock/dividend/history")
public class ApiStockDividendHistoryController {
	@Autowired private StockDividendHistoryService service;

	@PostMapping(value = {"search"})
	public List<StockDividendHistoryDomain> search(@RequestBody StockDividendHistoryParam param) {
		log.info("{} search({})", Utility.indentStart(), param.toString());

		List<StockDividendHistoryDomain> list = service.search(param);

		log.info("{} #{} - search({})", Utility.indentEnd(), Utility.size(list), param.toString());
		return list;
	}

}
