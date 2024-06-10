import moment from "moment";
import React, { useRef, useState } from "react";
import { Button, Col, Container, Form, InputGroup, NavDropdown, Navbar, Offcanvas, Spinner, } from "react-bootstrap";

// domain
import { StockForm } from "../model/StockModel";

// store
import store from "../store/StockStore";
import itemStore from "../store/ItemStore";
import dividendHistoryStore from "../store/DividendHistoryStore";
import priceStore from "../store/PriceStore";
import crawlStore from "../store/CrawlStore";


// view
import StockItemView from "../view/StockItemView";
import UploadButtonView from "../view/UploadButtonView";

// StockContainter.tsx
export default ((props: any) => {
	const { } = props;

	const [form, setForm] = useState<StockForm>({
		mode: 0,

		size: 32,
		page: 0,
		totalPages: 1,
		rowHeight: 32,

		filterDividendPayoutRatio: false,

		priority: null,	//	우선순위
		start: null,
		end: null,
		keyword: null,

	});

	const modes = [
		<StockItemView
			key={0}
			form={form}
			priceEarningsRatio={4}
			onChange={(params: any) => setForm({ ...form, ...params, })}
		/>,
		<StockItemView
			key={1}
			form={form}
			priceEarningsRatio={2}
			onChange={(params: any) => setForm({ ...form, ...params, })}
		/>,
		<StockItemView
			key={2}
			form={form}
			priceEarningsRatio={1}
			onChange={(params: any) => setForm({ ...form, ...params, })}
		/>,
		<StockItemView
			key={3}
			form={form}
			priceEarningsRatio={null}
			onChange={(params: any) => setForm({ ...form, ...params, })}
		/>,
	];

	function handleOnChange(params: any) {
		setForm({
			...form,
			...params,
		});
	}

	return (<>
		<Header
			form={form}
			onChange={handleOnChange}
		/>
		{modes[form.mode % modes.length]}
		<Header
			form={form}
			onChange={handleOnChange}
		/>
	</>);
});

