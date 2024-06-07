grammar Seibro;

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
|	crawlItemDividendTopCompany		// KSD증권정보포털(SEIBro) > 주식 > 배당정보 > 배당순위
|	crawlItemDetailCompanyThread	// KSD증권정보포털(SEIBro) > 주식 > 종목별상세정보 > 종목종합내역 (KSD증권정보포털(SEIBro) > 기업 > 기업기본정보와 동일)
|	crawlPriceCompany				// KSD증권정보포털(SEIBro) > 주식 > 종목별상세정보 > 일자별시세

|	seibroItemInfoCompany			// SEIBro 주식 > 종목별상세정보 > 종목종합내역
|	seibroPriceCompany				// SEIBro 주식 > 종목별상세정보 > 일자별시세
|	seibroPriceCurrentCompany		// SEIBro 주식 > 종목전체검색 > 주식종목전체검색

|	naverPriceCurrentEtf			// SEIBro 주식 > 종목전체검색 > 주식종목전체검색
;



// Naver 증권 > 국내증시 > 주요시세정보 > ETF
naverPriceCurrentEtf:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 Naver 	 주식 > 종목전체검색 > 주식종목전체검색 	 https://finance.naver.com/sise/etf.naver 
	(
		DATE TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB	NEWLINE
				//	종목명 	 https://finance.naver.com/sise/etf.naver# 	 현재가 	 https://finance.naver.com/sise/etf.naver# 	 전일비 	 https://finance.naver.com/sise/etf.naver# 	 등락률 	 https://finance.naver.com/sise/etf.naver# 	 NAV 	 https://finance.naver.com/sise/etf.naver# 	 3개월수익률 	 https://finance.naver.com/sise/etf.naver# 	 거래량 	 https://finance.naver.com/sise/etf.naver# 	 거래대금(백만) 	 https://finance.naver.com/sise/etf.naver# 	 시가총액(억) 	 
		((
			DATE TAB TAB										NEWLINE		//		 
		) | (
			base=DATE TAB code=word TAB word+ TAB closing=NUMBER TAB NUMBER TAB WORD TAB NUMBER TAB WORD TAB volume=NUMBER TAB NUMBER TAB NUMBER TAB							NEWLINE
					//	407300 	 HANARO Fn골프테마 	 5,825 	 50 	 -0.85% 	 5,830 	 -1.84% 	 468 	 2 	 38 
			{
				ParserService.price(20240112
					, $code.text
					, $base.text, $closing.text, null, null, null, $volume.text
				);
			}
		))*
		WORD TAB WORD TAB DATE									NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 Naver 	 주식 > 종목전체검색 > 주식종목전체검색 	 https://finance.naver.com/sise/etf.naver 
;


// SEIBro 주식 > 종목전체검색 > 주식종목전체검색
seibroPriceCurrentCompany:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD TAB WORD			NEWLINE		//	KEYWORD 	 SEIBro 	 주식 > 종목전체검색 > 주식종목전체검색 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/stock/BIP_CNTS02004V.xml&menuNo=41 
	(
		WORD WORD DATE TAB WORD WORD WORD WORD WORD WORD WORD WORD	NEWLINE		//	기준일 : 2024/01/15 	 종목코드 종목명 시장구분 종가 거래량 시가 고가 저가 
		(
			WORD WORD base=DATE TAB code=word						NEWLINE		//	기준일 : 2024/01/15 	 011785 
			WORD WORD DATE TAB word+								NEWLINE		//	기준일 : 2024/01/15 	 금호석유화학1우 
			WORD WORD DATE TAB WORD									NEWLINE		//	기준일 : 2024/01/15 	 유가증권 
			WORD WORD DATE TAB closing=NUMBER						NEWLINE		//	기준일 : 2024/01/15 	 60,000 
			WORD WORD DATE TAB volume=NUMBER						NEWLINE		//	기준일 : 2024/01/15 	 6,505 
			WORD WORD DATE TAB market=NUMBER						NEWLINE		//	기준일 : 2024/01/15 	 59,900 
			WORD WORD DATE TAB high=NUMBER							NEWLINE		//	기준일 : 2024/01/15 	 60,200 
			WORD WORD DATE TAB low=NUMBER							NEWLINE		//	기준일 : 2024/01/15 	 59,700 
			{
				ParserService.price(20240112
					, $code.text
					, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
				);
			}
		)*
		WORD TAB WORD TAB DATE									NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 SEIBro 	 주식 > 종목전체검색 > 주식종목전체검색 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/stock/BIP_CNTS02004V.xml&menuNo=41 
;


// SEIBro 주식 > 종목별상세정보 > 일자별시세 TODO
seibroPriceCompany:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 SEIBro 	 주식 > 종목별상세정보 > 일자별시세 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/stock/BIP_CNTS02007V.xml&menuNo=45 
	(
		word TAB										NEWLINE		//	175330 	 
		word TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB		NEWLINE		//	175330 	 일자 	 종가 	 전일비 	 시가 	 고가 	 저가 	 거래량 	 
		((
			word TAB TAB TAB TAB TAB TAB TAB TAB										NEWLINE		//	136490 	 	 	 	 	 	 	 	 
		) | (
			code=word TAB base=DATE TAB closing=NUMBER TAB NUMBER TAB market=NUMBER TAB high=NUMBER TAB low=NUMBER TAB volume=NUMBER TAB		NEWLINE
					//	175330 	 2024/01/12 	 10,700 	 -10 	 10,720 	 10,840 	 10,630 	 232,427 	 
			{
				ParserService.price(20240112
					, $code.text
					, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
				);
			}
		))+
		WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 SEIBro 	 주식 > 종목별상세정보 > 일자별시세 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/stock/BIP_CNTS02007V.xml&menuNo=45 
;


// SEIBro SEIBro 주식 > 종목별상세정보 > 종목종합내역
seibroItemInfoCompany:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 SEIBro 	 주식 > 종목별상세정보 > 종목종합내역 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/stock/BIP_CNTS02006V.xml&menuNo=44 
	(
		(
			KEYWORD TAB code=word TAB type=WORD TAB
						symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*	NEWLINE		//	KEYWORD 	 175330 	 유가증권 	 JB금융지주(175330) 
			KEYWORD TAB category=STRING							NEWLINE		//	KEYWORD 	 "금융업" 
			KEYWORD TAB fics=STRING								NEWLINE		//	KEYWORD 	 "금융 > 은행 > 상업은행" 
			KEYWORD TAB volumeOfListedShares=NUMBER WORD		NEWLINE		//	KEYWORD 	 196,982,894 주 
			KEYWORD TAB ipoOpen=DATE							NEWLINE		//	KEYWORD 	 2013/07/18 
			KEYWORD TAB ipoClose=DATE?							NEWLINE		//	KEYWORD 	 2013/07/18 
			{
				ParserService.item(20240112
					, $code.text
					, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
					, $category.text, $fics.text, null, null, null, null, null, null
					, $type.text
					, $ipoOpen.text
					, $ipoClose.text
					, $volumeOfListedShares.text
					, null
				);
			}
		)
		WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 SEIBro 	 주식 > 종목별상세정보 > 종목종합내역 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/stock/BIP_CNTS02006V.xml&menuNo=44 
;


// KSD증권정보포털(SEIBro) > 주식 > 종목별상세정보 > 일자별시세
crawlPriceCompany:
KEYWORD TAB WORD WORD TAB WORD TAB WORD TAB WORD					NEWLINE		//	KEYWORD 	 주식 일자별시세 	 CrawlCompanyPriceThread 	 URL 	 https://finance.naver.com/item/sise.naver?code= 
(
	code=word TAB symbol=word+										NEWLINE		//	072870 	 메가스터디 
	(
		WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB		NEWLINE		//	일자 	 종가 	 전일비 	 시가 	 고가 	 저가 	 거래량 	 
		((
			TAB TAB TAB TAB TAB TAB TAB										NEWLINE		//		 	 	 	 	 	 	 
		) | (
			base=DATE TAB closing=NUMBER TAB NUMBER TAB market=NUMBER TAB high=NUMBER TAB low=NUMBER TAB volume=NUMBER TAB		NEWLINE
					//	2023/12/18 	 11,430 	 30 	 11,400 	 11,500 	 11,370 	 16,124 
			{
				ParserService.price(20240112
					, $code.text
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
	KEYWORD TAB code=word TAB type=WORD TAB symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*	NEWLINE
			//	KEYWORD 	 093920 	 서원인텍 

	KEYWORD TAB category=STRING									NEWLINE		//	KEYWORD 	 "부동산업" 
	KEYWORD TAB fics=STRING										NEWLINE		//	KEYWORD 	 "> >" 
	KEYWORD TAB ea=NUMBER WORD									NEWLINE		//	KEYWORD 	 18,600,000 주 
	KEYWORD TAB ipo=DATE										NEWLINE		//	KEYWORD 	 2007/12/20 
	WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27
	{
		ParserService.item(20240112
			, $code.text
			, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
			, $category.text, $fics.text, null, null, null, null, null, null
			, null
			, $ipo.text
			, null
			, $ea.text
			, null
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
		type=WORD TAB NUMBER TAB code=word? TAB word+ TAB WORD TAB WORD TAB NUMBER TAB NUMBER TAB NUMBER TAB NUMBER TAB NUMBER TAB		NEWLINE
				//	5 	 175330 	 JB금융지주 	 보통주 	 유가증권시장 	 835 	 10.10 	 16.70 	 5,000 	 12 	 
		{
			ParserService.item(20240112
				, $code.text
				, null, null, null, null, null, null, null, null
				, null, null, null, null, null, null, null, null
				, $type.text
				, null
				, null
				, null
				, null
			);
		}
	)+ 	 	 
	WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
)+
KEYWORD TAB WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 crawlItemDividendTopCompany 	 주식 상위 배당 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01042V.xml&menuNo=286 
;


// KSD증권정보포털(SEIBro) > 주식 > 배당정보 > 배당내역전체겁색 > 조회
crawlDividendHistoryCompanyThread:
	KEYWORD TAB WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 CrawlDividendHistoryCompanyThread 	 주식(기업) 배당금 내역 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01041V.xml&menuNo=285 
	(
		(
			WORD TAB WORD WORD TAB WORD WORD TAB WORD WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB TAB TAB WORD TAB WORD TAB		NEWLINE
					//	배정기준일 	 현금배당 지급일 	 주식 유통(교부)일 	 현물배당 지급일 	 종목코드 	 종목명 	 시장구분 	 배당구분 	 명의개서대리인 	 주식종류 	 주당배당금 	 주당배당률(일반) 	 주당배당률(차등) 	 	 	 액면가 	 결산월 	 
			WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB TAB TAB										NEWLINE		//	일반 	 차등 	 현금 	 주식 	 현금 	 주식 	 	 	 
			(
				(
					TAB+										NEWLINE		//		 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 
				) | (
					base=DATE TAB pay=DATE? TAB DATE? TAB DATE? TAB
						code=word TAB symbol=word+ TAB WORD TAB WORD TAB WORD TAB WORD TAB dividend=NUMBER TAB NUMBER? TAB NUMBER TAB NUMBER TAB NUMBER? TAB+ TAB NUMBER TAB NUMBER TAB		NEWLINE
							//	2022/12/31 	 2023/04/21 	 	 000850 	 화천기공 	 유가증권시장 	 현금배당 	 국민은행 	 보통주 	 2,500 	 	 50.00 	 0.00 	 	 	 5,000 	 12 	 
					{
						ParserService.dividend(20240517
							, $code.text
							, $base.text, $pay.text, $dividend.text
							, null, null
						);
					}
				)
			)+
		)+
		WORD TAB WORD TAB DATE						NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 CrawlDividendHistoryCompanyThread 	 주식(기업) 배당금 내역 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01041V.xml&menuNo=285 
;
