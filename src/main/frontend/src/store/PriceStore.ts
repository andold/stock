import { makeAutoObservable } from "mobx";

import repository from "../repository/PriceRepository";
import Price from "../model/Price";

// PriceStore.ts
class PriceStore {
	constructor() {
		makeAutoObservable(this);
	}

	search(request: any, onSuccess?: any, onError?: any, element?: any) {
		repository.search(request, onSuccess, onError, element);
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

}
export default new PriceStore();