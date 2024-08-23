package kr.andold.stock.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.param.ItemParam;
import kr.andold.stock.param.StockParam;
import kr.andold.stock.service.CommonBlockService.CrudList;
import kr.andold.stock.service.StockService;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api")
public class ApiStockController {
	@Autowired private StockService service;

	@ResponseBody
	@GetMapping(value = {"download"})
	public String download(HttpServletResponse httpServletResponse) throws UnsupportedEncodingException {
		log.info("{} download()", Utility.indentStart());

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
		String filename = URLEncoder.encode(String.format("stock-%s.json", simpleDateFormat.format(Calendar.getInstance().getTime())), "UTF-8").replaceAll("\\+", "%20");
		httpServletResponse.setHeader("Content-Disposition", "attachment; filename=" + filename);

		StockParam param = service.download();
		String response = Utility.toStringJsonPretty(param);

		log.info("{} {} - download()", Utility.indentEnd(), Utility.ellipsisEscape(response, 64));
		return response;
	}

	@PostMapping(value = "upload")
	public boolean upload(@RequestParam MultipartFile file) {
		log.info("{} upload(『{}』)", Utility.indentStart(), Utility.toStringJson(file, 64));

		boolean result = service.upload(file);

		log.info("{} upload(『{}』)", Utility.indentEnd(), Utility.toStringJson(file, 64));
		return result;
	}

	@ResponseBody
	@GetMapping(value = "compile")
	public List<ItemDomain> compile() {
		log.info("{} compile()", Utility.indentStart());

		List<ItemDomain> result = service.compile();

		log.info("{} 『#{}』 - compile()", Utility.indentEnd(), Utility.size(result));
		return result;
	}

	@ResponseBody
	@PostMapping(value = "compile")
	public CrudList<DividendHistoryDomain> compilePost(@RequestBody ItemParam param) {
		log.info("{} compilePost({})", Utility.indentStart(), param);

		CrudList<DividendHistoryDomain> result = service.compile(param);

		log.info("{} 『{}』 - compilePost({})", Utility.indentEnd(), result, param);
		return result;
	}

}
