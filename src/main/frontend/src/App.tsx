import "./App.css";
import "bootstrap/dist/css/bootstrap.min.css";
import "ag-grid-community/styles/ag-grid.css"; // Mandatory CSS required by the Data Grid
import "ag-grid-community/styles/ag-theme-balham.css"; // Optional Theme applied to the Data Grid

import React, { useEffect, } from "react";
import { DndProvider } from "react-dnd";
import { HTML5Backend } from "react-dnd-html5-backend";
import moment from "moment-timezone";
import "moment/locale/ko";

// container
import StockContainer from "./container/StockContainter";

// store

// view

// App.tsx
export default function App() {
	useEffect(() => {
		moment.tz.setDefault("Asia/Seoul");
		moment.locale("ko");
	}, []);

	return (
		<div className="App">
			<DndProvider backend={HTML5Backend}>
				<StockContainer />
			</DndProvider>
		</div>
	);
}

