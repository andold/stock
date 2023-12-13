package kr.andold.stock.service;

import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class HtmlParserService {
	private static final String TAB_MARK = "\t";
	private static final String NEWLINE_MARK = "\n";
	private static final String SPACE = " ";

	public static String extractTextFromHtml(String html) {
		return extractTextFromHtml(html, new HashMap<String, Boolean>());
	}
	public static String extractTextFromHtml(String html, Map<String, Boolean> mapExtract) {
		log.info("{} extractTextFromHtml(『{}』, ...)", Utility.indentStart(), Utility.ellipsis(html, 32, 32));

		if (html == null) {
			return Utility.BLANK;
		}

		Document document = Jsoup.parse(html, Utility.BLANK);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("text.x", "0");
		map.put("text.y", "0");
		map.put("text.width", 0);
		map.put("text.font-size", "8");
		StringBuffer stringBuffer = extractText((Node)document, mapExtract, map);
		String string = stringBuffer.toString();
		string = string.replaceAll("(\n[ \\x0B\f\r]*)+", "\n").replaceAll("[ \\x0B\f\r]+", " ").replaceAll("^ +", "");


		log.info("{} 『{}』 extractTextFromHtml(『{}』, ...)", Utility.indentEnd(), Utility.toStringJson(string, 16, 16), Utility.toStringJson(html, 32, 32));
		return string;
	}
	public static String extractText(Document document) {
		Map<String, Boolean> mapExtract = new HashMap<>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("text.x", "0");
		map.put("text.y", "0");
		map.put("text.width", 0);
		map.put("text.font-size", "8");
		StringBuffer stringBuffer = extractText((Node)document, mapExtract, map);
		String string = stringBuffer.toString();
		string = string.replaceAll("(\n[ \\x0B\f\r]*)+", "\n").replaceAll("[ \\x0B\f\r]+", " ").replaceAll("^ +", "");
		return string;
	}
	private static StringBuffer extractText(Node node, Map<String, Boolean> mapExtract, Map<String, Object> map) {
		log.trace("{} extractText({}, (x, y, w, fs) = ({}, {}, {}, {})", Utility.indentStart()
			, node.nodeName(), map.get("text.x"), map.get("text.y"), map.get("text.width"), map.get("text.font-size"));
		if (node instanceof TextNode) {
			String text = ((TextNode)node).text();

			AffineTransform affinetransform = new AffineTransform();
			FontRenderContext frc = new FontRenderContext(affinetransform, true, true);
			String fontSize = (String)map.get("text.font-size");
			Font font = new Font("NanumGothic", Font.PLAIN, Integer.parseInt(fontSize));
			Integer width = (Integer)map.get("text.width");
			if (width == null) {
				width = 0;
			}
			int stringWidth = (int)(font.getStringBounds(text, frc).getWidth());
			map.put("text.width", width + stringWidth);

			log.trace("{} extractText({}, (x, y, w, fs) = ({}, {}, {}, {}) - {} {}", Utility.indentEnd()
				, node.nodeName(), map.get("text.x"), map.get("text.y"), map.get("text.width"), map.get("text.font-size"), text, stringWidth);
			return new StringBuffer(text);
		}

		StringBuffer stringBuffer = new StringBuffer();
		String nodeName = node.nodeName();

		switch (nodeName) {
			//	내용 무시
			case "colgroup":
			case "img":
				stringBuffer.append(" ");
				break;

			// selection
			case "option":
				if(node.hasAttr("selected")) {
					node.childNodes().forEach(child -> {
						stringBuffer.append(extractText(child, mapExtract, map));
					});
				}
				stringBuffer.append(" ");
				break;

			//	아래 내용만 해석
			case "span":
				if (!isNodeSpan(node.previousSibling())) {
					stringBuffer.append(" ");
				}
				node.childNodes().forEach(child -> {
					stringBuffer.append(extractText(child, mapExtract, map));
				});
				if (!isNodeSpan(node.nextSibling())) {
					stringBuffer.append(" ");
				}
				break;
			case "address":
			case "aside":
			case "b":
			case "body":
			case "button":
			case "center":
			case "cite":
			case "em":
			case "fieldset":
			case "figure":
			case "font":
			case "form":
			case "i":
			case "label":
			case "legend":
			case "main":
			case "pre":
			case "select":
			case "svg":
			case "strong":
			case "table":
			case "tbody":
			case "thead":
			case "u":
				stringBuffer.append(" ");
				node.childNodes().forEach(child -> {
					stringBuffer.append(extractText(child, mapExtract, map));
				});
				stringBuffer.append(" ");
				break;

			//	빈칸 추가
			case "a":
				if (mapExtract.get(nodeName) != null) {
					String href = node.attr("href");
					stringBuffer.append(" ");
					stringBuffer.append(href);
				}
			case "dd":
			case "dl":
			case "dt":
			case "g":
			case "figcaption":
			case "li":
			case "ol":
			case "path":
			case "ul":
				stringBuffer.append(" ");
				node.childNodes().forEach(child -> {
					stringBuffer.append(extractText(child, mapExtract, map));
				});
				stringBuffer.append(" ");
				break;

			//	새로운 줄 삽입
			case "article":
			case "br":
			case "caption":
			case "div":
			case "footer":
			case "h1":
			case "h2":
			case "h3":
			case "h4":
			case "h5":
			case "h6":
			case "h7":
			case "h8":
			case "h9":
			case "header":
			case "hr":
			case "html":
			case "iframe":
			case "line":
			case "nav":
			case "p":
			case "section":
			case "textarea":
			case "tfoot":
			case "tr":
				node.childNodes().forEach(child -> {
					stringBuffer.append(extractText(child, mapExtract, map));
				});
				stringBuffer.append(NEWLINE_MARK);
				break;

			case "input":
				stringBuffer.append(node.attributes().get("value"));
				stringBuffer.append(" ");
				break;
			//	탭 삽입
			case "td":
			case "th":
				boolean hasTable = hasTable(node.childNodes());
				StringBuffer sb = new StringBuffer();
				node.childNodes().forEach(child -> {
					sb.append(extractText(child, mapExtract, map));
				});
				stringBuffer.append(hasTable ? sb : sb.toString().replaceAll("\n",  " "));
				stringBuffer.append(TAB_MARK);
				break;

			case "text":
				String x = node.attr("x");
				String y = node.attr("y");
				String fontSize = node.attr("font-size");

				String prevY = (String)map.get("text.y");
				String prevX = (String)map.get("text.x");
				Integer prevWidth = (Integer)map.get("text.width");

				Integer delta = Integer.parseInt(x) - Integer.parseInt(prevX);
				if (prevY == null || prevY.compareTo(y) != 0) {
					//	y변경
					stringBuffer.append(NEWLINE_MARK);
				} else if (delta > (prevWidth + Integer.parseInt((String)map.get("text.font-size")))) {
					//	x 많이 변경
					stringBuffer.append(TAB_MARK);
				} else if (delta > (prevWidth + Integer.parseInt((String)map.get("text.font-size")) / 3)) {
					//	x space
					stringBuffer.append(SPACE);
				}
				map.put("text.width", 0);

				if (!x.isEmpty()) {	map.put("text.x", x);	}
				if (!y.isBlank()) {	map.put("text.y", y);	}
				if (!fontSize.isBlank()) {	map.put("text.font-size", fontSize.replaceAll("px", ""));	}

				node.childNodes().forEach(child -> {
					stringBuffer.append(extractText(child, mapExtract, map));
				});
				break;

			default:
				node.childNodes().forEach(child -> {
					stringBuffer.append(extractText(child, mapExtract, map));
				});
				break;
		}

		log.trace("{} extractText({}, (x, y, w, fs) = ({}, {}, {}, {})", Utility.indentEnd()
			, node.nodeName(), map.get("text.x"), map.get("text.y"), map.get("text.width"), map.get("text.font-size"));
		return stringBuffer;
	}

	private static boolean isNodeSpan(Node node) {
		if (node == null) {
			return false;
		}
		String name = node.nodeName();
		return "span".equalsIgnoreCase(name);
	}

	private static boolean hasTable(List<Node> list) {
		if (list == null || list.isEmpty()) {
			return false;
		}
		
		for (Node node: list) {
			if (node.nodeName().equalsIgnoreCase("table")) {
				return true;
			}

			if (hasTable(node.childNodes())) {
				return true;
			}
		}

		return false;
	}

}
