// StockModel.ts

// item section
export interface StockItemFormModel {
	keyword: string;
	start: moment.Moment;
	end: moment.Moment;

	// not support field. user custom.
	custom: any;
}
export interface StockItemModel {
	id: number;

	symbol?: string;	//	종목이름
	code?: string;	//	종목코드
	priority?: number;	//	우선순위
	dividendCycle?: string;			//	배당주기
	volumeOfListedShares?: number;	//	상장주식수
	etf?: boolean;		//	etf?: 개별기업
	type?: string;		//	코스피, 코스닥
	category?: string;	//	분류
	ipoDate?: number;	//	상장일

	created?: number;	//	생성일
	updated?: number;	//	수저일

	// not support field. user custom.
	custom?: any;
}

// dividend section
export interface StockDividendFormModel {
	mode: number;

	filterDividendPayoutRatio: boolean;
	filterSigma: boolean;

	keyword: string;
	start: moment.Moment;
	end: moment.Moment;

	etf: boolean;
	kospi: boolean;
	kosdaq: boolean;

	// not support field. user custom.
	custom?: any;
}
export default interface StockDividendModel {
	id: number;
	code: string;			//	종목코드
	currentPrice: number;	//	현재가
	baseMonth: number;		//	기준월
	dividend: number;		//	배당금
	priceEarningsRatio: number;		//	수익률
	dividendPayoutRatio: number;	//	배당성
	roe: number;
	per: number;
	pbr: number;
	dividend1YAgo: number;
	dividend2YAgo: number;
	dividend3YAgo: number;

	created: number;
	updated: number;

	// not support field. user custom.
	custom: any;
}

// dividend history section
// TODO define StockDividendHistoryFormModel
// TODO define StockDividendHistoryModel
