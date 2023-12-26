grammar Stock;

import	Common;

@header {
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.stock.service.StockParserService;
}

@members	{
	private final Logger log = LoggerFactory.getLogger(getClass());
}

stockDocument
:	crawlEtfDividendHistoryThread	// KSD증권정보포털(SEIBro) > 주식 > 배당정보 > 배당내역전체겁색 > 조회
|	crawlDividendHistoryEtfThread
|	extractAllEtfFromNaver
|	crawlEtfDetailThread			// KSD증권정보포털(SEIBro) > ETF > ETF종합정보 > 종목상세
|	crawlCompanyTopDividend			// KSD증권정보포털(SEIBro) > 주식 > 배당정보 > 배당순위
|	crawlCompanyDetails				// KSD증권정보포털(SEIBro) > 기업 > 기업기본정보
|	crawlPriceCompay				// KSD증권정보포털(SEIBro) > 주식 > 종목별상세정보 > 일자별시세
|	crawlPriceEtf					// KSD 증권정보포털 SEIBro > ETF > ETF종합정보 > 기준가추이
;


// KSD 증권정보포털 SEIBro > ETF > ETF종합정보 > 기준가추이
crawlPriceEtf:
KEYWORD TAB WORD WORD TAB WORD TAB WORD TAB WORD								NEWLINE		//	KEYWORD 	 ETF 일별시세 	 CrawlPriceEtfThread 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06033V.xml&menuNo=182 
(
	code=NUMBER TAB symbol=word+												NEWLINE		//	143860 	 TIGER 헬스케어 
	WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB		NEWLINE		//	일자 	 종가 	 전일비 	 시가 	 고가 	 저가 	 거래량 	 거래대금 	 
	((
		TAB TAB TAB TAB TAB TAB TAB TAB											NEWLINE		//		 	 	 	 	 	 	 	 
	) | (
		base=DATE? TAB closing=NUMBER? TAB NUMBER? TAB market=NUMBER? TAB high=NUMBER? TAB low=NUMBER TAB volume=NUMBER TAB NUMBER? TAB		NEWLINE
				//	2023/12/15 	 32,300 	 320 	 32,165 	 32,320 	 32,070 	 121,115 	 3,900 	 
		{
			StockParserService.crawlPriceCompanyEtf(20231217
				, $code.text, $symbol.text
				, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
			);
		}
	))+
	WORD TAB WORD TAB DATE							NEWLINE		//	andold 	 since 	 2023-11-27 
)+
KEYWORD TAB WORD WORD TAB WORD TAB WORD TAB WORD	NEWLINE		//	KEYWORD 	 ETF 일별시세 	 CrawlPriceEtfThread 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06033V.xml&menuNo=182 
;


// KSD증권정보포털(SEIBro) > 주식 > 종목별상세정보 > 일자별시세
crawlPriceCompay:
KEYWORD TAB WORD WORD TAB WORD TAB WORD TAB WORD						NEWLINE		//	KEYWORD 	 주식 일자별시세 	 CrawlCompanyPriceThread 	 URL 	 https://finance.naver.com/item/sise.naver?code= 
(
	code=NUMBER TAB symbol=word+										NEWLINE		//	072870 	 메가스터디 
	WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB		NEWLINE		//	일자 	 종가 	 전일비 	 시가 	 고가 	 저가 	 거래량 	 
	((
		TAB TAB TAB TAB TAB TAB TAB										NEWLINE		//		 	 	 	 	 	 	 
	) | (
		base=DATE TAB closing=NUMBER TAB NUMBER TAB market=NUMBER TAB high=NUMBER TAB low=NUMBER TAB volume=NUMBER TAB		NEWLINE
				//	2023/12/18 	 11,430 	 30 	 11,400 	 11,500 	 11,370 	 16,124 
		{
			StockParserService.crawlPriceCompanyEtf(20231217
				, $code.text, $symbol.text
				, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
			);
		}
	))+
	WORD TAB WORD TAB DATE												NEWLINE		//	andold 	 since 	 2023-11-27 
)+
KEYWORD TAB WORD WORD TAB WORD TAB WORD TAB WORD						NEWLINE		//	KEYWORD 	 주식 일자별시세 	 CrawlCompanyPriceThread 	 URL 	 https://finance.naver.com/item/sise.naver?code= 
;


