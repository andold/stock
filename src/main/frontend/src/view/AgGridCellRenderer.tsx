import moment from "moment";
import React, { useEffect, useRef, useState } from "react";
import { Button, Col, OverlayTrigger, Row, Spinner, Table, Tooltip } from "react-bootstrap";

// model
import StockDividendModel from "../model/StockModel";
import Price from "../model/Price";

// store
import store from "../store/StockStore";
import itemStore from "../store/ItemStore";
import dividendHistoryStore from "../store/DividendHistoryStore";
import priceStore from "../store/PriceStore";
import DividendHistory from "../model/DividendHistory";

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
	const prices: Price[] = param.data?.custom?.prices;
	const info = {
		min : param.data?.custom?.minPrice + 1,
		max : param.data?.custom?.maxPrice,
	};

	const FONT_SIZE = 10;
	const ref = useRef(null);

	//	툴팁
	function renderTooltip(props: any) {
		return (
			<Tooltip className="mytooltip" {...props}>
				<Table bordered striped size="sm" variant="dark" className="my-0 py-0" style={{ fontSize: FONT_SIZE }}>
					<thead><tr>
						<th>날짜</th>
						<th>종가</th>
						<th>시가</th>
						<th>고가</th>
						<th>저가</th>
						<th>거래량</th>
					</tr></thead><tbody>
						{
							prices?.map((price: Price) => (
								<tr key={price.id}>
									<th className="px-1">{moment(price.base).format("YYYY-MM-DD (dd)")}</th>
									<td className="text-end px-1">{price.closing.toLocaleString()}</td>
									<td className="text-end px-1">{price.market.toLocaleString()}</td>
									<td className="text-end px-1">{price.high.toLocaleString()}</td>
									<td className="text-end px-1">{price.low.toLocaleString()}</td>
									<td className="text-end px-1">{price.volume.toLocaleString()}</td>
								</tr>))
						}
					</tbody></Table>
			</Tooltip>
		);
	}
	function height(param: any, price: any, info: any): number {
		if (isNaN(price?.closing) || isNaN(info?.min) || isNaN(info?.max) || isNaN(param?.node?.rowHeight)
			|| (info.max == info.min)|| (param.node.rowHeight == 0)) {
			return 0;
		}

		return (price.closing - info.min) / (info.max - info.min) * param.node.rowHeight;
	}
	function marginTop(param: any, price: any, info: any): number {
		if (isNaN(price?.closing) || isNaN(info?.min) || isNaN(info?.max) || isNaN(param?.node?.rowHeight)
			|| (price.closing == info.min) || (info.max == info.min) || (param.node.rowHeight == 0)) {
			return 0;
		}

		return param.node.rowHeight - (price.closing - info.min) / (info.max - info.min) * param.node.rowHeight;
	}
	return (<>
		<Row className="mx-0 text-right">
			<Col sm="5" md="4" xl="3" xxl="3" className="m-0 p-0 text-right">{param.value}</Col>
			<Col ref={ref} className="ms-2 p-0">
				<OverlayTrigger overlay={renderTooltip} trigger={["hover", "hover"]} placement="auto">
					<Row className="m-0 p-0"> {
						prices?.map((price: Price) => (
							<Col key={price.id} className={"px-0 bg-primary"}
								style={{
									marginRight: 1,
									height: height(param, price, info),
									marginTop: marginTop(param, price, info),
								 }}
							 ></Col>
						))
					}</Row>
				</OverlayTrigger>
			</Col>
		</Row>
	</>);
}

