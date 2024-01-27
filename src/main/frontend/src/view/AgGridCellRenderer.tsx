import moment from "moment";
import React, { useEffect, useRef, useState } from "react";
import { Button, Col, OverlayTrigger, Row, Spinner, Table, Tooltip } from "react-bootstrap";

// model
import Price from "../model/Price";

// store
import store from "../store/StockStore";
import DividendHistory from "../model/DividendHistory";
import crawlStore from "../store/CrawlStore";
import Item from "../model/Item";

const FILL_COLOR_PRIORITY = [
	`rgb(128, 0, 0)`,
	`rgb(128, 32, 32)`,
	`rgb(128, 64, 64)`,
	`rgb(128, 96, 96)`,

	`rgb(128, 128, 0)`,
	`rgb(128, 128, 32)`,
	`rgb(128, 128, 64)`,
	`rgb(128, 128, 96)`,

	`rgb(0, 0, 128)`,
	`rgb(32, 32, 128)`,
	`rgb(64, 64, 128)`,
	`rgb(96, 96, 128)`,

	`rgb(128, 128, 0)`,
	`rgb(128, 128, 64)`,
	`rgb(128, 128, 128)`,
	`rgb(128, 128, 192)`,

	`rgb(0, 0, 0)`,
];
const FILL_COLOR_MONTH = [
	`rgb(64, 64, 64)`,
	`rgb(96, 96, 96)`,
	`rgb(128, 128, 128)`,

	`rgb(0, 128, 0)`,
	`rgb(0, 96, 0)`,
	`rgb(0, 64, 0)`,

	`rgb(128, 96, 0)`,
	`rgb(96, 64, 0)`,
	`rgb(64, 32, 0)`,

	`rgb(128, 0, 0)`,
	`rgb(96, 0, 0)`,
	`rgb(64, 0, 0)`,

	`rgb(0, 0, 0)`,
];

// AgGridCellRenderer.tsx

// 주가
export function PriceRecentCellRenderer(param: any) {
	const COUNT = 14;
	const prices: Price[] = param.data?.custom?.prices;
	if (!prices) {
		return (<>No Data</>);
	}

	const info = {
		min : param.data?.custom?.minPrice + 1,
		max : param.data?.custom?.maxPrice,
	};

	const ref = useRef(null);
	const lineHeight = (param?.node?.rowHeight || 32) - 4;

	//	툴팁
	function chart(minmax: any, prices: Price[], maxheight: number, format?: string) {
		return (<>
			<Row className="m-0 p-0"> {
				prices.map((price: Price) => (
					<Col key={price.id} className={"px-0 bg-primary"}
						title={moment(price.base).format("YYYY-MM-DD (dd)")}
						style={{
							marginRight: 1,
							height: height(maxheight, price, minmax) + 16,
							marginTop: maxheight - height(maxheight, price, minmax),
							fontSize: 8,
						 }}
					 >
					 	<Row className="m-0 p-0 text-center"><Col className="m-0 p-0 text-center">{moment(price.base).format(format || "YYYY-MM-DD")}</Col></Row>
				 		<Row className="m-0 p-0 text-center"><Col className="m-0 p-0 text-center">{price.closing.toLocaleString()}</Col></Row>
			 	</Col>
				))
			}</Row>
		</>);
	}
	function renderTooltip(props: any) {
		const yearPrices: Price[] = param.data?.custom?.yearPrices?.slice(0, COUNT).reverse() || [];
		const monthPrices: Price[] = param.data?.custom?.monthPrices?.slice(0, COUNT).reverse() || [];
		const weekPrices: Price[] = param.data?.custom?.weekPrices?.slice(0, COUNT).reverse() || [];
		const minmax = {
			min: Number.MAX_SAFE_INTEGER,
			max: Number.MIN_SAFE_INTEGER,
		};
		yearPrices.forEach((price: Price) => {
			minmax.min = Math.min(minmax.min, price.closing);
			minmax.max = Math.max(minmax.max, price.closing);
		});
		monthPrices.forEach((price: Price) => {
			minmax.min = Math.min(minmax.min, price.closing);
			minmax.max = Math.max(minmax.max, price.closing);
		});
		weekPrices.forEach((price: Price) => {
			minmax.min = Math.min(minmax.min, price.closing);
			minmax.max = Math.max(minmax.max, price.closing);
		});
		return (
			<Tooltip className="mytooltip" {...props}>
				<h5 className="pt-1">일단위</h5>
				{chart(info, prices, 64, "MM-DD")}
				<h5 className="pt-4">주단위</h5>
				{chart(minmax, weekPrices, 64, "MM-DD")}
				<h5 className="pt-4">월단위</h5>
				{chart(minmax, monthPrices, 64, "YYYY-MM")}
				<h5 className="pt-4">연단위</h5>
				{chart(minmax, yearPrices, 64, "YYYY")}
			</Tooltip>
		);
	}
	function height(maxHeight: number, price: Price, info: any): number {
		if (isNaN(price?.closing) || isNaN(info?.min) || isNaN(info?.max) || isNaN(maxHeight)
			|| (info.max == info.min) || (maxHeight == 0)) {
			return 1;
		}

		return Math.max(4, Math.floor((price.closing - info.min) / (info.max - info.min) * maxHeight));
	}
	function currentPrice(): string {
		if (param?.value > 0) {
			return param?.value;
		}

		if (!prices || prices.length == 0) {
			return "-";
		}

		const price = prices[prices.length - 1];
		return price.closing.toLocaleString();
	}
	return (<>
		<OverlayTrigger overlay={renderTooltip} trigger={["hover", "hover"]} placement="auto">
			<Row className="mx-0 text-right h-100">
				<Col sm="5" md="4" xl="3" xxl="3" className="m-0 p-0 text-right">{currentPrice()}</Col>
				<Col ref={ref} className="ms-2 p-0">
					<Row className="m-0 p-0"> {
						prices?.map((price: Price) => (
							<Col key={price.id} className={"px-0 bg-primary"}
								style={{
									marginRight: 1,
									height: height(param?.node?.rowHeight, price, info),
									marginTop: lineHeight - height(param?.node?.rowHeight, price, info),
								 }}
							 ></Col>
						))
					}</Row>
				</Col>
			</Row>
		</OverlayTrigger>
	</>);
}

