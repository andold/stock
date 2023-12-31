import { makeAutoObservable } from "mobx";

import repository from "../repository/CrawlRepository";

// CrawlStore.ts
class CrawlStore {
	constructor() {
		makeAutoObservable(this);
	}

	crawlPriceAll(request?: any, onSuccess?: any, onError?: any, element?: any) {
		repository.crawlPriceAll(request, onSuccess, onError, element);
	}


}
export default new CrawlStore();
