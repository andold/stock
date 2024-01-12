import axios from "axios";

// PriceRepository.ts
class PriceRepository {
	constructor() {
	}

	async search(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post("./api/price/search", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async crawl(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post(`./api/price/crawl`, request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async purge(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.get("./api/price/purge", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}

}
export default new PriceRepository();