// 종목이름 타입 코드
export function SymbolTypeCode(param: any) {
	const data: Item = param.data;

	return (<>
		<Row className="mx-0 px-0">
			<Col className={`ms-1 px-0 text-start text-truncate${data.ipoClose ? " text-decoration-line-through" : ""}`}>{data.symbol}</Col>
			<Col xs="auto" className="ms-1 px-0 text-end">
				{
					"ETF" == data.type
						? (<><Button variant="outline-success" className="py-0 px-1" style={{ fontSize: 8 }}>ETF</Button></>)
						: data.type == "KOSPI"
							? (<><Button variant="outline-light" className="py-0 px-1" style={{ fontSize: 8 }}>KOSPI</Button></>)
							: !data.type ? ""
								: (<><Button variant="outline-danger" className="py-0 px-1" style={{ fontSize: 8 }}>{data.type}</Button></>)
				}
				<span className="ms-1" style={{ fontSize: 8 }}>{data.code}</span>
			</Col>
		</Row>
	</>);
}

// 우선순위 = 선호도
export function PriorityCellRenderer(param: any) {
	const { value, data, api, node } = param;
	const width = 16 - (value % 4) * 2;

	useEffect(() => {
	}, []);

	async function handleOnClickLike() {
		store.updateItem({
			id: data.id,
			priority: data.priority - 1,
		}, () => {
			data.priority = data.priority - 1;
			api.redrawRows({ rowNodes: [node] });
		});
	}
	async function handleOnClickDisike() {
		store.updateItem({
			id: data.id,
			priority: data.priority + 1,
		}, () => {
			data.priority = data.priority + 1;
			api.redrawRows({ rowNodes: [node] });
		});
	}

	return (<>
		<Row title={value}>
			<Col className="m-0 p-0">
				<svg className="mb-2 mx-1" width={width} height={width} viewBox="0 -1 32 32" version="1.1" xmlns="http://www.w3.org/2000/svg" fill="none" stroke="#ff0000">
					<g id="SVGRepo_bgCarrier" strokeWidth="0"></g><g id="SVGRepo_tracerCarrier" strokeLinecap="round" strokeLinejoin="round"></g>
					<g id="SVGRepo_iconCarrier">
						<g id="Page-1" stroke="none" strokeWidth="1" fill="none" fillRule="evenodd">
							<g id="Icon-Set-Filled" transform="translate(-102.000000, -882.000000)" fill={FILL_COLOR_PRIORITY[value]}>
								<path d="M126,882 C122.667,882 119.982,883.842 117.969,886.235 C116.013,883.76 113.333,882 110,882 C105.306,882 102,886.036 102,890.438 C102,892.799 102.967,894.499 104.026,896.097 L116.459,911.003 C117.854,912.312 118.118,912.312 119.513,911.003 L131.974,896.097 C133.22,894.499 134,892.799 134,890.438 C134,886.036 130.694,882 126,882" id="heart-like" />
							</g>
						</g>
					</g>
				</svg>
			</Col>
			<Col xs="4" className="mx-1 my-0 p-0">
				<Row className="mx-0 p-0" style={{ lineHeight: 1, marginTop: -2 }} onClick={handleOnClickLike}>⇧</Row>
				<Row className="mx-0 p-0" style={{ lineHeight: 1, marginTop: 1 }} onClick={handleOnClickDisike}>⇩</Row>
			</Col>
		</Row>
	</>);
};

