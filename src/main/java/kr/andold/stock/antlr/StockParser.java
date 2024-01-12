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
		RULE_stockDocument = 0, RULE_krxItemInfoCompany = 1, RULE_krxItemInfoEtf = 2, 
		RULE_krxBasicInfoEtf = 3, RULE_krxBasicInfoCompany = 4, RULE_etfAllPrice = 5, 
		RULE_companyAllPrice = 6, RULE_crawlPriceKrx = 7, RULE_crawlItemEtf = 8, 
		RULE_crawlPriceEtf = 9, RULE_crawlPriceCompany = 10, RULE_crawlItemDetailCompanyThread = 11, 
		RULE_crawlItemDividendTopCompany = 12, RULE_crawlEtfDetailThread = 13, 
		RULE_crawlDividendHistoryEtfThread = 14, RULE_crawlDividendHistoryCompanyThread = 15, 
		RULE_word = 16, RULE_line = 17, RULE_eof = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"stockDocument", "krxItemInfoCompany", "krxItemInfoEtf", "krxBasicInfoEtf", 
			"krxBasicInfoCompany", "etfAllPrice", "companyAllPrice", "crawlPriceKrx", 
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
				crawlPriceKrx();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(47);
				companyAllPrice();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(48);
				etfAllPrice();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(49);
				krxBasicInfoCompany();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(50);
				krxBasicInfoEtf();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(51);
				krxItemInfoCompany();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(52);
				krxItemInfoEtf();
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
		enterRule(_localctx, 2, RULE_krxItemInfoCompany);
		int _la;
		try {
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
			match(WORD);
			setState(63);
			match(WORD);
			setState(64);
			match(WORD);
			setState(65);
			match(TAB);
			setState(66);
			match(WORD);
			setState(67);
			match(NEWLINE);
			setState(68);
			match(WORD);
			setState(69);
			match(TAB);
			setState(70);
			match(WORD);
			setState(71);
			match(TAB);
			setState(72);
			((KrxItemInfoCompanyContext)_localctx).symbol = word();
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(73);
				((KrxItemInfoCompanyContext)_localctx).symbol1 = word();
				}
				break;
			}
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(76);
				((KrxItemInfoCompanyContext)_localctx).symbol2 = word();
				}
				break;
			}
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(79);
				((KrxItemInfoCompanyContext)_localctx).symbol3 = word();
				}
				break;
			}
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(82);
				((KrxItemInfoCompanyContext)_localctx).symbol4 = word();
				}
				break;
			}
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(85);
				((KrxItemInfoCompanyContext)_localctx).symbol5 = word();
				}
				break;
			}
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(88);
				((KrxItemInfoCompanyContext)_localctx).symbol6 = word();
				}
				break;
			}
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(91);
				((KrxItemInfoCompanyContext)_localctx).symbol7 = word();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(TAB);
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(98);
				word();
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(103);
			match(TAB);
			setState(104);
			match(NEWLINE);
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
			((KrxItemInfoCompanyContext)_localctx).code = word();
			setState(112);
			match(TAB);
			setState(113);
			match(NEWLINE);
			setState(114);
			match(WORD);
			setState(115);
			match(TAB);
			setState(116);
			match(WORD);
			setState(117);
			match(TAB);
			setState(118);
			match(NUMBER);
			setState(119);
			match(TAB);
			setState(120);
			match(NUMBER);
			setState(121);
			match(TAB);
			setState(122);
			match(NEWLINE);
			setState(123);
			match(WORD);
			setState(124);
			match(TAB);
			setState(125);
			match(WORD);
			setState(126);
			match(TAB);
			setState(127);
			((KrxItemInfoCompanyContext)_localctx).volumeOfListedShares = match(NUMBER);
			setState(128);
			match(TAB);
			setState(129);
			match(WORD);
			setState(130);
			match(TAB);
			setState(131);
			match(NEWLINE);
			setState(132);
			match(WORD);
			setState(133);
			match(TAB);
			setState(134);
			match(WORD);
			setState(135);
			match(TAB);
			setState(136);
			((KrxItemInfoCompanyContext)_localctx).ipo = match(DATE);
			setState(137);
			match(TAB);
			setState(138);
			match(DATE);
			setState(139);
			match(TAB);
			setState(140);
			match(NEWLINE);
			setState(141);
			match(WORD);
			setState(142);
			match(TAB);
			setState(143);
			match(WORD);
			setState(144);
			match(TAB);
			setState(145);
			((KrxItemInfoCompanyContext)_localctx).category = word();
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(146);
				((KrxItemInfoCompanyContext)_localctx).category1 = word();
				}
				break;
			}
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(149);
				((KrxItemInfoCompanyContext)_localctx).category2 = word();
				}
				break;
			}
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(152);
				((KrxItemInfoCompanyContext)_localctx).category3 = word();
				}
				break;
			}
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(155);
				((KrxItemInfoCompanyContext)_localctx).category4 = word();
				}
				break;
			}
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(158);
				((KrxItemInfoCompanyContext)_localctx).category5 = word();
				}
				break;
			}
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(161);
				((KrxItemInfoCompanyContext)_localctx).category6 = word();
				}
				break;
			}
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(164);
				((KrxItemInfoCompanyContext)_localctx).category7 = word();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(TAB);
			setState(171);
			match(WORD);
			setState(172);
			match(TAB);
			setState(173);
			match(NEWLINE);
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
			match(WORD);
			setState(180);
			match(NUMBER);
			setState(181);
			match(TAB);
			setState(182);
			match(NEWLINE);
			setState(183);
			match(WORD);
			setState(184);
			match(TAB);
			setState(185);
			match(WORD);
			setState(186);
			match(TAB);
			setState(187);
			match(NEWLINE);
			setState(188);
			match(WORD);
			setState(189);
			match(TAB);
			setState(190);
			match(WORD);
			setState(191);
			match(TAB);
			setState(192);
			match(NEWLINE);
			setState(193);
			match(WORD);
			setState(194);
			match(TAB);
			setState(195);
			match(WORD);
			setState(196);
			match(TAB);
			setState(197);
			match(DATE);
			setState(198);
			match(NEWLINE);
			setState(199);
			match(KEYWORD);
			setState(200);
			match(TAB);
			setState(201);
			match(WORD);
			setState(202);
			match(TAB);
			setState(203);
			match(WORD);
			setState(204);
			match(WORD);
			setState(205);
			match(WORD);
			setState(206);
			match(WORD);
			setState(207);
			match(WORD);
			setState(208);
			match(WORD);
			setState(209);
			match(TAB);
			setState(210);
			match(WORD);
			setState(211);
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
		enterRule(_localctx, 4, RULE_krxItemInfoEtf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(KEYWORD);
			setState(215);
			match(TAB);
			setState(216);
			match(WORD);
			setState(217);
			match(TAB);
			setState(218);
			match(WORD);
			setState(219);
			match(WORD);
			setState(220);
			match(WORD);
			setState(221);
			match(WORD);
			setState(222);
			match(WORD);
			setState(223);
			match(WORD);
			setState(224);
			match(TAB);
			setState(225);
			match(WORD);
			setState(226);
			match(NEWLINE);
			setState(227);
			match(WORD);
			setState(228);
			match(TAB);
			setState(229);
			match(WORD);
			setState(230);
			match(TAB);
			setState(231);
			((KrxItemInfoEtfContext)_localctx).symbol = word();
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(232);
				((KrxItemInfoEtfContext)_localctx).symbol1 = word();
				}
				break;
			}
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(235);
				((KrxItemInfoEtfContext)_localctx).symbol2 = word();
				}
				break;
			}
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(238);
				((KrxItemInfoEtfContext)_localctx).symbol3 = word();
				}
				break;
			}
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(241);
				((KrxItemInfoEtfContext)_localctx).symbol4 = word();
				}
				break;
			}
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(244);
				((KrxItemInfoEtfContext)_localctx).symbol5 = word();
				}
				break;
			}
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(247);
				((KrxItemInfoEtfContext)_localctx).symbol6 = word();
				}
				break;
			}
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(250);
				((KrxItemInfoEtfContext)_localctx).symbol7 = word();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			match(TAB);
			setState(258); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(257);
				word();
				}
				}
				setState(260); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(262);
			match(TAB);
			setState(263);
			match(NEWLINE);
			setState(264);
			match(WORD);
			setState(265);
			match(TAB);
			setState(266);
			match(WORD);
			setState(267);
			match(TAB);
			setState(268);
			match(WORD);
			setState(269);
			match(TAB);
			setState(270);
			((KrxItemInfoEtfContext)_localctx).code = word();
			setState(271);
			match(TAB);
			setState(272);
			match(NEWLINE);
			setState(273);
			match(WORD);
			setState(274);
			match(TAB);
			setState(275);
			match(WORD);
			setState(276);
			match(TAB);
			setState(277);
			match(WORD);
			setState(278);
			match(WORD);
			setState(279);
			match(WORD);
			setState(280);
			match(WORD);
			setState(281);
			match(WORD);
			setState(282);
			match(WORD);
			setState(283);
			match(WORD);
			setState(284);
			match(TAB);
			setState(285);
			match(WORD);
			setState(286);
			match(TAB);
			setState(287);
			match(NEWLINE);
			setState(288);
			match(WORD);
			setState(289);
			match(TAB);
			setState(290);
			match(WORD);
			setState(291);
			match(TAB);
			setState(292);
			match(NUMBER);
			setState(293);
			match(TAB);
			setState(294);
			((KrxItemInfoEtfContext)_localctx).volumeOfListedShares = match(NUMBER);
			setState(295);
			match(TAB);
			setState(296);
			match(NEWLINE);
			setState(297);
			match(WORD);
			setState(298);
			match(TAB);
			setState(299);
			match(WORD);
			setState(300);
			match(TAB);
			setState(301);
			match(NUMBER);
			setState(302);
			match(TAB);
			setState(303);
			((KrxItemInfoEtfContext)_localctx).ipo = match(DATE);
			setState(304);
			match(TAB);
			setState(305);
			match(NEWLINE);
			setState(306);
			match(WORD);
			setState(307);
			match(TAB);
			setState(308);
			match(WORD);
			setState(309);
			match(TAB);
			setState(310);
			match(WORD);
			setState(311);
			match(TAB);
			setState(312);
			match(WORD);
			setState(313);
			match(TAB);
			setState(314);
			match(NEWLINE);
			setState(315);
			match(WORD);
			setState(316);
			match(TAB);
			setState(317);
			match(WORD);
			setState(318);
			match(TAB);
			setState(319);
			match(WORD);
			setState(320);
			match(TAB);
			setState(321);
			match(WORD);
			setState(322);
			match(TAB);
			setState(323);
			match(NEWLINE);
			setState(324);
			match(WORD);
			setState(325);
			match(TAB);
			setState(326);
			match(WORD);
			setState(327);
			match(TAB);
			setState(328);
			match(WORD);
			setState(329);
			match(TAB);
			setState(330);
			((KrxItemInfoEtfContext)_localctx).category = word();
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(331);
				((KrxItemInfoEtfContext)_localctx).category1 = word();
				}
				break;
			}
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(334);
				((KrxItemInfoEtfContext)_localctx).category2 = word();
				}
				break;
			}
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(337);
				((KrxItemInfoEtfContext)_localctx).category3 = word();
				}
				break;
			}
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(340);
				((KrxItemInfoEtfContext)_localctx).category4 = word();
				}
				break;
			}
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(343);
				((KrxItemInfoEtfContext)_localctx).category5 = word();
				}
				break;
			}
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(346);
				((KrxItemInfoEtfContext)_localctx).category6 = word();
				}
				break;
			}
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(349);
				((KrxItemInfoEtfContext)_localctx).category7 = word();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
			match(TAB);
			setState(356);
			match(NEWLINE);
			setState(357);
			match(WORD);
			setState(358);
			match(WORD);
			setState(359);
			match(TAB);
			setState(360);
			match(WORD);
			setState(361);
			match(WORD);
			setState(362);
			match(WORD);
			setState(363);
			match(TAB);
			setState(364);
			match(NEWLINE);
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
			match(WORD);
			setState(371);
			match(WORD);
			setState(372);
			match(WORD);
			setState(373);
			match(WORD);
			setState(374);
			match(WORD);
			setState(375);
			match(WORD);
			setState(376);
			match(WORD);
			setState(377);
			match(TAB);
			setState(378);
			match(NEWLINE);
			setState(379);
			match(WORD);
			setState(380);
			match(TAB);
			setState(381);
			match(WORD);
			setState(382);
			match(TAB);
			setState(383);
			match(DATE);
			setState(384);
			match(NEWLINE);
			setState(385);
			match(KEYWORD);
			setState(386);
			match(TAB);
			setState(387);
			match(WORD);
			setState(388);
			match(TAB);
			setState(389);
			match(WORD);
			setState(390);
			match(WORD);
			setState(391);
			match(WORD);
			setState(392);
			match(WORD);
			setState(393);
			match(WORD);
			setState(394);
			match(WORD);
			setState(395);
			match(TAB);
			setState(396);
			match(WORD);
			setState(397);
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
		enterRule(_localctx, 6, RULE_krxBasicInfoEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(KEYWORD);
			setState(401);
			match(TAB);
			setState(402);
			match(WORD);
			setState(403);
			match(TAB);
			setState(404);
			match(WORD);
			setState(405);
			match(WORD);
			setState(406);
			match(WORD);
			setState(407);
			match(WORD);
			setState(408);
			match(WORD);
			setState(409);
			match(WORD);
			setState(410);
			match(TAB);
			setState(411);
			match(WORD);
			setState(412);
			match(NEWLINE);
			setState(666); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(413);
				match(WORD);
				setState(414);
				match(TAB);
				setState(415);
				match(NEWLINE);
				setState(416);
				match(WORD);
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
				match(TAB);
				setState(424);
				match(TAB);
				setState(425);
				match(NEWLINE);
				setState(426);
				match(WORD);
				setState(427);
				match(TAB);
				setState(428);
				match(TAB);
				setState(429);
				match(TAB);
				setState(430);
				match(NEWLINE);
				setState(431);
				match(WORD);
				setState(432);
				match(TAB);
				setState(433);
				match(TAB);
				setState(434);
				match(TAB);
				setState(435);
				match(NEWLINE);
				setState(436);
				match(WORD);
				setState(437);
				match(TAB);
				setState(438);
				match(TAB);
				setState(439);
				match(TAB);
				setState(440);
				match(NEWLINE);
				setState(441);
				match(WORD);
				setState(442);
				match(TAB);
				setState(443);
				match(TAB);
				setState(444);
				match(TAB);
				setState(445);
				match(NEWLINE);
				setState(446);
				match(WORD);
				setState(447);
				match(TAB);
				setState(448);
				match(TAB);
				setState(449);
				match(TAB);
				setState(450);
				match(NEWLINE);
				setState(451);
				match(WORD);
				setState(452);
				match(TAB);
				setState(453);
				match(TAB);
				setState(454);
				match(TAB);
				setState(455);
				match(NEWLINE);
				setState(456);
				match(WORD);
				setState(457);
				match(TAB);
				setState(458);
				match(TAB);
				setState(459);
				match(TAB);
				setState(460);
				match(NEWLINE);
				setState(461);
				match(WORD);
				setState(462);
				match(TAB);
				setState(463);
				match(TAB);
				setState(464);
				match(TAB);
				setState(465);
				match(NEWLINE);
				setState(466);
				match(WORD);
				setState(467);
				match(TAB);
				setState(468);
				match(TAB);
				setState(469);
				match(TAB);
				setState(470);
				match(NEWLINE);
				setState(471);
				match(WORD);
				setState(472);
				match(TAB);
				setState(473);
				match(TAB);
				setState(474);
				match(TAB);
				setState(475);
				match(NEWLINE);
				setState(476);
				match(WORD);
				setState(477);
				match(TAB);
				setState(478);
				match(TAB);
				setState(479);
				match(TAB);
				setState(480);
				match(NEWLINE);
				setState(481);
				match(WORD);
				setState(482);
				match(TAB);
				setState(483);
				match(TAB);
				setState(484);
				match(TAB);
				setState(485);
				match(NEWLINE);
				setState(486);
				match(WORD);
				setState(487);
				match(TAB);
				setState(488);
				match(TAB);
				setState(489);
				match(TAB);
				setState(490);
				match(NEWLINE);
				setState(491);
				match(WORD);
				setState(492);
				match(TAB);
				setState(493);
				match(TAB);
				setState(494);
				match(TAB);
				setState(495);
				match(NEWLINE);
				setState(496);
				match(WORD);
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
				match(TAB);
				setState(504);
				match(TAB);
				setState(505);
				match(NEWLINE);
				setState(506);
				match(WORD);
				setState(507);
				match(TAB);
				setState(508);
				match(TAB);
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
				match(TAB);
				setState(515);
				match(TAB);
				setState(516);
				match(NEWLINE);
				setState(655); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						{
						setState(517);
						match(WORD);
						setState(518);
						match(TAB);
						setState(519);
						match(WORD);
						setState(520);
						match(NEWLINE);
						setState(521);
						match(WORD);
						setState(522);
						match(TAB);
						setState(523);
						((KrxBasicInfoEtfContext)_localctx).code = word();
						setState(524);
						match(NEWLINE);
						setState(525);
						match(WORD);
						setState(526);
						match(TAB);
						setState(527);
						match(NEWLINE);
						setState(528);
						match(WORD);
						setState(529);
						match(TAB);
						setState(530);
						match(TAB);
						setState(532); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(531);
							word();
							}
							}
							setState(534); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(536);
						match(NEWLINE);
						setState(537);
						match(WORD);
						setState(538);
						match(TAB);
						setState(539);
						match(TAB);
						setState(540);
						((KrxBasicInfoEtfContext)_localctx).symbol = word();
						setState(542);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
						case 1:
							{
							setState(541);
							((KrxBasicInfoEtfContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(545);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(544);
							((KrxBasicInfoEtfContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(548);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
						case 1:
							{
							setState(547);
							((KrxBasicInfoEtfContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(551);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
						case 1:
							{
							setState(550);
							((KrxBasicInfoEtfContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(554);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
						case 1:
							{
							setState(553);
							((KrxBasicInfoEtfContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(557);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
						case 1:
							{
							setState(556);
							((KrxBasicInfoEtfContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(562);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(559);
							((KrxBasicInfoEtfContext)_localctx).symbol7 = word();
							}
							}
							setState(564);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(565);
						match(NEWLINE);
						setState(566);
						match(WORD);
						setState(567);
						match(TAB);
						setState(568);
						match(NEWLINE);
						setState(569);
						match(WORD);
						setState(570);
						match(TAB);
						setState(572); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(571);
							word();
							}
							}
							setState(574); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(576);
						match(NEWLINE);
						setState(577);
						match(WORD);
						setState(578);
						match(TAB);
						setState(579);
						((KrxBasicInfoEtfContext)_localctx).ipo = match(DATE);
						setState(580);
						match(NEWLINE);
						setState(581);
						match(WORD);
						setState(582);
						match(TAB);
						setState(584); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(583);
							word();
							}
							}
							setState(586); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(588);
						match(NEWLINE);
						setState(589);
						match(WORD);
						setState(590);
						match(TAB);
						setState(592); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(591);
							word();
							}
							}
							setState(594); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(596);
						match(NEWLINE);
						setState(597);
						match(WORD);
						setState(598);
						match(TAB);
						setState(600); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(599);
							word();
							}
							}
							setState(602); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(604);
						match(NEWLINE);
						setState(605);
						match(WORD);
						setState(606);
						match(TAB);
						setState(607);
						match(WORD);
						setState(608);
						match(NEWLINE);
						setState(609);
						match(WORD);
						setState(610);
						match(TAB);
						setState(611);
						match(NEWLINE);
						setState(612);
						match(WORD);
						setState(613);
						match(TAB);
						setState(614);
						match(TAB);
						setState(615);
						match(WORD);
						setState(616);
						match(NEWLINE);
						setState(617);
						match(WORD);
						setState(618);
						match(TAB);
						setState(619);
						match(TAB);
						setState(620);
						match(WORD);
						setState(621);
						match(NEWLINE);
						setState(622);
						match(WORD);
						setState(623);
						match(TAB);
						setState(624);
						match(TAB);
						setState(625);
						match(NEWLINE);
						setState(626);
						match(WORD);
						setState(627);
						match(TAB);
						setState(628);
						((KrxBasicInfoEtfContext)_localctx).volumeOfListedShares = match(NUMBER);
						setState(629);
						match(NEWLINE);
						setState(630);
						match(WORD);
						setState(631);
						match(TAB);
						setState(633); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(632);
							word();
							}
							}
							setState(635); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(637);
						match(NEWLINE);
						setState(638);
						match(WORD);
						setState(639);
						match(TAB);
						setState(640);
						match(NUMBER);
						setState(641);
						match(NEWLINE);
						setState(642);
						match(WORD);
						setState(643);
						match(TAB);
						setState(644);
						((KrxBasicInfoEtfContext)_localctx).fee = match(NUMBER);
						setState(645);
						match(NEWLINE);
						setState(646);
						match(WORD);
						setState(647);
						match(TAB);
						setState(648);
						match(WORD);
						setState(649);
						match(NEWLINE);
						setState(650);
						match(WORD);
						setState(651);
						match(TAB);
						setState(652);
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
					setState(657); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(659);
				match(WORD);
				setState(660);
				match(TAB);
				setState(661);
				match(WORD);
				setState(662);
				match(TAB);
				setState(663);
				match(DATE);
				setState(664);
				match(NEWLINE);
				}
				}
				setState(668); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(670);
			match(KEYWORD);
			setState(671);
			match(TAB);
			setState(672);
			match(WORD);
			setState(673);
			match(TAB);
			setState(674);
			match(WORD);
			setState(675);
			match(WORD);
			setState(676);
			match(WORD);
			setState(677);
			match(WORD);
			setState(678);
			match(WORD);
			setState(679);
			match(WORD);
			setState(680);
			match(TAB);
			setState(681);
			match(WORD);
			setState(682);
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
		enterRule(_localctx, 8, RULE_krxBasicInfoCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(KEYWORD);
			setState(685);
			match(TAB);
			setState(686);
			match(WORD);
			setState(687);
			match(TAB);
			setState(688);
			match(WORD);
			setState(689);
			match(WORD);
			setState(690);
			match(WORD);
			setState(691);
			match(WORD);
			setState(692);
			match(WORD);
			setState(693);
			match(WORD);
			setState(694);
			match(TAB);
			setState(695);
			match(WORD);
			setState(696);
			match(NEWLINE);
			setState(1139); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(697);
					match(KEYWORD);
					setState(698);
					match(TAB);
					setState(699);
					match(NEWLINE);
					setState(700);
					match(KEYWORD);
					setState(701);
					match(TAB);
					setState(702);
					match(NEWLINE);
					setState(703);
					match(KEYWORD);
					setState(704);
					match(TAB);
					setState(705);
					match(NEWLINE);
					setState(706);
					match(KEYWORD);
					setState(707);
					match(TAB);
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
					setState(713);
					match(TAB);
					setState(714);
					match(TAB);
					setState(715);
					match(NEWLINE);
					setState(716);
					match(KEYWORD);
					setState(717);
					match(TAB);
					setState(718);
					match(TAB);
					setState(719);
					match(TAB);
					setState(720);
					match(NEWLINE);
					setState(721);
					match(KEYWORD);
					setState(722);
					match(TAB);
					setState(723);
					match(TAB);
					setState(724);
					match(TAB);
					setState(725);
					match(TAB);
					setState(726);
					match(TAB);
					setState(727);
					match(NEWLINE);
					setState(728);
					match(KEYWORD);
					setState(729);
					match(TAB);
					setState(730);
					match(TAB);
					setState(731);
					match(TAB);
					setState(732);
					match(TAB);
					setState(733);
					match(TAB);
					setState(734);
					match(NEWLINE);
					setState(735);
					match(KEYWORD);
					setState(736);
					match(TAB);
					setState(737);
					match(TAB);
					setState(738);
					match(TAB);
					setState(739);
					match(TAB);
					setState(740);
					match(NEWLINE);
					setState(741);
					match(KEYWORD);
					setState(742);
					match(TAB);
					setState(743);
					match(NEWLINE);
					setState(744);
					match(KEYWORD);
					setState(745);
					match(TAB);
					setState(746);
					match(TAB);
					setState(747);
					match(TAB);
					setState(748);
					match(TAB);
					setState(749);
					match(TAB);
					setState(750);
					match(NEWLINE);
					setState(751);
					match(KEYWORD);
					setState(752);
					match(TAB);
					setState(753);
					match(TAB);
					setState(754);
					match(TAB);
					setState(755);
					match(TAB);
					setState(756);
					match(NEWLINE);
					setState(757);
					match(KEYWORD);
					setState(758);
					match(TAB);
					setState(759);
					match(TAB);
					setState(760);
					match(TAB);
					setState(761);
					match(NEWLINE);
					setState(762);
					match(KEYWORD);
					setState(763);
					match(TAB);
					setState(764);
					match(TAB);
					setState(765);
					match(TAB);
					setState(766);
					match(NEWLINE);
					setState(767);
					match(KEYWORD);
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
					match(NEWLINE);
					setState(774);
					match(KEYWORD);
					setState(775);
					match(TAB);
					setState(776);
					match(TAB);
					setState(777);
					match(TAB);
					setState(778);
					match(TAB);
					setState(779);
					match(TAB);
					setState(780);
					match(NEWLINE);
					setState(781);
					match(KEYWORD);
					setState(782);
					match(TAB);
					setState(783);
					match(TAB);
					setState(784);
					match(NEWLINE);
					setState(785);
					match(KEYWORD);
					setState(786);
					match(TAB);
					setState(787);
					match(NEWLINE);
					setState(788);
					match(KEYWORD);
					setState(789);
					match(TAB);
					setState(790);
					match(TAB);
					setState(791);
					match(TAB);
					setState(792);
					match(TAB);
					setState(793);
					match(TAB);
					setState(794);
					match(NEWLINE);
					setState(795);
					match(KEYWORD);
					setState(796);
					match(TAB);
					setState(797);
					match(TAB);
					setState(798);
					match(TAB);
					setState(799);
					match(NEWLINE);
					setState(800);
					match(KEYWORD);
					setState(801);
					match(TAB);
					setState(802);
					match(TAB);
					setState(803);
					match(TAB);
					setState(804);
					match(TAB);
					setState(805);
					match(TAB);
					setState(806);
					match(NEWLINE);
					setState(807);
					match(KEYWORD);
					setState(808);
					match(TAB);
					setState(809);
					match(TAB);
					setState(810);
					match(TAB);
					setState(811);
					match(TAB);
					setState(812);
					match(TAB);
					setState(813);
					match(NEWLINE);
					setState(814);
					match(KEYWORD);
					setState(815);
					match(TAB);
					setState(816);
					match(TAB);
					setState(817);
					match(TAB);
					setState(818);
					match(TAB);
					setState(819);
					match(NEWLINE);
					setState(820);
					match(KEYWORD);
					setState(821);
					match(TAB);
					setState(822);
					match(NEWLINE);
					setState(823);
					match(KEYWORD);
					setState(824);
					match(TAB);
					setState(825);
					match(TAB);
					setState(826);
					match(TAB);
					setState(827);
					match(TAB);
					setState(828);
					match(TAB);
					setState(829);
					match(NEWLINE);
					setState(830);
					match(KEYWORD);
					setState(831);
					match(TAB);
					setState(832);
					match(TAB);
					setState(833);
					match(TAB);
					setState(834);
					match(NEWLINE);
					setState(835);
					match(KEYWORD);
					setState(836);
					match(TAB);
					setState(837);
					match(TAB);
					setState(838);
					match(TAB);
					setState(839);
					match(TAB);
					setState(840);
					match(TAB);
					setState(841);
					match(NEWLINE);
					setState(842);
					match(KEYWORD);
					setState(843);
					match(TAB);
					setState(844);
					match(TAB);
					setState(845);
					match(TAB);
					setState(846);
					match(TAB);
					setState(847);
					match(TAB);
					setState(848);
					match(NEWLINE);
					setState(849);
					match(KEYWORD);
					setState(850);
					match(TAB);
					setState(851);
					match(TAB);
					setState(852);
					match(TAB);
					setState(853);
					match(TAB);
					setState(854);
					match(NEWLINE);
					setState(855);
					match(KEYWORD);
					setState(856);
					match(TAB);
					setState(857);
					match(NEWLINE);
					setState(858);
					match(KEYWORD);
					setState(859);
					match(TAB);
					setState(860);
					match(TAB);
					setState(861);
					match(TAB);
					setState(862);
					match(TAB);
					setState(863);
					match(TAB);
					setState(864);
					match(NEWLINE);
					setState(865);
					match(KEYWORD);
					setState(866);
					match(TAB);
					setState(867);
					match(TAB);
					setState(868);
					match(TAB);
					setState(869);
					match(NEWLINE);
					setState(870);
					match(KEYWORD);
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
					match(NEWLINE);
					setState(877);
					match(KEYWORD);
					setState(878);
					match(TAB);
					setState(879);
					match(TAB);
					setState(880);
					match(TAB);
					setState(881);
					match(TAB);
					setState(882);
					match(TAB);
					setState(883);
					match(NEWLINE);
					setState(884);
					match(KEYWORD);
					setState(885);
					match(TAB);
					setState(886);
					match(TAB);
					setState(887);
					match(TAB);
					setState(888);
					match(TAB);
					setState(889);
					match(NEWLINE);
					setState(890);
					match(KEYWORD);
					setState(891);
					match(TAB);
					setState(892);
					match(NEWLINE);
					setState(893);
					match(KEYWORD);
					setState(894);
					match(TAB);
					setState(895);
					match(NEWLINE);
					setState(896);
					match(KEYWORD);
					setState(897);
					match(TAB);
					setState(898);
					match(TAB);
					setState(899);
					match(TAB);
					setState(900);
					match(TAB);
					setState(901);
					match(TAB);
					setState(902);
					match(NEWLINE);
					setState(903);
					match(KEYWORD);
					setState(904);
					match(TAB);
					setState(905);
					match(TAB);
					setState(906);
					match(TAB);
					setState(907);
					match(NEWLINE);
					setState(908);
					match(KEYWORD);
					setState(909);
					match(TAB);
					setState(910);
					match(TAB);
					setState(911);
					match(TAB);
					setState(912);
					match(TAB);
					setState(913);
					match(TAB);
					setState(914);
					match(NEWLINE);
					setState(915);
					match(KEYWORD);
					setState(916);
					match(TAB);
					setState(917);
					match(TAB);
					setState(918);
					match(TAB);
					setState(919);
					match(TAB);
					setState(920);
					match(TAB);
					setState(921);
					match(NEWLINE);
					setState(922);
					match(KEYWORD);
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
					setState(928);
					match(KEYWORD);
					setState(929);
					match(TAB);
					setState(930);
					match(NEWLINE);
					setState(931);
					match(KEYWORD);
					setState(932);
					match(TAB);
					setState(933);
					match(TAB);
					setState(934);
					match(TAB);
					setState(935);
					match(TAB);
					setState(936);
					match(TAB);
					setState(937);
					match(NEWLINE);
					setState(938);
					match(KEYWORD);
					setState(939);
					match(TAB);
					setState(940);
					match(TAB);
					setState(941);
					match(TAB);
					setState(942);
					match(NEWLINE);
					setState(943);
					match(KEYWORD);
					setState(944);
					match(TAB);
					setState(945);
					match(TAB);
					setState(946);
					match(TAB);
					setState(947);
					match(TAB);
					setState(948);
					match(TAB);
					setState(949);
					match(NEWLINE);
					setState(950);
					match(KEYWORD);
					setState(951);
					match(TAB);
					setState(952);
					match(TAB);
					setState(953);
					match(TAB);
					setState(954);
					match(TAB);
					setState(955);
					match(TAB);
					setState(956);
					match(NEWLINE);
					setState(957);
					match(KEYWORD);
					setState(958);
					match(TAB);
					setState(959);
					match(TAB);
					setState(960);
					match(TAB);
					setState(961);
					match(TAB);
					setState(962);
					match(NEWLINE);
					setState(963);
					match(KEYWORD);
					setState(964);
					match(TAB);
					setState(965);
					match(NEWLINE);
					setState(966);
					match(KEYWORD);
					setState(967);
					match(TAB);
					setState(968);
					match(TAB);
					setState(969);
					match(TAB);
					setState(970);
					match(TAB);
					setState(971);
					match(TAB);
					setState(972);
					match(NEWLINE);
					setState(973);
					match(KEYWORD);
					setState(974);
					match(TAB);
					setState(975);
					match(TAB);
					setState(976);
					match(TAB);
					setState(977);
					match(NEWLINE);
					setState(978);
					match(KEYWORD);
					setState(979);
					match(TAB);
					setState(980);
					match(TAB);
					setState(981);
					match(TAB);
					setState(982);
					match(TAB);
					setState(983);
					match(TAB);
					setState(984);
					match(NEWLINE);
					setState(985);
					match(KEYWORD);
					setState(986);
					match(TAB);
					setState(987);
					match(TAB);
					setState(988);
					match(TAB);
					setState(989);
					match(TAB);
					setState(990);
					match(TAB);
					setState(991);
					match(NEWLINE);
					setState(992);
					match(KEYWORD);
					setState(993);
					match(TAB);
					setState(994);
					match(TAB);
					setState(995);
					match(TAB);
					setState(996);
					match(TAB);
					setState(997);
					match(NEWLINE);
					setState(998);
					match(KEYWORD);
					setState(999);
					match(TAB);
					setState(1000);
					match(WORD);
					setState(1001);
					match(NEWLINE);
					setState(1002);
					match(KEYWORD);
					setState(1003);
					match(TAB);
					setState(1004);
					match(NEWLINE);
					setState(1128); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						{
						setState(1005);
						match(KEYWORD);
						setState(1006);
						match(TAB);
						setState(1007);
						match(WORD);
						setState(1008);
						match(NEWLINE);
						setState(1009);
						match(KEYWORD);
						setState(1010);
						match(TAB);
						setState(1011);
						((KrxBasicInfoCompanyContext)_localctx).code = word();
						setState(1012);
						match(NEWLINE);
						setState(1013);
						match(KEYWORD);
						setState(1014);
						match(TAB);
						setState(1015);
						match(NEWLINE);
						setState(1016);
						match(KEYWORD);
						setState(1017);
						match(TAB);
						setState(1018);
						match(TAB);
						setState(1019);
						match(NEWLINE);
						setState(1020);
						match(KEYWORD);
						setState(1021);
						match(TAB);
						setState(1022);
						match(TAB);
						setState(1023);
						match(TAB);
						setState(1025); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1024);
							word();
							}
							}
							setState(1027); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(1029);
						match(NEWLINE);
						setState(1030);
						match(KEYWORD);
						setState(1031);
						match(TAB);
						setState(1032);
						match(TAB);
						setState(1033);
						match(TAB);
						setState(1034);
						((KrxBasicInfoCompanyContext)_localctx).symbol = word();
						setState(1036);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
						case 1:
							{
							setState(1035);
							((KrxBasicInfoCompanyContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(1039);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
						case 1:
							{
							setState(1038);
							((KrxBasicInfoCompanyContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(1042);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
						case 1:
							{
							setState(1041);
							((KrxBasicInfoCompanyContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(1045);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
						case 1:
							{
							setState(1044);
							((KrxBasicInfoCompanyContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(1048);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
						case 1:
							{
							setState(1047);
							((KrxBasicInfoCompanyContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(1051);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
						case 1:
							{
							setState(1050);
							((KrxBasicInfoCompanyContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(1056);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(1053);
							((KrxBasicInfoCompanyContext)_localctx).symbol7 = word();
							}
							}
							setState(1058);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1059);
						match(NEWLINE);
						setState(1060);
						match(KEYWORD);
						setState(1061);
						match(TAB);
						setState(1062);
						match(TAB);
						setState(1063);
						match(TAB);
						setState(1065); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1064);
							word();
							}
							}
							setState(1067); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(1069);
						match(NEWLINE);
						setState(1070);
						match(KEYWORD);
						setState(1071);
						match(TAB);
						setState(1072);
						match(TAB);
						setState(1073);
						match(TAB);
						setState(1074);
						match(NEWLINE);
						setState(1075);
						match(KEYWORD);
						setState(1076);
						match(TAB);
						setState(1077);
						match(TAB);
						setState(1078);
						match(TAB);
						setState(1079);
						match(NEWLINE);
						setState(1080);
						match(KEYWORD);
						setState(1081);
						match(TAB);
						setState(1082);
						match(TAB);
						setState(1083);
						match(NEWLINE);
						setState(1084);
						match(KEYWORD);
						setState(1085);
						match(TAB);
						setState(1086);
						((KrxBasicInfoCompanyContext)_localctx).ipo = match(DATE);
						setState(1087);
						match(NEWLINE);
						setState(1088);
						match(KEYWORD);
						setState(1089);
						match(TAB);
						setState(1090);
						((KrxBasicInfoCompanyContext)_localctx).type = match(WORD);
						setState(1094);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(1091);
							word();
							}
							}
							setState(1096);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1097);
						match(NEWLINE);
						setState(1098);
						match(KEYWORD);
						setState(1099);
						match(TAB);
						setState(1100);
						match(WORD);
						setState(1101);
						match(NEWLINE);
						setState(1102);
						match(KEYWORD);
						setState(1103);
						match(TAB);
						setState(1107);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(1104);
							word();
							}
							}
							setState(1109);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1110);
						match(NEWLINE);
						setState(1111);
						match(KEYWORD);
						setState(1112);
						match(TAB);
						setState(1113);
						match(WORD);
						setState(1114);
						match(NEWLINE);
						setState(1115);
						match(KEYWORD);
						setState(1116);
						match(TAB);
						setState(1117);
						word();
						setState(1118);
						match(NEWLINE);
						setState(1119);
						match(KEYWORD);
						setState(1120);
						match(TAB);
						setState(1121);
						((KrxBasicInfoCompanyContext)_localctx).volumeOfListedShares = match(NUMBER);
						setState(1122);
						match(NEWLINE);
						setState(1123);
						match(KEYWORD);
						setState(1124);
						match(TAB);
						setState(1125);
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
						setState(1130); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==KEYWORD );
					setState(1132);
					match(WORD);
					setState(1133);
					match(TAB);
					setState(1134);
					match(WORD);
					setState(1135);
					match(TAB);
					setState(1136);
					match(DATE);
					setState(1137);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1141); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1143);
			match(KEYWORD);
			setState(1144);
			match(TAB);
			setState(1145);
			match(WORD);
			setState(1146);
			match(TAB);
			setState(1147);
			match(WORD);
			setState(1148);
			match(WORD);
			setState(1149);
			match(WORD);
			setState(1150);
			match(WORD);
			setState(1151);
			match(WORD);
			setState(1152);
			match(WORD);
			setState(1153);
			match(TAB);
			setState(1154);
			match(WORD);
			setState(1155);
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
		enterRule(_localctx, 10, RULE_etfAllPrice);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
			match(KEYWORD);
			setState(1158);
			match(TAB);
			setState(1159);
			match(WORD);
			setState(1160);
			match(TAB);
			setState(1161);
			match(WORD);
			setState(1162);
			match(WORD);
			setState(1163);
			match(WORD);
			setState(1164);
			match(WORD);
			setState(1165);
			match(TAB);
			setState(1166);
			match(WORD);
			setState(1167);
			match(NEWLINE);
			setState(1414); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1168);
				match(WORD);
				setState(1169);
				match(TAB);
				setState(1170);
				match(DATE);
				setState(1171);
				match(TAB);
				setState(1172);
				match(NEWLINE);
				setState(1173);
				match(WORD);
				setState(1174);
				match(TAB);
				setState(1175);
				match(DATE);
				setState(1176);
				match(TAB);
				setState(1177);
				match(NEWLINE);
				setState(1178);
				match(WORD);
				setState(1179);
				match(TAB);
				setState(1180);
				match(DATE);
				setState(1181);
				match(TAB);
				setState(1182);
				match(NEWLINE);
				setState(1183);
				match(WORD);
				setState(1184);
				match(TAB);
				setState(1185);
				match(DATE);
				setState(1186);
				match(TAB);
				setState(1187);
				match(NEWLINE);
				setState(1188);
				match(WORD);
				setState(1189);
				match(TAB);
				setState(1190);
				match(DATE);
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
				match(NEWLINE);
				setState(1198);
				match(WORD);
				setState(1199);
				match(TAB);
				setState(1200);
				match(DATE);
				setState(1201);
				match(TAB);
				setState(1202);
				match(NEWLINE);
				setState(1203);
				match(WORD);
				setState(1204);
				match(TAB);
				setState(1205);
				match(DATE);
				setState(1206);
				match(TAB);
				setState(1207);
				match(WORD);
				setState(1208);
				match(NEWLINE);
				setState(1209);
				match(WORD);
				setState(1210);
				match(TAB);
				setState(1211);
				match(DATE);
				setState(1212);
				match(TAB);
				setState(1213);
				match(NEWLINE);
				setState(1403); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(1403);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
						case 1:
							{
							{
							setState(1214);
							match(WORD);
							setState(1215);
							match(TAB);
							setState(1216);
							match(DATE);
							setState(1217);
							match(TAB);
							setState(1218);
							((EtfAllPriceContext)_localctx).code = match(NUMBER);
							setState(1219);
							match(NEWLINE);
							setState(1220);
							match(WORD);
							setState(1221);
							match(TAB);
							setState(1222);
							match(DATE);
							setState(1223);
							match(TAB);
							setState(1224);
							((EtfAllPriceContext)_localctx).symbol = word();
							setState(1226);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
							case 1:
								{
								setState(1225);
								((EtfAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(1229);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
							case 1:
								{
								setState(1228);
								((EtfAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(1232);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
							case 1:
								{
								setState(1231);
								((EtfAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(1235);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
							case 1:
								{
								setState(1234);
								((EtfAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(1238);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
							case 1:
								{
								setState(1237);
								((EtfAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(1241);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
							case 1:
								{
								setState(1240);
								((EtfAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(1246);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(1243);
								((EtfAllPriceContext)_localctx).symbol7 = word();
								}
								}
								setState(1248);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1249);
							match(NEWLINE);
							setState(1250);
							match(WORD);
							setState(1251);
							match(TAB);
							setState(1252);
							match(DATE);
							setState(1253);
							match(TAB);
							setState(1254);
							((EtfAllPriceContext)_localctx).closing = match(NUMBER);
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
							match(NUMBER);
							setState(1261);
							match(NEWLINE);
							setState(1262);
							match(WORD);
							setState(1263);
							match(TAB);
							setState(1264);
							match(DATE);
							setState(1265);
							match(TAB);
							setState(1266);
							match(NUMBER);
							setState(1267);
							match(NEWLINE);
							setState(1268);
							match(WORD);
							setState(1269);
							match(TAB);
							setState(1270);
							match(DATE);
							setState(1271);
							match(TAB);
							setState(1272);
							match(NUMBER);
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
							((EtfAllPriceContext)_localctx).market = match(NUMBER);
							setState(1279);
							match(NEWLINE);
							setState(1280);
							match(WORD);
							setState(1281);
							match(TAB);
							setState(1282);
							match(DATE);
							setState(1283);
							match(TAB);
							setState(1284);
							((EtfAllPriceContext)_localctx).high = match(NUMBER);
							setState(1285);
							match(NEWLINE);
							setState(1286);
							match(WORD);
							setState(1287);
							match(TAB);
							setState(1288);
							match(DATE);
							setState(1289);
							match(TAB);
							setState(1290);
							((EtfAllPriceContext)_localctx).low = match(NUMBER);
							setState(1291);
							match(NEWLINE);
							setState(1292);
							match(WORD);
							setState(1293);
							match(TAB);
							setState(1294);
							match(DATE);
							setState(1295);
							match(TAB);
							setState(1296);
							((EtfAllPriceContext)_localctx).volume = match(NUMBER);
							setState(1297);
							match(NEWLINE);
							setState(1298);
							match(WORD);
							setState(1299);
							match(TAB);
							setState(1300);
							match(DATE);
							setState(1301);
							match(TAB);
							setState(1302);
							match(NUMBER);
							setState(1303);
							match(NEWLINE);
							setState(1304);
							match(WORD);
							setState(1305);
							match(TAB);
							setState(1306);
							match(DATE);
							setState(1307);
							match(TAB);
							setState(1308);
							match(NUMBER);
							setState(1309);
							match(NEWLINE);
							setState(1310);
							match(WORD);
							setState(1311);
							match(TAB);
							setState(1312);
							match(DATE);
							setState(1313);
							match(TAB);
							setState(1314);
							match(NUMBER);
							setState(1315);
							match(NEWLINE);
							setState(1316);
							match(WORD);
							setState(1317);
							match(TAB);
							setState(1318);
							match(DATE);
							setState(1319);
							match(TAB);
							setState(1320);
							((EtfAllPriceContext)_localctx).volumeOfListedShares = match(NUMBER);
							setState(1321);
							match(NEWLINE);
							setState(1322);
							match(WORD);
							setState(1323);
							match(TAB);
							setState(1324);
							match(DATE);
							setState(1325);
							match(TAB);
							setState(1327); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(1326);
								word();
								}
								}
								setState(1329); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
							setState(1331);
							match(NEWLINE);
							setState(1332);
							match(WORD);
							setState(1333);
							match(TAB);
							setState(1334);
							match(DATE);
							setState(1335);
							match(TAB);
							setState(1336);
							word();
							setState(1337);
							match(NEWLINE);
							setState(1338);
							match(WORD);
							setState(1339);
							match(TAB);
							setState(1340);
							match(DATE);
							setState(1341);
							match(TAB);
							setState(1342);
							word();
							setState(1343);
							match(NEWLINE);
							setState(1344);
							match(WORD);
							setState(1345);
							match(TAB);
							setState(1346);
							match(DATE);
							setState(1347);
							match(TAB);
							setState(1348);
							word();
							setState(1349);
							match(NEWLINE);
							setState(1350);
							match(WORD);
							setState(1351);
							match(TAB);
							setState(1352);
							((EtfAllPriceContext)_localctx).base = match(DATE);
							setState(1353);
							match(TAB);
							setState(1354);
							match(NEWLINE);

											ParserService.crawlPriceCompanyEtf(20240105
												, (((EtfAllPriceContext)_localctx).code!=null?((EtfAllPriceContext)_localctx).code.getText():null), (((EtfAllPriceContext)_localctx).symbol!=null?_input.getText(((EtfAllPriceContext)_localctx).symbol.start,((EtfAllPriceContext)_localctx).symbol.stop):null)
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
							setState(1357);
							match(WORD);
							setState(1358);
							match(TAB);
							setState(1359);
							match(DATE);
							setState(1360);
							match(TAB);
							setState(1361);
							match(NUMBER);
							setState(1362);
							((EtfAllPriceContext)_localctx).symbol = word();
							setState(1364);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
							case 1:
								{
								setState(1363);
								((EtfAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(1367);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
							case 1:
								{
								setState(1366);
								((EtfAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(1370);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
							case 1:
								{
								setState(1369);
								((EtfAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(1373);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
							case 1:
								{
								setState(1372);
								((EtfAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(1376);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
							case 1:
								{
								setState(1375);
								((EtfAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(1379);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
							case 1:
								{
								setState(1378);
								((EtfAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(1384);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1381);
									((EtfAllPriceContext)_localctx).symbol7 = word();
									}
									} 
								}
								setState(1386);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
							}
							setState(1387);
							((EtfAllPriceContext)_localctx).closing = match(NUMBER);
							setState(1388);
							match(NEWLINE);
							setState(1389);
							match(WORD);
							setState(1390);
							match(TAB);
							setState(1391);
							((EtfAllPriceContext)_localctx).base = match(DATE);
							setState(1392);
							match(TAB);
							setState(1393);
							match(NUMBER);
							setState(1394);
							match(NUMBER);
							setState(1395);
							match(NUMBER);
							setState(1396);
							match(NUMBER);
							setState(1397);
							match(NUMBER);
							setState(1398);
							match(NUMBER);
							setState(1399);
							match(NUMBER);
							setState(1400);
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
					setState(1405); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1407);
				match(WORD);
				setState(1408);
				match(TAB);
				setState(1409);
				match(WORD);
				setState(1410);
				match(TAB);
				setState(1411);
				match(DATE);
				setState(1412);
				match(NEWLINE);
				}
				}
				setState(1416); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1418);
			match(KEYWORD);
			setState(1419);
			match(TAB);
			setState(1420);
			match(WORD);
			setState(1421);
			match(TAB);
			setState(1422);
			match(WORD);
			setState(1423);
			match(WORD);
			setState(1424);
			match(WORD);
			setState(1425);
			match(WORD);
			setState(1426);
			match(TAB);
			setState(1427);
			match(WORD);
			setState(1428);
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
		enterRule(_localctx, 12, RULE_companyAllPrice);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1430);
			match(KEYWORD);
			setState(1431);
			match(TAB);
			setState(1432);
			match(WORD);
			setState(1433);
			match(TAB);
			setState(1434);
			match(WORD);
			setState(1435);
			match(WORD);
			setState(1436);
			match(WORD);
			setState(1437);
			match(WORD);
			setState(1438);
			match(WORD);
			setState(1439);
			match(WORD);
			setState(1440);
			match(TAB);
			setState(1441);
			match(WORD);
			setState(1442);
			match(NEWLINE);
			setState(1925); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1443);
				match(WORD);
				setState(1444);
				match(TAB);
				setState(1445);
				match(DATE);
				setState(1446);
				match(TAB);
				setState(1447);
				match(NEWLINE);
				setState(1448);
				match(WORD);
				setState(1449);
				match(TAB);
				setState(1450);
				match(DATE);
				setState(1451);
				match(TAB);
				setState(1452);
				match(NEWLINE);
				setState(1453);
				match(WORD);
				setState(1454);
				match(TAB);
				setState(1455);
				match(DATE);
				setState(1456);
				match(TAB);
				setState(1457);
				match(NEWLINE);
				setState(1458);
				match(WORD);
				setState(1459);
				match(TAB);
				setState(1460);
				match(DATE);
				setState(1461);
				match(TAB);
				setState(1462);
				match(TAB);
				setState(1463);
				match(TAB);
				setState(1464);
				match(TAB);
				setState(1465);
				match(TAB);
				setState(1466);
				match(NEWLINE);
				setState(1467);
				match(WORD);
				setState(1468);
				match(TAB);
				setState(1469);
				match(DATE);
				setState(1470);
				match(TAB);
				setState(1471);
				match(TAB);
				setState(1472);
				match(TAB);
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
				match(TAB);
				setState(1479);
				match(TAB);
				setState(1480);
				match(TAB);
				setState(1481);
				match(TAB);
				setState(1482);
				match(NEWLINE);
				setState(1483);
				match(WORD);
				setState(1484);
				match(TAB);
				setState(1485);
				match(DATE);
				setState(1486);
				match(TAB);
				setState(1487);
				match(TAB);
				setState(1488);
				match(TAB);
				setState(1489);
				match(TAB);
				setState(1490);
				match(TAB);
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
				match(TAB);
				setState(1497);
				match(TAB);
				setState(1498);
				match(TAB);
				setState(1499);
				match(NEWLINE);
				setState(1500);
				match(WORD);
				setState(1501);
				match(TAB);
				setState(1502);
				match(DATE);
				setState(1503);
				match(TAB);
				setState(1504);
				match(NEWLINE);
				setState(1505);
				match(WORD);
				setState(1506);
				match(TAB);
				setState(1507);
				match(DATE);
				setState(1508);
				match(TAB);
				setState(1509);
				match(NEWLINE);
				setState(1510);
				match(WORD);
				setState(1511);
				match(TAB);
				setState(1512);
				match(DATE);
				setState(1513);
				match(TAB);
				setState(1514);
				match(TAB);
				setState(1515);
				match(TAB);
				setState(1516);
				match(TAB);
				setState(1517);
				match(TAB);
				setState(1518);
				match(NEWLINE);
				setState(1519);
				match(WORD);
				setState(1520);
				match(TAB);
				setState(1521);
				match(DATE);
				setState(1522);
				match(TAB);
				setState(1523);
				match(TAB);
				setState(1524);
				match(TAB);
				setState(1525);
				match(NEWLINE);
				setState(1526);
				match(WORD);
				setState(1527);
				match(TAB);
				setState(1528);
				match(DATE);
				setState(1529);
				match(TAB);
				setState(1530);
				match(TAB);
				setState(1531);
				match(TAB);
				setState(1532);
				match(TAB);
				setState(1533);
				match(TAB);
				setState(1534);
				match(NEWLINE);
				setState(1535);
				match(WORD);
				setState(1536);
				match(TAB);
				setState(1537);
				match(DATE);
				setState(1538);
				match(TAB);
				setState(1539);
				match(TAB);
				setState(1540);
				match(TAB);
				setState(1541);
				match(TAB);
				setState(1542);
				match(TAB);
				setState(1543);
				match(NEWLINE);
				setState(1544);
				match(WORD);
				setState(1545);
				match(TAB);
				setState(1546);
				match(DATE);
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
				setState(1552);
				match(WORD);
				setState(1553);
				match(TAB);
				setState(1554);
				match(DATE);
				setState(1555);
				match(TAB);
				setState(1556);
				match(NEWLINE);
				setState(1557);
				match(WORD);
				setState(1558);
				match(TAB);
				setState(1559);
				match(DATE);
				setState(1560);
				match(TAB);
				setState(1561);
				match(NEWLINE);
				setState(1562);
				match(WORD);
				setState(1563);
				match(TAB);
				setState(1564);
				match(DATE);
				setState(1565);
				match(TAB);
				setState(1566);
				match(NEWLINE);
				setState(1567);
				match(WORD);
				setState(1568);
				match(TAB);
				setState(1569);
				match(DATE);
				setState(1570);
				match(TAB);
				setState(1571);
				match(NEWLINE);
				setState(1572);
				match(WORD);
				setState(1573);
				match(TAB);
				setState(1574);
				match(DATE);
				setState(1575);
				match(TAB);
				setState(1576);
				match(TAB);
				setState(1577);
				match(TAB);
				setState(1578);
				match(TAB);
				setState(1579);
				match(TAB);
				setState(1580);
				match(NEWLINE);
				setState(1581);
				match(WORD);
				setState(1582);
				match(TAB);
				setState(1583);
				match(DATE);
				setState(1584);
				match(TAB);
				setState(1585);
				match(TAB);
				setState(1586);
				match(TAB);
				setState(1587);
				match(TAB);
				setState(1588);
				match(NEWLINE);
				setState(1589);
				match(WORD);
				setState(1590);
				match(TAB);
				setState(1591);
				match(DATE);
				setState(1592);
				match(TAB);
				setState(1593);
				match(TAB);
				setState(1594);
				match(TAB);
				setState(1595);
				match(TAB);
				setState(1596);
				match(TAB);
				setState(1597);
				match(NEWLINE);
				setState(1598);
				match(WORD);
				setState(1599);
				match(TAB);
				setState(1600);
				match(DATE);
				setState(1601);
				match(TAB);
				setState(1602);
				match(TAB);
				setState(1603);
				match(TAB);
				setState(1604);
				match(TAB);
				setState(1605);
				match(TAB);
				setState(1606);
				match(NEWLINE);
				setState(1607);
				match(WORD);
				setState(1608);
				match(TAB);
				setState(1609);
				match(DATE);
				setState(1610);
				match(TAB);
				setState(1611);
				match(TAB);
				setState(1612);
				match(TAB);
				setState(1613);
				match(TAB);
				setState(1614);
				match(NEWLINE);
				setState(1615);
				match(WORD);
				setState(1616);
				match(TAB);
				setState(1617);
				match(DATE);
				setState(1618);
				match(TAB);
				setState(1619);
				match(NEWLINE);
				setState(1620);
				match(WORD);
				setState(1621);
				match(TAB);
				setState(1622);
				match(DATE);
				setState(1623);
				match(TAB);
				setState(1624);
				match(NEWLINE);
				setState(1625);
				match(WORD);
				setState(1626);
				match(TAB);
				setState(1627);
				match(DATE);
				setState(1628);
				match(TAB);
				setState(1629);
				match(NEWLINE);
				setState(1630);
				match(WORD);
				setState(1631);
				match(TAB);
				setState(1632);
				match(DATE);
				setState(1633);
				match(TAB);
				setState(1634);
				match(NEWLINE);
				setState(1635);
				match(WORD);
				setState(1636);
				match(TAB);
				setState(1637);
				match(DATE);
				setState(1638);
				match(TAB);
				setState(1639);
				match(TAB);
				setState(1640);
				match(TAB);
				setState(1641);
				match(TAB);
				setState(1642);
				match(TAB);
				setState(1643);
				match(NEWLINE);
				setState(1644);
				match(WORD);
				setState(1645);
				match(TAB);
				setState(1646);
				match(DATE);
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
				match(DATE);
				setState(1654);
				match(TAB);
				setState(1655);
				match(TAB);
				setState(1656);
				match(TAB);
				setState(1657);
				match(TAB);
				setState(1658);
				match(TAB);
				setState(1659);
				match(NEWLINE);
				setState(1660);
				match(WORD);
				setState(1661);
				match(TAB);
				setState(1662);
				match(DATE);
				setState(1663);
				match(TAB);
				setState(1664);
				match(TAB);
				setState(1665);
				match(TAB);
				setState(1666);
				match(TAB);
				setState(1667);
				match(TAB);
				setState(1668);
				match(NEWLINE);
				setState(1669);
				match(WORD);
				setState(1670);
				match(TAB);
				setState(1671);
				match(DATE);
				setState(1672);
				match(TAB);
				setState(1673);
				match(TAB);
				setState(1674);
				match(TAB);
				setState(1675);
				match(TAB);
				setState(1676);
				match(NEWLINE);
				setState(1677);
				match(WORD);
				setState(1678);
				match(TAB);
				setState(1679);
				match(DATE);
				setState(1680);
				match(TAB);
				setState(1681);
				match(NEWLINE);
				setState(1682);
				match(WORD);
				setState(1683);
				match(TAB);
				setState(1684);
				match(DATE);
				setState(1685);
				match(TAB);
				setState(1686);
				match(NEWLINE);
				setState(1687);
				match(WORD);
				setState(1688);
				match(TAB);
				setState(1689);
				match(DATE);
				setState(1690);
				match(TAB);
				setState(1691);
				match(NEWLINE);
				setState(1692);
				match(WORD);
				setState(1693);
				match(TAB);
				setState(1694);
				match(DATE);
				setState(1695);
				match(TAB);
				setState(1696);
				match(TAB);
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
				match(DATE);
				setState(1704);
				match(TAB);
				setState(1705);
				match(TAB);
				setState(1706);
				match(TAB);
				setState(1707);
				match(NEWLINE);
				setState(1708);
				match(WORD);
				setState(1709);
				match(TAB);
				setState(1710);
				match(DATE);
				setState(1711);
				match(TAB);
				setState(1712);
				match(TAB);
				setState(1713);
				match(TAB);
				setState(1714);
				match(TAB);
				setState(1715);
				match(TAB);
				setState(1716);
				match(NEWLINE);
				setState(1717);
				match(WORD);
				setState(1718);
				match(TAB);
				setState(1719);
				match(DATE);
				setState(1720);
				match(TAB);
				setState(1721);
				match(TAB);
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
				match(DATE);
				setState(1729);
				match(TAB);
				setState(1730);
				match(TAB);
				setState(1731);
				match(TAB);
				setState(1732);
				match(TAB);
				setState(1733);
				match(NEWLINE);
				setState(1734);
				match(WORD);
				setState(1735);
				match(TAB);
				setState(1736);
				match(DATE);
				setState(1737);
				match(TAB);
				setState(1738);
				match(WORD);
				setState(1739);
				match(NEWLINE);
				setState(1740);
				match(WORD);
				setState(1741);
				match(TAB);
				setState(1742);
				match(DATE);
				setState(1743);
				match(TAB);
				setState(1744);
				match(NEWLINE);
				setState(1914); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(1914);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
						case 1:
							{
							{
							setState(1745);
							match(WORD);
							setState(1746);
							match(TAB);
							setState(1747);
							match(DATE);
							setState(1748);
							match(TAB);
							setState(1749);
							((CompanyAllPriceContext)_localctx).code = word();
							setState(1750);
							match(NEWLINE);
							setState(1751);
							match(WORD);
							setState(1752);
							match(TAB);
							setState(1753);
							match(DATE);
							setState(1754);
							match(TAB);
							setState(1755);
							((CompanyAllPriceContext)_localctx).symbol = word();
							setState(1757);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
							case 1:
								{
								setState(1756);
								((CompanyAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(1760);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
							case 1:
								{
								setState(1759);
								((CompanyAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(1763);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
							case 1:
								{
								setState(1762);
								((CompanyAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(1766);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
							case 1:
								{
								setState(1765);
								((CompanyAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(1769);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
							case 1:
								{
								setState(1768);
								((CompanyAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(1772);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
							case 1:
								{
								setState(1771);
								((CompanyAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(1777);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(1774);
								((CompanyAllPriceContext)_localctx).symbol7 = word();
								}
								}
								setState(1779);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1780);
							match(NEWLINE);
							setState(1781);
							match(WORD);
							setState(1782);
							match(TAB);
							setState(1783);
							match(DATE);
							setState(1784);
							match(TAB);
							setState(1785);
							((CompanyAllPriceContext)_localctx).type = word();
							setState(1789);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(1786);
								word();
								}
								}
								setState(1791);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1792);
							match(NEWLINE);
							setState(1793);
							match(WORD);
							setState(1794);
							match(TAB);
							setState(1795);
							match(DATE);
							setState(1796);
							match(TAB);
							setState(1798);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==WORD) {
								{
								setState(1797);
								match(WORD);
								}
							}

							setState(1800);
							match(NEWLINE);
							setState(1801);
							match(WORD);
							setState(1802);
							match(TAB);
							setState(1803);
							match(DATE);
							setState(1804);
							match(TAB);
							setState(1805);
							((CompanyAllPriceContext)_localctx).closing = match(NUMBER);
							setState(1806);
							match(NEWLINE);
							setState(1807);
							match(WORD);
							setState(1808);
							match(TAB);
							setState(1809);
							match(DATE);
							setState(1810);
							match(TAB);
							setState(1811);
							match(NUMBER);
							setState(1812);
							match(NEWLINE);
							setState(1813);
							match(WORD);
							setState(1814);
							match(TAB);
							setState(1815);
							match(DATE);
							setState(1816);
							match(TAB);
							setState(1817);
							match(NUMBER);
							setState(1818);
							match(NEWLINE);
							setState(1819);
							match(WORD);
							setState(1820);
							match(TAB);
							setState(1821);
							match(DATE);
							setState(1822);
							match(TAB);
							setState(1823);
							((CompanyAllPriceContext)_localctx).market = match(NUMBER);
							setState(1824);
							match(NEWLINE);
							setState(1825);
							match(WORD);
							setState(1826);
							match(TAB);
							setState(1827);
							match(DATE);
							setState(1828);
							match(TAB);
							setState(1829);
							((CompanyAllPriceContext)_localctx).high = match(NUMBER);
							setState(1830);
							match(NEWLINE);
							setState(1831);
							match(WORD);
							setState(1832);
							match(TAB);
							setState(1833);
							match(DATE);
							setState(1834);
							match(TAB);
							setState(1835);
							((CompanyAllPriceContext)_localctx).low = match(NUMBER);
							setState(1836);
							match(NEWLINE);
							setState(1837);
							match(WORD);
							setState(1838);
							match(TAB);
							setState(1839);
							match(DATE);
							setState(1840);
							match(TAB);
							setState(1841);
							((CompanyAllPriceContext)_localctx).volume = match(NUMBER);
							setState(1842);
							match(NEWLINE);
							setState(1843);
							match(WORD);
							setState(1844);
							match(TAB);
							setState(1845);
							match(DATE);
							setState(1846);
							match(TAB);
							setState(1847);
							match(NUMBER);
							setState(1848);
							match(NEWLINE);
							setState(1849);
							match(WORD);
							setState(1850);
							match(TAB);
							setState(1851);
							match(DATE);
							setState(1852);
							match(TAB);
							setState(1853);
							match(NUMBER);
							setState(1854);
							match(NEWLINE);
							setState(1855);
							match(WORD);
							setState(1856);
							match(TAB);
							setState(1857);
							match(DATE);
							setState(1858);
							match(TAB);
							setState(1859);
							((CompanyAllPriceContext)_localctx).volumeOfListedShares = match(NUMBER);
							setState(1860);
							match(NEWLINE);
							setState(1861);
							match(WORD);
							setState(1862);
							match(TAB);
							setState(1863);
							((CompanyAllPriceContext)_localctx).base = match(DATE);
							setState(1864);
							match(TAB);
							setState(1865);
							match(NEWLINE);

											ParserService.crawlPriceCompanyEtf(20240105
												, (((CompanyAllPriceContext)_localctx).code!=null?_input.getText(((CompanyAllPriceContext)_localctx).code.start,((CompanyAllPriceContext)_localctx).code.stop):null), (((CompanyAllPriceContext)_localctx).symbol!=null?_input.getText(((CompanyAllPriceContext)_localctx).symbol.start,((CompanyAllPriceContext)_localctx).symbol.stop):null)
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
							setState(1868);
							match(WORD);
							setState(1869);
							match(TAB);
							setState(1870);
							match(DATE);
							setState(1871);
							match(TAB);
							setState(1872);
							match(NUMBER);
							setState(1873);
							((CompanyAllPriceContext)_localctx).symbol = word();
							setState(1875);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
							case 1:
								{
								setState(1874);
								((CompanyAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(1878);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
							case 1:
								{
								setState(1877);
								((CompanyAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(1881);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
							case 1:
								{
								setState(1880);
								((CompanyAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(1884);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
							case 1:
								{
								setState(1883);
								((CompanyAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(1887);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
							case 1:
								{
								setState(1886);
								((CompanyAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(1890);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
							case 1:
								{
								setState(1889);
								((CompanyAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(1895);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1892);
									((CompanyAllPriceContext)_localctx).symbol7 = word();
									}
									} 
								}
								setState(1897);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
							}
							setState(1898);
							((CompanyAllPriceContext)_localctx).closing = match(NUMBER);
							setState(1899);
							match(NEWLINE);
							setState(1900);
							match(WORD);
							setState(1901);
							match(TAB);
							setState(1902);
							((CompanyAllPriceContext)_localctx).base = match(DATE);
							setState(1903);
							match(TAB);
							setState(1904);
							match(NUMBER);
							setState(1905);
							match(NUMBER);
							setState(1906);
							match(NUMBER);
							setState(1907);
							match(NUMBER);
							setState(1908);
							match(NUMBER);
							setState(1909);
							match(NUMBER);
							setState(1910);
							match(NUMBER);
							setState(1911);
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
					setState(1916); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1918);
				match(WORD);
				setState(1919);
				match(TAB);
				setState(1920);
				match(WORD);
				setState(1921);
				match(TAB);
				setState(1922);
				match(DATE);
				setState(1923);
				match(NEWLINE);
				}
				}
				setState(1927); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1929);
			match(KEYWORD);
			setState(1930);
			match(TAB);
			setState(1931);
			match(WORD);
			setState(1932);
			match(TAB);
			setState(1933);
			match(WORD);
			setState(1934);
			match(WORD);
			setState(1935);
			match(WORD);
			setState(1936);
			match(WORD);
			setState(1937);
			match(WORD);
			setState(1938);
			match(WORD);
			setState(1939);
			match(TAB);
			setState(1940);
			match(WORD);
			setState(1941);
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
		enterRule(_localctx, 14, RULE_crawlPriceKrx);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
			match(KEYWORD);
			setState(1944);
			match(TAB);
			setState(1945);
			match(WORD);
			setState(1946);
			match(TAB);
			setState(1947);
			match(WORD);
			setState(1948);
			match(TAB);
			setState(1949);
			match(WORD);
			setState(1950);
			match(NEWLINE);
			setState(2136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(2136);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					{
					setState(1951);
					match(NUMBER);
					setState(1952);
					match(TAB);
					setState(1953);
					match(WORD);
					setState(1954);
					match(WORD);
					setState(1955);
					match(TAB);
					setState(1956);
					match(NEWLINE);
					}
					}
					break;
				case WORD:
					{
					setState(2126); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(2124);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
							case 1:
								{
								{
								setState(1957);
								match(WORD);
								setState(1958);
								match(TAB);
								setState(1959);
								match(NUMBER);
								setState(1960);
								match(TAB);
								setState(1961);
								match(WORD);
								setState(1962);
								match(TAB);
								setState(1963);
								match(WORD);
								setState(1964);
								match(TAB);
								setState(1965);
								match(WORD);
								setState(1966);
								match(TAB);
								setState(1967);
								match(WORD);
								setState(1968);
								match(TAB);
								setState(1969);
								match(WORD);
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
								match(WORD);
								setState(1980);
								match(TAB);
								setState(1981);
								match(WORD);
								setState(1982);
								match(TAB);
								setState(1983);
								match(NEWLINE);
								setState(2012); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(1984);
										match(WORD);
										setState(1985);
										match(TAB);
										setState(1986);
										((CrawlPriceKrxContext)_localctx).code = match(NUMBER);
										setState(1987);
										match(TAB);
										setState(1988);
										((CrawlPriceKrxContext)_localctx).base = match(DATE);
										setState(1989);
										match(TAB);
										setState(1990);
										((CrawlPriceKrxContext)_localctx).closing = match(NUMBER);
										setState(1991);
										match(TAB);
										setState(1992);
										match(NUMBER);
										setState(1993);
										match(TAB);
										setState(1994);
										match(NUMBER);
										setState(1995);
										match(TAB);
										setState(1996);
										((CrawlPriceKrxContext)_localctx).market = match(NUMBER);
										setState(1997);
										match(TAB);
										setState(1998);
										((CrawlPriceKrxContext)_localctx).high = match(NUMBER);
										setState(1999);
										match(TAB);
										setState(2000);
										((CrawlPriceKrxContext)_localctx).low = match(NUMBER);
										setState(2001);
										match(TAB);
										setState(2002);
										((CrawlPriceKrxContext)_localctx).volume = match(NUMBER);
										setState(2003);
										match(TAB);
										setState(2004);
										match(NUMBER);
										setState(2005);
										match(TAB);
										setState(2006);
										match(NUMBER);
										setState(2007);
										match(TAB);
										setState(2008);
										match(NUMBER);
										setState(2009);
										match(TAB);
										setState(2010);
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
									setState(2014); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
								} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
								}
								}
								break;
							case 2:
								{
								{
								setState(2016);
								match(WORD);
								setState(2017);
								match(TAB);
								setState(2018);
								match(NUMBER);
								setState(2019);
								match(TAB);
								setState(2020);
								match(WORD);
								setState(2021);
								match(TAB);
								setState(2022);
								match(WORD);
								setState(2023);
								match(TAB);
								setState(2024);
								match(WORD);
								setState(2025);
								match(TAB);
								setState(2026);
								match(WORD);
								setState(2027);
								match(TAB);
								setState(2028);
								match(WORD);
								setState(2029);
								match(TAB);
								setState(2030);
								match(WORD);
								setState(2031);
								match(TAB);
								setState(2032);
								match(WORD);
								setState(2033);
								match(TAB);
								setState(2034);
								match(WORD);
								setState(2035);
								match(TAB);
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
								match(WORD);
								setState(2053);
								match(TAB);
								setState(2054);
								match(NEWLINE);
								setState(2120); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(2055);
										match(WORD);
										setState(2056);
										match(TAB);
										setState(2057);
										((CrawlPriceKrxContext)_localctx).code = match(NUMBER);
										setState(2058);
										match(TAB);
										setState(2059);
										((CrawlPriceKrxContext)_localctx).base = match(DATE);
										setState(2060);
										match(TAB);
										setState(2061);
										((CrawlPriceKrxContext)_localctx).closing = match(NUMBER);
										setState(2062);
										match(TAB);
										setState(2063);
										match(NUMBER);
										setState(2064);
										match(TAB);
										setState(2065);
										match(NUMBER);
										setState(2066);
										match(TAB);
										setState(2067);
										match(NUMBER);
										setState(2068);
										match(TAB);
										setState(2069);
										((CrawlPriceKrxContext)_localctx).market = match(NUMBER);
										setState(2070);
										match(TAB);
										setState(2071);
										((CrawlPriceKrxContext)_localctx).high = match(NUMBER);
										setState(2072);
										match(TAB);
										setState(2073);
										((CrawlPriceKrxContext)_localctx).low = match(NUMBER);
										setState(2074);
										match(TAB);
										setState(2075);
										((CrawlPriceKrxContext)_localctx).volume = match(NUMBER);
										setState(2076);
										match(TAB);
										setState(2077);
										match(NUMBER);
										setState(2078);
										match(TAB);
										setState(2079);
										match(NUMBER);
										setState(2080);
										match(TAB);
										setState(2081);
										match(NUMBER);
										setState(2082);
										match(TAB);
										setState(2083);
										match(NUMBER);
										setState(2084);
										match(TAB);
										setState(2085);
										((CrawlPriceKrxContext)_localctx).symbol = word();
										setState(2087);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
										case 1:
											{
											setState(2086);
											((CrawlPriceKrxContext)_localctx).symbol1 = word();
											}
											break;
										}
										setState(2090);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
										case 1:
											{
											setState(2089);
											((CrawlPriceKrxContext)_localctx).symbol2 = word();
											}
											break;
										}
										setState(2093);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
										case 1:
											{
											setState(2092);
											((CrawlPriceKrxContext)_localctx).symbol3 = word();
											}
											break;
										}
										setState(2096);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
										case 1:
											{
											setState(2095);
											((CrawlPriceKrxContext)_localctx).symbol4 = word();
											}
											break;
										}
										setState(2099);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
										case 1:
											{
											setState(2098);
											((CrawlPriceKrxContext)_localctx).symbol5 = word();
											}
											break;
										}
										setState(2102);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
										case 1:
											{
											setState(2101);
											((CrawlPriceKrxContext)_localctx).symbol6 = word();
											}
											break;
										}
										setState(2107);
										_errHandler.sync(this);
										_la = _input.LA(1);
										while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
											{
											{
											setState(2104);
											((CrawlPriceKrxContext)_localctx).symbol7 = word();
											}
											}
											setState(2109);
											_errHandler.sync(this);
											_la = _input.LA(1);
										}
										setState(2110);
										match(TAB);
										setState(2111);
										match(NUMBER);
										setState(2112);
										match(TAB);
										setState(2113);
										match(NUMBER);
										setState(2114);
										match(TAB);
										setState(2115);
										match(NUMBER);
										setState(2116);
										match(TAB);
										setState(2117);
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
									setState(2122); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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
						setState(2128); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(2130);
					match(WORD);
					setState(2131);
					match(TAB);
					setState(2132);
					match(WORD);
					setState(2133);
					match(TAB);
					setState(2134);
					match(DATE);
					setState(2135);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER || _la==WORD );
			setState(2140);
			match(KEYWORD);
			setState(2141);
			match(TAB);
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
		enterRule(_localctx, 16, RULE_crawlItemEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2149);
			match(KEYWORD);
			setState(2150);
			match(TAB);
			setState(2151);
			match(WORD);
			setState(2152);
			match(TAB);
			setState(2153);
			match(WORD);
			setState(2154);
			match(WORD);
			setState(2155);
			match(WORD);
			setState(2156);
			match(TAB);
			setState(2157);
			match(WORD);
			setState(2158);
			match(TAB);
			setState(2159);
			match(WORD);
			setState(2160);
			match(NEWLINE);
			setState(2289); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2161);
				match(WORD);
				setState(2162);
				match(TAB);
				setState(2163);
				match(NEWLINE);
				setState(2164);
				match(WORD);
				setState(2165);
				match(TAB);
				setState(2166);
				match(WORD);
				setState(2167);
				match(TAB);
				setState(2168);
				match(WORD);
				setState(2169);
				match(TAB);
				setState(2170);
				match(TAB);
				setState(2171);
				match(WORD);
				setState(2172);
				match(TAB);
				setState(2173);
				match(WORD);
				setState(2174);
				match(TAB);
				setState(2175);
				match(WORD);
				setState(2176);
				match(TAB);
				setState(2177);
				match(WORD);
				setState(2178);
				match(NEWLINE);
				setState(2179);
				match(WORD);
				setState(2180);
				match(TAB);
				setState(2181);
				match(TAB);
				setState(2182);
				match(TAB);
				setState(2183);
				match(WORD);
				setState(2184);
				match(TAB);
				setState(2185);
				match(TAB);
				setState(2186);
				match(TAB);
				setState(2187);
				match(TAB);
				setState(2188);
				match(TAB);
				setState(2189);
				match(TAB);
				setState(2190);
				match(WORD);
				setState(2191);
				match(TAB);
				setState(2192);
				match(WORD);
				setState(2193);
				match(TAB);
				setState(2194);
				match(NEWLINE);
				setState(2278); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2195);
						((CrawlItemEtfContext)_localctx).type = match(WORD);
						setState(2196);
						match(TAB);
						setState(2197);
						match(TAB);
						setState(2198);
						((CrawlItemEtfContext)_localctx).symbol = word();
						setState(2200);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
						case 1:
							{
							setState(2199);
							((CrawlItemEtfContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(2203);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
						case 1:
							{
							setState(2202);
							((CrawlItemEtfContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(2206);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
						case 1:
							{
							setState(2205);
							((CrawlItemEtfContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(2209);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
						case 1:
							{
							setState(2208);
							((CrawlItemEtfContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(2212);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
						case 1:
							{
							setState(2211);
							((CrawlItemEtfContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(2215);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
						case 1:
							{
							setState(2214);
							((CrawlItemEtfContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(2220);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(2217);
							((CrawlItemEtfContext)_localctx).symbol7 = word();
							}
							}
							setState(2222);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2223);
						match(TAB);
						setState(2224);
						((CrawlItemEtfContext)_localctx).code = match(NUMBER);
						setState(2225);
						match(TAB);
						setState(2226);
						((CrawlItemEtfContext)_localctx).category = word();
						setState(2228);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
						case 1:
							{
							setState(2227);
							((CrawlItemEtfContext)_localctx).category1 = word();
							}
							break;
						}
						setState(2231);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
						case 1:
							{
							setState(2230);
							((CrawlItemEtfContext)_localctx).category2 = word();
							}
							break;
						}
						setState(2234);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
						case 1:
							{
							setState(2233);
							((CrawlItemEtfContext)_localctx).category3 = word();
							}
							break;
						}
						setState(2237);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
						case 1:
							{
							setState(2236);
							((CrawlItemEtfContext)_localctx).category4 = word();
							}
							break;
						}
						setState(2240);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
						case 1:
							{
							setState(2239);
							((CrawlItemEtfContext)_localctx).category5 = word();
							}
							break;
						}
						setState(2243);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
						case 1:
							{
							setState(2242);
							((CrawlItemEtfContext)_localctx).category6 = word();
							}
							break;
						}
						setState(2248);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(2245);
							((CrawlItemEtfContext)_localctx).category7 = word();
							}
							}
							setState(2250);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2251);
						match(TAB);
						setState(2252);
						((CrawlItemEtfContext)_localctx).asset = match(NUMBER);
						setState(2253);
						match(TAB);
						setState(2254);
						((CrawlItemEtfContext)_localctx).closing = match(NUMBER);
						setState(2255);
						match(TAB);
						setState(2256);
						((CrawlItemEtfContext)_localctx).amount = match(NUMBER);
						setState(2257);
						match(TAB);
						setState(2258);
						match(TAB);
						setState(2259);
						match(TAB);
						setState(2261);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(2260);
							((CrawlItemEtfContext)_localctx).priceEarningsRatio = match(NUMBER);
							}
						}

						setState(2263);
						match(TAB);
						setState(2264);
						match(TAB);
						setState(2265);
						match(TAB);
						setState(2266);
						match(TAB);
						setState(2267);
						match(TAB);
						setState(2268);
						match(TAB);
						setState(2270);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(2269);
							((CrawlItemEtfContext)_localctx).fee = match(NUMBER);
							}
						}

						setState(2272);
						match(TAB);
						setState(2273);
						((CrawlItemEtfContext)_localctx).operator = match(WORD);
						setState(2274);
						match(TAB);
						setState(2275);
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
					setState(2280); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2282);
				match(WORD);
				setState(2283);
				match(TAB);
				setState(2284);
				match(WORD);
				setState(2285);
				match(TAB);
				setState(2286);
				match(DATE);
				setState(2287);
				match(NEWLINE);
				}
				}
				setState(2291); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(2293);
			match(KEYWORD);
			setState(2294);
			match(TAB);
			setState(2295);
			match(WORD);
			setState(2296);
			match(TAB);
			setState(2297);
			match(WORD);
			setState(2298);
			match(WORD);
			setState(2299);
			match(WORD);
			setState(2300);
			match(TAB);
			setState(2301);
			match(WORD);
			setState(2302);
			match(TAB);
			setState(2303);
			match(WORD);
			setState(2304);
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
		enterRule(_localctx, 18, RULE_crawlPriceEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2306);
			match(KEYWORD);
			setState(2307);
			match(TAB);
			setState(2308);
			match(WORD);
			setState(2309);
			match(WORD);
			setState(2310);
			match(TAB);
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
			match(NEWLINE);
			setState(2458); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2317);
				((CrawlPriceEtfContext)_localctx).code = match(NUMBER);
				setState(2318);
				match(TAB);
				setState(2320); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2319);
					word();
					}
					}
					setState(2322); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(2324);
				match(NEWLINE);
				{
				setState(2325);
				match(KEYWORD);
				setState(2326);
				match(TAB);
				setState(2327);
				((CrawlPriceEtfContext)_localctx).symbol = word();
				setState(2329);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(2328);
					((CrawlPriceEtfContext)_localctx).symbol1 = word();
					}
					break;
				}
				setState(2332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(2331);
					((CrawlPriceEtfContext)_localctx).symbol2 = word();
					}
					break;
				}
				setState(2335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(2334);
					((CrawlPriceEtfContext)_localctx).symbol3 = word();
					}
					break;
				}
				setState(2338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(2337);
					((CrawlPriceEtfContext)_localctx).symbol4 = word();
					}
					break;
				}
				setState(2341);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(2340);
					((CrawlPriceEtfContext)_localctx).symbol5 = word();
					}
					break;
				}
				setState(2344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(2343);
					((CrawlPriceEtfContext)_localctx).symbol6 = word();
					}
					break;
				}
				setState(2349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
					{
					{
					setState(2346);
					((CrawlPriceEtfContext)_localctx).symbol7 = word();
					}
					}
					setState(2351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2352);
				match(NEWLINE);
				setState(2353);
				match(KEYWORD);
				setState(2354);
				match(TAB);
				setState(2355);
				((CrawlPriceEtfContext)_localctx).category = word();
				setState(2357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(2356);
					((CrawlPriceEtfContext)_localctx).category1 = word();
					}
					break;
				}
				setState(2360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(2359);
					((CrawlPriceEtfContext)_localctx).category2 = word();
					}
					break;
				}
				setState(2363);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(2362);
					((CrawlPriceEtfContext)_localctx).category3 = word();
					}
					break;
				}
				setState(2366);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(2365);
					((CrawlPriceEtfContext)_localctx).category4 = word();
					}
					break;
				}
				setState(2369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(2368);
					((CrawlPriceEtfContext)_localctx).category5 = word();
					}
					break;
				}
				setState(2372);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(2371);
					((CrawlPriceEtfContext)_localctx).category6 = word();
					}
					break;
				}
				setState(2377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
					{
					{
					setState(2374);
					((CrawlPriceEtfContext)_localctx).category7 = word();
					}
					}
					setState(2379);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2380);
				match(NEWLINE);
				setState(2381);
				match(KEYWORD);
				setState(2382);
				match(TAB);
				setState(2383);
				((CrawlPriceEtfContext)_localctx).ea = match(NUMBER);
				setState(2384);
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
				setState(2447); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2387);
						match(WORD);
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
						match(TAB);
						setState(2395);
						match(WORD);
						setState(2396);
						match(TAB);
						setState(2397);
						match(WORD);
						setState(2398);
						match(TAB);
						setState(2399);
						match(WORD);
						setState(2400);
						match(TAB);
						setState(2401);
						match(WORD);
						setState(2402);
						match(TAB);
						setState(2403);
						match(NEWLINE);
						setState(2443); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(2443);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
							case 1:
								{
								{
								setState(2404);
								match(TAB);
								setState(2405);
								match(TAB);
								setState(2406);
								match(TAB);
								setState(2407);
								match(TAB);
								setState(2408);
								match(TAB);
								setState(2409);
								match(TAB);
								setState(2410);
								match(TAB);
								setState(2411);
								match(TAB);
								setState(2412);
								match(NEWLINE);
								}
								}
								break;
							case 2:
								{
								{
								setState(2414);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(2413);
									((CrawlPriceEtfContext)_localctx).base = match(DATE);
									}
								}

								setState(2416);
								match(TAB);
								setState(2418);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(2417);
									((CrawlPriceEtfContext)_localctx).closing = match(NUMBER);
									}
								}

								setState(2420);
								match(TAB);
								setState(2422);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(2421);
									match(NUMBER);
									}
								}

								setState(2424);
								match(TAB);
								setState(2426);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(2425);
									((CrawlPriceEtfContext)_localctx).market = match(NUMBER);
									}
								}

								setState(2428);
								match(TAB);
								setState(2430);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(2429);
									((CrawlPriceEtfContext)_localctx).high = match(NUMBER);
									}
								}

								setState(2432);
								match(TAB);
								setState(2433);
								((CrawlPriceEtfContext)_localctx).low = match(NUMBER);
								setState(2434);
								match(TAB);
								setState(2435);
								((CrawlPriceEtfContext)_localctx).volume = match(NUMBER);
								setState(2436);
								match(TAB);
								setState(2438);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(2437);
									match(NUMBER);
									}
								}

								setState(2440);
								match(TAB);
								setState(2441);
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
							setState(2445); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2449); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2451);
				match(WORD);
				setState(2452);
				match(TAB);
				setState(2453);
				match(WORD);
				setState(2454);
				match(TAB);
				setState(2455);
				match(DATE);
				setState(2456);
				match(NEWLINE);
				}
				}
				setState(2460); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(2462);
			match(KEYWORD);
			setState(2463);
			match(TAB);
			setState(2464);
			match(WORD);
			setState(2465);
			match(WORD);
			setState(2466);
			match(TAB);
			setState(2467);
			match(WORD);
			setState(2468);
			match(TAB);
			setState(2469);
			match(WORD);
			setState(2470);
			match(TAB);
			setState(2471);
			match(WORD);
			setState(2472);
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
		enterRule(_localctx, 20, RULE_crawlPriceCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2474);
			match(KEYWORD);
			setState(2475);
			match(TAB);
			setState(2476);
			match(WORD);
			setState(2477);
			match(WORD);
			setState(2478);
			match(TAB);
			setState(2479);
			match(WORD);
			setState(2480);
			match(TAB);
			setState(2481);
			match(WORD);
			setState(2482);
			match(TAB);
			setState(2483);
			match(WORD);
			setState(2484);
			match(NEWLINE);
			setState(2547); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2485);
				((CrawlPriceCompanyContext)_localctx).code = match(NUMBER);
				setState(2486);
				match(TAB);
				setState(2488); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2487);
					((CrawlPriceCompanyContext)_localctx).symbol = word();
					}
					}
					setState(2490); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(2492);
				match(NEWLINE);
				setState(2536); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2493);
						match(WORD);
						setState(2494);
						match(TAB);
						setState(2495);
						match(WORD);
						setState(2496);
						match(TAB);
						setState(2497);
						match(WORD);
						setState(2498);
						match(TAB);
						setState(2499);
						match(WORD);
						setState(2500);
						match(TAB);
						setState(2501);
						match(WORD);
						setState(2502);
						match(TAB);
						setState(2503);
						match(WORD);
						setState(2504);
						match(TAB);
						setState(2505);
						match(WORD);
						setState(2506);
						match(TAB);
						setState(2507);
						match(NEWLINE);
						setState(2532); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(2532);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case TAB:
								{
								{
								setState(2508);
								match(TAB);
								setState(2509);
								match(TAB);
								setState(2510);
								match(TAB);
								setState(2511);
								match(TAB);
								setState(2512);
								match(TAB);
								setState(2513);
								match(TAB);
								setState(2514);
								match(TAB);
								setState(2515);
								match(NEWLINE);
								}
								}
								break;
							case DATE:
								{
								{
								setState(2516);
								((CrawlPriceCompanyContext)_localctx).base = match(DATE);
								setState(2517);
								match(TAB);
								setState(2518);
								((CrawlPriceCompanyContext)_localctx).closing = match(NUMBER);
								setState(2519);
								match(TAB);
								setState(2520);
								match(NUMBER);
								setState(2521);
								match(TAB);
								setState(2522);
								((CrawlPriceCompanyContext)_localctx).market = match(NUMBER);
								setState(2523);
								match(TAB);
								setState(2524);
								((CrawlPriceCompanyContext)_localctx).high = match(NUMBER);
								setState(2525);
								match(TAB);
								setState(2526);
								((CrawlPriceCompanyContext)_localctx).low = match(NUMBER);
								setState(2527);
								match(TAB);
								setState(2528);
								((CrawlPriceCompanyContext)_localctx).volume = match(NUMBER);
								setState(2529);
								match(TAB);
								setState(2530);
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
							setState(2534); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2538); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2540);
				match(WORD);
				setState(2541);
				match(TAB);
				setState(2542);
				match(WORD);
				setState(2543);
				match(TAB);
				setState(2544);
				match(DATE);
				setState(2545);
				match(NEWLINE);
				}
				}
				setState(2549); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(2551);
			match(KEYWORD);
			setState(2552);
			match(TAB);
			setState(2553);
			match(WORD);
			setState(2554);
			match(WORD);
			setState(2555);
			match(TAB);
			setState(2556);
			match(WORD);
			setState(2557);
			match(TAB);
			setState(2558);
			match(WORD);
			setState(2559);
			match(TAB);
			setState(2560);
			match(WORD);
			setState(2561);
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
		enterRule(_localctx, 22, RULE_crawlItemDetailCompanyThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2563);
			match(KEYWORD);
			setState(2564);
			match(TAB);
			setState(2565);
			match(WORD);
			setState(2566);
			match(WORD);
			setState(2567);
			match(TAB);
			setState(2568);
			match(WORD);
			setState(2569);
			match(TAB);
			setState(2570);
			match(WORD);
			setState(2571);
			match(TAB);
			setState(2572);
			match(WORD);
			setState(2573);
			match(NEWLINE);
			setState(2631); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2574);
					match(KEYWORD);
					setState(2575);
					match(TAB);
					setState(2576);
					((CrawlItemDetailCompanyThreadContext)_localctx).code = match(NUMBER);
					setState(2577);
					match(TAB);
					setState(2578);
					((CrawlItemDetailCompanyThreadContext)_localctx).type = match(WORD);
					setState(2579);
					match(TAB);
					setState(2580);
					((CrawlItemDetailCompanyThreadContext)_localctx).symbol = word();
					setState(2582);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
					case 1:
						{
						setState(2581);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(2585);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
					case 1:
						{
						setState(2584);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(2588);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
					case 1:
						{
						setState(2587);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(2591);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
					case 1:
						{
						setState(2590);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(2594);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
					case 1:
						{
						setState(2593);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(2597);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
					case 1:
						{
						setState(2596);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(2602);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(2599);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(2604);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2605);
					match(NEWLINE);
					setState(2606);
					match(KEYWORD);
					setState(2607);
					match(TAB);
					setState(2608);
					((CrawlItemDetailCompanyThreadContext)_localctx).category = match(STRING);
					setState(2609);
					match(NEWLINE);
					setState(2610);
					match(KEYWORD);
					setState(2611);
					match(TAB);
					setState(2612);
					((CrawlItemDetailCompanyThreadContext)_localctx).fics = match(STRING);
					setState(2613);
					match(NEWLINE);
					setState(2614);
					match(KEYWORD);
					setState(2615);
					match(TAB);
					setState(2616);
					((CrawlItemDetailCompanyThreadContext)_localctx).ea = match(NUMBER);
					setState(2617);
					match(WORD);
					setState(2618);
					match(NEWLINE);
					setState(2619);
					match(KEYWORD);
					setState(2620);
					match(TAB);
					setState(2621);
					((CrawlItemDetailCompanyThreadContext)_localctx).ipo = match(DATE);
					setState(2622);
					match(NEWLINE);
					setState(2623);
					match(WORD);
					setState(2624);
					match(TAB);
					setState(2625);
					match(WORD);
					setState(2626);
					match(TAB);
					setState(2627);
					match(DATE);
					setState(2628);
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
				setState(2633); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(2635);
			match(KEYWORD);
			setState(2636);
			match(TAB);
			setState(2637);
			match(WORD);
			setState(2638);
			match(WORD);
			setState(2639);
			match(TAB);
			setState(2640);
			match(WORD);
			setState(2641);
			match(TAB);
			setState(2642);
			match(WORD);
			setState(2643);
			match(TAB);
			setState(2644);
			match(WORD);
			setState(2645);
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
		enterRule(_localctx, 24, RULE_crawlItemDividendTopCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2647);
			match(KEYWORD);
			setState(2648);
			match(TAB);
			setState(2649);
			match(WORD);
			setState(2650);
			match(TAB);
			setState(2651);
			match(WORD);
			setState(2652);
			match(WORD);
			setState(2653);
			match(WORD);
			setState(2654);
			match(TAB);
			setState(2655);
			match(WORD);
			setState(2656);
			match(TAB);
			setState(2657);
			match(WORD);
			setState(2658);
			match(NEWLINE);
			setState(2727); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2659);
				match(WORD);
				setState(2660);
				match(TAB);
				setState(2661);
				match(NEWLINE);
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
				setState(2716); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2685);
						((CrawlItemDividendTopCompanyContext)_localctx).type = match(WORD);
						setState(2686);
						match(TAB);
						setState(2687);
						match(NUMBER);
						setState(2688);
						match(TAB);
						setState(2690);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(2689);
							((CrawlItemDividendTopCompanyContext)_localctx).code = match(NUMBER);
							}
						}

						setState(2692);
						match(TAB);
						setState(2694); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(2693);
							word();
							}
							}
							setState(2696); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(2698);
						match(TAB);
						setState(2699);
						match(WORD);
						setState(2700);
						match(TAB);
						setState(2701);
						match(WORD);
						setState(2702);
						match(TAB);
						setState(2703);
						match(NUMBER);
						setState(2704);
						match(TAB);
						setState(2705);
						match(NUMBER);
						setState(2706);
						match(TAB);
						setState(2707);
						match(NUMBER);
						setState(2708);
						match(TAB);
						setState(2709);
						match(NUMBER);
						setState(2710);
						match(TAB);
						setState(2711);
						match(NUMBER);
						setState(2712);
						match(TAB);
						setState(2713);
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
					setState(2718); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2720);
				match(WORD);
				setState(2721);
				match(TAB);
				setState(2722);
				match(WORD);
				setState(2723);
				match(TAB);
				setState(2724);
				match(DATE);
				setState(2725);
				match(NEWLINE);
				}
				}
				setState(2729); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(2731);
			match(KEYWORD);
			setState(2732);
			match(TAB);
			setState(2733);
			match(WORD);
			setState(2734);
			match(TAB);
			setState(2735);
			match(WORD);
			setState(2736);
			match(WORD);
			setState(2737);
			match(WORD);
			setState(2738);
			match(TAB);
			setState(2739);
			match(WORD);
			setState(2740);
			match(TAB);
			setState(2741);
			match(WORD);
			setState(2742);
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
		enterRule(_localctx, 26, RULE_crawlEtfDetailThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2744);
			match(KEYWORD);
			setState(2745);
			match(TAB);
			setState(2746);
			match(WORD);
			setState(2747);
			match(WORD);
			setState(2748);
			match(TAB);
			setState(2749);
			match(WORD);
			setState(2750);
			match(TAB);
			setState(2751);
			match(WORD);
			setState(2752);
			match(NEWLINE);
			setState(2834); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2753);
					match(KEYWORD);
					setState(2754);
					match(TAB);
					setState(2755);
					((CrawlEtfDetailThreadContext)_localctx).code = match(NUMBER);
					setState(2756);
					match(TAB);
					setState(2760);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(2757);
						word();
						}
						}
						setState(2762);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2763);
					match(NEWLINE);
					setState(2764);
					((CrawlEtfDetailThreadContext)_localctx).symbol = word();
					setState(2766);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
					case 1:
						{
						setState(2765);
						((CrawlEtfDetailThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(2769);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
					case 1:
						{
						setState(2768);
						((CrawlEtfDetailThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(2772);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
					case 1:
						{
						setState(2771);
						((CrawlEtfDetailThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(2775);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
					case 1:
						{
						setState(2774);
						((CrawlEtfDetailThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(2778);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
					case 1:
						{
						setState(2777);
						((CrawlEtfDetailThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(2781);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
					case 1:
						{
						setState(2780);
						((CrawlEtfDetailThreadContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(2786);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(2783);
						((CrawlEtfDetailThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(2788);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2789);
					match(NEWLINE);
					setState(2790);
					((CrawlEtfDetailThreadContext)_localctx).category = word();
					setState(2792);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
					case 1:
						{
						setState(2791);
						((CrawlEtfDetailThreadContext)_localctx).category1 = word();
						}
						break;
					}
					setState(2795);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
					case 1:
						{
						setState(2794);
						((CrawlEtfDetailThreadContext)_localctx).category2 = word();
						}
						break;
					}
					setState(2798);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
					case 1:
						{
						setState(2797);
						((CrawlEtfDetailThreadContext)_localctx).category3 = word();
						}
						break;
					}
					setState(2801);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
					case 1:
						{
						setState(2800);
						((CrawlEtfDetailThreadContext)_localctx).category4 = word();
						}
						break;
					}
					setState(2804);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
					case 1:
						{
						setState(2803);
						((CrawlEtfDetailThreadContext)_localctx).category5 = word();
						}
						break;
					}
					setState(2807);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
					case 1:
						{
						setState(2806);
						((CrawlEtfDetailThreadContext)_localctx).category6 = word();
						}
						break;
					}
					setState(2812);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(2809);
						((CrawlEtfDetailThreadContext)_localctx).category7 = word();
						}
						}
						setState(2814);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2815);
					match(NEWLINE);
					setState(2816);
					((CrawlEtfDetailThreadContext)_localctx).ipo = match(DATE);
					setState(2820);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WORD) {
						{
						{
						setState(2817);
						match(WORD);
						}
						}
						setState(2822);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2823);
					match(NEWLINE);
					setState(2824);
					((CrawlEtfDetailThreadContext)_localctx).fee = word();
					setState(2825);
					match(NEWLINE);
					setState(2826);
					match(WORD);
					setState(2827);
					match(TAB);
					setState(2828);
					match(WORD);
					setState(2829);
					match(TAB);
					setState(2830);
					match(DATE);
					setState(2831);
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
				setState(2836); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(2838);
			match(KEYWORD);
			setState(2839);
			match(TAB);
			setState(2840);
			match(WORD);
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
		enterRule(_localctx, 28, RULE_crawlDividendHistoryEtfThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2848);
			match(KEYWORD);
			setState(2849);
			match(TAB);
			setState(2850);
			match(WORD);
			setState(2851);
			match(WORD);
			setState(2852);
			match(WORD);
			setState(2853);
			match(TAB);
			setState(2854);
			match(WORD);
			setState(2855);
			match(WORD);
			setState(2856);
			match(WORD);
			setState(2857);
			match(TAB);
			setState(2858);
			match(WORD);
			setState(2859);
			match(TAB);
			setState(2860);
			match(WORD);
			setState(2861);
			match(NEWLINE);
			setState(2966); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2862);
				match(WORD);
				setState(2863);
				match(TAB);
				setState(2865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORD) {
					{
					setState(2864);
					match(WORD);
					}
				}

				setState(2867);
				match(TAB);
				setState(2868);
				match(WORD);
				setState(2869);
				match(TAB);
				setState(2870);
				match(WORD);
				setState(2871);
				match(TAB);
				setState(2872);
				match(WORD);
				setState(2873);
				match(TAB);
				setState(2874);
				match(WORD);
				setState(2875);
				match(TAB);
				setState(2876);
				match(WORD);
				setState(2877);
				match(TAB);
				setState(2878);
				match(WORD);
				setState(2879);
				match(TAB);
				setState(2880);
				match(WORD);
				setState(2881);
				match(TAB);
				setState(2882);
				match(WORD);
				setState(2883);
				match(TAB);
				setState(2884);
				match(NEWLINE);
				setState(2956); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(2956);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case TAB:
							{
							{
							setState(2885);
							match(TAB);
							setState(2886);
							match(TAB);
							setState(2887);
							match(TAB);
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
							match(TAB);
							setState(2894);
							match(TAB);
							setState(2895);
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
							setState(2896);
							((CrawlDividendHistoryEtfThreadContext)_localctx).symbol = word();
							setState(2898);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
							case 1:
								{
								setState(2897);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(2901);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
							case 1:
								{
								setState(2900);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(2904);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
							case 1:
								{
								setState(2903);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(2907);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
							case 1:
								{
								setState(2906);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(2910);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
							case 1:
								{
								setState(2909);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(2913);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
							case 1:
								{
								setState(2912);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(2918);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(2915);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol7 = word();
								}
								}
								setState(2920);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(2921);
							match(TAB);
							setState(2922);
							((CrawlDividendHistoryEtfThreadContext)_localctx).code = match(WORD);
							setState(2923);
							match(TAB);
							setState(2924);
							match(WORD);
							setState(2925);
							match(TAB);
							setState(2929);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(2926);
								word();
								}
								}
								setState(2931);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(2932);
							match(TAB);
							setState(2934);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==DATE) {
								{
								setState(2933);
								((CrawlDividendHistoryEtfThreadContext)_localctx).base = match(DATE);
								}
							}

							setState(2936);
							match(TAB);
							setState(2937);
							((CrawlDividendHistoryEtfThreadContext)_localctx).pay = match(DATE);
							setState(2938);
							match(TAB);
							setState(2940);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==WORD) {
								{
								setState(2939);
								match(WORD);
								}
							}

							setState(2942);
							match(TAB);
							setState(2943);
							((CrawlDividendHistoryEtfThreadContext)_localctx).dividend = match(NUMBER);
							setState(2944);
							match(TAB);
							setState(2946);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NUMBER) {
								{
								setState(2945);
								((CrawlDividendHistoryEtfThreadContext)_localctx).price = match(NUMBER);
								}
							}

							setState(2948);
							match(TAB);
							setState(2950);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NUMBER) {
								{
								setState(2949);
								((CrawlDividendHistoryEtfThreadContext)_localctx).ratio = match(NUMBER);
								}
							}

							setState(2952);
							match(TAB);
							setState(2953);
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
					setState(2958); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2960);
				match(WORD);
				setState(2961);
				match(TAB);
				setState(2962);
				match(WORD);
				setState(2963);
				match(TAB);
				setState(2964);
				match(DATE);
				setState(2965);
				match(NEWLINE);
				}
				}
				setState(2968); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(2970);
			match(KEYWORD);
			setState(2971);
			match(TAB);
			setState(2972);
			match(WORD);
			setState(2973);
			match(WORD);
			setState(2974);
			match(WORD);
			setState(2975);
			match(TAB);
			setState(2976);
			match(WORD);
			setState(2977);
			match(WORD);
			setState(2978);
			match(WORD);
			setState(2979);
			match(TAB);
			setState(2980);
			match(WORD);
			setState(2981);
			match(TAB);
			setState(2982);
			match(WORD);
			setState(2983);
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
		enterRule(_localctx, 30, RULE_crawlDividendHistoryCompanyThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2985);
			match(KEYWORD);
			setState(2986);
			match(TAB);
			setState(2987);
			match(WORD);
			setState(2988);
			match(TAB);
			setState(2989);
			match(WORD);
			setState(2990);
			match(WORD);
			setState(2991);
			match(WORD);
			setState(2992);
			match(TAB);
			setState(2993);
			match(WORD);
			setState(2994);
			match(TAB);
			setState(2995);
			match(WORD);
			setState(2996);
			match(NEWLINE);
			setState(3123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3113); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2997);
						match(WORD);
						setState(2998);
						match(TAB);
						setState(2999);
						match(WORD);
						setState(3000);
						match(NEWLINE);
						setState(3001);
						match(WORD);
						setState(3002);
						match(TAB);
						setState(3003);
						match(WORD);
						setState(3004);
						match(NEWLINE);
						setState(3005);
						match(WORD);
						setState(3006);
						match(TAB);
						setState(3007);
						match(WORD);
						setState(3008);
						match(TAB);
						setState(3009);
						match(WORD);
						setState(3010);
						match(TAB);
						setState(3011);
						match(WORD);
						setState(3012);
						match(TAB);
						setState(3013);
						match(WORD);
						setState(3014);
						match(TAB);
						setState(3015);
						match(WORD);
						setState(3016);
						match(TAB);
						setState(3017);
						match(WORD);
						setState(3018);
						match(TAB);
						setState(3019);
						match(WORD);
						setState(3020);
						match(TAB);
						setState(3021);
						match(WORD);
						setState(3022);
						match(TAB);
						setState(3023);
						match(WORD);
						setState(3024);
						match(TAB);
						setState(3025);
						match(WORD);
						setState(3026);
						match(TAB);
						setState(3027);
						match(WORD);
						setState(3028);
						match(TAB);
						setState(3029);
						match(NEWLINE);
						setState(3030);
						match(WORD);
						setState(3031);
						match(TAB);
						setState(3032);
						match(WORD);
						setState(3033);
						match(TAB);
						setState(3034);
						match(WORD);
						setState(3035);
						match(TAB);
						setState(3036);
						match(WORD);
						setState(3037);
						match(TAB);
						setState(3038);
						match(WORD);
						setState(3039);
						match(TAB);
						setState(3040);
						match(WORD);
						setState(3041);
						match(TAB);
						setState(3042);
						match(NEWLINE);
						setState(3109); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(3109);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case TAB:
								{
								{
								setState(3043);
								match(TAB);
								setState(3044);
								match(TAB);
								setState(3045);
								match(TAB);
								setState(3046);
								match(TAB);
								setState(3047);
								match(TAB);
								setState(3048);
								match(TAB);
								setState(3049);
								match(TAB);
								setState(3050);
								match(TAB);
								setState(3051);
								match(TAB);
								setState(3052);
								match(TAB);
								setState(3053);
								match(TAB);
								setState(3054);
								match(TAB);
								setState(3055);
								match(TAB);
								setState(3056);
								match(TAB);
								setState(3057);
								match(TAB);
								setState(3058);
								match(TAB);
								setState(3059);
								match(TAB);
								setState(3060);
								match(NEWLINE);
								}
								}
								break;
							case DATE:
								{
								{
								setState(3061);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).base = match(DATE);
								setState(3062);
								match(TAB);
								setState(3064);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(3063);
									((CrawlDividendHistoryCompanyThreadContext)_localctx).pay = match(DATE);
									}
								}

								setState(3066);
								match(TAB);
								setState(3068);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(3067);
									match(DATE);
									}
								}

								setState(3070);
								match(TAB);
								setState(3071);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).code = match(NUMBER);
								setState(3072);
								match(TAB);
								setState(3074); 
								_errHandler.sync(this);
								_la = _input.LA(1);
								do {
									{
									{
									setState(3073);
									((CrawlDividendHistoryCompanyThreadContext)_localctx).symbol = word();
									}
									}
									setState(3076); 
									_errHandler.sync(this);
									_la = _input.LA(1);
								} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
								setState(3078);
								match(TAB);
								setState(3079);
								match(WORD);
								setState(3080);
								match(TAB);
								setState(3081);
								match(WORD);
								setState(3082);
								match(TAB);
								setState(3083);
								match(WORD);
								setState(3084);
								match(TAB);
								setState(3085);
								match(WORD);
								setState(3086);
								match(TAB);
								setState(3087);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).dividend = match(NUMBER);
								setState(3088);
								match(TAB);
								setState(3090);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(3089);
									match(NUMBER);
									}
								}

								setState(3092);
								match(TAB);
								setState(3093);
								match(NUMBER);
								setState(3094);
								match(TAB);
								setState(3095);
								match(NUMBER);
								setState(3096);
								match(TAB);
								setState(3098);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(3097);
									match(NUMBER);
									}
								}

								setState(3100);
								match(TAB);
								setState(3101);
								match(TAB);
								setState(3102);
								match(NUMBER);
								setState(3103);
								match(TAB);
								setState(3104);
								match(NUMBER);
								setState(3105);
								match(TAB);
								setState(3106);
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
							setState(3111); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3115); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(3117);
				match(WORD);
				setState(3118);
				match(TAB);
				setState(3119);
				match(WORD);
				setState(3120);
				match(TAB);
				setState(3121);
				match(DATE);
				setState(3122);
				match(NEWLINE);
				}
				}
				setState(3125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(3127);
			match(KEYWORD);
			setState(3128);
			match(TAB);
			setState(3129);
			match(WORD);
			setState(3130);
			match(TAB);
			setState(3131);
			match(WORD);
			setState(3132);
			match(WORD);
			setState(3133);
			match(WORD);
			setState(3134);
			match(TAB);
			setState(3135);
			match(WORD);
			setState(3136);
			match(TAB);
			setState(3137);
			match(WORD);
			setState(3138);
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
		enterRule(_localctx, 32, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3140);
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
		enterRule(_localctx, 34, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(3144);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(3142);
					word();
					}
					break;
				case TAB:
					{
					setState(3143);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(3146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(3148);
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
		enterRule(_localctx, 36, RULE_eof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(3153);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(3150);
					word();
					}
					break;
				case TAB:
					{
					setState(3151);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(3152);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(3155); 
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
		"\u0004\u0001\n\u0c56\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0003\u0001K\b\u0001\u0001\u0001\u0003\u0001N\b\u0001\u0001\u0001\u0003"+
		"\u0001Q\b\u0001\u0001\u0001\u0003\u0001T\b\u0001\u0001\u0001\u0003\u0001"+
		"W\b\u0001\u0001\u0001\u0003\u0001Z\b\u0001\u0001\u0001\u0005\u0001]\b"+
		"\u0001\n\u0001\f\u0001`\t\u0001\u0001\u0001\u0001\u0001\u0004\u0001d\b"+
		"\u0001\u000b\u0001\f\u0001e\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0094"+
		"\b\u0001\u0001\u0001\u0003\u0001\u0097\b\u0001\u0001\u0001\u0003\u0001"+
		"\u009a\b\u0001\u0001\u0001\u0003\u0001\u009d\b\u0001\u0001\u0001\u0003"+
		"\u0001\u00a0\b\u0001\u0001\u0001\u0003\u0001\u00a3\b\u0001\u0001\u0001"+
		"\u0005\u0001\u00a6\b\u0001\n\u0001\f\u0001\u00a9\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u00ea\b\u0002\u0001\u0002\u0003\u0002\u00ed"+
		"\b\u0002\u0001\u0002\u0003\u0002\u00f0\b\u0002\u0001\u0002\u0003\u0002"+
		"\u00f3\b\u0002\u0001\u0002\u0003\u0002\u00f6\b\u0002\u0001\u0002\u0003"+
		"\u0002\u00f9\b\u0002\u0001\u0002\u0005\u0002\u00fc\b\u0002\n\u0002\f\u0002"+
		"\u00ff\t\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u0103\b\u0002\u000b"+
		"\u0002\f\u0002\u0104\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u014d\b\u0002\u0001\u0002\u0003\u0002\u0150\b\u0002\u0001\u0002"+
		"\u0003\u0002\u0153\b\u0002\u0001\u0002\u0003\u0002\u0156\b\u0002\u0001"+
		"\u0002\u0003\u0002\u0159\b\u0002\u0001\u0002\u0003\u0002\u015c\b\u0002"+
		"\u0001\u0002\u0005\u0002\u015f\b\u0002\n\u0002\f\u0002\u0162\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
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
		"\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u0215\b\u0003\u000b\u0003\f"+
		"\u0003\u0216\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u021f\b\u0003\u0001\u0003\u0003\u0003\u0222\b"+
		"\u0003\u0001\u0003\u0003\u0003\u0225\b\u0003\u0001\u0003\u0003\u0003\u0228"+
		"\b\u0003\u0001\u0003\u0003\u0003\u022b\b\u0003\u0001\u0003\u0003\u0003"+
		"\u022e\b\u0003\u0001\u0003\u0005\u0003\u0231\b\u0003\n\u0003\f\u0003\u0234"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0004\u0003\u023d\b\u0003\u000b\u0003\f\u0003\u023e"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0004\u0003\u0249\b\u0003\u000b\u0003\f\u0003"+
		"\u024a\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u0251"+
		"\b\u0003\u000b\u0003\f\u0003\u0252\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0004\u0003\u0259\b\u0003\u000b\u0003\f\u0003\u025a\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u027a"+
		"\b\u0003\u000b\u0003\f\u0003\u027b\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u0290\b\u0003\u000b\u0003"+
		"\f\u0003\u0291\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0004\u0003\u029b\b\u0003\u000b\u0003\f\u0003"+
		"\u029c\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004\u0402\b\u0004\u000b\u0004\f\u0004\u0403"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u040d\b\u0004\u0001\u0004\u0003\u0004\u0410\b"+
		"\u0004\u0001\u0004\u0003\u0004\u0413\b\u0004\u0001\u0004\u0003\u0004\u0416"+
		"\b\u0004\u0001\u0004\u0003\u0004\u0419\b\u0004\u0001\u0004\u0003\u0004"+
		"\u041c\b\u0004\u0001\u0004\u0005\u0004\u041f\b\u0004\n\u0004\f\u0004\u0422"+
		"\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0004\u0004\u042a\b\u0004\u000b\u0004\f\u0004\u042b\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0445\b\u0004"+
		"\n\u0004\f\u0004\u0448\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0452"+
		"\b\u0004\n\u0004\f\u0004\u0455\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u0469\b\u0004\u000b\u0004"+
		"\f\u0004\u046a\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004\u0474\b\u0004\u000b\u0004\f\u0004"+
		"\u0475\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
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
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u04cb\b\u0005\u0001\u0005\u0003\u0005\u04ce\b\u0005\u0001\u0005"+
		"\u0003\u0005\u04d1\b\u0005\u0001\u0005\u0003\u0005\u04d4\b\u0005\u0001"+
		"\u0005\u0003\u0005\u04d7\b\u0005\u0001\u0005\u0003\u0005\u04da\b\u0005"+
		"\u0001\u0005\u0005\u0005\u04dd\b\u0005\n\u0005\f\u0005\u04e0\t\u0005\u0001"+
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
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004"+
		"\u0005\u0530\b\u0005\u000b\u0005\f\u0005\u0531\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u0555\b\u0005\u0001\u0005\u0003\u0005\u0558\b"+
		"\u0005\u0001\u0005\u0003\u0005\u055b\b\u0005\u0001\u0005\u0003\u0005\u055e"+
		"\b\u0005\u0001\u0005\u0003\u0005\u0561\b\u0005\u0001\u0005\u0003\u0005"+
		"\u0564\b\u0005\u0001\u0005\u0005\u0005\u0567\b\u0005\n\u0005\f\u0005\u056a"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u057c"+
		"\b\u0005\u000b\u0005\f\u0005\u057d\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u0587\b\u0005"+
		"\u000b\u0005\f\u0005\u0588\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u06de\b\u0006\u0001\u0006\u0003\u0006\u06e1\b\u0006\u0001\u0006\u0003"+
		"\u0006\u06e4\b\u0006\u0001\u0006\u0003\u0006\u06e7\b\u0006\u0001\u0006"+
		"\u0003\u0006\u06ea\b\u0006\u0001\u0006\u0003\u0006\u06ed\b\u0006\u0001"+
		"\u0006\u0005\u0006\u06f0\b\u0006\n\u0006\f\u0006\u06f3\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u06fc\b\u0006\n\u0006\f\u0006\u06ff\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0707"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
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
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0754\b\u0006\u0001"+
		"\u0006\u0003\u0006\u0757\b\u0006\u0001\u0006\u0003\u0006\u075a\b\u0006"+
		"\u0001\u0006\u0003\u0006\u075d\b\u0006\u0001\u0006\u0003\u0006\u0760\b"+
		"\u0006\u0001\u0006\u0003\u0006\u0763\b\u0006\u0001\u0006\u0005\u0006\u0766"+
		"\b\u0006\n\u0006\f\u0006\u0769\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0004\u0006\u077b\b\u0006\u000b\u0006\f\u0006\u077c\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0004\u0006\u0786\b\u0006\u000b\u0006\f\u0006\u0787\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
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
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u07dd\b\u0007"+
		"\u000b\u0007\f\u0007\u07de\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
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
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0828\b\u0007\u0001\u0007\u0003\u0007\u082b\b"+
		"\u0007\u0001\u0007\u0003\u0007\u082e\b\u0007\u0001\u0007\u0003\u0007\u0831"+
		"\b\u0007\u0001\u0007\u0003\u0007\u0834\b\u0007\u0001\u0007\u0003\u0007"+
		"\u0837\b\u0007\u0001\u0007\u0005\u0007\u083a\b\u0007\n\u0007\f\u0007\u083d"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u0849"+
		"\b\u0007\u000b\u0007\f\u0007\u084a\u0003\u0007\u084d\b\u0007\u0004\u0007"+
		"\u084f\b\u0007\u000b\u0007\f\u0007\u0850\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u0859\b\u0007\u000b"+
		"\u0007\f\u0007\u085a\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0899\b\b\u0001\b\u0003\b\u089c"+
		"\b\b\u0001\b\u0003\b\u089f\b\b\u0001\b\u0003\b\u08a2\b\b\u0001\b\u0003"+
		"\b\u08a5\b\b\u0001\b\u0003\b\u08a8\b\b\u0001\b\u0005\b\u08ab\b\b\n\b\f"+
		"\b\u08ae\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u08b5\b\b"+
		"\u0001\b\u0003\b\u08b8\b\b\u0001\b\u0003\b\u08bb\b\b\u0001\b\u0003\b\u08be"+
		"\b\b\u0001\b\u0003\b\u08c1\b\b\u0001\b\u0003\b\u08c4\b\b\u0001\b\u0005"+
		"\b\u08c7\b\b\n\b\f\b\u08ca\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u08d6\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u08df\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u08e7\b\b\u000b\b\f\b\u08e8"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u08f2"+
		"\b\b\u000b\b\f\b\u08f3\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0004\t\u0911\b\t\u000b\t\f\t\u0912\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u091a\b\t\u0001\t\u0003\t\u091d"+
		"\b\t\u0001\t\u0003\t\u0920\b\t\u0001\t\u0003\t\u0923\b\t\u0001\t\u0003"+
		"\t\u0926\b\t\u0001\t\u0003\t\u0929\b\t\u0001\t\u0005\t\u092c\b\t\n\t\f"+
		"\t\u092f\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0936\b\t"+
		"\u0001\t\u0003\t\u0939\b\t\u0001\t\u0003\t\u093c\b\t\u0001\t\u0003\t\u093f"+
		"\b\t\u0001\t\u0003\t\u0942\b\t\u0001\t\u0003\t\u0945\b\t\u0001\t\u0005"+
		"\t\u0948\b\t\n\t\f\t\u094b\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u096f\b\t\u0001\t\u0001\t\u0003\t\u0973\b\t"+
		"\u0001\t\u0001\t\u0003\t\u0977\b\t\u0001\t\u0001\t\u0003\t\u097b\b\t\u0001"+
		"\t\u0001\t\u0003\t\u097f\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u0987\b\t\u0001\t\u0001\t\u0001\t\u0004\t\u098c\b\t\u000b\t"+
		"\f\t\u098d\u0004\t\u0990\b\t\u000b\t\f\t\u0991\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u099b\b\t\u000b\t\f\t\u099c\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u09b9"+
		"\b\n\u000b\n\f\n\u09ba\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u09e5"+
		"\b\n\u000b\n\f\n\u09e6\u0004\n\u09e9\b\n\u000b\n\f\n\u09ea\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u09f4\b\n\u000b\n\f"+
		"\n\u09f5\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0a17\b\u000b"+
		"\u0001\u000b\u0003\u000b\u0a1a\b\u000b\u0001\u000b\u0003\u000b\u0a1d\b"+
		"\u000b\u0001\u000b\u0003\u000b\u0a20\b\u000b\u0001\u000b\u0003\u000b\u0a23"+
		"\b\u000b\u0001\u000b\u0003\u000b\u0a26\b\u000b\u0001\u000b\u0005\u000b"+
		"\u0a29\b\u000b\n\u000b\f\u000b\u0a2c\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004"+
		"\u000b\u0a48\b\u000b\u000b\u000b\f\u000b\u0a49\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0a83\b\f\u0001\f\u0001\f\u0004"+
		"\f\u0a87\b\f\u000b\f\f\f\u0a88\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u0a9d\b\f\u000b\f\f\f\u0a9e"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u0aa8"+
		"\b\f\u000b\f\f\f\u0aa9\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u0ac7\b\r\n\r\f\r\u0aca\t\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u0acf\b\r\u0001\r\u0003\r\u0ad2\b\r\u0001\r\u0003"+
		"\r\u0ad5\b\r\u0001\r\u0003\r\u0ad8\b\r\u0001\r\u0003\r\u0adb\b\r\u0001"+
		"\r\u0003\r\u0ade\b\r\u0001\r\u0005\r\u0ae1\b\r\n\r\f\r\u0ae4\t\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u0ae9\b\r\u0001\r\u0003\r\u0aec\b\r\u0001\r"+
		"\u0003\r\u0aef\b\r\u0001\r\u0003\r\u0af2\b\r\u0001\r\u0003\r\u0af5\b\r"+
		"\u0001\r\u0003\r\u0af8\b\r\u0001\r\u0005\r\u0afb\b\r\n\r\f\r\u0afe\t\r"+
		"\u0001\r\u0001\r\u0001\r\u0005\r\u0b03\b\r\n\r\f\r\u0b06\t\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0004\r\u0b13\b\r\u000b\r\f\r\u0b14\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0b32\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u0b53\b\u000e\u0001\u000e\u0003\u000e\u0b56\b\u000e\u0001"+
		"\u000e\u0003\u000e\u0b59\b\u000e\u0001\u000e\u0003\u000e\u0b5c\b\u000e"+
		"\u0001\u000e\u0003\u000e\u0b5f\b\u000e\u0001\u000e\u0003\u000e\u0b62\b"+
		"\u000e\u0001\u000e\u0005\u000e\u0b65\b\u000e\n\u000e\f\u000e\u0b68\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u0b70\b\u000e\n\u000e\f\u000e\u0b73\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0b77\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0b7d\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0b83\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0b87"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u0b8d"+
		"\b\u000e\u000b\u000e\f\u000e\u0b8e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u0b97\b\u000e\u000b\u000e"+
		"\f\u000e\u0b98\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
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
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0bf9\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0bfd\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u0c03\b\u000f\u000b"+
		"\u000f\f\u000f\u0c04\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0c13\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0c1b\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u0c26\b\u000f\u000b\u000f\f"+
		"\u000f\u0c27\u0004\u000f\u0c2a\b\u000f\u000b\u000f\f\u000f\u0c2b\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004"+
		"\u000f\u0c34\b\u000f\u000b\u000f\f\u000f\u0c35\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0004\u0011\u0c49\b\u0011\u000b\u0011"+
		"\f\u0011\u0c4a\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0004\u0012\u0c52\b\u0012\u000b\u0012\f\u0012\u0c53\u0001\u0012\u0000"+
		"\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$\u0000\u0001\u0001\u0000\u0005\n\u0d27\u0000"+
		"5\u0001\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000\u0004\u00d6\u0001"+
		"\u0000\u0000\u0000\u0006\u0190\u0001\u0000\u0000\u0000\b\u02ac\u0001\u0000"+
		"\u0000\u0000\n\u0485\u0001\u0000\u0000\u0000\f\u0596\u0001\u0000\u0000"+
		"\u0000\u000e\u0797\u0001\u0000\u0000\u0000\u0010\u0865\u0001\u0000\u0000"+
		"\u0000\u0012\u0902\u0001\u0000\u0000\u0000\u0014\u09aa\u0001\u0000\u0000"+
		"\u0000\u0016\u0a03\u0001\u0000\u0000\u0000\u0018\u0a57\u0001\u0000\u0000"+
		"\u0000\u001a\u0ab8\u0001\u0000\u0000\u0000\u001c\u0b20\u0001\u0000\u0000"+
		"\u0000\u001e\u0ba9\u0001\u0000\u0000\u0000 \u0c44\u0001\u0000\u0000\u0000"+
		"\"\u0c48\u0001\u0000\u0000\u0000$\u0c51\u0001\u0000\u0000\u0000&6\u0003"+
		"\u001e\u000f\u0000\'6\u0003\u001c\u000e\u0000(6\u0003\u0018\f\u0000)6"+
		"\u0003\u0010\b\u0000*6\u0003\u0016\u000b\u0000+6\u0003\u001a\r\u0000,"+
		"6\u0003\u0014\n\u0000-6\u0003\u0012\t\u0000.6\u0003\u000e\u0007\u0000"+
		"/6\u0003\f\u0006\u000006\u0003\n\u0005\u000016\u0003\b\u0004\u000026\u0003"+
		"\u0006\u0003\u000036\u0003\u0002\u0001\u000046\u0003\u0004\u0002\u0000"+
		"5&\u0001\u0000\u0000\u00005\'\u0001\u0000\u0000\u00005(\u0001\u0000\u0000"+
		"\u00005)\u0001\u0000\u0000\u00005*\u0001\u0000\u0000\u00005+\u0001\u0000"+
		"\u0000\u00005,\u0001\u0000\u0000\u00005-\u0001\u0000\u0000\u00005.\u0001"+
		"\u0000\u0000\u00005/\u0001\u0000\u0000\u000050\u0001\u0000\u0000\u0000"+
		"51\u0001\u0000\u0000\u000052\u0001\u0000\u0000\u000053\u0001\u0000\u0000"+
		"\u000054\u0001\u0000\u0000\u00006\u0001\u0001\u0000\u0000\u000078\u0005"+
		"\u0005\u0000\u000089\u0005\u0003\u0000\u00009:\u0005\n\u0000\u0000:;\u0005"+
		"\u0003\u0000\u0000;<\u0005\n\u0000\u0000<=\u0005\n\u0000\u0000=>\u0005"+
		"\n\u0000\u0000>?\u0005\n\u0000\u0000?@\u0005\n\u0000\u0000@A\u0005\n\u0000"+
		"\u0000AB\u0005\u0003\u0000\u0000BC\u0005\n\u0000\u0000CD\u0005\u0004\u0000"+
		"\u0000DE\u0005\n\u0000\u0000EF\u0005\u0003\u0000\u0000FG\u0005\n\u0000"+
		"\u0000GH\u0005\u0003\u0000\u0000HJ\u0003 \u0010\u0000IK\u0003 \u0010\u0000"+
		"JI\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000\u0000"+
		"\u0000LN\u0003 \u0010\u0000ML\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000NP\u0001\u0000\u0000\u0000OQ\u0003 \u0010\u0000PO\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000RT\u0003 \u0010"+
		"\u0000SR\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000"+
		"\u0000\u0000UW\u0003 \u0010\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WY\u0001\u0000\u0000\u0000XZ\u0003 \u0010\u0000YX\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z^\u0001\u0000\u0000\u0000[]\u0003"+
		" \u0010\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\"+
		"\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000ac\u0005\u0003\u0000\u0000bd\u0003 \u0010"+
		"\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0005"+
		"\u0003\u0000\u0000hi\u0005\u0004\u0000\u0000ij\u0005\n\u0000\u0000jk\u0005"+
		"\u0003\u0000\u0000kl\u0005\n\u0000\u0000lm\u0005\u0003\u0000\u0000mn\u0005"+
		"\n\u0000\u0000no\u0005\u0003\u0000\u0000op\u0003 \u0010\u0000pq\u0005"+
		"\u0003\u0000\u0000qr\u0005\u0004\u0000\u0000rs\u0005\n\u0000\u0000st\u0005"+
		"\u0003\u0000\u0000tu\u0005\n\u0000\u0000uv\u0005\u0003\u0000\u0000vw\u0005"+
		"\b\u0000\u0000wx\u0005\u0003\u0000\u0000xy\u0005\b\u0000\u0000yz\u0005"+
		"\u0003\u0000\u0000z{\u0005\u0004\u0000\u0000{|\u0005\n\u0000\u0000|}\u0005"+
		"\u0003\u0000\u0000}~\u0005\n\u0000\u0000~\u007f\u0005\u0003\u0000\u0000"+
		"\u007f\u0080\u0005\b\u0000\u0000\u0080\u0081\u0005\u0003\u0000\u0000\u0081"+
		"\u0082\u0005\n\u0000\u0000\u0082\u0083\u0005\u0003\u0000\u0000\u0083\u0084"+
		"\u0005\u0004\u0000\u0000\u0084\u0085\u0005\n\u0000\u0000\u0085\u0086\u0005"+
		"\u0003\u0000\u0000\u0086\u0087\u0005\n\u0000\u0000\u0087\u0088\u0005\u0003"+
		"\u0000\u0000\u0088\u0089\u0005\u0006\u0000\u0000\u0089\u008a\u0005\u0003"+
		"\u0000\u0000\u008a\u008b\u0005\u0006\u0000\u0000\u008b\u008c\u0005\u0003"+
		"\u0000\u0000\u008c\u008d\u0005\u0004\u0000\u0000\u008d\u008e\u0005\n\u0000"+
		"\u0000\u008e\u008f\u0005\u0003\u0000\u0000\u008f\u0090\u0005\n\u0000\u0000"+
		"\u0090\u0091\u0005\u0003\u0000\u0000\u0091\u0093\u0003 \u0010\u0000\u0092"+
		"\u0094\u0003 \u0010\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0097"+
		"\u0003 \u0010\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u009a\u0003"+
		" \u0010\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u009d\u0003 \u0010"+
		"\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u00a0\u0003 \u0010\u0000"+
		"\u009f\u009e\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u00a3\u0003 \u0010\u0000\u00a2"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a4\u00a6\u0003 \u0010\u0000\u00a5\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00aa"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0005\u0003\u0000\u0000\u00ab\u00ac\u0005\n\u0000\u0000\u00ac\u00ad\u0005"+
		"\u0003\u0000\u0000\u00ad\u00ae\u0005\u0004\u0000\u0000\u00ae\u00af\u0005"+
		"\n\u0000\u0000\u00af\u00b0\u0005\u0003\u0000\u0000\u00b0\u00b1\u0005\n"+
		"\u0000\u0000\u00b1\u00b2\u0005\n\u0000\u0000\u00b2\u00b3\u0005\n\u0000"+
		"\u0000\u00b3\u00b4\u0005\n\u0000\u0000\u00b4\u00b5\u0005\b\u0000\u0000"+
		"\u00b5\u00b6\u0005\u0003\u0000\u0000\u00b6\u00b7\u0005\u0004\u0000\u0000"+
		"\u00b7\u00b8\u0005\n\u0000\u0000\u00b8\u00b9\u0005\u0003\u0000\u0000\u00b9"+
		"\u00ba\u0005\n\u0000\u0000\u00ba\u00bb\u0005\u0003\u0000\u0000\u00bb\u00bc"+
		"\u0005\u0004\u0000\u0000\u00bc\u00bd\u0005\n\u0000\u0000\u00bd\u00be\u0005"+
		"\u0003\u0000\u0000\u00be\u00bf\u0005\n\u0000\u0000\u00bf\u00c0\u0005\u0003"+
		"\u0000\u0000\u00c0\u00c1\u0005\u0004\u0000\u0000\u00c1\u00c2\u0005\n\u0000"+
		"\u0000\u00c2\u00c3\u0005\u0003\u0000\u0000\u00c3\u00c4\u0005\n\u0000\u0000"+
		"\u00c4\u00c5\u0005\u0003\u0000\u0000\u00c5\u00c6\u0005\u0006\u0000\u0000"+
		"\u00c6\u00c7\u0005\u0004\u0000\u0000\u00c7\u00c8\u0005\u0005\u0000\u0000"+
		"\u00c8\u00c9\u0005\u0003\u0000\u0000\u00c9\u00ca\u0005\n\u0000\u0000\u00ca"+
		"\u00cb\u0005\u0003\u0000\u0000\u00cb\u00cc\u0005\n\u0000\u0000\u00cc\u00cd"+
		"\u0005\n\u0000\u0000\u00cd\u00ce\u0005\n\u0000\u0000\u00ce\u00cf\u0005"+
		"\n\u0000\u0000\u00cf\u00d0\u0005\n\u0000\u0000\u00d0\u00d1\u0005\n\u0000"+
		"\u0000\u00d1\u00d2\u0005\u0003\u0000\u0000\u00d2\u00d3\u0005\n\u0000\u0000"+
		"\u00d3\u00d4\u0005\u0004\u0000\u0000\u00d4\u00d5\u0006\u0001\uffff\uffff"+
		"\u0000\u00d5\u0003\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0005\u0000"+
		"\u0000\u00d7\u00d8\u0005\u0003\u0000\u0000\u00d8\u00d9\u0005\n\u0000\u0000"+
		"\u00d9\u00da\u0005\u0003\u0000\u0000\u00da\u00db\u0005\n\u0000\u0000\u00db"+
		"\u00dc\u0005\n\u0000\u0000\u00dc\u00dd\u0005\n\u0000\u0000\u00dd\u00de"+
		"\u0005\n\u0000\u0000\u00de\u00df\u0005\n\u0000\u0000\u00df\u00e0\u0005"+
		"\n\u0000\u0000\u00e0\u00e1\u0005\u0003\u0000\u0000\u00e1\u00e2\u0005\n"+
		"\u0000\u0000\u00e2\u00e3\u0005\u0004\u0000\u0000\u00e3\u00e4\u0005\n\u0000"+
		"\u0000\u00e4\u00e5\u0005\u0003\u0000\u0000\u00e5\u00e6\u0005\n\u0000\u0000"+
		"\u00e6\u00e7\u0005\u0003\u0000\u0000\u00e7\u00e9\u0003 \u0010\u0000\u00e8"+
		"\u00ea\u0003 \u0010\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00ed"+
		"\u0003 \u0010\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00f0\u0003"+
		" \u0010\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00f3\u0003 \u0010"+
		"\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f6\u0003 \u0010\u0000"+
		"\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f9\u0003 \u0010\u0000\u00f8"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fa\u00fc\u0003 \u0010\u0000\u00fb\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0100"+
		"\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0102"+
		"\u0005\u0003\u0000\u0000\u0101\u0103\u0003 \u0010\u0000\u0102\u0101\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0102\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0106\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0005\u0003\u0000\u0000\u0107\u0108\u0005"+
		"\u0004\u0000\u0000\u0108\u0109\u0005\n\u0000\u0000\u0109\u010a\u0005\u0003"+
		"\u0000\u0000\u010a\u010b\u0005\n\u0000\u0000\u010b\u010c\u0005\u0003\u0000"+
		"\u0000\u010c\u010d\u0005\n\u0000\u0000\u010d\u010e\u0005\u0003\u0000\u0000"+
		"\u010e\u010f\u0003 \u0010\u0000\u010f\u0110\u0005\u0003\u0000\u0000\u0110"+
		"\u0111\u0005\u0004\u0000\u0000\u0111\u0112\u0005\n\u0000\u0000\u0112\u0113"+
		"\u0005\u0003\u0000\u0000\u0113\u0114\u0005\n\u0000\u0000\u0114\u0115\u0005"+
		"\u0003\u0000\u0000\u0115\u0116\u0005\n\u0000\u0000\u0116\u0117\u0005\n"+
		"\u0000\u0000\u0117\u0118\u0005\n\u0000\u0000\u0118\u0119\u0005\n\u0000"+
		"\u0000\u0119\u011a\u0005\n\u0000\u0000\u011a\u011b\u0005\n\u0000\u0000"+
		"\u011b\u011c\u0005\n\u0000\u0000\u011c\u011d\u0005\u0003\u0000\u0000\u011d"+
		"\u011e\u0005\n\u0000\u0000\u011e\u011f\u0005\u0003\u0000\u0000\u011f\u0120"+
		"\u0005\u0004\u0000\u0000\u0120\u0121\u0005\n\u0000\u0000\u0121\u0122\u0005"+
		"\u0003\u0000\u0000\u0122\u0123\u0005\n\u0000\u0000\u0123\u0124\u0005\u0003"+
		"\u0000\u0000\u0124\u0125\u0005\b\u0000\u0000\u0125\u0126\u0005\u0003\u0000"+
		"\u0000\u0126\u0127\u0005\b\u0000\u0000\u0127\u0128\u0005\u0003\u0000\u0000"+
		"\u0128\u0129\u0005\u0004\u0000\u0000\u0129\u012a\u0005\n\u0000\u0000\u012a"+
		"\u012b\u0005\u0003\u0000\u0000\u012b\u012c\u0005\n\u0000\u0000\u012c\u012d"+
		"\u0005\u0003\u0000\u0000\u012d\u012e\u0005\b\u0000\u0000\u012e\u012f\u0005"+
		"\u0003\u0000\u0000\u012f\u0130\u0005\u0006\u0000\u0000\u0130\u0131\u0005"+
		"\u0003\u0000\u0000\u0131\u0132\u0005\u0004\u0000\u0000\u0132\u0133\u0005"+
		"\n\u0000\u0000\u0133\u0134\u0005\u0003\u0000\u0000\u0134\u0135\u0005\n"+
		"\u0000\u0000\u0135\u0136\u0005\u0003\u0000\u0000\u0136\u0137\u0005\n\u0000"+
		"\u0000\u0137\u0138\u0005\u0003\u0000\u0000\u0138\u0139\u0005\n\u0000\u0000"+
		"\u0139\u013a\u0005\u0003\u0000\u0000\u013a\u013b\u0005\u0004\u0000\u0000"+
		"\u013b\u013c\u0005\n\u0000\u0000\u013c\u013d\u0005\u0003\u0000\u0000\u013d"+
		"\u013e\u0005\n\u0000\u0000\u013e\u013f\u0005\u0003\u0000\u0000\u013f\u0140"+
		"\u0005\n\u0000\u0000\u0140\u0141\u0005\u0003\u0000\u0000\u0141\u0142\u0005"+
		"\n\u0000\u0000\u0142\u0143\u0005\u0003\u0000\u0000\u0143\u0144\u0005\u0004"+
		"\u0000\u0000\u0144\u0145\u0005\n\u0000\u0000\u0145\u0146\u0005\u0003\u0000"+
		"\u0000\u0146\u0147\u0005\n\u0000\u0000\u0147\u0148\u0005\u0003\u0000\u0000"+
		"\u0148\u0149\u0005\n\u0000\u0000\u0149\u014a\u0005\u0003\u0000\u0000\u014a"+
		"\u014c\u0003 \u0010\u0000\u014b\u014d\u0003 \u0010\u0000\u014c\u014b\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014f\u0001"+
		"\u0000\u0000\u0000\u014e\u0150\u0003 \u0010\u0000\u014f\u014e\u0001\u0000"+
		"\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0152\u0001\u0000"+
		"\u0000\u0000\u0151\u0153\u0003 \u0010\u0000\u0152\u0151\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0155\u0001\u0000\u0000"+
		"\u0000\u0154\u0156\u0003 \u0010\u0000\u0155\u0154\u0001\u0000\u0000\u0000"+
		"\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0158\u0001\u0000\u0000\u0000"+
		"\u0157\u0159\u0003 \u0010\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0158"+
		"\u0159\u0001\u0000\u0000\u0000\u0159\u015b\u0001\u0000\u0000\u0000\u015a"+
		"\u015c\u0003 \u0010\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0001\u0000\u0000\u0000\u015c\u0160\u0001\u0000\u0000\u0000\u015d\u015f"+
		"\u0003 \u0010\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015f\u0162\u0001"+
		"\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001"+
		"\u0000\u0000\u0000\u0161\u0163\u0001\u0000\u0000\u0000\u0162\u0160\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0005\u0003\u0000\u0000\u0164\u0165\u0005"+
		"\u0004\u0000\u0000\u0165\u0166\u0005\n\u0000\u0000\u0166\u0167\u0005\n"+
		"\u0000\u0000\u0167\u0168\u0005\u0003\u0000\u0000\u0168\u0169\u0005\n\u0000"+
		"\u0000\u0169\u016a\u0005\n\u0000\u0000\u016a\u016b\u0005\n\u0000\u0000"+
		"\u016b\u016c\u0005\u0003\u0000\u0000\u016c\u016d\u0005\u0004\u0000\u0000"+
		"\u016d\u016e\u0005\n\u0000\u0000\u016e\u016f\u0005\u0003\u0000\u0000\u016f"+
		"\u0170\u0005\n\u0000\u0000\u0170\u0171\u0005\n\u0000\u0000\u0171\u0172"+
		"\u0005\n\u0000\u0000\u0172\u0173\u0005\n\u0000\u0000\u0173\u0174\u0005"+
		"\n\u0000\u0000\u0174\u0175\u0005\n\u0000\u0000\u0175\u0176\u0005\n\u0000"+
		"\u0000\u0176\u0177\u0005\n\u0000\u0000\u0177\u0178\u0005\n\u0000\u0000"+
		"\u0178\u0179\u0005\n\u0000\u0000\u0179\u017a\u0005\u0003\u0000\u0000\u017a"+
		"\u017b\u0005\u0004\u0000\u0000\u017b\u017c\u0005\n\u0000\u0000\u017c\u017d"+
		"\u0005\u0003\u0000\u0000\u017d\u017e\u0005\n\u0000\u0000\u017e\u017f\u0005"+
		"\u0003\u0000\u0000\u017f\u0180\u0005\u0006\u0000\u0000\u0180\u0181\u0005"+
		"\u0004\u0000\u0000\u0181\u0182\u0005\u0005\u0000\u0000\u0182\u0183\u0005"+
		"\u0003\u0000\u0000\u0183\u0184\u0005\n\u0000\u0000\u0184\u0185\u0005\u0003"+
		"\u0000\u0000\u0185\u0186\u0005\n\u0000\u0000\u0186\u0187\u0005\n\u0000"+
		"\u0000\u0187\u0188\u0005\n\u0000\u0000\u0188\u0189\u0005\n\u0000\u0000"+
		"\u0189\u018a\u0005\n\u0000\u0000\u018a\u018b\u0005\n\u0000\u0000\u018b"+
		"\u018c\u0005\u0003\u0000\u0000\u018c\u018d\u0005\n\u0000\u0000\u018d\u018e"+
		"\u0005\u0004\u0000\u0000\u018e\u018f\u0006\u0002\uffff\uffff\u0000\u018f"+
		"\u0005\u0001\u0000\u0000\u0000\u0190\u0191\u0005\u0005\u0000\u0000\u0191"+
		"\u0192\u0005\u0003\u0000\u0000\u0192\u0193\u0005\n\u0000\u0000\u0193\u0194"+
		"\u0005\u0003\u0000\u0000\u0194\u0195\u0005\n\u0000\u0000\u0195\u0196\u0005"+
		"\n\u0000\u0000\u0196\u0197\u0005\n\u0000\u0000\u0197\u0198\u0005\n\u0000"+
		"\u0000\u0198\u0199\u0005\n\u0000\u0000\u0199\u019a\u0005\n\u0000\u0000"+
		"\u019a\u019b\u0005\u0003\u0000\u0000\u019b\u019c\u0005\n\u0000\u0000\u019c"+
		"\u029a\u0005\u0004\u0000\u0000\u019d\u019e\u0005\n\u0000\u0000\u019e\u019f"+
		"\u0005\u0003\u0000\u0000\u019f\u01a0\u0005\u0004\u0000\u0000\u01a0\u01a1"+
		"\u0005\n\u0000\u0000\u01a1\u01a2\u0005\u0003\u0000\u0000\u01a2\u01a3\u0005"+
		"\u0003\u0000\u0000\u01a3\u01a4\u0005\u0003\u0000\u0000\u01a4\u01a5\u0005"+
		"\u0004\u0000\u0000\u01a5\u01a6\u0005\n\u0000\u0000\u01a6\u01a7\u0005\u0003"+
		"\u0000\u0000\u01a7\u01a8\u0005\u0003\u0000\u0000\u01a8\u01a9\u0005\u0003"+
		"\u0000\u0000\u01a9\u01aa\u0005\u0004\u0000\u0000\u01aa\u01ab\u0005\n\u0000"+
		"\u0000\u01ab\u01ac\u0005\u0003\u0000\u0000\u01ac\u01ad\u0005\u0003\u0000"+
		"\u0000\u01ad\u01ae\u0005\u0003\u0000\u0000\u01ae\u01af\u0005\u0004\u0000"+
		"\u0000\u01af\u01b0\u0005\n\u0000\u0000\u01b0\u01b1\u0005\u0003\u0000\u0000"+
		"\u01b1\u01b2\u0005\u0003\u0000\u0000\u01b2\u01b3\u0005\u0003\u0000\u0000"+
		"\u01b3\u01b4\u0005\u0004\u0000\u0000\u01b4\u01b5\u0005\n\u0000\u0000\u01b5"+
		"\u01b6\u0005\u0003\u0000\u0000\u01b6\u01b7\u0005\u0003\u0000\u0000\u01b7"+
		"\u01b8\u0005\u0003\u0000\u0000\u01b8\u01b9\u0005\u0004\u0000\u0000\u01b9"+
		"\u01ba\u0005\n\u0000\u0000\u01ba\u01bb\u0005\u0003\u0000\u0000\u01bb\u01bc"+
		"\u0005\u0003\u0000\u0000\u01bc\u01bd\u0005\u0003\u0000\u0000\u01bd\u01be"+
		"\u0005\u0004\u0000\u0000\u01be\u01bf\u0005\n\u0000\u0000\u01bf\u01c0\u0005"+
		"\u0003\u0000\u0000\u01c0\u01c1\u0005\u0003\u0000\u0000\u01c1\u01c2\u0005"+
		"\u0003\u0000\u0000\u01c2\u01c3\u0005\u0004\u0000\u0000\u01c3\u01c4\u0005"+
		"\n\u0000\u0000\u01c4\u01c5\u0005\u0003\u0000\u0000\u01c5\u01c6\u0005\u0003"+
		"\u0000\u0000\u01c6\u01c7\u0005\u0003\u0000\u0000\u01c7\u01c8\u0005\u0004"+
		"\u0000\u0000\u01c8\u01c9\u0005\n\u0000\u0000\u01c9\u01ca\u0005\u0003\u0000"+
		"\u0000\u01ca\u01cb\u0005\u0003\u0000\u0000\u01cb\u01cc\u0005\u0003\u0000"+
		"\u0000\u01cc\u01cd\u0005\u0004\u0000\u0000\u01cd\u01ce\u0005\n\u0000\u0000"+
		"\u01ce\u01cf\u0005\u0003\u0000\u0000\u01cf\u01d0\u0005\u0003\u0000\u0000"+
		"\u01d0\u01d1\u0005\u0003\u0000\u0000\u01d1\u01d2\u0005\u0004\u0000\u0000"+
		"\u01d2\u01d3\u0005\n\u0000\u0000\u01d3\u01d4\u0005\u0003\u0000\u0000\u01d4"+
		"\u01d5\u0005\u0003\u0000\u0000\u01d5\u01d6\u0005\u0003\u0000\u0000\u01d6"+
		"\u01d7\u0005\u0004\u0000\u0000\u01d7\u01d8\u0005\n\u0000\u0000\u01d8\u01d9"+
		"\u0005\u0003\u0000\u0000\u01d9\u01da\u0005\u0003\u0000\u0000\u01da\u01db"+
		"\u0005\u0003\u0000\u0000\u01db\u01dc\u0005\u0004\u0000\u0000\u01dc\u01dd"+
		"\u0005\n\u0000\u0000\u01dd\u01de\u0005\u0003\u0000\u0000\u01de\u01df\u0005"+
		"\u0003\u0000\u0000\u01df\u01e0\u0005\u0003\u0000\u0000\u01e0\u01e1\u0005"+
		"\u0004\u0000\u0000\u01e1\u01e2\u0005\n\u0000\u0000\u01e2\u01e3\u0005\u0003"+
		"\u0000\u0000\u01e3\u01e4\u0005\u0003\u0000\u0000\u01e4\u01e5\u0005\u0003"+
		"\u0000\u0000\u01e5\u01e6\u0005\u0004\u0000\u0000\u01e6\u01e7\u0005\n\u0000"+
		"\u0000\u01e7\u01e8\u0005\u0003\u0000\u0000\u01e8\u01e9\u0005\u0003\u0000"+
		"\u0000\u01e9\u01ea\u0005\u0003\u0000\u0000\u01ea\u01eb\u0005\u0004\u0000"+
		"\u0000\u01eb\u01ec\u0005\n\u0000\u0000\u01ec\u01ed\u0005\u0003\u0000\u0000"+
		"\u01ed\u01ee\u0005\u0003\u0000\u0000\u01ee\u01ef\u0005\u0003\u0000\u0000"+
		"\u01ef\u01f0\u0005\u0004\u0000\u0000\u01f0\u01f1\u0005\n\u0000\u0000\u01f1"+
		"\u01f2\u0005\u0003\u0000\u0000\u01f2\u01f3\u0005\u0003\u0000\u0000\u01f3"+
		"\u01f4\u0005\u0003\u0000\u0000\u01f4\u01f5\u0005\u0004\u0000\u0000\u01f5"+
		"\u01f6\u0005\n\u0000\u0000\u01f6\u01f7\u0005\u0003\u0000\u0000\u01f7\u01f8"+
		"\u0005\u0003\u0000\u0000\u01f8\u01f9\u0005\u0003\u0000\u0000\u01f9\u01fa"+
		"\u0005\u0004\u0000\u0000\u01fa\u01fb\u0005\n\u0000\u0000\u01fb\u01fc\u0005"+
		"\u0003\u0000\u0000\u01fc\u01fd\u0005\u0003\u0000\u0000\u01fd\u01fe\u0005"+
		"\u0003\u0000\u0000\u01fe\u01ff\u0005\n\u0000\u0000\u01ff\u0200\u0005\u0004"+
		"\u0000\u0000\u0200\u0201\u0005\n\u0000\u0000\u0201\u0202\u0005\u0003\u0000"+
		"\u0000\u0202\u0203\u0005\u0003\u0000\u0000\u0203\u0204\u0005\u0003\u0000"+
		"\u0000\u0204\u028f\u0005\u0004\u0000\u0000\u0205\u0206\u0005\n\u0000\u0000"+
		"\u0206\u0207\u0005\u0003\u0000\u0000\u0207\u0208\u0005\n\u0000\u0000\u0208"+
		"\u0209\u0005\u0004\u0000\u0000\u0209\u020a\u0005\n\u0000\u0000\u020a\u020b"+
		"\u0005\u0003\u0000\u0000\u020b\u020c\u0003 \u0010\u0000\u020c\u020d\u0005"+
		"\u0004\u0000\u0000\u020d\u020e\u0005\n\u0000\u0000\u020e\u020f\u0005\u0003"+
		"\u0000\u0000\u020f\u0210\u0005\u0004\u0000\u0000\u0210\u0211\u0005\n\u0000"+
		"\u0000\u0211\u0212\u0005\u0003\u0000\u0000\u0212\u0214\u0005\u0003\u0000"+
		"\u0000\u0213\u0215\u0003 \u0010\u0000\u0214\u0213\u0001\u0000\u0000\u0000"+
		"\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000\u0000\u0000"+
		"\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000"+
		"\u0218\u0219\u0005\u0004\u0000\u0000\u0219\u021a\u0005\n\u0000\u0000\u021a"+
		"\u021b\u0005\u0003\u0000\u0000\u021b\u021c\u0005\u0003\u0000\u0000\u021c"+
		"\u021e\u0003 \u0010\u0000\u021d\u021f\u0003 \u0010\u0000\u021e\u021d\u0001"+
		"\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0221\u0001"+
		"\u0000\u0000\u0000\u0220\u0222\u0003 \u0010\u0000\u0221\u0220\u0001\u0000"+
		"\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0224\u0001\u0000"+
		"\u0000\u0000\u0223\u0225\u0003 \u0010\u0000\u0224\u0223\u0001\u0000\u0000"+
		"\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u0227\u0001\u0000\u0000"+
		"\u0000\u0226\u0228\u0003 \u0010\u0000\u0227\u0226\u0001\u0000\u0000\u0000"+
		"\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u022a\u0001\u0000\u0000\u0000"+
		"\u0229\u022b\u0003 \u0010\u0000\u022a\u0229\u0001\u0000\u0000\u0000\u022a"+
		"\u022b\u0001\u0000\u0000\u0000\u022b\u022d\u0001\u0000\u0000\u0000\u022c"+
		"\u022e\u0003 \u0010\u0000\u022d\u022c\u0001\u0000\u0000\u0000\u022d\u022e"+
		"\u0001\u0000\u0000\u0000\u022e\u0232\u0001\u0000\u0000\u0000\u022f\u0231"+
		"\u0003 \u0010\u0000\u0230\u022f\u0001\u0000\u0000\u0000\u0231\u0234\u0001"+
		"\u0000\u0000\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0232\u0233\u0001"+
		"\u0000\u0000\u0000\u0233\u0235\u0001\u0000\u0000\u0000\u0234\u0232\u0001"+
		"\u0000\u0000\u0000\u0235\u0236\u0005\u0004\u0000\u0000\u0236\u0237\u0005"+
		"\n\u0000\u0000\u0237\u0238\u0005\u0003\u0000\u0000\u0238\u0239\u0005\u0004"+
		"\u0000\u0000\u0239\u023a\u0005\n\u0000\u0000\u023a\u023c\u0005\u0003\u0000"+
		"\u0000\u023b\u023d\u0003 \u0010\u0000\u023c\u023b\u0001\u0000\u0000\u0000"+
		"\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u023c\u0001\u0000\u0000\u0000"+
		"\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000"+
		"\u0240\u0241\u0005\u0004\u0000\u0000\u0241\u0242\u0005\n\u0000\u0000\u0242"+
		"\u0243\u0005\u0003\u0000\u0000\u0243\u0244\u0005\u0006\u0000\u0000\u0244"+
		"\u0245\u0005\u0004\u0000\u0000\u0245\u0246\u0005\n\u0000\u0000\u0246\u0248"+
		"\u0005\u0003\u0000\u0000\u0247\u0249\u0003 \u0010\u0000\u0248\u0247\u0001"+
		"\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u0248\u0001"+
		"\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u024c\u0001"+
		"\u0000\u0000\u0000\u024c\u024d\u0005\u0004\u0000\u0000\u024d\u024e\u0005"+
		"\n\u0000\u0000\u024e\u0250\u0005\u0003\u0000\u0000\u024f\u0251\u0003 "+
		"\u0010\u0000\u0250\u024f\u0001\u0000\u0000\u0000\u0251\u0252\u0001\u0000"+
		"\u0000\u0000\u0252\u0250\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000"+
		"\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0255\u0005\u0004"+
		"\u0000\u0000\u0255\u0256\u0005\n\u0000\u0000\u0256\u0258\u0005\u0003\u0000"+
		"\u0000\u0257\u0259\u0003 \u0010\u0000\u0258\u0257\u0001\u0000\u0000\u0000"+
		"\u0259\u025a\u0001\u0000\u0000\u0000\u025a\u0258\u0001\u0000\u0000\u0000"+
		"\u025a\u025b\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000"+
		"\u025c\u025d\u0005\u0004\u0000\u0000\u025d\u025e\u0005\n\u0000\u0000\u025e"+
		"\u025f\u0005\u0003\u0000\u0000\u025f\u0260\u0005\n\u0000\u0000\u0260\u0261"+
		"\u0005\u0004\u0000\u0000\u0261\u0262\u0005\n\u0000\u0000\u0262\u0263\u0005"+
		"\u0003\u0000\u0000\u0263\u0264\u0005\u0004\u0000\u0000\u0264\u0265\u0005"+
		"\n\u0000\u0000\u0265\u0266\u0005\u0003\u0000\u0000\u0266\u0267\u0005\u0003"+
		"\u0000\u0000\u0267\u0268\u0005\n\u0000\u0000\u0268\u0269\u0005\u0004\u0000"+
		"\u0000\u0269\u026a\u0005\n\u0000\u0000\u026a\u026b\u0005\u0003\u0000\u0000"+
		"\u026b\u026c\u0005\u0003\u0000\u0000\u026c\u026d\u0005\n\u0000\u0000\u026d"+
		"\u026e\u0005\u0004\u0000\u0000\u026e\u026f\u0005\n\u0000\u0000\u026f\u0270"+
		"\u0005\u0003\u0000\u0000\u0270\u0271\u0005\u0003\u0000\u0000\u0271\u0272"+
		"\u0005\u0004\u0000\u0000\u0272\u0273\u0005\n\u0000\u0000\u0273\u0274\u0005"+
		"\u0003\u0000\u0000\u0274\u0275\u0005\b\u0000\u0000\u0275\u0276\u0005\u0004"+
		"\u0000\u0000\u0276\u0277\u0005\n\u0000\u0000\u0277\u0279\u0005\u0003\u0000"+
		"\u0000\u0278\u027a\u0003 \u0010\u0000\u0279\u0278\u0001\u0000\u0000\u0000"+
		"\u027a\u027b\u0001\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000"+
		"\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000"+
		"\u027d\u027e\u0005\u0004\u0000\u0000\u027e\u027f\u0005\n\u0000\u0000\u027f"+
		"\u0280\u0005\u0003\u0000\u0000\u0280\u0281\u0005\b\u0000\u0000\u0281\u0282"+
		"\u0005\u0004\u0000\u0000\u0282\u0283\u0005\n\u0000\u0000\u0283\u0284\u0005"+
		"\u0003\u0000\u0000\u0284\u0285\u0005\b\u0000\u0000\u0285\u0286\u0005\u0004"+
		"\u0000\u0000\u0286\u0287\u0005\n\u0000\u0000\u0287\u0288\u0005\u0003\u0000"+
		"\u0000\u0288\u0289\u0005\n\u0000\u0000\u0289\u028a\u0005\u0004\u0000\u0000"+
		"\u028a\u028b\u0005\n\u0000\u0000\u028b\u028c\u0005\u0003\u0000\u0000\u028c"+
		"\u028d\u0005\u0004\u0000\u0000\u028d\u028e\u0006\u0003\uffff\uffff\u0000"+
		"\u028e\u0290\u0001\u0000\u0000\u0000\u028f\u0205\u0001\u0000\u0000\u0000"+
		"\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000\u0000\u0000"+
		"\u0291\u0292\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000"+
		"\u0293\u0294\u0005\n\u0000\u0000\u0294\u0295\u0005\u0003\u0000\u0000\u0295"+
		"\u0296\u0005\n\u0000\u0000\u0296\u0297\u0005\u0003\u0000\u0000\u0297\u0298"+
		"\u0005\u0006\u0000\u0000\u0298\u0299\u0005\u0004\u0000\u0000\u0299\u029b"+
		"\u0001\u0000\u0000\u0000\u029a\u019d\u0001\u0000\u0000\u0000\u029b\u029c"+
		"\u0001\u0000\u0000\u0000\u029c\u029a\u0001\u0000\u0000\u0000\u029c\u029d"+
		"\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029e\u029f"+
		"\u0005\u0005\u0000\u0000\u029f\u02a0\u0005\u0003\u0000\u0000\u02a0\u02a1"+
		"\u0005\n\u0000\u0000\u02a1\u02a2\u0005\u0003\u0000\u0000\u02a2\u02a3\u0005"+
		"\n\u0000\u0000\u02a3\u02a4\u0005\n\u0000\u0000\u02a4\u02a5\u0005\n\u0000"+
		"\u0000\u02a5\u02a6\u0005\n\u0000\u0000\u02a6\u02a7\u0005\n\u0000\u0000"+
		"\u02a7\u02a8\u0005\n\u0000\u0000\u02a8\u02a9\u0005\u0003\u0000\u0000\u02a9"+
		"\u02aa\u0005\n\u0000\u0000\u02aa\u02ab\u0005\u0004\u0000\u0000\u02ab\u0007"+
		"\u0001\u0000\u0000\u0000\u02ac\u02ad\u0005\u0005\u0000\u0000\u02ad\u02ae"+
		"\u0005\u0003\u0000\u0000\u02ae\u02af\u0005\n\u0000\u0000\u02af\u02b0\u0005"+
		"\u0003\u0000\u0000\u02b0\u02b1\u0005\n\u0000\u0000\u02b1\u02b2\u0005\n"+
		"\u0000\u0000\u02b2\u02b3\u0005\n\u0000\u0000\u02b3\u02b4\u0005\n\u0000"+
		"\u0000\u02b4\u02b5\u0005\n\u0000\u0000\u02b5\u02b6\u0005\n\u0000\u0000"+
		"\u02b6\u02b7\u0005\u0003\u0000\u0000\u02b7\u02b8\u0005\n\u0000\u0000\u02b8"+
		"\u0473\u0005\u0004\u0000\u0000\u02b9\u02ba\u0005\u0005\u0000\u0000\u02ba"+
		"\u02bb\u0005\u0003\u0000\u0000\u02bb\u02bc\u0005\u0004\u0000\u0000\u02bc"+
		"\u02bd\u0005\u0005\u0000\u0000\u02bd\u02be\u0005\u0003\u0000\u0000\u02be"+
		"\u02bf\u0005\u0004\u0000\u0000\u02bf\u02c0\u0005\u0005\u0000\u0000\u02c0"+
		"\u02c1\u0005\u0003\u0000\u0000\u02c1\u02c2\u0005\u0004\u0000\u0000\u02c2"+
		"\u02c3\u0005\u0005\u0000\u0000\u02c3\u02c4\u0005\u0003\u0000\u0000\u02c4"+
		"\u02c5\u0005\u0004\u0000\u0000\u02c5\u02c6\u0005\u0005\u0000\u0000\u02c6"+
		"\u02c7\u0005\u0003\u0000\u0000\u02c7\u02c8\u0005\u0003\u0000\u0000\u02c8"+
		"\u02c9\u0005\u0003\u0000\u0000\u02c9\u02ca\u0005\u0003\u0000\u0000\u02ca"+
		"\u02cb\u0005\u0003\u0000\u0000\u02cb\u02cc\u0005\u0004\u0000\u0000\u02cc"+
		"\u02cd\u0005\u0005\u0000\u0000\u02cd\u02ce\u0005\u0003\u0000\u0000\u02ce"+
		"\u02cf\u0005\u0003\u0000\u0000\u02cf\u02d0\u0005\u0003\u0000\u0000\u02d0"+
		"\u02d1\u0005\u0004\u0000\u0000\u02d1\u02d2\u0005\u0005\u0000\u0000\u02d2"+
		"\u02d3\u0005\u0003\u0000\u0000\u02d3\u02d4\u0005\u0003\u0000\u0000\u02d4"+
		"\u02d5\u0005\u0003\u0000\u0000\u02d5\u02d6\u0005\u0003\u0000\u0000\u02d6"+
		"\u02d7\u0005\u0003\u0000\u0000\u02d7\u02d8\u0005\u0004\u0000\u0000\u02d8"+
		"\u02d9\u0005\u0005\u0000\u0000\u02d9\u02da\u0005\u0003\u0000\u0000\u02da"+
		"\u02db\u0005\u0003\u0000\u0000\u02db\u02dc\u0005\u0003\u0000\u0000\u02dc"+
		"\u02dd\u0005\u0003\u0000\u0000\u02dd\u02de\u0005\u0003\u0000\u0000\u02de"+
		"\u02df\u0005\u0004\u0000\u0000\u02df\u02e0\u0005\u0005\u0000\u0000\u02e0"+
		"\u02e1\u0005\u0003\u0000\u0000\u02e1\u02e2\u0005\u0003\u0000\u0000\u02e2"+
		"\u02e3\u0005\u0003\u0000\u0000\u02e3\u02e4\u0005\u0003\u0000\u0000\u02e4"+
		"\u02e5\u0005\u0004\u0000\u0000\u02e5\u02e6\u0005\u0005\u0000\u0000\u02e6"+
		"\u02e7\u0005\u0003\u0000\u0000\u02e7\u02e8\u0005\u0004\u0000\u0000\u02e8"+
		"\u02e9\u0005\u0005\u0000\u0000\u02e9\u02ea\u0005\u0003\u0000\u0000\u02ea"+
		"\u02eb\u0005\u0003\u0000\u0000\u02eb\u02ec\u0005\u0003\u0000\u0000\u02ec"+
		"\u02ed\u0005\u0003\u0000\u0000\u02ed\u02ee\u0005\u0003\u0000\u0000\u02ee"+
		"\u02ef\u0005\u0004\u0000\u0000\u02ef\u02f0\u0005\u0005\u0000\u0000\u02f0"+
		"\u02f1\u0005\u0003\u0000\u0000\u02f1\u02f2\u0005\u0003\u0000\u0000\u02f2"+
		"\u02f3\u0005\u0003\u0000\u0000\u02f3\u02f4\u0005\u0003\u0000\u0000\u02f4"+
		"\u02f5\u0005\u0004\u0000\u0000\u02f5\u02f6\u0005\u0005\u0000\u0000\u02f6"+
		"\u02f7\u0005\u0003\u0000\u0000\u02f7\u02f8\u0005\u0003\u0000\u0000\u02f8"+
		"\u02f9\u0005\u0003\u0000\u0000\u02f9\u02fa\u0005\u0004\u0000\u0000\u02fa"+
		"\u02fb\u0005\u0005\u0000\u0000\u02fb\u02fc\u0005\u0003\u0000\u0000\u02fc"+
		"\u02fd\u0005\u0003\u0000\u0000\u02fd\u02fe\u0005\u0003\u0000\u0000\u02fe"+
		"\u02ff\u0005\u0004\u0000\u0000\u02ff\u0300\u0005\u0005\u0000\u0000\u0300"+
		"\u0301\u0005\u0003\u0000\u0000\u0301\u0302\u0005\u0003\u0000\u0000\u0302"+
		"\u0303\u0005\u0003\u0000\u0000\u0303\u0304\u0005\u0003\u0000\u0000\u0304"+
		"\u0305\u0005\u0003\u0000\u0000\u0305\u0306\u0005\u0004\u0000\u0000\u0306"+
		"\u0307\u0005\u0005\u0000\u0000\u0307\u0308\u0005\u0003\u0000\u0000\u0308"+
		"\u0309\u0005\u0003\u0000\u0000\u0309\u030a\u0005\u0003\u0000\u0000\u030a"+
		"\u030b\u0005\u0003\u0000\u0000\u030b\u030c\u0005\u0003\u0000\u0000\u030c"+
		"\u030d\u0005\u0004\u0000\u0000\u030d\u030e\u0005\u0005\u0000\u0000\u030e"+
		"\u030f\u0005\u0003\u0000\u0000\u030f\u0310\u0005\u0003\u0000\u0000\u0310"+
		"\u0311\u0005\u0004\u0000\u0000\u0311\u0312\u0005\u0005\u0000\u0000\u0312"+
		"\u0313\u0005\u0003\u0000\u0000\u0313\u0314\u0005\u0004\u0000\u0000\u0314"+
		"\u0315\u0005\u0005\u0000\u0000\u0315\u0316\u0005\u0003\u0000\u0000\u0316"+
		"\u0317\u0005\u0003\u0000\u0000\u0317\u0318\u0005\u0003\u0000\u0000\u0318"+
		"\u0319\u0005\u0003\u0000\u0000\u0319\u031a\u0005\u0003\u0000\u0000\u031a"+
		"\u031b\u0005\u0004\u0000\u0000\u031b\u031c\u0005\u0005\u0000\u0000\u031c"+
		"\u031d\u0005\u0003\u0000\u0000\u031d\u031e\u0005\u0003\u0000\u0000\u031e"+
		"\u031f\u0005\u0003\u0000\u0000\u031f\u0320\u0005\u0004\u0000\u0000\u0320"+
		"\u0321\u0005\u0005\u0000\u0000\u0321\u0322\u0005\u0003\u0000\u0000\u0322"+
		"\u0323\u0005\u0003\u0000\u0000\u0323\u0324\u0005\u0003\u0000\u0000\u0324"+
		"\u0325\u0005\u0003\u0000\u0000\u0325\u0326\u0005\u0003\u0000\u0000\u0326"+
		"\u0327\u0005\u0004\u0000\u0000\u0327\u0328\u0005\u0005\u0000\u0000\u0328"+
		"\u0329\u0005\u0003\u0000\u0000\u0329\u032a\u0005\u0003\u0000\u0000\u032a"+
		"\u032b\u0005\u0003\u0000\u0000\u032b\u032c\u0005\u0003\u0000\u0000\u032c"+
		"\u032d\u0005\u0003\u0000\u0000\u032d\u032e\u0005\u0004\u0000\u0000\u032e"+
		"\u032f\u0005\u0005\u0000\u0000\u032f\u0330\u0005\u0003\u0000\u0000\u0330"+
		"\u0331\u0005\u0003\u0000\u0000\u0331\u0332\u0005\u0003\u0000\u0000\u0332"+
		"\u0333\u0005\u0003\u0000\u0000\u0333\u0334\u0005\u0004\u0000\u0000\u0334"+
		"\u0335\u0005\u0005\u0000\u0000\u0335\u0336\u0005\u0003\u0000\u0000\u0336"+
		"\u0337\u0005\u0004\u0000\u0000\u0337\u0338\u0005\u0005\u0000\u0000\u0338"+
		"\u0339\u0005\u0003\u0000\u0000\u0339\u033a\u0005\u0003\u0000\u0000\u033a"+
		"\u033b\u0005\u0003\u0000\u0000\u033b\u033c\u0005\u0003\u0000\u0000\u033c"+
		"\u033d\u0005\u0003\u0000\u0000\u033d\u033e\u0005\u0004\u0000\u0000\u033e"+
		"\u033f\u0005\u0005\u0000\u0000\u033f\u0340\u0005\u0003\u0000\u0000\u0340"+
		"\u0341\u0005\u0003\u0000\u0000\u0341\u0342\u0005\u0003\u0000\u0000\u0342"+
		"\u0343\u0005\u0004\u0000\u0000\u0343\u0344\u0005\u0005\u0000\u0000\u0344"+
		"\u0345\u0005\u0003\u0000\u0000\u0345\u0346\u0005\u0003\u0000\u0000\u0346"+
		"\u0347\u0005\u0003\u0000\u0000\u0347\u0348\u0005\u0003\u0000\u0000\u0348"+
		"\u0349\u0005\u0003\u0000\u0000\u0349\u034a\u0005\u0004\u0000\u0000\u034a"+
		"\u034b\u0005\u0005\u0000\u0000\u034b\u034c\u0005\u0003\u0000\u0000\u034c"+
		"\u034d\u0005\u0003\u0000\u0000\u034d\u034e\u0005\u0003\u0000\u0000\u034e"+
		"\u034f\u0005\u0003\u0000\u0000\u034f\u0350\u0005\u0003\u0000\u0000\u0350"+
		"\u0351\u0005\u0004\u0000\u0000\u0351\u0352\u0005\u0005\u0000\u0000\u0352"+
		"\u0353\u0005\u0003\u0000\u0000\u0353\u0354\u0005\u0003\u0000\u0000\u0354"+
		"\u0355\u0005\u0003\u0000\u0000\u0355\u0356\u0005\u0003\u0000\u0000\u0356"+
		"\u0357\u0005\u0004\u0000\u0000\u0357\u0358\u0005\u0005\u0000\u0000\u0358"+
		"\u0359\u0005\u0003\u0000\u0000\u0359\u035a\u0005\u0004\u0000\u0000\u035a"+
		"\u035b\u0005\u0005\u0000\u0000\u035b\u035c\u0005\u0003\u0000\u0000\u035c"+
		"\u035d\u0005\u0003\u0000\u0000\u035d\u035e\u0005\u0003\u0000\u0000\u035e"+
		"\u035f\u0005\u0003\u0000\u0000\u035f\u0360\u0005\u0003\u0000\u0000\u0360"+
		"\u0361\u0005\u0004\u0000\u0000\u0361\u0362\u0005\u0005\u0000\u0000\u0362"+
		"\u0363\u0005\u0003\u0000\u0000\u0363\u0364\u0005\u0003\u0000\u0000\u0364"+
		"\u0365\u0005\u0003\u0000\u0000\u0365\u0366\u0005\u0004\u0000\u0000\u0366"+
		"\u0367\u0005\u0005\u0000\u0000\u0367\u0368\u0005\u0003\u0000\u0000\u0368"+
		"\u0369\u0005\u0003\u0000\u0000\u0369\u036a\u0005\u0003\u0000\u0000\u036a"+
		"\u036b\u0005\u0003\u0000\u0000\u036b\u036c\u0005\u0003\u0000\u0000\u036c"+
		"\u036d\u0005\u0004\u0000\u0000\u036d\u036e\u0005\u0005\u0000\u0000\u036e"+
		"\u036f\u0005\u0003\u0000\u0000\u036f\u0370\u0005\u0003\u0000\u0000\u0370"+
		"\u0371\u0005\u0003\u0000\u0000\u0371\u0372\u0005\u0003\u0000\u0000\u0372"+
		"\u0373\u0005\u0003\u0000\u0000\u0373\u0374\u0005\u0004\u0000\u0000\u0374"+
		"\u0375\u0005\u0005\u0000\u0000\u0375\u0376\u0005\u0003\u0000\u0000\u0376"+
		"\u0377\u0005\u0003\u0000\u0000\u0377\u0378\u0005\u0003\u0000\u0000\u0378"+
		"\u0379\u0005\u0003\u0000\u0000\u0379\u037a\u0005\u0004\u0000\u0000\u037a"+
		"\u037b\u0005\u0005\u0000\u0000\u037b\u037c\u0005\u0003\u0000\u0000\u037c"+
		"\u037d\u0005\u0004\u0000\u0000\u037d\u037e\u0005\u0005\u0000\u0000\u037e"+
		"\u037f\u0005\u0003\u0000\u0000\u037f\u0380\u0005\u0004\u0000\u0000\u0380"+
		"\u0381\u0005\u0005\u0000\u0000\u0381\u0382\u0005\u0003\u0000\u0000\u0382"+
		"\u0383\u0005\u0003\u0000\u0000\u0383\u0384\u0005\u0003\u0000\u0000\u0384"+
		"\u0385\u0005\u0003\u0000\u0000\u0385\u0386\u0005\u0003\u0000\u0000\u0386"+
		"\u0387\u0005\u0004\u0000\u0000\u0387\u0388\u0005\u0005\u0000\u0000\u0388"+
		"\u0389\u0005\u0003\u0000\u0000\u0389\u038a\u0005\u0003\u0000\u0000\u038a"+
		"\u038b\u0005\u0003\u0000\u0000\u038b\u038c\u0005\u0004\u0000\u0000\u038c"+
		"\u038d\u0005\u0005\u0000\u0000\u038d\u038e\u0005\u0003\u0000\u0000\u038e"+
		"\u038f\u0005\u0003\u0000\u0000\u038f\u0390\u0005\u0003\u0000\u0000\u0390"+
		"\u0391\u0005\u0003\u0000\u0000\u0391\u0392\u0005\u0003\u0000\u0000\u0392"+
		"\u0393\u0005\u0004\u0000\u0000\u0393\u0394\u0005\u0005\u0000\u0000\u0394"+
		"\u0395\u0005\u0003\u0000\u0000\u0395\u0396\u0005\u0003\u0000\u0000\u0396"+
		"\u0397\u0005\u0003\u0000\u0000\u0397\u0398\u0005\u0003\u0000\u0000\u0398"+
		"\u0399\u0005\u0003\u0000\u0000\u0399\u039a\u0005\u0004\u0000\u0000\u039a"+
		"\u039b\u0005\u0005\u0000\u0000\u039b\u039c\u0005\u0003\u0000\u0000\u039c"+
		"\u039d\u0005\u0003\u0000\u0000\u039d\u039e\u0005\u0003\u0000\u0000\u039e"+
		"\u039f\u0005\u0003\u0000\u0000\u039f\u03a0\u0005\u0004\u0000\u0000\u03a0"+
		"\u03a1\u0005\u0005\u0000\u0000\u03a1\u03a2\u0005\u0003\u0000\u0000\u03a2"+
		"\u03a3\u0005\u0004\u0000\u0000\u03a3\u03a4\u0005\u0005\u0000\u0000\u03a4"+
		"\u03a5\u0005\u0003\u0000\u0000\u03a5\u03a6\u0005\u0003\u0000\u0000\u03a6"+
		"\u03a7\u0005\u0003\u0000\u0000\u03a7\u03a8\u0005\u0003\u0000\u0000\u03a8"+
		"\u03a9\u0005\u0003\u0000\u0000\u03a9\u03aa\u0005\u0004\u0000\u0000\u03aa"+
		"\u03ab\u0005\u0005\u0000\u0000\u03ab\u03ac\u0005\u0003\u0000\u0000\u03ac"+
		"\u03ad\u0005\u0003\u0000\u0000\u03ad\u03ae\u0005\u0003\u0000\u0000\u03ae"+
		"\u03af\u0005\u0004\u0000\u0000\u03af\u03b0\u0005\u0005\u0000\u0000\u03b0"+
		"\u03b1\u0005\u0003\u0000\u0000\u03b1\u03b2\u0005\u0003\u0000\u0000\u03b2"+
		"\u03b3\u0005\u0003\u0000\u0000\u03b3\u03b4\u0005\u0003\u0000\u0000\u03b4"+
		"\u03b5\u0005\u0003\u0000\u0000\u03b5\u03b6\u0005\u0004\u0000\u0000\u03b6"+
		"\u03b7\u0005\u0005\u0000\u0000\u03b7\u03b8\u0005\u0003\u0000\u0000\u03b8"+
		"\u03b9\u0005\u0003\u0000\u0000\u03b9\u03ba\u0005\u0003\u0000\u0000\u03ba"+
		"\u03bb\u0005\u0003\u0000\u0000\u03bb\u03bc\u0005\u0003\u0000\u0000\u03bc"+
		"\u03bd\u0005\u0004\u0000\u0000\u03bd\u03be\u0005\u0005\u0000\u0000\u03be"+
		"\u03bf\u0005\u0003\u0000\u0000\u03bf\u03c0\u0005\u0003\u0000\u0000\u03c0"+
		"\u03c1\u0005\u0003\u0000\u0000\u03c1\u03c2\u0005\u0003\u0000\u0000\u03c2"+
		"\u03c3\u0005\u0004\u0000\u0000\u03c3\u03c4\u0005\u0005\u0000\u0000\u03c4"+
		"\u03c5\u0005\u0003\u0000\u0000\u03c5\u03c6\u0005\u0004\u0000\u0000\u03c6"+
		"\u03c7\u0005\u0005\u0000\u0000\u03c7\u03c8\u0005\u0003\u0000\u0000\u03c8"+
		"\u03c9\u0005\u0003\u0000\u0000\u03c9\u03ca\u0005\u0003\u0000\u0000\u03ca"+
		"\u03cb\u0005\u0003\u0000\u0000\u03cb\u03cc\u0005\u0003\u0000\u0000\u03cc"+
		"\u03cd\u0005\u0004\u0000\u0000\u03cd\u03ce\u0005\u0005\u0000\u0000\u03ce"+
		"\u03cf\u0005\u0003\u0000\u0000\u03cf\u03d0\u0005\u0003\u0000\u0000\u03d0"+
		"\u03d1\u0005\u0003\u0000\u0000\u03d1\u03d2\u0005\u0004\u0000\u0000\u03d2"+
		"\u03d3\u0005\u0005\u0000\u0000\u03d3\u03d4\u0005\u0003\u0000\u0000\u03d4"+
		"\u03d5\u0005\u0003\u0000\u0000\u03d5\u03d6\u0005\u0003\u0000\u0000\u03d6"+
		"\u03d7\u0005\u0003\u0000\u0000\u03d7\u03d8\u0005\u0003\u0000\u0000\u03d8"+
		"\u03d9\u0005\u0004\u0000\u0000\u03d9\u03da\u0005\u0005\u0000\u0000\u03da"+
		"\u03db\u0005\u0003\u0000\u0000\u03db\u03dc\u0005\u0003\u0000\u0000\u03dc"+
		"\u03dd\u0005\u0003\u0000\u0000\u03dd\u03de\u0005\u0003\u0000\u0000\u03de"+
		"\u03df\u0005\u0003\u0000\u0000\u03df\u03e0\u0005\u0004\u0000\u0000\u03e0"+
		"\u03e1\u0005\u0005\u0000\u0000\u03e1\u03e2\u0005\u0003\u0000\u0000\u03e2"+
		"\u03e3\u0005\u0003\u0000\u0000\u03e3\u03e4\u0005\u0003\u0000\u0000\u03e4"+
		"\u03e5\u0005\u0003\u0000\u0000\u03e5\u03e6\u0005\u0004\u0000\u0000\u03e6"+
		"\u03e7\u0005\u0005\u0000\u0000\u03e7\u03e8\u0005\u0003\u0000\u0000\u03e8"+
		"\u03e9\u0005\n\u0000\u0000\u03e9\u03ea\u0005\u0004\u0000\u0000\u03ea\u03eb"+
		"\u0005\u0005\u0000\u0000\u03eb\u03ec\u0005\u0003\u0000\u0000\u03ec\u0468"+
		"\u0005\u0004\u0000\u0000\u03ed\u03ee\u0005\u0005\u0000\u0000\u03ee\u03ef"+
		"\u0005\u0003\u0000\u0000\u03ef\u03f0\u0005\n\u0000\u0000\u03f0\u03f1\u0005"+
		"\u0004\u0000\u0000\u03f1\u03f2\u0005\u0005\u0000\u0000\u03f2\u03f3\u0005"+
		"\u0003\u0000\u0000\u03f3\u03f4\u0003 \u0010\u0000\u03f4\u03f5\u0005\u0004"+
		"\u0000\u0000\u03f5\u03f6\u0005\u0005\u0000\u0000\u03f6\u03f7\u0005\u0003"+
		"\u0000\u0000\u03f7\u03f8\u0005\u0004\u0000\u0000\u03f8\u03f9\u0005\u0005"+
		"\u0000\u0000\u03f9\u03fa\u0005\u0003\u0000\u0000\u03fa\u03fb\u0005\u0003"+
		"\u0000\u0000\u03fb\u03fc\u0005\u0004\u0000\u0000\u03fc\u03fd\u0005\u0005"+
		"\u0000\u0000\u03fd\u03fe\u0005\u0003\u0000\u0000\u03fe\u03ff\u0005\u0003"+
		"\u0000\u0000\u03ff\u0401\u0005\u0003\u0000\u0000\u0400\u0402\u0003 \u0010"+
		"\u0000\u0401\u0400\u0001\u0000\u0000\u0000\u0402\u0403\u0001\u0000\u0000"+
		"\u0000\u0403\u0401\u0001\u0000\u0000\u0000\u0403\u0404\u0001\u0000\u0000"+
		"\u0000\u0404\u0405\u0001\u0000\u0000\u0000\u0405\u0406\u0005\u0004\u0000"+
		"\u0000\u0406\u0407\u0005\u0005\u0000\u0000\u0407\u0408\u0005\u0003\u0000"+
		"\u0000\u0408\u0409\u0005\u0003\u0000\u0000\u0409\u040a\u0005\u0003\u0000"+
		"\u0000\u040a\u040c\u0003 \u0010\u0000\u040b\u040d\u0003 \u0010\u0000\u040c"+
		"\u040b\u0001\u0000\u0000\u0000\u040c\u040d\u0001\u0000\u0000\u0000\u040d"+
		"\u040f\u0001\u0000\u0000\u0000\u040e\u0410\u0003 \u0010\u0000\u040f\u040e"+
		"\u0001\u0000\u0000\u0000\u040f\u0410\u0001\u0000\u0000\u0000\u0410\u0412"+
		"\u0001\u0000\u0000\u0000\u0411\u0413\u0003 \u0010\u0000\u0412\u0411\u0001"+
		"\u0000\u0000\u0000\u0412\u0413\u0001\u0000\u0000\u0000\u0413\u0415\u0001"+
		"\u0000\u0000\u0000\u0414\u0416\u0003 \u0010\u0000\u0415\u0414\u0001\u0000"+
		"\u0000\u0000\u0415\u0416\u0001\u0000\u0000\u0000\u0416\u0418\u0001\u0000"+
		"\u0000\u0000\u0417\u0419\u0003 \u0010\u0000\u0418\u0417\u0001\u0000\u0000"+
		"\u0000\u0418\u0419\u0001\u0000\u0000\u0000\u0419\u041b\u0001\u0000\u0000"+
		"\u0000\u041a\u041c\u0003 \u0010\u0000\u041b\u041a\u0001\u0000\u0000\u0000"+
		"\u041b\u041c\u0001\u0000\u0000\u0000\u041c\u0420\u0001\u0000\u0000\u0000"+
		"\u041d\u041f\u0003 \u0010\u0000\u041e\u041d\u0001\u0000\u0000\u0000\u041f"+
		"\u0422\u0001\u0000\u0000\u0000\u0420\u041e\u0001\u0000\u0000\u0000\u0420"+
		"\u0421\u0001\u0000\u0000\u0000\u0421\u0423\u0001\u0000\u0000\u0000\u0422"+
		"\u0420\u0001\u0000\u0000\u0000\u0423\u0424\u0005\u0004\u0000\u0000\u0424"+
		"\u0425\u0005\u0005\u0000\u0000\u0425\u0426\u0005\u0003\u0000\u0000\u0426"+
		"\u0427\u0005\u0003\u0000\u0000\u0427\u0429\u0005\u0003\u0000\u0000\u0428"+
		"\u042a\u0003 \u0010\u0000\u0429\u0428\u0001\u0000\u0000\u0000\u042a\u042b"+
		"\u0001\u0000\u0000\u0000\u042b\u0429\u0001\u0000\u0000\u0000\u042b\u042c"+
		"\u0001\u0000\u0000\u0000\u042c\u042d\u0001\u0000\u0000\u0000\u042d\u042e"+
		"\u0005\u0004\u0000\u0000\u042e\u042f\u0005\u0005\u0000\u0000\u042f\u0430"+
		"\u0005\u0003\u0000\u0000\u0430\u0431\u0005\u0003\u0000\u0000\u0431\u0432"+
		"\u0005\u0003\u0000\u0000\u0432\u0433\u0005\u0004\u0000\u0000\u0433\u0434"+
		"\u0005\u0005\u0000\u0000\u0434\u0435\u0005\u0003\u0000\u0000\u0435\u0436"+
		"\u0005\u0003\u0000\u0000\u0436\u0437\u0005\u0003\u0000\u0000\u0437\u0438"+
		"\u0005\u0004\u0000\u0000\u0438\u0439\u0005\u0005\u0000\u0000\u0439\u043a"+
		"\u0005\u0003\u0000\u0000\u043a\u043b\u0005\u0003\u0000\u0000\u043b\u043c"+
		"\u0005\u0004\u0000\u0000\u043c\u043d\u0005\u0005\u0000\u0000\u043d\u043e"+
		"\u0005\u0003\u0000\u0000\u043e\u043f\u0005\u0006\u0000\u0000\u043f\u0440"+
		"\u0005\u0004\u0000\u0000\u0440\u0441\u0005\u0005\u0000\u0000\u0441\u0442"+
		"\u0005\u0003\u0000\u0000\u0442\u0446\u0005\n\u0000\u0000\u0443\u0445\u0003"+
		" \u0010\u0000\u0444\u0443\u0001\u0000\u0000\u0000\u0445\u0448\u0001\u0000"+
		"\u0000\u0000\u0446\u0444\u0001\u0000\u0000\u0000\u0446\u0447\u0001\u0000"+
		"\u0000\u0000\u0447\u0449\u0001\u0000\u0000\u0000\u0448\u0446\u0001\u0000"+
		"\u0000\u0000\u0449\u044a\u0005\u0004\u0000\u0000\u044a\u044b\u0005\u0005"+
		"\u0000\u0000\u044b\u044c\u0005\u0003\u0000\u0000\u044c\u044d\u0005\n\u0000"+
		"\u0000\u044d\u044e\u0005\u0004\u0000\u0000\u044e\u044f\u0005\u0005\u0000"+
		"\u0000\u044f\u0453\u0005\u0003\u0000\u0000\u0450\u0452\u0003 \u0010\u0000"+
		"\u0451\u0450\u0001\u0000\u0000\u0000\u0452\u0455\u0001\u0000\u0000\u0000"+
		"\u0453\u0451\u0001\u0000\u0000\u0000\u0453\u0454\u0001\u0000\u0000\u0000"+
		"\u0454\u0456\u0001\u0000\u0000\u0000\u0455\u0453\u0001\u0000\u0000\u0000"+
		"\u0456\u0457\u0005\u0004\u0000\u0000\u0457\u0458\u0005\u0005\u0000\u0000"+
		"\u0458\u0459\u0005\u0003\u0000\u0000\u0459\u045a\u0005\n\u0000\u0000\u045a"+
		"\u045b\u0005\u0004\u0000\u0000\u045b\u045c\u0005\u0005\u0000\u0000\u045c"+
		"\u045d\u0005\u0003\u0000\u0000\u045d\u045e\u0003 \u0010\u0000\u045e\u045f"+
		"\u0005\u0004\u0000\u0000\u045f\u0460\u0005\u0005\u0000\u0000\u0460\u0461"+
		"\u0005\u0003\u0000\u0000\u0461\u0462\u0005\b\u0000\u0000\u0462\u0463\u0005"+
		"\u0004\u0000\u0000\u0463\u0464\u0005\u0005\u0000\u0000\u0464\u0465\u0005"+
		"\u0003\u0000\u0000\u0465\u0466\u0005\u0004\u0000\u0000\u0466\u0467\u0006"+
		"\u0004\uffff\uffff\u0000\u0467\u0469\u0001\u0000\u0000\u0000\u0468\u03ed"+
		"\u0001\u0000\u0000\u0000\u0469\u046a\u0001\u0000\u0000\u0000\u046a\u0468"+
		"\u0001\u0000\u0000\u0000\u046a\u046b\u0001\u0000\u0000\u0000\u046b\u046c"+
		"\u0001\u0000\u0000\u0000\u046c\u046d\u0005\n\u0000\u0000\u046d\u046e\u0005"+
		"\u0003\u0000\u0000\u046e\u046f\u0005\n\u0000\u0000\u046f\u0470\u0005\u0003"+
		"\u0000\u0000\u0470\u0471\u0005\u0006\u0000\u0000\u0471\u0472\u0005\u0004"+
		"\u0000\u0000\u0472\u0474\u0001\u0000\u0000\u0000\u0473\u02b9\u0001\u0000"+
		"\u0000\u0000\u0474\u0475\u0001\u0000\u0000\u0000\u0475\u0473\u0001\u0000"+
		"\u0000\u0000\u0475\u0476\u0001\u0000\u0000\u0000\u0476\u0477\u0001\u0000"+
		"\u0000\u0000\u0477\u0478\u0005\u0005\u0000\u0000\u0478\u0479\u0005\u0003"+
		"\u0000\u0000\u0479\u047a\u0005\n\u0000\u0000\u047a\u047b\u0005\u0003\u0000"+
		"\u0000\u047b\u047c\u0005\n\u0000\u0000\u047c\u047d\u0005\n\u0000\u0000"+
		"\u047d\u047e\u0005\n\u0000\u0000\u047e\u047f\u0005\n\u0000\u0000\u047f"+
		"\u0480\u0005\n\u0000\u0000\u0480\u0481\u0005\n\u0000\u0000\u0481\u0482"+
		"\u0005\u0003\u0000\u0000\u0482\u0483\u0005\n\u0000\u0000\u0483\u0484\u0005"+
		"\u0004\u0000\u0000\u0484\t\u0001\u0000\u0000\u0000\u0485\u0486\u0005\u0005"+
		"\u0000\u0000\u0486\u0487\u0005\u0003\u0000\u0000\u0487\u0488\u0005\n\u0000"+
		"\u0000\u0488\u0489\u0005\u0003\u0000\u0000\u0489\u048a\u0005\n\u0000\u0000"+
		"\u048a\u048b\u0005\n\u0000\u0000\u048b\u048c\u0005\n\u0000\u0000\u048c"+
		"\u048d\u0005\n\u0000\u0000\u048d\u048e\u0005\u0003\u0000\u0000\u048e\u048f"+
		"\u0005\n\u0000\u0000\u048f\u0586\u0005\u0004\u0000\u0000\u0490\u0491\u0005"+
		"\n\u0000\u0000\u0491\u0492\u0005\u0003\u0000\u0000\u0492\u0493\u0005\u0006"+
		"\u0000\u0000\u0493\u0494\u0005\u0003\u0000\u0000\u0494\u0495\u0005\u0004"+
		"\u0000\u0000\u0495\u0496\u0005\n\u0000\u0000\u0496\u0497\u0005\u0003\u0000"+
		"\u0000\u0497\u0498\u0005\u0006\u0000\u0000\u0498\u0499\u0005\u0003\u0000"+
		"\u0000\u0499\u049a\u0005\u0004\u0000\u0000\u049a\u049b\u0005\n\u0000\u0000"+
		"\u049b\u049c\u0005\u0003\u0000\u0000\u049c\u049d\u0005\u0006\u0000\u0000"+
		"\u049d\u049e\u0005\u0003\u0000\u0000\u049e\u049f\u0005\u0004\u0000\u0000"+
		"\u049f\u04a0\u0005\n\u0000\u0000\u04a0\u04a1\u0005\u0003\u0000\u0000\u04a1"+
		"\u04a2\u0005\u0006\u0000\u0000\u04a2\u04a3\u0005\u0003\u0000\u0000\u04a3"+
		"\u04a4\u0005\u0004\u0000\u0000\u04a4\u04a5\u0005\n\u0000\u0000\u04a5\u04a6"+
		"\u0005\u0003\u0000\u0000\u04a6\u04a7\u0005\u0006\u0000\u0000\u04a7\u04a8"+
		"\u0005\u0003\u0000\u0000\u04a8\u04a9\u0005\u0004\u0000\u0000\u04a9\u04aa"+
		"\u0005\n\u0000\u0000\u04aa\u04ab\u0005\u0003\u0000\u0000\u04ab\u04ac\u0005"+
		"\u0006\u0000\u0000\u04ac\u04ad\u0005\u0003\u0000\u0000\u04ad\u04ae\u0005"+
		"\u0004\u0000\u0000\u04ae\u04af\u0005\n\u0000\u0000\u04af\u04b0\u0005\u0003"+
		"\u0000\u0000\u04b0\u04b1\u0005\u0006\u0000\u0000\u04b1\u04b2\u0005\u0003"+
		"\u0000\u0000\u04b2\u04b3\u0005\u0004\u0000\u0000\u04b3\u04b4\u0005\n\u0000"+
		"\u0000\u04b4\u04b5\u0005\u0003\u0000\u0000\u04b5\u04b6\u0005\u0006\u0000"+
		"\u0000\u04b6\u04b7\u0005\u0003\u0000\u0000\u04b7\u04b8\u0005\n\u0000\u0000"+
		"\u04b8\u04b9\u0005\u0004\u0000\u0000\u04b9\u04ba\u0005\n\u0000\u0000\u04ba"+
		"\u04bb\u0005\u0003\u0000\u0000\u04bb\u04bc\u0005\u0006\u0000\u0000\u04bc"+
		"\u04bd\u0005\u0003\u0000\u0000\u04bd\u057b\u0005\u0004\u0000\u0000\u04be"+
		"\u04bf\u0005\n\u0000\u0000\u04bf\u04c0\u0005\u0003\u0000\u0000\u04c0\u04c1"+
		"\u0005\u0006\u0000\u0000\u04c1\u04c2\u0005\u0003\u0000\u0000\u04c2\u04c3"+
		"\u0005\b\u0000\u0000\u04c3\u04c4\u0005\u0004\u0000\u0000\u04c4\u04c5\u0005"+
		"\n\u0000\u0000\u04c5\u04c6\u0005\u0003\u0000\u0000\u04c6\u04c7\u0005\u0006"+
		"\u0000\u0000\u04c7\u04c8\u0005\u0003\u0000\u0000\u04c8\u04ca\u0003 \u0010"+
		"\u0000\u04c9\u04cb\u0003 \u0010\u0000\u04ca\u04c9\u0001\u0000\u0000\u0000"+
		"\u04ca\u04cb\u0001\u0000\u0000\u0000\u04cb\u04cd\u0001\u0000\u0000\u0000"+
		"\u04cc\u04ce\u0003 \u0010\u0000\u04cd\u04cc\u0001\u0000\u0000\u0000\u04cd"+
		"\u04ce\u0001\u0000\u0000\u0000\u04ce\u04d0\u0001\u0000\u0000\u0000\u04cf"+
		"\u04d1\u0003 \u0010\u0000\u04d0\u04cf\u0001\u0000\u0000\u0000\u04d0\u04d1"+
		"\u0001\u0000\u0000\u0000\u04d1\u04d3\u0001\u0000\u0000\u0000\u04d2\u04d4"+
		"\u0003 \u0010\u0000\u04d3\u04d2\u0001\u0000\u0000\u0000\u04d3\u04d4\u0001"+
		"\u0000\u0000\u0000\u04d4\u04d6\u0001\u0000\u0000\u0000\u04d5\u04d7\u0003"+
		" \u0010\u0000\u04d6\u04d5\u0001\u0000\u0000\u0000\u04d6\u04d7\u0001\u0000"+
		"\u0000\u0000\u04d7\u04d9\u0001\u0000\u0000\u0000\u04d8\u04da\u0003 \u0010"+
		"\u0000\u04d9\u04d8\u0001\u0000\u0000\u0000\u04d9\u04da\u0001\u0000\u0000"+
		"\u0000\u04da\u04de\u0001\u0000\u0000\u0000\u04db\u04dd\u0003 \u0010\u0000"+
		"\u04dc\u04db\u0001\u0000\u0000\u0000\u04dd\u04e0\u0001\u0000\u0000\u0000"+
		"\u04de\u04dc\u0001\u0000\u0000\u0000\u04de\u04df\u0001\u0000\u0000\u0000"+
		"\u04df\u04e1\u0001\u0000\u0000\u0000\u04e0\u04de\u0001\u0000\u0000\u0000"+
		"\u04e1\u04e2\u0005\u0004\u0000\u0000\u04e2\u04e3\u0005\n\u0000\u0000\u04e3"+
		"\u04e4\u0005\u0003\u0000\u0000\u04e4\u04e5\u0005\u0006\u0000\u0000\u04e5"+
		"\u04e6\u0005\u0003\u0000\u0000\u04e6\u04e7\u0005\b\u0000\u0000\u04e7\u04e8"+
		"\u0005\u0004\u0000\u0000\u04e8\u04e9\u0005\n\u0000\u0000\u04e9\u04ea\u0005"+
		"\u0003\u0000\u0000\u04ea\u04eb\u0005\u0006\u0000\u0000\u04eb\u04ec\u0005"+
		"\u0003\u0000\u0000\u04ec\u04ed\u0005\b\u0000\u0000\u04ed\u04ee\u0005\u0004"+
		"\u0000\u0000\u04ee\u04ef\u0005\n\u0000\u0000\u04ef\u04f0\u0005\u0003\u0000"+
		"\u0000\u04f0\u04f1\u0005\u0006\u0000\u0000\u04f1\u04f2\u0005\u0003\u0000"+
		"\u0000\u04f2\u04f3\u0005\b\u0000\u0000\u04f3\u04f4\u0005\u0004\u0000\u0000"+
		"\u04f4\u04f5\u0005\n\u0000\u0000\u04f5\u04f6\u0005\u0003\u0000\u0000\u04f6"+
		"\u04f7\u0005\u0006\u0000\u0000\u04f7\u04f8\u0005\u0003\u0000\u0000\u04f8"+
		"\u04f9\u0005\b\u0000\u0000\u04f9\u04fa\u0005\u0004\u0000\u0000\u04fa\u04fb"+
		"\u0005\n\u0000\u0000\u04fb\u04fc\u0005\u0003\u0000\u0000\u04fc\u04fd\u0005"+
		"\u0006\u0000\u0000\u04fd\u04fe\u0005\u0003\u0000\u0000\u04fe\u04ff\u0005"+
		"\b\u0000\u0000\u04ff\u0500\u0005\u0004\u0000\u0000\u0500\u0501\u0005\n"+
		"\u0000\u0000\u0501\u0502\u0005\u0003\u0000\u0000\u0502\u0503\u0005\u0006"+
		"\u0000\u0000\u0503\u0504\u0005\u0003\u0000\u0000\u0504\u0505\u0005\b\u0000"+
		"\u0000\u0505\u0506\u0005\u0004\u0000\u0000\u0506\u0507\u0005\n\u0000\u0000"+
		"\u0507\u0508\u0005\u0003\u0000\u0000\u0508\u0509\u0005\u0006\u0000\u0000"+
		"\u0509\u050a\u0005\u0003\u0000\u0000\u050a\u050b\u0005\b\u0000\u0000\u050b"+
		"\u050c\u0005\u0004\u0000\u0000\u050c\u050d\u0005\n\u0000\u0000\u050d\u050e"+
		"\u0005\u0003\u0000\u0000\u050e\u050f\u0005\u0006\u0000\u0000\u050f\u0510"+
		"\u0005\u0003\u0000\u0000\u0510\u0511\u0005\b\u0000\u0000\u0511\u0512\u0005"+
		"\u0004\u0000\u0000\u0512\u0513\u0005\n\u0000\u0000\u0513\u0514\u0005\u0003"+
		"\u0000\u0000\u0514\u0515\u0005\u0006\u0000\u0000\u0515\u0516\u0005\u0003"+
		"\u0000\u0000\u0516\u0517\u0005\b\u0000\u0000\u0517\u0518\u0005\u0004\u0000"+
		"\u0000\u0518\u0519\u0005\n\u0000\u0000\u0519\u051a\u0005\u0003\u0000\u0000"+
		"\u051a\u051b\u0005\u0006\u0000\u0000\u051b\u051c\u0005\u0003\u0000\u0000"+
		"\u051c\u051d\u0005\b\u0000\u0000\u051d\u051e\u0005\u0004\u0000\u0000\u051e"+
		"\u051f\u0005\n\u0000\u0000\u051f\u0520\u0005\u0003\u0000\u0000\u0520\u0521"+
		"\u0005\u0006\u0000\u0000\u0521\u0522\u0005\u0003\u0000\u0000\u0522\u0523"+
		"\u0005\b\u0000\u0000\u0523\u0524\u0005\u0004\u0000\u0000\u0524\u0525\u0005"+
		"\n\u0000\u0000\u0525\u0526\u0005\u0003\u0000\u0000\u0526\u0527\u0005\u0006"+
		"\u0000\u0000\u0527\u0528\u0005\u0003\u0000\u0000\u0528\u0529\u0005\b\u0000"+
		"\u0000\u0529\u052a\u0005\u0004\u0000\u0000\u052a\u052b\u0005\n\u0000\u0000"+
		"\u052b\u052c\u0005\u0003\u0000\u0000\u052c\u052d\u0005\u0006\u0000\u0000"+
		"\u052d\u052f\u0005\u0003\u0000\u0000\u052e\u0530\u0003 \u0010\u0000\u052f"+
		"\u052e\u0001\u0000\u0000\u0000\u0530\u0531\u0001\u0000\u0000\u0000\u0531"+
		"\u052f\u0001\u0000\u0000\u0000\u0531\u0532\u0001\u0000\u0000\u0000\u0532"+
		"\u0533\u0001\u0000\u0000\u0000\u0533\u0534\u0005\u0004\u0000\u0000\u0534"+
		"\u0535\u0005\n\u0000\u0000\u0535\u0536\u0005\u0003\u0000\u0000\u0536\u0537"+
		"\u0005\u0006\u0000\u0000\u0537\u0538\u0005\u0003\u0000\u0000\u0538\u0539"+
		"\u0003 \u0010\u0000\u0539\u053a\u0005\u0004\u0000\u0000\u053a\u053b\u0005"+
		"\n\u0000\u0000\u053b\u053c\u0005\u0003\u0000\u0000\u053c\u053d\u0005\u0006"+
		"\u0000\u0000\u053d\u053e\u0005\u0003\u0000\u0000\u053e\u053f\u0003 \u0010"+
		"\u0000\u053f\u0540\u0005\u0004\u0000\u0000\u0540\u0541\u0005\n\u0000\u0000"+
		"\u0541\u0542\u0005\u0003\u0000\u0000\u0542\u0543\u0005\u0006\u0000\u0000"+
		"\u0543\u0544\u0005\u0003\u0000\u0000\u0544\u0545\u0003 \u0010\u0000\u0545"+
		"\u0546\u0005\u0004\u0000\u0000\u0546\u0547\u0005\n\u0000\u0000\u0547\u0548"+
		"\u0005\u0003\u0000\u0000\u0548\u0549\u0005\u0006\u0000\u0000\u0549\u054a"+
		"\u0005\u0003\u0000\u0000\u054a\u054b\u0005\u0004\u0000\u0000\u054b\u054c"+
		"\u0006\u0005\uffff\uffff\u0000\u054c\u057c\u0001\u0000\u0000\u0000\u054d"+
		"\u054e\u0005\n\u0000\u0000\u054e\u054f\u0005\u0003\u0000\u0000\u054f\u0550"+
		"\u0005\u0006\u0000\u0000\u0550\u0551\u0005\u0003\u0000\u0000\u0551\u0552"+
		"\u0005\b\u0000\u0000\u0552\u0554\u0003 \u0010\u0000\u0553\u0555\u0003"+
		" \u0010\u0000\u0554\u0553\u0001\u0000\u0000\u0000\u0554\u0555\u0001\u0000"+
		"\u0000\u0000\u0555\u0557\u0001\u0000\u0000\u0000\u0556\u0558\u0003 \u0010"+
		"\u0000\u0557\u0556\u0001\u0000\u0000\u0000\u0557\u0558\u0001\u0000\u0000"+
		"\u0000\u0558\u055a\u0001\u0000\u0000\u0000\u0559\u055b\u0003 \u0010\u0000"+
		"\u055a\u0559\u0001\u0000\u0000\u0000\u055a\u055b\u0001\u0000\u0000\u0000"+
		"\u055b\u055d\u0001\u0000\u0000\u0000\u055c\u055e\u0003 \u0010\u0000\u055d"+
		"\u055c\u0001\u0000\u0000\u0000\u055d\u055e\u0001\u0000\u0000\u0000\u055e"+
		"\u0560\u0001\u0000\u0000\u0000\u055f\u0561\u0003 \u0010\u0000\u0560\u055f"+
		"\u0001\u0000\u0000\u0000\u0560\u0561\u0001\u0000\u0000\u0000\u0561\u0563"+
		"\u0001\u0000\u0000\u0000\u0562\u0564\u0003 \u0010\u0000\u0563\u0562\u0001"+
		"\u0000\u0000\u0000\u0563\u0564\u0001\u0000\u0000\u0000\u0564\u0568\u0001"+
		"\u0000\u0000\u0000\u0565\u0567\u0003 \u0010\u0000\u0566\u0565\u0001\u0000"+
		"\u0000\u0000\u0567\u056a\u0001\u0000\u0000\u0000\u0568\u0566\u0001\u0000"+
		"\u0000\u0000\u0568\u0569\u0001\u0000\u0000\u0000\u0569\u056b\u0001\u0000"+
		"\u0000\u0000\u056a\u0568\u0001\u0000\u0000\u0000\u056b\u056c\u0005\b\u0000"+
		"\u0000\u056c\u056d\u0005\u0004\u0000\u0000\u056d\u056e\u0005\n\u0000\u0000"+
		"\u056e\u056f\u0005\u0003\u0000\u0000\u056f\u0570\u0005\u0006\u0000\u0000"+
		"\u0570\u0571\u0005\u0003\u0000\u0000\u0571\u0572\u0005\b\u0000\u0000\u0572"+
		"\u0573\u0005\b\u0000\u0000\u0573\u0574\u0005\b\u0000\u0000\u0574\u0575"+
		"\u0005\b\u0000\u0000\u0575\u0576\u0005\b\u0000\u0000\u0576\u0577\u0005"+
		"\b\u0000\u0000\u0577\u0578\u0005\b\u0000\u0000\u0578\u0579\u0005\u0004"+
		"\u0000\u0000\u0579\u057a\u0006\u0005\uffff\uffff\u0000\u057a\u057c\u0001"+
		"\u0000\u0000\u0000\u057b\u04be\u0001\u0000\u0000\u0000\u057b\u054d\u0001"+
		"\u0000\u0000\u0000\u057c\u057d\u0001\u0000\u0000\u0000\u057d\u057b\u0001"+
		"\u0000\u0000\u0000\u057d\u057e\u0001\u0000\u0000\u0000\u057e\u057f\u0001"+
		"\u0000\u0000\u0000\u057f\u0580\u0005\n\u0000\u0000\u0580\u0581\u0005\u0003"+
		"\u0000\u0000\u0581\u0582\u0005\n\u0000\u0000\u0582\u0583\u0005\u0003\u0000"+
		"\u0000\u0583\u0584\u0005\u0006\u0000\u0000\u0584\u0585\u0005\u0004\u0000"+
		"\u0000\u0585\u0587\u0001\u0000\u0000\u0000\u0586\u0490\u0001\u0000\u0000"+
		"\u0000\u0587\u0588\u0001\u0000\u0000\u0000\u0588\u0586\u0001\u0000\u0000"+
		"\u0000\u0588\u0589\u0001\u0000\u0000\u0000\u0589\u058a\u0001\u0000\u0000"+
		"\u0000\u058a\u058b\u0005\u0005\u0000\u0000\u058b\u058c\u0005\u0003\u0000"+
		"\u0000\u058c\u058d\u0005\n\u0000\u0000\u058d\u058e\u0005\u0003\u0000\u0000"+
		"\u058e\u058f\u0005\n\u0000\u0000\u058f\u0590\u0005\n\u0000\u0000\u0590"+
		"\u0591\u0005\n\u0000\u0000\u0591\u0592\u0005\n\u0000\u0000\u0592\u0593"+
		"\u0005\u0003\u0000\u0000\u0593\u0594\u0005\n\u0000\u0000\u0594\u0595\u0005"+
		"\u0004\u0000\u0000\u0595\u000b\u0001\u0000\u0000\u0000\u0596\u0597\u0005"+
		"\u0005\u0000\u0000\u0597\u0598\u0005\u0003\u0000\u0000\u0598\u0599\u0005"+
		"\n\u0000\u0000\u0599\u059a\u0005\u0003\u0000\u0000\u059a\u059b\u0005\n"+
		"\u0000\u0000\u059b\u059c\u0005\n\u0000\u0000\u059c\u059d\u0005\n\u0000"+
		"\u0000\u059d\u059e\u0005\n\u0000\u0000\u059e\u059f\u0005\n\u0000\u0000"+
		"\u059f\u05a0\u0005\n\u0000\u0000\u05a0\u05a1\u0005\u0003\u0000\u0000\u05a1"+
		"\u05a2\u0005\n\u0000\u0000\u05a2\u0785\u0005\u0004\u0000\u0000\u05a3\u05a4"+
		"\u0005\n\u0000\u0000\u05a4\u05a5\u0005\u0003\u0000\u0000\u05a5\u05a6\u0005"+
		"\u0006\u0000\u0000\u05a6\u05a7\u0005\u0003\u0000\u0000\u05a7\u05a8\u0005"+
		"\u0004\u0000\u0000\u05a8\u05a9\u0005\n\u0000\u0000\u05a9\u05aa\u0005\u0003"+
		"\u0000\u0000\u05aa\u05ab\u0005\u0006\u0000\u0000\u05ab\u05ac\u0005\u0003"+
		"\u0000\u0000\u05ac\u05ad\u0005\u0004\u0000\u0000\u05ad\u05ae\u0005\n\u0000"+
		"\u0000\u05ae\u05af\u0005\u0003\u0000\u0000\u05af\u05b0\u0005\u0006\u0000"+
		"\u0000\u05b0\u05b1\u0005\u0003\u0000\u0000\u05b1\u05b2\u0005\u0004\u0000"+
		"\u0000\u05b2\u05b3\u0005\n\u0000\u0000\u05b3\u05b4\u0005\u0003\u0000\u0000"+
		"\u05b4\u05b5\u0005\u0006\u0000\u0000\u05b5\u05b6\u0005\u0003\u0000\u0000"+
		"\u05b6\u05b7\u0005\u0003\u0000\u0000\u05b7\u05b8\u0005\u0003\u0000\u0000"+
		"\u05b8\u05b9\u0005\u0003\u0000\u0000\u05b9\u05ba\u0005\u0003\u0000\u0000"+
		"\u05ba\u05bb\u0005\u0004\u0000\u0000\u05bb\u05bc\u0005\n\u0000\u0000\u05bc"+
		"\u05bd\u0005\u0003\u0000\u0000\u05bd\u05be\u0005\u0006\u0000\u0000\u05be"+
		"\u05bf\u0005\u0003\u0000\u0000\u05bf\u05c0\u0005\u0003\u0000\u0000\u05c0"+
		"\u05c1\u0005\u0003\u0000\u0000\u05c1\u05c2\u0005\u0004\u0000\u0000\u05c2"+
		"\u05c3\u0005\n\u0000\u0000\u05c3\u05c4\u0005\u0003\u0000\u0000\u05c4\u05c5"+
		"\u0005\u0006\u0000\u0000\u05c5\u05c6\u0005\u0003\u0000\u0000\u05c6\u05c7"+
		"\u0005\u0003\u0000\u0000\u05c7\u05c8\u0005\u0003\u0000\u0000\u05c8\u05c9"+
		"\u0005\u0003\u0000\u0000\u05c9\u05ca\u0005\u0003\u0000\u0000\u05ca\u05cb"+
		"\u0005\u0004\u0000\u0000\u05cb\u05cc\u0005\n\u0000\u0000\u05cc\u05cd\u0005"+
		"\u0003\u0000\u0000\u05cd\u05ce\u0005\u0006\u0000\u0000\u05ce\u05cf\u0005"+
		"\u0003\u0000\u0000\u05cf\u05d0\u0005\u0003\u0000\u0000\u05d0\u05d1\u0005"+
		"\u0003\u0000\u0000\u05d1\u05d2\u0005\u0003\u0000\u0000\u05d2\u05d3\u0005"+
		"\u0003\u0000\u0000\u05d3\u05d4\u0005\u0004\u0000\u0000\u05d4\u05d5\u0005"+
		"\n\u0000\u0000\u05d5\u05d6\u0005\u0003\u0000\u0000\u05d6\u05d7\u0005\u0006"+
		"\u0000\u0000\u05d7\u05d8\u0005\u0003\u0000\u0000\u05d8\u05d9\u0005\u0003"+
		"\u0000\u0000\u05d9\u05da\u0005\u0003\u0000\u0000\u05da\u05db\u0005\u0003"+
		"\u0000\u0000\u05db\u05dc\u0005\u0004\u0000\u0000\u05dc\u05dd\u0005\n\u0000"+
		"\u0000\u05dd\u05de\u0005\u0003\u0000\u0000\u05de\u05df\u0005\u0006\u0000"+
		"\u0000\u05df\u05e0\u0005\u0003\u0000\u0000\u05e0\u05e1\u0005\u0004\u0000"+
		"\u0000\u05e1\u05e2\u0005\n\u0000\u0000\u05e2\u05e3\u0005\u0003\u0000\u0000"+
		"\u05e3\u05e4\u0005\u0006\u0000\u0000\u05e4\u05e5\u0005\u0003\u0000\u0000"+
		"\u05e5\u05e6\u0005\u0004\u0000\u0000\u05e6\u05e7\u0005\n\u0000\u0000\u05e7"+
		"\u05e8\u0005\u0003\u0000\u0000\u05e8\u05e9\u0005\u0006\u0000\u0000\u05e9"+
		"\u05ea\u0005\u0003\u0000\u0000\u05ea\u05eb\u0005\u0003\u0000\u0000\u05eb"+
		"\u05ec\u0005\u0003\u0000\u0000\u05ec\u05ed\u0005\u0003\u0000\u0000\u05ed"+
		"\u05ee\u0005\u0003\u0000\u0000\u05ee\u05ef\u0005\u0004\u0000\u0000\u05ef"+
		"\u05f0\u0005\n\u0000\u0000\u05f0\u05f1\u0005\u0003\u0000\u0000\u05f1\u05f2"+
		"\u0005\u0006\u0000\u0000\u05f2\u05f3\u0005\u0003\u0000\u0000\u05f3\u05f4"+
		"\u0005\u0003\u0000\u0000\u05f4\u05f5\u0005\u0003\u0000\u0000\u05f5\u05f6"+
		"\u0005\u0004\u0000\u0000\u05f6\u05f7\u0005\n\u0000\u0000\u05f7\u05f8\u0005"+
		"\u0003\u0000\u0000\u05f8\u05f9\u0005\u0006\u0000\u0000\u05f9\u05fa\u0005"+
		"\u0003\u0000\u0000\u05fa\u05fb\u0005\u0003\u0000\u0000\u05fb\u05fc\u0005"+
		"\u0003\u0000\u0000\u05fc\u05fd\u0005\u0003\u0000\u0000\u05fd\u05fe\u0005"+
		"\u0003\u0000\u0000\u05fe\u05ff\u0005\u0004\u0000\u0000\u05ff\u0600\u0005"+
		"\n\u0000\u0000\u0600\u0601\u0005\u0003\u0000\u0000\u0601\u0602\u0005\u0006"+
		"\u0000\u0000\u0602\u0603\u0005\u0003\u0000\u0000\u0603\u0604\u0005\u0003"+
		"\u0000\u0000\u0604\u0605\u0005\u0003\u0000\u0000\u0605\u0606\u0005\u0003"+
		"\u0000\u0000\u0606\u0607\u0005\u0003\u0000\u0000\u0607\u0608\u0005\u0004"+
		"\u0000\u0000\u0608\u0609\u0005\n\u0000\u0000\u0609\u060a\u0005\u0003\u0000"+
		"\u0000\u060a\u060b\u0005\u0006\u0000\u0000\u060b\u060c\u0005\u0003\u0000"+
		"\u0000\u060c\u060d\u0005\u0003\u0000\u0000\u060d\u060e\u0005\u0003\u0000"+
		"\u0000\u060e\u060f\u0005\u0003\u0000\u0000\u060f\u0610\u0005\u0004\u0000"+
		"\u0000\u0610\u0611\u0005\n\u0000\u0000\u0611\u0612\u0005\u0003\u0000\u0000"+
		"\u0612\u0613\u0005\u0006\u0000\u0000\u0613\u0614\u0005\u0003\u0000\u0000"+
		"\u0614\u0615\u0005\u0004\u0000\u0000\u0615\u0616\u0005\n\u0000\u0000\u0616"+
		"\u0617\u0005\u0003\u0000\u0000\u0617\u0618\u0005\u0006\u0000\u0000\u0618"+
		"\u0619\u0005\u0003\u0000\u0000\u0619\u061a\u0005\u0004\u0000\u0000\u061a"+
		"\u061b\u0005\n\u0000\u0000\u061b\u061c\u0005\u0003\u0000\u0000\u061c\u061d"+
		"\u0005\u0006\u0000\u0000\u061d\u061e\u0005\u0003\u0000\u0000\u061e\u061f"+
		"\u0005\u0004\u0000\u0000\u061f\u0620\u0005\n\u0000\u0000\u0620\u0621\u0005"+
		"\u0003\u0000\u0000\u0621\u0622\u0005\u0006\u0000\u0000\u0622\u0623\u0005"+
		"\u0003\u0000\u0000\u0623\u0624\u0005\u0004\u0000\u0000\u0624\u0625\u0005"+
		"\n\u0000\u0000\u0625\u0626\u0005\u0003\u0000\u0000\u0626\u0627\u0005\u0006"+
		"\u0000\u0000\u0627\u0628\u0005\u0003\u0000\u0000\u0628\u0629\u0005\u0003"+
		"\u0000\u0000\u0629\u062a\u0005\u0003\u0000\u0000\u062a\u062b\u0005\u0003"+
		"\u0000\u0000\u062b\u062c\u0005\u0003\u0000\u0000\u062c\u062d\u0005\u0004"+
		"\u0000\u0000\u062d\u062e\u0005\n\u0000\u0000\u062e\u062f\u0005\u0003\u0000"+
		"\u0000\u062f\u0630\u0005\u0006\u0000\u0000\u0630\u0631\u0005\u0003\u0000"+
		"\u0000\u0631\u0632\u0005\u0003\u0000\u0000\u0632\u0633\u0005\u0003\u0000"+
		"\u0000\u0633\u0634\u0005\u0003\u0000\u0000\u0634\u0635\u0005\u0004\u0000"+
		"\u0000\u0635\u0636\u0005\n\u0000\u0000\u0636\u0637\u0005\u0003\u0000\u0000"+
		"\u0637\u0638\u0005\u0006\u0000\u0000\u0638\u0639\u0005\u0003\u0000\u0000"+
		"\u0639\u063a\u0005\u0003\u0000\u0000\u063a\u063b\u0005\u0003\u0000\u0000"+
		"\u063b\u063c\u0005\u0003\u0000\u0000\u063c\u063d\u0005\u0003\u0000\u0000"+
		"\u063d\u063e\u0005\u0004\u0000\u0000\u063e\u063f\u0005\n\u0000\u0000\u063f"+
		"\u0640\u0005\u0003\u0000\u0000\u0640\u0641\u0005\u0006\u0000\u0000\u0641"+
		"\u0642\u0005\u0003\u0000\u0000\u0642\u0643\u0005\u0003\u0000\u0000\u0643"+
		"\u0644\u0005\u0003\u0000\u0000\u0644\u0645\u0005\u0003\u0000\u0000\u0645"+
		"\u0646\u0005\u0003\u0000\u0000\u0646\u0647\u0005\u0004\u0000\u0000\u0647"+
		"\u0648\u0005\n\u0000\u0000\u0648\u0649\u0005\u0003\u0000\u0000\u0649\u064a"+
		"\u0005\u0006\u0000\u0000\u064a\u064b\u0005\u0003\u0000\u0000\u064b\u064c"+
		"\u0005\u0003\u0000\u0000\u064c\u064d\u0005\u0003\u0000\u0000\u064d\u064e"+
		"\u0005\u0003\u0000\u0000\u064e\u064f\u0005\u0004\u0000\u0000\u064f\u0650"+
		"\u0005\n\u0000\u0000\u0650\u0651\u0005\u0003\u0000\u0000\u0651\u0652\u0005"+
		"\u0006\u0000\u0000\u0652\u0653\u0005\u0003\u0000\u0000\u0653\u0654\u0005"+
		"\u0004\u0000\u0000\u0654\u0655\u0005\n\u0000\u0000\u0655\u0656\u0005\u0003"+
		"\u0000\u0000\u0656\u0657\u0005\u0006\u0000\u0000\u0657\u0658\u0005\u0003"+
		"\u0000\u0000\u0658\u0659\u0005\u0004\u0000\u0000\u0659\u065a\u0005\n\u0000"+
		"\u0000\u065a\u065b\u0005\u0003\u0000\u0000\u065b\u065c\u0005\u0006\u0000"+
		"\u0000\u065c\u065d\u0005\u0003\u0000\u0000\u065d\u065e\u0005\u0004\u0000"+
		"\u0000\u065e\u065f\u0005\n\u0000\u0000\u065f\u0660\u0005\u0003\u0000\u0000"+
		"\u0660\u0661\u0005\u0006\u0000\u0000\u0661\u0662\u0005\u0003\u0000\u0000"+
		"\u0662\u0663\u0005\u0004\u0000\u0000\u0663\u0664\u0005\n\u0000\u0000\u0664"+
		"\u0665\u0005\u0003\u0000\u0000\u0665\u0666\u0005\u0006\u0000\u0000\u0666"+
		"\u0667\u0005\u0003\u0000\u0000\u0667\u0668\u0005\u0003\u0000\u0000\u0668"+
		"\u0669\u0005\u0003\u0000\u0000\u0669\u066a\u0005\u0003\u0000\u0000\u066a"+
		"\u066b\u0005\u0003\u0000\u0000\u066b\u066c\u0005\u0004\u0000\u0000\u066c"+
		"\u066d\u0005\n\u0000\u0000\u066d\u066e\u0005\u0003\u0000\u0000\u066e\u066f"+
		"\u0005\u0006\u0000\u0000\u066f\u0670\u0005\u0003\u0000\u0000\u0670\u0671"+
		"\u0005\u0003\u0000\u0000\u0671\u0672\u0005\u0003\u0000\u0000\u0672\u0673"+
		"\u0005\u0004\u0000\u0000\u0673\u0674\u0005\n\u0000\u0000\u0674\u0675\u0005"+
		"\u0003\u0000\u0000\u0675\u0676\u0005\u0006\u0000\u0000\u0676\u0677\u0005"+
		"\u0003\u0000\u0000\u0677\u0678\u0005\u0003\u0000\u0000\u0678\u0679\u0005"+
		"\u0003\u0000\u0000\u0679\u067a\u0005\u0003\u0000\u0000\u067a\u067b\u0005"+
		"\u0003\u0000\u0000\u067b\u067c\u0005\u0004\u0000\u0000\u067c\u067d\u0005"+
		"\n\u0000\u0000\u067d\u067e\u0005\u0003\u0000\u0000\u067e\u067f\u0005\u0006"+
		"\u0000\u0000\u067f\u0680\u0005\u0003\u0000\u0000\u0680\u0681\u0005\u0003"+
		"\u0000\u0000\u0681\u0682\u0005\u0003\u0000\u0000\u0682\u0683\u0005\u0003"+
		"\u0000\u0000\u0683\u0684\u0005\u0003\u0000\u0000\u0684\u0685\u0005\u0004"+
		"\u0000\u0000\u0685\u0686\u0005\n\u0000\u0000\u0686\u0687\u0005\u0003\u0000"+
		"\u0000\u0687\u0688\u0005\u0006\u0000\u0000\u0688\u0689\u0005\u0003\u0000"+
		"\u0000\u0689\u068a\u0005\u0003\u0000\u0000\u068a\u068b\u0005\u0003\u0000"+
		"\u0000\u068b\u068c\u0005\u0003\u0000\u0000\u068c\u068d\u0005\u0004\u0000"+
		"\u0000\u068d\u068e\u0005\n\u0000\u0000\u068e\u068f\u0005\u0003\u0000\u0000"+
		"\u068f\u0690\u0005\u0006\u0000\u0000\u0690\u0691\u0005\u0003\u0000\u0000"+
		"\u0691\u0692\u0005\u0004\u0000\u0000\u0692\u0693\u0005\n\u0000\u0000\u0693"+
		"\u0694\u0005\u0003\u0000\u0000\u0694\u0695\u0005\u0006\u0000\u0000\u0695"+
		"\u0696\u0005\u0003\u0000\u0000\u0696\u0697\u0005\u0004\u0000\u0000\u0697"+
		"\u0698\u0005\n\u0000\u0000\u0698\u0699\u0005\u0003\u0000\u0000\u0699\u069a"+
		"\u0005\u0006\u0000\u0000\u069a\u069b\u0005\u0003\u0000\u0000\u069b\u069c"+
		"\u0005\u0004\u0000\u0000\u069c\u069d\u0005\n\u0000\u0000\u069d\u069e\u0005"+
		"\u0003\u0000\u0000\u069e\u069f\u0005\u0006\u0000\u0000\u069f\u06a0\u0005"+
		"\u0003\u0000\u0000\u06a0\u06a1\u0005\u0003\u0000\u0000\u06a1\u06a2\u0005"+
		"\u0003\u0000\u0000\u06a2\u06a3\u0005\u0003\u0000\u0000\u06a3\u06a4\u0005"+
		"\u0003\u0000\u0000\u06a4\u06a5\u0005\u0004\u0000\u0000\u06a5\u06a6\u0005"+
		"\n\u0000\u0000\u06a6\u06a7\u0005\u0003\u0000\u0000\u06a7\u06a8\u0005\u0006"+
		"\u0000\u0000\u06a8\u06a9\u0005\u0003\u0000\u0000\u06a9\u06aa\u0005\u0003"+
		"\u0000\u0000\u06aa\u06ab\u0005\u0003\u0000\u0000\u06ab\u06ac\u0005\u0004"+
		"\u0000\u0000\u06ac\u06ad\u0005\n\u0000\u0000\u06ad\u06ae\u0005\u0003\u0000"+
		"\u0000\u06ae\u06af\u0005\u0006\u0000\u0000\u06af\u06b0\u0005\u0003\u0000"+
		"\u0000\u06b0\u06b1\u0005\u0003\u0000\u0000\u06b1\u06b2\u0005\u0003\u0000"+
		"\u0000\u06b2\u06b3\u0005\u0003\u0000\u0000\u06b3\u06b4\u0005\u0003\u0000"+
		"\u0000\u06b4\u06b5\u0005\u0004\u0000\u0000\u06b5\u06b6\u0005\n\u0000\u0000"+
		"\u06b6\u06b7\u0005\u0003\u0000\u0000\u06b7\u06b8\u0005\u0006\u0000\u0000"+
		"\u06b8\u06b9\u0005\u0003\u0000\u0000\u06b9\u06ba\u0005\u0003\u0000\u0000"+
		"\u06ba\u06bb\u0005\u0003\u0000\u0000\u06bb\u06bc\u0005\u0003\u0000\u0000"+
		"\u06bc\u06bd\u0005\u0003\u0000\u0000\u06bd\u06be\u0005\u0004\u0000\u0000"+
		"\u06be\u06bf\u0005\n\u0000\u0000\u06bf\u06c0\u0005\u0003\u0000\u0000\u06c0"+
		"\u06c1\u0005\u0006\u0000\u0000\u06c1\u06c2\u0005\u0003\u0000\u0000\u06c2"+
		"\u06c3\u0005\u0003\u0000\u0000\u06c3\u06c4\u0005\u0003\u0000\u0000\u06c4"+
		"\u06c5\u0005\u0003\u0000\u0000\u06c5\u06c6\u0005\u0004\u0000\u0000\u06c6"+
		"\u06c7\u0005\n\u0000\u0000\u06c7\u06c8\u0005\u0003\u0000\u0000\u06c8\u06c9"+
		"\u0005\u0006\u0000\u0000\u06c9\u06ca\u0005\u0003\u0000\u0000\u06ca\u06cb"+
		"\u0005\n\u0000\u0000\u06cb\u06cc\u0005\u0004\u0000\u0000\u06cc\u06cd\u0005"+
		"\n\u0000\u0000\u06cd\u06ce\u0005\u0003\u0000\u0000\u06ce\u06cf\u0005\u0006"+
		"\u0000\u0000\u06cf\u06d0\u0005\u0003\u0000\u0000\u06d0\u077a\u0005\u0004"+
		"\u0000\u0000\u06d1\u06d2\u0005\n\u0000\u0000\u06d2\u06d3\u0005\u0003\u0000"+
		"\u0000\u06d3\u06d4\u0005\u0006\u0000\u0000\u06d4\u06d5\u0005\u0003\u0000"+
		"\u0000\u06d5\u06d6\u0003 \u0010\u0000\u06d6\u06d7\u0005\u0004\u0000\u0000"+
		"\u06d7\u06d8\u0005\n\u0000\u0000\u06d8\u06d9\u0005\u0003\u0000\u0000\u06d9"+
		"\u06da\u0005\u0006\u0000\u0000\u06da\u06db\u0005\u0003\u0000\u0000\u06db"+
		"\u06dd\u0003 \u0010\u0000\u06dc\u06de\u0003 \u0010\u0000\u06dd\u06dc\u0001"+
		"\u0000\u0000\u0000\u06dd\u06de\u0001\u0000\u0000\u0000\u06de\u06e0\u0001"+
		"\u0000\u0000\u0000\u06df\u06e1\u0003 \u0010\u0000\u06e0\u06df\u0001\u0000"+
		"\u0000\u0000\u06e0\u06e1\u0001\u0000\u0000\u0000\u06e1\u06e3\u0001\u0000"+
		"\u0000\u0000\u06e2\u06e4\u0003 \u0010\u0000\u06e3\u06e2\u0001\u0000\u0000"+
		"\u0000\u06e3\u06e4\u0001\u0000\u0000\u0000\u06e4\u06e6\u0001\u0000\u0000"+
		"\u0000\u06e5\u06e7\u0003 \u0010\u0000\u06e6\u06e5\u0001\u0000\u0000\u0000"+
		"\u06e6\u06e7\u0001\u0000\u0000\u0000\u06e7\u06e9\u0001\u0000\u0000\u0000"+
		"\u06e8\u06ea\u0003 \u0010\u0000\u06e9\u06e8\u0001\u0000\u0000\u0000\u06e9"+
		"\u06ea\u0001\u0000\u0000\u0000\u06ea\u06ec\u0001\u0000\u0000\u0000\u06eb"+
		"\u06ed\u0003 \u0010\u0000\u06ec\u06eb\u0001\u0000\u0000\u0000\u06ec\u06ed"+
		"\u0001\u0000\u0000\u0000\u06ed\u06f1\u0001\u0000\u0000\u0000\u06ee\u06f0"+
		"\u0003 \u0010\u0000\u06ef\u06ee\u0001\u0000\u0000\u0000\u06f0\u06f3\u0001"+
		"\u0000\u0000\u0000\u06f1\u06ef\u0001\u0000\u0000\u0000\u06f1\u06f2\u0001"+
		"\u0000\u0000\u0000\u06f2\u06f4\u0001\u0000\u0000\u0000\u06f3\u06f1\u0001"+
		"\u0000\u0000\u0000\u06f4\u06f5\u0005\u0004\u0000\u0000\u06f5\u06f6\u0005"+
		"\n\u0000\u0000\u06f6\u06f7\u0005\u0003\u0000\u0000\u06f7\u06f8\u0005\u0006"+
		"\u0000\u0000\u06f8\u06f9\u0005\u0003\u0000\u0000\u06f9\u06fd\u0003 \u0010"+
		"\u0000\u06fa\u06fc\u0003 \u0010\u0000\u06fb\u06fa\u0001\u0000\u0000\u0000"+
		"\u06fc\u06ff\u0001\u0000\u0000\u0000\u06fd\u06fb\u0001\u0000\u0000\u0000"+
		"\u06fd\u06fe\u0001\u0000\u0000\u0000\u06fe\u0700\u0001\u0000\u0000\u0000"+
		"\u06ff\u06fd\u0001\u0000\u0000\u0000\u0700\u0701\u0005\u0004\u0000\u0000"+
		"\u0701\u0702\u0005\n\u0000\u0000\u0702\u0703\u0005\u0003\u0000\u0000\u0703"+
		"\u0704\u0005\u0006\u0000\u0000\u0704\u0706\u0005\u0003\u0000\u0000\u0705"+
		"\u0707\u0005\n\u0000\u0000\u0706\u0705\u0001\u0000\u0000\u0000\u0706\u0707"+
		"\u0001\u0000\u0000\u0000\u0707\u0708\u0001\u0000\u0000\u0000\u0708\u0709"+
		"\u0005\u0004\u0000\u0000\u0709\u070a\u0005\n\u0000\u0000\u070a\u070b\u0005"+
		"\u0003\u0000\u0000\u070b\u070c\u0005\u0006\u0000\u0000\u070c\u070d\u0005"+
		"\u0003\u0000\u0000\u070d\u070e\u0005\b\u0000\u0000\u070e\u070f\u0005\u0004"+
		"\u0000\u0000\u070f\u0710\u0005\n\u0000\u0000\u0710\u0711\u0005\u0003\u0000"+
		"\u0000\u0711\u0712\u0005\u0006\u0000\u0000\u0712\u0713\u0005\u0003\u0000"+
		"\u0000\u0713\u0714\u0005\b\u0000\u0000\u0714\u0715\u0005\u0004\u0000\u0000"+
		"\u0715\u0716\u0005\n\u0000\u0000\u0716\u0717\u0005\u0003\u0000\u0000\u0717"+
		"\u0718\u0005\u0006\u0000\u0000\u0718\u0719\u0005\u0003\u0000\u0000\u0719"+
		"\u071a\u0005\b\u0000\u0000\u071a\u071b\u0005\u0004\u0000\u0000\u071b\u071c"+
		"\u0005\n\u0000\u0000\u071c\u071d\u0005\u0003\u0000\u0000\u071d\u071e\u0005"+
		"\u0006\u0000\u0000\u071e\u071f\u0005\u0003\u0000\u0000\u071f\u0720\u0005"+
		"\b\u0000\u0000\u0720\u0721\u0005\u0004\u0000\u0000\u0721\u0722\u0005\n"+
		"\u0000\u0000\u0722\u0723\u0005\u0003\u0000\u0000\u0723\u0724\u0005\u0006"+
		"\u0000\u0000\u0724\u0725\u0005\u0003\u0000\u0000\u0725\u0726\u0005\b\u0000"+
		"\u0000\u0726\u0727\u0005\u0004\u0000\u0000\u0727\u0728\u0005\n\u0000\u0000"+
		"\u0728\u0729\u0005\u0003\u0000\u0000\u0729\u072a\u0005\u0006\u0000\u0000"+
		"\u072a\u072b\u0005\u0003\u0000\u0000\u072b\u072c\u0005\b\u0000\u0000\u072c"+
		"\u072d\u0005\u0004\u0000\u0000\u072d\u072e\u0005\n\u0000\u0000\u072e\u072f"+
		"\u0005\u0003\u0000\u0000\u072f\u0730\u0005\u0006\u0000\u0000\u0730\u0731"+
		"\u0005\u0003\u0000\u0000\u0731\u0732\u0005\b\u0000\u0000\u0732\u0733\u0005"+
		"\u0004\u0000\u0000\u0733\u0734\u0005\n\u0000\u0000\u0734\u0735\u0005\u0003"+
		"\u0000\u0000\u0735\u0736\u0005\u0006\u0000\u0000\u0736\u0737\u0005\u0003"+
		"\u0000\u0000\u0737\u0738\u0005\b\u0000\u0000\u0738\u0739\u0005\u0004\u0000"+
		"\u0000\u0739\u073a\u0005\n\u0000\u0000\u073a\u073b\u0005\u0003\u0000\u0000"+
		"\u073b\u073c\u0005\u0006\u0000\u0000\u073c\u073d\u0005\u0003\u0000\u0000"+
		"\u073d\u073e\u0005\b\u0000\u0000\u073e\u073f\u0005\u0004\u0000\u0000\u073f"+
		"\u0740\u0005\n\u0000\u0000\u0740\u0741\u0005\u0003\u0000\u0000\u0741\u0742"+
		"\u0005\u0006\u0000\u0000\u0742\u0743\u0005\u0003\u0000\u0000\u0743\u0744"+
		"\u0005\b\u0000\u0000\u0744\u0745\u0005\u0004\u0000\u0000\u0745\u0746\u0005"+
		"\n\u0000\u0000\u0746\u0747\u0005\u0003\u0000\u0000\u0747\u0748\u0005\u0006"+
		"\u0000\u0000\u0748\u0749\u0005\u0003\u0000\u0000\u0749\u074a\u0005\u0004"+
		"\u0000\u0000\u074a\u074b\u0006\u0006\uffff\uffff\u0000\u074b\u077b\u0001"+
		"\u0000\u0000\u0000\u074c\u074d\u0005\n\u0000\u0000\u074d\u074e\u0005\u0003"+
		"\u0000\u0000\u074e\u074f\u0005\u0006\u0000\u0000\u074f\u0750\u0005\u0003"+
		"\u0000\u0000\u0750\u0751\u0005\b\u0000\u0000\u0751\u0753\u0003 \u0010"+
		"\u0000\u0752\u0754\u0003 \u0010\u0000\u0753\u0752\u0001\u0000\u0000\u0000"+
		"\u0753\u0754\u0001\u0000\u0000\u0000\u0754\u0756\u0001\u0000\u0000\u0000"+
		"\u0755\u0757\u0003 \u0010\u0000\u0756\u0755\u0001\u0000\u0000\u0000\u0756"+
		"\u0757\u0001\u0000\u0000\u0000\u0757\u0759\u0001\u0000\u0000\u0000\u0758"+
		"\u075a\u0003 \u0010\u0000\u0759\u0758\u0001\u0000\u0000\u0000\u0759\u075a"+
		"\u0001\u0000\u0000\u0000\u075a\u075c\u0001\u0000\u0000\u0000\u075b\u075d"+
		"\u0003 \u0010\u0000\u075c\u075b\u0001\u0000\u0000\u0000\u075c\u075d\u0001"+
		"\u0000\u0000\u0000\u075d\u075f\u0001\u0000\u0000\u0000\u075e\u0760\u0003"+
		" \u0010\u0000\u075f\u075e\u0001\u0000\u0000\u0000\u075f\u0760\u0001\u0000"+
		"\u0000\u0000\u0760\u0762\u0001\u0000\u0000\u0000\u0761\u0763\u0003 \u0010"+
		"\u0000\u0762\u0761\u0001\u0000\u0000\u0000\u0762\u0763\u0001\u0000\u0000"+
		"\u0000\u0763\u0767\u0001\u0000\u0000\u0000\u0764\u0766\u0003 \u0010\u0000"+
		"\u0765\u0764\u0001\u0000\u0000\u0000\u0766\u0769\u0001\u0000\u0000\u0000"+
		"\u0767\u0765\u0001\u0000\u0000\u0000\u0767\u0768\u0001\u0000\u0000\u0000"+
		"\u0768\u076a\u0001\u0000\u0000\u0000\u0769\u0767\u0001\u0000\u0000\u0000"+
		"\u076a\u076b\u0005\b\u0000\u0000\u076b\u076c\u0005\u0004\u0000\u0000\u076c"+
		"\u076d\u0005\n\u0000\u0000\u076d\u076e\u0005\u0003\u0000\u0000\u076e\u076f"+
		"\u0005\u0006\u0000\u0000\u076f\u0770\u0005\u0003\u0000\u0000\u0770\u0771"+
		"\u0005\b\u0000\u0000\u0771\u0772\u0005\b\u0000\u0000\u0772\u0773\u0005"+
		"\b\u0000\u0000\u0773\u0774\u0005\b\u0000\u0000\u0774\u0775\u0005\b\u0000"+
		"\u0000\u0775\u0776\u0005\b\u0000\u0000\u0776\u0777\u0005\b\u0000\u0000"+
		"\u0777\u0778\u0005\u0004\u0000\u0000\u0778\u0779\u0006\u0006\uffff\uffff"+
		"\u0000\u0779\u077b\u0001\u0000\u0000\u0000\u077a\u06d1\u0001\u0000\u0000"+
		"\u0000\u077a\u074c\u0001\u0000\u0000\u0000\u077b\u077c\u0001\u0000\u0000"+
		"\u0000\u077c\u077a\u0001\u0000\u0000\u0000\u077c\u077d\u0001\u0000\u0000"+
		"\u0000\u077d\u077e\u0001\u0000\u0000\u0000\u077e\u077f\u0005\n\u0000\u0000"+
		"\u077f\u0780\u0005\u0003\u0000\u0000\u0780\u0781\u0005\n\u0000\u0000\u0781"+
		"\u0782\u0005\u0003\u0000\u0000\u0782\u0783\u0005\u0006\u0000\u0000\u0783"+
		"\u0784\u0005\u0004\u0000\u0000\u0784\u0786\u0001\u0000\u0000\u0000\u0785"+
		"\u05a3\u0001\u0000\u0000\u0000\u0786\u0787\u0001\u0000\u0000\u0000\u0787"+
		"\u0785\u0001\u0000\u0000\u0000\u0787\u0788\u0001\u0000\u0000\u0000\u0788"+
		"\u0789\u0001\u0000\u0000\u0000\u0789\u078a\u0005\u0005\u0000\u0000\u078a"+
		"\u078b\u0005\u0003\u0000\u0000\u078b\u078c\u0005\n\u0000\u0000\u078c\u078d"+
		"\u0005\u0003\u0000\u0000\u078d\u078e\u0005\n\u0000\u0000\u078e\u078f\u0005"+
		"\n\u0000\u0000\u078f\u0790\u0005\n\u0000\u0000\u0790\u0791\u0005\n\u0000"+
		"\u0000\u0791\u0792\u0005\n\u0000\u0000\u0792\u0793\u0005\n\u0000\u0000"+
		"\u0793\u0794\u0005\u0003\u0000\u0000\u0794\u0795\u0005\n\u0000\u0000\u0795"+
		"\u0796\u0005\u0004\u0000\u0000\u0796\r\u0001\u0000\u0000\u0000\u0797\u0798"+
		"\u0005\u0005\u0000\u0000\u0798\u0799\u0005\u0003\u0000\u0000\u0799\u079a"+
		"\u0005\n\u0000\u0000\u079a\u079b\u0005\u0003\u0000\u0000\u079b\u079c\u0005"+
		"\n\u0000\u0000\u079c\u079d\u0005\u0003\u0000\u0000\u079d\u079e\u0005\n"+
		"\u0000\u0000\u079e\u0858\u0005\u0004\u0000\u0000\u079f\u07a0\u0005\b\u0000"+
		"\u0000\u07a0\u07a1\u0005\u0003\u0000\u0000\u07a1\u07a2\u0005\n\u0000\u0000"+
		"\u07a2\u07a3\u0005\n\u0000\u0000\u07a3\u07a4\u0005\u0003\u0000\u0000\u07a4"+
		"\u0859\u0005\u0004\u0000\u0000\u07a5\u07a6\u0005\n\u0000\u0000\u07a6\u07a7"+
		"\u0005\u0003\u0000\u0000\u07a7\u07a8\u0005\b\u0000\u0000\u07a8\u07a9\u0005"+
		"\u0003\u0000\u0000\u07a9\u07aa\u0005\n\u0000\u0000\u07aa\u07ab\u0005\u0003"+
		"\u0000\u0000\u07ab\u07ac\u0005\n\u0000\u0000\u07ac\u07ad\u0005\u0003\u0000"+
		"\u0000\u07ad\u07ae\u0005\n\u0000\u0000\u07ae\u07af\u0005\u0003\u0000\u0000"+
		"\u07af\u07b0\u0005\n\u0000\u0000\u07b0\u07b1\u0005\u0003\u0000\u0000\u07b1"+
		"\u07b2\u0005\n\u0000\u0000\u07b2\u07b3\u0005\u0003\u0000\u0000\u07b3\u07b4"+
		"\u0005\n\u0000\u0000\u07b4\u07b5\u0005\u0003\u0000\u0000\u07b5\u07b6\u0005"+
		"\n\u0000\u0000\u07b6\u07b7\u0005\u0003\u0000\u0000\u07b7\u07b8\u0005\n"+
		"\u0000\u0000\u07b8\u07b9\u0005\u0003\u0000\u0000\u07b9\u07ba\u0005\n\u0000"+
		"\u0000\u07ba\u07bb\u0005\u0003\u0000\u0000\u07bb\u07bc\u0005\n\u0000\u0000"+
		"\u07bc\u07bd\u0005\u0003\u0000\u0000\u07bd\u07be\u0005\n\u0000\u0000\u07be"+
		"\u07bf\u0005\u0003\u0000\u0000\u07bf\u07dc\u0005\u0004\u0000\u0000\u07c0"+
		"\u07c1\u0005\n\u0000\u0000\u07c1\u07c2\u0005\u0003\u0000\u0000\u07c2\u07c3"+
		"\u0005\b\u0000\u0000\u07c3\u07c4\u0005\u0003\u0000\u0000\u07c4\u07c5\u0005"+
		"\u0006\u0000\u0000\u07c5\u07c6\u0005\u0003\u0000\u0000\u07c6\u07c7\u0005"+
		"\b\u0000\u0000\u07c7\u07c8\u0005\u0003\u0000\u0000\u07c8\u07c9\u0005\b"+
		"\u0000\u0000\u07c9\u07ca\u0005\u0003\u0000\u0000\u07ca\u07cb\u0005\b\u0000"+
		"\u0000\u07cb\u07cc\u0005\u0003\u0000\u0000\u07cc\u07cd\u0005\b\u0000\u0000"+
		"\u07cd\u07ce\u0005\u0003\u0000\u0000\u07ce\u07cf\u0005\b\u0000\u0000\u07cf"+
		"\u07d0\u0005\u0003\u0000\u0000\u07d0\u07d1\u0005\b\u0000\u0000\u07d1\u07d2"+
		"\u0005\u0003\u0000\u0000\u07d2\u07d3\u0005\b\u0000\u0000\u07d3\u07d4\u0005"+
		"\u0003\u0000\u0000\u07d4\u07d5\u0005\b\u0000\u0000\u07d5\u07d6\u0005\u0003"+
		"\u0000\u0000\u07d6\u07d7\u0005\b\u0000\u0000\u07d7\u07d8\u0005\u0003\u0000"+
		"\u0000\u07d8\u07d9\u0005\b\u0000\u0000\u07d9\u07da\u0005\u0003\u0000\u0000"+
		"\u07da\u07db\u0005\u0004\u0000\u0000\u07db\u07dd\u0006\u0007\uffff\uffff"+
		"\u0000\u07dc\u07c0\u0001\u0000\u0000\u0000\u07dd\u07de\u0001\u0000\u0000"+
		"\u0000\u07de\u07dc\u0001\u0000\u0000\u0000\u07de\u07df\u0001\u0000\u0000"+
		"\u0000\u07df\u084d\u0001\u0000\u0000\u0000\u07e0\u07e1\u0005\n\u0000\u0000"+
		"\u07e1\u07e2\u0005\u0003\u0000\u0000\u07e2\u07e3\u0005\b\u0000\u0000\u07e3"+
		"\u07e4\u0005\u0003\u0000\u0000\u07e4\u07e5\u0005\n\u0000\u0000\u07e5\u07e6"+
		"\u0005\u0003\u0000\u0000\u07e6\u07e7\u0005\n\u0000\u0000\u07e7\u07e8\u0005"+
		"\u0003\u0000\u0000\u07e8\u07e9\u0005\n\u0000\u0000\u07e9\u07ea\u0005\u0003"+
		"\u0000\u0000\u07ea\u07eb\u0005\n\u0000\u0000\u07eb\u07ec\u0005\u0003\u0000"+
		"\u0000\u07ec\u07ed\u0005\n\u0000\u0000\u07ed\u07ee\u0005\u0003\u0000\u0000"+
		"\u07ee\u07ef\u0005\n\u0000\u0000\u07ef\u07f0\u0005\u0003\u0000\u0000\u07f0"+
		"\u07f1\u0005\n\u0000\u0000\u07f1\u07f2\u0005\u0003\u0000\u0000\u07f2\u07f3"+
		"\u0005\n\u0000\u0000\u07f3\u07f4\u0005\u0003\u0000\u0000\u07f4\u07f5\u0005"+
		"\n\u0000\u0000\u07f5\u07f6\u0005\u0003\u0000\u0000\u07f6\u07f7\u0005\n"+
		"\u0000\u0000\u07f7\u07f8\u0005\u0003\u0000\u0000\u07f8\u07f9\u0005\n\u0000"+
		"\u0000\u07f9\u07fa\u0005\u0003\u0000\u0000\u07fa\u07fb\u0005\n\u0000\u0000"+
		"\u07fb\u07fc\u0005\u0003\u0000\u0000\u07fc\u07fd\u0005\n\u0000\u0000\u07fd"+
		"\u07fe\u0005\u0003\u0000\u0000\u07fe\u07ff\u0005\n\u0000\u0000\u07ff\u0800"+
		"\u0005\u0003\u0000\u0000\u0800\u0801\u0005\n\u0000\u0000\u0801\u0802\u0005"+
		"\u0003\u0000\u0000\u0802\u0803\u0005\n\u0000\u0000\u0803\u0804\u0005\u0003"+
		"\u0000\u0000\u0804\u0805\u0005\n\u0000\u0000\u0805\u0806\u0005\u0003\u0000"+
		"\u0000\u0806\u0848\u0005\u0004\u0000\u0000\u0807\u0808\u0005\n\u0000\u0000"+
		"\u0808\u0809\u0005\u0003\u0000\u0000\u0809\u080a\u0005\b\u0000\u0000\u080a"+
		"\u080b\u0005\u0003\u0000\u0000\u080b\u080c\u0005\u0006\u0000\u0000\u080c"+
		"\u080d\u0005\u0003\u0000\u0000\u080d\u080e\u0005\b\u0000\u0000\u080e\u080f"+
		"\u0005\u0003\u0000\u0000\u080f\u0810\u0005\b\u0000\u0000\u0810\u0811\u0005"+
		"\u0003\u0000\u0000\u0811\u0812\u0005\b\u0000\u0000\u0812\u0813\u0005\u0003"+
		"\u0000\u0000\u0813\u0814\u0005\b\u0000\u0000\u0814\u0815\u0005\u0003\u0000"+
		"\u0000\u0815\u0816\u0005\b\u0000\u0000\u0816\u0817\u0005\u0003\u0000\u0000"+
		"\u0817\u0818\u0005\b\u0000\u0000\u0818\u0819\u0005\u0003\u0000\u0000\u0819"+
		"\u081a\u0005\b\u0000\u0000\u081a\u081b\u0005\u0003\u0000\u0000\u081b\u081c"+
		"\u0005\b\u0000\u0000\u081c\u081d\u0005\u0003\u0000\u0000\u081d\u081e\u0005"+
		"\b\u0000\u0000\u081e\u081f\u0005\u0003\u0000\u0000\u081f\u0820\u0005\b"+
		"\u0000\u0000\u0820\u0821\u0005\u0003\u0000\u0000\u0821\u0822\u0005\b\u0000"+
		"\u0000\u0822\u0823\u0005\u0003\u0000\u0000\u0823\u0824\u0005\b\u0000\u0000"+
		"\u0824\u0825\u0005\u0003\u0000\u0000\u0825\u0827\u0003 \u0010\u0000\u0826"+
		"\u0828\u0003 \u0010\u0000\u0827\u0826\u0001\u0000\u0000\u0000\u0827\u0828"+
		"\u0001\u0000\u0000\u0000\u0828\u082a\u0001\u0000\u0000\u0000\u0829\u082b"+
		"\u0003 \u0010\u0000\u082a\u0829\u0001\u0000\u0000\u0000\u082a\u082b\u0001"+
		"\u0000\u0000\u0000\u082b\u082d\u0001\u0000\u0000\u0000\u082c\u082e\u0003"+
		" \u0010\u0000\u082d\u082c\u0001\u0000\u0000\u0000\u082d\u082e\u0001\u0000"+
		"\u0000\u0000\u082e\u0830\u0001\u0000\u0000\u0000\u082f\u0831\u0003 \u0010"+
		"\u0000\u0830\u082f\u0001\u0000\u0000\u0000\u0830\u0831\u0001\u0000\u0000"+
		"\u0000\u0831\u0833\u0001\u0000\u0000\u0000\u0832\u0834\u0003 \u0010\u0000"+
		"\u0833\u0832\u0001\u0000\u0000\u0000\u0833\u0834\u0001\u0000\u0000\u0000"+
		"\u0834\u0836\u0001\u0000\u0000\u0000\u0835\u0837\u0003 \u0010\u0000\u0836"+
		"\u0835\u0001\u0000\u0000\u0000\u0836\u0837\u0001\u0000\u0000\u0000\u0837"+
		"\u083b\u0001\u0000\u0000\u0000\u0838\u083a\u0003 \u0010\u0000\u0839\u0838"+
		"\u0001\u0000\u0000\u0000\u083a\u083d\u0001\u0000\u0000\u0000\u083b\u0839"+
		"\u0001\u0000\u0000\u0000\u083b\u083c\u0001\u0000\u0000\u0000\u083c\u083e"+
		"\u0001\u0000\u0000\u0000\u083d\u083b\u0001\u0000\u0000\u0000\u083e\u083f"+
		"\u0005\u0003\u0000\u0000\u083f\u0840\u0005\b\u0000\u0000\u0840\u0841\u0005"+
		"\u0003\u0000\u0000\u0841\u0842\u0005\b\u0000\u0000\u0842\u0843\u0005\u0003"+
		"\u0000\u0000\u0843\u0844\u0005\b\u0000\u0000\u0844\u0845\u0005\u0003\u0000"+
		"\u0000\u0845\u0846\u0005\u0004\u0000\u0000\u0846\u0847\u0006\u0007\uffff"+
		"\uffff\u0000\u0847\u0849\u0001\u0000\u0000\u0000\u0848\u0807\u0001\u0000"+
		"\u0000\u0000\u0849\u084a\u0001\u0000\u0000\u0000\u084a\u0848\u0001\u0000"+
		"\u0000\u0000\u084a\u084b\u0001\u0000\u0000\u0000\u084b\u084d\u0001\u0000"+
		"\u0000\u0000\u084c\u07a5\u0001\u0000\u0000\u0000\u084c\u07e0\u0001\u0000"+
		"\u0000\u0000\u084d\u084f\u0001\u0000\u0000\u0000\u084e\u084c\u0001\u0000"+
		"\u0000\u0000\u084f\u0850\u0001\u0000\u0000\u0000\u0850\u084e\u0001\u0000"+
		"\u0000\u0000\u0850\u0851\u0001\u0000\u0000\u0000\u0851\u0852\u0001\u0000"+
		"\u0000\u0000\u0852\u0853\u0005\n\u0000\u0000\u0853\u0854\u0005\u0003\u0000"+
		"\u0000\u0854\u0855\u0005\n\u0000\u0000\u0855\u0856\u0005\u0003\u0000\u0000"+
		"\u0856\u0857\u0005\u0006\u0000\u0000\u0857\u0859\u0005\u0004\u0000\u0000"+
		"\u0858\u079f\u0001\u0000\u0000\u0000\u0858\u084e\u0001\u0000\u0000\u0000"+
		"\u0859\u085a\u0001\u0000\u0000\u0000\u085a\u0858\u0001\u0000\u0000\u0000"+
		"\u085a\u085b\u0001\u0000\u0000\u0000\u085b\u085c\u0001\u0000\u0000\u0000"+
		"\u085c\u085d\u0005\u0005\u0000\u0000\u085d\u085e\u0005\u0003\u0000\u0000"+
		"\u085e\u085f\u0005\n\u0000\u0000\u085f\u0860\u0005\u0003\u0000\u0000\u0860"+
		"\u0861\u0005\n\u0000\u0000\u0861\u0862\u0005\u0003\u0000\u0000\u0862\u0863"+
		"\u0005\n\u0000\u0000\u0863\u0864\u0005\u0004\u0000\u0000\u0864\u000f\u0001"+
		"\u0000\u0000\u0000\u0865\u0866\u0005\u0005\u0000\u0000\u0866\u0867\u0005"+
		"\u0003\u0000\u0000\u0867\u0868\u0005\n\u0000\u0000\u0868\u0869\u0005\u0003"+
		"\u0000\u0000\u0869\u086a\u0005\n\u0000\u0000\u086a\u086b\u0005\n\u0000"+
		"\u0000\u086b\u086c\u0005\n\u0000\u0000\u086c\u086d\u0005\u0003\u0000\u0000"+
		"\u086d\u086e\u0005\n\u0000\u0000\u086e\u086f\u0005\u0003\u0000\u0000\u086f"+
		"\u0870\u0005\n\u0000\u0000\u0870\u08f1\u0005\u0004\u0000\u0000\u0871\u0872"+
		"\u0005\n\u0000\u0000\u0872\u0873\u0005\u0003\u0000\u0000\u0873\u0874\u0005"+
		"\u0004\u0000\u0000\u0874\u0875\u0005\n\u0000\u0000\u0875\u0876\u0005\u0003"+
		"\u0000\u0000\u0876\u0877\u0005\n\u0000\u0000\u0877\u0878\u0005\u0003\u0000"+
		"\u0000\u0878\u0879\u0005\n\u0000\u0000\u0879\u087a\u0005\u0003\u0000\u0000"+
		"\u087a\u087b\u0005\u0003\u0000\u0000\u087b\u087c\u0005\n\u0000\u0000\u087c"+
		"\u087d\u0005\u0003\u0000\u0000\u087d\u087e\u0005\n\u0000\u0000\u087e\u087f"+
		"\u0005\u0003\u0000\u0000\u087f\u0880\u0005\n\u0000\u0000\u0880\u0881\u0005"+
		"\u0003\u0000\u0000\u0881\u0882\u0005\n\u0000\u0000\u0882\u0883\u0005\u0004"+
		"\u0000\u0000\u0883\u0884\u0005\n\u0000\u0000\u0884\u0885\u0005\u0003\u0000"+
		"\u0000\u0885\u0886\u0005\u0003\u0000\u0000\u0886\u0887\u0005\u0003\u0000"+
		"\u0000\u0887\u0888\u0005\n\u0000\u0000\u0888\u0889\u0005\u0003\u0000\u0000"+
		"\u0889\u088a\u0005\u0003\u0000\u0000\u088a\u088b\u0005\u0003\u0000\u0000"+
		"\u088b\u088c\u0005\u0003\u0000\u0000\u088c\u088d\u0005\u0003\u0000\u0000"+
		"\u088d\u088e\u0005\u0003\u0000\u0000\u088e\u088f\u0005\n\u0000\u0000\u088f"+
		"\u0890\u0005\u0003\u0000\u0000\u0890\u0891\u0005\n\u0000\u0000\u0891\u0892"+
		"\u0005\u0003\u0000\u0000\u0892\u08e6\u0005\u0004\u0000\u0000\u0893\u0894"+
		"\u0005\n\u0000\u0000\u0894\u0895\u0005\u0003\u0000\u0000\u0895\u0896\u0005"+
		"\u0003\u0000\u0000\u0896\u0898\u0003 \u0010\u0000\u0897\u0899\u0003 \u0010"+
		"\u0000\u0898\u0897\u0001\u0000\u0000\u0000\u0898\u0899\u0001\u0000\u0000"+
		"\u0000\u0899\u089b\u0001\u0000\u0000\u0000\u089a\u089c\u0003 \u0010\u0000"+
		"\u089b\u089a\u0001\u0000\u0000\u0000\u089b\u089c\u0001\u0000\u0000\u0000"+
		"\u089c\u089e\u0001\u0000\u0000\u0000\u089d\u089f\u0003 \u0010\u0000\u089e"+
		"\u089d\u0001\u0000\u0000\u0000\u089e\u089f\u0001\u0000\u0000\u0000\u089f"+
		"\u08a1\u0001\u0000\u0000\u0000\u08a0\u08a2\u0003 \u0010\u0000\u08a1\u08a0"+
		"\u0001\u0000\u0000\u0000\u08a1\u08a2\u0001\u0000\u0000\u0000\u08a2\u08a4"+
		"\u0001\u0000\u0000\u0000\u08a3\u08a5\u0003 \u0010\u0000\u08a4\u08a3\u0001"+
		"\u0000\u0000\u0000\u08a4\u08a5\u0001\u0000\u0000\u0000\u08a5\u08a7\u0001"+
		"\u0000\u0000\u0000\u08a6\u08a8\u0003 \u0010\u0000\u08a7\u08a6\u0001\u0000"+
		"\u0000\u0000\u08a7\u08a8\u0001\u0000\u0000\u0000\u08a8\u08ac\u0001\u0000"+
		"\u0000\u0000\u08a9\u08ab\u0003 \u0010\u0000\u08aa\u08a9\u0001\u0000\u0000"+
		"\u0000\u08ab\u08ae\u0001\u0000\u0000\u0000\u08ac\u08aa\u0001\u0000\u0000"+
		"\u0000\u08ac\u08ad\u0001\u0000\u0000\u0000\u08ad\u08af\u0001\u0000\u0000"+
		"\u0000\u08ae\u08ac\u0001\u0000\u0000\u0000\u08af\u08b0\u0005\u0003\u0000"+
		"\u0000\u08b0\u08b1\u0005\b\u0000\u0000\u08b1\u08b2\u0005\u0003\u0000\u0000"+
		"\u08b2\u08b4\u0003 \u0010\u0000\u08b3\u08b5\u0003 \u0010\u0000\u08b4\u08b3"+
		"\u0001\u0000\u0000\u0000\u08b4\u08b5\u0001\u0000\u0000\u0000\u08b5\u08b7"+
		"\u0001\u0000\u0000\u0000\u08b6\u08b8\u0003 \u0010\u0000\u08b7\u08b6\u0001"+
		"\u0000\u0000\u0000\u08b7\u08b8\u0001\u0000\u0000\u0000\u08b8\u08ba\u0001"+
		"\u0000\u0000\u0000\u08b9\u08bb\u0003 \u0010\u0000\u08ba\u08b9\u0001\u0000"+
		"\u0000\u0000\u08ba\u08bb\u0001\u0000\u0000\u0000\u08bb\u08bd\u0001\u0000"+
		"\u0000\u0000\u08bc\u08be\u0003 \u0010\u0000\u08bd\u08bc\u0001\u0000\u0000"+
		"\u0000\u08bd\u08be\u0001\u0000\u0000\u0000\u08be\u08c0\u0001\u0000\u0000"+
		"\u0000\u08bf\u08c1\u0003 \u0010\u0000\u08c0\u08bf\u0001\u0000\u0000\u0000"+
		"\u08c0\u08c1\u0001\u0000\u0000\u0000\u08c1\u08c3\u0001\u0000\u0000\u0000"+
		"\u08c2\u08c4\u0003 \u0010\u0000\u08c3\u08c2\u0001\u0000\u0000\u0000\u08c3"+
		"\u08c4\u0001\u0000\u0000\u0000\u08c4\u08c8\u0001\u0000\u0000\u0000\u08c5"+
		"\u08c7\u0003 \u0010\u0000\u08c6\u08c5\u0001\u0000\u0000\u0000\u08c7\u08ca"+
		"\u0001\u0000\u0000\u0000\u08c8\u08c6\u0001\u0000\u0000\u0000\u08c8\u08c9"+
		"\u0001\u0000\u0000\u0000\u08c9\u08cb\u0001\u0000\u0000\u0000\u08ca\u08c8"+
		"\u0001\u0000\u0000\u0000\u08cb\u08cc\u0005\u0003\u0000\u0000\u08cc\u08cd"+
		"\u0005\b\u0000\u0000\u08cd\u08ce\u0005\u0003\u0000\u0000\u08ce\u08cf\u0005"+
		"\b\u0000\u0000\u08cf\u08d0\u0005\u0003\u0000\u0000\u08d0\u08d1\u0005\b"+
		"\u0000\u0000\u08d1\u08d2\u0005\u0003\u0000\u0000\u08d2\u08d3\u0005\u0003"+
		"\u0000\u0000\u08d3\u08d5\u0005\u0003\u0000\u0000\u08d4\u08d6\u0005\b\u0000"+
		"\u0000\u08d5\u08d4\u0001\u0000\u0000\u0000\u08d5\u08d6\u0001\u0000\u0000"+
		"\u0000\u08d6\u08d7\u0001\u0000\u0000\u0000\u08d7\u08d8\u0005\u0003\u0000"+
		"\u0000\u08d8\u08d9\u0005\u0003\u0000\u0000\u08d9\u08da\u0005\u0003\u0000"+
		"\u0000\u08da\u08db\u0005\u0003\u0000\u0000\u08db\u08dc\u0005\u0003\u0000"+
		"\u0000\u08dc\u08de\u0005\u0003\u0000\u0000\u08dd\u08df\u0005\b\u0000\u0000"+
		"\u08de\u08dd\u0001\u0000\u0000\u0000\u08de\u08df\u0001\u0000\u0000\u0000"+
		"\u08df\u08e0\u0001\u0000\u0000\u0000\u08e0\u08e1\u0005\u0003\u0000\u0000"+
		"\u08e1\u08e2\u0005\n\u0000\u0000\u08e2\u08e3\u0005\u0003\u0000\u0000\u08e3"+
		"\u08e4\u0005\u0004\u0000\u0000\u08e4\u08e5\u0006\b\uffff\uffff\u0000\u08e5"+
		"\u08e7\u0001\u0000\u0000\u0000\u08e6\u0893\u0001\u0000\u0000\u0000\u08e7"+
		"\u08e8\u0001\u0000\u0000\u0000\u08e8\u08e6\u0001\u0000\u0000\u0000\u08e8"+
		"\u08e9\u0001\u0000\u0000\u0000\u08e9\u08ea\u0001\u0000\u0000\u0000\u08ea"+
		"\u08eb\u0005\n\u0000\u0000\u08eb\u08ec\u0005\u0003\u0000\u0000\u08ec\u08ed"+
		"\u0005\n\u0000\u0000\u08ed\u08ee\u0005\u0003\u0000\u0000\u08ee\u08ef\u0005"+
		"\u0006\u0000\u0000\u08ef\u08f0\u0005\u0004\u0000\u0000\u08f0\u08f2\u0001"+
		"\u0000\u0000\u0000\u08f1\u0871\u0001\u0000\u0000\u0000\u08f2\u08f3\u0001"+
		"\u0000\u0000\u0000\u08f3\u08f1\u0001\u0000\u0000\u0000\u08f3\u08f4\u0001"+
		"\u0000\u0000\u0000\u08f4\u08f5\u0001\u0000\u0000\u0000\u08f5\u08f6\u0005"+
		"\u0005\u0000\u0000\u08f6\u08f7\u0005\u0003\u0000\u0000\u08f7\u08f8\u0005"+
		"\n\u0000\u0000\u08f8\u08f9\u0005\u0003\u0000\u0000\u08f9\u08fa\u0005\n"+
		"\u0000\u0000\u08fa\u08fb\u0005\n\u0000\u0000\u08fb\u08fc\u0005\n\u0000"+
		"\u0000\u08fc\u08fd\u0005\u0003\u0000\u0000\u08fd\u08fe\u0005\n\u0000\u0000"+
		"\u08fe\u08ff\u0005\u0003\u0000\u0000\u08ff\u0900\u0005\n\u0000\u0000\u0900"+
		"\u0901\u0005\u0004\u0000\u0000\u0901\u0011\u0001\u0000\u0000\u0000\u0902"+
		"\u0903\u0005\u0005\u0000\u0000\u0903\u0904\u0005\u0003\u0000\u0000\u0904"+
		"\u0905\u0005\n\u0000\u0000\u0905\u0906\u0005\n\u0000\u0000\u0906\u0907"+
		"\u0005\u0003\u0000\u0000\u0907\u0908\u0005\n\u0000\u0000\u0908\u0909\u0005"+
		"\u0003\u0000\u0000\u0909\u090a\u0005\n\u0000\u0000\u090a\u090b\u0005\u0003"+
		"\u0000\u0000\u090b\u090c\u0005\n\u0000\u0000\u090c\u099a\u0005\u0004\u0000"+
		"\u0000\u090d\u090e\u0005\b\u0000\u0000\u090e\u0910\u0005\u0003\u0000\u0000"+
		"\u090f\u0911\u0003 \u0010\u0000\u0910\u090f\u0001\u0000\u0000\u0000\u0911"+
		"\u0912\u0001\u0000\u0000\u0000\u0912\u0910\u0001\u0000\u0000\u0000\u0912"+
		"\u0913\u0001\u0000\u0000\u0000\u0913\u0914\u0001\u0000\u0000\u0000\u0914"+
		"\u0915\u0005\u0004\u0000\u0000\u0915\u0916\u0005\u0005\u0000\u0000\u0916"+
		"\u0917\u0005\u0003\u0000\u0000\u0917\u0919\u0003 \u0010\u0000\u0918\u091a"+
		"\u0003 \u0010\u0000\u0919\u0918\u0001\u0000\u0000\u0000\u0919\u091a\u0001"+
		"\u0000\u0000\u0000\u091a\u091c\u0001\u0000\u0000\u0000\u091b\u091d\u0003"+
		" \u0010\u0000\u091c\u091b\u0001\u0000\u0000\u0000\u091c\u091d\u0001\u0000"+
		"\u0000\u0000\u091d\u091f\u0001\u0000\u0000\u0000\u091e\u0920\u0003 \u0010"+
		"\u0000\u091f\u091e\u0001\u0000\u0000\u0000\u091f\u0920\u0001\u0000\u0000"+
		"\u0000\u0920\u0922\u0001\u0000\u0000\u0000\u0921\u0923\u0003 \u0010\u0000"+
		"\u0922\u0921\u0001\u0000\u0000\u0000\u0922\u0923\u0001\u0000\u0000\u0000"+
		"\u0923\u0925\u0001\u0000\u0000\u0000\u0924\u0926\u0003 \u0010\u0000\u0925"+
		"\u0924\u0001\u0000\u0000\u0000\u0925\u0926\u0001\u0000\u0000\u0000\u0926"+
		"\u0928\u0001\u0000\u0000\u0000\u0927\u0929\u0003 \u0010\u0000\u0928\u0927"+
		"\u0001\u0000\u0000\u0000\u0928\u0929\u0001\u0000\u0000\u0000\u0929\u092d"+
		"\u0001\u0000\u0000\u0000\u092a\u092c\u0003 \u0010\u0000\u092b\u092a\u0001"+
		"\u0000\u0000\u0000\u092c\u092f\u0001\u0000\u0000\u0000\u092d\u092b\u0001"+
		"\u0000\u0000\u0000\u092d\u092e\u0001\u0000\u0000\u0000\u092e\u0930\u0001"+
		"\u0000\u0000\u0000\u092f\u092d\u0001\u0000\u0000\u0000\u0930\u0931\u0005"+
		"\u0004\u0000\u0000\u0931\u0932\u0005\u0005\u0000\u0000\u0932\u0933\u0005"+
		"\u0003\u0000\u0000\u0933\u0935\u0003 \u0010\u0000\u0934\u0936\u0003 \u0010"+
		"\u0000\u0935\u0934\u0001\u0000\u0000\u0000\u0935\u0936\u0001\u0000\u0000"+
		"\u0000\u0936\u0938\u0001\u0000\u0000\u0000\u0937\u0939\u0003 \u0010\u0000"+
		"\u0938\u0937\u0001\u0000\u0000\u0000\u0938\u0939\u0001\u0000\u0000\u0000"+
		"\u0939\u093b\u0001\u0000\u0000\u0000\u093a\u093c\u0003 \u0010\u0000\u093b"+
		"\u093a\u0001\u0000\u0000\u0000\u093b\u093c\u0001\u0000\u0000\u0000\u093c"+
		"\u093e\u0001\u0000\u0000\u0000\u093d\u093f\u0003 \u0010\u0000\u093e\u093d"+
		"\u0001\u0000\u0000\u0000\u093e\u093f\u0001\u0000\u0000\u0000\u093f\u0941"+
		"\u0001\u0000\u0000\u0000\u0940\u0942\u0003 \u0010\u0000\u0941\u0940\u0001"+
		"\u0000\u0000\u0000\u0941\u0942\u0001\u0000\u0000\u0000\u0942\u0944\u0001"+
		"\u0000\u0000\u0000\u0943\u0945\u0003 \u0010\u0000\u0944\u0943\u0001\u0000"+
		"\u0000\u0000\u0944\u0945\u0001\u0000\u0000\u0000\u0945\u0949\u0001\u0000"+
		"\u0000\u0000\u0946\u0948\u0003 \u0010\u0000\u0947\u0946\u0001\u0000\u0000"+
		"\u0000\u0948\u094b\u0001\u0000\u0000\u0000\u0949\u0947\u0001\u0000\u0000"+
		"\u0000\u0949\u094a\u0001\u0000\u0000\u0000\u094a\u094c\u0001\u0000\u0000"+
		"\u0000\u094b\u0949\u0001\u0000\u0000\u0000\u094c\u094d\u0005\u0004\u0000"+
		"\u0000\u094d\u094e\u0005\u0005\u0000\u0000\u094e\u094f\u0005\u0003\u0000"+
		"\u0000\u094f\u0950\u0005\b\u0000\u0000\u0950\u0951\u0005\u0004\u0000\u0000"+
		"\u0951\u0952\u0006\t\uffff\uffff\u0000\u0952\u098f\u0001\u0000\u0000\u0000"+
		"\u0953\u0954\u0005\n\u0000\u0000\u0954\u0955\u0005\u0003\u0000\u0000\u0955"+
		"\u0956\u0005\n\u0000\u0000\u0956\u0957\u0005\u0003\u0000\u0000\u0957\u0958"+
		"\u0005\n\u0000\u0000\u0958\u0959\u0005\u0003\u0000\u0000\u0959\u095a\u0005"+
		"\n\u0000\u0000\u095a\u095b\u0005\u0003\u0000\u0000\u095b\u095c\u0005\n"+
		"\u0000\u0000\u095c\u095d\u0005\u0003\u0000\u0000\u095d\u095e\u0005\n\u0000"+
		"\u0000\u095e\u095f\u0005";
	private static final String _serializedATNSegment1 =
		"\u0003\u0000\u0000\u095f\u0960\u0005\n\u0000\u0000\u0960\u0961\u0005\u0003"+
		"\u0000\u0000\u0961\u0962\u0005\n\u0000\u0000\u0962\u0963\u0005\u0003\u0000"+
		"\u0000\u0963\u098b\u0005\u0004\u0000\u0000\u0964\u0965\u0005\u0003\u0000"+
		"\u0000\u0965\u0966\u0005\u0003\u0000\u0000\u0966\u0967\u0005\u0003\u0000"+
		"\u0000\u0967\u0968\u0005\u0003\u0000\u0000\u0968\u0969\u0005\u0003\u0000"+
		"\u0000\u0969\u096a\u0005\u0003\u0000\u0000\u096a\u096b\u0005\u0003\u0000"+
		"\u0000\u096b\u096c\u0005\u0003\u0000\u0000\u096c\u098c\u0005\u0004\u0000"+
		"\u0000\u096d\u096f\u0005\u0006\u0000\u0000\u096e\u096d\u0001\u0000\u0000"+
		"\u0000\u096e\u096f\u0001\u0000\u0000\u0000\u096f\u0970\u0001\u0000\u0000"+
		"\u0000\u0970\u0972\u0005\u0003\u0000\u0000\u0971\u0973\u0005\b\u0000\u0000"+
		"\u0972\u0971\u0001\u0000\u0000\u0000\u0972\u0973\u0001\u0000\u0000\u0000"+
		"\u0973\u0974\u0001\u0000\u0000\u0000\u0974\u0976\u0005\u0003\u0000\u0000"+
		"\u0975\u0977\u0005\b\u0000\u0000\u0976\u0975\u0001\u0000\u0000\u0000\u0976"+
		"\u0977\u0001\u0000\u0000\u0000\u0977\u0978\u0001\u0000\u0000\u0000\u0978"+
		"\u097a\u0005\u0003\u0000\u0000\u0979\u097b\u0005\b\u0000\u0000\u097a\u0979"+
		"\u0001\u0000\u0000\u0000\u097a\u097b\u0001\u0000\u0000\u0000\u097b\u097c"+
		"\u0001\u0000\u0000\u0000\u097c\u097e\u0005\u0003\u0000\u0000\u097d\u097f"+
		"\u0005\b\u0000\u0000\u097e\u097d\u0001\u0000\u0000\u0000\u097e\u097f\u0001"+
		"\u0000\u0000\u0000\u097f\u0980\u0001\u0000\u0000\u0000\u0980\u0981\u0005"+
		"\u0003\u0000\u0000\u0981\u0982\u0005\b\u0000\u0000\u0982\u0983\u0005\u0003"+
		"\u0000\u0000\u0983\u0984\u0005\b\u0000\u0000\u0984\u0986\u0005\u0003\u0000"+
		"\u0000\u0985\u0987\u0005\b\u0000\u0000\u0986\u0985\u0001\u0000\u0000\u0000"+
		"\u0986\u0987\u0001\u0000\u0000\u0000\u0987\u0988\u0001\u0000\u0000\u0000"+
		"\u0988\u0989\u0005\u0003\u0000\u0000\u0989\u098a\u0005\u0004\u0000\u0000"+
		"\u098a\u098c\u0006\t\uffff\uffff\u0000\u098b\u0964\u0001\u0000\u0000\u0000"+
		"\u098b\u096e\u0001\u0000\u0000\u0000\u098c\u098d\u0001\u0000\u0000\u0000"+
		"\u098d\u098b\u0001\u0000\u0000\u0000\u098d\u098e\u0001\u0000\u0000\u0000"+
		"\u098e\u0990\u0001\u0000\u0000\u0000\u098f\u0953\u0001\u0000\u0000\u0000"+
		"\u0990\u0991\u0001\u0000\u0000\u0000\u0991\u098f\u0001\u0000\u0000\u0000"+
		"\u0991\u0992\u0001\u0000\u0000\u0000\u0992\u0993\u0001\u0000\u0000\u0000"+
		"\u0993\u0994\u0005\n\u0000\u0000\u0994\u0995\u0005\u0003\u0000\u0000\u0995"+
		"\u0996\u0005\n\u0000\u0000\u0996\u0997\u0005\u0003\u0000\u0000\u0997\u0998"+
		"\u0005\u0006\u0000\u0000\u0998\u0999\u0005\u0004\u0000\u0000\u0999\u099b"+
		"\u0001\u0000\u0000\u0000\u099a\u090d\u0001\u0000\u0000\u0000\u099b\u099c"+
		"\u0001\u0000\u0000\u0000\u099c\u099a\u0001\u0000\u0000\u0000\u099c\u099d"+
		"\u0001\u0000\u0000\u0000\u099d\u099e\u0001\u0000\u0000\u0000\u099e\u099f"+
		"\u0005\u0005\u0000\u0000\u099f\u09a0\u0005\u0003\u0000\u0000\u09a0\u09a1"+
		"\u0005\n\u0000\u0000\u09a1\u09a2\u0005\n\u0000\u0000\u09a2\u09a3\u0005"+
		"\u0003\u0000\u0000\u09a3\u09a4\u0005\n\u0000\u0000\u09a4\u09a5\u0005\u0003"+
		"\u0000\u0000\u09a5\u09a6\u0005\n\u0000\u0000\u09a6\u09a7\u0005\u0003\u0000"+
		"\u0000\u09a7\u09a8\u0005\n\u0000\u0000\u09a8\u09a9\u0005\u0004\u0000\u0000"+
		"\u09a9\u0013\u0001\u0000\u0000\u0000\u09aa\u09ab\u0005\u0005\u0000\u0000"+
		"\u09ab\u09ac\u0005\u0003\u0000\u0000\u09ac\u09ad\u0005\n\u0000\u0000\u09ad"+
		"\u09ae\u0005\n\u0000\u0000\u09ae\u09af\u0005\u0003\u0000\u0000\u09af\u09b0"+
		"\u0005\n\u0000\u0000\u09b0\u09b1\u0005\u0003\u0000\u0000\u09b1\u09b2\u0005"+
		"\n\u0000\u0000\u09b2\u09b3\u0005\u0003\u0000\u0000\u09b3\u09b4\u0005\n"+
		"\u0000\u0000\u09b4\u09f3\u0005\u0004\u0000\u0000\u09b5\u09b6\u0005\b\u0000"+
		"\u0000\u09b6\u09b8\u0005\u0003\u0000\u0000\u09b7\u09b9\u0003 \u0010\u0000"+
		"\u09b8\u09b7\u0001\u0000\u0000\u0000\u09b9\u09ba\u0001\u0000\u0000\u0000"+
		"\u09ba\u09b8\u0001\u0000\u0000\u0000\u09ba\u09bb\u0001\u0000\u0000\u0000"+
		"\u09bb\u09bc\u0001\u0000\u0000\u0000\u09bc\u09e8\u0005\u0004\u0000\u0000"+
		"\u09bd\u09be\u0005\n\u0000\u0000\u09be\u09bf\u0005\u0003\u0000\u0000\u09bf"+
		"\u09c0\u0005\n\u0000\u0000\u09c0\u09c1\u0005\u0003\u0000\u0000\u09c1\u09c2"+
		"\u0005\n\u0000\u0000\u09c2\u09c3\u0005\u0003\u0000\u0000\u09c3\u09c4\u0005"+
		"\n\u0000\u0000\u09c4\u09c5\u0005\u0003\u0000\u0000\u09c5\u09c6\u0005\n"+
		"\u0000\u0000\u09c6\u09c7\u0005\u0003\u0000\u0000\u09c7\u09c8\u0005\n\u0000"+
		"\u0000\u09c8\u09c9\u0005\u0003\u0000\u0000\u09c9\u09ca\u0005\n\u0000\u0000"+
		"\u09ca\u09cb\u0005\u0003\u0000\u0000\u09cb\u09e4\u0005\u0004\u0000\u0000"+
		"\u09cc\u09cd\u0005\u0003\u0000\u0000\u09cd\u09ce\u0005\u0003\u0000\u0000"+
		"\u09ce\u09cf\u0005\u0003\u0000\u0000\u09cf\u09d0\u0005\u0003\u0000\u0000"+
		"\u09d0\u09d1\u0005\u0003\u0000\u0000\u09d1\u09d2\u0005\u0003\u0000\u0000"+
		"\u09d2\u09d3\u0005\u0003\u0000\u0000\u09d3\u09e5\u0005\u0004\u0000\u0000"+
		"\u09d4\u09d5\u0005\u0006\u0000\u0000\u09d5\u09d6\u0005\u0003\u0000\u0000"+
		"\u09d6\u09d7\u0005\b\u0000\u0000\u09d7\u09d8\u0005\u0003\u0000\u0000\u09d8"+
		"\u09d9\u0005\b\u0000\u0000\u09d9\u09da\u0005\u0003\u0000\u0000\u09da\u09db"+
		"\u0005\b\u0000\u0000\u09db\u09dc\u0005\u0003\u0000\u0000\u09dc\u09dd\u0005"+
		"\b\u0000\u0000\u09dd\u09de\u0005\u0003\u0000\u0000\u09de\u09df\u0005\b"+
		"\u0000\u0000\u09df\u09e0\u0005\u0003\u0000\u0000\u09e0\u09e1\u0005\b\u0000"+
		"\u0000\u09e1\u09e2\u0005\u0003\u0000\u0000\u09e2\u09e3\u0005\u0004\u0000"+
		"\u0000\u09e3\u09e5\u0006\n\uffff\uffff\u0000\u09e4\u09cc\u0001\u0000\u0000"+
		"\u0000\u09e4\u09d4\u0001\u0000\u0000\u0000\u09e5\u09e6\u0001\u0000\u0000"+
		"\u0000\u09e6\u09e4\u0001\u0000\u0000\u0000\u09e6\u09e7\u0001\u0000\u0000"+
		"\u0000\u09e7\u09e9\u0001\u0000\u0000\u0000\u09e8\u09bd\u0001\u0000\u0000"+
		"\u0000\u09e9\u09ea\u0001\u0000\u0000\u0000\u09ea\u09e8\u0001\u0000\u0000"+
		"\u0000\u09ea\u09eb\u0001\u0000\u0000\u0000\u09eb\u09ec\u0001\u0000\u0000"+
		"\u0000\u09ec\u09ed\u0005\n\u0000\u0000\u09ed\u09ee\u0005\u0003\u0000\u0000"+
		"\u09ee\u09ef\u0005\n\u0000\u0000\u09ef\u09f0\u0005\u0003\u0000\u0000\u09f0"+
		"\u09f1\u0005\u0006\u0000\u0000\u09f1\u09f2\u0005\u0004\u0000\u0000\u09f2"+
		"\u09f4\u0001\u0000\u0000\u0000\u09f3\u09b5\u0001\u0000\u0000\u0000\u09f4"+
		"\u09f5\u0001\u0000\u0000\u0000\u09f5\u09f3\u0001\u0000\u0000\u0000\u09f5"+
		"\u09f6\u0001\u0000\u0000\u0000\u09f6\u09f7\u0001\u0000\u0000\u0000\u09f7"+
		"\u09f8\u0005\u0005\u0000\u0000\u09f8\u09f9\u0005\u0003\u0000\u0000\u09f9"+
		"\u09fa\u0005\n\u0000\u0000\u09fa\u09fb\u0005\n\u0000\u0000\u09fb\u09fc"+
		"\u0005\u0003\u0000\u0000\u09fc\u09fd\u0005\n\u0000\u0000\u09fd\u09fe\u0005"+
		"\u0003\u0000\u0000\u09fe\u09ff\u0005\n\u0000\u0000\u09ff\u0a00\u0005\u0003"+
		"\u0000\u0000\u0a00\u0a01\u0005\n\u0000\u0000\u0a01\u0a02\u0005\u0004\u0000"+
		"\u0000\u0a02\u0015\u0001\u0000\u0000\u0000\u0a03\u0a04\u0005\u0005\u0000"+
		"\u0000\u0a04\u0a05\u0005\u0003\u0000\u0000\u0a05\u0a06\u0005\n\u0000\u0000"+
		"\u0a06\u0a07\u0005\n\u0000\u0000\u0a07\u0a08\u0005\u0003\u0000\u0000\u0a08"+
		"\u0a09\u0005\n\u0000\u0000\u0a09\u0a0a\u0005\u0003\u0000\u0000\u0a0a\u0a0b"+
		"\u0005\n\u0000\u0000\u0a0b\u0a0c\u0005\u0003\u0000\u0000\u0a0c\u0a0d\u0005"+
		"\n\u0000\u0000\u0a0d\u0a47\u0005\u0004\u0000\u0000\u0a0e\u0a0f\u0005\u0005"+
		"\u0000\u0000\u0a0f\u0a10\u0005\u0003\u0000\u0000\u0a10\u0a11\u0005\b\u0000"+
		"\u0000\u0a11\u0a12\u0005\u0003\u0000\u0000\u0a12\u0a13\u0005\n\u0000\u0000"+
		"\u0a13\u0a14\u0005\u0003\u0000\u0000\u0a14\u0a16\u0003 \u0010\u0000\u0a15"+
		"\u0a17\u0003 \u0010\u0000\u0a16\u0a15\u0001\u0000\u0000\u0000\u0a16\u0a17"+
		"\u0001\u0000\u0000\u0000\u0a17\u0a19\u0001\u0000\u0000\u0000\u0a18\u0a1a"+
		"\u0003 \u0010\u0000\u0a19\u0a18\u0001\u0000\u0000\u0000\u0a19\u0a1a\u0001"+
		"\u0000\u0000\u0000\u0a1a\u0a1c\u0001\u0000\u0000\u0000\u0a1b\u0a1d\u0003"+
		" \u0010\u0000\u0a1c\u0a1b\u0001\u0000\u0000\u0000\u0a1c\u0a1d\u0001\u0000"+
		"\u0000\u0000\u0a1d\u0a1f\u0001\u0000\u0000\u0000\u0a1e\u0a20\u0003 \u0010"+
		"\u0000\u0a1f\u0a1e\u0001\u0000\u0000\u0000\u0a1f\u0a20\u0001\u0000\u0000"+
		"\u0000\u0a20\u0a22\u0001\u0000\u0000\u0000\u0a21\u0a23\u0003 \u0010\u0000"+
		"\u0a22\u0a21\u0001\u0000\u0000\u0000\u0a22\u0a23\u0001\u0000\u0000\u0000"+
		"\u0a23\u0a25\u0001\u0000\u0000\u0000\u0a24\u0a26\u0003 \u0010\u0000\u0a25"+
		"\u0a24\u0001\u0000\u0000\u0000\u0a25\u0a26\u0001\u0000\u0000\u0000\u0a26"+
		"\u0a2a\u0001\u0000\u0000\u0000\u0a27\u0a29\u0003 \u0010\u0000\u0a28\u0a27"+
		"\u0001\u0000\u0000\u0000\u0a29\u0a2c\u0001\u0000\u0000\u0000\u0a2a\u0a28"+
		"\u0001\u0000\u0000\u0000\u0a2a\u0a2b\u0001\u0000\u0000\u0000\u0a2b\u0a2d"+
		"\u0001\u0000\u0000\u0000\u0a2c\u0a2a\u0001\u0000\u0000\u0000\u0a2d\u0a2e"+
		"\u0005\u0004\u0000\u0000\u0a2e\u0a2f\u0005\u0005\u0000\u0000\u0a2f\u0a30"+
		"\u0005\u0003\u0000\u0000\u0a30\u0a31\u0005\t\u0000\u0000\u0a31\u0a32\u0005"+
		"\u0004\u0000\u0000\u0a32\u0a33\u0005\u0005\u0000\u0000\u0a33\u0a34\u0005"+
		"\u0003\u0000\u0000\u0a34\u0a35\u0005\t\u0000\u0000\u0a35\u0a36\u0005\u0004"+
		"\u0000\u0000\u0a36\u0a37\u0005\u0005\u0000\u0000\u0a37\u0a38\u0005\u0003"+
		"\u0000\u0000\u0a38\u0a39\u0005\b\u0000\u0000\u0a39\u0a3a\u0005\n\u0000"+
		"\u0000\u0a3a\u0a3b\u0005\u0004\u0000\u0000\u0a3b\u0a3c\u0005\u0005\u0000"+
		"\u0000\u0a3c\u0a3d\u0005\u0003\u0000\u0000\u0a3d\u0a3e\u0005\u0006\u0000"+
		"\u0000\u0a3e\u0a3f\u0005\u0004\u0000\u0000\u0a3f\u0a40\u0005\n\u0000\u0000"+
		"\u0a40\u0a41\u0005\u0003\u0000\u0000\u0a41\u0a42\u0005\n\u0000\u0000\u0a42"+
		"\u0a43\u0005\u0003\u0000\u0000\u0a43\u0a44\u0005\u0006\u0000\u0000\u0a44"+
		"\u0a45\u0005\u0004\u0000\u0000\u0a45\u0a46\u0006\u000b\uffff\uffff\u0000"+
		"\u0a46\u0a48\u0001\u0000\u0000\u0000\u0a47\u0a0e\u0001\u0000\u0000\u0000"+
		"\u0a48\u0a49\u0001\u0000\u0000\u0000\u0a49\u0a47\u0001\u0000\u0000\u0000"+
		"\u0a49\u0a4a\u0001\u0000\u0000\u0000\u0a4a\u0a4b\u0001\u0000\u0000\u0000"+
		"\u0a4b\u0a4c\u0005\u0005\u0000\u0000\u0a4c\u0a4d\u0005\u0003\u0000\u0000"+
		"\u0a4d\u0a4e\u0005\n\u0000\u0000\u0a4e\u0a4f\u0005\n\u0000\u0000\u0a4f"+
		"\u0a50\u0005\u0003\u0000\u0000\u0a50\u0a51\u0005\n\u0000\u0000\u0a51\u0a52"+
		"\u0005\u0003\u0000\u0000\u0a52\u0a53\u0005\n\u0000\u0000\u0a53\u0a54\u0005"+
		"\u0003\u0000\u0000\u0a54\u0a55\u0005\n\u0000\u0000\u0a55\u0a56\u0005\u0004"+
		"\u0000\u0000\u0a56\u0017\u0001\u0000\u0000\u0000\u0a57\u0a58\u0005\u0005"+
		"\u0000\u0000\u0a58\u0a59\u0005\u0003\u0000\u0000\u0a59\u0a5a\u0005\n\u0000"+
		"\u0000\u0a5a\u0a5b\u0005\u0003\u0000\u0000\u0a5b\u0a5c\u0005\n\u0000\u0000"+
		"\u0a5c\u0a5d\u0005\n\u0000\u0000\u0a5d\u0a5e\u0005\n\u0000\u0000\u0a5e"+
		"\u0a5f\u0005\u0003\u0000\u0000\u0a5f\u0a60\u0005\n\u0000\u0000\u0a60\u0a61"+
		"\u0005\u0003\u0000\u0000\u0a61\u0a62\u0005\n\u0000\u0000\u0a62\u0aa7\u0005"+
		"\u0004\u0000\u0000\u0a63\u0a64\u0005\n\u0000\u0000\u0a64\u0a65\u0005\u0003"+
		"\u0000\u0000\u0a65\u0a66\u0005\u0004\u0000\u0000\u0a66\u0a67\u0005\n\u0000"+
		"\u0000\u0a67\u0a68\u0005\u0003\u0000\u0000\u0a68\u0a69\u0005\n\u0000\u0000"+
		"\u0a69\u0a6a\u0005\u0003\u0000\u0000\u0a6a\u0a6b\u0005\n\u0000\u0000\u0a6b"+
		"\u0a6c\u0005\u0003\u0000\u0000\u0a6c\u0a6d\u0005\n\u0000\u0000\u0a6d\u0a6e"+
		"\u0005\u0003\u0000\u0000\u0a6e\u0a6f\u0005\n\u0000\u0000\u0a6f\u0a70\u0005"+
		"\u0003\u0000\u0000\u0a70\u0a71\u0005\n\u0000\u0000\u0a71\u0a72\u0005\u0003"+
		"\u0000\u0000\u0a72\u0a73\u0005\n\u0000\u0000\u0a73\u0a74\u0005\u0003\u0000"+
		"\u0000\u0a74\u0a75\u0005\n\u0000\u0000\u0a75\u0a76\u0005\u0003\u0000\u0000"+
		"\u0a76\u0a77\u0005\n\u0000\u0000\u0a77\u0a78\u0005\u0003\u0000\u0000\u0a78"+
		"\u0a79\u0005\n\u0000\u0000\u0a79\u0a7a\u0005\u0003\u0000\u0000\u0a7a\u0a7b"+
		"\u0005\n\u0000\u0000\u0a7b\u0a7c\u0005\u0003\u0000\u0000\u0a7c\u0a9c\u0005"+
		"\u0004\u0000\u0000\u0a7d\u0a7e\u0005\n\u0000\u0000\u0a7e\u0a7f\u0005\u0003"+
		"\u0000\u0000\u0a7f\u0a80\u0005\b\u0000\u0000\u0a80\u0a82\u0005\u0003\u0000"+
		"\u0000\u0a81\u0a83\u0005\b\u0000\u0000\u0a82\u0a81\u0001\u0000\u0000\u0000"+
		"\u0a82\u0a83\u0001\u0000\u0000\u0000\u0a83\u0a84\u0001\u0000\u0000\u0000"+
		"\u0a84\u0a86\u0005\u0003\u0000\u0000\u0a85\u0a87\u0003 \u0010\u0000\u0a86"+
		"\u0a85\u0001\u0000\u0000\u0000\u0a87\u0a88\u0001\u0000\u0000\u0000\u0a88"+
		"\u0a86\u0001\u0000\u0000\u0000\u0a88\u0a89\u0001\u0000\u0000\u0000\u0a89"+
		"\u0a8a\u0001\u0000\u0000\u0000\u0a8a\u0a8b\u0005\u0003\u0000\u0000\u0a8b"+
		"\u0a8c\u0005\n\u0000\u0000\u0a8c\u0a8d\u0005\u0003\u0000\u0000\u0a8d\u0a8e"+
		"\u0005\n\u0000\u0000\u0a8e\u0a8f\u0005\u0003\u0000\u0000\u0a8f\u0a90\u0005"+
		"\b\u0000\u0000\u0a90\u0a91\u0005\u0003\u0000\u0000\u0a91\u0a92\u0005\b"+
		"\u0000\u0000\u0a92\u0a93\u0005\u0003\u0000\u0000\u0a93\u0a94\u0005\b\u0000"+
		"\u0000\u0a94\u0a95\u0005\u0003\u0000\u0000\u0a95\u0a96\u0005\b\u0000\u0000"+
		"\u0a96\u0a97\u0005\u0003\u0000\u0000\u0a97\u0a98\u0005\b\u0000\u0000\u0a98"+
		"\u0a99\u0005\u0003\u0000\u0000\u0a99\u0a9a\u0005\u0004\u0000\u0000\u0a9a"+
		"\u0a9b\u0006\f\uffff\uffff\u0000\u0a9b\u0a9d\u0001\u0000\u0000\u0000\u0a9c"+
		"\u0a7d\u0001\u0000\u0000\u0000\u0a9d\u0a9e\u0001\u0000\u0000\u0000\u0a9e"+
		"\u0a9c\u0001\u0000\u0000\u0000\u0a9e\u0a9f\u0001\u0000\u0000\u0000\u0a9f"+
		"\u0aa0\u0001\u0000\u0000\u0000\u0aa0\u0aa1\u0005\n\u0000\u0000\u0aa1\u0aa2"+
		"\u0005\u0003\u0000\u0000\u0aa2\u0aa3\u0005\n\u0000\u0000\u0aa3\u0aa4\u0005"+
		"\u0003\u0000\u0000\u0aa4\u0aa5\u0005\u0006\u0000\u0000\u0aa5\u0aa6\u0005"+
		"\u0004\u0000\u0000\u0aa6\u0aa8\u0001\u0000\u0000\u0000\u0aa7\u0a63\u0001"+
		"\u0000\u0000\u0000\u0aa8\u0aa9\u0001\u0000\u0000\u0000\u0aa9\u0aa7\u0001"+
		"\u0000\u0000\u0000\u0aa9\u0aaa\u0001\u0000\u0000\u0000\u0aaa\u0aab\u0001"+
		"\u0000\u0000\u0000\u0aab\u0aac\u0005\u0005\u0000\u0000\u0aac\u0aad\u0005"+
		"\u0003\u0000\u0000\u0aad\u0aae\u0005\n\u0000\u0000\u0aae\u0aaf\u0005\u0003"+
		"\u0000\u0000\u0aaf\u0ab0\u0005\n\u0000\u0000\u0ab0\u0ab1\u0005\n\u0000"+
		"\u0000\u0ab1\u0ab2\u0005\n\u0000\u0000\u0ab2\u0ab3\u0005\u0003\u0000\u0000"+
		"\u0ab3\u0ab4\u0005\n\u0000\u0000\u0ab4\u0ab5\u0005\u0003\u0000\u0000\u0ab5"+
		"\u0ab6\u0005\n\u0000\u0000\u0ab6\u0ab7\u0005\u0004\u0000\u0000\u0ab7\u0019"+
		"\u0001\u0000\u0000\u0000\u0ab8\u0ab9\u0005\u0005\u0000\u0000\u0ab9\u0aba"+
		"\u0005\u0003\u0000\u0000\u0aba\u0abb\u0005\n\u0000\u0000\u0abb\u0abc\u0005"+
		"\n\u0000\u0000\u0abc\u0abd\u0005\u0003\u0000\u0000\u0abd\u0abe\u0005\n"+
		"\u0000\u0000\u0abe\u0abf\u0005\u0003\u0000\u0000\u0abf\u0ac0\u0005\n\u0000"+
		"\u0000\u0ac0\u0b12\u0005\u0004\u0000\u0000\u0ac1\u0ac2\u0005\u0005\u0000"+
		"\u0000\u0ac2\u0ac3\u0005\u0003\u0000\u0000\u0ac3\u0ac4\u0005\b\u0000\u0000"+
		"\u0ac4\u0ac8\u0005\u0003\u0000\u0000\u0ac5\u0ac7\u0003 \u0010\u0000\u0ac6"+
		"\u0ac5\u0001\u0000\u0000\u0000\u0ac7\u0aca\u0001\u0000\u0000\u0000\u0ac8"+
		"\u0ac6\u0001\u0000\u0000\u0000\u0ac8\u0ac9\u0001\u0000\u0000\u0000\u0ac9"+
		"\u0acb\u0001\u0000\u0000\u0000\u0aca\u0ac8\u0001\u0000\u0000\u0000\u0acb"+
		"\u0acc\u0005\u0004\u0000\u0000\u0acc\u0ace\u0003 \u0010\u0000\u0acd\u0acf"+
		"\u0003 \u0010\u0000\u0ace\u0acd\u0001\u0000\u0000\u0000\u0ace\u0acf\u0001"+
		"\u0000\u0000\u0000\u0acf\u0ad1\u0001\u0000\u0000\u0000\u0ad0\u0ad2\u0003"+
		" \u0010\u0000\u0ad1\u0ad0\u0001\u0000\u0000\u0000\u0ad1\u0ad2\u0001\u0000"+
		"\u0000\u0000\u0ad2\u0ad4\u0001\u0000\u0000\u0000\u0ad3\u0ad5\u0003 \u0010"+
		"\u0000\u0ad4\u0ad3\u0001\u0000\u0000\u0000\u0ad4\u0ad5\u0001\u0000\u0000"+
		"\u0000\u0ad5\u0ad7\u0001\u0000\u0000\u0000\u0ad6\u0ad8\u0003 \u0010\u0000"+
		"\u0ad7\u0ad6\u0001\u0000\u0000\u0000\u0ad7\u0ad8\u0001\u0000\u0000\u0000"+
		"\u0ad8\u0ada\u0001\u0000\u0000\u0000\u0ad9\u0adb\u0003 \u0010\u0000\u0ada"+
		"\u0ad9\u0001\u0000\u0000\u0000\u0ada\u0adb\u0001\u0000\u0000\u0000\u0adb"+
		"\u0add\u0001\u0000\u0000\u0000\u0adc\u0ade\u0003 \u0010\u0000\u0add\u0adc"+
		"\u0001\u0000\u0000\u0000\u0add\u0ade\u0001\u0000\u0000\u0000\u0ade\u0ae2"+
		"\u0001\u0000\u0000\u0000\u0adf\u0ae1\u0003 \u0010\u0000\u0ae0\u0adf\u0001"+
		"\u0000\u0000\u0000\u0ae1\u0ae4\u0001\u0000\u0000\u0000\u0ae2\u0ae0\u0001"+
		"\u0000\u0000\u0000\u0ae2\u0ae3\u0001\u0000\u0000\u0000\u0ae3\u0ae5\u0001"+
		"\u0000\u0000\u0000\u0ae4\u0ae2\u0001\u0000\u0000\u0000\u0ae5\u0ae6\u0005"+
		"\u0004\u0000\u0000\u0ae6\u0ae8\u0003 \u0010\u0000\u0ae7\u0ae9\u0003 \u0010"+
		"\u0000\u0ae8\u0ae7\u0001\u0000\u0000\u0000\u0ae8\u0ae9\u0001\u0000\u0000"+
		"\u0000\u0ae9\u0aeb\u0001\u0000\u0000\u0000\u0aea\u0aec\u0003 \u0010\u0000"+
		"\u0aeb\u0aea\u0001\u0000\u0000\u0000\u0aeb\u0aec\u0001\u0000\u0000\u0000"+
		"\u0aec\u0aee\u0001\u0000\u0000\u0000\u0aed\u0aef\u0003 \u0010\u0000\u0aee"+
		"\u0aed\u0001\u0000\u0000\u0000\u0aee\u0aef\u0001\u0000\u0000\u0000\u0aef"+
		"\u0af1\u0001\u0000\u0000\u0000\u0af0\u0af2\u0003 \u0010\u0000\u0af1\u0af0"+
		"\u0001\u0000\u0000\u0000\u0af1\u0af2\u0001\u0000\u0000\u0000\u0af2\u0af4"+
		"\u0001\u0000\u0000\u0000\u0af3\u0af5\u0003 \u0010\u0000\u0af4\u0af3\u0001"+
		"\u0000\u0000\u0000\u0af4\u0af5\u0001\u0000\u0000\u0000\u0af5\u0af7\u0001"+
		"\u0000\u0000\u0000\u0af6\u0af8\u0003 \u0010\u0000\u0af7\u0af6\u0001\u0000"+
		"\u0000\u0000\u0af7\u0af8\u0001\u0000\u0000\u0000\u0af8\u0afc\u0001\u0000"+
		"\u0000\u0000\u0af9\u0afb\u0003 \u0010\u0000\u0afa\u0af9\u0001\u0000\u0000"+
		"\u0000\u0afb\u0afe\u0001\u0000\u0000\u0000\u0afc\u0afa\u0001\u0000\u0000"+
		"\u0000\u0afc\u0afd\u0001\u0000\u0000\u0000\u0afd\u0aff\u0001\u0000\u0000"+
		"\u0000\u0afe\u0afc\u0001\u0000\u0000\u0000\u0aff\u0b00\u0005\u0004\u0000"+
		"\u0000\u0b00\u0b04\u0005\u0006\u0000\u0000\u0b01\u0b03\u0005\n\u0000\u0000"+
		"\u0b02\u0b01\u0001\u0000\u0000\u0000\u0b03\u0b06\u0001\u0000\u0000\u0000"+
		"\u0b04\u0b02\u0001\u0000\u0000\u0000\u0b04\u0b05\u0001\u0000\u0000\u0000"+
		"\u0b05\u0b07\u0001\u0000\u0000\u0000\u0b06\u0b04\u0001\u0000\u0000\u0000"+
		"\u0b07\u0b08\u0005\u0004\u0000\u0000\u0b08\u0b09\u0003 \u0010\u0000\u0b09"+
		"\u0b0a\u0005\u0004\u0000\u0000\u0b0a\u0b0b\u0005\n\u0000\u0000\u0b0b\u0b0c"+
		"\u0005\u0003\u0000\u0000\u0b0c\u0b0d\u0005\n\u0000\u0000\u0b0d\u0b0e\u0005"+
		"\u0003\u0000\u0000\u0b0e\u0b0f\u0005\u0006\u0000\u0000\u0b0f\u0b10\u0005"+
		"\u0004\u0000\u0000\u0b10\u0b11\u0006\r\uffff\uffff\u0000\u0b11\u0b13\u0001"+
		"\u0000\u0000\u0000\u0b12\u0ac1\u0001\u0000\u0000\u0000\u0b13\u0b14\u0001"+
		"\u0000\u0000\u0000\u0b14\u0b12\u0001\u0000\u0000\u0000\u0b14\u0b15\u0001"+
		"\u0000\u0000\u0000\u0b15\u0b16\u0001\u0000\u0000\u0000\u0b16\u0b17\u0005"+
		"\u0005\u0000\u0000\u0b17\u0b18\u0005\u0003\u0000\u0000\u0b18\u0b19\u0005"+
		"\n\u0000\u0000\u0b19\u0b1a\u0005\n\u0000\u0000\u0b1a\u0b1b\u0005\u0003"+
		"\u0000\u0000\u0b1b\u0b1c\u0005\n\u0000\u0000\u0b1c\u0b1d\u0005\u0003\u0000"+
		"\u0000\u0b1d\u0b1e\u0005\n\u0000\u0000\u0b1e\u0b1f\u0005\u0004\u0000\u0000"+
		"\u0b1f\u001b\u0001\u0000\u0000\u0000\u0b20\u0b21\u0005\u0005\u0000\u0000"+
		"\u0b21\u0b22\u0005\u0003\u0000\u0000\u0b22\u0b23\u0005\n\u0000\u0000\u0b23"+
		"\u0b24\u0005\n\u0000\u0000\u0b24\u0b25\u0005\n\u0000\u0000\u0b25\u0b26"+
		"\u0005\u0003\u0000\u0000\u0b26\u0b27\u0005\n\u0000\u0000\u0b27\u0b28\u0005"+
		"\n\u0000\u0000\u0b28\u0b29\u0005\n\u0000\u0000\u0b29\u0b2a\u0005\u0003"+
		"\u0000\u0000\u0b2a\u0b2b\u0005\n\u0000\u0000\u0b2b\u0b2c\u0005\u0003\u0000"+
		"\u0000\u0b2c\u0b2d\u0005\n\u0000\u0000\u0b2d\u0b96\u0005\u0004\u0000\u0000"+
		"\u0b2e\u0b2f\u0005\n\u0000\u0000\u0b2f\u0b31\u0005\u0003\u0000\u0000\u0b30"+
		"\u0b32\u0005\n\u0000\u0000\u0b31\u0b30\u0001\u0000\u0000\u0000\u0b31\u0b32"+
		"\u0001\u0000\u0000\u0000\u0b32\u0b33\u0001\u0000\u0000\u0000\u0b33\u0b34"+
		"\u0005\u0003\u0000\u0000\u0b34\u0b35\u0005\n\u0000\u0000\u0b35\u0b36\u0005"+
		"\u0003\u0000\u0000\u0b36\u0b37\u0005\n\u0000\u0000\u0b37\u0b38\u0005\u0003"+
		"\u0000\u0000\u0b38\u0b39\u0005\n\u0000\u0000\u0b39\u0b3a\u0005\u0003\u0000"+
		"\u0000\u0b3a\u0b3b\u0005\n\u0000\u0000\u0b3b\u0b3c\u0005\u0003\u0000\u0000"+
		"\u0b3c\u0b3d\u0005\n\u0000\u0000\u0b3d\u0b3e\u0005\u0003\u0000\u0000\u0b3e"+
		"\u0b3f\u0005\n\u0000\u0000\u0b3f\u0b40\u0005\u0003\u0000\u0000\u0b40\u0b41"+
		"\u0005\n\u0000\u0000\u0b41\u0b42\u0005\u0003\u0000\u0000\u0b42\u0b43\u0005"+
		"\n\u0000\u0000\u0b43\u0b44\u0005\u0003\u0000\u0000\u0b44\u0b8c\u0005\u0004"+
		"\u0000\u0000\u0b45\u0b46\u0005\u0003\u0000\u0000\u0b46\u0b47\u0005\u0003"+
		"\u0000\u0000\u0b47\u0b48\u0005\u0003\u0000\u0000\u0b48\u0b49\u0005\u0003"+
		"\u0000\u0000\u0b49\u0b4a\u0005\u0003\u0000\u0000\u0b4a\u0b4b\u0005\u0003"+
		"\u0000\u0000\u0b4b\u0b4c\u0005\u0003\u0000\u0000\u0b4c\u0b4d\u0005\u0003"+
		"\u0000\u0000\u0b4d\u0b4e\u0005\u0003\u0000\u0000\u0b4e\u0b4f\u0005\u0003"+
		"\u0000\u0000\u0b4f\u0b8d\u0005\u0004\u0000\u0000\u0b50\u0b52\u0003 \u0010"+
		"\u0000\u0b51\u0b53\u0003 \u0010\u0000\u0b52\u0b51\u0001\u0000\u0000\u0000"+
		"\u0b52\u0b53\u0001\u0000\u0000\u0000\u0b53\u0b55\u0001\u0000\u0000\u0000"+
		"\u0b54\u0b56\u0003 \u0010\u0000\u0b55\u0b54\u0001\u0000\u0000\u0000\u0b55"+
		"\u0b56\u0001\u0000\u0000\u0000\u0b56\u0b58\u0001\u0000\u0000\u0000\u0b57"+
		"\u0b59\u0003 \u0010\u0000\u0b58\u0b57\u0001\u0000\u0000\u0000\u0b58\u0b59"+
		"\u0001\u0000\u0000\u0000\u0b59\u0b5b\u0001\u0000\u0000\u0000\u0b5a\u0b5c"+
		"\u0003 \u0010\u0000\u0b5b\u0b5a\u0001\u0000\u0000\u0000\u0b5b\u0b5c\u0001"+
		"\u0000\u0000\u0000\u0b5c\u0b5e\u0001\u0000\u0000\u0000\u0b5d\u0b5f\u0003"+
		" \u0010\u0000\u0b5e\u0b5d\u0001\u0000\u0000\u0000\u0b5e\u0b5f\u0001\u0000"+
		"\u0000\u0000\u0b5f\u0b61\u0001\u0000\u0000\u0000\u0b60\u0b62\u0003 \u0010"+
		"\u0000\u0b61\u0b60\u0001\u0000\u0000\u0000\u0b61\u0b62\u0001\u0000\u0000"+
		"\u0000\u0b62\u0b66\u0001\u0000\u0000\u0000\u0b63\u0b65\u0003 \u0010\u0000"+
		"\u0b64\u0b63\u0001\u0000\u0000\u0000\u0b65\u0b68\u0001\u0000\u0000\u0000"+
		"\u0b66\u0b64\u0001\u0000\u0000\u0000\u0b66\u0b67\u0001\u0000\u0000\u0000"+
		"\u0b67\u0b69\u0001\u0000\u0000\u0000\u0b68\u0b66\u0001\u0000\u0000\u0000"+
		"\u0b69\u0b6a\u0005\u0003\u0000\u0000\u0b6a\u0b6b\u0005\n\u0000\u0000\u0b6b"+
		"\u0b6c\u0005\u0003\u0000\u0000\u0b6c\u0b6d\u0005\n\u0000\u0000\u0b6d\u0b71"+
		"\u0005\u0003\u0000\u0000\u0b6e\u0b70\u0003 \u0010\u0000\u0b6f\u0b6e\u0001"+
		"\u0000\u0000\u0000\u0b70\u0b73\u0001\u0000\u0000\u0000\u0b71\u0b6f\u0001"+
		"\u0000\u0000\u0000\u0b71\u0b72\u0001\u0000\u0000\u0000\u0b72\u0b74\u0001"+
		"\u0000\u0000\u0000\u0b73\u0b71\u0001\u0000\u0000\u0000\u0b74\u0b76\u0005"+
		"\u0003\u0000\u0000\u0b75\u0b77\u0005\u0006\u0000\u0000\u0b76\u0b75\u0001"+
		"\u0000\u0000\u0000\u0b76\u0b77\u0001\u0000\u0000\u0000\u0b77\u0b78\u0001"+
		"\u0000\u0000\u0000\u0b78\u0b79\u0005\u0003\u0000\u0000\u0b79\u0b7a\u0005"+
		"\u0006\u0000\u0000\u0b7a\u0b7c\u0005\u0003\u0000\u0000\u0b7b\u0b7d\u0005"+
		"\n\u0000\u0000\u0b7c\u0b7b\u0001\u0000\u0000\u0000\u0b7c\u0b7d\u0001\u0000"+
		"\u0000\u0000\u0b7d\u0b7e\u0001\u0000\u0000\u0000\u0b7e\u0b7f\u0005\u0003"+
		"\u0000\u0000\u0b7f\u0b80\u0005\b\u0000\u0000\u0b80\u0b82\u0005\u0003\u0000"+
		"\u0000\u0b81\u0b83\u0005\b\u0000\u0000\u0b82\u0b81\u0001\u0000\u0000\u0000"+
		"\u0b82\u0b83\u0001\u0000\u0000\u0000\u0b83\u0b84\u0001\u0000\u0000\u0000"+
		"\u0b84\u0b86\u0005\u0003\u0000\u0000\u0b85\u0b87\u0005\b\u0000\u0000\u0b86"+
		"\u0b85\u0001\u0000\u0000\u0000\u0b86\u0b87\u0001\u0000\u0000\u0000\u0b87"+
		"\u0b88\u0001\u0000\u0000\u0000\u0b88\u0b89\u0005\u0003\u0000\u0000\u0b89"+
		"\u0b8a\u0005\u0004\u0000\u0000\u0b8a\u0b8b\u0006\u000e\uffff\uffff\u0000"+
		"\u0b8b\u0b8d\u0001\u0000\u0000\u0000\u0b8c\u0b45\u0001\u0000\u0000\u0000"+
		"\u0b8c\u0b50\u0001\u0000\u0000\u0000\u0b8d\u0b8e\u0001\u0000\u0000\u0000"+
		"\u0b8e\u0b8c\u0001\u0000\u0000\u0000\u0b8e\u0b8f\u0001\u0000\u0000\u0000"+
		"\u0b8f\u0b90\u0001\u0000\u0000\u0000\u0b90\u0b91\u0005\n\u0000\u0000\u0b91"+
		"\u0b92\u0005\u0003\u0000\u0000\u0b92\u0b93\u0005\n\u0000\u0000\u0b93\u0b94"+
		"\u0005\u0003\u0000\u0000\u0b94\u0b95\u0005\u0006\u0000\u0000\u0b95\u0b97"+
		"\u0005\u0004\u0000\u0000\u0b96\u0b2e\u0001\u0000\u0000\u0000\u0b97\u0b98"+
		"\u0001\u0000\u0000\u0000\u0b98\u0b96\u0001\u0000\u0000\u0000\u0b98\u0b99"+
		"\u0001\u0000\u0000\u0000\u0b99\u0b9a\u0001\u0000\u0000\u0000\u0b9a\u0b9b"+
		"\u0005\u0005\u0000\u0000\u0b9b\u0b9c\u0005\u0003\u0000\u0000\u0b9c\u0b9d"+
		"\u0005\n\u0000\u0000\u0b9d\u0b9e\u0005\n\u0000\u0000\u0b9e\u0b9f\u0005"+
		"\n\u0000\u0000\u0b9f\u0ba0\u0005\u0003\u0000\u0000\u0ba0\u0ba1\u0005\n"+
		"\u0000\u0000\u0ba1\u0ba2\u0005\n\u0000\u0000\u0ba2\u0ba3\u0005\n\u0000"+
		"\u0000\u0ba3\u0ba4\u0005\u0003\u0000\u0000\u0ba4\u0ba5\u0005\n\u0000\u0000"+
		"\u0ba5\u0ba6\u0005\u0003\u0000\u0000\u0ba6\u0ba7\u0005\n\u0000\u0000\u0ba7"+
		"\u0ba8\u0005\u0004\u0000\u0000\u0ba8\u001d\u0001\u0000\u0000\u0000\u0ba9"+
		"\u0baa\u0005\u0005\u0000\u0000\u0baa\u0bab\u0005\u0003\u0000\u0000\u0bab"+
		"\u0bac\u0005\n\u0000\u0000\u0bac\u0bad\u0005\u0003\u0000\u0000\u0bad\u0bae"+
		"\u0005\n\u0000\u0000\u0bae\u0baf\u0005\n\u0000\u0000\u0baf\u0bb0\u0005"+
		"\n\u0000\u0000\u0bb0\u0bb1\u0005\u0003\u0000\u0000\u0bb1\u0bb2\u0005\n"+
		"\u0000\u0000\u0bb2\u0bb3\u0005\u0003\u0000\u0000\u0bb3\u0bb4\u0005\n\u0000"+
		"\u0000\u0bb4\u0c33\u0005\u0004\u0000\u0000\u0bb5\u0bb6\u0005\n\u0000\u0000"+
		"\u0bb6\u0bb7\u0005\u0003\u0000\u0000\u0bb7\u0bb8\u0005\n\u0000\u0000\u0bb8"+
		"\u0bb9\u0005\u0004\u0000\u0000\u0bb9\u0bba\u0005\n\u0000\u0000\u0bba\u0bbb"+
		"\u0005\u0003\u0000\u0000\u0bbb\u0bbc\u0005\n\u0000\u0000\u0bbc\u0bbd\u0005"+
		"\u0004\u0000\u0000\u0bbd\u0bbe\u0005\n\u0000\u0000\u0bbe\u0bbf\u0005\u0003"+
		"\u0000\u0000\u0bbf\u0bc0\u0005\n\u0000\u0000\u0bc0\u0bc1\u0005\u0003\u0000"+
		"\u0000\u0bc1\u0bc2\u0005\n\u0000\u0000\u0bc2\u0bc3\u0005\u0003\u0000\u0000"+
		"\u0bc3\u0bc4\u0005\n\u0000\u0000\u0bc4\u0bc5\u0005\u0003\u0000\u0000\u0bc5"+
		"\u0bc6\u0005\n\u0000\u0000\u0bc6\u0bc7\u0005\u0003\u0000\u0000\u0bc7\u0bc8"+
		"\u0005\n\u0000\u0000\u0bc8\u0bc9\u0005\u0003\u0000\u0000\u0bc9\u0bca\u0005"+
		"\n\u0000\u0000\u0bca\u0bcb\u0005\u0003\u0000\u0000\u0bcb\u0bcc\u0005\n"+
		"\u0000\u0000\u0bcc\u0bcd\u0005\u0003\u0000\u0000\u0bcd\u0bce\u0005\n\u0000"+
		"\u0000\u0bce\u0bcf\u0005\u0003\u0000\u0000\u0bcf\u0bd0\u0005\n\u0000\u0000"+
		"\u0bd0\u0bd1\u0005\u0003\u0000\u0000\u0bd1\u0bd2\u0005\n\u0000\u0000\u0bd2"+
		"\u0bd3\u0005\u0003\u0000\u0000\u0bd3\u0bd4\u0005\n\u0000\u0000\u0bd4\u0bd5"+
		"\u0005\u0003\u0000\u0000\u0bd5\u0bd6\u0005\u0004\u0000\u0000\u0bd6\u0bd7"+
		"\u0005\n\u0000\u0000\u0bd7\u0bd8\u0005\u0003\u0000\u0000\u0bd8\u0bd9\u0005"+
		"\n\u0000\u0000\u0bd9\u0bda\u0005\u0003\u0000\u0000\u0bda\u0bdb\u0005\n"+
		"\u0000\u0000\u0bdb\u0bdc\u0005\u0003\u0000\u0000\u0bdc\u0bdd\u0005\n\u0000"+
		"\u0000\u0bdd\u0bde\u0005\u0003\u0000\u0000\u0bde\u0bdf\u0005\n\u0000\u0000"+
		"\u0bdf\u0be0\u0005\u0003\u0000\u0000\u0be0\u0be1\u0005\n\u0000\u0000\u0be1"+
		"\u0be2\u0005\u0003\u0000\u0000\u0be2\u0c25\u0005\u0004\u0000\u0000\u0be3"+
		"\u0be4\u0005\u0003\u0000\u0000\u0be4\u0be5\u0005\u0003\u0000\u0000\u0be5"+
		"\u0be6\u0005\u0003\u0000\u0000\u0be6\u0be7\u0005\u0003\u0000\u0000\u0be7"+
		"\u0be8\u0005\u0003\u0000\u0000\u0be8\u0be9\u0005\u0003\u0000\u0000\u0be9"+
		"\u0bea\u0005\u0003\u0000\u0000\u0bea\u0beb\u0005\u0003\u0000\u0000\u0beb"+
		"\u0bec\u0005\u0003\u0000\u0000\u0bec\u0bed\u0005\u0003\u0000\u0000\u0bed"+
		"\u0bee\u0005\u0003\u0000\u0000\u0bee\u0bef\u0005\u0003\u0000\u0000\u0bef"+
		"\u0bf0\u0005\u0003\u0000\u0000\u0bf0\u0bf1\u0005\u0003\u0000\u0000\u0bf1"+
		"\u0bf2\u0005\u0003\u0000\u0000\u0bf2\u0bf3\u0005\u0003\u0000\u0000\u0bf3"+
		"\u0bf4\u0005\u0003\u0000\u0000\u0bf4\u0c26\u0005\u0004\u0000\u0000\u0bf5"+
		"\u0bf6\u0005\u0006\u0000\u0000\u0bf6\u0bf8\u0005\u0003\u0000\u0000\u0bf7"+
		"\u0bf9\u0005\u0006\u0000\u0000\u0bf8\u0bf7\u0001\u0000\u0000\u0000\u0bf8"+
		"\u0bf9\u0001\u0000\u0000\u0000\u0bf9\u0bfa\u0001\u0000\u0000\u0000\u0bfa"+
		"\u0bfc\u0005\u0003\u0000\u0000\u0bfb\u0bfd\u0005\u0006\u0000\u0000\u0bfc"+
		"\u0bfb\u0001\u0000\u0000\u0000\u0bfc\u0bfd\u0001\u0000\u0000\u0000\u0bfd"+
		"\u0bfe\u0001\u0000\u0000\u0000\u0bfe\u0bff\u0005\u0003\u0000\u0000\u0bff"+
		"\u0c00\u0005\b\u0000\u0000\u0c00\u0c02\u0005\u0003\u0000\u0000\u0c01\u0c03"+
		"\u0003 \u0010\u0000\u0c02\u0c01\u0001\u0000\u0000\u0000\u0c03\u0c04\u0001"+
		"\u0000\u0000\u0000\u0c04\u0c02\u0001\u0000\u0000\u0000\u0c04\u0c05\u0001"+
		"\u0000\u0000\u0000\u0c05\u0c06\u0001\u0000\u0000\u0000\u0c06\u0c07\u0005"+
		"\u0003\u0000\u0000\u0c07\u0c08\u0005\n\u0000\u0000\u0c08\u0c09\u0005\u0003"+
		"\u0000\u0000\u0c09\u0c0a\u0005\n\u0000\u0000\u0c0a\u0c0b\u0005\u0003\u0000"+
		"\u0000\u0c0b\u0c0c\u0005\n\u0000\u0000\u0c0c\u0c0d\u0005\u0003\u0000\u0000"+
		"\u0c0d\u0c0e\u0005\n\u0000\u0000\u0c0e\u0c0f\u0005\u0003\u0000\u0000\u0c0f"+
		"\u0c10\u0005\b\u0000\u0000\u0c10\u0c12\u0005\u0003\u0000\u0000\u0c11\u0c13"+
		"\u0005\b\u0000\u0000\u0c12\u0c11\u0001\u0000\u0000\u0000\u0c12\u0c13\u0001"+
		"\u0000\u0000\u0000\u0c13\u0c14\u0001\u0000\u0000\u0000\u0c14\u0c15\u0005"+
		"\u0003\u0000\u0000\u0c15\u0c16\u0005\b\u0000\u0000\u0c16\u0c17\u0005\u0003"+
		"\u0000\u0000\u0c17\u0c18\u0005\b\u0000\u0000\u0c18\u0c1a\u0005\u0003\u0000"+
		"\u0000\u0c19\u0c1b\u0005\b\u0000\u0000\u0c1a\u0c19\u0001\u0000\u0000\u0000"+
		"\u0c1a\u0c1b\u0001\u0000\u0000\u0000\u0c1b\u0c1c\u0001\u0000\u0000\u0000"+
		"\u0c1c\u0c1d\u0005\u0003\u0000\u0000\u0c1d\u0c1e\u0005\u0003\u0000\u0000"+
		"\u0c1e\u0c1f\u0005\b\u0000\u0000\u0c1f\u0c20\u0005\u0003\u0000\u0000\u0c20"+
		"\u0c21\u0005\b\u0000\u0000\u0c21\u0c22\u0005\u0003\u0000\u0000\u0c22\u0c23"+
		"\u0005\u0004\u0000\u0000\u0c23\u0c24\u0006\u000f\uffff\uffff\u0000\u0c24"+
		"\u0c26\u0001\u0000\u0000\u0000\u0c25\u0be3\u0001\u0000\u0000\u0000\u0c25"+
		"\u0bf5\u0001\u0000\u0000\u0000\u0c26\u0c27\u0001\u0000\u0000\u0000\u0c27"+
		"\u0c25\u0001\u0000\u0000\u0000\u0c27\u0c28\u0001\u0000\u0000\u0000\u0c28"+
		"\u0c2a\u0001\u0000\u0000\u0000\u0c29\u0bb5\u0001\u0000\u0000\u0000\u0c2a"+
		"\u0c2b\u0001\u0000\u0000\u0000\u0c2b\u0c29\u0001\u0000\u0000\u0000\u0c2b"+
		"\u0c2c\u0001\u0000\u0000\u0000\u0c2c\u0c2d\u0001\u0000\u0000\u0000\u0c2d"+
		"\u0c2e\u0005\n\u0000\u0000\u0c2e\u0c2f\u0005\u0003\u0000\u0000\u0c2f\u0c30"+
		"\u0005\n\u0000\u0000\u0c30\u0c31\u0005\u0003\u0000\u0000\u0c31\u0c32\u0005"+
		"\u0006\u0000\u0000\u0c32\u0c34\u0005\u0004\u0000\u0000\u0c33\u0c29\u0001"+
		"\u0000\u0000\u0000\u0c34\u0c35\u0001\u0000\u0000\u0000\u0c35\u0c33\u0001"+
		"\u0000\u0000\u0000\u0c35\u0c36\u0001\u0000\u0000\u0000\u0c36\u0c37\u0001"+
		"\u0000\u0000\u0000\u0c37\u0c38\u0005\u0005\u0000\u0000\u0c38\u0c39\u0005"+
		"\u0003\u0000\u0000\u0c39\u0c3a\u0005\n\u0000\u0000\u0c3a\u0c3b\u0005\u0003"+
		"\u0000\u0000\u0c3b\u0c3c\u0005\n\u0000\u0000\u0c3c\u0c3d\u0005\n\u0000"+
		"\u0000\u0c3d\u0c3e\u0005\n\u0000\u0000\u0c3e\u0c3f\u0005\u0003\u0000\u0000"+
		"\u0c3f\u0c40\u0005\n\u0000\u0000\u0c40\u0c41\u0005\u0003\u0000\u0000\u0c41"+
		"\u0c42\u0005\n\u0000\u0000\u0c42\u0c43\u0005\u0004\u0000\u0000\u0c43\u001f"+
		"\u0001\u0000\u0000\u0000\u0c44\u0c45\u0007\u0000\u0000\u0000\u0c45!\u0001"+
		"\u0000\u0000\u0000\u0c46\u0c49\u0003 \u0010\u0000\u0c47\u0c49\u0005\u0003"+
		"\u0000\u0000\u0c48\u0c46\u0001\u0000\u0000\u0000\u0c48\u0c47\u0001\u0000"+
		"\u0000\u0000\u0c49\u0c4a\u0001\u0000\u0000\u0000\u0c4a\u0c48\u0001\u0000"+
		"\u0000\u0000\u0c4a\u0c4b\u0001\u0000\u0000\u0000\u0c4b\u0c4c\u0001\u0000"+
		"\u0000\u0000\u0c4c\u0c4d\u0005\u0004\u0000\u0000\u0c4d#\u0001\u0000\u0000"+
		"\u0000\u0c4e\u0c52\u0003 \u0010\u0000\u0c4f\u0c52\u0005\u0003\u0000\u0000"+
		"\u0c50\u0c52\u0005\u0004\u0000\u0000\u0c51\u0c4e\u0001\u0000\u0000\u0000"+
		"\u0c51\u0c4f\u0001\u0000\u0000\u0000\u0c51\u0c50\u0001\u0000\u0000\u0000"+
		"\u0c52\u0c53\u0001\u0000\u0000\u0000\u0c53\u0c51\u0001\u0000\u0000\u0000"+
		"\u0c53\u0c54\u0001\u0000\u0000\u0000\u0c54%\u0001\u0000\u0000\u0000\u00d7"+
		"5JMPSVY^e\u0093\u0096\u0099\u009c\u009f\u00a2\u00a7\u00e9\u00ec\u00ef"+
		"\u00f2\u00f5\u00f8\u00fd\u0104\u014c\u014f\u0152\u0155\u0158\u015b\u0160"+
		"\u0216\u021e\u0221\u0224\u0227\u022a\u022d\u0232\u023e\u024a\u0252\u025a"+
		"\u027b\u0291\u029c\u0403\u040c\u040f\u0412\u0415\u0418\u041b\u0420\u042b"+
		"\u0446\u0453\u046a\u0475\u04ca\u04cd\u04d0\u04d3\u04d6\u04d9\u04de\u0531"+
		"\u0554\u0557\u055a\u055d\u0560\u0563\u0568\u057b\u057d\u0588\u06dd\u06e0"+
		"\u06e3\u06e6\u06e9\u06ec\u06f1\u06fd\u0706\u0753\u0756\u0759\u075c\u075f"+
		"\u0762\u0767\u077a\u077c\u0787\u07de\u0827\u082a\u082d\u0830\u0833\u0836"+
		"\u083b\u084a\u084c\u0850\u0858\u085a\u0898\u089b\u089e\u08a1\u08a4\u08a7"+
		"\u08ac\u08b4\u08b7\u08ba\u08bd\u08c0\u08c3\u08c8\u08d5\u08de\u08e8\u08f3"+
		"\u0912\u0919\u091c\u091f\u0922\u0925\u0928\u092d\u0935\u0938\u093b\u093e"+
		"\u0941\u0944\u0949\u096e\u0972\u0976\u097a\u097e\u0986\u098b\u098d\u0991"+
		"\u099c\u09ba\u09e4\u09e6\u09ea\u09f5\u0a16\u0a19\u0a1c\u0a1f\u0a22\u0a25"+
		"\u0a2a\u0a49\u0a82\u0a88\u0a9e\u0aa9\u0ac8\u0ace\u0ad1\u0ad4\u0ad7\u0ada"+
		"\u0add\u0ae2\u0ae8\u0aeb\u0aee\u0af1\u0af4\u0af7\u0afc\u0b04\u0b14\u0b31"+
		"\u0b52\u0b55\u0b58\u0b5b\u0b5e\u0b61\u0b66\u0b71\u0b76\u0b7c\u0b82\u0b86"+
		"\u0b8c\u0b8e\u0b98\u0bf8\u0bfc\u0c04\u0c12\u0c1a\u0c25\u0c27\u0c2b\u0c35"+
		"\u0c48\u0c4a\u0c51\u0c53";
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