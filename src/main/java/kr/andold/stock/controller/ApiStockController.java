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
import kr.andold.stock.domain.StockDividendDomain;
import kr.andold.stock.param.StockDividendParam;
import kr.andold.stock.param.StockParam;
import kr.andold.stock.service.StockCrawlerService;
import kr.andold.stock.service.StockService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.StockParserService.StockParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api")
public class ApiStockController {
	@Autowired private HttpServletResponse httpServletResponse;
	@Autowired private StockService service;
	@Autowired private StockCrawlerService stockCrawlerService;

	@ResponseBody
	@GetMapping(value = {"download"})
	public String download() throws UnsupportedEncodingException {
		log.info("{} downloadHoushold()", Utility.indentStart());

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
		String filename = URLEncoder.encode(String.format("stock-%s.json", simpleDateFormat.format(Calendar.getInstance().getTime())), "UTF-8").replaceAll("\\+", "%20");
		httpServletResponse.setHeader("Content-Disposition", "attachment; filename=" + filename);

		StockParam param = service.download();
		String response = Utility.toStringJsonPretty(param);

		log.info("{} {} - downloadHoushold()", Utility.indentEnd(), Utility.ellipsis(response, 64));
		return response;
	}

	@PostMapping(value = "upload")
	public boolean upload(@RequestParam("file") MultipartFile file) {
		log.info("{} upload(『{}』)", Utility.indentStart());

		boolean result = service.upload(file);

		log.info("{} upload(『{}』)", Utility.indentEnd());
		return result;
	}

	@PostMapping(value = {"search"})
	public List<StockDividendDomain> search(@RequestBody StockDividendParam param) {
		log.info("{} search({})", Utility.indentStart(), param);

		List<StockDividendDomain> list = service.search(param);

		log.info("{} #{} - search({})", Utility.indentEnd(), Utility.size(list));
		return list;
	}

	@ResponseBody
	@GetMapping(value = "compile")
	public String compile() {
		log.info("{} compile()", Utility.indentStart());

		String result = service.compile();

		log.info("{} {} - compile()", Utility.indentEnd(), result);
		return result;
	}

	@ResponseBody
	@GetMapping(value = "crawl/items")
	public StockParserResult crawlItems() {
		log.info("{} crawlItems()", Utility.indentStart());

		StockParserResult result = stockCrawlerService.crawlItems();

		log.info("{} {} - crawlItems()", Utility.indentEnd(), result);
		return result;
	}

	@ResponseBody
	@GetMapping(value = "crawl/item/etf/details")
	public StockParserResult crawlItemEtfDetails() {
		log.info("{} crawlItemEtfDetails()", Utility.indentStart());

		StockParserResult result = stockCrawlerService.crawlEtfDetails();

		log.info("{} {} - crawlItemEtfDetails()", Utility.indentEnd(), result);
		return result;
	}

	@ResponseBody
	@GetMapping(value = "crawl/item/company/details")
	public StockParserResult crawlItemCompanyDetails() {
		log.info("{} crawlItemCompanyDetails()", Utility.indentStart());

		StockParserResult result = stockCrawlerService.crawlItemCompanyDetails();

		log.info("{} {} - crawlItemCompanyDetails()", Utility.indentEnd(), result);
		return result;
	}

	@ResponseBody
	@GetMapping(value = "crawl/item/company/dividend/top")
	public StockParserResult crawlCompanyDividendTop() {
		log.info("{} crawlCompanyDividendTop()", Utility.indentStart());

		StockParserResult result = stockCrawlerService.crawlItemCompanyDividendTop();

		log.info("{} {} - crawlCompanyDividendTop()", Utility.indentEnd(), result);
		return result;
	}

	@ResponseBody
	@GetMapping(value = "crawl/price/company")
	public StockParserResult crawlPriceCompay() {
		log.info("{} crawlPriceCompay()", Utility.indentStart());

		StockParserResult result = stockCrawlerService.crawlPriceCompany();

		log.info("{} {} - crawlPriceCompay()", Utility.indentEnd(), result);
		return result;
	}

	@ResponseBody
	@GetMapping(value = "crawl/price/etf")
	public StockParserResult crawlPriceEtf() {
		log.info("{} crawlPriceEtf()", Utility.indentStart());

		StockParserResult result = stockCrawlerService.crawlPriceEtf();

		log.info("{} {} - crawlPriceEtf()", Utility.indentEnd(), result);
		return result;
	}

	@ResponseBody
	@GetMapping(value = "crawl/dividend/history/etf")
	public StockParserResult crawlDividendHistoryEtf() {
		log.info("{} crawlDividendHistoryEtf()", Utility.indentStart());

		StockParserResult result = stockCrawlerService.crawlEtfDividendHistories();

		log.info("{} {} - crawlDividendHistoryEtf()", Utility.indentEnd(), result);
		return result;
	}

}
