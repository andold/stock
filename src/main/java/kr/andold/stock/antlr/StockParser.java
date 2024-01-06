// Generated from C:\src\eclipse-workspace\stock\src\main\resources\grammar\Stock.g4 by ANTLR 4.10.1
package kr.andold.stock.antlr;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.stock.service.ParserService;

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
		RULE_stockDocument = 0, RULE_crawlPriceKrx = 1, RULE_crawlItemEtf = 2, 
		RULE_crawlPriceEtf = 3, RULE_crawlPriceCompany = 4, RULE_crawlItemDetailCompanyThread = 5, 
		RULE_crawlItemDividendTopCompany = 6, RULE_crawlEtfDetailThread = 7, RULE_crawlDividendHistoryEtfThread = 8, 
		RULE_crawlDividendHistoryCompanyThread = 9, RULE_word = 10, RULE_line = 11, 
		RULE_eof = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"stockDocument", "crawlPriceKrx", "crawlItemEtf", "crawlPriceEtf", "crawlPriceCompany", 
			"crawlItemDetailCompanyThread", "crawlItemDividendTopCompany", "crawlEtfDetailThread", 
			"crawlDividendHistoryEtfThread", "crawlDividendHistoryCompanyThread", 
			"word", "line", "eof"
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
		public CrawlDividendHistoryCompanyThreadContext crawlDividendHistoryCompanyThread() {
			return getRuleContext(CrawlDividendHistoryCompanyThreadContext.class,0);
		}
		public CrawlDividendHistoryEtfThreadContext crawlDividendHistoryEtfThread() {
			return getRuleContext(CrawlDividendHistoryEtfThreadContext.class,0);
		}
		public CrawlItemDividendTopCompanyContext crawlItemDividendTopCompany() {
			return getRuleContext(CrawlItemDividendTopCompanyContext.class,0);
		}
		public CrawlItemEtfContext crawlItemEtf() {
			return getRuleContext(CrawlItemEtfContext.class,0);
		}
		public CrawlItemDetailCompanyThreadContext crawlItemDetailCompanyThread() {
			return getRuleContext(CrawlItemDetailCompanyThreadContext.class,0);
		}
		public CrawlEtfDetailThreadContext crawlEtfDetailThread() {
			return getRuleContext(CrawlEtfDetailThreadContext.class,0);
		}
		public CrawlPriceCompanyContext crawlPriceCompany() {
			return getRuleContext(CrawlPriceCompanyContext.class,0);
		}
		public CrawlPriceEtfContext crawlPriceEtf() {
			return getRuleContext(CrawlPriceEtfContext.class,0);
		}
		public CrawlPriceKrxContext crawlPriceKrx() {
			return getRuleContext(CrawlPriceKrxContext.class,0);
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
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				crawlDividendHistoryCompanyThread();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				crawlDividendHistoryEtfThread();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				crawlItemDividendTopCompany();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				crawlItemEtf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(30);
				crawlItemDetailCompanyThread();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(31);
				crawlEtfDetailThread();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(32);
				crawlPriceCompany();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(33);
				crawlPriceEtf();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(34);
				crawlPriceKrx();
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

	public static class CrawlPriceKrxContext extends ParserRuleContext {
		public Token code;
		public Token base;
		public Token closing;
		public Token market;
		public Token high;
		public Token low;
		public Token volume;
		public WordContext symbol;
		public WordContext symbol1;
		public WordContext symbol2;
		public WordContext symbol3;
		public WordContext symbol4;
		public WordContext symbol5;
		public WordContext symbol6;
		public WordContext symbol7;
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
		public CrawlPriceKrxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crawlPriceKrx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterCrawlPriceKrx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitCrawlPriceKrx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitCrawlPriceKrx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlPriceKrxContext crawlPriceKrx() throws RecognitionException {
		CrawlPriceKrxContext _localctx = new CrawlPriceKrxContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_crawlPriceKrx);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(KEYWORD);
			setState(38);
			match(TAB);
			setState(39);
			match(WORD);
			setState(40);
			match(TAB);
			setState(41);
			match(WORD);
			setState(42);
			match(TAB);
			setState(43);
			match(WORD);
			setState(44);
			match(NEWLINE);
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(164);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					{
					setState(45);
					match(NUMBER);
					setState(46);
					match(TAB);
					setState(47);
					match(WORD);
					setState(48);
					match(WORD);
					setState(49);
					match(TAB);
					setState(50);
					match(NEWLINE);
					}
					}
					break;
				case 2:
					{
					{
					setState(51);
					match(NUMBER);
					setState(52);
					match(TAB);
					setState(53);
					match(WORD);
					setState(54);
					match(TAB);
					setState(55);
					match(WORD);
					setState(56);
					match(TAB);
					setState(57);
					match(WORD);
					setState(58);
					match(TAB);
					setState(59);
					match(WORD);
					setState(60);
					match(TAB);
					setState(61);
					match(WORD);
					setState(62);
					match(TAB);
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
					match(WORD);
					setState(80);
					match(TAB);
					setState(81);
					match(WORD);
					setState(82);
					match(TAB);
					setState(83);
					match(WORD);
					setState(84);
					match(TAB);
					setState(85);
					match(WORD);
					setState(86);
					match(TAB);
					setState(87);
					match(NEWLINE);
					setState(153); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(88);
							match(WORD);
							setState(89);
							match(TAB);
							setState(90);
							((CrawlPriceKrxContext)_localctx).code = match(NUMBER);
							setState(91);
							match(TAB);
							setState(92);
							((CrawlPriceKrxContext)_localctx).base = match(DATE);
							setState(93);
							match(TAB);
							setState(94);
							((CrawlPriceKrxContext)_localctx).closing = match(NUMBER);
							setState(95);
							match(TAB);
							setState(96);
							match(NUMBER);
							setState(97);
							match(TAB);
							setState(98);
							match(NUMBER);
							setState(99);
							match(TAB);
							setState(100);
							match(NUMBER);
							setState(101);
							match(TAB);
							setState(102);
							((CrawlPriceKrxContext)_localctx).market = match(NUMBER);
							setState(103);
							match(TAB);
							setState(104);
							((CrawlPriceKrxContext)_localctx).high = match(NUMBER);
							setState(105);
							match(TAB);
							setState(106);
							((CrawlPriceKrxContext)_localctx).low = match(NUMBER);
							setState(107);
							match(TAB);
							setState(108);
							((CrawlPriceKrxContext)_localctx).volume = match(NUMBER);
							setState(109);
							match(TAB);
							setState(110);
							match(NUMBER);
							setState(111);
							match(TAB);
							setState(112);
							match(NUMBER);
							setState(113);
							match(TAB);
							setState(114);
							match(NUMBER);
							setState(115);
							match(TAB);
							setState(116);
							match(NUMBER);
							setState(117);
							match(TAB);
							setState(118);
							((CrawlPriceKrxContext)_localctx).symbol = word();
							setState(120);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
							case 1:
								{
								setState(119);
								((CrawlPriceKrxContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(123);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
							case 1:
								{
								setState(122);
								((CrawlPriceKrxContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(126);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
							case 1:
								{
								setState(125);
								((CrawlPriceKrxContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(129);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
							case 1:
								{
								setState(128);
								((CrawlPriceKrxContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(132);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
							case 1:
								{
								setState(131);
								((CrawlPriceKrxContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(135);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
							case 1:
								{
								setState(134);
								((CrawlPriceKrxContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(140);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(137);
								((CrawlPriceKrxContext)_localctx).symbol7 = word();
								}
								}
								setState(142);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(143);
							match(TAB);
							setState(144);
							match(NUMBER);
							setState(145);
							match(TAB);
							setState(146);
							match(NUMBER);
							setState(147);
							match(TAB);
							setState(148);
							match(NUMBER);
							setState(149);
							match(TAB);
							setState(150);
							match(NEWLINE);

												ParserService.crawlPriceCompanyEtf(20240105
													, (((CrawlPriceKrxContext)_localctx).code!=null?((CrawlPriceKrxContext)_localctx).code.getText():null), (((CrawlPriceKrxContext)_localctx).symbol!=null?_input.getText(((CrawlPriceKrxContext)_localctx).symbol.start,((CrawlPriceKrxContext)_localctx).symbol.stop):null)
													, (((CrawlPriceKrxContext)_localctx).base!=null?((CrawlPriceKrxContext)_localctx).base.getText():null), (((CrawlPriceKrxContext)_localctx).closing!=null?((CrawlPriceKrxContext)_localctx).closing.getText():null), (((CrawlPriceKrxContext)_localctx).market!=null?((CrawlPriceKrxContext)_localctx).market.getText():null), (((CrawlPriceKrxContext)_localctx).high!=null?((CrawlPriceKrxContext)_localctx).high.getText():null), (((CrawlPriceKrxContext)_localctx).low!=null?((CrawlPriceKrxContext)_localctx).low.getText():null), (((CrawlPriceKrxContext)_localctx).volume!=null?((CrawlPriceKrxContext)_localctx).volume.getText():null)
												);
											
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(155); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					setState(157);
					match(WORD);
					setState(158);
					match(TAB);
					setState(159);
					match(WORD);
					setState(160);
					match(TAB);
					setState(161);
					match(DATE);
					setState(162);
					match(NEWLINE);
					}
					break;
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(168);
			match(KEYWORD);
			setState(169);
			match(TAB);
			setState(170);
			match(WORD);
			setState(171);
			match(TAB);
			setState(172);
			match(WORD);
			setState(173);
			match(TAB);
			setState(174);
			match(WORD);
			setState(175);
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

	public static class CrawlItemEtfContext extends ParserRuleContext {
		public Token type;
		public WordContext symbol;
		public WordContext symbol1;
		public WordContext symbol2;
		public WordContext symbol3;
		public WordContext symbol4;
		public WordContext symbol5;
		public WordContext symbol6;
		public WordContext symbol7;
		public Token code;
		public WordContext category;
		public WordContext category1;
		public WordContext category2;
		public WordContext category3;
		public WordContext category4;
		public WordContext category5;
		public WordContext category6;
		public WordContext category7;
		public Token asset;
		public Token closing;
		public Token amount;
		public Token priceEarningsRatio;
		public Token fee;
		public Token operator;
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
		public CrawlItemEtfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crawlItemEtf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterCrawlItemEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitCrawlItemEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitCrawlItemEtf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlItemEtfContext crawlItemEtf() throws RecognitionException {
		CrawlItemEtfContext _localctx = new CrawlItemEtfContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_crawlItemEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(KEYWORD);
			setState(178);
			match(TAB);
			setState(179);
			match(WORD);
			setState(180);
			match(TAB);
			setState(181);
			match(WORD);
			setState(182);
			match(WORD);
			setState(183);
			match(WORD);
			setState(184);
			match(TAB);
			setState(185);
			match(WORD);
			setState(186);
			match(TAB);
			setState(187);
			match(WORD);
			setState(188);
			match(NEWLINE);
			setState(317); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(189);
				match(WORD);
				setState(190);
				match(TAB);
				setState(191);
				match(NEWLINE);
				setState(192);
				match(WORD);
				setState(193);
				match(TAB);
				setState(194);
				match(WORD);
				setState(195);
				match(TAB);
				setState(196);
				match(WORD);
				setState(197);
				match(TAB);
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
				match(NEWLINE);
				setState(207);
				match(WORD);
				setState(208);
				match(TAB);
				setState(209);
				match(TAB);
				setState(210);
				match(TAB);
				setState(211);
				match(WORD);
				setState(212);
				match(TAB);
				setState(213);
				match(TAB);
				setState(214);
				match(TAB);
				setState(215);
				match(TAB);
				setState(216);
				match(TAB);
				setState(217);
				match(TAB);
				setState(218);
				match(WORD);
				setState(219);
				match(TAB);
				setState(220);
				match(WORD);
				setState(221);
				match(TAB);
				setState(222);
				match(NEWLINE);
				setState(306); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(223);
						((CrawlItemEtfContext)_localctx).type = match(WORD);
						setState(224);
						match(TAB);
						setState(225);
						match(TAB);
						setState(226);
						((CrawlItemEtfContext)_localctx).symbol = word();
						setState(228);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
						case 1:
							{
							setState(227);
							((CrawlItemEtfContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(231);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
						case 1:
							{
							setState(230);
							((CrawlItemEtfContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(234);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
						case 1:
							{
							setState(233);
							((CrawlItemEtfContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(237);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
						case 1:
							{
							setState(236);
							((CrawlItemEtfContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(240);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
						case 1:
							{
							setState(239);
							((CrawlItemEtfContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(243);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
						case 1:
							{
							setState(242);
							((CrawlItemEtfContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(248);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(245);
							((CrawlItemEtfContext)_localctx).symbol7 = word();
							}
							}
							setState(250);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(251);
						match(TAB);
						setState(252);
						((CrawlItemEtfContext)_localctx).code = match(NUMBER);
						setState(253);
						match(TAB);
						setState(254);
						((CrawlItemEtfContext)_localctx).category = word();
						setState(256);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
						case 1:
							{
							setState(255);
							((CrawlItemEtfContext)_localctx).category1 = word();
							}
							break;
						}
						setState(259);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
						case 1:
							{
							setState(258);
							((CrawlItemEtfContext)_localctx).category2 = word();
							}
							break;
						}
						setState(262);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
						case 1:
							{
							setState(261);
							((CrawlItemEtfContext)_localctx).category3 = word();
							}
							break;
						}
						setState(265);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
						case 1:
							{
							setState(264);
							((CrawlItemEtfContext)_localctx).category4 = word();
							}
							break;
						}
						setState(268);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
							{
							setState(267);
							((CrawlItemEtfContext)_localctx).category5 = word();
							}
							break;
						}
						setState(271);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
						case 1:
							{
							setState(270);
							((CrawlItemEtfContext)_localctx).category6 = word();
							}
							break;
						}
						setState(276);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(273);
							((CrawlItemEtfContext)_localctx).category7 = word();
							}
							}
							setState(278);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(279);
						match(TAB);
						setState(280);
						((CrawlItemEtfContext)_localctx).asset = match(NUMBER);
						setState(281);
						match(TAB);
						setState(282);
						((CrawlItemEtfContext)_localctx).closing = match(NUMBER);
						setState(283);
						match(TAB);
						setState(284);
						((CrawlItemEtfContext)_localctx).amount = match(NUMBER);
						setState(285);
						match(TAB);
						setState(286);
						match(TAB);
						setState(287);
						match(TAB);
						setState(289);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(288);
							((CrawlItemEtfContext)_localctx).priceEarningsRatio = match(NUMBER);
							}
						}

						setState(291);
						match(TAB);
						setState(292);
						match(TAB);
						setState(293);
						match(TAB);
						setState(294);
						match(TAB);
						setState(295);
						match(TAB);
						setState(296);
						match(TAB);
						setState(298);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(297);
							((CrawlItemEtfContext)_localctx).fee = match(NUMBER);
							}
						}

						setState(300);
						match(TAB);
						setState(301);
						((CrawlItemEtfContext)_localctx).operator = match(WORD);
						setState(302);
						match(TAB);
						setState(303);
						match(NEWLINE);

										ParserService.crawlEtfDetailThread(20231217
											, (((CrawlItemEtfContext)_localctx).code!=null?((CrawlItemEtfContext)_localctx).code.getText():null)
											, (((CrawlItemEtfContext)_localctx).symbol!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol.start,((CrawlItemEtfContext)_localctx).symbol.stop):null), (((CrawlItemEtfContext)_localctx).symbol1!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol1.start,((CrawlItemEtfContext)_localctx).symbol1.stop):null), (((CrawlItemEtfContext)_localctx).symbol2!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol2.start,((CrawlItemEtfContext)_localctx).symbol2.stop):null), (((CrawlItemEtfContext)_localctx).symbol3!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol3.start,((CrawlItemEtfContext)_localctx).symbol3.stop):null), (((CrawlItemEtfContext)_localctx).symbol4!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol4.start,((CrawlItemEtfContext)_localctx).symbol4.stop):null), (((CrawlItemEtfContext)_localctx).symbol5!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol5.start,((CrawlItemEtfContext)_localctx).symbol5.stop):null), (((CrawlItemEtfContext)_localctx).symbol6!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol6.start,((CrawlItemEtfContext)_localctx).symbol6.stop):null), (((CrawlItemEtfContext)_localctx).symbol7!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol7.start,((CrawlItemEtfContext)_localctx).symbol7.stop):null)
											, (((CrawlItemEtfContext)_localctx).category!=null?_input.getText(((CrawlItemEtfContext)_localctx).category.start,((CrawlItemEtfContext)_localctx).category.stop):null), (((CrawlItemEtfContext)_localctx).category1!=null?_input.getText(((CrawlItemEtfContext)_localctx).category1.start,((CrawlItemEtfContext)_localctx).category1.stop):null), (((CrawlItemEtfContext)_localctx).category2!=null?_input.getText(((CrawlItemEtfContext)_localctx).category2.start,((CrawlItemEtfContext)_localctx).category2.stop):null), (((CrawlItemEtfContext)_localctx).category3!=null?_input.getText(((CrawlItemEtfContext)_localctx).category3.start,((CrawlItemEtfContext)_localctx).category3.stop):null), (((CrawlItemEtfContext)_localctx).category4!=null?_input.getText(((CrawlItemEtfContext)_localctx).category4.start,((CrawlItemEtfContext)_localctx).category4.stop):null), (((CrawlItemEtfContext)_localctx).category5!=null?_input.getText(((CrawlItemEtfContext)_localctx).category5.start,((CrawlItemEtfContext)_localctx).category5.stop):null), (((CrawlItemEtfContext)_localctx).category6!=null?_input.getText(((CrawlItemEtfContext)_localctx).category6.start,((CrawlItemEtfContext)_localctx).category6.stop):null), (((CrawlItemEtfContext)_localctx).category7!=null?_input.getText(((CrawlItemEtfContext)_localctx).category7.start,((CrawlItemEtfContext)_localctx).category7.stop):null)
											, null
											, (((CrawlItemEtfContext)_localctx).fee!=null?((CrawlItemEtfContext)_localctx).fee.getText():null)
											, null
										);
									
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(308); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(310);
				match(WORD);
				setState(311);
				match(TAB);
				setState(312);
				match(WORD);
				setState(313);
				match(TAB);
				setState(314);
				match(DATE);
				setState(315);
				match(NEWLINE);
				}
				}
				setState(319); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(321);
			match(KEYWORD);
			setState(322);
			match(TAB);
			setState(323);
			match(WORD);
			setState(324);
			match(TAB);
			setState(325);
			match(WORD);
			setState(326);
			match(WORD);
			setState(327);
			match(WORD);
			setState(328);
			match(TAB);
			setState(329);
			match(WORD);
			setState(330);
			match(TAB);
			setState(331);
			match(WORD);
			setState(332);
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

	public static class CrawlPriceEtfContext extends ParserRuleContext {
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
		public Token ea;
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
		enterRule(_localctx, 6, RULE_crawlPriceEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(KEYWORD);
			setState(335);
			match(TAB);
			setState(336);
			match(WORD);
			setState(337);
			match(WORD);
			setState(338);
			match(TAB);
			setState(339);
			match(WORD);
			setState(340);
			match(TAB);
			setState(341);
			match(WORD);
			setState(342);
			match(TAB);
			setState(343);
			match(WORD);
			setState(344);
			match(NEWLINE);
			setState(486); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(345);
				((CrawlPriceEtfContext)_localctx).code = match(NUMBER);
				setState(346);
				match(TAB);
				setState(348); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(347);
					word();
					}
					}
					setState(350); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(352);
				match(NEWLINE);
				{
				setState(353);
				match(KEYWORD);
				setState(354);
				match(TAB);
				setState(355);
				((CrawlPriceEtfContext)_localctx).symbol = word();
				setState(357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(356);
					((CrawlPriceEtfContext)_localctx).symbol1 = word();
					}
					break;
				}
				setState(360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(359);
					((CrawlPriceEtfContext)_localctx).symbol2 = word();
					}
					break;
				}
				setState(363);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(362);
					((CrawlPriceEtfContext)_localctx).symbol3 = word();
					}
					break;
				}
				setState(366);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(365);
					((CrawlPriceEtfContext)_localctx).symbol4 = word();
					}
					break;
				}
				setState(369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(368);
					((CrawlPriceEtfContext)_localctx).symbol5 = word();
					}
					break;
				}
				setState(372);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(371);
					((CrawlPriceEtfContext)_localctx).symbol6 = word();
					}
					break;
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
					{
					{
					setState(374);
					((CrawlPriceEtfContext)_localctx).symbol7 = word();
					}
					}
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(380);
				match(NEWLINE);
				setState(381);
				match(KEYWORD);
				setState(382);
				match(TAB);
				setState(383);
				((CrawlPriceEtfContext)_localctx).category = word();
				setState(385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(384);
					((CrawlPriceEtfContext)_localctx).category1 = word();
					}
					break;
				}
				setState(388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(387);
					((CrawlPriceEtfContext)_localctx).category2 = word();
					}
					break;
				}
				setState(391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(390);
					((CrawlPriceEtfContext)_localctx).category3 = word();
					}
					break;
				}
				setState(394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(393);
					((CrawlPriceEtfContext)_localctx).category4 = word();
					}
					break;
				}
				setState(397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(396);
					((CrawlPriceEtfContext)_localctx).category5 = word();
					}
					break;
				}
				setState(400);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(399);
					((CrawlPriceEtfContext)_localctx).category6 = word();
					}
					break;
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
					{
					{
					setState(402);
					((CrawlPriceEtfContext)_localctx).category7 = word();
					}
					}
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(408);
				match(NEWLINE);
				setState(409);
				match(KEYWORD);
				setState(410);
				match(TAB);
				setState(411);
				((CrawlPriceEtfContext)_localctx).ea = match(NUMBER);
				setState(412);
				match(NEWLINE);

								ParserService.crawlEtfDetailThread(20231217
									, (((CrawlPriceEtfContext)_localctx).code!=null?((CrawlPriceEtfContext)_localctx).code.getText():null)
									, (((CrawlPriceEtfContext)_localctx).symbol!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol.start,((CrawlPriceEtfContext)_localctx).symbol.stop):null), (((CrawlPriceEtfContext)_localctx).symbol1!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol1.start,((CrawlPriceEtfContext)_localctx).symbol1.stop):null), (((CrawlPriceEtfContext)_localctx).symbol2!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol2.start,((CrawlPriceEtfContext)_localctx).symbol2.stop):null), (((CrawlPriceEtfContext)_localctx).symbol3!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol3.start,((CrawlPriceEtfContext)_localctx).symbol3.stop):null), (((CrawlPriceEtfContext)_localctx).symbol4!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol4.start,((CrawlPriceEtfContext)_localctx).symbol4.stop):null), (((CrawlPriceEtfContext)_localctx).symbol5!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol5.start,((CrawlPriceEtfContext)_localctx).symbol5.stop):null), (((CrawlPriceEtfContext)_localctx).symbol6!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol6.start,((CrawlPriceEtfContext)_localctx).symbol6.stop):null), (((CrawlPriceEtfContext)_localctx).symbol7!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol7.start,((CrawlPriceEtfContext)_localctx).symbol7.stop):null)
									, (((CrawlPriceEtfContext)_localctx).category!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category.start,((CrawlPriceEtfContext)_localctx).category.stop):null), (((CrawlPriceEtfContext)_localctx).category1!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category1.start,((CrawlPriceEtfContext)_localctx).category1.stop):null), (((CrawlPriceEtfContext)_localctx).category2!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category2.start,((CrawlPriceEtfContext)_localctx).category2.stop):null), (((CrawlPriceEtfContext)_localctx).category3!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category3.start,((CrawlPriceEtfContext)_localctx).category3.stop):null), (((CrawlPriceEtfContext)_localctx).category4!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category4.start,((CrawlPriceEtfContext)_localctx).category4.stop):null), (((CrawlPriceEtfContext)_localctx).category5!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category5.start,((CrawlPriceEtfContext)_localctx).category5.stop):null), (((CrawlPriceEtfContext)_localctx).category6!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category6.start,((CrawlPriceEtfContext)_localctx).category6.stop):null), (((CrawlPriceEtfContext)_localctx).category7!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category7.start,((CrawlPriceEtfContext)_localctx).category7.stop):null)
									, null
									, null
									, (((CrawlPriceEtfContext)_localctx).ea!=null?((CrawlPriceEtfContext)_localctx).ea.getText():null)
								);
							
				}
				setState(475); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(415);
						match(WORD);
						setState(416);
						match(TAB);
						setState(417);
						match(WORD);
						setState(418);
						match(TAB);
						setState(419);
						match(WORD);
						setState(420);
						match(TAB);
						setState(421);
						match(WORD);
						setState(422);
						match(TAB);
						setState(423);
						match(WORD);
						setState(424);
						match(TAB);
						setState(425);
						match(WORD);
						setState(426);
						match(TAB);
						setState(427);
						match(WORD);
						setState(428);
						match(TAB);
						setState(429);
						match(WORD);
						setState(430);
						match(TAB);
						setState(431);
						match(NEWLINE);
						setState(471); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(471);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
							case 1:
								{
								{
								setState(432);
								match(TAB);
								setState(433);
								match(TAB);
								setState(434);
								match(TAB);
								setState(435);
								match(TAB);
								setState(436);
								match(TAB);
								setState(437);
								match(TAB);
								setState(438);
								match(TAB);
								setState(439);
								match(TAB);
								setState(440);
								match(NEWLINE);
								}
								}
								break;
							case 2:
								{
								{
								setState(442);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(441);
									((CrawlPriceEtfContext)_localctx).base = match(DATE);
									}
								}

								setState(444);
								match(TAB);
								setState(446);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(445);
									((CrawlPriceEtfContext)_localctx).closing = match(NUMBER);
									}
								}

								setState(448);
								match(TAB);
								setState(450);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(449);
									match(NUMBER);
									}
								}

								setState(452);
								match(TAB);
								setState(454);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(453);
									((CrawlPriceEtfContext)_localctx).market = match(NUMBER);
									}
								}

								setState(456);
								match(TAB);
								setState(458);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(457);
									((CrawlPriceEtfContext)_localctx).high = match(NUMBER);
									}
								}

								setState(460);
								match(TAB);
								setState(461);
								((CrawlPriceEtfContext)_localctx).low = match(NUMBER);
								setState(462);
								match(TAB);
								setState(463);
								((CrawlPriceEtfContext)_localctx).volume = match(NUMBER);
								setState(464);
								match(TAB);
								setState(466);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(465);
									match(NUMBER);
									}
								}

								setState(468);
								match(TAB);
								setState(469);
								match(NEWLINE);

													ParserService.crawlPriceCompanyEtf(20231217
														, (((CrawlPriceEtfContext)_localctx).code!=null?((CrawlPriceEtfContext)_localctx).code.getText():null), (((CrawlPriceEtfContext)_localctx).symbol!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol.start,((CrawlPriceEtfContext)_localctx).symbol.stop):null)
														, (((CrawlPriceEtfContext)_localctx).base!=null?((CrawlPriceEtfContext)_localctx).base.getText():null), (((CrawlPriceEtfContext)_localctx).closing!=null?((CrawlPriceEtfContext)_localctx).closing.getText():null), (((CrawlPriceEtfContext)_localctx).market!=null?((CrawlPriceEtfContext)_localctx).market.getText():null), (((CrawlPriceEtfContext)_localctx).high!=null?((CrawlPriceEtfContext)_localctx).high.getText():null), (((CrawlPriceEtfContext)_localctx).low!=null?((CrawlPriceEtfContext)_localctx).low.getText():null), (((CrawlPriceEtfContext)_localctx).volume!=null?((CrawlPriceEtfContext)_localctx).volume.getText():null)
													);
												
								}
								}
								break;
							}
							}
							setState(473); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(477); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(479);
				match(WORD);
				setState(480);
				match(TAB);
				setState(481);
				match(WORD);
				setState(482);
				match(TAB);
				setState(483);
				match(DATE);
				setState(484);
				match(NEWLINE);
				}
				}
				setState(488); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(490);
			match(KEYWORD);
			setState(491);
			match(TAB);
			setState(492);
			match(WORD);
			setState(493);
			match(WORD);
			setState(494);
			match(TAB);
			setState(495);
			match(WORD);
			setState(496);
			match(TAB);
			setState(497);
			match(WORD);
			setState(498);
			match(TAB);
			setState(499);
			match(WORD);
			setState(500);
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

	public static class CrawlPriceCompanyContext extends ParserRuleContext {
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
		public CrawlPriceCompanyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crawlPriceCompany; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterCrawlPriceCompany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitCrawlPriceCompany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitCrawlPriceCompany(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlPriceCompanyContext crawlPriceCompany() throws RecognitionException {
		CrawlPriceCompanyContext _localctx = new CrawlPriceCompanyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_crawlPriceCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(KEYWORD);
			setState(503);
			match(TAB);
			setState(504);
			match(WORD);
			setState(505);
			match(WORD);
			setState(506);
			match(TAB);
			setState(507);
			match(WORD);
			setState(508);
			match(TAB);
			setState(509);
			match(WORD);
			setState(510);
			match(TAB);
			setState(511);
			match(WORD);
			setState(512);
			match(NEWLINE);
			setState(575); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(513);
				((CrawlPriceCompanyContext)_localctx).code = match(NUMBER);
				setState(514);
				match(TAB);
				setState(516); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(515);
					((CrawlPriceCompanyContext)_localctx).symbol = word();
					}
					}
					setState(518); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(520);
				match(NEWLINE);
				setState(564); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(521);
						match(WORD);
						setState(522);
						match(TAB);
						setState(523);
						match(WORD);
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
						match(NEWLINE);
						setState(560); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(560);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case TAB:
								{
								{
								setState(536);
								match(TAB);
								setState(537);
								match(TAB);
								setState(538);
								match(TAB);
								setState(539);
								match(TAB);
								setState(540);
								match(TAB);
								setState(541);
								match(TAB);
								setState(542);
								match(TAB);
								setState(543);
								match(NEWLINE);
								}
								}
								break;
							case DATE:
								{
								{
								setState(544);
								((CrawlPriceCompanyContext)_localctx).base = match(DATE);
								setState(545);
								match(TAB);
								setState(546);
								((CrawlPriceCompanyContext)_localctx).closing = match(NUMBER);
								setState(547);
								match(TAB);
								setState(548);
								match(NUMBER);
								setState(549);
								match(TAB);
								setState(550);
								((CrawlPriceCompanyContext)_localctx).market = match(NUMBER);
								setState(551);
								match(TAB);
								setState(552);
								((CrawlPriceCompanyContext)_localctx).high = match(NUMBER);
								setState(553);
								match(TAB);
								setState(554);
								((CrawlPriceCompanyContext)_localctx).low = match(NUMBER);
								setState(555);
								match(TAB);
								setState(556);
								((CrawlPriceCompanyContext)_localctx).volume = match(NUMBER);
								setState(557);
								match(TAB);
								setState(558);
								match(NEWLINE);

												ParserService.crawlPriceCompanyEtf(20231217
													, (((CrawlPriceCompanyContext)_localctx).code!=null?((CrawlPriceCompanyContext)_localctx).code.getText():null), (((CrawlPriceCompanyContext)_localctx).symbol!=null?_input.getText(((CrawlPriceCompanyContext)_localctx).symbol.start,((CrawlPriceCompanyContext)_localctx).symbol.stop):null)
													, (((CrawlPriceCompanyContext)_localctx).base!=null?((CrawlPriceCompanyContext)_localctx).base.getText():null), (((CrawlPriceCompanyContext)_localctx).closing!=null?((CrawlPriceCompanyContext)_localctx).closing.getText():null), (((CrawlPriceCompanyContext)_localctx).market!=null?((CrawlPriceCompanyContext)_localctx).market.getText():null), (((CrawlPriceCompanyContext)_localctx).high!=null?((CrawlPriceCompanyContext)_localctx).high.getText():null), (((CrawlPriceCompanyContext)_localctx).low!=null?((CrawlPriceCompanyContext)_localctx).low.getText():null), (((CrawlPriceCompanyContext)_localctx).volume!=null?((CrawlPriceCompanyContext)_localctx).volume.getText():null)
												);
											
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							}
							setState(562); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(566); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(568);
				match(WORD);
				setState(569);
				match(TAB);
				setState(570);
				match(WORD);
				setState(571);
				match(TAB);
				setState(572);
				match(DATE);
				setState(573);
				match(NEWLINE);
				}
				}
				setState(577); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(579);
			match(KEYWORD);
			setState(580);
			match(TAB);
			setState(581);
			match(WORD);
			setState(582);
			match(WORD);
			setState(583);
			match(TAB);
			setState(584);
			match(WORD);
			setState(585);
			match(TAB);
			setState(586);
			match(WORD);
			setState(587);
			match(TAB);
			setState(588);
			match(WORD);
			setState(589);
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

	public static class CrawlItemDetailCompanyThreadContext extends ParserRuleContext {
		public Token code;
		public Token type;
		public WordContext symbol;
		public WordContext symbol1;
		public WordContext symbol2;
		public WordContext symbol3;
		public WordContext symbol4;
		public WordContext symbol5;
		public WordContext symbol6;
		public WordContext symbol7;
		public Token category;
		public Token fics;
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
		public List<TerminalNode> STRING() { return getTokens(StockParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(StockParser.STRING, i);
		}
		public CrawlItemDetailCompanyThreadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crawlItemDetailCompanyThread; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterCrawlItemDetailCompanyThread(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitCrawlItemDetailCompanyThread(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitCrawlItemDetailCompanyThread(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlItemDetailCompanyThreadContext crawlItemDetailCompanyThread() throws RecognitionException {
		CrawlItemDetailCompanyThreadContext _localctx = new CrawlItemDetailCompanyThreadContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_crawlItemDetailCompanyThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(KEYWORD);
			setState(592);
			match(TAB);
			setState(593);
			match(WORD);
			setState(594);
			match(WORD);
			setState(595);
			match(TAB);
			setState(596);
			match(WORD);
			setState(597);
			match(TAB);
			setState(598);
			match(WORD);
			setState(599);
			match(TAB);
			setState(600);
			match(WORD);
			setState(601);
			match(NEWLINE);
			setState(659); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(602);
					match(KEYWORD);
					setState(603);
					match(TAB);
					setState(604);
					((CrawlItemDetailCompanyThreadContext)_localctx).code = match(NUMBER);
					setState(605);
					match(TAB);
					setState(606);
					((CrawlItemDetailCompanyThreadContext)_localctx).type = match(WORD);
					setState(607);
					match(TAB);
					setState(608);
					((CrawlItemDetailCompanyThreadContext)_localctx).symbol = word();
					setState(610);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						setState(609);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(613);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						setState(612);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(616);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						setState(615);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(619);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(618);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(622);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(621);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(625);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						setState(624);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(627);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(632);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(633);
					match(NEWLINE);
					setState(634);
					match(KEYWORD);
					setState(635);
					match(TAB);
					setState(636);
					((CrawlItemDetailCompanyThreadContext)_localctx).category = match(STRING);
					setState(637);
					match(NEWLINE);
					setState(638);
					match(KEYWORD);
					setState(639);
					match(TAB);
					setState(640);
					((CrawlItemDetailCompanyThreadContext)_localctx).fics = match(STRING);
					setState(641);
					match(NEWLINE);
					setState(642);
					match(KEYWORD);
					setState(643);
					match(TAB);
					setState(644);
					((CrawlItemDetailCompanyThreadContext)_localctx).ea = match(NUMBER);
					setState(645);
					match(WORD);
					setState(646);
					match(NEWLINE);
					setState(647);
					match(KEYWORD);
					setState(648);
					match(TAB);
					setState(649);
					((CrawlItemDetailCompanyThreadContext)_localctx).ipo = match(DATE);
					setState(650);
					match(NEWLINE);
					setState(651);
					match(WORD);
					setState(652);
					match(TAB);
					setState(653);
					match(WORD);
					setState(654);
					match(TAB);
					setState(655);
					match(DATE);
					setState(656);
					match(NEWLINE);

							ParserService.crawlItemDetailCompanyThread(20231217
								, (((CrawlItemDetailCompanyThreadContext)_localctx).code!=null?((CrawlItemDetailCompanyThreadContext)_localctx).code.getText():null), (((CrawlItemDetailCompanyThreadContext)_localctx).type!=null?((CrawlItemDetailCompanyThreadContext)_localctx).type.getText():null)
								, (((CrawlItemDetailCompanyThreadContext)_localctx).symbol!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol.stop):null), (((CrawlItemDetailCompanyThreadContext)_localctx).symbol1!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol1.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol1.stop):null), (((CrawlItemDetailCompanyThreadContext)_localctx).symbol2!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol2.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol2.stop):null), (((CrawlItemDetailCompanyThreadContext)_localctx).symbol3!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol3.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol3.stop):null), (((CrawlItemDetailCompanyThreadContext)_localctx).symbol4!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol4.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol4.stop):null), (((CrawlItemDetailCompanyThreadContext)_localctx).symbol5!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol5.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol5.stop):null), (((CrawlItemDetailCompanyThreadContext)_localctx).symbol6!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol6.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol6.stop):null), (((CrawlItemDetailCompanyThreadContext)_localctx).symbol7!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol7.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol7.stop):null)
								, (((CrawlItemDetailCompanyThreadContext)_localctx).category!=null?((CrawlItemDetailCompanyThreadContext)_localctx).category.getText():null)
								, (((CrawlItemDetailCompanyThreadContext)_localctx).fics!=null?((CrawlItemDetailCompanyThreadContext)_localctx).fics.getText():null)
								, (((CrawlItemDetailCompanyThreadContext)_localctx).ea!=null?((CrawlItemDetailCompanyThreadContext)_localctx).ea.getText():null)
								, (((CrawlItemDetailCompanyThreadContext)_localctx).ipo!=null?((CrawlItemDetailCompanyThreadContext)_localctx).ipo.getText():null)
							);
						
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(661); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(663);
			match(KEYWORD);
			setState(664);
			match(TAB);
			setState(665);
			match(WORD);
			setState(666);
			match(WORD);
			setState(667);
			match(TAB);
			setState(668);
			match(WORD);
			setState(669);
			match(TAB);
			setState(670);
			match(WORD);
			setState(671);
			match(TAB);
			setState(672);
			match(WORD);
			setState(673);
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

	public static class CrawlItemDividendTopCompanyContext extends ParserRuleContext {
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
		public CrawlItemDividendTopCompanyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crawlItemDividendTopCompany; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterCrawlItemDividendTopCompany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitCrawlItemDividendTopCompany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitCrawlItemDividendTopCompany(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlItemDividendTopCompanyContext crawlItemDividendTopCompany() throws RecognitionException {
		CrawlItemDividendTopCompanyContext _localctx = new CrawlItemDividendTopCompanyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_crawlItemDividendTopCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(KEYWORD);
			setState(676);
			match(TAB);
			setState(677);
			match(WORD);
			setState(678);
			match(TAB);
			setState(679);
			match(WORD);
			setState(680);
			match(WORD);
			setState(681);
			match(WORD);
			setState(682);
			match(TAB);
			setState(683);
			match(WORD);
			setState(684);
			match(TAB);
			setState(685);
			match(WORD);
			setState(686);
			match(NEWLINE);
			setState(755); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(687);
				match(WORD);
				setState(688);
				match(TAB);
				setState(689);
				match(NEWLINE);
				setState(690);
				match(WORD);
				setState(691);
				match(TAB);
				setState(692);
				match(WORD);
				setState(693);
				match(TAB);
				setState(694);
				match(WORD);
				setState(695);
				match(TAB);
				setState(696);
				match(WORD);
				setState(697);
				match(TAB);
				setState(698);
				match(WORD);
				setState(699);
				match(TAB);
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
				match(TAB);
				setState(706);
				match(WORD);
				setState(707);
				match(TAB);
				setState(708);
				match(WORD);
				setState(709);
				match(TAB);
				setState(710);
				match(WORD);
				setState(711);
				match(TAB);
				setState(712);
				match(NEWLINE);
				setState(744); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(713);
						((CrawlItemDividendTopCompanyContext)_localctx).type = match(WORD);
						setState(714);
						match(TAB);
						setState(715);
						match(NUMBER);
						setState(716);
						match(TAB);
						setState(718);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(717);
							((CrawlItemDividendTopCompanyContext)_localctx).code = match(NUMBER);
							}
						}

						setState(720);
						match(TAB);
						setState(722); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(721);
							word();
							}
							}
							setState(724); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(726);
						match(TAB);
						setState(727);
						match(WORD);
						setState(728);
						match(TAB);
						setState(729);
						match(WORD);
						setState(730);
						match(TAB);
						setState(731);
						match(NUMBER);
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
						match(NUMBER);
						setState(738);
						match(TAB);
						setState(739);
						match(NUMBER);
						setState(740);
						match(TAB);
						setState(741);
						match(NEWLINE);

									ParserService.crawlItemDividendTopCompany(20231217
										, (((CrawlItemDividendTopCompanyContext)_localctx).code!=null?((CrawlItemDividendTopCompanyContext)_localctx).code.getText():null)
										, (((CrawlItemDividendTopCompanyContext)_localctx).type!=null?((CrawlItemDividendTopCompanyContext)_localctx).type.getText():null)
									);
								
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(746); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(748);
				match(WORD);
				setState(749);
				match(TAB);
				setState(750);
				match(WORD);
				setState(751);
				match(TAB);
				setState(752);
				match(DATE);
				setState(753);
				match(NEWLINE);
				}
				}
				setState(757); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(759);
			match(KEYWORD);
			setState(760);
			match(TAB);
			setState(761);
			match(WORD);
			setState(762);
			match(TAB);
			setState(763);
			match(WORD);
			setState(764);
			match(WORD);
			setState(765);
			match(WORD);
			setState(766);
			match(TAB);
			setState(767);
			match(WORD);
			setState(768);
			match(TAB);
			setState(769);
			match(WORD);
			setState(770);
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
		enterRule(_localctx, 14, RULE_crawlEtfDetailThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(KEYWORD);
			setState(773);
			match(TAB);
			setState(774);
			match(WORD);
			setState(775);
			match(WORD);
			setState(776);
			match(TAB);
			setState(777);
			match(WORD);
			setState(778);
			match(TAB);
			setState(779);
			match(WORD);
			setState(780);
			match(NEWLINE);
			setState(862); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(781);
					match(KEYWORD);
					setState(782);
					match(TAB);
					setState(783);
					((CrawlEtfDetailThreadContext)_localctx).code = match(NUMBER);
					setState(784);
					match(TAB);
					setState(788);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(785);
						word();
						}
						}
						setState(790);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(791);
					match(NEWLINE);
					setState(792);
					((CrawlEtfDetailThreadContext)_localctx).symbol = word();
					setState(794);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						setState(793);
						((CrawlEtfDetailThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(797);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						setState(796);
						((CrawlEtfDetailThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(800);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						setState(799);
						((CrawlEtfDetailThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(803);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						setState(802);
						((CrawlEtfDetailThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(806);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						setState(805);
						((CrawlEtfDetailThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(809);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						setState(808);
						((CrawlEtfDetailThreadContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(814);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(811);
						((CrawlEtfDetailThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(816);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(817);
					match(NEWLINE);
					setState(818);
					((CrawlEtfDetailThreadContext)_localctx).category = word();
					setState(820);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						setState(819);
						((CrawlEtfDetailThreadContext)_localctx).category1 = word();
						}
						break;
					}
					setState(823);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						setState(822);
						((CrawlEtfDetailThreadContext)_localctx).category2 = word();
						}
						break;
					}
					setState(826);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(825);
						((CrawlEtfDetailThreadContext)_localctx).category3 = word();
						}
						break;
					}
					setState(829);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
					case 1:
						{
						setState(828);
						((CrawlEtfDetailThreadContext)_localctx).category4 = word();
						}
						break;
					}
					setState(832);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						setState(831);
						((CrawlEtfDetailThreadContext)_localctx).category5 = word();
						}
						break;
					}
					setState(835);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						setState(834);
						((CrawlEtfDetailThreadContext)_localctx).category6 = word();
						}
						break;
					}
					setState(840);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(837);
						((CrawlEtfDetailThreadContext)_localctx).category7 = word();
						}
						}
						setState(842);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(843);
					match(NEWLINE);
					setState(844);
					((CrawlEtfDetailThreadContext)_localctx).ipo = match(DATE);
					setState(848);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WORD) {
						{
						{
						setState(845);
						match(WORD);
						}
						}
						setState(850);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(851);
					match(NEWLINE);
					setState(852);
					((CrawlEtfDetailThreadContext)_localctx).fee = word();
					setState(853);
					match(NEWLINE);
					setState(854);
					match(WORD);
					setState(855);
					match(TAB);
					setState(856);
					match(WORD);
					setState(857);
					match(TAB);
					setState(858);
					match(DATE);
					setState(859);
					match(NEWLINE);

								ParserService.crawlEtfDetailThread(20231217
									, (((CrawlEtfDetailThreadContext)_localctx).code!=null?((CrawlEtfDetailThreadContext)_localctx).code.getText():null)
									, (((CrawlEtfDetailThreadContext)_localctx).symbol!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol.start,((CrawlEtfDetailThreadContext)_localctx).symbol.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol1!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol1.start,((CrawlEtfDetailThreadContext)_localctx).symbol1.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol2!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol2.start,((CrawlEtfDetailThreadContext)_localctx).symbol2.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol3!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol3.start,((CrawlEtfDetailThreadContext)_localctx).symbol3.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol4!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol4.start,((CrawlEtfDetailThreadContext)_localctx).symbol4.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol5!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol5.start,((CrawlEtfDetailThreadContext)_localctx).symbol5.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol6!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol6.start,((CrawlEtfDetailThreadContext)_localctx).symbol6.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol7!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol7.start,((CrawlEtfDetailThreadContext)_localctx).symbol7.stop):null)
									, (((CrawlEtfDetailThreadContext)_localctx).category!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category.start,((CrawlEtfDetailThreadContext)_localctx).category.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category1!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category1.start,((CrawlEtfDetailThreadContext)_localctx).category1.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category2!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category2.start,((CrawlEtfDetailThreadContext)_localctx).category2.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category3!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category3.start,((CrawlEtfDetailThreadContext)_localctx).category3.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category4!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category4.start,((CrawlEtfDetailThreadContext)_localctx).category4.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category5!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category5.start,((CrawlEtfDetailThreadContext)_localctx).category5.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category6!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category6.start,((CrawlEtfDetailThreadContext)_localctx).category6.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category7!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category7.start,((CrawlEtfDetailThreadContext)_localctx).category7.stop):null)
									, (((CrawlEtfDetailThreadContext)_localctx).ipo!=null?((CrawlEtfDetailThreadContext)_localctx).ipo.getText():null)
									, (((CrawlEtfDetailThreadContext)_localctx).fee!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).fee.start,((CrawlEtfDetailThreadContext)_localctx).fee.stop):null)
									, null
								);
							
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(864); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(866);
			match(KEYWORD);
			setState(867);
			match(TAB);
			setState(868);
			match(WORD);
			setState(869);
			match(WORD);
			setState(870);
			match(TAB);
			setState(871);
			match(WORD);
			setState(872);
			match(TAB);
			setState(873);
			match(WORD);
			setState(874);
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
		enterRule(_localctx, 16, RULE_crawlDividendHistoryEtfThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(KEYWORD);
			setState(877);
			match(TAB);
			setState(878);
			match(WORD);
			setState(879);
			match(WORD);
			setState(880);
			match(WORD);
			setState(881);
			match(TAB);
			setState(882);
			match(WORD);
			setState(883);
			match(WORD);
			setState(884);
			match(WORD);
			setState(885);
			match(TAB);
			setState(886);
			match(WORD);
			setState(887);
			match(TAB);
			setState(888);
			match(WORD);
			setState(889);
			match(NEWLINE);
			setState(1000); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(890);
					match(KEYWORD);
					setState(891);
					match(TAB);
					setState(892);
					((CrawlDividendHistoryEtfThreadContext)_localctx).code = match(NUMBER);
					setState(893);
					match(NEWLINE);
					setState(894);
					match(WORD);
					setState(895);
					match(TAB);
					setState(897);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WORD) {
						{
						setState(896);
						match(WORD);
						}
					}

					setState(899);
					match(TAB);
					setState(900);
					match(WORD);
					setState(901);
					match(TAB);
					setState(902);
					match(WORD);
					setState(903);
					match(TAB);
					setState(904);
					match(WORD);
					setState(905);
					match(TAB);
					setState(906);
					match(WORD);
					setState(907);
					match(TAB);
					setState(908);
					match(WORD);
					setState(909);
					match(TAB);
					setState(910);
					match(WORD);
					setState(911);
					match(TAB);
					setState(912);
					match(WORD);
					setState(913);
					match(TAB);
					setState(914);
					match(WORD);
					setState(915);
					match(TAB);
					setState(916);
					match(NEWLINE);
					setState(990); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(990);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case TAB:
								{
								{
								setState(917);
								match(TAB);
								setState(918);
								match(TAB);
								setState(919);
								match(TAB);
								setState(920);
								match(TAB);
								setState(921);
								match(TAB);
								setState(922);
								match(TAB);
								setState(923);
								match(TAB);
								setState(924);
								match(TAB);
								setState(925);
								match(TAB);
								setState(926);
								match(TAB);
								setState(927);
								match(NEWLINE);
								}
								}
								break;
							case KEYWORD:
							case DATE:
							case TIME:
							case NUMBER:
							case STRING:
							case WORD:
								{
								{
								setState(928);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol = word();
								setState(930);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
								case 1:
									{
									setState(929);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol1 = word();
									}
									break;
								}
								setState(933);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
								case 1:
									{
									setState(932);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol2 = word();
									}
									break;
								}
								setState(936);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
								case 1:
									{
									setState(935);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol3 = word();
									}
									break;
								}
								setState(939);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
								case 1:
									{
									setState(938);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol4 = word();
									}
									break;
								}
								setState(942);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
								case 1:
									{
									setState(941);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol5 = word();
									}
									break;
								}
								setState(945);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
								case 1:
									{
									setState(944);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol6 = word();
									}
									break;
								}
								setState(950);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
									{
									{
									setState(947);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol7 = word();
									}
									}
									setState(952);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(953);
								match(TAB);
								setState(955);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==WORD) {
									{
									setState(954);
									match(WORD);
									}
								}

								setState(957);
								match(TAB);
								setState(958);
								match(WORD);
								setState(959);
								match(TAB);
								setState(963);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
									{
									{
									setState(960);
									word();
									}
									}
									setState(965);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(966);
								match(TAB);
								setState(968);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(967);
									((CrawlDividendHistoryEtfThreadContext)_localctx).base = match(DATE);
									}
								}

								setState(970);
								match(TAB);
								setState(971);
								((CrawlDividendHistoryEtfThreadContext)_localctx).pay = match(DATE);
								setState(972);
								match(TAB);
								setState(974);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==WORD) {
									{
									setState(973);
									match(WORD);
									}
								}

								setState(976);
								match(TAB);
								setState(977);
								((CrawlDividendHistoryEtfThreadContext)_localctx).dividend = match(NUMBER);
								setState(978);
								match(TAB);
								setState(980);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(979);
									((CrawlDividendHistoryEtfThreadContext)_localctx).price = match(NUMBER);
									}
								}

								setState(982);
								match(TAB);
								setState(984);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(983);
									((CrawlDividendHistoryEtfThreadContext)_localctx).ratio = match(NUMBER);
									}
								}

								setState(986);
								match(TAB);
								setState(987);
								match(NEWLINE);

													ParserService.crawlDividendHistoryEtfThread(20231127
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
							default:
								throw new NoViableAltException(this);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(992); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(994);
					match(WORD);
					setState(995);
					match(TAB);
					setState(996);
					match(WORD);
					setState(997);
					match(TAB);
					setState(998);
					match(DATE);
					setState(999);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1002); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1004);
			match(KEYWORD);
			setState(1005);
			match(TAB);
			setState(1006);
			match(WORD);
			setState(1007);
			match(WORD);
			setState(1008);
			match(WORD);
			setState(1009);
			match(TAB);
			setState(1010);
			match(WORD);
			setState(1011);
			match(WORD);
			setState(1012);
			match(WORD);
			setState(1013);
			match(TAB);
			setState(1014);
			match(WORD);
			setState(1015);
			match(TAB);
			setState(1016);
			match(WORD);
			setState(1017);
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

	public static class CrawlDividendHistoryCompanyThreadContext extends ParserRuleContext {
		public Token base;
		public Token pay;
		public Token code;
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
		public CrawlDividendHistoryCompanyThreadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crawlDividendHistoryCompanyThread; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterCrawlDividendHistoryCompanyThread(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitCrawlDividendHistoryCompanyThread(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitCrawlDividendHistoryCompanyThread(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlDividendHistoryCompanyThreadContext crawlDividendHistoryCompanyThread() throws RecognitionException {
		CrawlDividendHistoryCompanyThreadContext _localctx = new CrawlDividendHistoryCompanyThreadContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_crawlDividendHistoryCompanyThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			match(KEYWORD);
			setState(1020);
			match(TAB);
			setState(1021);
			match(WORD);
			setState(1022);
			match(TAB);
			setState(1023);
			match(WORD);
			setState(1024);
			match(WORD);
			setState(1025);
			match(WORD);
			setState(1026);
			match(TAB);
			setState(1027);
			match(WORD);
			setState(1028);
			match(TAB);
			setState(1029);
			match(WORD);
			setState(1030);
			match(NEWLINE);
			setState(1157); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1147); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1031);
						match(WORD);
						setState(1032);
						match(TAB);
						setState(1033);
						match(WORD);
						setState(1034);
						match(NEWLINE);
						setState(1035);
						match(WORD);
						setState(1036);
						match(TAB);
						setState(1037);
						match(WORD);
						setState(1038);
						match(NEWLINE);
						setState(1039);
						match(WORD);
						setState(1040);
						match(TAB);
						setState(1041);
						match(WORD);
						setState(1042);
						match(TAB);
						setState(1043);
						match(WORD);
						setState(1044);
						match(TAB);
						setState(1045);
						match(WORD);
						setState(1046);
						match(TAB);
						setState(1047);
						match(WORD);
						setState(1048);
						match(TAB);
						setState(1049);
						match(WORD);
						setState(1050);
						match(TAB);
						setState(1051);
						match(WORD);
						setState(1052);
						match(TAB);
						setState(1053);
						match(WORD);
						setState(1054);
						match(TAB);
						setState(1055);
						match(WORD);
						setState(1056);
						match(TAB);
						setState(1057);
						match(WORD);
						setState(1058);
						match(TAB);
						setState(1059);
						match(WORD);
						setState(1060);
						match(TAB);
						setState(1061);
						match(WORD);
						setState(1062);
						match(TAB);
						setState(1063);
						match(NEWLINE);
						setState(1064);
						match(WORD);
						setState(1065);
						match(TAB);
						setState(1066);
						match(WORD);
						setState(1067);
						match(TAB);
						setState(1068);
						match(WORD);
						setState(1069);
						match(TAB);
						setState(1070);
						match(WORD);
						setState(1071);
						match(TAB);
						setState(1072);
						match(WORD);
						setState(1073);
						match(TAB);
						setState(1074);
						match(WORD);
						setState(1075);
						match(TAB);
						setState(1076);
						match(NEWLINE);
						setState(1143); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(1143);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case TAB:
								{
								{
								setState(1077);
								match(TAB);
								setState(1078);
								match(TAB);
								setState(1079);
								match(TAB);
								setState(1080);
								match(TAB);
								setState(1081);
								match(TAB);
								setState(1082);
								match(TAB);
								setState(1083);
								match(TAB);
								setState(1084);
								match(TAB);
								setState(1085);
								match(TAB);
								setState(1086);
								match(TAB);
								setState(1087);
								match(TAB);
								setState(1088);
								match(TAB);
								setState(1089);
								match(TAB);
								setState(1090);
								match(TAB);
								setState(1091);
								match(TAB);
								setState(1092);
								match(TAB);
								setState(1093);
								match(TAB);
								setState(1094);
								match(NEWLINE);
								}
								}
								break;
							case DATE:
								{
								{
								setState(1095);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).base = match(DATE);
								setState(1096);
								match(TAB);
								setState(1098);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(1097);
									((CrawlDividendHistoryCompanyThreadContext)_localctx).pay = match(DATE);
									}
								}

								setState(1100);
								match(TAB);
								setState(1102);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(1101);
									match(DATE);
									}
								}

								setState(1104);
								match(TAB);
								setState(1105);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).code = match(NUMBER);
								setState(1106);
								match(TAB);
								setState(1108); 
								_errHandler.sync(this);
								_la = _input.LA(1);
								do {
									{
									{
									setState(1107);
									((CrawlDividendHistoryCompanyThreadContext)_localctx).symbol = word();
									}
									}
									setState(1110); 
									_errHandler.sync(this);
									_la = _input.LA(1);
								} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
								setState(1112);
								match(TAB);
								setState(1113);
								match(WORD);
								setState(1114);
								match(TAB);
								setState(1115);
								match(WORD);
								setState(1116);
								match(TAB);
								setState(1117);
								match(WORD);
								setState(1118);
								match(TAB);
								setState(1119);
								match(WORD);
								setState(1120);
								match(TAB);
								setState(1121);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).dividend = match(NUMBER);
								setState(1122);
								match(TAB);
								setState(1124);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(1123);
									match(NUMBER);
									}
								}

								setState(1126);
								match(TAB);
								setState(1127);
								match(NUMBER);
								setState(1128);
								match(TAB);
								setState(1129);
								match(NUMBER);
								setState(1130);
								match(TAB);
								setState(1132);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(1131);
									match(NUMBER);
									}
								}

								setState(1134);
								match(TAB);
								setState(1135);
								match(TAB);
								setState(1136);
								match(NUMBER);
								setState(1137);
								match(TAB);
								setState(1138);
								match(NUMBER);
								setState(1139);
								match(TAB);
								setState(1140);
								match(NEWLINE);

														ParserService.crawlDividendHistoryCompanyThread(20231127
															, (((CrawlDividendHistoryCompanyThreadContext)_localctx).base!=null?((CrawlDividendHistoryCompanyThreadContext)_localctx).base.getText():null) , (((CrawlDividendHistoryCompanyThreadContext)_localctx).pay!=null?((CrawlDividendHistoryCompanyThreadContext)_localctx).pay.getText():null)
															, (((CrawlDividendHistoryCompanyThreadContext)_localctx).code!=null?((CrawlDividendHistoryCompanyThreadContext)_localctx).code.getText():null) , (((CrawlDividendHistoryCompanyThreadContext)_localctx).symbol!=null?_input.getText(((CrawlDividendHistoryCompanyThreadContext)_localctx).symbol.start,((CrawlDividendHistoryCompanyThreadContext)_localctx).symbol.stop):null)
															, (((CrawlDividendHistoryCompanyThreadContext)_localctx).dividend!=null?((CrawlDividendHistoryCompanyThreadContext)_localctx).dividend.getText():null)
														);
													
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							}
							setState(1145); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1149); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1151);
				match(WORD);
				setState(1152);
				match(TAB);
				setState(1153);
				match(WORD);
				setState(1154);
				match(TAB);
				setState(1155);
				match(DATE);
				setState(1156);
				match(NEWLINE);
				}
				}
				setState(1159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1161);
			match(KEYWORD);
			setState(1162);
			match(TAB);
			setState(1163);
			match(WORD);
			setState(1164);
			match(TAB);
			setState(1165);
			match(WORD);
			setState(1166);
			match(WORD);
			setState(1167);
			match(WORD);
			setState(1168);
			match(TAB);
			setState(1169);
			match(WORD);
			setState(1170);
			match(TAB);
			setState(1171);
			match(WORD);
			setState(1172);
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
		enterRule(_localctx, 20, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
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
		enterRule(_localctx, 22, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1178);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(1176);
					word();
					}
					break;
				case TAB:
					{
					setState(1177);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(1182);
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
		enterRule(_localctx, 24, RULE_eof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1187); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1187);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(1184);
					word();
					}
					break;
				case TAB:
					{
					setState(1185);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(1186);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1189); 
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
		"\u0004\u0001\n\u04a8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000$\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"y\b\u0001\u0001\u0001\u0003\u0001|\b\u0001\u0001\u0001\u0003\u0001\u007f"+
		"\b\u0001\u0001\u0001\u0003\u0001\u0082\b\u0001\u0001\u0001\u0003\u0001"+
		"\u0085\b\u0001\u0001\u0001\u0003\u0001\u0088\b\u0001\u0001\u0001\u0005"+
		"\u0001\u008b\b\u0001\n\u0001\f\u0001\u008e\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001\u009a\b\u0001\u000b\u0001\f\u0001"+
		"\u009b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0004\u0001\u00a5\b\u0001\u000b\u0001\f\u0001\u00a6"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u00e5\b\u0002\u0001\u0002\u0003\u0002\u00e8\b\u0002\u0001"+
		"\u0002\u0003\u0002\u00eb\b\u0002\u0001\u0002\u0003\u0002\u00ee\b\u0002"+
		"\u0001\u0002\u0003\u0002\u00f1\b\u0002\u0001\u0002\u0003\u0002\u00f4\b"+
		"\u0002\u0001\u0002\u0005\u0002\u00f7\b\u0002\n\u0002\f\u0002\u00fa\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u0101\b\u0002\u0001\u0002\u0003\u0002\u0104\b\u0002\u0001\u0002\u0003"+
		"\u0002\u0107\b\u0002\u0001\u0002\u0003\u0002\u010a\b\u0002\u0001\u0002"+
		"\u0003\u0002\u010d\b\u0002\u0001\u0002\u0003\u0002\u0110\b\u0002\u0001"+
		"\u0002\u0005\u0002\u0113\b\u0002\n\u0002\f\u0002\u0116\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0122\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u012b\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0004\u0002\u0133\b\u0002\u000b\u0002\f\u0002"+
		"\u0134\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0004\u0002\u013e\b\u0002\u000b\u0002\f\u0002\u013f"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u015d\b\u0003\u000b\u0003"+
		"\f\u0003\u015e\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u0166\b\u0003\u0001\u0003\u0003\u0003\u0169\b\u0003\u0001"+
		"\u0003\u0003\u0003\u016c\b\u0003\u0001\u0003\u0003\u0003\u016f\b\u0003"+
		"\u0001\u0003\u0003\u0003\u0172\b\u0003\u0001\u0003\u0003\u0003\u0175\b"+
		"\u0003\u0001\u0003\u0005\u0003\u0178\b\u0003\n\u0003\f\u0003\u017b\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u0182\b\u0003\u0001\u0003\u0003\u0003\u0185\b\u0003\u0001\u0003\u0003"+
		"\u0003\u0188\b\u0003\u0001\u0003\u0003\u0003\u018b\b\u0003\u0001\u0003"+
		"\u0003\u0003\u018e\b\u0003\u0001\u0003\u0003\u0003\u0191\b\u0003\u0001"+
		"\u0003\u0005\u0003\u0194\b\u0003\n\u0003\f\u0003\u0197\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u01bb\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u01bf\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u01c3\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u01c7\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u01cb\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u01d3\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u01d8\b\u0003\u000b\u0003\f"+
		"\u0003\u01d9\u0004\u0003\u01dc\b\u0003\u000b\u0003\f\u0003\u01dd\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0004\u0003\u01e7\b\u0003\u000b\u0003\f\u0003\u01e8\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0004\u0004\u0205\b\u0004\u000b\u0004\f\u0004\u0206\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u0231\b\u0004\u000b"+
		"\u0004\f\u0004\u0232\u0004\u0004\u0235\b\u0004\u000b\u0004\f\u0004\u0236"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0004\u0004\u0240\b\u0004\u000b\u0004\f\u0004\u0241\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u0263\b\u0005\u0001\u0005\u0003\u0005\u0266\b\u0005"+
		"\u0001\u0005\u0003\u0005\u0269\b\u0005\u0001\u0005\u0003\u0005\u026c\b"+
		"\u0005\u0001\u0005\u0003\u0005\u026f\b\u0005\u0001\u0005\u0003\u0005\u0272"+
		"\b\u0005\u0001\u0005\u0005\u0005\u0275\b\u0005\n\u0005\f\u0005\u0278\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u0294\b\u0005\u000b\u0005\f"+
		"\u0005\u0295\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u02cf\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0004\u0006\u02d3\b\u0006\u000b\u0006\f\u0006\u02d4\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u02e9"+
		"\b\u0006\u000b\u0006\f\u0006\u02ea\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u02f4\b\u0006"+
		"\u000b\u0006\f\u0006\u02f5\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u0313\b\u0007\n\u0007\f\u0007\u0316\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u031b\b\u0007\u0001\u0007\u0003\u0007\u031e\b\u0007"+
		"\u0001\u0007\u0003\u0007\u0321\b\u0007\u0001\u0007\u0003\u0007\u0324\b"+
		"\u0007\u0001\u0007\u0003\u0007\u0327\b\u0007\u0001\u0007\u0003\u0007\u032a"+
		"\b\u0007\u0001\u0007\u0005\u0007\u032d\b\u0007\n\u0007\f\u0007\u0330\t"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0335\b\u0007\u0001"+
		"\u0007\u0003\u0007\u0338\b\u0007\u0001\u0007\u0003\u0007\u033b\b\u0007"+
		"\u0001\u0007\u0003\u0007\u033e\b\u0007\u0001\u0007\u0003\u0007\u0341\b"+
		"\u0007\u0001\u0007\u0003\u0007\u0344\b\u0007\u0001\u0007\u0005\u0007\u0347"+
		"\b\u0007\n\u0007\f\u0007\u034a\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u034f\b\u0007\n\u0007\f\u0007\u0352\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u035f\b\u0007\u000b"+
		"\u0007\f\u0007\u0360\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u0382\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u03a3\b\b\u0001\b\u0003\b\u03a6\b\b\u0001\b\u0003\b\u03a9\b\b\u0001"+
		"\b\u0003\b\u03ac\b\b\u0001\b\u0003\b\u03af\b\b\u0001\b\u0003\b\u03b2\b"+
		"\b\u0001\b\u0005\b\u03b5\b\b\n\b\f\b\u03b8\t\b\u0001\b\u0001\b\u0003\b"+
		"\u03bc\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u03c2\b\b\n\b\f\b\u03c5"+
		"\t\b\u0001\b\u0001\b\u0003\b\u03c9\b\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0003\b\u03cf\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u03d5\b\b\u0001"+
		"\b\u0001\b\u0003\b\u03d9\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u03df"+
		"\b\b\u000b\b\f\b\u03e0\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0004\b\u03e9\b\b\u000b\b\f\b\u03ea\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u044b\b\t\u0001\t\u0001\t\u0003\t\u044f\b\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0004\t\u0455\b\t\u000b\t\f\t\u0456\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0465\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u046d"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0004\t\u0478\b\t\u000b\t\f\t\u0479\u0004\t\u047c\b\t\u000b\t\f\t\u047d"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u0486\b\t\u000b"+
		"\t\f\t\u0487\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0004\u000b\u049b\b\u000b\u000b\u000b\f\u000b\u049c\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0004\f\u04a4\b\f\u000b\f\f"+
		"\f\u04a5\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u0000\u0001\u0001\u0000\u0005\n\u0518\u0000#"+
		"\u0001\u0000\u0000\u0000\u0002%\u0001\u0000\u0000\u0000\u0004\u00b1\u0001"+
		"\u0000\u0000\u0000\u0006\u014e\u0001\u0000\u0000\u0000\b\u01f6\u0001\u0000"+
		"\u0000\u0000\n\u024f\u0001\u0000\u0000\u0000\f\u02a3\u0001\u0000\u0000"+
		"\u0000\u000e\u0304\u0001\u0000\u0000\u0000\u0010\u036c\u0001\u0000\u0000"+
		"\u0000\u0012\u03fb\u0001\u0000\u0000\u0000\u0014\u0496\u0001\u0000\u0000"+
		"\u0000\u0016\u049a\u0001\u0000\u0000\u0000\u0018\u04a3\u0001\u0000\u0000"+
		"\u0000\u001a$\u0003\u0012\t\u0000\u001b$\u0003\u0010\b\u0000\u001c$\u0003"+
		"\f\u0006\u0000\u001d$\u0003\u0004\u0002\u0000\u001e$\u0003\n\u0005\u0000"+
		"\u001f$\u0003\u000e\u0007\u0000 $\u0003\b\u0004\u0000!$\u0003\u0006\u0003"+
		"\u0000\"$\u0003\u0002\u0001\u0000#\u001a\u0001\u0000\u0000\u0000#\u001b"+
		"\u0001\u0000\u0000\u0000#\u001c\u0001\u0000\u0000\u0000#\u001d\u0001\u0000"+
		"\u0000\u0000#\u001e\u0001\u0000\u0000\u0000#\u001f\u0001\u0000\u0000\u0000"+
		"# \u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000"+
		"\u0000$\u0001\u0001\u0000\u0000\u0000%&\u0005\u0005\u0000\u0000&\'\u0005"+
		"\u0003\u0000\u0000\'(\u0005\n\u0000\u0000()\u0005\u0003\u0000\u0000)*"+
		"\u0005\n\u0000\u0000*+\u0005\u0003\u0000\u0000+,\u0005\n\u0000\u0000,"+
		"\u00a4\u0005\u0004\u0000\u0000-.\u0005\b\u0000\u0000./\u0005\u0003\u0000"+
		"\u0000/0\u0005\n\u0000\u000001\u0005\n\u0000\u000012\u0005\u0003\u0000"+
		"\u00002\u00a5\u0005\u0004\u0000\u000034\u0005\b\u0000\u000045\u0005\u0003"+
		"\u0000\u000056\u0005\n\u0000\u000067\u0005\u0003\u0000\u000078\u0005\n"+
		"\u0000\u000089\u0005\u0003\u0000\u00009:\u0005\n\u0000\u0000:;\u0005\u0003"+
		"\u0000\u0000;<\u0005\n\u0000\u0000<=\u0005\u0003\u0000\u0000=>\u0005\n"+
		"\u0000\u0000>?\u0005\u0003\u0000\u0000?@\u0005\n\u0000\u0000@A\u0005\u0003"+
		"\u0000\u0000AB\u0005\n\u0000\u0000BC\u0005\u0003\u0000\u0000CD\u0005\n"+
		"\u0000\u0000DE\u0005\u0003\u0000\u0000EF\u0005\n\u0000\u0000FG\u0005\u0003"+
		"\u0000\u0000GH\u0005\n\u0000\u0000HI\u0005\u0003\u0000\u0000IJ\u0005\n"+
		"\u0000\u0000JK\u0005\u0003\u0000\u0000KL\u0005\n\u0000\u0000LM\u0005\u0003"+
		"\u0000\u0000MN\u0005\n\u0000\u0000NO\u0005\u0003\u0000\u0000OP\u0005\n"+
		"\u0000\u0000PQ\u0005\u0003\u0000\u0000QR\u0005\n\u0000\u0000RS\u0005\u0003"+
		"\u0000\u0000ST\u0005\n\u0000\u0000TU\u0005\u0003\u0000\u0000UV\u0005\n"+
		"\u0000\u0000VW\u0005\u0003\u0000\u0000W\u0099\u0005\u0004\u0000\u0000"+
		"XY\u0005\n\u0000\u0000YZ\u0005\u0003\u0000\u0000Z[\u0005\b\u0000\u0000"+
		"[\\\u0005\u0003\u0000\u0000\\]\u0005\u0006\u0000\u0000]^\u0005\u0003\u0000"+
		"\u0000^_\u0005\b\u0000\u0000_`\u0005\u0003\u0000\u0000`a\u0005\b\u0000"+
		"\u0000ab\u0005\u0003\u0000\u0000bc\u0005\b\u0000\u0000cd\u0005\u0003\u0000"+
		"\u0000de\u0005\b\u0000\u0000ef\u0005\u0003\u0000\u0000fg\u0005\b\u0000"+
		"\u0000gh\u0005\u0003\u0000\u0000hi\u0005\b\u0000\u0000ij\u0005\u0003\u0000"+
		"\u0000jk\u0005\b\u0000\u0000kl\u0005\u0003\u0000\u0000lm\u0005\b\u0000"+
		"\u0000mn\u0005\u0003\u0000\u0000no\u0005\b\u0000\u0000op\u0005\u0003\u0000"+
		"\u0000pq\u0005\b\u0000\u0000qr\u0005\u0003\u0000\u0000rs\u0005\b\u0000"+
		"\u0000st\u0005\u0003\u0000\u0000tu\u0005\b\u0000\u0000uv\u0005\u0003\u0000"+
		"\u0000vx\u0003\u0014\n\u0000wy\u0003\u0014\n\u0000xw\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000z|\u0003\u0014"+
		"\n\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000"+
		"\u0000\u0000}\u007f\u0003\u0014\n\u0000~}\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080\u0082"+
		"\u0003\u0014\n\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0085\u0003"+
		"\u0014\n\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0088\u0003\u0014"+
		"\n\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u008c\u0001\u0000\u0000\u0000\u0089\u008b\u0003\u0014\n\u0000"+
		"\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0005\u0003\u0000\u0000\u0090\u0091\u0005\b\u0000\u0000\u0091"+
		"\u0092\u0005\u0003\u0000\u0000\u0092\u0093\u0005\b\u0000\u0000\u0093\u0094"+
		"\u0005\u0003\u0000\u0000\u0094\u0095\u0005\b\u0000\u0000\u0095\u0096\u0005"+
		"\u0003\u0000\u0000\u0096\u0097\u0005\u0004\u0000\u0000\u0097\u0098\u0006"+
		"\u0001\uffff\uffff\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099X\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0099\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0005\n\u0000\u0000\u009e\u009f\u0005\u0003"+
		"\u0000\u0000\u009f\u00a0\u0005\n\u0000\u0000\u00a0\u00a1\u0005\u0003\u0000"+
		"\u0000\u00a1\u00a2\u0005\u0006\u0000\u0000\u00a2\u00a3\u0005\u0004\u0000"+
		"\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4-\u0001\u0000\u0000\u0000"+
		"\u00a43\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0005\u0000\u0000\u00a9"+
		"\u00aa\u0005\u0003\u0000\u0000\u00aa\u00ab\u0005\n\u0000\u0000\u00ab\u00ac"+
		"\u0005\u0003\u0000\u0000\u00ac\u00ad\u0005\n\u0000\u0000\u00ad\u00ae\u0005"+
		"\u0003\u0000\u0000\u00ae\u00af\u0005\n\u0000\u0000\u00af\u00b0\u0005\u0004"+
		"\u0000\u0000\u00b0\u0003\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0005"+
		"\u0000\u0000\u00b2\u00b3\u0005\u0003\u0000\u0000\u00b3\u00b4\u0005\n\u0000"+
		"\u0000\u00b4\u00b5\u0005\u0003\u0000\u0000\u00b5\u00b6\u0005\n\u0000\u0000"+
		"\u00b6\u00b7\u0005\n\u0000\u0000\u00b7\u00b8\u0005\n\u0000\u0000\u00b8"+
		"\u00b9\u0005\u0003\u0000\u0000\u00b9\u00ba\u0005\n\u0000\u0000\u00ba\u00bb"+
		"\u0005\u0003\u0000\u0000\u00bb\u00bc\u0005\n\u0000\u0000\u00bc\u013d\u0005"+
		"\u0004\u0000\u0000\u00bd\u00be\u0005\n\u0000\u0000\u00be\u00bf\u0005\u0003"+
		"\u0000\u0000\u00bf\u00c0\u0005\u0004\u0000\u0000\u00c0\u00c1\u0005\n\u0000"+
		"\u0000\u00c1\u00c2\u0005\u0003\u0000\u0000\u00c2\u00c3\u0005\n\u0000\u0000"+
		"\u00c3\u00c4\u0005\u0003\u0000\u0000\u00c4\u00c5\u0005\n\u0000\u0000\u00c5"+
		"\u00c6\u0005\u0003\u0000\u0000\u00c6\u00c7\u0005\u0003\u0000\u0000\u00c7"+
		"\u00c8\u0005\n\u0000\u0000\u00c8\u00c9\u0005\u0003\u0000\u0000\u00c9\u00ca"+
		"\u0005\n\u0000\u0000\u00ca\u00cb\u0005\u0003\u0000\u0000\u00cb\u00cc\u0005"+
		"\n\u0000\u0000\u00cc\u00cd\u0005\u0003\u0000\u0000\u00cd\u00ce\u0005\n"+
		"\u0000\u0000\u00ce\u00cf\u0005\u0004\u0000\u0000\u00cf\u00d0\u0005\n\u0000"+
		"\u0000\u00d0\u00d1\u0005\u0003\u0000\u0000\u00d1\u00d2\u0005\u0003\u0000"+
		"\u0000\u00d2\u00d3\u0005\u0003\u0000\u0000\u00d3\u00d4\u0005\n\u0000\u0000"+
		"\u00d4\u00d5\u0005\u0003\u0000\u0000\u00d5\u00d6\u0005\u0003\u0000\u0000"+
		"\u00d6\u00d7\u0005\u0003\u0000\u0000\u00d7\u00d8\u0005\u0003\u0000\u0000"+
		"\u00d8\u00d9\u0005\u0003\u0000\u0000\u00d9\u00da\u0005\u0003\u0000\u0000"+
		"\u00da\u00db\u0005\n\u0000\u0000\u00db\u00dc\u0005\u0003\u0000\u0000\u00dc"+
		"\u00dd\u0005\n\u0000\u0000\u00dd\u00de\u0005\u0003\u0000\u0000\u00de\u0132"+
		"\u0005\u0004\u0000\u0000\u00df\u00e0\u0005\n\u0000\u0000\u00e0\u00e1\u0005"+
		"\u0003\u0000\u0000\u00e1\u00e2\u0005\u0003\u0000\u0000\u00e2\u00e4\u0003"+
		"\u0014\n\u0000\u00e3\u00e5\u0003\u0014\n\u0000\u00e4\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e8\u0003\u0014\n\u0000\u00e7\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000"+
		"\u0000\u00e9\u00eb\u0003\u0014\n\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ee\u0003\u0014\n\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f1\u0003\u0014\n\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00f4"+
		"\u0003\u0014\n\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f8\u0001\u0000\u0000\u0000\u00f5\u00f7\u0003"+
		"\u0014\n\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0005\u0003\u0000\u0000\u00fc\u00fd\u0005\b\u0000"+
		"\u0000\u00fd\u00fe\u0005\u0003\u0000\u0000\u00fe\u0100\u0003\u0014\n\u0000"+
		"\u00ff\u0101\u0003\u0014\n\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0001\u0000\u0000\u0000\u0101\u0103\u0001\u0000\u0000\u0000\u0102"+
		"\u0104\u0003\u0014\n\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0001\u0000\u0000\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0107"+
		"\u0003\u0014\n\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0106\u0107\u0001"+
		"\u0000\u0000\u0000\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u010a\u0003"+
		"\u0014\n\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000"+
		"\u0000\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u010d\u0003\u0014"+
		"\n\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000"+
		"\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u0110\u0003\u0014\n\u0000"+
		"\u010f\u010e\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000"+
		"\u0110\u0114\u0001\u0000\u0000\u0000\u0111\u0113\u0003\u0014\n\u0000\u0112"+
		"\u0111\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114"+
		"\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115"+
		"\u0117\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0005\u0003\u0000\u0000\u0118\u0119\u0005\b\u0000\u0000\u0119\u011a"+
		"\u0005\u0003\u0000\u0000\u011a\u011b\u0005\b\u0000\u0000\u011b\u011c\u0005"+
		"\u0003\u0000\u0000\u011c\u011d\u0005\b\u0000\u0000\u011d\u011e\u0005\u0003"+
		"\u0000\u0000\u011e\u011f\u0005\u0003\u0000\u0000\u011f\u0121\u0005\u0003"+
		"\u0000\u0000\u0120\u0122\u0005\b\u0000\u0000\u0121\u0120\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0005\u0003\u0000\u0000\u0124\u0125\u0005\u0003\u0000"+
		"\u0000\u0125\u0126\u0005\u0003\u0000\u0000\u0126\u0127\u0005\u0003\u0000"+
		"\u0000\u0127\u0128\u0005\u0003\u0000\u0000\u0128\u012a\u0005\u0003\u0000"+
		"\u0000\u0129\u012b\u0005\b\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0005\u0003\u0000\u0000\u012d\u012e\u0005\n\u0000\u0000\u012e"+
		"\u012f\u0005\u0003\u0000\u0000\u012f\u0130\u0005\u0004\u0000\u0000\u0130"+
		"\u0131\u0006\u0002\uffff\uffff\u0000\u0131\u0133\u0001\u0000\u0000\u0000"+
		"\u0132\u00df\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000"+
		"\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0137\u0005\n\u0000\u0000\u0137"+
		"\u0138\u0005\u0003\u0000\u0000\u0138\u0139\u0005\n\u0000\u0000\u0139\u013a"+
		"\u0005\u0003\u0000\u0000\u013a\u013b\u0005\u0006\u0000\u0000\u013b\u013c"+
		"\u0005\u0004\u0000\u0000\u013c\u013e\u0001\u0000\u0000\u0000\u013d\u00bd"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u013d"+
		"\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0001\u0000\u0000\u0000\u0141\u0142\u0005\u0005\u0000\u0000\u0142\u0143"+
		"\u0005\u0003\u0000\u0000\u0143\u0144\u0005\n\u0000\u0000\u0144\u0145\u0005"+
		"\u0003\u0000\u0000\u0145\u0146\u0005\n\u0000\u0000\u0146\u0147\u0005\n"+
		"\u0000\u0000\u0147\u0148\u0005\n\u0000\u0000\u0148\u0149\u0005\u0003\u0000"+
		"\u0000\u0149\u014a\u0005\n\u0000\u0000\u014a\u014b\u0005\u0003\u0000\u0000"+
		"\u014b\u014c\u0005\n\u0000\u0000\u014c\u014d\u0005\u0004\u0000\u0000\u014d"+
		"\u0005\u0001\u0000\u0000\u0000\u014e\u014f\u0005\u0005\u0000\u0000\u014f"+
		"\u0150\u0005\u0003\u0000\u0000\u0150\u0151\u0005\n\u0000\u0000\u0151\u0152"+
		"\u0005\n\u0000\u0000\u0152\u0153\u0005\u0003\u0000\u0000\u0153\u0154\u0005"+
		"\n\u0000\u0000\u0154\u0155\u0005\u0003\u0000\u0000\u0155\u0156\u0005\n"+
		"\u0000\u0000\u0156\u0157\u0005\u0003\u0000\u0000\u0157\u0158\u0005\n\u0000"+
		"\u0000\u0158\u01e6\u0005\u0004\u0000\u0000\u0159\u015a\u0005\b\u0000\u0000"+
		"\u015a\u015c\u0005\u0003\u0000\u0000\u015b\u015d\u0003\u0014\n\u0000\u015c"+
		"\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e"+
		"\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f"+
		"\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0005\u0004\u0000\u0000\u0161"+
		"\u0162\u0005\u0005\u0000\u0000\u0162\u0163\u0005\u0003\u0000\u0000\u0163"+
		"\u0165\u0003\u0014\n\u0000\u0164\u0166\u0003\u0014\n\u0000\u0165\u0164"+
		"\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0168"+
		"\u0001\u0000\u0000\u0000\u0167\u0169\u0003\u0014\n\u0000\u0168\u0167\u0001"+
		"\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016b\u0001"+
		"\u0000\u0000\u0000\u016a\u016c\u0003\u0014\n\u0000\u016b\u016a\u0001\u0000"+
		"\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016e\u0001\u0000"+
		"\u0000\u0000\u016d\u016f\u0003\u0014\n\u0000\u016e\u016d\u0001\u0000\u0000"+
		"\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0171\u0001\u0000\u0000"+
		"\u0000\u0170\u0172\u0003\u0014\n\u0000\u0171\u0170\u0001\u0000\u0000\u0000"+
		"\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0174\u0001\u0000\u0000\u0000"+
		"\u0173\u0175\u0003\u0014\n\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u0174"+
		"\u0175\u0001\u0000\u0000\u0000\u0175\u0179\u0001\u0000\u0000\u0000\u0176"+
		"\u0178\u0003\u0014\n\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0178\u017b"+
		"\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u017a"+
		"\u0001\u0000\u0000\u0000\u017a\u017c\u0001\u0000\u0000\u0000\u017b\u0179"+
		"\u0001\u0000\u0000\u0000\u017c\u017d\u0005\u0004\u0000\u0000\u017d\u017e"+
		"\u0005\u0005\u0000\u0000\u017e\u017f\u0005\u0003\u0000\u0000\u017f\u0181"+
		"\u0003\u0014\n\u0000\u0180\u0182\u0003\u0014\n\u0000\u0181\u0180\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0184\u0001"+
		"\u0000\u0000\u0000\u0183\u0185\u0003\u0014\n\u0000\u0184\u0183\u0001\u0000"+
		"\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0187\u0001\u0000"+
		"\u0000\u0000\u0186\u0188\u0003\u0014\n\u0000\u0187\u0186\u0001\u0000\u0000"+
		"\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u018a\u0001\u0000\u0000"+
		"\u0000\u0189\u018b\u0003\u0014\n\u0000\u018a\u0189\u0001\u0000\u0000\u0000"+
		"\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018d\u0001\u0000\u0000\u0000"+
		"\u018c\u018e\u0003\u0014\n\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018d"+
		"\u018e\u0001\u0000\u0000\u0000\u018e\u0190\u0001\u0000\u0000\u0000\u018f"+
		"\u0191\u0003\u0014\n\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0190\u0191"+
		"\u0001\u0000\u0000\u0000\u0191\u0195\u0001\u0000\u0000\u0000\u0192\u0194"+
		"\u0003\u0014\n\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0194\u0197\u0001"+
		"\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001"+
		"\u0000\u0000\u0000\u0196\u0198\u0001\u0000\u0000\u0000\u0197\u0195\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0005\u0004\u0000\u0000\u0199\u019a\u0005"+
		"\u0005\u0000\u0000\u019a\u019b\u0005\u0003\u0000\u0000\u019b\u019c\u0005"+
		"\b\u0000\u0000\u019c\u019d\u0005\u0004\u0000\u0000\u019d\u019e\u0006\u0003"+
		"\uffff\uffff\u0000\u019e\u01db\u0001\u0000\u0000\u0000\u019f\u01a0\u0005"+
		"\n\u0000\u0000\u01a0\u01a1\u0005\u0003\u0000\u0000\u01a1\u01a2\u0005\n"+
		"\u0000\u0000\u01a2\u01a3\u0005\u0003\u0000\u0000\u01a3\u01a4\u0005\n\u0000"+
		"\u0000\u01a4\u01a5\u0005\u0003\u0000\u0000\u01a5\u01a6\u0005\n\u0000\u0000"+
		"\u01a6\u01a7\u0005\u0003\u0000\u0000\u01a7\u01a8\u0005\n\u0000\u0000\u01a8"+
		"\u01a9\u0005\u0003\u0000\u0000\u01a9\u01aa\u0005\n\u0000\u0000\u01aa\u01ab"+
		"\u0005\u0003\u0000\u0000\u01ab\u01ac\u0005\n\u0000\u0000\u01ac\u01ad\u0005"+
		"\u0003\u0000\u0000\u01ad\u01ae\u0005\n\u0000\u0000\u01ae\u01af\u0005\u0003"+
		"\u0000\u0000\u01af\u01d7\u0005\u0004\u0000\u0000\u01b0\u01b1\u0005\u0003"+
		"\u0000\u0000\u01b1\u01b2\u0005\u0003\u0000\u0000\u01b2\u01b3\u0005\u0003"+
		"\u0000\u0000\u01b3\u01b4\u0005\u0003\u0000\u0000\u01b4\u01b5\u0005\u0003"+
		"\u0000\u0000\u01b5\u01b6\u0005\u0003\u0000\u0000\u01b6\u01b7\u0005\u0003"+
		"\u0000\u0000\u01b7\u01b8\u0005\u0003\u0000\u0000\u01b8\u01d8\u0005\u0004"+
		"\u0000\u0000\u01b9\u01bb\u0005\u0006\u0000\u0000\u01ba\u01b9\u0001\u0000"+
		"\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000"+
		"\u0000\u0000\u01bc\u01be\u0005\u0003\u0000\u0000\u01bd\u01bf\u0005\b\u0000"+
		"\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c2\u0005\u0003\u0000"+
		"\u0000\u01c1\u01c3\u0005\b\u0000\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c6\u0005\u0003\u0000\u0000\u01c5\u01c7\u0005\b\u0000\u0000\u01c6"+
		"\u01c5\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c8\u0001\u0000\u0000\u0000\u01c8\u01ca\u0005\u0003\u0000\u0000\u01c9"+
		"\u01cb\u0005\b\u0000\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000\u01ca\u01cb"+
		"\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01cd"+
		"\u0005\u0003\u0000\u0000\u01cd\u01ce\u0005\b\u0000\u0000\u01ce\u01cf\u0005"+
		"\u0003\u0000\u0000\u01cf\u01d0\u0005\b\u0000\u0000\u01d0\u01d2\u0005\u0003"+
		"\u0000\u0000\u01d1\u01d3\u0005\b\u0000\u0000\u01d2\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d5\u0005\u0003\u0000\u0000\u01d5\u01d6\u0005\u0004\u0000"+
		"\u0000\u01d6\u01d8\u0006\u0003\uffff\uffff\u0000\u01d7\u01b0\u0001\u0000"+
		"\u0000\u0000\u01d7\u01ba\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000"+
		"\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000"+
		"\u0000\u0000\u01da\u01dc\u0001\u0000\u0000\u0000\u01db\u019f\u0001\u0000"+
		"\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01db\u0001\u0000"+
		"\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000"+
		"\u0000\u0000\u01df\u01e0\u0005\n\u0000\u0000\u01e0\u01e1\u0005\u0003\u0000"+
		"\u0000\u01e1\u01e2\u0005\n\u0000\u0000\u01e2\u01e3\u0005\u0003\u0000\u0000"+
		"\u01e3\u01e4\u0005\u0006\u0000\u0000\u01e4\u01e5\u0005\u0004\u0000\u0000"+
		"\u01e5\u01e7\u0001\u0000\u0000\u0000\u01e6\u0159\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000"+
		"\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000"+
		"\u01ea\u01eb\u0005\u0005\u0000\u0000\u01eb\u01ec\u0005\u0003\u0000\u0000"+
		"\u01ec\u01ed\u0005\n\u0000\u0000\u01ed\u01ee\u0005\n\u0000\u0000\u01ee"+
		"\u01ef\u0005\u0003\u0000\u0000\u01ef\u01f0\u0005\n\u0000\u0000\u01f0\u01f1"+
		"\u0005\u0003\u0000\u0000\u01f1\u01f2\u0005\n\u0000\u0000\u01f2\u01f3\u0005"+
		"\u0003\u0000\u0000\u01f3\u01f4\u0005\n\u0000\u0000\u01f4\u01f5\u0005\u0004"+
		"\u0000\u0000\u01f5\u0007\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005\u0005"+
		"\u0000\u0000\u01f7\u01f8\u0005\u0003\u0000\u0000\u01f8\u01f9\u0005\n\u0000"+
		"\u0000\u01f9\u01fa\u0005\n\u0000\u0000\u01fa\u01fb\u0005\u0003\u0000\u0000"+
		"\u01fb\u01fc\u0005\n\u0000\u0000\u01fc\u01fd\u0005\u0003\u0000\u0000\u01fd"+
		"\u01fe\u0005\n\u0000\u0000\u01fe\u01ff\u0005\u0003\u0000\u0000\u01ff\u0200"+
		"\u0005\n\u0000\u0000\u0200\u023f\u0005\u0004\u0000\u0000\u0201\u0202\u0005"+
		"\b\u0000\u0000\u0202\u0204\u0005\u0003\u0000\u0000\u0203\u0205\u0003\u0014"+
		"\n\u0000\u0204\u0203\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000"+
		"\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000"+
		"\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u0234\u0005\u0004\u0000"+
		"\u0000\u0209\u020a\u0005\n\u0000\u0000\u020a\u020b\u0005\u0003\u0000\u0000"+
		"\u020b\u020c\u0005\n\u0000\u0000\u020c\u020d\u0005\u0003\u0000\u0000\u020d"+
		"\u020e\u0005\n\u0000\u0000\u020e\u020f\u0005\u0003\u0000\u0000\u020f\u0210"+
		"\u0005\n\u0000\u0000\u0210\u0211\u0005\u0003\u0000\u0000\u0211\u0212\u0005"+
		"\n\u0000\u0000\u0212\u0213\u0005\u0003\u0000\u0000\u0213\u0214\u0005\n"+
		"\u0000\u0000\u0214\u0215\u0005\u0003\u0000\u0000\u0215\u0216\u0005\n\u0000"+
		"\u0000\u0216\u0217\u0005\u0003\u0000\u0000\u0217\u0230\u0005\u0004\u0000"+
		"\u0000\u0218\u0219\u0005\u0003\u0000\u0000\u0219\u021a\u0005\u0003\u0000"+
		"\u0000\u021a\u021b\u0005\u0003\u0000\u0000\u021b\u021c\u0005\u0003\u0000"+
		"\u0000\u021c\u021d\u0005\u0003\u0000\u0000\u021d\u021e\u0005\u0003\u0000"+
		"\u0000\u021e\u021f\u0005\u0003\u0000\u0000\u021f\u0231\u0005\u0004\u0000"+
		"\u0000\u0220\u0221\u0005\u0006\u0000\u0000\u0221\u0222\u0005\u0003\u0000"+
		"\u0000\u0222\u0223\u0005\b\u0000\u0000\u0223\u0224\u0005\u0003\u0000\u0000"+
		"\u0224\u0225\u0005\b\u0000\u0000\u0225\u0226\u0005\u0003\u0000\u0000\u0226"+
		"\u0227\u0005\b\u0000\u0000\u0227\u0228\u0005\u0003\u0000\u0000\u0228\u0229"+
		"\u0005\b\u0000\u0000\u0229\u022a\u0005\u0003\u0000\u0000\u022a\u022b\u0005"+
		"\b\u0000\u0000\u022b\u022c\u0005\u0003\u0000\u0000\u022c\u022d\u0005\b"+
		"\u0000\u0000\u022d\u022e\u0005\u0003\u0000\u0000\u022e\u022f\u0005\u0004"+
		"\u0000\u0000\u022f\u0231\u0006\u0004\uffff\uffff\u0000\u0230\u0218\u0001"+
		"\u0000\u0000\u0000\u0230\u0220\u0001\u0000\u0000\u0000\u0231\u0232\u0001"+
		"\u0000\u0000\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0232\u0233\u0001"+
		"\u0000\u0000\u0000\u0233\u0235\u0001\u0000\u0000\u0000\u0234\u0209\u0001"+
		"\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0234\u0001"+
		"\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u0238\u0001"+
		"\u0000\u0000\u0000\u0238\u0239\u0005\n\u0000\u0000\u0239\u023a\u0005\u0003"+
		"\u0000\u0000\u023a\u023b\u0005\n\u0000\u0000\u023b\u023c\u0005\u0003\u0000"+
		"\u0000\u023c\u023d\u0005\u0006\u0000\u0000\u023d\u023e\u0005\u0004\u0000"+
		"\u0000\u023e\u0240\u0001\u0000\u0000\u0000\u023f\u0201\u0001\u0000\u0000"+
		"\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000"+
		"\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000"+
		"\u0000\u0243\u0244\u0005\u0005\u0000\u0000\u0244\u0245\u0005\u0003\u0000"+
		"\u0000\u0245\u0246\u0005\n\u0000\u0000\u0246\u0247\u0005\n\u0000\u0000"+
		"\u0247\u0248\u0005\u0003\u0000\u0000\u0248\u0249\u0005\n\u0000\u0000\u0249"+
		"\u024a\u0005\u0003\u0000\u0000\u024a\u024b\u0005\n\u0000\u0000\u024b\u024c"+
		"\u0005\u0003\u0000\u0000\u024c\u024d\u0005\n\u0000\u0000\u024d\u024e\u0005"+
		"\u0004\u0000\u0000\u024e\t\u0001\u0000\u0000\u0000\u024f\u0250\u0005\u0005"+
		"\u0000\u0000\u0250\u0251\u0005\u0003\u0000\u0000\u0251\u0252\u0005\n\u0000"+
		"\u0000\u0252\u0253\u0005\n\u0000\u0000\u0253\u0254\u0005\u0003\u0000\u0000"+
		"\u0254\u0255\u0005\n\u0000\u0000\u0255\u0256\u0005\u0003\u0000\u0000\u0256"+
		"\u0257\u0005\n\u0000\u0000\u0257\u0258\u0005\u0003\u0000\u0000\u0258\u0259"+
		"\u0005\n\u0000\u0000\u0259\u0293\u0005\u0004\u0000\u0000\u025a\u025b\u0005"+
		"\u0005\u0000\u0000\u025b\u025c\u0005\u0003\u0000\u0000\u025c\u025d\u0005"+
		"\b\u0000\u0000\u025d\u025e\u0005\u0003\u0000\u0000\u025e\u025f\u0005\n"+
		"\u0000\u0000\u025f\u0260\u0005\u0003\u0000\u0000\u0260\u0262\u0003\u0014"+
		"\n\u0000\u0261\u0263\u0003\u0014\n\u0000\u0262\u0261\u0001\u0000\u0000"+
		"\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0265\u0001\u0000\u0000"+
		"\u0000\u0264\u0266\u0003\u0014\n\u0000\u0265\u0264\u0001\u0000\u0000\u0000"+
		"\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u0268\u0001\u0000\u0000\u0000"+
		"\u0267\u0269\u0003\u0014\n\u0000\u0268\u0267\u0001\u0000\u0000\u0000\u0268"+
		"\u0269\u0001\u0000\u0000\u0000\u0269\u026b\u0001\u0000\u0000\u0000\u026a"+
		"\u026c\u0003\u0014\n\u0000\u026b\u026a\u0001\u0000\u0000\u0000\u026b\u026c"+
		"\u0001\u0000\u0000\u0000\u026c\u026e\u0001\u0000\u0000\u0000\u026d\u026f"+
		"\u0003\u0014\n\u0000\u026e\u026d\u0001\u0000\u0000\u0000\u026e\u026f\u0001"+
		"\u0000\u0000\u0000\u026f\u0271\u0001\u0000\u0000\u0000\u0270\u0272\u0003"+
		"\u0014\n\u0000\u0271\u0270\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000"+
		"\u0000\u0000\u0272\u0276\u0001\u0000\u0000\u0000\u0273\u0275\u0003\u0014"+
		"\n\u0000\u0274\u0273\u0001\u0000\u0000\u0000\u0275\u0278\u0001\u0000\u0000"+
		"\u0000\u0276\u0274\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000"+
		"\u0000\u0277\u0279\u0001\u0000\u0000\u0000\u0278\u0276\u0001\u0000\u0000"+
		"\u0000\u0279\u027a\u0005\u0004\u0000\u0000\u027a\u027b\u0005\u0005\u0000"+
		"\u0000\u027b\u027c\u0005\u0003\u0000\u0000\u027c\u027d\u0005\t\u0000\u0000"+
		"\u027d\u027e\u0005\u0004\u0000\u0000\u027e\u027f\u0005\u0005\u0000\u0000"+
		"\u027f\u0280\u0005\u0003\u0000\u0000\u0280\u0281\u0005\t\u0000\u0000\u0281"+
		"\u0282\u0005\u0004\u0000\u0000\u0282\u0283\u0005\u0005\u0000\u0000\u0283"+
		"\u0284\u0005\u0003\u0000\u0000\u0284\u0285\u0005\b\u0000\u0000\u0285\u0286"+
		"\u0005\n\u0000\u0000\u0286\u0287\u0005\u0004\u0000\u0000\u0287\u0288\u0005"+
		"\u0005\u0000\u0000\u0288\u0289\u0005\u0003\u0000\u0000\u0289\u028a\u0005"+
		"\u0006\u0000\u0000\u028a\u028b\u0005\u0004\u0000\u0000\u028b\u028c\u0005"+
		"\n\u0000\u0000\u028c\u028d\u0005\u0003\u0000\u0000\u028d\u028e\u0005\n"+
		"\u0000\u0000\u028e\u028f\u0005\u0003\u0000\u0000\u028f\u0290\u0005\u0006"+
		"\u0000\u0000\u0290\u0291\u0005\u0004\u0000\u0000\u0291\u0292\u0006\u0005"+
		"\uffff\uffff\u0000\u0292\u0294\u0001\u0000\u0000\u0000\u0293\u025a\u0001"+
		"\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295\u0293\u0001"+
		"\u0000\u0000\u0000\u0295\u0296\u0001\u0000\u0000\u0000\u0296\u0297\u0001"+
		"\u0000\u0000\u0000\u0297\u0298\u0005\u0005\u0000\u0000\u0298\u0299\u0005"+
		"\u0003\u0000\u0000\u0299\u029a\u0005\n\u0000\u0000\u029a\u029b\u0005\n"+
		"\u0000\u0000\u029b\u029c\u0005\u0003\u0000\u0000\u029c\u029d\u0005\n\u0000"+
		"\u0000\u029d\u029e\u0005\u0003\u0000\u0000\u029e\u029f\u0005\n\u0000\u0000"+
		"\u029f\u02a0\u0005\u0003\u0000\u0000\u02a0\u02a1\u0005\n\u0000\u0000\u02a1"+
		"\u02a2\u0005\u0004\u0000\u0000\u02a2\u000b\u0001\u0000\u0000\u0000\u02a3"+
		"\u02a4\u0005\u0005\u0000\u0000\u02a4\u02a5\u0005\u0003\u0000\u0000\u02a5"+
		"\u02a6\u0005\n\u0000\u0000\u02a6\u02a7\u0005\u0003\u0000\u0000\u02a7\u02a8"+
		"\u0005\n\u0000\u0000\u02a8\u02a9\u0005\n\u0000\u0000\u02a9\u02aa\u0005"+
		"\n\u0000\u0000\u02aa\u02ab\u0005\u0003\u0000\u0000\u02ab\u02ac\u0005\n"+
		"\u0000\u0000\u02ac\u02ad\u0005\u0003\u0000\u0000\u02ad\u02ae\u0005\n\u0000"+
		"\u0000\u02ae\u02f3\u0005\u0004\u0000\u0000\u02af\u02b0\u0005\n\u0000\u0000"+
		"\u02b0\u02b1\u0005\u0003\u0000\u0000\u02b1\u02b2\u0005\u0004\u0000\u0000"+
		"\u02b2\u02b3\u0005\n\u0000\u0000\u02b3\u02b4\u0005\u0003\u0000\u0000\u02b4"+
		"\u02b5\u0005\n\u0000\u0000\u02b5\u02b6\u0005\u0003\u0000\u0000\u02b6\u02b7"+
		"\u0005\n\u0000\u0000\u02b7\u02b8\u0005\u0003\u0000\u0000\u02b8\u02b9\u0005"+
		"\n\u0000\u0000\u02b9\u02ba\u0005\u0003\u0000\u0000\u02ba\u02bb\u0005\n"+
		"\u0000\u0000\u02bb\u02bc\u0005\u0003\u0000\u0000\u02bc\u02bd\u0005\n\u0000"+
		"\u0000\u02bd\u02be\u0005\u0003\u0000\u0000\u02be\u02bf\u0005\n\u0000\u0000"+
		"\u02bf\u02c0\u0005\u0003\u0000\u0000\u02c0\u02c1\u0005\n\u0000\u0000\u02c1"+
		"\u02c2\u0005\u0003\u0000\u0000\u02c2\u02c3\u0005\n\u0000\u0000\u02c3\u02c4"+
		"\u0005\u0003\u0000\u0000\u02c4\u02c5\u0005\n\u0000\u0000\u02c5\u02c6\u0005"+
		"\u0003\u0000\u0000\u02c6\u02c7\u0005\n\u0000\u0000\u02c7\u02c8\u0005\u0003"+
		"\u0000\u0000\u02c8\u02e8\u0005\u0004\u0000\u0000\u02c9\u02ca\u0005\n\u0000"+
		"\u0000\u02ca\u02cb\u0005\u0003\u0000\u0000\u02cb\u02cc\u0005\b\u0000\u0000"+
		"\u02cc\u02ce\u0005\u0003\u0000\u0000\u02cd\u02cf\u0005\b\u0000\u0000\u02ce"+
		"\u02cd\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cf"+
		"\u02d0\u0001\u0000\u0000\u0000\u02d0\u02d2\u0005\u0003\u0000\u0000\u02d1"+
		"\u02d3\u0003\u0014\n\u0000\u02d2\u02d1\u0001\u0000\u0000\u0000\u02d3\u02d4"+
		"\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d4\u02d5"+
		"\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000\u0000\u02d6\u02d7"+
		"\u0005\u0003\u0000\u0000\u02d7\u02d8\u0005\n\u0000\u0000\u02d8\u02d9\u0005"+
		"\u0003\u0000\u0000\u02d9\u02da\u0005\n\u0000\u0000\u02da\u02db\u0005\u0003"+
		"\u0000\u0000\u02db\u02dc\u0005\b\u0000\u0000\u02dc\u02dd\u0005\u0003\u0000"+
		"\u0000\u02dd\u02de\u0005\b\u0000\u0000\u02de\u02df\u0005\u0003\u0000\u0000"+
		"\u02df\u02e0\u0005\b\u0000\u0000\u02e0\u02e1\u0005\u0003\u0000\u0000\u02e1"+
		"\u02e2\u0005\b\u0000\u0000\u02e2\u02e3\u0005\u0003\u0000\u0000\u02e3\u02e4"+
		"\u0005\b\u0000\u0000\u02e4\u02e5\u0005\u0003\u0000\u0000\u02e5\u02e6\u0005"+
		"\u0004\u0000\u0000\u02e6\u02e7\u0006\u0006\uffff\uffff\u0000\u02e7\u02e9"+
		"\u0001\u0000\u0000\u0000\u02e8\u02c9\u0001\u0000\u0000\u0000\u02e9\u02ea"+
		"\u0001\u0000\u0000\u0000\u02ea\u02e8\u0001\u0000\u0000\u0000\u02ea\u02eb"+
		"\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ec\u02ed"+
		"\u0005\n\u0000\u0000\u02ed\u02ee\u0005\u0003\u0000\u0000\u02ee\u02ef\u0005"+
		"\n\u0000\u0000\u02ef\u02f0\u0005\u0003\u0000\u0000\u02f0\u02f1\u0005\u0006"+
		"\u0000\u0000\u02f1\u02f2\u0005\u0004\u0000\u0000\u02f2\u02f4\u0001\u0000"+
		"\u0000\u0000\u02f3\u02af\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001\u0000"+
		"\u0000\u0000\u02f5\u02f3\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000"+
		"\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000\u02f7\u02f8\u0005\u0005"+
		"\u0000\u0000\u02f8\u02f9\u0005\u0003\u0000\u0000\u02f9\u02fa\u0005\n\u0000"+
		"\u0000\u02fa\u02fb\u0005\u0003\u0000\u0000\u02fb\u02fc\u0005\n\u0000\u0000"+
		"\u02fc\u02fd\u0005\n\u0000\u0000\u02fd\u02fe\u0005\n\u0000\u0000\u02fe"+
		"\u02ff\u0005\u0003\u0000\u0000\u02ff\u0300\u0005\n\u0000\u0000\u0300\u0301"+
		"\u0005\u0003\u0000\u0000\u0301\u0302\u0005\n\u0000\u0000\u0302\u0303\u0005"+
		"\u0004\u0000\u0000\u0303\r\u0001\u0000\u0000\u0000\u0304\u0305\u0005\u0005"+
		"\u0000\u0000\u0305\u0306\u0005\u0003\u0000\u0000\u0306\u0307\u0005\n\u0000"+
		"\u0000\u0307\u0308\u0005\n\u0000\u0000\u0308\u0309\u0005\u0003\u0000\u0000"+
		"\u0309\u030a\u0005\n\u0000\u0000\u030a\u030b\u0005\u0003\u0000\u0000\u030b"+
		"\u030c\u0005\n\u0000\u0000\u030c\u035e\u0005\u0004\u0000\u0000\u030d\u030e"+
		"\u0005\u0005\u0000\u0000\u030e\u030f\u0005\u0003\u0000\u0000\u030f\u0310"+
		"\u0005\b\u0000\u0000\u0310\u0314\u0005\u0003\u0000\u0000\u0311\u0313\u0003"+
		"\u0014\n\u0000\u0312\u0311\u0001\u0000\u0000\u0000\u0313\u0316\u0001\u0000"+
		"\u0000\u0000\u0314\u0312\u0001\u0000\u0000\u0000\u0314\u0315\u0001\u0000"+
		"\u0000\u0000\u0315\u0317\u0001\u0000\u0000\u0000\u0316\u0314\u0001\u0000"+
		"\u0000\u0000\u0317\u0318\u0005\u0004\u0000\u0000\u0318\u031a\u0003\u0014"+
		"\n\u0000\u0319\u031b\u0003\u0014\n\u0000\u031a\u0319\u0001\u0000\u0000"+
		"\u0000\u031a\u031b\u0001\u0000\u0000\u0000\u031b\u031d\u0001\u0000\u0000"+
		"\u0000\u031c\u031e\u0003\u0014\n\u0000\u031d\u031c\u0001\u0000\u0000\u0000"+
		"\u031d\u031e\u0001\u0000\u0000\u0000\u031e\u0320\u0001\u0000\u0000\u0000"+
		"\u031f\u0321\u0003\u0014\n\u0000\u0320\u031f\u0001\u0000\u0000\u0000\u0320"+
		"\u0321\u0001\u0000\u0000\u0000\u0321\u0323\u0001\u0000\u0000\u0000\u0322"+
		"\u0324\u0003\u0014\n\u0000\u0323\u0322\u0001\u0000\u0000\u0000\u0323\u0324"+
		"\u0001\u0000\u0000\u0000\u0324\u0326\u0001\u0000\u0000\u0000\u0325\u0327"+
		"\u0003\u0014\n\u0000\u0326\u0325\u0001\u0000\u0000\u0000\u0326\u0327\u0001"+
		"\u0000\u0000\u0000\u0327\u0329\u0001\u0000\u0000\u0000\u0328\u032a\u0003"+
		"\u0014\n\u0000\u0329\u0328\u0001\u0000\u0000\u0000\u0329\u032a\u0001\u0000"+
		"\u0000\u0000\u032a\u032e\u0001\u0000\u0000\u0000\u032b\u032d\u0003\u0014"+
		"\n\u0000\u032c\u032b\u0001\u0000\u0000\u0000\u032d\u0330\u0001\u0000\u0000"+
		"\u0000\u032e\u032c\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000\u0000"+
		"\u0000\u032f\u0331\u0001\u0000\u0000\u0000\u0330\u032e\u0001\u0000\u0000"+
		"\u0000\u0331\u0332\u0005\u0004\u0000\u0000\u0332\u0334\u0003\u0014\n\u0000"+
		"\u0333\u0335\u0003\u0014\n\u0000\u0334\u0333\u0001\u0000\u0000\u0000\u0334"+
		"\u0335\u0001\u0000\u0000\u0000\u0335\u0337\u0001\u0000\u0000\u0000\u0336"+
		"\u0338\u0003\u0014\n\u0000\u0337\u0336\u0001\u0000\u0000\u0000\u0337\u0338"+
		"\u0001\u0000\u0000\u0000\u0338\u033a\u0001\u0000\u0000\u0000\u0339\u033b"+
		"\u0003\u0014\n\u0000\u033a\u0339\u0001\u0000\u0000\u0000\u033a\u033b\u0001"+
		"\u0000\u0000\u0000\u033b\u033d\u0001\u0000\u0000\u0000\u033c\u033e\u0003"+
		"\u0014\n\u0000\u033d\u033c\u0001\u0000\u0000\u0000\u033d\u033e\u0001\u0000"+
		"\u0000\u0000\u033e\u0340\u0001\u0000\u0000\u0000\u033f\u0341\u0003\u0014"+
		"\n\u0000\u0340\u033f\u0001\u0000\u0000\u0000\u0340\u0341\u0001\u0000\u0000"+
		"\u0000\u0341\u0343\u0001\u0000\u0000\u0000\u0342\u0344\u0003\u0014\n\u0000"+
		"\u0343\u0342\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000\u0000"+
		"\u0344\u0348\u0001\u0000\u0000\u0000\u0345\u0347\u0003\u0014\n\u0000\u0346"+
		"\u0345\u0001\u0000\u0000\u0000\u0347\u034a\u0001\u0000\u0000\u0000\u0348"+
		"\u0346\u0001\u0000\u0000\u0000\u0348\u0349\u0001\u0000\u0000\u0000\u0349"+
		"\u034b\u0001\u0000\u0000\u0000\u034a\u0348\u0001\u0000\u0000\u0000\u034b"+
		"\u034c\u0005\u0004\u0000\u0000\u034c\u0350\u0005\u0006\u0000\u0000\u034d"+
		"\u034f\u0005\n\u0000\u0000\u034e\u034d\u0001\u0000\u0000\u0000\u034f\u0352"+
		"\u0001\u0000\u0000\u0000\u0350\u034e\u0001\u0000\u0000\u0000\u0350\u0351"+
		"\u0001\u0000\u0000\u0000\u0351\u0353\u0001\u0000\u0000\u0000\u0352\u0350"+
		"\u0001\u0000\u0000\u0000\u0353\u0354\u0005\u0004\u0000\u0000\u0354\u0355"+
		"\u0003\u0014\n\u0000\u0355\u0356\u0005\u0004\u0000\u0000\u0356\u0357\u0005"+
		"\n\u0000\u0000\u0357\u0358\u0005\u0003\u0000\u0000\u0358\u0359\u0005\n"+
		"\u0000\u0000\u0359\u035a\u0005\u0003\u0000\u0000\u035a\u035b\u0005\u0006"+
		"\u0000\u0000\u035b\u035c\u0005\u0004\u0000\u0000\u035c\u035d\u0006\u0007"+
		"\uffff\uffff\u0000\u035d\u035f\u0001\u0000\u0000\u0000\u035e\u030d\u0001"+
		"\u0000\u0000\u0000\u035f\u0360\u0001\u0000\u0000\u0000\u0360\u035e\u0001"+
		"\u0000\u0000\u0000\u0360\u0361\u0001\u0000\u0000\u0000\u0361\u0362\u0001"+
		"\u0000\u0000\u0000\u0362\u0363\u0005\u0005\u0000\u0000\u0363\u0364\u0005"+
		"\u0003\u0000\u0000\u0364\u0365\u0005\n\u0000\u0000\u0365\u0366\u0005\n"+
		"\u0000\u0000\u0366\u0367\u0005\u0003\u0000\u0000\u0367\u0368\u0005\n\u0000"+
		"\u0000\u0368\u0369\u0005\u0003\u0000\u0000\u0369\u036a\u0005\n\u0000\u0000"+
		"\u036a\u036b\u0005\u0004\u0000\u0000\u036b\u000f\u0001\u0000\u0000\u0000"+
		"\u036c\u036d\u0005\u0005\u0000\u0000\u036d\u036e\u0005\u0003\u0000\u0000"+
		"\u036e\u036f\u0005\n\u0000\u0000\u036f\u0370\u0005\n\u0000\u0000\u0370"+
		"\u0371\u0005\n\u0000\u0000\u0371\u0372\u0005\u0003\u0000\u0000\u0372\u0373"+
		"\u0005\n\u0000\u0000\u0373\u0374\u0005\n\u0000\u0000\u0374\u0375\u0005"+
		"\n\u0000\u0000\u0375\u0376\u0005\u0003\u0000\u0000\u0376\u0377\u0005\n"+
		"\u0000\u0000\u0377\u0378\u0005\u0003\u0000\u0000\u0378\u0379\u0005\n\u0000"+
		"\u0000\u0379\u03e8\u0005\u0004\u0000\u0000\u037a\u037b\u0005\u0005\u0000"+
		"\u0000\u037b\u037c\u0005\u0003\u0000\u0000\u037c\u037d\u0005\b\u0000\u0000"+
		"\u037d\u037e\u0005\u0004\u0000\u0000\u037e\u037f\u0005\n\u0000\u0000\u037f"+
		"\u0381\u0005\u0003\u0000\u0000\u0380\u0382\u0005\n\u0000\u0000\u0381\u0380"+
		"\u0001\u0000\u0000\u0000\u0381\u0382\u0001\u0000\u0000\u0000\u0382\u0383"+
		"\u0001\u0000\u0000\u0000\u0383\u0384\u0005\u0003\u0000\u0000\u0384\u0385"+
		"\u0005\n\u0000\u0000\u0385\u0386\u0005\u0003\u0000\u0000\u0386\u0387\u0005"+
		"\n\u0000\u0000\u0387\u0388\u0005\u0003\u0000\u0000\u0388\u0389\u0005\n"+
		"\u0000\u0000\u0389\u038a\u0005\u0003\u0000\u0000\u038a\u038b\u0005\n\u0000"+
		"\u0000\u038b\u038c\u0005\u0003\u0000\u0000\u038c\u038d\u0005\n\u0000\u0000"+
		"\u038d\u038e\u0005\u0003\u0000\u0000\u038e\u038f\u0005\n\u0000\u0000\u038f"+
		"\u0390\u0005\u0003\u0000\u0000\u0390\u0391\u0005\n\u0000\u0000\u0391\u0392"+
		"\u0005\u0003\u0000\u0000\u0392\u0393\u0005\n\u0000\u0000\u0393\u0394\u0005"+
		"\u0003\u0000\u0000\u0394\u03de\u0005\u0004\u0000\u0000\u0395\u0396\u0005"+
		"\u0003\u0000\u0000\u0396\u0397\u0005\u0003\u0000\u0000\u0397\u0398\u0005"+
		"\u0003\u0000\u0000\u0398\u0399\u0005\u0003\u0000\u0000\u0399\u039a\u0005"+
		"\u0003\u0000\u0000\u039a\u039b\u0005\u0003\u0000\u0000\u039b\u039c\u0005"+
		"\u0003\u0000\u0000\u039c\u039d\u0005\u0003\u0000\u0000\u039d\u039e\u0005"+
		"\u0003\u0000\u0000\u039e\u039f\u0005\u0003\u0000\u0000\u039f\u03df\u0005"+
		"\u0004\u0000\u0000\u03a0\u03a2\u0003\u0014\n\u0000\u03a1\u03a3\u0003\u0014"+
		"\n\u0000\u03a2\u03a1\u0001\u0000\u0000\u0000\u03a2\u03a3\u0001\u0000\u0000"+
		"\u0000\u03a3\u03a5\u0001\u0000\u0000\u0000\u03a4\u03a6\u0003\u0014\n\u0000"+
		"\u03a5\u03a4\u0001\u0000\u0000\u0000\u03a5\u03a6\u0001\u0000\u0000\u0000"+
		"\u03a6\u03a8\u0001\u0000\u0000\u0000\u03a7\u03a9\u0003\u0014\n\u0000\u03a8"+
		"\u03a7\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000\u0000\u03a9"+
		"\u03ab\u0001\u0000\u0000\u0000\u03aa\u03ac\u0003\u0014\n\u0000\u03ab\u03aa"+
		"\u0001\u0000\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000\u0000\u03ac\u03ae"+
		"\u0001\u0000\u0000\u0000\u03ad\u03af\u0003\u0014\n\u0000\u03ae\u03ad\u0001"+
		"\u0000\u0000\u0000\u03ae\u03af\u0001\u0000\u0000\u0000\u03af\u03b1\u0001"+
		"\u0000\u0000\u0000\u03b0\u03b2\u0003\u0014\n\u0000\u03b1\u03b0\u0001\u0000"+
		"\u0000\u0000\u03b1\u03b2\u0001\u0000\u0000\u0000\u03b2\u03b6\u0001\u0000"+
		"\u0000\u0000\u03b3\u03b5\u0003\u0014\n\u0000\u03b4\u03b3\u0001\u0000\u0000"+
		"\u0000\u03b5\u03b8\u0001\u0000\u0000\u0000\u03b6\u03b4\u0001\u0000\u0000"+
		"\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000\u03b7\u03b9\u0001\u0000\u0000"+
		"\u0000\u03b8\u03b6\u0001\u0000\u0000\u0000\u03b9\u03bb\u0005\u0003\u0000"+
		"\u0000\u03ba\u03bc\u0005\n\u0000\u0000\u03bb\u03ba\u0001\u0000\u0000\u0000"+
		"\u03bb\u03bc\u0001\u0000\u0000\u0000\u03bc\u03bd\u0001\u0000\u0000\u0000"+
		"\u03bd\u03be\u0005\u0003\u0000\u0000\u03be\u03bf\u0005\n\u0000\u0000\u03bf"+
		"\u03c3\u0005\u0003\u0000\u0000\u03c0\u03c2\u0003\u0014\n\u0000\u03c1\u03c0"+
		"\u0001\u0000\u0000\u0000\u03c2\u03c5\u0001\u0000\u0000\u0000\u03c3\u03c1"+
		"\u0001\u0000\u0000\u0000\u03c3\u03c4\u0001\u0000\u0000\u0000\u03c4\u03c6"+
		"\u0001\u0000\u0000\u0000\u03c5\u03c3\u0001\u0000\u0000\u0000\u03c6\u03c8"+
		"\u0005\u0003\u0000\u0000\u03c7\u03c9\u0005\u0006\u0000\u0000\u03c8\u03c7"+
		"\u0001\u0000\u0000\u0000\u03c8\u03c9\u0001\u0000\u0000\u0000\u03c9\u03ca"+
		"\u0001\u0000\u0000\u0000\u03ca\u03cb\u0005\u0003\u0000\u0000\u03cb\u03cc"+
		"\u0005\u0006\u0000\u0000\u03cc\u03ce\u0005\u0003\u0000\u0000\u03cd\u03cf"+
		"\u0005\n\u0000\u0000\u03ce\u03cd\u0001\u0000\u0000\u0000\u03ce\u03cf\u0001"+
		"\u0000\u0000\u0000\u03cf\u03d0\u0001\u0000\u0000\u0000\u03d0\u03d1\u0005"+
		"\u0003\u0000\u0000\u03d1\u03d2\u0005\b\u0000\u0000\u03d2\u03d4\u0005\u0003"+
		"\u0000\u0000\u03d3\u03d5\u0005\b\u0000\u0000\u03d4\u03d3\u0001\u0000\u0000"+
		"\u0000\u03d4\u03d5\u0001\u0000\u0000\u0000\u03d5\u03d6\u0001\u0000\u0000"+
		"\u0000\u03d6\u03d8\u0005\u0003\u0000\u0000\u03d7\u03d9\u0005\b\u0000\u0000"+
		"\u03d8\u03d7\u0001\u0000\u0000\u0000\u03d8\u03d9\u0001\u0000\u0000\u0000"+
		"\u03d9\u03da\u0001\u0000\u0000\u0000\u03da\u03db\u0005\u0003\u0000\u0000"+
		"\u03db\u03dc\u0005\u0004\u0000\u0000\u03dc\u03dd\u0006\b\uffff\uffff\u0000"+
		"\u03dd\u03df\u0001\u0000\u0000\u0000\u03de\u0395\u0001\u0000\u0000\u0000"+
		"\u03de\u03a0\u0001\u0000\u0000\u0000\u03df\u03e0\u0001\u0000\u0000\u0000"+
		"\u03e0\u03de\u0001\u0000\u0000\u0000\u03e0\u03e1\u0001\u0000\u0000\u0000"+
		"\u03e1\u03e2\u0001\u0000\u0000\u0000\u03e2\u03e3\u0005\n\u0000\u0000\u03e3"+
		"\u03e4\u0005\u0003\u0000\u0000\u03e4\u03e5\u0005\n\u0000\u0000\u03e5\u03e6"+
		"\u0005\u0003\u0000\u0000\u03e6\u03e7\u0005\u0006\u0000\u0000\u03e7\u03e9"+
		"\u0005\u0004\u0000\u0000\u03e8\u037a\u0001\u0000\u0000\u0000\u03e9\u03ea"+
		"\u0001\u0000\u0000\u0000\u03ea\u03e8\u0001\u0000\u0000\u0000\u03ea\u03eb"+
		"\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001\u0000\u0000\u0000\u03ec\u03ed"+
		"\u0005\u0005\u0000\u0000\u03ed\u03ee\u0005\u0003\u0000\u0000\u03ee\u03ef"+
		"\u0005\n\u0000\u0000\u03ef\u03f0\u0005\n\u0000\u0000\u03f0\u03f1\u0005"+
		"\n\u0000\u0000\u03f1\u03f2\u0005\u0003\u0000\u0000\u03f2\u03f3\u0005\n"+
		"\u0000\u0000\u03f3\u03f4\u0005\n\u0000\u0000\u03f4\u03f5\u0005\n\u0000"+
		"\u0000\u03f5\u03f6\u0005\u0003\u0000\u0000\u03f6\u03f7\u0005\n\u0000\u0000"+
		"\u03f7\u03f8\u0005\u0003\u0000\u0000\u03f8\u03f9\u0005\n\u0000\u0000\u03f9"+
		"\u03fa\u0005\u0004\u0000\u0000\u03fa\u0011\u0001\u0000\u0000\u0000\u03fb"+
		"\u03fc\u0005\u0005\u0000\u0000\u03fc\u03fd\u0005\u0003\u0000\u0000\u03fd"+
		"\u03fe\u0005\n\u0000\u0000\u03fe\u03ff\u0005\u0003\u0000\u0000\u03ff\u0400"+
		"\u0005\n\u0000\u0000\u0400\u0401\u0005\n\u0000\u0000\u0401\u0402\u0005"+
		"\n\u0000\u0000\u0402\u0403\u0005\u0003\u0000\u0000\u0403\u0404\u0005\n"+
		"\u0000\u0000\u0404\u0405\u0005\u0003\u0000\u0000\u0405\u0406\u0005\n\u0000"+
		"\u0000\u0406\u0485\u0005\u0004\u0000\u0000\u0407\u0408\u0005\n\u0000\u0000"+
		"\u0408\u0409\u0005\u0003\u0000\u0000\u0409\u040a\u0005\n\u0000\u0000\u040a"+
		"\u040b\u0005\u0004\u0000\u0000\u040b\u040c\u0005\n\u0000\u0000\u040c\u040d"+
		"\u0005\u0003\u0000\u0000\u040d\u040e\u0005\n\u0000\u0000\u040e\u040f\u0005"+
		"\u0004\u0000\u0000\u040f\u0410\u0005\n\u0000\u0000\u0410\u0411\u0005\u0003"+
		"\u0000\u0000\u0411\u0412\u0005\n\u0000\u0000\u0412\u0413\u0005\u0003\u0000"+
		"\u0000\u0413\u0414\u0005\n\u0000\u0000\u0414\u0415\u0005\u0003\u0000\u0000"+
		"\u0415\u0416\u0005\n\u0000\u0000\u0416\u0417\u0005\u0003\u0000\u0000\u0417"+
		"\u0418\u0005\n\u0000\u0000\u0418\u0419\u0005\u0003\u0000\u0000\u0419\u041a"+
		"\u0005\n\u0000\u0000\u041a\u041b\u0005\u0003\u0000\u0000\u041b\u041c\u0005"+
		"\n\u0000\u0000\u041c\u041d\u0005\u0003\u0000\u0000\u041d\u041e\u0005\n"+
		"\u0000\u0000\u041e\u041f\u0005\u0003\u0000\u0000\u041f\u0420\u0005\n\u0000"+
		"\u0000\u0420\u0421\u0005\u0003\u0000\u0000\u0421\u0422\u0005\n\u0000\u0000"+
		"\u0422\u0423\u0005\u0003\u0000\u0000\u0423\u0424\u0005\n\u0000\u0000\u0424"+
		"\u0425\u0005\u0003\u0000\u0000\u0425\u0426\u0005\n\u0000\u0000\u0426\u0427"+
		"\u0005\u0003\u0000\u0000\u0427\u0428\u0005\u0004\u0000\u0000\u0428\u0429"+
		"\u0005\n\u0000\u0000\u0429\u042a\u0005\u0003\u0000\u0000\u042a\u042b\u0005"+
		"\n\u0000\u0000\u042b\u042c\u0005\u0003\u0000\u0000\u042c\u042d\u0005\n"+
		"\u0000\u0000\u042d\u042e\u0005\u0003\u0000\u0000\u042e\u042f\u0005\n\u0000"+
		"\u0000\u042f\u0430\u0005\u0003\u0000\u0000\u0430\u0431\u0005\n\u0000\u0000"+
		"\u0431\u0432\u0005\u0003\u0000\u0000\u0432\u0433\u0005\n\u0000\u0000\u0433"+
		"\u0434\u0005\u0003\u0000\u0000\u0434\u0477\u0005\u0004\u0000\u0000\u0435"+
		"\u0436\u0005\u0003\u0000\u0000\u0436\u0437\u0005\u0003\u0000\u0000\u0437"+
		"\u0438\u0005\u0003\u0000\u0000\u0438\u0439\u0005\u0003\u0000\u0000\u0439"+
		"\u043a\u0005\u0003\u0000\u0000\u043a\u043b\u0005\u0003\u0000\u0000\u043b"+
		"\u043c\u0005\u0003\u0000\u0000\u043c\u043d\u0005\u0003\u0000\u0000\u043d"+
		"\u043e\u0005\u0003\u0000\u0000\u043e\u043f\u0005\u0003\u0000\u0000\u043f"+
		"\u0440\u0005\u0003\u0000\u0000\u0440\u0441\u0005\u0003\u0000\u0000\u0441"+
		"\u0442\u0005\u0003\u0000\u0000\u0442\u0443\u0005\u0003\u0000\u0000\u0443"+
		"\u0444\u0005\u0003\u0000\u0000\u0444\u0445\u0005\u0003\u0000\u0000\u0445"+
		"\u0446\u0005\u0003\u0000\u0000\u0446\u0478\u0005\u0004\u0000\u0000\u0447"+
		"\u0448\u0005\u0006\u0000\u0000\u0448\u044a\u0005\u0003\u0000\u0000\u0449"+
		"\u044b\u0005\u0006\u0000\u0000\u044a\u0449\u0001\u0000\u0000\u0000\u044a"+
		"\u044b\u0001\u0000\u0000\u0000\u044b\u044c\u0001\u0000\u0000\u0000\u044c"+
		"\u044e\u0005\u0003\u0000\u0000\u044d\u044f\u0005\u0006\u0000\u0000\u044e"+
		"\u044d\u0001\u0000\u0000\u0000\u044e\u044f\u0001\u0000\u0000\u0000\u044f"+
		"\u0450\u0001\u0000\u0000\u0000\u0450\u0451\u0005\u0003\u0000\u0000\u0451"+
		"\u0452\u0005\b\u0000\u0000\u0452\u0454\u0005\u0003\u0000\u0000\u0453\u0455"+
		"\u0003\u0014\n\u0000\u0454\u0453\u0001\u0000\u0000\u0000\u0455\u0456\u0001"+
		"\u0000\u0000\u0000\u0456\u0454\u0001\u0000\u0000\u0000\u0456\u0457\u0001"+
		"\u0000\u0000\u0000\u0457\u0458\u0001\u0000\u0000\u0000\u0458\u0459\u0005"+
		"\u0003\u0000\u0000\u0459\u045a\u0005\n\u0000\u0000\u045a\u045b\u0005\u0003"+
		"\u0000\u0000\u045b\u045c\u0005\n\u0000\u0000\u045c\u045d\u0005\u0003\u0000"+
		"\u0000\u045d\u045e\u0005\n\u0000\u0000\u045e\u045f\u0005\u0003\u0000\u0000"+
		"\u045f\u0460\u0005\n\u0000\u0000\u0460\u0461\u0005\u0003\u0000\u0000\u0461"+
		"\u0462\u0005\b\u0000\u0000\u0462\u0464\u0005\u0003\u0000\u0000\u0463\u0465"+
		"\u0005\b\u0000\u0000\u0464\u0463\u0001\u0000\u0000\u0000\u0464\u0465\u0001"+
		"\u0000\u0000\u0000\u0465\u0466\u0001\u0000\u0000\u0000\u0466\u0467\u0005"+
		"\u0003\u0000\u0000\u0467\u0468\u0005\b\u0000\u0000\u0468\u0469\u0005\u0003"+
		"\u0000\u0000\u0469\u046a\u0005\b\u0000\u0000\u046a\u046c\u0005\u0003\u0000"+
		"\u0000\u046b\u046d\u0005\b\u0000\u0000\u046c\u046b\u0001\u0000\u0000\u0000"+
		"\u046c\u046d\u0001\u0000\u0000\u0000\u046d\u046e\u0001\u0000\u0000\u0000"+
		"\u046e\u046f\u0005\u0003\u0000\u0000\u046f\u0470\u0005\u0003\u0000\u0000"+
		"\u0470\u0471\u0005\b\u0000\u0000\u0471\u0472\u0005\u0003\u0000\u0000\u0472"+
		"\u0473\u0005\b\u0000\u0000\u0473\u0474\u0005\u0003\u0000\u0000\u0474\u0475"+
		"\u0005\u0004\u0000\u0000\u0475\u0476\u0006\t\uffff\uffff\u0000\u0476\u0478"+
		"\u0001\u0000\u0000\u0000\u0477\u0435\u0001\u0000\u0000\u0000\u0477\u0447"+
		"\u0001\u0000\u0000\u0000\u0478\u0479\u0001\u0000\u0000\u0000\u0479\u0477"+
		"\u0001\u0000\u0000\u0000\u0479\u047a\u0001\u0000\u0000\u0000\u047a\u047c"+
		"\u0001\u0000\u0000\u0000\u047b\u0407\u0001\u0000\u0000\u0000\u047c\u047d"+
		"\u0001\u0000\u0000\u0000\u047d\u047b\u0001\u0000\u0000\u0000\u047d\u047e"+
		"\u0001\u0000\u0000\u0000\u047e\u047f\u0001\u0000\u0000\u0000\u047f\u0480"+
		"\u0005\n\u0000\u0000\u0480\u0481\u0005\u0003\u0000\u0000\u0481\u0482\u0005"+
		"\n\u0000\u0000\u0482\u0483\u0005\u0003\u0000\u0000\u0483\u0484\u0005\u0006"+
		"\u0000\u0000\u0484\u0486\u0005\u0004\u0000\u0000\u0485\u047b\u0001\u0000"+
		"\u0000\u0000\u0486\u0487\u0001\u0000\u0000\u0000\u0487\u0485\u0001\u0000"+
		"\u0000\u0000\u0487\u0488\u0001\u0000\u0000\u0000\u0488\u0489\u0001\u0000"+
		"\u0000\u0000\u0489\u048a\u0005\u0005\u0000\u0000\u048a\u048b\u0005\u0003"+
		"\u0000\u0000\u048b\u048c\u0005\n\u0000\u0000\u048c\u048d\u0005\u0003\u0000"+
		"\u0000\u048d\u048e\u0005\n\u0000\u0000\u048e\u048f\u0005\n\u0000\u0000"+
		"\u048f\u0490\u0005\n\u0000\u0000\u0490\u0491\u0005\u0003\u0000\u0000\u0491"+
		"\u0492\u0005\n\u0000\u0000\u0492\u0493\u0005\u0003\u0000\u0000\u0493\u0494"+
		"\u0005\n\u0000\u0000\u0494\u0495\u0005\u0004\u0000\u0000\u0495\u0013\u0001"+
		"\u0000\u0000\u0000\u0496\u0497\u0007\u0000\u0000\u0000\u0497\u0015\u0001"+
		"\u0000\u0000\u0000\u0498\u049b\u0003\u0014\n\u0000\u0499\u049b\u0005\u0003"+
		"\u0000\u0000\u049a\u0498\u0001\u0000\u0000\u0000\u049a\u0499\u0001\u0000"+
		"\u0000\u0000\u049b\u049c\u0001\u0000\u0000\u0000\u049c\u049a\u0001\u0000"+
		"\u0000\u0000\u049c\u049d\u0001\u0000\u0000\u0000\u049d\u049e\u0001\u0000"+
		"\u0000\u0000\u049e\u049f\u0005\u0004\u0000\u0000\u049f\u0017\u0001\u0000"+
		"\u0000\u0000\u04a0\u04a4\u0003\u0014\n\u0000\u04a1\u04a4\u0005\u0003\u0000"+
		"\u0000\u04a2\u04a4\u0005\u0004\u0000\u0000\u04a3\u04a0\u0001\u0000\u0000"+
		"\u0000\u04a3\u04a1\u0001\u0000\u0000\u0000\u04a3\u04a2\u0001\u0000\u0000"+
		"\u0000\u04a4\u04a5\u0001\u0000\u0000\u0000\u04a5\u04a3\u0001\u0000\u0000"+
		"\u0000\u04a5\u04a6\u0001\u0000\u0000\u0000\u04a6\u0019\u0001\u0000\u0000"+
		"\u0000v#x{~\u0081\u0084\u0087\u008c\u009b\u00a4\u00a6\u00e4\u00e7\u00ea"+
		"\u00ed\u00f0\u00f3\u00f8\u0100\u0103\u0106\u0109\u010c\u010f\u0114\u0121"+
		"\u012a\u0134\u013f\u015e\u0165\u0168\u016b\u016e\u0171\u0174\u0179\u0181"+
		"\u0184\u0187\u018a\u018d\u0190\u0195\u01ba\u01be\u01c2\u01c6\u01ca\u01d2"+
		"\u01d7\u01d9\u01dd\u01e8\u0206\u0230\u0232\u0236\u0241\u0262\u0265\u0268"+
		"\u026b\u026e\u0271\u0276\u0295\u02ce\u02d4\u02ea\u02f5\u0314\u031a\u031d"+
		"\u0320\u0323\u0326\u0329\u032e\u0334\u0337\u033a\u033d\u0340\u0343\u0348"+
		"\u0350\u0360\u0381\u03a2\u03a5\u03a8\u03ab\u03ae\u03b1\u03b6\u03bb\u03c3"+
		"\u03c8\u03ce\u03d4\u03d8\u03de\u03e0\u03ea\u044a\u044e\u0456\u0464\u046c"+
		"\u0477\u0479\u047d\u0487\u049a\u049c\u04a3\u04a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}