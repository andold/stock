// Generated from C:\src\eclipse-workspace\stock\src\main\resources\grammar\Seibro.g4 by ANTLR 4.10.1
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
public class SeibroParser extends Parser {
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
		RULE_seibroItemInfoCompany = 6, RULE_seibroItemInfoEtf = 7, RULE_crawlItemEtf = 8, 
		RULE_crawlPriceEtf = 9, RULE_crawlPriceCompany = 10, RULE_crawlItemDetailCompanyThread = 11, 
		RULE_crawlItemDividendTopCompany = 12, RULE_crawlEtfDetailThread = 13, 
		RULE_crawlDividendHistoryEtfThread = 14, RULE_crawlDividendHistoryCompanyThread = 15, 
		RULE_word = 16, RULE_line = 17, RULE_eof = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"stockDocument", "seibroPriceCurrentEtf", "naverPriceCurrentEtf", "seibroPriceCurrentCompany", 
			"seibroPriceCompany", "seibroPriceEtf", "seibroItemInfoCompany", "seibroItemInfoEtf", 
			"crawlItemEtf", "crawlPriceEtf", "crawlPriceCompany", "crawlItemDetailCompanyThread", 
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
	public String getGrammarFileName() { return "Seibro.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private final Logger log = LoggerFactory.getLogger(getClass());

	public SeibroParser(TokenStream input) {
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
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).enterStockDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).exitStockDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroVisitor ) return ((SeibroVisitor<? extends T>)visitor).visitStockDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StockDocumentContext stockDocument() throws RecognitionException {
		StockDocumentContext _localctx = new StockDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stockDocument);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				crawlDividendHistoryCompanyThread();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				crawlDividendHistoryEtfThread();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				crawlItemDividendTopCompany();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				crawlItemEtf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				crawlItemDetailCompanyThread();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				crawlEtfDetailThread();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				crawlPriceCompany();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(45);
				crawlPriceEtf();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(46);
				seibroItemInfoCompany();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(47);
				seibroItemInfoEtf();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(48);
				seibroPriceCompany();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(49);
				seibroPriceEtf();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(50);
				seibroPriceCurrentCompany();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(51);
				seibroPriceCurrentEtf();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(52);
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
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroParser.DATE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SeibroParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SeibroParser.NUMBER, i);
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
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).enterSeibroPriceCurrentEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).exitSeibroPriceCurrentEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroVisitor ) return ((SeibroVisitor<? extends T>)visitor).visitSeibroPriceCurrentEtf(this);
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
			setState(55);
			match(KEYWORD);
			setState(56);
			match(TAB);
			setState(57);
			match(WORD);
			setState(58);
			match(TAB);
			setState(59);
			match(WORD);
			setState(60);
			match(WORD);
			setState(61);
			match(WORD);
			setState(62);
			match(TAB);
			setState(63);
			match(WORD);
			setState(64);
			match(NEWLINE);
			setState(175); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				match(WORD);
				setState(66);
				match(DATE);
				setState(67);
				match(TAB);
				setState(68);
				match(NEWLINE);
				setState(69);
				match(WORD);
				setState(70);
				match(DATE);
				setState(71);
				match(TAB);
				setState(72);
				match(WORD);
				setState(73);
				match(TAB);
				setState(74);
				match(WORD);
				setState(75);
				match(TAB);
				setState(76);
				match(WORD);
				setState(77);
				match(TAB);
				setState(78);
				match(WORD);
				setState(79);
				match(TAB);
				setState(80);
				match(WORD);
				setState(81);
				match(TAB);
				setState(82);
				match(WORD);
				setState(83);
				match(TAB);
				setState(84);
				match(WORD);
				setState(85);
				match(TAB);
				setState(86);
				match(WORD);
				setState(87);
				match(TAB);
				setState(88);
				match(WORD);
				setState(89);
				match(TAB);
				setState(90);
				match(WORD);
				setState(91);
				match(TAB);
				setState(92);
				match(WORD);
				setState(93);
				match(TAB);
				setState(94);
				match(WORD);
				setState(95);
				match(TAB);
				setState(96);
				match(WORD);
				setState(97);
				match(TAB);
				setState(98);
				match(WORD);
				setState(99);
				match(TAB);
				setState(100);
				match(WORD);
				setState(101);
				match(TAB);
				setState(102);
				match(WORD);
				setState(103);
				match(TAB);
				setState(104);
				match(WORD);
				setState(105);
				match(TAB);
				setState(106);
				match(NEWLINE);
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						{
						setState(107);
						match(WORD);
						setState(108);
						((SeibroPriceCurrentEtfContext)_localctx).base = match(DATE);
						setState(109);
						match(TAB);
						setState(110);
						match(TAB);
						setState(112); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(111);
							word();
							}
							}
							setState(114); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(116);
						match(TAB);
						setState(117);
						((SeibroPriceCurrentEtfContext)_localctx).code = word();
						setState(118);
						match(TAB);
						setState(120); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(119);
							word();
							}
							}
							setState(122); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(124);
						match(TAB);
						setState(125);
						match(NUMBER);
						setState(126);
						match(TAB);
						setState(127);
						((SeibroPriceCurrentEtfContext)_localctx).closing = match(NUMBER);
						setState(128);
						match(TAB);
						setState(129);
						((SeibroPriceCurrentEtfContext)_localctx).volume = match(NUMBER);
						setState(130);
						match(TAB);
						setState(131);
						match(NUMBER);
						setState(132);
						match(TAB);
						setState(133);
						match(NUMBER);
						setState(134);
						match(TAB);
						setState(136);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(135);
							match(NUMBER);
							}
						}

						setState(138);
						match(TAB);
						setState(140);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(139);
							match(NUMBER);
							}
						}

						setState(142);
						match(TAB);
						setState(143);
						match(NUMBER);
						setState(144);
						match(TAB);
						setState(146);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(145);
							match(NUMBER);
							}
						}

						setState(148);
						match(TAB);
						setState(150);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(149);
							match(NUMBER);
							}
						}

						setState(152);
						match(TAB);
						setState(154);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(153);
							match(NUMBER);
							}
						}

						setState(156);
						match(TAB);
						setState(157);
						match(NUMBER);
						setState(158);
						match(TAB);
						setState(159);
						match(WORD);
						setState(160);
						match(TAB);
						setState(161);
						match(NEWLINE);

										ParserService.price(20240112
											, (((SeibroPriceCurrentEtfContext)_localctx).code!=null?_input.getText(((SeibroPriceCurrentEtfContext)_localctx).code.start,((SeibroPriceCurrentEtfContext)_localctx).code.stop):null)
											, (((SeibroPriceCurrentEtfContext)_localctx).base!=null?((SeibroPriceCurrentEtfContext)_localctx).base.getText():null), (((SeibroPriceCurrentEtfContext)_localctx).closing!=null?((SeibroPriceCurrentEtfContext)_localctx).closing.getText():null), null, null, null, (((SeibroPriceCurrentEtfContext)_localctx).volume!=null?((SeibroPriceCurrentEtfContext)_localctx).volume.getText():null)
										);
									
						}
						}
						} 
					}
					setState(168);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(169);
				match(WORD);
				setState(170);
				match(TAB);
				setState(171);
				match(WORD);
				setState(172);
				match(TAB);
				setState(173);
				match(DATE);
				setState(174);
				match(NEWLINE);
				}
				}
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(179);
			match(KEYWORD);
			setState(180);
			match(TAB);
			setState(181);
			match(WORD);
			setState(182);
			match(TAB);
			setState(183);
			match(WORD);
			setState(184);
			match(WORD);
			setState(185);
			match(WORD);
			setState(186);
			match(TAB);
			setState(187);
			match(WORD);
			setState(188);
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
		public WordContext code;
		public Token closing;
		public Token volume;
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroParser.DATE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SeibroParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SeibroParser.NUMBER, i);
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
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).enterNaverPriceCurrentEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).exitNaverPriceCurrentEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroVisitor ) return ((SeibroVisitor<? extends T>)visitor).visitNaverPriceCurrentEtf(this);
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
			setState(190);
			match(KEYWORD);
			setState(191);
			match(TAB);
			setState(192);
			match(WORD);
			setState(193);
			match(TAB);
			setState(194);
			match(WORD);
			setState(195);
			match(WORD);
			setState(196);
			match(WORD);
			setState(197);
			match(WORD);
			setState(198);
			match(WORD);
			setState(199);
			match(TAB);
			setState(200);
			match(WORD);
			setState(201);
			match(NEWLINE);
			setState(283); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				match(DATE);
				setState(203);
				match(TAB);
				setState(204);
				match(WORD);
				setState(205);
				match(TAB);
				setState(206);
				match(WORD);
				setState(207);
				match(TAB);
				setState(208);
				match(WORD);
				setState(209);
				match(TAB);
				setState(210);
				match(WORD);
				setState(211);
				match(TAB);
				setState(212);
				match(WORD);
				setState(213);
				match(TAB);
				setState(214);
				match(WORD);
				setState(215);
				match(TAB);
				setState(216);
				match(WORD);
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
				match(TAB);
				setState(228);
				match(WORD);
				setState(229);
				match(TAB);
				setState(230);
				match(WORD);
				setState(231);
				match(TAB);
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
				match(NEWLINE);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DATE) {
					{
					setState(272);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						{
						setState(239);
						match(DATE);
						setState(240);
						match(TAB);
						setState(241);
						match(TAB);
						setState(242);
						match(NEWLINE);
						}
						}
						break;
					case 2:
						{
						{
						setState(243);
						((NaverPriceCurrentEtfContext)_localctx).base = match(DATE);
						setState(244);
						match(TAB);
						setState(245);
						((NaverPriceCurrentEtfContext)_localctx).code = word();
						setState(246);
						match(TAB);
						setState(248); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(247);
							word();
							}
							}
							setState(250); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(252);
						match(TAB);
						setState(253);
						((NaverPriceCurrentEtfContext)_localctx).closing = match(NUMBER);
						setState(254);
						match(TAB);
						setState(255);
						match(NUMBER);
						setState(256);
						match(TAB);
						setState(257);
						match(WORD);
						setState(258);
						match(TAB);
						setState(259);
						match(NUMBER);
						setState(260);
						match(TAB);
						setState(261);
						match(WORD);
						setState(262);
						match(TAB);
						setState(263);
						((NaverPriceCurrentEtfContext)_localctx).volume = match(NUMBER);
						setState(264);
						match(TAB);
						setState(265);
						match(NUMBER);
						setState(266);
						match(TAB);
						setState(267);
						match(NUMBER);
						setState(268);
						match(TAB);
						setState(269);
						match(NEWLINE);

										ParserService.price(20240112
											, (((NaverPriceCurrentEtfContext)_localctx).code!=null?_input.getText(((NaverPriceCurrentEtfContext)_localctx).code.start,((NaverPriceCurrentEtfContext)_localctx).code.stop):null)
											, (((NaverPriceCurrentEtfContext)_localctx).base!=null?((NaverPriceCurrentEtfContext)_localctx).base.getText():null), (((NaverPriceCurrentEtfContext)_localctx).closing!=null?((NaverPriceCurrentEtfContext)_localctx).closing.getText():null), null, null, null, (((NaverPriceCurrentEtfContext)_localctx).volume!=null?((NaverPriceCurrentEtfContext)_localctx).volume.getText():null)
										);
									
						}
						}
						break;
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(277);
				match(WORD);
				setState(278);
				match(TAB);
				setState(279);
				match(WORD);
				setState(280);
				match(TAB);
				setState(281);
				match(DATE);
				setState(282);
				match(NEWLINE);
				}
				}
				setState(285); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DATE );
			setState(287);
			match(KEYWORD);
			setState(288);
			match(TAB);
			setState(289);
			match(WORD);
			setState(290);
			match(TAB);
			setState(291);
			match(WORD);
			setState(292);
			match(WORD);
			setState(293);
			match(WORD);
			setState(294);
			match(WORD);
			setState(295);
			match(WORD);
			setState(296);
			match(TAB);
			setState(297);
			match(WORD);
			setState(298);
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
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroParser.DATE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SeibroParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SeibroParser.NUMBER, i);
		}
		public SeibroPriceCurrentCompanyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seibroPriceCurrentCompany; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).enterSeibroPriceCurrentCompany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).exitSeibroPriceCurrentCompany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroVisitor ) return ((SeibroVisitor<? extends T>)visitor).visitSeibroPriceCurrentCompany(this);
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
			setState(300);
			match(KEYWORD);
			setState(301);
			match(TAB);
			setState(302);
			match(WORD);
			setState(303);
			match(TAB);
			setState(304);
			match(WORD);
			setState(305);
			match(WORD);
			setState(306);
			match(WORD);
			setState(307);
			match(WORD);
			setState(308);
			match(WORD);
			setState(309);
			match(TAB);
			setState(310);
			match(WORD);
			setState(311);
			match(NEWLINE);
			setState(390); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(312);
				match(WORD);
				setState(313);
				match(WORD);
				setState(314);
				match(DATE);
				setState(315);
				match(TAB);
				setState(316);
				match(WORD);
				setState(317);
				match(WORD);
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
				match(WORD);
				setState(324);
				match(NEWLINE);
				setState(381);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(325);
						match(WORD);
						setState(326);
						match(WORD);
						setState(327);
						((SeibroPriceCurrentCompanyContext)_localctx).base = match(DATE);
						setState(328);
						match(TAB);
						setState(329);
						((SeibroPriceCurrentCompanyContext)_localctx).code = word();
						setState(330);
						match(NEWLINE);
						setState(331);
						match(WORD);
						setState(332);
						match(WORD);
						setState(333);
						match(DATE);
						setState(334);
						match(TAB);
						setState(336); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(335);
							word();
							}
							}
							setState(338); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(340);
						match(NEWLINE);
						setState(341);
						match(WORD);
						setState(342);
						match(WORD);
						setState(343);
						match(DATE);
						setState(344);
						match(TAB);
						setState(345);
						match(WORD);
						setState(346);
						match(NEWLINE);
						setState(347);
						match(WORD);
						setState(348);
						match(WORD);
						setState(349);
						match(DATE);
						setState(350);
						match(TAB);
						setState(351);
						((SeibroPriceCurrentCompanyContext)_localctx).closing = match(NUMBER);
						setState(352);
						match(NEWLINE);
						setState(353);
						match(WORD);
						setState(354);
						match(WORD);
						setState(355);
						match(DATE);
						setState(356);
						match(TAB);
						setState(357);
						((SeibroPriceCurrentCompanyContext)_localctx).volume = match(NUMBER);
						setState(358);
						match(NEWLINE);
						setState(359);
						match(WORD);
						setState(360);
						match(WORD);
						setState(361);
						match(DATE);
						setState(362);
						match(TAB);
						setState(363);
						((SeibroPriceCurrentCompanyContext)_localctx).market = match(NUMBER);
						setState(364);
						match(NEWLINE);
						setState(365);
						match(WORD);
						setState(366);
						match(WORD);
						setState(367);
						match(DATE);
						setState(368);
						match(TAB);
						setState(369);
						((SeibroPriceCurrentCompanyContext)_localctx).high = match(NUMBER);
						setState(370);
						match(NEWLINE);
						setState(371);
						match(WORD);
						setState(372);
						match(WORD);
						setState(373);
						match(DATE);
						setState(374);
						match(TAB);
						setState(375);
						((SeibroPriceCurrentCompanyContext)_localctx).low = match(NUMBER);
						setState(376);
						match(NEWLINE);

										ParserService.price(20240112
											, (((SeibroPriceCurrentCompanyContext)_localctx).code!=null?_input.getText(((SeibroPriceCurrentCompanyContext)_localctx).code.start,((SeibroPriceCurrentCompanyContext)_localctx).code.stop):null)
											, (((SeibroPriceCurrentCompanyContext)_localctx).base!=null?((SeibroPriceCurrentCompanyContext)_localctx).base.getText():null), (((SeibroPriceCurrentCompanyContext)_localctx).closing!=null?((SeibroPriceCurrentCompanyContext)_localctx).closing.getText():null), (((SeibroPriceCurrentCompanyContext)_localctx).market!=null?((SeibroPriceCurrentCompanyContext)_localctx).market.getText():null), (((SeibroPriceCurrentCompanyContext)_localctx).high!=null?((SeibroPriceCurrentCompanyContext)_localctx).high.getText():null), (((SeibroPriceCurrentCompanyContext)_localctx).low!=null?((SeibroPriceCurrentCompanyContext)_localctx).low.getText():null), (((SeibroPriceCurrentCompanyContext)_localctx).volume!=null?((SeibroPriceCurrentCompanyContext)_localctx).volume.getText():null)
										);
									
						}
						} 
					}
					setState(383);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(384);
				match(WORD);
				setState(385);
				match(TAB);
				setState(386);
				match(WORD);
				setState(387);
				match(TAB);
				setState(388);
				match(DATE);
				setState(389);
				match(NEWLINE);
				}
				}
				setState(392); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(394);
			match(KEYWORD);
			setState(395);
			match(TAB);
			setState(396);
			match(WORD);
			setState(397);
			match(TAB);
			setState(398);
			match(WORD);
			setState(399);
			match(WORD);
			setState(400);
			match(WORD);
			setState(401);
			match(WORD);
			setState(402);
			match(WORD);
			setState(403);
			match(TAB);
			setState(404);
			match(WORD);
			setState(405);
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
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroParser.NEWLINE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroParser.DATE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SeibroParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SeibroParser.NUMBER, i);
		}
		public SeibroPriceCompanyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seibroPriceCompany; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).enterSeibroPriceCompany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).exitSeibroPriceCompany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroVisitor ) return ((SeibroVisitor<? extends T>)visitor).visitSeibroPriceCompany(this);
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
			setState(407);
			match(KEYWORD);
			setState(408);
			match(TAB);
			setState(409);
			match(WORD);
			setState(410);
			match(TAB);
			setState(411);
			match(WORD);
			setState(412);
			match(WORD);
			setState(413);
			match(WORD);
			setState(414);
			match(WORD);
			setState(415);
			match(WORD);
			setState(416);
			match(TAB);
			setState(417);
			match(WORD);
			setState(418);
			match(NEWLINE);
			setState(480); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(419);
					word();
					setState(420);
					match(TAB);
					setState(421);
					match(NEWLINE);
					setState(422);
					word();
					setState(423);
					match(TAB);
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
					match(TAB);
					setState(430);
					match(WORD);
					setState(431);
					match(TAB);
					setState(432);
					match(WORD);
					setState(433);
					match(TAB);
					setState(434);
					match(WORD);
					setState(435);
					match(TAB);
					setState(436);
					match(WORD);
					setState(437);
					match(TAB);
					setState(438);
					match(NEWLINE);
					setState(469); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(469);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
							case 1:
								{
								{
								setState(439);
								word();
								setState(440);
								match(TAB);
								setState(441);
								match(TAB);
								setState(442);
								match(TAB);
								setState(443);
								match(TAB);
								setState(444);
								match(TAB);
								setState(445);
								match(TAB);
								setState(446);
								match(TAB);
								setState(447);
								match(TAB);
								setState(448);
								match(NEWLINE);
								}
								}
								break;
							case 2:
								{
								{
								setState(450);
								((SeibroPriceCompanyContext)_localctx).code = word();
								setState(451);
								match(TAB);
								setState(452);
								((SeibroPriceCompanyContext)_localctx).base = match(DATE);
								setState(453);
								match(TAB);
								setState(454);
								((SeibroPriceCompanyContext)_localctx).closing = match(NUMBER);
								setState(455);
								match(TAB);
								setState(456);
								match(NUMBER);
								setState(457);
								match(TAB);
								setState(458);
								((SeibroPriceCompanyContext)_localctx).market = match(NUMBER);
								setState(459);
								match(TAB);
								setState(460);
								((SeibroPriceCompanyContext)_localctx).high = match(NUMBER);
								setState(461);
								match(TAB);
								setState(462);
								((SeibroPriceCompanyContext)_localctx).low = match(NUMBER);
								setState(463);
								match(TAB);
								setState(464);
								((SeibroPriceCompanyContext)_localctx).volume = match(NUMBER);
								setState(465);
								match(TAB);
								setState(466);
								match(NEWLINE);

												ParserService.price(20240112
													, (((SeibroPriceCompanyContext)_localctx).code!=null?_input.getText(((SeibroPriceCompanyContext)_localctx).code.start,((SeibroPriceCompanyContext)_localctx).code.stop):null)
													, (((SeibroPriceCompanyContext)_localctx).base!=null?((SeibroPriceCompanyContext)_localctx).base.getText():null), (((SeibroPriceCompanyContext)_localctx).closing!=null?((SeibroPriceCompanyContext)_localctx).closing.getText():null), (((SeibroPriceCompanyContext)_localctx).market!=null?((SeibroPriceCompanyContext)_localctx).market.getText():null), (((SeibroPriceCompanyContext)_localctx).high!=null?((SeibroPriceCompanyContext)_localctx).high.getText():null), (((SeibroPriceCompanyContext)_localctx).low!=null?((SeibroPriceCompanyContext)_localctx).low.getText():null), (((SeibroPriceCompanyContext)_localctx).volume!=null?((SeibroPriceCompanyContext)_localctx).volume.getText():null)
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
						setState(471); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(482); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			match(TAB);
			setState(494);
			match(WORD);
			setState(495);
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
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroParser.NEWLINE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroParser.DATE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SeibroParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SeibroParser.NUMBER, i);
		}
		public SeibroPriceEtfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seibroPriceEtf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).enterSeibroPriceEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).exitSeibroPriceEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroVisitor ) return ((SeibroVisitor<? extends T>)visitor).visitSeibroPriceEtf(this);
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
			setState(497);
			match(KEYWORD);
			setState(498);
			match(TAB);
			setState(499);
			match(WORD);
			setState(500);
			match(TAB);
			setState(501);
			match(WORD);
			setState(502);
			match(WORD);
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
			match(TAB);
			setState(509);
			match(WORD);
			setState(510);
			match(NEWLINE);
			setState(577); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(511);
					word();
					setState(512);
					match(TAB);
					setState(513);
					match(NEWLINE);
					setState(514);
					word();
					setState(515);
					match(TAB);
					setState(516);
					match(WORD);
					setState(517);
					match(TAB);
					setState(518);
					match(WORD);
					setState(519);
					match(TAB);
					setState(520);
					match(WORD);
					setState(521);
					match(TAB);
					setState(522);
					match(WORD);
					setState(523);
					match(TAB);
					setState(524);
					match(WORD);
					setState(525);
					match(TAB);
					setState(526);
					match(WORD);
					setState(527);
					match(TAB);
					setState(528);
					match(WORD);
					setState(529);
					match(TAB);
					setState(530);
					match(WORD);
					setState(531);
					match(TAB);
					setState(532);
					match(NEWLINE);
					setState(566); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(566);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
							case 1:
								{
								{
								setState(533);
								word();
								setState(534);
								match(TAB);
								setState(535);
								match(TAB);
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
							case 2:
								{
								{
								setState(545);
								((SeibroPriceEtfContext)_localctx).code = word();
								setState(546);
								match(TAB);
								setState(547);
								((SeibroPriceEtfContext)_localctx).base = match(DATE);
								setState(548);
								match(TAB);
								setState(549);
								((SeibroPriceEtfContext)_localctx).closing = match(NUMBER);
								setState(550);
								match(TAB);
								setState(551);
								match(NUMBER);
								setState(552);
								match(TAB);
								setState(553);
								((SeibroPriceEtfContext)_localctx).market = match(NUMBER);
								setState(554);
								match(TAB);
								setState(555);
								((SeibroPriceEtfContext)_localctx).high = match(NUMBER);
								setState(556);
								match(TAB);
								setState(557);
								((SeibroPriceEtfContext)_localctx).low = match(NUMBER);
								setState(558);
								match(TAB);
								setState(559);
								((SeibroPriceEtfContext)_localctx).volume = match(NUMBER);
								setState(560);
								match(TAB);
								setState(561);
								match(NUMBER);
								setState(562);
								match(TAB);
								setState(563);
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
						setState(568); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(570);
					match(WORD);
					setState(571);
					match(TAB);
					setState(572);
					match(WORD);
					setState(573);
					match(TAB);
					setState(574);
					match(DATE);
					setState(575);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(579); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(581);
			match(KEYWORD);
			setState(582);
			match(TAB);
			setState(583);
			match(WORD);
			setState(584);
			match(TAB);
			setState(585);
			match(WORD);
			setState(586);
			match(WORD);
			setState(587);
			match(WORD);
			setState(588);
			match(WORD);
			setState(589);
			match(WORD);
			setState(590);
			match(WORD);
			setState(591);
			match(WORD);
			setState(592);
			match(TAB);
			setState(593);
			match(WORD);
			setState(594);
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
		public WordContext code;
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
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroParser.DATE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(SeibroParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SeibroParser.STRING, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SeibroParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SeibroParser.NUMBER, i);
		}
		public SeibroItemInfoCompanyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seibroItemInfoCompany; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).enterSeibroItemInfoCompany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).exitSeibroItemInfoCompany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroVisitor ) return ((SeibroVisitor<? extends T>)visitor).visitSeibroItemInfoCompany(this);
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
			setState(596);
			match(KEYWORD);
			setState(597);
			match(TAB);
			setState(598);
			match(WORD);
			setState(599);
			match(TAB);
			setState(600);
			match(WORD);
			setState(601);
			match(WORD);
			setState(602);
			match(WORD);
			setState(603);
			match(WORD);
			setState(604);
			match(WORD);
			setState(605);
			match(TAB);
			setState(606);
			match(WORD);
			setState(607);
			match(NEWLINE);
			setState(672); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					{
					setState(608);
					match(KEYWORD);
					setState(609);
					match(TAB);
					setState(610);
					((SeibroItemInfoCompanyContext)_localctx).code = word();
					setState(611);
					match(TAB);
					setState(612);
					((SeibroItemInfoCompanyContext)_localctx).type = match(WORD);
					setState(613);
					match(TAB);
					setState(614);
					((SeibroItemInfoCompanyContext)_localctx).symbol = word();
					setState(616);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(615);
						((SeibroItemInfoCompanyContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(619);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(618);
						((SeibroItemInfoCompanyContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(622);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(621);
						((SeibroItemInfoCompanyContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(625);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(624);
						((SeibroItemInfoCompanyContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(628);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(627);
						((SeibroItemInfoCompanyContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(631);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(630);
						((SeibroItemInfoCompanyContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(636);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(633);
						((SeibroItemInfoCompanyContext)_localctx).symbol7 = word();
						}
						}
						setState(638);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(639);
					match(NEWLINE);
					setState(640);
					match(KEYWORD);
					setState(641);
					match(TAB);
					setState(642);
					((SeibroItemInfoCompanyContext)_localctx).category = match(STRING);
					setState(643);
					match(NEWLINE);
					setState(644);
					match(KEYWORD);
					setState(645);
					match(TAB);
					setState(646);
					((SeibroItemInfoCompanyContext)_localctx).fics = match(STRING);
					setState(647);
					match(NEWLINE);
					setState(648);
					match(KEYWORD);
					setState(649);
					match(TAB);
					setState(650);
					((SeibroItemInfoCompanyContext)_localctx).volumeOfListedShares = match(NUMBER);
					setState(651);
					match(WORD);
					setState(652);
					match(NEWLINE);
					setState(653);
					match(KEYWORD);
					setState(654);
					match(TAB);
					setState(655);
					((SeibroItemInfoCompanyContext)_localctx).ipoOpen = match(DATE);
					setState(656);
					match(NEWLINE);
					setState(657);
					match(KEYWORD);
					setState(658);
					match(TAB);
					setState(660);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DATE) {
						{
						setState(659);
						((SeibroItemInfoCompanyContext)_localctx).ipoClose = match(DATE);
						}
					}

					setState(662);
					match(NEWLINE);

									ParserService.item(20240112
										, (((SeibroItemInfoCompanyContext)_localctx).code!=null?_input.getText(((SeibroItemInfoCompanyContext)_localctx).code.start,((SeibroItemInfoCompanyContext)_localctx).code.stop):null)
										, (((SeibroItemInfoCompanyContext)_localctx).symbol!=null?_input.getText(((SeibroItemInfoCompanyContext)_localctx).symbol.start,((SeibroItemInfoCompanyContext)_localctx).symbol.stop):null), (((SeibroItemInfoCompanyContext)_localctx).symbol1!=null?_input.getText(((SeibroItemInfoCompanyContext)_localctx).symbol1.start,((SeibroItemInfoCompanyContext)_localctx).symbol1.stop):null), (((SeibroItemInfoCompanyContext)_localctx).symbol2!=null?_input.getText(((SeibroItemInfoCompanyContext)_localctx).symbol2.start,((SeibroItemInfoCompanyContext)_localctx).symbol2.stop):null), (((SeibroItemInfoCompanyContext)_localctx).symbol3!=null?_input.getText(((SeibroItemInfoCompanyContext)_localctx).symbol3.start,((SeibroItemInfoCompanyContext)_localctx).symbol3.stop):null), (((SeibroItemInfoCompanyContext)_localctx).symbol4!=null?_input.getText(((SeibroItemInfoCompanyContext)_localctx).symbol4.start,((SeibroItemInfoCompanyContext)_localctx).symbol4.stop):null), (((SeibroItemInfoCompanyContext)_localctx).symbol5!=null?_input.getText(((SeibroItemInfoCompanyContext)_localctx).symbol5.start,((SeibroItemInfoCompanyContext)_localctx).symbol5.stop):null), (((SeibroItemInfoCompanyContext)_localctx).symbol6!=null?_input.getText(((SeibroItemInfoCompanyContext)_localctx).symbol6.start,((SeibroItemInfoCompanyContext)_localctx).symbol6.stop):null), (((SeibroItemInfoCompanyContext)_localctx).symbol7!=null?_input.getText(((SeibroItemInfoCompanyContext)_localctx).symbol7.start,((SeibroItemInfoCompanyContext)_localctx).symbol7.stop):null)
										, (((SeibroItemInfoCompanyContext)_localctx).category!=null?((SeibroItemInfoCompanyContext)_localctx).category.getText():null), (((SeibroItemInfoCompanyContext)_localctx).fics!=null?((SeibroItemInfoCompanyContext)_localctx).fics.getText():null), null, null, null, null, null, null
										, (((SeibroItemInfoCompanyContext)_localctx).type!=null?((SeibroItemInfoCompanyContext)_localctx).type.getText():null)
										, (((SeibroItemInfoCompanyContext)_localctx).ipoOpen!=null?((SeibroItemInfoCompanyContext)_localctx).ipoOpen.getText():null)
										, (((SeibroItemInfoCompanyContext)_localctx).ipoClose!=null?((SeibroItemInfoCompanyContext)_localctx).ipoClose.getText():null)
										, (((SeibroItemInfoCompanyContext)_localctx).volumeOfListedShares!=null?((SeibroItemInfoCompanyContext)_localctx).volumeOfListedShares.getText():null)
										, null
									);
								
					}
					setState(665);
					match(WORD);
					setState(666);
					match(TAB);
					setState(667);
					match(WORD);
					setState(668);
					match(TAB);
					setState(669);
					match(DATE);
					setState(670);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(674); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(676);
			match(KEYWORD);
			setState(677);
			match(TAB);
			setState(678);
			match(WORD);
			setState(679);
			match(TAB);
			setState(680);
			match(WORD);
			setState(681);
			match(WORD);
			setState(682);
			match(WORD);
			setState(683);
			match(WORD);
			setState(684);
			match(WORD);
			setState(685);
			match(TAB);
			setState(686);
			match(WORD);
			setState(687);
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
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroParser.DATE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SeibroParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SeibroParser.NUMBER, i);
		}
		public SeibroItemInfoEtfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seibroItemInfoEtf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).enterSeibroItemInfoEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).exitSeibroItemInfoEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroVisitor ) return ((SeibroVisitor<? extends T>)visitor).visitSeibroItemInfoEtf(this);
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
			setState(689);
			match(KEYWORD);
			setState(690);
			match(TAB);
			setState(691);
			match(WORD);
			setState(692);
			match(TAB);
			setState(693);
			match(WORD);
			setState(694);
			match(WORD);
			setState(695);
			match(WORD);
			setState(696);
			match(WORD);
			setState(697);
			match(WORD);
			setState(698);
			match(TAB);
			setState(699);
			match(WORD);
			setState(700);
			match(NEWLINE);
			setState(788); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(777); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(701);
						match(KEYWORD);
						setState(702);
						match(TAB);
						setState(703);
						((SeibroItemInfoEtfContext)_localctx).code = word();
						setState(704);
						match(TAB);
						setState(706); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(705);
							word();
							}
							}
							setState(708); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(710);
						match(NEWLINE);
						setState(711);
						((SeibroItemInfoEtfContext)_localctx).symbol = word();
						setState(713);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(712);
							((SeibroItemInfoEtfContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(716);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
						case 1:
							{
							setState(715);
							((SeibroItemInfoEtfContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(719);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
						case 1:
							{
							setState(718);
							((SeibroItemInfoEtfContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(722);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
						case 1:
							{
							setState(721);
							((SeibroItemInfoEtfContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(725);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
						case 1:
							{
							setState(724);
							((SeibroItemInfoEtfContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(728);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
						case 1:
							{
							setState(727);
							((SeibroItemInfoEtfContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(733);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(730);
							((SeibroItemInfoEtfContext)_localctx).symbol7 = word();
							}
							}
							setState(735);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(736);
						match(NEWLINE);
						setState(737);
						((SeibroItemInfoEtfContext)_localctx).category = word();
						setState(739);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
						case 1:
							{
							setState(738);
							((SeibroItemInfoEtfContext)_localctx).category1 = word();
							}
							break;
						}
						setState(742);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
						case 1:
							{
							setState(741);
							((SeibroItemInfoEtfContext)_localctx).category2 = word();
							}
							break;
						}
						setState(745);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
						case 1:
							{
							setState(744);
							((SeibroItemInfoEtfContext)_localctx).category3 = word();
							}
							break;
						}
						setState(748);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
						case 1:
							{
							setState(747);
							((SeibroItemInfoEtfContext)_localctx).category4 = word();
							}
							break;
						}
						setState(751);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
						case 1:
							{
							setState(750);
							((SeibroItemInfoEtfContext)_localctx).category5 = word();
							}
							break;
						}
						setState(754);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
						case 1:
							{
							setState(753);
							((SeibroItemInfoEtfContext)_localctx).category6 = word();
							}
							break;
						}
						setState(759);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(756);
							((SeibroItemInfoEtfContext)_localctx).category7 = word();
							}
							}
							setState(761);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(762);
						match(NEWLINE);
						setState(763);
						((SeibroItemInfoEtfContext)_localctx).ipo = match(DATE);
						setState(767);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(764);
							word();
							}
							}
							setState(769);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(770);
						match(NEWLINE);
						setState(771);
						((SeibroItemInfoEtfContext)_localctx).volumeOfListedShares = match(NUMBER);
						setState(772);
						match(NEWLINE);
						setState(773);
						((SeibroItemInfoEtfContext)_localctx).fee = word();
						setState(774);
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
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
			match(TAB);
			setState(802);
			match(WORD);
			setState(803);
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
		public WordContext code;
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
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroParser.DATE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SeibroParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SeibroParser.NUMBER, i);
		}
		public CrawlItemEtfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crawlItemEtf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).enterCrawlItemEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).exitCrawlItemEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroVisitor ) return ((SeibroVisitor<? extends T>)visitor).visitCrawlItemEtf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlItemEtfContext crawlItemEtf() throws RecognitionException {
		CrawlItemEtfContext _localctx = new CrawlItemEtfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_crawlItemEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
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
			match(TAB);
			setState(813);
			match(WORD);
			setState(814);
			match(TAB);
			setState(815);
			match(WORD);
			setState(816);
			match(NEWLINE);
			setState(945); 
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
				match(NEWLINE);
				setState(820);
				match(WORD);
				setState(821);
				match(TAB);
				setState(822);
				match(WORD);
				setState(823);
				match(TAB);
				setState(824);
				match(WORD);
				setState(825);
				match(TAB);
				setState(826);
				match(TAB);
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
				match(NEWLINE);
				setState(835);
				match(WORD);
				setState(836);
				match(TAB);
				setState(837);
				match(TAB);
				setState(838);
				match(TAB);
				setState(839);
				match(WORD);
				setState(840);
				match(TAB);
				setState(841);
				match(TAB);
				setState(842);
				match(TAB);
				setState(843);
				match(TAB);
				setState(844);
				match(TAB);
				setState(845);
				match(TAB);
				setState(846);
				match(WORD);
				setState(847);
				match(TAB);
				setState(848);
				match(WORD);
				setState(849);
				match(TAB);
				setState(850);
				match(NEWLINE);
				setState(934); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(851);
						((CrawlItemEtfContext)_localctx).type = match(WORD);
						setState(852);
						match(TAB);
						setState(853);
						match(TAB);
						setState(854);
						((CrawlItemEtfContext)_localctx).symbol = word();
						setState(856);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
						case 1:
							{
							setState(855);
							((CrawlItemEtfContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(859);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
						case 1:
							{
							setState(858);
							((CrawlItemEtfContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(862);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
						case 1:
							{
							setState(861);
							((CrawlItemEtfContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(865);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
						case 1:
							{
							setState(864);
							((CrawlItemEtfContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(868);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
						case 1:
							{
							setState(867);
							((CrawlItemEtfContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(871);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
						case 1:
							{
							setState(870);
							((CrawlItemEtfContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(876);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(873);
							((CrawlItemEtfContext)_localctx).symbol7 = word();
							}
							}
							setState(878);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(879);
						match(TAB);
						setState(880);
						((CrawlItemEtfContext)_localctx).code = word();
						setState(881);
						match(TAB);
						setState(882);
						((CrawlItemEtfContext)_localctx).category = word();
						setState(884);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
						case 1:
							{
							setState(883);
							((CrawlItemEtfContext)_localctx).category1 = word();
							}
							break;
						}
						setState(887);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
						case 1:
							{
							setState(886);
							((CrawlItemEtfContext)_localctx).category2 = word();
							}
							break;
						}
						setState(890);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
						case 1:
							{
							setState(889);
							((CrawlItemEtfContext)_localctx).category3 = word();
							}
							break;
						}
						setState(893);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
						case 1:
							{
							setState(892);
							((CrawlItemEtfContext)_localctx).category4 = word();
							}
							break;
						}
						setState(896);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
						case 1:
							{
							setState(895);
							((CrawlItemEtfContext)_localctx).category5 = word();
							}
							break;
						}
						setState(899);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
						case 1:
							{
							setState(898);
							((CrawlItemEtfContext)_localctx).category6 = word();
							}
							break;
						}
						setState(904);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(901);
							((CrawlItemEtfContext)_localctx).category7 = word();
							}
							}
							setState(906);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(907);
						match(TAB);
						setState(908);
						((CrawlItemEtfContext)_localctx).asset = match(NUMBER);
						setState(909);
						match(TAB);
						setState(910);
						((CrawlItemEtfContext)_localctx).closing = match(NUMBER);
						setState(911);
						match(TAB);
						setState(912);
						((CrawlItemEtfContext)_localctx).amount = match(NUMBER);
						setState(913);
						match(TAB);
						setState(914);
						match(TAB);
						setState(915);
						match(TAB);
						setState(917);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(916);
							((CrawlItemEtfContext)_localctx).priceEarningsRatio = match(NUMBER);
							}
						}

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
						setState(926);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(925);
							((CrawlItemEtfContext)_localctx).fee = match(NUMBER);
							}
						}

						setState(928);
						match(TAB);
						setState(929);
						((CrawlItemEtfContext)_localctx).operator = match(WORD);
						setState(930);
						match(TAB);
						setState(931);
						match(NEWLINE);

										ParserService.item(20240112
											, (((CrawlItemEtfContext)_localctx).code!=null?_input.getText(((CrawlItemEtfContext)_localctx).code.start,((CrawlItemEtfContext)_localctx).code.stop):null)
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
					setState(936); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(938);
				match(WORD);
				setState(939);
				match(TAB);
				setState(940);
				match(WORD);
				setState(941);
				match(TAB);
				setState(942);
				match(DATE);
				setState(943);
				match(NEWLINE);
				}
				}
				setState(947); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(949);
			match(KEYWORD);
			setState(950);
			match(TAB);
			setState(951);
			match(WORD);
			setState(952);
			match(TAB);
			setState(953);
			match(WORD);
			setState(954);
			match(WORD);
			setState(955);
			match(WORD);
			setState(956);
			match(TAB);
			setState(957);
			match(WORD);
			setState(958);
			match(TAB);
			setState(959);
			match(WORD);
			setState(960);
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
		public Token ea;
		public Token base;
		public Token closing;
		public Token market;
		public Token high;
		public Token low;
		public Token volume;
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroParser.DATE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SeibroParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SeibroParser.NUMBER, i);
		}
		public CrawlPriceEtfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crawlPriceEtf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).enterCrawlPriceEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).exitCrawlPriceEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroVisitor ) return ((SeibroVisitor<? extends T>)visitor).visitCrawlPriceEtf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlPriceEtfContext crawlPriceEtf() throws RecognitionException {
		CrawlPriceEtfContext _localctx = new CrawlPriceEtfContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_crawlPriceEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			match(KEYWORD);
			setState(963);
			match(TAB);
			setState(964);
			match(WORD);
			setState(965);
			match(WORD);
			setState(966);
			match(TAB);
			setState(967);
			match(WORD);
			setState(968);
			match(TAB);
			setState(969);
			match(WORD);
			setState(970);
			match(TAB);
			setState(971);
			match(WORD);
			setState(972);
			match(NEWLINE);
			setState(1114); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(973);
					((CrawlPriceEtfContext)_localctx).code = word();
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
					{
					setState(981);
					match(KEYWORD);
					setState(982);
					match(TAB);
					setState(983);
					((CrawlPriceEtfContext)_localctx).symbol = word();
					setState(985);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						setState(984);
						((CrawlPriceEtfContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(988);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						setState(987);
						((CrawlPriceEtfContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(991);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						setState(990);
						((CrawlPriceEtfContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(994);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						setState(993);
						((CrawlPriceEtfContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(997);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						setState(996);
						((CrawlPriceEtfContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(1000);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						setState(999);
						((CrawlPriceEtfContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(1005);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(1002);
						((CrawlPriceEtfContext)_localctx).symbol7 = word();
						}
						}
						setState(1007);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1008);
					match(NEWLINE);
					setState(1009);
					match(KEYWORD);
					setState(1010);
					match(TAB);
					setState(1011);
					((CrawlPriceEtfContext)_localctx).category = word();
					setState(1013);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						setState(1012);
						((CrawlPriceEtfContext)_localctx).category1 = word();
						}
						break;
					}
					setState(1016);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						setState(1015);
						((CrawlPriceEtfContext)_localctx).category2 = word();
						}
						break;
					}
					setState(1019);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						setState(1018);
						((CrawlPriceEtfContext)_localctx).category3 = word();
						}
						break;
					}
					setState(1022);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						setState(1021);
						((CrawlPriceEtfContext)_localctx).category4 = word();
						}
						break;
					}
					setState(1025);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						setState(1024);
						((CrawlPriceEtfContext)_localctx).category5 = word();
						}
						break;
					}
					setState(1028);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(1027);
						((CrawlPriceEtfContext)_localctx).category6 = word();
						}
						break;
					}
					setState(1033);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(1030);
						((CrawlPriceEtfContext)_localctx).category7 = word();
						}
						}
						setState(1035);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1036);
					match(NEWLINE);
					setState(1037);
					match(KEYWORD);
					setState(1038);
					match(TAB);
					setState(1039);
					((CrawlPriceEtfContext)_localctx).ea = match(NUMBER);
					setState(1040);
					match(NEWLINE);

									ParserService.item(20240112
										, (((CrawlPriceEtfContext)_localctx).code!=null?_input.getText(((CrawlPriceEtfContext)_localctx).code.start,((CrawlPriceEtfContext)_localctx).code.stop):null)
										, (((CrawlPriceEtfContext)_localctx).symbol!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol.start,((CrawlPriceEtfContext)_localctx).symbol.stop):null), (((CrawlPriceEtfContext)_localctx).symbol1!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol1.start,((CrawlPriceEtfContext)_localctx).symbol1.stop):null), (((CrawlPriceEtfContext)_localctx).symbol2!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol2.start,((CrawlPriceEtfContext)_localctx).symbol2.stop):null), (((CrawlPriceEtfContext)_localctx).symbol3!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol3.start,((CrawlPriceEtfContext)_localctx).symbol3.stop):null), (((CrawlPriceEtfContext)_localctx).symbol4!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol4.start,((CrawlPriceEtfContext)_localctx).symbol4.stop):null), (((CrawlPriceEtfContext)_localctx).symbol5!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol5.start,((CrawlPriceEtfContext)_localctx).symbol5.stop):null), (((CrawlPriceEtfContext)_localctx).symbol6!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol6.start,((CrawlPriceEtfContext)_localctx).symbol6.stop):null), (((CrawlPriceEtfContext)_localctx).symbol7!=null?_input.getText(((CrawlPriceEtfContext)_localctx).symbol7.start,((CrawlPriceEtfContext)_localctx).symbol7.stop):null)
										, (((CrawlPriceEtfContext)_localctx).category!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category.start,((CrawlPriceEtfContext)_localctx).category.stop):null), (((CrawlPriceEtfContext)_localctx).category1!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category1.start,((CrawlPriceEtfContext)_localctx).category1.stop):null), (((CrawlPriceEtfContext)_localctx).category2!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category2.start,((CrawlPriceEtfContext)_localctx).category2.stop):null), (((CrawlPriceEtfContext)_localctx).category3!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category3.start,((CrawlPriceEtfContext)_localctx).category3.stop):null), (((CrawlPriceEtfContext)_localctx).category4!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category4.start,((CrawlPriceEtfContext)_localctx).category4.stop):null), (((CrawlPriceEtfContext)_localctx).category5!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category5.start,((CrawlPriceEtfContext)_localctx).category5.stop):null), (((CrawlPriceEtfContext)_localctx).category6!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category6.start,((CrawlPriceEtfContext)_localctx).category6.stop):null), (((CrawlPriceEtfContext)_localctx).category7!=null?_input.getText(((CrawlPriceEtfContext)_localctx).category7.start,((CrawlPriceEtfContext)_localctx).category7.stop):null)
										, "ETF"
										, null
										, null
										, (((CrawlPriceEtfContext)_localctx).ea!=null?((CrawlPriceEtfContext)_localctx).ea.getText():null)
										, null
									);
								
					}
					setState(1103); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
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
							match(NEWLINE);
							setState(1099); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								setState(1099);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
								case 1:
									{
									{
									setState(1060);
									match(TAB);
									setState(1061);
									match(TAB);
									setState(1062);
									match(TAB);
									setState(1063);
									match(TAB);
									setState(1064);
									match(TAB);
									setState(1065);
									match(TAB);
									setState(1066);
									match(TAB);
									setState(1067);
									match(TAB);
									setState(1068);
									match(NEWLINE);
									}
									}
									break;
								case 2:
									{
									{
									setState(1070);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==DATE) {
										{
										setState(1069);
										((CrawlPriceEtfContext)_localctx).base = match(DATE);
										}
									}

									setState(1072);
									match(TAB);
									setState(1074);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==NUMBER) {
										{
										setState(1073);
										((CrawlPriceEtfContext)_localctx).closing = match(NUMBER);
										}
									}

									setState(1076);
									match(TAB);
									setState(1078);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==NUMBER) {
										{
										setState(1077);
										match(NUMBER);
										}
									}

									setState(1080);
									match(TAB);
									setState(1082);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==NUMBER) {
										{
										setState(1081);
										((CrawlPriceEtfContext)_localctx).market = match(NUMBER);
										}
									}

									setState(1084);
									match(TAB);
									setState(1086);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==NUMBER) {
										{
										setState(1085);
										((CrawlPriceEtfContext)_localctx).high = match(NUMBER);
										}
									}

									setState(1088);
									match(TAB);
									setState(1089);
									((CrawlPriceEtfContext)_localctx).low = match(NUMBER);
									setState(1090);
									match(TAB);
									setState(1091);
									((CrawlPriceEtfContext)_localctx).volume = match(NUMBER);
									setState(1092);
									match(TAB);
									setState(1094);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==NUMBER) {
										{
										setState(1093);
										match(NUMBER);
										}
									}

									setState(1096);
									match(TAB);
									setState(1097);
									match(NEWLINE);

														ParserService.price(20240112
															, (((CrawlPriceEtfContext)_localctx).code!=null?_input.getText(((CrawlPriceEtfContext)_localctx).code.start,((CrawlPriceEtfContext)_localctx).code.stop):null)
															, (((CrawlPriceEtfContext)_localctx).base!=null?((CrawlPriceEtfContext)_localctx).base.getText():null), (((CrawlPriceEtfContext)_localctx).closing!=null?((CrawlPriceEtfContext)_localctx).closing.getText():null), (((CrawlPriceEtfContext)_localctx).market!=null?((CrawlPriceEtfContext)_localctx).market.getText():null), (((CrawlPriceEtfContext)_localctx).high!=null?((CrawlPriceEtfContext)_localctx).high.getText():null), (((CrawlPriceEtfContext)_localctx).low!=null?((CrawlPriceEtfContext)_localctx).low.getText():null), (((CrawlPriceEtfContext)_localctx).volume!=null?((CrawlPriceEtfContext)_localctx).volume.getText():null)
														);
													
									}
									}
									break;
								}
								}
								setState(1101); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==TAB || _la==DATE );
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1105); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(1107);
					match(WORD);
					setState(1108);
					match(TAB);
					setState(1109);
					match(WORD);
					setState(1110);
					match(TAB);
					setState(1111);
					match(DATE);
					setState(1112);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1116); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1118);
			match(KEYWORD);
			setState(1119);
			match(TAB);
			setState(1120);
			match(WORD);
			setState(1121);
			match(WORD);
			setState(1122);
			match(TAB);
			setState(1123);
			match(WORD);
			setState(1124);
			match(TAB);
			setState(1125);
			match(WORD);
			setState(1126);
			match(TAB);
			setState(1127);
			match(WORD);
			setState(1128);
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
		public WordContext code;
		public WordContext symbol;
		public Token base;
		public Token closing;
		public Token market;
		public Token high;
		public Token low;
		public Token volume;
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroParser.DATE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SeibroParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SeibroParser.NUMBER, i);
		}
		public CrawlPriceCompanyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crawlPriceCompany; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).enterCrawlPriceCompany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).exitCrawlPriceCompany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroVisitor ) return ((SeibroVisitor<? extends T>)visitor).visitCrawlPriceCompany(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlPriceCompanyContext crawlPriceCompany() throws RecognitionException {
		CrawlPriceCompanyContext _localctx = new CrawlPriceCompanyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_crawlPriceCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			match(KEYWORD);
			setState(1131);
			match(TAB);
			setState(1132);
			match(WORD);
			setState(1133);
			match(WORD);
			setState(1134);
			match(TAB);
			setState(1135);
			match(WORD);
			setState(1136);
			match(TAB);
			setState(1137);
			match(WORD);
			setState(1138);
			match(TAB);
			setState(1139);
			match(WORD);
			setState(1140);
			match(NEWLINE);
			setState(1203); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1141);
					((CrawlPriceCompanyContext)_localctx).code = word();
					setState(1142);
					match(TAB);
					setState(1144); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1143);
						((CrawlPriceCompanyContext)_localctx).symbol = word();
						}
						}
						setState(1146); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
					setState(1148);
					match(NEWLINE);
					setState(1192); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1149);
							match(WORD);
							setState(1150);
							match(TAB);
							setState(1151);
							match(WORD);
							setState(1152);
							match(TAB);
							setState(1153);
							match(WORD);
							setState(1154);
							match(TAB);
							setState(1155);
							match(WORD);
							setState(1156);
							match(TAB);
							setState(1157);
							match(WORD);
							setState(1158);
							match(TAB);
							setState(1159);
							match(WORD);
							setState(1160);
							match(TAB);
							setState(1161);
							match(WORD);
							setState(1162);
							match(TAB);
							setState(1163);
							match(NEWLINE);
							setState(1188); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								setState(1188);
								_errHandler.sync(this);
								switch (_input.LA(1)) {
								case TAB:
									{
									{
									setState(1164);
									match(TAB);
									setState(1165);
									match(TAB);
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
									}
									}
									break;
								case DATE:
									{
									{
									setState(1172);
									((CrawlPriceCompanyContext)_localctx).base = match(DATE);
									setState(1173);
									match(TAB);
									setState(1174);
									((CrawlPriceCompanyContext)_localctx).closing = match(NUMBER);
									setState(1175);
									match(TAB);
									setState(1176);
									match(NUMBER);
									setState(1177);
									match(TAB);
									setState(1178);
									((CrawlPriceCompanyContext)_localctx).market = match(NUMBER);
									setState(1179);
									match(TAB);
									setState(1180);
									((CrawlPriceCompanyContext)_localctx).high = match(NUMBER);
									setState(1181);
									match(TAB);
									setState(1182);
									((CrawlPriceCompanyContext)_localctx).low = match(NUMBER);
									setState(1183);
									match(TAB);
									setState(1184);
									((CrawlPriceCompanyContext)_localctx).volume = match(NUMBER);
									setState(1185);
									match(TAB);
									setState(1186);
									match(NEWLINE);

													ParserService.price(20240112
														, (((CrawlPriceCompanyContext)_localctx).code!=null?_input.getText(((CrawlPriceCompanyContext)_localctx).code.start,((CrawlPriceCompanyContext)_localctx).code.stop):null)
														, (((CrawlPriceCompanyContext)_localctx).base!=null?((CrawlPriceCompanyContext)_localctx).base.getText():null), (((CrawlPriceCompanyContext)_localctx).closing!=null?((CrawlPriceCompanyContext)_localctx).closing.getText():null), (((CrawlPriceCompanyContext)_localctx).market!=null?((CrawlPriceCompanyContext)_localctx).market.getText():null), (((CrawlPriceCompanyContext)_localctx).high!=null?((CrawlPriceCompanyContext)_localctx).high.getText():null), (((CrawlPriceCompanyContext)_localctx).low!=null?((CrawlPriceCompanyContext)_localctx).low.getText():null), (((CrawlPriceCompanyContext)_localctx).volume!=null?((CrawlPriceCompanyContext)_localctx).volume.getText():null)
													);
												
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								}
								setState(1190); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==TAB || _la==DATE );
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1194); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(1196);
					match(WORD);
					setState(1197);
					match(TAB);
					setState(1198);
					match(WORD);
					setState(1199);
					match(TAB);
					setState(1200);
					match(DATE);
					setState(1201);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1205); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1207);
			match(KEYWORD);
			setState(1208);
			match(TAB);
			setState(1209);
			match(WORD);
			setState(1210);
			match(WORD);
			setState(1211);
			match(TAB);
			setState(1212);
			match(WORD);
			setState(1213);
			match(TAB);
			setState(1214);
			match(WORD);
			setState(1215);
			match(TAB);
			setState(1216);
			match(WORD);
			setState(1217);
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
		public WordContext code;
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
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroParser.DATE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(SeibroParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SeibroParser.STRING, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SeibroParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SeibroParser.NUMBER, i);
		}
		public CrawlItemDetailCompanyThreadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crawlItemDetailCompanyThread; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).enterCrawlItemDetailCompanyThread(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).exitCrawlItemDetailCompanyThread(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroVisitor ) return ((SeibroVisitor<? extends T>)visitor).visitCrawlItemDetailCompanyThread(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlItemDetailCompanyThreadContext crawlItemDetailCompanyThread() throws RecognitionException {
		CrawlItemDetailCompanyThreadContext _localctx = new CrawlItemDetailCompanyThreadContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_crawlItemDetailCompanyThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			match(KEYWORD);
			setState(1220);
			match(TAB);
			setState(1221);
			match(WORD);
			setState(1222);
			match(WORD);
			setState(1223);
			match(TAB);
			setState(1224);
			match(WORD);
			setState(1225);
			match(TAB);
			setState(1226);
			match(WORD);
			setState(1227);
			match(TAB);
			setState(1228);
			match(WORD);
			setState(1229);
			match(NEWLINE);
			setState(1287); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1230);
					match(KEYWORD);
					setState(1231);
					match(TAB);
					setState(1232);
					((CrawlItemDetailCompanyThreadContext)_localctx).code = word();
					setState(1233);
					match(TAB);
					setState(1234);
					((CrawlItemDetailCompanyThreadContext)_localctx).type = match(WORD);
					setState(1235);
					match(TAB);
					setState(1236);
					((CrawlItemDetailCompanyThreadContext)_localctx).symbol = word();
					setState(1238);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
					case 1:
						{
						setState(1237);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(1241);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
					case 1:
						{
						setState(1240);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(1244);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
					case 1:
						{
						setState(1243);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(1247);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
					case 1:
						{
						setState(1246);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(1250);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
					case 1:
						{
						setState(1249);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(1253);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
					case 1:
						{
						setState(1252);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(1258);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(1255);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(1260);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1261);
					match(NEWLINE);
					setState(1262);
					match(KEYWORD);
					setState(1263);
					match(TAB);
					setState(1264);
					((CrawlItemDetailCompanyThreadContext)_localctx).category = match(STRING);
					setState(1265);
					match(NEWLINE);
					setState(1266);
					match(KEYWORD);
					setState(1267);
					match(TAB);
					setState(1268);
					((CrawlItemDetailCompanyThreadContext)_localctx).fics = match(STRING);
					setState(1269);
					match(NEWLINE);
					setState(1270);
					match(KEYWORD);
					setState(1271);
					match(TAB);
					setState(1272);
					((CrawlItemDetailCompanyThreadContext)_localctx).ea = match(NUMBER);
					setState(1273);
					match(WORD);
					setState(1274);
					match(NEWLINE);
					setState(1275);
					match(KEYWORD);
					setState(1276);
					match(TAB);
					setState(1277);
					((CrawlItemDetailCompanyThreadContext)_localctx).ipo = match(DATE);
					setState(1278);
					match(NEWLINE);
					setState(1279);
					match(WORD);
					setState(1280);
					match(TAB);
					setState(1281);
					match(WORD);
					setState(1282);
					match(TAB);
					setState(1283);
					match(DATE);
					setState(1284);
					match(NEWLINE);

							ParserService.item(20240112
								, (((CrawlItemDetailCompanyThreadContext)_localctx).code!=null?_input.getText(((CrawlItemDetailCompanyThreadContext)_localctx).code.start,((CrawlItemDetailCompanyThreadContext)_localctx).code.stop):null)
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
				setState(1289); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1291);
			match(KEYWORD);
			setState(1292);
			match(TAB);
			setState(1293);
			match(WORD);
			setState(1294);
			match(WORD);
			setState(1295);
			match(TAB);
			setState(1296);
			match(WORD);
			setState(1297);
			match(TAB);
			setState(1298);
			match(WORD);
			setState(1299);
			match(TAB);
			setState(1300);
			match(WORD);
			setState(1301);
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
		public WordContext code;
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroParser.DATE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SeibroParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SeibroParser.NUMBER, i);
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
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).enterCrawlItemDividendTopCompany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).exitCrawlItemDividendTopCompany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroVisitor ) return ((SeibroVisitor<? extends T>)visitor).visitCrawlItemDividendTopCompany(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlItemDividendTopCompanyContext crawlItemDividendTopCompany() throws RecognitionException {
		CrawlItemDividendTopCompanyContext _localctx = new CrawlItemDividendTopCompanyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_crawlItemDividendTopCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			match(KEYWORD);
			setState(1304);
			match(TAB);
			setState(1305);
			match(WORD);
			setState(1306);
			match(TAB);
			setState(1307);
			match(WORD);
			setState(1308);
			match(WORD);
			setState(1309);
			match(WORD);
			setState(1310);
			match(TAB);
			setState(1311);
			match(WORD);
			setState(1312);
			match(TAB);
			setState(1313);
			match(WORD);
			setState(1314);
			match(NEWLINE);
			setState(1383); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1315);
				match(WORD);
				setState(1316);
				match(TAB);
				setState(1317);
				match(NEWLINE);
				setState(1318);
				match(WORD);
				setState(1319);
				match(TAB);
				setState(1320);
				match(WORD);
				setState(1321);
				match(TAB);
				setState(1322);
				match(WORD);
				setState(1323);
				match(TAB);
				setState(1324);
				match(WORD);
				setState(1325);
				match(TAB);
				setState(1326);
				match(WORD);
				setState(1327);
				match(TAB);
				setState(1328);
				match(WORD);
				setState(1329);
				match(TAB);
				setState(1330);
				match(WORD);
				setState(1331);
				match(TAB);
				setState(1332);
				match(WORD);
				setState(1333);
				match(TAB);
				setState(1334);
				match(WORD);
				setState(1335);
				match(TAB);
				setState(1336);
				match(WORD);
				setState(1337);
				match(TAB);
				setState(1338);
				match(WORD);
				setState(1339);
				match(TAB);
				setState(1340);
				match(NEWLINE);
				setState(1372); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1341);
						((CrawlItemDividendTopCompanyContext)_localctx).type = match(WORD);
						setState(1342);
						match(TAB);
						setState(1343);
						match(NUMBER);
						setState(1344);
						match(TAB);
						setState(1346);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							setState(1345);
							((CrawlItemDividendTopCompanyContext)_localctx).code = word();
							}
						}

						setState(1348);
						match(TAB);
						setState(1350); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1349);
							word();
							}
							}
							setState(1352); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(1354);
						match(TAB);
						setState(1355);
						match(WORD);
						setState(1356);
						match(TAB);
						setState(1357);
						match(WORD);
						setState(1358);
						match(TAB);
						setState(1359);
						match(NUMBER);
						setState(1360);
						match(TAB);
						setState(1361);
						match(NUMBER);
						setState(1362);
						match(TAB);
						setState(1363);
						match(NUMBER);
						setState(1364);
						match(TAB);
						setState(1365);
						match(NUMBER);
						setState(1366);
						match(TAB);
						setState(1367);
						match(NUMBER);
						setState(1368);
						match(TAB);
						setState(1369);
						match(NEWLINE);

									ParserService.item(20240112
										, (((CrawlItemDividendTopCompanyContext)_localctx).code!=null?_input.getText(((CrawlItemDividendTopCompanyContext)_localctx).code.start,((CrawlItemDividendTopCompanyContext)_localctx).code.stop):null)
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
					setState(1374); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1376);
				match(WORD);
				setState(1377);
				match(TAB);
				setState(1378);
				match(WORD);
				setState(1379);
				match(TAB);
				setState(1380);
				match(DATE);
				setState(1381);
				match(NEWLINE);
				}
				}
				setState(1385); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1387);
			match(KEYWORD);
			setState(1388);
			match(TAB);
			setState(1389);
			match(WORD);
			setState(1390);
			match(TAB);
			setState(1391);
			match(WORD);
			setState(1392);
			match(WORD);
			setState(1393);
			match(WORD);
			setState(1394);
			match(TAB);
			setState(1395);
			match(WORD);
			setState(1396);
			match(TAB);
			setState(1397);
			match(WORD);
			setState(1398);
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
		public WordContext fee;
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroParser.DATE, i);
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
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).enterCrawlEtfDetailThread(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).exitCrawlEtfDetailThread(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroVisitor ) return ((SeibroVisitor<? extends T>)visitor).visitCrawlEtfDetailThread(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlEtfDetailThreadContext crawlEtfDetailThread() throws RecognitionException {
		CrawlEtfDetailThreadContext _localctx = new CrawlEtfDetailThreadContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_crawlEtfDetailThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1400);
			match(KEYWORD);
			setState(1401);
			match(TAB);
			setState(1402);
			match(WORD);
			setState(1403);
			match(WORD);
			setState(1404);
			match(TAB);
			setState(1405);
			match(WORD);
			setState(1406);
			match(TAB);
			setState(1407);
			match(WORD);
			setState(1408);
			match(NEWLINE);
			setState(1490); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1409);
					match(KEYWORD);
					setState(1410);
					match(TAB);
					setState(1411);
					((CrawlEtfDetailThreadContext)_localctx).code = word();
					setState(1412);
					match(TAB);
					setState(1416);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(1413);
						word();
						}
						}
						setState(1418);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1419);
					match(NEWLINE);
					setState(1420);
					((CrawlEtfDetailThreadContext)_localctx).symbol = word();
					setState(1422);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
					case 1:
						{
						setState(1421);
						((CrawlEtfDetailThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(1425);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
					case 1:
						{
						setState(1424);
						((CrawlEtfDetailThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(1428);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
					case 1:
						{
						setState(1427);
						((CrawlEtfDetailThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(1431);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
					case 1:
						{
						setState(1430);
						((CrawlEtfDetailThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(1434);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
					case 1:
						{
						setState(1433);
						((CrawlEtfDetailThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(1437);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
					case 1:
						{
						setState(1436);
						((CrawlEtfDetailThreadContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(1442);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(1439);
						((CrawlEtfDetailThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(1444);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1445);
					match(NEWLINE);
					setState(1446);
					((CrawlEtfDetailThreadContext)_localctx).category = word();
					setState(1448);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
					case 1:
						{
						setState(1447);
						((CrawlEtfDetailThreadContext)_localctx).category1 = word();
						}
						break;
					}
					setState(1451);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
					case 1:
						{
						setState(1450);
						((CrawlEtfDetailThreadContext)_localctx).category2 = word();
						}
						break;
					}
					setState(1454);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
					case 1:
						{
						setState(1453);
						((CrawlEtfDetailThreadContext)_localctx).category3 = word();
						}
						break;
					}
					setState(1457);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
					case 1:
						{
						setState(1456);
						((CrawlEtfDetailThreadContext)_localctx).category4 = word();
						}
						break;
					}
					setState(1460);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
					case 1:
						{
						setState(1459);
						((CrawlEtfDetailThreadContext)_localctx).category5 = word();
						}
						break;
					}
					setState(1463);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
					case 1:
						{
						setState(1462);
						((CrawlEtfDetailThreadContext)_localctx).category6 = word();
						}
						break;
					}
					setState(1468);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(1465);
						((CrawlEtfDetailThreadContext)_localctx).category7 = word();
						}
						}
						setState(1470);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1471);
					match(NEWLINE);
					setState(1472);
					((CrawlEtfDetailThreadContext)_localctx).ipo = match(DATE);
					setState(1476);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WORD) {
						{
						{
						setState(1473);
						match(WORD);
						}
						}
						setState(1478);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1479);
					match(NEWLINE);
					setState(1480);
					((CrawlEtfDetailThreadContext)_localctx).fee = word();
					setState(1481);
					match(NEWLINE);
					setState(1482);
					match(WORD);
					setState(1483);
					match(TAB);
					setState(1484);
					match(WORD);
					setState(1485);
					match(TAB);
					setState(1486);
					match(DATE);
					setState(1487);
					match(NEWLINE);

								ParserService.item(20240112
									, (((CrawlEtfDetailThreadContext)_localctx).code!=null?_input.getText(((CrawlEtfDetailThreadContext)_localctx).code.start,((CrawlEtfDetailThreadContext)_localctx).code.stop):null)
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
				setState(1492); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1494);
			match(KEYWORD);
			setState(1495);
			match(TAB);
			setState(1496);
			match(WORD);
			setState(1497);
			match(WORD);
			setState(1498);
			match(TAB);
			setState(1499);
			match(WORD);
			setState(1500);
			match(TAB);
			setState(1501);
			match(WORD);
			setState(1502);
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
		public WordContext code;
		public Token base;
		public Token pay;
		public Token dividend;
		public Token price;
		public Token ratio;
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroParser.DATE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SeibroParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SeibroParser.NUMBER, i);
		}
		public CrawlDividendHistoryEtfThreadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crawlDividendHistoryEtfThread; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).enterCrawlDividendHistoryEtfThread(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).exitCrawlDividendHistoryEtfThread(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroVisitor ) return ((SeibroVisitor<? extends T>)visitor).visitCrawlDividendHistoryEtfThread(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlDividendHistoryEtfThreadContext crawlDividendHistoryEtfThread() throws RecognitionException {
		CrawlDividendHistoryEtfThreadContext _localctx = new CrawlDividendHistoryEtfThreadContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_crawlDividendHistoryEtfThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			match(KEYWORD);
			setState(1505);
			match(TAB);
			setState(1506);
			match(WORD);
			setState(1507);
			match(WORD);
			setState(1508);
			match(WORD);
			setState(1509);
			match(TAB);
			setState(1510);
			match(WORD);
			setState(1511);
			match(WORD);
			setState(1512);
			match(WORD);
			setState(1513);
			match(TAB);
			setState(1514);
			match(WORD);
			setState(1515);
			match(TAB);
			setState(1516);
			match(WORD);
			setState(1517);
			match(NEWLINE);
			setState(1622); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1518);
				match(WORD);
				setState(1519);
				match(TAB);
				setState(1521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORD) {
					{
					setState(1520);
					match(WORD);
					}
				}

				setState(1523);
				match(TAB);
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
				match(TAB);
				setState(1532);
				match(WORD);
				setState(1533);
				match(TAB);
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
				match(NEWLINE);
				setState(1612); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(1612);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case TAB:
							{
							{
							setState(1541);
							match(TAB);
							setState(1542);
							match(TAB);
							setState(1543);
							match(TAB);
							setState(1544);
							match(TAB);
							setState(1545);
							match(TAB);
							setState(1546);
							match(TAB);
							setState(1547);
							match(TAB);
							setState(1548);
							match(TAB);
							setState(1549);
							match(TAB);
							setState(1550);
							match(TAB);
							setState(1551);
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
							setState(1552);
							((CrawlDividendHistoryEtfThreadContext)_localctx).symbol = word();
							setState(1554);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
							case 1:
								{
								setState(1553);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(1557);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
							case 1:
								{
								setState(1556);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(1560);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
							case 1:
								{
								setState(1559);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(1563);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
							case 1:
								{
								setState(1562);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(1566);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
							case 1:
								{
								setState(1565);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(1569);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
							case 1:
								{
								setState(1568);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(1574);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(1571);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol7 = word();
								}
								}
								setState(1576);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1577);
							match(TAB);
							setState(1578);
							((CrawlDividendHistoryEtfThreadContext)_localctx).code = word();
							setState(1579);
							match(TAB);
							setState(1580);
							match(WORD);
							setState(1581);
							match(TAB);
							setState(1585);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(1582);
								word();
								}
								}
								setState(1587);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1588);
							match(TAB);
							setState(1590);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==DATE) {
								{
								setState(1589);
								((CrawlDividendHistoryEtfThreadContext)_localctx).base = match(DATE);
								}
							}

							setState(1592);
							match(TAB);
							setState(1593);
							((CrawlDividendHistoryEtfThreadContext)_localctx).pay = match(DATE);
							setState(1594);
							match(TAB);
							setState(1596);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==WORD) {
								{
								setState(1595);
								match(WORD);
								}
							}

							setState(1598);
							match(TAB);
							setState(1599);
							((CrawlDividendHistoryEtfThreadContext)_localctx).dividend = match(NUMBER);
							setState(1600);
							match(TAB);
							setState(1602);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NUMBER) {
								{
								setState(1601);
								((CrawlDividendHistoryEtfThreadContext)_localctx).price = match(NUMBER);
								}
							}

							setState(1604);
							match(TAB);
							setState(1606);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NUMBER) {
								{
								setState(1605);
								((CrawlDividendHistoryEtfThreadContext)_localctx).ratio = match(NUMBER);
								}
							}

							setState(1608);
							match(TAB);
							setState(1609);
							match(NEWLINE);

												ParserService.dividend(20231127
													, (((CrawlDividendHistoryEtfThreadContext)_localctx).code!=null?_input.getText(((CrawlDividendHistoryEtfThreadContext)_localctx).code.start,((CrawlDividendHistoryEtfThreadContext)_localctx).code.stop):null)
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
					setState(1614); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1616);
				match(WORD);
				setState(1617);
				match(TAB);
				setState(1618);
				match(WORD);
				setState(1619);
				match(TAB);
				setState(1620);
				match(DATE);
				setState(1621);
				match(NEWLINE);
				}
				}
				setState(1624); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1626);
			match(KEYWORD);
			setState(1627);
			match(TAB);
			setState(1628);
			match(WORD);
			setState(1629);
			match(WORD);
			setState(1630);
			match(WORD);
			setState(1631);
			match(TAB);
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
			match(TAB);
			setState(1638);
			match(WORD);
			setState(1639);
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
		public WordContext code;
		public WordContext symbol;
		public Token dividend;
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroParser.DATE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SeibroParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SeibroParser.NUMBER, i);
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
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).enterCrawlDividendHistoryCompanyThread(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).exitCrawlDividendHistoryCompanyThread(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroVisitor ) return ((SeibroVisitor<? extends T>)visitor).visitCrawlDividendHistoryCompanyThread(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlDividendHistoryCompanyThreadContext crawlDividendHistoryCompanyThread() throws RecognitionException {
		CrawlDividendHistoryCompanyThreadContext _localctx = new CrawlDividendHistoryCompanyThreadContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_crawlDividendHistoryCompanyThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			match(KEYWORD);
			setState(1642);
			match(TAB);
			setState(1643);
			match(WORD);
			setState(1644);
			match(TAB);
			setState(1645);
			match(WORD);
			setState(1646);
			match(WORD);
			setState(1647);
			match(WORD);
			setState(1648);
			match(TAB);
			setState(1649);
			match(WORD);
			setState(1650);
			match(TAB);
			setState(1651);
			match(WORD);
			setState(1652);
			match(NEWLINE);
			setState(1780); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1770); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1653);
						match(WORD);
						setState(1654);
						match(TAB);
						setState(1655);
						match(WORD);
						setState(1656);
						match(WORD);
						setState(1657);
						match(TAB);
						setState(1658);
						match(WORD);
						setState(1659);
						match(WORD);
						setState(1660);
						match(TAB);
						setState(1661);
						match(WORD);
						setState(1662);
						match(WORD);
						setState(1663);
						match(TAB);
						setState(1664);
						match(WORD);
						setState(1665);
						match(TAB);
						setState(1666);
						match(WORD);
						setState(1667);
						match(TAB);
						setState(1668);
						match(WORD);
						setState(1669);
						match(TAB);
						setState(1670);
						match(WORD);
						setState(1671);
						match(TAB);
						setState(1672);
						match(WORD);
						setState(1673);
						match(TAB);
						setState(1674);
						match(WORD);
						setState(1675);
						match(TAB);
						setState(1676);
						match(WORD);
						setState(1677);
						match(TAB);
						setState(1678);
						match(WORD);
						setState(1679);
						match(TAB);
						setState(1680);
						match(WORD);
						setState(1681);
						match(TAB);
						setState(1682);
						match(TAB);
						setState(1683);
						match(TAB);
						setState(1684);
						match(WORD);
						setState(1685);
						match(TAB);
						setState(1686);
						match(WORD);
						setState(1687);
						match(TAB);
						setState(1688);
						match(NEWLINE);
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
						match(TAB);
						setState(1702);
						match(TAB);
						setState(1703);
						match(NEWLINE);
						setState(1766); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(1766);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case TAB:
								{
								{
								setState(1705); 
								_errHandler.sync(this);
								_la = _input.LA(1);
								do {
									{
									{
									setState(1704);
									match(TAB);
									}
									}
									setState(1707); 
									_errHandler.sync(this);
									_la = _input.LA(1);
								} while ( _la==TAB );
								setState(1709);
								match(NEWLINE);
								}
								}
								break;
							case DATE:
								{
								{
								setState(1710);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).base = match(DATE);
								setState(1711);
								match(TAB);
								setState(1713);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(1712);
									((CrawlDividendHistoryCompanyThreadContext)_localctx).pay = match(DATE);
									}
								}

								setState(1715);
								match(TAB);
								setState(1717);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(1716);
									match(DATE);
									}
								}

								setState(1719);
								match(TAB);
								setState(1721);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(1720);
									match(DATE);
									}
								}

								setState(1723);
								match(TAB);
								setState(1724);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).code = word();
								setState(1725);
								match(TAB);
								setState(1727); 
								_errHandler.sync(this);
								_la = _input.LA(1);
								do {
									{
									{
									setState(1726);
									((CrawlDividendHistoryCompanyThreadContext)_localctx).symbol = word();
									}
									}
									setState(1729); 
									_errHandler.sync(this);
									_la = _input.LA(1);
								} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
								setState(1731);
								match(TAB);
								setState(1732);
								match(WORD);
								setState(1733);
								match(TAB);
								setState(1734);
								match(WORD);
								setState(1735);
								match(TAB);
								setState(1736);
								match(WORD);
								setState(1737);
								match(TAB);
								setState(1738);
								match(WORD);
								setState(1739);
								match(TAB);
								setState(1740);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).dividend = match(NUMBER);
								setState(1741);
								match(TAB);
								setState(1743);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(1742);
									match(NUMBER);
									}
								}

								setState(1745);
								match(TAB);
								setState(1746);
								match(NUMBER);
								setState(1747);
								match(TAB);
								setState(1748);
								match(NUMBER);
								setState(1749);
								match(TAB);
								setState(1751);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(1750);
									match(NUMBER);
									}
								}

								setState(1754); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(1753);
										match(TAB);
										}
										}
										break;
									default:
										throw new NoViableAltException(this);
									}
									setState(1756); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
								} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
								setState(1758);
								match(TAB);
								setState(1759);
								match(NUMBER);
								setState(1760);
								match(TAB);
								setState(1761);
								match(NUMBER);
								setState(1762);
								match(TAB);
								setState(1763);
								match(NEWLINE);

														ParserService.dividend(20240517
															, (((CrawlDividendHistoryCompanyThreadContext)_localctx).code!=null?_input.getText(((CrawlDividendHistoryCompanyThreadContext)_localctx).code.start,((CrawlDividendHistoryCompanyThreadContext)_localctx).code.stop):null)
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
							setState(1768); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1772); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1774);
				match(WORD);
				setState(1775);
				match(TAB);
				setState(1776);
				match(WORD);
				setState(1777);
				match(TAB);
				setState(1778);
				match(DATE);
				setState(1779);
				match(NEWLINE);
				}
				}
				setState(1782); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1784);
			match(KEYWORD);
			setState(1785);
			match(TAB);
			setState(1786);
			match(WORD);
			setState(1787);
			match(TAB);
			setState(1788);
			match(WORD);
			setState(1789);
			match(WORD);
			setState(1790);
			match(WORD);
			setState(1791);
			match(TAB);
			setState(1792);
			match(WORD);
			setState(1793);
			match(TAB);
			setState(1794);
			match(WORD);
			setState(1795);
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
		public TerminalNode WORD() { return getToken(SeibroParser.WORD, 0); }
		public TerminalNode KEYWORD() { return getToken(SeibroParser.KEYWORD, 0); }
		public TerminalNode NUMBER() { return getToken(SeibroParser.NUMBER, 0); }
		public TerminalNode TIME() { return getToken(SeibroParser.TIME, 0); }
		public TerminalNode DATE() { return getToken(SeibroParser.DATE, 0); }
		public TerminalNode STRING() { return getToken(SeibroParser.STRING, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroVisitor ) return ((SeibroVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1797);
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
		public TerminalNode NEWLINE() { return getToken(SeibroParser.NEWLINE, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroParser.TAB, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroVisitor ) return ((SeibroVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1801); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1801);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(1799);
					word();
					}
					break;
				case TAB:
					{
					setState(1800);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1803); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(1805);
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
		public List<TerminalNode> TAB() { return getTokens(SeibroParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroParser.TAB, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroParser.NEWLINE, i);
		}
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroListener ) ((SeibroListener)listener).exitEof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroVisitor ) return ((SeibroVisitor<? extends T>)visitor).visitEof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_eof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1810);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(1807);
					word();
					}
					break;
				case TAB:
					{
					setState(1808);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(1809);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1812); 
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
		"\u0004\u0001\n\u0717\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u00006\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001q\b\u0001\u000b\u0001\f\u0001r\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001y\b\u0001\u000b"+
		"\u0001\f\u0001z\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u0089\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u008d\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u0093\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0097\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u009b\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u00a5\b\u0001\n\u0001\f\u0001\u00a8\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u00b0"+
		"\b\u0001\u000b\u0001\f\u0001\u00b1\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0004\u0002\u00f9\b\u0002\u000b\u0002\f\u0002\u00fa\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u0111\b\u0002\n\u0002\f\u0002\u0114\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002"+
		"\u011c\b\u0002\u000b\u0002\f\u0002\u011d\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u0151"+
		"\b\u0003\u000b\u0003\f\u0003\u0152\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u017c\b\u0003\n\u0003\f\u0003\u017f\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u0187"+
		"\b\u0003\u000b\u0003\f\u0003\u0188\u0001\u0003\u0001\u0003\u0001\u0003"+
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
		"\u0004\u0004\u01d6\b\u0004\u000b\u0004\f\u0004\u01d7\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004"+
		"\u0004\u01e1\b\u0004\u000b\u0004\f\u0004\u01e2\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
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
		"\u0001\u0005\u0001\u0005\u0004\u0005\u0237\b\u0005\u000b\u0005\f\u0005"+
		"\u0238\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0004\u0005\u0242\b\u0005\u000b\u0005\f\u0005\u0243"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0269\b\u0006\u0001\u0006\u0003\u0006\u026c\b\u0006\u0001\u0006\u0003"+
		"\u0006\u026f\b\u0006\u0001\u0006\u0003\u0006\u0272\b\u0006\u0001\u0006"+
		"\u0003\u0006\u0275\b\u0006\u0001\u0006\u0003\u0006\u0278\b\u0006\u0001"+
		"\u0006\u0005\u0006\u027b\b\u0006\n\u0006\f\u0006\u027e\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0295\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0004\u0006\u02a1\b\u0006\u000b\u0006\f\u0006"+
		"\u02a2\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0004\u0007\u02c3\b\u0007\u000b\u0007\f\u0007\u02c4\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u02ca\b\u0007\u0001\u0007\u0003\u0007"+
		"\u02cd\b\u0007\u0001\u0007\u0003\u0007\u02d0\b\u0007\u0001\u0007\u0003"+
		"\u0007\u02d3\b\u0007\u0001\u0007\u0003\u0007\u02d6\b\u0007\u0001\u0007"+
		"\u0003\u0007\u02d9\b\u0007\u0001\u0007\u0005\u0007\u02dc\b\u0007\n\u0007"+
		"\f\u0007\u02df\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u02e4\b\u0007\u0001\u0007\u0003\u0007\u02e7\b\u0007\u0001\u0007\u0003"+
		"\u0007\u02ea\b\u0007\u0001\u0007\u0003\u0007\u02ed\b\u0007\u0001\u0007"+
		"\u0003\u0007\u02f0\b\u0007\u0001\u0007\u0003\u0007\u02f3\b\u0007\u0001"+
		"\u0007\u0005\u0007\u02f6\b\u0007\n\u0007\f\u0007\u02f9\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u02fe\b\u0007\n\u0007\f\u0007\u0301"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0004\u0007\u030a\b\u0007\u000b\u0007\f\u0007\u030b"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0004\u0007\u0315\b\u0007\u000b\u0007\f\u0007\u0316\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0359"+
		"\b\b\u0001\b\u0003\b\u035c\b\b\u0001\b\u0003\b\u035f\b\b\u0001\b\u0003"+
		"\b\u0362\b\b\u0001\b\u0003\b\u0365\b\b\u0001\b\u0003\b\u0368\b\b\u0001"+
		"\b\u0005\b\u036b\b\b\n\b\f\b\u036e\t\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\b\u0375\b\b\u0001\b\u0003\b\u0378\b\b\u0001\b\u0003\b\u037b"+
		"\b\b\u0001\b\u0003\b\u037e\b\b\u0001\b\u0003\b\u0381\b\b\u0001\b\u0003"+
		"\b\u0384\b\b\u0001\b\u0005\b\u0387\b\b\n\b\f\b\u038a\t\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u0396\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u039f\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u03a7"+
		"\b\b\u000b\b\f\b\u03a8\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0004\b\u03b2\b\b\u000b\b\f\b\u03b3\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u03d1\b\t\u000b\t\f"+
		"\t\u03d2\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u03da\b\t\u0001"+
		"\t\u0003\t\u03dd\b\t\u0001\t\u0003\t\u03e0\b\t\u0001\t\u0003\t\u03e3\b"+
		"\t\u0001\t\u0003\t\u03e6\b\t\u0001\t\u0003\t\u03e9\b\t\u0001\t\u0005\t"+
		"\u03ec\b\t\n\t\f\t\u03ef\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u03f6\b\t\u0001\t\u0003\t\u03f9\b\t\u0001\t\u0003\t\u03fc\b\t\u0001"+
		"\t\u0003\t\u03ff\b\t\u0001\t\u0003\t\u0402\b\t\u0001\t\u0003\t\u0405\b"+
		"\t\u0001\t\u0005\t\u0408\b\t\n\t\f\t\u040b\t\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u042f\b\t\u0001\t\u0001\t\u0003"+
		"\t\u0433\b\t\u0001\t\u0001\t\u0003\t\u0437\b\t\u0001\t\u0001\t\u0003\t"+
		"\u043b\b\t\u0001\t\u0001\t\u0003\t\u043f\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u0447\b\t\u0001\t\u0001\t\u0001\t\u0004\t\u044c"+
		"\b\t\u000b\t\f\t\u044d\u0004\t\u0450\b\t\u000b\t\f\t\u0451\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u045b\b\t\u000b\t\f"+
		"\t\u045c\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0004\n\u0479\b\n\u000b\n\f\n\u047a\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0004\n\u04a5\b\n\u000b\n\f\n\u04a6\u0004\n\u04a9\b\n\u000b\n\f\n\u04aa"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u04b4"+
		"\b\n\u000b\n\f\n\u04b5\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u04d7\b\u000b\u0001\u000b\u0003\u000b\u04da\b\u000b\u0001\u000b\u0003"+
		"\u000b\u04dd\b\u000b\u0001\u000b\u0003\u000b\u04e0\b\u000b\u0001\u000b"+
		"\u0003\u000b\u04e3\b\u000b\u0001\u000b\u0003\u000b\u04e6\b\u000b\u0001"+
		"\u000b\u0005\u000b\u04e9\b\u000b\n\u000b\f\u000b\u04ec\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0004\u000b\u0508\b\u000b\u000b\u000b\f\u000b\u0509\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0543\b\f\u0001"+
		"\f\u0001\f\u0004\f\u0547\b\f\u000b\f\f\f\u0548\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u055d\b\f\u000b"+
		"\f\f\f\u055e\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004"+
		"\f\u0568\b\f\u000b\f\f\f\u0569\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0587\b\r\n\r\f\r\u058a\t\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u058f\b\r\u0001\r\u0003\r\u0592\b\r\u0001"+
		"\r\u0003\r\u0595\b\r\u0001\r\u0003\r\u0598\b\r\u0001\r\u0003\r\u059b\b"+
		"\r\u0001\r\u0003\r\u059e\b\r\u0001\r\u0005\r\u05a1\b\r\n\r\f\r\u05a4\t"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u05a9\b\r\u0001\r\u0003\r\u05ac\b\r"+
		"\u0001\r\u0003\r\u05af\b\r\u0001\r\u0003\r\u05b2\b\r\u0001\r\u0003\r\u05b5"+
		"\b\r\u0001\r\u0003\r\u05b8\b\r\u0001\r\u0005\r\u05bb\b\r\n\r\f\r\u05be"+
		"\t\r\u0001\r\u0001\r\u0001\r\u0005\r\u05c3\b\r\n\r\f\r\u05c6\t\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0004\r\u05d3\b\r\u000b\r\f\r\u05d4\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u05f2\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0613\b\u000e\u0001\u000e\u0003\u000e\u0616\b\u000e"+
		"\u0001\u000e\u0003\u000e\u0619\b\u000e\u0001\u000e\u0003\u000e\u061c\b"+
		"\u000e\u0001\u000e\u0003\u000e\u061f\b\u000e\u0001\u000e\u0003\u000e\u0622"+
		"\b\u000e\u0001\u000e\u0005\u000e\u0625\b\u000e\n\u000e\f\u000e\u0628\t"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0630\b\u000e\n\u000e\f\u000e\u0633\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0637\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u063d\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0643\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0647\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e"+
		"\u064d\b\u000e\u000b\u000e\f\u000e\u064e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u0657\b\u000e\u000b"+
		"\u000e\f\u000e\u0658\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u06aa\b\u000f\u000b\u000f\f"+
		"\u000f\u06ab\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u06b2\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u06b6\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u06ba\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0004\u000f\u06c0\b\u000f\u000b\u000f\f\u000f\u06c1"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u06d0\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u06d8\b\u000f\u0001\u000f\u0004\u000f"+
		"\u06db\b\u000f\u000b\u000f\f\u000f\u06dc\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004"+
		"\u000f\u06e7\b\u000f\u000b\u000f\f\u000f\u06e8\u0004\u000f\u06eb\b\u000f"+
		"\u000b\u000f\f\u000f\u06ec\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0004\u000f\u06f5\b\u000f\u000b\u000f\f\u000f"+
		"\u06f6\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0004"+
		"\u0011\u070a\b\u0011\u000b\u0011\f\u0011\u070b\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u0713\b\u0012\u000b\u0012"+
		"\f\u0012\u0714\u0001\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0001"+
		"\u0001\u0000\u0005\n\u07b0\u00005\u0001\u0000\u0000\u0000\u00027\u0001"+
		"\u0000\u0000\u0000\u0004\u00be\u0001\u0000\u0000\u0000\u0006\u012c\u0001"+
		"\u0000\u0000\u0000\b\u0197\u0001\u0000\u0000\u0000\n\u01f1\u0001\u0000"+
		"\u0000\u0000\f\u0254\u0001\u0000\u0000\u0000\u000e\u02b1\u0001\u0000\u0000"+
		"\u0000\u0010\u0325\u0001\u0000\u0000\u0000\u0012\u03c2\u0001\u0000\u0000"+
		"\u0000\u0014\u046a\u0001\u0000\u0000\u0000\u0016\u04c3\u0001\u0000\u0000"+
		"\u0000\u0018\u0517\u0001\u0000\u0000\u0000\u001a\u0578\u0001\u0000\u0000"+
		"\u0000\u001c\u05e0\u0001\u0000\u0000\u0000\u001e\u0669\u0001\u0000\u0000"+
		"\u0000 \u0705\u0001\u0000\u0000\u0000\"\u0709\u0001\u0000\u0000\u0000"+
		"$\u0712\u0001\u0000\u0000\u0000&6\u0003\u001e\u000f\u0000\'6\u0003\u001c"+
		"\u000e\u0000(6\u0003\u0018\f\u0000)6\u0003\u0010\b\u0000*6\u0003\u0016"+
		"\u000b\u0000+6\u0003\u001a\r\u0000,6\u0003\u0014\n\u0000-6\u0003\u0012"+
		"\t\u0000.6\u0003\f\u0006\u0000/6\u0003\u000e\u0007\u000006\u0003\b\u0004"+
		"\u000016\u0003\n\u0005\u000026\u0003\u0006\u0003\u000036\u0003\u0002\u0001"+
		"\u000046\u0003\u0004\u0002\u00005&\u0001\u0000\u0000\u00005\'\u0001\u0000"+
		"\u0000\u00005(\u0001\u0000\u0000\u00005)\u0001\u0000\u0000\u00005*\u0001"+
		"\u0000\u0000\u00005+\u0001\u0000\u0000\u00005,\u0001\u0000\u0000\u0000"+
		"5-\u0001\u0000\u0000\u00005.\u0001\u0000\u0000\u00005/\u0001\u0000\u0000"+
		"\u000050\u0001\u0000\u0000\u000051\u0001\u0000\u0000\u000052\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u00006\u0001"+
		"\u0001\u0000\u0000\u000078\u0005\u0005\u0000\u000089\u0005\u0003\u0000"+
		"\u00009:\u0005\n\u0000\u0000:;\u0005\u0003\u0000\u0000;<\u0005\n\u0000"+
		"\u0000<=\u0005\n\u0000\u0000=>\u0005\n\u0000\u0000>?\u0005\u0003\u0000"+
		"\u0000?@\u0005\n\u0000\u0000@\u00af\u0005\u0004\u0000\u0000AB\u0005\n"+
		"\u0000\u0000BC\u0005\u0006\u0000\u0000CD\u0005\u0003\u0000\u0000DE\u0005"+
		"\u0004\u0000\u0000EF\u0005\n\u0000\u0000FG\u0005\u0006\u0000\u0000GH\u0005"+
		"\u0003\u0000\u0000HI\u0005\n\u0000\u0000IJ\u0005\u0003\u0000\u0000JK\u0005"+
		"\n\u0000\u0000KL\u0005\u0003\u0000\u0000LM\u0005\n\u0000\u0000MN\u0005"+
		"\u0003\u0000\u0000NO\u0005\n\u0000\u0000OP\u0005\u0003\u0000\u0000PQ\u0005"+
		"\n\u0000\u0000QR\u0005\u0003\u0000\u0000RS\u0005\n\u0000\u0000ST\u0005"+
		"\u0003\u0000\u0000TU\u0005\n\u0000\u0000UV\u0005\u0003\u0000\u0000VW\u0005"+
		"\n\u0000\u0000WX\u0005\u0003\u0000\u0000XY\u0005\n\u0000\u0000YZ\u0005"+
		"\u0003\u0000\u0000Z[\u0005\n\u0000\u0000[\\\u0005\u0003\u0000\u0000\\"+
		"]\u0005\n\u0000\u0000]^\u0005\u0003\u0000\u0000^_\u0005\n\u0000\u0000"+
		"_`\u0005\u0003\u0000\u0000`a\u0005\n\u0000\u0000ab\u0005\u0003\u0000\u0000"+
		"bc\u0005\n\u0000\u0000cd\u0005\u0003\u0000\u0000de\u0005\n\u0000\u0000"+
		"ef\u0005\u0003\u0000\u0000fg\u0005\n\u0000\u0000gh\u0005\u0003\u0000\u0000"+
		"hi\u0005\n\u0000\u0000ij\u0005\u0003\u0000\u0000j\u00a6\u0005\u0004\u0000"+
		"\u0000kl\u0005\n\u0000\u0000lm\u0005\u0006\u0000\u0000mn\u0005\u0003\u0000"+
		"\u0000np\u0005\u0003\u0000\u0000oq\u0003 \u0010\u0000po\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0005\u0003\u0000\u0000uv\u0003"+
		" \u0010\u0000vx\u0005\u0003\u0000\u0000wy\u0003 \u0010\u0000xw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0005\u0003\u0000\u0000"+
		"}~\u0005\b\u0000\u0000~\u007f\u0005\u0003\u0000\u0000\u007f\u0080\u0005"+
		"\b\u0000\u0000\u0080\u0081\u0005\u0003\u0000\u0000\u0081\u0082\u0005\b"+
		"\u0000\u0000\u0082\u0083\u0005\u0003\u0000\u0000\u0083\u0084\u0005\b\u0000"+
		"\u0000\u0084\u0085\u0005\u0003\u0000\u0000\u0085\u0086\u0005\b\u0000\u0000"+
		"\u0086\u0088\u0005\u0003\u0000\u0000\u0087\u0089\u0005\b\u0000\u0000\u0088"+
		"\u0087\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0005\u0003\u0000\u0000\u008b"+
		"\u008d\u0005\b\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0005\u0003\u0000\u0000\u008f\u0090\u0005\b\u0000\u0000\u0090\u0092\u0005"+
		"\u0003\u0000\u0000\u0091\u0093\u0005\b\u0000\u0000\u0092\u0091\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\u0096\u0005\u0003\u0000\u0000\u0095\u0097\u0005\b\u0000"+
		"\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a\u0005\u0003\u0000"+
		"\u0000\u0099\u009b\u0005\b\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0005\u0003\u0000\u0000\u009d\u009e\u0005\b\u0000\u0000\u009e"+
		"\u009f\u0005\u0003\u0000\u0000\u009f\u00a0\u0005\n\u0000\u0000\u00a0\u00a1"+
		"\u0005\u0003\u0000\u0000\u00a1\u00a2\u0005\u0004\u0000\u0000\u00a2\u00a3"+
		"\u0006\u0001\uffff\uffff\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4"+
		"k\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0005\n\u0000\u0000\u00aa\u00ab\u0005\u0003\u0000\u0000\u00ab\u00ac\u0005"+
		"\n\u0000\u0000\u00ac\u00ad\u0005\u0003\u0000\u0000\u00ad\u00ae\u0005\u0006"+
		"\u0000\u0000\u00ae\u00b0\u0005\u0004\u0000\u0000\u00afA\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0005\u0005\u0000\u0000\u00b4\u00b5\u0005\u0003\u0000"+
		"\u0000\u00b5\u00b6\u0005\n\u0000\u0000\u00b6\u00b7\u0005\u0003\u0000\u0000"+
		"\u00b7\u00b8\u0005\n\u0000\u0000\u00b8\u00b9\u0005\n\u0000\u0000\u00b9"+
		"\u00ba\u0005\n\u0000\u0000\u00ba\u00bb\u0005\u0003\u0000\u0000\u00bb\u00bc"+
		"\u0005\n\u0000\u0000\u00bc\u00bd\u0005\u0004\u0000\u0000\u00bd\u0003\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0005\u0005\u0000\u0000\u00bf\u00c0\u0005"+
		"\u0003\u0000\u0000\u00c0\u00c1\u0005\n\u0000\u0000\u00c1\u00c2\u0005\u0003"+
		"\u0000\u0000\u00c2\u00c3\u0005\n\u0000\u0000\u00c3\u00c4\u0005\n\u0000"+
		"\u0000\u00c4\u00c5\u0005\n\u0000\u0000\u00c5\u00c6\u0005\n\u0000\u0000"+
		"\u00c6\u00c7\u0005\n\u0000\u0000\u00c7\u00c8\u0005\u0003\u0000\u0000\u00c8"+
		"\u00c9\u0005\n\u0000\u0000\u00c9\u011b\u0005\u0004\u0000\u0000\u00ca\u00cb"+
		"\u0005\u0006\u0000\u0000\u00cb\u00cc\u0005\u0003\u0000\u0000\u00cc\u00cd"+
		"\u0005\n\u0000\u0000\u00cd\u00ce\u0005\u0003\u0000\u0000\u00ce\u00cf\u0005"+
		"\n\u0000\u0000\u00cf\u00d0\u0005\u0003\u0000\u0000\u00d0\u00d1\u0005\n"+
		"\u0000\u0000\u00d1\u00d2\u0005\u0003\u0000\u0000\u00d2\u00d3\u0005\n\u0000"+
		"\u0000\u00d3\u00d4\u0005\u0003\u0000\u0000\u00d4\u00d5\u0005\n\u0000\u0000"+
		"\u00d5\u00d6\u0005\u0003\u0000\u0000\u00d6\u00d7\u0005\n\u0000\u0000\u00d7"+
		"\u00d8\u0005\u0003\u0000\u0000\u00d8\u00d9\u0005\n\u0000\u0000\u00d9\u00da"+
		"\u0005\u0003\u0000\u0000\u00da\u00db\u0005\n\u0000\u0000\u00db\u00dc\u0005"+
		"\u0003\u0000\u0000\u00dc\u00dd\u0005\n\u0000\u0000\u00dd\u00de\u0005\u0003"+
		"\u0000\u0000\u00de\u00df\u0005\n\u0000\u0000\u00df\u00e0\u0005\u0003\u0000"+
		"\u0000\u00e0\u00e1\u0005\n\u0000\u0000\u00e1\u00e2\u0005\u0003\u0000\u0000"+
		"\u00e2\u00e3\u0005\n\u0000\u0000\u00e3\u00e4\u0005\u0003\u0000\u0000\u00e4"+
		"\u00e5\u0005\n\u0000\u0000\u00e5\u00e6\u0005\u0003\u0000\u0000\u00e6\u00e7"+
		"\u0005\n\u0000\u0000\u00e7\u00e8\u0005\u0003\u0000\u0000\u00e8\u00e9\u0005"+
		"\n\u0000\u0000\u00e9\u00ea\u0005\u0003\u0000\u0000\u00ea\u00eb\u0005\n"+
		"\u0000\u0000\u00eb\u00ec\u0005\u0003\u0000\u0000\u00ec\u00ed\u0005\n\u0000"+
		"\u0000\u00ed\u00ee\u0005\u0003\u0000\u0000\u00ee\u0112\u0005\u0004\u0000"+
		"\u0000\u00ef\u00f0\u0005\u0006\u0000\u0000\u00f0\u00f1\u0005\u0003\u0000"+
		"\u0000\u00f1\u00f2\u0005\u0003\u0000\u0000\u00f2\u0111\u0005\u0004\u0000"+
		"\u0000\u00f3\u00f4\u0005\u0006\u0000\u0000\u00f4\u00f5\u0005\u0003\u0000"+
		"\u0000\u00f5\u00f6\u0003 \u0010\u0000\u00f6\u00f8\u0005\u0003\u0000\u0000"+
		"\u00f7\u00f9\u0003 \u0010\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0005\u0003\u0000\u0000\u00fd\u00fe\u0005\b\u0000\u0000\u00fe\u00ff"+
		"\u0005\u0003\u0000\u0000\u00ff\u0100\u0005\b\u0000\u0000\u0100\u0101\u0005"+
		"\u0003\u0000\u0000\u0101\u0102\u0005\n\u0000\u0000\u0102\u0103\u0005\u0003"+
		"\u0000\u0000\u0103\u0104\u0005\b\u0000\u0000\u0104\u0105\u0005\u0003\u0000"+
		"\u0000\u0105\u0106\u0005\n\u0000\u0000\u0106\u0107\u0005\u0003\u0000\u0000"+
		"\u0107\u0108\u0005\b\u0000\u0000\u0108\u0109\u0005\u0003\u0000\u0000\u0109"+
		"\u010a\u0005\b\u0000\u0000\u010a\u010b\u0005\u0003\u0000\u0000\u010b\u010c"+
		"\u0005\b\u0000\u0000\u010c\u010d\u0005\u0003\u0000\u0000\u010d\u010e\u0005"+
		"\u0004\u0000\u0000\u010e\u010f\u0006\u0002\uffff\uffff\u0000\u010f\u0111"+
		"\u0001\u0000\u0000\u0000\u0110\u00ef\u0001\u0000\u0000\u0000\u0110\u00f3"+
		"\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0115"+
		"\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0005\n\u0000\u0000\u0116\u0117\u0005\u0003\u0000\u0000\u0117\u0118\u0005"+
		"\n\u0000\u0000\u0118\u0119\u0005\u0003\u0000\u0000\u0119\u011a\u0005\u0006"+
		"\u0000\u0000\u011a\u011c\u0005\u0004\u0000\u0000\u011b\u00ca\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0005\u0005\u0000\u0000\u0120\u0121\u0005\u0003"+
		"\u0000\u0000\u0121\u0122\u0005\n\u0000\u0000\u0122\u0123\u0005\u0003\u0000"+
		"\u0000\u0123\u0124\u0005\n\u0000\u0000\u0124\u0125\u0005\n\u0000\u0000"+
		"\u0125\u0126\u0005\n\u0000\u0000\u0126\u0127\u0005\n\u0000\u0000\u0127"+
		"\u0128\u0005\n\u0000\u0000\u0128\u0129\u0005\u0003\u0000\u0000\u0129\u012a"+
		"\u0005\n\u0000\u0000\u012a\u012b\u0005\u0004\u0000\u0000\u012b\u0005\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0005\u0005\u0000\u0000\u012d\u012e\u0005"+
		"\u0003\u0000\u0000\u012e\u012f\u0005\n\u0000\u0000\u012f\u0130\u0005\u0003"+
		"\u0000\u0000\u0130\u0131\u0005\n\u0000\u0000\u0131\u0132\u0005\n\u0000"+
		"\u0000\u0132\u0133\u0005\n\u0000\u0000\u0133\u0134\u0005\n\u0000\u0000"+
		"\u0134\u0135\u0005\n\u0000\u0000\u0135\u0136\u0005\u0003\u0000\u0000\u0136"+
		"\u0137\u0005\n\u0000\u0000\u0137\u0186\u0005\u0004\u0000\u0000\u0138\u0139"+
		"\u0005\n\u0000\u0000\u0139\u013a\u0005\n\u0000\u0000\u013a\u013b\u0005"+
		"\u0006\u0000\u0000\u013b\u013c\u0005\u0003\u0000\u0000\u013c\u013d\u0005"+
		"\n\u0000\u0000\u013d\u013e\u0005\n\u0000\u0000\u013e\u013f\u0005\n\u0000"+
		"\u0000\u013f\u0140\u0005\n\u0000\u0000\u0140\u0141\u0005\n\u0000\u0000"+
		"\u0141\u0142\u0005\n\u0000\u0000\u0142\u0143\u0005\n\u0000\u0000\u0143"+
		"\u0144\u0005\n\u0000\u0000\u0144\u017d\u0005\u0004\u0000\u0000\u0145\u0146"+
		"\u0005\n\u0000\u0000\u0146\u0147\u0005\n\u0000\u0000\u0147\u0148\u0005"+
		"\u0006\u0000\u0000\u0148\u0149\u0005\u0003\u0000\u0000\u0149\u014a\u0003"+
		" \u0010\u0000\u014a\u014b\u0005\u0004\u0000\u0000\u014b\u014c\u0005\n"+
		"\u0000\u0000\u014c\u014d\u0005\n\u0000\u0000\u014d\u014e\u0005\u0006\u0000"+
		"\u0000\u014e\u0150\u0005\u0003\u0000\u0000\u014f\u0151\u0003 \u0010\u0000"+
		"\u0150\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000"+
		"\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000"+
		"\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0155\u0005\u0004\u0000\u0000"+
		"\u0155\u0156\u0005\n\u0000\u0000\u0156\u0157\u0005\n\u0000\u0000\u0157"+
		"\u0158\u0005\u0006\u0000\u0000\u0158\u0159\u0005\u0003\u0000\u0000\u0159"+
		"\u015a\u0005\n\u0000\u0000\u015a\u015b\u0005\u0004\u0000\u0000\u015b\u015c"+
		"\u0005\n\u0000\u0000\u015c\u015d\u0005\n\u0000\u0000\u015d\u015e\u0005"+
		"\u0006\u0000\u0000\u015e\u015f\u0005\u0003\u0000\u0000\u015f\u0160\u0005"+
		"\b\u0000\u0000\u0160\u0161\u0005\u0004\u0000\u0000\u0161\u0162\u0005\n"+
		"\u0000\u0000\u0162\u0163\u0005\n\u0000\u0000\u0163\u0164\u0005\u0006\u0000"+
		"\u0000\u0164\u0165\u0005\u0003\u0000\u0000\u0165\u0166\u0005\b\u0000\u0000"+
		"\u0166\u0167\u0005\u0004\u0000\u0000\u0167\u0168\u0005\n\u0000\u0000\u0168"+
		"\u0169\u0005\n\u0000\u0000\u0169\u016a\u0005\u0006\u0000\u0000\u016a\u016b"+
		"\u0005\u0003\u0000\u0000\u016b\u016c\u0005\b\u0000\u0000\u016c\u016d\u0005"+
		"\u0004\u0000\u0000\u016d\u016e\u0005\n\u0000\u0000\u016e\u016f\u0005\n"+
		"\u0000\u0000\u016f\u0170\u0005\u0006\u0000\u0000\u0170\u0171\u0005\u0003"+
		"\u0000\u0000\u0171\u0172\u0005\b\u0000\u0000\u0172\u0173\u0005\u0004\u0000"+
		"\u0000\u0173\u0174\u0005\n\u0000\u0000\u0174\u0175\u0005\n\u0000\u0000"+
		"\u0175\u0176\u0005\u0006\u0000\u0000\u0176\u0177\u0005\u0003\u0000\u0000"+
		"\u0177\u0178\u0005\b\u0000\u0000\u0178\u0179\u0005\u0004\u0000\u0000\u0179"+
		"\u017a\u0006\u0003\uffff\uffff\u0000\u017a\u017c\u0001\u0000\u0000\u0000"+
		"\u017b\u0145\u0001\u0000\u0000\u0000\u017c\u017f\u0001\u0000\u0000\u0000"+
		"\u017d\u017b\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000"+
		"\u017e\u0180\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000"+
		"\u0180\u0181\u0005\n\u0000\u0000\u0181\u0182\u0005\u0003\u0000\u0000\u0182"+
		"\u0183\u0005\n\u0000\u0000\u0183\u0184\u0005\u0003\u0000\u0000\u0184\u0185"+
		"\u0005\u0006\u0000\u0000\u0185\u0187\u0005\u0004\u0000\u0000\u0186\u0138"+
		"\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0186"+
		"\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a"+
		"\u0001\u0000\u0000\u0000\u018a\u018b\u0005\u0005\u0000\u0000\u018b\u018c"+
		"\u0005\u0003\u0000\u0000\u018c\u018d\u0005\n\u0000\u0000\u018d\u018e\u0005"+
		"\u0003\u0000\u0000\u018e\u018f\u0005\n\u0000\u0000\u018f\u0190\u0005\n"+
		"\u0000\u0000\u0190\u0191\u0005\n\u0000\u0000\u0191\u0192\u0005\n\u0000"+
		"\u0000\u0192\u0193\u0005\n\u0000\u0000\u0193\u0194\u0005\u0003\u0000\u0000"+
		"\u0194\u0195\u0005\n\u0000\u0000\u0195\u0196\u0005\u0004\u0000\u0000\u0196"+
		"\u0007\u0001\u0000\u0000\u0000\u0197\u0198\u0005\u0005\u0000\u0000\u0198"+
		"\u0199\u0005\u0003\u0000\u0000\u0199\u019a\u0005\n\u0000\u0000\u019a\u019b"+
		"\u0005\u0003\u0000\u0000\u019b\u019c\u0005\n\u0000\u0000\u019c\u019d\u0005"+
		"\n\u0000\u0000\u019d\u019e\u0005\n\u0000\u0000\u019e\u019f\u0005\n\u0000"+
		"\u0000\u019f\u01a0\u0005\n\u0000\u0000\u01a0\u01a1\u0005\u0003\u0000\u0000"+
		"\u01a1\u01a2\u0005\n\u0000\u0000\u01a2\u01e0\u0005\u0004\u0000\u0000\u01a3"+
		"\u01a4\u0003 \u0010\u0000\u01a4\u01a5\u0005\u0003\u0000\u0000\u01a5\u01a6"+
		"\u0005\u0004\u0000\u0000\u01a6\u01a7\u0003 \u0010\u0000\u01a7\u01a8\u0005"+
		"\u0003\u0000\u0000\u01a8\u01a9\u0005\n\u0000\u0000\u01a9\u01aa\u0005\u0003"+
		"\u0000\u0000\u01aa\u01ab\u0005\n\u0000\u0000\u01ab\u01ac\u0005\u0003\u0000"+
		"\u0000\u01ac\u01ad\u0005\n\u0000\u0000\u01ad\u01ae\u0005\u0003\u0000\u0000"+
		"\u01ae\u01af\u0005\n\u0000\u0000\u01af\u01b0\u0005\u0003\u0000\u0000\u01b0"+
		"\u01b1\u0005\n\u0000\u0000\u01b1\u01b2\u0005\u0003\u0000\u0000\u01b2\u01b3"+
		"\u0005\n\u0000\u0000\u01b3\u01b4\u0005\u0003\u0000\u0000\u01b4\u01b5\u0005"+
		"\n\u0000\u0000\u01b5\u01b6\u0005\u0003\u0000\u0000\u01b6\u01d5\u0005\u0004"+
		"\u0000\u0000\u01b7\u01b8\u0003 \u0010\u0000\u01b8\u01b9\u0005\u0003\u0000"+
		"\u0000\u01b9\u01ba\u0005\u0003\u0000\u0000\u01ba\u01bb\u0005\u0003\u0000"+
		"\u0000\u01bb\u01bc\u0005\u0003\u0000\u0000\u01bc\u01bd\u0005\u0003\u0000"+
		"\u0000\u01bd\u01be\u0005\u0003\u0000\u0000\u01be\u01bf\u0005\u0003\u0000"+
		"\u0000\u01bf\u01c0\u0005\u0003\u0000\u0000\u01c0\u01c1\u0005\u0004\u0000"+
		"\u0000\u01c1\u01d6\u0001\u0000\u0000\u0000\u01c2\u01c3\u0003 \u0010\u0000"+
		"\u01c3\u01c4\u0005\u0003\u0000\u0000\u01c4\u01c5\u0005\u0006\u0000\u0000"+
		"\u01c5\u01c6\u0005\u0003\u0000\u0000\u01c6\u01c7\u0005\b\u0000\u0000\u01c7"+
		"\u01c8\u0005\u0003\u0000\u0000\u01c8\u01c9\u0005\b\u0000\u0000\u01c9\u01ca"+
		"\u0005\u0003\u0000\u0000\u01ca\u01cb\u0005\b\u0000\u0000\u01cb\u01cc\u0005"+
		"\u0003\u0000\u0000\u01cc\u01cd\u0005\b\u0000\u0000\u01cd\u01ce\u0005\u0003"+
		"\u0000\u0000\u01ce\u01cf\u0005\b\u0000\u0000\u01cf\u01d0\u0005\u0003\u0000"+
		"\u0000\u01d0\u01d1\u0005\b\u0000\u0000\u01d1\u01d2\u0005\u0003\u0000\u0000"+
		"\u01d2\u01d3\u0005\u0004\u0000\u0000\u01d3\u01d4\u0006\u0004\uffff\uffff"+
		"\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000\u01d5\u01b7\u0001\u0000\u0000"+
		"\u0000\u01d5\u01c2\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000"+
		"\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01da\u0005\n\u0000\u0000"+
		"\u01da\u01db\u0005\u0003\u0000\u0000\u01db\u01dc\u0005\n\u0000\u0000\u01dc"+
		"\u01dd\u0005\u0003\u0000\u0000\u01dd\u01de\u0005\u0006\u0000\u0000\u01de"+
		"\u01df\u0005\u0004\u0000\u0000\u01df\u01e1\u0001\u0000\u0000\u0000\u01e0"+
		"\u01a3\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005\u0005\u0000\u0000\u01e5"+
		"\u01e6\u0005\u0003\u0000\u0000\u01e6\u01e7\u0005\n\u0000\u0000\u01e7\u01e8"+
		"\u0005\u0003\u0000\u0000\u01e8\u01e9\u0005\n\u0000\u0000\u01e9\u01ea\u0005"+
		"\n\u0000\u0000\u01ea\u01eb\u0005\n\u0000\u0000\u01eb\u01ec\u0005\n\u0000"+
		"\u0000\u01ec\u01ed\u0005\n\u0000\u0000\u01ed\u01ee\u0005\u0003\u0000\u0000"+
		"\u01ee\u01ef\u0005\n\u0000\u0000\u01ef\u01f0\u0005\u0004\u0000\u0000\u01f0"+
		"\t\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005\u0005\u0000\u0000\u01f2\u01f3"+
		"\u0005\u0003\u0000\u0000\u01f3\u01f4\u0005\n\u0000\u0000\u01f4\u01f5\u0005"+
		"\u0003\u0000\u0000\u01f5\u01f6\u0005\n\u0000\u0000\u01f6\u01f7\u0005\n"+
		"\u0000\u0000\u01f7\u01f8\u0005\n\u0000\u0000\u01f8\u01f9\u0005\n\u0000"+
		"\u0000\u01f9\u01fa\u0005\n\u0000\u0000\u01fa\u01fb\u0005\n\u0000\u0000"+
		"\u01fb\u01fc\u0005\n\u0000\u0000\u01fc\u01fd\u0005\u0003\u0000\u0000\u01fd"+
		"\u01fe\u0005\n\u0000\u0000\u01fe\u0241\u0005\u0004\u0000\u0000\u01ff\u0200"+
		"\u0003 \u0010\u0000\u0200\u0201\u0005\u0003\u0000\u0000\u0201\u0202\u0005"+
		"\u0004\u0000\u0000\u0202\u0203\u0003 \u0010\u0000\u0203\u0204\u0005\u0003"+
		"\u0000\u0000\u0204\u0205\u0005\n\u0000\u0000\u0205\u0206\u0005\u0003\u0000"+
		"\u0000\u0206\u0207\u0005\n\u0000\u0000\u0207\u0208\u0005\u0003\u0000\u0000"+
		"\u0208\u0209\u0005\n\u0000\u0000\u0209\u020a\u0005\u0003\u0000\u0000\u020a"+
		"\u020b\u0005\n\u0000\u0000\u020b\u020c\u0005\u0003\u0000\u0000\u020c\u020d"+
		"\u0005\n\u0000\u0000\u020d\u020e\u0005\u0003\u0000\u0000\u020e\u020f\u0005"+
		"\n\u0000\u0000\u020f\u0210\u0005\u0003\u0000\u0000\u0210\u0211\u0005\n"+
		"\u0000\u0000\u0211\u0212\u0005\u0003\u0000\u0000\u0212\u0213\u0005\n\u0000"+
		"\u0000\u0213\u0214\u0005\u0003\u0000\u0000\u0214\u0236\u0005\u0004\u0000"+
		"\u0000\u0215\u0216\u0003 \u0010\u0000\u0216\u0217\u0005\u0003\u0000\u0000"+
		"\u0217\u0218\u0005\u0003\u0000\u0000\u0218\u0219\u0005\u0003\u0000\u0000"+
		"\u0219\u021a\u0005\u0003\u0000\u0000\u021a\u021b\u0005\u0003\u0000\u0000"+
		"\u021b\u021c\u0005\u0003\u0000\u0000\u021c\u021d\u0005\u0003\u0000\u0000"+
		"\u021d\u021e\u0005\u0003\u0000\u0000\u021e\u021f\u0005\u0003\u0000\u0000"+
		"\u021f\u0220\u0005\u0004\u0000\u0000\u0220\u0237\u0001\u0000\u0000\u0000"+
		"\u0221\u0222\u0003 \u0010\u0000\u0222\u0223\u0005\u0003\u0000\u0000\u0223"+
		"\u0224\u0005\u0006\u0000\u0000\u0224\u0225\u0005\u0003\u0000\u0000\u0225"+
		"\u0226\u0005\b\u0000\u0000\u0226\u0227\u0005\u0003\u0000\u0000\u0227\u0228"+
		"\u0005\b\u0000\u0000\u0228\u0229\u0005\u0003\u0000\u0000\u0229\u022a\u0005"+
		"\b\u0000\u0000\u022a\u022b\u0005\u0003\u0000\u0000\u022b\u022c\u0005\b"+
		"\u0000\u0000\u022c\u022d\u0005\u0003\u0000\u0000\u022d\u022e\u0005\b\u0000"+
		"\u0000\u022e\u022f\u0005\u0003\u0000\u0000\u022f\u0230\u0005\b\u0000\u0000"+
		"\u0230\u0231\u0005\u0003\u0000\u0000\u0231\u0232\u0005\b\u0000\u0000\u0232"+
		"\u0233\u0005\u0003\u0000\u0000\u0233\u0234\u0005\u0004\u0000\u0000\u0234"+
		"\u0235\u0006\u0005\uffff\uffff\u0000\u0235\u0237\u0001\u0000\u0000\u0000"+
		"\u0236\u0215\u0001\u0000\u0000\u0000\u0236\u0221\u0001\u0000\u0000\u0000"+
		"\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u0236\u0001\u0000\u0000\u0000"+
		"\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000"+
		"\u023a\u023b\u0005\n\u0000\u0000\u023b\u023c\u0005\u0003\u0000\u0000\u023c"+
		"\u023d\u0005\n\u0000\u0000\u023d\u023e\u0005\u0003\u0000\u0000\u023e\u023f"+
		"\u0005\u0006\u0000\u0000\u023f\u0240\u0005\u0004\u0000\u0000\u0240\u0242"+
		"\u0001\u0000\u0000\u0000\u0241\u01ff\u0001\u0000\u0000\u0000\u0242\u0243"+
		"\u0001\u0000\u0000\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0243\u0244"+
		"\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245\u0246"+
		"\u0005\u0005\u0000\u0000\u0246\u0247\u0005\u0003\u0000\u0000\u0247\u0248"+
		"\u0005\n\u0000\u0000\u0248\u0249\u0005\u0003\u0000\u0000\u0249\u024a\u0005"+
		"\n\u0000\u0000\u024a\u024b\u0005\n\u0000\u0000\u024b\u024c\u0005\n\u0000"+
		"\u0000\u024c\u024d\u0005\n\u0000\u0000\u024d\u024e\u0005\n\u0000\u0000"+
		"\u024e\u024f\u0005\n\u0000\u0000\u024f\u0250\u0005\n\u0000\u0000\u0250"+
		"\u0251\u0005\u0003\u0000\u0000\u0251\u0252\u0005\n\u0000\u0000\u0252\u0253"+
		"\u0005\u0004\u0000\u0000\u0253\u000b\u0001\u0000\u0000\u0000\u0254\u0255"+
		"\u0005\u0005\u0000\u0000\u0255\u0256\u0005\u0003\u0000\u0000\u0256\u0257"+
		"\u0005\n\u0000\u0000\u0257\u0258\u0005\u0003\u0000\u0000\u0258\u0259\u0005"+
		"\n\u0000\u0000\u0259\u025a\u0005\n\u0000\u0000\u025a\u025b\u0005\n\u0000"+
		"\u0000\u025b\u025c\u0005\n\u0000\u0000\u025c\u025d\u0005\n\u0000\u0000"+
		"\u025d\u025e\u0005\u0003\u0000\u0000\u025e\u025f\u0005\n\u0000\u0000\u025f"+
		"\u02a0\u0005\u0004\u0000\u0000\u0260\u0261\u0005\u0005\u0000\u0000\u0261"+
		"\u0262\u0005\u0003\u0000\u0000\u0262\u0263\u0003 \u0010\u0000\u0263\u0264"+
		"\u0005\u0003\u0000\u0000\u0264\u0265\u0005\n\u0000\u0000\u0265\u0266\u0005"+
		"\u0003\u0000\u0000\u0266\u0268\u0003 \u0010\u0000\u0267\u0269\u0003 \u0010"+
		"\u0000\u0268\u0267\u0001\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000"+
		"\u0000\u0269\u026b\u0001\u0000\u0000\u0000\u026a\u026c\u0003 \u0010\u0000"+
		"\u026b\u026a\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000"+
		"\u026c\u026e\u0001\u0000\u0000\u0000\u026d\u026f\u0003 \u0010\u0000\u026e"+
		"\u026d\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f"+
		"\u0271\u0001\u0000\u0000\u0000\u0270\u0272\u0003 \u0010\u0000\u0271\u0270"+
		"\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u0274"+
		"\u0001\u0000\u0000\u0000\u0273\u0275\u0003 \u0010\u0000\u0274\u0273\u0001"+
		"\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0277\u0001"+
		"\u0000\u0000\u0000\u0276\u0278\u0003 \u0010\u0000\u0277\u0276\u0001\u0000"+
		"\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u027c\u0001\u0000"+
		"\u0000\u0000\u0279\u027b\u0003 \u0010\u0000\u027a\u0279\u0001\u0000\u0000"+
		"\u0000\u027b\u027e\u0001\u0000\u0000\u0000\u027c\u027a\u0001\u0000\u0000"+
		"\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027d\u027f\u0001\u0000\u0000"+
		"\u0000\u027e\u027c\u0001\u0000\u0000\u0000\u027f\u0280\u0005\u0004\u0000"+
		"\u0000\u0280\u0281\u0005\u0005\u0000\u0000\u0281\u0282\u0005\u0003\u0000"+
		"\u0000\u0282\u0283\u0005\t\u0000\u0000\u0283\u0284\u0005\u0004\u0000\u0000"+
		"\u0284\u0285\u0005\u0005\u0000\u0000\u0285\u0286\u0005\u0003\u0000\u0000"+
		"\u0286\u0287\u0005\t\u0000\u0000\u0287\u0288\u0005\u0004\u0000\u0000\u0288"+
		"\u0289\u0005\u0005\u0000\u0000\u0289\u028a\u0005\u0003\u0000\u0000\u028a"+
		"\u028b\u0005\b\u0000\u0000\u028b\u028c\u0005\n\u0000\u0000\u028c\u028d"+
		"\u0005\u0004\u0000\u0000\u028d\u028e\u0005\u0005\u0000\u0000\u028e\u028f"+
		"\u0005\u0003\u0000\u0000\u028f\u0290\u0005\u0006\u0000\u0000\u0290\u0291"+
		"\u0005\u0004\u0000\u0000\u0291\u0292\u0005\u0005\u0000\u0000\u0292\u0294"+
		"\u0005\u0003\u0000\u0000\u0293\u0295\u0005\u0006\u0000\u0000\u0294\u0293"+
		"\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295\u0296"+
		"\u0001\u0000\u0000\u0000\u0296\u0297\u0005\u0004\u0000\u0000\u0297\u0298"+
		"\u0006\u0006\uffff\uffff\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299"+
		"\u029a\u0005\n\u0000\u0000\u029a\u029b\u0005\u0003\u0000\u0000\u029b\u029c"+
		"\u0005\n\u0000\u0000\u029c\u029d\u0005\u0003\u0000\u0000\u029d\u029e\u0005"+
		"\u0006\u0000\u0000\u029e\u029f\u0005\u0004\u0000\u0000\u029f\u02a1\u0001"+
		"\u0000\u0000\u0000\u02a0\u0260\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001"+
		"\u0000\u0000\u0000\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4\u02a5\u0005"+
		"\u0005\u0000\u0000\u02a5\u02a6\u0005\u0003\u0000\u0000\u02a6\u02a7\u0005"+
		"\n\u0000\u0000\u02a7\u02a8\u0005\u0003\u0000\u0000\u02a8\u02a9\u0005\n"+
		"\u0000\u0000\u02a9\u02aa\u0005\n\u0000\u0000\u02aa\u02ab\u0005\n\u0000"+
		"\u0000\u02ab\u02ac\u0005\n\u0000\u0000\u02ac\u02ad\u0005\n\u0000\u0000"+
		"\u02ad\u02ae\u0005\u0003\u0000\u0000\u02ae\u02af\u0005\n\u0000\u0000\u02af"+
		"\u02b0\u0005\u0004\u0000\u0000\u02b0\r\u0001\u0000\u0000\u0000\u02b1\u02b2"+
		"\u0005\u0005\u0000\u0000\u02b2\u02b3\u0005\u0003\u0000\u0000\u02b3\u02b4"+
		"\u0005\n\u0000\u0000\u02b4\u02b5\u0005\u0003\u0000\u0000\u02b5\u02b6\u0005"+
		"\n\u0000\u0000\u02b6\u02b7\u0005\n\u0000\u0000\u02b7\u02b8\u0005\n\u0000"+
		"\u0000\u02b8\u02b9\u0005\n\u0000\u0000\u02b9\u02ba\u0005\n\u0000\u0000"+
		"\u02ba\u02bb\u0005\u0003\u0000\u0000\u02bb\u02bc\u0005\n\u0000\u0000\u02bc"+
		"\u0314\u0005\u0004\u0000\u0000\u02bd\u02be\u0005\u0005\u0000\u0000\u02be"+
		"\u02bf\u0005\u0003\u0000\u0000\u02bf\u02c0\u0003 \u0010\u0000\u02c0\u02c2"+
		"\u0005\u0003\u0000\u0000\u02c1\u02c3\u0003 \u0010\u0000\u02c2\u02c1\u0001"+
		"\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4\u02c2\u0001"+
		"\u0000\u0000\u0000\u02c4\u02c5\u0001\u0000\u0000\u0000\u02c5\u02c6\u0001"+
		"\u0000\u0000\u0000\u02c6\u02c7\u0005\u0004\u0000\u0000\u02c7\u02c9\u0003"+
		" \u0010\u0000\u02c8\u02ca\u0003 \u0010\u0000\u02c9\u02c8\u0001\u0000\u0000"+
		"\u0000\u02c9\u02ca\u0001\u0000\u0000\u0000\u02ca\u02cc\u0001\u0000\u0000"+
		"\u0000\u02cb\u02cd\u0003 \u0010\u0000\u02cc\u02cb\u0001\u0000\u0000\u0000"+
		"\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd\u02cf\u0001\u0000\u0000\u0000"+
		"\u02ce\u02d0\u0003 \u0010\u0000\u02cf\u02ce\u0001\u0000\u0000\u0000\u02cf"+
		"\u02d0\u0001\u0000\u0000\u0000\u02d0\u02d2\u0001\u0000\u0000\u0000\u02d1"+
		"\u02d3\u0003 \u0010\u0000\u02d2\u02d1\u0001\u0000\u0000\u0000\u02d2\u02d3"+
		"\u0001\u0000\u0000\u0000\u02d3\u02d5\u0001\u0000\u0000\u0000\u02d4\u02d6"+
		"\u0003 \u0010\u0000\u02d5\u02d4\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001"+
		"\u0000\u0000\u0000\u02d6\u02d8\u0001\u0000\u0000\u0000\u02d7\u02d9\u0003"+
		" \u0010\u0000\u02d8\u02d7\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000"+
		"\u0000\u0000\u02d9\u02dd\u0001\u0000\u0000\u0000\u02da\u02dc\u0003 \u0010"+
		"\u0000\u02db\u02da\u0001\u0000\u0000\u0000\u02dc\u02df\u0001\u0000\u0000"+
		"\u0000\u02dd\u02db\u0001\u0000\u0000\u0000\u02dd\u02de\u0001\u0000\u0000"+
		"\u0000\u02de\u02e0\u0001\u0000\u0000\u0000\u02df\u02dd\u0001\u0000\u0000"+
		"\u0000\u02e0\u02e1\u0005\u0004\u0000\u0000\u02e1\u02e3\u0003 \u0010\u0000"+
		"\u02e2\u02e4\u0003 \u0010\u0000\u02e3\u02e2\u0001\u0000\u0000\u0000\u02e3"+
		"\u02e4\u0001\u0000\u0000\u0000\u02e4\u02e6\u0001\u0000\u0000\u0000\u02e5"+
		"\u02e7\u0003 \u0010\u0000\u02e6\u02e5\u0001\u0000\u0000\u0000\u02e6\u02e7"+
		"\u0001\u0000\u0000\u0000\u02e7\u02e9\u0001\u0000\u0000\u0000\u02e8\u02ea"+
		"\u0003 \u0010\u0000\u02e9\u02e8\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001"+
		"\u0000\u0000\u0000\u02ea\u02ec\u0001\u0000\u0000\u0000\u02eb\u02ed\u0003"+
		" \u0010\u0000\u02ec\u02eb\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001\u0000"+
		"\u0000\u0000\u02ed\u02ef\u0001\u0000\u0000\u0000\u02ee\u02f0\u0003 \u0010"+
		"\u0000\u02ef\u02ee\u0001\u0000\u0000\u0000\u02ef\u02f0\u0001\u0000\u0000"+
		"\u0000\u02f0\u02f2\u0001\u0000\u0000\u0000\u02f1\u02f3\u0003 \u0010\u0000"+
		"\u02f2\u02f1\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000"+
		"\u02f3\u02f7\u0001\u0000\u0000\u0000\u02f4\u02f6\u0003 \u0010\u0000\u02f5"+
		"\u02f4\u0001\u0000\u0000\u0000\u02f6\u02f9\u0001\u0000\u0000\u0000\u02f7"+
		"\u02f5\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8"+
		"\u02fa\u0001\u0000\u0000\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02fa"+
		"\u02fb\u0005\u0004\u0000\u0000\u02fb\u02ff\u0005\u0006\u0000\u0000\u02fc"+
		"\u02fe\u0003 \u0010\u0000\u02fd\u02fc\u0001\u0000\u0000\u0000\u02fe\u0301"+
		"\u0001\u0000\u0000\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000\u02ff\u0300"+
		"\u0001\u0000\u0000\u0000\u0300\u0302\u0001\u0000\u0000\u0000\u0301\u02ff"+
		"\u0001\u0000\u0000\u0000\u0302\u0303\u0005\u0004\u0000\u0000\u0303\u0304"+
		"\u0005\b\u0000\u0000\u0304\u0305\u0005\u0004\u0000\u0000\u0305\u0306\u0003"+
		" \u0010\u0000\u0306\u0307\u0005\u0004\u0000\u0000\u0307\u0308\u0006\u0007"+
		"\uffff\uffff\u0000\u0308\u030a\u0001\u0000\u0000\u0000\u0309\u02bd\u0001"+
		"\u0000\u0000\u0000\u030a\u030b\u0001\u0000\u0000\u0000\u030b\u0309\u0001"+
		"\u0000\u0000\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u030d\u0001"+
		"\u0000\u0000\u0000\u030d\u030e\u0005\n\u0000\u0000\u030e\u030f\u0005\u0003"+
		"\u0000\u0000\u030f\u0310\u0005\n\u0000\u0000\u0310\u0311\u0005\u0003\u0000"+
		"\u0000\u0311\u0312\u0005\u0006\u0000\u0000\u0312\u0313\u0005\u0004\u0000"+
		"\u0000\u0313\u0315\u0001\u0000\u0000\u0000\u0314\u0309\u0001\u0000\u0000"+
		"\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316\u0314\u0001\u0000\u0000"+
		"\u0000\u0316\u0317\u0001\u0000\u0000\u0000\u0317\u0318\u0001\u0000\u0000"+
		"\u0000\u0318\u0319\u0005\u0005\u0000\u0000\u0319\u031a\u0005\u0003\u0000"+
		"\u0000\u031a\u031b\u0005\n\u0000\u0000\u031b\u031c\u0005\u0003\u0000\u0000"+
		"\u031c\u031d\u0005\n\u0000\u0000\u031d\u031e\u0005\n\u0000\u0000\u031e"+
		"\u031f\u0005\n\u0000\u0000\u031f\u0320\u0005\n\u0000\u0000\u0320\u0321"+
		"\u0005\n\u0000\u0000\u0321\u0322\u0005\u0003\u0000\u0000\u0322\u0323\u0005"+
		"\n\u0000\u0000\u0323\u0324\u0005\u0004\u0000\u0000\u0324\u000f\u0001\u0000"+
		"\u0000\u0000\u0325\u0326\u0005\u0005\u0000\u0000\u0326\u0327\u0005\u0003"+
		"\u0000\u0000\u0327\u0328\u0005\n\u0000\u0000\u0328\u0329\u0005\u0003\u0000"+
		"\u0000\u0329\u032a\u0005\n\u0000\u0000\u032a\u032b\u0005\n\u0000\u0000"+
		"\u032b\u032c\u0005\n\u0000\u0000\u032c\u032d\u0005\u0003\u0000\u0000\u032d"+
		"\u032e\u0005\n\u0000\u0000\u032e\u032f\u0005\u0003\u0000\u0000\u032f\u0330"+
		"\u0005\n\u0000\u0000\u0330\u03b1\u0005\u0004\u0000\u0000\u0331\u0332\u0005"+
		"\n\u0000\u0000\u0332\u0333\u0005\u0003\u0000\u0000\u0333\u0334\u0005\u0004"+
		"\u0000\u0000\u0334\u0335\u0005\n\u0000\u0000\u0335\u0336\u0005\u0003\u0000"+
		"\u0000\u0336\u0337\u0005\n\u0000\u0000\u0337\u0338\u0005\u0003\u0000\u0000"+
		"\u0338\u0339\u0005\n\u0000\u0000\u0339\u033a\u0005\u0003\u0000\u0000\u033a"+
		"\u033b\u0005\u0003\u0000\u0000\u033b\u033c\u0005\n\u0000\u0000\u033c\u033d"+
		"\u0005\u0003\u0000\u0000\u033d\u033e\u0005\n\u0000\u0000\u033e\u033f\u0005"+
		"\u0003\u0000\u0000\u033f\u0340\u0005\n\u0000\u0000\u0340\u0341\u0005\u0003"+
		"\u0000\u0000\u0341\u0342\u0005\n\u0000\u0000\u0342\u0343\u0005\u0004\u0000"+
		"\u0000\u0343\u0344\u0005\n\u0000\u0000\u0344\u0345\u0005\u0003\u0000\u0000"+
		"\u0345\u0346\u0005\u0003\u0000\u0000\u0346\u0347\u0005\u0003\u0000\u0000"+
		"\u0347\u0348\u0005\n\u0000\u0000\u0348\u0349\u0005\u0003\u0000\u0000\u0349"+
		"\u034a\u0005\u0003\u0000\u0000\u034a\u034b\u0005\u0003\u0000\u0000\u034b"+
		"\u034c\u0005\u0003\u0000\u0000\u034c\u034d\u0005\u0003\u0000\u0000\u034d"+
		"\u034e\u0005\u0003\u0000\u0000\u034e\u034f\u0005\n\u0000\u0000\u034f\u0350"+
		"\u0005\u0003\u0000\u0000\u0350\u0351\u0005\n\u0000\u0000\u0351\u0352\u0005"+
		"\u0003\u0000\u0000\u0352\u03a6\u0005\u0004\u0000\u0000\u0353\u0354\u0005"+
		"\n\u0000\u0000\u0354\u0355\u0005\u0003\u0000\u0000\u0355\u0356\u0005\u0003"+
		"\u0000\u0000\u0356\u0358\u0003 \u0010\u0000\u0357\u0359\u0003 \u0010\u0000"+
		"\u0358\u0357\u0001\u0000\u0000\u0000\u0358\u0359\u0001\u0000\u0000\u0000"+
		"\u0359\u035b\u0001\u0000\u0000\u0000\u035a\u035c\u0003 \u0010\u0000\u035b"+
		"\u035a\u0001\u0000\u0000\u0000\u035b\u035c\u0001\u0000\u0000\u0000\u035c"+
		"\u035e\u0001\u0000\u0000\u0000\u035d\u035f\u0003 \u0010\u0000\u035e\u035d"+
		"\u0001\u0000\u0000\u0000\u035e\u035f\u0001\u0000\u0000\u0000\u035f\u0361"+
		"\u0001\u0000\u0000\u0000\u0360\u0362\u0003 \u0010\u0000\u0361\u0360\u0001"+
		"\u0000\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362\u0364\u0001"+
		"\u0000\u0000\u0000\u0363\u0365\u0003 \u0010\u0000\u0364\u0363\u0001\u0000"+
		"\u0000\u0000\u0364\u0365\u0001\u0000\u0000\u0000\u0365\u0367\u0001\u0000"+
		"\u0000\u0000\u0366\u0368\u0003 \u0010\u0000\u0367\u0366\u0001\u0000\u0000"+
		"\u0000\u0367\u0368\u0001\u0000\u0000\u0000\u0368\u036c\u0001\u0000\u0000"+
		"\u0000\u0369\u036b\u0003 \u0010\u0000\u036a\u0369\u0001\u0000\u0000\u0000"+
		"\u036b\u036e\u0001\u0000\u0000\u0000\u036c\u036a\u0001\u0000\u0000\u0000"+
		"\u036c\u036d\u0001\u0000\u0000\u0000\u036d\u036f\u0001\u0000\u0000\u0000"+
		"\u036e\u036c\u0001\u0000\u0000\u0000\u036f\u0370\u0005\u0003\u0000\u0000"+
		"\u0370\u0371\u0003 \u0010\u0000\u0371\u0372\u0005\u0003\u0000\u0000\u0372"+
		"\u0374\u0003 \u0010\u0000\u0373\u0375\u0003 \u0010\u0000\u0374\u0373\u0001"+
		"\u0000\u0000\u0000\u0374\u0375\u0001\u0000\u0000\u0000\u0375\u0377\u0001"+
		"\u0000\u0000\u0000\u0376\u0378\u0003 \u0010\u0000\u0377\u0376\u0001\u0000"+
		"\u0000\u0000\u0377\u0378\u0001\u0000\u0000\u0000\u0378\u037a\u0001\u0000"+
		"\u0000\u0000\u0379\u037b\u0003 \u0010\u0000\u037a\u0379\u0001\u0000\u0000"+
		"\u0000\u037a\u037b\u0001\u0000\u0000\u0000\u037b\u037d\u0001\u0000\u0000"+
		"\u0000\u037c\u037e\u0003 \u0010\u0000\u037d\u037c\u0001\u0000\u0000\u0000"+
		"\u037d\u037e\u0001\u0000\u0000\u0000\u037e\u0380\u0001\u0000\u0000\u0000"+
		"\u037f\u0381\u0003 \u0010\u0000\u0380\u037f\u0001\u0000\u0000\u0000\u0380"+
		"\u0381\u0001\u0000\u0000\u0000\u0381\u0383\u0001\u0000\u0000\u0000\u0382"+
		"\u0384\u0003 \u0010\u0000\u0383\u0382\u0001\u0000\u0000\u0000\u0383\u0384"+
		"\u0001\u0000\u0000\u0000\u0384\u0388\u0001\u0000\u0000\u0000\u0385\u0387"+
		"\u0003 \u0010\u0000\u0386\u0385\u0001\u0000\u0000\u0000\u0387\u038a\u0001"+
		"\u0000\u0000\u0000\u0388\u0386\u0001\u0000\u0000\u0000\u0388\u0389\u0001"+
		"\u0000\u0000\u0000\u0389\u038b\u0001\u0000\u0000\u0000\u038a\u0388\u0001"+
		"\u0000\u0000\u0000\u038b\u038c\u0005\u0003\u0000\u0000\u038c\u038d\u0005"+
		"\b\u0000\u0000\u038d\u038e\u0005\u0003\u0000\u0000\u038e\u038f\u0005\b"+
		"\u0000\u0000\u038f\u0390\u0005\u0003\u0000\u0000\u0390\u0391\u0005\b\u0000"+
		"\u0000\u0391\u0392\u0005\u0003\u0000\u0000\u0392\u0393\u0005\u0003\u0000"+
		"\u0000\u0393\u0395\u0005\u0003\u0000\u0000\u0394\u0396\u0005\b\u0000\u0000"+
		"\u0395\u0394\u0001\u0000\u0000\u0000\u0395\u0396\u0001\u0000\u0000\u0000"+
		"\u0396\u0397\u0001\u0000\u0000\u0000\u0397\u0398\u0005\u0003\u0000\u0000"+
		"\u0398\u0399\u0005\u0003\u0000\u0000\u0399\u039a\u0005\u0003\u0000\u0000"+
		"\u039a\u039b\u0005\u0003\u0000\u0000\u039b\u039c\u0005\u0003\u0000\u0000"+
		"\u039c\u039e\u0005\u0003\u0000\u0000\u039d\u039f\u0005\b\u0000\u0000\u039e"+
		"\u039d\u0001\u0000\u0000\u0000\u039e\u039f\u0001\u0000\u0000\u0000\u039f"+
		"\u03a0\u0001\u0000\u0000\u0000\u03a0\u03a1\u0005\u0003\u0000\u0000\u03a1"+
		"\u03a2\u0005\n\u0000\u0000\u03a2\u03a3\u0005\u0003\u0000\u0000\u03a3\u03a4"+
		"\u0005\u0004\u0000\u0000\u03a4\u03a5\u0006\b\uffff\uffff\u0000\u03a5\u03a7"+
		"\u0001\u0000\u0000\u0000\u03a6\u0353\u0001\u0000\u0000\u0000\u03a7\u03a8"+
		"\u0001\u0000\u0000\u0000\u03a8\u03a6\u0001\u0000\u0000\u0000\u03a8\u03a9"+
		"\u0001\u0000\u0000\u0000\u03a9\u03aa\u0001\u0000\u0000\u0000\u03aa\u03ab"+
		"\u0005\n\u0000\u0000\u03ab\u03ac\u0005\u0003\u0000\u0000\u03ac\u03ad\u0005"+
		"\n\u0000\u0000\u03ad\u03ae\u0005\u0003\u0000\u0000\u03ae\u03af\u0005\u0006"+
		"\u0000\u0000\u03af\u03b0\u0005\u0004\u0000\u0000\u03b0\u03b2\u0001\u0000"+
		"\u0000\u0000\u03b1\u0331\u0001\u0000\u0000\u0000\u03b2\u03b3\u0001\u0000"+
		"\u0000\u0000\u03b3\u03b1\u0001\u0000\u0000\u0000\u03b3\u03b4\u0001\u0000"+
		"\u0000\u0000\u03b4\u03b5\u0001\u0000\u0000\u0000\u03b5\u03b6\u0005\u0005"+
		"\u0000\u0000\u03b6\u03b7\u0005\u0003\u0000\u0000\u03b7\u03b8\u0005\n\u0000"+
		"\u0000\u03b8\u03b9\u0005\u0003\u0000\u0000\u03b9\u03ba\u0005\n\u0000\u0000"+
		"\u03ba\u03bb\u0005\n\u0000\u0000\u03bb\u03bc\u0005\n\u0000\u0000\u03bc"+
		"\u03bd\u0005\u0003\u0000\u0000\u03bd\u03be\u0005\n\u0000\u0000\u03be\u03bf"+
		"\u0005\u0003\u0000\u0000\u03bf\u03c0\u0005\n\u0000\u0000\u03c0\u03c1\u0005"+
		"\u0004\u0000\u0000\u03c1\u0011\u0001\u0000\u0000\u0000\u03c2\u03c3\u0005"+
		"\u0005\u0000\u0000\u03c3\u03c4\u0005\u0003\u0000\u0000\u03c4\u03c5\u0005"+
		"\n\u0000\u0000\u03c5\u03c6\u0005\n\u0000\u0000\u03c6\u03c7\u0005\u0003"+
		"\u0000\u0000\u03c7\u03c8\u0005\n\u0000\u0000\u03c8\u03c9\u0005\u0003\u0000"+
		"\u0000\u03c9\u03ca\u0005\n\u0000\u0000\u03ca\u03cb\u0005\u0003\u0000\u0000"+
		"\u03cb\u03cc\u0005\n\u0000\u0000\u03cc\u045a\u0005\u0004\u0000\u0000\u03cd"+
		"\u03ce\u0003 \u0010\u0000\u03ce\u03d0\u0005\u0003\u0000\u0000\u03cf\u03d1"+
		"\u0003 \u0010\u0000\u03d0\u03cf\u0001\u0000\u0000\u0000\u03d1\u03d2\u0001"+
		"\u0000\u0000\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001"+
		"\u0000\u0000\u0000\u03d3\u03d4\u0001\u0000\u0000\u0000\u03d4\u03d5\u0005"+
		"\u0004\u0000\u0000\u03d5\u03d6\u0005\u0005\u0000\u0000\u03d6\u03d7\u0005"+
		"\u0003\u0000\u0000\u03d7\u03d9\u0003 \u0010\u0000\u03d8\u03da\u0003 \u0010"+
		"\u0000\u03d9\u03d8\u0001\u0000\u0000\u0000\u03d9\u03da\u0001\u0000\u0000"+
		"\u0000\u03da\u03dc\u0001\u0000\u0000\u0000\u03db\u03dd\u0003 \u0010\u0000"+
		"\u03dc\u03db\u0001\u0000\u0000\u0000\u03dc\u03dd\u0001\u0000\u0000\u0000"+
		"\u03dd\u03df\u0001\u0000\u0000\u0000\u03de\u03e0\u0003 \u0010\u0000\u03df"+
		"\u03de\u0001\u0000\u0000\u0000\u03df\u03e0\u0001\u0000\u0000\u0000\u03e0"+
		"\u03e2\u0001\u0000\u0000\u0000\u03e1\u03e3\u0003 \u0010\u0000\u03e2\u03e1"+
		"\u0001\u0000\u0000\u0000\u03e2\u03e3\u0001\u0000\u0000\u0000\u03e3\u03e5"+
		"\u0001\u0000\u0000\u0000\u03e4\u03e6\u0003 \u0010\u0000\u03e5\u03e4\u0001"+
		"\u0000\u0000\u0000\u03e5\u03e6\u0001\u0000\u0000\u0000\u03e6\u03e8\u0001"+
		"\u0000\u0000\u0000\u03e7\u03e9\u0003 \u0010\u0000\u03e8\u03e7\u0001\u0000"+
		"\u0000\u0000\u03e8\u03e9\u0001\u0000\u0000\u0000\u03e9\u03ed\u0001\u0000"+
		"\u0000\u0000\u03ea\u03ec\u0003 \u0010\u0000\u03eb\u03ea\u0001\u0000\u0000"+
		"\u0000\u03ec\u03ef\u0001\u0000\u0000\u0000\u03ed\u03eb\u0001\u0000\u0000"+
		"\u0000\u03ed\u03ee\u0001\u0000\u0000\u0000\u03ee\u03f0\u0001\u0000\u0000"+
		"\u0000\u03ef\u03ed\u0001\u0000\u0000\u0000\u03f0\u03f1\u0005\u0004\u0000"+
		"\u0000\u03f1\u03f2\u0005\u0005\u0000\u0000\u03f2\u03f3\u0005\u0003\u0000"+
		"\u0000\u03f3\u03f5\u0003 \u0010\u0000\u03f4\u03f6\u0003 \u0010\u0000\u03f5"+
		"\u03f4\u0001\u0000\u0000\u0000\u03f5\u03f6\u0001\u0000\u0000\u0000\u03f6"+
		"\u03f8\u0001\u0000\u0000\u0000\u03f7\u03f9\u0003 \u0010\u0000\u03f8\u03f7"+
		"\u0001\u0000\u0000\u0000\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9\u03fb"+
		"\u0001\u0000\u0000\u0000\u03fa\u03fc\u0003 \u0010\u0000\u03fb\u03fa\u0001"+
		"\u0000\u0000\u0000\u03fb\u03fc\u0001\u0000\u0000\u0000\u03fc\u03fe\u0001"+
		"\u0000\u0000\u0000\u03fd\u03ff\u0003 \u0010\u0000\u03fe\u03fd\u0001\u0000"+
		"\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff\u0401\u0001\u0000"+
		"\u0000\u0000\u0400\u0402\u0003 \u0010\u0000\u0401\u0400\u0001\u0000\u0000"+
		"\u0000\u0401\u0402\u0001\u0000\u0000\u0000\u0402\u0404\u0001\u0000\u0000"+
		"\u0000\u0403\u0405\u0003 \u0010\u0000\u0404\u0403\u0001\u0000\u0000\u0000"+
		"\u0404\u0405\u0001\u0000\u0000\u0000\u0405\u0409\u0001\u0000\u0000\u0000"+
		"\u0406\u0408\u0003 \u0010\u0000\u0407\u0406\u0001\u0000\u0000\u0000\u0408"+
		"\u040b\u0001\u0000\u0000\u0000\u0409\u0407\u0001\u0000\u0000\u0000\u0409"+
		"\u040a\u0001\u0000\u0000\u0000\u040a\u040c\u0001\u0000\u0000\u0000\u040b"+
		"\u0409\u0001\u0000\u0000\u0000\u040c\u040d\u0005\u0004\u0000\u0000\u040d"+
		"\u040e\u0005\u0005\u0000\u0000\u040e\u040f\u0005\u0003\u0000\u0000\u040f"+
		"\u0410\u0005\b\u0000\u0000\u0410\u0411\u0005\u0004\u0000\u0000\u0411\u0412"+
		"\u0006\t\uffff\uffff\u0000\u0412\u044f\u0001\u0000\u0000\u0000\u0413\u0414"+
		"\u0005\n\u0000\u0000\u0414\u0415\u0005\u0003\u0000\u0000\u0415\u0416\u0005"+
		"\n\u0000\u0000\u0416\u0417\u0005\u0003\u0000\u0000\u0417\u0418\u0005\n"+
		"\u0000\u0000\u0418\u0419\u0005\u0003\u0000\u0000\u0419\u041a\u0005\n\u0000"+
		"\u0000\u041a\u041b\u0005\u0003\u0000\u0000\u041b\u041c\u0005\n\u0000\u0000"+
		"\u041c\u041d\u0005\u0003\u0000\u0000\u041d\u041e\u0005\n\u0000\u0000\u041e"+
		"\u041f\u0005\u0003\u0000\u0000\u041f\u0420\u0005\n\u0000\u0000\u0420\u0421"+
		"\u0005\u0003\u0000\u0000\u0421\u0422\u0005\n\u0000\u0000\u0422\u0423\u0005"+
		"\u0003\u0000\u0000\u0423\u044b\u0005\u0004\u0000\u0000\u0424\u0425\u0005"+
		"\u0003\u0000\u0000\u0425\u0426\u0005\u0003\u0000\u0000\u0426\u0427\u0005"+
		"\u0003\u0000\u0000\u0427\u0428\u0005\u0003\u0000\u0000\u0428\u0429\u0005"+
		"\u0003\u0000\u0000\u0429\u042a\u0005\u0003\u0000\u0000\u042a\u042b\u0005"+
		"\u0003\u0000\u0000\u042b\u042c\u0005\u0003\u0000\u0000\u042c\u044c\u0005"+
		"\u0004\u0000\u0000\u042d\u042f\u0005\u0006\u0000\u0000\u042e\u042d\u0001"+
		"\u0000\u0000\u0000\u042e\u042f\u0001\u0000\u0000\u0000\u042f\u0430\u0001"+
		"\u0000\u0000\u0000\u0430\u0432\u0005\u0003\u0000\u0000\u0431\u0433\u0005"+
		"\b\u0000\u0000\u0432\u0431\u0001\u0000\u0000\u0000\u0432\u0433\u0001\u0000"+
		"\u0000\u0000\u0433\u0434\u0001\u0000\u0000\u0000\u0434\u0436\u0005\u0003"+
		"\u0000\u0000\u0435\u0437\u0005\b\u0000\u0000\u0436\u0435\u0001\u0000\u0000"+
		"\u0000\u0436\u0437\u0001\u0000\u0000\u0000\u0437\u0438\u0001\u0000\u0000"+
		"\u0000\u0438\u043a\u0005\u0003\u0000\u0000\u0439\u043b\u0005\b\u0000\u0000"+
		"\u043a\u0439\u0001\u0000\u0000\u0000\u043a\u043b\u0001\u0000\u0000\u0000"+
		"\u043b\u043c\u0001\u0000\u0000\u0000\u043c\u043e\u0005\u0003\u0000\u0000"+
		"\u043d\u043f\u0005\b\u0000\u0000\u043e\u043d\u0001\u0000\u0000\u0000\u043e"+
		"\u043f\u0001\u0000\u0000\u0000\u043f\u0440\u0001\u0000\u0000\u0000\u0440"+
		"\u0441\u0005\u0003\u0000\u0000\u0441\u0442\u0005\b\u0000\u0000\u0442\u0443"+
		"\u0005\u0003\u0000\u0000\u0443\u0444\u0005\b\u0000\u0000\u0444\u0446\u0005"+
		"\u0003\u0000\u0000\u0445\u0447\u0005\b\u0000\u0000\u0446\u0445\u0001\u0000"+
		"\u0000\u0000\u0446\u0447\u0001\u0000\u0000\u0000\u0447\u0448\u0001\u0000"+
		"\u0000\u0000\u0448\u0449\u0005\u0003\u0000\u0000\u0449\u044a\u0005\u0004"+
		"\u0000\u0000\u044a\u044c\u0006\t\uffff\uffff\u0000\u044b\u0424\u0001\u0000"+
		"\u0000\u0000\u044b\u042e\u0001\u0000\u0000\u0000\u044c\u044d\u0001\u0000"+
		"\u0000\u0000\u044d\u044b\u0001\u0000\u0000\u0000\u044d\u044e\u0001\u0000"+
		"\u0000\u0000\u044e\u0450\u0001\u0000\u0000\u0000\u044f\u0413\u0001\u0000"+
		"\u0000\u0000\u0450\u0451\u0001\u0000\u0000\u0000\u0451\u044f\u0001\u0000"+
		"\u0000\u0000\u0451\u0452\u0001\u0000\u0000\u0000\u0452\u0453\u0001\u0000"+
		"\u0000\u0000\u0453\u0454\u0005\n\u0000\u0000\u0454\u0455\u0005\u0003\u0000"+
		"\u0000\u0455\u0456\u0005\n\u0000\u0000\u0456\u0457\u0005\u0003\u0000\u0000"+
		"\u0457\u0458\u0005\u0006\u0000\u0000\u0458\u0459\u0005\u0004\u0000\u0000"+
		"\u0459\u045b\u0001\u0000\u0000\u0000\u045a\u03cd\u0001\u0000\u0000\u0000"+
		"\u045b\u045c\u0001\u0000\u0000\u0000\u045c\u045a\u0001\u0000\u0000\u0000"+
		"\u045c\u045d\u0001\u0000\u0000\u0000\u045d\u045e\u0001\u0000\u0000\u0000"+
		"\u045e\u045f\u0005\u0005\u0000\u0000\u045f\u0460\u0005\u0003\u0000\u0000"+
		"\u0460\u0461\u0005\n\u0000\u0000\u0461\u0462\u0005\n\u0000\u0000\u0462"+
		"\u0463\u0005\u0003\u0000\u0000\u0463\u0464\u0005\n\u0000\u0000\u0464\u0465"+
		"\u0005\u0003\u0000\u0000\u0465\u0466\u0005\n\u0000\u0000\u0466\u0467\u0005"+
		"\u0003\u0000\u0000\u0467\u0468\u0005\n\u0000\u0000\u0468\u0469\u0005\u0004"+
		"\u0000\u0000\u0469\u0013\u0001\u0000\u0000\u0000\u046a\u046b\u0005\u0005"+
		"\u0000\u0000\u046b\u046c\u0005\u0003\u0000\u0000\u046c\u046d\u0005\n\u0000"+
		"\u0000\u046d\u046e\u0005\n\u0000\u0000\u046e\u046f\u0005\u0003\u0000\u0000"+
		"\u046f\u0470\u0005\n\u0000\u0000\u0470\u0471\u0005\u0003\u0000\u0000\u0471"+
		"\u0472\u0005\n\u0000\u0000\u0472\u0473\u0005\u0003\u0000\u0000\u0473\u0474"+
		"\u0005\n\u0000\u0000\u0474\u04b3\u0005\u0004\u0000\u0000\u0475\u0476\u0003"+
		" \u0010\u0000\u0476\u0478\u0005\u0003\u0000\u0000\u0477\u0479\u0003 \u0010"+
		"\u0000\u0478\u0477\u0001\u0000\u0000\u0000\u0479\u047a\u0001\u0000\u0000"+
		"\u0000\u047a\u0478\u0001\u0000\u0000\u0000\u047a\u047b\u0001\u0000\u0000"+
		"\u0000\u047b\u047c\u0001\u0000\u0000\u0000\u047c\u04a8\u0005\u0004\u0000"+
		"\u0000\u047d\u047e\u0005\n\u0000\u0000\u047e\u047f\u0005\u0003\u0000\u0000"+
		"\u047f\u0480\u0005\n\u0000\u0000\u0480\u0481\u0005\u0003\u0000\u0000\u0481"+
		"\u0482\u0005\n\u0000\u0000\u0482\u0483\u0005\u0003\u0000\u0000\u0483\u0484"+
		"\u0005\n\u0000\u0000\u0484\u0485\u0005\u0003\u0000\u0000\u0485\u0486\u0005"+
		"\n\u0000\u0000\u0486\u0487\u0005\u0003\u0000\u0000\u0487\u0488\u0005\n"+
		"\u0000\u0000\u0488\u0489\u0005\u0003\u0000\u0000\u0489\u048a\u0005\n\u0000"+
		"\u0000\u048a\u048b\u0005\u0003\u0000\u0000\u048b\u04a4\u0005\u0004\u0000"+
		"\u0000\u048c\u048d\u0005\u0003\u0000\u0000\u048d\u048e\u0005\u0003\u0000"+
		"\u0000\u048e\u048f\u0005\u0003\u0000\u0000\u048f\u0490\u0005\u0003\u0000"+
		"\u0000\u0490\u0491\u0005\u0003\u0000\u0000\u0491\u0492\u0005\u0003\u0000"+
		"\u0000\u0492\u0493\u0005\u0003\u0000\u0000\u0493\u04a5\u0005\u0004\u0000"+
		"\u0000\u0494\u0495\u0005\u0006\u0000\u0000\u0495\u0496\u0005\u0003\u0000"+
		"\u0000\u0496\u0497\u0005\b\u0000\u0000\u0497\u0498\u0005\u0003\u0000\u0000"+
		"\u0498\u0499\u0005\b\u0000\u0000\u0499\u049a\u0005\u0003\u0000\u0000\u049a"+
		"\u049b\u0005\b\u0000\u0000\u049b\u049c\u0005\u0003\u0000\u0000\u049c\u049d"+
		"\u0005\b\u0000\u0000\u049d\u049e\u0005\u0003\u0000\u0000\u049e\u049f\u0005"+
		"\b\u0000\u0000\u049f\u04a0\u0005\u0003\u0000\u0000\u04a0\u04a1\u0005\b"+
		"\u0000\u0000\u04a1\u04a2\u0005\u0003\u0000\u0000\u04a2\u04a3\u0005\u0004"+
		"\u0000\u0000\u04a3\u04a5\u0006\n\uffff\uffff\u0000\u04a4\u048c\u0001\u0000"+
		"\u0000\u0000\u04a4\u0494\u0001\u0000\u0000\u0000\u04a5\u04a6\u0001\u0000"+
		"\u0000\u0000\u04a6\u04a4\u0001\u0000\u0000\u0000\u04a6\u04a7\u0001\u0000"+
		"\u0000\u0000\u04a7\u04a9\u0001\u0000\u0000\u0000\u04a8\u047d\u0001\u0000"+
		"\u0000\u0000\u04a9\u04aa\u0001\u0000\u0000\u0000\u04aa\u04a8\u0001\u0000"+
		"\u0000\u0000\u04aa\u04ab\u0001\u0000\u0000\u0000\u04ab\u04ac\u0001\u0000"+
		"\u0000\u0000\u04ac\u04ad\u0005\n\u0000\u0000\u04ad\u04ae\u0005\u0003\u0000"+
		"\u0000\u04ae\u04af\u0005\n\u0000\u0000\u04af\u04b0\u0005\u0003\u0000\u0000"+
		"\u04b0\u04b1\u0005\u0006\u0000\u0000\u04b1\u04b2\u0005\u0004\u0000\u0000"+
		"\u04b2\u04b4\u0001\u0000\u0000\u0000\u04b3\u0475\u0001\u0000\u0000\u0000"+
		"\u04b4\u04b5\u0001\u0000\u0000\u0000\u04b5\u04b3\u0001\u0000\u0000\u0000"+
		"\u04b5\u04b6\u0001\u0000\u0000\u0000\u04b6\u04b7\u0001\u0000\u0000\u0000"+
		"\u04b7\u04b8\u0005\u0005\u0000\u0000\u04b8\u04b9\u0005\u0003\u0000\u0000"+
		"\u04b9\u04ba\u0005\n\u0000\u0000\u04ba\u04bb\u0005\n\u0000\u0000\u04bb"+
		"\u04bc\u0005\u0003\u0000\u0000\u04bc\u04bd\u0005\n\u0000\u0000\u04bd\u04be"+
		"\u0005\u0003\u0000\u0000\u04be\u04bf\u0005\n\u0000\u0000\u04bf\u04c0\u0005"+
		"\u0003\u0000\u0000\u04c0\u04c1\u0005\n\u0000\u0000\u04c1\u04c2\u0005\u0004"+
		"\u0000\u0000\u04c2\u0015\u0001\u0000\u0000\u0000\u04c3\u04c4\u0005\u0005"+
		"\u0000\u0000\u04c4\u04c5\u0005\u0003\u0000\u0000\u04c5\u04c6\u0005\n\u0000"+
		"\u0000\u04c6\u04c7\u0005\n\u0000\u0000\u04c7\u04c8\u0005\u0003\u0000\u0000"+
		"\u04c8\u04c9\u0005\n\u0000\u0000\u04c9\u04ca\u0005\u0003\u0000\u0000\u04ca"+
		"\u04cb\u0005\n\u0000\u0000\u04cb\u04cc\u0005\u0003\u0000\u0000\u04cc\u04cd"+
		"\u0005\n\u0000\u0000\u04cd\u0507\u0005\u0004\u0000\u0000\u04ce\u04cf\u0005"+
		"\u0005\u0000\u0000\u04cf\u04d0\u0005\u0003\u0000\u0000\u04d0\u04d1\u0003"+
		" \u0010\u0000\u04d1\u04d2\u0005\u0003\u0000\u0000\u04d2\u04d3\u0005\n"+
		"\u0000\u0000\u04d3\u04d4\u0005\u0003\u0000\u0000\u04d4\u04d6\u0003 \u0010"+
		"\u0000\u04d5\u04d7\u0003 \u0010\u0000\u04d6\u04d5\u0001\u0000\u0000\u0000"+
		"\u04d6\u04d7\u0001\u0000\u0000\u0000\u04d7\u04d9\u0001\u0000\u0000\u0000"+
		"\u04d8\u04da\u0003 \u0010\u0000\u04d9\u04d8\u0001\u0000\u0000\u0000\u04d9"+
		"\u04da\u0001\u0000\u0000\u0000\u04da\u04dc\u0001\u0000\u0000\u0000\u04db"+
		"\u04dd\u0003 \u0010\u0000\u04dc\u04db\u0001\u0000\u0000\u0000\u04dc\u04dd"+
		"\u0001\u0000\u0000\u0000\u04dd\u04df\u0001\u0000\u0000\u0000\u04de\u04e0"+
		"\u0003 \u0010\u0000\u04df\u04de\u0001\u0000\u0000\u0000\u04df\u04e0\u0001"+
		"\u0000\u0000\u0000\u04e0\u04e2\u0001\u0000\u0000\u0000\u04e1\u04e3\u0003"+
		" \u0010\u0000\u04e2\u04e1\u0001\u0000\u0000\u0000\u04e2\u04e3\u0001\u0000"+
		"\u0000\u0000\u04e3\u04e5\u0001\u0000\u0000\u0000\u04e4\u04e6\u0003 \u0010"+
		"\u0000\u04e5\u04e4\u0001\u0000\u0000\u0000\u04e5\u04e6\u0001\u0000\u0000"+
		"\u0000\u04e6\u04ea\u0001\u0000\u0000\u0000\u04e7\u04e9\u0003 \u0010\u0000"+
		"\u04e8\u04e7\u0001\u0000\u0000\u0000\u04e9\u04ec\u0001\u0000\u0000\u0000"+
		"\u04ea\u04e8\u0001\u0000\u0000\u0000\u04ea\u04eb\u0001\u0000\u0000\u0000"+
		"\u04eb\u04ed\u0001\u0000\u0000\u0000\u04ec\u04ea\u0001\u0000\u0000\u0000"+
		"\u04ed\u04ee\u0005\u0004\u0000\u0000\u04ee\u04ef\u0005\u0005\u0000\u0000"+
		"\u04ef\u04f0\u0005\u0003\u0000\u0000\u04f0\u04f1\u0005\t\u0000\u0000\u04f1"+
		"\u04f2\u0005\u0004\u0000\u0000\u04f2\u04f3\u0005\u0005\u0000\u0000\u04f3"+
		"\u04f4\u0005\u0003\u0000\u0000\u04f4\u04f5\u0005\t\u0000\u0000\u04f5\u04f6"+
		"\u0005\u0004\u0000\u0000\u04f6\u04f7\u0005\u0005\u0000\u0000\u04f7\u04f8"+
		"\u0005\u0003\u0000\u0000\u04f8\u04f9\u0005\b\u0000\u0000\u04f9\u04fa\u0005"+
		"\n\u0000\u0000\u04fa\u04fb\u0005\u0004\u0000\u0000\u04fb\u04fc\u0005\u0005"+
		"\u0000\u0000\u04fc\u04fd\u0005\u0003\u0000\u0000\u04fd\u04fe\u0005\u0006"+
		"\u0000\u0000\u04fe\u04ff\u0005\u0004\u0000\u0000\u04ff\u0500\u0005\n\u0000"+
		"\u0000\u0500\u0501\u0005\u0003\u0000\u0000\u0501\u0502\u0005\n\u0000\u0000"+
		"\u0502\u0503\u0005\u0003\u0000\u0000\u0503\u0504\u0005\u0006\u0000\u0000"+
		"\u0504\u0505\u0005\u0004\u0000\u0000\u0505\u0506\u0006\u000b\uffff\uffff"+
		"\u0000\u0506\u0508\u0001\u0000\u0000\u0000\u0507\u04ce\u0001\u0000\u0000"+
		"\u0000\u0508\u0509\u0001\u0000\u0000\u0000\u0509\u0507\u0001\u0000\u0000"+
		"\u0000\u0509\u050a\u0001\u0000\u0000\u0000\u050a\u050b\u0001\u0000\u0000"+
		"\u0000\u050b\u050c\u0005\u0005\u0000\u0000\u050c\u050d\u0005\u0003\u0000"+
		"\u0000\u050d\u050e\u0005\n\u0000\u0000\u050e\u050f\u0005\n\u0000\u0000"+
		"\u050f\u0510\u0005\u0003\u0000\u0000\u0510\u0511\u0005\n\u0000\u0000\u0511"+
		"\u0512\u0005\u0003\u0000\u0000\u0512\u0513\u0005\n\u0000\u0000\u0513\u0514"+
		"\u0005\u0003\u0000\u0000\u0514\u0515\u0005\n\u0000\u0000\u0515\u0516\u0005"+
		"\u0004\u0000\u0000\u0516\u0017\u0001\u0000\u0000\u0000\u0517\u0518\u0005"+
		"\u0005\u0000\u0000\u0518\u0519\u0005\u0003\u0000\u0000\u0519\u051a\u0005"+
		"\n\u0000\u0000\u051a\u051b\u0005\u0003\u0000\u0000\u051b\u051c\u0005\n"+
		"\u0000\u0000\u051c\u051d\u0005\n\u0000\u0000\u051d\u051e\u0005\n\u0000"+
		"\u0000\u051e\u051f\u0005\u0003\u0000\u0000\u051f\u0520\u0005\n\u0000\u0000"+
		"\u0520\u0521\u0005\u0003\u0000\u0000\u0521\u0522\u0005\n\u0000\u0000\u0522"+
		"\u0567\u0005\u0004\u0000\u0000\u0523\u0524\u0005\n\u0000\u0000\u0524\u0525"+
		"\u0005\u0003\u0000\u0000\u0525\u0526\u0005\u0004\u0000\u0000\u0526\u0527"+
		"\u0005\n\u0000\u0000\u0527\u0528\u0005\u0003\u0000\u0000\u0528\u0529\u0005"+
		"\n\u0000\u0000\u0529\u052a\u0005\u0003\u0000\u0000\u052a\u052b\u0005\n"+
		"\u0000\u0000\u052b\u052c\u0005\u0003\u0000\u0000\u052c\u052d\u0005\n\u0000"+
		"\u0000\u052d\u052e\u0005\u0003\u0000\u0000\u052e\u052f\u0005\n\u0000\u0000"+
		"\u052f\u0530\u0005\u0003\u0000\u0000\u0530\u0531\u0005\n\u0000\u0000\u0531"+
		"\u0532\u0005\u0003\u0000\u0000\u0532\u0533\u0005\n\u0000\u0000\u0533\u0534"+
		"\u0005\u0003\u0000\u0000\u0534\u0535\u0005\n\u0000\u0000\u0535\u0536\u0005"+
		"\u0003\u0000\u0000\u0536\u0537\u0005\n\u0000\u0000\u0537\u0538\u0005\u0003"+
		"\u0000\u0000\u0538\u0539\u0005\n\u0000\u0000\u0539\u053a\u0005\u0003\u0000"+
		"\u0000\u053a\u053b\u0005\n\u0000\u0000\u053b\u053c\u0005\u0003\u0000\u0000"+
		"\u053c\u055c\u0005\u0004\u0000\u0000\u053d\u053e\u0005\n\u0000\u0000\u053e"+
		"\u053f\u0005\u0003\u0000\u0000\u053f\u0540\u0005\b\u0000\u0000\u0540\u0542"+
		"\u0005\u0003\u0000\u0000\u0541\u0543\u0003 \u0010\u0000\u0542\u0541\u0001"+
		"\u0000\u0000\u0000\u0542\u0543\u0001\u0000\u0000\u0000\u0543\u0544\u0001"+
		"\u0000\u0000\u0000\u0544\u0546\u0005\u0003\u0000\u0000\u0545\u0547\u0003"+
		" \u0010\u0000\u0546\u0545\u0001\u0000\u0000\u0000\u0547\u0548\u0001\u0000"+
		"\u0000\u0000\u0548\u0546\u0001\u0000\u0000\u0000\u0548\u0549\u0001\u0000"+
		"\u0000\u0000\u0549\u054a\u0001\u0000\u0000\u0000\u054a\u054b\u0005\u0003"+
		"\u0000\u0000\u054b\u054c\u0005\n\u0000\u0000\u054c\u054d\u0005\u0003\u0000"+
		"\u0000\u054d\u054e\u0005\n\u0000\u0000\u054e\u054f\u0005\u0003\u0000\u0000"+
		"\u054f\u0550\u0005\b\u0000\u0000\u0550\u0551\u0005\u0003\u0000\u0000\u0551"+
		"\u0552\u0005\b\u0000\u0000\u0552\u0553\u0005\u0003\u0000\u0000\u0553\u0554"+
		"\u0005\b\u0000\u0000\u0554\u0555\u0005\u0003\u0000\u0000\u0555\u0556\u0005"+
		"\b\u0000\u0000\u0556\u0557\u0005\u0003\u0000\u0000\u0557\u0558\u0005\b"+
		"\u0000\u0000\u0558\u0559\u0005\u0003\u0000\u0000\u0559\u055a\u0005\u0004"+
		"\u0000\u0000\u055a\u055b\u0006\f\uffff\uffff\u0000\u055b\u055d\u0001\u0000"+
		"\u0000\u0000\u055c\u053d\u0001\u0000\u0000\u0000\u055d\u055e\u0001\u0000"+
		"\u0000\u0000\u055e\u055c\u0001\u0000\u0000\u0000\u055e\u055f\u0001\u0000"+
		"\u0000\u0000\u055f\u0560\u0001\u0000\u0000\u0000\u0560\u0561\u0005\n\u0000"+
		"\u0000\u0561\u0562\u0005\u0003\u0000\u0000\u0562\u0563\u0005\n\u0000\u0000"+
		"\u0563\u0564\u0005\u0003\u0000\u0000\u0564\u0565\u0005\u0006\u0000\u0000"+
		"\u0565\u0566\u0005\u0004\u0000\u0000\u0566\u0568\u0001\u0000\u0000\u0000"+
		"\u0567\u0523\u0001\u0000\u0000\u0000\u0568\u0569\u0001\u0000\u0000\u0000"+
		"\u0569\u0567\u0001\u0000\u0000\u0000\u0569\u056a\u0001\u0000\u0000\u0000"+
		"\u056a\u056b\u0001\u0000\u0000\u0000\u056b\u056c\u0005\u0005\u0000\u0000"+
		"\u056c\u056d\u0005\u0003\u0000\u0000\u056d\u056e\u0005\n\u0000\u0000\u056e"+
		"\u056f\u0005\u0003\u0000\u0000\u056f\u0570\u0005\n\u0000\u0000\u0570\u0571"+
		"\u0005\n\u0000\u0000\u0571\u0572\u0005\n\u0000\u0000\u0572\u0573\u0005"+
		"\u0003\u0000\u0000\u0573\u0574\u0005\n\u0000\u0000\u0574\u0575\u0005\u0003"+
		"\u0000\u0000\u0575\u0576\u0005\n\u0000\u0000\u0576\u0577\u0005\u0004\u0000"+
		"\u0000\u0577\u0019\u0001\u0000\u0000\u0000\u0578\u0579\u0005\u0005\u0000"+
		"\u0000\u0579\u057a\u0005\u0003\u0000\u0000\u057a\u057b\u0005\n\u0000\u0000"+
		"\u057b\u057c\u0005\n\u0000\u0000\u057c\u057d\u0005\u0003\u0000\u0000\u057d"+
		"\u057e\u0005\n\u0000\u0000\u057e\u057f\u0005\u0003\u0000\u0000\u057f\u0580"+
		"\u0005\n\u0000\u0000\u0580\u05d2\u0005\u0004\u0000\u0000\u0581\u0582\u0005"+
		"\u0005\u0000\u0000\u0582\u0583\u0005\u0003\u0000\u0000\u0583\u0584\u0003"+
		" \u0010\u0000\u0584\u0588\u0005\u0003\u0000\u0000\u0585\u0587\u0003 \u0010"+
		"\u0000\u0586\u0585\u0001\u0000\u0000\u0000\u0587\u058a\u0001\u0000\u0000"+
		"\u0000\u0588\u0586\u0001\u0000\u0000\u0000\u0588\u0589\u0001\u0000\u0000"+
		"\u0000\u0589\u058b\u0001\u0000\u0000\u0000\u058a\u0588\u0001\u0000\u0000"+
		"\u0000\u058b\u058c\u0005\u0004\u0000\u0000\u058c\u058e\u0003 \u0010\u0000"+
		"\u058d\u058f\u0003 \u0010\u0000\u058e\u058d\u0001\u0000\u0000\u0000\u058e"+
		"\u058f\u0001\u0000\u0000\u0000\u058f\u0591\u0001\u0000\u0000\u0000\u0590"+
		"\u0592\u0003 \u0010\u0000\u0591\u0590\u0001\u0000\u0000\u0000\u0591\u0592"+
		"\u0001\u0000\u0000\u0000\u0592\u0594\u0001\u0000\u0000\u0000\u0593\u0595"+
		"\u0003 \u0010\u0000\u0594\u0593\u0001\u0000\u0000\u0000\u0594\u0595\u0001"+
		"\u0000\u0000\u0000\u0595\u0597\u0001\u0000\u0000\u0000\u0596\u0598\u0003"+
		" \u0010\u0000\u0597\u0596\u0001\u0000\u0000\u0000\u0597\u0598\u0001\u0000"+
		"\u0000\u0000\u0598\u059a\u0001\u0000\u0000\u0000\u0599\u059b\u0003 \u0010"+
		"\u0000\u059a\u0599\u0001\u0000\u0000\u0000\u059a\u059b\u0001\u0000\u0000"+
		"\u0000\u059b\u059d\u0001\u0000\u0000\u0000\u059c\u059e\u0003 \u0010\u0000"+
		"\u059d\u059c\u0001\u0000\u0000\u0000\u059d\u059e\u0001\u0000\u0000\u0000"+
		"\u059e\u05a2\u0001\u0000\u0000\u0000\u059f\u05a1\u0003 \u0010\u0000\u05a0"+
		"\u059f\u0001\u0000\u0000\u0000\u05a1\u05a4\u0001\u0000\u0000\u0000\u05a2"+
		"\u05a0\u0001\u0000\u0000\u0000\u05a2\u05a3\u0001\u0000\u0000\u0000\u05a3"+
		"\u05a5\u0001\u0000\u0000\u0000\u05a4\u05a2\u0001\u0000\u0000\u0000\u05a5"+
		"\u05a6\u0005\u0004\u0000\u0000\u05a6\u05a8\u0003 \u0010\u0000\u05a7\u05a9"+
		"\u0003 \u0010\u0000\u05a8\u05a7\u0001\u0000\u0000\u0000\u05a8\u05a9\u0001"+
		"\u0000\u0000\u0000\u05a9\u05ab\u0001\u0000\u0000\u0000\u05aa\u05ac\u0003"+
		" \u0010\u0000\u05ab\u05aa\u0001\u0000\u0000\u0000\u05ab\u05ac\u0001\u0000"+
		"\u0000\u0000\u05ac\u05ae\u0001\u0000\u0000\u0000\u05ad\u05af\u0003 \u0010"+
		"\u0000\u05ae\u05ad\u0001\u0000\u0000\u0000\u05ae\u05af\u0001\u0000\u0000"+
		"\u0000\u05af\u05b1\u0001\u0000\u0000\u0000\u05b0\u05b2\u0003 \u0010\u0000"+
		"\u05b1\u05b0\u0001\u0000\u0000\u0000\u05b1\u05b2\u0001\u0000\u0000\u0000"+
		"\u05b2\u05b4\u0001\u0000\u0000\u0000\u05b3\u05b5\u0003 \u0010\u0000\u05b4"+
		"\u05b3\u0001\u0000\u0000\u0000\u05b4\u05b5\u0001\u0000\u0000\u0000\u05b5"+
		"\u05b7\u0001\u0000\u0000\u0000\u05b6\u05b8\u0003 \u0010\u0000\u05b7\u05b6"+
		"\u0001\u0000\u0000\u0000\u05b7\u05b8\u0001\u0000\u0000\u0000\u05b8\u05bc"+
		"\u0001\u0000\u0000\u0000\u05b9\u05bb\u0003 \u0010\u0000\u05ba\u05b9\u0001"+
		"\u0000\u0000\u0000\u05bb\u05be\u0001\u0000\u0000\u0000\u05bc\u05ba\u0001"+
		"\u0000\u0000\u0000\u05bc\u05bd\u0001\u0000\u0000\u0000\u05bd\u05bf\u0001"+
		"\u0000\u0000\u0000\u05be\u05bc\u0001\u0000\u0000\u0000\u05bf\u05c0\u0005"+
		"\u0004\u0000\u0000\u05c0\u05c4\u0005\u0006\u0000\u0000\u05c1\u05c3\u0005"+
		"\n\u0000\u0000\u05c2\u05c1\u0001\u0000\u0000\u0000\u05c3\u05c6\u0001\u0000"+
		"\u0000\u0000\u05c4\u05c2\u0001\u0000\u0000\u0000\u05c4\u05c5\u0001\u0000"+
		"\u0000\u0000\u05c5\u05c7\u0001\u0000\u0000\u0000\u05c6\u05c4\u0001\u0000"+
		"\u0000\u0000\u05c7\u05c8\u0005\u0004\u0000\u0000\u05c8\u05c9\u0003 \u0010"+
		"\u0000\u05c9\u05ca\u0005\u0004\u0000\u0000\u05ca\u05cb\u0005\n\u0000\u0000"+
		"\u05cb\u05cc\u0005\u0003\u0000\u0000\u05cc\u05cd\u0005\n\u0000\u0000\u05cd"+
		"\u05ce\u0005\u0003\u0000\u0000\u05ce\u05cf\u0005\u0006\u0000\u0000\u05cf"+
		"\u05d0\u0005\u0004\u0000\u0000\u05d0\u05d1\u0006\r\uffff\uffff\u0000\u05d1"+
		"\u05d3\u0001\u0000\u0000\u0000\u05d2\u0581\u0001\u0000\u0000\u0000\u05d3"+
		"\u05d4\u0001\u0000\u0000\u0000\u05d4\u05d2\u0001\u0000\u0000\u0000\u05d4"+
		"\u05d5\u0001\u0000\u0000\u0000\u05d5\u05d6\u0001\u0000\u0000\u0000\u05d6"+
		"\u05d7\u0005\u0005\u0000\u0000\u05d7\u05d8\u0005\u0003\u0000\u0000\u05d8"+
		"\u05d9\u0005\n\u0000\u0000\u05d9\u05da\u0005\n\u0000\u0000\u05da\u05db"+
		"\u0005\u0003\u0000\u0000\u05db\u05dc\u0005\n\u0000\u0000\u05dc\u05dd\u0005"+
		"\u0003\u0000\u0000\u05dd\u05de\u0005\n\u0000\u0000\u05de\u05df\u0005\u0004"+
		"\u0000\u0000\u05df\u001b\u0001\u0000\u0000\u0000\u05e0\u05e1\u0005\u0005"+
		"\u0000\u0000\u05e1\u05e2\u0005\u0003\u0000\u0000\u05e2\u05e3\u0005\n\u0000"+
		"\u0000\u05e3\u05e4\u0005\n\u0000\u0000\u05e4\u05e5\u0005\n\u0000\u0000"+
		"\u05e5\u05e6\u0005\u0003\u0000\u0000\u05e6\u05e7\u0005\n\u0000\u0000\u05e7"+
		"\u05e8\u0005\n\u0000\u0000\u05e8\u05e9\u0005\n\u0000\u0000\u05e9\u05ea"+
		"\u0005\u0003\u0000\u0000\u05ea\u05eb\u0005\n\u0000\u0000\u05eb\u05ec\u0005"+
		"\u0003\u0000\u0000\u05ec\u05ed\u0005\n\u0000\u0000\u05ed\u0656\u0005\u0004"+
		"\u0000\u0000\u05ee\u05ef\u0005\n\u0000\u0000\u05ef\u05f1\u0005\u0003\u0000"+
		"\u0000\u05f0\u05f2\u0005\n\u0000\u0000\u05f1\u05f0\u0001\u0000\u0000\u0000"+
		"\u05f1\u05f2\u0001\u0000\u0000\u0000\u05f2\u05f3\u0001\u0000\u0000\u0000"+
		"\u05f3\u05f4\u0005\u0003\u0000\u0000\u05f4\u05f5\u0005\n\u0000\u0000\u05f5"+
		"\u05f6\u0005\u0003\u0000\u0000\u05f6\u05f7\u0005\n\u0000\u0000\u05f7\u05f8"+
		"\u0005\u0003\u0000\u0000\u05f8\u05f9\u0005\n\u0000\u0000\u05f9\u05fa\u0005"+
		"\u0003\u0000\u0000\u05fa\u05fb\u0005\n\u0000\u0000\u05fb\u05fc\u0005\u0003"+
		"\u0000\u0000\u05fc\u05fd\u0005\n\u0000\u0000\u05fd\u05fe\u0005\u0003\u0000"+
		"\u0000\u05fe\u05ff\u0005\n\u0000\u0000\u05ff\u0600\u0005\u0003\u0000\u0000"+
		"\u0600\u0601\u0005\n\u0000\u0000\u0601\u0602\u0005\u0003\u0000\u0000\u0602"+
		"\u0603\u0005\n\u0000\u0000\u0603\u0604\u0005\u0003\u0000\u0000\u0604\u064c"+
		"\u0005\u0004\u0000\u0000\u0605\u0606\u0005\u0003\u0000\u0000\u0606\u0607"+
		"\u0005\u0003\u0000\u0000\u0607\u0608\u0005\u0003\u0000\u0000\u0608\u0609"+
		"\u0005\u0003\u0000\u0000\u0609\u060a\u0005\u0003\u0000\u0000\u060a\u060b"+
		"\u0005\u0003\u0000\u0000\u060b\u060c\u0005\u0003\u0000\u0000\u060c\u060d"+
		"\u0005\u0003\u0000\u0000\u060d\u060e\u0005\u0003\u0000\u0000\u060e\u060f"+
		"\u0005\u0003\u0000\u0000\u060f\u064d\u0005\u0004\u0000\u0000\u0610\u0612"+
		"\u0003 \u0010\u0000\u0611\u0613\u0003 \u0010\u0000\u0612\u0611\u0001\u0000"+
		"\u0000\u0000\u0612\u0613\u0001\u0000\u0000\u0000\u0613\u0615\u0001\u0000"+
		"\u0000\u0000\u0614\u0616\u0003 \u0010\u0000\u0615\u0614\u0001\u0000\u0000"+
		"\u0000\u0615\u0616\u0001\u0000\u0000\u0000\u0616\u0618\u0001\u0000\u0000"+
		"\u0000\u0617\u0619\u0003 \u0010\u0000\u0618\u0617\u0001\u0000\u0000\u0000"+
		"\u0618\u0619\u0001\u0000\u0000\u0000\u0619\u061b\u0001\u0000\u0000\u0000"+
		"\u061a\u061c\u0003 \u0010\u0000\u061b\u061a\u0001\u0000\u0000\u0000\u061b"+
		"\u061c\u0001\u0000\u0000\u0000\u061c\u061e\u0001\u0000\u0000\u0000\u061d"+
		"\u061f\u0003 \u0010\u0000\u061e\u061d\u0001\u0000\u0000\u0000\u061e\u061f"+
		"\u0001\u0000\u0000\u0000\u061f\u0621\u0001\u0000\u0000\u0000\u0620\u0622"+
		"\u0003 \u0010\u0000\u0621\u0620\u0001\u0000\u0000\u0000\u0621\u0622\u0001"+
		"\u0000\u0000\u0000\u0622\u0626\u0001\u0000\u0000\u0000\u0623\u0625\u0003"+
		" \u0010\u0000\u0624\u0623\u0001\u0000\u0000\u0000\u0625\u0628\u0001\u0000"+
		"\u0000\u0000\u0626\u0624\u0001\u0000\u0000\u0000\u0626\u0627\u0001\u0000"+
		"\u0000\u0000\u0627\u0629\u0001\u0000\u0000\u0000\u0628\u0626\u0001\u0000"+
		"\u0000\u0000\u0629\u062a\u0005\u0003\u0000\u0000\u062a\u062b\u0003 \u0010"+
		"\u0000\u062b\u062c\u0005\u0003\u0000\u0000\u062c\u062d\u0005\n\u0000\u0000"+
		"\u062d\u0631\u0005\u0003\u0000\u0000\u062e\u0630\u0003 \u0010\u0000\u062f"+
		"\u062e\u0001\u0000\u0000\u0000\u0630\u0633\u0001\u0000\u0000\u0000\u0631"+
		"\u062f\u0001\u0000\u0000\u0000\u0631\u0632\u0001\u0000\u0000\u0000\u0632"+
		"\u0634\u0001\u0000\u0000\u0000\u0633\u0631\u0001\u0000\u0000\u0000\u0634"+
		"\u0636\u0005\u0003\u0000\u0000\u0635\u0637\u0005\u0006\u0000\u0000\u0636"+
		"\u0635\u0001\u0000\u0000\u0000\u0636\u0637\u0001\u0000\u0000\u0000\u0637"+
		"\u0638\u0001\u0000\u0000\u0000\u0638\u0639\u0005\u0003\u0000\u0000\u0639"+
		"\u063a\u0005\u0006\u0000\u0000\u063a\u063c\u0005\u0003\u0000\u0000\u063b"+
		"\u063d\u0005\n\u0000\u0000\u063c\u063b\u0001\u0000\u0000\u0000\u063c\u063d"+
		"\u0001\u0000\u0000\u0000\u063d\u063e\u0001\u0000\u0000\u0000\u063e\u063f"+
		"\u0005\u0003\u0000\u0000\u063f\u0640\u0005\b\u0000\u0000\u0640\u0642\u0005"+
		"\u0003\u0000\u0000\u0641\u0643\u0005\b\u0000\u0000\u0642\u0641\u0001\u0000"+
		"\u0000\u0000\u0642\u0643\u0001\u0000\u0000\u0000\u0643\u0644\u0001\u0000"+
		"\u0000\u0000\u0644\u0646\u0005\u0003\u0000\u0000\u0645\u0647\u0005\b\u0000"+
		"\u0000\u0646\u0645\u0001\u0000\u0000\u0000\u0646\u0647\u0001\u0000\u0000"+
		"\u0000\u0647\u0648\u0001\u0000\u0000\u0000\u0648\u0649\u0005\u0003\u0000"+
		"\u0000\u0649\u064a\u0005\u0004\u0000\u0000\u064a\u064b\u0006\u000e\uffff"+
		"\uffff\u0000\u064b\u064d\u0001\u0000\u0000\u0000\u064c\u0605\u0001\u0000"+
		"\u0000\u0000\u064c\u0610\u0001\u0000\u0000\u0000\u064d\u064e\u0001\u0000"+
		"\u0000\u0000\u064e\u064c\u0001\u0000\u0000\u0000\u064e\u064f\u0001\u0000"+
		"\u0000\u0000\u064f\u0650\u0001\u0000\u0000\u0000\u0650\u0651\u0005\n\u0000"+
		"\u0000\u0651\u0652\u0005\u0003\u0000\u0000\u0652\u0653\u0005\n\u0000\u0000"+
		"\u0653\u0654\u0005\u0003\u0000\u0000\u0654\u0655\u0005\u0006\u0000\u0000"+
		"\u0655\u0657\u0005\u0004\u0000\u0000\u0656\u05ee\u0001\u0000\u0000\u0000"+
		"\u0657\u0658\u0001\u0000\u0000\u0000\u0658\u0656\u0001\u0000\u0000\u0000"+
		"\u0658\u0659\u0001\u0000\u0000\u0000\u0659\u065a\u0001\u0000\u0000\u0000"+
		"\u065a\u065b\u0005\u0005\u0000\u0000\u065b\u065c\u0005\u0003\u0000\u0000"+
		"\u065c\u065d\u0005\n\u0000\u0000\u065d\u065e\u0005\n\u0000\u0000\u065e"+
		"\u065f\u0005\n\u0000\u0000\u065f\u0660\u0005\u0003\u0000\u0000\u0660\u0661"+
		"\u0005\n\u0000\u0000\u0661\u0662\u0005\n\u0000\u0000\u0662\u0663\u0005"+
		"\n\u0000\u0000\u0663\u0664\u0005\u0003\u0000\u0000\u0664\u0665\u0005\n"+
		"\u0000\u0000\u0665\u0666\u0005\u0003\u0000\u0000\u0666\u0667\u0005\n\u0000"+
		"\u0000\u0667\u0668\u0005\u0004\u0000\u0000\u0668\u001d\u0001\u0000\u0000"+
		"\u0000\u0669\u066a\u0005\u0005\u0000\u0000\u066a\u066b\u0005\u0003\u0000"+
		"\u0000\u066b\u066c\u0005\n\u0000\u0000\u066c\u066d\u0005\u0003\u0000\u0000"+
		"\u066d\u066e\u0005\n\u0000\u0000\u066e\u066f\u0005\n\u0000\u0000\u066f"+
		"\u0670\u0005\n\u0000\u0000\u0670\u0671\u0005\u0003\u0000\u0000\u0671\u0672"+
		"\u0005\n\u0000\u0000\u0672\u0673\u0005\u0003\u0000\u0000\u0673\u0674\u0005"+
		"\n\u0000\u0000\u0674\u06f4\u0005\u0004\u0000\u0000\u0675\u0676\u0005\n"+
		"\u0000\u0000\u0676\u0677\u0005\u0003\u0000\u0000\u0677\u0678\u0005\n\u0000"+
		"\u0000\u0678\u0679\u0005\n\u0000\u0000\u0679\u067a\u0005\u0003\u0000\u0000"+
		"\u067a\u067b\u0005\n\u0000\u0000\u067b\u067c\u0005\n\u0000\u0000\u067c"+
		"\u067d\u0005\u0003\u0000\u0000\u067d\u067e\u0005\n\u0000\u0000\u067e\u067f"+
		"\u0005\n\u0000\u0000\u067f\u0680\u0005\u0003\u0000\u0000\u0680\u0681\u0005"+
		"\n\u0000\u0000\u0681\u0682\u0005\u0003\u0000\u0000\u0682\u0683\u0005\n"+
		"\u0000\u0000\u0683\u0684\u0005\u0003\u0000\u0000\u0684\u0685\u0005\n\u0000"+
		"\u0000\u0685\u0686\u0005\u0003\u0000\u0000\u0686\u0687\u0005\n\u0000\u0000"+
		"\u0687\u0688\u0005\u0003\u0000\u0000\u0688\u0689\u0005\n\u0000\u0000\u0689"+
		"\u068a\u0005\u0003\u0000\u0000\u068a\u068b\u0005\n\u0000\u0000\u068b\u068c"+
		"\u0005\u0003\u0000\u0000\u068c\u068d\u0005\n\u0000\u0000\u068d\u068e\u0005"+
		"\u0003\u0000\u0000\u068e\u068f\u0005\n\u0000\u0000\u068f\u0690\u0005\u0003"+
		"\u0000\u0000\u0690\u0691\u0005\n\u0000\u0000\u0691\u0692\u0005\u0003\u0000"+
		"\u0000\u0692\u0693\u0005\u0003\u0000\u0000\u0693\u0694\u0005\u0003\u0000"+
		"\u0000\u0694\u0695\u0005\n\u0000\u0000\u0695\u0696\u0005\u0003\u0000\u0000"+
		"\u0696\u0697\u0005\n\u0000\u0000\u0697\u0698\u0005\u0003\u0000\u0000\u0698"+
		"\u0699\u0005\u0004\u0000\u0000\u0699\u069a\u0005\n\u0000\u0000\u069a\u069b"+
		"\u0005\u0003\u0000\u0000\u069b\u069c\u0005\n\u0000\u0000\u069c\u069d\u0005"+
		"\u0003\u0000\u0000\u069d\u069e\u0005\n\u0000\u0000\u069e\u069f\u0005\u0003"+
		"\u0000\u0000\u069f\u06a0\u0005\n\u0000\u0000\u06a0\u06a1\u0005\u0003\u0000"+
		"\u0000\u06a1\u06a2\u0005\n\u0000\u0000\u06a2\u06a3\u0005\u0003\u0000\u0000"+
		"\u06a3\u06a4\u0005\n\u0000\u0000\u06a4\u06a5\u0005\u0003\u0000\u0000\u06a5"+
		"\u06a6\u0005\u0003\u0000\u0000\u06a6\u06a7\u0005\u0003\u0000\u0000\u06a7"+
		"\u06e6\u0005\u0004\u0000\u0000\u06a8\u06aa\u0005\u0003\u0000\u0000\u06a9"+
		"\u06a8\u0001\u0000\u0000\u0000\u06aa\u06ab\u0001\u0000\u0000\u0000\u06ab"+
		"\u06a9\u0001\u0000\u0000\u0000\u06ab\u06ac\u0001\u0000\u0000\u0000\u06ac"+
		"\u06ad\u0001\u0000\u0000\u0000\u06ad\u06e7\u0005\u0004\u0000\u0000\u06ae"+
		"\u06af\u0005\u0006\u0000\u0000\u06af\u06b1\u0005\u0003\u0000\u0000\u06b0"+
		"\u06b2\u0005\u0006\u0000\u0000\u06b1\u06b0\u0001\u0000\u0000\u0000\u06b1"+
		"\u06b2\u0001\u0000\u0000\u0000\u06b2\u06b3\u0001\u0000\u0000\u0000\u06b3"+
		"\u06b5\u0005\u0003\u0000\u0000\u06b4\u06b6\u0005\u0006\u0000\u0000\u06b5"+
		"\u06b4\u0001\u0000\u0000\u0000\u06b5\u06b6\u0001\u0000\u0000\u0000\u06b6"+
		"\u06b7\u0001\u0000\u0000\u0000\u06b7\u06b9\u0005\u0003\u0000\u0000\u06b8"+
		"\u06ba\u0005\u0006\u0000\u0000\u06b9\u06b8\u0001\u0000\u0000\u0000\u06b9"+
		"\u06ba\u0001\u0000\u0000\u0000\u06ba\u06bb\u0001\u0000\u0000\u0000\u06bb"+
		"\u06bc\u0005\u0003\u0000\u0000\u06bc\u06bd\u0003 \u0010\u0000\u06bd\u06bf"+
		"\u0005\u0003\u0000\u0000\u06be\u06c0\u0003 \u0010\u0000\u06bf\u06be\u0001"+
		"\u0000\u0000\u0000\u06c0\u06c1\u0001\u0000\u0000\u0000\u06c1\u06bf\u0001"+
		"\u0000\u0000\u0000\u06c1\u06c2\u0001\u0000\u0000\u0000\u06c2\u06c3\u0001"+
		"\u0000\u0000\u0000\u06c3\u06c4\u0005\u0003\u0000\u0000\u06c4\u06c5\u0005"+
		"\n\u0000\u0000\u06c5\u06c6\u0005\u0003\u0000\u0000\u06c6\u06c7\u0005\n"+
		"\u0000\u0000\u06c7\u06c8\u0005\u0003\u0000\u0000\u06c8\u06c9\u0005\n\u0000"+
		"\u0000\u06c9\u06ca\u0005\u0003\u0000\u0000\u06ca\u06cb\u0005\n\u0000\u0000"+
		"\u06cb\u06cc\u0005\u0003\u0000\u0000\u06cc\u06cd\u0005\b\u0000\u0000\u06cd"+
		"\u06cf\u0005\u0003\u0000\u0000\u06ce\u06d0\u0005\b\u0000\u0000\u06cf\u06ce"+
		"\u0001\u0000\u0000\u0000\u06cf\u06d0\u0001\u0000\u0000\u0000\u06d0\u06d1"+
		"\u0001\u0000\u0000\u0000\u06d1\u06d2\u0005\u0003\u0000\u0000\u06d2\u06d3"+
		"\u0005\b\u0000\u0000\u06d3\u06d4\u0005\u0003\u0000\u0000\u06d4\u06d5\u0005"+
		"\b\u0000\u0000\u06d5\u06d7\u0005\u0003\u0000\u0000\u06d6\u06d8\u0005\b"+
		"\u0000\u0000\u06d7\u06d6\u0001\u0000\u0000\u0000\u06d7\u06d8\u0001\u0000"+
		"\u0000\u0000\u06d8\u06da\u0001\u0000\u0000\u0000\u06d9\u06db\u0005\u0003"+
		"\u0000\u0000\u06da\u06d9\u0001\u0000\u0000\u0000\u06db\u06dc\u0001\u0000"+
		"\u0000\u0000\u06dc\u06da\u0001\u0000\u0000\u0000\u06dc\u06dd\u0001\u0000"+
		"\u0000\u0000\u06dd\u06de\u0001\u0000\u0000\u0000\u06de\u06df\u0005\u0003"+
		"\u0000\u0000\u06df\u06e0\u0005\b\u0000\u0000\u06e0\u06e1\u0005\u0003\u0000"+
		"\u0000\u06e1\u06e2\u0005\b\u0000\u0000\u06e2\u06e3\u0005\u0003\u0000\u0000"+
		"\u06e3\u06e4\u0005\u0004\u0000\u0000\u06e4\u06e5\u0006\u000f\uffff\uffff"+
		"\u0000\u06e5\u06e7\u0001\u0000\u0000\u0000\u06e6\u06a9\u0001\u0000\u0000"+
		"\u0000\u06e6\u06ae\u0001\u0000\u0000\u0000\u06e7\u06e8\u0001\u0000\u0000"+
		"\u0000\u06e8\u06e6\u0001\u0000\u0000\u0000\u06e8\u06e9\u0001\u0000\u0000"+
		"\u0000\u06e9\u06eb\u0001\u0000\u0000\u0000\u06ea\u0675\u0001\u0000\u0000"+
		"\u0000\u06eb\u06ec\u0001\u0000\u0000\u0000\u06ec\u06ea\u0001\u0000\u0000"+
		"\u0000\u06ec\u06ed\u0001\u0000\u0000\u0000\u06ed\u06ee\u0001\u0000\u0000"+
		"\u0000\u06ee\u06ef\u0005\n\u0000\u0000\u06ef\u06f0\u0005\u0003\u0000\u0000"+
		"\u06f0\u06f1\u0005\n\u0000\u0000\u06f1\u06f2\u0005\u0003\u0000\u0000\u06f2"+
		"\u06f3\u0005\u0006\u0000\u0000\u06f3\u06f5\u0005\u0004\u0000\u0000\u06f4"+
		"\u06ea\u0001\u0000\u0000\u0000\u06f5\u06f6\u0001\u0000\u0000\u0000\u06f6"+
		"\u06f4\u0001\u0000\u0000\u0000\u06f6\u06f7\u0001\u0000\u0000\u0000\u06f7"+
		"\u06f8\u0001\u0000\u0000\u0000\u06f8\u06f9\u0005\u0005\u0000\u0000\u06f9"+
		"\u06fa\u0005\u0003\u0000\u0000\u06fa\u06fb\u0005\n\u0000\u0000\u06fb\u06fc"+
		"\u0005\u0003\u0000\u0000\u06fc\u06fd\u0005\n\u0000\u0000\u06fd\u06fe\u0005"+
		"\n\u0000\u0000\u06fe\u06ff\u0005\n\u0000\u0000\u06ff\u0700\u0005\u0003"+
		"\u0000\u0000\u0700\u0701\u0005\n\u0000\u0000\u0701\u0702\u0005\u0003\u0000"+
		"\u0000\u0702\u0703\u0005\n\u0000\u0000\u0703\u0704\u0005\u0004\u0000\u0000"+
		"\u0704\u001f\u0001\u0000\u0000\u0000\u0705\u0706\u0007\u0000\u0000\u0000"+
		"\u0706!\u0001\u0000\u0000\u0000\u0707\u070a\u0003 \u0010\u0000\u0708\u070a"+
		"\u0005\u0003\u0000\u0000\u0709\u0707\u0001\u0000\u0000\u0000\u0709\u0708"+
		"\u0001\u0000\u0000\u0000\u070a\u070b\u0001\u0000\u0000\u0000\u070b\u0709"+
		"\u0001\u0000\u0000\u0000\u070b\u070c\u0001\u0000\u0000\u0000\u070c\u070d"+
		"\u0001\u0000\u0000\u0000\u070d\u070e\u0005\u0004\u0000\u0000\u070e#\u0001"+
		"\u0000\u0000\u0000\u070f\u0713\u0003 \u0010\u0000\u0710\u0713\u0005\u0003"+
		"\u0000\u0000\u0711\u0713\u0005\u0004\u0000\u0000\u0712\u070f\u0001\u0000"+
		"\u0000\u0000\u0712\u0710\u0001\u0000\u0000\u0000\u0712\u0711\u0001\u0000"+
		"\u0000\u0000\u0713\u0714\u0001\u0000\u0000\u0000\u0714\u0712\u0001\u0000"+
		"\u0000\u0000\u0714\u0715\u0001\u0000\u0000\u0000\u0715%\u0001\u0000\u0000"+
		"\u0000\u009f5rz\u0088\u008c\u0092\u0096\u009a\u00a6\u00b1\u00fa\u0110"+
		"\u0112\u011d\u0152\u017d\u0188\u01d5\u01d7\u01e2\u0236\u0238\u0243\u0268"+
		"\u026b\u026e\u0271\u0274\u0277\u027c\u0294\u02a2\u02c4\u02c9\u02cc\u02cf"+
		"\u02d2\u02d5\u02d8\u02dd\u02e3\u02e6\u02e9\u02ec\u02ef\u02f2\u02f7\u02ff"+
		"\u030b\u0316\u0358\u035b\u035e\u0361\u0364\u0367\u036c\u0374\u0377\u037a"+
		"\u037d\u0380\u0383\u0388\u0395\u039e\u03a8\u03b3\u03d2\u03d9\u03dc\u03df"+
		"\u03e2\u03e5\u03e8\u03ed\u03f5\u03f8\u03fb\u03fe\u0401\u0404\u0409\u042e"+
		"\u0432\u0436\u043a\u043e\u0446\u044b\u044d\u0451\u045c\u047a\u04a4\u04a6"+
		"\u04aa\u04b5\u04d6\u04d9\u04dc\u04df\u04e2\u04e5\u04ea\u0509\u0542\u0548"+
		"\u055e\u0569\u0588\u058e\u0591\u0594\u0597\u059a\u059d\u05a2\u05a8\u05ab"+
		"\u05ae\u05b1\u05b4\u05b7\u05bc\u05c4\u05d4\u05f1\u0612\u0615\u0618\u061b"+
		"\u061e\u0621\u0626\u0631\u0636\u063c\u0642\u0646\u064c\u064e\u0658\u06ab"+
		"\u06b1\u06b5\u06b9\u06c1\u06cf\u06d7\u06dc\u06e6\u06e8\u06ec\u06f6\u0709"+
		"\u070b\u0712\u0714";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}