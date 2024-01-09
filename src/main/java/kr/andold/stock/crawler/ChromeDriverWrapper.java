package kr.andold.stock.crawler;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import kr.andold.stock.service.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChromeDriverWrapper extends ChromeDriver {

	private static final int PAUSE = 100;

	public ChromeDriverWrapper(ChromeOptions options) {
		super(options);
	}

	public WebElement findElement(By xpath, int milli) throws Exception {
		log.info("{} findElement(..., {})", Utility.indentStart(), milli);
		long started = System.currentTimeMillis();

		Exception previous = null;
		while (milli > 0) {
			try {
				WebElement e = super.findElement(xpath);

				log.info("{} {} findElement(..., {}) - {}", Utility.indentEnd(), "SUCCESS", milli, Utility.toStringPastTimeReadable(started));
				return e;
			} catch (Exception e) {
				previous = e;
			}
			Utility.sleep(PAUSE);
			milli -= PAUSE;
		}

		log.info("{} {} findElement(..., {}) - {}", Utility.indentEnd(), "FAILURE", milli, Utility.toStringPastTimeReadable(started));
		throw previous;
	}

	public WebElement findElement(By xpath, int milli, String... marks) throws Exception {
		Exception exception = null;
		WebElement element = null;
		while (milli > 0) {
			try {
				element = super.findElement(xpath);
				String text = element.getText();
				boolean found = false;
				for (String mark : marks) {
					if (mark.contentEquals(text)) {
						found = true;
						break;
					}
				}

				if (found) {
					Utility.sleep(PAUSE);
					milli -= PAUSE;
					continue;
				}

				return element;
			} catch (Exception e) {
				exception = e;
			}
			Utility.sleep(PAUSE);
			milli -= PAUSE;
		}

		if (element == null && exception == null) {
			return null;
		}

		if (exception == null) {
			return element;
		}

		throw exception;
	}

	public boolean waitUntilTextNotInclude(By xpath, int milli, String... marks) throws Exception {
		log.info("{} waitUntilTextNotInclude(..., {}, 『{}』)", Utility.indentStart(), milli, Utility.ellipsisEscape(marks, 16));
		long started = System.currentTimeMillis();

		while (milli > 0) {
			try {
				boolean found = false;
				String text = getText(xpath, 1, "waitUntilTextInclude");
				for (String mark : marks) {
					if (mark.length() == 0 && text.length() > 0) {
						log.info("{} {} waitUntilTextNotInclude(..., {}, 『{}』) - {}", Utility.indentEnd(), true, milli, "marks", Utility.toStringPastTimeReadable(started));
						return true;
					}
					if (text.contains(mark)) {
						found = true;
						break;
					}
				}

				if (found) {
					Utility.sleep(PAUSE);
					milli -= PAUSE;
					continue;
				}

				log.info("{} {} waitUntilTextNotInclude(..., {}, 『{}』) - {}", Utility.indentEnd(), true, milli, "marks", Utility.toStringPastTimeReadable(started));
				return true;
			} catch (Exception e) {
			}
			Utility.sleep(PAUSE);
			milli -= PAUSE;
		}

		log.info("{} {} waitUntilTextNotInclude(..., {}, 『{}』) - {}", Utility.indentEnd(), false, milli, "marks", Utility.toStringPastTimeReadable(started));
		return false;
	}

	public boolean waitUntilTextInclude(By xpath, int milli, String... marks) throws Exception {
		log.info("{} waitUntilTextInclude(..., {}, 『{}』)", Utility.indentStart(), milli, "marks");
		long started = System.currentTimeMillis();

		while (milli > 0) {
			try {
				String text = getText(xpath, 1, "waitUntilTextInclude");
				for (String mark : marks) {
					if (text.contains(mark)) {
						log.info("{} {} waitUntilTextInclude(..., {}, 『{}』) - {}", Utility.indentEnd(), true, milli, "marks", Utility.toStringPastTimeReadable(started));
						return true;
					}
				}
			} catch (Exception e) {
			}
			Utility.sleep(PAUSE);
			milli -= PAUSE;
		}

		log.info("{} {} waitUntilTextInclude(..., {}, 『{}』) - {}", Utility.indentEnd(), false, milli, "marks", Utility.toStringPastTimeReadable(started));
		return false;
	}

	public WebElement findElementIncludeText(By xpath, int milli, String string) throws Exception {
		Exception exception = null;
		while (milli > 0) {
			try {
				List<WebElement> elements = super.findElements(xpath);
				for (WebElement e : elements) {
					String text = e.getText();
					if (text.indexOf(string) >= 0) {
						return e;
					}
				}

				Utility.sleep(PAUSE);
				milli -= PAUSE;
			} catch (Exception e) {
				exception = e;
			}
		}

		if (exception != null) {
			throw exception;
		}

		throw new Exception();
	}

	public WebElement findElementIncludeTextAndClass(By xpath, int milli, String string, String clazz) throws Exception {
		Exception exception = null;
		while (milli > 0) {
			try {
				List<WebElement> elements = super.findElements(xpath);
				for (WebElement e : elements) {
					String text = e.getText();
					String attribute = e.getAttribute("class");
					if (text.indexOf(string) >= 0 && attribute.indexOf(clazz) >= 0) {
						return e;
					}
					
					Utility.sleep(PAUSE);
					milli -= PAUSE;
				}

			} catch (Exception e) {
				exception = e;
			}
		}

		throw exception;
	}

	public boolean clickIncludeTextInAttribute(By xpath, int timeout, String attrName, String text) {
		while (timeout > 0) {
			try {
				List<WebElement> elements = super.findElements(xpath);
				for (WebElement e : elements) {
					String attribute = e.getAttribute(attrName);
					if (attribute.indexOf(text) >= 0) {
						e.click();
						return true;
					}
					
					Utility.sleep(PAUSE);
					timeout -= PAUSE;
				}

			} catch (Exception e) {
			}
		}
		return false;
	}

	public List<WebElement> findElements(By xpath, int milli) throws Exception {
		List<WebElement> elements = null;
		while (milli > 0) {
			try {
				elements = super.findElements(xpath);
				if (!elements.isEmpty()) {
					return elements;
				}
			} catch (Exception e) {
			}
			Utility.sleep(PAUSE);
			milli -= PAUSE;
		}
		return elements;
	}

	public void clear(By xpath) {
		try {
			List<WebElement> es = findElements(xpath);
			if (es == null || es.isEmpty()) {
				return;
			}

			JavascriptExecutor jsExecutor = (JavascriptExecutor) this;
			es.forEach(e -> jsExecutor.executeScript("arguments[0].parentNode.removeChild(arguments[0])", e));
		} catch (Exception e) {
		}
	}

	public void setText(By by, String text, int timeout) {
		try {
			WebElement e = findElement(by, timeout);
			if (e == null) {
				return;
			}

			JavascriptExecutor jsExecutor = (JavascriptExecutor) this;
			jsExecutor.executeScript("arguments[0].innerHTML = \"" + text + "\"", e);
		} catch (Exception e) {
		}
	}

	public List<WebElement> findElements(By xpath, String mark, int milli) throws Exception {
		Exception previous = null;
		while (milli > 0) {
			try {
				List<WebElement> es = super.findElements(xpath);
				String text = toString(es);
				if (!mark.contentEquals(text)) {
					return  es;
				}
			} catch (Exception e) {
				previous = e;
			}
			Utility.sleep(PAUSE);
			milli -= PAUSE;
		}
		throw previous;
	}

	public boolean isEmpty(By xpath) {
		try {
			List<WebElement> es = super.findElements(xpath);
			return es.isEmpty();
		} catch (Exception e) {
		}
		return true;
	}

	public boolean isEmpty(By xpath, int milli) {
		while (milli > 0) {
			try {
				List<WebElement> es = super.findElements(xpath);
				return es.isEmpty();
			} catch (Exception e) {
			}
			Utility.sleep(PAUSE);
			milli -= PAUSE;
		}
		return true;
	}

	public boolean clickIfExist(By xpath) {
		try {
			WebElement e = super.findElement(xpath);
			e.click();
			return true;
		} catch (Exception e) {
		}
		return false;
	}

	public String toString(List<WebElement> es) {
		StringBuffer buffer = new StringBuffer();
		es.forEach(e -> buffer.append(e.getText()));
		return new String(buffer);
	}

	public String extractTextContentFromTrElement(WebElement tr) {
		return extractTextContentFromTrElement(tr, "");
	}
	private static String extractTextContentFromTrElement(WebElement tr, String prefix) {
		StringBuffer sb = new StringBuffer(prefix);
		tr.findElements(By.tagName("th")).forEach(th -> {
			sb.append(th.getAttribute("textContent"));
			sb.append("\t");
		});
		tr.findElements(By.tagName("td")).forEach(td -> {
			sb.append(td.getAttribute("textContent"));
			sb.append("\t");
		});
		sb.append("\n");
		return new String(sb);
	}

	public String extractTextContentFromTableElement(WebElement e) {
		return extractTextContentFromTableElement(e, "");
	}
	public String extractTextContentFromTableElement(WebElement e, String prefix) {
		log.info("{} extractTextFromTableElement(..., 『{}』)", Utility.indentStart(), Utility.ellipsisEscape(prefix, 16));
		long started = System.currentTimeMillis();

		StringBuffer sb = new StringBuffer();
		e.findElements(By.tagName("tr")).forEach(tr -> sb.append(extractTextContentFromTrElement(tr, prefix)));
		String result = new String(sb);

		log.info("{} {} extractTextFromTableElement(..., 『{}』) - {}", Utility.indentEnd(), Utility.ellipsisEscape(result, 32), Utility.ellipsisEscape(prefix, 16), Utility.toStringPastTimeReadable(started));
		return result;
	}

	public String extractTextFromTableElement(WebElement e) {
		return extractTextFromTableElement(e, "");
	}

	public String extractTextFromTableElement(WebElement e, String prefix) {
		log.info("{} extractTextFromTableElement(..., 『{}』)", Utility.indentStart(), Utility.ellipsisEscape(prefix, 16));
		long started = System.currentTimeMillis();

		StringBuffer sb = new StringBuffer();
		e.findElements(By.tagName("tr")).forEach(tr -> sb.append(extractTextFromTrElement(tr, prefix)));
		String result = new String(sb);

		log.info("{} {} extractTextFromTableElement(..., 『{}』) - {}", Utility.indentEnd(), Utility.ellipsisEscape(result, 32), Utility.ellipsisEscape(prefix, 16), Utility.toStringPastTimeReadable(started));
		return result;
	}

	private String extractTextFromTrElement(WebElement tr, String prefix) {
		StringBuffer sb = new StringBuffer(prefix);
		tr.findElements(By.tagName("th")).forEach(th -> {
			sb.append(th.getText());
			sb.append("\t");
		});
		tr.findElements(By.tagName("td")).forEach(td -> {
			sb.append(td.getText());
			sb.append("\t");
		});
		sb.append("\n");
		return new String(sb);
	}

	public String getText(By xpath, int milli, String defaultValue) {
		List<WebElement> elements = null;
		while (milli > 0) {
			try {
				elements = super.findElements(xpath);
				if (!elements.isEmpty()) {
					return elements.get(elements.size() - 1).getText();
				}
			} catch (Exception e) {
			}
			Utility.sleep(PAUSE);
			milli -= PAUSE;
		}
		return defaultValue;
	}

	public String getTextLast(By xpath, int milli, String value) {
		try {
			List<WebElement> es = findElements(xpath, milli);
			if (es != null && es.size() > 0) {
				WebElement e = es.get(es.size() - 1);
				return e.getText();
			}
		} catch (Exception e) {
		}

		return value;
	}

	public String getTextFromTableElement(WebElement table, String prefix) {
		String lines = table.getText();
		StringBuffer sb = new StringBuffer();
		for (String line: lines.split("\r?\n")) {
			sb.append(prefix);
			sb.append(line);
			sb.append("\n");
		}
		return sb.toString();
	}

	public boolean waitUntilIsDisplayed(By xpath, boolean b, int milli) {
		while (milli > 0) {
			try {
				WebElement e = super.findElement(xpath);
				if (e.isDisplayed() == b) {
					return true;
				}
			} catch (Exception e) {
			}
			Utility.sleep(PAUSE);
			milli -= PAUSE;
		}
		return false;
	}

	public WebElement lastElement(By xpath, int timeout) {
		try {
			List<WebElement> es = findElements(xpath, timeout);
			if (es == null || es.isEmpty()) {
				return null;
			}

			return es.get(es.size() - 1);
		} catch (Exception e) {
		}
		return null;
	}

	public boolean waitUntilExist(By xpath, boolean b, int milli) {
		while (milli > 0) {
			try {
				super.findElement(xpath);
				if (b) {
					return true;
				}
			} catch (Exception e) {
				if (!b) {
					return true;
				}
			}
			Utility.sleep(PAUSE);
			milli -= PAUSE;
		}
		return false;
	}

	public boolean waitUntilNotIncludeTextLast(By xpath, int milli, String previous) {
		while (milli > 0) {
			try {
				String current = getTextLast(xpath, 1, previous);
				if (!current.contentEquals(previous)) {
					return true;
				}
			} catch (Exception e) {
			}
			Utility.sleep(PAUSE);
			milli -= PAUSE;
		}
		return false;
	}

	public String getText(List<WebElement> result) {
		StringBuffer sb = new StringBuffer();
		for (WebElement e: result) {
			sb.append(e.getText());
		}
		return sb.toString();
	}

	public String getAttribute(WebElement e, String attributeName, String prefix) {
		String lines = e.getAttribute(attributeName);
		StringBuffer sb = new StringBuffer();
		for (String line: lines.split("\r?\n")) {
			sb.append(prefix);
			sb.append(line);
			sb.append("\n");
		}
		return sb.toString();
	}

}