// 최근 배당수익률
export function PriceEarningsRatioCellRenderer(param: any) {
	const YEARS = 7;
	const mapHistory = param?.data?.custom?.mapHistory;
	if (!mapHistory) {
		return (<></>);
	}
	
	const thisYear = moment().year();
	const dividends = [];
	store.range(YEARS).forEach((cx: number) => dividends.push(mapHistory.get(thisYear - YEARS + cx + 1) || 0));
	const max = dividends.reduce((prev: number, curr: number) => Math.max(prev, curr), 0);
	const lineHeight = param.node.rowHeight - 4;
	
	function height(limit: number, max: number, value: number): number {
		if (isNaN(limit) || isNaN(max) || isNaN(value) || value == 0) {
			return 1;
		}

		return Math.max(4, Math.floor(limit * value / max));
	}

	if (max <= 0) {
		return (<></>);
	}

	function renderTooltip(props: any) {
		let years = Math.min(11, moment().year() - moment(param?.data?.ipoOpen).year() + 1);
		return (
			<Tooltip className="mytooltip border bg-black m-0 p-1" {...props}>
				<Row className="m-0 py-1">{param?.data?.symbol}</Row>
				<table className="m-0 p-0 w-100" style={{ fontSize: 10 }}><tbody>
					<tr className="py-0 text-start"><th colSpan={2}>배당 금액 (원)</th></tr>
					<tr className="mb-4 py-0">
						<td>{dividendTableAmount(mapHistory, moment(param?.data?.ipoOpen))}</td>
						<td className="m-0 p-0 align-top" style={{width: 32 * years, }}>{dividendBarGraphAmount(mapHistory, moment(param?.data?.ipoOpen))}</td>
					</tr>

					<tr><th className="pt-2 text-start" colSpan={2}>배당수익율 (%, 현재가 기준 {param?.data?.custom?.currentPrice?.toLocaleString()})</th></tr>
					<tr className="mb-4">
						<td>{dividendTableRatioByCurrentPrice(mapHistory, moment(param?.data?.ipoOpen), param?.data?.custom?.currentPrice)}</td>
						<td className="m-0 p-0 align-top">{dividendBarGraphRatioByCurrentPrice(mapHistory, moment(param?.data?.ipoOpen), param?.data?.custom?.currentPrice)}</td>
					</tr>

					<tr><th className="pt-2 text-start" colSpan={2}>배당수익율 (%, 당시 주가 기준)</th></tr>
					<tr className="mb-4">
						<td>{dividendTableRatioByClosingPrice(mapHistory, moment(param?.data?.ipoOpen))}</td>
						<td className="m-0 p-0 align-top">{dividendBarGraphRatioByClosingPrice(mapHistory, moment(param?.data?.ipoOpen), param?.data?.custom?.currentPrice)}</td>
					</tr>
				</tbody></table>
			</Tooltip>
		);
	};

	return (<>
		<OverlayTrigger overlay={renderTooltip} trigger={["click", ]} placement="auto">
			<Row className="mx-0 text-right">
				<Col sm="4" md="3" xl="2" xxl="2" className="m-0 p-0">
					<span>{param.value?.toFixed(2)}</span>
				</Col>
				<Col sm="8" md="9" xl="10" xxl="10">
					<Row className="m-0 p-0">{
						dividends.map((cx: number, index: number) => {
							const ipoYear = param?.data?.ipoOpen ? moment(param.data.ipoOpen).year() : 2000;
							if (ipoYear > (thisYear - YEARS + index + 1)) {
								return (
									<Col key={index}
										className="px-0 bg-black"
										style={{
											marginLeft: 0,
											height: lineHeight,
											marginTop: 0,
										}}
									></Col>
								);
							}
							return (
								<Col key={index}
									className={`px-0 ${index == YEARS - 1 ? "bg-danger" : cx > 0 ? "bg-primary" : "bg-black"}`}
									style={{
										marginLeft: 2,
										height: height(lineHeight, max, cx),
										marginTop: lineHeight - height(lineHeight, max, cx),
									}}
								></Col>
							);
						})
					}</Row>
				</Col>
			</Row>
		</OverlayTrigger>
	</>);
};