// 종목이름 타입 코드
export function SymbolTypeCode(param: any) {
	const { data } = param;

	return (<>
		<Row className="mx-0 px-0">
			<Col className="ms-1 px-0 text-start text-truncate">{data.symbol}</Col>
			<Col xs="auto" className="ms-1 px-0 text-end">
				{
					data.etf
						? (<><Button variant="outline-success" className="py-0 px-1" style={{ fontSize: 8 }}>ETF</Button></>)
						: data.type == "KOSPI"
							? (<><Button variant="outline-light" className="py-0 px-1" style={{ fontSize: 8 }}>KOSPI</Button></>)
							: !data.type ? ""
								: (<><Button variant="outline-danger" className="py-0 px-1" style={{ fontSize: 8 }}>KOSDAQ</Button></>)
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

// 최근 수익율
export function PriceEarningsRatioCellRenderer(param: any) {
	const YEARS = 7;
	const mapHistory = param?.data?.custom?.mapHistory;
	if (!mapHistory) {
		return (<></>);
	}
	
	const currentPrice = param?.data?.custom?.currentPrice;
	const ref = useRef(null);

	const thisYear = moment().year();
	const dividends = [];
	store.range(YEARS).forEach((cx: number) => dividends.push(mapHistory.get(thisYear - YEARS + cx + 1) || 0));
	const max = dividends.reduce((prev: number, curr: number) => Math.max(prev, curr), 0);
	
	function height(limit: number, max: number, value: number): number {
		if (isNaN(limit) || isNaN(max) || isNaN(value)) {
			return 0;
		}

		return limit * value / max;
	}
	if (max > 0) {
		return (<>
			<Row className="mx-0 text-right">
				<Col sm="4" md="3" xl="2" xxl="2" className="m-0 p-0">
					<span>{(Math.max(dividends[YEARS - 1], dividends[YEARS - 2]) * 100 / currentPrice).toFixed(2)}</span>
				</Col>
				<Col ref={ref} sm="8" md="9" xl="10" xxl="10">
					<Row className="m-0 p-0">
					{
						dividends.map((cx: number, index: number) => (
							<Col key={index}
								className={`px-0 ${index == YEARS - 1 ? "bg-danger" : "bg-primary"}`}
								style={{
									marginRight: 2,
									height: height(param.node.rowHeight, max, cx),
									marginTop: param.node.rowHeight - height(param.node.rowHeight, max, cx),
								}}
							></Col>
						))
					}
					</Row>
				</Col>
			</Row>
		</>);
	}

	const { data } = param;

	const dividend: StockDividendModel = data.custom?.dividend;
	if (!dividend) {
		return (<></>);
	}
	const [values, setValues] = useState<any>({
		height: param.node.rowHeight ,
		max: Math.max(dividend?.dividend, dividend?.dividend1YAgo, dividend?.dividend2YAgo, dividend?.dividend3YAgo),
		value0: 1,
		value1: 1,
		value2: 1,
		value3: 1,
	});

	useEffect(() => {
		setValues({
			...values,
			height: param?.node?.rowHeight,
			value0: values.height * dividend?.dividend / values.max,
			value1: values.height * dividend?.dividend1YAgo / values.max,
			value2: values.height * dividend?.dividend2YAgo / values.max,
			value3: values.height * dividend?.dividend3YAgo / values.max,
		});
	}, [ref]);

	function renderTooltip(props: any) {
		return (<Tooltip id="button-tooltip" {...props}>
			<Row className="mx-1 px-0 fw-bold text-warning" style={{ fontSize: 10 }}>
				<Col xs={2} className="mx-1 px-0">항목</Col>
				<Col className="mx-1 px-0 text-right">3년전</Col>
				<Col className="mx-1 px-0 text-right">2년전</Col>
				<Col className="mx-1 px-0 text-right">1년전</Col>
				<Col className="mx-1 px-0 text-right">올해</Col>
			</Row>
			<Row className="mx-1 px-0" style={{ fontSize: 8 }}>
				<Col xs={2} className="mx-1 px-0">배당금 (원)</Col>
				<Col className="mx-1 px-0 text-right">{dividend.dividend3YAgo?.toLocaleString()}</Col>
				<Col className="mx-1 px-0 text-right">{dividend.dividend2YAgo?.toLocaleString()}</Col>
				<Col className="mx-1 px-0 text-right">{dividend.dividend1YAgo?.toLocaleString()}</Col>
				<Col className="mx-1 px-0 text-right">{dividend.dividend?.toLocaleString()}</Col>
			</Row>
			<Row className="mx-1 px-0" style={{ fontSize: 8 }}>
				<Col xs={2} className="mx-1 px-0">수익률 (%)</Col>
				<Col className="mx-1 px-0 text-right">{(dividend.dividend3YAgo / dividend.currentPrice * 100).toFixed(2)}</Col>
				<Col className="mx-1 px-0 text-right">{(dividend.dividend2YAgo / dividend.currentPrice * 100).toFixed(2)}</Col>
				<Col className="mx-1 px-0 text-right">{(dividend.dividend1YAgo / dividend.currentPrice * 100).toFixed(2)}</Col>
				<Col className="mx-1 px-0 text-right">{(dividend.dividend / dividend.currentPrice * 100).toFixed(2)}</Col>
			</Row>
		</Tooltip>
		);
	}

	return (<>
		<Row className="mx-0 text-right">
			<Col sm="4" md="3" xl="2" xxl="2" className="m-0 p-0">
				<span>{store.priceEarningsRatio(dividend, data?.custom?.histories).toFixed(2)}</span>
			</Col>
			<Col ref={ref} sm="8" md="9" xl="10" xxl="10">
				<OverlayTrigger overlay={renderTooltip}>
					<Row className="m-0 p-0">
						<Col className="px-0 bg-primary" style={{ marginRight: 2, height: values.value3, marginTop: values.height - values.value3, }}></Col>
						<Col className="px-0 bg-primary" style={{ marginRight: 2, height: values.value2, marginTop: values.height - values.value2, }}></Col>
						<Col className="px-0 bg-primary" style={{ marginRight: 2, height: values.value1, marginTop: values.height - values.value1, }}></Col>
						<Col className="px-0 bg-primary" style={{ height: isNaN(values.value0) ? 0 : values.value0, marginTop: values.height - values.value0, }}></Col>
					</Row>
				</OverlayTrigger>
			</Col>
		</Row>
	</>);
};

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


	function renderTooltipTheme1() {
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
											<td key={Math.random()} className="text-end px-1">{history?.dividend?.toLocaleString()}</td>
										);
									}
									return (<td key={Math.random()}></td>);
								})
							}
							<th className="text-end px-1">{mapHistory.get(start.year() + cx)?.toLocaleString()}</th>
						</tr>))
					}
				</tbody></Table>
		);
	}
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
									const history: DividendHistory = mapHistory.get(moment([start.year() + cx, cy]).format("YYYY-MM"));
									if (!history?.dividend || !history?.priceClosing) {
										return (<td key={Math.random()}></td>);
									}

									return (
										<td key={Math.random()} className="text-end px-1">{(history?.dividend / history?.priceClosing * 100)?.toFixed(2)}</td>
									);
								})
							}
							<th className="text-end px-1">{mapHistory.get(start.year() + cx + 0.1)?.toFixed(2)}</th>
						</tr>))
					}
				</tbody></Table>
		);
	}
	function renderTooltip(props: any) {
		return (
			<Tooltip className="mytooltip" {...props}>
				<Row className="m-2 mb-0 py-0">금액 (원)</Row>
				{renderTooltipTheme1()}
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
			<Row className="m-0 p-0">
				{
					store.range(5).map((cx: number) => (
						<Row key={Math.random()} className="mx-0 p-0" style={{ height: (param?.node?.rowHeight - 4) / 5 - 2, marginTop: 1 }}>
							{
								store.range(12).map((cy: number) => {
									if (p(end.year() - 5 + cx, cy) > 0) {
										return (
											<span key={Math.random()} className="mx-0 px-0" style={{ width: `${p(end.year() - 5 + cx, cy)}%`, backgroundColor: FILL_COLOR_MONTH[cy] }}> </span>
										);
									}
								})
							}
						</Row>
					))
				}
			</Row>
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
		const param = {
			...data,
			start: moment([2010, 1, 1]).toDate(),
		};
		itemStore.crawl(param, (_: any) => {
			dividendHistoryStore.crawl(param, (_: any) => {
				priceStore.crawl(param, (_: any) => {
					store.compile(param, (_: any) => {
						setSpinner(false);
						onChange && onChange({});
					});
				});
			});
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
