package kr.andold.stock.service;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverWrapper extends ChromeDriver {

	private static final int PAUSE = 100;

	public ChromeDriverWrapper(ChromeOptions options) {
		super(options);
	}

	public WebElement findElement(By xpath, int milli) throws Exception {
		Exception previous = null;
		while (milli > 0) {
			try {
				return super.findElement(xpath);
			} catch (Exception e) {
				previous = e;
			}
			Utility.sleep(PAUSE);
			milli -= PAUSE;
		}
		throw previous;
	}

	public WebElement findElement(By xpath, String mark, int milli) throws Exception {
		Exception previous = null;
		while (milli > 0) {
			try {
				WebElement e = super.findElement(xpath);
				String text = e.getText();
				if (!mark.contentEquals(text)) {
					return  e;
				}
			} catch (Exception e) {
				previous = e;
			}
			Utility.sleep(PAUSE);
			milli -= PAUSE;
		}
		throw previous;
	}

	public WebElement findElement(By xpath, WebElement previousElement, int milli) throws Exception {
		Exception previous = null;
		while (milli > 0) {
			try {
				WebElement e = super.findElement(xpath);
				if (e != previousElement) {
					return  e;
				}
			} catch (Exception e) {
				previous = e;
			}
			Utility.sleep(PAUSE);
			milli -= PAUSE;
		}
		throw previous;
	}

	public WebElement findElement(By xpath, int milli, String... marks) throws Exception {
		Exception exception = null;
		WebElement element = null;
		while (milli > 0) {
			try {
				element = super.findElement(xpath);
				String text = element.getText();
				for (String mark : marks) {
					if (mark.contentEquals(text)) {
						Utility.sleep(PAUSE);
						milli -= PAUSE;
						continue;
					}
				}

				return element;
			} catch (Exception e) {
				exception = e;
			}
		}

		if (element == null && exception == null) {
			return null;
		}

		if (exception == null) {
			return element;
		}

		throw exception;
	}

	public WebElement findElementIncludeText(By xpath, int milli, String string) throws Exception {
		Exception exception = null;
		WebElement element = null;
		while (milli > 0) {
			try {
				element = super.findElement(xpath);
				String text = element.getText();
				if (text.indexOf(string) >= 0) {
					return element;
				}

				Utility.sleep(PAUSE);
				milli -= PAUSE;
			} catch (Exception e) {
				exception = e;
			}
		}

		if (exception == null) {
			return element;
		}

		throw exception;
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

	public String extractTextFromTrElement(WebElement tr) {
		return extractTextFromTrElement(tr, "");
	}
	private static String extractTextFromTrElement(WebElement tr, String prefix) {
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

	public String extractTextFromTableElement(WebElement e) {
		return extractTextFromTableElement(e, "");
	}
	public static String extractTextFromTableElement(WebElement e, String prefix) {
		StringBuffer sb = new StringBuffer();
		e.findElements(By.tagName("tr")).forEach(tr -> sb.append(extractTextFromTrElement(tr, prefix)));
		return new String(sb);
	}

	public String getText(By xpath, int milli, String value) {
		try {
			WebElement e = findElement(xpath, milli);
			return e.getText();
		} catch (Exception e) {
		}

		return value;
	}

}
