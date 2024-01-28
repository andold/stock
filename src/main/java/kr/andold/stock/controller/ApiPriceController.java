package kr.andold.stock.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

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
	public ResponseEntity<StreamingResponseBody> download() throws IOException {
		log.info("{} download()", Utility.indentStart());
		long started = System.currentTimeMillis();

		String filename = URLEncoder.encode(String.format("stock-price-%s.json", LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE)), "UTF-8").replaceAll("\\+", "%20");
		File file = File.createTempFile("stock-price-", "-.json.tmp");
		file.deleteOnExit();
		FileWriter fw = new FileWriter(file);
		PrintWriter writer = new PrintWriter(fw);
		List<PriceDomain> prices = service.search(null);
		for (PriceDomain price : prices) {
			writer.println(Utility.toStringJson(price));
		}
		writer.close();
		
		final HttpHeaders httpHeaders = new HttpHeaders();
	    final InputStream inputStream = new FileInputStream(file);
	    httpHeaders.set(HttpHeaders.LAST_MODIFIED, String.valueOf(file.lastModified()));
	    httpHeaders.set(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + filename + "\"");
	    httpHeaders.set(HttpHeaders.CONTENT_LENGTH, String.valueOf(file.length()));

	    StreamingResponseBody responseBody = outputStream -> {

	        int numberOfBytesToWrite;
	        byte[] data = new byte[64 * 1024];
	        while ((numberOfBytesToWrite = inputStream.read(data, 0, data.length)) != -1) {
	            outputStream.write(data, 0, numberOfBytesToWrite);
	            outputStream.flush();
	        }

	        inputStream.close();
	    };

		log.info("{} #{}/#{} - download() - {}", Utility.indentEnd(), Utility.size(prices), file.length(), Utility.toStringPastTimeReadable(started));
	    return ResponseEntity.ok()
	            .headers(httpHeaders)
	            .contentLength(file.length())
	            .contentType(MediaType.APPLICATION_OCTET_STREAM)
	            .cacheControl(CacheControl.noCache())
	            .body(responseBody);		
	}

	@PostMapping(value = "upload")
	public CrudList<PriceDomain> upload(@RequestParam("file") MultipartFile file) {
		log.info("{} upload(『{}』)", Utility.indentStart(), Utility.toStringJson(file, 32));

		CrudList<PriceDomain> result = service.upload(file);

		log.info("{} 『{}』 upload(『{}』)", Utility.indentEnd(), result, Utility.toStringJson(file, 32));
		return result;
	}

}
