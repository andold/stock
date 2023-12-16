import React from "react";

import { Button } from "react-bootstrap";
import { useDrop } from "react-dnd";
import { NativeTypes } from "react-dnd-html5-backend";

// domain

// store
import store from "../store/StockStore";

//	UploadButtonView.tsx
export default ((_: any) => {
	const types=["application/json"];

	const [{ isOver, canDrop }, drop] = useDrop(
		() => ({
			accept: [NativeTypes.FILE],
			drop: (item: any) => {
				store.upload(item.files[0]);
			},
			canDrop: (item: any) => {
				let acceptType = false;
				types.forEach((x: any) => acceptType = acceptType || x);
				const possible = item.items.length === 1
					&& item.items[0].kind === 'file'
					&& acceptType
					;
				return possible
			},
			collect: (monitor) => ({
				isOver: !!monitor.isOver(),
				canDrop: !!monitor.canDrop(),
			}),
		})
	);

	let v = "secondary";
	if (isOver && canDrop) {
		v = "danger";
	} else if (isOver && !canDrop) {
		v = "success";
	}

	return (<>
		<Button ref={drop} size="sm" variant={v} className="ms-1">업로드 영역</Button>
	</>);

});
