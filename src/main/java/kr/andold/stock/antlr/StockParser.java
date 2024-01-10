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
		RULE_stockDocument = 0, RULE_krxBasicInfoEtf = 1, RULE_krxBasicInfoCompany = 2, 
		RULE_etfAllPrice = 3, RULE_companyAllPrice = 4, RULE_crawlPriceKrx = 5, 
		RULE_crawlItemEtf = 6, RULE_crawlPriceEtf = 7, RULE_crawlPriceCompany = 8, 
		RULE_crawlItemDetailCompanyThread = 9, RULE_crawlItemDividendTopCompany = 10, 
		RULE_crawlEtfDetailThread = 11, RULE_crawlDividendHistoryEtfThread = 12, 
		RULE_crawlDividendHistoryCompanyThread = 13, RULE_word = 14, RULE_line = 15, 
		RULE_eof = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"stockDocument", "krxBasicInfoEtf", "krxBasicInfoCompany", "etfAllPrice", 
			"companyAllPrice", "crawlPriceKrx", "crawlItemEtf", "crawlPriceEtf", 
			"crawlPriceCompany", "crawlItemDetailCompanyThread", "crawlItemDividendTopCompany", 
			"crawlEtfDetailThread", "crawlDividendHistoryEtfThread", "crawlDividendHistoryCompanyThread", 
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
		public CompanyAllPriceContext companyAllPrice() {
			return getRuleContext(CompanyAllPriceContext.class,0);
		}
		public EtfAllPriceContext etfAllPrice() {
			return getRuleContext(EtfAllPriceContext.class,0);
		}
		public KrxBasicInfoCompanyContext krxBasicInfoCompany() {
			return getRuleContext(KrxBasicInfoCompanyContext.class,0);
		}
		public KrxBasicInfoEtfContext krxBasicInfoEtf() {
			return getRuleContext(KrxBasicInfoEtfContext.class,0);
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
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				crawlDividendHistoryCompanyThread();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				crawlDividendHistoryEtfThread();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				crawlItemDividendTopCompany();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				crawlItemEtf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				crawlItemDetailCompanyThread();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(39);
				crawlEtfDetailThread();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(40);
				crawlPriceCompany();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(41);
				crawlPriceEtf();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(42);
				crawlPriceKrx();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(43);
				companyAllPrice();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(44);
				etfAllPrice();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(45);
				krxBasicInfoCompany();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(46);
				krxBasicInfoEtf();
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

	public static class KrxBasicInfoEtfContext extends ParserRuleContext {
		public WordContext code;
		public WordContext symbol;
		public WordContext symbol1;
		public WordContext symbol2;
		public WordContext symbol3;
		public WordContext symbol4;
		public WordContext symbol5;
		public WordContext symbol6;
		public WordContext symbol7;
		public Token ipo;
		public Token volumeOfListedShares;
		public Token fee;
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
		public KrxBasicInfoEtfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_krxBasicInfoEtf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterKrxBasicInfoEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitKrxBasicInfoEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitKrxBasicInfoEtf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KrxBasicInfoEtfContext krxBasicInfoEtf() throws RecognitionException {
		KrxBasicInfoEtfContext _localctx = new KrxBasicInfoEtfContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_krxBasicInfoEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(KEYWORD);
			setState(50);
			match(TAB);
			setState(51);
			match(WORD);
			setState(52);
			match(TAB);
			setState(53);
			match(WORD);
			setState(54);
			match(WORD);
			setState(55);
			match(WORD);
			setState(56);
			match(WORD);
			setState(57);
			match(WORD);
			setState(58);
			match(WORD);
			setState(59);
			match(TAB);
			setState(60);
			match(WORD);
			setState(61);
			match(NEWLINE);
			setState(315); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				match(WORD);
				setState(63);
				match(TAB);
				setState(64);
				match(NEWLINE);
				setState(65);
				match(WORD);
				setState(66);
				match(TAB);
				setState(67);
				match(TAB);
				setState(68);
				match(TAB);
				setState(69);
				match(NEWLINE);
				setState(70);
				match(WORD);
				setState(71);
				match(TAB);
				setState(72);
				match(TAB);
				setState(73);
				match(TAB);
				setState(74);
				match(NEWLINE);
				setState(75);
				match(WORD);
				setState(76);
				match(TAB);
				setState(77);
				match(TAB);
				setState(78);
				match(TAB);
				setState(79);
				match(NEWLINE);
				setState(80);
				match(WORD);
				setState(81);
				match(TAB);
				setState(82);
				match(TAB);
				setState(83);
				match(TAB);
				setState(84);
				match(NEWLINE);
				setState(85);
				match(WORD);
				setState(86);
				match(TAB);
				setState(87);
				match(TAB);
				setState(88);
				match(TAB);
				setState(89);
				match(NEWLINE);
				setState(90);
				match(WORD);
				setState(91);
				match(TAB);
				setState(92);
				match(TAB);
				setState(93);
				match(TAB);
				setState(94);
				match(NEWLINE);
				setState(95);
				match(WORD);
				setState(96);
				match(TAB);
				setState(97);
				match(TAB);
				setState(98);
				match(TAB);
				setState(99);
				match(NEWLINE);
				setState(100);
				match(WORD);
				setState(101);
				match(TAB);
				setState(102);
				match(TAB);
				setState(103);
				match(TAB);
				setState(104);
				match(NEWLINE);
				setState(105);
				match(WORD);
				setState(106);
				match(TAB);
				setState(107);
				match(TAB);
				setState(108);
				match(TAB);
				setState(109);
				match(NEWLINE);
				setState(110);
				match(WORD);
				setState(111);
				match(TAB);
				setState(112);
				match(TAB);
				setState(113);
				match(TAB);
				setState(114);
				match(NEWLINE);
				setState(115);
				match(WORD);
				setState(116);
				match(TAB);
				setState(117);
				match(TAB);
				setState(118);
				match(TAB);
				setState(119);
				match(NEWLINE);
				setState(120);
				match(WORD);
				setState(121);
				match(TAB);
				setState(122);
				match(TAB);
				setState(123);
				match(TAB);
				setState(124);
				match(NEWLINE);
				setState(125);
				match(WORD);
				setState(126);
				match(TAB);
				setState(127);
				match(TAB);
				setState(128);
				match(TAB);
				setState(129);
				match(NEWLINE);
				setState(130);
				match(WORD);
				setState(131);
				match(TAB);
				setState(132);
				match(TAB);
				setState(133);
				match(TAB);
				setState(134);
				match(NEWLINE);
				setState(135);
				match(WORD);
				setState(136);
				match(TAB);
				setState(137);
				match(TAB);
				setState(138);
				match(TAB);
				setState(139);
				match(NEWLINE);
				setState(140);
				match(WORD);
				setState(141);
				match(TAB);
				setState(142);
				match(TAB);
				setState(143);
				match(TAB);
				setState(144);
				match(NEWLINE);
				setState(145);
				match(WORD);
				setState(146);
				match(TAB);
				setState(147);
				match(TAB);
				setState(148);
				match(TAB);
				setState(149);
				match(NEWLINE);
				setState(150);
				match(WORD);
				setState(151);
				match(TAB);
				setState(152);
				match(TAB);
				setState(153);
				match(TAB);
				setState(154);
				match(NEWLINE);
				setState(155);
				match(WORD);
				setState(156);
				match(TAB);
				setState(157);
				match(TAB);
				setState(158);
				match(TAB);
				setState(159);
				match(WORD);
				setState(160);
				match(NEWLINE);
				setState(161);
				match(WORD);
				setState(162);
				match(TAB);
				setState(163);
				match(TAB);
				setState(164);
				match(TAB);
				setState(165);
				match(NEWLINE);
				setState(304); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						{
						setState(166);
						match(WORD);
						setState(167);
						match(TAB);
						setState(168);
						match(WORD);
						setState(169);
						match(NEWLINE);
						setState(170);
						match(WORD);
						setState(171);
						match(TAB);
						setState(172);
						((KrxBasicInfoEtfContext)_localctx).code = word();
						setState(173);
						match(NEWLINE);
						setState(174);
						match(WORD);
						setState(175);
						match(TAB);
						setState(176);
						match(NEWLINE);
						setState(177);
						match(WORD);
						setState(178);
						match(TAB);
						setState(179);
						match(TAB);
						setState(181); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(180);
							word();
							}
							}
							setState(183); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(185);
						match(NEWLINE);
						setState(186);
						match(WORD);
						setState(187);
						match(TAB);
						setState(188);
						match(TAB);
						setState(189);
						((KrxBasicInfoEtfContext)_localctx).symbol = word();
						setState(191);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
						case 1:
							{
							setState(190);
							((KrxBasicInfoEtfContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(194);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
						case 1:
							{
							setState(193);
							((KrxBasicInfoEtfContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(197);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							setState(196);
							((KrxBasicInfoEtfContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(200);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
						case 1:
							{
							setState(199);
							((KrxBasicInfoEtfContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(203);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
						case 1:
							{
							setState(202);
							((KrxBasicInfoEtfContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(206);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
						case 1:
							{
							setState(205);
							((KrxBasicInfoEtfContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(211);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(208);
							((KrxBasicInfoEtfContext)_localctx).symbol7 = word();
							}
							}
							setState(213);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(214);
						match(NEWLINE);
						setState(215);
						match(WORD);
						setState(216);
						match(TAB);
						setState(217);
						match(NEWLINE);
						setState(218);
						match(WORD);
						setState(219);
						match(TAB);
						setState(221); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(220);
							word();
							}
							}
							setState(223); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(225);
						match(NEWLINE);
						setState(226);
						match(WORD);
						setState(227);
						match(TAB);
						setState(228);
						((KrxBasicInfoEtfContext)_localctx).ipo = match(DATE);
						setState(229);
						match(NEWLINE);
						setState(230);
						match(WORD);
						setState(231);
						match(TAB);
						setState(233); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(232);
							word();
							}
							}
							setState(235); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(237);
						match(NEWLINE);
						setState(238);
						match(WORD);
						setState(239);
						match(TAB);
						setState(241); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(240);
							word();
							}
							}
							setState(243); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(245);
						match(NEWLINE);
						setState(246);
						match(WORD);
						setState(247);
						match(TAB);
						setState(249); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(248);
							word();
							}
							}
							setState(251); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(253);
						match(NEWLINE);
						setState(254);
						match(WORD);
						setState(255);
						match(TAB);
						setState(256);
						match(WORD);
						setState(257);
						match(NEWLINE);
						setState(258);
						match(WORD);
						setState(259);
						match(TAB);
						setState(260);
						match(NEWLINE);
						setState(261);
						match(WORD);
						setState(262);
						match(TAB);
						setState(263);
						match(TAB);
						setState(264);
						match(WORD);
						setState(265);
						match(NEWLINE);
						setState(266);
						match(WORD);
						setState(267);
						match(TAB);
						setState(268);
						match(TAB);
						setState(269);
						match(WORD);
						setState(270);
						match(NEWLINE);
						setState(271);
						match(WORD);
						setState(272);
						match(TAB);
						setState(273);
						match(TAB);
						setState(274);
						match(NEWLINE);
						setState(275);
						match(WORD);
						setState(276);
						match(TAB);
						setState(277);
						((KrxBasicInfoEtfContext)_localctx).volumeOfListedShares = match(NUMBER);
						setState(278);
						match(NEWLINE);
						setState(279);
						match(WORD);
						setState(280);
						match(TAB);
						setState(282); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(281);
							word();
							}
							}
							setState(284); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(286);
						match(NEWLINE);
						setState(287);
						match(WORD);
						setState(288);
						match(TAB);
						setState(289);
						match(NUMBER);
						setState(290);
						match(NEWLINE);
						setState(291);
						match(WORD);
						setState(292);
						match(TAB);
						setState(293);
						((KrxBasicInfoEtfContext)_localctx).fee = match(NUMBER);
						setState(294);
						match(NEWLINE);
						setState(295);
						match(WORD);
						setState(296);
						match(TAB);
						setState(297);
						match(WORD);
						setState(298);
						match(NEWLINE);
						setState(299);
						match(WORD);
						setState(300);
						match(TAB);
						setState(301);
						match(NEWLINE);

										ParserService.crawlEtfDetailThread(20231217
											, (((KrxBasicInfoEtfContext)_localctx).code!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).code.start,((KrxBasicInfoEtfContext)_localctx).code.stop):null)
											, (((KrxBasicInfoEtfContext)_localctx).symbol!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol.start,((KrxBasicInfoEtfContext)_localctx).symbol.stop):null), (((KrxBasicInfoEtfContext)_localctx).symbol1!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol1.start,((KrxBasicInfoEtfContext)_localctx).symbol1.stop):null), (((KrxBasicInfoEtfContext)_localctx).symbol2!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol2.start,((KrxBasicInfoEtfContext)_localctx).symbol2.stop):null), (((KrxBasicInfoEtfContext)_localctx).symbol3!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol3.start,((KrxBasicInfoEtfContext)_localctx).symbol3.stop):null), (((KrxBasicInfoEtfContext)_localctx).symbol4!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol4.start,((KrxBasicInfoEtfContext)_localctx).symbol4.stop):null), (((KrxBasicInfoEtfContext)_localctx).symbol5!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol5.start,((KrxBasicInfoEtfContext)_localctx).symbol5.stop):null), (((KrxBasicInfoEtfContext)_localctx).symbol6!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol6.start,((KrxBasicInfoEtfContext)_localctx).symbol6.stop):null), (((KrxBasicInfoEtfContext)_localctx).symbol7!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol7.start,((KrxBasicInfoEtfContext)_localctx).symbol7.stop):null)
											, null, null, null, null, null, null, null, null
											, (((KrxBasicInfoEtfContext)_localctx).ipo!=null?((KrxBasicInfoEtfContext)_localctx).ipo.getText():null)
											, (((KrxBasicInfoEtfContext)_localctx).fee!=null?((KrxBasicInfoEtfContext)_localctx).fee.getText():null)
											, (((KrxBasicInfoEtfContext)_localctx).volumeOfListedShares!=null?((KrxBasicInfoEtfContext)_localctx).volumeOfListedShares.getText():null)
										);
									
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(306); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(308);
				match(WORD);
				setState(309);
				match(TAB);
				setState(310);
				match(WORD);
				setState(311);
				match(TAB);
				setState(312);
				match(DATE);
				setState(313);
				match(NEWLINE);
				}
				}
				setState(317); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(319);
			match(KEYWORD);
			setState(320);
			match(TAB);
			setState(321);
			match(WORD);
			setState(322);
			match(TAB);
			setState(323);
			match(WORD);
			setState(324);
			match(WORD);
			setState(325);
			match(WORD);
			setState(326);
			match(WORD);
			setState(327);
			match(WORD);
			setState(328);
			match(WORD);
			setState(329);
			match(TAB);
			setState(330);
			match(WORD);
			setState(331);
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

	public static class KrxBasicInfoCompanyContext extends ParserRuleContext {
		public WordContext code;
		public WordContext symbol;
		public WordContext symbol1;
		public WordContext symbol2;
		public WordContext symbol3;
		public WordContext symbol4;
		public WordContext symbol5;
		public WordContext symbol6;
		public WordContext symbol7;
		public Token ipo;
		public Token type;
		public Token volumeOfListedShares;
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
		public KrxBasicInfoCompanyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_krxBasicInfoCompany; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterKrxBasicInfoCompany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitKrxBasicInfoCompany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitKrxBasicInfoCompany(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KrxBasicInfoCompanyContext krxBasicInfoCompany() throws RecognitionException {
		KrxBasicInfoCompanyContext _localctx = new KrxBasicInfoCompanyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_krxBasicInfoCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(KEYWORD);
			setState(334);
			match(TAB);
			setState(335);
			match(WORD);
			setState(336);
			match(TAB);
			setState(337);
			match(WORD);
			setState(338);
			match(WORD);
			setState(339);
			match(WORD);
			setState(340);
			match(WORD);
			setState(341);
			match(WORD);
			setState(342);
			match(WORD);
			setState(343);
			match(TAB);
			setState(344);
			match(WORD);
			setState(345);
			match(NEWLINE);
			setState(788); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(346);
					match(KEYWORD);
					setState(347);
					match(TAB);
					setState(348);
					match(NEWLINE);
					setState(349);
					match(KEYWORD);
					setState(350);
					match(TAB);
					setState(351);
					match(NEWLINE);
					setState(352);
					match(KEYWORD);
					setState(353);
					match(TAB);
					setState(354);
					match(NEWLINE);
					setState(355);
					match(KEYWORD);
					setState(356);
					match(TAB);
					setState(357);
					match(NEWLINE);
					setState(358);
					match(KEYWORD);
					setState(359);
					match(TAB);
					setState(360);
					match(TAB);
					setState(361);
					match(TAB);
					setState(362);
					match(TAB);
					setState(363);
					match(TAB);
					setState(364);
					match(NEWLINE);
					setState(365);
					match(KEYWORD);
					setState(366);
					match(TAB);
					setState(367);
					match(TAB);
					setState(368);
					match(TAB);
					setState(369);
					match(NEWLINE);
					setState(370);
					match(KEYWORD);
					setState(371);
					match(TAB);
					setState(372);
					match(TAB);
					setState(373);
					match(TAB);
					setState(374);
					match(TAB);
					setState(375);
					match(TAB);
					setState(376);
					match(NEWLINE);
					setState(377);
					match(KEYWORD);
					setState(378);
					match(TAB);
					setState(379);
					match(TAB);
					setState(380);
					match(TAB);
					setState(381);
					match(TAB);
					setState(382);
					match(TAB);
					setState(383);
					match(NEWLINE);
					setState(384);
					match(KEYWORD);
					setState(385);
					match(TAB);
					setState(386);
					match(TAB);
					setState(387);
					match(TAB);
					setState(388);
					match(TAB);
					setState(389);
					match(NEWLINE);
					setState(390);
					match(KEYWORD);
					setState(391);
					match(TAB);
					setState(392);
					match(NEWLINE);
					setState(393);
					match(KEYWORD);
					setState(394);
					match(TAB);
					setState(395);
					match(TAB);
					setState(396);
					match(TAB);
					setState(397);
					match(TAB);
					setState(398);
					match(TAB);
					setState(399);
					match(NEWLINE);
					setState(400);
					match(KEYWORD);
					setState(401);
					match(TAB);
					setState(402);
					match(TAB);
					setState(403);
					match(TAB);
					setState(404);
					match(TAB);
					setState(405);
					match(NEWLINE);
					setState(406);
					match(KEYWORD);
					setState(407);
					match(TAB);
					setState(408);
					match(TAB);
					setState(409);
					match(TAB);
					setState(410);
					match(NEWLINE);
					setState(411);
					match(KEYWORD);
					setState(412);
					match(TAB);
					setState(413);
					match(TAB);
					setState(414);
					match(TAB);
					setState(415);
					match(NEWLINE);
					setState(416);
					match(KEYWORD);
					setState(417);
					match(TAB);
					setState(418);
					match(TAB);
					setState(419);
					match(TAB);
					setState(420);
					match(TAB);
					setState(421);
					match(TAB);
					setState(422);
					match(NEWLINE);
					setState(423);
					match(KEYWORD);
					setState(424);
					match(TAB);
					setState(425);
					match(TAB);
					setState(426);
					match(TAB);
					setState(427);
					match(TAB);
					setState(428);
					match(TAB);
					setState(429);
					match(NEWLINE);
					setState(430);
					match(KEYWORD);
					setState(431);
					match(TAB);
					setState(432);
					match(TAB);
					setState(433);
					match(NEWLINE);
					setState(434);
					match(KEYWORD);
					setState(435);
					match(TAB);
					setState(436);
					match(NEWLINE);
					setState(437);
					match(KEYWORD);
					setState(438);
					match(TAB);
					setState(439);
					match(TAB);
					setState(440);
					match(TAB);
					setState(441);
					match(TAB);
					setState(442);
					match(TAB);
					setState(443);
					match(NEWLINE);
					setState(444);
					match(KEYWORD);
					setState(445);
					match(TAB);
					setState(446);
					match(TAB);
					setState(447);
					match(TAB);
					setState(448);
					match(NEWLINE);
					setState(449);
					match(KEYWORD);
					setState(450);
					match(TAB);
					setState(451);
					match(TAB);
					setState(452);
					match(TAB);
					setState(453);
					match(TAB);
					setState(454);
					match(TAB);
					setState(455);
					match(NEWLINE);
					setState(456);
					match(KEYWORD);
					setState(457);
					match(TAB);
					setState(458);
					match(TAB);
					setState(459);
					match(TAB);
					setState(460);
					match(TAB);
					setState(461);
					match(TAB);
					setState(462);
					match(NEWLINE);
					setState(463);
					match(KEYWORD);
					setState(464);
					match(TAB);
					setState(465);
					match(TAB);
					setState(466);
					match(TAB);
					setState(467);
					match(TAB);
					setState(468);
					match(NEWLINE);
					setState(469);
					match(KEYWORD);
					setState(470);
					match(TAB);
					setState(471);
					match(NEWLINE);
					setState(472);
					match(KEYWORD);
					setState(473);
					match(TAB);
					setState(474);
					match(TAB);
					setState(475);
					match(TAB);
					setState(476);
					match(TAB);
					setState(477);
					match(TAB);
					setState(478);
					match(NEWLINE);
					setState(479);
					match(KEYWORD);
					setState(480);
					match(TAB);
					setState(481);
					match(TAB);
					setState(482);
					match(TAB);
					setState(483);
					match(NEWLINE);
					setState(484);
					match(KEYWORD);
					setState(485);
					match(TAB);
					setState(486);
					match(TAB);
					setState(487);
					match(TAB);
					setState(488);
					match(TAB);
					setState(489);
					match(TAB);
					setState(490);
					match(NEWLINE);
					setState(491);
					match(KEYWORD);
					setState(492);
					match(TAB);
					setState(493);
					match(TAB);
					setState(494);
					match(TAB);
					setState(495);
					match(TAB);
					setState(496);
					match(TAB);
					setState(497);
					match(NEWLINE);
					setState(498);
					match(KEYWORD);
					setState(499);
					match(TAB);
					setState(500);
					match(TAB);
					setState(501);
					match(TAB);
					setState(502);
					match(TAB);
					setState(503);
					match(NEWLINE);
					setState(504);
					match(KEYWORD);
					setState(505);
					match(TAB);
					setState(506);
					match(NEWLINE);
					setState(507);
					match(KEYWORD);
					setState(508);
					match(TAB);
					setState(509);
					match(TAB);
					setState(510);
					match(TAB);
					setState(511);
					match(TAB);
					setState(512);
					match(TAB);
					setState(513);
					match(NEWLINE);
					setState(514);
					match(KEYWORD);
					setState(515);
					match(TAB);
					setState(516);
					match(TAB);
					setState(517);
					match(TAB);
					setState(518);
					match(NEWLINE);
					setState(519);
					match(KEYWORD);
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
					match(NEWLINE);
					setState(526);
					match(KEYWORD);
					setState(527);
					match(TAB);
					setState(528);
					match(TAB);
					setState(529);
					match(TAB);
					setState(530);
					match(TAB);
					setState(531);
					match(TAB);
					setState(532);
					match(NEWLINE);
					setState(533);
					match(KEYWORD);
					setState(534);
					match(TAB);
					setState(535);
					match(TAB);
					setState(536);
					match(TAB);
					setState(537);
					match(TAB);
					setState(538);
					match(NEWLINE);
					setState(539);
					match(KEYWORD);
					setState(540);
					match(TAB);
					setState(541);
					match(NEWLINE);
					setState(542);
					match(KEYWORD);
					setState(543);
					match(TAB);
					setState(544);
					match(NEWLINE);
					setState(545);
					match(KEYWORD);
					setState(546);
					match(TAB);
					setState(547);
					match(TAB);
					setState(548);
					match(TAB);
					setState(549);
					match(TAB);
					setState(550);
					match(TAB);
					setState(551);
					match(NEWLINE);
					setState(552);
					match(KEYWORD);
					setState(553);
					match(TAB);
					setState(554);
					match(TAB);
					setState(555);
					match(TAB);
					setState(556);
					match(NEWLINE);
					setState(557);
					match(KEYWORD);
					setState(558);
					match(TAB);
					setState(559);
					match(TAB);
					setState(560);
					match(TAB);
					setState(561);
					match(TAB);
					setState(562);
					match(TAB);
					setState(563);
					match(NEWLINE);
					setState(564);
					match(KEYWORD);
					setState(565);
					match(TAB);
					setState(566);
					match(TAB);
					setState(567);
					match(TAB);
					setState(568);
					match(TAB);
					setState(569);
					match(TAB);
					setState(570);
					match(NEWLINE);
					setState(571);
					match(KEYWORD);
					setState(572);
					match(TAB);
					setState(573);
					match(TAB);
					setState(574);
					match(TAB);
					setState(575);
					match(TAB);
					setState(576);
					match(NEWLINE);
					setState(577);
					match(KEYWORD);
					setState(578);
					match(TAB);
					setState(579);
					match(NEWLINE);
					setState(580);
					match(KEYWORD);
					setState(581);
					match(TAB);
					setState(582);
					match(TAB);
					setState(583);
					match(TAB);
					setState(584);
					match(TAB);
					setState(585);
					match(TAB);
					setState(586);
					match(NEWLINE);
					setState(587);
					match(KEYWORD);
					setState(588);
					match(TAB);
					setState(589);
					match(TAB);
					setState(590);
					match(TAB);
					setState(591);
					match(NEWLINE);
					setState(592);
					match(KEYWORD);
					setState(593);
					match(TAB);
					setState(594);
					match(TAB);
					setState(595);
					match(TAB);
					setState(596);
					match(TAB);
					setState(597);
					match(TAB);
					setState(598);
					match(NEWLINE);
					setState(599);
					match(KEYWORD);
					setState(600);
					match(TAB);
					setState(601);
					match(TAB);
					setState(602);
					match(TAB);
					setState(603);
					match(TAB);
					setState(604);
					match(TAB);
					setState(605);
					match(NEWLINE);
					setState(606);
					match(KEYWORD);
					setState(607);
					match(TAB);
					setState(608);
					match(TAB);
					setState(609);
					match(TAB);
					setState(610);
					match(TAB);
					setState(611);
					match(NEWLINE);
					setState(612);
					match(KEYWORD);
					setState(613);
					match(TAB);
					setState(614);
					match(NEWLINE);
					setState(615);
					match(KEYWORD);
					setState(616);
					match(TAB);
					setState(617);
					match(TAB);
					setState(618);
					match(TAB);
					setState(619);
					match(TAB);
					setState(620);
					match(TAB);
					setState(621);
					match(NEWLINE);
					setState(622);
					match(KEYWORD);
					setState(623);
					match(TAB);
					setState(624);
					match(TAB);
					setState(625);
					match(TAB);
					setState(626);
					match(NEWLINE);
					setState(627);
					match(KEYWORD);
					setState(628);
					match(TAB);
					setState(629);
					match(TAB);
					setState(630);
					match(TAB);
					setState(631);
					match(TAB);
					setState(632);
					match(TAB);
					setState(633);
					match(NEWLINE);
					setState(634);
					match(KEYWORD);
					setState(635);
					match(TAB);
					setState(636);
					match(TAB);
					setState(637);
					match(TAB);
					setState(638);
					match(TAB);
					setState(639);
					match(TAB);
					setState(640);
					match(NEWLINE);
					setState(641);
					match(KEYWORD);
					setState(642);
					match(TAB);
					setState(643);
					match(TAB);
					setState(644);
					match(TAB);
					setState(645);
					match(TAB);
					setState(646);
					match(NEWLINE);
					setState(647);
					match(KEYWORD);
					setState(648);
					match(TAB);
					setState(649);
					match(WORD);
					setState(650);
					match(NEWLINE);
					setState(651);
					match(KEYWORD);
					setState(652);
					match(TAB);
					setState(653);
					match(NEWLINE);
					setState(777); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						{
						setState(654);
						match(KEYWORD);
						setState(655);
						match(TAB);
						setState(656);
						match(WORD);
						setState(657);
						match(NEWLINE);
						setState(658);
						match(KEYWORD);
						setState(659);
						match(TAB);
						setState(660);
						((KrxBasicInfoCompanyContext)_localctx).code = word();
						setState(661);
						match(NEWLINE);
						setState(662);
						match(KEYWORD);
						setState(663);
						match(TAB);
						setState(664);
						match(NEWLINE);
						setState(665);
						match(KEYWORD);
						setState(666);
						match(TAB);
						setState(667);
						match(TAB);
						setState(668);
						match(NEWLINE);
						setState(669);
						match(KEYWORD);
						setState(670);
						match(TAB);
						setState(671);
						match(TAB);
						setState(672);
						match(TAB);
						setState(674); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(673);
							word();
							}
							}
							setState(676); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(678);
						match(NEWLINE);
						setState(679);
						match(KEYWORD);
						setState(680);
						match(TAB);
						setState(681);
						match(TAB);
						setState(682);
						match(TAB);
						setState(683);
						((KrxBasicInfoCompanyContext)_localctx).symbol = word();
						setState(685);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
						case 1:
							{
							setState(684);
							((KrxBasicInfoCompanyContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(688);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
						case 1:
							{
							setState(687);
							((KrxBasicInfoCompanyContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(691);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
						case 1:
							{
							setState(690);
							((KrxBasicInfoCompanyContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(694);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
						case 1:
							{
							setState(693);
							((KrxBasicInfoCompanyContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(697);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
						case 1:
							{
							setState(696);
							((KrxBasicInfoCompanyContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(700);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
							{
							setState(699);
							((KrxBasicInfoCompanyContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(705);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(702);
							((KrxBasicInfoCompanyContext)_localctx).symbol7 = word();
							}
							}
							setState(707);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(708);
						match(NEWLINE);
						setState(709);
						match(KEYWORD);
						setState(710);
						match(TAB);
						setState(711);
						match(TAB);
						setState(712);
						match(TAB);
						setState(714); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(713);
							word();
							}
							}
							setState(716); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(718);
						match(NEWLINE);
						setState(719);
						match(KEYWORD);
						setState(720);
						match(TAB);
						setState(721);
						match(TAB);
						setState(722);
						match(TAB);
						setState(723);
						match(NEWLINE);
						setState(724);
						match(KEYWORD);
						setState(725);
						match(TAB);
						setState(726);
						match(TAB);
						setState(727);
						match(TAB);
						setState(728);
						match(NEWLINE);
						setState(729);
						match(KEYWORD);
						setState(730);
						match(TAB);
						setState(731);
						match(TAB);
						setState(732);
						match(NEWLINE);
						setState(733);
						match(KEYWORD);
						setState(734);
						match(TAB);
						setState(735);
						((KrxBasicInfoCompanyContext)_localctx).ipo = match(DATE);
						setState(736);
						match(NEWLINE);
						setState(737);
						match(KEYWORD);
						setState(738);
						match(TAB);
						setState(739);
						((KrxBasicInfoCompanyContext)_localctx).type = match(WORD);
						setState(743);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(740);
							word();
							}
							}
							setState(745);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(746);
						match(NEWLINE);
						setState(747);
						match(KEYWORD);
						setState(748);
						match(TAB);
						setState(749);
						match(WORD);
						setState(750);
						match(NEWLINE);
						setState(751);
						match(KEYWORD);
						setState(752);
						match(TAB);
						setState(756);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(753);
							word();
							}
							}
							setState(758);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(759);
						match(NEWLINE);
						setState(760);
						match(KEYWORD);
						setState(761);
						match(TAB);
						setState(762);
						match(WORD);
						setState(763);
						match(NEWLINE);
						setState(764);
						match(KEYWORD);
						setState(765);
						match(TAB);
						setState(766);
						word();
						setState(767);
						match(NEWLINE);
						setState(768);
						match(KEYWORD);
						setState(769);
						match(TAB);
						setState(770);
						((KrxBasicInfoCompanyContext)_localctx).volumeOfListedShares = match(NUMBER);
						setState(771);
						match(NEWLINE);
						setState(772);
						match(KEYWORD);
						setState(773);
						match(TAB);
						setState(774);
						match(NEWLINE);

										ParserService.crawlItemDetailCompanyThread(20231217
											, (((KrxBasicInfoCompanyContext)_localctx).code!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).code.start,((KrxBasicInfoCompanyContext)_localctx).code.stop):null), (((KrxBasicInfoCompanyContext)_localctx).type!=null?((KrxBasicInfoCompanyContext)_localctx).type.getText():null)
											, (((KrxBasicInfoCompanyContext)_localctx).symbol!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol.start,((KrxBasicInfoCompanyContext)_localctx).symbol.stop):null), (((KrxBasicInfoCompanyContext)_localctx).symbol1!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol1.start,((KrxBasicInfoCompanyContext)_localctx).symbol1.stop):null), (((KrxBasicInfoCompanyContext)_localctx).symbol2!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol2.start,((KrxBasicInfoCompanyContext)_localctx).symbol2.stop):null), (((KrxBasicInfoCompanyContext)_localctx).symbol3!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol3.start,((KrxBasicInfoCompanyContext)_localctx).symbol3.stop):null), (((KrxBasicInfoCompanyContext)_localctx).symbol4!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol4.start,((KrxBasicInfoCompanyContext)_localctx).symbol4.stop):null), (((KrxBasicInfoCompanyContext)_localctx).symbol5!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol5.start,((KrxBasicInfoCompanyContext)_localctx).symbol5.stop):null), (((KrxBasicInfoCompanyContext)_localctx).symbol6!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol6.start,((KrxBasicInfoCompanyContext)_localctx).symbol6.stop):null), (((KrxBasicInfoCompanyContext)_localctx).symbol7!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol7.start,((KrxBasicInfoCompanyContext)_localctx).symbol7.stop):null)
											, null
											, null
											, (((KrxBasicInfoCompanyContext)_localctx).volumeOfListedShares!=null?((KrxBasicInfoCompanyContext)_localctx).volumeOfListedShares.getText():null)
											, (((KrxBasicInfoCompanyContext)_localctx).ipo!=null?((KrxBasicInfoCompanyContext)_localctx).ipo.getText():null)
										);
									
						}
						}
						}
						setState(779); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==KEYWORD );
					setState(781);
					match(WORD);
					setState(782);
					match(TAB);
					setState(783);
					match(WORD);
					setState(784);
					match(TAB);
					setState(785);
					match(DATE);
					setState(786);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(790); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(792);
			match(KEYWORD);
			setState(793);
			match(TAB);
			setState(794);
			match(WORD);
			setState(795);
			match(TAB);
			setState(796);
			match(WORD);
			setState(797);
			match(WORD);
			setState(798);
			match(WORD);
			setState(799);
			match(WORD);
			setState(800);
			match(WORD);
			setState(801);
			match(WORD);
			setState(802);
			match(TAB);
			setState(803);
			match(WORD);
			setState(804);
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

	public static class EtfAllPriceContext extends ParserRuleContext {
		public Token code;
		public WordContext symbol;
		public WordContext symbol1;
		public WordContext symbol2;
		public WordContext symbol3;
		public WordContext symbol4;
		public WordContext symbol5;
		public WordContext symbol6;
		public WordContext symbol7;
		public Token closing;
		public Token market;
		public Token high;
		public Token low;
		public Token volume;
		public Token volumeOfListedShares;
		public Token base;
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
		public EtfAllPriceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etfAllPrice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterEtfAllPrice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitEtfAllPrice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitEtfAllPrice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EtfAllPriceContext etfAllPrice() throws RecognitionException {
		EtfAllPriceContext _localctx = new EtfAllPriceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_etfAllPrice);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(KEYWORD);
			setState(807);
			match(TAB);
			setState(808);
			match(WORD);
			setState(809);
			match(TAB);
			setState(810);
			match(WORD);
			setState(811);
			match(WORD);
			setState(812);
			match(WORD);
			setState(813);
			match(WORD);
			setState(814);
			match(TAB);
			setState(815);
			match(WORD);
			setState(816);
			match(NEWLINE);
			setState(1063); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(817);
				match(WORD);
				setState(818);
				match(TAB);
				setState(819);
				match(DATE);
				setState(820);
				match(TAB);
				setState(821);
				match(NEWLINE);
				setState(822);
				match(WORD);
				setState(823);
				match(TAB);
				setState(824);
				match(DATE);
				setState(825);
				match(TAB);
				setState(826);
				match(NEWLINE);
				setState(827);
				match(WORD);
				setState(828);
				match(TAB);
				setState(829);
				match(DATE);
				setState(830);
				match(TAB);
				setState(831);
				match(NEWLINE);
				setState(832);
				match(WORD);
				setState(833);
				match(TAB);
				setState(834);
				match(DATE);
				setState(835);
				match(TAB);
				setState(836);
				match(NEWLINE);
				setState(837);
				match(WORD);
				setState(838);
				match(TAB);
				setState(839);
				match(DATE);
				setState(840);
				match(TAB);
				setState(841);
				match(NEWLINE);
				setState(842);
				match(WORD);
				setState(843);
				match(TAB);
				setState(844);
				match(DATE);
				setState(845);
				match(TAB);
				setState(846);
				match(NEWLINE);
				setState(847);
				match(WORD);
				setState(848);
				match(TAB);
				setState(849);
				match(DATE);
				setState(850);
				match(TAB);
				setState(851);
				match(NEWLINE);
				setState(852);
				match(WORD);
				setState(853);
				match(TAB);
				setState(854);
				match(DATE);
				setState(855);
				match(TAB);
				setState(856);
				match(WORD);
				setState(857);
				match(NEWLINE);
				setState(858);
				match(WORD);
				setState(859);
				match(TAB);
				setState(860);
				match(DATE);
				setState(861);
				match(TAB);
				setState(862);
				match(NEWLINE);
				setState(1052); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(1052);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
						case 1:
							{
							{
							setState(863);
							match(WORD);
							setState(864);
							match(TAB);
							setState(865);
							match(DATE);
							setState(866);
							match(TAB);
							setState(867);
							((EtfAllPriceContext)_localctx).code = match(NUMBER);
							setState(868);
							match(NEWLINE);
							setState(869);
							match(WORD);
							setState(870);
							match(TAB);
							setState(871);
							match(DATE);
							setState(872);
							match(TAB);
							setState(873);
							((EtfAllPriceContext)_localctx).symbol = word();
							setState(875);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
							case 1:
								{
								setState(874);
								((EtfAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(878);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
							case 1:
								{
								setState(877);
								((EtfAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(881);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
							case 1:
								{
								setState(880);
								((EtfAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(884);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
							case 1:
								{
								setState(883);
								((EtfAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(887);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
							case 1:
								{
								setState(886);
								((EtfAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(890);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
							case 1:
								{
								setState(889);
								((EtfAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(895);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(892);
								((EtfAllPriceContext)_localctx).symbol7 = word();
								}
								}
								setState(897);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(898);
							match(NEWLINE);
							setState(899);
							match(WORD);
							setState(900);
							match(TAB);
							setState(901);
							match(DATE);
							setState(902);
							match(TAB);
							setState(903);
							((EtfAllPriceContext)_localctx).closing = match(NUMBER);
							setState(904);
							match(NEWLINE);
							setState(905);
							match(WORD);
							setState(906);
							match(TAB);
							setState(907);
							match(DATE);
							setState(908);
							match(TAB);
							setState(909);
							match(NUMBER);
							setState(910);
							match(NEWLINE);
							setState(911);
							match(WORD);
							setState(912);
							match(TAB);
							setState(913);
							match(DATE);
							setState(914);
							match(TAB);
							setState(915);
							match(NUMBER);
							setState(916);
							match(NEWLINE);
							setState(917);
							match(WORD);
							setState(918);
							match(TAB);
							setState(919);
							match(DATE);
							setState(920);
							match(TAB);
							setState(921);
							match(NUMBER);
							setState(922);
							match(NEWLINE);
							setState(923);
							match(WORD);
							setState(924);
							match(TAB);
							setState(925);
							match(DATE);
							setState(926);
							match(TAB);
							setState(927);
							((EtfAllPriceContext)_localctx).market = match(NUMBER);
							setState(928);
							match(NEWLINE);
							setState(929);
							match(WORD);
							setState(930);
							match(TAB);
							setState(931);
							match(DATE);
							setState(932);
							match(TAB);
							setState(933);
							((EtfAllPriceContext)_localctx).high = match(NUMBER);
							setState(934);
							match(NEWLINE);
							setState(935);
							match(WORD);
							setState(936);
							match(TAB);
							setState(937);
							match(DATE);
							setState(938);
							match(TAB);
							setState(939);
							((EtfAllPriceContext)_localctx).low = match(NUMBER);
							setState(940);
							match(NEWLINE);
							setState(941);
							match(WORD);
							setState(942);
							match(TAB);
							setState(943);
							match(DATE);
							setState(944);
							match(TAB);
							setState(945);
							((EtfAllPriceContext)_localctx).volume = match(NUMBER);
							setState(946);
							match(NEWLINE);
							setState(947);
							match(WORD);
							setState(948);
							match(TAB);
							setState(949);
							match(DATE);
							setState(950);
							match(TAB);
							setState(951);
							match(NUMBER);
							setState(952);
							match(NEWLINE);
							setState(953);
							match(WORD);
							setState(954);
							match(TAB);
							setState(955);
							match(DATE);
							setState(956);
							match(TAB);
							setState(957);
							match(NUMBER);
							setState(958);
							match(NEWLINE);
							setState(959);
							match(WORD);
							setState(960);
							match(TAB);
							setState(961);
							match(DATE);
							setState(962);
							match(TAB);
							setState(963);
							match(NUMBER);
							setState(964);
							match(NEWLINE);
							setState(965);
							match(WORD);
							setState(966);
							match(TAB);
							setState(967);
							match(DATE);
							setState(968);
							match(TAB);
							setState(969);
							((EtfAllPriceContext)_localctx).volumeOfListedShares = match(NUMBER);
							setState(970);
							match(NEWLINE);
							setState(971);
							match(WORD);
							setState(972);
							match(TAB);
							setState(973);
							match(DATE);
							setState(974);
							match(TAB);
							setState(976); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(975);
								word();
								}
								}
								setState(978); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
							setState(980);
							match(NEWLINE);
							setState(981);
							match(WORD);
							setState(982);
							match(TAB);
							setState(983);
							match(DATE);
							setState(984);
							match(TAB);
							setState(985);
							word();
							setState(986);
							match(NEWLINE);
							setState(987);
							match(WORD);
							setState(988);
							match(TAB);
							setState(989);
							match(DATE);
							setState(990);
							match(TAB);
							setState(991);
							word();
							setState(992);
							match(NEWLINE);
							setState(993);
							match(WORD);
							setState(994);
							match(TAB);
							setState(995);
							match(DATE);
							setState(996);
							match(TAB);
							setState(997);
							word();
							setState(998);
							match(NEWLINE);
							setState(999);
							match(WORD);
							setState(1000);
							match(TAB);
							setState(1001);
							((EtfAllPriceContext)_localctx).base = match(DATE);
							setState(1002);
							match(TAB);
							setState(1003);
							match(NEWLINE);

											ParserService.crawlPriceCompanyEtf(20240105
												, (((EtfAllPriceContext)_localctx).code!=null?((EtfAllPriceContext)_localctx).code.getText():null), (((EtfAllPriceContext)_localctx).symbol!=null?_input.getText(((EtfAllPriceContext)_localctx).symbol.start,((EtfAllPriceContext)_localctx).symbol.stop):null)
												, (((EtfAllPriceContext)_localctx).base!=null?((EtfAllPriceContext)_localctx).base.getText():null), (((EtfAllPriceContext)_localctx).closing!=null?((EtfAllPriceContext)_localctx).closing.getText():null), (((EtfAllPriceContext)_localctx).market!=null?((EtfAllPriceContext)_localctx).market.getText():null), (((EtfAllPriceContext)_localctx).high!=null?((EtfAllPriceContext)_localctx).high.getText():null), (((EtfAllPriceContext)_localctx).low!=null?((EtfAllPriceContext)_localctx).low.getText():null), (((EtfAllPriceContext)_localctx).volume!=null?((EtfAllPriceContext)_localctx).volume.getText():null)
											);
											ParserService.crawlEtfDetailThread(20240105, (((EtfAllPriceContext)_localctx).code!=null?((EtfAllPriceContext)_localctx).code.getText():null)
												, (((EtfAllPriceContext)_localctx).symbol!=null?_input.getText(((EtfAllPriceContext)_localctx).symbol.start,((EtfAllPriceContext)_localctx).symbol.stop):null), (((EtfAllPriceContext)_localctx).symbol1!=null?_input.getText(((EtfAllPriceContext)_localctx).symbol1.start,((EtfAllPriceContext)_localctx).symbol1.stop):null), (((EtfAllPriceContext)_localctx).symbol2!=null?_input.getText(((EtfAllPriceContext)_localctx).symbol2.start,((EtfAllPriceContext)_localctx).symbol2.stop):null), (((EtfAllPriceContext)_localctx).symbol3!=null?_input.getText(((EtfAllPriceContext)_localctx).symbol3.start,((EtfAllPriceContext)_localctx).symbol3.stop):null), (((EtfAllPriceContext)_localctx).symbol4!=null?_input.getText(((EtfAllPriceContext)_localctx).symbol4.start,((EtfAllPriceContext)_localctx).symbol4.stop):null), (((EtfAllPriceContext)_localctx).symbol5!=null?_input.getText(((EtfAllPriceContext)_localctx).symbol5.start,((EtfAllPriceContext)_localctx).symbol5.stop):null), (((EtfAllPriceContext)_localctx).symbol6!=null?_input.getText(((EtfAllPriceContext)_localctx).symbol6.start,((EtfAllPriceContext)_localctx).symbol6.stop):null), (((EtfAllPriceContext)_localctx).symbol7!=null?_input.getText(((EtfAllPriceContext)_localctx).symbol7.start,((EtfAllPriceContext)_localctx).symbol7.stop):null)
												, null, null, null, null, null, null, null, null
												, null
												, null
												, (((EtfAllPriceContext)_localctx).volumeOfListedShares!=null?((EtfAllPriceContext)_localctx).volumeOfListedShares.getText():null)
											);
										
							}
							}
							break;
						case 2:
							{
							{
							setState(1006);
							match(WORD);
							setState(1007);
							match(TAB);
							setState(1008);
							match(DATE);
							setState(1009);
							match(TAB);
							setState(1010);
							match(NUMBER);
							setState(1011);
							((EtfAllPriceContext)_localctx).symbol = word();
							setState(1013);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
							case 1:
								{
								setState(1012);
								((EtfAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(1016);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
							case 1:
								{
								setState(1015);
								((EtfAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(1019);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
							case 1:
								{
								setState(1018);
								((EtfAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(1022);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
							case 1:
								{
								setState(1021);
								((EtfAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(1025);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
							case 1:
								{
								setState(1024);
								((EtfAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(1028);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
							case 1:
								{
								setState(1027);
								((EtfAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(1033);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1030);
									((EtfAllPriceContext)_localctx).symbol7 = word();
									}
									} 
								}
								setState(1035);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
							}
							setState(1036);
							((EtfAllPriceContext)_localctx).closing = match(NUMBER);
							setState(1037);
							match(NEWLINE);
							setState(1038);
							match(WORD);
							setState(1039);
							match(TAB);
							setState(1040);
							((EtfAllPriceContext)_localctx).base = match(DATE);
							setState(1041);
							match(TAB);
							setState(1042);
							match(NUMBER);
							setState(1043);
							match(NUMBER);
							setState(1044);
							match(NUMBER);
							setState(1045);
							match(NUMBER);
							setState(1046);
							match(NUMBER);
							setState(1047);
							match(NUMBER);
							setState(1048);
							match(NUMBER);
							setState(1049);
							match(NEWLINE);

											ParserService.crawlPriceCompanyEtf(20240105
												, (((EtfAllPriceContext)_localctx).code!=null?((EtfAllPriceContext)_localctx).code.getText():null), (((EtfAllPriceContext)_localctx).symbol!=null?_input.getText(((EtfAllPriceContext)_localctx).symbol.start,((EtfAllPriceContext)_localctx).symbol.stop):null)
												, (((EtfAllPriceContext)_localctx).base!=null?((EtfAllPriceContext)_localctx).base.getText():null), (((EtfAllPriceContext)_localctx).closing!=null?((EtfAllPriceContext)_localctx).closing.getText():null), (((EtfAllPriceContext)_localctx).market!=null?((EtfAllPriceContext)_localctx).market.getText():null), (((EtfAllPriceContext)_localctx).high!=null?((EtfAllPriceContext)_localctx).high.getText():null), (((EtfAllPriceContext)_localctx).low!=null?((EtfAllPriceContext)_localctx).low.getText():null), (((EtfAllPriceContext)_localctx).volume!=null?((EtfAllPriceContext)_localctx).volume.getText():null)
											);
										
							}
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1054); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1056);
				match(WORD);
				setState(1057);
				match(TAB);
				setState(1058);
				match(WORD);
				setState(1059);
				match(TAB);
				setState(1060);
				match(DATE);
				setState(1061);
				match(NEWLINE);
				}
				}
				setState(1065); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1067);
			match(KEYWORD);
			setState(1068);
			match(TAB);
			setState(1069);
			match(WORD);
			setState(1070);
			match(TAB);
			setState(1071);
			match(WORD);
			setState(1072);
			match(WORD);
			setState(1073);
			match(WORD);
			setState(1074);
			match(WORD);
			setState(1075);
			match(TAB);
			setState(1076);
			match(WORD);
			setState(1077);
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

	public static class CompanyAllPriceContext extends ParserRuleContext {
		public WordContext code;
		public WordContext symbol;
		public WordContext symbol1;
		public WordContext symbol2;
		public WordContext symbol3;
		public WordContext symbol4;
		public WordContext symbol5;
		public WordContext symbol6;
		public WordContext symbol7;
		public WordContext type;
		public Token closing;
		public Token market;
		public Token high;
		public Token low;
		public Token volume;
		public Token volumeOfListedShares;
		public Token base;
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
		public CompanyAllPriceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_companyAllPrice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterCompanyAllPrice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitCompanyAllPrice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitCompanyAllPrice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompanyAllPriceContext companyAllPrice() throws RecognitionException {
		CompanyAllPriceContext _localctx = new CompanyAllPriceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_companyAllPrice);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			match(KEYWORD);
			setState(1080);
			match(TAB);
			setState(1081);
			match(WORD);
			setState(1082);
			match(TAB);
			setState(1083);
			match(WORD);
			setState(1084);
			match(WORD);
			setState(1085);
			match(WORD);
			setState(1086);
			match(WORD);
			setState(1087);
			match(WORD);
			setState(1088);
			match(WORD);
			setState(1089);
			match(TAB);
			setState(1090);
			match(WORD);
			setState(1091);
			match(NEWLINE);
			setState(1574); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1092);
				match(WORD);
				setState(1093);
				match(TAB);
				setState(1094);
				match(DATE);
				setState(1095);
				match(TAB);
				setState(1096);
				match(NEWLINE);
				setState(1097);
				match(WORD);
				setState(1098);
				match(TAB);
				setState(1099);
				match(DATE);
				setState(1100);
				match(TAB);
				setState(1101);
				match(NEWLINE);
				setState(1102);
				match(WORD);
				setState(1103);
				match(TAB);
				setState(1104);
				match(DATE);
				setState(1105);
				match(TAB);
				setState(1106);
				match(NEWLINE);
				setState(1107);
				match(WORD);
				setState(1108);
				match(TAB);
				setState(1109);
				match(DATE);
				setState(1110);
				match(TAB);
				setState(1111);
				match(TAB);
				setState(1112);
				match(TAB);
				setState(1113);
				match(TAB);
				setState(1114);
				match(TAB);
				setState(1115);
				match(NEWLINE);
				setState(1116);
				match(WORD);
				setState(1117);
				match(TAB);
				setState(1118);
				match(DATE);
				setState(1119);
				match(TAB);
				setState(1120);
				match(TAB);
				setState(1121);
				match(TAB);
				setState(1122);
				match(NEWLINE);
				setState(1123);
				match(WORD);
				setState(1124);
				match(TAB);
				setState(1125);
				match(DATE);
				setState(1126);
				match(TAB);
				setState(1127);
				match(TAB);
				setState(1128);
				match(TAB);
				setState(1129);
				match(TAB);
				setState(1130);
				match(TAB);
				setState(1131);
				match(NEWLINE);
				setState(1132);
				match(WORD);
				setState(1133);
				match(TAB);
				setState(1134);
				match(DATE);
				setState(1135);
				match(TAB);
				setState(1136);
				match(TAB);
				setState(1137);
				match(TAB);
				setState(1138);
				match(TAB);
				setState(1139);
				match(TAB);
				setState(1140);
				match(NEWLINE);
				setState(1141);
				match(WORD);
				setState(1142);
				match(TAB);
				setState(1143);
				match(DATE);
				setState(1144);
				match(TAB);
				setState(1145);
				match(TAB);
				setState(1146);
				match(TAB);
				setState(1147);
				match(TAB);
				setState(1148);
				match(NEWLINE);
				setState(1149);
				match(WORD);
				setState(1150);
				match(TAB);
				setState(1151);
				match(DATE);
				setState(1152);
				match(TAB);
				setState(1153);
				match(NEWLINE);
				setState(1154);
				match(WORD);
				setState(1155);
				match(TAB);
				setState(1156);
				match(DATE);
				setState(1157);
				match(TAB);
				setState(1158);
				match(NEWLINE);
				setState(1159);
				match(WORD);
				setState(1160);
				match(TAB);
				setState(1161);
				match(DATE);
				setState(1162);
				match(TAB);
				setState(1163);
				match(TAB);
				setState(1164);
				match(TAB);
				setState(1165);
				match(TAB);
				setState(1166);
				match(TAB);
				setState(1167);
				match(NEWLINE);
				setState(1168);
				match(WORD);
				setState(1169);
				match(TAB);
				setState(1170);
				match(DATE);
				setState(1171);
				match(TAB);
				setState(1172);
				match(TAB);
				setState(1173);
				match(TAB);
				setState(1174);
				match(NEWLINE);
				setState(1175);
				match(WORD);
				setState(1176);
				match(TAB);
				setState(1177);
				match(DATE);
				setState(1178);
				match(TAB);
				setState(1179);
				match(TAB);
				setState(1180);
				match(TAB);
				setState(1181);
				match(TAB);
				setState(1182);
				match(TAB);
				setState(1183);
				match(NEWLINE);
				setState(1184);
				match(WORD);
				setState(1185);
				match(TAB);
				setState(1186);
				match(DATE);
				setState(1187);
				match(TAB);
				setState(1188);
				match(TAB);
				setState(1189);
				match(TAB);
				setState(1190);
				match(TAB);
				setState(1191);
				match(TAB);
				setState(1192);
				match(NEWLINE);
				setState(1193);
				match(WORD);
				setState(1194);
				match(TAB);
				setState(1195);
				match(DATE);
				setState(1196);
				match(TAB);
				setState(1197);
				match(TAB);
				setState(1198);
				match(TAB);
				setState(1199);
				match(TAB);
				setState(1200);
				match(NEWLINE);
				setState(1201);
				match(WORD);
				setState(1202);
				match(TAB);
				setState(1203);
				match(DATE);
				setState(1204);
				match(TAB);
				setState(1205);
				match(NEWLINE);
				setState(1206);
				match(WORD);
				setState(1207);
				match(TAB);
				setState(1208);
				match(DATE);
				setState(1209);
				match(TAB);
				setState(1210);
				match(NEWLINE);
				setState(1211);
				match(WORD);
				setState(1212);
				match(TAB);
				setState(1213);
				match(DATE);
				setState(1214);
				match(TAB);
				setState(1215);
				match(NEWLINE);
				setState(1216);
				match(WORD);
				setState(1217);
				match(TAB);
				setState(1218);
				match(DATE);
				setState(1219);
				match(TAB);
				setState(1220);
				match(NEWLINE);
				setState(1221);
				match(WORD);
				setState(1222);
				match(TAB);
				setState(1223);
				match(DATE);
				setState(1224);
				match(TAB);
				setState(1225);
				match(TAB);
				setState(1226);
				match(TAB);
				setState(1227);
				match(TAB);
				setState(1228);
				match(TAB);
				setState(1229);
				match(NEWLINE);
				setState(1230);
				match(WORD);
				setState(1231);
				match(TAB);
				setState(1232);
				match(DATE);
				setState(1233);
				match(TAB);
				setState(1234);
				match(TAB);
				setState(1235);
				match(TAB);
				setState(1236);
				match(TAB);
				setState(1237);
				match(NEWLINE);
				setState(1238);
				match(WORD);
				setState(1239);
				match(TAB);
				setState(1240);
				match(DATE);
				setState(1241);
				match(TAB);
				setState(1242);
				match(TAB);
				setState(1243);
				match(TAB);
				setState(1244);
				match(TAB);
				setState(1245);
				match(TAB);
				setState(1246);
				match(NEWLINE);
				setState(1247);
				match(WORD);
				setState(1248);
				match(TAB);
				setState(1249);
				match(DATE);
				setState(1250);
				match(TAB);
				setState(1251);
				match(TAB);
				setState(1252);
				match(TAB);
				setState(1253);
				match(TAB);
				setState(1254);
				match(TAB);
				setState(1255);
				match(NEWLINE);
				setState(1256);
				match(WORD);
				setState(1257);
				match(TAB);
				setState(1258);
				match(DATE);
				setState(1259);
				match(TAB);
				setState(1260);
				match(TAB);
				setState(1261);
				match(TAB);
				setState(1262);
				match(TAB);
				setState(1263);
				match(NEWLINE);
				setState(1264);
				match(WORD);
				setState(1265);
				match(TAB);
				setState(1266);
				match(DATE);
				setState(1267);
				match(TAB);
				setState(1268);
				match(NEWLINE);
				setState(1269);
				match(WORD);
				setState(1270);
				match(TAB);
				setState(1271);
				match(DATE);
				setState(1272);
				match(TAB);
				setState(1273);
				match(NEWLINE);
				setState(1274);
				match(WORD);
				setState(1275);
				match(TAB);
				setState(1276);
				match(DATE);
				setState(1277);
				match(TAB);
				setState(1278);
				match(NEWLINE);
				setState(1279);
				match(WORD);
				setState(1280);
				match(TAB);
				setState(1281);
				match(DATE);
				setState(1282);
				match(TAB);
				setState(1283);
				match(NEWLINE);
				setState(1284);
				match(WORD);
				setState(1285);
				match(TAB);
				setState(1286);
				match(DATE);
				setState(1287);
				match(TAB);
				setState(1288);
				match(TAB);
				setState(1289);
				match(TAB);
				setState(1290);
				match(TAB);
				setState(1291);
				match(TAB);
				setState(1292);
				match(NEWLINE);
				setState(1293);
				match(WORD);
				setState(1294);
				match(TAB);
				setState(1295);
				match(DATE);
				setState(1296);
				match(TAB);
				setState(1297);
				match(TAB);
				setState(1298);
				match(TAB);
				setState(1299);
				match(NEWLINE);
				setState(1300);
				match(WORD);
				setState(1301);
				match(TAB);
				setState(1302);
				match(DATE);
				setState(1303);
				match(TAB);
				setState(1304);
				match(TAB);
				setState(1305);
				match(TAB);
				setState(1306);
				match(TAB);
				setState(1307);
				match(TAB);
				setState(1308);
				match(NEWLINE);
				setState(1309);
				match(WORD);
				setState(1310);
				match(TAB);
				setState(1311);
				match(DATE);
				setState(1312);
				match(TAB);
				setState(1313);
				match(TAB);
				setState(1314);
				match(TAB);
				setState(1315);
				match(TAB);
				setState(1316);
				match(TAB);
				setState(1317);
				match(NEWLINE);
				setState(1318);
				match(WORD);
				setState(1319);
				match(TAB);
				setState(1320);
				match(DATE);
				setState(1321);
				match(TAB);
				setState(1322);
				match(TAB);
				setState(1323);
				match(TAB);
				setState(1324);
				match(TAB);
				setState(1325);
				match(NEWLINE);
				setState(1326);
				match(WORD);
				setState(1327);
				match(TAB);
				setState(1328);
				match(DATE);
				setState(1329);
				match(TAB);
				setState(1330);
				match(NEWLINE);
				setState(1331);
				match(WORD);
				setState(1332);
				match(TAB);
				setState(1333);
				match(DATE);
				setState(1334);
				match(TAB);
				setState(1335);
				match(NEWLINE);
				setState(1336);
				match(WORD);
				setState(1337);
				match(TAB);
				setState(1338);
				match(DATE);
				setState(1339);
				match(TAB);
				setState(1340);
				match(NEWLINE);
				setState(1341);
				match(WORD);
				setState(1342);
				match(TAB);
				setState(1343);
				match(DATE);
				setState(1344);
				match(TAB);
				setState(1345);
				match(TAB);
				setState(1346);
				match(TAB);
				setState(1347);
				match(TAB);
				setState(1348);
				match(TAB);
				setState(1349);
				match(NEWLINE);
				setState(1350);
				match(WORD);
				setState(1351);
				match(TAB);
				setState(1352);
				match(DATE);
				setState(1353);
				match(TAB);
				setState(1354);
				match(TAB);
				setState(1355);
				match(TAB);
				setState(1356);
				match(NEWLINE);
				setState(1357);
				match(WORD);
				setState(1358);
				match(TAB);
				setState(1359);
				match(DATE);
				setState(1360);
				match(TAB);
				setState(1361);
				match(TAB);
				setState(1362);
				match(TAB);
				setState(1363);
				match(TAB);
				setState(1364);
				match(TAB);
				setState(1365);
				match(NEWLINE);
				setState(1366);
				match(WORD);
				setState(1367);
				match(TAB);
				setState(1368);
				match(DATE);
				setState(1369);
				match(TAB);
				setState(1370);
				match(TAB);
				setState(1371);
				match(TAB);
				setState(1372);
				match(TAB);
				setState(1373);
				match(TAB);
				setState(1374);
				match(NEWLINE);
				setState(1375);
				match(WORD);
				setState(1376);
				match(TAB);
				setState(1377);
				match(DATE);
				setState(1378);
				match(TAB);
				setState(1379);
				match(TAB);
				setState(1380);
				match(TAB);
				setState(1381);
				match(TAB);
				setState(1382);
				match(NEWLINE);
				setState(1383);
				match(WORD);
				setState(1384);
				match(TAB);
				setState(1385);
				match(DATE);
				setState(1386);
				match(TAB);
				setState(1387);
				match(WORD);
				setState(1388);
				match(NEWLINE);
				setState(1389);
				match(WORD);
				setState(1390);
				match(TAB);
				setState(1391);
				match(DATE);
				setState(1392);
				match(TAB);
				setState(1393);
				match(NEWLINE);
				setState(1563); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(1563);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
						case 1:
							{
							{
							setState(1394);
							match(WORD);
							setState(1395);
							match(TAB);
							setState(1396);
							match(DATE);
							setState(1397);
							match(TAB);
							setState(1398);
							((CompanyAllPriceContext)_localctx).code = word();
							setState(1399);
							match(NEWLINE);
							setState(1400);
							match(WORD);
							setState(1401);
							match(TAB);
							setState(1402);
							match(DATE);
							setState(1403);
							match(TAB);
							setState(1404);
							((CompanyAllPriceContext)_localctx).symbol = word();
							setState(1406);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
							case 1:
								{
								setState(1405);
								((CompanyAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(1409);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
							case 1:
								{
								setState(1408);
								((CompanyAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(1412);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
							case 1:
								{
								setState(1411);
								((CompanyAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(1415);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
							case 1:
								{
								setState(1414);
								((CompanyAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(1418);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
							case 1:
								{
								setState(1417);
								((CompanyAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(1421);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
							case 1:
								{
								setState(1420);
								((CompanyAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(1426);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(1423);
								((CompanyAllPriceContext)_localctx).symbol7 = word();
								}
								}
								setState(1428);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1429);
							match(NEWLINE);
							setState(1430);
							match(WORD);
							setState(1431);
							match(TAB);
							setState(1432);
							match(DATE);
							setState(1433);
							match(TAB);
							setState(1434);
							((CompanyAllPriceContext)_localctx).type = word();
							setState(1438);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(1435);
								word();
								}
								}
								setState(1440);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1441);
							match(NEWLINE);
							setState(1442);
							match(WORD);
							setState(1443);
							match(TAB);
							setState(1444);
							match(DATE);
							setState(1445);
							match(TAB);
							setState(1447);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==WORD) {
								{
								setState(1446);
								match(WORD);
								}
							}

							setState(1449);
							match(NEWLINE);
							setState(1450);
							match(WORD);
							setState(1451);
							match(TAB);
							setState(1452);
							match(DATE);
							setState(1453);
							match(TAB);
							setState(1454);
							((CompanyAllPriceContext)_localctx).closing = match(NUMBER);
							setState(1455);
							match(NEWLINE);
							setState(1456);
							match(WORD);
							setState(1457);
							match(TAB);
							setState(1458);
							match(DATE);
							setState(1459);
							match(TAB);
							setState(1460);
							match(NUMBER);
							setState(1461);
							match(NEWLINE);
							setState(1462);
							match(WORD);
							setState(1463);
							match(TAB);
							setState(1464);
							match(DATE);
							setState(1465);
							match(TAB);
							setState(1466);
							match(NUMBER);
							setState(1467);
							match(NEWLINE);
							setState(1468);
							match(WORD);
							setState(1469);
							match(TAB);
							setState(1470);
							match(DATE);
							setState(1471);
							match(TAB);
							setState(1472);
							((CompanyAllPriceContext)_localctx).market = match(NUMBER);
							setState(1473);
							match(NEWLINE);
							setState(1474);
							match(WORD);
							setState(1475);
							match(TAB);
							setState(1476);
							match(DATE);
							setState(1477);
							match(TAB);
							setState(1478);
							((CompanyAllPriceContext)_localctx).high = match(NUMBER);
							setState(1479);
							match(NEWLINE);
							setState(1480);
							match(WORD);
							setState(1481);
							match(TAB);
							setState(1482);
							match(DATE);
							setState(1483);
							match(TAB);
							setState(1484);
							((CompanyAllPriceContext)_localctx).low = match(NUMBER);
							setState(1485);
							match(NEWLINE);
							setState(1486);
							match(WORD);
							setState(1487);
							match(TAB);
							setState(1488);
							match(DATE);
							setState(1489);
							match(TAB);
							setState(1490);
							((CompanyAllPriceContext)_localctx).volume = match(NUMBER);
							setState(1491);
							match(NEWLINE);
							setState(1492);
							match(WORD);
							setState(1493);
							match(TAB);
							setState(1494);
							match(DATE);
							setState(1495);
							match(TAB);
							setState(1496);
							match(NUMBER);
							setState(1497);
							match(NEWLINE);
							setState(1498);
							match(WORD);
							setState(1499);
							match(TAB);
							setState(1500);
							match(DATE);
							setState(1501);
							match(TAB);
							setState(1502);
							match(NUMBER);
							setState(1503);
							match(NEWLINE);
							setState(1504);
							match(WORD);
							setState(1505);
							match(TAB);
							setState(1506);
							match(DATE);
							setState(1507);
							match(TAB);
							setState(1508);
							((CompanyAllPriceContext)_localctx).volumeOfListedShares = match(NUMBER);
							setState(1509);
							match(NEWLINE);
							setState(1510);
							match(WORD);
							setState(1511);
							match(TAB);
							setState(1512);
							((CompanyAllPriceContext)_localctx).base = match(DATE);
							setState(1513);
							match(TAB);
							setState(1514);
							match(NEWLINE);

											ParserService.crawlPriceCompanyEtf(20240105
												, (((CompanyAllPriceContext)_localctx).code!=null?_input.getText(((CompanyAllPriceContext)_localctx).code.start,((CompanyAllPriceContext)_localctx).code.stop):null), (((CompanyAllPriceContext)_localctx).symbol!=null?_input.getText(((CompanyAllPriceContext)_localctx).symbol.start,((CompanyAllPriceContext)_localctx).symbol.stop):null)
												, (((CompanyAllPriceContext)_localctx).base!=null?((CompanyAllPriceContext)_localctx).base.getText():null), (((CompanyAllPriceContext)_localctx).closing!=null?((CompanyAllPriceContext)_localctx).closing.getText():null), (((CompanyAllPriceContext)_localctx).market!=null?((CompanyAllPriceContext)_localctx).market.getText():null), (((CompanyAllPriceContext)_localctx).high!=null?((CompanyAllPriceContext)_localctx).high.getText():null), (((CompanyAllPriceContext)_localctx).low!=null?((CompanyAllPriceContext)_localctx).low.getText():null), (((CompanyAllPriceContext)_localctx).volume!=null?((CompanyAllPriceContext)_localctx).volume.getText():null)
											);
											ParserService.crawlItemDetailCompanyThread(20240105
												, (((CompanyAllPriceContext)_localctx).code!=null?_input.getText(((CompanyAllPriceContext)_localctx).code.start,((CompanyAllPriceContext)_localctx).code.stop):null), (((CompanyAllPriceContext)_localctx).type!=null?_input.getText(((CompanyAllPriceContext)_localctx).type.start,((CompanyAllPriceContext)_localctx).type.stop):null)
												, (((CompanyAllPriceContext)_localctx).symbol!=null?_input.getText(((CompanyAllPriceContext)_localctx).symbol.start,((CompanyAllPriceContext)_localctx).symbol.stop):null), (((CompanyAllPriceContext)_localctx).symbol1!=null?_input.getText(((CompanyAllPriceContext)_localctx).symbol1.start,((CompanyAllPriceContext)_localctx).symbol1.stop):null), (((CompanyAllPriceContext)_localctx).symbol2!=null?_input.getText(((CompanyAllPriceContext)_localctx).symbol2.start,((CompanyAllPriceContext)_localctx).symbol2.stop):null), (((CompanyAllPriceContext)_localctx).symbol3!=null?_input.getText(((CompanyAllPriceContext)_localctx).symbol3.start,((CompanyAllPriceContext)_localctx).symbol3.stop):null), (((CompanyAllPriceContext)_localctx).symbol4!=null?_input.getText(((CompanyAllPriceContext)_localctx).symbol4.start,((CompanyAllPriceContext)_localctx).symbol4.stop):null), (((CompanyAllPriceContext)_localctx).symbol5!=null?_input.getText(((CompanyAllPriceContext)_localctx).symbol5.start,((CompanyAllPriceContext)_localctx).symbol5.stop):null), (((CompanyAllPriceContext)_localctx).symbol6!=null?_input.getText(((CompanyAllPriceContext)_localctx).symbol6.start,((CompanyAllPriceContext)_localctx).symbol6.stop):null), (((CompanyAllPriceContext)_localctx).symbol7!=null?_input.getText(((CompanyAllPriceContext)_localctx).symbol7.start,((CompanyAllPriceContext)_localctx).symbol7.stop):null)
												, null, null
												, (((CompanyAllPriceContext)_localctx).volumeOfListedShares!=null?((CompanyAllPriceContext)_localctx).volumeOfListedShares.getText():null)
												, null
											);
										
							}
							}
							break;
						case 2:
							{
							{
							setState(1517);
							match(WORD);
							setState(1518);
							match(TAB);
							setState(1519);
							match(DATE);
							setState(1520);
							match(TAB);
							setState(1521);
							match(NUMBER);
							setState(1522);
							((CompanyAllPriceContext)_localctx).symbol = word();
							setState(1524);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
							case 1:
								{
								setState(1523);
								((CompanyAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(1527);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
							case 1:
								{
								setState(1526);
								((CompanyAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(1530);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
							case 1:
								{
								setState(1529);
								((CompanyAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(1533);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
							case 1:
								{
								setState(1532);
								((CompanyAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(1536);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
							case 1:
								{
								setState(1535);
								((CompanyAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(1539);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
							case 1:
								{
								setState(1538);
								((CompanyAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(1544);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1541);
									((CompanyAllPriceContext)_localctx).symbol7 = word();
									}
									} 
								}
								setState(1546);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
							}
							setState(1547);
							((CompanyAllPriceContext)_localctx).closing = match(NUMBER);
							setState(1548);
							match(NEWLINE);
							setState(1549);
							match(WORD);
							setState(1550);
							match(TAB);
							setState(1551);
							((CompanyAllPriceContext)_localctx).base = match(DATE);
							setState(1552);
							match(TAB);
							setState(1553);
							match(NUMBER);
							setState(1554);
							match(NUMBER);
							setState(1555);
							match(NUMBER);
							setState(1556);
							match(NUMBER);
							setState(1557);
							match(NUMBER);
							setState(1558);
							match(NUMBER);
							setState(1559);
							match(NUMBER);
							setState(1560);
							match(NEWLINE);

											ParserService.crawlPriceCompanyEtf(20240105
												, (((CompanyAllPriceContext)_localctx).code!=null?_input.getText(((CompanyAllPriceContext)_localctx).code.start,((CompanyAllPriceContext)_localctx).code.stop):null), (((CompanyAllPriceContext)_localctx).symbol!=null?_input.getText(((CompanyAllPriceContext)_localctx).symbol.start,((CompanyAllPriceContext)_localctx).symbol.stop):null)
												, (((CompanyAllPriceContext)_localctx).base!=null?((CompanyAllPriceContext)_localctx).base.getText():null), (((CompanyAllPriceContext)_localctx).closing!=null?((CompanyAllPriceContext)_localctx).closing.getText():null), (((CompanyAllPriceContext)_localctx).market!=null?((CompanyAllPriceContext)_localctx).market.getText():null), (((CompanyAllPriceContext)_localctx).high!=null?((CompanyAllPriceContext)_localctx).high.getText():null), (((CompanyAllPriceContext)_localctx).low!=null?((CompanyAllPriceContext)_localctx).low.getText():null), (((CompanyAllPriceContext)_localctx).volume!=null?((CompanyAllPriceContext)_localctx).volume.getText():null)
											);
										
							}
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1565); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1567);
				match(WORD);
				setState(1568);
				match(TAB);
				setState(1569);
				match(WORD);
				setState(1570);
				match(TAB);
				setState(1571);
				match(DATE);
				setState(1572);
				match(NEWLINE);
				}
				}
				setState(1576); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1578);
			match(KEYWORD);
			setState(1579);
			match(TAB);
			setState(1580);
			match(WORD);
			setState(1581);
			match(TAB);
			setState(1582);
			match(WORD);
			setState(1583);
			match(WORD);
			setState(1584);
			match(WORD);
			setState(1585);
			match(WORD);
			setState(1586);
			match(WORD);
			setState(1587);
			match(WORD);
			setState(1588);
			match(TAB);
			setState(1589);
			match(WORD);
			setState(1590);
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
		enterRule(_localctx, 10, RULE_crawlPriceKrx);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1592);
			match(KEYWORD);
			setState(1593);
			match(TAB);
			setState(1594);
			match(WORD);
			setState(1595);
			match(TAB);
			setState(1596);
			match(WORD);
			setState(1597);
			match(TAB);
			setState(1598);
			match(WORD);
			setState(1599);
			match(NEWLINE);
			setState(1785); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1785);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					{
					setState(1600);
					match(NUMBER);
					setState(1601);
					match(TAB);
					setState(1602);
					match(WORD);
					setState(1603);
					match(WORD);
					setState(1604);
					match(TAB);
					setState(1605);
					match(NEWLINE);
					}
					}
					break;
				case WORD:
					{
					setState(1775); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1773);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
							case 1:
								{
								{
								setState(1606);
								match(WORD);
								setState(1607);
								match(TAB);
								setState(1608);
								match(NUMBER);
								setState(1609);
								match(TAB);
								setState(1610);
								match(WORD);
								setState(1611);
								match(TAB);
								setState(1612);
								match(WORD);
								setState(1613);
								match(TAB);
								setState(1614);
								match(WORD);
								setState(1615);
								match(TAB);
								setState(1616);
								match(WORD);
								setState(1617);
								match(TAB);
								setState(1618);
								match(WORD);
								setState(1619);
								match(TAB);
								setState(1620);
								match(WORD);
								setState(1621);
								match(TAB);
								setState(1622);
								match(WORD);
								setState(1623);
								match(TAB);
								setState(1624);
								match(WORD);
								setState(1625);
								match(TAB);
								setState(1626);
								match(WORD);
								setState(1627);
								match(TAB);
								setState(1628);
								match(WORD);
								setState(1629);
								match(TAB);
								setState(1630);
								match(WORD);
								setState(1631);
								match(TAB);
								setState(1632);
								match(NEWLINE);
								setState(1661); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(1633);
										match(WORD);
										setState(1634);
										match(TAB);
										setState(1635);
										((CrawlPriceKrxContext)_localctx).code = match(NUMBER);
										setState(1636);
										match(TAB);
										setState(1637);
										((CrawlPriceKrxContext)_localctx).base = match(DATE);
										setState(1638);
										match(TAB);
										setState(1639);
										((CrawlPriceKrxContext)_localctx).closing = match(NUMBER);
										setState(1640);
										match(TAB);
										setState(1641);
										match(NUMBER);
										setState(1642);
										match(TAB);
										setState(1643);
										match(NUMBER);
										setState(1644);
										match(TAB);
										setState(1645);
										((CrawlPriceKrxContext)_localctx).market = match(NUMBER);
										setState(1646);
										match(TAB);
										setState(1647);
										((CrawlPriceKrxContext)_localctx).high = match(NUMBER);
										setState(1648);
										match(TAB);
										setState(1649);
										((CrawlPriceKrxContext)_localctx).low = match(NUMBER);
										setState(1650);
										match(TAB);
										setState(1651);
										((CrawlPriceKrxContext)_localctx).volume = match(NUMBER);
										setState(1652);
										match(TAB);
										setState(1653);
										match(NUMBER);
										setState(1654);
										match(TAB);
										setState(1655);
										match(NUMBER);
										setState(1656);
										match(TAB);
										setState(1657);
										match(NUMBER);
										setState(1658);
										match(TAB);
										setState(1659);
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
									setState(1663); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
								} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
								}
								}
								break;
							case 2:
								{
								{
								setState(1665);
								match(WORD);
								setState(1666);
								match(TAB);
								setState(1667);
								match(NUMBER);
								setState(1668);
								match(TAB);
								setState(1669);
								match(WORD);
								setState(1670);
								match(TAB);
								setState(1671);
								match(WORD);
								setState(1672);
								match(TAB);
								setState(1673);
								match(WORD);
								setState(1674);
								match(TAB);
								setState(1675);
								match(WORD);
								setState(1676);
								match(TAB);
								setState(1677);
								match(WORD);
								setState(1678);
								match(TAB);
								setState(1679);
								match(WORD);
								setState(1680);
								match(TAB);
								setState(1681);
								match(WORD);
								setState(1682);
								match(TAB);
								setState(1683);
								match(WORD);
								setState(1684);
								match(TAB);
								setState(1685);
								match(WORD);
								setState(1686);
								match(TAB);
								setState(1687);
								match(WORD);
								setState(1688);
								match(TAB);
								setState(1689);
								match(WORD);
								setState(1690);
								match(TAB);
								setState(1691);
								match(WORD);
								setState(1692);
								match(TAB);
								setState(1693);
								match(WORD);
								setState(1694);
								match(TAB);
								setState(1695);
								match(WORD);
								setState(1696);
								match(TAB);
								setState(1697);
								match(WORD);
								setState(1698);
								match(TAB);
								setState(1699);
								match(WORD);
								setState(1700);
								match(TAB);
								setState(1701);
								match(WORD);
								setState(1702);
								match(TAB);
								setState(1703);
								match(NEWLINE);
								setState(1769); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(1704);
										match(WORD);
										setState(1705);
										match(TAB);
										setState(1706);
										((CrawlPriceKrxContext)_localctx).code = match(NUMBER);
										setState(1707);
										match(TAB);
										setState(1708);
										((CrawlPriceKrxContext)_localctx).base = match(DATE);
										setState(1709);
										match(TAB);
										setState(1710);
										((CrawlPriceKrxContext)_localctx).closing = match(NUMBER);
										setState(1711);
										match(TAB);
										setState(1712);
										match(NUMBER);
										setState(1713);
										match(TAB);
										setState(1714);
										match(NUMBER);
										setState(1715);
										match(TAB);
										setState(1716);
										match(NUMBER);
										setState(1717);
										match(TAB);
										setState(1718);
										((CrawlPriceKrxContext)_localctx).market = match(NUMBER);
										setState(1719);
										match(TAB);
										setState(1720);
										((CrawlPriceKrxContext)_localctx).high = match(NUMBER);
										setState(1721);
										match(TAB);
										setState(1722);
										((CrawlPriceKrxContext)_localctx).low = match(NUMBER);
										setState(1723);
										match(TAB);
										setState(1724);
										((CrawlPriceKrxContext)_localctx).volume = match(NUMBER);
										setState(1725);
										match(TAB);
										setState(1726);
										match(NUMBER);
										setState(1727);
										match(TAB);
										setState(1728);
										match(NUMBER);
										setState(1729);
										match(TAB);
										setState(1730);
										match(NUMBER);
										setState(1731);
										match(TAB);
										setState(1732);
										match(NUMBER);
										setState(1733);
										match(TAB);
										setState(1734);
										((CrawlPriceKrxContext)_localctx).symbol = word();
										setState(1736);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
										case 1:
											{
											setState(1735);
											((CrawlPriceKrxContext)_localctx).symbol1 = word();
											}
											break;
										}
										setState(1739);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
										case 1:
											{
											setState(1738);
											((CrawlPriceKrxContext)_localctx).symbol2 = word();
											}
											break;
										}
										setState(1742);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
										case 1:
											{
											setState(1741);
											((CrawlPriceKrxContext)_localctx).symbol3 = word();
											}
											break;
										}
										setState(1745);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
										case 1:
											{
											setState(1744);
											((CrawlPriceKrxContext)_localctx).symbol4 = word();
											}
											break;
										}
										setState(1748);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
										case 1:
											{
											setState(1747);
											((CrawlPriceKrxContext)_localctx).symbol5 = word();
											}
											break;
										}
										setState(1751);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
										case 1:
											{
											setState(1750);
											((CrawlPriceKrxContext)_localctx).symbol6 = word();
											}
											break;
										}
										setState(1756);
										_errHandler.sync(this);
										_la = _input.LA(1);
										while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
											{
											{
											setState(1753);
											((CrawlPriceKrxContext)_localctx).symbol7 = word();
											}
											}
											setState(1758);
											_errHandler.sync(this);
											_la = _input.LA(1);
										}
										setState(1759);
										match(TAB);
										setState(1760);
										match(NUMBER);
										setState(1761);
										match(TAB);
										setState(1762);
										match(NUMBER);
										setState(1763);
										match(TAB);
										setState(1764);
										match(NUMBER);
										setState(1765);
										match(TAB);
										setState(1766);
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
									setState(1771); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
								} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
								}
								}
								break;
							}
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1777); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(1779);
					match(WORD);
					setState(1780);
					match(TAB);
					setState(1781);
					match(WORD);
					setState(1782);
					match(TAB);
					setState(1783);
					match(DATE);
					setState(1784);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1787); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER || _la==WORD );
			setState(1789);
			match(KEYWORD);
			setState(1790);
			match(TAB);
			setState(1791);
			match(WORD);
			setState(1792);
			match(TAB);
			setState(1793);
			match(WORD);
			setState(1794);
			match(TAB);
			setState(1795);
			match(WORD);
			setState(1796);
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
		enterRule(_localctx, 12, RULE_crawlItemEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1798);
			match(KEYWORD);
			setState(1799);
			match(TAB);
			setState(1800);
			match(WORD);
			setState(1801);
			match(TAB);
			setState(1802);
			match(WORD);
			setState(1803);
			match(WORD);
			setState(1804);
			match(WORD);
			setState(1805);
			match(TAB);
			setState(1806);
			match(WORD);
			setState(1807);
			match(TAB);
			setState(1808);
			match(WORD);
			setState(1809);
			match(NEWLINE);
			setState(1938); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1810);
				match(WORD);
				setState(1811);
				match(TAB);
				setState(1812);
				match(NEWLINE);
				setState(1813);
				match(WORD);
				setState(1814);
				match(TAB);
				setState(1815);
				match(WORD);
				setState(1816);
				match(TAB);
				setState(1817);
				match(WORD);
				setState(1818);
				match(TAB);
				setState(1819);
				match(TAB);
				setState(1820);
				match(WORD);
				setState(1821);
				match(TAB);
				setState(1822);
				match(WORD);
				setState(1823);
				match(TAB);
				setState(1824);
				match(WORD);
				setState(1825);
				match(TAB);
				setState(1826);
				match(WORD);
				setState(1827);
				match(NEWLINE);
				setState(1828);
				match(WORD);
				setState(1829);
				match(TAB);
				setState(1830);
				match(TAB);
				setState(1831);
				match(TAB);
				setState(1832);
				match(WORD);
				setState(1833);
				match(TAB);
				setState(1834);
				match(TAB);
				setState(1835);
				match(TAB);
				setState(1836);
				match(TAB);
				setState(1837);
				match(TAB);
				setState(1838);
				match(TAB);
				setState(1839);
				match(WORD);
				setState(1840);
				match(TAB);
				setState(1841);
				match(WORD);
				setState(1842);
				match(TAB);
				setState(1843);
				match(NEWLINE);
				setState(1927); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1844);
						((CrawlItemEtfContext)_localctx).type = match(WORD);
						setState(1845);
						match(TAB);
						setState(1846);
						match(TAB);
						setState(1847);
						((CrawlItemEtfContext)_localctx).symbol = word();
						setState(1849);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
						case 1:
							{
							setState(1848);
							((CrawlItemEtfContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(1852);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
						case 1:
							{
							setState(1851);
							((CrawlItemEtfContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(1855);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
						case 1:
							{
							setState(1854);
							((CrawlItemEtfContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(1858);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
						case 1:
							{
							setState(1857);
							((CrawlItemEtfContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(1861);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
						case 1:
							{
							setState(1860);
							((CrawlItemEtfContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(1864);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
						case 1:
							{
							setState(1863);
							((CrawlItemEtfContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(1869);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(1866);
							((CrawlItemEtfContext)_localctx).symbol7 = word();
							}
							}
							setState(1871);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1872);
						match(TAB);
						setState(1873);
						((CrawlItemEtfContext)_localctx).code = match(NUMBER);
						setState(1874);
						match(TAB);
						setState(1875);
						((CrawlItemEtfContext)_localctx).category = word();
						setState(1877);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
						case 1:
							{
							setState(1876);
							((CrawlItemEtfContext)_localctx).category1 = word();
							}
							break;
						}
						setState(1880);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
						case 1:
							{
							setState(1879);
							((CrawlItemEtfContext)_localctx).category2 = word();
							}
							break;
						}
						setState(1883);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
						case 1:
							{
							setState(1882);
							((CrawlItemEtfContext)_localctx).category3 = word();
							}
							break;
						}
						setState(1886);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
						case 1:
							{
							setState(1885);
							((CrawlItemEtfContext)_localctx).category4 = word();
							}
							break;
						}
						setState(1889);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
						case 1:
							{
							setState(1888);
							((CrawlItemEtfContext)_localctx).category5 = word();
							}
							break;
						}
						setState(1892);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
						case 1:
							{
							setState(1891);
							((CrawlItemEtfContext)_localctx).category6 = word();
							}
							break;
						}
						setState(1897);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(1894);
							((CrawlItemEtfContext)_localctx).category7 = word();
							}
							}
							setState(1899);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1900);
						match(TAB);
						setState(1901);
						((CrawlItemEtfContext)_localctx).asset = match(NUMBER);
						setState(1902);
						match(TAB);
						setState(1903);
						((CrawlItemEtfContext)_localctx).closing = match(NUMBER);
						setState(1904);
						match(TAB);
						setState(1905);
						((CrawlItemEtfContext)_localctx).amount = match(NUMBER);
						setState(1906);
						match(TAB);
						setState(1907);
						match(TAB);
						setState(1908);
						match(TAB);
						setState(1910);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(1909);
							((CrawlItemEtfContext)_localctx).priceEarningsRatio = match(NUMBER);
							}
						}

						setState(1912);
						match(TAB);
						setState(1913);
						match(TAB);
						setState(1914);
						match(TAB);
						setState(1915);
						match(TAB);
						setState(1916);
						match(TAB);
						setState(1917);
						match(TAB);
						setState(1919);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(1918);
							((CrawlItemEtfContext)_localctx).fee = match(NUMBER);
							}
						}

						setState(1921);
						match(TAB);
						setState(1922);
						((CrawlItemEtfContext)_localctx).operator = match(WORD);
						setState(1923);
						match(TAB);
						setState(1924);
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
					setState(1929); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1931);
				match(WORD);
				setState(1932);
				match(TAB);
				setState(1933);
				match(WORD);
				setState(1934);
				match(TAB);
				setState(1935);
				match(DATE);
				setState(1936);
				match(NEWLINE);
				}
				}
				setState(1940); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1942);
			match(KEYWORD);
			setState(1943);
			match(TAB);
			setState(1944);
			match(WORD);
			setState(1945);
			match(TAB);
			setState(1946);
			match(WORD);
			setState(1947);
			match(WORD);
			setState(1948);
			match(WORD);
			setState(1949);
			match(TAB);
			setState(1950);
			match(WORD);
			setState(1951);
			match(TAB);
			setState(1952);
			match(WORD);
			setState(1953);
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
		enterRule(_localctx, 14, RULE_crawlPriceEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
			match(KEYWORD);
			setState(1956);
			match(TAB);
			setState(1957);
			match(WORD);
			setState(1958);
			match(WORD);
			setState(1959);
			match(TAB);
			setState(1960);
			match(WORD);
			setState(1961);
			match(TAB);
			setState(1962);
			match(WORD);
			setState(1963);
			match(TAB);
			setState(1964);
			match(WORD);
			setState(1965);
			match(NEWLINE);
			setState(2107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1966);
				((CrawlPriceEtfContext)_localctx).code = match(NUMBER);
				setState(1967);
				match(TAB);
				setState(1969); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1968);
					word();
					}
					}
					setState(1971); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(1973);
				match(NEWLINE);
				{
				setState(1974);
				match(KEYWORD);
				setState(1975);
				match(TAB);
				setState(1976);
				((CrawlPriceEtfContext)_localctx).symbol = word();
				setState(1978);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(1977);
					((CrawlPriceEtfContext)_localctx).symbol1 = word();
					}
					break;
				}
				setState(1981);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(1980);
					((CrawlPriceEtfContext)_localctx).symbol2 = word();
					}
					break;
				}
				setState(1984);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(1983);
					((CrawlPriceEtfContext)_localctx).symbol3 = word();
					}
					break;
				}
				setState(1987);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(1986);
					((CrawlPriceEtfContext)_localctx).symbol4 = word();
					}
					break;
				}
				setState(1990);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(1989);
					((CrawlPriceEtfContext)_localctx).symbol5 = word();
					}
					break;
				}
				setState(1993);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(1992);
					((CrawlPriceEtfContext)_localctx).symbol6 = word();
					}
					break;
				}
				setState(1998);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
					{
					{
					setState(1995);
					((CrawlPriceEtfContext)_localctx).symbol7 = word();
					}
					}
					setState(2000);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2001);
				match(NEWLINE);
				setState(2002);
				match(KEYWORD);
				setState(2003);
				match(TAB);
				setState(2004);
				((CrawlPriceEtfContext)_localctx).category = word();
				setState(2006);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(2005);
					((CrawlPriceEtfContext)_localctx).category1 = word();
					}
					break;
				}
				setState(2009);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(2008);
					((CrawlPriceEtfContext)_localctx).category2 = word();
					}
					break;
				}
				setState(2012);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(2011);
					((CrawlPriceEtfContext)_localctx).category3 = word();
					}
					break;
				}
				setState(2015);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(2014);
					((CrawlPriceEtfContext)_localctx).category4 = word();
					}
					break;
				}
				setState(2018);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(2017);
					((CrawlPriceEtfContext)_localctx).category5 = word();
					}
					break;
				}
				setState(2021);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(2020);
					((CrawlPriceEtfContext)_localctx).category6 = word();
					}
					break;
				}
				setState(2026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
					{
					{
					setState(2023);
					((CrawlPriceEtfContext)_localctx).category7 = word();
					}
					}
					setState(2028);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2029);
				match(NEWLINE);
				setState(2030);
				match(KEYWORD);
				setState(2031);
				match(TAB);
				setState(2032);
				((CrawlPriceEtfContext)_localctx).ea = match(NUMBER);
				setState(2033);
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
				setState(2096); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2036);
						match(WORD);
						setState(2037);
						match(TAB);
						setState(2038);
						match(WORD);
						setState(2039);
						match(TAB);
						setState(2040);
						match(WORD);
						setState(2041);
						match(TAB);
						setState(2042);
						match(WORD);
						setState(2043);
						match(TAB);
						setState(2044);
						match(WORD);
						setState(2045);
						match(TAB);
						setState(2046);
						match(WORD);
						setState(2047);
						match(TAB);
						setState(2048);
						match(WORD);
						setState(2049);
						match(TAB);
						setState(2050);
						match(WORD);
						setState(2051);
						match(TAB);
						setState(2052);
						match(NEWLINE);
						setState(2092); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(2092);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
							case 1:
								{
								{
								setState(2053);
								match(TAB);
								setState(2054);
								match(TAB);
								setState(2055);
								match(TAB);
								setState(2056);
								match(TAB);
								setState(2057);
								match(TAB);
								setState(2058);
								match(TAB);
								setState(2059);
								match(TAB);
								setState(2060);
								match(TAB);
								setState(2061);
								match(NEWLINE);
								}
								}
								break;
							case 2:
								{
								{
								setState(2063);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(2062);
									((CrawlPriceEtfContext)_localctx).base = match(DATE);
									}
								}

								setState(2065);
								match(TAB);
								setState(2067);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(2066);
									((CrawlPriceEtfContext)_localctx).closing = match(NUMBER);
									}
								}

								setState(2069);
								match(TAB);
								setState(2071);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(2070);
									match(NUMBER);
									}
								}

								setState(2073);
								match(TAB);
								setState(2075);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(2074);
									((CrawlPriceEtfContext)_localctx).market = match(NUMBER);
									}
								}

								setState(2077);
								match(TAB);
								setState(2079);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(2078);
									((CrawlPriceEtfContext)_localctx).high = match(NUMBER);
									}
								}

								setState(2081);
								match(TAB);
								setState(2082);
								((CrawlPriceEtfContext)_localctx).low = match(NUMBER);
								setState(2083);
								match(TAB);
								setState(2084);
								((CrawlPriceEtfContext)_localctx).volume = match(NUMBER);
								setState(2085);
								match(TAB);
								setState(2087);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(2086);
									match(NUMBER);
									}
								}

								setState(2089);
								match(TAB);
								setState(2090);
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
							setState(2094); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2098); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2100);
				match(WORD);
				setState(2101);
				match(TAB);
				setState(2102);
				match(WORD);
				setState(2103);
				match(TAB);
				setState(2104);
				match(DATE);
				setState(2105);
				match(NEWLINE);
				}
				}
				setState(2109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(2111);
			match(KEYWORD);
			setState(2112);
			match(TAB);
			setState(2113);
			match(WORD);
			setState(2114);
			match(WORD);
			setState(2115);
			match(TAB);
			setState(2116);
			match(WORD);
			setState(2117);
			match(TAB);
			setState(2118);
			match(WORD);
			setState(2119);
			match(TAB);
			setState(2120);
			match(WORD);
			setState(2121);
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
		enterRule(_localctx, 16, RULE_crawlPriceCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2123);
			match(KEYWORD);
			setState(2124);
			match(TAB);
			setState(2125);
			match(WORD);
			setState(2126);
			match(WORD);
			setState(2127);
			match(TAB);
			setState(2128);
			match(WORD);
			setState(2129);
			match(TAB);
			setState(2130);
			match(WORD);
			setState(2131);
			match(TAB);
			setState(2132);
			match(WORD);
			setState(2133);
			match(NEWLINE);
			setState(2196); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2134);
				((CrawlPriceCompanyContext)_localctx).code = match(NUMBER);
				setState(2135);
				match(TAB);
				setState(2137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2136);
					((CrawlPriceCompanyContext)_localctx).symbol = word();
					}
					}
					setState(2139); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(2141);
				match(NEWLINE);
				setState(2185); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2142);
						match(WORD);
						setState(2143);
						match(TAB);
						setState(2144);
						match(WORD);
						setState(2145);
						match(TAB);
						setState(2146);
						match(WORD);
						setState(2147);
						match(TAB);
						setState(2148);
						match(WORD);
						setState(2149);
						match(TAB);
						setState(2150);
						match(WORD);
						setState(2151);
						match(TAB);
						setState(2152);
						match(WORD);
						setState(2153);
						match(TAB);
						setState(2154);
						match(WORD);
						setState(2155);
						match(TAB);
						setState(2156);
						match(NEWLINE);
						setState(2181); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(2181);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case TAB:
								{
								{
								setState(2157);
								match(TAB);
								setState(2158);
								match(TAB);
								setState(2159);
								match(TAB);
								setState(2160);
								match(TAB);
								setState(2161);
								match(TAB);
								setState(2162);
								match(TAB);
								setState(2163);
								match(TAB);
								setState(2164);
								match(NEWLINE);
								}
								}
								break;
							case DATE:
								{
								{
								setState(2165);
								((CrawlPriceCompanyContext)_localctx).base = match(DATE);
								setState(2166);
								match(TAB);
								setState(2167);
								((CrawlPriceCompanyContext)_localctx).closing = match(NUMBER);
								setState(2168);
								match(TAB);
								setState(2169);
								match(NUMBER);
								setState(2170);
								match(TAB);
								setState(2171);
								((CrawlPriceCompanyContext)_localctx).market = match(NUMBER);
								setState(2172);
								match(TAB);
								setState(2173);
								((CrawlPriceCompanyContext)_localctx).high = match(NUMBER);
								setState(2174);
								match(TAB);
								setState(2175);
								((CrawlPriceCompanyContext)_localctx).low = match(NUMBER);
								setState(2176);
								match(TAB);
								setState(2177);
								((CrawlPriceCompanyContext)_localctx).volume = match(NUMBER);
								setState(2178);
								match(TAB);
								setState(2179);
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
							setState(2183); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2187); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2189);
				match(WORD);
				setState(2190);
				match(TAB);
				setState(2191);
				match(WORD);
				setState(2192);
				match(TAB);
				setState(2193);
				match(DATE);
				setState(2194);
				match(NEWLINE);
				}
				}
				setState(2198); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(2200);
			match(KEYWORD);
			setState(2201);
			match(TAB);
			setState(2202);
			match(WORD);
			setState(2203);
			match(WORD);
			setState(2204);
			match(TAB);
			setState(2205);
			match(WORD);
			setState(2206);
			match(TAB);
			setState(2207);
			match(WORD);
			setState(2208);
			match(TAB);
			setState(2209);
			match(WORD);
			setState(2210);
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
		enterRule(_localctx, 18, RULE_crawlItemDetailCompanyThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2212);
			match(KEYWORD);
			setState(2213);
			match(TAB);
			setState(2214);
			match(WORD);
			setState(2215);
			match(WORD);
			setState(2216);
			match(TAB);
			setState(2217);
			match(WORD);
			setState(2218);
			match(TAB);
			setState(2219);
			match(WORD);
			setState(2220);
			match(TAB);
			setState(2221);
			match(WORD);
			setState(2222);
			match(NEWLINE);
			setState(2280); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2223);
					match(KEYWORD);
					setState(2224);
					match(TAB);
					setState(2225);
					((CrawlItemDetailCompanyThreadContext)_localctx).code = match(NUMBER);
					setState(2226);
					match(TAB);
					setState(2227);
					((CrawlItemDetailCompanyThreadContext)_localctx).type = match(WORD);
					setState(2228);
					match(TAB);
					setState(2229);
					((CrawlItemDetailCompanyThreadContext)_localctx).symbol = word();
					setState(2231);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
					case 1:
						{
						setState(2230);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(2234);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
					case 1:
						{
						setState(2233);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(2237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
					case 1:
						{
						setState(2236);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(2240);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
					case 1:
						{
						setState(2239);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(2243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
					case 1:
						{
						setState(2242);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(2246);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
					case 1:
						{
						setState(2245);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(2251);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(2248);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(2253);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2254);
					match(NEWLINE);
					setState(2255);
					match(KEYWORD);
					setState(2256);
					match(TAB);
					setState(2257);
					((CrawlItemDetailCompanyThreadContext)_localctx).category = match(STRING);
					setState(2258);
					match(NEWLINE);
					setState(2259);
					match(KEYWORD);
					setState(2260);
					match(TAB);
					setState(2261);
					((CrawlItemDetailCompanyThreadContext)_localctx).fics = match(STRING);
					setState(2262);
					match(NEWLINE);
					setState(2263);
					match(KEYWORD);
					setState(2264);
					match(TAB);
					setState(2265);
					((CrawlItemDetailCompanyThreadContext)_localctx).ea = match(NUMBER);
					setState(2266);
					match(WORD);
					setState(2267);
					match(NEWLINE);
					setState(2268);
					match(KEYWORD);
					setState(2269);
					match(TAB);
					setState(2270);
					((CrawlItemDetailCompanyThreadContext)_localctx).ipo = match(DATE);
					setState(2271);
					match(NEWLINE);
					setState(2272);
					match(WORD);
					setState(2273);
					match(TAB);
					setState(2274);
					match(WORD);
					setState(2275);
					match(TAB);
					setState(2276);
					match(DATE);
					setState(2277);
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
				setState(2282); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(2284);
			match(KEYWORD);
			setState(2285);
			match(TAB);
			setState(2286);
			match(WORD);
			setState(2287);
			match(WORD);
			setState(2288);
			match(TAB);
			setState(2289);
			match(WORD);
			setState(2290);
			match(TAB);
			setState(2291);
			match(WORD);
			setState(2292);
			match(TAB);
			setState(2293);
			match(WORD);
			setState(2294);
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
		enterRule(_localctx, 20, RULE_crawlItemDividendTopCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2296);
			match(KEYWORD);
			setState(2297);
			match(TAB);
			setState(2298);
			match(WORD);
			setState(2299);
			match(TAB);
			setState(2300);
			match(WORD);
			setState(2301);
			match(WORD);
			setState(2302);
			match(WORD);
			setState(2303);
			match(TAB);
			setState(2304);
			match(WORD);
			setState(2305);
			match(TAB);
			setState(2306);
			match(WORD);
			setState(2307);
			match(NEWLINE);
			setState(2376); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2308);
				match(WORD);
				setState(2309);
				match(TAB);
				setState(2310);
				match(NEWLINE);
				setState(2311);
				match(WORD);
				setState(2312);
				match(TAB);
				setState(2313);
				match(WORD);
				setState(2314);
				match(TAB);
				setState(2315);
				match(WORD);
				setState(2316);
				match(TAB);
				setState(2317);
				match(WORD);
				setState(2318);
				match(TAB);
				setState(2319);
				match(WORD);
				setState(2320);
				match(TAB);
				setState(2321);
				match(WORD);
				setState(2322);
				match(TAB);
				setState(2323);
				match(WORD);
				setState(2324);
				match(TAB);
				setState(2325);
				match(WORD);
				setState(2326);
				match(TAB);
				setState(2327);
				match(WORD);
				setState(2328);
				match(TAB);
				setState(2329);
				match(WORD);
				setState(2330);
				match(TAB);
				setState(2331);
				match(WORD);
				setState(2332);
				match(TAB);
				setState(2333);
				match(NEWLINE);
				setState(2365); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2334);
						((CrawlItemDividendTopCompanyContext)_localctx).type = match(WORD);
						setState(2335);
						match(TAB);
						setState(2336);
						match(NUMBER);
						setState(2337);
						match(TAB);
						setState(2339);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(2338);
							((CrawlItemDividendTopCompanyContext)_localctx).code = match(NUMBER);
							}
						}

						setState(2341);
						match(TAB);
						setState(2343); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(2342);
							word();
							}
							}
							setState(2345); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(2347);
						match(TAB);
						setState(2348);
						match(WORD);
						setState(2349);
						match(TAB);
						setState(2350);
						match(WORD);
						setState(2351);
						match(TAB);
						setState(2352);
						match(NUMBER);
						setState(2353);
						match(TAB);
						setState(2354);
						match(NUMBER);
						setState(2355);
						match(TAB);
						setState(2356);
						match(NUMBER);
						setState(2357);
						match(TAB);
						setState(2358);
						match(NUMBER);
						setState(2359);
						match(TAB);
						setState(2360);
						match(NUMBER);
						setState(2361);
						match(TAB);
						setState(2362);
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
					setState(2367); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2369);
				match(WORD);
				setState(2370);
				match(TAB);
				setState(2371);
				match(WORD);
				setState(2372);
				match(TAB);
				setState(2373);
				match(DATE);
				setState(2374);
				match(NEWLINE);
				}
				}
				setState(2378); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(2380);
			match(KEYWORD);
			setState(2381);
			match(TAB);
			setState(2382);
			match(WORD);
			setState(2383);
			match(TAB);
			setState(2384);
			match(WORD);
			setState(2385);
			match(WORD);
			setState(2386);
			match(WORD);
			setState(2387);
			match(TAB);
			setState(2388);
			match(WORD);
			setState(2389);
			match(TAB);
			setState(2390);
			match(WORD);
			setState(2391);
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
		enterRule(_localctx, 22, RULE_crawlEtfDetailThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2393);
			match(KEYWORD);
			setState(2394);
			match(TAB);
			setState(2395);
			match(WORD);
			setState(2396);
			match(WORD);
			setState(2397);
			match(TAB);
			setState(2398);
			match(WORD);
			setState(2399);
			match(TAB);
			setState(2400);
			match(WORD);
			setState(2401);
			match(NEWLINE);
			setState(2483); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2402);
					match(KEYWORD);
					setState(2403);
					match(TAB);
					setState(2404);
					((CrawlEtfDetailThreadContext)_localctx).code = match(NUMBER);
					setState(2405);
					match(TAB);
					setState(2409);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(2406);
						word();
						}
						}
						setState(2411);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2412);
					match(NEWLINE);
					setState(2413);
					((CrawlEtfDetailThreadContext)_localctx).symbol = word();
					setState(2415);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
					case 1:
						{
						setState(2414);
						((CrawlEtfDetailThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(2418);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
					case 1:
						{
						setState(2417);
						((CrawlEtfDetailThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(2421);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
					case 1:
						{
						setState(2420);
						((CrawlEtfDetailThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(2424);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
					case 1:
						{
						setState(2423);
						((CrawlEtfDetailThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(2427);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
					case 1:
						{
						setState(2426);
						((CrawlEtfDetailThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(2430);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
					case 1:
						{
						setState(2429);
						((CrawlEtfDetailThreadContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(2435);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(2432);
						((CrawlEtfDetailThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(2437);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2438);
					match(NEWLINE);
					setState(2439);
					((CrawlEtfDetailThreadContext)_localctx).category = word();
					setState(2441);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
					case 1:
						{
						setState(2440);
						((CrawlEtfDetailThreadContext)_localctx).category1 = word();
						}
						break;
					}
					setState(2444);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
					case 1:
						{
						setState(2443);
						((CrawlEtfDetailThreadContext)_localctx).category2 = word();
						}
						break;
					}
					setState(2447);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
					case 1:
						{
						setState(2446);
						((CrawlEtfDetailThreadContext)_localctx).category3 = word();
						}
						break;
					}
					setState(2450);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
					case 1:
						{
						setState(2449);
						((CrawlEtfDetailThreadContext)_localctx).category4 = word();
						}
						break;
					}
					setState(2453);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
					case 1:
						{
						setState(2452);
						((CrawlEtfDetailThreadContext)_localctx).category5 = word();
						}
						break;
					}
					setState(2456);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
					case 1:
						{
						setState(2455);
						((CrawlEtfDetailThreadContext)_localctx).category6 = word();
						}
						break;
					}
					setState(2461);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(2458);
						((CrawlEtfDetailThreadContext)_localctx).category7 = word();
						}
						}
						setState(2463);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2464);
					match(NEWLINE);
					setState(2465);
					((CrawlEtfDetailThreadContext)_localctx).ipo = match(DATE);
					setState(2469);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WORD) {
						{
						{
						setState(2466);
						match(WORD);
						}
						}
						setState(2471);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2472);
					match(NEWLINE);
					setState(2473);
					((CrawlEtfDetailThreadContext)_localctx).fee = word();
					setState(2474);
					match(NEWLINE);
					setState(2475);
					match(WORD);
					setState(2476);
					match(TAB);
					setState(2477);
					match(WORD);
					setState(2478);
					match(TAB);
					setState(2479);
					match(DATE);
					setState(2480);
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
				setState(2485); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(2487);
			match(KEYWORD);
			setState(2488);
			match(TAB);
			setState(2489);
			match(WORD);
			setState(2490);
			match(WORD);
			setState(2491);
			match(TAB);
			setState(2492);
			match(WORD);
			setState(2493);
			match(TAB);
			setState(2494);
			match(WORD);
			setState(2495);
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
		enterRule(_localctx, 24, RULE_crawlDividendHistoryEtfThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2497);
			match(KEYWORD);
			setState(2498);
			match(TAB);
			setState(2499);
			match(WORD);
			setState(2500);
			match(WORD);
			setState(2501);
			match(WORD);
			setState(2502);
			match(TAB);
			setState(2503);
			match(WORD);
			setState(2504);
			match(WORD);
			setState(2505);
			match(WORD);
			setState(2506);
			match(TAB);
			setState(2507);
			match(WORD);
			setState(2508);
			match(TAB);
			setState(2509);
			match(WORD);
			setState(2510);
			match(NEWLINE);
			setState(2621); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2511);
					match(KEYWORD);
					setState(2512);
					match(TAB);
					setState(2513);
					((CrawlDividendHistoryEtfThreadContext)_localctx).code = match(NUMBER);
					setState(2514);
					match(NEWLINE);
					setState(2515);
					match(WORD);
					setState(2516);
					match(TAB);
					setState(2518);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WORD) {
						{
						setState(2517);
						match(WORD);
						}
					}

					setState(2520);
					match(TAB);
					setState(2521);
					match(WORD);
					setState(2522);
					match(TAB);
					setState(2523);
					match(WORD);
					setState(2524);
					match(TAB);
					setState(2525);
					match(WORD);
					setState(2526);
					match(TAB);
					setState(2527);
					match(WORD);
					setState(2528);
					match(TAB);
					setState(2529);
					match(WORD);
					setState(2530);
					match(TAB);
					setState(2531);
					match(WORD);
					setState(2532);
					match(TAB);
					setState(2533);
					match(WORD);
					setState(2534);
					match(TAB);
					setState(2535);
					match(WORD);
					setState(2536);
					match(TAB);
					setState(2537);
					match(NEWLINE);
					setState(2611); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(2611);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case TAB:
								{
								{
								setState(2538);
								match(TAB);
								setState(2539);
								match(TAB);
								setState(2540);
								match(TAB);
								setState(2541);
								match(TAB);
								setState(2542);
								match(TAB);
								setState(2543);
								match(TAB);
								setState(2544);
								match(TAB);
								setState(2545);
								match(TAB);
								setState(2546);
								match(TAB);
								setState(2547);
								match(TAB);
								setState(2548);
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
								setState(2549);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol = word();
								setState(2551);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
								case 1:
									{
									setState(2550);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol1 = word();
									}
									break;
								}
								setState(2554);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
								case 1:
									{
									setState(2553);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol2 = word();
									}
									break;
								}
								setState(2557);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
								case 1:
									{
									setState(2556);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol3 = word();
									}
									break;
								}
								setState(2560);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
								case 1:
									{
									setState(2559);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol4 = word();
									}
									break;
								}
								setState(2563);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
								case 1:
									{
									setState(2562);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol5 = word();
									}
									break;
								}
								setState(2566);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
								case 1:
									{
									setState(2565);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol6 = word();
									}
									break;
								}
								setState(2571);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
									{
									{
									setState(2568);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol7 = word();
									}
									}
									setState(2573);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(2574);
								match(TAB);
								setState(2576);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==WORD) {
									{
									setState(2575);
									match(WORD);
									}
								}

								setState(2578);
								match(TAB);
								setState(2579);
								match(WORD);
								setState(2580);
								match(TAB);
								setState(2584);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
									{
									{
									setState(2581);
									word();
									}
									}
									setState(2586);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(2587);
								match(TAB);
								setState(2589);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(2588);
									((CrawlDividendHistoryEtfThreadContext)_localctx).base = match(DATE);
									}
								}

								setState(2591);
								match(TAB);
								setState(2592);
								((CrawlDividendHistoryEtfThreadContext)_localctx).pay = match(DATE);
								setState(2593);
								match(TAB);
								setState(2595);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==WORD) {
									{
									setState(2594);
									match(WORD);
									}
								}

								setState(2597);
								match(TAB);
								setState(2598);
								((CrawlDividendHistoryEtfThreadContext)_localctx).dividend = match(NUMBER);
								setState(2599);
								match(TAB);
								setState(2601);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(2600);
									((CrawlDividendHistoryEtfThreadContext)_localctx).price = match(NUMBER);
									}
								}

								setState(2603);
								match(TAB);
								setState(2605);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(2604);
									((CrawlDividendHistoryEtfThreadContext)_localctx).ratio = match(NUMBER);
									}
								}

								setState(2607);
								match(TAB);
								setState(2608);
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
						setState(2613); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(2615);
					match(WORD);
					setState(2616);
					match(TAB);
					setState(2617);
					match(WORD);
					setState(2618);
					match(TAB);
					setState(2619);
					match(DATE);
					setState(2620);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2623); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(2625);
			match(KEYWORD);
			setState(2626);
			match(TAB);
			setState(2627);
			match(WORD);
			setState(2628);
			match(WORD);
			setState(2629);
			match(WORD);
			setState(2630);
			match(TAB);
			setState(2631);
			match(WORD);
			setState(2632);
			match(WORD);
			setState(2633);
			match(WORD);
			setState(2634);
			match(TAB);
			setState(2635);
			match(WORD);
			setState(2636);
			match(TAB);
			setState(2637);
			match(WORD);
			setState(2638);
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
		enterRule(_localctx, 26, RULE_crawlDividendHistoryCompanyThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2640);
			match(KEYWORD);
			setState(2641);
			match(TAB);
			setState(2642);
			match(WORD);
			setState(2643);
			match(TAB);
			setState(2644);
			match(WORD);
			setState(2645);
			match(WORD);
			setState(2646);
			match(WORD);
			setState(2647);
			match(TAB);
			setState(2648);
			match(WORD);
			setState(2649);
			match(TAB);
			setState(2650);
			match(WORD);
			setState(2651);
			match(NEWLINE);
			setState(2778); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2768); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2652);
						match(WORD);
						setState(2653);
						match(TAB);
						setState(2654);
						match(WORD);
						setState(2655);
						match(NEWLINE);
						setState(2656);
						match(WORD);
						setState(2657);
						match(TAB);
						setState(2658);
						match(WORD);
						setState(2659);
						match(NEWLINE);
						setState(2660);
						match(WORD);
						setState(2661);
						match(TAB);
						setState(2662);
						match(WORD);
						setState(2663);
						match(TAB);
						setState(2664);
						match(WORD);
						setState(2665);
						match(TAB);
						setState(2666);
						match(WORD);
						setState(2667);
						match(TAB);
						setState(2668);
						match(WORD);
						setState(2669);
						match(TAB);
						setState(2670);
						match(WORD);
						setState(2671);
						match(TAB);
						setState(2672);
						match(WORD);
						setState(2673);
						match(TAB);
						setState(2674);
						match(WORD);
						setState(2675);
						match(TAB);
						setState(2676);
						match(WORD);
						setState(2677);
						match(TAB);
						setState(2678);
						match(WORD);
						setState(2679);
						match(TAB);
						setState(2680);
						match(WORD);
						setState(2681);
						match(TAB);
						setState(2682);
						match(WORD);
						setState(2683);
						match(TAB);
						setState(2684);
						match(NEWLINE);
						setState(2685);
						match(WORD);
						setState(2686);
						match(TAB);
						setState(2687);
						match(WORD);
						setState(2688);
						match(TAB);
						setState(2689);
						match(WORD);
						setState(2690);
						match(TAB);
						setState(2691);
						match(WORD);
						setState(2692);
						match(TAB);
						setState(2693);
						match(WORD);
						setState(2694);
						match(TAB);
						setState(2695);
						match(WORD);
						setState(2696);
						match(TAB);
						setState(2697);
						match(NEWLINE);
						setState(2764); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(2764);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case TAB:
								{
								{
								setState(2698);
								match(TAB);
								setState(2699);
								match(TAB);
								setState(2700);
								match(TAB);
								setState(2701);
								match(TAB);
								setState(2702);
								match(TAB);
								setState(2703);
								match(TAB);
								setState(2704);
								match(TAB);
								setState(2705);
								match(TAB);
								setState(2706);
								match(TAB);
								setState(2707);
								match(TAB);
								setState(2708);
								match(TAB);
								setState(2709);
								match(TAB);
								setState(2710);
								match(TAB);
								setState(2711);
								match(TAB);
								setState(2712);
								match(TAB);
								setState(2713);
								match(TAB);
								setState(2714);
								match(TAB);
								setState(2715);
								match(NEWLINE);
								}
								}
								break;
							case DATE:
								{
								{
								setState(2716);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).base = match(DATE);
								setState(2717);
								match(TAB);
								setState(2719);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(2718);
									((CrawlDividendHistoryCompanyThreadContext)_localctx).pay = match(DATE);
									}
								}

								setState(2721);
								match(TAB);
								setState(2723);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(2722);
									match(DATE);
									}
								}

								setState(2725);
								match(TAB);
								setState(2726);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).code = match(NUMBER);
								setState(2727);
								match(TAB);
								setState(2729); 
								_errHandler.sync(this);
								_la = _input.LA(1);
								do {
									{
									{
									setState(2728);
									((CrawlDividendHistoryCompanyThreadContext)_localctx).symbol = word();
									}
									}
									setState(2731); 
									_errHandler.sync(this);
									_la = _input.LA(1);
								} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
								setState(2733);
								match(TAB);
								setState(2734);
								match(WORD);
								setState(2735);
								match(TAB);
								setState(2736);
								match(WORD);
								setState(2737);
								match(TAB);
								setState(2738);
								match(WORD);
								setState(2739);
								match(TAB);
								setState(2740);
								match(WORD);
								setState(2741);
								match(TAB);
								setState(2742);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).dividend = match(NUMBER);
								setState(2743);
								match(TAB);
								setState(2745);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(2744);
									match(NUMBER);
									}
								}

								setState(2747);
								match(TAB);
								setState(2748);
								match(NUMBER);
								setState(2749);
								match(TAB);
								setState(2750);
								match(NUMBER);
								setState(2751);
								match(TAB);
								setState(2753);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(2752);
									match(NUMBER);
									}
								}

								setState(2755);
								match(TAB);
								setState(2756);
								match(TAB);
								setState(2757);
								match(NUMBER);
								setState(2758);
								match(TAB);
								setState(2759);
								match(NUMBER);
								setState(2760);
								match(TAB);
								setState(2761);
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
							setState(2766); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2770); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2772);
				match(WORD);
				setState(2773);
				match(TAB);
				setState(2774);
				match(WORD);
				setState(2775);
				match(TAB);
				setState(2776);
				match(DATE);
				setState(2777);
				match(NEWLINE);
				}
				}
				setState(2780); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(2782);
			match(KEYWORD);
			setState(2783);
			match(TAB);
			setState(2784);
			match(WORD);
			setState(2785);
			match(TAB);
			setState(2786);
			match(WORD);
			setState(2787);
			match(WORD);
			setState(2788);
			match(WORD);
			setState(2789);
			match(TAB);
			setState(2790);
			match(WORD);
			setState(2791);
			match(TAB);
			setState(2792);
			match(WORD);
			setState(2793);
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
		enterRule(_localctx, 28, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2795);
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
		enterRule(_localctx, 30, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2799); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(2799);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(2797);
					word();
					}
					break;
				case TAB:
					{
					setState(2798);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2801); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(2803);
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
		enterRule(_localctx, 32, RULE_eof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2808); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(2808);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(2805);
					word();
					}
					break;
				case TAB:
					{
					setState(2806);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(2807);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2810); 
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

	private static final String _serializedATNSegment0 =
		"\u0004\u0001\n\u0afd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u00000\b\u0000\u0001\u0001"+
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
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"\u00b6\b\u0001\u000b\u0001\f\u0001\u00b7\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00c0\b\u0001\u0001"+
		"\u0001\u0003\u0001\u00c3\b\u0001\u0001\u0001\u0003\u0001\u00c6\b\u0001"+
		"\u0001\u0001\u0003\u0001\u00c9\b\u0001\u0001\u0001\u0003\u0001\u00cc\b"+
		"\u0001\u0001\u0001\u0003\u0001\u00cf\b\u0001\u0001\u0001\u0005\u0001\u00d2"+
		"\b\u0001\n\u0001\f\u0001\u00d5\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u00de\b\u0001"+
		"\u000b\u0001\f\u0001\u00df\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u00ea\b\u0001"+
		"\u000b\u0001\f\u0001\u00eb\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001\u00f2\b\u0001\u000b\u0001\f\u0001\u00f3\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u00fa\b\u0001\u000b\u0001\f"+
		"\u0001\u00fb\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001\u011b\b\u0001\u000b\u0001\f\u0001\u011c\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u0131"+
		"\b\u0001\u000b\u0001\f\u0001\u0132\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u013c\b\u0001"+
		"\u000b\u0001\f\u0001\u013d\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u02a3\b\u0002\u000b\u0002"+
		"\f\u0002\u02a4\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u02ae\b\u0002\u0001\u0002\u0003\u0002"+
		"\u02b1\b\u0002\u0001\u0002\u0003\u0002\u02b4\b\u0002\u0001\u0002\u0003"+
		"\u0002\u02b7\b\u0002\u0001\u0002\u0003\u0002\u02ba\b\u0002\u0001\u0002"+
		"\u0003\u0002\u02bd\b\u0002\u0001\u0002\u0005\u0002\u02c0\b\u0002\n\u0002"+
		"\f\u0002\u02c3\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0004\u0002\u02cb\b\u0002\u000b\u0002\f\u0002"+
		"\u02cc\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002\u02e6\b\u0002\n\u0002\f\u0002\u02e9\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u02f3\b\u0002\n\u0002\f\u0002\u02f6\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u030a"+
		"\b\u0002\u000b\u0002\f\u0002\u030b\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u0315\b\u0002"+
		"\u000b\u0002\f\u0002\u0316\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u036c\b\u0003\u0001\u0003\u0003\u0003\u036f\b"+
		"\u0003\u0001\u0003\u0003\u0003\u0372\b\u0003\u0001\u0003\u0003\u0003\u0375"+
		"\b\u0003\u0001\u0003\u0003\u0003\u0378\b\u0003\u0001\u0003\u0003\u0003"+
		"\u037b\b\u0003\u0001\u0003\u0005\u0003\u037e\b\u0003\n\u0003\f\u0003\u0381"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0004\u0003\u03d1\b\u0003\u000b\u0003\f\u0003\u03d2\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u03f6\b\u0003\u0001\u0003\u0003\u0003"+
		"\u03f9\b\u0003\u0001\u0003\u0003\u0003\u03fc\b\u0003\u0001\u0003\u0003"+
		"\u0003\u03ff\b\u0003\u0001\u0003\u0003\u0003\u0402\b\u0003\u0001\u0003"+
		"\u0003\u0003\u0405\b\u0003\u0001\u0003\u0005\u0003\u0408\b\u0003\n\u0003"+
		"\f\u0003\u040b\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0004\u0003\u041d\b\u0003\u000b\u0003\f\u0003\u041e\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004"+
		"\u0003\u0428\b\u0003\u000b\u0003\f\u0003\u0429\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u057f\b\u0004\u0001\u0004\u0003\u0004\u0582\b"+
		"\u0004\u0001\u0004\u0003\u0004\u0585\b\u0004\u0001\u0004\u0003\u0004\u0588"+
		"\b\u0004\u0001\u0004\u0003\u0004\u058b\b\u0004\u0001\u0004\u0003\u0004"+
		"\u058e\b\u0004\u0001\u0004\u0005\u0004\u0591\b\u0004\n\u0004\f\u0004\u0594"+
		"\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u059d\b\u0004\n\u0004\f\u0004\u05a0\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u05a8\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u05f5\b\u0004\u0001\u0004\u0003\u0004\u05f8\b\u0004\u0001\u0004\u0003"+
		"\u0004\u05fb\b\u0004\u0001\u0004\u0003\u0004\u05fe\b\u0004\u0001\u0004"+
		"\u0003\u0004\u0601\b\u0004\u0001\u0004\u0003\u0004\u0604\b\u0004\u0001"+
		"\u0004\u0005\u0004\u0607\b\u0004\n\u0004\f\u0004\u060a\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u061c\b\u0004\u000b\u0004"+
		"\f\u0004\u061d\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004\u0627\b\u0004\u000b\u0004\f\u0004"+
		"\u0628\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004"+
		"\u0005\u067e\b\u0005\u000b\u0005\f\u0005\u067f\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u06c9\b\u0005\u0001\u0005"+
		"\u0003\u0005\u06cc\b\u0005\u0001\u0005\u0003\u0005\u06cf\b\u0005\u0001"+
		"\u0005\u0003\u0005\u06d2\b\u0005\u0001\u0005\u0003\u0005\u06d5\b\u0005"+
		"\u0001\u0005\u0003\u0005\u06d8\b\u0005\u0001\u0005\u0005\u0005\u06db\b"+
		"\u0005\n\u0005\f\u0005\u06de\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0004\u0005\u06ea\b\u0005\u000b\u0005\f\u0005\u06eb\u0003"+
		"\u0005\u06ee\b\u0005\u0004\u0005\u06f0\b\u0005\u000b\u0005\f\u0005\u06f1"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0004\u0005\u06fa\b\u0005\u000b\u0005\f\u0005\u06fb\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u073a"+
		"\b\u0006\u0001\u0006\u0003\u0006\u073d\b\u0006\u0001\u0006\u0003\u0006"+
		"\u0740\b\u0006\u0001\u0006\u0003\u0006\u0743\b\u0006\u0001\u0006\u0003"+
		"\u0006\u0746\b\u0006\u0001\u0006\u0003\u0006\u0749\b\u0006\u0001\u0006"+
		"\u0005\u0006\u074c\b\u0006\n\u0006\f\u0006\u074f\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0756\b\u0006\u0001"+
		"\u0006\u0003\u0006\u0759\b\u0006\u0001\u0006\u0003\u0006\u075c\b\u0006"+
		"\u0001\u0006\u0003\u0006\u075f\b\u0006\u0001\u0006\u0003\u0006\u0762\b"+
		"\u0006\u0001\u0006\u0003\u0006\u0765\b\u0006\u0001\u0006\u0005\u0006\u0768"+
		"\b\u0006\n\u0006\f\u0006\u076b\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0777\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0780\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0004\u0006\u0788\b\u0006\u000b\u0006\f\u0006\u0789\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004"+
		"\u0006\u0793\b\u0006\u000b\u0006\f\u0006\u0794\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0004\u0007\u07b2\b\u0007\u000b\u0007\f\u0007\u07b3\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u07bb"+
		"\b\u0007\u0001\u0007\u0003\u0007\u07be\b\u0007\u0001\u0007\u0003\u0007"+
		"\u07c1\b\u0007\u0001\u0007\u0003\u0007\u07c4\b\u0007\u0001\u0007\u0003"+
		"\u0007\u07c7\b\u0007\u0001\u0007\u0003\u0007\u07ca\b\u0007\u0001\u0007"+
		"\u0005\u0007\u07cd\b\u0007\n\u0007\f\u0007\u07d0\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u07d7\b\u0007\u0001"+
		"\u0007\u0003\u0007\u07da\b\u0007\u0001\u0007\u0003\u0007\u07dd\b\u0007"+
		"\u0001\u0007\u0003\u0007\u07e0\b\u0007\u0001\u0007\u0003\u0007\u07e3\b"+
		"\u0007\u0001\u0007\u0003\u0007\u07e6\b\u0007\u0001\u0007\u0005\u0007\u07e9"+
		"\b\u0007\n\u0007\f\u0007\u07ec\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0810\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0814\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0818\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u081c\b\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0820\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0828\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0004\u0007\u082d\b\u0007\u000b\u0007\f\u0007\u082e\u0004\u0007"+
		"\u0831\b\u0007\u000b\u0007\f\u0007\u0832\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u083c"+
		"\b\u0007\u000b\u0007\f\u0007\u083d\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0004\b\u085a\b\b\u000b\b\f\b\u085b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0004\b\u0886\b\b\u000b\b\f\b\u0887\u0004\b\u088a\b\b\u000b\b\f\b\u088b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u0895"+
		"\b\b\u000b\b\f\b\u0896\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u08b8"+
		"\b\t\u0001\t\u0003\t\u08bb\b\t\u0001\t\u0003\t\u08be\b\t\u0001\t\u0003"+
		"\t\u08c1\b\t\u0001\t\u0003\t\u08c4\b\t\u0001\t\u0003\t\u08c7\b\t\u0001"+
		"\t\u0005\t\u08ca\b\t\n\t\f\t\u08cd\t\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u08e9\b\t\u000b\t\f\t\u08ea"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0924\b\n\u0001\n\u0001\n\u0004\n\u0928\b\n\u000b\n"+
		"\f\n\u0929\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0004\n\u093e\b\n\u000b\n\f\n\u093f\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u0949\b\n\u000b\n\f\n\u094a\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0968\b\u000b"+
		"\n\u000b\f\u000b\u096b\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0970\b\u000b\u0001\u000b\u0003\u000b\u0973\b\u000b\u0001\u000b"+
		"\u0003\u000b\u0976\b\u000b\u0001\u000b\u0003\u000b\u0979\b\u000b\u0001"+
		"\u000b\u0003\u000b\u097c\b\u000b\u0001\u000b\u0003\u000b\u097f\b\u000b"+
		"\u0001\u000b\u0005\u000b\u0982\b\u000b\n\u000b\f\u000b\u0985\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u098a\b\u000b\u0001\u000b\u0003"+
		"\u000b\u098d\b\u000b\u0001\u000b\u0003\u000b\u0990\b\u000b\u0001\u000b"+
		"\u0003\u000b\u0993\b\u000b\u0001\u000b\u0003\u000b\u0996\b\u000b\u0001"+
		"\u000b\u0003\u000b\u0999\b\u000b\u0001\u000b\u0005\u000b\u099c\b\u000b"+
		"\n\u000b\f\u000b\u099f\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u09a4\b\u000b\n\u000b\f\u000b\u09a7\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u09b4\b\u000b\u000b\u000b"+
		"\f\u000b\u09b5\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u09d7\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u09f8"+
		"\b\f\u0001\f\u0003\f\u09fb\b\f\u0001\f\u0003\f\u09fe\b\f\u0001\f\u0003"+
		"\f\u0a01\b\f\u0001\f\u0003\f\u0a04\b\f\u0001\f\u0003\f\u0a07\b\f\u0001"+
		"\f\u0005\f\u0a0a\b\f\n\f\f\f\u0a0d\t\f\u0001\f\u0001\f\u0003\f\u0a11\b"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0a17\b\f\n\f\f\f\u0a1a\t\f"+
		"\u0001\f\u0001\f\u0003\f\u0a1e\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0a24\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0a2a\b\f\u0001\f"+
		"\u0001\f\u0003\f\u0a2e\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u0a34"+
		"\b\f\u000b\f\f\f\u0a35\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0004\f\u0a3e\b\f\u000b\f\f\f\u0a3f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u0aa0\b\r\u0001\r\u0001\r\u0003\r\u0aa4\b\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0004\r\u0aaa\b\r\u000b\r\f\r\u0aab\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u0aba\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0ac2"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0004\r\u0acd\b\r\u000b\r\f\r\u0ace\u0004\r\u0ad1\b\r\u000b\r\f\r\u0ad2"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u0adb\b\r\u000b"+
		"\r\f\r\u0adc\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0004\u000f\u0af0\b\u000f\u000b\u000f\f\u000f\u0af1"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010"+
		"\u0af9\b\u0010\u000b\u0010\f\u0010\u0afa\u0001\u0010\u0000\u0000\u0011"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \u0000\u0001\u0001\u0000\u0005\n\u0bb1\u0000/\u0001\u0000"+
		"\u0000\u0000\u00021\u0001\u0000\u0000\u0000\u0004\u014d\u0001\u0000\u0000"+
		"\u0000\u0006\u0326\u0001\u0000\u0000\u0000\b\u0437\u0001\u0000\u0000\u0000"+
		"\n\u0638\u0001\u0000\u0000\u0000\f\u0706\u0001\u0000\u0000\u0000\u000e"+
		"\u07a3\u0001\u0000\u0000\u0000\u0010\u084b\u0001\u0000\u0000\u0000\u0012"+
		"\u08a4\u0001\u0000\u0000\u0000\u0014\u08f8\u0001\u0000\u0000\u0000\u0016"+
		"\u0959\u0001\u0000\u0000\u0000\u0018\u09c1\u0001\u0000\u0000\u0000\u001a"+
		"\u0a50\u0001\u0000\u0000\u0000\u001c\u0aeb\u0001\u0000\u0000\u0000\u001e"+
		"\u0aef\u0001\u0000\u0000\u0000 \u0af8\u0001\u0000\u0000\u0000\"0\u0003"+
		"\u001a\r\u0000#0\u0003\u0018\f\u0000$0\u0003\u0014\n\u0000%0\u0003\f\u0006"+
		"\u0000&0\u0003\u0012\t\u0000\'0\u0003\u0016\u000b\u0000(0\u0003\u0010"+
		"\b\u0000)0\u0003\u000e\u0007\u0000*0\u0003\n\u0005\u0000+0\u0003\b\u0004"+
		"\u0000,0\u0003\u0006\u0003\u0000-0\u0003\u0004\u0002\u0000.0\u0003\u0002"+
		"\u0001\u0000/\"\u0001\u0000\u0000\u0000/#\u0001\u0000\u0000\u0000/$\u0001"+
		"\u0000\u0000\u0000/%\u0001\u0000\u0000\u0000/&\u0001\u0000\u0000\u0000"+
		"/\'\u0001\u0000\u0000\u0000/(\u0001\u0000\u0000\u0000/)\u0001\u0000\u0000"+
		"\u0000/*\u0001\u0000\u0000\u0000/+\u0001\u0000\u0000\u0000/,\u0001\u0000"+
		"\u0000\u0000/-\u0001\u0000\u0000\u0000/.\u0001\u0000\u0000\u00000\u0001"+
		"\u0001\u0000\u0000\u000012\u0005\u0005\u0000\u000023\u0005\u0003\u0000"+
		"\u000034\u0005\n\u0000\u000045\u0005\u0003\u0000\u000056\u0005\n\u0000"+
		"\u000067\u0005\n\u0000\u000078\u0005\n\u0000\u000089\u0005\n\u0000\u0000"+
		"9:\u0005\n\u0000\u0000:;\u0005\n\u0000\u0000;<\u0005\u0003\u0000\u0000"+
		"<=\u0005\n\u0000\u0000=\u013b\u0005\u0004\u0000\u0000>?\u0005\n\u0000"+
		"\u0000?@\u0005\u0003\u0000\u0000@A\u0005\u0004\u0000\u0000AB\u0005\n\u0000"+
		"\u0000BC\u0005\u0003\u0000\u0000CD\u0005\u0003\u0000\u0000DE\u0005\u0003"+
		"\u0000\u0000EF\u0005\u0004\u0000\u0000FG\u0005\n\u0000\u0000GH\u0005\u0003"+
		"\u0000\u0000HI\u0005\u0003\u0000\u0000IJ\u0005\u0003\u0000\u0000JK\u0005"+
		"\u0004\u0000\u0000KL\u0005\n\u0000\u0000LM\u0005\u0003\u0000\u0000MN\u0005"+
		"\u0003\u0000\u0000NO\u0005\u0003\u0000\u0000OP\u0005\u0004\u0000\u0000"+
		"PQ\u0005\n\u0000\u0000QR\u0005\u0003\u0000\u0000RS\u0005\u0003\u0000\u0000"+
		"ST\u0005\u0003\u0000\u0000TU\u0005\u0004\u0000\u0000UV\u0005\n\u0000\u0000"+
		"VW\u0005\u0003\u0000\u0000WX\u0005\u0003\u0000\u0000XY\u0005\u0003\u0000"+
		"\u0000YZ\u0005\u0004\u0000\u0000Z[\u0005\n\u0000\u0000[\\\u0005\u0003"+
		"\u0000\u0000\\]\u0005\u0003\u0000\u0000]^\u0005\u0003\u0000\u0000^_\u0005"+
		"\u0004\u0000\u0000_`\u0005\n\u0000\u0000`a\u0005\u0003\u0000\u0000ab\u0005"+
		"\u0003\u0000\u0000bc\u0005\u0003\u0000\u0000cd\u0005\u0004\u0000\u0000"+
		"de\u0005\n\u0000\u0000ef\u0005\u0003\u0000\u0000fg\u0005\u0003\u0000\u0000"+
		"gh\u0005\u0003\u0000\u0000hi\u0005\u0004\u0000\u0000ij\u0005\n\u0000\u0000"+
		"jk\u0005\u0003\u0000\u0000kl\u0005\u0003\u0000\u0000lm\u0005\u0003\u0000"+
		"\u0000mn\u0005\u0004\u0000\u0000no\u0005\n\u0000\u0000op\u0005\u0003\u0000"+
		"\u0000pq\u0005\u0003\u0000\u0000qr\u0005\u0003\u0000\u0000rs\u0005\u0004"+
		"\u0000\u0000st\u0005\n\u0000\u0000tu\u0005\u0003\u0000\u0000uv\u0005\u0003"+
		"\u0000\u0000vw\u0005\u0003\u0000\u0000wx\u0005\u0004\u0000\u0000xy\u0005"+
		"\n\u0000\u0000yz\u0005\u0003\u0000\u0000z{\u0005\u0003\u0000\u0000{|\u0005"+
		"\u0003\u0000\u0000|}\u0005\u0004\u0000\u0000}~\u0005\n\u0000\u0000~\u007f"+
		"\u0005\u0003\u0000\u0000\u007f\u0080\u0005\u0003\u0000\u0000\u0080\u0081"+
		"\u0005\u0003\u0000\u0000\u0081\u0082\u0005\u0004\u0000\u0000\u0082\u0083"+
		"\u0005\n\u0000\u0000\u0083\u0084\u0005\u0003\u0000\u0000\u0084\u0085\u0005"+
		"\u0003\u0000\u0000\u0085\u0086\u0005\u0003\u0000\u0000\u0086\u0087\u0005"+
		"\u0004\u0000\u0000\u0087\u0088\u0005\n\u0000\u0000\u0088\u0089\u0005\u0003"+
		"\u0000\u0000\u0089\u008a\u0005\u0003\u0000\u0000\u008a\u008b\u0005\u0003"+
		"\u0000\u0000\u008b\u008c\u0005\u0004\u0000\u0000\u008c\u008d\u0005\n\u0000"+
		"\u0000\u008d\u008e\u0005\u0003\u0000\u0000\u008e\u008f\u0005\u0003\u0000"+
		"\u0000\u008f\u0090\u0005\u0003\u0000\u0000\u0090\u0091\u0005\u0004\u0000"+
		"\u0000\u0091\u0092\u0005\n\u0000\u0000\u0092\u0093\u0005\u0003\u0000\u0000"+
		"\u0093\u0094\u0005\u0003\u0000\u0000\u0094\u0095\u0005\u0003\u0000\u0000"+
		"\u0095\u0096\u0005\u0004\u0000\u0000\u0096\u0097\u0005\n\u0000\u0000\u0097"+
		"\u0098\u0005\u0003\u0000\u0000\u0098\u0099\u0005\u0003\u0000\u0000\u0099"+
		"\u009a\u0005\u0003\u0000\u0000\u009a\u009b\u0005\u0004\u0000\u0000\u009b"+
		"\u009c\u0005\n\u0000\u0000\u009c\u009d\u0005\u0003\u0000\u0000\u009d\u009e"+
		"\u0005\u0003\u0000\u0000\u009e\u009f\u0005\u0003\u0000\u0000\u009f\u00a0"+
		"\u0005\n\u0000\u0000\u00a0\u00a1\u0005\u0004\u0000\u0000\u00a1\u00a2\u0005"+
		"\n\u0000\u0000\u00a2\u00a3\u0005\u0003\u0000\u0000\u00a3\u00a4\u0005\u0003"+
		"\u0000\u0000\u00a4\u00a5\u0005\u0003\u0000\u0000\u00a5\u0130\u0005\u0004"+
		"\u0000\u0000\u00a6\u00a7\u0005\n\u0000\u0000\u00a7\u00a8\u0005\u0003\u0000"+
		"\u0000\u00a8\u00a9\u0005\n\u0000\u0000\u00a9\u00aa\u0005\u0004\u0000\u0000"+
		"\u00aa\u00ab\u0005\n\u0000\u0000\u00ab\u00ac\u0005\u0003\u0000\u0000\u00ac"+
		"\u00ad\u0003\u001c\u000e\u0000\u00ad\u00ae\u0005\u0004\u0000\u0000\u00ae"+
		"\u00af\u0005\n\u0000\u0000\u00af\u00b0\u0005\u0003\u0000\u0000\u00b0\u00b1"+
		"\u0005\u0004\u0000\u0000\u00b1\u00b2\u0005\n\u0000\u0000\u00b2\u00b3\u0005"+
		"\u0003\u0000\u0000\u00b3\u00b5\u0005\u0003\u0000\u0000\u00b4\u00b6\u0003"+
		"\u001c\u000e\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005"+
		"\u0004\u0000\u0000\u00ba\u00bb\u0005\n\u0000\u0000\u00bb\u00bc\u0005\u0003"+
		"\u0000\u0000\u00bc\u00bd\u0005\u0003\u0000\u0000\u00bd\u00bf\u0003\u001c"+
		"\u000e\u0000\u00be\u00c0\u0003\u001c\u000e\u0000\u00bf\u00be\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c3\u0003\u001c\u000e\u0000\u00c2\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c6\u0003\u001c\u000e\u0000\u00c5\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c9\u0003\u001c\u000e\u0000\u00c8\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cc\u0003\u001c\u000e\u0000\u00cb\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ce\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cf\u0003\u001c\u000e\u0000\u00ce\u00cd\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d2\u0003\u001c\u000e\u0000\u00d1\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0004"+
		"\u0000\u0000\u00d7\u00d8\u0005\n\u0000\u0000\u00d8\u00d9\u0005\u0003\u0000"+
		"\u0000\u00d9\u00da\u0005\u0004\u0000\u0000\u00da\u00db\u0005\n\u0000\u0000"+
		"\u00db\u00dd\u0005\u0003\u0000\u0000\u00dc\u00de\u0003\u001c\u000e\u0000"+
		"\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000"+
		"\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u0004\u0000\u0000"+
		"\u00e2\u00e3\u0005\n\u0000\u0000\u00e3\u00e4\u0005\u0003\u0000\u0000\u00e4"+
		"\u00e5\u0005\u0006\u0000\u0000\u00e5\u00e6\u0005\u0004\u0000\u0000\u00e6"+
		"\u00e7\u0005\n\u0000\u0000\u00e7\u00e9\u0005\u0003\u0000\u0000\u00e8\u00ea"+
		"\u0003\u001c\u000e\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0005\u0004\u0000\u0000\u00ee\u00ef\u0005\n\u0000\u0000\u00ef\u00f1\u0005"+
		"\u0003\u0000\u0000\u00f0\u00f2\u0003\u001c\u000e\u0000\u00f1\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0005\u0004\u0000\u0000\u00f6\u00f7\u0005"+
		"\n\u0000\u0000\u00f7\u00f9\u0005\u0003\u0000\u0000\u00f8\u00fa\u0003\u001c"+
		"\u000e\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u0004"+
		"\u0000\u0000\u00fe\u00ff\u0005\n\u0000\u0000\u00ff\u0100\u0005\u0003\u0000"+
		"\u0000\u0100\u0101\u0005\n\u0000\u0000\u0101\u0102\u0005\u0004\u0000\u0000"+
		"\u0102\u0103\u0005\n\u0000\u0000\u0103\u0104\u0005\u0003\u0000\u0000\u0104"+
		"\u0105\u0005\u0004\u0000\u0000\u0105\u0106\u0005\n\u0000\u0000\u0106\u0107"+
		"\u0005\u0003\u0000\u0000\u0107\u0108\u0005\u0003\u0000\u0000\u0108\u0109"+
		"\u0005\n\u0000\u0000\u0109\u010a\u0005\u0004\u0000\u0000\u010a\u010b\u0005"+
		"\n\u0000\u0000\u010b\u010c\u0005\u0003\u0000\u0000\u010c\u010d\u0005\u0003"+
		"\u0000\u0000\u010d\u010e\u0005\n\u0000\u0000\u010e\u010f\u0005\u0004\u0000"+
		"\u0000\u010f\u0110\u0005\n\u0000\u0000\u0110\u0111\u0005\u0003\u0000\u0000"+
		"\u0111\u0112\u0005\u0003\u0000\u0000\u0112\u0113\u0005\u0004\u0000\u0000"+
		"\u0113\u0114\u0005\n\u0000\u0000\u0114\u0115\u0005\u0003\u0000\u0000\u0115"+
		"\u0116\u0005\b\u0000\u0000\u0116\u0117\u0005\u0004\u0000\u0000\u0117\u0118"+
		"\u0005\n\u0000\u0000\u0118\u011a\u0005\u0003\u0000\u0000\u0119\u011b\u0003"+
		"\u001c\u000e\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011f\u0005"+
		"\u0004\u0000\u0000\u011f\u0120\u0005\n\u0000\u0000\u0120\u0121\u0005\u0003"+
		"\u0000\u0000\u0121\u0122\u0005\b\u0000\u0000\u0122\u0123\u0005\u0004\u0000"+
		"\u0000\u0123\u0124\u0005\n\u0000\u0000\u0124\u0125\u0005\u0003\u0000\u0000"+
		"\u0125\u0126\u0005\b\u0000\u0000\u0126\u0127\u0005\u0004\u0000\u0000\u0127"+
		"\u0128\u0005\n\u0000\u0000\u0128\u0129\u0005\u0003\u0000\u0000\u0129\u012a"+
		"\u0005\n\u0000\u0000\u012a\u012b\u0005\u0004\u0000\u0000\u012b\u012c\u0005"+
		"\n\u0000\u0000\u012c\u012d\u0005\u0003\u0000\u0000\u012d\u012e\u0005\u0004"+
		"\u0000\u0000\u012e\u012f\u0006\u0001\uffff\uffff\u0000\u012f\u0131\u0001"+
		"\u0000\u0000\u0000\u0130\u00a6\u0001\u0000\u0000\u0000\u0131\u0132\u0001"+
		"\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0005"+
		"\n\u0000\u0000\u0135\u0136\u0005\u0003\u0000\u0000\u0136\u0137\u0005\n"+
		"\u0000\u0000\u0137\u0138\u0005\u0003\u0000\u0000\u0138\u0139\u0005\u0006"+
		"\u0000\u0000\u0139\u013a\u0005\u0004\u0000\u0000\u013a\u013c\u0001\u0000"+
		"\u0000\u0000\u013b>\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000"+
		"\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000"+
		"\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u0005\u0000"+
		"\u0000\u0140\u0141\u0005\u0003\u0000\u0000\u0141\u0142\u0005\n\u0000\u0000"+
		"\u0142\u0143\u0005\u0003\u0000\u0000\u0143\u0144\u0005\n\u0000\u0000\u0144"+
		"\u0145\u0005\n\u0000\u0000\u0145\u0146\u0005\n\u0000\u0000\u0146\u0147"+
		"\u0005\n\u0000\u0000\u0147\u0148\u0005\n\u0000\u0000\u0148\u0149\u0005"+
		"\n\u0000\u0000\u0149\u014a\u0005\u0003\u0000\u0000\u014a\u014b\u0005\n"+
		"\u0000\u0000\u014b\u014c\u0005\u0004\u0000\u0000\u014c\u0003\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0005\u0005\u0000\u0000\u014e\u014f\u0005\u0003"+
		"\u0000\u0000\u014f\u0150\u0005\n\u0000\u0000\u0150\u0151\u0005\u0003\u0000"+
		"\u0000\u0151\u0152\u0005\n\u0000\u0000\u0152\u0153\u0005\n\u0000\u0000"+
		"\u0153\u0154\u0005\n\u0000\u0000\u0154\u0155\u0005\n\u0000\u0000\u0155"+
		"\u0156\u0005\n\u0000\u0000\u0156\u0157\u0005\n\u0000\u0000\u0157\u0158"+
		"\u0005\u0003\u0000\u0000\u0158\u0159\u0005\n\u0000\u0000\u0159\u0314\u0005"+
		"\u0004\u0000\u0000\u015a\u015b\u0005\u0005\u0000\u0000\u015b\u015c\u0005"+
		"\u0003\u0000\u0000\u015c\u015d\u0005\u0004\u0000\u0000\u015d\u015e\u0005"+
		"\u0005\u0000\u0000\u015e\u015f\u0005\u0003\u0000\u0000\u015f\u0160\u0005"+
		"\u0004\u0000\u0000\u0160\u0161\u0005\u0005\u0000\u0000\u0161\u0162\u0005"+
		"\u0003\u0000\u0000\u0162\u0163\u0005\u0004\u0000\u0000\u0163\u0164\u0005"+
		"\u0005\u0000\u0000\u0164\u0165\u0005\u0003\u0000\u0000\u0165\u0166\u0005"+
		"\u0004\u0000\u0000\u0166\u0167\u0005\u0005\u0000\u0000\u0167\u0168\u0005"+
		"\u0003\u0000\u0000\u0168\u0169\u0005\u0003\u0000\u0000\u0169\u016a\u0005"+
		"\u0003\u0000\u0000\u016a\u016b\u0005\u0003\u0000\u0000\u016b\u016c\u0005"+
		"\u0003\u0000\u0000\u016c\u016d\u0005\u0004\u0000\u0000\u016d\u016e\u0005"+
		"\u0005\u0000\u0000\u016e\u016f\u0005\u0003\u0000\u0000\u016f\u0170\u0005"+
		"\u0003\u0000\u0000\u0170\u0171\u0005\u0003\u0000\u0000\u0171\u0172\u0005"+
		"\u0004\u0000\u0000\u0172\u0173\u0005\u0005\u0000\u0000\u0173\u0174\u0005"+
		"\u0003\u0000\u0000\u0174\u0175\u0005\u0003\u0000\u0000\u0175\u0176\u0005"+
		"\u0003\u0000\u0000\u0176\u0177\u0005\u0003\u0000\u0000\u0177\u0178\u0005"+
		"\u0003\u0000\u0000\u0178\u0179\u0005\u0004\u0000\u0000\u0179\u017a\u0005"+
		"\u0005\u0000\u0000\u017a\u017b\u0005\u0003\u0000\u0000\u017b\u017c\u0005"+
		"\u0003\u0000\u0000\u017c\u017d\u0005\u0003\u0000\u0000\u017d\u017e\u0005"+
		"\u0003\u0000\u0000\u017e\u017f\u0005\u0003\u0000\u0000\u017f\u0180\u0005"+
		"\u0004\u0000\u0000\u0180\u0181\u0005\u0005\u0000\u0000\u0181\u0182\u0005"+
		"\u0003\u0000\u0000\u0182\u0183\u0005\u0003\u0000\u0000\u0183\u0184\u0005"+
		"\u0003\u0000\u0000\u0184\u0185\u0005\u0003\u0000\u0000\u0185\u0186\u0005"+
		"\u0004\u0000\u0000\u0186\u0187\u0005\u0005\u0000\u0000\u0187\u0188\u0005"+
		"\u0003\u0000\u0000\u0188\u0189\u0005\u0004\u0000\u0000\u0189\u018a\u0005"+
		"\u0005\u0000\u0000\u018a\u018b\u0005\u0003\u0000\u0000\u018b\u018c\u0005"+
		"\u0003\u0000\u0000\u018c\u018d\u0005\u0003\u0000\u0000\u018d\u018e\u0005"+
		"\u0003\u0000\u0000\u018e\u018f\u0005\u0003\u0000\u0000\u018f\u0190\u0005"+
		"\u0004\u0000\u0000\u0190\u0191\u0005\u0005\u0000\u0000\u0191\u0192\u0005"+
		"\u0003\u0000\u0000\u0192\u0193\u0005\u0003\u0000\u0000\u0193\u0194\u0005"+
		"\u0003\u0000\u0000\u0194\u0195\u0005\u0003\u0000\u0000\u0195\u0196\u0005"+
		"\u0004\u0000\u0000\u0196\u0197\u0005\u0005\u0000\u0000\u0197\u0198\u0005"+
		"\u0003\u0000\u0000\u0198\u0199\u0005\u0003\u0000\u0000\u0199\u019a\u0005"+
		"\u0003\u0000\u0000\u019a\u019b\u0005\u0004\u0000\u0000\u019b\u019c\u0005"+
		"\u0005\u0000\u0000\u019c\u019d\u0005\u0003\u0000\u0000\u019d\u019e\u0005"+
		"\u0003\u0000\u0000\u019e\u019f\u0005\u0003\u0000\u0000\u019f\u01a0\u0005"+
		"\u0004\u0000\u0000\u01a0\u01a1\u0005\u0005\u0000\u0000\u01a1\u01a2\u0005"+
		"\u0003\u0000\u0000\u01a2\u01a3\u0005\u0003\u0000\u0000\u01a3\u01a4\u0005"+
		"\u0003\u0000\u0000\u01a4\u01a5\u0005\u0003\u0000\u0000\u01a5\u01a6\u0005"+
		"\u0003\u0000\u0000\u01a6\u01a7\u0005\u0004\u0000\u0000\u01a7\u01a8\u0005"+
		"\u0005\u0000\u0000\u01a8\u01a9\u0005\u0003\u0000\u0000\u01a9\u01aa\u0005"+
		"\u0003\u0000\u0000\u01aa\u01ab\u0005\u0003\u0000\u0000\u01ab\u01ac\u0005"+
		"\u0003\u0000\u0000\u01ac\u01ad\u0005\u0003\u0000\u0000\u01ad\u01ae\u0005"+
		"\u0004\u0000\u0000\u01ae\u01af\u0005\u0005\u0000\u0000\u01af\u01b0\u0005"+
		"\u0003\u0000\u0000\u01b0\u01b1\u0005\u0003\u0000\u0000\u01b1\u01b2\u0005"+
		"\u0004\u0000\u0000\u01b2\u01b3\u0005\u0005\u0000\u0000\u01b3\u01b4\u0005"+
		"\u0003\u0000\u0000\u01b4\u01b5\u0005\u0004\u0000\u0000\u01b5\u01b6\u0005"+
		"\u0005\u0000\u0000\u01b6\u01b7\u0005\u0003\u0000\u0000\u01b7\u01b8\u0005"+
		"\u0003\u0000\u0000\u01b8\u01b9\u0005\u0003\u0000\u0000\u01b9\u01ba\u0005"+
		"\u0003\u0000\u0000\u01ba\u01bb\u0005\u0003\u0000\u0000\u01bb\u01bc\u0005"+
		"\u0004\u0000\u0000\u01bc\u01bd\u0005\u0005\u0000\u0000\u01bd\u01be\u0005"+
		"\u0003\u0000\u0000\u01be\u01bf\u0005\u0003\u0000\u0000\u01bf\u01c0\u0005"+
		"\u0003\u0000\u0000\u01c0\u01c1\u0005\u0004\u0000\u0000\u01c1\u01c2\u0005"+
		"\u0005\u0000\u0000\u01c2\u01c3\u0005\u0003\u0000\u0000\u01c3\u01c4\u0005"+
		"\u0003\u0000\u0000\u01c4\u01c5\u0005\u0003\u0000\u0000\u01c5\u01c6\u0005"+
		"\u0003\u0000\u0000\u01c6\u01c7\u0005\u0003\u0000\u0000\u01c7\u01c8\u0005"+
		"\u0004\u0000\u0000\u01c8\u01c9\u0005\u0005\u0000\u0000\u01c9\u01ca\u0005"+
		"\u0003\u0000\u0000\u01ca\u01cb\u0005\u0003\u0000\u0000\u01cb\u01cc\u0005"+
		"\u0003\u0000\u0000\u01cc\u01cd\u0005\u0003\u0000\u0000\u01cd\u01ce\u0005"+
		"\u0003\u0000\u0000\u01ce\u01cf\u0005\u0004\u0000\u0000\u01cf\u01d0\u0005"+
		"\u0005\u0000\u0000\u01d0\u01d1\u0005\u0003\u0000\u0000\u01d1\u01d2\u0005"+
		"\u0003\u0000\u0000\u01d2\u01d3\u0005\u0003\u0000\u0000\u01d3\u01d4\u0005"+
		"\u0003\u0000\u0000\u01d4\u01d5\u0005\u0004\u0000\u0000\u01d5\u01d6\u0005"+
		"\u0005\u0000\u0000\u01d6\u01d7\u0005\u0003\u0000\u0000\u01d7\u01d8\u0005"+
		"\u0004\u0000\u0000\u01d8\u01d9\u0005\u0005\u0000\u0000\u01d9\u01da\u0005"+
		"\u0003\u0000\u0000\u01da\u01db\u0005\u0003\u0000\u0000\u01db\u01dc\u0005"+
		"\u0003\u0000\u0000\u01dc\u01dd\u0005\u0003\u0000\u0000\u01dd\u01de\u0005"+
		"\u0003\u0000\u0000\u01de\u01df\u0005\u0004\u0000\u0000\u01df\u01e0\u0005"+
		"\u0005\u0000\u0000\u01e0\u01e1\u0005\u0003\u0000\u0000\u01e1\u01e2\u0005"+
		"\u0003\u0000\u0000\u01e2\u01e3\u0005\u0003\u0000\u0000\u01e3\u01e4\u0005"+
		"\u0004\u0000\u0000\u01e4\u01e5\u0005\u0005\u0000\u0000\u01e5\u01e6\u0005"+
		"\u0003\u0000\u0000\u01e6\u01e7\u0005\u0003\u0000\u0000\u01e7\u01e8\u0005"+
		"\u0003\u0000\u0000\u01e8\u01e9\u0005\u0003\u0000\u0000\u01e9\u01ea\u0005"+
		"\u0003\u0000\u0000\u01ea\u01eb\u0005\u0004\u0000\u0000\u01eb\u01ec\u0005"+
		"\u0005\u0000\u0000\u01ec\u01ed\u0005\u0003\u0000\u0000\u01ed\u01ee\u0005"+
		"\u0003\u0000\u0000\u01ee\u01ef\u0005\u0003\u0000\u0000\u01ef\u01f0\u0005"+
		"\u0003\u0000\u0000\u01f0\u01f1\u0005\u0003\u0000\u0000\u01f1\u01f2\u0005"+
		"\u0004\u0000\u0000\u01f2\u01f3\u0005\u0005\u0000\u0000\u01f3\u01f4\u0005"+
		"\u0003\u0000\u0000\u01f4\u01f5\u0005\u0003\u0000\u0000\u01f5\u01f6\u0005"+
		"\u0003\u0000\u0000\u01f6\u01f7\u0005\u0003\u0000\u0000\u01f7\u01f8\u0005"+
		"\u0004\u0000\u0000\u01f8\u01f9\u0005\u0005\u0000\u0000\u01f9\u01fa\u0005"+
		"\u0003\u0000\u0000\u01fa\u01fb\u0005\u0004\u0000\u0000\u01fb\u01fc\u0005"+
		"\u0005\u0000\u0000\u01fc\u01fd\u0005\u0003\u0000\u0000\u01fd\u01fe\u0005"+
		"\u0003\u0000\u0000\u01fe\u01ff\u0005\u0003\u0000\u0000\u01ff\u0200\u0005"+
		"\u0003\u0000\u0000\u0200\u0201\u0005\u0003\u0000\u0000\u0201\u0202\u0005"+
		"\u0004\u0000\u0000\u0202\u0203\u0005\u0005\u0000\u0000\u0203\u0204\u0005"+
		"\u0003\u0000\u0000\u0204\u0205\u0005\u0003\u0000\u0000\u0205\u0206\u0005"+
		"\u0003\u0000\u0000\u0206\u0207\u0005\u0004\u0000\u0000\u0207\u0208\u0005"+
		"\u0005\u0000\u0000\u0208\u0209\u0005\u0003\u0000\u0000\u0209\u020a\u0005"+
		"\u0003\u0000\u0000\u020a\u020b\u0005\u0003\u0000\u0000\u020b\u020c\u0005"+
		"\u0003\u0000\u0000\u020c\u020d\u0005\u0003\u0000\u0000\u020d\u020e\u0005"+
		"\u0004\u0000\u0000\u020e\u020f\u0005\u0005\u0000\u0000\u020f\u0210\u0005"+
		"\u0003\u0000\u0000\u0210\u0211\u0005\u0003\u0000\u0000\u0211\u0212\u0005"+
		"\u0003\u0000\u0000\u0212\u0213\u0005\u0003\u0000\u0000\u0213\u0214\u0005"+
		"\u0003\u0000\u0000\u0214\u0215\u0005\u0004\u0000\u0000\u0215\u0216\u0005"+
		"\u0005\u0000\u0000\u0216\u0217\u0005\u0003\u0000\u0000\u0217\u0218\u0005"+
		"\u0003\u0000\u0000\u0218\u0219\u0005\u0003\u0000\u0000\u0219\u021a\u0005"+
		"\u0003\u0000\u0000\u021a\u021b\u0005\u0004\u0000\u0000\u021b\u021c\u0005"+
		"\u0005\u0000\u0000\u021c\u021d\u0005\u0003\u0000\u0000\u021d\u021e\u0005"+
		"\u0004\u0000\u0000\u021e\u021f\u0005\u0005\u0000\u0000\u021f\u0220\u0005"+
		"\u0003\u0000\u0000\u0220\u0221\u0005\u0004\u0000\u0000\u0221\u0222\u0005"+
		"\u0005\u0000\u0000\u0222\u0223\u0005\u0003\u0000\u0000\u0223\u0224\u0005"+
		"\u0003\u0000\u0000\u0224\u0225\u0005\u0003\u0000\u0000\u0225\u0226\u0005"+
		"\u0003\u0000\u0000\u0226\u0227\u0005\u0003\u0000\u0000\u0227\u0228\u0005"+
		"\u0004\u0000\u0000\u0228\u0229\u0005\u0005\u0000\u0000\u0229\u022a\u0005"+
		"\u0003\u0000\u0000\u022a\u022b\u0005\u0003\u0000\u0000\u022b\u022c\u0005"+
		"\u0003\u0000\u0000\u022c\u022d\u0005\u0004\u0000\u0000\u022d\u022e\u0005"+
		"\u0005\u0000\u0000\u022e\u022f\u0005\u0003\u0000\u0000\u022f\u0230\u0005"+
		"\u0003\u0000\u0000\u0230\u0231\u0005\u0003\u0000\u0000\u0231\u0232\u0005"+
		"\u0003\u0000\u0000\u0232\u0233\u0005\u0003\u0000\u0000\u0233\u0234\u0005"+
		"\u0004\u0000\u0000\u0234\u0235\u0005\u0005\u0000\u0000\u0235\u0236\u0005"+
		"\u0003\u0000\u0000\u0236\u0237\u0005\u0003\u0000\u0000\u0237\u0238\u0005"+
		"\u0003\u0000\u0000\u0238\u0239\u0005\u0003\u0000\u0000\u0239\u023a\u0005"+
		"\u0003\u0000\u0000\u023a\u023b\u0005\u0004\u0000\u0000\u023b\u023c\u0005"+
		"\u0005\u0000\u0000\u023c\u023d\u0005\u0003\u0000\u0000\u023d\u023e\u0005"+
		"\u0003\u0000\u0000\u023e\u023f\u0005\u0003\u0000\u0000\u023f\u0240\u0005"+
		"\u0003\u0000\u0000\u0240\u0241\u0005\u0004\u0000\u0000\u0241\u0242\u0005"+
		"\u0005\u0000\u0000\u0242\u0243\u0005\u0003\u0000\u0000\u0243\u0244\u0005"+
		"\u0004\u0000\u0000\u0244\u0245\u0005\u0005\u0000\u0000\u0245\u0246\u0005"+
		"\u0003\u0000\u0000\u0246\u0247\u0005\u0003\u0000\u0000\u0247\u0248\u0005"+
		"\u0003\u0000\u0000\u0248\u0249\u0005\u0003\u0000\u0000\u0249\u024a\u0005"+
		"\u0003\u0000\u0000\u024a\u024b\u0005\u0004\u0000\u0000\u024b\u024c\u0005"+
		"\u0005\u0000\u0000\u024c\u024d\u0005\u0003\u0000\u0000\u024d\u024e\u0005"+
		"\u0003\u0000\u0000\u024e\u024f\u0005\u0003\u0000\u0000\u024f\u0250\u0005"+
		"\u0004\u0000\u0000\u0250\u0251\u0005\u0005\u0000\u0000\u0251\u0252\u0005"+
		"\u0003\u0000\u0000\u0252\u0253\u0005\u0003\u0000\u0000\u0253\u0254\u0005"+
		"\u0003\u0000\u0000\u0254\u0255\u0005\u0003\u0000\u0000\u0255\u0256\u0005"+
		"\u0003\u0000\u0000\u0256\u0257\u0005\u0004\u0000\u0000\u0257\u0258\u0005"+
		"\u0005\u0000\u0000\u0258\u0259\u0005\u0003\u0000\u0000\u0259\u025a\u0005"+
		"\u0003\u0000\u0000\u025a\u025b\u0005\u0003\u0000\u0000\u025b\u025c\u0005"+
		"\u0003\u0000\u0000\u025c\u025d\u0005\u0003\u0000\u0000\u025d\u025e\u0005"+
		"\u0004\u0000\u0000\u025e\u025f\u0005\u0005\u0000\u0000\u025f\u0260\u0005"+
		"\u0003\u0000\u0000\u0260\u0261\u0005\u0003\u0000\u0000\u0261\u0262\u0005"+
		"\u0003\u0000\u0000\u0262\u0263\u0005\u0003\u0000\u0000\u0263\u0264\u0005"+
		"\u0004\u0000\u0000\u0264\u0265\u0005\u0005\u0000\u0000\u0265\u0266\u0005"+
		"\u0003\u0000\u0000\u0266\u0267\u0005\u0004\u0000\u0000\u0267\u0268\u0005"+
		"\u0005\u0000\u0000\u0268\u0269\u0005\u0003\u0000\u0000\u0269\u026a\u0005"+
		"\u0003\u0000\u0000\u026a\u026b\u0005\u0003\u0000\u0000\u026b\u026c\u0005"+
		"\u0003\u0000\u0000\u026c\u026d\u0005\u0003\u0000\u0000\u026d\u026e\u0005"+
		"\u0004\u0000\u0000\u026e\u026f\u0005\u0005\u0000\u0000\u026f\u0270\u0005"+
		"\u0003\u0000\u0000\u0270\u0271\u0005\u0003\u0000\u0000\u0271\u0272\u0005"+
		"\u0003\u0000\u0000\u0272\u0273\u0005\u0004\u0000\u0000\u0273\u0274\u0005"+
		"\u0005\u0000\u0000\u0274\u0275\u0005\u0003\u0000\u0000\u0275\u0276\u0005"+
		"\u0003\u0000\u0000\u0276\u0277\u0005\u0003\u0000\u0000\u0277\u0278\u0005"+
		"\u0003\u0000\u0000\u0278\u0279\u0005\u0003\u0000\u0000\u0279\u027a\u0005"+
		"\u0004\u0000\u0000\u027a\u027b\u0005\u0005\u0000\u0000\u027b\u027c\u0005"+
		"\u0003\u0000\u0000\u027c\u027d\u0005\u0003\u0000\u0000\u027d\u027e\u0005"+
		"\u0003\u0000\u0000\u027e\u027f\u0005\u0003\u0000\u0000\u027f\u0280\u0005"+
		"\u0003\u0000\u0000\u0280\u0281\u0005\u0004\u0000\u0000\u0281\u0282\u0005"+
		"\u0005\u0000\u0000\u0282\u0283\u0005\u0003\u0000\u0000\u0283\u0284\u0005"+
		"\u0003\u0000\u0000\u0284\u0285\u0005\u0003\u0000\u0000\u0285\u0286\u0005"+
		"\u0003\u0000\u0000\u0286\u0287\u0005\u0004\u0000\u0000\u0287\u0288\u0005"+
		"\u0005\u0000\u0000\u0288\u0289\u0005\u0003\u0000\u0000\u0289\u028a\u0005"+
		"\n\u0000\u0000\u028a\u028b\u0005\u0004\u0000\u0000\u028b\u028c\u0005\u0005"+
		"\u0000\u0000\u028c\u028d\u0005\u0003\u0000\u0000\u028d\u0309\u0005\u0004"+
		"\u0000\u0000\u028e\u028f\u0005\u0005\u0000\u0000\u028f\u0290\u0005\u0003"+
		"\u0000\u0000\u0290\u0291\u0005\n\u0000\u0000\u0291\u0292\u0005\u0004\u0000"+
		"\u0000\u0292\u0293\u0005\u0005\u0000\u0000\u0293\u0294\u0005\u0003\u0000"+
		"\u0000\u0294\u0295\u0003\u001c\u000e\u0000\u0295\u0296\u0005\u0004\u0000"+
		"\u0000\u0296\u0297\u0005\u0005\u0000\u0000\u0297\u0298\u0005\u0003\u0000"+
		"\u0000\u0298\u0299\u0005\u0004\u0000\u0000\u0299\u029a\u0005\u0005\u0000"+
		"\u0000\u029a\u029b\u0005\u0003\u0000\u0000\u029b\u029c\u0005\u0003\u0000"+
		"\u0000\u029c\u029d\u0005\u0004\u0000\u0000\u029d\u029e\u0005\u0005\u0000"+
		"\u0000\u029e\u029f\u0005\u0003\u0000\u0000\u029f\u02a0\u0005\u0003\u0000"+
		"\u0000\u02a0\u02a2\u0005\u0003\u0000\u0000\u02a1\u02a3\u0003\u001c\u000e"+
		"\u0000\u02a2\u02a1\u0001\u0000\u0000\u0000\u02a3\u02a4\u0001\u0000\u0000"+
		"\u0000\u02a4\u02a2\u0001\u0000\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000"+
		"\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a7\u0005\u0004\u0000"+
		"\u0000\u02a7\u02a8\u0005\u0005\u0000\u0000\u02a8\u02a9\u0005\u0003\u0000"+
		"\u0000\u02a9\u02aa\u0005\u0003\u0000\u0000\u02aa\u02ab\u0005\u0003\u0000"+
		"\u0000\u02ab\u02ad\u0003\u001c\u000e\u0000\u02ac\u02ae\u0003\u001c\u000e"+
		"\u0000\u02ad\u02ac\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000\u0000"+
		"\u0000\u02ae\u02b0\u0001\u0000\u0000\u0000\u02af\u02b1\u0003\u001c\u000e"+
		"\u0000\u02b0\u02af\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000"+
		"\u0000\u02b1\u02b3\u0001\u0000\u0000\u0000\u02b2\u02b4\u0003\u001c\u000e"+
		"\u0000\u02b3\u02b2\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000"+
		"\u0000\u02b4\u02b6\u0001\u0000\u0000\u0000\u02b5\u02b7\u0003\u001c\u000e"+
		"\u0000\u02b6\u02b5\u0001\u0000\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000"+
		"\u0000\u02b7\u02b9\u0001\u0000\u0000\u0000\u02b8\u02ba\u0003\u001c\u000e"+
		"\u0000\u02b9\u02b8\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000"+
		"\u0000\u02ba\u02bc\u0001\u0000\u0000\u0000\u02bb\u02bd\u0003\u001c\u000e"+
		"\u0000\u02bc\u02bb\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000"+
		"\u0000\u02bd\u02c1\u0001\u0000\u0000\u0000\u02be\u02c0\u0003\u001c\u000e"+
		"\u0000\u02bf\u02be\u0001\u0000\u0000\u0000\u02c0\u02c3\u0001\u0000\u0000"+
		"\u0000\u02c1\u02bf\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000"+
		"\u0000\u02c2\u02c4\u0001\u0000\u0000\u0000\u02c3\u02c1\u0001\u0000\u0000"+
		"\u0000\u02c4\u02c5\u0005\u0004\u0000\u0000\u02c5\u02c6\u0005\u0005\u0000"+
		"\u0000\u02c6\u02c7\u0005\u0003\u0000\u0000\u02c7\u02c8\u0005\u0003\u0000"+
		"\u0000\u02c8\u02ca\u0005\u0003\u0000\u0000\u02c9\u02cb\u0003\u001c\u000e"+
		"\u0000\u02ca\u02c9\u0001\u0000\u0000\u0000\u02cb\u02cc\u0001\u0000\u0000"+
		"\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000\u02cc\u02cd\u0001\u0000\u0000"+
		"\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce\u02cf\u0005\u0004\u0000"+
		"\u0000\u02cf\u02d0\u0005\u0005\u0000\u0000\u02d0\u02d1\u0005\u0003\u0000"+
		"\u0000\u02d1\u02d2\u0005\u0003\u0000\u0000\u02d2\u02d3\u0005\u0003\u0000"+
		"\u0000\u02d3\u02d4\u0005\u0004\u0000\u0000\u02d4\u02d5\u0005\u0005\u0000"+
		"\u0000\u02d5\u02d6\u0005\u0003\u0000\u0000\u02d6\u02d7\u0005\u0003\u0000"+
		"\u0000\u02d7\u02d8\u0005\u0003\u0000\u0000\u02d8\u02d9\u0005\u0004\u0000"+
		"\u0000\u02d9\u02da\u0005\u0005\u0000\u0000\u02da\u02db\u0005\u0003\u0000"+
		"\u0000\u02db\u02dc\u0005\u0003\u0000\u0000\u02dc\u02dd\u0005\u0004\u0000"+
		"\u0000\u02dd\u02de\u0005\u0005\u0000\u0000\u02de\u02df\u0005\u0003\u0000"+
		"\u0000\u02df\u02e0\u0005\u0006\u0000\u0000\u02e0\u02e1\u0005\u0004\u0000"+
		"\u0000\u02e1\u02e2\u0005\u0005\u0000\u0000\u02e2\u02e3\u0005\u0003\u0000"+
		"\u0000\u02e3\u02e7\u0005\n\u0000\u0000\u02e4\u02e6\u0003\u001c\u000e\u0000"+
		"\u02e5\u02e4\u0001\u0000\u0000\u0000\u02e6\u02e9\u0001\u0000\u0000\u0000"+
		"\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000"+
		"\u02e8\u02ea\u0001\u0000\u0000\u0000\u02e9\u02e7\u0001\u0000\u0000\u0000"+
		"\u02ea\u02eb\u0005\u0004\u0000\u0000\u02eb\u02ec\u0005\u0005\u0000\u0000"+
		"\u02ec\u02ed\u0005\u0003\u0000\u0000\u02ed\u02ee\u0005\n\u0000\u0000\u02ee"+
		"\u02ef\u0005\u0004\u0000\u0000\u02ef\u02f0\u0005\u0005\u0000\u0000\u02f0"+
		"\u02f4\u0005\u0003\u0000\u0000\u02f1\u02f3\u0003\u001c\u000e\u0000\u02f2"+
		"\u02f1\u0001\u0000\u0000\u0000\u02f3\u02f6\u0001\u0000\u0000\u0000\u02f4"+
		"\u02f2\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000\u02f5"+
		"\u02f7\u0001\u0000\u0000\u0000\u02f6\u02f4\u0001\u0000\u0000\u0000\u02f7"+
		"\u02f8\u0005\u0004\u0000\u0000\u02f8\u02f9\u0005\u0005\u0000\u0000\u02f9"+
		"\u02fa\u0005\u0003\u0000\u0000\u02fa\u02fb\u0005\n\u0000\u0000\u02fb\u02fc"+
		"\u0005\u0004\u0000\u0000\u02fc\u02fd\u0005\u0005\u0000\u0000\u02fd\u02fe"+
		"\u0005\u0003\u0000\u0000\u02fe\u02ff\u0003\u001c\u000e\u0000\u02ff\u0300"+
		"\u0005\u0004\u0000\u0000\u0300\u0301\u0005\u0005\u0000\u0000\u0301\u0302"+
		"\u0005\u0003\u0000\u0000\u0302\u0303\u0005\b\u0000\u0000\u0303\u0304\u0005"+
		"\u0004\u0000\u0000\u0304\u0305\u0005\u0005\u0000\u0000\u0305\u0306\u0005"+
		"\u0003\u0000\u0000\u0306\u0307\u0005\u0004\u0000\u0000\u0307\u0308\u0006"+
		"\u0002\uffff\uffff\u0000\u0308\u030a\u0001\u0000\u0000\u0000\u0309\u028e"+
		"\u0001\u0000\u0000\u0000\u030a\u030b\u0001\u0000\u0000\u0000\u030b\u0309"+
		"\u0001\u0000\u0000\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u030d"+
		"\u0001\u0000\u0000\u0000\u030d\u030e\u0005\n\u0000\u0000\u030e\u030f\u0005"+
		"\u0003\u0000\u0000\u030f\u0310\u0005\n\u0000\u0000\u0310\u0311\u0005\u0003"+
		"\u0000\u0000\u0311\u0312\u0005\u0006\u0000\u0000\u0312\u0313\u0005\u0004"+
		"\u0000\u0000\u0313\u0315\u0001\u0000\u0000\u0000\u0314\u015a\u0001\u0000"+
		"\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316\u0314\u0001\u0000"+
		"\u0000\u0000\u0316\u0317\u0001\u0000\u0000\u0000\u0317\u0318\u0001\u0000"+
		"\u0000\u0000\u0318\u0319\u0005\u0005\u0000\u0000\u0319\u031a\u0005\u0003"+
		"\u0000\u0000\u031a\u031b\u0005\n\u0000\u0000\u031b\u031c\u0005\u0003\u0000"+
		"\u0000\u031c\u031d\u0005\n\u0000\u0000\u031d\u031e\u0005\n\u0000\u0000"+
		"\u031e\u031f\u0005\n\u0000\u0000\u031f\u0320\u0005\n\u0000\u0000\u0320"+
		"\u0321\u0005\n\u0000\u0000\u0321\u0322\u0005\n\u0000\u0000\u0322\u0323"+
		"\u0005\u0003\u0000\u0000\u0323\u0324\u0005\n\u0000\u0000\u0324\u0325\u0005"+
		"\u0004\u0000\u0000\u0325\u0005\u0001\u0000\u0000\u0000\u0326\u0327\u0005"+
		"\u0005\u0000\u0000\u0327\u0328\u0005\u0003\u0000\u0000\u0328\u0329\u0005"+
		"\n\u0000\u0000\u0329\u032a\u0005\u0003\u0000\u0000\u032a\u032b\u0005\n"+
		"\u0000\u0000\u032b\u032c\u0005\n\u0000\u0000\u032c\u032d\u0005\n\u0000"+
		"\u0000\u032d\u032e\u0005\n\u0000\u0000\u032e\u032f\u0005\u0003\u0000\u0000"+
		"\u032f\u0330\u0005\n\u0000\u0000\u0330\u0427\u0005\u0004\u0000\u0000\u0331"+
		"\u0332\u0005\n\u0000\u0000\u0332\u0333\u0005\u0003\u0000\u0000\u0333\u0334"+
		"\u0005\u0006\u0000\u0000\u0334\u0335\u0005\u0003\u0000\u0000\u0335\u0336"+
		"\u0005\u0004\u0000\u0000\u0336\u0337\u0005\n\u0000\u0000\u0337\u0338\u0005"+
		"\u0003\u0000\u0000\u0338\u0339\u0005\u0006\u0000\u0000\u0339\u033a\u0005"+
		"\u0003\u0000\u0000\u033a\u033b\u0005\u0004\u0000\u0000\u033b\u033c\u0005"+
		"\n\u0000\u0000\u033c\u033d\u0005\u0003\u0000\u0000\u033d\u033e\u0005\u0006"+
		"\u0000\u0000\u033e\u033f\u0005\u0003\u0000\u0000\u033f\u0340\u0005\u0004"+
		"\u0000\u0000\u0340\u0341\u0005\n\u0000\u0000\u0341\u0342\u0005\u0003\u0000"+
		"\u0000\u0342\u0343\u0005\u0006\u0000\u0000\u0343\u0344\u0005\u0003\u0000"+
		"\u0000\u0344\u0345\u0005\u0004\u0000\u0000\u0345\u0346\u0005\n\u0000\u0000"+
		"\u0346\u0347\u0005\u0003\u0000\u0000\u0347\u0348\u0005\u0006\u0000\u0000"+
		"\u0348\u0349\u0005\u0003\u0000\u0000\u0349\u034a\u0005\u0004\u0000\u0000"+
		"\u034a\u034b\u0005\n\u0000\u0000\u034b\u034c\u0005\u0003\u0000\u0000\u034c"+
		"\u034d\u0005\u0006\u0000\u0000\u034d\u034e\u0005\u0003\u0000\u0000\u034e"+
		"\u034f\u0005\u0004\u0000\u0000\u034f\u0350\u0005\n\u0000\u0000\u0350\u0351"+
		"\u0005\u0003\u0000\u0000\u0351\u0352\u0005\u0006\u0000\u0000\u0352\u0353"+
		"\u0005\u0003\u0000\u0000\u0353\u0354\u0005\u0004\u0000\u0000\u0354\u0355"+
		"\u0005\n\u0000\u0000\u0355\u0356\u0005\u0003\u0000\u0000\u0356\u0357\u0005"+
		"\u0006\u0000\u0000\u0357\u0358\u0005\u0003\u0000\u0000\u0358\u0359\u0005"+
		"\n\u0000\u0000\u0359\u035a\u0005\u0004\u0000\u0000\u035a\u035b\u0005\n"+
		"\u0000\u0000\u035b\u035c\u0005\u0003\u0000\u0000\u035c\u035d\u0005\u0006"+
		"\u0000\u0000\u035d\u035e\u0005\u0003\u0000\u0000\u035e\u041c\u0005\u0004"+
		"\u0000\u0000\u035f\u0360\u0005\n\u0000\u0000\u0360\u0361\u0005\u0003\u0000"+
		"\u0000\u0361\u0362\u0005\u0006\u0000\u0000\u0362\u0363\u0005\u0003\u0000"+
		"\u0000\u0363\u0364\u0005\b\u0000\u0000\u0364\u0365\u0005\u0004\u0000\u0000"+
		"\u0365\u0366\u0005\n\u0000\u0000\u0366\u0367\u0005\u0003\u0000\u0000\u0367"+
		"\u0368\u0005\u0006\u0000\u0000\u0368\u0369\u0005\u0003\u0000\u0000\u0369"+
		"\u036b\u0003\u001c\u000e\u0000\u036a\u036c\u0003\u001c\u000e\u0000\u036b"+
		"\u036a\u0001\u0000\u0000\u0000\u036b\u036c\u0001\u0000\u0000\u0000\u036c"+
		"\u036e\u0001\u0000\u0000\u0000\u036d\u036f\u0003\u001c\u000e\u0000\u036e"+
		"\u036d\u0001\u0000\u0000\u0000\u036e\u036f\u0001\u0000\u0000\u0000\u036f"+
		"\u0371\u0001\u0000\u0000\u0000\u0370\u0372\u0003\u001c\u000e\u0000\u0371"+
		"\u0370\u0001\u0000\u0000\u0000\u0371\u0372\u0001\u0000\u0000\u0000\u0372"+
		"\u0374\u0001\u0000\u0000\u0000\u0373\u0375\u0003\u001c\u000e\u0000\u0374"+
		"\u0373\u0001\u0000\u0000\u0000\u0374\u0375\u0001\u0000\u0000\u0000\u0375"+
		"\u0377\u0001\u0000\u0000\u0000\u0376\u0378\u0003\u001c\u000e\u0000\u0377"+
		"\u0376\u0001\u0000\u0000\u0000\u0377\u0378\u0001\u0000\u0000\u0000\u0378"+
		"\u037a\u0001\u0000\u0000\u0000\u0379\u037b\u0003\u001c\u000e\u0000\u037a"+
		"\u0379\u0001\u0000\u0000\u0000\u037a\u037b\u0001\u0000\u0000\u0000\u037b"+
		"\u037f\u0001\u0000\u0000\u0000\u037c\u037e\u0003\u001c\u000e\u0000\u037d"+
		"\u037c\u0001\u0000\u0000\u0000\u037e\u0381\u0001\u0000\u0000\u0000\u037f"+
		"\u037d\u0001\u0000\u0000\u0000\u037f\u0380\u0001\u0000\u0000\u0000\u0380"+
		"\u0382\u0001\u0000\u0000\u0000\u0381\u037f\u0001\u0000\u0000\u0000\u0382"+
		"\u0383\u0005\u0004\u0000\u0000\u0383\u0384\u0005\n\u0000\u0000\u0384\u0385"+
		"\u0005\u0003\u0000\u0000\u0385\u0386\u0005\u0006\u0000\u0000\u0386\u0387"+
		"\u0005\u0003\u0000\u0000\u0387\u0388\u0005\b\u0000\u0000\u0388\u0389\u0005"+
		"\u0004\u0000\u0000\u0389\u038a\u0005\n\u0000\u0000\u038a\u038b\u0005\u0003"+
		"\u0000\u0000\u038b\u038c\u0005\u0006\u0000\u0000\u038c\u038d\u0005\u0003"+
		"\u0000\u0000\u038d\u038e\u0005\b\u0000\u0000\u038e\u038f\u0005\u0004\u0000"+
		"\u0000\u038f\u0390\u0005\n\u0000\u0000\u0390\u0391\u0005\u0003\u0000\u0000"+
		"\u0391\u0392\u0005\u0006\u0000\u0000\u0392\u0393\u0005\u0003\u0000\u0000"+
		"\u0393\u0394\u0005\b\u0000\u0000\u0394\u0395\u0005\u0004\u0000\u0000\u0395"+
		"\u0396\u0005\n\u0000\u0000\u0396\u0397\u0005\u0003\u0000\u0000\u0397\u0398"+
		"\u0005\u0006\u0000\u0000\u0398\u0399\u0005\u0003\u0000\u0000\u0399\u039a"+
		"\u0005\b\u0000\u0000\u039a\u039b\u0005\u0004\u0000\u0000\u039b\u039c\u0005"+
		"\n\u0000\u0000\u039c\u039d\u0005\u0003\u0000\u0000\u039d\u039e\u0005\u0006"+
		"\u0000\u0000\u039e\u039f\u0005\u0003\u0000\u0000\u039f\u03a0\u0005\b\u0000"+
		"\u0000\u03a0\u03a1\u0005\u0004\u0000\u0000\u03a1\u03a2\u0005\n\u0000\u0000"+
		"\u03a2\u03a3\u0005\u0003\u0000\u0000\u03a3\u03a4\u0005\u0006\u0000\u0000"+
		"\u03a4\u03a5\u0005\u0003\u0000\u0000\u03a5\u03a6\u0005\b\u0000\u0000\u03a6"+
		"\u03a7\u0005\u0004\u0000\u0000\u03a7\u03a8\u0005\n\u0000\u0000\u03a8\u03a9"+
		"\u0005\u0003\u0000\u0000\u03a9\u03aa\u0005\u0006\u0000\u0000\u03aa\u03ab"+
		"\u0005\u0003\u0000\u0000\u03ab\u03ac\u0005\b\u0000\u0000\u03ac\u03ad\u0005"+
		"\u0004\u0000\u0000\u03ad\u03ae\u0005\n\u0000\u0000\u03ae\u03af\u0005\u0003"+
		"\u0000\u0000\u03af\u03b0\u0005\u0006\u0000\u0000\u03b0\u03b1\u0005\u0003"+
		"\u0000\u0000\u03b1\u03b2\u0005\b\u0000\u0000\u03b2\u03b3\u0005\u0004\u0000"+
		"\u0000\u03b3\u03b4\u0005\n\u0000\u0000\u03b4\u03b5\u0005\u0003\u0000\u0000"+
		"\u03b5\u03b6\u0005\u0006\u0000\u0000\u03b6\u03b7\u0005\u0003\u0000\u0000"+
		"\u03b7\u03b8\u0005\b\u0000\u0000\u03b8\u03b9\u0005\u0004\u0000\u0000\u03b9"+
		"\u03ba\u0005\n\u0000\u0000\u03ba\u03bb\u0005\u0003\u0000\u0000\u03bb\u03bc"+
		"\u0005\u0006\u0000\u0000\u03bc\u03bd\u0005\u0003\u0000\u0000\u03bd\u03be"+
		"\u0005\b\u0000\u0000\u03be\u03bf\u0005\u0004\u0000\u0000\u03bf\u03c0\u0005"+
		"\n\u0000\u0000\u03c0\u03c1\u0005\u0003\u0000\u0000\u03c1\u03c2\u0005\u0006"+
		"\u0000\u0000\u03c2\u03c3\u0005\u0003\u0000\u0000\u03c3\u03c4\u0005\b\u0000"+
		"\u0000\u03c4\u03c5\u0005\u0004\u0000\u0000\u03c5\u03c6\u0005\n\u0000\u0000"+
		"\u03c6\u03c7\u0005\u0003\u0000\u0000\u03c7\u03c8\u0005\u0006\u0000\u0000"+
		"\u03c8\u03c9\u0005\u0003\u0000\u0000\u03c9\u03ca\u0005\b\u0000\u0000\u03ca"+
		"\u03cb\u0005\u0004\u0000\u0000\u03cb\u03cc\u0005\n\u0000\u0000\u03cc\u03cd"+
		"\u0005\u0003\u0000\u0000\u03cd\u03ce\u0005\u0006\u0000\u0000\u03ce\u03d0"+
		"\u0005\u0003\u0000\u0000\u03cf\u03d1\u0003\u001c\u000e\u0000\u03d0\u03cf"+
		"\u0001\u0000\u0000\u0000\u03d1\u03d2\u0001\u0000\u0000\u0000\u03d2\u03d0"+
		"\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001\u0000\u0000\u0000\u03d3\u03d4"+
		"\u0001\u0000\u0000\u0000\u03d4\u03d5\u0005\u0004\u0000\u0000\u03d5\u03d6"+
		"\u0005\n\u0000\u0000\u03d6\u03d7\u0005\u0003\u0000\u0000\u03d7\u03d8\u0005"+
		"\u0006\u0000\u0000\u03d8\u03d9\u0005\u0003\u0000\u0000\u03d9\u03da\u0003"+
		"\u001c\u000e\u0000\u03da\u03db\u0005\u0004\u0000\u0000\u03db\u03dc\u0005"+
		"\n\u0000\u0000\u03dc\u03dd\u0005\u0003\u0000\u0000\u03dd\u03de\u0005\u0006"+
		"\u0000\u0000\u03de\u03df\u0005\u0003\u0000\u0000\u03df\u03e0\u0003\u001c"+
		"\u000e\u0000\u03e0\u03e1\u0005\u0004\u0000\u0000\u03e1\u03e2\u0005\n\u0000"+
		"\u0000\u03e2\u03e3\u0005\u0003\u0000\u0000\u03e3\u03e4\u0005\u0006\u0000"+
		"\u0000\u03e4\u03e5\u0005\u0003\u0000\u0000\u03e5\u03e6\u0003\u001c\u000e"+
		"\u0000\u03e6\u03e7\u0005\u0004\u0000\u0000\u03e7\u03e8\u0005\n\u0000\u0000"+
		"\u03e8\u03e9\u0005\u0003\u0000\u0000\u03e9\u03ea\u0005\u0006\u0000\u0000"+
		"\u03ea\u03eb\u0005\u0003\u0000\u0000\u03eb\u03ec\u0005\u0004\u0000\u0000"+
		"\u03ec\u03ed\u0006\u0003\uffff\uffff\u0000\u03ed\u041d\u0001\u0000\u0000"+
		"\u0000\u03ee\u03ef\u0005\n\u0000\u0000\u03ef\u03f0\u0005\u0003\u0000\u0000"+
		"\u03f0\u03f1\u0005\u0006\u0000\u0000\u03f1\u03f2\u0005\u0003\u0000\u0000"+
		"\u03f2\u03f3\u0005\b\u0000\u0000\u03f3\u03f5\u0003\u001c\u000e\u0000\u03f4"+
		"\u03f6\u0003\u001c\u000e\u0000\u03f5\u03f4\u0001\u0000\u0000\u0000\u03f5"+
		"\u03f6\u0001\u0000\u0000\u0000\u03f6\u03f8\u0001\u0000\u0000\u0000\u03f7"+
		"\u03f9\u0003\u001c\u000e\u0000\u03f8\u03f7\u0001\u0000\u0000\u0000\u03f8"+
		"\u03f9\u0001\u0000\u0000\u0000\u03f9\u03fb\u0001\u0000\u0000\u0000\u03fa"+
		"\u03fc\u0003\u001c\u000e\u0000\u03fb\u03fa\u0001\u0000\u0000\u0000\u03fb"+
		"\u03fc\u0001\u0000\u0000\u0000\u03fc\u03fe\u0001\u0000\u0000\u0000\u03fd"+
		"\u03ff\u0003\u001c\u000e\u0000\u03fe\u03fd\u0001\u0000\u0000\u0000\u03fe"+
		"\u03ff\u0001\u0000\u0000\u0000\u03ff\u0401\u0001\u0000\u0000\u0000\u0400"+
		"\u0402\u0003\u001c\u000e\u0000\u0401\u0400\u0001\u0000\u0000\u0000\u0401"+
		"\u0402\u0001\u0000\u0000\u0000\u0402\u0404\u0001\u0000\u0000\u0000\u0403"+
		"\u0405\u0003\u001c\u000e\u0000\u0404\u0403\u0001\u0000\u0000\u0000\u0404"+
		"\u0405\u0001\u0000\u0000\u0000\u0405\u0409\u0001\u0000\u0000\u0000\u0406"+
		"\u0408\u0003\u001c\u000e\u0000\u0407\u0406\u0001\u0000\u0000\u0000\u0408"+
		"\u040b\u0001\u0000\u0000\u0000\u0409\u0407\u0001\u0000\u0000\u0000\u0409"+
		"\u040a\u0001\u0000\u0000\u0000\u040a\u040c\u0001\u0000\u0000\u0000\u040b"+
		"\u0409\u0001\u0000\u0000\u0000\u040c\u040d\u0005\b\u0000\u0000\u040d\u040e"+
		"\u0005\u0004\u0000\u0000\u040e\u040f\u0005\n\u0000\u0000\u040f\u0410\u0005"+
		"\u0003\u0000\u0000\u0410\u0411\u0005\u0006\u0000\u0000\u0411\u0412\u0005"+
		"\u0003\u0000\u0000\u0412\u0413\u0005\b\u0000\u0000\u0413\u0414\u0005\b"+
		"\u0000\u0000\u0414\u0415\u0005\b\u0000\u0000\u0415\u0416\u0005\b\u0000"+
		"\u0000\u0416\u0417\u0005\b\u0000\u0000\u0417\u0418\u0005\b\u0000\u0000"+
		"\u0418\u0419\u0005\b\u0000\u0000\u0419\u041a\u0005\u0004\u0000\u0000\u041a"+
		"\u041b\u0006\u0003\uffff\uffff\u0000\u041b\u041d\u0001\u0000\u0000\u0000"+
		"\u041c\u035f\u0001\u0000\u0000\u0000\u041c\u03ee\u0001\u0000\u0000\u0000"+
		"\u041d\u041e\u0001\u0000\u0000\u0000\u041e\u041c\u0001\u0000\u0000\u0000"+
		"\u041e\u041f\u0001\u0000\u0000\u0000\u041f\u0420\u0001\u0000\u0000\u0000"+
		"\u0420\u0421\u0005\n\u0000\u0000\u0421\u0422\u0005\u0003\u0000\u0000\u0422"+
		"\u0423\u0005\n\u0000\u0000\u0423\u0424\u0005\u0003\u0000\u0000\u0424\u0425"+
		"\u0005\u0006\u0000\u0000\u0425\u0426\u0005\u0004\u0000\u0000\u0426\u0428"+
		"\u0001\u0000\u0000\u0000\u0427\u0331\u0001\u0000\u0000\u0000\u0428\u0429"+
		"\u0001\u0000\u0000\u0000\u0429\u0427\u0001\u0000\u0000\u0000\u0429\u042a"+
		"\u0001\u0000\u0000\u0000\u042a\u042b\u0001\u0000\u0000\u0000\u042b\u042c"+
		"\u0005\u0005\u0000\u0000\u042c\u042d\u0005\u0003\u0000\u0000\u042d\u042e"+
		"\u0005\n\u0000\u0000\u042e\u042f\u0005\u0003\u0000\u0000\u042f\u0430\u0005"+
		"\n\u0000\u0000\u0430\u0431\u0005\n\u0000\u0000\u0431\u0432\u0005\n\u0000"+
		"\u0000\u0432\u0433\u0005\n\u0000\u0000\u0433\u0434\u0005\u0003\u0000\u0000"+
		"\u0434\u0435\u0005\n\u0000\u0000\u0435\u0436\u0005\u0004\u0000\u0000\u0436"+
		"\u0007\u0001\u0000\u0000\u0000\u0437\u0438\u0005\u0005\u0000\u0000\u0438"+
		"\u0439\u0005\u0003\u0000\u0000\u0439\u043a\u0005\n\u0000\u0000\u043a\u043b"+
		"\u0005\u0003\u0000\u0000\u043b\u043c\u0005\n\u0000\u0000\u043c\u043d\u0005"+
		"\n\u0000\u0000\u043d\u043e\u0005\n\u0000\u0000\u043e\u043f\u0005\n\u0000"+
		"\u0000\u043f\u0440\u0005\n\u0000\u0000\u0440\u0441\u0005\n\u0000\u0000"+
		"\u0441\u0442\u0005\u0003\u0000\u0000\u0442\u0443\u0005\n\u0000\u0000\u0443"+
		"\u0626\u0005\u0004\u0000\u0000\u0444\u0445\u0005\n\u0000\u0000\u0445\u0446"+
		"\u0005\u0003\u0000\u0000\u0446\u0447\u0005\u0006\u0000\u0000\u0447\u0448"+
		"\u0005\u0003\u0000\u0000\u0448\u0449\u0005\u0004\u0000\u0000\u0449\u044a"+
		"\u0005\n\u0000\u0000\u044a\u044b\u0005\u0003\u0000\u0000\u044b\u044c\u0005"+
		"\u0006\u0000\u0000\u044c\u044d\u0005\u0003\u0000\u0000\u044d\u044e\u0005"+
		"\u0004\u0000\u0000\u044e\u044f\u0005\n\u0000\u0000\u044f\u0450\u0005\u0003"+
		"\u0000\u0000\u0450\u0451\u0005\u0006\u0000\u0000\u0451\u0452\u0005\u0003"+
		"\u0000\u0000\u0452\u0453\u0005\u0004\u0000\u0000\u0453\u0454\u0005\n\u0000"+
		"\u0000\u0454\u0455\u0005\u0003\u0000\u0000\u0455\u0456\u0005\u0006\u0000"+
		"\u0000\u0456\u0457\u0005\u0003\u0000\u0000\u0457\u0458\u0005\u0003\u0000"+
		"\u0000\u0458\u0459\u0005\u0003\u0000\u0000\u0459\u045a\u0005\u0003\u0000"+
		"\u0000\u045a\u045b\u0005\u0003\u0000\u0000\u045b\u045c\u0005\u0004\u0000"+
		"\u0000\u045c\u045d\u0005\n\u0000\u0000\u045d\u045e\u0005\u0003\u0000\u0000"+
		"\u045e\u045f\u0005\u0006\u0000\u0000\u045f\u0460\u0005\u0003\u0000\u0000"+
		"\u0460\u0461\u0005\u0003\u0000\u0000\u0461\u0462\u0005\u0003\u0000\u0000"+
		"\u0462\u0463\u0005\u0004\u0000\u0000\u0463\u0464\u0005\n\u0000\u0000\u0464"+
		"\u0465\u0005\u0003\u0000\u0000\u0465\u0466\u0005\u0006\u0000\u0000\u0466"+
		"\u0467\u0005\u0003\u0000\u0000\u0467\u0468\u0005\u0003\u0000\u0000\u0468"+
		"\u0469\u0005\u0003\u0000\u0000\u0469\u046a\u0005\u0003\u0000\u0000\u046a"+
		"\u046b\u0005\u0003\u0000\u0000\u046b\u046c\u0005\u0004\u0000\u0000\u046c"+
		"\u046d\u0005\n\u0000\u0000\u046d\u046e\u0005\u0003\u0000\u0000\u046e\u046f"+
		"\u0005\u0006\u0000\u0000\u046f\u0470\u0005\u0003\u0000\u0000\u0470\u0471"+
		"\u0005\u0003\u0000\u0000\u0471\u0472\u0005\u0003\u0000\u0000\u0472\u0473"+
		"\u0005\u0003\u0000\u0000\u0473\u0474\u0005\u0003\u0000\u0000\u0474\u0475"+
		"\u0005\u0004\u0000\u0000\u0475\u0476\u0005\n\u0000\u0000\u0476\u0477\u0005"+
		"\u0003\u0000\u0000\u0477\u0478\u0005\u0006\u0000\u0000\u0478\u0479\u0005"+
		"\u0003\u0000\u0000\u0479\u047a\u0005\u0003\u0000\u0000\u047a\u047b\u0005"+
		"\u0003\u0000\u0000\u047b\u047c\u0005\u0003\u0000\u0000\u047c\u047d\u0005"+
		"\u0004\u0000\u0000\u047d\u047e\u0005\n\u0000\u0000\u047e\u047f\u0005\u0003"+
		"\u0000\u0000\u047f\u0480\u0005\u0006\u0000\u0000\u0480\u0481\u0005\u0003"+
		"\u0000\u0000\u0481\u0482\u0005\u0004\u0000\u0000\u0482\u0483\u0005\n\u0000"+
		"\u0000\u0483\u0484\u0005\u0003\u0000\u0000\u0484\u0485\u0005\u0006\u0000"+
		"\u0000\u0485\u0486\u0005\u0003\u0000\u0000\u0486\u0487\u0005\u0004\u0000"+
		"\u0000\u0487\u0488\u0005\n\u0000\u0000\u0488\u0489\u0005\u0003\u0000\u0000"+
		"\u0489\u048a\u0005\u0006\u0000\u0000\u048a\u048b\u0005\u0003\u0000\u0000"+
		"\u048b\u048c\u0005\u0003\u0000\u0000\u048c\u048d\u0005\u0003\u0000\u0000"+
		"\u048d\u048e\u0005\u0003\u0000\u0000\u048e\u048f\u0005\u0003\u0000\u0000"+
		"\u048f\u0490\u0005\u0004\u0000\u0000\u0490\u0491\u0005\n\u0000\u0000\u0491"+
		"\u0492\u0005\u0003\u0000\u0000\u0492\u0493\u0005\u0006\u0000\u0000\u0493"+
		"\u0494\u0005\u0003\u0000\u0000\u0494\u0495\u0005\u0003\u0000\u0000\u0495"+
		"\u0496\u0005\u0003\u0000\u0000\u0496\u0497\u0005\u0004\u0000\u0000\u0497"+
		"\u0498\u0005\n\u0000\u0000\u0498\u0499\u0005\u0003\u0000\u0000\u0499\u049a"+
		"\u0005\u0006\u0000\u0000\u049a\u049b\u0005\u0003\u0000\u0000\u049b\u049c"+
		"\u0005\u0003\u0000\u0000\u049c\u049d\u0005\u0003\u0000\u0000\u049d\u049e"+
		"\u0005\u0003\u0000\u0000\u049e\u049f\u0005\u0003\u0000\u0000\u049f\u04a0"+
		"\u0005\u0004\u0000\u0000\u04a0\u04a1\u0005\n\u0000\u0000\u04a1\u04a2\u0005"+
		"\u0003\u0000\u0000\u04a2\u04a3\u0005\u0006\u0000\u0000\u04a3\u04a4\u0005"+
		"\u0003\u0000\u0000\u04a4\u04a5\u0005\u0003\u0000\u0000\u04a5\u04a6\u0005"+
		"\u0003\u0000\u0000\u04a6\u04a7\u0005\u0003\u0000\u0000\u04a7\u04a8\u0005"+
		"\u0003\u0000\u0000\u04a8\u04a9\u0005\u0004\u0000\u0000\u04a9\u04aa\u0005"+
		"\n\u0000\u0000\u04aa\u04ab\u0005\u0003\u0000\u0000\u04ab\u04ac\u0005\u0006"+
		"\u0000\u0000\u04ac\u04ad\u0005\u0003\u0000\u0000\u04ad\u04ae\u0005\u0003"+
		"\u0000\u0000\u04ae\u04af\u0005\u0003\u0000\u0000\u04af\u04b0\u0005\u0003"+
		"\u0000\u0000\u04b0\u04b1\u0005\u0004\u0000\u0000\u04b1\u04b2\u0005\n\u0000"+
		"\u0000\u04b2\u04b3\u0005\u0003\u0000\u0000\u04b3\u04b4\u0005\u0006\u0000"+
		"\u0000\u04b4\u04b5\u0005\u0003\u0000\u0000\u04b5\u04b6\u0005\u0004\u0000"+
		"\u0000\u04b6\u04b7\u0005\n\u0000\u0000\u04b7\u04b8\u0005\u0003\u0000\u0000"+
		"\u04b8\u04b9\u0005\u0006\u0000\u0000\u04b9\u04ba\u0005\u0003\u0000\u0000"+
		"\u04ba\u04bb\u0005\u0004\u0000\u0000\u04bb\u04bc\u0005\n\u0000\u0000\u04bc"+
		"\u04bd\u0005\u0003\u0000\u0000\u04bd\u04be\u0005\u0006\u0000\u0000\u04be"+
		"\u04bf\u0005\u0003\u0000\u0000\u04bf\u04c0\u0005\u0004\u0000\u0000\u04c0"+
		"\u04c1\u0005\n\u0000\u0000\u04c1\u04c2\u0005\u0003\u0000\u0000\u04c2\u04c3"+
		"\u0005\u0006\u0000\u0000\u04c3\u04c4\u0005\u0003\u0000\u0000\u04c4\u04c5"+
		"\u0005\u0004\u0000\u0000\u04c5\u04c6\u0005\n\u0000\u0000\u04c6\u04c7\u0005"+
		"\u0003\u0000\u0000\u04c7\u04c8\u0005\u0006\u0000\u0000\u04c8\u04c9\u0005"+
		"\u0003\u0000\u0000\u04c9\u04ca\u0005\u0003\u0000\u0000\u04ca\u04cb\u0005"+
		"\u0003\u0000\u0000\u04cb\u04cc\u0005\u0003\u0000\u0000\u04cc\u04cd\u0005"+
		"\u0003\u0000\u0000\u04cd\u04ce\u0005\u0004\u0000\u0000\u04ce\u04cf\u0005"+
		"\n\u0000\u0000\u04cf\u04d0\u0005\u0003\u0000\u0000\u04d0\u04d1\u0005\u0006"+
		"\u0000\u0000\u04d1\u04d2\u0005\u0003\u0000\u0000\u04d2\u04d3\u0005\u0003"+
		"\u0000\u0000\u04d3\u04d4\u0005\u0003\u0000\u0000\u04d4\u04d5\u0005\u0003"+
		"\u0000\u0000\u04d5\u04d6\u0005\u0004\u0000\u0000\u04d6\u04d7\u0005\n\u0000"+
		"\u0000\u04d7\u04d8\u0005\u0003\u0000\u0000\u04d8\u04d9\u0005\u0006\u0000"+
		"\u0000\u04d9\u04da\u0005\u0003\u0000\u0000\u04da\u04db\u0005\u0003\u0000"+
		"\u0000\u04db\u04dc\u0005\u0003\u0000\u0000\u04dc\u04dd\u0005\u0003\u0000"+
		"\u0000\u04dd\u04de\u0005\u0003\u0000\u0000\u04de\u04df\u0005\u0004\u0000"+
		"\u0000\u04df\u04e0\u0005\n\u0000\u0000\u04e0\u04e1\u0005\u0003\u0000\u0000"+
		"\u04e1\u04e2\u0005\u0006\u0000\u0000\u04e2\u04e3\u0005\u0003\u0000\u0000"+
		"\u04e3\u04e4\u0005\u0003\u0000\u0000\u04e4\u04e5\u0005\u0003\u0000\u0000"+
		"\u04e5\u04e6\u0005\u0003\u0000\u0000\u04e6\u04e7\u0005\u0003\u0000\u0000"+
		"\u04e7\u04e8\u0005\u0004\u0000\u0000\u04e8\u04e9\u0005\n\u0000\u0000\u04e9"+
		"\u04ea\u0005\u0003\u0000\u0000\u04ea\u04eb\u0005\u0006\u0000\u0000\u04eb"+
		"\u04ec\u0005\u0003\u0000\u0000\u04ec\u04ed\u0005\u0003\u0000\u0000\u04ed"+
		"\u04ee\u0005\u0003\u0000\u0000\u04ee\u04ef\u0005\u0003\u0000\u0000\u04ef"+
		"\u04f0\u0005\u0004\u0000\u0000\u04f0\u04f1\u0005\n\u0000\u0000\u04f1\u04f2"+
		"\u0005\u0003\u0000\u0000\u04f2\u04f3\u0005\u0006\u0000\u0000\u04f3\u04f4"+
		"\u0005\u0003\u0000\u0000\u04f4\u04f5\u0005\u0004\u0000\u0000\u04f5\u04f6"+
		"\u0005\n\u0000\u0000\u04f6\u04f7\u0005\u0003\u0000\u0000\u04f7\u04f8\u0005"+
		"\u0006\u0000\u0000\u04f8\u04f9\u0005\u0003\u0000\u0000\u04f9\u04fa\u0005"+
		"\u0004\u0000\u0000\u04fa\u04fb\u0005\n\u0000\u0000\u04fb\u04fc\u0005\u0003"+
		"\u0000\u0000\u04fc\u04fd\u0005\u0006\u0000\u0000\u04fd\u04fe\u0005\u0003"+
		"\u0000\u0000\u04fe\u04ff\u0005\u0004\u0000\u0000\u04ff\u0500\u0005\n\u0000"+
		"\u0000\u0500\u0501\u0005\u0003\u0000\u0000\u0501\u0502\u0005\u0006\u0000"+
		"\u0000\u0502\u0503\u0005\u0003\u0000\u0000\u0503\u0504\u0005\u0004\u0000"+
		"\u0000\u0504\u0505\u0005\n\u0000\u0000\u0505\u0506\u0005\u0003\u0000\u0000"+
		"\u0506\u0507\u0005\u0006\u0000\u0000\u0507\u0508\u0005\u0003\u0000\u0000"+
		"\u0508\u0509\u0005\u0003\u0000\u0000\u0509\u050a\u0005\u0003\u0000\u0000"+
		"\u050a\u050b\u0005\u0003\u0000\u0000\u050b\u050c\u0005\u0003\u0000\u0000"+
		"\u050c\u050d\u0005\u0004\u0000\u0000\u050d\u050e\u0005\n\u0000\u0000\u050e"+
		"\u050f\u0005\u0003\u0000\u0000\u050f\u0510\u0005\u0006\u0000\u0000\u0510"+
		"\u0511\u0005\u0003\u0000\u0000\u0511\u0512\u0005\u0003\u0000\u0000\u0512"+
		"\u0513\u0005\u0003\u0000\u0000\u0513\u0514\u0005\u0004\u0000\u0000\u0514"+
		"\u0515\u0005\n\u0000\u0000\u0515\u0516\u0005\u0003\u0000\u0000\u0516\u0517"+
		"\u0005\u0006\u0000\u0000\u0517\u0518\u0005\u0003\u0000\u0000\u0518\u0519"+
		"\u0005\u0003\u0000\u0000\u0519\u051a\u0005\u0003\u0000\u0000\u051a\u051b"+
		"\u0005\u0003\u0000\u0000\u051b\u051c\u0005\u0003\u0000\u0000\u051c\u051d"+
		"\u0005\u0004\u0000\u0000\u051d\u051e\u0005\n\u0000\u0000\u051e\u051f\u0005"+
		"\u0003\u0000\u0000\u051f\u0520\u0005\u0006\u0000\u0000\u0520\u0521\u0005"+
		"\u0003\u0000\u0000\u0521\u0522\u0005\u0003\u0000\u0000\u0522\u0523\u0005"+
		"\u0003\u0000\u0000\u0523\u0524\u0005\u0003\u0000\u0000\u0524\u0525\u0005"+
		"\u0003\u0000\u0000\u0525\u0526\u0005\u0004\u0000\u0000\u0526\u0527\u0005"+
		"\n\u0000\u0000\u0527\u0528\u0005\u0003\u0000\u0000\u0528\u0529\u0005\u0006"+
		"\u0000\u0000\u0529\u052a\u0005\u0003\u0000\u0000\u052a\u052b\u0005\u0003"+
		"\u0000\u0000\u052b\u052c\u0005\u0003\u0000\u0000\u052c\u052d\u0005\u0003"+
		"\u0000\u0000\u052d\u052e\u0005\u0004\u0000\u0000\u052e\u052f\u0005\n\u0000"+
		"\u0000\u052f\u0530\u0005\u0003\u0000\u0000\u0530\u0531\u0005\u0006\u0000"+
		"\u0000\u0531\u0532\u0005\u0003\u0000\u0000\u0532\u0533\u0005\u0004\u0000"+
		"\u0000\u0533\u0534\u0005\n\u0000\u0000\u0534\u0535\u0005\u0003\u0000\u0000"+
		"\u0535\u0536\u0005\u0006\u0000\u0000\u0536\u0537\u0005\u0003\u0000\u0000"+
		"\u0537\u0538\u0005\u0004\u0000\u0000\u0538\u0539\u0005\n\u0000\u0000\u0539"+
		"\u053a\u0005\u0003\u0000\u0000\u053a\u053b\u0005\u0006\u0000\u0000\u053b"+
		"\u053c\u0005\u0003\u0000\u0000\u053c\u053d\u0005\u0004\u0000\u0000\u053d"+
		"\u053e\u0005\n\u0000\u0000\u053e\u053f\u0005\u0003\u0000\u0000\u053f\u0540"+
		"\u0005\u0006\u0000\u0000\u0540\u0541\u0005\u0003\u0000\u0000\u0541\u0542"+
		"\u0005\u0003\u0000\u0000\u0542\u0543\u0005\u0003\u0000\u0000\u0543\u0544"+
		"\u0005\u0003\u0000\u0000\u0544\u0545\u0005\u0003\u0000\u0000\u0545\u0546"+
		"\u0005\u0004\u0000\u0000\u0546\u0547\u0005\n\u0000\u0000\u0547\u0548\u0005"+
		"\u0003\u0000\u0000\u0548\u0549\u0005\u0006\u0000\u0000\u0549\u054a\u0005"+
		"\u0003\u0000\u0000\u054a\u054b\u0005\u0003\u0000\u0000\u054b\u054c\u0005"+
		"\u0003\u0000\u0000\u054c\u054d\u0005\u0004\u0000\u0000\u054d\u054e\u0005"+
		"\n\u0000\u0000\u054e\u054f\u0005\u0003\u0000\u0000\u054f\u0550\u0005\u0006"+
		"\u0000\u0000\u0550\u0551\u0005\u0003\u0000\u0000\u0551\u0552\u0005\u0003"+
		"\u0000\u0000\u0552\u0553\u0005\u0003\u0000\u0000\u0553\u0554\u0005\u0003"+
		"\u0000\u0000\u0554\u0555\u0005\u0003\u0000\u0000\u0555\u0556\u0005\u0004"+
		"\u0000\u0000\u0556\u0557\u0005\n\u0000\u0000\u0557\u0558\u0005\u0003\u0000"+
		"\u0000\u0558\u0559\u0005\u0006\u0000\u0000\u0559\u055a\u0005\u0003\u0000"+
		"\u0000\u055a\u055b\u0005\u0003\u0000\u0000\u055b\u055c\u0005\u0003\u0000"+
		"\u0000\u055c\u055d\u0005\u0003\u0000\u0000\u055d\u055e\u0005\u0003\u0000"+
		"\u0000\u055e\u055f\u0005\u0004\u0000\u0000\u055f\u0560\u0005\n\u0000\u0000"+
		"\u0560\u0561\u0005\u0003\u0000\u0000\u0561\u0562\u0005\u0006\u0000\u0000"+
		"\u0562\u0563\u0005\u0003\u0000\u0000\u0563\u0564\u0005\u0003\u0000\u0000"+
		"\u0564\u0565\u0005\u0003\u0000\u0000\u0565\u0566\u0005\u0003\u0000\u0000"+
		"\u0566\u0567\u0005\u0004\u0000\u0000\u0567\u0568\u0005\n\u0000\u0000\u0568"+
		"\u0569\u0005\u0003\u0000\u0000\u0569\u056a\u0005\u0006\u0000\u0000\u056a"+
		"\u056b\u0005\u0003\u0000\u0000\u056b\u056c\u0005\n\u0000\u0000\u056c\u056d"+
		"\u0005\u0004\u0000\u0000\u056d\u056e\u0005\n\u0000\u0000\u056e\u056f\u0005"+
		"\u0003\u0000\u0000\u056f\u0570\u0005\u0006\u0000\u0000\u0570\u0571\u0005"+
		"\u0003\u0000\u0000\u0571\u061b\u0005\u0004\u0000\u0000\u0572\u0573\u0005"+
		"\n\u0000\u0000\u0573\u0574\u0005\u0003\u0000\u0000\u0574\u0575\u0005\u0006"+
		"\u0000\u0000\u0575\u0576\u0005\u0003\u0000\u0000\u0576\u0577\u0003\u001c"+
		"\u000e\u0000\u0577\u0578\u0005\u0004\u0000\u0000\u0578\u0579\u0005\n\u0000"+
		"\u0000\u0579\u057a\u0005\u0003\u0000\u0000\u057a\u057b\u0005\u0006\u0000"+
		"\u0000\u057b\u057c\u0005\u0003\u0000\u0000\u057c\u057e\u0003\u001c\u000e"+
		"\u0000\u057d\u057f\u0003\u001c\u000e\u0000\u057e\u057d\u0001\u0000\u0000"+
		"\u0000\u057e\u057f\u0001\u0000\u0000\u0000\u057f\u0581\u0001\u0000\u0000"+
		"\u0000\u0580\u0582\u0003\u001c\u000e\u0000\u0581\u0580\u0001\u0000\u0000"+
		"\u0000\u0581\u0582\u0001\u0000\u0000\u0000\u0582\u0584\u0001\u0000\u0000"+
		"\u0000\u0583\u0585\u0003\u001c\u000e\u0000\u0584\u0583\u0001\u0000\u0000"+
		"\u0000\u0584\u0585\u0001\u0000\u0000\u0000\u0585\u0587\u0001\u0000\u0000"+
		"\u0000\u0586\u0588\u0003\u001c\u000e\u0000\u0587\u0586\u0001\u0000\u0000"+
		"\u0000\u0587\u0588\u0001\u0000\u0000\u0000\u0588\u058a\u0001\u0000\u0000"+
		"\u0000\u0589\u058b\u0003\u001c\u000e\u0000\u058a\u0589\u0001\u0000\u0000"+
		"\u0000\u058a\u058b\u0001\u0000\u0000\u0000\u058b\u058d\u0001\u0000\u0000"+
		"\u0000\u058c\u058e\u0003\u001c\u000e\u0000\u058d\u058c\u0001\u0000\u0000"+
		"\u0000\u058d\u058e\u0001\u0000\u0000\u0000\u058e\u0592\u0001\u0000\u0000"+
		"\u0000\u058f\u0591\u0003\u001c\u000e\u0000\u0590\u058f\u0001\u0000\u0000"+
		"\u0000\u0591\u0594\u0001\u0000\u0000\u0000\u0592\u0590\u0001\u0000\u0000"+
		"\u0000\u0592\u0593\u0001\u0000\u0000\u0000\u0593\u0595\u0001\u0000\u0000"+
		"\u0000\u0594\u0592\u0001\u0000\u0000\u0000\u0595\u0596\u0005\u0004\u0000"+
		"\u0000\u0596\u0597\u0005\n\u0000\u0000\u0597\u0598\u0005\u0003\u0000\u0000"+
		"\u0598\u0599\u0005\u0006\u0000\u0000\u0599\u059a\u0005\u0003\u0000\u0000"+
		"\u059a\u059e\u0003\u001c\u000e\u0000\u059b\u059d\u0003\u001c\u000e\u0000"+
		"\u059c\u059b\u0001\u0000\u0000\u0000\u059d\u05a0\u0001\u0000\u0000\u0000"+
		"\u059e\u059c\u0001\u0000\u0000\u0000\u059e\u059f\u0001\u0000\u0000\u0000"+
		"\u059f\u05a1\u0001\u0000\u0000\u0000\u05a0\u059e\u0001\u0000\u0000\u0000"+
		"\u05a1\u05a2\u0005\u0004\u0000\u0000\u05a2\u05a3\u0005\n\u0000\u0000\u05a3"+
		"\u05a4\u0005\u0003\u0000\u0000\u05a4\u05a5\u0005\u0006\u0000\u0000\u05a5"+
		"\u05a7\u0005\u0003\u0000\u0000\u05a6\u05a8\u0005\n\u0000\u0000\u05a7\u05a6"+
		"\u0001\u0000\u0000\u0000\u05a7\u05a8\u0001\u0000\u0000\u0000\u05a8\u05a9"+
		"\u0001\u0000\u0000\u0000\u05a9\u05aa\u0005\u0004\u0000\u0000\u05aa\u05ab"+
		"\u0005\n\u0000\u0000\u05ab\u05ac\u0005\u0003\u0000\u0000\u05ac\u05ad\u0005"+
		"\u0006\u0000\u0000\u05ad\u05ae\u0005\u0003\u0000\u0000\u05ae\u05af\u0005"+
		"\b\u0000\u0000\u05af\u05b0\u0005\u0004\u0000\u0000\u05b0\u05b1\u0005\n"+
		"\u0000\u0000\u05b1\u05b2\u0005\u0003\u0000\u0000\u05b2\u05b3\u0005\u0006"+
		"\u0000\u0000\u05b3\u05b4\u0005\u0003\u0000\u0000\u05b4\u05b5\u0005\b\u0000"+
		"\u0000\u05b5\u05b6\u0005\u0004\u0000\u0000\u05b6\u05b7\u0005\n\u0000\u0000"+
		"\u05b7\u05b8\u0005\u0003\u0000\u0000\u05b8\u05b9\u0005\u0006\u0000\u0000"+
		"\u05b9\u05ba\u0005\u0003\u0000\u0000\u05ba\u05bb\u0005\b\u0000\u0000\u05bb"+
		"\u05bc\u0005\u0004\u0000\u0000\u05bc\u05bd\u0005\n\u0000\u0000\u05bd\u05be"+
		"\u0005\u0003\u0000\u0000\u05be\u05bf\u0005\u0006\u0000\u0000\u05bf\u05c0"+
		"\u0005\u0003\u0000\u0000\u05c0\u05c1\u0005\b\u0000\u0000\u05c1\u05c2\u0005"+
		"\u0004\u0000\u0000\u05c2\u05c3\u0005\n\u0000\u0000\u05c3\u05c4\u0005\u0003"+
		"\u0000\u0000\u05c4\u05c5\u0005\u0006\u0000\u0000\u05c5\u05c6\u0005\u0003"+
		"\u0000\u0000\u05c6\u05c7\u0005\b\u0000\u0000\u05c7\u05c8\u0005\u0004\u0000"+
		"\u0000\u05c8\u05c9\u0005\n\u0000\u0000\u05c9\u05ca\u0005\u0003\u0000\u0000"+
		"\u05ca\u05cb\u0005\u0006\u0000\u0000\u05cb\u05cc\u0005\u0003\u0000\u0000"+
		"\u05cc\u05cd\u0005\b\u0000\u0000\u05cd\u05ce\u0005\u0004\u0000\u0000\u05ce"+
		"\u05cf\u0005\n\u0000\u0000\u05cf\u05d0\u0005\u0003\u0000\u0000\u05d0\u05d1"+
		"\u0005\u0006\u0000\u0000\u05d1\u05d2\u0005\u0003\u0000\u0000\u05d2\u05d3"+
		"\u0005\b\u0000\u0000\u05d3\u05d4\u0005\u0004\u0000\u0000\u05d4\u05d5\u0005"+
		"\n\u0000\u0000\u05d5\u05d6\u0005\u0003\u0000\u0000\u05d6\u05d7\u0005\u0006"+
		"\u0000\u0000\u05d7\u05d8\u0005\u0003\u0000\u0000\u05d8\u05d9\u0005\b\u0000"+
		"\u0000\u05d9\u05da\u0005\u0004\u0000\u0000\u05da\u05db\u0005\n\u0000\u0000"+
		"\u05db\u05dc\u0005\u0003\u0000\u0000\u05dc\u05dd\u0005\u0006\u0000\u0000"+
		"\u05dd\u05de\u0005\u0003\u0000\u0000\u05de\u05df\u0005\b\u0000\u0000\u05df"+
		"\u05e0\u0005\u0004\u0000\u0000\u05e0\u05e1\u0005\n\u0000\u0000\u05e1\u05e2"+
		"\u0005\u0003\u0000\u0000\u05e2\u05e3\u0005\u0006\u0000\u0000\u05e3\u05e4"+
		"\u0005\u0003\u0000\u0000\u05e4\u05e5\u0005\b\u0000\u0000\u05e5\u05e6\u0005"+
		"\u0004\u0000\u0000\u05e6\u05e7\u0005\n\u0000\u0000\u05e7\u05e8\u0005\u0003"+
		"\u0000\u0000\u05e8\u05e9\u0005\u0006\u0000\u0000\u05e9\u05ea\u0005\u0003"+
		"\u0000\u0000\u05ea\u05eb\u0005\u0004\u0000\u0000\u05eb\u05ec\u0006\u0004"+
		"\uffff\uffff\u0000\u05ec\u061c\u0001\u0000\u0000\u0000\u05ed\u05ee\u0005"+
		"\n\u0000\u0000\u05ee\u05ef\u0005\u0003\u0000\u0000\u05ef\u05f0\u0005\u0006"+
		"\u0000\u0000\u05f0\u05f1\u0005\u0003\u0000\u0000\u05f1\u05f2\u0005\b\u0000"+
		"\u0000\u05f2\u05f4\u0003\u001c\u000e\u0000\u05f3\u05f5\u0003\u001c\u000e"+
		"\u0000\u05f4\u05f3\u0001\u0000\u0000\u0000\u05f4\u05f5\u0001\u0000\u0000"+
		"\u0000\u05f5\u05f7\u0001\u0000\u0000\u0000\u05f6\u05f8\u0003\u001c\u000e"+
		"\u0000\u05f7\u05f6\u0001\u0000\u0000\u0000\u05f7\u05f8\u0001\u0000\u0000"+
		"\u0000\u05f8\u05fa\u0001\u0000\u0000\u0000\u05f9\u05fb\u0003\u001c\u000e"+
		"\u0000\u05fa\u05f9\u0001\u0000\u0000\u0000\u05fa\u05fb\u0001\u0000\u0000"+
		"\u0000\u05fb\u05fd\u0001\u0000\u0000\u0000\u05fc\u05fe\u0003\u001c\u000e"+
		"\u0000\u05fd\u05fc\u0001\u0000\u0000\u0000\u05fd\u05fe\u0001\u0000\u0000"+
		"\u0000\u05fe\u0600\u0001\u0000\u0000\u0000\u05ff\u0601\u0003\u001c\u000e"+
		"\u0000\u0600\u05ff\u0001\u0000\u0000\u0000\u0600\u0601\u0001\u0000\u0000"+
		"\u0000\u0601\u0603\u0001\u0000\u0000\u0000\u0602\u0604\u0003\u001c\u000e"+
		"\u0000\u0603\u0602\u0001\u0000\u0000\u0000\u0603\u0604\u0001\u0000\u0000"+
		"\u0000\u0604\u0608\u0001\u0000\u0000\u0000\u0605\u0607\u0003\u001c\u000e"+
		"\u0000\u0606\u0605\u0001\u0000\u0000\u0000\u0607\u060a\u0001\u0000\u0000"+
		"\u0000\u0608\u0606\u0001\u0000\u0000\u0000\u0608\u0609\u0001\u0000\u0000"+
		"\u0000\u0609\u060b\u0001\u0000\u0000\u0000\u060a\u0608\u0001\u0000\u0000"+
		"\u0000\u060b\u060c\u0005\b\u0000\u0000\u060c\u060d\u0005\u0004\u0000\u0000"+
		"\u060d\u060e\u0005\n\u0000\u0000\u060e\u060f\u0005\u0003\u0000\u0000\u060f"+
		"\u0610\u0005\u0006\u0000\u0000\u0610\u0611\u0005\u0003\u0000\u0000\u0611"+
		"\u0612\u0005\b\u0000\u0000\u0612\u0613\u0005\b\u0000\u0000\u0613\u0614"+
		"\u0005\b\u0000\u0000\u0614\u0615\u0005\b\u0000\u0000\u0615\u0616\u0005"+
		"\b\u0000\u0000\u0616\u0617\u0005\b\u0000\u0000\u0617\u0618\u0005\b\u0000"+
		"\u0000\u0618\u0619\u0005\u0004\u0000\u0000\u0619\u061a\u0006\u0004\uffff"+
		"\uffff\u0000\u061a\u061c\u0001\u0000\u0000\u0000\u061b\u0572\u0001\u0000"+
		"\u0000\u0000\u061b\u05ed\u0001\u0000\u0000\u0000\u061c\u061d\u0001\u0000"+
		"\u0000\u0000\u061d\u061b\u0001\u0000\u0000\u0000\u061d\u061e\u0001\u0000"+
		"\u0000\u0000\u061e\u061f\u0001\u0000\u0000\u0000\u061f\u0620\u0005\n\u0000"+
		"\u0000\u0620\u0621\u0005\u0003\u0000\u0000\u0621\u0622\u0005\n\u0000\u0000"+
		"\u0622\u0623\u0005\u0003\u0000\u0000\u0623\u0624\u0005\u0006\u0000\u0000"+
		"\u0624\u0625\u0005\u0004\u0000\u0000\u0625\u0627\u0001\u0000\u0000\u0000"+
		"\u0626\u0444\u0001\u0000\u0000\u0000\u0627\u0628\u0001\u0000\u0000\u0000"+
		"\u0628\u0626\u0001\u0000\u0000\u0000\u0628\u0629\u0001\u0000\u0000\u0000"+
		"\u0629\u062a\u0001\u0000\u0000\u0000\u062a\u062b\u0005\u0005\u0000\u0000"+
		"\u062b\u062c\u0005\u0003\u0000\u0000\u062c\u062d\u0005\n\u0000\u0000\u062d"+
		"\u062e\u0005\u0003\u0000\u0000\u062e\u062f\u0005\n\u0000\u0000\u062f\u0630"+
		"\u0005\n\u0000\u0000\u0630\u0631\u0005\n\u0000\u0000\u0631\u0632\u0005"+
		"\n\u0000\u0000\u0632\u0633\u0005\n\u0000\u0000\u0633\u0634\u0005\n\u0000"+
		"\u0000\u0634\u0635\u0005\u0003\u0000\u0000\u0635\u0636\u0005\n\u0000\u0000"+
		"\u0636\u0637\u0005\u0004\u0000\u0000\u0637\t\u0001\u0000\u0000\u0000\u0638"+
		"\u0639\u0005\u0005\u0000\u0000\u0639\u063a\u0005\u0003\u0000\u0000\u063a"+
		"\u063b\u0005\n\u0000\u0000\u063b\u063c\u0005\u0003\u0000\u0000\u063c\u063d"+
		"\u0005\n\u0000\u0000\u063d\u063e\u0005\u0003\u0000\u0000\u063e\u063f\u0005"+
		"\n\u0000\u0000\u063f\u06f9\u0005\u0004\u0000\u0000\u0640\u0641\u0005\b"+
		"\u0000\u0000\u0641\u0642\u0005\u0003\u0000\u0000\u0642\u0643\u0005\n\u0000"+
		"\u0000\u0643\u0644\u0005\n\u0000\u0000\u0644\u0645\u0005\u0003\u0000\u0000"+
		"\u0645\u06fa\u0005\u0004\u0000\u0000\u0646\u0647\u0005\n\u0000\u0000\u0647"+
		"\u0648\u0005\u0003\u0000\u0000\u0648\u0649\u0005\b\u0000\u0000\u0649\u064a"+
		"\u0005\u0003\u0000\u0000\u064a\u064b\u0005\n\u0000\u0000\u064b\u064c\u0005"+
		"\u0003\u0000\u0000\u064c\u064d\u0005\n\u0000\u0000\u064d\u064e\u0005\u0003"+
		"\u0000\u0000\u064e\u064f\u0005\n\u0000\u0000\u064f\u0650\u0005\u0003\u0000"+
		"\u0000\u0650\u0651\u0005\n\u0000\u0000\u0651\u0652\u0005\u0003\u0000\u0000"+
		"\u0652\u0653\u0005\n\u0000\u0000\u0653\u0654\u0005\u0003\u0000\u0000\u0654"+
		"\u0655\u0005\n\u0000\u0000\u0655\u0656\u0005\u0003\u0000\u0000\u0656\u0657"+
		"\u0005\n\u0000\u0000\u0657\u0658\u0005\u0003\u0000\u0000\u0658\u0659\u0005"+
		"\n\u0000\u0000\u0659\u065a\u0005\u0003\u0000\u0000\u065a\u065b\u0005\n"+
		"\u0000\u0000\u065b\u065c\u0005\u0003\u0000\u0000\u065c\u065d\u0005\n\u0000"+
		"\u0000\u065d\u065e\u0005\u0003\u0000\u0000\u065e\u065f\u0005\n\u0000\u0000"+
		"\u065f\u0660\u0005\u0003\u0000\u0000\u0660\u067d\u0005\u0004\u0000\u0000"+
		"\u0661\u0662\u0005\n\u0000\u0000\u0662\u0663\u0005\u0003\u0000\u0000\u0663"+
		"\u0664\u0005\b\u0000\u0000\u0664\u0665\u0005\u0003\u0000\u0000\u0665\u0666"+
		"\u0005\u0006\u0000\u0000\u0666\u0667\u0005\u0003\u0000\u0000\u0667\u0668"+
		"\u0005\b\u0000\u0000\u0668\u0669\u0005\u0003\u0000\u0000\u0669\u066a\u0005"+
		"\b\u0000\u0000\u066a\u066b\u0005\u0003\u0000\u0000\u066b\u066c\u0005\b"+
		"\u0000\u0000\u066c\u066d\u0005\u0003\u0000\u0000\u066d\u066e\u0005\b\u0000"+
		"\u0000\u066e\u066f\u0005\u0003\u0000\u0000\u066f\u0670\u0005\b\u0000\u0000"+
		"\u0670\u0671\u0005\u0003\u0000\u0000\u0671\u0672\u0005\b\u0000\u0000\u0672"+
		"\u0673\u0005\u0003\u0000\u0000\u0673\u0674\u0005\b\u0000\u0000\u0674\u0675"+
		"\u0005\u0003\u0000\u0000\u0675\u0676\u0005\b\u0000\u0000\u0676\u0677\u0005"+
		"\u0003\u0000\u0000\u0677\u0678\u0005\b\u0000\u0000\u0678\u0679\u0005\u0003"+
		"\u0000\u0000\u0679\u067a\u0005\b\u0000\u0000\u067a\u067b\u0005\u0003\u0000"+
		"\u0000\u067b\u067c\u0005\u0004\u0000\u0000\u067c\u067e\u0006\u0005\uffff"+
		"\uffff\u0000\u067d\u0661\u0001\u0000\u0000\u0000\u067e\u067f\u0001\u0000"+
		"\u0000\u0000\u067f\u067d\u0001\u0000\u0000\u0000\u067f\u0680\u0001\u0000"+
		"\u0000\u0000\u0680\u06ee\u0001\u0000\u0000\u0000\u0681\u0682\u0005\n\u0000"+
		"\u0000\u0682\u0683\u0005\u0003\u0000\u0000\u0683\u0684\u0005\b\u0000\u0000"+
		"\u0684\u0685\u0005\u0003\u0000\u0000\u0685\u0686\u0005\n\u0000\u0000\u0686"+
		"\u0687\u0005\u0003\u0000\u0000\u0687\u0688\u0005\n\u0000\u0000\u0688\u0689"+
		"\u0005\u0003\u0000\u0000\u0689\u068a\u0005\n\u0000\u0000\u068a\u068b\u0005"+
		"\u0003\u0000\u0000\u068b\u068c\u0005\n\u0000\u0000\u068c\u068d\u0005\u0003"+
		"\u0000\u0000\u068d\u068e\u0005\n\u0000\u0000\u068e\u068f\u0005\u0003\u0000"+
		"\u0000\u068f\u0690\u0005\n\u0000\u0000\u0690\u0691\u0005\u0003\u0000\u0000"+
		"\u0691\u0692\u0005\n\u0000\u0000\u0692\u0693\u0005\u0003\u0000\u0000\u0693"+
		"\u0694\u0005\n\u0000\u0000\u0694\u0695\u0005\u0003\u0000\u0000\u0695\u0696"+
		"\u0005\n\u0000\u0000\u0696\u0697\u0005\u0003\u0000\u0000\u0697\u0698\u0005"+
		"\n\u0000\u0000\u0698\u0699\u0005\u0003\u0000\u0000\u0699\u069a\u0005\n"+
		"\u0000\u0000\u069a\u069b\u0005\u0003\u0000\u0000\u069b\u069c\u0005\n\u0000"+
		"\u0000\u069c\u069d\u0005\u0003\u0000\u0000\u069d\u069e\u0005\n\u0000\u0000"+
		"\u069e\u069f\u0005\u0003\u0000\u0000\u069f\u06a0\u0005\n\u0000\u0000\u06a0"+
		"\u06a1\u0005\u0003\u0000\u0000\u06a1\u06a2\u0005\n\u0000\u0000\u06a2\u06a3"+
		"\u0005\u0003\u0000\u0000\u06a3\u06a4\u0005\n\u0000\u0000\u06a4\u06a5\u0005"+
		"\u0003\u0000\u0000\u06a5\u06a6\u0005\n\u0000\u0000\u06a6\u06a7\u0005\u0003"+
		"\u0000\u0000\u06a7\u06e9\u0005\u0004\u0000\u0000\u06a8\u06a9\u0005\n\u0000"+
		"\u0000\u06a9\u06aa\u0005\u0003\u0000\u0000\u06aa\u06ab\u0005\b\u0000\u0000"+
		"\u06ab\u06ac\u0005\u0003\u0000\u0000\u06ac\u06ad\u0005\u0006\u0000\u0000"+
		"\u06ad\u06ae\u0005\u0003\u0000\u0000\u06ae\u06af\u0005\b\u0000\u0000\u06af"+
		"\u06b0\u0005\u0003\u0000\u0000\u06b0\u06b1\u0005\b\u0000\u0000\u06b1\u06b2"+
		"\u0005\u0003\u0000\u0000\u06b2\u06b3\u0005\b\u0000\u0000\u06b3\u06b4\u0005"+
		"\u0003\u0000\u0000\u06b4\u06b5\u0005\b\u0000\u0000\u06b5\u06b6\u0005\u0003"+
		"\u0000\u0000\u06b6\u06b7\u0005\b\u0000\u0000\u06b7\u06b8\u0005\u0003\u0000"+
		"\u0000\u06b8\u06b9\u0005\b\u0000\u0000\u06b9\u06ba\u0005\u0003\u0000\u0000"+
		"\u06ba\u06bb\u0005\b\u0000\u0000\u06bb\u06bc\u0005\u0003\u0000\u0000\u06bc"+
		"\u06bd\u0005\b\u0000\u0000\u06bd\u06be\u0005\u0003\u0000\u0000\u06be\u06bf"+
		"\u0005\b\u0000\u0000\u06bf\u06c0\u0005\u0003\u0000\u0000\u06c0\u06c1\u0005"+
		"\b\u0000\u0000\u06c1\u06c2\u0005\u0003\u0000\u0000\u06c2\u06c3\u0005\b"+
		"\u0000\u0000\u06c3\u06c4\u0005\u0003\u0000\u0000\u06c4\u06c5\u0005\b\u0000"+
		"\u0000\u06c5\u06c6\u0005\u0003\u0000\u0000\u06c6\u06c8\u0003\u001c\u000e"+
		"\u0000\u06c7\u06c9\u0003\u001c\u000e\u0000\u06c8\u06c7\u0001\u0000\u0000"+
		"\u0000\u06c8\u06c9\u0001\u0000\u0000\u0000\u06c9\u06cb\u0001\u0000\u0000"+
		"\u0000\u06ca\u06cc\u0003\u001c\u000e\u0000\u06cb\u06ca\u0001\u0000\u0000"+
		"\u0000\u06cb\u06cc\u0001\u0000\u0000\u0000\u06cc\u06ce\u0001\u0000\u0000"+
		"\u0000\u06cd\u06cf\u0003\u001c\u000e\u0000\u06ce\u06cd\u0001\u0000\u0000"+
		"\u0000\u06ce\u06cf\u0001\u0000\u0000\u0000\u06cf\u06d1\u0001\u0000\u0000"+
		"\u0000\u06d0\u06d2\u0003\u001c\u000e\u0000\u06d1\u06d0\u0001\u0000\u0000"+
		"\u0000\u06d1\u06d2\u0001\u0000\u0000\u0000\u06d2\u06d4\u0001\u0000\u0000"+
		"\u0000\u06d3\u06d5\u0003\u001c\u000e\u0000\u06d4\u06d3\u0001\u0000\u0000"+
		"\u0000\u06d4\u06d5\u0001\u0000\u0000\u0000\u06d5\u06d7\u0001\u0000\u0000"+
		"\u0000\u06d6\u06d8\u0003\u001c\u000e\u0000\u06d7\u06d6\u0001\u0000\u0000"+
		"\u0000\u06d7\u06d8\u0001\u0000\u0000\u0000\u06d8\u06dc\u0001\u0000\u0000"+
		"\u0000\u06d9\u06db\u0003\u001c\u000e\u0000\u06da\u06d9\u0001\u0000\u0000"+
		"\u0000\u06db\u06de\u0001\u0000\u0000\u0000\u06dc\u06da\u0001\u0000\u0000"+
		"\u0000\u06dc\u06dd\u0001\u0000\u0000\u0000\u06dd\u06df\u0001\u0000\u0000"+
		"\u0000\u06de\u06dc\u0001\u0000\u0000\u0000\u06df\u06e0\u0005\u0003\u0000"+
		"\u0000\u06e0\u06e1\u0005\b\u0000\u0000\u06e1\u06e2\u0005\u0003\u0000\u0000"+
		"\u06e2\u06e3\u0005\b\u0000\u0000\u06e3\u06e4\u0005\u0003\u0000\u0000\u06e4"+
		"\u06e5\u0005\b\u0000\u0000\u06e5\u06e6\u0005\u0003\u0000\u0000\u06e6\u06e7"+
		"\u0005\u0004\u0000\u0000\u06e7\u06e8\u0006\u0005\uffff\uffff\u0000\u06e8"+
		"\u06ea\u0001\u0000\u0000\u0000\u06e9\u06a8\u0001\u0000\u0000\u0000\u06ea"+
		"\u06eb\u0001\u0000\u0000\u0000\u06eb\u06e9\u0001\u0000\u0000\u0000\u06eb"+
		"\u06ec\u0001\u0000\u0000\u0000\u06ec\u06ee\u0001\u0000\u0000\u0000\u06ed"+
		"\u0646\u0001\u0000\u0000\u0000\u06ed\u0681\u0001\u0000\u0000\u0000\u06ee"+
		"\u06f0\u0001\u0000\u0000\u0000\u06ef\u06ed\u0001\u0000\u0000\u0000\u06f0"+
		"\u06f1\u0001\u0000\u0000\u0000\u06f1\u06ef\u0001\u0000\u0000\u0000\u06f1"+
		"\u06f2\u0001\u0000\u0000\u0000\u06f2\u06f3\u0001\u0000\u0000\u0000\u06f3"+
		"\u06f4\u0005\n\u0000\u0000\u06f4\u06f5\u0005\u0003\u0000\u0000\u06f5\u06f6"+
		"\u0005\n\u0000\u0000\u06f6\u06f7\u0005\u0003\u0000\u0000\u06f7\u06f8\u0005"+
		"\u0006\u0000\u0000\u06f8\u06fa\u0005\u0004\u0000\u0000\u06f9\u0640\u0001"+
		"\u0000\u0000\u0000\u06f9\u06ef\u0001\u0000\u0000\u0000\u06fa\u06fb\u0001"+
		"\u0000\u0000\u0000\u06fb\u06f9\u0001\u0000\u0000\u0000\u06fb\u06fc\u0001"+
		"\u0000\u0000\u0000\u06fc\u06fd\u0001\u0000\u0000\u0000\u06fd\u06fe\u0005"+
		"\u0005\u0000\u0000\u06fe\u06ff\u0005\u0003\u0000\u0000\u06ff\u0700\u0005"+
		"\n\u0000\u0000\u0700\u0701\u0005\u0003\u0000\u0000\u0701\u0702\u0005\n"+
		"\u0000\u0000\u0702\u0703\u0005\u0003\u0000\u0000\u0703\u0704\u0005\n\u0000"+
		"\u0000\u0704\u0705\u0005\u0004\u0000\u0000\u0705\u000b\u0001\u0000\u0000"+
		"\u0000\u0706\u0707\u0005\u0005\u0000\u0000\u0707\u0708\u0005\u0003\u0000"+
		"\u0000\u0708\u0709\u0005\n\u0000\u0000\u0709\u070a\u0005\u0003\u0000\u0000"+
		"\u070a\u070b\u0005\n\u0000\u0000\u070b\u070c\u0005\n\u0000\u0000\u070c"+
		"\u070d\u0005\n\u0000\u0000\u070d\u070e\u0005\u0003\u0000\u0000\u070e\u070f"+
		"\u0005\n\u0000\u0000\u070f\u0710\u0005\u0003\u0000\u0000\u0710\u0711\u0005"+
		"\n\u0000\u0000\u0711\u0792\u0005\u0004\u0000\u0000\u0712\u0713\u0005\n"+
		"\u0000\u0000\u0713\u0714\u0005\u0003\u0000\u0000\u0714\u0715\u0005\u0004"+
		"\u0000\u0000\u0715\u0716\u0005\n\u0000\u0000\u0716\u0717\u0005\u0003\u0000"+
		"\u0000\u0717\u0718\u0005\n\u0000\u0000\u0718\u0719\u0005\u0003\u0000\u0000"+
		"\u0719\u071a\u0005\n\u0000\u0000\u071a\u071b\u0005\u0003\u0000\u0000\u071b"+
		"\u071c\u0005\u0003\u0000\u0000\u071c\u071d\u0005\n\u0000\u0000\u071d\u071e"+
		"\u0005\u0003\u0000\u0000\u071e\u071f\u0005\n\u0000\u0000\u071f\u0720\u0005"+
		"\u0003\u0000\u0000\u0720\u0721\u0005\n\u0000\u0000\u0721\u0722\u0005\u0003"+
		"\u0000\u0000\u0722\u0723\u0005\n\u0000\u0000\u0723\u0724\u0005\u0004\u0000"+
		"\u0000\u0724\u0725\u0005\n\u0000\u0000\u0725\u0726\u0005\u0003\u0000\u0000"+
		"\u0726\u0727\u0005\u0003\u0000\u0000\u0727\u0728\u0005\u0003\u0000\u0000"+
		"\u0728\u0729\u0005\n\u0000\u0000\u0729\u072a\u0005\u0003\u0000\u0000\u072a"+
		"\u072b\u0005\u0003\u0000\u0000\u072b\u072c\u0005\u0003\u0000\u0000\u072c"+
		"\u072d\u0005\u0003\u0000\u0000\u072d\u072e\u0005\u0003\u0000\u0000\u072e"+
		"\u072f\u0005\u0003\u0000\u0000\u072f\u0730\u0005\n\u0000\u0000\u0730\u0731"+
		"\u0005\u0003\u0000\u0000\u0731\u0732\u0005\n\u0000\u0000\u0732\u0733\u0005"+
		"\u0003\u0000\u0000\u0733\u0787\u0005\u0004\u0000\u0000\u0734\u0735\u0005"+
		"\n\u0000\u0000\u0735\u0736\u0005\u0003\u0000\u0000\u0736\u0737\u0005\u0003"+
		"\u0000\u0000\u0737\u0739\u0003\u001c\u000e\u0000\u0738\u073a\u0003\u001c"+
		"\u000e\u0000\u0739\u0738\u0001\u0000\u0000\u0000\u0739\u073a\u0001\u0000"+
		"\u0000\u0000\u073a\u073c\u0001\u0000\u0000\u0000\u073b\u073d\u0003\u001c"+
		"\u000e\u0000\u073c\u073b\u0001\u0000\u0000\u0000\u073c\u073d\u0001\u0000"+
		"\u0000\u0000\u073d\u073f\u0001\u0000\u0000\u0000\u073e\u0740\u0003\u001c"+
		"\u000e\u0000\u073f\u073e\u0001\u0000\u0000\u0000\u073f\u0740\u0001\u0000"+
		"\u0000\u0000\u0740\u0742\u0001\u0000\u0000\u0000\u0741\u0743\u0003\u001c"+
		"\u000e\u0000\u0742\u0741\u0001\u0000\u0000\u0000\u0742\u0743\u0001\u0000"+
		"\u0000\u0000\u0743\u0745\u0001\u0000\u0000\u0000\u0744\u0746\u0003\u001c"+
		"\u000e\u0000\u0745\u0744\u0001\u0000\u0000\u0000\u0745\u0746\u0001\u0000"+
		"\u0000\u0000\u0746\u0748\u0001\u0000\u0000\u0000\u0747\u0749\u0003\u001c"+
		"\u000e\u0000\u0748\u0747\u0001\u0000\u0000\u0000\u0748\u0749\u0001\u0000"+
		"\u0000\u0000\u0749\u074d\u0001\u0000\u0000\u0000\u074a\u074c\u0003\u001c"+
		"\u000e\u0000\u074b\u074a\u0001\u0000\u0000\u0000\u074c\u074f\u0001\u0000"+
		"\u0000\u0000\u074d\u074b\u0001\u0000\u0000\u0000\u074d\u074e\u0001\u0000"+
		"\u0000\u0000\u074e\u0750\u0001\u0000\u0000\u0000\u074f\u074d\u0001\u0000"+
		"\u0000\u0000\u0750\u0751\u0005\u0003\u0000\u0000\u0751\u0752\u0005\b\u0000"+
		"\u0000\u0752\u0753\u0005\u0003\u0000\u0000\u0753\u0755\u0003\u001c\u000e"+
		"\u0000\u0754\u0756\u0003\u001c\u000e\u0000\u0755\u0754\u0001\u0000\u0000"+
		"\u0000\u0755\u0756\u0001\u0000\u0000\u0000\u0756\u0758\u0001\u0000\u0000"+
		"\u0000\u0757\u0759\u0003\u001c\u000e\u0000\u0758\u0757\u0001\u0000\u0000"+
		"\u0000\u0758\u0759\u0001\u0000\u0000\u0000\u0759\u075b\u0001\u0000\u0000"+
		"\u0000\u075a\u075c\u0003\u001c\u000e\u0000\u075b\u075a\u0001\u0000\u0000"+
		"\u0000\u075b\u075c\u0001\u0000\u0000\u0000\u075c\u075e\u0001\u0000\u0000"+
		"\u0000\u075d\u075f\u0003\u001c\u000e\u0000\u075e\u075d\u0001\u0000\u0000"+
		"\u0000\u075e\u075f\u0001\u0000\u0000\u0000\u075f\u0761\u0001\u0000\u0000"+
		"\u0000\u0760\u0762\u0003\u001c\u000e\u0000\u0761\u0760\u0001\u0000\u0000"+
		"\u0000\u0761\u0762\u0001\u0000\u0000\u0000\u0762\u0764\u0001\u0000\u0000"+
		"\u0000\u0763\u0765\u0003\u001c\u000e\u0000\u0764\u0763\u0001\u0000\u0000"+
		"\u0000\u0764\u0765\u0001\u0000\u0000\u0000\u0765\u0769\u0001\u0000\u0000"+
		"\u0000\u0766\u0768\u0003\u001c\u000e\u0000\u0767\u0766\u0001\u0000\u0000"+
		"\u0000\u0768\u076b\u0001\u0000\u0000\u0000\u0769\u0767\u0001\u0000\u0000"+
		"\u0000\u0769\u076a\u0001\u0000\u0000\u0000\u076a\u076c\u0001\u0000\u0000"+
		"\u0000\u076b\u0769\u0001\u0000\u0000\u0000\u076c\u076d\u0005\u0003\u0000"+
		"\u0000\u076d\u076e\u0005\b\u0000\u0000\u076e\u076f\u0005\u0003\u0000\u0000"+
		"\u076f\u0770\u0005\b\u0000\u0000\u0770\u0771\u0005\u0003\u0000\u0000\u0771"+
		"\u0772\u0005\b\u0000\u0000\u0772\u0773\u0005\u0003\u0000\u0000\u0773\u0774"+
		"\u0005\u0003\u0000\u0000\u0774\u0776\u0005\u0003\u0000\u0000\u0775\u0777"+
		"\u0005\b\u0000\u0000\u0776\u0775\u0001\u0000\u0000\u0000\u0776\u0777\u0001"+
		"\u0000\u0000\u0000\u0777\u0778\u0001\u0000\u0000\u0000\u0778\u0779\u0005"+
		"\u0003\u0000\u0000\u0779\u077a\u0005\u0003\u0000\u0000\u077a\u077b\u0005"+
		"\u0003\u0000\u0000\u077b\u077c\u0005\u0003\u0000\u0000\u077c\u077d\u0005"+
		"\u0003\u0000\u0000\u077d\u077f\u0005\u0003\u0000\u0000\u077e\u0780\u0005"+
		"\b\u0000\u0000\u077f\u077e\u0001\u0000\u0000\u0000\u077f\u0780\u0001\u0000"+
		"\u0000\u0000\u0780\u0781\u0001\u0000\u0000\u0000\u0781\u0782\u0005\u0003"+
		"\u0000\u0000\u0782\u0783\u0005\n\u0000\u0000\u0783\u0784\u0005\u0003\u0000"+
		"\u0000\u0784\u0785\u0005\u0004\u0000\u0000\u0785\u0786\u0006\u0006\uffff"+
		"\uffff\u0000\u0786\u0788\u0001\u0000\u0000\u0000\u0787\u0734\u0001\u0000"+
		"\u0000\u0000\u0788\u0789\u0001\u0000\u0000\u0000\u0789\u0787\u0001\u0000"+
		"\u0000\u0000\u0789\u078a\u0001\u0000\u0000\u0000\u078a\u078b\u0001\u0000"+
		"\u0000\u0000\u078b\u078c\u0005\n\u0000\u0000\u078c\u078d\u0005\u0003\u0000"+
		"\u0000\u078d\u078e\u0005\n\u0000\u0000\u078e\u078f\u0005\u0003\u0000\u0000"+
		"\u078f\u0790\u0005\u0006\u0000\u0000\u0790\u0791\u0005\u0004\u0000\u0000"+
		"\u0791\u0793\u0001\u0000\u0000\u0000\u0792\u0712\u0001\u0000\u0000\u0000"+
		"\u0793\u0794\u0001\u0000\u0000\u0000\u0794\u0792\u0001\u0000\u0000\u0000"+
		"\u0794\u0795\u0001\u0000\u0000\u0000\u0795\u0796\u0001\u0000\u0000\u0000"+
		"\u0796\u0797\u0005\u0005\u0000\u0000\u0797\u0798\u0005\u0003\u0000\u0000"+
		"\u0798\u0799\u0005\n\u0000\u0000\u0799\u079a\u0005\u0003\u0000\u0000\u079a"+
		"\u079b\u0005\n\u0000\u0000\u079b\u079c\u0005\n\u0000\u0000\u079c\u079d"+
		"\u0005\n\u0000\u0000\u079d\u079e\u0005\u0003\u0000\u0000\u079e\u079f\u0005"+
		"\n\u0000\u0000\u079f\u07a0\u0005\u0003\u0000\u0000\u07a0\u07a1\u0005\n"+
		"\u0000\u0000\u07a1\u07a2\u0005\u0004\u0000\u0000\u07a2\r\u0001\u0000\u0000"+
		"\u0000\u07a3\u07a4\u0005\u0005\u0000\u0000\u07a4\u07a5\u0005\u0003\u0000"+
		"\u0000\u07a5\u07a6\u0005\n\u0000\u0000\u07a6\u07a7\u0005\n\u0000\u0000"+
		"\u07a7\u07a8\u0005\u0003\u0000\u0000\u07a8\u07a9\u0005\n\u0000\u0000\u07a9"+
		"\u07aa\u0005\u0003\u0000\u0000\u07aa\u07ab\u0005\n\u0000\u0000\u07ab\u07ac"+
		"\u0005\u0003\u0000\u0000\u07ac\u07ad\u0005\n\u0000\u0000\u07ad\u083b\u0005"+
		"\u0004\u0000\u0000\u07ae\u07af\u0005\b\u0000\u0000\u07af\u07b1\u0005\u0003"+
		"\u0000\u0000\u07b0\u07b2\u0003\u001c\u000e\u0000\u07b1\u07b0\u0001\u0000"+
		"\u0000\u0000\u07b2\u07b3\u0001\u0000\u0000\u0000\u07b3\u07b1\u0001\u0000"+
		"\u0000\u0000\u07b3\u07b4\u0001\u0000\u0000\u0000\u07b4\u07b5\u0001\u0000"+
		"\u0000\u0000\u07b5\u07b6\u0005\u0004\u0000\u0000\u07b6\u07b7\u0005\u0005"+
		"\u0000\u0000\u07b7\u07b8\u0005\u0003\u0000\u0000\u07b8\u07ba\u0003\u001c"+
		"\u000e\u0000\u07b9\u07bb\u0003\u001c\u000e\u0000\u07ba\u07b9\u0001\u0000"+
		"\u0000\u0000\u07ba\u07bb\u0001\u0000\u0000\u0000\u07bb\u07bd\u0001\u0000"+
		"\u0000\u0000\u07bc\u07be\u0003\u001c\u000e\u0000\u07bd\u07bc\u0001\u0000"+
		"\u0000\u0000\u07bd\u07be\u0001\u0000\u0000\u0000\u07be\u07c0\u0001\u0000"+
		"\u0000\u0000\u07bf\u07c1\u0003\u001c\u000e\u0000\u07c0\u07bf\u0001\u0000"+
		"\u0000\u0000\u07c0\u07c1\u0001\u0000\u0000\u0000\u07c1\u07c3\u0001\u0000"+
		"\u0000\u0000\u07c2\u07c4\u0003\u001c\u000e\u0000\u07c3\u07c2\u0001\u0000"+
		"\u0000\u0000\u07c3\u07c4\u0001\u0000\u0000\u0000\u07c4\u07c6\u0001\u0000"+
		"\u0000\u0000\u07c5\u07c7\u0003\u001c\u000e\u0000\u07c6\u07c5\u0001\u0000"+
		"\u0000\u0000\u07c6\u07c7\u0001\u0000\u0000\u0000\u07c7\u07c9\u0001\u0000"+
		"\u0000\u0000\u07c8\u07ca\u0003\u001c\u000e\u0000\u07c9\u07c8\u0001\u0000"+
		"\u0000\u0000\u07c9\u07ca\u0001\u0000\u0000\u0000\u07ca\u07ce\u0001\u0000"+
		"\u0000\u0000\u07cb\u07cd\u0003\u001c\u000e\u0000\u07cc\u07cb\u0001\u0000"+
		"\u0000\u0000\u07cd\u07d0\u0001\u0000\u0000\u0000\u07ce\u07cc\u0001\u0000"+
		"\u0000\u0000\u07ce\u07cf\u0001\u0000\u0000\u0000\u07cf\u07d1\u0001\u0000"+
		"\u0000\u0000\u07d0\u07ce\u0001\u0000\u0000\u0000\u07d1\u07d2\u0005\u0004"+
		"\u0000\u0000\u07d2\u07d3\u0005\u0005\u0000\u0000\u07d3\u07d4\u0005\u0003"+
		"\u0000\u0000\u07d4\u07d6\u0003\u001c\u000e\u0000\u07d5\u07d7\u0003\u001c"+
		"\u000e\u0000\u07d6\u07d5\u0001\u0000\u0000\u0000\u07d6\u07d7\u0001\u0000"+
		"\u0000\u0000\u07d7\u07d9\u0001\u0000\u0000\u0000\u07d8\u07da\u0003\u001c"+
		"\u000e\u0000\u07d9\u07d8\u0001\u0000\u0000\u0000\u07d9\u07da\u0001\u0000"+
		"\u0000\u0000\u07da\u07dc\u0001\u0000\u0000\u0000\u07db\u07dd\u0003\u001c"+
		"\u000e\u0000\u07dc\u07db\u0001\u0000\u0000\u0000\u07dc\u07dd\u0001\u0000"+
		"\u0000\u0000\u07dd\u07df\u0001\u0000\u0000\u0000\u07de\u07e0\u0003\u001c"+
		"\u000e\u0000\u07df\u07de\u0001\u0000\u0000\u0000\u07df\u07e0\u0001\u0000"+
		"\u0000\u0000\u07e0\u07e2\u0001\u0000\u0000\u0000\u07e1\u07e3\u0003\u001c"+
		"\u000e\u0000\u07e2\u07e1\u0001\u0000\u0000\u0000\u07e2\u07e3\u0001\u0000"+
		"\u0000\u0000\u07e3\u07e5\u0001\u0000\u0000\u0000\u07e4\u07e6\u0003\u001c"+
		"\u000e\u0000\u07e5\u07e4\u0001\u0000\u0000\u0000\u07e5\u07e6\u0001\u0000"+
		"\u0000\u0000\u07e6\u07ea\u0001\u0000\u0000\u0000\u07e7\u07e9\u0003\u001c"+
		"\u000e\u0000\u07e8\u07e7\u0001\u0000\u0000\u0000\u07e9\u07ec\u0001\u0000"+
		"\u0000\u0000\u07ea\u07e8\u0001\u0000\u0000\u0000\u07ea\u07eb\u0001\u0000"+
		"\u0000\u0000\u07eb\u07ed\u0001\u0000\u0000\u0000\u07ec\u07ea\u0001\u0000"+
		"\u0000\u0000\u07ed\u07ee\u0005\u0004\u0000\u0000\u07ee\u07ef\u0005\u0005"+
		"\u0000\u0000\u07ef\u07f0\u0005\u0003\u0000\u0000\u07f0\u07f1\u0005\b\u0000"+
		"\u0000\u07f1\u07f2\u0005\u0004\u0000\u0000\u07f2\u07f3\u0006\u0007\uffff"+
		"\uffff\u0000\u07f3\u0830\u0001\u0000\u0000\u0000\u07f4\u07f5\u0005\n\u0000"+
		"\u0000\u07f5\u07f6\u0005\u0003\u0000\u0000\u07f6\u07f7\u0005\n\u0000\u0000"+
		"\u07f7\u07f8\u0005\u0003\u0000\u0000\u07f8\u07f9\u0005\n\u0000\u0000\u07f9"+
		"\u07fa\u0005\u0003\u0000\u0000\u07fa\u07fb\u0005\n\u0000\u0000\u07fb\u07fc"+
		"\u0005\u0003\u0000\u0000\u07fc\u07fd\u0005\n\u0000\u0000\u07fd\u07fe\u0005"+
		"\u0003\u0000\u0000\u07fe\u07ff\u0005\n\u0000\u0000\u07ff\u0800\u0005\u0003"+
		"\u0000\u0000\u0800\u0801\u0005\n\u0000\u0000\u0801\u0802\u0005\u0003\u0000"+
		"\u0000\u0802\u0803\u0005\n\u0000\u0000\u0803\u0804\u0005\u0003\u0000\u0000"+
		"\u0804\u082c\u0005\u0004\u0000\u0000\u0805\u0806\u0005\u0003\u0000\u0000"+
		"\u0806\u0807\u0005\u0003\u0000\u0000\u0807\u0808\u0005\u0003\u0000\u0000"+
		"\u0808\u0809\u0005\u0003\u0000\u0000\u0809\u080a\u0005\u0003\u0000\u0000"+
		"\u080a\u080b\u0005\u0003\u0000\u0000\u080b\u080c\u0005\u0003\u0000\u0000"+
		"\u080c\u080d\u0005\u0003\u0000\u0000\u080d\u082d\u0005\u0004\u0000\u0000"+
		"\u080e\u0810\u0005\u0006\u0000\u0000\u080f\u080e\u0001\u0000\u0000\u0000"+
		"\u080f\u0810\u0001\u0000\u0000\u0000\u0810\u0811\u0001\u0000\u0000\u0000"+
		"\u0811\u0813\u0005\u0003\u0000\u0000\u0812\u0814\u0005\b\u0000\u0000\u0813"+
		"\u0812\u0001\u0000\u0000\u0000\u0813\u0814\u0001\u0000\u0000\u0000\u0814"+
		"\u0815\u0001\u0000\u0000\u0000\u0815\u0817\u0005\u0003\u0000\u0000\u0816"+
		"\u0818\u0005\b\u0000\u0000\u0817\u0816\u0001\u0000\u0000\u0000\u0817\u0818"+
		"\u0001\u0000\u0000\u0000\u0818\u0819\u0001\u0000\u0000\u0000\u0819\u081b"+
		"\u0005\u0003\u0000\u0000\u081a\u081c\u0005\b\u0000\u0000\u081b\u081a\u0001"+
		"\u0000\u0000\u0000\u081b\u081c\u0001\u0000\u0000\u0000\u081c\u081d\u0001"+
		"\u0000\u0000\u0000\u081d\u081f\u0005\u0003\u0000\u0000\u081e\u0820\u0005"+
		"\b\u0000\u0000\u081f\u081e\u0001\u0000\u0000\u0000\u081f\u0820\u0001\u0000"+
		"\u0000\u0000\u0820\u0821\u0001\u0000\u0000\u0000\u0821\u0822\u0005\u0003"+
		"\u0000\u0000\u0822\u0823\u0005\b\u0000\u0000\u0823\u0824\u0005\u0003\u0000"+
		"\u0000\u0824\u0825\u0005\b\u0000\u0000\u0825\u0827\u0005\u0003\u0000\u0000"+
		"\u0826\u0828\u0005\b\u0000\u0000\u0827\u0826\u0001\u0000\u0000\u0000\u0827"+
		"\u0828\u0001\u0000\u0000\u0000\u0828\u0829\u0001\u0000\u0000\u0000\u0829"+
		"\u082a\u0005\u0003\u0000\u0000\u082a\u082b\u0005\u0004\u0000\u0000\u082b"+
		"\u082d\u0006\u0007\uffff\uffff\u0000\u082c\u0805\u0001\u0000\u0000\u0000"+
		"\u082c\u080f\u0001\u0000\u0000\u0000\u082d\u082e\u0001\u0000\u0000\u0000"+
		"\u082e\u082c\u0001\u0000\u0000\u0000\u082e\u082f\u0001\u0000\u0000\u0000"+
		"\u082f\u0831\u0001\u0000\u0000\u0000\u0830\u07f4\u0001\u0000\u0000\u0000"+
		"\u0831\u0832\u0001\u0000\u0000\u0000\u0832\u0830\u0001\u0000\u0000\u0000"+
		"\u0832\u0833\u0001\u0000\u0000\u0000\u0833\u0834\u0001\u0000\u0000\u0000"+
		"\u0834\u0835\u0005\n\u0000\u0000\u0835\u0836\u0005\u0003\u0000\u0000\u0836"+
		"\u0837\u0005\n\u0000\u0000\u0837\u0838\u0005\u0003\u0000\u0000\u0838\u0839"+
		"\u0005\u0006\u0000\u0000\u0839\u083a\u0005\u0004\u0000\u0000\u083a\u083c"+
		"\u0001\u0000\u0000\u0000\u083b\u07ae\u0001\u0000\u0000\u0000\u083c\u083d"+
		"\u0001\u0000\u0000\u0000\u083d\u083b\u0001\u0000\u0000\u0000\u083d\u083e"+
		"\u0001\u0000\u0000\u0000\u083e\u083f\u0001\u0000\u0000\u0000\u083f\u0840"+
		"\u0005\u0005\u0000\u0000\u0840\u0841\u0005\u0003\u0000\u0000\u0841\u0842"+
		"\u0005\n\u0000\u0000\u0842\u0843\u0005\n\u0000\u0000\u0843\u0844\u0005"+
		"\u0003\u0000\u0000\u0844\u0845\u0005\n\u0000\u0000\u0845\u0846\u0005\u0003"+
		"\u0000\u0000\u0846\u0847\u0005\n\u0000\u0000\u0847\u0848\u0005\u0003\u0000"+
		"\u0000\u0848\u0849\u0005\n\u0000\u0000\u0849\u084a\u0005\u0004\u0000\u0000"+
		"\u084a\u000f\u0001\u0000\u0000\u0000\u084b\u084c\u0005\u0005\u0000\u0000"+
		"\u084c\u084d\u0005\u0003\u0000\u0000\u084d\u084e\u0005\n\u0000\u0000\u084e"+
		"\u084f\u0005\n\u0000\u0000\u084f\u0850\u0005\u0003\u0000\u0000\u0850\u0851"+
		"\u0005\n\u0000\u0000\u0851\u0852\u0005\u0003\u0000\u0000\u0852\u0853\u0005"+
		"\n\u0000\u0000\u0853\u0854\u0005\u0003\u0000\u0000\u0854\u0855\u0005\n"+
		"\u0000\u0000\u0855\u0894\u0005\u0004\u0000\u0000\u0856\u0857\u0005\b\u0000"+
		"\u0000\u0857\u0859\u0005\u0003\u0000\u0000\u0858\u085a\u0003\u001c\u000e"+
		"\u0000\u0859\u0858\u0001\u0000\u0000\u0000\u085a\u085b\u0001\u0000\u0000"+
		"\u0000\u085b\u0859\u0001\u0000\u0000\u0000\u085b\u085c\u0001\u0000\u0000"+
		"\u0000\u085c\u085d\u0001\u0000\u0000\u0000\u085d\u0889\u0005\u0004\u0000"+
		"\u0000\u085e\u085f\u0005\n\u0000\u0000\u085f\u0860\u0005\u0003\u0000\u0000"+
		"\u0860\u0861\u0005\n\u0000\u0000\u0861\u0862\u0005\u0003\u0000\u0000\u0862"+
		"\u0863\u0005\n\u0000\u0000\u0863\u0864\u0005\u0003\u0000\u0000\u0864\u0865"+
		"\u0005\n\u0000\u0000\u0865\u0866\u0005\u0003\u0000\u0000\u0866\u0867\u0005"+
		"\n\u0000\u0000\u0867\u0868\u0005\u0003\u0000\u0000\u0868\u0869\u0005\n"+
		"\u0000\u0000\u0869\u086a\u0005\u0003\u0000\u0000\u086a\u086b\u0005\n\u0000"+
		"\u0000\u086b\u086c\u0005\u0003\u0000\u0000\u086c\u0885\u0005\u0004\u0000"+
		"\u0000\u086d\u086e\u0005\u0003\u0000\u0000\u086e\u086f\u0005\u0003\u0000"+
		"\u0000\u086f\u0870\u0005\u0003\u0000\u0000\u0870\u0871\u0005\u0003\u0000"+
		"\u0000\u0871\u0872\u0005\u0003\u0000\u0000\u0872\u0873\u0005\u0003\u0000"+
		"\u0000\u0873\u0874\u0005\u0003\u0000\u0000\u0874\u0886\u0005\u0004\u0000"+
		"\u0000\u0875\u0876\u0005\u0006\u0000\u0000\u0876\u0877\u0005\u0003\u0000"+
		"\u0000\u0877\u0878\u0005\b\u0000\u0000\u0878\u0879\u0005\u0003\u0000\u0000"+
		"\u0879\u087a\u0005\b\u0000\u0000\u087a\u087b\u0005\u0003\u0000\u0000\u087b"+
		"\u087c\u0005\b\u0000\u0000\u087c\u087d\u0005\u0003\u0000\u0000\u087d\u087e"+
		"\u0005\b\u0000\u0000\u087e\u087f\u0005\u0003\u0000\u0000\u087f\u0880\u0005"+
		"\b\u0000\u0000\u0880\u0881\u0005\u0003\u0000\u0000\u0881\u0882\u0005\b"+
		"\u0000\u0000\u0882\u0883\u0005\u0003\u0000\u0000\u0883\u0884\u0005\u0004"+
		"\u0000\u0000\u0884\u0886\u0006\b\uffff\uffff\u0000\u0885\u086d\u0001\u0000"+
		"\u0000\u0000\u0885\u0875\u0001\u0000\u0000\u0000\u0886\u0887\u0001\u0000"+
		"\u0000\u0000\u0887\u0885\u0001\u0000\u0000\u0000\u0887\u0888\u0001\u0000"+
		"\u0000\u0000\u0888\u088a\u0001\u0000\u0000\u0000\u0889\u085e\u0001\u0000"+
		"\u0000\u0000\u088a\u088b\u0001\u0000\u0000\u0000\u088b\u0889\u0001\u0000"+
		"\u0000\u0000\u088b\u088c\u0001\u0000\u0000\u0000\u088c\u088d\u0001\u0000"+
		"\u0000\u0000\u088d\u088e\u0005\n\u0000\u0000\u088e\u088f\u0005\u0003\u0000"+
		"\u0000\u088f\u0890\u0005\n\u0000\u0000\u0890\u0891\u0005\u0003\u0000\u0000"+
		"\u0891\u0892\u0005\u0006\u0000\u0000\u0892\u0893\u0005\u0004\u0000\u0000"+
		"\u0893\u0895\u0001\u0000\u0000\u0000\u0894\u0856\u0001\u0000\u0000\u0000"+
		"\u0895\u0896\u0001\u0000\u0000\u0000\u0896\u0894\u0001\u0000\u0000\u0000"+
		"\u0896\u0897\u0001\u0000\u0000\u0000\u0897\u0898\u0001\u0000\u0000\u0000"+
		"\u0898\u0899\u0005\u0005\u0000\u0000\u0899\u089a\u0005\u0003\u0000\u0000"+
		"\u089a\u089b\u0005\n\u0000\u0000\u089b\u089c\u0005\n\u0000\u0000\u089c"+
		"\u089d\u0005\u0003\u0000\u0000\u089d\u089e\u0005\n\u0000\u0000\u089e\u089f"+
		"\u0005\u0003\u0000\u0000\u089f\u08a0\u0005\n\u0000\u0000\u08a0\u08a1\u0005"+
		"\u0003\u0000\u0000\u08a1\u08a2\u0005\n\u0000\u0000\u08a2\u08a3\u0005\u0004"+
		"\u0000\u0000\u08a3\u0011\u0001\u0000\u0000\u0000\u08a4\u08a5\u0005\u0005"+
		"\u0000\u0000\u08a5\u08a6\u0005\u0003\u0000\u0000\u08a6\u08a7\u0005\n\u0000"+
		"\u0000\u08a7\u08a8\u0005\n\u0000\u0000\u08a8\u08a9\u0005\u0003\u0000\u0000"+
		"\u08a9\u08aa\u0005\n\u0000\u0000\u08aa\u08ab\u0005\u0003\u0000\u0000\u08ab"+
		"\u08ac\u0005\n\u0000\u0000\u08ac\u08ad\u0005\u0003\u0000\u0000\u08ad\u08ae"+
		"\u0005\n\u0000\u0000\u08ae\u08e8\u0005\u0004\u0000\u0000\u08af\u08b0\u0005"+
		"\u0005\u0000\u0000\u08b0\u08b1\u0005\u0003\u0000\u0000\u08b1\u08b2\u0005"+
		"\b\u0000\u0000\u08b2\u08b3\u0005\u0003\u0000\u0000\u08b3\u08b4\u0005\n"+
		"\u0000\u0000\u08b4\u08b5\u0005\u0003\u0000\u0000\u08b5\u08b7\u0003\u001c"+
		"\u000e\u0000\u08b6\u08b8\u0003\u001c\u000e\u0000\u08b7\u08b6\u0001\u0000"+
		"\u0000\u0000\u08b7\u08b8\u0001\u0000\u0000\u0000\u08b8\u08ba\u0001\u0000"+
		"\u0000\u0000\u08b9\u08bb\u0003\u001c\u000e\u0000\u08ba\u08b9\u0001\u0000"+
		"\u0000\u0000\u08ba\u08bb\u0001\u0000\u0000\u0000\u08bb\u08bd\u0001\u0000"+
		"\u0000\u0000\u08bc\u08be\u0003\u001c\u000e\u0000\u08bd\u08bc\u0001\u0000"+
		"\u0000\u0000\u08bd\u08be\u0001\u0000\u0000\u0000\u08be\u08c0\u0001\u0000"+
		"\u0000\u0000\u08bf\u08c1\u0003\u001c\u000e\u0000\u08c0\u08bf\u0001\u0000"+
		"\u0000\u0000\u08c0\u08c1\u0001\u0000\u0000\u0000\u08c1\u08c3\u0001\u0000"+
		"\u0000\u0000\u08c2\u08c4\u0003\u001c\u000e\u0000\u08c3\u08c2\u0001\u0000"+
		"\u0000\u0000\u08c3\u08c4\u0001\u0000\u0000\u0000\u08c4\u08c6\u0001\u0000"+
		"\u0000\u0000\u08c5\u08c7\u0003\u001c\u000e\u0000\u08c6\u08c5\u0001\u0000"+
		"\u0000\u0000\u08c6\u08c7\u0001\u0000\u0000\u0000\u08c7\u08cb\u0001\u0000"+
		"\u0000\u0000\u08c8\u08ca\u0003\u001c\u000e\u0000\u08c9\u08c8\u0001\u0000"+
		"\u0000\u0000\u08ca\u08cd\u0001\u0000\u0000\u0000\u08cb\u08c9\u0001\u0000"+
		"\u0000\u0000\u08cb\u08cc\u0001\u0000\u0000\u0000\u08cc\u08ce\u0001\u0000"+
		"\u0000\u0000\u08cd\u08cb\u0001\u0000\u0000\u0000\u08ce\u08cf\u0005\u0004"+
		"\u0000\u0000\u08cf\u08d0\u0005\u0005\u0000\u0000\u08d0\u08d1\u0005\u0003"+
		"\u0000\u0000\u08d1\u08d2\u0005\t\u0000\u0000\u08d2\u08d3\u0005\u0004\u0000"+
		"\u0000\u08d3\u08d4\u0005\u0005\u0000\u0000\u08d4\u08d5\u0005\u0003\u0000"+
		"\u0000\u08d5\u08d6\u0005\t\u0000\u0000\u08d6\u08d7\u0005\u0004\u0000\u0000"+
		"\u08d7\u08d8\u0005\u0005\u0000\u0000\u08d8\u08d9\u0005\u0003\u0000\u0000"+
		"\u08d9\u08da\u0005\b\u0000\u0000\u08da\u08db\u0005\n\u0000\u0000\u08db"+
		"\u08dc\u0005\u0004\u0000\u0000\u08dc\u08dd\u0005\u0005\u0000\u0000\u08dd"+
		"\u08de\u0005\u0003\u0000\u0000\u08de\u08df\u0005\u0006\u0000\u0000\u08df"+
		"\u08e0\u0005\u0004\u0000\u0000\u08e0\u08e1\u0005\n\u0000\u0000\u08e1\u08e2"+
		"\u0005\u0003\u0000\u0000\u08e2\u08e3\u0005\n\u0000\u0000\u08e3\u08e4\u0005"+
		"\u0003\u0000\u0000\u08e4\u08e5\u0005\u0006\u0000\u0000\u08e5\u08e6\u0005"+
		"\u0004\u0000\u0000\u08e6\u08e7\u0006\t\uffff\uffff\u0000\u08e7\u08e9\u0001"+
		"\u0000\u0000\u0000\u08e8\u08af\u0001\u0000\u0000\u0000\u08e9\u08ea\u0001"+
		"\u0000\u0000\u0000\u08ea\u08e8\u0001\u0000\u0000\u0000\u08ea\u08eb\u0001"+
		"\u0000\u0000\u0000\u08eb\u08ec\u0001\u0000\u0000\u0000\u08ec\u08ed\u0005"+
		"\u0005\u0000\u0000\u08ed\u08ee\u0005\u0003\u0000\u0000\u08ee\u08ef\u0005"+
		"\n\u0000\u0000\u08ef\u08f0\u0005\n\u0000\u0000\u08f0\u08f1\u0005\u0003"+
		"\u0000\u0000\u08f1\u08f2\u0005\n\u0000\u0000\u08f2\u08f3\u0005\u0003\u0000"+
		"\u0000\u08f3\u08f4\u0005\n\u0000\u0000\u08f4\u08f5\u0005\u0003\u0000\u0000"+
		"\u08f5\u08f6\u0005\n\u0000\u0000\u08f6\u08f7\u0005\u0004\u0000\u0000\u08f7"+
		"\u0013\u0001\u0000\u0000\u0000\u08f8\u08f9\u0005\u0005\u0000\u0000\u08f9"+
		"\u08fa\u0005\u0003\u0000\u0000\u08fa\u08fb\u0005\n\u0000\u0000\u08fb\u08fc"+
		"\u0005\u0003\u0000\u0000\u08fc\u08fd\u0005\n\u0000\u0000\u08fd\u08fe\u0005"+
		"\n\u0000\u0000\u08fe\u08ff\u0005\n\u0000\u0000\u08ff\u0900\u0005\u0003"+
		"\u0000\u0000\u0900\u0901\u0005\n\u0000\u0000\u0901\u0902\u0005\u0003\u0000"+
		"\u0000\u0902\u0903\u0005\n\u0000\u0000\u0903\u0948\u0005\u0004\u0000\u0000"+
		"\u0904\u0905\u0005\n\u0000\u0000\u0905\u0906\u0005\u0003\u0000\u0000\u0906"+
		"\u0907\u0005\u0004\u0000\u0000\u0907\u0908\u0005\n\u0000\u0000\u0908\u0909"+
		"\u0005\u0003\u0000\u0000\u0909\u090a\u0005\n\u0000\u0000\u090a\u090b\u0005"+
		"\u0003\u0000\u0000\u090b\u090c\u0005\n\u0000\u0000\u090c\u090d\u0005\u0003"+
		"\u0000\u0000\u090d\u090e\u0005\n\u0000\u0000\u090e\u090f\u0005\u0003\u0000"+
		"\u0000\u090f\u0910\u0005\n\u0000\u0000\u0910\u0911\u0005\u0003\u0000\u0000"+
		"\u0911\u0912\u0005\n\u0000\u0000\u0912\u0913\u0005\u0003\u0000\u0000\u0913"+
		"\u0914\u0005\n\u0000\u0000\u0914\u0915\u0005\u0003\u0000\u0000\u0915\u0916"+
		"\u0005\n\u0000\u0000\u0916\u0917\u0005\u0003\u0000\u0000\u0917\u0918\u0005"+
		"\n\u0000\u0000\u0918\u0919\u0005\u0003\u0000\u0000\u0919\u091a\u0005\n"+
		"\u0000\u0000\u091a\u091b\u0005\u0003\u0000\u0000\u091b\u091c\u0005\n\u0000"+
		"\u0000\u091c\u091d\u0005\u0003\u0000\u0000\u091d\u093d\u0005\u0004\u0000"+
		"\u0000\u091e\u091f\u0005\n\u0000\u0000\u091f\u0920\u0005\u0003\u0000\u0000"+
		"\u0920\u0921\u0005\b\u0000\u0000\u0921\u0923\u0005\u0003\u0000\u0000\u0922"+
		"\u0924\u0005\b\u0000\u0000\u0923\u0922\u0001\u0000\u0000\u0000\u0923\u0924"+
		"\u0001\u0000\u0000\u0000\u0924\u0925\u0001\u0000\u0000\u0000\u0925\u0927"+
		"\u0005\u0003\u0000\u0000\u0926\u0928\u0003\u001c\u000e\u0000\u0927\u0926"+
		"\u0001\u0000\u0000\u0000\u0928\u0929\u0001\u0000\u0000\u0000\u0929\u0927"+
		"\u0001\u0000\u0000\u0000\u0929\u092a\u0001\u0000\u0000\u0000\u092a\u092b"+
		"\u0001\u0000\u0000\u0000\u092b\u092c\u0005\u0003\u0000\u0000\u092c\u092d"+
		"\u0005\n\u0000\u0000\u092d\u092e\u0005\u0003\u0000\u0000\u092e\u092f\u0005"+
		"\n\u0000\u0000\u092f\u0930\u0005\u0003\u0000\u0000\u0930\u0931\u0005\b"+
		"\u0000\u0000\u0931\u0932\u0005\u0003\u0000\u0000\u0932\u0933\u0005\b\u0000"+
		"\u0000\u0933\u0934\u0005\u0003\u0000\u0000\u0934\u0935\u0005\b\u0000\u0000"+
		"\u0935\u0936\u0005\u0003\u0000\u0000\u0936\u0937\u0005\b\u0000\u0000\u0937"+
		"\u0938\u0005\u0003\u0000\u0000\u0938\u0939\u0005\b\u0000\u0000\u0939\u093a"+
		"\u0005\u0003\u0000\u0000\u093a\u093b\u0005\u0004\u0000\u0000\u093b\u093c"+
		"\u0006\n\uffff\uffff\u0000\u093c\u093e\u0001\u0000\u0000\u0000\u093d\u091e"+
		"\u0001\u0000\u0000\u0000\u093e\u093f\u0001\u0000\u0000\u0000\u093f\u093d"+
		"\u0001\u0000\u0000\u0000\u093f\u0940\u0001\u0000\u0000\u0000\u0940\u0941"+
		"\u0001\u0000\u0000\u0000\u0941\u0942\u0005\n\u0000\u0000\u0942\u0943\u0005"+
		"\u0003\u0000\u0000\u0943\u0944\u0005\n\u0000\u0000\u0944\u0945\u0005\u0003"+
		"\u0000\u0000\u0945\u0946\u0005\u0006\u0000\u0000\u0946\u0947\u0005\u0004"+
		"\u0000\u0000\u0947\u0949\u0001\u0000\u0000\u0000\u0948\u0904\u0001\u0000"+
		"\u0000\u0000\u0949\u094a\u0001\u0000\u0000\u0000\u094a\u0948\u0001\u0000"+
		"\u0000\u0000\u094a\u094b\u0001\u0000\u0000\u0000\u094b\u094c\u0001\u0000"+
		"\u0000\u0000\u094c\u094d\u0005\u0005\u0000\u0000\u094d\u094e\u0005\u0003"+
		"\u0000\u0000\u094e\u094f\u0005\n\u0000\u0000\u094f\u0950\u0005\u0003\u0000"+
		"\u0000\u0950\u0951\u0005\n\u0000\u0000\u0951\u0952\u0005\n\u0000\u0000"+
		"\u0952\u0953\u0005\n\u0000\u0000\u0953\u0954\u0005\u0003\u0000\u0000\u0954"+
		"\u0955\u0005\n\u0000\u0000\u0955\u0956\u0005\u0003\u0000\u0000\u0956\u0957"+
		"\u0005\n\u0000\u0000\u0957\u0958\u0005\u0004\u0000\u0000\u0958\u0015\u0001"+
		"\u0000\u0000\u0000\u0959\u095a\u0005\u0005\u0000\u0000\u095a\u095b\u0005"+
		"\u0003\u0000\u0000\u095b\u095c\u0005\n\u0000\u0000\u095c\u095d\u0005\n"+
		"\u0000\u0000\u095d\u095e\u0005\u0003\u0000\u0000\u095e\u095f\u0005\n\u0000"+
		"\u0000\u095f\u0960\u0005\u0003\u0000\u0000\u0960\u0961\u0005\n\u0000\u0000"+
		"\u0961\u09b3\u0005\u0004\u0000\u0000\u0962\u0963\u0005\u0005\u0000\u0000"+
		"\u0963\u0964\u0005\u0003\u0000\u0000\u0964\u0965\u0005\b\u0000\u0000\u0965"+
		"\u0969\u0005\u0003\u0000\u0000\u0966\u0968\u0003\u001c\u000e\u0000\u0967"+
		"\u0966\u0001\u0000\u0000\u0000\u0968\u096b\u0001\u0000\u0000\u0000\u0969"+
		"\u0967\u0001\u0000\u0000\u0000\u0969\u096a\u0001\u0000\u0000\u0000\u096a"+
		"\u096c\u0001\u0000\u0000\u0000\u096b\u0969\u0001\u0000\u0000\u0000\u096c"+
		"\u096d\u0005\u0004\u0000\u0000\u096d\u096f\u0003\u001c\u000e\u0000\u096e"+
		"\u0970\u0003\u001c\u000e\u0000\u096f\u096e\u0001\u0000\u0000\u0000\u096f"+
		"\u0970\u0001\u0000\u0000\u0000\u0970\u0972\u0001\u0000\u0000\u0000\u0971"+
		"\u0973\u0003\u001c\u000e\u0000\u0972\u0971\u0001\u0000\u0000\u0000\u0972"+
		"\u0973\u0001\u0000\u0000\u0000\u0973\u0975\u0001\u0000\u0000\u0000\u0974"+
		"\u0976\u0003\u001c\u000e\u0000\u0975\u0974\u0001\u0000\u0000\u0000\u0975"+
		"\u0976\u0001\u0000\u0000\u0000\u0976\u0978\u0001\u0000\u0000\u0000\u0977"+
		"\u0979\u0003\u001c\u000e\u0000\u0978\u0977\u0001\u0000\u0000\u0000\u0978"+
		"\u0979\u0001\u0000\u0000\u0000\u0979\u097b\u0001\u0000\u0000\u0000\u097a"+
		"\u097c\u0003\u001c\u000e\u0000\u097b\u097a\u0001\u0000\u0000\u0000\u097b"+
		"\u097c\u0001\u0000\u0000\u0000\u097c\u097e\u0001\u0000\u0000\u0000\u097d"+
		"\u097f\u0003\u001c\u000e\u0000\u097e\u097d\u0001\u0000\u0000\u0000\u097e"+
		"\u097f\u0001\u0000\u0000\u0000\u097f\u0983\u0001\u0000\u0000\u0000\u0980"+
		"\u0982\u0003\u001c\u000e\u0000\u0981\u0980\u0001\u0000\u0000\u0000\u0982"+
		"\u0985\u0001\u0000\u0000\u0000\u0983\u0981\u0001\u0000\u0000\u0000\u0983"+
		"\u0984\u0001\u0000\u0000\u0000\u0984\u0986\u0001\u0000\u0000\u0000\u0985"+
		"\u0983\u0001\u0000\u0000\u0000\u0986\u0987\u0005\u0004\u0000\u0000\u0987"+
		"\u0989\u0003\u001c\u000e\u0000\u0988\u098a\u0003\u001c\u000e\u0000\u0989"+
		"\u0988\u0001\u0000\u0000\u0000\u0989\u098a\u0001\u0000\u0000\u0000\u098a"+
		"\u098c\u0001\u0000\u0000\u0000\u098b\u098d\u0003\u001c\u000e\u0000\u098c"+
		"\u098b\u0001\u0000\u0000\u0000\u098c\u098d\u0001\u0000\u0000\u0000\u098d"+
		"\u098f\u0001\u0000\u0000\u0000\u098e\u0990\u0003\u001c\u000e\u0000\u098f"+
		"\u098e\u0001\u0000\u0000\u0000\u098f\u0990\u0001\u0000\u0000\u0000\u0990"+
		"\u0992\u0001\u0000\u0000\u0000\u0991\u0993\u0003\u001c\u000e\u0000\u0992"+
		"\u0991\u0001\u0000\u0000\u0000\u0992\u0993\u0001\u0000\u0000\u0000\u0993"+
		"\u0995\u0001\u0000\u0000\u0000\u0994\u0996\u0003\u001c\u000e\u0000\u0995"+
		"\u0994\u0001\u0000\u0000\u0000\u0995\u0996\u0001\u0000\u0000\u0000\u0996"+
		"\u0998\u0001\u0000\u0000\u0000\u0997\u0999\u0003\u001c\u000e\u0000\u0998"+
		"\u0997\u0001\u0000\u0000\u0000\u0998\u0999\u0001\u0000\u0000\u0000\u0999"+
		"\u099d\u0001\u0000\u0000\u0000\u099a\u099c\u0003\u001c\u000e\u0000\u099b"+
		"\u099a\u0001\u0000\u0000\u0000\u099c\u099f\u0001\u0000\u0000\u0000\u099d"+
		"\u099b\u0001\u0000\u0000\u0000\u099d\u099e\u0001\u0000\u0000\u0000\u099e"+
		"\u09a0\u0001\u0000\u0000\u0000\u099f\u099d\u0001\u0000\u0000\u0000\u09a0"+
		"\u09a1\u0005\u0004\u0000\u0000\u09a1\u09a5\u0005\u0006\u0000\u0000\u09a2"+
		"\u09a4\u0005\n\u0000\u0000\u09a3\u09a2\u0001\u0000\u0000\u0000\u09a4\u09a7"+
		"\u0001\u0000\u0000\u0000\u09a5\u09a3\u0001\u0000\u0000\u0000\u09a5\u09a6"+
		"\u0001\u0000\u0000\u0000\u09a6\u09a8\u0001\u0000\u0000\u0000\u09a7\u09a5"+
		"\u0001\u0000\u0000\u0000\u09a8\u09a9\u0005\u0004\u0000\u0000\u09a9\u09aa"+
		"\u0003\u001c\u000e\u0000\u09aa\u09ab\u0005\u0004\u0000\u0000\u09ab\u09ac"+
		"\u0005\n\u0000\u0000\u09ac\u09ad\u0005\u0003\u0000\u0000\u09ad\u09ae\u0005"+
		"\n\u0000\u0000\u09ae\u09af\u0005\u0003\u0000\u0000\u09af\u09b0\u0005\u0006"+
		"\u0000\u0000\u09b0\u09b1\u0005\u0004\u0000\u0000\u09b1\u09b2\u0006\u000b"+
		"\uffff\uffff\u0000\u09b2\u09b4\u0001\u0000\u0000\u0000\u09b3\u0962\u0001"+
		"\u0000\u0000\u0000\u09b4\u09b5\u0001\u0000\u0000\u0000\u09b5\u09b3\u0001"+
		"\u0000\u0000\u0000\u09b5\u09b6\u0001\u0000\u0000\u0000\u09b6\u09b7\u0001"+
		"\u0000\u0000\u0000\u09b7\u09b8\u0005\u0005\u0000\u0000\u09b8\u09b9\u0005"+
		"\u0003\u0000\u0000\u09b9\u09ba\u0005\n\u0000\u0000\u09ba\u09bb\u0005\n"+
		"\u0000\u0000\u09bb\u09bc\u0005\u0003\u0000\u0000\u09bc\u09bd\u0005\n\u0000"+
		"\u0000\u09bd\u09be\u0005\u0003\u0000\u0000\u09be\u09bf\u0005\n\u0000\u0000"+
		"\u09bf\u09c0\u0005\u0004\u0000\u0000\u09c0\u0017\u0001\u0000\u0000\u0000"+
		"\u09c1\u09c2\u0005\u0005\u0000\u0000\u09c2\u09c3\u0005\u0003\u0000\u0000"+
		"\u09c3\u09c4\u0005\n\u0000\u0000\u09c4\u09c5\u0005\n\u0000\u0000\u09c5"+
		"\u09c6\u0005\n\u0000\u0000\u09c6\u09c7\u0005\u0003\u0000\u0000\u09c7\u09c8"+
		"\u0005\n\u0000\u0000\u09c8\u09c9\u0005\n\u0000\u0000\u09c9";
	private static final String _serializedATNSegment1 =
		"\u09ca\u0005\n\u0000\u0000\u09ca\u09cb\u0005\u0003\u0000\u0000\u09cb\u09cc"+
		"\u0005\n\u0000\u0000\u09cc\u09cd\u0005\u0003\u0000\u0000\u09cd\u09ce\u0005"+
		"\n\u0000\u0000\u09ce\u0a3d\u0005\u0004\u0000\u0000\u09cf\u09d0\u0005\u0005"+
		"\u0000\u0000\u09d0\u09d1\u0005\u0003\u0000\u0000\u09d1\u09d2\u0005\b\u0000"+
		"\u0000\u09d2\u09d3\u0005\u0004\u0000\u0000\u09d3\u09d4\u0005\n\u0000\u0000"+
		"\u09d4\u09d6\u0005\u0003\u0000\u0000\u09d5\u09d7\u0005\n\u0000\u0000\u09d6"+
		"\u09d5\u0001\u0000\u0000\u0000\u09d6\u09d7\u0001\u0000\u0000\u0000\u09d7"+
		"\u09d8\u0001\u0000\u0000\u0000\u09d8\u09d9\u0005\u0003\u0000\u0000\u09d9"+
		"\u09da\u0005\n\u0000\u0000\u09da\u09db\u0005\u0003\u0000\u0000\u09db\u09dc"+
		"\u0005\n\u0000\u0000\u09dc\u09dd\u0005\u0003\u0000\u0000\u09dd\u09de\u0005"+
		"\n\u0000\u0000\u09de\u09df\u0005\u0003\u0000\u0000\u09df\u09e0\u0005\n"+
		"\u0000\u0000\u09e0\u09e1\u0005\u0003\u0000\u0000\u09e1\u09e2\u0005\n\u0000"+
		"\u0000\u09e2\u09e3\u0005\u0003\u0000\u0000\u09e3\u09e4\u0005\n\u0000\u0000"+
		"\u09e4\u09e5\u0005\u0003\u0000\u0000\u09e5\u09e6\u0005\n\u0000\u0000\u09e6"+
		"\u09e7\u0005\u0003\u0000\u0000\u09e7\u09e8\u0005\n\u0000\u0000\u09e8\u09e9"+
		"\u0005\u0003\u0000\u0000\u09e9\u0a33\u0005\u0004\u0000\u0000\u09ea\u09eb"+
		"\u0005\u0003\u0000\u0000\u09eb\u09ec\u0005\u0003\u0000\u0000\u09ec\u09ed"+
		"\u0005\u0003\u0000\u0000\u09ed\u09ee\u0005\u0003\u0000\u0000\u09ee\u09ef"+
		"\u0005\u0003\u0000\u0000\u09ef\u09f0\u0005\u0003\u0000\u0000\u09f0\u09f1"+
		"\u0005\u0003\u0000\u0000\u09f1\u09f2\u0005\u0003\u0000\u0000\u09f2\u09f3"+
		"\u0005\u0003\u0000\u0000\u09f3\u09f4\u0005\u0003\u0000\u0000\u09f4\u0a34"+
		"\u0005\u0004\u0000\u0000\u09f5\u09f7\u0003\u001c\u000e\u0000\u09f6\u09f8"+
		"\u0003\u001c\u000e\u0000\u09f7\u09f6\u0001\u0000\u0000\u0000\u09f7\u09f8"+
		"\u0001\u0000\u0000\u0000\u09f8\u09fa\u0001\u0000\u0000\u0000\u09f9\u09fb"+
		"\u0003\u001c\u000e\u0000\u09fa\u09f9\u0001\u0000\u0000\u0000\u09fa\u09fb"+
		"\u0001\u0000\u0000\u0000\u09fb\u09fd\u0001\u0000\u0000\u0000\u09fc\u09fe"+
		"\u0003\u001c\u000e\u0000\u09fd\u09fc\u0001\u0000\u0000\u0000\u09fd\u09fe"+
		"\u0001\u0000\u0000\u0000\u09fe\u0a00\u0001\u0000\u0000\u0000\u09ff\u0a01"+
		"\u0003\u001c\u000e\u0000\u0a00\u09ff\u0001\u0000\u0000\u0000\u0a00\u0a01"+
		"\u0001\u0000\u0000\u0000\u0a01\u0a03\u0001\u0000\u0000\u0000\u0a02\u0a04"+
		"\u0003\u001c\u000e\u0000\u0a03\u0a02\u0001\u0000\u0000\u0000\u0a03\u0a04"+
		"\u0001\u0000\u0000\u0000\u0a04\u0a06\u0001\u0000\u0000\u0000\u0a05\u0a07"+
		"\u0003\u001c\u000e\u0000\u0a06\u0a05\u0001\u0000\u0000\u0000\u0a06\u0a07"+
		"\u0001\u0000\u0000\u0000\u0a07\u0a0b\u0001\u0000\u0000\u0000\u0a08\u0a0a"+
		"\u0003\u001c\u000e\u0000\u0a09\u0a08\u0001\u0000\u0000\u0000\u0a0a\u0a0d"+
		"\u0001\u0000\u0000\u0000\u0a0b\u0a09\u0001\u0000\u0000\u0000\u0a0b\u0a0c"+
		"\u0001\u0000\u0000\u0000\u0a0c\u0a0e\u0001\u0000\u0000\u0000\u0a0d\u0a0b"+
		"\u0001\u0000\u0000\u0000\u0a0e\u0a10\u0005\u0003\u0000\u0000\u0a0f\u0a11"+
		"\u0005\n\u0000\u0000\u0a10\u0a0f\u0001\u0000\u0000\u0000\u0a10\u0a11\u0001"+
		"\u0000\u0000\u0000\u0a11\u0a12\u0001\u0000\u0000\u0000\u0a12\u0a13\u0005"+
		"\u0003\u0000\u0000\u0a13\u0a14\u0005\n\u0000\u0000\u0a14\u0a18\u0005\u0003"+
		"\u0000\u0000\u0a15\u0a17\u0003\u001c\u000e\u0000\u0a16\u0a15\u0001\u0000"+
		"\u0000\u0000\u0a17\u0a1a\u0001\u0000\u0000\u0000\u0a18\u0a16\u0001\u0000"+
		"\u0000\u0000\u0a18\u0a19\u0001\u0000\u0000\u0000\u0a19\u0a1b\u0001\u0000"+
		"\u0000\u0000\u0a1a\u0a18\u0001\u0000\u0000\u0000\u0a1b\u0a1d\u0005\u0003"+
		"\u0000\u0000\u0a1c\u0a1e\u0005\u0006\u0000\u0000\u0a1d\u0a1c\u0001\u0000"+
		"\u0000\u0000\u0a1d\u0a1e\u0001\u0000\u0000\u0000\u0a1e\u0a1f\u0001\u0000"+
		"\u0000\u0000\u0a1f\u0a20\u0005\u0003\u0000\u0000\u0a20\u0a21\u0005\u0006"+
		"\u0000\u0000\u0a21\u0a23\u0005\u0003\u0000\u0000\u0a22\u0a24\u0005\n\u0000"+
		"\u0000\u0a23\u0a22\u0001\u0000\u0000\u0000\u0a23\u0a24\u0001\u0000\u0000"+
		"\u0000\u0a24\u0a25\u0001\u0000\u0000\u0000\u0a25\u0a26\u0005\u0003\u0000"+
		"\u0000\u0a26\u0a27\u0005\b\u0000\u0000\u0a27\u0a29\u0005\u0003\u0000\u0000"+
		"\u0a28\u0a2a\u0005\b\u0000\u0000\u0a29\u0a28\u0001\u0000\u0000\u0000\u0a29"+
		"\u0a2a\u0001\u0000\u0000\u0000\u0a2a\u0a2b\u0001\u0000\u0000\u0000\u0a2b"+
		"\u0a2d\u0005\u0003\u0000\u0000\u0a2c\u0a2e\u0005\b\u0000\u0000\u0a2d\u0a2c"+
		"\u0001\u0000\u0000\u0000\u0a2d\u0a2e\u0001\u0000\u0000\u0000\u0a2e\u0a2f"+
		"\u0001\u0000\u0000\u0000\u0a2f\u0a30\u0005\u0003\u0000\u0000\u0a30\u0a31"+
		"\u0005\u0004\u0000\u0000\u0a31\u0a32\u0006\f\uffff\uffff\u0000\u0a32\u0a34"+
		"\u0001\u0000\u0000\u0000\u0a33\u09ea\u0001\u0000\u0000\u0000\u0a33\u09f5"+
		"\u0001\u0000\u0000\u0000\u0a34\u0a35\u0001\u0000\u0000\u0000\u0a35\u0a33"+
		"\u0001\u0000\u0000\u0000\u0a35\u0a36\u0001\u0000\u0000\u0000\u0a36\u0a37"+
		"\u0001\u0000\u0000\u0000\u0a37\u0a38\u0005\n\u0000\u0000\u0a38\u0a39\u0005"+
		"\u0003\u0000\u0000\u0a39\u0a3a\u0005\n\u0000\u0000\u0a3a\u0a3b\u0005\u0003"+
		"\u0000\u0000\u0a3b\u0a3c\u0005\u0006\u0000\u0000\u0a3c\u0a3e\u0005\u0004"+
		"\u0000\u0000\u0a3d\u09cf\u0001\u0000\u0000\u0000\u0a3e\u0a3f\u0001\u0000"+
		"\u0000\u0000\u0a3f\u0a3d\u0001\u0000\u0000\u0000\u0a3f\u0a40\u0001\u0000"+
		"\u0000\u0000\u0a40\u0a41\u0001\u0000\u0000\u0000\u0a41\u0a42\u0005\u0005"+
		"\u0000\u0000\u0a42\u0a43\u0005\u0003\u0000\u0000\u0a43\u0a44\u0005\n\u0000"+
		"\u0000\u0a44\u0a45\u0005\n\u0000\u0000\u0a45\u0a46\u0005\n\u0000\u0000"+
		"\u0a46\u0a47\u0005\u0003\u0000\u0000\u0a47\u0a48\u0005\n\u0000\u0000\u0a48"+
		"\u0a49\u0005\n\u0000\u0000\u0a49\u0a4a\u0005\n\u0000\u0000\u0a4a\u0a4b"+
		"\u0005\u0003\u0000\u0000\u0a4b\u0a4c\u0005\n\u0000\u0000\u0a4c\u0a4d\u0005"+
		"\u0003\u0000\u0000\u0a4d\u0a4e\u0005\n\u0000\u0000\u0a4e\u0a4f\u0005\u0004"+
		"\u0000\u0000\u0a4f\u0019\u0001\u0000\u0000\u0000\u0a50\u0a51\u0005\u0005"+
		"\u0000\u0000\u0a51\u0a52\u0005\u0003\u0000\u0000\u0a52\u0a53\u0005\n\u0000"+
		"\u0000\u0a53\u0a54\u0005\u0003\u0000\u0000\u0a54\u0a55\u0005\n\u0000\u0000"+
		"\u0a55\u0a56\u0005\n\u0000\u0000\u0a56\u0a57\u0005\n\u0000\u0000\u0a57"+
		"\u0a58\u0005\u0003\u0000\u0000\u0a58\u0a59\u0005\n\u0000\u0000\u0a59\u0a5a"+
		"\u0005\u0003\u0000\u0000\u0a5a\u0a5b\u0005\n\u0000\u0000\u0a5b\u0ada\u0005"+
		"\u0004\u0000\u0000\u0a5c\u0a5d\u0005\n\u0000\u0000\u0a5d\u0a5e\u0005\u0003"+
		"\u0000\u0000\u0a5e\u0a5f\u0005\n\u0000\u0000\u0a5f\u0a60\u0005\u0004\u0000"+
		"\u0000\u0a60\u0a61\u0005\n\u0000\u0000\u0a61\u0a62\u0005\u0003\u0000\u0000"+
		"\u0a62\u0a63\u0005\n\u0000\u0000\u0a63\u0a64\u0005\u0004\u0000\u0000\u0a64"+
		"\u0a65\u0005\n\u0000\u0000\u0a65\u0a66\u0005\u0003\u0000\u0000\u0a66\u0a67"+
		"\u0005\n\u0000\u0000\u0a67\u0a68\u0005\u0003\u0000\u0000\u0a68\u0a69\u0005"+
		"\n\u0000\u0000\u0a69\u0a6a\u0005\u0003\u0000\u0000\u0a6a\u0a6b\u0005\n"+
		"\u0000\u0000\u0a6b\u0a6c\u0005\u0003\u0000\u0000\u0a6c\u0a6d\u0005\n\u0000"+
		"\u0000\u0a6d\u0a6e\u0005\u0003\u0000\u0000\u0a6e\u0a6f\u0005\n\u0000\u0000"+
		"\u0a6f\u0a70\u0005\u0003\u0000\u0000\u0a70\u0a71\u0005\n\u0000\u0000\u0a71"+
		"\u0a72\u0005\u0003\u0000\u0000\u0a72\u0a73\u0005\n\u0000\u0000\u0a73\u0a74"+
		"\u0005\u0003\u0000\u0000\u0a74\u0a75\u0005\n\u0000\u0000\u0a75\u0a76\u0005"+
		"\u0003\u0000\u0000\u0a76\u0a77\u0005\n\u0000\u0000\u0a77\u0a78\u0005\u0003"+
		"\u0000\u0000\u0a78\u0a79\u0005\n\u0000\u0000\u0a79\u0a7a\u0005\u0003\u0000"+
		"\u0000\u0a7a\u0a7b\u0005\n\u0000\u0000\u0a7b\u0a7c\u0005\u0003\u0000\u0000"+
		"\u0a7c\u0a7d\u0005\u0004\u0000\u0000\u0a7d\u0a7e\u0005\n\u0000\u0000\u0a7e"+
		"\u0a7f\u0005\u0003\u0000\u0000\u0a7f\u0a80\u0005\n\u0000\u0000\u0a80\u0a81"+
		"\u0005\u0003\u0000\u0000\u0a81\u0a82\u0005\n\u0000\u0000\u0a82\u0a83\u0005"+
		"\u0003\u0000\u0000\u0a83\u0a84\u0005\n\u0000\u0000\u0a84\u0a85\u0005\u0003"+
		"\u0000\u0000\u0a85\u0a86\u0005\n\u0000\u0000\u0a86\u0a87\u0005\u0003\u0000"+
		"\u0000\u0a87\u0a88\u0005\n\u0000\u0000\u0a88\u0a89\u0005\u0003\u0000\u0000"+
		"\u0a89\u0acc\u0005\u0004\u0000\u0000\u0a8a\u0a8b\u0005\u0003\u0000\u0000"+
		"\u0a8b\u0a8c\u0005\u0003\u0000\u0000\u0a8c\u0a8d\u0005\u0003\u0000\u0000"+
		"\u0a8d\u0a8e\u0005\u0003\u0000\u0000\u0a8e\u0a8f\u0005\u0003\u0000\u0000"+
		"\u0a8f\u0a90\u0005\u0003\u0000\u0000\u0a90\u0a91\u0005\u0003\u0000\u0000"+
		"\u0a91\u0a92\u0005\u0003\u0000\u0000\u0a92\u0a93\u0005\u0003\u0000\u0000"+
		"\u0a93\u0a94\u0005\u0003\u0000\u0000\u0a94\u0a95\u0005\u0003\u0000\u0000"+
		"\u0a95\u0a96\u0005\u0003\u0000\u0000\u0a96\u0a97\u0005\u0003\u0000\u0000"+
		"\u0a97\u0a98\u0005\u0003\u0000\u0000\u0a98\u0a99\u0005\u0003\u0000\u0000"+
		"\u0a99\u0a9a\u0005\u0003\u0000\u0000\u0a9a\u0a9b\u0005\u0003\u0000\u0000"+
		"\u0a9b\u0acd\u0005\u0004\u0000\u0000\u0a9c\u0a9d\u0005\u0006\u0000\u0000"+
		"\u0a9d\u0a9f\u0005\u0003\u0000\u0000\u0a9e\u0aa0\u0005\u0006\u0000\u0000"+
		"\u0a9f\u0a9e\u0001\u0000\u0000\u0000\u0a9f\u0aa0\u0001\u0000\u0000\u0000"+
		"\u0aa0\u0aa1\u0001\u0000\u0000\u0000\u0aa1\u0aa3\u0005\u0003\u0000\u0000"+
		"\u0aa2\u0aa4\u0005\u0006\u0000\u0000\u0aa3\u0aa2\u0001\u0000\u0000\u0000"+
		"\u0aa3\u0aa4\u0001\u0000\u0000\u0000\u0aa4\u0aa5\u0001\u0000\u0000\u0000"+
		"\u0aa5\u0aa6\u0005\u0003\u0000\u0000\u0aa6\u0aa7\u0005\b\u0000\u0000\u0aa7"+
		"\u0aa9\u0005\u0003\u0000\u0000\u0aa8\u0aaa\u0003\u001c\u000e\u0000\u0aa9"+
		"\u0aa8\u0001\u0000\u0000\u0000\u0aaa\u0aab\u0001\u0000\u0000\u0000\u0aab"+
		"\u0aa9\u0001\u0000\u0000\u0000\u0aab\u0aac\u0001\u0000\u0000\u0000\u0aac"+
		"\u0aad\u0001\u0000\u0000\u0000\u0aad\u0aae\u0005\u0003\u0000\u0000\u0aae"+
		"\u0aaf\u0005\n\u0000\u0000\u0aaf\u0ab0\u0005\u0003\u0000\u0000\u0ab0\u0ab1"+
		"\u0005\n\u0000\u0000\u0ab1\u0ab2\u0005\u0003\u0000\u0000\u0ab2\u0ab3\u0005"+
		"\n\u0000\u0000\u0ab3\u0ab4\u0005\u0003\u0000\u0000\u0ab4\u0ab5\u0005\n"+
		"\u0000\u0000\u0ab5\u0ab6\u0005\u0003\u0000\u0000\u0ab6\u0ab7\u0005\b\u0000"+
		"\u0000\u0ab7\u0ab9\u0005\u0003\u0000\u0000\u0ab8\u0aba\u0005\b\u0000\u0000"+
		"\u0ab9\u0ab8\u0001\u0000\u0000\u0000\u0ab9\u0aba\u0001\u0000\u0000\u0000"+
		"\u0aba\u0abb\u0001\u0000\u0000\u0000\u0abb\u0abc\u0005\u0003\u0000\u0000"+
		"\u0abc\u0abd\u0005\b\u0000\u0000\u0abd\u0abe\u0005\u0003\u0000\u0000\u0abe"+
		"\u0abf\u0005\b\u0000\u0000\u0abf\u0ac1\u0005\u0003\u0000\u0000\u0ac0\u0ac2"+
		"\u0005\b\u0000\u0000\u0ac1\u0ac0\u0001\u0000\u0000\u0000\u0ac1\u0ac2\u0001"+
		"\u0000\u0000\u0000\u0ac2\u0ac3\u0001\u0000\u0000\u0000\u0ac3\u0ac4\u0005"+
		"\u0003\u0000\u0000\u0ac4\u0ac5\u0005\u0003\u0000\u0000\u0ac5\u0ac6\u0005"+
		"\b\u0000\u0000\u0ac6\u0ac7\u0005\u0003\u0000\u0000\u0ac7\u0ac8\u0005\b"+
		"\u0000\u0000\u0ac8\u0ac9\u0005\u0003\u0000\u0000\u0ac9\u0aca\u0005\u0004"+
		"\u0000\u0000\u0aca\u0acb\u0006\r\uffff\uffff\u0000\u0acb\u0acd\u0001\u0000"+
		"\u0000\u0000\u0acc\u0a8a\u0001\u0000\u0000\u0000\u0acc\u0a9c\u0001\u0000"+
		"\u0000\u0000\u0acd\u0ace\u0001\u0000\u0000\u0000\u0ace\u0acc\u0001\u0000"+
		"\u0000\u0000\u0ace\u0acf\u0001\u0000\u0000\u0000\u0acf\u0ad1\u0001\u0000"+
		"\u0000\u0000\u0ad0\u0a5c\u0001\u0000\u0000\u0000\u0ad1\u0ad2\u0001\u0000"+
		"\u0000\u0000\u0ad2\u0ad0\u0001\u0000\u0000\u0000\u0ad2\u0ad3\u0001\u0000"+
		"\u0000\u0000\u0ad3\u0ad4\u0001\u0000\u0000\u0000\u0ad4\u0ad5\u0005\n\u0000"+
		"\u0000\u0ad5\u0ad6\u0005\u0003\u0000\u0000\u0ad6\u0ad7\u0005\n\u0000\u0000"+
		"\u0ad7\u0ad8\u0005\u0003\u0000\u0000\u0ad8\u0ad9\u0005\u0006\u0000\u0000"+
		"\u0ad9\u0adb\u0005\u0004\u0000\u0000\u0ada\u0ad0\u0001\u0000\u0000\u0000"+
		"\u0adb\u0adc\u0001\u0000\u0000\u0000\u0adc\u0ada\u0001\u0000\u0000\u0000"+
		"\u0adc\u0add\u0001\u0000\u0000\u0000\u0add\u0ade\u0001\u0000\u0000\u0000"+
		"\u0ade\u0adf\u0005\u0005\u0000\u0000\u0adf\u0ae0\u0005\u0003\u0000\u0000"+
		"\u0ae0\u0ae1\u0005\n\u0000\u0000\u0ae1\u0ae2\u0005\u0003\u0000\u0000\u0ae2"+
		"\u0ae3\u0005\n\u0000\u0000\u0ae3\u0ae4\u0005\n\u0000\u0000\u0ae4\u0ae5"+
		"\u0005\n\u0000\u0000\u0ae5\u0ae6\u0005\u0003\u0000\u0000\u0ae6\u0ae7\u0005"+
		"\n\u0000\u0000\u0ae7\u0ae8\u0005\u0003\u0000\u0000\u0ae8\u0ae9\u0005\n"+
		"\u0000\u0000\u0ae9\u0aea\u0005\u0004\u0000\u0000\u0aea\u001b\u0001\u0000"+
		"\u0000\u0000\u0aeb\u0aec\u0007\u0000\u0000\u0000\u0aec\u001d\u0001\u0000"+
		"\u0000\u0000\u0aed\u0af0\u0003\u001c\u000e\u0000\u0aee\u0af0\u0005\u0003"+
		"\u0000\u0000\u0aef\u0aed\u0001\u0000\u0000\u0000\u0aef\u0aee\u0001\u0000"+
		"\u0000\u0000\u0af0\u0af1\u0001\u0000\u0000\u0000\u0af1\u0aef\u0001\u0000"+
		"\u0000\u0000\u0af1\u0af2\u0001\u0000\u0000\u0000\u0af2\u0af3\u0001\u0000"+
		"\u0000\u0000\u0af3\u0af4\u0005\u0004\u0000\u0000\u0af4\u001f\u0001\u0000"+
		"\u0000\u0000\u0af5\u0af9\u0003\u001c\u000e\u0000\u0af6\u0af9\u0005\u0003"+
		"\u0000\u0000\u0af7\u0af9\u0005\u0004\u0000\u0000\u0af8\u0af5\u0001\u0000"+
		"\u0000\u0000\u0af8\u0af6\u0001\u0000\u0000\u0000\u0af8\u0af7\u0001\u0000"+
		"\u0000\u0000\u0af9\u0afa\u0001\u0000\u0000\u0000\u0afa\u0af8\u0001\u0000"+
		"\u0000\u0000\u0afa\u0afb\u0001\u0000\u0000\u0000\u0afb!\u0001\u0000\u0000"+
		"\u0000\u00ba/\u00b7\u00bf\u00c2\u00c5\u00c8\u00cb\u00ce\u00d3\u00df\u00eb"+
		"\u00f3\u00fb\u011c\u0132\u013d\u02a4\u02ad\u02b0\u02b3\u02b6\u02b9\u02bc"+
		"\u02c1\u02cc\u02e7\u02f4\u030b\u0316\u036b\u036e\u0371\u0374\u0377\u037a"+
		"\u037f\u03d2\u03f5\u03f8\u03fb\u03fe\u0401\u0404\u0409\u041c\u041e\u0429"+
		"\u057e\u0581\u0584\u0587\u058a\u058d\u0592\u059e\u05a7\u05f4\u05f7\u05fa"+
		"\u05fd\u0600\u0603\u0608\u061b\u061d\u0628\u067f\u06c8\u06cb\u06ce\u06d1"+
		"\u06d4\u06d7\u06dc\u06eb\u06ed\u06f1\u06f9\u06fb\u0739\u073c\u073f\u0742"+
		"\u0745\u0748\u074d\u0755\u0758\u075b\u075e\u0761\u0764\u0769\u0776\u077f"+
		"\u0789\u0794\u07b3\u07ba\u07bd\u07c0\u07c3\u07c6\u07c9\u07ce\u07d6\u07d9"+
		"\u07dc\u07df\u07e2\u07e5\u07ea\u080f\u0813\u0817\u081b\u081f\u0827\u082c"+
		"\u082e\u0832\u083d\u085b\u0885\u0887\u088b\u0896\u08b7\u08ba\u08bd\u08c0"+
		"\u08c3\u08c6\u08cb\u08ea\u0923\u0929\u093f\u094a\u0969\u096f\u0972\u0975"+
		"\u0978\u097b\u097e\u0983\u0989\u098c\u098f\u0992\u0995\u0998\u099d\u09a5"+
		"\u09b5\u09d6\u09f7\u09fa\u09fd\u0a00\u0a03\u0a06\u0a0b\u0a10\u0a18\u0a1d"+
		"\u0a23\u0a29\u0a2d\u0a33\u0a35\u0a3f\u0a9f\u0aa3\u0aab\u0ab9\u0ac1\u0acc"+
		"\u0ace\u0ad2\u0adc\u0aef\u0af1\u0af8\u0afa";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}