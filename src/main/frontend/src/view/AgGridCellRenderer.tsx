import moment from "moment";
import React, { useEffect, useRef, useState } from "react";
import { Button, Col, OverlayTrigger, Row, Spinner, Table, Tooltip } from "react-bootstrap";

import StockDividendModel from "../model/StockModel";

// store
import store from "../store/StockStore";

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
	const { data } = param;

	const dividend: StockDividendModel = data.custom?.dividend ? data.custom?.dividend : data;
	const ref = useRef(null);
	const [values, setValues] = useState<any>({
		height: 26,
		max: Math.max(dividend?.dividend, dividend?.dividend1YAgo, dividend?.dividend2YAgo, dividend?.dividend3YAgo),
		value0: 0,
		value1: 0,
		value2: 0,
		value3: 0,
	});

	useEffect(() => {
		setValues({
			...values,
			height: ref?.current?.offsetHeight || 26,
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
	};

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
						<Col className="px-0 bg-primary" style={{ height: values.value0, marginTop: values.height - values.value0, }}></Col>
					</Row>
				</OverlayTrigger>
			</Col>
		</Row>
	</>);
};

// 최근 배당금
export function RecentDividendAgGridCellRenderer(param: any) {
	const FONT_SIZE = 10;
	const { data } = param;

	const [nomalized, setNomalized] = useState<{}>();
	const [start, setStart] = useState<any>();
	const [end, setEnd] = useState<any>();
	const [max, setMax] = useState<number>();
	useEffect(() => {
		const histories = data?.custom?.histories;
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


	function renderTooltip(props: any) {
		return (
			<Tooltip className="mytooltip" {...props}>
				<Row className="m-2 mb-0 py-0">금액 (단위: 원)</Row>
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
										const dividend = nomalized[start.year() + cx]?.[cy];
										if (dividend > 0) {
											return (
												<td key={Math.random()} className="text-end px-1">{dividend.toLocaleString()}</td>
											);
										}
										return (<td key={Math.random()}></td>);
									})
								}
								<th className="text-end px-1">{nomalized[start.year() + cx]?.[13].toLocaleString()}</th>
							</tr>))
						}
					</tbody></Table>
				<Row className="m-2 mb-0 py-0">수익율 (단위: %)</Row>
				<Table bordered striped size="sm" variant="dark" className="my-0 py-0" style={{ fontSize: FONT_SIZE }}>
					<thead><tr>
						<th className="px-1">연도</th>
						{
							store.range(12).map((cy: number) => (
								<th key={Math.random()} className="text-end px-1">{cy + 1}</th>
							))
						}
						<th>합계</th>
					</tr></thead><tbody>
						{
							store.range(end.year() - start.year()).map((cx: number) => (<tr key={Math.random()}>
								<th className="text-end px-1">{start.year() + cx}</th>
								{
									store.range(12).map((cy: number) => {
										const dividend = nomalized[start.year() + cx]?.[cy];
										if (dividend > 0) {
											return (
												<td key={Math.random()} className="text-end px-1">{(dividend / data?.custom?.dividend?.currentPrice * 100).toFixed(2)}</td>
											);
										}
										return (<td key={Math.random()}></td>);
									})
								}
								<th className="text-end px-1">{(nomalized[start.year() + cx]?.[13] / data?.custom?.dividend?.currentPrice * 100).toFixed(2)}</th>
							</tr>))
						}
					</tbody></Table>
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
						<Row key={Math.random()} className="mx-0 p-0" style={{ height: 4, marginTop: 1 }}>
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
export function StockItemOperateCellRenderer(props: any) {
	const { data, onChange } = props;

	const [spinner, setSpinner] = useState<boolean>(false);
	let jobs = 0;

	async function handleOnClick() {
		setSpinner(true);
		jobs++;
		store.crawlDividendHistory(data, (_: any) => {
			jobs--;
			if (jobs == 0) {
				setSpinner(false);
				onChange && onChange({});
			}
		});
		store.crawlItem(data, (_: any) => {
			jobs--;
			if (jobs == 0) {
				setSpinner(false);
				onChange && onChange({});
			}
		});
		store.crawlDividendHistoryEtfMonthly(data, (_: any) => {
			jobs--;
			if (jobs == 0) {
				setSpinner(false);
				onChange && onChange({});
			}
		});
	}
	async function handleOnClickPriceChart(e: any) {
		window.open(`https://finance.naver.com/item/fchart.naver?code=${data.code}`, "시세차트");
	}

	return (<>
		<Button size="sm" variant="outline-secondary" className="ms-1 mb-1 py-0 text-white" style={{fontSize: 8}} onClick={handleOnClickPriceChart} title="네이버 증권 시세 차트">차트</Button>
		{spinner
			? (<Spinner animation="grow" variant="warning" size="sm" className="ms-0 me-1 align-middle" />)
			: (
				<svg fill="currentColor" style={{ width: 24, }} viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg" onClick={handleOnClick}>
					<g id="SVGRepo_bgCarrier" strokeWidth="0"></g>
					<g id="SVGRepo_tracerCarrier" strokeLinecap="round" strokeLinejoin="round"></g>
					<g id="SVGRepo_iconCarrier">
						<path d="M18.4721 16.7023C17.3398 18.2608 15.6831 19.3584 13.8064 19.7934C11.9297 20.2284 9.95909 19.9716 8.25656 19.0701C6.55404 18.1687 5.23397 16.6832 4.53889 14.8865C3.84381 13.0898 3.82039 11.1027 4.47295 9.29011C5.12551 7.47756 6.41021 5.96135 8.09103 5.02005C9.77184 4.07875 11.7359 3.77558 13.6223 4.16623C15.5087 4.55689 17.1908 5.61514 18.3596 7.14656C19.5283 8.67797 20.1052 10.5797 19.9842 12.5023M19.9842 12.5023L21.4842 11.0023M19.9842 12.5023L18.4842 11.0023" stroke="#000000" strokeWidth="2" strokeLinecap="round" strokeLinejoin="round"></path>
						<path d="M12 8V12L15 15" stroke="#000000" strokeWidth="2" strokeLinecap="round" strokeLinejoin="round"></path>
					</g>
				</svg>
			)}
	</>);
}
