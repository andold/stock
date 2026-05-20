package kr.andold.stock.crawler;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

import kr.andold.utils.Utility;

public interface ConstantSeibro {
	static final Date START_DATE = Date.from(LocalDate.of(2008, 1, 3).atStartOfDay(Utility.ZONE_ID_KST).toInstant());	// 2008-01-03
	static final Duration DEFAULT_DURATION = Duration.ofSeconds(4);
	static final Duration DEFAULT_DURATION_LONG = Duration.ofSeconds(4 * 4);

	static final String URL_COMPANY = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01041V.xml&menuNo=285";
	//	SEIBro > ETF > 권리행사정보 > 분배금지급현황
	static final String URL_ETF = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06030V.xml&menuNo=179";
	static final String MARK_START_END_POINT_COMPANY = String.format("KEYWORD\t%s\t%s\tURL\t%s\n", "CrawlDividendHistoryCompanyThread", "주식(기업) 배당금 내역", URL_COMPANY);
	static final String MARK_START_END_POINT_ETF = String.format("KEYWORD\t%s\t%s\tURL\t%s\n", "ETF 배당금 내역", "KSD 증권정보포털 SEIBro", URL_ETF);
	static final int TIMEOUT = 4000;
	static final String MARK_ANDOLD_SINCE = CrawlerService.MARK_ANDOLD_SINCE;

	// SEIBro > 주식 > 종목별상세정보 > 종목종합내역
	static final String URL_COMPANY_EACH_SUMMARY_INFO = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/stock/BIP_CNTS02006V.xml&menuNo=44";
	static final String MARK_START_END_POINT_COMPANY_EACH_SUMMARY_INFO = String.format("KEYWORD\t%s\t%s\t%s\n", "SEIBro", "주식 > 종목별상세정보 > 종목종합내역", URL_COMPANY_EACH_SUMMARY_INFO);

	// SEIBro > ETF > ETF종합정보 > 종목상세
	static final String URL_ETF_EACH_SUMMARY_INFO = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS906032V.xml&menuNo=514";
	static final String MARK_START_END_POINT_ETF_EACH_SUMMARY_INFO = String.format("KEYWORD\t%s\t%s\t%s\n", "SEIBro", "ETF > ETF종합정보 > 종목상세", URL_ETF_EACH_SUMMARY_INFO);

	// SEIBro > 주식 > 종목별상세정보 > 일자별시세
	static final String URL_PRICE_COMPANY_EACH = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/stock/BIP_CNTS02007V.xml&menuNo=45";
	static final String MARK_START_END_POINT_PRICE_COMPANY_EACH = String.format("KEYWORD\t%s\t%s\t%s\n", "SEIBro", "주식 > 종목별상세정보 > 일자별시세", URL_PRICE_COMPANY_EACH);

	// SEIBro > ETF > ETF종합정보 > 기준가추이 :: 일별시세
	static final String URL_PRICE_ETF_EACH = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06033V.xml&menuNo=182";
	static final String MARK_START_END_POINT_PRICE_ETF_EACH = String.format("KEYWORD\t%s\t%s\t%s\n", "SEIBro", "ETF > ETF종합정보 > 기준가추이 :: 일별시세", URL_PRICE_ETF_EACH);

	// SEIBro > 주식 > 종목전체검색 > 주식종목전체검색
	static final String URL_PRICE_COMPANY_CURRENT = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/stock/BIP_CNTS02004V.xml&menuNo=41";
	static final String MARK_START_END_POINT_PRICE_COMPANY_CURRENT = String.format("KEYWORD\t%s\t%s\t%s\n", "SEIBro", "주식 > 종목전체검색 > 주식종목전체검색", URL_PRICE_COMPANY_CURRENT);

	// SEIBro > ETF > 종목발행현황
	static final String URL_PRICE_ETF_CURRENT = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06025V.xml&menuNo=174";
	static final String MARK_START_END_POINT_PRICE_ETF_CURRENT = String.format("KEYWORD\t%s\t%s\t%s\n", "SEIBro", "ETF > 종목발행현황", URL_PRICE_ETF_CURRENT);

}
