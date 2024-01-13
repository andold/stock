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
		RULE_stockDocument = 0, RULE_krxPriceCompany = 1, RULE_krxPriceEtf = 2, 
		RULE_krxItemInfoCompany = 3, RULE_krxItemInfoEtf = 4, RULE_krxBasicInfoEtf = 5, 
		RULE_krxBasicInfoCompany = 6, RULE_etfAllPrice = 7, RULE_companyAllPrice = 8, 
		RULE_crawlPriceKrx = 9, RULE_crawlItemEtf = 10, RULE_crawlPriceEtf = 11, 
		RULE_crawlPriceCompany = 12, RULE_crawlItemDetailCompanyThread = 13, RULE_crawlItemDividendTopCompany = 14, 
		RULE_crawlEtfDetailThread = 15, RULE_crawlDividendHistoryEtfThread = 16, 
		RULE_crawlDividendHistoryCompanyThread = 17, RULE_word = 18, RULE_line = 19, 
		RULE_eof = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"stockDocument", "krxPriceCompany", "krxPriceEtf", "krxItemInfoCompany", 
			"krxItemInfoEtf", "krxBasicInfoEtf", "krxBasicInfoCompany", "etfAllPrice", 
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
		public KrxItemInfoCompanyContext krxItemInfoCompany() {
			return getRuleContext(KrxItemInfoCompanyContext.class,0);
		}
		public KrxItemInfoEtfContext krxItemInfoEtf() {
			return getRuleContext(KrxItemInfoEtfContext.class,0);
		}
		public KrxPriceCompanyContext krxPriceCompany() {
			return getRuleContext(KrxPriceCompanyContext.class,0);
		}
		public KrxPriceEtfContext krxPriceEtf() {
			return getRuleContext(KrxPriceEtfContext.class,0);
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
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				crawlDividendHistoryCompanyThread();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				crawlDividendHistoryEtfThread();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				crawlItemDividendTopCompany();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				crawlItemEtf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				crawlItemDetailCompanyThread();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(47);
				crawlEtfDetailThread();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(48);
				crawlPriceCompany();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(49);
				crawlPriceEtf();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(50);
				crawlPriceKrx();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(51);
				companyAllPrice();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(52);
				etfAllPrice();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(53);
				krxBasicInfoCompany();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(54);
				krxBasicInfoEtf();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(55);
				krxItemInfoCompany();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(56);
				krxItemInfoEtf();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(57);
				krxPriceCompany();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(58);
				krxPriceEtf();
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

	public static class KrxPriceCompanyContext extends ParserRuleContext {
		public Token code;
		public Token base;
		public Token closing;
		public Token market;
		public Token high;
		public Token low;
		public Token volume;
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
		public List<TerminalNode> NUMBER() { return getTokens(StockParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(StockParser.NUMBER, i);
		}
		public KrxPriceCompanyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_krxPriceCompany; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterKrxPriceCompany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitKrxPriceCompany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitKrxPriceCompany(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KrxPriceCompanyContext krxPriceCompany() throws RecognitionException {
		KrxPriceCompanyContext _localctx = new KrxPriceCompanyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_krxPriceCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(KEYWORD);
			setState(62);
			match(TAB);
			setState(63);
			match(WORD);
			setState(64);
			match(TAB);
			setState(65);
			match(WORD);
			setState(66);
			match(WORD);
			setState(67);
			match(WORD);
			setState(68);
			match(WORD);
			setState(69);
			match(WORD);
			setState(70);
			match(WORD);
			setState(71);
			match(WORD);
			setState(72);
			match(TAB);
			setState(73);
			match(WORD);
			setState(74);
			match(NEWLINE);
			setState(311); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(75);
					match(NUMBER);
					setState(76);
					match(TAB);
					setState(77);
					match(NEWLINE);
					setState(78);
					match(NUMBER);
					setState(79);
					match(TAB);
					setState(80);
					match(NEWLINE);
					setState(81);
					match(NUMBER);
					setState(82);
					match(TAB);
					setState(83);
					match(NEWLINE);
					setState(84);
					match(NUMBER);
					setState(85);
					match(TAB);
					setState(86);
					match(NEWLINE);
					setState(87);
					match(NUMBER);
					setState(88);
					match(TAB);
					setState(89);
					match(NEWLINE);
					setState(90);
					match(NUMBER);
					setState(91);
					match(TAB);
					setState(92);
					match(TAB);
					setState(93);
					match(TAB);
					setState(94);
					match(TAB);
					setState(95);
					match(TAB);
					setState(96);
					match(NEWLINE);
					setState(97);
					match(NUMBER);
					setState(98);
					match(TAB);
					setState(99);
					match(TAB);
					setState(100);
					match(TAB);
					setState(101);
					match(NEWLINE);
					setState(102);
					match(NUMBER);
					setState(103);
					match(TAB);
					setState(104);
					match(TAB);
					setState(105);
					match(TAB);
					setState(106);
					match(TAB);
					setState(107);
					match(TAB);
					setState(108);
					match(NEWLINE);
					setState(109);
					match(NUMBER);
					setState(110);
					match(TAB);
					setState(111);
					match(TAB);
					setState(112);
					match(TAB);
					setState(113);
					match(TAB);
					setState(114);
					match(TAB);
					setState(115);
					match(NEWLINE);
					setState(116);
					match(NUMBER);
					setState(117);
					match(TAB);
					setState(118);
					match(TAB);
					setState(119);
					match(TAB);
					setState(120);
					match(TAB);
					setState(121);
					match(NEWLINE);
					setState(122);
					match(NUMBER);
					setState(123);
					match(TAB);
					setState(124);
					match(NEWLINE);
					setState(125);
					match(NUMBER);
					setState(126);
					match(TAB);
					setState(127);
					match(TAB);
					setState(128);
					match(TAB);
					setState(129);
					match(TAB);
					setState(130);
					match(TAB);
					setState(131);
					match(NEWLINE);
					setState(132);
					match(NUMBER);
					setState(133);
					match(TAB);
					setState(134);
					match(TAB);
					setState(135);
					match(TAB);
					setState(136);
					match(NEWLINE);
					setState(137);
					match(NUMBER);
					setState(138);
					match(TAB);
					setState(139);
					match(TAB);
					setState(140);
					match(TAB);
					setState(141);
					match(TAB);
					setState(142);
					match(TAB);
					setState(143);
					match(NEWLINE);
					setState(144);
					match(NUMBER);
					setState(145);
					match(TAB);
					setState(146);
					match(TAB);
					setState(147);
					match(TAB);
					setState(148);
					match(TAB);
					setState(149);
					match(TAB);
					setState(150);
					match(NEWLINE);
					setState(151);
					match(NUMBER);
					setState(152);
					match(TAB);
					setState(153);
					match(TAB);
					setState(154);
					match(TAB);
					setState(155);
					match(TAB);
					setState(156);
					match(NEWLINE);
					setState(157);
					match(NUMBER);
					setState(158);
					match(TAB);
					setState(159);
					match(NEWLINE);
					setState(160);
					match(NUMBER);
					setState(161);
					match(TAB);
					setState(162);
					match(NEWLINE);
					setState(163);
					match(NUMBER);
					setState(164);
					match(TAB);
					setState(165);
					match(NEWLINE);
					setState(166);
					match(NUMBER);
					setState(167);
					match(TAB);
					setState(168);
					match(NEWLINE);
					setState(169);
					match(NUMBER);
					setState(170);
					match(TAB);
					setState(171);
					match(TAB);
					setState(172);
					match(TAB);
					setState(173);
					match(TAB);
					setState(174);
					match(TAB);
					setState(175);
					match(NEWLINE);
					setState(176);
					match(NUMBER);
					setState(177);
					match(TAB);
					setState(178);
					match(TAB);
					setState(179);
					match(TAB);
					setState(180);
					match(NEWLINE);
					setState(181);
					match(NUMBER);
					setState(182);
					match(TAB);
					setState(183);
					match(TAB);
					setState(184);
					match(TAB);
					setState(185);
					match(TAB);
					setState(186);
					match(TAB);
					setState(187);
					match(NEWLINE);
					setState(188);
					match(NUMBER);
					setState(189);
					match(TAB);
					setState(190);
					match(TAB);
					setState(191);
					match(TAB);
					setState(192);
					match(TAB);
					setState(193);
					match(TAB);
					setState(194);
					match(NEWLINE);
					setState(195);
					match(NUMBER);
					setState(196);
					match(TAB);
					setState(197);
					match(TAB);
					setState(198);
					match(TAB);
					setState(199);
					match(TAB);
					setState(200);
					match(NEWLINE);
					setState(201);
					match(NUMBER);
					setState(202);
					match(TAB);
					setState(203);
					match(NEWLINE);
					setState(204);
					match(NUMBER);
					setState(205);
					match(TAB);
					setState(206);
					match(NEWLINE);
					setState(207);
					match(NUMBER);
					setState(208);
					match(TAB);
					setState(209);
					match(NEWLINE);
					setState(210);
					match(NUMBER);
					setState(211);
					match(TAB);
					setState(212);
					match(TAB);
					setState(213);
					match(TAB);
					setState(214);
					match(TAB);
					setState(215);
					match(TAB);
					setState(216);
					match(NEWLINE);
					setState(217);
					match(NUMBER);
					setState(218);
					match(TAB);
					setState(219);
					match(TAB);
					setState(220);
					match(TAB);
					setState(221);
					match(NEWLINE);
					setState(222);
					match(NUMBER);
					setState(223);
					match(TAB);
					setState(224);
					match(TAB);
					setState(225);
					match(TAB);
					setState(226);
					match(TAB);
					setState(227);
					match(TAB);
					setState(228);
					match(NEWLINE);
					setState(229);
					match(NUMBER);
					setState(230);
					match(TAB);
					setState(231);
					match(TAB);
					setState(232);
					match(TAB);
					setState(233);
					match(TAB);
					setState(234);
					match(TAB);
					setState(235);
					match(NEWLINE);
					setState(236);
					match(NUMBER);
					setState(237);
					match(TAB);
					setState(238);
					match(TAB);
					setState(239);
					match(TAB);
					setState(240);
					match(TAB);
					setState(241);
					match(NEWLINE);
					setState(242);
					match(NUMBER);
					setState(243);
					match(TAB);
					setState(244);
					match(WORD);
					setState(245);
					match(NEWLINE);
					setState(246);
					match(NUMBER);
					setState(247);
					match(TAB);
					setState(248);
					match(NEWLINE);
					setState(297); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(249);
							((KrxPriceCompanyContext)_localctx).code = match(NUMBER);
							setState(250);
							match(TAB);
							setState(251);
							((KrxPriceCompanyContext)_localctx).base = match(DATE);
							setState(252);
							match(NEWLINE);
							setState(253);
							match(NUMBER);
							setState(254);
							match(TAB);
							setState(255);
							((KrxPriceCompanyContext)_localctx).closing = match(NUMBER);
							setState(256);
							match(NEWLINE);
							setState(257);
							match(NUMBER);
							setState(258);
							match(TAB);
							setState(259);
							match(NUMBER);
							setState(260);
							match(NEWLINE);
							setState(261);
							match(NUMBER);
							setState(262);
							match(TAB);
							setState(263);
							match(NUMBER);
							setState(264);
							match(NEWLINE);
							setState(265);
							match(NUMBER);
							setState(266);
							match(TAB);
							setState(267);
							((KrxPriceCompanyContext)_localctx).market = match(NUMBER);
							setState(268);
							match(NEWLINE);
							setState(269);
							match(NUMBER);
							setState(270);
							match(TAB);
							setState(271);
							((KrxPriceCompanyContext)_localctx).high = match(NUMBER);
							setState(272);
							match(NEWLINE);
							setState(273);
							match(NUMBER);
							setState(274);
							match(TAB);
							setState(275);
							((KrxPriceCompanyContext)_localctx).low = match(NUMBER);
							setState(276);
							match(NEWLINE);
							setState(277);
							match(NUMBER);
							setState(278);
							match(TAB);
							setState(279);
							((KrxPriceCompanyContext)_localctx).volume = match(NUMBER);
							setState(280);
							match(NEWLINE);
							setState(281);
							match(NUMBER);
							setState(282);
							match(TAB);
							setState(283);
							match(NUMBER);
							setState(284);
							match(NEWLINE);
							setState(285);
							match(NUMBER);
							setState(286);
							match(TAB);
							setState(287);
							match(NUMBER);
							setState(288);
							match(NEWLINE);
							setState(289);
							match(NUMBER);
							setState(290);
							match(TAB);
							setState(291);
							((KrxPriceCompanyContext)_localctx).volumeOfListedShares = match(NUMBER);
							setState(292);
							match(NEWLINE);
							setState(293);
							match(NUMBER);
							setState(294);
							match(TAB);
							setState(295);
							match(NEWLINE);

												ParserService.price(20240112
													, (((KrxPriceCompanyContext)_localctx).code!=null?((KrxPriceCompanyContext)_localctx).code.getText():null)
													, (((KrxPriceCompanyContext)_localctx).base!=null?((KrxPriceCompanyContext)_localctx).base.getText():null), (((KrxPriceCompanyContext)_localctx).closing!=null?((KrxPriceCompanyContext)_localctx).closing.getText():null), (((KrxPriceCompanyContext)_localctx).market!=null?((KrxPriceCompanyContext)_localctx).market.getText():null), (((KrxPriceCompanyContext)_localctx).high!=null?((KrxPriceCompanyContext)_localctx).high.getText():null), (((KrxPriceCompanyContext)_localctx).low!=null?((KrxPriceCompanyContext)_localctx).low.getText():null), (((KrxPriceCompanyContext)_localctx).volume!=null?((KrxPriceCompanyContext)_localctx).volume.getText():null)
												);
											
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(299); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					setState(303); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				setState(305);
				match(WORD);
				setState(306);
				match(TAB);
				setState(307);
				match(WORD);
				setState(308);
				match(TAB);
				setState(309);
				match(DATE);
				setState(310);
				match(NEWLINE);
				}
				}
				setState(313); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(315);
			match(KEYWORD);
			setState(316);
			match(TAB);
			setState(317);
			match(WORD);
			setState(318);
			match(TAB);
			setState(319);
			match(WORD);
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

	public static class KrxPriceEtfContext extends ParserRuleContext {
		public WordContext code;
		public Token base;
		public Token closing;
		public Token nav;
		public Token market;
		public Token high;
		public Token low;
		public Token volume;
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
		public KrxPriceEtfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_krxPriceEtf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterKrxPriceEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitKrxPriceEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitKrxPriceEtf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KrxPriceEtfContext krxPriceEtf() throws RecognitionException {
		KrxPriceEtfContext _localctx = new KrxPriceEtfContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_krxPriceEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(KEYWORD);
			setState(331);
			match(TAB);
			setState(332);
			match(WORD);
			setState(333);
			match(TAB);
			setState(334);
			match(WORD);
			setState(335);
			match(WORD);
			setState(336);
			match(WORD);
			setState(337);
			match(WORD);
			setState(338);
			match(WORD);
			setState(339);
			match(WORD);
			setState(340);
			match(WORD);
			setState(341);
			match(TAB);
			setState(342);
			match(WORD);
			setState(343);
			match(NEWLINE);
			setState(480); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(469); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(344);
					match(NUMBER);
					setState(345);
					match(TAB);
					setState(346);
					match(NEWLINE);
					setState(347);
					match(NUMBER);
					setState(348);
					match(TAB);
					setState(349);
					match(TAB);
					setState(350);
					match(TAB);
					setState(351);
					match(NEWLINE);
					setState(352);
					match(NUMBER);
					setState(353);
					match(TAB);
					setState(354);
					match(TAB);
					setState(355);
					match(TAB);
					setState(356);
					match(NEWLINE);
					setState(357);
					match(NUMBER);
					setState(358);
					match(TAB);
					setState(359);
					match(TAB);
					setState(360);
					match(TAB);
					setState(361);
					match(NEWLINE);
					setState(362);
					match(NUMBER);
					setState(363);
					match(TAB);
					setState(364);
					match(TAB);
					setState(365);
					match(TAB);
					setState(366);
					match(NEWLINE);
					setState(367);
					match(NUMBER);
					setState(368);
					match(TAB);
					setState(369);
					match(TAB);
					setState(370);
					match(TAB);
					setState(371);
					match(NEWLINE);
					setState(372);
					match(NUMBER);
					setState(373);
					match(TAB);
					setState(374);
					match(TAB);
					setState(375);
					match(TAB);
					setState(376);
					match(NEWLINE);
					setState(377);
					match(NUMBER);
					setState(378);
					match(TAB);
					setState(379);
					match(TAB);
					setState(380);
					match(TAB);
					setState(381);
					match(WORD);
					setState(382);
					match(NEWLINE);
					setState(383);
					match(NUMBER);
					setState(384);
					match(TAB);
					setState(385);
					match(TAB);
					setState(386);
					match(TAB);
					setState(387);
					match(NEWLINE);
					setState(465); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(388);
							((KrxPriceEtfContext)_localctx).code = word();
							setState(389);
							match(TAB);
							setState(390);
							((KrxPriceEtfContext)_localctx).base = match(DATE);
							setState(391);
							match(NEWLINE);
							setState(392);
							match(NUMBER);
							setState(393);
							match(TAB);
							setState(394);
							((KrxPriceEtfContext)_localctx).closing = match(NUMBER);
							setState(395);
							match(NEWLINE);
							setState(396);
							match(NUMBER);
							setState(397);
							match(TAB);
							setState(398);
							match(NUMBER);
							setState(399);
							match(NEWLINE);
							setState(400);
							match(NUMBER);
							setState(401);
							match(TAB);
							setState(402);
							match(NUMBER);
							setState(403);
							match(NEWLINE);
							setState(404);
							match(NUMBER);
							setState(405);
							match(TAB);
							setState(406);
							((KrxPriceEtfContext)_localctx).nav = match(NUMBER);
							setState(407);
							match(NEWLINE);
							setState(408);
							match(NUMBER);
							setState(409);
							match(TAB);
							setState(410);
							((KrxPriceEtfContext)_localctx).market = match(NUMBER);
							setState(411);
							match(NEWLINE);
							setState(412);
							match(NUMBER);
							setState(413);
							match(TAB);
							setState(414);
							((KrxPriceEtfContext)_localctx).high = match(NUMBER);
							setState(415);
							match(NEWLINE);
							setState(416);
							match(NUMBER);
							setState(417);
							match(TAB);
							setState(418);
							((KrxPriceEtfContext)_localctx).low = match(NUMBER);
							setState(419);
							match(NEWLINE);
							setState(420);
							match(NUMBER);
							setState(421);
							match(TAB);
							setState(422);
							((KrxPriceEtfContext)_localctx).volume = match(NUMBER);
							setState(423);
							match(NEWLINE);
							setState(424);
							match(NUMBER);
							setState(425);
							match(TAB);
							setState(426);
							match(NUMBER);
							setState(427);
							match(NEWLINE);
							setState(428);
							match(NUMBER);
							setState(429);
							match(TAB);
							setState(430);
							match(NUMBER);
							setState(431);
							match(NEWLINE);
							setState(432);
							match(NUMBER);
							setState(433);
							match(TAB);
							setState(434);
							match(NUMBER);
							setState(435);
							match(NEWLINE);
							setState(436);
							match(NUMBER);
							setState(437);
							match(TAB);
							setState(438);
							((KrxPriceEtfContext)_localctx).volumeOfListedShares = match(NUMBER);
							setState(439);
							match(NEWLINE);
							setState(440);
							match(NUMBER);
							setState(441);
							match(TAB);
							setState(443); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(442);
								word();
								}
								}
								setState(445); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
							setState(447);
							match(NEWLINE);
							setState(448);
							match(NUMBER);
							setState(449);
							match(TAB);
							setState(450);
							word();
							setState(451);
							match(NEWLINE);
							setState(452);
							match(NUMBER);
							setState(453);
							match(TAB);
							setState(454);
							word();
							setState(455);
							match(NEWLINE);
							setState(456);
							match(NUMBER);
							setState(457);
							match(TAB);
							setState(458);
							word();
							setState(459);
							match(NEWLINE);
							setState(460);
							match(NUMBER);
							setState(461);
							match(TAB);
							setState(462);
							match(NEWLINE);

												ParserService.price(20240112
													, (((KrxPriceEtfContext)_localctx).code!=null?_input.getText(((KrxPriceEtfContext)_localctx).code.start,((KrxPriceEtfContext)_localctx).code.stop):null)
													, (((KrxPriceEtfContext)_localctx).base!=null?((KrxPriceEtfContext)_localctx).base.getText():null), (((KrxPriceEtfContext)_localctx).closing!=null?((KrxPriceEtfContext)_localctx).closing.getText():null), (((KrxPriceEtfContext)_localctx).market!=null?((KrxPriceEtfContext)_localctx).market.getText():null), (((KrxPriceEtfContext)_localctx).high!=null?((KrxPriceEtfContext)_localctx).high.getText():null), (((KrxPriceEtfContext)_localctx).low!=null?((KrxPriceEtfContext)_localctx).low.getText():null), (((KrxPriceEtfContext)_localctx).volume!=null?((KrxPriceEtfContext)_localctx).volume.getText():null)
												);
											
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(467); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					setState(471); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				setState(473);
				match(WORD);
				setState(474);
				match(TAB);
				setState(475);
				match(WORD);
				setState(476);
				match(TAB);
				setState(477);
				match(DATE);
				setState(478);
				match(NEWLINE);
				}
				}
				setState(482); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(484);
			match(KEYWORD);
			setState(485);
			match(TAB);
			setState(486);
			match(WORD);
			setState(487);
			match(TAB);
			setState(488);
			match(WORD);
			setState(489);
			match(WORD);
			setState(490);
			match(WORD);
			setState(491);
			match(WORD);
			setState(492);
			match(WORD);
			setState(493);
			match(WORD);
			setState(494);
			match(WORD);
			setState(495);
			match(TAB);
			setState(496);
			match(WORD);
			setState(497);
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

	public static class KrxItemInfoCompanyContext extends ParserRuleContext {
		public WordContext symbol;
		public WordContext symbol1;
		public WordContext symbol2;
		public WordContext symbol3;
		public WordContext symbol4;
		public WordContext symbol5;
		public WordContext symbol6;
		public WordContext symbol7;
		public WordContext code;
		public Token volumeOfListedShares;
		public Token ipo;
		public WordContext category;
		public WordContext category1;
		public WordContext category2;
		public WordContext category3;
		public WordContext category4;
		public WordContext category5;
		public WordContext category6;
		public WordContext category7;
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
		public KrxItemInfoCompanyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_krxItemInfoCompany; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterKrxItemInfoCompany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitKrxItemInfoCompany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitKrxItemInfoCompany(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KrxItemInfoCompanyContext krxItemInfoCompany() throws RecognitionException {
		KrxItemInfoCompanyContext _localctx = new KrxItemInfoCompanyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_krxItemInfoCompany);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(KEYWORD);
			setState(500);
			match(TAB);
			setState(501);
			match(WORD);
			setState(502);
			match(TAB);
			setState(503);
			match(WORD);
			setState(504);
			match(WORD);
			setState(505);
			match(WORD);
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
			match(NEWLINE);
			setState(512);
			match(WORD);
			setState(513);
			match(TAB);
			setState(514);
			match(WORD);
			setState(515);
			match(TAB);
			setState(516);
			((KrxItemInfoCompanyContext)_localctx).symbol = word();
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(517);
				((KrxItemInfoCompanyContext)_localctx).symbol1 = word();
				}
				break;
			}
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(520);
				((KrxItemInfoCompanyContext)_localctx).symbol2 = word();
				}
				break;
			}
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(523);
				((KrxItemInfoCompanyContext)_localctx).symbol3 = word();
				}
				break;
			}
			setState(527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(526);
				((KrxItemInfoCompanyContext)_localctx).symbol4 = word();
				}
				break;
			}
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(529);
				((KrxItemInfoCompanyContext)_localctx).symbol5 = word();
				}
				break;
			}
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(532);
				((KrxItemInfoCompanyContext)_localctx).symbol6 = word();
				}
				break;
			}
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(535);
				((KrxItemInfoCompanyContext)_localctx).symbol7 = word();
				}
				}
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(541);
			match(TAB);
			setState(543); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(542);
				word();
				}
				}
				setState(545); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(547);
			match(TAB);
			setState(548);
			match(NEWLINE);
			setState(549);
			match(WORD);
			setState(550);
			match(TAB);
			setState(551);
			match(WORD);
			setState(552);
			match(TAB);
			setState(553);
			match(WORD);
			setState(554);
			match(TAB);
			setState(555);
			((KrxItemInfoCompanyContext)_localctx).code = word();
			setState(556);
			match(TAB);
			setState(557);
			match(NEWLINE);
			setState(558);
			match(WORD);
			setState(559);
			match(TAB);
			setState(560);
			match(WORD);
			setState(561);
			match(TAB);
			setState(562);
			match(NUMBER);
			setState(563);
			match(TAB);
			setState(564);
			match(NUMBER);
			setState(565);
			match(TAB);
			setState(566);
			match(NEWLINE);
			setState(567);
			match(WORD);
			setState(568);
			match(TAB);
			setState(569);
			match(WORD);
			setState(570);
			match(TAB);
			setState(571);
			((KrxItemInfoCompanyContext)_localctx).volumeOfListedShares = match(NUMBER);
			setState(572);
			match(TAB);
			setState(573);
			match(WORD);
			setState(574);
			match(TAB);
			setState(575);
			match(NEWLINE);
			setState(576);
			match(WORD);
			setState(577);
			match(TAB);
			setState(578);
			match(WORD);
			setState(579);
			match(TAB);
			setState(580);
			((KrxItemInfoCompanyContext)_localctx).ipo = match(DATE);
			setState(581);
			match(TAB);
			setState(582);
			match(DATE);
			setState(583);
			match(TAB);
			setState(584);
			match(NEWLINE);
			setState(585);
			match(WORD);
			setState(586);
			match(TAB);
			setState(587);
			match(WORD);
			setState(588);
			match(TAB);
			setState(589);
			((KrxItemInfoCompanyContext)_localctx).category = word();
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(590);
				((KrxItemInfoCompanyContext)_localctx).category1 = word();
				}
				break;
			}
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(593);
				((KrxItemInfoCompanyContext)_localctx).category2 = word();
				}
				break;
			}
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(596);
				((KrxItemInfoCompanyContext)_localctx).category3 = word();
				}
				break;
			}
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(599);
				((KrxItemInfoCompanyContext)_localctx).category4 = word();
				}
				break;
			}
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(602);
				((KrxItemInfoCompanyContext)_localctx).category5 = word();
				}
				break;
			}
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(605);
				((KrxItemInfoCompanyContext)_localctx).category6 = word();
				}
				break;
			}
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(608);
				((KrxItemInfoCompanyContext)_localctx).category7 = word();
				}
				}
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(614);
			match(TAB);
			setState(615);
			match(WORD);
			setState(616);
			match(TAB);
			setState(617);
			match(NEWLINE);
			setState(618);
			match(WORD);
			setState(619);
			match(TAB);
			setState(620);
			match(WORD);
			setState(621);
			match(WORD);
			setState(622);
			match(WORD);
			setState(623);
			match(WORD);
			setState(624);
			match(NUMBER);
			setState(625);
			match(TAB);
			setState(626);
			match(NEWLINE);
			setState(627);
			match(WORD);
			setState(628);
			match(TAB);
			setState(629);
			match(WORD);
			setState(630);
			match(TAB);
			setState(631);
			match(NEWLINE);
			setState(632);
			match(WORD);
			setState(633);
			match(TAB);
			setState(634);
			match(WORD);
			setState(635);
			match(TAB);
			setState(636);
			match(NEWLINE);
			setState(637);
			match(WORD);
			setState(638);
			match(TAB);
			setState(639);
			match(WORD);
			setState(640);
			match(TAB);
			setState(641);
			match(DATE);
			setState(642);
			match(NEWLINE);
			setState(643);
			match(KEYWORD);
			setState(644);
			match(TAB);
			setState(645);
			match(WORD);
			setState(646);
			match(TAB);
			setState(647);
			match(WORD);
			setState(648);
			match(WORD);
			setState(649);
			match(WORD);
			setState(650);
			match(WORD);
			setState(651);
			match(WORD);
			setState(652);
			match(WORD);
			setState(653);
			match(TAB);
			setState(654);
			match(WORD);
			setState(655);
			match(NEWLINE);

					ParserService.item(20240112
						, (((KrxItemInfoCompanyContext)_localctx).code!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).code.start,((KrxItemInfoCompanyContext)_localctx).code.stop):null)
						, (((KrxItemInfoCompanyContext)_localctx).symbol!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).symbol.start,((KrxItemInfoCompanyContext)_localctx).symbol.stop):null), (((KrxItemInfoCompanyContext)_localctx).symbol1!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).symbol1.start,((KrxItemInfoCompanyContext)_localctx).symbol1.stop):null), (((KrxItemInfoCompanyContext)_localctx).symbol2!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).symbol2.start,((KrxItemInfoCompanyContext)_localctx).symbol2.stop):null), (((KrxItemInfoCompanyContext)_localctx).symbol3!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).symbol3.start,((KrxItemInfoCompanyContext)_localctx).symbol3.stop):null), (((KrxItemInfoCompanyContext)_localctx).symbol4!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).symbol4.start,((KrxItemInfoCompanyContext)_localctx).symbol4.stop):null), (((KrxItemInfoCompanyContext)_localctx).symbol5!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).symbol5.start,((KrxItemInfoCompanyContext)_localctx).symbol5.stop):null), (((KrxItemInfoCompanyContext)_localctx).symbol6!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).symbol6.start,((KrxItemInfoCompanyContext)_localctx).symbol6.stop):null), (((KrxItemInfoCompanyContext)_localctx).symbol7!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).symbol7.start,((KrxItemInfoCompanyContext)_localctx).symbol7.stop):null)
						, (((KrxItemInfoCompanyContext)_localctx).category!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).category.start,((KrxItemInfoCompanyContext)_localctx).category.stop):null), (((KrxItemInfoCompanyContext)_localctx).category1!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).category1.start,((KrxItemInfoCompanyContext)_localctx).category1.stop):null), (((KrxItemInfoCompanyContext)_localctx).category2!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).category2.start,((KrxItemInfoCompanyContext)_localctx).category2.stop):null), (((KrxItemInfoCompanyContext)_localctx).category3!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).category3.start,((KrxItemInfoCompanyContext)_localctx).category3.stop):null), (((KrxItemInfoCompanyContext)_localctx).category4!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).category4.start,((KrxItemInfoCompanyContext)_localctx).category4.stop):null), (((KrxItemInfoCompanyContext)_localctx).category5!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).category5.start,((KrxItemInfoCompanyContext)_localctx).category5.stop):null), (((KrxItemInfoCompanyContext)_localctx).category6!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).category6.start,((KrxItemInfoCompanyContext)_localctx).category6.stop):null), (((KrxItemInfoCompanyContext)_localctx).category7!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).category7.start,((KrxItemInfoCompanyContext)_localctx).category7.stop):null)
						, null
						, (((KrxItemInfoCompanyContext)_localctx).ipo!=null?((KrxItemInfoCompanyContext)_localctx).ipo.getText():null)
						, (((KrxItemInfoCompanyContext)_localctx).volumeOfListedShares!=null?((KrxItemInfoCompanyContext)_localctx).volumeOfListedShares.getText():null)
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

	public static class KrxItemInfoEtfContext extends ParserRuleContext {
		public WordContext symbol;
		public WordContext symbol1;
		public WordContext symbol2;
		public WordContext symbol3;
		public WordContext symbol4;
		public WordContext symbol5;
		public WordContext symbol6;
		public WordContext symbol7;
		public WordContext code;
		public Token volumeOfListedShares;
		public Token ipo;
		public WordContext category;
		public WordContext category1;
		public WordContext category2;
		public WordContext category3;
		public WordContext category4;
		public WordContext category5;
		public WordContext category6;
		public WordContext category7;
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
		public KrxItemInfoEtfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_krxItemInfoEtf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterKrxItemInfoEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitKrxItemInfoEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitKrxItemInfoEtf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KrxItemInfoEtfContext krxItemInfoEtf() throws RecognitionException {
		KrxItemInfoEtfContext _localctx = new KrxItemInfoEtfContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_krxItemInfoEtf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(KEYWORD);
			setState(659);
			match(TAB);
			setState(660);
			match(WORD);
			setState(661);
			match(TAB);
			setState(662);
			match(WORD);
			setState(663);
			match(WORD);
			setState(664);
			match(WORD);
			setState(665);
			match(WORD);
			setState(666);
			match(WORD);
			setState(667);
			match(WORD);
			setState(668);
			match(TAB);
			setState(669);
			match(WORD);
			setState(670);
			match(NEWLINE);
			setState(671);
			match(WORD);
			setState(672);
			match(TAB);
			setState(673);
			match(WORD);
			setState(674);
			match(TAB);
			setState(675);
			((KrxItemInfoEtfContext)_localctx).symbol = word();
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(676);
				((KrxItemInfoEtfContext)_localctx).symbol1 = word();
				}
				break;
			}
			setState(680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(679);
				((KrxItemInfoEtfContext)_localctx).symbol2 = word();
				}
				break;
			}
			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(682);
				((KrxItemInfoEtfContext)_localctx).symbol3 = word();
				}
				break;
			}
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(685);
				((KrxItemInfoEtfContext)_localctx).symbol4 = word();
				}
				break;
			}
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(688);
				((KrxItemInfoEtfContext)_localctx).symbol5 = word();
				}
				break;
			}
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(691);
				((KrxItemInfoEtfContext)_localctx).symbol6 = word();
				}
				break;
			}
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(694);
				((KrxItemInfoEtfContext)_localctx).symbol7 = word();
				}
				}
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(700);
			match(TAB);
			setState(702); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(701);
				word();
				}
				}
				setState(704); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(706);
			match(TAB);
			setState(707);
			match(NEWLINE);
			setState(708);
			match(WORD);
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
			((KrxItemInfoEtfContext)_localctx).code = word();
			setState(715);
			match(TAB);
			setState(716);
			match(NEWLINE);
			setState(717);
			match(WORD);
			setState(718);
			match(TAB);
			setState(719);
			match(WORD);
			setState(720);
			match(TAB);
			setState(721);
			match(WORD);
			setState(722);
			match(WORD);
			setState(723);
			match(WORD);
			setState(724);
			match(WORD);
			setState(725);
			match(WORD);
			setState(726);
			match(WORD);
			setState(727);
			match(WORD);
			setState(728);
			match(TAB);
			setState(729);
			match(WORD);
			setState(730);
			match(TAB);
			setState(731);
			match(NEWLINE);
			setState(732);
			match(WORD);
			setState(733);
			match(TAB);
			setState(734);
			match(WORD);
			setState(735);
			match(TAB);
			setState(736);
			match(NUMBER);
			setState(737);
			match(TAB);
			setState(738);
			((KrxItemInfoEtfContext)_localctx).volumeOfListedShares = match(NUMBER);
			setState(739);
			match(TAB);
			setState(740);
			match(NEWLINE);
			setState(741);
			match(WORD);
			setState(742);
			match(TAB);
			setState(743);
			match(WORD);
			setState(744);
			match(TAB);
			setState(745);
			match(NUMBER);
			setState(746);
			match(TAB);
			setState(747);
			((KrxItemInfoEtfContext)_localctx).ipo = match(DATE);
			setState(748);
			match(TAB);
			setState(749);
			match(NEWLINE);
			setState(750);
			match(WORD);
			setState(751);
			match(TAB);
			setState(752);
			match(WORD);
			setState(753);
			match(TAB);
			setState(754);
			match(WORD);
			setState(755);
			match(TAB);
			setState(756);
			match(WORD);
			setState(757);
			match(TAB);
			setState(758);
			match(NEWLINE);
			setState(759);
			match(WORD);
			setState(760);
			match(TAB);
			setState(761);
			match(WORD);
			setState(762);
			match(TAB);
			setState(763);
			match(WORD);
			setState(764);
			match(TAB);
			setState(765);
			match(WORD);
			setState(766);
			match(TAB);
			setState(767);
			match(NEWLINE);
			setState(768);
			match(WORD);
			setState(769);
			match(TAB);
			setState(770);
			match(WORD);
			setState(771);
			match(TAB);
			setState(772);
			match(WORD);
			setState(773);
			match(TAB);
			setState(774);
			((KrxItemInfoEtfContext)_localctx).category = word();
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(775);
				((KrxItemInfoEtfContext)_localctx).category1 = word();
				}
				break;
			}
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(778);
				((KrxItemInfoEtfContext)_localctx).category2 = word();
				}
				break;
			}
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(781);
				((KrxItemInfoEtfContext)_localctx).category3 = word();
				}
				break;
			}
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(784);
				((KrxItemInfoEtfContext)_localctx).category4 = word();
				}
				break;
			}
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(787);
				((KrxItemInfoEtfContext)_localctx).category5 = word();
				}
				break;
			}
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(790);
				((KrxItemInfoEtfContext)_localctx).category6 = word();
				}
				break;
			}
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(793);
				((KrxItemInfoEtfContext)_localctx).category7 = word();
				}
				}
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(799);
			match(TAB);
			setState(800);
			match(NEWLINE);
			setState(801);
			match(WORD);
			setState(802);
			match(WORD);
			setState(803);
			match(TAB);
			setState(804);
			match(WORD);
			setState(805);
			match(WORD);
			setState(806);
			match(WORD);
			setState(807);
			match(TAB);
			setState(808);
			match(NEWLINE);
			setState(809);
			match(WORD);
			setState(810);
			match(TAB);
			setState(811);
			match(WORD);
			setState(812);
			match(WORD);
			setState(813);
			match(WORD);
			setState(814);
			match(WORD);
			setState(815);
			match(WORD);
			setState(816);
			match(WORD);
			setState(817);
			match(WORD);
			setState(818);
			match(WORD);
			setState(819);
			match(WORD);
			setState(820);
			match(WORD);
			setState(821);
			match(TAB);
			setState(822);
			match(NEWLINE);
			setState(823);
			match(WORD);
			setState(824);
			match(TAB);
			setState(825);
			match(WORD);
			setState(826);
			match(TAB);
			setState(827);
			match(DATE);
			setState(828);
			match(NEWLINE);
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
			match(WORD);
			setState(835);
			match(WORD);
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
			match(NEWLINE);

					ParserService.item(20240112
						, (((KrxItemInfoEtfContext)_localctx).code!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).code.start,((KrxItemInfoEtfContext)_localctx).code.stop):null)
						, (((KrxItemInfoEtfContext)_localctx).symbol!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).symbol.start,((KrxItemInfoEtfContext)_localctx).symbol.stop):null), (((KrxItemInfoEtfContext)_localctx).symbol1!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).symbol1.start,((KrxItemInfoEtfContext)_localctx).symbol1.stop):null), (((KrxItemInfoEtfContext)_localctx).symbol2!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).symbol2.start,((KrxItemInfoEtfContext)_localctx).symbol2.stop):null), (((KrxItemInfoEtfContext)_localctx).symbol3!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).symbol3.start,((KrxItemInfoEtfContext)_localctx).symbol3.stop):null), (((KrxItemInfoEtfContext)_localctx).symbol4!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).symbol4.start,((KrxItemInfoEtfContext)_localctx).symbol4.stop):null), (((KrxItemInfoEtfContext)_localctx).symbol5!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).symbol5.start,((KrxItemInfoEtfContext)_localctx).symbol5.stop):null), (((KrxItemInfoEtfContext)_localctx).symbol6!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).symbol6.start,((KrxItemInfoEtfContext)_localctx).symbol6.stop):null), (((KrxItemInfoEtfContext)_localctx).symbol7!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).symbol7.start,((KrxItemInfoEtfContext)_localctx).symbol7.stop):null)
						, (((KrxItemInfoEtfContext)_localctx).category!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).category.start,((KrxItemInfoEtfContext)_localctx).category.stop):null), (((KrxItemInfoEtfContext)_localctx).category1!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).category1.start,((KrxItemInfoEtfContext)_localctx).category1.stop):null), (((KrxItemInfoEtfContext)_localctx).category2!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).category2.start,((KrxItemInfoEtfContext)_localctx).category2.stop):null), (((KrxItemInfoEtfContext)_localctx).category3!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).category3.start,((KrxItemInfoEtfContext)_localctx).category3.stop):null), (((KrxItemInfoEtfContext)_localctx).category4!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).category4.start,((KrxItemInfoEtfContext)_localctx).category4.stop):null), (((KrxItemInfoEtfContext)_localctx).category5!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).category5.start,((KrxItemInfoEtfContext)_localctx).category5.stop):null), (((KrxItemInfoEtfContext)_localctx).category6!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).category6.start,((KrxItemInfoEtfContext)_localctx).category6.stop):null), (((KrxItemInfoEtfContext)_localctx).category7!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).category7.start,((KrxItemInfoEtfContext)_localctx).category7.stop):null)
						, "ETF"
						, (((KrxItemInfoEtfContext)_localctx).ipo!=null?((KrxItemInfoEtfContext)_localctx).ipo.getText():null)
						, (((KrxItemInfoEtfContext)_localctx).volumeOfListedShares!=null?((KrxItemInfoEtfContext)_localctx).volumeOfListedShares.getText():null)
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
		enterRule(_localctx, 10, RULE_krxBasicInfoEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(KEYWORD);
			setState(845);
			match(TAB);
			setState(846);
			match(WORD);
			setState(847);
			match(TAB);
			setState(848);
			match(WORD);
			setState(849);
			match(WORD);
			setState(850);
			match(WORD);
			setState(851);
			match(WORD);
			setState(852);
			match(WORD);
			setState(853);
			match(WORD);
			setState(854);
			match(TAB);
			setState(855);
			match(WORD);
			setState(856);
			match(NEWLINE);
			setState(1110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(857);
				match(WORD);
				setState(858);
				match(TAB);
				setState(859);
				match(NEWLINE);
				setState(860);
				match(WORD);
				setState(861);
				match(TAB);
				setState(862);
				match(TAB);
				setState(863);
				match(TAB);
				setState(864);
				match(NEWLINE);
				setState(865);
				match(WORD);
				setState(866);
				match(TAB);
				setState(867);
				match(TAB);
				setState(868);
				match(TAB);
				setState(869);
				match(NEWLINE);
				setState(870);
				match(WORD);
				setState(871);
				match(TAB);
				setState(872);
				match(TAB);
				setState(873);
				match(TAB);
				setState(874);
				match(NEWLINE);
				setState(875);
				match(WORD);
				setState(876);
				match(TAB);
				setState(877);
				match(TAB);
				setState(878);
				match(TAB);
				setState(879);
				match(NEWLINE);
				setState(880);
				match(WORD);
				setState(881);
				match(TAB);
				setState(882);
				match(TAB);
				setState(883);
				match(TAB);
				setState(884);
				match(NEWLINE);
				setState(885);
				match(WORD);
				setState(886);
				match(TAB);
				setState(887);
				match(TAB);
				setState(888);
				match(TAB);
				setState(889);
				match(NEWLINE);
				setState(890);
				match(WORD);
				setState(891);
				match(TAB);
				setState(892);
				match(TAB);
				setState(893);
				match(TAB);
				setState(894);
				match(NEWLINE);
				setState(895);
				match(WORD);
				setState(896);
				match(TAB);
				setState(897);
				match(TAB);
				setState(898);
				match(TAB);
				setState(899);
				match(NEWLINE);
				setState(900);
				match(WORD);
				setState(901);
				match(TAB);
				setState(902);
				match(TAB);
				setState(903);
				match(TAB);
				setState(904);
				match(NEWLINE);
				setState(905);
				match(WORD);
				setState(906);
				match(TAB);
				setState(907);
				match(TAB);
				setState(908);
				match(TAB);
				setState(909);
				match(NEWLINE);
				setState(910);
				match(WORD);
				setState(911);
				match(TAB);
				setState(912);
				match(TAB);
				setState(913);
				match(TAB);
				setState(914);
				match(NEWLINE);
				setState(915);
				match(WORD);
				setState(916);
				match(TAB);
				setState(917);
				match(TAB);
				setState(918);
				match(TAB);
				setState(919);
				match(NEWLINE);
				setState(920);
				match(WORD);
				setState(921);
				match(TAB);
				setState(922);
				match(TAB);
				setState(923);
				match(TAB);
				setState(924);
				match(NEWLINE);
				setState(925);
				match(WORD);
				setState(926);
				match(TAB);
				setState(927);
				match(TAB);
				setState(928);
				match(TAB);
				setState(929);
				match(NEWLINE);
				setState(930);
				match(WORD);
				setState(931);
				match(TAB);
				setState(932);
				match(TAB);
				setState(933);
				match(TAB);
				setState(934);
				match(NEWLINE);
				setState(935);
				match(WORD);
				setState(936);
				match(TAB);
				setState(937);
				match(TAB);
				setState(938);
				match(TAB);
				setState(939);
				match(NEWLINE);
				setState(940);
				match(WORD);
				setState(941);
				match(TAB);
				setState(942);
				match(TAB);
				setState(943);
				match(TAB);
				setState(944);
				match(NEWLINE);
				setState(945);
				match(WORD);
				setState(946);
				match(TAB);
				setState(947);
				match(TAB);
				setState(948);
				match(TAB);
				setState(949);
				match(NEWLINE);
				setState(950);
				match(WORD);
				setState(951);
				match(TAB);
				setState(952);
				match(TAB);
				setState(953);
				match(TAB);
				setState(954);
				match(WORD);
				setState(955);
				match(NEWLINE);
				setState(956);
				match(WORD);
				setState(957);
				match(TAB);
				setState(958);
				match(TAB);
				setState(959);
				match(TAB);
				setState(960);
				match(NEWLINE);
				setState(1099); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						{
						setState(961);
						match(WORD);
						setState(962);
						match(TAB);
						setState(963);
						match(WORD);
						setState(964);
						match(NEWLINE);
						setState(965);
						match(WORD);
						setState(966);
						match(TAB);
						setState(967);
						((KrxBasicInfoEtfContext)_localctx).code = word();
						setState(968);
						match(NEWLINE);
						setState(969);
						match(WORD);
						setState(970);
						match(TAB);
						setState(971);
						match(NEWLINE);
						setState(972);
						match(WORD);
						setState(973);
						match(TAB);
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
						match(TAB);
						setState(984);
						((KrxBasicInfoEtfContext)_localctx).symbol = word();
						setState(986);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
						case 1:
							{
							setState(985);
							((KrxBasicInfoEtfContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(989);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
						case 1:
							{
							setState(988);
							((KrxBasicInfoEtfContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(992);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
						case 1:
							{
							setState(991);
							((KrxBasicInfoEtfContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(995);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
						case 1:
							{
							setState(994);
							((KrxBasicInfoEtfContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(998);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
						case 1:
							{
							setState(997);
							((KrxBasicInfoEtfContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(1001);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
						case 1:
							{
							setState(1000);
							((KrxBasicInfoEtfContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(1006);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(1003);
							((KrxBasicInfoEtfContext)_localctx).symbol7 = word();
							}
							}
							setState(1008);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1009);
						match(NEWLINE);
						setState(1010);
						match(WORD);
						setState(1011);
						match(TAB);
						setState(1012);
						match(NEWLINE);
						setState(1013);
						match(WORD);
						setState(1014);
						match(TAB);
						setState(1016); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1015);
							word();
							}
							}
							setState(1018); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(1020);
						match(NEWLINE);
						setState(1021);
						match(WORD);
						setState(1022);
						match(TAB);
						setState(1023);
						((KrxBasicInfoEtfContext)_localctx).ipo = match(DATE);
						setState(1024);
						match(NEWLINE);
						setState(1025);
						match(WORD);
						setState(1026);
						match(TAB);
						setState(1028); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1027);
							word();
							}
							}
							setState(1030); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(1032);
						match(NEWLINE);
						setState(1033);
						match(WORD);
						setState(1034);
						match(TAB);
						setState(1036); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1035);
							word();
							}
							}
							setState(1038); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(1040);
						match(NEWLINE);
						setState(1041);
						match(WORD);
						setState(1042);
						match(TAB);
						setState(1044); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1043);
							word();
							}
							}
							setState(1046); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(1048);
						match(NEWLINE);
						setState(1049);
						match(WORD);
						setState(1050);
						match(TAB);
						setState(1051);
						match(WORD);
						setState(1052);
						match(NEWLINE);
						setState(1053);
						match(WORD);
						setState(1054);
						match(TAB);
						setState(1055);
						match(NEWLINE);
						setState(1056);
						match(WORD);
						setState(1057);
						match(TAB);
						setState(1058);
						match(TAB);
						setState(1059);
						match(WORD);
						setState(1060);
						match(NEWLINE);
						setState(1061);
						match(WORD);
						setState(1062);
						match(TAB);
						setState(1063);
						match(TAB);
						setState(1064);
						match(WORD);
						setState(1065);
						match(NEWLINE);
						setState(1066);
						match(WORD);
						setState(1067);
						match(TAB);
						setState(1068);
						match(TAB);
						setState(1069);
						match(NEWLINE);
						setState(1070);
						match(WORD);
						setState(1071);
						match(TAB);
						setState(1072);
						((KrxBasicInfoEtfContext)_localctx).volumeOfListedShares = match(NUMBER);
						setState(1073);
						match(NEWLINE);
						setState(1074);
						match(WORD);
						setState(1075);
						match(TAB);
						setState(1077); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1076);
							word();
							}
							}
							setState(1079); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(1081);
						match(NEWLINE);
						setState(1082);
						match(WORD);
						setState(1083);
						match(TAB);
						setState(1084);
						match(NUMBER);
						setState(1085);
						match(NEWLINE);
						setState(1086);
						match(WORD);
						setState(1087);
						match(TAB);
						setState(1088);
						((KrxBasicInfoEtfContext)_localctx).fee = match(NUMBER);
						setState(1089);
						match(NEWLINE);
						setState(1090);
						match(WORD);
						setState(1091);
						match(TAB);
						setState(1092);
						match(WORD);
						setState(1093);
						match(NEWLINE);
						setState(1094);
						match(WORD);
						setState(1095);
						match(TAB);
						setState(1096);
						match(NEWLINE);

										ParserService.item(20240112
											, (((KrxBasicInfoEtfContext)_localctx).code!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).code.start,((KrxBasicInfoEtfContext)_localctx).code.stop):null)
											, (((KrxBasicInfoEtfContext)_localctx).symbol!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol.start,((KrxBasicInfoEtfContext)_localctx).symbol.stop):null), (((KrxBasicInfoEtfContext)_localctx).symbol1!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol1.start,((KrxBasicInfoEtfContext)_localctx).symbol1.stop):null), (((KrxBasicInfoEtfContext)_localctx).symbol2!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol2.start,((KrxBasicInfoEtfContext)_localctx).symbol2.stop):null), (((KrxBasicInfoEtfContext)_localctx).symbol3!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol3.start,((KrxBasicInfoEtfContext)_localctx).symbol3.stop):null), (((KrxBasicInfoEtfContext)_localctx).symbol4!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol4.start,((KrxBasicInfoEtfContext)_localctx).symbol4.stop):null), (((KrxBasicInfoEtfContext)_localctx).symbol5!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol5.start,((KrxBasicInfoEtfContext)_localctx).symbol5.stop):null), (((KrxBasicInfoEtfContext)_localctx).symbol6!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol6.start,((KrxBasicInfoEtfContext)_localctx).symbol6.stop):null), (((KrxBasicInfoEtfContext)_localctx).symbol7!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol7.start,((KrxBasicInfoEtfContext)_localctx).symbol7.stop):null)
											, null, null, null, null, null, null, null, null
											, null
											, (((KrxBasicInfoEtfContext)_localctx).ipo!=null?((KrxBasicInfoEtfContext)_localctx).ipo.getText():null)
											, (((KrxBasicInfoEtfContext)_localctx).volumeOfListedShares!=null?((KrxBasicInfoEtfContext)_localctx).volumeOfListedShares.getText():null)
											, null
										);
									
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1101); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1103);
				match(WORD);
				setState(1104);
				match(TAB);
				setState(1105);
				match(WORD);
				setState(1106);
				match(TAB);
				setState(1107);
				match(DATE);
				setState(1108);
				match(NEWLINE);
				}
				}
				setState(1112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1114);
			match(KEYWORD);
			setState(1115);
			match(TAB);
			setState(1116);
			match(WORD);
			setState(1117);
			match(TAB);
			setState(1118);
			match(WORD);
			setState(1119);
			match(WORD);
			setState(1120);
			match(WORD);
			setState(1121);
			match(WORD);
			setState(1122);
			match(WORD);
			setState(1123);
			match(WORD);
			setState(1124);
			match(TAB);
			setState(1125);
			match(WORD);
			setState(1126);
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
		enterRule(_localctx, 12, RULE_krxBasicInfoCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			match(KEYWORD);
			setState(1129);
			match(TAB);
			setState(1130);
			match(WORD);
			setState(1131);
			match(TAB);
			setState(1132);
			match(WORD);
			setState(1133);
			match(WORD);
			setState(1134);
			match(WORD);
			setState(1135);
			match(WORD);
			setState(1136);
			match(WORD);
			setState(1137);
			match(WORD);
			setState(1138);
			match(TAB);
			setState(1139);
			match(WORD);
			setState(1140);
			match(NEWLINE);
			setState(1583); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1141);
					match(KEYWORD);
					setState(1142);
					match(TAB);
					setState(1143);
					match(NEWLINE);
					setState(1144);
					match(KEYWORD);
					setState(1145);
					match(TAB);
					setState(1146);
					match(NEWLINE);
					setState(1147);
					match(KEYWORD);
					setState(1148);
					match(TAB);
					setState(1149);
					match(NEWLINE);
					setState(1150);
					match(KEYWORD);
					setState(1151);
					match(TAB);
					setState(1152);
					match(NEWLINE);
					setState(1153);
					match(KEYWORD);
					setState(1154);
					match(TAB);
					setState(1155);
					match(TAB);
					setState(1156);
					match(TAB);
					setState(1157);
					match(TAB);
					setState(1158);
					match(TAB);
					setState(1159);
					match(NEWLINE);
					setState(1160);
					match(KEYWORD);
					setState(1161);
					match(TAB);
					setState(1162);
					match(TAB);
					setState(1163);
					match(TAB);
					setState(1164);
					match(NEWLINE);
					setState(1165);
					match(KEYWORD);
					setState(1166);
					match(TAB);
					setState(1167);
					match(TAB);
					setState(1168);
					match(TAB);
					setState(1169);
					match(TAB);
					setState(1170);
					match(TAB);
					setState(1171);
					match(NEWLINE);
					setState(1172);
					match(KEYWORD);
					setState(1173);
					match(TAB);
					setState(1174);
					match(TAB);
					setState(1175);
					match(TAB);
					setState(1176);
					match(TAB);
					setState(1177);
					match(TAB);
					setState(1178);
					match(NEWLINE);
					setState(1179);
					match(KEYWORD);
					setState(1180);
					match(TAB);
					setState(1181);
					match(TAB);
					setState(1182);
					match(TAB);
					setState(1183);
					match(TAB);
					setState(1184);
					match(NEWLINE);
					setState(1185);
					match(KEYWORD);
					setState(1186);
					match(TAB);
					setState(1187);
					match(NEWLINE);
					setState(1188);
					match(KEYWORD);
					setState(1189);
					match(TAB);
					setState(1190);
					match(TAB);
					setState(1191);
					match(TAB);
					setState(1192);
					match(TAB);
					setState(1193);
					match(TAB);
					setState(1194);
					match(NEWLINE);
					setState(1195);
					match(KEYWORD);
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
					match(KEYWORD);
					setState(1202);
					match(TAB);
					setState(1203);
					match(TAB);
					setState(1204);
					match(TAB);
					setState(1205);
					match(NEWLINE);
					setState(1206);
					match(KEYWORD);
					setState(1207);
					match(TAB);
					setState(1208);
					match(TAB);
					setState(1209);
					match(TAB);
					setState(1210);
					match(NEWLINE);
					setState(1211);
					match(KEYWORD);
					setState(1212);
					match(TAB);
					setState(1213);
					match(TAB);
					setState(1214);
					match(TAB);
					setState(1215);
					match(TAB);
					setState(1216);
					match(TAB);
					setState(1217);
					match(NEWLINE);
					setState(1218);
					match(KEYWORD);
					setState(1219);
					match(TAB);
					setState(1220);
					match(TAB);
					setState(1221);
					match(TAB);
					setState(1222);
					match(TAB);
					setState(1223);
					match(TAB);
					setState(1224);
					match(NEWLINE);
					setState(1225);
					match(KEYWORD);
					setState(1226);
					match(TAB);
					setState(1227);
					match(TAB);
					setState(1228);
					match(NEWLINE);
					setState(1229);
					match(KEYWORD);
					setState(1230);
					match(TAB);
					setState(1231);
					match(NEWLINE);
					setState(1232);
					match(KEYWORD);
					setState(1233);
					match(TAB);
					setState(1234);
					match(TAB);
					setState(1235);
					match(TAB);
					setState(1236);
					match(TAB);
					setState(1237);
					match(TAB);
					setState(1238);
					match(NEWLINE);
					setState(1239);
					match(KEYWORD);
					setState(1240);
					match(TAB);
					setState(1241);
					match(TAB);
					setState(1242);
					match(TAB);
					setState(1243);
					match(NEWLINE);
					setState(1244);
					match(KEYWORD);
					setState(1245);
					match(TAB);
					setState(1246);
					match(TAB);
					setState(1247);
					match(TAB);
					setState(1248);
					match(TAB);
					setState(1249);
					match(TAB);
					setState(1250);
					match(NEWLINE);
					setState(1251);
					match(KEYWORD);
					setState(1252);
					match(TAB);
					setState(1253);
					match(TAB);
					setState(1254);
					match(TAB);
					setState(1255);
					match(TAB);
					setState(1256);
					match(TAB);
					setState(1257);
					match(NEWLINE);
					setState(1258);
					match(KEYWORD);
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
					match(KEYWORD);
					setState(1265);
					match(TAB);
					setState(1266);
					match(NEWLINE);
					setState(1267);
					match(KEYWORD);
					setState(1268);
					match(TAB);
					setState(1269);
					match(TAB);
					setState(1270);
					match(TAB);
					setState(1271);
					match(TAB);
					setState(1272);
					match(TAB);
					setState(1273);
					match(NEWLINE);
					setState(1274);
					match(KEYWORD);
					setState(1275);
					match(TAB);
					setState(1276);
					match(TAB);
					setState(1277);
					match(TAB);
					setState(1278);
					match(NEWLINE);
					setState(1279);
					match(KEYWORD);
					setState(1280);
					match(TAB);
					setState(1281);
					match(TAB);
					setState(1282);
					match(TAB);
					setState(1283);
					match(TAB);
					setState(1284);
					match(TAB);
					setState(1285);
					match(NEWLINE);
					setState(1286);
					match(KEYWORD);
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
					match(KEYWORD);
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
					setState(1299);
					match(KEYWORD);
					setState(1300);
					match(TAB);
					setState(1301);
					match(NEWLINE);
					setState(1302);
					match(KEYWORD);
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
					match(KEYWORD);
					setState(1310);
					match(TAB);
					setState(1311);
					match(TAB);
					setState(1312);
					match(TAB);
					setState(1313);
					match(NEWLINE);
					setState(1314);
					match(KEYWORD);
					setState(1315);
					match(TAB);
					setState(1316);
					match(TAB);
					setState(1317);
					match(TAB);
					setState(1318);
					match(TAB);
					setState(1319);
					match(TAB);
					setState(1320);
					match(NEWLINE);
					setState(1321);
					match(KEYWORD);
					setState(1322);
					match(TAB);
					setState(1323);
					match(TAB);
					setState(1324);
					match(TAB);
					setState(1325);
					match(TAB);
					setState(1326);
					match(TAB);
					setState(1327);
					match(NEWLINE);
					setState(1328);
					match(KEYWORD);
					setState(1329);
					match(TAB);
					setState(1330);
					match(TAB);
					setState(1331);
					match(TAB);
					setState(1332);
					match(TAB);
					setState(1333);
					match(NEWLINE);
					setState(1334);
					match(KEYWORD);
					setState(1335);
					match(TAB);
					setState(1336);
					match(NEWLINE);
					setState(1337);
					match(KEYWORD);
					setState(1338);
					match(TAB);
					setState(1339);
					match(NEWLINE);
					setState(1340);
					match(KEYWORD);
					setState(1341);
					match(TAB);
					setState(1342);
					match(TAB);
					setState(1343);
					match(TAB);
					setState(1344);
					match(TAB);
					setState(1345);
					match(TAB);
					setState(1346);
					match(NEWLINE);
					setState(1347);
					match(KEYWORD);
					setState(1348);
					match(TAB);
					setState(1349);
					match(TAB);
					setState(1350);
					match(TAB);
					setState(1351);
					match(NEWLINE);
					setState(1352);
					match(KEYWORD);
					setState(1353);
					match(TAB);
					setState(1354);
					match(TAB);
					setState(1355);
					match(TAB);
					setState(1356);
					match(TAB);
					setState(1357);
					match(TAB);
					setState(1358);
					match(NEWLINE);
					setState(1359);
					match(KEYWORD);
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
					match(KEYWORD);
					setState(1367);
					match(TAB);
					setState(1368);
					match(TAB);
					setState(1369);
					match(TAB);
					setState(1370);
					match(TAB);
					setState(1371);
					match(NEWLINE);
					setState(1372);
					match(KEYWORD);
					setState(1373);
					match(TAB);
					setState(1374);
					match(NEWLINE);
					setState(1375);
					match(KEYWORD);
					setState(1376);
					match(TAB);
					setState(1377);
					match(TAB);
					setState(1378);
					match(TAB);
					setState(1379);
					match(TAB);
					setState(1380);
					match(TAB);
					setState(1381);
					match(NEWLINE);
					setState(1382);
					match(KEYWORD);
					setState(1383);
					match(TAB);
					setState(1384);
					match(TAB);
					setState(1385);
					match(TAB);
					setState(1386);
					match(NEWLINE);
					setState(1387);
					match(KEYWORD);
					setState(1388);
					match(TAB);
					setState(1389);
					match(TAB);
					setState(1390);
					match(TAB);
					setState(1391);
					match(TAB);
					setState(1392);
					match(TAB);
					setState(1393);
					match(NEWLINE);
					setState(1394);
					match(KEYWORD);
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
					match(NEWLINE);
					setState(1401);
					match(KEYWORD);
					setState(1402);
					match(TAB);
					setState(1403);
					match(TAB);
					setState(1404);
					match(TAB);
					setState(1405);
					match(TAB);
					setState(1406);
					match(NEWLINE);
					setState(1407);
					match(KEYWORD);
					setState(1408);
					match(TAB);
					setState(1409);
					match(NEWLINE);
					setState(1410);
					match(KEYWORD);
					setState(1411);
					match(TAB);
					setState(1412);
					match(TAB);
					setState(1413);
					match(TAB);
					setState(1414);
					match(TAB);
					setState(1415);
					match(TAB);
					setState(1416);
					match(NEWLINE);
					setState(1417);
					match(KEYWORD);
					setState(1418);
					match(TAB);
					setState(1419);
					match(TAB);
					setState(1420);
					match(TAB);
					setState(1421);
					match(NEWLINE);
					setState(1422);
					match(KEYWORD);
					setState(1423);
					match(TAB);
					setState(1424);
					match(TAB);
					setState(1425);
					match(TAB);
					setState(1426);
					match(TAB);
					setState(1427);
					match(TAB);
					setState(1428);
					match(NEWLINE);
					setState(1429);
					match(KEYWORD);
					setState(1430);
					match(TAB);
					setState(1431);
					match(TAB);
					setState(1432);
					match(TAB);
					setState(1433);
					match(TAB);
					setState(1434);
					match(TAB);
					setState(1435);
					match(NEWLINE);
					setState(1436);
					match(KEYWORD);
					setState(1437);
					match(TAB);
					setState(1438);
					match(TAB);
					setState(1439);
					match(TAB);
					setState(1440);
					match(TAB);
					setState(1441);
					match(NEWLINE);
					setState(1442);
					match(KEYWORD);
					setState(1443);
					match(TAB);
					setState(1444);
					match(WORD);
					setState(1445);
					match(NEWLINE);
					setState(1446);
					match(KEYWORD);
					setState(1447);
					match(TAB);
					setState(1448);
					match(NEWLINE);
					setState(1572); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						{
						setState(1449);
						match(KEYWORD);
						setState(1450);
						match(TAB);
						setState(1451);
						match(WORD);
						setState(1452);
						match(NEWLINE);
						setState(1453);
						match(KEYWORD);
						setState(1454);
						match(TAB);
						setState(1455);
						((KrxBasicInfoCompanyContext)_localctx).code = word();
						setState(1456);
						match(NEWLINE);
						setState(1457);
						match(KEYWORD);
						setState(1458);
						match(TAB);
						setState(1459);
						match(NEWLINE);
						setState(1460);
						match(KEYWORD);
						setState(1461);
						match(TAB);
						setState(1462);
						match(TAB);
						setState(1463);
						match(NEWLINE);
						setState(1464);
						match(KEYWORD);
						setState(1465);
						match(TAB);
						setState(1466);
						match(TAB);
						setState(1467);
						match(TAB);
						setState(1469); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1468);
							word();
							}
							}
							setState(1471); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(1473);
						match(NEWLINE);
						setState(1474);
						match(KEYWORD);
						setState(1475);
						match(TAB);
						setState(1476);
						match(TAB);
						setState(1477);
						match(TAB);
						setState(1478);
						((KrxBasicInfoCompanyContext)_localctx).symbol = word();
						setState(1480);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
						case 1:
							{
							setState(1479);
							((KrxBasicInfoCompanyContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(1483);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
						case 1:
							{
							setState(1482);
							((KrxBasicInfoCompanyContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(1486);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
						case 1:
							{
							setState(1485);
							((KrxBasicInfoCompanyContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(1489);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
						case 1:
							{
							setState(1488);
							((KrxBasicInfoCompanyContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(1492);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
						case 1:
							{
							setState(1491);
							((KrxBasicInfoCompanyContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(1495);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
						case 1:
							{
							setState(1494);
							((KrxBasicInfoCompanyContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(1500);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(1497);
							((KrxBasicInfoCompanyContext)_localctx).symbol7 = word();
							}
							}
							setState(1502);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1503);
						match(NEWLINE);
						setState(1504);
						match(KEYWORD);
						setState(1505);
						match(TAB);
						setState(1506);
						match(TAB);
						setState(1507);
						match(TAB);
						setState(1509); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1508);
							word();
							}
							}
							setState(1511); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(1513);
						match(NEWLINE);
						setState(1514);
						match(KEYWORD);
						setState(1515);
						match(TAB);
						setState(1516);
						match(TAB);
						setState(1517);
						match(TAB);
						setState(1518);
						match(NEWLINE);
						setState(1519);
						match(KEYWORD);
						setState(1520);
						match(TAB);
						setState(1521);
						match(TAB);
						setState(1522);
						match(TAB);
						setState(1523);
						match(NEWLINE);
						setState(1524);
						match(KEYWORD);
						setState(1525);
						match(TAB);
						setState(1526);
						match(TAB);
						setState(1527);
						match(NEWLINE);
						setState(1528);
						match(KEYWORD);
						setState(1529);
						match(TAB);
						setState(1530);
						((KrxBasicInfoCompanyContext)_localctx).ipo = match(DATE);
						setState(1531);
						match(NEWLINE);
						setState(1532);
						match(KEYWORD);
						setState(1533);
						match(TAB);
						setState(1534);
						((KrxBasicInfoCompanyContext)_localctx).type = match(WORD);
						setState(1538);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(1535);
							word();
							}
							}
							setState(1540);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1541);
						match(NEWLINE);
						setState(1542);
						match(KEYWORD);
						setState(1543);
						match(TAB);
						setState(1544);
						match(WORD);
						setState(1545);
						match(NEWLINE);
						setState(1546);
						match(KEYWORD);
						setState(1547);
						match(TAB);
						setState(1551);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(1548);
							word();
							}
							}
							setState(1553);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1554);
						match(NEWLINE);
						setState(1555);
						match(KEYWORD);
						setState(1556);
						match(TAB);
						setState(1557);
						match(WORD);
						setState(1558);
						match(NEWLINE);
						setState(1559);
						match(KEYWORD);
						setState(1560);
						match(TAB);
						setState(1561);
						word();
						setState(1562);
						match(NEWLINE);
						setState(1563);
						match(KEYWORD);
						setState(1564);
						match(TAB);
						setState(1565);
						((KrxBasicInfoCompanyContext)_localctx).volumeOfListedShares = match(NUMBER);
						setState(1566);
						match(NEWLINE);
						setState(1567);
						match(KEYWORD);
						setState(1568);
						match(TAB);
						setState(1569);
						match(NEWLINE);

										ParserService.item(20240112
											, (((KrxBasicInfoCompanyContext)_localctx).code!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).code.start,((KrxBasicInfoCompanyContext)_localctx).code.stop):null)
											, (((KrxBasicInfoCompanyContext)_localctx).symbol!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol.start,((KrxBasicInfoCompanyContext)_localctx).symbol.stop):null), (((KrxBasicInfoCompanyContext)_localctx).symbol1!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol1.start,((KrxBasicInfoCompanyContext)_localctx).symbol1.stop):null), (((KrxBasicInfoCompanyContext)_localctx).symbol2!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol2.start,((KrxBasicInfoCompanyContext)_localctx).symbol2.stop):null), (((KrxBasicInfoCompanyContext)_localctx).symbol3!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol3.start,((KrxBasicInfoCompanyContext)_localctx).symbol3.stop):null), (((KrxBasicInfoCompanyContext)_localctx).symbol4!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol4.start,((KrxBasicInfoCompanyContext)_localctx).symbol4.stop):null), (((KrxBasicInfoCompanyContext)_localctx).symbol5!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol5.start,((KrxBasicInfoCompanyContext)_localctx).symbol5.stop):null), (((KrxBasicInfoCompanyContext)_localctx).symbol6!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol6.start,((KrxBasicInfoCompanyContext)_localctx).symbol6.stop):null), (((KrxBasicInfoCompanyContext)_localctx).symbol7!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol7.start,((KrxBasicInfoCompanyContext)_localctx).symbol7.stop):null)
											, null, null, null, null, null, null, null, null
											, (((KrxBasicInfoCompanyContext)_localctx).type!=null?((KrxBasicInfoCompanyContext)_localctx).type.getText():null)
											, (((KrxBasicInfoCompanyContext)_localctx).ipo!=null?((KrxBasicInfoCompanyContext)_localctx).ipo.getText():null)
											, (((KrxBasicInfoCompanyContext)_localctx).volumeOfListedShares!=null?((KrxBasicInfoCompanyContext)_localctx).volumeOfListedShares.getText():null)
											, null
										);
									
						}
						}
						}
						setState(1574); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==KEYWORD );
					setState(1576);
					match(WORD);
					setState(1577);
					match(TAB);
					setState(1578);
					match(WORD);
					setState(1579);
					match(TAB);
					setState(1580);
					match(DATE);
					setState(1581);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1585); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1587);
			match(KEYWORD);
			setState(1588);
			match(TAB);
			setState(1589);
			match(WORD);
			setState(1590);
			match(TAB);
			setState(1591);
			match(WORD);
			setState(1592);
			match(WORD);
			setState(1593);
			match(WORD);
			setState(1594);
			match(WORD);
			setState(1595);
			match(WORD);
			setState(1596);
			match(WORD);
			setState(1597);
			match(TAB);
			setState(1598);
			match(WORD);
			setState(1599);
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
		enterRule(_localctx, 14, RULE_etfAllPrice);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1601);
			match(KEYWORD);
			setState(1602);
			match(TAB);
			setState(1603);
			match(WORD);
			setState(1604);
			match(TAB);
			setState(1605);
			match(WORD);
			setState(1606);
			match(WORD);
			setState(1607);
			match(WORD);
			setState(1608);
			match(WORD);
			setState(1609);
			match(TAB);
			setState(1610);
			match(WORD);
			setState(1611);
			match(NEWLINE);
			setState(1858); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1612);
				match(WORD);
				setState(1613);
				match(TAB);
				setState(1614);
				match(DATE);
				setState(1615);
				match(TAB);
				setState(1616);
				match(NEWLINE);
				setState(1617);
				match(WORD);
				setState(1618);
				match(TAB);
				setState(1619);
				match(DATE);
				setState(1620);
				match(TAB);
				setState(1621);
				match(NEWLINE);
				setState(1622);
				match(WORD);
				setState(1623);
				match(TAB);
				setState(1624);
				match(DATE);
				setState(1625);
				match(TAB);
				setState(1626);
				match(NEWLINE);
				setState(1627);
				match(WORD);
				setState(1628);
				match(TAB);
				setState(1629);
				match(DATE);
				setState(1630);
				match(TAB);
				setState(1631);
				match(NEWLINE);
				setState(1632);
				match(WORD);
				setState(1633);
				match(TAB);
				setState(1634);
				match(DATE);
				setState(1635);
				match(TAB);
				setState(1636);
				match(NEWLINE);
				setState(1637);
				match(WORD);
				setState(1638);
				match(TAB);
				setState(1639);
				match(DATE);
				setState(1640);
				match(TAB);
				setState(1641);
				match(NEWLINE);
				setState(1642);
				match(WORD);
				setState(1643);
				match(TAB);
				setState(1644);
				match(DATE);
				setState(1645);
				match(TAB);
				setState(1646);
				match(NEWLINE);
				setState(1647);
				match(WORD);
				setState(1648);
				match(TAB);
				setState(1649);
				match(DATE);
				setState(1650);
				match(TAB);
				setState(1651);
				match(WORD);
				setState(1652);
				match(NEWLINE);
				setState(1653);
				match(WORD);
				setState(1654);
				match(TAB);
				setState(1655);
				match(DATE);
				setState(1656);
				match(TAB);
				setState(1657);
				match(NEWLINE);
				setState(1847); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(1847);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
						case 1:
							{
							{
							setState(1658);
							match(WORD);
							setState(1659);
							match(TAB);
							setState(1660);
							match(DATE);
							setState(1661);
							match(TAB);
							setState(1662);
							((EtfAllPriceContext)_localctx).code = match(NUMBER);
							setState(1663);
							match(NEWLINE);
							setState(1664);
							match(WORD);
							setState(1665);
							match(TAB);
							setState(1666);
							match(DATE);
							setState(1667);
							match(TAB);
							setState(1668);
							((EtfAllPriceContext)_localctx).symbol = word();
							setState(1670);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
							case 1:
								{
								setState(1669);
								((EtfAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(1673);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
							case 1:
								{
								setState(1672);
								((EtfAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(1676);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
							case 1:
								{
								setState(1675);
								((EtfAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(1679);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
							case 1:
								{
								setState(1678);
								((EtfAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(1682);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
							case 1:
								{
								setState(1681);
								((EtfAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(1685);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
							case 1:
								{
								setState(1684);
								((EtfAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(1690);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(1687);
								((EtfAllPriceContext)_localctx).symbol7 = word();
								}
								}
								setState(1692);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1693);
							match(NEWLINE);
							setState(1694);
							match(WORD);
							setState(1695);
							match(TAB);
							setState(1696);
							match(DATE);
							setState(1697);
							match(TAB);
							setState(1698);
							((EtfAllPriceContext)_localctx).closing = match(NUMBER);
							setState(1699);
							match(NEWLINE);
							setState(1700);
							match(WORD);
							setState(1701);
							match(TAB);
							setState(1702);
							match(DATE);
							setState(1703);
							match(TAB);
							setState(1704);
							match(NUMBER);
							setState(1705);
							match(NEWLINE);
							setState(1706);
							match(WORD);
							setState(1707);
							match(TAB);
							setState(1708);
							match(DATE);
							setState(1709);
							match(TAB);
							setState(1710);
							match(NUMBER);
							setState(1711);
							match(NEWLINE);
							setState(1712);
							match(WORD);
							setState(1713);
							match(TAB);
							setState(1714);
							match(DATE);
							setState(1715);
							match(TAB);
							setState(1716);
							match(NUMBER);
							setState(1717);
							match(NEWLINE);
							setState(1718);
							match(WORD);
							setState(1719);
							match(TAB);
							setState(1720);
							match(DATE);
							setState(1721);
							match(TAB);
							setState(1722);
							((EtfAllPriceContext)_localctx).market = match(NUMBER);
							setState(1723);
							match(NEWLINE);
							setState(1724);
							match(WORD);
							setState(1725);
							match(TAB);
							setState(1726);
							match(DATE);
							setState(1727);
							match(TAB);
							setState(1728);
							((EtfAllPriceContext)_localctx).high = match(NUMBER);
							setState(1729);
							match(NEWLINE);
							setState(1730);
							match(WORD);
							setState(1731);
							match(TAB);
							setState(1732);
							match(DATE);
							setState(1733);
							match(TAB);
							setState(1734);
							((EtfAllPriceContext)_localctx).low = match(NUMBER);
							setState(1735);
							match(NEWLINE);
							setState(1736);
							match(WORD);
							setState(1737);
							match(TAB);
							setState(1738);
							match(DATE);
							setState(1739);
							match(TAB);
							setState(1740);
							((EtfAllPriceContext)_localctx).volume = match(NUMBER);
							setState(1741);
							match(NEWLINE);
							setState(1742);
							match(WORD);
							setState(1743);
							match(TAB);
							setState(1744);
							match(DATE);
							setState(1745);
							match(TAB);
							setState(1746);
							match(NUMBER);
							setState(1747);
							match(NEWLINE);
							setState(1748);
							match(WORD);
							setState(1749);
							match(TAB);
							setState(1750);
							match(DATE);
							setState(1751);
							match(TAB);
							setState(1752);
							match(NUMBER);
							setState(1753);
							match(NEWLINE);
							setState(1754);
							match(WORD);
							setState(1755);
							match(TAB);
							setState(1756);
							match(DATE);
							setState(1757);
							match(TAB);
							setState(1758);
							match(NUMBER);
							setState(1759);
							match(NEWLINE);
							setState(1760);
							match(WORD);
							setState(1761);
							match(TAB);
							setState(1762);
							match(DATE);
							setState(1763);
							match(TAB);
							setState(1764);
							((EtfAllPriceContext)_localctx).volumeOfListedShares = match(NUMBER);
							setState(1765);
							match(NEWLINE);
							setState(1766);
							match(WORD);
							setState(1767);
							match(TAB);
							setState(1768);
							match(DATE);
							setState(1769);
							match(TAB);
							setState(1771); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(1770);
								word();
								}
								}
								setState(1773); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
							setState(1775);
							match(NEWLINE);
							setState(1776);
							match(WORD);
							setState(1777);
							match(TAB);
							setState(1778);
							match(DATE);
							setState(1779);
							match(TAB);
							setState(1780);
							word();
							setState(1781);
							match(NEWLINE);
							setState(1782);
							match(WORD);
							setState(1783);
							match(TAB);
							setState(1784);
							match(DATE);
							setState(1785);
							match(TAB);
							setState(1786);
							word();
							setState(1787);
							match(NEWLINE);
							setState(1788);
							match(WORD);
							setState(1789);
							match(TAB);
							setState(1790);
							match(DATE);
							setState(1791);
							match(TAB);
							setState(1792);
							word();
							setState(1793);
							match(NEWLINE);
							setState(1794);
							match(WORD);
							setState(1795);
							match(TAB);
							setState(1796);
							((EtfAllPriceContext)_localctx).base = match(DATE);
							setState(1797);
							match(TAB);
							setState(1798);
							match(NEWLINE);

											ParserService.price(20240112
												, (((EtfAllPriceContext)_localctx).code!=null?((EtfAllPriceContext)_localctx).code.getText():null)
												, (((EtfAllPriceContext)_localctx).base!=null?((EtfAllPriceContext)_localctx).base.getText():null), (((EtfAllPriceContext)_localctx).closing!=null?((EtfAllPriceContext)_localctx).closing.getText():null), (((EtfAllPriceContext)_localctx).market!=null?((EtfAllPriceContext)_localctx).market.getText():null), (((EtfAllPriceContext)_localctx).high!=null?((EtfAllPriceContext)_localctx).high.getText():null), (((EtfAllPriceContext)_localctx).low!=null?((EtfAllPriceContext)_localctx).low.getText():null), (((EtfAllPriceContext)_localctx).volume!=null?((EtfAllPriceContext)_localctx).volume.getText():null)
											);
											ParserService.item(20240112
												, (((EtfAllPriceContext)_localctx).code!=null?((EtfAllPriceContext)_localctx).code.getText():null)
												, (((EtfAllPriceContext)_localctx).symbol!=null?_input.getText(((EtfAllPriceContext)_localctx).symbol.start,((EtfAllPriceContext)_localctx).symbol.stop):null), (((EtfAllPriceContext)_localctx).symbol1!=null?_input.getText(((EtfAllPriceContext)_localctx).symbol1.start,((EtfAllPriceContext)_localctx).symbol1.stop):null), (((EtfAllPriceContext)_localctx).symbol2!=null?_input.getText(((EtfAllPriceContext)_localctx).symbol2.start,((EtfAllPriceContext)_localctx).symbol2.stop):null), (((EtfAllPriceContext)_localctx).symbol3!=null?_input.getText(((EtfAllPriceContext)_localctx).symbol3.start,((EtfAllPriceContext)_localctx).symbol3.stop):null), (((EtfAllPriceContext)_localctx).symbol4!=null?_input.getText(((EtfAllPriceContext)_localctx).symbol4.start,((EtfAllPriceContext)_localctx).symbol4.stop):null), (((EtfAllPriceContext)_localctx).symbol5!=null?_input.getText(((EtfAllPriceContext)_localctx).symbol5.start,((EtfAllPriceContext)_localctx).symbol5.stop):null), (((EtfAllPriceContext)_localctx).symbol6!=null?_input.getText(((EtfAllPriceContext)_localctx).symbol6.start,((EtfAllPriceContext)_localctx).symbol6.stop):null), (((EtfAllPriceContext)_localctx).symbol7!=null?_input.getText(((EtfAllPriceContext)_localctx).symbol7.start,((EtfAllPriceContext)_localctx).symbol7.stop):null)
												, null, null, null, null, null, null, null, null
												, "ETF"
												, null
												, (((EtfAllPriceContext)_localctx).volumeOfListedShares!=null?((EtfAllPriceContext)_localctx).volumeOfListedShares.getText():null)
												, null
											);
										
							}
							}
							break;
						case 2:
							{
							{
							setState(1801);
							match(WORD);
							setState(1802);
							match(TAB);
							setState(1803);
							match(DATE);
							setState(1804);
							match(TAB);
							setState(1805);
							match(NUMBER);
							setState(1806);
							((EtfAllPriceContext)_localctx).symbol = word();
							setState(1808);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
							case 1:
								{
								setState(1807);
								((EtfAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(1811);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
							case 1:
								{
								setState(1810);
								((EtfAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(1814);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
							case 1:
								{
								setState(1813);
								((EtfAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(1817);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
							case 1:
								{
								setState(1816);
								((EtfAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(1820);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
							case 1:
								{
								setState(1819);
								((EtfAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(1823);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
							case 1:
								{
								setState(1822);
								((EtfAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(1828);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1825);
									((EtfAllPriceContext)_localctx).symbol7 = word();
									}
									} 
								}
								setState(1830);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
							}
							setState(1831);
							((EtfAllPriceContext)_localctx).closing = match(NUMBER);
							setState(1832);
							match(NEWLINE);
							setState(1833);
							match(WORD);
							setState(1834);
							match(TAB);
							setState(1835);
							((EtfAllPriceContext)_localctx).base = match(DATE);
							setState(1836);
							match(TAB);
							setState(1837);
							match(NUMBER);
							setState(1838);
							match(NUMBER);
							setState(1839);
							match(NUMBER);
							setState(1840);
							match(NUMBER);
							setState(1841);
							match(NUMBER);
							setState(1842);
							match(NUMBER);
							setState(1843);
							match(NUMBER);
							setState(1844);
							match(NEWLINE);

											ParserService.price(20240112
												, (((EtfAllPriceContext)_localctx).code!=null?((EtfAllPriceContext)_localctx).code.getText():null)
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
					setState(1849); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1851);
				match(WORD);
				setState(1852);
				match(TAB);
				setState(1853);
				match(WORD);
				setState(1854);
				match(TAB);
				setState(1855);
				match(DATE);
				setState(1856);
				match(NEWLINE);
				}
				}
				setState(1860); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1862);
			match(KEYWORD);
			setState(1863);
			match(TAB);
			setState(1864);
			match(WORD);
			setState(1865);
			match(TAB);
			setState(1866);
			match(WORD);
			setState(1867);
			match(WORD);
			setState(1868);
			match(WORD);
			setState(1869);
			match(WORD);
			setState(1870);
			match(TAB);
			setState(1871);
			match(WORD);
			setState(1872);
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
		enterRule(_localctx, 16, RULE_companyAllPrice);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1874);
			match(KEYWORD);
			setState(1875);
			match(TAB);
			setState(1876);
			match(WORD);
			setState(1877);
			match(TAB);
			setState(1878);
			match(WORD);
			setState(1879);
			match(WORD);
			setState(1880);
			match(WORD);
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
			match(NEWLINE);
			setState(2369); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1887);
				match(WORD);
				setState(1888);
				match(TAB);
				setState(1889);
				match(DATE);
				setState(1890);
				match(TAB);
				setState(1891);
				match(NEWLINE);
				setState(1892);
				match(WORD);
				setState(1893);
				match(TAB);
				setState(1894);
				match(DATE);
				setState(1895);
				match(TAB);
				setState(1896);
				match(NEWLINE);
				setState(1897);
				match(WORD);
				setState(1898);
				match(TAB);
				setState(1899);
				match(DATE);
				setState(1900);
				match(TAB);
				setState(1901);
				match(NEWLINE);
				setState(1902);
				match(WORD);
				setState(1903);
				match(TAB);
				setState(1904);
				match(DATE);
				setState(1905);
				match(TAB);
				setState(1906);
				match(TAB);
				setState(1907);
				match(TAB);
				setState(1908);
				match(TAB);
				setState(1909);
				match(TAB);
				setState(1910);
				match(NEWLINE);
				setState(1911);
				match(WORD);
				setState(1912);
				match(TAB);
				setState(1913);
				match(DATE);
				setState(1914);
				match(TAB);
				setState(1915);
				match(TAB);
				setState(1916);
				match(TAB);
				setState(1917);
				match(NEWLINE);
				setState(1918);
				match(WORD);
				setState(1919);
				match(TAB);
				setState(1920);
				match(DATE);
				setState(1921);
				match(TAB);
				setState(1922);
				match(TAB);
				setState(1923);
				match(TAB);
				setState(1924);
				match(TAB);
				setState(1925);
				match(TAB);
				setState(1926);
				match(NEWLINE);
				setState(1927);
				match(WORD);
				setState(1928);
				match(TAB);
				setState(1929);
				match(DATE);
				setState(1930);
				match(TAB);
				setState(1931);
				match(TAB);
				setState(1932);
				match(TAB);
				setState(1933);
				match(TAB);
				setState(1934);
				match(TAB);
				setState(1935);
				match(NEWLINE);
				setState(1936);
				match(WORD);
				setState(1937);
				match(TAB);
				setState(1938);
				match(DATE);
				setState(1939);
				match(TAB);
				setState(1940);
				match(TAB);
				setState(1941);
				match(TAB);
				setState(1942);
				match(TAB);
				setState(1943);
				match(NEWLINE);
				setState(1944);
				match(WORD);
				setState(1945);
				match(TAB);
				setState(1946);
				match(DATE);
				setState(1947);
				match(TAB);
				setState(1948);
				match(NEWLINE);
				setState(1949);
				match(WORD);
				setState(1950);
				match(TAB);
				setState(1951);
				match(DATE);
				setState(1952);
				match(TAB);
				setState(1953);
				match(NEWLINE);
				setState(1954);
				match(WORD);
				setState(1955);
				match(TAB);
				setState(1956);
				match(DATE);
				setState(1957);
				match(TAB);
				setState(1958);
				match(TAB);
				setState(1959);
				match(TAB);
				setState(1960);
				match(TAB);
				setState(1961);
				match(TAB);
				setState(1962);
				match(NEWLINE);
				setState(1963);
				match(WORD);
				setState(1964);
				match(TAB);
				setState(1965);
				match(DATE);
				setState(1966);
				match(TAB);
				setState(1967);
				match(TAB);
				setState(1968);
				match(TAB);
				setState(1969);
				match(NEWLINE);
				setState(1970);
				match(WORD);
				setState(1971);
				match(TAB);
				setState(1972);
				match(DATE);
				setState(1973);
				match(TAB);
				setState(1974);
				match(TAB);
				setState(1975);
				match(TAB);
				setState(1976);
				match(TAB);
				setState(1977);
				match(TAB);
				setState(1978);
				match(NEWLINE);
				setState(1979);
				match(WORD);
				setState(1980);
				match(TAB);
				setState(1981);
				match(DATE);
				setState(1982);
				match(TAB);
				setState(1983);
				match(TAB);
				setState(1984);
				match(TAB);
				setState(1985);
				match(TAB);
				setState(1986);
				match(TAB);
				setState(1987);
				match(NEWLINE);
				setState(1988);
				match(WORD);
				setState(1989);
				match(TAB);
				setState(1990);
				match(DATE);
				setState(1991);
				match(TAB);
				setState(1992);
				match(TAB);
				setState(1993);
				match(TAB);
				setState(1994);
				match(TAB);
				setState(1995);
				match(NEWLINE);
				setState(1996);
				match(WORD);
				setState(1997);
				match(TAB);
				setState(1998);
				match(DATE);
				setState(1999);
				match(TAB);
				setState(2000);
				match(NEWLINE);
				setState(2001);
				match(WORD);
				setState(2002);
				match(TAB);
				setState(2003);
				match(DATE);
				setState(2004);
				match(TAB);
				setState(2005);
				match(NEWLINE);
				setState(2006);
				match(WORD);
				setState(2007);
				match(TAB);
				setState(2008);
				match(DATE);
				setState(2009);
				match(TAB);
				setState(2010);
				match(NEWLINE);
				setState(2011);
				match(WORD);
				setState(2012);
				match(TAB);
				setState(2013);
				match(DATE);
				setState(2014);
				match(TAB);
				setState(2015);
				match(NEWLINE);
				setState(2016);
				match(WORD);
				setState(2017);
				match(TAB);
				setState(2018);
				match(DATE);
				setState(2019);
				match(TAB);
				setState(2020);
				match(TAB);
				setState(2021);
				match(TAB);
				setState(2022);
				match(TAB);
				setState(2023);
				match(TAB);
				setState(2024);
				match(NEWLINE);
				setState(2025);
				match(WORD);
				setState(2026);
				match(TAB);
				setState(2027);
				match(DATE);
				setState(2028);
				match(TAB);
				setState(2029);
				match(TAB);
				setState(2030);
				match(TAB);
				setState(2031);
				match(TAB);
				setState(2032);
				match(NEWLINE);
				setState(2033);
				match(WORD);
				setState(2034);
				match(TAB);
				setState(2035);
				match(DATE);
				setState(2036);
				match(TAB);
				setState(2037);
				match(TAB);
				setState(2038);
				match(TAB);
				setState(2039);
				match(TAB);
				setState(2040);
				match(TAB);
				setState(2041);
				match(NEWLINE);
				setState(2042);
				match(WORD);
				setState(2043);
				match(TAB);
				setState(2044);
				match(DATE);
				setState(2045);
				match(TAB);
				setState(2046);
				match(TAB);
				setState(2047);
				match(TAB);
				setState(2048);
				match(TAB);
				setState(2049);
				match(TAB);
				setState(2050);
				match(NEWLINE);
				setState(2051);
				match(WORD);
				setState(2052);
				match(TAB);
				setState(2053);
				match(DATE);
				setState(2054);
				match(TAB);
				setState(2055);
				match(TAB);
				setState(2056);
				match(TAB);
				setState(2057);
				match(TAB);
				setState(2058);
				match(NEWLINE);
				setState(2059);
				match(WORD);
				setState(2060);
				match(TAB);
				setState(2061);
				match(DATE);
				setState(2062);
				match(TAB);
				setState(2063);
				match(NEWLINE);
				setState(2064);
				match(WORD);
				setState(2065);
				match(TAB);
				setState(2066);
				match(DATE);
				setState(2067);
				match(TAB);
				setState(2068);
				match(NEWLINE);
				setState(2069);
				match(WORD);
				setState(2070);
				match(TAB);
				setState(2071);
				match(DATE);
				setState(2072);
				match(TAB);
				setState(2073);
				match(NEWLINE);
				setState(2074);
				match(WORD);
				setState(2075);
				match(TAB);
				setState(2076);
				match(DATE);
				setState(2077);
				match(TAB);
				setState(2078);
				match(NEWLINE);
				setState(2079);
				match(WORD);
				setState(2080);
				match(TAB);
				setState(2081);
				match(DATE);
				setState(2082);
				match(TAB);
				setState(2083);
				match(TAB);
				setState(2084);
				match(TAB);
				setState(2085);
				match(TAB);
				setState(2086);
				match(TAB);
				setState(2087);
				match(NEWLINE);
				setState(2088);
				match(WORD);
				setState(2089);
				match(TAB);
				setState(2090);
				match(DATE);
				setState(2091);
				match(TAB);
				setState(2092);
				match(TAB);
				setState(2093);
				match(TAB);
				setState(2094);
				match(NEWLINE);
				setState(2095);
				match(WORD);
				setState(2096);
				match(TAB);
				setState(2097);
				match(DATE);
				setState(2098);
				match(TAB);
				setState(2099);
				match(TAB);
				setState(2100);
				match(TAB);
				setState(2101);
				match(TAB);
				setState(2102);
				match(TAB);
				setState(2103);
				match(NEWLINE);
				setState(2104);
				match(WORD);
				setState(2105);
				match(TAB);
				setState(2106);
				match(DATE);
				setState(2107);
				match(TAB);
				setState(2108);
				match(TAB);
				setState(2109);
				match(TAB);
				setState(2110);
				match(TAB);
				setState(2111);
				match(TAB);
				setState(2112);
				match(NEWLINE);
				setState(2113);
				match(WORD);
				setState(2114);
				match(TAB);
				setState(2115);
				match(DATE);
				setState(2116);
				match(TAB);
				setState(2117);
				match(TAB);
				setState(2118);
				match(TAB);
				setState(2119);
				match(TAB);
				setState(2120);
				match(NEWLINE);
				setState(2121);
				match(WORD);
				setState(2122);
				match(TAB);
				setState(2123);
				match(DATE);
				setState(2124);
				match(TAB);
				setState(2125);
				match(NEWLINE);
				setState(2126);
				match(WORD);
				setState(2127);
				match(TAB);
				setState(2128);
				match(DATE);
				setState(2129);
				match(TAB);
				setState(2130);
				match(NEWLINE);
				setState(2131);
				match(WORD);
				setState(2132);
				match(TAB);
				setState(2133);
				match(DATE);
				setState(2134);
				match(TAB);
				setState(2135);
				match(NEWLINE);
				setState(2136);
				match(WORD);
				setState(2137);
				match(TAB);
				setState(2138);
				match(DATE);
				setState(2139);
				match(TAB);
				setState(2140);
				match(TAB);
				setState(2141);
				match(TAB);
				setState(2142);
				match(TAB);
				setState(2143);
				match(TAB);
				setState(2144);
				match(NEWLINE);
				setState(2145);
				match(WORD);
				setState(2146);
				match(TAB);
				setState(2147);
				match(DATE);
				setState(2148);
				match(TAB);
				setState(2149);
				match(TAB);
				setState(2150);
				match(TAB);
				setState(2151);
				match(NEWLINE);
				setState(2152);
				match(WORD);
				setState(2153);
				match(TAB);
				setState(2154);
				match(DATE);
				setState(2155);
				match(TAB);
				setState(2156);
				match(TAB);
				setState(2157);
				match(TAB);
				setState(2158);
				match(TAB);
				setState(2159);
				match(TAB);
				setState(2160);
				match(NEWLINE);
				setState(2161);
				match(WORD);
				setState(2162);
				match(TAB);
				setState(2163);
				match(DATE);
				setState(2164);
				match(TAB);
				setState(2165);
				match(TAB);
				setState(2166);
				match(TAB);
				setState(2167);
				match(TAB);
				setState(2168);
				match(TAB);
				setState(2169);
				match(NEWLINE);
				setState(2170);
				match(WORD);
				setState(2171);
				match(TAB);
				setState(2172);
				match(DATE);
				setState(2173);
				match(TAB);
				setState(2174);
				match(TAB);
				setState(2175);
				match(TAB);
				setState(2176);
				match(TAB);
				setState(2177);
				match(NEWLINE);
				setState(2178);
				match(WORD);
				setState(2179);
				match(TAB);
				setState(2180);
				match(DATE);
				setState(2181);
				match(TAB);
				setState(2182);
				match(WORD);
				setState(2183);
				match(NEWLINE);
				setState(2184);
				match(WORD);
				setState(2185);
				match(TAB);
				setState(2186);
				match(DATE);
				setState(2187);
				match(TAB);
				setState(2188);
				match(NEWLINE);
				setState(2358); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(2358);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
						case 1:
							{
							{
							setState(2189);
							match(WORD);
							setState(2190);
							match(TAB);
							setState(2191);
							match(DATE);
							setState(2192);
							match(TAB);
							setState(2193);
							((CompanyAllPriceContext)_localctx).code = word();
							setState(2194);
							match(NEWLINE);
							setState(2195);
							match(WORD);
							setState(2196);
							match(TAB);
							setState(2197);
							match(DATE);
							setState(2198);
							match(TAB);
							setState(2199);
							((CompanyAllPriceContext)_localctx).symbol = word();
							setState(2201);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
							case 1:
								{
								setState(2200);
								((CompanyAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(2204);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
							case 1:
								{
								setState(2203);
								((CompanyAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(2207);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
							case 1:
								{
								setState(2206);
								((CompanyAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(2210);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
							case 1:
								{
								setState(2209);
								((CompanyAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(2213);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
							case 1:
								{
								setState(2212);
								((CompanyAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(2216);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
							case 1:
								{
								setState(2215);
								((CompanyAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(2221);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(2218);
								((CompanyAllPriceContext)_localctx).symbol7 = word();
								}
								}
								setState(2223);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(2224);
							match(NEWLINE);
							setState(2225);
							match(WORD);
							setState(2226);
							match(TAB);
							setState(2227);
							match(DATE);
							setState(2228);
							match(TAB);
							setState(2229);
							((CompanyAllPriceContext)_localctx).type = word();
							setState(2233);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(2230);
								word();
								}
								}
								setState(2235);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(2236);
							match(NEWLINE);
							setState(2237);
							match(WORD);
							setState(2238);
							match(TAB);
							setState(2239);
							match(DATE);
							setState(2240);
							match(TAB);
							setState(2242);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==WORD) {
								{
								setState(2241);
								match(WORD);
								}
							}

							setState(2244);
							match(NEWLINE);
							setState(2245);
							match(WORD);
							setState(2246);
							match(TAB);
							setState(2247);
							match(DATE);
							setState(2248);
							match(TAB);
							setState(2249);
							((CompanyAllPriceContext)_localctx).closing = match(NUMBER);
							setState(2250);
							match(NEWLINE);
							setState(2251);
							match(WORD);
							setState(2252);
							match(TAB);
							setState(2253);
							match(DATE);
							setState(2254);
							match(TAB);
							setState(2255);
							match(NUMBER);
							setState(2256);
							match(NEWLINE);
							setState(2257);
							match(WORD);
							setState(2258);
							match(TAB);
							setState(2259);
							match(DATE);
							setState(2260);
							match(TAB);
							setState(2261);
							match(NUMBER);
							setState(2262);
							match(NEWLINE);
							setState(2263);
							match(WORD);
							setState(2264);
							match(TAB);
							setState(2265);
							match(DATE);
							setState(2266);
							match(TAB);
							setState(2267);
							((CompanyAllPriceContext)_localctx).market = match(NUMBER);
							setState(2268);
							match(NEWLINE);
							setState(2269);
							match(WORD);
							setState(2270);
							match(TAB);
							setState(2271);
							match(DATE);
							setState(2272);
							match(TAB);
							setState(2273);
							((CompanyAllPriceContext)_localctx).high = match(NUMBER);
							setState(2274);
							match(NEWLINE);
							setState(2275);
							match(WORD);
							setState(2276);
							match(TAB);
							setState(2277);
							match(DATE);
							setState(2278);
							match(TAB);
							setState(2279);
							((CompanyAllPriceContext)_localctx).low = match(NUMBER);
							setState(2280);
							match(NEWLINE);
							setState(2281);
							match(WORD);
							setState(2282);
							match(TAB);
							setState(2283);
							match(DATE);
							setState(2284);
							match(TAB);
							setState(2285);
							((CompanyAllPriceContext)_localctx).volume = match(NUMBER);
							setState(2286);
							match(NEWLINE);
							setState(2287);
							match(WORD);
							setState(2288);
							match(TAB);
							setState(2289);
							match(DATE);
							setState(2290);
							match(TAB);
							setState(2291);
							match(NUMBER);
							setState(2292);
							match(NEWLINE);
							setState(2293);
							match(WORD);
							setState(2294);
							match(TAB);
							setState(2295);
							match(DATE);
							setState(2296);
							match(TAB);
							setState(2297);
							match(NUMBER);
							setState(2298);
							match(NEWLINE);
							setState(2299);
							match(WORD);
							setState(2300);
							match(TAB);
							setState(2301);
							match(DATE);
							setState(2302);
							match(TAB);
							setState(2303);
							((CompanyAllPriceContext)_localctx).volumeOfListedShares = match(NUMBER);
							setState(2304);
							match(NEWLINE);
							setState(2305);
							match(WORD);
							setState(2306);
							match(TAB);
							setState(2307);
							((CompanyAllPriceContext)_localctx).base = match(DATE);
							setState(2308);
							match(TAB);
							setState(2309);
							match(NEWLINE);

											ParserService.price(20240112
												, (((CompanyAllPriceContext)_localctx).code!=null?_input.getText(((CompanyAllPriceContext)_localctx).code.start,((CompanyAllPriceContext)_localctx).code.stop):null)
												, (((CompanyAllPriceContext)_localctx).base!=null?((CompanyAllPriceContext)_localctx).base.getText():null), (((CompanyAllPriceContext)_localctx).closing!=null?((CompanyAllPriceContext)_localctx).closing.getText():null), (((CompanyAllPriceContext)_localctx).market!=null?((CompanyAllPriceContext)_localctx).market.getText():null), (((CompanyAllPriceContext)_localctx).high!=null?((CompanyAllPriceContext)_localctx).high.getText():null), (((CompanyAllPriceContext)_localctx).low!=null?((CompanyAllPriceContext)_localctx).low.getText():null), (((CompanyAllPriceContext)_localctx).volume!=null?((CompanyAllPriceContext)_localctx).volume.getText():null)
											);
											ParserService.item(20240112
												, (((CompanyAllPriceContext)_localctx).code!=null?_input.getText(((CompanyAllPriceContext)_localctx).code.start,((CompanyAllPriceContext)_localctx).code.stop):null)
												, (((CompanyAllPriceContext)_localctx).symbol!=null?_input.getText(((CompanyAllPriceContext)_localctx).symbol.start,((CompanyAllPriceContext)_localctx).symbol.stop):null), (((CompanyAllPriceContext)_localctx).symbol1!=null?_input.getText(((CompanyAllPriceContext)_localctx).symbol1.start,((CompanyAllPriceContext)_localctx).symbol1.stop):null), (((CompanyAllPriceContext)_localctx).symbol2!=null?_input.getText(((CompanyAllPriceContext)_localctx).symbol2.start,((CompanyAllPriceContext)_localctx).symbol2.stop):null), (((CompanyAllPriceContext)_localctx).symbol3!=null?_input.getText(((CompanyAllPriceContext)_localctx).symbol3.start,((CompanyAllPriceContext)_localctx).symbol3.stop):null), (((CompanyAllPriceContext)_localctx).symbol4!=null?_input.getText(((CompanyAllPriceContext)_localctx).symbol4.start,((CompanyAllPriceContext)_localctx).symbol4.stop):null), (((CompanyAllPriceContext)_localctx).symbol5!=null?_input.getText(((CompanyAllPriceContext)_localctx).symbol5.start,((CompanyAllPriceContext)_localctx).symbol5.stop):null), (((CompanyAllPriceContext)_localctx).symbol6!=null?_input.getText(((CompanyAllPriceContext)_localctx).symbol6.start,((CompanyAllPriceContext)_localctx).symbol6.stop):null), (((CompanyAllPriceContext)_localctx).symbol7!=null?_input.getText(((CompanyAllPriceContext)_localctx).symbol7.start,((CompanyAllPriceContext)_localctx).symbol7.stop):null)
												, null, null, null, null, null, null, null, null
												, (((CompanyAllPriceContext)_localctx).type!=null?_input.getText(((CompanyAllPriceContext)_localctx).type.start,((CompanyAllPriceContext)_localctx).type.stop):null)
												, null
												, (((CompanyAllPriceContext)_localctx).volumeOfListedShares!=null?((CompanyAllPriceContext)_localctx).volumeOfListedShares.getText():null)
												, null
											);
										
							}
							}
							break;
						case 2:
							{
							{
							setState(2312);
							match(WORD);
							setState(2313);
							match(TAB);
							setState(2314);
							match(DATE);
							setState(2315);
							match(TAB);
							setState(2316);
							match(NUMBER);
							setState(2317);
							((CompanyAllPriceContext)_localctx).symbol = word();
							setState(2319);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
							case 1:
								{
								setState(2318);
								((CompanyAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(2322);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
							case 1:
								{
								setState(2321);
								((CompanyAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(2325);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
							case 1:
								{
								setState(2324);
								((CompanyAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(2328);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
							case 1:
								{
								setState(2327);
								((CompanyAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(2331);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
							case 1:
								{
								setState(2330);
								((CompanyAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(2334);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
							case 1:
								{
								setState(2333);
								((CompanyAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(2339);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(2336);
									((CompanyAllPriceContext)_localctx).symbol7 = word();
									}
									} 
								}
								setState(2341);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
							}
							setState(2342);
							((CompanyAllPriceContext)_localctx).closing = match(NUMBER);
							setState(2343);
							match(NEWLINE);
							setState(2344);
							match(WORD);
							setState(2345);
							match(TAB);
							setState(2346);
							((CompanyAllPriceContext)_localctx).base = match(DATE);
							setState(2347);
							match(TAB);
							setState(2348);
							match(NUMBER);
							setState(2349);
							match(NUMBER);
							setState(2350);
							match(NUMBER);
							setState(2351);
							match(NUMBER);
							setState(2352);
							match(NUMBER);
							setState(2353);
							match(NUMBER);
							setState(2354);
							match(NUMBER);
							setState(2355);
							match(NEWLINE);

											ParserService.price(20240112
												, (((CompanyAllPriceContext)_localctx).code!=null?_input.getText(((CompanyAllPriceContext)_localctx).code.start,((CompanyAllPriceContext)_localctx).code.stop):null)
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
					setState(2360); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2362);
				match(WORD);
				setState(2363);
				match(TAB);
				setState(2364);
				match(WORD);
				setState(2365);
				match(TAB);
				setState(2366);
				match(DATE);
				setState(2367);
				match(NEWLINE);
				}
				}
				setState(2371); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(2373);
			match(KEYWORD);
			setState(2374);
			match(TAB);
			setState(2375);
			match(WORD);
			setState(2376);
			match(TAB);
			setState(2377);
			match(WORD);
			setState(2378);
			match(WORD);
			setState(2379);
			match(WORD);
			setState(2380);
			match(WORD);
			setState(2381);
			match(WORD);
			setState(2382);
			match(WORD);
			setState(2383);
			match(TAB);
			setState(2384);
			match(WORD);
			setState(2385);
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
		enterRule(_localctx, 18, RULE_crawlPriceKrx);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2387);
			match(KEYWORD);
			setState(2388);
			match(TAB);
			setState(2389);
			match(WORD);
			setState(2390);
			match(TAB);
			setState(2391);
			match(WORD);
			setState(2392);
			match(TAB);
			setState(2393);
			match(WORD);
			setState(2394);
			match(NEWLINE);
			setState(2580); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(2580);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					{
					setState(2395);
					match(NUMBER);
					setState(2396);
					match(TAB);
					setState(2397);
					match(WORD);
					setState(2398);
					match(WORD);
					setState(2399);
					match(TAB);
					setState(2400);
					match(NEWLINE);
					}
					}
					break;
				case WORD:
					{
					setState(2570); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(2568);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
							case 1:
								{
								{
								setState(2401);
								match(WORD);
								setState(2402);
								match(TAB);
								setState(2403);
								match(NUMBER);
								setState(2404);
								match(TAB);
								setState(2405);
								match(WORD);
								setState(2406);
								match(TAB);
								setState(2407);
								match(WORD);
								setState(2408);
								match(TAB);
								setState(2409);
								match(WORD);
								setState(2410);
								match(TAB);
								setState(2411);
								match(WORD);
								setState(2412);
								match(TAB);
								setState(2413);
								match(WORD);
								setState(2414);
								match(TAB);
								setState(2415);
								match(WORD);
								setState(2416);
								match(TAB);
								setState(2417);
								match(WORD);
								setState(2418);
								match(TAB);
								setState(2419);
								match(WORD);
								setState(2420);
								match(TAB);
								setState(2421);
								match(WORD);
								setState(2422);
								match(TAB);
								setState(2423);
								match(WORD);
								setState(2424);
								match(TAB);
								setState(2425);
								match(WORD);
								setState(2426);
								match(TAB);
								setState(2427);
								match(NEWLINE);
								setState(2456); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(2428);
										match(WORD);
										setState(2429);
										match(TAB);
										setState(2430);
										((CrawlPriceKrxContext)_localctx).code = match(NUMBER);
										setState(2431);
										match(TAB);
										setState(2432);
										((CrawlPriceKrxContext)_localctx).base = match(DATE);
										setState(2433);
										match(TAB);
										setState(2434);
										((CrawlPriceKrxContext)_localctx).closing = match(NUMBER);
										setState(2435);
										match(TAB);
										setState(2436);
										match(NUMBER);
										setState(2437);
										match(TAB);
										setState(2438);
										match(NUMBER);
										setState(2439);
										match(TAB);
										setState(2440);
										((CrawlPriceKrxContext)_localctx).market = match(NUMBER);
										setState(2441);
										match(TAB);
										setState(2442);
										((CrawlPriceKrxContext)_localctx).high = match(NUMBER);
										setState(2443);
										match(TAB);
										setState(2444);
										((CrawlPriceKrxContext)_localctx).low = match(NUMBER);
										setState(2445);
										match(TAB);
										setState(2446);
										((CrawlPriceKrxContext)_localctx).volume = match(NUMBER);
										setState(2447);
										match(TAB);
										setState(2448);
										match(NUMBER);
										setState(2449);
										match(TAB);
										setState(2450);
										match(NUMBER);
										setState(2451);
										match(TAB);
										setState(2452);
										match(NUMBER);
										setState(2453);
										match(TAB);
										setState(2454);
										match(NEWLINE);

																ParserService.price(20240112
																	, (((CrawlPriceKrxContext)_localctx).code!=null?((CrawlPriceKrxContext)_localctx).code.getText():null)
																	, (((CrawlPriceKrxContext)_localctx).base!=null?((CrawlPriceKrxContext)_localctx).base.getText():null), (((CrawlPriceKrxContext)_localctx).closing!=null?((CrawlPriceKrxContext)_localctx).closing.getText():null), (((CrawlPriceKrxContext)_localctx).market!=null?((CrawlPriceKrxContext)_localctx).market.getText():null), (((CrawlPriceKrxContext)_localctx).high!=null?((CrawlPriceKrxContext)_localctx).high.getText():null), (((CrawlPriceKrxContext)_localctx).low!=null?((CrawlPriceKrxContext)_localctx).low.getText():null), (((CrawlPriceKrxContext)_localctx).volume!=null?((CrawlPriceKrxContext)_localctx).volume.getText():null)
																);
															
										}
										}
										break;
									default:
										throw new NoViableAltException(this);
									}
									setState(2458); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
								} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
								}
								}
								break;
							case 2:
								{
								{
								setState(2460);
								match(WORD);
								setState(2461);
								match(TAB);
								setState(2462);
								match(NUMBER);
								setState(2463);
								match(TAB);
								setState(2464);
								match(WORD);
								setState(2465);
								match(TAB);
								setState(2466);
								match(WORD);
								setState(2467);
								match(TAB);
								setState(2468);
								match(WORD);
								setState(2469);
								match(TAB);
								setState(2470);
								match(WORD);
								setState(2471);
								match(TAB);
								setState(2472);
								match(WORD);
								setState(2473);
								match(TAB);
								setState(2474);
								match(WORD);
								setState(2475);
								match(TAB);
								setState(2476);
								match(WORD);
								setState(2477);
								match(TAB);
								setState(2478);
								match(WORD);
								setState(2479);
								match(TAB);
								setState(2480);
								match(WORD);
								setState(2481);
								match(TAB);
								setState(2482);
								match(WORD);
								setState(2483);
								match(TAB);
								setState(2484);
								match(WORD);
								setState(2485);
								match(TAB);
								setState(2486);
								match(WORD);
								setState(2487);
								match(TAB);
								setState(2488);
								match(WORD);
								setState(2489);
								match(TAB);
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
								match(TAB);
								setState(2496);
								match(WORD);
								setState(2497);
								match(TAB);
								setState(2498);
								match(NEWLINE);
								setState(2564); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(2499);
										match(WORD);
										setState(2500);
										match(TAB);
										setState(2501);
										((CrawlPriceKrxContext)_localctx).code = match(NUMBER);
										setState(2502);
										match(TAB);
										setState(2503);
										((CrawlPriceKrxContext)_localctx).base = match(DATE);
										setState(2504);
										match(TAB);
										setState(2505);
										((CrawlPriceKrxContext)_localctx).closing = match(NUMBER);
										setState(2506);
										match(TAB);
										setState(2507);
										match(NUMBER);
										setState(2508);
										match(TAB);
										setState(2509);
										match(NUMBER);
										setState(2510);
										match(TAB);
										setState(2511);
										match(NUMBER);
										setState(2512);
										match(TAB);
										setState(2513);
										((CrawlPriceKrxContext)_localctx).market = match(NUMBER);
										setState(2514);
										match(TAB);
										setState(2515);
										((CrawlPriceKrxContext)_localctx).high = match(NUMBER);
										setState(2516);
										match(TAB);
										setState(2517);
										((CrawlPriceKrxContext)_localctx).low = match(NUMBER);
										setState(2518);
										match(TAB);
										setState(2519);
										((CrawlPriceKrxContext)_localctx).volume = match(NUMBER);
										setState(2520);
										match(TAB);
										setState(2521);
										match(NUMBER);
										setState(2522);
										match(TAB);
										setState(2523);
										match(NUMBER);
										setState(2524);
										match(TAB);
										setState(2525);
										match(NUMBER);
										setState(2526);
										match(TAB);
										setState(2527);
										match(NUMBER);
										setState(2528);
										match(TAB);
										setState(2529);
										((CrawlPriceKrxContext)_localctx).symbol = word();
										setState(2531);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
										case 1:
											{
											setState(2530);
											((CrawlPriceKrxContext)_localctx).symbol1 = word();
											}
											break;
										}
										setState(2534);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
										case 1:
											{
											setState(2533);
											((CrawlPriceKrxContext)_localctx).symbol2 = word();
											}
											break;
										}
										setState(2537);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
										case 1:
											{
											setState(2536);
											((CrawlPriceKrxContext)_localctx).symbol3 = word();
											}
											break;
										}
										setState(2540);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
										case 1:
											{
											setState(2539);
											((CrawlPriceKrxContext)_localctx).symbol4 = word();
											}
											break;
										}
										setState(2543);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
										case 1:
											{
											setState(2542);
											((CrawlPriceKrxContext)_localctx).symbol5 = word();
											}
											break;
										}
										setState(2546);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
										case 1:
											{
											setState(2545);
											((CrawlPriceKrxContext)_localctx).symbol6 = word();
											}
											break;
										}
										setState(2551);
										_errHandler.sync(this);
										_la = _input.LA(1);
										while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
											{
											{
											setState(2548);
											((CrawlPriceKrxContext)_localctx).symbol7 = word();
											}
											}
											setState(2553);
											_errHandler.sync(this);
											_la = _input.LA(1);
										}
										setState(2554);
										match(TAB);
										setState(2555);
										match(NUMBER);
										setState(2556);
										match(TAB);
										setState(2557);
										match(NUMBER);
										setState(2558);
										match(TAB);
										setState(2559);
										match(NUMBER);
										setState(2560);
										match(TAB);
										setState(2561);
										match(NEWLINE);

																ParserService.price(20240112
																	, (((CrawlPriceKrxContext)_localctx).code!=null?((CrawlPriceKrxContext)_localctx).code.getText():null)
																	, (((CrawlPriceKrxContext)_localctx).base!=null?((CrawlPriceKrxContext)_localctx).base.getText():null), (((CrawlPriceKrxContext)_localctx).closing!=null?((CrawlPriceKrxContext)_localctx).closing.getText():null), (((CrawlPriceKrxContext)_localctx).market!=null?((CrawlPriceKrxContext)_localctx).market.getText():null), (((CrawlPriceKrxContext)_localctx).high!=null?((CrawlPriceKrxContext)_localctx).high.getText():null), (((CrawlPriceKrxContext)_localctx).low!=null?((CrawlPriceKrxContext)_localctx).low.getText():null), (((CrawlPriceKrxContext)_localctx).volume!=null?((CrawlPriceKrxContext)_localctx).volume.getText():null)
																);
															
										}
										}
										break;
									default:
										throw new NoViableAltException(this);
									}
									setState(2566); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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
						setState(2572); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(2574);
					match(WORD);
					setState(2575);
					match(TAB);
					setState(2576);
					match(WORD);
					setState(2577);
					match(TAB);
					setState(2578);
					match(DATE);
					setState(2579);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2582); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER || _la==WORD );
			setState(2584);
			match(KEYWORD);
			setState(2585);
			match(TAB);
			setState(2586);
			match(WORD);
			setState(2587);
			match(TAB);
			setState(2588);
			match(WORD);
			setState(2589);
			match(TAB);
			setState(2590);
			match(WORD);
			setState(2591);
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
		enterRule(_localctx, 20, RULE_crawlItemEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2593);
			match(KEYWORD);
			setState(2594);
			match(TAB);
			setState(2595);
			match(WORD);
			setState(2596);
			match(TAB);
			setState(2597);
			match(WORD);
			setState(2598);
			match(WORD);
			setState(2599);
			match(WORD);
			setState(2600);
			match(TAB);
			setState(2601);
			match(WORD);
			setState(2602);
			match(TAB);
			setState(2603);
			match(WORD);
			setState(2604);
			match(NEWLINE);
			setState(2733); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2605);
				match(WORD);
				setState(2606);
				match(TAB);
				setState(2607);
				match(NEWLINE);
				setState(2608);
				match(WORD);
				setState(2609);
				match(TAB);
				setState(2610);
				match(WORD);
				setState(2611);
				match(TAB);
				setState(2612);
				match(WORD);
				setState(2613);
				match(TAB);
				setState(2614);
				match(TAB);
				setState(2615);
				match(WORD);
				setState(2616);
				match(TAB);
				setState(2617);
				match(WORD);
				setState(2618);
				match(TAB);
				setState(2619);
				match(WORD);
				setState(2620);
				match(TAB);
				setState(2621);
				match(WORD);
				setState(2622);
				match(NEWLINE);
				setState(2623);
				match(WORD);
				setState(2624);
				match(TAB);
				setState(2625);
				match(TAB);
				setState(2626);
				match(TAB);
				setState(2627);
				match(WORD);
				setState(2628);
				match(TAB);
				setState(2629);
				match(TAB);
				setState(2630);
				match(TAB);
				setState(2631);
				match(TAB);
				setState(2632);
				match(TAB);
				setState(2633);
				match(TAB);
				setState(2634);
				match(WORD);
				setState(2635);
				match(TAB);
				setState(2636);
				match(WORD);
				setState(2637);
				match(TAB);
				setState(2638);
				match(NEWLINE);
				setState(2722); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2639);
						((CrawlItemEtfContext)_localctx).type = match(WORD);
						setState(2640);
						match(TAB);
						setState(2641);
						match(TAB);
						setState(2642);
						((CrawlItemEtfContext)_localctx).symbol = word();
						setState(2644);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
						case 1:
							{
							setState(2643);
							((CrawlItemEtfContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(2647);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
						case 1:
							{
							setState(2646);
							((CrawlItemEtfContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(2650);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
						case 1:
							{
							setState(2649);
							((CrawlItemEtfContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(2653);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
						case 1:
							{
							setState(2652);
							((CrawlItemEtfContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(2656);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
						case 1:
							{
							setState(2655);
							((CrawlItemEtfContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(2659);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
						case 1:
							{
							setState(2658);
							((CrawlItemEtfContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(2664);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(2661);
							((CrawlItemEtfContext)_localctx).symbol7 = word();
							}
							}
							setState(2666);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2667);
						match(TAB);
						setState(2668);
						((CrawlItemEtfContext)_localctx).code = match(NUMBER);
						setState(2669);
						match(TAB);
						setState(2670);
						((CrawlItemEtfContext)_localctx).category = word();
						setState(2672);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
						case 1:
							{
							setState(2671);
							((CrawlItemEtfContext)_localctx).category1 = word();
							}
							break;
						}
						setState(2675);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
						case 1:
							{
							setState(2674);
							((CrawlItemEtfContext)_localctx).category2 = word();
							}
							break;
						}
						setState(2678);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
						case 1:
							{
							setState(2677);
							((CrawlItemEtfContext)_localctx).category3 = word();
							}
							break;
						}
						setState(2681);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
						case 1:
							{
							setState(2680);
							((CrawlItemEtfContext)_localctx).category4 = word();
							}
							break;
						}
						setState(2684);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
						case 1:
							{
							setState(2683);
							((CrawlItemEtfContext)_localctx).category5 = word();
							}
							break;
						}
						setState(2687);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
						case 1:
							{
							setState(2686);
							((CrawlItemEtfContext)_localctx).category6 = word();
							}
							break;
						}
						setState(2692);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(2689);
							((CrawlItemEtfContext)_localctx).category7 = word();
							}
							}
							setState(2694);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2695);
						match(TAB);
						setState(2696);
						((CrawlItemEtfContext)_localctx).asset = match(NUMBER);
						setState(2697);
						match(TAB);
						setState(2698);
						((CrawlItemEtfContext)_localctx).closing = match(NUMBER);
						setState(2699);
						match(TAB);
						setState(2700);
						((CrawlItemEtfContext)_localctx).amount = match(NUMBER);
						setState(2701);
						match(TAB);
						setState(2702);
						match(TAB);
						setState(2703);
						match(TAB);
						setState(2705);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(2704);
							((CrawlItemEtfContext)_localctx).priceEarningsRatio = match(NUMBER);
							}
						}

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
						setState(2714);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(2713);
							((CrawlItemEtfContext)_localctx).fee = match(NUMBER);
							}
						}

						setState(2716);
						match(TAB);
						setState(2717);
						((CrawlItemEtfContext)_localctx).operator = match(WORD);
						setState(2718);
						match(TAB);
						setState(2719);
						match(NEWLINE);

										ParserService.item(20240112
											, (((CrawlItemEtfContext)_localctx).code!=null?((CrawlItemEtfContext)_localctx).code.getText():null)
											, (((CrawlItemEtfContext)_localctx).symbol!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol.start,((CrawlItemEtfContext)_localctx).symbol.stop):null), (((CrawlItemEtfContext)_localctx).symbol1!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol1.start,((CrawlItemEtfContext)_localctx).symbol1.stop):null), (((CrawlItemEtfContext)_localctx).symbol2!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol2.start,((CrawlItemEtfContext)_localctx).symbol2.stop):null), (((CrawlItemEtfContext)_localctx).symbol3!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol3.start,((CrawlItemEtfContext)_localctx).symbol3.stop):null), (((CrawlItemEtfContext)_localctx).symbol4!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol4.start,((CrawlItemEtfContext)_localctx).symbol4.stop):null), (((CrawlItemEtfContext)_localctx).symbol5!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol5.start,((CrawlItemEtfContext)_localctx).symbol5.stop):null), (((CrawlItemEtfContext)_localctx).symbol6!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol6.start,((CrawlItemEtfContext)_localctx).symbol6.stop):null), (((CrawlItemEtfContext)_localctx).symbol7!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol7.start,((CrawlItemEtfContext)_localctx).symbol7.stop):null)
											, (((CrawlItemEtfContext)_localctx).category!=null?_input.getText(((CrawlItemEtfContext)_localctx).category.start,((CrawlItemEtfContext)_localctx).category.stop):null), (((CrawlItemEtfContext)_localctx).category1!=null?_input.getText(((CrawlItemEtfContext)_localctx).category1.start,((CrawlItemEtfContext)_localctx).category1.stop):null), (((CrawlItemEtfContext)_localctx).category2!=null?_input.getText(((CrawlItemEtfContext)_localctx).category2.start,((CrawlItemEtfContext)_localctx).category2.stop):null), (((CrawlItemEtfContext)_localctx).category3!=null?_input.getText(((CrawlItemEtfContext)_localctx).category3.start,((CrawlItemEtfContext)_localctx).category3.stop):null), (((CrawlItemEtfContext)_localctx).category4!=null?_input.getText(((CrawlItemEtfContext)_localctx).category4.start,((CrawlItemEtfContext)_localctx).category4.stop):null), (((CrawlItemEtfContext)_localctx).category5!=null?_input.getText(((CrawlItemEtfContext)_localctx).category5.start,((CrawlItemEtfContext)_localctx).category5.stop):null), (((CrawlItemEtfContext)_localctx).category6!=null?_input.getText(((CrawlItemEtfContext)_localctx).category6.start,((CrawlItemEtfContext)_localctx).category6.stop):null), (((CrawlItemEtfContext)_localctx).category7!=null?_input.getText(((CrawlItemEtfContext)_localctx).category7.start,((CrawlItemEtfContext)_localctx).category7.stop):null)
											, "ETF"
											, null
											, null
											, (((CrawlItemEtfContext)_localctx).fee!=null?((CrawlItemEtfContext)_localctx).fee.getText():null)
										);
									
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2724); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2726);
				match(WORD);
				setState(2727);
				match(TAB);
				setState(2728);
				match(WORD);
				setState(2729);
				match(TAB);
				setState(2730);
				match(DATE);
				setState(2731);
				match(NEWLINE);
				}
				}
				setState(2735); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(2737);
			match(KEYWORD);
			setState(2738);
			match(TAB);
			setState(2739);
			match(WORD);
			setState(2740);
			match(TAB);
			setState(2741);
			match(WORD);
			setState(2742);
			match(WORD);
			setState(2743);
			match(WORD);
			setState(2744);
			match(TAB);
			setState(2745);
			match(WORD);
			setState(2746);
			match(TAB);
			setState(2747);
			match(WORD);
			setState(2748);
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
		enterRule(_localctx, 22, RULE_crawlPriceEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2750);
			match(KEYWORD);
			setState(2751);
			match(TAB);
			setState(2752);
			match(WORD);
			setState(2753);
			match(WORD);
			setState(2754);
			match(TAB);
			setState(2755);
			match(WORD);
			setState(2756);
			match(TAB);
			setState(2757);
			match(WORD);
			setState(2758);
			match(TAB);
			setState(2759);
			match(WORD);
			setState(2760);
			match(NEWLINE);
			setState(2902); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2761);
				((CrawlPriceEtfContext)_localctx).code = match(NUMBER);
				setState(2762);
				match(TAB);
				setState(2764); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2763);
					word();
					}
					}
					setState(2766); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(2768);
				match(NEWLINE);
				{
				setState(2769);
				match(KEYWORD);
				setState(2770);
				match(TAB);
				setState(2771);
				((CrawlPriceEtfContext)_localctx).symbol = word();
				setState(2773);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(2772);
					((CrawlPriceEtfContext)_localctx).symbol1 = word();
					}
					break;
				}
				setState(2776);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(2775);
					((CrawlPriceEtfContext)_localctx).symbol2 = word();
					}
					break;
				}
				setState(2779);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(2778);
					((CrawlPriceEtfContext)_localctx).symbol3 = word();
					}
					break;
				}
				setState(2782);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(2781);
					((CrawlPriceEtfContext)_localctx).symbol4 = word();
					}
					break;
				}
				setState(2785);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(2784);
					((CrawlPriceEtfContext)_localctx).symbol5 = word();
					}
					break;
				}
				setState(2788);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(2787);
					((CrawlPriceEtfContext)_localctx).symbol6 = word();
					}
					break;
				}
				setState(2793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
					{
					{
					setState(2790);
					((CrawlPriceEtfContext)_localctx).symbol7 = word();
					}
					}
					setState(2795);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2796);
				match(NEWLINE);
				setState(2797);
				match(KEYWORD);
				setState(2798);
				match(TAB);
				setState(2799);
				((CrawlPriceEtfContext)_localctx).category = word();
				setState(2801);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(2800);
					((CrawlPriceEtfContext)_localctx).category1 = word();
					}
					break;
				}
				setState(2804);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(2803);
					((CrawlPriceEtfContext)_localctx).category2 = word();
					}
					break;
				}
				setState(2807);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(2806);
					((CrawlPriceEtfContext)_localctx).category3 = word();
					}
					break;
				}
				setState(2810);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(2809);
					((CrawlPriceEtfContext)_localctx).category4 = word();
					}
					break;
				}
				setState(2813);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(2812);
					((CrawlPriceEtfContext)_localctx).category5 = word();
					}
					break;
				}
				setState(2816);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(2815);
					((CrawlPriceEtfContext)_localctx).category6 = word();
					}
					break;
				}
				setState(2821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
					{
					{
					setState(2818);
					((CrawlPriceEtfContext)_localctx).category7 = word();
					}
					}
					setState(2823);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2824);
				match(NEWLINE);
				setState(2825);
				match(KEYWORD);
				setState(2826);
				match(TAB);
				setState(2827);
				((CrawlPriceEtfContext)_localctx).ea = match(NUMBER);
				setState(2828);
				match(NEWLINE);

								ParserService.item(20240112
									, (((CrawlPriceEtfContext)_localctx).code!=null?((CrawlPriceEtfContext)_localctx).code.getText():null)
									, (((CrawlPriceEtfContext)_localctx).symbol!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol.start,((CrawlPriceEtfContext)_localctx).symbol.stop):null), (((CrawlPriceEtfContext)_localctx).symbol1!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol1.start,((CrawlPriceEtfContext)_localctx).symbol1.stop):null), (((CrawlPriceEtfContext)_localctx).symbol2!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol2.start,((CrawlPriceEtfContext)_localctx).symbol2.stop):null), (((CrawlPriceEtfContext)_localctx).symbol3!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol3.start,((CrawlPriceEtfContext)_localctx).symbol3.stop):null), (((CrawlPriceEtfContext)_localctx).symbol4!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol4.start,((CrawlPriceEtfContext)_localctx).symbol4.stop):null), (((CrawlPriceEtfContext)_localctx).symbol5!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol5.start,((CrawlPriceEtfContext)_localctx).symbol5.stop):null), (((CrawlPriceEtfContext)_localctx).symbol6!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol6.start,((CrawlPriceEtfContext)_localctx).symbol6.stop):null), (((CrawlPriceEtfContext)_localctx).symbol7!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol7.start,((CrawlPriceEtfContext)_localctx).symbol7.stop):null)
									, (((CrawlPriceEtfContext)_localctx).category!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category.start,((CrawlPriceEtfContext)_localctx).category.stop):null), (((CrawlPriceEtfContext)_localctx).category1!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category1.start,((CrawlPriceEtfContext)_localctx).category1.stop):null), (((CrawlPriceEtfContext)_localctx).category2!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category2.start,((CrawlPriceEtfContext)_localctx).category2.stop):null), (((CrawlPriceEtfContext)_localctx).category3!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category3.start,((CrawlPriceEtfContext)_localctx).category3.stop):null), (((CrawlPriceEtfContext)_localctx).category4!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category4.start,((CrawlPriceEtfContext)_localctx).category4.stop):null), (((CrawlPriceEtfContext)_localctx).category5!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category5.start,((CrawlPriceEtfContext)_localctx).category5.stop):null), (((CrawlPriceEtfContext)_localctx).category6!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category6.start,((CrawlPriceEtfContext)_localctx).category6.stop):null), (((CrawlPriceEtfContext)_localctx).category7!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category7.start,((CrawlPriceEtfContext)_localctx).category7.stop):null)
									, "ETF"
									, null
									, (((CrawlPriceEtfContext)_localctx).ea!=null?((CrawlPriceEtfContext)_localctx).ea.getText():null)
									, null
								);
							
				}
				setState(2891); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2831);
						match(WORD);
						setState(2832);
						match(TAB);
						setState(2833);
						match(WORD);
						setState(2834);
						match(TAB);
						setState(2835);
						match(WORD);
						setState(2836);
						match(TAB);
						setState(2837);
						match(WORD);
						setState(2838);
						match(TAB);
						setState(2839);
						match(WORD);
						setState(2840);
						match(TAB);
						setState(2841);
						match(WORD);
						setState(2842);
						match(TAB);
						setState(2843);
						match(WORD);
						setState(2844);
						match(TAB);
						setState(2845);
						match(WORD);
						setState(2846);
						match(TAB);
						setState(2847);
						match(NEWLINE);
						setState(2887); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(2887);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
							case 1:
								{
								{
								setState(2848);
								match(TAB);
								setState(2849);
								match(TAB);
								setState(2850);
								match(TAB);
								setState(2851);
								match(TAB);
								setState(2852);
								match(TAB);
								setState(2853);
								match(TAB);
								setState(2854);
								match(TAB);
								setState(2855);
								match(TAB);
								setState(2856);
								match(NEWLINE);
								}
								}
								break;
							case 2:
								{
								{
								setState(2858);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(2857);
									((CrawlPriceEtfContext)_localctx).base = match(DATE);
									}
								}

								setState(2860);
								match(TAB);
								setState(2862);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(2861);
									((CrawlPriceEtfContext)_localctx).closing = match(NUMBER);
									}
								}

								setState(2864);
								match(TAB);
								setState(2866);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(2865);
									match(NUMBER);
									}
								}

								setState(2868);
								match(TAB);
								setState(2870);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(2869);
									((CrawlPriceEtfContext)_localctx).market = match(NUMBER);
									}
								}

								setState(2872);
								match(TAB);
								setState(2874);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(2873);
									((CrawlPriceEtfContext)_localctx).high = match(NUMBER);
									}
								}

								setState(2876);
								match(TAB);
								setState(2877);
								((CrawlPriceEtfContext)_localctx).low = match(NUMBER);
								setState(2878);
								match(TAB);
								setState(2879);
								((CrawlPriceEtfContext)_localctx).volume = match(NUMBER);
								setState(2880);
								match(TAB);
								setState(2882);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(2881);
									match(NUMBER);
									}
								}

								setState(2884);
								match(TAB);
								setState(2885);
								match(NEWLINE);

													ParserService.price(20240112
														, (((CrawlPriceEtfContext)_localctx).code!=null?((CrawlPriceEtfContext)_localctx).code.getText():null)
														, (((CrawlPriceEtfContext)_localctx).base!=null?((CrawlPriceEtfContext)_localctx).base.getText():null), (((CrawlPriceEtfContext)_localctx).closing!=null?((CrawlPriceEtfContext)_localctx).closing.getText():null), (((CrawlPriceEtfContext)_localctx).market!=null?((CrawlPriceEtfContext)_localctx).market.getText():null), (((CrawlPriceEtfContext)_localctx).high!=null?((CrawlPriceEtfContext)_localctx).high.getText():null), (((CrawlPriceEtfContext)_localctx).low!=null?((CrawlPriceEtfContext)_localctx).low.getText():null), (((CrawlPriceEtfContext)_localctx).volume!=null?((CrawlPriceEtfContext)_localctx).volume.getText():null)
													);
												
								}
								}
								break;
							}
							}
							setState(2889); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2893); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2895);
				match(WORD);
				setState(2896);
				match(TAB);
				setState(2897);
				match(WORD);
				setState(2898);
				match(TAB);
				setState(2899);
				match(DATE);
				setState(2900);
				match(NEWLINE);
				}
				}
				setState(2904); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(2906);
			match(KEYWORD);
			setState(2907);
			match(TAB);
			setState(2908);
			match(WORD);
			setState(2909);
			match(WORD);
			setState(2910);
			match(TAB);
			setState(2911);
			match(WORD);
			setState(2912);
			match(TAB);
			setState(2913);
			match(WORD);
			setState(2914);
			match(TAB);
			setState(2915);
			match(WORD);
			setState(2916);
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
		enterRule(_localctx, 24, RULE_crawlPriceCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2918);
			match(KEYWORD);
			setState(2919);
			match(TAB);
			setState(2920);
			match(WORD);
			setState(2921);
			match(WORD);
			setState(2922);
			match(TAB);
			setState(2923);
			match(WORD);
			setState(2924);
			match(TAB);
			setState(2925);
			match(WORD);
			setState(2926);
			match(TAB);
			setState(2927);
			match(WORD);
			setState(2928);
			match(NEWLINE);
			setState(2991); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2929);
				((CrawlPriceCompanyContext)_localctx).code = match(NUMBER);
				setState(2930);
				match(TAB);
				setState(2932); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2931);
					((CrawlPriceCompanyContext)_localctx).symbol = word();
					}
					}
					setState(2934); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(2936);
				match(NEWLINE);
				setState(2980); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2937);
						match(WORD);
						setState(2938);
						match(TAB);
						setState(2939);
						match(WORD);
						setState(2940);
						match(TAB);
						setState(2941);
						match(WORD);
						setState(2942);
						match(TAB);
						setState(2943);
						match(WORD);
						setState(2944);
						match(TAB);
						setState(2945);
						match(WORD);
						setState(2946);
						match(TAB);
						setState(2947);
						match(WORD);
						setState(2948);
						match(TAB);
						setState(2949);
						match(WORD);
						setState(2950);
						match(TAB);
						setState(2951);
						match(NEWLINE);
						setState(2976); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(2976);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case TAB:
								{
								{
								setState(2952);
								match(TAB);
								setState(2953);
								match(TAB);
								setState(2954);
								match(TAB);
								setState(2955);
								match(TAB);
								setState(2956);
								match(TAB);
								setState(2957);
								match(TAB);
								setState(2958);
								match(TAB);
								setState(2959);
								match(NEWLINE);
								}
								}
								break;
							case DATE:
								{
								{
								setState(2960);
								((CrawlPriceCompanyContext)_localctx).base = match(DATE);
								setState(2961);
								match(TAB);
								setState(2962);
								((CrawlPriceCompanyContext)_localctx).closing = match(NUMBER);
								setState(2963);
								match(TAB);
								setState(2964);
								match(NUMBER);
								setState(2965);
								match(TAB);
								setState(2966);
								((CrawlPriceCompanyContext)_localctx).market = match(NUMBER);
								setState(2967);
								match(TAB);
								setState(2968);
								((CrawlPriceCompanyContext)_localctx).high = match(NUMBER);
								setState(2969);
								match(TAB);
								setState(2970);
								((CrawlPriceCompanyContext)_localctx).low = match(NUMBER);
								setState(2971);
								match(TAB);
								setState(2972);
								((CrawlPriceCompanyContext)_localctx).volume = match(NUMBER);
								setState(2973);
								match(TAB);
								setState(2974);
								match(NEWLINE);

												ParserService.price(20240112
													, (((CrawlPriceCompanyContext)_localctx).code!=null?((CrawlPriceCompanyContext)_localctx).code.getText():null)
													, (((CrawlPriceCompanyContext)_localctx).base!=null?((CrawlPriceCompanyContext)_localctx).base.getText():null), (((CrawlPriceCompanyContext)_localctx).closing!=null?((CrawlPriceCompanyContext)_localctx).closing.getText():null), (((CrawlPriceCompanyContext)_localctx).market!=null?((CrawlPriceCompanyContext)_localctx).market.getText():null), (((CrawlPriceCompanyContext)_localctx).high!=null?((CrawlPriceCompanyContext)_localctx).high.getText():null), (((CrawlPriceCompanyContext)_localctx).low!=null?((CrawlPriceCompanyContext)_localctx).low.getText():null), (((CrawlPriceCompanyContext)_localctx).volume!=null?((CrawlPriceCompanyContext)_localctx).volume.getText():null)
												);
											
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							}
							setState(2978); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2982); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2984);
				match(WORD);
				setState(2985);
				match(TAB);
				setState(2986);
				match(WORD);
				setState(2987);
				match(TAB);
				setState(2988);
				match(DATE);
				setState(2989);
				match(NEWLINE);
				}
				}
				setState(2993); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(2995);
			match(KEYWORD);
			setState(2996);
			match(TAB);
			setState(2997);
			match(WORD);
			setState(2998);
			match(WORD);
			setState(2999);
			match(TAB);
			setState(3000);
			match(WORD);
			setState(3001);
			match(TAB);
			setState(3002);
			match(WORD);
			setState(3003);
			match(TAB);
			setState(3004);
			match(WORD);
			setState(3005);
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
		enterRule(_localctx, 26, RULE_crawlItemDetailCompanyThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3007);
			match(KEYWORD);
			setState(3008);
			match(TAB);
			setState(3009);
			match(WORD);
			setState(3010);
			match(WORD);
			setState(3011);
			match(TAB);
			setState(3012);
			match(WORD);
			setState(3013);
			match(TAB);
			setState(3014);
			match(WORD);
			setState(3015);
			match(TAB);
			setState(3016);
			match(WORD);
			setState(3017);
			match(NEWLINE);
			setState(3075); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3018);
					match(KEYWORD);
					setState(3019);
					match(TAB);
					setState(3020);
					((CrawlItemDetailCompanyThreadContext)_localctx).code = match(NUMBER);
					setState(3021);
					match(TAB);
					setState(3022);
					((CrawlItemDetailCompanyThreadContext)_localctx).type = match(WORD);
					setState(3023);
					match(TAB);
					setState(3024);
					((CrawlItemDetailCompanyThreadContext)_localctx).symbol = word();
					setState(3026);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
					case 1:
						{
						setState(3025);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(3029);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
					case 1:
						{
						setState(3028);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(3032);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
					case 1:
						{
						setState(3031);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(3035);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
					case 1:
						{
						setState(3034);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(3038);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
					case 1:
						{
						setState(3037);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(3041);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
					case 1:
						{
						setState(3040);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(3046);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(3043);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(3048);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3049);
					match(NEWLINE);
					setState(3050);
					match(KEYWORD);
					setState(3051);
					match(TAB);
					setState(3052);
					((CrawlItemDetailCompanyThreadContext)_localctx).category = match(STRING);
					setState(3053);
					match(NEWLINE);
					setState(3054);
					match(KEYWORD);
					setState(3055);
					match(TAB);
					setState(3056);
					((CrawlItemDetailCompanyThreadContext)_localctx).fics = match(STRING);
					setState(3057);
					match(NEWLINE);
					setState(3058);
					match(KEYWORD);
					setState(3059);
					match(TAB);
					setState(3060);
					((CrawlItemDetailCompanyThreadContext)_localctx).ea = match(NUMBER);
					setState(3061);
					match(WORD);
					setState(3062);
					match(NEWLINE);
					setState(3063);
					match(KEYWORD);
					setState(3064);
					match(TAB);
					setState(3065);
					((CrawlItemDetailCompanyThreadContext)_localctx).ipo = match(DATE);
					setState(3066);
					match(NEWLINE);
					setState(3067);
					match(WORD);
					setState(3068);
					match(TAB);
					setState(3069);
					match(WORD);
					setState(3070);
					match(TAB);
					setState(3071);
					match(DATE);
					setState(3072);
					match(NEWLINE);

							ParserService.item(20240112
								, (((CrawlItemDetailCompanyThreadContext)_localctx).code!=null?((CrawlItemDetailCompanyThreadContext)_localctx).code.getText():null)
								, (((CrawlItemDetailCompanyThreadContext)_localctx).symbol!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol.stop):null), (((CrawlItemDetailCompanyThreadContext)_localctx).symbol1!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol1.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol1.stop):null), (((CrawlItemDetailCompanyThreadContext)_localctx).symbol2!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol2.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol2.stop):null), (((CrawlItemDetailCompanyThreadContext)_localctx).symbol3!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol3.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol3.stop):null), (((CrawlItemDetailCompanyThreadContext)_localctx).symbol4!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol4.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol4.stop):null), (((CrawlItemDetailCompanyThreadContext)_localctx).symbol5!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol5.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol5.stop):null), (((CrawlItemDetailCompanyThreadContext)_localctx).symbol6!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol6.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol6.stop):null), (((CrawlItemDetailCompanyThreadContext)_localctx).symbol7!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol7.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol7.stop):null)
								, (((CrawlItemDetailCompanyThreadContext)_localctx).category!=null?((CrawlItemDetailCompanyThreadContext)_localctx).category.getText():null), (((CrawlItemDetailCompanyThreadContext)_localctx).fics!=null?((CrawlItemDetailCompanyThreadContext)_localctx).fics.getText():null), null, null, null, null, null, null
								, null
								, (((CrawlItemDetailCompanyThreadContext)_localctx).ipo!=null?((CrawlItemDetailCompanyThreadContext)_localctx).ipo.getText():null)
								, (((CrawlItemDetailCompanyThreadContext)_localctx).ea!=null?((CrawlItemDetailCompanyThreadContext)_localctx).ea.getText():null)
								, null
							);
						
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3077); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(3079);
			match(KEYWORD);
			setState(3080);
			match(TAB);
			setState(3081);
			match(WORD);
			setState(3082);
			match(WORD);
			setState(3083);
			match(TAB);
			setState(3084);
			match(WORD);
			setState(3085);
			match(TAB);
			setState(3086);
			match(WORD);
			setState(3087);
			match(TAB);
			setState(3088);
			match(WORD);
			setState(3089);
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
		enterRule(_localctx, 28, RULE_crawlItemDividendTopCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3091);
			match(KEYWORD);
			setState(3092);
			match(TAB);
			setState(3093);
			match(WORD);
			setState(3094);
			match(TAB);
			setState(3095);
			match(WORD);
			setState(3096);
			match(WORD);
			setState(3097);
			match(WORD);
			setState(3098);
			match(TAB);
			setState(3099);
			match(WORD);
			setState(3100);
			match(TAB);
			setState(3101);
			match(WORD);
			setState(3102);
			match(NEWLINE);
			setState(3171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3103);
				match(WORD);
				setState(3104);
				match(TAB);
				setState(3105);
				match(NEWLINE);
				setState(3106);
				match(WORD);
				setState(3107);
				match(TAB);
				setState(3108);
				match(WORD);
				setState(3109);
				match(TAB);
				setState(3110);
				match(WORD);
				setState(3111);
				match(TAB);
				setState(3112);
				match(WORD);
				setState(3113);
				match(TAB);
				setState(3114);
				match(WORD);
				setState(3115);
				match(TAB);
				setState(3116);
				match(WORD);
				setState(3117);
				match(TAB);
				setState(3118);
				match(WORD);
				setState(3119);
				match(TAB);
				setState(3120);
				match(WORD);
				setState(3121);
				match(TAB);
				setState(3122);
				match(WORD);
				setState(3123);
				match(TAB);
				setState(3124);
				match(WORD);
				setState(3125);
				match(TAB);
				setState(3126);
				match(WORD);
				setState(3127);
				match(TAB);
				setState(3128);
				match(NEWLINE);
				setState(3160); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3129);
						((CrawlItemDividendTopCompanyContext)_localctx).type = match(WORD);
						setState(3130);
						match(TAB);
						setState(3131);
						match(NUMBER);
						setState(3132);
						match(TAB);
						setState(3134);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(3133);
							((CrawlItemDividendTopCompanyContext)_localctx).code = match(NUMBER);
							}
						}

						setState(3136);
						match(TAB);
						setState(3138); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(3137);
							word();
							}
							}
							setState(3140); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(3142);
						match(TAB);
						setState(3143);
						match(WORD);
						setState(3144);
						match(TAB);
						setState(3145);
						match(WORD);
						setState(3146);
						match(TAB);
						setState(3147);
						match(NUMBER);
						setState(3148);
						match(TAB);
						setState(3149);
						match(NUMBER);
						setState(3150);
						match(TAB);
						setState(3151);
						match(NUMBER);
						setState(3152);
						match(TAB);
						setState(3153);
						match(NUMBER);
						setState(3154);
						match(TAB);
						setState(3155);
						match(NUMBER);
						setState(3156);
						match(TAB);
						setState(3157);
						match(NEWLINE);

									ParserService.item(20240112
										, (((CrawlItemDividendTopCompanyContext)_localctx).code!=null?((CrawlItemDividendTopCompanyContext)_localctx).code.getText():null)
										, null, null, null, null, null, null, null, null
										, null, null, null, null, null, null, null, null
										, (((CrawlItemDividendTopCompanyContext)_localctx).type!=null?((CrawlItemDividendTopCompanyContext)_localctx).type.getText():null)
										, null
										, null
										, null
									);
								
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3162); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(3164);
				match(WORD);
				setState(3165);
				match(TAB);
				setState(3166);
				match(WORD);
				setState(3167);
				match(TAB);
				setState(3168);
				match(DATE);
				setState(3169);
				match(NEWLINE);
				}
				}
				setState(3173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(3175);
			match(KEYWORD);
			setState(3176);
			match(TAB);
			setState(3177);
			match(WORD);
			setState(3178);
			match(TAB);
			setState(3179);
			match(WORD);
			setState(3180);
			match(WORD);
			setState(3181);
			match(WORD);
			setState(3182);
			match(TAB);
			setState(3183);
			match(WORD);
			setState(3184);
			match(TAB);
			setState(3185);
			match(WORD);
			setState(3186);
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
		enterRule(_localctx, 30, RULE_crawlEtfDetailThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3188);
			match(KEYWORD);
			setState(3189);
			match(TAB);
			setState(3190);
			match(WORD);
			setState(3191);
			match(WORD);
			setState(3192);
			match(TAB);
			setState(3193);
			match(WORD);
			setState(3194);
			match(TAB);
			setState(3195);
			match(WORD);
			setState(3196);
			match(NEWLINE);
			setState(3278); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3197);
					match(KEYWORD);
					setState(3198);
					match(TAB);
					setState(3199);
					((CrawlEtfDetailThreadContext)_localctx).code = match(NUMBER);
					setState(3200);
					match(TAB);
					setState(3204);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(3201);
						word();
						}
						}
						setState(3206);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3207);
					match(NEWLINE);
					setState(3208);
					((CrawlEtfDetailThreadContext)_localctx).symbol = word();
					setState(3210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
					case 1:
						{
						setState(3209);
						((CrawlEtfDetailThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(3213);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
					case 1:
						{
						setState(3212);
						((CrawlEtfDetailThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(3216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
					case 1:
						{
						setState(3215);
						((CrawlEtfDetailThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(3219);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
					case 1:
						{
						setState(3218);
						((CrawlEtfDetailThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(3222);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
					case 1:
						{
						setState(3221);
						((CrawlEtfDetailThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(3225);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
					case 1:
						{
						setState(3224);
						((CrawlEtfDetailThreadContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(3230);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(3227);
						((CrawlEtfDetailThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(3232);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3233);
					match(NEWLINE);
					setState(3234);
					((CrawlEtfDetailThreadContext)_localctx).category = word();
					setState(3236);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
					case 1:
						{
						setState(3235);
						((CrawlEtfDetailThreadContext)_localctx).category1 = word();
						}
						break;
					}
					setState(3239);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
					case 1:
						{
						setState(3238);
						((CrawlEtfDetailThreadContext)_localctx).category2 = word();
						}
						break;
					}
					setState(3242);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
					case 1:
						{
						setState(3241);
						((CrawlEtfDetailThreadContext)_localctx).category3 = word();
						}
						break;
					}
					setState(3245);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
					case 1:
						{
						setState(3244);
						((CrawlEtfDetailThreadContext)_localctx).category4 = word();
						}
						break;
					}
					setState(3248);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
					case 1:
						{
						setState(3247);
						((CrawlEtfDetailThreadContext)_localctx).category5 = word();
						}
						break;
					}
					setState(3251);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
					case 1:
						{
						setState(3250);
						((CrawlEtfDetailThreadContext)_localctx).category6 = word();
						}
						break;
					}
					setState(3256);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(3253);
						((CrawlEtfDetailThreadContext)_localctx).category7 = word();
						}
						}
						setState(3258);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3259);
					match(NEWLINE);
					setState(3260);
					((CrawlEtfDetailThreadContext)_localctx).ipo = match(DATE);
					setState(3264);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WORD) {
						{
						{
						setState(3261);
						match(WORD);
						}
						}
						setState(3266);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3267);
					match(NEWLINE);
					setState(3268);
					((CrawlEtfDetailThreadContext)_localctx).fee = word();
					setState(3269);
					match(NEWLINE);
					setState(3270);
					match(WORD);
					setState(3271);
					match(TAB);
					setState(3272);
					match(WORD);
					setState(3273);
					match(TAB);
					setState(3274);
					match(DATE);
					setState(3275);
					match(NEWLINE);

								ParserService.item(20240112
									, (((CrawlEtfDetailThreadContext)_localctx).code!=null?((CrawlEtfDetailThreadContext)_localctx).code.getText():null)
									, (((CrawlEtfDetailThreadContext)_localctx).symbol!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol.start,((CrawlEtfDetailThreadContext)_localctx).symbol.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol1!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol1.start,((CrawlEtfDetailThreadContext)_localctx).symbol1.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol2!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol2.start,((CrawlEtfDetailThreadContext)_localctx).symbol2.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol3!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol3.start,((CrawlEtfDetailThreadContext)_localctx).symbol3.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol4!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol4.start,((CrawlEtfDetailThreadContext)_localctx).symbol4.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol5!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol5.start,((CrawlEtfDetailThreadContext)_localctx).symbol5.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol6!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol6.start,((CrawlEtfDetailThreadContext)_localctx).symbol6.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol7!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol7.start,((CrawlEtfDetailThreadContext)_localctx).symbol7.stop):null)
									, (((CrawlEtfDetailThreadContext)_localctx).category!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category.start,((CrawlEtfDetailThreadContext)_localctx).category.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category1!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category1.start,((CrawlEtfDetailThreadContext)_localctx).category1.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category2!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category2.start,((CrawlEtfDetailThreadContext)_localctx).category2.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category3!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category3.start,((CrawlEtfDetailThreadContext)_localctx).category3.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category4!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category4.start,((CrawlEtfDetailThreadContext)_localctx).category4.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category5!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category5.start,((CrawlEtfDetailThreadContext)_localctx).category5.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category6!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category6.start,((CrawlEtfDetailThreadContext)_localctx).category6.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category7!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category7.start,((CrawlEtfDetailThreadContext)_localctx).category7.stop):null)
									, null
									, (((CrawlEtfDetailThreadContext)_localctx).ipo!=null?((CrawlEtfDetailThreadContext)_localctx).ipo.getText():null)
									, null
									, (((CrawlEtfDetailThreadContext)_localctx).fee!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).fee.start,((CrawlEtfDetailThreadContext)_localctx).fee.stop):null)
								);
							
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3280); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(3282);
			match(KEYWORD);
			setState(3283);
			match(TAB);
			setState(3284);
			match(WORD);
			setState(3285);
			match(WORD);
			setState(3286);
			match(TAB);
			setState(3287);
			match(WORD);
			setState(3288);
			match(TAB);
			setState(3289);
			match(WORD);
			setState(3290);
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
		public WordContext symbol;
		public WordContext symbol1;
		public WordContext symbol2;
		public WordContext symbol3;
		public WordContext symbol4;
		public WordContext symbol5;
		public WordContext symbol6;
		public WordContext symbol7;
		public Token code;
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
		enterRule(_localctx, 32, RULE_crawlDividendHistoryEtfThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3292);
			match(KEYWORD);
			setState(3293);
			match(TAB);
			setState(3294);
			match(WORD);
			setState(3295);
			match(WORD);
			setState(3296);
			match(WORD);
			setState(3297);
			match(TAB);
			setState(3298);
			match(WORD);
			setState(3299);
			match(WORD);
			setState(3300);
			match(WORD);
			setState(3301);
			match(TAB);
			setState(3302);
			match(WORD);
			setState(3303);
			match(TAB);
			setState(3304);
			match(WORD);
			setState(3305);
			match(NEWLINE);
			setState(3410); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3306);
				match(WORD);
				setState(3307);
				match(TAB);
				setState(3309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORD) {
					{
					setState(3308);
					match(WORD);
					}
				}

				setState(3311);
				match(TAB);
				setState(3312);
				match(WORD);
				setState(3313);
				match(TAB);
				setState(3314);
				match(WORD);
				setState(3315);
				match(TAB);
				setState(3316);
				match(WORD);
				setState(3317);
				match(TAB);
				setState(3318);
				match(WORD);
				setState(3319);
				match(TAB);
				setState(3320);
				match(WORD);
				setState(3321);
				match(TAB);
				setState(3322);
				match(WORD);
				setState(3323);
				match(TAB);
				setState(3324);
				match(WORD);
				setState(3325);
				match(TAB);
				setState(3326);
				match(WORD);
				setState(3327);
				match(TAB);
				setState(3328);
				match(NEWLINE);
				setState(3400); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(3400);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case TAB:
							{
							{
							setState(3329);
							match(TAB);
							setState(3330);
							match(TAB);
							setState(3331);
							match(TAB);
							setState(3332);
							match(TAB);
							setState(3333);
							match(TAB);
							setState(3334);
							match(TAB);
							setState(3335);
							match(TAB);
							setState(3336);
							match(TAB);
							setState(3337);
							match(TAB);
							setState(3338);
							match(TAB);
							setState(3339);
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
							setState(3340);
							((CrawlDividendHistoryEtfThreadContext)_localctx).symbol = word();
							setState(3342);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
							case 1:
								{
								setState(3341);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(3345);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
							case 1:
								{
								setState(3344);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(3348);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
							case 1:
								{
								setState(3347);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(3351);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
							case 1:
								{
								setState(3350);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(3354);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
							case 1:
								{
								setState(3353);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(3357);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
							case 1:
								{
								setState(3356);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(3362);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(3359);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol7 = word();
								}
								}
								setState(3364);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(3365);
							match(TAB);
							setState(3366);
							((CrawlDividendHistoryEtfThreadContext)_localctx).code = match(WORD);
							setState(3367);
							match(TAB);
							setState(3368);
							match(WORD);
							setState(3369);
							match(TAB);
							setState(3373);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(3370);
								word();
								}
								}
								setState(3375);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(3376);
							match(TAB);
							setState(3378);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==DATE) {
								{
								setState(3377);
								((CrawlDividendHistoryEtfThreadContext)_localctx).base = match(DATE);
								}
							}

							setState(3380);
							match(TAB);
							setState(3381);
							((CrawlDividendHistoryEtfThreadContext)_localctx).pay = match(DATE);
							setState(3382);
							match(TAB);
							setState(3384);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==WORD) {
								{
								setState(3383);
								match(WORD);
								}
							}

							setState(3386);
							match(TAB);
							setState(3387);
							((CrawlDividendHistoryEtfThreadContext)_localctx).dividend = match(NUMBER);
							setState(3388);
							match(TAB);
							setState(3390);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NUMBER) {
								{
								setState(3389);
								((CrawlDividendHistoryEtfThreadContext)_localctx).price = match(NUMBER);
								}
							}

							setState(3392);
							match(TAB);
							setState(3394);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NUMBER) {
								{
								setState(3393);
								((CrawlDividendHistoryEtfThreadContext)_localctx).ratio = match(NUMBER);
								}
							}

							setState(3396);
							match(TAB);
							setState(3397);
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
					setState(3402); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(3404);
				match(WORD);
				setState(3405);
				match(TAB);
				setState(3406);
				match(WORD);
				setState(3407);
				match(TAB);
				setState(3408);
				match(DATE);
				setState(3409);
				match(NEWLINE);
				}
				}
				setState(3412); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(3414);
			match(KEYWORD);
			setState(3415);
			match(TAB);
			setState(3416);
			match(WORD);
			setState(3417);
			match(WORD);
			setState(3418);
			match(WORD);
			setState(3419);
			match(TAB);
			setState(3420);
			match(WORD);
			setState(3421);
			match(WORD);
			setState(3422);
			match(WORD);
			setState(3423);
			match(TAB);
			setState(3424);
			match(WORD);
			setState(3425);
			match(TAB);
			setState(3426);
			match(WORD);
			setState(3427);
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
		enterRule(_localctx, 34, RULE_crawlDividendHistoryCompanyThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3429);
			match(KEYWORD);
			setState(3430);
			match(TAB);
			setState(3431);
			match(WORD);
			setState(3432);
			match(TAB);
			setState(3433);
			match(WORD);
			setState(3434);
			match(WORD);
			setState(3435);
			match(WORD);
			setState(3436);
			match(TAB);
			setState(3437);
			match(WORD);
			setState(3438);
			match(TAB);
			setState(3439);
			match(WORD);
			setState(3440);
			match(NEWLINE);
			setState(3567); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3557); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3441);
						match(WORD);
						setState(3442);
						match(TAB);
						setState(3443);
						match(WORD);
						setState(3444);
						match(NEWLINE);
						setState(3445);
						match(WORD);
						setState(3446);
						match(TAB);
						setState(3447);
						match(WORD);
						setState(3448);
						match(NEWLINE);
						setState(3449);
						match(WORD);
						setState(3450);
						match(TAB);
						setState(3451);
						match(WORD);
						setState(3452);
						match(TAB);
						setState(3453);
						match(WORD);
						setState(3454);
						match(TAB);
						setState(3455);
						match(WORD);
						setState(3456);
						match(TAB);
						setState(3457);
						match(WORD);
						setState(3458);
						match(TAB);
						setState(3459);
						match(WORD);
						setState(3460);
						match(TAB);
						setState(3461);
						match(WORD);
						setState(3462);
						match(TAB);
						setState(3463);
						match(WORD);
						setState(3464);
						match(TAB);
						setState(3465);
						match(WORD);
						setState(3466);
						match(TAB);
						setState(3467);
						match(WORD);
						setState(3468);
						match(TAB);
						setState(3469);
						match(WORD);
						setState(3470);
						match(TAB);
						setState(3471);
						match(WORD);
						setState(3472);
						match(TAB);
						setState(3473);
						match(NEWLINE);
						setState(3474);
						match(WORD);
						setState(3475);
						match(TAB);
						setState(3476);
						match(WORD);
						setState(3477);
						match(TAB);
						setState(3478);
						match(WORD);
						setState(3479);
						match(TAB);
						setState(3480);
						match(WORD);
						setState(3481);
						match(TAB);
						setState(3482);
						match(WORD);
						setState(3483);
						match(TAB);
						setState(3484);
						match(WORD);
						setState(3485);
						match(TAB);
						setState(3486);
						match(NEWLINE);
						setState(3553); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(3553);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case TAB:
								{
								{
								setState(3487);
								match(TAB);
								setState(3488);
								match(TAB);
								setState(3489);
								match(TAB);
								setState(3490);
								match(TAB);
								setState(3491);
								match(TAB);
								setState(3492);
								match(TAB);
								setState(3493);
								match(TAB);
								setState(3494);
								match(TAB);
								setState(3495);
								match(TAB);
								setState(3496);
								match(TAB);
								setState(3497);
								match(TAB);
								setState(3498);
								match(TAB);
								setState(3499);
								match(TAB);
								setState(3500);
								match(TAB);
								setState(3501);
								match(TAB);
								setState(3502);
								match(TAB);
								setState(3503);
								match(TAB);
								setState(3504);
								match(NEWLINE);
								}
								}
								break;
							case DATE:
								{
								{
								setState(3505);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).base = match(DATE);
								setState(3506);
								match(TAB);
								setState(3508);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(3507);
									((CrawlDividendHistoryCompanyThreadContext)_localctx).pay = match(DATE);
									}
								}

								setState(3510);
								match(TAB);
								setState(3512);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(3511);
									match(DATE);
									}
								}

								setState(3514);
								match(TAB);
								setState(3515);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).code = match(NUMBER);
								setState(3516);
								match(TAB);
								setState(3518); 
								_errHandler.sync(this);
								_la = _input.LA(1);
								do {
									{
									{
									setState(3517);
									((CrawlDividendHistoryCompanyThreadContext)_localctx).symbol = word();
									}
									}
									setState(3520); 
									_errHandler.sync(this);
									_la = _input.LA(1);
								} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
								setState(3522);
								match(TAB);
								setState(3523);
								match(WORD);
								setState(3524);
								match(TAB);
								setState(3525);
								match(WORD);
								setState(3526);
								match(TAB);
								setState(3527);
								match(WORD);
								setState(3528);
								match(TAB);
								setState(3529);
								match(WORD);
								setState(3530);
								match(TAB);
								setState(3531);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).dividend = match(NUMBER);
								setState(3532);
								match(TAB);
								setState(3534);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(3533);
									match(NUMBER);
									}
								}

								setState(3536);
								match(TAB);
								setState(3537);
								match(NUMBER);
								setState(3538);
								match(TAB);
								setState(3539);
								match(NUMBER);
								setState(3540);
								match(TAB);
								setState(3542);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(3541);
									match(NUMBER);
									}
								}

								setState(3544);
								match(TAB);
								setState(3545);
								match(TAB);
								setState(3546);
								match(NUMBER);
								setState(3547);
								match(TAB);
								setState(3548);
								match(NUMBER);
								setState(3549);
								match(TAB);
								setState(3550);
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
							setState(3555); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3559); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(3561);
				match(WORD);
				setState(3562);
				match(TAB);
				setState(3563);
				match(WORD);
				setState(3564);
				match(TAB);
				setState(3565);
				match(DATE);
				setState(3566);
				match(NEWLINE);
				}
				}
				setState(3569); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(3571);
			match(KEYWORD);
			setState(3572);
			match(TAB);
			setState(3573);
			match(WORD);
			setState(3574);
			match(TAB);
			setState(3575);
			match(WORD);
			setState(3576);
			match(WORD);
			setState(3577);
			match(WORD);
			setState(3578);
			match(TAB);
			setState(3579);
			match(WORD);
			setState(3580);
			match(TAB);
			setState(3581);
			match(WORD);
			setState(3582);
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
		enterRule(_localctx, 36, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3584);
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
		enterRule(_localctx, 38, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3588); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(3588);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(3586);
					word();
					}
					break;
				case TAB:
					{
					setState(3587);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(3590); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(3592);
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
		enterRule(_localctx, 40, RULE_eof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3597); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(3597);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(3594);
					word();
					}
					break;
				case TAB:
					{
					setState(3595);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(3596);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(3599); 
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
		"\u0004\u0001\n\u0e12\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000<\b\u0000\u0001\u0001"+
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
		"\u0001\u0001\u0004\u0001\u012a\b\u0001\u000b\u0001\f\u0001\u012b\u0004"+
		"\u0001\u012e\b\u0001\u000b\u0001\f\u0001\u012f\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u0138\b\u0001"+
		"\u000b\u0001\f\u0001\u0139\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
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
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u01bc\b\u0002"+
		"\u000b\u0002\f\u0002\u01bd\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0004\u0002\u01d2\b\u0002\u000b\u0002\f\u0002"+
		"\u01d3\u0004\u0002\u01d6\b\u0002\u000b\u0002\f\u0002\u01d7\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0004\u0002\u01e1\b\u0002\u000b\u0002\f\u0002\u01e2\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0207\b\u0003\u0001\u0003\u0003"+
		"\u0003\u020a\b\u0003\u0001\u0003\u0003\u0003\u020d\b\u0003\u0001\u0003"+
		"\u0003\u0003\u0210\b\u0003\u0001\u0003\u0003\u0003\u0213\b\u0003\u0001"+
		"\u0003\u0003\u0003\u0216\b\u0003\u0001\u0003\u0005\u0003\u0219\b\u0003"+
		"\n\u0003\f\u0003\u021c\t\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u0220"+
		"\b\u0003\u000b\u0003\f\u0003\u0221\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u0250\b\u0003\u0001\u0003\u0003\u0003\u0253\b\u0003\u0001\u0003\u0003"+
		"\u0003\u0256\b\u0003\u0001\u0003\u0003\u0003\u0259\b\u0003\u0001\u0003"+
		"\u0003\u0003\u025c\b\u0003\u0001\u0003\u0003\u0003\u025f\b\u0003\u0001"+
		"\u0003\u0005\u0003\u0262\b\u0003\n\u0003\f\u0003\u0265\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u02a6\b\u0004\u0001\u0004\u0003\u0004"+
		"\u02a9\b\u0004\u0001\u0004\u0003\u0004\u02ac\b\u0004\u0001\u0004\u0003"+
		"\u0004\u02af\b\u0004\u0001\u0004\u0003\u0004\u02b2\b\u0004\u0001\u0004"+
		"\u0003\u0004\u02b5\b\u0004\u0001\u0004\u0005\u0004\u02b8\b\u0004\n\u0004"+
		"\f\u0004\u02bb\t\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u02bf\b\u0004"+
		"\u000b\u0004\f\u0004\u02c0\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
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
		"\u0003\u0004\u0309\b\u0004\u0001\u0004\u0003\u0004\u030c\b\u0004\u0001"+
		"\u0004\u0003\u0004\u030f\b\u0004\u0001\u0004\u0003\u0004\u0312\b\u0004"+
		"\u0001\u0004\u0003\u0004\u0315\b\u0004\u0001\u0004\u0003\u0004\u0318\b"+
		"\u0004\u0001\u0004\u0005\u0004\u031b\b\u0004\n\u0004\f\u0004\u031e\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
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
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u03d1\b\u0005\u000b\u0005"+
		"\f\u0005\u03d2\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u03db\b\u0005\u0001\u0005\u0003\u0005\u03de\b"+
		"\u0005\u0001\u0005\u0003\u0005\u03e1\b\u0005\u0001\u0005\u0003\u0005\u03e4"+
		"\b\u0005\u0001\u0005\u0003\u0005\u03e7\b\u0005\u0001\u0005\u0003\u0005"+
		"\u03ea\b\u0005\u0001\u0005\u0005\u0005\u03ed\b\u0005\n\u0005\f\u0005\u03f0"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0004\u0005\u03f9\b\u0005\u000b\u0005\f\u0005\u03fa"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0004\u0005\u0405\b\u0005\u000b\u0005\f\u0005"+
		"\u0406\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u040d"+
		"\b\u0005\u000b\u0005\f\u0005\u040e\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0004\u0005\u0415\b\u0005\u000b\u0005\f\u0005\u0416\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u0436"+
		"\b\u0005\u000b\u0005\f\u0005\u0437\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u044c\b\u0005\u000b\u0005"+
		"\f\u0005\u044d\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0004\u0005\u0457\b\u0005\u000b\u0005\f\u0005"+
		"\u0458\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0004\u0006\u05be\b\u0006\u000b\u0006\f\u0006\u05bf"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u05c9\b\u0006\u0001\u0006\u0003\u0006\u05cc\b"+
		"\u0006\u0001\u0006\u0003\u0006\u05cf\b\u0006\u0001\u0006\u0003\u0006\u05d2"+
		"\b\u0006\u0001\u0006\u0003\u0006\u05d5\b\u0006\u0001\u0006\u0003\u0006"+
		"\u05d8\b\u0006\u0001\u0006\u0005\u0006\u05db\b\u0006\n\u0006\f\u0006\u05de"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0004\u0006\u05e6\b\u0006\u000b\u0006\f\u0006\u05e7\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0601\b\u0006"+
		"\n\u0006\f\u0006\u0604\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u060e"+
		"\b\u0006\n\u0006\f\u0006\u0611\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u0625\b\u0006\u000b\u0006"+
		"\f\u0006\u0626\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0004\u0006\u0630\b\u0006\u000b\u0006\f\u0006"+
		"\u0631\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0687\b\u0007\u0001\u0007\u0003\u0007\u068a\b\u0007\u0001\u0007"+
		"\u0003\u0007\u068d\b\u0007\u0001\u0007\u0003\u0007\u0690\b\u0007\u0001"+
		"\u0007\u0003\u0007\u0693\b\u0007\u0001\u0007\u0003\u0007\u0696\b\u0007"+
		"\u0001\u0007\u0005\u0007\u0699\b\u0007\n\u0007\f\u0007\u069c\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004"+
		"\u0007\u06ec\b\u0007\u000b\u0007\f\u0007\u06ed\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0711\b\u0007\u0001\u0007\u0003\u0007\u0714\b"+
		"\u0007\u0001\u0007\u0003\u0007\u0717\b\u0007\u0001\u0007\u0003\u0007\u071a"+
		"\b\u0007\u0001\u0007\u0003\u0007\u071d\b\u0007\u0001\u0007\u0003\u0007"+
		"\u0720\b\u0007\u0001\u0007\u0005\u0007\u0723\b\u0007\n\u0007\f\u0007\u0726"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u0738"+
		"\b\u0007\u000b\u0007\f\u0007\u0739\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u0743\b\u0007"+
		"\u000b\u0007\f\u0007\u0744\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u089a\b\b\u0001"+
		"\b\u0003\b\u089d\b\b\u0001\b\u0003\b\u08a0\b\b\u0001\b\u0003\b\u08a3\b"+
		"\b\u0001\b\u0003\b\u08a6\b\b\u0001\b\u0003\b\u08a9\b\b\u0001\b\u0005\b"+
		"\u08ac\b\b\n\b\f\b\u08af\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u08b8\b\b\n\b\f\b\u08bb\t\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u08c3\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u0910\b\b\u0001\b\u0003\b\u0913\b\b\u0001\b\u0003\b\u0916\b\b\u0001"+
		"\b\u0003\b\u0919\b\b\u0001\b\u0003\b\u091c\b\b\u0001\b\u0003\b\u091f\b"+
		"\b\u0001\b\u0005\b\u0922\b\b\n\b\f\b\u0925\t\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u0937\b\b\u000b\b\f\b\u0938"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u0942"+
		"\b\b\u000b\b\f\b\u0943\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u0999\b\t\u000b\t\f"+
		"\t\u099a\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u09e4\b\t\u0001\t\u0003\t\u09e7\b\t\u0001\t\u0003\t\u09ea\b"+
		"\t\u0001\t\u0003\t\u09ed\b\t\u0001\t\u0003\t\u09f0\b\t\u0001\t\u0003\t"+
		"\u09f3\b\t\u0001\t\u0005\t\u09f6\b\t\n\t\f\t\u09f9\t\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004"+
		"\t\u0a05\b\t\u000b\t\f\t\u0a06\u0003\t\u0a09\b\t\u0004\t\u0a0b\b\t\u000b"+
		"\t\f\t\u0a0c\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u0a15"+
		"\b\t\u000b\t\f\t\u0a16\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0a55\b\n\u0001\n\u0003\n\u0a58\b\n\u0001\n\u0003\n\u0a5b\b"+
		"\n\u0001\n\u0003\n\u0a5e\b\n\u0001\n\u0003\n\u0a61\b\n\u0001\n\u0003\n"+
		"\u0a64\b\n\u0001\n\u0005\n\u0a67\b\n\n\n\f\n\u0a6a\t\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0003\n\u0a71\b\n\u0001\n\u0003\n\u0a74\b\n\u0001"+
		"\n\u0003\n\u0a77\b\n\u0001\n\u0003\n\u0a7a\b\n\u0001\n\u0003\n\u0a7d\b"+
		"\n\u0001\n\u0003\n\u0a80\b\n\u0001\n\u0005\n\u0a83\b\n\n\n\f\n\u0a86\t"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0a92\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0a9b\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0004\n\u0aa3\b\n\u000b\n\f\n\u0aa4\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0004\n\u0aae\b\n\u000b\n\f\n\u0aaf\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u0acd\b\u000b\u000b"+
		"\u000b\f\u000b\u0ace\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0ad6\b\u000b\u0001\u000b\u0003\u000b\u0ad9\b\u000b"+
		"\u0001\u000b\u0003\u000b\u0adc\b\u000b\u0001\u000b\u0003\u000b\u0adf\b"+
		"\u000b\u0001\u000b\u0003\u000b\u0ae2\b\u000b\u0001\u000b\u0003\u000b\u0ae5"+
		"\b\u000b\u0001\u000b\u0005\u000b\u0ae8\b\u000b\n\u000b\f\u000b\u0aeb\t"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0af2\b\u000b\u0001\u000b\u0003\u000b\u0af5\b\u000b\u0001\u000b"+
		"\u0003\u000b\u0af8\b\u000b\u0001\u000b\u0003\u000b\u0afb\b\u000b\u0001"+
		"\u000b\u0003\u000b\u0afe\b\u000b\u0001\u000b\u0003\u000b\u0b01\b\u000b"+
		"\u0001\u000b\u0005\u000b\u0b04\b\u000b\n\u000b\f\u000b\u0b07\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0b2b\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0b2f\b\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0b33\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0b37\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0b3b\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0b43\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u0b48\b\u000b\u000b\u000b"+
		"\f\u000b\u0b49\u0004\u000b\u0b4c\b\u000b\u000b\u000b\f\u000b\u0b4d\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0004\u000b\u0b57\b\u000b\u000b\u000b\f\u000b\u0b58\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0004\f\u0b75\b\f\u000b\f\f\f\u0b76\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0004\f\u0ba1\b\f\u000b\f\f\f\u0ba2\u0004\f"+
		"\u0ba5\b\f\u000b\f\f\f\u0ba6\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0004\f\u0bb0\b\f\u000b\f\f\f\u0bb1\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0bd3\b\r\u0001\r\u0003\r\u0bd6\b\r\u0001\r\u0003\r"+
		"\u0bd9\b\r\u0001\r\u0003\r\u0bdc\b\r\u0001\r\u0003\r\u0bdf\b\r\u0001\r"+
		"\u0003\r\u0be2\b\r\u0001\r\u0005\r\u0be5\b\r\n\r\f\r\u0be8\t\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u0c04"+
		"\b\r\u000b\r\f\r\u0c05\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0c3f\b\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u0c43\b\u000e\u000b"+
		"\u000e\f\u000e\u0c44\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0004\u000e\u0c59\b\u000e\u000b\u000e\f\u000e\u0c5a"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0004\u000e\u0c64\b\u000e\u000b\u000e\f\u000e\u0c65\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0c83\b\u000f\n\u000f\f\u000f"+
		"\u0c86\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0c8b\b"+
		"\u000f\u0001\u000f\u0003\u000f\u0c8e\b\u000f\u0001\u000f\u0003\u000f\u0c91"+
		"\b\u000f\u0001\u000f\u0003\u000f\u0c94\b\u000f\u0001\u000f\u0003\u000f"+
		"\u0c97\b\u000f\u0001\u000f\u0003\u000f\u0c9a\b\u000f\u0001\u000f\u0005"+
		"\u000f\u0c9d\b\u000f\n\u000f\f\u000f\u0ca0\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0ca5\b\u000f\u0001\u000f\u0003\u000f\u0ca8\b"+
		"\u000f\u0001\u000f\u0003\u000f\u0cab\b\u000f\u0001\u000f\u0003\u000f\u0cae"+
		"\b\u000f\u0001\u000f\u0003\u000f\u0cb1\b\u000f\u0001\u000f\u0003\u000f"+
		"\u0cb4\b\u000f\u0001\u000f\u0005\u000f\u0cb7\b\u000f\n\u000f\f\u000f\u0cba"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0cbf\b\u000f"+
		"\n\u000f\f\u000f\u0cc2\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0004\u000f\u0ccf\b\u000f\u000b\u000f\f\u000f\u0cd0"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0cee\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0d0f\b\u0010\u0001\u0010\u0003\u0010\u0d12\b\u0010\u0001"+
		"\u0010\u0003\u0010\u0d15\b\u0010\u0001\u0010\u0003\u0010\u0d18\b\u0010"+
		"\u0001\u0010\u0003\u0010\u0d1b\b\u0010\u0001\u0010\u0003\u0010\u0d1e\b"+
		"\u0010\u0001\u0010\u0005\u0010\u0d21\b\u0010\n\u0010\f\u0010\u0d24\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0d2c\b\u0010\n\u0010\f\u0010\u0d2f\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0d33\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0d39\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0d3f\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0d43"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u0d49"+
		"\b\u0010\u000b\u0010\f\u0010\u0d4a\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u0d53\b\u0010\u000b\u0010"+
		"\f\u0010\u0d54\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0db5\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0db9\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u0dbf\b\u0011\u000b"+
		"\u0011\f\u0011\u0dc0\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0dcf\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0dd7\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u0de2\b\u0011\u000b\u0011\f"+
		"\u0011\u0de3\u0004\u0011\u0de6\b\u0011\u000b\u0011\f\u0011\u0de7\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0004"+
		"\u0011\u0df0\b\u0011\u000b\u0011\f\u0011\u0df1\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0004\u0013\u0e05\b\u0013\u000b\u0013"+
		"\f\u0013\u0e06\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0004\u0014\u0e0e\b\u0014\u000b\u0014\f\u0014\u0e0f\u0001\u0014\u0000"+
		"\u0000\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(\u0000\u0001\u0001\u0000\u0005\n\u0eea\u0000"+
		";\u0001\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000\u0004\u014a\u0001"+
		"\u0000\u0000\u0000\u0006\u01f3\u0001\u0000\u0000\u0000\b\u0292\u0001\u0000"+
		"\u0000\u0000\n\u034c\u0001\u0000\u0000\u0000\f\u0468\u0001\u0000\u0000"+
		"\u0000\u000e\u0641\u0001\u0000\u0000\u0000\u0010\u0752\u0001\u0000\u0000"+
		"\u0000\u0012\u0953\u0001\u0000\u0000\u0000\u0014\u0a21\u0001\u0000\u0000"+
		"\u0000\u0016\u0abe\u0001\u0000\u0000\u0000\u0018\u0b66\u0001\u0000\u0000"+
		"\u0000\u001a\u0bbf\u0001\u0000\u0000\u0000\u001c\u0c13\u0001\u0000\u0000"+
		"\u0000\u001e\u0c74\u0001\u0000\u0000\u0000 \u0cdc\u0001\u0000\u0000\u0000"+
		"\"\u0d65\u0001\u0000\u0000\u0000$\u0e00\u0001\u0000\u0000\u0000&\u0e04"+
		"\u0001\u0000\u0000\u0000(\u0e0d\u0001\u0000\u0000\u0000*<\u0003\"\u0011"+
		"\u0000+<\u0003 \u0010\u0000,<\u0003\u001c\u000e\u0000-<\u0003\u0014\n"+
		"\u0000.<\u0003\u001a\r\u0000/<\u0003\u001e\u000f\u00000<\u0003\u0018\f"+
		"\u00001<\u0003\u0016\u000b\u00002<\u0003\u0012\t\u00003<\u0003\u0010\b"+
		"\u00004<\u0003\u000e\u0007\u00005<\u0003\f\u0006\u00006<\u0003\n\u0005"+
		"\u00007<\u0003\u0006\u0003\u00008<\u0003\b\u0004\u00009<\u0003\u0002\u0001"+
		"\u0000:<\u0003\u0004\u0002\u0000;*\u0001\u0000\u0000\u0000;+\u0001\u0000"+
		"\u0000\u0000;,\u0001\u0000\u0000\u0000;-\u0001\u0000\u0000\u0000;.\u0001"+
		"\u0000\u0000\u0000;/\u0001\u0000\u0000\u0000;0\u0001\u0000\u0000\u0000"+
		";1\u0001\u0000\u0000\u0000;2\u0001\u0000\u0000\u0000;3\u0001\u0000\u0000"+
		"\u0000;4\u0001\u0000\u0000\u0000;5\u0001\u0000\u0000\u0000;6\u0001\u0000"+
		"\u0000\u0000;7\u0001\u0000\u0000\u0000;8\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000<\u0001\u0001\u0000\u0000"+
		"\u0000=>\u0005\u0005\u0000\u0000>?\u0005\u0003\u0000\u0000?@\u0005\n\u0000"+
		"\u0000@A\u0005\u0003\u0000\u0000AB\u0005\n\u0000\u0000BC\u0005\n\u0000"+
		"\u0000CD\u0005\n\u0000\u0000DE\u0005\n\u0000\u0000EF\u0005\n\u0000\u0000"+
		"FG\u0005\n\u0000\u0000GH\u0005\n\u0000\u0000HI\u0005\u0003\u0000\u0000"+
		"IJ\u0005\n\u0000\u0000J\u0137\u0005\u0004\u0000\u0000KL\u0005\b\u0000"+
		"\u0000LM\u0005\u0003\u0000\u0000MN\u0005\u0004\u0000\u0000NO\u0005\b\u0000"+
		"\u0000OP\u0005\u0003\u0000\u0000PQ\u0005\u0004\u0000\u0000QR\u0005\b\u0000"+
		"\u0000RS\u0005\u0003\u0000\u0000ST\u0005\u0004\u0000\u0000TU\u0005\b\u0000"+
		"\u0000UV\u0005\u0003\u0000\u0000VW\u0005\u0004\u0000\u0000WX\u0005\b\u0000"+
		"\u0000XY\u0005\u0003\u0000\u0000YZ\u0005\u0004\u0000\u0000Z[\u0005\b\u0000"+
		"\u0000[\\\u0005\u0003\u0000\u0000\\]\u0005\u0003\u0000\u0000]^\u0005\u0003"+
		"\u0000\u0000^_\u0005\u0003\u0000\u0000_`\u0005\u0003\u0000\u0000`a\u0005"+
		"\u0004\u0000\u0000ab\u0005\b\u0000\u0000bc\u0005\u0003\u0000\u0000cd\u0005"+
		"\u0003\u0000\u0000de\u0005\u0003\u0000\u0000ef\u0005\u0004\u0000\u0000"+
		"fg\u0005\b\u0000\u0000gh\u0005\u0003\u0000\u0000hi\u0005\u0003\u0000\u0000"+
		"ij\u0005\u0003\u0000\u0000jk\u0005\u0003\u0000\u0000kl\u0005\u0003\u0000"+
		"\u0000lm\u0005\u0004\u0000\u0000mn\u0005\b\u0000\u0000no\u0005\u0003\u0000"+
		"\u0000op\u0005\u0003\u0000\u0000pq\u0005\u0003\u0000\u0000qr\u0005\u0003"+
		"\u0000\u0000rs\u0005\u0003\u0000\u0000st\u0005\u0004\u0000\u0000tu\u0005"+
		"\b\u0000\u0000uv\u0005\u0003\u0000\u0000vw\u0005\u0003\u0000\u0000wx\u0005"+
		"\u0003\u0000\u0000xy\u0005\u0003\u0000\u0000yz\u0005\u0004\u0000\u0000"+
		"z{\u0005\b\u0000\u0000{|\u0005\u0003\u0000\u0000|}\u0005\u0004\u0000\u0000"+
		"}~\u0005\b\u0000\u0000~\u007f\u0005\u0003\u0000\u0000\u007f\u0080\u0005"+
		"\u0003\u0000\u0000\u0080\u0081\u0005\u0003\u0000\u0000\u0081\u0082\u0005"+
		"\u0003\u0000\u0000\u0082\u0083\u0005\u0003\u0000\u0000\u0083\u0084\u0005"+
		"\u0004\u0000\u0000\u0084\u0085\u0005\b\u0000\u0000\u0085\u0086\u0005\u0003"+
		"\u0000\u0000\u0086\u0087\u0005\u0003\u0000\u0000\u0087\u0088\u0005\u0003"+
		"\u0000\u0000\u0088\u0089\u0005\u0004\u0000\u0000\u0089\u008a\u0005\b\u0000"+
		"\u0000\u008a\u008b\u0005\u0003\u0000\u0000\u008b\u008c\u0005\u0003\u0000"+
		"\u0000\u008c\u008d\u0005\u0003\u0000\u0000\u008d\u008e\u0005\u0003\u0000"+
		"\u0000\u008e\u008f\u0005\u0003\u0000\u0000\u008f\u0090\u0005\u0004\u0000"+
		"\u0000\u0090\u0091\u0005\b\u0000\u0000\u0091\u0092\u0005\u0003\u0000\u0000"+
		"\u0092\u0093\u0005\u0003\u0000\u0000\u0093\u0094\u0005\u0003\u0000\u0000"+
		"\u0094\u0095\u0005\u0003\u0000\u0000\u0095\u0096\u0005\u0003\u0000\u0000"+
		"\u0096\u0097\u0005\u0004\u0000\u0000\u0097\u0098\u0005\b\u0000\u0000\u0098"+
		"\u0099\u0005\u0003\u0000\u0000\u0099\u009a\u0005\u0003\u0000\u0000\u009a"+
		"\u009b\u0005\u0003\u0000\u0000\u009b\u009c\u0005\u0003\u0000\u0000\u009c"+
		"\u009d\u0005\u0004\u0000\u0000\u009d\u009e\u0005\b\u0000\u0000\u009e\u009f"+
		"\u0005\u0003\u0000\u0000\u009f\u00a0\u0005\u0004\u0000\u0000\u00a0\u00a1"+
		"\u0005\b\u0000\u0000\u00a1\u00a2\u0005\u0003\u0000\u0000\u00a2\u00a3\u0005"+
		"\u0004\u0000\u0000\u00a3\u00a4\u0005\b\u0000\u0000\u00a4\u00a5\u0005\u0003"+
		"\u0000\u0000\u00a5\u00a6\u0005\u0004\u0000\u0000\u00a6\u00a7\u0005\b\u0000"+
		"\u0000\u00a7\u00a8\u0005\u0003\u0000\u0000\u00a8\u00a9\u0005\u0004\u0000"+
		"\u0000\u00a9\u00aa\u0005\b\u0000\u0000\u00aa\u00ab\u0005\u0003\u0000\u0000"+
		"\u00ab\u00ac\u0005\u0003\u0000\u0000\u00ac\u00ad\u0005\u0003\u0000\u0000"+
		"\u00ad\u00ae\u0005\u0003\u0000\u0000\u00ae\u00af\u0005\u0003\u0000\u0000"+
		"\u00af\u00b0\u0005\u0004\u0000\u0000\u00b0\u00b1\u0005\b\u0000\u0000\u00b1"+
		"\u00b2\u0005\u0003\u0000\u0000\u00b2\u00b3\u0005\u0003\u0000\u0000\u00b3"+
		"\u00b4\u0005\u0003\u0000\u0000\u00b4\u00b5\u0005\u0004\u0000\u0000\u00b5"+
		"\u00b6\u0005\b\u0000\u0000\u00b6\u00b7\u0005\u0003\u0000\u0000\u00b7\u00b8"+
		"\u0005\u0003\u0000\u0000\u00b8\u00b9\u0005\u0003\u0000\u0000\u00b9\u00ba"+
		"\u0005\u0003\u0000\u0000\u00ba\u00bb\u0005\u0003\u0000\u0000\u00bb\u00bc"+
		"\u0005\u0004\u0000\u0000\u00bc\u00bd\u0005\b\u0000\u0000\u00bd\u00be\u0005"+
		"\u0003\u0000\u0000\u00be\u00bf\u0005\u0003\u0000\u0000\u00bf\u00c0\u0005"+
		"\u0003\u0000\u0000\u00c0\u00c1\u0005\u0003\u0000\u0000\u00c1\u00c2\u0005"+
		"\u0003\u0000\u0000\u00c2\u00c3\u0005\u0004\u0000\u0000\u00c3\u00c4\u0005"+
		"\b\u0000\u0000\u00c4\u00c5\u0005\u0003\u0000\u0000\u00c5\u00c6\u0005\u0003"+
		"\u0000\u0000\u00c6\u00c7\u0005\u0003\u0000\u0000\u00c7\u00c8\u0005\u0003"+
		"\u0000\u0000\u00c8\u00c9\u0005\u0004\u0000\u0000\u00c9\u00ca\u0005\b\u0000"+
		"\u0000\u00ca\u00cb\u0005\u0003\u0000\u0000\u00cb\u00cc\u0005\u0004\u0000"+
		"\u0000\u00cc\u00cd\u0005\b\u0000\u0000\u00cd\u00ce\u0005\u0003\u0000\u0000"+
		"\u00ce\u00cf\u0005\u0004\u0000\u0000\u00cf\u00d0\u0005\b\u0000\u0000\u00d0"+
		"\u00d1\u0005\u0003\u0000\u0000\u00d1\u00d2\u0005\u0004\u0000\u0000\u00d2"+
		"\u00d3\u0005\b\u0000\u0000\u00d3\u00d4\u0005\u0003\u0000\u0000\u00d4\u00d5"+
		"\u0005\u0003\u0000\u0000\u00d5\u00d6\u0005\u0003\u0000\u0000\u00d6\u00d7"+
		"\u0005\u0003\u0000\u0000\u00d7\u00d8\u0005\u0003\u0000\u0000\u00d8\u00d9"+
		"\u0005\u0004\u0000\u0000\u00d9\u00da\u0005\b\u0000\u0000\u00da\u00db\u0005"+
		"\u0003\u0000\u0000\u00db\u00dc\u0005\u0003\u0000\u0000\u00dc\u00dd\u0005"+
		"\u0003\u0000\u0000\u00dd\u00de\u0005\u0004\u0000\u0000\u00de\u00df\u0005"+
		"\b\u0000\u0000\u00df\u00e0\u0005\u0003\u0000\u0000\u00e0\u00e1\u0005\u0003"+
		"\u0000\u0000\u00e1\u00e2\u0005\u0003\u0000\u0000\u00e2\u00e3\u0005\u0003"+
		"\u0000\u0000\u00e3\u00e4\u0005\u0003\u0000\u0000\u00e4\u00e5\u0005\u0004"+
		"\u0000\u0000\u00e5\u00e6\u0005\b\u0000\u0000\u00e6\u00e7\u0005\u0003\u0000"+
		"\u0000\u00e7\u00e8\u0005\u0003\u0000\u0000\u00e8\u00e9\u0005\u0003\u0000"+
		"\u0000\u00e9\u00ea\u0005\u0003\u0000\u0000\u00ea\u00eb\u0005\u0003\u0000"+
		"\u0000\u00eb\u00ec\u0005\u0004\u0000\u0000\u00ec\u00ed\u0005\b\u0000\u0000"+
		"\u00ed\u00ee\u0005\u0003\u0000\u0000\u00ee\u00ef\u0005\u0003\u0000\u0000"+
		"\u00ef\u00f0\u0005\u0003\u0000\u0000\u00f0\u00f1\u0005\u0003\u0000\u0000"+
		"\u00f1\u00f2\u0005\u0004\u0000\u0000\u00f2\u00f3\u0005\b\u0000\u0000\u00f3"+
		"\u00f4\u0005\u0003\u0000\u0000\u00f4\u00f5\u0005\n\u0000\u0000\u00f5\u00f6"+
		"\u0005\u0004\u0000\u0000\u00f6\u00f7\u0005\b\u0000\u0000\u00f7\u00f8\u0005"+
		"\u0003\u0000\u0000\u00f8\u0129\u0005\u0004\u0000\u0000\u00f9\u00fa\u0005"+
		"\b\u0000\u0000\u00fa\u00fb\u0005\u0003\u0000\u0000\u00fb\u00fc\u0005\u0006"+
		"\u0000\u0000\u00fc\u00fd\u0005\u0004\u0000\u0000\u00fd\u00fe\u0005\b\u0000"+
		"\u0000\u00fe\u00ff\u0005\u0003\u0000\u0000\u00ff\u0100\u0005\b\u0000\u0000"+
		"\u0100\u0101\u0005\u0004\u0000\u0000\u0101\u0102\u0005\b\u0000\u0000\u0102"+
		"\u0103\u0005\u0003\u0000\u0000\u0103\u0104\u0005\b\u0000\u0000\u0104\u0105"+
		"\u0005\u0004\u0000\u0000\u0105\u0106\u0005\b\u0000\u0000\u0106\u0107\u0005"+
		"\u0003\u0000\u0000\u0107\u0108\u0005\b\u0000\u0000\u0108\u0109\u0005\u0004"+
		"\u0000\u0000\u0109\u010a\u0005\b\u0000\u0000\u010a\u010b\u0005\u0003\u0000"+
		"\u0000\u010b\u010c\u0005\b\u0000\u0000\u010c\u010d\u0005\u0004\u0000\u0000"+
		"\u010d\u010e\u0005\b\u0000\u0000\u010e\u010f\u0005\u0003\u0000\u0000\u010f"+
		"\u0110\u0005\b\u0000\u0000\u0110\u0111\u0005\u0004\u0000\u0000\u0111\u0112"+
		"\u0005\b\u0000\u0000\u0112\u0113\u0005\u0003\u0000\u0000\u0113\u0114\u0005"+
		"\b\u0000\u0000\u0114\u0115\u0005\u0004\u0000\u0000\u0115\u0116\u0005\b"+
		"\u0000\u0000\u0116\u0117\u0005\u0003\u0000\u0000\u0117\u0118\u0005\b\u0000"+
		"\u0000\u0118\u0119\u0005\u0004\u0000\u0000\u0119\u011a\u0005\b\u0000\u0000"+
		"\u011a\u011b\u0005\u0003\u0000\u0000\u011b\u011c\u0005\b\u0000\u0000\u011c"+
		"\u011d\u0005\u0004\u0000\u0000\u011d\u011e\u0005\b\u0000\u0000\u011e\u011f"+
		"\u0005\u0003\u0000\u0000\u011f\u0120\u0005\b\u0000\u0000\u0120\u0121\u0005"+
		"\u0004\u0000\u0000\u0121\u0122\u0005\b\u0000\u0000\u0122\u0123\u0005\u0003"+
		"\u0000\u0000\u0123\u0124\u0005\b\u0000\u0000\u0124\u0125\u0005\u0004\u0000"+
		"\u0000\u0125\u0126\u0005\b\u0000\u0000\u0126\u0127\u0005\u0003\u0000\u0000"+
		"\u0127\u0128\u0005\u0004\u0000\u0000\u0128\u012a\u0006\u0001\uffff\uffff"+
		"\u0000\u0129\u00f9\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000"+
		"\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000"+
		"\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012dK\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000"+
		"\u0131\u0132\u0005\n\u0000\u0000\u0132\u0133\u0005\u0003\u0000\u0000\u0133"+
		"\u0134\u0005\n\u0000\u0000\u0134\u0135\u0005\u0003\u0000\u0000\u0135\u0136"+
		"\u0005\u0006\u0000\u0000\u0136\u0138\u0005\u0004\u0000\u0000\u0137\u012d"+
		"\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u0137"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0005\u0005\u0000\u0000\u013c\u013d"+
		"\u0005\u0003\u0000\u0000\u013d\u013e\u0005\n\u0000\u0000\u013e\u013f\u0005"+
		"\u0003\u0000\u0000\u013f\u0140\u0005\n\u0000\u0000\u0140\u0141\u0005\n"+
		"\u0000\u0000\u0141\u0142\u0005\n\u0000\u0000\u0142\u0143\u0005\n\u0000"+
		"\u0000\u0143\u0144\u0005\n\u0000\u0000\u0144\u0145\u0005\n\u0000\u0000"+
		"\u0145\u0146\u0005\n\u0000\u0000\u0146\u0147\u0005\u0003\u0000\u0000\u0147"+
		"\u0148\u0005\n\u0000\u0000\u0148\u0149\u0005\u0004\u0000\u0000\u0149\u0003"+
		"\u0001\u0000\u0000\u0000\u014a\u014b\u0005\u0005\u0000\u0000\u014b\u014c"+
		"\u0005\u0003\u0000\u0000\u014c\u014d\u0005\n\u0000\u0000\u014d\u014e\u0005"+
		"\u0003\u0000\u0000\u014e\u014f\u0005\n\u0000\u0000\u014f\u0150\u0005\n"+
		"\u0000\u0000\u0150\u0151\u0005\n\u0000\u0000\u0151\u0152\u0005\n\u0000"+
		"\u0000\u0152\u0153\u0005\n\u0000\u0000\u0153\u0154\u0005\n\u0000\u0000"+
		"\u0154\u0155\u0005\n\u0000\u0000\u0155\u0156\u0005\u0003\u0000\u0000\u0156"+
		"\u0157\u0005\n\u0000\u0000\u0157\u01e0\u0005\u0004\u0000\u0000\u0158\u0159"+
		"\u0005\b\u0000\u0000\u0159\u015a\u0005\u0003\u0000\u0000\u015a\u015b\u0005"+
		"\u0004\u0000\u0000\u015b\u015c\u0005\b\u0000\u0000\u015c\u015d\u0005\u0003"+
		"\u0000\u0000\u015d\u015e\u0005\u0003\u0000\u0000\u015e\u015f\u0005\u0003"+
		"\u0000\u0000\u015f\u0160\u0005\u0004\u0000\u0000\u0160\u0161\u0005\b\u0000"+
		"\u0000\u0161\u0162\u0005\u0003\u0000\u0000\u0162\u0163\u0005\u0003\u0000"+
		"\u0000\u0163\u0164\u0005\u0003\u0000\u0000\u0164\u0165\u0005\u0004\u0000"+
		"\u0000\u0165\u0166\u0005\b\u0000\u0000\u0166\u0167\u0005\u0003\u0000\u0000"+
		"\u0167\u0168\u0005\u0003\u0000\u0000\u0168\u0169\u0005\u0003\u0000\u0000"+
		"\u0169\u016a\u0005\u0004\u0000\u0000\u016a\u016b\u0005\b\u0000\u0000\u016b"+
		"\u016c\u0005\u0003\u0000\u0000\u016c\u016d\u0005\u0003\u0000\u0000\u016d"+
		"\u016e\u0005\u0003\u0000\u0000\u016e\u016f\u0005\u0004\u0000\u0000\u016f"+
		"\u0170\u0005\b\u0000\u0000\u0170\u0171\u0005\u0003\u0000\u0000\u0171\u0172"+
		"\u0005\u0003\u0000\u0000\u0172\u0173\u0005\u0003\u0000\u0000\u0173\u0174"+
		"\u0005\u0004\u0000\u0000\u0174\u0175\u0005\b\u0000\u0000\u0175\u0176\u0005"+
		"\u0003\u0000\u0000\u0176\u0177\u0005\u0003\u0000\u0000\u0177\u0178\u0005"+
		"\u0003\u0000\u0000\u0178\u0179\u0005\u0004\u0000\u0000\u0179\u017a\u0005"+
		"\b\u0000\u0000\u017a\u017b\u0005\u0003\u0000\u0000\u017b\u017c\u0005\u0003"+
		"\u0000\u0000\u017c\u017d\u0005\u0003\u0000\u0000\u017d\u017e\u0005\n\u0000"+
		"\u0000\u017e\u017f\u0005\u0004\u0000\u0000\u017f\u0180\u0005\b\u0000\u0000"+
		"\u0180\u0181\u0005\u0003\u0000\u0000\u0181\u0182\u0005\u0003\u0000\u0000"+
		"\u0182\u0183\u0005\u0003\u0000\u0000\u0183\u01d1\u0005\u0004\u0000\u0000"+
		"\u0184\u0185\u0003$\u0012\u0000\u0185\u0186\u0005\u0003\u0000\u0000\u0186"+
		"\u0187\u0005\u0006\u0000\u0000\u0187\u0188\u0005\u0004\u0000\u0000\u0188"+
		"\u0189\u0005\b\u0000\u0000\u0189\u018a\u0005\u0003\u0000\u0000\u018a\u018b"+
		"\u0005\b\u0000\u0000\u018b\u018c\u0005\u0004\u0000\u0000\u018c\u018d\u0005"+
		"\b\u0000\u0000\u018d\u018e\u0005\u0003\u0000\u0000\u018e\u018f\u0005\b"+
		"\u0000\u0000\u018f\u0190\u0005\u0004\u0000\u0000\u0190\u0191\u0005\b\u0000"+
		"\u0000\u0191\u0192\u0005\u0003\u0000\u0000\u0192\u0193\u0005\b\u0000\u0000"+
		"\u0193\u0194\u0005\u0004\u0000\u0000\u0194\u0195\u0005\b\u0000\u0000\u0195"+
		"\u0196\u0005\u0003\u0000\u0000\u0196\u0197\u0005\b\u0000\u0000\u0197\u0198"+
		"\u0005\u0004\u0000\u0000\u0198\u0199\u0005\b\u0000\u0000\u0199\u019a\u0005"+
		"\u0003\u0000\u0000\u019a\u019b\u0005\b\u0000\u0000\u019b\u019c\u0005\u0004"+
		"\u0000\u0000\u019c\u019d\u0005\b\u0000\u0000\u019d\u019e\u0005\u0003\u0000"+
		"\u0000\u019e\u019f\u0005\b\u0000\u0000\u019f\u01a0\u0005\u0004\u0000\u0000"+
		"\u01a0\u01a1\u0005\b\u0000\u0000\u01a1\u01a2\u0005\u0003\u0000\u0000\u01a2"+
		"\u01a3\u0005\b\u0000\u0000\u01a3\u01a4\u0005\u0004\u0000\u0000\u01a4\u01a5"+
		"\u0005\b\u0000\u0000\u01a5\u01a6\u0005\u0003\u0000\u0000\u01a6\u01a7\u0005"+
		"\b\u0000\u0000\u01a7\u01a8\u0005\u0004\u0000\u0000\u01a8\u01a9\u0005\b"+
		"\u0000\u0000\u01a9\u01aa\u0005\u0003\u0000\u0000\u01aa\u01ab\u0005\b\u0000"+
		"\u0000\u01ab\u01ac\u0005\u0004\u0000\u0000\u01ac\u01ad\u0005\b\u0000\u0000"+
		"\u01ad\u01ae\u0005\u0003\u0000\u0000\u01ae\u01af\u0005\b\u0000\u0000\u01af"+
		"\u01b0\u0005\u0004\u0000\u0000\u01b0\u01b1\u0005\b\u0000\u0000\u01b1\u01b2"+
		"\u0005\u0003\u0000\u0000\u01b2\u01b3\u0005\b\u0000\u0000\u01b3\u01b4\u0005"+
		"\u0004\u0000\u0000\u01b4\u01b5\u0005\b\u0000\u0000\u01b5\u01b6\u0005\u0003"+
		"\u0000\u0000\u01b6\u01b7\u0005\b\u0000\u0000\u01b7\u01b8\u0005\u0004\u0000"+
		"\u0000\u01b8\u01b9\u0005\b\u0000\u0000\u01b9\u01bb\u0005\u0003\u0000\u0000"+
		"\u01ba\u01bc\u0003$\u0012\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bd\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd"+
		"\u01be\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c0\u0005\u0004\u0000\u0000\u01c0\u01c1\u0005\b\u0000\u0000\u01c1\u01c2"+
		"\u0005\u0003\u0000\u0000\u01c2\u01c3\u0003$\u0012\u0000\u01c3\u01c4\u0005"+
		"\u0004\u0000\u0000\u01c4\u01c5\u0005\b\u0000\u0000\u01c5\u01c6\u0005\u0003"+
		"\u0000\u0000\u01c6\u01c7\u0003$\u0012\u0000\u01c7\u01c8\u0005\u0004\u0000"+
		"\u0000\u01c8\u01c9\u0005\b\u0000\u0000\u01c9\u01ca\u0005\u0003\u0000\u0000"+
		"\u01ca\u01cb\u0003$\u0012\u0000\u01cb\u01cc\u0005\u0004\u0000\u0000\u01cc"+
		"\u01cd\u0005\b\u0000\u0000\u01cd\u01ce\u0005\u0003\u0000\u0000\u01ce\u01cf"+
		"\u0005\u0004\u0000\u0000\u01cf\u01d0\u0006\u0002\uffff\uffff\u0000\u01d0"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d1\u0184\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000\u01d5"+
		"\u0158\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d9\u0001\u0000\u0000\u0000\u01d9\u01da\u0005\n\u0000\u0000\u01da\u01db"+
		"\u0005\u0003\u0000\u0000\u01db\u01dc\u0005\n\u0000\u0000\u01dc\u01dd\u0005"+
		"\u0003\u0000\u0000\u01dd\u01de\u0005\u0006\u0000\u0000\u01de\u01df\u0005"+
		"\u0004\u0000\u0000\u01df\u01e1\u0001\u0000\u0000\u0000\u01e0\u01d5\u0001"+
		"\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e5\u0005\u0005\u0000\u0000\u01e5\u01e6\u0005"+
		"\u0003\u0000\u0000\u01e6\u01e7\u0005\n\u0000\u0000\u01e7\u01e8\u0005\u0003"+
		"\u0000\u0000\u01e8\u01e9\u0005\n\u0000\u0000\u01e9\u01ea\u0005\n\u0000"+
		"\u0000\u01ea\u01eb\u0005\n\u0000\u0000\u01eb\u01ec\u0005\n\u0000\u0000"+
		"\u01ec\u01ed\u0005\n\u0000\u0000\u01ed\u01ee\u0005\n\u0000\u0000\u01ee"+
		"\u01ef\u0005\n\u0000\u0000\u01ef\u01f0\u0005\u0003\u0000\u0000\u01f0\u01f1"+
		"\u0005\n\u0000\u0000\u01f1\u01f2\u0005\u0004\u0000\u0000\u01f2\u0005\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f4\u0005\u0005\u0000\u0000\u01f4\u01f5\u0005"+
		"\u0003\u0000\u0000\u01f5\u01f6\u0005\n\u0000\u0000\u01f6\u01f7\u0005\u0003"+
		"\u0000\u0000\u01f7\u01f8\u0005\n\u0000\u0000\u01f8\u01f9\u0005\n\u0000"+
		"\u0000\u01f9\u01fa\u0005\n\u0000\u0000\u01fa\u01fb\u0005\n\u0000\u0000"+
		"\u01fb\u01fc\u0005\n\u0000\u0000\u01fc\u01fd\u0005\n\u0000\u0000\u01fd"+
		"\u01fe\u0005\u0003\u0000\u0000\u01fe\u01ff\u0005\n\u0000\u0000\u01ff\u0200"+
		"\u0005\u0004\u0000\u0000\u0200\u0201\u0005\n\u0000\u0000\u0201\u0202\u0005"+
		"\u0003\u0000\u0000\u0202\u0203\u0005\n\u0000\u0000\u0203\u0204\u0005\u0003"+
		"\u0000\u0000\u0204\u0206\u0003$\u0012\u0000\u0205\u0207\u0003$\u0012\u0000"+
		"\u0206\u0205\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000"+
		"\u0207\u0209\u0001\u0000\u0000\u0000\u0208\u020a\u0003$\u0012\u0000\u0209"+
		"\u0208\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a"+
		"\u020c\u0001\u0000\u0000\u0000\u020b\u020d\u0003$\u0012\u0000\u020c\u020b"+
		"\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u020f"+
		"\u0001\u0000\u0000\u0000\u020e\u0210\u0003$\u0012\u0000\u020f\u020e\u0001"+
		"\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0212\u0001"+
		"\u0000\u0000\u0000\u0211\u0213\u0003$\u0012\u0000\u0212\u0211\u0001\u0000"+
		"\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u0215\u0001\u0000"+
		"\u0000\u0000\u0214\u0216\u0003$\u0012\u0000\u0215\u0214\u0001\u0000\u0000"+
		"\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u021a\u0001\u0000\u0000"+
		"\u0000\u0217\u0219\u0003$\u0012\u0000\u0218\u0217\u0001\u0000\u0000\u0000"+
		"\u0219\u021c\u0001\u0000\u0000\u0000\u021a\u0218\u0001\u0000\u0000\u0000"+
		"\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021d\u0001\u0000\u0000\u0000"+
		"\u021c\u021a\u0001\u0000\u0000\u0000\u021d\u021f\u0005\u0003\u0000\u0000"+
		"\u021e\u0220\u0003$\u0012\u0000\u021f\u021e\u0001\u0000\u0000\u0000\u0220"+
		"\u0221\u0001\u0000\u0000\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0221"+
		"\u0222\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223"+
		"\u0224\u0005\u0003\u0000\u0000\u0224\u0225\u0005\u0004\u0000\u0000\u0225"+
		"\u0226\u0005\n\u0000\u0000\u0226\u0227\u0005\u0003\u0000\u0000\u0227\u0228"+
		"\u0005\n\u0000\u0000\u0228\u0229\u0005\u0003\u0000\u0000\u0229\u022a\u0005"+
		"\n\u0000\u0000\u022a\u022b\u0005\u0003\u0000\u0000\u022b\u022c\u0003$"+
		"\u0012\u0000\u022c\u022d\u0005\u0003\u0000\u0000\u022d\u022e\u0005\u0004"+
		"\u0000\u0000\u022e\u022f\u0005\n\u0000\u0000\u022f\u0230\u0005\u0003\u0000"+
		"\u0000\u0230\u0231\u0005\n\u0000\u0000\u0231\u0232\u0005\u0003\u0000\u0000"+
		"\u0232\u0233\u0005\b\u0000\u0000\u0233\u0234\u0005\u0003\u0000\u0000\u0234"+
		"\u0235\u0005\b\u0000\u0000\u0235\u0236\u0005\u0003\u0000\u0000\u0236\u0237"+
		"\u0005\u0004\u0000\u0000\u0237\u0238\u0005\n\u0000\u0000\u0238\u0239\u0005"+
		"\u0003\u0000\u0000\u0239\u023a\u0005\n\u0000\u0000\u023a\u023b\u0005\u0003"+
		"\u0000\u0000\u023b\u023c\u0005\b\u0000\u0000\u023c\u023d\u0005\u0003\u0000"+
		"\u0000\u023d\u023e\u0005\n\u0000\u0000\u023e\u023f\u0005\u0003\u0000\u0000"+
		"\u023f\u0240\u0005\u0004\u0000\u0000\u0240\u0241\u0005\n\u0000\u0000\u0241"+
		"\u0242\u0005\u0003\u0000\u0000\u0242\u0243\u0005\n\u0000\u0000\u0243\u0244"+
		"\u0005\u0003\u0000\u0000\u0244\u0245\u0005\u0006\u0000\u0000\u0245\u0246"+
		"\u0005\u0003\u0000\u0000\u0246\u0247\u0005\u0006\u0000\u0000\u0247\u0248"+
		"\u0005\u0003\u0000\u0000\u0248\u0249\u0005\u0004\u0000\u0000\u0249\u024a"+
		"\u0005\n\u0000\u0000\u024a\u024b\u0005\u0003\u0000\u0000\u024b\u024c\u0005"+
		"\n\u0000\u0000\u024c\u024d\u0005\u0003\u0000\u0000\u024d\u024f\u0003$"+
		"\u0012\u0000\u024e\u0250\u0003$\u0012\u0000\u024f\u024e\u0001\u0000\u0000"+
		"\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0252\u0001\u0000\u0000"+
		"\u0000\u0251\u0253\u0003$\u0012\u0000\u0252\u0251\u0001\u0000\u0000\u0000"+
		"\u0252\u0253\u0001\u0000\u0000\u0000\u0253\u0255\u0001\u0000\u0000\u0000"+
		"\u0254\u0256\u0003$\u0012\u0000\u0255\u0254\u0001\u0000\u0000\u0000\u0255"+
		"\u0256\u0001\u0000\u0000\u0000\u0256\u0258\u0001\u0000\u0000\u0000\u0257"+
		"\u0259\u0003$\u0012\u0000\u0258\u0257\u0001\u0000\u0000\u0000\u0258\u0259"+
		"\u0001\u0000\u0000\u0000\u0259\u025b\u0001\u0000\u0000\u0000\u025a\u025c"+
		"\u0003$\u0012\u0000\u025b\u025a\u0001\u0000\u0000\u0000\u025b\u025c\u0001"+
		"\u0000\u0000\u0000\u025c\u025e\u0001\u0000\u0000\u0000\u025d\u025f\u0003"+
		"$\u0012\u0000\u025e\u025d\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000"+
		"\u0000\u0000\u025f\u0263\u0001\u0000\u0000\u0000\u0260\u0262\u0003$\u0012"+
		"\u0000\u0261\u0260\u0001\u0000\u0000\u0000\u0262\u0265\u0001\u0000\u0000"+
		"\u0000\u0263\u0261\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000"+
		"\u0000\u0264\u0266\u0001\u0000\u0000\u0000\u0265\u0263\u0001\u0000\u0000"+
		"\u0000\u0266\u0267\u0005\u0003\u0000\u0000\u0267\u0268\u0005\n\u0000\u0000"+
		"\u0268\u0269\u0005\u0003\u0000\u0000\u0269\u026a\u0005\u0004\u0000\u0000"+
		"\u026a\u026b\u0005\n\u0000\u0000\u026b\u026c\u0005\u0003\u0000\u0000\u026c"+
		"\u026d\u0005\n\u0000\u0000\u026d\u026e\u0005\n\u0000\u0000\u026e\u026f"+
		"\u0005\n\u0000\u0000\u026f\u0270\u0005\n\u0000\u0000\u0270\u0271\u0005"+
		"\b\u0000\u0000\u0271\u0272\u0005\u0003\u0000\u0000\u0272\u0273\u0005\u0004"+
		"\u0000\u0000\u0273\u0274\u0005\n\u0000\u0000\u0274\u0275\u0005\u0003\u0000"+
		"\u0000\u0275\u0276\u0005\n\u0000\u0000\u0276\u0277\u0005\u0003\u0000\u0000"+
		"\u0277\u0278\u0005\u0004\u0000\u0000\u0278\u0279\u0005\n\u0000\u0000\u0279"+
		"\u027a\u0005\u0003\u0000\u0000\u027a\u027b\u0005\n\u0000\u0000\u027b\u027c"+
		"\u0005\u0003\u0000\u0000\u027c\u027d\u0005\u0004\u0000\u0000\u027d\u027e"+
		"\u0005\n\u0000\u0000\u027e\u027f\u0005\u0003\u0000\u0000\u027f\u0280\u0005"+
		"\n\u0000\u0000\u0280\u0281\u0005\u0003\u0000\u0000\u0281\u0282\u0005\u0006"+
		"\u0000\u0000\u0282\u0283\u0005\u0004\u0000\u0000\u0283\u0284\u0005\u0005"+
		"\u0000\u0000\u0284\u0285\u0005\u0003\u0000\u0000\u0285\u0286\u0005\n\u0000"+
		"\u0000\u0286\u0287\u0005\u0003\u0000\u0000\u0287\u0288\u0005\n\u0000\u0000"+
		"\u0288\u0289\u0005\n\u0000\u0000\u0289\u028a\u0005\n\u0000\u0000\u028a"+
		"\u028b\u0005\n\u0000\u0000\u028b\u028c\u0005\n\u0000\u0000\u028c\u028d"+
		"\u0005\n\u0000\u0000\u028d\u028e\u0005\u0003\u0000\u0000\u028e\u028f\u0005"+
		"\n\u0000\u0000\u028f\u0290\u0005\u0004\u0000\u0000\u0290\u0291\u0006\u0003"+
		"\uffff\uffff\u0000\u0291\u0007\u0001\u0000\u0000\u0000\u0292\u0293\u0005"+
		"\u0005\u0000\u0000\u0293\u0294\u0005\u0003\u0000\u0000\u0294\u0295\u0005"+
		"\n\u0000\u0000\u0295\u0296\u0005\u0003\u0000\u0000\u0296\u0297\u0005\n"+
		"\u0000\u0000\u0297\u0298\u0005\n\u0000\u0000\u0298\u0299\u0005\n\u0000"+
		"\u0000\u0299\u029a\u0005\n\u0000\u0000\u029a\u029b\u0005\n\u0000\u0000"+
		"\u029b\u029c\u0005\n\u0000\u0000\u029c\u029d\u0005\u0003\u0000\u0000\u029d"+
		"\u029e\u0005\n\u0000\u0000\u029e\u029f\u0005\u0004\u0000\u0000\u029f\u02a0"+
		"\u0005\n\u0000\u0000\u02a0\u02a1\u0005\u0003\u0000\u0000\u02a1\u02a2\u0005"+
		"\n\u0000\u0000\u02a2\u02a3\u0005\u0003\u0000\u0000\u02a3\u02a5\u0003$"+
		"\u0012\u0000\u02a4\u02a6\u0003$\u0012\u0000\u02a5\u02a4\u0001\u0000\u0000"+
		"\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a8\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a9\u0003$\u0012\u0000\u02a8\u02a7\u0001\u0000\u0000\u0000"+
		"\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9\u02ab\u0001\u0000\u0000\u0000"+
		"\u02aa\u02ac\u0003$\u0012\u0000\u02ab\u02aa\u0001\u0000\u0000\u0000\u02ab"+
		"\u02ac\u0001\u0000\u0000\u0000\u02ac\u02ae\u0001\u0000\u0000\u0000\u02ad"+
		"\u02af\u0003$\u0012\u0000\u02ae\u02ad\u0001\u0000\u0000\u0000\u02ae\u02af"+
		"\u0001\u0000\u0000\u0000\u02af\u02b1\u0001\u0000\u0000\u0000\u02b0\u02b2"+
		"\u0003$\u0012\u0000\u02b1\u02b0\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001"+
		"\u0000\u0000\u0000\u02b2\u02b4\u0001\u0000\u0000\u0000\u02b3\u02b5\u0003"+
		"$\u0012\u0000\u02b4\u02b3\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000"+
		"\u0000\u0000\u02b5\u02b9\u0001\u0000\u0000\u0000\u02b6\u02b8\u0003$\u0012"+
		"\u0000\u02b7\u02b6\u0001\u0000\u0000\u0000\u02b8\u02bb\u0001\u0000\u0000"+
		"\u0000\u02b9\u02b7\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000"+
		"\u0000\u02ba\u02bc\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000\u0000"+
		"\u0000\u02bc\u02be\u0005\u0003\u0000\u0000\u02bd\u02bf\u0003$\u0012\u0000"+
		"\u02be\u02bd\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000"+
		"\u02c0\u02be\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000\u0000"+
		"\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u02c3\u0005\u0003\u0000\u0000"+
		"\u02c3\u02c4\u0005\u0004\u0000\u0000\u02c4\u02c5\u0005\n\u0000\u0000\u02c5"+
		"\u02c6\u0005\u0003\u0000\u0000\u02c6\u02c7\u0005\n\u0000\u0000\u02c7\u02c8"+
		"\u0005\u0003\u0000\u0000\u02c8\u02c9\u0005\n\u0000\u0000\u02c9\u02ca\u0005"+
		"\u0003\u0000\u0000\u02ca\u02cb\u0003$\u0012\u0000\u02cb\u02cc\u0005\u0003"+
		"\u0000\u0000\u02cc\u02cd\u0005\u0004\u0000\u0000\u02cd\u02ce\u0005\n\u0000"+
		"\u0000\u02ce\u02cf\u0005\u0003\u0000\u0000\u02cf\u02d0\u0005\n\u0000\u0000"+
		"\u02d0\u02d1\u0005\u0003\u0000\u0000\u02d1\u02d2\u0005\n\u0000\u0000\u02d2"+
		"\u02d3\u0005\n\u0000\u0000\u02d3\u02d4\u0005\n\u0000\u0000\u02d4\u02d5"+
		"\u0005\n\u0000\u0000\u02d5\u02d6\u0005\n\u0000\u0000\u02d6\u02d7\u0005"+
		"\n\u0000\u0000\u02d7\u02d8\u0005\n\u0000\u0000\u02d8\u02d9\u0005\u0003"+
		"\u0000\u0000\u02d9\u02da\u0005\n\u0000\u0000\u02da\u02db\u0005\u0003\u0000"+
		"\u0000\u02db\u02dc\u0005\u0004\u0000\u0000\u02dc\u02dd\u0005\n\u0000\u0000"+
		"\u02dd\u02de\u0005\u0003\u0000\u0000\u02de\u02df\u0005\n\u0000\u0000\u02df"+
		"\u02e0\u0005\u0003\u0000\u0000\u02e0\u02e1\u0005\b\u0000\u0000\u02e1\u02e2"+
		"\u0005\u0003\u0000\u0000\u02e2\u02e3\u0005\b\u0000\u0000\u02e3\u02e4\u0005"+
		"\u0003\u0000\u0000\u02e4\u02e5\u0005\u0004\u0000\u0000\u02e5\u02e6\u0005"+
		"\n\u0000\u0000\u02e6\u02e7\u0005\u0003\u0000\u0000\u02e7\u02e8\u0005\n"+
		"\u0000\u0000\u02e8\u02e9\u0005\u0003\u0000\u0000\u02e9\u02ea\u0005\b\u0000"+
		"\u0000\u02ea\u02eb\u0005\u0003\u0000\u0000\u02eb\u02ec\u0005\u0006\u0000"+
		"\u0000\u02ec\u02ed\u0005\u0003\u0000\u0000\u02ed\u02ee\u0005\u0004\u0000"+
		"\u0000\u02ee\u02ef\u0005\n\u0000\u0000\u02ef\u02f0\u0005\u0003\u0000\u0000"+
		"\u02f0\u02f1\u0005\n\u0000\u0000\u02f1\u02f2\u0005\u0003\u0000\u0000\u02f2"+
		"\u02f3\u0005\n\u0000\u0000\u02f3\u02f4\u0005\u0003\u0000\u0000\u02f4\u02f5"+
		"\u0005\n\u0000\u0000\u02f5\u02f6\u0005\u0003\u0000\u0000\u02f6\u02f7\u0005"+
		"\u0004\u0000\u0000\u02f7\u02f8\u0005\n\u0000\u0000\u02f8\u02f9\u0005\u0003"+
		"\u0000\u0000\u02f9\u02fa\u0005\n\u0000\u0000\u02fa\u02fb\u0005\u0003\u0000"+
		"\u0000\u02fb\u02fc\u0005\n\u0000\u0000\u02fc\u02fd\u0005\u0003\u0000\u0000"+
		"\u02fd\u02fe\u0005\n\u0000\u0000\u02fe\u02ff\u0005\u0003\u0000\u0000\u02ff"+
		"\u0300\u0005\u0004\u0000\u0000\u0300\u0301\u0005\n\u0000\u0000\u0301\u0302"+
		"\u0005\u0003\u0000\u0000\u0302\u0303\u0005\n\u0000\u0000\u0303\u0304\u0005"+
		"\u0003\u0000\u0000\u0304\u0305\u0005\n\u0000\u0000\u0305\u0306\u0005\u0003"+
		"\u0000\u0000\u0306\u0308\u0003$\u0012\u0000\u0307\u0309\u0003$\u0012\u0000"+
		"\u0308\u0307\u0001\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000"+
		"\u0309\u030b\u0001\u0000\u0000\u0000\u030a\u030c\u0003$\u0012\u0000\u030b"+
		"\u030a\u0001\u0000\u0000\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c"+
		"\u030e\u0001\u0000\u0000\u0000\u030d\u030f\u0003$\u0012\u0000\u030e\u030d"+
		"\u0001\u0000\u0000\u0000\u030e\u030f\u0001\u0000\u0000\u0000\u030f\u0311"+
		"\u0001\u0000\u0000\u0000\u0310\u0312\u0003$\u0012\u0000\u0311\u0310\u0001"+
		"\u0000\u0000\u0000\u0311\u0312\u0001\u0000\u0000\u0000\u0312\u0314\u0001"+
		"\u0000\u0000\u0000\u0313\u0315\u0003$\u0012\u0000\u0314\u0313\u0001\u0000"+
		"\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0317\u0001\u0000"+
		"\u0000\u0000\u0316\u0318\u0003$\u0012\u0000\u0317\u0316\u0001\u0000\u0000"+
		"\u0000\u0317\u0318\u0001\u0000\u0000\u0000\u0318\u031c\u0001\u0000\u0000"+
		"\u0000\u0319\u031b\u0003$\u0012\u0000\u031a\u0319\u0001\u0000\u0000\u0000"+
		"\u031b\u031e\u0001\u0000\u0000\u0000\u031c\u031a\u0001\u0000\u0000\u0000"+
		"\u031c\u031d\u0001\u0000\u0000\u0000\u031d\u031f\u0001\u0000\u0000\u0000"+
		"\u031e\u031c\u0001\u0000\u0000\u0000\u031f\u0320\u0005\u0003\u0000\u0000"+
		"\u0320\u0321\u0005\u0004\u0000\u0000\u0321\u0322\u0005\n\u0000\u0000\u0322"+
		"\u0323\u0005\n\u0000\u0000\u0323\u0324\u0005\u0003\u0000\u0000\u0324\u0325"+
		"\u0005\n\u0000\u0000\u0325\u0326\u0005\n\u0000\u0000\u0326\u0327\u0005"+
		"\n\u0000\u0000\u0327\u0328\u0005\u0003\u0000\u0000\u0328\u0329\u0005\u0004"+
		"\u0000\u0000\u0329\u032a\u0005\n\u0000\u0000\u032a\u032b\u0005\u0003\u0000"+
		"\u0000\u032b\u032c\u0005\n\u0000\u0000\u032c\u032d\u0005\n\u0000\u0000"+
		"\u032d\u032e\u0005\n\u0000\u0000\u032e\u032f\u0005\n\u0000\u0000\u032f"+
		"\u0330\u0005\n\u0000\u0000\u0330\u0331\u0005\n\u0000\u0000\u0331\u0332"+
		"\u0005\n\u0000\u0000\u0332\u0333\u0005\n\u0000\u0000\u0333\u0334\u0005"+
		"\n\u0000\u0000\u0334\u0335\u0005\n\u0000\u0000\u0335\u0336\u0005\u0003"+
		"\u0000\u0000\u0336\u0337\u0005\u0004\u0000\u0000\u0337\u0338\u0005\n\u0000"+
		"\u0000\u0338\u0339\u0005\u0003\u0000\u0000\u0339\u033a\u0005\n\u0000\u0000"+
		"\u033a\u033b\u0005\u0003\u0000\u0000\u033b\u033c\u0005\u0006\u0000\u0000"+
		"\u033c\u033d\u0005\u0004\u0000\u0000\u033d\u033e\u0005\u0005\u0000\u0000"+
		"\u033e\u033f\u0005\u0003\u0000\u0000\u033f\u0340\u0005\n\u0000\u0000\u0340"+
		"\u0341\u0005\u0003\u0000\u0000\u0341\u0342\u0005\n\u0000\u0000\u0342\u0343"+
		"\u0005\n\u0000\u0000\u0343\u0344\u0005\n\u0000\u0000\u0344\u0345\u0005"+
		"\n\u0000\u0000\u0345\u0346\u0005\n\u0000\u0000\u0346\u0347\u0005\n\u0000"+
		"\u0000\u0347\u0348\u0005\u0003\u0000\u0000\u0348\u0349\u0005\n\u0000\u0000"+
		"\u0349\u034a\u0005\u0004\u0000\u0000\u034a\u034b\u0006\u0004\uffff\uffff"+
		"\u0000\u034b\t\u0001\u0000\u0000\u0000\u034c\u034d\u0005\u0005\u0000\u0000"+
		"\u034d\u034e\u0005\u0003\u0000\u0000\u034e\u034f\u0005\n\u0000\u0000\u034f"+
		"\u0350\u0005\u0003\u0000\u0000\u0350\u0351\u0005\n\u0000\u0000\u0351\u0352"+
		"\u0005\n\u0000\u0000\u0352\u0353\u0005\n\u0000\u0000\u0353\u0354\u0005"+
		"\n\u0000\u0000\u0354\u0355\u0005\n\u0000\u0000\u0355\u0356\u0005\n\u0000"+
		"\u0000\u0356\u0357\u0005\u0003\u0000\u0000\u0357\u0358\u0005\n\u0000\u0000"+
		"\u0358\u0456\u0005\u0004\u0000\u0000\u0359\u035a\u0005\n\u0000\u0000\u035a"+
		"\u035b\u0005\u0003\u0000\u0000\u035b\u035c\u0005\u0004\u0000\u0000\u035c"+
		"\u035d\u0005\n\u0000\u0000\u035d\u035e\u0005\u0003\u0000\u0000\u035e\u035f"+
		"\u0005\u0003\u0000\u0000\u035f\u0360\u0005\u0003\u0000\u0000\u0360\u0361"+
		"\u0005\u0004\u0000\u0000\u0361\u0362\u0005\n\u0000\u0000\u0362\u0363\u0005"+
		"\u0003\u0000\u0000\u0363\u0364\u0005\u0003\u0000\u0000\u0364\u0365\u0005"+
		"\u0003\u0000\u0000\u0365\u0366\u0005\u0004\u0000\u0000\u0366\u0367\u0005"+
		"\n\u0000\u0000\u0367\u0368\u0005\u0003\u0000\u0000\u0368\u0369\u0005\u0003"+
		"\u0000\u0000\u0369\u036a\u0005\u0003\u0000\u0000\u036a\u036b\u0005\u0004"+
		"\u0000\u0000\u036b\u036c\u0005\n\u0000\u0000\u036c\u036d\u0005\u0003\u0000"+
		"\u0000\u036d\u036e\u0005\u0003\u0000\u0000\u036e\u036f\u0005\u0003\u0000"+
		"\u0000\u036f\u0370\u0005\u0004\u0000\u0000\u0370\u0371\u0005\n\u0000\u0000"+
		"\u0371\u0372\u0005\u0003\u0000\u0000\u0372\u0373\u0005\u0003\u0000\u0000"+
		"\u0373\u0374\u0005\u0003\u0000\u0000\u0374\u0375\u0005\u0004\u0000\u0000"+
		"\u0375\u0376\u0005\n\u0000\u0000\u0376\u0377\u0005\u0003\u0000\u0000\u0377"+
		"\u0378\u0005\u0003\u0000\u0000\u0378\u0379\u0005\u0003\u0000\u0000\u0379"+
		"\u037a\u0005\u0004\u0000\u0000\u037a\u037b\u0005\n\u0000\u0000\u037b\u037c"+
		"\u0005\u0003\u0000\u0000\u037c\u037d\u0005\u0003\u0000\u0000\u037d\u037e"+
		"\u0005\u0003\u0000\u0000\u037e\u037f\u0005\u0004\u0000\u0000\u037f\u0380"+
		"\u0005\n\u0000\u0000\u0380\u0381\u0005\u0003\u0000\u0000\u0381\u0382\u0005"+
		"\u0003\u0000\u0000\u0382\u0383\u0005\u0003\u0000\u0000\u0383\u0384\u0005"+
		"\u0004\u0000\u0000\u0384\u0385\u0005\n\u0000\u0000\u0385\u0386\u0005\u0003"+
		"\u0000\u0000\u0386\u0387\u0005\u0003\u0000\u0000\u0387\u0388\u0005\u0003"+
		"\u0000\u0000\u0388\u0389\u0005\u0004\u0000\u0000\u0389\u038a\u0005\n\u0000"+
		"\u0000\u038a\u038b\u0005\u0003\u0000\u0000\u038b\u038c\u0005\u0003\u0000"+
		"\u0000\u038c\u038d\u0005\u0003\u0000\u0000\u038d\u038e\u0005\u0004\u0000"+
		"\u0000\u038e\u038f\u0005\n\u0000\u0000\u038f\u0390\u0005\u0003\u0000\u0000"+
		"\u0390\u0391\u0005\u0003\u0000\u0000\u0391\u0392\u0005\u0003\u0000\u0000"+
		"\u0392\u0393\u0005\u0004\u0000\u0000\u0393\u0394\u0005\n\u0000\u0000\u0394"+
		"\u0395\u0005\u0003\u0000\u0000\u0395\u0396\u0005\u0003\u0000\u0000\u0396"+
		"\u0397\u0005\u0003\u0000\u0000\u0397\u0398\u0005\u0004\u0000\u0000\u0398"+
		"\u0399\u0005\n\u0000\u0000\u0399\u039a\u0005\u0003\u0000\u0000\u039a\u039b"+
		"\u0005\u0003\u0000\u0000\u039b\u039c\u0005\u0003\u0000\u0000\u039c\u039d"+
		"\u0005\u0004\u0000\u0000\u039d\u039e\u0005\n\u0000\u0000\u039e\u039f\u0005"+
		"\u0003\u0000\u0000\u039f\u03a0\u0005\u0003\u0000\u0000\u03a0\u03a1\u0005"+
		"\u0003\u0000\u0000\u03a1\u03a2\u0005\u0004\u0000\u0000\u03a2\u03a3\u0005"+
		"\n\u0000\u0000\u03a3\u03a4\u0005\u0003\u0000\u0000\u03a4\u03a5\u0005\u0003"+
		"\u0000\u0000\u03a5\u03a6\u0005\u0003\u0000\u0000\u03a6\u03a7\u0005\u0004"+
		"\u0000\u0000\u03a7\u03a8\u0005\n\u0000\u0000\u03a8\u03a9\u0005\u0003\u0000"+
		"\u0000\u03a9\u03aa\u0005\u0003\u0000\u0000\u03aa\u03ab\u0005\u0003\u0000"+
		"\u0000\u03ab\u03ac\u0005\u0004\u0000\u0000\u03ac\u03ad\u0005\n\u0000\u0000"+
		"\u03ad\u03ae\u0005\u0003\u0000\u0000\u03ae\u03af\u0005\u0003\u0000\u0000"+
		"\u03af\u03b0\u0005\u0003\u0000\u0000\u03b0\u03b1\u0005\u0004\u0000\u0000"+
		"\u03b1\u03b2\u0005\n\u0000\u0000\u03b2\u03b3\u0005\u0003\u0000\u0000\u03b3"+
		"\u03b4\u0005\u0003\u0000\u0000\u03b4\u03b5\u0005\u0003\u0000\u0000\u03b5"+
		"\u03b6\u0005\u0004\u0000\u0000\u03b6\u03b7\u0005\n\u0000\u0000\u03b7\u03b8"+
		"\u0005\u0003\u0000\u0000\u03b8\u03b9\u0005\u0003\u0000\u0000\u03b9\u03ba"+
		"\u0005\u0003\u0000\u0000\u03ba\u03bb\u0005\n\u0000\u0000\u03bb\u03bc\u0005"+
		"\u0004\u0000\u0000\u03bc\u03bd\u0005\n\u0000\u0000\u03bd\u03be\u0005\u0003"+
		"\u0000\u0000\u03be\u03bf\u0005\u0003\u0000\u0000\u03bf\u03c0\u0005\u0003"+
		"\u0000\u0000\u03c0\u044b\u0005\u0004\u0000\u0000\u03c1\u03c2\u0005\n\u0000"+
		"\u0000\u03c2\u03c3\u0005\u0003\u0000\u0000\u03c3\u03c4\u0005\n\u0000\u0000"+
		"\u03c4\u03c5\u0005\u0004\u0000\u0000\u03c5\u03c6\u0005\n\u0000\u0000\u03c6"+
		"\u03c7\u0005\u0003\u0000\u0000\u03c7\u03c8\u0003$\u0012\u0000\u03c8\u03c9"+
		"\u0005\u0004\u0000\u0000\u03c9\u03ca\u0005\n\u0000\u0000\u03ca\u03cb\u0005"+
		"\u0003\u0000\u0000\u03cb\u03cc\u0005\u0004\u0000\u0000\u03cc\u03cd\u0005"+
		"\n\u0000\u0000\u03cd\u03ce\u0005\u0003\u0000\u0000\u03ce\u03d0\u0005\u0003"+
		"\u0000\u0000\u03cf\u03d1\u0003$\u0012\u0000\u03d0\u03cf\u0001\u0000\u0000"+
		"\u0000\u03d1\u03d2\u0001\u0000\u0000\u0000\u03d2\u03d0\u0001\u0000\u0000"+
		"\u0000\u03d2\u03d3\u0001\u0000\u0000\u0000\u03d3\u03d4\u0001\u0000\u0000"+
		"\u0000\u03d4\u03d5\u0005\u0004\u0000\u0000\u03d5\u03d6\u0005\n\u0000\u0000"+
		"\u03d6\u03d7\u0005\u0003\u0000\u0000\u03d7\u03d8\u0005\u0003\u0000\u0000"+
		"\u03d8\u03da\u0003$\u0012\u0000\u03d9\u03db\u0003$\u0012\u0000\u03da\u03d9"+
		"\u0001\u0000\u0000\u0000\u03da\u03db\u0001\u0000\u0000\u0000\u03db\u03dd"+
		"\u0001\u0000\u0000\u0000\u03dc\u03de\u0003$\u0012\u0000\u03dd\u03dc\u0001"+
		"\u0000\u0000\u0000\u03dd\u03de\u0001\u0000\u0000\u0000\u03de\u03e0\u0001"+
		"\u0000\u0000\u0000\u03df\u03e1\u0003$\u0012\u0000\u03e0\u03df\u0001\u0000"+
		"\u0000\u0000\u03e0\u03e1\u0001\u0000\u0000\u0000\u03e1\u03e3\u0001\u0000"+
		"\u0000\u0000\u03e2\u03e4\u0003$\u0012\u0000\u03e3\u03e2\u0001\u0000\u0000"+
		"\u0000\u03e3\u03e4\u0001\u0000\u0000\u0000\u03e4\u03e6\u0001\u0000\u0000"+
		"\u0000\u03e5\u03e7\u0003$\u0012\u0000\u03e6\u03e5\u0001\u0000\u0000\u0000"+
		"\u03e6\u03e7\u0001\u0000\u0000\u0000\u03e7\u03e9\u0001\u0000\u0000\u0000"+
		"\u03e8\u03ea\u0003$\u0012\u0000\u03e9\u03e8\u0001\u0000\u0000\u0000\u03e9"+
		"\u03ea\u0001\u0000\u0000\u0000\u03ea\u03ee\u0001\u0000\u0000\u0000\u03eb"+
		"\u03ed\u0003$\u0012\u0000\u03ec\u03eb\u0001\u0000\u0000\u0000\u03ed\u03f0"+
		"\u0001\u0000\u0000\u0000\u03ee\u03ec\u0001\u0000\u0000\u0000\u03ee\u03ef"+
		"\u0001\u0000\u0000\u0000\u03ef\u03f1\u0001\u0000\u0000\u0000\u03f0\u03ee"+
		"\u0001\u0000\u0000\u0000\u03f1\u03f2\u0005\u0004\u0000\u0000\u03f2\u03f3"+
		"\u0005\n\u0000\u0000\u03f3\u03f4\u0005\u0003\u0000\u0000\u03f4\u03f5\u0005"+
		"\u0004\u0000\u0000\u03f5\u03f6\u0005\n\u0000\u0000\u03f6\u03f8\u0005\u0003"+
		"\u0000\u0000\u03f7\u03f9\u0003$\u0012\u0000\u03f8\u03f7\u0001\u0000\u0000"+
		"\u0000\u03f9\u03fa\u0001\u0000\u0000\u0000\u03fa\u03f8\u0001\u0000\u0000"+
		"\u0000\u03fa\u03fb\u0001\u0000\u0000\u0000\u03fb\u03fc\u0001\u0000\u0000"+
		"\u0000\u03fc\u03fd\u0005\u0004\u0000\u0000\u03fd\u03fe\u0005\n\u0000\u0000"+
		"\u03fe\u03ff\u0005\u0003\u0000\u0000\u03ff\u0400\u0005\u0006\u0000\u0000"+
		"\u0400\u0401\u0005\u0004\u0000\u0000\u0401\u0402\u0005\n\u0000\u0000\u0402"+
		"\u0404\u0005\u0003\u0000\u0000\u0403\u0405\u0003$\u0012\u0000\u0404\u0403"+
		"\u0001\u0000\u0000\u0000\u0405\u0406\u0001\u0000\u0000\u0000\u0406\u0404"+
		"\u0001\u0000\u0000\u0000\u0406\u0407\u0001\u0000\u0000\u0000\u0407\u0408"+
		"\u0001\u0000\u0000\u0000\u0408\u0409\u0005\u0004\u0000\u0000\u0409\u040a"+
		"\u0005\n\u0000\u0000\u040a\u040c\u0005\u0003\u0000\u0000\u040b\u040d\u0003"+
		"$\u0012\u0000\u040c\u040b\u0001\u0000\u0000\u0000\u040d\u040e\u0001\u0000"+
		"\u0000\u0000\u040e\u040c\u0001\u0000\u0000\u0000\u040e\u040f\u0001\u0000"+
		"\u0000\u0000\u040f\u0410\u0001\u0000\u0000\u0000\u0410\u0411\u0005\u0004"+
		"\u0000\u0000\u0411\u0412\u0005\n\u0000\u0000\u0412\u0414\u0005\u0003\u0000"+
		"\u0000\u0413\u0415\u0003$\u0012\u0000\u0414\u0413\u0001\u0000\u0000\u0000"+
		"\u0415\u0416\u0001\u0000\u0000\u0000\u0416\u0414\u0001\u0000\u0000\u0000"+
		"\u0416\u0417\u0001\u0000\u0000\u0000\u0417\u0418\u0001\u0000\u0000\u0000"+
		"\u0418\u0419\u0005\u0004\u0000\u0000\u0419\u041a\u0005\n\u0000\u0000\u041a"+
		"\u041b\u0005\u0003\u0000\u0000\u041b\u041c\u0005\n\u0000\u0000\u041c\u041d"+
		"\u0005\u0004\u0000\u0000\u041d\u041e\u0005\n\u0000\u0000\u041e\u041f\u0005"+
		"\u0003\u0000\u0000\u041f\u0420\u0005\u0004\u0000\u0000\u0420\u0421\u0005"+
		"\n\u0000\u0000\u0421\u0422\u0005\u0003\u0000\u0000\u0422\u0423\u0005\u0003"+
		"\u0000\u0000\u0423\u0424\u0005\n\u0000\u0000\u0424\u0425\u0005\u0004\u0000"+
		"\u0000\u0425\u0426\u0005\n\u0000\u0000\u0426\u0427\u0005\u0003\u0000\u0000"+
		"\u0427\u0428\u0005\u0003\u0000\u0000\u0428\u0429\u0005\n\u0000\u0000\u0429"+
		"\u042a\u0005\u0004\u0000\u0000\u042a\u042b\u0005\n\u0000\u0000\u042b\u042c"+
		"\u0005\u0003\u0000\u0000\u042c\u042d\u0005\u0003\u0000\u0000\u042d\u042e"+
		"\u0005\u0004\u0000\u0000\u042e\u042f\u0005\n\u0000\u0000\u042f\u0430\u0005"+
		"\u0003\u0000\u0000\u0430\u0431\u0005\b\u0000\u0000\u0431\u0432\u0005\u0004"+
		"\u0000\u0000\u0432\u0433\u0005\n\u0000\u0000\u0433\u0435\u0005\u0003\u0000"+
		"\u0000\u0434\u0436\u0003$\u0012\u0000\u0435\u0434\u0001\u0000\u0000\u0000"+
		"\u0436\u0437\u0001\u0000\u0000\u0000\u0437\u0435\u0001\u0000\u0000\u0000"+
		"\u0437\u0438\u0001\u0000\u0000\u0000\u0438\u0439\u0001\u0000\u0000\u0000"+
		"\u0439\u043a\u0005\u0004\u0000\u0000\u043a\u043b\u0005\n\u0000\u0000\u043b"+
		"\u043c\u0005\u0003\u0000\u0000\u043c\u043d\u0005\b\u0000\u0000\u043d\u043e"+
		"\u0005\u0004\u0000\u0000\u043e\u043f\u0005\n\u0000\u0000\u043f\u0440\u0005"+
		"\u0003\u0000\u0000\u0440\u0441\u0005\b\u0000\u0000\u0441\u0442\u0005\u0004"+
		"\u0000\u0000\u0442\u0443\u0005\n\u0000\u0000\u0443\u0444\u0005\u0003\u0000"+
		"\u0000\u0444\u0445\u0005\n\u0000\u0000\u0445\u0446\u0005\u0004\u0000\u0000"+
		"\u0446\u0447\u0005\n\u0000\u0000\u0447\u0448\u0005\u0003\u0000\u0000\u0448"+
		"\u0449\u0005\u0004\u0000\u0000\u0449\u044a\u0006\u0005\uffff\uffff\u0000"+
		"\u044a\u044c\u0001\u0000\u0000\u0000\u044b\u03c1\u0001\u0000\u0000\u0000"+
		"\u044c\u044d\u0001\u0000\u0000\u0000\u044d\u044b\u0001\u0000\u0000\u0000"+
		"\u044d\u044e\u0001\u0000\u0000\u0000\u044e\u044f\u0001\u0000\u0000\u0000"+
		"\u044f\u0450\u0005\n\u0000\u0000\u0450\u0451\u0005\u0003\u0000\u0000\u0451"+
		"\u0452\u0005\n\u0000\u0000\u0452\u0453\u0005\u0003\u0000\u0000\u0453\u0454"+
		"\u0005\u0006\u0000\u0000\u0454\u0455\u0005\u0004\u0000\u0000\u0455\u0457"+
		"\u0001\u0000\u0000\u0000\u0456\u0359\u0001\u0000\u0000\u0000\u0457\u0458"+
		"\u0001\u0000\u0000\u0000\u0458\u0456\u0001\u0000\u0000\u0000\u0458\u0459"+
		"\u0001\u0000\u0000\u0000\u0459\u045a\u0001\u0000\u0000\u0000\u045a\u045b"+
		"\u0005\u0005\u0000\u0000\u045b\u045c\u0005\u0003\u0000\u0000\u045c\u045d"+
		"\u0005\n\u0000\u0000\u045d\u045e\u0005\u0003\u0000\u0000\u045e\u045f\u0005"+
		"\n\u0000\u0000\u045f\u0460\u0005\n\u0000\u0000\u0460\u0461\u0005\n\u0000"+
		"\u0000\u0461\u0462\u0005\n\u0000\u0000\u0462\u0463\u0005\n\u0000\u0000"+
		"\u0463\u0464\u0005\n\u0000\u0000\u0464\u0465\u0005\u0003\u0000\u0000\u0465"+
		"\u0466\u0005\n\u0000\u0000\u0466\u0467\u0005\u0004\u0000\u0000\u0467\u000b"+
		"\u0001\u0000\u0000\u0000\u0468\u0469\u0005\u0005\u0000\u0000\u0469\u046a"+
		"\u0005\u0003\u0000\u0000\u046a\u046b\u0005\n\u0000\u0000\u046b\u046c\u0005"+
		"\u0003\u0000\u0000\u046c\u046d\u0005\n\u0000\u0000\u046d\u046e\u0005\n"+
		"\u0000\u0000\u046e\u046f\u0005\n\u0000\u0000\u046f\u0470\u0005\n\u0000"+
		"\u0000\u0470\u0471\u0005\n\u0000\u0000\u0471\u0472\u0005\n\u0000\u0000"+
		"\u0472\u0473\u0005\u0003\u0000\u0000\u0473\u0474\u0005\n\u0000\u0000\u0474"+
		"\u062f\u0005\u0004\u0000\u0000\u0475\u0476\u0005\u0005\u0000\u0000\u0476"+
		"\u0477\u0005\u0003\u0000\u0000\u0477\u0478\u0005\u0004\u0000\u0000\u0478"+
		"\u0479\u0005\u0005\u0000\u0000\u0479\u047a\u0005\u0003\u0000\u0000\u047a"+
		"\u047b\u0005\u0004\u0000\u0000\u047b\u047c\u0005\u0005\u0000\u0000\u047c"+
		"\u047d\u0005\u0003\u0000\u0000\u047d\u047e\u0005\u0004\u0000\u0000\u047e"+
		"\u047f\u0005\u0005\u0000\u0000\u047f\u0480\u0005\u0003\u0000\u0000\u0480"+
		"\u0481\u0005\u0004\u0000\u0000\u0481\u0482\u0005\u0005\u0000\u0000\u0482"+
		"\u0483\u0005\u0003\u0000\u0000\u0483\u0484\u0005\u0003\u0000\u0000\u0484"+
		"\u0485\u0005\u0003\u0000\u0000\u0485\u0486\u0005\u0003\u0000\u0000\u0486"+
		"\u0487\u0005\u0003\u0000\u0000\u0487\u0488\u0005\u0004\u0000\u0000\u0488"+
		"\u0489\u0005\u0005\u0000\u0000\u0489\u048a\u0005\u0003\u0000\u0000\u048a"+
		"\u048b\u0005\u0003\u0000\u0000\u048b\u048c\u0005\u0003\u0000\u0000\u048c"+
		"\u048d\u0005\u0004\u0000\u0000\u048d\u048e\u0005\u0005\u0000\u0000\u048e"+
		"\u048f\u0005\u0003\u0000\u0000\u048f\u0490\u0005\u0003\u0000\u0000\u0490"+
		"\u0491\u0005\u0003\u0000\u0000\u0491\u0492\u0005\u0003\u0000\u0000\u0492"+
		"\u0493\u0005\u0003\u0000\u0000\u0493\u0494\u0005\u0004\u0000\u0000\u0494"+
		"\u0495\u0005\u0005\u0000\u0000\u0495\u0496\u0005\u0003\u0000\u0000\u0496"+
		"\u0497\u0005\u0003\u0000\u0000\u0497\u0498\u0005\u0003\u0000\u0000\u0498"+
		"\u0499\u0005\u0003\u0000\u0000\u0499\u049a\u0005\u0003\u0000\u0000\u049a"+
		"\u049b\u0005\u0004\u0000\u0000\u049b\u049c\u0005\u0005\u0000\u0000\u049c"+
		"\u049d\u0005\u0003\u0000\u0000\u049d\u049e\u0005\u0003\u0000\u0000\u049e"+
		"\u049f\u0005\u0003\u0000\u0000\u049f\u04a0\u0005\u0003\u0000\u0000\u04a0"+
		"\u04a1\u0005\u0004\u0000\u0000\u04a1\u04a2\u0005\u0005\u0000\u0000\u04a2"+
		"\u04a3\u0005\u0003\u0000\u0000\u04a3\u04a4\u0005\u0004\u0000\u0000\u04a4"+
		"\u04a5\u0005\u0005\u0000\u0000\u04a5\u04a6\u0005\u0003\u0000\u0000\u04a6"+
		"\u04a7\u0005\u0003\u0000\u0000\u04a7\u04a8\u0005\u0003\u0000\u0000\u04a8"+
		"\u04a9\u0005\u0003\u0000\u0000\u04a9\u04aa\u0005\u0003\u0000\u0000\u04aa"+
		"\u04ab\u0005\u0004\u0000\u0000\u04ab\u04ac\u0005\u0005\u0000\u0000\u04ac"+
		"\u04ad\u0005\u0003\u0000\u0000\u04ad\u04ae\u0005\u0003\u0000\u0000\u04ae"+
		"\u04af\u0005\u0003\u0000\u0000\u04af\u04b0\u0005\u0003\u0000\u0000\u04b0"+
		"\u04b1\u0005\u0004\u0000\u0000\u04b1\u04b2\u0005\u0005\u0000\u0000\u04b2"+
		"\u04b3\u0005\u0003\u0000\u0000\u04b3\u04b4\u0005\u0003\u0000\u0000\u04b4"+
		"\u04b5\u0005\u0003\u0000\u0000\u04b5\u04b6\u0005\u0004\u0000\u0000\u04b6"+
		"\u04b7\u0005\u0005\u0000\u0000\u04b7\u04b8\u0005\u0003\u0000\u0000\u04b8"+
		"\u04b9\u0005\u0003\u0000\u0000\u04b9\u04ba\u0005\u0003\u0000\u0000\u04ba"+
		"\u04bb\u0005\u0004\u0000\u0000\u04bb\u04bc\u0005\u0005\u0000\u0000\u04bc"+
		"\u04bd\u0005\u0003\u0000\u0000\u04bd\u04be\u0005\u0003\u0000\u0000\u04be"+
		"\u04bf\u0005\u0003\u0000\u0000\u04bf\u04c0\u0005\u0003\u0000\u0000\u04c0"+
		"\u04c1\u0005\u0003\u0000\u0000\u04c1\u04c2\u0005\u0004\u0000\u0000\u04c2"+
		"\u04c3\u0005\u0005\u0000\u0000\u04c3\u04c4\u0005\u0003\u0000\u0000\u04c4"+
		"\u04c5\u0005\u0003\u0000\u0000\u04c5\u04c6\u0005\u0003\u0000\u0000\u04c6"+
		"\u04c7\u0005\u0003\u0000\u0000\u04c7\u04c8\u0005\u0003\u0000\u0000\u04c8"+
		"\u04c9\u0005\u0004\u0000\u0000\u04c9\u04ca\u0005\u0005\u0000\u0000\u04ca"+
		"\u04cb\u0005\u0003\u0000\u0000\u04cb\u04cc\u0005\u0003\u0000\u0000\u04cc"+
		"\u04cd\u0005\u0004\u0000\u0000\u04cd\u04ce\u0005\u0005\u0000\u0000\u04ce"+
		"\u04cf\u0005\u0003\u0000\u0000\u04cf\u04d0\u0005\u0004\u0000\u0000\u04d0"+
		"\u04d1\u0005\u0005\u0000\u0000\u04d1\u04d2\u0005\u0003\u0000\u0000\u04d2"+
		"\u04d3\u0005\u0003\u0000\u0000\u04d3\u04d4\u0005\u0003\u0000\u0000\u04d4"+
		"\u04d5\u0005\u0003\u0000\u0000\u04d5\u04d6\u0005\u0003\u0000\u0000\u04d6"+
		"\u04d7\u0005\u0004\u0000\u0000\u04d7\u04d8\u0005\u0005\u0000\u0000\u04d8"+
		"\u04d9\u0005\u0003\u0000\u0000\u04d9\u04da\u0005\u0003\u0000\u0000\u04da"+
		"\u04db\u0005\u0003\u0000\u0000\u04db\u04dc\u0005\u0004\u0000\u0000\u04dc"+
		"\u04dd\u0005\u0005\u0000\u0000\u04dd\u04de\u0005\u0003\u0000\u0000\u04de"+
		"\u04df\u0005\u0003\u0000\u0000\u04df\u04e0\u0005\u0003\u0000\u0000\u04e0"+
		"\u04e1\u0005\u0003\u0000\u0000\u04e1\u04e2\u0005\u0003\u0000\u0000\u04e2"+
		"\u04e3\u0005\u0004\u0000\u0000\u04e3\u04e4\u0005\u0005\u0000\u0000\u04e4"+
		"\u04e5\u0005\u0003\u0000\u0000\u04e5\u04e6\u0005\u0003\u0000\u0000\u04e6"+
		"\u04e7\u0005\u0003\u0000\u0000\u04e7\u04e8\u0005\u0003\u0000\u0000\u04e8"+
		"\u04e9\u0005\u0003\u0000\u0000\u04e9\u04ea\u0005\u0004\u0000\u0000\u04ea"+
		"\u04eb\u0005\u0005\u0000\u0000\u04eb\u04ec\u0005\u0003\u0000\u0000\u04ec"+
		"\u04ed\u0005\u0003\u0000\u0000\u04ed\u04ee\u0005\u0003\u0000\u0000\u04ee"+
		"\u04ef\u0005\u0003\u0000\u0000\u04ef\u04f0\u0005\u0004\u0000\u0000\u04f0"+
		"\u04f1\u0005\u0005\u0000\u0000\u04f1\u04f2\u0005\u0003\u0000\u0000\u04f2"+
		"\u04f3\u0005\u0004\u0000\u0000\u04f3\u04f4\u0005\u0005\u0000\u0000\u04f4"+
		"\u04f5\u0005\u0003\u0000\u0000\u04f5\u04f6\u0005\u0003\u0000\u0000\u04f6"+
		"\u04f7\u0005\u0003\u0000\u0000\u04f7\u04f8\u0005\u0003\u0000\u0000\u04f8"+
		"\u04f9\u0005\u0003\u0000\u0000\u04f9\u04fa\u0005\u0004\u0000\u0000\u04fa"+
		"\u04fb\u0005\u0005\u0000\u0000\u04fb\u04fc\u0005\u0003\u0000\u0000\u04fc"+
		"\u04fd\u0005\u0003\u0000\u0000\u04fd\u04fe\u0005\u0003\u0000\u0000\u04fe"+
		"\u04ff\u0005\u0004\u0000\u0000\u04ff\u0500\u0005\u0005\u0000\u0000\u0500"+
		"\u0501\u0005\u0003\u0000\u0000\u0501\u0502\u0005\u0003\u0000\u0000\u0502"+
		"\u0503\u0005\u0003\u0000\u0000\u0503\u0504\u0005\u0003\u0000\u0000\u0504"+
		"\u0505\u0005\u0003\u0000\u0000\u0505\u0506\u0005\u0004\u0000\u0000\u0506"+
		"\u0507\u0005\u0005\u0000\u0000\u0507\u0508\u0005\u0003\u0000\u0000\u0508"+
		"\u0509\u0005\u0003\u0000\u0000\u0509\u050a\u0005\u0003\u0000\u0000\u050a"+
		"\u050b\u0005\u0003\u0000\u0000\u050b\u050c\u0005\u0003\u0000\u0000\u050c"+
		"\u050d\u0005\u0004\u0000\u0000\u050d\u050e\u0005\u0005\u0000\u0000\u050e"+
		"\u050f\u0005\u0003\u0000\u0000\u050f\u0510\u0005\u0003\u0000\u0000\u0510"+
		"\u0511\u0005\u0003\u0000\u0000\u0511\u0512\u0005\u0003\u0000\u0000\u0512"+
		"\u0513\u0005\u0004\u0000\u0000\u0513\u0514\u0005\u0005\u0000\u0000\u0514"+
		"\u0515\u0005\u0003\u0000\u0000\u0515\u0516\u0005\u0004\u0000\u0000\u0516"+
		"\u0517\u0005\u0005\u0000\u0000\u0517\u0518\u0005\u0003\u0000\u0000\u0518"+
		"\u0519\u0005\u0003\u0000\u0000\u0519\u051a\u0005\u0003\u0000\u0000\u051a"+
		"\u051b\u0005\u0003\u0000\u0000\u051b\u051c\u0005\u0003\u0000\u0000\u051c"+
		"\u051d\u0005\u0004\u0000\u0000\u051d\u051e\u0005\u0005\u0000\u0000\u051e"+
		"\u051f\u0005\u0003\u0000\u0000\u051f\u0520\u0005\u0003\u0000\u0000\u0520"+
		"\u0521\u0005\u0003\u0000\u0000\u0521\u0522\u0005\u0004\u0000\u0000\u0522"+
		"\u0523\u0005\u0005\u0000\u0000\u0523\u0524\u0005\u0003\u0000\u0000\u0524"+
		"\u0525\u0005\u0003\u0000\u0000\u0525\u0526\u0005\u0003\u0000\u0000\u0526"+
		"\u0527\u0005\u0003\u0000\u0000\u0527\u0528\u0005\u0003\u0000\u0000\u0528"+
		"\u0529\u0005\u0004\u0000\u0000\u0529\u052a\u0005\u0005\u0000\u0000\u052a"+
		"\u052b\u0005\u0003\u0000\u0000\u052b\u052c\u0005\u0003\u0000\u0000\u052c"+
		"\u052d\u0005\u0003\u0000\u0000\u052d\u052e\u0005\u0003\u0000\u0000\u052e"+
		"\u052f\u0005\u0003\u0000\u0000\u052f\u0530\u0005\u0004\u0000\u0000\u0530"+
		"\u0531\u0005\u0005\u0000\u0000\u0531\u0532\u0005\u0003\u0000\u0000\u0532"+
		"\u0533\u0005\u0003\u0000\u0000\u0533\u0534\u0005\u0003\u0000\u0000\u0534"+
		"\u0535\u0005\u0003\u0000\u0000\u0535\u0536\u0005\u0004\u0000\u0000\u0536"+
		"\u0537\u0005\u0005\u0000\u0000\u0537\u0538\u0005\u0003\u0000\u0000\u0538"+
		"\u0539\u0005\u0004\u0000\u0000\u0539\u053a\u0005\u0005\u0000\u0000\u053a"+
		"\u053b\u0005\u0003\u0000\u0000\u053b\u053c\u0005\u0004\u0000\u0000\u053c"+
		"\u053d\u0005\u0005\u0000\u0000\u053d\u053e\u0005\u0003\u0000\u0000\u053e"+
		"\u053f\u0005\u0003\u0000\u0000\u053f\u0540\u0005\u0003\u0000\u0000\u0540"+
		"\u0541\u0005\u0003\u0000\u0000\u0541\u0542\u0005\u0003\u0000\u0000\u0542"+
		"\u0543\u0005\u0004\u0000\u0000\u0543\u0544\u0005\u0005\u0000\u0000\u0544"+
		"\u0545\u0005\u0003\u0000\u0000\u0545\u0546\u0005\u0003\u0000\u0000\u0546"+
		"\u0547\u0005\u0003\u0000\u0000\u0547\u0548\u0005\u0004\u0000\u0000\u0548"+
		"\u0549\u0005\u0005\u0000\u0000\u0549\u054a\u0005\u0003\u0000\u0000\u054a"+
		"\u054b\u0005\u0003\u0000\u0000\u054b\u054c\u0005\u0003\u0000\u0000\u054c"+
		"\u054d\u0005\u0003\u0000\u0000\u054d\u054e\u0005\u0003\u0000\u0000\u054e"+
		"\u054f\u0005\u0004\u0000\u0000\u054f\u0550\u0005\u0005\u0000\u0000\u0550"+
		"\u0551\u0005\u0003\u0000\u0000\u0551\u0552\u0005\u0003\u0000\u0000\u0552"+
		"\u0553\u0005\u0003\u0000\u0000\u0553\u0554\u0005\u0003\u0000\u0000\u0554"+
		"\u0555\u0005\u0003\u0000\u0000\u0555\u0556\u0005\u0004\u0000\u0000\u0556"+
		"\u0557\u0005\u0005\u0000\u0000\u0557\u0558\u0005\u0003\u0000\u0000\u0558"+
		"\u0559\u0005\u0003\u0000\u0000\u0559\u055a\u0005\u0003\u0000\u0000\u055a"+
		"\u055b\u0005\u0003\u0000\u0000\u055b\u055c\u0005\u0004\u0000\u0000\u055c"+
		"\u055d\u0005\u0005\u0000\u0000\u055d\u055e\u0005\u0003\u0000\u0000\u055e"+
		"\u055f\u0005\u0004\u0000\u0000\u055f\u0560\u0005\u0005\u0000\u0000\u0560"+
		"\u0561\u0005\u0003\u0000\u0000\u0561\u0562\u0005\u0003\u0000\u0000\u0562"+
		"\u0563\u0005\u0003\u0000\u0000\u0563\u0564\u0005\u0003\u0000\u0000\u0564"+
		"\u0565\u0005\u0003\u0000\u0000\u0565\u0566\u0005\u0004\u0000\u0000\u0566"+
		"\u0567\u0005\u0005\u0000\u0000\u0567\u0568\u0005\u0003\u0000\u0000\u0568"+
		"\u0569\u0005\u0003\u0000\u0000\u0569\u056a\u0005\u0003\u0000\u0000\u056a"+
		"\u056b\u0005\u0004\u0000\u0000\u056b\u056c\u0005\u0005\u0000\u0000\u056c"+
		"\u056d\u0005\u0003\u0000\u0000\u056d\u056e\u0005\u0003\u0000\u0000\u056e"+
		"\u056f\u0005\u0003\u0000\u0000\u056f\u0570\u0005\u0003\u0000\u0000\u0570"+
		"\u0571\u0005\u0003\u0000\u0000\u0571\u0572\u0005\u0004\u0000\u0000\u0572"+
		"\u0573\u0005\u0005\u0000\u0000\u0573\u0574\u0005\u0003\u0000\u0000\u0574"+
		"\u0575\u0005\u0003\u0000\u0000\u0575\u0576\u0005\u0003\u0000\u0000\u0576"+
		"\u0577\u0005\u0003\u0000\u0000\u0577\u0578\u0005\u0003\u0000\u0000\u0578"+
		"\u0579\u0005\u0004\u0000\u0000\u0579\u057a\u0005\u0005\u0000\u0000\u057a"+
		"\u057b\u0005\u0003\u0000\u0000\u057b\u057c\u0005\u0003\u0000\u0000\u057c"+
		"\u057d\u0005\u0003\u0000\u0000\u057d\u057e\u0005\u0003\u0000\u0000\u057e"+
		"\u057f\u0005\u0004\u0000\u0000\u057f\u0580\u0005\u0005\u0000\u0000\u0580"+
		"\u0581\u0005\u0003\u0000\u0000\u0581\u0582\u0005\u0004\u0000\u0000\u0582"+
		"\u0583\u0005\u0005\u0000\u0000\u0583\u0584\u0005\u0003\u0000\u0000\u0584"+
		"\u0585\u0005\u0003\u0000\u0000\u0585\u0586\u0005\u0003\u0000\u0000\u0586"+
		"\u0587\u0005\u0003\u0000\u0000\u0587\u0588\u0005\u0003\u0000\u0000\u0588"+
		"\u0589\u0005\u0004\u0000\u0000\u0589\u058a\u0005\u0005\u0000\u0000\u058a"+
		"\u058b\u0005\u0003\u0000\u0000\u058b\u058c\u0005\u0003\u0000\u0000\u058c"+
		"\u058d\u0005\u0003\u0000\u0000\u058d\u058e\u0005\u0004\u0000\u0000\u058e"+
		"\u058f\u0005\u0005\u0000\u0000\u058f\u0590\u0005\u0003\u0000\u0000\u0590"+
		"\u0591\u0005\u0003\u0000\u0000\u0591\u0592\u0005\u0003\u0000\u0000\u0592"+
		"\u0593\u0005\u0003\u0000\u0000\u0593\u0594\u0005\u0003\u0000\u0000\u0594"+
		"\u0595\u0005\u0004\u0000\u0000\u0595\u0596\u0005\u0005\u0000\u0000\u0596"+
		"\u0597\u0005\u0003\u0000\u0000\u0597\u0598\u0005\u0003\u0000\u0000\u0598"+
		"\u0599\u0005\u0003\u0000\u0000\u0599\u059a\u0005\u0003\u0000\u0000\u059a"+
		"\u059b\u0005\u0003\u0000\u0000\u059b\u059c\u0005\u0004\u0000\u0000\u059c"+
		"\u059d\u0005\u0005\u0000\u0000\u059d\u059e\u0005\u0003\u0000\u0000\u059e"+
		"\u059f\u0005\u0003\u0000\u0000\u059f\u05a0\u0005\u0003\u0000\u0000\u05a0"+
		"\u05a1\u0005\u0003\u0000\u0000\u05a1\u05a2\u0005\u0004\u0000\u0000\u05a2"+
		"\u05a3\u0005\u0005\u0000\u0000\u05a3\u05a4\u0005\u0003\u0000\u0000\u05a4"+
		"\u05a5\u0005\n\u0000\u0000\u05a5\u05a6\u0005\u0004\u0000\u0000\u05a6\u05a7"+
		"\u0005\u0005\u0000\u0000\u05a7\u05a8\u0005\u0003\u0000\u0000\u05a8\u0624"+
		"\u0005\u0004\u0000\u0000\u05a9\u05aa\u0005\u0005\u0000\u0000\u05aa\u05ab"+
		"\u0005\u0003\u0000\u0000\u05ab\u05ac\u0005\n\u0000\u0000\u05ac\u05ad\u0005"+
		"\u0004\u0000\u0000\u05ad\u05ae\u0005\u0005\u0000\u0000\u05ae\u05af\u0005"+
		"\u0003\u0000\u0000\u05af\u05b0\u0003$\u0012\u0000\u05b0\u05b1\u0005\u0004"+
		"\u0000\u0000\u05b1\u05b2\u0005\u0005\u0000\u0000\u05b2\u05b3\u0005\u0003"+
		"\u0000\u0000\u05b3\u05b4\u0005\u0004\u0000\u0000\u05b4\u05b5\u0005\u0005"+
		"\u0000\u0000\u05b5\u05b6\u0005\u0003\u0000\u0000\u05b6\u05b7\u0005\u0003"+
		"\u0000\u0000\u05b7\u05b8\u0005\u0004\u0000\u0000\u05b8\u05b9\u0005\u0005"+
		"\u0000\u0000\u05b9\u05ba\u0005\u0003\u0000\u0000\u05ba\u05bb\u0005\u0003"+
		"\u0000\u0000\u05bb\u05bd\u0005\u0003\u0000\u0000\u05bc\u05be\u0003$\u0012"+
		"\u0000\u05bd\u05bc\u0001\u0000\u0000\u0000\u05be\u05bf\u0001\u0000\u0000"+
		"\u0000\u05bf\u05bd\u0001\u0000\u0000\u0000\u05bf\u05c0\u0001\u0000\u0000"+
		"\u0000\u05c0\u05c1\u0001\u0000\u0000\u0000\u05c1\u05c2\u0005\u0004\u0000"+
		"\u0000\u05c2\u05c3\u0005\u0005\u0000\u0000\u05c3\u05c4\u0005\u0003\u0000"+
		"\u0000\u05c4\u05c5\u0005\u0003\u0000\u0000\u05c5\u05c6\u0005\u0003\u0000"+
		"\u0000\u05c6\u05c8\u0003$\u0012\u0000\u05c7\u05c9\u0003$\u0012\u0000\u05c8"+
		"\u05c7\u0001\u0000\u0000\u0000\u05c8\u05c9\u0001\u0000\u0000\u0000\u05c9"+
		"\u05cb\u0001\u0000\u0000\u0000\u05ca\u05cc\u0003$\u0012\u0000\u05cb\u05ca"+
		"\u0001\u0000\u0000\u0000\u05cb\u05cc\u0001\u0000\u0000\u0000\u05cc\u05ce"+
		"\u0001\u0000\u0000\u0000\u05cd\u05cf\u0003$\u0012\u0000\u05ce\u05cd\u0001"+
		"\u0000\u0000\u0000\u05ce\u05cf\u0001\u0000\u0000\u0000\u05cf\u05d1\u0001"+
		"\u0000\u0000\u0000\u05d0\u05d2\u0003$\u0012\u0000\u05d1\u05d0\u0001\u0000"+
		"\u0000\u0000\u05d1\u05d2\u0001\u0000\u0000\u0000\u05d2\u05d4\u0001\u0000"+
		"\u0000\u0000\u05d3\u05d5\u0003$\u0012\u0000\u05d4\u05d3\u0001\u0000\u0000"+
		"\u0000\u05d4\u05d5\u0001\u0000\u0000\u0000\u05d5\u05d7\u0001\u0000\u0000"+
		"\u0000\u05d6\u05d8\u0003$\u0012\u0000\u05d7\u05d6\u0001\u0000\u0000\u0000"+
		"\u05d7\u05d8\u0001\u0000\u0000\u0000\u05d8\u05dc\u0001\u0000\u0000\u0000"+
		"\u05d9\u05db\u0003$\u0012\u0000\u05da\u05d9\u0001\u0000\u0000\u0000\u05db"+
		"\u05de\u0001\u0000\u0000\u0000\u05dc\u05da\u0001\u0000\u0000\u0000\u05dc"+
		"\u05dd\u0001\u0000\u0000\u0000\u05dd\u05df\u0001\u0000\u0000\u0000\u05de"+
		"\u05dc\u0001\u0000\u0000\u0000\u05df\u05e0\u0005\u0004\u0000\u0000\u05e0"+
		"\u05e1\u0005\u0005\u0000\u0000\u05e1\u05e2\u0005\u0003\u0000\u0000\u05e2"+
		"\u05e3\u0005\u0003\u0000\u0000\u05e3\u05e5\u0005\u0003\u0000\u0000\u05e4"+
		"\u05e6\u0003$\u0012\u0000\u05e5\u05e4\u0001\u0000\u0000\u0000\u05e6\u05e7"+
		"\u0001\u0000\u0000\u0000\u05e7\u05e5\u0001\u0000\u0000\u0000\u05e7\u05e8"+
		"\u0001\u0000\u0000\u0000\u05e8\u05e9\u0001\u0000\u0000\u0000\u05e9\u05ea"+
		"\u0005\u0004\u0000\u0000\u05ea\u05eb\u0005\u0005\u0000\u0000\u05eb\u05ec"+
		"\u0005\u0003\u0000\u0000\u05ec\u05ed\u0005\u0003\u0000\u0000\u05ed\u05ee"+
		"\u0005\u0003\u0000\u0000\u05ee\u05ef\u0005\u0004\u0000\u0000\u05ef\u05f0"+
		"\u0005\u0005\u0000\u0000\u05f0\u05f1\u0005\u0003\u0000\u0000\u05f1\u05f2"+
		"\u0005\u0003\u0000\u0000\u05f2\u05f3\u0005\u0003\u0000\u0000\u05f3\u05f4"+
		"\u0005\u0004\u0000\u0000\u05f4\u05f5\u0005\u0005\u0000\u0000\u05f5\u05f6"+
		"\u0005\u0003\u0000\u0000\u05f6\u05f7\u0005\u0003\u0000\u0000\u05f7\u05f8"+
		"\u0005\u0004\u0000\u0000\u05f8\u05f9\u0005\u0005\u0000\u0000\u05f9\u05fa"+
		"\u0005\u0003\u0000\u0000\u05fa\u05fb\u0005\u0006\u0000\u0000\u05fb\u05fc"+
		"\u0005\u0004\u0000\u0000\u05fc\u05fd\u0005\u0005\u0000\u0000\u05fd\u05fe"+
		"\u0005\u0003\u0000\u0000\u05fe\u0602\u0005\n\u0000\u0000\u05ff\u0601\u0003"+
		"$\u0012\u0000\u0600\u05ff\u0001\u0000\u0000\u0000\u0601\u0604\u0001\u0000"+
		"\u0000\u0000\u0602\u0600\u0001\u0000\u0000\u0000\u0602\u0603\u0001\u0000"+
		"\u0000\u0000\u0603\u0605\u0001\u0000\u0000\u0000\u0604\u0602\u0001\u0000"+
		"\u0000\u0000\u0605\u0606\u0005\u0004\u0000\u0000\u0606\u0607\u0005\u0005"+
		"\u0000\u0000\u0607\u0608\u0005\u0003\u0000\u0000\u0608\u0609\u0005\n\u0000"+
		"\u0000\u0609\u060a\u0005\u0004\u0000\u0000\u060a\u060b\u0005\u0005\u0000"+
		"\u0000\u060b\u060f\u0005\u0003\u0000\u0000\u060c\u060e\u0003$\u0012\u0000"+
		"\u060d\u060c\u0001\u0000\u0000\u0000\u060e\u0611\u0001\u0000\u0000\u0000"+
		"\u060f\u060d\u0001\u0000\u0000\u0000\u060f\u0610\u0001\u0000\u0000\u0000"+
		"\u0610\u0612\u0001\u0000\u0000\u0000\u0611\u060f\u0001\u0000\u0000\u0000"+
		"\u0612\u0613\u0005\u0004\u0000\u0000\u0613\u0614\u0005\u0005\u0000\u0000"+
		"\u0614\u0615\u0005\u0003\u0000\u0000\u0615\u0616\u0005\n\u0000\u0000\u0616"+
		"\u0617\u0005\u0004\u0000\u0000\u0617\u0618\u0005\u0005\u0000\u0000\u0618"+
		"\u0619\u0005\u0003\u0000\u0000\u0619\u061a\u0003$\u0012\u0000\u061a\u061b"+
		"\u0005\u0004\u0000\u0000\u061b\u061c\u0005\u0005\u0000\u0000\u061c\u061d"+
		"\u0005\u0003\u0000\u0000\u061d\u061e\u0005\b\u0000\u0000\u061e\u061f\u0005"+
		"\u0004\u0000\u0000\u061f\u0620\u0005\u0005\u0000\u0000\u0620\u0621\u0005"+
		"\u0003\u0000\u0000\u0621\u0622\u0005\u0004\u0000\u0000\u0622\u0623\u0006"+
		"\u0006\uffff\uffff\u0000\u0623\u0625\u0001\u0000\u0000\u0000\u0624\u05a9"+
		"\u0001\u0000\u0000\u0000\u0625\u0626\u0001\u0000\u0000\u0000\u0626\u0624"+
		"\u0001\u0000\u0000\u0000\u0626\u0627\u0001\u0000\u0000\u0000\u0627\u0628"+
		"\u0001\u0000\u0000\u0000\u0628\u0629\u0005\n\u0000\u0000\u0629\u062a\u0005"+
		"\u0003\u0000\u0000\u062a\u062b\u0005\n\u0000\u0000\u062b\u062c\u0005\u0003"+
		"\u0000\u0000\u062c\u062d\u0005\u0006\u0000\u0000\u062d\u062e\u0005\u0004"+
		"\u0000\u0000\u062e\u0630\u0001\u0000\u0000\u0000\u062f\u0475\u0001\u0000"+
		"\u0000\u0000\u0630\u0631\u0001\u0000\u0000\u0000\u0631\u062f\u0001\u0000"+
		"\u0000\u0000\u0631\u0632\u0001\u0000\u0000\u0000\u0632\u0633\u0001\u0000"+
		"\u0000\u0000\u0633\u0634\u0005\u0005\u0000\u0000\u0634\u0635\u0005\u0003"+
		"\u0000\u0000\u0635\u0636\u0005\n\u0000\u0000\u0636\u0637\u0005\u0003\u0000"+
		"\u0000\u0637\u0638\u0005\n\u0000\u0000\u0638\u0639\u0005\n\u0000\u0000"+
		"\u0639\u063a\u0005\n\u0000\u0000\u063a\u063b\u0005\n\u0000\u0000\u063b"+
		"\u063c\u0005\n\u0000\u0000\u063c\u063d\u0005\n\u0000\u0000\u063d\u063e"+
		"\u0005\u0003\u0000\u0000\u063e\u063f\u0005\n\u0000\u0000\u063f\u0640\u0005"+
		"\u0004\u0000\u0000\u0640\r\u0001\u0000\u0000\u0000\u0641\u0642\u0005\u0005"+
		"\u0000\u0000\u0642\u0643\u0005\u0003\u0000\u0000\u0643\u0644\u0005\n\u0000"+
		"\u0000\u0644\u0645\u0005\u0003\u0000\u0000\u0645\u0646\u0005\n\u0000\u0000"+
		"\u0646\u0647\u0005\n\u0000\u0000\u0647\u0648\u0005\n\u0000\u0000\u0648"+
		"\u0649\u0005\n\u0000\u0000\u0649\u064a\u0005\u0003\u0000\u0000\u064a\u064b"+
		"\u0005\n\u0000\u0000\u064b\u0742\u0005\u0004\u0000\u0000\u064c\u064d\u0005"+
		"\n\u0000\u0000\u064d\u064e\u0005\u0003\u0000\u0000\u064e\u064f\u0005\u0006"+
		"\u0000\u0000\u064f\u0650\u0005\u0003\u0000\u0000\u0650\u0651\u0005\u0004"+
		"\u0000\u0000\u0651\u0652\u0005\n\u0000\u0000\u0652\u0653\u0005\u0003\u0000"+
		"\u0000\u0653\u0654\u0005\u0006\u0000\u0000\u0654\u0655\u0005\u0003\u0000"+
		"\u0000\u0655\u0656\u0005\u0004\u0000\u0000\u0656\u0657\u0005\n\u0000\u0000"+
		"\u0657\u0658\u0005\u0003\u0000\u0000\u0658\u0659\u0005\u0006\u0000\u0000"+
		"\u0659\u065a\u0005\u0003\u0000\u0000\u065a\u065b\u0005\u0004\u0000\u0000"+
		"\u065b\u065c\u0005\n\u0000\u0000\u065c\u065d\u0005\u0003\u0000\u0000\u065d"+
		"\u065e\u0005\u0006\u0000\u0000\u065e\u065f\u0005\u0003\u0000\u0000\u065f"+
		"\u0660\u0005\u0004\u0000\u0000\u0660\u0661\u0005\n\u0000\u0000\u0661\u0662"+
		"\u0005\u0003\u0000\u0000\u0662\u0663\u0005\u0006\u0000\u0000\u0663\u0664"+
		"\u0005\u0003\u0000\u0000\u0664\u0665\u0005\u0004\u0000\u0000\u0665\u0666"+
		"\u0005\n\u0000\u0000\u0666\u0667\u0005\u0003\u0000\u0000\u0667\u0668\u0005"+
		"\u0006\u0000\u0000\u0668\u0669\u0005\u0003\u0000\u0000\u0669\u066a\u0005"+
		"\u0004\u0000\u0000\u066a\u066b\u0005\n\u0000\u0000\u066b\u066c\u0005\u0003"+
		"\u0000\u0000\u066c\u066d\u0005\u0006\u0000\u0000\u066d\u066e\u0005\u0003"+
		"\u0000\u0000\u066e\u066f\u0005\u0004\u0000\u0000\u066f\u0670\u0005\n\u0000"+
		"\u0000\u0670\u0671\u0005\u0003\u0000\u0000\u0671\u0672\u0005\u0006\u0000"+
		"\u0000\u0672\u0673\u0005\u0003\u0000\u0000\u0673\u0674\u0005\n\u0000\u0000"+
		"\u0674\u0675\u0005\u0004\u0000\u0000\u0675\u0676\u0005\n\u0000\u0000\u0676"+
		"\u0677\u0005\u0003\u0000\u0000\u0677\u0678\u0005\u0006\u0000\u0000\u0678"+
		"\u0679\u0005\u0003\u0000\u0000\u0679\u0737\u0005\u0004\u0000\u0000\u067a"+
		"\u067b\u0005\n\u0000\u0000\u067b\u067c\u0005\u0003\u0000\u0000\u067c\u067d"+
		"\u0005\u0006\u0000\u0000\u067d\u067e\u0005\u0003\u0000\u0000\u067e\u067f"+
		"\u0005\b\u0000\u0000\u067f\u0680\u0005\u0004\u0000\u0000\u0680\u0681\u0005"+
		"\n\u0000\u0000\u0681\u0682\u0005\u0003\u0000\u0000\u0682\u0683\u0005\u0006"+
		"\u0000\u0000\u0683\u0684\u0005\u0003\u0000\u0000\u0684\u0686\u0003$\u0012"+
		"\u0000\u0685\u0687\u0003$\u0012\u0000\u0686\u0685\u0001\u0000\u0000\u0000"+
		"\u0686\u0687\u0001\u0000\u0000\u0000\u0687\u0689\u0001\u0000\u0000\u0000"+
		"\u0688\u068a\u0003$\u0012\u0000\u0689\u0688\u0001\u0000\u0000\u0000\u0689"+
		"\u068a\u0001\u0000\u0000\u0000\u068a\u068c\u0001\u0000\u0000\u0000\u068b"+
		"\u068d\u0003$\u0012\u0000\u068c\u068b\u0001\u0000\u0000\u0000\u068c\u068d"+
		"\u0001\u0000\u0000\u0000\u068d\u068f\u0001\u0000\u0000\u0000\u068e\u0690"+
		"\u0003$\u0012\u0000\u068f\u068e\u0001\u0000\u0000\u0000\u068f\u0690\u0001"+
		"\u0000\u0000\u0000\u0690\u0692\u0001\u0000\u0000\u0000\u0691\u0693\u0003"+
		"$\u0012\u0000\u0692\u0691\u0001\u0000\u0000\u0000\u0692\u0693\u0001\u0000"+
		"\u0000\u0000\u0693\u0695\u0001\u0000\u0000\u0000\u0694\u0696\u0003$\u0012"+
		"\u0000\u0695\u0694\u0001\u0000\u0000\u0000\u0695\u0696\u0001\u0000\u0000"+
		"\u0000\u0696\u069a\u0001\u0000\u0000\u0000\u0697\u0699\u0003$\u0012\u0000"+
		"\u0698\u0697\u0001\u0000\u0000\u0000\u0699\u069c\u0001\u0000\u0000\u0000"+
		"\u069a\u0698\u0001\u0000\u0000\u0000\u069a\u069b\u0001\u0000\u0000\u0000"+
		"\u069b\u069d\u0001\u0000\u0000\u0000\u069c\u069a\u0001\u0000\u0000\u0000"+
		"\u069d\u069e\u0005\u0004\u0000\u0000\u069e\u069f\u0005\n\u0000\u0000\u069f"+
		"\u06a0\u0005\u0003\u0000\u0000\u06a0\u06a1\u0005\u0006\u0000\u0000\u06a1"+
		"\u06a2\u0005\u0003\u0000\u0000\u06a2\u06a3\u0005\b\u0000\u0000\u06a3\u06a4"+
		"\u0005\u0004\u0000\u0000\u06a4\u06a5\u0005\n\u0000\u0000\u06a5\u06a6\u0005"+
		"\u0003\u0000\u0000\u06a6\u06a7\u0005\u0006\u0000\u0000\u06a7\u06a8\u0005"+
		"\u0003\u0000\u0000\u06a8\u06a9\u0005\b\u0000\u0000\u06a9\u06aa\u0005\u0004"+
		"\u0000\u0000\u06aa\u06ab\u0005\n\u0000\u0000\u06ab\u06ac\u0005\u0003\u0000"+
		"\u0000\u06ac\u06ad\u0005\u0006\u0000\u0000\u06ad\u06ae\u0005\u0003\u0000"+
		"\u0000\u06ae\u06af\u0005\b\u0000\u0000\u06af\u06b0\u0005\u0004\u0000\u0000"+
		"\u06b0\u06b1\u0005\n\u0000\u0000\u06b1\u06b2\u0005\u0003\u0000\u0000\u06b2"+
		"\u06b3\u0005\u0006\u0000\u0000\u06b3\u06b4\u0005\u0003\u0000\u0000\u06b4"+
		"\u06b5\u0005\b\u0000\u0000\u06b5\u06b6\u0005\u0004\u0000\u0000\u06b6\u06b7"+
		"\u0005\n\u0000\u0000\u06b7\u06b8\u0005\u0003\u0000\u0000\u06b8\u06b9\u0005"+
		"\u0006\u0000\u0000\u06b9\u06ba\u0005\u0003\u0000\u0000\u06ba\u06bb\u0005"+
		"\b\u0000\u0000\u06bb\u06bc\u0005\u0004\u0000\u0000\u06bc\u06bd\u0005\n"+
		"\u0000\u0000\u06bd\u06be\u0005\u0003\u0000\u0000\u06be\u06bf\u0005\u0006"+
		"\u0000\u0000\u06bf\u06c0\u0005\u0003\u0000\u0000\u06c0\u06c1\u0005\b\u0000"+
		"\u0000\u06c1\u06c2\u0005\u0004\u0000\u0000\u06c2\u06c3\u0005\n\u0000\u0000"+
		"\u06c3\u06c4\u0005\u0003\u0000\u0000\u06c4\u06c5\u0005\u0006\u0000\u0000"+
		"\u06c5\u06c6\u0005\u0003\u0000\u0000\u06c6\u06c7\u0005\b\u0000\u0000\u06c7"+
		"\u06c8\u0005\u0004\u0000\u0000\u06c8\u06c9\u0005\n\u0000\u0000\u06c9\u06ca"+
		"\u0005\u0003\u0000\u0000\u06ca\u06cb\u0005\u0006\u0000\u0000\u06cb\u06cc"+
		"\u0005\u0003\u0000\u0000\u06cc\u06cd\u0005\b\u0000\u0000\u06cd\u06ce\u0005"+
		"\u0004\u0000\u0000\u06ce\u06cf\u0005\n\u0000\u0000\u06cf\u06d0\u0005\u0003"+
		"\u0000\u0000\u06d0\u06d1\u0005\u0006\u0000\u0000\u06d1\u06d2\u0005\u0003"+
		"\u0000\u0000\u06d2\u06d3\u0005\b\u0000\u0000\u06d3\u06d4\u0005\u0004\u0000"+
		"\u0000\u06d4\u06d5\u0005\n\u0000\u0000\u06d5\u06d6\u0005\u0003\u0000\u0000"+
		"\u06d6\u06d7\u0005\u0006\u0000\u0000\u06d7\u06d8\u0005\u0003\u0000\u0000"+
		"\u06d8\u06d9\u0005\b\u0000\u0000\u06d9\u06da\u0005\u0004\u0000\u0000\u06da"+
		"\u06db\u0005\n\u0000\u0000\u06db\u06dc\u0005\u0003\u0000\u0000\u06dc\u06dd"+
		"\u0005\u0006\u0000\u0000\u06dd\u06de\u0005\u0003\u0000\u0000\u06de\u06df"+
		"\u0005\b\u0000\u0000\u06df\u06e0\u0005\u0004\u0000\u0000\u06e0\u06e1\u0005"+
		"\n\u0000\u0000\u06e1\u06e2\u0005\u0003\u0000\u0000\u06e2\u06e3\u0005\u0006"+
		"\u0000\u0000\u06e3\u06e4\u0005\u0003\u0000\u0000\u06e4\u06e5\u0005\b\u0000"+
		"\u0000\u06e5\u06e6\u0005\u0004\u0000\u0000\u06e6\u06e7\u0005\n\u0000\u0000"+
		"\u06e7\u06e8\u0005\u0003\u0000\u0000\u06e8\u06e9\u0005\u0006\u0000\u0000"+
		"\u06e9\u06eb\u0005\u0003\u0000\u0000\u06ea\u06ec\u0003$\u0012\u0000\u06eb"+
		"\u06ea\u0001\u0000\u0000\u0000\u06ec\u06ed\u0001\u0000\u0000\u0000\u06ed"+
		"\u06eb\u0001\u0000\u0000\u0000\u06ed\u06ee\u0001\u0000\u0000\u0000\u06ee"+
		"\u06ef\u0001\u0000\u0000\u0000\u06ef\u06f0\u0005\u0004\u0000\u0000\u06f0"+
		"\u06f1\u0005\n\u0000\u0000\u06f1\u06f2\u0005\u0003\u0000\u0000\u06f2\u06f3"+
		"\u0005\u0006\u0000\u0000\u06f3\u06f4\u0005\u0003\u0000\u0000\u06f4\u06f5"+
		"\u0003$\u0012\u0000\u06f5\u06f6\u0005\u0004\u0000\u0000\u06f6\u06f7\u0005"+
		"\n\u0000\u0000\u06f7\u06f8\u0005\u0003\u0000\u0000\u06f8\u06f9\u0005\u0006"+
		"\u0000\u0000\u06f9\u06fa\u0005\u0003\u0000\u0000\u06fa\u06fb\u0003$\u0012"+
		"\u0000\u06fb\u06fc\u0005\u0004\u0000\u0000\u06fc\u06fd\u0005\n\u0000\u0000"+
		"\u06fd\u06fe\u0005\u0003\u0000\u0000\u06fe\u06ff\u0005\u0006\u0000\u0000"+
		"\u06ff\u0700\u0005\u0003\u0000\u0000\u0700\u0701\u0003$\u0012\u0000\u0701"+
		"\u0702\u0005\u0004\u0000\u0000\u0702\u0703\u0005\n\u0000\u0000\u0703\u0704"+
		"\u0005\u0003\u0000\u0000\u0704\u0705\u0005\u0006\u0000\u0000\u0705\u0706"+
		"\u0005\u0003\u0000\u0000\u0706\u0707\u0005\u0004\u0000\u0000\u0707\u0708"+
		"\u0006\u0007\uffff\uffff\u0000\u0708\u0738\u0001\u0000\u0000\u0000\u0709"+
		"\u070a\u0005\n\u0000\u0000\u070a\u070b\u0005\u0003\u0000\u0000\u070b\u070c"+
		"\u0005\u0006\u0000\u0000\u070c\u070d\u0005\u0003\u0000\u0000\u070d\u070e"+
		"\u0005\b\u0000\u0000\u070e\u0710\u0003$\u0012\u0000\u070f\u0711\u0003"+
		"$\u0012\u0000\u0710\u070f\u0001\u0000\u0000\u0000\u0710\u0711\u0001\u0000"+
		"\u0000\u0000\u0711\u0713\u0001\u0000\u0000\u0000\u0712\u0714\u0003$\u0012"+
		"\u0000\u0713\u0712\u0001\u0000\u0000\u0000\u0713\u0714\u0001\u0000\u0000"+
		"\u0000\u0714\u0716\u0001\u0000\u0000\u0000\u0715\u0717\u0003$\u0012\u0000"+
		"\u0716\u0715\u0001\u0000\u0000\u0000\u0716\u0717\u0001\u0000\u0000\u0000"+
		"\u0717\u0719\u0001\u0000\u0000\u0000\u0718\u071a\u0003$\u0012\u0000\u0719"+
		"\u0718\u0001\u0000\u0000\u0000\u0719\u071a\u0001\u0000\u0000\u0000\u071a"+
		"\u071c\u0001\u0000\u0000\u0000\u071b\u071d\u0003$\u0012\u0000\u071c\u071b"+
		"\u0001\u0000\u0000\u0000\u071c\u071d\u0001\u0000\u0000\u0000\u071d\u071f"+
		"\u0001\u0000\u0000\u0000\u071e\u0720\u0003$\u0012\u0000\u071f\u071e\u0001"+
		"\u0000\u0000\u0000\u071f\u0720\u0001\u0000\u0000\u0000\u0720\u0724\u0001"+
		"\u0000\u0000\u0000\u0721\u0723\u0003$\u0012\u0000\u0722\u0721\u0001\u0000"+
		"\u0000\u0000\u0723\u0726\u0001\u0000\u0000\u0000\u0724\u0722\u0001\u0000"+
		"\u0000\u0000\u0724\u0725\u0001\u0000\u0000\u0000\u0725\u0727\u0001\u0000"+
		"\u0000\u0000\u0726\u0724\u0001\u0000\u0000\u0000\u0727\u0728\u0005\b\u0000"+
		"\u0000\u0728\u0729\u0005\u0004\u0000\u0000\u0729\u072a\u0005\n\u0000\u0000"+
		"\u072a\u072b\u0005\u0003\u0000\u0000\u072b\u072c\u0005\u0006\u0000\u0000"+
		"\u072c\u072d\u0005\u0003\u0000\u0000\u072d\u072e\u0005\b\u0000\u0000\u072e"+
		"\u072f\u0005\b\u0000\u0000\u072f\u0730\u0005\b\u0000\u0000\u0730\u0731"+
		"\u0005\b\u0000\u0000\u0731\u0732\u0005\b\u0000\u0000\u0732\u0733\u0005"+
		"\b\u0000\u0000\u0733\u0734\u0005\b\u0000\u0000\u0734\u0735\u0005\u0004"+
		"\u0000\u0000\u0735\u0736\u0006\u0007\uffff\uffff\u0000\u0736\u0738\u0001"+
		"\u0000\u0000\u0000\u0737\u067a\u0001\u0000\u0000\u0000\u0737\u0709\u0001"+
		"\u0000\u0000\u0000\u0738\u0739\u0001\u0000\u0000\u0000\u0739\u0737\u0001"+
		"\u0000\u0000\u0000\u0739\u073a\u0001\u0000\u0000\u0000\u073a\u073b\u0001"+
		"\u0000\u0000\u0000\u073b\u073c\u0005\n\u0000\u0000\u073c\u073d\u0005\u0003"+
		"\u0000\u0000\u073d\u073e\u0005\n\u0000\u0000\u073e\u073f\u0005\u0003\u0000"+
		"\u0000\u073f\u0740\u0005\u0006\u0000\u0000\u0740\u0741\u0005\u0004\u0000"+
		"\u0000\u0741\u0743\u0001\u0000\u0000\u0000\u0742\u064c\u0001\u0000\u0000"+
		"\u0000\u0743\u0744\u0001\u0000\u0000\u0000\u0744\u0742\u0001\u0000\u0000"+
		"\u0000\u0744\u0745\u0001\u0000\u0000\u0000\u0745\u0746\u0001\u0000\u0000"+
		"\u0000\u0746\u0747\u0005\u0005\u0000\u0000\u0747\u0748\u0005\u0003\u0000"+
		"\u0000\u0748\u0749\u0005\n\u0000\u0000\u0749\u074a\u0005\u0003\u0000\u0000"+
		"\u074a\u074b\u0005\n\u0000\u0000\u074b\u074c\u0005\n\u0000\u0000\u074c"+
		"\u074d\u0005\n\u0000\u0000\u074d\u074e\u0005\n\u0000\u0000\u074e\u074f"+
		"\u0005\u0003\u0000\u0000\u074f\u0750\u0005\n\u0000\u0000\u0750\u0751\u0005"+
		"\u0004\u0000\u0000\u0751\u000f\u0001\u0000\u0000\u0000\u0752\u0753\u0005"+
		"\u0005\u0000\u0000\u0753\u0754\u0005\u0003\u0000\u0000\u0754\u0755\u0005"+
		"\n\u0000\u0000\u0755\u0756\u0005\u0003\u0000\u0000\u0756\u0757\u0005\n"+
		"\u0000\u0000\u0757\u0758\u0005\n\u0000\u0000\u0758\u0759\u0005\n\u0000"+
		"\u0000\u0759\u075a\u0005\n\u0000\u0000\u075a\u075b\u0005\n\u0000\u0000"+
		"\u075b\u075c\u0005\n\u0000\u0000\u075c\u075d\u0005\u0003\u0000\u0000\u075d"+
		"\u075e\u0005\n\u0000\u0000\u075e\u0941\u0005\u0004\u0000\u0000\u075f\u0760"+
		"\u0005\n\u0000\u0000\u0760\u0761\u0005\u0003\u0000\u0000\u0761\u0762\u0005"+
		"\u0006\u0000\u0000\u0762\u0763\u0005\u0003\u0000\u0000\u0763\u0764\u0005"+
		"\u0004\u0000\u0000\u0764\u0765\u0005\n\u0000\u0000\u0765\u0766\u0005\u0003"+
		"\u0000\u0000\u0766\u0767\u0005\u0006\u0000\u0000\u0767\u0768\u0005\u0003"+
		"\u0000\u0000\u0768\u0769\u0005\u0004\u0000\u0000\u0769\u076a\u0005\n\u0000"+
		"\u0000\u076a\u076b\u0005\u0003\u0000\u0000\u076b\u076c\u0005\u0006\u0000"+
		"\u0000\u076c\u076d\u0005\u0003\u0000\u0000\u076d\u076e\u0005\u0004\u0000"+
		"\u0000\u076e\u076f\u0005\n\u0000\u0000\u076f\u0770\u0005\u0003\u0000\u0000"+
		"\u0770\u0771\u0005\u0006\u0000\u0000\u0771\u0772\u0005\u0003\u0000\u0000"+
		"\u0772\u0773\u0005\u0003\u0000\u0000\u0773\u0774\u0005\u0003\u0000\u0000"+
		"\u0774\u0775\u0005\u0003\u0000\u0000\u0775\u0776\u0005\u0003\u0000\u0000"+
		"\u0776\u0777\u0005\u0004\u0000\u0000\u0777\u0778\u0005\n\u0000\u0000\u0778"+
		"\u0779\u0005\u0003\u0000\u0000\u0779\u077a\u0005\u0006\u0000\u0000\u077a"+
		"\u077b\u0005\u0003\u0000\u0000\u077b\u077c\u0005\u0003\u0000\u0000\u077c"+
		"\u077d\u0005\u0003\u0000\u0000\u077d\u077e\u0005\u0004\u0000\u0000\u077e"+
		"\u077f\u0005\n\u0000\u0000\u077f\u0780\u0005\u0003\u0000\u0000\u0780\u0781"+
		"\u0005\u0006\u0000\u0000\u0781\u0782\u0005\u0003\u0000\u0000\u0782\u0783"+
		"\u0005\u0003\u0000\u0000\u0783\u0784\u0005\u0003\u0000\u0000\u0784\u0785"+
		"\u0005\u0003\u0000\u0000\u0785\u0786\u0005\u0003\u0000\u0000\u0786\u0787"+
		"\u0005\u0004\u0000\u0000\u0787\u0788\u0005\n\u0000\u0000\u0788\u0789\u0005"+
		"\u0003\u0000\u0000\u0789\u078a\u0005\u0006\u0000\u0000\u078a\u078b\u0005"+
		"\u0003\u0000\u0000\u078b\u078c\u0005\u0003\u0000\u0000\u078c\u078d\u0005"+
		"\u0003\u0000\u0000\u078d\u078e\u0005\u0003\u0000\u0000\u078e\u078f\u0005"+
		"\u0003\u0000\u0000\u078f\u0790\u0005\u0004\u0000\u0000\u0790\u0791\u0005"+
		"\n\u0000\u0000\u0791\u0792\u0005\u0003\u0000\u0000\u0792\u0793\u0005\u0006"+
		"\u0000\u0000\u0793\u0794\u0005\u0003\u0000\u0000\u0794\u0795\u0005\u0003"+
		"\u0000\u0000\u0795\u0796\u0005\u0003\u0000\u0000\u0796\u0797\u0005\u0003"+
		"\u0000\u0000\u0797\u0798\u0005\u0004\u0000\u0000\u0798\u0799\u0005\n\u0000"+
		"\u0000\u0799\u079a\u0005\u0003\u0000\u0000\u079a\u079b\u0005\u0006\u0000"+
		"\u0000\u079b\u079c\u0005\u0003\u0000\u0000\u079c\u079d\u0005\u0004\u0000"+
		"\u0000\u079d\u079e\u0005\n\u0000\u0000\u079e\u079f\u0005\u0003\u0000\u0000"+
		"\u079f\u07a0\u0005\u0006\u0000\u0000\u07a0\u07a1\u0005\u0003\u0000\u0000"+
		"\u07a1\u07a2\u0005\u0004\u0000\u0000\u07a2\u07a3\u0005\n\u0000\u0000\u07a3"+
		"\u07a4\u0005\u0003\u0000\u0000\u07a4\u07a5\u0005\u0006\u0000\u0000\u07a5"+
		"\u07a6\u0005\u0003\u0000\u0000\u07a6\u07a7\u0005\u0003\u0000\u0000\u07a7"+
		"\u07a8\u0005\u0003\u0000\u0000\u07a8\u07a9\u0005\u0003\u0000\u0000\u07a9"+
		"\u07aa\u0005\u0003\u0000\u0000\u07aa\u07ab\u0005\u0004\u0000\u0000\u07ab"+
		"\u07ac\u0005\n\u0000\u0000\u07ac\u07ad\u0005\u0003\u0000\u0000\u07ad\u07ae"+
		"\u0005\u0006\u0000\u0000\u07ae\u07af\u0005\u0003\u0000\u0000\u07af\u07b0"+
		"\u0005\u0003\u0000\u0000\u07b0\u07b1\u0005\u0003\u0000\u0000\u07b1\u07b2"+
		"\u0005\u0004\u0000\u0000\u07b2\u07b3\u0005\n\u0000\u0000\u07b3\u07b4\u0005"+
		"\u0003\u0000\u0000\u07b4\u07b5\u0005\u0006\u0000\u0000\u07b5\u07b6\u0005"+
		"\u0003\u0000\u0000\u07b6\u07b7\u0005\u0003\u0000\u0000\u07b7\u07b8\u0005"+
		"\u0003\u0000\u0000\u07b8\u07b9\u0005\u0003\u0000\u0000\u07b9\u07ba\u0005"+
		"\u0003\u0000\u0000\u07ba\u07bb\u0005\u0004\u0000\u0000\u07bb\u07bc\u0005"+
		"\n\u0000\u0000\u07bc\u07bd\u0005\u0003\u0000\u0000\u07bd\u07be\u0005\u0006"+
		"\u0000\u0000\u07be\u07bf\u0005\u0003\u0000\u0000\u07bf\u07c0\u0005\u0003"+
		"\u0000\u0000\u07c0\u07c1\u0005\u0003\u0000\u0000\u07c1\u07c2\u0005\u0003"+
		"\u0000\u0000\u07c2\u07c3\u0005\u0003\u0000\u0000\u07c3\u07c4\u0005\u0004"+
		"\u0000\u0000\u07c4\u07c5\u0005\n\u0000\u0000\u07c5\u07c6\u0005\u0003\u0000"+
		"\u0000\u07c6\u07c7\u0005\u0006\u0000\u0000\u07c7\u07c8\u0005\u0003\u0000"+
		"\u0000\u07c8\u07c9\u0005\u0003\u0000\u0000\u07c9\u07ca\u0005\u0003\u0000"+
		"\u0000\u07ca\u07cb\u0005\u0003\u0000\u0000\u07cb\u07cc\u0005\u0004\u0000"+
		"\u0000\u07cc\u07cd\u0005\n\u0000\u0000\u07cd\u07ce\u0005\u0003\u0000\u0000"+
		"\u07ce\u07cf\u0005\u0006\u0000\u0000\u07cf\u07d0\u0005\u0003\u0000\u0000"+
		"\u07d0\u07d1\u0005\u0004\u0000\u0000\u07d1\u07d2\u0005\n\u0000\u0000\u07d2"+
		"\u07d3\u0005\u0003\u0000\u0000\u07d3\u07d4\u0005\u0006\u0000\u0000\u07d4"+
		"\u07d5\u0005\u0003\u0000\u0000\u07d5\u07d6\u0005\u0004\u0000\u0000\u07d6"+
		"\u07d7\u0005\n\u0000\u0000\u07d7\u07d8\u0005\u0003\u0000\u0000\u07d8\u07d9"+
		"\u0005\u0006\u0000\u0000\u07d9\u07da\u0005\u0003\u0000\u0000\u07da\u07db"+
		"\u0005\u0004\u0000\u0000\u07db\u07dc\u0005\n\u0000\u0000\u07dc\u07dd\u0005"+
		"\u0003\u0000\u0000\u07dd\u07de\u0005\u0006\u0000\u0000\u07de\u07df\u0005"+
		"\u0003\u0000\u0000\u07df\u07e0\u0005\u0004\u0000\u0000\u07e0\u07e1\u0005"+
		"\n\u0000\u0000\u07e1\u07e2\u0005\u0003\u0000\u0000\u07e2\u07e3\u0005\u0006"+
		"\u0000\u0000\u07e3\u07e4\u0005\u0003\u0000\u0000\u07e4\u07e5\u0005\u0003"+
		"\u0000\u0000\u07e5\u07e6\u0005\u0003\u0000\u0000\u07e6\u07e7\u0005\u0003"+
		"\u0000\u0000\u07e7\u07e8\u0005\u0003\u0000\u0000\u07e8\u07e9\u0005\u0004"+
		"\u0000\u0000\u07e9\u07ea\u0005\n\u0000\u0000\u07ea\u07eb\u0005\u0003\u0000"+
		"\u0000\u07eb\u07ec\u0005\u0006\u0000\u0000\u07ec\u07ed\u0005\u0003\u0000"+
		"\u0000\u07ed\u07ee\u0005\u0003\u0000\u0000\u07ee\u07ef\u0005\u0003\u0000"+
		"\u0000\u07ef\u07f0\u0005\u0003\u0000\u0000\u07f0\u07f1\u0005\u0004\u0000"+
		"\u0000\u07f1\u07f2\u0005\n\u0000\u0000\u07f2\u07f3\u0005\u0003\u0000\u0000"+
		"\u07f3\u07f4\u0005\u0006\u0000\u0000\u07f4\u07f5\u0005\u0003\u0000\u0000"+
		"\u07f5\u07f6\u0005\u0003\u0000\u0000\u07f6\u07f7\u0005\u0003\u0000\u0000"+
		"\u07f7\u07f8\u0005\u0003\u0000\u0000\u07f8\u07f9\u0005\u0003\u0000\u0000"+
		"\u07f9\u07fa\u0005\u0004\u0000\u0000\u07fa\u07fb\u0005\n\u0000\u0000\u07fb"+
		"\u07fc\u0005\u0003\u0000\u0000\u07fc\u07fd\u0005\u0006\u0000\u0000\u07fd"+
		"\u07fe\u0005\u0003\u0000\u0000\u07fe\u07ff\u0005\u0003\u0000\u0000\u07ff"+
		"\u0800\u0005\u0003\u0000\u0000\u0800\u0801\u0005\u0003\u0000\u0000\u0801"+
		"\u0802\u0005\u0003\u0000\u0000\u0802\u0803\u0005\u0004\u0000\u0000\u0803"+
		"\u0804\u0005\n\u0000\u0000\u0804\u0805\u0005\u0003\u0000\u0000\u0805\u0806"+
		"\u0005\u0006\u0000\u0000\u0806\u0807\u0005\u0003\u0000\u0000\u0807\u0808"+
		"\u0005\u0003\u0000\u0000\u0808\u0809\u0005\u0003\u0000\u0000\u0809\u080a"+
		"\u0005\u0003\u0000\u0000\u080a\u080b\u0005\u0004\u0000\u0000\u080b\u080c"+
		"\u0005\n\u0000\u0000\u080c\u080d\u0005\u0003\u0000\u0000\u080d\u080e\u0005"+
		"\u0006\u0000\u0000\u080e\u080f\u0005\u0003\u0000\u0000\u080f\u0810\u0005"+
		"\u0004\u0000\u0000\u0810\u0811\u0005\n\u0000\u0000\u0811\u0812\u0005\u0003"+
		"\u0000\u0000\u0812\u0813\u0005\u0006\u0000\u0000\u0813\u0814\u0005\u0003"+
		"\u0000\u0000\u0814\u0815\u0005\u0004\u0000\u0000\u0815\u0816\u0005\n\u0000"+
		"\u0000\u0816\u0817\u0005\u0003\u0000\u0000\u0817\u0818\u0005\u0006\u0000"+
		"\u0000\u0818\u0819\u0005\u0003\u0000\u0000\u0819\u081a\u0005\u0004\u0000"+
		"\u0000\u081a\u081b\u0005\n\u0000\u0000\u081b\u081c\u0005\u0003\u0000\u0000"+
		"\u081c\u081d\u0005\u0006\u0000\u0000\u081d\u081e\u0005\u0003\u0000\u0000"+
		"\u081e\u081f\u0005\u0004\u0000\u0000\u081f\u0820\u0005\n\u0000\u0000\u0820"+
		"\u0821\u0005\u0003\u0000\u0000\u0821\u0822\u0005\u0006\u0000\u0000\u0822"+
		"\u0823\u0005\u0003\u0000\u0000\u0823\u0824\u0005\u0003\u0000\u0000\u0824"+
		"\u0825\u0005\u0003\u0000\u0000\u0825\u0826\u0005\u0003\u0000\u0000\u0826"+
		"\u0827\u0005\u0003\u0000\u0000\u0827\u0828\u0005\u0004\u0000\u0000\u0828"+
		"\u0829\u0005\n\u0000\u0000\u0829\u082a\u0005\u0003\u0000\u0000\u082a\u082b"+
		"\u0005\u0006\u0000\u0000\u082b\u082c\u0005\u0003\u0000\u0000\u082c\u082d"+
		"\u0005\u0003\u0000\u0000\u082d\u082e\u0005\u0003\u0000\u0000\u082e\u082f"+
		"\u0005\u0004\u0000\u0000\u082f\u0830\u0005\n\u0000\u0000\u0830\u0831\u0005"+
		"\u0003\u0000\u0000\u0831\u0832\u0005\u0006\u0000\u0000\u0832\u0833\u0005"+
		"\u0003\u0000\u0000\u0833\u0834\u0005\u0003\u0000\u0000\u0834\u0835\u0005"+
		"\u0003\u0000\u0000\u0835\u0836\u0005\u0003\u0000\u0000\u0836\u0837\u0005"+
		"\u0003\u0000\u0000\u0837\u0838\u0005\u0004\u0000\u0000\u0838\u0839\u0005"+
		"\n\u0000\u0000\u0839\u083a\u0005\u0003\u0000\u0000\u083a\u083b\u0005\u0006"+
		"\u0000\u0000\u083b\u083c\u0005\u0003\u0000\u0000\u083c\u083d\u0005\u0003"+
		"\u0000\u0000\u083d\u083e\u0005\u0003\u0000\u0000\u083e\u083f\u0005\u0003"+
		"\u0000\u0000\u083f\u0840\u0005\u0003\u0000\u0000\u0840\u0841\u0005\u0004"+
		"\u0000\u0000\u0841\u0842\u0005\n\u0000\u0000\u0842\u0843\u0005\u0003\u0000"+
		"\u0000\u0843\u0844\u0005\u0006\u0000\u0000\u0844\u0845\u0005\u0003\u0000"+
		"\u0000\u0845\u0846\u0005\u0003\u0000\u0000\u0846\u0847\u0005\u0003\u0000"+
		"\u0000\u0847\u0848\u0005\u0003\u0000\u0000\u0848\u0849\u0005\u0004\u0000"+
		"\u0000\u0849\u084a\u0005\n\u0000\u0000\u084a\u084b\u0005\u0003\u0000\u0000"+
		"\u084b\u084c\u0005\u0006\u0000\u0000\u084c\u084d\u0005\u0003\u0000\u0000"+
		"\u084d\u084e\u0005\u0004\u0000\u0000\u084e\u084f\u0005\n\u0000\u0000\u084f"+
		"\u0850\u0005\u0003\u0000\u0000\u0850\u0851\u0005\u0006\u0000\u0000\u0851"+
		"\u0852\u0005\u0003\u0000\u0000\u0852\u0853\u0005\u0004\u0000\u0000\u0853"+
		"\u0854\u0005\n\u0000\u0000\u0854\u0855\u0005\u0003\u0000\u0000\u0855\u0856"+
		"\u0005\u0006\u0000\u0000\u0856\u0857\u0005\u0003\u0000\u0000\u0857\u0858"+
		"\u0005\u0004\u0000\u0000\u0858\u0859\u0005\n\u0000\u0000\u0859\u085a\u0005"+
		"\u0003\u0000\u0000\u085a\u085b\u0005\u0006\u0000\u0000\u085b\u085c\u0005"+
		"\u0003\u0000\u0000\u085c\u085d\u0005\u0003\u0000\u0000\u085d\u085e\u0005"+
		"\u0003\u0000\u0000\u085e\u085f\u0005\u0003\u0000\u0000\u085f\u0860\u0005"+
		"\u0003\u0000\u0000\u0860\u0861\u0005\u0004\u0000\u0000\u0861\u0862\u0005"+
		"\n\u0000\u0000\u0862\u0863\u0005\u0003\u0000\u0000\u0863\u0864\u0005\u0006"+
		"\u0000\u0000\u0864\u0865\u0005\u0003\u0000\u0000\u0865\u0866\u0005\u0003"+
		"\u0000\u0000\u0866\u0867\u0005\u0003\u0000\u0000\u0867\u0868\u0005\u0004"+
		"\u0000\u0000\u0868\u0869\u0005\n\u0000\u0000\u0869\u086a\u0005\u0003\u0000"+
		"\u0000\u086a\u086b\u0005\u0006\u0000\u0000\u086b\u086c\u0005\u0003\u0000"+
		"\u0000\u086c\u086d\u0005\u0003\u0000\u0000\u086d\u086e\u0005\u0003\u0000"+
		"\u0000\u086e\u086f\u0005\u0003\u0000\u0000\u086f\u0870\u0005\u0003\u0000"+
		"\u0000\u0870\u0871\u0005\u0004\u0000\u0000\u0871\u0872\u0005\n\u0000\u0000"+
		"\u0872\u0873\u0005\u0003\u0000\u0000\u0873\u0874\u0005\u0006\u0000\u0000"+
		"\u0874\u0875\u0005\u0003\u0000\u0000\u0875\u0876\u0005\u0003\u0000\u0000"+
		"\u0876\u0877\u0005\u0003\u0000\u0000\u0877\u0878\u0005\u0003\u0000\u0000"+
		"\u0878\u0879\u0005\u0003\u0000\u0000\u0879\u087a\u0005\u0004\u0000\u0000"+
		"\u087a\u087b\u0005\n\u0000\u0000\u087b\u087c\u0005\u0003\u0000\u0000\u087c"+
		"\u087d\u0005\u0006\u0000\u0000\u087d\u087e\u0005\u0003\u0000\u0000\u087e"+
		"\u087f\u0005\u0003\u0000\u0000\u087f\u0880\u0005\u0003\u0000\u0000\u0880"+
		"\u0881\u0005\u0003\u0000\u0000\u0881\u0882\u0005\u0004\u0000\u0000\u0882"+
		"\u0883\u0005\n\u0000\u0000\u0883\u0884\u0005\u0003\u0000\u0000\u0884\u0885"+
		"\u0005\u0006\u0000\u0000\u0885\u0886\u0005\u0003\u0000\u0000\u0886\u0887"+
		"\u0005\n\u0000\u0000\u0887\u0888\u0005\u0004\u0000\u0000\u0888\u0889\u0005"+
		"\n\u0000\u0000\u0889\u088a\u0005\u0003\u0000\u0000\u088a\u088b\u0005\u0006"+
		"\u0000\u0000\u088b\u088c\u0005\u0003\u0000\u0000\u088c\u0936\u0005\u0004"+
		"\u0000\u0000\u088d\u088e\u0005\n\u0000\u0000\u088e\u088f\u0005\u0003\u0000"+
		"\u0000\u088f\u0890\u0005\u0006\u0000\u0000\u0890\u0891\u0005\u0003\u0000"+
		"\u0000\u0891\u0892\u0003$\u0012\u0000\u0892\u0893\u0005\u0004\u0000\u0000"+
		"\u0893\u0894\u0005\n\u0000\u0000\u0894\u0895\u0005\u0003\u0000\u0000\u0895"+
		"\u0896\u0005\u0006\u0000\u0000\u0896\u0897\u0005\u0003\u0000\u0000\u0897"+
		"\u0899\u0003$\u0012\u0000\u0898\u089a\u0003$\u0012\u0000\u0899\u0898\u0001"+
		"\u0000\u0000\u0000\u0899\u089a\u0001\u0000\u0000\u0000\u089a\u089c\u0001"+
		"\u0000\u0000\u0000\u089b\u089d\u0003$\u0012\u0000\u089c\u089b\u0001\u0000"+
		"\u0000\u0000\u089c\u089d\u0001\u0000\u0000\u0000\u089d\u089f\u0001\u0000"+
		"\u0000\u0000\u089e\u08a0\u0003$\u0012\u0000\u089f\u089e\u0001\u0000\u0000"+
		"\u0000\u089f\u08a0\u0001\u0000\u0000\u0000\u08a0\u08a2\u0001\u0000\u0000"+
		"\u0000\u08a1\u08a3\u0003$\u0012\u0000\u08a2\u08a1\u0001\u0000\u0000\u0000"+
		"\u08a2\u08a3\u0001\u0000\u0000\u0000\u08a3\u08a5\u0001\u0000\u0000\u0000"+
		"\u08a4\u08a6\u0003$\u0012\u0000\u08a5\u08a4\u0001\u0000\u0000\u0000\u08a5"+
		"\u08a6\u0001\u0000\u0000\u0000\u08a6\u08a8\u0001\u0000\u0000\u0000\u08a7"+
		"\u08a9\u0003$\u0012\u0000\u08a8\u08a7\u0001\u0000\u0000\u0000\u08a8\u08a9"+
		"\u0001\u0000\u0000\u0000\u08a9\u08ad\u0001\u0000\u0000\u0000\u08aa\u08ac"+
		"\u0003$\u0012\u0000\u08ab\u08aa\u0001\u0000\u0000\u0000\u08ac\u08af\u0001"+
		"\u0000\u0000\u0000\u08ad\u08ab\u0001\u0000\u0000\u0000\u08ad\u08ae\u0001"+
		"\u0000\u0000\u0000\u08ae\u08b0\u0001\u0000\u0000\u0000\u08af\u08ad\u0001"+
		"\u0000\u0000\u0000\u08b0\u08b1\u0005\u0004\u0000\u0000\u08b1\u08b2\u0005"+
		"\n\u0000\u0000\u08b2\u08b3\u0005\u0003\u0000\u0000\u08b3\u08b4\u0005\u0006"+
		"\u0000\u0000\u08b4\u08b5\u0005\u0003\u0000\u0000\u08b5\u08b9\u0003$\u0012"+
		"\u0000\u08b6\u08b8\u0003$\u0012\u0000\u08b7\u08b6\u0001\u0000\u0000\u0000"+
		"\u08b8\u08bb\u0001\u0000\u0000\u0000\u08b9\u08b7\u0001\u0000\u0000\u0000"+
		"\u08b9\u08ba\u0001\u0000\u0000\u0000\u08ba\u08bc\u0001\u0000\u0000\u0000"+
		"\u08bb\u08b9\u0001\u0000\u0000\u0000\u08bc\u08bd\u0005\u0004\u0000\u0000"+
		"\u08bd\u08be\u0005\n\u0000\u0000\u08be\u08bf\u0005\u0003\u0000\u0000\u08bf"+
		"\u08c0\u0005\u0006\u0000\u0000\u08c0\u08c2\u0005\u0003\u0000\u0000\u08c1"+
		"\u08c3\u0005\n\u0000\u0000\u08c2\u08c1\u0001\u0000\u0000\u0000\u08c2\u08c3"+
		"\u0001\u0000\u0000\u0000\u08c3\u08c4\u0001\u0000\u0000\u0000\u08c4\u08c5"+
		"\u0005\u0004\u0000\u0000\u08c5\u08c6\u0005\n\u0000\u0000\u08c6\u08c7\u0005"+
		"\u0003\u0000\u0000\u08c7\u08c8\u0005\u0006\u0000\u0000\u08c8\u08c9\u0005"+
		"\u0003\u0000\u0000\u08c9\u08ca\u0005\b\u0000\u0000\u08ca\u08cb\u0005\u0004"+
		"\u0000\u0000\u08cb\u08cc\u0005\n\u0000\u0000\u08cc\u08cd\u0005\u0003\u0000"+
		"\u0000\u08cd\u08ce\u0005\u0006\u0000\u0000\u08ce\u08cf\u0005\u0003\u0000"+
		"\u0000\u08cf\u08d0\u0005\b\u0000\u0000\u08d0\u08d1\u0005\u0004\u0000\u0000"+
		"\u08d1\u08d2\u0005\n\u0000\u0000\u08d2\u08d3\u0005\u0003\u0000\u0000\u08d3"+
		"\u08d4\u0005\u0006\u0000\u0000\u08d4\u08d5\u0005\u0003\u0000\u0000\u08d5"+
		"\u08d6\u0005\b\u0000\u0000\u08d6\u08d7\u0005\u0004\u0000\u0000\u08d7\u08d8"+
		"\u0005\n\u0000\u0000\u08d8\u08d9\u0005\u0003\u0000\u0000\u08d9\u08da\u0005"+
		"\u0006\u0000\u0000\u08da\u08db\u0005\u0003\u0000\u0000\u08db\u08dc\u0005"+
		"\b\u0000\u0000\u08dc\u08dd\u0005\u0004\u0000\u0000\u08dd\u08de\u0005\n"+
		"\u0000\u0000\u08de\u08df\u0005\u0003\u0000\u0000\u08df\u08e0\u0005\u0006"+
		"\u0000\u0000\u08e0\u08e1\u0005\u0003\u0000\u0000\u08e1\u08e2\u0005\b\u0000"+
		"\u0000\u08e2\u08e3\u0005\u0004\u0000\u0000\u08e3\u08e4\u0005\n\u0000\u0000"+
		"\u08e4\u08e5\u0005\u0003\u0000\u0000\u08e5\u08e6\u0005\u0006\u0000\u0000"+
		"\u08e6\u08e7\u0005\u0003\u0000\u0000\u08e7\u08e8\u0005\b\u0000\u0000\u08e8"+
		"\u08e9\u0005\u0004\u0000\u0000\u08e9\u08ea\u0005\n\u0000\u0000\u08ea\u08eb"+
		"\u0005\u0003\u0000\u0000\u08eb\u08ec\u0005\u0006\u0000\u0000\u08ec\u08ed"+
		"\u0005\u0003\u0000\u0000\u08ed\u08ee\u0005\b\u0000\u0000\u08ee\u08ef\u0005"+
		"\u0004\u0000\u0000\u08ef\u08f0\u0005\n\u0000\u0000\u08f0\u08f1\u0005\u0003"+
		"\u0000\u0000\u08f1\u08f2\u0005\u0006\u0000\u0000\u08f2\u08f3\u0005\u0003"+
		"\u0000\u0000\u08f3\u08f4\u0005\b\u0000\u0000\u08f4\u08f5\u0005\u0004\u0000"+
		"\u0000\u08f5\u08f6\u0005\n\u0000\u0000\u08f6\u08f7\u0005\u0003\u0000\u0000"+
		"\u08f7\u08f8\u0005\u0006\u0000\u0000\u08f8\u08f9\u0005\u0003\u0000\u0000"+
		"\u08f9\u08fa\u0005";
	private static final String _serializedATNSegment1 =
		"\b\u0000\u0000\u08fa\u08fb\u0005\u0004\u0000\u0000\u08fb\u08fc\u0005\n"+
		"\u0000\u0000\u08fc\u08fd\u0005\u0003\u0000\u0000\u08fd\u08fe\u0005\u0006"+
		"\u0000\u0000\u08fe\u08ff\u0005\u0003\u0000\u0000\u08ff\u0900\u0005\b\u0000"+
		"\u0000\u0900\u0901\u0005\u0004\u0000\u0000\u0901\u0902\u0005\n\u0000\u0000"+
		"\u0902\u0903\u0005\u0003\u0000\u0000\u0903\u0904\u0005\u0006\u0000\u0000"+
		"\u0904\u0905\u0005\u0003\u0000\u0000\u0905\u0906\u0005\u0004\u0000\u0000"+
		"\u0906\u0907\u0006\b\uffff\uffff\u0000\u0907\u0937\u0001\u0000\u0000\u0000"+
		"\u0908\u0909\u0005\n\u0000\u0000\u0909\u090a\u0005\u0003\u0000\u0000\u090a"+
		"\u090b\u0005\u0006\u0000\u0000\u090b\u090c\u0005\u0003\u0000\u0000\u090c"+
		"\u090d\u0005\b\u0000\u0000\u090d\u090f\u0003$\u0012\u0000\u090e\u0910"+
		"\u0003$\u0012\u0000\u090f\u090e\u0001\u0000\u0000\u0000\u090f\u0910\u0001"+
		"\u0000\u0000\u0000\u0910\u0912\u0001\u0000\u0000\u0000\u0911\u0913\u0003"+
		"$\u0012\u0000\u0912\u0911\u0001\u0000\u0000\u0000\u0912\u0913\u0001\u0000"+
		"\u0000\u0000\u0913\u0915\u0001\u0000\u0000\u0000\u0914\u0916\u0003$\u0012"+
		"\u0000\u0915\u0914\u0001\u0000\u0000\u0000\u0915\u0916\u0001\u0000\u0000"+
		"\u0000\u0916\u0918\u0001\u0000\u0000\u0000\u0917\u0919\u0003$\u0012\u0000"+
		"\u0918\u0917\u0001\u0000\u0000\u0000\u0918\u0919\u0001\u0000\u0000\u0000"+
		"\u0919\u091b\u0001\u0000\u0000\u0000\u091a\u091c\u0003$\u0012\u0000\u091b"+
		"\u091a\u0001\u0000\u0000\u0000\u091b\u091c\u0001\u0000\u0000\u0000\u091c"+
		"\u091e\u0001\u0000\u0000\u0000\u091d\u091f\u0003$\u0012\u0000\u091e\u091d"+
		"\u0001\u0000\u0000\u0000\u091e\u091f\u0001\u0000\u0000\u0000\u091f\u0923"+
		"\u0001\u0000\u0000\u0000\u0920\u0922\u0003$\u0012\u0000\u0921\u0920\u0001"+
		"\u0000\u0000\u0000\u0922\u0925\u0001\u0000\u0000\u0000\u0923\u0921\u0001"+
		"\u0000\u0000\u0000\u0923\u0924\u0001\u0000\u0000\u0000\u0924\u0926\u0001"+
		"\u0000\u0000\u0000\u0925\u0923\u0001\u0000\u0000\u0000\u0926\u0927\u0005"+
		"\b\u0000\u0000\u0927\u0928\u0005\u0004\u0000\u0000\u0928\u0929\u0005\n"+
		"\u0000\u0000\u0929\u092a\u0005\u0003\u0000\u0000\u092a\u092b\u0005\u0006"+
		"\u0000\u0000\u092b\u092c\u0005\u0003\u0000\u0000\u092c\u092d\u0005\b\u0000"+
		"\u0000\u092d\u092e\u0005\b\u0000\u0000\u092e\u092f\u0005\b\u0000\u0000"+
		"\u092f\u0930\u0005\b\u0000\u0000\u0930\u0931\u0005\b\u0000\u0000\u0931"+
		"\u0932\u0005\b\u0000\u0000\u0932\u0933\u0005\b\u0000\u0000\u0933\u0934"+
		"\u0005\u0004\u0000\u0000\u0934\u0935\u0006\b\uffff\uffff\u0000\u0935\u0937"+
		"\u0001\u0000\u0000\u0000\u0936\u088d\u0001\u0000\u0000\u0000\u0936\u0908"+
		"\u0001\u0000\u0000\u0000\u0937\u0938\u0001\u0000\u0000\u0000\u0938\u0936"+
		"\u0001\u0000\u0000\u0000\u0938\u0939\u0001\u0000\u0000\u0000\u0939\u093a"+
		"\u0001\u0000\u0000\u0000\u093a\u093b\u0005\n\u0000\u0000\u093b\u093c\u0005"+
		"\u0003\u0000\u0000\u093c\u093d\u0005\n\u0000\u0000\u093d\u093e\u0005\u0003"+
		"\u0000\u0000\u093e\u093f\u0005\u0006\u0000\u0000\u093f\u0940\u0005\u0004"+
		"\u0000\u0000\u0940\u0942\u0001\u0000\u0000\u0000\u0941\u075f\u0001\u0000"+
		"\u0000\u0000\u0942\u0943\u0001\u0000\u0000\u0000\u0943\u0941\u0001\u0000"+
		"\u0000\u0000\u0943\u0944\u0001\u0000\u0000\u0000\u0944\u0945\u0001\u0000"+
		"\u0000\u0000\u0945\u0946\u0005\u0005\u0000\u0000\u0946\u0947\u0005\u0003"+
		"\u0000\u0000\u0947\u0948\u0005\n\u0000\u0000\u0948\u0949\u0005\u0003\u0000"+
		"\u0000\u0949\u094a\u0005\n\u0000\u0000\u094a\u094b\u0005\n\u0000\u0000"+
		"\u094b\u094c\u0005\n\u0000\u0000\u094c\u094d\u0005\n\u0000\u0000\u094d"+
		"\u094e\u0005\n\u0000\u0000\u094e\u094f\u0005\n\u0000\u0000\u094f\u0950"+
		"\u0005\u0003\u0000\u0000\u0950\u0951\u0005\n\u0000\u0000\u0951\u0952\u0005"+
		"\u0004\u0000\u0000\u0952\u0011\u0001\u0000\u0000\u0000\u0953\u0954\u0005"+
		"\u0005\u0000\u0000\u0954\u0955\u0005\u0003\u0000\u0000\u0955\u0956\u0005"+
		"\n\u0000\u0000\u0956\u0957\u0005\u0003\u0000\u0000\u0957\u0958\u0005\n"+
		"\u0000\u0000\u0958\u0959\u0005\u0003\u0000\u0000\u0959\u095a\u0005\n\u0000"+
		"\u0000\u095a\u0a14\u0005\u0004\u0000\u0000\u095b\u095c\u0005\b\u0000\u0000"+
		"\u095c\u095d\u0005\u0003\u0000\u0000\u095d\u095e\u0005\n\u0000\u0000\u095e"+
		"\u095f\u0005\n\u0000\u0000\u095f\u0960\u0005\u0003\u0000\u0000\u0960\u0a15"+
		"\u0005\u0004\u0000\u0000\u0961\u0962\u0005\n\u0000\u0000\u0962\u0963\u0005"+
		"\u0003\u0000\u0000\u0963\u0964\u0005\b\u0000\u0000\u0964\u0965\u0005\u0003"+
		"\u0000\u0000\u0965\u0966\u0005\n\u0000\u0000\u0966\u0967\u0005\u0003\u0000"+
		"\u0000\u0967\u0968\u0005\n\u0000\u0000\u0968\u0969\u0005\u0003\u0000\u0000"+
		"\u0969\u096a\u0005\n\u0000\u0000\u096a\u096b\u0005\u0003\u0000\u0000\u096b"+
		"\u096c\u0005\n\u0000\u0000\u096c\u096d\u0005\u0003\u0000\u0000\u096d\u096e"+
		"\u0005\n\u0000\u0000\u096e\u096f\u0005\u0003\u0000\u0000\u096f\u0970\u0005"+
		"\n\u0000\u0000\u0970\u0971\u0005\u0003\u0000\u0000\u0971\u0972\u0005\n"+
		"\u0000\u0000\u0972\u0973\u0005\u0003\u0000\u0000\u0973\u0974\u0005\n\u0000"+
		"\u0000\u0974\u0975\u0005\u0003\u0000\u0000\u0975\u0976\u0005\n\u0000\u0000"+
		"\u0976\u0977\u0005\u0003\u0000\u0000\u0977\u0978\u0005\n\u0000\u0000\u0978"+
		"\u0979\u0005\u0003\u0000\u0000\u0979\u097a\u0005\n\u0000\u0000\u097a\u097b"+
		"\u0005\u0003\u0000\u0000\u097b\u0998\u0005\u0004\u0000\u0000\u097c\u097d"+
		"\u0005\n\u0000\u0000\u097d\u097e\u0005\u0003\u0000\u0000\u097e\u097f\u0005"+
		"\b\u0000\u0000\u097f\u0980\u0005\u0003\u0000\u0000\u0980\u0981\u0005\u0006"+
		"\u0000\u0000\u0981\u0982\u0005\u0003\u0000\u0000\u0982\u0983\u0005\b\u0000"+
		"\u0000\u0983\u0984\u0005\u0003\u0000\u0000\u0984\u0985\u0005\b\u0000\u0000"+
		"\u0985\u0986\u0005\u0003\u0000\u0000\u0986\u0987\u0005\b\u0000\u0000\u0987"+
		"\u0988\u0005\u0003\u0000\u0000\u0988\u0989\u0005\b\u0000\u0000\u0989\u098a"+
		"\u0005\u0003\u0000\u0000\u098a\u098b\u0005\b\u0000\u0000\u098b\u098c\u0005"+
		"\u0003\u0000\u0000\u098c\u098d\u0005\b\u0000\u0000\u098d\u098e\u0005\u0003"+
		"\u0000\u0000\u098e\u098f\u0005\b\u0000\u0000\u098f\u0990\u0005\u0003\u0000"+
		"\u0000\u0990\u0991\u0005\b\u0000\u0000\u0991\u0992\u0005\u0003\u0000\u0000"+
		"\u0992\u0993\u0005\b\u0000\u0000\u0993\u0994\u0005\u0003\u0000\u0000\u0994"+
		"\u0995\u0005\b\u0000\u0000\u0995\u0996\u0005\u0003\u0000\u0000\u0996\u0997"+
		"\u0005\u0004\u0000\u0000\u0997\u0999\u0006\t\uffff\uffff\u0000\u0998\u097c"+
		"\u0001\u0000\u0000\u0000\u0999\u099a\u0001\u0000\u0000\u0000\u099a\u0998"+
		"\u0001\u0000\u0000\u0000\u099a\u099b\u0001\u0000\u0000\u0000\u099b\u0a09"+
		"\u0001\u0000\u0000\u0000\u099c\u099d\u0005\n\u0000\u0000\u099d\u099e\u0005"+
		"\u0003\u0000\u0000\u099e\u099f\u0005\b\u0000\u0000\u099f\u09a0\u0005\u0003"+
		"\u0000\u0000\u09a0\u09a1\u0005\n\u0000\u0000\u09a1\u09a2\u0005\u0003\u0000"+
		"\u0000\u09a2\u09a3\u0005\n\u0000\u0000\u09a3\u09a4\u0005\u0003\u0000\u0000"+
		"\u09a4\u09a5\u0005\n\u0000\u0000\u09a5\u09a6\u0005\u0003\u0000\u0000\u09a6"+
		"\u09a7\u0005\n\u0000\u0000\u09a7\u09a8\u0005\u0003\u0000\u0000\u09a8\u09a9"+
		"\u0005\n\u0000\u0000\u09a9\u09aa\u0005\u0003\u0000\u0000\u09aa\u09ab\u0005"+
		"\n\u0000\u0000\u09ab\u09ac\u0005\u0003\u0000\u0000\u09ac\u09ad\u0005\n"+
		"\u0000\u0000\u09ad\u09ae\u0005\u0003\u0000\u0000\u09ae\u09af\u0005\n\u0000"+
		"\u0000\u09af\u09b0\u0005\u0003\u0000\u0000\u09b0\u09b1\u0005\n\u0000\u0000"+
		"\u09b1\u09b2\u0005\u0003\u0000\u0000\u09b2\u09b3\u0005\n\u0000\u0000\u09b3"+
		"\u09b4\u0005\u0003\u0000\u0000\u09b4\u09b5\u0005\n\u0000\u0000\u09b5\u09b6"+
		"\u0005\u0003\u0000\u0000\u09b6\u09b7\u0005\n\u0000\u0000\u09b7\u09b8\u0005"+
		"\u0003\u0000\u0000\u09b8\u09b9\u0005\n\u0000\u0000\u09b9\u09ba\u0005\u0003"+
		"\u0000\u0000\u09ba\u09bb\u0005\n\u0000\u0000\u09bb\u09bc\u0005\u0003\u0000"+
		"\u0000\u09bc\u09bd\u0005\n\u0000\u0000\u09bd\u09be\u0005\u0003\u0000\u0000"+
		"\u09be\u09bf\u0005\n\u0000\u0000\u09bf\u09c0\u0005\u0003\u0000\u0000\u09c0"+
		"\u09c1\u0005\n\u0000\u0000\u09c1\u09c2\u0005\u0003\u0000\u0000\u09c2\u0a04"+
		"\u0005\u0004\u0000\u0000\u09c3\u09c4\u0005\n\u0000\u0000\u09c4\u09c5\u0005"+
		"\u0003\u0000\u0000\u09c5\u09c6\u0005\b\u0000\u0000\u09c6\u09c7\u0005\u0003"+
		"\u0000\u0000\u09c7\u09c8\u0005\u0006\u0000\u0000\u09c8\u09c9\u0005\u0003"+
		"\u0000\u0000\u09c9\u09ca\u0005\b\u0000\u0000\u09ca\u09cb\u0005\u0003\u0000"+
		"\u0000\u09cb\u09cc\u0005\b\u0000\u0000\u09cc\u09cd\u0005\u0003\u0000\u0000"+
		"\u09cd\u09ce\u0005\b\u0000\u0000\u09ce\u09cf\u0005\u0003\u0000\u0000\u09cf"+
		"\u09d0\u0005\b\u0000\u0000\u09d0\u09d1\u0005\u0003\u0000\u0000\u09d1\u09d2"+
		"\u0005\b\u0000\u0000\u09d2\u09d3\u0005\u0003\u0000\u0000\u09d3\u09d4\u0005"+
		"\b\u0000\u0000\u09d4\u09d5\u0005\u0003\u0000\u0000\u09d5\u09d6\u0005\b"+
		"\u0000\u0000\u09d6\u09d7\u0005\u0003\u0000\u0000\u09d7\u09d8\u0005\b\u0000"+
		"\u0000\u09d8\u09d9\u0005\u0003\u0000\u0000\u09d9\u09da\u0005\b\u0000\u0000"+
		"\u09da\u09db\u0005\u0003\u0000\u0000\u09db\u09dc\u0005\b\u0000\u0000\u09dc"+
		"\u09dd\u0005\u0003\u0000\u0000\u09dd\u09de\u0005\b\u0000\u0000\u09de\u09df"+
		"\u0005\u0003\u0000\u0000\u09df\u09e0\u0005\b\u0000\u0000\u09e0\u09e1\u0005"+
		"\u0003\u0000\u0000\u09e1\u09e3\u0003$\u0012\u0000\u09e2\u09e4\u0003$\u0012"+
		"\u0000\u09e3\u09e2\u0001\u0000\u0000\u0000\u09e3\u09e4\u0001\u0000\u0000"+
		"\u0000\u09e4\u09e6\u0001\u0000\u0000\u0000\u09e5\u09e7\u0003$\u0012\u0000"+
		"\u09e6\u09e5\u0001\u0000\u0000\u0000\u09e6\u09e7\u0001\u0000\u0000\u0000"+
		"\u09e7\u09e9\u0001\u0000\u0000\u0000\u09e8\u09ea\u0003$\u0012\u0000\u09e9"+
		"\u09e8\u0001\u0000\u0000\u0000\u09e9\u09ea\u0001\u0000\u0000\u0000\u09ea"+
		"\u09ec\u0001\u0000\u0000\u0000\u09eb\u09ed\u0003$\u0012\u0000\u09ec\u09eb"+
		"\u0001\u0000\u0000\u0000\u09ec\u09ed\u0001\u0000\u0000\u0000\u09ed\u09ef"+
		"\u0001\u0000\u0000\u0000\u09ee\u09f0\u0003$\u0012\u0000\u09ef\u09ee\u0001"+
		"\u0000\u0000\u0000\u09ef\u09f0\u0001\u0000\u0000\u0000\u09f0\u09f2\u0001"+
		"\u0000\u0000\u0000\u09f1\u09f3\u0003$\u0012\u0000\u09f2\u09f1\u0001\u0000"+
		"\u0000\u0000\u09f2\u09f3\u0001\u0000\u0000\u0000\u09f3\u09f7\u0001\u0000"+
		"\u0000\u0000\u09f4\u09f6\u0003$\u0012\u0000\u09f5\u09f4\u0001\u0000\u0000"+
		"\u0000\u09f6\u09f9\u0001\u0000\u0000\u0000\u09f7\u09f5\u0001\u0000\u0000"+
		"\u0000\u09f7\u09f8\u0001\u0000\u0000\u0000\u09f8\u09fa\u0001\u0000\u0000"+
		"\u0000\u09f9\u09f7\u0001\u0000\u0000\u0000\u09fa\u09fb\u0005\u0003\u0000"+
		"\u0000\u09fb\u09fc\u0005\b\u0000\u0000\u09fc\u09fd\u0005\u0003\u0000\u0000"+
		"\u09fd\u09fe\u0005\b\u0000\u0000\u09fe\u09ff\u0005\u0003\u0000\u0000\u09ff"+
		"\u0a00\u0005\b\u0000\u0000\u0a00\u0a01\u0005\u0003\u0000\u0000\u0a01\u0a02"+
		"\u0005\u0004\u0000\u0000\u0a02\u0a03\u0006\t\uffff\uffff\u0000\u0a03\u0a05"+
		"\u0001\u0000\u0000\u0000\u0a04\u09c3\u0001\u0000\u0000\u0000\u0a05\u0a06"+
		"\u0001\u0000\u0000\u0000\u0a06\u0a04\u0001\u0000\u0000\u0000\u0a06\u0a07"+
		"\u0001\u0000\u0000\u0000\u0a07\u0a09\u0001\u0000\u0000\u0000\u0a08\u0961"+
		"\u0001\u0000\u0000\u0000\u0a08\u099c\u0001\u0000\u0000\u0000\u0a09\u0a0b"+
		"\u0001\u0000\u0000\u0000\u0a0a\u0a08\u0001\u0000\u0000\u0000\u0a0b\u0a0c"+
		"\u0001\u0000\u0000\u0000\u0a0c\u0a0a\u0001\u0000\u0000\u0000\u0a0c\u0a0d"+
		"\u0001\u0000\u0000\u0000\u0a0d\u0a0e\u0001\u0000\u0000\u0000\u0a0e\u0a0f"+
		"\u0005\n\u0000\u0000\u0a0f\u0a10\u0005\u0003\u0000\u0000\u0a10\u0a11\u0005"+
		"\n\u0000\u0000\u0a11\u0a12\u0005\u0003\u0000\u0000\u0a12\u0a13\u0005\u0006"+
		"\u0000\u0000\u0a13\u0a15\u0005\u0004\u0000\u0000\u0a14\u095b\u0001\u0000"+
		"\u0000\u0000\u0a14\u0a0a\u0001\u0000\u0000\u0000\u0a15\u0a16\u0001\u0000"+
		"\u0000\u0000\u0a16\u0a14\u0001\u0000\u0000\u0000\u0a16\u0a17\u0001\u0000"+
		"\u0000\u0000\u0a17\u0a18\u0001\u0000\u0000\u0000\u0a18\u0a19\u0005\u0005"+
		"\u0000\u0000\u0a19\u0a1a\u0005\u0003\u0000\u0000\u0a1a\u0a1b\u0005\n\u0000"+
		"\u0000\u0a1b\u0a1c\u0005\u0003\u0000\u0000\u0a1c\u0a1d\u0005\n\u0000\u0000"+
		"\u0a1d\u0a1e\u0005\u0003\u0000\u0000\u0a1e\u0a1f\u0005\n\u0000\u0000\u0a1f"+
		"\u0a20\u0005\u0004\u0000\u0000\u0a20\u0013\u0001\u0000\u0000\u0000\u0a21"+
		"\u0a22\u0005\u0005\u0000\u0000\u0a22\u0a23\u0005\u0003\u0000\u0000\u0a23"+
		"\u0a24\u0005\n\u0000\u0000\u0a24\u0a25\u0005\u0003\u0000\u0000\u0a25\u0a26"+
		"\u0005\n\u0000\u0000\u0a26\u0a27\u0005\n\u0000\u0000\u0a27\u0a28\u0005"+
		"\n\u0000\u0000\u0a28\u0a29\u0005\u0003\u0000\u0000\u0a29\u0a2a\u0005\n"+
		"\u0000\u0000\u0a2a\u0a2b\u0005\u0003\u0000\u0000\u0a2b\u0a2c\u0005\n\u0000"+
		"\u0000\u0a2c\u0aad\u0005\u0004\u0000\u0000\u0a2d\u0a2e\u0005\n\u0000\u0000"+
		"\u0a2e\u0a2f\u0005\u0003\u0000\u0000\u0a2f\u0a30\u0005\u0004\u0000\u0000"+
		"\u0a30\u0a31\u0005\n\u0000\u0000\u0a31\u0a32\u0005\u0003\u0000\u0000\u0a32"+
		"\u0a33\u0005\n\u0000\u0000\u0a33\u0a34\u0005\u0003\u0000\u0000\u0a34\u0a35"+
		"\u0005\n\u0000\u0000\u0a35\u0a36\u0005\u0003\u0000\u0000\u0a36\u0a37\u0005"+
		"\u0003\u0000\u0000\u0a37\u0a38\u0005\n\u0000\u0000\u0a38\u0a39\u0005\u0003"+
		"\u0000\u0000\u0a39\u0a3a\u0005\n\u0000\u0000\u0a3a\u0a3b\u0005\u0003\u0000"+
		"\u0000\u0a3b\u0a3c\u0005\n\u0000\u0000\u0a3c\u0a3d\u0005\u0003\u0000\u0000"+
		"\u0a3d\u0a3e\u0005\n\u0000\u0000\u0a3e\u0a3f\u0005\u0004\u0000\u0000\u0a3f"+
		"\u0a40\u0005\n\u0000\u0000\u0a40\u0a41\u0005\u0003\u0000\u0000\u0a41\u0a42"+
		"\u0005\u0003\u0000\u0000\u0a42\u0a43\u0005\u0003\u0000\u0000\u0a43\u0a44"+
		"\u0005\n\u0000\u0000\u0a44\u0a45\u0005\u0003\u0000\u0000\u0a45\u0a46\u0005"+
		"\u0003\u0000\u0000\u0a46\u0a47\u0005\u0003\u0000\u0000\u0a47\u0a48\u0005"+
		"\u0003\u0000\u0000\u0a48\u0a49\u0005\u0003\u0000\u0000\u0a49\u0a4a\u0005"+
		"\u0003\u0000\u0000\u0a4a\u0a4b\u0005\n\u0000\u0000\u0a4b\u0a4c\u0005\u0003"+
		"\u0000\u0000\u0a4c\u0a4d\u0005\n\u0000\u0000\u0a4d\u0a4e\u0005\u0003\u0000"+
		"\u0000\u0a4e\u0aa2\u0005\u0004\u0000\u0000\u0a4f\u0a50\u0005\n\u0000\u0000"+
		"\u0a50\u0a51\u0005\u0003\u0000\u0000\u0a51\u0a52\u0005\u0003\u0000\u0000"+
		"\u0a52\u0a54\u0003$\u0012\u0000\u0a53\u0a55\u0003$\u0012\u0000\u0a54\u0a53"+
		"\u0001\u0000\u0000\u0000\u0a54\u0a55\u0001\u0000\u0000\u0000\u0a55\u0a57"+
		"\u0001\u0000\u0000\u0000\u0a56\u0a58\u0003$\u0012\u0000\u0a57\u0a56\u0001"+
		"\u0000\u0000\u0000\u0a57\u0a58\u0001\u0000\u0000\u0000\u0a58\u0a5a\u0001"+
		"\u0000\u0000\u0000\u0a59\u0a5b\u0003$\u0012\u0000\u0a5a\u0a59\u0001\u0000"+
		"\u0000\u0000\u0a5a\u0a5b\u0001\u0000\u0000\u0000\u0a5b\u0a5d\u0001\u0000"+
		"\u0000\u0000\u0a5c\u0a5e\u0003$\u0012\u0000\u0a5d\u0a5c\u0001\u0000\u0000"+
		"\u0000\u0a5d\u0a5e\u0001\u0000\u0000\u0000\u0a5e\u0a60\u0001\u0000\u0000"+
		"\u0000\u0a5f\u0a61\u0003$\u0012\u0000\u0a60\u0a5f\u0001\u0000\u0000\u0000"+
		"\u0a60\u0a61\u0001\u0000\u0000\u0000\u0a61\u0a63\u0001\u0000\u0000\u0000"+
		"\u0a62\u0a64\u0003$\u0012\u0000\u0a63\u0a62\u0001\u0000\u0000\u0000\u0a63"+
		"\u0a64\u0001\u0000\u0000\u0000\u0a64\u0a68\u0001\u0000\u0000\u0000\u0a65"+
		"\u0a67\u0003$\u0012\u0000\u0a66\u0a65\u0001\u0000\u0000\u0000\u0a67\u0a6a"+
		"\u0001\u0000\u0000\u0000\u0a68\u0a66\u0001\u0000\u0000\u0000\u0a68\u0a69"+
		"\u0001\u0000\u0000\u0000\u0a69\u0a6b\u0001\u0000\u0000\u0000\u0a6a\u0a68"+
		"\u0001\u0000\u0000\u0000\u0a6b\u0a6c\u0005\u0003\u0000\u0000\u0a6c\u0a6d"+
		"\u0005\b\u0000\u0000\u0a6d\u0a6e\u0005\u0003\u0000\u0000\u0a6e\u0a70\u0003"+
		"$\u0012\u0000\u0a6f\u0a71\u0003$\u0012\u0000\u0a70\u0a6f\u0001\u0000\u0000"+
		"\u0000\u0a70\u0a71\u0001\u0000\u0000\u0000\u0a71\u0a73\u0001\u0000\u0000"+
		"\u0000\u0a72\u0a74\u0003$\u0012\u0000\u0a73\u0a72\u0001\u0000\u0000\u0000"+
		"\u0a73\u0a74\u0001\u0000\u0000\u0000\u0a74\u0a76\u0001\u0000\u0000\u0000"+
		"\u0a75\u0a77\u0003$\u0012\u0000\u0a76\u0a75\u0001\u0000\u0000\u0000\u0a76"+
		"\u0a77\u0001\u0000\u0000\u0000\u0a77\u0a79\u0001\u0000\u0000\u0000\u0a78"+
		"\u0a7a\u0003$\u0012\u0000\u0a79\u0a78\u0001\u0000\u0000\u0000\u0a79\u0a7a"+
		"\u0001\u0000\u0000\u0000\u0a7a\u0a7c\u0001\u0000\u0000\u0000\u0a7b\u0a7d"+
		"\u0003$\u0012\u0000\u0a7c\u0a7b\u0001\u0000\u0000\u0000\u0a7c\u0a7d\u0001"+
		"\u0000\u0000\u0000\u0a7d\u0a7f\u0001\u0000\u0000\u0000\u0a7e\u0a80\u0003"+
		"$\u0012\u0000\u0a7f\u0a7e\u0001\u0000\u0000\u0000\u0a7f\u0a80\u0001\u0000"+
		"\u0000\u0000\u0a80\u0a84\u0001\u0000\u0000\u0000\u0a81\u0a83\u0003$\u0012"+
		"\u0000\u0a82\u0a81\u0001\u0000\u0000\u0000\u0a83\u0a86\u0001\u0000\u0000"+
		"\u0000\u0a84\u0a82\u0001\u0000\u0000\u0000\u0a84\u0a85\u0001\u0000\u0000"+
		"\u0000\u0a85\u0a87\u0001\u0000\u0000\u0000\u0a86\u0a84\u0001\u0000\u0000"+
		"\u0000\u0a87\u0a88\u0005\u0003\u0000\u0000\u0a88\u0a89\u0005\b\u0000\u0000"+
		"\u0a89\u0a8a\u0005\u0003\u0000\u0000\u0a8a\u0a8b\u0005\b\u0000\u0000\u0a8b"+
		"\u0a8c\u0005\u0003\u0000\u0000\u0a8c\u0a8d\u0005\b\u0000\u0000\u0a8d\u0a8e"+
		"\u0005\u0003\u0000\u0000\u0a8e\u0a8f\u0005\u0003\u0000\u0000\u0a8f\u0a91"+
		"\u0005\u0003\u0000\u0000\u0a90\u0a92\u0005\b\u0000\u0000\u0a91\u0a90\u0001"+
		"\u0000\u0000\u0000\u0a91\u0a92\u0001\u0000\u0000\u0000\u0a92\u0a93\u0001"+
		"\u0000\u0000\u0000\u0a93\u0a94\u0005\u0003\u0000\u0000\u0a94\u0a95\u0005"+
		"\u0003\u0000\u0000\u0a95\u0a96\u0005\u0003\u0000\u0000\u0a96\u0a97\u0005"+
		"\u0003\u0000\u0000\u0a97\u0a98\u0005\u0003\u0000\u0000\u0a98\u0a9a\u0005"+
		"\u0003\u0000\u0000\u0a99\u0a9b\u0005\b\u0000\u0000\u0a9a\u0a99\u0001\u0000"+
		"\u0000\u0000\u0a9a\u0a9b\u0001\u0000\u0000\u0000\u0a9b\u0a9c\u0001\u0000"+
		"\u0000\u0000\u0a9c\u0a9d\u0005\u0003\u0000\u0000\u0a9d\u0a9e\u0005\n\u0000"+
		"\u0000\u0a9e\u0a9f\u0005\u0003\u0000\u0000\u0a9f\u0aa0\u0005\u0004\u0000"+
		"\u0000\u0aa0\u0aa1\u0006\n\uffff\uffff\u0000\u0aa1\u0aa3\u0001\u0000\u0000"+
		"\u0000\u0aa2\u0a4f\u0001\u0000\u0000\u0000\u0aa3\u0aa4\u0001\u0000\u0000"+
		"\u0000\u0aa4\u0aa2\u0001\u0000\u0000\u0000\u0aa4\u0aa5\u0001\u0000\u0000"+
		"\u0000\u0aa5\u0aa6\u0001\u0000\u0000\u0000\u0aa6\u0aa7\u0005\n\u0000\u0000"+
		"\u0aa7\u0aa8\u0005\u0003\u0000\u0000\u0aa8\u0aa9\u0005\n\u0000\u0000\u0aa9"+
		"\u0aaa\u0005\u0003\u0000\u0000\u0aaa\u0aab\u0005\u0006\u0000\u0000\u0aab"+
		"\u0aac\u0005\u0004\u0000\u0000\u0aac\u0aae\u0001\u0000\u0000\u0000\u0aad"+
		"\u0a2d\u0001\u0000\u0000\u0000\u0aae\u0aaf\u0001\u0000\u0000\u0000\u0aaf"+
		"\u0aad\u0001\u0000\u0000\u0000\u0aaf\u0ab0\u0001\u0000\u0000\u0000\u0ab0"+
		"\u0ab1\u0001\u0000\u0000\u0000\u0ab1\u0ab2\u0005\u0005\u0000\u0000\u0ab2"+
		"\u0ab3\u0005\u0003\u0000\u0000\u0ab3\u0ab4\u0005\n\u0000\u0000\u0ab4\u0ab5"+
		"\u0005\u0003\u0000\u0000\u0ab5\u0ab6\u0005\n\u0000\u0000\u0ab6\u0ab7\u0005"+
		"\n\u0000\u0000\u0ab7\u0ab8\u0005\n\u0000\u0000\u0ab8\u0ab9\u0005\u0003"+
		"\u0000\u0000\u0ab9\u0aba\u0005\n\u0000\u0000\u0aba\u0abb\u0005\u0003\u0000"+
		"\u0000\u0abb\u0abc\u0005\n\u0000\u0000\u0abc\u0abd\u0005\u0004\u0000\u0000"+
		"\u0abd\u0015\u0001\u0000\u0000\u0000\u0abe\u0abf\u0005\u0005\u0000\u0000"+
		"\u0abf\u0ac0\u0005\u0003\u0000\u0000\u0ac0\u0ac1\u0005\n\u0000\u0000\u0ac1"+
		"\u0ac2\u0005\n\u0000\u0000\u0ac2\u0ac3\u0005\u0003\u0000\u0000\u0ac3\u0ac4"+
		"\u0005\n\u0000\u0000\u0ac4\u0ac5\u0005\u0003\u0000\u0000\u0ac5\u0ac6\u0005"+
		"\n\u0000\u0000\u0ac6\u0ac7\u0005\u0003\u0000\u0000\u0ac7\u0ac8\u0005\n"+
		"\u0000\u0000\u0ac8\u0b56\u0005\u0004\u0000\u0000\u0ac9\u0aca\u0005\b\u0000"+
		"\u0000\u0aca\u0acc\u0005\u0003\u0000\u0000\u0acb\u0acd\u0003$\u0012\u0000"+
		"\u0acc\u0acb\u0001\u0000\u0000\u0000\u0acd\u0ace\u0001\u0000\u0000\u0000"+
		"\u0ace\u0acc\u0001\u0000\u0000\u0000\u0ace\u0acf\u0001\u0000\u0000\u0000"+
		"\u0acf\u0ad0\u0001\u0000\u0000\u0000\u0ad0\u0ad1\u0005\u0004\u0000\u0000"+
		"\u0ad1\u0ad2\u0005\u0005\u0000\u0000\u0ad2\u0ad3\u0005\u0003\u0000\u0000"+
		"\u0ad3\u0ad5\u0003$\u0012\u0000\u0ad4\u0ad6\u0003$\u0012\u0000\u0ad5\u0ad4"+
		"\u0001\u0000\u0000\u0000\u0ad5\u0ad6\u0001\u0000\u0000\u0000\u0ad6\u0ad8"+
		"\u0001\u0000\u0000\u0000\u0ad7\u0ad9\u0003$\u0012\u0000\u0ad8\u0ad7\u0001"+
		"\u0000\u0000\u0000\u0ad8\u0ad9\u0001\u0000\u0000\u0000\u0ad9\u0adb\u0001"+
		"\u0000\u0000\u0000\u0ada\u0adc\u0003$\u0012\u0000\u0adb\u0ada\u0001\u0000"+
		"\u0000\u0000\u0adb\u0adc\u0001\u0000\u0000\u0000\u0adc\u0ade\u0001\u0000"+
		"\u0000\u0000\u0add\u0adf\u0003$\u0012\u0000\u0ade\u0add\u0001\u0000\u0000"+
		"\u0000\u0ade\u0adf\u0001\u0000\u0000\u0000\u0adf\u0ae1\u0001\u0000\u0000"+
		"\u0000\u0ae0\u0ae2\u0003$\u0012\u0000\u0ae1\u0ae0\u0001\u0000\u0000\u0000"+
		"\u0ae1\u0ae2\u0001\u0000\u0000\u0000\u0ae2\u0ae4\u0001\u0000\u0000\u0000"+
		"\u0ae3\u0ae5\u0003$\u0012\u0000\u0ae4\u0ae3\u0001\u0000\u0000\u0000\u0ae4"+
		"\u0ae5\u0001\u0000\u0000\u0000\u0ae5\u0ae9\u0001\u0000\u0000\u0000\u0ae6"+
		"\u0ae8\u0003$\u0012\u0000\u0ae7\u0ae6\u0001\u0000\u0000\u0000\u0ae8\u0aeb"+
		"\u0001\u0000\u0000\u0000\u0ae9\u0ae7\u0001\u0000\u0000\u0000\u0ae9\u0aea"+
		"\u0001\u0000\u0000\u0000\u0aea\u0aec\u0001\u0000\u0000\u0000\u0aeb\u0ae9"+
		"\u0001\u0000\u0000\u0000\u0aec\u0aed\u0005\u0004\u0000\u0000\u0aed\u0aee"+
		"\u0005\u0005\u0000\u0000\u0aee\u0aef\u0005\u0003\u0000\u0000\u0aef\u0af1"+
		"\u0003$\u0012\u0000\u0af0\u0af2\u0003$\u0012\u0000\u0af1\u0af0\u0001\u0000"+
		"\u0000\u0000\u0af1\u0af2\u0001\u0000\u0000\u0000\u0af2\u0af4\u0001\u0000"+
		"\u0000\u0000\u0af3\u0af5\u0003$\u0012\u0000\u0af4\u0af3\u0001\u0000\u0000"+
		"\u0000\u0af4\u0af5\u0001\u0000\u0000\u0000\u0af5\u0af7\u0001\u0000\u0000"+
		"\u0000\u0af6\u0af8\u0003$\u0012\u0000\u0af7\u0af6\u0001\u0000\u0000\u0000"+
		"\u0af7\u0af8\u0001\u0000\u0000\u0000\u0af8\u0afa\u0001\u0000\u0000\u0000"+
		"\u0af9\u0afb\u0003$\u0012\u0000\u0afa\u0af9\u0001\u0000\u0000\u0000\u0afa"+
		"\u0afb\u0001\u0000\u0000\u0000\u0afb\u0afd\u0001\u0000\u0000\u0000\u0afc"+
		"\u0afe\u0003$\u0012\u0000\u0afd\u0afc\u0001\u0000\u0000\u0000\u0afd\u0afe"+
		"\u0001\u0000\u0000\u0000\u0afe\u0b00\u0001\u0000\u0000\u0000\u0aff\u0b01"+
		"\u0003$\u0012\u0000\u0b00\u0aff\u0001\u0000\u0000\u0000\u0b00\u0b01\u0001"+
		"\u0000\u0000\u0000\u0b01\u0b05\u0001\u0000\u0000\u0000\u0b02\u0b04\u0003"+
		"$\u0012\u0000\u0b03\u0b02\u0001\u0000\u0000\u0000\u0b04\u0b07\u0001\u0000"+
		"\u0000\u0000\u0b05\u0b03\u0001\u0000\u0000\u0000\u0b05\u0b06\u0001\u0000"+
		"\u0000\u0000\u0b06\u0b08\u0001\u0000\u0000\u0000\u0b07\u0b05\u0001\u0000"+
		"\u0000\u0000\u0b08\u0b09\u0005\u0004\u0000\u0000\u0b09\u0b0a\u0005\u0005"+
		"\u0000\u0000\u0b0a\u0b0b\u0005\u0003\u0000\u0000\u0b0b\u0b0c\u0005\b\u0000"+
		"\u0000\u0b0c\u0b0d\u0005\u0004\u0000\u0000\u0b0d\u0b0e\u0006\u000b\uffff"+
		"\uffff\u0000\u0b0e\u0b4b\u0001\u0000\u0000\u0000\u0b0f\u0b10\u0005\n\u0000"+
		"\u0000\u0b10\u0b11\u0005\u0003\u0000\u0000\u0b11\u0b12\u0005\n\u0000\u0000"+
		"\u0b12\u0b13\u0005\u0003\u0000\u0000\u0b13\u0b14\u0005\n\u0000\u0000\u0b14"+
		"\u0b15\u0005\u0003\u0000\u0000\u0b15\u0b16\u0005\n\u0000\u0000\u0b16\u0b17"+
		"\u0005\u0003\u0000\u0000\u0b17\u0b18\u0005\n\u0000\u0000\u0b18\u0b19\u0005"+
		"\u0003\u0000\u0000\u0b19\u0b1a\u0005\n\u0000\u0000\u0b1a\u0b1b\u0005\u0003"+
		"\u0000\u0000\u0b1b\u0b1c\u0005\n\u0000\u0000\u0b1c\u0b1d\u0005\u0003\u0000"+
		"\u0000\u0b1d\u0b1e\u0005\n\u0000\u0000\u0b1e\u0b1f\u0005\u0003\u0000\u0000"+
		"\u0b1f\u0b47\u0005\u0004\u0000\u0000\u0b20\u0b21\u0005\u0003\u0000\u0000"+
		"\u0b21\u0b22\u0005\u0003\u0000\u0000\u0b22\u0b23\u0005\u0003\u0000\u0000"+
		"\u0b23\u0b24\u0005\u0003\u0000\u0000\u0b24\u0b25\u0005\u0003\u0000\u0000"+
		"\u0b25\u0b26\u0005\u0003\u0000\u0000\u0b26\u0b27\u0005\u0003\u0000\u0000"+
		"\u0b27\u0b28\u0005\u0003\u0000\u0000\u0b28\u0b48\u0005\u0004\u0000\u0000"+
		"\u0b29\u0b2b\u0005\u0006\u0000\u0000\u0b2a\u0b29\u0001\u0000\u0000\u0000"+
		"\u0b2a\u0b2b\u0001\u0000\u0000\u0000\u0b2b\u0b2c\u0001\u0000\u0000\u0000"+
		"\u0b2c\u0b2e\u0005\u0003\u0000\u0000\u0b2d\u0b2f\u0005\b\u0000\u0000\u0b2e"+
		"\u0b2d\u0001\u0000\u0000\u0000\u0b2e\u0b2f\u0001\u0000\u0000\u0000\u0b2f"+
		"\u0b30\u0001\u0000\u0000\u0000\u0b30\u0b32\u0005\u0003\u0000\u0000\u0b31"+
		"\u0b33\u0005\b\u0000\u0000\u0b32\u0b31\u0001\u0000\u0000\u0000\u0b32\u0b33"+
		"\u0001\u0000\u0000\u0000\u0b33\u0b34\u0001\u0000\u0000\u0000\u0b34\u0b36"+
		"\u0005\u0003\u0000\u0000\u0b35\u0b37\u0005\b\u0000\u0000\u0b36\u0b35\u0001"+
		"\u0000\u0000\u0000\u0b36\u0b37\u0001\u0000\u0000\u0000\u0b37\u0b38\u0001"+
		"\u0000\u0000\u0000\u0b38\u0b3a\u0005\u0003\u0000\u0000\u0b39\u0b3b\u0005"+
		"\b\u0000\u0000\u0b3a\u0b39\u0001\u0000\u0000\u0000\u0b3a\u0b3b\u0001\u0000"+
		"\u0000\u0000\u0b3b\u0b3c\u0001\u0000\u0000\u0000\u0b3c\u0b3d\u0005\u0003"+
		"\u0000\u0000\u0b3d\u0b3e\u0005\b\u0000\u0000\u0b3e\u0b3f\u0005\u0003\u0000"+
		"\u0000\u0b3f\u0b40\u0005\b\u0000\u0000\u0b40\u0b42\u0005\u0003\u0000\u0000"+
		"\u0b41\u0b43\u0005\b\u0000\u0000\u0b42\u0b41\u0001\u0000\u0000\u0000\u0b42"+
		"\u0b43\u0001\u0000\u0000\u0000\u0b43\u0b44\u0001\u0000\u0000\u0000\u0b44"+
		"\u0b45\u0005\u0003\u0000\u0000\u0b45\u0b46\u0005\u0004\u0000\u0000\u0b46"+
		"\u0b48\u0006\u000b\uffff\uffff\u0000\u0b47\u0b20\u0001\u0000\u0000\u0000"+
		"\u0b47\u0b2a\u0001\u0000\u0000\u0000\u0b48\u0b49\u0001\u0000\u0000\u0000"+
		"\u0b49\u0b47\u0001\u0000\u0000\u0000\u0b49\u0b4a\u0001\u0000\u0000\u0000"+
		"\u0b4a\u0b4c\u0001\u0000\u0000\u0000\u0b4b\u0b0f\u0001\u0000\u0000\u0000"+
		"\u0b4c\u0b4d\u0001\u0000\u0000\u0000\u0b4d\u0b4b\u0001\u0000\u0000\u0000"+
		"\u0b4d\u0b4e\u0001\u0000\u0000\u0000\u0b4e\u0b4f\u0001\u0000\u0000\u0000"+
		"\u0b4f\u0b50\u0005\n\u0000\u0000\u0b50\u0b51\u0005\u0003\u0000\u0000\u0b51"+
		"\u0b52\u0005\n\u0000\u0000\u0b52\u0b53\u0005\u0003\u0000\u0000\u0b53\u0b54"+
		"\u0005\u0006\u0000\u0000\u0b54\u0b55\u0005\u0004\u0000\u0000\u0b55\u0b57"+
		"\u0001\u0000\u0000\u0000\u0b56\u0ac9\u0001\u0000\u0000\u0000\u0b57\u0b58"+
		"\u0001\u0000\u0000\u0000\u0b58\u0b56\u0001\u0000\u0000\u0000\u0b58\u0b59"+
		"\u0001\u0000\u0000\u0000\u0b59\u0b5a\u0001\u0000\u0000\u0000\u0b5a\u0b5b"+
		"\u0005\u0005\u0000\u0000\u0b5b\u0b5c\u0005\u0003\u0000\u0000\u0b5c\u0b5d"+
		"\u0005\n\u0000\u0000\u0b5d\u0b5e\u0005\n\u0000\u0000\u0b5e\u0b5f\u0005"+
		"\u0003\u0000\u0000\u0b5f\u0b60\u0005\n\u0000\u0000\u0b60\u0b61\u0005\u0003"+
		"\u0000\u0000\u0b61\u0b62\u0005\n\u0000\u0000\u0b62\u0b63\u0005\u0003\u0000"+
		"\u0000\u0b63\u0b64\u0005\n\u0000\u0000\u0b64\u0b65\u0005\u0004\u0000\u0000"+
		"\u0b65\u0017\u0001\u0000\u0000\u0000\u0b66\u0b67\u0005\u0005\u0000\u0000"+
		"\u0b67\u0b68\u0005\u0003\u0000\u0000\u0b68\u0b69\u0005\n\u0000\u0000\u0b69"+
		"\u0b6a\u0005\n\u0000\u0000\u0b6a\u0b6b\u0005\u0003\u0000\u0000\u0b6b\u0b6c"+
		"\u0005\n\u0000\u0000\u0b6c\u0b6d\u0005\u0003\u0000\u0000\u0b6d\u0b6e\u0005"+
		"\n\u0000\u0000\u0b6e\u0b6f\u0005\u0003\u0000\u0000\u0b6f\u0b70\u0005\n"+
		"\u0000\u0000\u0b70\u0baf\u0005\u0004\u0000\u0000\u0b71\u0b72\u0005\b\u0000"+
		"\u0000\u0b72\u0b74\u0005\u0003\u0000\u0000\u0b73\u0b75\u0003$\u0012\u0000"+
		"\u0b74\u0b73\u0001\u0000\u0000\u0000\u0b75\u0b76\u0001\u0000\u0000\u0000"+
		"\u0b76\u0b74\u0001\u0000\u0000\u0000\u0b76\u0b77\u0001\u0000\u0000\u0000"+
		"\u0b77\u0b78\u0001\u0000\u0000\u0000\u0b78\u0ba4\u0005\u0004\u0000\u0000"+
		"\u0b79\u0b7a\u0005\n\u0000\u0000\u0b7a\u0b7b\u0005\u0003\u0000\u0000\u0b7b"+
		"\u0b7c\u0005\n\u0000\u0000\u0b7c\u0b7d\u0005\u0003\u0000\u0000\u0b7d\u0b7e"+
		"\u0005\n\u0000\u0000\u0b7e\u0b7f\u0005\u0003\u0000\u0000\u0b7f\u0b80\u0005"+
		"\n\u0000\u0000\u0b80\u0b81\u0005\u0003\u0000\u0000\u0b81\u0b82\u0005\n"+
		"\u0000\u0000\u0b82\u0b83\u0005\u0003\u0000\u0000\u0b83\u0b84\u0005\n\u0000"+
		"\u0000\u0b84\u0b85\u0005\u0003\u0000\u0000\u0b85\u0b86\u0005\n\u0000\u0000"+
		"\u0b86\u0b87\u0005\u0003\u0000\u0000\u0b87\u0ba0\u0005\u0004\u0000\u0000"+
		"\u0b88\u0b89\u0005\u0003\u0000\u0000\u0b89\u0b8a\u0005\u0003\u0000\u0000"+
		"\u0b8a\u0b8b\u0005\u0003\u0000\u0000\u0b8b\u0b8c\u0005\u0003\u0000\u0000"+
		"\u0b8c\u0b8d\u0005\u0003\u0000\u0000\u0b8d\u0b8e\u0005\u0003\u0000\u0000"+
		"\u0b8e\u0b8f\u0005\u0003\u0000\u0000\u0b8f\u0ba1\u0005\u0004\u0000\u0000"+
		"\u0b90\u0b91\u0005\u0006\u0000\u0000\u0b91\u0b92\u0005\u0003\u0000\u0000"+
		"\u0b92\u0b93\u0005\b\u0000\u0000\u0b93\u0b94\u0005\u0003\u0000\u0000\u0b94"+
		"\u0b95\u0005\b\u0000\u0000\u0b95\u0b96\u0005\u0003\u0000\u0000\u0b96\u0b97"+
		"\u0005\b\u0000\u0000\u0b97\u0b98\u0005\u0003\u0000\u0000\u0b98\u0b99\u0005"+
		"\b\u0000\u0000\u0b99\u0b9a\u0005\u0003\u0000\u0000\u0b9a\u0b9b\u0005\b"+
		"\u0000\u0000\u0b9b\u0b9c\u0005\u0003\u0000\u0000\u0b9c\u0b9d\u0005\b\u0000"+
		"\u0000\u0b9d\u0b9e\u0005\u0003\u0000\u0000\u0b9e\u0b9f\u0005\u0004\u0000"+
		"\u0000\u0b9f\u0ba1\u0006\f\uffff\uffff\u0000\u0ba0\u0b88\u0001\u0000\u0000"+
		"\u0000\u0ba0\u0b90\u0001\u0000\u0000\u0000\u0ba1\u0ba2\u0001\u0000\u0000"+
		"\u0000\u0ba2\u0ba0\u0001\u0000\u0000\u0000\u0ba2\u0ba3\u0001\u0000\u0000"+
		"\u0000\u0ba3\u0ba5\u0001\u0000\u0000\u0000\u0ba4\u0b79\u0001\u0000\u0000"+
		"\u0000\u0ba5\u0ba6\u0001\u0000\u0000\u0000\u0ba6\u0ba4\u0001\u0000\u0000"+
		"\u0000\u0ba6\u0ba7\u0001\u0000\u0000\u0000\u0ba7\u0ba8\u0001\u0000\u0000"+
		"\u0000\u0ba8\u0ba9\u0005\n\u0000\u0000\u0ba9\u0baa\u0005\u0003\u0000\u0000"+
		"\u0baa\u0bab\u0005\n\u0000\u0000\u0bab\u0bac\u0005\u0003\u0000\u0000\u0bac"+
		"\u0bad\u0005\u0006\u0000\u0000\u0bad\u0bae\u0005\u0004\u0000\u0000\u0bae"+
		"\u0bb0\u0001\u0000\u0000\u0000\u0baf\u0b71\u0001\u0000\u0000\u0000\u0bb0"+
		"\u0bb1\u0001\u0000\u0000\u0000\u0bb1\u0baf\u0001\u0000\u0000\u0000\u0bb1"+
		"\u0bb2\u0001\u0000\u0000\u0000\u0bb2\u0bb3\u0001\u0000\u0000\u0000\u0bb3"+
		"\u0bb4\u0005\u0005\u0000\u0000\u0bb4\u0bb5\u0005\u0003\u0000\u0000\u0bb5"+
		"\u0bb6\u0005\n\u0000\u0000\u0bb6\u0bb7\u0005\n\u0000\u0000\u0bb7\u0bb8"+
		"\u0005\u0003\u0000\u0000\u0bb8\u0bb9\u0005\n\u0000\u0000\u0bb9\u0bba\u0005"+
		"\u0003\u0000\u0000\u0bba\u0bbb\u0005\n\u0000\u0000\u0bbb\u0bbc\u0005\u0003"+
		"\u0000\u0000\u0bbc\u0bbd\u0005\n\u0000\u0000\u0bbd\u0bbe\u0005\u0004\u0000"+
		"\u0000\u0bbe\u0019\u0001\u0000\u0000\u0000\u0bbf\u0bc0\u0005\u0005\u0000"+
		"\u0000\u0bc0\u0bc1\u0005\u0003\u0000\u0000\u0bc1\u0bc2\u0005\n\u0000\u0000"+
		"\u0bc2\u0bc3\u0005\n\u0000\u0000\u0bc3\u0bc4\u0005\u0003\u0000\u0000\u0bc4"+
		"\u0bc5\u0005\n\u0000\u0000\u0bc5\u0bc6\u0005\u0003\u0000\u0000\u0bc6\u0bc7"+
		"\u0005\n\u0000\u0000\u0bc7\u0bc8\u0005\u0003\u0000\u0000\u0bc8\u0bc9\u0005"+
		"\n\u0000\u0000\u0bc9\u0c03\u0005\u0004\u0000\u0000\u0bca\u0bcb\u0005\u0005"+
		"\u0000\u0000\u0bcb\u0bcc\u0005\u0003\u0000\u0000\u0bcc\u0bcd\u0005\b\u0000"+
		"\u0000\u0bcd\u0bce\u0005\u0003\u0000\u0000\u0bce\u0bcf\u0005\n\u0000\u0000"+
		"\u0bcf\u0bd0\u0005\u0003\u0000\u0000\u0bd0\u0bd2\u0003$\u0012\u0000\u0bd1"+
		"\u0bd3\u0003$\u0012\u0000\u0bd2\u0bd1\u0001\u0000\u0000\u0000\u0bd2\u0bd3"+
		"\u0001\u0000\u0000\u0000\u0bd3\u0bd5\u0001\u0000\u0000\u0000\u0bd4\u0bd6"+
		"\u0003$\u0012\u0000\u0bd5\u0bd4\u0001\u0000\u0000\u0000\u0bd5\u0bd6\u0001"+
		"\u0000\u0000\u0000\u0bd6\u0bd8\u0001\u0000\u0000\u0000\u0bd7\u0bd9\u0003"+
		"$\u0012\u0000\u0bd8\u0bd7\u0001\u0000\u0000\u0000\u0bd8\u0bd9\u0001\u0000"+
		"\u0000\u0000\u0bd9\u0bdb\u0001\u0000\u0000\u0000\u0bda\u0bdc\u0003$\u0012"+
		"\u0000\u0bdb\u0bda\u0001\u0000\u0000\u0000\u0bdb\u0bdc\u0001\u0000\u0000"+
		"\u0000\u0bdc\u0bde\u0001\u0000\u0000\u0000\u0bdd\u0bdf\u0003$\u0012\u0000"+
		"\u0bde\u0bdd\u0001\u0000\u0000\u0000\u0bde\u0bdf\u0001\u0000\u0000\u0000"+
		"\u0bdf\u0be1\u0001\u0000\u0000\u0000\u0be0\u0be2\u0003$\u0012\u0000\u0be1"+
		"\u0be0\u0001\u0000\u0000\u0000\u0be1\u0be2\u0001\u0000\u0000\u0000\u0be2"+
		"\u0be6\u0001\u0000\u0000\u0000\u0be3\u0be5\u0003$\u0012\u0000\u0be4\u0be3"+
		"\u0001\u0000\u0000\u0000\u0be5\u0be8\u0001\u0000\u0000\u0000\u0be6\u0be4"+
		"\u0001\u0000\u0000\u0000\u0be6\u0be7\u0001\u0000\u0000\u0000\u0be7\u0be9"+
		"\u0001\u0000\u0000\u0000\u0be8\u0be6\u0001\u0000\u0000\u0000\u0be9\u0bea"+
		"\u0005\u0004\u0000\u0000\u0bea\u0beb\u0005\u0005\u0000\u0000\u0beb\u0bec"+
		"\u0005\u0003\u0000\u0000\u0bec\u0bed\u0005\t\u0000\u0000\u0bed\u0bee\u0005"+
		"\u0004\u0000\u0000\u0bee\u0bef\u0005\u0005\u0000\u0000\u0bef\u0bf0\u0005"+
		"\u0003\u0000\u0000\u0bf0\u0bf1\u0005\t\u0000\u0000\u0bf1\u0bf2\u0005\u0004"+
		"\u0000\u0000\u0bf2\u0bf3\u0005\u0005\u0000\u0000\u0bf3\u0bf4\u0005\u0003"+
		"\u0000\u0000\u0bf4\u0bf5\u0005\b\u0000\u0000\u0bf5\u0bf6\u0005\n\u0000"+
		"\u0000\u0bf6\u0bf7\u0005\u0004\u0000\u0000\u0bf7\u0bf8\u0005\u0005\u0000"+
		"\u0000\u0bf8\u0bf9\u0005\u0003\u0000\u0000\u0bf9\u0bfa\u0005\u0006\u0000"+
		"\u0000\u0bfa\u0bfb\u0005\u0004\u0000\u0000\u0bfb\u0bfc\u0005\n\u0000\u0000"+
		"\u0bfc\u0bfd\u0005\u0003\u0000\u0000\u0bfd\u0bfe\u0005\n\u0000\u0000\u0bfe"+
		"\u0bff\u0005\u0003\u0000\u0000\u0bff\u0c00\u0005\u0006\u0000\u0000\u0c00"+
		"\u0c01\u0005\u0004\u0000\u0000\u0c01\u0c02\u0006\r\uffff\uffff\u0000\u0c02"+
		"\u0c04\u0001\u0000\u0000\u0000\u0c03\u0bca\u0001\u0000\u0000\u0000\u0c04"+
		"\u0c05\u0001\u0000\u0000\u0000\u0c05\u0c03\u0001\u0000\u0000\u0000\u0c05"+
		"\u0c06\u0001\u0000\u0000\u0000\u0c06\u0c07\u0001\u0000\u0000\u0000\u0c07"+
		"\u0c08\u0005\u0005\u0000\u0000\u0c08\u0c09\u0005\u0003\u0000\u0000\u0c09"+
		"\u0c0a\u0005\n\u0000\u0000\u0c0a\u0c0b\u0005\n\u0000\u0000\u0c0b\u0c0c"+
		"\u0005\u0003\u0000\u0000\u0c0c\u0c0d\u0005\n\u0000\u0000\u0c0d\u0c0e\u0005"+
		"\u0003\u0000\u0000\u0c0e\u0c0f\u0005\n\u0000\u0000\u0c0f\u0c10\u0005\u0003"+
		"\u0000\u0000\u0c10\u0c11\u0005\n\u0000\u0000\u0c11\u0c12\u0005\u0004\u0000"+
		"\u0000\u0c12\u001b\u0001\u0000\u0000\u0000\u0c13\u0c14\u0005\u0005\u0000"+
		"\u0000\u0c14\u0c15\u0005\u0003\u0000\u0000\u0c15\u0c16\u0005\n\u0000\u0000"+
		"\u0c16\u0c17\u0005\u0003\u0000\u0000\u0c17\u0c18\u0005\n\u0000\u0000\u0c18"+
		"\u0c19\u0005\n\u0000\u0000\u0c19\u0c1a\u0005\n\u0000\u0000\u0c1a\u0c1b"+
		"\u0005\u0003\u0000\u0000\u0c1b\u0c1c\u0005\n\u0000\u0000\u0c1c\u0c1d\u0005"+
		"\u0003\u0000\u0000\u0c1d\u0c1e\u0005\n\u0000\u0000\u0c1e\u0c63\u0005\u0004"+
		"\u0000\u0000\u0c1f\u0c20\u0005\n\u0000\u0000\u0c20\u0c21\u0005\u0003\u0000"+
		"\u0000\u0c21\u0c22\u0005\u0004\u0000\u0000\u0c22\u0c23\u0005\n\u0000\u0000"+
		"\u0c23\u0c24\u0005\u0003\u0000\u0000\u0c24\u0c25\u0005\n\u0000\u0000\u0c25"+
		"\u0c26\u0005\u0003\u0000\u0000\u0c26\u0c27\u0005\n\u0000\u0000\u0c27\u0c28"+
		"\u0005\u0003\u0000\u0000\u0c28\u0c29\u0005\n\u0000\u0000\u0c29\u0c2a\u0005"+
		"\u0003\u0000\u0000\u0c2a\u0c2b\u0005\n\u0000\u0000\u0c2b\u0c2c\u0005\u0003"+
		"\u0000\u0000\u0c2c\u0c2d\u0005\n\u0000\u0000\u0c2d\u0c2e\u0005\u0003\u0000"+
		"\u0000\u0c2e\u0c2f\u0005\n\u0000\u0000\u0c2f\u0c30\u0005\u0003\u0000\u0000"+
		"\u0c30\u0c31\u0005\n\u0000\u0000\u0c31\u0c32\u0005\u0003\u0000\u0000\u0c32"+
		"\u0c33\u0005\n\u0000\u0000\u0c33\u0c34\u0005\u0003\u0000\u0000\u0c34\u0c35"+
		"\u0005\n\u0000\u0000\u0c35\u0c36\u0005\u0003\u0000\u0000\u0c36\u0c37\u0005"+
		"\n\u0000\u0000\u0c37\u0c38\u0005\u0003\u0000\u0000\u0c38\u0c58\u0005\u0004"+
		"\u0000\u0000\u0c39\u0c3a\u0005\n\u0000\u0000\u0c3a\u0c3b\u0005\u0003\u0000"+
		"\u0000\u0c3b\u0c3c\u0005\b\u0000\u0000\u0c3c\u0c3e\u0005\u0003\u0000\u0000"+
		"\u0c3d\u0c3f\u0005\b\u0000\u0000\u0c3e\u0c3d\u0001\u0000\u0000\u0000\u0c3e"+
		"\u0c3f\u0001\u0000\u0000\u0000\u0c3f\u0c40\u0001\u0000\u0000\u0000\u0c40"+
		"\u0c42\u0005\u0003\u0000\u0000\u0c41\u0c43\u0003$\u0012\u0000\u0c42\u0c41"+
		"\u0001\u0000\u0000\u0000\u0c43\u0c44\u0001\u0000\u0000\u0000\u0c44\u0c42"+
		"\u0001\u0000\u0000\u0000\u0c44\u0c45\u0001\u0000\u0000\u0000\u0c45\u0c46"+
		"\u0001\u0000\u0000\u0000\u0c46\u0c47\u0005\u0003\u0000\u0000\u0c47\u0c48"+
		"\u0005\n\u0000\u0000\u0c48\u0c49\u0005\u0003\u0000\u0000\u0c49\u0c4a\u0005"+
		"\n\u0000\u0000\u0c4a\u0c4b\u0005\u0003\u0000\u0000\u0c4b\u0c4c\u0005\b"+
		"\u0000\u0000\u0c4c\u0c4d\u0005\u0003\u0000\u0000\u0c4d\u0c4e\u0005\b\u0000"+
		"\u0000\u0c4e\u0c4f\u0005\u0003\u0000\u0000\u0c4f\u0c50\u0005\b\u0000\u0000"+
		"\u0c50\u0c51\u0005\u0003\u0000\u0000\u0c51\u0c52\u0005\b\u0000\u0000\u0c52"+
		"\u0c53\u0005\u0003\u0000\u0000\u0c53\u0c54\u0005\b\u0000\u0000\u0c54\u0c55"+
		"\u0005\u0003\u0000\u0000\u0c55\u0c56\u0005\u0004\u0000\u0000\u0c56\u0c57"+
		"\u0006\u000e\uffff\uffff\u0000\u0c57\u0c59\u0001\u0000\u0000\u0000\u0c58"+
		"\u0c39\u0001\u0000\u0000\u0000\u0c59\u0c5a\u0001\u0000\u0000\u0000\u0c5a"+
		"\u0c58\u0001\u0000\u0000\u0000\u0c5a\u0c5b\u0001\u0000\u0000\u0000\u0c5b"+
		"\u0c5c\u0001\u0000\u0000\u0000\u0c5c\u0c5d\u0005\n\u0000\u0000\u0c5d\u0c5e"+
		"\u0005\u0003\u0000\u0000\u0c5e\u0c5f\u0005\n\u0000\u0000\u0c5f\u0c60\u0005"+
		"\u0003\u0000\u0000\u0c60\u0c61\u0005\u0006\u0000\u0000\u0c61\u0c62\u0005"+
		"\u0004\u0000\u0000\u0c62\u0c64\u0001\u0000\u0000\u0000\u0c63\u0c1f\u0001"+
		"\u0000\u0000\u0000\u0c64\u0c65\u0001\u0000\u0000\u0000\u0c65\u0c63\u0001"+
		"\u0000\u0000\u0000\u0c65\u0c66\u0001\u0000\u0000\u0000\u0c66\u0c67\u0001"+
		"\u0000\u0000\u0000\u0c67\u0c68\u0005\u0005\u0000\u0000\u0c68\u0c69\u0005"+
		"\u0003\u0000\u0000\u0c69\u0c6a\u0005\n\u0000\u0000\u0c6a\u0c6b\u0005\u0003"+
		"\u0000\u0000\u0c6b\u0c6c\u0005\n\u0000\u0000\u0c6c\u0c6d\u0005\n\u0000"+
		"\u0000\u0c6d\u0c6e\u0005\n\u0000\u0000\u0c6e\u0c6f\u0005\u0003\u0000\u0000"+
		"\u0c6f\u0c70\u0005\n\u0000\u0000\u0c70\u0c71\u0005\u0003\u0000\u0000\u0c71"+
		"\u0c72\u0005\n\u0000\u0000\u0c72\u0c73\u0005\u0004\u0000\u0000\u0c73\u001d"+
		"\u0001\u0000\u0000\u0000\u0c74\u0c75\u0005\u0005\u0000\u0000\u0c75\u0c76"+
		"\u0005\u0003\u0000\u0000\u0c76\u0c77\u0005\n\u0000\u0000\u0c77\u0c78\u0005"+
		"\n\u0000\u0000\u0c78\u0c79\u0005\u0003\u0000\u0000\u0c79\u0c7a\u0005\n"+
		"\u0000\u0000\u0c7a\u0c7b\u0005\u0003\u0000\u0000\u0c7b\u0c7c\u0005\n\u0000"+
		"\u0000\u0c7c\u0cce\u0005\u0004\u0000\u0000\u0c7d\u0c7e\u0005\u0005\u0000"+
		"\u0000\u0c7e\u0c7f\u0005\u0003\u0000\u0000\u0c7f\u0c80\u0005\b\u0000\u0000"+
		"\u0c80\u0c84\u0005\u0003\u0000\u0000\u0c81\u0c83\u0003$\u0012\u0000\u0c82"+
		"\u0c81\u0001\u0000\u0000\u0000\u0c83\u0c86\u0001\u0000\u0000\u0000\u0c84"+
		"\u0c82\u0001\u0000\u0000\u0000\u0c84\u0c85\u0001\u0000\u0000\u0000\u0c85"+
		"\u0c87\u0001\u0000\u0000\u0000\u0c86\u0c84\u0001\u0000\u0000\u0000\u0c87"+
		"\u0c88\u0005\u0004\u0000\u0000\u0c88\u0c8a\u0003$\u0012\u0000\u0c89\u0c8b"+
		"\u0003$\u0012\u0000\u0c8a\u0c89\u0001\u0000\u0000\u0000\u0c8a\u0c8b\u0001"+
		"\u0000\u0000\u0000\u0c8b\u0c8d\u0001\u0000\u0000\u0000\u0c8c\u0c8e\u0003"+
		"$\u0012\u0000\u0c8d\u0c8c\u0001\u0000\u0000\u0000\u0c8d\u0c8e\u0001\u0000"+
		"\u0000\u0000\u0c8e\u0c90\u0001\u0000\u0000\u0000\u0c8f\u0c91\u0003$\u0012"+
		"\u0000\u0c90\u0c8f\u0001\u0000\u0000\u0000\u0c90\u0c91\u0001\u0000\u0000"+
		"\u0000\u0c91\u0c93\u0001\u0000\u0000\u0000\u0c92\u0c94\u0003$\u0012\u0000"+
		"\u0c93\u0c92\u0001\u0000\u0000\u0000\u0c93\u0c94\u0001\u0000\u0000\u0000"+
		"\u0c94\u0c96\u0001\u0000\u0000\u0000\u0c95\u0c97\u0003$\u0012\u0000\u0c96"+
		"\u0c95\u0001\u0000\u0000\u0000\u0c96\u0c97\u0001\u0000\u0000\u0000\u0c97"+
		"\u0c99\u0001\u0000\u0000\u0000\u0c98\u0c9a\u0003$\u0012\u0000\u0c99\u0c98"+
		"\u0001\u0000\u0000\u0000\u0c99\u0c9a\u0001\u0000\u0000\u0000\u0c9a\u0c9e"+
		"\u0001\u0000\u0000\u0000\u0c9b\u0c9d\u0003$\u0012\u0000\u0c9c\u0c9b\u0001"+
		"\u0000\u0000\u0000\u0c9d\u0ca0\u0001\u0000\u0000\u0000\u0c9e\u0c9c\u0001"+
		"\u0000\u0000\u0000\u0c9e\u0c9f\u0001\u0000\u0000\u0000\u0c9f\u0ca1\u0001"+
		"\u0000\u0000\u0000\u0ca0\u0c9e\u0001\u0000\u0000\u0000\u0ca1\u0ca2\u0005"+
		"\u0004\u0000\u0000\u0ca2\u0ca4\u0003$\u0012\u0000\u0ca3\u0ca5\u0003$\u0012"+
		"\u0000\u0ca4\u0ca3\u0001\u0000\u0000\u0000\u0ca4\u0ca5\u0001\u0000\u0000"+
		"\u0000\u0ca5\u0ca7\u0001\u0000\u0000\u0000\u0ca6\u0ca8\u0003$\u0012\u0000"+
		"\u0ca7\u0ca6\u0001\u0000\u0000\u0000\u0ca7\u0ca8\u0001\u0000\u0000\u0000"+
		"\u0ca8\u0caa\u0001\u0000\u0000\u0000\u0ca9\u0cab\u0003$\u0012\u0000\u0caa"+
		"\u0ca9\u0001\u0000\u0000\u0000\u0caa\u0cab\u0001\u0000\u0000\u0000\u0cab"+
		"\u0cad\u0001\u0000\u0000\u0000\u0cac\u0cae\u0003$\u0012\u0000\u0cad\u0cac"+
		"\u0001\u0000\u0000\u0000\u0cad\u0cae\u0001\u0000\u0000\u0000\u0cae\u0cb0"+
		"\u0001\u0000\u0000\u0000\u0caf\u0cb1\u0003$\u0012\u0000\u0cb0\u0caf\u0001"+
		"\u0000\u0000\u0000\u0cb0\u0cb1\u0001\u0000\u0000\u0000\u0cb1\u0cb3\u0001"+
		"\u0000\u0000\u0000\u0cb2\u0cb4\u0003$\u0012\u0000\u0cb3\u0cb2\u0001\u0000"+
		"\u0000\u0000\u0cb3\u0cb4\u0001\u0000\u0000\u0000\u0cb4\u0cb8\u0001\u0000"+
		"\u0000\u0000\u0cb5\u0cb7\u0003$\u0012\u0000\u0cb6\u0cb5\u0001\u0000\u0000"+
		"\u0000\u0cb7\u0cba\u0001\u0000\u0000\u0000\u0cb8\u0cb6\u0001\u0000\u0000"+
		"\u0000\u0cb8\u0cb9\u0001\u0000\u0000\u0000\u0cb9\u0cbb\u0001\u0000\u0000"+
		"\u0000\u0cba\u0cb8\u0001\u0000\u0000\u0000\u0cbb\u0cbc\u0005\u0004\u0000"+
		"\u0000\u0cbc\u0cc0\u0005\u0006\u0000\u0000\u0cbd\u0cbf\u0005\n\u0000\u0000"+
		"\u0cbe\u0cbd\u0001\u0000\u0000\u0000\u0cbf\u0cc2\u0001\u0000\u0000\u0000"+
		"\u0cc0\u0cbe\u0001\u0000\u0000\u0000\u0cc0\u0cc1\u0001\u0000\u0000\u0000"+
		"\u0cc1\u0cc3\u0001\u0000\u0000\u0000\u0cc2\u0cc0\u0001\u0000\u0000\u0000"+
		"\u0cc3\u0cc4\u0005\u0004\u0000\u0000\u0cc4\u0cc5\u0003$\u0012\u0000\u0cc5"+
		"\u0cc6\u0005\u0004\u0000\u0000\u0cc6\u0cc7\u0005\n\u0000\u0000\u0cc7\u0cc8"+
		"\u0005\u0003\u0000\u0000\u0cc8\u0cc9\u0005\n\u0000\u0000\u0cc9\u0cca\u0005"+
		"\u0003\u0000\u0000\u0cca\u0ccb\u0005\u0006\u0000\u0000\u0ccb\u0ccc\u0005"+
		"\u0004\u0000\u0000\u0ccc\u0ccd\u0006\u000f\uffff\uffff\u0000\u0ccd\u0ccf"+
		"\u0001\u0000\u0000\u0000\u0cce\u0c7d\u0001\u0000\u0000\u0000\u0ccf\u0cd0"+
		"\u0001\u0000\u0000\u0000\u0cd0\u0cce\u0001\u0000\u0000\u0000\u0cd0\u0cd1"+
		"\u0001\u0000\u0000\u0000\u0cd1\u0cd2\u0001\u0000\u0000\u0000\u0cd2\u0cd3"+
		"\u0005\u0005\u0000\u0000\u0cd3\u0cd4\u0005\u0003\u0000\u0000\u0cd4\u0cd5"+
		"\u0005\n\u0000\u0000\u0cd5\u0cd6\u0005\n\u0000\u0000\u0cd6\u0cd7\u0005"+
		"\u0003\u0000\u0000\u0cd7\u0cd8\u0005\n\u0000\u0000\u0cd8\u0cd9\u0005\u0003"+
		"\u0000\u0000\u0cd9\u0cda\u0005\n\u0000\u0000\u0cda\u0cdb\u0005\u0004\u0000"+
		"\u0000\u0cdb\u001f\u0001\u0000\u0000\u0000\u0cdc\u0cdd\u0005\u0005\u0000"+
		"\u0000\u0cdd\u0cde\u0005\u0003\u0000\u0000\u0cde\u0cdf\u0005\n\u0000\u0000"+
		"\u0cdf\u0ce0\u0005\n\u0000\u0000\u0ce0\u0ce1\u0005\n\u0000\u0000\u0ce1"+
		"\u0ce2\u0005\u0003\u0000\u0000\u0ce2\u0ce3\u0005\n\u0000\u0000\u0ce3\u0ce4"+
		"\u0005\n\u0000\u0000\u0ce4\u0ce5\u0005\n\u0000\u0000\u0ce5\u0ce6\u0005"+
		"\u0003\u0000\u0000\u0ce6\u0ce7\u0005\n\u0000\u0000\u0ce7\u0ce8\u0005\u0003"+
		"\u0000\u0000\u0ce8\u0ce9\u0005\n\u0000\u0000\u0ce9\u0d52\u0005\u0004\u0000"+
		"\u0000\u0cea\u0ceb\u0005\n\u0000\u0000\u0ceb\u0ced\u0005\u0003\u0000\u0000"+
		"\u0cec\u0cee\u0005\n\u0000\u0000\u0ced\u0cec\u0001\u0000\u0000\u0000\u0ced"+
		"\u0cee\u0001\u0000\u0000\u0000\u0cee\u0cef\u0001\u0000\u0000\u0000\u0cef"+
		"\u0cf0\u0005\u0003\u0000\u0000\u0cf0\u0cf1\u0005\n\u0000\u0000\u0cf1\u0cf2"+
		"\u0005\u0003\u0000\u0000\u0cf2\u0cf3\u0005\n\u0000\u0000\u0cf3\u0cf4\u0005"+
		"\u0003\u0000\u0000\u0cf4\u0cf5\u0005\n\u0000\u0000\u0cf5\u0cf6\u0005\u0003"+
		"\u0000\u0000\u0cf6\u0cf7\u0005\n\u0000\u0000\u0cf7\u0cf8\u0005\u0003\u0000"+
		"\u0000\u0cf8\u0cf9\u0005\n\u0000\u0000\u0cf9\u0cfa\u0005\u0003\u0000\u0000"+
		"\u0cfa\u0cfb\u0005\n\u0000\u0000\u0cfb\u0cfc\u0005\u0003\u0000\u0000\u0cfc"+
		"\u0cfd\u0005\n\u0000\u0000\u0cfd\u0cfe\u0005\u0003\u0000\u0000\u0cfe\u0cff"+
		"\u0005\n\u0000\u0000\u0cff\u0d00\u0005\u0003\u0000\u0000\u0d00\u0d48\u0005"+
		"\u0004\u0000\u0000\u0d01\u0d02\u0005\u0003\u0000\u0000\u0d02\u0d03\u0005"+
		"\u0003\u0000\u0000\u0d03\u0d04\u0005\u0003\u0000\u0000\u0d04\u0d05\u0005"+
		"\u0003\u0000\u0000\u0d05\u0d06\u0005\u0003\u0000\u0000\u0d06\u0d07\u0005"+
		"\u0003\u0000\u0000\u0d07\u0d08\u0005\u0003\u0000\u0000\u0d08\u0d09\u0005"+
		"\u0003\u0000\u0000\u0d09\u0d0a\u0005\u0003\u0000\u0000\u0d0a\u0d0b\u0005"+
		"\u0003\u0000\u0000\u0d0b\u0d49\u0005\u0004\u0000\u0000\u0d0c\u0d0e\u0003"+
		"$\u0012\u0000\u0d0d\u0d0f\u0003$\u0012\u0000\u0d0e\u0d0d\u0001\u0000\u0000"+
		"\u0000\u0d0e\u0d0f\u0001\u0000\u0000\u0000\u0d0f\u0d11\u0001\u0000\u0000"+
		"\u0000\u0d10\u0d12\u0003$\u0012\u0000\u0d11\u0d10\u0001\u0000\u0000\u0000"+
		"\u0d11\u0d12\u0001\u0000\u0000\u0000\u0d12\u0d14\u0001\u0000\u0000\u0000"+
		"\u0d13\u0d15\u0003$\u0012\u0000\u0d14\u0d13\u0001\u0000\u0000\u0000\u0d14"+
		"\u0d15\u0001\u0000\u0000\u0000\u0d15\u0d17\u0001\u0000\u0000\u0000\u0d16"+
		"\u0d18\u0003$\u0012\u0000\u0d17\u0d16\u0001\u0000\u0000\u0000\u0d17\u0d18"+
		"\u0001\u0000\u0000\u0000\u0d18\u0d1a\u0001\u0000\u0000\u0000\u0d19\u0d1b"+
		"\u0003$\u0012\u0000\u0d1a\u0d19\u0001\u0000\u0000\u0000\u0d1a\u0d1b\u0001"+
		"\u0000\u0000\u0000\u0d1b\u0d1d\u0001\u0000\u0000\u0000\u0d1c\u0d1e\u0003"+
		"$\u0012\u0000\u0d1d\u0d1c\u0001\u0000\u0000\u0000\u0d1d\u0d1e\u0001\u0000"+
		"\u0000\u0000\u0d1e\u0d22\u0001\u0000\u0000\u0000\u0d1f\u0d21\u0003$\u0012"+
		"\u0000\u0d20\u0d1f\u0001\u0000\u0000\u0000\u0d21\u0d24\u0001\u0000\u0000"+
		"\u0000\u0d22\u0d20\u0001\u0000\u0000\u0000\u0d22\u0d23\u0001\u0000\u0000"+
		"\u0000\u0d23\u0d25\u0001\u0000\u0000\u0000\u0d24\u0d22\u0001\u0000\u0000"+
		"\u0000\u0d25\u0d26\u0005\u0003\u0000\u0000\u0d26\u0d27\u0005\n\u0000\u0000"+
		"\u0d27\u0d28\u0005\u0003\u0000\u0000\u0d28\u0d29\u0005\n\u0000\u0000\u0d29"+
		"\u0d2d\u0005\u0003\u0000\u0000\u0d2a\u0d2c\u0003$\u0012\u0000\u0d2b\u0d2a"+
		"\u0001\u0000\u0000\u0000\u0d2c\u0d2f\u0001\u0000\u0000\u0000\u0d2d\u0d2b"+
		"\u0001\u0000\u0000\u0000\u0d2d\u0d2e\u0001\u0000\u0000\u0000\u0d2e\u0d30"+
		"\u0001\u0000\u0000\u0000\u0d2f\u0d2d\u0001\u0000\u0000\u0000\u0d30\u0d32"+
		"\u0005\u0003\u0000\u0000\u0d31\u0d33\u0005\u0006\u0000\u0000\u0d32\u0d31"+
		"\u0001\u0000\u0000\u0000\u0d32\u0d33\u0001\u0000\u0000\u0000\u0d33\u0d34"+
		"\u0001\u0000\u0000\u0000\u0d34\u0d35\u0005\u0003\u0000\u0000\u0d35\u0d36"+
		"\u0005\u0006\u0000\u0000\u0d36\u0d38\u0005\u0003\u0000\u0000\u0d37\u0d39"+
		"\u0005\n\u0000\u0000\u0d38\u0d37\u0001\u0000\u0000\u0000\u0d38\u0d39\u0001"+
		"\u0000\u0000\u0000\u0d39\u0d3a\u0001\u0000\u0000\u0000\u0d3a\u0d3b\u0005"+
		"\u0003\u0000\u0000\u0d3b\u0d3c\u0005\b\u0000\u0000\u0d3c\u0d3e\u0005\u0003"+
		"\u0000\u0000\u0d3d\u0d3f\u0005\b\u0000\u0000\u0d3e\u0d3d\u0001\u0000\u0000"+
		"\u0000\u0d3e\u0d3f\u0001\u0000\u0000\u0000\u0d3f\u0d40\u0001\u0000\u0000"+
		"\u0000\u0d40\u0d42\u0005\u0003\u0000\u0000\u0d41\u0d43\u0005\b\u0000\u0000"+
		"\u0d42\u0d41\u0001\u0000\u0000\u0000\u0d42\u0d43\u0001\u0000\u0000\u0000"+
		"\u0d43\u0d44\u0001\u0000\u0000\u0000\u0d44\u0d45\u0005\u0003\u0000\u0000"+
		"\u0d45\u0d46\u0005\u0004\u0000\u0000\u0d46\u0d47\u0006\u0010\uffff\uffff"+
		"\u0000\u0d47\u0d49\u0001\u0000\u0000\u0000\u0d48\u0d01\u0001\u0000\u0000"+
		"\u0000\u0d48\u0d0c\u0001\u0000\u0000\u0000\u0d49\u0d4a\u0001\u0000\u0000"+
		"\u0000\u0d4a\u0d48\u0001\u0000\u0000\u0000\u0d4a\u0d4b\u0001\u0000\u0000"+
		"\u0000\u0d4b\u0d4c\u0001\u0000\u0000\u0000\u0d4c\u0d4d\u0005\n\u0000\u0000"+
		"\u0d4d\u0d4e\u0005\u0003\u0000\u0000\u0d4e\u0d4f\u0005\n\u0000\u0000\u0d4f"+
		"\u0d50\u0005\u0003\u0000\u0000\u0d50\u0d51\u0005\u0006\u0000\u0000\u0d51"+
		"\u0d53\u0005\u0004\u0000\u0000\u0d52\u0cea\u0001\u0000\u0000\u0000\u0d53"+
		"\u0d54\u0001\u0000\u0000\u0000\u0d54\u0d52\u0001\u0000\u0000\u0000\u0d54"+
		"\u0d55\u0001\u0000\u0000\u0000\u0d55\u0d56\u0001\u0000\u0000\u0000\u0d56"+
		"\u0d57\u0005\u0005\u0000\u0000\u0d57\u0d58\u0005\u0003\u0000\u0000\u0d58"+
		"\u0d59\u0005\n\u0000\u0000\u0d59\u0d5a\u0005\n\u0000\u0000\u0d5a\u0d5b"+
		"\u0005\n\u0000\u0000\u0d5b\u0d5c\u0005\u0003\u0000\u0000\u0d5c\u0d5d\u0005"+
		"\n\u0000\u0000\u0d5d\u0d5e\u0005\n\u0000\u0000\u0d5e\u0d5f\u0005\n\u0000"+
		"\u0000\u0d5f\u0d60\u0005\u0003\u0000\u0000\u0d60\u0d61\u0005\n\u0000\u0000"+
		"\u0d61\u0d62\u0005\u0003\u0000\u0000\u0d62\u0d63\u0005\n\u0000\u0000\u0d63"+
		"\u0d64\u0005\u0004\u0000\u0000\u0d64!\u0001\u0000\u0000\u0000\u0d65\u0d66"+
		"\u0005\u0005\u0000\u0000\u0d66\u0d67\u0005\u0003\u0000\u0000\u0d67\u0d68"+
		"\u0005\n\u0000\u0000\u0d68\u0d69\u0005\u0003\u0000\u0000\u0d69\u0d6a\u0005"+
		"\n\u0000\u0000\u0d6a\u0d6b\u0005\n\u0000\u0000\u0d6b\u0d6c\u0005\n\u0000"+
		"\u0000\u0d6c\u0d6d\u0005\u0003\u0000\u0000\u0d6d\u0d6e\u0005\n\u0000\u0000"+
		"\u0d6e\u0d6f\u0005\u0003\u0000\u0000\u0d6f\u0d70\u0005\n\u0000\u0000\u0d70"+
		"\u0def\u0005\u0004\u0000\u0000\u0d71\u0d72\u0005\n\u0000\u0000\u0d72\u0d73"+
		"\u0005\u0003\u0000\u0000\u0d73\u0d74\u0005\n\u0000\u0000\u0d74\u0d75\u0005"+
		"\u0004\u0000\u0000\u0d75\u0d76\u0005\n\u0000\u0000\u0d76\u0d77\u0005\u0003"+
		"\u0000\u0000\u0d77\u0d78\u0005\n\u0000\u0000\u0d78\u0d79\u0005\u0004\u0000"+
		"\u0000\u0d79\u0d7a\u0005\n\u0000\u0000\u0d7a\u0d7b\u0005\u0003\u0000\u0000"+
		"\u0d7b\u0d7c\u0005\n\u0000\u0000\u0d7c\u0d7d\u0005\u0003\u0000\u0000\u0d7d"+
		"\u0d7e\u0005\n\u0000\u0000\u0d7e\u0d7f\u0005\u0003\u0000\u0000\u0d7f\u0d80"+
		"\u0005\n\u0000\u0000\u0d80\u0d81\u0005\u0003\u0000\u0000\u0d81\u0d82\u0005"+
		"\n\u0000\u0000\u0d82\u0d83\u0005\u0003\u0000\u0000\u0d83\u0d84\u0005\n"+
		"\u0000\u0000\u0d84\u0d85\u0005\u0003\u0000\u0000\u0d85\u0d86\u0005\n\u0000"+
		"\u0000\u0d86\u0d87\u0005\u0003\u0000\u0000\u0d87\u0d88\u0005\n\u0000\u0000"+
		"\u0d88\u0d89\u0005\u0003\u0000\u0000\u0d89\u0d8a\u0005\n\u0000\u0000\u0d8a"+
		"\u0d8b\u0005\u0003\u0000\u0000\u0d8b\u0d8c\u0005\n\u0000\u0000\u0d8c\u0d8d"+
		"\u0005\u0003\u0000\u0000\u0d8d\u0d8e\u0005\n\u0000\u0000\u0d8e\u0d8f\u0005"+
		"\u0003\u0000\u0000\u0d8f\u0d90\u0005\n\u0000\u0000\u0d90\u0d91\u0005\u0003"+
		"\u0000\u0000\u0d91\u0d92\u0005\u0004\u0000\u0000\u0d92\u0d93\u0005\n\u0000"+
		"\u0000\u0d93\u0d94\u0005\u0003\u0000\u0000\u0d94\u0d95\u0005\n\u0000\u0000"+
		"\u0d95\u0d96\u0005\u0003\u0000\u0000\u0d96\u0d97\u0005\n\u0000\u0000\u0d97"+
		"\u0d98\u0005\u0003\u0000\u0000\u0d98\u0d99\u0005\n\u0000\u0000\u0d99\u0d9a"+
		"\u0005\u0003\u0000\u0000\u0d9a\u0d9b\u0005\n\u0000\u0000\u0d9b\u0d9c\u0005"+
		"\u0003\u0000\u0000\u0d9c\u0d9d\u0005\n\u0000\u0000\u0d9d\u0d9e\u0005\u0003"+
		"\u0000\u0000\u0d9e\u0de1\u0005\u0004\u0000\u0000\u0d9f\u0da0\u0005\u0003"+
		"\u0000\u0000\u0da0\u0da1\u0005\u0003\u0000\u0000\u0da1\u0da2\u0005\u0003"+
		"\u0000\u0000\u0da2\u0da3\u0005\u0003\u0000\u0000\u0da3\u0da4\u0005\u0003"+
		"\u0000\u0000\u0da4\u0da5\u0005\u0003\u0000\u0000\u0da5\u0da6\u0005\u0003"+
		"\u0000\u0000\u0da6\u0da7\u0005\u0003\u0000\u0000\u0da7\u0da8\u0005\u0003"+
		"\u0000\u0000\u0da8\u0da9\u0005\u0003\u0000\u0000\u0da9\u0daa\u0005\u0003"+
		"\u0000\u0000\u0daa\u0dab\u0005\u0003\u0000\u0000\u0dab\u0dac\u0005\u0003"+
		"\u0000\u0000\u0dac\u0dad\u0005\u0003\u0000\u0000\u0dad\u0dae\u0005\u0003"+
		"\u0000\u0000\u0dae\u0daf\u0005\u0003\u0000\u0000\u0daf\u0db0\u0005\u0003"+
		"\u0000\u0000\u0db0\u0de2\u0005\u0004\u0000\u0000\u0db1\u0db2\u0005\u0006"+
		"\u0000\u0000\u0db2\u0db4\u0005\u0003\u0000\u0000\u0db3\u0db5\u0005\u0006"+
		"\u0000\u0000\u0db4\u0db3\u0001\u0000\u0000\u0000\u0db4\u0db5\u0001\u0000"+
		"\u0000\u0000\u0db5\u0db6\u0001\u0000\u0000\u0000\u0db6\u0db8\u0005\u0003"+
		"\u0000\u0000\u0db7\u0db9\u0005\u0006\u0000\u0000\u0db8\u0db7\u0001\u0000"+
		"\u0000\u0000\u0db8\u0db9\u0001\u0000\u0000\u0000\u0db9\u0dba\u0001\u0000"+
		"\u0000\u0000\u0dba\u0dbb\u0005\u0003\u0000\u0000\u0dbb\u0dbc\u0005\b\u0000"+
		"\u0000\u0dbc\u0dbe\u0005\u0003\u0000\u0000\u0dbd\u0dbf\u0003$\u0012\u0000"+
		"\u0dbe\u0dbd\u0001\u0000\u0000\u0000\u0dbf\u0dc0\u0001\u0000\u0000\u0000"+
		"\u0dc0\u0dbe\u0001\u0000\u0000\u0000\u0dc0\u0dc1\u0001\u0000\u0000\u0000"+
		"\u0dc1\u0dc2\u0001\u0000\u0000\u0000\u0dc2\u0dc3\u0005\u0003\u0000\u0000"+
		"\u0dc3\u0dc4\u0005\n\u0000\u0000\u0dc4\u0dc5\u0005\u0003\u0000\u0000\u0dc5"+
		"\u0dc6\u0005\n\u0000\u0000\u0dc6\u0dc7\u0005\u0003\u0000\u0000\u0dc7\u0dc8"+
		"\u0005\n\u0000\u0000\u0dc8\u0dc9\u0005\u0003\u0000\u0000\u0dc9\u0dca\u0005"+
		"\n\u0000\u0000\u0dca\u0dcb\u0005\u0003\u0000\u0000\u0dcb\u0dcc\u0005\b"+
		"\u0000\u0000\u0dcc\u0dce\u0005\u0003\u0000\u0000\u0dcd\u0dcf\u0005\b\u0000"+
		"\u0000\u0dce\u0dcd\u0001\u0000\u0000\u0000\u0dce\u0dcf\u0001\u0000\u0000"+
		"\u0000\u0dcf\u0dd0\u0001\u0000\u0000\u0000\u0dd0\u0dd1\u0005\u0003\u0000"+
		"\u0000\u0dd1\u0dd2\u0005\b\u0000\u0000\u0dd2\u0dd3\u0005\u0003\u0000\u0000"+
		"\u0dd3\u0dd4\u0005\b\u0000\u0000\u0dd4\u0dd6\u0005\u0003\u0000\u0000\u0dd5"+
		"\u0dd7\u0005\b\u0000\u0000\u0dd6\u0dd5\u0001\u0000\u0000\u0000\u0dd6\u0dd7"+
		"\u0001\u0000\u0000\u0000\u0dd7\u0dd8\u0001\u0000\u0000\u0000\u0dd8\u0dd9"+
		"\u0005\u0003\u0000\u0000\u0dd9\u0dda\u0005\u0003\u0000\u0000\u0dda\u0ddb"+
		"\u0005\b\u0000\u0000\u0ddb\u0ddc\u0005\u0003\u0000\u0000\u0ddc\u0ddd\u0005"+
		"\b\u0000\u0000\u0ddd\u0dde\u0005\u0003\u0000\u0000\u0dde\u0ddf\u0005\u0004"+
		"\u0000\u0000\u0ddf\u0de0\u0006\u0011\uffff\uffff\u0000\u0de0\u0de2\u0001"+
		"\u0000\u0000\u0000\u0de1\u0d9f\u0001\u0000\u0000\u0000\u0de1\u0db1\u0001"+
		"\u0000\u0000\u0000\u0de2\u0de3\u0001\u0000\u0000\u0000\u0de3\u0de1\u0001"+
		"\u0000\u0000\u0000\u0de3\u0de4\u0001\u0000\u0000\u0000\u0de4\u0de6\u0001"+
		"\u0000\u0000\u0000\u0de5\u0d71\u0001\u0000\u0000\u0000\u0de6\u0de7\u0001"+
		"\u0000\u0000\u0000\u0de7\u0de5\u0001\u0000\u0000\u0000\u0de7\u0de8\u0001"+
		"\u0000\u0000\u0000\u0de8\u0de9\u0001\u0000\u0000\u0000\u0de9\u0dea\u0005"+
		"\n\u0000\u0000\u0dea\u0deb\u0005\u0003\u0000\u0000\u0deb\u0dec\u0005\n"+
		"\u0000\u0000\u0dec\u0ded\u0005\u0003\u0000\u0000\u0ded\u0dee\u0005\u0006"+
		"\u0000\u0000\u0dee\u0df0\u0005\u0004\u0000\u0000\u0def\u0de5\u0001\u0000"+
		"\u0000\u0000\u0df0\u0df1\u0001\u0000\u0000\u0000\u0df1\u0def\u0001\u0000"+
		"\u0000\u0000\u0df1\u0df2\u0001\u0000\u0000\u0000\u0df2\u0df3\u0001\u0000"+
		"\u0000\u0000\u0df3\u0df4\u0005\u0005\u0000\u0000\u0df4\u0df5\u0005\u0003"+
		"\u0000\u0000\u0df5\u0df6\u0005\n\u0000\u0000\u0df6\u0df7\u0005\u0003\u0000"+
		"\u0000\u0df7\u0df8\u0005\n\u0000\u0000\u0df8\u0df9\u0005\n\u0000\u0000"+
		"\u0df9\u0dfa\u0005\n\u0000\u0000\u0dfa\u0dfb\u0005\u0003\u0000\u0000\u0dfb"+
		"\u0dfc\u0005\n\u0000\u0000\u0dfc\u0dfd\u0005\u0003\u0000\u0000\u0dfd\u0dfe"+
		"\u0005\n\u0000\u0000\u0dfe\u0dff\u0005\u0004\u0000\u0000\u0dff#\u0001"+
		"\u0000\u0000\u0000\u0e00\u0e01\u0007\u0000\u0000\u0000\u0e01%\u0001\u0000"+
		"\u0000\u0000\u0e02\u0e05\u0003$\u0012\u0000\u0e03\u0e05\u0005\u0003\u0000"+
		"\u0000\u0e04\u0e02\u0001\u0000\u0000\u0000\u0e04\u0e03\u0001\u0000\u0000"+
		"\u0000\u0e05\u0e06\u0001\u0000\u0000\u0000\u0e06\u0e04\u0001\u0000\u0000"+
		"\u0000\u0e06\u0e07\u0001\u0000\u0000\u0000\u0e07\u0e08\u0001\u0000\u0000"+
		"\u0000\u0e08\u0e09\u0005\u0004\u0000\u0000\u0e09\'\u0001\u0000\u0000\u0000"+
		"\u0e0a\u0e0e\u0003$\u0012\u0000\u0e0b\u0e0e\u0005\u0003\u0000\u0000\u0e0c"+
		"\u0e0e\u0005\u0004\u0000\u0000\u0e0d\u0e0a\u0001\u0000\u0000\u0000\u0e0d"+
		"\u0e0b\u0001\u0000\u0000\u0000\u0e0d\u0e0c\u0001\u0000\u0000\u0000\u0e0e"+
		"\u0e0f\u0001\u0000\u0000\u0000\u0e0f\u0e0d\u0001\u0000\u0000\u0000\u0e0f"+
		"\u0e10\u0001\u0000\u0000\u0000\u0e10)\u0001\u0000\u0000\u0000\u00de;\u012b"+
		"\u012f\u0139\u01bd\u01d3\u01d7\u01e2\u0206\u0209\u020c\u020f\u0212\u0215"+
		"\u021a\u0221\u024f\u0252\u0255\u0258\u025b\u025e\u0263\u02a5\u02a8\u02ab"+
		"\u02ae\u02b1\u02b4\u02b9\u02c0\u0308\u030b\u030e\u0311\u0314\u0317\u031c"+
		"\u03d2\u03da\u03dd\u03e0\u03e3\u03e6\u03e9\u03ee\u03fa\u0406\u040e\u0416"+
		"\u0437\u044d\u0458\u05bf\u05c8\u05cb\u05ce\u05d1\u05d4\u05d7\u05dc\u05e7"+
		"\u0602\u060f\u0626\u0631\u0686\u0689\u068c\u068f\u0692\u0695\u069a\u06ed"+
		"\u0710\u0713\u0716\u0719\u071c\u071f\u0724\u0737\u0739\u0744\u0899\u089c"+
		"\u089f\u08a2\u08a5\u08a8\u08ad\u08b9\u08c2\u090f\u0912\u0915\u0918\u091b"+
		"\u091e\u0923\u0936\u0938\u0943\u099a\u09e3\u09e6\u09e9\u09ec\u09ef\u09f2"+
		"\u09f7\u0a06\u0a08\u0a0c\u0a14\u0a16\u0a54\u0a57\u0a5a\u0a5d\u0a60\u0a63"+
		"\u0a68\u0a70\u0a73\u0a76\u0a79\u0a7c\u0a7f\u0a84\u0a91\u0a9a\u0aa4\u0aaf"+
		"\u0ace\u0ad5\u0ad8\u0adb\u0ade\u0ae1\u0ae4\u0ae9\u0af1\u0af4\u0af7\u0afa"+
		"\u0afd\u0b00\u0b05\u0b2a\u0b2e\u0b32\u0b36\u0b3a\u0b42\u0b47\u0b49\u0b4d"+
		"\u0b58\u0b76\u0ba0\u0ba2\u0ba6\u0bb1\u0bd2\u0bd5\u0bd8\u0bdb\u0bde\u0be1"+
		"\u0be6\u0c05\u0c3e\u0c44\u0c5a\u0c65\u0c84\u0c8a\u0c8d\u0c90\u0c93\u0c96"+
		"\u0c99\u0c9e\u0ca4\u0ca7\u0caa\u0cad\u0cb0\u0cb3\u0cb8\u0cc0\u0cd0\u0ced"+
		"\u0d0e\u0d11\u0d14\u0d17\u0d1a\u0d1d\u0d22\u0d2d\u0d32\u0d38\u0d3e\u0d42"+
		"\u0d48\u0d4a\u0d54\u0db4\u0db8\u0dc0\u0dce\u0dd6\u0de1\u0de3\u0de7\u0df1"+
		"\u0e04\u0e06\u0e0d\u0e0f";
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