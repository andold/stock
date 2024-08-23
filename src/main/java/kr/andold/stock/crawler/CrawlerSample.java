package kr.andold.stock.crawler;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.Result;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@SuppressWarnings("unused")
public class CrawlerSample implements Crawler {
	private static final int TIMEOUT = 4000;
	private static final String MARK_ANDOLD_SINCE = CrawlerService.MARK_ANDOLD_SINCE;

	// SEIBro > 주식 > 종목별상세정보 > 일자별시세
	private static final String URL_PRICE_COMPANY_EACH = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/stock/BIP_CNTS02007V.xml&menuNo=45";
	private static final String MARK_START_END_POINT_PRICE_COMPANY_EACH = String.format("KEYWORD\t%s\t%s\t%s\n", "SEIBro", "주식 > 종목별상세정보 > 일자별시세", URL_PRICE_COMPANY_EACH);

	@Override
	public Result<ParserResult> basicInfoAll() {
		log.error("{} 『{}』 basicInfoAll()", Utility.indentMiddle(), STATUS.NOT_SUPPORT);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> dividend(String code, Date start) {
		log.error("{} 『{}』 dividend({}, {})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, code, start);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> price(Date date) {
		log.error("{} 『{}』 price({})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, date);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> price(String code, Date start) {
		log.error("{} 『{}』 price({}, {})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, code, start);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> dividend(Date start) {
		log.error("{} 『{}』 dividend({})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, start);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> item(String code) {
		log.error("{} 『{}』 item({}})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, code);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> price(ItemDomain item, List<DividendHistoryDomain> histories) {
		log.error("{} 『{}』 price({}, #{})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, item, Utility.size(histories));
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> item(Date start) {
		log.error("{} 『{}』 item({})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, start);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

}
