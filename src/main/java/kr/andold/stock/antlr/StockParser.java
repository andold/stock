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
		RULE_stockDocument = 0, RULE_crawlPriceEtf = 1, RULE_crawlPriceCompay = 2, 
		RULE_crawlCompanyDetails = 3, RULE_crawlCompanyTopDividend = 4, RULE_crawlEtfDetailThread = 5, 
		RULE_extractAllEtfFromNaver = 6, RULE_crawlDividendHistoryEtfThread = 7, 
		RULE_extractItemDetailsEtf = 8, RULE_extractlDividendHistory = 9, RULE_extractTextStockPrice = 10, 
		RULE_seibroDividend = 11, RULE_seibroDividendItem = 12, RULE_word = 13, 
		RULE_line = 14, RULE_eof = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"stockDocument", "crawlPriceEtf", "crawlPriceCompay", "crawlCompanyDetails", 
			"crawlCompanyTopDividend", "crawlEtfDetailThread", "extractAllEtfFromNaver", 
			"crawlDividendHistoryEtfThread", "extractItemDetailsEtf", "extractlDividendHistory", 
			"extractTextStockPrice", "seibroDividend", "seibroDividendItem", "word", 
			"line", "eof"
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
		public CrawlPriceCompayContext crawlPriceCompay() {
			return getRuleContext(CrawlPriceCompayContext.class,0);
		}
		public CrawlPriceEtfContext crawlPriceEtf() {
			return getRuleContext(CrawlPriceEtfContext.class,0);
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
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				extractTextStockPrice();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				extractlDividendHistory();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				seibroDividend();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				crawlDividendHistoryEtfThread();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				extractAllEtfFromNaver();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(37);
				crawlEtfDetailThread();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(38);
				crawlCompanyTopDividend();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(39);
				crawlCompanyDetails();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(40);
				crawlPriceCompay();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(41);
				crawlPriceEtf();
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

	public static class CrawlPriceEtfContext extends ParserRuleContext {
		public Token code;
		public WordContext symbol;
		public Token base;
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
		public CrawlPriceEtfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crawlPriceEtf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterCrawlPriceEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitCrawlPriceEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitCrawlPriceEtf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlPriceEtfContext crawlPriceEtf() throws RecognitionException {
		CrawlPriceEtfContext _localctx = new CrawlPriceEtfContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_crawlPriceEtf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(KEYWORD);
			setState(45);
			match(TAB);
			setState(46);
			match(WORD);
			setState(47);
			match(WORD);
			setState(48);
			match(TAB);
			setState(49);
			match(WORD);
			setState(50);
			match(TAB);
			setState(51);
			match(WORD);
			setState(52);
			match(TAB);
			setState(53);
			match(WORD);
			setState(54);
			match(NEWLINE);
			setState(128); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				((CrawlPriceEtfContext)_localctx).code = match(NUMBER);
				setState(56);
				match(TAB);
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(57);
					((CrawlPriceEtfContext)_localctx).symbol = word();
					}
					}
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(62);
				match(NEWLINE);
				setState(63);
				match(WORD);
				setState(64);
				match(TAB);
				setState(65);
				match(WORD);
				setState(66);
				match(TAB);
				setState(67);
				match(WORD);
				setState(68);
				match(TAB);
				setState(69);
				match(WORD);
				setState(70);
				match(TAB);
				setState(71);
				match(WORD);
				setState(72);
				match(TAB);
				setState(73);
				match(WORD);
				setState(74);
				match(TAB);
				setState(75);
				match(WORD);
				setState(76);
				match(TAB);
				setState(77);
				match(WORD);
				setState(78);
				match(TAB);
				setState(79);
				match(NEWLINE);
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(117);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						{
						setState(80);
						match(TAB);
						setState(81);
						match(TAB);
						setState(82);
						match(TAB);
						setState(83);
						match(TAB);
						setState(84);
						match(TAB);
						setState(85);
						match(TAB);
						setState(86);
						match(TAB);
						setState(87);
						match(TAB);
						setState(88);
						match(NEWLINE);
						}
						}
						break;
					case 2:
						{
						{
						setState(90);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==DATE) {
							{
							setState(89);
							((CrawlPriceEtfContext)_localctx).base = match(DATE);
							}
						}

						setState(92);
						match(TAB);
						setState(94);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(93);
							((CrawlPriceEtfContext)_localctx).closing = match(NUMBER);
							}
						}

						setState(96);
						match(TAB);
						setState(98);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(97);
							match(NUMBER);
							}
						}

						setState(100);
						match(TAB);
						setState(102);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(101);
							((CrawlPriceEtfContext)_localctx).market = match(NUMBER);
							}
						}

						setState(104);
						match(TAB);
						setState(105);
						((CrawlPriceEtfContext)_localctx).high = match(NUMBER);
						setState(106);
						match(TAB);
						setState(107);
						((CrawlPriceEtfContext)_localctx).low = match(NUMBER);
						setState(108);
						match(TAB);
						setState(109);
						((CrawlPriceEtfContext)_localctx).volume = match(NUMBER);
						setState(110);
						match(TAB);
						setState(112);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(111);
							match(NUMBER);
							}
						}

						setState(114);
						match(TAB);
						setState(115);
						match(NEWLINE);

									StockParserService.crawlPriceCompanyEtf(20231217
										, (((CrawlPriceEtfContext)_localctx).code!=null?((CrawlPriceEtfContext)_localctx).code.getText():null), (((CrawlPriceEtfContext)_localctx).symbol!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol.start,((CrawlPriceEtfContext)_localctx).symbol.stop):null)
										, (((CrawlPriceEtfContext)_localctx).base!=null?((CrawlPriceEtfContext)_localctx).base.getText():null), (((CrawlPriceEtfContext)_localctx).closing!=null?((CrawlPriceEtfContext)_localctx).closing.getText():null), (((CrawlPriceEtfContext)_localctx).market!=null?((CrawlPriceEtfContext)_localctx).market.getText():null), (((CrawlPriceEtfContext)_localctx).high!=null?((CrawlPriceEtfContext)_localctx).high.getText():null), (((CrawlPriceEtfContext)_localctx).low!=null?((CrawlPriceEtfContext)_localctx).low.getText():null), (((CrawlPriceEtfContext)_localctx).volume!=null?((CrawlPriceEtfContext)_localctx).volume.getText():null)
									);
								
						}
						}
						break;
					}
					}
					setState(119); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TAB || _la==DATE );
				setState(121);
				match(WORD);
				setState(122);
				match(TAB);
				setState(123);
				match(WORD);
				setState(124);
				match(TAB);
				setState(125);
				match(DATE);
				setState(126);
				match(NEWLINE);
				}
				}
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(132);
			match(KEYWORD);
			setState(133);
			match(TAB);
			setState(134);
			match(WORD);
			setState(135);
			match(WORD);
			setState(136);
			match(TAB);
			setState(137);
			match(WORD);
			setState(138);
			match(TAB);
			setState(139);
			match(WORD);
			setState(140);
			match(TAB);
			setState(141);
			match(WORD);
			setState(142);
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

	public static class CrawlPriceCompayContext extends ParserRuleContext {
		public Token code;
		public WordContext symbol;
		public Token base;
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
		public CrawlPriceCompayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crawlPriceCompay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterCrawlPriceCompay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitCrawlPriceCompay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitCrawlPriceCompay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlPriceCompayContext crawlPriceCompay() throws RecognitionException {
		CrawlPriceCompayContext _localctx = new CrawlPriceCompayContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_crawlPriceCompay);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(KEYWORD);
			setState(145);
			match(TAB);
			setState(146);
			match(WORD);
			setState(147);
			match(WORD);
			setState(148);
			match(TAB);
			setState(149);
			match(WORD);
			setState(150);
			match(TAB);
			setState(151);
			match(WORD);
			setState(152);
			match(TAB);
			setState(153);
			match(WORD);
			setState(154);
			match(NEWLINE);
			setState(213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				((CrawlPriceCompayContext)_localctx).code = match(NUMBER);
				setState(156);
				match(TAB);
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(157);
					((CrawlPriceCompayContext)_localctx).symbol = word();
					}
					}
					setState(160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(162);
				match(NEWLINE);
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
				match(TAB);
				setState(171);
				match(WORD);
				setState(172);
				match(TAB);
				setState(173);
				match(WORD);
				setState(174);
				match(TAB);
				setState(175);
				match(WORD);
				setState(176);
				match(TAB);
				setState(177);
				match(NEWLINE);
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(202);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAB:
						{
						{
						setState(178);
						match(TAB);
						setState(179);
						match(TAB);
						setState(180);
						match(TAB);
						setState(181);
						match(TAB);
						setState(182);
						match(TAB);
						setState(183);
						match(TAB);
						setState(184);
						match(TAB);
						setState(185);
						match(NEWLINE);
						}
						}
						break;
					case DATE:
						{
						{
						setState(186);
						((CrawlPriceCompayContext)_localctx).base = match(DATE);
						setState(187);
						match(TAB);
						setState(188);
						((CrawlPriceCompayContext)_localctx).closing = match(NUMBER);
						setState(189);
						match(TAB);
						setState(190);
						match(NUMBER);
						setState(191);
						match(TAB);
						setState(192);
						((CrawlPriceCompayContext)_localctx).market = match(NUMBER);
						setState(193);
						match(TAB);
						setState(194);
						((CrawlPriceCompayContext)_localctx).high = match(NUMBER);
						setState(195);
						match(TAB);
						setState(196);
						((CrawlPriceCompayContext)_localctx).low = match(NUMBER);
						setState(197);
						match(TAB);
						setState(198);
						((CrawlPriceCompayContext)_localctx).volume = match(NUMBER);
						setState(199);
						match(TAB);
						setState(200);
						match(NEWLINE);

									StockParserService.crawlPriceCompanyEtf(20231217
										, (((CrawlPriceCompayContext)_localctx).code!=null?((CrawlPriceCompayContext)_localctx).code.getText():null), (((CrawlPriceCompayContext)_localctx).symbol!=null?_input.getText(((CrawlPriceCompayContext)_localctx).symbol.start,((CrawlPriceCompayContext)_localctx).symbol.stop):null)
										, (((CrawlPriceCompayContext)_localctx).base!=null?((CrawlPriceCompayContext)_localctx).base.getText():null), (((CrawlPriceCompayContext)_localctx).closing!=null?((CrawlPriceCompayContext)_localctx).closing.getText():null), (((CrawlPriceCompayContext)_localctx).market!=null?((CrawlPriceCompayContext)_localctx).market.getText():null), (((CrawlPriceCompayContext)_localctx).high!=null?((CrawlPriceCompayContext)_localctx).high.getText():null), (((CrawlPriceCompayContext)_localctx).low!=null?((CrawlPriceCompayContext)_localctx).low.getText():null), (((CrawlPriceCompayContext)_localctx).volume!=null?((CrawlPriceCompayContext)_localctx).volume.getText():null)
									);
								
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(204); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TAB || _la==DATE );
				setState(206);
				match(WORD);
				setState(207);
				match(TAB);
				setState(208);
				match(WORD);
				setState(209);
				match(TAB);
				setState(210);
				match(DATE);
				setState(211);
				match(NEWLINE);
				}
				}
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(217);
			match(KEYWORD);
			setState(218);
			match(TAB);
			setState(219);
			match(WORD);
			setState(220);
			match(WORD);
			setState(221);
			match(TAB);
			setState(222);
			match(WORD);
			setState(223);
			match(TAB);
			setState(224);
			match(WORD);
			setState(225);
			match(TAB);
			setState(226);
			match(WORD);
			setState(227);
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
		enterRule(_localctx, 6, RULE_crawlCompanyDetails);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(KEYWORD);
			setState(230);
			match(TAB);
			setState(231);
			match(WORD);
			setState(232);
			match(WORD);
			setState(233);
			match(TAB);
			setState(234);
			match(WORD);
			setState(235);
			match(TAB);
			setState(236);
			match(WORD);
			setState(237);
			match(TAB);
			setState(238);
			match(WORD);
			setState(239);
			match(NEWLINE);
			setState(347); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(240);
					match(KEYWORD);
					setState(241);
					match(TAB);
					setState(242);
					((CrawlCompanyDetailsContext)_localctx).code = match(NUMBER);
					setState(243);
					match(TAB);
					setState(244);
					((CrawlCompanyDetailsContext)_localctx).symbol = word();
					setState(246);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(245);
						((CrawlCompanyDetailsContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(249);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(248);
						((CrawlCompanyDetailsContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(252);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(251);
						((CrawlCompanyDetailsContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(254);
						((CrawlCompanyDetailsContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(258);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(257);
						((CrawlCompanyDetailsContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(261);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(260);
						((CrawlCompanyDetailsContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(263);
						((CrawlCompanyDetailsContext)_localctx).symbol7 = word();
						}
						}
						setState(268);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(269);
					match(NEWLINE);
					setState(270);
					match(KEYWORD);
					setState(271);
					match(TAB);
					setState(273);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(272);
						((CrawlCompanyDetailsContext)_localctx).category = word();
						}
						break;
					}
					setState(276);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(275);
						((CrawlCompanyDetailsContext)_localctx).category1 = word();
						}
						break;
					}
					setState(279);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(278);
						((CrawlCompanyDetailsContext)_localctx).category2 = word();
						}
						break;
					}
					setState(282);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(281);
						((CrawlCompanyDetailsContext)_localctx).category3 = word();
						}
						break;
					}
					setState(285);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(284);
						((CrawlCompanyDetailsContext)_localctx).category4 = word();
						}
						break;
					}
					setState(288);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(287);
						((CrawlCompanyDetailsContext)_localctx).category5 = word();
						}
						break;
					}
					setState(291);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(290);
						((CrawlCompanyDetailsContext)_localctx).category6 = word();
						}
						break;
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(293);
						((CrawlCompanyDetailsContext)_localctx).category7 = word();
						}
						}
						setState(298);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(299);
					match(NEWLINE);
					setState(300);
					match(KEYWORD);
					setState(301);
					match(TAB);
					setState(303);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(302);
						((CrawlCompanyDetailsContext)_localctx).fics = word();
						}
						break;
					}
					setState(306);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(305);
						((CrawlCompanyDetailsContext)_localctx).fics1 = word();
						}
						break;
					}
					setState(309);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(308);
						((CrawlCompanyDetailsContext)_localctx).fics2 = word();
						}
						break;
					}
					setState(312);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(311);
						((CrawlCompanyDetailsContext)_localctx).fics3 = word();
						}
						break;
					}
					setState(315);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(314);
						((CrawlCompanyDetailsContext)_localctx).fics4 = word();
						}
						break;
					}
					setState(318);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(317);
						((CrawlCompanyDetailsContext)_localctx).fics5 = word();
						}
						break;
					}
					setState(321);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(320);
						((CrawlCompanyDetailsContext)_localctx).fics6 = word();
						}
						break;
					}
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(323);
						((CrawlCompanyDetailsContext)_localctx).fics7 = word();
						}
						}
						setState(328);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(329);
					match(NEWLINE);
					setState(330);
					match(KEYWORD);
					setState(331);
					match(TAB);
					setState(332);
					((CrawlCompanyDetailsContext)_localctx).ea = match(NUMBER);
					setState(333);
					match(WORD);
					setState(334);
					match(NEWLINE);
					setState(335);
					match(KEYWORD);
					setState(336);
					match(TAB);
					setState(337);
					((CrawlCompanyDetailsContext)_localctx).ipo = match(DATE);
					setState(338);
					match(NEWLINE);
					setState(339);
					match(WORD);
					setState(340);
					match(TAB);
					setState(341);
					match(WORD);
					setState(342);
					match(TAB);
					setState(343);
					match(DATE);
					setState(344);
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
				setState(349); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(351);
			match(KEYWORD);
			setState(352);
			match(TAB);
			setState(353);
			match(WORD);
			setState(354);
			match(WORD);
			setState(355);
			match(TAB);
			setState(356);
			match(WORD);
			setState(357);
			match(TAB);
			setState(358);
			match(WORD);
			setState(359);
			match(TAB);
			setState(360);
			match(WORD);
			setState(361);
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
		enterRule(_localctx, 8, RULE_crawlCompanyTopDividend);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(KEYWORD);
			setState(364);
			match(TAB);
			setState(365);
			match(WORD);
			setState(366);
			match(TAB);
			setState(367);
			match(WORD);
			setState(368);
			match(WORD);
			setState(369);
			match(WORD);
			setState(370);
			match(TAB);
			setState(371);
			match(WORD);
			setState(372);
			match(TAB);
			setState(373);
			match(WORD);
			setState(374);
			match(NEWLINE);
			setState(443); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(375);
				match(WORD);
				setState(376);
				match(TAB);
				setState(377);
				match(NEWLINE);
				setState(378);
				match(WORD);
				setState(379);
				match(TAB);
				setState(380);
				match(WORD);
				setState(381);
				match(TAB);
				setState(382);
				match(WORD);
				setState(383);
				match(TAB);
				setState(384);
				match(WORD);
				setState(385);
				match(TAB);
				setState(386);
				match(WORD);
				setState(387);
				match(TAB);
				setState(388);
				match(WORD);
				setState(389);
				match(TAB);
				setState(390);
				match(WORD);
				setState(391);
				match(TAB);
				setState(392);
				match(WORD);
				setState(393);
				match(TAB);
				setState(394);
				match(WORD);
				setState(395);
				match(TAB);
				setState(396);
				match(WORD);
				setState(397);
				match(TAB);
				setState(398);
				match(WORD);
				setState(399);
				match(TAB);
				setState(400);
				match(NEWLINE);
				setState(432); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(401);
						((CrawlCompanyTopDividendContext)_localctx).type = match(WORD);
						setState(402);
						match(TAB);
						setState(403);
						match(NUMBER);
						setState(404);
						match(TAB);
						setState(406);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(405);
							((CrawlCompanyTopDividendContext)_localctx).code = match(NUMBER);
							}
						}

						setState(408);
						match(TAB);
						setState(410); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(409);
							word();
							}
							}
							setState(412); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(414);
						match(TAB);
						setState(415);
						match(WORD);
						setState(416);
						match(TAB);
						setState(417);
						match(WORD);
						setState(418);
						match(TAB);
						setState(419);
						match(NUMBER);
						setState(420);
						match(TAB);
						setState(421);
						match(NUMBER);
						setState(422);
						match(TAB);
						setState(423);
						match(NUMBER);
						setState(424);
						match(TAB);
						setState(425);
						match(NUMBER);
						setState(426);
						match(TAB);
						setState(427);
						match(NUMBER);
						setState(428);
						match(TAB);
						setState(429);
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
					setState(434); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(436);
				match(WORD);
				setState(437);
				match(TAB);
				setState(438);
				match(WORD);
				setState(439);
				match(TAB);
				setState(440);
				match(DATE);
				setState(441);
				match(NEWLINE);
				}
				}
				setState(445); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(447);
			match(KEYWORD);
			setState(448);
			match(TAB);
			setState(449);
			match(WORD);
			setState(450);
			match(TAB);
			setState(451);
			match(WORD);
			setState(452);
			match(WORD);
			setState(453);
			match(WORD);
			setState(454);
			match(TAB);
			setState(455);
			match(WORD);
			setState(456);
			match(TAB);
			setState(457);
			match(WORD);
			setState(458);
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
		enterRule(_localctx, 10, RULE_crawlEtfDetailThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(KEYWORD);
			setState(461);
			match(TAB);
			setState(462);
			match(WORD);
			setState(463);
			match(WORD);
			setState(464);
			match(TAB);
			setState(465);
			match(WORD);
			setState(466);
			match(TAB);
			setState(467);
			match(WORD);
			setState(468);
			match(NEWLINE);
			setState(550); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(469);
					match(KEYWORD);
					setState(470);
					match(TAB);
					setState(471);
					((CrawlEtfDetailThreadContext)_localctx).code = match(NUMBER);
					setState(472);
					match(TAB);
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(473);
						word();
						}
						}
						setState(478);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(479);
					match(NEWLINE);
					setState(480);
					((CrawlEtfDetailThreadContext)_localctx).symbol = word();
					setState(482);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(481);
						((CrawlEtfDetailThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(485);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(484);
						((CrawlEtfDetailThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(488);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(487);
						((CrawlEtfDetailThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(491);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(490);
						((CrawlEtfDetailThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(494);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(493);
						((CrawlEtfDetailThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(497);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(496);
						((CrawlEtfDetailThreadContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(502);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(499);
						((CrawlEtfDetailThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(504);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(505);
					match(NEWLINE);
					setState(506);
					((CrawlEtfDetailThreadContext)_localctx).category = word();
					setState(508);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						setState(507);
						((CrawlEtfDetailThreadContext)_localctx).category1 = word();
						}
						break;
					}
					setState(511);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(510);
						((CrawlEtfDetailThreadContext)_localctx).category2 = word();
						}
						break;
					}
					setState(514);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						setState(513);
						((CrawlEtfDetailThreadContext)_localctx).category3 = word();
						}
						break;
					}
					setState(517);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						setState(516);
						((CrawlEtfDetailThreadContext)_localctx).category4 = word();
						}
						break;
					}
					setState(520);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						setState(519);
						((CrawlEtfDetailThreadContext)_localctx).category5 = word();
						}
						break;
					}
					setState(523);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						setState(522);
						((CrawlEtfDetailThreadContext)_localctx).category6 = word();
						}
						break;
					}
					setState(528);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(525);
						((CrawlEtfDetailThreadContext)_localctx).category7 = word();
						}
						}
						setState(530);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(531);
					match(NEWLINE);
					setState(532);
					((CrawlEtfDetailThreadContext)_localctx).ipo = match(DATE);
					setState(536);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WORD) {
						{
						{
						setState(533);
						match(WORD);
						}
						}
						setState(538);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(539);
					match(NEWLINE);
					setState(540);
					((CrawlEtfDetailThreadContext)_localctx).fee = word();
					setState(541);
					match(NEWLINE);
					setState(542);
					match(WORD);
					setState(543);
					match(TAB);
					setState(544);
					match(WORD);
					setState(545);
					match(TAB);
					setState(546);
					match(DATE);
					setState(547);
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
				setState(552); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(554);
			match(KEYWORD);
			setState(555);
			match(TAB);
			setState(556);
			match(WORD);
			setState(557);
			match(WORD);
			setState(558);
			match(TAB);
			setState(559);
			match(WORD);
			setState(560);
			match(TAB);
			setState(561);
			match(WORD);
			setState(562);
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
		enterRule(_localctx, 12, RULE_extractAllEtfFromNaver);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(564);
				match(KEYWORD);
				setState(565);
				match(TAB);
				setState(566);
				((ExtractAllEtfFromNaverContext)_localctx).code = match(WORD);
				setState(567);
				match(TAB);
				setState(568);
				((ExtractAllEtfFromNaverContext)_localctx).symbol = word();
				setState(570);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(569);
					((ExtractAllEtfFromNaverContext)_localctx).symbol1 = word();
					}
					break;
				}
				setState(573);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(572);
					((ExtractAllEtfFromNaverContext)_localctx).symbol2 = word();
					}
					break;
				}
				setState(576);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(575);
					((ExtractAllEtfFromNaverContext)_localctx).symbol3 = word();
					}
					break;
				}
				setState(579);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(578);
					((ExtractAllEtfFromNaverContext)_localctx).symbol4 = word();
					}
					break;
				}
				setState(582);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(581);
					((ExtractAllEtfFromNaverContext)_localctx).symbol5 = word();
					}
					break;
				}
				setState(585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(584);
					((ExtractAllEtfFromNaverContext)_localctx).symbol6 = word();
					}
					break;
				}
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
					{
					{
					setState(587);
					((ExtractAllEtfFromNaverContext)_localctx).symbol7 = word();
					}
					}
					setState(592);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(593);
				match(NEWLINE);

						StockParserService.extractAllEtfFromNaver(20231214
							, (((ExtractAllEtfFromNaverContext)_localctx).code!=null?((ExtractAllEtfFromNaverContext)_localctx).code.getText():null)
							, (((ExtractAllEtfFromNaverContext)_localctx).symbol!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol.start,((ExtractAllEtfFromNaverContext)_localctx).symbol.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol1!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol1.start,((ExtractAllEtfFromNaverContext)_localctx).symbol1.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol2!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol2.start,((ExtractAllEtfFromNaverContext)_localctx).symbol2.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol3!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol3.start,((ExtractAllEtfFromNaverContext)_localctx).symbol3.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol4!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol4.start,((ExtractAllEtfFromNaverContext)_localctx).symbol4.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol5!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol5.start,((ExtractAllEtfFromNaverContext)_localctx).symbol5.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol6!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol6.start,((ExtractAllEtfFromNaverContext)_localctx).symbol6.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol7!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol7.start,((ExtractAllEtfFromNaverContext)_localctx).symbol7.stop):null)
						);
					
				}
				}
				setState(598); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KEYWORD );
			setState(600);
			match(WORD);
			setState(601);
			match(TAB);
			setState(602);
			match(WORD);
			setState(603);
			match(TAB);
			setState(604);
			match(DATE);
			setState(605);
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
		enterRule(_localctx, 14, RULE_crawlDividendHistoryEtfThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(KEYWORD);
			setState(608);
			match(TAB);
			setState(609);
			match(WORD);
			setState(610);
			match(WORD);
			setState(611);
			match(WORD);
			setState(612);
			match(TAB);
			setState(613);
			match(WORD);
			setState(614);
			match(WORD);
			setState(615);
			match(WORD);
			setState(616);
			match(TAB);
			setState(617);
			match(WORD);
			setState(618);
			match(TAB);
			setState(619);
			match(WORD);
			setState(620);
			match(NEWLINE);
			setState(730); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					{
					setState(621);
					match(KEYWORD);
					setState(622);
					match(TAB);
					setState(623);
					((CrawlDividendHistoryEtfThreadContext)_localctx).code = match(NUMBER);
					setState(624);
					match(NEWLINE);
					setState(625);
					match(WORD);
					setState(626);
					match(TAB);
					setState(627);
					match(TAB);
					setState(628);
					match(WORD);
					setState(629);
					match(TAB);
					setState(630);
					match(WORD);
					setState(631);
					match(TAB);
					setState(632);
					match(WORD);
					setState(633);
					match(TAB);
					setState(634);
					match(WORD);
					setState(635);
					match(TAB);
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
					match(NEWLINE);
					setState(720); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(720);
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
								setState(645);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol = word();
								setState(647);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
								case 1:
									{
									setState(646);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol1 = word();
									}
									break;
								}
								setState(650);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
								case 1:
									{
									setState(649);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol2 = word();
									}
									break;
								}
								setState(653);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
								case 1:
									{
									setState(652);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol3 = word();
									}
									break;
								}
								setState(656);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
								case 1:
									{
									setState(655);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol4 = word();
									}
									break;
								}
								setState(659);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
								case 1:
									{
									setState(658);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol5 = word();
									}
									break;
								}
								setState(662);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
								case 1:
									{
									setState(661);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol6 = word();
									}
									break;
								}
								setState(667);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
									{
									{
									setState(664);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol7 = word();
									}
									}
									setState(669);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(670);
								match(TAB);
								setState(671);
								match(TAB);
								setState(672);
								match(WORD);
								setState(673);
								match(TAB);
								setState(677);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
									{
									{
									setState(674);
									word();
									}
									}
									setState(679);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(680);
								match(TAB);
								setState(682);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(681);
									((CrawlDividendHistoryEtfThreadContext)_localctx).base = match(DATE);
									}
								}

								setState(684);
								match(TAB);
								setState(686);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(685);
									((CrawlDividendHistoryEtfThreadContext)_localctx).pay = match(DATE);
									}
								}

								setState(688);
								match(TAB);
								setState(690);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==WORD) {
									{
									setState(689);
									match(WORD);
									}
								}

								setState(692);
								match(TAB);
								setState(694);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(693);
									((CrawlDividendHistoryEtfThreadContext)_localctx).dividend = match(NUMBER);
									}
								}

								setState(696);
								match(TAB);
								setState(698);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(697);
									((CrawlDividendHistoryEtfThreadContext)_localctx).price = match(NUMBER);
									}
								}

								setState(700);
								match(TAB);
								setState(702);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(701);
									((CrawlDividendHistoryEtfThreadContext)_localctx).ratio = match(NUMBER);
									}
								}

								setState(704);
								match(TAB);
								setState(705);
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
								setState(709);
								match(TAB);
								setState(710);
								match(TAB);
								setState(711);
								match(TAB);
								setState(712);
								match(TAB);
								setState(713);
								match(TAB);
								setState(714);
								match(TAB);
								setState(715);
								match(TAB);
								setState(716);
								match(TAB);
								setState(717);
								match(TAB);
								setState(718);
								match(TAB);
								setState(719);
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
						setState(722); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(724);
					match(WORD);
					setState(725);
					match(TAB);
					setState(726);
					match(WORD);
					setState(727);
					match(TAB);
					setState(728);
					match(DATE);
					setState(729);
					match(NEWLINE);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(732); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(734);
			match(KEYWORD);
			setState(735);
			match(TAB);
			setState(736);
			match(WORD);
			setState(737);
			match(WORD);
			setState(738);
			match(WORD);
			setState(739);
			match(TAB);
			setState(740);
			match(WORD);
			setState(741);
			match(WORD);
			setState(742);
			match(WORD);
			setState(743);
			match(TAB);
			setState(744);
			match(WORD);
			setState(745);
			match(TAB);
			setState(746);
			match(WORD);
			setState(747);
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
		enterRule(_localctx, 16, RULE_extractItemDetailsEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			((ExtractItemDetailsEtfContext)_localctx).symbol = word();
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(750);
				((ExtractItemDetailsEtfContext)_localctx).symbol1 = word();
				}
				break;
			}
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(753);
				((ExtractItemDetailsEtfContext)_localctx).symbol2 = word();
				}
				break;
			}
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(756);
				((ExtractItemDetailsEtfContext)_localctx).symbol3 = word();
				}
				break;
			}
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(759);
				((ExtractItemDetailsEtfContext)_localctx).symbol4 = word();
				}
				break;
			}
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(762);
				((ExtractItemDetailsEtfContext)_localctx).symbol5 = word();
				}
				break;
			}
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(765);
				((ExtractItemDetailsEtfContext)_localctx).symbol6 = word();
				}
				break;
			}
			setState(771);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(768);
					((ExtractItemDetailsEtfContext)_localctx).symbol7 = word();
					}
					} 
				}
				setState(773);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
			setState(774);
			((ExtractItemDetailsEtfContext)_localctx).code = match(NUMBER);
			setState(775);
			match(NEWLINE);
			setState(776);
			match(WORD);
			setState(777);
			((ExtractItemDetailsEtfContext)_localctx).ckospi = match(WORD);
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(778);
				((ExtractItemDetailsEtfContext)_localctx).cwics = match(WORD);
				}
			}

			setState(781);
			match(TAB);
			setState(782);
			match(NEWLINE);
			setState(783);
			match(WORD);
			setState(784);
			match(TAB);
			setState(785);
			((ExtractItemDetailsEtfContext)_localctx).currentPrice = match(WORD);
			setState(786);
			match(WORD);
			setState(787);
			match(WORD);
			setState(788);
			match(WORD);
			setState(789);
			match(WORD);
			setState(790);
			match(TAB);
			setState(791);
			match(NEWLINE);
			setState(792);
			match(WORD);
			setState(793);
			match(TAB);
			setState(794);
			((ExtractItemDetailsEtfContext)_localctx).volumeOfListedShares = match(NUMBER);
			setState(795);
			match(TAB);
			setState(796);
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
		enterRule(_localctx, 18, RULE_extractlDividendHistory);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(KEYWORD);
			setState(800);
			match(TAB);
			setState(801);
			match(WORD);
			setState(802);
			match(WORD);
			setState(803);
			match(WORD);
			setState(804);
			match(TAB);
			setState(805);
			match(WORD);
			setState(806);
			match(TAB);
			setState(807);
			match(WORD);
			setState(808);
			match(NEWLINE);
			setState(943); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(809);
					match(KEYWORD);
					setState(810);
					match(TAB);
					setState(811);
					((ExtractlDividendHistoryContext)_localctx).code = match(NUMBER);
					setState(812);
					match(TAB);
					setState(814); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(813);
						word();
						}
						}
						setState(816); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
					setState(818);
					match(NEWLINE);
					setState(819);
					match(WORD);
					setState(820);
					match(TAB);
					setState(821);
					match(WORD);
					setState(822);
					match(NEWLINE);
					setState(823);
					match(WORD);
					setState(824);
					match(TAB);
					setState(825);
					match(WORD);
					setState(826);
					match(NEWLINE);
					setState(827);
					match(WORD);
					setState(828);
					match(TAB);
					setState(829);
					match(WORD);
					setState(830);
					match(TAB);
					setState(831);
					match(WORD);
					setState(832);
					match(TAB);
					setState(833);
					match(WORD);
					setState(834);
					match(TAB);
					setState(835);
					match(WORD);
					setState(836);
					match(TAB);
					setState(837);
					match(WORD);
					setState(838);
					match(TAB);
					setState(839);
					match(WORD);
					setState(840);
					match(TAB);
					setState(841);
					match(WORD);
					setState(842);
					match(TAB);
					setState(843);
					match(WORD);
					setState(844);
					match(TAB);
					setState(845);
					match(WORD);
					setState(846);
					match(TAB);
					setState(847);
					match(WORD);
					setState(848);
					match(TAB);
					setState(849);
					match(WORD);
					setState(850);
					match(TAB);
					setState(851);
					match(NEWLINE);
					setState(852);
					match(WORD);
					setState(853);
					match(TAB);
					setState(854);
					match(WORD);
					setState(855);
					match(TAB);
					setState(856);
					match(WORD);
					setState(857);
					match(TAB);
					setState(858);
					match(WORD);
					setState(859);
					match(TAB);
					setState(860);
					match(WORD);
					setState(861);
					match(TAB);
					setState(862);
					match(WORD);
					setState(863);
					match(TAB);
					setState(864);
					match(NEWLINE);
					setState(932); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						setState(932);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case TAB:
							{
							{
							setState(865);
							match(TAB);
							setState(866);
							match(TAB);
							setState(867);
							match(TAB);
							setState(868);
							match(TAB);
							setState(869);
							match(TAB);
							setState(870);
							match(TAB);
							setState(871);
							match(TAB);
							setState(872);
							match(TAB);
							setState(873);
							match(TAB);
							setState(874);
							match(TAB);
							setState(875);
							match(TAB);
							setState(876);
							match(TAB);
							setState(877);
							match(TAB);
							setState(878);
							match(TAB);
							setState(879);
							match(TAB);
							setState(880);
							match(TAB);
							setState(881);
							match(TAB);
							setState(882);
							match(NEWLINE);
							}
							}
							break;
						case DATE:
							{
							{
							setState(883);
							((ExtractlDividendHistoryContext)_localctx).base = match(DATE);
							setState(884);
							match(TAB);
							setState(886);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==DATE) {
								{
								setState(885);
								((ExtractlDividendHistoryContext)_localctx).pay = match(DATE);
								}
							}

							setState(888);
							match(TAB);
							setState(890);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==DATE) {
								{
								setState(889);
								match(DATE);
								}
							}

							setState(892);
							match(TAB);
							setState(893);
							match(NUMBER);
							setState(894);
							match(TAB);
							setState(896); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(895);
								((ExtractlDividendHistoryContext)_localctx).symbol = word();
								}
								}
								setState(898); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
							setState(900);
							match(TAB);
							setState(901);
							match(WORD);
							setState(902);
							match(TAB);
							setState(903);
							match(WORD);
							setState(904);
							match(TAB);
							setState(905);
							match(WORD);
							setState(906);
							match(TAB);
							setState(907);
							match(WORD);
							setState(908);
							match(TAB);
							setState(909);
							((ExtractlDividendHistoryContext)_localctx).dividend = match(NUMBER);
							setState(910);
							match(TAB);
							setState(912);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NUMBER) {
								{
								setState(911);
								match(NUMBER);
								}
							}

							setState(914);
							match(TAB);
							setState(915);
							match(NUMBER);
							setState(916);
							match(TAB);
							setState(917);
							match(NUMBER);
							setState(918);
							match(TAB);
							setState(920);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NUMBER) {
								{
								setState(919);
								match(NUMBER);
								}
							}

							setState(922);
							match(TAB);
							setState(923);
							match(TAB);
							setState(924);
							match(NUMBER);
							setState(925);
							match(TAB);
							setState(926);
							match(NUMBER);
							setState(927);
							match(TAB);
							setState(928);
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
						setState(934); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TAB || _la==DATE );
					setState(936);
					match(WORD);
					setState(937);
					match(TAB);
					setState(938);
					match(WORD);
					setState(939);
					match(TAB);
					setState(940);
					match(DATE);
					setState(941);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(945); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(947);
			match(KEYWORD);
			setState(948);
			match(TAB);
			setState(949);
			match(WORD);
			setState(950);
			match(WORD);
			setState(951);
			match(WORD);
			setState(952);
			match(TAB);
			setState(953);
			match(WORD);
			setState(954);
			match(TAB);
			setState(955);
			match(WORD);
			setState(956);
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
		enterRule(_localctx, 20, RULE_extractTextStockPrice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			match(KEYWORD);
			setState(959);
			match(TAB);
			setState(960);
			match(WORD);
			setState(961);
			match(WORD);
			setState(962);
			match(WORD);
			setState(963);
			match(TAB);
			setState(964);
			match(WORD);
			setState(965);
			match(TAB);
			setState(966);
			match(WORD);
			setState(967);
			match(NEWLINE);
			setState(1021); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(968);
				((ExtractTextStockPriceContext)_localctx).code = match(NUMBER);
				setState(969);
				match(TAB);
				setState(971); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(970);
					word();
					}
					}
					setState(973); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(975);
				match(NEWLINE);
				setState(976);
				match(WORD);
				setState(977);
				match(TAB);
				setState(978);
				match(WORD);
				setState(979);
				match(TAB);
				setState(980);
				match(WORD);
				setState(981);
				match(TAB);
				setState(982);
				match(WORD);
				setState(983);
				match(TAB);
				setState(984);
				match(WORD);
				setState(985);
				match(TAB);
				setState(986);
				match(WORD);
				setState(987);
				match(TAB);
				setState(988);
				match(WORD);
				setState(989);
				match(TAB);
				setState(990);
				match(NEWLINE);
				setState(1010); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1010);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAB:
						{
						{
						setState(991);
						match(TAB);
						setState(992);
						match(NEWLINE);
						}
						}
						break;
					case DATE:
						{
						{
						setState(993);
						((ExtractTextStockPriceContext)_localctx).DATE = match(DATE);
						setState(994);
						match(TAB);
						setState(995);
						((ExtractTextStockPriceContext)_localctx).closing = match(NUMBER);
						setState(996);
						match(TAB);
						setState(997);
						match(NUMBER);
						setState(998);
						match(TAB);
						setState(999);
						((ExtractTextStockPriceContext)_localctx).market = match(NUMBER);
						setState(1000);
						match(TAB);
						setState(1001);
						((ExtractTextStockPriceContext)_localctx).high = match(NUMBER);
						setState(1002);
						match(TAB);
						setState(1003);
						((ExtractTextStockPriceContext)_localctx).low = match(NUMBER);
						setState(1004);
						match(TAB);
						setState(1005);
						((ExtractTextStockPriceContext)_localctx).volume = match(NUMBER);
						setState(1006);
						match(TAB);
						setState(1007);
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
					setState(1012); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TAB || _la==DATE );
				setState(1014);
				match(WORD);
				setState(1015);
				match(TAB);
				setState(1016);
				match(WORD);
				setState(1017);
				match(TAB);
				setState(1018);
				((ExtractTextStockPriceContext)_localctx).DATE = match(DATE);
				setState(1019);
				match(NEWLINE);
				}
				}
				setState(1023); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(1025);
			match(KEYWORD);
			setState(1026);
			match(TAB);
			setState(1027);
			match(WORD);
			setState(1028);
			match(WORD);
			setState(1029);
			match(WORD);
			setState(1030);
			match(TAB);
			setState(1031);
			match(WORD);
			setState(1032);
			match(TAB);
			setState(1033);
			match(WORD);
			setState(1034);
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
		enterRule(_localctx, 22, RULE_seibroDividend);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1037); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1036);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1039); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1041);
			match(WORD);
			setState(1042);
			match(WORD);
			setState(1043);
			match(WORD);
			setState(1044);
			match(WORD);
			setState(1045);
			match(WORD);
			setState(1046);
			match(WORD);
			setState(1047);
			match(NEWLINE);
			setState(1049); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1048);
					seibroDividendItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1051); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1053);
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
		enterRule(_localctx, 24, RULE_seibroDividendItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			((SeibroDividendItemContext)_localctx).base = match(DATE);
			setState(1056);
			match(NEWLINE);
			setState(1059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1057);
				((SeibroDividendItemContext)_localctx).pay = match(DATE);
				setState(1058);
				match(NEWLINE);
				}
				break;
			}
			setState(1061);
			((SeibroDividendItemContext)_localctx).code = word();
			setState(1062);
			match(NEWLINE);
			setState(1063);
			((SeibroDividendItemContext)_localctx).symbol = word();
			setState(1067);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(1064);
				word();
				}
				}
				setState(1069);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1070);
			match(NEWLINE);
			setState(1071);
			match(WORD);
			setState(1072);
			match(NEWLINE);
			setState(1073);
			match(WORD);
			setState(1074);
			match(NEWLINE);
			setState(1075);
			match(WORD);
			setState(1076);
			match(NEWLINE);
			setState(1077);
			match(WORD);
			setState(1078);
			match(NEWLINE);
			setState(1079);
			((SeibroDividendItemContext)_localctx).dividend = match(NUMBER);
			setState(1080);
			match(NEWLINE);
			setState(1081);
			match(NUMBER);
			setState(1082);
			match(NEWLINE);
			setState(1083);
			match(NUMBER);
			setState(1084);
			match(NEWLINE);
			setState(1085);
			match(NUMBER);
			setState(1086);
			match(NEWLINE);
			setState(1087);
			match(NUMBER);
			setState(1088);
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
		enterRule(_localctx, 26, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
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
		enterRule(_localctx, 28, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1095);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(1093);
					word();
					}
					break;
				case TAB:
					{
					setState(1094);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1097); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(1099);
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
		enterRule(_localctx, 30, RULE_eof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1104);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(1101);
					word();
					}
					break;
				case TAB:
					{
					setState(1102);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(1103);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1106); 
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
		"\u0004\u0001\n\u0455\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000+\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001;\b\u0001\u000b\u0001\f\u0001<\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001[\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001_\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001c\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001g\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001q\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001v\b\u0001\u000b\u0001\f\u0001w\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u0081"+
		"\b\u0001\u000b\u0001\f\u0001\u0082\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002"+
		"\u009f\b\u0002\u000b\u0002\f\u0002\u00a0\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0004\u0002\u00cb\b\u0002\u000b\u0002\f\u0002\u00cc"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0004\u0002\u00d6\b\u0002\u000b\u0002\f\u0002\u00d7\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00f7"+
		"\b\u0003\u0001\u0003\u0003\u0003\u00fa\b\u0003\u0001\u0003\u0003\u0003"+
		"\u00fd\b\u0003\u0001\u0003\u0003\u0003\u0100\b\u0003\u0001\u0003\u0003"+
		"\u0003\u0103\b\u0003\u0001\u0003\u0003\u0003\u0106\b\u0003\u0001\u0003"+
		"\u0005\u0003\u0109\b\u0003\n\u0003\f\u0003\u010c\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0112\b\u0003\u0001\u0003\u0003"+
		"\u0003\u0115\b\u0003\u0001\u0003\u0003\u0003\u0118\b\u0003\u0001\u0003"+
		"\u0003\u0003\u011b\b\u0003\u0001\u0003\u0003\u0003\u011e\b\u0003\u0001"+
		"\u0003\u0003\u0003\u0121\b\u0003\u0001\u0003\u0003\u0003\u0124\b\u0003"+
		"\u0001\u0003\u0005\u0003\u0127\b\u0003\n\u0003\f\u0003\u012a\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0130\b\u0003\u0001"+
		"\u0003\u0003\u0003\u0133\b\u0003\u0001\u0003\u0003\u0003\u0136\b\u0003"+
		"\u0001\u0003\u0003\u0003\u0139\b\u0003\u0001\u0003\u0003\u0003\u013c\b"+
		"\u0003\u0001\u0003\u0003\u0003\u013f\b\u0003\u0001\u0003\u0003\u0003\u0142"+
		"\b\u0003\u0001\u0003\u0005\u0003\u0145\b\u0003\n\u0003\f\u0003\u0148\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0004\u0003\u015c\b\u0003\u000b\u0003\f\u0003\u015d\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u0197\b\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u019b\b"+
		"\u0004\u000b\u0004\f\u0004\u019c\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u01b1\b\u0004\u000b\u0004\f"+
		"\u0004\u01b2\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004\u01bc\b\u0004\u000b\u0004\f\u0004"+
		"\u01bd\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u01db\b\u0005\n"+
		"\u0005\f\u0005\u01de\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u01e3\b\u0005\u0001\u0005\u0003\u0005\u01e6\b\u0005\u0001\u0005"+
		"\u0003\u0005\u01e9\b\u0005\u0001\u0005\u0003\u0005\u01ec\b\u0005\u0001"+
		"\u0005\u0003\u0005\u01ef\b\u0005\u0001\u0005\u0003\u0005\u01f2\b\u0005"+
		"\u0001\u0005\u0005\u0005\u01f5\b\u0005\n\u0005\f\u0005\u01f8\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u01fd\b\u0005\u0001\u0005\u0003"+
		"\u0005\u0200\b\u0005\u0001\u0005\u0003\u0005\u0203\b\u0005\u0001\u0005"+
		"\u0003\u0005\u0206\b\u0005\u0001\u0005\u0003\u0005\u0209\b\u0005\u0001"+
		"\u0005\u0003\u0005\u020c\b\u0005\u0001\u0005\u0005\u0005\u020f\b\u0005"+
		"\n\u0005\f\u0005\u0212\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u0217\b\u0005\n\u0005\f\u0005\u021a\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u0227\b\u0005\u000b\u0005"+
		"\f\u0005\u0228\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u023b\b\u0006\u0001\u0006\u0003\u0006\u023e\b\u0006\u0001\u0006\u0003"+
		"\u0006\u0241\b\u0006\u0001\u0006\u0003\u0006\u0244\b\u0006\u0001\u0006"+
		"\u0003\u0006\u0247\b\u0006\u0001\u0006\u0003\u0006\u024a\b\u0006\u0001"+
		"\u0006\u0005\u0006\u024d\b\u0006\n\u0006\f\u0006\u0250\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0004\u0006\u0255\b\u0006\u000b\u0006\f\u0006"+
		"\u0256\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0288\b\u0007\u0001\u0007\u0003\u0007\u028b\b\u0007\u0001\u0007"+
		"\u0003\u0007\u028e\b\u0007\u0001\u0007\u0003\u0007\u0291\b\u0007\u0001"+
		"\u0007\u0003\u0007\u0294\b\u0007\u0001\u0007\u0003\u0007\u0297\b\u0007"+
		"\u0001\u0007\u0005\u0007\u029a\b\u0007\n\u0007\f\u0007\u029d\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u02a4"+
		"\b\u0007\n\u0007\f\u0007\u02a7\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u02ab\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02af\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u02b3\b\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u02b7\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02bb\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u02bf\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007\u02d1\b\u0007\u000b\u0007\f\u0007"+
		"\u02d2\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0004\u0007\u02db\b\u0007\u000b\u0007\f\u0007\u02dc\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u02f0\b\b\u0001\b\u0003"+
		"\b\u02f3\b\b\u0001\b\u0003\b\u02f6\b\b\u0001\b\u0003\b\u02f9\b\b\u0001"+
		"\b\u0003\b\u02fc\b\b\u0001\b\u0003\b\u02ff\b\b\u0001\b\u0005\b\u0302\b"+
		"\b\n\b\f\b\u0305\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u030c"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u032f\b\t\u000b"+
		"\t\f\t\u0330\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0377\b\t\u0001"+
		"\t\u0001\t\u0003\t\u037b\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u0381"+
		"\b\t\u000b\t\f\t\u0382\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0391\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0399\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004"+
		"\t\u03a5\b\t\u000b\t\f\t\u03a6\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0004\t\u03b0\b\t\u000b\t\f\t\u03b1\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0004\n\u03cc\b\n\u000b\n\f\n\u03cd\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u03f3"+
		"\b\n\u000b\n\f\n\u03f4\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0004\n\u03fe\b\n\u000b\n\f\n\u03ff\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0004\u000b\u040e\b\u000b\u000b\u000b\f\u000b\u040f\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0004\u000b\u041a\b\u000b\u000b\u000b\f\u000b\u041b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0424\b\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u042a\b\f\n\f\f\f\u042d\t\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0004\u000e\u0448\b"+
		"\u000e\u000b\u000e\f\u000e\u0449\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0004\u000f\u0451\b\u000f\u000b\u000f\f\u000f\u0452"+
		"\u0001\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0001\u0001\u0000\u0005"+
		"\n\u04be\u0000*\u0001\u0000\u0000\u0000\u0002,\u0001\u0000\u0000\u0000"+
		"\u0004\u0090\u0001\u0000\u0000\u0000\u0006\u00e5\u0001\u0000\u0000\u0000"+
		"\b\u016b\u0001\u0000\u0000\u0000\n\u01cc\u0001\u0000\u0000\u0000\f\u0254"+
		"\u0001\u0000\u0000\u0000\u000e\u025f\u0001\u0000\u0000\u0000\u0010\u02ed"+
		"\u0001\u0000\u0000\u0000\u0012\u031f\u0001\u0000\u0000\u0000\u0014\u03be"+
		"\u0001\u0000\u0000\u0000\u0016\u040d\u0001\u0000\u0000\u0000\u0018\u041f"+
		"\u0001\u0000\u0000\u0000\u001a\u0443\u0001\u0000\u0000\u0000\u001c\u0447"+
		"\u0001\u0000\u0000\u0000\u001e\u0450\u0001\u0000\u0000\u0000 +\u0003\u0014"+
		"\n\u0000!+\u0003\u0012\t\u0000\"+\u0003\u0016\u000b\u0000#+\u0003\u000e"+
		"\u0007\u0000$+\u0003\f\u0006\u0000%+\u0003\n\u0005\u0000&+\u0003\b\u0004"+
		"\u0000\'+\u0003\u0006\u0003\u0000(+\u0003\u0004\u0002\u0000)+\u0003\u0002"+
		"\u0001\u0000* \u0001\u0000\u0000\u0000*!\u0001\u0000\u0000\u0000*\"\u0001"+
		"\u0000\u0000\u0000*#\u0001\u0000\u0000\u0000*$\u0001\u0000\u0000\u0000"+
		"*%\u0001\u0000\u0000\u0000*&\u0001\u0000\u0000\u0000*\'\u0001\u0000\u0000"+
		"\u0000*(\u0001\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000+\u0001\u0001"+
		"\u0000\u0000\u0000,-\u0005\u0005\u0000\u0000-.\u0005\u0003\u0000\u0000"+
		"./\u0005\n\u0000\u0000/0\u0005\n\u0000\u000001\u0005\u0003\u0000\u0000"+
		"12\u0005\n\u0000\u000023\u0005\u0003\u0000\u000034\u0005\n\u0000\u0000"+
		"45\u0005\u0003\u0000\u000056\u0005\n\u0000\u00006\u0080\u0005\u0004\u0000"+
		"\u000078\u0005\b\u0000\u00008:\u0005\u0003\u0000\u00009;\u0003\u001a\r"+
		"\u0000:9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0005"+
		"\u0004\u0000\u0000?@\u0005\n\u0000\u0000@A\u0005\u0003\u0000\u0000AB\u0005"+
		"\n\u0000\u0000BC\u0005\u0003\u0000\u0000CD\u0005\n\u0000\u0000DE\u0005"+
		"\u0003\u0000\u0000EF\u0005\n\u0000\u0000FG\u0005\u0003\u0000\u0000GH\u0005"+
		"\n\u0000\u0000HI\u0005\u0003\u0000\u0000IJ\u0005\n\u0000\u0000JK\u0005"+
		"\u0003\u0000\u0000KL\u0005\n\u0000\u0000LM\u0005\u0003\u0000\u0000MN\u0005"+
		"\n\u0000\u0000NO\u0005\u0003\u0000\u0000Ou\u0005\u0004\u0000\u0000PQ\u0005"+
		"\u0003\u0000\u0000QR\u0005\u0003\u0000\u0000RS\u0005\u0003\u0000\u0000"+
		"ST\u0005\u0003\u0000\u0000TU\u0005\u0003\u0000\u0000UV\u0005\u0003\u0000"+
		"\u0000VW\u0005\u0003\u0000\u0000WX\u0005\u0003\u0000\u0000Xv\u0005\u0004"+
		"\u0000\u0000Y[\u0005\u0006\u0000\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0005\u0003\u0000\u0000"+
		"]_\u0005\b\u0000\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`b\u0005\u0003\u0000\u0000ac\u0005\b\u0000\u0000"+
		"ba\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000df\u0005\u0003\u0000\u0000eg\u0005\b\u0000\u0000fe\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005\u0003"+
		"\u0000\u0000ij\u0005\b\u0000\u0000jk\u0005\u0003\u0000\u0000kl\u0005\b"+
		"\u0000\u0000lm\u0005\u0003\u0000\u0000mn\u0005\b\u0000\u0000np\u0005\u0003"+
		"\u0000\u0000oq\u0005\b\u0000\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0005\u0003\u0000\u0000st\u0005"+
		"\u0004\u0000\u0000tv\u0006\u0001\uffff\uffff\u0000uP\u0001\u0000\u0000"+
		"\u0000uZ\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0005"+
		"\n\u0000\u0000z{\u0005\u0003\u0000\u0000{|\u0005\n\u0000\u0000|}\u0005"+
		"\u0003\u0000\u0000}~\u0005\u0006\u0000\u0000~\u007f\u0005\u0004\u0000"+
		"\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u00807\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005\u0005\u0000\u0000\u0085\u0086\u0005\u0003\u0000\u0000"+
		"\u0086\u0087\u0005\n\u0000\u0000\u0087\u0088\u0005\n\u0000\u0000\u0088"+
		"\u0089\u0005\u0003\u0000\u0000\u0089\u008a\u0005\n\u0000\u0000\u008a\u008b"+
		"\u0005\u0003\u0000\u0000\u008b\u008c\u0005\n\u0000\u0000\u008c\u008d\u0005"+
		"\u0003\u0000\u0000\u008d\u008e\u0005\n\u0000\u0000\u008e\u008f\u0005\u0004"+
		"\u0000\u0000\u008f\u0003\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0005"+
		"\u0000\u0000\u0091\u0092\u0005\u0003\u0000\u0000\u0092\u0093\u0005\n\u0000"+
		"\u0000\u0093\u0094\u0005\n\u0000\u0000\u0094\u0095\u0005\u0003\u0000\u0000"+
		"\u0095\u0096\u0005\n\u0000\u0000\u0096\u0097\u0005\u0003\u0000\u0000\u0097"+
		"\u0098\u0005\n\u0000\u0000\u0098\u0099\u0005\u0003\u0000\u0000\u0099\u009a"+
		"\u0005\n\u0000\u0000\u009a\u00d5\u0005\u0004\u0000\u0000\u009b\u009c\u0005"+
		"\b\u0000\u0000\u009c\u009e\u0005\u0003\u0000\u0000\u009d\u009f\u0003\u001a"+
		"\r\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0004\u0000"+
		"\u0000\u00a3\u00a4\u0005\n\u0000\u0000\u00a4\u00a5\u0005\u0003\u0000\u0000"+
		"\u00a5\u00a6\u0005\n\u0000\u0000\u00a6\u00a7\u0005\u0003\u0000\u0000\u00a7"+
		"\u00a8\u0005\n\u0000\u0000\u00a8\u00a9\u0005\u0003\u0000\u0000\u00a9\u00aa"+
		"\u0005\n\u0000\u0000\u00aa\u00ab\u0005\u0003\u0000\u0000\u00ab\u00ac\u0005"+
		"\n\u0000\u0000\u00ac\u00ad\u0005\u0003\u0000\u0000\u00ad\u00ae\u0005\n"+
		"\u0000\u0000\u00ae\u00af\u0005\u0003\u0000\u0000\u00af\u00b0\u0005\n\u0000"+
		"\u0000\u00b0\u00b1\u0005\u0003\u0000\u0000\u00b1\u00ca\u0005\u0004\u0000"+
		"\u0000\u00b2\u00b3\u0005\u0003\u0000\u0000\u00b3\u00b4\u0005\u0003\u0000"+
		"\u0000\u00b4\u00b5\u0005\u0003\u0000\u0000\u00b5\u00b6\u0005\u0003\u0000"+
		"\u0000\u00b6\u00b7\u0005\u0003\u0000\u0000\u00b7\u00b8\u0005\u0003\u0000"+
		"\u0000\u00b8\u00b9\u0005\u0003\u0000\u0000\u00b9\u00cb\u0005\u0004\u0000"+
		"\u0000\u00ba\u00bb\u0005\u0006\u0000\u0000\u00bb\u00bc\u0005\u0003\u0000"+
		"\u0000\u00bc\u00bd\u0005\b\u0000\u0000\u00bd\u00be\u0005\u0003\u0000\u0000"+
		"\u00be\u00bf\u0005\b\u0000\u0000\u00bf\u00c0\u0005\u0003\u0000\u0000\u00c0"+
		"\u00c1\u0005\b\u0000\u0000\u00c1\u00c2\u0005\u0003\u0000\u0000\u00c2\u00c3"+
		"\u0005\b\u0000\u0000\u00c3\u00c4\u0005\u0003\u0000\u0000\u00c4\u00c5\u0005"+
		"\b\u0000\u0000\u00c5\u00c6\u0005\u0003\u0000\u0000\u00c6\u00c7\u0005\b"+
		"\u0000\u0000\u00c7\u00c8\u0005\u0003\u0000\u0000\u00c8\u00c9\u0005\u0004"+
		"\u0000\u0000\u00c9\u00cb\u0006\u0002\uffff\uffff\u0000\u00ca\u00b2\u0001"+
		"\u0000\u0000\u0000\u00ca\u00ba\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005"+
		"\n\u0000\u0000\u00cf\u00d0\u0005\u0003\u0000\u0000\u00d0\u00d1\u0005\n"+
		"\u0000\u0000\u00d1\u00d2\u0005\u0003\u0000\u0000\u00d2\u00d3\u0005\u0006"+
		"\u0000\u0000\u00d3\u00d4\u0005\u0004\u0000\u0000\u00d4\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d5\u009b\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u0005"+
		"\u0000\u0000\u00da\u00db\u0005\u0003\u0000\u0000\u00db\u00dc\u0005\n\u0000"+
		"\u0000\u00dc\u00dd\u0005\n\u0000\u0000\u00dd\u00de\u0005\u0003\u0000\u0000"+
		"\u00de\u00df\u0005\n\u0000\u0000\u00df\u00e0\u0005\u0003\u0000\u0000\u00e0"+
		"\u00e1\u0005\n\u0000\u0000\u00e1\u00e2\u0005\u0003\u0000\u0000\u00e2\u00e3"+
		"\u0005\n\u0000\u0000\u00e3\u00e4\u0005\u0004\u0000\u0000\u00e4\u0005\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0005\u0005\u0000\u0000\u00e6\u00e7\u0005"+
		"\u0003\u0000\u0000\u00e7\u00e8\u0005\n\u0000\u0000\u00e8\u00e9\u0005\n"+
		"\u0000\u0000\u00e9\u00ea\u0005\u0003\u0000\u0000\u00ea\u00eb\u0005\n\u0000"+
		"\u0000\u00eb\u00ec\u0005\u0003\u0000\u0000\u00ec\u00ed\u0005\n\u0000\u0000"+
		"\u00ed\u00ee\u0005\u0003\u0000\u0000\u00ee\u00ef\u0005\n\u0000\u0000\u00ef"+
		"\u015b\u0005\u0004\u0000\u0000\u00f0\u00f1\u0005\u0005\u0000\u0000\u00f1"+
		"\u00f2\u0005\u0003\u0000\u0000\u00f2\u00f3\u0005\b\u0000\u0000\u00f3\u00f4"+
		"\u0005\u0003\u0000\u0000\u00f4\u00f6\u0003\u001a\r\u0000\u00f5\u00f7\u0003"+
		"\u001a\r\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00fa\u0003\u001a"+
		"\r\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00fd\u0003\u001a\r\u0000"+
		"\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u0100\u0003\u001a\r\u0000\u00ff"+
		"\u00fe\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100"+
		"\u0102\u0001\u0000\u0000\u0000\u0101\u0103\u0003\u001a\r\u0000\u0102\u0101"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0105"+
		"\u0001\u0000\u0000\u0000\u0104\u0106\u0003\u001a\r\u0000\u0105\u0104\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u010a\u0001"+
		"\u0000\u0000\u0000\u0107\u0109\u0003\u001a\r\u0000\u0108\u0107\u0001\u0000"+
		"\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010d\u0001\u0000"+
		"\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u0004"+
		"\u0000\u0000\u010e\u010f\u0005\u0005\u0000\u0000\u010f\u0111\u0005\u0003"+
		"\u0000\u0000\u0110\u0112\u0003\u001a\r\u0000\u0111\u0110\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0114\u0001\u0000\u0000"+
		"\u0000\u0113\u0115\u0003\u001a\r\u0000\u0114\u0113\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000"+
		"\u0116\u0118\u0003\u001a\r\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0001\u0000\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119"+
		"\u011b\u0003\u001a\r\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0001\u0000\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u011e"+
		"\u0003\u001a\r\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011d\u011e\u0001"+
		"\u0000\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u0121\u0003"+
		"\u001a\r\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000"+
		"\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u0124\u0003\u001a"+
		"\r\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000"+
		"\u0000\u0124\u0128\u0001\u0000\u0000\u0000\u0125\u0127\u0003\u001a\r\u0000"+
		"\u0126\u0125\u0001\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000"+
		"\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000"+
		"\u0129\u012b\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000"+
		"\u012b\u012c\u0005\u0004\u0000\u0000\u012c\u012d\u0005\u0005\u0000\u0000"+
		"\u012d\u012f\u0005\u0003\u0000\u0000\u012e\u0130\u0003\u001a\r\u0000\u012f"+
		"\u012e\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130"+
		"\u0132\u0001\u0000\u0000\u0000\u0131\u0133\u0003\u001a\r\u0000\u0132\u0131"+
		"\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0135"+
		"\u0001\u0000\u0000\u0000\u0134\u0136\u0003\u001a\r\u0000\u0135\u0134\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0138\u0001"+
		"\u0000\u0000\u0000\u0137\u0139\u0003\u001a\r\u0000\u0138\u0137\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013b\u0001\u0000"+
		"\u0000\u0000\u013a\u013c\u0003\u001a\r\u0000\u013b\u013a\u0001\u0000\u0000"+
		"\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013e\u0001\u0000\u0000"+
		"\u0000\u013d\u013f\u0003\u001a\r\u0000\u013e\u013d\u0001\u0000\u0000\u0000"+
		"\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0141\u0001\u0000\u0000\u0000"+
		"\u0140\u0142\u0003\u001a\r\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0141"+
		"\u0142\u0001\u0000\u0000\u0000\u0142\u0146\u0001\u0000\u0000\u0000\u0143"+
		"\u0145\u0003\u001a\r\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0145\u0148"+
		"\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u0001\u0000\u0000\u0000\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u0146"+
		"\u0001\u0000\u0000\u0000\u0149\u014a\u0005\u0004\u0000\u0000\u014a\u014b"+
		"\u0005\u0005\u0000\u0000\u014b\u014c\u0005\u0003\u0000\u0000\u014c\u014d"+
		"\u0005\b\u0000\u0000\u014d\u014e\u0005\n\u0000\u0000\u014e\u014f\u0005"+
		"\u0004\u0000\u0000\u014f\u0150\u0005\u0005\u0000\u0000\u0150\u0151\u0005"+
		"\u0003\u0000\u0000\u0151\u0152\u0005\u0006\u0000\u0000\u0152\u0153\u0005"+
		"\u0004\u0000\u0000\u0153\u0154\u0005\n\u0000\u0000\u0154\u0155\u0005\u0003"+
		"\u0000\u0000\u0155\u0156\u0005\n\u0000\u0000\u0156\u0157\u0005\u0003\u0000"+
		"\u0000\u0157\u0158\u0005\u0006\u0000\u0000\u0158\u0159\u0005\u0004\u0000"+
		"\u0000\u0159\u015a\u0006\u0003\uffff\uffff\u0000\u015a\u015c\u0001\u0000"+
		"\u0000\u0000\u015b\u00f0\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000"+
		"\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0160\u0005\u0005"+
		"\u0000\u0000\u0160\u0161\u0005\u0003\u0000\u0000\u0161\u0162\u0005\n\u0000"+
		"\u0000\u0162\u0163\u0005\n\u0000\u0000\u0163\u0164\u0005\u0003\u0000\u0000"+
		"\u0164\u0165\u0005\n\u0000\u0000\u0165\u0166\u0005\u0003\u0000\u0000\u0166"+
		"\u0167\u0005\n\u0000\u0000\u0167\u0168\u0005\u0003\u0000\u0000\u0168\u0169"+
		"\u0005\n\u0000\u0000\u0169\u016a\u0005\u0004\u0000\u0000\u016a\u0007\u0001"+
		"\u0000\u0000\u0000\u016b\u016c\u0005\u0005\u0000\u0000\u016c\u016d\u0005"+
		"\u0003\u0000\u0000\u016d\u016e\u0005\n\u0000\u0000\u016e\u016f\u0005\u0003"+
		"\u0000\u0000\u016f\u0170\u0005\n\u0000\u0000\u0170\u0171\u0005\n\u0000"+
		"\u0000\u0171\u0172\u0005\n\u0000\u0000\u0172\u0173\u0005\u0003\u0000\u0000"+
		"\u0173\u0174\u0005\n\u0000\u0000\u0174\u0175\u0005\u0003\u0000\u0000\u0175"+
		"\u0176\u0005\n\u0000\u0000\u0176\u01bb\u0005\u0004\u0000\u0000\u0177\u0178"+
		"\u0005\n\u0000\u0000\u0178\u0179\u0005\u0003\u0000\u0000\u0179\u017a\u0005"+
		"\u0004\u0000\u0000\u017a\u017b\u0005\n\u0000\u0000\u017b\u017c\u0005\u0003"+
		"\u0000\u0000\u017c\u017d\u0005\n\u0000\u0000\u017d\u017e\u0005\u0003\u0000"+
		"\u0000\u017e\u017f\u0005\n\u0000\u0000\u017f\u0180\u0005\u0003\u0000\u0000"+
		"\u0180\u0181\u0005\n\u0000\u0000\u0181\u0182\u0005\u0003\u0000\u0000\u0182"+
		"\u0183\u0005\n\u0000\u0000\u0183\u0184\u0005\u0003\u0000\u0000\u0184\u0185"+
		"\u0005\n\u0000\u0000\u0185\u0186\u0005\u0003\u0000\u0000\u0186\u0187\u0005"+
		"\n\u0000\u0000\u0187\u0188\u0005\u0003\u0000\u0000\u0188\u0189\u0005\n"+
		"\u0000\u0000\u0189\u018a\u0005\u0003\u0000\u0000\u018a\u018b\u0005\n\u0000"+
		"\u0000\u018b\u018c\u0005\u0003\u0000\u0000\u018c\u018d\u0005\n\u0000\u0000"+
		"\u018d\u018e\u0005\u0003\u0000\u0000\u018e\u018f\u0005\n\u0000\u0000\u018f"+
		"\u0190\u0005\u0003\u0000\u0000\u0190\u01b0\u0005\u0004\u0000\u0000\u0191"+
		"\u0192\u0005\n\u0000\u0000\u0192\u0193\u0005\u0003\u0000\u0000\u0193\u0194"+
		"\u0005\b\u0000\u0000\u0194\u0196\u0005\u0003\u0000\u0000\u0195\u0197\u0005"+
		"\b\u0000\u0000\u0196\u0195\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000"+
		"\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u019a\u0005\u0003"+
		"\u0000\u0000\u0199\u019b\u0003\u001a\r\u0000\u019a\u0199\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000"+
		"\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000"+
		"\u0000\u019e\u019f\u0005\u0003\u0000\u0000\u019f\u01a0\u0005\n\u0000\u0000"+
		"\u01a0\u01a1\u0005\u0003\u0000\u0000\u01a1\u01a2\u0005\n\u0000\u0000\u01a2"+
		"\u01a3\u0005\u0003\u0000\u0000\u01a3\u01a4\u0005\b\u0000\u0000\u01a4\u01a5"+
		"\u0005\u0003\u0000\u0000\u01a5\u01a6\u0005\b\u0000\u0000\u01a6\u01a7\u0005"+
		"\u0003\u0000\u0000\u01a7\u01a8\u0005\b\u0000\u0000\u01a8\u01a9\u0005\u0003"+
		"\u0000\u0000\u01a9\u01aa\u0005\b\u0000\u0000\u01aa\u01ab\u0005\u0003\u0000"+
		"\u0000\u01ab\u01ac\u0005\b\u0000\u0000\u01ac\u01ad\u0005\u0003\u0000\u0000"+
		"\u01ad\u01ae\u0005\u0004\u0000\u0000\u01ae\u01af\u0006\u0004\uffff\uffff"+
		"\u0000\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0\u0191\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b5\u0005\n\u0000\u0000\u01b5\u01b6\u0005\u0003\u0000\u0000"+
		"\u01b6\u01b7\u0005\n\u0000\u0000\u01b7\u01b8\u0005\u0003\u0000\u0000\u01b8"+
		"\u01b9\u0005\u0006\u0000\u0000\u01b9\u01ba\u0005\u0004\u0000\u0000\u01ba"+
		"\u01bc\u0001\u0000\u0000\u0000\u01bb\u0177\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bd\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd"+
		"\u01be\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c0\u0005\u0005\u0000\u0000\u01c0\u01c1\u0005\u0003\u0000\u0000\u01c1"+
		"\u01c2\u0005\n\u0000\u0000\u01c2\u01c3\u0005\u0003\u0000\u0000\u01c3\u01c4"+
		"\u0005\n\u0000\u0000\u01c4\u01c5\u0005\n\u0000\u0000\u01c5\u01c6\u0005"+
		"\n\u0000\u0000\u01c6\u01c7\u0005\u0003\u0000\u0000\u01c7\u01c8\u0005\n"+
		"\u0000\u0000\u01c8\u01c9\u0005\u0003\u0000\u0000\u01c9\u01ca\u0005\n\u0000"+
		"\u0000\u01ca\u01cb\u0005\u0004\u0000\u0000\u01cb\t\u0001\u0000\u0000\u0000"+
		"\u01cc\u01cd\u0005\u0005\u0000\u0000\u01cd\u01ce\u0005\u0003\u0000\u0000"+
		"\u01ce\u01cf\u0005\n\u0000\u0000\u01cf\u01d0\u0005\n\u0000\u0000\u01d0"+
		"\u01d1\u0005\u0003\u0000\u0000\u01d1\u01d2\u0005\n\u0000\u0000\u01d2\u01d3"+
		"\u0005\u0003\u0000\u0000\u01d3\u01d4\u0005\n\u0000\u0000\u01d4\u0226\u0005"+
		"\u0004\u0000\u0000\u01d5\u01d6\u0005\u0005\u0000\u0000\u01d6\u01d7\u0005"+
		"\u0003\u0000\u0000\u01d7\u01d8\u0005\b\u0000\u0000\u01d8\u01dc\u0005\u0003"+
		"\u0000\u0000\u01d9\u01db\u0003\u001a\r\u0000\u01da\u01d9\u0001\u0000\u0000"+
		"\u0000\u01db\u01de\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000"+
		"\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01df\u0001\u0000\u0000"+
		"\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df\u01e0\u0005\u0004\u0000"+
		"\u0000\u01e0\u01e2\u0003\u001a\r\u0000\u01e1\u01e3\u0003\u001a\r\u0000"+
		"\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e5\u0001\u0000\u0000\u0000\u01e4\u01e6\u0003\u001a\r\u0000\u01e5"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e8\u0001\u0000\u0000\u0000\u01e7\u01e9\u0003\u001a\r\u0000\u01e8\u01e7"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01eb"+
		"\u0001\u0000\u0000\u0000\u01ea\u01ec\u0003\u001a\r\u0000\u01eb\u01ea\u0001"+
		"\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ee\u0001"+
		"\u0000\u0000\u0000\u01ed\u01ef\u0003\u001a\r\u0000\u01ee\u01ed\u0001\u0000"+
		"\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f0\u01f2\u0003\u001a\r\u0000\u01f1\u01f0\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f6\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f5\u0003\u001a\r\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f8\u0001\u0000\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7\u01f9\u0001\u0000\u0000\u0000"+
		"\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005\u0004\u0000\u0000"+
		"\u01fa\u01fc\u0003\u001a\r\u0000\u01fb\u01fd\u0003\u001a\r\u0000\u01fc"+
		"\u01fb\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd"+
		"\u01ff\u0001\u0000\u0000\u0000\u01fe\u0200\u0003\u001a\r\u0000\u01ff\u01fe"+
		"\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0202"+
		"\u0001\u0000\u0000\u0000\u0201\u0203\u0003\u001a\r\u0000\u0202\u0201\u0001"+
		"\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0205\u0001"+
		"\u0000\u0000\u0000\u0204\u0206\u0003\u001a\r\u0000\u0205\u0204\u0001\u0000"+
		"\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0208\u0001\u0000"+
		"\u0000\u0000\u0207\u0209\u0003\u001a\r\u0000\u0208\u0207\u0001\u0000\u0000"+
		"\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u020b\u0001\u0000\u0000"+
		"\u0000\u020a\u020c\u0003\u001a\r\u0000\u020b\u020a\u0001\u0000\u0000\u0000"+
		"\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u0210\u0001\u0000\u0000\u0000"+
		"\u020d\u020f\u0003\u001a\r\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020f"+
		"\u0212\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0210"+
		"\u0211\u0001\u0000\u0000\u0000\u0211\u0213\u0001\u0000\u0000\u0000\u0212"+
		"\u0210\u0001\u0000\u0000\u0000\u0213\u0214\u0005\u0004\u0000\u0000\u0214"+
		"\u0218\u0005\u0006\u0000\u0000\u0215\u0217\u0005\n\u0000\u0000\u0216\u0215"+
		"\u0001\u0000\u0000\u0000\u0217\u021a\u0001\u0000\u0000\u0000\u0218\u0216"+
		"\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021b"+
		"\u0001\u0000\u0000\u0000\u021a\u0218\u0001\u0000\u0000\u0000\u021b\u021c"+
		"\u0005\u0004\u0000\u0000\u021c\u021d\u0003\u001a\r\u0000\u021d\u021e\u0005"+
		"\u0004\u0000\u0000\u021e\u021f\u0005\n\u0000\u0000\u021f\u0220\u0005\u0003"+
		"\u0000\u0000\u0220\u0221\u0005\n\u0000\u0000\u0221\u0222\u0005\u0003\u0000"+
		"\u0000\u0222\u0223\u0005\u0006\u0000\u0000\u0223\u0224\u0005\u0004\u0000"+
		"\u0000\u0224\u0225\u0006\u0005\uffff\uffff\u0000\u0225\u0227\u0001\u0000"+
		"\u0000\u0000\u0226\u01d5\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000"+
		"\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000"+
		"\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u022b\u0005\u0005"+
		"\u0000\u0000\u022b\u022c\u0005\u0003\u0000\u0000\u022c\u022d\u0005\n\u0000"+
		"\u0000\u022d\u022e\u0005\n\u0000\u0000\u022e\u022f\u0005\u0003\u0000\u0000"+
		"\u022f\u0230\u0005\n\u0000\u0000\u0230\u0231\u0005\u0003\u0000\u0000\u0231"+
		"\u0232\u0005\n\u0000\u0000\u0232\u0233\u0005\u0004\u0000\u0000\u0233\u000b"+
		"\u0001\u0000\u0000\u0000\u0234\u0235\u0005\u0005\u0000\u0000\u0235\u0236"+
		"\u0005\u0003\u0000\u0000\u0236\u0237\u0005\n\u0000\u0000\u0237\u0238\u0005"+
		"\u0003\u0000\u0000\u0238\u023a\u0003\u001a\r\u0000\u0239\u023b\u0003\u001a"+
		"\r\u0000\u023a\u0239\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000"+
		"\u0000\u023b\u023d\u0001\u0000\u0000\u0000\u023c\u023e\u0003\u001a\r\u0000"+
		"\u023d\u023c\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000"+
		"\u023e\u0240\u0001\u0000\u0000\u0000\u023f\u0241\u0003\u001a\r\u0000\u0240"+
		"\u023f\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241"+
		"\u0243\u0001\u0000\u0000\u0000\u0242\u0244\u0003\u001a\r\u0000\u0243\u0242"+
		"\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u0246"+
		"\u0001\u0000\u0000\u0000\u0245\u0247\u0003\u001a\r\u0000\u0246\u0245\u0001"+
		"\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u0249\u0001"+
		"\u0000\u0000\u0000\u0248\u024a\u0003\u001a\r\u0000\u0249\u0248\u0001\u0000"+
		"\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u024e\u0001\u0000"+
		"\u0000\u0000\u024b\u024d\u0003\u001a\r\u0000\u024c\u024b\u0001\u0000\u0000"+
		"\u0000\u024d\u0250\u0001\u0000\u0000\u0000\u024e\u024c\u0001\u0000\u0000"+
		"\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024f\u0251\u0001\u0000\u0000"+
		"\u0000\u0250\u024e\u0001\u0000\u0000\u0000\u0251\u0252\u0005\u0004\u0000"+
		"\u0000\u0252\u0253\u0006\u0006\uffff\uffff\u0000\u0253\u0255\u0001\u0000"+
		"\u0000\u0000\u0254\u0234\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000"+
		"\u0000\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0256\u0257\u0001\u0000"+
		"\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258\u0259\u0005\n\u0000"+
		"\u0000\u0259\u025a\u0005\u0003\u0000\u0000\u025a\u025b\u0005\n\u0000\u0000"+
		"\u025b\u025c\u0005\u0003\u0000\u0000\u025c\u025d\u0005\u0006\u0000\u0000"+
		"\u025d\u025e\u0005\u0004\u0000\u0000\u025e\r\u0001\u0000\u0000\u0000\u025f"+
		"\u0260\u0005\u0005\u0000\u0000\u0260\u0261\u0005\u0003\u0000\u0000\u0261"+
		"\u0262\u0005\n\u0000\u0000\u0262\u0263\u0005\n\u0000\u0000\u0263\u0264"+
		"\u0005\n\u0000\u0000\u0264\u0265\u0005\u0003\u0000\u0000\u0265\u0266\u0005"+
		"\n\u0000\u0000\u0266\u0267\u0005\n\u0000\u0000\u0267\u0268\u0005\n\u0000"+
		"\u0000\u0268\u0269\u0005\u0003\u0000\u0000\u0269\u026a\u0005\n\u0000\u0000"+
		"\u026a\u026b\u0005\u0003\u0000\u0000\u026b\u026c\u0005\n\u0000\u0000\u026c"+
		"\u02da\u0005\u0004\u0000\u0000\u026d\u026e\u0005\u0005\u0000\u0000\u026e"+
		"\u026f\u0005\u0003\u0000\u0000\u026f\u0270\u0005\b\u0000\u0000\u0270\u0271"+
		"\u0005\u0004\u0000\u0000\u0271\u0272\u0005\n\u0000\u0000\u0272\u0273\u0005"+
		"\u0003\u0000\u0000\u0273\u0274\u0005\u0003\u0000\u0000\u0274\u0275\u0005"+
		"\n\u0000\u0000\u0275\u0276\u0005\u0003\u0000\u0000\u0276\u0277\u0005\n"+
		"\u0000\u0000\u0277\u0278\u0005\u0003\u0000\u0000\u0278\u0279\u0005\n\u0000"+
		"\u0000\u0279\u027a\u0005\u0003\u0000\u0000\u027a\u027b\u0005\n\u0000\u0000"+
		"\u027b\u027c\u0005\u0003\u0000\u0000\u027c\u027d\u0005\n\u0000\u0000\u027d"+
		"\u027e\u0005\u0003\u0000\u0000\u027e\u027f\u0005\n\u0000\u0000\u027f\u0280"+
		"\u0005\u0003\u0000\u0000\u0280\u0281\u0005\n\u0000\u0000\u0281\u0282\u0005"+
		"\u0003\u0000\u0000\u0282\u0283\u0005\n\u0000\u0000\u0283\u0284\u0005\u0003"+
		"\u0000\u0000\u0284\u02d0\u0005\u0004\u0000\u0000\u0285\u0287\u0003\u001a"+
		"\r\u0000\u0286\u0288\u0003\u001a\r\u0000\u0287\u0286\u0001\u0000\u0000"+
		"\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u0288\u028a\u0001\u0000\u0000"+
		"\u0000\u0289\u028b\u0003\u001a\r\u0000\u028a\u0289\u0001\u0000\u0000\u0000"+
		"\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u028d\u0001\u0000\u0000\u0000"+
		"\u028c\u028e\u0003\u001a\r\u0000\u028d\u028c\u0001\u0000\u0000\u0000\u028d"+
		"\u028e\u0001\u0000\u0000\u0000\u028e\u0290\u0001\u0000\u0000\u0000\u028f"+
		"\u0291\u0003\u001a\r\u0000\u0290\u028f\u0001\u0000\u0000\u0000\u0290\u0291"+
		"\u0001\u0000\u0000\u0000\u0291\u0293\u0001\u0000\u0000\u0000\u0292\u0294"+
		"\u0003\u001a\r\u0000\u0293\u0292\u0001\u0000\u0000\u0000\u0293\u0294\u0001"+
		"\u0000\u0000\u0000\u0294\u0296\u0001\u0000\u0000\u0000\u0295\u0297\u0003"+
		"\u001a\r\u0000\u0296\u0295\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000"+
		"\u0000\u0000\u0297\u029b\u0001\u0000\u0000\u0000\u0298\u029a\u0003\u001a"+
		"\r\u0000\u0299\u0298\u0001\u0000\u0000\u0000\u029a\u029d\u0001\u0000\u0000"+
		"\u0000\u029b\u0299\u0001\u0000\u0000\u0000\u029b\u029c\u0001\u0000\u0000"+
		"\u0000\u029c\u029e\u0001\u0000\u0000\u0000\u029d\u029b\u0001\u0000\u0000"+
		"\u0000\u029e\u029f\u0005\u0003\u0000\u0000\u029f\u02a0\u0005\u0003\u0000"+
		"\u0000\u02a0\u02a1\u0005\n\u0000\u0000\u02a1\u02a5\u0005\u0003\u0000\u0000"+
		"\u02a2\u02a4\u0003\u001a\r\u0000\u02a3\u02a2\u0001\u0000\u0000\u0000\u02a4"+
		"\u02a7\u0001\u0000\u0000\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a5"+
		"\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a8\u0001\u0000\u0000\u0000\u02a7"+
		"\u02a5\u0001\u0000\u0000\u0000\u02a8\u02aa\u0005\u0003\u0000\u0000\u02a9"+
		"\u02ab\u0005\u0006\u0000\u0000\u02aa\u02a9\u0001\u0000\u0000\u0000\u02aa"+
		"\u02ab\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac"+
		"\u02ae\u0005\u0003\u0000\u0000\u02ad\u02af\u0005\u0006\u0000\u0000\u02ae"+
		"\u02ad\u0001\u0000\u0000\u0000\u02ae\u02af\u0001\u0000\u0000\u0000\u02af"+
		"\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b2\u0005\u0003\u0000\u0000\u02b1"+
		"\u02b3\u0005\n\u0000\u0000\u02b2\u02b1\u0001\u0000\u0000\u0000\u02b2\u02b3"+
		"\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4\u02b6"+
		"\u0005\u0003\u0000\u0000\u02b5\u02b7\u0005\b\u0000\u0000\u02b6\u02b5\u0001"+
		"\u0000\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7\u02b8\u0001"+
		"\u0000\u0000\u0000\u02b8\u02ba\u0005\u0003\u0000\u0000\u02b9\u02bb\u0005"+
		"\b\u0000\u0000\u02ba\u02b9\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000"+
		"\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc\u02be\u0005\u0003"+
		"\u0000\u0000\u02bd\u02bf\u0005\b\u0000\u0000\u02be\u02bd\u0001\u0000\u0000"+
		"\u0000\u02be\u02bf\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000"+
		"\u0000\u02c0\u02c1\u0005\u0003\u0000\u0000\u02c1\u02c2\u0005\u0004\u0000"+
		"\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c4\u0006\u0007\uffff"+
		"\uffff\u0000\u02c4\u02d1\u0001\u0000\u0000\u0000\u02c5\u02c6\u0005\u0003"+
		"\u0000\u0000\u02c6\u02c7\u0005\u0003\u0000\u0000\u02c7\u02c8\u0005\u0003"+
		"\u0000\u0000\u02c8\u02c9\u0005\u0003\u0000\u0000\u02c9\u02ca\u0005\u0003"+
		"\u0000\u0000\u02ca\u02cb\u0005\u0003\u0000\u0000\u02cb\u02cc\u0005\u0003"+
		"\u0000\u0000\u02cc\u02cd\u0005\u0003\u0000\u0000\u02cd\u02ce\u0005\u0003"+
		"\u0000\u0000\u02ce\u02cf\u0005\u0003\u0000\u0000\u02cf\u02d1\u0005\u0004"+
		"\u0000\u0000\u02d0\u0285\u0001\u0000\u0000\u0000\u02d0\u02c5\u0001\u0000"+
		"\u0000\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000"+
		"\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000"+
		"\u0000\u0000\u02d4\u02d5\u0005\n\u0000\u0000\u02d5\u02d6\u0005\u0003\u0000"+
		"\u0000\u02d6\u02d7\u0005\n\u0000\u0000\u02d7\u02d8\u0005\u0003\u0000\u0000"+
		"\u02d8\u02d9\u0005\u0006\u0000\u0000\u02d9\u02db\u0005\u0004\u0000\u0000"+
		"\u02da\u026d\u0001\u0000\u0000\u0000\u02db\u02dc\u0001\u0000\u0000\u0000"+
		"\u02dc\u02da\u0001\u0000\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000"+
		"\u02dd\u02de\u0001\u0000\u0000\u0000\u02de\u02df\u0005\u0005\u0000\u0000"+
		"\u02df\u02e0\u0005\u0003\u0000\u0000\u02e0\u02e1\u0005\n\u0000\u0000\u02e1"+
		"\u02e2\u0005\n\u0000\u0000\u02e2\u02e3\u0005\n\u0000\u0000\u02e3\u02e4"+
		"\u0005\u0003\u0000\u0000\u02e4\u02e5\u0005\n\u0000\u0000\u02e5\u02e6\u0005"+
		"\n\u0000\u0000\u02e6\u02e7\u0005\n\u0000\u0000\u02e7\u02e8\u0005\u0003"+
		"\u0000\u0000\u02e8\u02e9\u0005\n\u0000\u0000\u02e9\u02ea\u0005\u0003\u0000"+
		"\u0000\u02ea\u02eb\u0005\n\u0000\u0000\u02eb\u02ec\u0005\u0004\u0000\u0000"+
		"\u02ec\u000f\u0001\u0000\u0000\u0000\u02ed\u02ef\u0003\u001a\r\u0000\u02ee"+
		"\u02f0\u0003\u001a\r\u0000\u02ef\u02ee\u0001\u0000\u0000\u0000\u02ef\u02f0"+
		"\u0001\u0000\u0000\u0000\u02f0\u02f2\u0001\u0000\u0000\u0000\u02f1\u02f3"+
		"\u0003\u001a\r\u0000\u02f2\u02f1\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001"+
		"\u0000\u0000\u0000\u02f3\u02f5\u0001\u0000\u0000\u0000\u02f4\u02f6\u0003"+
		"\u001a\r\u0000\u02f5\u02f4\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000"+
		"\u0000\u0000\u02f6\u02f8\u0001\u0000\u0000\u0000\u02f7\u02f9\u0003\u001a"+
		"\r\u0000\u02f8\u02f7\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001\u0000\u0000"+
		"\u0000\u02f9\u02fb\u0001\u0000\u0000\u0000\u02fa\u02fc\u0003\u001a\r\u0000"+
		"\u02fb\u02fa\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000"+
		"\u02fc\u02fe\u0001\u0000\u0000\u0000\u02fd\u02ff\u0003\u001a\r\u0000\u02fe"+
		"\u02fd\u0001\u0000\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000\u0000\u02ff"+
		"\u0303\u0001\u0000\u0000\u0000\u0300\u0302\u0003\u001a\r\u0000\u0301\u0300"+
		"\u0001\u0000\u0000\u0000\u0302\u0305\u0001\u0000\u0000\u0000\u0303\u0301"+
		"\u0001\u0000\u0000\u0000\u0303\u0304\u0001\u0000\u0000\u0000\u0304\u0306"+
		"\u0001\u0000\u0000\u0000\u0305\u0303\u0001\u0000\u0000\u0000\u0306\u0307"+
		"\u0005\b\u0000\u0000\u0307\u0308\u0005\u0004\u0000\u0000\u0308\u0309\u0005"+
		"\n\u0000\u0000\u0309\u030b\u0005\n\u0000\u0000\u030a\u030c\u0005\n\u0000"+
		"\u0000\u030b\u030a\u0001\u0000\u0000\u0000\u030b\u030c\u0001\u0000\u0000"+
		"\u0000\u030c\u030d\u0001\u0000\u0000\u0000\u030d\u030e\u0005\u0003\u0000"+
		"\u0000\u030e\u030f\u0005\u0004\u0000\u0000\u030f\u0310\u0005\n\u0000\u0000"+
		"\u0310\u0311\u0005\u0003\u0000\u0000\u0311\u0312\u0005\n\u0000\u0000\u0312"+
		"\u0313\u0005\n\u0000\u0000\u0313\u0314\u0005\n\u0000\u0000\u0314\u0315"+
		"\u0005\n\u0000\u0000\u0315\u0316\u0005\n\u0000\u0000\u0316\u0317\u0005"+
		"\u0003\u0000\u0000\u0317\u0318\u0005\u0004\u0000\u0000\u0318\u0319\u0005"+
		"\n\u0000\u0000\u0319\u031a\u0005\u0003\u0000\u0000\u031a\u031b\u0005\b"+
		"\u0000\u0000\u031b\u031c\u0005\u0003\u0000\u0000\u031c\u031d\u0005\u0004"+
		"\u0000\u0000\u031d\u031e\u0006\b\uffff\uffff\u0000\u031e\u0011\u0001\u0000"+
		"\u0000\u0000\u031f\u0320\u0005\u0005\u0000\u0000\u0320\u0321\u0005\u0003"+
		"\u0000\u0000\u0321\u0322\u0005\n\u0000\u0000\u0322\u0323\u0005\n\u0000"+
		"\u0000\u0323\u0324\u0005\n\u0000\u0000\u0324\u0325\u0005\u0003\u0000\u0000"+
		"\u0325\u0326\u0005\n\u0000\u0000\u0326\u0327\u0005\u0003\u0000\u0000\u0327"+
		"\u0328\u0005\n\u0000\u0000\u0328\u03af\u0005\u0004\u0000\u0000\u0329\u032a"+
		"\u0005\u0005\u0000\u0000\u032a\u032b\u0005\u0003\u0000\u0000\u032b\u032c"+
		"\u0005\b\u0000\u0000\u032c\u032e\u0005\u0003\u0000\u0000\u032d\u032f\u0003"+
		"\u001a\r\u0000\u032e\u032d\u0001\u0000\u0000\u0000\u032f\u0330\u0001\u0000"+
		"\u0000\u0000\u0330\u032e\u0001\u0000\u0000\u0000\u0330\u0331\u0001\u0000"+
		"\u0000\u0000\u0331\u0332\u0001\u0000\u0000\u0000\u0332\u0333\u0005\u0004"+
		"\u0000\u0000\u0333\u0334\u0005\n\u0000\u0000\u0334\u0335\u0005\u0003\u0000"+
		"\u0000\u0335\u0336\u0005\n\u0000\u0000\u0336\u0337\u0005\u0004\u0000\u0000"+
		"\u0337\u0338\u0005\n\u0000\u0000\u0338\u0339\u0005\u0003\u0000\u0000\u0339"+
		"\u033a\u0005\n\u0000\u0000\u033a\u033b\u0005\u0004\u0000\u0000\u033b\u033c"+
		"\u0005\n\u0000\u0000\u033c\u033d\u0005\u0003\u0000\u0000\u033d\u033e\u0005"+
		"\n\u0000\u0000\u033e\u033f\u0005\u0003\u0000\u0000\u033f\u0340\u0005\n"+
		"\u0000\u0000\u0340\u0341\u0005\u0003\u0000\u0000\u0341\u0342\u0005\n\u0000"+
		"\u0000\u0342\u0343\u0005\u0003\u0000\u0000\u0343\u0344\u0005\n\u0000\u0000"+
		"\u0344\u0345\u0005\u0003\u0000\u0000\u0345\u0346\u0005\n\u0000\u0000\u0346"+
		"\u0347\u0005\u0003\u0000\u0000\u0347\u0348\u0005\n\u0000\u0000\u0348\u0349"+
		"\u0005\u0003\u0000\u0000\u0349\u034a\u0005\n\u0000\u0000\u034a\u034b\u0005"+
		"\u0003\u0000\u0000\u034b\u034c\u0005\n\u0000\u0000\u034c\u034d\u0005\u0003"+
		"\u0000\u0000\u034d\u034e\u0005\n\u0000\u0000\u034e\u034f\u0005\u0003\u0000"+
		"\u0000\u034f\u0350\u0005\n\u0000\u0000\u0350\u0351\u0005\u0003\u0000\u0000"+
		"\u0351\u0352\u0005\n\u0000\u0000\u0352\u0353\u0005\u0003\u0000\u0000\u0353"+
		"\u0354\u0005\u0004\u0000\u0000\u0354\u0355\u0005\n\u0000\u0000\u0355\u0356"+
		"\u0005\u0003\u0000\u0000\u0356\u0357\u0005\n\u0000\u0000\u0357\u0358\u0005"+
		"\u0003\u0000\u0000\u0358\u0359\u0005\n\u0000\u0000\u0359\u035a\u0005\u0003"+
		"\u0000\u0000\u035a\u035b\u0005\n\u0000\u0000\u035b\u035c\u0005\u0003\u0000"+
		"\u0000\u035c\u035d\u0005\n\u0000\u0000\u035d\u035e\u0005\u0003\u0000\u0000"+
		"\u035e\u035f\u0005\n\u0000\u0000\u035f\u0360\u0005\u0003\u0000\u0000\u0360"+
		"\u03a4\u0005\u0004\u0000\u0000\u0361\u0362\u0005\u0003\u0000\u0000\u0362"+
		"\u0363\u0005\u0003\u0000\u0000\u0363\u0364\u0005\u0003\u0000\u0000\u0364"+
		"\u0365\u0005\u0003\u0000\u0000\u0365\u0366\u0005\u0003\u0000\u0000\u0366"+
		"\u0367\u0005\u0003\u0000\u0000\u0367\u0368\u0005\u0003\u0000\u0000\u0368"+
		"\u0369\u0005\u0003\u0000\u0000\u0369\u036a\u0005\u0003\u0000\u0000\u036a"+
		"\u036b\u0005\u0003\u0000\u0000\u036b\u036c\u0005\u0003\u0000\u0000\u036c"+
		"\u036d\u0005\u0003\u0000\u0000\u036d\u036e\u0005\u0003\u0000\u0000\u036e"+
		"\u036f\u0005\u0003\u0000\u0000\u036f\u0370\u0005\u0003\u0000\u0000\u0370"+
		"\u0371\u0005\u0003\u0000\u0000\u0371\u0372\u0005\u0003\u0000\u0000\u0372"+
		"\u03a5\u0005\u0004\u0000\u0000\u0373\u0374\u0005\u0006\u0000\u0000\u0374"+
		"\u0376\u0005\u0003\u0000\u0000\u0375\u0377\u0005\u0006\u0000\u0000\u0376"+
		"\u0375\u0001\u0000\u0000\u0000\u0376\u0377\u0001\u0000\u0000\u0000\u0377"+
		"\u0378\u0001\u0000\u0000\u0000\u0378\u037a\u0005\u0003\u0000\u0000\u0379"+
		"\u037b\u0005\u0006\u0000\u0000\u037a\u0379\u0001\u0000\u0000\u0000\u037a"+
		"\u037b\u0001\u0000\u0000\u0000\u037b\u037c\u0001\u0000\u0000\u0000\u037c"+
		"\u037d\u0005\u0003\u0000\u0000\u037d\u037e\u0005\b\u0000\u0000\u037e\u0380"+
		"\u0005\u0003\u0000\u0000\u037f\u0381\u0003\u001a\r\u0000\u0380\u037f\u0001"+
		"\u0000\u0000\u0000\u0381\u0382\u0001\u0000\u0000\u0000\u0382\u0380\u0001"+
		"\u0000\u0000\u0000\u0382\u0383\u0001\u0000\u0000\u0000\u0383\u0384\u0001"+
		"\u0000\u0000\u0000\u0384\u0385\u0005\u0003\u0000\u0000\u0385\u0386\u0005"+
		"\n\u0000\u0000\u0386\u0387\u0005\u0003\u0000\u0000\u0387\u0388\u0005\n"+
		"\u0000\u0000\u0388\u0389\u0005\u0003\u0000\u0000\u0389\u038a\u0005\n\u0000"+
		"\u0000\u038a\u038b\u0005\u0003\u0000\u0000\u038b\u038c\u0005\n\u0000\u0000"+
		"\u038c\u038d\u0005\u0003\u0000\u0000\u038d\u038e\u0005\b\u0000\u0000\u038e"+
		"\u0390\u0005\u0003\u0000\u0000\u038f\u0391\u0005\b\u0000\u0000\u0390\u038f"+
		"\u0001\u0000\u0000\u0000\u0390\u0391\u0001\u0000\u0000\u0000\u0391\u0392"+
		"\u0001\u0000\u0000\u0000\u0392\u0393\u0005\u0003\u0000\u0000\u0393\u0394"+
		"\u0005\b\u0000\u0000\u0394\u0395\u0005\u0003\u0000\u0000\u0395\u0396\u0005"+
		"\b\u0000\u0000\u0396\u0398\u0005\u0003\u0000\u0000\u0397\u0399\u0005\b"+
		"\u0000\u0000\u0398\u0397\u0001\u0000\u0000\u0000\u0398\u0399\u0001\u0000"+
		"\u0000\u0000\u0399\u039a\u0001\u0000\u0000\u0000\u039a\u039b\u0005\u0003"+
		"\u0000\u0000\u039b\u039c\u0005\u0003\u0000\u0000\u039c\u039d\u0005\b\u0000"+
		"\u0000\u039d\u039e\u0005\u0003\u0000\u0000\u039e\u039f\u0005\b\u0000\u0000"+
		"\u039f\u03a0\u0005\u0003\u0000\u0000\u03a0\u03a1\u0005\u0004\u0000\u0000"+
		"\u03a1\u03a2\u0001\u0000\u0000\u0000\u03a2\u03a3\u0006\t\uffff\uffff\u0000"+
		"\u03a3\u03a5\u0001\u0000\u0000\u0000\u03a4\u0361\u0001\u0000\u0000\u0000"+
		"\u03a4\u0373\u0001\u0000\u0000\u0000\u03a5\u03a6\u0001\u0000\u0000\u0000"+
		"\u03a6\u03a4\u0001\u0000\u0000\u0000\u03a6\u03a7\u0001\u0000\u0000\u0000"+
		"\u03a7\u03a8\u0001\u0000\u0000\u0000\u03a8\u03a9\u0005\n\u0000\u0000\u03a9"+
		"\u03aa\u0005\u0003\u0000\u0000\u03aa\u03ab\u0005\n\u0000\u0000\u03ab\u03ac"+
		"\u0005\u0003\u0000\u0000\u03ac\u03ad\u0005\u0006\u0000\u0000\u03ad\u03ae"+
		"\u0005\u0004\u0000\u0000\u03ae\u03b0\u0001\u0000\u0000\u0000\u03af\u0329"+
		"\u0001\u0000\u0000\u0000\u03b0\u03b1\u0001\u0000\u0000\u0000\u03b1\u03af"+
		"\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001\u0000\u0000\u0000\u03b2\u03b3"+
		"\u0001\u0000\u0000\u0000\u03b3\u03b4\u0005\u0005\u0000\u0000\u03b4\u03b5"+
		"\u0005\u0003\u0000\u0000\u03b5\u03b6\u0005\n\u0000\u0000\u03b6\u03b7\u0005"+
		"\n\u0000\u0000\u03b7\u03b8\u0005\n\u0000\u0000\u03b8\u03b9\u0005\u0003"+
		"\u0000\u0000\u03b9\u03ba\u0005\n\u0000\u0000\u03ba\u03bb\u0005\u0003\u0000"+
		"\u0000\u03bb\u03bc\u0005\n\u0000\u0000\u03bc\u03bd\u0005\u0004\u0000\u0000"+
		"\u03bd\u0013\u0001\u0000\u0000\u0000\u03be\u03bf\u0005\u0005\u0000\u0000"+
		"\u03bf\u03c0\u0005\u0003\u0000\u0000\u03c0\u03c1\u0005\n\u0000\u0000\u03c1"+
		"\u03c2\u0005\n\u0000\u0000\u03c2\u03c3\u0005\n\u0000\u0000\u03c3\u03c4"+
		"\u0005\u0003\u0000\u0000\u03c4\u03c5\u0005\n\u0000\u0000\u03c5\u03c6\u0005"+
		"\u0003\u0000\u0000\u03c6\u03c7\u0005\n\u0000\u0000\u03c7\u03fd\u0005\u0004"+
		"\u0000\u0000\u03c8\u03c9\u0005\b\u0000\u0000\u03c9\u03cb\u0005\u0003\u0000"+
		"\u0000\u03ca\u03cc\u0003\u001a\r\u0000\u03cb\u03ca\u0001\u0000\u0000\u0000"+
		"\u03cc\u03cd\u0001\u0000\u0000\u0000\u03cd\u03cb\u0001\u0000\u0000\u0000"+
		"\u03cd\u03ce\u0001\u0000\u0000\u0000\u03ce\u03cf\u0001\u0000\u0000\u0000"+
		"\u03cf\u03d0\u0005\u0004\u0000\u0000\u03d0\u03d1\u0005\n\u0000\u0000\u03d1"+
		"\u03d2\u0005\u0003\u0000\u0000\u03d2\u03d3\u0005\n\u0000\u0000\u03d3\u03d4"+
		"\u0005\u0003\u0000\u0000\u03d4\u03d5\u0005\n\u0000\u0000\u03d5\u03d6\u0005"+
		"\u0003\u0000\u0000\u03d6\u03d7\u0005\n\u0000\u0000\u03d7\u03d8\u0005\u0003"+
		"\u0000\u0000\u03d8\u03d9\u0005\n\u0000\u0000\u03d9\u03da\u0005\u0003\u0000"+
		"\u0000\u03da\u03db\u0005\n\u0000\u0000\u03db\u03dc\u0005\u0003\u0000\u0000"+
		"\u03dc\u03dd\u0005\n\u0000\u0000\u03dd\u03de\u0005\u0003\u0000\u0000\u03de"+
		"\u03f2\u0005\u0004\u0000\u0000\u03df\u03e0\u0005\u0003\u0000\u0000\u03e0"+
		"\u03f3\u0005\u0004\u0000\u0000\u03e1\u03e2\u0005\u0006\u0000\u0000\u03e2"+
		"\u03e3\u0005\u0003\u0000\u0000\u03e3\u03e4\u0005\b\u0000\u0000\u03e4\u03e5"+
		"\u0005\u0003\u0000\u0000\u03e5\u03e6\u0005\b\u0000\u0000\u03e6\u03e7\u0005"+
		"\u0003\u0000\u0000\u03e7\u03e8\u0005\b\u0000\u0000\u03e8\u03e9\u0005\u0003"+
		"\u0000\u0000\u03e9\u03ea\u0005\b\u0000\u0000\u03ea\u03eb\u0005\u0003\u0000"+
		"\u0000\u03eb\u03ec\u0005\b\u0000\u0000\u03ec\u03ed\u0005\u0003\u0000\u0000"+
		"\u03ed\u03ee\u0005\b\u0000\u0000\u03ee\u03ef\u0005\u0003\u0000\u0000\u03ef"+
		"\u03f0\u0005\u0004\u0000\u0000\u03f0\u03f1\u0001\u0000\u0000\u0000\u03f1"+
		"\u03f3\u0006\n\uffff\uffff\u0000\u03f2\u03df\u0001\u0000\u0000\u0000\u03f2"+
		"\u03e1\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000\u0000\u0000\u03f4"+
		"\u03f2\u0001\u0000\u0000\u0000\u03f4\u03f5\u0001\u0000\u0000\u0000\u03f5"+
		"\u03f6\u0001\u0000\u0000\u0000\u03f6\u03f7\u0005\n\u0000\u0000\u03f7\u03f8"+
		"\u0005\u0003\u0000\u0000\u03f8\u03f9\u0005\n\u0000\u0000\u03f9\u03fa\u0005"+
		"\u0003\u0000\u0000\u03fa\u03fb\u0005\u0006\u0000\u0000\u03fb\u03fc\u0005"+
		"\u0004\u0000\u0000\u03fc\u03fe\u0001\u0000\u0000\u0000\u03fd\u03c8\u0001"+
		"\u0000\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff\u03fd\u0001"+
		"\u0000\u0000\u0000\u03ff\u0400\u0001\u0000\u0000\u0000\u0400\u0401\u0001"+
		"\u0000\u0000\u0000\u0401\u0402\u0005\u0005\u0000\u0000\u0402\u0403\u0005"+
		"\u0003\u0000\u0000\u0403\u0404\u0005\n\u0000\u0000\u0404\u0405\u0005\n"+
		"\u0000\u0000\u0405\u0406\u0005\n\u0000\u0000\u0406\u0407\u0005\u0003\u0000"+
		"\u0000\u0407\u0408\u0005\n\u0000\u0000\u0408\u0409\u0005\u0003\u0000\u0000"+
		"\u0409\u040a\u0005\n\u0000\u0000\u040a\u040b\u0005\u0004\u0000\u0000\u040b"+
		"\u0015\u0001\u0000\u0000\u0000\u040c\u040e\u0003\u001c\u000e\u0000\u040d"+
		"\u040c\u0001\u0000\u0000\u0000\u040e\u040f\u0001\u0000\u0000\u0000\u040f"+
		"\u040d\u0001\u0000\u0000\u0000\u040f\u0410\u0001\u0000\u0000\u0000\u0410"+
		"\u0411\u0001\u0000\u0000\u0000\u0411\u0412\u0005\n\u0000\u0000\u0412\u0413"+
		"\u0005\n\u0000\u0000\u0413\u0414\u0005\n\u0000\u0000\u0414\u0415\u0005"+
		"\n\u0000\u0000\u0415\u0416\u0005\n\u0000\u0000\u0416\u0417\u0005\n\u0000"+
		"\u0000\u0417\u0419\u0005\u0004\u0000\u0000\u0418\u041a\u0003\u0018\f\u0000"+
		"\u0419\u0418\u0001\u0000\u0000\u0000\u041a\u041b\u0001\u0000\u0000\u0000"+
		"\u041b\u0419\u0001\u0000\u0000\u0000\u041b\u041c\u0001\u0000\u0000\u0000"+
		"\u041c\u041d\u0001\u0000\u0000\u0000\u041d\u041e\u0003\u001e\u000f\u0000"+
		"\u041e\u0017\u0001\u0000\u0000\u0000\u041f\u0420\u0005\u0006\u0000\u0000"+
		"\u0420\u0423\u0005\u0004\u0000\u0000\u0421\u0422\u0005\u0006\u0000\u0000"+
		"\u0422\u0424\u0005\u0004\u0000\u0000\u0423\u0421\u0001\u0000\u0000\u0000"+
		"\u0423\u0424\u0001\u0000\u0000\u0000\u0424\u0425\u0001\u0000\u0000\u0000"+
		"\u0425\u0426\u0003\u001a\r\u0000\u0426\u0427\u0005\u0004\u0000\u0000\u0427"+
		"\u042b\u0003\u001a\r\u0000\u0428\u042a\u0003\u001a\r\u0000\u0429\u0428"+
		"\u0001\u0000\u0000\u0000\u042a\u042d\u0001\u0000\u0000\u0000\u042b\u0429"+
		"\u0001\u0000\u0000\u0000\u042b\u042c\u0001\u0000\u0000\u0000\u042c\u042e"+
		"\u0001\u0000\u0000\u0000\u042d\u042b\u0001\u0000\u0000\u0000\u042e\u042f"+
		"\u0005\u0004\u0000\u0000\u042f\u0430\u0005\n\u0000\u0000\u0430\u0431\u0005"+
		"\u0004\u0000\u0000\u0431\u0432\u0005\n\u0000\u0000\u0432\u0433\u0005\u0004"+
		"\u0000\u0000\u0433\u0434\u0005\n\u0000\u0000\u0434\u0435\u0005\u0004\u0000"+
		"\u0000\u0435\u0436\u0005\n\u0000\u0000\u0436\u0437\u0005\u0004\u0000\u0000"+
		"\u0437\u0438\u0005\b\u0000\u0000\u0438\u0439\u0005\u0004\u0000\u0000\u0439"+
		"\u043a\u0005\b\u0000\u0000\u043a\u043b\u0005\u0004\u0000\u0000\u043b\u043c"+
		"\u0005\b\u0000\u0000\u043c\u043d\u0005\u0004\u0000\u0000\u043d\u043e\u0005"+
		"\b\u0000\u0000\u043e\u043f\u0005\u0004\u0000\u0000\u043f\u0440\u0005\b"+
		"\u0000\u0000\u0440\u0441\u0005\u0004\u0000\u0000\u0441\u0442\u0006\f\uffff"+
		"\uffff\u0000\u0442\u0019\u0001\u0000\u0000\u0000\u0443\u0444\u0007\u0000"+
		"\u0000\u0000\u0444\u001b\u0001\u0000\u0000\u0000\u0445\u0448\u0003\u001a"+
		"\r\u0000\u0446\u0448\u0005\u0003\u0000\u0000\u0447\u0445\u0001\u0000\u0000"+
		"\u0000\u0447\u0446\u0001\u0000\u0000\u0000\u0448\u0449\u0001\u0000\u0000"+
		"\u0000\u0449\u0447\u0001\u0000\u0000\u0000\u0449\u044a\u0001\u0000\u0000"+
		"\u0000\u044a\u044b\u0001\u0000\u0000\u0000\u044b\u044c\u0005\u0004\u0000"+
		"\u0000\u044c\u001d\u0001\u0000\u0000\u0000\u044d\u0451\u0003\u001a\r\u0000"+
		"\u044e\u0451\u0005\u0003\u0000\u0000\u044f\u0451\u0005\u0004\u0000\u0000"+
		"\u0450\u044d\u0001\u0000\u0000\u0000\u0450\u044e\u0001\u0000\u0000\u0000"+
		"\u0450\u044f\u0001\u0000\u0000\u0000\u0451\u0452\u0001\u0000\u0000\u0000"+
		"\u0452\u0450\u0001\u0000\u0000\u0000\u0452\u0453\u0001\u0000\u0000\u0000"+
		"\u0453\u001f\u0001\u0000\u0000\u0000q*<Z^bfpuw\u0082\u00a0\u00ca\u00cc"+
		"\u00d7\u00f6\u00f9\u00fc\u00ff\u0102\u0105\u010a\u0111\u0114\u0117\u011a"+
		"\u011d\u0120\u0123\u0128\u012f\u0132\u0135\u0138\u013b\u013e\u0141\u0146"+
		"\u015d\u0196\u019c\u01b2\u01bd\u01dc\u01e2\u01e5\u01e8\u01eb\u01ee\u01f1"+
		"\u01f6\u01fc\u01ff\u0202\u0205\u0208\u020b\u0210\u0218\u0228\u023a\u023d"+
		"\u0240\u0243\u0246\u0249\u024e\u0256\u0287\u028a\u028d\u0290\u0293\u0296"+
		"\u029b\u02a5\u02aa\u02ae\u02b2\u02b6\u02ba\u02be\u02d0\u02d2\u02dc\u02ef"+
		"\u02f2\u02f5\u02f8\u02fb\u02fe\u0303\u030b\u0330\u0376\u037a\u0382\u0390"+
		"\u0398\u03a4\u03a6\u03b1\u03cd\u03f2\u03f4\u03ff\u040f\u041b\u0423\u042b"+
		"\u0447\u0449\u0450\u0452";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}