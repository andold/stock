import moment from "moment";
import React, { useEffect, useState } from "react";
import { Button, ButtonGroup, Col, Container, InputGroup, Navbar, Offcanvas, Spinner, ToggleButton } from "react-bootstrap";

// domain
import { StockDividendFormModel } from "../model/StockModel";

// store
import store from "../store/StockStore";

// view
import StockItemView from "../view/StockItemView";
import UploadButtonView from "../view/UploadButtonView";

// StockContainter.tsx
export default ((props: any) => {
	const { } = props;

	const [form, setForm] = useState<StockDividendFormModel>({
		mode: 0,

		filterDividendPayoutRatio: false,
		filterSigma: false,

		start: null,
		end: null,
		keyword: "",

		etf: false,
		kospi: false,
		kosdaq: false,

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

	const [spinner, setSpinner] = useState<number>(0);
	const [collapsed, setCollapsed] = useState(true);

	function handleOnClickDownload() {
		const yyyymmdd = moment().format("YYYYMMDD");
		store.download({ filename: `stock-${yyyymmdd}.json`, });
	}
	function handleOnClickCompile() {
		setSpinner(spinner + 1);
		store.compile(null, () => {
			setSpinner(spinner - 1);
			onChange && onChange({});
		});
	}
	function handleOnClickCrawlItems() {
		setSpinner(spinner + 1);
		store.crawlItems(null, () => {
			setSpinner(spinner - 1);
			onChange && onChange({});
		});
	}
	function handleOnClickCrawlDividendHistoryEtf() {
		setSpinner(spinner + 1);
		store.crawlDividendHistoryEtf({}, (_: any) => {
			if (spinner == 1) {	// 마지막에서만 재검색
				onChange && onChange({});
			}
			setSpinner(spinner - 1);
		});
	}
	function handleOnClickCrawlPriceCompany() {
		setSpinner(spinner + 1);
		store.crawlPriceCompany({}, (_: any) => {
			if (spinner == 1) {	// 마지막에서만 재검색
				onChange && onChange({});
			}
			setSpinner(spinner - 1);
		});
	}
	function handleOnClickCrawlPriceEtf() {
		setSpinner(spinner + 1);
		store.crawlPriceEtf({}, (_: any) => {
			if (spinner == 1) {	// 마지막에서만 재검색
				onChange && onChange({});
			}
			setSpinner(spinner - 1);
		});
	}
	function handleOnClickCrawlItemEtfDetails() {
		setSpinner(spinner + 1);
		store.crawlItemEtfDetails({}, (_: any) => {
			if (spinner == 1) {	// 마지막에서만 재검색
				onChange && onChange({});
			}
			setSpinner(spinner - 1);
		});
	}
	function crawlItemCompanyDividendTop() {
		setSpinner(spinner + 1);
		store.crawlItemCompanyDividendTop({}, (_: any) => {
			if (spinner == 1) {	// 마지막에서만 재검색
				onChange && onChange({});
			}
			setSpinner(spinner - 1);
		});
	}
	function handleOnClickCrawlItemCompanyDetails() {
		setSpinner(spinner + 1);
		store.crawlItemCompanyDetails({}, (_: any) => {
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
						<Col xs="auto" className="text-start me-auto">
							<ButtonGroup>
								<ToggleButton id="toggle-check-etf" type="checkbox" size="sm" variant="primary" checked={form.etf} value={form.etf}
									onChange={(e) => onChange && onChange({ etf: e.currentTarget.checked })}
								>ETF</ToggleButton>
								<ToggleButton id="toggle-check-kospi" type="checkbox" size="sm" variant="primary" checked={form.kospi} value={form.kospi}
									onChange={(e) => onChange && onChange({ kospi: e.currentTarget.checked })}
								>KOSPI</ToggleButton>
								<ToggleButton id="toggle-check-kosdaq" type="checkbox" size="sm" variant="primary" checked={form.kosdaq} value={form.kosdaq}
									onChange={(e) => onChange && onChange({ kosdaq: e.currentTarget.checked })}
								>KOSDAQ</ToggleButton>
							</ButtonGroup>
						</Col>
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
									<Button size="sm" variant="secondary" className="ms-1" onClick={handleOnClickCompile}>Compile</Button>
									<Button size="sm" variant="secondary" className="ms-1" onClick={handleOnClickCrawlItems}>Crawl Items</Button>
									<Button size="sm" variant="secondary" className="ms-1" onClick={crawlItemCompanyDividendTop}>Crawl Item Company Dividend Top</Button>
									<Button size="sm" variant="secondary" className="ms-1" onClick={handleOnClickCrawlItemCompanyDetails}>Crawl Item Company Details</Button>
									<Button size="sm" variant="secondary" className="ms-1" onClick={handleOnClickCrawlItemEtfDetails}>Crawl Item ETF Details</Button>
									<Button size="sm" variant="secondary" className="ms-1" onClick={handleOnClickCrawlDividendHistoryEtf}>Crawl Dividend History ETF</Button>
									<Button size="sm" variant="secondary" className="ms-1" onClick={handleOnClickCrawlPriceCompany}>Crawl Price Company</Button>
									<Button size="sm" variant="secondary" className="ms-1" onClick={handleOnClickCrawlPriceEtf}>Crawl Price ETF</Button>
								</>)}
								<Button size="sm" variant="secondary" className="ms-1" title={form.mode.toString()} onClick={handleOnClickDownload}>다운로드</Button>
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
