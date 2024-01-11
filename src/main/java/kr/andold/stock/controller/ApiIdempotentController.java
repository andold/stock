package kr.andold.stock.controller;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.andold.stock.crawler.IdempotentService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/idempotent")
public class ApiIdempotentController {
	@Autowired
	private IdempotentService service;

	@GetMapping(value = "test")
	public void test() {
		log.info("{} test()", Utility.indentStart());

		service.once();

		log.info("{} test()", Utility.indentEnd());
	}

	@ResponseBody
	@GetMapping(value = "run")
	public ParserResult crawlItemDividendTopCompany() throws InterruptedException, ExecutionException {
		log.info("{} crawlItemDividendTopCompany()", Utility.indentStart());

		Future<ParserResult> future = service.run();
		ParserResult result = future.get();

		log.info("{} {} - crawlItemDividendTopCompany()", Utility.indentEnd(), result);
		return result;
	}


}
