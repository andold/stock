import { makeAutoObservable } from "mobx";

import repository from "../repository/DividendRepository";
import Dividend from "../model/Dividend";

// DividendStore.ts
class DividendStore {
	constructor() {
		makeAutoObservable(this);
	}

	search(request: any, onSuccess?: any, onError?: any, element?: any) {
		repository.search(request, onSuccess, onError, element);
	}

	makeMap(prices: any[]) {
		const map = new Map();
		prices.forEach((dividend: Dividend) => {
			const prev: any[] = map.get(dividend.code);
			if (!prev) {
				map.set(dividend.code, [dividend]);
				return;
			}

			prev.push(dividend);
		});
		return map;
	}

}
export default new DividendStore();
