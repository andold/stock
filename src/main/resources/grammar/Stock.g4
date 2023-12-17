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
:	naverStock		//	네이버 > 증권홈 > 국내증시 > 배당 > 코스피
|	extractTextStockPrice	//	네이버 > 증권홈 > 국내증시 > 배당 > 코스피 > 종목클릭 > 시세
|	extractlDividendHistory
|	extractItemDetails
|	naverStockDetail	//	네이버 > 증권홈 > 국내증시 > 배당 > 코스피 > 종목클릭 > 종목분석
|	naverStockItemDetails	//	네이버 > 증권홈 > 국내증시 > 배당 > 코스피 > 종목클릭 > 종목분석 전체 조회
|	seibroDividend	// KSD증권정보포털(SEIBro) > 주식 > 배당정보 > 배당내역전체겁색 > 조회
|	searchEtfCom	//	https://search-etf.com/divi-list.html
|	searchEtfComMonthlyDividend	//	https://search-etf.com/divi-list.html
|	searchEtfComMonthlyDividendEtf	// 국내상장 월배당ETF 전체 조회
|	crawlDividendHistoryEtfThread
|	extractAllEtfFromNaver
|	crawlEtfDetailThread	// KSD증권정보포털(SEIBro) > ETF > ETF종합정보 > 종목상세
;