function dividendTableAmount(mapHistory: any, start: any) {
	const end = moment().add(1, "year").startOf("year");
	if (start.isBefore(end.clone().subtract(11, "years"))) {
		start = end.clone().subtract(11, "years");
	}
	return (
		<Table bordered striped size="sm" variant="dark" className="my-0 py-0" style={{ fontSize: 10 }}>
			<thead><tr className="my-0 py-0">
				<th>연도</th>
				{
					store.range(12).map((cy: number) => (
						<th key={Math.random()} className="text-end px-1">{cy + 1}</th>
					))
				}
				<th className="text-end px-1">합계</th>
			</tr></thead><tbody>
				{
					store.range(end.year() - start.year()).map((cx: number) => (<tr key={Math.random()} className="my-0 py-0">
						<th className="px-1 py-0">{start.year() + cx}</th>
						{
							store.range(12).map((cy: number) => {
								const history = mapHistory.get(moment([start.year() + cx, cy]).format("YYYY-MM"));
								if (history?.dividend > 0) {
									return (
										<td key={Math.random()} className="text-end px-1 py-0">{history?.dividend?.toLocaleString()}</td>
									);
								}
								return (<td key={Math.random()}></td>);
							})
						}
						<th className="text-end px-1 py-0">{mapHistory.get(start.year() + cx)?.toLocaleString()}</th>
					</tr>))
				}
			</tbody></Table>
	);
}
function dividendTableRatioByClosingPrice(mapHistory: any, start: any) {
	const end = moment().add(1, "year").startOf("year");
	if (start.isBefore(end.clone().subtract(11, "years"))) {
		start = end.clone().subtract(11, "years");
	}
	return (
		<Table bordered striped size="sm" variant="dark" className="my-0 py-0" style={{ fontSize: 10 }}>
			<thead><tr>
				<th>연도</th>{
					store.range(12).map((cy: number) => (
						<th key={cy} className="text-end px-1">{cy + 1}</th>
					))
				}
				<th className="text-end px-1">합계</th>
			</tr></thead><tbody>{
				store.range(end.year() - start.year()).map((cx: number) => (
					<tr key={Math.random()}>
						<th className="px-1 py-0">{start.year() + cx}</th>{
							store.range(12).map((cy: number) => {
								const history: DividendHistory = mapHistory.get(moment([start.year() + cx, cy]).format("YYYY-MM"));
								if (!history?.dividend || !history?.priceClosing) {
									return (<td key={Math.random()}></td>);
								}

								return (
									<td key={cy} className="text-end px-1 py-0">{(history?.dividend / history?.priceClosing * 100)?.toFixed(2)}</td>
								);
							})
						}<th className="text-end px-1 py-0">{mapHistory.get(start.year() + cx + 0.1)?.toFixed(2)}</th>
					</tr>
				))
			}</tbody></Table>
	);
}
function dividendTableRatioByCurrentPrice(mapHistory: any, start: any, currentPrice?: number) {
	const end = moment().add(1, "year").startOf("year");
	if (start.isBefore(end.clone().subtract(11, "years"))) {
		start = end.clone().subtract(11, "years");
	}
	return (
		<Table bordered striped size="sm" variant="dark" className="my-0 py-0" style={{ fontSize: 10 }}>
			<thead><tr>
				<th>연도</th>
				{
					store.range(12).map((cy: number) => (
						<th key={Math.random()} className="text-end px-1">{cy + 1}</th>
					))
				}
				<th className="text-end px-1">합계</th>
			</tr></thead><tbody>
				{
					store.range(end.year() - start.year()).map((cx: number) => (<tr key={Math.random()}>
						<th className="px-1 py-0">{start.year() + cx}</th>
						{
							store.range(12).map((cy: number) => {
								const history = mapHistory.get(moment([start.year() + cx, cy]).format("YYYY-MM"));
								if (history?.dividend > 0) {
									return (
										<td key={Math.random()} className="text-end px-1 py-0">{(history?.dividend / currentPrice * 100)?.toFixed(2)}</td>
									);
								}
								return (<td key={Math.random()}></td>);
							})
						}
						<th className="text-end px-1 py-0">{(mapHistory.get(start.year() + cx) / currentPrice * 100)?.toFixed(2)}</th>
					</tr>))
				}
			</tbody></Table>
	);
}
function dividendBarGraphRatioByClosingPrice(mapHistory: any, start: any, currentPrice?: number) {
	const end = moment().add(1, "year").startOf("year");
	if (start.isBefore(end.clone().subtract(11, "years"))) {
		start = end.clone().subtract(11, "years");
	}
	let max = 0;
	store.range(end.year() - start.year()).map((cx: number) => max = Math.max(max, (mapHistory.get(start.year() + cx) || 0) * 100 / currentPrice, mapHistory.get(start.year() + cx + 0.1) || 0));
	if (max == 0) {
		return (<></>);
	}

	const scale = (end.year() - start.year() + 1) / 1 * 100;
	return (
		<Row className="bg-black m-0 p-0" style={{ top: 0, }}>{
			store.range(end.year() - start.year()).map((cx: number) => (
				<Col key={cx} className="m-0 p-0">
					<Row className="m-0 p-0" style={{ height: `${scale}%`, }}>
						<OverlayTrigger overlay={<Tooltip>{start.year() + cx}년: {(mapHistory.get(start.year() + cx + 0.1) || 0).toFixed(2)}%</Tooltip>}>
							<Col className="m-0 p-0" style={{ verticalAlign: "top", }}>
								<Row className="mx-1 px-0" style={{
										height: `${(max - (mapHistory.get(start.year() + cx + 0.1) || 0)) * 100 / max}%`,
								}}>
									<Col/>
								</Row>
								{
									store.range(12).map((cy: number) => {
										const history = mapHistory.get(moment([start.year() + cx, 11 - cy]).format("YYYY-MM"));
										if (history?.dividend && history?.priceClosing) {
											return (
												<OverlayTrigger key={cy} overlay={<Tooltip>{moment([start.year() + cx, 11 - cy]).format("YYYY-MM")}: {((history.dividend / history.priceClosing * 100) || 0).toFixed(2)}%</Tooltip>}>
													<Row className="mx-1 px-0" style={{
															height: `${history.dividend / history.priceClosing * 100 * 100 / max}%`,
															backgroundColor: FILL_COLOR_MONTH[11 - cy],
													}}>
														<Col/>
													</Row>
												</OverlayTrigger>
											);
										}
									})
								}
							</Col>
						</OverlayTrigger>
					</Row>
					<Row className="m-0 p-0">
						<Row className="bg-secondary m-0 p-0 d-none"><Col className="m-0 p-0">{(mapHistory.get(start.year() + cx + 0.1) || 0).toFixed(2)}</Col></Row>
						<Row className="bg-secondary m-0 p-0"><Col className="m-0 p-0">{start.year() + cx}</Col></Row>
					</Row>
				</Col>
			))
			
		}</Row>
	);
}
function dividendBarGraphRatioByCurrentPrice(mapHistory: any, start: any, currentPrice: number) {
	const end = moment().add(1, "year").startOf("year");
	currentPrice = currentPrice || 1;
	if (start.isBefore(end.clone().subtract(11, "years"))) {
		start = end.clone().subtract(11, "years");
	}
	let max = 0;
	store.range(end.year() - start.year()).map((cx: number) => max = Math.max(max, (mapHistory.get(start.year() + cx) || 0) * 100 / currentPrice, mapHistory.get(start.year() + cx + 0.1) || 0));
	//store.range(end.year() - start.year()).map((cx: number) => max = Math.max(max, mapHistory.get(start.year() + cx + 0.1) || 0));
	if (max == 0) {
		return (<></>);
	}

	const scale = (end.year() - start.year() + 1) / 1 * 100;

	return (
		<Row className="bg-black m-0 p-0 text-center" style={{ top: 0, }}>{
			store.range(end.year() - start.year()).map((cx: number) => (
				<Col key={cx} className="m-0 p-0">
					<Row className="m-0 p-0" style={{ height: `${scale}%`, }}>
						<OverlayTrigger overlay={<Tooltip>{start.year() + cx}년: {((mapHistory.get(start.year() + cx) || 0) * 100 / currentPrice).toFixed(2)}%</Tooltip>}>
							<Col className="m-0 p-0" style={{ verticalAlign: "top", }}>
								<Row className="m-0 p-0" style={{
										height: `${(max - ((mapHistory.get(start.year() + cx) / currentPrice) || 0) * 100) * 100 / max}%`,
								}}>
									<Col/>
								</Row>
								{
									store.range(12).map((cy: number) => {
										const history = mapHistory.get(moment([start.year() + cx, 11 - cy]).format("YYYY-MM"));
										if (history?.dividend > 0) {
											return (
												<OverlayTrigger key={cy} overlay={<Tooltip>{moment([start.year() + cx, 11 - cy]).format("YYYY-MM")}: {((history.dividend / currentPrice * 100) || 0).toFixed(2)}%</Tooltip>}>
													<Row className="mx-1 px-0" style={{
															height: `${(history.dividend / currentPrice) * 10000 / max}%`,
															backgroundColor: FILL_COLOR_MONTH[11 - cy],
													}}>
														<Col/>
													</Row>
												</OverlayTrigger>
											);
										}
									})
								}
							</Col>
						</OverlayTrigger>
					</Row>
					<Row className="m-0 p-0">
						<Row className="bg-secondary m-0 p-0 d-none"><Col className="m-0 p-0">{((mapHistory.get(start.year() + cx) || 0) * 100 / currentPrice).toFixed(2)}</Col></Row>
						<Row className="bg-secondary m-0 p-0"><Col className="m-0 p-0">{start.year() + cx}</Col></Row>
					</Row>
				</Col>
			))
			
		}</Row>
	);
}
function dividendBarGraphAmount(mapHistory: any, start: any) {
	const end = moment().add(1, "year").startOf("year");
	if (start.isBefore(end.clone().subtract(11, "years"))) {
		start = end.clone().subtract(11, "years");
	}
	let max = 0;
	store.range(end.year() - start.year()).map((cx: number) => max = Math.max(max, mapHistory.get(start.year() + cx) || 0));
	if (max == 0) {
		return (<></>);
	}

	const scale = (end.year() - start.year() + 1) / 1 * 100;
	return (
		<Row className="bg-black m-0 p-0" style={{ top: 0, }}>{
			store.range(end.year() - start.year()).map((cx: number) => (
				<Col key={cx} className="m-0 p-0">
					<Row className="m-0 p-0" style={{ height: `${scale}%`, }}>
						<OverlayTrigger overlay={<Tooltip>{start.year() + cx}년: {(mapHistory.get(start.year() + cx) || 0).toLocaleString()}원</Tooltip>}>
							<Col className="m-0 p-0" style={{ verticalAlign: "top", }}>
								<Row className="bg-black mx-1 px-0" style={{
										height: `${(max - (mapHistory.get(start.year() + cx) || 0)) * 100 / max}%`,
								}}>
									<Col/>
								</Row>
								{
									store.range(12).map((cy: number) => {
										const history = mapHistory.get(moment([start.year() + cx, 11 - cy]).format("YYYY-MM"));
										if (history?.dividend > 0) {
											return (
												<OverlayTrigger key={cy} overlay={<Tooltip>{moment([start.year() + cx, 11 - cy]).format("YYYY-MM")}: {((history.dividend) || 0).toLocaleString()}원</Tooltip>}>
													<Row className="mx-1 px-0" style={{
															height: `${history.dividend * 100 / max}%`,
															backgroundColor: FILL_COLOR_MONTH[11 - cy],
													}}>
														<Col/>
													</Row>
												</OverlayTrigger>
											);
										}
									})
								}
							</Col>
						</OverlayTrigger>
					</Row>
					<Row className="m-0 p-0">
						<Row className="text-center bg-secondary m-0 p-0 d-none"><Col className="m-0 p-0">{(mapHistory.get(start.year() + cx) || 0).toLocaleString()}</Col></Row>
						<Row className="text-center bg-secondary m-0 p-0"><Col className="m-0 p-0">{start.year() + cx}</Col></Row>
					</Row>

				</Col>
			))
			
		}</Row>
	);
}

