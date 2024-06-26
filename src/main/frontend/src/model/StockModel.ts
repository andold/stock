// StockModel.ts

// item section
/*
export interface StockItemFormModel {
	keyword: string;
	start: moment.Moment;
	end: moment.Moment;

	// not support field. user custom.
	custom: any;
}
*/
// dividend section
export interface StockForm {
	mode: number;

	//	pageable
	size: number,
	page: number,
	totalPages: number,
	rowHeight: number,

	filterDividendPayoutRatio: boolean;

	priority: number;	//	우선순위
	keyword: string;
	start: moment.Moment;
	end: moment.Moment;

	// not support field. user custom.
	custom?: any;
}
/*
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
*/
// dividend history section
// TODO define StockDividendHistoryFormModel
// TODO define StockDividendHistoryModel
