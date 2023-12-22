import { makeAutoObservable } from "mobx";

import repository from "../repository/DividendHistoryRepository";
import DividendHistory from "../model/DividendHistory";

// DividendHistoryStore.ts
class DividendHistoryStore {
	constructor() {
		makeAutoObservable(this);
	}

	search(request: any, onSuccess?: any, onError?: any, element?: any) {
		repository.search(request, onSuccess, onError, element);
	}

	makeMap(histories: DividendHistory[]) {
		const map = new Map();
		histories.forEach((history: DividendHistory) => {
			const prev: any[] = map.get(history.code);
			if (!prev) {
				map.set(history.code, [history]);
				return;
			}

			prev.push(history);
		});
		return map;
	}

}
export default new DividendHistoryStore();
