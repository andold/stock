import { AgGridReact } from "ag-grid-react";
import React, { useCallback, useEffect, useRef, useState } from "react";

// domain
import StockDividendModel, { StockDividendFormModel, StockItemModel } from "../model/StockModel";

// store
import store from "../store/StockStore";
import moment from "moment";

//	StockItemView.tsx
export default ((props: any) => {
	const form = props.form as StockDividendFormModel;
	const { priceEarningsRatio, onChange} = props;

	const gridRef = useRef<AgGridReact>();
	const [rowData, setRowData] = useState<StockItemModel[]>([]);
	const [columnDefs, setColumnDefs] = useState([]);

	useEffect(() => {
		const comlumDefs = store.columnDefsItem(["id", "symbol", "code", "etf", "type", "volumeOfListedShares", "baseMonth", "dividendCycle", "ipoDate", "sigma", "operate", "created",], onChange);
		setColumnDefs(comlumDefs);
		const request = {
			keyword: form.keyword,
			start: null,
			end: null,
			priceEarningsRatio: priceEarningsRatio,
		};
		if (form.keyword?.length > 0) {
			request.start = form.start?.format("YYYY-MM-DDTHH:mm:ss.SSSZZ");
			request.end = form.end?.format("YYYY-MM-DDTHH:mm:ss.SSSZZ");
		} else {
		}
		store.searchItem(request, (_: any, items: StockItemModel[]) => {
			whenItemChange(items);
		});
		return function() { setRowData([]); };
	}, [form, priceEarningsRatio]);
	useEffect(() => {
	}, [form]);

	function whenItemChange(items: StockItemModel[]) {
		const request = {
			keyword: null,
			start: null,
			end: null,
		};
		store.search(request, (_: any, dividends: StockDividendModel[]) => {
			const map = store.makeMapDividend(dividends);
			items.forEach((item: StockItemModel) => {
				item.custom = {
					...item.custom,
					dividend: map.get(item.code),
				};
			});
			whenItemDividendChange(items);
		});
	}
	function whenItemDividendChange(items: StockItemModel[]) {
		const request = {
			start: moment().subtract(10, "years").startOf("year").format("YYYY-MM-DDTHH:mm:ss.SSSZZ"),
		};
		store.searchDividendHistory(request, (_: any, histories: any[]) => {
			const map = store.makeMapDividendHistory(histories);
			items.forEach((item: StockItemModel) => {
				item.custom = {
					...item.custom,
					histories: map.get(item.code),
				};
			});
			setRowData(items);
		});
	}

	function doesExternalFilterPass(node: any) {
		return (!form.etf && !form.kospi && !form.kosdaq)
			|| (form.etf && node.data.etf)
			|| (form.kospi && !node.data.etf && node.data.type === "KOSPI")
			|| (form.kosdaq && node.data.type === "KOSDAQ")
			;
	}
	function handleOnGridReady(_: any) {
		gridRef?.current?.columnApi?.applyColumnState({
			state: [{ colId: 'priceEarningsRatio', sort: 'desc' }],
			defaultState: { sort: null },
		});
		//gridRef?.current?.columnApi?.autoSizeAllColumns();
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
			isExternalFilterPresent={() => true}
			doesExternalFilterPass={doesExternalFilterPass}
			rowDragManaged={true}
			onGridReady={handleOnGridReady}
		/>
	</>);
});
