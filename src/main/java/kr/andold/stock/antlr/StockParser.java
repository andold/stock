// Generated from C:\src\eclipse-workspace\stock\src\main\resources\grammar\Stock.g4 by ANTLR 4.10.1
package kr.andold.stock.antlr;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.stock.service.StockParserService;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StockParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANK=1, BLANK_LINE=2, TAB=3, NEWLINE=4, KEYWORD=5, DATE=6, TIME=7, NUMBER=8, 
		STRING=9, WORD=10;
	public static final int
		RULE_stockDocument = 0, RULE_crawlCompanyDetails = 1, RULE_crawlCompanyTopDividend = 2, 
		RULE_crawlEtfDetailThread = 3, RULE_extractAllEtfFromNaver = 4, RULE_crawlDividendHistoryEtfThread = 5, 
		RULE_extractItemDetailsEtf = 6, RULE_extractlDividendHistory = 7, RULE_extractTextStockPrice = 8, 
		RULE_seibroDividend = 9, RULE_seibroDividendItem = 10, RULE_word = 11, 
		RULE_line = 12, RULE_eof = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"stockDocument", "crawlCompanyDetails", "crawlCompanyTopDividend", "crawlEtfDetailThread", 
			"extractAllEtfFromNaver", "crawlDividendHistoryEtfThread", "extractItemDetailsEtf", 
			"extractlDividendHistory", "extractTextStockPrice", "seibroDividend", 
			"seibroDividendItem", "word", "line", "eof"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANK", "BLANK_LINE", "TAB", "NEWLINE", "KEYWORD", "DATE", "TIME", 
			"NUMBER", "STRING", "WORD"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Stock.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private final Logger log = LoggerFactory.getLogger(getClass());

	public StockParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StockDocumentContext extends ParserRuleContext {
		public ExtractTextStockPriceContext extractTextStockPrice() {
			return getRuleContext(ExtractTextStockPriceContext.class,0);
		}
		public ExtractlDividendHistoryContext extractlDividendHistory() {
			return getRuleContext(ExtractlDividendHistoryContext.class,0);
		}
		public SeibroDividendContext seibroDividend() {
			return getRuleContext(SeibroDividendContext.class,0);
		}
		public CrawlDividendHistoryEtfThreadContext crawlDividendHistoryEtfThread() {
			return getRuleContext(CrawlDividendHistoryEtfThreadContext.class,0);
		}
		public ExtractAllEtfFromNaverContext extractAllEtfFromNaver() {
			return getRuleContext(ExtractAllEtfFromNaverContext.class,0);
		}
		public CrawlEtfDetailThreadContext crawlEtfDetailThread() {
			return getRuleContext(CrawlEtfDetailThreadContext.class,0);
		}
		public CrawlCompanyTopDividendContext crawlCompanyTopDividend() {
			return getRuleContext(CrawlCompanyTopDividendContext.class,0);
		}
		public CrawlCompanyDetailsContext crawlCompanyDetails() {
			return getRuleContext(CrawlCompanyDetailsContext.class,0);
		}
		public StockDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stockDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterStockDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitStockDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitStockDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StockDocumentContext stockDocument() throws RecognitionException {
		StockDocumentContext _localctx = new StockDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stockDocument);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				extractTextStockPrice();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				extractlDividendHistory();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				seibroDividend();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				crawlDividendHistoryEtfThread();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
				extractAllEtfFromNaver();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(33);
				crawlEtfDetailThread();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(34);
				crawlCompanyTopDividend();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(35);
				crawlCompanyDetails();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CrawlCompanyDetailsContext extends ParserRuleContext {
		public Token code;
		public WordContext symbol;
		public WordContext symbol1;
		public WordContext symbol2;
		public WordContext symbol3;
		public WordContext symbol4;
		public WordContext symbol5;
		public WordContext symbol6;
		public WordContext symbol7;
		public WordContext category;
		public WordContext category1;
		public WordContext category2;
		public WordContext category3;
		public WordContext category4;
		public WordContext category5;
		public WordContext category6;
		public WordContext category7;
		public WordContext fics;
		public WordContext fics1;
		public WordContext fics2;
		public WordContext fics3;
		public WordContext fics4;
		public WordContext fics5;
		public WordContext fics6;
		public WordContext fics7;
		public Token ea;
		public Token ipo;
		public List<TerminalNode> KEYWORD() { return getTokens(StockParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(StockParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(StockParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(StockParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(StockParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(StockParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(StockParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(StockParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(StockParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(StockParser.DATE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(StockParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(StockParser.NUMBER, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public CrawlCompanyDetailsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crawlCompanyDetails; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterCrawlCompanyDetails(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitCrawlCompanyDetails(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitCrawlCompanyDetails(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlCompanyDetailsContext crawlCompanyDetails() throws RecognitionException {
		CrawlCompanyDetailsContext _localctx = new CrawlCompanyDetailsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_crawlCompanyDetails);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(KEYWORD);
			setState(39);
			match(TAB);
			setState(40);
			match(WORD);
			setState(41);
			match(WORD);
			setState(42);
			match(TAB);
			setState(43);
			match(WORD);
			setState(44);
			match(TAB);
			setState(45);
			match(WORD);
			setState(46);
			match(TAB);
			setState(47);
			match(WORD);
			setState(48);
			match(NEWLINE);
			setState(156); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(49);
					match(KEYWORD);
					setState(50);
					match(TAB);
					setState(51);
					((CrawlCompanyDetailsContext)_localctx).code = match(NUMBER);
					setState(52);
					match(TAB);
					setState(53);
					((CrawlCompanyDetailsContext)_localctx).symbol = word();
					setState(55);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(54);
						((CrawlCompanyDetailsContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(58);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(57);
						((CrawlCompanyDetailsContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(61);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(60);
						((CrawlCompanyDetailsContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(64);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(63);
						((CrawlCompanyDetailsContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(67);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(66);
						((CrawlCompanyDetailsContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(70);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(69);
						((CrawlCompanyDetailsContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(72);
						((CrawlCompanyDetailsContext)_localctx).symbol7 = word();
						}
						}
						setState(77);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(78);
					match(NEWLINE);
					setState(79);
					match(KEYWORD);
					setState(80);
					match(TAB);
					setState(82);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(81);
						((CrawlCompanyDetailsContext)_localctx).category = word();
						}
						break;
					}
					setState(85);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(84);
						((CrawlCompanyDetailsContext)_localctx).category1 = word();
						}
						break;
					}
					setState(88);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(87);
						((CrawlCompanyDetailsContext)_localctx).category2 = word();
						}
						break;
					}
					setState(91);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(90);
						((CrawlCompanyDetailsContext)_localctx).category3 = word();
						}
						break;
					}
					setState(94);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(93);
						((CrawlCompanyDetailsContext)_localctx).category4 = word();
						}
						break;
					}
					setState(97);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(96);
						((CrawlCompanyDetailsContext)_localctx).category5 = word();
						}
						break;
					}
					setState(100);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(99);
						((CrawlCompanyDetailsContext)_localctx).category6 = word();
						}
						break;
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(102);
						((CrawlCompanyDetailsContext)_localctx).category7 = word();
						}
						}
						setState(107);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(108);
					match(NEWLINE);
					setState(109);
					match(KEYWORD);
					setState(110);
					match(TAB);
					setState(112);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(111);
						((CrawlCompanyDetailsContext)_localctx).fics = word();
						}
						break;
					}
					setState(115);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(114);
						((CrawlCompanyDetailsContext)_localctx).fics1 = word();
						}
						break;
					}
					setState(118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(117);
						((CrawlCompanyDetailsContext)_localctx).fics2 = word();
						}
						break;
					}
					setState(121);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(120);
						((CrawlCompanyDetailsContext)_localctx).fics3 = word();
						}
						break;
					}
					setState(124);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(123);
						((CrawlCompanyDetailsContext)_localctx).fics4 = word();
						}
						break;
					}
					setState(127);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(126);
						((CrawlCompanyDetailsContext)_localctx).fics5 = word();
						}
						break;
					}
					setState(130);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(129);
						((CrawlCompanyDetailsContext)_localctx).fics6 = word();
						}
						break;
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(132);
						((CrawlCompanyDetailsContext)_localctx).fics7 = word();
						}
						}
						setState(137);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(138);
					match(NEWLINE);
					setState(139);
					match(KEYWORD);
					setState(140);
					match(TAB);
					setState(141);
					((CrawlCompanyDetailsContext)_localctx).ea = match(NUMBER);
					setState(142);
					match(WORD);
					setState(143);
					match(NEWLINE);
					setState(144);
					match(KEYWORD);
					setState(145);
					match(TAB);
					setState(146);
					((CrawlCompanyDetailsContext)_localctx).ipo = match(DATE);
					setState(147);
					match(NEWLINE);
					setState(148);
					match(WORD);
					setState(149);
					match(TAB);
					setState(150);
					match(WORD);
					setState(151);
					match(TAB);
					setState(152);
					match(DATE);
					setState(153);
					match(NEWLINE);

							StockParserService.crawlCompanyDetails(20231217
								, (((CrawlCompanyDetailsContext)_localctx).code!=null?((CrawlCompanyDetailsContext)_localctx).code.getText():null)
								, (((CrawlCompanyDetailsContext)_localctx).symbol!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).symbol.start,((CrawlCompanyDetailsContext)_localctx).symbol.stop):null), (((CrawlCompanyDetailsContext)_localctx).symbol1!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).symbol1.start,((CrawlCompanyDetailsContext)_localctx).symbol1.stop):null), (((CrawlCompanyDetailsContext)_localctx).symbol2!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).symbol2.start,((CrawlCompanyDetailsContext)_localctx).symbol2.stop):null), (((CrawlCompanyDetailsContext)_localctx).symbol3!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).symbol3.start,((CrawlCompanyDetailsContext)_localctx).symbol3.stop):null), (((CrawlCompanyDetailsContext)_localctx).symbol4!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).symbol4.start,((CrawlCompanyDetailsContext)_localctx).symbol4.stop):null), (((CrawlCompanyDetailsContext)_localctx).symbol5!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).symbol5.start,((CrawlCompanyDetailsContext)_localctx).symbol5.stop):null), (((CrawlCompanyDetailsContext)_localctx).symbol6!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).symbol6.start,((CrawlCompanyDetailsContext)_localctx).symbol6.stop):null), (((CrawlCompanyDetailsContext)_localctx).symbol7!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).symbol7.start,((CrawlCompanyDetailsContext)_localctx).symbol7.stop):null)
								, (((CrawlCompanyDetailsContext)_localctx).category!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).category.start,((CrawlCompanyDetailsContext)_localctx).category.stop):null), (((CrawlCompanyDetailsContext)_localctx).category1!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).category1.start,((CrawlCompanyDetailsContext)_localctx).category1.stop):null), (((CrawlCompanyDetailsContext)_localctx).category2!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).category2.start,((CrawlCompanyDetailsContext)_localctx).category2.stop):null), (((CrawlCompanyDetailsContext)_localctx).category3!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).category3.start,((CrawlCompanyDetailsContext)_localctx).category3.stop):null), (((CrawlCompanyDetailsContext)_localctx).category4!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).category4.start,((CrawlCompanyDetailsContext)_localctx).category4.stop):null), (((CrawlCompanyDetailsContext)_localctx).category5!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).category5.start,((CrawlCompanyDetailsContext)_localctx).category5.stop):null), (((CrawlCompanyDetailsContext)_localctx).category6!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).category6.start,((CrawlCompanyDetailsContext)_localctx).category6.stop):null), (((CrawlCompanyDetailsContext)_localctx).category7!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).category7.start,((CrawlCompanyDetailsContext)_localctx).category7.stop):null)
								, (((CrawlCompanyDetailsContext)_localctx).fics!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).fics.start,((CrawlCompanyDetailsContext)_localctx).fics.stop):null), (((CrawlCompanyDetailsContext)_localctx).fics1!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).fics1.start,((CrawlCompanyDetailsContext)_localctx).fics1.stop):null), (((CrawlCompanyDetailsContext)_localctx).fics2!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).fics2.start,((CrawlCompanyDetailsContext)_localctx).fics2.stop):null), (((CrawlCompanyDetailsContext)_localctx).fics3!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).fics3.start,((CrawlCompanyDetailsContext)_localctx).fics3.stop):null), (((CrawlCompanyDetailsContext)_localctx).fics4!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).fics4.start,((CrawlCompanyDetailsContext)_localctx).fics4.stop):null), (((CrawlCompanyDetailsContext)_localctx).fics5!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).fics5.start,((CrawlCompanyDetailsContext)_localctx).fics5.stop):null), (((CrawlCompanyDetailsContext)_localctx).fics6!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).fics6.start,((CrawlCompanyDetailsContext)_localctx).fics6.stop):null), (((CrawlCompanyDetailsContext)_localctx).fics7!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).fics7.start,((CrawlCompanyDetailsContext)_localctx).fics7.stop):null)
								, (((CrawlCompanyDetailsContext)_localctx).ea!=null?((CrawlCompanyDetailsContext)_localctx).ea.getText():null)
								, (((CrawlCompanyDetailsContext)_localctx).ipo!=null?((CrawlCompanyDetailsContext)_localctx).ipo.getText():null)
							);
						
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(158); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(160);
			match(KEYWORD);
			setState(161);
			match(TAB);
			setState(162);
			match(WORD);
			setState(163);
			match(WORD);
			setState(164);
			match(TAB);
			setState(165);
			match(WORD);
			setState(166);
			match(TAB);
			setState(167);
			match(WORD);
			setState(168);
			match(TAB);
			setState(169);
			match(WORD);
			setState(170);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CrawlCompanyTopDividendContext extends ParserRuleContext {
		public Token type;
		public Token code;
		public List<TerminalNode> KEYWORD() { return getTokens(StockParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(StockParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(StockParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(StockParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(StockParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(StockParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(StockParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(StockParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(StockParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(StockParser.DATE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(StockParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(StockParser.NUMBER, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public CrawlCompanyTopDividendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crawlCompanyTopDividend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterCrawlCompanyTopDividend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitCrawlCompanyTopDividend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitCrawlCompanyTopDividend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlCompanyTopDividendContext crawlCompanyTopDividend() throws RecognitionException {
		CrawlCompanyTopDividendContext _localctx = new CrawlCompanyTopDividendContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_crawlCompanyTopDividend);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(KEYWORD);
			setState(173);
			match(TAB);
			setState(174);
			match(WORD);
			setState(175);
			match(TAB);
			setState(176);
			match(WORD);
			setState(177);
			match(WORD);
			setState(178);
			match(WORD);
			setState(179);
			match(TAB);
			setState(180);
			match(WORD);
			setState(181);
			match(TAB);
			setState(182);
			match(WORD);
			setState(183);
			match(NEWLINE);
			setState(252); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184);
				match(WORD);
				setState(185);
				match(TAB);
				setState(186);
				match(NEWLINE);
				setState(187);
				match(WORD);
				setState(188);
				match(TAB);
				setState(189);
				match(WORD);
				setState(190);
				match(TAB);
				setState(191);
				match(WORD);
				setState(192);
				match(TAB);
				setState(193);
				match(WORD);
				setState(194);
				match(TAB);
				setState(195);
				match(WORD);
				setState(196);
				match(TAB);
				setState(197);
				match(WORD);
				setState(198);
				match(TAB);
				setState(199);
				match(WORD);
				setState(200);
				match(TAB);
				setState(201);
				match(WORD);
				setState(202);
				match(TAB);
				setState(203);
				match(WORD);
				setState(204);
				match(TAB);
				setState(205);
				match(WORD);
				setState(206);
				match(TAB);
				setState(207);
				match(WORD);
				setState(208);
				match(TAB);
				setState(209);
				match(NEWLINE);
				setState(241); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(210);
						((CrawlCompanyTopDividendContext)_localctx).type = match(WORD);
						setState(211);
						match(TAB);
						setState(212);
						match(NUMBER);
						setState(213);
						match(TAB);
						setState(215);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(214);
							((CrawlCompanyTopDividendContext)_localctx).code = match(NUMBER);
							}
						}

						setState(217);
						match(TAB);
						setState(219); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(218);
							word();
							}
							}
							setState(221); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(223);
						match(TAB);
						setState(224);
						match(WORD);
						setState(225);
						match(TAB);
						setState(226);
						match(WORD);
						setState(227);
						match(TAB);
						setState(228);
						match(NUMBER);
						setState(229);
						match(TAB);
						setState(230);
						match(NUMBER);
						setState(231);
						match(TAB);
						setState(232);
						match(NUMBER);
						setState(233);
						match(TAB);
						setState(234);
						match(NUMBER);
						setState(235);
						match(TAB);
						setState(236);
						match(NUMBER);
						setState(237);
						match(TAB);
						setState(238);
						match(NEWLINE);

									StockParserService.crawlCompanyTopDividend(20231217
										, (((CrawlCompanyTopDividendContext)_localctx).code!=null?((CrawlCompanyTopDividendContext)_localctx).code.getText():null)
										, (((CrawlCompanyTopDividendContext)_localctx).type!=null?((CrawlCompanyTopDividendContext)_localctx).type.getText():null)
									);
								
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(243); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(245);
				match(WORD);
				setState(246);
				match(TAB);
				setState(247);
				match(WORD);
				setState(248);
				match(TAB);
				setState(249);
				match(DATE);
				setState(250);
				match(NEWLINE);
				}
				}
				setState(254); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(256);
			match(KEYWORD);
			setState(257);
			match(TAB);
			setState(258);
			match(WORD);
			setState(259);
			match(TAB);
			setState(260);
			match(WORD);
			setState(261);
			match(WORD);
			setState(262);
			match(WORD);
			setState(263);
			match(TAB);
			setState(264);
			match(WORD);
			setState(265);
			match(TAB);
			setState(266);
			match(WORD);
			setState(267);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CrawlEtfDetailThreadContext extends ParserRuleContext {
		public Token code;
		public WordContext symbol;
		public WordContext symbol1;
		public WordContext symbol2;
		public WordContext symbol3;
		public WordContext symbol4;
		public WordContext symbol5;
		public WordContext symbol6;
		public WordContext symbol7;
		public WordContext category;
		public WordContext category1;
		public WordContext category2;
		public WordContext category3;
		public WordContext category4;
		public WordContext category5;
		public WordContext category6;
		public WordContext category7;
		public Token ipo;
		public WordContext fee;
		public List<TerminalNode> KEYWORD() { return getTokens(StockParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(StockParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(StockParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(StockParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(StockParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(StockParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(StockParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(StockParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(StockParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(StockParser.DATE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(StockParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(StockParser.NUMBER, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public CrawlEtfDetailThreadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crawlEtfDetailThread; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterCrawlEtfDetailThread(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitCrawlEtfDetailThread(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitCrawlEtfDetailThread(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlEtfDetailThreadContext crawlEtfDetailThread() throws RecognitionException {
		CrawlEtfDetailThreadContext _localctx = new CrawlEtfDetailThreadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_crawlEtfDetailThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(KEYWORD);
			setState(270);
			match(TAB);
			setState(271);
			match(WORD);
			setState(272);
			match(WORD);
			setState(273);
			match(TAB);
			setState(274);
			match(WORD);
			setState(275);
			match(TAB);
			setState(276);
			match(WORD);
			setState(277);
			match(NEWLINE);
			setState(359); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(278);
					match(KEYWORD);
					setState(279);
					match(TAB);
					setState(280);
					((CrawlEtfDetailThreadContext)_localctx).code = match(NUMBER);
					setState(281);
					match(TAB);
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(282);
						word();
						}
						}
						setState(287);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(288);
					match(NEWLINE);
					setState(289);
					((CrawlEtfDetailThreadContext)_localctx).symbol = word();
					setState(291);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(290);
						((CrawlEtfDetailThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(294);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(293);
						((CrawlEtfDetailThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(297);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(296);
						((CrawlEtfDetailThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(300);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(299);
						((CrawlEtfDetailThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(303);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(302);
						((CrawlEtfDetailThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(306);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(305);
						((CrawlEtfDetailThreadContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(308);
						((CrawlEtfDetailThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(313);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(314);
					match(NEWLINE);
					setState(315);
					((CrawlEtfDetailThreadContext)_localctx).category = word();
					setState(317);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(316);
						((CrawlEtfDetailThreadContext)_localctx).category1 = word();
						}
						break;
					}
					setState(320);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						setState(319);
						((CrawlEtfDetailThreadContext)_localctx).category2 = word();
						}
						break;
					}
					setState(323);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						setState(322);
						((CrawlEtfDetailThreadContext)_localctx).category3 = word();
						}
						break;
					}
					setState(326);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(325);
						((CrawlEtfDetailThreadContext)_localctx).category4 = word();
						}
						break;
					}
					setState(329);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(328);
						((CrawlEtfDetailThreadContext)_localctx).category5 = word();
						}
						break;
					}
					setState(332);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(331);
						((CrawlEtfDetailThreadContext)_localctx).category6 = word();
						}
						break;
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(334);
						((CrawlEtfDetailThreadContext)_localctx).category7 = word();
						}
						}
						setState(339);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(340);
					match(NEWLINE);
					setState(341);
					((CrawlEtfDetailThreadContext)_localctx).ipo = match(DATE);
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WORD) {
						{
						{
						setState(342);
						match(WORD);
						}
						}
						setState(347);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(348);
					match(NEWLINE);
					setState(349);
					((CrawlEtfDetailThreadContext)_localctx).fee = word();
					setState(350);
					match(NEWLINE);
					setState(351);
					match(WORD);
					setState(352);
					match(TAB);
					setState(353);
					match(WORD);
					setState(354);
					match(TAB);
					setState(355);
					match(DATE);
					setState(356);
					match(NEWLINE);

							StockParserService.crawlEtfDetailThread(20231217
								, (((CrawlEtfDetailThreadContext)_localctx).code!=null?((CrawlEtfDetailThreadContext)_localctx).code.getText():null)
								, (((CrawlEtfDetailThreadContext)_localctx).symbol!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol.start,((CrawlEtfDetailThreadContext)_localctx).symbol.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol1!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol1.start,((CrawlEtfDetailThreadContext)_localctx).symbol1.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol2!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol2.start,((CrawlEtfDetailThreadContext)_localctx).symbol2.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol3!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol3.start,((CrawlEtfDetailThreadContext)_localctx).symbol3.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol4!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol4.start,((CrawlEtfDetailThreadContext)_localctx).symbol4.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol5!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol5.start,((CrawlEtfDetailThreadContext)_localctx).symbol5.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol6!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol6.start,((CrawlEtfDetailThreadContext)_localctx).symbol6.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol7!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol7.start,((CrawlEtfDetailThreadContext)_localctx).symbol7.stop):null)
								, (((CrawlEtfDetailThreadContext)_localctx).category!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category.start,((CrawlEtfDetailThreadContext)_localctx).category.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category1!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category1.start,((CrawlEtfDetailThreadContext)_localctx).category1.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category2!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category2.start,((CrawlEtfDetailThreadContext)_localctx).category2.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category3!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category3.start,((CrawlEtfDetailThreadContext)_localctx).category3.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category4!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category4.start,((CrawlEtfDetailThreadContext)_localctx).category4.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category5!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category5.start,((CrawlEtfDetailThreadContext)_localctx).category5.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category6!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category6.start,((CrawlEtfDetailThreadContext)_localctx).category6.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category7!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category7.start,((CrawlEtfDetailThreadContext)_localctx).category7.stop):null)
								, (((CrawlEtfDetailThreadContext)_localctx).ipo!=null?((CrawlEtfDetailThreadContext)_localctx).ipo.getText():null)
								, (((CrawlEtfDetailThreadContext)_localctx).fee!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).fee.start,((CrawlEtfDetailThreadContext)_localctx).fee.stop):null)
							);
						
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(361); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(363);
			match(KEYWORD);
			setState(364);
			match(TAB);
			setState(365);
			match(WORD);
			setState(366);
			match(WORD);
			setState(367);
			match(TAB);
			setState(368);
			match(WORD);
			setState(369);
			match(TAB);
			setState(370);
			match(WORD);
			setState(371);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtractAllEtfFromNaverContext extends ParserRuleContext {
		public Token code;
		public WordContext symbol;
		public WordContext symbol1;
		public WordContext symbol2;
		public WordContext symbol3;
		public WordContext symbol4;
		public WordContext symbol5;
		public WordContext symbol6;
		public WordContext symbol7;
		public List<TerminalNode> WORD() { return getTokens(StockParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(StockParser.WORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(StockParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(StockParser.TAB, i);
		}
		public TerminalNode DATE() { return getToken(StockParser.DATE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(StockParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(StockParser.NEWLINE, i);
		}
		public List<TerminalNode> KEYWORD() { return getTokens(StockParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(StockParser.KEYWORD, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public ExtractAllEtfFromNaverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extractAllEtfFromNaver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterExtractAllEtfFromNaver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitExtractAllEtfFromNaver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitExtractAllEtfFromNaver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtractAllEtfFromNaverContext extractAllEtfFromNaver() throws RecognitionException {
		ExtractAllEtfFromNaverContext _localctx = new ExtractAllEtfFromNaverContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_extractAllEtfFromNaver);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(373);
				match(KEYWORD);
				setState(374);
				match(TAB);
				setState(375);
				((ExtractAllEtfFromNaverContext)_localctx).code = match(WORD);
				setState(376);
				match(TAB);
				setState(377);
				((ExtractAllEtfFromNaverContext)_localctx).symbol = word();
				setState(379);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(378);
					((ExtractAllEtfFromNaverContext)_localctx).symbol1 = word();
					}
					break;
				}
				setState(382);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(381);
					((ExtractAllEtfFromNaverContext)_localctx).symbol2 = word();
					}
					break;
				}
				setState(385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(384);
					((ExtractAllEtfFromNaverContext)_localctx).symbol3 = word();
					}
					break;
				}
				setState(388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(387);
					((ExtractAllEtfFromNaverContext)_localctx).symbol4 = word();
					}
					break;
				}
				setState(391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(390);
					((ExtractAllEtfFromNaverContext)_localctx).symbol5 = word();
					}
					break;
				}
				setState(394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(393);
					((ExtractAllEtfFromNaverContext)_localctx).symbol6 = word();
					}
					break;
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
					{
					{
					setState(396);
					((ExtractAllEtfFromNaverContext)_localctx).symbol7 = word();
					}
					}
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(402);
				match(NEWLINE);

						StockParserService.extractAllEtfFromNaver(20231214
							, (((ExtractAllEtfFromNaverContext)_localctx).code!=null?((ExtractAllEtfFromNaverContext)_localctx).code.getText():null)
							, (((ExtractAllEtfFromNaverContext)_localctx).symbol!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol.start,((ExtractAllEtfFromNaverContext)_localctx).symbol.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol1!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol1.start,((ExtractAllEtfFromNaverContext)_localctx).symbol1.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol2!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol2.start,((ExtractAllEtfFromNaverContext)_localctx).symbol2.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol3!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol3.start,((ExtractAllEtfFromNaverContext)_localctx).symbol3.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol4!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol4.start,((ExtractAllEtfFromNaverContext)_localctx).symbol4.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol5!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol5.start,((ExtractAllEtfFromNaverContext)_localctx).symbol5.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol6!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol6.start,((ExtractAllEtfFromNaverContext)_localctx).symbol6.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol7!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol7.start,((ExtractAllEtfFromNaverContext)_localctx).symbol7.stop):null)
						);
					
				}
				}
				setState(407); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KEYWORD );
			setState(409);
			match(WORD);
			setState(410);
			match(TAB);
			setState(411);
			match(WORD);
			setState(412);
			match(TAB);
			setState(413);
			match(DATE);
			setState(414);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CrawlDividendHistoryEtfThreadContext extends ParserRuleContext {
		public Token code;
		public WordContext symbol;
		public WordContext symbol1;
		public WordContext symbol2;
		public WordContext symbol3;
		public WordContext symbol4;
		public WordContext symbol5;
		public WordContext symbol6;
		public WordContext symbol7;
		public Token base;
		public Token pay;
		public Token dividend;
		public Token price;
		public Token ratio;
		public List<TerminalNode> KEYWORD() { return getTokens(StockParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(StockParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(StockParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(StockParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(StockParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(StockParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(StockParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(StockParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(StockParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(StockParser.DATE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(StockParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(StockParser.NUMBER, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public CrawlDividendHistoryEtfThreadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crawlDividendHistoryEtfThread; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterCrawlDividendHistoryEtfThread(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitCrawlDividendHistoryEtfThread(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitCrawlDividendHistoryEtfThread(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlDividendHistoryEtfThreadContext crawlDividendHistoryEtfThread() throws RecognitionException {
		CrawlDividendHistoryEtfThreadContext _localctx = new CrawlDividendHistoryEtfThreadContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_crawlDividendHistoryEtfThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(KEYWORD);
			setState(417);
			match(TAB);
			setState(418);
			match(WORD);
			setState(419);
			match(WORD);
			setState(420);
			match(WORD);
			setState(421);
			match(TAB);
			setState(422);
			match(WORD);
			setState(423);
			match(WORD);
			setState(424);
			match(WORD);
			setState(425);
			match(TAB);
			setState(426);
			match(WORD);
			setState(427);
			match(TAB);
			setState(428);
			match(WORD);
			setState(429);
			match(NEWLINE);
			setState(539); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					{
					setState(430);
					match(KEYWORD);
					setState(431);
					match(TAB);
					setState(432);
					((CrawlDividendHistoryEtfThreadContext)_localctx).code = match(NUMBER);
					setState(433);
					match(NEWLINE);
					setState(434);
					match(WORD);
					setState(435);
					match(TAB);
					setState(436);
					match(TAB);
					setState(437);
					match(WORD);
					setState(438);
					match(TAB);
					setState(439);
					match(WORD);
					setState(440);
					match(TAB);
					setState(441);
					match(WORD);
					setState(442);
					match(TAB);
					setState(443);
					match(WORD);
					setState(444);
					match(TAB);
					setState(445);
					match(WORD);
					setState(446);
					match(TAB);
					setState(447);
					match(WORD);
					setState(448);
					match(TAB);
					setState(449);
					match(WORD);
					setState(450);
					match(TAB);
					setState(451);
					match(WORD);
					setState(452);
					match(TAB);
					setState(453);
					match(NEWLINE);
					setState(529); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(529);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case KEYWORD:
							case DATE:
							case TIME:
							case NUMBER:
							case STRING:
							case WORD:
								{
								{
								{
								setState(454);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol = word();
								setState(456);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
								case 1:
									{
									setState(455);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol1 = word();
									}
									break;
								}
								setState(459);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
								case 1:
									{
									setState(458);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol2 = word();
									}
									break;
								}
								setState(462);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
								case 1:
									{
									setState(461);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol3 = word();
									}
									break;
								}
								setState(465);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
								case 1:
									{
									setState(464);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol4 = word();
									}
									break;
								}
								setState(468);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
								case 1:
									{
									setState(467);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol5 = word();
									}
									break;
								}
								setState(471);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
								case 1:
									{
									setState(470);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol6 = word();
									}
									break;
								}
								setState(476);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
									{
									{
									setState(473);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol7 = word();
									}
									}
									setState(478);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(479);
								match(TAB);
								setState(480);
								match(TAB);
								setState(481);
								match(WORD);
								setState(482);
								match(TAB);
								setState(486);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
									{
									{
									setState(483);
									word();
									}
									}
									setState(488);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(489);
								match(TAB);
								setState(491);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(490);
									((CrawlDividendHistoryEtfThreadContext)_localctx).base = match(DATE);
									}
								}

								setState(493);
								match(TAB);
								setState(495);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(494);
									((CrawlDividendHistoryEtfThreadContext)_localctx).pay = match(DATE);
									}
								}

								setState(497);
								match(TAB);
								setState(499);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==WORD) {
									{
									setState(498);
									match(WORD);
									}
								}

								setState(501);
								match(TAB);
								setState(503);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(502);
									((CrawlDividendHistoryEtfThreadContext)_localctx).dividend = match(NUMBER);
									}
								}

								setState(505);
								match(TAB);
								setState(507);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(506);
									((CrawlDividendHistoryEtfThreadContext)_localctx).price = match(NUMBER);
									}
								}

								setState(509);
								match(TAB);
								setState(511);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(510);
									((CrawlDividendHistoryEtfThreadContext)_localctx).ratio = match(NUMBER);
									}
								}

								setState(513);
								match(TAB);
								setState(514);
								match(NEWLINE);
								}

										StockParserService.crawlDividendHistoryEtfThread(20231127
											, (((CrawlDividendHistoryEtfThreadContext)_localctx).code!=null?((CrawlDividendHistoryEtfThreadContext)_localctx).code.getText():null)
											, (((CrawlDividendHistoryEtfThreadContext)_localctx).symbol!=null?_input.getText(((CrawlDividendHistoryEtfThreadContext)_localctx).symbol.start,((CrawlDividendHistoryEtfThreadContext)_localctx).symbol.stop):null), (((CrawlDividendHistoryEtfThreadContext)_localctx).symbol1!=null?_input.getText(((CrawlDividendHistoryEtfThreadContext)_localctx).symbol1.start,((CrawlDividendHistoryEtfThreadContext)_localctx).symbol1.stop):null), (((CrawlDividendHistoryEtfThreadContext)_localctx).symbol2!=null?_input.getText(((CrawlDividendHistoryEtfThreadContext)_localctx).symbol2.start,((CrawlDividendHistoryEtfThreadContext)_localctx).symbol2.stop):null), (((CrawlDividendHistoryEtfThreadContext)_localctx).symbol3!=null?_input.getText(((CrawlDividendHistoryEtfThreadContext)_localctx).symbol3.start,((CrawlDividendHistoryEtfThreadContext)_localctx).symbol3.stop):null), (((CrawlDividendHistoryEtfThreadContext)_localctx).symbol4!=null?_input.getText(((CrawlDividendHistoryEtfThreadContext)_localctx).symbol4.start,((CrawlDividendHistoryEtfThreadContext)_localctx).symbol4.stop):null), (((CrawlDividendHistoryEtfThreadContext)_localctx).symbol5!=null?_input.getText(((CrawlDividendHistoryEtfThreadContext)_localctx).symbol5.start,((CrawlDividendHistoryEtfThreadContext)_localctx).symbol5.stop):null), (((CrawlDividendHistoryEtfThreadContext)_localctx).symbol6!=null?_input.getText(((CrawlDividendHistoryEtfThreadContext)_localctx).symbol6.start,((CrawlDividendHistoryEtfThreadContext)_localctx).symbol6.stop):null), (((CrawlDividendHistoryEtfThreadContext)_localctx).symbol7!=null?_input.getText(((CrawlDividendHistoryEtfThreadContext)_localctx).symbol7.start,((CrawlDividendHistoryEtfThreadContext)_localctx).symbol7.stop):null)
											, (((CrawlDividendHistoryEtfThreadContext)_localctx).base!=null?((CrawlDividendHistoryEtfThreadContext)_localctx).base.getText():null), (((CrawlDividendHistoryEtfThreadContext)_localctx).pay!=null?((CrawlDividendHistoryEtfThreadContext)_localctx).pay.getText():null)
											, (((CrawlDividendHistoryEtfThreadContext)_localctx).dividend!=null?((CrawlDividendHistoryEtfThreadContext)_localctx).dividend.getText():null)
											, (((CrawlDividendHistoryEtfThreadContext)_localctx).price!=null?((CrawlDividendHistoryEtfThreadContext)_localctx).price.getText():null)
											, (((CrawlDividendHistoryEtfThreadContext)_localctx).ratio!=null?((CrawlDividendHistoryEtfThreadContext)_localctx).ratio.getText():null)
										);
									
								}
								}
								break;
							case TAB:
								{
								{
								setState(518);
								match(TAB);
								setState(519);
								match(TAB);
								setState(520);
								match(TAB);
								setState(521);
								match(TAB);
								setState(522);
								match(TAB);
								setState(523);
								match(TAB);
								setState(524);
								match(TAB);
								setState(525);
								match(TAB);
								setState(526);
								match(TAB);
								setState(527);
								match(TAB);
								setState(528);
								match(NEWLINE);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(531); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(533);
					match(WORD);
					setState(534);
					match(TAB);
					setState(535);
					match(WORD);
					setState(536);
					match(TAB);
					setState(537);
					match(DATE);
					setState(538);
					match(NEWLINE);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(541); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(543);
			match(KEYWORD);
			setState(544);
			match(TAB);
			setState(545);
			match(WORD);
			setState(546);
			match(WORD);
			setState(547);
			match(WORD);
			setState(548);
			match(TAB);
			setState(549);
			match(WORD);
			setState(550);
			match(WORD);
			setState(551);
			match(WORD);
			setState(552);
			match(TAB);
			setState(553);
			match(WORD);
			setState(554);
			match(TAB);
			setState(555);
			match(WORD);
			setState(556);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtractItemDetailsEtfContext extends ParserRuleContext {
		public WordContext symbol;
		public WordContext symbol1;
		public WordContext symbol2;
		public WordContext symbol3;
		public WordContext symbol4;
		public WordContext symbol5;
		public WordContext symbol6;
		public WordContext symbol7;
		public Token code;
		public Token ckospi;
		public Token cwics;
		public Token currentPrice;
		public Token volumeOfListedShares;
		public List<TerminalNode> NEWLINE() { return getTokens(StockParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(StockParser.NEWLINE, i);
		}
		public List<TerminalNode> WORD() { return getTokens(StockParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(StockParser.WORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(StockParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(StockParser.TAB, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(StockParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(StockParser.NUMBER, i);
		}
		public ExtractItemDetailsEtfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extractItemDetailsEtf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterExtractItemDetailsEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitExtractItemDetailsEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitExtractItemDetailsEtf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtractItemDetailsEtfContext extractItemDetailsEtf() throws RecognitionException {
		ExtractItemDetailsEtfContext _localctx = new ExtractItemDetailsEtfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_extractItemDetailsEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			((ExtractItemDetailsEtfContext)_localctx).symbol = word();
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(559);
				((ExtractItemDetailsEtfContext)_localctx).symbol1 = word();
				}
				break;
			}
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(562);
				((ExtractItemDetailsEtfContext)_localctx).symbol2 = word();
				}
				break;
			}
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(565);
				((ExtractItemDetailsEtfContext)_localctx).symbol3 = word();
				}
				break;
			}
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(568);
				((ExtractItemDetailsEtfContext)_localctx).symbol4 = word();
				}
				break;
			}
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(571);
				((ExtractItemDetailsEtfContext)_localctx).symbol5 = word();
				}
				break;
			}
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(574);
				((ExtractItemDetailsEtfContext)_localctx).symbol6 = word();
				}
				break;
			}
			setState(580);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(577);
					((ExtractItemDetailsEtfContext)_localctx).symbol7 = word();
					}
					} 
				}
				setState(582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(583);
			((ExtractItemDetailsEtfContext)_localctx).code = match(NUMBER);
			setState(584);
			match(NEWLINE);
			setState(585);
			match(WORD);
			setState(586);
			((ExtractItemDetailsEtfContext)_localctx).ckospi = match(WORD);
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(587);
				((ExtractItemDetailsEtfContext)_localctx).cwics = match(WORD);
				}
			}

			setState(590);
			match(TAB);
			setState(591);
			match(NEWLINE);
			setState(592);
			match(WORD);
			setState(593);
			match(TAB);
			setState(594);
			((ExtractItemDetailsEtfContext)_localctx).currentPrice = match(WORD);
			setState(595);
			match(WORD);
			setState(596);
			match(WORD);
			setState(597);
			match(WORD);
			setState(598);
			match(WORD);
			setState(599);
			match(TAB);
			setState(600);
			match(NEWLINE);
			setState(601);
			match(WORD);
			setState(602);
			match(TAB);
			setState(603);
			((ExtractItemDetailsEtfContext)_localctx).volumeOfListedShares = match(NUMBER);
			setState(604);
			match(TAB);
			setState(605);
			match(NEWLINE);

				StockParserService.naverStockDetail(20231127
					, (((ExtractItemDetailsEtfContext)_localctx).code!=null?((ExtractItemDetailsEtfContext)_localctx).code.getText():null)
					, (((ExtractItemDetailsEtfContext)_localctx).symbol!=null?_input.getText(((ExtractItemDetailsEtfContext)_localctx).symbol.start,((ExtractItemDetailsEtfContext)_localctx).symbol.stop):null), (((ExtractItemDetailsEtfContext)_localctx).symbol1!=null?_input.getText(((ExtractItemDetailsEtfContext)_localctx).symbol1.start,((ExtractItemDetailsEtfContext)_localctx).symbol1.stop):null), (((ExtractItemDetailsEtfContext)_localctx).symbol2!=null?_input.getText(((ExtractItemDetailsEtfContext)_localctx).symbol2.start,((ExtractItemDetailsEtfContext)_localctx).symbol2.stop):null), (((ExtractItemDetailsEtfContext)_localctx).symbol3!=null?_input.getText(((ExtractItemDetailsEtfContext)_localctx).symbol3.start,((ExtractItemDetailsEtfContext)_localctx).symbol3.stop):null), (((ExtractItemDetailsEtfContext)_localctx).symbol4!=null?_input.getText(((ExtractItemDetailsEtfContext)_localctx).symbol4.start,((ExtractItemDetailsEtfContext)_localctx).symbol4.stop):null), (((ExtractItemDetailsEtfContext)_localctx).symbol5!=null?_input.getText(((ExtractItemDetailsEtfContext)_localctx).symbol5.start,((ExtractItemDetailsEtfContext)_localctx).symbol5.stop):null), (((ExtractItemDetailsEtfContext)_localctx).symbol6!=null?_input.getText(((ExtractItemDetailsEtfContext)_localctx).symbol6.start,((ExtractItemDetailsEtfContext)_localctx).symbol6.stop):null), (((ExtractItemDetailsEtfContext)_localctx).symbol7!=null?_input.getText(((ExtractItemDetailsEtfContext)_localctx).symbol7.start,((ExtractItemDetailsEtfContext)_localctx).symbol7.stop):null)
					, null, null
					, (((ExtractItemDetailsEtfContext)_localctx).ckospi!=null?((ExtractItemDetailsEtfContext)_localctx).ckospi.getText():null), (((ExtractItemDetailsEtfContext)_localctx).cwics!=null?((ExtractItemDetailsEtfContext)_localctx).cwics.getText():null)
					, (((ExtractItemDetailsEtfContext)_localctx).currentPrice!=null?((ExtractItemDetailsEtfContext)_localctx).currentPrice.getText():null)
					, (((ExtractItemDetailsEtfContext)_localctx).volumeOfListedShares!=null?((ExtractItemDetailsEtfContext)_localctx).volumeOfListedShares.getText():null)
					, null
				);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtractlDividendHistoryContext extends ParserRuleContext {
		public Token code;
		public Token base;
		public Token pay;
		public WordContext symbol;
		public Token dividend;
		public List<TerminalNode> KEYWORD() { return getTokens(StockParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(StockParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(StockParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(StockParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(StockParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(StockParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(StockParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(StockParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(StockParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(StockParser.DATE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(StockParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(StockParser.NUMBER, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public ExtractlDividendHistoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extractlDividendHistory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterExtractlDividendHistory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitExtractlDividendHistory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitExtractlDividendHistory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtractlDividendHistoryContext extractlDividendHistory() throws RecognitionException {
		ExtractlDividendHistoryContext _localctx = new ExtractlDividendHistoryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_extractlDividendHistory);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(KEYWORD);
			setState(609);
			match(TAB);
			setState(610);
			match(WORD);
			setState(611);
			match(WORD);
			setState(612);
			match(WORD);
			setState(613);
			match(TAB);
			setState(614);
			match(WORD);
			setState(615);
			match(TAB);
			setState(616);
			match(WORD);
			setState(617);
			match(NEWLINE);
			setState(752); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(618);
					match(KEYWORD);
					setState(619);
					match(TAB);
					setState(620);
					((ExtractlDividendHistoryContext)_localctx).code = match(NUMBER);
					setState(621);
					match(TAB);
					setState(623); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(622);
						word();
						}
						}
						setState(625); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
					setState(627);
					match(NEWLINE);
					setState(628);
					match(WORD);
					setState(629);
					match(TAB);
					setState(630);
					match(WORD);
					setState(631);
					match(NEWLINE);
					setState(632);
					match(WORD);
					setState(633);
					match(TAB);
					setState(634);
					match(WORD);
					setState(635);
					match(NEWLINE);
					setState(636);
					match(WORD);
					setState(637);
					match(TAB);
					setState(638);
					match(WORD);
					setState(639);
					match(TAB);
					setState(640);
					match(WORD);
					setState(641);
					match(TAB);
					setState(642);
					match(WORD);
					setState(643);
					match(TAB);
					setState(644);
					match(WORD);
					setState(645);
					match(TAB);
					setState(646);
					match(WORD);
					setState(647);
					match(TAB);
					setState(648);
					match(WORD);
					setState(649);
					match(TAB);
					setState(650);
					match(WORD);
					setState(651);
					match(TAB);
					setState(652);
					match(WORD);
					setState(653);
					match(TAB);
					setState(654);
					match(WORD);
					setState(655);
					match(TAB);
					setState(656);
					match(WORD);
					setState(657);
					match(TAB);
					setState(658);
					match(WORD);
					setState(659);
					match(TAB);
					setState(660);
					match(NEWLINE);
					setState(661);
					match(WORD);
					setState(662);
					match(TAB);
					setState(663);
					match(WORD);
					setState(664);
					match(TAB);
					setState(665);
					match(WORD);
					setState(666);
					match(TAB);
					setState(667);
					match(WORD);
					setState(668);
					match(TAB);
					setState(669);
					match(WORD);
					setState(670);
					match(TAB);
					setState(671);
					match(WORD);
					setState(672);
					match(TAB);
					setState(673);
					match(NEWLINE);
					setState(741); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						setState(741);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case TAB:
							{
							{
							setState(674);
							match(TAB);
							setState(675);
							match(TAB);
							setState(676);
							match(TAB);
							setState(677);
							match(TAB);
							setState(678);
							match(TAB);
							setState(679);
							match(TAB);
							setState(680);
							match(TAB);
							setState(681);
							match(TAB);
							setState(682);
							match(TAB);
							setState(683);
							match(TAB);
							setState(684);
							match(TAB);
							setState(685);
							match(TAB);
							setState(686);
							match(TAB);
							setState(687);
							match(TAB);
							setState(688);
							match(TAB);
							setState(689);
							match(TAB);
							setState(690);
							match(TAB);
							setState(691);
							match(NEWLINE);
							}
							}
							break;
						case DATE:
							{
							{
							setState(692);
							((ExtractlDividendHistoryContext)_localctx).base = match(DATE);
							setState(693);
							match(TAB);
							setState(695);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==DATE) {
								{
								setState(694);
								((ExtractlDividendHistoryContext)_localctx).pay = match(DATE);
								}
							}

							setState(697);
							match(TAB);
							setState(699);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==DATE) {
								{
								setState(698);
								match(DATE);
								}
							}

							setState(701);
							match(TAB);
							setState(702);
							match(NUMBER);
							setState(703);
							match(TAB);
							setState(705); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(704);
								((ExtractlDividendHistoryContext)_localctx).symbol = word();
								}
								}
								setState(707); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
							setState(709);
							match(TAB);
							setState(710);
							match(WORD);
							setState(711);
							match(TAB);
							setState(712);
							match(WORD);
							setState(713);
							match(TAB);
							setState(714);
							match(WORD);
							setState(715);
							match(TAB);
							setState(716);
							match(WORD);
							setState(717);
							match(TAB);
							setState(718);
							((ExtractlDividendHistoryContext)_localctx).dividend = match(NUMBER);
							setState(719);
							match(TAB);
							setState(721);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NUMBER) {
								{
								setState(720);
								match(NUMBER);
								}
							}

							setState(723);
							match(TAB);
							setState(724);
							match(NUMBER);
							setState(725);
							match(TAB);
							setState(726);
							match(NUMBER);
							setState(727);
							match(TAB);
							setState(729);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NUMBER) {
								{
								setState(728);
								match(NUMBER);
								}
							}

							setState(731);
							match(TAB);
							setState(732);
							match(TAB);
							setState(733);
							match(NUMBER);
							setState(734);
							match(TAB);
							setState(735);
							match(NUMBER);
							setState(736);
							match(TAB);
							setState(737);
							match(NEWLINE);
							}

										StockParserService.seibroDividendItem(20231127
											, (((ExtractlDividendHistoryContext)_localctx).base!=null?((ExtractlDividendHistoryContext)_localctx).base.getText():null) , (((ExtractlDividendHistoryContext)_localctx).pay!=null?((ExtractlDividendHistoryContext)_localctx).pay.getText():null)
											, (((ExtractlDividendHistoryContext)_localctx).code!=null?((ExtractlDividendHistoryContext)_localctx).code.getText():null) , (((ExtractlDividendHistoryContext)_localctx).symbol!=null?_input.getText(((ExtractlDividendHistoryContext)_localctx).symbol.start,((ExtractlDividendHistoryContext)_localctx).symbol.stop):null)
											, (((ExtractlDividendHistoryContext)_localctx).dividend!=null?((ExtractlDividendHistoryContext)_localctx).dividend.getText():null)
										);
									
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(743); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TAB || _la==DATE );
					setState(745);
					match(WORD);
					setState(746);
					match(TAB);
					setState(747);
					match(WORD);
					setState(748);
					match(TAB);
					setState(749);
					match(DATE);
					setState(750);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(754); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(756);
			match(KEYWORD);
			setState(757);
			match(TAB);
			setState(758);
			match(WORD);
			setState(759);
			match(WORD);
			setState(760);
			match(WORD);
			setState(761);
			match(TAB);
			setState(762);
			match(WORD);
			setState(763);
			match(TAB);
			setState(764);
			match(WORD);
			setState(765);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtractTextStockPriceContext extends ParserRuleContext {
		public Token code;
		public Token DATE;
		public Token closing;
		public Token market;
		public Token high;
		public Token low;
		public Token volume;
		public List<TerminalNode> KEYWORD() { return getTokens(StockParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(StockParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(StockParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(StockParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(StockParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(StockParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(StockParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(StockParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(StockParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(StockParser.DATE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(StockParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(StockParser.NUMBER, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public ExtractTextStockPriceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extractTextStockPrice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterExtractTextStockPrice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitExtractTextStockPrice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitExtractTextStockPrice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtractTextStockPriceContext extractTextStockPrice() throws RecognitionException {
		ExtractTextStockPriceContext _localctx = new ExtractTextStockPriceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_extractTextStockPrice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(KEYWORD);
			setState(768);
			match(TAB);
			setState(769);
			match(WORD);
			setState(770);
			match(WORD);
			setState(771);
			match(WORD);
			setState(772);
			match(TAB);
			setState(773);
			match(WORD);
			setState(774);
			match(TAB);
			setState(775);
			match(WORD);
			setState(776);
			match(NEWLINE);
			setState(830); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(777);
				((ExtractTextStockPriceContext)_localctx).code = match(NUMBER);
				setState(778);
				match(TAB);
				setState(780); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(779);
					word();
					}
					}
					setState(782); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(784);
				match(NEWLINE);
				setState(785);
				match(WORD);
				setState(786);
				match(TAB);
				setState(787);
				match(WORD);
				setState(788);
				match(TAB);
				setState(789);
				match(WORD);
				setState(790);
				match(TAB);
				setState(791);
				match(WORD);
				setState(792);
				match(TAB);
				setState(793);
				match(WORD);
				setState(794);
				match(TAB);
				setState(795);
				match(WORD);
				setState(796);
				match(TAB);
				setState(797);
				match(WORD);
				setState(798);
				match(TAB);
				setState(799);
				match(NEWLINE);
				setState(819); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(819);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAB:
						{
						{
						setState(800);
						match(TAB);
						setState(801);
						match(NEWLINE);
						}
						}
						break;
					case DATE:
						{
						{
						setState(802);
						((ExtractTextStockPriceContext)_localctx).DATE = match(DATE);
						setState(803);
						match(TAB);
						setState(804);
						((ExtractTextStockPriceContext)_localctx).closing = match(NUMBER);
						setState(805);
						match(TAB);
						setState(806);
						match(NUMBER);
						setState(807);
						match(TAB);
						setState(808);
						((ExtractTextStockPriceContext)_localctx).market = match(NUMBER);
						setState(809);
						match(TAB);
						setState(810);
						((ExtractTextStockPriceContext)_localctx).high = match(NUMBER);
						setState(811);
						match(TAB);
						setState(812);
						((ExtractTextStockPriceContext)_localctx).low = match(NUMBER);
						setState(813);
						match(TAB);
						setState(814);
						((ExtractTextStockPriceContext)_localctx).volume = match(NUMBER);
						setState(815);
						match(TAB);
						setState(816);
						match(NEWLINE);
						}

									StockParserService.extractTextStockPrice(20231127
										, (((ExtractTextStockPriceContext)_localctx).code!=null?((ExtractTextStockPriceContext)_localctx).code.getText():null)
										, (((ExtractTextStockPriceContext)_localctx).DATE!=null?((ExtractTextStockPriceContext)_localctx).DATE.getText():null)
										, (((ExtractTextStockPriceContext)_localctx).closing!=null?((ExtractTextStockPriceContext)_localctx).closing.getText():null)
										, (((ExtractTextStockPriceContext)_localctx).market!=null?((ExtractTextStockPriceContext)_localctx).market.getText():null)
										, (((ExtractTextStockPriceContext)_localctx).high!=null?((ExtractTextStockPriceContext)_localctx).high.getText():null)
										, (((ExtractTextStockPriceContext)_localctx).low!=null?((ExtractTextStockPriceContext)_localctx).low.getText():null)
										, (((ExtractTextStockPriceContext)_localctx).volume!=null?((ExtractTextStockPriceContext)_localctx).volume.getText():null)
									);
								
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(821); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TAB || _la==DATE );
				setState(823);
				match(WORD);
				setState(824);
				match(TAB);
				setState(825);
				match(WORD);
				setState(826);
				match(TAB);
				setState(827);
				((ExtractTextStockPriceContext)_localctx).DATE = match(DATE);
				setState(828);
				match(NEWLINE);
				}
				}
				setState(832); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(834);
			match(KEYWORD);
			setState(835);
			match(TAB);
			setState(836);
			match(WORD);
			setState(837);
			match(WORD);
			setState(838);
			match(WORD);
			setState(839);
			match(TAB);
			setState(840);
			match(WORD);
			setState(841);
			match(TAB);
			setState(842);
			match(WORD);
			setState(843);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeibroDividendContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(StockParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(StockParser.WORD, i);
		}
		public TerminalNode NEWLINE() { return getToken(StockParser.NEWLINE, 0); }
		public EofContext eof() {
			return getRuleContext(EofContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<SeibroDividendItemContext> seibroDividendItem() {
			return getRuleContexts(SeibroDividendItemContext.class);
		}
		public SeibroDividendItemContext seibroDividendItem(int i) {
			return getRuleContext(SeibroDividendItemContext.class,i);
		}
		public SeibroDividendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seibroDividend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterSeibroDividend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitSeibroDividend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitSeibroDividend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeibroDividendContext seibroDividend() throws RecognitionException {
		SeibroDividendContext _localctx = new SeibroDividendContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_seibroDividend);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(846); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(845);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(848); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(850);
			match(WORD);
			setState(851);
			match(WORD);
			setState(852);
			match(WORD);
			setState(853);
			match(WORD);
			setState(854);
			match(WORD);
			setState(855);
			match(WORD);
			setState(856);
			match(NEWLINE);
			setState(858); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(857);
					seibroDividendItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(860); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(862);
			eof();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeibroDividendItemContext extends ParserRuleContext {
		public Token base;
		public Token pay;
		public WordContext code;
		public WordContext symbol;
		public Token dividend;
		public List<TerminalNode> NEWLINE() { return getTokens(StockParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(StockParser.NEWLINE, i);
		}
		public List<TerminalNode> WORD() { return getTokens(StockParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(StockParser.WORD, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(StockParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(StockParser.NUMBER, i);
		}
		public List<TerminalNode> DATE() { return getTokens(StockParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(StockParser.DATE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public SeibroDividendItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seibroDividendItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterSeibroDividendItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitSeibroDividendItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitSeibroDividendItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeibroDividendItemContext seibroDividendItem() throws RecognitionException {
		SeibroDividendItemContext _localctx = new SeibroDividendItemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_seibroDividendItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			((SeibroDividendItemContext)_localctx).base = match(DATE);
			setState(865);
			match(NEWLINE);
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(866);
				((SeibroDividendItemContext)_localctx).pay = match(DATE);
				setState(867);
				match(NEWLINE);
				}
				break;
			}
			setState(870);
			((SeibroDividendItemContext)_localctx).code = word();
			setState(871);
			match(NEWLINE);
			setState(872);
			((SeibroDividendItemContext)_localctx).symbol = word();
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(873);
				word();
				}
				}
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(879);
			match(NEWLINE);
			setState(880);
			match(WORD);
			setState(881);
			match(NEWLINE);
			setState(882);
			match(WORD);
			setState(883);
			match(NEWLINE);
			setState(884);
			match(WORD);
			setState(885);
			match(NEWLINE);
			setState(886);
			match(WORD);
			setState(887);
			match(NEWLINE);
			setState(888);
			((SeibroDividendItemContext)_localctx).dividend = match(NUMBER);
			setState(889);
			match(NEWLINE);
			setState(890);
			match(NUMBER);
			setState(891);
			match(NEWLINE);
			setState(892);
			match(NUMBER);
			setState(893);
			match(NEWLINE);
			setState(894);
			match(NUMBER);
			setState(895);
			match(NEWLINE);
			setState(896);
			match(NUMBER);
			setState(897);
			match(NEWLINE);

				StockParserService.seibroDividendItem(20231127
					, (((SeibroDividendItemContext)_localctx).base!=null?((SeibroDividendItemContext)_localctx).base.getText():null) , (((SeibroDividendItemContext)_localctx).pay!=null?((SeibroDividendItemContext)_localctx).pay.getText():null)
					, (((SeibroDividendItemContext)_localctx).code!=null?_input.getText(((SeibroDividendItemContext)_localctx).code.start,((SeibroDividendItemContext)_localctx).code.stop):null) , (((SeibroDividendItemContext)_localctx).symbol!=null?_input.getText(((SeibroDividendItemContext)_localctx).symbol.start,((SeibroDividendItemContext)_localctx).symbol.stop):null)
					, (((SeibroDividendItemContext)_localctx).dividend!=null?((SeibroDividendItemContext)_localctx).dividend.getText():null)
				);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WordContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(StockParser.WORD, 0); }
		public TerminalNode KEYWORD() { return getToken(StockParser.KEYWORD, 0); }
		public TerminalNode NUMBER() { return getToken(StockParser.NUMBER, 0); }
		public TerminalNode TIME() { return getToken(StockParser.TIME, 0); }
		public TerminalNode DATE() { return getToken(StockParser.DATE, 0); }
		public TerminalNode STRING() { return getToken(StockParser.STRING, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(StockParser.NEWLINE, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> TAB() { return getTokens(StockParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(StockParser.TAB, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(904);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(902);
					word();
					}
					break;
				case TAB:
					{
					setState(903);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(906); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(908);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EofContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> TAB() { return getTokens(StockParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(StockParser.TAB, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(StockParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(StockParser.NEWLINE, i);
		}
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitEof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitEof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_eof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(913);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(910);
					word();
					}
					break;
				case TAB:
					{
					setState(911);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(912);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(915); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << NEWLINE) | (1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\n\u0396\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000%\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"8\b\u0001\u0001\u0001\u0003\u0001;\b\u0001\u0001\u0001\u0003\u0001>\b"+
		"\u0001\u0001\u0001\u0003\u0001A\b\u0001\u0001\u0001\u0003\u0001D\b\u0001"+
		"\u0001\u0001\u0003\u0001G\b\u0001\u0001\u0001\u0005\u0001J\b\u0001\n\u0001"+
		"\f\u0001M\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001S\b\u0001\u0001\u0001\u0003\u0001V\b\u0001\u0001\u0001\u0003\u0001"+
		"Y\b\u0001\u0001\u0001\u0003\u0001\\\b\u0001\u0001\u0001\u0003\u0001_\b"+
		"\u0001\u0001\u0001\u0003\u0001b\b\u0001\u0001\u0001\u0003\u0001e\b\u0001"+
		"\u0001\u0001\u0005\u0001h\b\u0001\n\u0001\f\u0001k\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001q\b\u0001\u0001\u0001"+
		"\u0003\u0001t\b\u0001\u0001\u0001\u0003\u0001w\b\u0001\u0001\u0001\u0003"+
		"\u0001z\b\u0001\u0001\u0001\u0003\u0001}\b\u0001\u0001\u0001\u0003\u0001"+
		"\u0080\b\u0001\u0001\u0001\u0003\u0001\u0083\b\u0001\u0001\u0001\u0005"+
		"\u0001\u0086\b\u0001\n\u0001\f\u0001\u0089\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u009d\b\u0001"+
		"\u000b\u0001\f\u0001\u009e\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00d8\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0004\u0002\u00dc\b\u0002\u000b\u0002\f\u0002\u00dd\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004"+
		"\u0002\u00f2\b\u0002\u000b\u0002\f\u0002\u00f3\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002"+
		"\u00fd\b\u0002\u000b\u0002\f\u0002\u00fe\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u011c\b\u0003\n\u0003\f\u0003\u011f\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u0124\b\u0003\u0001\u0003\u0003\u0003"+
		"\u0127\b\u0003\u0001\u0003\u0003\u0003\u012a\b\u0003\u0001\u0003\u0003"+
		"\u0003\u012d\b\u0003\u0001\u0003\u0003\u0003\u0130\b\u0003\u0001\u0003"+
		"\u0003\u0003\u0133\b\u0003\u0001\u0003\u0005\u0003\u0136\b\u0003\n\u0003"+
		"\f\u0003\u0139\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u013e\b\u0003\u0001\u0003\u0003\u0003\u0141\b\u0003\u0001\u0003\u0003"+
		"\u0003\u0144\b\u0003\u0001\u0003\u0003\u0003\u0147\b\u0003\u0001\u0003"+
		"\u0003\u0003\u014a\b\u0003\u0001\u0003\u0003\u0003\u014d\b\u0003\u0001"+
		"\u0003\u0005\u0003\u0150\b\u0003\n\u0003\f\u0003\u0153\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u0158\b\u0003\n\u0003\f\u0003\u015b"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004"+
		"\u0003\u0168\b\u0003\u000b\u0003\f\u0003\u0169\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u017c\b\u0004\u0001\u0004\u0003\u0004"+
		"\u017f\b\u0004\u0001\u0004\u0003\u0004\u0182\b\u0004\u0001\u0004\u0003"+
		"\u0004\u0185\b\u0004\u0001\u0004\u0003\u0004\u0188\b\u0004\u0001\u0004"+
		"\u0003\u0004\u018b\b\u0004\u0001\u0004\u0005\u0004\u018e\b\u0004\n\u0004"+
		"\f\u0004\u0191\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004"+
		"\u0196\b\u0004\u000b\u0004\f\u0004\u0197\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u01c9\b\u0005\u0001\u0005\u0003"+
		"\u0005\u01cc\b\u0005\u0001\u0005\u0003\u0005\u01cf\b\u0005\u0001\u0005"+
		"\u0003\u0005\u01d2\b\u0005\u0001\u0005\u0003\u0005\u01d5\b\u0005\u0001"+
		"\u0005\u0003\u0005\u01d8\b\u0005\u0001\u0005\u0005\u0005\u01db\b\u0005"+
		"\n\u0005\f\u0005\u01de\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u01e5\b\u0005\n\u0005\f\u0005\u01e8\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u01ec\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u01f0\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u01f4\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u01f8\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u01fc\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0200"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u0212"+
		"\b\u0005\u000b\u0005\f\u0005\u0213\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u021c\b\u0005\u000b\u0005"+
		"\f\u0005\u021d\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0231\b\u0006\u0001\u0006\u0003\u0006\u0234\b\u0006\u0001"+
		"\u0006\u0003\u0006\u0237\b\u0006\u0001\u0006\u0003\u0006\u023a\b\u0006"+
		"\u0001\u0006\u0003\u0006\u023d\b\u0006\u0001\u0006\u0003\u0006\u0240\b"+
		"\u0006\u0001\u0006\u0005\u0006\u0243\b\u0006\n\u0006\f\u0006\u0246\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u024d\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u0270\b\u0007"+
		"\u000b\u0007\f\u0007\u0271\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02b8\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u02bc\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007\u02c2\b\u0007\u000b\u0007\f\u0007"+
		"\u02c3\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u02d2\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02da\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u02e6\b\u0007\u000b\u0007\f"+
		"\u0007\u02e7\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007\u02f1\b\u0007\u000b\u0007\f\u0007"+
		"\u02f2\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0004\b\u030d\b\b\u000b\b\f\b\u030e\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u0334"+
		"\b\b\u000b\b\f\b\u0335\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0004\b\u033f\b\b\u000b\b\f\b\u0340\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0004"+
		"\t\u034f\b\t\u000b\t\f\t\u0350\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0004\t\u035b\b\t\u000b\t\f\t\u035c\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0365\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u036b\b\n\n\n\f\n\u036e\t\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0004\f\u0389\b\f\u000b\f\f"+
		"\f\u038a\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0004\r\u0392\b\r\u000b"+
		"\r\f\r\u0393\u0001\r\u0000\u0000\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0001\u0001\u0000\u0005\n\u03f2"+
		"\u0000$\u0001\u0000\u0000\u0000\u0002&\u0001\u0000\u0000\u0000\u0004\u00ac"+
		"\u0001\u0000\u0000\u0000\u0006\u010d\u0001\u0000\u0000\u0000\b\u0195\u0001"+
		"\u0000\u0000\u0000\n\u01a0\u0001\u0000\u0000\u0000\f\u022e\u0001\u0000"+
		"\u0000\u0000\u000e\u0260\u0001\u0000\u0000\u0000\u0010\u02ff\u0001\u0000"+
		"\u0000\u0000\u0012\u034e\u0001\u0000\u0000\u0000\u0014\u0360\u0001\u0000"+
		"\u0000\u0000\u0016\u0384\u0001\u0000\u0000\u0000\u0018\u0388\u0001\u0000"+
		"\u0000\u0000\u001a\u0391\u0001\u0000\u0000\u0000\u001c%\u0003\u0010\b"+
		"\u0000\u001d%\u0003\u000e\u0007\u0000\u001e%\u0003\u0012\t\u0000\u001f"+
		"%\u0003\n\u0005\u0000 %\u0003\b\u0004\u0000!%\u0003\u0006\u0003\u0000"+
		"\"%\u0003\u0004\u0002\u0000#%\u0003\u0002\u0001\u0000$\u001c\u0001\u0000"+
		"\u0000\u0000$\u001d\u0001\u0000\u0000\u0000$\u001e\u0001\u0000\u0000\u0000"+
		"$\u001f\u0001\u0000\u0000\u0000$ \u0001\u0000\u0000\u0000$!\u0001\u0000"+
		"\u0000\u0000$\"\u0001\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%\u0001"+
		"\u0001\u0000\u0000\u0000&\'\u0005\u0005\u0000\u0000\'(\u0005\u0003\u0000"+
		"\u0000()\u0005\n\u0000\u0000)*\u0005\n\u0000\u0000*+\u0005\u0003\u0000"+
		"\u0000+,\u0005\n\u0000\u0000,-\u0005\u0003\u0000\u0000-.\u0005\n\u0000"+
		"\u0000./\u0005\u0003\u0000\u0000/0\u0005\n\u0000\u00000\u009c\u0005\u0004"+
		"\u0000\u000012\u0005\u0005\u0000\u000023\u0005\u0003\u0000\u000034\u0005"+
		"\b\u0000\u000045\u0005\u0003\u0000\u000057\u0003\u0016\u000b\u000068\u0003"+
		"\u0016\u000b\u000076\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"8:\u0001\u0000\u0000\u00009;\u0003\u0016\u000b\u0000:9\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000<>\u0003\u0016"+
		"\u000b\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001"+
		"\u0000\u0000\u0000?A\u0003\u0016\u000b\u0000@?\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000BD\u0003\u0016\u000b"+
		"\u0000CB\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DF\u0001\u0000"+
		"\u0000\u0000EG\u0003\u0016\u000b\u0000FE\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GK\u0001\u0000\u0000\u0000HJ\u0003\u0016\u000b\u0000"+
		"IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000NO\u0005\u0004\u0000\u0000OP\u0005\u0005\u0000\u0000PR\u0005"+
		"\u0003\u0000\u0000QS\u0003\u0016\u000b\u0000RQ\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000TV\u0003\u0016\u000b"+
		"\u0000UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000"+
		"\u0000\u0000WY\u0003\u0016\u000b\u0000XW\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000Z\\\u0003\u0016\u000b\u0000"+
		"[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000"+
		"\u0000]_\u0003\u0016\u000b\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_a\u0001\u0000\u0000\u0000`b\u0003\u0016\u000b\u0000a`\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000"+
		"ce\u0003\u0016\u000b\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000ei\u0001\u0000\u0000\u0000fh\u0003\u0016\u000b\u0000gf\u0001\u0000"+
		"\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"lm\u0005\u0004\u0000\u0000mn\u0005\u0005\u0000\u0000np\u0005\u0003\u0000"+
		"\u0000oq\u0003\u0016\u000b\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qs\u0001\u0000\u0000\u0000rt\u0003\u0016\u000b\u0000sr\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000"+
		"uw\u0003\u0016\u000b\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000wy\u0001\u0000\u0000\u0000xz\u0003\u0016\u000b\u0000yx\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{}\u0003"+
		"\u0016\u000b\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}\u007f\u0001\u0000\u0000\u0000~\u0080\u0003\u0016\u000b\u0000\u007f~"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082"+
		"\u0001\u0000\u0000\u0000\u0081\u0083\u0003\u0016\u000b\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0087"+
		"\u0001\u0000\u0000\u0000\u0084\u0086\u0003\u0016\u000b\u0000\u0085\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0005\u0004\u0000\u0000\u008b\u008c\u0005\u0005\u0000\u0000\u008c\u008d"+
		"\u0005\u0003\u0000\u0000\u008d\u008e\u0005\b\u0000\u0000\u008e\u008f\u0005"+
		"\n\u0000\u0000\u008f\u0090\u0005\u0004\u0000\u0000\u0090\u0091\u0005\u0005"+
		"\u0000\u0000\u0091\u0092\u0005\u0003\u0000\u0000\u0092\u0093\u0005\u0006"+
		"\u0000\u0000\u0093\u0094\u0005\u0004\u0000\u0000\u0094\u0095\u0005\n\u0000"+
		"\u0000\u0095\u0096\u0005\u0003\u0000\u0000\u0096\u0097\u0005\n\u0000\u0000"+
		"\u0097\u0098\u0005\u0003\u0000\u0000\u0098\u0099\u0005\u0006\u0000\u0000"+
		"\u0099\u009a\u0005\u0004\u0000\u0000\u009a\u009b\u0006\u0001\uffff\uffff"+
		"\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c1\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0005\u0005\u0000\u0000\u00a1\u00a2\u0005\u0003\u0000\u0000"+
		"\u00a2\u00a3\u0005\n\u0000\u0000\u00a3\u00a4\u0005\n\u0000\u0000\u00a4"+
		"\u00a5\u0005\u0003\u0000\u0000\u00a5\u00a6\u0005\n\u0000\u0000\u00a6\u00a7"+
		"\u0005\u0003\u0000\u0000\u00a7\u00a8\u0005\n\u0000\u0000\u00a8\u00a9\u0005"+
		"\u0003\u0000\u0000\u00a9\u00aa\u0005\n\u0000\u0000\u00aa\u00ab\u0005\u0004"+
		"\u0000\u0000\u00ab\u0003\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0005"+
		"\u0000\u0000\u00ad\u00ae\u0005\u0003\u0000\u0000\u00ae\u00af\u0005\n\u0000"+
		"\u0000\u00af\u00b0\u0005\u0003\u0000\u0000\u00b0\u00b1\u0005\n\u0000\u0000"+
		"\u00b1\u00b2\u0005\n\u0000\u0000\u00b2\u00b3\u0005\n\u0000\u0000\u00b3"+
		"\u00b4\u0005\u0003\u0000\u0000\u00b4\u00b5\u0005\n\u0000\u0000\u00b5\u00b6"+
		"\u0005\u0003\u0000\u0000\u00b6\u00b7\u0005\n\u0000\u0000\u00b7\u00fc\u0005"+
		"\u0004\u0000\u0000\u00b8\u00b9\u0005\n\u0000\u0000\u00b9\u00ba\u0005\u0003"+
		"\u0000\u0000\u00ba\u00bb\u0005\u0004\u0000\u0000\u00bb\u00bc\u0005\n\u0000"+
		"\u0000\u00bc\u00bd\u0005\u0003\u0000\u0000\u00bd\u00be\u0005\n\u0000\u0000"+
		"\u00be\u00bf\u0005\u0003\u0000\u0000\u00bf\u00c0\u0005\n\u0000\u0000\u00c0"+
		"\u00c1\u0005\u0003\u0000\u0000\u00c1\u00c2\u0005\n\u0000\u0000\u00c2\u00c3"+
		"\u0005\u0003\u0000\u0000\u00c3\u00c4\u0005\n\u0000\u0000\u00c4\u00c5\u0005"+
		"\u0003\u0000\u0000\u00c5\u00c6\u0005\n\u0000\u0000\u00c6\u00c7\u0005\u0003"+
		"\u0000\u0000\u00c7\u00c8\u0005\n\u0000\u0000\u00c8\u00c9\u0005\u0003\u0000"+
		"\u0000\u00c9\u00ca\u0005\n\u0000\u0000\u00ca\u00cb\u0005\u0003\u0000\u0000"+
		"\u00cb\u00cc\u0005\n\u0000\u0000\u00cc\u00cd\u0005\u0003\u0000\u0000\u00cd"+
		"\u00ce\u0005\n\u0000\u0000\u00ce\u00cf\u0005\u0003\u0000\u0000\u00cf\u00d0"+
		"\u0005\n\u0000\u0000\u00d0\u00d1\u0005\u0003\u0000\u0000\u00d1\u00f1\u0005"+
		"\u0004\u0000\u0000\u00d2\u00d3\u0005\n\u0000\u0000\u00d3\u00d4\u0005\u0003"+
		"\u0000\u0000\u00d4\u00d5\u0005\b\u0000\u0000\u00d5\u00d7\u0005\u0003\u0000"+
		"\u0000\u00d6\u00d8\u0005\b\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d9\u00db\u0005\u0003\u0000\u0000\u00da\u00dc\u0003\u0016\u000b\u0000"+
		"\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000"+
		"\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0003\u0000\u0000"+
		"\u00e0\u00e1\u0005\n\u0000\u0000\u00e1\u00e2\u0005\u0003\u0000\u0000\u00e2"+
		"\u00e3\u0005\n\u0000\u0000\u00e3\u00e4\u0005\u0003\u0000\u0000\u00e4\u00e5"+
		"\u0005\b\u0000\u0000\u00e5\u00e6\u0005\u0003\u0000\u0000\u00e6\u00e7\u0005"+
		"\b\u0000\u0000\u00e7\u00e8\u0005\u0003\u0000\u0000\u00e8\u00e9\u0005\b"+
		"\u0000\u0000\u00e9\u00ea\u0005\u0003\u0000\u0000\u00ea\u00eb\u0005\b\u0000"+
		"\u0000\u00eb\u00ec\u0005\u0003\u0000\u0000\u00ec\u00ed\u0005\b\u0000\u0000"+
		"\u00ed\u00ee\u0005\u0003\u0000\u0000\u00ee\u00ef\u0005\u0004\u0000\u0000"+
		"\u00ef\u00f0\u0006\u0002\uffff\uffff\u0000\u00f0\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f1\u00d2\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\n\u0000\u0000"+
		"\u00f6\u00f7\u0005\u0003\u0000\u0000\u00f7\u00f8\u0005\n\u0000\u0000\u00f8"+
		"\u00f9\u0005\u0003\u0000\u0000\u00f9\u00fa\u0005\u0006\u0000\u0000\u00fa"+
		"\u00fb\u0005\u0004\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc"+
		"\u00b8\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff"+
		"\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u0005\u0000\u0000\u0101"+
		"\u0102\u0005\u0003\u0000\u0000\u0102\u0103\u0005\n\u0000\u0000\u0103\u0104"+
		"\u0005\u0003\u0000\u0000\u0104\u0105\u0005\n\u0000\u0000\u0105\u0106\u0005"+
		"\n\u0000\u0000\u0106\u0107\u0005\n\u0000\u0000\u0107\u0108\u0005\u0003"+
		"\u0000\u0000\u0108\u0109\u0005\n\u0000\u0000\u0109\u010a\u0005\u0003\u0000"+
		"\u0000\u010a\u010b\u0005\n\u0000\u0000\u010b\u010c\u0005\u0004\u0000\u0000"+
		"\u010c\u0005\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u0005\u0000\u0000"+
		"\u010e\u010f\u0005\u0003\u0000\u0000\u010f\u0110\u0005\n\u0000\u0000\u0110"+
		"\u0111\u0005\n\u0000\u0000\u0111\u0112\u0005\u0003\u0000\u0000\u0112\u0113"+
		"\u0005\n\u0000\u0000\u0113\u0114\u0005\u0003\u0000\u0000\u0114\u0115\u0005"+
		"\n\u0000\u0000\u0115\u0167\u0005\u0004\u0000\u0000\u0116\u0117\u0005\u0005"+
		"\u0000\u0000\u0117\u0118\u0005\u0003\u0000\u0000\u0118\u0119\u0005\b\u0000"+
		"\u0000\u0119\u011d\u0005\u0003\u0000\u0000\u011a\u011c\u0003\u0016\u000b"+
		"\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c\u011f\u0001\u0000\u0000"+
		"\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000"+
		"\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0005\u0004\u0000\u0000\u0121\u0123\u0003\u0016\u000b"+
		"\u0000\u0122\u0124\u0003\u0016\u000b\u0000\u0123\u0122\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0126\u0001\u0000\u0000"+
		"\u0000\u0125\u0127\u0003\u0016\u000b\u0000\u0126\u0125\u0001\u0000\u0000"+
		"\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0129\u0001\u0000\u0000"+
		"\u0000\u0128\u012a\u0003\u0016\u000b\u0000\u0129\u0128\u0001\u0000\u0000"+
		"\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012c\u0001\u0000\u0000"+
		"\u0000\u012b\u012d\u0003\u0016\u000b\u0000\u012c\u012b\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012f\u0001\u0000\u0000"+
		"\u0000\u012e\u0130\u0003\u0016\u000b\u0000\u012f\u012e\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0132\u0001\u0000\u0000"+
		"\u0000\u0131\u0133\u0003\u0016\u000b\u0000\u0132\u0131\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0137\u0001\u0000\u0000"+
		"\u0000\u0134\u0136\u0003\u0016\u000b\u0000\u0135\u0134\u0001\u0000\u0000"+
		"\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u013a\u0001\u0000\u0000"+
		"\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u013b\u0005\u0004\u0000"+
		"\u0000\u013b\u013d\u0003\u0016\u000b\u0000\u013c\u013e\u0003\u0016\u000b"+
		"\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000"+
		"\u0000\u013e\u0140\u0001\u0000\u0000\u0000\u013f\u0141\u0003\u0016\u000b"+
		"\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000"+
		"\u0000\u0141\u0143\u0001\u0000\u0000\u0000\u0142\u0144\u0003\u0016\u000b"+
		"\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000"+
		"\u0000\u0144\u0146\u0001\u0000\u0000\u0000\u0145\u0147\u0003\u0016\u000b"+
		"\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000"+
		"\u0000\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u014a\u0003\u0016\u000b"+
		"\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000"+
		"\u0000\u014a\u014c\u0001\u0000\u0000\u0000\u014b\u014d\u0003\u0016\u000b"+
		"\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000"+
		"\u0000\u014d\u0151\u0001\u0000\u0000\u0000\u014e\u0150\u0003\u0016\u000b"+
		"\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000"+
		"\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000"+
		"\u0000\u0152\u0154\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000"+
		"\u0000\u0154\u0155\u0005\u0004\u0000\u0000\u0155\u0159\u0005\u0006\u0000"+
		"\u0000\u0156\u0158\u0005\n\u0000\u0000\u0157\u0156\u0001\u0000\u0000\u0000"+
		"\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000"+
		"\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015c\u0001\u0000\u0000\u0000"+
		"\u015b\u0159\u0001\u0000\u0000\u0000\u015c\u015d\u0005\u0004\u0000\u0000"+
		"\u015d\u015e\u0003\u0016\u000b\u0000\u015e\u015f\u0005\u0004\u0000\u0000"+
		"\u015f\u0160\u0005\n\u0000\u0000\u0160\u0161\u0005\u0003\u0000\u0000\u0161"+
		"\u0162\u0005\n\u0000\u0000\u0162\u0163\u0005\u0003\u0000\u0000\u0163\u0164"+
		"\u0005\u0006\u0000\u0000\u0164\u0165\u0005\u0004\u0000\u0000\u0165\u0166"+
		"\u0006\u0003\uffff\uffff\u0000\u0166\u0168\u0001\u0000\u0000\u0000\u0167"+
		"\u0116\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169"+
		"\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0005\u0005\u0000\u0000\u016c"+
		"\u016d\u0005\u0003\u0000\u0000\u016d\u016e\u0005\n\u0000\u0000\u016e\u016f"+
		"\u0005\n\u0000\u0000\u016f\u0170\u0005\u0003\u0000\u0000\u0170\u0171\u0005"+
		"\n\u0000\u0000\u0171\u0172\u0005\u0003\u0000\u0000\u0172\u0173\u0005\n"+
		"\u0000\u0000\u0173\u0174\u0005\u0004\u0000\u0000\u0174\u0007\u0001\u0000"+
		"\u0000\u0000\u0175\u0176\u0005\u0005\u0000\u0000\u0176\u0177\u0005\u0003"+
		"\u0000\u0000\u0177\u0178\u0005\n\u0000\u0000\u0178\u0179\u0005\u0003\u0000"+
		"\u0000\u0179\u017b\u0003\u0016\u000b\u0000\u017a\u017c\u0003\u0016\u000b"+
		"\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000"+
		"\u0000\u017c\u017e\u0001\u0000\u0000\u0000\u017d\u017f\u0003\u0016\u000b"+
		"\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000"+
		"\u0000\u017f\u0181\u0001\u0000\u0000\u0000\u0180\u0182\u0003\u0016\u000b"+
		"\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000"+
		"\u0000\u0182\u0184\u0001\u0000\u0000\u0000\u0183\u0185\u0003\u0016\u000b"+
		"\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000"+
		"\u0000\u0185\u0187\u0001\u0000\u0000\u0000\u0186\u0188\u0003\u0016\u000b"+
		"\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000"+
		"\u0000\u0188\u018a\u0001\u0000\u0000\u0000\u0189\u018b\u0003\u0016\u000b"+
		"\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000"+
		"\u0000\u018b\u018f\u0001\u0000\u0000\u0000\u018c\u018e\u0003\u0016\u000b"+
		"\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018e\u0191\u0001\u0000\u0000"+
		"\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000"+
		"\u0000\u0190\u0192\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000"+
		"\u0000\u0192\u0193\u0005\u0004\u0000\u0000\u0193\u0194\u0006\u0004\uffff"+
		"\uffff\u0000\u0194\u0196\u0001\u0000\u0000\u0000\u0195\u0175\u0001\u0000"+
		"\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000"+
		"\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000"+
		"\u0000\u0000\u0199\u019a\u0005\n\u0000\u0000\u019a\u019b\u0005\u0003\u0000"+
		"\u0000\u019b\u019c\u0005\n\u0000\u0000\u019c\u019d\u0005\u0003\u0000\u0000"+
		"\u019d\u019e\u0005\u0006\u0000\u0000\u019e\u019f\u0005\u0004\u0000\u0000"+
		"\u019f\t\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005\u0005\u0000\u0000\u01a1"+
		"\u01a2\u0005\u0003\u0000\u0000\u01a2\u01a3\u0005\n\u0000\u0000\u01a3\u01a4"+
		"\u0005\n\u0000\u0000\u01a4\u01a5\u0005\n\u0000\u0000\u01a5\u01a6\u0005"+
		"\u0003\u0000\u0000\u01a6\u01a7\u0005\n\u0000\u0000\u01a7\u01a8\u0005\n"+
		"\u0000\u0000\u01a8\u01a9\u0005\n\u0000\u0000\u01a9\u01aa\u0005\u0003\u0000"+
		"\u0000\u01aa\u01ab\u0005\n\u0000\u0000\u01ab\u01ac\u0005\u0003\u0000\u0000"+
		"\u01ac\u01ad\u0005\n\u0000\u0000\u01ad\u021b\u0005\u0004\u0000\u0000\u01ae"+
		"\u01af\u0005\u0005\u0000\u0000\u01af\u01b0\u0005\u0003\u0000\u0000\u01b0"+
		"\u01b1\u0005\b\u0000\u0000\u01b1\u01b2\u0005\u0004\u0000\u0000\u01b2\u01b3"+
		"\u0005\n\u0000\u0000\u01b3\u01b4\u0005\u0003\u0000\u0000\u01b4\u01b5\u0005"+
		"\u0003\u0000\u0000\u01b5\u01b6\u0005\n\u0000\u0000\u01b6\u01b7\u0005\u0003"+
		"\u0000\u0000\u01b7\u01b8\u0005\n\u0000\u0000\u01b8\u01b9\u0005\u0003\u0000"+
		"\u0000\u01b9\u01ba\u0005\n\u0000\u0000\u01ba\u01bb\u0005\u0003\u0000\u0000"+
		"\u01bb\u01bc\u0005\n\u0000\u0000\u01bc\u01bd\u0005\u0003\u0000\u0000\u01bd"+
		"\u01be\u0005\n\u0000\u0000\u01be\u01bf\u0005\u0003\u0000\u0000\u01bf\u01c0"+
		"\u0005\n\u0000\u0000\u01c0\u01c1\u0005\u0003\u0000\u0000\u01c1\u01c2\u0005"+
		"\n\u0000\u0000\u01c2\u01c3\u0005\u0003\u0000\u0000\u01c3\u01c4\u0005\n"+
		"\u0000\u0000\u01c4\u01c5\u0005\u0003\u0000\u0000\u01c5\u0211\u0005\u0004"+
		"\u0000\u0000\u01c6\u01c8\u0003\u0016\u000b\u0000\u01c7\u01c9\u0003\u0016"+
		"\u000b\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000"+
		"\u0000\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u01cc\u0003\u0016"+
		"\u000b\u0000\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000"+
		"\u0000\u0000\u01cc\u01ce\u0001\u0000\u0000\u0000\u01cd\u01cf\u0003\u0016"+
		"\u000b\u0000\u01ce\u01cd\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d1\u0001\u0000\u0000\u0000\u01d0\u01d2\u0003\u0016"+
		"\u000b\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d4\u0001\u0000\u0000\u0000\u01d3\u01d5\u0003\u0016"+
		"\u000b\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d7\u0001\u0000\u0000\u0000\u01d6\u01d8\u0003\u0016"+
		"\u000b\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000"+
		"\u0000\u0000\u01d8\u01dc\u0001\u0000\u0000\u0000\u01d9\u01db\u0003\u0016"+
		"\u000b\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01db\u01de\u0001\u0000"+
		"\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000"+
		"\u0000\u0000\u01dd\u01df\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000"+
		"\u0000\u0000\u01df\u01e0\u0005\u0003\u0000\u0000\u01e0\u01e1\u0005\u0003"+
		"\u0000\u0000\u01e1\u01e2\u0005\n\u0000\u0000\u01e2\u01e6\u0005\u0003\u0000"+
		"\u0000\u01e3\u01e5\u0003\u0016\u000b\u0000\u01e4\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e5\u01e8\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e9\u0001\u0000\u0000"+
		"\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e9\u01eb\u0005\u0003\u0000"+
		"\u0000\u01ea\u01ec\u0005\u0006\u0000\u0000\u01eb\u01ea\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ef\u0005\u0003\u0000\u0000\u01ee\u01f0\u0005\u0006\u0000"+
		"\u0000\u01ef\u01ee\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f3\u0005\u0003\u0000"+
		"\u0000\u01f2\u01f4\u0005\n\u0000\u0000\u01f3\u01f2\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f7\u0005\u0003\u0000\u0000\u01f6\u01f8\u0005\b\u0000\u0000\u01f7"+
		"\u01f6\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fb\u0005\u0003\u0000\u0000\u01fa"+
		"\u01fc\u0005\b\u0000\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fb\u01fc"+
		"\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u01ff"+
		"\u0005\u0003\u0000\u0000\u01fe\u0200\u0005\b\u0000\u0000\u01ff\u01fe\u0001"+
		"\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0201\u0001"+
		"\u0000\u0000\u0000\u0201\u0202\u0005\u0003\u0000\u0000\u0202\u0203\u0005"+
		"\u0004\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u0205\u0006"+
		"\u0005\uffff\uffff\u0000\u0205\u0212\u0001\u0000\u0000\u0000\u0206\u0207"+
		"\u0005\u0003\u0000\u0000\u0207\u0208\u0005\u0003\u0000\u0000\u0208\u0209"+
		"\u0005\u0003\u0000\u0000\u0209\u020a\u0005\u0003\u0000\u0000\u020a\u020b"+
		"\u0005\u0003\u0000\u0000\u020b\u020c\u0005\u0003\u0000\u0000\u020c\u020d"+
		"\u0005\u0003\u0000\u0000\u020d\u020e\u0005\u0003\u0000\u0000\u020e\u020f"+
		"\u0005\u0003\u0000\u0000\u020f\u0210\u0005\u0003\u0000\u0000\u0210\u0212"+
		"\u0005\u0004\u0000\u0000\u0211\u01c6\u0001\u0000\u0000\u0000\u0211\u0206"+
		"\u0001\u0000\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u0211"+
		"\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214\u0215"+
		"\u0001\u0000\u0000\u0000\u0215\u0216\u0005\n\u0000\u0000\u0216\u0217\u0005"+
		"\u0003\u0000\u0000\u0217\u0218\u0005\n\u0000\u0000\u0218\u0219\u0005\u0003"+
		"\u0000\u0000\u0219\u021a\u0005\u0006\u0000\u0000\u021a\u021c\u0005\u0004"+
		"\u0000\u0000\u021b\u01ae\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000"+
		"\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000"+
		"\u0000\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0220\u0005\u0005"+
		"\u0000\u0000\u0220\u0221\u0005\u0003\u0000\u0000\u0221\u0222\u0005\n\u0000"+
		"\u0000\u0222\u0223\u0005\n\u0000\u0000\u0223\u0224\u0005\n\u0000\u0000"+
		"\u0224\u0225\u0005\u0003\u0000\u0000\u0225\u0226\u0005\n\u0000\u0000\u0226"+
		"\u0227\u0005\n\u0000\u0000\u0227\u0228\u0005\n\u0000\u0000\u0228\u0229"+
		"\u0005\u0003\u0000\u0000\u0229\u022a\u0005\n\u0000\u0000\u022a\u022b\u0005"+
		"\u0003\u0000\u0000\u022b\u022c\u0005\n\u0000\u0000\u022c\u022d\u0005\u0004"+
		"\u0000\u0000\u022d\u000b\u0001\u0000\u0000\u0000\u022e\u0230\u0003\u0016"+
		"\u000b\u0000\u022f\u0231\u0003\u0016\u000b\u0000\u0230\u022f\u0001\u0000"+
		"\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0233\u0001\u0000"+
		"\u0000\u0000\u0232\u0234\u0003\u0016\u000b\u0000\u0233\u0232\u0001\u0000"+
		"\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0236\u0001\u0000"+
		"\u0000\u0000\u0235\u0237\u0003\u0016\u000b\u0000\u0236\u0235\u0001\u0000"+
		"\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u0239\u0001\u0000"+
		"\u0000\u0000\u0238\u023a\u0003\u0016\u000b\u0000\u0239\u0238\u0001\u0000"+
		"\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023c\u0001\u0000"+
		"\u0000\u0000\u023b\u023d\u0003\u0016\u000b\u0000\u023c\u023b\u0001\u0000"+
		"\u0000\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u023f\u0001\u0000"+
		"\u0000\u0000\u023e\u0240\u0003\u0016\u000b\u0000\u023f\u023e\u0001\u0000"+
		"\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0244\u0001\u0000"+
		"\u0000\u0000\u0241\u0243\u0003\u0016\u000b\u0000\u0242\u0241\u0001\u0000"+
		"\u0000\u0000\u0243\u0246\u0001\u0000\u0000\u0000\u0244\u0242\u0001\u0000"+
		"\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245\u0247\u0001\u0000"+
		"\u0000\u0000\u0246\u0244\u0001\u0000\u0000\u0000\u0247\u0248\u0005\b\u0000"+
		"\u0000\u0248\u0249\u0005\u0004\u0000\u0000\u0249\u024a\u0005\n\u0000\u0000"+
		"\u024a\u024c\u0005\n\u0000\u0000\u024b\u024d\u0005\n\u0000\u0000\u024c"+
		"\u024b\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024d"+
		"\u024e\u0001\u0000\u0000\u0000\u024e\u024f\u0005\u0003\u0000\u0000\u024f"+
		"\u0250\u0005\u0004\u0000\u0000\u0250\u0251\u0005\n\u0000\u0000\u0251\u0252"+
		"\u0005\u0003\u0000\u0000\u0252\u0253\u0005\n\u0000\u0000\u0253\u0254\u0005"+
		"\n\u0000\u0000\u0254\u0255\u0005\n\u0000\u0000\u0255\u0256\u0005\n\u0000"+
		"\u0000\u0256\u0257\u0005\n\u0000\u0000\u0257\u0258\u0005\u0003\u0000\u0000"+
		"\u0258\u0259\u0005\u0004\u0000\u0000\u0259\u025a\u0005\n\u0000\u0000\u025a"+
		"\u025b\u0005\u0003\u0000\u0000\u025b\u025c\u0005\b\u0000\u0000\u025c\u025d"+
		"\u0005\u0003\u0000\u0000\u025d\u025e\u0005\u0004\u0000\u0000\u025e\u025f"+
		"\u0006\u0006\uffff\uffff\u0000\u025f\r\u0001\u0000\u0000\u0000\u0260\u0261"+
		"\u0005\u0005\u0000\u0000\u0261\u0262\u0005\u0003\u0000\u0000\u0262\u0263"+
		"\u0005\n\u0000\u0000\u0263\u0264\u0005\n\u0000\u0000\u0264\u0265\u0005"+
		"\n\u0000\u0000\u0265\u0266\u0005\u0003\u0000\u0000\u0266\u0267\u0005\n"+
		"\u0000\u0000\u0267\u0268\u0005\u0003\u0000\u0000\u0268\u0269\u0005\n\u0000"+
		"\u0000\u0269\u02f0\u0005\u0004\u0000\u0000\u026a\u026b\u0005\u0005\u0000"+
		"\u0000\u026b\u026c\u0005\u0003\u0000\u0000\u026c\u026d\u0005\b\u0000\u0000"+
		"\u026d\u026f\u0005\u0003\u0000\u0000\u026e\u0270\u0003\u0016\u000b\u0000"+
		"\u026f\u026e\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000\u0000"+
		"\u0271\u026f\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000"+
		"\u0272\u0273\u0001\u0000\u0000\u0000\u0273\u0274\u0005\u0004\u0000\u0000"+
		"\u0274\u0275\u0005\n\u0000\u0000\u0275\u0276\u0005\u0003\u0000\u0000\u0276"+
		"\u0277\u0005\n\u0000\u0000\u0277\u0278\u0005\u0004\u0000\u0000\u0278\u0279"+
		"\u0005\n\u0000\u0000\u0279\u027a\u0005\u0003\u0000\u0000\u027a\u027b\u0005"+
		"\n\u0000\u0000\u027b\u027c\u0005\u0004\u0000\u0000\u027c\u027d\u0005\n"+
		"\u0000\u0000\u027d\u027e\u0005\u0003\u0000\u0000\u027e\u027f\u0005\n\u0000"+
		"\u0000\u027f\u0280\u0005\u0003\u0000\u0000\u0280\u0281\u0005\n\u0000\u0000"+
		"\u0281\u0282\u0005\u0003\u0000\u0000\u0282\u0283\u0005\n\u0000\u0000\u0283"+
		"\u0284\u0005\u0003\u0000\u0000\u0284\u0285\u0005\n\u0000\u0000\u0285\u0286"+
		"\u0005\u0003\u0000\u0000\u0286\u0287\u0005\n\u0000\u0000\u0287\u0288\u0005"+
		"\u0003\u0000\u0000\u0288\u0289\u0005\n\u0000\u0000\u0289\u028a\u0005\u0003"+
		"\u0000\u0000\u028a\u028b\u0005\n\u0000\u0000\u028b\u028c\u0005\u0003\u0000"+
		"\u0000\u028c\u028d\u0005\n\u0000\u0000\u028d\u028e\u0005\u0003\u0000\u0000"+
		"\u028e\u028f\u0005\n\u0000\u0000\u028f\u0290\u0005\u0003\u0000\u0000\u0290"+
		"\u0291\u0005\n\u0000\u0000\u0291\u0292\u0005\u0003\u0000\u0000\u0292\u0293"+
		"\u0005\n\u0000\u0000\u0293\u0294\u0005\u0003\u0000\u0000\u0294\u0295\u0005"+
		"\u0004\u0000\u0000\u0295\u0296\u0005\n\u0000\u0000\u0296\u0297\u0005\u0003"+
		"\u0000\u0000\u0297\u0298\u0005\n\u0000\u0000\u0298\u0299\u0005\u0003\u0000"+
		"\u0000\u0299\u029a\u0005\n\u0000\u0000\u029a\u029b\u0005\u0003\u0000\u0000"+
		"\u029b\u029c\u0005\n\u0000\u0000\u029c\u029d\u0005\u0003\u0000\u0000\u029d"+
		"\u029e\u0005\n\u0000\u0000\u029e\u029f\u0005\u0003\u0000\u0000\u029f\u02a0"+
		"\u0005\n\u0000\u0000\u02a0\u02a1\u0005\u0003\u0000\u0000\u02a1\u02e5\u0005"+
		"\u0004\u0000\u0000\u02a2\u02a3\u0005\u0003\u0000\u0000\u02a3\u02a4\u0005"+
		"\u0003\u0000\u0000\u02a4\u02a5\u0005\u0003\u0000\u0000\u02a5\u02a6\u0005"+
		"\u0003\u0000\u0000\u02a6\u02a7\u0005\u0003\u0000\u0000\u02a7\u02a8\u0005"+
		"\u0003\u0000\u0000\u02a8\u02a9\u0005\u0003\u0000\u0000\u02a9\u02aa\u0005"+
		"\u0003\u0000\u0000\u02aa\u02ab\u0005\u0003\u0000\u0000\u02ab\u02ac\u0005"+
		"\u0003\u0000\u0000\u02ac\u02ad\u0005\u0003\u0000\u0000\u02ad\u02ae\u0005"+
		"\u0003\u0000\u0000\u02ae\u02af\u0005\u0003\u0000\u0000\u02af\u02b0\u0005"+
		"\u0003\u0000\u0000\u02b0\u02b1\u0005\u0003\u0000\u0000\u02b1\u02b2\u0005"+
		"\u0003\u0000\u0000\u02b2\u02b3\u0005\u0003\u0000\u0000\u02b3\u02e6\u0005"+
		"\u0004\u0000\u0000\u02b4\u02b5\u0005\u0006\u0000\u0000\u02b5\u02b7\u0005"+
		"\u0003\u0000\u0000\u02b6\u02b8\u0005\u0006\u0000\u0000\u02b7\u02b6\u0001"+
		"\u0000\u0000\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001"+
		"\u0000\u0000\u0000\u02b9\u02bb\u0005\u0003\u0000\u0000\u02ba\u02bc\u0005"+
		"\u0006\u0000\u0000\u02bb\u02ba\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001"+
		"\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd\u02be\u0005"+
		"\u0003\u0000\u0000\u02be\u02bf\u0005\b\u0000\u0000\u02bf\u02c1\u0005\u0003"+
		"\u0000\u0000\u02c0\u02c2\u0003\u0016\u000b\u0000\u02c1\u02c0\u0001\u0000"+
		"\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c1\u0001\u0000"+
		"\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4\u02c5\u0001\u0000"+
		"\u0000\u0000\u02c5\u02c6\u0005\u0003\u0000\u0000\u02c6\u02c7\u0005\n\u0000"+
		"\u0000\u02c7\u02c8\u0005\u0003\u0000\u0000\u02c8\u02c9\u0005\n\u0000\u0000"+
		"\u02c9\u02ca\u0005\u0003\u0000\u0000\u02ca\u02cb\u0005\n\u0000\u0000\u02cb"+
		"\u02cc\u0005\u0003\u0000\u0000\u02cc\u02cd\u0005\n\u0000\u0000\u02cd\u02ce"+
		"\u0005\u0003\u0000\u0000\u02ce\u02cf\u0005\b\u0000\u0000\u02cf\u02d1\u0005"+
		"\u0003\u0000\u0000\u02d0\u02d2\u0005\b\u0000\u0000\u02d1\u02d0\u0001\u0000"+
		"\u0000\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000"+
		"\u0000\u0000\u02d3\u02d4\u0005\u0003\u0000\u0000\u02d4\u02d5\u0005\b\u0000"+
		"\u0000\u02d5\u02d6\u0005\u0003\u0000\u0000\u02d6\u02d7\u0005\b\u0000\u0000"+
		"\u02d7\u02d9\u0005\u0003\u0000\u0000\u02d8\u02da\u0005\b\u0000\u0000\u02d9"+
		"\u02d8\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000\u0000\u0000\u02da"+
		"\u02db\u0001\u0000\u0000\u0000\u02db\u02dc\u0005\u0003\u0000\u0000\u02dc"+
		"\u02dd\u0005\u0003\u0000\u0000\u02dd\u02de\u0005\b\u0000\u0000\u02de\u02df"+
		"\u0005\u0003\u0000\u0000\u02df\u02e0\u0005\b\u0000\u0000\u02e0\u02e1\u0005"+
		"\u0003\u0000\u0000\u02e1\u02e2\u0005\u0004\u0000\u0000\u02e2\u02e3\u0001"+
		"\u0000\u0000\u0000\u02e3\u02e4\u0006\u0007\uffff\uffff\u0000\u02e4\u02e6"+
		"\u0001\u0000\u0000\u0000\u02e5\u02a2\u0001\u0000\u0000\u0000\u02e5\u02b4"+
		"\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7\u02e5"+
		"\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8\u02e9"+
		"\u0001\u0000\u0000\u0000\u02e9\u02ea\u0005\n\u0000\u0000\u02ea\u02eb\u0005"+
		"\u0003\u0000\u0000\u02eb\u02ec\u0005\n\u0000\u0000\u02ec\u02ed\u0005\u0003"+
		"\u0000\u0000\u02ed\u02ee\u0005\u0006\u0000\u0000\u02ee\u02ef\u0005\u0004"+
		"\u0000\u0000\u02ef\u02f1\u0001\u0000\u0000\u0000\u02f0\u026a\u0001\u0000"+
		"\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000"+
		"\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000"+
		"\u0000\u0000\u02f4\u02f5\u0005\u0005\u0000\u0000\u02f5\u02f6\u0005\u0003"+
		"\u0000\u0000\u02f6\u02f7\u0005\n\u0000\u0000\u02f7\u02f8\u0005\n\u0000"+
		"\u0000\u02f8\u02f9\u0005\n\u0000\u0000\u02f9\u02fa\u0005\u0003\u0000\u0000"+
		"\u02fa\u02fb\u0005\n\u0000\u0000\u02fb\u02fc\u0005\u0003\u0000\u0000\u02fc"+
		"\u02fd\u0005\n\u0000\u0000\u02fd\u02fe\u0005\u0004\u0000\u0000\u02fe\u000f"+
		"\u0001\u0000\u0000\u0000\u02ff\u0300\u0005\u0005\u0000\u0000\u0300\u0301"+
		"\u0005\u0003\u0000\u0000\u0301\u0302\u0005\n\u0000\u0000\u0302\u0303\u0005"+
		"\n\u0000\u0000\u0303\u0304\u0005\n\u0000\u0000\u0304\u0305\u0005\u0003"+
		"\u0000\u0000\u0305\u0306\u0005\n\u0000\u0000\u0306\u0307\u0005\u0003\u0000"+
		"\u0000\u0307\u0308\u0005\n\u0000\u0000\u0308\u033e\u0005\u0004\u0000\u0000"+
		"\u0309\u030a\u0005\b\u0000\u0000\u030a\u030c\u0005\u0003\u0000\u0000\u030b"+
		"\u030d\u0003\u0016\u000b\u0000\u030c\u030b\u0001\u0000\u0000\u0000\u030d"+
		"\u030e\u0001\u0000\u0000\u0000\u030e\u030c\u0001\u0000\u0000\u0000\u030e"+
		"\u030f\u0001\u0000\u0000\u0000\u030f\u0310\u0001\u0000\u0000\u0000\u0310"+
		"\u0311\u0005\u0004\u0000\u0000\u0311\u0312\u0005\n\u0000\u0000\u0312\u0313"+
		"\u0005\u0003\u0000\u0000\u0313\u0314\u0005\n\u0000\u0000\u0314\u0315\u0005"+
		"\u0003\u0000\u0000\u0315\u0316\u0005\n\u0000\u0000\u0316\u0317\u0005\u0003"+
		"\u0000\u0000\u0317\u0318\u0005\n\u0000\u0000\u0318\u0319\u0005\u0003\u0000"+
		"\u0000\u0319\u031a\u0005\n\u0000\u0000\u031a\u031b\u0005\u0003\u0000\u0000"+
		"\u031b\u031c\u0005\n\u0000\u0000\u031c\u031d\u0005\u0003\u0000\u0000\u031d"+
		"\u031e\u0005\n\u0000\u0000\u031e\u031f\u0005\u0003\u0000\u0000\u031f\u0333"+
		"\u0005\u0004\u0000\u0000\u0320\u0321\u0005\u0003\u0000\u0000\u0321\u0334"+
		"\u0005\u0004\u0000\u0000\u0322\u0323\u0005\u0006\u0000\u0000\u0323\u0324"+
		"\u0005\u0003\u0000\u0000\u0324\u0325\u0005\b\u0000\u0000\u0325\u0326\u0005"+
		"\u0003\u0000\u0000\u0326\u0327\u0005\b\u0000\u0000\u0327\u0328\u0005\u0003"+
		"\u0000\u0000\u0328\u0329\u0005\b\u0000\u0000\u0329\u032a\u0005\u0003\u0000"+
		"\u0000\u032a\u032b\u0005\b\u0000\u0000\u032b\u032c\u0005\u0003\u0000\u0000"+
		"\u032c\u032d\u0005\b\u0000\u0000\u032d\u032e\u0005\u0003\u0000\u0000\u032e"+
		"\u032f\u0005\b\u0000\u0000\u032f\u0330\u0005\u0003\u0000\u0000\u0330\u0331"+
		"\u0005\u0004\u0000\u0000\u0331\u0332\u0001\u0000\u0000\u0000\u0332\u0334"+
		"\u0006\b\uffff\uffff\u0000\u0333\u0320\u0001\u0000\u0000\u0000\u0333\u0322"+
		"\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000\u0000\u0000\u0335\u0333"+
		"\u0001\u0000\u0000\u0000\u0335\u0336\u0001\u0000\u0000\u0000\u0336\u0337"+
		"\u0001\u0000\u0000\u0000\u0337\u0338\u0005\n\u0000\u0000\u0338\u0339\u0005"+
		"\u0003\u0000\u0000\u0339\u033a\u0005\n\u0000\u0000\u033a\u033b\u0005\u0003"+
		"\u0000\u0000\u033b\u033c\u0005\u0006\u0000\u0000\u033c\u033d\u0005\u0004"+
		"\u0000\u0000\u033d\u033f\u0001\u0000\u0000\u0000\u033e\u0309\u0001\u0000"+
		"\u0000\u0000\u033f\u0340\u0001\u0000\u0000\u0000\u0340\u033e\u0001\u0000"+
		"\u0000\u0000\u0340\u0341\u0001\u0000\u0000\u0000\u0341\u0342\u0001\u0000"+
		"\u0000\u0000\u0342\u0343\u0005\u0005\u0000\u0000\u0343\u0344\u0005\u0003"+
		"\u0000\u0000\u0344\u0345\u0005\n\u0000\u0000\u0345\u0346\u0005\n\u0000"+
		"\u0000\u0346\u0347\u0005\n\u0000\u0000\u0347\u0348\u0005\u0003\u0000\u0000"+
		"\u0348\u0349\u0005\n\u0000\u0000\u0349\u034a\u0005\u0003\u0000\u0000\u034a"+
		"\u034b\u0005\n\u0000\u0000\u034b\u034c\u0005\u0004\u0000\u0000\u034c\u0011"+
		"\u0001\u0000\u0000\u0000\u034d\u034f\u0003\u0018\f\u0000\u034e\u034d\u0001"+
		"\u0000\u0000\u0000\u034f\u0350\u0001\u0000\u0000\u0000\u0350\u034e\u0001"+
		"\u0000\u0000\u0000\u0350\u0351\u0001\u0000\u0000\u0000\u0351\u0352\u0001"+
		"\u0000\u0000\u0000\u0352\u0353\u0005\n\u0000\u0000\u0353\u0354\u0005\n"+
		"\u0000\u0000\u0354\u0355\u0005\n\u0000\u0000\u0355\u0356\u0005\n\u0000"+
		"\u0000\u0356\u0357\u0005\n\u0000\u0000\u0357\u0358\u0005\n\u0000\u0000"+
		"\u0358\u035a\u0005\u0004\u0000\u0000\u0359\u035b\u0003\u0014\n\u0000\u035a"+
		"\u0359\u0001\u0000\u0000\u0000\u035b\u035c\u0001\u0000\u0000\u0000\u035c"+
		"\u035a\u0001\u0000\u0000\u0000\u035c\u035d\u0001\u0000\u0000\u0000\u035d"+
		"\u035e\u0001\u0000\u0000\u0000\u035e\u035f\u0003\u001a\r\u0000\u035f\u0013"+
		"\u0001\u0000\u0000\u0000\u0360\u0361\u0005\u0006\u0000\u0000\u0361\u0364"+
		"\u0005\u0004\u0000\u0000\u0362\u0363\u0005\u0006\u0000\u0000\u0363\u0365"+
		"\u0005\u0004\u0000\u0000\u0364\u0362\u0001\u0000\u0000\u0000\u0364\u0365"+
		"\u0001\u0000\u0000\u0000\u0365\u0366\u0001\u0000\u0000\u0000\u0366\u0367"+
		"\u0003\u0016\u000b\u0000\u0367\u0368\u0005\u0004\u0000\u0000\u0368\u036c"+
		"\u0003\u0016\u000b\u0000\u0369\u036b\u0003\u0016\u000b\u0000\u036a\u0369"+
		"\u0001\u0000\u0000\u0000\u036b\u036e\u0001\u0000\u0000\u0000\u036c\u036a"+
		"\u0001\u0000\u0000\u0000\u036c\u036d\u0001\u0000\u0000\u0000\u036d\u036f"+
		"\u0001\u0000\u0000\u0000\u036e\u036c\u0001\u0000\u0000\u0000\u036f\u0370"+
		"\u0005\u0004\u0000\u0000\u0370\u0371\u0005\n\u0000\u0000\u0371\u0372\u0005"+
		"\u0004\u0000\u0000\u0372\u0373\u0005\n\u0000\u0000\u0373\u0374\u0005\u0004"+
		"\u0000\u0000\u0374\u0375\u0005\n\u0000\u0000\u0375\u0376\u0005\u0004\u0000"+
		"\u0000\u0376\u0377\u0005\n\u0000\u0000\u0377\u0378\u0005\u0004\u0000\u0000"+
		"\u0378\u0379\u0005\b\u0000\u0000\u0379\u037a\u0005\u0004\u0000\u0000\u037a"+
		"\u037b\u0005\b\u0000\u0000\u037b\u037c\u0005\u0004\u0000\u0000\u037c\u037d"+
		"\u0005\b\u0000\u0000\u037d\u037e\u0005\u0004\u0000\u0000\u037e\u037f\u0005"+
		"\b\u0000\u0000\u037f\u0380\u0005\u0004\u0000\u0000\u0380\u0381\u0005\b"+
		"\u0000\u0000\u0381\u0382\u0005\u0004\u0000\u0000\u0382\u0383\u0006\n\uffff"+
		"\uffff\u0000\u0383\u0015\u0001\u0000\u0000\u0000\u0384\u0385\u0007\u0000"+
		"\u0000\u0000\u0385\u0017\u0001\u0000\u0000\u0000\u0386\u0389\u0003\u0016"+
		"\u000b\u0000\u0387\u0389\u0005\u0003\u0000\u0000\u0388\u0386\u0001\u0000"+
		"\u0000\u0000\u0388\u0387\u0001\u0000\u0000\u0000\u0389\u038a\u0001\u0000"+
		"\u0000\u0000\u038a\u0388\u0001\u0000\u0000\u0000\u038a\u038b\u0001\u0000"+
		"\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000\u038c\u038d\u0005\u0004"+
		"\u0000\u0000\u038d\u0019\u0001\u0000\u0000\u0000\u038e\u0392\u0003\u0016"+
		"\u000b\u0000\u038f\u0392\u0005\u0003\u0000\u0000\u0390\u0392\u0005\u0004"+
		"\u0000\u0000\u0391\u038e\u0001\u0000\u0000\u0000\u0391\u038f\u0001\u0000"+
		"\u0000\u0000\u0391\u0390\u0001\u0000\u0000\u0000\u0392\u0393\u0001\u0000"+
		"\u0000\u0000\u0393\u0391\u0001\u0000\u0000\u0000\u0393\u0394\u0001\u0000"+
		"\u0000\u0000\u0394\u001b\u0001\u0000\u0000\u0000d$7:=@CFKRUX[^adipsvy"+
		"|\u007f\u0082\u0087\u009e\u00d7\u00dd\u00f3\u00fe\u011d\u0123\u0126\u0129"+
		"\u012c\u012f\u0132\u0137\u013d\u0140\u0143\u0146\u0149\u014c\u0151\u0159"+
		"\u0169\u017b\u017e\u0181\u0184\u0187\u018a\u018f\u0197\u01c8\u01cb\u01ce"+
		"\u01d1\u01d4\u01d7\u01dc\u01e6\u01eb\u01ef\u01f3\u01f7\u01fb\u01ff\u0211"+
		"\u0213\u021d\u0230\u0233\u0236\u0239\u023c\u023f\u0244\u024c\u0271\u02b7"+
		"\u02bb\u02c3\u02d1\u02d9\u02e5\u02e7\u02f2\u030e\u0333\u0335\u0340\u0350"+
		"\u035c\u0364\u036c\u0388\u038a\u0391\u0393";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}