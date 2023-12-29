import { makeAutoObservable } from "mobx";

import repository from "../repository/PriceRepository";
import Price from "../model/Price";
import moment from "moment";

// PriceStore.ts
class PriceStore {
	constructor() {
		makeAutoObservable(this);
	}

	search(request: any, onSuccess?: any, onError?: any, element?: any) {
		repository.search(request, onSuccess, onError, element);
	}
	crawl(request?: any, onSuccess?: any, onError?: any, element?: any) {
		repository.crawl(request, onSuccess, onError, element);
	}

	makeMap(prices: Price[]) {
		const map = new Map();
		prices.forEach((price: Price) => {
			const prev: any[] = map.get(price.code);
			if (!prev) {
				map.set(price.code, [price]);
				return;
			}

			prev.push(price);
		});
		return map;
	}
	compare(left: Price, right: Price) {
		return moment(left.base).diff(moment(right.base));
	}

}
export default new PriceStore();
