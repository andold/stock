import moment from "moment";
import React, { useEffect, useState } from "react";
import { Button, ButtonGroup, Col, Container, Form, InputGroup, NavDropdown, Navbar, Offcanvas, Spinner, ToggleButton } from "react-bootstrap";

// domain
import { StockDividendFormModel } from "../model/StockModel";

// store
import store from "../store/StockStore";
import itemStore from "../store/ItemStore";
import dividendHistoryStore from "../store/DividendHistoryStore";
import priceStore from "../store/PriceStore";
import idempotentStore from "../store/IdempotentStore";
import crawlStore from "../store/CrawlStore";


// view
import StockItemView from "../view/StockItemView";
import UploadButtonView from "../view/UploadButtonView";

// StockContainter.tsx
export default ((props: any) => {
	const { } = props;

	const [form, setForm] = useState<StockDividendFormModel>({
		mode: 0,

		size: 32,
		page: 0,
		totalPages: 1,
		rowHeight: 32,

		filterDividendPayoutRatio: false,
		filterSigma: false,

		start: null,
		end: null,
		keyword: null,

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
	const [disableRunIdempotent, setDisableRunIdempotent] = useState(false);
	const [disableCrawlPricaAll, setDisableCrawlPriceAll] = useState(false);
	const [jobs, setJobs] = useState({
		play: false,
		queue: [],
	});

	useEffect(() => {
		if (!jobs.play || jobs.queue.length == 0 || spinner > 0) {
			return;
		}

		const first = jobs.queue[0];
		const param = {
			...first,
			start: moment([2010, 1, 1]).toDate(),
		};
		setSpinner(1);
		console.log("상세 수집한다 {}", first)
		itemStore.crawl(param, (_: any) => {
			dividendHistoryStore.crawl(param, (_: any) => {
				priceStore.crawl(param, (_: any) => {
					store.compile(param, (_: any) => {
						setSpinner(0);
						setJobs({
							...jobs,
							queue: jobs.queue.slice(1),
						});
						return;
					});
				});
			});
		});
	}, [jobs]);

	function handleOnClickDownload() {
		const yyyymmdd = moment().format("YYYYMMDD");
		store.download({ filename: `stock-${yyyymmdd}.json`, });
	}
	function handleOnClickRunIdempotent() {
		setDisableRunIdempotent(true);
		idempotentStore.run(null, (_: any, response: any) => {
			setDisableRunIdempotent(false);
			console.log(response);
		});
	}
	function handleOnClickCrawlPriceAll() {
		setDisableCrawlPriceAll(true);
		crawlStore.crawlPriceAll({base: moment().format("YYYY-MM-DDTHH:mm:ss.SSSZZ")}, (_: any, response: any) => {
			setDisableCrawlPriceAll(false);
			console.log(response);
		});
	}
	function handleOnCrawlItemDetailAll() {
		// 실행상태가 아니면
		if (!jobs.play) {
			// 실행상태로 바꾸려 하는데, 할께 아예 없으면
			if (jobs.queue.length == 0) {
				const request = {
					keyword: null,
					start: null,
					end: null,
					size: 1024,
					page: 0,
				};
				// 할꺼를 만들고
				store.searchItem(request, (_: any, result: any) => {
					const items = result?.items;
					if (!items?.length) {
						setJobs({
							...jobs,
							play: false,
						});
						return;
					}
	
					// 실행하라고 한다
					setJobs({
						...jobs,
						queue: items,
						play: true,
					});
					return;
				});
				return;
			}
			setJobs({
				...jobs,
				play: true,
			});
			return;
		}

		// 실행상태인데, 할께 없으면
		if (jobs.queue.length == 0) {
			const request = {
				keyword: null,
				start: null,
				end: null,
				size: 1024,
				page: 0,
			};
			// 할꺼를 만들고
			store.searchItem(request, (_: any, result: any) => {
				const items = result?.items;
				if (!items?.length) {
					setJobs({
						...jobs,
						play: false,
					});
					return;
				}

				// 실행하라고 한다
				setJobs({
					...jobs,
					queue: items,
				});
				return;
			});
			return;
		}

		// 실행상태인데, 할것도 있다면, 중지하라 한다
		setJobs({
			...jobs,
			play: false,
		});
	}
	function handleOnClickCompile() {
		setSpinner(spinner + 1);
		store.compile(null, () => {
			setSpinner(spinner - 1);
			onChange && onChange({});
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
	function handleOnCrawlItemDividendTopCompany() {
		setSpinner(spinner + 1);
		store.crawlItemDividendTopCompany({}, (_: any) => {
			if (spinner == 1) {	// 마지막에서만 재검색
				onChange && onChange({});
			}
			setSpinner(spinner - 1);
		});
	}
	function handleOnCrawlItemEtf() {
		setSpinner(spinner + 1);
		store.crawlItemEtf({}, (_: any) => {
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
							<ButtonGroup size="sm">
								<ToggleButton id="toggle-check-etf" type="checkbox" variant="outline-primary" checked={form.etf} value={form.etf}
									onChange={(e) => onChange && onChange({ etf: e.currentTarget.checked })}
								>ETF</ToggleButton>
								<ToggleButton id="toggle-check-kospi" type="checkbox" variant="outline-primary" checked={form.kospi} value={form.kospi}
									onChange={(e) => onChange && onChange({ kospi: e.currentTarget.checked })}
								>KOSPI</ToggleButton>
								<ToggleButton id="toggle-check-kosdaq" type="checkbox" variant="outline-primary" checked={form.kosdaq} value={form.kosdaq}
									onChange={(e) => onChange && onChange({ kosdaq: e.currentTarget.checked })}
								>KOSDAQ</ToggleButton>
							</ButtonGroup>
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
										<NavDropdown.Item className="mx-1" onClick={handleOnCrawlItemDetailAll}>Crawl Item 상세 모두 {jobs.play ? "do PAUSE" : "do PLAY"}</NavDropdown.Item>
										<NavDropdown.Item className="mx-1" onClick={handleOnCrawlItemDividendTopCompany}>Crawl Item Dividend Top Company</NavDropdown.Item>
										<NavDropdown.Item className="mx-1" onClick={handleOnCrawlItemEtf}>Crawl Item ETF</NavDropdown.Item>
										<NavDropdown.Item className="mx-1" onClick={handleOnClickCrawlItemCompanyDetails}>Crawl Item Detail Company</NavDropdown.Item>
										<NavDropdown.Item className="mx-1" onClick={handleOnClickCrawlItemEtfDetails}>Crawl Item Detail ETF</NavDropdown.Item>
									</NavDropdown>
									<Button size="sm" variant="secondary" className="ms-1" onClick={handleOnClickCompile}>Compile</Button>
									<Button size="sm" variant="secondary" className="ms-1" disabled={disableRunIdempotent} onClick={handleOnClickRunIdempotent}>
										<Spinner as="span" animation="grow" variant="warning" size="sm" role="status" className="mx-1 align-middle" hidden={!disableRunIdempotent} />
										점진적인 수집 실행
									</Button>
									<Button size="sm" variant="secondary" className="ms-1" disabled={disableCrawlPricaAll} onClick={handleOnClickCrawlPriceAll}>
										<Spinner as="span" animation="grow" variant="warning" size="sm" role="status" className="mx-1 align-middle" hidden={!disableCrawlPricaAll} />
										오늘 기준 주가 수집
									</Button>
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