function Header(props: any) {
	const { form, onChange } = props;

	const refSearhKeyword = useRef(null);

	const [spinner, setSpinner] = useState<number>(0);
	const [collapsed, setCollapsed] = useState(true);

	const [disableCompile, setDisableCompile] = useState(false);
	const [disableDownload, setDisableDownload] = useState(false);
	const [disableCrawlDividendAllRecent, setDisableCrawlDividendAllRecent] = useState(false);
	const [disableCrawlPricaAll, setDisableCrawlPriceAll] = useState(false);
	const [disableCrawlItemIpoCloseAll, setDisableCrawlItemIpoCloseAll] = useState(false);
	const [disablePurgePrice, setDisablePurgePrice] = useState(false);
	
	function handleOnKeyDownKeyword(event: any) {
		(event.key === "Enter") && onChange && onChange({ keyword: event.target.value, });
	}
	function handleOnClickDownload() {
		setDisableDownload(true);
		const yyyymmdd = moment().format("YYYYMMDD");
		itemStore.download(`stock-item-${yyyymmdd}.json`, () => {
			dividendHistoryStore.download(`stock-dividend-${yyyymmdd}.json`, () => {
				priceStore.download(`stock-price-${yyyymmdd}.json`, () => {
					setDisableDownload(false);
				});
			});
		});
	}
	function handleOnClickPurgePrice() {
		setDisablePurgePrice(true);
		priceStore.purge(null, () => setDisablePurgePrice(false));
	}
	function handleOnClickCrawlItemIpoCloseAll() {
		setDisableCrawlItemIpoCloseAll(true);
		crawlStore.crawlItemIpoCloseRecent(null, () => setDisableCrawlItemIpoCloseAll(false));
	}
	function handleOnClickCrawlDividendAllRecent() {
		setDisableCrawlDividendAllRecent(true);
		crawlStore.crawlDividendAllRecent(null, () => setDisableCrawlDividendAllRecent(false));
	}
	function handleOnClickCrawlPriceAll() {
		setDisableCrawlPriceAll(true);
		crawlStore.crawlPriceAll({base: moment().format("YYYY-MM-DDTHH:mm:ss.SSSZZ")}, (_: any, response: any) => {
			setDisableCrawlPriceAll(false);
			console.log(response);
		});
	}
	function handleOnClickCompile() {
		setDisableCompile(true);
		store.compile(null, () => {
			setDisableCompile(false);
			onChange && onChange({});
		});
	}
	function handleOnCrawlTest() {
		setSpinner(spinner + 1);
		crawlStore.test({}, (_: any) => {
			if (spinner == 1) {	// 마지막에서만 재검색
				onChange && onChange({});
			}
			setSpinner(spinner - 1);
		});
	}
	function handleOnClickMode(e: any) {
		if (e.ctrlKey) {
			onChange && onChange({ mode: form.mode - 1 });
		} else {
			onChange && onChange({ mode: form.mode + 1 });
		}
	}
	//

	// [false, 'sm', 'md', 'lg', 'xl', 'xxl']
	const expand = "md";
	return (<>
		<Navbar bg="black" variant="dark" expand={expand} className="mx-0 p-0">
			<Container fluid>
				<Navbar.Brand href="/" className="pe-4">
					andold
				</Navbar.Brand>
				<Navbar.Toggle aria-controls={`offcanvasNavbar-expand-${expand}`} />
				<Navbar.Offcanvas
					id={`offcanvasNavbar-expand-${expand}`}
					aria-labelledby={`offcanvasNavbarLabel-expand-${expand}`}
					placement="end"
				>
					<Offcanvas.Header closeButton>
						<Offcanvas.Title id={`offcanvasNavbarLabel-expand-${expand}`}>
							Offcanvas
						</Offcanvas.Title>
					</Offcanvas.Header>
					<Offcanvas.Body>
						<Col xs="auto" className="mx-1">
							<InputGroup size="sm">
							{form.page > 0 &&
								<Button className="bg-dark px-1" variant="secondary" title={form.page}
									onClick={() => onChange && onChange({ page: form.page - 1 })}
								>⇦</Button>
							}
								<Form.Select className="border-secondary bg-dark text-white pe-0" value={form.size} title="페이지 크기:: 한 화면에 나오는 데이터의 갯수"
									onChange={(event: any) => onChange && onChange({ size: event.target.value, page: 0, })}
								>{[8, 16, 32, 64, 128, 256, 512, 1024].map(x => (<option key={x} value={x}>{x}</option>))}</Form.Select>
								<Button className="bg-dark px-1" variant="secondary" title={form.page}
									onClick={() => onChange && onChange({ page: form.page + 1, })}
								>⇨</Button>
							</InputGroup>
						</Col>
						<Col xs="auto" className="mx-1">
							<InputGroup size="sm">
								<Form.Select className="border-secondary bg-dark text-white" value={form.rowHeight} title="한줄이 높이"
									onChange={(event: any) => onChange && onChange({ rowHeight: event.target.value, })}
								>{store.range(6).map(x => (<option key={x} value={(x + 3) * 8}>{(x + 3) * 8}</option>))}</Form.Select>
							</InputGroup>
						</Col>
						<Col xs="auto" className="mx-1">
							<InputGroup size="sm">
								<Form.Select className="border-secondary bg-dark text-white" value={form.priority} title="우선순위"
									onChange={(event: any) => onChange && onChange({ priority: Number(event.target.value), })}
									>
										<option key={"우선순위"} value={null}>우선순위</option>
										<option disabled>---------</option>
										{store.range(4).map(x => (<option key={x} value={x}>{x}</option>))}
									</Form.Select>
							</InputGroup>
						</Col>
						<Col xs="auto" className="px-1">
							<Form.Control size="sm" type="search" className="bg-dark text-white" defaultValue={form.keyword}
								ref={refSearhKeyword}
								onKeyDown={handleOnKeyDownKeyword}
							/>
						</Col>
						<Col xs="auto" className="text-start me-auto" title="divider" />
						<Col xs="auto" className="mx-0 py-0">
							<InputGroup size="sm">
								<Button variant="secondary" size="sm" className="ms-1 text-white" onClick={() => setCollapsed(!collapsed)}>{
									collapsed ? (
										<svg fill="currentColor" className="w-6 h-6 mx-2 mb-1" style={{ width: "1.0rem" }} viewBox="0 0 32 32" cursor={"pointer"} version="1.1" xmlns="http://www.w3.org/2000/svg">
											<title>expand</title>
											<path d="M13.816 5.989l-7.785 0.046 0.003 7.735 2.59-2.591 3.454 3.454 2.665-2.665-3.453-3.454 2.526-2.525zM12.079 17.35l-3.454 3.455-2.59-2.592-0.003 7.799 7.785-0.018-2.526-2.525 3.454-3.453-2.666-2.666zM19.922 14.633l3.453-3.454 2.59 2.591 0.004-7.735-7.785-0.046 2.526 2.525-3.454 3.454 2.666 2.665zM23.375 20.805l-3.453-3.455-2.666 2.666 3.454 3.453-2.526 2.525 7.785 0.018-0.004-7.799-2.59 2.592z"></path>
										</svg>
									) : (
										<svg fill="#808080" className="w-6 h-6 mx-2 mb-1" style={{ width: "1.0rem" }} viewBox="0 0 32 32" cursor={"pointer"} version="1.1" xmlns="http://www.w3.org/2000/svg">
											<title>collapse</title>
											<path d="M11.493 8.757l-3.454-3.453-2.665 2.665 3.454 3.453-2.59 2.59 7.797 0.004-0.017-7.784-2.525 2.525zM23.172 11.422l3.454-3.453-2.665-2.665-3.454 3.453-2.525-2.525-0.017 7.784 7.797-0.004-2.59-2.59zM8.828 20.578l-3.454 3.453 2.665 2.665 3.454-3.453 2.526 2.525 0.017-7.784-7.797 0.004 2.589 2.59zM25.762 17.988l-7.797-0.004 0.017 7.784 2.525-2.525 3.454 3.453 2.665-2.665-3.454-3.453 2.59-2.59z"></path>
										</svg>
									)
								}</Button>
								{(spinner > 0) && <Spinner animation="grow" variant="warning" className="ms-1 align-middle" title={spinner.toLocaleString()} />}
								{!collapsed && (<>
									<NavDropdown title="Crawl" className="mx-1">
										<NavDropdown.Item className="mx-1" onClick={handleOnCrawlTest}>Crawl Test</NavDropdown.Item>
									</NavDropdown>
									<Button size="sm" variant="secondary" className="ms-1" disabled={disableCompile} onClick={handleOnClickCompile}>
										<Spinner as="span" animation="grow" variant="warning" size="sm" role="status" className="mx-1 align-middle" hidden={!disableCompile} />
										Compile
									</Button>
									<Button size="sm" variant="secondary" className="ms-1" disabled={disablePurgePrice} onClick={handleOnClickPurgePrice}>
										<Spinner as="span" animation="grow" variant="warning" size="sm" role="status" className="mx-1 align-middle" hidden={!disablePurgePrice} />
										주가 정리
									</Button>
									<Button size="sm" variant="secondary" className="ms-1" disabled={disableCrawlDividendAllRecent} onClick={handleOnClickCrawlDividendAllRecent}>
										<Spinner as="span" animation="grow" variant="warning" size="sm" role="status" className="mx-1 align-middle" hidden={!disableCrawlDividendAllRecent} />
										최근 배당 수집
									</Button>
									<Button size="sm" variant="secondary" className="ms-1" disabled={disableCrawlItemIpoCloseAll} onClick={handleOnClickCrawlItemIpoCloseAll}>
										<Spinner as="span" animation="grow" variant="warning" size="sm" role="status" className="mx-1 align-middle" hidden={!disableCrawlItemIpoCloseAll} />
										상장폐지일 수집
									</Button>
									<Button size="sm" variant="secondary" className="ms-1" disabled={disableCrawlPricaAll} onClick={handleOnClickCrawlPriceAll}>
										<Spinner as="span" animation="grow" variant="warning" size="sm" role="status" className="mx-1 align-middle" hidden={!disableCrawlPricaAll} />
										오늘 기준 주가 수집
									</Button>
								</>)}
									<Button size="sm" variant="secondary" className="ms-1" disabled={disableDownload} onClick={handleOnClickDownload} title={form.mode.toString()}>
										<Spinner as="span" animation="grow" variant="warning" size="sm" role="status" className="mx-1 align-middle" hidden={!disableDownload} />
										다운로드
									</Button>
								<UploadButtonView />
								<Button size="sm" variant={form.mode % 2 ? "success" : "secondary"} className="ms-1" title={form.mode.toString()} onClick={(e: any) => handleOnClickMode(e)}>모드</Button>
							</InputGroup>
						</Col>
					</Offcanvas.Body>
				</Navbar.Offcanvas>
			</Container>
		</Navbar>
	</>);
}
