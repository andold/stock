import { makeAutoObservable } from "mobx";

import repository from "../repository/ItemRepository";

// ItemStore.ts
class ItemStore {
	constructor() {
		makeAutoObservable(this);
	}

	search(request: any, onSuccess?: any, onError?: any, element?: any) {
		repository.search(request, onSuccess, onError, element);
	}
	crawl(request?: any, onSuccess?: any, onError?: any, element?: any) {
		repository.crawl(request, onSuccess, onError, element);
	}


}
export default new ItemStore();
