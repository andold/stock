package kr.andold.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.andold.stock.crawler.IdempotentService;
import kr.andold.stock.service.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/idempotent")
public class ApiIdempotentController {
	@Autowired
	private IdempotentService service;

	@GetMapping(value = "once")
	public void test() {
		log.info("{} once()", Utility.indentStart());

		service.once();

		log.info("{} once()", Utility.indentEnd());
	}

}
