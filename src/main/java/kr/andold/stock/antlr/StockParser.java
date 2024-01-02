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
		RULE_stockDocument = 0, RULE_crawlItemEtf = 1, RULE_crawlPriceEtf = 2, 
		RULE_crawlPriceCompany = 3, RULE_crawlItemDetailCompanyThread = 4, RULE_crawlItemDividendTopCompany = 5, 
		RULE_crawlEtfDetailThread = 6, RULE_crawlDividendHistoryEtfThread = 7, 
		RULE_crawlDividendHistoryCompanyThread = 8, RULE_word = 9, RULE_line = 10, 
		RULE_eof = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"stockDocument", "crawlItemEtf", "crawlPriceEtf", "crawlPriceCompany", 
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
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				crawlDividendHistoryCompanyThread();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				crawlDividendHistoryEtfThread();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				crawlItemDividendTopCompany();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				crawlItemEtf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(28);
				crawlItemDetailCompanyThread();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(29);
				crawlEtfDetailThread();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(30);
				crawlPriceCompany();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(31);
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
		enterRule(_localctx, 2, RULE_crawlItemEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(KEYWORD);
			setState(35);
			match(TAB);
			setState(36);
			match(WORD);
			setState(37);
			match(TAB);
			setState(38);
			match(WORD);
			setState(39);
			match(WORD);
			setState(40);
			match(WORD);
			setState(41);
			match(TAB);
			setState(42);
			match(WORD);
			setState(43);
			match(TAB);
			setState(44);
			match(WORD);
			setState(45);
			match(NEWLINE);
			setState(174); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				match(WORD);
				setState(47);
				match(TAB);
				setState(48);
				match(NEWLINE);
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
				match(TAB);
				setState(55);
				match(TAB);
				setState(56);
				match(WORD);
				setState(57);
				match(TAB);
				setState(58);
				match(WORD);
				setState(59);
				match(TAB);
				setState(60);
				match(WORD);
				setState(61);
				match(TAB);
				setState(62);
				match(WORD);
				setState(63);
				match(NEWLINE);
				setState(64);
				match(WORD);
				setState(65);
				match(TAB);
				setState(66);
				match(TAB);
				setState(67);
				match(TAB);
				setState(68);
				match(WORD);
				setState(69);
				match(TAB);
				setState(70);
				match(TAB);
				setState(71);
				match(TAB);
				setState(72);
				match(TAB);
				setState(73);
				match(TAB);
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
				setState(163); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(80);
						((CrawlItemEtfContext)_localctx).type = match(WORD);
						setState(81);
						match(TAB);
						setState(82);
						match(TAB);
						setState(83);
						((CrawlItemEtfContext)_localctx).symbol = word();
						setState(85);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
						case 1:
							{
							setState(84);
							((CrawlItemEtfContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(88);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
						case 1:
							{
							setState(87);
							((CrawlItemEtfContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(91);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
						case 1:
							{
							setState(90);
							((CrawlItemEtfContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(94);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							setState(93);
							((CrawlItemEtfContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(97);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
						case 1:
							{
							setState(96);
							((CrawlItemEtfContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(100);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
						case 1:
							{
							setState(99);
							((CrawlItemEtfContext)_localctx).symbol6 = word();
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
							((CrawlItemEtfContext)_localctx).symbol7 = word();
							}
							}
							setState(107);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(108);
						match(TAB);
						setState(109);
						((CrawlItemEtfContext)_localctx).code = match(NUMBER);
						setState(110);
						match(TAB);
						setState(111);
						((CrawlItemEtfContext)_localctx).category = word();
						setState(113);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
						case 1:
							{
							setState(112);
							((CrawlItemEtfContext)_localctx).category1 = word();
							}
							break;
						}
						setState(116);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
						case 1:
							{
							setState(115);
							((CrawlItemEtfContext)_localctx).category2 = word();
							}
							break;
						}
						setState(119);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
						case 1:
							{
							setState(118);
							((CrawlItemEtfContext)_localctx).category3 = word();
							}
							break;
						}
						setState(122);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
						case 1:
							{
							setState(121);
							((CrawlItemEtfContext)_localctx).category4 = word();
							}
							break;
						}
						setState(125);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
						case 1:
							{
							setState(124);
							((CrawlItemEtfContext)_localctx).category5 = word();
							}
							break;
						}
						setState(128);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
						case 1:
							{
							setState(127);
							((CrawlItemEtfContext)_localctx).category6 = word();
							}
							break;
						}
						setState(133);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(130);
							((CrawlItemEtfContext)_localctx).category7 = word();
							}
							}
							setState(135);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(136);
						match(TAB);
						setState(137);
						((CrawlItemEtfContext)_localctx).asset = match(NUMBER);
						setState(138);
						match(TAB);
						setState(139);
						((CrawlItemEtfContext)_localctx).closing = match(NUMBER);
						setState(140);
						match(TAB);
						setState(141);
						((CrawlItemEtfContext)_localctx).amount = match(NUMBER);
						setState(142);
						match(TAB);
						setState(143);
						match(TAB);
						setState(144);
						match(TAB);
						setState(146);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(145);
							((CrawlItemEtfContext)_localctx).priceEarningsRatio = match(NUMBER);
							}
						}

						setState(148);
						match(TAB);
						setState(149);
						match(TAB);
						setState(150);
						match(TAB);
						setState(151);
						match(TAB);
						setState(152);
						match(TAB);
						setState(153);
						match(TAB);
						setState(155);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(154);
							((CrawlItemEtfContext)_localctx).fee = match(NUMBER);
							}
						}

						setState(157);
						match(TAB);
						setState(158);
						((CrawlItemEtfContext)_localctx).operator = match(WORD);
						setState(159);
						match(TAB);
						setState(160);
						match(NEWLINE);

										ParserService.crawlEtfDetailThread(20231217
											, (((CrawlItemEtfContext)_localctx).code!=null?((CrawlItemEtfContext)_localctx).code.getText():null)
											, (((CrawlItemEtfContext)_localctx).symbol!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol.start,((CrawlItemEtfContext)_localctx).symbol.stop):null), (((CrawlItemEtfContext)_localctx).symbol1!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol1.start,((CrawlItemEtfContext)_localctx).symbol1.stop):null), (((CrawlItemEtfContext)_localctx).symbol2!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol2.start,((CrawlItemEtfContext)_localctx).symbol2.stop):null), (((CrawlItemEtfContext)_localctx).symbol3!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol3.start,((CrawlItemEtfContext)_localctx).symbol3.stop):null), (((CrawlItemEtfContext)_localctx).symbol4!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol4.start,((CrawlItemEtfContext)_localctx).symbol4.stop):null), (((CrawlItemEtfContext)_localctx).symbol5!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol5.start,((CrawlItemEtfContext)_localctx).symbol5.stop):null), (((CrawlItemEtfContext)_localctx).symbol6!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol6.start,((CrawlItemEtfContext)_localctx).symbol6.stop):null), (((CrawlItemEtfContext)_localctx).symbol7!=null?_input.getText(((CrawlItemEtfContext)_localctx).symbol7.start,((CrawlItemEtfContext)_localctx).symbol7.stop):null)
											, (((CrawlItemEtfContext)_localctx).category!=null?_input.getText(((CrawlItemEtfContext)_localctx).category.start,((CrawlItemEtfContext)_localctx).category.stop):null), (((CrawlItemEtfContext)_localctx).category1!=null?_input.getText(((CrawlItemEtfContext)_localctx).category1.start,((CrawlItemEtfContext)_localctx).category1.stop):null), (((CrawlItemEtfContext)_localctx).category2!=null?_input.getText(((CrawlItemEtfContext)_localctx).category2.start,((CrawlItemEtfContext)_localctx).category2.stop):null), (((CrawlItemEtfContext)_localctx).category3!=null?_input.getText(((CrawlItemEtfContext)_localctx).category3.start,((CrawlItemEtfContext)_localctx).category3.stop):null), (((CrawlItemEtfContext)_localctx).category4!=null?_input.getText(((CrawlItemEtfContext)_localctx).category4.start,((CrawlItemEtfContext)_localctx).category4.stop):null), (((CrawlItemEtfContext)_localctx).category5!=null?_input.getText(((CrawlItemEtfContext)_localctx).category5.start,((CrawlItemEtfContext)_localctx).category5.stop):null), (((CrawlItemEtfContext)_localctx).category6!=null?_input.getText(((CrawlItemEtfContext)_localctx).category6.start,((CrawlItemEtfContext)_localctx).category6.stop):null), (((CrawlItemEtfContext)_localctx).category7!=null?_input.getText(((CrawlItemEtfContext)_localctx).category7.start,((CrawlItemEtfContext)_localctx).category7.stop):null)
											, null
											, (((CrawlItemEtfContext)_localctx).fee!=null?((CrawlItemEtfContext)_localctx).fee.getText():null)
										);
									
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(165); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(167);
				match(WORD);
				setState(168);
				match(TAB);
				setState(169);
				match(WORD);
				setState(170);
				match(TAB);
				setState(171);
				match(DATE);
				setState(172);
				match(NEWLINE);
				}
				}
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(178);
			match(KEYWORD);
			setState(179);
			match(TAB);
			setState(180);
			match(WORD);
			setState(181);
			match(TAB);
			setState(182);
			match(WORD);
			setState(183);
			match(WORD);
			setState(184);
			match(WORD);
			setState(185);
			match(TAB);
			setState(186);
			match(WORD);
			setState(187);
			match(TAB);
			setState(188);
			match(WORD);
			setState(189);
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
		enterRule(_localctx, 4, RULE_crawlPriceEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(KEYWORD);
			setState(192);
			match(TAB);
			setState(193);
			match(WORD);
			setState(194);
			match(WORD);
			setState(195);
			match(TAB);
			setState(196);
			match(WORD);
			setState(197);
			match(TAB);
			setState(198);
			match(WORD);
			setState(199);
			match(TAB);
			setState(200);
			match(WORD);
			setState(201);
			match(NEWLINE);
			setState(281); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				((CrawlPriceEtfContext)_localctx).code = match(NUMBER);
				setState(203);
				match(TAB);
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(204);
					((CrawlPriceEtfContext)_localctx).symbol = word();
					}
					}
					setState(207); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(209);
				match(NEWLINE);
				setState(270); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
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
						match(NEWLINE);
						setState(266); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(266);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
							case 1:
								{
								{
								setState(227);
								match(TAB);
								setState(228);
								match(TAB);
								setState(229);
								match(TAB);
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
								}
								}
								break;
							case 2:
								{
								{
								setState(237);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(236);
									((CrawlPriceEtfContext)_localctx).base = match(DATE);
									}
								}

								setState(239);
								match(TAB);
								setState(241);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(240);
									((CrawlPriceEtfContext)_localctx).closing = match(NUMBER);
									}
								}

								setState(243);
								match(TAB);
								setState(245);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(244);
									match(NUMBER);
									}
								}

								setState(247);
								match(TAB);
								setState(249);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(248);
									((CrawlPriceEtfContext)_localctx).market = match(NUMBER);
									}
								}

								setState(251);
								match(TAB);
								setState(253);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(252);
									((CrawlPriceEtfContext)_localctx).high = match(NUMBER);
									}
								}

								setState(255);
								match(TAB);
								setState(256);
								((CrawlPriceEtfContext)_localctx).low = match(NUMBER);
								setState(257);
								match(TAB);
								setState(258);
								((CrawlPriceEtfContext)_localctx).volume = match(NUMBER);
								setState(259);
								match(TAB);
								setState(261);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(260);
									match(NUMBER);
									}
								}

								setState(263);
								match(TAB);
								setState(264);
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
							setState(268); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(272); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(274);
				match(WORD);
				setState(275);
				match(TAB);
				setState(276);
				match(WORD);
				setState(277);
				match(TAB);
				setState(278);
				match(DATE);
				setState(279);
				match(NEWLINE);
				}
				}
				setState(283); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(285);
			match(KEYWORD);
			setState(286);
			match(TAB);
			setState(287);
			match(WORD);
			setState(288);
			match(WORD);
			setState(289);
			match(TAB);
			setState(290);
			match(WORD);
			setState(291);
			match(TAB);
			setState(292);
			match(WORD);
			setState(293);
			match(TAB);
			setState(294);
			match(WORD);
			setState(295);
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
		enterRule(_localctx, 6, RULE_crawlPriceCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(KEYWORD);
			setState(298);
			match(TAB);
			setState(299);
			match(WORD);
			setState(300);
			match(WORD);
			setState(301);
			match(TAB);
			setState(302);
			match(WORD);
			setState(303);
			match(TAB);
			setState(304);
			match(WORD);
			setState(305);
			match(TAB);
			setState(306);
			match(WORD);
			setState(307);
			match(NEWLINE);
			setState(370); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(308);
				((CrawlPriceCompanyContext)_localctx).code = match(NUMBER);
				setState(309);
				match(TAB);
				setState(311); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(310);
					((CrawlPriceCompanyContext)_localctx).symbol = word();
					}
					}
					setState(313); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(315);
				match(NEWLINE);
				setState(359); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(316);
						match(WORD);
						setState(317);
						match(TAB);
						setState(318);
						match(WORD);
						setState(319);
						match(TAB);
						setState(320);
						match(WORD);
						setState(321);
						match(TAB);
						setState(322);
						match(WORD);
						setState(323);
						match(TAB);
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
						match(NEWLINE);
						setState(355); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(355);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case TAB:
								{
								{
								setState(331);
								match(TAB);
								setState(332);
								match(TAB);
								setState(333);
								match(TAB);
								setState(334);
								match(TAB);
								setState(335);
								match(TAB);
								setState(336);
								match(TAB);
								setState(337);
								match(TAB);
								setState(338);
								match(NEWLINE);
								}
								}
								break;
							case DATE:
								{
								{
								setState(339);
								((CrawlPriceCompanyContext)_localctx).base = match(DATE);
								setState(340);
								match(TAB);
								setState(341);
								((CrawlPriceCompanyContext)_localctx).closing = match(NUMBER);
								setState(342);
								match(TAB);
								setState(343);
								match(NUMBER);
								setState(344);
								match(TAB);
								setState(345);
								((CrawlPriceCompanyContext)_localctx).market = match(NUMBER);
								setState(346);
								match(TAB);
								setState(347);
								((CrawlPriceCompanyContext)_localctx).high = match(NUMBER);
								setState(348);
								match(TAB);
								setState(349);
								((CrawlPriceCompanyContext)_localctx).low = match(NUMBER);
								setState(350);
								match(TAB);
								setState(351);
								((CrawlPriceCompanyContext)_localctx).volume = match(NUMBER);
								setState(352);
								match(TAB);
								setState(353);
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
							setState(357); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(361); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(363);
				match(WORD);
				setState(364);
				match(TAB);
				setState(365);
				match(WORD);
				setState(366);
				match(TAB);
				setState(367);
				match(DATE);
				setState(368);
				match(NEWLINE);
				}
				}
				setState(372); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(374);
			match(KEYWORD);
			setState(375);
			match(TAB);
			setState(376);
			match(WORD);
			setState(377);
			match(WORD);
			setState(378);
			match(TAB);
			setState(379);
			match(WORD);
			setState(380);
			match(TAB);
			setState(381);
			match(WORD);
			setState(382);
			match(TAB);
			setState(383);
			match(WORD);
			setState(384);
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
		enterRule(_localctx, 8, RULE_crawlItemDetailCompanyThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(KEYWORD);
			setState(387);
			match(TAB);
			setState(388);
			match(WORD);
			setState(389);
			match(WORD);
			setState(390);
			match(TAB);
			setState(391);
			match(WORD);
			setState(392);
			match(TAB);
			setState(393);
			match(WORD);
			setState(394);
			match(TAB);
			setState(395);
			match(WORD);
			setState(396);
			match(NEWLINE);
			setState(454); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(397);
					match(KEYWORD);
					setState(398);
					match(TAB);
					setState(399);
					((CrawlItemDetailCompanyThreadContext)_localctx).code = match(NUMBER);
					setState(400);
					match(TAB);
					setState(401);
					((CrawlItemDetailCompanyThreadContext)_localctx).type = match(WORD);
					setState(402);
					match(TAB);
					setState(403);
					((CrawlItemDetailCompanyThreadContext)_localctx).symbol = word();
					setState(405);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(404);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(408);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(407);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(411);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(410);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(414);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						setState(413);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(417);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						setState(416);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(420);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(419);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol6 = word();
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
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(427);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(428);
					match(NEWLINE);
					setState(429);
					match(KEYWORD);
					setState(430);
					match(TAB);
					setState(431);
					((CrawlItemDetailCompanyThreadContext)_localctx).category = match(STRING);
					setState(432);
					match(NEWLINE);
					setState(433);
					match(KEYWORD);
					setState(434);
					match(TAB);
					setState(435);
					((CrawlItemDetailCompanyThreadContext)_localctx).fics = match(STRING);
					setState(436);
					match(NEWLINE);
					setState(437);
					match(KEYWORD);
					setState(438);
					match(TAB);
					setState(439);
					((CrawlItemDetailCompanyThreadContext)_localctx).ea = match(NUMBER);
					setState(440);
					match(WORD);
					setState(441);
					match(NEWLINE);
					setState(442);
					match(KEYWORD);
					setState(443);
					match(TAB);
					setState(444);
					((CrawlItemDetailCompanyThreadContext)_localctx).ipo = match(DATE);
					setState(445);
					match(NEWLINE);
					setState(446);
					match(WORD);
					setState(447);
					match(TAB);
					setState(448);
					match(WORD);
					setState(449);
					match(TAB);
					setState(450);
					match(DATE);
					setState(451);
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
				setState(456); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(458);
			match(KEYWORD);
			setState(459);
			match(TAB);
			setState(460);
			match(WORD);
			setState(461);
			match(WORD);
			setState(462);
			match(TAB);
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
		enterRule(_localctx, 10, RULE_crawlItemDividendTopCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(KEYWORD);
			setState(471);
			match(TAB);
			setState(472);
			match(WORD);
			setState(473);
			match(TAB);
			setState(474);
			match(WORD);
			setState(475);
			match(WORD);
			setState(476);
			match(WORD);
			setState(477);
			match(TAB);
			setState(478);
			match(WORD);
			setState(479);
			match(TAB);
			setState(480);
			match(WORD);
			setState(481);
			match(NEWLINE);
			setState(550); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(482);
				match(WORD);
				setState(483);
				match(TAB);
				setState(484);
				match(NEWLINE);
				setState(485);
				match(WORD);
				setState(486);
				match(TAB);
				setState(487);
				match(WORD);
				setState(488);
				match(TAB);
				setState(489);
				match(WORD);
				setState(490);
				match(TAB);
				setState(491);
				match(WORD);
				setState(492);
				match(TAB);
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
				match(TAB);
				setState(501);
				match(WORD);
				setState(502);
				match(TAB);
				setState(503);
				match(WORD);
				setState(504);
				match(TAB);
				setState(505);
				match(WORD);
				setState(506);
				match(TAB);
				setState(507);
				match(NEWLINE);
				setState(539); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(508);
						((CrawlItemDividendTopCompanyContext)_localctx).type = match(WORD);
						setState(509);
						match(TAB);
						setState(510);
						match(NUMBER);
						setState(511);
						match(TAB);
						setState(513);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(512);
							((CrawlItemDividendTopCompanyContext)_localctx).code = match(NUMBER);
							}
						}

						setState(515);
						match(TAB);
						setState(517); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(516);
							word();
							}
							}
							setState(519); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
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
						match(NUMBER);
						setState(527);
						match(TAB);
						setState(528);
						match(NUMBER);
						setState(529);
						match(TAB);
						setState(530);
						match(NUMBER);
						setState(531);
						match(TAB);
						setState(532);
						match(NUMBER);
						setState(533);
						match(TAB);
						setState(534);
						match(NUMBER);
						setState(535);
						match(TAB);
						setState(536);
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
					setState(541); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(543);
				match(WORD);
				setState(544);
				match(TAB);
				setState(545);
				match(WORD);
				setState(546);
				match(TAB);
				setState(547);
				match(DATE);
				setState(548);
				match(NEWLINE);
				}
				}
				setState(552); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(554);
			match(KEYWORD);
			setState(555);
			match(TAB);
			setState(556);
			match(WORD);
			setState(557);
			match(TAB);
			setState(558);
			match(WORD);
			setState(559);
			match(WORD);
			setState(560);
			match(WORD);
			setState(561);
			match(TAB);
			setState(562);
			match(WORD);
			setState(563);
			match(TAB);
			setState(564);
			match(WORD);
			setState(565);
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
		enterRule(_localctx, 12, RULE_crawlEtfDetailThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(KEYWORD);
			setState(568);
			match(TAB);
			setState(569);
			match(WORD);
			setState(570);
			match(WORD);
			setState(571);
			match(TAB);
			setState(572);
			match(WORD);
			setState(573);
			match(TAB);
			setState(574);
			match(WORD);
			setState(575);
			match(NEWLINE);
			setState(657); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(576);
					match(KEYWORD);
					setState(577);
					match(TAB);
					setState(578);
					((CrawlEtfDetailThreadContext)_localctx).code = match(NUMBER);
					setState(579);
					match(TAB);
					setState(583);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(580);
						word();
						}
						}
						setState(585);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(586);
					match(NEWLINE);
					setState(587);
					((CrawlEtfDetailThreadContext)_localctx).symbol = word();
					setState(589);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(588);
						((CrawlEtfDetailThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(592);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						setState(591);
						((CrawlEtfDetailThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(595);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						setState(594);
						((CrawlEtfDetailThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(598);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(597);
						((CrawlEtfDetailThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(601);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						setState(600);
						((CrawlEtfDetailThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(604);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						setState(603);
						((CrawlEtfDetailThreadContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(609);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(606);
						((CrawlEtfDetailThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(611);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(612);
					match(NEWLINE);
					setState(613);
					((CrawlEtfDetailThreadContext)_localctx).category = word();
					setState(615);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						setState(614);
						((CrawlEtfDetailThreadContext)_localctx).category1 = word();
						}
						break;
					}
					setState(618);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						setState(617);
						((CrawlEtfDetailThreadContext)_localctx).category2 = word();
						}
						break;
					}
					setState(621);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						setState(620);
						((CrawlEtfDetailThreadContext)_localctx).category3 = word();
						}
						break;
					}
					setState(624);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						setState(623);
						((CrawlEtfDetailThreadContext)_localctx).category4 = word();
						}
						break;
					}
					setState(627);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						setState(626);
						((CrawlEtfDetailThreadContext)_localctx).category5 = word();
						}
						break;
					}
					setState(630);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						setState(629);
						((CrawlEtfDetailThreadContext)_localctx).category6 = word();
						}
						break;
					}
					setState(635);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(632);
						((CrawlEtfDetailThreadContext)_localctx).category7 = word();
						}
						}
						setState(637);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(638);
					match(NEWLINE);
					setState(639);
					((CrawlEtfDetailThreadContext)_localctx).ipo = match(DATE);
					setState(643);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WORD) {
						{
						{
						setState(640);
						match(WORD);
						}
						}
						setState(645);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(646);
					match(NEWLINE);
					setState(647);
					((CrawlEtfDetailThreadContext)_localctx).fee = word();
					setState(648);
					match(NEWLINE);
					setState(649);
					match(WORD);
					setState(650);
					match(TAB);
					setState(651);
					match(WORD);
					setState(652);
					match(TAB);
					setState(653);
					match(DATE);
					setState(654);
					match(NEWLINE);

								ParserService.crawlEtfDetailThread(20231217
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
				setState(659); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(661);
			match(KEYWORD);
			setState(662);
			match(TAB);
			setState(663);
			match(WORD);
			setState(664);
			match(WORD);
			setState(665);
			match(TAB);
			setState(666);
			match(WORD);
			setState(667);
			match(TAB);
			setState(668);
			match(WORD);
			setState(669);
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
			setState(671);
			match(KEYWORD);
			setState(672);
			match(TAB);
			setState(673);
			match(WORD);
			setState(674);
			match(WORD);
			setState(675);
			match(WORD);
			setState(676);
			match(TAB);
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
			match(TAB);
			setState(683);
			match(WORD);
			setState(684);
			match(NEWLINE);
			setState(790); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(685);
					match(KEYWORD);
					setState(686);
					match(TAB);
					setState(687);
					((CrawlDividendHistoryEtfThreadContext)_localctx).code = match(NUMBER);
					setState(688);
					match(NEWLINE);
					setState(689);
					match(WORD);
					setState(690);
					match(TAB);
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
					match(NEWLINE);
					setState(780); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(780);
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
								setState(709);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol = word();
								setState(711);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
								case 1:
									{
									setState(710);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol1 = word();
									}
									break;
								}
								setState(714);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
								case 1:
									{
									setState(713);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol2 = word();
									}
									break;
								}
								setState(717);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
								case 1:
									{
									setState(716);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol3 = word();
									}
									break;
								}
								setState(720);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
								case 1:
									{
									setState(719);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol4 = word();
									}
									break;
								}
								setState(723);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
								case 1:
									{
									setState(722);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol5 = word();
									}
									break;
								}
								setState(726);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
								case 1:
									{
									setState(725);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol6 = word();
									}
									break;
								}
								setState(731);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
									{
									{
									setState(728);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol7 = word();
									}
									}
									setState(733);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(734);
								match(TAB);
								setState(735);
								match(TAB);
								setState(736);
								match(WORD);
								setState(737);
								match(TAB);
								setState(741);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
									{
									{
									setState(738);
									word();
									}
									}
									setState(743);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(744);
								match(TAB);
								setState(746);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(745);
									((CrawlDividendHistoryEtfThreadContext)_localctx).base = match(DATE);
									}
								}

								setState(748);
								match(TAB);
								setState(749);
								((CrawlDividendHistoryEtfThreadContext)_localctx).pay = match(DATE);
								setState(750);
								match(TAB);
								setState(752);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==WORD) {
									{
									setState(751);
									match(WORD);
									}
								}

								setState(754);
								match(TAB);
								setState(755);
								((CrawlDividendHistoryEtfThreadContext)_localctx).dividend = match(NUMBER);
								setState(756);
								match(TAB);
								setState(758);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(757);
									((CrawlDividendHistoryEtfThreadContext)_localctx).price = match(NUMBER);
									}
								}

								setState(760);
								match(TAB);
								setState(762);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(761);
									((CrawlDividendHistoryEtfThreadContext)_localctx).ratio = match(NUMBER);
									}
								}

								setState(764);
								match(TAB);
								setState(765);
								match(NEWLINE);
								}

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
							case TAB:
								{
								{
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
							default:
								throw new NoViableAltException(this);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(782); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(784);
					match(WORD);
					setState(785);
					match(TAB);
					setState(786);
					match(WORD);
					setState(787);
					match(TAB);
					setState(788);
					match(DATE);
					setState(789);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(792); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(794);
			match(KEYWORD);
			setState(795);
			match(TAB);
			setState(796);
			match(WORD);
			setState(797);
			match(WORD);
			setState(798);
			match(WORD);
			setState(799);
			match(TAB);
			setState(800);
			match(WORD);
			setState(801);
			match(WORD);
			setState(802);
			match(WORD);
			setState(803);
			match(TAB);
			setState(804);
			match(WORD);
			setState(805);
			match(TAB);
			setState(806);
			match(WORD);
			setState(807);
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
		enterRule(_localctx, 16, RULE_crawlDividendHistoryCompanyThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(KEYWORD);
			setState(810);
			match(TAB);
			setState(811);
			match(WORD);
			setState(812);
			match(TAB);
			setState(813);
			match(WORD);
			setState(814);
			match(WORD);
			setState(815);
			match(WORD);
			setState(816);
			match(TAB);
			setState(817);
			match(WORD);
			setState(818);
			match(TAB);
			setState(819);
			match(WORD);
			setState(820);
			match(NEWLINE);
			setState(948); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(938); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(821);
						match(WORD);
						setState(822);
						match(TAB);
						setState(823);
						match(WORD);
						setState(824);
						match(NEWLINE);
						setState(825);
						match(WORD);
						setState(826);
						match(TAB);
						setState(827);
						match(WORD);
						setState(828);
						match(NEWLINE);
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
						match(WORD);
						setState(852);
						match(TAB);
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
						match(WORD);
						setState(865);
						match(TAB);
						setState(866);
						match(NEWLINE);
						setState(934); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(934);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case TAB:
								{
								{
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
								match(TAB);
								setState(883);
								match(TAB);
								setState(884);
								match(NEWLINE);
								}
								}
								break;
							case DATE:
								{
								{
								{
								setState(885);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).base = match(DATE);
								setState(886);
								match(TAB);
								setState(888);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(887);
									((CrawlDividendHistoryCompanyThreadContext)_localctx).pay = match(DATE);
									}
								}

								setState(890);
								match(TAB);
								setState(892);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(891);
									match(DATE);
									}
								}

								setState(894);
								match(TAB);
								setState(895);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).code = match(NUMBER);
								setState(896);
								match(TAB);
								setState(898); 
								_errHandler.sync(this);
								_la = _input.LA(1);
								do {
									{
									{
									setState(897);
									((CrawlDividendHistoryCompanyThreadContext)_localctx).symbol = word();
									}
									}
									setState(900); 
									_errHandler.sync(this);
									_la = _input.LA(1);
								} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
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
								match(WORD);
								setState(910);
								match(TAB);
								setState(911);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).dividend = match(NUMBER);
								setState(912);
								match(TAB);
								setState(914);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(913);
									match(NUMBER);
									}
								}

								setState(916);
								match(TAB);
								setState(917);
								match(NUMBER);
								setState(918);
								match(TAB);
								setState(919);
								match(NUMBER);
								setState(920);
								match(TAB);
								setState(922);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(921);
									match(NUMBER);
									}
								}

								setState(924);
								match(TAB);
								setState(925);
								match(TAB);
								setState(926);
								match(NUMBER);
								setState(927);
								match(TAB);
								setState(928);
								match(NUMBER);
								setState(929);
								match(TAB);
								setState(930);
								match(NEWLINE);
								}

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
							setState(936); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(940); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(942);
				match(WORD);
				setState(943);
				match(TAB);
				setState(944);
				match(WORD);
				setState(945);
				match(TAB);
				setState(946);
				match(DATE);
				setState(947);
				match(NEWLINE);
				}
				}
				setState(950); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(952);
			match(KEYWORD);
			setState(953);
			match(TAB);
			setState(954);
			match(WORD);
			setState(955);
			match(TAB);
			setState(956);
			match(WORD);
			setState(957);
			match(WORD);
			setState(958);
			match(WORD);
			setState(959);
			match(TAB);
			setState(960);
			match(WORD);
			setState(961);
			match(TAB);
			setState(962);
			match(WORD);
			setState(963);
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
		enterRule(_localctx, 18, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
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
		enterRule(_localctx, 20, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(969);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(967);
					word();
					}
					break;
				case TAB:
					{
					setState(968);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(971); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(973);
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
		enterRule(_localctx, 22, RULE_eof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(978);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(975);
					word();
					}
					break;
				case TAB:
					{
					setState(976);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(977);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(980); 
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
		"\u0004\u0001\n\u03d7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000!\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001V\b\u0001\u0001\u0001\u0003\u0001Y\b\u0001\u0001\u0001"+
		"\u0003\u0001\\\b\u0001\u0001\u0001\u0003\u0001_\b\u0001\u0001\u0001\u0003"+
		"\u0001b\b\u0001\u0001\u0001\u0003\u0001e\b\u0001\u0001\u0001\u0005\u0001"+
		"h\b\u0001\n\u0001\f\u0001k\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001r\b\u0001\u0001\u0001\u0003\u0001"+
		"u\b\u0001\u0001\u0001\u0003\u0001x\b\u0001\u0001\u0001\u0003\u0001{\b"+
		"\u0001\u0001\u0001\u0003\u0001~\b\u0001\u0001\u0001\u0003\u0001\u0081"+
		"\b\u0001\u0001\u0001\u0005\u0001\u0084\b\u0001\n\u0001\f\u0001\u0087\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0093"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u009c\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u00a4\b\u0001\u000b"+
		"\u0001\f\u0001\u00a5\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u00af\b\u0001\u000b\u0001\f"+
		"\u0001\u00b0\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u00ce\b\u0002"+
		"\u000b\u0002\f\u0002\u00cf\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u00ee\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00f2\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00f6\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u00fa\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00fe"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u0106\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004"+
		"\u0002\u010b\b\u0002\u000b\u0002\f\u0002\u010c\u0004\u0002\u010f\b\u0002"+
		"\u000b\u0002\f\u0002\u0110\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u011a\b\u0002\u000b\u0002"+
		"\f\u0002\u011b\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u0138\b\u0003\u000b\u0003"+
		"\f\u0003\u0139\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003"+
		"\u0164\b\u0003\u000b\u0003\f\u0003\u0165\u0004\u0003\u0168\b\u0003\u000b"+
		"\u0003\f\u0003\u0169\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u0173\b\u0003\u000b\u0003\f"+
		"\u0003\u0174\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0196\b\u0004\u0001\u0004\u0003\u0004"+
		"\u0199\b\u0004\u0001\u0004\u0003\u0004\u019c\b\u0004\u0001\u0004\u0003"+
		"\u0004\u019f\b\u0004\u0001\u0004\u0003\u0004\u01a2\b\u0004\u0001\u0004"+
		"\u0003\u0004\u01a5\b\u0004\u0001\u0004\u0005\u0004\u01a8\b\u0004\n\u0004"+
		"\f\u0004\u01ab\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u01c7\b\u0004"+
		"\u000b\u0004\f\u0004\u01c8\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0202\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0004\u0005\u0206\b\u0005\u000b\u0005\f\u0005\u0207\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004"+
		"\u0005\u021c\b\u0005\u000b\u0005\f\u0005\u021d\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005"+
		"\u0227\b\u0005\u000b\u0005\f\u0005\u0228\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u0246\b\u0006\n\u0006\f\u0006\u0249\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u024e\b\u0006\u0001\u0006\u0003\u0006"+
		"\u0251\b\u0006\u0001\u0006\u0003\u0006\u0254\b\u0006\u0001\u0006\u0003"+
		"\u0006\u0257\b\u0006\u0001\u0006\u0003\u0006\u025a\b\u0006\u0001\u0006"+
		"\u0003\u0006\u025d\b\u0006\u0001\u0006\u0005\u0006\u0260\b\u0006\n\u0006"+
		"\f\u0006\u0263\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0268\b\u0006\u0001\u0006\u0003\u0006\u026b\b\u0006\u0001\u0006\u0003"+
		"\u0006\u026e\b\u0006\u0001\u0006\u0003\u0006\u0271\b\u0006\u0001\u0006"+
		"\u0003\u0006\u0274\b\u0006\u0001\u0006\u0003\u0006\u0277\b\u0006\u0001"+
		"\u0006\u0005\u0006\u027a\b\u0006\n\u0006\f\u0006\u027d\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u0282\b\u0006\n\u0006\f\u0006\u0285"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004"+
		"\u0006\u0292\b\u0006\u000b\u0006\f\u0006\u0293\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u02c8\b\u0007\u0001\u0007\u0003\u0007\u02cb\b\u0007\u0001"+
		"\u0007\u0003\u0007\u02ce\b\u0007\u0001\u0007\u0003\u0007\u02d1\b\u0007"+
		"\u0001\u0007\u0003\u0007\u02d4\b\u0007\u0001\u0007\u0003\u0007\u02d7\b"+
		"\u0007\u0001\u0007\u0005\u0007\u02da\b\u0007\n\u0007\f\u0007\u02dd\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u02e4\b\u0007\n\u0007\f\u0007\u02e7\t\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u02eb\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u02f1\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u02f7\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02fb\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u030d\b\u0007"+
		"\u000b\u0007\f\u0007\u030e\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007\u0317\b\u0007\u000b\u0007\f\u0007"+
		"\u0318\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u0379\b\b\u0001\b\u0001\b\u0003\b\u037d"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u0383\b\b\u000b\b\f\b\u0384"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u0393\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u039b\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u03a7\b\b\u000b\b\f"+
		"\b\u03a8\u0004\b\u03ab\b\b\u000b\b\f\b\u03ac\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0004\b\u03b5\b\b\u000b\b\f\b\u03b6\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0004\n\u03ca\b\n\u000b"+
		"\n\f\n\u03cb\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0004"+
		"\u000b\u03d3\b\u000b\u000b\u000b\f\u000b\u03d4\u0001\u000b\u0000\u0000"+
		"\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0001"+
		"\u0001\u0000\u0005\n\u042d\u0000 \u0001\u0000\u0000\u0000\u0002\"\u0001"+
		"\u0000\u0000\u0000\u0004\u00bf\u0001\u0000\u0000\u0000\u0006\u0129\u0001"+
		"\u0000\u0000\u0000\b\u0182\u0001\u0000\u0000\u0000\n\u01d6\u0001\u0000"+
		"\u0000\u0000\f\u0237\u0001\u0000\u0000\u0000\u000e\u029f\u0001\u0000\u0000"+
		"\u0000\u0010\u0329\u0001\u0000\u0000\u0000\u0012\u03c5\u0001\u0000\u0000"+
		"\u0000\u0014\u03c9\u0001\u0000\u0000\u0000\u0016\u03d2\u0001\u0000\u0000"+
		"\u0000\u0018!\u0003\u0010\b\u0000\u0019!\u0003\u000e\u0007\u0000\u001a"+
		"!\u0003\n\u0005\u0000\u001b!\u0003\u0002\u0001\u0000\u001c!\u0003\b\u0004"+
		"\u0000\u001d!\u0003\f\u0006\u0000\u001e!\u0003\u0006\u0003\u0000\u001f"+
		"!\u0003\u0004\u0002\u0000 \u0018\u0001\u0000\u0000\u0000 \u0019\u0001"+
		"\u0000\u0000\u0000 \u001a\u0001\u0000\u0000\u0000 \u001b\u0001\u0000\u0000"+
		"\u0000 \u001c\u0001\u0000\u0000\u0000 \u001d\u0001\u0000\u0000\u0000 "+
		"\u001e\u0001\u0000\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!\u0001\u0001"+
		"\u0000\u0000\u0000\"#\u0005\u0005\u0000\u0000#$\u0005\u0003\u0000\u0000"+
		"$%\u0005\n\u0000\u0000%&\u0005\u0003\u0000\u0000&\'\u0005\n\u0000\u0000"+
		"\'(\u0005\n\u0000\u0000()\u0005\n\u0000\u0000)*\u0005\u0003\u0000\u0000"+
		"*+\u0005\n\u0000\u0000+,\u0005\u0003\u0000\u0000,-\u0005\n\u0000\u0000"+
		"-\u00ae\u0005\u0004\u0000\u0000./\u0005\n\u0000\u0000/0\u0005\u0003\u0000"+
		"\u000001\u0005\u0004\u0000\u000012\u0005\n\u0000\u000023\u0005\u0003\u0000"+
		"\u000034\u0005\n\u0000\u000045\u0005\u0003\u0000\u000056\u0005\n\u0000"+
		"\u000067\u0005\u0003\u0000\u000078\u0005\u0003\u0000\u000089\u0005\n\u0000"+
		"\u00009:\u0005\u0003\u0000\u0000:;\u0005\n\u0000\u0000;<\u0005\u0003\u0000"+
		"\u0000<=\u0005\n\u0000\u0000=>\u0005\u0003\u0000\u0000>?\u0005\n\u0000"+
		"\u0000?@\u0005\u0004\u0000\u0000@A\u0005\n\u0000\u0000AB\u0005\u0003\u0000"+
		"\u0000BC\u0005\u0003\u0000\u0000CD\u0005\u0003\u0000\u0000DE\u0005\n\u0000"+
		"\u0000EF\u0005\u0003\u0000\u0000FG\u0005\u0003\u0000\u0000GH\u0005\u0003"+
		"\u0000\u0000HI\u0005\u0003\u0000\u0000IJ\u0005\u0003\u0000\u0000JK\u0005"+
		"\u0003\u0000\u0000KL\u0005\n\u0000\u0000LM\u0005\u0003\u0000\u0000MN\u0005"+
		"\n\u0000\u0000NO\u0005\u0003\u0000\u0000O\u00a3\u0005\u0004\u0000\u0000"+
		"PQ\u0005\n\u0000\u0000QR\u0005\u0003\u0000\u0000RS\u0005\u0003\u0000\u0000"+
		"SU\u0003\u0012\t\u0000TV\u0003\u0012\t\u0000UT\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WY\u0003\u0012\t\u0000"+
		"XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000"+
		"\u0000Z\\\u0003\u0012\t\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\^\u0001\u0000\u0000\u0000]_\u0003\u0012\t\u0000^]\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000"+
		"`b\u0003\u0012\t\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"bd\u0001\u0000\u0000\u0000ce\u0003\u0012\t\u0000dc\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000ei\u0001\u0000\u0000\u0000fh\u0003\u0012\t\u0000"+
		"gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000lm\u0005\u0003\u0000\u0000mn\u0005\b\u0000\u0000no\u0005\u0003"+
		"\u0000\u0000oq\u0003\u0012\t\u0000pr\u0003\u0012\t\u0000qp\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000su\u0003"+
		"\u0012\t\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001"+
		"\u0000\u0000\u0000vx\u0003\u0012\t\u0000wv\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000y{\u0003\u0012\t\u0000zy\u0001"+
		"\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000"+
		"|~\u0003\u0012\t\u0000}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u0080\u0001\u0000\u0000\u0000\u007f\u0081\u0003\u0012\t\u0000\u0080"+
		"\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0085\u0001\u0000\u0000\u0000\u0082\u0084\u0003\u0012\t\u0000\u0083\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088"+
		"\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005\u0003\u0000\u0000\u0089\u008a\u0005\b\u0000\u0000\u008a\u008b\u0005"+
		"\u0003\u0000\u0000\u008b\u008c\u0005\b\u0000\u0000\u008c\u008d\u0005\u0003"+
		"\u0000\u0000\u008d\u008e\u0005\b\u0000\u0000\u008e\u008f\u0005\u0003\u0000"+
		"\u0000\u008f\u0090\u0005\u0003\u0000\u0000\u0090\u0092\u0005\u0003\u0000"+
		"\u0000\u0091\u0093\u0005\b\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0005\u0003\u0000\u0000\u0095\u0096\u0005\u0003\u0000\u0000"+
		"\u0096\u0097\u0005\u0003\u0000\u0000\u0097\u0098\u0005\u0003\u0000\u0000"+
		"\u0098\u0099\u0005\u0003\u0000\u0000\u0099\u009b\u0005\u0003\u0000\u0000"+
		"\u009a\u009c\u0005\b\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0005\u0003\u0000\u0000\u009e\u009f\u0005\n\u0000\u0000\u009f\u00a0"+
		"\u0005\u0003\u0000\u0000\u00a0\u00a1\u0005\u0004\u0000\u0000\u00a1\u00a2"+
		"\u0006\u0001\uffff\uffff\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3"+
		"P\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\n\u0000\u0000\u00a8\u00a9\u0005"+
		"\u0003\u0000\u0000\u00a9\u00aa\u0005\n\u0000\u0000\u00aa\u00ab\u0005\u0003"+
		"\u0000\u0000\u00ab\u00ac\u0005\u0006\u0000\u0000\u00ac\u00ad\u0005\u0004"+
		"\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae.\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0005\u0005\u0000\u0000\u00b3\u00b4\u0005\u0003\u0000"+
		"\u0000\u00b4\u00b5\u0005\n\u0000\u0000\u00b5\u00b6\u0005\u0003\u0000\u0000"+
		"\u00b6\u00b7\u0005\n\u0000\u0000\u00b7\u00b8\u0005\n\u0000\u0000\u00b8"+
		"\u00b9\u0005\n\u0000\u0000\u00b9\u00ba\u0005\u0003\u0000\u0000\u00ba\u00bb"+
		"\u0005\n\u0000\u0000\u00bb\u00bc\u0005\u0003\u0000\u0000\u00bc\u00bd\u0005"+
		"\n\u0000\u0000\u00bd\u00be\u0005\u0004\u0000\u0000\u00be\u0003\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0005\u0005\u0000\u0000\u00c0\u00c1\u0005\u0003"+
		"\u0000\u0000\u00c1\u00c2\u0005\n\u0000\u0000\u00c2\u00c3\u0005\n\u0000"+
		"\u0000\u00c3\u00c4\u0005\u0003\u0000\u0000\u00c4\u00c5\u0005\n\u0000\u0000"+
		"\u00c5\u00c6\u0005\u0003\u0000\u0000\u00c6\u00c7\u0005\n\u0000\u0000\u00c7"+
		"\u00c8\u0005\u0003\u0000\u0000\u00c8\u00c9\u0005\n\u0000\u0000\u00c9\u0119"+
		"\u0005\u0004\u0000\u0000\u00ca\u00cb\u0005\b\u0000\u0000\u00cb\u00cd\u0005"+
		"\u0003\u0000\u0000\u00cc\u00ce\u0003\u0012\t\u0000\u00cd\u00cc\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d1\u010e\u0005\u0004\u0000\u0000\u00d2\u00d3\u0005\n\u0000"+
		"\u0000\u00d3\u00d4\u0005\u0003\u0000\u0000\u00d4\u00d5\u0005\n\u0000\u0000"+
		"\u00d5\u00d6\u0005\u0003\u0000\u0000\u00d6\u00d7\u0005\n\u0000\u0000\u00d7"+
		"\u00d8\u0005\u0003\u0000\u0000\u00d8\u00d9\u0005\n\u0000\u0000\u00d9\u00da"+
		"\u0005\u0003\u0000\u0000\u00da\u00db\u0005\n\u0000\u0000\u00db\u00dc\u0005"+
		"\u0003\u0000\u0000\u00dc\u00dd\u0005\n\u0000\u0000\u00dd\u00de\u0005\u0003"+
		"\u0000\u0000\u00de\u00df\u0005\n\u0000\u0000\u00df\u00e0\u0005\u0003\u0000"+
		"\u0000\u00e0\u00e1\u0005\n\u0000\u0000\u00e1\u00e2\u0005\u0003\u0000\u0000"+
		"\u00e2\u010a\u0005\u0004\u0000\u0000\u00e3\u00e4\u0005\u0003\u0000\u0000"+
		"\u00e4\u00e5\u0005\u0003\u0000\u0000\u00e5\u00e6\u0005\u0003\u0000\u0000"+
		"\u00e6\u00e7\u0005\u0003\u0000\u0000\u00e7\u00e8\u0005\u0003\u0000\u0000"+
		"\u00e8\u00e9\u0005\u0003\u0000\u0000\u00e9\u00ea\u0005\u0003\u0000\u0000"+
		"\u00ea\u00eb\u0005\u0003\u0000\u0000\u00eb\u010b\u0005\u0004\u0000\u0000"+
		"\u00ec\u00ee\u0005\u0006\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f1\u0005\u0003\u0000\u0000\u00f0\u00f2\u0005\b\u0000\u0000\u00f1"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f5\u0005\u0003\u0000\u0000\u00f4"+
		"\u00f6\u0005\b\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f9"+
		"\u0005\u0003\u0000\u0000\u00f8\u00fa\u0005\b\u0000\u0000\u00f9\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fd\u0005\u0003\u0000\u0000\u00fc\u00fe\u0005"+
		"\b\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u0003"+
		"\u0000\u0000\u0100\u0101\u0005\b\u0000\u0000\u0101\u0102\u0005\u0003\u0000"+
		"\u0000\u0102\u0103\u0005\b\u0000\u0000\u0103\u0105\u0005\u0003\u0000\u0000"+
		"\u0104\u0106\u0005\b\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0105"+
		"\u0106\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0005\u0003\u0000\u0000\u0108\u0109\u0005\u0004\u0000\u0000\u0109"+
		"\u010b\u0006\u0002\uffff\uffff\u0000\u010a\u00e3\u0001\u0000\u0000\u0000"+
		"\u010a\u00ed\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000"+
		"\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000"+
		"\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u00d2\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u0005\n\u0000\u0000\u0113\u0114\u0005\u0003\u0000\u0000\u0114"+
		"\u0115\u0005\n\u0000\u0000\u0115\u0116\u0005\u0003\u0000\u0000\u0116\u0117"+
		"\u0005\u0006\u0000\u0000\u0117\u0118\u0005\u0004\u0000\u0000\u0118\u011a"+
		"\u0001\u0000\u0000\u0000\u0119\u00ca\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e"+
		"\u0005\u0005\u0000\u0000\u011e\u011f\u0005\u0003\u0000\u0000\u011f\u0120"+
		"\u0005\n\u0000\u0000\u0120\u0121\u0005\n\u0000\u0000\u0121\u0122\u0005"+
		"\u0003\u0000\u0000\u0122\u0123\u0005\n\u0000\u0000\u0123\u0124\u0005\u0003"+
		"\u0000\u0000\u0124\u0125\u0005\n\u0000\u0000\u0125\u0126\u0005\u0003\u0000"+
		"\u0000\u0126\u0127\u0005\n\u0000\u0000\u0127\u0128\u0005\u0004\u0000\u0000"+
		"\u0128\u0005\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u0005\u0000\u0000"+
		"\u012a\u012b\u0005\u0003\u0000\u0000\u012b\u012c\u0005\n\u0000\u0000\u012c"+
		"\u012d\u0005\n\u0000\u0000\u012d\u012e\u0005\u0003\u0000\u0000\u012e\u012f"+
		"\u0005\n\u0000\u0000\u012f\u0130\u0005\u0003\u0000\u0000\u0130\u0131\u0005"+
		"\n\u0000\u0000\u0131\u0132\u0005\u0003\u0000\u0000\u0132\u0133\u0005\n"+
		"\u0000\u0000\u0133\u0172\u0005\u0004\u0000\u0000\u0134\u0135\u0005\b\u0000"+
		"\u0000\u0135\u0137\u0005\u0003\u0000\u0000\u0136\u0138\u0003\u0012\t\u0000"+
		"\u0137\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000"+
		"\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000"+
		"\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u0167\u0005\u0004\u0000\u0000"+
		"\u013c\u013d\u0005\n\u0000\u0000\u013d\u013e\u0005\u0003\u0000\u0000\u013e"+
		"\u013f\u0005\n\u0000\u0000\u013f\u0140\u0005\u0003\u0000\u0000\u0140\u0141"+
		"\u0005\n\u0000\u0000\u0141\u0142\u0005\u0003\u0000\u0000\u0142\u0143\u0005"+
		"\n\u0000\u0000\u0143\u0144\u0005\u0003\u0000\u0000\u0144\u0145\u0005\n"+
		"\u0000\u0000\u0145\u0146\u0005\u0003\u0000\u0000\u0146\u0147\u0005\n\u0000"+
		"\u0000\u0147\u0148\u0005\u0003\u0000\u0000\u0148\u0149\u0005\n\u0000\u0000"+
		"\u0149\u014a\u0005\u0003\u0000\u0000\u014a\u0163\u0005\u0004\u0000\u0000"+
		"\u014b\u014c\u0005\u0003\u0000\u0000\u014c\u014d\u0005\u0003\u0000\u0000"+
		"\u014d\u014e\u0005\u0003\u0000\u0000\u014e\u014f\u0005\u0003\u0000\u0000"+
		"\u014f\u0150\u0005\u0003\u0000\u0000\u0150\u0151\u0005\u0003\u0000\u0000"+
		"\u0151\u0152\u0005\u0003\u0000\u0000\u0152\u0164\u0005\u0004\u0000\u0000"+
		"\u0153\u0154\u0005\u0006\u0000\u0000\u0154\u0155\u0005\u0003\u0000\u0000"+
		"\u0155\u0156\u0005\b\u0000\u0000\u0156\u0157\u0005\u0003\u0000\u0000\u0157"+
		"\u0158\u0005\b\u0000\u0000\u0158\u0159\u0005\u0003\u0000\u0000\u0159\u015a"+
		"\u0005\b\u0000\u0000\u015a\u015b\u0005\u0003\u0000\u0000\u015b\u015c\u0005"+
		"\b\u0000\u0000\u015c\u015d\u0005\u0003\u0000\u0000\u015d\u015e\u0005\b"+
		"\u0000\u0000\u015e\u015f\u0005\u0003\u0000\u0000\u015f\u0160\u0005\b\u0000"+
		"\u0000\u0160\u0161\u0005\u0003\u0000\u0000\u0161\u0162\u0005\u0004\u0000"+
		"\u0000\u0162\u0164\u0006\u0003\uffff\uffff\u0000\u0163\u014b\u0001\u0000"+
		"\u0000\u0000\u0163\u0153\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000"+
		"\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000"+
		"\u0000\u0000\u0166\u0168\u0001\u0000\u0000\u0000\u0167\u013c\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000"+
		"\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000"+
		"\u0000\u0000\u016b\u016c\u0005\n\u0000\u0000\u016c\u016d\u0005\u0003\u0000"+
		"\u0000\u016d\u016e\u0005\n\u0000\u0000\u016e\u016f\u0005\u0003\u0000\u0000"+
		"\u016f\u0170\u0005\u0006\u0000\u0000\u0170\u0171\u0005\u0004\u0000\u0000"+
		"\u0171\u0173\u0001\u0000\u0000\u0000\u0172\u0134\u0001\u0000\u0000\u0000"+
		"\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000"+
		"\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000"+
		"\u0176\u0177\u0005\u0005\u0000\u0000\u0177\u0178\u0005\u0003\u0000\u0000"+
		"\u0178\u0179\u0005\n\u0000\u0000\u0179\u017a\u0005\n\u0000\u0000\u017a"+
		"\u017b\u0005\u0003\u0000\u0000\u017b\u017c\u0005\n\u0000\u0000\u017c\u017d"+
		"\u0005\u0003\u0000\u0000\u017d\u017e\u0005\n\u0000\u0000\u017e\u017f\u0005"+
		"\u0003\u0000\u0000\u017f\u0180\u0005\n\u0000\u0000\u0180\u0181\u0005\u0004"+
		"\u0000\u0000\u0181\u0007\u0001\u0000\u0000\u0000\u0182\u0183\u0005\u0005"+
		"\u0000\u0000\u0183\u0184\u0005\u0003\u0000\u0000\u0184\u0185\u0005\n\u0000"+
		"\u0000\u0185\u0186\u0005\n\u0000\u0000\u0186\u0187\u0005\u0003\u0000\u0000"+
		"\u0187\u0188\u0005\n\u0000\u0000\u0188\u0189\u0005\u0003\u0000\u0000\u0189"+
		"\u018a\u0005\n\u0000\u0000\u018a\u018b\u0005\u0003\u0000\u0000\u018b\u018c"+
		"\u0005\n\u0000\u0000\u018c\u01c6\u0005\u0004\u0000\u0000\u018d\u018e\u0005"+
		"\u0005\u0000\u0000\u018e\u018f\u0005\u0003\u0000\u0000\u018f\u0190\u0005"+
		"\b\u0000\u0000\u0190\u0191\u0005\u0003\u0000\u0000\u0191\u0192\u0005\n"+
		"\u0000\u0000\u0192\u0193\u0005\u0003\u0000\u0000\u0193\u0195\u0003\u0012"+
		"\t\u0000\u0194\u0196\u0003\u0012\t\u0000\u0195\u0194\u0001\u0000\u0000"+
		"\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0198\u0001\u0000\u0000"+
		"\u0000\u0197\u0199\u0003\u0012\t\u0000\u0198\u0197\u0001\u0000\u0000\u0000"+
		"\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019b\u0001\u0000\u0000\u0000"+
		"\u019a\u019c\u0003\u0012\t\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019b"+
		"\u019c\u0001\u0000\u0000\u0000\u019c\u019e\u0001\u0000\u0000\u0000\u019d"+
		"\u019f\u0003\u0012\t\u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019e\u019f"+
		"\u0001\u0000\u0000\u0000\u019f\u01a1\u0001\u0000\u0000\u0000\u01a0\u01a2"+
		"\u0003\u0012\t\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a4\u0001\u0000\u0000\u0000\u01a3\u01a5\u0003"+
		"\u0012\t\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a9\u0001\u0000\u0000\u0000\u01a6\u01a8\u0003\u0012"+
		"\t\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000"+
		"\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ac\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0005\u0004\u0000\u0000\u01ad\u01ae\u0005\u0005\u0000"+
		"\u0000\u01ae\u01af\u0005\u0003\u0000\u0000\u01af\u01b0\u0005\t\u0000\u0000"+
		"\u01b0\u01b1\u0005\u0004\u0000\u0000\u01b1\u01b2\u0005\u0005\u0000\u0000"+
		"\u01b2\u01b3\u0005\u0003\u0000\u0000\u01b3\u01b4\u0005\t\u0000\u0000\u01b4"+
		"\u01b5\u0005\u0004\u0000\u0000\u01b5\u01b6\u0005\u0005\u0000\u0000\u01b6"+
		"\u01b7\u0005\u0003\u0000\u0000\u01b7\u01b8\u0005\b\u0000\u0000\u01b8\u01b9"+
		"\u0005\n\u0000\u0000\u01b9\u01ba\u0005\u0004\u0000\u0000\u01ba\u01bb\u0005"+
		"\u0005\u0000\u0000\u01bb\u01bc\u0005\u0003\u0000\u0000\u01bc\u01bd\u0005"+
		"\u0006\u0000\u0000\u01bd\u01be\u0005\u0004\u0000\u0000\u01be\u01bf\u0005"+
		"\n\u0000\u0000\u01bf\u01c0\u0005\u0003\u0000\u0000\u01c0\u01c1\u0005\n"+
		"\u0000\u0000\u01c1\u01c2\u0005\u0003\u0000\u0000\u01c2\u01c3\u0005\u0006"+
		"\u0000\u0000\u01c3\u01c4\u0005\u0004\u0000\u0000\u01c4\u01c5\u0006\u0004"+
		"\uffff\uffff\u0000\u01c5\u01c7\u0001\u0000\u0000\u0000\u01c6\u018d\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cb\u0005\u0005\u0000\u0000\u01cb\u01cc\u0005"+
		"\u0003\u0000\u0000\u01cc\u01cd\u0005\n\u0000\u0000\u01cd\u01ce\u0005\n"+
		"\u0000\u0000\u01ce\u01cf\u0005\u0003\u0000\u0000\u01cf\u01d0\u0005\n\u0000"+
		"\u0000\u01d0\u01d1\u0005\u0003\u0000\u0000\u01d1\u01d2\u0005\n\u0000\u0000"+
		"\u01d2\u01d3\u0005\u0003\u0000\u0000\u01d3\u01d4\u0005\n\u0000\u0000\u01d4"+
		"\u01d5\u0005\u0004\u0000\u0000\u01d5\t\u0001\u0000\u0000\u0000\u01d6\u01d7"+
		"\u0005\u0005\u0000\u0000\u01d7\u01d8\u0005\u0003\u0000\u0000\u01d8\u01d9"+
		"\u0005\n\u0000\u0000\u01d9\u01da\u0005\u0003\u0000\u0000\u01da\u01db\u0005"+
		"\n\u0000\u0000\u01db\u01dc\u0005\n\u0000\u0000\u01dc\u01dd\u0005\n\u0000"+
		"\u0000\u01dd\u01de\u0005\u0003\u0000\u0000\u01de\u01df\u0005\n\u0000\u0000"+
		"\u01df\u01e0\u0005\u0003\u0000\u0000\u01e0\u01e1\u0005\n\u0000\u0000\u01e1"+
		"\u0226\u0005\u0004\u0000\u0000\u01e2\u01e3\u0005\n\u0000\u0000\u01e3\u01e4"+
		"\u0005\u0003\u0000\u0000\u01e4\u01e5\u0005\u0004\u0000\u0000\u01e5\u01e6"+
		"\u0005\n\u0000\u0000\u01e6\u01e7\u0005\u0003\u0000\u0000\u01e7\u01e8\u0005"+
		"\n\u0000\u0000\u01e8\u01e9\u0005\u0003\u0000\u0000\u01e9\u01ea\u0005\n"+
		"\u0000\u0000\u01ea\u01eb\u0005\u0003\u0000\u0000\u01eb\u01ec\u0005\n\u0000"+
		"\u0000\u01ec\u01ed\u0005\u0003\u0000\u0000\u01ed\u01ee\u0005\n\u0000\u0000"+
		"\u01ee\u01ef\u0005\u0003\u0000\u0000\u01ef\u01f0\u0005\n\u0000\u0000\u01f0"+
		"\u01f1\u0005\u0003\u0000\u0000\u01f1\u01f2\u0005\n\u0000\u0000\u01f2\u01f3"+
		"\u0005\u0003\u0000\u0000\u01f3\u01f4\u0005\n\u0000\u0000\u01f4\u01f5\u0005"+
		"\u0003\u0000\u0000\u01f5\u01f6\u0005\n\u0000\u0000\u01f6\u01f7\u0005\u0003"+
		"\u0000\u0000\u01f7\u01f8\u0005\n\u0000\u0000\u01f8\u01f9\u0005\u0003\u0000"+
		"\u0000\u01f9\u01fa\u0005\n\u0000\u0000\u01fa\u01fb\u0005\u0003\u0000\u0000"+
		"\u01fb\u021b\u0005\u0004\u0000\u0000\u01fc\u01fd\u0005\n\u0000\u0000\u01fd"+
		"\u01fe\u0005\u0003\u0000\u0000\u01fe\u01ff\u0005\b\u0000\u0000\u01ff\u0201"+
		"\u0005\u0003\u0000\u0000\u0200\u0202\u0005\b\u0000\u0000\u0201\u0200\u0001"+
		"\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0203\u0001"+
		"\u0000\u0000\u0000\u0203\u0205\u0005\u0003\u0000\u0000\u0204\u0206\u0003"+
		"\u0012\t\u0000\u0205\u0204\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000"+
		"\u0000\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000"+
		"\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u020a\u0005\u0003"+
		"\u0000\u0000\u020a\u020b\u0005\n\u0000\u0000\u020b\u020c\u0005\u0003\u0000"+
		"\u0000\u020c\u020d\u0005\n\u0000\u0000\u020d\u020e\u0005\u0003\u0000\u0000"+
		"\u020e\u020f\u0005\b\u0000\u0000\u020f\u0210\u0005\u0003\u0000\u0000\u0210"+
		"\u0211\u0005\b\u0000\u0000\u0211\u0212\u0005\u0003\u0000\u0000\u0212\u0213"+
		"\u0005\b\u0000\u0000\u0213\u0214\u0005\u0003\u0000\u0000\u0214\u0215\u0005"+
		"\b\u0000\u0000\u0215\u0216\u0005\u0003\u0000\u0000\u0216\u0217\u0005\b"+
		"\u0000\u0000\u0217\u0218\u0005\u0003\u0000\u0000\u0218\u0219\u0005\u0004"+
		"\u0000\u0000\u0219\u021a\u0006\u0005\uffff\uffff\u0000\u021a\u021c\u0001"+
		"\u0000\u0000\u0000\u021b\u01fc\u0001\u0000\u0000\u0000\u021c\u021d\u0001"+
		"\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021d\u021e\u0001"+
		"\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0220\u0005"+
		"\n\u0000\u0000\u0220\u0221\u0005\u0003\u0000\u0000\u0221\u0222\u0005\n"+
		"\u0000\u0000\u0222\u0223\u0005\u0003\u0000\u0000\u0223\u0224\u0005\u0006"+
		"\u0000\u0000\u0224\u0225\u0005\u0004\u0000\u0000\u0225\u0227\u0001\u0000"+
		"\u0000\u0000\u0226\u01e2\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000"+
		"\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000"+
		"\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u022b\u0005\u0005"+
		"\u0000\u0000\u022b\u022c\u0005\u0003\u0000\u0000\u022c\u022d\u0005\n\u0000"+
		"\u0000\u022d\u022e\u0005\u0003\u0000\u0000\u022e\u022f\u0005\n\u0000\u0000"+
		"\u022f\u0230\u0005\n\u0000\u0000\u0230\u0231\u0005\n\u0000\u0000\u0231"+
		"\u0232\u0005\u0003\u0000\u0000\u0232\u0233\u0005\n\u0000\u0000\u0233\u0234"+
		"\u0005\u0003\u0000\u0000\u0234\u0235\u0005\n\u0000\u0000\u0235\u0236\u0005"+
		"\u0004\u0000\u0000\u0236\u000b\u0001\u0000\u0000\u0000\u0237\u0238\u0005"+
		"\u0005\u0000\u0000\u0238\u0239\u0005\u0003\u0000\u0000\u0239\u023a\u0005"+
		"\n\u0000\u0000\u023a\u023b\u0005\n\u0000\u0000\u023b\u023c\u0005\u0003"+
		"\u0000\u0000\u023c\u023d\u0005\n\u0000\u0000\u023d\u023e\u0005\u0003\u0000"+
		"\u0000\u023e\u023f\u0005\n\u0000\u0000\u023f\u0291\u0005\u0004\u0000\u0000"+
		"\u0240\u0241\u0005\u0005\u0000\u0000\u0241\u0242\u0005\u0003\u0000\u0000"+
		"\u0242\u0243\u0005\b\u0000\u0000\u0243\u0247\u0005\u0003\u0000\u0000\u0244"+
		"\u0246\u0003\u0012\t\u0000\u0245\u0244\u0001\u0000\u0000\u0000\u0246\u0249"+
		"\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0247\u0248"+
		"\u0001\u0000\u0000\u0000\u0248\u024a\u0001\u0000\u0000\u0000\u0249\u0247"+
		"\u0001\u0000\u0000\u0000\u024a\u024b\u0005\u0004\u0000\u0000\u024b\u024d"+
		"\u0003\u0012\t\u0000\u024c\u024e\u0003\u0012\t\u0000\u024d\u024c\u0001"+
		"\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u0250\u0001"+
		"\u0000\u0000\u0000\u024f\u0251\u0003\u0012\t\u0000\u0250\u024f\u0001\u0000"+
		"\u0000\u0000\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0253\u0001\u0000"+
		"\u0000\u0000\u0252\u0254\u0003\u0012\t\u0000\u0253\u0252\u0001\u0000\u0000"+
		"\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0256\u0001\u0000\u0000"+
		"\u0000\u0255\u0257\u0003\u0012\t\u0000\u0256\u0255\u0001\u0000\u0000\u0000"+
		"\u0256\u0257\u0001\u0000\u0000\u0000\u0257\u0259\u0001\u0000\u0000\u0000"+
		"\u0258\u025a\u0003\u0012\t\u0000\u0259\u0258\u0001\u0000\u0000\u0000\u0259"+
		"\u025a\u0001\u0000\u0000\u0000\u025a\u025c\u0001\u0000\u0000\u0000\u025b"+
		"\u025d\u0003\u0012\t\u0000\u025c\u025b\u0001\u0000\u0000\u0000\u025c\u025d"+
		"\u0001\u0000\u0000\u0000\u025d\u0261\u0001\u0000\u0000\u0000\u025e\u0260"+
		"\u0003\u0012\t\u0000\u025f\u025e\u0001\u0000\u0000\u0000\u0260\u0263\u0001"+
		"\u0000\u0000\u0000\u0261\u025f\u0001\u0000\u0000\u0000\u0261\u0262\u0001"+
		"\u0000\u0000\u0000\u0262\u0264\u0001\u0000\u0000\u0000\u0263\u0261\u0001"+
		"\u0000\u0000\u0000\u0264\u0265\u0005\u0004\u0000\u0000\u0265\u0267\u0003"+
		"\u0012\t\u0000\u0266\u0268\u0003\u0012\t\u0000\u0267\u0266\u0001\u0000"+
		"\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268\u026a\u0001\u0000"+
		"\u0000\u0000\u0269\u026b\u0003\u0012\t\u0000\u026a\u0269\u0001\u0000\u0000"+
		"\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026d\u0001\u0000\u0000"+
		"\u0000\u026c\u026e\u0003\u0012\t\u0000\u026d\u026c\u0001\u0000\u0000\u0000"+
		"\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u0270\u0001\u0000\u0000\u0000"+
		"\u026f\u0271\u0003\u0012\t\u0000\u0270\u026f\u0001\u0000\u0000\u0000\u0270"+
		"\u0271\u0001\u0000\u0000\u0000\u0271\u0273\u0001\u0000\u0000\u0000\u0272"+
		"\u0274\u0003\u0012\t\u0000\u0273\u0272\u0001\u0000\u0000\u0000\u0273\u0274"+
		"\u0001\u0000\u0000\u0000\u0274\u0276\u0001\u0000\u0000\u0000\u0275\u0277"+
		"\u0003\u0012\t\u0000\u0276\u0275\u0001\u0000\u0000\u0000\u0276\u0277\u0001"+
		"\u0000\u0000\u0000\u0277\u027b\u0001\u0000\u0000\u0000\u0278\u027a\u0003"+
		"\u0012\t\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u027a\u027d\u0001\u0000"+
		"\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027b\u027c\u0001\u0000"+
		"\u0000\u0000\u027c\u027e\u0001\u0000\u0000\u0000\u027d\u027b\u0001\u0000"+
		"\u0000\u0000\u027e\u027f\u0005\u0004\u0000\u0000\u027f\u0283\u0005\u0006"+
		"\u0000\u0000\u0280\u0282\u0005\n\u0000\u0000\u0281\u0280\u0001\u0000\u0000"+
		"\u0000\u0282\u0285\u0001\u0000\u0000\u0000\u0283\u0281\u0001\u0000\u0000"+
		"\u0000\u0283\u0284\u0001\u0000\u0000\u0000\u0284\u0286\u0001\u0000\u0000"+
		"\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0286\u0287\u0005\u0004\u0000"+
		"\u0000\u0287\u0288\u0003\u0012\t\u0000\u0288\u0289\u0005\u0004\u0000\u0000"+
		"\u0289\u028a\u0005\n\u0000\u0000\u028a\u028b\u0005\u0003\u0000\u0000\u028b"+
		"\u028c\u0005\n\u0000\u0000\u028c\u028d\u0005\u0003\u0000\u0000\u028d\u028e"+
		"\u0005\u0006\u0000\u0000\u028e\u028f\u0005\u0004\u0000\u0000\u028f\u0290"+
		"\u0006\u0006\uffff\uffff\u0000\u0290\u0292\u0001\u0000\u0000\u0000\u0291"+
		"\u0240\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293"+
		"\u0291\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294"+
		"\u0295\u0001\u0000\u0000\u0000\u0295\u0296\u0005\u0005\u0000\u0000\u0296"+
		"\u0297\u0005\u0003\u0000\u0000\u0297\u0298\u0005\n\u0000\u0000\u0298\u0299"+
		"\u0005\n\u0000\u0000\u0299\u029a\u0005\u0003\u0000\u0000\u029a\u029b\u0005"+
		"\n\u0000\u0000\u029b\u029c\u0005\u0003\u0000\u0000\u029c\u029d\u0005\n"+
		"\u0000\u0000\u029d\u029e\u0005\u0004\u0000\u0000\u029e\r\u0001\u0000\u0000"+
		"\u0000\u029f\u02a0\u0005\u0005\u0000\u0000\u02a0\u02a1\u0005\u0003\u0000"+
		"\u0000\u02a1\u02a2\u0005\n\u0000\u0000\u02a2\u02a3\u0005\n\u0000\u0000"+
		"\u02a3\u02a4\u0005\n\u0000\u0000\u02a4\u02a5\u0005\u0003\u0000\u0000\u02a5"+
		"\u02a6\u0005\n\u0000\u0000\u02a6\u02a7\u0005\n\u0000\u0000\u02a7\u02a8"+
		"\u0005\n\u0000\u0000\u02a8\u02a9\u0005\u0003\u0000\u0000\u02a9\u02aa\u0005"+
		"\n\u0000\u0000\u02aa\u02ab\u0005\u0003\u0000\u0000\u02ab\u02ac\u0005\n"+
		"\u0000\u0000\u02ac\u0316\u0005\u0004\u0000\u0000\u02ad\u02ae\u0005\u0005"+
		"\u0000\u0000\u02ae\u02af\u0005\u0003\u0000\u0000\u02af\u02b0\u0005\b\u0000"+
		"\u0000\u02b0\u02b1\u0005\u0004\u0000\u0000\u02b1\u02b2\u0005\n\u0000\u0000"+
		"\u02b2\u02b3\u0005\u0003\u0000\u0000\u02b3\u02b4\u0005\u0003\u0000\u0000"+
		"\u02b4\u02b5\u0005\n\u0000\u0000\u02b5\u02b6\u0005\u0003\u0000\u0000\u02b6"+
		"\u02b7\u0005\n\u0000\u0000\u02b7\u02b8\u0005\u0003\u0000\u0000\u02b8\u02b9"+
		"\u0005\n\u0000\u0000\u02b9\u02ba\u0005\u0003\u0000\u0000\u02ba\u02bb\u0005"+
		"\n\u0000\u0000\u02bb\u02bc\u0005\u0003\u0000\u0000\u02bc\u02bd\u0005\n"+
		"\u0000\u0000\u02bd\u02be\u0005\u0003\u0000\u0000\u02be\u02bf\u0005\n\u0000"+
		"\u0000\u02bf\u02c0\u0005\u0003\u0000\u0000\u02c0\u02c1\u0005\n\u0000\u0000"+
		"\u02c1\u02c2\u0005\u0003\u0000\u0000\u02c2\u02c3\u0005\n\u0000\u0000\u02c3"+
		"\u02c4\u0005\u0003\u0000\u0000\u02c4\u030c\u0005\u0004\u0000\u0000\u02c5"+
		"\u02c7\u0003\u0012\t\u0000\u02c6\u02c8\u0003\u0012\t\u0000\u02c7\u02c6"+
		"\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8\u02ca"+
		"\u0001\u0000\u0000\u0000\u02c9\u02cb\u0003\u0012\t\u0000\u02ca\u02c9\u0001"+
		"\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb\u02cd\u0001"+
		"\u0000\u0000\u0000\u02cc\u02ce\u0003\u0012\t\u0000\u02cd\u02cc\u0001\u0000"+
		"\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce\u02d0\u0001\u0000"+
		"\u0000\u0000\u02cf\u02d1\u0003\u0012\t\u0000\u02d0\u02cf\u0001\u0000\u0000"+
		"\u0000\u02d0\u02d1\u0001\u0000\u0000\u0000\u02d1\u02d3\u0001\u0000\u0000"+
		"\u0000\u02d2\u02d4\u0003\u0012\t\u0000\u02d3\u02d2\u0001\u0000\u0000\u0000"+
		"\u02d3\u02d4\u0001\u0000\u0000\u0000\u02d4\u02d6\u0001\u0000\u0000\u0000"+
		"\u02d5\u02d7\u0003\u0012\t\u0000\u02d6\u02d5\u0001\u0000\u0000\u0000\u02d6"+
		"\u02d7\u0001\u0000\u0000\u0000\u02d7\u02db\u0001\u0000\u0000\u0000\u02d8"+
		"\u02da\u0003\u0012\t\u0000\u02d9\u02d8\u0001\u0000\u0000\u0000\u02da\u02dd"+
		"\u0001\u0000\u0000\u0000\u02db\u02d9\u0001\u0000\u0000\u0000\u02db\u02dc"+
		"\u0001\u0000\u0000\u0000\u02dc\u02de\u0001\u0000\u0000\u0000\u02dd\u02db"+
		"\u0001\u0000\u0000\u0000\u02de\u02df\u0005\u0003\u0000\u0000\u02df\u02e0"+
		"\u0005\u0003\u0000\u0000\u02e0\u02e1\u0005\n\u0000\u0000\u02e1\u02e5\u0005"+
		"\u0003\u0000\u0000\u02e2\u02e4\u0003\u0012\t\u0000\u02e3\u02e2\u0001\u0000"+
		"\u0000\u0000\u02e4\u02e7\u0001\u0000\u0000\u0000\u02e5\u02e3\u0001\u0000"+
		"\u0000\u0000\u02e5\u02e6\u0001\u0000\u0000\u0000\u02e6\u02e8\u0001\u0000"+
		"\u0000\u0000\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e8\u02ea\u0005\u0003"+
		"\u0000\u0000\u02e9\u02eb\u0005\u0006\u0000\u0000\u02ea\u02e9\u0001\u0000"+
		"\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000"+
		"\u0000\u0000\u02ec\u02ed\u0005\u0003\u0000\u0000\u02ed\u02ee\u0005\u0006"+
		"\u0000\u0000\u02ee\u02f0\u0005\u0003\u0000\u0000\u02ef\u02f1\u0005\n\u0000"+
		"\u0000\u02f0\u02ef\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000"+
		"\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f3\u0005\u0003\u0000"+
		"\u0000\u02f3\u02f4\u0005\b\u0000\u0000\u02f4\u02f6\u0005\u0003\u0000\u0000"+
		"\u02f5\u02f7\u0005\b\u0000\u0000\u02f6\u02f5\u0001\u0000\u0000\u0000\u02f6"+
		"\u02f7\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8"+
		"\u02fa\u0005\u0003\u0000\u0000\u02f9\u02fb\u0005\b\u0000\u0000\u02fa\u02f9"+
		"\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb\u02fc"+
		"\u0001\u0000\u0000\u0000\u02fc\u02fd\u0005\u0003\u0000\u0000\u02fd\u02fe"+
		"\u0005\u0004\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000\u0000\u02ff\u0300"+
		"\u0006\u0007\uffff\uffff\u0000\u0300\u030d\u0001\u0000\u0000\u0000\u0301"+
		"\u0302\u0005\u0003\u0000\u0000\u0302\u0303\u0005\u0003\u0000\u0000\u0303"+
		"\u0304\u0005\u0003\u0000\u0000\u0304\u0305\u0005\u0003\u0000\u0000\u0305"+
		"\u0306\u0005\u0003\u0000\u0000\u0306\u0307\u0005\u0003\u0000\u0000\u0307"+
		"\u0308\u0005\u0003\u0000\u0000\u0308\u0309\u0005\u0003\u0000\u0000\u0309"+
		"\u030a\u0005\u0003\u0000\u0000\u030a\u030b\u0005\u0003\u0000\u0000\u030b"+
		"\u030d\u0005\u0004\u0000\u0000\u030c\u02c5\u0001\u0000\u0000\u0000\u030c"+
		"\u0301\u0001\u0000\u0000\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e"+
		"\u030c\u0001\u0000\u0000\u0000\u030e\u030f\u0001\u0000\u0000\u0000\u030f"+
		"\u0310\u0001\u0000\u0000\u0000\u0310\u0311\u0005\n\u0000\u0000\u0311\u0312"+
		"\u0005\u0003\u0000\u0000\u0312\u0313\u0005\n\u0000\u0000\u0313\u0314\u0005"+
		"\u0003\u0000\u0000\u0314\u0315\u0005\u0006\u0000\u0000\u0315\u0317\u0005"+
		"\u0004\u0000\u0000\u0316\u02ad\u0001\u0000\u0000\u0000\u0317\u0318\u0001"+
		"\u0000\u0000\u0000\u0318\u0316\u0001\u0000\u0000\u0000\u0318\u0319\u0001"+
		"\u0000\u0000\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031a\u031b\u0005"+
		"\u0005\u0000\u0000\u031b\u031c\u0005\u0003\u0000\u0000\u031c\u031d\u0005"+
		"\n\u0000\u0000\u031d\u031e\u0005\n\u0000\u0000\u031e\u031f\u0005\n\u0000"+
		"\u0000\u031f\u0320\u0005\u0003\u0000\u0000\u0320\u0321\u0005\n\u0000\u0000"+
		"\u0321\u0322\u0005\n\u0000\u0000\u0322\u0323\u0005\n\u0000\u0000\u0323"+
		"\u0324\u0005\u0003\u0000\u0000\u0324\u0325\u0005\n\u0000\u0000\u0325\u0326"+
		"\u0005\u0003\u0000\u0000\u0326\u0327\u0005\n\u0000\u0000\u0327\u0328\u0005"+
		"\u0004\u0000\u0000\u0328\u000f\u0001\u0000\u0000\u0000\u0329\u032a\u0005"+
		"\u0005\u0000\u0000\u032a\u032b\u0005\u0003\u0000\u0000\u032b\u032c\u0005"+
		"\n\u0000\u0000\u032c\u032d\u0005\u0003\u0000\u0000\u032d\u032e\u0005\n"+
		"\u0000\u0000\u032e\u032f\u0005\n\u0000\u0000\u032f\u0330\u0005\n\u0000"+
		"\u0000\u0330\u0331\u0005\u0003\u0000\u0000\u0331\u0332\u0005\n\u0000\u0000"+
		"\u0332\u0333\u0005\u0003\u0000\u0000\u0333\u0334\u0005\n\u0000\u0000\u0334"+
		"\u03b4\u0005\u0004\u0000\u0000\u0335\u0336\u0005\n\u0000\u0000\u0336\u0337"+
		"\u0005\u0003\u0000\u0000\u0337\u0338\u0005\n\u0000\u0000\u0338\u0339\u0005"+
		"\u0004\u0000\u0000\u0339\u033a\u0005\n\u0000\u0000\u033a\u033b\u0005\u0003"+
		"\u0000\u0000\u033b\u033c\u0005\n\u0000\u0000\u033c\u033d\u0005\u0004\u0000"+
		"\u0000\u033d\u033e\u0005\n\u0000\u0000\u033e\u033f\u0005\u0003\u0000\u0000"+
		"\u033f\u0340\u0005\n\u0000\u0000\u0340\u0341\u0005\u0003\u0000\u0000\u0341"+
		"\u0342\u0005\n\u0000\u0000\u0342\u0343\u0005\u0003\u0000\u0000\u0343\u0344"+
		"\u0005\n\u0000\u0000\u0344\u0345\u0005\u0003\u0000\u0000\u0345\u0346\u0005"+
		"\n\u0000\u0000\u0346\u0347\u0005\u0003\u0000\u0000\u0347\u0348\u0005\n"+
		"\u0000\u0000\u0348\u0349\u0005\u0003\u0000\u0000\u0349\u034a\u0005\n\u0000"+
		"\u0000\u034a\u034b\u0005\u0003\u0000\u0000\u034b\u034c\u0005\n\u0000\u0000"+
		"\u034c\u034d\u0005\u0003\u0000\u0000\u034d\u034e\u0005\n\u0000\u0000\u034e"+
		"\u034f\u0005\u0003\u0000\u0000\u034f\u0350\u0005\n\u0000\u0000\u0350\u0351"+
		"\u0005\u0003\u0000\u0000\u0351\u0352\u0005\n\u0000\u0000\u0352\u0353\u0005"+
		"\u0003\u0000\u0000\u0353\u0354\u0005\n\u0000\u0000\u0354\u0355\u0005\u0003"+
		"\u0000\u0000\u0355\u0356\u0005\u0004\u0000\u0000\u0356\u0357\u0005\n\u0000"+
		"\u0000\u0357\u0358\u0005\u0003\u0000\u0000\u0358\u0359\u0005\n\u0000\u0000"+
		"\u0359\u035a\u0005\u0003\u0000\u0000\u035a\u035b\u0005\n\u0000\u0000\u035b"+
		"\u035c\u0005\u0003\u0000\u0000\u035c\u035d\u0005\n\u0000\u0000\u035d\u035e"+
		"\u0005\u0003\u0000\u0000\u035e\u035f\u0005\n\u0000\u0000\u035f\u0360\u0005"+
		"\u0003\u0000\u0000\u0360\u0361\u0005\n\u0000\u0000\u0361\u0362\u0005\u0003"+
		"\u0000\u0000\u0362\u03a6\u0005\u0004\u0000\u0000\u0363\u0364\u0005\u0003"+
		"\u0000\u0000\u0364\u0365\u0005\u0003\u0000\u0000\u0365\u0366\u0005\u0003"+
		"\u0000\u0000\u0366\u0367\u0005\u0003\u0000\u0000\u0367\u0368\u0005\u0003"+
		"\u0000\u0000\u0368\u0369\u0005\u0003\u0000\u0000\u0369\u036a\u0005\u0003"+
		"\u0000\u0000\u036a\u036b\u0005\u0003\u0000\u0000\u036b\u036c\u0005\u0003"+
		"\u0000\u0000\u036c\u036d\u0005\u0003\u0000\u0000\u036d\u036e\u0005\u0003"+
		"\u0000\u0000\u036e\u036f\u0005\u0003\u0000\u0000\u036f\u0370\u0005\u0003"+
		"\u0000\u0000\u0370\u0371\u0005\u0003\u0000\u0000\u0371\u0372\u0005\u0003"+
		"\u0000\u0000\u0372\u0373\u0005\u0003\u0000\u0000\u0373\u0374\u0005\u0003"+
		"\u0000\u0000\u0374\u03a7\u0005\u0004\u0000\u0000\u0375\u0376\u0005\u0006"+
		"\u0000\u0000\u0376\u0378\u0005\u0003\u0000\u0000\u0377\u0379\u0005\u0006"+
		"\u0000\u0000\u0378\u0377\u0001\u0000\u0000\u0000\u0378\u0379\u0001\u0000"+
		"\u0000\u0000\u0379\u037a\u0001\u0000\u0000\u0000\u037a\u037c\u0005\u0003"+
		"\u0000\u0000\u037b\u037d\u0005\u0006\u0000\u0000\u037c\u037b\u0001\u0000"+
		"\u0000\u0000\u037c\u037d\u0001\u0000\u0000\u0000\u037d\u037e\u0001\u0000"+
		"\u0000\u0000\u037e\u037f\u0005\u0003\u0000\u0000\u037f\u0380\u0005\b\u0000"+
		"\u0000\u0380\u0382\u0005\u0003\u0000\u0000\u0381\u0383\u0003\u0012\t\u0000"+
		"\u0382\u0381\u0001\u0000\u0000\u0000\u0383\u0384\u0001\u0000\u0000\u0000"+
		"\u0384\u0382\u0001\u0000\u0000\u0000\u0384\u0385\u0001\u0000\u0000\u0000"+
		"\u0385\u0386\u0001\u0000\u0000\u0000\u0386\u0387\u0005\u0003\u0000\u0000"+
		"\u0387\u0388\u0005\n\u0000\u0000\u0388\u0389\u0005\u0003\u0000\u0000\u0389"+
		"\u038a\u0005\n\u0000\u0000\u038a\u038b\u0005\u0003\u0000\u0000\u038b\u038c"+
		"\u0005\n\u0000\u0000\u038c\u038d\u0005\u0003\u0000\u0000\u038d\u038e\u0005"+
		"\n\u0000\u0000\u038e\u038f\u0005\u0003\u0000\u0000\u038f\u0390\u0005\b"+
		"\u0000\u0000\u0390\u0392\u0005\u0003\u0000\u0000\u0391\u0393\u0005\b\u0000"+
		"\u0000\u0392\u0391\u0001\u0000\u0000\u0000\u0392\u0393\u0001\u0000\u0000"+
		"\u0000\u0393\u0394\u0001\u0000\u0000\u0000\u0394\u0395\u0005\u0003\u0000"+
		"\u0000\u0395\u0396\u0005\b\u0000\u0000\u0396\u0397\u0005\u0003\u0000\u0000"+
		"\u0397\u0398\u0005\b\u0000\u0000\u0398\u039a\u0005\u0003\u0000\u0000\u0399"+
		"\u039b\u0005\b\u0000\u0000\u039a\u0399\u0001\u0000\u0000\u0000\u039a\u039b"+
		"\u0001\u0000\u0000\u0000\u039b\u039c\u0001\u0000\u0000\u0000\u039c\u039d"+
		"\u0005\u0003\u0000\u0000\u039d\u039e\u0005\u0003\u0000\u0000\u039e\u039f"+
		"\u0005\b\u0000\u0000\u039f\u03a0\u0005\u0003\u0000\u0000\u03a0\u03a1\u0005"+
		"\b\u0000\u0000\u03a1\u03a2\u0005\u0003\u0000\u0000\u03a2\u03a3\u0005\u0004"+
		"\u0000\u0000\u03a3\u03a4\u0001\u0000\u0000\u0000\u03a4\u03a5\u0006\b\uffff"+
		"\uffff\u0000\u03a5\u03a7\u0001\u0000\u0000\u0000\u03a6\u0363\u0001\u0000"+
		"\u0000\u0000\u03a6\u0375\u0001\u0000\u0000\u0000\u03a7\u03a8\u0001\u0000"+
		"\u0000\u0000\u03a8\u03a6\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000"+
		"\u0000\u0000\u03a9\u03ab\u0001\u0000\u0000\u0000\u03aa\u0335\u0001\u0000"+
		"\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000\u0000\u03ac\u03aa\u0001\u0000"+
		"\u0000\u0000\u03ac\u03ad\u0001\u0000\u0000\u0000\u03ad\u03ae\u0001\u0000"+
		"\u0000\u0000\u03ae\u03af\u0005\n\u0000\u0000\u03af\u03b0\u0005\u0003\u0000"+
		"\u0000\u03b0\u03b1\u0005\n\u0000\u0000\u03b1\u03b2\u0005\u0003\u0000\u0000"+
		"\u03b2\u03b3\u0005\u0006\u0000\u0000\u03b3\u03b5\u0005\u0004\u0000\u0000"+
		"\u03b4\u03aa\u0001\u0000\u0000\u0000\u03b5\u03b6\u0001\u0000\u0000\u0000"+
		"\u03b6\u03b4\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000"+
		"\u03b7\u03b8\u0001\u0000\u0000\u0000\u03b8\u03b9\u0005\u0005\u0000\u0000"+
		"\u03b9\u03ba\u0005\u0003\u0000\u0000\u03ba\u03bb\u0005\n\u0000\u0000\u03bb"+
		"\u03bc\u0005\u0003\u0000\u0000\u03bc\u03bd\u0005\n\u0000\u0000\u03bd\u03be"+
		"\u0005\n\u0000\u0000\u03be\u03bf\u0005\n\u0000\u0000\u03bf\u03c0\u0005"+
		"\u0003\u0000\u0000\u03c0\u03c1\u0005\n\u0000\u0000\u03c1\u03c2\u0005\u0003"+
		"\u0000\u0000\u03c2\u03c3\u0005\n\u0000\u0000\u03c3\u03c4\u0005\u0004\u0000"+
		"\u0000\u03c4\u0011\u0001\u0000\u0000\u0000\u03c5\u03c6\u0007\u0000\u0000"+
		"\u0000\u03c6\u0013\u0001\u0000\u0000\u0000\u03c7\u03ca\u0003\u0012\t\u0000"+
		"\u03c8\u03ca\u0005\u0003\u0000\u0000\u03c9\u03c7\u0001\u0000\u0000\u0000"+
		"\u03c9\u03c8\u0001\u0000\u0000\u0000\u03ca\u03cb\u0001\u0000\u0000\u0000"+
		"\u03cb\u03c9\u0001\u0000\u0000\u0000\u03cb\u03cc\u0001\u0000\u0000\u0000"+
		"\u03cc\u03cd\u0001\u0000\u0000\u0000\u03cd\u03ce\u0005\u0004\u0000\u0000"+
		"\u03ce\u0015\u0001\u0000\u0000\u0000\u03cf\u03d3\u0003\u0012\t\u0000\u03d0"+
		"\u03d3\u0005\u0003\u0000\u0000\u03d1\u03d3\u0005\u0004\u0000\u0000\u03d2"+
		"\u03cf\u0001\u0000\u0000\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000\u03d2"+
		"\u03d1\u0001\u0000\u0000\u0000\u03d3\u03d4\u0001\u0000\u0000\u0000\u03d4"+
		"\u03d2\u0001\u0000\u0000\u0000\u03d4\u03d5\u0001\u0000\u0000\u0000\u03d5"+
		"\u0017\u0001\u0000\u0000\u0000\\ UX[^adiqtwz}\u0080\u0085\u0092\u009b"+
		"\u00a5\u00b0\u00cf\u00ed\u00f1\u00f5\u00f9\u00fd\u0105\u010a\u010c\u0110"+
		"\u011b\u0139\u0163\u0165\u0169\u0174\u0195\u0198\u019b\u019e\u01a1\u01a4"+
		"\u01a9\u01c8\u0201\u0207\u021d\u0228\u0247\u024d\u0250\u0253\u0256\u0259"+
		"\u025c\u0261\u0267\u026a\u026d\u0270\u0273\u0276\u027b\u0283\u0293\u02c7"+
		"\u02ca\u02cd\u02d0\u02d3\u02d6\u02db\u02e5\u02ea\u02f0\u02f6\u02fa\u030c"+
		"\u030e\u0318\u0378\u037c\u0384\u0392\u039a\u03a6\u03a8\u03ac\u03b6\u03c9"+
		"\u03cb\u03d2\u03d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}