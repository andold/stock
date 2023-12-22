import { makeAutoObservable } from "mobx";
import moment from "moment";
import StockDividendModel, { StockItemModel } from "../model/StockModel";

import repository from "../repository/StockRepository";
import { PriceEarningsRatioCellRenderer, PriorityCellRenderer, RecentDividendAgGridCellRenderer, OperateColumn, SymbolTypeCode as SymbolEtfTypeCode, PriceRecentCellRenderer } from "../view/AgGridCellRenderer";

const CELL_STYLE_LEFT = { textAlign: "left", padding: 1, };
const CELL_STYLE_RIGHT = { textAlign: "right", padding: 1, paddingRight: 4, };
const CELL_STYLE_CENTER = { textAlign: "center", padding: 1, };
// StockStore.ts
class StockStore {
	constructor() {
		makeAutoObservable(this);
	}

	batch(request: any, onSuccess?: any, onError?: any, element?: any) {
		repository.batch(request, onSuccess, onError, element);
	}
	create(request: any, onSuccess?: any, onError?: any, element?: any) {
		repository.create(request, onSuccess, onError, element);
	}
	update(request: any[], onSuccess?: any, onError?: any, element?: any) {
		repository.update(request, onSuccess, onError, element);
	}
	remove(request: any, onSuccess?: any, onError?: any, element?: any) {
		repository.remove(request, onSuccess, onError, element);
	}
	upload(file?: any, onSuccess?: any, onError?: any, element?: any) {
		const request = new FormData();
		request.append("file", file);
		repository.upload(request, onSuccess, onError, element);
	}
	download(request?: any, onSuccess?: any, onError?: any, element?: any) {
		repository.download(request, onSuccess, onError, element);
	}
	deduplicate(request?: any, onSuccess?: any, onError?: any, element?: any) {
		repository.deduplicate(request, onSuccess, onError, element);
	}
	parse(request: any, onSuccess?: any, onError?: any, element?: any) {
		repository.parse(request, onSuccess, onError, element);
	}
	parseFile(file: any, onSuccess?: any, onError?: any, element?: any) {
		const request = new FormData();
		request.append("file", file);
		repository.parseFile(request, onSuccess, onError, element);
	}
	compile(request?: any, onSuccess?: any, onError?: any, element?: any) {
		repository.compile(request, onSuccess, onError, element);
	}
	crawlItems(request?: any, onSuccess?: any, onError?: any, element?: any) {
		repository.crawlItems(request, onSuccess, onError, element);
	}
	crawlItemCompanyDetails(request?: any, onSuccess?: any, onError?: any, element?: any) {
		repository.crawlItemCompanyDetails(request, onSuccess, onError, element);
	}
	crawlDividendHistoryEtfMonthly(request?: any, onSuccess?: any, onError?: any, element?: any) {
		repository.crawlDividendHistoryEtfMonthly(request, onSuccess, onError, element);
	}
	crawlPriceCompany(request?: any, onSuccess?: any, onError?: any, element?: any) {
		repository.crawlPriceCompany(request, onSuccess, onError, element);
	}
	crawlPriceEtf(request?: any, onSuccess?: any, onError?: any, element?: any) {
		repository.crawlPriceEtf(request, onSuccess, onError, element);
	}
	crawlItemEtfDetails(request?: any, onSuccess?: any, onError?: any, element?: any) {
		repository.crawlItemEtfDetails(request, onSuccess, onError, element);
	}
	crawlItemCompanyDividendTop(request?: any, onSuccess?: any, onError?: any, element?: any) {
		repository.crawlItemCompanyDividendTop(request, onSuccess, onError, element);
	}
	// 

	//	stock item section
	searchItem(request: any, onSuccess?: any, onError?: any, element?: any) {
		repository.searchItem(request, onSuccess, onError, element);
	}
	updateItem(request: StockItemModel, onSuccess?: any, onError?: any, element?: any) {
		repository.updateItem(request, onSuccess, onError, element);
	}


	//	stock dividend section

