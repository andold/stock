package kr.andold.stock.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;

import kr.andold.stock.antlr.KrxEtfLexer;
import kr.andold.stock.antlr.KrxEtfParser;
import kr.andold.stock.antlr.SeibroEtfLexer;
import kr.andold.stock.antlr.SeibroEtfParser;
import kr.andold.stock.antlr.SeibroLexer;
import kr.andold.stock.antlr.SeibroParser;
import kr.andold.stock.antlr.StockLexer;
import kr.andold.stock.antlr.StockParser;
import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.PriceDomain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ParserService {
	private static final List<ItemDomain> LIST_STOCK_ITEM = new ArrayList<>();
	private static final List<DividendHistoryDomain> LIST_STOCK_DIVIDEND_HOSTORY = new ArrayList<>();
	private static final List<PriceDomain> LIST_STOCK_PRICE = new ArrayList<>();

	@Builder
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	static public class ParserResult {
		private List<ItemDomain> items;
		private List<DividendHistoryDomain> histories;
		private List<PriceDomain> prices;

		@Override
		public String toString() {
			return String.format("ParserResult(items: #%d, histories: #%d, prices: #%d)", Utility.size(items), Utility.size(histories), Utility.size(prices));
		}

		public void addAll(ParserResult source) {
			items.addAll(source.getItems());
			histories.addAll(source.getHistories());
			prices.addAll(source.getPrices());
		}

		public boolean isEmpty() {
			return items.isEmpty() && histories.isEmpty() && prices.isEmpty();
		}

		public ParserResult clear() {
			if (items == null) {
				items = new ArrayList<>();
			} else {
				items.clear();
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
			
			return this;
		}

	}

	public static void item(int mark
			, String code
			, String symbol, String symbol1, String symbol2, String symbol3, String symbol4, String symbol5, String symbol6, String symbol7
			, String category, String category1, String category2, String category3, String category4, String category5, String category6, String category7
			, String type
			, String ipoOpen, String ipoClose
			, String ea
			, String fee
	) {
		log.debug("{} item(『{}』『{}』『{} {} {} {} {} {} {} {}』『{} {} {} {} {} {} {} {}』『{}』『{}{}』『{}』『{}』)", Utility.indentMiddle(), mark
				, code
				, symbol, symbol1, symbol2, symbol3, symbol4, symbol5, symbol6, symbol7
				, category, category1, category2, category3, category4, category5, category6, category7
				, type
				, ipoOpen, ipoClose
				, ea
				, fee
		);
		if (code.startsWith("KR")) {
			code = code.substring(3, 9);
		}

		ItemDomain item = ItemDomain.builder()
				.code(code)
				.build();
		item.setSymbol(symbol, symbol1, symbol2, symbol3, symbol4, symbol5, symbol6, symbol7);
		item.setSymbol(item.getSymbol().split("[\\(\\[][0-9]+[\\)\\]]")[0].strip());
		item.setCategory(category, category1, category2, category3, category4, category5, category6, category7);
		if ("유가증권".equalsIgnoreCase(type)) {
			item.setType("KOSPI");
		} else if ("코스닥".equalsIgnoreCase(type)) {
			item.setType("KOSDAQ");
		} else {
			item.setType(type);
		}
		item.setIpoOpen(Utility.parseDateTime(ipoOpen, null));
		item.setIpoClose(Utility.parseDateTime(ipoClose, null));
		item.setVolumeOfListedShares(ea);
		LIST_STOCK_ITEM.add(item);
	}

	public static void price(int mark
			, String code
			, String base, String closing, String market, String high, String low, String volume
			) {
		log.trace("{} price(『{}』『{}』『{} {} {} {} {} {}』)", Utility.indentMiddle(), mark
				, code
				, base, closing, market, high, low, volume);
		if (code == null || base == null) {
			return;
		}

		if (code.startsWith("KR")) {
			code = code.substring(3, 9);
		}

		Date baseDate = Utility.parseDateTime(base, null);
		if (baseDate == null) {
			log.warn("{} DATE_IS_INVALID price(『{}』『{}』『{} {} {} {} {} {}』)", Utility.indentMiddle(), mark
					, code
					, base, closing, market, high, low, volume);
			return;
		}

		LIST_STOCK_PRICE.add(PriceDomain.builder()
				.code(code)
				.base(baseDate)
				.closing(Utility.parseInteger(closing, null))
				.market(Utility.parseInteger(market, null))
				.high(Utility.parseInteger(high, null))
				.low(Utility.parseInteger(low, null))
				.volume(Utility.parseInteger(volume, null))
				.flag(0)
				.build());
	}

	public static void dividend(Integer mark, String code, String base, String pay, String dividend, String priceBase, String priceClosing) {
		log.debug("{} dividend(『{}』『{}』『{} {} {}』『{} {}』)", Utility.indentMiddle(), mark
				, code
				, base, pay, dividend
				, priceBase, priceClosing
		);
		if (code.startsWith("KR")) {
			code = code.substring(3, 9);
		}

		LIST_STOCK_DIVIDEND_HOSTORY.add(DividendHistoryDomain.builder()
				.code(code)
				.base(Utility.parseDateTime(base))
				.pay(Utility.parseDateTime(pay))
				.dividend(Utility.parseInteger(dividend, null))
				.priceBase(Utility.parseDateTime(priceBase))
				.priceClosing(Utility.parseInteger(priceClosing, null))
				.build());
		}

	private static void infoPrintTokens(String text) {
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

	public static synchronized ParserResult parse(String text, boolean debug) {
		log.debug("{} parse(『{}』, {}』)", Utility.indentStart(), Utility.ellipsisEscape(text, 16), debug);
		long started = System.currentTimeMillis();

		LIST_STOCK_ITEM.clear();
		LIST_STOCK_DIVIDEND_HOSTORY.clear();
		LIST_STOCK_PRICE.clear();

		if (text == null || text.isBlank()) {
			log.debug("{} PARAMETER parse(『{}』, 『{}』) - {}", Utility.indentEnd(), Utility.ellipsisEscape(text, 16), debug, Utility.toStringPastTimeReadable(started));
			return ParserResult.builder().items(new ArrayList<>()).histories(new ArrayList<>()).prices(new ArrayList<>()).build();
		}

		StockLexer lexer = new StockLexer(CharStreams.fromString(text));

		// Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Pass the tokens to the parser
		StockParser parser = new StockParser(tokens);

		parser.setTrace(false);
		parser.stockDocument();

		ParserResult result = ParserResult.builder().items(new ArrayList<>(LIST_STOCK_ITEM)).histories(new ArrayList<>(LIST_STOCK_DIVIDEND_HOSTORY)).prices(new ArrayList<>(LIST_STOCK_PRICE))
				.build();

		if (debug || result.isEmpty()) {
			log.info("{} parse(『\n{}\n』)", Utility.indentMiddle(), text);
			infoPrintTokens(text);
		} else {
			log.debug("{} parse(『\n{}\n』)", Utility.indentMiddle(), Utility.ellipsis(text, 1024, 1024));
		}

		if (result.isEmpty()) {
			result = parseByKrxEtf(text, debug);
		}
		if (result.isEmpty()) {
			result = parseBySeibro(text, debug);
		}

		log.debug("{} {} parse(『{}』, 『{}』) - {}", Utility.indentEnd(), result, Utility.ellipsisEscape(text, 16), debug, Utility.toStringPastTimeReadable(started));
		return result;
	}

	protected static ParserResult parseByKrxEtf(String text, boolean debug) {
		log.debug("{} parseByKrxEtf(『{}』, {}』)", Utility.indentStart(), Utility.ellipsisEscape(text, 16), debug);
		long started = System.currentTimeMillis();

		LIST_STOCK_ITEM.clear();
		LIST_STOCK_DIVIDEND_HOSTORY.clear();
		LIST_STOCK_PRICE.clear();

		if (text == null || text.isBlank()) {
			log.debug("{} PARAMETER parseByKrxEtf(『{}』, 『{}』) - {}", Utility.indentEnd(), Utility.ellipsisEscape(text, 16), debug, Utility.toStringPastTimeReadable(started));
			return ParserResult.builder().items(new ArrayList<>()).histories(new ArrayList<>()).prices(new ArrayList<>()).build();
		}

		KrxEtfLexer lexer = new KrxEtfLexer(CharStreams.fromString(text));

		// Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Pass the tokens to the parser
		KrxEtfParser parser = new KrxEtfParser(tokens);

		parser.setTrace(false);
		parser.krxEtfDocument();

		ParserResult result = ParserResult.builder().items(new ArrayList<>(LIST_STOCK_ITEM)).histories(new ArrayList<>(LIST_STOCK_DIVIDEND_HOSTORY)).prices(new ArrayList<>(LIST_STOCK_PRICE))
				.build();

		if (debug || result.isEmpty()) {
			log.info("{} parseByKrxEtf(『\n{}\n』)", Utility.indentMiddle(), text);
			infoPrintTokensBySeibro(text);
		} else {
			log.debug("{} parseByKrxEtf(『\n{}\n』)", Utility.indentMiddle(), Utility.ellipsis(text, 1024, 1024));
		}

		if (result.isEmpty()) {
			result = parseBySeibroEtf(text, debug);
		}

		log.debug("{} {} parseByKrxEtf(『{}』, 『{}』) - {}", Utility.indentEnd(), result, Utility.ellipsisEscape(text, 16), debug, Utility.toStringPastTimeReadable(started));
		return result;
	}
	protected static ParserResult parseBySeibro(String text, boolean debug) {
		log.debug("{} parseBySeibro(『{}』, {}』)", Utility.indentStart(), Utility.ellipsisEscape(text, 16), debug);
		long started = System.currentTimeMillis();

		LIST_STOCK_ITEM.clear();
		LIST_STOCK_DIVIDEND_HOSTORY.clear();
		LIST_STOCK_PRICE.clear();

		if (text == null || text.isBlank()) {
			log.debug("{} PARAMETER parseBySeibro(『{}』, 『{}』) - {}", Utility.indentEnd(), Utility.ellipsisEscape(text, 16), debug, Utility.toStringPastTimeReadable(started));
			return ParserResult.builder().items(new ArrayList<>()).histories(new ArrayList<>()).prices(new ArrayList<>()).build();
		}

		SeibroLexer lexer = new SeibroLexer(CharStreams.fromString(text));

		// Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Pass the tokens to the parser
		SeibroParser parser = new SeibroParser(tokens);

		parser.setTrace(false);
		parser.stockDocument();

		ParserResult result = ParserResult.builder().items(new ArrayList<>(LIST_STOCK_ITEM)).histories(new ArrayList<>(LIST_STOCK_DIVIDEND_HOSTORY)).prices(new ArrayList<>(LIST_STOCK_PRICE))
				.build();

		if (debug || result.isEmpty()) {
			log.info("{} parseBySeibro(『\n{}\n』)", Utility.indentMiddle(), text);
			infoPrintTokensBySeibro(text);
		} else {
			log.debug("{} parseBySeibro(『\n{}\n』)", Utility.indentMiddle(), Utility.ellipsis(text, 1024, 1024));
		}

		if (result.isEmpty()) {
			result = parseBySeibroEtf(text, debug);
		}

		log.debug("{} {} parseBySeibro(『{}』, 『{}』) - {}", Utility.indentEnd(), result, Utility.ellipsisEscape(text, 16), debug, Utility.toStringPastTimeReadable(started));
		return result;
	}
	protected static ParserResult parseBySeibroEtf(String text, boolean debug) {
		log.debug("{} parseBySeibroEtf(『{}』, {}』)", Utility.indentStart(), Utility.ellipsisEscape(text, 16), debug);
		long started = System.currentTimeMillis();

		LIST_STOCK_ITEM.clear();
		LIST_STOCK_DIVIDEND_HOSTORY.clear();
		LIST_STOCK_PRICE.clear();

		if (text == null || text.isBlank()) {
			log.debug("{} PARAMETER parseBySeibroEtf(『{}』, 『{}』) - {}", Utility.indentEnd(), Utility.ellipsisEscape(text, 16), debug, Utility.toStringPastTimeReadable(started));
			return ParserResult.builder().items(new ArrayList<>()).histories(new ArrayList<>()).prices(new ArrayList<>()).build();
		}

		SeibroEtfLexer lexer = new SeibroEtfLexer(CharStreams.fromString(text));

		// Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Pass the tokens to the parser
		SeibroEtfParser parser = new SeibroEtfParser(tokens);

		parser.setTrace(false);
		parser.seibroEtfDocument();

		ParserResult result = ParserResult.builder().items(new ArrayList<>(LIST_STOCK_ITEM)).histories(new ArrayList<>(LIST_STOCK_DIVIDEND_HOSTORY)).prices(new ArrayList<>(LIST_STOCK_PRICE))
				.build();

		if (debug || result.isEmpty()) {
			log.info("{} parseBySeibroEtf(『\n{}\n』)", Utility.indentMiddle(), text);
			infoPrintTokensBySeibroEtf(text);
		} else {
			log.debug("{} parseBySeibroEtf(『\n{}\n』)", Utility.indentMiddle(), Utility.ellipsis(text, 1024, 1024));
		}

		log.debug("{} {} parseBySeibroEtf(『{}』, 『{}』) - {}", Utility.indentEnd(), result, Utility.ellipsisEscape(text, 16), debug, Utility.toStringPastTimeReadable(started));
		return result;
	}

	private static void infoPrintTokensBySeibro(String text) {
		SeibroLexer lexer = new SeibroLexer(CharStreams.fromString(text));
		String tokensFromText = tokens(lexer, "NEWLINE");
		log.info("{} infoPrintTokensBySeibro::tokensFromText = 『\n{}\n』", Utility.indentMiddle(), tokensFromText);
	}
	private static void infoPrintTokensBySeibroEtf(String text) {
		SeibroEtfLexer lexer = new SeibroEtfLexer(CharStreams.fromString(text));
		String tokensFromText = tokens(lexer, "NEWLINE");
		log.info("{} infoPrintTokensBySeibroEtf::tokensFromText = 『\n{}\n』", Utility.indentMiddle(), tokensFromText);
	}

}
