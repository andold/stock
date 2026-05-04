package kr.andold.stock.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import lombok.extern.slf4j.Slf4j;

@Slf4j
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

	public static String readClassPathFile(String filename, String charset) {
		log.info("{} readClassPathFile(『{}』)", Utility.indentStart(), filename);
		long started = System.currentTimeMillis();

		String javaClassPath = System.getProperty("java.class.path");
		String[] listJavaClassPath = javaClassPath.split("[:;]");

		for (int cx = 0; cx < listJavaClassPath.length; cx++) {
			String fullPath = String.format("%s/%s", listJavaClassPath[cx], filename);
			File file = new File(fullPath);
			if (!file.exists()) {
				continue;
			}

			try {
				InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
				BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
				String string = extractStringFromText(bufferedReader);

				log.info("{} 『{}』 readClassPathFile(『{}』) - {}", Utility.indentEnd(), toStringJson(string, 32, 32), filename, Utility.toStringPastTimeReadable(started));
				return string;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		log.info("{} 『{}』 readClassPathFile(『{}』) - {}", Utility.indentEnd(), null, filename, Utility.toStringPastTimeReadable(started));
		return null;
	}

	public static String extractStringFromText(BufferedReader bufferedReader) {
		try {
			String line = null;
			StringBuffer stringBuffer = new StringBuffer();
			int lineno = 0;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
				if (lineno++ % 1024 == 0) {
					log.debug("{} {}:	{}", Utility.indentMiddle(), lineno, line);
				}
			}
			bufferedReader.close();

			return new String(stringBuffer);
		} catch (Exception e) {
			log.warn("{} Exception:: {}", Utility.indentMiddle(), e.getMessage(), e);
		}

		return null;
	}

	public static void wipeDirectory(String downloadPath) {
		try {
			Path path = Paths.get(downloadPath); // 삭제할 디렉토리 경로
			// 디렉토리 내부를 탐색 (Files.walk)
			Files.walk(path)
				.filter(Files::isRegularFile) // 디렉토리는 제외하고 파일만
				.forEach(p -> {
					try {
						Files.delete(p);
					} catch (IOException e) {
						log.warn("{} IOException:: {} {}", Utility.indentMiddle(), p, e.getMessage(), e);
					}
				});
		} catch (IOException e) {
			log.warn("{} IOException:: {}", Utility.indentMiddle(), e.getMessage(), e);
		}
	}

	private static int SAMPLES_COUNT_MAX = 9;
	public static boolean samples(int index, int size, int count) {
		if (count <= 0 || size <= 0) {
			return false;
		}

		Set<Integer> set = new HashSet<>();
		count = Math.min(count, SAMPLES_COUNT_MAX);
		switch (count) {
		case 9:
			set.add(Math.max(0, size / 2 - 1));
		case 8:
			set.add(Math.max(size - 3, 0));
		case 7:
			set.add(Math.min(size - 1, 2));
		case 6:
			set.add(Math.min(size - 1, size / 2 + 1));
		case 5:
			set.add(Math.max(size - 2, 0));
		case 4:
			set.add(Math.min(size - 1, 1));
		case 3:
			set.add(size / 2);
		case 2:
			set.add(Math.max(size - 1, 0));
		case 1:
			set.add(0);
		default:
			break;
		}

		return set.contains(index);
	}

}