// KSD증권정보포털(SEIBro) > ETF > ETF종합정보 > 종목상세
crawlEtfDetailThread:
KEYWORD TAB WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 ETF 상세 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS906032V.xml&menuNo=514 
(
	KEYWORD TAB code=NUMBER TAB word*		NEWLINE
	symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*					NEWLINE		//	KODEX 에너지화학[117460] 
	category=word category1=word? category2=word? category3=word? category4=word? category5=word? category6=word? category7=word*	NEWLINE		//	섹터/소재 
	ipo=DATE WORD+							NEWLINE		//	2009/10/09 (14년 2개월) 
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


extractItemDetails:
KEYWORD TAB WORD WORD WORD TAB WORD TAB WORD				NEWLINE		//	KEYWORD 	 개별 기업 상세 	 URL 	 https://finance.naver.com/item/coinfo.naver?code=
(extractItemDetailsCompany | extractItemDetailsEtf)+
KEYWORD TAB WORD WORD WORD TAB WORD TAB WORD				NEWLINE		//	KEYWORD 	 개별 기업 상세 	 URL 	 https://finance.naver.com/item/coinfo.naver?code= 
;
extractItemDetailsCompany:
	symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* code=NUMBER	NEWLINE		//	금화피에스시 036190
	WORD WORD ckospi=WORD? TAB (WORD WORD cwics=WORD? TAB)? WORD priceEarningsRatio=WORD? TAB	NEWLINE		//	WICS : 건설 	 현금배당수익률 4.81% 	 
	WORD TAB currentPrice=WORD WORD WORD WORD WORD TAB		NEWLINE		//	주가/전일대비/수익률 	 27,050원 / +200원 / +0.74% 	 
	WORD TAB volumeOfListedShares=NUMBER TAB				NEWLINE		//	상장주식수 	 6,000,000 	 
{
	StockParserService.naverStockDetail(20231127
		, $code.text
		, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
		, $ckospi.text, $cwics.text
		, null, null
		, $currentPrice.text
		, $volumeOfListedShares.text
		, $priceEarningsRatio.text
	);
};
extractItemDetailsEtf:
	symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* code=NUMBER	NEWLINE		//	금화피에스시 036190
	WORD ckospi=WORD cwics=WORD? TAB															NEWLINE
	WORD TAB currentPrice=WORD WORD WORD WORD WORD TAB		NEWLINE		//	주가/전일대비/수익률 	 27,050원 / +200원 / +0.74% 	 
	WORD TAB volumeOfListedShares=NUMBER TAB				NEWLINE		//	상장주식수 	 6,000,000 	 
{
	StockParserService.naverStockDetail(20231127
		, $code.text
		, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
		, null, null
		, $ckospi.text, $cwics.text
		, $currentPrice.text
		, $volumeOfListedShares.text
		, null
	);
};


extractlDividendHistory:
	KEYWORD TAB WORD WORD WORD TAB WORD TAB WORD	NEWLINE		//	KEYWORD 	 일반기업 배당금 내역 	 URL 	 "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01041V.xml&menuNo=285
	(
		KEYWORD TAB code=NUMBER TAB word+			NEWLINE		//	KEYWORD 	 000850 	 화천기공 
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
		WORD TAB WORD TAB DATE						NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD WORD WORD TAB WORD TAB WORD	NEWLINE		//	KEYWORD 	 일반기업 배당금 내역 	 URL 	 "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01041V.xml&menuNo=285 
;


extractTextStockPrice:
	KEYWORD TAB WORD WORD WORD TAB WORD TAB WORD							NEWLINE		//	KEYWORD 	 주식 시세 이력 	 URL 	 https://finance.naver.com/item/sise.naver?code=
	(
		code=NUMBER TAB word+												NEWLINE		//	000850	화천기공 
		WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB		NEWLINE		//	날짜 	 종가 	 전일비 	 시가 	 고가 	 저가 	 거래량
		((
			TAB																NEWLINE		//		 
		) | (
			DATE TAB closing=NUMBER TAB NUMBER TAB market=NUMBER TAB high=NUMBER TAB low=NUMBER TAB volume=NUMBER TAB		NEWLINE
					//	2023.12.04 	 32,650 	 50 	 32,700 	 32,850 	 32,450 	 2,525 	 
		) {
			StockParserService.extractTextStockPrice(20231127
				, $code.text
				, $DATE.text
				, $closing.text
				, $market.text
				, $high.text
				, $low.text
				, $volume.text
			);
		})+
		WORD TAB WORD TAB DATE											NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD WORD WORD TAB WORD TAB WORD							NEWLINE		//	KEYWORD 	 주식 시세 이력 	 URL 	 https://finance.naver.com/item/sise.naver?code= 
;


//	네이버 > 증권홈 > 국내증시 > 배당 > 코스피 > 종목클릭 > 종목분석 전체 조회
naverStockItemDetails:
	KEYWORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 개별 기업 상세 	 URL 	 https://finance.naver.com/item/coinfo.naver?code= 
	naverStockDetail+
	KEYWORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 개별 기업 상세 	 URL 	 https://finance.naver.com/item/coinfo.naver?code= 
;


// 국내상장 월배당ETF 전체 조회
searchEtfComMonthlyDividendEtf:
KEYWORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 국내상장 월배당ETF 조회 	 URL 	 https://search-etf.com/month-divi.html 
WORD TAB WORD TAB WORD TAB WORD TAB					NEWLINE		//	순서 	 종목코드 	 종목명 	 실제배당일 	 
searchEtfComMonthlyDividendEtfItem+
WORD TAB WORD TAB DATE								NEWLINE		//	andold 	 since 	 2023-11-27 

searchEtfComMonthlyDividendEtfItemDividend+
WORD TAB WORD TAB DATE								NEWLINE		//	andold 	 since 	 2023-11-27 
;
searchEtfComMonthlyDividendEtfItem:
	NUMBER TAB code=NUMBER TAB symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* TAB DATE TAB
			NEWLINE		//	3 	 460960 	 ACE 글로벌인컴TOP10 SOLACTIVE 	 2023-12-04 	 
{
	StockParserService.searchEtfComMonthlyDividendEtfItem(20231127
		, $code.text
		, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
		, $DATE.text
	);
};
searchEtfComMonthlyDividendEtfItemDividend:
KEYWORD TAB WORD TAB code=NUMBER TAB WORD TAB symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*		NEWLINE		//	KEYWORD 	 CODE 	 453850 	 SYMBOL 	 월배당ETF : ACE 미국30년국채액티브(H) 
WORD TAB t0=WORD TAB t1=WORD TAB t2=WORD TAB t3=WORD TAB				NEWLINE		//	# 	 20년 	 21년 	 22년 	 23년 	 
WORD TAB v0x1=word TAB v1x1=word TAB v2x1=word TAB v3x1=word TAB		NEWLINE
WORD TAB v0x2=word TAB v1x2=word TAB v2x2=word TAB v3x2=word TAB		NEWLINE
WORD TAB v0x3=word TAB v1x3=word TAB v2x3=word TAB v3x3=word TAB		NEWLINE
WORD TAB v0x4=word TAB v1x4=word TAB v2x4=word TAB v3x4=word TAB		NEWLINE
WORD TAB v0x5=word TAB v1x5=word TAB v2x5=word TAB v3x5=word TAB		NEWLINE
WORD TAB v0x6=word TAB v1x6=word TAB v2x6=word TAB v3x6=word TAB		NEWLINE
WORD TAB v0x7=word TAB v1x7=word TAB v2x7=word TAB v3x7=word TAB		NEWLINE
WORD TAB v0x8=word TAB v1x8=word TAB v2x8=word TAB v3x8=word TAB		NEWLINE
WORD TAB v0x9=word TAB v1x9=word TAB v2x9=word TAB v3x9=word TAB		NEWLINE
WORD TAB v0x10=word TAB v1x10=word TAB v2x10=word TAB v3x10=word TAB	NEWLINE
WORD TAB v0x11=word TAB v1x11=word TAB v2x11=word TAB v3x11=word TAB	NEWLINE
WORD TAB v0x12=word TAB v1x12=word TAB v2x12=word TAB v3x12=word TAB	NEWLINE
KEYWORD TAB v0=word TAB v1=word TAB v2=word TAB v3=word TAB				NEWLINE		//	합계 	 - 	 - 	 - 	 219 	 
WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
{
	StockParserService.searchEtfComMonthlyDividendEtfItemDividend(20231127
		, $code.text
		, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
		, $t0.text, $t1.text, $t2.text, $t3.text
		, $v0x1.text, $v0x2.text, $v0x3.text, $v0x4.text, $v0x5.text, $v0x6.text, $v0x7.text, $v0x8.text, $v0x9.text, $v0x10.text, $v0x11.text, $v0x12.text 
		, $v1x1.text, $v1x2.text, $v1x3.text, $v1x4.text, $v1x5.text, $v1x6.text, $v1x7.text, $v1x8.text, $v1x9.text, $v1x10.text, $v1x11.text, $v1x12.text 
		, $v2x1.text, $v2x2.text, $v2x3.text, $v2x4.text, $v2x5.text, $v2x6.text, $v2x7.text, $v2x8.text, $v2x9.text, $v2x10.text, $v2x11.text, $v2x12.text 
		, $v3x1.text, $v3x2.text, $v3x3.text, $v3x4.text, $v3x5.text, $v3x6.text, $v3x7.text, $v3x8.text, $v3x9.text, $v3x10.text, $v3x11.text, $v3x12.text 
		, $v0.text, $v1.text, $v2.text, $v3.text
	);
};


// 국내상장 월배당ETF 한항목 조회
searchEtfComMonthlyDividend:
	WORD TAB WORD TAB WORD TAB WORD TAB		NEWLINE		//	순서 	 종목코드 	 종목명 	 실제배당일 	 
	searchEtfComMonthlyDividendItem+
	WORD TAB WORD TAB DATE					NEWLINE		//	andold 	 since 	 2023-11-27 
	searchEtfComMonthlyDividends+
	WORD TAB WORD TAB DATE					NEWLINE		//	andold 	 since 	 2023-11-27 
;
searchEtfComMonthlyDividendItem:
	NUMBER TAB code=NUMBER TAB symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* TAB DATE TAB		NEWLINE		//	3 	 460960 	 ACE 글로벌인컴TOP10 SOLACTIVE 	 2023-12-04 	 
{
	StockParserService.searchEtfComMonthlyDividendItem(20231127
		, $code.text
		, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
		, $DATE.text
	);
};
searchEtfComMonthlyDividends:
	code=NUMBER																NEWLINE		//	453850 
	WORD TAB t0=WORD TAB t1=WORD TAB t2=WORD TAB t3=WORD TAB				NEWLINE		//	# 	 20년 	 21년 	 22년 	 23년 	 
	WORD TAB v0x1=word TAB v1x1=word TAB v2x1=word TAB v3x1=word TAB		NEWLINE
	WORD TAB v0x2=word TAB v1x2=word TAB v2x2=word TAB v3x2=word TAB		NEWLINE
	WORD TAB v0x3=word TAB v1x3=word TAB v2x3=word TAB v3x3=word TAB		NEWLINE
	WORD TAB v0x4=word TAB v1x4=word TAB v2x4=word TAB v3x4=word TAB		NEWLINE
	WORD TAB v0x5=word TAB v1x5=word TAB v2x5=word TAB v3x5=word TAB		NEWLINE
	WORD TAB v0x6=word TAB v1x6=word TAB v2x6=word TAB v3x6=word TAB		NEWLINE
	WORD TAB v0x7=word TAB v1x7=word TAB v2x7=word TAB v3x7=word TAB		NEWLINE
	WORD TAB v0x8=word TAB v1x8=word TAB v2x8=word TAB v3x8=word TAB		NEWLINE
	WORD TAB v0x9=word TAB v1x9=word TAB v2x9=word TAB v3x9=word TAB		NEWLINE
	WORD TAB v0x10=word TAB v1x10=word TAB v2x10=word TAB v3x10=word TAB	NEWLINE
	WORD TAB v0x11=word TAB v1x11=word TAB v2x11=word TAB v3x11=word TAB	NEWLINE
	WORD TAB v0x12=word TAB v1x12=word TAB v2x12=word TAB v3x12=word TAB	NEWLINE
	KEYWORD TAB v0=word TAB v1=word TAB v2=word TAB v3=word TAB				NEWLINE		//	합계 	 - 	 - 	 - 	 219 	 
	WORD TAB WORD TAB DATE													NEWLINE		//	andold 	 since 	 2023-11-27 
{
	StockParserService.searchEtfComMonthlyDividends(20231127
		, $code.text
		, $t0.text, $t1.text, $t2.text, $t3.text
		, $v0x1.text, $v0x2.text, $v0x3.text, $v0x4.text, $v0x5.text, $v0x6.text, $v0x7.text, $v0x8.text, $v0x9.text, $v0x10.text, $v0x11.text, $v0x12.text 
		, $v1x1.text, $v1x2.text, $v1x3.text, $v1x4.text, $v1x5.text, $v1x6.text, $v1x7.text, $v1x8.text, $v1x9.text, $v1x10.text, $v1x11.text, $v1x12.text 
		, $v2x1.text, $v2x2.text, $v2x3.text, $v2x4.text, $v2x5.text, $v2x6.text, $v2x7.text, $v2x8.text, $v2x9.text, $v2x10.text, $v2x11.text, $v2x12.text 
		, $v3x1.text, $v3x2.text, $v3x3.text, $v3x4.text, $v3x5.text, $v3x6.text, $v3x7.text, $v3x8.text, $v3x9.text, $v3x10.text, $v3x11.text, $v3x12.text 
		, $v0.text, $v1.text, $v2.text, $v3.text
	);
};


// 개별기업 상세정보:: 네이버 > 증권홈 > 국내증시 > 배당 > 코스피 > 종목클릭 > 종목분석
naverStockDetail
:	naverStockDetailCompany
|	naverStockDetailEtf
;
naverStockDetailCompany:
	symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* code=NUMBER		NEWLINE		//	영풍제지 006740 
	(WORD WORD ckospi=WORD)? WORD WORD cwics=WORD WORD priceEarningsRatio=WORD	NEWLINE		//	KOSPI : 기계 WICS : 기계 현금배당수익률 7.65% 
	WORD TAB currentPrice=WORD WORD WORD WORD WORD TAB		NEWLINE		//	주가/전일대비/수익률 	 3,120원 / -5원 / -0.16%
	WORD TAB volumeOfListedShares=NUMBER TAB				NEWLINE		//	상장주식수 	 46,482,148 	 
{
	StockParserService.naverStockDetail(20231127
		, $code.text
		, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
		, $ckospi.text, $cwics.text
		, null, null
		, $currentPrice.text
		, $volumeOfListedShares.text
		, $priceEarningsRatio.text
	);
};
naverStockDetailEtf:
	symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* code=NUMBER		NEWLINE		//	영풍제지 006740 
	WORD etfckospi=WORD etfcwics=WORD											NEWLINE		//	분류: 해외주식형, 테마 
	WORD TAB currentPrice=WORD WORD WORD WORD WORD TAB		NEWLINE		//	주가/전일대비/수익률 	 3,120원 / -5원 / -0.16%
	WORD TAB volumeOfListedShares=NUMBER TAB				NEWLINE		//	상장주식수 	 46,482,148 	 
{
	StockParserService.naverStockDetail(20231127
		, $code.text
		, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
		, null, null
		, $etfckospi.text, $etfcwics.text
		, $currentPrice.text
		, $volumeOfListedShares.text
		, null
	);
};

// 최근 분배금 나온 국내ETF 리스트 https://search-etf.com/divi-list.html
searchEtfCom:
	line+

	WORD+ STRING WORD					NEWLINE		//	아래는 현재 약 800여개의 ETF종목 중 가장 최근 분배금 현황 리스트를 나타낸 것입니다. "종목코드"를 누르면 각 종목의 좀 더 자세한 내용을 확인 할 수 있습니다. "빨강글자"는 "월배당ETF" 입니다. 
	WORD WORD WORD WORD WORD WORD		NEWLINE		//	순서 종목코드 종목명 분배금 기준일 실제분배일 

	searchEtfComItem+
	
	eof
;
searchEtfComItem:
	NUMBER code=word symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* dividend=NUMBER base=DATE pay=DATE		NEWLINE		//	1 448100 WOORI 200 40 2023-10-31 2023-11-02 
{
	StockParserService.searchEtfComItem(20231127
		, $code.text
		, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
		, $base.text, $pay.text, $dividend.text
	);
};


// KSD증권정보포털(SEIBro) > 주식 > 배당정보 > 배당내역전체겁색 > 조회
seibroDividend:
	line+

	WORD WORD WORD WORD WORD WORD		NEWLINE		//	일반 차등 현금 주식 현금 주식 
	seibroDividendItem+

	eof
;
seibroDividendItem:
	base=DATE			NEWLINE		//	2022/12/15 
	(pay=DATE			NEWLINE)?	//	2022/12/29 
	code=word			NEWLINE		//	152550 
	symbol=word word*	NEWLINE		//	한국투자ANKOR유전해외자원개발특별자산투자회사1호(지분증권) 
	WORD				NEWLINE		//	유가증권시장 
	WORD				NEWLINE		//	현금배당 
	WORD				NEWLINE		//	한국예탁결제원 
	WORD				NEWLINE		//	보통주 
	dividend=NUMBER		NEWLINE		//	1,670 
	NUMBER				NEWLINE		//	56.21 
	NUMBER				NEWLINE		//	0.00 
	NUMBER				NEWLINE		//	0 
	NUMBER				NEWLINE		//	12 
{
	StockParserService.seibroDividendItem(20231127
		, $base.text , $pay.text
		, $code.text , $symbol.text
		, $dividend.text
	);
};



//	네이버 > 증권홈 > 국내증시 > 배당
naverStock:
	line+

	WORD												NEWLINE		//	배당 
	WORD+ TAB WORD+ TAB WORD+ TAB (WORD+ TAB)+			NEWLINE		//	종목명 	 현재가 	 기준월 	 배당금 	 수익률 (%) 	 배당성향 (%) 	 ROE (%) 	 PER (배) 	 PBR (배) 	 과거 3년 배당금 	 
	WORD TAB WORD TAB WORD TAB							NEWLINE		//	1년전 	 2년전 	 3년전 	 
	TAB TAB TAB TAB+									NEWLINE		//		 	 	 	 	 	 	 	 	 	 	 	 
	naverStockItem+
	WORD WORD WORD WORD+								NEWLINE		//	* 최근 결산연도 기준이며 배당금은 중간배당을 포함한 총배당금입니다. 

	eof
;
naverStockItem:
(
	TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB										NEWLINE		//		 	 	 	 	 	 	 	 	 	 	 	 
) | (
		href=word
		title=word title1=word? title2=word? title3=word? title4=word? title5=word? title6=word? title7=word* TAB
		currentPrice=NUMBER TAB
		baseMonth=NUMBER TAB dividend=NUMBER TAB priceEarningsRatio=NUMBER TAB dividendPayoutRatio=word TAB
		roe=word TAB per=word TAB pbr=word TAB
		dividend1YAgo=word TAB dividend2YAgo=word TAB dividend3YAgo=word TAB		NEWLINE
			//	종목명 	 현재가 	 기준월 	 배당금 	 수익률 (%)
			//	 	 배당성향 (%) 	 ROE (%) 	 PER (배) 	 PBR (배)
			//	 	 과거 3년 배당금
			//	DGB금융지주 	 7,740 	 22.12 	 650 	 8.40 	 27.38 	 7.38 	 2.94 	 0.22 	 630 	 390 	 410 	 
			
			//	https://finance.naver.com/item/main.naver?code=332370 아이디피 	3,440	22.12	150	4.36	19.27	22.51	5.83	1.19	75	40	0	
	{
		StockParserService.naverStockItem(20231127
				, $href.text
				, $title.text, $title1.text, $title2.text, $title3.text, $title4.text, $title5.text, $title6.text, $title7.text
				, $currentPrice.text
				, $baseMonth.text, $dividend.text, $priceEarningsRatio.text, $dividendPayoutRatio.text
				, $roe.text, $per.text, $pbr.text
				, $dividend1YAgo.text, $dividend2YAgo.text, $dividend3YAgo.text
		);
	}
);
