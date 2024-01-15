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

import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.param.ItemParam;
import kr.andold.stock.service.CommonBlockService.CrudList;
import kr.andold.stock.service.ItemService;
import kr.andold.stock.service.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/item")
public class ApiItemController {
	@Autowired
	private ItemService service;

	@PostMapping(value = { "search" })
	public ItemParam search(@RequestBody ItemParam param, @PageableDefault(size = 32) Pageable pageable) {
		log.info("{} search({})", Utility.indentStart(), param);

		ItemParam result = service.search(param, pageable);

		log.info("{} #{} - search({})", Utility.indentEnd(), result, param);
		return result;
	}

	@ResponseBody
	@PutMapping(value = { "{id}" })
	public ItemDomain update(@PathVariable(name = "id") Integer id, @RequestBody ItemDomain domain) {
		log.info("{} update({}, {})", Utility.indentStart(), id, domain);

		domain.setId(id);
		ItemDomain updated = service.update(domain);

		log.info("{} {} - update({}, {})", Utility.indentEnd(), updated, id, domain);
		return updated;
	}

	@ResponseBody
	@PostMapping(value = "crawl")
	public CrudList<ItemDomain> crawl(@RequestBody ItemParam param) {
		log.info("{} crawl({})", Utility.indentStart(), param);

		CrudList<ItemDomain> result = service.crawl(param);

		log.info("{} {} - crawl({})", Utility.indentEnd(), result, param);
		return result;
	}

}
