import axios from "axios";

// DividendRepository.ts
class DividendRepository {
	constructor() {
	}

	async search(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post("./api/dividend/search", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}

}
export default new DividendRepository();
