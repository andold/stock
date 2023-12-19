package kr.andold.stock.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;

import kr.andold.stock.antlr.StockLexer;
import kr.andold.stock.antlr.StockParser;
import kr.andold.stock.domain.StockDividendDomain;
import kr.andold.stock.domain.StockDividendHistoryDomain;
import kr.andold.stock.domain.StockItemDomain;
import kr.andold.stock.domain.StockPriceDomain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StockParserService {
	private static final List<StockItemDomain> LIST_STOCK_ITEM = new ArrayList<>();
	private static final List<StockDividendDomain> LIST_STOCK_DIVIDEND = new ArrayList<>();
	private static final List<StockDividendHistoryDomain> LIST_STOCK_DIVIDEND_HOSTORY = new ArrayList<>();
	private static final List<StockPriceDomain> LIST_STOCK_PRICE = new ArrayList<>();

	@Builder
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	static public class StockParserResult {
		private List<StockItemDomain> items;
		private List<StockDividendDomain> dividends;
		private List<StockDividendHistoryDomain> histories;
		private List<StockPriceDomain> prices;

		@Override
		public String toString() {
			return String.format("StockParserResult(items: #%d, dividends: #%d, histories: #%d, prices: #%d)", Utility.size(items), Utility.size(dividends), Utility.size(histories), Utility.size(prices));
		}

		public void addAll(StockParserResult source) {
			items.addAll(source.getItems());
			dividends.addAll(source.getDividends());
			histories.addAll(source.getHistories());
			prices.addAll(source.getPrices());
		}

		public boolean isEmpty() {
			return items.isEmpty() && dividends.isEmpty() && histories.isEmpty() && prices.isEmpty();
		}

		public void clear() {
			if (items == null) {
				items = new ArrayList<>();
			} else {
				items.clear();
			}
			if (dividends == null) {
				dividends = new ArrayList<>();
			} else {
				dividends.clear();
			}
			if (histories == null) {
				histories = new ArrayList<>();
			} else {
				histories.clear();
			}
			if (prices == null) {
				prices = new ArrayList<>();
			} else {
				prices.clear();
			}
		}

	}

	// 네이버 종목상세
	public static void naverStockDetail(Integer date, String code, String symbol, String symbol1, String symbol2, String symbol3, String symbol4, String symbol5, String symbol6, String symbol7, String ckospi, String cwics, String etfckospi,
			String etfcwics, String currentPrice, String volumeOfListedShares, String priceEarningsRatio) {
		log.info("{} naverStockDetail(『{} {}』『{} {} {} {} {} {} {} {}』『{} {}』『{} {}』『{}』『{}』『{}』)", Utility.indentMiddle(), date, code, symbol, symbol1, symbol2, symbol3, symbol4, symbol5, symbol6, symbol7, ckospi, cwics, etfckospi, etfcwics, currentPrice,
				volumeOfListedShares, priceEarningsRatio);
		Boolean etf = null;
		if (etfckospi != null || etfcwics != null) {
			etf = true;
		} else if (ckospi != null || cwics != null) {
			etf = false;
		}
		StockItemDomain stockItem = new StockItemDomain(symbol, code, null, volumeOfListedShares, etf, null, null, null);
		stockItem.setSymbol(symbol, symbol1, symbol2, symbol3, symbol4, symbol5, symbol6, symbol7);
		stockItem.setVolumeOfListedShares(volumeOfListedShares);
		stockItem.setCategory(ckospi, cwics, etfckospi, etfcwics);
		LIST_STOCK_ITEM.add(stockItem);

		// dividend
		StockDividendDomain stockDividend = new StockDividendDomain(code, currentPrice, null, null, priceEarningsRatio, null, null, null, null, null, null, null);
		LIST_STOCK_DIVIDEND.add(stockDividend);

		log.trace("{} naverStockDetail(...) - Item:: {}", Utility.indentMiddle(), stockItem);
		log.trace("{} naverStockDetail(...) - Dividend:: {}", Utility.indentMiddle(), stockDividend);
	}

	// KSD증권정보포털(SEIBro) > 기업 > 기업기본정보
	public static void crawlCompanyDetails(Integer date
			, String code
			, String symbol, String symbol1, String symbol2, String symbol3, String symbol4, String symbol5, String symbol6, String symbol7
			, String category, String category1, String category2, String category3, String category4, String category5, String category6, String category7
			, String fics, String fics1, String fics2, String fics3, String fics4, String fics5, String fics6, String fics7
			, String ea
			, String ipo
			) {
		StockItemDomain item = StockItemDomain.builder()
				.code(code)
				.volumeOfListedShares(Utility.parseInteger(ea, null))
				.ipoDate(Utility.parseDateTime(ipo, null))
				.build();
		item.setSymbol(symbol, symbol1, symbol2, symbol3, symbol4, symbol5, symbol6, symbol7);
		item.setCategory(category, category1, category2, category3, category4, category5, category6, category7
				, fics, fics1, fics2, fics3, fics4, fics5, fics6, fics7);
		LIST_STOCK_ITEM.add(item);
	}

	// KSD증권정보포털(SEIBro) > 주식 > 배당정보 > 배당순위
	public static void crawlCompanyTopDividend(Integer date
			, String code, String type) {
		LIST_STOCK_ITEM.add(StockItemDomain.builder().code(code).type(type).build());
	}

	// KSD증권정보포털(SEIBro) > ETF > ETF종합정보 > 종목상세
	public static void crawlEtfDetailThread(Integer mark, String code
			, String symbol, String symbol1, String symbol2, String symbol3, String symbol4, String symbol5, String symbol6, String symbol7
			, String category, String category1, String category2, String category3, String category4, String category5, String category6, String category7
			, String date
			, String fee) {
		log.info("{} crawlEtfDetailThread(『{} {}』『{} {} {} {} {} {} {} {}』『{} {} {} {} {} {} {} {} {}』『{}』)", Utility.indentMiddle()
				, mark, code, symbol, symbol1, symbol2, symbol3, symbol4, symbol5, symbol6, symbol7, date, category, category1, fee);
		StockItemDomain item = StockItemDomain.builder().code(code).build();
		item.setSymbol(symbol, symbol1, symbol2, symbol3, symbol4, symbol5, symbol6, symbol7);
		item.setSymbol(item.getSymbol().split("\\[[0-9]+")[0]);
		item.setCategory(category, category1, category2, category3, category4, category5, category6, category7);
		item.setIpoDate(Utility.parseDateTime(date, null));
		LIST_STOCK_ITEM.add(item);
	}

	public static void extractAllEtfFromNaver(Integer date, String codeString, String symbol, String symbol1, String symbol2, String symbol3, String symbol4, String symbol5, String symbol6, String symbol7) {
		String code = codeString.split("=")[1];
		StockItemDomain stockItem = new StockItemDomain(null, code, null, null, true, null, null, null);
		LIST_STOCK_ITEM.add(stockItem);
	}

	public static void crawlDividendHistoryEtfThread(Integer date, String code, String symbol, String symbol1, String symbol2, String symbol3, String symbol4, String symbol5, String symbol6, String symbol7, String base, String pay, String dividend,
			String price, String ratio) {
		LIST_STOCK_DIVIDEND_HOSTORY.add(StockDividendHistoryDomain.builder().code(code).base(Utility.parseDateTime(base)).pay(Utility.parseDateTime(pay)).dividend(Utility.parseInteger(dividend, null)).build());
	}

	public static void extractTextStockPrice(Integer date, String code, String base, String closing, String market, String high, String low, String volume) {
		StockPriceDomain price = StockPriceDomain.builder().code(code).base(Utility.parseDateTime(base)).closing(Utility.parseInteger(closing)).market(Utility.parseInteger(market)).high(Utility.parseInteger(high)).low(Utility.parseInteger(low))
				.volume(Utility.parseInteger(volume)).build();
		LIST_STOCK_PRICE.add(price);
		log.trace("{} naverStockPrices(...) - {}", Utility.indentMiddle(), price);
	}

	public static void seibroDividendItem(Integer date, String base, String pay, String code, String symbol, String dividend) {
		StockDividendHistoryDomain history = new StockDividendHistoryDomain(code, base, pay, dividend);
		LIST_STOCK_DIVIDEND_HOSTORY.add(history);
		log.trace("{} seibroDividendItem(...) - {}", Utility.indentMiddle(), history);
	}

	public static StockParserResult testHtmlFile(String filename) {
		return testHtmlFile(filename, new HashMap<String, Boolean>());
	}

	public static StockParserResult testHtmlFile(String filename, Map<String, Boolean> mapExtract) {
		log.info("{} testHtmlFile(『{}』)", Utility.indentStart(), filename);

		String html = Utility.readClassPathFile(filename);
		String textFromHtml = HtmlParserService.extractTextFromHtml(html, mapExtract);

		StockParserResult result = parse(textFromHtml, true);

		log.info("{} {} testHtmlFile(『{}』)", Utility.indentEnd(), result, filename);
		return result;
	}

	public static StockParserResult testText(String text) {
		StockParserResult result = parse(text, true);
		log.info("{} text = 『\n{}\n』", Utility.indentMiddle(), text);
		return result;
	}

	private static void printTokens(String text) {
		StockLexer lexer = new StockLexer(CharStreams.fromString(text));
		String tokensFromText = tokens(lexer, "NEWLINE");
		log.info("{} tokensFromText = 『\n{}\n』", Utility.indentMiddle(), tokensFromText);
	}

	public static String tokens(Lexer lexer, String eol) {
		log.trace("{} tokens(..., 『{}』)", Utility.indentStart(), eol);

		if (lexer == null || eol == null) {
			log.trace("{} NULL_PARAMETER::tokens(..., 『{}』)", Utility.indentEnd(), eol);
			return Utility.BLANK;
		}

		List<? extends Token> listToken = lexer.getAllTokens();
		String result = Utility.BLANK;
		String input = Utility.BLANK;
		String output = Utility.BLANK;
		int maxLength = 0;
		Vocabulary vocabulary = lexer.getVocabulary();
		for (int cx = 0, sizex = listToken.size(); cx < sizex; cx++) {
			Token token = listToken.get(cx);
			String tokenText = token.getText();
			int tokenType = token.getType();
			String symbolicName = vocabulary.getSymbolicName(tokenType);
			if (symbolicName == null) {
				symbolicName = Utility.append("【", tokenText, "】");
			}
			log.trace("{} 『{}』 『{}』", Utility.indentMiddle(), tokenText.replaceAll("\\n", "\\\\n"), symbolicName);
			if (eol.compareToIgnoreCase(symbolicName) == 0) {
				output = output.trim();
				maxLength = Math.max(maxLength, output.length());
				int tabs = Math.min(8, (maxLength - output.length() + 3) / 4);

				result += Utility.append(output, "\t\t", Utility.repeat("\t", tabs), symbolicName, "\t\t//\t", input.replaceAll("\\n", "\\\\n"), tokenText);
				log.trace("{} {}\t\t{}{}\t\t//\t{}", Utility.indentMiddle(), output, Utility.repeat("\t", tabs), symbolicName, input.replaceAll("\\n", "\\\\n"));

				input = "";
				output = "";
				continue;
			}

			input += (tokenText + " ");
			output += (symbolicName + " ");
		}

		log.trace("{} tokens(..., 『{}』) - 『{}』", Utility.indentEnd(), eol, Utility.ellipsis(result.trim(), 32, 32).replaceAll("\\n", "\\\\n"));
		return result;
	}

	public static synchronized StockParserResult parse(String text, boolean debug) {
		log.debug("{} parse(『{}』, {}』)", Utility.indentStart(), Utility.ellipsisEscape(text, 16), debug);
		long started = System.currentTimeMillis();

		LIST_STOCK_ITEM.clear();
		LIST_STOCK_DIVIDEND.clear();
		LIST_STOCK_DIVIDEND_HOSTORY.clear();
		LIST_STOCK_PRICE.clear();

		if (text == null || text.isBlank()) {
			log.debug("{} PARAMETER parse(『{}』, 『{}』) - {}", Utility.indentEnd(), Utility.ellipsisEscape(text, 16), debug, Utility.toStringPastTimeReadable(started));
			return StockParserResult.builder().items(new ArrayList<>()).dividends(new ArrayList<>()).histories(new ArrayList<>()).prices(new ArrayList<>()).build();
		}

		StockLexer lexer = new StockLexer(CharStreams.fromString(text));

		// Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Pass the tokens to the parser
		StockParser parser = new StockParser(tokens);

		parser.setTrace(false);
		parser.stockDocument();

		StockParserResult result = StockParserResult.builder().items(new ArrayList<>(LIST_STOCK_ITEM)).dividends(new ArrayList<>(LIST_STOCK_DIVIDEND)).histories(new ArrayList<>(LIST_STOCK_DIVIDEND_HOSTORY)).prices(new ArrayList<>(LIST_STOCK_PRICE))
				.build();

		if (debug || result.isEmpty()) {
			log.info("{} parse(『\n{}\n』)", Utility.indentMiddle(), text);
			printTokens(text);
		}

		log.debug("{} {} parse(『{}』, 『{}』) - {}", Utility.indentEnd(), result, Utility.ellipsisEscape(text, 16), debug, Utility.toStringPastTimeReadable(started));
		return result;
	}

}
