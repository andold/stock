package kr.andold.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.andold.stock.domain.DividendDomain;
import kr.andold.stock.param.DividendParam;
import kr.andold.stock.service.DividendService;
import kr.andold.stock.service.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/dividend")
public class ApiDividendController {
	@Autowired private DividendService service;

	@PostMapping(value = {"search"})
	public List<DividendDomain> search(@RequestBody DividendParam param) {
		log.info("{} search({})", Utility.indentStart(), param);

		List<DividendDomain> list = service.search(param);

		log.info("{} #{} - search({})", Utility.indentEnd(), Utility.size(list), param);
		return list;
	}

}
