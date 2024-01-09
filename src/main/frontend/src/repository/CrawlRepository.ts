import axios from "axios";

// CrawlRepository.ts
class CrawlRepository {
	constructor() {
	}

	async crawlPriceAll(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post("./api/crawl/price/all", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}

}
export default new CrawlRepository();
