package kr.andold.stock.service;

import java.io.File;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Utility extends kr.andold.utils.Utility {
	public static boolean createDirectoryIfNotExist(String path) {
		File dir = new File(path);
		if (!dir.exists()) {
			return dir.mkdirs(); // 하위폴더까지 생성
		}
		return false;
	}

	public static String extractStringFromHtmlElement(Element element) {
		if (element == null) {
			return null;
		}

		String string = "";
		Elements elements = element.children();
		string += extractStringFromHtmlElement(elements);
		if (element.hasText() && elements.isEmpty()) {
			string += element.text();
		}

		switch (element.tag().getName().toLowerCase()) {
			case "td":
			case "th":
				string += "\t";
				break;
			case "tr":
				string += "\n";
				break;
			default:
				break;
		}

		return string;
	}

	public static String extractStringFromHtmlElement(Elements elements) {
		if (elements == null || elements.isEmpty()) {
			return "";
		}

		String string = "";
		for (int cx = 0, sizex = elements.size(); cx < sizex; cx++) {
			string += extractStringFromHtmlElement(elements.get(cx));
		}

		return string;
	}


}