	//	stock dividend history section
	crawlDividendHistory(request?: any, onSuccess?: any, onError?: any, element?: any) {
		repository.crawlDividendHistory(request, onSuccess, onError, element);
	}
	crawlDividendHistoryEtf(request?: any, onSuccess?: any, onError?: any, element?: any) {
		repository.crawlDividendHistoryEtf(request, onSuccess, onError, element);
	}

	//	utils
	range(size: number): number[] {
		const result = [];
		for (let cx = 0; cx < size; cx++) {
			result.push(cx);
		}
		return result;
	}
	formatDateReadable(dateString: any): string {
		const date = moment(dateString);
		const now = moment();
		const duration = moment.duration(now.diff(date));
		if (duration.asMonths() > 24) {
			return `${duration.years().toFixed(0)} Y`;
		}
		if (duration.asWeeks() > 10) {
			return `${duration.asMonths().toFixed(0)} M`;
		}
		if (duration.asDays() > 21) {
			return `${duration.asWeeks().toFixed(0)} W`;
		}
		if (duration.asHours() > 72) {
			return `${duration.asDays().toFixed(0)} D`;
		}
		if (duration.asMinutes() > 180) {
			return `${duration.asHours().toFixed(0)} H`;
		}
		if (duration.asSeconds() > 180) {
			return `${duration.asMinutes().toFixed(0)} m`;
		}
		return `${duration.asSeconds().toFixed(0)} s`;
	}
	sleep(ms: number): any {
		return new Promise(r => setTimeout(r, ms));
	}
	pushIfNotNaNAndGreaterOrEqualsZero(array: number[], value: any) {
		if (!isNaN(value) && value >= 0) {
			array.push(value);
		}
	}
	valids(data: StockDividendModel): number[] {
		const array = [];
		this.pushIfNotNaNAndGreaterOrEqualsZero(array, data.dividend);
		this.pushIfNotNaNAndGreaterOrEqualsZero(array, data.dividend1YAgo);
		this.pushIfNotNaNAndGreaterOrEqualsZero(array, data.dividend2YAgo);
		this.pushIfNotNaNAndGreaterOrEqualsZero(array, data.dividend3YAgo);
		return array;
	}
	mean(data: StockDividendModel): number {
		const array = this.valids(data);
		return array.reduce((prev, curr) => prev + curr, 0) / array.length;
	}
	standardDeviation(data: StockDividendModel): number {
		const mean = this.mean(data);
		const array = this.valids(data);
		return Math.sqrt(array.reduce((prev, curr) => prev + (curr - mean) * (curr - mean), 0) / array.length);
	}
	sigma(data: StockDividendModel): number {
		if (!data) {
			return 0;
		}
		const mean = this.mean(data);
		const standardDeviation = this.standardDeviation(data);
		return standardDeviation == 0 ? -999 : (data.dividend - mean) / standardDeviation;
	}
	isInDay(day: moment.Moment, start: moment.Moment, end: moment.Moment): boolean {
		const startx = day.clone().startOf("day");
		const endx = day.clone().add(1, "days").startOf("day");
		return start.isBefore(endx) && end.isAfter(startx);
	}
	isInDayEvent(day: moment.Moment, event: any): boolean {
		for (let period of event?.periods) {
			const start = moment(period.start);
			const end = moment(period.end);
			if (this.isInDay(day, start, end)) {
				return true;
			}
		}

		return false;
	}
	priceEarningsRatio(dividend: any, histories: any[]): number {
		if (dividend?.currentPrice > 0) {
			if (dividend?.dividend > 0) {
				return Math.round(dividend?.dividend / dividend?.currentPrice * 10000) / 100;
			}
			
			const lastYear = moment().year() - 1;
			let sum = 0;
			histories?.forEach((history: any) => {
				const date = moment(history.base);
				if (date.year() == lastYear) {
					sum += history.dividend;
				}
			});

			return Math.round(sum / dividend?.currentPrice * 10000) / 100;
		} else if (dividend?.priceEarningsRatio > 0) {
			return dividend?.priceEarningsRatio;
		}

		return 0;
	}
	colorPriceEarningsRatio(value: number) {
		if (value > 10) { return `rgb(255, 255, ${32 * 0})`; }
		if (value > 9) { return `rgb(255, 255, ${32 * 3})`; }
		if (value > 8) { return `rgb(255, 255, ${32 * 4})`; }
		if (value > 7) { return `rgb(255, 255, ${32 * 5})`; }
		if (value > 6) { return `rgb(255, 255, ${32 * 6})`; }
		if (value > 5) { return `rgb(255, 255, ${32 * 7})`; }
		return `rgb(255, 255, 255)`;
	}
	colorSigma(value: number) {
		if (Math.abs(value) < 0.1) { return `rgb(${128 + 16 * 0}, ${128 + 16 * 0}, 255)`; }
		if (Math.abs(value) < 0.2) { return `rgb(${128 + 16 * 1}, ${128 + 16 * 1}, 255)`; }
		if (Math.abs(value) < 0.3) { return `rgb(${128 + 16 * 2}, ${128 + 16 * 2}, 255)`; }
		if (Math.abs(value) < 0.4) { return `rgb(${128 + 16 * 3}, ${128 + 16 * 3}, 255)`; }
		if (Math.abs(value) < 0.5) { return `rgb(${128 + 16 * 4}, ${128 + 16 * 4}, 255)`; }
		if (Math.abs(value) < 0.6) { return `rgb(${128 + 16 * 5}, ${128 + 16 * 5}, 255)`; }
		if (Math.abs(value) < 0.7) { return `rgb(${128 + 16 * 6}, ${128 + 16 * 6}, 255)`; }
		if (Math.abs(value) < 0.8) { return `rgb(${128 + 16 * 7}, ${128 + 16 * 7}, 255)`; }
		return `rgb(255, 255, 255)`;
	}

