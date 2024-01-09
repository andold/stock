import axios from "axios";

// IdempotentRepository.ts
class IdempotentRepository {
	constructor() {
	}

	async run(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.get("./api/idempotent/run", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}

}
export default new IdempotentRepository();
