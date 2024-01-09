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
		RULE_stockDocument = 0, RULE_etcAllPrice = 1, RULE_companyAllPrice = 2, 
		RULE_crawlPriceKrx = 3, RULE_crawlItemEtf = 4, RULE_crawlPriceEtf = 5, 
		RULE_crawlPriceCompany = 6, RULE_crawlItemDetailCompanyThread = 7, RULE_crawlItemDividendTopCompany = 8, 
		RULE_crawlEtfDetailThread = 9, RULE_crawlDividendHistoryEtfThread = 10, 
		RULE_crawlDividendHistoryCompanyThread = 11, RULE_word = 12, RULE_line = 13, 
		RULE_eof = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"stockDocument", "etcAllPrice", "companyAllPrice", "crawlPriceKrx", "crawlItemEtf", 
			"crawlPriceEtf", "crawlPriceCompany", "crawlItemDetailCompanyThread", 
			"crawlItemDividendTopCompany", "crawlEtfDetailThread", "crawlDividendHistoryEtfThread", 
			"crawlDividendHistoryCompanyThread", "word", "line", "eof"
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
		public EtcAllPriceContext etcAllPrice() {
			return getRuleContext(EtcAllPriceContext.class,0);
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
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				crawlDividendHistoryCompanyThread();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				crawlDividendHistoryEtfThread();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				crawlItemDividendTopCompany();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				crawlItemEtf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				crawlItemDetailCompanyThread();
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
				crawlPriceCompany();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(37);
				crawlPriceEtf();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(38);
				crawlPriceKrx();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(39);
				companyAllPrice();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(40);
				etcAllPrice();
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

	public static class EtcAllPriceContext extends ParserRuleContext {
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
		public EtcAllPriceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etcAllPrice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterEtcAllPrice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitEtcAllPrice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitEtcAllPrice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EtcAllPriceContext etcAllPrice() throws RecognitionException {
		EtcAllPriceContext _localctx = new EtcAllPriceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_etcAllPrice);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(KEYWORD);
			setState(44);
			match(TAB);
			setState(45);
			match(WORD);
			setState(46);
			match(TAB);
			setState(47);
			match(WORD);
			setState(48);
			match(WORD);
			setState(49);
			match(WORD);
			setState(50);
			match(WORD);
			setState(51);
			match(TAB);
			setState(52);
			match(WORD);
			setState(53);
			match(NEWLINE);
			setState(300); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				match(WORD);
				setState(55);
				match(TAB);
				setState(56);
				match(DATE);
				setState(57);
				match(TAB);
				setState(58);
				match(NEWLINE);
				setState(59);
				match(WORD);
				setState(60);
				match(TAB);
				setState(61);
				match(DATE);
				setState(62);
				match(TAB);
				setState(63);
				match(NEWLINE);
				setState(64);
				match(WORD);
				setState(65);
				match(TAB);
				setState(66);
				match(DATE);
				setState(67);
				match(TAB);
				setState(68);
				match(NEWLINE);
				setState(69);
				match(WORD);
				setState(70);
				match(TAB);
				setState(71);
				match(DATE);
				setState(72);
				match(TAB);
				setState(73);
				match(NEWLINE);
				setState(74);
				match(WORD);
				setState(75);
				match(TAB);
				setState(76);
				match(DATE);
				setState(77);
				match(TAB);
				setState(78);
				match(NEWLINE);
				setState(79);
				match(WORD);
				setState(80);
				match(TAB);
				setState(81);
				match(DATE);
				setState(82);
				match(TAB);
				setState(83);
				match(NEWLINE);
				setState(84);
				match(WORD);
				setState(85);
				match(TAB);
				setState(86);
				match(DATE);
				setState(87);
				match(TAB);
				setState(88);
				match(NEWLINE);
				setState(89);
				match(WORD);
				setState(90);
				match(TAB);
				setState(91);
				match(DATE);
				setState(92);
				match(TAB);
				setState(93);
				match(WORD);
				setState(94);
				match(NEWLINE);
				setState(95);
				match(WORD);
				setState(96);
				match(TAB);
				setState(97);
				match(DATE);
				setState(98);
				match(TAB);
				setState(99);
				match(NEWLINE);
				setState(289); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(289);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
						case 1:
							{
							{
							setState(100);
							match(WORD);
							setState(101);
							match(TAB);
							setState(102);
							match(DATE);
							setState(103);
							match(TAB);
							setState(104);
							((EtcAllPriceContext)_localctx).code = match(NUMBER);
							setState(105);
							match(NEWLINE);
							setState(106);
							match(WORD);
							setState(107);
							match(TAB);
							setState(108);
							match(DATE);
							setState(109);
							match(TAB);
							setState(110);
							((EtcAllPriceContext)_localctx).symbol = word();
							setState(112);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
							case 1:
								{
								setState(111);
								((EtcAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(115);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
							case 1:
								{
								setState(114);
								((EtcAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(118);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
							case 1:
								{
								setState(117);
								((EtcAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(121);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
							case 1:
								{
								setState(120);
								((EtcAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(124);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
							case 1:
								{
								setState(123);
								((EtcAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(127);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
							case 1:
								{
								setState(126);
								((EtcAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(132);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(129);
								((EtcAllPriceContext)_localctx).symbol7 = word();
								}
								}
								setState(134);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(135);
							match(NEWLINE);
							setState(136);
							match(WORD);
							setState(137);
							match(TAB);
							setState(138);
							match(DATE);
							setState(139);
							match(TAB);
							setState(140);
							((EtcAllPriceContext)_localctx).closing = match(NUMBER);
							setState(141);
							match(NEWLINE);
							setState(142);
							match(WORD);
							setState(143);
							match(TAB);
							setState(144);
							match(DATE);
							setState(145);
							match(TAB);
							setState(146);
							match(NUMBER);
							setState(147);
							match(NEWLINE);
							setState(148);
							match(WORD);
							setState(149);
							match(TAB);
							setState(150);
							match(DATE);
							setState(151);
							match(TAB);
							setState(152);
							match(NUMBER);
							setState(153);
							match(NEWLINE);
							setState(154);
							match(WORD);
							setState(155);
							match(TAB);
							setState(156);
							match(DATE);
							setState(157);
							match(TAB);
							setState(158);
							match(NUMBER);
							setState(159);
							match(NEWLINE);
							setState(160);
							match(WORD);
							setState(161);
							match(TAB);
							setState(162);
							match(DATE);
							setState(163);
							match(TAB);
							setState(164);
							((EtcAllPriceContext)_localctx).market = match(NUMBER);
							setState(165);
							match(NEWLINE);
							setState(166);
							match(WORD);
							setState(167);
							match(TAB);
							setState(168);
							match(DATE);
							setState(169);
							match(TAB);
							setState(170);
							((EtcAllPriceContext)_localctx).high = match(NUMBER);
							setState(171);
							match(NEWLINE);
							setState(172);
							match(WORD);
							setState(173);
							match(TAB);
							setState(174);
							match(DATE);
							setState(175);
							match(TAB);
							setState(176);
							((EtcAllPriceContext)_localctx).low = match(NUMBER);
							setState(177);
							match(NEWLINE);
							setState(178);
							match(WORD);
							setState(179);
							match(TAB);
							setState(180);
							match(DATE);
							setState(181);
							match(TAB);
							setState(182);
							((EtcAllPriceContext)_localctx).volume = match(NUMBER);
							setState(183);
							match(NEWLINE);
							setState(184);
							match(WORD);
							setState(185);
							match(TAB);
							setState(186);
							match(DATE);
							setState(187);
							match(TAB);
							setState(188);
							match(NUMBER);
							setState(189);
							match(NEWLINE);
							setState(190);
							match(WORD);
							setState(191);
							match(TAB);
							setState(192);
							match(DATE);
							setState(193);
							match(TAB);
							setState(194);
							match(NUMBER);
							setState(195);
							match(NEWLINE);
							setState(196);
							match(WORD);
							setState(197);
							match(TAB);
							setState(198);
							match(DATE);
							setState(199);
							match(TAB);
							setState(200);
							match(NUMBER);
							setState(201);
							match(NEWLINE);
							setState(202);
							match(WORD);
							setState(203);
							match(TAB);
							setState(204);
							match(DATE);
							setState(205);
							match(TAB);
							setState(206);
							((EtcAllPriceContext)_localctx).volumeOfListedShares = match(NUMBER);
							setState(207);
							match(NEWLINE);
							setState(208);
							match(WORD);
							setState(209);
							match(TAB);
							setState(210);
							match(DATE);
							setState(211);
							match(TAB);
							setState(213); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(212);
								word();
								}
								}
								setState(215); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
							setState(217);
							match(NEWLINE);
							setState(218);
							match(WORD);
							setState(219);
							match(TAB);
							setState(220);
							match(DATE);
							setState(221);
							match(TAB);
							setState(222);
							word();
							setState(223);
							match(NEWLINE);
							setState(224);
							match(WORD);
							setState(225);
							match(TAB);
							setState(226);
							match(DATE);
							setState(227);
							match(TAB);
							setState(228);
							word();
							setState(229);
							match(NEWLINE);
							setState(230);
							match(WORD);
							setState(231);
							match(TAB);
							setState(232);
							match(DATE);
							setState(233);
							match(TAB);
							setState(234);
							word();
							setState(235);
							match(NEWLINE);
							setState(236);
							match(WORD);
							setState(237);
							match(TAB);
							setState(238);
							((EtcAllPriceContext)_localctx).base = match(DATE);
							setState(239);
							match(TAB);
							setState(240);
							match(NEWLINE);

											ParserService.crawlPriceCompanyEtf(20240105
												, (((EtcAllPriceContext)_localctx).code!=null?((EtcAllPriceContext)_localctx).code.getText():null), (((EtcAllPriceContext)_localctx).symbol!=null?_input.getText(((EtcAllPriceContext)_localctx).symbol.start,((EtcAllPriceContext)_localctx).symbol.stop):null)
												, (((EtcAllPriceContext)_localctx).base!=null?((EtcAllPriceContext)_localctx).base.getText():null), (((EtcAllPriceContext)_localctx).closing!=null?((EtcAllPriceContext)_localctx).closing.getText():null), (((EtcAllPriceContext)_localctx).market!=null?((EtcAllPriceContext)_localctx).market.getText():null), (((EtcAllPriceContext)_localctx).high!=null?((EtcAllPriceContext)_localctx).high.getText():null), (((EtcAllPriceContext)_localctx).low!=null?((EtcAllPriceContext)_localctx).low.getText():null), (((EtcAllPriceContext)_localctx).volume!=null?((EtcAllPriceContext)_localctx).volume.getText():null)
											);
											ParserService.crawlEtfDetailThread(20240105, (((EtcAllPriceContext)_localctx).code!=null?((EtcAllPriceContext)_localctx).code.getText():null)
												, (((EtcAllPriceContext)_localctx).symbol!=null?_input.getText(((EtcAllPriceContext)_localctx).symbol.start,((EtcAllPriceContext)_localctx).symbol.stop):null), (((EtcAllPriceContext)_localctx).symbol1!=null?_input.getText(((EtcAllPriceContext)_localctx).symbol1.start,((EtcAllPriceContext)_localctx).symbol1.stop):null), (((EtcAllPriceContext)_localctx).symbol2!=null?_input.getText(((EtcAllPriceContext)_localctx).symbol2.start,((EtcAllPriceContext)_localctx).symbol2.stop):null), (((EtcAllPriceContext)_localctx).symbol3!=null?_input.getText(((EtcAllPriceContext)_localctx).symbol3.start,((EtcAllPriceContext)_localctx).symbol3.stop):null), (((EtcAllPriceContext)_localctx).symbol4!=null?_input.getText(((EtcAllPriceContext)_localctx).symbol4.start,((EtcAllPriceContext)_localctx).symbol4.stop):null), (((EtcAllPriceContext)_localctx).symbol5!=null?_input.getText(((EtcAllPriceContext)_localctx).symbol5.start,((EtcAllPriceContext)_localctx).symbol5.stop):null), (((EtcAllPriceContext)_localctx).symbol6!=null?_input.getText(((EtcAllPriceContext)_localctx).symbol6.start,((EtcAllPriceContext)_localctx).symbol6.stop):null), (((EtcAllPriceContext)_localctx).symbol7!=null?_input.getText(((EtcAllPriceContext)_localctx).symbol7.start,((EtcAllPriceContext)_localctx).symbol7.stop):null)
												, null, null, null, null, null, null, null, null
												, null
												, null
												, (((EtcAllPriceContext)_localctx).volumeOfListedShares!=null?((EtcAllPriceContext)_localctx).volumeOfListedShares.getText():null)
											);
										
							}
							}
							break;
						case 2:
							{
							{
							setState(243);
							match(WORD);
							setState(244);
							match(TAB);
							setState(245);
							match(DATE);
							setState(246);
							match(TAB);
							setState(247);
							match(NUMBER);
							setState(248);
							((EtcAllPriceContext)_localctx).symbol = word();
							setState(250);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
							case 1:
								{
								setState(249);
								((EtcAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(253);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
							case 1:
								{
								setState(252);
								((EtcAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(256);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
							case 1:
								{
								setState(255);
								((EtcAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(259);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
							case 1:
								{
								setState(258);
								((EtcAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(262);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
							case 1:
								{
								setState(261);
								((EtcAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(265);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
							case 1:
								{
								setState(264);
								((EtcAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(270);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(267);
									((EtcAllPriceContext)_localctx).symbol7 = word();
									}
									} 
								}
								setState(272);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
							}
							setState(273);
							((EtcAllPriceContext)_localctx).closing = match(NUMBER);
							setState(274);
							match(NEWLINE);
							setState(275);
							match(WORD);
							setState(276);
							match(TAB);
							setState(277);
							((EtcAllPriceContext)_localctx).base = match(DATE);
							setState(278);
							match(TAB);
							setState(279);
							match(NUMBER);
							setState(280);
							match(NUMBER);
							setState(281);
							match(NUMBER);
							setState(282);
							match(NUMBER);
							setState(283);
							match(NUMBER);
							setState(284);
							match(NUMBER);
							setState(285);
							match(NUMBER);
							setState(286);
							match(NEWLINE);

											ParserService.crawlPriceCompanyEtf(20240105
												, (((EtcAllPriceContext)_localctx).code!=null?((EtcAllPriceContext)_localctx).code.getText():null), (((EtcAllPriceContext)_localctx).symbol!=null?_input.getText(((EtcAllPriceContext)_localctx).symbol.start,((EtcAllPriceContext)_localctx).symbol.stop):null)
												, (((EtcAllPriceContext)_localctx).base!=null?((EtcAllPriceContext)_localctx).base.getText():null), (((EtcAllPriceContext)_localctx).closing!=null?((EtcAllPriceContext)_localctx).closing.getText():null), (((EtcAllPriceContext)_localctx).market!=null?((EtcAllPriceContext)_localctx).market.getText():null), (((EtcAllPriceContext)_localctx).high!=null?((EtcAllPriceContext)_localctx).high.getText():null), (((EtcAllPriceContext)_localctx).low!=null?((EtcAllPriceContext)_localctx).low.getText():null), (((EtcAllPriceContext)_localctx).volume!=null?((EtcAllPriceContext)_localctx).volume.getText():null)
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
					setState(291); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(293);
				match(WORD);
				setState(294);
				match(TAB);
				setState(295);
				match(WORD);
				setState(296);
				match(TAB);
				setState(297);
				match(DATE);
				setState(298);
				match(NEWLINE);
				}
				}
				setState(302); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(304);
			match(KEYWORD);
			setState(305);
			match(TAB);
			setState(306);
			match(WORD);
			setState(307);
			match(TAB);
			setState(308);
			match(WORD);
			setState(309);
			match(WORD);
			setState(310);
			match(WORD);
			setState(311);
			match(WORD);
			setState(312);
			match(TAB);
			setState(313);
			match(WORD);
			setState(314);
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
		enterRule(_localctx, 4, RULE_companyAllPrice);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(KEYWORD);
			setState(317);
			match(TAB);
			setState(318);
			match(WORD);
			setState(319);
			match(TAB);
			setState(320);
			match(WORD);
			setState(321);
			match(WORD);
			setState(322);
			match(WORD);
			setState(323);
			match(WORD);
			setState(324);
			match(WORD);
			setState(325);
			match(WORD);
			setState(326);
			match(TAB);
			setState(327);
			match(WORD);
			setState(328);
			match(NEWLINE);
			setState(811); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(329);
				match(WORD);
				setState(330);
				match(TAB);
				setState(331);
				match(DATE);
				setState(332);
				match(TAB);
				setState(333);
				match(NEWLINE);
				setState(334);
				match(WORD);
				setState(335);
				match(TAB);
				setState(336);
				match(DATE);
				setState(337);
				match(TAB);
				setState(338);
				match(NEWLINE);
				setState(339);
				match(WORD);
				setState(340);
				match(TAB);
				setState(341);
				match(DATE);
				setState(342);
				match(TAB);
				setState(343);
				match(NEWLINE);
				setState(344);
				match(WORD);
				setState(345);
				match(TAB);
				setState(346);
				match(DATE);
				setState(347);
				match(TAB);
				setState(348);
				match(TAB);
				setState(349);
				match(TAB);
				setState(350);
				match(TAB);
				setState(351);
				match(TAB);
				setState(352);
				match(NEWLINE);
				setState(353);
				match(WORD);
				setState(354);
				match(TAB);
				setState(355);
				match(DATE);
				setState(356);
				match(TAB);
				setState(357);
				match(TAB);
				setState(358);
				match(TAB);
				setState(359);
				match(NEWLINE);
				setState(360);
				match(WORD);
				setState(361);
				match(TAB);
				setState(362);
				match(DATE);
				setState(363);
				match(TAB);
				setState(364);
				match(TAB);
				setState(365);
				match(TAB);
				setState(366);
				match(TAB);
				setState(367);
				match(TAB);
				setState(368);
				match(NEWLINE);
				setState(369);
				match(WORD);
				setState(370);
				match(TAB);
				setState(371);
				match(DATE);
				setState(372);
				match(TAB);
				setState(373);
				match(TAB);
				setState(374);
				match(TAB);
				setState(375);
				match(TAB);
				setState(376);
				match(TAB);
				setState(377);
				match(NEWLINE);
				setState(378);
				match(WORD);
				setState(379);
				match(TAB);
				setState(380);
				match(DATE);
				setState(381);
				match(TAB);
				setState(382);
				match(TAB);
				setState(383);
				match(TAB);
				setState(384);
				match(TAB);
				setState(385);
				match(NEWLINE);
				setState(386);
				match(WORD);
				setState(387);
				match(TAB);
				setState(388);
				match(DATE);
				setState(389);
				match(TAB);
				setState(390);
				match(NEWLINE);
				setState(391);
				match(WORD);
				setState(392);
				match(TAB);
				setState(393);
				match(DATE);
				setState(394);
				match(TAB);
				setState(395);
				match(NEWLINE);
				setState(396);
				match(WORD);
				setState(397);
				match(TAB);
				setState(398);
				match(DATE);
				setState(399);
				match(TAB);
				setState(400);
				match(TAB);
				setState(401);
				match(TAB);
				setState(402);
				match(TAB);
				setState(403);
				match(TAB);
				setState(404);
				match(NEWLINE);
				setState(405);
				match(WORD);
				setState(406);
				match(TAB);
				setState(407);
				match(DATE);
				setState(408);
				match(TAB);
				setState(409);
				match(TAB);
				setState(410);
				match(TAB);
				setState(411);
				match(NEWLINE);
				setState(412);
				match(WORD);
				setState(413);
				match(TAB);
				setState(414);
				match(DATE);
				setState(415);
				match(TAB);
				setState(416);
				match(TAB);
				setState(417);
				match(TAB);
				setState(418);
				match(TAB);
				setState(419);
				match(TAB);
				setState(420);
				match(NEWLINE);
				setState(421);
				match(WORD);
				setState(422);
				match(TAB);
				setState(423);
				match(DATE);
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
				match(WORD);
				setState(431);
				match(TAB);
				setState(432);
				match(DATE);
				setState(433);
				match(TAB);
				setState(434);
				match(TAB);
				setState(435);
				match(TAB);
				setState(436);
				match(TAB);
				setState(437);
				match(NEWLINE);
				setState(438);
				match(WORD);
				setState(439);
				match(TAB);
				setState(440);
				match(DATE);
				setState(441);
				match(TAB);
				setState(442);
				match(NEWLINE);
				setState(443);
				match(WORD);
				setState(444);
				match(TAB);
				setState(445);
				match(DATE);
				setState(446);
				match(TAB);
				setState(447);
				match(NEWLINE);
				setState(448);
				match(WORD);
				setState(449);
				match(TAB);
				setState(450);
				match(DATE);
				setState(451);
				match(TAB);
				setState(452);
				match(NEWLINE);
				setState(453);
				match(WORD);
				setState(454);
				match(TAB);
				setState(455);
				match(DATE);
				setState(456);
				match(TAB);
				setState(457);
				match(NEWLINE);
				setState(458);
				match(WORD);
				setState(459);
				match(TAB);
				setState(460);
				match(DATE);
				setState(461);
				match(TAB);
				setState(462);
				match(TAB);
				setState(463);
				match(TAB);
				setState(464);
				match(TAB);
				setState(465);
				match(TAB);
				setState(466);
				match(NEWLINE);
				setState(467);
				match(WORD);
				setState(468);
				match(TAB);
				setState(469);
				match(DATE);
				setState(470);
				match(TAB);
				setState(471);
				match(TAB);
				setState(472);
				match(TAB);
				setState(473);
				match(TAB);
				setState(474);
				match(NEWLINE);
				setState(475);
				match(WORD);
				setState(476);
				match(TAB);
				setState(477);
				match(DATE);
				setState(478);
				match(TAB);
				setState(479);
				match(TAB);
				setState(480);
				match(TAB);
				setState(481);
				match(TAB);
				setState(482);
				match(TAB);
				setState(483);
				match(NEWLINE);
				setState(484);
				match(WORD);
				setState(485);
				match(TAB);
				setState(486);
				match(DATE);
				setState(487);
				match(TAB);
				setState(488);
				match(TAB);
				setState(489);
				match(TAB);
				setState(490);
				match(TAB);
				setState(491);
				match(TAB);
				setState(492);
				match(NEWLINE);
				setState(493);
				match(WORD);
				setState(494);
				match(TAB);
				setState(495);
				match(DATE);
				setState(496);
				match(TAB);
				setState(497);
				match(TAB);
				setState(498);
				match(TAB);
				setState(499);
				match(TAB);
				setState(500);
				match(NEWLINE);
				setState(501);
				match(WORD);
				setState(502);
				match(TAB);
				setState(503);
				match(DATE);
				setState(504);
				match(TAB);
				setState(505);
				match(NEWLINE);
				setState(506);
				match(WORD);
				setState(507);
				match(TAB);
				setState(508);
				match(DATE);
				setState(509);
				match(TAB);
				setState(510);
				match(NEWLINE);
				setState(511);
				match(WORD);
				setState(512);
				match(TAB);
				setState(513);
				match(DATE);
				setState(514);
				match(TAB);
				setState(515);
				match(NEWLINE);
				setState(516);
				match(WORD);
				setState(517);
				match(TAB);
				setState(518);
				match(DATE);
				setState(519);
				match(TAB);
				setState(520);
				match(NEWLINE);
				setState(521);
				match(WORD);
				setState(522);
				match(TAB);
				setState(523);
				match(DATE);
				setState(524);
				match(TAB);
				setState(525);
				match(TAB);
				setState(526);
				match(TAB);
				setState(527);
				match(TAB);
				setState(528);
				match(TAB);
				setState(529);
				match(NEWLINE);
				setState(530);
				match(WORD);
				setState(531);
				match(TAB);
				setState(532);
				match(DATE);
				setState(533);
				match(TAB);
				setState(534);
				match(TAB);
				setState(535);
				match(TAB);
				setState(536);
				match(NEWLINE);
				setState(537);
				match(WORD);
				setState(538);
				match(TAB);
				setState(539);
				match(DATE);
				setState(540);
				match(TAB);
				setState(541);
				match(TAB);
				setState(542);
				match(TAB);
				setState(543);
				match(TAB);
				setState(544);
				match(TAB);
				setState(545);
				match(NEWLINE);
				setState(546);
				match(WORD);
				setState(547);
				match(TAB);
				setState(548);
				match(DATE);
				setState(549);
				match(TAB);
				setState(550);
				match(TAB);
				setState(551);
				match(TAB);
				setState(552);
				match(TAB);
				setState(553);
				match(TAB);
				setState(554);
				match(NEWLINE);
				setState(555);
				match(WORD);
				setState(556);
				match(TAB);
				setState(557);
				match(DATE);
				setState(558);
				match(TAB);
				setState(559);
				match(TAB);
				setState(560);
				match(TAB);
				setState(561);
				match(TAB);
				setState(562);
				match(NEWLINE);
				setState(563);
				match(WORD);
				setState(564);
				match(TAB);
				setState(565);
				match(DATE);
				setState(566);
				match(TAB);
				setState(567);
				match(NEWLINE);
				setState(568);
				match(WORD);
				setState(569);
				match(TAB);
				setState(570);
				match(DATE);
				setState(571);
				match(TAB);
				setState(572);
				match(NEWLINE);
				setState(573);
				match(WORD);
				setState(574);
				match(TAB);
				setState(575);
				match(DATE);
				setState(576);
				match(TAB);
				setState(577);
				match(NEWLINE);
				setState(578);
				match(WORD);
				setState(579);
				match(TAB);
				setState(580);
				match(DATE);
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
				match(WORD);
				setState(588);
				match(TAB);
				setState(589);
				match(DATE);
				setState(590);
				match(TAB);
				setState(591);
				match(TAB);
				setState(592);
				match(TAB);
				setState(593);
				match(NEWLINE);
				setState(594);
				match(WORD);
				setState(595);
				match(TAB);
				setState(596);
				match(DATE);
				setState(597);
				match(TAB);
				setState(598);
				match(TAB);
				setState(599);
				match(TAB);
				setState(600);
				match(TAB);
				setState(601);
				match(TAB);
				setState(602);
				match(NEWLINE);
				setState(603);
				match(WORD);
				setState(604);
				match(TAB);
				setState(605);
				match(DATE);
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
				match(NEWLINE);
				setState(612);
				match(WORD);
				setState(613);
				match(TAB);
				setState(614);
				match(DATE);
				setState(615);
				match(TAB);
				setState(616);
				match(TAB);
				setState(617);
				match(TAB);
				setState(618);
				match(TAB);
				setState(619);
				match(NEWLINE);
				setState(620);
				match(WORD);
				setState(621);
				match(TAB);
				setState(622);
				match(DATE);
				setState(623);
				match(TAB);
				setState(624);
				match(WORD);
				setState(625);
				match(NEWLINE);
				setState(626);
				match(WORD);
				setState(627);
				match(TAB);
				setState(628);
				match(DATE);
				setState(629);
				match(TAB);
				setState(630);
				match(NEWLINE);
				setState(800); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(800);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
						case 1:
							{
							{
							setState(631);
							match(WORD);
							setState(632);
							match(TAB);
							setState(633);
							match(DATE);
							setState(634);
							match(TAB);
							setState(635);
							((CompanyAllPriceContext)_localctx).code = word();
							setState(636);
							match(NEWLINE);
							setState(637);
							match(WORD);
							setState(638);
							match(TAB);
							setState(639);
							match(DATE);
							setState(640);
							match(TAB);
							setState(641);
							((CompanyAllPriceContext)_localctx).symbol = word();
							setState(643);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
							case 1:
								{
								setState(642);
								((CompanyAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(646);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
							case 1:
								{
								setState(645);
								((CompanyAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(649);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
							case 1:
								{
								setState(648);
								((CompanyAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(652);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
							case 1:
								{
								setState(651);
								((CompanyAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(655);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
							case 1:
								{
								setState(654);
								((CompanyAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(658);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
							case 1:
								{
								setState(657);
								((CompanyAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(663);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(660);
								((CompanyAllPriceContext)_localctx).symbol7 = word();
								}
								}
								setState(665);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(666);
							match(NEWLINE);
							setState(667);
							match(WORD);
							setState(668);
							match(TAB);
							setState(669);
							match(DATE);
							setState(670);
							match(TAB);
							setState(671);
							((CompanyAllPriceContext)_localctx).type = word();
							setState(675);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(672);
								word();
								}
								}
								setState(677);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(678);
							match(NEWLINE);
							setState(679);
							match(WORD);
							setState(680);
							match(TAB);
							setState(681);
							match(DATE);
							setState(682);
							match(TAB);
							setState(684);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==WORD) {
								{
								setState(683);
								match(WORD);
								}
							}

							setState(686);
							match(NEWLINE);
							setState(687);
							match(WORD);
							setState(688);
							match(TAB);
							setState(689);
							match(DATE);
							setState(690);
							match(TAB);
							setState(691);
							((CompanyAllPriceContext)_localctx).closing = match(NUMBER);
							setState(692);
							match(NEWLINE);
							setState(693);
							match(WORD);
							setState(694);
							match(TAB);
							setState(695);
							match(DATE);
							setState(696);
							match(TAB);
							setState(697);
							match(NUMBER);
							setState(698);
							match(NEWLINE);
							setState(699);
							match(WORD);
							setState(700);
							match(TAB);
							setState(701);
							match(DATE);
							setState(702);
							match(TAB);
							setState(703);
							match(NUMBER);
							setState(704);
							match(NEWLINE);
							setState(705);
							match(WORD);
							setState(706);
							match(TAB);
							setState(707);
							match(DATE);
							setState(708);
							match(TAB);
							setState(709);
							((CompanyAllPriceContext)_localctx).market = match(NUMBER);
							setState(710);
							match(NEWLINE);
							setState(711);
							match(WORD);
							setState(712);
							match(TAB);
							setState(713);
							match(DATE);
							setState(714);
							match(TAB);
							setState(715);
							((CompanyAllPriceContext)_localctx).high = match(NUMBER);
							setState(716);
							match(NEWLINE);
							setState(717);
							match(WORD);
							setState(718);
							match(TAB);
							setState(719);
							match(DATE);
							setState(720);
							match(TAB);
							setState(721);
							((CompanyAllPriceContext)_localctx).low = match(NUMBER);
							setState(722);
							match(NEWLINE);
							setState(723);
							match(WORD);
							setState(724);
							match(TAB);
							setState(725);
							match(DATE);
							setState(726);
							match(TAB);
							setState(727);
							((CompanyAllPriceContext)_localctx).volume = match(NUMBER);
							setState(728);
							match(NEWLINE);
							setState(729);
							match(WORD);
							setState(730);
							match(TAB);
							setState(731);
							match(DATE);
							setState(732);
							match(TAB);
							setState(733);
							match(NUMBER);
							setState(734);
							match(NEWLINE);
							setState(735);
							match(WORD);
							setState(736);
							match(TAB);
							setState(737);
							match(DATE);
							setState(738);
							match(TAB);
							setState(739);
							match(NUMBER);
							setState(740);
							match(NEWLINE);
							setState(741);
							match(WORD);
							setState(742);
							match(TAB);
							setState(743);
							match(DATE);
							setState(744);
							match(TAB);
							setState(745);
							((CompanyAllPriceContext)_localctx).volumeOfListedShares = match(NUMBER);
							setState(746);
							match(NEWLINE);
							setState(747);
							match(WORD);
							setState(748);
							match(TAB);
							setState(749);
							((CompanyAllPriceContext)_localctx).base = match(DATE);
							setState(750);
							match(TAB);
							setState(751);
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
							setState(754);
							match(WORD);
							setState(755);
							match(TAB);
							setState(756);
							match(DATE);
							setState(757);
							match(TAB);
							setState(758);
							match(NUMBER);
							setState(759);
							((CompanyAllPriceContext)_localctx).symbol = word();
							setState(761);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
							case 1:
								{
								setState(760);
								((CompanyAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(764);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
							case 1:
								{
								setState(763);
								((CompanyAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(767);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
							case 1:
								{
								setState(766);
								((CompanyAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(770);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
							case 1:
								{
								setState(769);
								((CompanyAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(773);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
							case 1:
								{
								setState(772);
								((CompanyAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(776);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
							case 1:
								{
								setState(775);
								((CompanyAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(781);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(778);
									((CompanyAllPriceContext)_localctx).symbol7 = word();
									}
									} 
								}
								setState(783);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
							}
							setState(784);
							((CompanyAllPriceContext)_localctx).closing = match(NUMBER);
							setState(785);
							match(NEWLINE);
							setState(786);
							match(WORD);
							setState(787);
							match(TAB);
							setState(788);
							((CompanyAllPriceContext)_localctx).base = match(DATE);
							setState(789);
							match(TAB);
							setState(790);
							match(NUMBER);
							setState(791);
							match(NUMBER);
							setState(792);
							match(NUMBER);
							setState(793);
							match(NUMBER);
							setState(794);
							match(NUMBER);
							setState(795);
							match(NUMBER);
							setState(796);
							match(NUMBER);
							setState(797);
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
					setState(802); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(804);
				match(WORD);
				setState(805);
				match(TAB);
				setState(806);
				match(WORD);
				setState(807);
				match(TAB);
				setState(808);
				match(DATE);
				setState(809);
				match(NEWLINE);
				}
				}
				setState(813); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(815);
			match(KEYWORD);
			setState(816);
			match(TAB);
			setState(817);
			match(WORD);
			setState(818);
			match(TAB);
			setState(819);
			match(WORD);
			setState(820);
			match(WORD);
			setState(821);
			match(WORD);
			setState(822);
			match(WORD);
			setState(823);
			match(WORD);
			setState(824);
			match(WORD);
			setState(825);
			match(TAB);
			setState(826);
			match(WORD);
			setState(827);
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
		enterRule(_localctx, 6, RULE_crawlPriceKrx);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(KEYWORD);
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
			match(NEWLINE);
			setState(1022); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1022);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					{
					setState(837);
					match(NUMBER);
					setState(838);
					match(TAB);
					setState(839);
					match(WORD);
					setState(840);
					match(WORD);
					setState(841);
					match(TAB);
					setState(842);
					match(NEWLINE);
					}
					}
					break;
				case WORD:
					{
					setState(1012); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1010);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
							case 1:
								{
								{
								setState(843);
								match(WORD);
								setState(844);
								match(TAB);
								setState(845);
								match(NUMBER);
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
								match(WORD);
								setState(852);
								match(TAB);
								setState(853);
								match(WORD);
								setState(854);
								match(TAB);
								setState(855);
								match(WORD);
								setState(856);
								match(TAB);
								setState(857);
								match(WORD);
								setState(858);
								match(TAB);
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
								match(TAB);
								setState(865);
								match(WORD);
								setState(866);
								match(TAB);
								setState(867);
								match(WORD);
								setState(868);
								match(TAB);
								setState(869);
								match(NEWLINE);
								setState(898); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(870);
										match(WORD);
										setState(871);
										match(TAB);
										setState(872);
										((CrawlPriceKrxContext)_localctx).code = match(NUMBER);
										setState(873);
										match(TAB);
										setState(874);
										((CrawlPriceKrxContext)_localctx).base = match(DATE);
										setState(875);
										match(TAB);
										setState(876);
										((CrawlPriceKrxContext)_localctx).closing = match(NUMBER);
										setState(877);
										match(TAB);
										setState(878);
										match(NUMBER);
										setState(879);
										match(TAB);
										setState(880);
										match(NUMBER);
										setState(881);
										match(TAB);
										setState(882);
										((CrawlPriceKrxContext)_localctx).market = match(NUMBER);
										setState(883);
										match(TAB);
										setState(884);
										((CrawlPriceKrxContext)_localctx).high = match(NUMBER);
										setState(885);
										match(TAB);
										setState(886);
										((CrawlPriceKrxContext)_localctx).low = match(NUMBER);
										setState(887);
										match(TAB);
										setState(888);
										((CrawlPriceKrxContext)_localctx).volume = match(NUMBER);
										setState(889);
										match(TAB);
										setState(890);
										match(NUMBER);
										setState(891);
										match(TAB);
										setState(892);
										match(NUMBER);
										setState(893);
										match(TAB);
										setState(894);
										match(NUMBER);
										setState(895);
										match(TAB);
										setState(896);
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
									setState(900); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
								} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
								}
								}
								break;
							case 2:
								{
								{
								setState(902);
								match(WORD);
								setState(903);
								match(TAB);
								setState(904);
								match(NUMBER);
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
								match(WORD);
								setState(917);
								match(TAB);
								setState(918);
								match(WORD);
								setState(919);
								match(TAB);
								setState(920);
								match(WORD);
								setState(921);
								match(TAB);
								setState(922);
								match(WORD);
								setState(923);
								match(TAB);
								setState(924);
								match(WORD);
								setState(925);
								match(TAB);
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
								match(TAB);
								setState(932);
								match(WORD);
								setState(933);
								match(TAB);
								setState(934);
								match(WORD);
								setState(935);
								match(TAB);
								setState(936);
								match(WORD);
								setState(937);
								match(TAB);
								setState(938);
								match(WORD);
								setState(939);
								match(TAB);
								setState(940);
								match(NEWLINE);
								setState(1006); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(941);
										match(WORD);
										setState(942);
										match(TAB);
										setState(943);
										((CrawlPriceKrxContext)_localctx).code = match(NUMBER);
										setState(944);
										match(TAB);
										setState(945);
										((CrawlPriceKrxContext)_localctx).base = match(DATE);
										setState(946);
										match(TAB);
										setState(947);
										((CrawlPriceKrxContext)_localctx).closing = match(NUMBER);
										setState(948);
										match(TAB);
										setState(949);
										match(NUMBER);
										setState(950);
										match(TAB);
										setState(951);
										match(NUMBER);
										setState(952);
										match(TAB);
										setState(953);
										match(NUMBER);
										setState(954);
										match(TAB);
										setState(955);
										((CrawlPriceKrxContext)_localctx).market = match(NUMBER);
										setState(956);
										match(TAB);
										setState(957);
										((CrawlPriceKrxContext)_localctx).high = match(NUMBER);
										setState(958);
										match(TAB);
										setState(959);
										((CrawlPriceKrxContext)_localctx).low = match(NUMBER);
										setState(960);
										match(TAB);
										setState(961);
										((CrawlPriceKrxContext)_localctx).volume = match(NUMBER);
										setState(962);
										match(TAB);
										setState(963);
										match(NUMBER);
										setState(964);
										match(TAB);
										setState(965);
										match(NUMBER);
										setState(966);
										match(TAB);
										setState(967);
										match(NUMBER);
										setState(968);
										match(TAB);
										setState(969);
										match(NUMBER);
										setState(970);
										match(TAB);
										setState(971);
										((CrawlPriceKrxContext)_localctx).symbol = word();
										setState(973);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
										case 1:
											{
											setState(972);
											((CrawlPriceKrxContext)_localctx).symbol1 = word();
											}
											break;
										}
										setState(976);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
										case 1:
											{
											setState(975);
											((CrawlPriceKrxContext)_localctx).symbol2 = word();
											}
											break;
										}
										setState(979);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
										case 1:
											{
											setState(978);
											((CrawlPriceKrxContext)_localctx).symbol3 = word();
											}
											break;
										}
										setState(982);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
										case 1:
											{
											setState(981);
											((CrawlPriceKrxContext)_localctx).symbol4 = word();
											}
											break;
										}
										setState(985);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
										case 1:
											{
											setState(984);
											((CrawlPriceKrxContext)_localctx).symbol5 = word();
											}
											break;
										}
										setState(988);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
										case 1:
											{
											setState(987);
											((CrawlPriceKrxContext)_localctx).symbol6 = word();
											}
											break;
										}
										setState(993);
										_errHandler.sync(this);
										_la = _input.LA(1);
										while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
											{
											{
											setState(990);
											((CrawlPriceKrxContext)_localctx).symbol7 = word();
											}
											}
											setState(995);
											_errHandler.sync(this);
											_la = _input.LA(1);
										}
										setState(996);
										match(TAB);
										setState(997);
										match(NUMBER);
										setState(998);
										match(TAB);
										setState(999);
										match(NUMBER);
										setState(1000);
										match(TAB);
										setState(1001);
										match(NUMBER);
										setState(1002);
										match(TAB);
										setState(1003);
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
									setState(1008); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
						setState(1014); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(1016);
					match(WORD);
					setState(1017);
					match(TAB);
					setState(1018);
					match(WORD);
					setState(1019);
					match(TAB);
					setState(1020);
					match(DATE);
					setState(1021);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1024); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER || _la==WORD );
			setState(1026);
			match(KEYWORD);
			setState(1027);
			match(TAB);
			setState(1028);
			match(WORD);
			setState(1029);
			match(TAB);
			setState(1030);
			match(WORD);
			setState(1031);
			match(TAB);
			setState(1032);
			match(WORD);
			setState(1033);
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
		enterRule(_localctx, 8, RULE_crawlItemEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			match(KEYWORD);
			setState(1036);
			match(TAB);
			setState(1037);
			match(WORD);
			setState(1038);
			match(TAB);
			setState(1039);
			match(WORD);
			setState(1040);
			match(WORD);
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
			match(NEWLINE);
			setState(1175); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1047);
				match(WORD);
				setState(1048);
				match(TAB);
				setState(1049);
				match(NEWLINE);
				setState(1050);
				match(WORD);
				setState(1051);
				match(TAB);
				setState(1052);
				match(WORD);
				setState(1053);
				match(TAB);
				setState(1054);
				match(WORD);
				setState(1055);
				match(TAB);
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
				match(WORD);
				setState(1064);
				match(NEWLINE);
				setState(1065);
				match(WORD);
				setState(1066);
				match(TAB);
				setState(1067);
				match(TAB);
				setState(1068);
				match(TAB);
				setState(1069);
				match(WORD);
				setState(1070);
				match(TAB);
				setState(1071);
				match(TAB);
				setState(1072);
				match(TAB);
				setState(1073);
				match(TAB);
				setState(1074);
				match(TAB);
				setState(1075);
				match(TAB);
				setState(1076);
				match(WORD);
				setState(1077);
				match(TAB);
				setState(1078);
				match(WORD);
				setState(1079);
				match(TAB);
				setState(1080);
				match(NEWLINE);
				setState(1164); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1081);
						((CrawlItemEtfContext)_localctx).type = match(WORD);
						setState(1082);
						match(TAB);
						setState(1083);
						match(TAB);
						setState(1084);
						((CrawlItemEtfContext)_localctx).symbol = word();
						setState(1086);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
						case 1:
							{
							setState(1085);
							((CrawlItemEtfContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(1089);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
						case 1:
							{
							setState(1088);
							((CrawlItemEtfContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(1092);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
						case 1:
							{
							setState(1091);
							((CrawlItemEtfContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(1095);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
						case 1:
							{
							setState(1094);
							((CrawlItemEtfContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(1098);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
						case 1:
							{
							setState(1097);
							((CrawlItemEtfContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(1101);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
						case 1:
							{
							setState(1100);
							((CrawlItemEtfContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(1106);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(1103);
							((CrawlItemEtfContext)_localctx).symbol7 = word();
							}
							}
							setState(1108);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1109);
						match(TAB);
						setState(1110);
						((CrawlItemEtfContext)_localctx).code = match(NUMBER);
						setState(1111);
						match(TAB);
						setState(1112);
						((CrawlItemEtfContext)_localctx).category = word();
						setState(1114);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
						case 1:
							{
							setState(1113);
							((CrawlItemEtfContext)_localctx).category1 = word();
							}
							break;
						}
						setState(1117);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
						case 1:
							{
							setState(1116);
							((CrawlItemEtfContext)_localctx).category2 = word();
							}
							break;
						}
						setState(1120);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
						case 1:
							{
							setState(1119);
							((CrawlItemEtfContext)_localctx).category3 = word();
							}
							break;
						}
						setState(1123);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
						case 1:
							{
							setState(1122);
							((CrawlItemEtfContext)_localctx).category4 = word();
							}
							break;
						}
						setState(1126);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
						case 1:
							{
							setState(1125);
							((CrawlItemEtfContext)_localctx).category5 = word();
							}
							break;
						}
						setState(1129);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
						case 1:
							{
							setState(1128);
							((CrawlItemEtfContext)_localctx).category6 = word();
							}
							break;
						}
						setState(1134);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(1131);
							((CrawlItemEtfContext)_localctx).category7 = word();
							}
							}
							setState(1136);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1137);
						match(TAB);
						setState(1138);
						((CrawlItemEtfContext)_localctx).asset = match(NUMBER);
						setState(1139);
						match(TAB);
						setState(1140);
						((CrawlItemEtfContext)_localctx).closing = match(NUMBER);
						setState(1141);
						match(TAB);
						setState(1142);
						((CrawlItemEtfContext)_localctx).amount = match(NUMBER);
						setState(1143);
						match(TAB);
						setState(1144);
						match(TAB);
						setState(1145);
						match(TAB);
						setState(1147);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(1146);
							((CrawlItemEtfContext)_localctx).priceEarningsRatio = match(NUMBER);
							}
						}

						setState(1149);
						match(TAB);
						setState(1150);
						match(TAB);
						setState(1151);
						match(TAB);
						setState(1152);
						match(TAB);
						setState(1153);
						match(TAB);
						setState(1154);
						match(TAB);
						setState(1156);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(1155);
							((CrawlItemEtfContext)_localctx).fee = match(NUMBER);
							}
						}

						setState(1158);
						match(TAB);
						setState(1159);
						((CrawlItemEtfContext)_localctx).operator = match(WORD);
						setState(1160);
						match(TAB);
						setState(1161);
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
					setState(1166); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1168);
				match(WORD);
				setState(1169);
				match(TAB);
				setState(1170);
				match(WORD);
				setState(1171);
				match(TAB);
				setState(1172);
				match(DATE);
				setState(1173);
				match(NEWLINE);
				}
				}
				setState(1177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1179);
			match(KEYWORD);
			setState(1180);
			match(TAB);
			setState(1181);
			match(WORD);
			setState(1182);
			match(TAB);
			setState(1183);
			match(WORD);
			setState(1184);
			match(WORD);
			setState(1185);
			match(WORD);
			setState(1186);
			match(TAB);
			setState(1187);
			match(WORD);
			setState(1188);
			match(TAB);
			setState(1189);
			match(WORD);
			setState(1190);
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
		enterRule(_localctx, 10, RULE_crawlPriceEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			match(KEYWORD);
			setState(1193);
			match(TAB);
			setState(1194);
			match(WORD);
			setState(1195);
			match(WORD);
			setState(1196);
			match(TAB);
			setState(1197);
			match(WORD);
			setState(1198);
			match(TAB);
			setState(1199);
			match(WORD);
			setState(1200);
			match(TAB);
			setState(1201);
			match(WORD);
			setState(1202);
			match(NEWLINE);
			setState(1344); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1203);
				((CrawlPriceEtfContext)_localctx).code = match(NUMBER);
				setState(1204);
				match(TAB);
				setState(1206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1205);
					word();
					}
					}
					setState(1208); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(1210);
				match(NEWLINE);
				{
				setState(1211);
				match(KEYWORD);
				setState(1212);
				match(TAB);
				setState(1213);
				((CrawlPriceEtfContext)_localctx).symbol = word();
				setState(1215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(1214);
					((CrawlPriceEtfContext)_localctx).symbol1 = word();
					}
					break;
				}
				setState(1218);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(1217);
					((CrawlPriceEtfContext)_localctx).symbol2 = word();
					}
					break;
				}
				setState(1221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(1220);
					((CrawlPriceEtfContext)_localctx).symbol3 = word();
					}
					break;
				}
				setState(1224);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(1223);
					((CrawlPriceEtfContext)_localctx).symbol4 = word();
					}
					break;
				}
				setState(1227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(1226);
					((CrawlPriceEtfContext)_localctx).symbol5 = word();
					}
					break;
				}
				setState(1230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(1229);
					((CrawlPriceEtfContext)_localctx).symbol6 = word();
					}
					break;
				}
				setState(1235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
					{
					{
					setState(1232);
					((CrawlPriceEtfContext)_localctx).symbol7 = word();
					}
					}
					setState(1237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1238);
				match(NEWLINE);
				setState(1239);
				match(KEYWORD);
				setState(1240);
				match(TAB);
				setState(1241);
				((CrawlPriceEtfContext)_localctx).category = word();
				setState(1243);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(1242);
					((CrawlPriceEtfContext)_localctx).category1 = word();
					}
					break;
				}
				setState(1246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(1245);
					((CrawlPriceEtfContext)_localctx).category2 = word();
					}
					break;
				}
				setState(1249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(1248);
					((CrawlPriceEtfContext)_localctx).category3 = word();
					}
					break;
				}
				setState(1252);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(1251);
					((CrawlPriceEtfContext)_localctx).category4 = word();
					}
					break;
				}
				setState(1255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(1254);
					((CrawlPriceEtfContext)_localctx).category5 = word();
					}
					break;
				}
				setState(1258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(1257);
					((CrawlPriceEtfContext)_localctx).category6 = word();
					}
					break;
				}
				setState(1263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
					{
					{
					setState(1260);
					((CrawlPriceEtfContext)_localctx).category7 = word();
					}
					}
					setState(1265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1266);
				match(NEWLINE);
				setState(1267);
				match(KEYWORD);
				setState(1268);
				match(TAB);
				setState(1269);
				((CrawlPriceEtfContext)_localctx).ea = match(NUMBER);
				setState(1270);
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
				setState(1333); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1273);
						match(WORD);
						setState(1274);
						match(TAB);
						setState(1275);
						match(WORD);
						setState(1276);
						match(TAB);
						setState(1277);
						match(WORD);
						setState(1278);
						match(TAB);
						setState(1279);
						match(WORD);
						setState(1280);
						match(TAB);
						setState(1281);
						match(WORD);
						setState(1282);
						match(TAB);
						setState(1283);
						match(WORD);
						setState(1284);
						match(TAB);
						setState(1285);
						match(WORD);
						setState(1286);
						match(TAB);
						setState(1287);
						match(WORD);
						setState(1288);
						match(TAB);
						setState(1289);
						match(NEWLINE);
						setState(1329); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(1329);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
							case 1:
								{
								{
								setState(1290);
								match(TAB);
								setState(1291);
								match(TAB);
								setState(1292);
								match(TAB);
								setState(1293);
								match(TAB);
								setState(1294);
								match(TAB);
								setState(1295);
								match(TAB);
								setState(1296);
								match(TAB);
								setState(1297);
								match(TAB);
								setState(1298);
								match(NEWLINE);
								}
								}
								break;
							case 2:
								{
								{
								setState(1300);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(1299);
									((CrawlPriceEtfContext)_localctx).base = match(DATE);
									}
								}

								setState(1302);
								match(TAB);
								setState(1304);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(1303);
									((CrawlPriceEtfContext)_localctx).closing = match(NUMBER);
									}
								}

								setState(1306);
								match(TAB);
								setState(1308);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(1307);
									match(NUMBER);
									}
								}

								setState(1310);
								match(TAB);
								setState(1312);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(1311);
									((CrawlPriceEtfContext)_localctx).market = match(NUMBER);
									}
								}

								setState(1314);
								match(TAB);
								setState(1316);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(1315);
									((CrawlPriceEtfContext)_localctx).high = match(NUMBER);
									}
								}

								setState(1318);
								match(TAB);
								setState(1319);
								((CrawlPriceEtfContext)_localctx).low = match(NUMBER);
								setState(1320);
								match(TAB);
								setState(1321);
								((CrawlPriceEtfContext)_localctx).volume = match(NUMBER);
								setState(1322);
								match(TAB);
								setState(1324);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(1323);
									match(NUMBER);
									}
								}

								setState(1326);
								match(TAB);
								setState(1327);
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
							setState(1331); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1335); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1337);
				match(WORD);
				setState(1338);
				match(TAB);
				setState(1339);
				match(WORD);
				setState(1340);
				match(TAB);
				setState(1341);
				match(DATE);
				setState(1342);
				match(NEWLINE);
				}
				}
				setState(1346); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(1348);
			match(KEYWORD);
			setState(1349);
			match(TAB);
			setState(1350);
			match(WORD);
			setState(1351);
			match(WORD);
			setState(1352);
			match(TAB);
			setState(1353);
			match(WORD);
			setState(1354);
			match(TAB);
			setState(1355);
			match(WORD);
			setState(1356);
			match(TAB);
			setState(1357);
			match(WORD);
			setState(1358);
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
		enterRule(_localctx, 12, RULE_crawlPriceCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			match(KEYWORD);
			setState(1361);
			match(TAB);
			setState(1362);
			match(WORD);
			setState(1363);
			match(WORD);
			setState(1364);
			match(TAB);
			setState(1365);
			match(WORD);
			setState(1366);
			match(TAB);
			setState(1367);
			match(WORD);
			setState(1368);
			match(TAB);
			setState(1369);
			match(WORD);
			setState(1370);
			match(NEWLINE);
			setState(1433); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1371);
				((CrawlPriceCompanyContext)_localctx).code = match(NUMBER);
				setState(1372);
				match(TAB);
				setState(1374); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1373);
					((CrawlPriceCompanyContext)_localctx).symbol = word();
					}
					}
					setState(1376); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(1378);
				match(NEWLINE);
				setState(1422); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1379);
						match(WORD);
						setState(1380);
						match(TAB);
						setState(1381);
						match(WORD);
						setState(1382);
						match(TAB);
						setState(1383);
						match(WORD);
						setState(1384);
						match(TAB);
						setState(1385);
						match(WORD);
						setState(1386);
						match(TAB);
						setState(1387);
						match(WORD);
						setState(1388);
						match(TAB);
						setState(1389);
						match(WORD);
						setState(1390);
						match(TAB);
						setState(1391);
						match(WORD);
						setState(1392);
						match(TAB);
						setState(1393);
						match(NEWLINE);
						setState(1418); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(1418);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case TAB:
								{
								{
								setState(1394);
								match(TAB);
								setState(1395);
								match(TAB);
								setState(1396);
								match(TAB);
								setState(1397);
								match(TAB);
								setState(1398);
								match(TAB);
								setState(1399);
								match(TAB);
								setState(1400);
								match(TAB);
								setState(1401);
								match(NEWLINE);
								}
								}
								break;
							case DATE:
								{
								{
								setState(1402);
								((CrawlPriceCompanyContext)_localctx).base = match(DATE);
								setState(1403);
								match(TAB);
								setState(1404);
								((CrawlPriceCompanyContext)_localctx).closing = match(NUMBER);
								setState(1405);
								match(TAB);
								setState(1406);
								match(NUMBER);
								setState(1407);
								match(TAB);
								setState(1408);
								((CrawlPriceCompanyContext)_localctx).market = match(NUMBER);
								setState(1409);
								match(TAB);
								setState(1410);
								((CrawlPriceCompanyContext)_localctx).high = match(NUMBER);
								setState(1411);
								match(TAB);
								setState(1412);
								((CrawlPriceCompanyContext)_localctx).low = match(NUMBER);
								setState(1413);
								match(TAB);
								setState(1414);
								((CrawlPriceCompanyContext)_localctx).volume = match(NUMBER);
								setState(1415);
								match(TAB);
								setState(1416);
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
							setState(1420); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1424); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1426);
				match(WORD);
				setState(1427);
				match(TAB);
				setState(1428);
				match(WORD);
				setState(1429);
				match(TAB);
				setState(1430);
				match(DATE);
				setState(1431);
				match(NEWLINE);
				}
				}
				setState(1435); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(1437);
			match(KEYWORD);
			setState(1438);
			match(TAB);
			setState(1439);
			match(WORD);
			setState(1440);
			match(WORD);
			setState(1441);
			match(TAB);
			setState(1442);
			match(WORD);
			setState(1443);
			match(TAB);
			setState(1444);
			match(WORD);
			setState(1445);
			match(TAB);
			setState(1446);
			match(WORD);
			setState(1447);
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
		enterRule(_localctx, 14, RULE_crawlItemDetailCompanyThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
			match(KEYWORD);
			setState(1450);
			match(TAB);
			setState(1451);
			match(WORD);
			setState(1452);
			match(WORD);
			setState(1453);
			match(TAB);
			setState(1454);
			match(WORD);
			setState(1455);
			match(TAB);
			setState(1456);
			match(WORD);
			setState(1457);
			match(TAB);
			setState(1458);
			match(WORD);
			setState(1459);
			match(NEWLINE);
			setState(1517); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1460);
					match(KEYWORD);
					setState(1461);
					match(TAB);
					setState(1462);
					((CrawlItemDetailCompanyThreadContext)_localctx).code = match(NUMBER);
					setState(1463);
					match(TAB);
					setState(1464);
					((CrawlItemDetailCompanyThreadContext)_localctx).type = match(WORD);
					setState(1465);
					match(TAB);
					setState(1466);
					((CrawlItemDetailCompanyThreadContext)_localctx).symbol = word();
					setState(1468);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
					case 1:
						{
						setState(1467);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(1471);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
					case 1:
						{
						setState(1470);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(1474);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
					case 1:
						{
						setState(1473);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(1477);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
					case 1:
						{
						setState(1476);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(1480);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
					case 1:
						{
						setState(1479);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(1483);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
					case 1:
						{
						setState(1482);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(1488);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(1485);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(1490);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1491);
					match(NEWLINE);
					setState(1492);
					match(KEYWORD);
					setState(1493);
					match(TAB);
					setState(1494);
					((CrawlItemDetailCompanyThreadContext)_localctx).category = match(STRING);
					setState(1495);
					match(NEWLINE);
					setState(1496);
					match(KEYWORD);
					setState(1497);
					match(TAB);
					setState(1498);
					((CrawlItemDetailCompanyThreadContext)_localctx).fics = match(STRING);
					setState(1499);
					match(NEWLINE);
					setState(1500);
					match(KEYWORD);
					setState(1501);
					match(TAB);
					setState(1502);
					((CrawlItemDetailCompanyThreadContext)_localctx).ea = match(NUMBER);
					setState(1503);
					match(WORD);
					setState(1504);
					match(NEWLINE);
					setState(1505);
					match(KEYWORD);
					setState(1506);
					match(TAB);
					setState(1507);
					((CrawlItemDetailCompanyThreadContext)_localctx).ipo = match(DATE);
					setState(1508);
					match(NEWLINE);
					setState(1509);
					match(WORD);
					setState(1510);
					match(TAB);
					setState(1511);
					match(WORD);
					setState(1512);
					match(TAB);
					setState(1513);
					match(DATE);
					setState(1514);
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
				setState(1519); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1521);
			match(KEYWORD);
			setState(1522);
			match(TAB);
			setState(1523);
			match(WORD);
			setState(1524);
			match(WORD);
			setState(1525);
			match(TAB);
			setState(1526);
			match(WORD);
			setState(1527);
			match(TAB);
			setState(1528);
			match(WORD);
			setState(1529);
			match(TAB);
			setState(1530);
			match(WORD);
			setState(1531);
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
		enterRule(_localctx, 16, RULE_crawlItemDividendTopCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			match(KEYWORD);
			setState(1534);
			match(TAB);
			setState(1535);
			match(WORD);
			setState(1536);
			match(TAB);
			setState(1537);
			match(WORD);
			setState(1538);
			match(WORD);
			setState(1539);
			match(WORD);
			setState(1540);
			match(TAB);
			setState(1541);
			match(WORD);
			setState(1542);
			match(TAB);
			setState(1543);
			match(WORD);
			setState(1544);
			match(NEWLINE);
			setState(1613); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1545);
				match(WORD);
				setState(1546);
				match(TAB);
				setState(1547);
				match(NEWLINE);
				setState(1548);
				match(WORD);
				setState(1549);
				match(TAB);
				setState(1550);
				match(WORD);
				setState(1551);
				match(TAB);
				setState(1552);
				match(WORD);
				setState(1553);
				match(TAB);
				setState(1554);
				match(WORD);
				setState(1555);
				match(TAB);
				setState(1556);
				match(WORD);
				setState(1557);
				match(TAB);
				setState(1558);
				match(WORD);
				setState(1559);
				match(TAB);
				setState(1560);
				match(WORD);
				setState(1561);
				match(TAB);
				setState(1562);
				match(WORD);
				setState(1563);
				match(TAB);
				setState(1564);
				match(WORD);
				setState(1565);
				match(TAB);
				setState(1566);
				match(WORD);
				setState(1567);
				match(TAB);
				setState(1568);
				match(WORD);
				setState(1569);
				match(TAB);
				setState(1570);
				match(NEWLINE);
				setState(1602); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1571);
						((CrawlItemDividendTopCompanyContext)_localctx).type = match(WORD);
						setState(1572);
						match(TAB);
						setState(1573);
						match(NUMBER);
						setState(1574);
						match(TAB);
						setState(1576);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(1575);
							((CrawlItemDividendTopCompanyContext)_localctx).code = match(NUMBER);
							}
						}

						setState(1578);
						match(TAB);
						setState(1580); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1579);
							word();
							}
							}
							setState(1582); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(1584);
						match(TAB);
						setState(1585);
						match(WORD);
						setState(1586);
						match(TAB);
						setState(1587);
						match(WORD);
						setState(1588);
						match(TAB);
						setState(1589);
						match(NUMBER);
						setState(1590);
						match(TAB);
						setState(1591);
						match(NUMBER);
						setState(1592);
						match(TAB);
						setState(1593);
						match(NUMBER);
						setState(1594);
						match(TAB);
						setState(1595);
						match(NUMBER);
						setState(1596);
						match(TAB);
						setState(1597);
						match(NUMBER);
						setState(1598);
						match(TAB);
						setState(1599);
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
					setState(1604); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1606);
				match(WORD);
				setState(1607);
				match(TAB);
				setState(1608);
				match(WORD);
				setState(1609);
				match(TAB);
				setState(1610);
				match(DATE);
				setState(1611);
				match(NEWLINE);
				}
				}
				setState(1615); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1617);
			match(KEYWORD);
			setState(1618);
			match(TAB);
			setState(1619);
			match(WORD);
			setState(1620);
			match(TAB);
			setState(1621);
			match(WORD);
			setState(1622);
			match(WORD);
			setState(1623);
			match(WORD);
			setState(1624);
			match(TAB);
			setState(1625);
			match(WORD);
			setState(1626);
			match(TAB);
			setState(1627);
			match(WORD);
			setState(1628);
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
		enterRule(_localctx, 18, RULE_crawlEtfDetailThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			match(KEYWORD);
			setState(1631);
			match(TAB);
			setState(1632);
			match(WORD);
			setState(1633);
			match(WORD);
			setState(1634);
			match(TAB);
			setState(1635);
			match(WORD);
			setState(1636);
			match(TAB);
			setState(1637);
			match(WORD);
			setState(1638);
			match(NEWLINE);
			setState(1720); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1639);
					match(KEYWORD);
					setState(1640);
					match(TAB);
					setState(1641);
					((CrawlEtfDetailThreadContext)_localctx).code = match(NUMBER);
					setState(1642);
					match(TAB);
					setState(1646);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(1643);
						word();
						}
						}
						setState(1648);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1649);
					match(NEWLINE);
					setState(1650);
					((CrawlEtfDetailThreadContext)_localctx).symbol = word();
					setState(1652);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
					case 1:
						{
						setState(1651);
						((CrawlEtfDetailThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(1655);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
					case 1:
						{
						setState(1654);
						((CrawlEtfDetailThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(1658);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
					case 1:
						{
						setState(1657);
						((CrawlEtfDetailThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(1661);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
					case 1:
						{
						setState(1660);
						((CrawlEtfDetailThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(1664);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
					case 1:
						{
						setState(1663);
						((CrawlEtfDetailThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(1667);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
					case 1:
						{
						setState(1666);
						((CrawlEtfDetailThreadContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(1672);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(1669);
						((CrawlEtfDetailThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(1674);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1675);
					match(NEWLINE);
					setState(1676);
					((CrawlEtfDetailThreadContext)_localctx).category = word();
					setState(1678);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
					case 1:
						{
						setState(1677);
						((CrawlEtfDetailThreadContext)_localctx).category1 = word();
						}
						break;
					}
					setState(1681);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
					case 1:
						{
						setState(1680);
						((CrawlEtfDetailThreadContext)_localctx).category2 = word();
						}
						break;
					}
					setState(1684);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
					case 1:
						{
						setState(1683);
						((CrawlEtfDetailThreadContext)_localctx).category3 = word();
						}
						break;
					}
					setState(1687);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
					case 1:
						{
						setState(1686);
						((CrawlEtfDetailThreadContext)_localctx).category4 = word();
						}
						break;
					}
					setState(1690);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
					case 1:
						{
						setState(1689);
						((CrawlEtfDetailThreadContext)_localctx).category5 = word();
						}
						break;
					}
					setState(1693);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
					case 1:
						{
						setState(1692);
						((CrawlEtfDetailThreadContext)_localctx).category6 = word();
						}
						break;
					}
					setState(1698);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(1695);
						((CrawlEtfDetailThreadContext)_localctx).category7 = word();
						}
						}
						setState(1700);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1701);
					match(NEWLINE);
					setState(1702);
					((CrawlEtfDetailThreadContext)_localctx).ipo = match(DATE);
					setState(1706);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WORD) {
						{
						{
						setState(1703);
						match(WORD);
						}
						}
						setState(1708);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1709);
					match(NEWLINE);
					setState(1710);
					((CrawlEtfDetailThreadContext)_localctx).fee = word();
					setState(1711);
					match(NEWLINE);
					setState(1712);
					match(WORD);
					setState(1713);
					match(TAB);
					setState(1714);
					match(WORD);
					setState(1715);
					match(TAB);
					setState(1716);
					match(DATE);
					setState(1717);
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
				setState(1722); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1724);
			match(KEYWORD);
			setState(1725);
			match(TAB);
			setState(1726);
			match(WORD);
			setState(1727);
			match(WORD);
			setState(1728);
			match(TAB);
			setState(1729);
			match(WORD);
			setState(1730);
			match(TAB);
			setState(1731);
			match(WORD);
			setState(1732);
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
		enterRule(_localctx, 20, RULE_crawlDividendHistoryEtfThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1734);
			match(KEYWORD);
			setState(1735);
			match(TAB);
			setState(1736);
			match(WORD);
			setState(1737);
			match(WORD);
			setState(1738);
			match(WORD);
			setState(1739);
			match(TAB);
			setState(1740);
			match(WORD);
			setState(1741);
			match(WORD);
			setState(1742);
			match(WORD);
			setState(1743);
			match(TAB);
			setState(1744);
			match(WORD);
			setState(1745);
			match(TAB);
			setState(1746);
			match(WORD);
			setState(1747);
			match(NEWLINE);
			setState(1858); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1748);
					match(KEYWORD);
					setState(1749);
					match(TAB);
					setState(1750);
					((CrawlDividendHistoryEtfThreadContext)_localctx).code = match(NUMBER);
					setState(1751);
					match(NEWLINE);
					setState(1752);
					match(WORD);
					setState(1753);
					match(TAB);
					setState(1755);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WORD) {
						{
						setState(1754);
						match(WORD);
						}
					}

					setState(1757);
					match(TAB);
					setState(1758);
					match(WORD);
					setState(1759);
					match(TAB);
					setState(1760);
					match(WORD);
					setState(1761);
					match(TAB);
					setState(1762);
					match(WORD);
					setState(1763);
					match(TAB);
					setState(1764);
					match(WORD);
					setState(1765);
					match(TAB);
					setState(1766);
					match(WORD);
					setState(1767);
					match(TAB);
					setState(1768);
					match(WORD);
					setState(1769);
					match(TAB);
					setState(1770);
					match(WORD);
					setState(1771);
					match(TAB);
					setState(1772);
					match(WORD);
					setState(1773);
					match(TAB);
					setState(1774);
					match(NEWLINE);
					setState(1848); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(1848);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case TAB:
								{
								{
								setState(1775);
								match(TAB);
								setState(1776);
								match(TAB);
								setState(1777);
								match(TAB);
								setState(1778);
								match(TAB);
								setState(1779);
								match(TAB);
								setState(1780);
								match(TAB);
								setState(1781);
								match(TAB);
								setState(1782);
								match(TAB);
								setState(1783);
								match(TAB);
								setState(1784);
								match(TAB);
								setState(1785);
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
								setState(1786);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol = word();
								setState(1788);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
								case 1:
									{
									setState(1787);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol1 = word();
									}
									break;
								}
								setState(1791);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
								case 1:
									{
									setState(1790);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol2 = word();
									}
									break;
								}
								setState(1794);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
								case 1:
									{
									setState(1793);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol3 = word();
									}
									break;
								}
								setState(1797);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
								case 1:
									{
									setState(1796);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol4 = word();
									}
									break;
								}
								setState(1800);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
								case 1:
									{
									setState(1799);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol5 = word();
									}
									break;
								}
								setState(1803);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
								case 1:
									{
									setState(1802);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol6 = word();
									}
									break;
								}
								setState(1808);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
									{
									{
									setState(1805);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol7 = word();
									}
									}
									setState(1810);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(1811);
								match(TAB);
								setState(1813);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==WORD) {
									{
									setState(1812);
									match(WORD);
									}
								}

								setState(1815);
								match(TAB);
								setState(1816);
								match(WORD);
								setState(1817);
								match(TAB);
								setState(1821);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
									{
									{
									setState(1818);
									word();
									}
									}
									setState(1823);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(1824);
								match(TAB);
								setState(1826);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(1825);
									((CrawlDividendHistoryEtfThreadContext)_localctx).base = match(DATE);
									}
								}

								setState(1828);
								match(TAB);
								setState(1829);
								((CrawlDividendHistoryEtfThreadContext)_localctx).pay = match(DATE);
								setState(1830);
								match(TAB);
								setState(1832);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==WORD) {
									{
									setState(1831);
									match(WORD);
									}
								}

								setState(1834);
								match(TAB);
								setState(1835);
								((CrawlDividendHistoryEtfThreadContext)_localctx).dividend = match(NUMBER);
								setState(1836);
								match(TAB);
								setState(1838);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(1837);
									((CrawlDividendHistoryEtfThreadContext)_localctx).price = match(NUMBER);
									}
								}

								setState(1840);
								match(TAB);
								setState(1842);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(1841);
									((CrawlDividendHistoryEtfThreadContext)_localctx).ratio = match(NUMBER);
									}
								}

								setState(1844);
								match(TAB);
								setState(1845);
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
						setState(1850); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(1852);
					match(WORD);
					setState(1853);
					match(TAB);
					setState(1854);
					match(WORD);
					setState(1855);
					match(TAB);
					setState(1856);
					match(DATE);
					setState(1857);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1860); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1862);
			match(KEYWORD);
			setState(1863);
			match(TAB);
			setState(1864);
			match(WORD);
			setState(1865);
			match(WORD);
			setState(1866);
			match(WORD);
			setState(1867);
			match(TAB);
			setState(1868);
			match(WORD);
			setState(1869);
			match(WORD);
			setState(1870);
			match(WORD);
			setState(1871);
			match(TAB);
			setState(1872);
			match(WORD);
			setState(1873);
			match(TAB);
			setState(1874);
			match(WORD);
			setState(1875);
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
		enterRule(_localctx, 22, RULE_crawlDividendHistoryCompanyThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1877);
			match(KEYWORD);
			setState(1878);
			match(TAB);
			setState(1879);
			match(WORD);
			setState(1880);
			match(TAB);
			setState(1881);
			match(WORD);
			setState(1882);
			match(WORD);
			setState(1883);
			match(WORD);
			setState(1884);
			match(TAB);
			setState(1885);
			match(WORD);
			setState(1886);
			match(TAB);
			setState(1887);
			match(WORD);
			setState(1888);
			match(NEWLINE);
			setState(2015); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2005); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1889);
						match(WORD);
						setState(1890);
						match(TAB);
						setState(1891);
						match(WORD);
						setState(1892);
						match(NEWLINE);
						setState(1893);
						match(WORD);
						setState(1894);
						match(TAB);
						setState(1895);
						match(WORD);
						setState(1896);
						match(NEWLINE);
						setState(1897);
						match(WORD);
						setState(1898);
						match(TAB);
						setState(1899);
						match(WORD);
						setState(1900);
						match(TAB);
						setState(1901);
						match(WORD);
						setState(1902);
						match(TAB);
						setState(1903);
						match(WORD);
						setState(1904);
						match(TAB);
						setState(1905);
						match(WORD);
						setState(1906);
						match(TAB);
						setState(1907);
						match(WORD);
						setState(1908);
						match(TAB);
						setState(1909);
						match(WORD);
						setState(1910);
						match(TAB);
						setState(1911);
						match(WORD);
						setState(1912);
						match(TAB);
						setState(1913);
						match(WORD);
						setState(1914);
						match(TAB);
						setState(1915);
						match(WORD);
						setState(1916);
						match(TAB);
						setState(1917);
						match(WORD);
						setState(1918);
						match(TAB);
						setState(1919);
						match(WORD);
						setState(1920);
						match(TAB);
						setState(1921);
						match(NEWLINE);
						setState(1922);
						match(WORD);
						setState(1923);
						match(TAB);
						setState(1924);
						match(WORD);
						setState(1925);
						match(TAB);
						setState(1926);
						match(WORD);
						setState(1927);
						match(TAB);
						setState(1928);
						match(WORD);
						setState(1929);
						match(TAB);
						setState(1930);
						match(WORD);
						setState(1931);
						match(TAB);
						setState(1932);
						match(WORD);
						setState(1933);
						match(TAB);
						setState(1934);
						match(NEWLINE);
						setState(2001); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(2001);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case TAB:
								{
								{
								setState(1935);
								match(TAB);
								setState(1936);
								match(TAB);
								setState(1937);
								match(TAB);
								setState(1938);
								match(TAB);
								setState(1939);
								match(TAB);
								setState(1940);
								match(TAB);
								setState(1941);
								match(TAB);
								setState(1942);
								match(TAB);
								setState(1943);
								match(TAB);
								setState(1944);
								match(TAB);
								setState(1945);
								match(TAB);
								setState(1946);
								match(TAB);
								setState(1947);
								match(TAB);
								setState(1948);
								match(TAB);
								setState(1949);
								match(TAB);
								setState(1950);
								match(TAB);
								setState(1951);
								match(TAB);
								setState(1952);
								match(NEWLINE);
								}
								}
								break;
							case DATE:
								{
								{
								setState(1953);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).base = match(DATE);
								setState(1954);
								match(TAB);
								setState(1956);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(1955);
									((CrawlDividendHistoryCompanyThreadContext)_localctx).pay = match(DATE);
									}
								}

								setState(1958);
								match(TAB);
								setState(1960);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(1959);
									match(DATE);
									}
								}

								setState(1962);
								match(TAB);
								setState(1963);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).code = match(NUMBER);
								setState(1964);
								match(TAB);
								setState(1966); 
								_errHandler.sync(this);
								_la = _input.LA(1);
								do {
									{
									{
									setState(1965);
									((CrawlDividendHistoryCompanyThreadContext)_localctx).symbol = word();
									}
									}
									setState(1968); 
									_errHandler.sync(this);
									_la = _input.LA(1);
								} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
								setState(1970);
								match(TAB);
								setState(1971);
								match(WORD);
								setState(1972);
								match(TAB);
								setState(1973);
								match(WORD);
								setState(1974);
								match(TAB);
								setState(1975);
								match(WORD);
								setState(1976);
								match(TAB);
								setState(1977);
								match(WORD);
								setState(1978);
								match(TAB);
								setState(1979);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).dividend = match(NUMBER);
								setState(1980);
								match(TAB);
								setState(1982);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(1981);
									match(NUMBER);
									}
								}

								setState(1984);
								match(TAB);
								setState(1985);
								match(NUMBER);
								setState(1986);
								match(TAB);
								setState(1987);
								match(NUMBER);
								setState(1988);
								match(TAB);
								setState(1990);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(1989);
									match(NUMBER);
									}
								}

								setState(1992);
								match(TAB);
								setState(1993);
								match(TAB);
								setState(1994);
								match(NUMBER);
								setState(1995);
								match(TAB);
								setState(1996);
								match(NUMBER);
								setState(1997);
								match(TAB);
								setState(1998);
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
							setState(2003); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2007); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2009);
				match(WORD);
				setState(2010);
				match(TAB);
				setState(2011);
				match(WORD);
				setState(2012);
				match(TAB);
				setState(2013);
				match(DATE);
				setState(2014);
				match(NEWLINE);
				}
				}
				setState(2017); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(2019);
			match(KEYWORD);
			setState(2020);
			match(TAB);
			setState(2021);
			match(WORD);
			setState(2022);
			match(TAB);
			setState(2023);
			match(WORD);
			setState(2024);
			match(WORD);
			setState(2025);
			match(WORD);
			setState(2026);
			match(TAB);
			setState(2027);
			match(WORD);
			setState(2028);
			match(TAB);
			setState(2029);
			match(WORD);
			setState(2030);
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
		enterRule(_localctx, 24, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2032);
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
			setState(2036); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(2036);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(2034);
					word();
					}
					break;
				case TAB:
					{
					setState(2035);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2038); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(2040);
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
			setState(2045); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(2045);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(2042);
					word();
					}
					break;
				case TAB:
					{
					setState(2043);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(2044);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2047); 
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
		"\u0004\u0001\n\u0802\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000*\b\u0000\u0001\u0001"+
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
		"\u0001\u0001\u0001\u0001\u0003\u0001q\b\u0001\u0001\u0001\u0003\u0001"+
		"t\b\u0001\u0001\u0001\u0003\u0001w\b\u0001\u0001\u0001\u0003\u0001z\b"+
		"\u0001\u0001\u0001\u0003\u0001}\b\u0001\u0001\u0001\u0003\u0001\u0080"+
		"\b\u0001\u0001\u0001\u0005\u0001\u0083\b\u0001\n\u0001\f\u0001\u0086\t"+
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
		"\u0001\u0004\u0001\u00d6\b\u0001\u000b\u0001\f\u0001\u00d7\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u00fb\b\u0001\u0001\u0001\u0003\u0001"+
		"\u00fe\b\u0001\u0001\u0001\u0003\u0001\u0101\b\u0001\u0001\u0001\u0003"+
		"\u0001\u0104\b\u0001\u0001\u0001\u0003\u0001\u0107\b\u0001\u0001\u0001"+
		"\u0003\u0001\u010a\b\u0001\u0001\u0001\u0005\u0001\u010d\b\u0001\n\u0001"+
		"\f\u0001\u0110\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001\u0122\b\u0001\u000b\u0001\f\u0001\u0123\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001\u012d\b\u0001\u000b\u0001\f\u0001\u012e\u0001\u0001\u0001\u0001"+
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
		"\u0001\u0002\u0003\u0002\u0284\b\u0002\u0001\u0002\u0003\u0002\u0287\b"+
		"\u0002\u0001\u0002\u0003\u0002\u028a\b\u0002\u0001\u0002\u0003\u0002\u028d"+
		"\b\u0002\u0001\u0002\u0003\u0002\u0290\b\u0002\u0001\u0002\u0003\u0002"+
		"\u0293\b\u0002\u0001\u0002\u0005\u0002\u0296\b\u0002\n\u0002\f\u0002\u0299"+
		"\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002\u02a2\b\u0002\n\u0002\f\u0002\u02a5\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u02ad\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
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
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u02fa\b\u0002\u0001\u0002\u0003\u0002\u02fd\b\u0002\u0001\u0002\u0003"+
		"\u0002\u0300\b\u0002\u0001\u0002\u0003\u0002\u0303\b\u0002\u0001\u0002"+
		"\u0003\u0002\u0306\b\u0002\u0001\u0002\u0003\u0002\u0309\b\u0002\u0001"+
		"\u0002\u0005\u0002\u030c\b\u0002\n\u0002\f\u0002\u030f\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u0321\b\u0002\u000b\u0002"+
		"\f\u0002\u0322\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0004\u0002\u032c\b\u0002\u000b\u0002\f\u0002"+
		"\u032d\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
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
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004"+
		"\u0003\u0383\b\u0003\u000b\u0003\f\u0003\u0384\u0001\u0003\u0001\u0003"+
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
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u03ce\b\u0003\u0001\u0003"+
		"\u0003\u0003\u03d1\b\u0003\u0001\u0003\u0003\u0003\u03d4\b\u0003\u0001"+
		"\u0003\u0003\u0003\u03d7\b\u0003\u0001\u0003\u0003\u0003\u03da\b\u0003"+
		"\u0001\u0003\u0003\u0003\u03dd\b\u0003\u0001\u0003\u0005\u0003\u03e0\b"+
		"\u0003\n\u0003\f\u0003\u03e3\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0004\u0003\u03ef\b\u0003\u000b\u0003\f\u0003\u03f0\u0003"+
		"\u0003\u03f3\b\u0003\u0004\u0003\u03f5\b\u0003\u000b\u0003\f\u0003\u03f6"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0004\u0003\u03ff\b\u0003\u000b\u0003\f\u0003\u0400\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u043f"+
		"\b\u0004\u0001\u0004\u0003\u0004\u0442\b\u0004\u0001\u0004\u0003\u0004"+
		"\u0445\b\u0004\u0001\u0004\u0003\u0004\u0448\b\u0004\u0001\u0004\u0003"+
		"\u0004\u044b\b\u0004\u0001\u0004\u0003\u0004\u044e\b\u0004\u0001\u0004"+
		"\u0005\u0004\u0451\b\u0004\n\u0004\f\u0004\u0454\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u045b\b\u0004\u0001"+
		"\u0004\u0003\u0004\u045e\b\u0004\u0001\u0004\u0003\u0004\u0461\b\u0004"+
		"\u0001\u0004\u0003\u0004\u0464\b\u0004\u0001\u0004\u0003\u0004\u0467\b"+
		"\u0004\u0001\u0004\u0003\u0004\u046a\b\u0004\u0001\u0004\u0005\u0004\u046d"+
		"\b\u0004\n\u0004\f\u0004\u0470\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u047c\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0485\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0004\u0004\u048d\b\u0004\u000b\u0004\f\u0004\u048e\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004"+
		"\u0004\u0498\b\u0004\u000b\u0004\f\u0004\u0499\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0004\u0005\u04b7\b\u0005\u000b\u0005\f\u0005\u04b8\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u04c0"+
		"\b\u0005\u0001\u0005\u0003\u0005\u04c3\b\u0005\u0001\u0005\u0003\u0005"+
		"\u04c6\b\u0005\u0001\u0005\u0003\u0005\u04c9\b\u0005\u0001\u0005\u0003"+
		"\u0005\u04cc\b\u0005\u0001\u0005\u0003\u0005\u04cf\b\u0005\u0001\u0005"+
		"\u0005\u0005\u04d2\b\u0005\n\u0005\f\u0005\u04d5\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u04dc\b\u0005\u0001"+
		"\u0005\u0003\u0005\u04df\b\u0005\u0001\u0005\u0003\u0005\u04e2\b\u0005"+
		"\u0001\u0005\u0003\u0005\u04e5\b\u0005\u0001\u0005\u0003\u0005\u04e8\b"+
		"\u0005\u0001\u0005\u0003\u0005\u04eb\b\u0005\u0001\u0005\u0005\u0005\u04ee"+
		"\b\u0005\n\u0005\f\u0005\u04f1\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u0515\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0519\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u051d\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u0521\b\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0525\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u052d\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0004\u0005\u0532\b\u0005\u000b\u0005\f\u0005\u0533\u0004\u0005"+
		"\u0536\b\u0005\u000b\u0005\f\u0005\u0537\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u0541"+
		"\b\u0005\u000b\u0005\f\u0005\u0542\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006"+
		"\u055f\b\u0006\u000b\u0006\f\u0006\u0560\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0004\u0006\u058b\b\u0006\u000b\u0006\f\u0006\u058c"+
		"\u0004\u0006\u058f\b\u0006\u000b\u0006\f\u0006\u0590\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004"+
		"\u0006\u059a\b\u0006\u000b\u0006\f\u0006\u059b\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u05bd\b\u0007\u0001\u0007\u0003\u0007\u05c0\b\u0007\u0001\u0007\u0003"+
		"\u0007\u05c3\b\u0007\u0001\u0007\u0003\u0007\u05c6\b\u0007\u0001\u0007"+
		"\u0003\u0007\u05c9\b\u0007\u0001\u0007\u0003\u0007\u05cc\b\u0007\u0001"+
		"\u0007\u0005\u0007\u05cf\b\u0007\n\u0007\f\u0007\u05d2\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0004\u0007\u05ee\b\u0007\u000b\u0007\f\u0007\u05ef\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0629\b\b\u0001"+
		"\b\u0001\b\u0004\b\u062d\b\b\u000b\b\f\b\u062e\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u0643\b\b\u000b"+
		"\b\f\b\u0644\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004"+
		"\b\u064e\b\b\u000b\b\f\b\u064f\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u066d\b\t\n\t\f\t\u0670\t\t"+
		"\u0001\t\u0001\t\u0001\t\u0003\t\u0675\b\t\u0001\t\u0003\t\u0678\b\t\u0001"+
		"\t\u0003\t\u067b\b\t\u0001\t\u0003\t\u067e\b\t\u0001\t\u0003\t\u0681\b"+
		"\t\u0001\t\u0003\t\u0684\b\t\u0001\t\u0005\t\u0687\b\t\n\t\f\t\u068a\t"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u068f\b\t\u0001\t\u0003\t\u0692\b\t"+
		"\u0001\t\u0003\t\u0695\b\t\u0001\t\u0003\t\u0698\b\t\u0001\t\u0003\t\u069b"+
		"\b\t\u0001\t\u0003\t\u069e\b\t\u0001\t\u0005\t\u06a1\b\t\n\t\f\t\u06a4"+
		"\t\t\u0001\t\u0001\t\u0001\t\u0005\t\u06a9\b\t\n\t\f\t\u06ac\t\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0004\t\u06b9\b\t\u000b\t\f\t\u06ba\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u06dc\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u06fd"+
		"\b\n\u0001\n\u0003\n\u0700\b\n\u0001\n\u0003\n\u0703\b\n\u0001\n\u0003"+
		"\n\u0706\b\n\u0001\n\u0003\n\u0709\b\n\u0001\n\u0003\n\u070c\b\n\u0001"+
		"\n\u0005\n\u070f\b\n\n\n\f\n\u0712\t\n\u0001\n\u0001\n\u0003\n\u0716\b"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u071c\b\n\n\n\f\n\u071f\t\n"+
		"\u0001\n\u0001\n\u0003\n\u0723\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0729\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u072f\b\n\u0001\n"+
		"\u0001\n\u0003\n\u0733\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u0739"+
		"\b\n\u000b\n\f\n\u073a\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0004\n\u0743\b\n\u000b\n\f\n\u0744\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u07a5\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u07a9\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0004\u000b\u07af\b\u000b\u000b\u000b\f\u000b\u07b0\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u07bf"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u07c7\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004"+
		"\u000b\u07d2\b\u000b\u000b\u000b\f\u000b\u07d3\u0004\u000b\u07d6\b\u000b"+
		"\u000b\u000b\f\u000b\u07d7\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0004\u000b\u07e0\b\u000b\u000b\u000b\f\u000b"+
		"\u07e1\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0004\r\u07f5\b\r\u000b"+
		"\r\f\r\u07f6\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0004"+
		"\u000e\u07fe\b\u000e\u000b\u000e\f\u000e\u07ff\u0001\u000e\u0000\u0000"+
		"\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u0000\u0001\u0001\u0000\u0005\n\u089a\u0000)\u0001\u0000"+
		"\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0004\u013c\u0001\u0000\u0000"+
		"\u0000\u0006\u033d\u0001\u0000\u0000\u0000\b\u040b\u0001\u0000\u0000\u0000"+
		"\n\u04a8\u0001\u0000\u0000\u0000\f\u0550\u0001\u0000\u0000\u0000\u000e"+
		"\u05a9\u0001\u0000\u0000\u0000\u0010\u05fd\u0001\u0000\u0000\u0000\u0012"+
		"\u065e\u0001\u0000\u0000\u0000\u0014\u06c6\u0001\u0000\u0000\u0000\u0016"+
		"\u0755\u0001\u0000\u0000\u0000\u0018\u07f0\u0001\u0000\u0000\u0000\u001a"+
		"\u07f4\u0001\u0000\u0000\u0000\u001c\u07fd\u0001\u0000\u0000\u0000\u001e"+
		"*\u0003\u0016\u000b\u0000\u001f*\u0003\u0014\n\u0000 *\u0003\u0010\b\u0000"+
		"!*\u0003\b\u0004\u0000\"*\u0003\u000e\u0007\u0000#*\u0003\u0012\t\u0000"+
		"$*\u0003\f\u0006\u0000%*\u0003\n\u0005\u0000&*\u0003\u0006\u0003\u0000"+
		"\'*\u0003\u0004\u0002\u0000(*\u0003\u0002\u0001\u0000)\u001e\u0001\u0000"+
		"\u0000\u0000)\u001f\u0001\u0000\u0000\u0000) \u0001\u0000\u0000\u0000"+
		")!\u0001\u0000\u0000\u0000)\"\u0001\u0000\u0000\u0000)#\u0001\u0000\u0000"+
		"\u0000)$\u0001\u0000\u0000\u0000)%\u0001\u0000\u0000\u0000)&\u0001\u0000"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*\u0001"+
		"\u0001\u0000\u0000\u0000+,\u0005\u0005\u0000\u0000,-\u0005\u0003\u0000"+
		"\u0000-.\u0005\n\u0000\u0000./\u0005\u0003\u0000\u0000/0\u0005\n\u0000"+
		"\u000001\u0005\n\u0000\u000012\u0005\n\u0000\u000023\u0005\n\u0000\u0000"+
		"34\u0005\u0003\u0000\u000045\u0005\n\u0000\u00005\u012c\u0005\u0004\u0000"+
		"\u000067\u0005\n\u0000\u000078\u0005\u0003\u0000\u000089\u0005\u0006\u0000"+
		"\u00009:\u0005\u0003\u0000\u0000:;\u0005\u0004\u0000\u0000;<\u0005\n\u0000"+
		"\u0000<=\u0005\u0003\u0000\u0000=>\u0005\u0006\u0000\u0000>?\u0005\u0003"+
		"\u0000\u0000?@\u0005\u0004\u0000\u0000@A\u0005\n\u0000\u0000AB\u0005\u0003"+
		"\u0000\u0000BC\u0005\u0006\u0000\u0000CD\u0005\u0003\u0000\u0000DE\u0005"+
		"\u0004\u0000\u0000EF\u0005\n\u0000\u0000FG\u0005\u0003\u0000\u0000GH\u0005"+
		"\u0006\u0000\u0000HI\u0005\u0003\u0000\u0000IJ\u0005\u0004\u0000\u0000"+
		"JK\u0005\n\u0000\u0000KL\u0005\u0003\u0000\u0000LM\u0005\u0006\u0000\u0000"+
		"MN\u0005\u0003\u0000\u0000NO\u0005\u0004\u0000\u0000OP\u0005\n\u0000\u0000"+
		"PQ\u0005\u0003\u0000\u0000QR\u0005\u0006\u0000\u0000RS\u0005\u0003\u0000"+
		"\u0000ST\u0005\u0004\u0000\u0000TU\u0005\n\u0000\u0000UV\u0005\u0003\u0000"+
		"\u0000VW\u0005\u0006\u0000\u0000WX\u0005\u0003\u0000\u0000XY\u0005\u0004"+
		"\u0000\u0000YZ\u0005\n\u0000\u0000Z[\u0005\u0003\u0000\u0000[\\\u0005"+
		"\u0006\u0000\u0000\\]\u0005\u0003\u0000\u0000]^\u0005\n\u0000\u0000^_"+
		"\u0005\u0004\u0000\u0000_`\u0005\n\u0000\u0000`a\u0005\u0003\u0000\u0000"+
		"ab\u0005\u0006\u0000\u0000bc\u0005\u0003\u0000\u0000c\u0121\u0005\u0004"+
		"\u0000\u0000de\u0005\n\u0000\u0000ef\u0005\u0003\u0000\u0000fg\u0005\u0006"+
		"\u0000\u0000gh\u0005\u0003\u0000\u0000hi\u0005\b\u0000\u0000ij\u0005\u0004"+
		"\u0000\u0000jk\u0005\n\u0000\u0000kl\u0005\u0003\u0000\u0000lm\u0005\u0006"+
		"\u0000\u0000mn\u0005\u0003\u0000\u0000np\u0003\u0018\f\u0000oq\u0003\u0018"+
		"\f\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000"+
		"\u0000\u0000rt\u0003\u0018\f\u0000sr\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000tv\u0001\u0000\u0000\u0000uw\u0003\u0018\f\u0000vu\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xz\u0003"+
		"\u0018\f\u0000yx\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001"+
		"\u0000\u0000\u0000{}\u0003\u0018\f\u0000|{\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~\u0080\u0003\u0018\f"+
		"\u0000\u007f~\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0084\u0001\u0000\u0000\u0000\u0081\u0083\u0003\u0018\f\u0000\u0082"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085"+
		"\u0087\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0005\u0004\u0000\u0000\u0088\u0089\u0005\n\u0000\u0000\u0089\u008a"+
		"\u0005\u0003\u0000\u0000\u008a\u008b\u0005\u0006\u0000\u0000\u008b\u008c"+
		"\u0005\u0003\u0000\u0000\u008c\u008d\u0005\b\u0000\u0000\u008d\u008e\u0005"+
		"\u0004\u0000\u0000\u008e\u008f\u0005\n\u0000\u0000\u008f\u0090\u0005\u0003"+
		"\u0000\u0000\u0090\u0091\u0005\u0006\u0000\u0000\u0091\u0092\u0005\u0003"+
		"\u0000\u0000\u0092\u0093\u0005\b\u0000\u0000\u0093\u0094\u0005\u0004\u0000"+
		"\u0000\u0094\u0095\u0005\n\u0000\u0000\u0095\u0096\u0005\u0003\u0000\u0000"+
		"\u0096\u0097\u0005\u0006\u0000\u0000\u0097\u0098\u0005\u0003\u0000\u0000"+
		"\u0098\u0099\u0005\b\u0000\u0000\u0099\u009a\u0005\u0004\u0000\u0000\u009a"+
		"\u009b\u0005\n\u0000\u0000\u009b\u009c\u0005\u0003\u0000\u0000\u009c\u009d"+
		"\u0005\u0006\u0000\u0000\u009d\u009e\u0005\u0003\u0000\u0000\u009e\u009f"+
		"\u0005\b\u0000\u0000\u009f\u00a0\u0005\u0004\u0000\u0000\u00a0\u00a1\u0005"+
		"\n\u0000\u0000\u00a1\u00a2\u0005\u0003\u0000\u0000\u00a2\u00a3\u0005\u0006"+
		"\u0000\u0000\u00a3\u00a4\u0005\u0003\u0000\u0000\u00a4\u00a5\u0005\b\u0000"+
		"\u0000\u00a5\u00a6\u0005\u0004\u0000\u0000\u00a6\u00a7\u0005\n\u0000\u0000"+
		"\u00a7\u00a8\u0005\u0003\u0000\u0000\u00a8\u00a9\u0005\u0006\u0000\u0000"+
		"\u00a9\u00aa\u0005\u0003\u0000\u0000\u00aa\u00ab\u0005\b\u0000\u0000\u00ab"+
		"\u00ac\u0005\u0004\u0000\u0000\u00ac\u00ad\u0005\n\u0000\u0000\u00ad\u00ae"+
		"\u0005\u0003\u0000\u0000\u00ae\u00af\u0005\u0006\u0000\u0000\u00af\u00b0"+
		"\u0005\u0003\u0000\u0000\u00b0\u00b1\u0005\b\u0000\u0000\u00b1\u00b2\u0005"+
		"\u0004\u0000\u0000\u00b2\u00b3\u0005\n\u0000\u0000\u00b3\u00b4\u0005\u0003"+
		"\u0000\u0000\u00b4\u00b5\u0005\u0006\u0000\u0000\u00b5\u00b6\u0005\u0003"+
		"\u0000\u0000\u00b6\u00b7\u0005\b\u0000\u0000\u00b7\u00b8\u0005\u0004\u0000"+
		"\u0000\u00b8\u00b9\u0005\n\u0000\u0000\u00b9\u00ba\u0005\u0003\u0000\u0000"+
		"\u00ba\u00bb\u0005\u0006\u0000\u0000\u00bb\u00bc\u0005\u0003\u0000\u0000"+
		"\u00bc\u00bd\u0005\b\u0000\u0000\u00bd\u00be\u0005\u0004\u0000\u0000\u00be"+
		"\u00bf\u0005\n\u0000\u0000\u00bf\u00c0\u0005\u0003\u0000\u0000\u00c0\u00c1"+
		"\u0005\u0006\u0000\u0000\u00c1\u00c2\u0005\u0003\u0000\u0000\u00c2\u00c3"+
		"\u0005\b\u0000\u0000\u00c3\u00c4\u0005\u0004\u0000\u0000\u00c4\u00c5\u0005"+
		"\n\u0000\u0000\u00c5\u00c6\u0005\u0003\u0000\u0000\u00c6\u00c7\u0005\u0006"+
		"\u0000\u0000\u00c7\u00c8\u0005\u0003\u0000\u0000\u00c8\u00c9\u0005\b\u0000"+
		"\u0000\u00c9\u00ca\u0005\u0004\u0000\u0000\u00ca\u00cb\u0005\n\u0000\u0000"+
		"\u00cb\u00cc\u0005\u0003\u0000\u0000\u00cc\u00cd\u0005\u0006\u0000\u0000"+
		"\u00cd\u00ce\u0005\u0003\u0000\u0000\u00ce\u00cf\u0005\b\u0000\u0000\u00cf"+
		"\u00d0\u0005\u0004\u0000\u0000\u00d0\u00d1\u0005\n\u0000\u0000\u00d1\u00d2"+
		"\u0005\u0003\u0000\u0000\u00d2\u00d3\u0005\u0006\u0000\u0000\u00d3\u00d5"+
		"\u0005\u0003\u0000\u0000\u00d4\u00d6\u0003\u0018\f\u0000\u00d5\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0005\u0004\u0000\u0000\u00da\u00db\u0005"+
		"\n\u0000\u0000\u00db\u00dc\u0005\u0003\u0000\u0000\u00dc\u00dd\u0005\u0006"+
		"\u0000\u0000\u00dd\u00de\u0005\u0003\u0000\u0000\u00de\u00df\u0003\u0018"+
		"\f\u0000\u00df\u00e0\u0005\u0004\u0000\u0000\u00e0\u00e1\u0005\n\u0000"+
		"\u0000\u00e1\u00e2\u0005\u0003\u0000\u0000\u00e2\u00e3\u0005\u0006\u0000"+
		"\u0000\u00e3\u00e4\u0005\u0003\u0000\u0000\u00e4\u00e5\u0003\u0018\f\u0000"+
		"\u00e5\u00e6\u0005\u0004\u0000\u0000\u00e6\u00e7\u0005\n\u0000\u0000\u00e7"+
		"\u00e8\u0005\u0003\u0000\u0000\u00e8\u00e9\u0005\u0006\u0000\u0000\u00e9"+
		"\u00ea\u0005\u0003\u0000\u0000\u00ea\u00eb\u0003\u0018\f\u0000\u00eb\u00ec"+
		"\u0005\u0004\u0000\u0000\u00ec\u00ed\u0005\n\u0000\u0000\u00ed\u00ee\u0005"+
		"\u0003\u0000\u0000\u00ee\u00ef\u0005\u0006\u0000\u0000\u00ef\u00f0\u0005"+
		"\u0003\u0000\u0000\u00f0\u00f1\u0005\u0004\u0000\u0000\u00f1\u00f2\u0006"+
		"\u0001\uffff\uffff\u0000\u00f2\u0122\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0005\n\u0000\u0000\u00f4\u00f5\u0005\u0003\u0000\u0000\u00f5\u00f6\u0005"+
		"\u0006\u0000\u0000\u00f6\u00f7\u0005\u0003\u0000\u0000\u00f7\u00f8\u0005"+
		"\b\u0000\u0000\u00f8\u00fa\u0003\u0018\f\u0000\u00f9\u00fb\u0003\u0018"+
		"\f\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00fe\u0003\u0018\f\u0000"+
		"\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fe\u0100\u0001\u0000\u0000\u0000\u00ff\u0101\u0003\u0018\f\u0000\u0100"+
		"\u00ff\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101"+
		"\u0103\u0001\u0000\u0000\u0000\u0102\u0104\u0003\u0018\f\u0000\u0103\u0102"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0106"+
		"\u0001\u0000\u0000\u0000\u0105\u0107\u0003\u0018\f\u0000\u0106\u0105\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0109\u0001"+
		"\u0000\u0000\u0000\u0108\u010a\u0003\u0018\f\u0000\u0109\u0108\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010e\u0001\u0000"+
		"\u0000\u0000\u010b\u010d\u0003\u0018\f\u0000\u010c\u010b\u0001\u0000\u0000"+
		"\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0111\u0001\u0000\u0000"+
		"\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0112\u0005\b\u0000\u0000"+
		"\u0112\u0113\u0005\u0004\u0000\u0000\u0113\u0114\u0005\n\u0000\u0000\u0114"+
		"\u0115\u0005\u0003\u0000\u0000\u0115\u0116\u0005\u0006\u0000\u0000\u0116"+
		"\u0117\u0005\u0003\u0000\u0000\u0117\u0118\u0005\b\u0000\u0000\u0118\u0119"+
		"\u0005\b\u0000\u0000\u0119\u011a\u0005\b\u0000\u0000\u011a\u011b\u0005"+
		"\b\u0000\u0000\u011b\u011c\u0005\b\u0000\u0000\u011c\u011d\u0005\b\u0000"+
		"\u0000\u011d\u011e\u0005\b\u0000\u0000\u011e\u011f\u0005\u0004\u0000\u0000"+
		"\u011f\u0120\u0006\u0001\uffff\uffff\u0000\u0120\u0122\u0001\u0000\u0000"+
		"\u0000\u0121d\u0001\u0000\u0000\u0000\u0121\u00f3\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0005\n\u0000\u0000\u0126\u0127\u0005\u0003\u0000\u0000\u0127"+
		"\u0128\u0005\n\u0000\u0000\u0128\u0129\u0005\u0003\u0000\u0000\u0129\u012a"+
		"\u0005\u0006\u0000\u0000\u012a\u012b\u0005\u0004\u0000\u0000\u012b\u012d"+
		"\u0001\u0000\u0000\u0000\u012c6\u0001\u0000\u0000\u0000\u012d\u012e\u0001"+
		"\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001"+
		"\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0005"+
		"\u0005\u0000\u0000\u0131\u0132\u0005\u0003\u0000\u0000\u0132\u0133\u0005"+
		"\n\u0000\u0000\u0133\u0134\u0005\u0003\u0000\u0000\u0134\u0135\u0005\n"+
		"\u0000\u0000\u0135\u0136\u0005\n\u0000\u0000\u0136\u0137\u0005\n\u0000"+
		"\u0000\u0137\u0138\u0005\n\u0000\u0000\u0138\u0139\u0005\u0003\u0000\u0000"+
		"\u0139\u013a\u0005\n\u0000\u0000\u013a\u013b\u0005\u0004\u0000\u0000\u013b"+
		"\u0003\u0001\u0000\u0000\u0000\u013c\u013d\u0005\u0005\u0000\u0000\u013d"+
		"\u013e\u0005\u0003\u0000\u0000\u013e\u013f\u0005\n\u0000\u0000\u013f\u0140"+
		"\u0005\u0003\u0000\u0000\u0140\u0141\u0005\n\u0000\u0000\u0141\u0142\u0005"+
		"\n\u0000\u0000\u0142\u0143\u0005\n\u0000\u0000\u0143\u0144\u0005\n\u0000"+
		"\u0000\u0144\u0145\u0005\n\u0000\u0000\u0145\u0146\u0005\n\u0000\u0000"+
		"\u0146\u0147\u0005\u0003\u0000\u0000\u0147\u0148\u0005\n\u0000\u0000\u0148"+
		"\u032b\u0005\u0004\u0000\u0000\u0149\u014a\u0005\n\u0000\u0000\u014a\u014b"+
		"\u0005\u0003\u0000\u0000\u014b\u014c\u0005\u0006\u0000\u0000\u014c\u014d"+
		"\u0005\u0003\u0000\u0000\u014d\u014e\u0005\u0004\u0000\u0000\u014e\u014f"+
		"\u0005\n\u0000\u0000\u014f\u0150\u0005\u0003\u0000\u0000\u0150\u0151\u0005"+
		"\u0006\u0000\u0000\u0151\u0152\u0005\u0003\u0000\u0000\u0152\u0153\u0005"+
		"\u0004\u0000\u0000\u0153\u0154\u0005\n\u0000\u0000\u0154\u0155\u0005\u0003"+
		"\u0000\u0000\u0155\u0156\u0005\u0006\u0000\u0000\u0156\u0157\u0005\u0003"+
		"\u0000\u0000\u0157\u0158\u0005\u0004\u0000\u0000\u0158\u0159\u0005\n\u0000"+
		"\u0000\u0159\u015a\u0005\u0003\u0000\u0000\u015a\u015b\u0005\u0006\u0000"+
		"\u0000\u015b\u015c\u0005\u0003\u0000\u0000\u015c\u015d\u0005\u0003\u0000"+
		"\u0000\u015d\u015e\u0005\u0003\u0000\u0000\u015e\u015f\u0005\u0003\u0000"+
		"\u0000\u015f\u0160\u0005\u0003\u0000\u0000\u0160\u0161\u0005\u0004\u0000"+
		"\u0000\u0161\u0162\u0005\n\u0000\u0000\u0162\u0163\u0005\u0003\u0000\u0000"+
		"\u0163\u0164\u0005\u0006\u0000\u0000\u0164\u0165\u0005\u0003\u0000\u0000"+
		"\u0165\u0166\u0005\u0003\u0000\u0000\u0166\u0167\u0005\u0003\u0000\u0000"+
		"\u0167\u0168\u0005\u0004\u0000\u0000\u0168\u0169\u0005\n\u0000\u0000\u0169"+
		"\u016a\u0005\u0003\u0000\u0000\u016a\u016b\u0005\u0006\u0000\u0000\u016b"+
		"\u016c\u0005\u0003\u0000\u0000\u016c\u016d\u0005\u0003\u0000\u0000\u016d"+
		"\u016e\u0005\u0003\u0000\u0000\u016e\u016f\u0005\u0003\u0000\u0000\u016f"+
		"\u0170\u0005\u0003\u0000\u0000\u0170\u0171\u0005\u0004\u0000\u0000\u0171"+
		"\u0172\u0005\n\u0000\u0000\u0172\u0173\u0005\u0003\u0000\u0000\u0173\u0174"+
		"\u0005\u0006\u0000\u0000\u0174\u0175\u0005\u0003\u0000\u0000\u0175\u0176"+
		"\u0005\u0003\u0000\u0000\u0176\u0177\u0005\u0003\u0000\u0000\u0177\u0178"+
		"\u0005\u0003\u0000\u0000\u0178\u0179\u0005\u0003\u0000\u0000\u0179\u017a"+
		"\u0005\u0004\u0000\u0000\u017a\u017b\u0005\n\u0000\u0000\u017b\u017c\u0005"+
		"\u0003\u0000\u0000\u017c\u017d\u0005\u0006\u0000\u0000\u017d\u017e\u0005"+
		"\u0003\u0000\u0000\u017e\u017f\u0005\u0003\u0000\u0000\u017f\u0180\u0005"+
		"\u0003\u0000\u0000\u0180\u0181\u0005\u0003\u0000\u0000\u0181\u0182\u0005"+
		"\u0004\u0000\u0000\u0182\u0183\u0005\n\u0000\u0000\u0183\u0184\u0005\u0003"+
		"\u0000\u0000\u0184\u0185\u0005\u0006\u0000\u0000\u0185\u0186\u0005\u0003"+
		"\u0000\u0000\u0186\u0187\u0005\u0004\u0000\u0000\u0187\u0188\u0005\n\u0000"+
		"\u0000\u0188\u0189\u0005\u0003\u0000\u0000\u0189\u018a\u0005\u0006\u0000"+
		"\u0000\u018a\u018b\u0005\u0003\u0000\u0000\u018b\u018c\u0005\u0004\u0000"+
		"\u0000\u018c\u018d\u0005\n\u0000\u0000\u018d\u018e\u0005\u0003\u0000\u0000"+
		"\u018e\u018f\u0005\u0006\u0000\u0000\u018f\u0190\u0005\u0003\u0000\u0000"+
		"\u0190\u0191\u0005\u0003\u0000\u0000\u0191\u0192\u0005\u0003\u0000\u0000"+
		"\u0192\u0193\u0005\u0003\u0000\u0000\u0193\u0194\u0005\u0003\u0000\u0000"+
		"\u0194\u0195\u0005\u0004\u0000\u0000\u0195\u0196\u0005\n\u0000\u0000\u0196"+
		"\u0197\u0005\u0003\u0000\u0000\u0197\u0198\u0005\u0006\u0000\u0000\u0198"+
		"\u0199\u0005\u0003\u0000\u0000\u0199\u019a\u0005\u0003\u0000\u0000\u019a"+
		"\u019b\u0005\u0003\u0000\u0000\u019b\u019c\u0005\u0004\u0000\u0000\u019c"+
		"\u019d\u0005\n\u0000\u0000\u019d\u019e\u0005\u0003\u0000\u0000\u019e\u019f"+
		"\u0005\u0006\u0000\u0000\u019f\u01a0\u0005\u0003\u0000\u0000\u01a0\u01a1"+
		"\u0005\u0003\u0000\u0000\u01a1\u01a2\u0005\u0003\u0000\u0000\u01a2\u01a3"+
		"\u0005\u0003\u0000\u0000\u01a3\u01a4\u0005\u0003\u0000\u0000\u01a4\u01a5"+
		"\u0005\u0004\u0000\u0000\u01a5\u01a6\u0005\n\u0000\u0000\u01a6\u01a7\u0005"+
		"\u0003\u0000\u0000\u01a7\u01a8\u0005\u0006\u0000\u0000\u01a8\u01a9\u0005"+
		"\u0003\u0000\u0000\u01a9\u01aa\u0005\u0003\u0000\u0000\u01aa\u01ab\u0005"+
		"\u0003\u0000\u0000\u01ab\u01ac\u0005\u0003\u0000\u0000\u01ac\u01ad\u0005"+
		"\u0003\u0000\u0000\u01ad\u01ae\u0005\u0004\u0000\u0000\u01ae\u01af\u0005"+
		"\n\u0000\u0000\u01af\u01b0\u0005\u0003\u0000\u0000\u01b0\u01b1\u0005\u0006"+
		"\u0000\u0000\u01b1\u01b2\u0005\u0003\u0000\u0000\u01b2\u01b3\u0005\u0003"+
		"\u0000\u0000\u01b3\u01b4\u0005\u0003\u0000\u0000\u01b4\u01b5\u0005\u0003"+
		"\u0000\u0000\u01b5\u01b6\u0005\u0004\u0000\u0000\u01b6\u01b7\u0005\n\u0000"+
		"\u0000\u01b7\u01b8\u0005\u0003\u0000\u0000\u01b8\u01b9\u0005\u0006\u0000"+
		"\u0000\u01b9\u01ba\u0005\u0003\u0000\u0000\u01ba\u01bb\u0005\u0004\u0000"+
		"\u0000\u01bb\u01bc\u0005\n\u0000\u0000\u01bc\u01bd\u0005\u0003\u0000\u0000"+
		"\u01bd\u01be\u0005\u0006\u0000\u0000\u01be\u01bf\u0005\u0003\u0000\u0000"+
		"\u01bf\u01c0\u0005\u0004\u0000\u0000\u01c0\u01c1\u0005\n\u0000\u0000\u01c1"+
		"\u01c2\u0005\u0003\u0000\u0000\u01c2\u01c3\u0005\u0006\u0000\u0000\u01c3"+
		"\u01c4\u0005\u0003\u0000\u0000\u01c4\u01c5\u0005\u0004\u0000\u0000\u01c5"+
		"\u01c6\u0005\n\u0000\u0000\u01c6\u01c7\u0005\u0003\u0000\u0000\u01c7\u01c8"+
		"\u0005\u0006\u0000\u0000\u01c8\u01c9\u0005\u0003\u0000\u0000\u01c9\u01ca"+
		"\u0005\u0004\u0000\u0000\u01ca\u01cb\u0005\n\u0000\u0000\u01cb\u01cc\u0005"+
		"\u0003\u0000\u0000\u01cc\u01cd\u0005\u0006\u0000\u0000\u01cd\u01ce\u0005"+
		"\u0003\u0000\u0000\u01ce\u01cf\u0005\u0003\u0000\u0000\u01cf\u01d0\u0005"+
		"\u0003\u0000\u0000\u01d0\u01d1\u0005\u0003\u0000\u0000\u01d1\u01d2\u0005"+
		"\u0003\u0000\u0000\u01d2\u01d3\u0005\u0004\u0000\u0000\u01d3\u01d4\u0005"+
		"\n\u0000\u0000\u01d4\u01d5\u0005\u0003\u0000\u0000\u01d5\u01d6\u0005\u0006"+
		"\u0000\u0000\u01d6\u01d7\u0005\u0003\u0000\u0000\u01d7\u01d8\u0005\u0003"+
		"\u0000\u0000\u01d8\u01d9\u0005\u0003\u0000\u0000\u01d9\u01da\u0005\u0003"+
		"\u0000\u0000\u01da\u01db\u0005\u0004\u0000\u0000\u01db\u01dc\u0005\n\u0000"+
		"\u0000\u01dc\u01dd\u0005\u0003\u0000\u0000\u01dd\u01de\u0005\u0006\u0000"+
		"\u0000\u01de\u01df\u0005\u0003\u0000\u0000\u01df\u01e0\u0005\u0003\u0000"+
		"\u0000\u01e0\u01e1\u0005\u0003\u0000\u0000\u01e1\u01e2\u0005\u0003\u0000"+
		"\u0000\u01e2\u01e3\u0005\u0003\u0000\u0000\u01e3\u01e4\u0005\u0004\u0000"+
		"\u0000\u01e4\u01e5\u0005\n\u0000\u0000\u01e5\u01e6\u0005\u0003\u0000\u0000"+
		"\u01e6\u01e7\u0005\u0006\u0000\u0000\u01e7\u01e8\u0005\u0003\u0000\u0000"+
		"\u01e8\u01e9\u0005\u0003\u0000\u0000\u01e9\u01ea\u0005\u0003\u0000\u0000"+
		"\u01ea\u01eb\u0005\u0003\u0000\u0000\u01eb\u01ec\u0005\u0003\u0000\u0000"+
		"\u01ec\u01ed\u0005\u0004\u0000\u0000\u01ed\u01ee\u0005\n\u0000\u0000\u01ee"+
		"\u01ef\u0005\u0003\u0000\u0000\u01ef\u01f0\u0005\u0006\u0000\u0000\u01f0"+
		"\u01f1\u0005\u0003\u0000\u0000\u01f1\u01f2\u0005\u0003\u0000\u0000\u01f2"+
		"\u01f3\u0005\u0003\u0000\u0000\u01f3\u01f4\u0005\u0003\u0000\u0000\u01f4"+
		"\u01f5\u0005\u0004\u0000\u0000\u01f5\u01f6\u0005\n\u0000\u0000\u01f6\u01f7"+
		"\u0005\u0003\u0000\u0000\u01f7\u01f8\u0005\u0006\u0000\u0000\u01f8\u01f9"+
		"\u0005\u0003\u0000\u0000\u01f9\u01fa\u0005\u0004\u0000\u0000\u01fa\u01fb"+
		"\u0005\n\u0000\u0000\u01fb\u01fc\u0005\u0003\u0000\u0000\u01fc\u01fd\u0005"+
		"\u0006\u0000\u0000\u01fd\u01fe\u0005\u0003\u0000\u0000\u01fe\u01ff\u0005"+
		"\u0004\u0000\u0000\u01ff\u0200\u0005\n\u0000\u0000\u0200\u0201\u0005\u0003"+
		"\u0000\u0000\u0201\u0202\u0005\u0006\u0000\u0000\u0202\u0203\u0005\u0003"+
		"\u0000\u0000\u0203\u0204\u0005\u0004\u0000\u0000\u0204\u0205\u0005\n\u0000"+
		"\u0000\u0205\u0206\u0005\u0003\u0000\u0000\u0206\u0207\u0005\u0006\u0000"+
		"\u0000\u0207\u0208\u0005\u0003\u0000\u0000\u0208\u0209\u0005\u0004\u0000"+
		"\u0000\u0209\u020a\u0005\n\u0000\u0000\u020a\u020b\u0005\u0003\u0000\u0000"+
		"\u020b\u020c\u0005\u0006\u0000\u0000\u020c\u020d\u0005\u0003\u0000\u0000"+
		"\u020d\u020e\u0005\u0003\u0000\u0000\u020e\u020f\u0005\u0003\u0000\u0000"+
		"\u020f\u0210\u0005\u0003\u0000\u0000\u0210\u0211\u0005\u0003\u0000\u0000"+
		"\u0211\u0212\u0005\u0004\u0000\u0000\u0212\u0213\u0005\n\u0000\u0000\u0213"+
		"\u0214\u0005\u0003\u0000\u0000\u0214\u0215\u0005\u0006\u0000\u0000\u0215"+
		"\u0216\u0005\u0003\u0000\u0000\u0216\u0217\u0005\u0003\u0000\u0000\u0217"+
		"\u0218\u0005\u0003\u0000\u0000\u0218\u0219\u0005\u0004\u0000\u0000\u0219"+
		"\u021a\u0005\n\u0000\u0000\u021a\u021b\u0005\u0003\u0000\u0000\u021b\u021c"+
		"\u0005\u0006\u0000\u0000\u021c\u021d\u0005\u0003\u0000\u0000\u021d\u021e"+
		"\u0005\u0003\u0000\u0000\u021e\u021f\u0005\u0003\u0000\u0000\u021f\u0220"+
		"\u0005\u0003\u0000\u0000\u0220\u0221\u0005\u0003\u0000\u0000\u0221\u0222"+
		"\u0005\u0004\u0000\u0000\u0222\u0223\u0005\n\u0000\u0000\u0223\u0224\u0005"+
		"\u0003\u0000\u0000\u0224\u0225\u0005\u0006\u0000\u0000\u0225\u0226\u0005"+
		"\u0003\u0000\u0000\u0226\u0227\u0005\u0003\u0000\u0000\u0227\u0228\u0005"+
		"\u0003\u0000\u0000\u0228\u0229\u0005\u0003\u0000\u0000\u0229\u022a\u0005"+
		"\u0003\u0000\u0000\u022a\u022b\u0005\u0004\u0000\u0000\u022b\u022c\u0005"+
		"\n\u0000\u0000\u022c\u022d\u0005\u0003\u0000\u0000\u022d\u022e\u0005\u0006"+
		"\u0000\u0000\u022e\u022f\u0005\u0003\u0000\u0000\u022f\u0230\u0005\u0003"+
		"\u0000\u0000\u0230\u0231\u0005\u0003\u0000\u0000\u0231\u0232\u0005\u0003"+
		"\u0000\u0000\u0232\u0233\u0005\u0004\u0000\u0000\u0233\u0234\u0005\n\u0000"+
		"\u0000\u0234\u0235\u0005\u0003\u0000\u0000\u0235\u0236\u0005\u0006\u0000"+
		"\u0000\u0236\u0237\u0005\u0003\u0000\u0000\u0237\u0238\u0005\u0004\u0000"+
		"\u0000\u0238\u0239\u0005\n\u0000\u0000\u0239\u023a\u0005\u0003\u0000\u0000"+
		"\u023a\u023b\u0005\u0006\u0000\u0000\u023b\u023c\u0005\u0003\u0000\u0000"+
		"\u023c\u023d\u0005\u0004\u0000\u0000\u023d\u023e\u0005\n\u0000\u0000\u023e"+
		"\u023f\u0005\u0003\u0000\u0000\u023f\u0240\u0005\u0006\u0000\u0000\u0240"+
		"\u0241\u0005\u0003\u0000\u0000\u0241\u0242\u0005\u0004\u0000\u0000\u0242"+
		"\u0243\u0005\n\u0000\u0000\u0243\u0244\u0005\u0003\u0000\u0000\u0244\u0245"+
		"\u0005\u0006\u0000\u0000\u0245\u0246\u0005\u0003\u0000\u0000\u0246\u0247"+
		"\u0005\u0003\u0000\u0000\u0247\u0248\u0005\u0003\u0000\u0000\u0248\u0249"+
		"\u0005\u0003\u0000\u0000\u0249\u024a\u0005\u0003\u0000\u0000\u024a\u024b"+
		"\u0005\u0004\u0000\u0000\u024b\u024c\u0005\n\u0000\u0000\u024c\u024d\u0005"+
		"\u0003\u0000\u0000\u024d\u024e\u0005\u0006\u0000\u0000\u024e\u024f\u0005"+
		"\u0003\u0000\u0000\u024f\u0250\u0005\u0003\u0000\u0000\u0250\u0251\u0005"+
		"\u0003\u0000\u0000\u0251\u0252\u0005\u0004\u0000\u0000\u0252\u0253\u0005"+
		"\n\u0000\u0000\u0253\u0254\u0005\u0003\u0000\u0000\u0254\u0255\u0005\u0006"+
		"\u0000\u0000\u0255\u0256\u0005\u0003\u0000\u0000\u0256\u0257\u0005\u0003"+
		"\u0000\u0000\u0257\u0258\u0005\u0003\u0000\u0000\u0258\u0259\u0005\u0003"+
		"\u0000\u0000\u0259\u025a\u0005\u0003\u0000\u0000\u025a\u025b\u0005\u0004"+
		"\u0000\u0000\u025b\u025c\u0005\n\u0000\u0000\u025c\u025d\u0005\u0003\u0000"+
		"\u0000\u025d\u025e\u0005\u0006\u0000\u0000\u025e\u025f\u0005\u0003\u0000"+
		"\u0000\u025f\u0260\u0005\u0003\u0000\u0000\u0260\u0261\u0005\u0003\u0000"+
		"\u0000\u0261\u0262\u0005\u0003\u0000\u0000\u0262\u0263\u0005\u0003\u0000"+
		"\u0000\u0263\u0264\u0005\u0004\u0000\u0000\u0264\u0265\u0005\n\u0000\u0000"+
		"\u0265\u0266\u0005\u0003\u0000\u0000\u0266\u0267\u0005\u0006\u0000\u0000"+
		"\u0267\u0268\u0005\u0003\u0000\u0000\u0268\u0269\u0005\u0003\u0000\u0000"+
		"\u0269\u026a\u0005\u0003\u0000\u0000\u026a\u026b\u0005\u0003\u0000\u0000"+
		"\u026b\u026c\u0005\u0004\u0000\u0000\u026c\u026d\u0005\n\u0000\u0000\u026d"+
		"\u026e\u0005\u0003\u0000\u0000\u026e\u026f\u0005\u0006\u0000\u0000\u026f"+
		"\u0270\u0005\u0003\u0000\u0000\u0270\u0271\u0005\n\u0000\u0000\u0271\u0272"+
		"\u0005\u0004\u0000\u0000\u0272\u0273\u0005\n\u0000\u0000\u0273\u0274\u0005"+
		"\u0003\u0000\u0000\u0274\u0275\u0005\u0006\u0000\u0000\u0275\u0276\u0005"+
		"\u0003\u0000\u0000\u0276\u0320\u0005\u0004\u0000\u0000\u0277\u0278\u0005"+
		"\n\u0000\u0000\u0278\u0279\u0005\u0003\u0000\u0000\u0279\u027a\u0005\u0006"+
		"\u0000\u0000\u027a\u027b\u0005\u0003\u0000\u0000\u027b\u027c\u0003\u0018"+
		"\f\u0000\u027c\u027d\u0005\u0004\u0000\u0000\u027d\u027e\u0005\n\u0000"+
		"\u0000\u027e\u027f\u0005\u0003\u0000\u0000\u027f\u0280\u0005\u0006\u0000"+
		"\u0000\u0280\u0281\u0005\u0003\u0000\u0000\u0281\u0283\u0003\u0018\f\u0000"+
		"\u0282\u0284\u0003\u0018\f\u0000\u0283\u0282\u0001\u0000\u0000\u0000\u0283"+
		"\u0284\u0001\u0000\u0000\u0000\u0284\u0286\u0001\u0000\u0000\u0000\u0285"+
		"\u0287\u0003\u0018\f\u0000\u0286\u0285\u0001\u0000\u0000\u0000\u0286\u0287"+
		"\u0001\u0000\u0000\u0000\u0287\u0289\u0001\u0000\u0000\u0000\u0288\u028a"+
		"\u0003\u0018\f\u0000\u0289\u0288\u0001\u0000\u0000\u0000\u0289\u028a\u0001"+
		"\u0000\u0000\u0000\u028a\u028c\u0001\u0000\u0000\u0000\u028b\u028d\u0003"+
		"\u0018\f\u0000\u028c\u028b\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000"+
		"\u0000\u0000\u028d\u028f\u0001\u0000\u0000\u0000\u028e\u0290\u0003\u0018"+
		"\f\u0000\u028f\u028e\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000"+
		"\u0000\u0290\u0292\u0001\u0000\u0000\u0000\u0291\u0293\u0003\u0018\f\u0000"+
		"\u0292\u0291\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000"+
		"\u0293\u0297\u0001\u0000\u0000\u0000\u0294\u0296\u0003\u0018\f\u0000\u0295"+
		"\u0294\u0001\u0000\u0000\u0000\u0296\u0299\u0001\u0000\u0000\u0000\u0297"+
		"\u0295\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000\u0000\u0298"+
		"\u029a\u0001\u0000\u0000\u0000\u0299\u0297\u0001\u0000\u0000\u0000\u029a"+
		"\u029b\u0005\u0004\u0000\u0000\u029b\u029c\u0005\n\u0000\u0000\u029c\u029d"+
		"\u0005\u0003\u0000\u0000\u029d\u029e\u0005\u0006\u0000\u0000\u029e\u029f"+
		"\u0005\u0003\u0000\u0000\u029f\u02a3\u0003\u0018\f\u0000\u02a0\u02a2\u0003"+
		"\u0018\f\u0000\u02a1\u02a0\u0001\u0000\u0000\u0000\u02a2\u02a5\u0001\u0000"+
		"\u0000\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a3\u02a4\u0001\u0000"+
		"\u0000\u0000\u02a4\u02a6\u0001\u0000\u0000\u0000\u02a5\u02a3\u0001\u0000"+
		"\u0000\u0000\u02a6\u02a7\u0005\u0004\u0000\u0000\u02a7\u02a8\u0005\n\u0000"+
		"\u0000\u02a8\u02a9\u0005\u0003\u0000\u0000\u02a9\u02aa\u0005\u0006\u0000"+
		"\u0000\u02aa\u02ac\u0005\u0003\u0000\u0000\u02ab\u02ad\u0005\n\u0000\u0000"+
		"\u02ac\u02ab\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000"+
		"\u02ad\u02ae\u0001\u0000\u0000\u0000\u02ae\u02af\u0005\u0004\u0000\u0000"+
		"\u02af\u02b0\u0005\n\u0000\u0000\u02b0\u02b1\u0005\u0003\u0000\u0000\u02b1"+
		"\u02b2\u0005\u0006\u0000\u0000\u02b2\u02b3\u0005\u0003\u0000\u0000\u02b3"+
		"\u02b4\u0005\b\u0000\u0000\u02b4\u02b5\u0005\u0004\u0000\u0000\u02b5\u02b6"+
		"\u0005\n\u0000\u0000\u02b6\u02b7\u0005\u0003\u0000\u0000\u02b7\u02b8\u0005"+
		"\u0006\u0000\u0000\u02b8\u02b9\u0005\u0003\u0000\u0000\u02b9\u02ba\u0005"+
		"\b\u0000\u0000\u02ba\u02bb\u0005\u0004\u0000\u0000\u02bb\u02bc\u0005\n"+
		"\u0000\u0000\u02bc\u02bd\u0005\u0003\u0000\u0000\u02bd\u02be\u0005\u0006"+
		"\u0000\u0000\u02be\u02bf\u0005\u0003\u0000\u0000\u02bf\u02c0\u0005\b\u0000"+
		"\u0000\u02c0\u02c1\u0005\u0004\u0000\u0000\u02c1\u02c2\u0005\n\u0000\u0000"+
		"\u02c2\u02c3\u0005\u0003\u0000\u0000\u02c3\u02c4\u0005\u0006\u0000\u0000"+
		"\u02c4\u02c5\u0005\u0003\u0000\u0000\u02c5\u02c6\u0005\b\u0000\u0000\u02c6"+
		"\u02c7\u0005\u0004\u0000\u0000\u02c7\u02c8\u0005\n\u0000\u0000\u02c8\u02c9"+
		"\u0005\u0003\u0000\u0000\u02c9\u02ca\u0005\u0006\u0000\u0000\u02ca\u02cb"+
		"\u0005\u0003\u0000\u0000\u02cb\u02cc\u0005\b\u0000\u0000\u02cc\u02cd\u0005"+
		"\u0004\u0000\u0000\u02cd\u02ce\u0005\n\u0000\u0000\u02ce\u02cf\u0005\u0003"+
		"\u0000\u0000\u02cf\u02d0\u0005\u0006\u0000\u0000\u02d0\u02d1\u0005\u0003"+
		"\u0000\u0000\u02d1\u02d2\u0005\b\u0000\u0000\u02d2\u02d3\u0005\u0004\u0000"+
		"\u0000\u02d3\u02d4\u0005\n\u0000\u0000\u02d4\u02d5\u0005\u0003\u0000\u0000"+
		"\u02d5\u02d6\u0005\u0006\u0000\u0000\u02d6\u02d7\u0005\u0003\u0000\u0000"+
		"\u02d7\u02d8\u0005\b\u0000\u0000\u02d8\u02d9\u0005\u0004\u0000\u0000\u02d9"+
		"\u02da\u0005\n\u0000\u0000\u02da\u02db\u0005\u0003\u0000\u0000\u02db\u02dc"+
		"\u0005\u0006\u0000\u0000\u02dc\u02dd\u0005\u0003\u0000\u0000\u02dd\u02de"+
		"\u0005\b\u0000\u0000\u02de\u02df\u0005\u0004\u0000\u0000\u02df\u02e0\u0005"+
		"\n\u0000\u0000\u02e0\u02e1\u0005\u0003\u0000\u0000\u02e1\u02e2\u0005\u0006"+
		"\u0000\u0000\u02e2\u02e3\u0005\u0003\u0000\u0000\u02e3\u02e4\u0005\b\u0000"+
		"\u0000\u02e4\u02e5\u0005\u0004\u0000\u0000\u02e5\u02e6\u0005\n\u0000\u0000"+
		"\u02e6\u02e7\u0005\u0003\u0000\u0000\u02e7\u02e8\u0005\u0006\u0000\u0000"+
		"\u02e8\u02e9\u0005\u0003\u0000\u0000\u02e9\u02ea\u0005\b\u0000\u0000\u02ea"+
		"\u02eb\u0005\u0004\u0000\u0000\u02eb\u02ec\u0005\n\u0000\u0000\u02ec\u02ed"+
		"\u0005\u0003\u0000\u0000\u02ed\u02ee\u0005\u0006\u0000\u0000\u02ee\u02ef"+
		"\u0005\u0003\u0000\u0000\u02ef\u02f0\u0005\u0004\u0000\u0000\u02f0\u02f1"+
		"\u0006\u0002\uffff\uffff\u0000\u02f1\u0321\u0001\u0000\u0000\u0000\u02f2"+
		"\u02f3\u0005\n\u0000\u0000\u02f3\u02f4\u0005\u0003\u0000\u0000\u02f4\u02f5"+
		"\u0005\u0006\u0000\u0000\u02f5\u02f6\u0005\u0003\u0000\u0000\u02f6\u02f7"+
		"\u0005\b\u0000\u0000\u02f7\u02f9\u0003\u0018\f\u0000\u02f8\u02fa\u0003"+
		"\u0018\f\u0000\u02f9\u02f8\u0001\u0000\u0000\u0000\u02f9\u02fa\u0001\u0000"+
		"\u0000\u0000\u02fa\u02fc\u0001\u0000\u0000\u0000\u02fb\u02fd\u0003\u0018"+
		"\f\u0000\u02fc\u02fb\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000"+
		"\u0000\u02fd\u02ff\u0001\u0000\u0000\u0000\u02fe\u0300\u0003\u0018\f\u0000"+
		"\u02ff\u02fe\u0001\u0000\u0000\u0000\u02ff\u0300\u0001\u0000\u0000\u0000"+
		"\u0300\u0302\u0001\u0000\u0000\u0000\u0301\u0303\u0003\u0018\f\u0000\u0302"+
		"\u0301\u0001\u0000\u0000\u0000\u0302\u0303\u0001\u0000\u0000\u0000\u0303"+
		"\u0305\u0001\u0000\u0000\u0000\u0304\u0306\u0003\u0018\f\u0000\u0305\u0304"+
		"\u0001\u0000\u0000\u0000\u0305\u0306\u0001\u0000\u0000\u0000\u0306\u0308"+
		"\u0001\u0000\u0000\u0000\u0307\u0309\u0003\u0018\f\u0000\u0308\u0307\u0001"+
		"\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309\u030d\u0001"+
		"\u0000\u0000\u0000\u030a\u030c\u0003\u0018\f\u0000\u030b\u030a\u0001\u0000"+
		"\u0000\u0000\u030c\u030f\u0001\u0000\u0000\u0000\u030d\u030b\u0001\u0000"+
		"\u0000\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e\u0310\u0001\u0000"+
		"\u0000\u0000\u030f\u030d\u0001\u0000\u0000\u0000\u0310\u0311\u0005\b\u0000"+
		"\u0000\u0311\u0312\u0005\u0004\u0000\u0000\u0312\u0313\u0005\n\u0000\u0000"+
		"\u0313\u0314\u0005\u0003\u0000\u0000\u0314\u0315\u0005\u0006\u0000\u0000"+
		"\u0315\u0316\u0005\u0003\u0000\u0000\u0316\u0317\u0005\b\u0000\u0000\u0317"+
		"\u0318\u0005\b\u0000\u0000\u0318\u0319\u0005\b\u0000\u0000\u0319\u031a"+
		"\u0005\b\u0000\u0000\u031a\u031b\u0005\b\u0000\u0000\u031b\u031c\u0005"+
		"\b\u0000\u0000\u031c\u031d\u0005\b\u0000\u0000\u031d\u031e\u0005\u0004"+
		"\u0000\u0000\u031e\u031f\u0006\u0002\uffff\uffff\u0000\u031f\u0321\u0001"+
		"\u0000\u0000\u0000\u0320\u0277\u0001\u0000\u0000\u0000\u0320\u02f2\u0001"+
		"\u0000\u0000\u0000\u0321\u0322\u0001\u0000\u0000\u0000\u0322\u0320\u0001"+
		"\u0000\u0000\u0000\u0322\u0323\u0001\u0000\u0000\u0000\u0323\u0324\u0001"+
		"\u0000\u0000\u0000\u0324\u0325\u0005\n\u0000\u0000\u0325\u0326\u0005\u0003"+
		"\u0000\u0000\u0326\u0327\u0005\n\u0000\u0000\u0327\u0328\u0005\u0003\u0000"+
		"\u0000\u0328\u0329\u0005\u0006\u0000\u0000\u0329\u032a\u0005\u0004\u0000"+
		"\u0000\u032a\u032c\u0001\u0000\u0000\u0000\u032b\u0149\u0001\u0000\u0000"+
		"\u0000\u032c\u032d\u0001\u0000\u0000\u0000\u032d\u032b\u0001\u0000\u0000"+
		"\u0000\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000\u0000"+
		"\u0000\u032f\u0330\u0005\u0005\u0000\u0000\u0330\u0331\u0005\u0003\u0000"+
		"\u0000\u0331\u0332\u0005\n\u0000\u0000\u0332\u0333\u0005\u0003\u0000\u0000"+
		"\u0333\u0334\u0005\n\u0000\u0000\u0334\u0335\u0005\n\u0000\u0000\u0335"+
		"\u0336\u0005\n\u0000\u0000\u0336\u0337\u0005\n\u0000\u0000\u0337\u0338"+
		"\u0005\n\u0000\u0000\u0338\u0339\u0005\n\u0000\u0000\u0339\u033a\u0005"+
		"\u0003\u0000\u0000\u033a\u033b\u0005\n\u0000\u0000\u033b\u033c\u0005\u0004"+
		"\u0000\u0000\u033c\u0005\u0001\u0000\u0000\u0000\u033d\u033e\u0005\u0005"+
		"\u0000\u0000\u033e\u033f\u0005\u0003\u0000\u0000\u033f\u0340\u0005\n\u0000"+
		"\u0000\u0340\u0341\u0005\u0003\u0000\u0000\u0341\u0342\u0005\n\u0000\u0000"+
		"\u0342\u0343\u0005\u0003\u0000\u0000\u0343\u0344\u0005\n\u0000\u0000\u0344"+
		"\u03fe\u0005\u0004\u0000\u0000\u0345\u0346\u0005\b\u0000\u0000\u0346\u0347"+
		"\u0005\u0003\u0000\u0000\u0347\u0348\u0005\n\u0000\u0000\u0348\u0349\u0005"+
		"\n\u0000\u0000\u0349\u034a\u0005\u0003\u0000\u0000\u034a\u03ff\u0005\u0004"+
		"\u0000\u0000\u034b\u034c\u0005\n\u0000\u0000\u034c\u034d\u0005\u0003\u0000"+
		"\u0000\u034d\u034e\u0005\b\u0000\u0000\u034e\u034f\u0005\u0003\u0000\u0000"+
		"\u034f\u0350\u0005\n\u0000\u0000\u0350\u0351\u0005\u0003\u0000\u0000\u0351"+
		"\u0352\u0005\n\u0000\u0000\u0352\u0353\u0005\u0003\u0000\u0000\u0353\u0354"+
		"\u0005\n\u0000\u0000\u0354\u0355\u0005\u0003\u0000\u0000\u0355\u0356\u0005"+
		"\n\u0000\u0000\u0356\u0357\u0005\u0003\u0000\u0000\u0357\u0358\u0005\n"+
		"\u0000\u0000\u0358\u0359\u0005\u0003\u0000\u0000\u0359\u035a\u0005\n\u0000"+
		"\u0000\u035a\u035b\u0005\u0003\u0000\u0000\u035b\u035c\u0005\n\u0000\u0000"+
		"\u035c\u035d\u0005\u0003\u0000\u0000\u035d\u035e\u0005\n\u0000\u0000\u035e"+
		"\u035f\u0005\u0003\u0000\u0000\u035f\u0360\u0005\n\u0000\u0000\u0360\u0361"+
		"\u0005\u0003\u0000\u0000\u0361\u0362\u0005\n\u0000\u0000\u0362\u0363\u0005"+
		"\u0003\u0000\u0000\u0363\u0364\u0005\n\u0000\u0000\u0364\u0365\u0005\u0003"+
		"\u0000\u0000\u0365\u0382\u0005\u0004\u0000\u0000\u0366\u0367\u0005\n\u0000"+
		"\u0000\u0367\u0368\u0005\u0003\u0000\u0000\u0368\u0369\u0005\b\u0000\u0000"+
		"\u0369\u036a\u0005\u0003\u0000\u0000\u036a\u036b\u0005\u0006\u0000\u0000"+
		"\u036b\u036c\u0005\u0003\u0000\u0000\u036c\u036d\u0005\b\u0000\u0000\u036d"+
		"\u036e\u0005\u0003\u0000\u0000\u036e\u036f\u0005\b\u0000\u0000\u036f\u0370"+
		"\u0005\u0003\u0000\u0000\u0370\u0371\u0005\b\u0000\u0000\u0371\u0372\u0005"+
		"\u0003\u0000\u0000\u0372\u0373\u0005\b\u0000\u0000\u0373\u0374\u0005\u0003"+
		"\u0000\u0000\u0374\u0375\u0005\b\u0000\u0000\u0375\u0376\u0005\u0003\u0000"+
		"\u0000\u0376\u0377\u0005\b\u0000\u0000\u0377\u0378\u0005\u0003\u0000\u0000"+
		"\u0378\u0379\u0005\b\u0000\u0000\u0379\u037a\u0005\u0003\u0000\u0000\u037a"+
		"\u037b\u0005\b\u0000\u0000\u037b\u037c\u0005\u0003\u0000\u0000\u037c\u037d"+
		"\u0005\b\u0000\u0000\u037d\u037e\u0005\u0003\u0000\u0000\u037e\u037f\u0005"+
		"\b\u0000\u0000\u037f\u0380\u0005\u0003\u0000\u0000\u0380\u0381\u0005\u0004"+
		"\u0000\u0000\u0381\u0383\u0006\u0003\uffff\uffff\u0000\u0382\u0366\u0001"+
		"\u0000\u0000\u0000\u0383\u0384\u0001\u0000\u0000\u0000\u0384\u0382\u0001"+
		"\u0000\u0000\u0000\u0384\u0385\u0001\u0000\u0000\u0000\u0385\u03f3\u0001"+
		"\u0000\u0000\u0000\u0386\u0387\u0005\n\u0000\u0000\u0387\u0388\u0005\u0003"+
		"\u0000\u0000\u0388\u0389\u0005\b\u0000\u0000\u0389\u038a\u0005\u0003\u0000"+
		"\u0000\u038a\u038b\u0005\n\u0000\u0000\u038b\u038c\u0005\u0003\u0000\u0000"+
		"\u038c\u038d\u0005\n\u0000\u0000\u038d\u038e\u0005\u0003\u0000\u0000\u038e"+
		"\u038f\u0005\n\u0000\u0000\u038f\u0390\u0005\u0003\u0000\u0000\u0390\u0391"+
		"\u0005\n\u0000\u0000\u0391\u0392\u0005\u0003\u0000\u0000\u0392\u0393\u0005"+
		"\n\u0000\u0000\u0393\u0394\u0005\u0003\u0000\u0000\u0394\u0395\u0005\n"+
		"\u0000\u0000\u0395\u0396\u0005\u0003\u0000\u0000\u0396\u0397\u0005\n\u0000"+
		"\u0000\u0397\u0398\u0005\u0003\u0000\u0000\u0398\u0399\u0005\n\u0000\u0000"+
		"\u0399\u039a\u0005\u0003\u0000\u0000\u039a\u039b\u0005\n\u0000\u0000\u039b"+
		"\u039c\u0005\u0003\u0000\u0000\u039c\u039d\u0005\n\u0000\u0000\u039d\u039e"+
		"\u0005\u0003\u0000\u0000\u039e\u039f\u0005\n\u0000\u0000\u039f\u03a0\u0005"+
		"\u0003\u0000\u0000\u03a0\u03a1\u0005\n\u0000\u0000\u03a1\u03a2\u0005\u0003"+
		"\u0000\u0000\u03a2\u03a3\u0005\n\u0000\u0000\u03a3\u03a4\u0005\u0003\u0000"+
		"\u0000\u03a4\u03a5\u0005\n\u0000\u0000\u03a5\u03a6\u0005\u0003\u0000\u0000"+
		"\u03a6\u03a7\u0005\n\u0000\u0000\u03a7\u03a8\u0005\u0003\u0000\u0000\u03a8"+
		"\u03a9\u0005\n\u0000\u0000\u03a9\u03aa\u0005\u0003\u0000\u0000\u03aa\u03ab"+
		"\u0005\n\u0000\u0000\u03ab\u03ac\u0005\u0003\u0000\u0000\u03ac\u03ee\u0005"+
		"\u0004\u0000\u0000\u03ad\u03ae\u0005\n\u0000\u0000\u03ae\u03af\u0005\u0003"+
		"\u0000\u0000\u03af\u03b0\u0005\b\u0000\u0000\u03b0\u03b1\u0005\u0003\u0000"+
		"\u0000\u03b1\u03b2\u0005\u0006\u0000\u0000\u03b2\u03b3\u0005\u0003\u0000"+
		"\u0000\u03b3\u03b4\u0005\b\u0000\u0000\u03b4\u03b5\u0005\u0003\u0000\u0000"+
		"\u03b5\u03b6\u0005\b\u0000\u0000\u03b6\u03b7\u0005\u0003\u0000\u0000\u03b7"+
		"\u03b8\u0005\b\u0000\u0000\u03b8\u03b9\u0005\u0003\u0000\u0000\u03b9\u03ba"+
		"\u0005\b\u0000\u0000\u03ba\u03bb\u0005\u0003\u0000\u0000\u03bb\u03bc\u0005"+
		"\b\u0000\u0000\u03bc\u03bd\u0005\u0003\u0000\u0000\u03bd\u03be\u0005\b"+
		"\u0000\u0000\u03be\u03bf\u0005\u0003\u0000\u0000\u03bf\u03c0\u0005\b\u0000"+
		"\u0000\u03c0\u03c1\u0005\u0003\u0000\u0000\u03c1\u03c2\u0005\b\u0000\u0000"+
		"\u03c2\u03c3\u0005\u0003\u0000\u0000\u03c3\u03c4\u0005\b\u0000\u0000\u03c4"+
		"\u03c5\u0005\u0003\u0000\u0000\u03c5\u03c6\u0005\b\u0000\u0000\u03c6\u03c7"+
		"\u0005\u0003\u0000\u0000\u03c7\u03c8\u0005\b\u0000\u0000\u03c8\u03c9\u0005"+
		"\u0003\u0000\u0000\u03c9\u03ca\u0005\b\u0000\u0000\u03ca\u03cb\u0005\u0003"+
		"\u0000\u0000\u03cb\u03cd\u0003\u0018\f\u0000\u03cc\u03ce\u0003\u0018\f"+
		"\u0000\u03cd\u03cc\u0001\u0000\u0000\u0000\u03cd\u03ce\u0001\u0000\u0000"+
		"\u0000\u03ce\u03d0\u0001\u0000\u0000\u0000\u03cf\u03d1\u0003\u0018\f\u0000"+
		"\u03d0\u03cf\u0001\u0000\u0000\u0000\u03d0\u03d1\u0001\u0000\u0000\u0000"+
		"\u03d1\u03d3\u0001\u0000\u0000\u0000\u03d2\u03d4\u0003\u0018\f\u0000\u03d3"+
		"\u03d2\u0001\u0000\u0000\u0000\u03d3\u03d4\u0001\u0000\u0000\u0000\u03d4"+
		"\u03d6\u0001\u0000\u0000\u0000\u03d5\u03d7\u0003\u0018\f\u0000\u03d6\u03d5"+
		"\u0001\u0000\u0000\u0000\u03d6\u03d7\u0001\u0000\u0000\u0000\u03d7\u03d9"+
		"\u0001\u0000\u0000\u0000\u03d8\u03da\u0003\u0018\f\u0000\u03d9\u03d8\u0001"+
		"\u0000\u0000\u0000\u03d9\u03da\u0001\u0000\u0000\u0000\u03da\u03dc\u0001"+
		"\u0000\u0000\u0000\u03db\u03dd\u0003\u0018\f\u0000\u03dc\u03db\u0001\u0000"+
		"\u0000\u0000\u03dc\u03dd\u0001\u0000\u0000\u0000\u03dd\u03e1\u0001\u0000"+
		"\u0000\u0000\u03de\u03e0\u0003\u0018\f\u0000\u03df\u03de\u0001\u0000\u0000"+
		"\u0000\u03e0\u03e3\u0001\u0000\u0000\u0000\u03e1\u03df\u0001\u0000\u0000"+
		"\u0000\u03e1\u03e2\u0001\u0000\u0000\u0000\u03e2\u03e4\u0001\u0000\u0000"+
		"\u0000\u03e3\u03e1\u0001\u0000\u0000\u0000\u03e4\u03e5\u0005\u0003\u0000"+
		"\u0000\u03e5\u03e6\u0005\b\u0000\u0000\u03e6\u03e7\u0005\u0003\u0000\u0000"+
		"\u03e7\u03e8\u0005\b\u0000\u0000\u03e8\u03e9\u0005\u0003\u0000\u0000\u03e9"+
		"\u03ea\u0005\b\u0000\u0000\u03ea\u03eb\u0005\u0003\u0000\u0000\u03eb\u03ec"+
		"\u0005\u0004\u0000\u0000\u03ec\u03ed\u0006\u0003\uffff\uffff\u0000\u03ed"+
		"\u03ef\u0001\u0000\u0000\u0000\u03ee\u03ad\u0001\u0000\u0000\u0000\u03ef"+
		"\u03f0\u0001\u0000\u0000\u0000\u03f0\u03ee\u0001\u0000\u0000\u0000\u03f0"+
		"\u03f1\u0001\u0000\u0000\u0000\u03f1\u03f3\u0001\u0000\u0000\u0000\u03f2"+
		"\u034b\u0001\u0000\u0000\u0000\u03f2\u0386\u0001\u0000\u0000\u0000\u03f3"+
		"\u03f5\u0001\u0000\u0000\u0000\u03f4\u03f2\u0001\u0000\u0000\u0000\u03f5"+
		"\u03f6\u0001\u0000\u0000\u0000\u03f6\u03f4\u0001\u0000\u0000\u0000\u03f6"+
		"\u03f7\u0001\u0000\u0000\u0000\u03f7\u03f8\u0001\u0000\u0000\u0000\u03f8"+
		"\u03f9\u0005\n\u0000\u0000\u03f9\u03fa\u0005\u0003\u0000\u0000\u03fa\u03fb"+
		"\u0005\n\u0000\u0000\u03fb\u03fc\u0005\u0003\u0000\u0000\u03fc\u03fd\u0005"+
		"\u0006\u0000\u0000\u03fd\u03ff\u0005\u0004\u0000\u0000\u03fe\u0345\u0001"+
		"\u0000\u0000\u0000\u03fe\u03f4\u0001\u0000\u0000\u0000\u03ff\u0400\u0001"+
		"\u0000\u0000\u0000\u0400\u03fe\u0001\u0000\u0000\u0000\u0400\u0401\u0001"+
		"\u0000\u0000\u0000\u0401\u0402\u0001\u0000\u0000\u0000\u0402\u0403\u0005"+
		"\u0005\u0000\u0000\u0403\u0404\u0005\u0003\u0000\u0000\u0404\u0405\u0005"+
		"\n\u0000\u0000\u0405\u0406\u0005\u0003\u0000\u0000\u0406\u0407\u0005\n"+
		"\u0000\u0000\u0407\u0408\u0005\u0003\u0000\u0000\u0408\u0409\u0005\n\u0000"+
		"\u0000\u0409\u040a\u0005\u0004\u0000\u0000\u040a\u0007\u0001\u0000\u0000"+
		"\u0000\u040b\u040c\u0005\u0005\u0000\u0000\u040c\u040d\u0005\u0003\u0000"+
		"\u0000\u040d\u040e\u0005\n\u0000\u0000\u040e\u040f\u0005\u0003\u0000\u0000"+
		"\u040f\u0410\u0005\n\u0000\u0000\u0410\u0411\u0005\n\u0000\u0000\u0411"+
		"\u0412\u0005\n\u0000\u0000\u0412\u0413\u0005\u0003\u0000\u0000\u0413\u0414"+
		"\u0005\n\u0000\u0000\u0414\u0415\u0005\u0003\u0000\u0000\u0415\u0416\u0005"+
		"\n\u0000\u0000\u0416\u0497\u0005\u0004\u0000\u0000\u0417\u0418\u0005\n"+
		"\u0000\u0000\u0418\u0419\u0005\u0003\u0000\u0000\u0419\u041a\u0005\u0004"+
		"\u0000\u0000\u041a\u041b\u0005\n\u0000\u0000\u041b\u041c\u0005\u0003\u0000"+
		"\u0000\u041c\u041d\u0005\n\u0000\u0000\u041d\u041e\u0005\u0003\u0000\u0000"+
		"\u041e\u041f\u0005\n\u0000\u0000\u041f\u0420\u0005\u0003\u0000\u0000\u0420"+
		"\u0421\u0005\u0003\u0000\u0000\u0421\u0422\u0005\n\u0000\u0000\u0422\u0423"+
		"\u0005\u0003\u0000\u0000\u0423\u0424\u0005\n\u0000\u0000\u0424\u0425\u0005"+
		"\u0003\u0000\u0000\u0425\u0426\u0005\n\u0000\u0000\u0426\u0427\u0005\u0003"+
		"\u0000\u0000\u0427\u0428\u0005\n\u0000\u0000\u0428\u0429\u0005\u0004\u0000"+
		"\u0000\u0429\u042a\u0005\n\u0000\u0000\u042a\u042b\u0005\u0003\u0000\u0000"+
		"\u042b\u042c\u0005\u0003\u0000\u0000\u042c\u042d\u0005\u0003\u0000\u0000"+
		"\u042d\u042e\u0005\n\u0000\u0000\u042e\u042f\u0005\u0003\u0000\u0000\u042f"+
		"\u0430\u0005\u0003\u0000\u0000\u0430\u0431\u0005\u0003\u0000\u0000\u0431"+
		"\u0432\u0005\u0003\u0000\u0000\u0432\u0433\u0005\u0003\u0000\u0000\u0433"+
		"\u0434\u0005\u0003\u0000\u0000\u0434\u0435\u0005\n\u0000\u0000\u0435\u0436"+
		"\u0005\u0003\u0000\u0000\u0436\u0437\u0005\n\u0000\u0000\u0437\u0438\u0005"+
		"\u0003\u0000\u0000\u0438\u048c\u0005\u0004\u0000\u0000\u0439\u043a\u0005"+
		"\n\u0000\u0000\u043a\u043b\u0005\u0003\u0000\u0000\u043b\u043c\u0005\u0003"+
		"\u0000\u0000\u043c\u043e\u0003\u0018\f\u0000\u043d\u043f\u0003\u0018\f"+
		"\u0000\u043e\u043d\u0001\u0000\u0000\u0000\u043e\u043f\u0001\u0000\u0000"+
		"\u0000\u043f\u0441\u0001\u0000\u0000\u0000\u0440\u0442\u0003\u0018\f\u0000"+
		"\u0441\u0440\u0001\u0000\u0000\u0000\u0441\u0442\u0001\u0000\u0000\u0000"+
		"\u0442\u0444\u0001\u0000\u0000\u0000\u0443\u0445\u0003\u0018\f\u0000\u0444"+
		"\u0443\u0001\u0000\u0000\u0000\u0444\u0445\u0001\u0000\u0000\u0000\u0445"+
		"\u0447\u0001\u0000\u0000\u0000\u0446\u0448\u0003\u0018\f\u0000\u0447\u0446"+
		"\u0001\u0000\u0000\u0000\u0447\u0448\u0001\u0000\u0000\u0000\u0448\u044a"+
		"\u0001\u0000\u0000\u0000\u0449\u044b\u0003\u0018\f\u0000\u044a\u0449\u0001"+
		"\u0000\u0000\u0000\u044a\u044b\u0001\u0000\u0000\u0000\u044b\u044d\u0001"+
		"\u0000\u0000\u0000\u044c\u044e\u0003\u0018\f\u0000\u044d\u044c\u0001\u0000"+
		"\u0000\u0000\u044d\u044e\u0001\u0000\u0000\u0000\u044e\u0452\u0001\u0000"+
		"\u0000\u0000\u044f\u0451\u0003\u0018\f\u0000\u0450\u044f\u0001\u0000\u0000"+
		"\u0000\u0451\u0454\u0001\u0000\u0000\u0000\u0452\u0450\u0001\u0000\u0000"+
		"\u0000\u0452\u0453\u0001\u0000\u0000\u0000\u0453\u0455\u0001\u0000\u0000"+
		"\u0000\u0454\u0452\u0001\u0000\u0000\u0000\u0455\u0456\u0005\u0003\u0000"+
		"\u0000\u0456\u0457\u0005\b\u0000\u0000\u0457\u0458\u0005\u0003\u0000\u0000"+
		"\u0458\u045a\u0003\u0018\f\u0000\u0459\u045b\u0003\u0018\f\u0000\u045a"+
		"\u0459\u0001\u0000\u0000\u0000\u045a\u045b\u0001\u0000\u0000\u0000\u045b"+
		"\u045d\u0001\u0000\u0000\u0000\u045c\u045e\u0003\u0018\f\u0000\u045d\u045c"+
		"\u0001\u0000\u0000\u0000\u045d\u045e\u0001\u0000\u0000\u0000\u045e\u0460"+
		"\u0001\u0000\u0000\u0000\u045f\u0461\u0003\u0018\f\u0000\u0460\u045f\u0001"+
		"\u0000\u0000\u0000\u0460\u0461\u0001\u0000\u0000\u0000\u0461\u0463\u0001"+
		"\u0000\u0000\u0000\u0462\u0464\u0003\u0018\f\u0000\u0463\u0462\u0001\u0000"+
		"\u0000\u0000\u0463\u0464\u0001\u0000\u0000\u0000\u0464\u0466\u0001\u0000"+
		"\u0000\u0000\u0465\u0467\u0003\u0018\f\u0000\u0466\u0465\u0001\u0000\u0000"+
		"\u0000\u0466\u0467\u0001\u0000\u0000\u0000\u0467\u0469\u0001\u0000\u0000"+
		"\u0000\u0468\u046a\u0003\u0018\f\u0000\u0469\u0468\u0001\u0000\u0000\u0000"+
		"\u0469\u046a\u0001\u0000\u0000\u0000\u046a\u046e\u0001\u0000\u0000\u0000"+
		"\u046b\u046d\u0003\u0018\f\u0000\u046c\u046b\u0001\u0000\u0000\u0000\u046d"+
		"\u0470\u0001\u0000\u0000\u0000\u046e\u046c\u0001\u0000\u0000\u0000\u046e"+
		"\u046f\u0001\u0000\u0000\u0000\u046f\u0471\u0001\u0000\u0000\u0000\u0470"+
		"\u046e\u0001\u0000\u0000\u0000\u0471\u0472\u0005\u0003\u0000\u0000\u0472"+
		"\u0473\u0005\b\u0000\u0000\u0473\u0474\u0005\u0003\u0000\u0000\u0474\u0475"+
		"\u0005\b\u0000\u0000\u0475\u0476\u0005\u0003\u0000\u0000\u0476\u0477\u0005"+
		"\b\u0000\u0000\u0477\u0478\u0005\u0003\u0000\u0000\u0478\u0479\u0005\u0003"+
		"\u0000\u0000\u0479\u047b\u0005\u0003\u0000\u0000\u047a\u047c\u0005\b\u0000"+
		"\u0000\u047b\u047a\u0001\u0000\u0000\u0000\u047b\u047c\u0001\u0000\u0000"+
		"\u0000\u047c\u047d\u0001\u0000\u0000\u0000\u047d\u047e\u0005\u0003\u0000"+
		"\u0000\u047e\u047f\u0005\u0003\u0000\u0000\u047f\u0480\u0005\u0003\u0000"+
		"\u0000\u0480\u0481\u0005\u0003\u0000\u0000\u0481\u0482\u0005\u0003\u0000"+
		"\u0000\u0482\u0484\u0005\u0003\u0000\u0000\u0483\u0485\u0005\b\u0000\u0000"+
		"\u0484\u0483\u0001\u0000\u0000\u0000\u0484\u0485\u0001\u0000\u0000\u0000"+
		"\u0485\u0486\u0001\u0000\u0000\u0000\u0486\u0487\u0005\u0003\u0000\u0000"+
		"\u0487\u0488\u0005\n\u0000\u0000\u0488\u0489\u0005\u0003\u0000\u0000\u0489"+
		"\u048a\u0005\u0004\u0000\u0000\u048a\u048b\u0006\u0004\uffff\uffff\u0000"+
		"\u048b\u048d\u0001\u0000\u0000\u0000\u048c\u0439\u0001\u0000\u0000\u0000"+
		"\u048d\u048e\u0001\u0000\u0000\u0000\u048e\u048c\u0001\u0000\u0000\u0000"+
		"\u048e\u048f\u0001\u0000\u0000\u0000\u048f\u0490\u0001\u0000\u0000\u0000"+
		"\u0490\u0491\u0005\n\u0000\u0000\u0491\u0492\u0005\u0003\u0000\u0000\u0492"+
		"\u0493\u0005\n\u0000\u0000\u0493\u0494\u0005\u0003\u0000\u0000\u0494\u0495"+
		"\u0005\u0006\u0000\u0000\u0495\u0496\u0005\u0004\u0000\u0000\u0496\u0498"+
		"\u0001\u0000\u0000\u0000\u0497\u0417\u0001\u0000\u0000\u0000\u0498\u0499"+
		"\u0001\u0000\u0000\u0000\u0499\u0497\u0001\u0000\u0000\u0000\u0499\u049a"+
		"\u0001\u0000\u0000\u0000\u049a\u049b\u0001\u0000\u0000\u0000\u049b\u049c"+
		"\u0005\u0005\u0000\u0000\u049c\u049d\u0005\u0003\u0000\u0000\u049d\u049e"+
		"\u0005\n\u0000\u0000\u049e\u049f\u0005\u0003\u0000\u0000\u049f\u04a0\u0005"+
		"\n\u0000\u0000\u04a0\u04a1\u0005\n\u0000\u0000\u04a1\u04a2\u0005\n\u0000"+
		"\u0000\u04a2\u04a3\u0005\u0003\u0000\u0000\u04a3\u04a4\u0005\n\u0000\u0000"+
		"\u04a4\u04a5\u0005\u0003\u0000\u0000\u04a5\u04a6\u0005\n\u0000\u0000\u04a6"+
		"\u04a7\u0005\u0004\u0000\u0000\u04a7\t\u0001\u0000\u0000\u0000\u04a8\u04a9"+
		"\u0005\u0005\u0000\u0000\u04a9\u04aa\u0005\u0003\u0000\u0000\u04aa\u04ab"+
		"\u0005\n\u0000\u0000\u04ab\u04ac\u0005\n\u0000\u0000\u04ac\u04ad\u0005"+
		"\u0003\u0000\u0000\u04ad\u04ae\u0005\n\u0000\u0000\u04ae\u04af\u0005\u0003"+
		"\u0000\u0000\u04af\u04b0\u0005\n\u0000\u0000\u04b0\u04b1\u0005\u0003\u0000"+
		"\u0000\u04b1\u04b2\u0005\n\u0000\u0000\u04b2\u0540\u0005\u0004\u0000\u0000"+
		"\u04b3\u04b4\u0005\b\u0000\u0000\u04b4\u04b6\u0005\u0003\u0000\u0000\u04b5"+
		"\u04b7\u0003\u0018\f\u0000\u04b6\u04b5\u0001\u0000\u0000\u0000\u04b7\u04b8"+
		"\u0001\u0000\u0000\u0000\u04b8\u04b6\u0001\u0000\u0000\u0000\u04b8\u04b9"+
		"\u0001\u0000\u0000\u0000\u04b9\u04ba\u0001\u0000\u0000\u0000\u04ba\u04bb"+
		"\u0005\u0004\u0000\u0000\u04bb\u04bc\u0005\u0005\u0000\u0000\u04bc\u04bd"+
		"\u0005\u0003\u0000\u0000\u04bd\u04bf\u0003\u0018\f\u0000\u04be\u04c0\u0003"+
		"\u0018\f\u0000\u04bf\u04be\u0001\u0000\u0000\u0000\u04bf\u04c0\u0001\u0000"+
		"\u0000\u0000\u04c0\u04c2\u0001\u0000\u0000\u0000\u04c1\u04c3\u0003\u0018"+
		"\f\u0000\u04c2\u04c1\u0001\u0000\u0000\u0000\u04c2\u04c3\u0001\u0000\u0000"+
		"\u0000\u04c3\u04c5\u0001\u0000\u0000\u0000\u04c4\u04c6\u0003\u0018\f\u0000"+
		"\u04c5\u04c4\u0001\u0000\u0000\u0000\u04c5\u04c6\u0001\u0000\u0000\u0000"+
		"\u04c6\u04c8\u0001\u0000\u0000\u0000\u04c7\u04c9\u0003\u0018\f\u0000\u04c8"+
		"\u04c7\u0001\u0000\u0000\u0000\u04c8\u04c9\u0001\u0000\u0000\u0000\u04c9"+
		"\u04cb\u0001\u0000\u0000\u0000\u04ca\u04cc\u0003\u0018\f\u0000\u04cb\u04ca"+
		"\u0001\u0000\u0000\u0000\u04cb\u04cc\u0001\u0000\u0000\u0000\u04cc\u04ce"+
		"\u0001\u0000\u0000\u0000\u04cd\u04cf\u0003\u0018\f\u0000\u04ce\u04cd\u0001"+
		"\u0000\u0000\u0000\u04ce\u04cf\u0001\u0000\u0000\u0000\u04cf\u04d3\u0001"+
		"\u0000\u0000\u0000\u04d0\u04d2\u0003\u0018\f\u0000\u04d1\u04d0\u0001\u0000"+
		"\u0000\u0000\u04d2\u04d5\u0001\u0000\u0000\u0000\u04d3\u04d1\u0001\u0000"+
		"\u0000\u0000\u04d3\u04d4\u0001\u0000\u0000\u0000\u04d4\u04d6\u0001\u0000"+
		"\u0000\u0000\u04d5\u04d3\u0001\u0000\u0000\u0000\u04d6\u04d7\u0005\u0004"+
		"\u0000\u0000\u04d7\u04d8\u0005\u0005\u0000\u0000\u04d8\u04d9\u0005\u0003"+
		"\u0000\u0000\u04d9\u04db\u0003\u0018\f\u0000\u04da\u04dc\u0003\u0018\f"+
		"\u0000\u04db\u04da\u0001\u0000\u0000\u0000\u04db\u04dc\u0001\u0000\u0000"+
		"\u0000\u04dc\u04de\u0001\u0000\u0000\u0000\u04dd\u04df\u0003\u0018\f\u0000"+
		"\u04de\u04dd\u0001\u0000\u0000\u0000\u04de\u04df\u0001\u0000\u0000\u0000"+
		"\u04df\u04e1\u0001\u0000\u0000\u0000\u04e0\u04e2\u0003\u0018\f\u0000\u04e1"+
		"\u04e0\u0001\u0000\u0000\u0000\u04e1\u04e2\u0001\u0000\u0000\u0000\u04e2"+
		"\u04e4\u0001\u0000\u0000\u0000\u04e3\u04e5\u0003\u0018\f\u0000\u04e4\u04e3"+
		"\u0001\u0000\u0000\u0000\u04e4\u04e5\u0001\u0000\u0000\u0000\u04e5\u04e7"+
		"\u0001\u0000\u0000\u0000\u04e6\u04e8\u0003\u0018\f\u0000\u04e7\u04e6\u0001"+
		"\u0000\u0000\u0000\u04e7\u04e8\u0001\u0000\u0000\u0000\u04e8\u04ea\u0001"+
		"\u0000\u0000\u0000\u04e9\u04eb\u0003\u0018\f\u0000\u04ea\u04e9\u0001\u0000"+
		"\u0000\u0000\u04ea\u04eb\u0001\u0000\u0000\u0000\u04eb\u04ef\u0001\u0000"+
		"\u0000\u0000\u04ec\u04ee\u0003\u0018\f\u0000\u04ed\u04ec\u0001\u0000\u0000"+
		"\u0000\u04ee\u04f1\u0001\u0000\u0000\u0000\u04ef\u04ed\u0001\u0000\u0000"+
		"\u0000\u04ef\u04f0\u0001\u0000\u0000\u0000\u04f0\u04f2\u0001\u0000\u0000"+
		"\u0000\u04f1\u04ef\u0001\u0000\u0000\u0000\u04f2\u04f3\u0005\u0004\u0000"+
		"\u0000\u04f3\u04f4\u0005\u0005\u0000\u0000\u04f4\u04f5\u0005\u0003\u0000"+
		"\u0000\u04f5\u04f6\u0005\b\u0000\u0000\u04f6\u04f7\u0005\u0004\u0000\u0000"+
		"\u04f7\u04f8\u0006\u0005\uffff\uffff\u0000\u04f8\u0535\u0001\u0000\u0000"+
		"\u0000\u04f9\u04fa\u0005\n\u0000\u0000\u04fa\u04fb\u0005\u0003\u0000\u0000"+
		"\u04fb\u04fc\u0005\n\u0000\u0000\u04fc\u04fd\u0005\u0003\u0000\u0000\u04fd"+
		"\u04fe\u0005\n\u0000\u0000\u04fe\u04ff\u0005\u0003\u0000\u0000\u04ff\u0500"+
		"\u0005\n\u0000\u0000\u0500\u0501\u0005\u0003\u0000\u0000\u0501\u0502\u0005"+
		"\n\u0000\u0000\u0502\u0503\u0005\u0003\u0000\u0000\u0503\u0504\u0005\n"+
		"\u0000\u0000\u0504\u0505\u0005\u0003\u0000\u0000\u0505\u0506\u0005\n\u0000"+
		"\u0000\u0506\u0507\u0005\u0003\u0000\u0000\u0507\u0508\u0005\n\u0000\u0000"+
		"\u0508\u0509\u0005\u0003\u0000\u0000\u0509\u0531\u0005\u0004\u0000\u0000"+
		"\u050a\u050b\u0005\u0003\u0000\u0000\u050b\u050c\u0005\u0003\u0000\u0000"+
		"\u050c\u050d\u0005\u0003\u0000\u0000\u050d\u050e\u0005\u0003\u0000\u0000"+
		"\u050e\u050f\u0005\u0003\u0000\u0000\u050f\u0510\u0005\u0003\u0000\u0000"+
		"\u0510\u0511\u0005\u0003\u0000\u0000\u0511\u0512\u0005\u0003\u0000\u0000"+
		"\u0512\u0532\u0005\u0004\u0000\u0000\u0513\u0515\u0005\u0006\u0000\u0000"+
		"\u0514\u0513\u0001\u0000\u0000\u0000\u0514\u0515\u0001\u0000\u0000\u0000"+
		"\u0515\u0516\u0001\u0000\u0000\u0000\u0516\u0518\u0005\u0003\u0000\u0000"+
		"\u0517\u0519\u0005\b\u0000\u0000\u0518\u0517\u0001\u0000\u0000\u0000\u0518"+
		"\u0519\u0001\u0000\u0000\u0000\u0519\u051a\u0001\u0000\u0000\u0000\u051a"+
		"\u051c\u0005\u0003\u0000\u0000\u051b\u051d\u0005\b\u0000\u0000\u051c\u051b"+
		"\u0001\u0000\u0000\u0000\u051c\u051d\u0001\u0000\u0000\u0000\u051d\u051e"+
		"\u0001\u0000\u0000\u0000\u051e\u0520\u0005\u0003\u0000\u0000\u051f\u0521"+
		"\u0005\b\u0000\u0000\u0520\u051f\u0001\u0000\u0000\u0000\u0520\u0521\u0001"+
		"\u0000\u0000\u0000\u0521\u0522\u0001\u0000\u0000\u0000\u0522\u0524\u0005"+
		"\u0003\u0000\u0000\u0523\u0525\u0005\b\u0000\u0000\u0524\u0523\u0001\u0000"+
		"\u0000\u0000\u0524\u0525\u0001\u0000\u0000\u0000\u0525\u0526\u0001\u0000"+
		"\u0000\u0000\u0526\u0527\u0005\u0003\u0000\u0000\u0527\u0528\u0005\b\u0000"+
		"\u0000\u0528\u0529\u0005\u0003\u0000\u0000\u0529\u052a\u0005\b\u0000\u0000"+
		"\u052a\u052c\u0005\u0003\u0000\u0000\u052b\u052d\u0005\b\u0000\u0000\u052c"+
		"\u052b\u0001\u0000\u0000\u0000\u052c\u052d\u0001\u0000\u0000\u0000\u052d"+
		"\u052e\u0001\u0000\u0000\u0000\u052e\u052f\u0005\u0003\u0000\u0000\u052f"+
		"\u0530\u0005\u0004\u0000\u0000\u0530\u0532\u0006\u0005\uffff\uffff\u0000"+
		"\u0531\u050a\u0001\u0000\u0000\u0000\u0531\u0514\u0001\u0000\u0000\u0000"+
		"\u0532\u0533\u0001\u0000\u0000\u0000\u0533\u0531\u0001\u0000\u0000\u0000"+
		"\u0533\u0534\u0001\u0000\u0000\u0000\u0534\u0536\u0001\u0000\u0000\u0000"+
		"\u0535\u04f9\u0001\u0000\u0000\u0000\u0536\u0537\u0001\u0000\u0000\u0000"+
		"\u0537\u0535\u0001\u0000\u0000\u0000\u0537\u0538\u0001\u0000\u0000\u0000"+
		"\u0538\u0539\u0001\u0000\u0000\u0000\u0539\u053a\u0005\n\u0000\u0000\u053a"+
		"\u053b\u0005\u0003\u0000\u0000\u053b\u053c\u0005\n\u0000\u0000\u053c\u053d"+
		"\u0005\u0003\u0000\u0000\u053d\u053e\u0005\u0006\u0000\u0000\u053e\u053f"+
		"\u0005\u0004\u0000\u0000\u053f\u0541\u0001\u0000\u0000\u0000\u0540\u04b3"+
		"\u0001\u0000\u0000\u0000\u0541\u0542\u0001\u0000\u0000\u0000\u0542\u0540"+
		"\u0001\u0000\u0000\u0000\u0542\u0543\u0001\u0000\u0000\u0000\u0543\u0544"+
		"\u0001\u0000\u0000\u0000\u0544\u0545\u0005\u0005\u0000\u0000\u0545\u0546"+
		"\u0005\u0003\u0000\u0000\u0546\u0547\u0005\n\u0000\u0000\u0547\u0548\u0005"+
		"\n\u0000\u0000\u0548\u0549\u0005\u0003\u0000\u0000\u0549\u054a\u0005\n"+
		"\u0000\u0000\u054a\u054b\u0005\u0003\u0000\u0000\u054b\u054c\u0005\n\u0000"+
		"\u0000\u054c\u054d\u0005\u0003\u0000\u0000\u054d\u054e\u0005\n\u0000\u0000"+
		"\u054e\u054f\u0005\u0004\u0000\u0000\u054f\u000b\u0001\u0000\u0000\u0000"+
		"\u0550\u0551\u0005\u0005\u0000\u0000\u0551\u0552\u0005\u0003\u0000\u0000"+
		"\u0552\u0553\u0005\n\u0000\u0000\u0553\u0554\u0005\n\u0000\u0000\u0554"+
		"\u0555\u0005\u0003\u0000\u0000\u0555\u0556\u0005\n\u0000\u0000\u0556\u0557"+
		"\u0005\u0003\u0000\u0000\u0557\u0558\u0005\n\u0000\u0000\u0558\u0559\u0005"+
		"\u0003\u0000\u0000\u0559\u055a\u0005\n\u0000\u0000\u055a\u0599\u0005\u0004"+
		"\u0000\u0000\u055b\u055c\u0005\b\u0000\u0000\u055c\u055e\u0005\u0003\u0000"+
		"\u0000\u055d\u055f\u0003\u0018\f\u0000\u055e\u055d\u0001\u0000\u0000\u0000"+
		"\u055f\u0560\u0001\u0000\u0000\u0000\u0560\u055e\u0001\u0000\u0000\u0000"+
		"\u0560\u0561\u0001\u0000\u0000\u0000\u0561\u0562\u0001\u0000\u0000\u0000"+
		"\u0562\u058e\u0005\u0004\u0000\u0000\u0563\u0564\u0005\n\u0000\u0000\u0564"+
		"\u0565\u0005\u0003\u0000\u0000\u0565\u0566\u0005\n\u0000\u0000\u0566\u0567"+
		"\u0005\u0003\u0000\u0000\u0567\u0568\u0005\n\u0000\u0000\u0568\u0569\u0005"+
		"\u0003\u0000\u0000\u0569\u056a\u0005\n\u0000\u0000\u056a\u056b\u0005\u0003"+
		"\u0000\u0000\u056b\u056c\u0005\n\u0000\u0000\u056c\u056d\u0005\u0003\u0000"+
		"\u0000\u056d\u056e\u0005\n\u0000\u0000\u056e\u056f\u0005\u0003\u0000\u0000"+
		"\u056f\u0570\u0005\n\u0000\u0000\u0570\u0571\u0005\u0003\u0000\u0000\u0571"+
		"\u058a\u0005\u0004\u0000\u0000\u0572\u0573\u0005\u0003\u0000\u0000\u0573"+
		"\u0574\u0005\u0003\u0000\u0000\u0574\u0575\u0005\u0003\u0000\u0000\u0575"+
		"\u0576\u0005\u0003\u0000\u0000\u0576\u0577\u0005\u0003\u0000\u0000\u0577"+
		"\u0578\u0005\u0003\u0000\u0000\u0578\u0579\u0005\u0003\u0000\u0000\u0579"+
		"\u058b\u0005\u0004\u0000\u0000\u057a\u057b\u0005\u0006\u0000\u0000\u057b"+
		"\u057c\u0005\u0003\u0000\u0000\u057c\u057d\u0005\b\u0000\u0000\u057d\u057e"+
		"\u0005\u0003\u0000\u0000\u057e\u057f\u0005\b\u0000\u0000\u057f\u0580\u0005"+
		"\u0003\u0000\u0000\u0580\u0581\u0005\b\u0000\u0000\u0581\u0582\u0005\u0003"+
		"\u0000\u0000\u0582\u0583\u0005\b\u0000\u0000\u0583\u0584\u0005\u0003\u0000"+
		"\u0000\u0584\u0585\u0005\b\u0000\u0000\u0585\u0586\u0005\u0003\u0000\u0000"+
		"\u0586\u0587\u0005\b\u0000\u0000\u0587\u0588\u0005\u0003\u0000\u0000\u0588"+
		"\u0589\u0005\u0004\u0000\u0000\u0589\u058b\u0006\u0006\uffff\uffff\u0000"+
		"\u058a\u0572\u0001\u0000\u0000\u0000\u058a\u057a\u0001\u0000\u0000\u0000"+
		"\u058b\u058c\u0001\u0000\u0000\u0000\u058c\u058a\u0001\u0000\u0000\u0000"+
		"\u058c\u058d\u0001\u0000\u0000\u0000\u058d\u058f\u0001\u0000\u0000\u0000"+
		"\u058e\u0563\u0001\u0000\u0000\u0000\u058f\u0590\u0001\u0000\u0000\u0000"+
		"\u0590\u058e\u0001\u0000\u0000\u0000\u0590\u0591\u0001\u0000\u0000\u0000"+
		"\u0591\u0592\u0001\u0000\u0000\u0000\u0592\u0593\u0005\n\u0000\u0000\u0593"+
		"\u0594\u0005\u0003\u0000\u0000\u0594\u0595\u0005\n\u0000\u0000\u0595\u0596"+
		"\u0005\u0003\u0000\u0000\u0596\u0597\u0005\u0006\u0000\u0000\u0597\u0598"+
		"\u0005\u0004\u0000\u0000\u0598\u059a\u0001\u0000\u0000\u0000\u0599\u055b"+
		"\u0001\u0000\u0000\u0000\u059a\u059b\u0001\u0000\u0000\u0000\u059b\u0599"+
		"\u0001\u0000\u0000\u0000\u059b\u059c\u0001\u0000\u0000\u0000\u059c\u059d"+
		"\u0001\u0000\u0000\u0000\u059d\u059e\u0005\u0005\u0000\u0000\u059e\u059f"+
		"\u0005\u0003\u0000\u0000\u059f\u05a0\u0005\n\u0000\u0000\u05a0\u05a1\u0005"+
		"\n\u0000\u0000\u05a1\u05a2\u0005\u0003\u0000\u0000\u05a2\u05a3\u0005\n"+
		"\u0000\u0000\u05a3\u05a4\u0005\u0003\u0000\u0000\u05a4\u05a5\u0005\n\u0000"+
		"\u0000\u05a5\u05a6\u0005\u0003\u0000\u0000\u05a6\u05a7\u0005\n\u0000\u0000"+
		"\u05a7\u05a8\u0005\u0004\u0000\u0000\u05a8\r\u0001\u0000\u0000\u0000\u05a9"+
		"\u05aa\u0005\u0005\u0000\u0000\u05aa\u05ab\u0005\u0003\u0000\u0000\u05ab"+
		"\u05ac\u0005\n\u0000\u0000\u05ac\u05ad\u0005\n\u0000\u0000\u05ad\u05ae"+
		"\u0005\u0003\u0000\u0000\u05ae\u05af\u0005\n\u0000\u0000\u05af\u05b0\u0005"+
		"\u0003\u0000\u0000\u05b0\u05b1\u0005\n\u0000\u0000\u05b1\u05b2\u0005\u0003"+
		"\u0000\u0000\u05b2\u05b3\u0005\n\u0000\u0000\u05b3\u05ed\u0005\u0004\u0000"+
		"\u0000\u05b4\u05b5\u0005\u0005\u0000\u0000\u05b5\u05b6\u0005\u0003\u0000"+
		"\u0000\u05b6\u05b7\u0005\b\u0000\u0000\u05b7\u05b8\u0005\u0003\u0000\u0000"+
		"\u05b8\u05b9\u0005\n\u0000\u0000\u05b9\u05ba\u0005\u0003\u0000\u0000\u05ba"+
		"\u05bc\u0003\u0018\f\u0000\u05bb\u05bd\u0003\u0018\f\u0000\u05bc\u05bb"+
		"\u0001\u0000\u0000\u0000\u05bc\u05bd\u0001\u0000\u0000\u0000\u05bd\u05bf"+
		"\u0001\u0000\u0000\u0000\u05be\u05c0\u0003\u0018\f\u0000\u05bf\u05be\u0001"+
		"\u0000\u0000\u0000\u05bf\u05c0\u0001\u0000\u0000\u0000\u05c0\u05c2\u0001"+
		"\u0000\u0000\u0000\u05c1\u05c3\u0003\u0018\f\u0000\u05c2\u05c1\u0001\u0000"+
		"\u0000\u0000\u05c2\u05c3\u0001\u0000\u0000\u0000\u05c3\u05c5\u0001\u0000"+
		"\u0000\u0000\u05c4\u05c6\u0003\u0018\f\u0000\u05c5\u05c4\u0001\u0000\u0000"+
		"\u0000\u05c5\u05c6\u0001\u0000\u0000\u0000\u05c6\u05c8\u0001\u0000\u0000"+
		"\u0000\u05c7\u05c9\u0003\u0018\f\u0000\u05c8\u05c7\u0001\u0000\u0000\u0000"+
		"\u05c8\u05c9\u0001\u0000\u0000\u0000\u05c9\u05cb\u0001\u0000\u0000\u0000"+
		"\u05ca\u05cc\u0003\u0018\f\u0000\u05cb\u05ca\u0001\u0000\u0000\u0000\u05cb"+
		"\u05cc\u0001\u0000\u0000\u0000\u05cc\u05d0\u0001\u0000\u0000\u0000\u05cd"+
		"\u05cf\u0003\u0018\f\u0000\u05ce\u05cd\u0001\u0000\u0000\u0000\u05cf\u05d2"+
		"\u0001\u0000\u0000\u0000\u05d0\u05ce\u0001\u0000\u0000\u0000\u05d0\u05d1"+
		"\u0001\u0000\u0000\u0000\u05d1\u05d3\u0001\u0000\u0000\u0000\u05d2\u05d0"+
		"\u0001\u0000\u0000\u0000\u05d3\u05d4\u0005\u0004\u0000\u0000\u05d4\u05d5"+
		"\u0005\u0005\u0000\u0000\u05d5\u05d6\u0005\u0003\u0000\u0000\u05d6\u05d7"+
		"\u0005\t\u0000\u0000\u05d7\u05d8\u0005\u0004\u0000\u0000\u05d8\u05d9\u0005"+
		"\u0005\u0000\u0000\u05d9\u05da\u0005\u0003\u0000\u0000\u05da\u05db\u0005"+
		"\t\u0000\u0000\u05db\u05dc\u0005\u0004\u0000\u0000\u05dc\u05dd\u0005\u0005"+
		"\u0000\u0000\u05dd\u05de\u0005\u0003\u0000\u0000\u05de\u05df\u0005\b\u0000"+
		"\u0000\u05df\u05e0\u0005\n\u0000\u0000\u05e0\u05e1\u0005\u0004\u0000\u0000"+
		"\u05e1\u05e2\u0005\u0005\u0000\u0000\u05e2\u05e3\u0005\u0003\u0000\u0000"+
		"\u05e3\u05e4\u0005\u0006\u0000\u0000\u05e4\u05e5\u0005\u0004\u0000\u0000"+
		"\u05e5\u05e6\u0005\n\u0000\u0000\u05e6\u05e7\u0005\u0003\u0000\u0000\u05e7"+
		"\u05e8\u0005\n\u0000\u0000\u05e8\u05e9\u0005\u0003\u0000\u0000\u05e9\u05ea"+
		"\u0005\u0006\u0000\u0000\u05ea\u05eb\u0005\u0004\u0000\u0000\u05eb\u05ec"+
		"\u0006\u0007\uffff\uffff\u0000\u05ec\u05ee\u0001\u0000\u0000\u0000\u05ed"+
		"\u05b4\u0001\u0000\u0000\u0000\u05ee\u05ef\u0001\u0000\u0000\u0000\u05ef"+
		"\u05ed\u0001\u0000\u0000\u0000\u05ef\u05f0\u0001\u0000\u0000\u0000\u05f0"+
		"\u05f1\u0001\u0000\u0000\u0000\u05f1\u05f2\u0005\u0005\u0000\u0000\u05f2"+
		"\u05f3\u0005\u0003\u0000\u0000\u05f3\u05f4\u0005\n\u0000\u0000\u05f4\u05f5"+
		"\u0005\n\u0000\u0000\u05f5\u05f6\u0005\u0003\u0000\u0000\u05f6\u05f7\u0005"+
		"\n\u0000\u0000\u05f7\u05f8\u0005\u0003\u0000\u0000\u05f8\u05f9\u0005\n"+
		"\u0000\u0000\u05f9\u05fa\u0005\u0003\u0000\u0000\u05fa\u05fb\u0005\n\u0000"+
		"\u0000\u05fb\u05fc\u0005\u0004\u0000\u0000\u05fc\u000f\u0001\u0000\u0000"+
		"\u0000\u05fd\u05fe\u0005\u0005\u0000\u0000\u05fe\u05ff\u0005\u0003\u0000"+
		"\u0000\u05ff\u0600\u0005\n\u0000\u0000\u0600\u0601\u0005\u0003\u0000\u0000"+
		"\u0601\u0602\u0005\n\u0000\u0000\u0602\u0603\u0005\n\u0000\u0000\u0603"+
		"\u0604\u0005\n\u0000\u0000\u0604\u0605\u0005\u0003\u0000\u0000\u0605\u0606"+
		"\u0005\n\u0000\u0000\u0606\u0607\u0005\u0003\u0000\u0000\u0607\u0608\u0005"+
		"\n\u0000\u0000\u0608\u064d\u0005\u0004\u0000\u0000\u0609\u060a\u0005\n"+
		"\u0000\u0000\u060a\u060b\u0005\u0003\u0000\u0000\u060b\u060c\u0005\u0004"+
		"\u0000\u0000\u060c\u060d\u0005\n\u0000\u0000\u060d\u060e\u0005\u0003\u0000"+
		"\u0000\u060e\u060f\u0005\n\u0000\u0000\u060f\u0610\u0005\u0003\u0000\u0000"+
		"\u0610\u0611\u0005\n\u0000\u0000\u0611\u0612\u0005\u0003\u0000\u0000\u0612"+
		"\u0613\u0005\n\u0000\u0000\u0613\u0614\u0005\u0003\u0000\u0000\u0614\u0615"+
		"\u0005\n\u0000\u0000\u0615\u0616\u0005\u0003\u0000\u0000\u0616\u0617\u0005"+
		"\n\u0000\u0000\u0617\u0618\u0005\u0003\u0000\u0000\u0618\u0619\u0005\n"+
		"\u0000\u0000\u0619\u061a\u0005\u0003\u0000\u0000\u061a\u061b\u0005\n\u0000"+
		"\u0000\u061b\u061c\u0005\u0003\u0000\u0000\u061c\u061d\u0005\n\u0000\u0000"+
		"\u061d\u061e\u0005\u0003\u0000\u0000\u061e\u061f\u0005\n\u0000\u0000\u061f"+
		"\u0620\u0005\u0003\u0000\u0000\u0620\u0621\u0005\n\u0000\u0000\u0621\u0622"+
		"\u0005\u0003\u0000\u0000\u0622\u0642\u0005\u0004\u0000\u0000\u0623\u0624"+
		"\u0005\n\u0000\u0000\u0624\u0625\u0005\u0003\u0000\u0000\u0625\u0626\u0005"+
		"\b\u0000\u0000\u0626\u0628\u0005\u0003\u0000\u0000\u0627\u0629\u0005\b"+
		"\u0000\u0000\u0628\u0627\u0001\u0000\u0000\u0000\u0628\u0629\u0001\u0000"+
		"\u0000\u0000\u0629\u062a\u0001\u0000\u0000\u0000\u062a\u062c\u0005\u0003"+
		"\u0000\u0000\u062b\u062d\u0003\u0018\f\u0000\u062c\u062b\u0001\u0000\u0000"+
		"\u0000\u062d\u062e\u0001\u0000\u0000\u0000\u062e\u062c\u0001\u0000\u0000"+
		"\u0000\u062e\u062f\u0001\u0000\u0000\u0000\u062f\u0630\u0001\u0000\u0000"+
		"\u0000\u0630\u0631\u0005\u0003\u0000\u0000\u0631\u0632\u0005\n\u0000\u0000"+
		"\u0632\u0633\u0005\u0003\u0000\u0000\u0633\u0634\u0005\n\u0000\u0000\u0634"+
		"\u0635\u0005\u0003\u0000\u0000\u0635\u0636\u0005\b\u0000\u0000\u0636\u0637"+
		"\u0005\u0003\u0000\u0000\u0637\u0638\u0005\b\u0000\u0000\u0638\u0639\u0005"+
		"\u0003\u0000\u0000\u0639\u063a\u0005\b\u0000\u0000\u063a\u063b\u0005\u0003"+
		"\u0000\u0000\u063b\u063c\u0005\b\u0000\u0000\u063c\u063d\u0005\u0003\u0000"+
		"\u0000\u063d\u063e\u0005\b\u0000\u0000\u063e\u063f\u0005\u0003\u0000\u0000"+
		"\u063f\u0640\u0005\u0004\u0000\u0000\u0640\u0641\u0006\b\uffff\uffff\u0000"+
		"\u0641\u0643\u0001\u0000\u0000\u0000\u0642\u0623\u0001\u0000\u0000\u0000"+
		"\u0643\u0644\u0001\u0000\u0000\u0000\u0644\u0642\u0001\u0000\u0000\u0000"+
		"\u0644\u0645\u0001\u0000\u0000\u0000\u0645\u0646\u0001\u0000\u0000\u0000"+
		"\u0646\u0647\u0005\n\u0000\u0000\u0647\u0648\u0005\u0003\u0000\u0000\u0648"+
		"\u0649\u0005\n\u0000\u0000\u0649\u064a\u0005\u0003\u0000\u0000\u064a\u064b"+
		"\u0005\u0006\u0000\u0000\u064b\u064c\u0005\u0004\u0000\u0000\u064c\u064e"+
		"\u0001\u0000\u0000\u0000\u064d\u0609\u0001\u0000\u0000\u0000\u064e\u064f"+
		"\u0001\u0000\u0000\u0000\u064f\u064d\u0001\u0000\u0000\u0000\u064f\u0650"+
		"\u0001\u0000\u0000\u0000\u0650\u0651\u0001\u0000\u0000\u0000\u0651\u0652"+
		"\u0005\u0005\u0000\u0000\u0652\u0653\u0005\u0003\u0000\u0000\u0653\u0654"+
		"\u0005\n\u0000\u0000\u0654\u0655\u0005\u0003\u0000\u0000\u0655\u0656\u0005"+
		"\n\u0000\u0000\u0656\u0657\u0005\n\u0000\u0000\u0657\u0658\u0005\n\u0000"+
		"\u0000\u0658\u0659\u0005\u0003\u0000\u0000\u0659\u065a\u0005\n\u0000\u0000"+
		"\u065a\u065b\u0005\u0003\u0000\u0000\u065b\u065c\u0005\n\u0000\u0000\u065c"+
		"\u065d\u0005\u0004\u0000\u0000\u065d\u0011\u0001\u0000\u0000\u0000\u065e"+
		"\u065f\u0005\u0005\u0000\u0000\u065f\u0660\u0005\u0003\u0000\u0000\u0660"+
		"\u0661\u0005\n\u0000\u0000\u0661\u0662\u0005\n\u0000\u0000\u0662\u0663"+
		"\u0005\u0003\u0000\u0000\u0663\u0664\u0005\n\u0000\u0000\u0664\u0665\u0005"+
		"\u0003\u0000\u0000\u0665\u0666\u0005\n\u0000\u0000\u0666\u06b8\u0005\u0004"+
		"\u0000\u0000\u0667\u0668\u0005\u0005\u0000\u0000\u0668\u0669\u0005\u0003"+
		"\u0000\u0000\u0669\u066a\u0005\b\u0000\u0000\u066a\u066e\u0005\u0003\u0000"+
		"\u0000\u066b\u066d\u0003\u0018\f\u0000\u066c\u066b\u0001\u0000\u0000\u0000"+
		"\u066d\u0670\u0001\u0000\u0000\u0000\u066e\u066c\u0001\u0000\u0000\u0000"+
		"\u066e\u066f\u0001\u0000\u0000\u0000\u066f\u0671\u0001\u0000\u0000\u0000"+
		"\u0670\u066e\u0001\u0000\u0000\u0000\u0671\u0672\u0005\u0004\u0000\u0000"+
		"\u0672\u0674\u0003\u0018\f\u0000\u0673\u0675\u0003\u0018\f\u0000\u0674"+
		"\u0673\u0001\u0000\u0000\u0000\u0674\u0675\u0001\u0000\u0000\u0000\u0675"+
		"\u0677\u0001\u0000\u0000\u0000\u0676\u0678\u0003\u0018\f\u0000\u0677\u0676"+
		"\u0001\u0000\u0000\u0000\u0677\u0678\u0001\u0000\u0000\u0000\u0678\u067a"+
		"\u0001\u0000\u0000\u0000\u0679\u067b\u0003\u0018\f\u0000\u067a\u0679\u0001"+
		"\u0000\u0000\u0000\u067a\u067b\u0001\u0000\u0000\u0000\u067b\u067d\u0001"+
		"\u0000\u0000\u0000\u067c\u067e\u0003\u0018\f\u0000\u067d\u067c\u0001\u0000"+
		"\u0000\u0000\u067d\u067e\u0001\u0000\u0000\u0000\u067e\u0680\u0001\u0000"+
		"\u0000\u0000\u067f\u0681\u0003\u0018\f\u0000\u0680\u067f\u0001\u0000\u0000"+
		"\u0000\u0680\u0681\u0001\u0000\u0000\u0000\u0681\u0683\u0001\u0000\u0000"+
		"\u0000\u0682\u0684\u0003\u0018\f\u0000\u0683\u0682\u0001\u0000\u0000\u0000"+
		"\u0683\u0684\u0001\u0000\u0000\u0000\u0684\u0688\u0001\u0000\u0000\u0000"+
		"\u0685\u0687\u0003\u0018\f\u0000\u0686\u0685\u0001\u0000\u0000\u0000\u0687"+
		"\u068a\u0001\u0000\u0000\u0000\u0688\u0686\u0001\u0000\u0000\u0000\u0688"+
		"\u0689\u0001\u0000\u0000\u0000\u0689\u068b\u0001\u0000\u0000\u0000\u068a"+
		"\u0688\u0001\u0000\u0000\u0000\u068b\u068c\u0005\u0004\u0000\u0000\u068c"+
		"\u068e\u0003\u0018\f\u0000\u068d\u068f\u0003\u0018\f\u0000\u068e\u068d"+
		"\u0001\u0000\u0000\u0000\u068e\u068f\u0001\u0000\u0000\u0000\u068f\u0691"+
		"\u0001\u0000\u0000\u0000\u0690\u0692\u0003\u0018\f\u0000\u0691\u0690\u0001"+
		"\u0000\u0000\u0000\u0691\u0692\u0001\u0000\u0000\u0000\u0692\u0694\u0001"+
		"\u0000\u0000\u0000\u0693\u0695\u0003\u0018\f\u0000\u0694\u0693\u0001\u0000"+
		"\u0000\u0000\u0694\u0695\u0001\u0000\u0000\u0000\u0695\u0697\u0001\u0000"+
		"\u0000\u0000\u0696\u0698\u0003\u0018\f\u0000\u0697\u0696\u0001\u0000\u0000"+
		"\u0000\u0697\u0698\u0001\u0000\u0000\u0000\u0698\u069a\u0001\u0000\u0000"+
		"\u0000\u0699\u069b\u0003\u0018\f\u0000\u069a\u0699\u0001\u0000\u0000\u0000"+
		"\u069a\u069b\u0001\u0000\u0000\u0000\u069b\u069d\u0001\u0000\u0000\u0000"+
		"\u069c\u069e\u0003\u0018\f\u0000\u069d\u069c\u0001\u0000\u0000\u0000\u069d"+
		"\u069e\u0001\u0000\u0000\u0000\u069e\u06a2\u0001\u0000\u0000\u0000\u069f"+
		"\u06a1\u0003\u0018\f\u0000\u06a0\u069f\u0001\u0000\u0000\u0000\u06a1\u06a4"+
		"\u0001\u0000\u0000\u0000\u06a2\u06a0\u0001\u0000\u0000\u0000\u06a2\u06a3"+
		"\u0001\u0000\u0000\u0000\u06a3\u06a5\u0001\u0000\u0000\u0000\u06a4\u06a2"+
		"\u0001\u0000\u0000\u0000\u06a5\u06a6\u0005\u0004\u0000\u0000\u06a6\u06aa"+
		"\u0005\u0006\u0000\u0000\u06a7\u06a9\u0005\n\u0000\u0000\u06a8\u06a7\u0001"+
		"\u0000\u0000\u0000\u06a9\u06ac\u0001\u0000\u0000\u0000\u06aa\u06a8\u0001"+
		"\u0000\u0000\u0000\u06aa\u06ab\u0001\u0000\u0000\u0000\u06ab\u06ad\u0001"+
		"\u0000\u0000\u0000\u06ac\u06aa\u0001\u0000\u0000\u0000\u06ad\u06ae\u0005"+
		"\u0004\u0000\u0000\u06ae\u06af\u0003\u0018\f\u0000\u06af\u06b0\u0005\u0004"+
		"\u0000\u0000\u06b0\u06b1\u0005\n\u0000\u0000\u06b1\u06b2\u0005\u0003\u0000"+
		"\u0000\u06b2\u06b3\u0005\n\u0000\u0000\u06b3\u06b4\u0005\u0003\u0000\u0000"+
		"\u06b4\u06b5\u0005\u0006\u0000\u0000\u06b5\u06b6\u0005\u0004\u0000\u0000"+
		"\u06b6\u06b7\u0006\t\uffff\uffff\u0000\u06b7\u06b9\u0001\u0000\u0000\u0000"+
		"\u06b8\u0667\u0001\u0000\u0000\u0000\u06b9\u06ba\u0001\u0000\u0000\u0000"+
		"\u06ba\u06b8\u0001\u0000\u0000\u0000\u06ba\u06bb\u0001\u0000\u0000\u0000"+
		"\u06bb\u06bc\u0001\u0000\u0000\u0000\u06bc\u06bd\u0005\u0005\u0000\u0000"+
		"\u06bd\u06be\u0005\u0003\u0000\u0000\u06be\u06bf\u0005\n\u0000\u0000\u06bf"+
		"\u06c0\u0005\n\u0000\u0000\u06c0\u06c1\u0005\u0003\u0000\u0000\u06c1\u06c2"+
		"\u0005\n\u0000\u0000\u06c2\u06c3\u0005\u0003\u0000\u0000\u06c3\u06c4\u0005"+
		"\n\u0000\u0000\u06c4\u06c5\u0005\u0004\u0000\u0000\u06c5\u0013\u0001\u0000"+
		"\u0000\u0000\u06c6\u06c7\u0005\u0005\u0000\u0000\u06c7\u06c8\u0005\u0003"+
		"\u0000\u0000\u06c8\u06c9\u0005\n\u0000\u0000\u06c9\u06ca\u0005\n\u0000"+
		"\u0000\u06ca\u06cb\u0005\n\u0000\u0000\u06cb\u06cc\u0005\u0003\u0000\u0000"+
		"\u06cc\u06cd\u0005\n\u0000\u0000\u06cd\u06ce\u0005\n\u0000\u0000\u06ce"+
		"\u06cf\u0005\n\u0000\u0000\u06cf\u06d0\u0005\u0003\u0000\u0000\u06d0\u06d1"+
		"\u0005\n\u0000\u0000\u06d1\u06d2\u0005\u0003\u0000\u0000\u06d2\u06d3\u0005"+
		"\n\u0000\u0000\u06d3\u0742\u0005\u0004\u0000\u0000\u06d4\u06d5\u0005\u0005"+
		"\u0000\u0000\u06d5\u06d6\u0005\u0003\u0000\u0000\u06d6\u06d7\u0005\b\u0000"+
		"\u0000\u06d7\u06d8\u0005\u0004\u0000\u0000\u06d8\u06d9\u0005\n\u0000\u0000"+
		"\u06d9\u06db\u0005\u0003\u0000\u0000\u06da\u06dc\u0005\n\u0000\u0000\u06db"+
		"\u06da\u0001\u0000\u0000\u0000\u06db\u06dc\u0001\u0000\u0000\u0000\u06dc"+
		"\u06dd\u0001\u0000\u0000\u0000\u06dd\u06de\u0005\u0003\u0000\u0000\u06de"+
		"\u06df\u0005\n\u0000\u0000\u06df\u06e0\u0005\u0003\u0000\u0000\u06e0\u06e1"+
		"\u0005\n\u0000\u0000\u06e1\u06e2\u0005\u0003\u0000\u0000\u06e2\u06e3\u0005"+
		"\n\u0000\u0000\u06e3\u06e4\u0005\u0003\u0000\u0000\u06e4\u06e5\u0005\n"+
		"\u0000\u0000\u06e5\u06e6\u0005\u0003\u0000\u0000\u06e6\u06e7\u0005\n\u0000"+
		"\u0000\u06e7\u06e8\u0005\u0003\u0000\u0000\u06e8\u06e9\u0005\n\u0000\u0000"+
		"\u06e9\u06ea\u0005\u0003\u0000\u0000\u06ea\u06eb\u0005\n\u0000\u0000\u06eb"+
		"\u06ec\u0005\u0003\u0000\u0000\u06ec\u06ed\u0005\n\u0000\u0000\u06ed\u06ee"+
		"\u0005\u0003\u0000\u0000\u06ee\u0738\u0005\u0004\u0000\u0000\u06ef\u06f0"+
		"\u0005\u0003\u0000\u0000\u06f0\u06f1\u0005\u0003\u0000\u0000\u06f1\u06f2"+
		"\u0005\u0003\u0000\u0000\u06f2\u06f3\u0005\u0003\u0000\u0000\u06f3\u06f4"+
		"\u0005\u0003\u0000\u0000\u06f4\u06f5\u0005\u0003\u0000\u0000\u06f5\u06f6"+
		"\u0005\u0003\u0000\u0000\u06f6\u06f7\u0005\u0003\u0000\u0000\u06f7\u06f8"+
		"\u0005\u0003\u0000\u0000\u06f8\u06f9\u0005\u0003\u0000\u0000\u06f9\u0739"+
		"\u0005\u0004\u0000\u0000\u06fa\u06fc\u0003\u0018\f\u0000\u06fb\u06fd\u0003"+
		"\u0018\f\u0000\u06fc\u06fb\u0001\u0000\u0000\u0000\u06fc\u06fd\u0001\u0000"+
		"\u0000\u0000\u06fd\u06ff\u0001\u0000\u0000\u0000\u06fe\u0700\u0003\u0018"+
		"\f\u0000\u06ff\u06fe\u0001\u0000\u0000\u0000\u06ff\u0700\u0001\u0000\u0000"+
		"\u0000\u0700\u0702\u0001\u0000\u0000\u0000\u0701\u0703\u0003\u0018\f\u0000"+
		"\u0702\u0701\u0001\u0000\u0000\u0000\u0702\u0703\u0001\u0000\u0000\u0000"+
		"\u0703\u0705\u0001\u0000\u0000\u0000\u0704\u0706\u0003\u0018\f\u0000\u0705"+
		"\u0704\u0001\u0000\u0000\u0000\u0705\u0706\u0001\u0000\u0000\u0000\u0706"+
		"\u0708\u0001\u0000\u0000\u0000\u0707\u0709\u0003\u0018\f\u0000\u0708\u0707"+
		"\u0001\u0000\u0000\u0000\u0708\u0709\u0001\u0000\u0000\u0000\u0709\u070b"+
		"\u0001\u0000\u0000\u0000\u070a\u070c\u0003\u0018\f\u0000\u070b\u070a\u0001"+
		"\u0000\u0000\u0000\u070b\u070c\u0001\u0000\u0000\u0000\u070c\u0710\u0001"+
		"\u0000\u0000\u0000\u070d\u070f\u0003\u0018\f\u0000\u070e\u070d\u0001\u0000"+
		"\u0000\u0000\u070f\u0712\u0001\u0000\u0000\u0000\u0710\u070e\u0001\u0000"+
		"\u0000\u0000\u0710\u0711\u0001\u0000\u0000\u0000\u0711\u0713\u0001\u0000"+
		"\u0000\u0000\u0712\u0710\u0001\u0000\u0000\u0000\u0713\u0715\u0005\u0003"+
		"\u0000\u0000\u0714\u0716\u0005\n\u0000\u0000\u0715\u0714\u0001\u0000\u0000"+
		"\u0000\u0715\u0716\u0001\u0000\u0000\u0000\u0716\u0717\u0001\u0000\u0000"+
		"\u0000\u0717\u0718\u0005\u0003\u0000\u0000\u0718\u0719\u0005\n\u0000\u0000"+
		"\u0719\u071d\u0005\u0003\u0000\u0000\u071a\u071c\u0003\u0018\f\u0000\u071b"+
		"\u071a\u0001\u0000\u0000\u0000\u071c\u071f\u0001\u0000\u0000\u0000\u071d"+
		"\u071b\u0001\u0000\u0000\u0000\u071d\u071e\u0001\u0000\u0000\u0000\u071e"+
		"\u0720\u0001\u0000\u0000\u0000\u071f\u071d\u0001\u0000\u0000\u0000\u0720"+
		"\u0722\u0005\u0003\u0000\u0000\u0721\u0723\u0005\u0006\u0000\u0000\u0722"+
		"\u0721\u0001\u0000\u0000\u0000\u0722\u0723\u0001\u0000\u0000\u0000\u0723"+
		"\u0724\u0001\u0000\u0000\u0000\u0724\u0725\u0005\u0003\u0000\u0000\u0725"+
		"\u0726\u0005\u0006\u0000\u0000\u0726\u0728\u0005\u0003\u0000\u0000\u0727"+
		"\u0729\u0005\n\u0000\u0000\u0728\u0727\u0001\u0000\u0000\u0000\u0728\u0729"+
		"\u0001\u0000\u0000\u0000\u0729\u072a\u0001\u0000\u0000\u0000\u072a\u072b"+
		"\u0005\u0003\u0000\u0000\u072b\u072c\u0005\b\u0000\u0000\u072c\u072e\u0005"+
		"\u0003\u0000\u0000\u072d\u072f\u0005\b\u0000\u0000\u072e\u072d\u0001\u0000"+
		"\u0000\u0000\u072e\u072f\u0001\u0000\u0000\u0000\u072f\u0730\u0001\u0000"+
		"\u0000\u0000\u0730\u0732\u0005\u0003\u0000\u0000\u0731\u0733\u0005\b\u0000"+
		"\u0000\u0732\u0731\u0001\u0000\u0000\u0000\u0732\u0733\u0001\u0000\u0000"+
		"\u0000\u0733\u0734\u0001\u0000\u0000\u0000\u0734\u0735\u0005\u0003\u0000"+
		"\u0000\u0735\u0736\u0005\u0004\u0000\u0000\u0736\u0737\u0006\n\uffff\uffff"+
		"\u0000\u0737\u0739\u0001\u0000\u0000\u0000\u0738\u06ef\u0001\u0000\u0000"+
		"\u0000\u0738\u06fa\u0001\u0000\u0000\u0000\u0739\u073a\u0001\u0000\u0000"+
		"\u0000\u073a\u0738\u0001\u0000\u0000\u0000\u073a\u073b\u0001\u0000\u0000"+
		"\u0000\u073b\u073c\u0001\u0000\u0000\u0000\u073c\u073d\u0005\n\u0000\u0000"+
		"\u073d\u073e\u0005\u0003\u0000\u0000\u073e\u073f\u0005\n\u0000\u0000\u073f"+
		"\u0740\u0005\u0003\u0000\u0000\u0740\u0741\u0005\u0006\u0000\u0000\u0741"+
		"\u0743\u0005\u0004\u0000\u0000\u0742\u06d4\u0001\u0000\u0000\u0000\u0743"+
		"\u0744\u0001\u0000\u0000\u0000\u0744\u0742\u0001\u0000\u0000\u0000\u0744"+
		"\u0745\u0001\u0000\u0000\u0000\u0745\u0746\u0001\u0000\u0000\u0000\u0746"+
		"\u0747\u0005\u0005\u0000\u0000\u0747\u0748\u0005\u0003\u0000\u0000\u0748"+
		"\u0749\u0005\n\u0000\u0000\u0749\u074a\u0005\n\u0000\u0000\u074a\u074b"+
		"\u0005\n\u0000\u0000\u074b\u074c\u0005\u0003\u0000\u0000\u074c\u074d\u0005"+
		"\n\u0000\u0000\u074d\u074e\u0005\n\u0000\u0000\u074e\u074f\u0005\n\u0000"+
		"\u0000\u074f\u0750\u0005\u0003\u0000\u0000\u0750\u0751\u0005\n\u0000\u0000"+
		"\u0751\u0752\u0005\u0003\u0000\u0000\u0752\u0753\u0005\n\u0000\u0000\u0753"+
		"\u0754\u0005\u0004\u0000\u0000\u0754\u0015\u0001\u0000\u0000\u0000\u0755"+
		"\u0756\u0005\u0005\u0000\u0000\u0756\u0757\u0005\u0003\u0000\u0000\u0757"+
		"\u0758\u0005\n\u0000\u0000\u0758\u0759\u0005\u0003\u0000\u0000\u0759\u075a"+
		"\u0005\n\u0000\u0000\u075a\u075b\u0005\n\u0000\u0000\u075b\u075c\u0005"+
		"\n\u0000\u0000\u075c\u075d\u0005\u0003\u0000\u0000\u075d\u075e\u0005\n"+
		"\u0000\u0000\u075e\u075f\u0005\u0003\u0000\u0000\u075f\u0760\u0005\n\u0000"+
		"\u0000\u0760\u07df\u0005\u0004\u0000\u0000\u0761\u0762\u0005\n\u0000\u0000"+
		"\u0762\u0763\u0005\u0003\u0000\u0000\u0763\u0764\u0005\n\u0000\u0000\u0764"+
		"\u0765\u0005\u0004\u0000\u0000\u0765\u0766\u0005\n\u0000\u0000\u0766\u0767"+
		"\u0005\u0003\u0000\u0000\u0767\u0768\u0005\n\u0000\u0000\u0768\u0769\u0005"+
		"\u0004\u0000\u0000\u0769\u076a\u0005\n\u0000\u0000\u076a\u076b\u0005\u0003"+
		"\u0000\u0000\u076b\u076c\u0005\n\u0000\u0000\u076c\u076d\u0005\u0003\u0000"+
		"\u0000\u076d\u076e\u0005\n\u0000\u0000\u076e\u076f\u0005\u0003\u0000\u0000"+
		"\u076f\u0770\u0005\n\u0000\u0000\u0770\u0771\u0005\u0003\u0000\u0000\u0771"+
		"\u0772\u0005\n\u0000\u0000\u0772\u0773\u0005\u0003\u0000\u0000\u0773\u0774"+
		"\u0005\n\u0000\u0000\u0774\u0775\u0005\u0003\u0000\u0000\u0775\u0776\u0005"+
		"\n\u0000\u0000\u0776\u0777\u0005\u0003\u0000\u0000\u0777\u0778\u0005\n"+
		"\u0000\u0000\u0778\u0779\u0005\u0003\u0000\u0000\u0779\u077a\u0005\n\u0000"+
		"\u0000\u077a\u077b\u0005\u0003\u0000\u0000\u077b\u077c\u0005\n\u0000\u0000"+
		"\u077c\u077d\u0005\u0003\u0000\u0000\u077d\u077e\u0005\n\u0000\u0000\u077e"+
		"\u077f\u0005\u0003\u0000\u0000\u077f\u0780\u0005\n\u0000\u0000\u0780\u0781"+
		"\u0005\u0003\u0000\u0000\u0781\u0782\u0005\u0004\u0000\u0000\u0782\u0783"+
		"\u0005\n\u0000\u0000\u0783\u0784\u0005\u0003\u0000\u0000\u0784\u0785\u0005"+
		"\n\u0000\u0000\u0785\u0786\u0005\u0003\u0000\u0000\u0786\u0787\u0005\n"+
		"\u0000\u0000\u0787\u0788\u0005\u0003\u0000\u0000\u0788\u0789\u0005\n\u0000"+
		"\u0000\u0789\u078a\u0005\u0003\u0000\u0000\u078a\u078b\u0005\n\u0000\u0000"+
		"\u078b\u078c\u0005\u0003\u0000\u0000\u078c\u078d\u0005\n\u0000\u0000\u078d"+
		"\u078e\u0005\u0003\u0000\u0000\u078e\u07d1\u0005\u0004\u0000\u0000\u078f"+
		"\u0790\u0005\u0003\u0000\u0000\u0790\u0791\u0005\u0003\u0000\u0000\u0791"+
		"\u0792\u0005\u0003\u0000\u0000\u0792\u0793\u0005\u0003\u0000\u0000\u0793"+
		"\u0794\u0005\u0003\u0000\u0000\u0794\u0795\u0005\u0003\u0000\u0000\u0795"+
		"\u0796\u0005\u0003\u0000\u0000\u0796\u0797\u0005\u0003\u0000\u0000\u0797"+
		"\u0798\u0005\u0003\u0000\u0000\u0798\u0799\u0005\u0003\u0000\u0000\u0799"+
		"\u079a\u0005\u0003\u0000\u0000\u079a\u079b\u0005\u0003\u0000\u0000\u079b"+
		"\u079c\u0005\u0003\u0000\u0000\u079c\u079d\u0005\u0003\u0000\u0000\u079d"+
		"\u079e\u0005\u0003\u0000\u0000\u079e\u079f\u0005\u0003\u0000\u0000\u079f"+
		"\u07a0\u0005\u0003\u0000\u0000\u07a0\u07d2\u0005\u0004\u0000\u0000\u07a1"+
		"\u07a2\u0005\u0006\u0000\u0000\u07a2\u07a4\u0005\u0003\u0000\u0000\u07a3"+
		"\u07a5\u0005\u0006\u0000\u0000\u07a4\u07a3\u0001\u0000\u0000\u0000\u07a4"+
		"\u07a5\u0001\u0000\u0000\u0000\u07a5\u07a6\u0001\u0000\u0000\u0000\u07a6"+
		"\u07a8\u0005\u0003\u0000\u0000\u07a7\u07a9\u0005\u0006\u0000\u0000\u07a8"+
		"\u07a7\u0001\u0000\u0000\u0000\u07a8\u07a9\u0001\u0000\u0000\u0000\u07a9"+
		"\u07aa\u0001\u0000\u0000\u0000\u07aa\u07ab\u0005\u0003\u0000\u0000\u07ab"+
		"\u07ac\u0005\b\u0000\u0000\u07ac\u07ae\u0005\u0003\u0000\u0000\u07ad\u07af"+
		"\u0003\u0018\f\u0000\u07ae\u07ad\u0001\u0000\u0000\u0000\u07af\u07b0\u0001"+
		"\u0000\u0000\u0000\u07b0\u07ae\u0001\u0000\u0000\u0000\u07b0\u07b1\u0001"+
		"\u0000\u0000\u0000\u07b1\u07b2\u0001\u0000\u0000\u0000\u07b2\u07b3\u0005"+
		"\u0003\u0000\u0000\u07b3\u07b4\u0005\n\u0000\u0000\u07b4\u07b5\u0005\u0003"+
		"\u0000\u0000\u07b5\u07b6\u0005\n\u0000\u0000\u07b6\u07b7\u0005\u0003\u0000"+
		"\u0000\u07b7\u07b8\u0005\n\u0000\u0000\u07b8\u07b9\u0005\u0003\u0000\u0000"+
		"\u07b9\u07ba\u0005\n\u0000\u0000\u07ba\u07bb\u0005\u0003\u0000\u0000\u07bb"+
		"\u07bc\u0005\b\u0000\u0000\u07bc\u07be\u0005\u0003\u0000\u0000\u07bd\u07bf"+
		"\u0005\b\u0000\u0000\u07be\u07bd\u0001\u0000\u0000\u0000\u07be\u07bf\u0001"+
		"\u0000\u0000\u0000\u07bf\u07c0\u0001\u0000\u0000\u0000\u07c0\u07c1\u0005"+
		"\u0003\u0000\u0000\u07c1\u07c2\u0005\b\u0000\u0000\u07c2\u07c3\u0005\u0003"+
		"\u0000\u0000\u07c3\u07c4\u0005\b\u0000\u0000\u07c4\u07c6\u0005\u0003\u0000"+
		"\u0000\u07c5\u07c7\u0005\b\u0000\u0000\u07c6\u07c5\u0001\u0000\u0000\u0000"+
		"\u07c6\u07c7\u0001\u0000\u0000\u0000\u07c7\u07c8\u0001\u0000\u0000\u0000"+
		"\u07c8\u07c9\u0005\u0003\u0000\u0000\u07c9\u07ca\u0005\u0003\u0000\u0000"+
		"\u07ca\u07cb\u0005\b\u0000\u0000\u07cb\u07cc\u0005\u0003\u0000\u0000\u07cc"+
		"\u07cd\u0005\b\u0000\u0000\u07cd\u07ce\u0005\u0003\u0000\u0000\u07ce\u07cf"+
		"\u0005\u0004\u0000\u0000\u07cf\u07d0\u0006\u000b\uffff\uffff\u0000\u07d0"+
		"\u07d2\u0001\u0000\u0000\u0000\u07d1\u078f\u0001\u0000\u0000\u0000\u07d1"+
		"\u07a1\u0001\u0000\u0000\u0000\u07d2\u07d3\u0001\u0000\u0000\u0000\u07d3"+
		"\u07d1\u0001\u0000\u0000\u0000\u07d3\u07d4\u0001\u0000\u0000\u0000\u07d4"+
		"\u07d6\u0001\u0000\u0000\u0000\u07d5\u0761\u0001\u0000\u0000\u0000\u07d6"+
		"\u07d7\u0001\u0000\u0000\u0000\u07d7\u07d5\u0001\u0000\u0000\u0000\u07d7"+
		"\u07d8\u0001\u0000\u0000\u0000\u07d8\u07d9\u0001\u0000\u0000\u0000\u07d9"+
		"\u07da\u0005\n\u0000\u0000\u07da\u07db\u0005\u0003\u0000\u0000\u07db\u07dc"+
		"\u0005\n\u0000\u0000\u07dc\u07dd\u0005\u0003\u0000\u0000\u07dd\u07de\u0005"+
		"\u0006\u0000\u0000\u07de\u07e0\u0005\u0004\u0000\u0000\u07df\u07d5\u0001"+
		"\u0000\u0000\u0000\u07e0\u07e1\u0001\u0000\u0000\u0000\u07e1\u07df\u0001"+
		"\u0000\u0000\u0000\u07e1\u07e2\u0001\u0000\u0000\u0000\u07e2\u07e3\u0001"+
		"\u0000\u0000\u0000\u07e3\u07e4\u0005\u0005\u0000\u0000\u07e4\u07e5\u0005"+
		"\u0003\u0000\u0000\u07e5\u07e6\u0005\n\u0000\u0000\u07e6\u07e7\u0005\u0003"+
		"\u0000\u0000\u07e7\u07e8\u0005\n\u0000\u0000\u07e8\u07e9\u0005\n\u0000"+
		"\u0000\u07e9\u07ea\u0005\n\u0000\u0000\u07ea\u07eb\u0005\u0003\u0000\u0000"+
		"\u07eb\u07ec\u0005\n\u0000\u0000\u07ec\u07ed\u0005\u0003\u0000\u0000\u07ed"+
		"\u07ee\u0005\n\u0000\u0000\u07ee\u07ef\u0005\u0004\u0000\u0000\u07ef\u0017"+
		"\u0001\u0000\u0000\u0000\u07f0\u07f1\u0007\u0000\u0000\u0000\u07f1\u0019"+
		"\u0001\u0000\u0000\u0000\u07f2\u07f5\u0003\u0018\f\u0000\u07f3\u07f5\u0005"+
		"\u0003\u0000\u0000\u07f4\u07f2\u0001\u0000\u0000\u0000\u07f4\u07f3\u0001"+
		"\u0000\u0000\u0000\u07f5\u07f6\u0001\u0000\u0000\u0000\u07f6\u07f4\u0001"+
		"\u0000\u0000\u0000\u07f6\u07f7\u0001\u0000\u0000\u0000\u07f7\u07f8\u0001"+
		"\u0000\u0000\u0000\u07f8\u07f9\u0005\u0004\u0000\u0000\u07f9\u001b\u0001"+
		"\u0000\u0000\u0000\u07fa\u07fe\u0003\u0018\f\u0000\u07fb\u07fe\u0005\u0003"+
		"\u0000\u0000\u07fc\u07fe\u0005\u0004\u0000\u0000\u07fd\u07fa\u0001\u0000"+
		"\u0000\u0000\u07fd\u07fb\u0001\u0000\u0000\u0000\u07fd\u07fc\u0001\u0000"+
		"\u0000\u0000\u07fe\u07ff\u0001\u0000\u0000\u0000\u07ff\u07fd\u0001\u0000"+
		"\u0000\u0000\u07ff\u0800\u0001\u0000\u0000\u0000\u0800\u001d\u0001\u0000"+
		"\u0000\u0000\u009e)psvy|\u007f\u0084\u00d7\u00fa\u00fd\u0100\u0103\u0106"+
		"\u0109\u010e\u0121\u0123\u012e\u0283\u0286\u0289\u028c\u028f\u0292\u0297"+
		"\u02a3\u02ac\u02f9\u02fc\u02ff\u0302\u0305\u0308\u030d\u0320\u0322\u032d"+
		"\u0384\u03cd\u03d0\u03d3\u03d6\u03d9\u03dc\u03e1\u03f0\u03f2\u03f6\u03fe"+
		"\u0400\u043e\u0441\u0444\u0447\u044a\u044d\u0452\u045a\u045d\u0460\u0463"+
		"\u0466\u0469\u046e\u047b\u0484\u048e\u0499\u04b8\u04bf\u04c2\u04c5\u04c8"+
		"\u04cb\u04ce\u04d3\u04db\u04de\u04e1\u04e4\u04e7\u04ea\u04ef\u0514\u0518"+
		"\u051c\u0520\u0524\u052c\u0531\u0533\u0537\u0542\u0560\u058a\u058c\u0590"+
		"\u059b\u05bc\u05bf\u05c2\u05c5\u05c8\u05cb\u05d0\u05ef\u0628\u062e\u0644"+
		"\u064f\u066e\u0674\u0677\u067a\u067d\u0680\u0683\u0688\u068e\u0691\u0694"+
		"\u0697\u069a\u069d\u06a2\u06aa\u06ba\u06db\u06fc\u06ff\u0702\u0705\u0708"+
		"\u070b\u0710\u0715\u071d\u0722\u0728\u072e\u0732\u0738\u073a\u0744\u07a4"+
		"\u07a8\u07b0\u07be\u07c6\u07d1\u07d3\u07d7\u07e1\u07f4\u07f6\u07fd\u07ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}