	// stock item section
	columnDefs(hides?: string[], onChange?: any): any {
		return [{
			field: "id",
			hide: hides && hides.includes("id"),
			editable: false,
			rowDrag: true,
			cellStyle: CELL_STYLE_RIGHT,
			width: 16,
		}, {
			field: "symbolEtfTypeCode",
			headerName: "종목",
			hide: hides && hides.includes("symbolEtfTypeCode"),
			valueGetter: (params: any) => `${params.data.symbol} ${params.data.etf} ${params.data.type} ${params.data.code}`,
			cellRenderer: SymbolEtfTypeCode,
			cellStyle: CELL_STYLE_LEFT,
			width: 96,
		}, {
			field: "symbol",
			headerName: "종목이름",
			hide: hides && hides.includes("symbol"),
			valueFormatter: (params: any) => `${params.value} ${params.data.code}`,
			cellStyle: CELL_STYLE_LEFT,
			width: 96,
			flex: 3,
		}, {
			field: "code",
			headerName: "종목코드",
			hide: hides && hides.includes("code"),
			cellStyle: CELL_STYLE_LEFT,
			width: 32,
		}, {
			field: "priority",
			headerName: "우선순위",
			hide: hides && hides.includes("priority"),
			cellRenderer: PriorityCellRenderer,
			cellStyle: CELL_STYLE_RIGHT,
			width: 8,
		}, {
			field: "priceEarningsRatio",
			headerName: "수익률(%)",
			hide: hides && hides.includes("priceEarningsRatio"),
			valueGetter: (params: any) => this.priceEarningsRatio(params.data.custom?.dividend, params.data?.custom?.histories),
			comparator: (valueA: number, valueB: number, nodeA: any, nodeB: any, isDescending: boolean) => {
				const p = nodeA.data.priority - nodeB.data.priority;
				if (p != 0) {
					return p * (isDescending ? -1 : 1);
				}
                return (valueA - valueB);
            },
			cellRenderer: PriceEarningsRatioCellRenderer,
			cellStyle: (params: any) => ({
				...CELL_STYLE_RIGHT,
				color: this.colorPriceEarningsRatio(params.value),
			}),
			width: 64,
		}, {
			field: "currentPrice",
			headerName: "현재가",
			hide: hides && hides.includes("currentPrice"),
			valueGetter: (params: any) => params.data.custom.dividend?.currentPrice?.toLocaleString(),
			cellRenderer: PriceRecentCellRenderer,
			cellStyle: CELL_STYLE_RIGHT,
			width: 64,
		}, {
			field: "dividend",
			headerName: "최근 배당",
			hide: hides && hides.includes("dividend"),
			cellRenderer: RecentDividendAgGridCellRenderer,
			cellStyle: CELL_STYLE_LEFT,
			width: 64,
		}, {
			field: "dividendPayoutRatio",
			headerName: "배당성향(%)",
			hide: hides && hides.includes("dividendPayoutRatio"),
			valueFormatter: (params: any) => params.data.custom.dividend?.dividendPayoutRatio?.toFixed(2),
			cellStyle: CELL_STYLE_RIGHT,
			width: 16,
		}, {
			field: "baseMonth",
			headerName: "기준월",
			hide: hides && hides.includes("baseMonth"),
			valueGetter: (params: any) => params.data.custom.dividend?.baseMonth ? params.data.custom.dividend?.baseMonth : 0,
			valueFormatter: (params: any) => moment(params.value).format("YYYY-MM"),
			width: 32,
			cellStyle: CELL_STYLE_CENTER,
		}, {
			field: "dividendCycle",
			headerName: "배당주기",
			hide: hides && hides.includes("dividendCycle"),
			cellStyle: CELL_STYLE_LEFT,
			width: 32,
		}, {
			field: "volumeOfListedShares",
			headerName: "상장주식수",
			hide: hides && hides.includes("volumeOfListedShares"),
			valueFormatter: (params: any) => params.value?.toLocaleString(),
			cellStyle: CELL_STYLE_RIGHT,
			width: 32,
		}, {
			field: "etf",
			headerName: "※",
			hide: hides && hides.includes("etf"),
			valueFormatter: (params: any) => `${params.data.etf ? "ETF" : hides && hides.includes("type") ? "" : params.data.type == "KOSPI" ? "-" : params.data.type}`,
			cellStyle: CELL_STYLE_LEFT,
			width: 32,
		}, {
			field: "category",
			headerName: "분류",
			hide: hides && hides.includes("category"),
			cellStyle: CELL_STYLE_LEFT,
			width: 64,
		}, {
			field: "ipoDate",
			headerName: "상장일",
			hide: hides && hides.includes("ipoDate"),
			editable: false,
			valueFormatter: (params: any) => params.value && moment(params.value).format("YYYY-MM"),
			cellStyle: CELL_STYLE_CENTER,
			width: 32,
		}, {
			field: "sigma",
			headerName: "시그마",
			hide: hides && hides.includes("sigma"),
			valueGetter: (params: any) => this.sigma(params.data.custom.dividend),
			valueFormatter: (params: any) => isNaN(params.value) ? "" : params.value.toFixed(2),
			cellStyle: (params: any) => ({
				...CELL_STYLE_RIGHT,
				color: this.colorSigma(params.value),
			}),
			width: 16,
		}, {
			field: "created",
			hide: hides && hides.includes("created"),
			editable: false,
			valueFormatter: (params: any) => this.formatDateReadable(params.value),
			cellStyle: CELL_STYLE_RIGHT,
			width: 16,
		}, {
			field: "updated",
			hide: hides && hides.includes("updated"),
			editable: false,
			valueFormatter: (params: any) => this.formatDateReadable(params.value),
			cellStyle: CELL_STYLE_RIGHT,
			width: 16,
		}, {
			field: "operate",
			hide: hides && hides.includes("operate"),
			headerName: "▦",
			cellRenderer: OperateColumn,
			cellRendererParams: {
				onChange: onChange,
			},
			cellStyle: CELL_STYLE_LEFT,
			width: 48,
		}];
	}

	// stock dividend section
	makeMapDividend(dividends: StockDividendModel[]) {
		const map = new Map();
		dividends.forEach((dividend: StockDividendModel) => map.set(dividend.code, dividend));
		return map;
	}

	// stock dividend history section
	makeMapDividendHistory(histories: any[]) {
		const map = new Map();
		histories.forEach((history: any) => {
			const prev = map.get(history.code);
			if (prev) {
				map.set(history.code, [
					...prev,
					history,
				]);
			} else {
				map.set(history.code, [history]);
			}
		});
		return map;
	}
}
export default new StockStore();
