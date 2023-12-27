package kr.andold.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.param.DividendHistoryParam;
import kr.andold.stock.param.ItemParam;
import kr.andold.stock.service.DividendHistoryService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/dividend/history")
public class ApiDividendHistoryController {
	@Autowired private DividendHistoryService service;

	@PostMapping(value = {"search"})
	public List<DividendHistoryDomain> search(@RequestBody DividendHistoryParam param) {
		log.info("{} search({})", Utility.indentStart(), param.toString());

		List<DividendHistoryDomain> list = service.search(param);

		log.info("{} #{} - search({})", Utility.indentEnd(), Utility.size(list), param.toString());
		return list;
	}

	@ResponseBody
	@PostMapping(value = "crawl")
	public ParserResult crawl(@RequestBody ItemParam param) {
		log.info("{} crawl({})", Utility.indentStart(), param);

		ParserResult result = service.crawl(param);

		log.info("{} {} - crawl({})", Utility.indentEnd(), result, param);
		return result;
	}

}
