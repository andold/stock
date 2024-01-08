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
			setState(230); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(230);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
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
				case WORD:
					{
					setState(220); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(218);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
							case 1:
								{
								{
								setState(51);
								match(WORD);
								setState(52);
								match(TAB);
								setState(53);
								match(NUMBER);
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
								match(NEWLINE);
								setState(106); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(78);
										match(WORD);
										setState(79);
										match(TAB);
										setState(80);
										((CrawlPriceKrxContext)_localctx).code = match(NUMBER);
										setState(81);
										match(TAB);
										setState(82);
										((CrawlPriceKrxContext)_localctx).base = match(DATE);
										setState(83);
										match(TAB);
										setState(84);
										((CrawlPriceKrxContext)_localctx).closing = match(NUMBER);
										setState(85);
										match(TAB);
										setState(86);
										match(NUMBER);
										setState(87);
										match(TAB);
										setState(88);
										match(NUMBER);
										setState(89);
										match(TAB);
										setState(90);
										((CrawlPriceKrxContext)_localctx).market = match(NUMBER);
										setState(91);
										match(TAB);
										setState(92);
										((CrawlPriceKrxContext)_localctx).high = match(NUMBER);
										setState(93);
										match(TAB);
										setState(94);
										((CrawlPriceKrxContext)_localctx).low = match(NUMBER);
										setState(95);
										match(TAB);
										setState(96);
										((CrawlPriceKrxContext)_localctx).volume = match(NUMBER);
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
										match(NUMBER);
										setState(103);
										match(TAB);
										setState(104);
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
									setState(108); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
								} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
								}
								}
								break;
							case 2:
								{
								{
								setState(110);
								match(WORD);
								setState(111);
								match(TAB);
								setState(112);
								match(NUMBER);
								setState(113);
								match(TAB);
								setState(114);
								match(WORD);
								setState(115);
								match(TAB);
								setState(116);
								match(WORD);
								setState(117);
								match(TAB);
								setState(118);
								match(WORD);
								setState(119);
								match(TAB);
								setState(120);
								match(WORD);
								setState(121);
								match(TAB);
								setState(122);
								match(WORD);
								setState(123);
								match(TAB);
								setState(124);
								match(WORD);
								setState(125);
								match(TAB);
								setState(126);
								match(WORD);
								setState(127);
								match(TAB);
								setState(128);
								match(WORD);
								setState(129);
								match(TAB);
								setState(130);
								match(WORD);
								setState(131);
								match(TAB);
								setState(132);
								match(WORD);
								setState(133);
								match(TAB);
								setState(134);
								match(WORD);
								setState(135);
								match(TAB);
								setState(136);
								match(WORD);
								setState(137);
								match(TAB);
								setState(138);
								match(WORD);
								setState(139);
								match(TAB);
								setState(140);
								match(WORD);
								setState(141);
								match(TAB);
								setState(142);
								match(WORD);
								setState(143);
								match(TAB);
								setState(144);
								match(WORD);
								setState(145);
								match(TAB);
								setState(146);
								match(WORD);
								setState(147);
								match(TAB);
								setState(148);
								match(NEWLINE);
								setState(214); 
								_errHandler.sync(this);
								_alt = 1;
								do {
									switch (_alt) {
									case 1:
										{
										{
										setState(149);
										match(WORD);
										setState(150);
										match(TAB);
										setState(151);
										((CrawlPriceKrxContext)_localctx).code = match(NUMBER);
										setState(152);
										match(TAB);
										setState(153);
										((CrawlPriceKrxContext)_localctx).base = match(DATE);
										setState(154);
										match(TAB);
										setState(155);
										((CrawlPriceKrxContext)_localctx).closing = match(NUMBER);
										setState(156);
										match(TAB);
										setState(157);
										match(NUMBER);
										setState(158);
										match(TAB);
										setState(159);
										match(NUMBER);
										setState(160);
										match(TAB);
										setState(161);
										match(NUMBER);
										setState(162);
										match(TAB);
										setState(163);
										((CrawlPriceKrxContext)_localctx).market = match(NUMBER);
										setState(164);
										match(TAB);
										setState(165);
										((CrawlPriceKrxContext)_localctx).high = match(NUMBER);
										setState(166);
										match(TAB);
										setState(167);
										((CrawlPriceKrxContext)_localctx).low = match(NUMBER);
										setState(168);
										match(TAB);
										setState(169);
										((CrawlPriceKrxContext)_localctx).volume = match(NUMBER);
										setState(170);
										match(TAB);
										setState(171);
										match(NUMBER);
										setState(172);
										match(TAB);
										setState(173);
										match(NUMBER);
										setState(174);
										match(TAB);
										setState(175);
										match(NUMBER);
										setState(176);
										match(TAB);
										setState(177);
										match(NUMBER);
										setState(178);
										match(TAB);
										setState(179);
										((CrawlPriceKrxContext)_localctx).symbol = word();
										setState(181);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
										case 1:
											{
											setState(180);
											((CrawlPriceKrxContext)_localctx).symbol1 = word();
											}
											break;
										}
										setState(184);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
										case 1:
											{
											setState(183);
											((CrawlPriceKrxContext)_localctx).symbol2 = word();
											}
											break;
										}
										setState(187);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
										case 1:
											{
											setState(186);
											((CrawlPriceKrxContext)_localctx).symbol3 = word();
											}
											break;
										}
										setState(190);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
										case 1:
											{
											setState(189);
											((CrawlPriceKrxContext)_localctx).symbol4 = word();
											}
											break;
										}
										setState(193);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
										case 1:
											{
											setState(192);
											((CrawlPriceKrxContext)_localctx).symbol5 = word();
											}
											break;
										}
										setState(196);
										_errHandler.sync(this);
										switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
										case 1:
											{
											setState(195);
											((CrawlPriceKrxContext)_localctx).symbol6 = word();
											}
											break;
										}
										setState(201);
										_errHandler.sync(this);
										_la = _input.LA(1);
										while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
											{
											{
											setState(198);
											((CrawlPriceKrxContext)_localctx).symbol7 = word();
											}
											}
											setState(203);
											_errHandler.sync(this);
											_la = _input.LA(1);
										}
										setState(204);
										match(TAB);
										setState(205);
										match(NUMBER);
										setState(206);
										match(TAB);
										setState(207);
										match(NUMBER);
										setState(208);
										match(TAB);
										setState(209);
										match(NUMBER);
										setState(210);
										match(TAB);
										setState(211);
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
									setState(216); 
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
						setState(222); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(224);
					match(WORD);
					setState(225);
					match(TAB);
					setState(226);
					match(WORD);
					setState(227);
					match(TAB);
					setState(228);
					match(DATE);
					setState(229);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER || _la==WORD );
			setState(234);
			match(KEYWORD);
			setState(235);
			match(TAB);
			setState(236);
			match(WORD);
			setState(237);
			match(TAB);
			setState(238);
			match(WORD);
			setState(239);
			match(TAB);
			setState(240);
			match(WORD);
			setState(241);
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
			setState(243);
			match(KEYWORD);
			setState(244);
			match(TAB);
			setState(245);
			match(WORD);
			setState(246);
			match(TAB);
			setState(247);
			match(WORD);
			setState(248);
			match(WORD);
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
			match(NEWLINE);
			setState(383); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(255);
				match(WORD);
				setState(256);
				match(TAB);
				setState(257);
				match(NEWLINE);
				setState(258);
				match(WORD);
				setState(259);
				match(TAB);
				setState(260);
				match(WORD);
				setState(261);
				match(TAB);
				setState(262);
				match(WORD);
				setState(263);
				match(TAB);
				setState(264);
				match(TAB);
				setState(265);
				match(WORD);
				setState(266);
				match(TAB);
				setState(267);
				match(WORD);
				setState(268);
				match(TAB);
				setState(269);
				match(WORD);
				setState(270);
				match(TAB);
				setState(271);
				match(WORD);
				setState(272);
				match(NEWLINE);
				setState(273);
				match(WORD);
				setState(274);
				match(TAB);
				setState(275);
				match(TAB);
				setState(276);
				match(TAB);
				setState(277);
				match(WORD);
				setState(278);
				match(TAB);
				setState(279);
				match(TAB);
				setState(280);
				match(TAB);
				setState(281);
				match(TAB);
				setState(282);
				match(TAB);
				setState(283);
				match(TAB);
				setState(284);
				match(WORD);
				setState(285);
				match(TAB);
				setState(286);
				match(WORD);
				setState(287);
				match(TAB);
				setState(288);
				match(NEWLINE);
				setState(372); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(289);
						((CrawlItemEtfContext)_localctx).type = match(WORD);
						setState(290);
						match(TAB);
						setState(291);
						match(TAB);
						setState(292);
						((CrawlItemEtfContext)_localctx).symbol = word();
						setState(294);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
						case 1:
							{
							setState(293);
							((CrawlItemEtfContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(297);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
						case 1:
							{
							setState(296);
							((CrawlItemEtfContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(300);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
						case 1:
							{
							setState(299);
							((CrawlItemEtfContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(303);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
						case 1:
							{
							setState(302);
							((CrawlItemEtfContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(306);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
						case 1:
							{
							setState(305);
							((CrawlItemEtfContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(309);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
						case 1:
							{
							setState(308);
							((CrawlItemEtfContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(314);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(311);
							((CrawlItemEtfContext)_localctx).symbol7 = word();
							}
							}
							setState(316);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(317);
						match(TAB);
						setState(318);
						((CrawlItemEtfContext)_localctx).code = match(NUMBER);
						setState(319);
						match(TAB);
						setState(320);
						((CrawlItemEtfContext)_localctx).category = word();
						setState(322);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
						case 1:
							{
							setState(321);
							((CrawlItemEtfContext)_localctx).category1 = word();
							}
							break;
						}
						setState(325);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
							{
							setState(324);
							((CrawlItemEtfContext)_localctx).category2 = word();
							}
							break;
						}
						setState(328);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
						case 1:
							{
							setState(327);
							((CrawlItemEtfContext)_localctx).category3 = word();
							}
							break;
						}
						setState(331);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
						case 1:
							{
							setState(330);
							((CrawlItemEtfContext)_localctx).category4 = word();
							}
							break;
						}
						setState(334);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
						case 1:
							{
							setState(333);
							((CrawlItemEtfContext)_localctx).category5 = word();
							}
							break;
						}
						setState(337);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
						case 1:
							{
							setState(336);
							((CrawlItemEtfContext)_localctx).category6 = word();
							}
							break;
						}
						setState(342);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(339);
							((CrawlItemEtfContext)_localctx).category7 = word();
							}
							}
							setState(344);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(345);
						match(TAB);
						setState(346);
						((CrawlItemEtfContext)_localctx).asset = match(NUMBER);
						setState(347);
						match(TAB);
						setState(348);
						((CrawlItemEtfContext)_localctx).closing = match(NUMBER);
						setState(349);
						match(TAB);
						setState(350);
						((CrawlItemEtfContext)_localctx).amount = match(NUMBER);
						setState(351);
						match(TAB);
						setState(352);
						match(TAB);
						setState(353);
						match(TAB);
						setState(355);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(354);
							((CrawlItemEtfContext)_localctx).priceEarningsRatio = match(NUMBER);
							}
						}

						setState(357);
						match(TAB);
						setState(358);
						match(TAB);
						setState(359);
						match(TAB);
						setState(360);
						match(TAB);
						setState(361);
						match(TAB);
						setState(362);
						match(TAB);
						setState(364);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(363);
							((CrawlItemEtfContext)_localctx).fee = match(NUMBER);
							}
						}

						setState(366);
						match(TAB);
						setState(367);
						((CrawlItemEtfContext)_localctx).operator = match(WORD);
						setState(368);
						match(TAB);
						setState(369);
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
					setState(374); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(376);
				match(WORD);
				setState(377);
				match(TAB);
				setState(378);
				match(WORD);
				setState(379);
				match(TAB);
				setState(380);
				match(DATE);
				setState(381);
				match(NEWLINE);
				}
				}
				setState(385); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(387);
			match(KEYWORD);
			setState(388);
			match(TAB);
			setState(389);
			match(WORD);
			setState(390);
			match(TAB);
			setState(391);
			match(WORD);
			setState(392);
			match(WORD);
			setState(393);
			match(WORD);
			setState(394);
			match(TAB);
			setState(395);
			match(WORD);
			setState(396);
			match(TAB);
			setState(397);
			match(WORD);
			setState(398);
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
			setState(400);
			match(KEYWORD);
			setState(401);
			match(TAB);
			setState(402);
			match(WORD);
			setState(403);
			match(WORD);
			setState(404);
			match(TAB);
			setState(405);
			match(WORD);
			setState(406);
			match(TAB);
			setState(407);
			match(WORD);
			setState(408);
			match(TAB);
			setState(409);
			match(WORD);
			setState(410);
			match(NEWLINE);
			setState(552); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(411);
				((CrawlPriceEtfContext)_localctx).code = match(NUMBER);
				setState(412);
				match(TAB);
				setState(414); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(413);
					word();
					}
					}
					setState(416); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(418);
				match(NEWLINE);
				{
				setState(419);
				match(KEYWORD);
				setState(420);
				match(TAB);
				setState(421);
				((CrawlPriceEtfContext)_localctx).symbol = word();
				setState(423);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(422);
					((CrawlPriceEtfContext)_localctx).symbol1 = word();
					}
					break;
				}
				setState(426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(425);
					((CrawlPriceEtfContext)_localctx).symbol2 = word();
					}
					break;
				}
				setState(429);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(428);
					((CrawlPriceEtfContext)_localctx).symbol3 = word();
					}
					break;
				}
				setState(432);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(431);
					((CrawlPriceEtfContext)_localctx).symbol4 = word();
					}
					break;
				}
				setState(435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(434);
					((CrawlPriceEtfContext)_localctx).symbol5 = word();
					}
					break;
				}
				setState(438);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(437);
					((CrawlPriceEtfContext)_localctx).symbol6 = word();
					}
					break;
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
					{
					{
					setState(440);
					((CrawlPriceEtfContext)_localctx).symbol7 = word();
					}
					}
					setState(445);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(446);
				match(NEWLINE);
				setState(447);
				match(KEYWORD);
				setState(448);
				match(TAB);
				setState(449);
				((CrawlPriceEtfContext)_localctx).category = word();
				setState(451);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(450);
					((CrawlPriceEtfContext)_localctx).category1 = word();
					}
					break;
				}
				setState(454);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(453);
					((CrawlPriceEtfContext)_localctx).category2 = word();
					}
					break;
				}
				setState(457);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(456);
					((CrawlPriceEtfContext)_localctx).category3 = word();
					}
					break;
				}
				setState(460);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(459);
					((CrawlPriceEtfContext)_localctx).category4 = word();
					}
					break;
				}
				setState(463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(462);
					((CrawlPriceEtfContext)_localctx).category5 = word();
					}
					break;
				}
				setState(466);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(465);
					((CrawlPriceEtfContext)_localctx).category6 = word();
					}
					break;
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
					{
					{
					setState(468);
					((CrawlPriceEtfContext)_localctx).category7 = word();
					}
					}
					setState(473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(474);
				match(NEWLINE);
				setState(475);
				match(KEYWORD);
				setState(476);
				match(TAB);
				setState(477);
				((CrawlPriceEtfContext)_localctx).ea = match(NUMBER);
				setState(478);
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
				setState(541); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(481);
						match(WORD);
						setState(482);
						match(TAB);
						setState(483);
						match(WORD);
						setState(484);
						match(TAB);
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
						match(NEWLINE);
						setState(537); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(537);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
							case 1:
								{
								{
								setState(498);
								match(TAB);
								setState(499);
								match(TAB);
								setState(500);
								match(TAB);
								setState(501);
								match(TAB);
								setState(502);
								match(TAB);
								setState(503);
								match(TAB);
								setState(504);
								match(TAB);
								setState(505);
								match(TAB);
								setState(506);
								match(NEWLINE);
								}
								}
								break;
							case 2:
								{
								{
								setState(508);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(507);
									((CrawlPriceEtfContext)_localctx).base = match(DATE);
									}
								}

								setState(510);
								match(TAB);
								setState(512);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(511);
									((CrawlPriceEtfContext)_localctx).closing = match(NUMBER);
									}
								}

								setState(514);
								match(TAB);
								setState(516);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(515);
									match(NUMBER);
									}
								}

								setState(518);
								match(TAB);
								setState(520);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(519);
									((CrawlPriceEtfContext)_localctx).market = match(NUMBER);
									}
								}

								setState(522);
								match(TAB);
								setState(524);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(523);
									((CrawlPriceEtfContext)_localctx).high = match(NUMBER);
									}
								}

								setState(526);
								match(TAB);
								setState(527);
								((CrawlPriceEtfContext)_localctx).low = match(NUMBER);
								setState(528);
								match(TAB);
								setState(529);
								((CrawlPriceEtfContext)_localctx).volume = match(NUMBER);
								setState(530);
								match(TAB);
								setState(532);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(531);
									match(NUMBER);
									}
								}

								setState(534);
								match(TAB);
								setState(535);
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
							setState(539); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(543); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(545);
				match(WORD);
				setState(546);
				match(TAB);
				setState(547);
				match(WORD);
				setState(548);
				match(TAB);
				setState(549);
				match(DATE);
				setState(550);
				match(NEWLINE);
				}
				}
				setState(554); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(556);
			match(KEYWORD);
			setState(557);
			match(TAB);
			setState(558);
			match(WORD);
			setState(559);
			match(WORD);
			setState(560);
			match(TAB);
			setState(561);
			match(WORD);
			setState(562);
			match(TAB);
			setState(563);
			match(WORD);
			setState(564);
			match(TAB);
			setState(565);
			match(WORD);
			setState(566);
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
			setState(568);
			match(KEYWORD);
			setState(569);
			match(TAB);
			setState(570);
			match(WORD);
			setState(571);
			match(WORD);
			setState(572);
			match(TAB);
			setState(573);
			match(WORD);
			setState(574);
			match(TAB);
			setState(575);
			match(WORD);
			setState(576);
			match(TAB);
			setState(577);
			match(WORD);
			setState(578);
			match(NEWLINE);
			setState(641); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(579);
				((CrawlPriceCompanyContext)_localctx).code = match(NUMBER);
				setState(580);
				match(TAB);
				setState(582); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(581);
					((CrawlPriceCompanyContext)_localctx).symbol = word();
					}
					}
					setState(584); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(586);
				match(NEWLINE);
				setState(630); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(587);
						match(WORD);
						setState(588);
						match(TAB);
						setState(589);
						match(WORD);
						setState(590);
						match(TAB);
						setState(591);
						match(WORD);
						setState(592);
						match(TAB);
						setState(593);
						match(WORD);
						setState(594);
						match(TAB);
						setState(595);
						match(WORD);
						setState(596);
						match(TAB);
						setState(597);
						match(WORD);
						setState(598);
						match(TAB);
						setState(599);
						match(WORD);
						setState(600);
						match(TAB);
						setState(601);
						match(NEWLINE);
						setState(626); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(626);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case TAB:
								{
								{
								setState(602);
								match(TAB);
								setState(603);
								match(TAB);
								setState(604);
								match(TAB);
								setState(605);
								match(TAB);
								setState(606);
								match(TAB);
								setState(607);
								match(TAB);
								setState(608);
								match(TAB);
								setState(609);
								match(NEWLINE);
								}
								}
								break;
							case DATE:
								{
								{
								setState(610);
								((CrawlPriceCompanyContext)_localctx).base = match(DATE);
								setState(611);
								match(TAB);
								setState(612);
								((CrawlPriceCompanyContext)_localctx).closing = match(NUMBER);
								setState(613);
								match(TAB);
								setState(614);
								match(NUMBER);
								setState(615);
								match(TAB);
								setState(616);
								((CrawlPriceCompanyContext)_localctx).market = match(NUMBER);
								setState(617);
								match(TAB);
								setState(618);
								((CrawlPriceCompanyContext)_localctx).high = match(NUMBER);
								setState(619);
								match(TAB);
								setState(620);
								((CrawlPriceCompanyContext)_localctx).low = match(NUMBER);
								setState(621);
								match(TAB);
								setState(622);
								((CrawlPriceCompanyContext)_localctx).volume = match(NUMBER);
								setState(623);
								match(TAB);
								setState(624);
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
							setState(628); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(632); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(634);
				match(WORD);
				setState(635);
				match(TAB);
				setState(636);
				match(WORD);
				setState(637);
				match(TAB);
				setState(638);
				match(DATE);
				setState(639);
				match(NEWLINE);
				}
				}
				setState(643); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(645);
			match(KEYWORD);
			setState(646);
			match(TAB);
			setState(647);
			match(WORD);
			setState(648);
			match(WORD);
			setState(649);
			match(TAB);
			setState(650);
			match(WORD);
			setState(651);
			match(TAB);
			setState(652);
			match(WORD);
			setState(653);
			match(TAB);
			setState(654);
			match(WORD);
			setState(655);
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
			setState(657);
			match(KEYWORD);
			setState(658);
			match(TAB);
			setState(659);
			match(WORD);
			setState(660);
			match(WORD);
			setState(661);
			match(TAB);
			setState(662);
			match(WORD);
			setState(663);
			match(TAB);
			setState(664);
			match(WORD);
			setState(665);
			match(TAB);
			setState(666);
			match(WORD);
			setState(667);
			match(NEWLINE);
			setState(725); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(668);
					match(KEYWORD);
					setState(669);
					match(TAB);
					setState(670);
					((CrawlItemDetailCompanyThreadContext)_localctx).code = match(NUMBER);
					setState(671);
					match(TAB);
					setState(672);
					((CrawlItemDetailCompanyThreadContext)_localctx).type = match(WORD);
					setState(673);
					match(TAB);
					setState(674);
					((CrawlItemDetailCompanyThreadContext)_localctx).symbol = word();
					setState(676);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(675);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(679);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(678);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(682);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						setState(681);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(685);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(684);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(688);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						setState(687);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(691);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						setState(690);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(696);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(693);
						((CrawlItemDetailCompanyThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(698);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(699);
					match(NEWLINE);
					setState(700);
					match(KEYWORD);
					setState(701);
					match(TAB);
					setState(702);
					((CrawlItemDetailCompanyThreadContext)_localctx).category = match(STRING);
					setState(703);
					match(NEWLINE);
					setState(704);
					match(KEYWORD);
					setState(705);
					match(TAB);
					setState(706);
					((CrawlItemDetailCompanyThreadContext)_localctx).fics = match(STRING);
					setState(707);
					match(NEWLINE);
					setState(708);
					match(KEYWORD);
					setState(709);
					match(TAB);
					setState(710);
					((CrawlItemDetailCompanyThreadContext)_localctx).ea = match(NUMBER);
					setState(711);
					match(WORD);
					setState(712);
					match(NEWLINE);
					setState(713);
					match(KEYWORD);
					setState(714);
					match(TAB);
					setState(715);
					((CrawlItemDetailCompanyThreadContext)_localctx).ipo = match(DATE);
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
					match(DATE);
					setState(722);
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
				setState(727); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(729);
			match(KEYWORD);
			setState(730);
			match(TAB);
			setState(731);
			match(WORD);
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
			setState(741);
			match(KEYWORD);
			setState(742);
			match(TAB);
			setState(743);
			match(WORD);
			setState(744);
			match(TAB);
			setState(745);
			match(WORD);
			setState(746);
			match(WORD);
			setState(747);
			match(WORD);
			setState(748);
			match(TAB);
			setState(749);
			match(WORD);
			setState(750);
			match(TAB);
			setState(751);
			match(WORD);
			setState(752);
			match(NEWLINE);
			setState(821); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(753);
				match(WORD);
				setState(754);
				match(TAB);
				setState(755);
				match(NEWLINE);
				setState(756);
				match(WORD);
				setState(757);
				match(TAB);
				setState(758);
				match(WORD);
				setState(759);
				match(TAB);
				setState(760);
				match(WORD);
				setState(761);
				match(TAB);
				setState(762);
				match(WORD);
				setState(763);
				match(TAB);
				setState(764);
				match(WORD);
				setState(765);
				match(TAB);
				setState(766);
				match(WORD);
				setState(767);
				match(TAB);
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
				match(WORD);
				setState(775);
				match(TAB);
				setState(776);
				match(WORD);
				setState(777);
				match(TAB);
				setState(778);
				match(NEWLINE);
				setState(810); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(779);
						((CrawlItemDividendTopCompanyContext)_localctx).type = match(WORD);
						setState(780);
						match(TAB);
						setState(781);
						match(NUMBER);
						setState(782);
						match(TAB);
						setState(784);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(783);
							((CrawlItemDividendTopCompanyContext)_localctx).code = match(NUMBER);
							}
						}

						setState(786);
						match(TAB);
						setState(788); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(787);
							word();
							}
							}
							setState(790); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(792);
						match(TAB);
						setState(793);
						match(WORD);
						setState(794);
						match(TAB);
						setState(795);
						match(WORD);
						setState(796);
						match(TAB);
						setState(797);
						match(NUMBER);
						setState(798);
						match(TAB);
						setState(799);
						match(NUMBER);
						setState(800);
						match(TAB);
						setState(801);
						match(NUMBER);
						setState(802);
						match(TAB);
						setState(803);
						match(NUMBER);
						setState(804);
						match(TAB);
						setState(805);
						match(NUMBER);
						setState(806);
						match(TAB);
						setState(807);
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
					setState(812); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(814);
				match(WORD);
				setState(815);
				match(TAB);
				setState(816);
				match(WORD);
				setState(817);
				match(TAB);
				setState(818);
				match(DATE);
				setState(819);
				match(NEWLINE);
				}
				}
				setState(823); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(825);
			match(KEYWORD);
			setState(826);
			match(TAB);
			setState(827);
			match(WORD);
			setState(828);
			match(TAB);
			setState(829);
			match(WORD);
			setState(830);
			match(WORD);
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
			setState(838);
			match(KEYWORD);
			setState(839);
			match(TAB);
			setState(840);
			match(WORD);
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
			match(NEWLINE);
			setState(928); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(847);
					match(KEYWORD);
					setState(848);
					match(TAB);
					setState(849);
					((CrawlEtfDetailThreadContext)_localctx).code = match(NUMBER);
					setState(850);
					match(TAB);
					setState(854);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(851);
						word();
						}
						}
						setState(856);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(857);
					match(NEWLINE);
					setState(858);
					((CrawlEtfDetailThreadContext)_localctx).symbol = word();
					setState(860);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						setState(859);
						((CrawlEtfDetailThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(863);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						setState(862);
						((CrawlEtfDetailThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(866);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						setState(865);
						((CrawlEtfDetailThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(869);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						setState(868);
						((CrawlEtfDetailThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(872);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						setState(871);
						((CrawlEtfDetailThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(875);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						setState(874);
						((CrawlEtfDetailThreadContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(880);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(877);
						((CrawlEtfDetailThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(882);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(883);
					match(NEWLINE);
					setState(884);
					((CrawlEtfDetailThreadContext)_localctx).category = word();
					setState(886);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
					case 1:
						{
						setState(885);
						((CrawlEtfDetailThreadContext)_localctx).category1 = word();
						}
						break;
					}
					setState(889);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						setState(888);
						((CrawlEtfDetailThreadContext)_localctx).category2 = word();
						}
						break;
					}
					setState(892);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						setState(891);
						((CrawlEtfDetailThreadContext)_localctx).category3 = word();
						}
						break;
					}
					setState(895);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						setState(894);
						((CrawlEtfDetailThreadContext)_localctx).category4 = word();
						}
						break;
					}
					setState(898);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						setState(897);
						((CrawlEtfDetailThreadContext)_localctx).category5 = word();
						}
						break;
					}
					setState(901);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
					case 1:
						{
						setState(900);
						((CrawlEtfDetailThreadContext)_localctx).category6 = word();
						}
						break;
					}
					setState(906);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(903);
						((CrawlEtfDetailThreadContext)_localctx).category7 = word();
						}
						}
						setState(908);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(909);
					match(NEWLINE);
					setState(910);
					((CrawlEtfDetailThreadContext)_localctx).ipo = match(DATE);
					setState(914);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WORD) {
						{
						{
						setState(911);
						match(WORD);
						}
						}
						setState(916);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(917);
					match(NEWLINE);
					setState(918);
					((CrawlEtfDetailThreadContext)_localctx).fee = word();
					setState(919);
					match(NEWLINE);
					setState(920);
					match(WORD);
					setState(921);
					match(TAB);
					setState(922);
					match(WORD);
					setState(923);
					match(TAB);
					setState(924);
					match(DATE);
					setState(925);
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
				setState(930); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(932);
			match(KEYWORD);
			setState(933);
			match(TAB);
			setState(934);
			match(WORD);
			setState(935);
			match(WORD);
			setState(936);
			match(TAB);
			setState(937);
			match(WORD);
			setState(938);
			match(TAB);
			setState(939);
			match(WORD);
			setState(940);
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
			setState(942);
			match(KEYWORD);
			setState(943);
			match(TAB);
			setState(944);
			match(WORD);
			setState(945);
			match(WORD);
			setState(946);
			match(WORD);
			setState(947);
			match(TAB);
			setState(948);
			match(WORD);
			setState(949);
			match(WORD);
			setState(950);
			match(WORD);
			setState(951);
			match(TAB);
			setState(952);
			match(WORD);
			setState(953);
			match(TAB);
			setState(954);
			match(WORD);
			setState(955);
			match(NEWLINE);
			setState(1066); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(956);
					match(KEYWORD);
					setState(957);
					match(TAB);
					setState(958);
					((CrawlDividendHistoryEtfThreadContext)_localctx).code = match(NUMBER);
					setState(959);
					match(NEWLINE);
					setState(960);
					match(WORD);
					setState(961);
					match(TAB);
					setState(963);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WORD) {
						{
						setState(962);
						match(WORD);
						}
					}

					setState(965);
					match(TAB);
					setState(966);
					match(WORD);
					setState(967);
					match(TAB);
					setState(968);
					match(WORD);
					setState(969);
					match(TAB);
					setState(970);
					match(WORD);
					setState(971);
					match(TAB);
					setState(972);
					match(WORD);
					setState(973);
					match(TAB);
					setState(974);
					match(WORD);
					setState(975);
					match(TAB);
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
					match(NEWLINE);
					setState(1056); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(1056);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case TAB:
								{
								{
								setState(983);
								match(TAB);
								setState(984);
								match(TAB);
								setState(985);
								match(TAB);
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
								match(TAB);
								setState(992);
								match(TAB);
								setState(993);
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
								setState(994);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol = word();
								setState(996);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
								case 1:
									{
									setState(995);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol1 = word();
									}
									break;
								}
								setState(999);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
								case 1:
									{
									setState(998);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol2 = word();
									}
									break;
								}
								setState(1002);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
								case 1:
									{
									setState(1001);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol3 = word();
									}
									break;
								}
								setState(1005);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
								case 1:
									{
									setState(1004);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol4 = word();
									}
									break;
								}
								setState(1008);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
								case 1:
									{
									setState(1007);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol5 = word();
									}
									break;
								}
								setState(1011);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
								case 1:
									{
									setState(1010);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol6 = word();
									}
									break;
								}
								setState(1016);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
									{
									{
									setState(1013);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol7 = word();
									}
									}
									setState(1018);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(1019);
								match(TAB);
								setState(1021);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==WORD) {
									{
									setState(1020);
									match(WORD);
									}
								}

								setState(1023);
								match(TAB);
								setState(1024);
								match(WORD);
								setState(1025);
								match(TAB);
								setState(1029);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
									{
									{
									setState(1026);
									word();
									}
									}
									setState(1031);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(1032);
								match(TAB);
								setState(1034);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(1033);
									((CrawlDividendHistoryEtfThreadContext)_localctx).base = match(DATE);
									}
								}

								setState(1036);
								match(TAB);
								setState(1037);
								((CrawlDividendHistoryEtfThreadContext)_localctx).pay = match(DATE);
								setState(1038);
								match(TAB);
								setState(1040);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==WORD) {
									{
									setState(1039);
									match(WORD);
									}
								}

								setState(1042);
								match(TAB);
								setState(1043);
								((CrawlDividendHistoryEtfThreadContext)_localctx).dividend = match(NUMBER);
								setState(1044);
								match(TAB);
								setState(1046);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(1045);
									((CrawlDividendHistoryEtfThreadContext)_localctx).price = match(NUMBER);
									}
								}

								setState(1048);
								match(TAB);
								setState(1050);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(1049);
									((CrawlDividendHistoryEtfThreadContext)_localctx).ratio = match(NUMBER);
									}
								}

								setState(1052);
								match(TAB);
								setState(1053);
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
						setState(1058); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(1060);
					match(WORD);
					setState(1061);
					match(TAB);
					setState(1062);
					match(WORD);
					setState(1063);
					match(TAB);
					setState(1064);
					match(DATE);
					setState(1065);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1068); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1070);
			match(KEYWORD);
			setState(1071);
			match(TAB);
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
			match(WORD);
			setState(1078);
			match(WORD);
			setState(1079);
			match(TAB);
			setState(1080);
			match(WORD);
			setState(1081);
			match(TAB);
			setState(1082);
			match(WORD);
			setState(1083);
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
			setState(1085);
			match(KEYWORD);
			setState(1086);
			match(TAB);
			setState(1087);
			match(WORD);
			setState(1088);
			match(TAB);
			setState(1089);
			match(WORD);
			setState(1090);
			match(WORD);
			setState(1091);
			match(WORD);
			setState(1092);
			match(TAB);
			setState(1093);
			match(WORD);
			setState(1094);
			match(TAB);
			setState(1095);
			match(WORD);
			setState(1096);
			match(NEWLINE);
			setState(1223); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1213); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1097);
						match(WORD);
						setState(1098);
						match(TAB);
						setState(1099);
						match(WORD);
						setState(1100);
						match(NEWLINE);
						setState(1101);
						match(WORD);
						setState(1102);
						match(TAB);
						setState(1103);
						match(WORD);
						setState(1104);
						match(NEWLINE);
						setState(1105);
						match(WORD);
						setState(1106);
						match(TAB);
						setState(1107);
						match(WORD);
						setState(1108);
						match(TAB);
						setState(1109);
						match(WORD);
						setState(1110);
						match(TAB);
						setState(1111);
						match(WORD);
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
						match(TAB);
						setState(1129);
						match(NEWLINE);
						setState(1130);
						match(WORD);
						setState(1131);
						match(TAB);
						setState(1132);
						match(WORD);
						setState(1133);
						match(TAB);
						setState(1134);
						match(WORD);
						setState(1135);
						match(TAB);
						setState(1136);
						match(WORD);
						setState(1137);
						match(TAB);
						setState(1138);
						match(WORD);
						setState(1139);
						match(TAB);
						setState(1140);
						match(WORD);
						setState(1141);
						match(TAB);
						setState(1142);
						match(NEWLINE);
						setState(1209); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(1209);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case TAB:
								{
								{
								setState(1143);
								match(TAB);
								setState(1144);
								match(TAB);
								setState(1145);
								match(TAB);
								setState(1146);
								match(TAB);
								setState(1147);
								match(TAB);
								setState(1148);
								match(TAB);
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
								setState(1155);
								match(TAB);
								setState(1156);
								match(TAB);
								setState(1157);
								match(TAB);
								setState(1158);
								match(TAB);
								setState(1159);
								match(TAB);
								setState(1160);
								match(NEWLINE);
								}
								}
								break;
							case DATE:
								{
								{
								setState(1161);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).base = match(DATE);
								setState(1162);
								match(TAB);
								setState(1164);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(1163);
									((CrawlDividendHistoryCompanyThreadContext)_localctx).pay = match(DATE);
									}
								}

								setState(1166);
								match(TAB);
								setState(1168);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(1167);
									match(DATE);
									}
								}

								setState(1170);
								match(TAB);
								setState(1171);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).code = match(NUMBER);
								setState(1172);
								match(TAB);
								setState(1174); 
								_errHandler.sync(this);
								_la = _input.LA(1);
								do {
									{
									{
									setState(1173);
									((CrawlDividendHistoryCompanyThreadContext)_localctx).symbol = word();
									}
									}
									setState(1176); 
									_errHandler.sync(this);
									_la = _input.LA(1);
								} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
								setState(1178);
								match(TAB);
								setState(1179);
								match(WORD);
								setState(1180);
								match(TAB);
								setState(1181);
								match(WORD);
								setState(1182);
								match(TAB);
								setState(1183);
								match(WORD);
								setState(1184);
								match(TAB);
								setState(1185);
								match(WORD);
								setState(1186);
								match(TAB);
								setState(1187);
								((CrawlDividendHistoryCompanyThreadContext)_localctx).dividend = match(NUMBER);
								setState(1188);
								match(TAB);
								setState(1190);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(1189);
									match(NUMBER);
									}
								}

								setState(1192);
								match(TAB);
								setState(1193);
								match(NUMBER);
								setState(1194);
								match(TAB);
								setState(1195);
								match(NUMBER);
								setState(1196);
								match(TAB);
								setState(1198);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(1197);
									match(NUMBER);
									}
								}

								setState(1200);
								match(TAB);
								setState(1201);
								match(TAB);
								setState(1202);
								match(NUMBER);
								setState(1203);
								match(TAB);
								setState(1204);
								match(NUMBER);
								setState(1205);
								match(TAB);
								setState(1206);
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
							setState(1211); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1215); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1217);
				match(WORD);
				setState(1218);
				match(TAB);
				setState(1219);
				match(WORD);
				setState(1220);
				match(TAB);
				setState(1221);
				match(DATE);
				setState(1222);
				match(NEWLINE);
				}
				}
				setState(1225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1227);
			match(KEYWORD);
			setState(1228);
			match(TAB);
			setState(1229);
			match(WORD);
			setState(1230);
			match(TAB);
			setState(1231);
			match(WORD);
			setState(1232);
			match(WORD);
			setState(1233);
			match(WORD);
			setState(1234);
			match(TAB);
			setState(1235);
			match(WORD);
			setState(1236);
			match(TAB);
			setState(1237);
			match(WORD);
			setState(1238);
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
			setState(1240);
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
			setState(1244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1244);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(1242);
					word();
					}
					break;
				case TAB:
					{
					setState(1243);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(1248);
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
			setState(1253); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1253);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(1250);
					word();
					}
					break;
				case TAB:
					{
					setState(1251);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(1252);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1255); 
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
		"\u0004\u0001\n\u04ea\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001k\b\u0001\u000b\u0001"+
		"\f\u0001l\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
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
		"\u0003\u0001\u00b6\b\u0001\u0001\u0001\u0003\u0001\u00b9\b\u0001\u0001"+
		"\u0001\u0003\u0001\u00bc\b\u0001\u0001\u0001\u0003\u0001\u00bf\b\u0001"+
		"\u0001\u0001\u0003\u0001\u00c2\b\u0001\u0001\u0001\u0003\u0001\u00c5\b"+
		"\u0001\u0001\u0001\u0005\u0001\u00c8\b\u0001\n\u0001\f\u0001\u00cb\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u00d7\b\u0001"+
		"\u000b\u0001\f\u0001\u00d8\u0003\u0001\u00db\b\u0001\u0004\u0001\u00dd"+
		"\b\u0001\u000b\u0001\f\u0001\u00de\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u00e7\b\u0001\u000b\u0001"+
		"\f\u0001\u00e8\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u0127\b\u0002\u0001\u0002\u0003\u0002\u012a\b"+
		"\u0002\u0001\u0002\u0003\u0002\u012d\b\u0002\u0001\u0002\u0003\u0002\u0130"+
		"\b\u0002\u0001\u0002\u0003\u0002\u0133\b\u0002\u0001\u0002\u0003\u0002"+
		"\u0136\b\u0002\u0001\u0002\u0005\u0002\u0139\b\u0002\n\u0002\f\u0002\u013c"+
		"\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u0143\b\u0002\u0001\u0002\u0003\u0002\u0146\b\u0002\u0001\u0002"+
		"\u0003\u0002\u0149\b\u0002\u0001\u0002\u0003\u0002\u014c\b\u0002\u0001"+
		"\u0002\u0003\u0002\u014f\b\u0002\u0001\u0002\u0003\u0002\u0152\b\u0002"+
		"\u0001\u0002\u0005\u0002\u0155\b\u0002\n\u0002\f\u0002\u0158\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0164\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u016d\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u0175\b\u0002\u000b\u0002\f"+
		"\u0002\u0176\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0004\u0002\u0180\b\u0002\u000b\u0002\f\u0002"+
		"\u0181\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u019f\b\u0003\u000b"+
		"\u0003\f\u0003\u01a0\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u01a8\b\u0003\u0001\u0003\u0003\u0003\u01ab\b\u0003"+
		"\u0001\u0003\u0003\u0003\u01ae\b\u0003\u0001\u0003\u0003\u0003\u01b1\b"+
		"\u0003\u0001\u0003\u0003\u0003\u01b4\b\u0003\u0001\u0003\u0003\u0003\u01b7"+
		"\b\u0003\u0001\u0003\u0005\u0003\u01ba\b\u0003\n\u0003\f\u0003\u01bd\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u01c4\b\u0003\u0001\u0003\u0003\u0003\u01c7\b\u0003\u0001\u0003"+
		"\u0003\u0003\u01ca\b\u0003\u0001\u0003\u0003\u0003\u01cd\b\u0003\u0001"+
		"\u0003\u0003\u0003\u01d0\b\u0003\u0001\u0003\u0003\u0003\u01d3\b\u0003"+
		"\u0001\u0003\u0005\u0003\u01d6\b\u0003\n\u0003\f\u0003\u01d9\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u01fd\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0201\b\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u0205\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0209\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u020d\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0215\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u021a\b\u0003\u000b\u0003"+
		"\f\u0003\u021b\u0004\u0003\u021e\b\u0003\u000b\u0003\f\u0003\u021f\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0004\u0003\u0229\b\u0003\u000b\u0003\f\u0003\u022a\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0004\u0004\u0247\b\u0004\u000b\u0004\f\u0004\u0248\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u0273\b\u0004\u000b"+
		"\u0004\f\u0004\u0274\u0004\u0004\u0277\b\u0004\u000b\u0004\f\u0004\u0278"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0004\u0004\u0282\b\u0004\u000b\u0004\f\u0004\u0283\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u02a5\b\u0005\u0001\u0005\u0003\u0005\u02a8\b\u0005"+
		"\u0001\u0005\u0003\u0005\u02ab\b\u0005\u0001\u0005\u0003\u0005\u02ae\b"+
		"\u0005\u0001\u0005\u0003\u0005\u02b1\b\u0005\u0001\u0005\u0003\u0005\u02b4"+
		"\b\u0005\u0001\u0005\u0005\u0005\u02b7\b\u0005\n\u0005\f\u0005\u02ba\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u02d6\b\u0005\u000b\u0005\f"+
		"\u0005\u02d7\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0311\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0004\u0006\u0315\b\u0006\u000b\u0006\f\u0006\u0316\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u032b"+
		"\b\u0006\u000b\u0006\f\u0006\u032c\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u0336\b\u0006"+
		"\u000b\u0006\f\u0006\u0337\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u0355\b\u0007\n\u0007\f\u0007\u0358\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u035d\b\u0007\u0001\u0007\u0003\u0007\u0360\b\u0007"+
		"\u0001\u0007\u0003\u0007\u0363\b\u0007\u0001\u0007\u0003\u0007\u0366\b"+
		"\u0007\u0001\u0007\u0003\u0007\u0369\b\u0007\u0001\u0007\u0003\u0007\u036c"+
		"\b\u0007\u0001\u0007\u0005\u0007\u036f\b\u0007\n\u0007\f\u0007\u0372\t"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0377\b\u0007\u0001"+
		"\u0007\u0003\u0007\u037a\b\u0007\u0001\u0007\u0003\u0007\u037d\b\u0007"+
		"\u0001\u0007\u0003\u0007\u0380\b\u0007\u0001\u0007\u0003\u0007\u0383\b"+
		"\u0007\u0001\u0007\u0003\u0007\u0386\b\u0007\u0001\u0007\u0005\u0007\u0389"+
		"\b\u0007\n\u0007\f\u0007\u038c\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u0391\b\u0007\n\u0007\f\u0007\u0394\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u03a1\b\u0007\u000b"+
		"\u0007\f\u0007\u03a2\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u03c4\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u03e5\b\b\u0001\b\u0003\b\u03e8\b\b\u0001\b\u0003\b\u03eb\b\b\u0001"+
		"\b\u0003\b\u03ee\b\b\u0001\b\u0003\b\u03f1\b\b\u0001\b\u0003\b\u03f4\b"+
		"\b\u0001\b\u0005\b\u03f7\b\b\n\b\f\b\u03fa\t\b\u0001\b\u0001\b\u0003\b"+
		"\u03fe\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0404\b\b\n\b\f\b\u0407"+
		"\t\b\u0001\b\u0001\b\u0003\b\u040b\b\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0003\b\u0411\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0417\b\b\u0001"+
		"\b\u0001\b\u0003\b\u041b\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u0421"+
		"\b\b\u000b\b\f\b\u0422\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0004\b\u042b\b\b\u000b\b\f\b\u042c\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
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
		"\t\u048d\b\t\u0001\t\u0001\t\u0003\t\u0491\b\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0004\t\u0497\b\t\u000b\t\f\t\u0498\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u04a7\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u04af"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0004\t\u04ba\b\t\u000b\t\f\t\u04bb\u0004\t\u04be\b\t\u000b\t\f\t\u04bf"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u04c8\b\t\u000b"+
		"\t\f\t\u04c9\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0004\u000b\u04dd\b\u000b\u000b\u000b\f\u000b\u04de\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0004\f\u04e6\b\f\u000b\f\f"+
		"\f\u04e7\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u0000\u0001\u0001\u0000\u0005\n\u055d\u0000#"+
		"\u0001\u0000\u0000\u0000\u0002%\u0001\u0000\u0000\u0000\u0004\u00f3\u0001"+
		"\u0000\u0000\u0000\u0006\u0190\u0001\u0000\u0000\u0000\b\u0238\u0001\u0000"+
		"\u0000\u0000\n\u0291\u0001\u0000\u0000\u0000\f\u02e5\u0001\u0000\u0000"+
		"\u0000\u000e\u0346\u0001\u0000\u0000\u0000\u0010\u03ae\u0001\u0000\u0000"+
		"\u0000\u0012\u043d\u0001\u0000\u0000\u0000\u0014\u04d8\u0001\u0000\u0000"+
		"\u0000\u0016\u04dc\u0001\u0000\u0000\u0000\u0018\u04e5\u0001\u0000\u0000"+
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
		"\u00e6\u0005\u0004\u0000\u0000-.\u0005\b\u0000\u0000./\u0005\u0003\u0000"+
		"\u0000/0\u0005\n\u0000\u000001\u0005\n\u0000\u000012\u0005\u0003\u0000"+
		"\u00002\u00e7\u0005\u0004\u0000\u000034\u0005\n\u0000\u000045\u0005\u0003"+
		"\u0000\u000056\u0005\b\u0000\u000067\u0005\u0003\u0000\u000078\u0005\n"+
		"\u0000\u000089\u0005\u0003\u0000\u00009:\u0005\n\u0000\u0000:;\u0005\u0003"+
		"\u0000\u0000;<\u0005\n\u0000\u0000<=\u0005\u0003\u0000\u0000=>\u0005\n"+
		"\u0000\u0000>?\u0005\u0003\u0000\u0000?@\u0005\n\u0000\u0000@A\u0005\u0003"+
		"\u0000\u0000AB\u0005\n\u0000\u0000BC\u0005\u0003\u0000\u0000CD\u0005\n"+
		"\u0000\u0000DE\u0005\u0003\u0000\u0000EF\u0005\n\u0000\u0000FG\u0005\u0003"+
		"\u0000\u0000GH\u0005\n\u0000\u0000HI\u0005\u0003\u0000\u0000IJ\u0005\n"+
		"\u0000\u0000JK\u0005\u0003\u0000\u0000KL\u0005\n\u0000\u0000LM\u0005\u0003"+
		"\u0000\u0000Mj\u0005\u0004\u0000\u0000NO\u0005\n\u0000\u0000OP\u0005\u0003"+
		"\u0000\u0000PQ\u0005\b\u0000\u0000QR\u0005\u0003\u0000\u0000RS\u0005\u0006"+
		"\u0000\u0000ST\u0005\u0003\u0000\u0000TU\u0005\b\u0000\u0000UV\u0005\u0003"+
		"\u0000\u0000VW\u0005\b\u0000\u0000WX\u0005\u0003\u0000\u0000XY\u0005\b"+
		"\u0000\u0000YZ\u0005\u0003\u0000\u0000Z[\u0005\b\u0000\u0000[\\\u0005"+
		"\u0003\u0000\u0000\\]\u0005\b\u0000\u0000]^\u0005\u0003\u0000\u0000^_"+
		"\u0005\b\u0000\u0000_`\u0005\u0003\u0000\u0000`a\u0005\b\u0000\u0000a"+
		"b\u0005\u0003\u0000\u0000bc\u0005\b\u0000\u0000cd\u0005\u0003\u0000\u0000"+
		"de\u0005\b\u0000\u0000ef\u0005\u0003\u0000\u0000fg\u0005\b\u0000\u0000"+
		"gh\u0005\u0003\u0000\u0000hi\u0005\u0004\u0000\u0000ik\u0006\u0001\uffff"+
		"\uffff\u0000jN\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u00db\u0001\u0000\u0000"+
		"\u0000no\u0005\n\u0000\u0000op\u0005\u0003\u0000\u0000pq\u0005\b\u0000"+
		"\u0000qr\u0005\u0003\u0000\u0000rs\u0005\n\u0000\u0000st\u0005\u0003\u0000"+
		"\u0000tu\u0005\n\u0000\u0000uv\u0005\u0003\u0000\u0000vw\u0005\n\u0000"+
		"\u0000wx\u0005\u0003\u0000\u0000xy\u0005\n\u0000\u0000yz\u0005\u0003\u0000"+
		"\u0000z{\u0005\n\u0000\u0000{|\u0005\u0003\u0000\u0000|}\u0005\n\u0000"+
		"\u0000}~\u0005\u0003\u0000\u0000~\u007f\u0005\n\u0000\u0000\u007f\u0080"+
		"\u0005\u0003\u0000\u0000\u0080\u0081\u0005\n\u0000\u0000\u0081\u0082\u0005"+
		"\u0003\u0000\u0000\u0082\u0083\u0005\n\u0000\u0000\u0083\u0084\u0005\u0003"+
		"\u0000\u0000\u0084\u0085\u0005\n\u0000\u0000\u0085\u0086\u0005\u0003\u0000"+
		"\u0000\u0086\u0087\u0005\n\u0000\u0000\u0087\u0088\u0005\u0003\u0000\u0000"+
		"\u0088\u0089\u0005\n\u0000\u0000\u0089\u008a\u0005\u0003\u0000\u0000\u008a"+
		"\u008b\u0005\n\u0000\u0000\u008b\u008c\u0005\u0003\u0000\u0000\u008c\u008d"+
		"\u0005\n\u0000\u0000\u008d\u008e\u0005\u0003\u0000\u0000\u008e\u008f\u0005"+
		"\n\u0000\u0000\u008f\u0090\u0005\u0003\u0000\u0000\u0090\u0091\u0005\n"+
		"\u0000\u0000\u0091\u0092\u0005\u0003\u0000\u0000\u0092\u0093\u0005\n\u0000"+
		"\u0000\u0093\u0094\u0005\u0003\u0000\u0000\u0094\u00d6\u0005\u0004\u0000"+
		"\u0000\u0095\u0096\u0005\n\u0000\u0000\u0096\u0097\u0005\u0003\u0000\u0000"+
		"\u0097\u0098\u0005\b\u0000\u0000\u0098\u0099\u0005\u0003\u0000\u0000\u0099"+
		"\u009a\u0005\u0006\u0000\u0000\u009a\u009b\u0005\u0003\u0000\u0000\u009b"+
		"\u009c\u0005\b\u0000\u0000\u009c\u009d\u0005\u0003\u0000\u0000\u009d\u009e"+
		"\u0005\b\u0000\u0000\u009e\u009f\u0005\u0003\u0000\u0000\u009f\u00a0\u0005"+
		"\b\u0000\u0000\u00a0\u00a1\u0005\u0003\u0000\u0000\u00a1\u00a2\u0005\b"+
		"\u0000\u0000\u00a2\u00a3\u0005\u0003\u0000\u0000\u00a3\u00a4\u0005\b\u0000"+
		"\u0000\u00a4\u00a5\u0005\u0003\u0000\u0000\u00a5\u00a6\u0005\b\u0000\u0000"+
		"\u00a6\u00a7\u0005\u0003\u0000\u0000\u00a7\u00a8\u0005\b\u0000\u0000\u00a8"+
		"\u00a9\u0005\u0003\u0000\u0000\u00a9\u00aa\u0005\b\u0000\u0000\u00aa\u00ab"+
		"\u0005\u0003\u0000\u0000\u00ab\u00ac\u0005\b\u0000\u0000\u00ac\u00ad\u0005"+
		"\u0003\u0000\u0000\u00ad\u00ae\u0005\b\u0000\u0000\u00ae\u00af\u0005\u0003"+
		"\u0000\u0000\u00af\u00b0\u0005\b\u0000\u0000\u00b0\u00b1\u0005\u0003\u0000"+
		"\u0000\u00b1\u00b2\u0005\b\u0000\u0000\u00b2\u00b3\u0005\u0003\u0000\u0000"+
		"\u00b3\u00b5\u0003\u0014\n\u0000\u00b4\u00b6\u0003\u0014\n\u0000\u00b5"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b9\u0003\u0014\n\u0000\u00b8\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bb"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bc\u0003\u0014\n\u0000\u00bb\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00be\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bf\u0003\u0014\n\u0000\u00be\u00bd\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c2\u0003\u0014\n\u0000\u00c1\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c5\u0003\u0014\n\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c8\u0003\u0014\n\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8"+
		"\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0003\u0000\u0000\u00cd"+
		"\u00ce\u0005\b\u0000\u0000\u00ce\u00cf\u0005\u0003\u0000\u0000\u00cf\u00d0"+
		"\u0005\b\u0000\u0000\u00d0\u00d1\u0005\u0003\u0000\u0000\u00d1\u00d2\u0005"+
		"\b\u0000\u0000\u00d2\u00d3\u0005\u0003\u0000\u0000\u00d3\u00d4\u0005\u0004"+
		"\u0000\u0000\u00d4\u00d5\u0006\u0001\uffff\uffff\u0000\u00d5\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d6\u0095\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d9\u00db\u0001\u0000\u0000\u0000\u00da3\u0001\u0000"+
		"\u0000\u0000\u00dan\u0001\u0000\u0000\u0000\u00db\u00dd\u0001\u0000\u0000"+
		"\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000"+
		"\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\n\u0000\u0000"+
		"\u00e1\u00e2\u0005\u0003\u0000\u0000\u00e2\u00e3\u0005\n\u0000\u0000\u00e3"+
		"\u00e4\u0005\u0003\u0000\u0000\u00e4\u00e5\u0005\u0006\u0000\u0000\u00e5"+
		"\u00e7\u0005\u0004\u0000\u0000\u00e6-\u0001\u0000\u0000\u0000\u00e6\u00dc"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\u0005\u0000\u0000\u00eb\u00ec"+
		"\u0005\u0003\u0000\u0000\u00ec\u00ed\u0005\n\u0000\u0000\u00ed\u00ee\u0005"+
		"\u0003\u0000\u0000\u00ee\u00ef\u0005\n\u0000\u0000\u00ef\u00f0\u0005\u0003"+
		"\u0000\u0000\u00f0\u00f1\u0005\n\u0000\u0000\u00f1\u00f2\u0005\u0004\u0000"+
		"\u0000\u00f2\u0003\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u0005\u0000"+
		"\u0000\u00f4\u00f5\u0005\u0003\u0000\u0000\u00f5\u00f6\u0005\n\u0000\u0000"+
		"\u00f6\u00f7\u0005\u0003\u0000\u0000\u00f7\u00f8\u0005\n\u0000\u0000\u00f8"+
		"\u00f9\u0005\n\u0000\u0000\u00f9\u00fa\u0005\n\u0000\u0000\u00fa\u00fb"+
		"\u0005\u0003\u0000\u0000\u00fb\u00fc\u0005\n\u0000\u0000\u00fc\u00fd\u0005"+
		"\u0003\u0000\u0000\u00fd\u00fe\u0005\n\u0000\u0000\u00fe\u017f\u0005\u0004"+
		"\u0000\u0000\u00ff\u0100\u0005\n\u0000\u0000\u0100\u0101\u0005\u0003\u0000"+
		"\u0000\u0101\u0102\u0005\u0004\u0000\u0000\u0102\u0103\u0005\n\u0000\u0000"+
		"\u0103\u0104\u0005\u0003\u0000\u0000\u0104\u0105\u0005\n\u0000\u0000\u0105"+
		"\u0106\u0005\u0003\u0000\u0000\u0106\u0107\u0005\n\u0000\u0000\u0107\u0108"+
		"\u0005\u0003\u0000\u0000\u0108\u0109\u0005\u0003\u0000\u0000\u0109\u010a"+
		"\u0005\n\u0000\u0000\u010a\u010b\u0005\u0003\u0000\u0000\u010b\u010c\u0005"+
		"\n\u0000\u0000\u010c\u010d\u0005\u0003\u0000\u0000\u010d\u010e\u0005\n"+
		"\u0000\u0000\u010e\u010f\u0005\u0003\u0000\u0000\u010f\u0110\u0005\n\u0000"+
		"\u0000\u0110\u0111\u0005\u0004\u0000\u0000\u0111\u0112\u0005\n\u0000\u0000"+
		"\u0112\u0113\u0005\u0003\u0000\u0000\u0113\u0114\u0005\u0003\u0000\u0000"+
		"\u0114\u0115\u0005\u0003\u0000\u0000\u0115\u0116\u0005\n\u0000\u0000\u0116"+
		"\u0117\u0005\u0003\u0000\u0000\u0117\u0118\u0005\u0003\u0000\u0000\u0118"+
		"\u0119\u0005\u0003\u0000\u0000\u0119\u011a\u0005\u0003\u0000\u0000\u011a"+
		"\u011b\u0005\u0003\u0000\u0000\u011b\u011c\u0005\u0003\u0000\u0000\u011c"+
		"\u011d\u0005\n\u0000\u0000\u011d\u011e\u0005\u0003\u0000\u0000\u011e\u011f"+
		"\u0005\n\u0000\u0000\u011f\u0120\u0005\u0003\u0000\u0000\u0120\u0174\u0005"+
		"\u0004\u0000\u0000\u0121\u0122\u0005\n\u0000\u0000\u0122\u0123\u0005\u0003"+
		"\u0000\u0000\u0123\u0124\u0005\u0003\u0000\u0000\u0124\u0126\u0003\u0014"+
		"\n\u0000\u0125\u0127\u0003\u0014\n\u0000\u0126\u0125\u0001\u0000\u0000"+
		"\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0129\u0001\u0000\u0000"+
		"\u0000\u0128\u012a\u0003\u0014\n\u0000\u0129\u0128\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012c\u0001\u0000\u0000\u0000"+
		"\u012b\u012d\u0003\u0014\n\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0001\u0000\u0000\u0000\u012d\u012f\u0001\u0000\u0000\u0000\u012e"+
		"\u0130\u0003\u0014\n\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u0001\u0000\u0000\u0000\u0130\u0132\u0001\u0000\u0000\u0000\u0131\u0133"+
		"\u0003\u0014\n\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0132\u0133\u0001"+
		"\u0000\u0000\u0000\u0133\u0135\u0001\u0000\u0000\u0000\u0134\u0136\u0003"+
		"\u0014\n\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000"+
		"\u0000\u0000\u0136\u013a\u0001\u0000\u0000\u0000\u0137\u0139\u0003\u0014"+
		"\n\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000"+
		"\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000"+
		"\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u0005\u0003\u0000\u0000\u013e\u013f\u0005\b\u0000\u0000"+
		"\u013f\u0140\u0005\u0003\u0000\u0000\u0140\u0142\u0003\u0014\n\u0000\u0141"+
		"\u0143\u0003\u0014\n\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0001\u0000\u0000\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u0146"+
		"\u0003\u0014\n\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0145\u0146\u0001"+
		"\u0000\u0000\u0000\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u0149\u0003"+
		"\u0014\n\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000"+
		"\u0000\u0000\u0149\u014b\u0001\u0000\u0000\u0000\u014a\u014c\u0003\u0014"+
		"\n\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000"+
		"\u0000\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u014f\u0003\u0014\n\u0000"+
		"\u014e\u014d\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000"+
		"\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u0152\u0003\u0014\n\u0000\u0151"+
		"\u0150\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152"+
		"\u0156\u0001\u0000\u0000\u0000\u0153\u0155\u0003\u0014\n\u0000\u0154\u0153"+
		"\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000\u0000\u0000\u0156\u0154"+
		"\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0159"+
		"\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u0005\u0003\u0000\u0000\u015a\u015b\u0005\b\u0000\u0000\u015b\u015c\u0005"+
		"\u0003\u0000\u0000\u015c\u015d\u0005\b\u0000\u0000\u015d\u015e\u0005\u0003"+
		"\u0000\u0000\u015e\u015f\u0005\b\u0000\u0000\u015f\u0160\u0005\u0003\u0000"+
		"\u0000\u0160\u0161\u0005\u0003\u0000\u0000\u0161\u0163\u0005\u0003\u0000"+
		"\u0000\u0162\u0164\u0005\b\u0000\u0000\u0163\u0162\u0001\u0000\u0000\u0000"+
		"\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000"+
		"\u0165\u0166\u0005\u0003\u0000\u0000\u0166\u0167\u0005\u0003\u0000\u0000"+
		"\u0167\u0168\u0005\u0003\u0000\u0000\u0168\u0169\u0005\u0003\u0000\u0000"+
		"\u0169\u016a\u0005\u0003\u0000\u0000\u016a\u016c\u0005\u0003\u0000\u0000"+
		"\u016b\u016d\u0005\b\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016c"+
		"\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e"+
		"\u016f\u0005\u0003\u0000\u0000\u016f\u0170\u0005\n\u0000\u0000\u0170\u0171"+
		"\u0005\u0003\u0000\u0000\u0171\u0172\u0005\u0004\u0000\u0000\u0172\u0173"+
		"\u0006\u0002\uffff\uffff\u0000\u0173\u0175\u0001\u0000\u0000\u0000\u0174"+
		"\u0121\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176"+
		"\u0174\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177"+
		"\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u0005\n\u0000\u0000\u0179\u017a"+
		"\u0005\u0003\u0000\u0000\u017a\u017b\u0005\n\u0000\u0000\u017b\u017c\u0005"+
		"\u0003\u0000\u0000\u017c\u017d\u0005\u0006\u0000\u0000\u017d\u017e\u0005"+
		"\u0004\u0000\u0000\u017e\u0180\u0001\u0000\u0000\u0000\u017f\u00ff\u0001"+
		"\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u017f\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0183\u0001"+
		"\u0000\u0000\u0000\u0183\u0184\u0005\u0005\u0000\u0000\u0184\u0185\u0005"+
		"\u0003\u0000\u0000\u0185\u0186\u0005\n\u0000\u0000\u0186\u0187\u0005\u0003"+
		"\u0000\u0000\u0187\u0188\u0005\n\u0000\u0000\u0188\u0189\u0005\n\u0000"+
		"\u0000\u0189\u018a\u0005\n\u0000\u0000\u018a\u018b\u0005\u0003\u0000\u0000"+
		"\u018b\u018c\u0005\n\u0000\u0000\u018c\u018d\u0005\u0003\u0000\u0000\u018d"+
		"\u018e\u0005\n\u0000\u0000\u018e\u018f\u0005\u0004\u0000\u0000\u018f\u0005"+
		"\u0001\u0000\u0000\u0000\u0190\u0191\u0005\u0005\u0000\u0000\u0191\u0192"+
		"\u0005\u0003\u0000\u0000\u0192\u0193\u0005\n\u0000\u0000\u0193\u0194\u0005"+
		"\n\u0000\u0000\u0194\u0195\u0005\u0003\u0000\u0000\u0195\u0196\u0005\n"+
		"\u0000\u0000\u0196\u0197\u0005\u0003\u0000\u0000\u0197\u0198\u0005\n\u0000"+
		"\u0000\u0198\u0199\u0005\u0003\u0000\u0000\u0199\u019a\u0005\n\u0000\u0000"+
		"\u019a\u0228\u0005\u0004\u0000\u0000\u019b\u019c\u0005\b\u0000\u0000\u019c"+
		"\u019e\u0005\u0003\u0000\u0000\u019d\u019f\u0003\u0014\n\u0000\u019e\u019d"+
		"\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u019e"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005\u0004\u0000\u0000\u01a3\u01a4"+
		"\u0005\u0005\u0000\u0000\u01a4\u01a5\u0005\u0003\u0000\u0000\u01a5\u01a7"+
		"\u0003\u0014\n\u0000\u01a6\u01a8\u0003\u0014\n\u0000\u01a7\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01aa\u0001"+
		"\u0000\u0000\u0000\u01a9\u01ab\u0003\u0014\n\u0000\u01aa\u01a9\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ad\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ae\u0003\u0014\n\u0000\u01ad\u01ac\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01b0\u0001\u0000\u0000"+
		"\u0000\u01af\u01b1\u0003\u0014\n\u0000\u01b0\u01af\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b4\u0003\u0014\n\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b6\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b7\u0003\u0014\n\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b6\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b7\u01bb\u0001\u0000\u0000\u0000\u01b8\u01ba"+
		"\u0003\u0014\n\u0000\u01b9\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bd\u0001"+
		"\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bc\u01be\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001"+
		"\u0000\u0000\u0000\u01be\u01bf\u0005\u0004\u0000\u0000\u01bf\u01c0\u0005"+
		"\u0005\u0000\u0000\u01c0\u01c1\u0005\u0003\u0000\u0000\u01c1\u01c3\u0003"+
		"\u0014\n\u0000\u01c2\u01c4\u0003\u0014\n\u0000\u01c3\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c7\u0003\u0014\n\u0000\u01c6\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c9\u0001\u0000\u0000"+
		"\u0000\u01c8\u01ca\u0003\u0014\n\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000"+
		"\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cc\u0001\u0000\u0000\u0000"+
		"\u01cb\u01cd\u0003\u0014\n\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cc"+
		"\u01cd\u0001\u0000\u0000\u0000\u01cd\u01cf\u0001\u0000\u0000\u0000\u01ce"+
		"\u01d0\u0003\u0014\n\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d2\u0001\u0000\u0000\u0000\u01d1\u01d3"+
		"\u0003\u0014\n\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d7\u0001\u0000\u0000\u0000\u01d4\u01d6\u0003"+
		"\u0014\n\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d9\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000"+
		"\u0000\u0000\u01d8\u01da\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000"+
		"\u0000\u0000\u01da\u01db\u0005\u0004\u0000\u0000\u01db\u01dc\u0005\u0005"+
		"\u0000\u0000\u01dc\u01dd\u0005\u0003\u0000\u0000\u01dd\u01de\u0005\b\u0000"+
		"\u0000\u01de\u01df\u0005\u0004\u0000\u0000\u01df\u01e0\u0006\u0003\uffff"+
		"\uffff\u0000\u01e0\u021d\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005\n\u0000"+
		"\u0000\u01e2\u01e3\u0005\u0003\u0000\u0000\u01e3\u01e4\u0005\n\u0000\u0000"+
		"\u01e4\u01e5\u0005\u0003\u0000\u0000\u01e5\u01e6\u0005\n\u0000\u0000\u01e6"+
		"\u01e7\u0005\u0003\u0000\u0000\u01e7\u01e8\u0005\n\u0000\u0000\u01e8\u01e9"+
		"\u0005\u0003\u0000\u0000\u01e9\u01ea\u0005\n\u0000\u0000\u01ea\u01eb\u0005"+
		"\u0003\u0000\u0000\u01eb\u01ec\u0005\n\u0000\u0000\u01ec\u01ed\u0005\u0003"+
		"\u0000\u0000\u01ed\u01ee\u0005\n\u0000\u0000\u01ee\u01ef\u0005\u0003\u0000"+
		"\u0000\u01ef\u01f0\u0005\n\u0000\u0000\u01f0\u01f1\u0005\u0003\u0000\u0000"+
		"\u01f1\u0219\u0005\u0004\u0000\u0000\u01f2\u01f3\u0005\u0003\u0000\u0000"+
		"\u01f3\u01f4\u0005\u0003\u0000\u0000\u01f4\u01f5\u0005\u0003\u0000\u0000"+
		"\u01f5\u01f6\u0005\u0003\u0000\u0000\u01f6\u01f7\u0005\u0003\u0000\u0000"+
		"\u01f7\u01f8\u0005\u0003\u0000\u0000\u01f8\u01f9\u0005\u0003\u0000\u0000"+
		"\u01f9\u01fa\u0005\u0003\u0000\u0000\u01fa\u021a\u0005\u0004\u0000\u0000"+
		"\u01fb\u01fd\u0005\u0006\u0000\u0000\u01fc\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000"+
		"\u01fe\u0200\u0005\u0003\u0000\u0000\u01ff\u0201\u0005\b\u0000\u0000\u0200"+
		"\u01ff\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201"+
		"\u0202\u0001\u0000\u0000\u0000\u0202\u0204\u0005\u0003\u0000\u0000\u0203"+
		"\u0205\u0005\b\u0000\u0000\u0204\u0203\u0001\u0000\u0000\u0000\u0204\u0205"+
		"\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0208"+
		"\u0005\u0003\u0000\u0000\u0207\u0209\u0005\b\u0000\u0000\u0208\u0207\u0001"+
		"\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u020a\u0001"+
		"\u0000\u0000\u0000\u020a\u020c\u0005\u0003\u0000\u0000\u020b\u020d\u0005"+
		"\b\u0000\u0000\u020c\u020b\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000"+
		"\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u020f\u0005\u0003"+
		"\u0000\u0000\u020f\u0210\u0005\b\u0000\u0000\u0210\u0211\u0005\u0003\u0000"+
		"\u0000\u0211\u0212\u0005\b\u0000\u0000\u0212\u0214\u0005\u0003\u0000\u0000"+
		"\u0213\u0215\u0005\b\u0000\u0000\u0214\u0213\u0001\u0000\u0000\u0000\u0214"+
		"\u0215\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216"+
		"\u0217\u0005\u0003\u0000\u0000\u0217\u0218\u0005\u0004\u0000\u0000\u0218"+
		"\u021a\u0006\u0003\uffff\uffff\u0000\u0219\u01f2\u0001\u0000\u0000\u0000"+
		"\u0219\u01fc\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000"+
		"\u021b\u0219\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000"+
		"\u021c\u021e\u0001\u0000\u0000\u0000\u021d\u01e1\u0001\u0000\u0000\u0000"+
		"\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000"+
		"\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000"+
		"\u0221\u0222\u0005\n\u0000\u0000\u0222\u0223\u0005\u0003\u0000\u0000\u0223"+
		"\u0224\u0005\n\u0000\u0000\u0224\u0225\u0005\u0003\u0000\u0000\u0225\u0226"+
		"\u0005\u0006\u0000\u0000\u0226\u0227\u0005\u0004\u0000\u0000\u0227\u0229"+
		"\u0001\u0000\u0000\u0000\u0228\u019b\u0001\u0000\u0000\u0000\u0229\u022a"+
		"\u0001\u0000\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022a\u022b"+
		"\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022d"+
		"\u0005\u0005\u0000\u0000\u022d\u022e\u0005\u0003\u0000\u0000\u022e\u022f"+
		"\u0005\n\u0000\u0000\u022f\u0230\u0005\n\u0000\u0000\u0230\u0231\u0005"+
		"\u0003\u0000\u0000\u0231\u0232\u0005\n\u0000\u0000\u0232\u0233\u0005\u0003"+
		"\u0000\u0000\u0233\u0234\u0005\n\u0000\u0000\u0234\u0235\u0005\u0003\u0000"+
		"\u0000\u0235\u0236\u0005\n\u0000\u0000\u0236\u0237\u0005\u0004\u0000\u0000"+
		"\u0237\u0007\u0001\u0000\u0000\u0000\u0238\u0239\u0005\u0005\u0000\u0000"+
		"\u0239\u023a\u0005\u0003\u0000\u0000\u023a\u023b\u0005\n\u0000\u0000\u023b"+
		"\u023c\u0005\n\u0000\u0000\u023c\u023d\u0005\u0003\u0000\u0000\u023d\u023e"+
		"\u0005\n\u0000\u0000\u023e\u023f\u0005\u0003\u0000\u0000\u023f\u0240\u0005"+
		"\n\u0000\u0000\u0240\u0241\u0005\u0003\u0000\u0000\u0241\u0242\u0005\n"+
		"\u0000\u0000\u0242\u0281\u0005\u0004\u0000\u0000\u0243\u0244\u0005\b\u0000"+
		"\u0000\u0244\u0246\u0005\u0003\u0000\u0000\u0245\u0247\u0003\u0014\n\u0000"+
		"\u0246\u0245\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000"+
		"\u0248\u0246\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000"+
		"\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u0276\u0005\u0004\u0000\u0000"+
		"\u024b\u024c\u0005\n\u0000\u0000\u024c\u024d\u0005\u0003\u0000\u0000\u024d"+
		"\u024e\u0005\n\u0000\u0000\u024e\u024f\u0005\u0003\u0000\u0000\u024f\u0250"+
		"\u0005\n\u0000\u0000\u0250\u0251\u0005\u0003\u0000\u0000\u0251\u0252\u0005"+
		"\n\u0000\u0000\u0252\u0253\u0005\u0003\u0000\u0000\u0253\u0254\u0005\n"+
		"\u0000\u0000\u0254\u0255\u0005\u0003\u0000\u0000\u0255\u0256\u0005\n\u0000"+
		"\u0000\u0256\u0257\u0005\u0003\u0000\u0000\u0257\u0258\u0005\n\u0000\u0000"+
		"\u0258\u0259\u0005\u0003\u0000\u0000\u0259\u0272\u0005\u0004\u0000\u0000"+
		"\u025a\u025b\u0005\u0003\u0000\u0000\u025b\u025c\u0005\u0003\u0000\u0000"+
		"\u025c\u025d\u0005\u0003\u0000\u0000\u025d\u025e\u0005\u0003\u0000\u0000"+
		"\u025e\u025f\u0005\u0003\u0000\u0000\u025f\u0260\u0005\u0003\u0000\u0000"+
		"\u0260\u0261\u0005\u0003\u0000\u0000\u0261\u0273\u0005\u0004\u0000\u0000"+
		"\u0262\u0263\u0005\u0006\u0000\u0000\u0263\u0264\u0005\u0003\u0000\u0000"+
		"\u0264\u0265\u0005\b\u0000\u0000\u0265\u0266\u0005\u0003\u0000\u0000\u0266"+
		"\u0267\u0005\b\u0000\u0000\u0267\u0268\u0005\u0003\u0000\u0000\u0268\u0269"+
		"\u0005\b\u0000\u0000\u0269\u026a\u0005\u0003\u0000\u0000\u026a\u026b\u0005"+
		"\b\u0000\u0000\u026b\u026c\u0005\u0003\u0000\u0000\u026c\u026d\u0005\b"+
		"\u0000\u0000\u026d\u026e\u0005\u0003\u0000\u0000\u026e\u026f\u0005\b\u0000"+
		"\u0000\u026f\u0270\u0005\u0003\u0000\u0000\u0270\u0271\u0005\u0004\u0000"+
		"\u0000\u0271\u0273\u0006\u0004\uffff\uffff\u0000\u0272\u025a\u0001\u0000"+
		"\u0000\u0000\u0272\u0262\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000"+
		"\u0000\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000"+
		"\u0000\u0000\u0275\u0277\u0001\u0000\u0000\u0000\u0276\u024b\u0001\u0000"+
		"\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u0276\u0001\u0000"+
		"\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000"+
		"\u0000\u0000\u027a\u027b\u0005\n\u0000\u0000\u027b\u027c\u0005\u0003\u0000"+
		"\u0000\u027c\u027d\u0005\n\u0000\u0000\u027d\u027e\u0005\u0003\u0000\u0000"+
		"\u027e\u027f\u0005\u0006\u0000\u0000\u027f\u0280\u0005\u0004\u0000\u0000"+
		"\u0280\u0282\u0001\u0000\u0000\u0000\u0281\u0243\u0001\u0000\u0000\u0000"+
		"\u0282\u0283\u0001\u0000\u0000\u0000\u0283\u0281\u0001\u0000\u0000\u0000"+
		"\u0283\u0284\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000"+
		"\u0285\u0286\u0005\u0005\u0000\u0000\u0286\u0287\u0005\u0003\u0000\u0000"+
		"\u0287\u0288\u0005\n\u0000\u0000\u0288\u0289\u0005\n\u0000\u0000\u0289"+
		"\u028a\u0005\u0003\u0000\u0000\u028a\u028b\u0005\n\u0000\u0000\u028b\u028c"+
		"\u0005\u0003\u0000\u0000\u028c\u028d\u0005\n\u0000\u0000\u028d\u028e\u0005"+
		"\u0003\u0000\u0000\u028e\u028f\u0005\n\u0000\u0000\u028f\u0290\u0005\u0004"+
		"\u0000\u0000\u0290\t\u0001\u0000\u0000\u0000\u0291\u0292\u0005\u0005\u0000"+
		"\u0000\u0292\u0293\u0005\u0003\u0000\u0000\u0293\u0294\u0005\n\u0000\u0000"+
		"\u0294\u0295\u0005\n\u0000\u0000\u0295\u0296\u0005\u0003\u0000\u0000\u0296"+
		"\u0297\u0005\n\u0000\u0000\u0297\u0298\u0005\u0003\u0000\u0000\u0298\u0299"+
		"\u0005\n\u0000\u0000\u0299\u029a\u0005\u0003\u0000\u0000\u029a\u029b\u0005"+
		"\n\u0000\u0000\u029b\u02d5\u0005\u0004\u0000\u0000\u029c\u029d\u0005\u0005"+
		"\u0000\u0000\u029d\u029e\u0005\u0003\u0000\u0000\u029e\u029f\u0005\b\u0000"+
		"\u0000\u029f\u02a0\u0005\u0003\u0000\u0000\u02a0\u02a1\u0005\n\u0000\u0000"+
		"\u02a1\u02a2\u0005\u0003\u0000\u0000\u02a2\u02a4\u0003\u0014\n\u0000\u02a3"+
		"\u02a5\u0003\u0014\n\u0000\u02a4\u02a3\u0001\u0000\u0000\u0000\u02a4\u02a5"+
		"\u0001\u0000\u0000\u0000\u02a5\u02a7\u0001\u0000\u0000\u0000\u02a6\u02a8"+
		"\u0003\u0014\n\u0000\u02a7\u02a6\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001"+
		"\u0000\u0000\u0000\u02a8\u02aa\u0001\u0000\u0000\u0000\u02a9\u02ab\u0003"+
		"\u0014\n\u0000\u02aa\u02a9\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000"+
		"\u0000\u0000\u02ab\u02ad\u0001\u0000\u0000\u0000\u02ac\u02ae\u0003\u0014"+
		"\n\u0000\u02ad\u02ac\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000\u0000"+
		"\u0000\u02ae\u02b0\u0001\u0000\u0000\u0000\u02af\u02b1\u0003\u0014\n\u0000"+
		"\u02b0\u02af\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000"+
		"\u02b1\u02b3\u0001\u0000\u0000\u0000\u02b2\u02b4\u0003\u0014\n\u0000\u02b3"+
		"\u02b2\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4"+
		"\u02b8\u0001\u0000\u0000\u0000\u02b5\u02b7\u0003\u0014\n\u0000\u02b6\u02b5"+
		"\u0001\u0000\u0000\u0000\u02b7\u02ba\u0001\u0000\u0000\u0000\u02b8\u02b6"+
		"\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000\u0000\u02b9\u02bb"+
		"\u0001\u0000\u0000\u0000\u02ba\u02b8\u0001\u0000\u0000\u0000\u02bb\u02bc"+
		"\u0005\u0004\u0000\u0000\u02bc\u02bd\u0005\u0005\u0000\u0000\u02bd\u02be"+
		"\u0005\u0003\u0000\u0000\u02be\u02bf\u0005\t\u0000\u0000\u02bf\u02c0\u0005"+
		"\u0004\u0000\u0000\u02c0\u02c1\u0005\u0005\u0000\u0000\u02c1\u02c2\u0005"+
		"\u0003\u0000\u0000\u02c2\u02c3\u0005\t\u0000\u0000\u02c3\u02c4\u0005\u0004"+
		"\u0000\u0000\u02c4\u02c5\u0005\u0005\u0000\u0000\u02c5\u02c6\u0005\u0003"+
		"\u0000\u0000\u02c6\u02c7\u0005\b\u0000\u0000\u02c7\u02c8\u0005\n\u0000"+
		"\u0000\u02c8\u02c9\u0005\u0004\u0000\u0000\u02c9\u02ca\u0005\u0005\u0000"+
		"\u0000\u02ca\u02cb\u0005\u0003\u0000\u0000\u02cb\u02cc\u0005\u0006\u0000"+
		"\u0000\u02cc\u02cd\u0005\u0004\u0000\u0000\u02cd\u02ce\u0005\n\u0000\u0000"+
		"\u02ce\u02cf\u0005\u0003\u0000\u0000\u02cf\u02d0\u0005\n\u0000\u0000\u02d0"+
		"\u02d1\u0005\u0003\u0000\u0000\u02d1\u02d2\u0005\u0006\u0000\u0000\u02d2"+
		"\u02d3\u0005\u0004\u0000\u0000\u02d3\u02d4\u0006\u0005\uffff\uffff\u0000"+
		"\u02d4\u02d6\u0001\u0000\u0000\u0000\u02d5\u029c\u0001\u0000\u0000\u0000"+
		"\u02d6\u02d7\u0001\u0000\u0000\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000"+
		"\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000\u0000\u0000"+
		"\u02d9\u02da\u0005\u0005\u0000\u0000\u02da\u02db\u0005\u0003\u0000\u0000"+
		"\u02db\u02dc\u0005\n\u0000\u0000\u02dc\u02dd\u0005\n\u0000\u0000\u02dd"+
		"\u02de\u0005\u0003\u0000\u0000\u02de\u02df\u0005\n\u0000\u0000\u02df\u02e0"+
		"\u0005\u0003\u0000\u0000\u02e0\u02e1\u0005\n\u0000\u0000\u02e1\u02e2\u0005"+
		"\u0003\u0000\u0000\u02e2\u02e3\u0005\n\u0000\u0000\u02e3\u02e4\u0005\u0004"+
		"\u0000\u0000\u02e4\u000b\u0001\u0000\u0000\u0000\u02e5\u02e6\u0005\u0005"+
		"\u0000\u0000\u02e6\u02e7\u0005\u0003\u0000\u0000\u02e7\u02e8\u0005\n\u0000"+
		"\u0000\u02e8\u02e9\u0005\u0003\u0000\u0000\u02e9\u02ea\u0005\n\u0000\u0000"+
		"\u02ea\u02eb\u0005\n\u0000\u0000\u02eb\u02ec\u0005\n\u0000\u0000\u02ec"+
		"\u02ed\u0005\u0003\u0000\u0000\u02ed\u02ee\u0005\n\u0000\u0000\u02ee\u02ef"+
		"\u0005\u0003\u0000\u0000\u02ef\u02f0\u0005\n\u0000\u0000\u02f0\u0335\u0005"+
		"\u0004\u0000\u0000\u02f1\u02f2\u0005\n\u0000\u0000\u02f2\u02f3\u0005\u0003"+
		"\u0000\u0000\u02f3\u02f4\u0005\u0004\u0000\u0000\u02f4\u02f5\u0005\n\u0000"+
		"\u0000\u02f5\u02f6\u0005\u0003\u0000\u0000\u02f6\u02f7\u0005\n\u0000\u0000"+
		"\u02f7\u02f8\u0005\u0003\u0000\u0000\u02f8\u02f9\u0005\n\u0000\u0000\u02f9"+
		"\u02fa\u0005\u0003\u0000\u0000\u02fa\u02fb\u0005\n\u0000\u0000\u02fb\u02fc"+
		"\u0005\u0003\u0000\u0000\u02fc\u02fd\u0005\n\u0000\u0000\u02fd\u02fe\u0005"+
		"\u0003\u0000\u0000\u02fe\u02ff\u0005\n\u0000\u0000\u02ff\u0300\u0005\u0003"+
		"\u0000\u0000\u0300\u0301\u0005\n\u0000\u0000\u0301\u0302\u0005\u0003\u0000"+
		"\u0000\u0302\u0303\u0005\n\u0000\u0000\u0303\u0304\u0005\u0003\u0000\u0000"+
		"\u0304\u0305\u0005\n\u0000\u0000\u0305\u0306\u0005\u0003\u0000\u0000\u0306"+
		"\u0307\u0005\n\u0000\u0000\u0307\u0308\u0005\u0003\u0000\u0000\u0308\u0309"+
		"\u0005\n\u0000\u0000\u0309\u030a\u0005\u0003\u0000\u0000\u030a\u032a\u0005"+
		"\u0004\u0000\u0000\u030b\u030c\u0005\n\u0000\u0000\u030c\u030d\u0005\u0003"+
		"\u0000\u0000\u030d\u030e\u0005\b\u0000\u0000\u030e\u0310\u0005\u0003\u0000"+
		"\u0000\u030f\u0311\u0005\b\u0000\u0000\u0310\u030f\u0001\u0000\u0000\u0000"+
		"\u0310\u0311\u0001\u0000\u0000\u0000\u0311\u0312\u0001\u0000\u0000\u0000"+
		"\u0312\u0314\u0005\u0003\u0000\u0000\u0313\u0315\u0003\u0014\n\u0000\u0314"+
		"\u0313\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316"+
		"\u0314\u0001\u0000\u0000\u0000\u0316\u0317\u0001\u0000\u0000\u0000\u0317"+
		"\u0318\u0001\u0000\u0000\u0000\u0318\u0319\u0005\u0003\u0000\u0000\u0319"+
		"\u031a\u0005\n\u0000\u0000\u031a\u031b\u0005\u0003\u0000\u0000\u031b\u031c"+
		"\u0005\n\u0000\u0000\u031c\u031d\u0005\u0003\u0000\u0000\u031d\u031e\u0005"+
		"\b\u0000\u0000\u031e\u031f\u0005\u0003\u0000\u0000\u031f\u0320\u0005\b"+
		"\u0000\u0000\u0320\u0321\u0005\u0003\u0000\u0000\u0321\u0322\u0005\b\u0000"+
		"\u0000\u0322\u0323\u0005\u0003\u0000\u0000\u0323\u0324\u0005\b\u0000\u0000"+
		"\u0324\u0325\u0005\u0003\u0000\u0000\u0325\u0326\u0005\b\u0000\u0000\u0326"+
		"\u0327\u0005\u0003\u0000\u0000\u0327\u0328\u0005\u0004\u0000\u0000\u0328"+
		"\u0329\u0006\u0006\uffff\uffff\u0000\u0329\u032b\u0001\u0000\u0000\u0000"+
		"\u032a\u030b\u0001\u0000\u0000\u0000\u032b\u032c\u0001\u0000\u0000\u0000"+
		"\u032c\u032a\u0001\u0000\u0000\u0000\u032c\u032d\u0001\u0000\u0000\u0000"+
		"\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u032f\u0005\n\u0000\u0000\u032f"+
		"\u0330\u0005\u0003\u0000\u0000\u0330\u0331\u0005\n\u0000\u0000\u0331\u0332"+
		"\u0005\u0003\u0000\u0000\u0332\u0333\u0005\u0006\u0000\u0000\u0333\u0334"+
		"\u0005\u0004\u0000\u0000\u0334\u0336\u0001\u0000\u0000\u0000\u0335\u02f1"+
		"\u0001\u0000\u0000\u0000\u0336\u0337\u0001\u0000\u0000\u0000\u0337\u0335"+
		"\u0001\u0000\u0000\u0000\u0337\u0338\u0001\u0000\u0000\u0000\u0338\u0339"+
		"\u0001\u0000\u0000\u0000\u0339\u033a\u0005\u0005\u0000\u0000\u033a\u033b"+
		"\u0005\u0003\u0000\u0000\u033b\u033c\u0005\n\u0000\u0000\u033c\u033d\u0005"+
		"\u0003\u0000\u0000\u033d\u033e\u0005\n\u0000\u0000\u033e\u033f\u0005\n"+
		"\u0000\u0000\u033f\u0340\u0005\n\u0000\u0000\u0340\u0341\u0005\u0003\u0000"+
		"\u0000\u0341\u0342\u0005\n\u0000\u0000\u0342\u0343\u0005\u0003\u0000\u0000"+
		"\u0343\u0344\u0005\n\u0000\u0000\u0344\u0345\u0005\u0004\u0000\u0000\u0345"+
		"\r\u0001\u0000\u0000\u0000\u0346\u0347\u0005\u0005\u0000\u0000\u0347\u0348"+
		"\u0005\u0003\u0000\u0000\u0348\u0349\u0005\n\u0000\u0000\u0349\u034a\u0005"+
		"\n\u0000\u0000\u034a\u034b\u0005\u0003\u0000\u0000\u034b\u034c\u0005\n"+
		"\u0000\u0000\u034c\u034d\u0005\u0003\u0000\u0000\u034d\u034e\u0005\n\u0000"+
		"\u0000\u034e\u03a0\u0005\u0004\u0000\u0000\u034f\u0350\u0005\u0005\u0000"+
		"\u0000\u0350\u0351\u0005\u0003\u0000\u0000\u0351\u0352\u0005\b\u0000\u0000"+
		"\u0352\u0356\u0005\u0003\u0000\u0000\u0353\u0355\u0003\u0014\n\u0000\u0354"+
		"\u0353\u0001\u0000\u0000\u0000\u0355\u0358\u0001\u0000\u0000\u0000\u0356"+
		"\u0354\u0001\u0000\u0000\u0000\u0356\u0357\u0001\u0000\u0000\u0000\u0357"+
		"\u0359\u0001\u0000\u0000\u0000\u0358\u0356\u0001\u0000\u0000\u0000\u0359"+
		"\u035a\u0005\u0004\u0000\u0000\u035a\u035c\u0003\u0014\n\u0000\u035b\u035d"+
		"\u0003\u0014\n\u0000\u035c\u035b\u0001\u0000\u0000\u0000\u035c\u035d\u0001"+
		"\u0000\u0000\u0000\u035d\u035f\u0001\u0000\u0000\u0000\u035e\u0360\u0003"+
		"\u0014\n\u0000\u035f\u035e\u0001\u0000\u0000\u0000\u035f\u0360\u0001\u0000"+
		"\u0000\u0000\u0360\u0362\u0001\u0000\u0000\u0000\u0361\u0363\u0003\u0014"+
		"\n\u0000\u0362\u0361\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000"+
		"\u0000\u0363\u0365\u0001\u0000\u0000\u0000\u0364\u0366\u0003\u0014\n\u0000"+
		"\u0365\u0364\u0001\u0000\u0000\u0000\u0365\u0366\u0001\u0000\u0000\u0000"+
		"\u0366\u0368\u0001\u0000\u0000\u0000\u0367\u0369\u0003\u0014\n\u0000\u0368"+
		"\u0367\u0001\u0000\u0000\u0000\u0368\u0369\u0001\u0000\u0000\u0000\u0369"+
		"\u036b\u0001\u0000\u0000\u0000\u036a\u036c\u0003\u0014\n\u0000\u036b\u036a"+
		"\u0001\u0000\u0000\u0000\u036b\u036c\u0001\u0000\u0000\u0000\u036c\u0370"+
		"\u0001\u0000\u0000\u0000\u036d\u036f\u0003\u0014\n\u0000\u036e\u036d\u0001"+
		"\u0000\u0000\u0000\u036f\u0372\u0001\u0000\u0000\u0000\u0370\u036e\u0001"+
		"\u0000\u0000\u0000\u0370\u0371\u0001\u0000\u0000\u0000\u0371\u0373\u0001"+
		"\u0000\u0000\u0000\u0372\u0370\u0001\u0000\u0000\u0000\u0373\u0374\u0005"+
		"\u0004\u0000\u0000\u0374\u0376\u0003\u0014\n\u0000\u0375\u0377\u0003\u0014"+
		"\n\u0000\u0376\u0375\u0001\u0000\u0000\u0000\u0376\u0377\u0001\u0000\u0000"+
		"\u0000\u0377\u0379\u0001\u0000\u0000\u0000\u0378\u037a\u0003\u0014\n\u0000"+
		"\u0379\u0378\u0001\u0000\u0000\u0000\u0379\u037a\u0001\u0000\u0000\u0000"+
		"\u037a\u037c\u0001\u0000\u0000\u0000\u037b\u037d\u0003\u0014\n\u0000\u037c"+
		"\u037b\u0001\u0000\u0000\u0000\u037c\u037d\u0001\u0000\u0000\u0000\u037d"+
		"\u037f\u0001\u0000\u0000\u0000\u037e\u0380\u0003\u0014\n\u0000\u037f\u037e"+
		"\u0001\u0000\u0000\u0000\u037f\u0380\u0001\u0000\u0000\u0000\u0380\u0382"+
		"\u0001\u0000\u0000\u0000\u0381\u0383\u0003\u0014\n\u0000\u0382\u0381\u0001"+
		"\u0000\u0000\u0000\u0382\u0383\u0001\u0000\u0000\u0000\u0383\u0385\u0001"+
		"\u0000\u0000\u0000\u0384\u0386\u0003\u0014\n\u0000\u0385\u0384\u0001\u0000"+
		"\u0000\u0000\u0385\u0386\u0001\u0000\u0000\u0000\u0386\u038a\u0001\u0000"+
		"\u0000\u0000\u0387\u0389\u0003\u0014\n\u0000\u0388\u0387\u0001\u0000\u0000"+
		"\u0000\u0389\u038c\u0001\u0000\u0000\u0000\u038a\u0388\u0001\u0000\u0000"+
		"\u0000\u038a\u038b\u0001\u0000\u0000\u0000\u038b\u038d\u0001\u0000\u0000"+
		"\u0000\u038c\u038a\u0001\u0000\u0000\u0000\u038d\u038e\u0005\u0004\u0000"+
		"\u0000\u038e\u0392\u0005\u0006\u0000\u0000\u038f\u0391\u0005\n\u0000\u0000"+
		"\u0390\u038f\u0001\u0000\u0000\u0000\u0391\u0394\u0001\u0000\u0000\u0000"+
		"\u0392\u0390\u0001\u0000\u0000\u0000\u0392\u0393\u0001\u0000\u0000\u0000"+
		"\u0393\u0395\u0001\u0000\u0000\u0000\u0394\u0392\u0001\u0000\u0000\u0000"+
		"\u0395\u0396\u0005\u0004\u0000\u0000\u0396\u0397\u0003\u0014\n\u0000\u0397"+
		"\u0398\u0005\u0004\u0000\u0000\u0398\u0399\u0005\n\u0000\u0000\u0399\u039a"+
		"\u0005\u0003\u0000\u0000\u039a\u039b\u0005\n\u0000\u0000\u039b\u039c\u0005"+
		"\u0003\u0000\u0000\u039c\u039d\u0005\u0006\u0000\u0000\u039d\u039e\u0005"+
		"\u0004\u0000\u0000\u039e\u039f\u0006\u0007\uffff\uffff\u0000\u039f\u03a1"+
		"\u0001\u0000\u0000\u0000\u03a0\u034f\u0001\u0000\u0000\u0000\u03a1\u03a2"+
		"\u0001\u0000\u0000\u0000\u03a2\u03a0\u0001\u0000\u0000\u0000\u03a2\u03a3"+
		"\u0001\u0000\u0000\u0000\u03a3\u03a4\u0001\u0000\u0000\u0000\u03a4\u03a5"+
		"\u0005\u0005\u0000\u0000\u03a5\u03a6\u0005\u0003\u0000\u0000\u03a6\u03a7"+
		"\u0005\n\u0000\u0000\u03a7\u03a8\u0005\n\u0000\u0000\u03a8\u03a9\u0005"+
		"\u0003\u0000\u0000\u03a9\u03aa\u0005\n\u0000\u0000\u03aa\u03ab\u0005\u0003"+
		"\u0000\u0000\u03ab\u03ac\u0005\n\u0000\u0000\u03ac\u03ad\u0005\u0004\u0000"+
		"\u0000\u03ad\u000f\u0001\u0000\u0000\u0000\u03ae\u03af\u0005\u0005\u0000"+
		"\u0000\u03af\u03b0\u0005\u0003\u0000\u0000\u03b0\u03b1\u0005\n\u0000\u0000"+
		"\u03b1\u03b2\u0005\n\u0000\u0000\u03b2\u03b3\u0005\n\u0000\u0000\u03b3"+
		"\u03b4\u0005\u0003\u0000\u0000\u03b4\u03b5\u0005\n\u0000\u0000\u03b5\u03b6"+
		"\u0005\n\u0000\u0000\u03b6\u03b7\u0005\n\u0000\u0000\u03b7\u03b8\u0005"+
		"\u0003\u0000\u0000\u03b8\u03b9\u0005\n\u0000\u0000\u03b9\u03ba\u0005\u0003"+
		"\u0000\u0000\u03ba\u03bb\u0005\n\u0000\u0000\u03bb\u042a\u0005\u0004\u0000"+
		"\u0000\u03bc\u03bd\u0005\u0005\u0000\u0000\u03bd\u03be\u0005\u0003\u0000"+
		"\u0000\u03be\u03bf\u0005\b\u0000\u0000\u03bf\u03c0\u0005\u0004\u0000\u0000"+
		"\u03c0\u03c1\u0005\n\u0000\u0000\u03c1\u03c3\u0005\u0003\u0000\u0000\u03c2"+
		"\u03c4\u0005\n\u0000\u0000\u03c3\u03c2\u0001\u0000\u0000\u0000\u03c3\u03c4"+
		"\u0001\u0000\u0000\u0000\u03c4\u03c5\u0001\u0000\u0000\u0000\u03c5\u03c6"+
		"\u0005\u0003\u0000\u0000\u03c6\u03c7\u0005\n\u0000\u0000\u03c7\u03c8\u0005"+
		"\u0003\u0000\u0000\u03c8\u03c9\u0005\n\u0000\u0000\u03c9\u03ca\u0005\u0003"+
		"\u0000\u0000\u03ca\u03cb\u0005\n\u0000\u0000\u03cb\u03cc\u0005\u0003\u0000"+
		"\u0000\u03cc\u03cd\u0005\n\u0000\u0000\u03cd\u03ce\u0005\u0003\u0000\u0000"+
		"\u03ce\u03cf\u0005\n\u0000\u0000\u03cf\u03d0\u0005\u0003\u0000\u0000\u03d0"+
		"\u03d1\u0005\n\u0000\u0000\u03d1\u03d2\u0005\u0003\u0000\u0000\u03d2\u03d3"+
		"\u0005\n\u0000\u0000\u03d3\u03d4\u0005\u0003\u0000\u0000\u03d4\u03d5\u0005"+
		"\n\u0000\u0000\u03d5\u03d6\u0005\u0003\u0000\u0000\u03d6\u0420\u0005\u0004"+
		"\u0000\u0000\u03d7\u03d8\u0005\u0003\u0000\u0000\u03d8\u03d9\u0005\u0003"+
		"\u0000\u0000\u03d9\u03da\u0005\u0003\u0000\u0000\u03da\u03db\u0005\u0003"+
		"\u0000\u0000\u03db\u03dc\u0005\u0003\u0000\u0000\u03dc\u03dd\u0005\u0003"+
		"\u0000\u0000\u03dd\u03de\u0005\u0003\u0000\u0000\u03de\u03df\u0005\u0003"+
		"\u0000\u0000\u03df\u03e0\u0005\u0003\u0000\u0000\u03e0\u03e1\u0005\u0003"+
		"\u0000\u0000\u03e1\u0421\u0005\u0004\u0000\u0000\u03e2\u03e4\u0003\u0014"+
		"\n\u0000\u03e3\u03e5\u0003\u0014\n\u0000\u03e4\u03e3\u0001\u0000\u0000"+
		"\u0000\u03e4\u03e5\u0001\u0000\u0000\u0000\u03e5\u03e7\u0001\u0000\u0000"+
		"\u0000\u03e6\u03e8\u0003\u0014\n\u0000\u03e7\u03e6\u0001\u0000\u0000\u0000"+
		"\u03e7\u03e8\u0001\u0000\u0000\u0000\u03e8\u03ea\u0001\u0000\u0000\u0000"+
		"\u03e9\u03eb\u0003\u0014\n\u0000\u03ea\u03e9\u0001\u0000\u0000\u0000\u03ea"+
		"\u03eb\u0001\u0000\u0000\u0000\u03eb\u03ed\u0001\u0000\u0000\u0000\u03ec"+
		"\u03ee\u0003\u0014\n\u0000\u03ed\u03ec\u0001\u0000\u0000\u0000\u03ed\u03ee"+
		"\u0001\u0000\u0000\u0000\u03ee\u03f0\u0001\u0000\u0000\u0000\u03ef\u03f1"+
		"\u0003\u0014\n\u0000\u03f0\u03ef\u0001\u0000\u0000\u0000\u03f0\u03f1\u0001"+
		"\u0000\u0000\u0000\u03f1\u03f3\u0001\u0000\u0000\u0000\u03f2\u03f4\u0003"+
		"\u0014\n\u0000\u03f3\u03f2\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000"+
		"\u0000\u0000\u03f4\u03f8\u0001\u0000\u0000\u0000\u03f5\u03f7\u0003\u0014"+
		"\n\u0000\u03f6\u03f5\u0001\u0000\u0000\u0000\u03f7\u03fa\u0001\u0000\u0000"+
		"\u0000\u03f8\u03f6\u0001\u0000\u0000\u0000\u03f8\u03f9\u0001\u0000\u0000"+
		"\u0000\u03f9\u03fb\u0001\u0000\u0000\u0000\u03fa\u03f8\u0001\u0000\u0000"+
		"\u0000\u03fb\u03fd\u0005\u0003\u0000\u0000\u03fc\u03fe\u0005\n\u0000\u0000"+
		"\u03fd\u03fc\u0001\u0000\u0000\u0000\u03fd\u03fe\u0001\u0000\u0000\u0000"+
		"\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff\u0400\u0005\u0003\u0000\u0000"+
		"\u0400\u0401\u0005\n\u0000\u0000\u0401\u0405\u0005\u0003\u0000\u0000\u0402"+
		"\u0404\u0003\u0014\n\u0000\u0403\u0402\u0001\u0000\u0000\u0000\u0404\u0407"+
		"\u0001\u0000\u0000\u0000\u0405\u0403\u0001\u0000\u0000\u0000\u0405\u0406"+
		"\u0001\u0000\u0000\u0000\u0406\u0408\u0001\u0000\u0000\u0000\u0407\u0405"+
		"\u0001\u0000\u0000\u0000\u0408\u040a\u0005\u0003\u0000\u0000\u0409\u040b"+
		"\u0005\u0006\u0000\u0000\u040a\u0409\u0001\u0000\u0000\u0000\u040a\u040b"+
		"\u0001\u0000\u0000\u0000\u040b\u040c\u0001\u0000\u0000\u0000\u040c\u040d"+
		"\u0005\u0003\u0000\u0000\u040d\u040e\u0005\u0006\u0000\u0000\u040e\u0410"+
		"\u0005\u0003\u0000\u0000\u040f\u0411\u0005\n\u0000\u0000\u0410\u040f\u0001"+
		"\u0000\u0000\u0000\u0410\u0411\u0001\u0000\u0000\u0000\u0411\u0412\u0001"+
		"\u0000\u0000\u0000\u0412\u0413\u0005\u0003\u0000\u0000\u0413\u0414\u0005"+
		"\b\u0000\u0000\u0414\u0416\u0005\u0003\u0000\u0000\u0415\u0417\u0005\b"+
		"\u0000\u0000\u0416\u0415\u0001\u0000\u0000\u0000\u0416\u0417\u0001\u0000"+
		"\u0000\u0000\u0417\u0418\u0001\u0000\u0000\u0000\u0418\u041a\u0005\u0003"+
		"\u0000\u0000\u0419\u041b\u0005\b\u0000\u0000\u041a\u0419\u0001\u0000\u0000"+
		"\u0000\u041a\u041b\u0001\u0000\u0000\u0000\u041b\u041c\u0001\u0000\u0000"+
		"\u0000\u041c\u041d\u0005\u0003\u0000\u0000\u041d\u041e\u0005\u0004\u0000"+
		"\u0000\u041e\u041f\u0006\b\uffff\uffff\u0000\u041f\u0421\u0001\u0000\u0000"+
		"\u0000\u0420\u03d7\u0001\u0000\u0000\u0000\u0420\u03e2\u0001\u0000\u0000"+
		"\u0000\u0421\u0422\u0001\u0000\u0000\u0000\u0422\u0420\u0001\u0000\u0000"+
		"\u0000\u0422\u0423\u0001\u0000\u0000\u0000\u0423\u0424\u0001\u0000\u0000"+
		"\u0000\u0424\u0425\u0005\n\u0000\u0000\u0425\u0426\u0005\u0003\u0000\u0000"+
		"\u0426\u0427\u0005\n\u0000\u0000\u0427\u0428\u0005\u0003\u0000\u0000\u0428"+
		"\u0429\u0005\u0006\u0000\u0000\u0429\u042b\u0005\u0004\u0000\u0000\u042a"+
		"\u03bc\u0001\u0000\u0000\u0000\u042b\u042c\u0001\u0000\u0000\u0000\u042c"+
		"\u042a\u0001\u0000\u0000\u0000\u042c\u042d\u0001\u0000\u0000\u0000\u042d"+
		"\u042e\u0001\u0000\u0000\u0000\u042e\u042f\u0005\u0005\u0000\u0000\u042f"+
		"\u0430\u0005\u0003\u0000\u0000\u0430\u0431\u0005\n\u0000\u0000\u0431\u0432"+
		"\u0005\n\u0000\u0000\u0432\u0433\u0005\n\u0000\u0000\u0433\u0434\u0005"+
		"\u0003\u0000\u0000\u0434\u0435\u0005\n\u0000\u0000\u0435\u0436\u0005\n"+
		"\u0000\u0000\u0436\u0437\u0005\n\u0000\u0000\u0437\u0438\u0005\u0003\u0000"+
		"\u0000\u0438\u0439\u0005\n\u0000\u0000\u0439\u043a\u0005\u0003\u0000\u0000"+
		"\u043a\u043b\u0005\n\u0000\u0000\u043b\u043c\u0005\u0004\u0000\u0000\u043c"+
		"\u0011\u0001\u0000\u0000\u0000\u043d\u043e\u0005\u0005\u0000\u0000\u043e"+
		"\u043f\u0005\u0003\u0000\u0000\u043f\u0440\u0005\n\u0000\u0000\u0440\u0441"+
		"\u0005\u0003\u0000\u0000\u0441\u0442\u0005\n\u0000\u0000\u0442\u0443\u0005"+
		"\n\u0000\u0000\u0443\u0444\u0005\n\u0000\u0000\u0444\u0445\u0005\u0003"+
		"\u0000\u0000\u0445\u0446\u0005\n\u0000\u0000\u0446\u0447\u0005\u0003\u0000"+
		"\u0000\u0447\u0448\u0005\n\u0000\u0000\u0448\u04c7\u0005\u0004\u0000\u0000"+
		"\u0449\u044a\u0005\n\u0000\u0000\u044a\u044b\u0005\u0003\u0000\u0000\u044b"+
		"\u044c\u0005\n\u0000\u0000\u044c\u044d\u0005\u0004\u0000\u0000\u044d\u044e"+
		"\u0005\n\u0000\u0000\u044e\u044f\u0005\u0003\u0000\u0000\u044f\u0450\u0005"+
		"\n\u0000\u0000\u0450\u0451\u0005\u0004\u0000\u0000\u0451\u0452\u0005\n"+
		"\u0000\u0000\u0452\u0453\u0005\u0003\u0000\u0000\u0453\u0454\u0005\n\u0000"+
		"\u0000\u0454\u0455\u0005\u0003\u0000\u0000\u0455\u0456\u0005\n\u0000\u0000"+
		"\u0456\u0457\u0005\u0003\u0000\u0000\u0457\u0458\u0005\n\u0000\u0000\u0458"+
		"\u0459\u0005\u0003\u0000\u0000\u0459\u045a\u0005\n\u0000\u0000\u045a\u045b"+
		"\u0005\u0003\u0000\u0000\u045b\u045c\u0005\n\u0000\u0000\u045c\u045d\u0005"+
		"\u0003\u0000\u0000\u045d\u045e\u0005\n\u0000\u0000\u045e\u045f\u0005\u0003"+
		"\u0000\u0000\u045f\u0460\u0005\n\u0000\u0000\u0460\u0461\u0005\u0003\u0000"+
		"\u0000\u0461\u0462\u0005\n\u0000\u0000\u0462\u0463\u0005\u0003\u0000\u0000"+
		"\u0463\u0464\u0005\n\u0000\u0000\u0464\u0465\u0005\u0003\u0000\u0000\u0465"+
		"\u0466\u0005\n\u0000\u0000\u0466\u0467\u0005\u0003\u0000\u0000\u0467\u0468"+
		"\u0005\n\u0000\u0000\u0468\u0469\u0005\u0003\u0000\u0000\u0469\u046a\u0005"+
		"\u0004\u0000\u0000\u046a\u046b\u0005\n\u0000\u0000\u046b\u046c\u0005\u0003"+
		"\u0000\u0000\u046c\u046d\u0005\n\u0000\u0000\u046d\u046e\u0005\u0003\u0000"+
		"\u0000\u046e\u046f\u0005\n\u0000\u0000\u046f\u0470\u0005\u0003\u0000\u0000"+
		"\u0470\u0471\u0005\n\u0000\u0000\u0471\u0472\u0005\u0003\u0000\u0000\u0472"+
		"\u0473\u0005\n\u0000\u0000\u0473\u0474\u0005\u0003\u0000\u0000\u0474\u0475"+
		"\u0005\n\u0000\u0000\u0475\u0476\u0005\u0003\u0000\u0000\u0476\u04b9\u0005"+
		"\u0004\u0000\u0000\u0477\u0478\u0005\u0003\u0000\u0000\u0478\u0479\u0005"+
		"\u0003\u0000\u0000\u0479\u047a\u0005\u0003\u0000\u0000\u047a\u047b\u0005"+
		"\u0003\u0000\u0000\u047b\u047c\u0005\u0003\u0000\u0000\u047c\u047d\u0005"+
		"\u0003\u0000\u0000\u047d\u047e\u0005\u0003\u0000\u0000\u047e\u047f\u0005"+
		"\u0003\u0000\u0000\u047f\u0480\u0005\u0003\u0000\u0000\u0480\u0481\u0005"+
		"\u0003\u0000\u0000\u0481\u0482\u0005\u0003\u0000\u0000\u0482\u0483\u0005"+
		"\u0003\u0000\u0000\u0483\u0484\u0005\u0003\u0000\u0000\u0484\u0485\u0005"+
		"\u0003\u0000\u0000\u0485\u0486\u0005\u0003\u0000\u0000\u0486\u0487\u0005"+
		"\u0003\u0000\u0000\u0487\u0488\u0005\u0003\u0000\u0000\u0488\u04ba\u0005"+
		"\u0004\u0000\u0000\u0489\u048a\u0005\u0006\u0000\u0000\u048a\u048c\u0005"+
		"\u0003\u0000\u0000\u048b\u048d\u0005\u0006\u0000\u0000\u048c\u048b\u0001"+
		"\u0000\u0000\u0000\u048c\u048d\u0001\u0000\u0000\u0000\u048d\u048e\u0001"+
		"\u0000\u0000\u0000\u048e\u0490\u0005\u0003\u0000\u0000\u048f\u0491\u0005"+
		"\u0006\u0000\u0000\u0490\u048f\u0001\u0000\u0000\u0000\u0490\u0491\u0001"+
		"\u0000\u0000\u0000\u0491\u0492\u0001\u0000\u0000\u0000\u0492\u0493\u0005"+
		"\u0003\u0000\u0000\u0493\u0494\u0005\b\u0000\u0000\u0494\u0496\u0005\u0003"+
		"\u0000\u0000\u0495\u0497\u0003\u0014\n\u0000\u0496\u0495\u0001\u0000\u0000"+
		"\u0000\u0497\u0498\u0001\u0000\u0000\u0000\u0498\u0496\u0001\u0000\u0000"+
		"\u0000\u0498\u0499\u0001\u0000\u0000\u0000\u0499\u049a\u0001\u0000\u0000"+
		"\u0000\u049a\u049b\u0005\u0003\u0000\u0000\u049b\u049c\u0005\n\u0000\u0000"+
		"\u049c\u049d\u0005\u0003\u0000\u0000\u049d\u049e\u0005\n\u0000\u0000\u049e"+
		"\u049f\u0005\u0003\u0000\u0000\u049f\u04a0\u0005\n\u0000\u0000\u04a0\u04a1"+
		"\u0005\u0003\u0000\u0000\u04a1\u04a2\u0005\n\u0000\u0000\u04a2\u04a3\u0005"+
		"\u0003\u0000\u0000\u04a3\u04a4\u0005\b\u0000\u0000\u04a4\u04a6\u0005\u0003"+
		"\u0000\u0000\u04a5\u04a7\u0005\b\u0000\u0000\u04a6\u04a5\u0001\u0000\u0000"+
		"\u0000\u04a6\u04a7\u0001\u0000\u0000\u0000\u04a7\u04a8\u0001\u0000\u0000"+
		"\u0000\u04a8\u04a9\u0005\u0003\u0000\u0000\u04a9\u04aa\u0005\b\u0000\u0000"+
		"\u04aa\u04ab\u0005\u0003\u0000\u0000\u04ab\u04ac\u0005\b\u0000\u0000\u04ac"+
		"\u04ae\u0005\u0003\u0000\u0000\u04ad\u04af\u0005\b\u0000\u0000\u04ae\u04ad"+
		"\u0001\u0000\u0000\u0000\u04ae\u04af\u0001\u0000\u0000\u0000\u04af\u04b0"+
		"\u0001\u0000\u0000\u0000\u04b0\u04b1\u0005\u0003\u0000\u0000\u04b1\u04b2"+
		"\u0005\u0003\u0000\u0000\u04b2\u04b3\u0005\b\u0000\u0000\u04b3\u04b4\u0005"+
		"\u0003\u0000\u0000\u04b4\u04b5\u0005\b\u0000\u0000\u04b5\u04b6\u0005\u0003"+
		"\u0000\u0000\u04b6\u04b7\u0005\u0004\u0000\u0000\u04b7\u04b8\u0006\t\uffff"+
		"\uffff\u0000\u04b8\u04ba\u0001\u0000\u0000\u0000\u04b9\u0477\u0001\u0000"+
		"\u0000\u0000\u04b9\u0489\u0001\u0000\u0000\u0000\u04ba\u04bb\u0001\u0000"+
		"\u0000\u0000\u04bb\u04b9\u0001\u0000\u0000\u0000\u04bb\u04bc\u0001\u0000"+
		"\u0000\u0000\u04bc\u04be\u0001\u0000\u0000\u0000\u04bd\u0449\u0001\u0000"+
		"\u0000\u0000\u04be\u04bf\u0001\u0000\u0000\u0000\u04bf\u04bd\u0001\u0000"+
		"\u0000\u0000\u04bf\u04c0\u0001\u0000\u0000\u0000\u04c0\u04c1\u0001\u0000"+
		"\u0000\u0000\u04c1\u04c2\u0005\n\u0000\u0000\u04c2\u04c3\u0005\u0003\u0000"+
		"\u0000\u04c3\u04c4\u0005\n\u0000\u0000\u04c4\u04c5\u0005\u0003\u0000\u0000"+
		"\u04c5\u04c6\u0005\u0006\u0000\u0000\u04c6\u04c8\u0005\u0004\u0000\u0000"+
		"\u04c7\u04bd\u0001\u0000\u0000\u0000\u04c8\u04c9\u0001\u0000\u0000\u0000"+
		"\u04c9\u04c7\u0001\u0000\u0000\u0000\u04c9\u04ca\u0001\u0000\u0000\u0000"+
		"\u04ca\u04cb\u0001\u0000\u0000\u0000\u04cb\u04cc\u0005\u0005\u0000\u0000"+
		"\u04cc\u04cd\u0005\u0003\u0000\u0000\u04cd\u04ce\u0005\n\u0000\u0000\u04ce"+
		"\u04cf\u0005\u0003\u0000\u0000\u04cf\u04d0\u0005\n\u0000\u0000\u04d0\u04d1"+
		"\u0005\n\u0000\u0000\u04d1\u04d2\u0005\n\u0000\u0000\u04d2\u04d3\u0005"+
		"\u0003\u0000\u0000\u04d3\u04d4\u0005\n\u0000\u0000\u04d4\u04d5\u0005\u0003"+
		"\u0000\u0000\u04d5\u04d6\u0005\n\u0000\u0000\u04d6\u04d7\u0005\u0004\u0000"+
		"\u0000\u04d7\u0013\u0001\u0000\u0000\u0000\u04d8\u04d9\u0007\u0000\u0000"+
		"\u0000\u04d9\u0015\u0001\u0000\u0000\u0000\u04da\u04dd\u0003\u0014\n\u0000"+
		"\u04db\u04dd\u0005\u0003\u0000\u0000\u04dc\u04da\u0001\u0000\u0000\u0000"+
		"\u04dc\u04db\u0001\u0000\u0000\u0000\u04dd\u04de\u0001\u0000\u0000\u0000"+
		"\u04de\u04dc\u0001\u0000\u0000\u0000\u04de\u04df\u0001\u0000\u0000\u0000"+
		"\u04df\u04e0\u0001\u0000\u0000\u0000\u04e0\u04e1\u0005\u0004\u0000\u0000"+
		"\u04e1\u0017\u0001\u0000\u0000\u0000\u04e2\u04e6\u0003\u0014\n\u0000\u04e3"+
		"\u04e6\u0005\u0003\u0000\u0000\u04e4\u04e6\u0005\u0004\u0000\u0000\u04e5"+
		"\u04e2\u0001\u0000\u0000\u0000\u04e5\u04e3\u0001\u0000\u0000\u0000\u04e5"+
		"\u04e4\u0001\u0000\u0000\u0000\u04e6\u04e7\u0001\u0000\u0000\u0000\u04e7"+
		"\u04e5\u0001\u0000\u0000\u0000\u04e7\u04e8\u0001\u0000\u0000\u0000\u04e8"+
		"\u0019\u0001\u0000\u0000\u0000y#l\u00b5\u00b8\u00bb\u00be\u00c1\u00c4"+
		"\u00c9\u00d8\u00da\u00de\u00e6\u00e8\u0126\u0129\u012c\u012f\u0132\u0135"+
		"\u013a\u0142\u0145\u0148\u014b\u014e\u0151\u0156\u0163\u016c\u0176\u0181"+
		"\u01a0\u01a7\u01aa\u01ad\u01b0\u01b3\u01b6\u01bb\u01c3\u01c6\u01c9\u01cc"+
		"\u01cf\u01d2\u01d7\u01fc\u0200\u0204\u0208\u020c\u0214\u0219\u021b\u021f"+
		"\u022a\u0248\u0272\u0274\u0278\u0283\u02a4\u02a7\u02aa\u02ad\u02b0\u02b3"+
		"\u02b8\u02d7\u0310\u0316\u032c\u0337\u0356\u035c\u035f\u0362\u0365\u0368"+
		"\u036b\u0370\u0376\u0379\u037c\u037f\u0382\u0385\u038a\u0392\u03a2\u03c3"+
		"\u03e4\u03e7\u03ea\u03ed\u03f0\u03f3\u03f8\u03fd\u0405\u040a\u0410\u0416"+
		"\u041a\u0420\u0422\u042c\u048c\u0490\u0498\u04a6\u04ae\u04b9\u04bb\u04bf"+
		"\u04c9\u04dc\u04de\u04e5\u04e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}