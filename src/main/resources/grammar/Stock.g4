grammar Stock;

import	Common;

@header {
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.stock.service.ParserService;
}

@members	{
	private final Logger log = LoggerFactory.getLogger(getClass());
}

stockDocument
:	crawlDividendHistoryCompanyThread	// KSD증권정보포털(SEIBro) > 주식 > 배당정보 > 배당내역전체겁색 > 조회
|	crawlDividendHistoryEtfThread	// KSD증권정보포털(SEIBro) > ETF > ???
|	crawlItemDividendTopCompany		// KSD증권정보포털(SEIBro) > 주식 > 배당정보 > 배당순위
|	crawlItemEtf					// KSD증권정보포털(SEIBro) > ETF > 종목발행현황
|	crawlItemDetailCompanyThread	// KSD증권정보포털(SEIBro) > 주식 > 종목별상세정보 > 종목종합내역 (KSD증권정보포털(SEIBro) > 기업 > 기업기본정보와 동일)
|	crawlEtfDetailThread			// KSD증권정보포털(SEIBro) > ETF > ETF종합정보 > 종목상세
|	crawlPriceCompany				// KSD증권정보포털(SEIBro) > 주식 > 종목별상세정보 > 일자별시세
|	crawlPriceEtf					// KSD 증권정보포털 SEIBro > ETF > ETF종합정보 > 기준가추이
|	crawlPriceKrx					// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 개별종목 시세 추이
|	companyAllPrice					// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목시세 > 전종목 시세
|	etcAllPrice						// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 전종목 시세
;


// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 전종목 시세
etcAllPrice:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 ETF > 전종목 시세 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020101 
	(
		WORD TAB DATE TAB										NEWLINE		//	ETF 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	ETF 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	ETF 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	ETF 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	ETF 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	ETF 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	ETF 	 2024-01-09 	 
		WORD TAB DATE TAB WORD									NEWLINE		//	ETF 	 2024-01-09 	 종목코드종목명종가대비등락률순자산가치(NAV)시가고가저가거래량거래대금시가총액순자산총액상장좌수지수명종가대비등락률 
		WORD TAB DATE TAB										NEWLINE		//	ETF 	 2024-01-09 	 
		((
			WORD TAB DATE TAB code=NUMBER						NEWLINE		//	ETF 	 2024-01-09 	 305080 
			WORD TAB DATE TAB symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*		NEWLINE		//	ETF 	 2024-01-09 	 TIGER 미국채10년선물 
			WORD TAB DATE TAB closing=NUMBER					NEWLINE		//	ETF 	 2024-01-09 	 11,580 
			WORD TAB DATE TAB NUMBER							NEWLINE		//	ETF 	 2024-01-09 	 20 
			WORD TAB DATE TAB NUMBER							NEWLINE		//	ETF 	 2024-01-09 	 +0.17 
			WORD TAB DATE TAB NUMBER							NEWLINE		//	ETF 	 2024-01-09 	 11,588.94 
			WORD TAB DATE TAB market=NUMBER						NEWLINE		//	ETF 	 2024-01-09 	 11,560 
			WORD TAB DATE TAB high=NUMBER						NEWLINE		//	ETF 	 2024-01-09 	 11,590 
			WORD TAB DATE TAB low=NUMBER						NEWLINE		//	ETF 	 2024-01-09 	 11,525 
			WORD TAB DATE TAB volume=NUMBER						NEWLINE		//	ETF 	 2024-01-09 	 60,629 
			WORD TAB DATE TAB NUMBER							NEWLINE		//	ETF 	 2024-01-09 	 700,419,695 
			WORD TAB DATE TAB NUMBER							NEWLINE		//	ETF 	 2024-01-09 	 119,274,000,000 
			WORD TAB DATE TAB NUMBER							NEWLINE		//	ETF 	 2024-01-09 	 0 
			WORD TAB DATE TAB volumeOfListedShares=NUMBER		NEWLINE		//	ETF 	 2024-01-09 	 10,300,000 
			WORD TAB DATE TAB word+								NEWLINE		//	ETF 	 2024-01-09 	 S&P 10-Year U.S. Treasury Note Futures(ER) 
			WORD TAB DATE TAB word								NEWLINE		//	ETF 	 2024-01-09 	 192.52 
			WORD TAB DATE TAB word								NEWLINE		//	ETF 	 2024-01-09 	 0.00 
			WORD TAB DATE TAB word								NEWLINE		//	ETF 	 2024-01-09 	 0.00 
			WORD TAB base=DATE TAB								NEWLINE		//	ETF 	 2024-01-09 	 
			{
				ParserService.crawlPriceCompanyEtf(20240105
					, $code.text, $symbol.text
					, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
				);
				ParserService.crawlEtfDetailThread(20240105, $code.text
					, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
					, null, null, null, null, null, null, null, null
					, null
					, null
					, $volumeOfListedShares.text
				);
			}
		) | (
			WORD TAB DATE TAB NUMBER symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* closing=NUMBER	NEWLINE		//	ETF 	 2024-01-09 	 078935 GS우 KOSPI 34,250 
			WORD TAB base=DATE TAB NUMBER NUMBER NUMBER NUMBER NUMBER NUMBER NUMBER		NEWLINE		//	ETF 	 2024-01-09 	 34,300 34,500 34,100 1,993 68,209,450 61,130,290,500 1,784,826 
			{
				ParserService.crawlPriceCompanyEtf(20240105
					, $code.text, $symbol.text
					, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
				);
			}
		))+

		WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
	)+ 
	KEYWORD TAB WORD TAB WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 ETF > 전종목 시세 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020101 
