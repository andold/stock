// Item.ts

export default interface Item {
	id: number;

	code?: string;		//	종목코드
	symbol?: string;	//	종목이름
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
