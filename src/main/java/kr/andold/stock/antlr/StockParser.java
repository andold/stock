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
		RULE_stockDocument = 0, RULE_seibroPriceCurrentEtf = 1, RULE_naverPriceCurrentEtf = 2, 
		RULE_seibroPriceCurrentCompany = 3, RULE_seibroPriceCompany = 4, RULE_seibroPriceEtf = 5, 
		RULE_seibroItemInfoCompany = 6, RULE_seibroItemInfoEtf = 7, RULE_krxPriceCompany = 8, 
		RULE_krxPriceEtf = 9, RULE_krxItemInfoCompany = 10, RULE_krxItemInfoEtf = 11, 
		RULE_krxBasicInfoEtf = 12, RULE_krxBasicInfoCompany = 13, RULE_etfAllPrice = 14, 
		RULE_companyAllPrice = 15, RULE_crawlPriceKrx = 16, RULE_crawlItemEtf = 17, 
		RULE_crawlPriceEtf = 18, RULE_crawlPriceCompany = 19, RULE_crawlItemDetailCompanyThread = 20, 
		RULE_crawlItemDividendTopCompany = 21, RULE_crawlEtfDetailThread = 22, 
		RULE_crawlDividendHistoryEtfThread = 23, RULE_crawlDividendHistoryCompanyThread = 24, 
		RULE_word = 25, RULE_line = 26, RULE_eof = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"stockDocument", "seibroPriceCurrentEtf", "naverPriceCurrentEtf", "seibroPriceCurrentCompany", 
			"seibroPriceCompany", "seibroPriceEtf", "seibroItemInfoCompany", "seibroItemInfoEtf", 
			"krxPriceCompany", "krxPriceEtf", "krxItemInfoCompany", "krxItemInfoEtf", 
			"krxBasicInfoEtf", "krxBasicInfoCompany", "etfAllPrice", "companyAllPrice", 
			"crawlPriceKrx", "crawlItemEtf", "crawlPriceEtf", "crawlPriceCompany", 
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
		public SeibroItemInfoCompanyContext seibroItemInfoCompany() {
			return getRuleContext(SeibroItemInfoCompanyContext.class,0);
		}
		public SeibroItemInfoEtfContext seibroItemInfoEtf() {
			return getRuleContext(SeibroItemInfoEtfContext.class,0);
		}
		public SeibroPriceCompanyContext seibroPriceCompany() {
			return getRuleContext(SeibroPriceCompanyContext.class,0);
		}
		public SeibroPriceEtfContext seibroPriceEtf() {
			return getRuleContext(SeibroPriceEtfContext.class,0);
		}
		public SeibroPriceCurrentCompanyContext seibroPriceCurrentCompany() {
			return getRuleContext(SeibroPriceCurrentCompanyContext.class,0);
		}
		public SeibroPriceCurrentEtfContext seibroPriceCurrentEtf() {
			return getRuleContext(SeibroPriceCurrentEtfContext.class,0);
		}
		public NaverPriceCurrentEtfContext naverPriceCurrentEtf() {
			return getRuleContext(NaverPriceCurrentEtfContext.class,0);
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				crawlDividendHistoryCompanyThread();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				crawlDividendHistoryEtfThread();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				crawlItemDividendTopCompany();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				crawlItemEtf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				crawlItemDetailCompanyThread();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				crawlEtfDetailThread();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(62);
				crawlPriceCompany();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(63);
				crawlPriceEtf();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(64);
				crawlPriceKrx();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(65);
				companyAllPrice();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(66);
				etfAllPrice();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(67);
				krxBasicInfoCompany();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(68);
				krxBasicInfoEtf();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(69);
				krxItemInfoCompany();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(70);
				krxItemInfoEtf();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(71);
				krxPriceCompany();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(72);
				krxPriceEtf();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(73);
				seibroItemInfoCompany();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(74);
				seibroItemInfoEtf();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(75);
				seibroPriceCompany();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(76);
				seibroPriceEtf();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(77);
				seibroPriceCurrentCompany();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(78);
				seibroPriceCurrentEtf();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(79);
				naverPriceCurrentEtf();
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

	public static class SeibroPriceCurrentEtfContext extends ParserRuleContext {
		public Token base;
		public WordContext code;
		public Token closing;
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
		public SeibroPriceCurrentEtfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seibroPriceCurrentEtf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterSeibroPriceCurrentEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitSeibroPriceCurrentEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitSeibroPriceCurrentEtf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeibroPriceCurrentEtfContext seibroPriceCurrentEtf() throws RecognitionException {
		SeibroPriceCurrentEtfContext _localctx = new SeibroPriceCurrentEtfContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_seibroPriceCurrentEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(KEYWORD);
			setState(83);
			match(TAB);
			setState(84);
			match(WORD);
			setState(85);
			match(TAB);
			setState(86);
			match(WORD);
			setState(87);
			match(WORD);
			setState(88);
			match(WORD);
			setState(89);
			match(TAB);
			setState(90);
			match(WORD);
			setState(91);
			match(NEWLINE);
			setState(202); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				match(WORD);
				setState(93);
				match(DATE);
				setState(94);
				match(TAB);
				setState(95);
				match(NEWLINE);
				setState(96);
				match(WORD);
				setState(97);
				match(DATE);
				setState(98);
				match(TAB);
				setState(99);
				match(WORD);
				setState(100);
				match(TAB);
				setState(101);
				match(WORD);
				setState(102);
				match(TAB);
				setState(103);
				match(WORD);
				setState(104);
				match(TAB);
				setState(105);
				match(WORD);
				setState(106);
				match(TAB);
				setState(107);
				match(WORD);
				setState(108);
				match(TAB);
				setState(109);
				match(WORD);
				setState(110);
				match(TAB);
				setState(111);
				match(WORD);
				setState(112);
				match(TAB);
				setState(113);
				match(WORD);
				setState(114);
				match(TAB);
				setState(115);
				match(WORD);
				setState(116);
				match(TAB);
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
				match(TAB);
				setState(125);
				match(WORD);
				setState(126);
				match(TAB);
				setState(127);
				match(WORD);
				setState(128);
				match(TAB);
				setState(129);
				match(WORD);
				setState(130);
				match(TAB);
				setState(131);
				match(WORD);
				setState(132);
				match(TAB);
				setState(133);
				match(NEWLINE);
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						{
						setState(134);
						match(WORD);
						setState(135);
						((SeibroPriceCurrentEtfContext)_localctx).base = match(DATE);
						setState(136);
						match(TAB);
						setState(137);
						match(TAB);
						setState(139); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(138);
							word();
							}
							}
							setState(141); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(143);
						match(TAB);
						setState(144);
						((SeibroPriceCurrentEtfContext)_localctx).code = word();
						setState(145);
						match(TAB);
						setState(147); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(146);
							word();
							}
							}
							setState(149); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(151);
						match(TAB);
						setState(152);
						match(NUMBER);
						setState(153);
						match(TAB);
						setState(154);
						((SeibroPriceCurrentEtfContext)_localctx).closing = match(NUMBER);
						setState(155);
						match(TAB);
						setState(156);
						((SeibroPriceCurrentEtfContext)_localctx).volume = match(NUMBER);
						setState(157);
						match(TAB);
						setState(158);
						match(NUMBER);
						setState(159);
						match(TAB);
						setState(160);
						match(NUMBER);
						setState(161);
						match(TAB);
						setState(163);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(162);
							match(NUMBER);
							}
						}

						setState(165);
						match(TAB);
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(166);
							match(NUMBER);
							}
						}

						setState(169);
						match(TAB);
						setState(170);
						match(NUMBER);
						setState(171);
						match(TAB);
						setState(173);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(172);
							match(NUMBER);
							}
						}

						setState(175);
						match(TAB);
						setState(177);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(176);
							match(NUMBER);
							}
						}

						setState(179);
						match(TAB);
						setState(181);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(180);
							match(NUMBER);
							}
						}

						setState(183);
						match(TAB);
						setState(184);
						match(NUMBER);
						setState(185);
						match(TAB);
						setState(186);
						match(WORD);
						setState(187);
						match(TAB);
						setState(188);
						match(NEWLINE);

										ParserService.price(20240112
											, (((SeibroPriceCurrentEtfContext)_localctx).code!=null?_input.getText(((SeibroPriceCurrentEtfContext)_localctx).code.start,((SeibroPriceCurrentEtfContext)_localctx).code.stop):null)
											, (((SeibroPriceCurrentEtfContext)_localctx).base!=null?((SeibroPriceCurrentEtfContext)_localctx).base.getText():null), (((SeibroPriceCurrentEtfContext)_localctx).closing!=null?((SeibroPriceCurrentEtfContext)_localctx).closing.getText():null), null, null, null, (((SeibroPriceCurrentEtfContext)_localctx).volume!=null?((SeibroPriceCurrentEtfContext)_localctx).volume.getText():null)
										);
									
						}
						}
						} 
					}
					setState(195);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(196);
				match(WORD);
				setState(197);
				match(TAB);
				setState(198);
				match(WORD);
				setState(199);
				match(TAB);
				setState(200);
				match(DATE);
				setState(201);
				match(NEWLINE);
				}
				}
				setState(204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(206);
			match(KEYWORD);
			setState(207);
			match(TAB);
			setState(208);
			match(WORD);
			setState(209);
			match(TAB);
			setState(210);
			match(WORD);
			setState(211);
			match(WORD);
			setState(212);
			match(WORD);
			setState(213);
			match(TAB);
			setState(214);
			match(WORD);
			setState(215);
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

	public static class NaverPriceCurrentEtfContext extends ParserRuleContext {
		public Token base;
		public Token code;
		public Token closing;
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
		public NaverPriceCurrentEtfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naverPriceCurrentEtf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterNaverPriceCurrentEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitNaverPriceCurrentEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitNaverPriceCurrentEtf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NaverPriceCurrentEtfContext naverPriceCurrentEtf() throws RecognitionException {
		NaverPriceCurrentEtfContext _localctx = new NaverPriceCurrentEtfContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_naverPriceCurrentEtf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(KEYWORD);
			setState(218);
			match(TAB);
			setState(219);
			match(WORD);
			setState(220);
			match(TAB);
			setState(221);
			match(WORD);
			setState(222);
			match(WORD);
			setState(223);
			match(WORD);
			setState(224);
			match(WORD);
			setState(225);
			match(WORD);
			setState(226);
			match(TAB);
			setState(227);
			match(WORD);
			setState(228);
			match(NEWLINE);
			setState(310); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(229);
				match(DATE);
				setState(230);
				match(TAB);
				setState(231);
				match(WORD);
				setState(232);
				match(TAB);
				setState(233);
				match(WORD);
				setState(234);
				match(TAB);
				setState(235);
				match(WORD);
				setState(236);
				match(TAB);
				setState(237);
				match(WORD);
				setState(238);
				match(TAB);
				setState(239);
				match(WORD);
				setState(240);
				match(TAB);
				setState(241);
				match(WORD);
				setState(242);
				match(TAB);
				setState(243);
				match(WORD);
				setState(244);
				match(TAB);
				setState(245);
				match(WORD);
				setState(246);
				match(TAB);
				setState(247);
				match(WORD);
				setState(248);
				match(TAB);
				setState(249);
				match(WORD);
				setState(250);
				match(TAB);
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
				match(TAB);
				setState(259);
				match(WORD);
				setState(260);
				match(TAB);
				setState(261);
				match(WORD);
				setState(262);
				match(TAB);
				setState(263);
				match(WORD);
				setState(264);
				match(TAB);
				setState(265);
				match(NEWLINE);
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DATE) {
					{
					setState(299);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						{
						setState(266);
						match(DATE);
						setState(267);
						match(TAB);
						setState(268);
						match(TAB);
						setState(269);
						match(NEWLINE);
						}
						}
						break;
					case 2:
						{
						{
						setState(270);
						((NaverPriceCurrentEtfContext)_localctx).base = match(DATE);
						setState(271);
						match(TAB);
						setState(272);
						((NaverPriceCurrentEtfContext)_localctx).code = match(NUMBER);
						setState(273);
						match(TAB);
						setState(275); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(274);
							word();
							}
							}
							setState(277); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(279);
						match(TAB);
						setState(280);
						((NaverPriceCurrentEtfContext)_localctx).closing = match(NUMBER);
						setState(281);
						match(TAB);
						setState(282);
						match(NUMBER);
						setState(283);
						match(TAB);
						setState(284);
						match(WORD);
						setState(285);
						match(TAB);
						setState(286);
						match(NUMBER);
						setState(287);
						match(TAB);
						setState(288);
						match(WORD);
						setState(289);
						match(TAB);
						setState(290);
						((NaverPriceCurrentEtfContext)_localctx).volume = match(NUMBER);
						setState(291);
						match(TAB);
						setState(292);
						match(NUMBER);
						setState(293);
						match(TAB);
						setState(294);
						match(NUMBER);
						setState(295);
						match(TAB);
						setState(296);
						match(NEWLINE);

										ParserService.price(20240112
											, (((NaverPriceCurrentEtfContext)_localctx).code!=null?((NaverPriceCurrentEtfContext)_localctx).code.getText():null)
											, (((NaverPriceCurrentEtfContext)_localctx).base!=null?((NaverPriceCurrentEtfContext)_localctx).base.getText():null), (((NaverPriceCurrentEtfContext)_localctx).closing!=null?((NaverPriceCurrentEtfContext)_localctx).closing.getText():null), null, null, null, (((NaverPriceCurrentEtfContext)_localctx).volume!=null?((NaverPriceCurrentEtfContext)_localctx).volume.getText():null)
										);
									
						}
						}
						break;
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(304);
				match(WORD);
				setState(305);
				match(TAB);
				setState(306);
				match(WORD);
				setState(307);
				match(TAB);
				setState(308);
				match(DATE);
				setState(309);
				match(NEWLINE);
				}
				}
				setState(312); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DATE );
			setState(314);
			match(KEYWORD);
			setState(315);
			match(TAB);
			setState(316);
			match(WORD);
			setState(317);
			match(TAB);
			setState(318);
			match(WORD);
			setState(319);
			match(WORD);
			setState(320);
			match(WORD);
			setState(321);
			match(WORD);
			setState(322);
			match(WORD);
			setState(323);
			match(TAB);
			setState(324);
			match(WORD);
			setState(325);
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

	public static class SeibroPriceCurrentCompanyContext extends ParserRuleContext {
		public Token base;
		public WordContext code;
		public Token closing;
		public Token volume;
		public Token market;
		public Token high;
		public Token low;
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
		public SeibroPriceCurrentCompanyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seibroPriceCurrentCompany; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterSeibroPriceCurrentCompany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitSeibroPriceCurrentCompany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitSeibroPriceCurrentCompany(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeibroPriceCurrentCompanyContext seibroPriceCurrentCompany() throws RecognitionException {
		SeibroPriceCurrentCompanyContext _localctx = new SeibroPriceCurrentCompanyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_seibroPriceCurrentCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(KEYWORD);
			setState(328);
			match(TAB);
			setState(329);
			match(WORD);
			setState(330);
			match(TAB);
			setState(331);
			match(WORD);
			setState(332);
			match(WORD);
			setState(333);
			match(WORD);
			setState(334);
			match(WORD);
			setState(335);
			match(WORD);
			setState(336);
			match(TAB);
			setState(337);
			match(WORD);
			setState(338);
			match(NEWLINE);
			setState(417); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(339);
				match(WORD);
				setState(340);
				match(WORD);
				setState(341);
				match(DATE);
				setState(342);
				match(TAB);
				setState(343);
				match(WORD);
				setState(344);
				match(WORD);
				setState(345);
				match(WORD);
				setState(346);
				match(WORD);
				setState(347);
				match(WORD);
				setState(348);
				match(WORD);
				setState(349);
				match(WORD);
				setState(350);
				match(WORD);
				setState(351);
				match(NEWLINE);
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(352);
						match(WORD);
						setState(353);
						match(WORD);
						setState(354);
						((SeibroPriceCurrentCompanyContext)_localctx).base = match(DATE);
						setState(355);
						match(TAB);
						setState(356);
						((SeibroPriceCurrentCompanyContext)_localctx).code = word();
						setState(357);
						match(NEWLINE);
						setState(358);
						match(WORD);
						setState(359);
						match(WORD);
						setState(360);
						match(DATE);
						setState(361);
						match(TAB);
						setState(363); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(362);
							word();
							}
							}
							setState(365); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(367);
						match(NEWLINE);
						setState(368);
						match(WORD);
						setState(369);
						match(WORD);
						setState(370);
						match(DATE);
						setState(371);
						match(TAB);
						setState(372);
						match(WORD);
						setState(373);
						match(NEWLINE);
						setState(374);
						match(WORD);
						setState(375);
						match(WORD);
						setState(376);
						match(DATE);
						setState(377);
						match(TAB);
						setState(378);
						((SeibroPriceCurrentCompanyContext)_localctx).closing = match(NUMBER);
						setState(379);
						match(NEWLINE);
						setState(380);
						match(WORD);
						setState(381);
						match(WORD);
						setState(382);
						match(DATE);
						setState(383);
						match(TAB);
						setState(384);
						((SeibroPriceCurrentCompanyContext)_localctx).volume = match(NUMBER);
						setState(385);
						match(NEWLINE);
						setState(386);
						match(WORD);
						setState(387);
						match(WORD);
						setState(388);
						match(DATE);
						setState(389);
						match(TAB);
						setState(390);
						((SeibroPriceCurrentCompanyContext)_localctx).market = match(NUMBER);
						setState(391);
						match(NEWLINE);
						setState(392);
						match(WORD);
						setState(393);
						match(WORD);
						setState(394);
						match(DATE);
						setState(395);
						match(TAB);
						setState(396);
						((SeibroPriceCurrentCompanyContext)_localctx).high = match(NUMBER);
						setState(397);
						match(NEWLINE);
						setState(398);
						match(WORD);
						setState(399);
						match(WORD);
						setState(400);
						match(DATE);
						setState(401);
						match(TAB);
						setState(402);
						((SeibroPriceCurrentCompanyContext)_localctx).low = match(NUMBER);
						setState(403);
						match(NEWLINE);

										ParserService.price(20240112
											, (((SeibroPriceCurrentCompanyContext)_localctx).code!=null?_input.getText(((SeibroPriceCurrentCompanyContext)_localctx).code.start,((SeibroPriceCurrentCompanyContext)_localctx).code.stop):null)
											, (((SeibroPriceCurrentCompanyContext)_localctx).base!=null?((SeibroPriceCurrentCompanyContext)_localctx).base.getText():null), (((SeibroPriceCurrentCompanyContext)_localctx).closing!=null?((SeibroPriceCurrentCompanyContext)_localctx).closing.getText():null), (((SeibroPriceCurrentCompanyContext)_localctx).market!=null?((SeibroPriceCurrentCompanyContext)_localctx).market.getText():null), (((SeibroPriceCurrentCompanyContext)_localctx).high!=null?((SeibroPriceCurrentCompanyContext)_localctx).high.getText():null), (((SeibroPriceCurrentCompanyContext)_localctx).low!=null?((SeibroPriceCurrentCompanyContext)_localctx).low.getText():null), (((SeibroPriceCurrentCompanyContext)_localctx).volume!=null?((SeibroPriceCurrentCompanyContext)_localctx).volume.getText():null)
										);
									
						}
						} 
					}
					setState(410);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(411);
				match(WORD);
				setState(412);
				match(TAB);
				setState(413);
				match(WORD);
				setState(414);
				match(TAB);
				setState(415);
				match(DATE);
				setState(416);
				match(NEWLINE);
				}
				}
				setState(419); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(421);
			match(KEYWORD);
			setState(422);
			match(TAB);
			setState(423);
			match(WORD);
			setState(424);
			match(TAB);
			setState(425);
			match(WORD);
			setState(426);
			match(WORD);
			setState(427);
			match(WORD);
			setState(428);
			match(WORD);
			setState(429);
			match(WORD);
			setState(430);
			match(TAB);
			setState(431);
			match(WORD);
			setState(432);
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

	public static class SeibroPriceCompanyContext extends ParserRuleContext {
		public WordContext code;
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
		public List<TerminalNode> DATE() { return getTokens(StockParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(StockParser.DATE, i);
		}
		public SeibroPriceCompanyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seibroPriceCompany; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterSeibroPriceCompany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitSeibroPriceCompany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitSeibroPriceCompany(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeibroPriceCompanyContext seibroPriceCompany() throws RecognitionException {
		SeibroPriceCompanyContext _localctx = new SeibroPriceCompanyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_seibroPriceCompany);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(KEYWORD);
			setState(435);
			match(TAB);
			setState(436);
			match(WORD);
			setState(437);
			match(TAB);
			setState(438);
			match(WORD);
			setState(439);
			match(WORD);
			setState(440);
			match(WORD);
			setState(441);
			match(WORD);
			setState(442);
			match(WORD);
			setState(443);
			match(TAB);
			setState(444);
			match(WORD);
			setState(445);
			match(NEWLINE);
			setState(496); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(446);
					word();
					setState(447);
					match(TAB);
					setState(448);
					match(NEWLINE);
					setState(449);
					match(NUMBER);
					setState(450);
					match(TAB);
					setState(451);
					match(WORD);
					setState(452);
					match(TAB);
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
					match(TAB);
					setState(459);
					match(WORD);
					setState(460);
					match(TAB);
					setState(461);
					match(WORD);
					setState(462);
					match(TAB);
					setState(463);
					match(WORD);
					setState(464);
					match(TAB);
					setState(465);
					match(NEWLINE);
					setState(485); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(466);
							((SeibroPriceCompanyContext)_localctx).code = word();
							setState(467);
							match(TAB);
							setState(468);
							((SeibroPriceCompanyContext)_localctx).base = match(DATE);
							setState(469);
							match(TAB);
							setState(470);
							((SeibroPriceCompanyContext)_localctx).closing = match(NUMBER);
							setState(471);
							match(TAB);
							setState(472);
							match(NUMBER);
							setState(473);
							match(TAB);
							setState(474);
							((SeibroPriceCompanyContext)_localctx).market = match(NUMBER);
							setState(475);
							match(TAB);
							setState(476);
							((SeibroPriceCompanyContext)_localctx).high = match(NUMBER);
							setState(477);
							match(TAB);
							setState(478);
							((SeibroPriceCompanyContext)_localctx).low = match(NUMBER);
							setState(479);
							match(TAB);
							setState(480);
							((SeibroPriceCompanyContext)_localctx).volume = match(NUMBER);
							setState(481);
							match(TAB);
							setState(482);
							match(NEWLINE);

											ParserService.price(20240112
												, (((SeibroPriceCompanyContext)_localctx).code!=null?_input.getText(((SeibroPriceCompanyContext)_localctx).code.start,((SeibroPriceCompanyContext)_localctx).code.stop):null)
												, (((SeibroPriceCompanyContext)_localctx).base!=null?((SeibroPriceCompanyContext)_localctx).base.getText():null), (((SeibroPriceCompanyContext)_localctx).closing!=null?((SeibroPriceCompanyContext)_localctx).closing.getText():null), (((SeibroPriceCompanyContext)_localctx).market!=null?((SeibroPriceCompanyContext)_localctx).market.getText():null), (((SeibroPriceCompanyContext)_localctx).high!=null?((SeibroPriceCompanyContext)_localctx).high.getText():null), (((SeibroPriceCompanyContext)_localctx).low!=null?((SeibroPriceCompanyContext)_localctx).low.getText():null), (((SeibroPriceCompanyContext)_localctx).volume!=null?((SeibroPriceCompanyContext)_localctx).volume.getText():null)
											);
										
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(487); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(489);
					match(WORD);
					setState(490);
					match(TAB);
					setState(491);
					match(WORD);
					setState(492);
					match(TAB);
					setState(493);
					match(DATE);
					setState(494);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(498); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(500);
			match(KEYWORD);
			setState(501);
			match(TAB);
			setState(502);
			match(WORD);
			setState(503);
			match(TAB);
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

	public static class SeibroPriceEtfContext extends ParserRuleContext {
		public WordContext code;
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
		public List<TerminalNode> DATE() { return getTokens(StockParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(StockParser.DATE, i);
		}
		public SeibroPriceEtfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seibroPriceEtf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterSeibroPriceEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitSeibroPriceEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitSeibroPriceEtf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeibroPriceEtfContext seibroPriceEtf() throws RecognitionException {
		SeibroPriceEtfContext _localctx = new SeibroPriceEtfContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_seibroPriceEtf);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(KEYWORD);
			setState(514);
			match(TAB);
			setState(515);
			match(WORD);
			setState(516);
			match(TAB);
			setState(517);
			match(WORD);
			setState(518);
			match(WORD);
			setState(519);
			match(WORD);
			setState(520);
			match(WORD);
			setState(521);
			match(WORD);
			setState(522);
			match(WORD);
			setState(523);
			match(WORD);
			setState(524);
			match(TAB);
			setState(525);
			match(WORD);
			setState(526);
			match(NEWLINE);
			setState(593); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(527);
					word();
					setState(528);
					match(TAB);
					setState(529);
					match(NEWLINE);
					setState(530);
					match(NUMBER);
					setState(531);
					match(TAB);
					setState(532);
					match(WORD);
					setState(533);
					match(TAB);
					setState(534);
					match(WORD);
					setState(535);
					match(TAB);
					setState(536);
					match(WORD);
					setState(537);
					match(TAB);
					setState(538);
					match(WORD);
					setState(539);
					match(TAB);
					setState(540);
					match(WORD);
					setState(541);
					match(TAB);
					setState(542);
					match(WORD);
					setState(543);
					match(TAB);
					setState(544);
					match(WORD);
					setState(545);
					match(TAB);
					setState(546);
					match(WORD);
					setState(547);
					match(TAB);
					setState(548);
					match(NEWLINE);
					setState(582); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(582);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
							case 1:
								{
								{
								setState(549);
								word();
								setState(550);
								match(TAB);
								setState(551);
								match(TAB);
								setState(552);
								match(TAB);
								setState(553);
								match(TAB);
								setState(554);
								match(TAB);
								setState(555);
								match(TAB);
								setState(556);
								match(TAB);
								setState(557);
								match(TAB);
								setState(558);
								match(TAB);
								setState(559);
								match(NEWLINE);
								}
								}
								break;
							case 2:
								{
								{
								setState(561);
								((SeibroPriceEtfContext)_localctx).code = word();
								setState(562);
								match(TAB);
								setState(563);
								((SeibroPriceEtfContext)_localctx).base = match(DATE);
								setState(564);
								match(TAB);
								setState(565);
								((SeibroPriceEtfContext)_localctx).closing = match(NUMBER);
								setState(566);
								match(TAB);
								setState(567);
								match(NUMBER);
								setState(568);
								match(TAB);
								setState(569);
								((SeibroPriceEtfContext)_localctx).market = match(NUMBER);
								setState(570);
								match(TAB);
								setState(571);
								((SeibroPriceEtfContext)_localctx).high = match(NUMBER);
								setState(572);
								match(TAB);
								setState(573);
								((SeibroPriceEtfContext)_localctx).low = match(NUMBER);
								setState(574);
								match(TAB);
								setState(575);
								((SeibroPriceEtfContext)_localctx).volume = match(NUMBER);
								setState(576);
								match(TAB);
								setState(577);
								match(NUMBER);
								setState(578);
								match(TAB);
								setState(579);
								match(NEWLINE);

												ParserService.price(20240112
													, (((SeibroPriceEtfContext)_localctx).code!=null?_input.getText(((SeibroPriceEtfContext)_localctx).code.start,((SeibroPriceEtfContext)_localctx).code.stop):null)
													, (((SeibroPriceEtfContext)_localctx).base!=null?((SeibroPriceEtfContext)_localctx).base.getText():null), (((SeibroPriceEtfContext)_localctx).closing!=null?((SeibroPriceEtfContext)_localctx).closing.getText():null), (((SeibroPriceEtfContext)_localctx).market!=null?((SeibroPriceEtfContext)_localctx).market.getText():null), (((SeibroPriceEtfContext)_localctx).high!=null?((SeibroPriceEtfContext)_localctx).high.getText():null), (((SeibroPriceEtfContext)_localctx).low!=null?((SeibroPriceEtfContext)_localctx).low.getText():null), (((SeibroPriceEtfContext)_localctx).volume!=null?((SeibroPriceEtfContext)_localctx).volume.getText():null)
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
						setState(584); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(586);
					match(WORD);
					setState(587);
					match(TAB);
					setState(588);
					match(WORD);
					setState(589);
					match(TAB);
					setState(590);
					match(DATE);
					setState(591);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(595); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(597);
			match(KEYWORD);
			setState(598);
			match(TAB);
			setState(599);
			match(WORD);
			setState(600);
			match(TAB);
			setState(601);
			match(WORD);
			setState(602);
			match(WORD);
			setState(603);
			match(WORD);
			setState(604);
			match(WORD);
			setState(605);
			match(WORD);
			setState(606);
			match(WORD);
			setState(607);
			match(WORD);
			setState(608);
			match(TAB);
			setState(609);
			match(WORD);
			setState(610);
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

	public static class SeibroItemInfoCompanyContext extends ParserRuleContext {
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
		public Token volumeOfListedShares;
		public Token ipoOpen;
		public Token ipoClose;
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
		public SeibroItemInfoCompanyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seibroItemInfoCompany; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterSeibroItemInfoCompany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitSeibroItemInfoCompany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitSeibroItemInfoCompany(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeibroItemInfoCompanyContext seibroItemInfoCompany() throws RecognitionException {
		SeibroItemInfoCompanyContext _localctx = new SeibroItemInfoCompanyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_seibroItemInfoCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(KEYWORD);
			setState(613);
			match(TAB);
			setState(614);
			match(WORD);
			setState(615);
			match(TAB);
			setState(616);
			match(WORD);
			setState(617);
			match(WORD);
			setState(618);
			match(WORD);
			setState(619);
			match(WORD);
			setState(620);
			match(WORD);
			setState(621);
			match(TAB);
			setState(622);
			match(WORD);
			setState(623);
			match(NEWLINE);
			setState(686); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					{
					setState(624);
					match(KEYWORD);
					setState(625);
					match(TAB);
					setState(626);
					((SeibroItemInfoCompanyContext)_localctx).code = match(NUMBER);
					setState(627);
					match(TAB);
					setState(628);
					((SeibroItemInfoCompanyContext)_localctx).type = match(WORD);
					setState(629);
					match(TAB);
					setState(630);
					((SeibroItemInfoCompanyContext)_localctx).symbol = word();
					setState(632);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(631);
						((SeibroItemInfoCompanyContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(635);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(634);
						((SeibroItemInfoCompanyContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(638);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(637);
						((SeibroItemInfoCompanyContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(641);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(640);
						((SeibroItemInfoCompanyContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(644);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(643);
						((SeibroItemInfoCompanyContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(647);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(646);
						((SeibroItemInfoCompanyContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(652);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(649);
						((SeibroItemInfoCompanyContext)_localctx).symbol7 = word();
						}
						}
						setState(654);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(655);
					match(NEWLINE);
					setState(656);
					match(KEYWORD);
					setState(657);
					match(TAB);
					setState(658);
					((SeibroItemInfoCompanyContext)_localctx).category = match(STRING);
					setState(659);
					match(NEWLINE);
					setState(660);
					match(KEYWORD);
					setState(661);
					match(TAB);
					setState(662);
					((SeibroItemInfoCompanyContext)_localctx).fics = match(STRING);
					setState(663);
					match(NEWLINE);
					setState(664);
					match(KEYWORD);
					setState(665);
					match(TAB);
					setState(666);
					((SeibroItemInfoCompanyContext)_localctx).volumeOfListedShares = match(NUMBER);
					setState(667);
					match(WORD);
					setState(668);
					match(NEWLINE);
					setState(669);
					match(KEYWORD);
					setState(670);
					match(TAB);
					setState(671);
					((SeibroItemInfoCompanyContext)_localctx).ipoOpen = match(DATE);
					setState(672);
					match(NEWLINE);
					setState(673);
					match(KEYWORD);
					setState(674);
					match(TAB);
					setState(675);
					((SeibroItemInfoCompanyContext)_localctx).ipoClose = match(DATE);
					setState(676);
					match(NEWLINE);

									ParserService.item(20240112
										, (((SeibroItemInfoCompanyContext)_localctx).code!=null?((SeibroItemInfoCompanyContext)_localctx).code.getText():null)
										, (((SeibroItemInfoCompanyContext)_localctx).symbol!=null?_input.getText(((SeibroItemInfoCompanyContext)_localctx).symbol.start,((SeibroItemInfoCompanyContext)_localctx).symbol.stop):null), (((SeibroItemInfoCompanyContext)_localctx).symbol1!=null?_input.getText(((SeibroItemInfoCompanyContext)_localctx).symbol1.start,((SeibroItemInfoCompanyContext)_localctx).symbol1.stop):null), (((SeibroItemInfoCompanyContext)_localctx).symbol2!=null?_input.getText(((SeibroItemInfoCompanyContext)_localctx).symbol2.start,((SeibroItemInfoCompanyContext)_localctx).symbol2.stop):null), (((SeibroItemInfoCompanyContext)_localctx).symbol3!=null?_input.getText(((SeibroItemInfoCompanyContext)_localctx).symbol3.start,((SeibroItemInfoCompanyContext)_localctx).symbol3.stop):null), (((SeibroItemInfoCompanyContext)_localctx).symbol4!=null?_input.getText(((SeibroItemInfoCompanyContext)_localctx).symbol4.start,((SeibroItemInfoCompanyContext)_localctx).symbol4.stop):null), (((SeibroItemInfoCompanyContext)_localctx).symbol5!=null?_input.getText(((SeibroItemInfoCompanyContext)_localctx).symbol5.start,((SeibroItemInfoCompanyContext)_localctx).symbol5.stop):null), (((SeibroItemInfoCompanyContext)_localctx).symbol6!=null?_input.getText(((SeibroItemInfoCompanyContext)_localctx).symbol6.start,((SeibroItemInfoCompanyContext)_localctx).symbol6.stop):null), (((SeibroItemInfoCompanyContext)_localctx).symbol7!=null?_input.getText(((SeibroItemInfoCompanyContext)_localctx).symbol7.start,((SeibroItemInfoCompanyContext)_localctx).symbol7.stop):null)
										, (((SeibroItemInfoCompanyContext)_localctx).category!=null?((SeibroItemInfoCompanyContext)_localctx).category.getText():null), (((SeibroItemInfoCompanyContext)_localctx).fics!=null?((SeibroItemInfoCompanyContext)_localctx).fics.getText():null), null, null, null, null, null, null
										, (((SeibroItemInfoCompanyContext)_localctx).type!=null?((SeibroItemInfoCompanyContext)_localctx).type.getText():null)
										, (((SeibroItemInfoCompanyContext)_localctx).ipoOpen!=null?((SeibroItemInfoCompanyContext)_localctx).ipoOpen.getText():null)
										, (((SeibroItemInfoCompanyContext)_localctx).ipoClose!=null?((SeibroItemInfoCompanyContext)_localctx).ipoClose.getText():null)
										, (((SeibroItemInfoCompanyContext)_localctx).volumeOfListedShares!=null?((SeibroItemInfoCompanyContext)_localctx).volumeOfListedShares.getText():null)
										, null
									);
								
					}
					setState(679);
					match(WORD);
					setState(680);
					match(TAB);
					setState(681);
					match(WORD);
					setState(682);
					match(TAB);
					setState(683);
					match(DATE);
					setState(684);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(688); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(690);
			match(KEYWORD);
			setState(691);
			match(TAB);
			setState(692);
			match(WORD);
			setState(693);
			match(TAB);
			setState(694);
			match(WORD);
			setState(695);
			match(WORD);
			setState(696);
			match(WORD);
			setState(697);
			match(WORD);
			setState(698);
			match(WORD);
			setState(699);
			match(TAB);
			setState(700);
			match(WORD);
			setState(701);
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

	public static class SeibroItemInfoEtfContext extends ParserRuleContext {
		public WordContext code;
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
		public Token volumeOfListedShares;
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
		public SeibroItemInfoEtfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seibroItemInfoEtf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterSeibroItemInfoEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitSeibroItemInfoEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitSeibroItemInfoEtf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeibroItemInfoEtfContext seibroItemInfoEtf() throws RecognitionException {
		SeibroItemInfoEtfContext _localctx = new SeibroItemInfoEtfContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_seibroItemInfoEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(KEYWORD);
			setState(704);
			match(TAB);
			setState(705);
			match(WORD);
			setState(706);
			match(TAB);
			setState(707);
			match(WORD);
			setState(708);
			match(WORD);
			setState(709);
			match(WORD);
			setState(710);
			match(WORD);
			setState(711);
			match(WORD);
			setState(712);
			match(TAB);
			setState(713);
			match(WORD);
			setState(714);
			match(NEWLINE);
			setState(801); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(790); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(715);
						match(KEYWORD);
						setState(716);
						match(TAB);
						setState(717);
						((SeibroItemInfoEtfContext)_localctx).code = word();
						setState(718);
						match(TAB);
						setState(720); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(719);
							word();
							}
							}
							setState(722); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(724);
						match(NEWLINE);
						setState(725);
						((SeibroItemInfoEtfContext)_localctx).symbol = word();
						setState(727);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
						case 1:
							{
							setState(726);
							((SeibroItemInfoEtfContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(730);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
						case 1:
							{
							setState(729);
							((SeibroItemInfoEtfContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(733);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(732);
							((SeibroItemInfoEtfContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(736);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
						case 1:
							{
							setState(735);
							((SeibroItemInfoEtfContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(739);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
						case 1:
							{
							setState(738);
							((SeibroItemInfoEtfContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(742);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
						case 1:
							{
							setState(741);
							((SeibroItemInfoEtfContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(747);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(744);
							((SeibroItemInfoEtfContext)_localctx).symbol7 = word();
							}
							}
							setState(749);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(750);
						match(NEWLINE);
						setState(751);
						((SeibroItemInfoEtfContext)_localctx).category = word();
						setState(753);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
						case 1:
							{
							setState(752);
							((SeibroItemInfoEtfContext)_localctx).category1 = word();
							}
							break;
						}
						setState(756);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
						case 1:
							{
							setState(755);
							((SeibroItemInfoEtfContext)_localctx).category2 = word();
							}
							break;
						}
						setState(759);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
						case 1:
							{
							setState(758);
							((SeibroItemInfoEtfContext)_localctx).category3 = word();
							}
							break;
						}
						setState(762);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
						case 1:
							{
							setState(761);
							((SeibroItemInfoEtfContext)_localctx).category4 = word();
							}
							break;
						}
						setState(765);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
						case 1:
							{
							setState(764);
							((SeibroItemInfoEtfContext)_localctx).category5 = word();
							}
							break;
						}
						setState(768);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
						case 1:
							{
							setState(767);
							((SeibroItemInfoEtfContext)_localctx).category6 = word();
							}
							break;
						}
						setState(773);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(770);
							((SeibroItemInfoEtfContext)_localctx).category7 = word();
							}
							}
							setState(775);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(776);
						match(NEWLINE);
						setState(777);
						((SeibroItemInfoEtfContext)_localctx).ipo = match(DATE);
						setState(779); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(778);
							word();
							}
							}
							setState(781); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(783);
						match(NEWLINE);
						setState(784);
						((SeibroItemInfoEtfContext)_localctx).volumeOfListedShares = match(NUMBER);
						setState(785);
						match(NEWLINE);
						setState(786);
						((SeibroItemInfoEtfContext)_localctx).fee = word();
						setState(787);
						match(NEWLINE);

										ParserService.item(20240112
											, (((SeibroItemInfoEtfContext)_localctx).code!=null?_input.getText(((SeibroItemInfoEtfContext)_localctx).code.start,((SeibroItemInfoEtfContext)_localctx).code.stop):null)
											, (((SeibroItemInfoEtfContext)_localctx).symbol!=null?_input.getText(((SeibroItemInfoEtfContext)_localctx).symbol.start,((SeibroItemInfoEtfContext)_localctx).symbol.stop):null), (((SeibroItemInfoEtfContext)_localctx).symbol1!=null?_input.getText(((SeibroItemInfoEtfContext)_localctx).symbol1.start,((SeibroItemInfoEtfContext)_localctx).symbol1.stop):null), (((SeibroItemInfoEtfContext)_localctx).symbol2!=null?_input.getText(((SeibroItemInfoEtfContext)_localctx).symbol2.start,((SeibroItemInfoEtfContext)_localctx).symbol2.stop):null), (((SeibroItemInfoEtfContext)_localctx).symbol3!=null?_input.getText(((SeibroItemInfoEtfContext)_localctx).symbol3.start,((SeibroItemInfoEtfContext)_localctx).symbol3.stop):null), (((SeibroItemInfoEtfContext)_localctx).symbol4!=null?_input.getText(((SeibroItemInfoEtfContext)_localctx).symbol4.start,((SeibroItemInfoEtfContext)_localctx).symbol4.stop):null), (((SeibroItemInfoEtfContext)_localctx).symbol5!=null?_input.getText(((SeibroItemInfoEtfContext)_localctx).symbol5.start,((SeibroItemInfoEtfContext)_localctx).symbol5.stop):null), (((SeibroItemInfoEtfContext)_localctx).symbol6!=null?_input.getText(((SeibroItemInfoEtfContext)_localctx).symbol6.start,((SeibroItemInfoEtfContext)_localctx).symbol6.stop):null), (((SeibroItemInfoEtfContext)_localctx).symbol7!=null?_input.getText(((SeibroItemInfoEtfContext)_localctx).symbol7.start,((SeibroItemInfoEtfContext)_localctx).symbol7.stop):null)
											, (((SeibroItemInfoEtfContext)_localctx).category!=null?_input.getText(((SeibroItemInfoEtfContext)_localctx).category.start,((SeibroItemInfoEtfContext)_localctx).category.stop):null), (((SeibroItemInfoEtfContext)_localctx).category1!=null?_input.getText(((SeibroItemInfoEtfContext)_localctx).category1.start,((SeibroItemInfoEtfContext)_localctx).category1.stop):null), (((SeibroItemInfoEtfContext)_localctx).category2!=null?_input.getText(((SeibroItemInfoEtfContext)_localctx).category2.start,((SeibroItemInfoEtfContext)_localctx).category2.stop):null), (((SeibroItemInfoEtfContext)_localctx).category3!=null?_input.getText(((SeibroItemInfoEtfContext)_localctx).category3.start,((SeibroItemInfoEtfContext)_localctx).category3.stop):null), (((SeibroItemInfoEtfContext)_localctx).category4!=null?_input.getText(((SeibroItemInfoEtfContext)_localctx).category4.start,((SeibroItemInfoEtfContext)_localctx).category4.stop):null), (((SeibroItemInfoEtfContext)_localctx).category5!=null?_input.getText(((SeibroItemInfoEtfContext)_localctx).category5.start,((SeibroItemInfoEtfContext)_localctx).category5.stop):null), (((SeibroItemInfoEtfContext)_localctx).category6!=null?_input.getText(((SeibroItemInfoEtfContext)_localctx).category6.start,((SeibroItemInfoEtfContext)_localctx).category6.stop):null), (((SeibroItemInfoEtfContext)_localctx).category7!=null?_input.getText(((SeibroItemInfoEtfContext)_localctx).category7.start,((SeibroItemInfoEtfContext)_localctx).category7.stop):null)
											, "ETF"
											, (((SeibroItemInfoEtfContext)_localctx).ipo!=null?((SeibroItemInfoEtfContext)_localctx).ipo.getText():null)
											, null
											, (((SeibroItemInfoEtfContext)_localctx).volumeOfListedShares!=null?((SeibroItemInfoEtfContext)_localctx).volumeOfListedShares.getText():null)
											, (((SeibroItemInfoEtfContext)_localctx).fee!=null?_input.getText(((SeibroItemInfoEtfContext)_localctx).fee.start,((SeibroItemInfoEtfContext)_localctx).fee.stop):null)
										);
									
						}
						}
						setState(792); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==KEYWORD );
					setState(794);
					match(WORD);
					setState(795);
					match(TAB);
					setState(796);
					match(WORD);
					setState(797);
					match(TAB);
					setState(798);
					match(DATE);
					setState(799);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(803); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(805);
			match(KEYWORD);
			setState(806);
			match(TAB);
			setState(807);
			match(WORD);
			setState(808);
			match(TAB);
			setState(809);
			match(WORD);
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
		enterRule(_localctx, 16, RULE_krxPriceCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(KEYWORD);
			setState(819);
			match(TAB);
			setState(820);
			match(WORD);
			setState(821);
			match(TAB);
			setState(822);
			match(WORD);
			setState(823);
			match(WORD);
			setState(824);
			match(WORD);
			setState(825);
			match(WORD);
			setState(826);
			match(WORD);
			setState(827);
			match(WORD);
			setState(828);
			match(WORD);
			setState(829);
			match(TAB);
			setState(830);
			match(WORD);
			setState(831);
			match(NEWLINE);
			setState(1068); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1058); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(832);
					match(NUMBER);
					setState(833);
					match(TAB);
					setState(834);
					match(NEWLINE);
					setState(835);
					match(NUMBER);
					setState(836);
					match(TAB);
					setState(837);
					match(NEWLINE);
					setState(838);
					match(NUMBER);
					setState(839);
					match(TAB);
					setState(840);
					match(NEWLINE);
					setState(841);
					match(NUMBER);
					setState(842);
					match(TAB);
					setState(843);
					match(NEWLINE);
					setState(844);
					match(NUMBER);
					setState(845);
					match(TAB);
					setState(846);
					match(NEWLINE);
					setState(847);
					match(NUMBER);
					setState(848);
					match(TAB);
					setState(849);
					match(TAB);
					setState(850);
					match(TAB);
					setState(851);
					match(TAB);
					setState(852);
					match(TAB);
					setState(853);
					match(NEWLINE);
					setState(854);
					match(NUMBER);
					setState(855);
					match(TAB);
					setState(856);
					match(TAB);
					setState(857);
					match(TAB);
					setState(858);
					match(NEWLINE);
					setState(859);
					match(NUMBER);
					setState(860);
					match(TAB);
					setState(861);
					match(TAB);
					setState(862);
					match(TAB);
					setState(863);
					match(TAB);
					setState(864);
					match(TAB);
					setState(865);
					match(NEWLINE);
					setState(866);
					match(NUMBER);
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
					match(NEWLINE);
					setState(873);
					match(NUMBER);
					setState(874);
					match(TAB);
					setState(875);
					match(TAB);
					setState(876);
					match(TAB);
					setState(877);
					match(TAB);
					setState(878);
					match(NEWLINE);
					setState(879);
					match(NUMBER);
					setState(880);
					match(TAB);
					setState(881);
					match(NEWLINE);
					setState(882);
					match(NUMBER);
					setState(883);
					match(TAB);
					setState(884);
					match(TAB);
					setState(885);
					match(TAB);
					setState(886);
					match(TAB);
					setState(887);
					match(TAB);
					setState(888);
					match(NEWLINE);
					setState(889);
					match(NUMBER);
					setState(890);
					match(TAB);
					setState(891);
					match(TAB);
					setState(892);
					match(TAB);
					setState(893);
					match(NEWLINE);
					setState(894);
					match(NUMBER);
					setState(895);
					match(TAB);
					setState(896);
					match(TAB);
					setState(897);
					match(TAB);
					setState(898);
					match(TAB);
					setState(899);
					match(TAB);
					setState(900);
					match(NEWLINE);
					setState(901);
					match(NUMBER);
					setState(902);
					match(TAB);
					setState(903);
					match(TAB);
					setState(904);
					match(TAB);
					setState(905);
					match(TAB);
					setState(906);
					match(TAB);
					setState(907);
					match(NEWLINE);
					setState(908);
					match(NUMBER);
					setState(909);
					match(TAB);
					setState(910);
					match(TAB);
					setState(911);
					match(TAB);
					setState(912);
					match(TAB);
					setState(913);
					match(NEWLINE);
					setState(914);
					match(NUMBER);
					setState(915);
					match(TAB);
					setState(916);
					match(NEWLINE);
					setState(917);
					match(NUMBER);
					setState(918);
					match(TAB);
					setState(919);
					match(NEWLINE);
					setState(920);
					match(NUMBER);
					setState(921);
					match(TAB);
					setState(922);
					match(NEWLINE);
					setState(923);
					match(NUMBER);
					setState(924);
					match(TAB);
					setState(925);
					match(NEWLINE);
					setState(926);
					match(NUMBER);
					setState(927);
					match(TAB);
					setState(928);
					match(TAB);
					setState(929);
					match(TAB);
					setState(930);
					match(TAB);
					setState(931);
					match(TAB);
					setState(932);
					match(NEWLINE);
					setState(933);
					match(NUMBER);
					setState(934);
					match(TAB);
					setState(935);
					match(TAB);
					setState(936);
					match(TAB);
					setState(937);
					match(NEWLINE);
					setState(938);
					match(NUMBER);
					setState(939);
					match(TAB);
					setState(940);
					match(TAB);
					setState(941);
					match(TAB);
					setState(942);
					match(TAB);
					setState(943);
					match(TAB);
					setState(944);
					match(NEWLINE);
					setState(945);
					match(NUMBER);
					setState(946);
					match(TAB);
					setState(947);
					match(TAB);
					setState(948);
					match(TAB);
					setState(949);
					match(TAB);
					setState(950);
					match(TAB);
					setState(951);
					match(NEWLINE);
					setState(952);
					match(NUMBER);
					setState(953);
					match(TAB);
					setState(954);
					match(TAB);
					setState(955);
					match(TAB);
					setState(956);
					match(TAB);
					setState(957);
					match(NEWLINE);
					setState(958);
					match(NUMBER);
					setState(959);
					match(TAB);
					setState(960);
					match(NEWLINE);
					setState(961);
					match(NUMBER);
					setState(962);
					match(TAB);
					setState(963);
					match(NEWLINE);
					setState(964);
					match(NUMBER);
					setState(965);
					match(TAB);
					setState(966);
					match(NEWLINE);
					setState(967);
					match(NUMBER);
					setState(968);
					match(TAB);
					setState(969);
					match(TAB);
					setState(970);
					match(TAB);
					setState(971);
					match(TAB);
					setState(972);
					match(TAB);
					setState(973);
					match(NEWLINE);
					setState(974);
					match(NUMBER);
					setState(975);
					match(TAB);
					setState(976);
					match(TAB);
					setState(977);
					match(TAB);
					setState(978);
					match(NEWLINE);
					setState(979);
					match(NUMBER);
					setState(980);
					match(TAB);
					setState(981);
					match(TAB);
					setState(982);
					match(TAB);
					setState(983);
					match(TAB);
					setState(984);
					match(TAB);
					setState(985);
					match(NEWLINE);
					setState(986);
					match(NUMBER);
					setState(987);
					match(TAB);
					setState(988);
					match(TAB);
					setState(989);
					match(TAB);
					setState(990);
					match(TAB);
					setState(991);
					match(TAB);
					setState(992);
					match(NEWLINE);
					setState(993);
					match(NUMBER);
					setState(994);
					match(TAB);
					setState(995);
					match(TAB);
					setState(996);
					match(TAB);
					setState(997);
					match(TAB);
					setState(998);
					match(NEWLINE);
					setState(999);
					match(NUMBER);
					setState(1000);
					match(TAB);
					setState(1001);
					match(WORD);
					setState(1002);
					match(NEWLINE);
					setState(1003);
					match(NUMBER);
					setState(1004);
					match(TAB);
					setState(1005);
					match(NEWLINE);
					setState(1054); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1006);
							((KrxPriceCompanyContext)_localctx).code = match(NUMBER);
							setState(1007);
							match(TAB);
							setState(1008);
							((KrxPriceCompanyContext)_localctx).base = match(DATE);
							setState(1009);
							match(NEWLINE);
							setState(1010);
							match(NUMBER);
							setState(1011);
							match(TAB);
							setState(1012);
							((KrxPriceCompanyContext)_localctx).closing = match(NUMBER);
							setState(1013);
							match(NEWLINE);
							setState(1014);
							match(NUMBER);
							setState(1015);
							match(TAB);
							setState(1016);
							match(NUMBER);
							setState(1017);
							match(NEWLINE);
							setState(1018);
							match(NUMBER);
							setState(1019);
							match(TAB);
							setState(1020);
							match(NUMBER);
							setState(1021);
							match(NEWLINE);
							setState(1022);
							match(NUMBER);
							setState(1023);
							match(TAB);
							setState(1024);
							((KrxPriceCompanyContext)_localctx).market = match(NUMBER);
							setState(1025);
							match(NEWLINE);
							setState(1026);
							match(NUMBER);
							setState(1027);
							match(TAB);
							setState(1028);
							((KrxPriceCompanyContext)_localctx).high = match(NUMBER);
							setState(1029);
							match(NEWLINE);
							setState(1030);
							match(NUMBER);
							setState(1031);
							match(TAB);
							setState(1032);
							((KrxPriceCompanyContext)_localctx).low = match(NUMBER);
							setState(1033);
							match(NEWLINE);
							setState(1034);
							match(NUMBER);
							setState(1035);
							match(TAB);
							setState(1036);
							((KrxPriceCompanyContext)_localctx).volume = match(NUMBER);
							setState(1037);
							match(NEWLINE);
							setState(1038);
							match(NUMBER);
							setState(1039);
							match(TAB);
							setState(1040);
							match(NUMBER);
							setState(1041);
							match(NEWLINE);
							setState(1042);
							match(NUMBER);
							setState(1043);
							match(TAB);
							setState(1044);
							match(NUMBER);
							setState(1045);
							match(NEWLINE);
							setState(1046);
							match(NUMBER);
							setState(1047);
							match(TAB);
							setState(1048);
							((KrxPriceCompanyContext)_localctx).volumeOfListedShares = match(NUMBER);
							setState(1049);
							match(NEWLINE);
							setState(1050);
							match(NUMBER);
							setState(1051);
							match(TAB);
							setState(1052);
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
						setState(1056); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					setState(1060); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				setState(1062);
				match(WORD);
				setState(1063);
				match(TAB);
				setState(1064);
				match(WORD);
				setState(1065);
				match(TAB);
				setState(1066);
				match(DATE);
				setState(1067);
				match(NEWLINE);
				}
				}
				setState(1070); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(1072);
			match(KEYWORD);
			setState(1073);
			match(TAB);
			setState(1074);
			match(WORD);
			setState(1075);
			match(TAB);
			setState(1076);
			match(WORD);
			setState(1077);
			match(WORD);
			setState(1078);
			match(WORD);
			setState(1079);
			match(WORD);
			setState(1080);
			match(WORD);
			setState(1081);
			match(WORD);
			setState(1082);
			match(WORD);
			setState(1083);
			match(TAB);
			setState(1084);
			match(WORD);
			setState(1085);
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
		enterRule(_localctx, 18, RULE_krxPriceEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			match(KEYWORD);
			setState(1088);
			match(TAB);
			setState(1089);
			match(WORD);
			setState(1090);
			match(TAB);
			setState(1091);
			match(WORD);
			setState(1092);
			match(WORD);
			setState(1093);
			match(WORD);
			setState(1094);
			match(WORD);
			setState(1095);
			match(WORD);
			setState(1096);
			match(WORD);
			setState(1097);
			match(WORD);
			setState(1098);
			match(TAB);
			setState(1099);
			match(WORD);
			setState(1100);
			match(NEWLINE);
			setState(1237); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1101);
					match(NUMBER);
					setState(1102);
					match(TAB);
					setState(1103);
					match(NEWLINE);
					setState(1104);
					match(NUMBER);
					setState(1105);
					match(TAB);
					setState(1106);
					match(TAB);
					setState(1107);
					match(TAB);
					setState(1108);
					match(NEWLINE);
					setState(1109);
					match(NUMBER);
					setState(1110);
					match(TAB);
					setState(1111);
					match(TAB);
					setState(1112);
					match(TAB);
					setState(1113);
					match(NEWLINE);
					setState(1114);
					match(NUMBER);
					setState(1115);
					match(TAB);
					setState(1116);
					match(TAB);
					setState(1117);
					match(TAB);
					setState(1118);
					match(NEWLINE);
					setState(1119);
					match(NUMBER);
					setState(1120);
					match(TAB);
					setState(1121);
					match(TAB);
					setState(1122);
					match(TAB);
					setState(1123);
					match(NEWLINE);
					setState(1124);
					match(NUMBER);
					setState(1125);
					match(TAB);
					setState(1126);
					match(TAB);
					setState(1127);
					match(TAB);
					setState(1128);
					match(NEWLINE);
					setState(1129);
					match(NUMBER);
					setState(1130);
					match(TAB);
					setState(1131);
					match(TAB);
					setState(1132);
					match(TAB);
					setState(1133);
					match(NEWLINE);
					setState(1134);
					match(NUMBER);
					setState(1135);
					match(TAB);
					setState(1136);
					match(TAB);
					setState(1137);
					match(TAB);
					setState(1138);
					match(WORD);
					setState(1139);
					match(NEWLINE);
					setState(1140);
					match(NUMBER);
					setState(1141);
					match(TAB);
					setState(1142);
					match(TAB);
					setState(1143);
					match(TAB);
					setState(1144);
					match(NEWLINE);
					setState(1222); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1145);
							((KrxPriceEtfContext)_localctx).code = word();
							setState(1146);
							match(TAB);
							setState(1147);
							((KrxPriceEtfContext)_localctx).base = match(DATE);
							setState(1148);
							match(NEWLINE);
							setState(1149);
							match(NUMBER);
							setState(1150);
							match(TAB);
							setState(1151);
							((KrxPriceEtfContext)_localctx).closing = match(NUMBER);
							setState(1152);
							match(NEWLINE);
							setState(1153);
							match(NUMBER);
							setState(1154);
							match(TAB);
							setState(1155);
							match(NUMBER);
							setState(1156);
							match(NEWLINE);
							setState(1157);
							match(NUMBER);
							setState(1158);
							match(TAB);
							setState(1159);
							match(NUMBER);
							setState(1160);
							match(NEWLINE);
							setState(1161);
							match(NUMBER);
							setState(1162);
							match(TAB);
							setState(1163);
							((KrxPriceEtfContext)_localctx).nav = match(NUMBER);
							setState(1164);
							match(NEWLINE);
							setState(1165);
							match(NUMBER);
							setState(1166);
							match(TAB);
							setState(1167);
							((KrxPriceEtfContext)_localctx).market = match(NUMBER);
							setState(1168);
							match(NEWLINE);
							setState(1169);
							match(NUMBER);
							setState(1170);
							match(TAB);
							setState(1171);
							((KrxPriceEtfContext)_localctx).high = match(NUMBER);
							setState(1172);
							match(NEWLINE);
							setState(1173);
							match(NUMBER);
							setState(1174);
							match(TAB);
							setState(1175);
							((KrxPriceEtfContext)_localctx).low = match(NUMBER);
							setState(1176);
							match(NEWLINE);
							setState(1177);
							match(NUMBER);
							setState(1178);
							match(TAB);
							setState(1179);
							((KrxPriceEtfContext)_localctx).volume = match(NUMBER);
							setState(1180);
							match(NEWLINE);
							setState(1181);
							match(NUMBER);
							setState(1182);
							match(TAB);
							setState(1183);
							match(NUMBER);
							setState(1184);
							match(NEWLINE);
							setState(1185);
							match(NUMBER);
							setState(1186);
							match(TAB);
							setState(1187);
							match(NUMBER);
							setState(1188);
							match(NEWLINE);
							setState(1189);
							match(NUMBER);
							setState(1190);
							match(TAB);
							setState(1191);
							match(NUMBER);
							setState(1192);
							match(NEWLINE);
							setState(1193);
							match(NUMBER);
							setState(1194);
							match(TAB);
							setState(1195);
							((KrxPriceEtfContext)_localctx).volumeOfListedShares = match(NUMBER);
							setState(1196);
							match(NEWLINE);
							setState(1197);
							match(NUMBER);
							setState(1198);
							match(TAB);
							setState(1200); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(1199);
								word();
								}
								}
								setState(1202); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
							setState(1204);
							match(NEWLINE);
							setState(1205);
							match(NUMBER);
							setState(1206);
							match(TAB);
							setState(1207);
							word();
							setState(1208);
							match(NEWLINE);
							setState(1209);
							match(NUMBER);
							setState(1210);
							match(TAB);
							setState(1211);
							word();
							setState(1212);
							match(NEWLINE);
							setState(1213);
							match(NUMBER);
							setState(1214);
							match(TAB);
							setState(1215);
							word();
							setState(1216);
							match(NEWLINE);
							setState(1217);
							match(NUMBER);
							setState(1218);
							match(TAB);
							setState(1219);
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
						setState(1224); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					setState(1228); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				setState(1230);
				match(WORD);
				setState(1231);
				match(TAB);
				setState(1232);
				match(WORD);
				setState(1233);
				match(TAB);
				setState(1234);
				match(DATE);
				setState(1235);
				match(NEWLINE);
				}
				}
				setState(1239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(1241);
			match(KEYWORD);
			setState(1242);
			match(TAB);
			setState(1243);
			match(WORD);
			setState(1244);
			match(TAB);
			setState(1245);
			match(WORD);
			setState(1246);
			match(WORD);
			setState(1247);
			match(WORD);
			setState(1248);
			match(WORD);
			setState(1249);
			match(WORD);
			setState(1250);
			match(WORD);
			setState(1251);
			match(WORD);
			setState(1252);
			match(TAB);
			setState(1253);
			match(WORD);
			setState(1254);
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
		public Token type;
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
		public List<TerminalNode> DATE() { return getTokens(StockParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(StockParser.DATE, i);
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
		enterRule(_localctx, 20, RULE_krxItemInfoCompany);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			match(KEYWORD);
			setState(1257);
			match(TAB);
			setState(1258);
			match(WORD);
			setState(1259);
			match(TAB);
			setState(1260);
			match(WORD);
			setState(1261);
			match(WORD);
			setState(1262);
			match(WORD);
			setState(1263);
			match(WORD);
			setState(1264);
			match(WORD);
			setState(1265);
			match(WORD);
			setState(1266);
			match(TAB);
			setState(1267);
			match(WORD);
			setState(1268);
			match(NEWLINE);
			setState(1269);
			match(KEYWORD);
			setState(1270);
			match(TAB);
			setState(1271);
			((KrxItemInfoCompanyContext)_localctx).type = match(WORD);
			setState(1272);
			match(NEWLINE);
			setState(1273);
			match(WORD);
			setState(1274);
			match(TAB);
			setState(1275);
			match(WORD);
			setState(1276);
			match(TAB);
			setState(1277);
			((KrxItemInfoCompanyContext)_localctx).symbol = word();
			setState(1279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(1278);
				((KrxItemInfoCompanyContext)_localctx).symbol1 = word();
				}
				break;
			}
			setState(1282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(1281);
				((KrxItemInfoCompanyContext)_localctx).symbol2 = word();
				}
				break;
			}
			setState(1285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(1284);
				((KrxItemInfoCompanyContext)_localctx).symbol3 = word();
				}
				break;
			}
			setState(1288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(1287);
				((KrxItemInfoCompanyContext)_localctx).symbol4 = word();
				}
				break;
			}
			setState(1291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(1290);
				((KrxItemInfoCompanyContext)_localctx).symbol5 = word();
				}
				break;
			}
			setState(1294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(1293);
				((KrxItemInfoCompanyContext)_localctx).symbol6 = word();
				}
				break;
			}
			setState(1299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(1296);
				((KrxItemInfoCompanyContext)_localctx).symbol7 = word();
				}
				}
				setState(1301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1302);
			match(TAB);
			setState(1304); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1303);
				word();
				}
				}
				setState(1306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(1308);
			match(TAB);
			setState(1309);
			match(NEWLINE);
			setState(1310);
			match(WORD);
			setState(1311);
			match(TAB);
			setState(1312);
			match(WORD);
			setState(1313);
			match(TAB);
			setState(1314);
			match(WORD);
			setState(1315);
			match(TAB);
			setState(1316);
			((KrxItemInfoCompanyContext)_localctx).code = word();
			setState(1317);
			match(TAB);
			setState(1318);
			match(NEWLINE);
			setState(1319);
			match(WORD);
			setState(1320);
			match(TAB);
			setState(1321);
			match(WORD);
			setState(1322);
			match(TAB);
			setState(1323);
			word();
			setState(1324);
			match(TAB);
			setState(1325);
			match(NUMBER);
			setState(1326);
			match(TAB);
			setState(1327);
			match(NEWLINE);
			setState(1328);
			match(WORD);
			setState(1329);
			match(TAB);
			setState(1330);
			match(WORD);
			setState(1331);
			match(TAB);
			setState(1332);
			((KrxItemInfoCompanyContext)_localctx).volumeOfListedShares = match(NUMBER);
			setState(1333);
			match(TAB);
			setState(1334);
			match(WORD);
			setState(1335);
			match(TAB);
			setState(1336);
			match(NEWLINE);
			setState(1337);
			match(WORD);
			setState(1338);
			match(TAB);
			setState(1339);
			match(WORD);
			setState(1340);
			match(TAB);
			setState(1341);
			((KrxItemInfoCompanyContext)_localctx).ipo = match(DATE);
			setState(1342);
			match(TAB);
			setState(1343);
			match(DATE);
			setState(1344);
			match(TAB);
			setState(1345);
			match(NEWLINE);
			setState(1346);
			match(WORD);
			setState(1347);
			match(TAB);
			setState(1348);
			match(WORD);
			setState(1349);
			match(TAB);
			setState(1350);
			((KrxItemInfoCompanyContext)_localctx).category = word();
			setState(1352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(1351);
				((KrxItemInfoCompanyContext)_localctx).category1 = word();
				}
				break;
			}
			setState(1355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(1354);
				((KrxItemInfoCompanyContext)_localctx).category2 = word();
				}
				break;
			}
			setState(1358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(1357);
				((KrxItemInfoCompanyContext)_localctx).category3 = word();
				}
				break;
			}
			setState(1361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(1360);
				((KrxItemInfoCompanyContext)_localctx).category4 = word();
				}
				break;
			}
			setState(1364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(1363);
				((KrxItemInfoCompanyContext)_localctx).category5 = word();
				}
				break;
			}
			setState(1367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(1366);
				((KrxItemInfoCompanyContext)_localctx).category6 = word();
				}
				break;
			}
			setState(1372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(1369);
				((KrxItemInfoCompanyContext)_localctx).category7 = word();
				}
				}
				setState(1374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1375);
			match(TAB);
			setState(1377); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1376);
				word();
				}
				}
				setState(1379); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(1381);
			match(TAB);
			setState(1382);
			match(NEWLINE);
			setState(1383);
			match(WORD);
			setState(1384);
			match(TAB);
			setState(1386); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1385);
				word();
				}
				}
				setState(1388); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(1390);
			match(TAB);
			setState(1391);
			match(NEWLINE);
			setState(1392);
			match(WORD);
			setState(1393);
			match(TAB);
			setState(1396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(1394);
				match(NUMBER);
				setState(1395);
				match(TAB);
				}
				break;
			}
			setState(1401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(1398);
				word();
				}
				}
				setState(1403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1404);
			match(TAB);
			setState(1405);
			match(NEWLINE);
			setState(1406);
			match(WORD);
			setState(1407);
			match(TAB);
			setState(1408);
			match(WORD);
			setState(1409);
			match(TAB);
			setState(1410);
			match(NEWLINE);
			setState(1411);
			match(WORD);
			setState(1412);
			match(TAB);
			setState(1413);
			match(WORD);
			setState(1414);
			match(TAB);
			setState(1415);
			match(DATE);
			setState(1416);
			match(NEWLINE);
			setState(1417);
			match(KEYWORD);
			setState(1418);
			match(TAB);
			setState(1419);
			match(WORD);
			setState(1420);
			match(TAB);
			setState(1421);
			match(WORD);
			setState(1422);
			match(WORD);
			setState(1423);
			match(WORD);
			setState(1424);
			match(WORD);
			setState(1425);
			match(WORD);
			setState(1426);
			match(WORD);
			setState(1427);
			match(TAB);
			setState(1428);
			match(WORD);
			setState(1429);
			match(NEWLINE);

					ParserService.item(20240112
						, (((KrxItemInfoCompanyContext)_localctx).code!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).code.start,((KrxItemInfoCompanyContext)_localctx).code.stop):null)
						, (((KrxItemInfoCompanyContext)_localctx).symbol!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).symbol.start,((KrxItemInfoCompanyContext)_localctx).symbol.stop):null), (((KrxItemInfoCompanyContext)_localctx).symbol1!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).symbol1.start,((KrxItemInfoCompanyContext)_localctx).symbol1.stop):null), (((KrxItemInfoCompanyContext)_localctx).symbol2!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).symbol2.start,((KrxItemInfoCompanyContext)_localctx).symbol2.stop):null), (((KrxItemInfoCompanyContext)_localctx).symbol3!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).symbol3.start,((KrxItemInfoCompanyContext)_localctx).symbol3.stop):null), (((KrxItemInfoCompanyContext)_localctx).symbol4!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).symbol4.start,((KrxItemInfoCompanyContext)_localctx).symbol4.stop):null), (((KrxItemInfoCompanyContext)_localctx).symbol5!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).symbol5.start,((KrxItemInfoCompanyContext)_localctx).symbol5.stop):null), (((KrxItemInfoCompanyContext)_localctx).symbol6!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).symbol6.start,((KrxItemInfoCompanyContext)_localctx).symbol6.stop):null), (((KrxItemInfoCompanyContext)_localctx).symbol7!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).symbol7.start,((KrxItemInfoCompanyContext)_localctx).symbol7.stop):null)
						, (((KrxItemInfoCompanyContext)_localctx).category!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).category.start,((KrxItemInfoCompanyContext)_localctx).category.stop):null), (((KrxItemInfoCompanyContext)_localctx).category1!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).category1.start,((KrxItemInfoCompanyContext)_localctx).category1.stop):null), (((KrxItemInfoCompanyContext)_localctx).category2!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).category2.start,((KrxItemInfoCompanyContext)_localctx).category2.stop):null), (((KrxItemInfoCompanyContext)_localctx).category3!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).category3.start,((KrxItemInfoCompanyContext)_localctx).category3.stop):null), (((KrxItemInfoCompanyContext)_localctx).category4!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).category4.start,((KrxItemInfoCompanyContext)_localctx).category4.stop):null), (((KrxItemInfoCompanyContext)_localctx).category5!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).category5.start,((KrxItemInfoCompanyContext)_localctx).category5.stop):null), (((KrxItemInfoCompanyContext)_localctx).category6!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).category6.start,((KrxItemInfoCompanyContext)_localctx).category6.stop):null), (((KrxItemInfoCompanyContext)_localctx).category7!=null?_input.getText(((KrxItemInfoCompanyContext)_localctx).category7.start,((KrxItemInfoCompanyContext)_localctx).category7.stop):null)
						, (((KrxItemInfoCompanyContext)_localctx).type!=null?((KrxItemInfoCompanyContext)_localctx).type.getText():null)
						, (((KrxItemInfoCompanyContext)_localctx).ipo!=null?((KrxItemInfoCompanyContext)_localctx).ipo.getText():null)
						, null
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
		enterRule(_localctx, 22, RULE_krxItemInfoEtf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1432);
			match(KEYWORD);
			setState(1433);
			match(TAB);
			setState(1434);
			match(WORD);
			setState(1435);
			match(TAB);
			setState(1436);
			match(WORD);
			setState(1437);
			match(WORD);
			setState(1438);
			match(WORD);
			setState(1439);
			match(WORD);
			setState(1440);
			match(WORD);
			setState(1441);
			match(WORD);
			setState(1442);
			match(TAB);
			setState(1443);
			match(WORD);
			setState(1444);
			match(NEWLINE);
			setState(1445);
			match(KEYWORD);
			setState(1446);
			match(TAB);
			setState(1447);
			((KrxItemInfoEtfContext)_localctx).symbol = word();
			setState(1449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(1448);
				((KrxItemInfoEtfContext)_localctx).symbol1 = word();
				}
				break;
			}
			setState(1452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(1451);
				((KrxItemInfoEtfContext)_localctx).symbol2 = word();
				}
				break;
			}
			setState(1455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(1454);
				((KrxItemInfoEtfContext)_localctx).symbol3 = word();
				}
				break;
			}
			setState(1458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(1457);
				((KrxItemInfoEtfContext)_localctx).symbol4 = word();
				}
				break;
			}
			setState(1461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(1460);
				((KrxItemInfoEtfContext)_localctx).symbol5 = word();
				}
				break;
			}
			setState(1464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(1463);
				((KrxItemInfoEtfContext)_localctx).symbol6 = word();
				}
				break;
			}
			setState(1469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(1466);
				((KrxItemInfoEtfContext)_localctx).symbol7 = word();
				}
				}
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1472);
			match(NEWLINE);
			setState(1473);
			match(WORD);
			setState(1474);
			match(TAB);
			setState(1475);
			match(WORD);
			setState(1476);
			match(TAB);
			setState(1478); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1477);
				word();
				}
				}
				setState(1480); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(1482);
			match(TAB);
			setState(1484); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1483);
				word();
				}
				}
				setState(1486); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(1488);
			match(TAB);
			setState(1489);
			match(NEWLINE);
			setState(1490);
			match(WORD);
			setState(1491);
			match(TAB);
			setState(1492);
			match(WORD);
			setState(1493);
			match(TAB);
			setState(1494);
			match(WORD);
			setState(1495);
			match(TAB);
			setState(1496);
			((KrxItemInfoEtfContext)_localctx).code = word();
			setState(1497);
			match(TAB);
			setState(1498);
			match(NEWLINE);
			setState(1499);
			match(WORD);
			setState(1500);
			match(TAB);
			setState(1501);
			match(WORD);
			setState(1502);
			match(TAB);
			setState(1504); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1503);
				word();
				}
				}
				setState(1506); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(1508);
			match(TAB);
			setState(1510); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1509);
				word();
				}
				}
				setState(1512); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(1514);
			match(TAB);
			setState(1515);
			match(NEWLINE);
			setState(1516);
			match(WORD);
			setState(1517);
			match(TAB);
			setState(1518);
			match(WORD);
			setState(1519);
			match(TAB);
			setState(1520);
			match(NUMBER);
			setState(1521);
			match(TAB);
			setState(1522);
			((KrxItemInfoEtfContext)_localctx).volumeOfListedShares = match(NUMBER);
			setState(1523);
			match(TAB);
			setState(1524);
			match(NEWLINE);
			setState(1525);
			match(WORD);
			setState(1526);
			match(TAB);
			setState(1527);
			match(WORD);
			setState(1528);
			match(TAB);
			setState(1529);
			match(NUMBER);
			setState(1530);
			match(TAB);
			setState(1531);
			((KrxItemInfoEtfContext)_localctx).ipo = match(DATE);
			setState(1532);
			match(TAB);
			setState(1533);
			match(NEWLINE);
			setState(1534);
			match(WORD);
			setState(1535);
			match(TAB);
			setState(1536);
			match(WORD);
			setState(1537);
			match(TAB);
			setState(1538);
			match(WORD);
			setState(1539);
			match(TAB);
			setState(1540);
			match(WORD);
			setState(1541);
			match(TAB);
			setState(1542);
			match(NEWLINE);
			setState(1543);
			match(WORD);
			setState(1544);
			match(TAB);
			setState(1545);
			match(WORD);
			setState(1546);
			match(TAB);
			setState(1547);
			match(WORD);
			setState(1548);
			match(TAB);
			setState(1549);
			match(WORD);
			setState(1550);
			match(TAB);
			setState(1551);
			match(NEWLINE);
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
			((KrxItemInfoEtfContext)_localctx).category = word();
			setState(1560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(1559);
				((KrxItemInfoEtfContext)_localctx).category1 = word();
				}
				break;
			}
			setState(1563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(1562);
				((KrxItemInfoEtfContext)_localctx).category2 = word();
				}
				break;
			}
			setState(1566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(1565);
				((KrxItemInfoEtfContext)_localctx).category3 = word();
				}
				break;
			}
			setState(1569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(1568);
				((KrxItemInfoEtfContext)_localctx).category4 = word();
				}
				break;
			}
			setState(1572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(1571);
				((KrxItemInfoEtfContext)_localctx).category5 = word();
				}
				break;
			}
			setState(1575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(1574);
				((KrxItemInfoEtfContext)_localctx).category6 = word();
				}
				break;
			}
			setState(1580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(1577);
				((KrxItemInfoEtfContext)_localctx).category7 = word();
				}
				}
				setState(1582);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1583);
			match(TAB);
			setState(1584);
			match(NEWLINE);
			setState(1585);
			match(WORD);
			setState(1586);
			match(WORD);
			setState(1587);
			match(TAB);
			setState(1589); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1588);
				word();
				}
				}
				setState(1591); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(1593);
			match(TAB);
			setState(1594);
			match(NEWLINE);
			setState(1595);
			match(WORD);
			setState(1596);
			match(TAB);
			setState(1598); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1597);
				word();
				}
				}
				setState(1600); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(1602);
			match(TAB);
			setState(1603);
			match(NEWLINE);
			setState(1604);
			match(WORD);
			setState(1605);
			match(TAB);
			setState(1606);
			match(WORD);
			setState(1607);
			match(TAB);
			setState(1608);
			match(DATE);
			setState(1609);
			match(NEWLINE);
			setState(1610);
			match(KEYWORD);
			setState(1611);
			match(TAB);
			setState(1612);
			match(WORD);
			setState(1613);
			match(TAB);
			setState(1614);
			match(WORD);
			setState(1615);
			match(WORD);
			setState(1616);
			match(WORD);
			setState(1617);
			match(WORD);
			setState(1618);
			match(WORD);
			setState(1619);
			match(WORD);
			setState(1620);
			match(TAB);
			setState(1621);
			match(WORD);
			setState(1622);
			match(NEWLINE);

					ParserService.item(20240112
						, (((KrxItemInfoEtfContext)_localctx).code!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).code.start,((KrxItemInfoEtfContext)_localctx).code.stop):null)
						, (((KrxItemInfoEtfContext)_localctx).symbol!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).symbol.start,((KrxItemInfoEtfContext)_localctx).symbol.stop):null), (((KrxItemInfoEtfContext)_localctx).symbol1!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).symbol1.start,((KrxItemInfoEtfContext)_localctx).symbol1.stop):null), (((KrxItemInfoEtfContext)_localctx).symbol2!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).symbol2.start,((KrxItemInfoEtfContext)_localctx).symbol2.stop):null), (((KrxItemInfoEtfContext)_localctx).symbol3!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).symbol3.start,((KrxItemInfoEtfContext)_localctx).symbol3.stop):null), (((KrxItemInfoEtfContext)_localctx).symbol4!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).symbol4.start,((KrxItemInfoEtfContext)_localctx).symbol4.stop):null), (((KrxItemInfoEtfContext)_localctx).symbol5!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).symbol5.start,((KrxItemInfoEtfContext)_localctx).symbol5.stop):null), (((KrxItemInfoEtfContext)_localctx).symbol6!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).symbol6.start,((KrxItemInfoEtfContext)_localctx).symbol6.stop):null), (((KrxItemInfoEtfContext)_localctx).symbol7!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).symbol7.start,((KrxItemInfoEtfContext)_localctx).symbol7.stop):null)
						, (((KrxItemInfoEtfContext)_localctx).category!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).category.start,((KrxItemInfoEtfContext)_localctx).category.stop):null), (((KrxItemInfoEtfContext)_localctx).category1!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).category1.start,((KrxItemInfoEtfContext)_localctx).category1.stop):null), (((KrxItemInfoEtfContext)_localctx).category2!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).category2.start,((KrxItemInfoEtfContext)_localctx).category2.stop):null), (((KrxItemInfoEtfContext)_localctx).category3!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).category3.start,((KrxItemInfoEtfContext)_localctx).category3.stop):null), (((KrxItemInfoEtfContext)_localctx).category4!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).category4.start,((KrxItemInfoEtfContext)_localctx).category4.stop):null), (((KrxItemInfoEtfContext)_localctx).category5!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).category5.start,((KrxItemInfoEtfContext)_localctx).category5.stop):null), (((KrxItemInfoEtfContext)_localctx).category6!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).category6.start,((KrxItemInfoEtfContext)_localctx).category6.stop):null), (((KrxItemInfoEtfContext)_localctx).category7!=null?_input.getText(((KrxItemInfoEtfContext)_localctx).category7.start,((KrxItemInfoEtfContext)_localctx).category7.stop):null)
						, "ETF"
						, (((KrxItemInfoEtfContext)_localctx).ipo!=null?((KrxItemInfoEtfContext)_localctx).ipo.getText():null)
						, null
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
		enterRule(_localctx, 24, RULE_krxBasicInfoEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1625);
			match(KEYWORD);
			setState(1626);
			match(TAB);
			setState(1627);
			match(WORD);
			setState(1628);
			match(TAB);
			setState(1629);
			match(WORD);
			setState(1630);
			match(WORD);
			setState(1631);
			match(WORD);
			setState(1632);
			match(WORD);
			setState(1633);
			match(WORD);
			setState(1634);
			match(WORD);
			setState(1635);
			match(TAB);
			setState(1636);
			match(WORD);
			setState(1637);
			match(NEWLINE);
			setState(1891); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1638);
				match(WORD);
				setState(1639);
				match(TAB);
				setState(1640);
				match(NEWLINE);
				setState(1641);
				match(WORD);
				setState(1642);
				match(TAB);
				setState(1643);
				match(TAB);
				setState(1644);
				match(TAB);
				setState(1645);
				match(NEWLINE);
				setState(1646);
				match(WORD);
				setState(1647);
				match(TAB);
				setState(1648);
				match(TAB);
				setState(1649);
				match(TAB);
				setState(1650);
				match(NEWLINE);
				setState(1651);
				match(WORD);
				setState(1652);
				match(TAB);
				setState(1653);
				match(TAB);
				setState(1654);
				match(TAB);
				setState(1655);
				match(NEWLINE);
				setState(1656);
				match(WORD);
				setState(1657);
				match(TAB);
				setState(1658);
				match(TAB);
				setState(1659);
				match(TAB);
				setState(1660);
				match(NEWLINE);
				setState(1661);
				match(WORD);
				setState(1662);
				match(TAB);
				setState(1663);
				match(TAB);
				setState(1664);
				match(TAB);
				setState(1665);
				match(NEWLINE);
				setState(1666);
				match(WORD);
				setState(1667);
				match(TAB);
				setState(1668);
				match(TAB);
				setState(1669);
				match(TAB);
				setState(1670);
				match(NEWLINE);
				setState(1671);
				match(WORD);
				setState(1672);
				match(TAB);
				setState(1673);
				match(TAB);
				setState(1674);
				match(TAB);
				setState(1675);
				match(NEWLINE);
				setState(1676);
				match(WORD);
				setState(1677);
				match(TAB);
				setState(1678);
				match(TAB);
				setState(1679);
				match(TAB);
				setState(1680);
				match(NEWLINE);
				setState(1681);
				match(WORD);
				setState(1682);
				match(TAB);
				setState(1683);
				match(TAB);
				setState(1684);
				match(TAB);
				setState(1685);
				match(NEWLINE);
				setState(1686);
				match(WORD);
				setState(1687);
				match(TAB);
				setState(1688);
				match(TAB);
				setState(1689);
				match(TAB);
				setState(1690);
				match(NEWLINE);
				setState(1691);
				match(WORD);
				setState(1692);
				match(TAB);
				setState(1693);
				match(TAB);
				setState(1694);
				match(TAB);
				setState(1695);
				match(NEWLINE);
				setState(1696);
				match(WORD);
				setState(1697);
				match(TAB);
				setState(1698);
				match(TAB);
				setState(1699);
				match(TAB);
				setState(1700);
				match(NEWLINE);
				setState(1701);
				match(WORD);
				setState(1702);
				match(TAB);
				setState(1703);
				match(TAB);
				setState(1704);
				match(TAB);
				setState(1705);
				match(NEWLINE);
				setState(1706);
				match(WORD);
				setState(1707);
				match(TAB);
				setState(1708);
				match(TAB);
				setState(1709);
				match(TAB);
				setState(1710);
				match(NEWLINE);
				setState(1711);
				match(WORD);
				setState(1712);
				match(TAB);
				setState(1713);
				match(TAB);
				setState(1714);
				match(TAB);
				setState(1715);
				match(NEWLINE);
				setState(1716);
				match(WORD);
				setState(1717);
				match(TAB);
				setState(1718);
				match(TAB);
				setState(1719);
				match(TAB);
				setState(1720);
				match(NEWLINE);
				setState(1721);
				match(WORD);
				setState(1722);
				match(TAB);
				setState(1723);
				match(TAB);
				setState(1724);
				match(TAB);
				setState(1725);
				match(NEWLINE);
				setState(1726);
				match(WORD);
				setState(1727);
				match(TAB);
				setState(1728);
				match(TAB);
				setState(1729);
				match(TAB);
				setState(1730);
				match(NEWLINE);
				setState(1731);
				match(WORD);
				setState(1732);
				match(TAB);
				setState(1733);
				match(TAB);
				setState(1734);
				match(TAB);
				setState(1735);
				match(WORD);
				setState(1736);
				match(NEWLINE);
				setState(1737);
				match(WORD);
				setState(1738);
				match(TAB);
				setState(1739);
				match(TAB);
				setState(1740);
				match(TAB);
				setState(1741);
				match(NEWLINE);
				setState(1880); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						{
						setState(1742);
						match(WORD);
						setState(1743);
						match(TAB);
						setState(1744);
						match(WORD);
						setState(1745);
						match(NEWLINE);
						setState(1746);
						match(WORD);
						setState(1747);
						match(TAB);
						setState(1748);
						((KrxBasicInfoEtfContext)_localctx).code = word();
						setState(1749);
						match(NEWLINE);
						setState(1750);
						match(WORD);
						setState(1751);
						match(TAB);
						setState(1752);
						match(NEWLINE);
						setState(1753);
						match(WORD);
						setState(1754);
						match(TAB);
						setState(1755);
						match(TAB);
						setState(1757); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1756);
							word();
							}
							}
							setState(1759); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(1761);
						match(NEWLINE);
						setState(1762);
						match(WORD);
						setState(1763);
						match(TAB);
						setState(1764);
						match(TAB);
						setState(1765);
						((KrxBasicInfoEtfContext)_localctx).symbol = word();
						setState(1767);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
						case 1:
							{
							setState(1766);
							((KrxBasicInfoEtfContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(1770);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
						case 1:
							{
							setState(1769);
							((KrxBasicInfoEtfContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(1773);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
						case 1:
							{
							setState(1772);
							((KrxBasicInfoEtfContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(1776);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
						case 1:
							{
							setState(1775);
							((KrxBasicInfoEtfContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(1779);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
						case 1:
							{
							setState(1778);
							((KrxBasicInfoEtfContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(1782);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
						case 1:
							{
							setState(1781);
							((KrxBasicInfoEtfContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(1787);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(1784);
							((KrxBasicInfoEtfContext)_localctx).symbol7 = word();
							}
							}
							setState(1789);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1790);
						match(NEWLINE);
						setState(1791);
						match(WORD);
						setState(1792);
						match(TAB);
						setState(1793);
						match(NEWLINE);
						setState(1794);
						match(WORD);
						setState(1795);
						match(TAB);
						setState(1797); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1796);
							word();
							}
							}
							setState(1799); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(1801);
						match(NEWLINE);
						setState(1802);
						match(WORD);
						setState(1803);
						match(TAB);
						setState(1804);
						((KrxBasicInfoEtfContext)_localctx).ipo = match(DATE);
						setState(1805);
						match(NEWLINE);
						setState(1806);
						match(WORD);
						setState(1807);
						match(TAB);
						setState(1809); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1808);
							word();
							}
							}
							setState(1811); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(1813);
						match(NEWLINE);
						setState(1814);
						match(WORD);
						setState(1815);
						match(TAB);
						setState(1817); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1816);
							word();
							}
							}
							setState(1819); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(1821);
						match(NEWLINE);
						setState(1822);
						match(WORD);
						setState(1823);
						match(TAB);
						setState(1825); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1824);
							word();
							}
							}
							setState(1827); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(1829);
						match(NEWLINE);
						setState(1830);
						match(WORD);
						setState(1831);
						match(TAB);
						setState(1832);
						match(WORD);
						setState(1833);
						match(NEWLINE);
						setState(1834);
						match(WORD);
						setState(1835);
						match(TAB);
						setState(1836);
						match(NEWLINE);
						setState(1837);
						match(WORD);
						setState(1838);
						match(TAB);
						setState(1839);
						match(TAB);
						setState(1840);
						match(WORD);
						setState(1841);
						match(NEWLINE);
						setState(1842);
						match(WORD);
						setState(1843);
						match(TAB);
						setState(1844);
						match(TAB);
						setState(1845);
						match(WORD);
						setState(1846);
						match(NEWLINE);
						setState(1847);
						match(WORD);
						setState(1848);
						match(TAB);
						setState(1849);
						match(TAB);
						setState(1850);
						match(NEWLINE);
						setState(1851);
						match(WORD);
						setState(1852);
						match(TAB);
						setState(1853);
						((KrxBasicInfoEtfContext)_localctx).volumeOfListedShares = match(NUMBER);
						setState(1854);
						match(NEWLINE);
						setState(1855);
						match(WORD);
						setState(1856);
						match(TAB);
						setState(1858); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1857);
							word();
							}
							}
							setState(1860); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(1862);
						match(NEWLINE);
						setState(1863);
						match(WORD);
						setState(1864);
						match(TAB);
						setState(1865);
						match(NUMBER);
						setState(1866);
						match(NEWLINE);
						setState(1867);
						match(WORD);
						setState(1868);
						match(TAB);
						setState(1869);
						((KrxBasicInfoEtfContext)_localctx).fee = match(NUMBER);
						setState(1870);
						match(NEWLINE);
						setState(1871);
						match(WORD);
						setState(1872);
						match(TAB);
						setState(1873);
						match(WORD);
						setState(1874);
						match(NEWLINE);
						setState(1875);
						match(WORD);
						setState(1876);
						match(TAB);
						setState(1877);
						match(NEWLINE);

										ParserService.item(20240112
											, (((KrxBasicInfoEtfContext)_localctx).code!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).code.start,((KrxBasicInfoEtfContext)_localctx).code.stop):null)
											, (((KrxBasicInfoEtfContext)_localctx).symbol!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol.start,((KrxBasicInfoEtfContext)_localctx).symbol.stop):null), (((KrxBasicInfoEtfContext)_localctx).symbol1!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol1.start,((KrxBasicInfoEtfContext)_localctx).symbol1.stop):null), (((KrxBasicInfoEtfContext)_localctx).symbol2!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol2.start,((KrxBasicInfoEtfContext)_localctx).symbol2.stop):null), (((KrxBasicInfoEtfContext)_localctx).symbol3!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol3.start,((KrxBasicInfoEtfContext)_localctx).symbol3.stop):null), (((KrxBasicInfoEtfContext)_localctx).symbol4!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol4.start,((KrxBasicInfoEtfContext)_localctx).symbol4.stop):null), (((KrxBasicInfoEtfContext)_localctx).symbol5!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol5.start,((KrxBasicInfoEtfContext)_localctx).symbol5.stop):null), (((KrxBasicInfoEtfContext)_localctx).symbol6!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol6.start,((KrxBasicInfoEtfContext)_localctx).symbol6.stop):null), (((KrxBasicInfoEtfContext)_localctx).symbol7!=null?_input.getText(((KrxBasicInfoEtfContext)_localctx).symbol7.start,((KrxBasicInfoEtfContext)_localctx).symbol7.stop):null)
											, null, null, null, null, null, null, null, null
											, null
											, (((KrxBasicInfoEtfContext)_localctx).ipo!=null?((KrxBasicInfoEtfContext)_localctx).ipo.getText():null)
											, null
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
					setState(1882); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1884);
				match(WORD);
				setState(1885);
				match(TAB);
				setState(1886);
				match(WORD);
				setState(1887);
				match(TAB);
				setState(1888);
				match(DATE);
				setState(1889);
				match(NEWLINE);
				}
				}
				setState(1893); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1895);
			match(KEYWORD);
			setState(1896);
			match(TAB);
			setState(1897);
			match(WORD);
			setState(1898);
			match(TAB);
			setState(1899);
			match(WORD);
			setState(1900);
			match(WORD);
			setState(1901);
			match(WORD);
			setState(1902);
			match(WORD);
			setState(1903);
			match(WORD);
			setState(1904);
			match(WORD);
			setState(1905);
			match(TAB);
			setState(1906);
			match(WORD);
			setState(1907);
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
		enterRule(_localctx, 26, RULE_krxBasicInfoCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1909);
			match(KEYWORD);
			setState(1910);
			match(TAB);
			setState(1911);
			match(WORD);
			setState(1912);
			match(TAB);
			setState(1913);
			match(WORD);
			setState(1914);
			match(WORD);
			setState(1915);
			match(WORD);
			setState(1916);
			match(WORD);
			setState(1917);
			match(WORD);
			setState(1918);
			match(WORD);
			setState(1919);
			match(TAB);
			setState(1920);
			match(WORD);
			setState(1921);
			match(NEWLINE);
			setState(2364); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1922);
					match(KEYWORD);
					setState(1923);
					match(TAB);
					setState(1924);
					match(NEWLINE);
					setState(1925);
					match(KEYWORD);
					setState(1926);
					match(TAB);
					setState(1927);
					match(NEWLINE);
					setState(1928);
					match(KEYWORD);
					setState(1929);
					match(TAB);
					setState(1930);
					match(NEWLINE);
					setState(1931);
					match(KEYWORD);
					setState(1932);
					match(TAB);
					setState(1933);
					match(NEWLINE);
					setState(1934);
					match(KEYWORD);
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
					match(NEWLINE);
					setState(1941);
					match(KEYWORD);
					setState(1942);
					match(TAB);
					setState(1943);
					match(TAB);
					setState(1944);
					match(TAB);
					setState(1945);
					match(NEWLINE);
					setState(1946);
					match(KEYWORD);
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
					setState(1953);
					match(KEYWORD);
					setState(1954);
					match(TAB);
					setState(1955);
					match(TAB);
					setState(1956);
					match(TAB);
					setState(1957);
					match(TAB);
					setState(1958);
					match(TAB);
					setState(1959);
					match(NEWLINE);
					setState(1960);
					match(KEYWORD);
					setState(1961);
					match(TAB);
					setState(1962);
					match(TAB);
					setState(1963);
					match(TAB);
					setState(1964);
					match(TAB);
					setState(1965);
					match(NEWLINE);
					setState(1966);
					match(KEYWORD);
					setState(1967);
					match(TAB);
					setState(1968);
					match(NEWLINE);
					setState(1969);
					match(KEYWORD);
					setState(1970);
					match(TAB);
					setState(1971);
					match(TAB);
					setState(1972);
					match(TAB);
					setState(1973);
					match(TAB);
					setState(1974);
					match(TAB);
					setState(1975);
					match(NEWLINE);
					setState(1976);
					match(KEYWORD);
					setState(1977);
					match(TAB);
					setState(1978);
					match(TAB);
					setState(1979);
					match(TAB);
					setState(1980);
					match(TAB);
					setState(1981);
					match(NEWLINE);
					setState(1982);
					match(KEYWORD);
					setState(1983);
					match(TAB);
					setState(1984);
					match(TAB);
					setState(1985);
					match(TAB);
					setState(1986);
					match(NEWLINE);
					setState(1987);
					match(KEYWORD);
					setState(1988);
					match(TAB);
					setState(1989);
					match(TAB);
					setState(1990);
					match(TAB);
					setState(1991);
					match(NEWLINE);
					setState(1992);
					match(KEYWORD);
					setState(1993);
					match(TAB);
					setState(1994);
					match(TAB);
					setState(1995);
					match(TAB);
					setState(1996);
					match(TAB);
					setState(1997);
					match(TAB);
					setState(1998);
					match(NEWLINE);
					setState(1999);
					match(KEYWORD);
					setState(2000);
					match(TAB);
					setState(2001);
					match(TAB);
					setState(2002);
					match(TAB);
					setState(2003);
					match(TAB);
					setState(2004);
					match(TAB);
					setState(2005);
					match(NEWLINE);
					setState(2006);
					match(KEYWORD);
					setState(2007);
					match(TAB);
					setState(2008);
					match(TAB);
					setState(2009);
					match(NEWLINE);
					setState(2010);
					match(KEYWORD);
					setState(2011);
					match(TAB);
					setState(2012);
					match(NEWLINE);
					setState(2013);
					match(KEYWORD);
					setState(2014);
					match(TAB);
					setState(2015);
					match(TAB);
					setState(2016);
					match(TAB);
					setState(2017);
					match(TAB);
					setState(2018);
					match(TAB);
					setState(2019);
					match(NEWLINE);
					setState(2020);
					match(KEYWORD);
					setState(2021);
					match(TAB);
					setState(2022);
					match(TAB);
					setState(2023);
					match(TAB);
					setState(2024);
					match(NEWLINE);
					setState(2025);
					match(KEYWORD);
					setState(2026);
					match(TAB);
					setState(2027);
					match(TAB);
					setState(2028);
					match(TAB);
					setState(2029);
					match(TAB);
					setState(2030);
					match(TAB);
					setState(2031);
					match(NEWLINE);
					setState(2032);
					match(KEYWORD);
					setState(2033);
					match(TAB);
					setState(2034);
					match(TAB);
					setState(2035);
					match(TAB);
					setState(2036);
					match(TAB);
					setState(2037);
					match(TAB);
					setState(2038);
					match(NEWLINE);
					setState(2039);
					match(KEYWORD);
					setState(2040);
					match(TAB);
					setState(2041);
					match(TAB);
					setState(2042);
					match(TAB);
					setState(2043);
					match(TAB);
					setState(2044);
					match(NEWLINE);
					setState(2045);
					match(KEYWORD);
					setState(2046);
					match(TAB);
					setState(2047);
					match(NEWLINE);
					setState(2048);
					match(KEYWORD);
					setState(2049);
					match(TAB);
					setState(2050);
					match(TAB);
					setState(2051);
					match(TAB);
					setState(2052);
					match(TAB);
					setState(2053);
					match(TAB);
					setState(2054);
					match(NEWLINE);
					setState(2055);
					match(KEYWORD);
					setState(2056);
					match(TAB);
					setState(2057);
					match(TAB);
					setState(2058);
					match(TAB);
					setState(2059);
					match(NEWLINE);
					setState(2060);
					match(KEYWORD);
					setState(2061);
					match(TAB);
					setState(2062);
					match(TAB);
					setState(2063);
					match(TAB);
					setState(2064);
					match(TAB);
					setState(2065);
					match(TAB);
					setState(2066);
					match(NEWLINE);
					setState(2067);
					match(KEYWORD);
					setState(2068);
					match(TAB);
					setState(2069);
					match(TAB);
					setState(2070);
					match(TAB);
					setState(2071);
					match(TAB);
					setState(2072);
					match(TAB);
					setState(2073);
					match(NEWLINE);
					setState(2074);
					match(KEYWORD);
					setState(2075);
					match(TAB);
					setState(2076);
					match(TAB);
					setState(2077);
					match(TAB);
					setState(2078);
					match(TAB);
					setState(2079);
					match(NEWLINE);
					setState(2080);
					match(KEYWORD);
					setState(2081);
					match(TAB);
					setState(2082);
					match(NEWLINE);
					setState(2083);
					match(KEYWORD);
					setState(2084);
					match(TAB);
					setState(2085);
					match(TAB);
					setState(2086);
					match(TAB);
					setState(2087);
					match(TAB);
					setState(2088);
					match(TAB);
					setState(2089);
					match(NEWLINE);
					setState(2090);
					match(KEYWORD);
					setState(2091);
					match(TAB);
					setState(2092);
					match(TAB);
					setState(2093);
					match(TAB);
					setState(2094);
					match(NEWLINE);
					setState(2095);
					match(KEYWORD);
					setState(2096);
					match(TAB);
					setState(2097);
					match(TAB);
					setState(2098);
					match(TAB);
					setState(2099);
					match(TAB);
					setState(2100);
					match(TAB);
					setState(2101);
					match(NEWLINE);
					setState(2102);
					match(KEYWORD);
					setState(2103);
					match(TAB);
					setState(2104);
					match(TAB);
					setState(2105);
					match(TAB);
					setState(2106);
					match(TAB);
					setState(2107);
					match(TAB);
					setState(2108);
					match(NEWLINE);
					setState(2109);
					match(KEYWORD);
					setState(2110);
					match(TAB);
					setState(2111);
					match(TAB);
					setState(2112);
					match(TAB);
					setState(2113);
					match(TAB);
					setState(2114);
					match(NEWLINE);
					setState(2115);
					match(KEYWORD);
					setState(2116);
					match(TAB);
					setState(2117);
					match(NEWLINE);
					setState(2118);
					match(KEYWORD);
					setState(2119);
					match(TAB);
					setState(2120);
					match(NEWLINE);
					setState(2121);
					match(KEYWORD);
					setState(2122);
					match(TAB);
					setState(2123);
					match(TAB);
					setState(2124);
					match(TAB);
					setState(2125);
					match(TAB);
					setState(2126);
					match(TAB);
					setState(2127);
					match(NEWLINE);
					setState(2128);
					match(KEYWORD);
					setState(2129);
					match(TAB);
					setState(2130);
					match(TAB);
					setState(2131);
					match(TAB);
					setState(2132);
					match(NEWLINE);
					setState(2133);
					match(KEYWORD);
					setState(2134);
					match(TAB);
					setState(2135);
					match(TAB);
					setState(2136);
					match(TAB);
					setState(2137);
					match(TAB);
					setState(2138);
					match(TAB);
					setState(2139);
					match(NEWLINE);
					setState(2140);
					match(KEYWORD);
					setState(2141);
					match(TAB);
					setState(2142);
					match(TAB);
					setState(2143);
					match(TAB);
					setState(2144);
					match(TAB);
					setState(2145);
					match(TAB);
					setState(2146);
					match(NEWLINE);
					setState(2147);
					match(KEYWORD);
					setState(2148);
					match(TAB);
					setState(2149);
					match(TAB);
					setState(2150);
					match(TAB);
					setState(2151);
					match(TAB);
					setState(2152);
					match(NEWLINE);
					setState(2153);
					match(KEYWORD);
					setState(2154);
					match(TAB);
					setState(2155);
					match(NEWLINE);
					setState(2156);
					match(KEYWORD);
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
					match(NEWLINE);
					setState(2163);
					match(KEYWORD);
					setState(2164);
					match(TAB);
					setState(2165);
					match(TAB);
					setState(2166);
					match(TAB);
					setState(2167);
					match(NEWLINE);
					setState(2168);
					match(KEYWORD);
					setState(2169);
					match(TAB);
					setState(2170);
					match(TAB);
					setState(2171);
					match(TAB);
					setState(2172);
					match(TAB);
					setState(2173);
					match(TAB);
					setState(2174);
					match(NEWLINE);
					setState(2175);
					match(KEYWORD);
					setState(2176);
					match(TAB);
					setState(2177);
					match(TAB);
					setState(2178);
					match(TAB);
					setState(2179);
					match(TAB);
					setState(2180);
					match(TAB);
					setState(2181);
					match(NEWLINE);
					setState(2182);
					match(KEYWORD);
					setState(2183);
					match(TAB);
					setState(2184);
					match(TAB);
					setState(2185);
					match(TAB);
					setState(2186);
					match(TAB);
					setState(2187);
					match(NEWLINE);
					setState(2188);
					match(KEYWORD);
					setState(2189);
					match(TAB);
					setState(2190);
					match(NEWLINE);
					setState(2191);
					match(KEYWORD);
					setState(2192);
					match(TAB);
					setState(2193);
					match(TAB);
					setState(2194);
					match(TAB);
					setState(2195);
					match(TAB);
					setState(2196);
					match(TAB);
					setState(2197);
					match(NEWLINE);
					setState(2198);
					match(KEYWORD);
					setState(2199);
					match(TAB);
					setState(2200);
					match(TAB);
					setState(2201);
					match(TAB);
					setState(2202);
					match(NEWLINE);
					setState(2203);
					match(KEYWORD);
					setState(2204);
					match(TAB);
					setState(2205);
					match(TAB);
					setState(2206);
					match(TAB);
					setState(2207);
					match(TAB);
					setState(2208);
					match(TAB);
					setState(2209);
					match(NEWLINE);
					setState(2210);
					match(KEYWORD);
					setState(2211);
					match(TAB);
					setState(2212);
					match(TAB);
					setState(2213);
					match(TAB);
					setState(2214);
					match(TAB);
					setState(2215);
					match(TAB);
					setState(2216);
					match(NEWLINE);
					setState(2217);
					match(KEYWORD);
					setState(2218);
					match(TAB);
					setState(2219);
					match(TAB);
					setState(2220);
					match(TAB);
					setState(2221);
					match(TAB);
					setState(2222);
					match(NEWLINE);
					setState(2223);
					match(KEYWORD);
					setState(2224);
					match(TAB);
					setState(2225);
					match(WORD);
					setState(2226);
					match(NEWLINE);
					setState(2227);
					match(KEYWORD);
					setState(2228);
					match(TAB);
					setState(2229);
					match(NEWLINE);
					setState(2353); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						{
						setState(2230);
						match(KEYWORD);
						setState(2231);
						match(TAB);
						setState(2232);
						match(WORD);
						setState(2233);
						match(NEWLINE);
						setState(2234);
						match(KEYWORD);
						setState(2235);
						match(TAB);
						setState(2236);
						((KrxBasicInfoCompanyContext)_localctx).code = word();
						setState(2237);
						match(NEWLINE);
						setState(2238);
						match(KEYWORD);
						setState(2239);
						match(TAB);
						setState(2240);
						match(NEWLINE);
						setState(2241);
						match(KEYWORD);
						setState(2242);
						match(TAB);
						setState(2243);
						match(TAB);
						setState(2244);
						match(NEWLINE);
						setState(2245);
						match(KEYWORD);
						setState(2246);
						match(TAB);
						setState(2247);
						match(TAB);
						setState(2248);
						match(TAB);
						setState(2250); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(2249);
							word();
							}
							}
							setState(2252); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(2254);
						match(NEWLINE);
						setState(2255);
						match(KEYWORD);
						setState(2256);
						match(TAB);
						setState(2257);
						match(TAB);
						setState(2258);
						match(TAB);
						setState(2259);
						((KrxBasicInfoCompanyContext)_localctx).symbol = word();
						setState(2261);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
						case 1:
							{
							setState(2260);
							((KrxBasicInfoCompanyContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(2264);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
						case 1:
							{
							setState(2263);
							((KrxBasicInfoCompanyContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(2267);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
						case 1:
							{
							setState(2266);
							((KrxBasicInfoCompanyContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(2270);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
						case 1:
							{
							setState(2269);
							((KrxBasicInfoCompanyContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(2273);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
						case 1:
							{
							setState(2272);
							((KrxBasicInfoCompanyContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(2276);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
						case 1:
							{
							setState(2275);
							((KrxBasicInfoCompanyContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(2281);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(2278);
							((KrxBasicInfoCompanyContext)_localctx).symbol7 = word();
							}
							}
							setState(2283);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2284);
						match(NEWLINE);
						setState(2285);
						match(KEYWORD);
						setState(2286);
						match(TAB);
						setState(2287);
						match(TAB);
						setState(2288);
						match(TAB);
						setState(2290); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(2289);
							word();
							}
							}
							setState(2292); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(2294);
						match(NEWLINE);
						setState(2295);
						match(KEYWORD);
						setState(2296);
						match(TAB);
						setState(2297);
						match(TAB);
						setState(2298);
						match(TAB);
						setState(2299);
						match(NEWLINE);
						setState(2300);
						match(KEYWORD);
						setState(2301);
						match(TAB);
						setState(2302);
						match(TAB);
						setState(2303);
						match(TAB);
						setState(2304);
						match(NEWLINE);
						setState(2305);
						match(KEYWORD);
						setState(2306);
						match(TAB);
						setState(2307);
						match(TAB);
						setState(2308);
						match(NEWLINE);
						setState(2309);
						match(KEYWORD);
						setState(2310);
						match(TAB);
						setState(2311);
						((KrxBasicInfoCompanyContext)_localctx).ipo = match(DATE);
						setState(2312);
						match(NEWLINE);
						setState(2313);
						match(KEYWORD);
						setState(2314);
						match(TAB);
						setState(2315);
						((KrxBasicInfoCompanyContext)_localctx).type = match(WORD);
						setState(2319);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(2316);
							word();
							}
							}
							setState(2321);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2322);
						match(NEWLINE);
						setState(2323);
						match(KEYWORD);
						setState(2324);
						match(TAB);
						setState(2325);
						match(WORD);
						setState(2326);
						match(NEWLINE);
						setState(2327);
						match(KEYWORD);
						setState(2328);
						match(TAB);
						setState(2332);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(2329);
							word();
							}
							}
							setState(2334);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2335);
						match(NEWLINE);
						setState(2336);
						match(KEYWORD);
						setState(2337);
						match(TAB);
						setState(2338);
						match(WORD);
						setState(2339);
						match(NEWLINE);
						setState(2340);
						match(KEYWORD);
						setState(2341);
						match(TAB);
						setState(2342);
						word();
						setState(2343);
						match(NEWLINE);
						setState(2344);
						match(KEYWORD);
						setState(2345);
						match(TAB);
						setState(2346);
						((KrxBasicInfoCompanyContext)_localctx).volumeOfListedShares = match(NUMBER);
						setState(2347);
						match(NEWLINE);
						setState(2348);
						match(KEYWORD);
						setState(2349);
						match(TAB);
						setState(2350);
						match(NEWLINE);

										ParserService.item(20240112
											, (((KrxBasicInfoCompanyContext)_localctx).code!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).code.start,((KrxBasicInfoCompanyContext)_localctx).code.stop):null)
											, (((KrxBasicInfoCompanyContext)_localctx).symbol!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol.start,((KrxBasicInfoCompanyContext)_localctx).symbol.stop):null), (((KrxBasicInfoCompanyContext)_localctx).symbol1!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol1.start,((KrxBasicInfoCompanyContext)_localctx).symbol1.stop):null), (((KrxBasicInfoCompanyContext)_localctx).symbol2!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol2.start,((KrxBasicInfoCompanyContext)_localctx).symbol2.stop):null), (((KrxBasicInfoCompanyContext)_localctx).symbol3!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol3.start,((KrxBasicInfoCompanyContext)_localctx).symbol3.stop):null), (((KrxBasicInfoCompanyContext)_localctx).symbol4!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol4.start,((KrxBasicInfoCompanyContext)_localctx).symbol4.stop):null), (((KrxBasicInfoCompanyContext)_localctx).symbol5!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol5.start,((KrxBasicInfoCompanyContext)_localctx).symbol5.stop):null), (((KrxBasicInfoCompanyContext)_localctx).symbol6!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol6.start,((KrxBasicInfoCompanyContext)_localctx).symbol6.stop):null), (((KrxBasicInfoCompanyContext)_localctx).symbol7!=null?_input.getText(((KrxBasicInfoCompanyContext)_localctx).symbol7.start,((KrxBasicInfoCompanyContext)_localctx).symbol7.stop):null)
											, null, null, null, null, null, null, null, null
											, (((KrxBasicInfoCompanyContext)_localctx).type!=null?((KrxBasicInfoCompanyContext)_localctx).type.getText():null)
											, (((KrxBasicInfoCompanyContext)_localctx).ipo!=null?((KrxBasicInfoCompanyContext)_localctx).ipo.getText():null)
											, null
											, (((KrxBasicInfoCompanyContext)_localctx).volumeOfListedShares!=null?((KrxBasicInfoCompanyContext)_localctx).volumeOfListedShares.getText():null)
											, null
										);
									
						}
						}
						}
						setState(2355); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==KEYWORD );
					setState(2357);
					match(WORD);
					setState(2358);
					match(TAB);
					setState(2359);
					match(WORD);
					setState(2360);
					match(TAB);
					setState(2361);
					match(DATE);
					setState(2362);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2366); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(2368);
			match(KEYWORD);
			setState(2369);
			match(TAB);
			setState(2370);
			match(WORD);
			setState(2371);
			match(TAB);
			setState(2372);
			match(WORD);
			setState(2373);
			match(WORD);
			setState(2374);
			match(WORD);
			setState(2375);
			match(WORD);
			setState(2376);
			match(WORD);
			setState(2377);
			match(WORD);
			setState(2378);
			match(TAB);
			setState(2379);
			match(WORD);
			setState(2380);
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
		enterRule(_localctx, 28, RULE_etfAllPrice);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2382);
			match(KEYWORD);
			setState(2383);
			match(TAB);
			setState(2384);
			match(WORD);
			setState(2385);
			match(TAB);
			setState(2386);
			match(WORD);
			setState(2387);
			match(WORD);
			setState(2388);
			match(WORD);
			setState(2389);
			match(WORD);
			setState(2390);
			match(TAB);
			setState(2391);
			match(WORD);
			setState(2392);
			match(NEWLINE);
			setState(2639); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2393);
				match(WORD);
				setState(2394);
				match(TAB);
				setState(2395);
				match(DATE);
				setState(2396);
				match(TAB);
				setState(2397);
				match(NEWLINE);
				setState(2398);
				match(WORD);
				setState(2399);
				match(TAB);
				setState(2400);
				match(DATE);
				setState(2401);
				match(TAB);
				setState(2402);
				match(NEWLINE);
				setState(2403);
				match(WORD);
				setState(2404);
				match(TAB);
				setState(2405);
				match(DATE);
				setState(2406);
				match(TAB);
				setState(2407);
				match(NEWLINE);
				setState(2408);
				match(WORD);
				setState(2409);
				match(TAB);
				setState(2410);
				match(DATE);
				setState(2411);
				match(TAB);
				setState(2412);
				match(NEWLINE);
				setState(2413);
				match(WORD);
				setState(2414);
				match(TAB);
				setState(2415);
				match(DATE);
				setState(2416);
				match(TAB);
				setState(2417);
				match(NEWLINE);
				setState(2418);
				match(WORD);
				setState(2419);
				match(TAB);
				setState(2420);
				match(DATE);
				setState(2421);
				match(TAB);
				setState(2422);
				match(NEWLINE);
				setState(2423);
				match(WORD);
				setState(2424);
				match(TAB);
				setState(2425);
				match(DATE);
				setState(2426);
				match(TAB);
				setState(2427);
				match(NEWLINE);
				setState(2428);
				match(WORD);
				setState(2429);
				match(TAB);
				setState(2430);
				match(DATE);
				setState(2431);
				match(TAB);
				setState(2432);
				match(WORD);
				setState(2433);
				match(NEWLINE);
				setState(2434);
				match(WORD);
				setState(2435);
				match(TAB);
				setState(2436);
				match(DATE);
				setState(2437);
				match(TAB);
				setState(2438);
				match(NEWLINE);
				setState(2628); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(2628);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
						case 1:
							{
							{
							setState(2439);
							match(WORD);
							setState(2440);
							match(TAB);
							setState(2441);
							match(DATE);
							setState(2442);
							match(TAB);
							setState(2443);
							((EtfAllPriceContext)_localctx).code = match(NUMBER);
							setState(2444);
							match(NEWLINE);
							setState(2445);
							match(WORD);
							setState(2446);
							match(TAB);
							setState(2447);
							match(DATE);
							setState(2448);
							match(TAB);
							setState(2449);
							((EtfAllPriceContext)_localctx).symbol = word();
							setState(2451);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
							case 1:
								{
								setState(2450);
								((EtfAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(2454);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
							case 1:
								{
								setState(2453);
								((EtfAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(2457);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
							case 1:
								{
								setState(2456);
								((EtfAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(2460);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
							case 1:
								{
								setState(2459);
								((EtfAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(2463);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
							case 1:
								{
								setState(2462);
								((EtfAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(2466);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
							case 1:
								{
								setState(2465);
								((EtfAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(2471);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(2468);
								((EtfAllPriceContext)_localctx).symbol7 = word();
								}
								}
								setState(2473);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(2474);
							match(NEWLINE);
							setState(2475);
							match(WORD);
							setState(2476);
							match(TAB);
							setState(2477);
							match(DATE);
							setState(2478);
							match(TAB);
							setState(2479);
							((EtfAllPriceContext)_localctx).closing = match(NUMBER);
							setState(2480);
							match(NEWLINE);
							setState(2481);
							match(WORD);
							setState(2482);
							match(TAB);
							setState(2483);
							match(DATE);
							setState(2484);
							match(TAB);
							setState(2485);
							match(NUMBER);
							setState(2486);
							match(NEWLINE);
							setState(2487);
							match(WORD);
							setState(2488);
							match(TAB);
							setState(2489);
							match(DATE);
							setState(2490);
							match(TAB);
							setState(2491);
							match(NUMBER);
							setState(2492);
							match(NEWLINE);
							setState(2493);
							match(WORD);
							setState(2494);
							match(TAB);
							setState(2495);
							match(DATE);
							setState(2496);
							match(TAB);
							setState(2497);
							match(NUMBER);
							setState(2498);
							match(NEWLINE);
							setState(2499);
							match(WORD);
							setState(2500);
							match(TAB);
							setState(2501);
							match(DATE);
							setState(2502);
							match(TAB);
							setState(2503);
							((EtfAllPriceContext)_localctx).market = match(NUMBER);
							setState(2504);
							match(NEWLINE);
							setState(2505);
							match(WORD);
							setState(2506);
							match(TAB);
							setState(2507);
							match(DATE);
							setState(2508);
							match(TAB);
							setState(2509);
							((EtfAllPriceContext)_localctx).high = match(NUMBER);
							setState(2510);
							match(NEWLINE);
							setState(2511);
							match(WORD);
							setState(2512);
							match(TAB);
							setState(2513);
							match(DATE);
							setState(2514);
							match(TAB);
							setState(2515);
							((EtfAllPriceContext)_localctx).low = match(NUMBER);
							setState(2516);
							match(NEWLINE);
							setState(2517);
							match(WORD);
							setState(2518);
							match(TAB);
							setState(2519);
							match(DATE);
							setState(2520);
							match(TAB);
							setState(2521);
							((EtfAllPriceContext)_localctx).volume = match(NUMBER);
							setState(2522);
							match(NEWLINE);
							setState(2523);
							match(WORD);
							setState(2524);
							match(TAB);
							setState(2525);
							match(DATE);
							setState(2526);
							match(TAB);
							setState(2527);
							match(NUMBER);
							setState(2528);
							match(NEWLINE);
							setState(2529);
							match(WORD);
							setState(2530);
							match(TAB);
							setState(2531);
							match(DATE);
							setState(2532);
							match(TAB);
							setState(2533);
							match(NUMBER);
							setState(2534);
							match(NEWLINE);
							setState(2535);
							match(WORD);
							setState(2536);
							match(TAB);
							setState(2537);
							match(DATE);
							setState(2538);
							match(TAB);
							setState(2539);
							match(NUMBER);
							setState(2540);
							match(NEWLINE);
							setState(2541);
							match(WORD);
							setState(2542);
							match(TAB);
							setState(2543);
							match(DATE);
							setState(2544);
							match(TAB);
							setState(2545);
							((EtfAllPriceContext)_localctx).volumeOfListedShares = match(NUMBER);
							setState(2546);
							match(NEWLINE);
							setState(2547);
							match(WORD);
							setState(2548);
							match(TAB);
							setState(2549);
							match(DATE);
							setState(2550);
							match(TAB);
							setState(2552); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(2551);
								word();
								}
								}
								setState(2554); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
							setState(2556);
							match(NEWLINE);
							setState(2557);
							match(WORD);
							setState(2558);
							match(TAB);
							setState(2559);
							match(DATE);
							setState(2560);
							match(TAB);
							setState(2561);
							word();
							setState(2562);
							match(NEWLINE);
							setState(2563);
							match(WORD);
							setState(2564);
							match(TAB);
							setState(2565);
							match(DATE);
							setState(2566);
							match(TAB);
							setState(2567);
							word();
							setState(2568);
							match(NEWLINE);
							setState(2569);
							match(WORD);
							setState(2570);
							match(TAB);
							setState(2571);
							match(DATE);
							setState(2572);
							match(TAB);
							setState(2573);
							word();
							setState(2574);
							match(NEWLINE);
							setState(2575);
							match(WORD);
							setState(2576);
							match(TAB);
							setState(2577);
							((EtfAllPriceContext)_localctx).base = match(DATE);
							setState(2578);
							match(TAB);
							setState(2579);
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
							setState(2582);
							match(WORD);
							setState(2583);
							match(TAB);
							setState(2584);
							match(DATE);
							setState(2585);
							match(TAB);
							setState(2586);
							match(NUMBER);
							setState(2587);
							((EtfAllPriceContext)_localctx).symbol = word();
							setState(2589);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
							case 1:
								{
								setState(2588);
								((EtfAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(2592);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
							case 1:
								{
								setState(2591);
								((EtfAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(2595);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
							case 1:
								{
								setState(2594);
								((EtfAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(2598);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
							case 1:
								{
								setState(2597);
								((EtfAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(2601);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
							case 1:
								{
								setState(2600);
								((EtfAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(2604);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
							case 1:
								{
								setState(2603);
								((EtfAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(2609);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(2606);
									((EtfAllPriceContext)_localctx).symbol7 = word();
									}
									} 
								}
								setState(2611);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
							}
							setState(2612);
							((EtfAllPriceContext)_localctx).closing = match(NUMBER);
							setState(2613);
							match(NEWLINE);
							setState(2614);
							match(WORD);
							setState(2615);
							match(TAB);
							setState(2616);
							((EtfAllPriceContext)_localctx).base = match(DATE);
							setState(2617);
							match(TAB);
							setState(2618);
							match(NUMBER);
							setState(2619);
							match(NUMBER);
							setState(2620);
							match(NUMBER);
							setState(2621);
							match(NUMBER);
							setState(2622);
							match(NUMBER);
							setState(2623);
							match(NUMBER);
							setState(2624);
							match(NUMBER);
							setState(2625);
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
					setState(2630); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2632);
				match(WORD);
				setState(2633);
				match(TAB);
				setState(2634);
				match(WORD);
				setState(2635);
				match(TAB);
				setState(2636);
				match(DATE);
				setState(2637);
				match(NEWLINE);
				}
				}
				setState(2641); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(2643);
			match(KEYWORD);
			setState(2644);
			match(TAB);
			setState(2645);
			match(WORD);
			setState(2646);
			match(TAB);
			setState(2647);
			match(WORD);
			setState(2648);
			match(WORD);
			setState(2649);
			match(WORD);
			setState(2650);
			match(WORD);
			setState(2651);
			match(TAB);
			setState(2652);
			match(WORD);
			setState(2653);
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
		enterRule(_localctx, 30, RULE_companyAllPrice);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2655);
			match(KEYWORD);
			setState(2656);
			match(TAB);
			setState(2657);
			match(WORD);
			setState(2658);
			match(TAB);
			setState(2659);
			match(WORD);
			setState(2660);
			match(WORD);
			setState(2661);
			match(WORD);
			setState(2662);
			match(WORD);
			setState(2663);
			match(WORD);
			setState(2664);
			match(WORD);
			setState(2665);
			match(TAB);
			setState(2666);
			match(WORD);
			setState(2667);
			match(NEWLINE);
			setState(3150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2668);
				match(WORD);
				setState(2669);
				match(TAB);
				setState(2670);
				match(DATE);
				setState(2671);
				match(TAB);
				setState(2672);
				match(NEWLINE);
				setState(2673);
				match(WORD);
				setState(2674);
				match(TAB);
				setState(2675);
				match(DATE);
				setState(2676);
				match(TAB);
				setState(2677);
				match(NEWLINE);
				setState(2678);
				match(WORD);
				setState(2679);
				match(TAB);
				setState(2680);
				match(DATE);
				setState(2681);
				match(TAB);
				setState(2682);
				match(NEWLINE);
				setState(2683);
				match(WORD);
				setState(2684);
				match(TAB);
				setState(2685);
				match(DATE);
				setState(2686);
				match(TAB);
				setState(2687);
				match(TAB);
				setState(2688);
				match(TAB);
				setState(2689);
				match(TAB);
				setState(2690);
				match(TAB);
				setState(2691);
				match(NEWLINE);
				setState(2692);
				match(WORD);
				setState(2693);
				match(TAB);
				setState(2694);
				match(DATE);
				setState(2695);
				match(TAB);
				setState(2696);
				match(TAB);
				setState(2697);
				match(TAB);
				setState(2698);
				match(NEWLINE);
				setState(2699);
				match(WORD);
				setState(2700);
				match(TAB);
				setState(2701);
				match(DATE);
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
				match(NEWLINE);
				setState(2708);
				match(WORD);
				setState(2709);
				match(TAB);
				setState(2710);
				match(DATE);
				setState(2711);
				match(TAB);
				setState(2712);
				match(TAB);
				setState(2713);
				match(TAB);
				setState(2714);
				match(TAB);
				setState(2715);
				match(TAB);
				setState(2716);
				match(NEWLINE);
				setState(2717);
				match(WORD);
				setState(2718);
				match(TAB);
				setState(2719);
				match(DATE);
				setState(2720);
				match(TAB);
				setState(2721);
				match(TAB);
				setState(2722);
				match(TAB);
				setState(2723);
				match(TAB);
				setState(2724);
				match(NEWLINE);
				setState(2725);
				match(WORD);
				setState(2726);
				match(TAB);
				setState(2727);
				match(DATE);
				setState(2728);
				match(TAB);
				setState(2729);
				match(NEWLINE);
				setState(2730);
				match(WORD);
				setState(2731);
				match(TAB);
				setState(2732);
				match(DATE);
				setState(2733);
				match(TAB);
				setState(2734);
				match(NEWLINE);
				setState(2735);
				match(WORD);
				setState(2736);
				match(TAB);
				setState(2737);
				match(DATE);
				setState(2738);
				match(TAB);
				setState(2739);
				match(TAB);
				setState(2740);
				match(TAB);
				setState(2741);
				match(TAB);
				setState(2742);
				match(TAB);
				setState(2743);
				match(NEWLINE);
				setState(2744);
				match(WORD);
				setState(2745);
				match(TAB);
				setState(2746);
				match(DATE);
				setState(2747);
				match(TAB);
				setState(2748);
				match(TAB);
				setState(2749);
				match(TAB);
				setState(2750);
				match(NEWLINE);
				setState(2751);
				match(WORD);
				setState(2752);
				match(TAB);
				setState(2753);
				match(DATE);
				setState(2754);
				match(TAB);
				setState(2755);
				match(TAB);
				setState(2756);
				match(TAB);
				setState(2757);
				match(TAB);
				setState(2758);
				match(TAB);
				setState(2759);
				match(NEWLINE);
				setState(2760);
				match(WORD);
				setState(2761);
				match(TAB);
				setState(2762);
				match(DATE);
				setState(2763);
				match(TAB);
				setState(2764);
				match(TAB);
				setState(2765);
				match(TAB);
				setState(2766);
				match(TAB);
				setState(2767);
				match(TAB);
				setState(2768);
				match(NEWLINE);
				setState(2769);
				match(WORD);
				setState(2770);
				match(TAB);
				setState(2771);
				match(DATE);
				setState(2772);
				match(TAB);
				setState(2773);
				match(TAB);
				setState(2774);
				match(TAB);
				setState(2775);
				match(TAB);
				setState(2776);
				match(NEWLINE);
				setState(2777);
				match(WORD);
				setState(2778);
				match(TAB);
				setState(2779);
				match(DATE);
				setState(2780);
				match(TAB);
				setState(2781);
				match(NEWLINE);
				setState(2782);
				match(WORD);
				setState(2783);
				match(TAB);
				setState(2784);
				match(DATE);
				setState(2785);
				match(TAB);
				setState(2786);
				match(NEWLINE);
				setState(2787);
				match(WORD);
				setState(2788);
				match(TAB);
				setState(2789);
				match(DATE);
				setState(2790);
				match(TAB);
				setState(2791);
				match(NEWLINE);
				setState(2792);
				match(WORD);
				setState(2793);
				match(TAB);
				setState(2794);
				match(DATE);
				setState(2795);
				match(TAB);
				setState(2796);
				match(NEWLINE);
				setState(2797);
				match(WORD);
				setState(2798);
				match(TAB);
				setState(2799);
				match(DATE);
				setState(2800);
				match(TAB);
				setState(2801);
				match(TAB);
				setState(2802);
				match(TAB);
				setState(2803);
				match(TAB);
				setState(2804);
				match(TAB);
				setState(2805);
				match(NEWLINE);
				setState(2806);
				match(WORD);
				setState(2807);
				match(TAB);
				setState(2808);
				match(DATE);
				setState(2809);
				match(TAB);
				setState(2810);
				match(TAB);
				setState(2811);
				match(TAB);
				setState(2812);
				match(TAB);
				setState(2813);
				match(NEWLINE);
				setState(2814);
				match(WORD);
				setState(2815);
				match(TAB);
				setState(2816);
				match(DATE);
				setState(2817);
				match(TAB);
				setState(2818);
				match(TAB);
				setState(2819);
				match(TAB);
				setState(2820);
				match(TAB);
				setState(2821);
				match(TAB);
				setState(2822);
				match(NEWLINE);
				setState(2823);
				match(WORD);
				setState(2824);
				match(TAB);
				setState(2825);
				match(DATE);
				setState(2826);
				match(TAB);
				setState(2827);
				match(TAB);
				setState(2828);
				match(TAB);
				setState(2829);
				match(TAB);
				setState(2830);
				match(TAB);
				setState(2831);
				match(NEWLINE);
				setState(2832);
				match(WORD);
				setState(2833);
				match(TAB);
				setState(2834);
				match(DATE);
				setState(2835);
				match(TAB);
				setState(2836);
				match(TAB);
				setState(2837);
				match(TAB);
				setState(2838);
				match(TAB);
				setState(2839);
				match(NEWLINE);
				setState(2840);
				match(WORD);
				setState(2841);
				match(TAB);
				setState(2842);
				match(DATE);
				setState(2843);
				match(TAB);
				setState(2844);
				match(NEWLINE);
				setState(2845);
				match(WORD);
				setState(2846);
				match(TAB);
				setState(2847);
				match(DATE);
				setState(2848);
				match(TAB);
				setState(2849);
				match(NEWLINE);
				setState(2850);
				match(WORD);
				setState(2851);
				match(TAB);
				setState(2852);
				match(DATE);
				setState(2853);
				match(TAB);
				setState(2854);
				match(NEWLINE);
				setState(2855);
				match(WORD);
				setState(2856);
				match(TAB);
				setState(2857);
				match(DATE);
				setState(2858);
				match(TAB);
				setState(2859);
				match(NEWLINE);
				setState(2860);
				match(WORD);
				setState(2861);
				match(TAB);
				setState(2862);
				match(DATE);
				setState(2863);
				match(TAB);
				setState(2864);
				match(TAB);
				setState(2865);
				match(TAB);
				setState(2866);
				match(TAB);
				setState(2867);
				match(TAB);
				setState(2868);
				match(NEWLINE);
				setState(2869);
				match(WORD);
				setState(2870);
				match(TAB);
				setState(2871);
				match(DATE);
				setState(2872);
				match(TAB);
				setState(2873);
				match(TAB);
				setState(2874);
				match(TAB);
				setState(2875);
				match(NEWLINE);
				setState(2876);
				match(WORD);
				setState(2877);
				match(TAB);
				setState(2878);
				match(DATE);
				setState(2879);
				match(TAB);
				setState(2880);
				match(TAB);
				setState(2881);
				match(TAB);
				setState(2882);
				match(TAB);
				setState(2883);
				match(TAB);
				setState(2884);
				match(NEWLINE);
				setState(2885);
				match(WORD);
				setState(2886);
				match(TAB);
				setState(2887);
				match(DATE);
				setState(2888);
				match(TAB);
				setState(2889);
				match(TAB);
				setState(2890);
				match(TAB);
				setState(2891);
				match(TAB);
				setState(2892);
				match(TAB);
				setState(2893);
				match(NEWLINE);
				setState(2894);
				match(WORD);
				setState(2895);
				match(TAB);
				setState(2896);
				match(DATE);
				setState(2897);
				match(TAB);
				setState(2898);
				match(TAB);
				setState(2899);
				match(TAB);
				setState(2900);
				match(TAB);
				setState(2901);
				match(NEWLINE);
				setState(2902);
				match(WORD);
				setState(2903);
				match(TAB);
				setState(2904);
				match(DATE);
				setState(2905);
				match(TAB);
				setState(2906);
				match(NEWLINE);
				setState(2907);
				match(WORD);
				setState(2908);
				match(TAB);
				setState(2909);
				match(DATE);
				setState(2910);
				match(TAB);
				setState(2911);
				match(NEWLINE);
				setState(2912);
				match(WORD);
				setState(2913);
				match(TAB);
				setState(2914);
				match(DATE);
				setState(2915);
				match(TAB);
				setState(2916);
				match(NEWLINE);
				setState(2917);
				match(WORD);
				setState(2918);
				match(TAB);
				setState(2919);
				match(DATE);
				setState(2920);
				match(TAB);
				setState(2921);
				match(TAB);
				setState(2922);
				match(TAB);
				setState(2923);
				match(TAB);
				setState(2924);
				match(TAB);
				setState(2925);
				match(NEWLINE);
				setState(2926);
				match(WORD);
				setState(2927);
				match(TAB);
				setState(2928);
				match(DATE);
				setState(2929);
				match(TAB);
				setState(2930);
				match(TAB);
				setState(2931);
				match(TAB);
				setState(2932);
				match(NEWLINE);
				setState(2933);
				match(WORD);
				setState(2934);
				match(TAB);
				setState(2935);
				match(DATE);
				setState(2936);
				match(TAB);
				setState(2937);
				match(TAB);
				setState(2938);
				match(TAB);
				setState(2939);
				match(TAB);
				setState(2940);
				match(TAB);
				setState(2941);
				match(NEWLINE);
				setState(2942);
				match(WORD);
				setState(2943);
				match(TAB);
				setState(2944);
				match(DATE);
				setState(2945);
				match(TAB);
				setState(2946);
				match(TAB);
				setState(2947);
				match(TAB);
				setState(2948);
				match(TAB);
				setState(2949);
				match(TAB);
				setState(2950);
				match(NEWLINE);
				setState(2951);
				match(WORD);
				setState(2952);
				match(TAB);
				setState(2953);
				match(DATE);
				setState(2954);
				match(TAB);
				setState(2955);
				match(TAB);
				setState(2956);
				match(TAB);
				setState(2957);
				match(TAB);
				setState(2958);
				match(NEWLINE);
				setState(2959);
				match(WORD);
				setState(2960);
				match(TAB);
				setState(2961);
				match(DATE);
				setState(2962);
				match(TAB);
				setState(2963);
				match(WORD);
				setState(2964);
				match(NEWLINE);
				setState(2965);
				match(WORD);
				setState(2966);
				match(TAB);
				setState(2967);
				match(DATE);
				setState(2968);
				match(TAB);
				setState(2969);
				match(NEWLINE);
				setState(3139); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(3139);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
						case 1:
							{
							{
							setState(2970);
							match(WORD);
							setState(2971);
							match(TAB);
							setState(2972);
							match(DATE);
							setState(2973);
							match(TAB);
							setState(2974);
							((CompanyAllPriceContext)_localctx).code = word();
							setState(2975);
							match(NEWLINE);
							setState(2976);
							match(WORD);
							setState(2977);
							match(TAB);
							setState(2978);
							match(DATE);
							setState(2979);
							match(TAB);
							setState(2980);
							((CompanyAllPriceContext)_localctx).symbol = word();
							setState(2982);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
							case 1:
								{
								setState(2981);
								((CompanyAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(2985);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
							case 1:
								{
								setState(2984);
								((CompanyAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(2988);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
							case 1:
								{
								setState(2987);
								((CompanyAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(2991);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
							case 1:
								{
								setState(2990);
								((CompanyAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(2994);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
							case 1:
								{
								setState(2993);
								((CompanyAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(2997);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
							case 1:
								{
								setState(2996);
								((CompanyAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(3002);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(2999);
								((CompanyAllPriceContext)_localctx).symbol7 = word();
								}
								}
								setState(3004);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(3005);
							match(NEWLINE);
							setState(3006);
							match(WORD);
							setState(3007);
							match(TAB);
							setState(3008);
							match(DATE);
							setState(3009);
							match(TAB);
							setState(3010);
							((CompanyAllPriceContext)_localctx).type = word();
							setState(3014);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(3011);
								word();
								}
								}
								setState(3016);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(3017);
							match(NEWLINE);
							setState(3018);
							match(WORD);
							setState(3019);
							match(TAB);
							setState(3020);
							match(DATE);
							setState(3021);
							match(TAB);
							setState(3023);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==WORD) {
								{
								setState(3022);
								match(WORD);
								}
							}

							setState(3025);
							match(NEWLINE);
							setState(3026);
							match(WORD);
							setState(3027);
							match(TAB);
							setState(3028);
							match(DATE);
							setState(3029);
							match(TAB);
							setState(3030);
							((CompanyAllPriceContext)_localctx).closing = match(NUMBER);
							setState(3031);
							match(NEWLINE);
							setState(3032);
							match(WORD);
							setState(3033);
							match(TAB);
							setState(3034);
							match(DATE);
							setState(3035);
							match(TAB);
							setState(3036);
							match(NUMBER);
							setState(3037);
							match(NEWLINE);
							setState(3038);
							match(WORD);
							setState(3039);
							match(TAB);
							setState(3040);
							match(DATE);
							setState(3041);
							match(TAB);
							setState(3042);
							match(NUMBER);
							setState(3043);
							match(NEWLINE);
							setState(3044);
							match(WORD);
							setState(3045);
							match(TAB);
							setState(3046);
							match(DATE);
							setState(3047);
							match(TAB);
							setState(3048);
							((CompanyAllPriceContext)_localctx).market = match(NUMBER);
							setState(3049);
							match(NEWLINE);
							setState(3050);
							match(WORD);
							setState(3051);
							match(TAB);
							setState(3052);
							match(DATE);
							setState(3053);
							match(TAB);
							setState(3054);
							((CompanyAllPriceContext)_localctx).high = match(NUMBER);
							setState(3055);
							match(NEWLINE);
							setState(3056);
							match(WORD);
							setState(3057);
							match(TAB);
							setState(3058);
							match(DATE);
							setState(3059);
							match(TAB);
							setState(3060);
							((CompanyAllPriceContext)_localctx).low = match(NUMBER);
							setState(3061);
							match(NEWLINE);
							setState(3062);
							match(WORD);
							setState(3063);
							match(TAB);
							setState(3064);
							match(DATE);
							setState(3065);
							match(TAB);
							setState(3066);
							((CompanyAllPriceContext)_localctx).volume = match(NUMBER);
							setState(3067);
							match(NEWLINE);
							setState(3068);
							match(WORD);
							setState(3069);
							match(TAB);
							setState(3070);
							match(DATE);
							setState(3071);
							match(TAB);
							setState(3072);
							match(NUMBER);
							setState(3073);
							match(NEWLINE);
							setState(3074);
							match(WORD);
							setState(3075);
							match(TAB);
							setState(3076);
							match(DATE);
							setState(3077);
							match(TAB);
							setState(3078);
							match(NUMBER);
							setState(3079);
							match(NEWLINE);
							setState(3080);
							match(WORD);
							setState(3081);
							match(TAB);
							setState(3082);
							match(DATE);
							setState(3083);
							match(TAB);
							setState(3084);
							((CompanyAllPriceContext)_localctx).volumeOfListedShares = match(NUMBER);
							setState(3085);
							match(NEWLINE);
							setState(3086);
							match(WORD);
							setState(3087);
							match(TAB);
							setState(3088);
							((CompanyAllPriceContext)_localctx).base = match(DATE);
							setState(3089);
							match(TAB);
							setState(3090);
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
							setState(3093);
							match(WORD);
							setState(3094);
							match(TAB);
							setState(3095);
							match(DATE);
							setState(3096);
							match(TAB);
							setState(3097);
							match(NUMBER);
							setState(3098);
							((CompanyAllPriceContext)_localctx).symbol = word();
							setState(3100);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
							case 1:
								{
								setState(3099);
								((CompanyAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(3103);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
							case 1:
								{
								setState(3102);
								((CompanyAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(3106);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
							case 1:
								{
								setState(3105);
								((CompanyAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(3109);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
							case 1:
								{
								setState(3108);
								((CompanyAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(3112);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
							case 1:
								{
								setState(3111);
								((CompanyAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(3115);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
							case 1:
								{
								setState(3114);
								((CompanyAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(3120);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(3117);
									((CompanyAllPriceContext)_localctx).symbol7 = word();
									}
									} 
								}
								setState(3122);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
							}
							setState(3123);
							((CompanyAllPriceContext)_localctx).closing = match(NUMBER);
							setState(3124);
							match(NEWLINE);
							setState(3125);
							match(WORD);
							setState(3126);
							match(TAB);
							setState(3127);
							((CompanyAllPriceContext)_localctx).base = match(DATE);
							setState(3128);
							match(TAB);
							setState(3129);
							match(NUMBER);
							setState(3130);
							match(NUMBER);
							setState(3131);
							match(NUMBER);
							setState(3132);
							match(NUMBER);
							setState(3133);
							match(NUMBER);
							setState(3134);
							match(NUMBER);
							setState(3135);
							match(NUMBER);
							setState(3136);
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
					setState(3141); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(3143);
				match(WORD);
				setState(3144);
				match(TAB);
				setState(3145);
				match(WORD);
				setState(3146);
				match(TAB);
				setState(3147);
				match(DATE);
				setState(3148);
				match(NEWLINE);
				}
				}
				setState(3152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(3154);
			match(KEYWORD);
			setState(3155);
			match(TAB);
			setState(3156);
			match(WORD);
			setState(3157);
			match(TAB);
			setState(3158);
			match(WORD);
			setState(3159);
			match(WORD);
			setState(3160);
			match(WORD);
			setState(3161);
			match(WORD);
			setState(3162);
			match(WORD);
			setState(3163);
			match(WORD);
			setState(3164);
			match(TAB);
			setState(3165);
			match(WORD);
			setState(3166);
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
		enterRule(_localctx, 32, RULE_crawlPriceKrx);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3168);
			match(KEYWORD);
			setState(3169);
			match(TAB);
			setState(3170);
			match(WORD);
			setState(3171);
			match(TAB);
			setState(3172);
			match(WORD);
			setState(3173);
			match(TAB);
			setState(3174);
			match(WORD);
			setState(3175);
			match(NEWLINE);
			setState(3361); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(3361);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					{
					setState(3176);
					match(NUMBER);
					setState(3177);
					match(TAB);
					setState(3178);
					match(WORD);
					setState(3179);
					match(WORD);
					setState(3180);
					match(TAB);
					setState(3181);
					match(NEWLINE);
					}
					}
					break;
				case WORD:
					{
					setState(3351); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(3349);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
							case 1:
								{
								{
								setState(3182);
								match(WORD);
								setState(3183);
								match(TAB);
								setState(3184);
								match(NUMBER);
								setState(3185);
								match(TAB);
								setState(3186);
								match(WORD);
								setState(3187);
								match(TAB);
								setState(3188);
								match(WORD);
								setState(3189);
								match(TAB);
								setState(3190);
								match(WORD);
								setState(3191);
								match(TAB);
								setState(3192);
								match(WORD);
								setState(3193);
								match(TAB);
								setState(3194);
								match(WORD);
								setState(3195);
								match(TAB);
								setState(3196);
								match(WORD);
								setState(3197);
								match(TAB);
								setState(3198);
								match(WORD);
								setState(3199);
								match(TAB);
								setState(3200);
								match(WORD);
								setState(3201);
								match(TAB);
								setState(3202);
								match(WORD);
								setState(3203);
								match(TAB);
								setState(3204);
								match(WORD);
								setState(3205);
								match(TAB);
								setState(3206);
								match(WORD);
								setState(3207);
								match(TAB);
								setState(3208);
								match(NEWLINE);
								setState(3237); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(3209);
										match(WORD);
										setState(3210);
										match(TAB);
										setState(3211);
										((CrawlPriceKrxContext)_localctx).code = match(NUMBER);
										setState(3212);
										match(TAB);
										setState(3213);
										((CrawlPriceKrxContext)_localctx).base = match(DATE);
										setState(3214);
										match(TAB);
										setState(3215);
										((CrawlPriceKrxContext)_localctx).closing = match(NUMBER);
										setState(3216);
										match(TAB);
										setState(3217);
										match(NUMBER);
										setState(3218);
										match(TAB);
										setState(3219);
										match(NUMBER);
										setState(3220);
										match(TAB);
										setState(3221);
										((CrawlPriceKrxContext)_localctx).market = match(NUMBER);
										setState(3222);
										match(TAB);
										setState(3223);
										((CrawlPriceKrxContext)_localctx).high = match(NUMBER);
										setState(3224);
										match(TAB);
										setState(3225);
										((CrawlPriceKrxContext)_localctx).low = match(NUMBER);
										setState(3226);
										match(TAB);
										setState(3227);
										((CrawlPriceKrxContext)_localctx).volume = match(NUMBER);
										setState(3228);
										match(TAB);
										setState(3229);
										match(NUMBER);
										setState(3230);
										match(TAB);
										setState(3231);
										match(NUMBER);
										setState(3232);
										match(TAB);
										setState(3233);
										match(NUMBER);
										setState(3234);
										match(TAB);
										setState(3235);
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
									setState(3239); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
								} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
								}
								}
								break;
							case 2:
								{
								{
								setState(3241);
								match(WORD);
								setState(3242);
								match(TAB);
								setState(3243);
								match(NUMBER);
								setState(3244);
								match(TAB);
								setState(3245);
								match(WORD);
								setState(3246);
								match(TAB);
								setState(3247);
								match(WORD);
								setState(3248);
								match(TAB);
								setState(3249);
								match(WORD);
								setState(3250);
								match(TAB);
								setState(3251);
								match(WORD);
								setState(3252);
								match(TAB);
								setState(3253);
								match(WORD);
								setState(3254);
								match(TAB);
								setState(3255);
								match(WORD);
								setState(3256);
								match(TAB);
								setState(3257);
								match(WORD);
								setState(3258);
								match(TAB);
								setState(3259);
								match(WORD);
								setState(3260);
								match(TAB);
								setState(3261);
								match(WORD);
								setState(3262);
								match(TAB);
								setState(3263);
								match(WORD);
								setState(3264);
								match(TAB);
								setState(3265);
								match(WORD);
								setState(3266);
								match(TAB);
								setState(3267);
								match(WORD);
								setState(3268);
								match(TAB);
								setState(3269);
								match(WORD);
								setState(3270);
								match(TAB);
								setState(3271);
								match(WORD);
								setState(3272);
								match(TAB);
								setState(3273);
								match(WORD);
								setState(3274);
								match(TAB);
								setState(3275);
								match(WORD);
								setState(3276);
								match(TAB);
								setState(3277);
								match(WORD);
								setState(3278);
								match(TAB);
								setState(3279);
								match(NEWLINE);
								setState(3345); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(3280);
										match(WORD);
										setState(3281);
										match(TAB);
										setState(3282);
										((CrawlPriceKrxContext)_localctx).code = match(NUMBER);
										setState(3283);
										match(TAB);
										setState(3284);
										((CrawlPriceKrxContext)_localctx).base = match(DATE);
										setState(3285);
										match(TAB);
										setState(3286);
										((CrawlPriceKrxContext)_localctx).closing = match(NUMBER);
										setState(3287);
										match(TAB);
										setState(3288);
										match(NUMBER);
										setState(3289);
										match(TAB);
										setState(3290);
										match(NUMBER);
										setState(3291);
										match(TAB);
										setState(3292);
										match(NUMBER);
										setState(3293);
										match(TAB);
										setState(3294);
										((CrawlPriceKrxContext)_localctx).market = match(NUMBER);
										setState(3295);
										match(TAB);
										setState(3296);
										((CrawlPriceKrxContext)_localctx).high = match(NUMBER);
										setState(3297);
										match(TAB);
										setState(3298);
										((CrawlPriceKrxContext)_localctx).low = match(NUMBER);
										setState(3299);
										match(TAB);
										setState(3300);
										((CrawlPriceKrxContext)_localctx).volume = match(NUMBER);
										setState(3301);
										match(TAB);
										setState(3302);
										match(NUMBER);
										setState(3303);
										match(TAB);
										setState(3304);
										match(NUMBER);
										setState(3305);
										match(TAB);
										setState(3306);
										match(NUMBER);
										setState(3307);
										match(TAB);
										setState(3308);
										match(NUMBER);
										setState(3309);
										match(TAB);
										setState(3310);
										((CrawlPriceKrxContext)_localctx).symbol = word();
										setState(3312);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
										case 1:
											{
											setState(3311);
											((CrawlPriceKrxContext)_localctx).symbol1 = word();
											}
											break;
										}
										setState(3315);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
										case 1:
											{
											setState(3314);
											((CrawlPriceKrxContext)_localctx).symbol2 = word();
											}
											break;
										}
										setState(3318);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
										case 1:
											{
											setState(3317);
											((CrawlPriceKrxContext)_localctx).symbol3 = word();
											}
											break;
										}
										setState(3321);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
										case 1:
											{
											setState(3320);
											((CrawlPriceKrxContext)_localctx).symbol4 = word();
											}
											break;
										}
										setState(3324);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
										case 1:
											{
											setState(3323);
											((CrawlPriceKrxContext)_localctx).symbol5 = word();
											}
											break;
										}
										setState(3327);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
										case 1:
											{
											setState(3326);
											((CrawlPriceKrxContext)_localctx).symbol6 = word();
											}
											break;
										}
										setState(3332);
										_errHandler.sync(this);
										_la = _input.LA(1);
										while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
											{
											{
											setState(3329);
											((CrawlPriceKrxContext)_localctx).symbol7 = word();
											}
											}
											setState(3334);
											_errHandler.sync(this);
											_la = _input.LA(1);
										}
										setState(3335);
										match(TAB);
										setState(3336);
										match(NUMBER);
										setState(3337);
										match(TAB);
										setState(3338);
										match(NUMBER);
										setState(3339);
										match(TAB);
										setState(3340);
										match(NUMBER);
										setState(3341);
										match(TAB);
										setState(3342);
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
									setState(3347); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
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
						setState(3353); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(3355);
					match(WORD);
					setState(3356);
					match(TAB);
					setState(3357);
					match(WORD);
					setState(3358);
					match(TAB);
					setState(3359);
					match(DATE);
					setState(3360);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(3363); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER || _la==WORD );
			setState(3365);
			match(KEYWORD);
			setState(3366);
			match(TAB);
			setState(3367);
			match(WORD);
			setState(3368);
			match(TAB);
			setState(3369);
			match(WORD);
			setState(3370);
			match(TAB);
			setState(3371);
			match(WORD);
			setState(3372);
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
		enterRule(_localctx, 34, RULE_crawlItemEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3374);
			match(KEYWORD);
			setState(3375);
			match(TAB);
			setState(3376);
			match(WORD);
			setState(3377);
			match(TAB);
			setState(3378);
			match(WORD);
			setState(3379);
			match(WORD);
			setState(3380);
			match(WORD);
			setState(3381);
			match(TAB);
			setState(3382);
			match(WORD);
			setState(3383);
			match(TAB);
			setState(3384);
			match(WORD);
			setState(3385);
			match(NEWLINE);
			setState(3514); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3386);
				match(WORD);
				setState(3387);
				match(TAB);
				setState(3388);
				match(NEWLINE);
				setState(3389);
				match(WORD);
				setState(3390);
				match(TAB);
				setState(3391);
				match(WORD);
				setState(3392);
				match(TAB);
				setState(3393);
				match(WORD);
				setState(3394);
				match(TAB);
				setState(3395);
				match(TAB);
				setState(3396);
				match(WORD);
				setState(3397);
				match(TAB);
				setState(3398);
				match(WORD);
				setState(3399);
				match(TAB);
				setState(3400);
				match(WORD);
				setState(3401);
				match(TAB);
				setState(3402);
				match(WORD);
				setState(3403);
				match(NEWLINE);
				setState(3404);
				match(WORD);
				setState(3405);
				match(TAB);
				setState(3406);
				match(TAB);
				setState(3407);
				match(TAB);
				setState(3408);
				match(WORD);
				setState(3409);
				match(TAB);
				setState(3410);
				match(TAB);
				setState(3411);
				match(TAB);
				setState(3412);
				match(TAB);
				setState(3413);
				match(TAB);
				setState(3414);
				match(TAB);
				setState(3415);
				match(WORD);
				setState(3416);
				match(TAB);
				setState(3417);
				match(WORD);
				setState(3418);
				match(TAB);
				setState(3419);
				match(NEWLINE);
				setState(3503); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3420);
						((CrawlItemEtfContext)_localctx).type = match(WORD);
						setState(3421);
						match(TAB);
						setState(3422);
						match(TAB);
						setState(3423);
						((CrawlItemEtfContext)_localctx).symbol = word();
						setState(3425);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
						case 1:
							{
							setState(3424);
							((CrawlItemEtfContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(3428);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
						case 1:
							{
							setState(3427);
							((CrawlItemEtfContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(3431);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
						case 1:
							{
							setState(3430);
							((CrawlItemEtfContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(3434);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
						case 1:
							{
							setState(3433);
							((CrawlItemEtfContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(3437);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
						case 1:
							{
							setState(3436);
							((CrawlItemEtfContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(3440);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
						case 1:
							{
							setState(3439);
							((CrawlItemEtfContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(3445);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(3442);
							((CrawlItemEtfContext)_localctx).symbol7 = word();
							}
							}
							setState(3447);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(3448);
						match(TAB);
						setState(3449);
						((CrawlItemEtfContext)_localctx).code = match(NUMBER);
						setState(3450);
						match(TAB);
						setState(3451);
						((CrawlItemEtfContext)_localctx).category = word();
						setState(3453);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
						case 1:
							{
							setState(3452);
							((CrawlItemEtfContext)_localctx).category1 = word();
							}
							break;
						}
						setState(3456);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
						case 1:
							{
							setState(3455);
							((CrawlItemEtfContext)_localctx).category2 = word();
							}
							break;
						}
						setState(3459);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
						case 1:
							{
							setState(3458);
							((CrawlItemEtfContext)_localctx).category3 = word();
							}
							break;
						}
						setState(3462);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
						case 1:
							{
							setState(3461);
							((CrawlItemEtfContext)_localctx).category4 = word();
							}
							break;
						}
						setState(3465);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
						case 1:
							{
							setState(3464);
							((CrawlItemEtfContext)_localctx).category5 = word();
							}
							break;
						}
						setState(3468);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
						case 1:
							{
							setState(3467);
							((CrawlItemEtfContext)_localctx).category6 = word();
							}
							break;
						}
						setState(3473);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(3470);
							((CrawlItemEtfContext)_localctx).category7 = word();
							}
							}
							setState(3475);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(3476);
						match(TAB);
						setState(3477);
						((CrawlItemEtfContext)_localctx).asset = match(NUMBER);
						setState(3478);
						match(TAB);
						setState(3479);
						((CrawlItemEtfContext)_localctx).closing = match(NUMBER);
						setState(3480);
						match(TAB);
						setState(3481);
						((CrawlItemEtfContext)_localctx).amount = match(NUMBER);
						setState(3482);
						match(TAB);
						setState(3483);
						match(TAB);
						setState(3484);
						match(TAB);
						setState(3486);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(3485);
							((CrawlItemEtfContext)_localctx).priceEarningsRatio = match(NUMBER);
							}
						}

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
						setState(3495);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(3494);
							((CrawlItemEtfContext)_localctx).fee = match(NUMBER);
							}
						}

						setState(3497);
						match(TAB);
						setState(3498);
						((CrawlItemEtfContext)_localctx).operator = match(WORD);
						setState(3499);
						match(TAB);
						setState(3500);
						match(NEWLINE);

										ParserService.item(20240112
											, (((CrawlItemEtfContext)_localctx).code!=null?((CrawlItemEtfContext)_localctx).code.getText():null)
											, (((CrawlItemEtfContext)_localctx).symbol!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol.start,((CrawlItemEtfContext)_localctx).symbol.stop):null), (((CrawlItemEtfContext)_localctx).symbol1!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol1.start,((CrawlItemEtfContext)_localctx).symbol1.stop):null), (((CrawlItemEtfContext)_localctx).symbol2!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol2.start,((CrawlItemEtfContext)_localctx).symbol2.stop):null), (((CrawlItemEtfContext)_localctx).symbol3!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol3.start,((CrawlItemEtfContext)_localctx).symbol3.stop):null), (((CrawlItemEtfContext)_localctx).symbol4!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol4.start,((CrawlItemEtfContext)_localctx).symbol4.stop):null), (((CrawlItemEtfContext)_localctx).symbol5!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol5.start,((CrawlItemEtfContext)_localctx).symbol5.stop):null), (((CrawlItemEtfContext)_localctx).symbol6!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol6.start,((CrawlItemEtfContext)_localctx).symbol6.stop):null), (((CrawlItemEtfContext)_localctx).symbol7!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol7.start,((CrawlItemEtfContext)_localctx).symbol7.stop):null)
											, (((CrawlItemEtfContext)_localctx).category!=null?_input.getText(((CrawlItemEtfContext)_localctx).category.start,((CrawlItemEtfContext)_localctx).category.stop):null), (((CrawlItemEtfContext)_localctx).category1!=null?_input.getText(((CrawlItemEtfContext)_localctx).category1.start,((CrawlItemEtfContext)_localctx).category1.stop):null), (((CrawlItemEtfContext)_localctx).category2!=null?_input.getText(((CrawlItemEtfContext)_localctx).category2.start,((CrawlItemEtfContext)_localctx).category2.stop):null), (((CrawlItemEtfContext)_localctx).category3!=null?_input.getText(((CrawlItemEtfContext)_localctx).category3.start,((CrawlItemEtfContext)_localctx).category3.stop):null), (((CrawlItemEtfContext)_localctx).category4!=null?_input.getText(((CrawlItemEtfContext)_localctx).category4.start,((CrawlItemEtfContext)_localctx).category4.stop):null), (((CrawlItemEtfContext)_localctx).category5!=null?_input.getText(((CrawlItemEtfContext)_localctx).category5.start,((CrawlItemEtfContext)_localctx).category5.stop):null), (((CrawlItemEtfContext)_localctx).category6!=null?_input.getText(((CrawlItemEtfContext)_localctx).category6.start,((CrawlItemEtfContext)_localctx).category6.stop):null), (((CrawlItemEtfContext)_localctx).category7!=null?_input.getText(((CrawlItemEtfContext)_localctx).category7.start,((CrawlItemEtfContext)_localctx).category7.stop):null)
											, "ETF"
											, null
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
					setState(3505); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(3507);
				match(WORD);
				setState(3508);
				match(TAB);
				setState(3509);
				match(WORD);
				setState(3510);
				match(TAB);
				setState(3511);
				match(DATE);
				setState(3512);
				match(NEWLINE);
				}
				}
				setState(3516); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(3518);
			match(KEYWORD);
			setState(3519);
			match(TAB);
			setState(3520);
			match(WORD);
			setState(3521);
			match(TAB);
			setState(3522);
			match(WORD);
			setState(3523);
			match(WORD);
			setState(3524);
			match(WORD);
			setState(3525);
			match(TAB);
			setState(3526);
			match(WORD);
			setState(3527);
			match(TAB);
			setState(3528);
			match(WORD);
			setState(3529);
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
		enterRule(_localctx, 36, RULE_crawlPriceEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3531);
			match(KEYWORD);
			setState(3532);
			match(TAB);
			setState(3533);
			match(WORD);
			setState(3534);
			match(WORD);
			setState(3535);
			match(TAB);
			setState(3536);
			match(WORD);
			setState(3537);
			match(TAB);
			setState(3538);
			match(WORD);
			setState(3539);
			match(TAB);
			setState(3540);
			match(WORD);
			setState(3541);
			match(NEWLINE);
			setState(3683); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3542);
				((CrawlPriceEtfContext)_localctx).code = match(NUMBER);
				setState(3543);
				match(TAB);
				setState(3545); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3544);
					word();
					}
					}
					setState(3547); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(3549);
				match(NEWLINE);
				{
				setState(3550);
				match(KEYWORD);
				setState(3551);
				match(TAB);
				setState(3552);
				((CrawlPriceEtfContext)_localctx).symbol = word();
				setState(3554);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(3553);
					((CrawlPriceEtfContext)_localctx).symbol1 = word();
					}
					break;
				}
				setState(3557);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(3556);
					((CrawlPriceEtfContext)_localctx).symbol2 = word();
					}
					break;
				}
				setState(3560);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(3559);
					((CrawlPriceEtfContext)_localctx).symbol3 = word();
					}
					break;
				}
				setState(3563);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(3562);
					((CrawlPriceEtfContext)_localctx).symbol4 = word();
					}
					break;
				}
				setState(3566);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(3565);
					((CrawlPriceEtfContext)_localctx).symbol5 = word();
					}
					break;
				}
				setState(3569);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(3568);
					((CrawlPriceEtfContext)_localctx).symbol6 = word();
					}
					break;
				}
				setState(3574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
					{
					{
					setState(3571);
					((CrawlPriceEtfContext)_localctx).symbol7 = word();
					}
					}
					setState(3576);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3577);
				match(NEWLINE);
				setState(3578);
				match(KEYWORD);
				setState(3579);
				match(TAB);
				setState(3580);
				((CrawlPriceEtfContext)_localctx).category = word();
				setState(3582);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(3581);
					((CrawlPriceEtfContext)_localctx).category1 = word();
					}
					break;
				}
				setState(3585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(3584);
					((CrawlPriceEtfContext)_localctx).category2 = word();
					}
					break;
				}
				setState(3588);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(3587);
					((CrawlPriceEtfContext)_localctx).category3 = word();
					}
					break;
				}
				setState(3591);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(3590);
					((CrawlPriceEtfContext)_localctx).category4 = word();
					}
					break;
				}
				setState(3594);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(3593);
					((CrawlPriceEtfContext)_localctx).category5 = word();
					}
					break;
				}
				setState(3597);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(3596);
					((CrawlPriceEtfContext)_localctx).category6 = word();
					}
					break;
				}
				setState(3602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
					{
					{
					setState(3599);
					((CrawlPriceEtfContext)_localctx).category7 = word();
					}
					}
					setState(3604);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3605);
				match(NEWLINE);
				setState(3606);
				match(KEYWORD);
				setState(3607);
				match(TAB);
				setState(3608);
				((CrawlPriceEtfContext)_localctx).ea = match(NUMBER);
				setState(3609);
				match(NEWLINE);

								ParserService.item(20240112
									, (((CrawlPriceEtfContext)_localctx).code!=null?((CrawlPriceEtfContext)_localctx).code.getText():null)
									, (((CrawlPriceEtfContext)_localctx).symbol!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol.start,((CrawlPriceEtfContext)_localctx).symbol.stop):null), (((CrawlPriceEtfContext)_localctx).symbol1!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol1.start,((CrawlPriceEtfContext)_localctx).symbol1.stop):null), (((CrawlPriceEtfContext)_localctx).symbol2!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol2.start,((CrawlPriceEtfContext)_localctx).symbol2.stop):null), (((CrawlPriceEtfContext)_localctx).symbol3!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol3.start,((CrawlPriceEtfContext)_localctx).symbol3.stop):null), (((CrawlPriceEtfContext)_localctx).symbol4!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol4.start,((CrawlPriceEtfContext)_localctx).symbol4.stop):null), (((CrawlPriceEtfContext)_localctx).symbol5!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol5.start,((CrawlPriceEtfContext)_localctx).symbol5.stop):null), (((CrawlPriceEtfContext)_localctx).symbol6!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol6.start,((CrawlPriceEtfContext)_localctx).symbol6.stop):null), (((CrawlPriceEtfContext)_localctx).symbol7!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol7.start,((CrawlPriceEtfContext)_localctx).symbol7.stop):null)
									, (((CrawlPriceEtfContext)_localctx).category!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category.start,((CrawlPriceEtfContext)_localctx).category.stop):null), (((CrawlPriceEtfContext)_localctx).category1!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category1.start,((CrawlPriceEtfContext)_localctx).category1.stop):null), (((CrawlPriceEtfContext)_localctx).category2!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category2.start,((CrawlPriceEtfContext)_localctx).category2.stop):null), (((CrawlPriceEtfContext)_localctx).category3!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category3.start,((CrawlPriceEtfContext)_localctx).category3.stop):null), (((CrawlPriceEtfContext)_localctx).category4!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category4.start,((CrawlPriceEtfContext)_localctx).category4.stop):null), (((CrawlPriceEtfContext)_localctx).category5!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category5.start,((CrawlPriceEtfContext)_localctx).category5.stop):null), (((CrawlPriceEtfContext)_localctx).category6!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category6.start,((CrawlPriceEtfContext)_localctx).category6.stop):null), (((CrawlPriceEtfContext)_localctx).category7!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category7.start,((CrawlPriceEtfContext)_localctx).category7.stop):null)
									, "ETF"
									, null
									, null
									, (((CrawlPriceEtfContext)_localctx).ea!=null?((CrawlPriceEtfContext)_localctx).ea.getText():null)
									, null
								);
							
				}
				setState(3672); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3612);
						match(WORD);
						setState(3613);
						match(TAB);
						setState(3614);
						match(WORD);
						setState(3615);
						match(TAB);
						setState(3616);
						match(WORD);
						setState(3617);
						match(TAB);
						setState(3618);
						match(WORD);
						setState(3619);
						match(TAB);
						setState(3620);
						match(WORD);
						setState(3621);
						match(TAB);
						setState(3622);
						match(WORD);
						setState(3623);
						match(TAB);
						setState(3624);
						match(WORD);
						setState(3625);
						match(TAB);
						setState(3626);
						match(WORD);
						setState(3627);
						match(TAB);
						setState(3628);
						match(NEWLINE);
						setState(3668); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(3668);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
							case 1:
								{
								{
								setState(3629);
								match(TAB);
								setState(3630);
								match(TAB);
								setState(3631);
								match(TAB);
								setState(3632);
								match(TAB);
								setState(3633);
								match(TAB);
								setState(3634);
								match(TAB);
								setState(3635);
								match(TAB);
								setState(3636);
								match(TAB);
								setState(3637);
								match(NEWLINE);
								}
								}
								break;
							case 2:
								{
								{
								setState(3639);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(3638);
									((CrawlPriceEtfContext)_localctx).base = match(DATE);
									}
								}

								setState(3641);
								match(TAB);
								setState(3643);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(3642);
									((CrawlPriceEtfContext)_localctx).closing = match(NUMBER);
									}
								}

								setState(3645);
								match(TAB);
								setState(3647);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(3646);
									match(NUMBER);
									}
								}

								setState(3649);
								match(TAB);
								setState(3651);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(3650);
									((CrawlPriceEtfContext)_localctx).market = match(NUMBER);
									}
								}

								setState(3653);
								match(TAB);
								setState(3655);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(3654);
									((CrawlPriceEtfContext)_localctx).high = match(NUMBER);
									}
								}

								setState(3657);
								match(TAB);
								setState(3658);
								((CrawlPriceEtfContext)_localctx).low = match(NUMBER);
								setState(3659);
								match(TAB);
								setState(3660);
								((CrawlPriceEtfContext)_localctx).volume = match(NUMBER);
								setState(3661);
								match(TAB);
								setState(3663);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(3662);
									match(NUMBER);
									}
								}

								setState(3665);
								match(TAB);
								setState(3666);
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
							setState(3670); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3674); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(3676);
				match(WORD);
				setState(3677);
				match(TAB);
				setState(3678);
				match(WORD);
				setState(3679);
				match(TAB);
				setState(3680);
				match(DATE);
				setState(3681);
				match(NEWLINE);
				}
				}
				setState(3685); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(3687);
			match(KEYWORD);
			setState(3688);
			match(TAB);
			setState(3689);
			match(WORD);
			setState(3690);
			match(WORD);
			setState(3691);
			match(TAB);
			setState(3692);
			match(WORD);
			setState(3693);
			match(TAB);
			setState(3694);
			match(WORD);
			setState(3695);
			match(TAB);
			setState(3696);
			match(WORD);
			setState(3697);
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
		enterRule(_localctx, 38, RULE_crawlPriceCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3699);
			match(KEYWORD);
			setState(3700);
			match(TAB);
			setState(3701);
			match(WORD);
			setState(3702);
			match(WORD);
			setState(3703);
			match(TAB);
			setState(3704);
			match(WORD);
			setState(3705);
			match(TAB);
			setState(3706);
			match(WORD);
			setState(3707);
			match(TAB);
			setState(3708);
			match(WORD);
			setState(3709);
			match(NEWLINE);
			setState(3772); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3710);
				((CrawlPriceCompanyContext)_localctx).code = match(NUMBER);
				setState(3711);
				match(TAB);
				setState(3713); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3712);
					((CrawlPriceCompanyContext)_localctx).symbol = word();
					}
					}
					setState(3715); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(3717);
				match(NEWLINE);
				setState(3761); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3718);
						match(WORD);
						setState(3719);
						match(TAB);
						setState(3720);
						match(WORD);
						setState(3721);
						match(TAB);
						setState(3722);
						match(WORD);
						setState(3723);
						match(TAB);
						setState(3724);
						match(WORD);
						setState(3725);
						match(TAB);
						setState(3726);
						match(WORD);
						setState(3727);
						match(TAB);
						setState(3728);
						match(WORD);
						setState(3729);
						match(TAB);
						setState(3730);
						match(WORD);
						setState(3731);
						match(TAB);
						setState(3732);
						match(NEWLINE);
						setState(3757); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(3757);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case TAB:
								{
								{
								setState(3733);
								match(TAB);
								setState(3734);
								match(TAB);
								setState(3735);
								match(TAB);
								setState(3736);
								match(TAB);
								setState(3737);
								match(TAB);
								setState(3738);
								match(TAB);
								setState(3739);
								match(TAB);
								setState(3740);
								match(NEWLINE);
								}
								}
								break;
							case DATE:
								{
								{
								setState(3741);
								((CrawlPriceCompanyContext)_localctx).base = match(DATE);
								setState(3742);
								match(TAB);
								setState(3743);
								((CrawlPriceCompanyContext)_localctx).closing = match(NUMBER);
								setState(3744);
								match(TAB);
								setState(3745);
								match(NUMBER);
								setState(3746);
								match(TAB);
								setState(3747);
								((CrawlPriceCompanyContext)_localctx).market = match(NUMBER);
								setState(3748);
								match(TAB);
								setState(3749);
								((CrawlPriceCompanyContext)_localctx).high = match(NUMBER);
								setState(3750);
								match(TAB);
								setState(3751);
								((CrawlPriceCompanyContext)_localctx).low = match(NUMBER);
								setState(3752);
								match(TAB);
								setState(3753);
								((CrawlPriceCompanyContext)_localctx).volume = match(NUMBER);
								setState(3754);
								match(TAB);
								setState(3755);
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
							setState(3759); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3763); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(3765);
				match(WORD);
				setState(3766);
				match(TAB);
				setState(3767);
				match(WORD);
				setState(3768);
				match(TAB);
				setState(3769);
				match(DATE);
				setState(3770);
				match(NEWLINE);
				}
				}
				setState(3774); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(3776);
			match(KEYWORD);
			setState(3777);
			match(TAB);
			setState(3778);
			match(WORD);
			setState(3779);
			match(WORD);
			setState(3780);
			match(TAB);
			setState(3781);
			match(WORD);
			setState(3782);
			match(TAB);
			setState(3783);
			match(WORD);
			setState(3784);
			match(TAB);
			setState(3785);
			match(WORD);
			setState(3786);
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
		enterRule(_localctx, 40, RULE_crawlItemDetailCompanyThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3788);
			match(KEYWORD);
			setState(3789);
			match(TAB);
			setState(3790);
			match(WORD);
			setState(3791);
			match(WORD);
			setState(3792);
			match(TAB);
			setState(3793);
			match(WORD);
			setState(3794);
			match(TAB);
			setState(3795);
			match(WORD);
			setState(3796);
			match(TAB);
			setState(3797);
			match(WORD);
			setState(3798);
			match(NEWLINE);
			setState(3856); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3799);
					match(KEYWORD);
					setState(3800);
					match(TAB);
					setState(3801);
					((CrawlItemDetailCompanyThreadContext)_localctx).code = match(NUMBER);
					setState(3802);
					match(TAB);
					setState(3803);
					((CrawlItemDetailCompanyThreadContext)_localctx).type = match(WORD);
					setState(3804);
					match(TAB);
					setState(3805);
					((CrawlItemDetailCompanyThreadContext)_localctx).symbol = word();
					setState(3807);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
					case 1:
						{
						setState(3806);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(3810);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
					case 1:
						{
						setState(3809);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(3813);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
					case 1:
						{
						setState(3812);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(3816);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
					case 1:
						{
						setState(3815);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(3819);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
					case 1:
						{
						setState(3818);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(3822);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
					case 1:
						{
						setState(3821);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(3827);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(3824);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(3829);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3830);
					match(NEWLINE);
					setState(3831);
					match(KEYWORD);
					setState(3832);
					match(TAB);
					setState(3833);
					((CrawlItemDetailCompanyThreadContext)_localctx).category = match(STRING);
					setState(3834);
					match(NEWLINE);
					setState(3835);
					match(KEYWORD);
					setState(3836);
					match(TAB);
					setState(3837);
					((CrawlItemDetailCompanyThreadContext)_localctx).fics = match(STRING);
					setState(3838);
					match(NEWLINE);
					setState(3839);
					match(KEYWORD);
					setState(3840);
					match(TAB);
					setState(3841);
					((CrawlItemDetailCompanyThreadContext)_localctx).ea = match(NUMBER);
					setState(3842);
					match(WORD);
					setState(3843);
					match(NEWLINE);
					setState(3844);
					match(KEYWORD);
					setState(3845);
					match(TAB);
					setState(3846);
					((CrawlItemDetailCompanyThreadContext)_localctx).ipo = match(DATE);
					setState(3847);
					match(NEWLINE);
					setState(3848);
					match(WORD);
					setState(3849);
					match(TAB);
					setState(3850);
					match(WORD);
					setState(3851);
					match(TAB);
					setState(3852);
					match(DATE);
					setState(3853);
					match(NEWLINE);

							ParserService.item(20240112
								, (((CrawlItemDetailCompanyThreadContext)_localctx).code!=null?((CrawlItemDetailCompanyThreadContext)_localctx).code.getText():null)
								, (((CrawlItemDetailCompanyThreadContext)_localctx).symbol!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol.stop):null), (((CrawlItemDetailCompanyThreadContext)_localctx).symbol1!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol1.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol1.stop):null), (((CrawlItemDetailCompanyThreadContext)_localctx).symbol2!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol2.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol2.stop):null), (((CrawlItemDetailCompanyThreadContext)_localctx).symbol3!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol3.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol3.stop):null), (((CrawlItemDetailCompanyThreadContext)_localctx).symbol4!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol4.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol4.stop):null), (((CrawlItemDetailCompanyThreadContext)_localctx).symbol5!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol5.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol5.stop):null), (((CrawlItemDetailCompanyThreadContext)_localctx).symbol6!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol6.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol6.stop):null), (((CrawlItemDetailCompanyThreadContext)_localctx).symbol7!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).symbol7.start,((CrawlItemDetailCompanyThreadContext)_localctx).symbol7.stop):null)
								, (((CrawlItemDetailCompanyThreadContext)_localctx).category!=null?((CrawlItemDetailCompanyThreadContext)_localctx).category.getText():null), (((CrawlItemDetailCompanyThreadContext)_localctx).fics!=null?((CrawlItemDetailCompanyThreadContext)_localctx).fics.getText():null), null, null, null, null, null, null
								, null
								, (((CrawlItemDetailCompanyThreadContext)_localctx).ipo!=null?((CrawlItemDetailCompanyThreadContext)_localctx).ipo.getText():null)
								, null
								, (((CrawlItemDetailCompanyThreadContext)_localctx).ea!=null?((CrawlItemDetailCompanyThreadContext)_localctx).ea.getText():null)
								, null
							);
						
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3858); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(3860);
			match(KEYWORD);
			setState(3861);
			match(TAB);
			setState(3862);
			match(WORD);
			setState(3863);
			match(WORD);
			setState(3864);
			match(TAB);
			setState(3865);
			match(WORD);
			setState(3866);
			match(TAB);
			setState(3867);
			match(WORD);
			setState(3868);
			match(TAB);
			setState(3869);
			match(WORD);
			setState(3870);
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
		enterRule(_localctx, 42, RULE_crawlItemDividendTopCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3872);
			match(KEYWORD);
			setState(3873);
			match(TAB);
			setState(3874);
			match(WORD);
			setState(3875);
			match(TAB);
			setState(3876);
			match(WORD);
			setState(3877);
			match(WORD);
			setState(3878);
			match(WORD);
			setState(3879);
			match(TAB);
			setState(3880);
			match(WORD);
			setState(3881);
			match(TAB);
			setState(3882);
			match(WORD);
			setState(3883);
			match(NEWLINE);
			setState(3952); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3884);
				match(WORD);
				setState(3885);
				match(TAB);
				setState(3886);
				match(NEWLINE);
				setState(3887);
				match(WORD);
				setState(3888);
				match(TAB);
				setState(3889);
				match(WORD);
				setState(3890);
				match(TAB);
				setState(3891);
				match(WORD);
				setState(3892);
				match(TAB);
				setState(3893);
				match(WORD);
				setState(3894);
				match(TAB);
				setState(3895);
				match(WORD);
				setState(3896);
				match(TAB);
				setState(3897);
				match(WORD);
				setState(3898);
				match(TAB);
				setState(3899);
				match(WORD);
				setState(3900);
				match(TAB);
				setState(3901);
				match(WORD);
				setState(3902);
				match(TAB);
				setState(3903);
				match(WORD);
				setState(3904);
				match(TAB);
				setState(3905);
				match(WORD);
				setState(3906);
				match(TAB);
				setState(3907);
				match(WORD);
				setState(3908);
				match(TAB);
				setState(3909);
				match(NEWLINE);
				setState(3941); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3910);
						((CrawlItemDividendTopCompanyContext)_localctx).type = match(WORD);
						setState(3911);
						match(TAB);
						setState(3912);
						match(NUMBER);
						setState(3913);
						match(TAB);
						setState(3915);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(3914);
							((CrawlItemDividendTopCompanyContext)_localctx).code = match(NUMBER);
							}
						}

						setState(3917);
						match(TAB);
						setState(3919); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(3918);
							word();
							}
							}
							setState(3921); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(3923);
						match(TAB);
						setState(3924);
						match(WORD);
						setState(3925);
						match(TAB);
						setState(3926);
						match(WORD);
						setState(3927);
						match(TAB);
						setState(3928);
						match(NUMBER);
						setState(3929);
						match(TAB);
						setState(3930);
						match(NUMBER);
						setState(3931);
						match(TAB);
						setState(3932);
						match(NUMBER);
						setState(3933);
						match(TAB);
						setState(3934);
						match(NUMBER);
						setState(3935);
						match(TAB);
						setState(3936);
						match(NUMBER);
						setState(3937);
						match(TAB);
						setState(3938);
						match(NEWLINE);

									ParserService.item(20240112
										, (((CrawlItemDividendTopCompanyContext)_localctx).code!=null?((CrawlItemDividendTopCompanyContext)_localctx).code.getText():null)
										, null, null, null, null, null, null, null, null
										, null, null, null, null, null, null, null, null
										, (((CrawlItemDividendTopCompanyContext)_localctx).type!=null?((CrawlItemDividendTopCompanyContext)_localctx).type.getText():null)
										, null
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
					setState(3943); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(3945);
				match(WORD);
				setState(3946);
				match(TAB);
				setState(3947);
				match(WORD);
				setState(3948);
				match(TAB);
				setState(3949);
				match(DATE);
				setState(3950);
				match(NEWLINE);
				}
				}
				setState(3954); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(3956);
			match(KEYWORD);
			setState(3957);
			match(TAB);
			setState(3958);
			match(WORD);
			setState(3959);
			match(TAB);
			setState(3960);
			match(WORD);
			setState(3961);
			match(WORD);
			setState(3962);
			match(WORD);
			setState(3963);
			match(TAB);
			setState(3964);
			match(WORD);
			setState(3965);
			match(TAB);
			setState(3966);
			match(WORD);
			setState(3967);
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
		enterRule(_localctx, 44, RULE_crawlEtfDetailThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3969);
			match(KEYWORD);
			setState(3970);
			match(TAB);
			setState(3971);
			match(WORD);
			setState(3972);
			match(WORD);
			setState(3973);
			match(TAB);
			setState(3974);
			match(WORD);
			setState(3975);
			match(TAB);
			setState(3976);
			match(WORD);
			setState(3977);
			match(NEWLINE);
			setState(4059); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3978);
					match(KEYWORD);
					setState(3979);
					match(TAB);
					setState(3980);
					((CrawlEtfDetailThreadContext)_localctx).code = match(NUMBER);
					setState(3981);
					match(TAB);
					setState(3985);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(3982);
						word();
						}
						}
						setState(3987);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3988);
					match(NEWLINE);
					setState(3989);
					((CrawlEtfDetailThreadContext)_localctx).symbol = word();
					setState(3991);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
					case 1:
						{
						setState(3990);
						((CrawlEtfDetailThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(3994);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
					case 1:
						{
						setState(3993);
						((CrawlEtfDetailThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(3997);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
					case 1:
						{
						setState(3996);
						((CrawlEtfDetailThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(4000);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
					case 1:
						{
						setState(3999);
						((CrawlEtfDetailThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(4003);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
					case 1:
						{
						setState(4002);
						((CrawlEtfDetailThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(4006);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
					case 1:
						{
						setState(4005);
						((CrawlEtfDetailThreadContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(4011);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(4008);
						((CrawlEtfDetailThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(4013);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(4014);
					match(NEWLINE);
					setState(4015);
					((CrawlEtfDetailThreadContext)_localctx).category = word();
					setState(4017);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
					case 1:
						{
						setState(4016);
						((CrawlEtfDetailThreadContext)_localctx).category1 = word();
						}
						break;
					}
					setState(4020);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
					case 1:
						{
						setState(4019);
						((CrawlEtfDetailThreadContext)_localctx).category2 = word();
						}
						break;
					}
					setState(4023);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
					case 1:
						{
						setState(4022);
						((CrawlEtfDetailThreadContext)_localctx).category3 = word();
						}
						break;
					}
					setState(4026);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
					case 1:
						{
						setState(4025);
						((CrawlEtfDetailThreadContext)_localctx).category4 = word();
						}
						break;
					}
					setState(4029);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
					case 1:
						{
						setState(4028);
						((CrawlEtfDetailThreadContext)_localctx).category5 = word();
						}
						break;
					}
					setState(4032);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
					case 1:
						{
						setState(4031);
						((CrawlEtfDetailThreadContext)_localctx).category6 = word();
						}
						break;
					}
					setState(4037);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(4034);
						((CrawlEtfDetailThreadContext)_localctx).category7 = word();
						}
						}
						setState(4039);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(4040);
					match(NEWLINE);
					setState(4041);
					((CrawlEtfDetailThreadContext)_localctx).ipo = match(DATE);
					setState(4045);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WORD) {
						{
						{
						setState(4042);
						match(WORD);
						}
						}
						setState(4047);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(4048);
					match(NEWLINE);
					setState(4049);
					((CrawlEtfDetailThreadContext)_localctx).fee = word();
					setState(4050);
					match(NEWLINE);
					setState(4051);
					match(WORD);
					setState(4052);
					match(TAB);
					setState(4053);
					match(WORD);
					setState(4054);
					match(TAB);
					setState(4055);
					match(DATE);
					setState(4056);
					match(NEWLINE);

								ParserService.item(20240112
									, (((CrawlEtfDetailThreadContext)_localctx).code!=null?((CrawlEtfDetailThreadContext)_localctx).code.getText():null)
									, (((CrawlEtfDetailThreadContext)_localctx).symbol!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol.start,((CrawlEtfDetailThreadContext)_localctx).symbol.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol1!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol1.start,((CrawlEtfDetailThreadContext)_localctx).symbol1.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol2!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol2.start,((CrawlEtfDetailThreadContext)_localctx).symbol2.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol3!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol3.start,((CrawlEtfDetailThreadContext)_localctx).symbol3.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol4!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol4.start,((CrawlEtfDetailThreadContext)_localctx).symbol4.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol5!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol5.start,((CrawlEtfDetailThreadContext)_localctx).symbol5.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol6!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol6.start,((CrawlEtfDetailThreadContext)_localctx).symbol6.stop):null), (((CrawlEtfDetailThreadContext)_localctx).symbol7!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).symbol7.start,((CrawlEtfDetailThreadContext)_localctx).symbol7.stop):null)
									, (((CrawlEtfDetailThreadContext)_localctx).category!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category.start,((CrawlEtfDetailThreadContext)_localctx).category.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category1!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category1.start,((CrawlEtfDetailThreadContext)_localctx).category1.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category2!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category2.start,((CrawlEtfDetailThreadContext)_localctx).category2.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category3!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category3.start,((CrawlEtfDetailThreadContext)_localctx).category3.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category4!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category4.start,((CrawlEtfDetailThreadContext)_localctx).category4.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category5!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category5.start,((CrawlEtfDetailThreadContext)_localctx).category5.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category6!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category6.start,((CrawlEtfDetailThreadContext)_localctx).category6.stop):null), (((CrawlEtfDetailThreadContext)_localctx).category7!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).category7.start,((CrawlEtfDetailThreadContext)_localctx).category7.stop):null)
									, null
									, (((CrawlEtfDetailThreadContext)_localctx).ipo!=null?((CrawlEtfDetailThreadContext)_localctx).ipo.getText():null)
									, null
									, null
									, (((CrawlEtfDetailThreadContext)_localctx).fee!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).fee.start,((CrawlEtfDetailThreadContext)_localctx).fee.stop):null)
								);
							
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(4061); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(4063);
			match(KEYWORD);
			setState(4064);
			match(TAB);
			setState(4065);
			match(WORD);
			setState(4066);
			match(WORD);
			setState(4067);
			match(TAB);
			setState(4068);
			match(WORD);
			setState(4069);
			match(TAB);
			setState(4070);
			match(WORD);
			setState(4071);
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
		enterRule(_localctx, 46, RULE_crawlDividendHistoryEtfThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(4073);
			match(KEYWORD);
			setState(4074);
			match(TAB);
			setState(4075);
			match(WORD);
			setState(4076);
			match(WORD);
			setState(4077);
			match(WORD);
			setState(4078);
			match(TAB);
			setState(4079);
			match(WORD);
			setState(4080);
			match(WORD);
			setState(4081);
			match(WORD);
			setState(4082);
			match(TAB);
			setState(4083);
			match(WORD);
			setState(4084);
			match(TAB);
			setState(4085);
			match(WORD);
			setState(4086);
			match(NEWLINE);
			setState(4191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4087);
				match(WORD);
				setState(4088);
				match(TAB);
				setState(4090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORD) {
					{
					setState(4089);
					match(WORD);
					}
				}

				setState(4092);
				match(TAB);
				setState(4093);
				match(WORD);
				setState(4094);
				match(TAB);
				setState(4095);
				match(WORD);
				setState(4096);
				match(TAB);
				setState(4097);
				match(WORD);
				setState(4098);
				match(TAB);
				setState(4099);
				match(WORD);
				setState(4100);
				match(TAB);
				setState(4101);
				match(WORD);
				setState(4102);
				match(TAB);
				setState(4103);
				match(WORD);
				setState(4104);
				match(TAB);
				setState(4105);
				match(WORD);
				setState(4106);
				match(TAB);
				setState(4107);
				match(WORD);
				setState(4108);
				match(TAB);
				setState(4109);
				match(NEWLINE);
				setState(4181); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(4181);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case TAB:
							{
							{
							setState(4110);
							match(TAB);
							setState(4111);
							match(TAB);
							setState(4112);
							match(TAB);
							setState(4113);
							match(TAB);
							setState(4114);
							match(TAB);
							setState(4115);
							match(TAB);
							setState(4116);
							match(TAB);
							setState(4117);
							match(TAB);
							setState(4118);
							match(TAB);
							setState(4119);
							match(TAB);
							setState(4120);
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
							setState(4121);
							((CrawlDividendHistoryEtfThreadContext)_localctx).symbol = word();
							setState(4123);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
							case 1:
								{
								setState(4122);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(4126);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
							case 1:
								{
								setState(4125);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(4129);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
							case 1:
								{
								setState(4128);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(4132);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
							case 1:
								{
								setState(4131);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(4135);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
							case 1:
								{
								setState(4134);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(4138);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
							case 1:
								{
								setState(4137);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(4143);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(4140);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol7 = word();
								}
								}
								setState(4145);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(4146);
							match(TAB);
							setState(4147);
							((CrawlDividendHistoryEtfThreadContext)_localctx).code = match(WORD);
							setState(4148);
							match(TAB);
							setState(4149);
							match(WORD);
							setState(4150);
							match(TAB);
							setState(4154);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(4151);
								word();
								}
								}
								setState(4156);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(4157);
							match(TAB);
							setState(4159);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==DATE) {
								{
								setState(4158);
								((CrawlDividendHistoryEtfThreadContext)_localctx).base = match(DATE);
								}
							}

							setState(4161);
							match(TAB);
							setState(4162);
							((CrawlDividendHistoryEtfThreadContext)_localctx).pay = match(DATE);
							setState(4163);
							match(TAB);
							setState(4165);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==WORD) {
								{
								setState(4164);
								match(WORD);
								}
							}

							setState(4167);
							match(TAB);
							setState(4168);
							((CrawlDividendHistoryEtfThreadContext)_localctx).dividend = match(NUMBER);
							setState(4169);
							match(TAB);
							setState(4171);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NUMBER) {
								{
								setState(4170);
								((CrawlDividendHistoryEtfThreadContext)_localctx).price = match(NUMBER);
								}
							}

							setState(4173);
							match(TAB);
							setState(4175);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NUMBER) {
								{
								setState(4174);
								((CrawlDividendHistoryEtfThreadContext)_localctx).ratio = match(NUMBER);
								}
							}

							setState(4177);
							match(TAB);
							setState(4178);
							match(NEWLINE);

												ParserService.dividend(20231127
													, (((CrawlDividendHistoryEtfThreadContext)_localctx).code!=null?((CrawlDividendHistoryEtfThreadContext)_localctx).code.getText():null)
													, (((CrawlDividendHistoryEtfThreadContext)_localctx).base!=null?((CrawlDividendHistoryEtfThreadContext)_localctx).base.getText():null), (((CrawlDividendHistoryEtfThreadContext)_localctx).pay!=null?((CrawlDividendHistoryEtfThreadContext)_localctx).pay.getText():null), (((CrawlDividendHistoryEtfThreadContext)_localctx).dividend!=null?((CrawlDividendHistoryEtfThreadContext)_localctx).dividend.getText():null)
													, null, null
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
					setState(4183); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(4185);
				match(WORD);
				setState(4186);
				match(TAB);
				setState(4187);
				match(WORD);
				setState(4188);
				match(TAB);
				setState(4189);
				match(DATE);
				setState(4190);
				match(NEWLINE);
				}
				}
				setState(4193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(4195);
			match(KEYWORD);
			setState(4196);
			match(TAB);
			setState(4197);
			match(WORD);
			setState(4198);
			match(WORD);
			setState(4199);
			match(WORD);
			setState(4200);
			match(TAB);
			setState(4201);
			match(WORD);
			setState(4202);
			match(WORD);
			setState(4203);
			match(WORD);
			setState(4204);
			match(TAB);
			setState(4205);
			match(WORD);
			setState(4206);
			match(TAB);
			setState(4207);
			match(WORD);
			setState(4208);
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
		enterRule(_localctx, 48, RULE_crawlDividendHistoryCompanyThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(4210);
			match(KEYWORD);
			setState(4211);
			match(TAB);
			setState(4212);
			match(WORD);
			setState(4213);
			match(TAB);
			setState(4214);
			match(WORD);
			setState(4215);
			match(WORD);
			setState(4216);
			match(WORD);
			setState(4217);
			match(TAB);
			setState(4218);
			match(WORD);
			setState(4219);
			match(TAB);
			setState(4220);
			match(WORD);
			setState(4221);
			match(NEWLINE);
			setState(4348); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4338); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(4222);
						match(WORD);
						setState(4223);
						match(TAB);
						setState(4224);
						match(WORD);
						setState(4225);
						match(NEWLINE);
						setState(4226);
						match(WORD);
						setState(4227);
						match(TAB);
						setState(4228);
						match(WORD);
						setState(4229);
						match(NEWLINE);
						setState(4230);
						match(WORD);
						setState(4231);
						match(TAB);
						setState(4232);
						match(WORD);
						setState(4233);
						match(TAB);
						setState(4234);
						match(WORD);
						setState(4235);
						match(TAB);
						setState(4236);
						match(WORD);
						setState(4237);
						match(TAB);
						setState(4238);
						match(WORD);
						setState(4239);
						match(TAB);
						setState(4240);
						match(WORD);
						setState(4241);
						match(TAB);
						setState(4242);
						match(WORD);
						setState(4243);
						match(TAB);
						setState(4244);
						match(WORD);
						setState(4245);
						match(TAB);
						setState(4246);
						match(WORD);
						setState(4247);
						match(TAB);
						setState(4248);
						match(WORD);
						setState(4249);
						match(TAB);
						setState(4250);
						match(WORD);
						setState(4251);
						match(TAB);
						setState(4252);
						match(WORD);
						setState(4253);
						match(TAB);
						setState(4254);
						match(NEWLINE);
						setState(4255);
						match(WORD);
						setState(4256);
						match(TAB);
						setState(4257);
						match(WORD);
						setState(4258);
						match(TAB);
						setState(4259);
						match(WORD);
						setState(4260);
						match(TAB);
						setState(4261);
						match(WORD);
						setState(4262);
						match(TAB);
						setState(4263);
						match(WORD);
						setState(4264);
						match(TAB);
						setState(4265);
						match(WORD);
						setState(4266);
						match(TAB);
						setState(4267);
						match(NEWLINE);
						setState(4334); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(4334);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case TAB:
								{
								{
								setState(4268);
								match(TAB);
								setState(4269);
								match(TAB);
								setState(4270);
								match(TAB);
								setState(4271);
								match(TAB);
								setState(4272);
								match(TAB);
								setState(4273);
								match(TAB);
								setState(4274);
								match(TAB);
								setState(4275);
								match(TAB);
								setState(4276);
								match(TAB);
								setState(4277);
								match(TAB);
								setState(4278);
								match(TAB);
								setState(4279);
								match(TAB);
								setState(4280);
								match(TAB);
								setState(4281);
								match(TAB);
								setState(4282);
								match(TAB);
								setState(4283);
								match(TAB);
								setState(4284);
								match(TAB);
								setState(4285);
								match(NEWLINE);
								}
								}
								break;
							case DATE:
								{
								{
								setState(4286);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).base = match(DATE);
								setState(4287);
								match(TAB);
								setState(4289);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(4288);
									((CrawlDividendHistoryCompanyThreadContext)_localctx).pay = match(DATE);
									}
								}

								setState(4291);
								match(TAB);
								setState(4293);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(4292);
									match(DATE);
									}
								}

								setState(4295);
								match(TAB);
								setState(4296);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).code = match(NUMBER);
								setState(4297);
								match(TAB);
								setState(4299); 
								_errHandler.sync(this);
								_la = _input.LA(1);
								do {
									{
									{
									setState(4298);
									((CrawlDividendHistoryCompanyThreadContext)_localctx).symbol = word();
									}
									}
									setState(4301); 
									_errHandler.sync(this);
									_la = _input.LA(1);
								} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
								setState(4303);
								match(TAB);
								setState(4304);
								match(WORD);
								setState(4305);
								match(TAB);
								setState(4306);
								match(WORD);
								setState(4307);
								match(TAB);
								setState(4308);
								match(WORD);
								setState(4309);
								match(TAB);
								setState(4310);
								match(WORD);
								setState(4311);
								match(TAB);
								setState(4312);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).dividend = match(NUMBER);
								setState(4313);
								match(TAB);
								setState(4315);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(4314);
									match(NUMBER);
									}
								}

								setState(4317);
								match(TAB);
								setState(4318);
								match(NUMBER);
								setState(4319);
								match(TAB);
								setState(4320);
								match(NUMBER);
								setState(4321);
								match(TAB);
								setState(4323);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(4322);
									match(NUMBER);
									}
								}

								setState(4325);
								match(TAB);
								setState(4326);
								match(TAB);
								setState(4327);
								match(NUMBER);
								setState(4328);
								match(TAB);
								setState(4329);
								match(NUMBER);
								setState(4330);
								match(TAB);
								setState(4331);
								match(NEWLINE);

														ParserService.dividend(20231127
															, (((CrawlDividendHistoryCompanyThreadContext)_localctx).code!=null?((CrawlDividendHistoryCompanyThreadContext)_localctx).code.getText():null)
															, (((CrawlDividendHistoryCompanyThreadContext)_localctx).base!=null?((CrawlDividendHistoryCompanyThreadContext)_localctx).base.getText():null), (((CrawlDividendHistoryCompanyThreadContext)_localctx).pay!=null?((CrawlDividendHistoryCompanyThreadContext)_localctx).pay.getText():null), (((CrawlDividendHistoryCompanyThreadContext)_localctx).dividend!=null?((CrawlDividendHistoryCompanyThreadContext)_localctx).dividend.getText():null)
															, null, null
														);
													
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							}
							setState(4336); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(4340); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(4342);
				match(WORD);
				setState(4343);
				match(TAB);
				setState(4344);
				match(WORD);
				setState(4345);
				match(TAB);
				setState(4346);
				match(DATE);
				setState(4347);
				match(NEWLINE);
				}
				}
				setState(4350); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(4352);
			match(KEYWORD);
			setState(4353);
			match(TAB);
			setState(4354);
			match(WORD);
			setState(4355);
			match(TAB);
			setState(4356);
			match(WORD);
			setState(4357);
			match(WORD);
			setState(4358);
			match(WORD);
			setState(4359);
			match(TAB);
			setState(4360);
			match(WORD);
			setState(4361);
			match(TAB);
			setState(4362);
			match(WORD);
			setState(4363);
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
		enterRule(_localctx, 50, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4365);
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
		enterRule(_localctx, 52, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4369); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(4369);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(4367);
					word();
					}
					break;
				case TAB:
					{
					setState(4368);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(4371); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(4373);
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
		enterRule(_localctx, 54, RULE_eof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4378); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(4378);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(4375);
					word();
					}
					break;
				case TAB:
					{
					setState(4376);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(4377);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(4380); 
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
		"\u0004\u0001\n\u111f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000Q\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"\u008c\b\u0001\u000b\u0001\f\u0001\u008d\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0004\u0001\u0094\b\u0001\u000b\u0001\f\u0001\u0095"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u00a4\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00a8\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00ae"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00b2\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u00b6\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"\u00c0\b\u0001\n\u0001\f\u0001\u00c3\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u00cb\b\u0001\u000b"+
		"\u0001\f\u0001\u00cc\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u0114"+
		"\b\u0002\u000b\u0002\f\u0002\u0115\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"\u012c\b\u0002\n\u0002\f\u0002\u012f\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u0137\b\u0002\u000b"+
		"\u0002\f\u0002\u0138\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u016c\b\u0003\u000b\u0003\f"+
		"\u0003\u016d\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0197\b\u0003"+
		"\n\u0003\f\u0003\u019a\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u01a2\b\u0003\u000b\u0003\f"+
		"\u0003\u01a3\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004"+
		"\u01e6\b\u0004\u000b\u0004\f\u0004\u01e7\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u01f1"+
		"\b\u0004\u000b\u0004\f\u0004\u01f2\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
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
		"\u0001\u0005\u0004\u0005\u0247\b\u0005\u000b\u0005\f\u0005\u0248\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0004\u0005\u0252\b\u0005\u000b\u0005\f\u0005\u0253\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0279\b\u0006"+
		"\u0001\u0006\u0003\u0006\u027c\b\u0006\u0001\u0006\u0003\u0006\u027f\b"+
		"\u0006\u0001\u0006\u0003\u0006\u0282\b\u0006\u0001\u0006\u0003\u0006\u0285"+
		"\b\u0006\u0001\u0006\u0003\u0006\u0288\b\u0006\u0001\u0006\u0005\u0006"+
		"\u028b\b\u0006\n\u0006\f\u0006\u028e\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u02af"+
		"\b\u0006\u000b\u0006\f\u0006\u02b0\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u02d1\b\u0007\u000b\u0007"+
		"\f\u0007\u02d2\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02d8\b"+
		"\u0007\u0001\u0007\u0003\u0007\u02db\b\u0007\u0001\u0007\u0003\u0007\u02de"+
		"\b\u0007\u0001\u0007\u0003\u0007\u02e1\b\u0007\u0001\u0007\u0003\u0007"+
		"\u02e4\b\u0007\u0001\u0007\u0003\u0007\u02e7\b\u0007\u0001\u0007\u0005"+
		"\u0007\u02ea\b\u0007\n\u0007\f\u0007\u02ed\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u02f2\b\u0007\u0001\u0007\u0003\u0007\u02f5\b"+
		"\u0007\u0001\u0007\u0003\u0007\u02f8\b\u0007\u0001\u0007\u0003\u0007\u02fb"+
		"\b\u0007\u0001\u0007\u0003\u0007\u02fe\b\u0007\u0001\u0007\u0003\u0007"+
		"\u0301\b\u0007\u0001\u0007\u0005\u0007\u0304\b\u0007\n\u0007\f\u0007\u0307"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u030c\b\u0007"+
		"\u000b\u0007\f\u0007\u030d\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u0317\b\u0007\u000b\u0007"+
		"\f\u0007\u0318\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007\u0322\b\u0007\u000b\u0007\f\u0007"+
		"\u0323\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
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
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u041f\b\b\u000b\b\f\b\u0420"+
		"\u0004\b\u0423\b\b\u000b\b\f\b\u0424\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0004\b\u042d\b\b\u000b\b\f\b\u042e\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004"+
		"\t\u04b1\b\t\u000b\t\f\t\u04b2\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u04c7\b\t\u000b\t\f\t\u04c8"+
		"\u0004\t\u04cb\b\t\u000b\t\f\t\u04cc\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0004\t\u04d6\b\t\u000b\t\f\t\u04d7\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0500\b\n\u0001\n\u0003\n\u0503\b\n\u0001\n\u0003\n\u0506\b"+
		"\n\u0001\n\u0003\n\u0509\b\n\u0001\n\u0003\n\u050c\b\n\u0001\n\u0003\n"+
		"\u050f\b\n\u0001\n\u0005\n\u0512\b\n\n\n\f\n\u0515\t\n\u0001\n\u0001\n"+
		"\u0004\n\u0519\b\n\u000b\n\f\n\u051a\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u0549\b\n\u0001\n\u0003\n\u054c\b\n"+
		"\u0001\n\u0003\n\u054f\b\n\u0001\n\u0003\n\u0552\b\n\u0001\n\u0003\n\u0555"+
		"\b\n\u0001\n\u0003\n\u0558\b\n\u0001\n\u0005\n\u055b\b\n\n\n\f\n\u055e"+
		"\t\n\u0001\n\u0001\n\u0004\n\u0562\b\n\u000b\n\f\n\u0563\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0004\n\u056b\b\n\u000b\n\f\n\u056c\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0575\b\n\u0001\n\u0005"+
		"\n\u0578\b\n\n\n\f\n\u057b\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u05aa\b\u000b\u0001\u000b\u0003"+
		"\u000b\u05ad\b\u000b\u0001\u000b\u0003\u000b\u05b0\b\u000b\u0001\u000b"+
		"\u0003\u000b\u05b3\b\u000b\u0001\u000b\u0003\u000b\u05b6\b\u000b\u0001"+
		"\u000b\u0003\u000b\u05b9\b\u000b\u0001\u000b\u0005\u000b\u05bc\b\u000b"+
		"\n\u000b\f\u000b\u05bf\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u05c7\b\u000b\u000b\u000b\f"+
		"\u000b\u05c8\u0001\u000b\u0001\u000b\u0004\u000b\u05cd\b\u000b\u000b\u000b"+
		"\f\u000b\u05ce\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b"+
		"\u05e1\b\u000b\u000b\u000b\f\u000b\u05e2\u0001\u000b\u0001\u000b\u0004"+
		"\u000b\u05e7\b\u000b\u000b\u000b\f\u000b\u05e8\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0619\b\u000b\u0001\u000b\u0003\u000b"+
		"\u061c\b\u000b\u0001\u000b\u0003\u000b\u061f\b\u000b\u0001\u000b\u0003"+
		"\u000b\u0622\b\u000b\u0001\u000b\u0003\u000b\u0625\b\u000b\u0001\u000b"+
		"\u0003\u000b\u0628\b\u000b\u0001\u000b\u0005\u000b\u062b\b\u000b\n\u000b"+
		"\f\u000b\u062e\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0004\u000b\u0636\b\u000b\u000b\u000b\f\u000b"+
		"\u0637\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004"+
		"\u000b\u063f\b\u000b\u000b\u000b\f\u000b\u0640\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0004\f\u06de\b\f\u000b\f\f\f\u06df\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u06e8\b\f\u0001\f\u0003\f\u06eb\b\f\u0001"+
		"\f\u0003\f\u06ee\b\f\u0001\f\u0003\f\u06f1\b\f\u0001\f\u0003\f\u06f4\b"+
		"\f\u0001\f\u0003\f\u06f7\b\f\u0001\f\u0005\f\u06fa\b\f\n\f\f\f\u06fd\t"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u0706"+
		"\b\f\u000b\f\f\f\u0707\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0004\f\u0712\b\f\u000b\f\f\f\u0713\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0004\f\u071a\b\f\u000b\f\f\f\u071b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0004\f\u0722\b\f\u000b\f\f\f\u0723\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u0743"+
		"\b\f\u000b\f\f\f\u0744\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0004\f\u0759\b\f\u000b\f\f\f\u075a\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u0764\b\f\u000b"+
		"\f\f\f\u0765\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u08cb\b\r\u000b\r\f"+
		"\r\u08cc\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u08d6\b\r\u0001\r\u0003\r\u08d9\b\r\u0001\r\u0003\r\u08dc\b\r\u0001"+
		"\r\u0003\r\u08df\b\r\u0001\r\u0003\r\u08e2\b\r\u0001\r\u0003\r\u08e5\b"+
		"\r\u0001\r\u0005\r\u08e8\b\r\n\r\f\r\u08eb\t\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0004\r\u08f3\b\r\u000b\r\f\r\u08f4\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u090e\b\r\n\r\f\r\u0911\t\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u091b"+
		"\b\r\n\r\f\r\u091e\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0004\r\u0932\b\r\u000b\r\f\r\u0933\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u093d\b\r\u000b"+
		"\r\f\r\u093e\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0994\b\u000e\u0001\u000e\u0003\u000e\u0997\b"+
		"\u000e\u0001\u000e\u0003\u000e\u099a\b\u000e\u0001\u000e\u0003\u000e\u099d"+
		"\b\u000e\u0001\u000e\u0003\u000e\u09a0\b\u000e\u0001\u000e\u0003\u000e"+
		"\u09a3\b\u000e\u0001\u000e\u0005\u000e\u09a6\b\u000e\n\u000e\f\u000e\u09a9"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0004\u000e\u09f9\b\u000e\u000b\u000e\f\u000e\u09fa\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u0a1e\b\u000e\u0001\u000e\u0003\u000e"+
		"\u0a21\b\u000e\u0001\u000e\u0003\u000e\u0a24\b\u000e\u0001\u000e\u0003"+
		"\u000e\u0a27\b\u000e\u0001\u000e\u0003\u000e\u0a2a\b\u000e\u0001\u000e"+
		"\u0003\u000e\u0a2d\b\u000e\u0001\u000e\u0005\u000e\u0a30\b\u000e\n\u000e"+
		"\f\u000e\u0a33\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0004\u000e\u0a45\b\u000e\u000b\u000e\f\u000e\u0a46\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004"+
		"\u000e\u0a50\b\u000e\u000b\u000e\f\u000e\u0a51\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0ba7\b\u000f\u0001\u000f\u0003\u000f\u0baa\b"+
		"\u000f\u0001\u000f\u0003\u000f\u0bad\b\u000f\u0001\u000f\u0003\u000f\u0bb0"+
		"\b\u000f\u0001\u000f\u0003\u000f\u0bb3\b\u000f\u0001\u000f\u0003\u000f"+
		"\u0bb6\b\u000f\u0001\u000f\u0005\u000f\u0bb9\b\u000f\n\u000f\f\u000f\u0bbc"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0bc5\b\u000f\n\u000f\f\u000f\u0bc8\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0bd0\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0c1d\b\u000f\u0001\u000f\u0003\u000f\u0c20\b\u000f\u0001\u000f\u0003"+
		"\u000f\u0c23\b\u000f\u0001\u000f\u0003\u000f\u0c26\b\u000f\u0001\u000f"+
		"\u0003\u000f\u0c29\b\u000f\u0001\u000f\u0003\u000f\u0c2c\b\u000f\u0001"+
		"\u000f\u0005\u000f\u0c2f\b\u000f\n\u000f\f\u000f\u0c32\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u0c44\b\u000f\u000b\u000f"+
		"\f\u000f\u0c45\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0004\u000f\u0c4f\b\u000f\u000b\u000f\f\u000f"+
		"\u0c50\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0004"+
		"\u0010\u0ca6\b\u0010\u000b\u0010\f\u0010\u0ca7\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0cf1\b\u0010\u0001\u0010"+
		"\u0003\u0010\u0cf4\b\u0010\u0001\u0010\u0003\u0010\u0cf7\b\u0010\u0001"+
		"\u0010\u0003\u0010\u0cfa\b\u0010\u0001\u0010\u0003\u0010\u0cfd\b\u0010"+
		"\u0001\u0010\u0003\u0010\u0d00\b\u0010\u0001\u0010\u0005\u0010\u0d03\b"+
		"\u0010\n\u0010\f\u0010\u0d06\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0004\u0010\u0d12\b\u0010\u000b\u0010\f\u0010\u0d13\u0003"+
		"\u0010\u0d16\b\u0010\u0004\u0010\u0d18\b\u0010\u000b\u0010\f\u0010\u0d19"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0004\u0010\u0d22\b\u0010\u000b\u0010\f\u0010\u0d23\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0d62"+
		"\b\u0011\u0001\u0011\u0003\u0011\u0d65\b\u0011\u0001\u0011\u0003\u0011"+
		"\u0d68\b\u0011\u0001\u0011\u0003\u0011\u0d6b\b\u0011\u0001\u0011\u0003"+
		"\u0011\u0d6e\b\u0011\u0001\u0011\u0003\u0011\u0d71\b\u0011\u0001\u0011"+
		"\u0005\u0011\u0d74\b\u0011\n\u0011\f\u0011\u0d77\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0d7e\b\u0011\u0001"+
		"\u0011\u0003\u0011\u0d81\b\u0011\u0001\u0011\u0003\u0011\u0d84\b\u0011"+
		"\u0001\u0011\u0003\u0011\u0d87\b\u0011\u0001\u0011\u0003\u0011\u0d8a\b"+
		"\u0011\u0001\u0011\u0003\u0011\u0d8d\b\u0011\u0001\u0011\u0005\u0011\u0d90"+
		"\b\u0011\n\u0011\f\u0011\u0d93\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0d9f\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0da8\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0004\u0011\u0db0\b\u0011\u000b\u0011\f\u0011\u0db1\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0004"+
		"\u0011\u0dbb\b\u0011\u000b\u0011\f\u0011\u0dbc\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0004\u0012\u0dda\b\u0012\u000b\u0012\f\u0012\u0ddb\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0de3"+
		"\b\u0012\u0001\u0012\u0003\u0012\u0de6\b\u0012\u0001\u0012\u0003\u0012"+
		"\u0de9\b\u0012\u0001\u0012\u0003\u0012\u0dec\b\u0012\u0001\u0012\u0003"+
		"\u0012\u0def\b\u0012\u0001\u0012\u0003\u0012\u0df2\b\u0012\u0001\u0012"+
		"\u0005\u0012\u0df5\b\u0012\n\u0012\f\u0012\u0df8\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0dff\b\u0012\u0001"+
		"\u0012\u0003\u0012\u0e02\b\u0012\u0001\u0012\u0003\u0012\u0e05\b\u0012"+
		"\u0001\u0012\u0003\u0012\u0e08\b\u0012\u0001\u0012\u0003\u0012\u0e0b\b"+
		"\u0012\u0001\u0012\u0003\u0012\u0e0e\b\u0012\u0001\u0012\u0005\u0012\u0e11"+
		"\b\u0012\n\u0012\f\u0012\u0e14\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0e38\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0e3c\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0e40\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0e44\b\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0e48\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0e50\b\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0004\u0012\u0e55\b\u0012\u000b\u0012\f\u0012\u0e56\u0004\u0012"+
		"\u0e59\b\u0012\u000b\u0012\f\u0012\u0e5a\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u0e64"+
		"\b\u0012\u000b\u0012\f\u0012\u0e65\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0004\u0013"+
		"\u0e82\b\u0013\u000b\u0013\f\u0013\u0e83\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0004\u0013\u0eae\b\u0013\u000b\u0013\f\u0013\u0eaf"+
		"\u0004\u0013\u0eb2\b\u0013\u000b\u0013\f\u0013\u0eb3\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0004"+
		"\u0013\u0ebd\b\u0013\u000b\u0013\f\u0013\u0ebe\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0ee0\b\u0014\u0001\u0014\u0003\u0014\u0ee3\b\u0014\u0001\u0014\u0003"+
		"\u0014\u0ee6\b\u0014\u0001\u0014\u0003\u0014\u0ee9\b\u0014\u0001\u0014"+
		"\u0003\u0014\u0eec\b\u0014\u0001\u0014\u0003\u0014\u0eef\b\u0014\u0001"+
		"\u0014\u0005\u0014\u0ef2\b\u0014\n\u0014\f\u0014\u0ef5\t\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0004\u0014\u0f11\b\u0014\u000b\u0014\f\u0014\u0f12\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0f4c\b\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u0f50"+
		"\b\u0015\u000b\u0015\f\u0015\u0f51\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u0f66\b\u0015\u000b\u0015"+
		"\f\u0015\u0f67\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0004\u0015\u0f71\b\u0015\u000b\u0015\f\u0015"+
		"\u0f72\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0f90\b\u0016\n"+
		"\u0016\f\u0016\u0f93\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0f98\b\u0016\u0001\u0016\u0003\u0016\u0f9b\b\u0016\u0001\u0016"+
		"\u0003\u0016\u0f9e\b\u0016\u0001\u0016\u0003\u0016\u0fa1\b\u0016\u0001"+
		"\u0016\u0003\u0016\u0fa4\b\u0016\u0001\u0016\u0003\u0016\u0fa7\b\u0016"+
		"\u0001\u0016\u0005\u0016\u0faa\b\u0016\n\u0016\f\u0016\u0fad\t\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0fb2\b\u0016\u0001\u0016\u0003"+
		"\u0016\u0fb5\b\u0016\u0001\u0016\u0003\u0016\u0fb8\b\u0016\u0001\u0016"+
		"\u0003\u0016\u0fbb\b\u0016\u0001\u0016\u0003\u0016\u0fbe\b\u0016\u0001"+
		"\u0016\u0003\u0016\u0fc1\b\u0016\u0001\u0016\u0005\u0016\u0fc4\b\u0016"+
		"\n\u0016\f\u0016\u0fc7\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u0fcc\b\u0016\n\u0016\f\u0016\u0fcf\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0004\u0016\u0fdc\b\u0016\u000b\u0016"+
		"\f\u0016\u0fdd\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0ffb\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u101c\b\u0017\u0001\u0017\u0003\u0017\u101f\b"+
		"\u0017\u0001\u0017\u0003\u0017\u1022\b\u0017\u0001\u0017\u0003\u0017\u1025"+
		"\b\u0017\u0001\u0017\u0003\u0017\u1028\b\u0017\u0001\u0017\u0003\u0017"+
		"\u102b\b\u0017\u0001\u0017\u0005\u0017\u102e\b\u0017\n\u0017\f\u0017\u1031"+
		"\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u1039\b\u0017\n\u0017\f\u0017\u103c\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u1040\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u1046\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u104c\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u1050\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0004\u0017"+
		"\u1056\b\u0017\u000b\u0017\f\u0017\u1057\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0004\u0017\u1060\b\u0017\u000b"+
		"\u0017\f\u0017\u1061\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u10c2\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u10c6\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0004\u0018\u10cc\b\u0018"+
		"\u000b\u0018\f\u0018\u10cd\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u10dc\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u10e4\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0004\u0018\u10ef\b\u0018\u000b\u0018"+
		"\f\u0018\u10f0\u0004\u0018\u10f3\b\u0018\u000b\u0018\f\u0018\u10f4\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0004"+
		"\u0018\u10fd\b\u0018\u000b\u0018\f\u0018\u10fe\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0004\u001a\u1112\b\u001a\u000b\u001a"+
		"\f\u001a\u1113\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0004\u001b\u111b\b\u001b\u000b\u001b\f\u001b\u111c\u0001\u001b\u0000"+
		"\u0000\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.0246\u0000\u0001\u0001\u0000\u0005\n"+
		"\u122f\u0000P\u0001\u0000\u0000\u0000\u0002R\u0001\u0000\u0000\u0000\u0004"+
		"\u00d9\u0001\u0000\u0000\u0000\u0006\u0147\u0001\u0000\u0000\u0000\b\u01b2"+
		"\u0001\u0000\u0000\u0000\n\u0201\u0001\u0000\u0000\u0000\f\u0264\u0001"+
		"\u0000\u0000\u0000\u000e\u02bf\u0001\u0000\u0000\u0000\u0010\u0332\u0001"+
		"\u0000\u0000\u0000\u0012\u043f\u0001\u0000\u0000\u0000\u0014\u04e8\u0001"+
		"\u0000\u0000\u0000\u0016\u0598\u0001\u0000\u0000\u0000\u0018\u0659\u0001"+
		"\u0000\u0000\u0000\u001a\u0775\u0001\u0000\u0000\u0000\u001c\u094e\u0001"+
		"\u0000\u0000\u0000\u001e\u0a5f\u0001\u0000\u0000\u0000 \u0c60\u0001\u0000"+
		"\u0000\u0000\"\u0d2e\u0001\u0000\u0000\u0000$\u0dcb\u0001\u0000\u0000"+
		"\u0000&\u0e73\u0001\u0000\u0000\u0000(\u0ecc\u0001\u0000\u0000\u0000*"+
		"\u0f20\u0001\u0000\u0000\u0000,\u0f81\u0001\u0000\u0000\u0000.\u0fe9\u0001"+
		"\u0000\u0000\u00000\u1072\u0001\u0000\u0000\u00002\u110d\u0001\u0000\u0000"+
		"\u00004\u1111\u0001\u0000\u0000\u00006\u111a\u0001\u0000\u0000\u00008"+
		"Q\u00030\u0018\u00009Q\u0003.\u0017\u0000:Q\u0003*\u0015\u0000;Q\u0003"+
		"\"\u0011\u0000<Q\u0003(\u0014\u0000=Q\u0003,\u0016\u0000>Q\u0003&\u0013"+
		"\u0000?Q\u0003$\u0012\u0000@Q\u0003 \u0010\u0000AQ\u0003\u001e\u000f\u0000"+
		"BQ\u0003\u001c\u000e\u0000CQ\u0003\u001a\r\u0000DQ\u0003\u0018\f\u0000"+
		"EQ\u0003\u0014\n\u0000FQ\u0003\u0016\u000b\u0000GQ\u0003\u0010\b\u0000"+
		"HQ\u0003\u0012\t\u0000IQ\u0003\f\u0006\u0000JQ\u0003\u000e\u0007\u0000"+
		"KQ\u0003\b\u0004\u0000LQ\u0003\n\u0005\u0000MQ\u0003\u0006\u0003\u0000"+
		"NQ\u0003\u0002\u0001\u0000OQ\u0003\u0004\u0002\u0000P8\u0001\u0000\u0000"+
		"\u0000P9\u0001\u0000\u0000\u0000P:\u0001\u0000\u0000\u0000P;\u0001\u0000"+
		"\u0000\u0000P<\u0001\u0000\u0000\u0000P=\u0001\u0000\u0000\u0000P>\u0001"+
		"\u0000\u0000\u0000P?\u0001\u0000\u0000\u0000P@\u0001\u0000\u0000\u0000"+
		"PA\u0001\u0000\u0000\u0000PB\u0001\u0000\u0000\u0000PC\u0001\u0000\u0000"+
		"\u0000PD\u0001\u0000\u0000\u0000PE\u0001\u0000\u0000\u0000PF\u0001\u0000"+
		"\u0000\u0000PG\u0001\u0000\u0000\u0000PH\u0001\u0000\u0000\u0000PI\u0001"+
		"\u0000\u0000\u0000PJ\u0001\u0000\u0000\u0000PK\u0001\u0000\u0000\u0000"+
		"PL\u0001\u0000\u0000\u0000PM\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000PO\u0001\u0000\u0000\u0000Q\u0001\u0001\u0000\u0000\u0000RS\u0005"+
		"\u0005\u0000\u0000ST\u0005\u0003\u0000\u0000TU\u0005\n\u0000\u0000UV\u0005"+
		"\u0003\u0000\u0000VW\u0005\n\u0000\u0000WX\u0005\n\u0000\u0000XY\u0005"+
		"\n\u0000\u0000YZ\u0005\u0003\u0000\u0000Z[\u0005\n\u0000\u0000[\u00ca"+
		"\u0005\u0004\u0000\u0000\\]\u0005\n\u0000\u0000]^\u0005\u0006\u0000\u0000"+
		"^_\u0005\u0003\u0000\u0000_`\u0005\u0004\u0000\u0000`a\u0005\n\u0000\u0000"+
		"ab\u0005\u0006\u0000\u0000bc\u0005\u0003\u0000\u0000cd\u0005\n\u0000\u0000"+
		"de\u0005\u0003\u0000\u0000ef\u0005\n\u0000\u0000fg\u0005\u0003\u0000\u0000"+
		"gh\u0005\n\u0000\u0000hi\u0005\u0003\u0000\u0000ij\u0005\n\u0000\u0000"+
		"jk\u0005\u0003\u0000\u0000kl\u0005\n\u0000\u0000lm\u0005\u0003\u0000\u0000"+
		"mn\u0005\n\u0000\u0000no\u0005\u0003\u0000\u0000op\u0005\n\u0000\u0000"+
		"pq\u0005\u0003\u0000\u0000qr\u0005\n\u0000\u0000rs\u0005\u0003\u0000\u0000"+
		"st\u0005\n\u0000\u0000tu\u0005\u0003\u0000\u0000uv\u0005\n\u0000\u0000"+
		"vw\u0005\u0003\u0000\u0000wx\u0005\n\u0000\u0000xy\u0005\u0003\u0000\u0000"+
		"yz\u0005\n\u0000\u0000z{\u0005\u0003\u0000\u0000{|\u0005\n\u0000\u0000"+
		"|}\u0005\u0003\u0000\u0000}~\u0005\n\u0000\u0000~\u007f\u0005\u0003\u0000"+
		"\u0000\u007f\u0080\u0005\n\u0000\u0000\u0080\u0081\u0005\u0003\u0000\u0000"+
		"\u0081\u0082\u0005\n\u0000\u0000\u0082\u0083\u0005\u0003\u0000\u0000\u0083"+
		"\u0084\u0005\n\u0000\u0000\u0084\u0085\u0005\u0003\u0000\u0000\u0085\u00c1"+
		"\u0005\u0004\u0000\u0000\u0086\u0087\u0005\n\u0000\u0000\u0087\u0088\u0005"+
		"\u0006\u0000\u0000\u0088\u0089\u0005\u0003\u0000\u0000\u0089\u008b\u0005"+
		"\u0003\u0000\u0000\u008a\u008c\u00032\u0019\u0000\u008b\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0005\u0003\u0000\u0000\u0090\u0091\u00032\u0019"+
		"\u0000\u0091\u0093\u0005\u0003\u0000\u0000\u0092\u0094\u00032\u0019\u0000"+
		"\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0003\u0000\u0000"+
		"\u0098\u0099\u0005\b\u0000\u0000\u0099\u009a\u0005\u0003\u0000\u0000\u009a"+
		"\u009b\u0005\b\u0000\u0000\u009b\u009c\u0005\u0003\u0000\u0000\u009c\u009d"+
		"\u0005\b\u0000\u0000\u009d\u009e\u0005\u0003\u0000\u0000\u009e\u009f\u0005"+
		"\b\u0000\u0000\u009f\u00a0\u0005\u0003\u0000\u0000\u00a0\u00a1\u0005\b"+
		"\u0000\u0000\u00a1\u00a3\u0005\u0003\u0000\u0000\u00a2\u00a4\u0005\b\u0000"+
		"\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a7\u0005\u0003\u0000"+
		"\u0000\u00a6\u00a8\u0005\b\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0005\u0003\u0000\u0000\u00aa\u00ab\u0005\b\u0000\u0000\u00ab"+
		"\u00ad\u0005\u0003\u0000\u0000\u00ac\u00ae\u0005\b\u0000\u0000\u00ad\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0001\u0000\u0000\u0000\u00af\u00b1\u0005\u0003\u0000\u0000\u00b0\u00b2"+
		"\u0005\b\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b5\u0005"+
		"\u0003\u0000\u0000\u00b4\u00b6\u0005\b\u0000\u0000\u00b5\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005\u0003\u0000\u0000\u00b8\u00b9\u0005\b\u0000"+
		"\u0000\u00b9\u00ba\u0005\u0003\u0000\u0000\u00ba\u00bb\u0005\n\u0000\u0000"+
		"\u00bb\u00bc\u0005\u0003\u0000\u0000\u00bc\u00bd\u0005\u0004\u0000\u0000"+
		"\u00bd\u00be\u0006\u0001\uffff\uffff\u0000\u00be\u00c0\u0001\u0000\u0000"+
		"\u0000\u00bf\u0086\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0005\n\u0000\u0000\u00c5\u00c6\u0005\u0003\u0000\u0000"+
		"\u00c6\u00c7\u0005\n\u0000\u0000\u00c7\u00c8\u0005\u0003\u0000\u0000\u00c8"+
		"\u00c9\u0005\u0006\u0000\u0000\u00c9\u00cb\u0005\u0004\u0000\u0000\u00ca"+
		"\\\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u0005\u0000\u0000\u00cf\u00d0"+
		"\u0005\u0003\u0000\u0000\u00d0\u00d1\u0005\n\u0000\u0000\u00d1\u00d2\u0005"+
		"\u0003\u0000\u0000\u00d2\u00d3\u0005\n\u0000\u0000\u00d3\u00d4\u0005\n"+
		"\u0000\u0000\u00d4\u00d5\u0005\n\u0000\u0000\u00d5\u00d6\u0005\u0003\u0000"+
		"\u0000\u00d6\u00d7\u0005\n\u0000\u0000\u00d7\u00d8\u0005\u0004\u0000\u0000"+
		"\u00d8\u0003\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u0005\u0000\u0000"+
		"\u00da\u00db\u0005\u0003\u0000\u0000\u00db\u00dc\u0005\n\u0000\u0000\u00dc"+
		"\u00dd\u0005\u0003\u0000\u0000\u00dd\u00de\u0005\n\u0000\u0000\u00de\u00df"+
		"\u0005\n\u0000\u0000\u00df\u00e0\u0005\n\u0000\u0000\u00e0\u00e1\u0005"+
		"\n\u0000\u0000\u00e1\u00e2\u0005\n\u0000\u0000\u00e2\u00e3\u0005\u0003"+
		"\u0000\u0000\u00e3\u00e4\u0005\n\u0000\u0000\u00e4\u0136\u0005\u0004\u0000"+
		"\u0000\u00e5\u00e6\u0005\u0006\u0000\u0000\u00e6\u00e7\u0005\u0003\u0000"+
		"\u0000\u00e7\u00e8\u0005\n\u0000\u0000\u00e8\u00e9\u0005\u0003\u0000\u0000"+
		"\u00e9\u00ea\u0005\n\u0000\u0000\u00ea\u00eb\u0005\u0003\u0000\u0000\u00eb"+
		"\u00ec\u0005\n\u0000\u0000\u00ec\u00ed\u0005\u0003\u0000\u0000\u00ed\u00ee"+
		"\u0005\n\u0000\u0000\u00ee\u00ef\u0005\u0003\u0000\u0000\u00ef\u00f0\u0005"+
		"\n\u0000\u0000\u00f0\u00f1\u0005\u0003\u0000\u0000\u00f1\u00f2\u0005\n"+
		"\u0000\u0000\u00f2\u00f3\u0005\u0003\u0000\u0000\u00f3\u00f4\u0005\n\u0000"+
		"\u0000\u00f4\u00f5\u0005\u0003\u0000\u0000\u00f5\u00f6\u0005\n\u0000\u0000"+
		"\u00f6\u00f7\u0005\u0003\u0000\u0000\u00f7\u00f8\u0005\n\u0000\u0000\u00f8"+
		"\u00f9\u0005\u0003\u0000\u0000\u00f9\u00fa\u0005\n\u0000\u0000\u00fa\u00fb"+
		"\u0005\u0003\u0000\u0000\u00fb\u00fc\u0005\n\u0000\u0000\u00fc\u00fd\u0005"+
		"\u0003\u0000\u0000\u00fd\u00fe\u0005\n\u0000\u0000\u00fe\u00ff\u0005\u0003"+
		"\u0000\u0000\u00ff\u0100\u0005\n\u0000\u0000\u0100\u0101\u0005\u0003\u0000"+
		"\u0000\u0101\u0102\u0005\n\u0000\u0000\u0102\u0103\u0005\u0003\u0000\u0000"+
		"\u0103\u0104\u0005\n\u0000\u0000\u0104\u0105\u0005\u0003\u0000\u0000\u0105"+
		"\u0106\u0005\n\u0000\u0000\u0106\u0107\u0005\u0003\u0000\u0000\u0107\u0108"+
		"\u0005\n\u0000\u0000\u0108\u0109\u0005\u0003\u0000\u0000\u0109\u012d\u0005"+
		"\u0004\u0000\u0000\u010a\u010b\u0005\u0006\u0000\u0000\u010b\u010c\u0005"+
		"\u0003\u0000\u0000\u010c\u010d\u0005\u0003\u0000\u0000\u010d\u012c\u0005"+
		"\u0004\u0000\u0000\u010e\u010f\u0005\u0006\u0000\u0000\u010f\u0110\u0005"+
		"\u0003\u0000\u0000\u0110\u0111\u0005\b\u0000\u0000\u0111\u0113\u0005\u0003"+
		"\u0000\u0000\u0112\u0114\u00032\u0019\u0000\u0113\u0112\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000"+
		"\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0005\u0003\u0000\u0000\u0118\u0119\u0005\b\u0000\u0000"+
		"\u0119\u011a\u0005\u0003\u0000\u0000\u011a\u011b\u0005\b\u0000\u0000\u011b"+
		"\u011c\u0005\u0003\u0000\u0000\u011c\u011d\u0005\n\u0000\u0000\u011d\u011e"+
		"\u0005\u0003\u0000\u0000\u011e\u011f\u0005\b\u0000\u0000\u011f\u0120\u0005"+
		"\u0003\u0000\u0000\u0120\u0121\u0005\n\u0000\u0000\u0121\u0122\u0005\u0003"+
		"\u0000\u0000\u0122\u0123\u0005\b\u0000\u0000\u0123\u0124\u0005\u0003\u0000"+
		"\u0000\u0124\u0125\u0005\b\u0000\u0000\u0125\u0126\u0005\u0003\u0000\u0000"+
		"\u0126\u0127\u0005\b\u0000\u0000\u0127\u0128\u0005\u0003\u0000\u0000\u0128"+
		"\u0129\u0005\u0004\u0000\u0000\u0129\u012a\u0006\u0002\uffff\uffff\u0000"+
		"\u012a\u012c\u0001\u0000\u0000\u0000\u012b\u010a\u0001\u0000\u0000\u0000"+
		"\u012b\u010e\u0001\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000"+
		"\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000"+
		"\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u0005\n\u0000\u0000\u0131\u0132\u0005\u0003\u0000\u0000\u0132"+
		"\u0133\u0005\n\u0000\u0000\u0133\u0134\u0005\u0003\u0000\u0000\u0134\u0135"+
		"\u0005\u0006\u0000\u0000\u0135\u0137\u0005\u0004\u0000\u0000\u0136\u00e5"+
		"\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0136"+
		"\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0005\u0005\u0000\u0000\u013b\u013c"+
		"\u0005\u0003\u0000\u0000\u013c\u013d\u0005\n\u0000\u0000\u013d\u013e\u0005"+
		"\u0003\u0000\u0000\u013e\u013f\u0005\n\u0000\u0000\u013f\u0140\u0005\n"+
		"\u0000\u0000\u0140\u0141\u0005\n\u0000\u0000\u0141\u0142\u0005\n\u0000"+
		"\u0000\u0142\u0143\u0005\n\u0000\u0000\u0143\u0144\u0005\u0003\u0000\u0000"+
		"\u0144\u0145\u0005\n\u0000\u0000\u0145\u0146\u0005\u0004\u0000\u0000\u0146"+
		"\u0005\u0001\u0000\u0000\u0000\u0147\u0148\u0005\u0005\u0000\u0000\u0148"+
		"\u0149\u0005\u0003\u0000\u0000\u0149\u014a\u0005\n\u0000\u0000\u014a\u014b"+
		"\u0005\u0003\u0000\u0000\u014b\u014c\u0005\n\u0000\u0000\u014c\u014d\u0005"+
		"\n\u0000\u0000\u014d\u014e\u0005\n\u0000\u0000\u014e\u014f\u0005\n\u0000"+
		"\u0000\u014f\u0150\u0005\n\u0000\u0000\u0150\u0151\u0005\u0003\u0000\u0000"+
		"\u0151\u0152\u0005\n\u0000\u0000\u0152\u01a1\u0005\u0004\u0000\u0000\u0153"+
		"\u0154\u0005\n\u0000\u0000\u0154\u0155\u0005\n\u0000\u0000\u0155\u0156"+
		"\u0005\u0006\u0000\u0000\u0156\u0157\u0005\u0003\u0000\u0000\u0157\u0158"+
		"\u0005\n\u0000\u0000\u0158\u0159\u0005\n\u0000\u0000\u0159\u015a\u0005"+
		"\n\u0000\u0000\u015a\u015b\u0005\n\u0000\u0000\u015b\u015c\u0005\n\u0000"+
		"\u0000\u015c\u015d\u0005\n\u0000\u0000\u015d\u015e\u0005\n\u0000\u0000"+
		"\u015e\u015f\u0005\n\u0000\u0000\u015f\u0198\u0005\u0004\u0000\u0000\u0160"+
		"\u0161\u0005\n\u0000\u0000\u0161\u0162\u0005\n\u0000\u0000\u0162\u0163"+
		"\u0005\u0006\u0000\u0000\u0163\u0164\u0005\u0003\u0000\u0000\u0164\u0165"+
		"\u00032\u0019\u0000\u0165\u0166\u0005\u0004\u0000\u0000\u0166\u0167\u0005"+
		"\n\u0000\u0000\u0167\u0168\u0005\n\u0000\u0000\u0168\u0169\u0005\u0006"+
		"\u0000\u0000\u0169\u016b\u0005\u0003\u0000\u0000\u016a\u016c\u00032\u0019"+
		"\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000"+
		"\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000"+
		"\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0005\u0004\u0000"+
		"\u0000\u0170\u0171\u0005\n\u0000\u0000\u0171\u0172\u0005\n\u0000\u0000"+
		"\u0172\u0173\u0005\u0006\u0000\u0000\u0173\u0174\u0005\u0003\u0000\u0000"+
		"\u0174\u0175\u0005\n\u0000\u0000\u0175\u0176\u0005\u0004\u0000\u0000\u0176"+
		"\u0177\u0005\n\u0000\u0000\u0177\u0178\u0005\n\u0000\u0000\u0178\u0179"+
		"\u0005\u0006\u0000\u0000\u0179\u017a\u0005\u0003\u0000\u0000\u017a\u017b"+
		"\u0005\b\u0000\u0000\u017b\u017c\u0005\u0004\u0000\u0000\u017c\u017d\u0005"+
		"\n\u0000\u0000\u017d\u017e\u0005\n\u0000\u0000\u017e\u017f\u0005\u0006"+
		"\u0000\u0000\u017f\u0180\u0005\u0003\u0000\u0000\u0180\u0181\u0005\b\u0000"+
		"\u0000\u0181\u0182\u0005\u0004\u0000\u0000\u0182\u0183\u0005\n\u0000\u0000"+
		"\u0183\u0184\u0005\n\u0000\u0000\u0184\u0185\u0005\u0006\u0000\u0000\u0185"+
		"\u0186\u0005\u0003\u0000\u0000\u0186\u0187\u0005\b\u0000\u0000\u0187\u0188"+
		"\u0005\u0004\u0000\u0000\u0188\u0189\u0005\n\u0000\u0000\u0189\u018a\u0005"+
		"\n\u0000\u0000\u018a\u018b\u0005\u0006\u0000\u0000\u018b\u018c\u0005\u0003"+
		"\u0000\u0000\u018c\u018d\u0005\b\u0000\u0000\u018d\u018e\u0005\u0004\u0000"+
		"\u0000\u018e\u018f\u0005\n\u0000\u0000\u018f\u0190\u0005\n\u0000\u0000"+
		"\u0190\u0191\u0005\u0006\u0000\u0000\u0191\u0192\u0005\u0003\u0000\u0000"+
		"\u0192\u0193\u0005\b\u0000\u0000\u0193\u0194\u0005\u0004\u0000\u0000\u0194"+
		"\u0195\u0006\u0003\uffff\uffff\u0000\u0195\u0197\u0001\u0000\u0000\u0000"+
		"\u0196\u0160\u0001\u0000\u0000\u0000\u0197\u019a\u0001\u0000\u0000\u0000"+
		"\u0198\u0196\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000"+
		"\u0199\u019b\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0005\n\u0000\u0000\u019c\u019d\u0005\u0003\u0000\u0000\u019d"+
		"\u019e\u0005\n\u0000\u0000\u019e\u019f\u0005\u0003\u0000\u0000\u019f\u01a0"+
		"\u0005\u0006\u0000\u0000\u01a0\u01a2\u0005\u0004\u0000\u0000\u01a1\u0153"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005\u0005\u0000\u0000\u01a6\u01a7"+
		"\u0005\u0003\u0000\u0000\u01a7\u01a8\u0005\n\u0000\u0000\u01a8\u01a9\u0005"+
		"\u0003\u0000\u0000\u01a9\u01aa\u0005\n\u0000\u0000\u01aa\u01ab\u0005\n"+
		"\u0000\u0000\u01ab\u01ac\u0005\n\u0000\u0000\u01ac\u01ad\u0005\n\u0000"+
		"\u0000\u01ad\u01ae\u0005\n\u0000\u0000\u01ae\u01af\u0005\u0003\u0000\u0000"+
		"\u01af\u01b0\u0005\n\u0000\u0000\u01b0\u01b1\u0005\u0004\u0000\u0000\u01b1"+
		"\u0007\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005\u0005\u0000\u0000\u01b3"+
		"\u01b4\u0005\u0003\u0000\u0000\u01b4\u01b5\u0005\n\u0000\u0000\u01b5\u01b6"+
		"\u0005\u0003\u0000\u0000\u01b6\u01b7\u0005\n\u0000\u0000\u01b7\u01b8\u0005"+
		"\n\u0000\u0000\u01b8\u01b9\u0005\n\u0000\u0000\u01b9\u01ba\u0005\n\u0000"+
		"\u0000\u01ba\u01bb\u0005\n\u0000\u0000\u01bb\u01bc\u0005\u0003\u0000\u0000"+
		"\u01bc\u01bd\u0005\n\u0000\u0000\u01bd\u01f0\u0005\u0004\u0000\u0000\u01be"+
		"\u01bf\u00032\u0019\u0000\u01bf\u01c0\u0005\u0003\u0000\u0000\u01c0\u01c1"+
		"\u0005\u0004\u0000\u0000\u01c1\u01c2\u0005\b\u0000\u0000\u01c2\u01c3\u0005"+
		"\u0003\u0000\u0000\u01c3\u01c4\u0005\n\u0000\u0000\u01c4\u01c5\u0005\u0003"+
		"\u0000\u0000\u01c5\u01c6\u0005\n\u0000\u0000\u01c6\u01c7\u0005\u0003\u0000"+
		"\u0000\u01c7\u01c8\u0005\n\u0000\u0000\u01c8\u01c9\u0005\u0003\u0000\u0000"+
		"\u01c9\u01ca\u0005\n\u0000\u0000\u01ca\u01cb\u0005\u0003\u0000\u0000\u01cb"+
		"\u01cc\u0005\n\u0000\u0000\u01cc\u01cd\u0005\u0003\u0000\u0000\u01cd\u01ce"+
		"\u0005\n\u0000\u0000\u01ce\u01cf\u0005\u0003\u0000\u0000\u01cf\u01d0\u0005"+
		"\n\u0000\u0000\u01d0\u01d1\u0005\u0003\u0000\u0000\u01d1\u01e5\u0005\u0004"+
		"\u0000\u0000\u01d2\u01d3\u00032\u0019\u0000\u01d3\u01d4\u0005\u0003\u0000"+
		"\u0000\u01d4\u01d5\u0005\u0006\u0000\u0000\u01d5\u01d6\u0005\u0003\u0000"+
		"\u0000\u01d6\u01d7\u0005\b\u0000\u0000\u01d7\u01d8\u0005\u0003\u0000\u0000"+
		"\u01d8\u01d9\u0005\b\u0000\u0000\u01d9\u01da\u0005\u0003\u0000\u0000\u01da"+
		"\u01db\u0005\b\u0000\u0000\u01db\u01dc\u0005\u0003\u0000\u0000\u01dc\u01dd"+
		"\u0005\b\u0000\u0000\u01dd\u01de\u0005\u0003\u0000\u0000\u01de\u01df\u0005"+
		"\b\u0000\u0000\u01df\u01e0\u0005\u0003\u0000\u0000\u01e0\u01e1\u0005\b"+
		"\u0000\u0000\u01e1\u01e2\u0005\u0003\u0000\u0000\u01e2\u01e3\u0005\u0004"+
		"\u0000\u0000\u01e3\u01e4\u0006\u0004\uffff\uffff\u0000\u01e4\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e5\u01d2\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001"+
		"\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005"+
		"\n\u0000\u0000\u01ea\u01eb\u0005\u0003\u0000\u0000\u01eb\u01ec\u0005\n"+
		"\u0000\u0000\u01ec\u01ed\u0005\u0003\u0000\u0000\u01ed\u01ee\u0005\u0006"+
		"\u0000\u0000\u01ee\u01ef\u0005\u0004\u0000\u0000\u01ef\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f0\u01be\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005\u0005"+
		"\u0000\u0000\u01f5\u01f6\u0005\u0003\u0000\u0000\u01f6\u01f7\u0005\n\u0000"+
		"\u0000\u01f7\u01f8\u0005\u0003\u0000\u0000\u01f8\u01f9\u0005\n\u0000\u0000"+
		"\u01f9\u01fa\u0005\n\u0000\u0000\u01fa\u01fb\u0005\n\u0000\u0000\u01fb"+
		"\u01fc\u0005\n\u0000\u0000\u01fc\u01fd\u0005\n\u0000\u0000\u01fd\u01fe"+
		"\u0005\u0003\u0000\u0000\u01fe\u01ff\u0005\n\u0000\u0000\u01ff\u0200\u0005"+
		"\u0004\u0000\u0000\u0200\t\u0001\u0000\u0000\u0000\u0201\u0202\u0005\u0005"+
		"\u0000\u0000\u0202\u0203\u0005\u0003\u0000\u0000\u0203\u0204\u0005\n\u0000"+
		"\u0000\u0204\u0205\u0005\u0003\u0000\u0000\u0205\u0206\u0005\n\u0000\u0000"+
		"\u0206\u0207\u0005\n\u0000\u0000\u0207\u0208\u0005\n\u0000\u0000\u0208"+
		"\u0209\u0005\n\u0000\u0000\u0209\u020a\u0005\n\u0000\u0000\u020a\u020b"+
		"\u0005\n\u0000\u0000\u020b\u020c\u0005\n\u0000\u0000\u020c\u020d\u0005"+
		"\u0003\u0000\u0000\u020d\u020e\u0005\n\u0000\u0000\u020e\u0251\u0005\u0004"+
		"\u0000\u0000\u020f\u0210\u00032\u0019\u0000\u0210\u0211\u0005\u0003\u0000"+
		"\u0000\u0211\u0212\u0005\u0004\u0000\u0000\u0212\u0213\u0005\b\u0000\u0000"+
		"\u0213\u0214\u0005\u0003\u0000\u0000\u0214\u0215\u0005\n\u0000\u0000\u0215"+
		"\u0216\u0005\u0003\u0000\u0000\u0216\u0217\u0005\n\u0000\u0000\u0217\u0218"+
		"\u0005\u0003\u0000\u0000\u0218\u0219\u0005\n\u0000\u0000\u0219\u021a\u0005"+
		"\u0003\u0000\u0000\u021a\u021b\u0005\n\u0000\u0000\u021b\u021c\u0005\u0003"+
		"\u0000\u0000\u021c\u021d\u0005\n\u0000\u0000\u021d\u021e\u0005\u0003\u0000"+
		"\u0000\u021e\u021f\u0005\n\u0000\u0000\u021f\u0220\u0005\u0003\u0000\u0000"+
		"\u0220\u0221\u0005\n\u0000\u0000\u0221\u0222\u0005\u0003\u0000\u0000\u0222"+
		"\u0223\u0005\n\u0000\u0000\u0223\u0224\u0005\u0003\u0000\u0000\u0224\u0246"+
		"\u0005\u0004\u0000\u0000\u0225\u0226\u00032\u0019\u0000\u0226\u0227\u0005"+
		"\u0003\u0000\u0000\u0227\u0228\u0005\u0003\u0000\u0000\u0228\u0229\u0005"+
		"\u0003\u0000\u0000\u0229\u022a\u0005\u0003\u0000\u0000\u022a\u022b\u0005"+
		"\u0003\u0000\u0000\u022b\u022c\u0005\u0003\u0000\u0000\u022c\u022d\u0005"+
		"\u0003\u0000\u0000\u022d\u022e\u0005\u0003\u0000\u0000\u022e\u022f\u0005"+
		"\u0003\u0000\u0000\u022f\u0230\u0005\u0004\u0000\u0000\u0230\u0247\u0001"+
		"\u0000\u0000\u0000\u0231\u0232\u00032\u0019\u0000\u0232\u0233\u0005\u0003"+
		"\u0000\u0000\u0233\u0234\u0005\u0006\u0000\u0000\u0234\u0235\u0005\u0003"+
		"\u0000\u0000\u0235\u0236\u0005\b\u0000\u0000\u0236\u0237\u0005\u0003\u0000"+
		"\u0000\u0237\u0238\u0005\b\u0000\u0000\u0238\u0239\u0005\u0003\u0000\u0000"+
		"\u0239\u023a\u0005\b\u0000\u0000\u023a\u023b\u0005\u0003\u0000\u0000\u023b"+
		"\u023c\u0005\b\u0000\u0000\u023c\u023d\u0005\u0003\u0000\u0000\u023d\u023e"+
		"\u0005\b\u0000\u0000\u023e\u023f\u0005\u0003\u0000\u0000\u023f\u0240\u0005"+
		"\b\u0000\u0000\u0240\u0241\u0005\u0003\u0000\u0000\u0241\u0242\u0005\b"+
		"\u0000\u0000\u0242\u0243\u0005\u0003\u0000\u0000\u0243\u0244\u0005\u0004"+
		"\u0000\u0000\u0244\u0245\u0006\u0005\uffff\uffff\u0000\u0245\u0247\u0001"+
		"\u0000\u0000\u0000\u0246\u0225\u0001\u0000\u0000\u0000\u0246\u0231\u0001"+
		"\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u0246\u0001"+
		"\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u024a\u0001"+
		"\u0000\u0000\u0000\u024a\u024b\u0005\n\u0000\u0000\u024b\u024c\u0005\u0003"+
		"\u0000\u0000\u024c\u024d\u0005\n\u0000\u0000\u024d\u024e\u0005\u0003\u0000"+
		"\u0000\u024e\u024f\u0005\u0006\u0000\u0000\u024f\u0250\u0005\u0004\u0000"+
		"\u0000\u0250\u0252\u0001\u0000\u0000\u0000\u0251\u020f\u0001\u0000\u0000"+
		"\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253\u0251\u0001\u0000\u0000"+
		"\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000"+
		"\u0000\u0255\u0256\u0005\u0005\u0000\u0000\u0256\u0257\u0005\u0003\u0000"+
		"\u0000\u0257\u0258\u0005\n\u0000\u0000\u0258\u0259\u0005\u0003\u0000\u0000"+
		"\u0259\u025a\u0005\n\u0000\u0000\u025a\u025b\u0005\n\u0000\u0000\u025b"+
		"\u025c\u0005\n\u0000\u0000\u025c\u025d\u0005\n\u0000\u0000\u025d\u025e"+
		"\u0005\n\u0000\u0000\u025e\u025f\u0005\n\u0000\u0000\u025f\u0260\u0005"+
		"\n\u0000\u0000\u0260\u0261\u0005\u0003\u0000\u0000\u0261\u0262\u0005\n"+
		"\u0000\u0000\u0262\u0263\u0005\u0004\u0000\u0000\u0263\u000b\u0001\u0000"+
		"\u0000\u0000\u0264\u0265\u0005\u0005\u0000\u0000\u0265\u0266\u0005\u0003"+
		"\u0000\u0000\u0266\u0267\u0005\n\u0000\u0000\u0267\u0268\u0005\u0003\u0000"+
		"\u0000\u0268\u0269\u0005\n\u0000\u0000\u0269\u026a\u0005\n\u0000\u0000"+
		"\u026a\u026b\u0005\n\u0000\u0000\u026b\u026c\u0005\n\u0000\u0000\u026c"+
		"\u026d\u0005\n\u0000\u0000\u026d\u026e\u0005\u0003\u0000\u0000\u026e\u026f"+
		"\u0005\n\u0000\u0000\u026f\u02ae\u0005\u0004\u0000\u0000\u0270\u0271\u0005"+
		"\u0005\u0000\u0000\u0271\u0272\u0005\u0003\u0000\u0000\u0272\u0273\u0005"+
		"\b\u0000\u0000\u0273\u0274\u0005\u0003\u0000\u0000\u0274\u0275\u0005\n"+
		"\u0000\u0000\u0275\u0276\u0005\u0003\u0000\u0000\u0276\u0278\u00032\u0019"+
		"\u0000\u0277\u0279\u00032\u0019\u0000\u0278\u0277\u0001\u0000\u0000\u0000"+
		"\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u027b\u0001\u0000\u0000\u0000"+
		"\u027a\u027c\u00032\u0019\u0000\u027b\u027a\u0001\u0000\u0000\u0000\u027b"+
		"\u027c\u0001\u0000\u0000\u0000\u027c\u027e\u0001\u0000\u0000\u0000\u027d"+
		"\u027f\u00032\u0019\u0000\u027e\u027d\u0001\u0000\u0000\u0000\u027e\u027f"+
		"\u0001\u0000\u0000\u0000\u027f\u0281\u0001\u0000\u0000\u0000\u0280\u0282"+
		"\u00032\u0019\u0000\u0281\u0280\u0001\u0000\u0000\u0000\u0281\u0282\u0001"+
		"\u0000\u0000\u0000\u0282\u0284\u0001\u0000\u0000\u0000\u0283\u0285\u0003"+
		"2\u0019\u0000\u0284\u0283\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000"+
		"\u0000\u0000\u0285\u0287\u0001\u0000\u0000\u0000\u0286\u0288\u00032\u0019"+
		"\u0000\u0287\u0286\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000\u0000"+
		"\u0000\u0288\u028c\u0001\u0000\u0000\u0000\u0289\u028b\u00032\u0019\u0000"+
		"\u028a\u0289\u0001\u0000\u0000\u0000\u028b\u028e\u0001\u0000\u0000\u0000"+
		"\u028c\u028a\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000"+
		"\u028d\u028f\u0001\u0000\u0000\u0000\u028e\u028c\u0001\u0000\u0000\u0000"+
		"\u028f\u0290\u0005\u0004\u0000\u0000\u0290\u0291\u0005\u0005\u0000\u0000"+
		"\u0291\u0292\u0005\u0003\u0000\u0000\u0292\u0293\u0005\t\u0000\u0000\u0293"+
		"\u0294\u0005\u0004\u0000\u0000\u0294\u0295\u0005\u0005\u0000\u0000\u0295"+
		"\u0296\u0005\u0003\u0000\u0000\u0296\u0297\u0005\t\u0000\u0000\u0297\u0298"+
		"\u0005\u0004\u0000\u0000\u0298\u0299\u0005\u0005\u0000\u0000\u0299\u029a"+
		"\u0005\u0003\u0000\u0000\u029a\u029b\u0005\b\u0000\u0000\u029b\u029c\u0005"+
		"\n\u0000\u0000\u029c\u029d\u0005\u0004\u0000\u0000\u029d\u029e\u0005\u0005"+
		"\u0000\u0000\u029e\u029f\u0005\u0003\u0000\u0000\u029f\u02a0\u0005\u0006"+
		"\u0000\u0000\u02a0\u02a1\u0005\u0004\u0000\u0000\u02a1\u02a2\u0005\u0005"+
		"\u0000\u0000\u02a2\u02a3\u0005\u0003\u0000\u0000\u02a3\u02a4\u0005\u0006"+
		"\u0000\u0000\u02a4\u02a5\u0005\u0004\u0000\u0000\u02a5\u02a6\u0006\u0006"+
		"\uffff\uffff\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7\u02a8\u0005"+
		"\n\u0000\u0000\u02a8\u02a9\u0005\u0003\u0000\u0000\u02a9\u02aa\u0005\n"+
		"\u0000\u0000\u02aa\u02ab\u0005\u0003\u0000\u0000\u02ab\u02ac\u0005\u0006"+
		"\u0000\u0000\u02ac\u02ad\u0005\u0004\u0000\u0000\u02ad\u02af\u0001\u0000"+
		"\u0000\u0000\u02ae\u0270\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000"+
		"\u0000\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000"+
		"\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b2\u02b3\u0005\u0005"+
		"\u0000\u0000\u02b3\u02b4\u0005\u0003\u0000\u0000\u02b4\u02b5\u0005\n\u0000"+
		"\u0000\u02b5\u02b6\u0005\u0003\u0000\u0000\u02b6\u02b7\u0005\n\u0000\u0000"+
		"\u02b7\u02b8\u0005\n\u0000\u0000\u02b8\u02b9\u0005\n\u0000\u0000\u02b9"+
		"\u02ba\u0005\n\u0000\u0000\u02ba\u02bb\u0005\n\u0000\u0000\u02bb\u02bc"+
		"\u0005\u0003\u0000\u0000\u02bc\u02bd\u0005\n\u0000\u0000\u02bd\u02be\u0005"+
		"\u0004\u0000\u0000\u02be\r\u0001\u0000\u0000\u0000\u02bf\u02c0\u0005\u0005"+
		"\u0000\u0000\u02c0\u02c1\u0005\u0003\u0000\u0000\u02c1\u02c2\u0005\n\u0000"+
		"\u0000\u02c2\u02c3\u0005\u0003\u0000\u0000\u02c3\u02c4\u0005\n\u0000\u0000"+
		"\u02c4\u02c5\u0005\n\u0000\u0000\u02c5\u02c6\u0005\n\u0000\u0000\u02c6"+
		"\u02c7\u0005\n\u0000\u0000\u02c7\u02c8\u0005\n\u0000\u0000\u02c8\u02c9"+
		"\u0005\u0003\u0000\u0000\u02c9\u02ca\u0005\n\u0000\u0000\u02ca\u0321\u0005"+
		"\u0004\u0000\u0000\u02cb\u02cc\u0005\u0005\u0000\u0000\u02cc\u02cd\u0005"+
		"\u0003\u0000\u0000\u02cd\u02ce\u00032\u0019\u0000\u02ce\u02d0\u0005\u0003"+
		"\u0000\u0000\u02cf\u02d1\u00032\u0019\u0000\u02d0\u02cf\u0001\u0000\u0000"+
		"\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000\u0000"+
		"\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000"+
		"\u0000\u02d4\u02d5\u0005\u0004\u0000\u0000\u02d5\u02d7\u00032\u0019\u0000"+
		"\u02d6\u02d8\u00032\u0019\u0000\u02d7\u02d6\u0001\u0000\u0000\u0000\u02d7"+
		"\u02d8\u0001\u0000\u0000\u0000\u02d8\u02da\u0001\u0000\u0000\u0000\u02d9"+
		"\u02db\u00032\u0019\u0000\u02da\u02d9\u0001\u0000\u0000\u0000\u02da\u02db"+
		"\u0001\u0000\u0000\u0000\u02db\u02dd\u0001\u0000\u0000\u0000\u02dc\u02de"+
		"\u00032\u0019\u0000\u02dd\u02dc\u0001\u0000\u0000\u0000\u02dd\u02de\u0001"+
		"\u0000\u0000\u0000\u02de\u02e0\u0001\u0000\u0000\u0000\u02df\u02e1\u0003"+
		"2\u0019\u0000\u02e0\u02df\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000"+
		"\u0000\u0000\u02e1\u02e3\u0001\u0000\u0000\u0000\u02e2\u02e4\u00032\u0019"+
		"\u0000\u02e3\u02e2\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000"+
		"\u0000\u02e4\u02e6\u0001\u0000\u0000\u0000\u02e5\u02e7\u00032\u0019\u0000"+
		"\u02e6\u02e5\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000"+
		"\u02e7\u02eb\u0001\u0000\u0000\u0000\u02e8\u02ea\u00032\u0019\u0000\u02e9"+
		"\u02e8\u0001\u0000\u0000\u0000\u02ea\u02ed\u0001\u0000\u0000\u0000\u02eb"+
		"\u02e9\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ec"+
		"\u02ee\u0001\u0000\u0000\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000\u02ee"+
		"\u02ef\u0005\u0004\u0000\u0000\u02ef\u02f1\u00032\u0019\u0000\u02f0\u02f2"+
		"\u00032\u0019\u0000\u02f1\u02f0\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001"+
		"\u0000\u0000\u0000\u02f2\u02f4\u0001\u0000\u0000\u0000\u02f3\u02f5\u0003"+
		"2\u0019\u0000\u02f4\u02f3\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001\u0000"+
		"\u0000\u0000\u02f5\u02f7\u0001\u0000\u0000\u0000\u02f6\u02f8\u00032\u0019"+
		"\u0000\u02f7\u02f6\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000"+
		"\u0000\u02f8\u02fa\u0001\u0000\u0000\u0000\u02f9\u02fb\u00032\u0019\u0000"+
		"\u02fa\u02f9\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000"+
		"\u02fb\u02fd\u0001\u0000\u0000\u0000\u02fc\u02fe\u00032\u0019\u0000\u02fd"+
		"\u02fc\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000\u0000\u02fe"+
		"\u0300\u0001\u0000\u0000\u0000\u02ff\u0301\u00032\u0019\u0000\u0300\u02ff"+
		"\u0001\u0000\u0000\u0000\u0300\u0301\u0001\u0000\u0000\u0000\u0301\u0305"+
		"\u0001\u0000\u0000\u0000\u0302\u0304\u00032\u0019\u0000\u0303\u0302\u0001"+
		"\u0000\u0000\u0000\u0304\u0307\u0001\u0000\u0000\u0000\u0305\u0303\u0001"+
		"\u0000\u0000\u0000\u0305\u0306\u0001\u0000\u0000\u0000\u0306\u0308\u0001"+
		"\u0000\u0000\u0000\u0307\u0305\u0001\u0000\u0000\u0000\u0308\u0309\u0005"+
		"\u0004\u0000\u0000\u0309\u030b\u0005\u0006\u0000\u0000\u030a\u030c\u0003"+
		"2\u0019\u0000\u030b\u030a\u0001\u0000\u0000\u0000\u030c\u030d\u0001\u0000"+
		"\u0000\u0000\u030d\u030b\u0001\u0000\u0000\u0000\u030d\u030e\u0001\u0000"+
		"\u0000\u0000\u030e\u030f\u0001\u0000\u0000\u0000\u030f\u0310\u0005\u0004"+
		"\u0000\u0000\u0310\u0311\u0005\b\u0000\u0000\u0311\u0312\u0005\u0004\u0000"+
		"\u0000\u0312\u0313\u00032\u0019\u0000\u0313\u0314\u0005\u0004\u0000\u0000"+
		"\u0314\u0315\u0006\u0007\uffff\uffff\u0000\u0315\u0317\u0001\u0000\u0000"+
		"\u0000\u0316\u02cb\u0001\u0000\u0000\u0000\u0317\u0318\u0001\u0000\u0000"+
		"\u0000\u0318\u0316\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000\u0000"+
		"\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031a\u031b\u0005\n\u0000\u0000"+
		"\u031b\u031c\u0005\u0003\u0000\u0000\u031c\u031d\u0005\n\u0000\u0000\u031d"+
		"\u031e\u0005\u0003\u0000\u0000\u031e\u031f\u0005\u0006\u0000\u0000\u031f"+
		"\u0320\u0005\u0004\u0000\u0000\u0320\u0322\u0001\u0000\u0000\u0000\u0321"+
		"\u0316\u0001\u0000\u0000\u0000\u0322\u0323\u0001\u0000\u0000\u0000\u0323"+
		"\u0321\u0001\u0000\u0000\u0000\u0323\u0324\u0001\u0000\u0000\u0000\u0324"+
		"\u0325\u0001\u0000\u0000\u0000\u0325\u0326\u0005\u0005\u0000\u0000\u0326"+
		"\u0327\u0005\u0003\u0000\u0000\u0327\u0328\u0005\n\u0000\u0000\u0328\u0329"+
		"\u0005\u0003\u0000\u0000\u0329\u032a\u0005\n\u0000\u0000\u032a\u032b\u0005"+
		"\n\u0000\u0000\u032b\u032c\u0005\n\u0000\u0000\u032c\u032d\u0005\n\u0000"+
		"\u0000\u032d\u032e\u0005\n\u0000\u0000\u032e\u032f\u0005\u0003\u0000\u0000"+
		"\u032f\u0330\u0005\n\u0000\u0000\u0330\u0331\u0005\u0004\u0000\u0000\u0331"+
		"\u000f\u0001\u0000\u0000\u0000\u0332\u0333\u0005\u0005\u0000\u0000\u0333"+
		"\u0334\u0005\u0003\u0000\u0000\u0334\u0335\u0005\n\u0000\u0000\u0335\u0336"+
		"\u0005\u0003\u0000\u0000\u0336\u0337\u0005\n\u0000\u0000\u0337\u0338\u0005"+
		"\n\u0000\u0000\u0338\u0339\u0005\n\u0000\u0000\u0339\u033a\u0005\n\u0000"+
		"\u0000\u033a\u033b\u0005\n\u0000\u0000\u033b\u033c\u0005\n\u0000\u0000"+
		"\u033c\u033d\u0005\n\u0000\u0000\u033d\u033e\u0005\u0003\u0000\u0000\u033e"+
		"\u033f\u0005\n\u0000\u0000\u033f\u042c\u0005\u0004\u0000\u0000\u0340\u0341"+
		"\u0005\b\u0000\u0000\u0341\u0342\u0005\u0003\u0000\u0000\u0342\u0343\u0005"+
		"\u0004\u0000\u0000\u0343\u0344\u0005\b\u0000\u0000\u0344\u0345\u0005\u0003"+
		"\u0000\u0000\u0345\u0346\u0005\u0004\u0000\u0000\u0346\u0347\u0005\b\u0000"+
		"\u0000\u0347\u0348\u0005\u0003\u0000\u0000\u0348\u0349\u0005\u0004\u0000"+
		"\u0000\u0349\u034a\u0005\b\u0000\u0000\u034a\u034b\u0005\u0003\u0000\u0000"+
		"\u034b\u034c\u0005\u0004\u0000\u0000\u034c\u034d\u0005\b\u0000\u0000\u034d"+
		"\u034e\u0005\u0003\u0000\u0000\u034e\u034f\u0005\u0004\u0000\u0000\u034f"+
		"\u0350\u0005\b\u0000\u0000\u0350\u0351\u0005\u0003\u0000\u0000\u0351\u0352"+
		"\u0005\u0003\u0000\u0000\u0352\u0353\u0005\u0003\u0000\u0000\u0353\u0354"+
		"\u0005\u0003\u0000\u0000\u0354\u0355\u0005\u0003\u0000\u0000\u0355\u0356"+
		"\u0005\u0004\u0000\u0000\u0356\u0357\u0005\b\u0000\u0000\u0357\u0358\u0005"+
		"\u0003\u0000\u0000\u0358\u0359\u0005\u0003\u0000\u0000\u0359\u035a\u0005"+
		"\u0003\u0000\u0000\u035a\u035b\u0005\u0004\u0000\u0000\u035b\u035c\u0005"+
		"\b\u0000\u0000\u035c\u035d\u0005\u0003\u0000\u0000\u035d\u035e\u0005\u0003"+
		"\u0000\u0000\u035e\u035f\u0005\u0003\u0000\u0000\u035f\u0360\u0005\u0003"+
		"\u0000\u0000\u0360\u0361\u0005\u0003\u0000\u0000\u0361\u0362\u0005\u0004"+
		"\u0000\u0000\u0362\u0363\u0005\b\u0000\u0000\u0363\u0364\u0005\u0003\u0000"+
		"\u0000\u0364\u0365\u0005\u0003\u0000\u0000\u0365\u0366\u0005\u0003\u0000"+
		"\u0000\u0366\u0367\u0005\u0003\u0000\u0000\u0367\u0368\u0005\u0003\u0000"+
		"\u0000\u0368\u0369\u0005\u0004\u0000\u0000\u0369\u036a\u0005\b\u0000\u0000"+
		"\u036a\u036b\u0005\u0003\u0000\u0000\u036b\u036c\u0005\u0003\u0000\u0000"+
		"\u036c\u036d\u0005\u0003\u0000\u0000\u036d\u036e\u0005\u0003\u0000\u0000"+
		"\u036e\u036f\u0005\u0004\u0000\u0000\u036f\u0370\u0005\b\u0000\u0000\u0370"+
		"\u0371\u0005\u0003\u0000\u0000\u0371\u0372\u0005\u0004\u0000\u0000\u0372"+
		"\u0373\u0005\b\u0000\u0000\u0373\u0374\u0005\u0003\u0000\u0000\u0374\u0375"+
		"\u0005\u0003\u0000\u0000\u0375\u0376\u0005\u0003\u0000\u0000\u0376\u0377"+
		"\u0005\u0003\u0000\u0000\u0377\u0378\u0005\u0003\u0000\u0000\u0378\u0379"+
		"\u0005\u0004\u0000\u0000\u0379\u037a\u0005\b\u0000\u0000\u037a\u037b\u0005"+
		"\u0003\u0000\u0000\u037b\u037c\u0005\u0003\u0000\u0000\u037c\u037d\u0005"+
		"\u0003\u0000\u0000\u037d\u037e\u0005\u0004\u0000\u0000\u037e\u037f\u0005"+
		"\b\u0000\u0000\u037f\u0380\u0005\u0003\u0000\u0000\u0380\u0381\u0005\u0003"+
		"\u0000\u0000\u0381\u0382\u0005\u0003\u0000\u0000\u0382\u0383\u0005\u0003"+
		"\u0000\u0000\u0383\u0384\u0005\u0003\u0000\u0000\u0384\u0385\u0005\u0004"+
		"\u0000\u0000\u0385\u0386\u0005\b\u0000\u0000\u0386\u0387\u0005\u0003\u0000"+
		"\u0000\u0387\u0388\u0005\u0003\u0000\u0000\u0388\u0389\u0005\u0003\u0000"+
		"\u0000\u0389\u038a\u0005\u0003\u0000\u0000\u038a\u038b\u0005\u0003\u0000"+
		"\u0000\u038b\u038c\u0005\u0004\u0000\u0000\u038c\u038d\u0005\b\u0000\u0000"+
		"\u038d\u038e\u0005\u0003\u0000\u0000\u038e\u038f\u0005\u0003\u0000\u0000"+
		"\u038f\u0390\u0005\u0003\u0000\u0000\u0390\u0391\u0005\u0003\u0000\u0000"+
		"\u0391\u0392\u0005\u0004\u0000\u0000\u0392\u0393\u0005\b\u0000\u0000\u0393"+
		"\u0394\u0005\u0003\u0000\u0000\u0394\u0395\u0005\u0004\u0000\u0000\u0395"+
		"\u0396\u0005\b\u0000\u0000\u0396\u0397\u0005\u0003\u0000\u0000\u0397\u0398"+
		"\u0005\u0004\u0000\u0000\u0398\u0399\u0005\b\u0000\u0000\u0399\u039a\u0005"+
		"\u0003\u0000\u0000\u039a\u039b\u0005\u0004\u0000\u0000\u039b\u039c\u0005"+
		"\b\u0000\u0000\u039c\u039d\u0005\u0003\u0000\u0000\u039d\u039e\u0005\u0004"+
		"\u0000\u0000\u039e\u039f\u0005\b\u0000\u0000\u039f\u03a0\u0005\u0003\u0000"+
		"\u0000\u03a0\u03a1\u0005\u0003\u0000\u0000\u03a1\u03a2\u0005\u0003\u0000"+
		"\u0000\u03a2\u03a3\u0005\u0003\u0000\u0000\u03a3\u03a4\u0005\u0003\u0000"+
		"\u0000\u03a4\u03a5\u0005\u0004\u0000\u0000\u03a5\u03a6\u0005\b\u0000\u0000"+
		"\u03a6\u03a7\u0005\u0003\u0000\u0000\u03a7\u03a8\u0005\u0003\u0000\u0000"+
		"\u03a8\u03a9\u0005\u0003\u0000\u0000\u03a9\u03aa\u0005\u0004\u0000\u0000"+
		"\u03aa\u03ab\u0005\b\u0000\u0000\u03ab\u03ac\u0005\u0003\u0000\u0000\u03ac"+
		"\u03ad\u0005\u0003\u0000\u0000\u03ad\u03ae\u0005\u0003\u0000\u0000\u03ae"+
		"\u03af\u0005\u0003\u0000\u0000\u03af\u03b0\u0005\u0003\u0000\u0000\u03b0"+
		"\u03b1\u0005\u0004\u0000\u0000\u03b1\u03b2\u0005\b\u0000\u0000\u03b2\u03b3"+
		"\u0005\u0003\u0000\u0000\u03b3\u03b4\u0005\u0003\u0000\u0000\u03b4\u03b5"+
		"\u0005\u0003\u0000\u0000\u03b5\u03b6\u0005\u0003\u0000\u0000\u03b6\u03b7"+
		"\u0005\u0003\u0000\u0000\u03b7\u03b8\u0005\u0004\u0000\u0000\u03b8\u03b9"+
		"\u0005\b\u0000\u0000\u03b9\u03ba\u0005\u0003\u0000\u0000\u03ba\u03bb\u0005"+
		"\u0003\u0000\u0000\u03bb\u03bc\u0005\u0003\u0000\u0000\u03bc\u03bd\u0005"+
		"\u0003\u0000\u0000\u03bd\u03be\u0005\u0004\u0000\u0000\u03be\u03bf\u0005"+
		"\b\u0000\u0000\u03bf\u03c0\u0005\u0003\u0000\u0000\u03c0\u03c1\u0005\u0004"+
		"\u0000\u0000\u03c1\u03c2\u0005\b\u0000\u0000\u03c2\u03c3\u0005\u0003\u0000"+
		"\u0000\u03c3\u03c4\u0005\u0004\u0000\u0000\u03c4\u03c5\u0005\b\u0000\u0000"+
		"\u03c5\u03c6\u0005\u0003\u0000\u0000\u03c6\u03c7\u0005\u0004\u0000\u0000"+
		"\u03c7\u03c8\u0005\b\u0000\u0000\u03c8\u03c9\u0005\u0003\u0000\u0000\u03c9"+
		"\u03ca\u0005\u0003\u0000\u0000\u03ca\u03cb\u0005\u0003\u0000\u0000\u03cb"+
		"\u03cc\u0005\u0003\u0000\u0000\u03cc\u03cd\u0005\u0003\u0000\u0000\u03cd"+
		"\u03ce\u0005\u0004\u0000\u0000\u03ce\u03cf\u0005\b\u0000\u0000\u03cf\u03d0"+
		"\u0005\u0003\u0000\u0000\u03d0\u03d1\u0005\u0003\u0000\u0000\u03d1\u03d2"+
		"\u0005\u0003\u0000\u0000\u03d2\u03d3\u0005\u0004\u0000\u0000\u03d3\u03d4"+
		"\u0005\b\u0000\u0000\u03d4\u03d5\u0005\u0003\u0000\u0000\u03d5\u03d6\u0005"+
		"\u0003\u0000\u0000\u03d6\u03d7\u0005\u0003\u0000\u0000\u03d7\u03d8\u0005"+
		"\u0003\u0000\u0000\u03d8\u03d9\u0005\u0003\u0000\u0000\u03d9\u03da\u0005"+
		"\u0004\u0000\u0000\u03da\u03db\u0005\b\u0000\u0000\u03db\u03dc\u0005\u0003"+
		"\u0000\u0000\u03dc\u03dd\u0005\u0003\u0000\u0000\u03dd\u03de\u0005\u0003"+
		"\u0000\u0000\u03de\u03df\u0005\u0003\u0000\u0000\u03df\u03e0\u0005\u0003"+
		"\u0000\u0000\u03e0\u03e1\u0005\u0004\u0000\u0000\u03e1\u03e2\u0005\b\u0000"+
		"\u0000\u03e2\u03e3\u0005\u0003\u0000\u0000\u03e3\u03e4\u0005\u0003\u0000"+
		"\u0000\u03e4\u03e5\u0005\u0003\u0000\u0000\u03e5\u03e6\u0005\u0003\u0000"+
		"\u0000\u03e6\u03e7\u0005\u0004\u0000\u0000\u03e7\u03e8\u0005\b\u0000\u0000"+
		"\u03e8\u03e9\u0005\u0003\u0000\u0000\u03e9\u03ea\u0005\n\u0000\u0000\u03ea"+
		"\u03eb\u0005\u0004\u0000\u0000\u03eb\u03ec\u0005\b\u0000\u0000\u03ec\u03ed"+
		"\u0005\u0003\u0000\u0000\u03ed\u041e\u0005\u0004\u0000\u0000\u03ee\u03ef"+
		"\u0005\b\u0000\u0000\u03ef\u03f0\u0005\u0003\u0000\u0000\u03f0\u03f1\u0005"+
		"\u0006\u0000\u0000\u03f1\u03f2\u0005\u0004\u0000\u0000\u03f2\u03f3\u0005"+
		"\b\u0000\u0000\u03f3\u03f4\u0005\u0003\u0000\u0000\u03f4\u03f5\u0005\b"+
		"\u0000\u0000\u03f5\u03f6\u0005\u0004\u0000\u0000\u03f6\u03f7\u0005\b\u0000"+
		"\u0000\u03f7\u03f8\u0005\u0003\u0000\u0000\u03f8\u03f9\u0005\b\u0000\u0000"+
		"\u03f9\u03fa\u0005\u0004\u0000\u0000\u03fa\u03fb\u0005\b\u0000\u0000\u03fb"+
		"\u03fc\u0005\u0003\u0000\u0000\u03fc\u03fd\u0005\b\u0000\u0000\u03fd\u03fe"+
		"\u0005\u0004\u0000\u0000\u03fe\u03ff\u0005\b\u0000\u0000\u03ff\u0400\u0005"+
		"\u0003\u0000\u0000\u0400\u0401\u0005\b\u0000\u0000\u0401\u0402\u0005\u0004"+
		"\u0000\u0000\u0402\u0403\u0005\b\u0000\u0000\u0403\u0404\u0005\u0003\u0000"+
		"\u0000\u0404\u0405\u0005\b\u0000\u0000\u0405\u0406\u0005\u0004\u0000\u0000"+
		"\u0406\u0407\u0005\b\u0000\u0000\u0407\u0408\u0005\u0003\u0000\u0000\u0408"+
		"\u0409\u0005\b\u0000\u0000\u0409\u040a\u0005\u0004\u0000\u0000\u040a\u040b"+
		"\u0005\b\u0000\u0000\u040b\u040c\u0005\u0003\u0000\u0000\u040c\u040d\u0005"+
		"\b\u0000\u0000\u040d\u040e\u0005\u0004\u0000\u0000\u040e\u040f\u0005\b"+
		"\u0000\u0000\u040f\u0410\u0005\u0003\u0000\u0000\u0410\u0411\u0005\b\u0000"+
		"\u0000\u0411\u0412\u0005\u0004\u0000\u0000\u0412\u0413\u0005\b\u0000\u0000"+
		"\u0413\u0414\u0005\u0003\u0000\u0000\u0414\u0415\u0005\b\u0000\u0000\u0415"+
		"\u0416\u0005\u0004\u0000\u0000\u0416\u0417\u0005\b\u0000\u0000\u0417\u0418"+
		"\u0005\u0003\u0000\u0000\u0418\u0419\u0005\b\u0000\u0000\u0419\u041a\u0005"+
		"\u0004\u0000\u0000\u041a\u041b\u0005\b\u0000\u0000\u041b\u041c\u0005\u0003"+
		"\u0000\u0000\u041c\u041d\u0005\u0004\u0000\u0000\u041d\u041f\u0006\b\uffff"+
		"\uffff\u0000\u041e\u03ee\u0001\u0000\u0000\u0000\u041f\u0420\u0001\u0000"+
		"\u0000\u0000\u0420\u041e\u0001\u0000\u0000\u0000\u0420\u0421\u0001\u0000"+
		"\u0000\u0000\u0421\u0423\u0001\u0000\u0000\u0000\u0422\u0340\u0001\u0000"+
		"\u0000\u0000\u0423\u0424\u0001\u0000\u0000\u0000\u0424\u0422\u0001\u0000"+
		"\u0000\u0000\u0424\u0425\u0001\u0000\u0000\u0000\u0425\u0426\u0001\u0000"+
		"\u0000\u0000\u0426\u0427\u0005\n\u0000\u0000\u0427\u0428\u0005\u0003\u0000"+
		"\u0000\u0428\u0429\u0005\n\u0000\u0000\u0429\u042a\u0005\u0003\u0000\u0000"+
		"\u042a\u042b\u0005\u0006\u0000\u0000\u042b\u042d\u0005\u0004\u0000\u0000"+
		"\u042c\u0422\u0001\u0000\u0000\u0000\u042d\u042e\u0001\u0000\u0000\u0000"+
		"\u042e\u042c\u0001\u0000\u0000\u0000\u042e\u042f\u0001\u0000\u0000\u0000"+
		"\u042f\u0430\u0001\u0000\u0000\u0000\u0430\u0431\u0005\u0005\u0000\u0000"+
		"\u0431\u0432\u0005\u0003\u0000\u0000\u0432\u0433\u0005\n\u0000\u0000\u0433"+
		"\u0434\u0005\u0003\u0000\u0000\u0434\u0435\u0005\n\u0000\u0000\u0435\u0436"+
		"\u0005\n\u0000\u0000\u0436\u0437\u0005\n\u0000\u0000\u0437\u0438\u0005"+
		"\n\u0000\u0000\u0438\u0439\u0005\n\u0000\u0000\u0439\u043a\u0005\n\u0000"+
		"\u0000\u043a\u043b\u0005\n\u0000\u0000\u043b\u043c\u0005\u0003\u0000\u0000"+
		"\u043c\u043d\u0005\n\u0000\u0000\u043d\u043e\u0005\u0004\u0000\u0000\u043e"+
		"\u0011\u0001\u0000\u0000\u0000\u043f\u0440\u0005\u0005\u0000\u0000\u0440"+
		"\u0441\u0005\u0003\u0000\u0000\u0441\u0442\u0005\n\u0000\u0000\u0442\u0443"+
		"\u0005\u0003\u0000\u0000\u0443\u0444\u0005\n\u0000\u0000\u0444\u0445\u0005"+
		"\n\u0000\u0000\u0445\u0446\u0005\n\u0000\u0000\u0446\u0447\u0005\n\u0000"+
		"\u0000\u0447\u0448\u0005\n\u0000\u0000\u0448\u0449\u0005\n\u0000\u0000"+
		"\u0449\u044a\u0005\n\u0000\u0000\u044a\u044b\u0005\u0003\u0000\u0000\u044b"+
		"\u044c\u0005\n\u0000\u0000\u044c\u04d5\u0005\u0004\u0000\u0000\u044d\u044e"+
		"\u0005\b\u0000\u0000\u044e\u044f\u0005\u0003\u0000\u0000\u044f\u0450\u0005"+
		"\u0004\u0000\u0000\u0450\u0451\u0005\b\u0000\u0000\u0451\u0452\u0005\u0003"+
		"\u0000\u0000\u0452\u0453\u0005\u0003\u0000\u0000\u0453\u0454\u0005\u0003"+
		"\u0000\u0000\u0454\u0455\u0005\u0004\u0000\u0000\u0455\u0456\u0005\b\u0000"+
		"\u0000\u0456\u0457\u0005\u0003\u0000\u0000\u0457\u0458\u0005\u0003\u0000"+
		"\u0000\u0458\u0459\u0005\u0003\u0000\u0000\u0459\u045a\u0005\u0004\u0000"+
		"\u0000\u045a\u045b\u0005\b\u0000\u0000\u045b\u045c\u0005\u0003\u0000\u0000"+
		"\u045c\u045d\u0005\u0003\u0000\u0000\u045d\u045e\u0005\u0003\u0000\u0000"+
		"\u045e\u045f\u0005\u0004\u0000\u0000\u045f\u0460\u0005\b\u0000\u0000\u0460"+
		"\u0461\u0005\u0003\u0000\u0000\u0461\u0462\u0005\u0003\u0000\u0000\u0462"+
		"\u0463\u0005\u0003\u0000\u0000\u0463\u0464\u0005\u0004\u0000\u0000\u0464"+
		"\u0465\u0005\b\u0000\u0000\u0465\u0466\u0005\u0003\u0000\u0000\u0466\u0467"+
		"\u0005\u0003\u0000\u0000\u0467\u0468\u0005\u0003\u0000\u0000\u0468\u0469"+
		"\u0005\u0004\u0000\u0000\u0469\u046a\u0005\b\u0000\u0000\u046a\u046b\u0005"+
		"\u0003\u0000\u0000\u046b\u046c\u0005\u0003\u0000\u0000\u046c\u046d\u0005"+
		"\u0003\u0000\u0000\u046d\u046e\u0005\u0004\u0000\u0000\u046e\u046f\u0005"+
		"\b\u0000\u0000\u046f\u0470\u0005\u0003\u0000\u0000\u0470\u0471\u0005\u0003"+
		"\u0000\u0000\u0471\u0472\u0005\u0003\u0000\u0000\u0472\u0473\u0005\n\u0000"+
		"\u0000\u0473\u0474\u0005\u0004\u0000\u0000\u0474\u0475\u0005\b\u0000\u0000"+
		"\u0475\u0476\u0005\u0003\u0000\u0000\u0476\u0477\u0005\u0003\u0000\u0000"+
		"\u0477\u0478\u0005\u0003\u0000\u0000\u0478\u04c6\u0005\u0004\u0000\u0000"+
		"\u0479\u047a\u00032\u0019\u0000\u047a\u047b\u0005\u0003\u0000\u0000\u047b"+
		"\u047c\u0005\u0006\u0000\u0000\u047c\u047d\u0005\u0004\u0000\u0000\u047d"+
		"\u047e\u0005\b\u0000\u0000\u047e\u047f\u0005\u0003\u0000\u0000\u047f\u0480"+
		"\u0005\b\u0000\u0000\u0480\u0481\u0005\u0004\u0000\u0000\u0481\u0482\u0005"+
		"\b\u0000\u0000\u0482\u0483\u0005\u0003\u0000\u0000\u0483\u0484\u0005\b"+
		"\u0000\u0000\u0484\u0485\u0005\u0004\u0000\u0000\u0485\u0486\u0005\b\u0000"+
		"\u0000\u0486\u0487\u0005\u0003\u0000\u0000\u0487\u0488\u0005\b\u0000\u0000"+
		"\u0488\u0489\u0005\u0004\u0000\u0000\u0489\u048a\u0005\b\u0000\u0000\u048a"+
		"\u048b\u0005\u0003\u0000\u0000\u048b\u048c\u0005\b\u0000\u0000\u048c\u048d"+
		"\u0005\u0004\u0000\u0000\u048d\u048e\u0005\b\u0000\u0000\u048e\u048f\u0005"+
		"\u0003\u0000\u0000\u048f\u0490\u0005\b\u0000\u0000\u0490\u0491\u0005\u0004"+
		"\u0000\u0000\u0491\u0492\u0005\b\u0000\u0000\u0492\u0493\u0005\u0003\u0000"+
		"\u0000\u0493\u0494\u0005\b\u0000\u0000\u0494\u0495\u0005\u0004\u0000\u0000"+
		"\u0495\u0496\u0005\b\u0000\u0000\u0496\u0497\u0005\u0003\u0000\u0000\u0497"+
		"\u0498\u0005\b\u0000\u0000\u0498\u0499\u0005\u0004\u0000\u0000\u0499\u049a"+
		"\u0005\b\u0000\u0000\u049a\u049b\u0005\u0003\u0000\u0000\u049b\u049c\u0005"+
		"\b\u0000\u0000\u049c\u049d\u0005\u0004\u0000\u0000\u049d\u049e\u0005\b"+
		"\u0000\u0000\u049e\u049f\u0005\u0003\u0000\u0000\u049f\u04a0\u0005\b\u0000"+
		"\u0000\u04a0\u04a1\u0005\u0004\u0000\u0000\u04a1\u04a2\u0005\b\u0000\u0000"+
		"\u04a2\u04a3\u0005\u0003\u0000\u0000\u04a3\u04a4\u0005\b\u0000\u0000\u04a4"+
		"\u04a5\u0005\u0004\u0000\u0000\u04a5\u04a6\u0005\b\u0000\u0000\u04a6\u04a7"+
		"\u0005\u0003\u0000\u0000\u04a7\u04a8\u0005\b\u0000\u0000\u04a8\u04a9\u0005"+
		"\u0004\u0000\u0000\u04a9\u04aa\u0005\b\u0000\u0000\u04aa\u04ab\u0005\u0003"+
		"\u0000\u0000\u04ab\u04ac\u0005\b\u0000\u0000\u04ac\u04ad\u0005\u0004\u0000"+
		"\u0000\u04ad\u04ae\u0005\b\u0000\u0000\u04ae\u04b0\u0005\u0003\u0000\u0000"+
		"\u04af\u04b1\u00032\u0019\u0000\u04b0\u04af\u0001\u0000\u0000\u0000\u04b1"+
		"\u04b2\u0001\u0000\u0000\u0000\u04b2\u04b0\u0001\u0000\u0000\u0000\u04b2"+
		"\u04b3\u0001\u0000\u0000\u0000\u04b3\u04b4\u0001\u0000\u0000\u0000\u04b4"+
		"\u04b5\u0005\u0004\u0000\u0000\u04b5\u04b6\u0005\b\u0000\u0000\u04b6\u04b7"+
		"\u0005\u0003\u0000\u0000\u04b7\u04b8\u00032\u0019\u0000\u04b8\u04b9\u0005"+
		"\u0004\u0000\u0000\u04b9\u04ba\u0005\b\u0000\u0000\u04ba\u04bb\u0005\u0003"+
		"\u0000\u0000\u04bb\u04bc\u00032\u0019\u0000\u04bc\u04bd\u0005\u0004\u0000"+
		"\u0000\u04bd\u04be\u0005\b\u0000\u0000\u04be\u04bf\u0005\u0003\u0000\u0000"+
		"\u04bf\u04c0\u00032\u0019\u0000\u04c0\u04c1\u0005\u0004\u0000\u0000\u04c1"+
		"\u04c2\u0005\b\u0000\u0000\u04c2\u04c3\u0005\u0003\u0000\u0000\u04c3\u04c4"+
		"\u0005\u0004\u0000\u0000\u04c4\u04c5\u0006\t\uffff\uffff\u0000\u04c5\u04c7"+
		"\u0001\u0000\u0000\u0000\u04c6\u0479\u0001\u0000\u0000\u0000\u04c7\u04c8"+
		"\u0001\u0000\u0000\u0000\u04c8\u04c6\u0001\u0000\u0000\u0000\u04c8\u04c9"+
		"\u0001\u0000\u0000\u0000\u04c9\u04cb\u0001\u0000\u0000\u0000\u04ca\u044d"+
		"\u0001\u0000\u0000\u0000\u04cb\u04cc\u0001\u0000\u0000\u0000\u04cc\u04ca"+
		"\u0001\u0000\u0000\u0000\u04cc\u04cd\u0001\u0000\u0000\u0000\u04cd\u04ce"+
		"\u0001\u0000\u0000\u0000\u04ce\u04cf\u0005\n\u0000\u0000\u04cf\u04d0\u0005"+
		"\u0003\u0000\u0000\u04d0\u04d1\u0005\n\u0000\u0000\u04d1\u04d2\u0005\u0003"+
		"\u0000\u0000\u04d2\u04d3\u0005\u0006\u0000\u0000\u04d3\u04d4\u0005\u0004"+
		"\u0000\u0000\u04d4\u04d6\u0001\u0000\u0000\u0000\u04d5\u04ca\u0001\u0000"+
		"\u0000\u0000\u04d6\u04d7\u0001\u0000\u0000\u0000\u04d7\u04d5\u0001\u0000"+
		"\u0000\u0000\u04d7\u04d8\u0001\u0000\u0000\u0000\u04d8\u04d9\u0001\u0000"+
		"\u0000\u0000\u04d9\u04da\u0005\u0005\u0000\u0000\u04da\u04db\u0005\u0003"+
		"\u0000\u0000\u04db\u04dc\u0005\n\u0000\u0000\u04dc\u04dd\u0005\u0003\u0000"+
		"\u0000\u04dd\u04de\u0005\n\u0000\u0000\u04de\u04df\u0005\n\u0000\u0000"+
		"\u04df\u04e0\u0005\n\u0000\u0000\u04e0\u04e1\u0005\n\u0000\u0000\u04e1"+
		"\u04e2\u0005\n\u0000\u0000\u04e2\u04e3\u0005\n\u0000\u0000\u04e3\u04e4"+
		"\u0005\n\u0000\u0000\u04e4\u04e5\u0005\u0003\u0000\u0000\u04e5\u04e6\u0005"+
		"\n\u0000\u0000\u04e6\u04e7\u0005\u0004\u0000\u0000\u04e7\u0013\u0001\u0000"+
		"\u0000\u0000\u04e8\u04e9\u0005\u0005\u0000\u0000\u04e9\u04ea\u0005\u0003"+
		"\u0000\u0000\u04ea\u04eb\u0005\n\u0000\u0000\u04eb\u04ec\u0005\u0003\u0000"+
		"\u0000\u04ec\u04ed\u0005\n\u0000\u0000\u04ed\u04ee\u0005\n\u0000\u0000"+
		"\u04ee\u04ef\u0005\n\u0000\u0000\u04ef\u04f0\u0005\n\u0000\u0000\u04f0"+
		"\u04f1\u0005\n\u0000\u0000\u04f1\u04f2\u0005\n\u0000\u0000\u04f2\u04f3"+
		"\u0005\u0003\u0000\u0000\u04f3\u04f4\u0005\n\u0000\u0000\u04f4\u04f5\u0005"+
		"\u0004\u0000\u0000\u04f5\u04f6\u0005\u0005\u0000\u0000\u04f6\u04f7\u0005"+
		"\u0003\u0000\u0000\u04f7\u04f8\u0005\n\u0000\u0000\u04f8\u04f9\u0005\u0004"+
		"\u0000\u0000\u04f9\u04fa\u0005\n\u0000\u0000\u04fa\u04fb\u0005\u0003\u0000"+
		"\u0000\u04fb\u04fc\u0005\n\u0000\u0000\u04fc\u04fd\u0005\u0003\u0000\u0000"+
		"\u04fd\u04ff\u00032\u0019\u0000\u04fe\u0500\u00032\u0019\u0000\u04ff\u04fe"+
		"\u0001\u0000\u0000\u0000\u04ff\u0500\u0001\u0000\u0000\u0000\u0500\u0502"+
		"\u0001\u0000\u0000\u0000\u0501\u0503\u00032\u0019\u0000\u0502\u0501\u0001"+
		"\u0000\u0000\u0000\u0502\u0503\u0001\u0000\u0000\u0000\u0503\u0505\u0001"+
		"\u0000\u0000\u0000\u0504\u0506\u00032\u0019\u0000\u0505\u0504\u0001\u0000"+
		"\u0000\u0000\u0505\u0506\u0001\u0000\u0000\u0000\u0506\u0508\u0001\u0000"+
		"\u0000\u0000\u0507\u0509\u00032\u0019\u0000\u0508\u0507\u0001\u0000\u0000"+
		"\u0000\u0508\u0509\u0001\u0000\u0000\u0000\u0509\u050b\u0001\u0000\u0000"+
		"\u0000\u050a\u050c\u00032\u0019\u0000\u050b\u050a\u0001\u0000\u0000\u0000"+
		"\u050b\u050c\u0001\u0000\u0000\u0000\u050c\u050e\u0001\u0000\u0000\u0000"+
		"\u050d\u050f\u00032\u0019\u0000\u050e\u050d\u0001\u0000\u0000\u0000\u050e"+
		"\u050f\u0001\u0000\u0000\u0000\u050f\u0513\u0001\u0000\u0000\u0000\u0510"+
		"\u0512\u00032\u0019\u0000\u0511\u0510\u0001\u0000\u0000\u0000\u0512\u0515"+
		"\u0001\u0000\u0000\u0000\u0513\u0511\u0001\u0000\u0000\u0000\u0513\u0514"+
		"\u0001\u0000\u0000\u0000\u0514\u0516\u0001\u0000\u0000\u0000\u0515\u0513"+
		"\u0001\u0000\u0000\u0000\u0516\u0518\u0005\u0003\u0000\u0000\u0517\u0519"+
		"\u00032\u0019\u0000\u0518\u0517\u0001\u0000\u0000\u0000\u0519\u051a\u0001"+
		"\u0000\u0000\u0000\u051a\u0518\u0001\u0000\u0000\u0000\u051a\u051b\u0001"+
		"\u0000\u0000\u0000\u051b\u051c\u0001\u0000\u0000\u0000\u051c\u051d\u0005"+
		"\u0003\u0000\u0000\u051d\u051e\u0005\u0004\u0000\u0000\u051e\u051f\u0005"+
		"\n\u0000\u0000\u051f\u0520\u0005\u0003\u0000\u0000\u0520\u0521\u0005\n"+
		"\u0000\u0000\u0521\u0522\u0005\u0003\u0000\u0000\u0522\u0523\u0005\n\u0000"+
		"\u0000\u0523\u0524\u0005\u0003\u0000\u0000\u0524\u0525\u00032\u0019\u0000"+
		"\u0525\u0526\u0005\u0003\u0000\u0000\u0526\u0527\u0005\u0004\u0000\u0000"+
		"\u0527\u0528\u0005\n\u0000\u0000\u0528\u0529\u0005\u0003\u0000\u0000\u0529"+
		"\u052a\u0005\n\u0000\u0000\u052a\u052b\u0005\u0003\u0000\u0000\u052b\u052c"+
		"\u00032\u0019\u0000\u052c\u052d\u0005\u0003\u0000\u0000\u052d\u052e\u0005"+
		"\b\u0000\u0000\u052e\u052f\u0005\u0003\u0000\u0000\u052f\u0530\u0005\u0004"+
		"\u0000\u0000\u0530\u0531\u0005\n\u0000\u0000\u0531\u0532\u0005\u0003\u0000"+
		"\u0000\u0532\u0533\u0005\n\u0000\u0000\u0533\u0534\u0005\u0003\u0000\u0000"+
		"\u0534\u0535\u0005\b\u0000\u0000\u0535\u0536\u0005\u0003\u0000\u0000\u0536"+
		"\u0537\u0005\n\u0000\u0000\u0537\u0538\u0005\u0003\u0000\u0000\u0538\u0539"+
		"\u0005\u0004\u0000\u0000\u0539\u053a\u0005\n\u0000\u0000\u053a\u053b\u0005"+
		"\u0003\u0000\u0000\u053b\u053c\u0005\n\u0000\u0000\u053c\u053d\u0005\u0003"+
		"\u0000\u0000\u053d\u053e\u0005\u0006\u0000\u0000\u053e\u053f\u0005\u0003"+
		"\u0000\u0000\u053f\u0540\u0005\u0006\u0000\u0000\u0540\u0541\u0005\u0003"+
		"\u0000\u0000\u0541\u0542\u0005\u0004\u0000\u0000\u0542\u0543\u0005\n\u0000"+
		"\u0000\u0543\u0544\u0005\u0003\u0000\u0000\u0544\u0545\u0005\n\u0000\u0000"+
		"\u0545\u0546\u0005\u0003\u0000\u0000\u0546\u0548\u00032\u0019\u0000\u0547"+
		"\u0549\u00032\u0019\u0000\u0548\u0547\u0001\u0000\u0000\u0000\u0548\u0549"+
		"\u0001\u0000\u0000\u0000\u0549\u054b\u0001\u0000\u0000\u0000\u054a\u054c"+
		"\u00032\u0019\u0000\u054b\u054a\u0001\u0000\u0000\u0000\u054b\u054c\u0001"+
		"\u0000\u0000\u0000\u054c\u054e\u0001\u0000\u0000\u0000\u054d\u054f\u0003"+
		"2\u0019\u0000\u054e\u054d\u0001\u0000\u0000\u0000\u054e\u054f\u0001\u0000"+
		"\u0000\u0000\u054f\u0551\u0001\u0000\u0000\u0000\u0550\u0552\u00032\u0019"+
		"\u0000\u0551\u0550\u0001\u0000\u0000\u0000\u0551\u0552\u0001\u0000\u0000"+
		"\u0000\u0552\u0554\u0001\u0000\u0000\u0000\u0553\u0555\u00032\u0019\u0000"+
		"\u0554\u0553\u0001\u0000\u0000\u0000\u0554\u0555\u0001\u0000\u0000\u0000"+
		"\u0555\u0557\u0001\u0000\u0000\u0000\u0556\u0558\u00032\u0019\u0000\u0557"+
		"\u0556\u0001\u0000\u0000\u0000\u0557\u0558\u0001\u0000\u0000\u0000\u0558"+
		"\u055c\u0001\u0000\u0000\u0000\u0559\u055b\u00032\u0019\u0000\u055a\u0559"+
		"\u0001\u0000\u0000\u0000\u055b\u055e\u0001\u0000\u0000\u0000\u055c\u055a"+
		"\u0001\u0000\u0000\u0000\u055c\u055d\u0001\u0000\u0000\u0000\u055d\u055f"+
		"\u0001\u0000\u0000\u0000\u055e\u055c\u0001\u0000\u0000\u0000\u055f\u0561"+
		"\u0005\u0003\u0000\u0000\u0560\u0562\u00032\u0019\u0000\u0561\u0560\u0001"+
		"\u0000\u0000\u0000\u0562\u0563\u0001\u0000\u0000\u0000\u0563\u0561\u0001"+
		"\u0000\u0000\u0000\u0563\u0564\u0001\u0000\u0000\u0000\u0564\u0565\u0001"+
		"\u0000\u0000\u0000\u0565\u0566\u0005\u0003\u0000\u0000\u0566\u0567\u0005"+
		"\u0004\u0000\u0000\u0567\u0568\u0005\n\u0000\u0000\u0568\u056a\u0005\u0003"+
		"\u0000\u0000\u0569\u056b\u00032\u0019\u0000\u056a\u0569\u0001\u0000\u0000"+
		"\u0000\u056b\u056c\u0001\u0000\u0000\u0000\u056c\u056a\u0001\u0000\u0000"+
		"\u0000\u056c\u056d\u0001\u0000\u0000\u0000\u056d\u056e\u0001\u0000\u0000"+
		"\u0000\u056e\u056f\u0005\u0003\u0000\u0000\u056f\u0570\u0005\u0004\u0000"+
		"\u0000\u0570\u0571\u0005\n\u0000\u0000\u0571\u0574\u0005\u0003\u0000\u0000"+
		"\u0572\u0573\u0005\b\u0000\u0000\u0573\u0575\u0005\u0003\u0000\u0000\u0574"+
		"\u0572\u0001\u0000\u0000\u0000\u0574\u0575\u0001\u0000\u0000\u0000\u0575"+
		"\u0579\u0001\u0000\u0000\u0000\u0576\u0578\u00032\u0019\u0000\u0577\u0576"+
		"\u0001\u0000\u0000\u0000\u0578\u057b\u0001\u0000\u0000\u0000\u0579\u0577"+
		"\u0001\u0000\u0000\u0000\u0579\u057a\u0001\u0000\u0000\u0000\u057a\u057c"+
		"\u0001\u0000\u0000\u0000\u057b\u0579\u0001\u0000\u0000\u0000\u057c\u057d"+
		"\u0005\u0003\u0000\u0000\u057d\u057e\u0005\u0004\u0000\u0000\u057e\u057f"+
		"\u0005\n\u0000\u0000\u057f\u0580\u0005\u0003\u0000\u0000\u0580\u0581\u0005"+
		"\n\u0000\u0000\u0581\u0582\u0005\u0003\u0000\u0000\u0582\u0583\u0005\u0004"+
		"\u0000\u0000\u0583\u0584\u0005\n\u0000\u0000\u0584\u0585\u0005\u0003\u0000"+
		"\u0000\u0585\u0586\u0005\n\u0000\u0000\u0586\u0587\u0005\u0003\u0000\u0000"+
		"\u0587\u0588\u0005\u0006\u0000\u0000\u0588\u0589\u0005\u0004\u0000\u0000"+
		"\u0589\u058a\u0005\u0005\u0000\u0000\u058a\u058b\u0005\u0003\u0000\u0000"+
		"\u058b\u058c\u0005\n\u0000\u0000\u058c\u058d\u0005\u0003\u0000\u0000\u058d"+
		"\u058e\u0005\n\u0000\u0000\u058e\u058f\u0005\n\u0000\u0000\u058f\u0590"+
		"\u0005\n\u0000\u0000\u0590\u0591\u0005\n\u0000\u0000\u0591\u0592\u0005"+
		"\n\u0000\u0000\u0592\u0593\u0005\n\u0000\u0000\u0593\u0594\u0005\u0003"+
		"\u0000\u0000\u0594\u0595\u0005\n\u0000\u0000\u0595\u0596\u0005\u0004\u0000"+
		"\u0000\u0596\u0597\u0006\n\uffff\uffff\u0000\u0597\u0015\u0001\u0000\u0000"+
		"\u0000\u0598\u0599\u0005\u0005\u0000\u0000\u0599\u059a\u0005\u0003\u0000"+
		"\u0000\u059a\u059b\u0005\n\u0000\u0000\u059b\u059c\u0005\u0003\u0000\u0000"+
		"\u059c\u059d\u0005\n\u0000\u0000\u059d\u059e\u0005\n\u0000\u0000\u059e"+
		"\u059f\u0005\n\u0000\u0000\u059f\u05a0\u0005\n\u0000\u0000\u05a0\u05a1"+
		"\u0005\n\u0000\u0000\u05a1\u05a2\u0005\n\u0000\u0000\u05a2\u05a3\u0005"+
		"\u0003\u0000\u0000\u05a3\u05a4\u0005\n\u0000\u0000\u05a4\u05a5\u0005\u0004"+
		"\u0000\u0000\u05a5\u05a6\u0005\u0005\u0000\u0000\u05a6\u05a7\u0005\u0003"+
		"\u0000\u0000\u05a7\u05a9\u00032\u0019\u0000\u05a8\u05aa\u00032\u0019\u0000"+
		"\u05a9\u05a8\u0001\u0000\u0000\u0000\u05a9\u05aa\u0001\u0000\u0000\u0000"+
		"\u05aa\u05ac\u0001\u0000\u0000\u0000\u05ab\u05ad\u00032\u0019\u0000\u05ac"+
		"\u05ab\u0001\u0000\u0000\u0000\u05ac\u05ad\u0001\u0000\u0000\u0000\u05ad"+
		"\u05af\u0001\u0000\u0000\u0000\u05ae\u05b0\u00032\u0019\u0000\u05af\u05ae"+
		"\u0001\u0000\u0000\u0000\u05af\u05b0\u0001\u0000\u0000\u0000\u05b0\u05b2"+
		"\u0001\u0000\u0000\u0000\u05b1\u05b3\u00032\u0019\u0000\u05b2\u05b1\u0001"+
		"\u0000\u0000\u0000\u05b2\u05b3\u0001\u0000\u0000\u0000\u05b3\u05b5\u0001"+
		"\u0000\u0000\u0000\u05b4\u05b6\u00032\u0019\u0000\u05b5\u05b4\u0001\u0000"+
		"\u0000\u0000\u05b5\u05b6\u0001\u0000\u0000\u0000\u05b6\u05b8\u0001\u0000"+
		"\u0000\u0000\u05b7\u05b9\u00032\u0019\u0000\u05b8\u05b7\u0001\u0000\u0000"+
		"\u0000\u05b8\u05b9\u0001\u0000\u0000\u0000\u05b9\u05bd\u0001\u0000\u0000"+
		"\u0000\u05ba\u05bc\u00032\u0019\u0000\u05bb\u05ba\u0001\u0000\u0000\u0000"+
		"\u05bc\u05bf\u0001\u0000\u0000\u0000\u05bd\u05bb\u0001\u0000\u0000\u0000"+
		"\u05bd\u05be\u0001\u0000\u0000\u0000\u05be\u05c0\u0001\u0000\u0000\u0000"+
		"\u05bf\u05bd\u0001\u0000\u0000\u0000\u05c0\u05c1\u0005\u0004\u0000\u0000"+
		"\u05c1\u05c2\u0005\n\u0000\u0000\u05c2\u05c3\u0005\u0003\u0000\u0000\u05c3"+
		"\u05c4\u0005\n\u0000\u0000\u05c4\u05c6\u0005\u0003\u0000\u0000\u05c5\u05c7"+
		"\u00032\u0019\u0000\u05c6\u05c5\u0001\u0000\u0000\u0000\u05c7\u05c8\u0001"+
		"\u0000\u0000\u0000\u05c8\u05c6\u0001\u0000\u0000\u0000\u05c8\u05c9\u0001"+
		"\u0000\u0000\u0000\u05c9\u05ca\u0001\u0000\u0000\u0000\u05ca\u05cc\u0005"+
		"\u0003\u0000\u0000\u05cb\u05cd\u00032\u0019\u0000\u05cc\u05cb\u0001\u0000"+
		"\u0000\u0000\u05cd\u05ce\u0001\u0000\u0000\u0000\u05ce\u05cc\u0001\u0000"+
		"\u0000\u0000\u05ce\u05cf\u0001\u0000\u0000\u0000\u05cf\u05d0\u0001\u0000"+
		"\u0000\u0000\u05d0\u05d1\u0005\u0003\u0000\u0000\u05d1\u05d2\u0005\u0004"+
		"\u0000\u0000\u05d2\u05d3\u0005\n\u0000\u0000\u05d3\u05d4\u0005\u0003\u0000"+
		"\u0000\u05d4\u05d5\u0005\n\u0000\u0000\u05d5\u05d6\u0005\u0003\u0000\u0000"+
		"\u05d6\u05d7\u0005\n\u0000\u0000\u05d7\u05d8\u0005\u0003\u0000\u0000\u05d8"+
		"\u05d9\u00032\u0019\u0000\u05d9\u05da\u0005\u0003\u0000\u0000\u05da\u05db"+
		"\u0005\u0004\u0000\u0000\u05db\u05dc\u0005\n\u0000\u0000\u05dc\u05dd\u0005"+
		"\u0003\u0000\u0000\u05dd\u05de\u0005\n\u0000\u0000\u05de\u05e0\u0005\u0003"+
		"\u0000\u0000\u05df\u05e1\u00032\u0019\u0000\u05e0\u05df\u0001\u0000\u0000"+
		"\u0000\u05e1\u05e2\u0001\u0000\u0000\u0000\u05e2\u05e0\u0001\u0000\u0000"+
		"\u0000\u05e2\u05e3\u0001\u0000\u0000\u0000\u05e3\u05e4\u0001\u0000\u0000"+
		"\u0000\u05e4\u05e6\u0005\u0003\u0000\u0000\u05e5\u05e7\u00032\u0019\u0000"+
		"\u05e6\u05e5\u0001\u0000\u0000\u0000\u05e7\u05e8\u0001\u0000\u0000\u0000"+
		"\u05e8\u05e6\u0001\u0000\u0000\u0000\u05e8\u05e9\u0001\u0000\u0000\u0000"+
		"\u05e9\u05ea\u0001\u0000\u0000\u0000\u05ea\u05eb\u0005\u0003\u0000\u0000"+
		"\u05eb\u05ec\u0005\u0004\u0000\u0000\u05ec\u05ed\u0005\n\u0000\u0000\u05ed"+
		"\u05ee\u0005\u0003\u0000\u0000\u05ee\u05ef\u0005\n\u0000\u0000\u05ef\u05f0"+
		"\u0005\u0003\u0000\u0000\u05f0\u05f1\u0005\b\u0000\u0000\u05f1\u05f2\u0005"+
		"\u0003\u0000\u0000\u05f2\u05f3\u0005\b\u0000\u0000\u05f3\u05f4\u0005\u0003"+
		"\u0000\u0000\u05f4\u05f5\u0005\u0004\u0000\u0000\u05f5\u05f6\u0005\n\u0000"+
		"\u0000\u05f6\u05f7\u0005\u0003\u0000\u0000\u05f7\u05f8\u0005\n\u0000\u0000"+
		"\u05f8\u05f9\u0005\u0003\u0000\u0000\u05f9\u05fa\u0005\b\u0000\u0000\u05fa"+
		"\u05fb\u0005\u0003\u0000\u0000\u05fb\u05fc\u0005\u0006\u0000\u0000\u05fc"+
		"\u05fd\u0005\u0003\u0000\u0000\u05fd\u05fe\u0005\u0004\u0000\u0000\u05fe"+
		"\u05ff\u0005\n\u0000\u0000\u05ff\u0600\u0005\u0003\u0000\u0000\u0600\u0601"+
		"\u0005\n\u0000\u0000\u0601\u0602\u0005\u0003\u0000\u0000\u0602\u0603\u0005"+
		"\n\u0000\u0000\u0603\u0604\u0005\u0003\u0000\u0000\u0604\u0605\u0005\n"+
		"\u0000\u0000\u0605\u0606\u0005\u0003\u0000\u0000\u0606\u0607\u0005\u0004"+
		"\u0000\u0000\u0607\u0608\u0005\n\u0000\u0000\u0608\u0609\u0005\u0003\u0000"+
		"\u0000\u0609\u060a\u0005\n\u0000\u0000\u060a\u060b\u0005\u0003\u0000\u0000"+
		"\u060b\u060c\u0005\n\u0000\u0000\u060c\u060d\u0005\u0003\u0000\u0000\u060d"+
		"\u060e\u0005\n\u0000\u0000\u060e\u060f\u0005\u0003\u0000\u0000\u060f\u0610"+
		"\u0005\u0004\u0000\u0000\u0610\u0611\u0005\n\u0000\u0000\u0611\u0612\u0005"+
		"\u0003\u0000\u0000\u0612\u0613\u0005\n\u0000\u0000\u0613\u0614\u0005\u0003"+
		"\u0000\u0000\u0614\u0615\u0005\n\u0000\u0000\u0615\u0616\u0005\u0003\u0000"+
		"\u0000\u0616\u0618\u00032\u0019\u0000\u0617\u0619\u00032\u0019\u0000\u0618"+
		"\u0617\u0001\u0000\u0000\u0000\u0618\u0619\u0001\u0000\u0000\u0000\u0619"+
		"\u061b\u0001\u0000\u0000\u0000\u061a\u061c\u00032\u0019\u0000\u061b\u061a"+
		"\u0001\u0000\u0000\u0000\u061b\u061c\u0001\u0000\u0000\u0000\u061c\u061e"+
		"\u0001\u0000\u0000\u0000\u061d\u061f\u00032\u0019\u0000\u061e\u061d\u0001"+
		"\u0000\u0000\u0000\u061e\u061f\u0001\u0000\u0000\u0000\u061f\u0621\u0001"+
		"\u0000\u0000\u0000\u0620\u0622\u00032\u0019\u0000\u0621\u0620\u0001\u0000"+
		"\u0000\u0000\u0621\u0622\u0001\u0000\u0000\u0000\u0622\u0624\u0001\u0000"+
		"\u0000\u0000\u0623\u0625\u00032\u0019\u0000\u0624\u0623\u0001\u0000\u0000"+
		"\u0000\u0624\u0625\u0001\u0000\u0000\u0000\u0625\u0627\u0001\u0000\u0000"+
		"\u0000\u0626\u0628\u00032\u0019\u0000\u0627\u0626\u0001\u0000\u0000\u0000"+
		"\u0627\u0628\u0001\u0000\u0000\u0000\u0628\u062c\u0001\u0000\u0000\u0000"+
		"\u0629\u062b\u00032\u0019\u0000\u062a\u0629\u0001\u0000\u0000\u0000\u062b"+
		"\u062e\u0001\u0000\u0000\u0000\u062c\u062a\u0001\u0000\u0000\u0000\u062c"+
		"\u062d\u0001\u0000\u0000\u0000\u062d\u062f\u0001\u0000\u0000\u0000\u062e"+
		"\u062c\u0001\u0000\u0000\u0000\u062f\u0630\u0005\u0003\u0000\u0000\u0630"+
		"\u0631\u0005\u0004\u0000\u0000\u0631\u0632\u0005\n\u0000\u0000\u0632\u0633"+
		"\u0005\n\u0000\u0000\u0633\u0635\u0005\u0003\u0000\u0000\u0634\u0636\u0003"+
		"2\u0019\u0000\u0635\u0634\u0001\u0000\u0000\u0000\u0636\u0637\u0001\u0000"+
		"\u0000\u0000\u0637\u0635\u0001\u0000\u0000\u0000\u0637\u0638\u0001\u0000"+
		"\u0000\u0000\u0638\u0639\u0001\u0000\u0000\u0000\u0639\u063a\u0005\u0003"+
		"\u0000\u0000\u063a\u063b\u0005\u0004\u0000\u0000\u063b\u063c\u0005\n\u0000"+
		"\u0000\u063c\u063e\u0005\u0003\u0000\u0000\u063d\u063f\u00032\u0019\u0000"+
		"\u063e\u063d\u0001\u0000\u0000\u0000\u063f\u0640\u0001\u0000\u0000\u0000"+
		"\u0640\u063e\u0001\u0000\u0000\u0000\u0640\u0641\u0001\u0000\u0000\u0000"+
		"\u0641\u0642\u0001\u0000\u0000\u0000\u0642\u0643\u0005\u0003\u0000\u0000"+
		"\u0643\u0644\u0005\u0004\u0000\u0000\u0644\u0645\u0005\n\u0000\u0000\u0645"+
		"\u0646\u0005\u0003\u0000\u0000\u0646\u0647\u0005\n\u0000\u0000\u0647\u0648"+
		"\u0005\u0003\u0000\u0000\u0648\u0649\u0005\u0006\u0000\u0000\u0649\u064a"+
		"\u0005\u0004\u0000\u0000\u064a\u064b\u0005\u0005\u0000\u0000\u064b\u064c"+
		"\u0005\u0003\u0000\u0000\u064c\u064d\u0005\n\u0000\u0000\u064d\u064e\u0005"+
		"\u0003\u0000\u0000\u064e\u064f\u0005\n\u0000\u0000\u064f\u0650\u0005\n"+
		"\u0000\u0000\u0650\u0651\u0005\n\u0000\u0000\u0651\u0652\u0005\n\u0000"+
		"\u0000\u0652\u0653\u0005\n\u0000\u0000\u0653\u0654\u0005\n\u0000\u0000"+
		"\u0654\u0655\u0005\u0003\u0000\u0000\u0655\u0656\u0005\n\u0000\u0000\u0656"+
		"\u0657\u0005\u0004\u0000\u0000\u0657\u0658\u0006\u000b\uffff\uffff\u0000"+
		"\u0658\u0017\u0001\u0000\u0000\u0000\u0659\u065a\u0005\u0005\u0000\u0000"+
		"\u065a\u065b\u0005\u0003\u0000\u0000\u065b\u065c\u0005\n\u0000\u0000\u065c"+
		"\u065d\u0005\u0003\u0000\u0000\u065d\u065e\u0005\n\u0000\u0000\u065e\u065f"+
		"\u0005\n\u0000\u0000\u065f\u0660\u0005\n\u0000\u0000\u0660\u0661\u0005"+
		"\n\u0000\u0000\u0661\u0662\u0005\n\u0000\u0000\u0662\u0663\u0005\n\u0000"+
		"\u0000\u0663\u0664\u0005\u0003\u0000\u0000\u0664\u0665\u0005\n\u0000\u0000"+
		"\u0665\u0763\u0005\u0004\u0000\u0000\u0666\u0667\u0005\n\u0000\u0000\u0667"+
		"\u0668\u0005\u0003\u0000\u0000\u0668\u0669\u0005\u0004\u0000\u0000\u0669"+
		"\u066a\u0005\n\u0000\u0000\u066a\u066b\u0005\u0003\u0000\u0000\u066b\u066c"+
		"\u0005\u0003\u0000\u0000\u066c\u066d\u0005\u0003\u0000\u0000\u066d\u066e"+
		"\u0005\u0004\u0000\u0000\u066e\u066f\u0005\n\u0000\u0000\u066f\u0670\u0005"+
		"\u0003\u0000\u0000\u0670\u0671\u0005\u0003\u0000\u0000\u0671\u0672\u0005"+
		"\u0003\u0000\u0000\u0672\u0673\u0005\u0004\u0000\u0000\u0673\u0674\u0005"+
		"\n\u0000\u0000\u0674\u0675\u0005\u0003\u0000\u0000\u0675\u0676\u0005\u0003"+
		"\u0000\u0000\u0676\u0677\u0005\u0003\u0000\u0000\u0677\u0678\u0005\u0004"+
		"\u0000\u0000\u0678\u0679\u0005\n\u0000\u0000\u0679\u067a\u0005\u0003\u0000"+
		"\u0000\u067a\u067b\u0005\u0003\u0000\u0000\u067b\u067c\u0005\u0003\u0000"+
		"\u0000\u067c\u067d\u0005\u0004\u0000\u0000\u067d\u067e\u0005\n\u0000\u0000"+
		"\u067e\u067f\u0005\u0003\u0000\u0000\u067f\u0680\u0005\u0003\u0000\u0000"+
		"\u0680\u0681\u0005\u0003\u0000\u0000\u0681\u0682\u0005\u0004\u0000\u0000"+
		"\u0682\u0683\u0005\n\u0000\u0000\u0683\u0684\u0005\u0003\u0000\u0000\u0684"+
		"\u0685\u0005\u0003\u0000\u0000\u0685\u0686\u0005\u0003\u0000\u0000\u0686"+
		"\u0687\u0005\u0004\u0000\u0000\u0687\u0688\u0005\n\u0000\u0000\u0688\u0689"+
		"\u0005\u0003\u0000\u0000\u0689\u068a\u0005\u0003\u0000\u0000\u068a\u068b"+
		"\u0005\u0003\u0000\u0000\u068b\u068c\u0005\u0004\u0000\u0000\u068c\u068d"+
		"\u0005\n\u0000\u0000\u068d\u068e\u0005\u0003\u0000\u0000\u068e\u068f\u0005"+
		"\u0003\u0000\u0000\u068f\u0690\u0005\u0003\u0000\u0000\u0690\u0691\u0005"+
		"\u0004\u0000\u0000\u0691\u0692\u0005\n\u0000\u0000\u0692\u0693\u0005\u0003"+
		"\u0000\u0000\u0693\u0694\u0005\u0003\u0000\u0000\u0694\u0695\u0005\u0003"+
		"\u0000\u0000\u0695\u0696\u0005\u0004\u0000\u0000\u0696\u0697\u0005\n\u0000"+
		"\u0000\u0697\u0698\u0005\u0003\u0000\u0000\u0698\u0699\u0005\u0003\u0000"+
		"\u0000\u0699\u069a\u0005\u0003\u0000\u0000\u069a\u069b\u0005\u0004\u0000"+
		"\u0000\u069b\u069c\u0005\n\u0000\u0000\u069c\u069d\u0005\u0003\u0000\u0000"+
		"\u069d\u069e\u0005\u0003\u0000\u0000\u069e\u069f\u0005\u0003\u0000\u0000"+
		"\u069f\u06a0\u0005\u0004\u0000\u0000\u06a0\u06a1\u0005\n\u0000\u0000\u06a1"+
		"\u06a2\u0005\u0003\u0000\u0000\u06a2\u06a3\u0005\u0003\u0000\u0000\u06a3"+
		"\u06a4\u0005\u0003\u0000\u0000\u06a4\u06a5\u0005\u0004\u0000\u0000\u06a5"+
		"\u06a6\u0005\n\u0000\u0000\u06a6\u06a7\u0005\u0003\u0000\u0000\u06a7\u06a8"+
		"\u0005\u0003\u0000\u0000\u06a8\u06a9\u0005\u0003\u0000\u0000\u06a9\u06aa"+
		"\u0005\u0004\u0000\u0000\u06aa\u06ab\u0005\n\u0000\u0000\u06ab\u06ac\u0005"+
		"\u0003\u0000\u0000\u06ac\u06ad\u0005\u0003\u0000\u0000\u06ad\u06ae\u0005"+
		"\u0003\u0000\u0000\u06ae\u06af\u0005\u0004\u0000\u0000\u06af\u06b0\u0005"+
		"\n\u0000\u0000\u06b0\u06b1\u0005\u0003\u0000\u0000\u06b1\u06b2\u0005\u0003"+
		"\u0000\u0000\u06b2\u06b3\u0005\u0003\u0000\u0000\u06b3\u06b4\u0005\u0004"+
		"\u0000\u0000\u06b4\u06b5\u0005\n\u0000\u0000\u06b5\u06b6\u0005\u0003\u0000"+
		"\u0000\u06b6\u06b7\u0005\u0003\u0000\u0000\u06b7\u06b8\u0005\u0003\u0000"+
		"\u0000\u06b8\u06b9\u0005\u0004\u0000\u0000\u06b9\u06ba\u0005\n\u0000\u0000"+
		"\u06ba\u06bb\u0005\u0003\u0000\u0000\u06bb\u06bc\u0005\u0003\u0000\u0000"+
		"\u06bc\u06bd\u0005\u0003\u0000\u0000\u06bd\u06be\u0005\u0004\u0000\u0000"+
		"\u06be\u06bf\u0005\n\u0000\u0000\u06bf\u06c0\u0005\u0003\u0000\u0000\u06c0"+
		"\u06c1\u0005\u0003\u0000\u0000\u06c1\u06c2\u0005\u0003\u0000\u0000\u06c2"+
		"\u06c3\u0005\u0004\u0000\u0000\u06c3\u06c4\u0005\n\u0000\u0000\u06c4\u06c5"+
		"\u0005\u0003\u0000\u0000\u06c5\u06c6\u0005\u0003\u0000\u0000\u06c6\u06c7"+
		"\u0005\u0003\u0000\u0000\u06c7\u06c8\u0005\n\u0000\u0000\u06c8\u06c9\u0005"+
		"\u0004\u0000\u0000\u06c9\u06ca\u0005\n\u0000\u0000\u06ca\u06cb\u0005\u0003"+
		"\u0000\u0000\u06cb\u06cc\u0005\u0003\u0000\u0000\u06cc\u06cd\u0005\u0003"+
		"\u0000\u0000\u06cd\u0758\u0005\u0004\u0000\u0000\u06ce\u06cf\u0005\n\u0000"+
		"\u0000\u06cf\u06d0\u0005\u0003\u0000\u0000\u06d0\u06d1\u0005\n\u0000\u0000"+
		"\u06d1\u06d2\u0005\u0004\u0000\u0000\u06d2\u06d3\u0005\n\u0000\u0000\u06d3"+
		"\u06d4\u0005\u0003\u0000\u0000\u06d4\u06d5\u00032\u0019\u0000\u06d5\u06d6"+
		"\u0005\u0004\u0000\u0000\u06d6\u06d7\u0005\n\u0000\u0000\u06d7\u06d8\u0005"+
		"\u0003\u0000\u0000\u06d8\u06d9\u0005\u0004\u0000\u0000\u06d9\u06da\u0005"+
		"\n\u0000\u0000\u06da\u06db\u0005\u0003\u0000\u0000\u06db\u06dd\u0005\u0003"+
		"\u0000\u0000\u06dc\u06de\u00032\u0019\u0000\u06dd\u06dc\u0001\u0000\u0000"+
		"\u0000\u06de\u06df\u0001\u0000\u0000\u0000\u06df\u06dd\u0001\u0000\u0000"+
		"\u0000\u06df\u06e0\u0001\u0000\u0000\u0000\u06e0\u06e1\u0001\u0000\u0000"+
		"\u0000\u06e1\u06e2\u0005\u0004\u0000\u0000\u06e2\u06e3\u0005\n\u0000\u0000"+
		"\u06e3\u06e4\u0005\u0003\u0000\u0000\u06e4\u06e5\u0005\u0003\u0000\u0000"+
		"\u06e5\u06e7\u00032\u0019\u0000\u06e6\u06e8\u00032\u0019\u0000\u06e7\u06e6"+
		"\u0001\u0000\u0000\u0000\u06e7\u06e8\u0001\u0000\u0000\u0000\u06e8\u06ea"+
		"\u0001\u0000\u0000\u0000\u06e9\u06eb\u00032\u0019\u0000\u06ea\u06e9\u0001"+
		"\u0000\u0000\u0000\u06ea\u06eb\u0001\u0000\u0000\u0000\u06eb\u06ed\u0001"+
		"\u0000\u0000\u0000\u06ec\u06ee\u00032\u0019\u0000\u06ed\u06ec\u0001\u0000"+
		"\u0000\u0000\u06ed\u06ee\u0001\u0000\u0000\u0000\u06ee\u06f0\u0001\u0000"+
		"\u0000\u0000\u06ef\u06f1\u00032\u0019\u0000\u06f0\u06ef\u0001\u0000\u0000"+
		"\u0000\u06f0\u06f1\u0001\u0000\u0000\u0000\u06f1\u06f3\u0001\u0000\u0000"+
		"\u0000\u06f2\u06f4\u00032\u0019\u0000\u06f3\u06f2\u0001\u0000\u0000\u0000"+
		"\u06f3\u06f4\u0001\u0000\u0000\u0000\u06f4\u06f6\u0001\u0000\u0000\u0000"+
		"\u06f5\u06f7\u00032\u0019\u0000\u06f6\u06f5\u0001\u0000\u0000\u0000\u06f6"+
		"\u06f7\u0001\u0000\u0000\u0000\u06f7\u06fb\u0001\u0000\u0000\u0000\u06f8"+
		"\u06fa\u00032\u0019\u0000\u06f9\u06f8\u0001\u0000\u0000\u0000\u06fa\u06fd"+
		"\u0001\u0000\u0000\u0000\u06fb\u06f9\u0001\u0000\u0000\u0000\u06fb\u06fc"+
		"\u0001\u0000\u0000\u0000\u06fc\u06fe\u0001\u0000\u0000\u0000\u06fd\u06fb"+
		"\u0001\u0000\u0000\u0000\u06fe\u06ff\u0005\u0004\u0000\u0000\u06ff\u0700"+
		"\u0005\n\u0000\u0000\u0700\u0701\u0005\u0003\u0000\u0000\u0701\u0702\u0005"+
		"\u0004\u0000\u0000\u0702\u0703\u0005\n\u0000\u0000\u0703\u0705\u0005\u0003"+
		"\u0000\u0000\u0704\u0706\u00032\u0019\u0000\u0705\u0704\u0001\u0000\u0000"+
		"\u0000\u0706\u0707\u0001\u0000\u0000\u0000\u0707\u0705\u0001\u0000\u0000"+
		"\u0000\u0707\u0708\u0001\u0000\u0000\u0000\u0708\u0709\u0001\u0000\u0000"+
		"\u0000\u0709\u070a\u0005\u0004\u0000\u0000\u070a\u070b\u0005\n\u0000\u0000"+
		"\u070b\u070c\u0005\u0003\u0000\u0000\u070c\u070d\u0005\u0006\u0000\u0000"+
		"\u070d\u070e\u0005\u0004\u0000\u0000\u070e\u070f\u0005\n\u0000\u0000\u070f"+
		"\u0711\u0005\u0003\u0000\u0000\u0710\u0712\u00032\u0019\u0000\u0711\u0710"+
		"\u0001\u0000\u0000\u0000\u0712\u0713\u0001\u0000\u0000\u0000\u0713\u0711"+
		"\u0001\u0000\u0000\u0000\u0713\u0714\u0001\u0000\u0000\u0000\u0714\u0715"+
		"\u0001\u0000\u0000\u0000\u0715\u0716\u0005\u0004\u0000\u0000\u0716\u0717"+
		"\u0005\n\u0000\u0000\u0717\u0719\u0005\u0003\u0000\u0000\u0718\u071a\u0003"+
		"2\u0019\u0000\u0719\u0718\u0001\u0000\u0000\u0000\u071a\u071b\u0001\u0000"+
		"\u0000\u0000\u071b\u0719\u0001\u0000\u0000\u0000\u071b\u071c\u0001\u0000"+
		"\u0000\u0000\u071c\u071d\u0001\u0000\u0000\u0000\u071d\u071e\u0005\u0004"+
		"\u0000\u0000\u071e\u071f\u0005\n\u0000\u0000\u071f\u0721\u0005\u0003\u0000"+
		"\u0000\u0720\u0722\u00032\u0019\u0000\u0721\u0720\u0001\u0000\u0000\u0000"+
		"\u0722\u0723\u0001\u0000\u0000\u0000\u0723\u0721\u0001\u0000\u0000\u0000"+
		"\u0723\u0724\u0001\u0000\u0000\u0000\u0724\u0725\u0001\u0000\u0000\u0000"+
		"\u0725\u0726\u0005\u0004\u0000\u0000\u0726\u0727\u0005\n\u0000\u0000\u0727"+
		"\u0728\u0005\u0003\u0000\u0000\u0728\u0729\u0005\n\u0000\u0000\u0729\u072a"+
		"\u0005\u0004\u0000\u0000\u072a\u072b\u0005\n\u0000\u0000\u072b\u072c\u0005"+
		"\u0003\u0000\u0000\u072c\u072d\u0005\u0004\u0000\u0000\u072d\u072e\u0005"+
		"\n\u0000\u0000\u072e\u072f\u0005\u0003\u0000\u0000\u072f\u0730\u0005\u0003"+
		"\u0000\u0000\u0730\u0731\u0005\n\u0000\u0000\u0731\u0732\u0005\u0004\u0000"+
		"\u0000\u0732\u0733\u0005\n\u0000\u0000\u0733\u0734\u0005\u0003\u0000\u0000"+
		"\u0734\u0735\u0005\u0003\u0000\u0000\u0735\u0736\u0005\n\u0000\u0000\u0736"+
		"\u0737\u0005\u0004\u0000\u0000\u0737\u0738\u0005\n\u0000\u0000\u0738\u0739"+
		"\u0005\u0003\u0000\u0000\u0739\u073a\u0005\u0003\u0000\u0000\u073a\u073b"+
		"\u0005\u0004\u0000\u0000\u073b\u073c\u0005\n\u0000\u0000\u073c\u073d\u0005"+
		"\u0003\u0000\u0000\u073d\u073e\u0005\b\u0000\u0000\u073e\u073f\u0005\u0004"+
		"\u0000\u0000\u073f\u0740\u0005\n\u0000\u0000\u0740\u0742\u0005\u0003\u0000"+
		"\u0000\u0741\u0743\u00032\u0019\u0000\u0742\u0741\u0001\u0000\u0000\u0000"+
		"\u0743\u0744\u0001\u0000\u0000\u0000\u0744\u0742\u0001\u0000\u0000\u0000"+
		"\u0744\u0745\u0001\u0000\u0000\u0000\u0745\u0746\u0001\u0000\u0000\u0000"+
		"\u0746\u0747\u0005\u0004\u0000\u0000\u0747\u0748\u0005\n\u0000\u0000\u0748"+
		"\u0749\u0005\u0003\u0000\u0000\u0749\u074a\u0005\b\u0000\u0000\u074a\u074b"+
		"\u0005\u0004\u0000\u0000\u074b\u074c\u0005\n\u0000\u0000\u074c\u074d\u0005"+
		"\u0003\u0000\u0000\u074d\u074e\u0005\b\u0000\u0000\u074e\u074f\u0005\u0004"+
		"\u0000\u0000\u074f\u0750\u0005\n\u0000\u0000\u0750\u0751\u0005\u0003\u0000"+
		"\u0000\u0751\u0752\u0005\n\u0000\u0000\u0752\u0753\u0005\u0004\u0000\u0000"+
		"\u0753\u0754\u0005\n\u0000\u0000\u0754\u0755\u0005\u0003\u0000\u0000\u0755"+
		"\u0756\u0005\u0004\u0000\u0000\u0756\u0757\u0006\f\uffff\uffff\u0000\u0757"+
		"\u0759\u0001\u0000\u0000\u0000\u0758\u06ce\u0001\u0000\u0000\u0000\u0759"+
		"\u075a\u0001\u0000\u0000\u0000\u075a\u0758\u0001\u0000\u0000\u0000\u075a"+
		"\u075b\u0001\u0000\u0000\u0000\u075b\u075c\u0001\u0000\u0000\u0000\u075c"+
		"\u075d\u0005\n\u0000\u0000\u075d\u075e\u0005\u0003\u0000\u0000\u075e\u075f"+
		"\u0005\n\u0000\u0000\u075f\u0760\u0005\u0003\u0000\u0000\u0760\u0761\u0005"+
		"\u0006\u0000\u0000\u0761\u0762\u0005\u0004\u0000\u0000\u0762\u0764\u0001"+
		"\u0000\u0000\u0000\u0763\u0666\u0001\u0000\u0000\u0000\u0764\u0765\u0001"+
		"\u0000\u0000\u0000\u0765\u0763\u0001\u0000\u0000\u0000\u0765\u0766\u0001"+
		"\u0000\u0000\u0000\u0766\u0767\u0001\u0000\u0000\u0000\u0767\u0768\u0005"+
		"\u0005\u0000\u0000\u0768\u0769\u0005\u0003\u0000\u0000\u0769\u076a\u0005"+
		"\n\u0000\u0000\u076a\u076b\u0005\u0003\u0000\u0000\u076b\u076c\u0005\n"+
		"\u0000\u0000\u076c\u076d\u0005\n\u0000\u0000\u076d\u076e\u0005\n\u0000"+
		"\u0000\u076e\u076f\u0005\n\u0000\u0000\u076f\u0770\u0005\n\u0000\u0000"+
		"\u0770\u0771\u0005\n\u0000\u0000\u0771\u0772\u0005\u0003\u0000\u0000\u0772"+
		"\u0773\u0005\n\u0000\u0000\u0773\u0774\u0005\u0004\u0000\u0000\u0774\u0019"+
		"\u0001\u0000\u0000\u0000\u0775\u0776\u0005\u0005\u0000\u0000\u0776\u0777"+
		"\u0005\u0003\u0000\u0000\u0777\u0778\u0005\n\u0000\u0000\u0778\u0779\u0005"+
		"\u0003\u0000\u0000\u0779\u077a\u0005\n\u0000\u0000\u077a\u077b\u0005\n"+
		"\u0000\u0000\u077b\u077c\u0005\n\u0000\u0000\u077c\u077d\u0005\n\u0000"+
		"\u0000\u077d\u077e\u0005\n\u0000\u0000\u077e\u077f\u0005\n\u0000\u0000"+
		"\u077f\u0780\u0005\u0003\u0000\u0000\u0780\u0781\u0005\n\u0000\u0000\u0781"+
		"\u093c\u0005\u0004\u0000\u0000\u0782\u0783\u0005\u0005\u0000\u0000\u0783"+
		"\u0784\u0005\u0003\u0000\u0000\u0784\u0785\u0005\u0004\u0000\u0000\u0785"+
		"\u0786\u0005\u0005\u0000\u0000\u0786\u0787\u0005\u0003\u0000\u0000\u0787"+
		"\u0788\u0005\u0004\u0000\u0000\u0788\u0789\u0005\u0005\u0000\u0000\u0789"+
		"\u078a\u0005\u0003\u0000\u0000\u078a\u078b\u0005\u0004\u0000\u0000\u078b"+
		"\u078c\u0005\u0005\u0000\u0000\u078c\u078d\u0005\u0003\u0000\u0000\u078d"+
		"\u078e\u0005\u0004\u0000\u0000\u078e\u078f\u0005\u0005\u0000\u0000\u078f"+
		"\u0790\u0005\u0003\u0000\u0000\u0790\u0791\u0005\u0003\u0000\u0000\u0791"+
		"\u0792\u0005\u0003\u0000\u0000\u0792\u0793\u0005\u0003\u0000\u0000\u0793"+
		"\u0794\u0005\u0003\u0000\u0000\u0794\u0795\u0005\u0004\u0000\u0000\u0795"+
		"\u0796\u0005\u0005\u0000\u0000\u0796\u0797\u0005\u0003\u0000\u0000\u0797"+
		"\u0798\u0005\u0003\u0000\u0000\u0798\u0799\u0005\u0003\u0000\u0000\u0799"+
		"\u079a\u0005\u0004\u0000\u0000\u079a\u079b\u0005\u0005\u0000\u0000\u079b"+
		"\u079c\u0005\u0003\u0000\u0000\u079c\u079d\u0005\u0003\u0000\u0000\u079d"+
		"\u079e\u0005\u0003\u0000\u0000\u079e\u079f\u0005\u0003\u0000\u0000\u079f"+
		"\u07a0\u0005\u0003\u0000\u0000\u07a0\u07a1\u0005\u0004\u0000\u0000\u07a1"+
		"\u07a2\u0005\u0005\u0000\u0000\u07a2\u07a3\u0005\u0003\u0000\u0000\u07a3"+
		"\u07a4\u0005\u0003\u0000\u0000\u07a4\u07a5\u0005\u0003\u0000\u0000\u07a5"+
		"\u07a6\u0005\u0003\u0000\u0000\u07a6\u07a7\u0005\u0003\u0000\u0000\u07a7"+
		"\u07a8\u0005\u0004\u0000\u0000\u07a8\u07a9\u0005\u0005\u0000\u0000\u07a9"+
		"\u07aa\u0005\u0003\u0000\u0000\u07aa\u07ab\u0005\u0003\u0000\u0000\u07ab"+
		"\u07ac\u0005\u0003\u0000\u0000\u07ac\u07ad\u0005\u0003\u0000\u0000\u07ad"+
		"\u07ae\u0005\u0004\u0000\u0000\u07ae\u07af\u0005\u0005\u0000\u0000\u07af"+
		"\u07b0\u0005\u0003\u0000\u0000\u07b0\u07b1\u0005\u0004\u0000\u0000\u07b1"+
		"\u07b2\u0005\u0005\u0000\u0000\u07b2\u07b3\u0005\u0003\u0000\u0000\u07b3"+
		"\u07b4\u0005\u0003\u0000\u0000\u07b4\u07b5\u0005\u0003\u0000\u0000\u07b5"+
		"\u07b6\u0005\u0003\u0000\u0000\u07b6\u07b7\u0005\u0003\u0000\u0000\u07b7"+
		"\u07b8\u0005\u0004\u0000\u0000\u07b8\u07b9\u0005\u0005\u0000\u0000\u07b9"+
		"\u07ba\u0005\u0003\u0000\u0000\u07ba\u07bb\u0005\u0003\u0000\u0000\u07bb"+
		"\u07bc\u0005\u0003\u0000\u0000\u07bc\u07bd\u0005\u0003\u0000\u0000\u07bd"+
		"\u07be\u0005\u0004\u0000\u0000\u07be\u07bf\u0005\u0005\u0000\u0000\u07bf"+
		"\u07c0\u0005\u0003\u0000\u0000\u07c0\u07c1\u0005\u0003\u0000\u0000\u07c1"+
		"\u07c2\u0005\u0003\u0000\u0000\u07c2\u07c3\u0005\u0004\u0000\u0000\u07c3"+
		"\u07c4\u0005\u0005\u0000\u0000\u07c4\u07c5\u0005\u0003\u0000\u0000\u07c5"+
		"\u07c6\u0005\u0003\u0000\u0000\u07c6\u07c7\u0005\u0003\u0000\u0000\u07c7"+
		"\u07c8\u0005\u0004\u0000\u0000\u07c8\u07c9\u0005\u0005\u0000\u0000\u07c9"+
		"\u07ca\u0005\u0003\u0000\u0000\u07ca\u07cb\u0005\u0003\u0000\u0000\u07cb"+
		"\u07cc\u0005\u0003\u0000\u0000\u07cc\u07cd\u0005\u0003\u0000\u0000\u07cd"+
		"\u07ce\u0005\u0003\u0000\u0000\u07ce\u07cf\u0005\u0004\u0000\u0000\u07cf"+
		"\u07d0\u0005\u0005\u0000\u0000\u07d0\u07d1\u0005\u0003\u0000\u0000\u07d1"+
		"\u07d2\u0005\u0003\u0000\u0000\u07d2\u07d3\u0005\u0003\u0000\u0000\u07d3"+
		"\u07d4\u0005\u0003\u0000\u0000\u07d4\u07d5\u0005\u0003\u0000\u0000\u07d5"+
		"\u07d6";
	private static final String _serializedATNSegment1 =
		"\u0005\u0004\u0000\u0000\u07d6\u07d7\u0005\u0005\u0000\u0000\u07d7\u07d8"+
		"\u0005\u0003\u0000\u0000\u07d8\u07d9\u0005\u0003\u0000\u0000\u07d9\u07da"+
		"\u0005\u0004\u0000\u0000\u07da\u07db\u0005\u0005\u0000\u0000\u07db\u07dc"+
		"\u0005\u0003\u0000\u0000\u07dc\u07dd\u0005\u0004\u0000\u0000\u07dd\u07de"+
		"\u0005\u0005\u0000\u0000\u07de\u07df\u0005\u0003\u0000\u0000\u07df\u07e0"+
		"\u0005\u0003\u0000\u0000\u07e0\u07e1\u0005\u0003\u0000\u0000\u07e1\u07e2"+
		"\u0005\u0003\u0000\u0000\u07e2\u07e3\u0005\u0003\u0000\u0000\u07e3\u07e4"+
		"\u0005\u0004\u0000\u0000\u07e4\u07e5\u0005\u0005\u0000\u0000\u07e5\u07e6"+
		"\u0005\u0003\u0000\u0000\u07e6\u07e7\u0005\u0003\u0000\u0000\u07e7\u07e8"+
		"\u0005\u0003\u0000\u0000\u07e8\u07e9\u0005\u0004\u0000\u0000\u07e9\u07ea"+
		"\u0005\u0005\u0000\u0000\u07ea\u07eb\u0005\u0003\u0000\u0000\u07eb\u07ec"+
		"\u0005\u0003\u0000\u0000\u07ec\u07ed\u0005\u0003\u0000\u0000\u07ed\u07ee"+
		"\u0005\u0003\u0000\u0000\u07ee\u07ef\u0005\u0003\u0000\u0000\u07ef\u07f0"+
		"\u0005\u0004\u0000\u0000\u07f0\u07f1\u0005\u0005\u0000\u0000\u07f1\u07f2"+
		"\u0005\u0003\u0000\u0000\u07f2\u07f3\u0005\u0003\u0000\u0000\u07f3\u07f4"+
		"\u0005\u0003\u0000\u0000\u07f4\u07f5\u0005\u0003\u0000\u0000\u07f5\u07f6"+
		"\u0005\u0003\u0000\u0000\u07f6\u07f7\u0005\u0004\u0000\u0000\u07f7\u07f8"+
		"\u0005\u0005\u0000\u0000\u07f8\u07f9\u0005\u0003\u0000\u0000\u07f9\u07fa"+
		"\u0005\u0003\u0000\u0000\u07fa\u07fb\u0005\u0003\u0000\u0000\u07fb\u07fc"+
		"\u0005\u0003\u0000\u0000\u07fc\u07fd\u0005\u0004\u0000\u0000\u07fd\u07fe"+
		"\u0005\u0005\u0000\u0000\u07fe\u07ff\u0005\u0003\u0000\u0000\u07ff\u0800"+
		"\u0005\u0004\u0000\u0000\u0800\u0801\u0005\u0005\u0000\u0000\u0801\u0802"+
		"\u0005\u0003\u0000\u0000\u0802\u0803\u0005\u0003\u0000\u0000\u0803\u0804"+
		"\u0005\u0003\u0000\u0000\u0804\u0805\u0005\u0003\u0000\u0000\u0805\u0806"+
		"\u0005\u0003\u0000\u0000\u0806\u0807\u0005\u0004\u0000\u0000\u0807\u0808"+
		"\u0005\u0005\u0000\u0000\u0808\u0809\u0005\u0003\u0000\u0000\u0809\u080a"+
		"\u0005\u0003\u0000\u0000\u080a\u080b\u0005\u0003\u0000\u0000\u080b\u080c"+
		"\u0005\u0004\u0000\u0000\u080c\u080d\u0005\u0005\u0000\u0000\u080d\u080e"+
		"\u0005\u0003\u0000\u0000\u080e\u080f\u0005\u0003\u0000\u0000\u080f\u0810"+
		"\u0005\u0003\u0000\u0000\u0810\u0811\u0005\u0003\u0000\u0000\u0811\u0812"+
		"\u0005\u0003\u0000\u0000\u0812\u0813\u0005\u0004\u0000\u0000\u0813\u0814"+
		"\u0005\u0005\u0000\u0000\u0814\u0815\u0005\u0003\u0000\u0000\u0815\u0816"+
		"\u0005\u0003\u0000\u0000\u0816\u0817\u0005\u0003\u0000\u0000\u0817\u0818"+
		"\u0005\u0003\u0000\u0000\u0818\u0819\u0005\u0003\u0000\u0000\u0819\u081a"+
		"\u0005\u0004\u0000\u0000\u081a\u081b\u0005\u0005\u0000\u0000\u081b\u081c"+
		"\u0005\u0003\u0000\u0000\u081c\u081d\u0005\u0003\u0000\u0000\u081d\u081e"+
		"\u0005\u0003\u0000\u0000\u081e\u081f\u0005\u0003\u0000\u0000\u081f\u0820"+
		"\u0005\u0004\u0000\u0000\u0820\u0821\u0005\u0005\u0000\u0000\u0821\u0822"+
		"\u0005\u0003\u0000\u0000\u0822\u0823\u0005\u0004\u0000\u0000\u0823\u0824"+
		"\u0005\u0005\u0000\u0000\u0824\u0825\u0005\u0003\u0000\u0000\u0825\u0826"+
		"\u0005\u0003\u0000\u0000\u0826\u0827\u0005\u0003\u0000\u0000\u0827\u0828"+
		"\u0005\u0003\u0000\u0000\u0828\u0829\u0005\u0003\u0000\u0000\u0829\u082a"+
		"\u0005\u0004\u0000\u0000\u082a\u082b\u0005\u0005\u0000\u0000\u082b\u082c"+
		"\u0005\u0003\u0000\u0000\u082c\u082d\u0005\u0003\u0000\u0000\u082d\u082e"+
		"\u0005\u0003\u0000\u0000\u082e\u082f\u0005\u0004\u0000\u0000\u082f\u0830"+
		"\u0005\u0005\u0000\u0000\u0830\u0831\u0005\u0003\u0000\u0000\u0831\u0832"+
		"\u0005\u0003\u0000\u0000\u0832\u0833\u0005\u0003\u0000\u0000\u0833\u0834"+
		"\u0005\u0003\u0000\u0000\u0834\u0835\u0005\u0003\u0000\u0000\u0835\u0836"+
		"\u0005\u0004\u0000\u0000\u0836\u0837\u0005\u0005\u0000\u0000\u0837\u0838"+
		"\u0005\u0003\u0000\u0000\u0838\u0839\u0005\u0003\u0000\u0000\u0839\u083a"+
		"\u0005\u0003\u0000\u0000\u083a\u083b\u0005\u0003\u0000\u0000\u083b\u083c"+
		"\u0005\u0003\u0000\u0000\u083c\u083d\u0005\u0004\u0000\u0000\u083d\u083e"+
		"\u0005\u0005\u0000\u0000\u083e\u083f\u0005\u0003\u0000\u0000\u083f\u0840"+
		"\u0005\u0003\u0000\u0000\u0840\u0841\u0005\u0003\u0000\u0000\u0841\u0842"+
		"\u0005\u0003\u0000\u0000\u0842\u0843\u0005\u0004\u0000\u0000\u0843\u0844"+
		"\u0005\u0005\u0000\u0000\u0844\u0845\u0005\u0003\u0000\u0000\u0845\u0846"+
		"\u0005\u0004\u0000\u0000\u0846\u0847\u0005\u0005\u0000\u0000\u0847\u0848"+
		"\u0005\u0003\u0000\u0000\u0848\u0849\u0005\u0004\u0000\u0000\u0849\u084a"+
		"\u0005\u0005\u0000\u0000\u084a\u084b\u0005\u0003\u0000\u0000\u084b\u084c"+
		"\u0005\u0003\u0000\u0000\u084c\u084d\u0005\u0003\u0000\u0000\u084d\u084e"+
		"\u0005\u0003\u0000\u0000\u084e\u084f\u0005\u0003\u0000\u0000\u084f\u0850"+
		"\u0005\u0004\u0000\u0000\u0850\u0851\u0005\u0005\u0000\u0000\u0851\u0852"+
		"\u0005\u0003\u0000\u0000\u0852\u0853\u0005\u0003\u0000\u0000\u0853\u0854"+
		"\u0005\u0003\u0000\u0000\u0854\u0855\u0005\u0004\u0000\u0000\u0855\u0856"+
		"\u0005\u0005\u0000\u0000\u0856\u0857\u0005\u0003\u0000\u0000\u0857\u0858"+
		"\u0005\u0003\u0000\u0000\u0858\u0859\u0005\u0003\u0000\u0000\u0859\u085a"+
		"\u0005\u0003\u0000\u0000\u085a\u085b\u0005\u0003\u0000\u0000\u085b\u085c"+
		"\u0005\u0004\u0000\u0000\u085c\u085d\u0005\u0005\u0000\u0000\u085d\u085e"+
		"\u0005\u0003\u0000\u0000\u085e\u085f\u0005\u0003\u0000\u0000\u085f\u0860"+
		"\u0005\u0003\u0000\u0000\u0860\u0861\u0005\u0003\u0000\u0000\u0861\u0862"+
		"\u0005\u0003\u0000\u0000\u0862\u0863\u0005\u0004\u0000\u0000\u0863\u0864"+
		"\u0005\u0005\u0000\u0000\u0864\u0865\u0005\u0003\u0000\u0000\u0865\u0866"+
		"\u0005\u0003\u0000\u0000\u0866\u0867\u0005\u0003\u0000\u0000\u0867\u0868"+
		"\u0005\u0003\u0000\u0000\u0868\u0869\u0005\u0004\u0000\u0000\u0869\u086a"+
		"\u0005\u0005\u0000\u0000\u086a\u086b\u0005\u0003\u0000\u0000\u086b\u086c"+
		"\u0005\u0004\u0000\u0000\u086c\u086d\u0005\u0005\u0000\u0000\u086d\u086e"+
		"\u0005\u0003\u0000\u0000\u086e\u086f\u0005\u0003\u0000\u0000\u086f\u0870"+
		"\u0005\u0003\u0000\u0000\u0870\u0871\u0005\u0003\u0000\u0000\u0871\u0872"+
		"\u0005\u0003\u0000\u0000\u0872\u0873\u0005\u0004\u0000\u0000\u0873\u0874"+
		"\u0005\u0005\u0000\u0000\u0874\u0875\u0005\u0003\u0000\u0000\u0875\u0876"+
		"\u0005\u0003\u0000\u0000\u0876\u0877\u0005\u0003\u0000\u0000\u0877\u0878"+
		"\u0005\u0004\u0000\u0000\u0878\u0879\u0005\u0005\u0000\u0000\u0879\u087a"+
		"\u0005\u0003\u0000\u0000\u087a\u087b\u0005\u0003\u0000\u0000\u087b\u087c"+
		"\u0005\u0003\u0000\u0000\u087c\u087d\u0005\u0003\u0000\u0000\u087d\u087e"+
		"\u0005\u0003\u0000\u0000\u087e\u087f\u0005\u0004\u0000\u0000\u087f\u0880"+
		"\u0005\u0005\u0000\u0000\u0880\u0881\u0005\u0003\u0000\u0000\u0881\u0882"+
		"\u0005\u0003\u0000\u0000\u0882\u0883\u0005\u0003\u0000\u0000\u0883\u0884"+
		"\u0005\u0003\u0000\u0000\u0884\u0885\u0005\u0003\u0000\u0000\u0885\u0886"+
		"\u0005\u0004\u0000\u0000\u0886\u0887\u0005\u0005\u0000\u0000\u0887\u0888"+
		"\u0005\u0003\u0000\u0000\u0888\u0889\u0005\u0003\u0000\u0000\u0889\u088a"+
		"\u0005\u0003\u0000\u0000\u088a\u088b\u0005\u0003\u0000\u0000\u088b\u088c"+
		"\u0005\u0004\u0000\u0000\u088c\u088d\u0005\u0005\u0000\u0000\u088d\u088e"+
		"\u0005\u0003\u0000\u0000\u088e\u088f\u0005\u0004\u0000\u0000\u088f\u0890"+
		"\u0005\u0005\u0000\u0000\u0890\u0891\u0005\u0003\u0000\u0000\u0891\u0892"+
		"\u0005\u0003\u0000\u0000\u0892\u0893\u0005\u0003\u0000\u0000\u0893\u0894"+
		"\u0005\u0003\u0000\u0000\u0894\u0895\u0005\u0003\u0000\u0000\u0895\u0896"+
		"\u0005\u0004\u0000\u0000\u0896\u0897\u0005\u0005\u0000\u0000\u0897\u0898"+
		"\u0005\u0003\u0000\u0000\u0898\u0899\u0005\u0003\u0000\u0000\u0899\u089a"+
		"\u0005\u0003\u0000\u0000\u089a\u089b\u0005\u0004\u0000\u0000\u089b\u089c"+
		"\u0005\u0005\u0000\u0000\u089c\u089d\u0005\u0003\u0000\u0000\u089d\u089e"+
		"\u0005\u0003\u0000\u0000\u089e\u089f\u0005\u0003\u0000\u0000\u089f\u08a0"+
		"\u0005\u0003\u0000\u0000\u08a0\u08a1\u0005\u0003\u0000\u0000\u08a1\u08a2"+
		"\u0005\u0004\u0000\u0000\u08a2\u08a3\u0005\u0005\u0000\u0000\u08a3\u08a4"+
		"\u0005\u0003\u0000\u0000\u08a4\u08a5\u0005\u0003\u0000\u0000\u08a5\u08a6"+
		"\u0005\u0003\u0000\u0000\u08a6\u08a7\u0005\u0003\u0000\u0000\u08a7\u08a8"+
		"\u0005\u0003\u0000\u0000\u08a8\u08a9\u0005\u0004\u0000\u0000\u08a9\u08aa"+
		"\u0005\u0005\u0000\u0000\u08aa\u08ab\u0005\u0003\u0000\u0000\u08ab\u08ac"+
		"\u0005\u0003\u0000\u0000\u08ac\u08ad\u0005\u0003\u0000\u0000\u08ad\u08ae"+
		"\u0005\u0003\u0000\u0000\u08ae\u08af\u0005\u0004\u0000\u0000\u08af\u08b0"+
		"\u0005\u0005\u0000\u0000\u08b0\u08b1\u0005\u0003\u0000\u0000\u08b1\u08b2"+
		"\u0005\n\u0000\u0000\u08b2\u08b3\u0005\u0004\u0000\u0000\u08b3\u08b4\u0005"+
		"\u0005\u0000\u0000\u08b4\u08b5\u0005\u0003\u0000\u0000\u08b5\u0931\u0005"+
		"\u0004\u0000\u0000\u08b6\u08b7\u0005\u0005\u0000\u0000\u08b7\u08b8\u0005"+
		"\u0003\u0000\u0000\u08b8\u08b9\u0005\n\u0000\u0000\u08b9\u08ba\u0005\u0004"+
		"\u0000\u0000\u08ba\u08bb\u0005\u0005\u0000\u0000\u08bb\u08bc\u0005\u0003"+
		"\u0000\u0000\u08bc\u08bd\u00032\u0019\u0000\u08bd\u08be\u0005\u0004\u0000"+
		"\u0000\u08be\u08bf\u0005\u0005\u0000\u0000\u08bf\u08c0\u0005\u0003\u0000"+
		"\u0000\u08c0\u08c1\u0005\u0004\u0000\u0000\u08c1\u08c2\u0005\u0005\u0000"+
		"\u0000\u08c2\u08c3\u0005\u0003\u0000\u0000\u08c3\u08c4\u0005\u0003\u0000"+
		"\u0000\u08c4\u08c5\u0005\u0004\u0000\u0000\u08c5\u08c6\u0005\u0005\u0000"+
		"\u0000\u08c6\u08c7\u0005\u0003\u0000\u0000\u08c7\u08c8\u0005\u0003\u0000"+
		"\u0000\u08c8\u08ca\u0005\u0003\u0000\u0000\u08c9\u08cb\u00032\u0019\u0000"+
		"\u08ca\u08c9\u0001\u0000\u0000\u0000\u08cb\u08cc\u0001\u0000\u0000\u0000"+
		"\u08cc\u08ca\u0001\u0000\u0000\u0000\u08cc\u08cd\u0001\u0000\u0000\u0000"+
		"\u08cd\u08ce\u0001\u0000\u0000\u0000\u08ce\u08cf\u0005\u0004\u0000\u0000"+
		"\u08cf\u08d0\u0005\u0005\u0000\u0000\u08d0\u08d1\u0005\u0003\u0000\u0000"+
		"\u08d1\u08d2\u0005\u0003\u0000\u0000\u08d2\u08d3\u0005\u0003\u0000\u0000"+
		"\u08d3\u08d5\u00032\u0019\u0000\u08d4\u08d6\u00032\u0019\u0000\u08d5\u08d4"+
		"\u0001\u0000\u0000\u0000\u08d5\u08d6\u0001\u0000\u0000\u0000\u08d6\u08d8"+
		"\u0001\u0000\u0000\u0000\u08d7\u08d9\u00032\u0019\u0000\u08d8\u08d7\u0001"+
		"\u0000\u0000\u0000\u08d8\u08d9\u0001\u0000\u0000\u0000\u08d9\u08db\u0001"+
		"\u0000\u0000\u0000\u08da\u08dc\u00032\u0019\u0000\u08db\u08da\u0001\u0000"+
		"\u0000\u0000\u08db\u08dc\u0001\u0000\u0000\u0000\u08dc\u08de\u0001\u0000"+
		"\u0000\u0000\u08dd\u08df\u00032\u0019\u0000\u08de\u08dd\u0001\u0000\u0000"+
		"\u0000\u08de\u08df\u0001\u0000\u0000\u0000\u08df\u08e1\u0001\u0000\u0000"+
		"\u0000\u08e0\u08e2\u00032\u0019\u0000\u08e1\u08e0\u0001\u0000\u0000\u0000"+
		"\u08e1\u08e2\u0001\u0000\u0000\u0000\u08e2\u08e4\u0001\u0000\u0000\u0000"+
		"\u08e3\u08e5\u00032\u0019\u0000\u08e4\u08e3\u0001\u0000\u0000\u0000\u08e4"+
		"\u08e5\u0001\u0000\u0000\u0000\u08e5\u08e9\u0001\u0000\u0000\u0000\u08e6"+
		"\u08e8\u00032\u0019\u0000\u08e7\u08e6\u0001\u0000\u0000\u0000\u08e8\u08eb"+
		"\u0001\u0000\u0000\u0000\u08e9\u08e7\u0001\u0000\u0000\u0000\u08e9\u08ea"+
		"\u0001\u0000\u0000\u0000\u08ea\u08ec\u0001\u0000\u0000\u0000\u08eb\u08e9"+
		"\u0001\u0000\u0000\u0000\u08ec\u08ed\u0005\u0004\u0000\u0000\u08ed\u08ee"+
		"\u0005\u0005\u0000\u0000\u08ee\u08ef\u0005\u0003\u0000\u0000\u08ef\u08f0"+
		"\u0005\u0003\u0000\u0000\u08f0\u08f2\u0005\u0003\u0000\u0000\u08f1\u08f3"+
		"\u00032\u0019\u0000\u08f2\u08f1\u0001\u0000\u0000\u0000\u08f3\u08f4\u0001"+
		"\u0000\u0000\u0000\u08f4\u08f2\u0001\u0000\u0000\u0000\u08f4\u08f5\u0001"+
		"\u0000\u0000\u0000\u08f5\u08f6\u0001\u0000\u0000\u0000\u08f6\u08f7\u0005"+
		"\u0004\u0000\u0000\u08f7\u08f8\u0005\u0005\u0000\u0000\u08f8\u08f9\u0005"+
		"\u0003\u0000\u0000\u08f9\u08fa\u0005\u0003\u0000\u0000\u08fa\u08fb\u0005"+
		"\u0003\u0000\u0000\u08fb\u08fc\u0005\u0004\u0000\u0000\u08fc\u08fd\u0005"+
		"\u0005\u0000\u0000\u08fd\u08fe\u0005\u0003\u0000\u0000\u08fe\u08ff\u0005"+
		"\u0003\u0000\u0000\u08ff\u0900\u0005\u0003\u0000\u0000\u0900\u0901\u0005"+
		"\u0004\u0000\u0000\u0901\u0902\u0005\u0005\u0000\u0000\u0902\u0903\u0005"+
		"\u0003\u0000\u0000\u0903\u0904\u0005\u0003\u0000\u0000\u0904\u0905\u0005"+
		"\u0004\u0000\u0000\u0905\u0906\u0005\u0005\u0000\u0000\u0906\u0907\u0005"+
		"\u0003\u0000\u0000\u0907\u0908\u0005\u0006\u0000\u0000\u0908\u0909\u0005"+
		"\u0004\u0000\u0000\u0909\u090a\u0005\u0005\u0000\u0000\u090a\u090b\u0005"+
		"\u0003\u0000\u0000\u090b\u090f\u0005\n\u0000\u0000\u090c\u090e\u00032"+
		"\u0019\u0000\u090d\u090c\u0001\u0000\u0000\u0000\u090e\u0911\u0001\u0000"+
		"\u0000\u0000\u090f\u090d\u0001\u0000\u0000\u0000\u090f\u0910\u0001\u0000"+
		"\u0000\u0000\u0910\u0912\u0001\u0000\u0000\u0000\u0911\u090f\u0001\u0000"+
		"\u0000\u0000\u0912\u0913\u0005\u0004\u0000\u0000\u0913\u0914\u0005\u0005"+
		"\u0000\u0000\u0914\u0915\u0005\u0003\u0000\u0000\u0915\u0916\u0005\n\u0000"+
		"\u0000\u0916\u0917\u0005\u0004\u0000\u0000\u0917\u0918\u0005\u0005\u0000"+
		"\u0000\u0918\u091c\u0005\u0003\u0000\u0000\u0919\u091b\u00032\u0019\u0000"+
		"\u091a\u0919\u0001\u0000\u0000\u0000\u091b\u091e\u0001\u0000\u0000\u0000"+
		"\u091c\u091a\u0001\u0000\u0000\u0000\u091c\u091d\u0001\u0000\u0000\u0000"+
		"\u091d\u091f\u0001\u0000\u0000\u0000\u091e\u091c\u0001\u0000\u0000\u0000"+
		"\u091f\u0920\u0005\u0004\u0000\u0000\u0920\u0921\u0005\u0005\u0000\u0000"+
		"\u0921\u0922\u0005\u0003\u0000\u0000\u0922\u0923\u0005\n\u0000\u0000\u0923"+
		"\u0924\u0005\u0004\u0000\u0000\u0924\u0925\u0005\u0005\u0000\u0000\u0925"+
		"\u0926\u0005\u0003\u0000\u0000\u0926\u0927\u00032\u0019\u0000\u0927\u0928"+
		"\u0005\u0004\u0000\u0000\u0928\u0929\u0005\u0005\u0000\u0000\u0929\u092a"+
		"\u0005\u0003\u0000\u0000\u092a\u092b\u0005\b\u0000\u0000\u092b\u092c\u0005"+
		"\u0004\u0000\u0000\u092c\u092d\u0005\u0005\u0000\u0000\u092d\u092e\u0005"+
		"\u0003\u0000\u0000\u092e\u092f\u0005\u0004\u0000\u0000\u092f\u0930\u0006"+
		"\r\uffff\uffff\u0000\u0930\u0932\u0001\u0000\u0000\u0000\u0931\u08b6\u0001"+
		"\u0000\u0000\u0000\u0932\u0933\u0001\u0000\u0000\u0000\u0933\u0931\u0001"+
		"\u0000\u0000\u0000\u0933\u0934\u0001\u0000\u0000\u0000\u0934\u0935\u0001"+
		"\u0000\u0000\u0000\u0935\u0936\u0005\n\u0000\u0000\u0936\u0937\u0005\u0003"+
		"\u0000\u0000\u0937\u0938\u0005\n\u0000\u0000\u0938\u0939\u0005\u0003\u0000"+
		"\u0000\u0939\u093a\u0005\u0006\u0000\u0000\u093a\u093b\u0005\u0004\u0000"+
		"\u0000\u093b\u093d\u0001\u0000\u0000\u0000\u093c\u0782\u0001\u0000\u0000"+
		"\u0000\u093d\u093e\u0001\u0000\u0000\u0000\u093e\u093c\u0001\u0000\u0000"+
		"\u0000\u093e\u093f\u0001\u0000\u0000\u0000\u093f\u0940\u0001\u0000\u0000"+
		"\u0000\u0940\u0941\u0005\u0005\u0000\u0000\u0941\u0942\u0005\u0003\u0000"+
		"\u0000\u0942\u0943\u0005\n\u0000\u0000\u0943\u0944\u0005\u0003\u0000\u0000"+
		"\u0944\u0945\u0005\n\u0000\u0000\u0945\u0946\u0005\n\u0000\u0000\u0946"+
		"\u0947\u0005\n\u0000\u0000\u0947\u0948\u0005\n\u0000\u0000\u0948\u0949"+
		"\u0005\n\u0000\u0000\u0949\u094a\u0005\n\u0000\u0000\u094a\u094b\u0005"+
		"\u0003\u0000\u0000\u094b\u094c\u0005\n\u0000\u0000\u094c\u094d\u0005\u0004"+
		"\u0000\u0000\u094d\u001b\u0001\u0000\u0000\u0000\u094e\u094f\u0005\u0005"+
		"\u0000\u0000\u094f\u0950\u0005\u0003\u0000\u0000\u0950\u0951\u0005\n\u0000"+
		"\u0000\u0951\u0952\u0005\u0003\u0000\u0000\u0952\u0953\u0005\n\u0000\u0000"+
		"\u0953\u0954\u0005\n\u0000\u0000\u0954\u0955\u0005\n\u0000\u0000\u0955"+
		"\u0956\u0005\n\u0000\u0000\u0956\u0957\u0005\u0003\u0000\u0000\u0957\u0958"+
		"\u0005\n\u0000\u0000\u0958\u0a4f\u0005\u0004\u0000\u0000\u0959\u095a\u0005"+
		"\n\u0000\u0000\u095a\u095b\u0005\u0003\u0000\u0000\u095b\u095c\u0005\u0006"+
		"\u0000\u0000\u095c\u095d\u0005\u0003\u0000\u0000\u095d\u095e\u0005\u0004"+
		"\u0000\u0000\u095e\u095f\u0005\n\u0000\u0000\u095f\u0960\u0005\u0003\u0000"+
		"\u0000\u0960\u0961\u0005\u0006\u0000\u0000\u0961\u0962\u0005\u0003\u0000"+
		"\u0000\u0962\u0963\u0005\u0004\u0000\u0000\u0963\u0964\u0005\n\u0000\u0000"+
		"\u0964\u0965\u0005\u0003\u0000\u0000\u0965\u0966\u0005\u0006\u0000\u0000"+
		"\u0966\u0967\u0005\u0003\u0000\u0000\u0967\u0968\u0005\u0004\u0000\u0000"+
		"\u0968\u0969\u0005\n\u0000\u0000\u0969\u096a\u0005\u0003\u0000\u0000\u096a"+
		"\u096b\u0005\u0006\u0000\u0000\u096b\u096c\u0005\u0003\u0000\u0000\u096c"+
		"\u096d\u0005\u0004\u0000\u0000\u096d\u096e\u0005\n\u0000\u0000\u096e\u096f"+
		"\u0005\u0003\u0000\u0000\u096f\u0970\u0005\u0006\u0000\u0000\u0970\u0971"+
		"\u0005\u0003\u0000\u0000\u0971\u0972\u0005\u0004\u0000\u0000\u0972\u0973"+
		"\u0005\n\u0000\u0000\u0973\u0974\u0005\u0003\u0000\u0000\u0974\u0975\u0005"+
		"\u0006\u0000\u0000\u0975\u0976\u0005\u0003\u0000\u0000\u0976\u0977\u0005"+
		"\u0004\u0000\u0000\u0977\u0978\u0005\n\u0000\u0000\u0978\u0979\u0005\u0003"+
		"\u0000\u0000\u0979\u097a\u0005\u0006\u0000\u0000\u097a\u097b\u0005\u0003"+
		"\u0000\u0000\u097b\u097c\u0005\u0004\u0000\u0000\u097c\u097d\u0005\n\u0000"+
		"\u0000\u097d\u097e\u0005\u0003\u0000\u0000\u097e\u097f\u0005\u0006\u0000"+
		"\u0000\u097f\u0980\u0005\u0003\u0000\u0000\u0980\u0981\u0005\n\u0000\u0000"+
		"\u0981\u0982\u0005\u0004\u0000\u0000\u0982\u0983\u0005\n\u0000\u0000\u0983"+
		"\u0984\u0005\u0003\u0000\u0000\u0984\u0985\u0005\u0006\u0000\u0000\u0985"+
		"\u0986\u0005\u0003\u0000\u0000\u0986\u0a44\u0005\u0004\u0000\u0000\u0987"+
		"\u0988\u0005\n\u0000\u0000\u0988\u0989\u0005\u0003\u0000\u0000\u0989\u098a"+
		"\u0005\u0006\u0000\u0000\u098a\u098b\u0005\u0003\u0000\u0000\u098b\u098c"+
		"\u0005\b\u0000\u0000\u098c\u098d\u0005\u0004\u0000\u0000\u098d\u098e\u0005"+
		"\n\u0000\u0000\u098e\u098f\u0005\u0003\u0000\u0000\u098f\u0990\u0005\u0006"+
		"\u0000\u0000\u0990\u0991\u0005\u0003\u0000\u0000\u0991\u0993\u00032\u0019"+
		"\u0000\u0992\u0994\u00032\u0019\u0000\u0993\u0992\u0001\u0000\u0000\u0000"+
		"\u0993\u0994\u0001\u0000\u0000\u0000\u0994\u0996\u0001\u0000\u0000\u0000"+
		"\u0995\u0997\u00032\u0019\u0000\u0996\u0995\u0001\u0000\u0000\u0000\u0996"+
		"\u0997\u0001\u0000\u0000\u0000\u0997\u0999\u0001\u0000\u0000\u0000\u0998"+
		"\u099a\u00032\u0019\u0000\u0999\u0998\u0001\u0000\u0000\u0000\u0999\u099a"+
		"\u0001\u0000\u0000\u0000\u099a\u099c\u0001\u0000\u0000\u0000\u099b\u099d"+
		"\u00032\u0019\u0000\u099c\u099b\u0001\u0000\u0000\u0000\u099c\u099d\u0001"+
		"\u0000\u0000\u0000\u099d\u099f\u0001\u0000\u0000\u0000\u099e\u09a0\u0003"+
		"2\u0019\u0000\u099f\u099e\u0001\u0000\u0000\u0000\u099f\u09a0\u0001\u0000"+
		"\u0000\u0000\u09a0\u09a2\u0001\u0000\u0000\u0000\u09a1\u09a3\u00032\u0019"+
		"\u0000\u09a2\u09a1\u0001\u0000\u0000\u0000\u09a2\u09a3\u0001\u0000\u0000"+
		"\u0000\u09a3\u09a7\u0001\u0000\u0000\u0000\u09a4\u09a6\u00032\u0019\u0000"+
		"\u09a5\u09a4\u0001\u0000\u0000\u0000\u09a6\u09a9\u0001\u0000\u0000\u0000"+
		"\u09a7\u09a5\u0001\u0000\u0000\u0000\u09a7\u09a8\u0001\u0000\u0000\u0000"+
		"\u09a8\u09aa\u0001\u0000\u0000\u0000\u09a9\u09a7\u0001\u0000\u0000\u0000"+
		"\u09aa\u09ab\u0005\u0004\u0000\u0000\u09ab\u09ac\u0005\n\u0000\u0000\u09ac"+
		"\u09ad\u0005\u0003\u0000\u0000\u09ad\u09ae\u0005\u0006\u0000\u0000\u09ae"+
		"\u09af\u0005\u0003\u0000\u0000\u09af\u09b0\u0005\b\u0000\u0000\u09b0\u09b1"+
		"\u0005\u0004\u0000\u0000\u09b1\u09b2\u0005\n\u0000\u0000\u09b2\u09b3\u0005"+
		"\u0003\u0000\u0000\u09b3\u09b4\u0005\u0006\u0000\u0000\u09b4\u09b5\u0005"+
		"\u0003\u0000\u0000\u09b5\u09b6\u0005\b\u0000\u0000\u09b6\u09b7\u0005\u0004"+
		"\u0000\u0000\u09b7\u09b8\u0005\n\u0000\u0000\u09b8\u09b9\u0005\u0003\u0000"+
		"\u0000\u09b9\u09ba\u0005\u0006\u0000\u0000\u09ba\u09bb\u0005\u0003\u0000"+
		"\u0000\u09bb\u09bc\u0005\b\u0000\u0000\u09bc\u09bd\u0005\u0004\u0000\u0000"+
		"\u09bd\u09be\u0005\n\u0000\u0000\u09be\u09bf\u0005\u0003\u0000\u0000\u09bf"+
		"\u09c0\u0005\u0006\u0000\u0000\u09c0\u09c1\u0005\u0003\u0000\u0000\u09c1"+
		"\u09c2\u0005\b\u0000\u0000\u09c2\u09c3\u0005\u0004\u0000\u0000\u09c3\u09c4"+
		"\u0005\n\u0000\u0000\u09c4\u09c5\u0005\u0003\u0000\u0000\u09c5\u09c6\u0005"+
		"\u0006\u0000\u0000\u09c6\u09c7\u0005\u0003\u0000\u0000\u09c7\u09c8\u0005"+
		"\b\u0000\u0000\u09c8\u09c9\u0005\u0004\u0000\u0000\u09c9\u09ca\u0005\n"+
		"\u0000\u0000\u09ca\u09cb\u0005\u0003\u0000\u0000\u09cb\u09cc\u0005\u0006"+
		"\u0000\u0000\u09cc\u09cd\u0005\u0003\u0000\u0000\u09cd\u09ce\u0005\b\u0000"+
		"\u0000\u09ce\u09cf\u0005\u0004\u0000\u0000\u09cf\u09d0\u0005\n\u0000\u0000"+
		"\u09d0\u09d1\u0005\u0003\u0000\u0000\u09d1\u09d2\u0005\u0006\u0000\u0000"+
		"\u09d2\u09d3\u0005\u0003\u0000\u0000\u09d3\u09d4\u0005\b\u0000\u0000\u09d4"+
		"\u09d5\u0005\u0004\u0000\u0000\u09d5\u09d6\u0005\n\u0000\u0000\u09d6\u09d7"+
		"\u0005\u0003\u0000\u0000\u09d7\u09d8\u0005\u0006\u0000\u0000\u09d8\u09d9"+
		"\u0005\u0003\u0000\u0000\u09d9\u09da\u0005\b\u0000\u0000\u09da\u09db\u0005"+
		"\u0004\u0000\u0000\u09db\u09dc\u0005\n\u0000\u0000\u09dc\u09dd\u0005\u0003"+
		"\u0000\u0000\u09dd\u09de\u0005\u0006\u0000\u0000\u09de\u09df\u0005\u0003"+
		"\u0000\u0000\u09df\u09e0\u0005\b\u0000\u0000\u09e0\u09e1\u0005\u0004\u0000"+
		"\u0000\u09e1\u09e2\u0005\n\u0000\u0000\u09e2\u09e3\u0005\u0003\u0000\u0000"+
		"\u09e3\u09e4\u0005\u0006\u0000\u0000\u09e4\u09e5\u0005\u0003\u0000\u0000"+
		"\u09e5\u09e6\u0005\b\u0000\u0000\u09e6\u09e7\u0005\u0004\u0000\u0000\u09e7"+
		"\u09e8\u0005\n\u0000\u0000\u09e8\u09e9\u0005\u0003\u0000\u0000\u09e9\u09ea"+
		"\u0005\u0006\u0000\u0000\u09ea\u09eb\u0005\u0003\u0000\u0000\u09eb\u09ec"+
		"\u0005\b\u0000\u0000\u09ec\u09ed\u0005\u0004\u0000\u0000\u09ed\u09ee\u0005"+
		"\n\u0000\u0000\u09ee\u09ef\u0005\u0003\u0000\u0000\u09ef\u09f0\u0005\u0006"+
		"\u0000\u0000\u09f0\u09f1\u0005\u0003\u0000\u0000\u09f1\u09f2\u0005\b\u0000"+
		"\u0000\u09f2\u09f3\u0005\u0004\u0000\u0000\u09f3\u09f4\u0005\n\u0000\u0000"+
		"\u09f4\u09f5\u0005\u0003\u0000\u0000\u09f5\u09f6\u0005\u0006\u0000\u0000"+
		"\u09f6\u09f8\u0005\u0003\u0000\u0000\u09f7\u09f9\u00032\u0019\u0000\u09f8"+
		"\u09f7\u0001\u0000\u0000\u0000\u09f9\u09fa\u0001\u0000\u0000\u0000\u09fa"+
		"\u09f8\u0001\u0000\u0000\u0000\u09fa\u09fb\u0001\u0000\u0000\u0000\u09fb"+
		"\u09fc\u0001\u0000\u0000\u0000\u09fc\u09fd\u0005\u0004\u0000\u0000\u09fd"+
		"\u09fe\u0005\n\u0000\u0000\u09fe\u09ff\u0005\u0003\u0000\u0000\u09ff\u0a00"+
		"\u0005\u0006\u0000\u0000\u0a00\u0a01\u0005\u0003\u0000\u0000\u0a01\u0a02"+
		"\u00032\u0019\u0000\u0a02\u0a03\u0005\u0004\u0000\u0000\u0a03\u0a04\u0005"+
		"\n\u0000\u0000\u0a04\u0a05\u0005\u0003\u0000\u0000\u0a05\u0a06\u0005\u0006"+
		"\u0000\u0000\u0a06\u0a07\u0005\u0003\u0000\u0000\u0a07\u0a08\u00032\u0019"+
		"\u0000\u0a08\u0a09\u0005\u0004\u0000\u0000\u0a09\u0a0a\u0005\n\u0000\u0000"+
		"\u0a0a\u0a0b\u0005\u0003\u0000\u0000\u0a0b\u0a0c\u0005\u0006\u0000\u0000"+
		"\u0a0c\u0a0d\u0005\u0003\u0000\u0000\u0a0d\u0a0e\u00032\u0019\u0000\u0a0e"+
		"\u0a0f\u0005\u0004\u0000\u0000\u0a0f\u0a10\u0005\n\u0000\u0000\u0a10\u0a11"+
		"\u0005\u0003\u0000\u0000\u0a11\u0a12\u0005\u0006\u0000\u0000\u0a12\u0a13"+
		"\u0005\u0003\u0000\u0000\u0a13\u0a14\u0005\u0004\u0000\u0000\u0a14\u0a15"+
		"\u0006\u000e\uffff\uffff\u0000\u0a15\u0a45\u0001\u0000\u0000\u0000\u0a16"+
		"\u0a17\u0005\n\u0000\u0000\u0a17\u0a18\u0005\u0003\u0000\u0000\u0a18\u0a19"+
		"\u0005\u0006\u0000\u0000\u0a19\u0a1a\u0005\u0003\u0000\u0000\u0a1a\u0a1b"+
		"\u0005\b\u0000\u0000\u0a1b\u0a1d\u00032\u0019\u0000\u0a1c\u0a1e\u0003"+
		"2\u0019\u0000\u0a1d\u0a1c\u0001\u0000\u0000\u0000\u0a1d\u0a1e\u0001\u0000"+
		"\u0000\u0000\u0a1e\u0a20\u0001\u0000\u0000\u0000\u0a1f\u0a21\u00032\u0019"+
		"\u0000\u0a20\u0a1f\u0001\u0000\u0000\u0000\u0a20\u0a21\u0001\u0000\u0000"+
		"\u0000\u0a21\u0a23\u0001\u0000\u0000\u0000\u0a22\u0a24\u00032\u0019\u0000"+
		"\u0a23\u0a22\u0001\u0000\u0000\u0000\u0a23\u0a24\u0001\u0000\u0000\u0000"+
		"\u0a24\u0a26\u0001\u0000\u0000\u0000\u0a25\u0a27\u00032\u0019\u0000\u0a26"+
		"\u0a25\u0001\u0000\u0000\u0000\u0a26\u0a27\u0001\u0000\u0000\u0000\u0a27"+
		"\u0a29\u0001\u0000\u0000\u0000\u0a28\u0a2a\u00032\u0019\u0000\u0a29\u0a28"+
		"\u0001\u0000\u0000\u0000\u0a29\u0a2a\u0001\u0000\u0000\u0000\u0a2a\u0a2c"+
		"\u0001\u0000\u0000\u0000\u0a2b\u0a2d\u00032\u0019\u0000\u0a2c\u0a2b\u0001"+
		"\u0000\u0000\u0000\u0a2c\u0a2d\u0001\u0000\u0000\u0000\u0a2d\u0a31\u0001"+
		"\u0000\u0000\u0000\u0a2e\u0a30\u00032\u0019\u0000\u0a2f\u0a2e\u0001\u0000"+
		"\u0000\u0000\u0a30\u0a33\u0001\u0000\u0000\u0000\u0a31\u0a2f\u0001\u0000"+
		"\u0000\u0000\u0a31\u0a32\u0001\u0000\u0000\u0000\u0a32\u0a34\u0001\u0000"+
		"\u0000\u0000\u0a33\u0a31\u0001\u0000\u0000\u0000\u0a34\u0a35\u0005\b\u0000"+
		"\u0000\u0a35\u0a36\u0005\u0004\u0000\u0000\u0a36\u0a37\u0005\n\u0000\u0000"+
		"\u0a37\u0a38\u0005\u0003\u0000\u0000\u0a38\u0a39\u0005\u0006\u0000\u0000"+
		"\u0a39\u0a3a\u0005\u0003\u0000\u0000\u0a3a\u0a3b\u0005\b\u0000\u0000\u0a3b"+
		"\u0a3c\u0005\b\u0000\u0000\u0a3c\u0a3d\u0005\b\u0000\u0000\u0a3d\u0a3e"+
		"\u0005\b\u0000\u0000\u0a3e\u0a3f\u0005\b\u0000\u0000\u0a3f\u0a40\u0005"+
		"\b\u0000\u0000\u0a40\u0a41\u0005\b\u0000\u0000\u0a41\u0a42\u0005\u0004"+
		"\u0000\u0000\u0a42\u0a43\u0006\u000e\uffff\uffff\u0000\u0a43\u0a45\u0001"+
		"\u0000\u0000\u0000\u0a44\u0987\u0001\u0000\u0000\u0000\u0a44\u0a16\u0001"+
		"\u0000\u0000\u0000\u0a45\u0a46\u0001\u0000\u0000\u0000\u0a46\u0a44\u0001"+
		"\u0000\u0000\u0000\u0a46\u0a47\u0001\u0000\u0000\u0000\u0a47\u0a48\u0001"+
		"\u0000\u0000\u0000\u0a48\u0a49\u0005\n\u0000\u0000\u0a49\u0a4a\u0005\u0003"+
		"\u0000\u0000\u0a4a\u0a4b\u0005\n\u0000\u0000\u0a4b\u0a4c\u0005\u0003\u0000"+
		"\u0000\u0a4c\u0a4d\u0005\u0006\u0000\u0000\u0a4d\u0a4e\u0005\u0004\u0000"+
		"\u0000\u0a4e\u0a50\u0001\u0000\u0000\u0000\u0a4f\u0959\u0001\u0000\u0000"+
		"\u0000\u0a50\u0a51\u0001\u0000\u0000\u0000\u0a51\u0a4f\u0001\u0000\u0000"+
		"\u0000\u0a51\u0a52\u0001\u0000\u0000\u0000\u0a52\u0a53\u0001\u0000\u0000"+
		"\u0000\u0a53\u0a54\u0005\u0005\u0000\u0000\u0a54\u0a55\u0005\u0003\u0000"+
		"\u0000\u0a55\u0a56\u0005\n\u0000\u0000\u0a56\u0a57\u0005\u0003\u0000\u0000"+
		"\u0a57\u0a58\u0005\n\u0000\u0000\u0a58\u0a59\u0005\n\u0000\u0000\u0a59"+
		"\u0a5a\u0005\n\u0000\u0000\u0a5a\u0a5b\u0005\n\u0000\u0000\u0a5b\u0a5c"+
		"\u0005\u0003\u0000\u0000\u0a5c\u0a5d\u0005\n\u0000\u0000\u0a5d\u0a5e\u0005"+
		"\u0004\u0000\u0000\u0a5e\u001d\u0001\u0000\u0000\u0000\u0a5f\u0a60\u0005"+
		"\u0005\u0000\u0000\u0a60\u0a61\u0005\u0003\u0000\u0000\u0a61\u0a62\u0005"+
		"\n\u0000\u0000\u0a62\u0a63\u0005\u0003\u0000\u0000\u0a63\u0a64\u0005\n"+
		"\u0000\u0000\u0a64\u0a65\u0005\n\u0000\u0000\u0a65\u0a66\u0005\n\u0000"+
		"\u0000\u0a66\u0a67\u0005\n\u0000\u0000\u0a67\u0a68\u0005\n\u0000\u0000"+
		"\u0a68\u0a69\u0005\n\u0000\u0000\u0a69\u0a6a\u0005\u0003\u0000\u0000\u0a6a"+
		"\u0a6b\u0005\n\u0000\u0000\u0a6b\u0c4e\u0005\u0004\u0000\u0000\u0a6c\u0a6d"+
		"\u0005\n\u0000\u0000\u0a6d\u0a6e\u0005\u0003\u0000\u0000\u0a6e\u0a6f\u0005"+
		"\u0006\u0000\u0000\u0a6f\u0a70\u0005\u0003\u0000\u0000\u0a70\u0a71\u0005"+
		"\u0004\u0000\u0000\u0a71\u0a72\u0005\n\u0000\u0000\u0a72\u0a73\u0005\u0003"+
		"\u0000\u0000\u0a73\u0a74\u0005\u0006\u0000\u0000\u0a74\u0a75\u0005\u0003"+
		"\u0000\u0000\u0a75\u0a76\u0005\u0004\u0000\u0000\u0a76\u0a77\u0005\n\u0000"+
		"\u0000\u0a77\u0a78\u0005\u0003\u0000\u0000\u0a78\u0a79\u0005\u0006\u0000"+
		"\u0000\u0a79\u0a7a\u0005\u0003\u0000\u0000\u0a7a\u0a7b\u0005\u0004\u0000"+
		"\u0000\u0a7b\u0a7c\u0005\n\u0000\u0000\u0a7c\u0a7d\u0005\u0003\u0000\u0000"+
		"\u0a7d\u0a7e\u0005\u0006\u0000\u0000\u0a7e\u0a7f\u0005\u0003\u0000\u0000"+
		"\u0a7f\u0a80\u0005\u0003\u0000\u0000\u0a80\u0a81\u0005\u0003\u0000\u0000"+
		"\u0a81\u0a82\u0005\u0003\u0000\u0000\u0a82\u0a83\u0005\u0003\u0000\u0000"+
		"\u0a83\u0a84\u0005\u0004\u0000\u0000\u0a84\u0a85\u0005\n\u0000\u0000\u0a85"+
		"\u0a86\u0005\u0003\u0000\u0000\u0a86\u0a87\u0005\u0006\u0000\u0000\u0a87"+
		"\u0a88\u0005\u0003\u0000\u0000\u0a88\u0a89\u0005\u0003\u0000\u0000\u0a89"+
		"\u0a8a\u0005\u0003\u0000\u0000\u0a8a\u0a8b\u0005\u0004\u0000\u0000\u0a8b"+
		"\u0a8c\u0005\n\u0000\u0000\u0a8c\u0a8d\u0005\u0003\u0000\u0000\u0a8d\u0a8e"+
		"\u0005\u0006\u0000\u0000\u0a8e\u0a8f\u0005\u0003\u0000\u0000\u0a8f\u0a90"+
		"\u0005\u0003\u0000\u0000\u0a90\u0a91\u0005\u0003\u0000\u0000\u0a91\u0a92"+
		"\u0005\u0003\u0000\u0000\u0a92\u0a93\u0005\u0003\u0000\u0000\u0a93\u0a94"+
		"\u0005\u0004\u0000\u0000\u0a94\u0a95\u0005\n\u0000\u0000\u0a95\u0a96\u0005"+
		"\u0003\u0000\u0000\u0a96\u0a97\u0005\u0006\u0000\u0000\u0a97\u0a98\u0005"+
		"\u0003\u0000\u0000\u0a98\u0a99\u0005\u0003\u0000\u0000\u0a99\u0a9a\u0005"+
		"\u0003\u0000\u0000\u0a9a\u0a9b\u0005\u0003\u0000\u0000\u0a9b\u0a9c\u0005"+
		"\u0003\u0000\u0000\u0a9c\u0a9d\u0005\u0004\u0000\u0000\u0a9d\u0a9e\u0005"+
		"\n\u0000\u0000\u0a9e\u0a9f\u0005\u0003\u0000\u0000\u0a9f\u0aa0\u0005\u0006"+
		"\u0000\u0000\u0aa0\u0aa1\u0005\u0003\u0000\u0000\u0aa1\u0aa2\u0005\u0003"+
		"\u0000\u0000\u0aa2\u0aa3\u0005\u0003\u0000\u0000\u0aa3\u0aa4\u0005\u0003"+
		"\u0000\u0000\u0aa4\u0aa5\u0005\u0004\u0000\u0000\u0aa5\u0aa6\u0005\n\u0000"+
		"\u0000\u0aa6\u0aa7\u0005\u0003\u0000\u0000\u0aa7\u0aa8\u0005\u0006\u0000"+
		"\u0000\u0aa8\u0aa9\u0005\u0003\u0000\u0000\u0aa9\u0aaa\u0005\u0004\u0000"+
		"\u0000\u0aaa\u0aab\u0005\n\u0000\u0000\u0aab\u0aac\u0005\u0003\u0000\u0000"+
		"\u0aac\u0aad\u0005\u0006\u0000\u0000\u0aad\u0aae\u0005\u0003\u0000\u0000"+
		"\u0aae\u0aaf\u0005\u0004\u0000\u0000\u0aaf\u0ab0\u0005\n\u0000\u0000\u0ab0"+
		"\u0ab1\u0005\u0003\u0000\u0000\u0ab1\u0ab2\u0005\u0006\u0000\u0000\u0ab2"+
		"\u0ab3\u0005\u0003\u0000\u0000\u0ab3\u0ab4\u0005\u0003\u0000\u0000\u0ab4"+
		"\u0ab5\u0005\u0003\u0000\u0000\u0ab5\u0ab6\u0005\u0003\u0000\u0000\u0ab6"+
		"\u0ab7\u0005\u0003\u0000\u0000\u0ab7\u0ab8\u0005\u0004\u0000\u0000\u0ab8"+
		"\u0ab9\u0005\n\u0000\u0000\u0ab9\u0aba\u0005\u0003\u0000\u0000\u0aba\u0abb"+
		"\u0005\u0006\u0000\u0000\u0abb\u0abc\u0005\u0003\u0000\u0000\u0abc\u0abd"+
		"\u0005\u0003\u0000\u0000\u0abd\u0abe\u0005\u0003\u0000\u0000\u0abe\u0abf"+
		"\u0005\u0004\u0000\u0000\u0abf\u0ac0\u0005\n\u0000\u0000\u0ac0\u0ac1\u0005"+
		"\u0003\u0000\u0000\u0ac1\u0ac2\u0005\u0006\u0000\u0000\u0ac2\u0ac3\u0005"+
		"\u0003\u0000\u0000\u0ac3\u0ac4\u0005\u0003\u0000\u0000\u0ac4\u0ac5\u0005"+
		"\u0003\u0000\u0000\u0ac5\u0ac6\u0005\u0003\u0000\u0000\u0ac6\u0ac7\u0005"+
		"\u0003\u0000\u0000\u0ac7\u0ac8\u0005\u0004\u0000\u0000\u0ac8\u0ac9\u0005"+
		"\n\u0000\u0000\u0ac9\u0aca\u0005\u0003\u0000\u0000\u0aca\u0acb\u0005\u0006"+
		"\u0000\u0000\u0acb\u0acc\u0005\u0003\u0000\u0000\u0acc\u0acd\u0005\u0003"+
		"\u0000\u0000\u0acd\u0ace\u0005\u0003\u0000\u0000\u0ace\u0acf\u0005\u0003"+
		"\u0000\u0000\u0acf\u0ad0\u0005\u0003\u0000\u0000\u0ad0\u0ad1\u0005\u0004"+
		"\u0000\u0000\u0ad1\u0ad2\u0005\n\u0000\u0000\u0ad2\u0ad3\u0005\u0003\u0000"+
		"\u0000\u0ad3\u0ad4\u0005\u0006\u0000\u0000\u0ad4\u0ad5\u0005\u0003\u0000"+
		"\u0000\u0ad5\u0ad6\u0005\u0003\u0000\u0000\u0ad6\u0ad7\u0005\u0003\u0000"+
		"\u0000\u0ad7\u0ad8\u0005\u0003\u0000\u0000\u0ad8\u0ad9\u0005\u0004\u0000"+
		"\u0000\u0ad9\u0ada\u0005\n\u0000\u0000\u0ada\u0adb\u0005\u0003\u0000\u0000"+
		"\u0adb\u0adc\u0005\u0006\u0000\u0000\u0adc\u0add\u0005\u0003\u0000\u0000"+
		"\u0add\u0ade\u0005\u0004\u0000\u0000\u0ade\u0adf\u0005\n\u0000\u0000\u0adf"+
		"\u0ae0\u0005\u0003\u0000\u0000\u0ae0\u0ae1\u0005\u0006\u0000\u0000\u0ae1"+
		"\u0ae2\u0005\u0003\u0000\u0000\u0ae2\u0ae3\u0005\u0004\u0000\u0000\u0ae3"+
		"\u0ae4\u0005\n\u0000\u0000\u0ae4\u0ae5\u0005\u0003\u0000\u0000\u0ae5\u0ae6"+
		"\u0005\u0006\u0000\u0000\u0ae6\u0ae7\u0005\u0003\u0000\u0000\u0ae7\u0ae8"+
		"\u0005\u0004\u0000\u0000\u0ae8\u0ae9\u0005\n\u0000\u0000\u0ae9\u0aea\u0005"+
		"\u0003\u0000\u0000\u0aea\u0aeb\u0005\u0006\u0000\u0000\u0aeb\u0aec\u0005"+
		"\u0003\u0000\u0000\u0aec\u0aed\u0005\u0004\u0000\u0000\u0aed\u0aee\u0005"+
		"\n\u0000\u0000\u0aee\u0aef\u0005\u0003\u0000\u0000\u0aef\u0af0\u0005\u0006"+
		"\u0000\u0000\u0af0\u0af1\u0005\u0003\u0000\u0000\u0af1\u0af2\u0005\u0003"+
		"\u0000\u0000\u0af2\u0af3\u0005\u0003\u0000\u0000\u0af3\u0af4\u0005\u0003"+
		"\u0000\u0000\u0af4\u0af5\u0005\u0003\u0000\u0000\u0af5\u0af6\u0005\u0004"+
		"\u0000\u0000\u0af6\u0af7\u0005\n\u0000\u0000\u0af7\u0af8\u0005\u0003\u0000"+
		"\u0000\u0af8\u0af9\u0005\u0006\u0000\u0000\u0af9\u0afa\u0005\u0003\u0000"+
		"\u0000\u0afa\u0afb\u0005\u0003\u0000\u0000\u0afb\u0afc\u0005\u0003\u0000"+
		"\u0000\u0afc\u0afd\u0005\u0003\u0000\u0000\u0afd\u0afe\u0005\u0004\u0000"+
		"\u0000\u0afe\u0aff\u0005\n\u0000\u0000\u0aff\u0b00\u0005\u0003\u0000\u0000"+
		"\u0b00\u0b01\u0005\u0006\u0000\u0000\u0b01\u0b02\u0005\u0003\u0000\u0000"+
		"\u0b02\u0b03\u0005\u0003\u0000\u0000\u0b03\u0b04\u0005\u0003\u0000\u0000"+
		"\u0b04\u0b05\u0005\u0003\u0000\u0000\u0b05\u0b06\u0005\u0003\u0000\u0000"+
		"\u0b06\u0b07\u0005\u0004\u0000\u0000\u0b07\u0b08\u0005\n\u0000\u0000\u0b08"+
		"\u0b09\u0005\u0003\u0000\u0000\u0b09\u0b0a\u0005\u0006\u0000\u0000\u0b0a"+
		"\u0b0b\u0005\u0003\u0000\u0000\u0b0b\u0b0c\u0005\u0003\u0000\u0000\u0b0c"+
		"\u0b0d\u0005\u0003\u0000\u0000\u0b0d\u0b0e\u0005\u0003\u0000\u0000\u0b0e"+
		"\u0b0f\u0005\u0003\u0000\u0000\u0b0f\u0b10\u0005\u0004\u0000\u0000\u0b10"+
		"\u0b11\u0005\n\u0000\u0000\u0b11\u0b12\u0005\u0003\u0000\u0000\u0b12\u0b13"+
		"\u0005\u0006\u0000\u0000\u0b13\u0b14\u0005\u0003\u0000\u0000\u0b14\u0b15"+
		"\u0005\u0003\u0000\u0000\u0b15\u0b16\u0005\u0003\u0000\u0000\u0b16\u0b17"+
		"\u0005\u0003\u0000\u0000\u0b17\u0b18\u0005\u0004\u0000\u0000\u0b18\u0b19"+
		"\u0005\n\u0000\u0000\u0b19\u0b1a\u0005\u0003\u0000\u0000\u0b1a\u0b1b\u0005"+
		"\u0006\u0000\u0000\u0b1b\u0b1c\u0005\u0003\u0000\u0000\u0b1c\u0b1d\u0005"+
		"\u0004\u0000\u0000\u0b1d\u0b1e\u0005\n\u0000\u0000\u0b1e\u0b1f\u0005\u0003"+
		"\u0000\u0000\u0b1f\u0b20\u0005\u0006\u0000\u0000\u0b20\u0b21\u0005\u0003"+
		"\u0000\u0000\u0b21\u0b22\u0005\u0004\u0000\u0000\u0b22\u0b23\u0005\n\u0000"+
		"\u0000\u0b23\u0b24\u0005\u0003\u0000\u0000\u0b24\u0b25\u0005\u0006\u0000"+
		"\u0000\u0b25\u0b26\u0005\u0003\u0000\u0000\u0b26\u0b27\u0005\u0004\u0000"+
		"\u0000\u0b27\u0b28\u0005\n\u0000\u0000\u0b28\u0b29\u0005\u0003\u0000\u0000"+
		"\u0b29\u0b2a\u0005\u0006\u0000\u0000\u0b2a\u0b2b\u0005\u0003\u0000\u0000"+
		"\u0b2b\u0b2c\u0005\u0004\u0000\u0000\u0b2c\u0b2d\u0005\n\u0000\u0000\u0b2d"+
		"\u0b2e\u0005\u0003\u0000\u0000\u0b2e\u0b2f\u0005\u0006\u0000\u0000\u0b2f"+
		"\u0b30\u0005\u0003\u0000\u0000\u0b30\u0b31\u0005\u0003\u0000\u0000\u0b31"+
		"\u0b32\u0005\u0003\u0000\u0000\u0b32\u0b33\u0005\u0003\u0000\u0000\u0b33"+
		"\u0b34\u0005\u0003\u0000\u0000\u0b34\u0b35\u0005\u0004\u0000\u0000\u0b35"+
		"\u0b36\u0005\n\u0000\u0000\u0b36\u0b37\u0005\u0003\u0000\u0000\u0b37\u0b38"+
		"\u0005\u0006\u0000\u0000\u0b38\u0b39\u0005\u0003\u0000\u0000\u0b39\u0b3a"+
		"\u0005\u0003\u0000\u0000\u0b3a\u0b3b\u0005\u0003\u0000\u0000\u0b3b\u0b3c"+
		"\u0005\u0004\u0000\u0000\u0b3c\u0b3d\u0005\n\u0000\u0000\u0b3d\u0b3e\u0005"+
		"\u0003\u0000\u0000\u0b3e\u0b3f\u0005\u0006\u0000\u0000\u0b3f\u0b40\u0005"+
		"\u0003\u0000\u0000\u0b40\u0b41\u0005\u0003\u0000\u0000\u0b41\u0b42\u0005"+
		"\u0003\u0000\u0000\u0b42\u0b43\u0005\u0003\u0000\u0000\u0b43\u0b44\u0005"+
		"\u0003\u0000\u0000\u0b44\u0b45\u0005\u0004\u0000\u0000\u0b45\u0b46\u0005"+
		"\n\u0000\u0000\u0b46\u0b47\u0005\u0003\u0000\u0000\u0b47\u0b48\u0005\u0006"+
		"\u0000\u0000\u0b48\u0b49\u0005\u0003\u0000\u0000\u0b49\u0b4a\u0005\u0003"+
		"\u0000\u0000\u0b4a\u0b4b\u0005\u0003\u0000\u0000\u0b4b\u0b4c\u0005\u0003"+
		"\u0000\u0000\u0b4c\u0b4d\u0005\u0003\u0000\u0000\u0b4d\u0b4e\u0005\u0004"+
		"\u0000\u0000\u0b4e\u0b4f\u0005\n\u0000\u0000\u0b4f\u0b50\u0005\u0003\u0000"+
		"\u0000\u0b50\u0b51\u0005\u0006\u0000\u0000\u0b51\u0b52\u0005\u0003\u0000"+
		"\u0000\u0b52\u0b53\u0005\u0003\u0000\u0000\u0b53\u0b54\u0005\u0003\u0000"+
		"\u0000\u0b54\u0b55\u0005\u0003\u0000\u0000\u0b55\u0b56\u0005\u0004\u0000"+
		"\u0000\u0b56\u0b57\u0005\n\u0000\u0000\u0b57\u0b58\u0005\u0003\u0000\u0000"+
		"\u0b58\u0b59\u0005\u0006\u0000\u0000\u0b59\u0b5a\u0005\u0003\u0000\u0000"+
		"\u0b5a\u0b5b\u0005\u0004\u0000\u0000\u0b5b\u0b5c\u0005\n\u0000\u0000\u0b5c"+
		"\u0b5d\u0005\u0003\u0000\u0000\u0b5d\u0b5e\u0005\u0006\u0000\u0000\u0b5e"+
		"\u0b5f\u0005\u0003\u0000\u0000\u0b5f\u0b60\u0005\u0004\u0000\u0000\u0b60"+
		"\u0b61\u0005\n\u0000\u0000\u0b61\u0b62\u0005\u0003\u0000\u0000\u0b62\u0b63"+
		"\u0005\u0006\u0000\u0000\u0b63\u0b64\u0005\u0003\u0000\u0000\u0b64\u0b65"+
		"\u0005\u0004\u0000\u0000\u0b65\u0b66\u0005\n\u0000\u0000\u0b66\u0b67\u0005"+
		"\u0003\u0000\u0000\u0b67\u0b68\u0005\u0006\u0000\u0000\u0b68\u0b69\u0005"+
		"\u0003\u0000\u0000\u0b69\u0b6a\u0005\u0003\u0000\u0000\u0b6a\u0b6b\u0005"+
		"\u0003\u0000\u0000\u0b6b\u0b6c\u0005\u0003\u0000\u0000\u0b6c\u0b6d\u0005"+
		"\u0003\u0000\u0000\u0b6d\u0b6e\u0005\u0004\u0000\u0000\u0b6e\u0b6f\u0005"+
		"\n\u0000\u0000\u0b6f\u0b70\u0005\u0003\u0000\u0000\u0b70\u0b71\u0005\u0006"+
		"\u0000\u0000\u0b71\u0b72\u0005\u0003\u0000\u0000\u0b72\u0b73\u0005\u0003"+
		"\u0000\u0000\u0b73\u0b74\u0005\u0003\u0000\u0000\u0b74\u0b75\u0005\u0004"+
		"\u0000\u0000\u0b75\u0b76\u0005\n\u0000\u0000\u0b76\u0b77\u0005\u0003\u0000"+
		"\u0000\u0b77\u0b78\u0005\u0006\u0000\u0000\u0b78\u0b79\u0005\u0003\u0000"+
		"\u0000\u0b79\u0b7a\u0005\u0003\u0000\u0000\u0b7a\u0b7b\u0005\u0003\u0000"+
		"\u0000\u0b7b\u0b7c\u0005\u0003\u0000\u0000\u0b7c\u0b7d\u0005\u0003\u0000"+
		"\u0000\u0b7d\u0b7e\u0005\u0004\u0000\u0000\u0b7e\u0b7f\u0005\n\u0000\u0000"+
		"\u0b7f\u0b80\u0005\u0003\u0000\u0000\u0b80\u0b81\u0005\u0006\u0000\u0000"+
		"\u0b81\u0b82\u0005\u0003\u0000\u0000\u0b82\u0b83\u0005\u0003\u0000\u0000"+
		"\u0b83\u0b84\u0005\u0003\u0000\u0000\u0b84\u0b85\u0005\u0003\u0000\u0000"+
		"\u0b85\u0b86\u0005\u0003\u0000\u0000\u0b86\u0b87\u0005\u0004\u0000\u0000"+
		"\u0b87\u0b88\u0005\n\u0000\u0000\u0b88\u0b89\u0005\u0003\u0000\u0000\u0b89"+
		"\u0b8a\u0005\u0006\u0000\u0000\u0b8a\u0b8b\u0005\u0003\u0000\u0000\u0b8b"+
		"\u0b8c\u0005\u0003\u0000\u0000\u0b8c\u0b8d\u0005\u0003\u0000\u0000\u0b8d"+
		"\u0b8e\u0005\u0003\u0000\u0000\u0b8e\u0b8f\u0005\u0004\u0000\u0000\u0b8f"+
		"\u0b90\u0005\n\u0000\u0000\u0b90\u0b91\u0005\u0003\u0000\u0000\u0b91\u0b92"+
		"\u0005\u0006\u0000\u0000\u0b92\u0b93\u0005\u0003\u0000\u0000\u0b93\u0b94"+
		"\u0005\n\u0000\u0000\u0b94\u0b95\u0005\u0004\u0000\u0000\u0b95\u0b96\u0005"+
		"\n\u0000\u0000\u0b96\u0b97\u0005\u0003\u0000\u0000\u0b97\u0b98\u0005\u0006"+
		"\u0000\u0000\u0b98\u0b99\u0005\u0003\u0000\u0000\u0b99\u0c43\u0005\u0004"+
		"\u0000\u0000\u0b9a\u0b9b\u0005\n\u0000\u0000\u0b9b\u0b9c\u0005\u0003\u0000"+
		"\u0000\u0b9c\u0b9d\u0005\u0006\u0000\u0000\u0b9d\u0b9e\u0005\u0003\u0000"+
		"\u0000\u0b9e\u0b9f\u00032\u0019\u0000\u0b9f\u0ba0\u0005\u0004\u0000\u0000"+
		"\u0ba0\u0ba1\u0005\n\u0000\u0000\u0ba1\u0ba2\u0005\u0003\u0000\u0000\u0ba2"+
		"\u0ba3\u0005\u0006\u0000\u0000\u0ba3\u0ba4\u0005\u0003\u0000\u0000\u0ba4"+
		"\u0ba6\u00032\u0019\u0000\u0ba5\u0ba7\u00032\u0019\u0000\u0ba6\u0ba5\u0001"+
		"\u0000\u0000\u0000\u0ba6\u0ba7\u0001\u0000\u0000\u0000\u0ba7\u0ba9\u0001"+
		"\u0000\u0000\u0000\u0ba8\u0baa\u00032\u0019\u0000\u0ba9\u0ba8\u0001\u0000"+
		"\u0000\u0000\u0ba9\u0baa\u0001\u0000\u0000\u0000\u0baa\u0bac\u0001\u0000"+
		"\u0000\u0000\u0bab\u0bad\u00032\u0019\u0000\u0bac\u0bab\u0001\u0000\u0000"+
		"\u0000\u0bac\u0bad\u0001\u0000\u0000\u0000\u0bad\u0baf\u0001\u0000\u0000"+
		"\u0000\u0bae\u0bb0\u00032\u0019\u0000\u0baf\u0bae\u0001\u0000\u0000\u0000"+
		"\u0baf\u0bb0\u0001\u0000\u0000\u0000\u0bb0\u0bb2\u0001\u0000\u0000\u0000"+
		"\u0bb1\u0bb3\u00032\u0019\u0000\u0bb2\u0bb1\u0001\u0000\u0000\u0000\u0bb2"+
		"\u0bb3\u0001\u0000\u0000\u0000\u0bb3\u0bb5\u0001\u0000\u0000\u0000\u0bb4"+
		"\u0bb6\u00032\u0019\u0000\u0bb5\u0bb4\u0001\u0000\u0000\u0000\u0bb5\u0bb6"+
		"\u0001\u0000\u0000\u0000\u0bb6\u0bba\u0001\u0000\u0000\u0000\u0bb7\u0bb9"+
		"\u00032\u0019\u0000\u0bb8\u0bb7\u0001\u0000\u0000\u0000\u0bb9\u0bbc\u0001"+
		"\u0000\u0000\u0000\u0bba\u0bb8\u0001\u0000\u0000\u0000\u0bba\u0bbb\u0001"+
		"\u0000\u0000\u0000\u0bbb\u0bbd\u0001\u0000\u0000\u0000\u0bbc\u0bba\u0001"+
		"\u0000\u0000\u0000\u0bbd\u0bbe\u0005\u0004\u0000\u0000\u0bbe\u0bbf\u0005"+
		"\n\u0000\u0000\u0bbf\u0bc0\u0005\u0003\u0000\u0000\u0bc0\u0bc1\u0005\u0006"+
		"\u0000\u0000\u0bc1\u0bc2\u0005\u0003\u0000\u0000\u0bc2\u0bc6\u00032\u0019"+
		"\u0000\u0bc3\u0bc5\u00032\u0019\u0000\u0bc4\u0bc3\u0001\u0000\u0000\u0000"+
		"\u0bc5\u0bc8\u0001\u0000\u0000\u0000\u0bc6\u0bc4\u0001\u0000\u0000\u0000"+
		"\u0bc6\u0bc7\u0001\u0000\u0000\u0000\u0bc7\u0bc9\u0001\u0000\u0000\u0000"+
		"\u0bc8\u0bc6\u0001\u0000\u0000\u0000\u0bc9\u0bca\u0005\u0004\u0000\u0000"+
		"\u0bca\u0bcb\u0005\n\u0000\u0000\u0bcb\u0bcc\u0005\u0003\u0000\u0000\u0bcc"+
		"\u0bcd\u0005\u0006\u0000\u0000\u0bcd\u0bcf\u0005\u0003\u0000\u0000\u0bce"+
		"\u0bd0\u0005\n\u0000\u0000\u0bcf\u0bce\u0001\u0000\u0000\u0000\u0bcf\u0bd0"+
		"\u0001\u0000\u0000\u0000\u0bd0\u0bd1\u0001\u0000\u0000\u0000\u0bd1\u0bd2"+
		"\u0005\u0004\u0000\u0000\u0bd2\u0bd3\u0005\n\u0000\u0000\u0bd3\u0bd4\u0005"+
		"\u0003\u0000\u0000\u0bd4\u0bd5\u0005\u0006\u0000\u0000\u0bd5\u0bd6\u0005"+
		"\u0003\u0000\u0000\u0bd6\u0bd7\u0005\b\u0000\u0000\u0bd7\u0bd8\u0005\u0004"+
		"\u0000\u0000\u0bd8\u0bd9\u0005\n\u0000\u0000\u0bd9\u0bda\u0005\u0003\u0000"+
		"\u0000\u0bda\u0bdb\u0005\u0006\u0000\u0000\u0bdb\u0bdc\u0005\u0003\u0000"+
		"\u0000\u0bdc\u0bdd\u0005\b\u0000\u0000\u0bdd\u0bde\u0005\u0004\u0000\u0000"+
		"\u0bde\u0bdf\u0005\n\u0000\u0000\u0bdf\u0be0\u0005\u0003\u0000\u0000\u0be0"+
		"\u0be1\u0005\u0006\u0000\u0000\u0be1\u0be2\u0005\u0003\u0000\u0000\u0be2"+
		"\u0be3\u0005\b\u0000\u0000\u0be3\u0be4\u0005\u0004\u0000\u0000\u0be4\u0be5"+
		"\u0005\n\u0000\u0000\u0be5\u0be6\u0005\u0003\u0000\u0000\u0be6\u0be7\u0005"+
		"\u0006\u0000\u0000\u0be7\u0be8\u0005\u0003\u0000\u0000\u0be8\u0be9\u0005"+
		"\b\u0000\u0000\u0be9\u0bea\u0005\u0004\u0000\u0000\u0bea\u0beb\u0005\n"+
		"\u0000\u0000\u0beb\u0bec\u0005\u0003\u0000\u0000\u0bec\u0bed\u0005\u0006"+
		"\u0000\u0000\u0bed\u0bee\u0005\u0003\u0000\u0000\u0bee\u0bef\u0005\b\u0000"+
		"\u0000\u0bef\u0bf0\u0005\u0004\u0000\u0000\u0bf0\u0bf1\u0005\n\u0000\u0000"+
		"\u0bf1\u0bf2\u0005\u0003\u0000\u0000\u0bf2\u0bf3\u0005\u0006\u0000\u0000"+
		"\u0bf3\u0bf4\u0005\u0003\u0000\u0000\u0bf4\u0bf5\u0005\b\u0000\u0000\u0bf5"+
		"\u0bf6\u0005\u0004\u0000\u0000\u0bf6\u0bf7\u0005\n\u0000\u0000\u0bf7\u0bf8"+
		"\u0005\u0003\u0000\u0000\u0bf8\u0bf9\u0005\u0006\u0000\u0000\u0bf9\u0bfa"+
		"\u0005\u0003\u0000\u0000\u0bfa\u0bfb\u0005\b\u0000\u0000\u0bfb\u0bfc\u0005"+
		"\u0004\u0000\u0000\u0bfc\u0bfd\u0005\n\u0000\u0000\u0bfd\u0bfe\u0005\u0003"+
		"\u0000\u0000\u0bfe\u0bff\u0005\u0006\u0000\u0000\u0bff\u0c00\u0005\u0003"+
		"\u0000\u0000\u0c00\u0c01\u0005\b\u0000\u0000\u0c01\u0c02\u0005\u0004\u0000"+
		"\u0000\u0c02\u0c03\u0005\n\u0000\u0000\u0c03\u0c04\u0005\u0003\u0000\u0000"+
		"\u0c04\u0c05\u0005\u0006\u0000\u0000\u0c05\u0c06\u0005\u0003\u0000\u0000"+
		"\u0c06\u0c07\u0005\b\u0000\u0000\u0c07\u0c08\u0005\u0004\u0000\u0000\u0c08"+
		"\u0c09\u0005\n\u0000\u0000\u0c09\u0c0a\u0005\u0003\u0000\u0000\u0c0a\u0c0b"+
		"\u0005\u0006\u0000\u0000\u0c0b\u0c0c\u0005\u0003\u0000\u0000\u0c0c\u0c0d"+
		"\u0005\b\u0000\u0000\u0c0d\u0c0e\u0005\u0004\u0000\u0000\u0c0e\u0c0f\u0005"+
		"\n\u0000\u0000\u0c0f\u0c10\u0005\u0003\u0000\u0000\u0c10\u0c11\u0005\u0006"+
		"\u0000\u0000\u0c11\u0c12\u0005\u0003\u0000\u0000\u0c12\u0c13\u0005\u0004"+
		"\u0000\u0000\u0c13\u0c14\u0006\u000f\uffff\uffff\u0000\u0c14\u0c44\u0001"+
		"\u0000\u0000\u0000\u0c15\u0c16\u0005\n\u0000\u0000\u0c16\u0c17\u0005\u0003"+
		"\u0000\u0000\u0c17\u0c18\u0005\u0006\u0000\u0000\u0c18\u0c19\u0005\u0003"+
		"\u0000\u0000\u0c19\u0c1a\u0005\b\u0000\u0000\u0c1a\u0c1c\u00032\u0019"+
		"\u0000\u0c1b\u0c1d\u00032\u0019\u0000\u0c1c\u0c1b\u0001\u0000\u0000\u0000"+
		"\u0c1c\u0c1d\u0001\u0000\u0000\u0000\u0c1d\u0c1f\u0001\u0000\u0000\u0000"+
		"\u0c1e\u0c20\u00032\u0019\u0000\u0c1f\u0c1e\u0001\u0000\u0000\u0000\u0c1f"+
		"\u0c20\u0001\u0000\u0000\u0000\u0c20\u0c22\u0001\u0000\u0000\u0000\u0c21"+
		"\u0c23\u00032\u0019\u0000\u0c22\u0c21\u0001\u0000\u0000\u0000\u0c22\u0c23"+
		"\u0001\u0000\u0000\u0000\u0c23\u0c25\u0001\u0000\u0000\u0000\u0c24\u0c26"+
		"\u00032\u0019\u0000\u0c25\u0c24\u0001\u0000\u0000\u0000\u0c25\u0c26\u0001"+
		"\u0000\u0000\u0000\u0c26\u0c28\u0001\u0000\u0000\u0000\u0c27\u0c29\u0003"+
		"2\u0019\u0000\u0c28\u0c27\u0001\u0000\u0000\u0000\u0c28\u0c29\u0001\u0000"+
		"\u0000\u0000\u0c29\u0c2b\u0001\u0000\u0000\u0000\u0c2a\u0c2c\u00032\u0019"+
		"\u0000\u0c2b\u0c2a\u0001\u0000\u0000\u0000\u0c2b\u0c2c\u0001\u0000\u0000"+
		"\u0000\u0c2c\u0c30\u0001\u0000\u0000\u0000\u0c2d\u0c2f\u00032\u0019\u0000"+
		"\u0c2e\u0c2d\u0001\u0000\u0000\u0000\u0c2f\u0c32\u0001\u0000\u0000\u0000"+
		"\u0c30\u0c2e\u0001\u0000\u0000\u0000\u0c30\u0c31\u0001\u0000\u0000\u0000"+
		"\u0c31\u0c33\u0001\u0000\u0000\u0000\u0c32\u0c30\u0001\u0000\u0000\u0000"+
		"\u0c33\u0c34\u0005\b\u0000\u0000\u0c34\u0c35\u0005\u0004\u0000\u0000\u0c35"+
		"\u0c36\u0005\n\u0000\u0000\u0c36\u0c37\u0005\u0003\u0000\u0000\u0c37\u0c38"+
		"\u0005\u0006\u0000\u0000\u0c38\u0c39\u0005\u0003\u0000\u0000\u0c39\u0c3a"+
		"\u0005\b\u0000\u0000\u0c3a\u0c3b\u0005\b\u0000\u0000\u0c3b\u0c3c\u0005"+
		"\b\u0000\u0000\u0c3c\u0c3d\u0005\b\u0000\u0000\u0c3d\u0c3e\u0005\b\u0000"+
		"\u0000\u0c3e\u0c3f\u0005\b\u0000\u0000\u0c3f\u0c40\u0005\b\u0000\u0000"+
		"\u0c40\u0c41\u0005\u0004\u0000\u0000\u0c41\u0c42\u0006\u000f\uffff\uffff"+
		"\u0000\u0c42\u0c44\u0001\u0000\u0000\u0000\u0c43\u0b9a\u0001\u0000\u0000"+
		"\u0000\u0c43\u0c15\u0001\u0000\u0000\u0000\u0c44\u0c45\u0001\u0000\u0000"+
		"\u0000\u0c45\u0c43\u0001\u0000\u0000\u0000\u0c45\u0c46\u0001\u0000\u0000"+
		"\u0000\u0c46\u0c47\u0001\u0000\u0000\u0000\u0c47\u0c48\u0005\n\u0000\u0000"+
		"\u0c48\u0c49\u0005\u0003\u0000\u0000\u0c49\u0c4a\u0005\n\u0000\u0000\u0c4a"+
		"\u0c4b\u0005\u0003\u0000\u0000\u0c4b\u0c4c\u0005\u0006\u0000\u0000\u0c4c"+
		"\u0c4d\u0005\u0004\u0000\u0000\u0c4d\u0c4f\u0001\u0000\u0000\u0000\u0c4e"+
		"\u0a6c\u0001\u0000\u0000\u0000\u0c4f\u0c50\u0001\u0000\u0000\u0000\u0c50"+
		"\u0c4e\u0001\u0000\u0000\u0000\u0c50\u0c51\u0001\u0000\u0000\u0000\u0c51"+
		"\u0c52\u0001\u0000\u0000\u0000\u0c52\u0c53\u0005\u0005\u0000\u0000\u0c53"+
		"\u0c54\u0005\u0003\u0000\u0000\u0c54\u0c55\u0005\n\u0000\u0000\u0c55\u0c56"+
		"\u0005\u0003\u0000\u0000\u0c56\u0c57\u0005\n\u0000\u0000\u0c57\u0c58\u0005"+
		"\n\u0000\u0000\u0c58\u0c59\u0005\n\u0000\u0000\u0c59\u0c5a\u0005\n\u0000"+
		"\u0000\u0c5a\u0c5b\u0005\n\u0000\u0000\u0c5b\u0c5c\u0005\n\u0000\u0000"+
		"\u0c5c\u0c5d\u0005\u0003\u0000\u0000\u0c5d\u0c5e\u0005\n\u0000\u0000\u0c5e"+
		"\u0c5f\u0005\u0004\u0000\u0000\u0c5f\u001f\u0001\u0000\u0000\u0000\u0c60"+
		"\u0c61\u0005\u0005\u0000\u0000\u0c61\u0c62\u0005\u0003\u0000\u0000\u0c62"+
		"\u0c63\u0005\n\u0000\u0000\u0c63\u0c64\u0005\u0003\u0000\u0000\u0c64\u0c65"+
		"\u0005\n\u0000\u0000\u0c65\u0c66\u0005\u0003\u0000\u0000\u0c66\u0c67\u0005"+
		"\n\u0000\u0000\u0c67\u0d21\u0005\u0004\u0000\u0000\u0c68\u0c69\u0005\b"+
		"\u0000\u0000\u0c69\u0c6a\u0005\u0003\u0000\u0000\u0c6a\u0c6b\u0005\n\u0000"+
		"\u0000\u0c6b\u0c6c\u0005\n\u0000\u0000\u0c6c\u0c6d\u0005\u0003\u0000\u0000"+
		"\u0c6d\u0d22\u0005\u0004\u0000\u0000\u0c6e\u0c6f\u0005\n\u0000\u0000\u0c6f"+
		"\u0c70\u0005\u0003\u0000\u0000\u0c70\u0c71\u0005\b\u0000\u0000\u0c71\u0c72"+
		"\u0005\u0003\u0000\u0000\u0c72\u0c73\u0005\n\u0000\u0000\u0c73\u0c74\u0005"+
		"\u0003\u0000\u0000\u0c74\u0c75\u0005\n\u0000\u0000\u0c75\u0c76\u0005\u0003"+
		"\u0000\u0000\u0c76\u0c77\u0005\n\u0000\u0000\u0c77\u0c78\u0005\u0003\u0000"+
		"\u0000\u0c78\u0c79\u0005\n\u0000\u0000\u0c79\u0c7a\u0005\u0003\u0000\u0000"+
		"\u0c7a\u0c7b\u0005\n\u0000\u0000\u0c7b\u0c7c\u0005\u0003\u0000\u0000\u0c7c"+
		"\u0c7d\u0005\n\u0000\u0000\u0c7d\u0c7e\u0005\u0003\u0000\u0000\u0c7e\u0c7f"+
		"\u0005\n\u0000\u0000\u0c7f\u0c80\u0005\u0003\u0000\u0000\u0c80\u0c81\u0005"+
		"\n\u0000\u0000\u0c81\u0c82\u0005\u0003\u0000\u0000\u0c82\u0c83\u0005\n"+
		"\u0000\u0000\u0c83\u0c84\u0005\u0003\u0000\u0000\u0c84\u0c85\u0005\n\u0000"+
		"\u0000\u0c85\u0c86\u0005\u0003\u0000\u0000\u0c86\u0c87\u0005\n\u0000\u0000"+
		"\u0c87\u0c88\u0005\u0003\u0000\u0000\u0c88\u0ca5\u0005\u0004\u0000\u0000"+
		"\u0c89\u0c8a\u0005\n\u0000\u0000\u0c8a\u0c8b\u0005\u0003\u0000\u0000\u0c8b"+
		"\u0c8c\u0005\b\u0000\u0000\u0c8c\u0c8d\u0005\u0003\u0000\u0000\u0c8d\u0c8e"+
		"\u0005\u0006\u0000\u0000\u0c8e\u0c8f\u0005\u0003\u0000\u0000\u0c8f\u0c90"+
		"\u0005\b\u0000\u0000\u0c90\u0c91\u0005\u0003\u0000\u0000\u0c91\u0c92\u0005"+
		"\b\u0000\u0000\u0c92\u0c93\u0005\u0003\u0000\u0000\u0c93\u0c94\u0005\b"+
		"\u0000\u0000\u0c94\u0c95\u0005\u0003\u0000\u0000\u0c95\u0c96\u0005\b\u0000"+
		"\u0000\u0c96\u0c97\u0005\u0003\u0000\u0000\u0c97\u0c98\u0005\b\u0000\u0000"+
		"\u0c98\u0c99\u0005\u0003\u0000\u0000\u0c99\u0c9a\u0005\b\u0000\u0000\u0c9a"+
		"\u0c9b\u0005\u0003\u0000\u0000\u0c9b\u0c9c\u0005\b\u0000\u0000\u0c9c\u0c9d"+
		"\u0005\u0003\u0000\u0000\u0c9d\u0c9e\u0005\b\u0000\u0000\u0c9e\u0c9f\u0005"+
		"\u0003\u0000\u0000\u0c9f\u0ca0\u0005\b\u0000\u0000\u0ca0\u0ca1\u0005\u0003"+
		"\u0000\u0000\u0ca1\u0ca2\u0005\b\u0000\u0000\u0ca2\u0ca3\u0005\u0003\u0000"+
		"\u0000\u0ca3\u0ca4\u0005\u0004\u0000\u0000\u0ca4\u0ca6\u0006\u0010\uffff"+
		"\uffff\u0000\u0ca5\u0c89\u0001\u0000\u0000\u0000\u0ca6\u0ca7\u0001\u0000"+
		"\u0000\u0000\u0ca7\u0ca5\u0001\u0000\u0000\u0000\u0ca7\u0ca8\u0001\u0000"+
		"\u0000\u0000\u0ca8\u0d16\u0001\u0000\u0000\u0000\u0ca9\u0caa\u0005\n\u0000"+
		"\u0000\u0caa\u0cab\u0005\u0003\u0000\u0000\u0cab\u0cac\u0005\b\u0000\u0000"+
		"\u0cac\u0cad\u0005\u0003\u0000\u0000\u0cad\u0cae\u0005\n\u0000\u0000\u0cae"+
		"\u0caf\u0005\u0003\u0000\u0000\u0caf\u0cb0\u0005\n\u0000\u0000\u0cb0\u0cb1"+
		"\u0005\u0003\u0000\u0000\u0cb1\u0cb2\u0005\n\u0000\u0000\u0cb2\u0cb3\u0005"+
		"\u0003\u0000\u0000\u0cb3\u0cb4\u0005\n\u0000\u0000\u0cb4\u0cb5\u0005\u0003"+
		"\u0000\u0000\u0cb5\u0cb6\u0005\n\u0000\u0000\u0cb6\u0cb7\u0005\u0003\u0000"+
		"\u0000\u0cb7\u0cb8\u0005\n\u0000\u0000\u0cb8\u0cb9\u0005\u0003\u0000\u0000"+
		"\u0cb9\u0cba\u0005\n\u0000\u0000\u0cba\u0cbb\u0005\u0003\u0000\u0000\u0cbb"+
		"\u0cbc\u0005\n\u0000\u0000\u0cbc\u0cbd\u0005\u0003\u0000\u0000\u0cbd\u0cbe"+
		"\u0005\n\u0000\u0000\u0cbe\u0cbf\u0005\u0003\u0000\u0000\u0cbf\u0cc0\u0005"+
		"\n\u0000\u0000\u0cc0\u0cc1\u0005\u0003\u0000\u0000\u0cc1\u0cc2\u0005\n"+
		"\u0000\u0000\u0cc2\u0cc3\u0005\u0003\u0000\u0000\u0cc3\u0cc4\u0005\n\u0000"+
		"\u0000\u0cc4\u0cc5\u0005\u0003\u0000\u0000\u0cc5\u0cc6\u0005\n\u0000\u0000"+
		"\u0cc6\u0cc7\u0005\u0003\u0000\u0000\u0cc7\u0cc8\u0005\n\u0000\u0000\u0cc8"+
		"\u0cc9\u0005\u0003\u0000\u0000\u0cc9\u0cca\u0005\n\u0000\u0000\u0cca\u0ccb"+
		"\u0005\u0003\u0000\u0000\u0ccb\u0ccc\u0005\n\u0000\u0000\u0ccc\u0ccd\u0005"+
		"\u0003\u0000\u0000\u0ccd\u0cce\u0005\n\u0000\u0000\u0cce\u0ccf\u0005\u0003"+
		"\u0000\u0000\u0ccf\u0d11\u0005\u0004\u0000\u0000\u0cd0\u0cd1\u0005\n\u0000"+
		"\u0000\u0cd1\u0cd2\u0005\u0003\u0000\u0000\u0cd2\u0cd3\u0005\b\u0000\u0000"+
		"\u0cd3\u0cd4\u0005\u0003\u0000\u0000\u0cd4\u0cd5\u0005\u0006\u0000\u0000"+
		"\u0cd5\u0cd6\u0005\u0003\u0000\u0000\u0cd6\u0cd7\u0005\b\u0000\u0000\u0cd7"+
		"\u0cd8\u0005\u0003\u0000\u0000\u0cd8\u0cd9\u0005\b\u0000\u0000\u0cd9\u0cda"+
		"\u0005\u0003\u0000\u0000\u0cda\u0cdb\u0005\b\u0000\u0000\u0cdb\u0cdc\u0005"+
		"\u0003\u0000\u0000\u0cdc\u0cdd\u0005\b\u0000\u0000\u0cdd\u0cde\u0005\u0003"+
		"\u0000\u0000\u0cde\u0cdf\u0005\b\u0000\u0000\u0cdf\u0ce0\u0005\u0003\u0000"+
		"\u0000\u0ce0\u0ce1\u0005\b\u0000\u0000\u0ce1\u0ce2\u0005\u0003\u0000\u0000"+
		"\u0ce2\u0ce3\u0005\b\u0000\u0000\u0ce3\u0ce4\u0005\u0003\u0000\u0000\u0ce4"+
		"\u0ce5\u0005\b\u0000\u0000\u0ce5\u0ce6\u0005\u0003\u0000\u0000\u0ce6\u0ce7"+
		"\u0005\b\u0000\u0000\u0ce7\u0ce8\u0005\u0003\u0000\u0000\u0ce8\u0ce9\u0005"+
		"\b\u0000\u0000\u0ce9\u0cea\u0005\u0003\u0000\u0000\u0cea\u0ceb\u0005\b"+
		"\u0000\u0000\u0ceb\u0cec\u0005\u0003\u0000\u0000\u0cec\u0ced\u0005\b\u0000"+
		"\u0000\u0ced\u0cee\u0005\u0003\u0000\u0000\u0cee\u0cf0\u00032\u0019\u0000"+
		"\u0cef\u0cf1\u00032\u0019\u0000\u0cf0\u0cef\u0001\u0000\u0000\u0000\u0cf0"+
		"\u0cf1\u0001\u0000\u0000\u0000\u0cf1\u0cf3\u0001\u0000\u0000\u0000\u0cf2"+
		"\u0cf4\u00032\u0019\u0000\u0cf3\u0cf2\u0001\u0000\u0000\u0000\u0cf3\u0cf4"+
		"\u0001\u0000\u0000\u0000\u0cf4\u0cf6\u0001\u0000\u0000\u0000\u0cf5\u0cf7"+
		"\u00032\u0019\u0000\u0cf6\u0cf5\u0001\u0000\u0000\u0000\u0cf6\u0cf7\u0001"+
		"\u0000\u0000\u0000\u0cf7\u0cf9\u0001\u0000\u0000\u0000\u0cf8\u0cfa\u0003"+
		"2\u0019\u0000\u0cf9\u0cf8\u0001\u0000\u0000\u0000\u0cf9\u0cfa\u0001\u0000"+
		"\u0000\u0000\u0cfa\u0cfc\u0001\u0000\u0000\u0000\u0cfb\u0cfd\u00032\u0019"+
		"\u0000\u0cfc\u0cfb\u0001\u0000\u0000\u0000\u0cfc\u0cfd\u0001\u0000\u0000"+
		"\u0000\u0cfd\u0cff\u0001\u0000\u0000\u0000\u0cfe\u0d00\u00032\u0019\u0000"+
		"\u0cff\u0cfe\u0001\u0000\u0000\u0000\u0cff\u0d00\u0001\u0000\u0000\u0000"+
		"\u0d00\u0d04\u0001\u0000\u0000\u0000\u0d01\u0d03\u00032\u0019\u0000\u0d02"+
		"\u0d01\u0001\u0000\u0000\u0000\u0d03\u0d06\u0001\u0000\u0000\u0000\u0d04"+
		"\u0d02\u0001\u0000\u0000\u0000\u0d04\u0d05\u0001\u0000\u0000\u0000\u0d05"+
		"\u0d07\u0001\u0000\u0000\u0000\u0d06\u0d04\u0001\u0000\u0000\u0000\u0d07"+
		"\u0d08\u0005\u0003\u0000\u0000\u0d08\u0d09\u0005\b\u0000\u0000\u0d09\u0d0a"+
		"\u0005\u0003\u0000\u0000\u0d0a\u0d0b\u0005\b\u0000\u0000\u0d0b\u0d0c\u0005"+
		"\u0003\u0000\u0000\u0d0c\u0d0d\u0005\b\u0000\u0000\u0d0d\u0d0e\u0005\u0003"+
		"\u0000\u0000\u0d0e\u0d0f\u0005\u0004\u0000\u0000\u0d0f\u0d10\u0006\u0010"+
		"\uffff\uffff\u0000\u0d10\u0d12\u0001\u0000\u0000\u0000\u0d11\u0cd0\u0001"+
		"\u0000\u0000\u0000\u0d12\u0d13\u0001\u0000\u0000\u0000\u0d13\u0d11\u0001"+
		"\u0000\u0000\u0000\u0d13\u0d14\u0001\u0000\u0000\u0000\u0d14\u0d16\u0001"+
		"\u0000\u0000\u0000\u0d15\u0c6e\u0001\u0000\u0000\u0000\u0d15\u0ca9\u0001"+
		"\u0000\u0000\u0000\u0d16\u0d18\u0001\u0000\u0000\u0000\u0d17\u0d15\u0001"+
		"\u0000\u0000\u0000\u0d18\u0d19\u0001\u0000\u0000\u0000\u0d19\u0d17\u0001"+
		"\u0000\u0000\u0000\u0d19\u0d1a\u0001\u0000\u0000\u0000\u0d1a\u0d1b\u0001"+
		"\u0000\u0000\u0000\u0d1b\u0d1c\u0005\n\u0000\u0000\u0d1c\u0d1d\u0005\u0003"+
		"\u0000\u0000\u0d1d\u0d1e\u0005\n\u0000\u0000\u0d1e\u0d1f\u0005\u0003\u0000"+
		"\u0000\u0d1f\u0d20\u0005\u0006\u0000\u0000\u0d20\u0d22\u0005\u0004\u0000"+
		"\u0000\u0d21\u0c68\u0001\u0000\u0000\u0000\u0d21\u0d17\u0001\u0000\u0000"+
		"\u0000\u0d22\u0d23\u0001\u0000\u0000\u0000\u0d23\u0d21\u0001\u0000\u0000"+
		"\u0000\u0d23\u0d24\u0001\u0000\u0000\u0000\u0d24\u0d25\u0001\u0000\u0000"+
		"\u0000\u0d25\u0d26\u0005\u0005\u0000\u0000\u0d26\u0d27\u0005\u0003\u0000"+
		"\u0000\u0d27\u0d28\u0005\n\u0000\u0000\u0d28\u0d29\u0005\u0003\u0000\u0000"+
		"\u0d29\u0d2a\u0005\n\u0000\u0000\u0d2a\u0d2b\u0005\u0003\u0000\u0000\u0d2b"+
		"\u0d2c\u0005\n\u0000\u0000\u0d2c\u0d2d\u0005\u0004\u0000\u0000\u0d2d!"+
		"\u0001\u0000\u0000\u0000\u0d2e\u0d2f\u0005\u0005\u0000\u0000\u0d2f\u0d30"+
		"\u0005\u0003\u0000\u0000\u0d30\u0d31\u0005\n\u0000\u0000\u0d31\u0d32\u0005"+
		"\u0003\u0000\u0000\u0d32\u0d33\u0005\n\u0000\u0000\u0d33\u0d34\u0005\n"+
		"\u0000\u0000\u0d34\u0d35\u0005\n\u0000\u0000\u0d35\u0d36\u0005\u0003\u0000"+
		"\u0000\u0d36\u0d37\u0005\n\u0000\u0000\u0d37\u0d38\u0005\u0003\u0000\u0000"+
		"\u0d38\u0d39\u0005\n\u0000\u0000\u0d39\u0dba\u0005\u0004\u0000\u0000\u0d3a"+
		"\u0d3b\u0005\n\u0000\u0000\u0d3b\u0d3c\u0005\u0003\u0000\u0000\u0d3c\u0d3d"+
		"\u0005\u0004\u0000\u0000\u0d3d\u0d3e\u0005\n\u0000\u0000\u0d3e\u0d3f\u0005"+
		"\u0003\u0000\u0000\u0d3f\u0d40\u0005\n\u0000\u0000\u0d40\u0d41\u0005\u0003"+
		"\u0000\u0000\u0d41\u0d42\u0005\n\u0000\u0000\u0d42\u0d43\u0005\u0003\u0000"+
		"\u0000\u0d43\u0d44\u0005\u0003\u0000\u0000\u0d44\u0d45\u0005\n\u0000\u0000"+
		"\u0d45\u0d46\u0005\u0003\u0000\u0000\u0d46\u0d47\u0005\n\u0000\u0000\u0d47"+
		"\u0d48\u0005\u0003\u0000\u0000\u0d48\u0d49\u0005\n\u0000\u0000\u0d49\u0d4a"+
		"\u0005\u0003\u0000\u0000\u0d4a\u0d4b\u0005\n\u0000\u0000\u0d4b\u0d4c\u0005"+
		"\u0004\u0000\u0000\u0d4c\u0d4d\u0005\n\u0000\u0000\u0d4d\u0d4e\u0005\u0003"+
		"\u0000\u0000\u0d4e\u0d4f\u0005\u0003\u0000\u0000\u0d4f\u0d50\u0005\u0003"+
		"\u0000\u0000\u0d50\u0d51\u0005\n\u0000\u0000\u0d51\u0d52\u0005\u0003\u0000"+
		"\u0000\u0d52\u0d53\u0005\u0003\u0000\u0000\u0d53\u0d54\u0005\u0003\u0000"+
		"\u0000\u0d54\u0d55\u0005\u0003\u0000\u0000\u0d55\u0d56\u0005\u0003\u0000"+
		"\u0000\u0d56\u0d57\u0005\u0003\u0000\u0000\u0d57\u0d58\u0005\n\u0000\u0000"+
		"\u0d58\u0d59\u0005\u0003\u0000\u0000\u0d59\u0d5a\u0005\n\u0000\u0000\u0d5a"+
		"\u0d5b\u0005\u0003\u0000\u0000\u0d5b\u0daf\u0005\u0004\u0000\u0000\u0d5c"+
		"\u0d5d\u0005\n\u0000\u0000\u0d5d\u0d5e\u0005\u0003\u0000\u0000\u0d5e\u0d5f"+
		"\u0005\u0003\u0000\u0000\u0d5f\u0d61\u00032\u0019\u0000\u0d60\u0d62\u0003"+
		"2\u0019\u0000\u0d61\u0d60\u0001\u0000\u0000\u0000\u0d61\u0d62\u0001\u0000"+
		"\u0000\u0000\u0d62\u0d64\u0001\u0000\u0000\u0000\u0d63\u0d65\u00032\u0019"+
		"\u0000\u0d64\u0d63\u0001\u0000\u0000\u0000\u0d64\u0d65\u0001\u0000\u0000"+
		"\u0000\u0d65\u0d67\u0001\u0000\u0000\u0000\u0d66\u0d68\u00032\u0019\u0000"+
		"\u0d67\u0d66\u0001\u0000\u0000\u0000\u0d67\u0d68\u0001\u0000\u0000\u0000"+
		"\u0d68\u0d6a\u0001\u0000\u0000\u0000\u0d69\u0d6b\u00032\u0019\u0000\u0d6a"+
		"\u0d69\u0001\u0000\u0000\u0000\u0d6a\u0d6b\u0001\u0000\u0000\u0000\u0d6b"+
		"\u0d6d\u0001\u0000\u0000\u0000\u0d6c\u0d6e\u00032\u0019\u0000\u0d6d\u0d6c"+
		"\u0001\u0000\u0000\u0000\u0d6d\u0d6e\u0001\u0000\u0000\u0000\u0d6e\u0d70"+
		"\u0001\u0000\u0000\u0000\u0d6f\u0d71\u00032\u0019\u0000\u0d70\u0d6f\u0001"+
		"\u0000\u0000\u0000\u0d70\u0d71\u0001\u0000\u0000\u0000\u0d71\u0d75\u0001"+
		"\u0000\u0000\u0000\u0d72\u0d74\u00032\u0019\u0000\u0d73\u0d72\u0001\u0000"+
		"\u0000\u0000\u0d74\u0d77\u0001\u0000\u0000\u0000\u0d75\u0d73\u0001\u0000"+
		"\u0000\u0000\u0d75\u0d76\u0001\u0000\u0000\u0000\u0d76\u0d78\u0001\u0000"+
		"\u0000\u0000\u0d77\u0d75\u0001\u0000\u0000\u0000\u0d78\u0d79\u0005\u0003"+
		"\u0000\u0000\u0d79\u0d7a\u0005\b\u0000\u0000\u0d7a\u0d7b\u0005\u0003\u0000"+
		"\u0000\u0d7b\u0d7d\u00032\u0019\u0000\u0d7c\u0d7e\u00032\u0019\u0000\u0d7d"+
		"\u0d7c\u0001\u0000\u0000\u0000\u0d7d\u0d7e\u0001\u0000\u0000\u0000\u0d7e"+
		"\u0d80\u0001\u0000\u0000\u0000\u0d7f\u0d81\u00032\u0019\u0000\u0d80\u0d7f"+
		"\u0001\u0000\u0000\u0000\u0d80\u0d81\u0001\u0000\u0000\u0000\u0d81\u0d83"+
		"\u0001\u0000\u0000\u0000\u0d82\u0d84\u00032\u0019\u0000\u0d83\u0d82\u0001"+
		"\u0000\u0000\u0000\u0d83\u0d84\u0001\u0000\u0000\u0000\u0d84\u0d86\u0001"+
		"\u0000\u0000\u0000\u0d85\u0d87\u00032\u0019\u0000\u0d86\u0d85\u0001\u0000"+
		"\u0000\u0000\u0d86\u0d87\u0001\u0000\u0000\u0000\u0d87\u0d89\u0001\u0000"+
		"\u0000\u0000\u0d88\u0d8a\u00032\u0019\u0000\u0d89\u0d88\u0001\u0000\u0000"+
		"\u0000\u0d89\u0d8a\u0001\u0000\u0000\u0000\u0d8a\u0d8c\u0001\u0000\u0000"+
		"\u0000\u0d8b\u0d8d\u00032\u0019\u0000\u0d8c\u0d8b\u0001\u0000\u0000\u0000"+
		"\u0d8c\u0d8d\u0001\u0000\u0000\u0000\u0d8d\u0d91\u0001\u0000\u0000\u0000"+
		"\u0d8e\u0d90\u00032\u0019\u0000\u0d8f\u0d8e\u0001\u0000\u0000\u0000\u0d90"+
		"\u0d93\u0001\u0000\u0000\u0000\u0d91\u0d8f\u0001\u0000\u0000\u0000\u0d91"+
		"\u0d92\u0001\u0000\u0000\u0000\u0d92\u0d94\u0001\u0000\u0000\u0000\u0d93"+
		"\u0d91\u0001\u0000\u0000\u0000\u0d94\u0d95\u0005\u0003\u0000\u0000\u0d95"+
		"\u0d96\u0005\b\u0000\u0000\u0d96\u0d97\u0005\u0003\u0000\u0000\u0d97\u0d98"+
		"\u0005\b\u0000\u0000\u0d98\u0d99\u0005\u0003\u0000\u0000\u0d99\u0d9a\u0005"+
		"\b\u0000\u0000\u0d9a\u0d9b\u0005\u0003\u0000\u0000\u0d9b\u0d9c\u0005\u0003"+
		"\u0000\u0000\u0d9c\u0d9e\u0005\u0003\u0000\u0000\u0d9d\u0d9f\u0005\b\u0000"+
		"\u0000\u0d9e\u0d9d\u0001\u0000\u0000\u0000\u0d9e\u0d9f\u0001\u0000\u0000"+
		"\u0000\u0d9f\u0da0\u0001\u0000\u0000\u0000\u0da0\u0da1\u0005\u0003\u0000"+
		"\u0000\u0da1\u0da2\u0005\u0003\u0000\u0000\u0da2\u0da3\u0005\u0003\u0000"+
		"\u0000\u0da3\u0da4\u0005\u0003\u0000\u0000\u0da4\u0da5\u0005\u0003\u0000"+
		"\u0000\u0da5\u0da7\u0005\u0003\u0000\u0000\u0da6\u0da8\u0005\b\u0000\u0000"+
		"\u0da7\u0da6\u0001\u0000\u0000\u0000\u0da7\u0da8\u0001\u0000\u0000\u0000"+
		"\u0da8\u0da9\u0001\u0000\u0000\u0000\u0da9\u0daa\u0005\u0003\u0000\u0000"+
		"\u0daa\u0dab\u0005\n\u0000\u0000\u0dab\u0dac\u0005\u0003\u0000\u0000\u0dac"+
		"\u0dad\u0005\u0004\u0000\u0000\u0dad\u0dae\u0006\u0011\uffff\uffff\u0000"+
		"\u0dae\u0db0\u0001\u0000\u0000\u0000\u0daf\u0d5c\u0001\u0000\u0000\u0000"+
		"\u0db0\u0db1\u0001\u0000\u0000\u0000\u0db1\u0daf\u0001\u0000\u0000\u0000"+
		"\u0db1\u0db2\u0001\u0000\u0000\u0000\u0db2\u0db3\u0001\u0000\u0000\u0000"+
		"\u0db3\u0db4\u0005\n\u0000\u0000\u0db4\u0db5\u0005\u0003\u0000\u0000\u0db5"+
		"\u0db6\u0005\n\u0000\u0000\u0db6\u0db7\u0005\u0003\u0000\u0000\u0db7\u0db8"+
		"\u0005\u0006\u0000\u0000\u0db8\u0db9\u0005\u0004\u0000\u0000\u0db9\u0dbb"+
		"\u0001\u0000\u0000\u0000\u0dba\u0d3a\u0001\u0000\u0000\u0000\u0dbb\u0dbc"+
		"\u0001\u0000\u0000\u0000\u0dbc\u0dba\u0001\u0000\u0000\u0000\u0dbc\u0dbd"+
		"\u0001\u0000\u0000\u0000\u0dbd\u0dbe\u0001\u0000\u0000\u0000\u0dbe\u0dbf"+
		"\u0005\u0005\u0000\u0000\u0dbf\u0dc0\u0005\u0003\u0000\u0000\u0dc0\u0dc1"+
		"\u0005\n\u0000\u0000\u0dc1\u0dc2\u0005\u0003\u0000\u0000\u0dc2\u0dc3\u0005"+
		"\n\u0000\u0000\u0dc3\u0dc4\u0005\n\u0000\u0000\u0dc4\u0dc5\u0005\n\u0000"+
		"\u0000\u0dc5\u0dc6\u0005\u0003\u0000\u0000\u0dc6\u0dc7\u0005\n\u0000\u0000"+
		"\u0dc7\u0dc8\u0005\u0003\u0000\u0000\u0dc8\u0dc9\u0005\n\u0000\u0000\u0dc9"+
		"\u0dca\u0005\u0004\u0000\u0000\u0dca#\u0001\u0000\u0000\u0000\u0dcb\u0dcc"+
		"\u0005\u0005\u0000\u0000\u0dcc\u0dcd\u0005\u0003\u0000\u0000\u0dcd\u0dce"+
		"\u0005\n\u0000\u0000\u0dce\u0dcf\u0005\n\u0000\u0000\u0dcf\u0dd0\u0005"+
		"\u0003\u0000\u0000\u0dd0\u0dd1\u0005\n\u0000\u0000\u0dd1\u0dd2\u0005\u0003"+
		"\u0000\u0000\u0dd2\u0dd3\u0005\n\u0000\u0000\u0dd3\u0dd4\u0005\u0003\u0000"+
		"\u0000\u0dd4\u0dd5\u0005\n\u0000\u0000\u0dd5\u0e63\u0005\u0004\u0000\u0000"+
		"\u0dd6\u0dd7\u0005\b\u0000\u0000\u0dd7\u0dd9\u0005\u0003\u0000\u0000\u0dd8"+
		"\u0dda\u00032\u0019\u0000\u0dd9\u0dd8\u0001\u0000\u0000\u0000\u0dda\u0ddb"+
		"\u0001\u0000\u0000\u0000\u0ddb\u0dd9\u0001\u0000\u0000\u0000\u0ddb\u0ddc"+
		"\u0001\u0000\u0000\u0000\u0ddc\u0ddd\u0001\u0000\u0000\u0000\u0ddd\u0dde"+
		"\u0005\u0004\u0000\u0000\u0dde\u0ddf\u0005\u0005\u0000\u0000\u0ddf\u0de0"+
		"\u0005\u0003\u0000\u0000\u0de0\u0de2\u00032\u0019\u0000\u0de1\u0de3\u0003"+
		"2\u0019\u0000\u0de2\u0de1\u0001\u0000\u0000\u0000\u0de2\u0de3\u0001\u0000"+
		"\u0000\u0000\u0de3\u0de5\u0001\u0000\u0000\u0000\u0de4\u0de6\u00032\u0019"+
		"\u0000\u0de5\u0de4\u0001\u0000\u0000\u0000\u0de5\u0de6\u0001\u0000\u0000"+
		"\u0000\u0de6\u0de8\u0001\u0000\u0000\u0000\u0de7\u0de9\u00032\u0019\u0000"+
		"\u0de8\u0de7\u0001\u0000\u0000\u0000\u0de8\u0de9\u0001\u0000\u0000\u0000"+
		"\u0de9\u0deb\u0001\u0000\u0000\u0000\u0dea\u0dec\u00032\u0019\u0000\u0deb"+
		"\u0dea\u0001\u0000\u0000\u0000\u0deb\u0dec\u0001\u0000\u0000\u0000\u0dec"+
		"\u0dee\u0001\u0000\u0000\u0000\u0ded\u0def\u00032\u0019\u0000\u0dee\u0ded"+
		"\u0001\u0000\u0000\u0000\u0dee\u0def\u0001\u0000\u0000\u0000\u0def\u0df1"+
		"\u0001\u0000\u0000\u0000\u0df0\u0df2\u00032\u0019\u0000\u0df1\u0df0\u0001"+
		"\u0000\u0000\u0000\u0df1\u0df2\u0001\u0000\u0000\u0000\u0df2\u0df6\u0001"+
		"\u0000\u0000\u0000\u0df3\u0df5\u00032\u0019\u0000\u0df4\u0df3\u0001\u0000"+
		"\u0000\u0000\u0df5\u0df8\u0001\u0000\u0000\u0000\u0df6\u0df4\u0001\u0000"+
		"\u0000\u0000\u0df6\u0df7\u0001\u0000\u0000\u0000\u0df7\u0df9\u0001\u0000"+
		"\u0000\u0000\u0df8\u0df6\u0001\u0000\u0000\u0000\u0df9\u0dfa\u0005\u0004"+
		"\u0000\u0000\u0dfa\u0dfb\u0005\u0005\u0000\u0000\u0dfb\u0dfc\u0005\u0003"+
		"\u0000\u0000\u0dfc\u0dfe\u00032\u0019\u0000\u0dfd\u0dff\u00032\u0019\u0000"+
		"\u0dfe\u0dfd\u0001\u0000\u0000\u0000\u0dfe\u0dff\u0001\u0000\u0000\u0000"+
		"\u0dff\u0e01\u0001\u0000\u0000\u0000\u0e00\u0e02\u00032\u0019\u0000\u0e01"+
		"\u0e00\u0001\u0000\u0000\u0000\u0e01\u0e02\u0001\u0000\u0000\u0000\u0e02"+
		"\u0e04\u0001\u0000\u0000\u0000\u0e03\u0e05\u00032\u0019\u0000\u0e04\u0e03"+
		"\u0001\u0000\u0000\u0000\u0e04\u0e05\u0001\u0000\u0000\u0000\u0e05\u0e07"+
		"\u0001\u0000\u0000\u0000\u0e06\u0e08\u00032\u0019\u0000\u0e07\u0e06\u0001"+
		"\u0000\u0000\u0000\u0e07\u0e08\u0001\u0000\u0000\u0000\u0e08\u0e0a\u0001"+
		"\u0000\u0000\u0000\u0e09\u0e0b\u00032\u0019\u0000\u0e0a\u0e09\u0001\u0000"+
		"\u0000\u0000\u0e0a\u0e0b\u0001\u0000\u0000\u0000\u0e0b\u0e0d\u0001\u0000"+
		"\u0000\u0000\u0e0c\u0e0e\u00032\u0019\u0000\u0e0d\u0e0c\u0001\u0000\u0000"+
		"\u0000\u0e0d\u0e0e\u0001\u0000\u0000\u0000\u0e0e\u0e12\u0001\u0000\u0000"+
		"\u0000\u0e0f\u0e11\u00032\u0019\u0000\u0e10\u0e0f\u0001\u0000\u0000\u0000"+
		"\u0e11\u0e14\u0001\u0000\u0000\u0000\u0e12\u0e10\u0001\u0000\u0000\u0000"+
		"\u0e12\u0e13\u0001\u0000\u0000\u0000\u0e13\u0e15\u0001\u0000\u0000\u0000"+
		"\u0e14\u0e12\u0001\u0000\u0000\u0000\u0e15\u0e16\u0005\u0004\u0000\u0000"+
		"\u0e16\u0e17\u0005\u0005\u0000\u0000\u0e17\u0e18\u0005\u0003\u0000\u0000"+
		"\u0e18\u0e19\u0005\b\u0000\u0000\u0e19\u0e1a\u0005\u0004\u0000\u0000\u0e1a"+
		"\u0e1b\u0006\u0012\uffff\uffff\u0000\u0e1b\u0e58\u0001\u0000\u0000\u0000"+
		"\u0e1c\u0e1d\u0005\n\u0000\u0000\u0e1d\u0e1e\u0005\u0003\u0000\u0000\u0e1e"+
		"\u0e1f\u0005\n\u0000\u0000\u0e1f\u0e20\u0005\u0003\u0000\u0000\u0e20\u0e21"+
		"\u0005\n\u0000\u0000\u0e21\u0e22\u0005\u0003\u0000\u0000\u0e22\u0e23\u0005"+
		"\n\u0000\u0000\u0e23\u0e24\u0005\u0003\u0000\u0000\u0e24\u0e25\u0005\n"+
		"\u0000\u0000\u0e25\u0e26\u0005\u0003\u0000\u0000\u0e26\u0e27\u0005\n\u0000"+
		"\u0000\u0e27\u0e28\u0005\u0003\u0000\u0000\u0e28\u0e29\u0005\n\u0000\u0000"+
		"\u0e29\u0e2a\u0005\u0003\u0000\u0000\u0e2a\u0e2b\u0005\n\u0000\u0000\u0e2b"+
		"\u0e2c\u0005\u0003\u0000\u0000\u0e2c\u0e54\u0005\u0004\u0000\u0000\u0e2d"+
		"\u0e2e\u0005\u0003\u0000\u0000\u0e2e\u0e2f\u0005\u0003\u0000\u0000\u0e2f"+
		"\u0e30\u0005\u0003\u0000\u0000\u0e30\u0e31\u0005\u0003\u0000\u0000\u0e31"+
		"\u0e32\u0005\u0003\u0000\u0000\u0e32\u0e33\u0005\u0003\u0000\u0000\u0e33"+
		"\u0e34\u0005\u0003\u0000\u0000\u0e34\u0e35\u0005\u0003\u0000\u0000\u0e35"+
		"\u0e55\u0005\u0004\u0000\u0000\u0e36\u0e38\u0005\u0006\u0000\u0000\u0e37"+
		"\u0e36\u0001\u0000\u0000\u0000\u0e37\u0e38\u0001\u0000\u0000\u0000\u0e38"+
		"\u0e39\u0001\u0000\u0000\u0000\u0e39\u0e3b\u0005\u0003\u0000\u0000\u0e3a"+
		"\u0e3c\u0005\b\u0000\u0000\u0e3b\u0e3a\u0001\u0000\u0000\u0000\u0e3b\u0e3c"+
		"\u0001\u0000\u0000\u0000\u0e3c\u0e3d\u0001\u0000\u0000\u0000\u0e3d\u0e3f"+
		"\u0005\u0003\u0000\u0000\u0e3e\u0e40\u0005\b\u0000\u0000\u0e3f\u0e3e\u0001"+
		"\u0000\u0000\u0000\u0e3f\u0e40\u0001\u0000\u0000\u0000\u0e40\u0e41\u0001"+
		"\u0000\u0000\u0000\u0e41\u0e43\u0005\u0003\u0000\u0000\u0e42\u0e44\u0005"+
		"\b\u0000\u0000\u0e43\u0e42\u0001\u0000\u0000\u0000\u0e43\u0e44\u0001\u0000"+
		"\u0000\u0000\u0e44\u0e45\u0001\u0000\u0000\u0000\u0e45\u0e47\u0005\u0003"+
		"\u0000\u0000\u0e46\u0e48\u0005\b\u0000\u0000\u0e47\u0e46\u0001\u0000\u0000"+
		"\u0000\u0e47\u0e48\u0001\u0000\u0000\u0000\u0e48\u0e49\u0001\u0000\u0000"+
		"\u0000\u0e49\u0e4a\u0005\u0003\u0000\u0000\u0e4a\u0e4b\u0005\b\u0000\u0000"+
		"\u0e4b\u0e4c\u0005\u0003\u0000\u0000\u0e4c\u0e4d\u0005\b\u0000\u0000\u0e4d"+
		"\u0e4f\u0005\u0003\u0000\u0000\u0e4e\u0e50\u0005\b\u0000\u0000\u0e4f\u0e4e"+
		"\u0001\u0000\u0000\u0000\u0e4f\u0e50\u0001\u0000\u0000\u0000\u0e50\u0e51"+
		"\u0001\u0000\u0000\u0000\u0e51\u0e52\u0005\u0003\u0000\u0000\u0e52\u0e53"+
		"\u0005\u0004\u0000\u0000\u0e53\u0e55\u0006\u0012\uffff\uffff\u0000\u0e54"+
		"\u0e2d\u0001\u0000\u0000\u0000\u0e54\u0e37\u0001\u0000\u0000\u0000\u0e55"+
		"\u0e56\u0001\u0000\u0000\u0000\u0e56\u0e54\u0001\u0000\u0000\u0000\u0e56"+
		"\u0e57\u0001\u0000\u0000\u0000\u0e57\u0e59\u0001\u0000\u0000\u0000\u0e58"+
		"\u0e1c\u0001\u0000\u0000\u0000\u0e59\u0e5a\u0001\u0000\u0000\u0000\u0e5a"+
		"\u0e58\u0001\u0000\u0000\u0000\u0e5a\u0e5b\u0001\u0000\u0000\u0000\u0e5b"+
		"\u0e5c\u0001\u0000\u0000\u0000\u0e5c\u0e5d\u0005\n\u0000\u0000\u0e5d\u0e5e"+
		"\u0005\u0003\u0000\u0000\u0e5e\u0e5f\u0005\n\u0000\u0000\u0e5f\u0e60\u0005"+
		"\u0003\u0000\u0000\u0e60\u0e61\u0005\u0006\u0000\u0000\u0e61\u0e62\u0005"+
		"\u0004\u0000\u0000\u0e62\u0e64\u0001\u0000\u0000\u0000\u0e63\u0dd6\u0001"+
		"\u0000\u0000\u0000\u0e64\u0e65\u0001\u0000\u0000\u0000\u0e65\u0e63\u0001"+
		"\u0000\u0000\u0000\u0e65\u0e66\u0001\u0000\u0000\u0000\u0e66\u0e67\u0001"+
		"\u0000\u0000\u0000\u0e67\u0e68\u0005\u0005\u0000\u0000\u0e68\u0e69\u0005"+
		"\u0003\u0000\u0000\u0e69\u0e6a\u0005\n\u0000\u0000\u0e6a\u0e6b\u0005\n"+
		"\u0000\u0000\u0e6b\u0e6c\u0005\u0003\u0000\u0000\u0e6c\u0e6d\u0005\n\u0000"+
		"\u0000\u0e6d\u0e6e\u0005\u0003\u0000\u0000\u0e6e\u0e6f\u0005\n\u0000\u0000"+
		"\u0e6f\u0e70\u0005\u0003\u0000\u0000\u0e70\u0e71\u0005\n\u0000\u0000\u0e71"+
		"\u0e72\u0005\u0004\u0000\u0000\u0e72%\u0001\u0000\u0000\u0000\u0e73\u0e74"+
		"\u0005\u0005\u0000\u0000\u0e74\u0e75\u0005\u0003\u0000\u0000\u0e75\u0e76"+
		"\u0005\n\u0000\u0000\u0e76\u0e77\u0005\n\u0000\u0000\u0e77\u0e78\u0005"+
		"\u0003\u0000\u0000\u0e78\u0e79\u0005\n\u0000\u0000\u0e79\u0e7a\u0005\u0003"+
		"\u0000\u0000\u0e7a\u0e7b\u0005\n\u0000\u0000\u0e7b\u0e7c\u0005\u0003\u0000"+
		"\u0000\u0e7c\u0e7d\u0005\n\u0000\u0000\u0e7d\u0ebc\u0005\u0004\u0000\u0000"+
		"\u0e7e\u0e7f\u0005\b\u0000\u0000\u0e7f\u0e81\u0005\u0003\u0000\u0000\u0e80"+
		"\u0e82\u00032\u0019\u0000\u0e81\u0e80\u0001\u0000\u0000\u0000\u0e82\u0e83"+
		"\u0001\u0000\u0000\u0000\u0e83\u0e81\u0001\u0000\u0000\u0000\u0e83\u0e84"+
		"\u0001\u0000\u0000\u0000\u0e84\u0e85\u0001\u0000\u0000\u0000\u0e85\u0eb1"+
		"\u0005\u0004\u0000\u0000\u0e86\u0e87\u0005\n\u0000\u0000\u0e87\u0e88\u0005"+
		"\u0003\u0000\u0000\u0e88\u0e89\u0005\n\u0000\u0000\u0e89\u0e8a\u0005\u0003"+
		"\u0000\u0000\u0e8a\u0e8b\u0005\n\u0000\u0000\u0e8b\u0e8c\u0005\u0003\u0000"+
		"\u0000\u0e8c\u0e8d\u0005\n\u0000\u0000\u0e8d\u0e8e\u0005\u0003\u0000\u0000"+
		"\u0e8e\u0e8f\u0005\n\u0000\u0000\u0e8f\u0e90\u0005\u0003\u0000\u0000\u0e90"+
		"\u0e91\u0005\n\u0000\u0000\u0e91\u0e92\u0005\u0003\u0000\u0000\u0e92\u0e93"+
		"\u0005\n\u0000\u0000\u0e93\u0e94\u0005\u0003\u0000\u0000\u0e94\u0ead\u0005"+
		"\u0004\u0000\u0000\u0e95\u0e96\u0005\u0003\u0000\u0000\u0e96\u0e97\u0005"+
		"\u0003\u0000\u0000\u0e97\u0e98\u0005\u0003\u0000\u0000\u0e98\u0e99\u0005"+
		"\u0003\u0000\u0000\u0e99\u0e9a\u0005\u0003\u0000\u0000\u0e9a\u0e9b\u0005"+
		"\u0003\u0000\u0000\u0e9b\u0e9c\u0005\u0003\u0000\u0000\u0e9c\u0eae\u0005"+
		"\u0004\u0000\u0000\u0e9d\u0e9e\u0005\u0006\u0000\u0000\u0e9e\u0e9f\u0005"+
		"\u0003\u0000\u0000\u0e9f\u0ea0\u0005\b\u0000\u0000\u0ea0\u0ea1\u0005\u0003"+
		"\u0000\u0000\u0ea1\u0ea2\u0005\b\u0000\u0000\u0ea2\u0ea3\u0005\u0003\u0000"+
		"\u0000\u0ea3\u0ea4\u0005\b\u0000\u0000\u0ea4\u0ea5\u0005\u0003\u0000\u0000"+
		"\u0ea5\u0ea6\u0005\b\u0000\u0000\u0ea6\u0ea7\u0005\u0003\u0000\u0000\u0ea7"+
		"\u0ea8\u0005\b\u0000\u0000\u0ea8\u0ea9\u0005\u0003\u0000\u0000\u0ea9\u0eaa"+
		"\u0005\b\u0000\u0000\u0eaa\u0eab\u0005\u0003\u0000\u0000\u0eab\u0eac\u0005"+
		"\u0004\u0000\u0000\u0eac\u0eae\u0006\u0013\uffff\uffff\u0000\u0ead\u0e95"+
		"\u0001\u0000\u0000\u0000\u0ead\u0e9d\u0001\u0000\u0000\u0000\u0eae\u0eaf"+
		"\u0001\u0000\u0000\u0000\u0eaf\u0ead\u0001\u0000\u0000\u0000\u0eaf\u0eb0"+
		"\u0001\u0000\u0000\u0000\u0eb0\u0eb2\u0001\u0000\u0000\u0000\u0eb1\u0e86"+
		"\u0001\u0000\u0000\u0000\u0eb2\u0eb3\u0001\u0000\u0000\u0000\u0eb3\u0eb1"+
		"\u0001\u0000\u0000\u0000\u0eb3\u0eb4\u0001\u0000\u0000\u0000\u0eb4\u0eb5"+
		"\u0001\u0000\u0000\u0000\u0eb5\u0eb6\u0005\n\u0000\u0000\u0eb6\u0eb7\u0005"+
		"\u0003\u0000\u0000\u0eb7\u0eb8\u0005\n\u0000\u0000\u0eb8\u0eb9\u0005\u0003"+
		"\u0000\u0000\u0eb9\u0eba\u0005\u0006\u0000\u0000\u0eba\u0ebb\u0005\u0004"+
		"\u0000\u0000\u0ebb\u0ebd\u0001\u0000\u0000\u0000\u0ebc\u0e7e\u0001\u0000"+
		"\u0000\u0000\u0ebd\u0ebe\u0001\u0000\u0000\u0000\u0ebe\u0ebc\u0001\u0000"+
		"\u0000\u0000\u0ebe\u0ebf\u0001\u0000\u0000\u0000\u0ebf\u0ec0\u0001\u0000"+
		"\u0000\u0000\u0ec0\u0ec1\u0005\u0005\u0000\u0000\u0ec1\u0ec2\u0005\u0003"+
		"\u0000\u0000\u0ec2\u0ec3\u0005\n\u0000\u0000\u0ec3\u0ec4\u0005\n\u0000"+
		"\u0000\u0ec4\u0ec5\u0005\u0003\u0000\u0000\u0ec5\u0ec6\u0005\n\u0000\u0000"+
		"\u0ec6\u0ec7\u0005\u0003\u0000\u0000\u0ec7\u0ec8\u0005\n\u0000\u0000\u0ec8"+
		"\u0ec9\u0005\u0003\u0000\u0000\u0ec9\u0eca\u0005\n\u0000\u0000\u0eca\u0ecb"+
		"\u0005\u0004\u0000\u0000\u0ecb\'\u0001\u0000\u0000\u0000\u0ecc\u0ecd\u0005"+
		"\u0005\u0000\u0000\u0ecd\u0ece\u0005\u0003\u0000\u0000\u0ece\u0ecf\u0005"+
		"\n\u0000\u0000\u0ecf\u0ed0\u0005\n\u0000\u0000\u0ed0\u0ed1\u0005\u0003"+
		"\u0000\u0000\u0ed1\u0ed2\u0005\n\u0000\u0000\u0ed2\u0ed3\u0005\u0003\u0000"+
		"\u0000\u0ed3\u0ed4\u0005\n\u0000\u0000\u0ed4\u0ed5\u0005\u0003\u0000\u0000"+
		"\u0ed5\u0ed6\u0005\n\u0000\u0000\u0ed6\u0f10\u0005\u0004\u0000\u0000\u0ed7"+
		"\u0ed8\u0005\u0005\u0000\u0000\u0ed8\u0ed9\u0005\u0003\u0000\u0000\u0ed9"+
		"\u0eda\u0005\b\u0000\u0000\u0eda\u0edb\u0005\u0003\u0000\u0000\u0edb\u0edc"+
		"\u0005\n\u0000\u0000\u0edc\u0edd\u0005\u0003\u0000\u0000\u0edd\u0edf\u0003"+
		"2\u0019\u0000\u0ede\u0ee0\u00032\u0019\u0000\u0edf\u0ede\u0001\u0000\u0000"+
		"\u0000\u0edf\u0ee0\u0001\u0000\u0000\u0000\u0ee0\u0ee2\u0001\u0000\u0000"+
		"\u0000\u0ee1\u0ee3\u00032\u0019\u0000\u0ee2\u0ee1\u0001\u0000\u0000\u0000"+
		"\u0ee2\u0ee3\u0001\u0000\u0000\u0000\u0ee3\u0ee5\u0001\u0000\u0000\u0000"+
		"\u0ee4\u0ee6\u00032\u0019\u0000\u0ee5\u0ee4\u0001\u0000\u0000\u0000\u0ee5"+
		"\u0ee6\u0001\u0000\u0000\u0000\u0ee6\u0ee8\u0001\u0000\u0000\u0000\u0ee7"+
		"\u0ee9\u00032\u0019\u0000\u0ee8\u0ee7\u0001\u0000\u0000\u0000\u0ee8\u0ee9"+
		"\u0001\u0000\u0000\u0000\u0ee9\u0eeb\u0001\u0000\u0000\u0000\u0eea\u0eec"+
		"\u00032\u0019\u0000\u0eeb\u0eea\u0001\u0000\u0000\u0000\u0eeb\u0eec\u0001"+
		"\u0000\u0000\u0000\u0eec\u0eee\u0001\u0000\u0000\u0000\u0eed\u0eef\u0003"+
		"2\u0019\u0000\u0eee\u0eed\u0001\u0000\u0000\u0000\u0eee\u0eef\u0001\u0000"+
		"\u0000\u0000\u0eef\u0ef3\u0001\u0000\u0000\u0000\u0ef0\u0ef2\u00032\u0019"+
		"\u0000\u0ef1\u0ef0\u0001\u0000\u0000\u0000\u0ef2\u0ef5\u0001\u0000\u0000"+
		"\u0000\u0ef3\u0ef1\u0001\u0000\u0000\u0000\u0ef3\u0ef4\u0001\u0000\u0000"+
		"\u0000\u0ef4\u0ef6\u0001\u0000\u0000\u0000\u0ef5\u0ef3\u0001\u0000\u0000"+
		"\u0000\u0ef6\u0ef7\u0005\u0004\u0000\u0000\u0ef7\u0ef8\u0005\u0005\u0000"+
		"\u0000\u0ef8\u0ef9\u0005\u0003\u0000\u0000\u0ef9\u0efa\u0005\t\u0000\u0000"+
		"\u0efa\u0efb\u0005\u0004\u0000\u0000\u0efb\u0efc\u0005\u0005\u0000\u0000"+
		"\u0efc\u0efd\u0005\u0003\u0000\u0000\u0efd\u0efe\u0005\t\u0000\u0000\u0efe"+
		"\u0eff\u0005\u0004\u0000\u0000\u0eff\u0f00\u0005\u0005\u0000\u0000\u0f00"+
		"\u0f01\u0005\u0003\u0000\u0000\u0f01\u0f02\u0005\b\u0000\u0000\u0f02\u0f03"+
		"\u0005\n\u0000\u0000\u0f03\u0f04\u0005\u0004\u0000\u0000\u0f04\u0f05\u0005"+
		"\u0005\u0000\u0000\u0f05\u0f06\u0005\u0003\u0000\u0000\u0f06\u0f07\u0005"+
		"\u0006\u0000\u0000\u0f07\u0f08\u0005\u0004\u0000\u0000\u0f08\u0f09\u0005"+
		"\n\u0000\u0000\u0f09\u0f0a\u0005\u0003\u0000\u0000\u0f0a\u0f0b\u0005\n"+
		"\u0000\u0000\u0f0b\u0f0c\u0005\u0003\u0000\u0000\u0f0c\u0f0d\u0005\u0006"+
		"\u0000\u0000\u0f0d\u0f0e\u0005\u0004\u0000\u0000\u0f0e\u0f0f\u0006\u0014"+
		"\uffff\uffff\u0000\u0f0f\u0f11\u0001\u0000\u0000\u0000\u0f10\u0ed7\u0001"+
		"\u0000\u0000\u0000\u0f11\u0f12\u0001\u0000\u0000\u0000\u0f12\u0f10\u0001"+
		"\u0000\u0000\u0000\u0f12\u0f13\u0001\u0000\u0000\u0000\u0f13\u0f14\u0001"+
		"\u0000\u0000\u0000\u0f14\u0f15\u0005\u0005\u0000\u0000\u0f15\u0f16\u0005"+
		"\u0003\u0000\u0000\u0f16\u0f17\u0005\n\u0000\u0000\u0f17\u0f18\u0005\n"+
		"\u0000\u0000\u0f18\u0f19\u0005\u0003\u0000\u0000\u0f19\u0f1a\u0005\n\u0000"+
		"\u0000\u0f1a\u0f1b\u0005\u0003\u0000\u0000\u0f1b\u0f1c\u0005\n\u0000\u0000"+
		"\u0f1c\u0f1d\u0005\u0003\u0000\u0000\u0f1d\u0f1e\u0005\n\u0000\u0000\u0f1e"+
		"\u0f1f\u0005\u0004\u0000\u0000\u0f1f)\u0001\u0000\u0000\u0000\u0f20\u0f21"+
		"\u0005\u0005\u0000\u0000\u0f21\u0f22\u0005\u0003\u0000\u0000\u0f22\u0f23"+
		"\u0005\n\u0000\u0000\u0f23\u0f24\u0005\u0003\u0000\u0000\u0f24\u0f25\u0005"+
		"\n\u0000\u0000\u0f25\u0f26\u0005\n\u0000\u0000\u0f26\u0f27\u0005\n\u0000"+
		"\u0000\u0f27\u0f28\u0005\u0003\u0000\u0000\u0f28\u0f29\u0005\n\u0000\u0000"+
		"\u0f29\u0f2a\u0005\u0003\u0000\u0000\u0f2a\u0f2b\u0005\n\u0000\u0000\u0f2b"+
		"\u0f70\u0005\u0004\u0000\u0000\u0f2c\u0f2d\u0005\n\u0000\u0000\u0f2d\u0f2e"+
		"\u0005\u0003\u0000\u0000\u0f2e\u0f2f\u0005\u0004\u0000\u0000\u0f2f\u0f30"+
		"\u0005\n\u0000\u0000\u0f30\u0f31\u0005\u0003\u0000\u0000\u0f31\u0f32\u0005"+
		"\n\u0000\u0000\u0f32\u0f33\u0005\u0003\u0000\u0000\u0f33\u0f34\u0005\n"+
		"\u0000\u0000\u0f34\u0f35\u0005\u0003\u0000\u0000\u0f35\u0f36\u0005\n\u0000"+
		"\u0000\u0f36\u0f37\u0005\u0003\u0000\u0000\u0f37\u0f38\u0005\n\u0000\u0000"+
		"\u0f38\u0f39\u0005\u0003\u0000\u0000\u0f39\u0f3a\u0005\n\u0000\u0000\u0f3a"+
		"\u0f3b\u0005\u0003\u0000\u0000\u0f3b\u0f3c\u0005\n\u0000\u0000\u0f3c\u0f3d"+
		"\u0005\u0003\u0000\u0000\u0f3d\u0f3e\u0005\n\u0000\u0000\u0f3e\u0f3f\u0005"+
		"\u0003\u0000\u0000\u0f3f\u0f40\u0005\n\u0000\u0000\u0f40\u0f41\u0005\u0003"+
		"\u0000\u0000\u0f41\u0f42\u0005\n\u0000\u0000\u0f42\u0f43\u0005\u0003\u0000"+
		"\u0000\u0f43\u0f44\u0005\n\u0000\u0000\u0f44\u0f45\u0005\u0003\u0000\u0000"+
		"\u0f45\u0f65\u0005\u0004\u0000\u0000\u0f46\u0f47\u0005\n\u0000\u0000\u0f47"+
		"\u0f48\u0005\u0003\u0000\u0000\u0f48\u0f49\u0005\b\u0000\u0000\u0f49\u0f4b"+
		"\u0005\u0003\u0000\u0000\u0f4a\u0f4c\u0005\b\u0000\u0000\u0f4b\u0f4a\u0001"+
		"\u0000\u0000\u0000\u0f4b\u0f4c\u0001\u0000\u0000\u0000\u0f4c\u0f4d\u0001"+
		"\u0000\u0000\u0000\u0f4d\u0f4f\u0005\u0003\u0000\u0000\u0f4e\u0f50\u0003"+
		"2\u0019\u0000\u0f4f\u0f4e\u0001\u0000\u0000\u0000\u0f50\u0f51\u0001\u0000"+
		"\u0000\u0000\u0f51\u0f4f\u0001\u0000\u0000\u0000\u0f51\u0f52\u0001\u0000"+
		"\u0000\u0000\u0f52\u0f53\u0001\u0000\u0000\u0000\u0f53\u0f54\u0005\u0003"+
		"\u0000\u0000\u0f54\u0f55\u0005\n\u0000\u0000\u0f55\u0f56\u0005\u0003\u0000"+
		"\u0000\u0f56\u0f57\u0005\n\u0000\u0000\u0f57\u0f58\u0005\u0003\u0000\u0000"+
		"\u0f58\u0f59\u0005\b\u0000\u0000\u0f59\u0f5a\u0005\u0003\u0000\u0000\u0f5a"+
		"\u0f5b\u0005\b\u0000\u0000\u0f5b\u0f5c\u0005\u0003\u0000\u0000\u0f5c\u0f5d"+
		"\u0005\b\u0000\u0000\u0f5d\u0f5e\u0005\u0003\u0000\u0000\u0f5e\u0f5f\u0005"+
		"\b\u0000\u0000\u0f5f\u0f60\u0005\u0003\u0000\u0000\u0f60\u0f61\u0005\b"+
		"\u0000\u0000\u0f61\u0f62\u0005\u0003\u0000\u0000\u0f62\u0f63\u0005\u0004"+
		"\u0000\u0000\u0f63\u0f64\u0006\u0015\uffff\uffff\u0000\u0f64\u0f66\u0001"+
		"\u0000\u0000\u0000\u0f65\u0f46\u0001\u0000\u0000\u0000\u0f66\u0f67\u0001"+
		"\u0000\u0000\u0000\u0f67\u0f65\u0001\u0000\u0000\u0000\u0f67\u0f68\u0001"+
		"\u0000\u0000\u0000\u0f68\u0f69\u0001\u0000\u0000\u0000\u0f69\u0f6a\u0005"+
		"\n\u0000\u0000\u0f6a\u0f6b\u0005\u0003\u0000\u0000\u0f6b\u0f6c\u0005\n"+
		"\u0000\u0000\u0f6c\u0f6d\u0005\u0003\u0000\u0000\u0f6d\u0f6e\u0005\u0006"+
		"\u0000\u0000\u0f6e\u0f6f\u0005\u0004\u0000\u0000\u0f6f\u0f71\u0001\u0000"+
		"\u0000\u0000\u0f70\u0f2c\u0001\u0000\u0000\u0000\u0f71\u0f72\u0001\u0000"+
		"\u0000\u0000\u0f72\u0f70\u0001\u0000\u0000\u0000\u0f72\u0f73\u0001\u0000"+
		"\u0000\u0000\u0f73\u0f74\u0001\u0000\u0000\u0000\u0f74\u0f75\u0005\u0005"+
		"\u0000\u0000\u0f75\u0f76\u0005\u0003\u0000\u0000\u0f76\u0f77\u0005\n\u0000"+
		"\u0000\u0f77\u0f78\u0005\u0003\u0000\u0000\u0f78\u0f79\u0005\n\u0000\u0000"+
		"\u0f79\u0f7a\u0005\n\u0000\u0000\u0f7a\u0f7b\u0005\n\u0000\u0000\u0f7b"+
		"\u0f7c\u0005\u0003\u0000\u0000\u0f7c\u0f7d\u0005\n\u0000\u0000\u0f7d\u0f7e"+
		"\u0005\u0003\u0000\u0000\u0f7e\u0f7f\u0005\n\u0000\u0000\u0f7f\u0f80\u0005"+
		"\u0004\u0000\u0000\u0f80+\u0001\u0000\u0000\u0000\u0f81\u0f82\u0005\u0005"+
		"\u0000\u0000\u0f82\u0f83\u0005\u0003\u0000\u0000\u0f83\u0f84\u0005\n\u0000"+
		"\u0000\u0f84\u0f85\u0005\n\u0000\u0000\u0f85\u0f86\u0005\u0003\u0000\u0000"+
		"\u0f86\u0f87\u0005\n\u0000\u0000\u0f87\u0f88\u0005\u0003\u0000\u0000\u0f88"+
		"\u0f89\u0005\n\u0000\u0000\u0f89\u0fdb\u0005\u0004\u0000\u0000\u0f8a\u0f8b"+
		"\u0005\u0005\u0000\u0000\u0f8b\u0f8c\u0005\u0003\u0000\u0000\u0f8c\u0f8d"+
		"\u0005\b\u0000\u0000\u0f8d\u0f91\u0005\u0003\u0000\u0000\u0f8e\u0f90\u0003"+
		"2\u0019\u0000\u0f8f\u0f8e\u0001\u0000\u0000\u0000\u0f90\u0f93\u0001\u0000"+
		"\u0000\u0000\u0f91\u0f8f\u0001\u0000\u0000\u0000\u0f91\u0f92\u0001\u0000"+
		"\u0000\u0000\u0f92\u0f94\u0001\u0000\u0000\u0000\u0f93\u0f91\u0001\u0000"+
		"\u0000\u0000\u0f94\u0f95\u0005\u0004\u0000\u0000\u0f95\u0f97\u00032\u0019"+
		"\u0000\u0f96\u0f98\u00032\u0019\u0000\u0f97\u0f96\u0001\u0000\u0000\u0000"+
		"\u0f97\u0f98\u0001\u0000\u0000\u0000\u0f98\u0f9a\u0001\u0000\u0000\u0000"+
		"\u0f99\u0f9b\u00032\u0019\u0000\u0f9a\u0f99\u0001\u0000\u0000\u0000\u0f9a"+
		"\u0f9b\u0001\u0000\u0000\u0000\u0f9b\u0f9d\u0001\u0000\u0000\u0000\u0f9c"+
		"\u0f9e\u00032\u0019\u0000\u0f9d\u0f9c\u0001\u0000\u0000\u0000\u0f9d\u0f9e"+
		"\u0001\u0000\u0000\u0000\u0f9e\u0fa0\u0001\u0000\u0000\u0000\u0f9f\u0fa1"+
		"\u00032\u0019\u0000\u0fa0\u0f9f\u0001\u0000\u0000\u0000\u0fa0\u0fa1\u0001"+
		"\u0000\u0000\u0000\u0fa1\u0fa3\u0001\u0000\u0000\u0000\u0fa2\u0fa4\u0003"+
		"2\u0019\u0000\u0fa3\u0fa2\u0001\u0000\u0000\u0000\u0fa3\u0fa4\u0001\u0000"+
		"\u0000\u0000\u0fa4\u0fa6\u0001\u0000\u0000\u0000\u0fa5\u0fa7\u00032\u0019"+
		"\u0000\u0fa6\u0fa5\u0001\u0000\u0000\u0000\u0fa6\u0fa7\u0001\u0000\u0000"+
		"\u0000\u0fa7\u0fab\u0001\u0000\u0000\u0000\u0fa8\u0faa\u00032\u0019\u0000"+
		"\u0fa9\u0fa8\u0001\u0000\u0000\u0000\u0faa\u0fad\u0001\u0000\u0000\u0000"+
		"\u0fab\u0fa9\u0001\u0000\u0000\u0000\u0fab\u0fac\u0001\u0000\u0000\u0000"+
		"\u0fac\u0fae\u0001\u0000\u0000\u0000\u0fad\u0fab\u0001\u0000\u0000\u0000"+
		"\u0fae\u0faf\u0005\u0004\u0000\u0000\u0faf\u0fb1\u00032\u0019\u0000\u0fb0"+
		"\u0fb2\u00032\u0019\u0000\u0fb1\u0fb0\u0001\u0000\u0000\u0000\u0fb1\u0fb2"+
		"\u0001\u0000\u0000\u0000\u0fb2\u0fb4\u0001\u0000\u0000\u0000\u0fb3\u0fb5"+
		"\u00032\u0019\u0000\u0fb4\u0fb3\u0001\u0000\u0000\u0000\u0fb4\u0fb5\u0001"+
		"\u0000\u0000\u0000\u0fb5\u0fb7\u0001\u0000\u0000\u0000\u0fb6\u0fb8\u0003"+
		"2\u0019\u0000\u0fb7\u0fb6\u0001\u0000\u0000\u0000\u0fb7\u0fb8\u0001\u0000"+
		"\u0000\u0000\u0fb8\u0fba\u0001\u0000\u0000\u0000\u0fb9\u0fbb\u00032\u0019"+
		"\u0000\u0fba\u0fb9\u0001\u0000\u0000\u0000\u0fba\u0fbb\u0001\u0000\u0000"+
		"\u0000\u0fbb\u0fbd\u0001\u0000\u0000\u0000\u0fbc\u0fbe\u00032\u0019\u0000"+
		"\u0fbd\u0fbc\u0001\u0000\u0000\u0000\u0fbd\u0fbe\u0001\u0000\u0000\u0000"+
		"\u0fbe\u0fc0\u0001\u0000\u0000\u0000\u0fbf\u0fc1\u00032\u0019\u0000\u0fc0"+
		"\u0fbf\u0001\u0000\u0000\u0000\u0fc0\u0fc1\u0001\u0000\u0000\u0000\u0fc1"+
		"\u0fc5\u0001\u0000\u0000\u0000\u0fc2\u0fc4\u00032\u0019\u0000\u0fc3\u0fc2"+
		"\u0001\u0000\u0000\u0000\u0fc4\u0fc7\u0001\u0000\u0000\u0000\u0fc5\u0fc3"+
		"\u0001\u0000\u0000\u0000\u0fc5\u0fc6\u0001\u0000\u0000\u0000\u0fc6\u0fc8"+
		"\u0001\u0000\u0000\u0000\u0fc7\u0fc5\u0001\u0000\u0000\u0000\u0fc8\u0fc9"+
		"\u0005\u0004\u0000\u0000\u0fc9\u0fcd\u0005\u0006\u0000\u0000\u0fca\u0fcc"+
		"\u0005\n\u0000\u0000\u0fcb\u0fca\u0001\u0000\u0000\u0000\u0fcc\u0fcf\u0001"+
		"\u0000\u0000\u0000\u0fcd\u0fcb\u0001\u0000\u0000\u0000\u0fcd\u0fce\u0001"+
		"\u0000\u0000\u0000\u0fce\u0fd0\u0001\u0000\u0000\u0000\u0fcf\u0fcd\u0001"+
		"\u0000\u0000\u0000\u0fd0\u0fd1\u0005\u0004\u0000\u0000\u0fd1\u0fd2\u0003"+
		"2\u0019\u0000\u0fd2\u0fd3\u0005\u0004\u0000\u0000\u0fd3\u0fd4\u0005\n"+
		"\u0000\u0000\u0fd4\u0fd5\u0005\u0003\u0000\u0000\u0fd5\u0fd6\u0005\n\u0000"+
		"\u0000\u0fd6\u0fd7\u0005\u0003\u0000\u0000\u0fd7\u0fd8\u0005\u0006\u0000"+
		"\u0000\u0fd8\u0fd9\u0005\u0004\u0000\u0000\u0fd9\u0fda\u0006\u0016\uffff"+
		"\uffff\u0000\u0fda\u0fdc\u0001\u0000\u0000\u0000\u0fdb\u0f8a\u0001\u0000"+
		"\u0000\u0000\u0fdc\u0fdd\u0001\u0000\u0000\u0000\u0fdd\u0fdb\u0001\u0000"+
		"\u0000\u0000\u0fdd\u0fde\u0001\u0000\u0000\u0000\u0fde\u0fdf\u0001\u0000"+
		"\u0000\u0000\u0fdf\u0fe0\u0005\u0005\u0000\u0000\u0fe0\u0fe1\u0005\u0003"+
		"\u0000\u0000\u0fe1\u0fe2\u0005\n\u0000\u0000\u0fe2\u0fe3\u0005\n\u0000"+
		"\u0000\u0fe3\u0fe4\u0005\u0003\u0000\u0000\u0fe4\u0fe5\u0005\n\u0000\u0000"+
		"\u0fe5\u0fe6\u0005\u0003\u0000\u0000\u0fe6\u0fe7\u0005\n\u0000\u0000\u0fe7"+
		"\u0fe8\u0005\u0004\u0000\u0000\u0fe8-\u0001\u0000\u0000\u0000\u0fe9\u0fea"+
		"\u0005\u0005\u0000\u0000\u0fea\u0feb\u0005\u0003\u0000\u0000\u0feb\u0fec"+
		"\u0005\n\u0000\u0000\u0fec\u0fed\u0005\n\u0000\u0000\u0fed\u0fee\u0005"+
		"\n\u0000\u0000\u0fee\u0fef\u0005\u0003\u0000\u0000\u0fef\u0ff0\u0005\n"+
		"\u0000\u0000\u0ff0\u0ff1\u0005\n\u0000\u0000\u0ff1\u0ff2\u0005\n\u0000"+
		"\u0000\u0ff2\u0ff3\u0005\u0003\u0000\u0000\u0ff3\u0ff4\u0005\n\u0000\u0000"+
		"\u0ff4\u0ff5\u0005\u0003\u0000\u0000\u0ff5\u0ff6\u0005\n\u0000\u0000\u0ff6"+
		"\u105f\u0005\u0004\u0000\u0000\u0ff7\u0ff8\u0005\n\u0000\u0000\u0ff8\u0ffa"+
		"\u0005\u0003\u0000\u0000\u0ff9\u0ffb\u0005\n\u0000\u0000\u0ffa\u0ff9\u0001"+
		"\u0000\u0000\u0000\u0ffa\u0ffb\u0001\u0000\u0000\u0000\u0ffb\u0ffc\u0001"+
		"\u0000\u0000\u0000\u0ffc\u0ffd\u0005\u0003\u0000\u0000\u0ffd\u0ffe\u0005"+
		"\n\u0000\u0000\u0ffe\u0fff\u0005\u0003\u0000\u0000\u0fff\u1000\u0005\n"+
		"\u0000\u0000\u1000\u1001\u0005\u0003\u0000\u0000\u1001\u1002\u0005\n\u0000"+
		"\u0000\u1002\u1003\u0005\u0003\u0000\u0000\u1003\u1004\u0005\n\u0000\u0000"+
		"\u1004\u1005\u0005\u0003\u0000\u0000\u1005\u1006\u0005\n\u0000\u0000\u1006"+
		"\u1007\u0005\u0003\u0000\u0000\u1007\u1008\u0005\n\u0000\u0000\u1008\u1009"+
		"\u0005\u0003\u0000\u0000\u1009\u100a\u0005\n\u0000\u0000\u100a\u100b\u0005"+
		"\u0003\u0000\u0000\u100b\u100c\u0005\n\u0000\u0000\u100c\u100d\u0005\u0003"+
		"\u0000\u0000\u100d\u1055\u0005\u0004\u0000\u0000\u100e\u100f\u0005\u0003"+
		"\u0000\u0000\u100f\u1010\u0005\u0003\u0000\u0000\u1010\u1011\u0005\u0003"+
		"\u0000\u0000\u1011\u1012\u0005\u0003\u0000\u0000\u1012\u1013\u0005\u0003"+
		"\u0000\u0000\u1013\u1014\u0005\u0003\u0000\u0000\u1014\u1015\u0005\u0003"+
		"\u0000\u0000\u1015\u1016\u0005\u0003\u0000\u0000\u1016\u1017\u0005\u0003"+
		"\u0000\u0000\u1017\u1018\u0005\u0003\u0000\u0000\u1018\u1056\u0005\u0004"+
		"\u0000\u0000\u1019\u101b\u00032\u0019\u0000\u101a\u101c\u00032\u0019\u0000"+
		"\u101b\u101a\u0001\u0000\u0000\u0000\u101b\u101c\u0001\u0000\u0000\u0000"+
		"\u101c\u101e\u0001\u0000\u0000\u0000\u101d\u101f\u00032\u0019\u0000\u101e"+
		"\u101d\u0001\u0000\u0000\u0000\u101e\u101f\u0001\u0000\u0000\u0000\u101f"+
		"\u1021\u0001\u0000\u0000\u0000\u1020\u1022\u00032\u0019\u0000\u1021\u1020"+
		"\u0001\u0000\u0000\u0000\u1021\u1022\u0001\u0000\u0000\u0000\u1022\u1024"+
		"\u0001\u0000\u0000\u0000\u1023\u1025\u00032\u0019\u0000\u1024\u1023\u0001"+
		"\u0000\u0000\u0000\u1024\u1025\u0001\u0000\u0000\u0000\u1025\u1027\u0001"+
		"\u0000\u0000\u0000\u1026\u1028\u00032\u0019\u0000\u1027\u1026\u0001\u0000"+
		"\u0000\u0000\u1027\u1028\u0001\u0000\u0000\u0000\u1028\u102a\u0001\u0000"+
		"\u0000\u0000\u1029\u102b\u00032\u0019\u0000\u102a\u1029\u0001\u0000\u0000"+
		"\u0000\u102a\u102b\u0001\u0000\u0000\u0000\u102b\u102f\u0001\u0000\u0000"+
		"\u0000\u102c\u102e\u00032\u0019\u0000\u102d\u102c\u0001\u0000\u0000\u0000"+
		"\u102e\u1031\u0001\u0000\u0000\u0000\u102f\u102d\u0001\u0000\u0000\u0000"+
		"\u102f\u1030\u0001\u0000\u0000\u0000\u1030\u1032\u0001\u0000\u0000\u0000"+
		"\u1031\u102f\u0001\u0000\u0000\u0000\u1032\u1033\u0005\u0003\u0000\u0000"+
		"\u1033\u1034\u0005\n\u0000\u0000\u1034\u1035\u0005\u0003\u0000\u0000\u1035"+
		"\u1036\u0005\n\u0000\u0000\u1036\u103a\u0005\u0003\u0000\u0000\u1037\u1039"+
		"\u00032\u0019\u0000\u1038\u1037\u0001\u0000\u0000\u0000\u1039\u103c\u0001"+
		"\u0000\u0000\u0000\u103a\u1038\u0001\u0000\u0000\u0000\u103a\u103b\u0001"+
		"\u0000\u0000\u0000\u103b\u103d\u0001\u0000\u0000\u0000\u103c\u103a\u0001"+
		"\u0000\u0000\u0000\u103d\u103f\u0005\u0003\u0000\u0000\u103e\u1040\u0005"+
		"\u0006\u0000\u0000\u103f\u103e\u0001\u0000\u0000\u0000\u103f\u1040\u0001"+
		"\u0000\u0000\u0000\u1040\u1041\u0001\u0000\u0000\u0000\u1041\u1042\u0005"+
		"\u0003\u0000\u0000\u1042\u1043\u0005\u0006\u0000\u0000\u1043\u1045\u0005"+
		"\u0003\u0000\u0000\u1044\u1046\u0005\n\u0000\u0000\u1045\u1044\u0001\u0000"+
		"\u0000\u0000\u1045\u1046\u0001\u0000\u0000\u0000\u1046\u1047\u0001\u0000"+
		"\u0000\u0000\u1047\u1048\u0005\u0003\u0000\u0000\u1048\u1049\u0005\b\u0000"+
		"\u0000\u1049\u104b\u0005\u0003\u0000\u0000\u104a\u104c\u0005\b\u0000\u0000"+
		"\u104b\u104a\u0001\u0000\u0000\u0000\u104b\u104c\u0001\u0000\u0000\u0000"+
		"\u104c\u104d\u0001\u0000\u0000\u0000\u104d\u104f\u0005\u0003\u0000\u0000"+
		"\u104e\u1050\u0005\b\u0000\u0000\u104f\u104e\u0001\u0000\u0000\u0000\u104f"+
		"\u1050\u0001\u0000\u0000\u0000\u1050\u1051\u0001\u0000\u0000\u0000\u1051"+
		"\u1052\u0005\u0003\u0000\u0000\u1052\u1053\u0005\u0004\u0000\u0000\u1053"+
		"\u1054\u0006\u0017\uffff\uffff\u0000\u1054\u1056\u0001\u0000\u0000\u0000"+
		"\u1055\u100e\u0001\u0000\u0000\u0000\u1055\u1019\u0001\u0000\u0000\u0000"+
		"\u1056\u1057\u0001\u0000\u0000\u0000\u1057\u1055\u0001\u0000\u0000\u0000"+
		"\u1057\u1058\u0001\u0000\u0000\u0000\u1058\u1059\u0001\u0000\u0000\u0000"+
		"\u1059\u105a\u0005\n\u0000\u0000\u105a\u105b\u0005\u0003\u0000\u0000\u105b"+
		"\u105c\u0005\n\u0000\u0000\u105c\u105d\u0005\u0003\u0000\u0000\u105d\u105e"+
		"\u0005\u0006\u0000\u0000\u105e\u1060\u0005\u0004\u0000\u0000\u105f\u0ff7"+
		"\u0001\u0000\u0000\u0000\u1060\u1061\u0001\u0000\u0000\u0000\u1061\u105f"+
		"\u0001\u0000\u0000\u0000\u1061\u1062\u0001\u0000\u0000\u0000\u1062\u1063"+
		"\u0001\u0000\u0000\u0000\u1063\u1064\u0005\u0005\u0000\u0000\u1064\u1065"+
		"\u0005\u0003\u0000\u0000\u1065\u1066\u0005\n\u0000\u0000\u1066\u1067\u0005"+
		"\n\u0000\u0000\u1067\u1068\u0005\n\u0000\u0000\u1068\u1069\u0005\u0003"+
		"\u0000\u0000\u1069\u106a\u0005\n\u0000\u0000\u106a\u106b\u0005\n\u0000"+
		"\u0000\u106b\u106c\u0005\n\u0000\u0000\u106c\u106d\u0005\u0003\u0000\u0000"+
		"\u106d\u106e\u0005\n\u0000\u0000\u106e\u106f\u0005\u0003\u0000\u0000\u106f"+
		"\u1070\u0005\n\u0000\u0000\u1070\u1071\u0005\u0004\u0000\u0000\u1071/"+
		"\u0001\u0000\u0000\u0000\u1072\u1073\u0005\u0005\u0000\u0000\u1073\u1074"+
		"\u0005\u0003\u0000\u0000\u1074\u1075\u0005\n\u0000\u0000\u1075\u1076\u0005"+
		"\u0003\u0000\u0000\u1076\u1077\u0005\n\u0000\u0000\u1077\u1078\u0005\n"+
		"\u0000\u0000\u1078\u1079\u0005\n\u0000\u0000\u1079\u107a\u0005\u0003\u0000"+
		"\u0000\u107a\u107b\u0005\n\u0000\u0000\u107b\u107c\u0005\u0003\u0000\u0000"+
		"\u107c\u107d\u0005\n\u0000\u0000\u107d\u10fc\u0005\u0004\u0000\u0000\u107e"+
		"\u107f\u0005\n\u0000\u0000\u107f\u1080\u0005\u0003\u0000\u0000\u1080\u1081"+
		"\u0005\n\u0000\u0000\u1081\u1082\u0005\u0004\u0000\u0000\u1082\u1083\u0005"+
		"\n\u0000\u0000\u1083\u1084\u0005\u0003\u0000\u0000\u1084\u1085\u0005\n"+
		"\u0000\u0000\u1085\u1086\u0005\u0004\u0000\u0000\u1086\u1087\u0005\n\u0000"+
		"\u0000\u1087\u1088\u0005\u0003\u0000\u0000\u1088\u1089\u0005\n\u0000\u0000"+
		"\u1089\u108a\u0005\u0003\u0000\u0000\u108a\u108b\u0005\n\u0000\u0000\u108b"+
		"\u108c\u0005\u0003\u0000\u0000\u108c\u108d\u0005\n\u0000\u0000\u108d\u108e"+
		"\u0005\u0003\u0000\u0000\u108e\u108f\u0005\n\u0000\u0000\u108f\u1090\u0005"+
		"\u0003\u0000\u0000\u1090\u1091\u0005\n\u0000\u0000\u1091\u1092\u0005\u0003"+
		"\u0000\u0000\u1092\u1093\u0005\n\u0000\u0000\u1093\u1094\u0005\u0003\u0000"+
		"\u0000\u1094\u1095\u0005\n\u0000\u0000\u1095\u1096\u0005\u0003\u0000\u0000"+
		"\u1096\u1097\u0005\n\u0000\u0000\u1097\u1098\u0005\u0003\u0000\u0000\u1098"+
		"\u1099\u0005\n\u0000\u0000\u1099\u109a\u0005\u0003\u0000\u0000\u109a\u109b"+
		"\u0005\n\u0000\u0000\u109b\u109c\u0005\u0003\u0000\u0000\u109c\u109d\u0005"+
		"\n\u0000\u0000\u109d\u109e\u0005\u0003\u0000\u0000\u109e\u109f\u0005\u0004"+
		"\u0000\u0000\u109f\u10a0\u0005\n\u0000\u0000\u10a0\u10a1\u0005\u0003\u0000"+
		"\u0000\u10a1\u10a2\u0005\n\u0000\u0000\u10a2\u10a3\u0005\u0003\u0000\u0000"+
		"\u10a3\u10a4\u0005\n\u0000\u0000\u10a4\u10a5\u0005\u0003\u0000\u0000\u10a5"+
		"\u10a6\u0005\n\u0000\u0000\u10a6\u10a7\u0005\u0003\u0000\u0000\u10a7\u10a8"+
		"\u0005\n\u0000\u0000\u10a8\u10a9\u0005\u0003\u0000\u0000\u10a9\u10aa\u0005"+
		"\n\u0000\u0000\u10aa\u10ab\u0005\u0003\u0000\u0000\u10ab\u10ee\u0005\u0004"+
		"\u0000\u0000\u10ac\u10ad\u0005\u0003\u0000\u0000\u10ad\u10ae\u0005\u0003"+
		"\u0000\u0000\u10ae\u10af\u0005\u0003\u0000\u0000\u10af\u10b0\u0005\u0003"+
		"\u0000\u0000\u10b0\u10b1\u0005\u0003\u0000\u0000\u10b1\u10b2\u0005\u0003"+
		"\u0000\u0000\u10b2\u10b3\u0005\u0003\u0000\u0000\u10b3\u10b4\u0005\u0003"+
		"\u0000\u0000\u10b4\u10b5\u0005\u0003\u0000\u0000\u10b5\u10b6\u0005\u0003"+
		"\u0000\u0000\u10b6\u10b7\u0005\u0003\u0000\u0000\u10b7\u10b8\u0005\u0003"+
		"\u0000\u0000\u10b8\u10b9\u0005\u0003\u0000\u0000\u10b9\u10ba\u0005\u0003"+
		"\u0000\u0000\u10ba\u10bb\u0005\u0003\u0000\u0000\u10bb\u10bc\u0005\u0003"+
		"\u0000\u0000\u10bc\u10bd\u0005\u0003\u0000\u0000\u10bd\u10ef\u0005\u0004"+
		"\u0000\u0000\u10be\u10bf\u0005\u0006\u0000\u0000\u10bf\u10c1\u0005\u0003"+
		"\u0000\u0000\u10c0\u10c2\u0005\u0006\u0000\u0000\u10c1\u10c0\u0001\u0000"+
		"\u0000\u0000\u10c1\u10c2\u0001\u0000\u0000\u0000\u10c2\u10c3\u0001\u0000"+
		"\u0000\u0000\u10c3\u10c5\u0005\u0003\u0000\u0000\u10c4\u10c6\u0005\u0006"+
		"\u0000\u0000\u10c5\u10c4\u0001\u0000\u0000\u0000\u10c5\u10c6\u0001\u0000"+
		"\u0000\u0000\u10c6\u10c7\u0001\u0000\u0000\u0000\u10c7\u10c8\u0005\u0003"+
		"\u0000\u0000\u10c8\u10c9\u0005\b\u0000\u0000\u10c9\u10cb\u0005\u0003\u0000"+
		"\u0000\u10ca\u10cc\u00032\u0019\u0000\u10cb\u10ca\u0001\u0000\u0000\u0000"+
		"\u10cc\u10cd\u0001\u0000\u0000\u0000\u10cd\u10cb\u0001\u0000\u0000\u0000"+
		"\u10cd\u10ce\u0001\u0000\u0000\u0000\u10ce\u10cf\u0001\u0000\u0000\u0000"+
		"\u10cf\u10d0\u0005\u0003\u0000\u0000\u10d0\u10d1\u0005\n\u0000\u0000\u10d1"+
		"\u10d2\u0005\u0003\u0000\u0000\u10d2\u10d3\u0005\n\u0000\u0000\u10d3\u10d4"+
		"\u0005\u0003\u0000\u0000\u10d4\u10d5\u0005\n\u0000\u0000\u10d5\u10d6\u0005"+
		"\u0003\u0000\u0000\u10d6\u10d7\u0005\n\u0000\u0000\u10d7\u10d8\u0005\u0003"+
		"\u0000\u0000\u10d8\u10d9\u0005\b\u0000\u0000\u10d9\u10db\u0005\u0003\u0000"+
		"\u0000\u10da\u10dc\u0005\b\u0000\u0000\u10db\u10da\u0001\u0000\u0000\u0000"+
		"\u10db\u10dc\u0001\u0000\u0000\u0000\u10dc\u10dd\u0001\u0000\u0000\u0000"+
		"\u10dd\u10de\u0005\u0003\u0000\u0000\u10de\u10df\u0005\b\u0000\u0000\u10df"+
		"\u10e0\u0005\u0003\u0000\u0000\u10e0\u10e1\u0005\b\u0000\u0000\u10e1\u10e3"+
		"\u0005\u0003\u0000\u0000\u10e2\u10e4\u0005\b\u0000\u0000\u10e3\u10e2\u0001"+
		"\u0000\u0000\u0000\u10e3\u10e4\u0001\u0000\u0000\u0000\u10e4\u10e5\u0001"+
		"\u0000\u0000\u0000\u10e5\u10e6\u0005\u0003\u0000\u0000\u10e6\u10e7\u0005"+
		"\u0003\u0000\u0000\u10e7\u10e8\u0005\b\u0000\u0000\u10e8\u10e9\u0005\u0003"+
		"\u0000\u0000\u10e9\u10ea\u0005\b\u0000\u0000\u10ea\u10eb\u0005\u0003\u0000"+
		"\u0000\u10eb\u10ec\u0005\u0004\u0000\u0000\u10ec\u10ed\u0006\u0018\uffff"+
		"\uffff\u0000\u10ed\u10ef\u0001\u0000\u0000\u0000\u10ee\u10ac\u0001\u0000"+
		"\u0000\u0000\u10ee\u10be\u0001\u0000\u0000\u0000\u10ef\u10f0\u0001\u0000"+
		"\u0000\u0000\u10f0\u10ee\u0001\u0000\u0000\u0000\u10f0\u10f1\u0001\u0000"+
		"\u0000\u0000\u10f1\u10f3\u0001\u0000\u0000\u0000\u10f2\u107e\u0001\u0000"+
		"\u0000\u0000\u10f3\u10f4\u0001\u0000\u0000\u0000\u10f4\u10f2\u0001\u0000"+
		"\u0000\u0000\u10f4\u10f5\u0001\u0000\u0000\u0000\u10f5\u10f6\u0001\u0000"+
		"\u0000\u0000\u10f6\u10f7\u0005\n\u0000\u0000\u10f7\u10f8\u0005\u0003\u0000"+
		"\u0000\u10f8\u10f9\u0005\n\u0000\u0000\u10f9\u10fa\u0005\u0003\u0000\u0000"+
		"\u10fa\u10fb\u0005\u0006\u0000\u0000\u10fb\u10fd\u0005\u0004\u0000\u0000"+
		"\u10fc\u10f2\u0001\u0000\u0000\u0000\u10fd\u10fe\u0001\u0000\u0000\u0000"+
		"\u10fe\u10fc\u0001\u0000\u0000\u0000\u10fe\u10ff\u0001\u0000\u0000\u0000"+
		"\u10ff\u1100\u0001\u0000\u0000\u0000\u1100\u1101\u0005\u0005\u0000\u0000"+
		"\u1101\u1102\u0005\u0003\u0000\u0000\u1102\u1103\u0005\n\u0000\u0000\u1103"+
		"\u1104\u0005\u0003\u0000\u0000\u1104\u1105\u0005\n\u0000\u0000\u1105\u1106"+
		"\u0005\n\u0000\u0000\u1106\u1107\u0005\n\u0000\u0000\u1107\u1108\u0005"+
		"\u0003\u0000\u0000\u1108\u1109\u0005\n\u0000\u0000\u1109\u110a\u0005\u0003"+
		"\u0000\u0000\u110a\u110b\u0005\n\u0000\u0000\u110b\u110c\u0005\u0004\u0000"+
		"\u0000\u110c1\u0001\u0000\u0000\u0000\u110d\u110e\u0007\u0000\u0000\u0000"+
		"\u110e3\u0001\u0000\u0000\u0000\u110f\u1112\u00032\u0019\u0000\u1110\u1112"+
		"\u0005\u0003\u0000\u0000\u1111\u110f\u0001\u0000\u0000\u0000\u1111\u1110"+
		"\u0001\u0000\u0000\u0000\u1112\u1113\u0001\u0000\u0000\u0000\u1113\u1111"+
		"\u0001\u0000\u0000\u0000\u1113\u1114\u0001\u0000\u0000\u0000\u1114\u1115"+
		"\u0001\u0000\u0000\u0000\u1115\u1116\u0005\u0004\u0000\u0000\u11165\u0001"+
		"\u0000\u0000\u0000\u1117\u111b\u00032\u0019\u0000\u1118\u111b\u0005\u0003"+
		"\u0000\u0000\u1119\u111b\u0005\u0004\u0000\u0000\u111a\u1117\u0001\u0000"+
		"\u0000\u0000\u111a\u1118\u0001\u0000\u0000\u0000\u111a\u1119\u0001\u0000"+
		"\u0000\u0000\u111b\u111c\u0001\u0000\u0000\u0000\u111c\u111a\u0001\u0000"+
		"\u0000\u0000\u111c\u111d\u0001\u0000\u0000\u0000\u111d7\u0001\u0000\u0000"+
		"\u0000\u0116P\u008d\u0095\u00a3\u00a7\u00ad\u00b1\u00b5\u00c1\u00cc\u0115"+
		"\u012b\u012d\u0138\u016d\u0198\u01a3\u01e7\u01f2\u0246\u0248\u0253\u0278"+
		"\u027b\u027e\u0281\u0284\u0287\u028c\u02b0\u02d2\u02d7\u02da\u02dd\u02e0"+
		"\u02e3\u02e6\u02eb\u02f1\u02f4\u02f7\u02fa\u02fd\u0300\u0305\u030d\u0318"+
		"\u0323\u0420\u0424\u042e\u04b2\u04c8\u04cc\u04d7\u04ff\u0502\u0505\u0508"+
		"\u050b\u050e\u0513\u051a\u0548\u054b\u054e\u0551\u0554\u0557\u055c\u0563"+
		"\u056c\u0574\u0579\u05a9\u05ac\u05af\u05b2\u05b5\u05b8\u05bd\u05c8\u05ce"+
		"\u05e2\u05e8\u0618\u061b\u061e\u0621\u0624\u0627\u062c\u0637\u0640\u06df"+
		"\u06e7\u06ea\u06ed\u06f0\u06f3\u06f6\u06fb\u0707\u0713\u071b\u0723\u0744"+
		"\u075a\u0765\u08cc\u08d5\u08d8\u08db\u08de\u08e1\u08e4\u08e9\u08f4\u090f"+
		"\u091c\u0933\u093e\u0993\u0996\u0999\u099c\u099f\u09a2\u09a7\u09fa\u0a1d"+
		"\u0a20\u0a23\u0a26\u0a29\u0a2c\u0a31\u0a44\u0a46\u0a51\u0ba6\u0ba9\u0bac"+
		"\u0baf\u0bb2\u0bb5\u0bba\u0bc6\u0bcf\u0c1c\u0c1f\u0c22\u0c25\u0c28\u0c2b"+
		"\u0c30\u0c43\u0c45\u0c50\u0ca7\u0cf0\u0cf3\u0cf6\u0cf9\u0cfc\u0cff\u0d04"+
		"\u0d13\u0d15\u0d19\u0d21\u0d23\u0d61\u0d64\u0d67\u0d6a\u0d6d\u0d70\u0d75"+
		"\u0d7d\u0d80\u0d83\u0d86\u0d89\u0d8c\u0d91\u0d9e\u0da7\u0db1\u0dbc\u0ddb"+
		"\u0de2\u0de5\u0de8\u0deb\u0dee\u0df1\u0df6\u0dfe\u0e01\u0e04\u0e07\u0e0a"+
		"\u0e0d\u0e12\u0e37\u0e3b\u0e3f\u0e43\u0e47\u0e4f\u0e54\u0e56\u0e5a\u0e65"+
		"\u0e83\u0ead\u0eaf\u0eb3\u0ebe\u0edf\u0ee2\u0ee5\u0ee8\u0eeb\u0eee\u0ef3"+
		"\u0f12\u0f4b\u0f51\u0f67\u0f72\u0f91\u0f97\u0f9a\u0f9d\u0fa0\u0fa3\u0fa6"+
		"\u0fab\u0fb1\u0fb4\u0fb7\u0fba\u0fbd\u0fc0\u0fc5\u0fcd\u0fdd\u0ffa\u101b"+
		"\u101e\u1021\u1024\u1027\u102a\u102f\u103a\u103f\u1045\u104b\u104f\u1055"+
		"\u1057\u1061\u10c1\u10c5\u10cd\u10db\u10e3\u10ee\u10f0\u10f4\u10fe\u1111"+
		"\u1113\u111a\u111c";
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