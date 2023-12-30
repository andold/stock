import axios from "axios";

// ItemRepository.ts
class ItemRepository {
	constructor() {
	}

	async search(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post("./api/item/search", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async crawl(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post(`./api/item/crawl`, request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}

}
export default new ItemRepository();
