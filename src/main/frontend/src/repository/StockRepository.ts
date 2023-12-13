import axios from "axios";
import { StockItemModel } from "../model/StockModel";

// StockRepository.ts
class StockRepository {
	constructor() {
	}

	async batch(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post("./api/stock/batch", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async create(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post("./api/stock", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async search(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post("./api/stock/search", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async update(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.put("./api/stock/" + request.id, request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async remove(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.delete(`./api/stock/${request.id}`)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async upload(request: any, onSuccess?: any, onError?: any, element?: any) {
		const data = new FormData();
		data.append("file", request.file);
		return axios.post(`./api/stock/${request.vcalendarId}/upload`, data)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async download(request?: any, onSuccess?: any, onError?: any, element?: any) {
		return axios({
			url: "./api/stock/download",
			method: "GET",
			responseType: "blob",
		}).then(response => {
			const url = window.URL.createObjectURL(new Blob([response.data]));
			const link = document.createElement("a");
			link.href = url;
			link.setAttribute("download", request.filename);
			document.body.appendChild(link);
			link.click();
			link.parentNode.removeChild(link);
			onSuccess && onSuccess(request, response.data, element);
		})
			.catch(error => onError && onError(request, error, element));
	}
	async deduplicate(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post(`./api/stock/deduplicate`)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async parse(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post("./api/stock/parse", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async parseFile(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post("./api/stock/parse-file", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async crawl(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.get("./api/stock/crawl", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async crawlItems(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.get("./api/stock/crawl/items", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async crawlItemDetails(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.get("./api/stock/crawl/item/details", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async crawlDividendHistories(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.get("./api/stock/crawl/dividend/histories", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async crawlDividendHistoryEtf(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.get(`./api/stock/crawl/dividend/history/etf`, request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async crawlDividendHistoryEtfMonthly(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post("./api/stock/crawl/divident/history/etf/monthly", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async crawlPrice(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post(`./api/stock/crawl/price`, request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}

	// stock item section
	async searchItem(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post("./api/stock/item/search", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async updateItem(request: StockItemModel, onSuccess?: any, onError?: any, element?: any) {
		return axios.put(`./api/stock/item/${request.id}`, request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async crawlItem(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post(`./api/stock/item/crawl`, request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}


	// stock dividend section

	// stock dividend history section
	async searchDividendHistory(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post("./api/stock/dividend/history/search", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async crawlDividendHistory(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post(`./api/stock/dividend/history/crawl`, request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}

}
export default new StockRepository();