// KSD증권정보포털(SEIBro) > 기업 > 기업기본정보
crawlCompanyDetails:
KEYWORD TAB WORD WORD TAB WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 주식 상세 	 CrawlCompanyDetailThread 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/stock/BIP_CNTS02006V.xml&menuNo=44 
(
	KEYWORD TAB code=NUMBER TAB symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*	NEWLINE
			//	KEYWORD 	 093920 	 서원인텍 

	KEYWORD TAB category=STRING									NEWLINE		//	KEYWORD 	 "부동산업" 
	KEYWORD TAB fics=STRING										NEWLINE		//	KEYWORD 	 "> >" 
	KEYWORD TAB ea=NUMBER WORD									NEWLINE		//	KEYWORD 	 18,600,000 주 
	KEYWORD TAB ipo=DATE										NEWLINE		//	KEYWORD 	 2007/12/20 
	WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27
	{
		StockParserService.crawlCompanyDetails(20231217
			, $code.text
			, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
			, $category.text
			, $fics.text
			, $ea.text
			, $ipo.text
		);
	}
)+
KEYWORD TAB WORD WORD TAB WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 주식 상세 	 CrawlCompanyDetailThread 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/stock/BIP_CNTS02006V.xml&menuNo=44 
;


// KSD증권정보포털(SEIBro) > 주식 > 배당정보 > 배당순위
crawlCompanyTopDividend:
KEYWORD TAB WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 crawlCompanyTopDividend 	 주식 상위 배당 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01042V.xml&menuNo=286 
(
	WORD TAB										NEWLINE		//	KOSPI 	 
	WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB		NEWLINE		//	KOSPI 	 순위 	 종목코드 	 종목명 	 주식종류 	 시장구분 	 주당배당금 	 시가배당율 	 액면가배당율 	 액면가 	 결산월 	 
	(
		type=WORD TAB NUMBER TAB code=NUMBER? TAB word+ TAB WORD TAB WORD TAB NUMBER TAB NUMBER TAB NUMBER TAB NUMBER TAB NUMBER TAB		NEWLINE
				//	5 	 175330 	 JB금융지주 	 보통주 	 유가증권시장 	 835 	 10.10 	 16.70 	 5,000 	 12 	 
		{
			StockParserService.crawlCompanyTopDividend(20231217
				, $code.text
				, $type.text
			);
		}
	)+ 	 	 
	WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
)+
KEYWORD TAB WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 crawlCompanyTopDividend 	 주식 상위 배당 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01042V.xml&menuNo=286 
;


// KSD증권정보포털(SEIBro) > ETF > ETF종합정보 > 종목상세
crawlEtfDetailThread:
KEYWORD TAB WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 ETF 상세 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS906032V.xml&menuNo=514 
(
	KEYWORD TAB code=NUMBER TAB word*		NEWLINE
	symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*					NEWLINE		//	KODEX 에너지화학[117460] 
	category=word category1=word? category2=word? category3=word? category4=word? category5=word? category6=word? category7=word*	NEWLINE		//	섹터/소재 
	ipo=DATE WORD*							NEWLINE		//	2009/10/09 (14년 2개월) 
	fee=word								NEWLINE		//	0.45 
	WORD TAB WORD TAB DATE					NEWLINE		//	andold 	 since 	 2023-11-27 
	{
		StockParserService.crawlEtfDetailThread(20231217
			, $code.text
			, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
			, $category.text, $category1.text, $category2.text, $category3.text, $category4.text, $category5.text, $category6.text, $category7.text
			, $ipo.text
			, $fee.text
		);
	}
)+
KEYWORD TAB WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 ETF 상세 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS906032V.xml&menuNo=514 
;