;


// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목시세 > 전종목 시세
companyAllPrice:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 주식 > 종목시세 > 전종목 시세 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020101 
	(
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB								NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB							NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB								NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB							NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB							NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB							NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB								NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB							NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB								NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB TAB						NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 	 
		WORD TAB DATE TAB TAB TAB TAB							NEWLINE		//	COMPANY 	 2024-01-09 	 	 	 	 
		WORD TAB DATE TAB WORD									NEWLINE		//	COMPANY 	 2024-01-09 	 종목코드종목명시장구분소속부종가대비등락률시가고가저가거래량거래대금시가총액상장주식수 
		WORD TAB DATE TAB										NEWLINE		//	COMPANY 	 2024-01-09 	 
		((
			WORD TAB DATE TAB code=word							NEWLINE		//	COMPANY 	 2024-01-09 	 00104K 
			WORD TAB DATE TAB symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*	NEWLINE		//	COMPANY 	 2024-01-09 	 3S 
			WORD TAB DATE TAB type=word word*					NEWLINE		//	COMPANY 	 2024-01-09 	 KOSDAQ GLOBAL 
			WORD TAB DATE TAB WORD?								NEWLINE		//	COMPANY 	 2024-01-09 	 중견기업부 
			WORD TAB DATE TAB closing=NUMBER					NEWLINE		//	COMPANY 	 2024-01-09 	 3,740 
			WORD TAB DATE TAB NUMBER							NEWLINE		//	COMPANY 	 2024-01-09 	 215 
			WORD TAB DATE TAB NUMBER							NEWLINE		//	COMPANY 	 2024-01-09 	 +6.10 
			WORD TAB DATE TAB market=NUMBER						NEWLINE		//	COMPANY 	 2024-01-09 	 3,650 
			WORD TAB DATE TAB high=NUMBER						NEWLINE		//	COMPANY 	 2024-01-09 	 3,740 
			WORD TAB DATE TAB low=NUMBER						NEWLINE		//	COMPANY 	 2024-01-09 	 3,470 
			WORD TAB DATE TAB volume=NUMBER						NEWLINE		//	COMPANY 	 2024-01-09 	 3,336,537 
			WORD TAB DATE TAB NUMBER							NEWLINE		//	COMPANY 	 2024-01-09 	 12,249,855,340 
			WORD TAB DATE TAB NUMBER							NEWLINE		//	COMPANY 	 2024-01-09 	 181,527,041,080 
			WORD TAB DATE TAB volumeOfListedShares=NUMBER		NEWLINE		//	COMPANY 	 2024-01-09 	 48,536,642 
			WORD TAB base=DATE TAB								NEWLINE		//	COMPANY 	 2024-01-09 	 
			{
				ParserService.crawlPriceCompanyEtf(20240105
					, $code.text, $symbol.text
					, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
				);
				ParserService.crawlItemDetailCompanyThread(20240105
					, $code.text, $type.text
					, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
					, null, null
					, $volumeOfListedShares.text
					, null
				);
			}
		) | (
			WORD TAB DATE TAB NUMBER symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* closing=NUMBER	NEWLINE		//	ETF 	 2024-01-09 	 078935 GS우 KOSPI 34,250 
			WORD TAB base=DATE TAB NUMBER NUMBER NUMBER NUMBER NUMBER NUMBER NUMBER		NEWLINE		//	ETF 	 2024-01-09 	 34,300 34,500 34,100 1,993 68,209,450 61,130,290,500 1,784,826 
			{
				ParserService.crawlPriceCompanyEtf(20240105
					, $code.text, $symbol.text
					, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
				);
			}
		))+

		WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
	)+ 
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 주식 > 종목시세 > 전종목 시세 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020101 
;


// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 개별종목 시세 추이
// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목시세 > 개별종목 시세 추이
crawlPriceKrx:
	KEYWORD TAB WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 주가일별시세 	 CrawlPriceThread 	 http://data.krx.co.kr/
	(
		(
			NUMBER TAB WORD WORD TAB										NEWLINE		//	253250 	 데이터가 없습니다.
		) | (((
				WORD TAB NUMBER TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB							NEWLINE
					//	ETF 	 175330 	 일자 	 종가 	 대비 	 등락률 	 시가 	 고가 	 저가 	 거래량 	 거래대금 	 시가총액 	 상장주식수 	 
				(
					WORD TAB code=NUMBER TAB base=DATE TAB closing=NUMBER TAB NUMBER TAB NUMBER TAB market=NUMBER TAB high=NUMBER TAB low=NUMBER TAB volume=NUMBER TAB NUMBER TAB NUMBER TAB NUMBER TAB		NEWLINE
							//	ETF 	 175330 	 2022/06/20 	 7,830 	 110 	 -1.39 	 7,980 	 8,000 	 7,720 	 225,863 	 1,768,097,000 	 1,542,376,060,020 	 196,982,894 	 
					{
						ParserService.crawlPriceCompanyEtf(20240105
							, $code.text, $symbol.text
							, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
						);
					}
				)+
			) | (
				WORD TAB NUMBER TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB	NEWLINE
					//	ETF 	 441680 	 일자 	 종가 	 대비 	 등락률 	 순자산가치(NAV) 	 시가 	 고가 	 저가 	 거래량 	 거래대금 	 시가총액 	 순자산총액 	 상장좌수 	 지수명 	 종가 	 대비 	 등락률
				(
					WORD TAB code=NUMBER TAB base=DATE TAB closing=NUMBER TAB NUMBER TAB NUMBER TAB NUMBER TAB market=NUMBER TAB high=NUMBER TAB low=NUMBER TAB volume=NUMBER TAB NUMBER TAB NUMBER TAB NUMBER TAB NUMBER TAB
						symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* TAB
						NUMBER TAB NUMBER TAB NUMBER TAB		NEWLINE
							//	ETF 	 441680 	 2022/11/22 	 9,710 	 10 	 +0.10 	 9,769.51 	 9,725 	 9,750 	 9,680 	 36,868 	 357,580,550 	 30,101,000,000 	 30,285,495,972 	 3,100,000 	 Cboe Nasdaq-100 BuyWrite V2 지수 (Total Return) 	 747.74 	 6.63 	 +0.89 	 
					{
						ParserService.crawlPriceCompanyEtf(20240105
							, $code.text, $symbol.text
							, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
						);
					}
				)+
			))
		)+
		WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
	)+ 
	KEYWORD TAB WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 주가일별시세 	 CrawlPriceThread 	 http://data.krx.co.kr/ 
