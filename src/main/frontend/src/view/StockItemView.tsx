import { AgGridReact } from "ag-grid-react";
import React, { useEffect, useRef, useState } from "react";
import moment from "moment";

// domain
import { StockForm } from "../model/StockModel";

// store
import store from "../store/StockStore";
import priceStore from "../store/PriceStore";
import dividendHistoryStore from "../store/DividendHistoryStore";
import DividendHistory from "../model/DividendHistory";
import Price from "../model/Price";
import Item from "../model/Item";

//	StockItemView.tsx
export default ((props: any) => {
	const form = props.form as StockForm;
	const { onChange} = props;

	const gridRef = useRef<AgGridReact>();
	const [rowData, setRowData] = useState<Item[]>([]);
	const [columnDefs, setColumnDefs] = useState([]);

	useEffect(() => {
		const comlumDefs = store.columnDefs(["id", "symbol", "code", "etf", "type", "volumeOfListedShares", "baseMonth", "dividendCycle", "sigma", "created",], onChange);
		setColumnDefs(comlumDefs);
	}, []);
	useEffect(() => {
		const request = {
			keyword: form.keyword,
			start: null,
			end: null,
			size: form.size,
			page: form.page,
		};
		store.searchItem(request, (_: any, result: any) => {
			const items = result?.items;
			if (!items) {
				return;
			}

			const codes = items.map((x: any) => x.code);
			priceStore.search({
					codes: codes,
					start: moment().subtract(14, "days").format("YYYY-MM-DD"),
				}, (_: any, pricesAll: Price[]) => {
				const map = priceStore.makeMap(pricesAll);
				items.forEach((item: Item) => {
					const prices = map.get(item.code)?.sort(priceStore.compare);
					const currentPrice = (prices?.length > 0) ? prices[prices.length - 1].closing : 10000;
					let max = Number.MIN_SAFE_INTEGER;
					let min = Number.MAX_SAFE_INTEGER;
					prices?.forEach((price: Price) => {
						max = Math.max(max, price.closing);
						min = Math.min(min, price.closing);
					});
					item.custom = {
						...item.custom,
						prices: prices,
						currentPrice: currentPrice,
						minPrice: min,
						maxPrice: max,
					};
				});
				dividendHistoryStore.search({
						start: moment().subtract(10, "years").startOf("year").format("YYYY-MM-DDTHH:mm:ss.SSSZZ"),
						codes: codes,
					}, (_: any, historiesAll: DividendHistory[]) => {
					const map = dividendHistoryStore.makeMap(historiesAll.filter((history: DividendHistory) => history.dividend > 0));
	
					items.forEach((item: Item) => {
						const histories = map.get(item.code)?.sort(dividendHistoryStore.compare);
						const mapHistory = dividendHistoryStore.makeMapByYearMonth(histories);
						item.custom = {
							...item.custom,
							histories: histories,
							mapHistory: mapHistory,
						};
					});
					setRowData(items);
				});
			});
		});
		return function() { setRowData([]); };
	}, [form]);

	function handleOnGridReady(_: any) {
		gridRef?.current?.columnApi?.applyColumnState({
			state: [{ colId: 'priceEarningsRatio', sort: 'desc' }],
			defaultState: { sort: null },
		});
		gridRef?.current?.api?.sizeColumnsToFit();
		gridRef?.current?.api?.setDomLayout("autoHeight");
	}

	return (<>
		<AgGridReact
			className="ag-theme-balham-dark"
			ref={gridRef}
			rowData={rowData}
			columnDefs={columnDefs}
			defaultColDef={{
				editable: true,
				sortable: true,
				resizable: true,
				suppressMenu: true,
			}}
			rowHeight={form?.rowHeight}
			rowDragManaged={true}
			onGridReady={handleOnGridReady}
		/>
	</>);
});