extractAllEtfFromNaver:
(
	KEYWORD TAB code=WORD TAB symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*		NEWLINE
			//	KEYWORD 	 https://finance.naver.com/item/main.naver?code=357870 	 TIGER CD금리투자KIS(합성) 
	{
		StockParserService.extractAllEtfFromNaver(20231214
			, $code.text
			, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
		);
	}
)+
WORD TAB WORD TAB DATE							NEWLINE		//	andold 	 since 	 2023-11-27 
;


crawlDividendHistoryEtfThread:
KEYWORD TAB WORD WORD WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 ETF 배당금 내역 	 KSD 증권정보포털 SEIBro 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06030V.xml&menuNo=179 
((
	KEYWORD TAB code=NUMBER										NEWLINE		//	KEYWORD 	 166400 
	WORD TAB TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB		NEWLINE		//	종목명 	 	 운용사 	 유형 	 지급기준일 	 실지급일 	 배당구분 	 주당분배금 	 결산과표기준가 	 시가대비분배율 	 
	(((
		symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* TAB
		TAB WORD TAB word* TAB base=DATE? TAB pay=DATE? TAB WORD? TAB dividend=NUMBER? TAB price=NUMBER? TAB ratio=NUMBER? TAB		NEWLINE
				//	TIGER 200커버드콜5%OTM 	 	 미래에셋자산운용 	 파생상품/구조화 	 2023/11/30 	 2023/12/04 	 이익분배 	 54 	 11,308.35 	 0.45 	 
	) {
		StockParserService.crawlDividendHistoryEtfThread(20231127
			, $code.text
			, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
			, $base.text, $pay.text
			, $dividend.text
			, $price.text
			, $ratio.text
		);
	}) | (
		TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB										NEWLINE		//		 	 	 	 	 	 	 	 	 	 
	))+
	WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
))+
KEYWORD TAB WORD WORD WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 ETF 배당금 내역 	 KSD 증권정보포털 SEIBro 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06030V.xml&menuNo=179 
;


// KSD증권정보포털(SEIBro) > 주식 > 배당정보 > 배당내역전체겁색 > 조회
crawlEtfDividendHistoryThread:
	KEYWORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 일반기업 배당금 내역 	 URL 	 "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01041V.xml&menuNo=285
	(
		KEYWORD TAB code=NUMBER TAB word+				NEWLINE		//	KEYWORD 	 000850 	 화천기공 
		(
			WORD TAB WORD								NEWLINE		//	배정기준일 	 현금배당 
			WORD TAB WORD								NEWLINE		//	지급일 	 주식 
			WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB		NEWLINE		//	유통(교부)일 	 종목코드 	 종목명 	 시장구분 	 배당구분 	 명의개서대리인 	 주식종류 	 주당배당금 	 주당배당률(일반) 	 주당배당률(차등) 	 액면가 	 결산월 	 
			WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB															NEWLINE		//	일반 	 차등 	 현금 	 주식 	 현금 	 주식 
			((
				TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB											NEWLINE		//		 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 
			) | (
				base=DATE TAB pay=DATE? TAB DATE? TAB NUMBER TAB symbol=word+ TAB WORD TAB WORD TAB WORD TAB WORD TAB dividend=NUMBER TAB NUMBER? TAB NUMBER TAB NUMBER TAB NUMBER? TAB TAB NUMBER TAB NUMBER TAB		NEWLINE
						//	2022/12/31 	 2023/04/21 	 	 000850 	 화천기공 	 유가증권시장 	 현금배당 	 국민은행 	 보통주 	 2,500 	 	 50.00 	 0.00 	 	 	 5,000 	 12 	 
			) {
				StockParserService.seibroDividendItem(20231127
					, $base.text , $pay.text
					, $code.text , $symbol.text
					, $dividend.text
				);
			})+
		)+
		WORD TAB WORD TAB DATE						NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD WORD WORD TAB WORD TAB WORD	NEWLINE		//	KEYWORD 	 일반기업 배당금 내역 	 URL 	 "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01041V.xml&menuNo=285 
;
