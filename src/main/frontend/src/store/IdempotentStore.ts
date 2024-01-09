import { makeAutoObservable } from "mobx";

import repository from "../repository/IdempotentRepository";

// IdempotentStore.ts
class IdempotentStore {
	constructor() {
		makeAutoObservable(this);
	}

	run(request?: any, onSuccess?: any, onError?: any, element?: any) {
		repository.run(request, onSuccess, onError, element);
	}


}
export default new IdempotentStore();
