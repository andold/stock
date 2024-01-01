package kr.andold.stock.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
import kr.andold.stock.domain.DividendDomain;
import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.param.DividendParam;
import kr.andold.stock.param.ItemParam;
import kr.andold.stock.param.StockParam;
import kr.andold.stock.service.CommonBlockService.CrudList;
import kr.andold.stock.service.CrawlerService;
import kr.andold.stock.service.StockService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api")
public class ApiStockController {
	@Autowired private HttpServletResponse httpServletResponse;
	@Autowired private StockService service;
	@Autowired private CrawlerService stockCrawlerService;

	@ResponseBody
	@GetMapping(value = {"download"})
	public String download() throws UnsupportedEncodingException {
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
	public boolean upload(@RequestParam("file") MultipartFile file) {
		log.info("{} upload(『{}』)", Utility.indentStart(), Utility.toStringJson(file, 64));

		boolean result = service.upload(file);

		log.info("{} upload(『{}』)", Utility.indentEnd(), Utility.toStringJson(file, 64));
		return result;
	}

	@PostMapping(value = {"search"})
	public List<DividendDomain> search(@RequestBody DividendParam param) {
		log.info("{} search({})", Utility.indentStart(), param);

		List<DividendDomain> list = service.search(param);

		log.info("{} #{} - search({})", Utility.indentEnd(), Utility.size(list));
		return list;
	}

	@ResponseBody
	@GetMapping(value = "compile")
	public CrudList<DividendDomain> compile() {
		log.info("{} compile()", Utility.indentStart());

		CrudList<DividendDomain> result = service.compile();

		log.info("{} Dividend:{} - compile()", Utility.indentEnd(), result);
		return result;
	}

	@ResponseBody
	@PostMapping(value = "compile")
	public CrudList<DividendHistoryDomain> compilePost(@RequestBody ItemParam param) {
		log.info("{} compilePost({})", Utility.indentStart(), param);

		CrudList<DividendHistoryDomain> result = service.compile(param);

		log.info("{} DividendHistory:{} - compilePost({})", Utility.indentEnd(), result, param);
		return result;
	}

	@ResponseBody
	@GetMapping(value = "crawl/item/etf/details")
	public ParserResult crawlItemEtfDetails() {
		log.info("{} crawlItemEtfDetails()", Utility.indentStart());

		ParserResult result = stockCrawlerService.crawlItemDetailEtf();

		log.info("{} {} - crawlItemEtfDetails()", Utility.indentEnd(), result);
		return result;
	}

	@ResponseBody
	@GetMapping(value = "crawl/item/company/details")
	public ParserResult crawlItemCompanyDetails() {
		log.info("{} crawlItemCompanyDetails()", Utility.indentStart());

		ParserResult result = stockCrawlerService.crawlItemDetailCompany();

		log.info("{} {} - crawlItemCompanyDetails()", Utility.indentEnd(), result);
		return result;
	}

	@ResponseBody
	@GetMapping(value = "crawl/item/dividend/top/company")
	public ParserResult crawlDividendTopCompany() {
		log.info("{} crawlDividendTopCompany()", Utility.indentStart());

		ParserResult result = stockCrawlerService.crawlItemDividendTopCompany();

		log.info("{} {} - crawlDividendTopCompany()", Utility.indentEnd(), result);
		return result;
	}

	@ResponseBody
	@GetMapping(value = "crawl/price/company")
	public ParserResult crawlPriceCompay(@RequestParam(value = "start", required = false) Date start) {
		log.info("{} crawlPriceCompay()", Utility.indentStart());

		ParserResult result = stockCrawlerService.crawlPriceCompany(start);

		log.info("{} {} - crawlPriceCompay()", Utility.indentEnd(), result);
		return result;
	}

	@ResponseBody
	@GetMapping(value = "crawl/price/etf")
	public ParserResult crawlPriceEtf(@RequestParam(value = "start", required = false) Date start) {
		log.info("{} crawlPriceEtf()", Utility.indentStart());

		ParserResult result = stockCrawlerService.crawlPriceEtf(start);

		log.info("{} {} - crawlPriceEtf()", Utility.indentEnd(), result);
		return result;
	}

	@ResponseBody
	@GetMapping(value = "crawl/dividend/history/company")
	public ParserResult crawlDividendHistoryCompany(@RequestParam(value = "start", required = false) Date start) {
		log.info("{} crawlDividendHistoryCompany({})", Utility.indentStart(), start);

		ParserResult result = stockCrawlerService.crawlDividendHistoryCompany(start);

		log.info("{} {} - crawlDividendHistoryCompany({})", Utility.indentEnd(), result, start);
		return result;
	}

	@ResponseBody
	@GetMapping(value = "crawl/dividend/history/etf")
	public ParserResult crawlDividendHistoryEtf(@RequestParam(value = "start", required = false) Date start) {
		log.info("{} crawlDividendHistoryEtf({})", Utility.indentStart(), start);

		ParserResult result = stockCrawlerService.crawlDividendHistoryEtf(start);

		log.info("{} {} - crawlDividendHistoryEtf({})", Utility.indentEnd(), result, start);
		return result;
	}

}
