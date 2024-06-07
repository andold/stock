grammar SeibroEtf;

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

seibroEtfDocument
:	crawlDividendHistoryEtfThread	// KSD증권정보포털(SEIBro) > ETF > ???
|	crawlItemEtf					// KSD증권정보포털(SEIBro) > ETF > 종목발행현황
|	crawlEtfDetailThread			// KSD증권정보포털(SEIBro) > ETF > ETF종합정보 > 종목상세
|	crawlPriceEtf					// KSD증권정보포털 SEIBro > ETF > ETF종합정보 > 기준가추이

|	seibroItemInfoEtf				// SEIBro ETF > ETF종합정보 > 종목상세
|	seibroPriceEtf					// SEIBro ETF > ETF종합정보 > 기준가추이 :: 일별시세
|	seibroPriceCurrentEtf			// SEIBro > ETF > 종목발행현황
;


// SEIBro > ETF > 종목발행현황
seibroPriceCurrentEtf:
	KEYWORD TAB WORD TAB WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 SEIBro 	 ETF > 종목발행현황 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06025V.xml&menuNo=174 
	(
		WORD DATE TAB										NEWLINE		//	기준일: 2024/01/15 	 
		WORD DATE TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB	NEWLINE
				//	기준일: 2024/01/15 	 선택 	 종목명 	 단축종목코드 	 유형 	 순자산 	 종가 	 거래량(3개월평균) 	 수익률(%) 	 수익률(%) 	 수익률(%) 	 수익률(%) 	 수익률(%) 	 수익률(%) 	 수익률(%) 	 수익률(%) 	 총보수(%) 	 운용사 	 

		((
			WORD base=DATE TAB TAB word+ TAB code=word TAB word+ TAB NUMBER TAB closing=NUMBER TAB volume=NUMBER TAB NUMBER TAB NUMBER TAB NUMBER? TAB NUMBER? TAB NUMBER TAB NUMBER? TAB NUMBER? TAB NUMBER? TAB NUMBER TAB WORD TAB		NEWLINE
					//	기준일: 2024/01/15 	 	 TIGER MSCI Korea TR 	 310970 	 시장지수/MSCI Korea Index 	 11,559 	 14,440 	 157,624 	 -2.37 	 -0.48 	 4.22 	 -2.79 	 -5.65 	 10.02 	 -9.18 	 -16.77 	 0.12 	 미래에셋자산운용 	 
			{
				ParserService.price(20240112
					, $code.text
					, $base.text, $closing.text, null, null, null, $volume.text
				);
			}
		))*
		WORD TAB WORD TAB DATE									NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD TAB WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 SEIBro 	 ETF > 종목발행현황 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06025V.xml&menuNo=174 
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


// SEIBro > ETF > ETF종합정보 > 기준가추이 :: 일별시세
seibroPriceEtf:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 SEIBro 	 ETF > ETF종합정보 > 기준가추이 :: 일별시세 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06033V.xml&menuNo=182 
	(
		word TAB																			NEWLINE		//	473590 	 
		word TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB	NEWLINE		//	473590 	 일자 	 종가 	 전일비 	 시가 	 고가 	 저가 	 거래량 	 거래대금 	 
		((
			word TAB TAB TAB TAB TAB TAB TAB TAB TAB										NEWLINE		//	473590 	 	 	 	 	 	 	 	 	 
		) | (
			code=word TAB base=DATE TAB closing=NUMBER TAB NUMBER TAB market=NUMBER TAB high=NUMBER TAB low=NUMBER TAB  volume=NUMBER TAB NUMBER TAB		NEWLINE
						//	473590 	 2024/01/09 	 9,935 	 240 	 9,875 	 9,960 	 9,875 	 1,081,229 	 10,733 	 
			{
				ParserService.price(20240112
					, $code.text
					, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
				);
			}
		))+
		WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 SEIBro 	 ETF > ETF종합정보 > 기준가추이 :: 일별시세 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06033V.xml&menuNo=182 
;


// SEIBro ETF > ETF종합정보 > 종목상세
seibroItemInfoEtf:
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 SEIBro 	 ETF > ETF종합정보 > 종목상세 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS906032V.xml&menuNo=514 
	(
		(
			KEYWORD TAB code=word TAB word+		NEWLINE		//	KEYWORD 	 441680 	 TIGER 미국나스닥100커버드콜(합성)[441680] 
			symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*					NEWLINE		//	TIGER 미국나스닥100커버드콜(합성)[441680] 
			category=word category1=word? category2=word? category3=word? category4=word? category5=word? category6=word? category7=word*	NEWLINE		//	파생상품/구조화
			ipo=DATE word*						NEWLINE		//	2022/09/20 (1년 3개월) 
			volumeOfListedShares=NUMBER			NEWLINE		//	23,800,000	//      2015/01/23
			fee=word							NEWLINE		//	0.37 | NaN
			{
				ParserService.item(20240112
					, $code.text
					, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
					, $category.text, $category1.text, $category2.text, $category3.text, $category4.text, $category5.text, $category6.text, $category7.text
					, "ETF"
					, $ipo.text
					, null
					, $volumeOfListedShares.text
					, $fee.text
				);
			}
		)+
		WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD TAB WORD WORD WORD WORD WORD TAB WORD		NEWLINE		//	KEYWORD 	 SEIBro 	 ETF > ETF종합정보 > 종목상세 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS906032V.xml&menuNo=514 
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
			code=word TAB
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
				ParserService.item(20240112
					, $code.text
					, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
					, $category.text, $category1.text, $category2.text, $category3.text, $category4.text, $category5.text, $category6.text, $category7.text
					, "ETF"
					, null
					, null
					, null
					, $fee.text
				);
			}
		)+
		WORD TAB WORD TAB DATE										NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 crawlItemEtf 	 ETF 종목 발행현황 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06025V.xml&menuNo=174 
;


// KSD 증권정보포털 SEIBro > ETF > ETF종합정보 > 기준가추이
crawlPriceEtf:
	KEYWORD TAB WORD WORD TAB WORD TAB WORD TAB WORD							NEWLINE		//	KEYWORD 	 ETF 일별시세 	 CrawlPriceEtfThread 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06033V.xml&menuNo=182 
	(
		code=word TAB word+														NEWLINE		//	143860 	 TIGER 헬스케어
		(
			KEYWORD TAB symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*					NEWLINE 
			KEYWORD TAB category=word category1=word? category2=word? category3=word? category4=word? category5=word? category6=word? category7=word*	NEWLINE 
			KEYWORD TAB ea=NUMBER																														NEWLINE 
			{
				ParserService.item(20240112
					, $code.text
					, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
					, $category.text, $category1.text, $category2.text, $category3.text, $category4.text, $category5.text, $category6.text, $category7.text
					, "ETF"
					, null
					, null
					, $ea.text
					, null
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
					ParserService.price(20240112
						, $code.text
						, $base.text, $closing.text, $market.text, $high.text, $low.text, $volume.text
					);
				}
			))+
		)+
		WORD TAB WORD TAB DATE							NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD WORD TAB WORD TAB WORD TAB WORD	NEWLINE		//	KEYWORD 	 ETF 일별시세 	 CrawlPriceEtfThread 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06033V.xml&menuNo=182 
;


// KSD증권정보포털(SEIBro) > ETF > ETF종합정보 > 종목상세
crawlEtfDetailThread:
	KEYWORD TAB WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 ETF 상세 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS906032V.xml&menuNo=514 
	(
		KEYWORD TAB code=word TAB word*		NEWLINE
		symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word*					NEWLINE		//	KODEX 에너지화학[117460] 
		category=word category1=word? category2=word? category3=word? category4=word? category5=word? category6=word? category7=word*	NEWLINE		//	섹터/소재 
		ipo=DATE WORD*							NEWLINE		//	2009/10/09 (14년 2개월) 
		fee=word								NEWLINE		//	0.45 
		WORD TAB WORD TAB DATE					NEWLINE		//	andold 	 since 	 2023-11-27 
		{
			ParserService.item(20240112
				, $code.text
				, $symbol.text, $symbol1.text, $symbol2.text, $symbol3.text, $symbol4.text, $symbol5.text, $symbol6.text, $symbol7.text
				, $category.text, $category1.text, $category2.text, $category3.text, $category4.text, $category5.text, $category6.text, $category7.text
				, null
				, $ipo.text
				, null
				, null
				, $fee.text
			);
		}
	)+
	KEYWORD TAB WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 ETF 상세 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS906032V.xml&menuNo=514 
;


crawlDividendHistoryEtfThread:
	KEYWORD TAB WORD WORD WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 ETF 배당금 내역 	 KSD 증권정보포털 SEIBro 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06030V.xml&menuNo=179 
	(
		WORD TAB WORD? TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB WORD TAB		NEWLINE		//	종목명 	 	 운용사 	 유형 	 지급기준일 	 실지급일 	 배당구분 	 주당분배금 	 결산과표기준가 	 시가대비분배율 	 
		(
			(
				TAB TAB TAB TAB TAB TAB TAB TAB TAB TAB						NEWLINE		//		 	 	 	 	 	 	 	 	 	 
			) | (
				symbol=word symbol1=word? symbol2=word? symbol3=word? symbol4=word? symbol5=word? symbol6=word? symbol7=word* TAB
				code=word TAB WORD TAB word* TAB base=DATE? TAB pay=DATE TAB WORD? TAB dividend=NUMBER TAB price=NUMBER? TAB ratio=NUMBER? TAB		NEWLINE
						//	TIGER 200커버드콜5%OTM 	 	 미래에셋자산운용 	 파생상품/구조화 	 2023/11/30 	 2023/12/04 	 이익분배 	 54 	 11,308.35 	 0.45 	 
				{
					ParserService.dividend(20231127
						, $code.text
						, $base.text, $pay.text, $dividend.text
						, null, null
					);
				}
			)
		)+
		WORD TAB WORD TAB DATE											NEWLINE		//	andold 	 since 	 2023-11-27 
	)+
	KEYWORD TAB WORD WORD WORD TAB WORD WORD WORD TAB WORD TAB WORD		NEWLINE		//	KEYWORD 	 ETF 배당금 내역 	 KSD 증권정보포털 SEIBro 	 URL 	 https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06030V.xml&menuNo=179 
;
