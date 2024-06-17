grammar KrxEtf;

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

krxEtfDocument
:	crawlPriceKrx					// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 개별종목 시세 추이
|	etfAllPrice						// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 전종목 시세
|	krxBasicInfoEtf					// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 전종목 기본정보
|	krxItemInfoEtf					// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 개별종목 종합정보
|	krxPriceEtf						// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 개별종목 시세 추이
;


// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 개별종목 시세 추이
krxPriceEtf:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 증권상품 > ETF > 개별종목 시세 추이 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201030103
	(
		(
			word TAB									NEWLINE		//	402970 	 
			(word TAB TAB TAB							NEWLINE)+		//	402970 	 	 	 
			word TAB TAB TAB WORD						NEWLINE		//	402970 	 	 	 일자종가대비등락률순자산가치(NAV)시가고가저가거래량거래대금시가총액순자산총액상장좌수지수명종가대비등락률 
			word TAB TAB TAB							NEWLINE		//	402970
			(
				code=word TAB base=DATE					NEWLINE		//	402970 	 2021/10/21 
				word TAB closing=NUMBER					NEWLINE		//	402970 	 10,080 
				word TAB NUMBER						NEWLINE		//	402970 	 85 
				word TAB NUMBER						NEWLINE		//	402970 	 +0.85 
				word TAB nav=NUMBER					NEWLINE		//	402970 	 10,108.12 
				word TAB market=NUMBER				NEWLINE		//	402970 	 10,050 
				word TAB high=NUMBER					NEWLINE		//	402970 	 10,140 
				word TAB low=NUMBER					NEWLINE		//	402970 	 10,050 
				word TAB volume=NUMBER				NEWLINE		//	402970 	 42,219 
				word TAB NUMBER						NEWLINE		//	402970 	 425,885,480 
				word TAB NUMBER						NEWLINE		//	402970 	 10,080,000,000 
				word TAB NUMBER						NEWLINE		//	402970 	 10,108,122,720 
				word TAB volumeOfListedShares=NUMBER	NEWLINE		//	402970 	 1,000,000 
				word TAB word+						NEWLINE		//	402970 	 Dow Jones U.S. Dividend 100 Price Return Index 
				word TAB word							NEWLINE		//	402970 	 5,507.43 
				word TAB word							NEWLINE		//	402970 	 - 
				word TAB word							NEWLINE		//	402970 	 - 
				word TAB								NEWLINE		//	402970 	 
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
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 증권상품 > ETF > 개별종목 시세 추이 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201030103 
;


// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 개별종목 종합정보
krxItemInfoEtf:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 증권상품 > ETF > 개별종목 종합정보 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201030105 

	KEYWORD TAB symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*		NEWLINE
	WORD TAB WORD TAB word+ TAB word+ TAB									NEWLINE
					//	ETF종목명 	 자산운용사 	 미래에셋 TIGER 미국나스닥100커버드콜증권상장지수투자신탁(주식-파생형)(합성) 	 미래에셋자산운용 	 
	WORD TAB WORD TAB WORD TAB code=word TAB								NEWLINE		//	표준코드 	 단축코드 	 KR7441680006 	 441680 	 
	WORD TAB WORD TAB word+ TAB word+ TAB									NEWLINE		//	기초지수명 	 지수산출기관 	 Cboe Nasdaq-100 BuyWrite V2 지수 (Total Return) 	 NASDAQ 	 
	WORD TAB WORD TAB NUMBER TAB volumeOfListedShares=NUMBER TAB			NEWLINE		//	순자산규모(백만원) 	 상장좌수(좌) 	 252,027 	 25,400,000 	 
	WORD TAB WORD TAB NUMBER TAB ipo=DATE TAB								NEWLINE		//	전일NAV 	 상장일 	 9,922.33 	 2022/09/22 	 
	WORD TAB WORD TAB WORD TAB WORD TAB										NEWLINE		//	펀드형태 	 과세유형 	 수익증권형 	 배당소득세(보유기간과세) 	 
	WORD TAB WORD TAB WORD TAB WORD TAB										NEWLINE		//	추적배수 	 복제방법 	 일반 	 합성(패시브) 	 
	WORD TAB WORD TAB WORD TAB
			category=word category1=word? category2=word? category3=word? category4=word? category5=word? category6=word? category7=word* TAB	NEWLINE
					//	기초시장(국내/해외여부) 	 기초자산(주식/시장대표) 	 해외 	 주식-전략-구조화 	 
	WORD WORD TAB word+ TAB													NEWLINE		//	분배금 기준일 	 매월 마지막 영업일 	 
	WORD TAB word+ TAB														NEWLINE		//	유동성공급자(LP) 	 신한증권, 한국증권, 대신증권, 미래에셋증권, 메리츠, NH투자증권, KB증권, 삼성증권, 키움증권, 이베스트 	 

	WORD TAB WORD TAB DATE													NEWLINE		//	andold 	 since 	 2023-11-27 

	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD TAB WORD				NEWLINE		//	KEYWORD 	 KRX 	 증권상품 > ETF > 개별종목 종합정보 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201030105 
	{
		ParserService.item(20240112
			, $code.text
			, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
			, $category.text, $category1.text, $category2.text, $category3.text, $category4.text, $category5.text, $category6.text, $category7.text
			, "ETF"
			, $ipo.text
			, null
			, $volumeOfListedShares.text
			, null
		);
	}
;


// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 전종목 기본정보
krxBasicInfoEtf:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD TAB WORD					NEWLINE		//	KEYWORD 	 KRX 	 증권상품 > ETF > 전종목 기본정보 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201030104 
	(
		WORD TAB										NEWLINE		//	ETF 	 
		(WORD TAB TAB TAB										NEWLINE)+		//	ETF 	 	 	 
		WORD TAB TAB TAB WORD									NEWLINE		//	ETF 	 	 	 표준코드단축코드한글종목명한글종목약명영문종목명상장일기초지수명지수산출기관추적배수복제방법기초시장분류기초자산분류상장좌수운용사CU수량총보수과세유형 
		WORD TAB TAB TAB										NEWLINE		//	ETF 	 	 	 
		((
			WORD TAB WORD									NEWLINE		//	ETF 	 KR7391680006 
			WORD TAB code=word								NEWLINE		//	ETF 	 391680 
			WORD TAB										NEWLINE		//	ETF 	 
			WORD TAB TAB word+								NEWLINE		//	ETF 	 	 흥국 HK 하이볼액티브증권상장지수투자신탁(주식) 
			WORD TAB TAB symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*	NEWLINE		//	ETF 	 	 HK 하이볼액티브 
			WORD TAB										NEWLINE		//	ETF 	 
			WORD TAB word+									NEWLINE		//	ETF 	 Heungkuk HK HighVol Active ETF 
			WORD TAB ipo=DATE								NEWLINE		//	ETF 	 2021/07/06 
			WORD TAB word+									NEWLINE		//	ETF 	 코스피 200 
			WORD TAB word+									NEWLINE		//	ETF 	 KRX | (ICE Data Indices, LLC)
			WORD TAB word+									NEWLINE		//	ETF 	 일반 | (2X 레버리지)
			WORD TAB WORD									NEWLINE		//	ETF 	 실물(액티브) 
			WORD TAB										NEWLINE		//	ETF 	 
			WORD TAB TAB WORD								NEWLINE		//	ETF 	 	 국내 
			WORD TAB TAB WORD								NEWLINE		//	ETF 	 	 주식 
			WORD TAB TAB									NEWLINE		//	ETF 	 	 
			WORD TAB volumeOfListedShares=NUMBER			NEWLINE		//	ETF 	 550,000 
			WORD TAB word+									NEWLINE		//	ETF 	 흥국자산운용 
			WORD TAB NUMBER									NEWLINE		//	ETF 	 50,000 
			WORD TAB fee=NUMBER								NEWLINE		//	ETF 	 0.300000 
			WORD TAB WORD									NEWLINE		//	ETF 	 배당소득세(보유기간과세) 
			WORD TAB										NEWLINE		//	ETF 	 
			{
				ParserService.item(20240112
					, $code.text
					, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
					, null, null, null, null, null, null, null, null
					, null
					, $ipo.text
					, null
					, $volumeOfListedShares.text
					, null
				);
			}
		))+

		WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
	)+ 

	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD TAB WORD					NEWLINE		//	KEYWORD 	 KRX 	 증권상품 > ETF > 전종목 기본정보 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201030104 
;


// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 전종목 시세
etfAllPrice:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 ETF > 전종목 시세 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020101 
	(
		(WORD TAB DATE TAB										NEWLINE)+		//	ETF 	 2024-01-09 	 
		WORD TAB DATE TAB WORD									NEWLINE		//	ETF 	 2024-01-09 	 종목코드종목명종가대비등락률순자산가치(NAV)시가고가저가거래량거래대금시가총액순자산총액상장좌수지수명종가대비등락률 
		WORD TAB DATE TAB										NEWLINE		//	ETF 	 2024-01-09 	 
		((
			WORD TAB DATE TAB code=word							NEWLINE		//	ETF 	 2024-01-09 	 305080 
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
				ParserService.price(20240112
					, $code.text
					, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
				);
				ParserService.item(20240112
					, $code.text
					, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
					, null, null, null, null, null, null, null, null
					, "ETF"
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
	KEYWORD TAB WORD TAB WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 KRX 	 ETF > 전종목 시세 	 http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020101 
;


// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 개별종목 시세 추이
// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목시세 > 개별종목 시세 추이
crawlPriceKrx:
	KEYWORD TAB WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 주가일별시세 	 CrawlPriceThread 	 http://data.krx.co.kr/
	(
		(
			word TAB WORD WORD TAB										NEWLINE		//	253250 	 데이터가 없습니다.
		) | (((
				WORD TAB word TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB							NEWLINE
					//	ETF 	 175330 	 일자 	 종가 	 대비 	 등락률 	 시가 	 고가 	 저가 	 거래량 	 거래대금 	 시가총액 	 상장주식수 	 
				(
					WORD TAB code=word TAB base=DATE TAB closing=NUMBER TAB NUMBER TAB NUMBER TAB market=NUMBER TAB high=NUMBER TAB low=NUMBER TAB volume=NUMBER TAB NUMBER TAB NUMBER TAB NUMBER TAB		NEWLINE
							//	ETF 	 175330 	 2022/06/20 	 7,830 	 110 	 -1.39 	 7,980 	 8,000 	 7,720 	 225,863 	 1,768,097,000 	 1,542,376,060,020 	 196,982,894 	 
					{
						ParserService.price(20240112
							, $code.text
							, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
						);
					}
				)+
			) | (
				WORD TAB word TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB	NEWLINE
					//	ETF 	 441680 	 일자 	 종가 	 대비 	 등락률 	 순자산가치(NAV) 	 시가 	 고가 	 저가 	 거래량 	 거래대금 	 시가총액 	 순자산총액 	 상장좌수 	 지수명 	 종가 	 대비 	 등락률
				(
					WORD TAB code=word TAB base=DATE TAB closing=NUMBER TAB NUMBER TAB NUMBER TAB NUMBER TAB market=NUMBER TAB high=NUMBER TAB low=NUMBER TAB volume=NUMBER TAB NUMBER TAB NUMBER TAB NUMBER TAB NUMBER TAB
						symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* TAB
						NUMBER TAB NUMBER TAB NUMBER TAB		NEWLINE
							//	ETF 	 441680 	 2022/11/22 	 9,710 	 10 	 +0.10 	 9,769.51 	 9,725 	 9,750 	 9,680 	 36,868 	 357,580,550 	 30,101,000,000 	 30,285,495,972 	 3,100,000 	 Cboe Nasdaq-100 BuyWrite V2 지수 (Total Return) 	 747.74 	 6.63 	 +0.89 	 
					{
						ParserService.price(20240112
							, $code.text
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
