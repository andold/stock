package kr.andold.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.andold.stock.domain.StockDividendDomain;
import kr.andold.stock.param.StockDividendParam;
import kr.andold.stock.service.StockDividendService;
import kr.andold.stock.service.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/stock/dividend")
public class ApiStockDividendController {
	@Autowired private StockDividendService service;

	@PostMapping(value = {"search"})
	public List<StockDividendDomain> search(@RequestBody StockDividendParam param) {
		log.info("{} search({})", Utility.indentStart(), param.toString());

		List<StockDividendDomain> list = service.search(param);

		log.info("{} #{} - search({})", Utility.indentEnd(), Utility.size(list), param.toString());
		return list;
	}

}
