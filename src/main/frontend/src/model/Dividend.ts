// Dividend.ts

export default interface Dividend {
	id: number;
	code: string;

	currentPrice: number;
	dividend: number;
	priceEarningsRatio: number;	//	배당수익률(%)
	dividend1YAgo: number;
	dividend2YAgo: number;
	dividend3YAgo: number;

	created: string;
	updated: string;

	// not support field. user custom.
	custom: any;
}
