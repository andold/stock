package kr.andold.stock.job;

import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.service.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CrawlItemIpoCloseJobNoSpringBootTest {
	@BeforeEach
	public void before() {
		log.info(Utility.HR);
	}

	@Test
	public void parse2() {
		String filename = "상장폐지현황.xls";
		String textAsHtml = Utility.readClassPathFile(filename, "EUC-KR");
		Document document = Jsoup.parse(textAsHtml, Utility.BLANK);
		String textAsTable = Utility.extractStringFromHtmlElement(document);
		log.info("{} parse() - {}", Utility.indentMiddle(), Utility.ellipsis(textAsTable, 256, 256));
		List<ItemDomain> items = CrawlItemIpoCloseKindJob.parse(textAsTable);
		for (ItemDomain item: items) {
			log.info("{} parse() - {}", Utility.indentMiddle(), item);
		}
	}

	@Test
	public void parse0() {
		String filename = "상\t\t장\t\t폐\t지\t현황.xls\t\t";
		log.info("{} parse() - {} {}", Utility.indentMiddle(), filename, filename.split("\t"));
	}

}
