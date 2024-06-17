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
:	companyAllPrice					// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목시세 > 전종목 시세
|	krxBasicInfoCompany				// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목정보 > 전종목 기본정보
|	krxItemInfoCompany				// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목정보 > 개별정보 종합정보
|	krxPriceCompany					// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목시세 > 개별종목 시세 추이
;


// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목시세 > 개별종목 시세 추이
krxPriceCompany:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 주식 > 종목시세 > 개별종목 시세 추이 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020103 
	(
		(
			(word TAB										NEWLINE)+		//	175330 	 
			word TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			word TAB TAB TAB										NEWLINE		//	175330 	 	 	 
			word TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			word TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			word TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 
			word TAB										NEWLINE		//	175330 	 
			word TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			word TAB TAB TAB										NEWLINE		//	175330 	 	 	 
			word TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			word TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			word TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 
			word TAB										NEWLINE		//	175330 	 
			word TAB										NEWLINE		//	175330 	 
			word TAB										NEWLINE		//	175330 	 
			word TAB										NEWLINE		//	175330 	 
			word TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			word TAB TAB TAB										NEWLINE		//	175330 	 	 	 
			word TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			word TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			word TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 
			word TAB										NEWLINE		//	175330 	 
			word TAB										NEWLINE		//	175330 	 
			word TAB										NEWLINE		//	175330 	 
			word TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			word TAB TAB TAB										NEWLINE		//	175330 	 	 	 
			word TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			word TAB TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 	 
			word TAB TAB TAB TAB										NEWLINE		//	175330 	 	 	 	 
			word TAB WORD										NEWLINE		//	175330 	 일자종가대비등락률시가고가저가거래량거래대금시가총액상장주식수 
			word TAB										NEWLINE		//	175330 	 
			(
				code=word TAB base=DATE										NEWLINE		//	175330 	 2021/01/13 
				word TAB closing=NUMBER										NEWLINE		//	175330 	 5,740 
				word TAB NUMBER										NEWLINE		//	175330 	 50 
				word TAB NUMBER										NEWLINE		//	175330 	 +0.88 
				word TAB market=NUMBER				NEWLINE		//	402970 	 10,050 
				word TAB high=NUMBER					NEWLINE		//	402970 	 10,140 
				word TAB low=NUMBER					NEWLINE		//	402970 	 10,050 
				word TAB volume=NUMBER				NEWLINE		//	402970 	 42,219 
				word TAB NUMBER						NEWLINE		//	175330 	 5,470,752,030 
				word TAB NUMBER						NEWLINE		//	175330 	 1,130,681,811,560 
				word TAB volumeOfListedShares=NUMBER	NEWLINE		//	175330 	 196,982,894 
				word TAB								NEWLINE		//	175330 	 
				{
					ParserService.price(20240112
						, $code.text
						, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
					);
				}
			)+ 	 	 	 
		)+
		WORD TAB WORD TAB DATE							NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 주식 > 종목시세 > 개별종목 시세 추이 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020103 
;


// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목정보 > 개별정보 종합정보
krxItemInfoCompany:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 주식 > 종목정보 > 개별정보 종합정보 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020203 

	KEYWORD TAB type=WORD 										NEWLINE		//	KEYWORD 	 KOSPI 
	WORD TAB WORD TAB
			symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* TAB
			word+ TAB											NEWLINE		//	한글명 	 영문명 	 JB금융지주 	 JB Financial Group Co., Ltd. 	 
	WORD TAB WORD TAB WORD TAB code=word TAB					NEWLINE		//	표준코드 	 종목코드 	 KR7175330000 	 175330 	 
	WORD TAB WORD TAB word TAB NUMBER TAB						NEWLINE		//	액면가 	 결산월 	 5,000 	 12 	 
	WORD TAB WORD TAB volumeOfListedShares=NUMBER TAB WORD TAB	NEWLINE		//	상장주식수(주) 	 소속부 	 196,982,894 	 - 	 
	WORD TAB WORD TAB ipo=DATE TAB DATE TAB						NEWLINE		//	상장일 	 설립일 	 2013/07/18 	 2013/07/01 	 
	WORD TAB WORD TAB
			category=word category1=word? category2=word? category3=word? category4=word? category5=word? category6=word? category7=word* TAB
			word+ TAB											NEWLINE		//	업종명 	 대표이사 	 기타 금융업 	 김기홍 	 
	WORD TAB word+ TAB											NEWLINE		//	주소 	 전라북도 전주시 덕진구 백제대로 566 	 
	WORD TAB (NUMBER TAB)? word* TAB							NEWLINE		//	전화번호 	 02-2128-2714 	 
																			//	WORD TAB NUMBER TAB WORD TAB	NEWLINE		//	전화번호 	 02 	 -2088-8526 	 
	WORD TAB WORD TAB											NEWLINE		//	홈페이지 	 www.jbfg.com 	 

	WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 

	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 주식 > 종목정보 > 개별정보 종합정보 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020203 
	{
		ParserService.item(20240112
			, $code.text
			, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
			, $category.text, $category1.text, $category2.text, $category3.text, $category4.text, $category5.text, $category6.text, $category7.text
			, $type.text
			, $ipo.text
			, null
			, $volumeOfListedShares.text
			, null
		);
	}
;


// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목정보 > 전종목 기본정보
krxBasicInfoCompany:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 주식 > 종목정보 > 전종목 기본정보 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020201 
	(
		(KEYWORD TAB										NEWLINE)+		//	KEYWORD 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 
		KEYWORD TAB										NEWLINE		//	KEYWORD 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 
		KEYWORD TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 
		KEYWORD TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB										NEWLINE		//	KEYWORD 	 	 
		KEYWORD TAB										NEWLINE		//	KEYWORD 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 
		KEYWORD TAB										NEWLINE		//	KEYWORD 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 
		KEYWORD TAB										NEWLINE		//	KEYWORD 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 
		KEYWORD TAB										NEWLINE		//	KEYWORD 	 
		KEYWORD TAB										NEWLINE		//	KEYWORD 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 
		KEYWORD TAB										NEWLINE		//	KEYWORD 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 
		KEYWORD TAB										NEWLINE		//	KEYWORD 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 	 
		KEYWORD TAB TAB TAB TAB										NEWLINE		//	KEYWORD 	 	 	 	 
		KEYWORD TAB WORD										NEWLINE		//	KEYWORD 	 표준코드단축코드한글종목명한글종목약명영문종목명상장일시장구분증권구분소속부주식종류액면가상장주식수 
		KEYWORD TAB										NEWLINE		//	KEYWORD 	 
		((
			KEYWORD TAB WORD							NEWLINE		//	KEYWORD 	 KR7098120009 
			KEYWORD TAB code=word						NEWLINE		//	KEYWORD 	 098120 | 00104K
			KEYWORD TAB									NEWLINE		//	KEYWORD 	 
			KEYWORD TAB TAB								NEWLINE		//	KEYWORD 	 	 
			KEYWORD TAB TAB TAB word+					NEWLINE		//	KEYWORD 	 	 	 (주)마이크로컨텍솔루션 
			KEYWORD TAB TAB TAB symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*	NEWLINE		//	KEYWORD 	 	 	 마이크로컨텍솔 
			KEYWORD TAB TAB TAB word+					NEWLINE		//	KEYWORD 	 	 	 Micro Contact Solution Co.,Ltd. 
			KEYWORD TAB TAB TAB							NEWLINE		//	KEYWORD 	 	 	 
			KEYWORD TAB TAB TAB							NEWLINE		//	KEYWORD 	 	 	 
			KEYWORD TAB TAB								NEWLINE		//	KEYWORD 	 	 
			KEYWORD TAB ipo=DATE						NEWLINE		//	KEYWORD 	 2008/09/23 
			KEYWORD TAB type=WORD word*					NEWLINE		//	KEYWORD 	 KOSDAQ 
			KEYWORD TAB WORD							NEWLINE		//	KEYWORD 	 주권 
			KEYWORD TAB word*							NEWLINE		//	KEYWORD 	 중견기업부 
			KEYWORD TAB WORD							NEWLINE		//	KEYWORD 	 보통주 
			KEYWORD TAB word							NEWLINE		//	KEYWORD 	 500 | 무액면
			KEYWORD TAB volumeOfListedShares=NUMBER		NEWLINE		//	KEYWORD 	 8,312,766 
			KEYWORD TAB									NEWLINE		//	KEYWORD 	 
			{
				ParserService.item(20240112
					, $code.text
					, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
					, null, null, null, null, null, null, null, null
					, $type.text
					, $ipo.text
					, null
					, $volumeOfListedShares.text
					, null
				);
			}
		))+

		WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
	)+ 

	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 주식 > 종목정보 > 전종목 기본정보 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020201 
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
				ParserService.price(20240112
					, $code.text
					, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
				);
				ParserService.item(20240112
					, $code.text
					, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
					, null, null, null, null, null, null, null, null
					, $type.text
					, null
					, null
					, $volumeOfListedShares.text
					, null
				);
			}
		) | (
			WORD TAB DATE TAB word symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* closing=NUMBER	NEWLINE		//	ETF 	 2024-01-09 	 078935 GS우 KOSPI 34,250 
			WORD TAB base=DATE TAB NUMBER NUMBER NUMBER NUMBER NUMBER NUMBER NUMBER		NEWLINE		//	ETF 	 2024-01-09 	 34,300 34,500 34,100 1,993 68,209,450 61,130,290,500 1,784,826 
			{
				ParserService.price(20240112
					, $code.text
					, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
				);
			}
		))+

		WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
	)+ 
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 주식 > 종목시세 > 전종목 시세 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020101 
;