;

// KSD증권정보포털(SEIBro) > ETF > 종목발행현황
crawlItemEtf:
	KEYWORD TAB WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 crawlItemEtf 	 ETF 종목 발행현황 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06025V.xml&menuNo=174 
	(
		WORD TAB										NEWLINE		//	ETF 	 
		WORD TAB WORD TAB WORD TAB TAB WORD TAB WORD TAB WORD TAB WORD		NEWLINE		//	ETF 	 선택 	 종목명 	 	 유형 	 순자산 	 종가 	 거래량 
		WORD TAB TAB TAB WORD TAB TAB TAB TAB TAB TAB WORD TAB WORD TAB		NEWLINE		//	(3개월평균) 	 	 	 수익률(%) 	 	 	 	 	 	 총보수(%) 	 운용사 	 
		(
			type=WORD TAB TAB
			symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* TAB
			code=NUMBER TAB
			category=word category1=word? category2=word? category3=word? category4=word? category5=word? category6=word? category7=word* TAB
			asset=NUMBER TAB
			closing=NUMBER TAB
			amount=NUMBER TAB
			TAB TAB
			priceEarningsRatio=NUMBER? TAB
			TAB TAB TAB TAB TAB
			fee=NUMBER? TAB
			operator=WORD TAB		NEWLINE
					//	ETF 	 	 TIGER CD금리투자KIS(합성) 	 357870 	 채권/단기자금 	 66,923 	 53,580 	 232,520 	 	 	 0.91 	 	 	 	 	 	 0.03 	 미래에셋자산운용 	 
			{
				ParserService.crawlEtfDetailThread(20231217
					, $code.text
					, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
					, $category.text, $category1.text, $category2.text, $category3.text, $category4.text, $category5.text, $category6.text, $category7.text
					, null
					, $fee.text
					, null
				);
			}
		)+
		WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 crawlItemEtf 	 ETF 종목 발행현황 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06025V.xml&menuNo=174 
;


// KSD 증권정보포털 SEIBro > ETF > ETF종합정보 > 기준가추이
crawlPriceEtf:
	KEYWORD TAB WORD WORD TAB WORD TAB WORD TAB WORD								NEWLINE		//	KEYWORD 	 ETF 일별시세 	 CrawlPriceEtfThread 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06033V.xml&menuNo=182 
	(
		code=NUMBER TAB word+														NEWLINE		//	143860 	 TIGER 헬스케어
		(
			KEYWORD TAB symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*					NEWLINE 
			KEYWORD TAB category=word category1=word? category2=word? category3=word? category4=word? category5=word? category6=word? category7=word*	NEWLINE 
			KEYWORD TAB ea=NUMBER																														NEWLINE 
			{
				ParserService.crawlEtfDetailThread(20231217
					, $code.text
					, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
					, $category.text, $category1.text, $category2.text, $category3.text, $category4.text, $category5.text, $category6.text, $category7.text
					, null
					, null
					, $ea.text
				);
			}
		) 
		(
			WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB		NEWLINE		//	일자 	 종가 	 전일비 	 시가 	 고가 	 저가 	 거래량 	 거래대금 	 
			((
				TAB TAB TAB TAB TAB TAB TAB TAB											NEWLINE		//		 	 	 	 	 	 	 	 
			) | (
				base=DATE? TAB closing=NUMBER? TAB NUMBER? TAB market=NUMBER? TAB high=NUMBER? TAB low=NUMBER TAB volume=NUMBER TAB NUMBER? TAB		NEWLINE
						//	2023/12/15 	 32,300 	 320 	 32,165 	 32,320 	 32,070 	 121,115 	 3,900 	 
				{
					ParserService.crawlPriceCompanyEtf(20231217
						, $code.text, $symbol.text
						, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
					);
				}
			))+
		)+
		WORD TAB WORD TAB DATE							NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD WORD TAB WORD TAB WORD TAB WORD	NEWLINE		//	KEYWORD 	 ETF 일별시세 	 CrawlPriceEtfThread 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06033V.xml&menuNo=182 
;


// KSD증권정보포털(SEIBro) > 주식 > 종목별상세정보 > 일자별시세
crawlPriceCompany:
KEYWORD TAB WORD WORD TAB WORD TAB WORD TAB WORD						NEWLINE		//	KEYWORD 	 주식 일자별시세 	 CrawlCompanyPriceThread 	 URL 	 https://finance.naver.com/item/sise.naver?code= 
(
	code=NUMBER TAB symbol=word+										NEWLINE		//	072870 	 메가스터디 
	(
		WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB		NEWLINE		//	일자 	 종가 	 전일비 	 시가 	 고가 	 저가 	 거래량 	 
		((
			TAB TAB TAB TAB TAB TAB TAB										NEWLINE		//		 	 	 	 	 	 	 
		) | (
			base=DATE TAB closing=NUMBER TAB NUMBER TAB market=NUMBER TAB high=NUMBER TAB low=NUMBER TAB volume=NUMBER TAB		NEWLINE
					//	2023/12/18 	 11,430 	 30 	 11,400 	 11,500 	 11,370 	 16,124 
			{
				ParserService.crawlPriceCompanyEtf(20231217
					, $code.text, $symbol.text
					, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
				);
			}
		))+
	)+
	WORD TAB WORD TAB DATE												NEWLINE		//	andold 	 since 	 2023-11-27 
)+
KEYWORD TAB WORD WORD TAB WORD TAB WORD TAB WORD						NEWLINE		//	KEYWORD 	 주식 일자별시세 	 CrawlCompanyPriceThread 	 URL 	 https://finance.naver.com/item/sise.naver?code= 
;


// KSD증권정보포털(SEIBro) > 기업 > 기업기본정보
crawlItemDetailCompanyThread:
KEYWORD TAB WORD WORD TAB WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 주식 상세 	 CrawlCompanyDetailThread 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/stock/BIP_CNTS02006V.xml&menuNo=44 
(
	KEYWORD TAB code=NUMBER TAB type=WORD TAB symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*	NEWLINE
			//	KEYWORD 	 093920 	 서원인텍 

	KEYWORD TAB category=STRING									NEWLINE		//	KEYWORD 	 "부동산업" 
	KEYWORD TAB fics=STRING										NEWLINE		//	KEYWORD 	 "> >" 
	KEYWORD TAB ea=NUMBER WORD									NEWLINE		//	KEYWORD 	 18,600,000 주 
	KEYWORD TAB ipo=DATE										NEWLINE		//	KEYWORD 	 2007/12/20 
	WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27
	{
		ParserService.crawlItemDetailCompanyThread(20231217
			, $code.text, $type.text
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
crawlItemDividendTopCompany:
KEYWORD TAB WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 crawlItemDividendTopCompany 	 주식 상위 배당 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01042V.xml&menuNo=286 
(
	WORD TAB										NEWLINE		//	KOSPI 	 
	WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB		NEWLINE		//	KOSPI 	 순위 	 종목코드 	 종목명 	 주식종류 	 시장구분 	 주당배당금 	 시가배당율 	 액면가배당율 	 액면가 	 결산월 	 
	(
		type=WORD TAB NUMBER TAB code=NUMBER? TAB word+ TAB WORD TAB WORD TAB NUMBER TAB NUMBER TAB NUMBER TAB NUMBER TAB NUMBER TAB		NEWLINE
				//	5 	 175330 	 JB금융지주 	 보통주 	 유가증권시장 	 835 	 10.10 	 16.70 	 5,000 	 12 	 
		{
			ParserService.crawlItemDividendTopCompany(20231217
				, $code.text
				, $type.text
			);
		}
	)+ 	 	 
	WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
)+
KEYWORD TAB WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 crawlItemDividendTopCompany 	 주식 상위 배당 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01042V.xml&menuNo=286 
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
			ParserService.crawlEtfDetailThread(20231217
				, $code.text
				, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
				, $category.text, $category1.text, $category2.text, $category3.text, $category4.text, $category5.text, $category6.text, $category7.text
				, $ipo.text
				, $fee.text
				, null
			);
		}
	)+
	KEYWORD TAB WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 ETF 상세 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS906032V.xml&menuNo=514 
;


crawlDividendHistoryEtfThread:
	KEYWORD TAB WORD WORD WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 ETF 배당금 내역 	 KSD 증권정보포털 SEIBro 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06030V.xml&menuNo=179 
	(
		KEYWORD TAB code=NUMBER										NEWLINE			//	KEYWORD 	 166400 
		WORD TAB WORD? TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB		NEWLINE		//	종목명 	 	 운용사 	 유형 	 지급기준일 	 실지급일 	 배당구분 	 주당분배금 	 결산과표기준가 	 시가대비분배율 	 
		(
			(
				TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB						NEWLINE		//		 	 	 	 	 	 	 	 	 	 
			) | (
				symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* TAB
				WORD? TAB WORD TAB word* TAB base=DATE? TAB pay=DATE TAB WORD? TAB dividend=NUMBER TAB price=NUMBER? TAB ratio=NUMBER? TAB		NEWLINE
						//	TIGER 200커버드콜5%OTM 	 	 미래에셋자산운용 	 파생상품/구조화 	 2023/11/30 	 2023/12/04 	 이익분배 	 54 	 11,308.35 	 0.45 	 
				{
					ParserService.crawlDividendHistoryEtfThread(20231127
						, $code.text
						, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
						, $base.text, $pay.text
						, $dividend.text
						, $price.text
						, $ratio.text
					);
				}
			)
		)+
		WORD TAB WORD TAB DATE											NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD WORD WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 ETF 배당금 내역 	 KSD 증권정보포털 SEIBro 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06030V.xml&menuNo=179 
;


// KSD증권정보포털(SEIBro) > 주식 > 배당정보 > 배당내역전체겁색 > 조회
crawlDividendHistoryCompanyThread:
	KEYWORD TAB WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 CrawlDividendHistoryCompanyThread 	 주식(기업) 배당금 내역 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01041V.xml&menuNo=285 
	(
		(
			WORD TAB WORD								NEWLINE		//	배정기준일 	 현금배당 
			WORD TAB WORD								NEWLINE		//	지급일 	 주식 
			WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB		NEWLINE		//	유통(교부)일 	 종목코드 	 종목명 	 시장구분 	 배당구분 	 명의개서대리인 	 주식종류 	 주당배당금 	 주당배당률(일반) 	 주당배당률(차등) 	 액면가 	 결산월 	 
			WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB															NEWLINE		//	일반 	 차등 	 현금 	 주식 	 현금 	 주식 
			(
				(
					TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB											NEWLINE		//		 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 
				) | (
					base=DATE TAB pay=DATE? TAB DATE? TAB code=NUMBER TAB symbol=word+ TAB WORD TAB WORD TAB WORD TAB WORD TAB dividend=NUMBER TAB NUMBER? TAB NUMBER TAB NUMBER TAB NUMBER? TAB TAB NUMBER TAB NUMBER TAB		NEWLINE
							//	2022/12/31 	 2023/04/21 	 	 000850 	 화천기공 	 유가증권시장 	 현금배당 	 국민은행 	 보통주 	 2,500 	 	 50.00 	 0.00 	 	 	 5,000 	 12 	 
					{
						ParserService.crawlDividendHistoryCompanyThread(20231127
							, $base.text , $pay.text
							, $code.text , $symbol.text
							, $dividend.text
						);
					}
				)
			)+
		)+
		WORD TAB WORD TAB DATE						NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 CrawlDividendHistoryCompanyThread 	 주식(기업) 배당금 내역 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01041V.xml&menuNo=285 
;
