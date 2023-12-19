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
		RULE_stockDocument = 0, RULE_crawlPriceCompay = 1, RULE_crawlCompanyDetails = 2, 
		RULE_crawlCompanyTopDividend = 3, RULE_crawlEtfDetailThread = 4, RULE_extractAllEtfFromNaver = 5, 
		RULE_crawlDividendHistoryEtfThread = 6, RULE_extractItemDetailsEtf = 7, 
		RULE_extractlDividendHistory = 8, RULE_extractTextStockPrice = 9, RULE_seibroDividend = 10, 
		RULE_seibroDividendItem = 11, RULE_word = 12, RULE_line = 13, RULE_eof = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"stockDocument", "crawlPriceCompay", "crawlCompanyDetails", "crawlCompanyTopDividend", 
			"crawlEtfDetailThread", "extractAllEtfFromNaver", "crawlDividendHistoryEtfThread", 
			"extractItemDetailsEtf", "extractlDividendHistory", "extractTextStockPrice", 
			"seibroDividend", "seibroDividendItem", "word", "line", "eof"
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
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				extractTextStockPrice();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				extractlDividendHistory();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				seibroDividend();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				crawlDividendHistoryEtfThread();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				extractAllEtfFromNaver();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(35);
				crawlEtfDetailThread();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(36);
				crawlCompanyTopDividend();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(37);
				crawlCompanyDetails();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(38);
				crawlPriceCompay();
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
		enterRule(_localctx, 2, RULE_crawlPriceCompay);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(KEYWORD);
			setState(42);
			match(TAB);
			setState(43);
			match(WORD);
			setState(44);
			match(WORD);
			setState(45);
			match(TAB);
			setState(46);
			match(WORD);
			setState(47);
			match(TAB);
			setState(48);
			match(WORD);
			setState(49);
			match(TAB);
			setState(50);
			match(WORD);
			setState(51);
			match(NEWLINE);
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				((CrawlPriceCompayContext)_localctx).code = match(NUMBER);
				setState(53);
				match(TAB);
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(54);
					((CrawlPriceCompayContext)_localctx).symbol = word();
					}
					}
					setState(57); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(59);
				match(NEWLINE);
				setState(60);
				match(WORD);
				setState(61);
				match(TAB);
				setState(62);
				match(WORD);
				setState(63);
				match(TAB);
				setState(64);
				match(WORD);
				setState(65);
				match(TAB);
				setState(66);
				match(WORD);
				setState(67);
				match(TAB);
				setState(68);
				match(WORD);
				setState(69);
				match(TAB);
				setState(70);
				match(WORD);
				setState(71);
				match(TAB);
				setState(72);
				match(WORD);
				setState(73);
				match(TAB);
				setState(74);
				match(NEWLINE);
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(99);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAB:
						{
						{
						setState(75);
						match(TAB);
						setState(76);
						match(TAB);
						setState(77);
						match(TAB);
						setState(78);
						match(TAB);
						setState(79);
						match(TAB);
						setState(80);
						match(TAB);
						setState(81);
						match(TAB);
						setState(82);
						match(NEWLINE);
						}
						}
						break;
					case DATE:
						{
						{
						setState(83);
						((CrawlPriceCompayContext)_localctx).base = match(DATE);
						setState(84);
						match(TAB);
						setState(85);
						((CrawlPriceCompayContext)_localctx).closing = match(NUMBER);
						setState(86);
						match(TAB);
						setState(87);
						match(NUMBER);
						setState(88);
						match(TAB);
						setState(89);
						((CrawlPriceCompayContext)_localctx).market = match(NUMBER);
						setState(90);
						match(TAB);
						setState(91);
						((CrawlPriceCompayContext)_localctx).high = match(NUMBER);
						setState(92);
						match(TAB);
						setState(93);
						((CrawlPriceCompayContext)_localctx).low = match(NUMBER);
						setState(94);
						match(TAB);
						setState(95);
						((CrawlPriceCompayContext)_localctx).volume = match(NUMBER);
						setState(96);
						match(TAB);
						setState(97);
						match(NEWLINE);

									StockParserService.crawlPriceCompay(20231217
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
					setState(101); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TAB || _la==DATE );
				setState(103);
				match(WORD);
				setState(104);
				match(TAB);
				setState(105);
				match(WORD);
				setState(106);
				match(TAB);
				setState(107);
				match(DATE);
				setState(108);
				match(NEWLINE);
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(114);
			match(KEYWORD);
			setState(115);
			match(TAB);
			setState(116);
			match(WORD);
			setState(117);
			match(WORD);
			setState(118);
			match(TAB);
			setState(119);
			match(WORD);
			setState(120);
			match(TAB);
			setState(121);
			match(WORD);
			setState(122);
			match(TAB);
			setState(123);
			match(WORD);
			setState(124);
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
		enterRule(_localctx, 4, RULE_crawlCompanyDetails);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(KEYWORD);
			setState(127);
			match(TAB);
			setState(128);
			match(WORD);
			setState(129);
			match(WORD);
			setState(130);
			match(TAB);
			setState(131);
			match(WORD);
			setState(132);
			match(TAB);
			setState(133);
			match(WORD);
			setState(134);
			match(TAB);
			setState(135);
			match(WORD);
			setState(136);
			match(NEWLINE);
			setState(244); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(137);
					match(KEYWORD);
					setState(138);
					match(TAB);
					setState(139);
					((CrawlCompanyDetailsContext)_localctx).code = match(NUMBER);
					setState(140);
					match(TAB);
					setState(141);
					((CrawlCompanyDetailsContext)_localctx).symbol = word();
					setState(143);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(142);
						((CrawlCompanyDetailsContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(145);
						((CrawlCompanyDetailsContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(149);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(148);
						((CrawlCompanyDetailsContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(151);
						((CrawlCompanyDetailsContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(155);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(154);
						((CrawlCompanyDetailsContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(158);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(157);
						((CrawlCompanyDetailsContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(160);
						((CrawlCompanyDetailsContext)_localctx).symbol7 = word();
						}
						}
						setState(165);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(166);
					match(NEWLINE);
					setState(167);
					match(KEYWORD);
					setState(168);
					match(TAB);
					setState(170);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(169);
						((CrawlCompanyDetailsContext)_localctx).category = word();
						}
						break;
					}
					setState(173);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(172);
						((CrawlCompanyDetailsContext)_localctx).category1 = word();
						}
						break;
					}
					setState(176);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(175);
						((CrawlCompanyDetailsContext)_localctx).category2 = word();
						}
						break;
					}
					setState(179);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(178);
						((CrawlCompanyDetailsContext)_localctx).category3 = word();
						}
						break;
					}
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(181);
						((CrawlCompanyDetailsContext)_localctx).category4 = word();
						}
						break;
					}
					setState(185);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(184);
						((CrawlCompanyDetailsContext)_localctx).category5 = word();
						}
						break;
					}
					setState(188);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(187);
						((CrawlCompanyDetailsContext)_localctx).category6 = word();
						}
						break;
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(190);
						((CrawlCompanyDetailsContext)_localctx).category7 = word();
						}
						}
						setState(195);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(196);
					match(NEWLINE);
					setState(197);
					match(KEYWORD);
					setState(198);
					match(TAB);
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(199);
						((CrawlCompanyDetailsContext)_localctx).fics = word();
						}
						break;
					}
					setState(203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(202);
						((CrawlCompanyDetailsContext)_localctx).fics1 = word();
						}
						break;
					}
					setState(206);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(205);
						((CrawlCompanyDetailsContext)_localctx).fics2 = word();
						}
						break;
					}
					setState(209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(208);
						((CrawlCompanyDetailsContext)_localctx).fics3 = word();
						}
						break;
					}
					setState(212);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(211);
						((CrawlCompanyDetailsContext)_localctx).fics4 = word();
						}
						break;
					}
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(214);
						((CrawlCompanyDetailsContext)_localctx).fics5 = word();
						}
						break;
					}
					setState(218);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(217);
						((CrawlCompanyDetailsContext)_localctx).fics6 = word();
						}
						break;
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(220);
						((CrawlCompanyDetailsContext)_localctx).fics7 = word();
						}
						}
						setState(225);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(226);
					match(NEWLINE);
					setState(227);
					match(KEYWORD);
					setState(228);
					match(TAB);
					setState(229);
					((CrawlCompanyDetailsContext)_localctx).ea = match(NUMBER);
					setState(230);
					match(WORD);
					setState(231);
					match(NEWLINE);
					setState(232);
					match(KEYWORD);
					setState(233);
					match(TAB);
					setState(234);
					((CrawlCompanyDetailsContext)_localctx).ipo = match(DATE);
					setState(235);
					match(NEWLINE);
					setState(236);
					match(WORD);
					setState(237);
					match(TAB);
					setState(238);
					match(WORD);
					setState(239);
					match(TAB);
					setState(240);
					match(DATE);
					setState(241);
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
				setState(246); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(248);
			match(KEYWORD);
			setState(249);
			match(TAB);
			setState(250);
			match(WORD);
			setState(251);
			match(WORD);
			setState(252);
			match(TAB);
			setState(253);
			match(WORD);
			setState(254);
			match(TAB);
			setState(255);
			match(WORD);
			setState(256);
			match(TAB);
			setState(257);
			match(WORD);
			setState(258);
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
		enterRule(_localctx, 6, RULE_crawlCompanyTopDividend);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(KEYWORD);
			setState(261);
			match(TAB);
			setState(262);
			match(WORD);
			setState(263);
			match(TAB);
			setState(264);
			match(WORD);
			setState(265);
			match(WORD);
			setState(266);
			match(WORD);
			setState(267);
			match(TAB);
			setState(268);
			match(WORD);
			setState(269);
			match(TAB);
			setState(270);
			match(WORD);
			setState(271);
			match(NEWLINE);
			setState(340); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(272);
				match(WORD);
				setState(273);
				match(TAB);
				setState(274);
				match(NEWLINE);
				setState(275);
				match(WORD);
				setState(276);
				match(TAB);
				setState(277);
				match(WORD);
				setState(278);
				match(TAB);
				setState(279);
				match(WORD);
				setState(280);
				match(TAB);
				setState(281);
				match(WORD);
				setState(282);
				match(TAB);
				setState(283);
				match(WORD);
				setState(284);
				match(TAB);
				setState(285);
				match(WORD);
				setState(286);
				match(TAB);
				setState(287);
				match(WORD);
				setState(288);
				match(TAB);
				setState(289);
				match(WORD);
				setState(290);
				match(TAB);
				setState(291);
				match(WORD);
				setState(292);
				match(TAB);
				setState(293);
				match(WORD);
				setState(294);
				match(TAB);
				setState(295);
				match(WORD);
				setState(296);
				match(TAB);
				setState(297);
				match(NEWLINE);
				setState(329); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(298);
						((CrawlCompanyTopDividendContext)_localctx).type = match(WORD);
						setState(299);
						match(TAB);
						setState(300);
						match(NUMBER);
						setState(301);
						match(TAB);
						setState(303);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(302);
							((CrawlCompanyTopDividendContext)_localctx).code = match(NUMBER);
							}
						}

						setState(305);
						match(TAB);
						setState(307); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(306);
							word();
							}
							}
							setState(309); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(311);
						match(TAB);
						setState(312);
						match(WORD);
						setState(313);
						match(TAB);
						setState(314);
						match(WORD);
						setState(315);
						match(TAB);
						setState(316);
						match(NUMBER);
						setState(317);
						match(TAB);
						setState(318);
						match(NUMBER);
						setState(319);
						match(TAB);
						setState(320);
						match(NUMBER);
						setState(321);
						match(TAB);
						setState(322);
						match(NUMBER);
						setState(323);
						match(TAB);
						setState(324);
						match(NUMBER);
						setState(325);
						match(TAB);
						setState(326);
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
					setState(331); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(333);
				match(WORD);
				setState(334);
				match(TAB);
				setState(335);
				match(WORD);
				setState(336);
				match(TAB);
				setState(337);
				match(DATE);
				setState(338);
				match(NEWLINE);
				}
				}
				setState(342); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(344);
			match(KEYWORD);
			setState(345);
			match(TAB);
			setState(346);
			match(WORD);
			setState(347);
			match(TAB);
			setState(348);
			match(WORD);
			setState(349);
			match(WORD);
			setState(350);
			match(WORD);
			setState(351);
			match(TAB);
			setState(352);
			match(WORD);
			setState(353);
			match(TAB);
			setState(354);
			match(WORD);
			setState(355);
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
		enterRule(_localctx, 8, RULE_crawlEtfDetailThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(KEYWORD);
			setState(358);
			match(TAB);
			setState(359);
			match(WORD);
			setState(360);
			match(WORD);
			setState(361);
			match(TAB);
			setState(362);
			match(WORD);
			setState(363);
			match(TAB);
			setState(364);
			match(WORD);
			setState(365);
			match(NEWLINE);
			setState(447); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(366);
					match(KEYWORD);
					setState(367);
					match(TAB);
					setState(368);
					((CrawlEtfDetailThreadContext)_localctx).code = match(NUMBER);
					setState(369);
					match(TAB);
					setState(373);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(370);
						word();
						}
						}
						setState(375);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(376);
					match(NEWLINE);
					setState(377);
					((CrawlEtfDetailThreadContext)_localctx).symbol = word();
					setState(379);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(378);
						((CrawlEtfDetailThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(382);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(381);
						((CrawlEtfDetailThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(385);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(384);
						((CrawlEtfDetailThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(388);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(387);
						((CrawlEtfDetailThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(391);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						setState(390);
						((CrawlEtfDetailThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(394);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						setState(393);
						((CrawlEtfDetailThreadContext)_localctx).symbol6 = word();
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
						((CrawlEtfDetailThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(401);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(402);
					match(NEWLINE);
					setState(403);
					((CrawlEtfDetailThreadContext)_localctx).category = word();
					setState(405);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(404);
						((CrawlEtfDetailThreadContext)_localctx).category1 = word();
						}
						break;
					}
					setState(408);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(407);
						((CrawlEtfDetailThreadContext)_localctx).category2 = word();
						}
						break;
					}
					setState(411);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(410);
						((CrawlEtfDetailThreadContext)_localctx).category3 = word();
						}
						break;
					}
					setState(414);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(413);
						((CrawlEtfDetailThreadContext)_localctx).category4 = word();
						}
						break;
					}
					setState(417);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(416);
						((CrawlEtfDetailThreadContext)_localctx).category5 = word();
						}
						break;
					}
					setState(420);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(419);
						((CrawlEtfDetailThreadContext)_localctx).category6 = word();
						}
						break;
					}
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(422);
						((CrawlEtfDetailThreadContext)_localctx).category7 = word();
						}
						}
						setState(427);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(428);
					match(NEWLINE);
					setState(429);
					((CrawlEtfDetailThreadContext)_localctx).ipo = match(DATE);
					setState(433);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WORD) {
						{
						{
						setState(430);
						match(WORD);
						}
						}
						setState(435);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(436);
					match(NEWLINE);
					setState(437);
					((CrawlEtfDetailThreadContext)_localctx).fee = word();
					setState(438);
					match(NEWLINE);
					setState(439);
					match(WORD);
					setState(440);
					match(TAB);
					setState(441);
					match(WORD);
					setState(442);
					match(TAB);
					setState(443);
					match(DATE);
					setState(444);
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
				setState(449); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(451);
			match(KEYWORD);
			setState(452);
			match(TAB);
			setState(453);
			match(WORD);
			setState(454);
			match(WORD);
			setState(455);
			match(TAB);
			setState(456);
			match(WORD);
			setState(457);
			match(TAB);
			setState(458);
			match(WORD);
			setState(459);
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
		enterRule(_localctx, 10, RULE_extractAllEtfFromNaver);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(461);
				match(KEYWORD);
				setState(462);
				match(TAB);
				setState(463);
				((ExtractAllEtfFromNaverContext)_localctx).code = match(WORD);
				setState(464);
				match(TAB);
				setState(465);
				((ExtractAllEtfFromNaverContext)_localctx).symbol = word();
				setState(467);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(466);
					((ExtractAllEtfFromNaverContext)_localctx).symbol1 = word();
					}
					break;
				}
				setState(470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(469);
					((ExtractAllEtfFromNaverContext)_localctx).symbol2 = word();
					}
					break;
				}
				setState(473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(472);
					((ExtractAllEtfFromNaverContext)_localctx).symbol3 = word();
					}
					break;
				}
				setState(476);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(475);
					((ExtractAllEtfFromNaverContext)_localctx).symbol4 = word();
					}
					break;
				}
				setState(479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(478);
					((ExtractAllEtfFromNaverContext)_localctx).symbol5 = word();
					}
					break;
				}
				setState(482);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(481);
					((ExtractAllEtfFromNaverContext)_localctx).symbol6 = word();
					}
					break;
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
					{
					{
					setState(484);
					((ExtractAllEtfFromNaverContext)_localctx).symbol7 = word();
					}
					}
					setState(489);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(490);
				match(NEWLINE);

						StockParserService.extractAllEtfFromNaver(20231214
							, (((ExtractAllEtfFromNaverContext)_localctx).code!=null?((ExtractAllEtfFromNaverContext)_localctx).code.getText():null)
							, (((ExtractAllEtfFromNaverContext)_localctx).symbol!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol.start,((ExtractAllEtfFromNaverContext)_localctx).symbol.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol1!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol1.start,((ExtractAllEtfFromNaverContext)_localctx).symbol1.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol2!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol2.start,((ExtractAllEtfFromNaverContext)_localctx).symbol2.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol3!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol3.start,((ExtractAllEtfFromNaverContext)_localctx).symbol3.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol4!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol4.start,((ExtractAllEtfFromNaverContext)_localctx).symbol4.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol5!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol5.start,((ExtractAllEtfFromNaverContext)_localctx).symbol5.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol6!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol6.start,((ExtractAllEtfFromNaverContext)_localctx).symbol6.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol7!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol7.start,((ExtractAllEtfFromNaverContext)_localctx).symbol7.stop):null)
						);
					
				}
				}
				setState(495); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KEYWORD );
			setState(497);
			match(WORD);
			setState(498);
			match(TAB);
			setState(499);
			match(WORD);
			setState(500);
			match(TAB);
			setState(501);
			match(DATE);
			setState(502);
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
		enterRule(_localctx, 12, RULE_crawlDividendHistoryEtfThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(KEYWORD);
			setState(505);
			match(TAB);
			setState(506);
			match(WORD);
			setState(507);
			match(WORD);
			setState(508);
			match(WORD);
			setState(509);
			match(TAB);
			setState(510);
			match(WORD);
			setState(511);
			match(WORD);
			setState(512);
			match(WORD);
			setState(513);
			match(TAB);
			setState(514);
			match(WORD);
			setState(515);
			match(TAB);
			setState(516);
			match(WORD);
			setState(517);
			match(NEWLINE);
			setState(627); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					{
					setState(518);
					match(KEYWORD);
					setState(519);
					match(TAB);
					setState(520);
					((CrawlDividendHistoryEtfThreadContext)_localctx).code = match(NUMBER);
					setState(521);
					match(NEWLINE);
					setState(522);
					match(WORD);
					setState(523);
					match(TAB);
					setState(524);
					match(TAB);
					setState(525);
					match(WORD);
					setState(526);
					match(TAB);
					setState(527);
					match(WORD);
					setState(528);
					match(TAB);
					setState(529);
					match(WORD);
					setState(530);
					match(TAB);
					setState(531);
					match(WORD);
					setState(532);
					match(TAB);
					setState(533);
					match(WORD);
					setState(534);
					match(TAB);
					setState(535);
					match(WORD);
					setState(536);
					match(TAB);
					setState(537);
					match(WORD);
					setState(538);
					match(TAB);
					setState(539);
					match(WORD);
					setState(540);
					match(TAB);
					setState(541);
					match(NEWLINE);
					setState(617); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(617);
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
								setState(542);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol = word();
								setState(544);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
								case 1:
									{
									setState(543);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol1 = word();
									}
									break;
								}
								setState(547);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
								case 1:
									{
									setState(546);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol2 = word();
									}
									break;
								}
								setState(550);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
								case 1:
									{
									setState(549);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol3 = word();
									}
									break;
								}
								setState(553);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
								case 1:
									{
									setState(552);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol4 = word();
									}
									break;
								}
								setState(556);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
								case 1:
									{
									setState(555);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol5 = word();
									}
									break;
								}
								setState(559);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
								case 1:
									{
									setState(558);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol6 = word();
									}
									break;
								}
								setState(564);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
									{
									{
									setState(561);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol7 = word();
									}
									}
									setState(566);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(567);
								match(TAB);
								setState(568);
								match(TAB);
								setState(569);
								match(WORD);
								setState(570);
								match(TAB);
								setState(574);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
									{
									{
									setState(571);
									word();
									}
									}
									setState(576);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(577);
								match(TAB);
								setState(579);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(578);
									((CrawlDividendHistoryEtfThreadContext)_localctx).base = match(DATE);
									}
								}

								setState(581);
								match(TAB);
								setState(583);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(582);
									((CrawlDividendHistoryEtfThreadContext)_localctx).pay = match(DATE);
									}
								}

								setState(585);
								match(TAB);
								setState(587);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==WORD) {
									{
									setState(586);
									match(WORD);
									}
								}

								setState(589);
								match(TAB);
								setState(591);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(590);
									((CrawlDividendHistoryEtfThreadContext)_localctx).dividend = match(NUMBER);
									}
								}

								setState(593);
								match(TAB);
								setState(595);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(594);
									((CrawlDividendHistoryEtfThreadContext)_localctx).price = match(NUMBER);
									}
								}

								setState(597);
								match(TAB);
								setState(599);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(598);
									((CrawlDividendHistoryEtfThreadContext)_localctx).ratio = match(NUMBER);
									}
								}

								setState(601);
								match(TAB);
								setState(602);
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
								setState(606);
								match(TAB);
								setState(607);
								match(TAB);
								setState(608);
								match(TAB);
								setState(609);
								match(TAB);
								setState(610);
								match(TAB);
								setState(611);
								match(TAB);
								setState(612);
								match(TAB);
								setState(613);
								match(TAB);
								setState(614);
								match(TAB);
								setState(615);
								match(TAB);
								setState(616);
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
						setState(619); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(621);
					match(WORD);
					setState(622);
					match(TAB);
					setState(623);
					match(WORD);
					setState(624);
					match(TAB);
					setState(625);
					match(DATE);
					setState(626);
					match(NEWLINE);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(629); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(631);
			match(KEYWORD);
			setState(632);
			match(TAB);
			setState(633);
			match(WORD);
			setState(634);
			match(WORD);
			setState(635);
			match(WORD);
			setState(636);
			match(TAB);
			setState(637);
			match(WORD);
			setState(638);
			match(WORD);
			setState(639);
			match(WORD);
			setState(640);
			match(TAB);
			setState(641);
			match(WORD);
			setState(642);
			match(TAB);
			setState(643);
			match(WORD);
			setState(644);
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
		enterRule(_localctx, 14, RULE_extractItemDetailsEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			((ExtractItemDetailsEtfContext)_localctx).symbol = word();
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(647);
				((ExtractItemDetailsEtfContext)_localctx).symbol1 = word();
				}
				break;
			}
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(650);
				((ExtractItemDetailsEtfContext)_localctx).symbol2 = word();
				}
				break;
			}
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(653);
				((ExtractItemDetailsEtfContext)_localctx).symbol3 = word();
				}
				break;
			}
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(656);
				((ExtractItemDetailsEtfContext)_localctx).symbol4 = word();
				}
				break;
			}
			setState(660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(659);
				((ExtractItemDetailsEtfContext)_localctx).symbol5 = word();
				}
				break;
			}
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(662);
				((ExtractItemDetailsEtfContext)_localctx).symbol6 = word();
				}
				break;
			}
			setState(668);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(665);
					((ExtractItemDetailsEtfContext)_localctx).symbol7 = word();
					}
					} 
				}
				setState(670);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			setState(671);
			((ExtractItemDetailsEtfContext)_localctx).code = match(NUMBER);
			setState(672);
			match(NEWLINE);
			setState(673);
			match(WORD);
			setState(674);
			((ExtractItemDetailsEtfContext)_localctx).ckospi = match(WORD);
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(675);
				((ExtractItemDetailsEtfContext)_localctx).cwics = match(WORD);
				}
			}

			setState(678);
			match(TAB);
			setState(679);
			match(NEWLINE);
			setState(680);
			match(WORD);
			setState(681);
			match(TAB);
			setState(682);
			((ExtractItemDetailsEtfContext)_localctx).currentPrice = match(WORD);
			setState(683);
			match(WORD);
			setState(684);
			match(WORD);
			setState(685);
			match(WORD);
			setState(686);
			match(WORD);
			setState(687);
			match(TAB);
			setState(688);
			match(NEWLINE);
			setState(689);
			match(WORD);
			setState(690);
			match(TAB);
			setState(691);
			((ExtractItemDetailsEtfContext)_localctx).volumeOfListedShares = match(NUMBER);
			setState(692);
			match(TAB);
			setState(693);
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
		enterRule(_localctx, 16, RULE_extractlDividendHistory);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(KEYWORD);
			setState(697);
			match(TAB);
			setState(698);
			match(WORD);
			setState(699);
			match(WORD);
			setState(700);
			match(WORD);
			setState(701);
			match(TAB);
			setState(702);
			match(WORD);
			setState(703);
			match(TAB);
			setState(704);
			match(WORD);
			setState(705);
			match(NEWLINE);
			setState(840); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(706);
					match(KEYWORD);
					setState(707);
					match(TAB);
					setState(708);
					((ExtractlDividendHistoryContext)_localctx).code = match(NUMBER);
					setState(709);
					match(TAB);
					setState(711); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(710);
						word();
						}
						}
						setState(713); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
					setState(715);
					match(NEWLINE);
					setState(716);
					match(WORD);
					setState(717);
					match(TAB);
					setState(718);
					match(WORD);
					setState(719);
					match(NEWLINE);
					setState(720);
					match(WORD);
					setState(721);
					match(TAB);
					setState(722);
					match(WORD);
					setState(723);
					match(NEWLINE);
					setState(724);
					match(WORD);
					setState(725);
					match(TAB);
					setState(726);
					match(WORD);
					setState(727);
					match(TAB);
					setState(728);
					match(WORD);
					setState(729);
					match(TAB);
					setState(730);
					match(WORD);
					setState(731);
					match(TAB);
					setState(732);
					match(WORD);
					setState(733);
					match(TAB);
					setState(734);
					match(WORD);
					setState(735);
					match(TAB);
					setState(736);
					match(WORD);
					setState(737);
					match(TAB);
					setState(738);
					match(WORD);
					setState(739);
					match(TAB);
					setState(740);
					match(WORD);
					setState(741);
					match(TAB);
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
					match(TAB);
					setState(748);
					match(NEWLINE);
					setState(749);
					match(WORD);
					setState(750);
					match(TAB);
					setState(751);
					match(WORD);
					setState(752);
					match(TAB);
					setState(753);
					match(WORD);
					setState(754);
					match(TAB);
					setState(755);
					match(WORD);
					setState(756);
					match(TAB);
					setState(757);
					match(WORD);
					setState(758);
					match(TAB);
					setState(759);
					match(WORD);
					setState(760);
					match(TAB);
					setState(761);
					match(NEWLINE);
					setState(829); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						setState(829);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case TAB:
							{
							{
							setState(762);
							match(TAB);
							setState(763);
							match(TAB);
							setState(764);
							match(TAB);
							setState(765);
							match(TAB);
							setState(766);
							match(TAB);
							setState(767);
							match(TAB);
							setState(768);
							match(TAB);
							setState(769);
							match(TAB);
							setState(770);
							match(TAB);
							setState(771);
							match(TAB);
							setState(772);
							match(TAB);
							setState(773);
							match(TAB);
							setState(774);
							match(TAB);
							setState(775);
							match(TAB);
							setState(776);
							match(TAB);
							setState(777);
							match(TAB);
							setState(778);
							match(TAB);
							setState(779);
							match(NEWLINE);
							}
							}
							break;
						case DATE:
							{
							{
							setState(780);
							((ExtractlDividendHistoryContext)_localctx).base = match(DATE);
							setState(781);
							match(TAB);
							setState(783);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==DATE) {
								{
								setState(782);
								((ExtractlDividendHistoryContext)_localctx).pay = match(DATE);
								}
							}

							setState(785);
							match(TAB);
							setState(787);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==DATE) {
								{
								setState(786);
								match(DATE);
								}
							}

							setState(789);
							match(TAB);
							setState(790);
							match(NUMBER);
							setState(791);
							match(TAB);
							setState(793); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(792);
								((ExtractlDividendHistoryContext)_localctx).symbol = word();
								}
								}
								setState(795); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
							setState(797);
							match(TAB);
							setState(798);
							match(WORD);
							setState(799);
							match(TAB);
							setState(800);
							match(WORD);
							setState(801);
							match(TAB);
							setState(802);
							match(WORD);
							setState(803);
							match(TAB);
							setState(804);
							match(WORD);
							setState(805);
							match(TAB);
							setState(806);
							((ExtractlDividendHistoryContext)_localctx).dividend = match(NUMBER);
							setState(807);
							match(TAB);
							setState(809);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NUMBER) {
								{
								setState(808);
								match(NUMBER);
								}
							}

							setState(811);
							match(TAB);
							setState(812);
							match(NUMBER);
							setState(813);
							match(TAB);
							setState(814);
							match(NUMBER);
							setState(815);
							match(TAB);
							setState(817);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NUMBER) {
								{
								setState(816);
								match(NUMBER);
								}
							}

							setState(819);
							match(TAB);
							setState(820);
							match(TAB);
							setState(821);
							match(NUMBER);
							setState(822);
							match(TAB);
							setState(823);
							match(NUMBER);
							setState(824);
							match(TAB);
							setState(825);
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
						setState(831); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TAB || _la==DATE );
					setState(833);
					match(WORD);
					setState(834);
					match(TAB);
					setState(835);
					match(WORD);
					setState(836);
					match(TAB);
					setState(837);
					match(DATE);
					setState(838);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(842); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(844);
			match(KEYWORD);
			setState(845);
			match(TAB);
			setState(846);
			match(WORD);
			setState(847);
			match(WORD);
			setState(848);
			match(WORD);
			setState(849);
			match(TAB);
			setState(850);
			match(WORD);
			setState(851);
			match(TAB);
			setState(852);
			match(WORD);
			setState(853);
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
		enterRule(_localctx, 18, RULE_extractTextStockPrice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(KEYWORD);
			setState(856);
			match(TAB);
			setState(857);
			match(WORD);
			setState(858);
			match(WORD);
			setState(859);
			match(WORD);
			setState(860);
			match(TAB);
			setState(861);
			match(WORD);
			setState(862);
			match(TAB);
			setState(863);
			match(WORD);
			setState(864);
			match(NEWLINE);
			setState(918); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(865);
				((ExtractTextStockPriceContext)_localctx).code = match(NUMBER);
				setState(866);
				match(TAB);
				setState(868); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(867);
					word();
					}
					}
					setState(870); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(872);
				match(NEWLINE);
				setState(873);
				match(WORD);
				setState(874);
				match(TAB);
				setState(875);
				match(WORD);
				setState(876);
				match(TAB);
				setState(877);
				match(WORD);
				setState(878);
				match(TAB);
				setState(879);
				match(WORD);
				setState(880);
				match(TAB);
				setState(881);
				match(WORD);
				setState(882);
				match(TAB);
				setState(883);
				match(WORD);
				setState(884);
				match(TAB);
				setState(885);
				match(WORD);
				setState(886);
				match(TAB);
				setState(887);
				match(NEWLINE);
				setState(907); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(907);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAB:
						{
						{
						setState(888);
						match(TAB);
						setState(889);
						match(NEWLINE);
						}
						}
						break;
					case DATE:
						{
						{
						setState(890);
						((ExtractTextStockPriceContext)_localctx).DATE = match(DATE);
						setState(891);
						match(TAB);
						setState(892);
						((ExtractTextStockPriceContext)_localctx).closing = match(NUMBER);
						setState(893);
						match(TAB);
						setState(894);
						match(NUMBER);
						setState(895);
						match(TAB);
						setState(896);
						((ExtractTextStockPriceContext)_localctx).market = match(NUMBER);
						setState(897);
						match(TAB);
						setState(898);
						((ExtractTextStockPriceContext)_localctx).high = match(NUMBER);
						setState(899);
						match(TAB);
						setState(900);
						((ExtractTextStockPriceContext)_localctx).low = match(NUMBER);
						setState(901);
						match(TAB);
						setState(902);
						((ExtractTextStockPriceContext)_localctx).volume = match(NUMBER);
						setState(903);
						match(TAB);
						setState(904);
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
					setState(909); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TAB || _la==DATE );
				setState(911);
				match(WORD);
				setState(912);
				match(TAB);
				setState(913);
				match(WORD);
				setState(914);
				match(TAB);
				setState(915);
				((ExtractTextStockPriceContext)_localctx).DATE = match(DATE);
				setState(916);
				match(NEWLINE);
				}
				}
				setState(920); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(922);
			match(KEYWORD);
			setState(923);
			match(TAB);
			setState(924);
			match(WORD);
			setState(925);
			match(WORD);
			setState(926);
			match(WORD);
			setState(927);
			match(TAB);
			setState(928);
			match(WORD);
			setState(929);
			match(TAB);
			setState(930);
			match(WORD);
			setState(931);
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
		enterRule(_localctx, 20, RULE_seibroDividend);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(934); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(933);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(936); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(938);
			match(WORD);
			setState(939);
			match(WORD);
			setState(940);
			match(WORD);
			setState(941);
			match(WORD);
			setState(942);
			match(WORD);
			setState(943);
			match(WORD);
			setState(944);
			match(NEWLINE);
			setState(946); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(945);
					seibroDividendItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(948); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(950);
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
		enterRule(_localctx, 22, RULE_seibroDividendItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			((SeibroDividendItemContext)_localctx).base = match(DATE);
			setState(953);
			match(NEWLINE);
			setState(956);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(954);
				((SeibroDividendItemContext)_localctx).pay = match(DATE);
				setState(955);
				match(NEWLINE);
				}
				break;
			}
			setState(958);
			((SeibroDividendItemContext)_localctx).code = word();
			setState(959);
			match(NEWLINE);
			setState(960);
			((SeibroDividendItemContext)_localctx).symbol = word();
			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(961);
				word();
				}
				}
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(967);
			match(NEWLINE);
			setState(968);
			match(WORD);
			setState(969);
			match(NEWLINE);
			setState(970);
			match(WORD);
			setState(971);
			match(NEWLINE);
			setState(972);
			match(WORD);
			setState(973);
			match(NEWLINE);
			setState(974);
			match(WORD);
			setState(975);
			match(NEWLINE);
			setState(976);
			((SeibroDividendItemContext)_localctx).dividend = match(NUMBER);
			setState(977);
			match(NEWLINE);
			setState(978);
			match(NUMBER);
			setState(979);
			match(NEWLINE);
			setState(980);
			match(NUMBER);
			setState(981);
			match(NEWLINE);
			setState(982);
			match(NUMBER);
			setState(983);
			match(NEWLINE);
			setState(984);
			match(NUMBER);
			setState(985);
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
		enterRule(_localctx, 24, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
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
		enterRule(_localctx, 26, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(992);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(990);
					word();
					}
					break;
				case TAB:
					{
					setState(991);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(994); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(996);
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
		enterRule(_localctx, 28, RULE_eof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1001);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(998);
					word();
					}
					break;
				case TAB:
					{
					setState(999);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(1000);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1003); 
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
		"\u0004\u0001\n\u03ee\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000(\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"8\b\u0001\u000b\u0001\f\u00019\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u0001d\b\u0001\u000b\u0001\f\u0001e\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"o\b\u0001\u000b\u0001\f\u0001p\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u0090\b\u0002\u0001\u0002\u0003\u0002\u0093"+
		"\b\u0002\u0001\u0002\u0003\u0002\u0096\b\u0002\u0001\u0002\u0003\u0002"+
		"\u0099\b\u0002\u0001\u0002\u0003\u0002\u009c\b\u0002\u0001\u0002\u0003"+
		"\u0002\u009f\b\u0002\u0001\u0002\u0005\u0002\u00a2\b\u0002\n\u0002\f\u0002"+
		"\u00a5\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u00ab\b\u0002\u0001\u0002\u0003\u0002\u00ae\b\u0002\u0001\u0002\u0003"+
		"\u0002\u00b1\b\u0002\u0001\u0002\u0003\u0002\u00b4\b\u0002\u0001\u0002"+
		"\u0003\u0002\u00b7\b\u0002\u0001\u0002\u0003\u0002\u00ba\b\u0002\u0001"+
		"\u0002\u0003\u0002\u00bd\b\u0002\u0001\u0002\u0005\u0002\u00c0\b\u0002"+
		"\n\u0002\f\u0002\u00c3\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u00c9\b\u0002\u0001\u0002\u0003\u0002\u00cc\b\u0002"+
		"\u0001\u0002\u0003\u0002\u00cf\b\u0002\u0001\u0002\u0003\u0002\u00d2\b"+
		"\u0002\u0001\u0002\u0003\u0002\u00d5\b\u0002\u0001\u0002\u0003\u0002\u00d8"+
		"\b\u0002\u0001\u0002\u0003\u0002\u00db\b\u0002\u0001\u0002\u0005\u0002"+
		"\u00de\b\u0002\n\u0002\f\u0002\u00e1\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u00f5\b\u0002\u000b"+
		"\u0002\f\u0002\u00f6\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0130\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0004\u0003\u0134\b\u0003\u000b\u0003\f\u0003\u0135\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003"+
		"\u014a\b\u0003\u000b\u0003\f\u0003\u014b\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u0155"+
		"\b\u0003\u000b\u0003\f\u0003\u0156\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u0174\b\u0004\n\u0004\f\u0004\u0177\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u017c\b\u0004\u0001\u0004\u0003\u0004\u017f"+
		"\b\u0004\u0001\u0004\u0003\u0004\u0182\b\u0004\u0001\u0004\u0003\u0004"+
		"\u0185\b\u0004\u0001\u0004\u0003\u0004\u0188\b\u0004\u0001\u0004\u0003"+
		"\u0004\u018b\b\u0004\u0001\u0004\u0005\u0004\u018e\b\u0004\n\u0004\f\u0004"+
		"\u0191\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0196\b"+
		"\u0004\u0001\u0004\u0003\u0004\u0199\b\u0004\u0001\u0004\u0003\u0004\u019c"+
		"\b\u0004\u0001\u0004\u0003\u0004\u019f\b\u0004\u0001\u0004\u0003\u0004"+
		"\u01a2\b\u0004\u0001\u0004\u0003\u0004\u01a5\b\u0004\u0001\u0004\u0005"+
		"\u0004\u01a8\b\u0004\n\u0004\f\u0004\u01ab\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u01b0\b\u0004\n\u0004\f\u0004\u01b3\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u01c0"+
		"\b\u0004\u000b\u0004\f\u0004\u01c1\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u01d4\b\u0005\u0001\u0005\u0003\u0005\u01d7\b"+
		"\u0005\u0001\u0005\u0003\u0005\u01da\b\u0005\u0001\u0005\u0003\u0005\u01dd"+
		"\b\u0005\u0001\u0005\u0003\u0005\u01e0\b\u0005\u0001\u0005\u0003\u0005"+
		"\u01e3\b\u0005\u0001\u0005\u0005\u0005\u01e6\b\u0005\n\u0005\f\u0005\u01e9"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u01ee\b\u0005"+
		"\u000b\u0005\f\u0005\u01ef\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0221\b\u0006\u0001\u0006\u0003\u0006\u0224\b"+
		"\u0006\u0001\u0006\u0003\u0006\u0227\b\u0006\u0001\u0006\u0003\u0006\u022a"+
		"\b\u0006\u0001\u0006\u0003\u0006\u022d\b\u0006\u0001\u0006\u0003\u0006"+
		"\u0230\b\u0006\u0001\u0006\u0005\u0006\u0233\b\u0006\n\u0006\f\u0006\u0236"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u023d\b\u0006\n\u0006\f\u0006\u0240\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0244\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0248\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u024c\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0250\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0254"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0258\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u026a\b\u0006\u000b\u0006"+
		"\f\u0006\u026b\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0004\u0006\u0274\b\u0006\u000b\u0006\f\u0006\u0275\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u0289"+
		"\b\u0007\u0001\u0007\u0003\u0007\u028c\b\u0007\u0001\u0007\u0003\u0007"+
		"\u028f\b\u0007\u0001\u0007\u0003\u0007\u0292\b\u0007\u0001\u0007\u0003"+
		"\u0007\u0295\b\u0007\u0001\u0007\u0003\u0007\u0298\b\u0007\u0001\u0007"+
		"\u0005\u0007\u029b\b\u0007\n\u0007\f\u0007\u029e\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02a5\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u02c8\b\b\u000b\b\f"+
		"\b\u02c9\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0310\b\b\u0001"+
		"\b\u0001\b\u0003\b\u0314\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u031a"+
		"\b\b\u000b\b\f\b\u031b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u032a\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0332\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004"+
		"\b\u033e\b\b\u000b\b\f\b\u033f\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0004\b\u0349\b\b\u000b\b\f\b\u034a\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0004\t\u0365\b\t\u000b\t\f\t\u0366\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u038c"+
		"\b\t\u000b\t\f\t\u038d\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0004\t\u0397\b\t\u000b\t\f\t\u0398\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0004"+
		"\n\u03a7\b\n\u000b\n\f\n\u03a8\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0004\n\u03b3\b\n\u000b\n\f\n\u03b4\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u03bd\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u03c3"+
		"\b\u000b\n\u000b\f\u000b\u03c6\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0004\r\u03e1\b\r\u000b\r\f\r\u03e2\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u03ea\b\u000e"+
		"\u000b\u000e\f\u000e\u03eb\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0001"+
		"\u0001\u0000\u0005\n\u044e\u0000\'\u0001\u0000\u0000\u0000\u0002)\u0001"+
		"\u0000\u0000\u0000\u0004~\u0001\u0000\u0000\u0000\u0006\u0104\u0001\u0000"+
		"\u0000\u0000\b\u0165\u0001\u0000\u0000\u0000\n\u01ed\u0001\u0000\u0000"+
		"\u0000\f\u01f8\u0001\u0000\u0000\u0000\u000e\u0286\u0001\u0000\u0000\u0000"+
		"\u0010\u02b8\u0001\u0000\u0000\u0000\u0012\u0357\u0001\u0000\u0000\u0000"+
		"\u0014\u03a6\u0001\u0000\u0000\u0000\u0016\u03b8\u0001\u0000\u0000\u0000"+
		"\u0018\u03dc\u0001\u0000\u0000\u0000\u001a\u03e0\u0001\u0000\u0000\u0000"+
		"\u001c\u03e9\u0001\u0000\u0000\u0000\u001e(\u0003\u0012\t\u0000\u001f"+
		"(\u0003\u0010\b\u0000 (\u0003\u0014\n\u0000!(\u0003\f\u0006\u0000\"(\u0003"+
		"\n\u0005\u0000#(\u0003\b\u0004\u0000$(\u0003\u0006\u0003\u0000%(\u0003"+
		"\u0004\u0002\u0000&(\u0003\u0002\u0001\u0000\'\u001e\u0001\u0000\u0000"+
		"\u0000\'\u001f\u0001\u0000\u0000\u0000\' \u0001\u0000\u0000\u0000\'!\u0001"+
		"\u0000\u0000\u0000\'\"\u0001\u0000\u0000\u0000\'#\u0001\u0000\u0000\u0000"+
		"\'$\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'&\u0001\u0000"+
		"\u0000\u0000(\u0001\u0001\u0000\u0000\u0000)*\u0005\u0005\u0000\u0000"+
		"*+\u0005\u0003\u0000\u0000+,\u0005\n\u0000\u0000,-\u0005\n\u0000\u0000"+
		"-.\u0005\u0003\u0000\u0000./\u0005\n\u0000\u0000/0\u0005\u0003\u0000\u0000"+
		"01\u0005\n\u0000\u000012\u0005\u0003\u0000\u000023\u0005\n\u0000\u0000"+
		"3n\u0005\u0004\u0000\u000045\u0005\b\u0000\u000057\u0005\u0003\u0000\u0000"+
		"68\u0003\u0018\f\u000076\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000"+
		"\u0000;<\u0005\u0004\u0000\u0000<=\u0005\n\u0000\u0000=>\u0005\u0003\u0000"+
		"\u0000>?\u0005\n\u0000\u0000?@\u0005\u0003\u0000\u0000@A\u0005\n\u0000"+
		"\u0000AB\u0005\u0003\u0000\u0000BC\u0005\n\u0000\u0000CD\u0005\u0003\u0000"+
		"\u0000DE\u0005\n\u0000\u0000EF\u0005\u0003\u0000\u0000FG\u0005\n\u0000"+
		"\u0000GH\u0005\u0003\u0000\u0000HI\u0005\n\u0000\u0000IJ\u0005\u0003\u0000"+
		"\u0000Jc\u0005\u0004\u0000\u0000KL\u0005\u0003\u0000\u0000LM\u0005\u0003"+
		"\u0000\u0000MN\u0005\u0003\u0000\u0000NO\u0005\u0003\u0000\u0000OP\u0005"+
		"\u0003\u0000\u0000PQ\u0005\u0003\u0000\u0000QR\u0005\u0003\u0000\u0000"+
		"Rd\u0005\u0004\u0000\u0000ST\u0005\u0006\u0000\u0000TU\u0005\u0003\u0000"+
		"\u0000UV\u0005\b\u0000\u0000VW\u0005\u0003\u0000\u0000WX\u0005\b\u0000"+
		"\u0000XY\u0005\u0003\u0000\u0000YZ\u0005\b\u0000\u0000Z[\u0005\u0003\u0000"+
		"\u0000[\\\u0005\b\u0000\u0000\\]\u0005\u0003\u0000\u0000]^\u0005\b\u0000"+
		"\u0000^_\u0005\u0003\u0000\u0000_`\u0005\b\u0000\u0000`a\u0005\u0003\u0000"+
		"\u0000ab\u0005\u0004\u0000\u0000bd\u0006\u0001\uffff\uffff\u0000cK\u0001"+
		"\u0000\u0000\u0000cS\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gh\u0005\n\u0000\u0000hi\u0005\u0003\u0000\u0000ij\u0005\n\u0000"+
		"\u0000jk\u0005\u0003\u0000\u0000kl\u0005\u0006\u0000\u0000lm\u0005\u0004"+
		"\u0000\u0000mo\u0001\u0000\u0000\u0000n4\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rs\u0005\u0005\u0000\u0000st\u0005\u0003\u0000"+
		"\u0000tu\u0005\n\u0000\u0000uv\u0005\n\u0000\u0000vw\u0005\u0003\u0000"+
		"\u0000wx\u0005\n\u0000\u0000xy\u0005\u0003\u0000\u0000yz\u0005\n\u0000"+
		"\u0000z{\u0005\u0003\u0000\u0000{|\u0005\n\u0000\u0000|}\u0005\u0004\u0000"+
		"\u0000}\u0003\u0001\u0000\u0000\u0000~\u007f\u0005\u0005\u0000\u0000\u007f"+
		"\u0080\u0005\u0003\u0000\u0000\u0080\u0081\u0005\n\u0000\u0000\u0081\u0082"+
		"\u0005\n\u0000\u0000\u0082\u0083\u0005\u0003\u0000\u0000\u0083\u0084\u0005"+
		"\n\u0000\u0000\u0084\u0085\u0005\u0003\u0000\u0000\u0085\u0086\u0005\n"+
		"\u0000\u0000\u0086\u0087\u0005\u0003\u0000\u0000\u0087\u0088\u0005\n\u0000"+
		"\u0000\u0088\u00f4\u0005\u0004\u0000\u0000\u0089\u008a\u0005\u0005\u0000"+
		"\u0000\u008a\u008b\u0005\u0003\u0000\u0000\u008b\u008c\u0005\b\u0000\u0000"+
		"\u008c\u008d\u0005\u0003\u0000\u0000\u008d\u008f\u0003\u0018\f\u0000\u008e"+
		"\u0090\u0003\u0018\f\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u0093"+
		"\u0003\u0018\f\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0096\u0003"+
		"\u0018\f\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0099\u0003\u0018"+
		"\f\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u009c\u0003\u0018\f\u0000"+
		"\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009f\u0003\u0018\f\u0000\u009e"+
		"\u009d\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a0\u00a2\u0003\u0018\f\u0000\u00a1\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0005\u0004\u0000\u0000\u00a7\u00a8\u0005\u0005\u0000\u0000\u00a8\u00aa"+
		"\u0005\u0003\u0000\u0000\u00a9\u00ab\u0003\u0018\f\u0000\u00aa\u00a9\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ae\u0003\u0018\f\u0000\u00ad\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000"+
		"\u0000\u0000\u00af\u00b1\u0003\u0018\f\u0000\u00b0\u00af\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b4\u0003\u0018\f\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b7\u0003\u0018\f\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8"+
		"\u00ba\u0003\u0018\f\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00bd"+
		"\u0003\u0018\f\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bd\u00c1\u0001\u0000\u0000\u0000\u00be\u00c0\u0003"+
		"\u0018\f\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0005\u0004\u0000\u0000\u00c5\u00c6\u0005\u0005"+
		"\u0000\u0000\u00c6\u00c8\u0005\u0003\u0000\u0000\u00c7\u00c9\u0003\u0018"+
		"\f\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00cc\u0003\u0018\f\u0000"+
		"\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00cf\u0003\u0018\f\u0000\u00ce"+
		"\u00cd\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d0\u00d2\u0003\u0018\f\u0000\u00d1\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d5\u0003\u0018\f\u0000\u00d4\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d8\u0003\u0018\f\u0000\u00d7\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da\u0001\u0000"+
		"\u0000\u0000\u00d9\u00db\u0003\u0018\f\u0000\u00da\u00d9\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00df\u0001\u0000\u0000"+
		"\u0000\u00dc\u00de\u0003\u0018\f\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000"+
		"\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u0004\u0000\u0000"+
		"\u00e3\u00e4\u0005\u0005\u0000\u0000\u00e4\u00e5\u0005\u0003\u0000\u0000"+
		"\u00e5\u00e6\u0005\b\u0000\u0000\u00e6\u00e7\u0005\n\u0000\u0000\u00e7"+
		"\u00e8\u0005\u0004\u0000\u0000\u00e8\u00e9\u0005\u0005\u0000\u0000\u00e9"+
		"\u00ea\u0005\u0003\u0000\u0000\u00ea\u00eb\u0005\u0006\u0000\u0000\u00eb"+
		"\u00ec\u0005\u0004\u0000\u0000\u00ec\u00ed\u0005\n\u0000\u0000\u00ed\u00ee"+
		"\u0005\u0003\u0000\u0000\u00ee\u00ef\u0005\n\u0000\u0000\u00ef\u00f0\u0005"+
		"\u0003\u0000\u0000\u00f0\u00f1\u0005\u0006\u0000\u0000\u00f1\u00f2\u0005"+
		"\u0004\u0000\u0000\u00f2\u00f3\u0006\u0002\uffff\uffff\u0000\u00f3\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f4\u0089\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\u0005\u0005\u0000\u0000\u00f9\u00fa\u0005\u0003\u0000\u0000\u00fa\u00fb"+
		"\u0005\n\u0000\u0000\u00fb\u00fc\u0005\n\u0000\u0000\u00fc\u00fd\u0005"+
		"\u0003\u0000\u0000\u00fd\u00fe\u0005\n\u0000\u0000\u00fe\u00ff\u0005\u0003"+
		"\u0000\u0000\u00ff\u0100\u0005\n\u0000\u0000\u0100\u0101\u0005\u0003\u0000"+
		"\u0000\u0101\u0102\u0005\n\u0000\u0000\u0102\u0103\u0005\u0004\u0000\u0000"+
		"\u0103\u0005\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u0005\u0000\u0000"+
		"\u0105\u0106\u0005\u0003\u0000\u0000\u0106\u0107\u0005\n\u0000\u0000\u0107"+
		"\u0108\u0005\u0003\u0000\u0000\u0108\u0109\u0005\n\u0000\u0000\u0109\u010a"+
		"\u0005\n\u0000\u0000\u010a\u010b\u0005\n\u0000\u0000\u010b\u010c\u0005"+
		"\u0003\u0000\u0000\u010c\u010d\u0005\n\u0000\u0000\u010d\u010e\u0005\u0003"+
		"\u0000\u0000\u010e\u010f\u0005\n\u0000\u0000\u010f\u0154\u0005\u0004\u0000"+
		"\u0000\u0110\u0111\u0005\n\u0000\u0000\u0111\u0112\u0005\u0003\u0000\u0000"+
		"\u0112\u0113\u0005\u0004\u0000\u0000\u0113\u0114\u0005\n\u0000\u0000\u0114"+
		"\u0115\u0005\u0003\u0000\u0000\u0115\u0116\u0005\n\u0000\u0000\u0116\u0117"+
		"\u0005\u0003\u0000\u0000\u0117\u0118\u0005\n\u0000\u0000\u0118\u0119\u0005"+
		"\u0003\u0000\u0000\u0119\u011a\u0005\n\u0000\u0000\u011a\u011b\u0005\u0003"+
		"\u0000\u0000\u011b\u011c\u0005\n\u0000\u0000\u011c\u011d\u0005\u0003\u0000"+
		"\u0000\u011d\u011e\u0005\n\u0000\u0000\u011e\u011f\u0005\u0003\u0000\u0000"+
		"\u011f\u0120\u0005\n\u0000\u0000\u0120\u0121\u0005\u0003\u0000\u0000\u0121"+
		"\u0122\u0005\n\u0000\u0000\u0122\u0123\u0005\u0003\u0000\u0000\u0123\u0124"+
		"\u0005\n\u0000\u0000\u0124\u0125\u0005\u0003\u0000\u0000\u0125\u0126\u0005"+
		"\n\u0000\u0000\u0126\u0127\u0005\u0003\u0000\u0000\u0127\u0128\u0005\n"+
		"\u0000\u0000\u0128\u0129\u0005\u0003\u0000\u0000\u0129\u0149\u0005\u0004"+
		"\u0000\u0000\u012a\u012b\u0005\n\u0000\u0000\u012b\u012c\u0005\u0003\u0000"+
		"\u0000\u012c\u012d\u0005\b\u0000\u0000\u012d\u012f\u0005\u0003\u0000\u0000"+
		"\u012e\u0130\u0005\b\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131"+
		"\u0133\u0005\u0003\u0000\u0000\u0132\u0134\u0003\u0018\f\u0000\u0133\u0132"+
		"\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0133"+
		"\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0137"+
		"\u0001\u0000\u0000\u0000\u0137\u0138\u0005\u0003\u0000\u0000\u0138\u0139"+
		"\u0005\n\u0000\u0000\u0139\u013a\u0005\u0003\u0000\u0000\u013a\u013b\u0005"+
		"\n\u0000\u0000\u013b\u013c\u0005\u0003\u0000\u0000\u013c\u013d\u0005\b"+
		"\u0000\u0000\u013d\u013e\u0005\u0003\u0000\u0000\u013e\u013f\u0005\b\u0000"+
		"\u0000\u013f\u0140\u0005\u0003\u0000\u0000\u0140\u0141\u0005\b\u0000\u0000"+
		"\u0141\u0142\u0005\u0003\u0000\u0000\u0142\u0143\u0005\b\u0000\u0000\u0143"+
		"\u0144\u0005\u0003\u0000\u0000\u0144\u0145\u0005\b\u0000\u0000\u0145\u0146"+
		"\u0005\u0003\u0000\u0000\u0146\u0147\u0005\u0004\u0000\u0000\u0147\u0148"+
		"\u0006\u0003\uffff\uffff\u0000\u0148\u014a\u0001\u0000\u0000\u0000\u0149"+
		"\u012a\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b"+
		"\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0001\u0000\u0000\u0000\u014d\u014e\u0005\n\u0000\u0000\u014e\u014f"+
		"\u0005\u0003\u0000\u0000\u014f\u0150\u0005\n\u0000\u0000\u0150\u0151\u0005"+
		"\u0003\u0000\u0000\u0151\u0152\u0005\u0006\u0000\u0000\u0152\u0153\u0005"+
		"\u0004\u0000\u0000\u0153\u0155\u0001\u0000\u0000\u0000\u0154\u0110\u0001"+
		"\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0154\u0001"+
		"\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0158\u0001"+
		"\u0000\u0000\u0000\u0158\u0159\u0005\u0005\u0000\u0000\u0159\u015a\u0005"+
		"\u0003\u0000\u0000\u015a\u015b\u0005\n\u0000\u0000\u015b\u015c\u0005\u0003"+
		"\u0000\u0000\u015c\u015d\u0005\n\u0000\u0000\u015d\u015e\u0005\n\u0000"+
		"\u0000\u015e\u015f\u0005\n\u0000\u0000\u015f\u0160\u0005\u0003\u0000\u0000"+
		"\u0160\u0161\u0005\n\u0000\u0000\u0161\u0162\u0005\u0003\u0000\u0000\u0162"+
		"\u0163\u0005\n\u0000\u0000\u0163\u0164\u0005\u0004\u0000\u0000\u0164\u0007"+
		"\u0001\u0000\u0000\u0000\u0165\u0166\u0005\u0005\u0000\u0000\u0166\u0167"+
		"\u0005\u0003\u0000\u0000\u0167\u0168\u0005\n\u0000\u0000\u0168\u0169\u0005"+
		"\n\u0000\u0000\u0169\u016a\u0005\u0003\u0000\u0000\u016a\u016b\u0005\n"+
		"\u0000\u0000\u016b\u016c\u0005\u0003\u0000\u0000\u016c\u016d\u0005\n\u0000"+
		"\u0000\u016d\u01bf\u0005\u0004\u0000\u0000\u016e\u016f\u0005\u0005\u0000"+
		"\u0000\u016f\u0170\u0005\u0003\u0000\u0000\u0170\u0171\u0005\b\u0000\u0000"+
		"\u0171\u0175\u0005\u0003\u0000\u0000\u0172\u0174\u0003\u0018\f\u0000\u0173"+
		"\u0172\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175"+
		"\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176"+
		"\u0178\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0178"+
		"\u0179\u0005\u0004\u0000\u0000\u0179\u017b\u0003\u0018\f\u0000\u017a\u017c"+
		"\u0003\u0018\f\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017b\u017c\u0001"+
		"\u0000\u0000\u0000\u017c\u017e\u0001\u0000\u0000\u0000\u017d\u017f\u0003"+
		"\u0018\f\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000"+
		"\u0000\u0000\u017f\u0181\u0001\u0000\u0000\u0000\u0180\u0182\u0003\u0018"+
		"\f\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000"+
		"\u0000\u0182\u0184\u0001\u0000\u0000\u0000\u0183\u0185\u0003\u0018\f\u0000"+
		"\u0184\u0183\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000"+
		"\u0185\u0187\u0001\u0000\u0000\u0000\u0186\u0188\u0003\u0018\f\u0000\u0187"+
		"\u0186\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188"+
		"\u018a\u0001\u0000\u0000\u0000\u0189\u018b\u0003\u0018\f\u0000\u018a\u0189"+
		"\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018f"+
		"\u0001\u0000\u0000\u0000\u018c\u018e\u0003\u0018\f\u0000\u018d\u018c\u0001"+
		"\u0000\u0000\u0000\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u018d\u0001"+
		"\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0192\u0001"+
		"\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0193\u0005"+
		"\u0004\u0000\u0000\u0193\u0195\u0003\u0018\f\u0000\u0194\u0196\u0003\u0018"+
		"\f\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000"+
		"\u0000\u0196\u0198\u0001\u0000\u0000\u0000\u0197\u0199\u0003\u0018\f\u0000"+
		"\u0198\u0197\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000"+
		"\u0199\u019b\u0001\u0000\u0000\u0000\u019a\u019c\u0003\u0018\f\u0000\u019b"+
		"\u019a\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c"+
		"\u019e\u0001\u0000\u0000\u0000\u019d\u019f\u0003\u0018\f\u0000\u019e\u019d"+
		"\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a2\u0003\u0018\f\u0000\u01a1\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a5\u0003\u0018\f\u0000\u01a4\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a9\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a8\u0003\u0018\f\u0000\u01a7\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a8\u01ab\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ac\u0001\u0000\u0000"+
		"\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005\u0004\u0000"+
		"\u0000\u01ad\u01b1\u0005\u0006\u0000\u0000\u01ae\u01b0\u0005\n\u0000\u0000"+
		"\u01af\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b4\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b5\u0005\u0004\u0000\u0000\u01b5\u01b6\u0003\u0018\f\u0000\u01b6"+
		"\u01b7\u0005\u0004\u0000\u0000\u01b7\u01b8\u0005\n\u0000\u0000\u01b8\u01b9"+
		"\u0005\u0003\u0000\u0000\u01b9\u01ba\u0005\n\u0000\u0000\u01ba\u01bb\u0005"+
		"\u0003\u0000\u0000\u01bb\u01bc\u0005\u0006\u0000\u0000\u01bc\u01bd\u0005"+
		"\u0004\u0000\u0000\u01bd\u01be\u0006\u0004\uffff\uffff\u0000\u01be\u01c0"+
		"\u0001\u0000\u0000\u0000\u01bf\u016e\u0001\u0000\u0000\u0000\u01c0\u01c1"+
		"\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c4"+
		"\u0005\u0005\u0000\u0000\u01c4\u01c5\u0005\u0003\u0000\u0000\u01c5\u01c6"+
		"\u0005\n\u0000\u0000\u01c6\u01c7\u0005\n\u0000\u0000\u01c7\u01c8\u0005"+
		"\u0003\u0000\u0000\u01c8\u01c9\u0005\n\u0000\u0000\u01c9\u01ca\u0005\u0003"+
		"\u0000\u0000\u01ca\u01cb\u0005\n\u0000\u0000\u01cb\u01cc\u0005\u0004\u0000"+
		"\u0000\u01cc\t\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005\u0005\u0000\u0000"+
		"\u01ce\u01cf\u0005\u0003\u0000\u0000\u01cf\u01d0\u0005\n\u0000\u0000\u01d0"+
		"\u01d1\u0005\u0003\u0000\u0000\u01d1\u01d3\u0003\u0018\f\u0000\u01d2\u01d4"+
		"\u0003\u0018\f\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000\u01d5\u01d7\u0003"+
		"\u0018\f\u0000\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d9\u0001\u0000\u0000\u0000\u01d8\u01da\u0003\u0018"+
		"\f\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000"+
		"\u0000\u01da\u01dc\u0001\u0000\u0000\u0000\u01db\u01dd\u0003\u0018\f\u0000"+
		"\u01dc\u01db\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000"+
		"\u01dd\u01df\u0001\u0000\u0000\u0000\u01de\u01e0\u0003\u0018\f\u0000\u01df"+
		"\u01de\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e1\u01e3\u0003\u0018\f\u0000\u01e2\u01e1"+
		"\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e7"+
		"\u0001\u0000\u0000\u0000\u01e4\u01e6\u0003\u0018\f\u0000\u01e5\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e9\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01ea\u0001"+
		"\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005"+
		"\u0004\u0000\u0000\u01eb\u01ec\u0006\u0005\uffff\uffff\u0000\u01ec\u01ee"+
		"\u0001\u0000\u0000\u0000\u01ed\u01cd\u0001\u0000\u0000\u0000\u01ee\u01ef"+
		"\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01ef\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f2"+
		"\u0005\n\u0000\u0000\u01f2\u01f3\u0005\u0003\u0000\u0000\u01f3\u01f4\u0005"+
		"\n\u0000\u0000\u01f4\u01f5\u0005\u0003\u0000\u0000\u01f5\u01f6\u0005\u0006"+
		"\u0000\u0000\u01f6\u01f7\u0005\u0004\u0000\u0000\u01f7\u000b\u0001\u0000"+
		"\u0000\u0000\u01f8\u01f9\u0005\u0005\u0000\u0000\u01f9\u01fa\u0005\u0003"+
		"\u0000\u0000\u01fa\u01fb\u0005\n\u0000\u0000\u01fb\u01fc\u0005\n\u0000"+
		"\u0000\u01fc\u01fd\u0005\n\u0000\u0000\u01fd\u01fe\u0005\u0003\u0000\u0000"+
		"\u01fe\u01ff\u0005\n\u0000\u0000\u01ff\u0200\u0005\n\u0000\u0000\u0200"+
		"\u0201\u0005\n\u0000\u0000\u0201\u0202\u0005\u0003\u0000\u0000\u0202\u0203"+
		"\u0005\n\u0000\u0000\u0203\u0204\u0005\u0003\u0000\u0000\u0204\u0205\u0005"+
		"\n\u0000\u0000\u0205\u0273\u0005\u0004\u0000\u0000\u0206\u0207\u0005\u0005"+
		"\u0000\u0000\u0207\u0208\u0005\u0003\u0000\u0000\u0208\u0209\u0005\b\u0000"+
		"\u0000\u0209\u020a\u0005\u0004\u0000\u0000\u020a\u020b\u0005\n\u0000\u0000"+
		"\u020b\u020c\u0005\u0003\u0000\u0000\u020c\u020d\u0005\u0003\u0000\u0000"+
		"\u020d\u020e\u0005\n\u0000\u0000\u020e\u020f\u0005\u0003\u0000\u0000\u020f"+
		"\u0210\u0005\n\u0000\u0000\u0210\u0211\u0005\u0003\u0000\u0000\u0211\u0212"+
		"\u0005\n\u0000\u0000\u0212\u0213\u0005\u0003\u0000\u0000\u0213\u0214\u0005"+
		"\n\u0000\u0000\u0214\u0215\u0005\u0003\u0000\u0000\u0215\u0216\u0005\n"+
		"\u0000\u0000\u0216\u0217\u0005\u0003\u0000\u0000\u0217\u0218\u0005\n\u0000"+
		"\u0000\u0218\u0219\u0005\u0003\u0000\u0000\u0219\u021a\u0005\n\u0000\u0000"+
		"\u021a\u021b\u0005\u0003\u0000\u0000\u021b\u021c\u0005\n\u0000\u0000\u021c"+
		"\u021d\u0005\u0003\u0000\u0000\u021d\u0269\u0005\u0004\u0000\u0000\u021e"+
		"\u0220\u0003\u0018\f\u0000\u021f\u0221\u0003\u0018\f\u0000\u0220\u021f"+
		"\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0221\u0223"+
		"\u0001\u0000\u0000\u0000\u0222\u0224\u0003\u0018\f\u0000\u0223\u0222\u0001"+
		"\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0226\u0001"+
		"\u0000\u0000\u0000\u0225\u0227\u0003\u0018\f\u0000\u0226\u0225\u0001\u0000"+
		"\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u0229\u0001\u0000"+
		"\u0000\u0000\u0228\u022a\u0003\u0018\f\u0000\u0229\u0228\u0001\u0000\u0000"+
		"\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u022c\u0001\u0000\u0000"+
		"\u0000\u022b\u022d\u0003\u0018\f\u0000\u022c\u022b\u0001\u0000\u0000\u0000"+
		"\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022f\u0001\u0000\u0000\u0000"+
		"\u022e\u0230\u0003\u0018\f\u0000\u022f\u022e\u0001\u0000\u0000\u0000\u022f"+
		"\u0230\u0001\u0000\u0000\u0000\u0230\u0234\u0001\u0000\u0000\u0000\u0231"+
		"\u0233\u0003\u0018\f\u0000\u0232\u0231\u0001\u0000\u0000\u0000\u0233\u0236"+
		"\u0001\u0000\u0000\u0000\u0234\u0232\u0001\u0000\u0000\u0000\u0234\u0235"+
		"\u0001\u0000\u0000\u0000\u0235\u0237\u0001\u0000\u0000\u0000\u0236\u0234"+
		"\u0001\u0000\u0000\u0000\u0237\u0238\u0005\u0003\u0000\u0000\u0238\u0239"+
		"\u0005\u0003\u0000\u0000\u0239\u023a\u0005\n\u0000\u0000\u023a\u023e\u0005"+
		"\u0003\u0000\u0000\u023b\u023d\u0003\u0018\f\u0000\u023c\u023b\u0001\u0000"+
		"\u0000\u0000\u023d\u0240\u0001\u0000\u0000\u0000\u023e\u023c\u0001\u0000"+
		"\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0241\u0001\u0000"+
		"\u0000\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0241\u0243\u0005\u0003"+
		"\u0000\u0000\u0242\u0244\u0005\u0006\u0000\u0000\u0243\u0242\u0001\u0000"+
		"\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000"+
		"\u0000\u0000\u0245\u0247\u0005\u0003\u0000\u0000\u0246\u0248\u0005\u0006"+
		"\u0000\u0000\u0247\u0246\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000"+
		"\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u024b\u0005\u0003"+
		"\u0000\u0000\u024a\u024c\u0005\n\u0000\u0000\u024b\u024a\u0001\u0000\u0000"+
		"\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000"+
		"\u0000\u024d\u024f\u0005\u0003\u0000\u0000\u024e\u0250\u0005\b\u0000\u0000"+
		"\u024f\u024e\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000\u0000\u0000"+
		"\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0253\u0005\u0003\u0000\u0000"+
		"\u0252\u0254\u0005\b\u0000\u0000\u0253\u0252\u0001\u0000\u0000\u0000\u0253"+
		"\u0254\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255"+
		"\u0257\u0005\u0003\u0000\u0000\u0256\u0258\u0005\b\u0000\u0000\u0257\u0256"+
		"\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258\u0259"+
		"\u0001\u0000\u0000\u0000\u0259\u025a\u0005\u0003\u0000\u0000\u025a\u025b"+
		"\u0005\u0004\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025c\u025d"+
		"\u0006\u0006\uffff\uffff\u0000\u025d\u026a\u0001\u0000\u0000\u0000\u025e"+
		"\u025f\u0005\u0003\u0000\u0000\u025f\u0260\u0005\u0003\u0000\u0000\u0260"+
		"\u0261\u0005\u0003\u0000\u0000\u0261\u0262\u0005\u0003\u0000\u0000\u0262"+
		"\u0263\u0005\u0003\u0000\u0000\u0263\u0264\u0005\u0003\u0000\u0000\u0264"+
		"\u0265\u0005\u0003\u0000\u0000\u0265\u0266\u0005\u0003\u0000\u0000\u0266"+
		"\u0267\u0005\u0003\u0000\u0000\u0267\u0268\u0005\u0003\u0000\u0000\u0268"+
		"\u026a\u0005\u0004\u0000\u0000\u0269\u021e\u0001\u0000\u0000\u0000\u0269"+
		"\u025e\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b"+
		"\u0269\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c"+
		"\u026d\u0001\u0000\u0000\u0000\u026d\u026e\u0005\n\u0000\u0000\u026e\u026f"+
		"\u0005\u0003\u0000\u0000\u026f\u0270\u0005\n\u0000\u0000\u0270\u0271\u0005"+
		"\u0003\u0000\u0000\u0271\u0272\u0005\u0006\u0000\u0000\u0272\u0274\u0005"+
		"\u0004\u0000\u0000\u0273\u0206\u0001\u0000\u0000\u0000\u0274\u0275\u0001"+
		"\u0000\u0000\u0000\u0275\u0273\u0001\u0000\u0000\u0000\u0275\u0276\u0001"+
		"\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0278\u0005"+
		"\u0005\u0000\u0000\u0278\u0279\u0005\u0003\u0000\u0000\u0279\u027a\u0005"+
		"\n\u0000\u0000\u027a\u027b\u0005\n\u0000\u0000\u027b\u027c\u0005\n\u0000"+
		"\u0000\u027c\u027d\u0005\u0003\u0000\u0000\u027d\u027e\u0005\n\u0000\u0000"+
		"\u027e\u027f\u0005\n\u0000\u0000\u027f\u0280\u0005\n\u0000\u0000\u0280"+
		"\u0281\u0005\u0003\u0000\u0000\u0281\u0282\u0005\n\u0000\u0000\u0282\u0283"+
		"\u0005\u0003\u0000\u0000\u0283\u0284\u0005\n\u0000\u0000\u0284\u0285\u0005"+
		"\u0004\u0000\u0000\u0285\r\u0001\u0000\u0000\u0000\u0286\u0288\u0003\u0018"+
		"\f\u0000\u0287\u0289\u0003\u0018\f\u0000\u0288\u0287\u0001\u0000\u0000"+
		"\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289\u028b\u0001\u0000\u0000"+
		"\u0000\u028a\u028c\u0003\u0018\f\u0000\u028b\u028a\u0001\u0000\u0000\u0000"+
		"\u028b\u028c\u0001\u0000\u0000\u0000\u028c\u028e\u0001\u0000\u0000\u0000"+
		"\u028d\u028f\u0003\u0018\f\u0000\u028e\u028d\u0001\u0000\u0000\u0000\u028e"+
		"\u028f\u0001\u0000\u0000\u0000\u028f\u0291\u0001\u0000\u0000\u0000\u0290"+
		"\u0292\u0003\u0018\f\u0000\u0291\u0290\u0001\u0000\u0000\u0000\u0291\u0292"+
		"\u0001\u0000\u0000\u0000\u0292\u0294\u0001\u0000\u0000\u0000\u0293\u0295"+
		"\u0003\u0018\f\u0000\u0294\u0293\u0001\u0000\u0000\u0000\u0294\u0295\u0001"+
		"\u0000\u0000\u0000\u0295\u0297\u0001\u0000\u0000\u0000\u0296\u0298\u0003"+
		"\u0018\f\u0000\u0297\u0296\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000"+
		"\u0000\u0000\u0298\u029c\u0001\u0000\u0000\u0000\u0299\u029b\u0003\u0018"+
		"\f\u0000\u029a\u0299\u0001\u0000\u0000\u0000\u029b\u029e\u0001\u0000\u0000"+
		"\u0000\u029c\u029a\u0001\u0000\u0000\u0000\u029c\u029d\u0001\u0000\u0000"+
		"\u0000\u029d\u029f\u0001\u0000\u0000\u0000\u029e\u029c\u0001\u0000\u0000"+
		"\u0000\u029f\u02a0\u0005\b\u0000\u0000\u02a0\u02a1\u0005\u0004\u0000\u0000"+
		"\u02a1\u02a2\u0005\n\u0000\u0000\u02a2\u02a4\u0005\n\u0000\u0000\u02a3"+
		"\u02a5\u0005\n\u0000\u0000\u02a4\u02a3\u0001\u0000\u0000\u0000\u02a4\u02a5"+
		"\u0001\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a7"+
		"\u0005\u0003\u0000\u0000\u02a7\u02a8\u0005\u0004\u0000\u0000\u02a8\u02a9"+
		"\u0005\n\u0000\u0000\u02a9\u02aa\u0005\u0003\u0000\u0000\u02aa\u02ab\u0005"+
		"\n\u0000\u0000\u02ab\u02ac\u0005\n\u0000\u0000\u02ac\u02ad\u0005\n\u0000"+
		"\u0000\u02ad\u02ae\u0005\n\u0000\u0000\u02ae\u02af\u0005\n\u0000\u0000"+
		"\u02af\u02b0\u0005\u0003\u0000\u0000\u02b0\u02b1\u0005\u0004\u0000\u0000"+
		"\u02b1\u02b2\u0005\n\u0000\u0000\u02b2\u02b3\u0005\u0003\u0000\u0000\u02b3"+
		"\u02b4\u0005\b\u0000\u0000\u02b4\u02b5\u0005\u0003\u0000\u0000\u02b5\u02b6"+
		"\u0005\u0004\u0000\u0000\u02b6\u02b7\u0006\u0007\uffff\uffff\u0000\u02b7"+
		"\u000f\u0001\u0000\u0000\u0000\u02b8\u02b9\u0005\u0005\u0000\u0000\u02b9"+
		"\u02ba\u0005\u0003\u0000\u0000\u02ba\u02bb\u0005\n\u0000\u0000\u02bb\u02bc"+
		"\u0005\n\u0000\u0000\u02bc\u02bd\u0005\n\u0000\u0000\u02bd\u02be\u0005"+
		"\u0003\u0000\u0000\u02be\u02bf\u0005\n\u0000\u0000\u02bf\u02c0\u0005\u0003"+
		"\u0000\u0000\u02c0\u02c1\u0005\n\u0000\u0000\u02c1\u0348\u0005\u0004\u0000"+
		"\u0000\u02c2\u02c3\u0005\u0005\u0000\u0000\u02c3\u02c4\u0005\u0003\u0000"+
		"\u0000\u02c4\u02c5\u0005\b\u0000\u0000\u02c5\u02c7\u0005\u0003\u0000\u0000"+
		"\u02c6\u02c8\u0003\u0018\f\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c8"+
		"\u02c9\u0001\u0000\u0000\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000\u02c9"+
		"\u02ca\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb"+
		"\u02cc\u0005\u0004\u0000\u0000\u02cc\u02cd\u0005\n\u0000\u0000\u02cd\u02ce"+
		"\u0005\u0003\u0000\u0000\u02ce\u02cf\u0005\n\u0000\u0000\u02cf\u02d0\u0005"+
		"\u0004\u0000\u0000\u02d0\u02d1\u0005\n\u0000\u0000\u02d1\u02d2\u0005\u0003"+
		"\u0000\u0000\u02d2\u02d3\u0005\n\u0000\u0000\u02d3\u02d4\u0005\u0004\u0000"+
		"\u0000\u02d4\u02d5\u0005\n\u0000\u0000\u02d5\u02d6\u0005\u0003\u0000\u0000"+
		"\u02d6\u02d7\u0005\n\u0000\u0000\u02d7\u02d8\u0005\u0003\u0000\u0000\u02d8"+
		"\u02d9\u0005\n\u0000\u0000\u02d9\u02da\u0005\u0003\u0000\u0000\u02da\u02db"+
		"\u0005\n\u0000\u0000\u02db\u02dc\u0005\u0003\u0000\u0000\u02dc\u02dd\u0005"+
		"\n\u0000\u0000\u02dd\u02de\u0005\u0003\u0000\u0000\u02de\u02df\u0005\n"+
		"\u0000\u0000\u02df\u02e0\u0005\u0003\u0000\u0000\u02e0\u02e1\u0005\n\u0000"+
		"\u0000\u02e1\u02e2\u0005\u0003\u0000\u0000\u02e2\u02e3\u0005\n\u0000\u0000"+
		"\u02e3\u02e4\u0005\u0003\u0000\u0000\u02e4\u02e5\u0005\n\u0000\u0000\u02e5"+
		"\u02e6\u0005\u0003\u0000\u0000\u02e6\u02e7\u0005\n\u0000\u0000\u02e7\u02e8"+
		"\u0005\u0003\u0000\u0000\u02e8\u02e9\u0005\n\u0000\u0000\u02e9\u02ea\u0005"+
		"\u0003\u0000\u0000\u02ea\u02eb\u0005\n\u0000\u0000\u02eb\u02ec\u0005\u0003"+
		"\u0000\u0000\u02ec\u02ed\u0005\u0004\u0000\u0000\u02ed\u02ee\u0005\n\u0000"+
		"\u0000\u02ee\u02ef\u0005\u0003\u0000\u0000\u02ef\u02f0\u0005\n\u0000\u0000"+
		"\u02f0\u02f1\u0005\u0003\u0000\u0000\u02f1\u02f2\u0005\n\u0000\u0000\u02f2"+
		"\u02f3\u0005\u0003\u0000\u0000\u02f3\u02f4\u0005\n\u0000\u0000\u02f4\u02f5"+
		"\u0005\u0003\u0000\u0000\u02f5\u02f6\u0005\n\u0000\u0000\u02f6\u02f7\u0005"+
		"\u0003\u0000\u0000\u02f7\u02f8\u0005\n\u0000\u0000\u02f8\u02f9\u0005\u0003"+
		"\u0000\u0000\u02f9\u033d\u0005\u0004\u0000\u0000\u02fa\u02fb\u0005\u0003"+
		"\u0000\u0000\u02fb\u02fc\u0005\u0003\u0000\u0000\u02fc\u02fd\u0005\u0003"+
		"\u0000\u0000\u02fd\u02fe\u0005\u0003\u0000\u0000\u02fe\u02ff\u0005\u0003"+
		"\u0000\u0000\u02ff\u0300\u0005\u0003\u0000\u0000\u0300\u0301\u0005\u0003"+
		"\u0000\u0000\u0301\u0302\u0005\u0003\u0000\u0000\u0302\u0303\u0005\u0003"+
		"\u0000\u0000\u0303\u0304\u0005\u0003\u0000\u0000\u0304\u0305\u0005\u0003"+
		"\u0000\u0000\u0305\u0306\u0005\u0003\u0000\u0000\u0306\u0307\u0005\u0003"+
		"\u0000\u0000\u0307\u0308\u0005\u0003\u0000\u0000\u0308\u0309\u0005\u0003"+
		"\u0000\u0000\u0309\u030a\u0005\u0003\u0000\u0000\u030a\u030b\u0005\u0003"+
		"\u0000\u0000\u030b\u033e\u0005\u0004\u0000\u0000\u030c\u030d\u0005\u0006"+
		"\u0000\u0000\u030d\u030f\u0005\u0003\u0000\u0000\u030e\u0310\u0005\u0006"+
		"\u0000\u0000\u030f\u030e\u0001\u0000\u0000\u0000\u030f\u0310\u0001\u0000"+
		"\u0000\u0000\u0310\u0311\u0001\u0000\u0000\u0000\u0311\u0313\u0005\u0003"+
		"\u0000\u0000\u0312\u0314\u0005\u0006\u0000\u0000\u0313\u0312\u0001\u0000"+
		"\u0000\u0000\u0313\u0314\u0001\u0000\u0000\u0000\u0314\u0315\u0001\u0000"+
		"\u0000\u0000\u0315\u0316\u0005\u0003\u0000\u0000\u0316\u0317\u0005\b\u0000"+
		"\u0000\u0317\u0319\u0005\u0003\u0000\u0000\u0318\u031a\u0003\u0018\f\u0000"+
		"\u0319\u0318\u0001\u0000\u0000\u0000\u031a\u031b\u0001\u0000\u0000\u0000"+
		"\u031b\u0319\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000\u0000\u0000"+
		"\u031c\u031d\u0001\u0000\u0000\u0000\u031d\u031e\u0005\u0003\u0000\u0000"+
		"\u031e\u031f\u0005\n\u0000\u0000\u031f\u0320\u0005\u0003\u0000\u0000\u0320"+
		"\u0321\u0005\n\u0000\u0000\u0321\u0322\u0005\u0003\u0000\u0000\u0322\u0323"+
		"\u0005\n\u0000\u0000\u0323\u0324\u0005\u0003\u0000\u0000\u0324\u0325\u0005"+
		"\n\u0000\u0000\u0325\u0326\u0005\u0003\u0000\u0000\u0326\u0327\u0005\b"+
		"\u0000\u0000\u0327\u0329\u0005\u0003\u0000\u0000\u0328\u032a\u0005\b\u0000"+
		"\u0000\u0329\u0328\u0001\u0000\u0000\u0000\u0329\u032a\u0001\u0000\u0000"+
		"\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b\u032c\u0005\u0003\u0000"+
		"\u0000\u032c\u032d\u0005\b\u0000\u0000\u032d\u032e\u0005\u0003\u0000\u0000"+
		"\u032e\u032f\u0005\b\u0000\u0000\u032f\u0331\u0005\u0003\u0000\u0000\u0330"+
		"\u0332\u0005\b\u0000\u0000\u0331\u0330\u0001\u0000\u0000\u0000\u0331\u0332"+
		"\u0001\u0000\u0000\u0000\u0332\u0333\u0001\u0000\u0000\u0000\u0333\u0334"+
		"\u0005\u0003\u0000\u0000\u0334\u0335\u0005\u0003\u0000\u0000\u0335\u0336"+
		"\u0005\b\u0000\u0000\u0336\u0337\u0005\u0003\u0000\u0000\u0337\u0338\u0005"+
		"\b\u0000\u0000\u0338\u0339\u0005\u0003\u0000\u0000\u0339\u033a\u0005\u0004"+
		"\u0000\u0000\u033a\u033b\u0001\u0000\u0000\u0000\u033b\u033c\u0006\b\uffff"+
		"\uffff\u0000\u033c\u033e\u0001\u0000\u0000\u0000\u033d\u02fa\u0001\u0000"+
		"\u0000\u0000\u033d\u030c\u0001\u0000\u0000\u0000\u033e\u033f\u0001\u0000"+
		"\u0000\u0000\u033f\u033d\u0001\u0000\u0000\u0000\u033f\u0340\u0001\u0000"+
		"\u0000\u0000\u0340\u0341\u0001\u0000\u0000\u0000\u0341\u0342\u0005\n\u0000"+
		"\u0000\u0342\u0343\u0005\u0003\u0000\u0000\u0343\u0344\u0005\n\u0000\u0000"+
		"\u0344\u0345\u0005\u0003\u0000\u0000\u0345\u0346\u0005\u0006\u0000\u0000"+
		"\u0346\u0347\u0005\u0004\u0000\u0000\u0347\u0349\u0001\u0000\u0000\u0000"+
		"\u0348\u02c2\u0001\u0000\u0000\u0000\u0349\u034a\u0001\u0000\u0000\u0000"+
		"\u034a\u0348\u0001\u0000\u0000\u0000\u034a\u034b\u0001\u0000\u0000\u0000"+
		"\u034b\u034c\u0001\u0000\u0000\u0000\u034c\u034d\u0005\u0005\u0000\u0000"+
		"\u034d\u034e\u0005\u0003\u0000\u0000\u034e\u034f\u0005\n\u0000\u0000\u034f"+
		"\u0350\u0005\n\u0000\u0000\u0350\u0351\u0005\n\u0000\u0000\u0351\u0352"+
		"\u0005\u0003\u0000\u0000\u0352\u0353\u0005\n\u0000\u0000\u0353\u0354\u0005"+
		"\u0003\u0000\u0000\u0354\u0355\u0005\n\u0000\u0000\u0355\u0356\u0005\u0004"+
		"\u0000\u0000\u0356\u0011\u0001\u0000\u0000\u0000\u0357\u0358\u0005\u0005"+
		"\u0000\u0000\u0358\u0359\u0005\u0003\u0000\u0000\u0359\u035a\u0005\n\u0000"+
		"\u0000\u035a\u035b\u0005\n\u0000\u0000\u035b\u035c\u0005\n\u0000\u0000"+
		"\u035c\u035d\u0005\u0003\u0000\u0000\u035d\u035e\u0005\n\u0000\u0000\u035e"+
		"\u035f\u0005\u0003\u0000\u0000\u035f\u0360\u0005\n\u0000\u0000\u0360\u0396"+
		"\u0005\u0004\u0000\u0000\u0361\u0362\u0005\b\u0000\u0000\u0362\u0364\u0005"+
		"\u0003\u0000\u0000\u0363\u0365\u0003\u0018\f\u0000\u0364\u0363\u0001\u0000"+
		"\u0000\u0000\u0365\u0366\u0001\u0000\u0000\u0000\u0366\u0364\u0001\u0000"+
		"\u0000\u0000\u0366\u0367\u0001\u0000\u0000\u0000\u0367\u0368\u0001\u0000"+
		"\u0000\u0000\u0368\u0369\u0005\u0004\u0000\u0000\u0369\u036a\u0005\n\u0000"+
		"\u0000\u036a\u036b\u0005\u0003\u0000\u0000\u036b\u036c\u0005\n\u0000\u0000"+
		"\u036c\u036d\u0005\u0003\u0000\u0000\u036d\u036e\u0005\n\u0000\u0000\u036e"+
		"\u036f\u0005\u0003\u0000\u0000\u036f\u0370\u0005\n\u0000\u0000\u0370\u0371"+
		"\u0005\u0003\u0000\u0000\u0371\u0372\u0005\n\u0000\u0000\u0372\u0373\u0005"+
		"\u0003\u0000\u0000\u0373\u0374\u0005\n\u0000\u0000\u0374\u0375\u0005\u0003"+
		"\u0000\u0000\u0375\u0376\u0005\n\u0000\u0000\u0376\u0377\u0005\u0003\u0000"+
		"\u0000\u0377\u038b\u0005\u0004\u0000\u0000\u0378\u0379\u0005\u0003\u0000"+
		"\u0000\u0379\u038c\u0005\u0004\u0000\u0000\u037a\u037b\u0005\u0006\u0000"+
		"\u0000\u037b\u037c\u0005\u0003\u0000\u0000\u037c\u037d\u0005\b\u0000\u0000"+
		"\u037d\u037e\u0005\u0003\u0000\u0000\u037e\u037f\u0005\b\u0000\u0000\u037f"+
		"\u0380\u0005\u0003\u0000\u0000\u0380\u0381\u0005\b\u0000\u0000\u0381\u0382"+
		"\u0005\u0003\u0000\u0000\u0382\u0383\u0005\b\u0000\u0000\u0383\u0384\u0005"+
		"\u0003\u0000\u0000\u0384\u0385\u0005\b\u0000\u0000\u0385\u0386\u0005\u0003"+
		"\u0000\u0000\u0386\u0387\u0005\b\u0000\u0000\u0387\u0388\u0005\u0003\u0000"+
		"\u0000\u0388\u0389\u0005\u0004\u0000\u0000\u0389\u038a\u0001\u0000\u0000"+
		"\u0000\u038a\u038c\u0006\t\uffff\uffff\u0000\u038b\u0378\u0001\u0000\u0000"+
		"\u0000\u038b\u037a\u0001\u0000\u0000\u0000\u038c\u038d\u0001\u0000\u0000"+
		"\u0000\u038d\u038b\u0001\u0000\u0000\u0000\u038d\u038e\u0001\u0000\u0000"+
		"\u0000\u038e\u038f\u0001\u0000\u0000\u0000\u038f\u0390\u0005\n\u0000\u0000"+
		"\u0390\u0391\u0005\u0003\u0000\u0000\u0391\u0392\u0005\n\u0000\u0000\u0392"+
		"\u0393\u0005\u0003\u0000\u0000\u0393\u0394\u0005\u0006\u0000\u0000\u0394"+
		"\u0395\u0005\u0004\u0000\u0000\u0395\u0397\u0001\u0000\u0000\u0000\u0396"+
		"\u0361\u0001\u0000\u0000\u0000\u0397\u0398\u0001\u0000\u0000\u0000\u0398"+
		"\u0396\u0001\u0000\u0000\u0000\u0398\u0399\u0001\u0000\u0000\u0000\u0399"+
		"\u039a\u0001\u0000\u0000\u0000\u039a\u039b\u0005\u0005\u0000\u0000\u039b"+
		"\u039c\u0005\u0003\u0000\u0000\u039c\u039d\u0005\n\u0000\u0000\u039d\u039e"+
		"\u0005\n\u0000\u0000\u039e\u039f\u0005\n\u0000\u0000\u039f\u03a0\u0005"+
		"\u0003\u0000\u0000\u03a0\u03a1\u0005\n\u0000\u0000\u03a1\u03a2\u0005\u0003"+
		"\u0000\u0000\u03a2\u03a3\u0005\n\u0000\u0000\u03a3\u03a4\u0005\u0004\u0000"+
		"\u0000\u03a4\u0013\u0001\u0000\u0000\u0000\u03a5\u03a7\u0003\u001a\r\u0000"+
		"\u03a6\u03a5\u0001\u0000\u0000\u0000\u03a7\u03a8\u0001\u0000\u0000\u0000"+
		"\u03a8\u03a6\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000\u0000"+
		"\u03a9\u03aa\u0001\u0000\u0000\u0000\u03aa\u03ab\u0005\n\u0000\u0000\u03ab"+
		"\u03ac\u0005\n\u0000\u0000\u03ac\u03ad\u0005\n\u0000\u0000\u03ad\u03ae"+
		"\u0005\n\u0000\u0000\u03ae\u03af\u0005\n\u0000\u0000\u03af\u03b0\u0005"+
		"\n\u0000\u0000\u03b0\u03b2\u0005\u0004\u0000\u0000\u03b1\u03b3\u0003\u0016"+
		"\u000b\u0000\u03b2\u03b1\u0001\u0000\u0000\u0000\u03b3\u03b4\u0001\u0000"+
		"\u0000\u0000\u03b4\u03b2\u0001\u0000\u0000\u0000\u03b4\u03b5\u0001\u0000"+
		"\u0000\u0000\u03b5\u03b6\u0001\u0000\u0000\u0000\u03b6\u03b7\u0003\u001c"+
		"\u000e\u0000\u03b7\u0015\u0001\u0000\u0000\u0000\u03b8\u03b9\u0005\u0006"+
		"\u0000\u0000\u03b9\u03bc\u0005\u0004\u0000\u0000\u03ba\u03bb\u0005\u0006"+
		"\u0000\u0000\u03bb\u03bd\u0005\u0004\u0000\u0000\u03bc\u03ba\u0001\u0000"+
		"\u0000\u0000\u03bc\u03bd\u0001\u0000\u0000\u0000\u03bd\u03be\u0001\u0000"+
		"\u0000\u0000\u03be\u03bf\u0003\u0018\f\u0000\u03bf\u03c0\u0005\u0004\u0000"+
		"\u0000\u03c0\u03c4\u0003\u0018\f\u0000\u03c1\u03c3\u0003\u0018\f\u0000"+
		"\u03c2\u03c1\u0001\u0000\u0000\u0000\u03c3\u03c6\u0001\u0000\u0000\u0000"+
		"\u03c4\u03c2\u0001\u0000\u0000\u0000\u03c4\u03c5\u0001\u0000\u0000\u0000"+
		"\u03c5\u03c7\u0001\u0000\u0000\u0000\u03c6\u03c4\u0001\u0000\u0000\u0000"+
		"\u03c7\u03c8\u0005\u0004\u0000\u0000\u03c8\u03c9\u0005\n\u0000\u0000\u03c9"+
		"\u03ca\u0005\u0004\u0000\u0000\u03ca\u03cb\u0005\n\u0000\u0000\u03cb\u03cc"+
		"\u0005\u0004\u0000\u0000\u03cc\u03cd\u0005\n\u0000\u0000\u03cd\u03ce\u0005"+
		"\u0004\u0000\u0000\u03ce\u03cf\u0005\n\u0000\u0000\u03cf\u03d0\u0005\u0004"+
		"\u0000\u0000\u03d0\u03d1\u0005\b\u0000\u0000\u03d1\u03d2\u0005\u0004\u0000"+
		"\u0000\u03d2\u03d3\u0005\b\u0000\u0000\u03d3\u03d4\u0005\u0004\u0000\u0000"+
		"\u03d4\u03d5\u0005\b\u0000\u0000\u03d5\u03d6\u0005\u0004\u0000\u0000\u03d6"+
		"\u03d7\u0005\b\u0000\u0000\u03d7\u03d8\u0005\u0004\u0000\u0000\u03d8\u03d9"+
		"\u0005\b\u0000\u0000\u03d9\u03da\u0005\u0004\u0000\u0000\u03da\u03db\u0006"+
		"\u000b\uffff\uffff\u0000\u03db\u0017\u0001\u0000\u0000\u0000\u03dc\u03dd"+
		"\u0007\u0000\u0000\u0000\u03dd\u0019\u0001\u0000\u0000\u0000\u03de\u03e1"+
		"\u0003\u0018\f\u0000\u03df\u03e1\u0005\u0003\u0000\u0000\u03e0\u03de\u0001"+
		"\u0000\u0000\u0000\u03e0\u03df\u0001\u0000\u0000\u0000\u03e1\u03e2\u0001"+
		"\u0000\u0000\u0000\u03e2\u03e0\u0001\u0000\u0000\u0000\u03e2\u03e3\u0001"+
		"\u0000\u0000\u0000\u03e3\u03e4\u0001\u0000\u0000\u0000\u03e4\u03e5\u0005"+
		"\u0004\u0000\u0000\u03e5\u001b\u0001\u0000\u0000\u0000\u03e6\u03ea\u0003"+
		"\u0018\f\u0000\u03e7\u03ea\u0005\u0003\u0000\u0000\u03e8\u03ea\u0005\u0004"+
		"\u0000\u0000\u03e9\u03e6\u0001\u0000\u0000\u0000\u03e9\u03e7\u0001\u0000"+
		"\u0000\u0000\u03e9\u03e8\u0001\u0000\u0000\u0000\u03ea\u03eb\u0001\u0000"+
		"\u0000\u0000\u03eb\u03e9\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001\u0000"+
		"\u0000\u0000\u03ec\u001d\u0001\u0000\u0000\u0000h\'9cep\u008f\u0092\u0095"+
		"\u0098\u009b\u009e\u00a3\u00aa\u00ad\u00b0\u00b3\u00b6\u00b9\u00bc\u00c1"+
		"\u00c8\u00cb\u00ce\u00d1\u00d4\u00d7\u00da\u00df\u00f6\u012f\u0135\u014b"+
		"\u0156\u0175\u017b\u017e\u0181\u0184\u0187\u018a\u018f\u0195\u0198\u019b"+
		"\u019e\u01a1\u01a4\u01a9\u01b1\u01c1\u01d3\u01d6\u01d9\u01dc\u01df\u01e2"+
		"\u01e7\u01ef\u0220\u0223\u0226\u0229\u022c\u022f\u0234\u023e\u0243\u0247"+
		"\u024b\u024f\u0253\u0257\u0269\u026b\u0275\u0288\u028b\u028e\u0291\u0294"+
		"\u0297\u029c\u02a4\u02c9\u030f\u0313\u031b\u0329\u0331\u033d\u033f\u034a"+
		"\u0366\u038b\u038d\u0398\u03a8\u03b4\u03bc\u03c4\u03e0\u03e2\u03e9\u03eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}