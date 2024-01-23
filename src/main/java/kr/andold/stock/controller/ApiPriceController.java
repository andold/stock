package kr.andold.stock.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpServletResponse;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.param.ItemParam;
import kr.andold.stock.param.PriceParam;
import kr.andold.stock.service.PriceService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.CommonBlockService.CrudList;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/price")
public class ApiPriceController {
	@Autowired private HttpServletResponse httpServletResponse;
	@Autowired private PriceService service;

	@PostMapping(value = {"search"})
	public List<PriceDomain> search(@RequestBody PriceParam param) {
		log.info("{} search({})", Utility.indentStart(), param);

		List<PriceDomain> list = service.search(param);

		log.info("{} #{} - search({})", Utility.indentEnd(), Utility.size(list), param);
		return list;
	}

	@ResponseBody
	@PostMapping(value = "crawl")
	public CrudList<PriceDomain> crawl(@RequestBody ItemParam param) {
		log.info("{} crawl({})", Utility.indentStart(), param);

		CrudList<PriceDomain> result = service.crawl(param);

		log.info("{} {} - crawl({})", Utility.indentEnd(), result, param);
		return result;
	}

	@ResponseBody
	@GetMapping(value = "purge")
	public int purge() {
		log.info("{} purge()", Utility.indentStart());

		int result = service.purge();

		log.info("{} #{} purge()", Utility.indentEnd(), result);
		return result;
	}

	@ResponseBody
	@GetMapping(value = {"download"})
	public String download() throws UnsupportedEncodingException {
		log.info("{} download()", Utility.indentStart());

		String filename = URLEncoder.encode(String.format("stock-price-%s.json", LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE)), "UTF-8").replaceAll("\\+", "%20");
		httpServletResponse.setHeader("Content-Disposition", "attachment; filename=" + filename);

		String response = service.download();

		log.info("{} {} - download()", Utility.indentEnd(), Utility.ellipsisEscape(response, 32, 32));
		return response;
	}

	@PostMapping(value = "upload")
	public CrudList<PriceDomain> upload(@RequestParam("file") MultipartFile file) {
		log.info("{} upload(『{}』)", Utility.indentStart(), Utility.toStringJson(file, 32));

		CrudList<PriceDomain> result = service.upload(file);

		log.info("{} 『{}』 upload(『{}』)", Utility.indentEnd(), result, Utility.toStringJson(file, 32));
		return result;
	}

}