// 최근 배당금
export function RecentDividendAgGridCellRenderer(param: any) {
	const histories: DividendHistory[] = param?.data?.custom?.histories;
	const mapHistory = param?.data?.custom?.mapHistory;
	const currentPrice = param?.data?.custom?.currentPrice;
	if (!histories || !mapHistory || !currentPrice) {
		return (<></>);
	}

	const FONT_SIZE = 10;
	const { data } = param;

	const [nomalized, setNomalized] = useState<{}>();
	const [start, setStart] = useState<any>();
	const [end, setEnd] = useState<any>();
	const [max, setMax] = useState<number>();
	useEffect(() => {
		const map = new Map();
		let start_ = moment();
		const end_ = moment().add(1, "year").startOf("year");
		let data_ = {};
		histories?.forEach((history: any) => {
			const date = moment(history.base);
			if (date.isBefore(start_)) {
				start_ = date.clone().startOf("year");
			}
			map.set(date.format('YYYY-MM'), history);
			data_ = {
				...data_,
				[date.year()]: {
					...data_[date.year()],
					[date.month()]: history.dividend,
				}
			};
		});
		let max_ = 0;
		for (let cx = start_.clone(); cx.isBefore(end_); cx = cx.add(1, "years")) {
			let date = cx.clone();
			data_[date.year()] = {
				...data_[date.year()],
				[13]: 0,
			};
			for (let cy = 0; cy < 12; cy++) {
				const history = map.get(moment(date).format('YYYY-MM'));
				if (history) {
					data_[date.year()][date.month()] = history.dividend;
					data_[date.year()][13] = data_[date.year()][13] + history.dividend;
				}
				date = date.add(1, "months");
			}
			if (max_ < data_[cx.year()][13]) {
				max_ = data_[cx.year()][13];
			}
		}
		setStart(start_);
		setEnd(end_);
		setMax(max_);
		setNomalized(data_);
	}, [data]);


	function renderTooltipTheme2() {
		return (
			<Table bordered striped size="sm" variant="dark" className="my-0 py-0" style={{ fontSize: FONT_SIZE }}>
				<thead><tr>
					<th>연도</th>
					{
						store.range(12).map((cy: number) => (
							<th key={Math.random()} className="text-end px-1">{cy + 1}</th>
						))
					}
					<th className="text-end px-1">합계</th>
				</tr></thead><tbody>
					{
						store.range(end.year() - start.year()).map((cx: number) => (<tr key={Math.random()}>
							<th className="px-1">{start.year() + cx}</th>
							{
								store.range(12).map((cy: number) => {
									const history = mapHistory.get(moment([start.year() + cx, cy]).format("YYYY-MM"));
									if (history?.dividend > 0) {
										return (
											<td key={Math.random()} className="text-end px-1">{(history?.dividend / currentPrice * 100)?.toFixed(2)}</td>
										);
									}
									return (<td key={Math.random()}></td>);
								})
							}
							<th className="text-end px-1">{(mapHistory.get(start.year() + cx) / currentPrice * 100)?.toFixed(2)}</th>
						</tr>))
					}
				</tbody></Table>
		);
	}
	function renderTooltipTheme3() {
		return (
			<Table bordered striped size="sm" variant="dark" className="my-0 py-0" style={{ fontSize: FONT_SIZE }}>
				<thead><tr>
					<th>연도</th>{
						store.range(12).map((cy: number) => (
							<th key={cy} className="text-end px-1">{cy + 1}</th>
						))
					}
					<th className="text-end px-1">합계</th>
				</tr></thead><tbody>{
					store.range(end.year() - start.year()).map((cx: number) => (
						<tr key={Math.random()}>
							<th className="px-1">{start.year() + cx}</th>{
								store.range(12).map((cy: number) => {
									const history: DividendHistory = mapHistory.get(moment([start.year() + cx, cy]).format("YYYY-MM"));
									if (!history?.dividend || !history?.priceClosing) {
										return (<td key={Math.random()}></td>);
									}
	
									return (
										<td key={cy} className="text-end px-1">{(history?.dividend / history?.priceClosing * 100)?.toFixed(2)}</td>
									);
								})
							}<th className="text-end px-1">{mapHistory.get(start.year() + cx + 0.1)?.toFixed(2)}</th>
						</tr>
					))
				}</tbody></Table>
		);
	}
	function renderTooltip(props: any) {
		return (
			<Tooltip className="mytooltip" {...props}>
				<Row className="m-2 mb-0 py-0">금액 (원)</Row>
				{dividendTableAmount(mapHistory, start)}
				<Row className="m-2 mb-0 py-0">배당수익율 (%, 현재가 기준 {data?.custom?.currentPrice?.toLocaleString()})</Row>
				{renderTooltipTheme2()}
				<Row className="m-2 mb-0 py-0">배당수익율 (%, 당시 주가 기준)</Row>
				{renderTooltipTheme3()}
			</Tooltip>
		);
	};
	function p(y: number, m: number): number {
		if (nomalized[y]) {
			if (nomalized[y][m]) {
				return nomalized[y][m] / max * 99;
			}
		}
		return 0;
	}

	if (!nomalized) {
		return (<></>);
	}

	return (<>
		<OverlayTrigger overlay={renderTooltip} trigger={["hover", "hover"]} placement="auto" key={Math.random()}>
			<Row className="m-0 p-0 h-100">{
				store.range(5).map((cx: number, index: number) => (
					<Row key={index} className="mx-0 p-0" style={{ height: (param?.node?.rowHeight - 4) / 5 - 2, marginTop: 1 }}>{
						store.range(12).map((cy: number, indexy: number) => {
							if (p(end.year() - 5 + cx, cy) > 0) {
								return (
									<span key={indexy} className="mx-0 px-0" style={{ width: `${p(end.year() - 5 + cx, cy)}%`, backgroundColor: FILL_COLOR_MONTH[cy] }}> </span>
								);
							}
						})
					}</Row>
				))
			}</Row>
		</OverlayTrigger>
	</>);
}

