package kr.andold.stock.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpServletResponse;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.dummy.Utility;
import kr.andold.stock.param.ItemParam;
import kr.andold.stock.service.CommonBlockService.CrudList;
import kr.andold.stock.service.ItemService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/item")
public class ApiItemController {
	@Autowired private HttpServletResponse httpServletResponse;
	@Autowired private ItemService service;

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

	@ResponseBody
	@GetMapping(value = {"download"})
	public String download() throws UnsupportedEncodingException {
		log.info("{} download()", Utility.indentStart());

		String filename = URLEncoder.encode(String.format("stock-item-%s.json", LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE)), "UTF-8").replaceAll("\\+", "%20");
		httpServletResponse.setHeader("Content-Disposition", "attachment; filename=" + filename);

		String response = service.download();

		log.info("{} {} - download()", Utility.indentEnd(), Utility.ellipsisEscape(response, 32, 32));
		return response;
	}

	@PostMapping(value = "upload")
	public CrudList<ItemDomain> upload(@RequestParam("file") MultipartFile file) {
		log.info("{} upload(『{}』)", Utility.indentStart(), Utility.toStringJson(file, 32));

		CrudList<ItemDomain> result = service.upload(file);

		log.info("{} 『{}』 upload(『{}』)", Utility.indentEnd(), result, Utility.toStringJson(file, 32));
		return result;
	}

}
