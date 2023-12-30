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
		while (milli > 0) {
			try {
				boolean found = false;
				String text = getText(xpath, 1, "waitUntilTextInclude");
				for (String mark : marks) {
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

				return true;
			} catch (Exception e) {
			}
			Utility.sleep(PAUSE);
			milli -= PAUSE;
		}

		return false;
	}

	public boolean waitUntilTextInclude(By xpath, int milli, String... marks) throws Exception {
		while (milli > 0) {
			try {
				String text = getText(xpath, 1, "waitUntilTextInclude");
				for (String mark : marks) {
					if (text.contains(mark)) {
						return true;
					}
				}
			} catch (Exception e) {
			}
			Utility.sleep(PAUSE);
			milli -= PAUSE;
		}

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
	public String extractTextFromTableElement(WebElement e, String prefix) {
		StringBuffer sb = new StringBuffer();
		e.findElements(By.tagName("tr")).forEach(tr -> sb.append(extractTextFromTrElement(tr, prefix)));
		return new String(sb);
	}

	public String getText(By xpath, int milli, String value) {
		try {
			List<WebElement> es = findElements(xpath, milli);
			StringBuffer sb = new StringBuffer();
			for (WebElement e: es) {
				sb.append(e.getText());
			}
			return sb.toString();
		} catch (Exception e) {
		}

		return value;
	}

	public void waitUntilIsDisplayed(By xpath, boolean b, int milli) {
		while (milli > 0) {
			try {
				WebElement e = super.findElement(xpath);
				if (e.isDisplayed() == b) {
					return;
				}
			} catch (Exception e) {
			}
			Utility.sleep(PAUSE);
			milli -= PAUSE;
		}
	}

}