// 종목별 기능
export function OperateColumn(props: any) {
	const { data, onChange } = props;

	const [spinner, setSpinner] = useState<boolean>(false);

	async function handleOnClickPriceChart(_: any) {
		window.open(`https://finance.naver.com/item/fchart.naver?code=${data.code}`, "네이버");
	}
	async function handleOnClickDetail(_: any) {
		window.open(`https://finance.naver.com/item/coinfo.naver?code=${data.code}`, "네이버");
	}
	async function handleOnClickCrawl(_: any) {
		setSpinner(true);
		crawlStore.crawlItem(data, (_: any) => {
			setSpinner(false);
			onChange && onChange({});
		});
	}

	const style = {
		fontSize: 9,
	};
	const className="py-0 text-white";
	return (<>
		{spinner
			? (<Spinner animation="grow" variant="warning" size="sm" className="ms-0 me-1 align-middle" />)
			: (<>
				<Button size="sm" variant="outline-secondary" className={className} style={style} onClick={handleOnClickPriceChart} title="네이버 증권 시세 차트">차트</Button>
				<Button size="sm" variant="outline-secondary" className={className} style={style} onClick={handleOnClickDetail} title="네이버 증권 상세">상세</Button>
				<Button size="sm" variant="outline-secondary" className={className} style={style} onClick={handleOnClickCrawl} title="수집">수집</Button>
			</>)}
	</>);
}
