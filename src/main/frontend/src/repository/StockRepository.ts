import axios from "axios";
import { StockItemModel } from "../model/StockModel";

// StockRepository.ts
class StockRepository {
	constructor() {
	}

	async batch(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post("./api/batch", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async create(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post("./api/stock", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async update(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.put("./api/" + request.id, request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async remove(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.delete(`./api/${request.id}`)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async upload(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post(`./api/upload`, request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async download(request?: any, onSuccess?: any, onError?: any, element?: any) {
		return axios({
			url: "./api/download",
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
		return axios.post(`./api/deduplicate`)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async parse(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post("./api/parse", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async parseFile(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post("./api/parse-file", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async compile(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.get("./api/compile", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async crawl(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.get("./api/crawl", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async crawlItems(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.get("./api/crawl/items", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async crawlItemCompanyDetails(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.get("./api/crawl/item/company/details", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async crawlDividendHistories(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.get("./api/crawl/dividend/histories", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async crawlDividendHistoryEtf(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.get(`./api/crawl/dividend/history/etf`, request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async crawlDividendHistoryEtfMonthly(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post("./api/crawl/divident/history/etf/monthly", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async crawlPriceCompany(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.get(`./api/crawl/price/company`, request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async crawlPriceEtf(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.get(`./api/crawl/price/etf`, request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async crawlItemEtfDetails(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.get(`./api/crawl/item/etf/details`, request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async crawlItemCompanyDividendTop(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.get(`./api/crawl/item/company/dividend/top`, request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}

	// stock item section
	async searchItem(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post(`./api/item/search?page=${request?.page}&size=${request?.size}`, request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async updateItem(request: StockItemModel, onSuccess?: any, onError?: any, element?: any) {
		return axios.put(`./api/item/${request.id}`, request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}


	// stock dividend section

	// stock dividend history section
	async crawlDividendHistory(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post(`./api/dividend/history/crawl`, request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}

}
export default new StockRepository();
