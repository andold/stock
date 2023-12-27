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
		RULE_stockDocument = 0, RULE_crawlPriceEtf = 1, RULE_crawlPriceCompay = 2, 
		RULE_crawlCompanyDetails = 3, RULE_crawlCompanyTopDividend = 4, RULE_crawlEtfDetailThread = 5, 
		RULE_extractAllEtfFromNaver = 6, RULE_crawlDividendHistoryEtfThread = 7, 
		RULE_crawlEtfDividendHistoryThread = 8, RULE_word = 9, RULE_line = 10, 
		RULE_eof = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"stockDocument", "crawlPriceEtf", "crawlPriceCompay", "crawlCompanyDetails", 
			"crawlCompanyTopDividend", "crawlEtfDetailThread", "extractAllEtfFromNaver", 
			"crawlDividendHistoryEtfThread", "crawlEtfDividendHistoryThread", "word", 
			"line", "eof"
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
		public CrawlEtfDividendHistoryThreadContext crawlEtfDividendHistoryThread() {
			return getRuleContext(CrawlEtfDividendHistoryThreadContext.class,0);
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
				crawlEtfDividendHistoryThread();
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
				extractAllEtfFromNaver();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				crawlEtfDetailThread();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(28);
				crawlCompanyTopDividend();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(29);
				crawlCompanyDetails();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(30);
				crawlPriceCompay();
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
		enterRule(_localctx, 2, RULE_crawlPriceEtf);
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
			match(WORD);
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
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				((CrawlPriceEtfContext)_localctx).code = match(NUMBER);
				setState(46);
				match(TAB);
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(47);
					((CrawlPriceEtfContext)_localctx).symbol = word();
					}
					}
					setState(50); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(52);
				match(NEWLINE);
				setState(113); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
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
						match(NEWLINE);
						setState(109); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(109);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
							case 1:
								{
								{
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
								match(TAB);
								setState(76);
								match(TAB);
								setState(77);
								match(TAB);
								setState(78);
								match(NEWLINE);
								}
								}
								break;
							case 2:
								{
								{
								setState(80);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(79);
									((CrawlPriceEtfContext)_localctx).base = match(DATE);
									}
								}

								setState(82);
								match(TAB);
								setState(84);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(83);
									((CrawlPriceEtfContext)_localctx).closing = match(NUMBER);
									}
								}

								setState(86);
								match(TAB);
								setState(88);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(87);
									match(NUMBER);
									}
								}

								setState(90);
								match(TAB);
								setState(92);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(91);
									((CrawlPriceEtfContext)_localctx).market = match(NUMBER);
									}
								}

								setState(94);
								match(TAB);
								setState(96);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(95);
									((CrawlPriceEtfContext)_localctx).high = match(NUMBER);
									}
								}

								setState(98);
								match(TAB);
								setState(99);
								((CrawlPriceEtfContext)_localctx).low = match(NUMBER);
								setState(100);
								match(TAB);
								setState(101);
								((CrawlPriceEtfContext)_localctx).volume = match(NUMBER);
								setState(102);
								match(TAB);
								setState(104);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(103);
									match(NUMBER);
									}
								}

								setState(106);
								match(TAB);
								setState(107);
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
							setState(111); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(115); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(117);
				match(WORD);
				setState(118);
				match(TAB);
				setState(119);
				match(WORD);
				setState(120);
				match(TAB);
				setState(121);
				match(DATE);
				setState(122);
				match(NEWLINE);
				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(128);
			match(KEYWORD);
			setState(129);
			match(TAB);
			setState(130);
			match(WORD);
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
			match(TAB);
			setState(137);
			match(WORD);
			setState(138);
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
		enterRule(_localctx, 4, RULE_crawlPriceCompay);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(KEYWORD);
			setState(141);
			match(TAB);
			setState(142);
			match(WORD);
			setState(143);
			match(WORD);
			setState(144);
			match(TAB);
			setState(145);
			match(WORD);
			setState(146);
			match(TAB);
			setState(147);
			match(WORD);
			setState(148);
			match(TAB);
			setState(149);
			match(WORD);
			setState(150);
			match(NEWLINE);
			setState(213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				((CrawlPriceCompayContext)_localctx).code = match(NUMBER);
				setState(152);
				match(TAB);
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(153);
					((CrawlPriceCompayContext)_localctx).symbol = word();
					}
					}
					setState(156); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
				setState(158);
				match(NEWLINE);
				setState(202); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(159);
						match(WORD);
						setState(160);
						match(TAB);
						setState(161);
						match(WORD);
						setState(162);
						match(TAB);
						setState(163);
						match(WORD);
						setState(164);
						match(TAB);
						setState(165);
						match(WORD);
						setState(166);
						match(TAB);
						setState(167);
						match(WORD);
						setState(168);
						match(TAB);
						setState(169);
						match(WORD);
						setState(170);
						match(TAB);
						setState(171);
						match(WORD);
						setState(172);
						match(TAB);
						setState(173);
						match(NEWLINE);
						setState(198); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							setState(198);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case TAB:
								{
								{
								setState(174);
								match(TAB);
								setState(175);
								match(TAB);
								setState(176);
								match(TAB);
								setState(177);
								match(TAB);
								setState(178);
								match(TAB);
								setState(179);
								match(TAB);
								setState(180);
								match(TAB);
								setState(181);
								match(NEWLINE);
								}
								}
								break;
							case DATE:
								{
								{
								setState(182);
								((CrawlPriceCompayContext)_localctx).base = match(DATE);
								setState(183);
								match(TAB);
								setState(184);
								((CrawlPriceCompayContext)_localctx).closing = match(NUMBER);
								setState(185);
								match(TAB);
								setState(186);
								match(NUMBER);
								setState(187);
								match(TAB);
								setState(188);
								((CrawlPriceCompayContext)_localctx).market = match(NUMBER);
								setState(189);
								match(TAB);
								setState(190);
								((CrawlPriceCompayContext)_localctx).high = match(NUMBER);
								setState(191);
								match(TAB);
								setState(192);
								((CrawlPriceCompayContext)_localctx).low = match(NUMBER);
								setState(193);
								match(TAB);
								setState(194);
								((CrawlPriceCompayContext)_localctx).volume = match(NUMBER);
								setState(195);
								match(TAB);
								setState(196);
								match(NEWLINE);

												ParserService.crawlPriceCompanyEtf(20231217
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
							setState(200); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==TAB || _la==DATE );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(204); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(206);
				match(WORD);
				setState(207);
				match(TAB);
				setState(208);
				match(WORD);
				setState(209);
				match(TAB);
				setState(210);
				match(DATE);
				setState(211);
				match(NEWLINE);
				}
				}
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(217);
			match(KEYWORD);
			setState(218);
			match(TAB);
			setState(219);
			match(WORD);
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
		enterRule(_localctx, 6, RULE_crawlCompanyDetails);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(KEYWORD);
			setState(230);
			match(TAB);
			setState(231);
			match(WORD);
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
			match(WORD);
			setState(239);
			match(NEWLINE);
			setState(295); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(240);
					match(KEYWORD);
					setState(241);
					match(TAB);
					setState(242);
					((CrawlCompanyDetailsContext)_localctx).code = match(NUMBER);
					setState(243);
					match(TAB);
					setState(244);
					((CrawlCompanyDetailsContext)_localctx).symbol = word();
					setState(246);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(245);
						((CrawlCompanyDetailsContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(249);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(248);
						((CrawlCompanyDetailsContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(252);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(251);
						((CrawlCompanyDetailsContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(254);
						((CrawlCompanyDetailsContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(258);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(257);
						((CrawlCompanyDetailsContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(261);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(260);
						((CrawlCompanyDetailsContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(263);
						((CrawlCompanyDetailsContext)_localctx).symbol7 = word();
						}
						}
						setState(268);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(269);
					match(NEWLINE);
					setState(270);
					match(KEYWORD);
					setState(271);
					match(TAB);
					setState(272);
					((CrawlCompanyDetailsContext)_localctx).category = match(STRING);
					setState(273);
					match(NEWLINE);
					setState(274);
					match(KEYWORD);
					setState(275);
					match(TAB);
					setState(276);
					((CrawlCompanyDetailsContext)_localctx).fics = match(STRING);
					setState(277);
					match(NEWLINE);
					setState(278);
					match(KEYWORD);
					setState(279);
					match(TAB);
					setState(280);
					((CrawlCompanyDetailsContext)_localctx).ea = match(NUMBER);
					setState(281);
					match(WORD);
					setState(282);
					match(NEWLINE);
					setState(283);
					match(KEYWORD);
					setState(284);
					match(TAB);
					setState(285);
					((CrawlCompanyDetailsContext)_localctx).ipo = match(DATE);
					setState(286);
					match(NEWLINE);
					setState(287);
					match(WORD);
					setState(288);
					match(TAB);
					setState(289);
					match(WORD);
					setState(290);
					match(TAB);
					setState(291);
					match(DATE);
					setState(292);
					match(NEWLINE);

							ParserService.crawlCompanyDetails(20231217
								, (((CrawlCompanyDetailsContext)_localctx).code!=null?((CrawlCompanyDetailsContext)_localctx).code.getText():null)
								, (((CrawlCompanyDetailsContext)_localctx).symbol!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).symbol.start,((CrawlCompanyDetailsContext)_localctx).symbol.stop):null), (((CrawlCompanyDetailsContext)_localctx).symbol1!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).symbol1.start,((CrawlCompanyDetailsContext)_localctx).symbol1.stop):null), (((CrawlCompanyDetailsContext)_localctx).symbol2!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).symbol2.start,((CrawlCompanyDetailsContext)_localctx).symbol2.stop):null), (((CrawlCompanyDetailsContext)_localctx).symbol3!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).symbol3.start,((CrawlCompanyDetailsContext)_localctx).symbol3.stop):null), (((CrawlCompanyDetailsContext)_localctx).symbol4!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).symbol4.start,((CrawlCompanyDetailsContext)_localctx).symbol4.stop):null), (((CrawlCompanyDetailsContext)_localctx).symbol5!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).symbol5.start,((CrawlCompanyDetailsContext)_localctx).symbol5.stop):null), (((CrawlCompanyDetailsContext)_localctx).symbol6!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).symbol6.start,((CrawlCompanyDetailsContext)_localctx).symbol6.stop):null), (((CrawlCompanyDetailsContext)_localctx).symbol7!=null?_input.getText(((CrawlCompanyDetailsContext)_localctx).symbol7.start,((CrawlCompanyDetailsContext)_localctx).symbol7.stop):null)
								, (((CrawlCompanyDetailsContext)_localctx).category!=null?((CrawlCompanyDetailsContext)_localctx).category.getText():null)
								, (((CrawlCompanyDetailsContext)_localctx).fics!=null?((CrawlCompanyDetailsContext)_localctx).fics.getText():null)
								, (((CrawlCompanyDetailsContext)_localctx).ea!=null?((CrawlCompanyDetailsContext)_localctx).ea.getText():null)
								, (((CrawlCompanyDetailsContext)_localctx).ipo!=null?((CrawlCompanyDetailsContext)_localctx).ipo.getText():null)
							);
						
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(297); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(299);
			match(KEYWORD);
			setState(300);
			match(TAB);
			setState(301);
			match(WORD);
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
			match(TAB);
			setState(308);
			match(WORD);
			setState(309);
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
		enterRule(_localctx, 8, RULE_crawlCompanyTopDividend);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(KEYWORD);
			setState(312);
			match(TAB);
			setState(313);
			match(WORD);
			setState(314);
			match(TAB);
			setState(315);
			match(WORD);
			setState(316);
			match(WORD);
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
			match(NEWLINE);
			setState(391); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(323);
				match(WORD);
				setState(324);
				match(TAB);
				setState(325);
				match(NEWLINE);
				setState(326);
				match(WORD);
				setState(327);
				match(TAB);
				setState(328);
				match(WORD);
				setState(329);
				match(TAB);
				setState(330);
				match(WORD);
				setState(331);
				match(TAB);
				setState(332);
				match(WORD);
				setState(333);
				match(TAB);
				setState(334);
				match(WORD);
				setState(335);
				match(TAB);
				setState(336);
				match(WORD);
				setState(337);
				match(TAB);
				setState(338);
				match(WORD);
				setState(339);
				match(TAB);
				setState(340);
				match(WORD);
				setState(341);
				match(TAB);
				setState(342);
				match(WORD);
				setState(343);
				match(TAB);
				setState(344);
				match(WORD);
				setState(345);
				match(TAB);
				setState(346);
				match(WORD);
				setState(347);
				match(TAB);
				setState(348);
				match(NEWLINE);
				setState(380); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(349);
						((CrawlCompanyTopDividendContext)_localctx).type = match(WORD);
						setState(350);
						match(TAB);
						setState(351);
						match(NUMBER);
						setState(352);
						match(TAB);
						setState(354);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(353);
							((CrawlCompanyTopDividendContext)_localctx).code = match(NUMBER);
							}
						}

						setState(356);
						match(TAB);
						setState(358); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(357);
							word();
							}
							}
							setState(360); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(362);
						match(TAB);
						setState(363);
						match(WORD);
						setState(364);
						match(TAB);
						setState(365);
						match(WORD);
						setState(366);
						match(TAB);
						setState(367);
						match(NUMBER);
						setState(368);
						match(TAB);
						setState(369);
						match(NUMBER);
						setState(370);
						match(TAB);
						setState(371);
						match(NUMBER);
						setState(372);
						match(TAB);
						setState(373);
						match(NUMBER);
						setState(374);
						match(TAB);
						setState(375);
						match(NUMBER);
						setState(376);
						match(TAB);
						setState(377);
						match(NEWLINE);

									ParserService.crawlCompanyTopDividend(20231217
										, (((CrawlCompanyTopDividendContext)_localctx).code!=null?((CrawlCompanyTopDividendContext)_localctx).code.getText():null)
										, (((CrawlCompanyTopDividendContext)_localctx).type!=null?((CrawlCompanyTopDividendContext)_localctx).type.getText():null)
									);
								
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(382); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
				setState(393); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(395);
			match(KEYWORD);
			setState(396);
			match(TAB);
			setState(397);
			match(WORD);
			setState(398);
			match(TAB);
			setState(399);
			match(WORD);
			setState(400);
			match(WORD);
			setState(401);
			match(WORD);
			setState(402);
			match(TAB);
			setState(403);
			match(WORD);
			setState(404);
			match(TAB);
			setState(405);
			match(WORD);
			setState(406);
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
		enterRule(_localctx, 10, RULE_crawlEtfDetailThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(KEYWORD);
			setState(409);
			match(TAB);
			setState(410);
			match(WORD);
			setState(411);
			match(WORD);
			setState(412);
			match(TAB);
			setState(413);
			match(WORD);
			setState(414);
			match(TAB);
			setState(415);
			match(WORD);
			setState(416);
			match(NEWLINE);
			setState(498); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(417);
					match(KEYWORD);
					setState(418);
					match(TAB);
					setState(419);
					((CrawlEtfDetailThreadContext)_localctx).code = match(NUMBER);
					setState(420);
					match(TAB);
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(421);
						word();
						}
						}
						setState(426);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(427);
					match(NEWLINE);
					setState(428);
					((CrawlEtfDetailThreadContext)_localctx).symbol = word();
					setState(430);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(429);
						((CrawlEtfDetailThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(433);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(432);
						((CrawlEtfDetailThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(436);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(435);
						((CrawlEtfDetailThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(439);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(438);
						((CrawlEtfDetailThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(442);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(441);
						((CrawlEtfDetailThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(445);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(444);
						((CrawlEtfDetailThreadContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(450);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(447);
						((CrawlEtfDetailThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(452);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(453);
					match(NEWLINE);
					setState(454);
					((CrawlEtfDetailThreadContext)_localctx).category = word();
					setState(456);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(455);
						((CrawlEtfDetailThreadContext)_localctx).category1 = word();
						}
						break;
					}
					setState(459);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						setState(458);
						((CrawlEtfDetailThreadContext)_localctx).category2 = word();
						}
						break;
					}
					setState(462);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						setState(461);
						((CrawlEtfDetailThreadContext)_localctx).category3 = word();
						}
						break;
					}
					setState(465);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(464);
						((CrawlEtfDetailThreadContext)_localctx).category4 = word();
						}
						break;
					}
					setState(468);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(467);
						((CrawlEtfDetailThreadContext)_localctx).category5 = word();
						}
						break;
					}
					setState(471);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(470);
						((CrawlEtfDetailThreadContext)_localctx).category6 = word();
						}
						break;
					}
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(473);
						((CrawlEtfDetailThreadContext)_localctx).category7 = word();
						}
						}
						setState(478);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(479);
					match(NEWLINE);
					setState(480);
					((CrawlEtfDetailThreadContext)_localctx).ipo = match(DATE);
					setState(484);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WORD) {
						{
						{
						setState(481);
						match(WORD);
						}
						}
						setState(486);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(487);
					match(NEWLINE);
					setState(488);
					((CrawlEtfDetailThreadContext)_localctx).fee = word();
					setState(489);
					match(NEWLINE);
					setState(490);
					match(WORD);
					setState(491);
					match(TAB);
					setState(492);
					match(WORD);
					setState(493);
					match(TAB);
					setState(494);
					match(DATE);
					setState(495);
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
				setState(500); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 12, RULE_extractAllEtfFromNaver);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(512);
				match(KEYWORD);
				setState(513);
				match(TAB);
				setState(514);
				((ExtractAllEtfFromNaverContext)_localctx).code = match(WORD);
				setState(515);
				match(TAB);
				setState(516);
				((ExtractAllEtfFromNaverContext)_localctx).symbol = word();
				setState(518);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(517);
					((ExtractAllEtfFromNaverContext)_localctx).symbol1 = word();
					}
					break;
				}
				setState(521);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(520);
					((ExtractAllEtfFromNaverContext)_localctx).symbol2 = word();
					}
					break;
				}
				setState(524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(523);
					((ExtractAllEtfFromNaverContext)_localctx).symbol3 = word();
					}
					break;
				}
				setState(527);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(526);
					((ExtractAllEtfFromNaverContext)_localctx).symbol4 = word();
					}
					break;
				}
				setState(530);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(529);
					((ExtractAllEtfFromNaverContext)_localctx).symbol5 = word();
					}
					break;
				}
				setState(533);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(532);
					((ExtractAllEtfFromNaverContext)_localctx).symbol6 = word();
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
					((ExtractAllEtfFromNaverContext)_localctx).symbol7 = word();
					}
					}
					setState(540);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(541);
				match(NEWLINE);

						ParserService.extractAllEtfFromNaver(20231214
							, (((ExtractAllEtfFromNaverContext)_localctx).code!=null?((ExtractAllEtfFromNaverContext)_localctx).code.getText():null)
							, (((ExtractAllEtfFromNaverContext)_localctx).symbol!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol.start,((ExtractAllEtfFromNaverContext)_localctx).symbol.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol1!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol1.start,((ExtractAllEtfFromNaverContext)_localctx).symbol1.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol2!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol2.start,((ExtractAllEtfFromNaverContext)_localctx).symbol2.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol3!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol3.start,((ExtractAllEtfFromNaverContext)_localctx).symbol3.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol4!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol4.start,((ExtractAllEtfFromNaverContext)_localctx).symbol4.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol5!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol5.start,((ExtractAllEtfFromNaverContext)_localctx).symbol5.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol6!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol6.start,((ExtractAllEtfFromNaverContext)_localctx).symbol6.stop):null), (((ExtractAllEtfFromNaverContext)_localctx).symbol7!=null?_input.getText(((ExtractAllEtfFromNaverContext)_localctx).symbol7.start,((ExtractAllEtfFromNaverContext)_localctx).symbol7.stop):null)
						);
					
				}
				}
				setState(546); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KEYWORD );
			setState(548);
			match(WORD);
			setState(549);
			match(TAB);
			setState(550);
			match(WORD);
			setState(551);
			match(TAB);
			setState(552);
			match(DATE);
			setState(553);
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
			setState(555);
			match(KEYWORD);
			setState(556);
			match(TAB);
			setState(557);
			match(WORD);
			setState(558);
			match(WORD);
			setState(559);
			match(WORD);
			setState(560);
			match(TAB);
			setState(561);
			match(WORD);
			setState(562);
			match(WORD);
			setState(563);
			match(WORD);
			setState(564);
			match(TAB);
			setState(565);
			match(WORD);
			setState(566);
			match(TAB);
			setState(567);
			match(WORD);
			setState(568);
			match(NEWLINE);
			setState(678); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					{
					setState(569);
					match(KEYWORD);
					setState(570);
					match(TAB);
					setState(571);
					((CrawlDividendHistoryEtfThreadContext)_localctx).code = match(NUMBER);
					setState(572);
					match(NEWLINE);
					setState(573);
					match(WORD);
					setState(574);
					match(TAB);
					setState(575);
					match(TAB);
					setState(576);
					match(WORD);
					setState(577);
					match(TAB);
					setState(578);
					match(WORD);
					setState(579);
					match(TAB);
					setState(580);
					match(WORD);
					setState(581);
					match(TAB);
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
					match(TAB);
					setState(590);
					match(WORD);
					setState(591);
					match(TAB);
					setState(592);
					match(NEWLINE);
					setState(668); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(668);
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
								setState(593);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol = word();
								setState(595);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
								case 1:
									{
									setState(594);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol1 = word();
									}
									break;
								}
								setState(598);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
								case 1:
									{
									setState(597);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol2 = word();
									}
									break;
								}
								setState(601);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
								case 1:
									{
									setState(600);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol3 = word();
									}
									break;
								}
								setState(604);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
								case 1:
									{
									setState(603);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol4 = word();
									}
									break;
								}
								setState(607);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
								case 1:
									{
									setState(606);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol5 = word();
									}
									break;
								}
								setState(610);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
								case 1:
									{
									setState(609);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol6 = word();
									}
									break;
								}
								setState(615);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
									{
									{
									setState(612);
									((CrawlDividendHistoryEtfThreadContext)_localctx).symbol7 = word();
									}
									}
									setState(617);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(618);
								match(TAB);
								setState(619);
								match(TAB);
								setState(620);
								match(WORD);
								setState(621);
								match(TAB);
								setState(625);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
									{
									{
									setState(622);
									word();
									}
									}
									setState(627);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(628);
								match(TAB);
								setState(630);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(629);
									((CrawlDividendHistoryEtfThreadContext)_localctx).base = match(DATE);
									}
								}

								setState(632);
								match(TAB);
								setState(634);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==DATE) {
									{
									setState(633);
									((CrawlDividendHistoryEtfThreadContext)_localctx).pay = match(DATE);
									}
								}

								setState(636);
								match(TAB);
								setState(638);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==WORD) {
									{
									setState(637);
									match(WORD);
									}
								}

								setState(640);
								match(TAB);
								setState(642);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(641);
									((CrawlDividendHistoryEtfThreadContext)_localctx).dividend = match(NUMBER);
									}
								}

								setState(644);
								match(TAB);
								setState(646);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(645);
									((CrawlDividendHistoryEtfThreadContext)_localctx).price = match(NUMBER);
									}
								}

								setState(648);
								match(TAB);
								setState(650);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==NUMBER) {
									{
									setState(649);
									((CrawlDividendHistoryEtfThreadContext)_localctx).ratio = match(NUMBER);
									}
								}

								setState(652);
								match(TAB);
								setState(653);
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
								setState(657);
								match(TAB);
								setState(658);
								match(TAB);
								setState(659);
								match(TAB);
								setState(660);
								match(TAB);
								setState(661);
								match(TAB);
								setState(662);
								match(TAB);
								setState(663);
								match(TAB);
								setState(664);
								match(TAB);
								setState(665);
								match(TAB);
								setState(666);
								match(TAB);
								setState(667);
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
						setState(670); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(672);
					match(WORD);
					setState(673);
					match(TAB);
					setState(674);
					match(WORD);
					setState(675);
					match(TAB);
					setState(676);
					match(DATE);
					setState(677);
					match(NEWLINE);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(680); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(682);
			match(KEYWORD);
			setState(683);
			match(TAB);
			setState(684);
			match(WORD);
			setState(685);
			match(WORD);
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
			match(TAB);
			setState(692);
			match(WORD);
			setState(693);
			match(TAB);
			setState(694);
			match(WORD);
			setState(695);
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

	public static class CrawlEtfDividendHistoryThreadContext extends ParserRuleContext {
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
		public CrawlEtfDividendHistoryThreadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crawlEtfDividendHistoryThread; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).enterCrawlEtfDividendHistoryThread(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StockListener ) ((StockListener)listener).exitCrawlEtfDividendHistoryThread(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StockVisitor ) return ((StockVisitor<? extends T>)visitor).visitCrawlEtfDividendHistoryThread(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlEtfDividendHistoryThreadContext crawlEtfDividendHistoryThread() throws RecognitionException {
		CrawlEtfDividendHistoryThreadContext _localctx = new CrawlEtfDividendHistoryThreadContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_crawlEtfDividendHistoryThread);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(KEYWORD);
			setState(698);
			match(TAB);
			setState(699);
			match(WORD);
			setState(700);
			match(WORD);
			setState(701);
			match(WORD);
			setState(702);
			match(TAB);
			setState(703);
			match(WORD);
			setState(704);
			match(TAB);
			setState(705);
			match(WORD);
			setState(706);
			match(NEWLINE);
			setState(845); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(707);
					match(KEYWORD);
					setState(708);
					match(TAB);
					setState(709);
					((CrawlEtfDividendHistoryThreadContext)_localctx).code = match(NUMBER);
					setState(710);
					match(TAB);
					setState(712); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(711);
						word();
						}
						}
						setState(714); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
					setState(716);
					match(NEWLINE);
					setState(834); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(717);
							match(WORD);
							setState(718);
							match(TAB);
							setState(719);
							match(WORD);
							setState(720);
							match(NEWLINE);
							setState(721);
							match(WORD);
							setState(722);
							match(TAB);
							setState(723);
							match(WORD);
							setState(724);
							match(NEWLINE);
							setState(725);
							match(WORD);
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
							match(WORD);
							setState(732);
							match(TAB);
							setState(733);
							match(WORD);
							setState(734);
							match(TAB);
							setState(735);
							match(WORD);
							setState(736);
							match(TAB);
							setState(737);
							match(WORD);
							setState(738);
							match(TAB);
							setState(739);
							match(WORD);
							setState(740);
							match(TAB);
							setState(741);
							match(WORD);
							setState(742);
							match(TAB);
							setState(743);
							match(WORD);
							setState(744);
							match(TAB);
							setState(745);
							match(WORD);
							setState(746);
							match(TAB);
							setState(747);
							match(WORD);
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
							match(WORD);
							setState(759);
							match(TAB);
							setState(760);
							match(WORD);
							setState(761);
							match(TAB);
							setState(762);
							match(NEWLINE);
							setState(830); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								setState(830);
								_errHandler.sync(this);
								switch (_input.LA(1)) {
								case TAB:
									{
									{
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
									match(TAB);
									setState(780);
									match(NEWLINE);
									}
									}
									break;
								case DATE:
									{
									{
									setState(781);
									((CrawlEtfDividendHistoryThreadContext)_localctx).base = match(DATE);
									setState(782);
									match(TAB);
									setState(784);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==DATE) {
										{
										setState(783);
										((CrawlEtfDividendHistoryThreadContext)_localctx).pay = match(DATE);
										}
									}

									setState(786);
									match(TAB);
									setState(788);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==DATE) {
										{
										setState(787);
										match(DATE);
										}
									}

									setState(790);
									match(TAB);
									setState(791);
									match(NUMBER);
									setState(792);
									match(TAB);
									setState(794); 
									_errHandler.sync(this);
									_la = _input.LA(1);
									do {
										{
										{
										setState(793);
										((CrawlEtfDividendHistoryThreadContext)_localctx).symbol = word();
										}
										}
										setState(796); 
										_errHandler.sync(this);
										_la = _input.LA(1);
									} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
									setState(798);
									match(TAB);
									setState(799);
									match(WORD);
									setState(800);
									match(TAB);
									setState(801);
									match(WORD);
									setState(802);
									match(TAB);
									setState(803);
									match(WORD);
									setState(804);
									match(TAB);
									setState(805);
									match(WORD);
									setState(806);
									match(TAB);
									setState(807);
									((CrawlEtfDividendHistoryThreadContext)_localctx).dividend = match(NUMBER);
									setState(808);
									match(TAB);
									setState(810);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==NUMBER) {
										{
										setState(809);
										match(NUMBER);
										}
									}

									setState(812);
									match(TAB);
									setState(813);
									match(NUMBER);
									setState(814);
									match(TAB);
									setState(815);
									match(NUMBER);
									setState(816);
									match(TAB);
									setState(818);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==NUMBER) {
										{
										setState(817);
										match(NUMBER);
										}
									}

									setState(820);
									match(TAB);
									setState(821);
									match(TAB);
									setState(822);
									match(NUMBER);
									setState(823);
									match(TAB);
									setState(824);
									match(NUMBER);
									setState(825);
									match(TAB);
									setState(826);
									match(NEWLINE);
									}

													ParserService.seibroDividendItem(20231127
														, (((CrawlEtfDividendHistoryThreadContext)_localctx).base!=null?((CrawlEtfDividendHistoryThreadContext)_localctx).base.getText():null) , (((CrawlEtfDividendHistoryThreadContext)_localctx).pay!=null?((CrawlEtfDividendHistoryThreadContext)_localctx).pay.getText():null)
														, (((CrawlEtfDividendHistoryThreadContext)_localctx).code!=null?((CrawlEtfDividendHistoryThreadContext)_localctx).code.getText():null) , (((CrawlEtfDividendHistoryThreadContext)_localctx).symbol!=null?_input.getText(((CrawlEtfDividendHistoryThreadContext)_localctx).symbol.start,((CrawlEtfDividendHistoryThreadContext)_localctx).symbol.stop):null)
														, (((CrawlEtfDividendHistoryThreadContext)_localctx).dividend!=null?((CrawlEtfDividendHistoryThreadContext)_localctx).dividend.getText():null)
													);
												
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								}
								setState(832); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==TAB || _la==DATE );
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(836); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(838);
					match(WORD);
					setState(839);
					match(TAB);
					setState(840);
					match(WORD);
					setState(841);
					match(TAB);
					setState(842);
					match(DATE);
					setState(843);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(847); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(849);
			match(KEYWORD);
			setState(850);
			match(TAB);
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
			match(TAB);
			setState(857);
			match(WORD);
			setState(858);
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
			setState(860);
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
			setState(864); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(864);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(862);
					word();
					}
					break;
				case TAB:
					{
					setState(863);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(866); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(868);
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
			setState(873); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(873);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(870);
					word();
					}
					break;
				case TAB:
					{
					setState(871);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(872);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(875); 
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
		"\u0004\u0001\n\u036e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000!\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u00011\b\u0001\u000b\u0001\f\u00012\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001Q\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"U\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001Y\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001]\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001a\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001i\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"n\b\u0001\u000b\u0001\f\u0001o\u0004\u0001r\b\u0001\u000b\u0001\f\u0001"+
		"s\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001}\b\u0001\u000b\u0001\f\u0001~\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0004\u0002\u009b\b\u0002\u000b\u0002\f\u0002\u009c\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u00c7\b\u0002\u000b\u0002"+
		"\f\u0002\u00c8\u0004\u0002\u00cb\b\u0002\u000b\u0002\f\u0002\u00cc\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0004\u0002\u00d6\b\u0002\u000b\u0002\f\u0002\u00d7\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00f7\b\u0003"+
		"\u0001\u0003\u0003\u0003\u00fa\b\u0003\u0001\u0003\u0003\u0003\u00fd\b"+
		"\u0003\u0001\u0003\u0003\u0003\u0100\b\u0003\u0001\u0003\u0003\u0003\u0103"+
		"\b\u0003\u0001\u0003\u0003\u0003\u0106\b\u0003\u0001\u0003\u0005\u0003"+
		"\u0109\b\u0003\n\u0003\f\u0003\u010c\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004"+
		"\u0003\u0128\b\u0003\u000b\u0003\f\u0003\u0129\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0163\b\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u0167\b\u0004\u000b"+
		"\u0004\f\u0004\u0168\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004\u017d\b\u0004\u000b\u0004\f\u0004\u017e"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0004\u0004\u0188\b\u0004\u000b\u0004\f\u0004\u0189\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u01a7\b\u0005\n\u0005\f\u0005"+
		"\u01aa\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u01af\b"+
		"\u0005\u0001\u0005\u0003\u0005\u01b2\b\u0005\u0001\u0005\u0003\u0005\u01b5"+
		"\b\u0005\u0001\u0005\u0003\u0005\u01b8\b\u0005\u0001\u0005\u0003\u0005"+
		"\u01bb\b\u0005\u0001\u0005\u0003\u0005\u01be\b\u0005\u0001\u0005\u0005"+
		"\u0005\u01c1\b\u0005\n\u0005\f\u0005\u01c4\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u01c9\b\u0005\u0001\u0005\u0003\u0005\u01cc\b"+
		"\u0005\u0001\u0005\u0003\u0005\u01cf\b\u0005\u0001\u0005\u0003\u0005\u01d2"+
		"\b\u0005\u0001\u0005\u0003\u0005\u01d5\b\u0005\u0001\u0005\u0003\u0005"+
		"\u01d8\b\u0005\u0001\u0005\u0005\u0005\u01db\b\u0005\n\u0005\f\u0005\u01de"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u01e3\b\u0005"+
		"\n\u0005\f\u0005\u01e6\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0004\u0005\u01f3\b\u0005\u000b\u0005\f\u0005\u01f4"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0207\b\u0006"+
		"\u0001\u0006\u0003\u0006\u020a\b\u0006\u0001\u0006\u0003\u0006\u020d\b"+
		"\u0006\u0001\u0006\u0003\u0006\u0210\b\u0006\u0001\u0006\u0003\u0006\u0213"+
		"\b\u0006\u0001\u0006\u0003\u0006\u0216\b\u0006\u0001\u0006\u0005\u0006"+
		"\u0219\b\u0006\n\u0006\f\u0006\u021c\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0004\u0006\u0221\b\u0006\u000b\u0006\f\u0006\u0222\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0254\b\u0007"+
		"\u0001\u0007\u0003\u0007\u0257\b\u0007\u0001\u0007\u0003\u0007\u025a\b"+
		"\u0007\u0001\u0007\u0003\u0007\u025d\b\u0007\u0001\u0007\u0003\u0007\u0260"+
		"\b\u0007\u0001\u0007\u0003\u0007\u0263\b\u0007\u0001\u0007\u0005\u0007"+
		"\u0266\b\u0007\n\u0007\f\u0007\u0269\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0270\b\u0007\n\u0007\f\u0007"+
		"\u0273\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0277\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u027b\b\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u027f\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0283\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u0287\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u028b\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0004\u0007\u029d\b\u0007\u000b\u0007\f\u0007\u029e\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u02a7"+
		"\b\u0007\u000b\u0007\f\u0007\u02a8\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u02c9\b\b\u000b"+
		"\b\f\b\u02ca\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0311\b\b\u0001"+
		"\b\u0001\b\u0003\b\u0315\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u031b"+
		"\b\b\u000b\b\f\b\u031c\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u032b\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0333\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004"+
		"\b\u033f\b\b\u000b\b\f\b\u0340\u0004\b\u0343\b\b\u000b\b\f\b\u0344\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u034e\b\b\u000b"+
		"\b\f\b\u034f\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0004\n\u0361"+
		"\b\n\u000b\n\f\n\u0362\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0004\u000b\u036a\b\u000b\u000b\u000b\f\u000b\u036b\u0001\u000b\u0000"+
		"\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000"+
		"\u0001\u0001\u0000\u0005\n\u03bd\u0000 \u0001\u0000\u0000\u0000\u0002"+
		"\"\u0001\u0000\u0000\u0000\u0004\u008c\u0001\u0000\u0000\u0000\u0006\u00e5"+
		"\u0001\u0000\u0000\u0000\b\u0137\u0001\u0000\u0000\u0000\n\u0198\u0001"+
		"\u0000\u0000\u0000\f\u0220\u0001\u0000\u0000\u0000\u000e\u022b\u0001\u0000"+
		"\u0000\u0000\u0010\u02b9\u0001\u0000\u0000\u0000\u0012\u035c\u0001\u0000"+
		"\u0000\u0000\u0014\u0360\u0001\u0000\u0000\u0000\u0016\u0369\u0001\u0000"+
		"\u0000\u0000\u0018!\u0003\u0010\b\u0000\u0019!\u0003\u000e\u0007\u0000"+
		"\u001a!\u0003\f\u0006\u0000\u001b!\u0003\n\u0005\u0000\u001c!\u0003\b"+
		"\u0004\u0000\u001d!\u0003\u0006\u0003\u0000\u001e!\u0003\u0004\u0002\u0000"+
		"\u001f!\u0003\u0002\u0001\u0000 \u0018\u0001\u0000\u0000\u0000 \u0019"+
		"\u0001\u0000\u0000\u0000 \u001a\u0001\u0000\u0000\u0000 \u001b\u0001\u0000"+
		"\u0000\u0000 \u001c\u0001\u0000\u0000\u0000 \u001d\u0001\u0000\u0000\u0000"+
		" \u001e\u0001\u0000\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!\u0001"+
		"\u0001\u0000\u0000\u0000\"#\u0005\u0005\u0000\u0000#$\u0005\u0003\u0000"+
		"\u0000$%\u0005\n\u0000\u0000%&\u0005\n\u0000\u0000&\'\u0005\u0003\u0000"+
		"\u0000\'(\u0005\n\u0000\u0000()\u0005\u0003\u0000\u0000)*\u0005\n\u0000"+
		"\u0000*+\u0005\u0003\u0000\u0000+,\u0005\n\u0000\u0000,|\u0005\u0004\u0000"+
		"\u0000-.\u0005\b\u0000\u0000.0\u0005\u0003\u0000\u0000/1\u0003\u0012\t"+
		"\u00000/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000020\u0001\u0000"+
		"\u0000\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u00004q\u0005"+
		"\u0004\u0000\u000056\u0005\n\u0000\u000067\u0005\u0003\u0000\u000078\u0005"+
		"\n\u0000\u000089\u0005\u0003\u0000\u00009:\u0005\n\u0000\u0000:;\u0005"+
		"\u0003\u0000\u0000;<\u0005\n\u0000\u0000<=\u0005\u0003\u0000\u0000=>\u0005"+
		"\n\u0000\u0000>?\u0005\u0003\u0000\u0000?@\u0005\n\u0000\u0000@A\u0005"+
		"\u0003\u0000\u0000AB\u0005\n\u0000\u0000BC\u0005\u0003\u0000\u0000CD\u0005"+
		"\n\u0000\u0000DE\u0005\u0003\u0000\u0000Em\u0005\u0004\u0000\u0000FG\u0005"+
		"\u0003\u0000\u0000GH\u0005\u0003\u0000\u0000HI\u0005\u0003\u0000\u0000"+
		"IJ\u0005\u0003\u0000\u0000JK\u0005\u0003\u0000\u0000KL\u0005\u0003\u0000"+
		"\u0000LM\u0005\u0003\u0000\u0000MN\u0005\u0003\u0000\u0000Nn\u0005\u0004"+
		"\u0000\u0000OQ\u0005\u0006\u0000\u0000PO\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0005\u0003\u0000\u0000"+
		"SU\u0005\b\u0000\u0000TS\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000VX\u0005\u0003\u0000\u0000WY\u0005\b\u0000\u0000"+
		"XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Z\\\u0005\u0003\u0000\u0000[]\u0005\b\u0000\u0000\\[\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0005"+
		"\u0003\u0000\u0000_a\u0005\b\u0000\u0000`_\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0005\u0003\u0000\u0000"+
		"cd\u0005\b\u0000\u0000de\u0005\u0003\u0000\u0000ef\u0005\b\u0000\u0000"+
		"fh\u0005\u0003\u0000\u0000gi\u0005\b\u0000\u0000hg\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0005\u0003\u0000"+
		"\u0000kl\u0005\u0004\u0000\u0000ln\u0006\u0001\uffff\uffff\u0000mF\u0001"+
		"\u0000\u0000\u0000mP\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000"+
		"\u0000q5\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005"+
		"\n\u0000\u0000vw\u0005\u0003\u0000\u0000wx\u0005\n\u0000\u0000xy\u0005"+
		"\u0003\u0000\u0000yz\u0005\u0006\u0000\u0000z{\u0005\u0004\u0000\u0000"+
		"{}\u0001\u0000\u0000\u0000|-\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0005\u0000\u0000\u0081"+
		"\u0082\u0005\u0003\u0000\u0000\u0082\u0083\u0005\n\u0000\u0000\u0083\u0084"+
		"\u0005\n\u0000\u0000\u0084\u0085\u0005\u0003\u0000\u0000\u0085\u0086\u0005"+
		"\n\u0000\u0000\u0086\u0087\u0005\u0003\u0000\u0000\u0087\u0088\u0005\n"+
		"\u0000\u0000\u0088\u0089\u0005\u0003\u0000\u0000\u0089\u008a\u0005\n\u0000"+
		"\u0000\u008a\u008b\u0005\u0004\u0000\u0000\u008b\u0003\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005\u0005\u0000\u0000\u008d\u008e\u0005\u0003\u0000"+
		"\u0000\u008e\u008f\u0005\n\u0000\u0000\u008f\u0090\u0005\n\u0000\u0000"+
		"\u0090\u0091\u0005\u0003\u0000\u0000\u0091\u0092\u0005\n\u0000\u0000\u0092"+
		"\u0093\u0005\u0003\u0000\u0000\u0093\u0094\u0005\n\u0000\u0000\u0094\u0095"+
		"\u0005\u0003\u0000\u0000\u0095\u0096\u0005\n\u0000\u0000\u0096\u00d5\u0005"+
		"\u0004\u0000\u0000\u0097\u0098\u0005\b\u0000\u0000\u0098\u009a\u0005\u0003"+
		"\u0000\u0000\u0099\u009b\u0003\u0012\t\u0000\u009a\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u00ca\u0005\u0004\u0000\u0000\u009f\u00a0\u0005\n\u0000\u0000"+
		"\u00a0\u00a1\u0005\u0003\u0000\u0000\u00a1\u00a2\u0005\n\u0000\u0000\u00a2"+
		"\u00a3\u0005\u0003\u0000\u0000\u00a3\u00a4\u0005\n\u0000\u0000\u00a4\u00a5"+
		"\u0005\u0003\u0000\u0000\u00a5\u00a6\u0005\n\u0000\u0000\u00a6\u00a7\u0005"+
		"\u0003\u0000\u0000\u00a7\u00a8\u0005\n\u0000\u0000\u00a8\u00a9\u0005\u0003"+
		"\u0000\u0000\u00a9\u00aa\u0005\n\u0000\u0000\u00aa\u00ab\u0005\u0003\u0000"+
		"\u0000\u00ab\u00ac\u0005\n\u0000\u0000\u00ac\u00ad\u0005\u0003\u0000\u0000"+
		"\u00ad\u00c6\u0005\u0004\u0000\u0000\u00ae\u00af\u0005\u0003\u0000\u0000"+
		"\u00af\u00b0\u0005\u0003\u0000\u0000\u00b0\u00b1\u0005\u0003\u0000\u0000"+
		"\u00b1\u00b2\u0005\u0003\u0000\u0000\u00b2\u00b3\u0005\u0003\u0000\u0000"+
		"\u00b3\u00b4\u0005\u0003\u0000\u0000\u00b4\u00b5\u0005\u0003\u0000\u0000"+
		"\u00b5\u00c7\u0005\u0004\u0000\u0000\u00b6\u00b7\u0005\u0006\u0000\u0000"+
		"\u00b7\u00b8\u0005\u0003\u0000\u0000\u00b8\u00b9\u0005\b\u0000\u0000\u00b9"+
		"\u00ba\u0005\u0003\u0000\u0000\u00ba\u00bb\u0005\b\u0000\u0000\u00bb\u00bc"+
		"\u0005\u0003\u0000\u0000\u00bc\u00bd\u0005\b\u0000\u0000\u00bd\u00be\u0005"+
		"\u0003\u0000\u0000\u00be\u00bf\u0005\b\u0000\u0000\u00bf\u00c0\u0005\u0003"+
		"\u0000\u0000\u00c0\u00c1\u0005\b\u0000\u0000\u00c1\u00c2\u0005\u0003\u0000"+
		"\u0000\u00c2\u00c3\u0005\b\u0000\u0000\u00c3\u00c4\u0005\u0003\u0000\u0000"+
		"\u00c4\u00c5\u0005\u0004\u0000\u0000\u00c5\u00c7\u0006\u0002\uffff\uffff"+
		"\u0000\u00c6\u00ae\u0001\u0000\u0000\u0000\u00c6\u00b6\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000"+
		"\u0000\u00ca\u009f\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\n\u0000\u0000"+
		"\u00cf\u00d0\u0005\u0003\u0000\u0000\u00d0\u00d1\u0005\n\u0000\u0000\u00d1"+
		"\u00d2\u0005\u0003\u0000\u0000\u00d2\u00d3\u0005\u0006\u0000\u0000\u00d3"+
		"\u00d4\u0005\u0004\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5"+
		"\u0097\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u0005\u0000\u0000\u00da"+
		"\u00db\u0005\u0003\u0000\u0000\u00db\u00dc\u0005\n\u0000\u0000\u00dc\u00dd"+
		"\u0005\n\u0000\u0000\u00dd\u00de\u0005\u0003\u0000\u0000\u00de\u00df\u0005"+
		"\n\u0000\u0000\u00df\u00e0\u0005\u0003\u0000\u0000\u00e0\u00e1\u0005\n"+
		"\u0000\u0000\u00e1\u00e2\u0005\u0003\u0000\u0000\u00e2\u00e3\u0005\n\u0000"+
		"\u0000\u00e3\u00e4\u0005\u0004\u0000\u0000\u00e4\u0005\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0005\u0005\u0000\u0000\u00e6\u00e7\u0005\u0003\u0000"+
		"\u0000\u00e7\u00e8\u0005\n\u0000\u0000\u00e8\u00e9\u0005\n\u0000\u0000"+
		"\u00e9\u00ea\u0005\u0003\u0000\u0000\u00ea\u00eb\u0005\n\u0000\u0000\u00eb"+
		"\u00ec\u0005\u0003\u0000\u0000\u00ec\u00ed\u0005\n\u0000\u0000\u00ed\u00ee"+
		"\u0005\u0003\u0000\u0000\u00ee\u00ef\u0005\n\u0000\u0000\u00ef\u0127\u0005"+
		"\u0004\u0000\u0000\u00f0\u00f1\u0005\u0005\u0000\u0000\u00f1\u00f2\u0005"+
		"\u0003\u0000\u0000\u00f2\u00f3\u0005\b\u0000\u0000\u00f3\u00f4\u0005\u0003"+
		"\u0000\u0000\u00f4\u00f6\u0003\u0012\t\u0000\u00f5\u00f7\u0003\u0012\t"+
		"\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00fa\u0003\u0012\t\u0000"+
		"\u00f9\u00f8\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00fd\u0003\u0012\t\u0000\u00fc"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd"+
		"\u00ff\u0001\u0000\u0000\u0000\u00fe\u0100\u0003\u0012\t\u0000\u00ff\u00fe"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102"+
		"\u0001\u0000\u0000\u0000\u0101\u0103\u0003\u0012\t\u0000\u0102\u0101\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0105\u0001"+
		"\u0000\u0000\u0000\u0104\u0106\u0003\u0012\t\u0000\u0105\u0104\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u010a\u0001\u0000"+
		"\u0000\u0000\u0107\u0109\u0003\u0012\t\u0000\u0108\u0107\u0001\u0000\u0000"+
		"\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010d\u0001\u0000\u0000"+
		"\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u0004\u0000"+
		"\u0000\u010e\u010f\u0005\u0005\u0000\u0000\u010f\u0110\u0005\u0003\u0000"+
		"\u0000\u0110\u0111\u0005\t\u0000\u0000\u0111\u0112\u0005\u0004\u0000\u0000"+
		"\u0112\u0113\u0005\u0005\u0000\u0000\u0113\u0114\u0005\u0003\u0000\u0000"+
		"\u0114\u0115\u0005\t\u0000\u0000\u0115\u0116\u0005\u0004\u0000\u0000\u0116"+
		"\u0117\u0005\u0005\u0000\u0000\u0117\u0118\u0005\u0003\u0000\u0000\u0118"+
		"\u0119\u0005\b\u0000\u0000\u0119\u011a\u0005\n\u0000\u0000\u011a\u011b"+
		"\u0005\u0004\u0000\u0000\u011b\u011c\u0005\u0005\u0000\u0000\u011c\u011d"+
		"\u0005\u0003\u0000\u0000\u011d\u011e\u0005\u0006\u0000\u0000\u011e\u011f"+
		"\u0005\u0004\u0000\u0000\u011f\u0120\u0005\n\u0000\u0000\u0120\u0121\u0005"+
		"\u0003\u0000\u0000\u0121\u0122\u0005\n\u0000\u0000\u0122\u0123\u0005\u0003"+
		"\u0000\u0000\u0123\u0124\u0005\u0006\u0000\u0000\u0124\u0125\u0005\u0004"+
		"\u0000\u0000\u0125\u0126\u0006\u0003\uffff\uffff\u0000\u0126\u0128\u0001"+
		"\u0000\u0000\u0000\u0127\u00f0\u0001\u0000\u0000\u0000\u0128\u0129\u0001"+
		"\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0005"+
		"\u0005\u0000\u0000\u012c\u012d\u0005\u0003\u0000\u0000\u012d\u012e\u0005"+
		"\n\u0000\u0000\u012e\u012f\u0005\n\u0000\u0000\u012f\u0130\u0005\u0003"+
		"\u0000\u0000\u0130\u0131\u0005\n\u0000\u0000\u0131\u0132\u0005\u0003\u0000"+
		"\u0000\u0132\u0133\u0005\n\u0000\u0000\u0133\u0134\u0005\u0003\u0000\u0000"+
		"\u0134\u0135\u0005\n\u0000\u0000\u0135\u0136\u0005\u0004\u0000\u0000\u0136"+
		"\u0007\u0001\u0000\u0000\u0000\u0137\u0138\u0005\u0005\u0000\u0000\u0138"+
		"\u0139\u0005\u0003\u0000\u0000\u0139\u013a\u0005\n\u0000\u0000\u013a\u013b"+
		"\u0005\u0003\u0000\u0000\u013b\u013c\u0005\n\u0000\u0000\u013c\u013d\u0005"+
		"\n\u0000\u0000\u013d\u013e\u0005\n\u0000\u0000\u013e\u013f\u0005\u0003"+
		"\u0000\u0000\u013f\u0140\u0005\n\u0000\u0000\u0140\u0141\u0005\u0003\u0000"+
		"\u0000\u0141\u0142\u0005\n\u0000\u0000\u0142\u0187\u0005\u0004\u0000\u0000"+
		"\u0143\u0144\u0005\n\u0000\u0000\u0144\u0145\u0005\u0003\u0000\u0000\u0145"+
		"\u0146\u0005\u0004\u0000\u0000\u0146\u0147\u0005\n\u0000\u0000\u0147\u0148"+
		"\u0005\u0003\u0000\u0000\u0148\u0149\u0005\n\u0000\u0000\u0149\u014a\u0005"+
		"\u0003\u0000\u0000\u014a\u014b\u0005\n\u0000\u0000\u014b\u014c\u0005\u0003"+
		"\u0000\u0000\u014c\u014d\u0005\n\u0000\u0000\u014d\u014e\u0005\u0003\u0000"+
		"\u0000\u014e\u014f\u0005\n\u0000\u0000\u014f\u0150\u0005\u0003\u0000\u0000"+
		"\u0150\u0151\u0005\n\u0000\u0000\u0151\u0152\u0005\u0003\u0000\u0000\u0152"+
		"\u0153\u0005\n\u0000\u0000\u0153\u0154\u0005\u0003\u0000\u0000\u0154\u0155"+
		"\u0005\n\u0000\u0000\u0155\u0156\u0005\u0003\u0000\u0000\u0156\u0157\u0005"+
		"\n\u0000\u0000\u0157\u0158\u0005\u0003\u0000\u0000\u0158\u0159\u0005\n"+
		"\u0000\u0000\u0159\u015a\u0005\u0003\u0000\u0000\u015a\u015b\u0005\n\u0000"+
		"\u0000\u015b\u015c\u0005\u0003\u0000\u0000\u015c\u017c\u0005\u0004\u0000"+
		"\u0000\u015d\u015e\u0005\n\u0000\u0000\u015e\u015f\u0005\u0003\u0000\u0000"+
		"\u015f\u0160\u0005\b\u0000\u0000\u0160\u0162\u0005\u0003\u0000\u0000\u0161"+
		"\u0163\u0005\b\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0162\u0163"+
		"\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0166"+
		"\u0005\u0003\u0000\u0000\u0165\u0167\u0003\u0012\t\u0000\u0166\u0165\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0166\u0001"+
		"\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\u0005\u0003\u0000\u0000\u016b\u016c\u0005"+
		"\n\u0000\u0000\u016c\u016d\u0005\u0003\u0000\u0000\u016d\u016e\u0005\n"+
		"\u0000\u0000\u016e\u016f\u0005\u0003\u0000\u0000\u016f\u0170\u0005\b\u0000"+
		"\u0000\u0170\u0171\u0005\u0003\u0000\u0000\u0171\u0172\u0005\b\u0000\u0000"+
		"\u0172\u0173\u0005\u0003\u0000\u0000\u0173\u0174\u0005\b\u0000\u0000\u0174"+
		"\u0175\u0005\u0003\u0000\u0000\u0175\u0176\u0005\b\u0000\u0000\u0176\u0177"+
		"\u0005\u0003\u0000\u0000\u0177\u0178\u0005\b\u0000\u0000\u0178\u0179\u0005"+
		"\u0003\u0000\u0000\u0179\u017a\u0005\u0004\u0000\u0000\u017a\u017b\u0006"+
		"\u0004\uffff\uffff\u0000\u017b\u017d\u0001\u0000\u0000\u0000\u017c\u015d"+
		"\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u017c"+
		"\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0180"+
		"\u0001\u0000\u0000\u0000\u0180\u0181\u0005\n\u0000\u0000\u0181\u0182\u0005"+
		"\u0003\u0000\u0000\u0182\u0183\u0005\n\u0000\u0000\u0183\u0184\u0005\u0003"+
		"\u0000\u0000\u0184\u0185\u0005\u0006\u0000\u0000\u0185\u0186\u0005\u0004"+
		"\u0000\u0000\u0186\u0188\u0001\u0000\u0000\u0000\u0187\u0143\u0001\u0000"+
		"\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000"+
		"\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000"+
		"\u0000\u0000\u018b\u018c\u0005\u0005\u0000\u0000\u018c\u018d\u0005\u0003"+
		"\u0000\u0000\u018d\u018e\u0005\n\u0000\u0000\u018e\u018f\u0005\u0003\u0000"+
		"\u0000\u018f\u0190\u0005\n\u0000\u0000\u0190\u0191\u0005\n\u0000\u0000"+
		"\u0191\u0192\u0005\n\u0000\u0000\u0192\u0193\u0005\u0003\u0000\u0000\u0193"+
		"\u0194\u0005\n\u0000\u0000\u0194\u0195\u0005\u0003\u0000\u0000\u0195\u0196"+
		"\u0005\n\u0000\u0000\u0196\u0197\u0005\u0004\u0000\u0000\u0197\t\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0005\u0005\u0000\u0000\u0199\u019a\u0005"+
		"\u0003\u0000\u0000\u019a\u019b\u0005\n\u0000\u0000\u019b\u019c\u0005\n"+
		"\u0000\u0000\u019c\u019d\u0005\u0003\u0000\u0000\u019d\u019e\u0005\n\u0000"+
		"\u0000\u019e\u019f\u0005\u0003\u0000\u0000\u019f\u01a0\u0005\n\u0000\u0000"+
		"\u01a0\u01f2\u0005\u0004\u0000\u0000\u01a1\u01a2\u0005\u0005\u0000\u0000"+
		"\u01a2\u01a3\u0005\u0003\u0000\u0000\u01a3\u01a4\u0005\b\u0000\u0000\u01a4"+
		"\u01a8\u0005\u0003\u0000\u0000\u01a5\u01a7\u0003\u0012\t\u0000\u01a6\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a7\u01aa\u0001\u0000\u0000\u0000\u01a8\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab"+
		"\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u0005\u0004\u0000\u0000\u01ac\u01ae\u0003\u0012\t\u0000\u01ad\u01af\u0003"+
		"\u0012\t\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000"+
		"\u0000\u0000\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0\u01b2\u0003\u0012"+
		"\t\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000\u01b3\u01b5\u0003\u0012\t\u0000"+
		"\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01b8\u0003\u0012\t\u0000\u01b7"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8"+
		"\u01ba\u0001\u0000\u0000\u0000\u01b9\u01bb\u0003\u0012\t\u0000\u01ba\u01b9"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bc\u01be\u0003\u0012\t\u0000\u01bd\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01c2\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c1\u0003\u0012\t\u0000\u01c0\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c4\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005\u0004"+
		"\u0000\u0000\u01c6\u01c8\u0003\u0012\t\u0000\u01c7\u01c9\u0003\u0012\t"+
		"\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000"+
		"\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u01cc\u0003\u0012\t\u0000"+
		"\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000"+
		"\u01cc\u01ce\u0001\u0000\u0000\u0000\u01cd\u01cf\u0003\u0012\t\u0000\u01ce"+
		"\u01cd\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d0\u01d2\u0003\u0012\t\u0000\u01d1\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d5\u0003\u0012\t\u0000\u01d4\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d7\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d8\u0003\u0012\t\u0000\u01d7\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01dc\u0001\u0000"+
		"\u0000\u0000\u01d9\u01db\u0003\u0012\t\u0000\u01da\u01d9\u0001\u0000\u0000"+
		"\u0000\u01db\u01de\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000"+
		"\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01df\u0001\u0000\u0000"+
		"\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df\u01e0\u0005\u0004\u0000"+
		"\u0000\u01e0\u01e4\u0005\u0006\u0000\u0000\u01e1\u01e3\u0005\n\u0000\u0000"+
		"\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e6\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e7\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e8\u0005\u0004\u0000\u0000\u01e8\u01e9\u0003\u0012\t\u0000\u01e9"+
		"\u01ea\u0005\u0004\u0000\u0000\u01ea\u01eb\u0005\n\u0000\u0000\u01eb\u01ec"+
		"\u0005\u0003\u0000\u0000\u01ec\u01ed\u0005\n\u0000\u0000\u01ed\u01ee\u0005"+
		"\u0003\u0000\u0000\u01ee\u01ef\u0005\u0006\u0000\u0000\u01ef\u01f0\u0005"+
		"\u0004\u0000\u0000\u01f0\u01f1\u0006\u0005\uffff\uffff\u0000\u01f1\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f2\u01a1\u0001\u0000\u0000\u0000\u01f3\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f7"+
		"\u0005\u0005\u0000\u0000\u01f7\u01f8\u0005\u0003\u0000\u0000\u01f8\u01f9"+
		"\u0005\n\u0000\u0000\u01f9\u01fa\u0005\n\u0000\u0000\u01fa\u01fb\u0005"+
		"\u0003\u0000\u0000\u01fb\u01fc\u0005\n\u0000\u0000\u01fc\u01fd\u0005\u0003"+
		"\u0000\u0000\u01fd\u01fe\u0005\n\u0000\u0000\u01fe\u01ff\u0005\u0004\u0000"+
		"\u0000\u01ff\u000b\u0001\u0000\u0000\u0000\u0200\u0201\u0005\u0005\u0000"+
		"\u0000\u0201\u0202\u0005\u0003\u0000\u0000\u0202\u0203\u0005\n\u0000\u0000"+
		"\u0203\u0204\u0005\u0003\u0000\u0000\u0204\u0206\u0003\u0012\t\u0000\u0205"+
		"\u0207\u0003\u0012\t\u0000\u0206\u0205\u0001\u0000\u0000\u0000\u0206\u0207"+
		"\u0001\u0000\u0000\u0000\u0207\u0209\u0001\u0000\u0000\u0000\u0208\u020a"+
		"\u0003\u0012\t\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u0209\u020a\u0001"+
		"\u0000\u0000\u0000\u020a\u020c\u0001\u0000\u0000\u0000\u020b\u020d\u0003"+
		"\u0012\t\u0000\u020c\u020b\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000"+
		"\u0000\u0000\u020d\u020f\u0001\u0000\u0000\u0000\u020e\u0210\u0003\u0012"+
		"\t\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000"+
		"\u0000\u0210\u0212\u0001\u0000\u0000\u0000\u0211\u0213\u0003\u0012\t\u0000"+
		"\u0212\u0211\u0001\u0000\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000"+
		"\u0213\u0215\u0001\u0000\u0000\u0000\u0214\u0216\u0003\u0012\t\u0000\u0215"+
		"\u0214\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216"+
		"\u021a\u0001\u0000\u0000\u0000\u0217\u0219\u0003\u0012\t\u0000\u0218\u0217"+
		"\u0001\u0000\u0000\u0000\u0219\u021c\u0001\u0000\u0000\u0000\u021a\u0218"+
		"\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021d"+
		"\u0001\u0000\u0000\u0000\u021c\u021a\u0001\u0000\u0000\u0000\u021d\u021e"+
		"\u0005\u0004\u0000\u0000\u021e\u021f\u0006\u0006\uffff\uffff\u0000\u021f"+
		"\u0221\u0001\u0000\u0000\u0000\u0220\u0200\u0001\u0000\u0000\u0000\u0221"+
		"\u0222\u0001\u0000\u0000\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0222"+
		"\u0223\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224"+
		"\u0225\u0005\n\u0000\u0000\u0225\u0226\u0005\u0003\u0000\u0000\u0226\u0227"+
		"\u0005\n\u0000\u0000\u0227\u0228\u0005\u0003\u0000\u0000\u0228\u0229\u0005"+
		"\u0006\u0000\u0000\u0229\u022a\u0005\u0004\u0000\u0000\u022a\r\u0001\u0000"+
		"\u0000\u0000\u022b\u022c\u0005\u0005\u0000\u0000\u022c\u022d\u0005\u0003"+
		"\u0000\u0000\u022d\u022e\u0005\n\u0000\u0000\u022e\u022f\u0005\n\u0000"+
		"\u0000\u022f\u0230\u0005\n\u0000\u0000\u0230\u0231\u0005\u0003\u0000\u0000"+
		"\u0231\u0232\u0005\n\u0000\u0000\u0232\u0233\u0005\n\u0000\u0000\u0233"+
		"\u0234\u0005\n\u0000\u0000\u0234\u0235\u0005\u0003\u0000\u0000\u0235\u0236"+
		"\u0005\n\u0000\u0000\u0236\u0237\u0005\u0003\u0000\u0000\u0237\u0238\u0005"+
		"\n\u0000\u0000\u0238\u02a6\u0005\u0004\u0000\u0000\u0239\u023a\u0005\u0005"+
		"\u0000\u0000\u023a\u023b\u0005\u0003\u0000\u0000\u023b\u023c\u0005\b\u0000"+
		"\u0000\u023c\u023d\u0005\u0004\u0000\u0000\u023d\u023e\u0005\n\u0000\u0000"+
		"\u023e\u023f\u0005\u0003\u0000\u0000\u023f\u0240\u0005\u0003\u0000\u0000"+
		"\u0240\u0241\u0005\n\u0000\u0000\u0241\u0242\u0005\u0003\u0000\u0000\u0242"+
		"\u0243\u0005\n\u0000\u0000\u0243\u0244\u0005\u0003\u0000\u0000\u0244\u0245"+
		"\u0005\n\u0000\u0000\u0245\u0246\u0005\u0003\u0000\u0000\u0246\u0247\u0005"+
		"\n\u0000\u0000\u0247\u0248\u0005\u0003\u0000\u0000\u0248\u0249\u0005\n"+
		"\u0000\u0000\u0249\u024a\u0005\u0003\u0000\u0000\u024a\u024b\u0005\n\u0000"+
		"\u0000\u024b\u024c\u0005\u0003\u0000\u0000\u024c\u024d\u0005\n\u0000\u0000"+
		"\u024d\u024e\u0005\u0003\u0000\u0000\u024e\u024f\u0005\n\u0000\u0000\u024f"+
		"\u0250\u0005\u0003\u0000\u0000\u0250\u029c\u0005\u0004\u0000\u0000\u0251"+
		"\u0253\u0003\u0012\t\u0000\u0252\u0254\u0003\u0012\t\u0000\u0253\u0252"+
		"\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0256"+
		"\u0001\u0000\u0000\u0000\u0255\u0257\u0003\u0012\t\u0000\u0256\u0255\u0001"+
		"\u0000\u0000\u0000\u0256\u0257\u0001\u0000\u0000\u0000\u0257\u0259\u0001"+
		"\u0000\u0000\u0000\u0258\u025a\u0003\u0012\t\u0000\u0259\u0258\u0001\u0000"+
		"\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025a\u025c\u0001\u0000"+
		"\u0000\u0000\u025b\u025d\u0003\u0012\t\u0000\u025c\u025b\u0001\u0000\u0000"+
		"\u0000\u025c\u025d\u0001\u0000\u0000\u0000\u025d\u025f\u0001\u0000\u0000"+
		"\u0000\u025e\u0260\u0003\u0012\t\u0000\u025f\u025e\u0001\u0000\u0000\u0000"+
		"\u025f\u0260\u0001\u0000\u0000\u0000\u0260\u0262\u0001\u0000\u0000\u0000"+
		"\u0261\u0263\u0003\u0012\t\u0000\u0262\u0261\u0001\u0000\u0000\u0000\u0262"+
		"\u0263\u0001\u0000\u0000\u0000\u0263\u0267\u0001\u0000\u0000\u0000\u0264"+
		"\u0266\u0003\u0012\t\u0000\u0265\u0264\u0001\u0000\u0000\u0000\u0266\u0269"+
		"\u0001\u0000\u0000\u0000\u0267\u0265\u0001\u0000\u0000\u0000\u0267\u0268"+
		"\u0001\u0000\u0000\u0000\u0268\u026a\u0001\u0000\u0000\u0000\u0269\u0267"+
		"\u0001\u0000\u0000\u0000\u026a\u026b\u0005\u0003\u0000\u0000\u026b\u026c"+
		"\u0005\u0003\u0000\u0000\u026c\u026d\u0005\n\u0000\u0000\u026d\u0271\u0005"+
		"\u0003\u0000\u0000\u026e\u0270\u0003\u0012\t\u0000\u026f\u026e\u0001\u0000"+
		"\u0000\u0000\u0270\u0273\u0001\u0000\u0000\u0000\u0271\u026f\u0001\u0000"+
		"\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u0274\u0001\u0000"+
		"\u0000\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0274\u0276\u0005\u0003"+
		"\u0000\u0000\u0275\u0277\u0005\u0006\u0000\u0000\u0276\u0275\u0001\u0000"+
		"\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000"+
		"\u0000\u0000\u0278\u027a\u0005\u0003\u0000\u0000\u0279\u027b\u0005\u0006"+
		"\u0000\u0000\u027a\u0279\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000"+
		"\u0000\u0000\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027e\u0005\u0003"+
		"\u0000\u0000\u027d\u027f\u0005\n\u0000\u0000\u027e\u027d\u0001\u0000\u0000"+
		"\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000\u0000"+
		"\u0000\u0280\u0282\u0005\u0003\u0000\u0000\u0281\u0283\u0005\b\u0000\u0000"+
		"\u0282\u0281\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000"+
		"\u0283\u0284\u0001\u0000\u0000\u0000\u0284\u0286\u0005\u0003\u0000\u0000"+
		"\u0285\u0287\u0005\b\u0000\u0000\u0286\u0285\u0001\u0000\u0000\u0000\u0286"+
		"\u0287\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u0288"+
		"\u028a\u0005\u0003\u0000\u0000\u0289\u028b\u0005\b\u0000\u0000\u028a\u0289"+
		"\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u028c"+
		"\u0001\u0000\u0000\u0000\u028c\u028d\u0005\u0003\u0000\u0000\u028d\u028e"+
		"\u0005\u0004\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0290"+
		"\u0006\u0007\uffff\uffff\u0000\u0290\u029d\u0001\u0000\u0000\u0000\u0291"+
		"\u0292\u0005\u0003\u0000\u0000\u0292\u0293\u0005\u0003\u0000\u0000\u0293"+
		"\u0294\u0005\u0003\u0000\u0000\u0294\u0295\u0005\u0003\u0000\u0000\u0295"+
		"\u0296\u0005\u0003\u0000\u0000\u0296\u0297\u0005\u0003\u0000\u0000\u0297"+
		"\u0298\u0005\u0003\u0000\u0000\u0298\u0299\u0005\u0003\u0000\u0000\u0299"+
		"\u029a\u0005\u0003\u0000\u0000\u029a\u029b\u0005\u0003\u0000\u0000\u029b"+
		"\u029d\u0005\u0004\u0000\u0000\u029c\u0251\u0001\u0000\u0000\u0000\u029c"+
		"\u0291\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029e"+
		"\u029c\u0001\u0000\u0000\u0000\u029e\u029f\u0001\u0000\u0000\u0000\u029f"+
		"\u02a0\u0001\u0000\u0000\u0000\u02a0\u02a1\u0005\n\u0000\u0000\u02a1\u02a2"+
		"\u0005\u0003\u0000\u0000\u02a2\u02a3\u0005\n\u0000\u0000\u02a3\u02a4\u0005"+
		"\u0003\u0000\u0000\u02a4\u02a5\u0005\u0006\u0000\u0000\u02a5\u02a7\u0005"+
		"\u0004\u0000\u0000\u02a6\u0239\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001"+
		"\u0000\u0000\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a8\u02a9\u0001"+
		"\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa\u02ab\u0005"+
		"\u0005\u0000\u0000\u02ab\u02ac\u0005\u0003\u0000\u0000\u02ac\u02ad\u0005"+
		"\n\u0000\u0000\u02ad\u02ae\u0005\n\u0000\u0000\u02ae\u02af\u0005\n\u0000"+
		"\u0000\u02af\u02b0\u0005\u0003\u0000\u0000\u02b0\u02b1\u0005\n\u0000\u0000"+
		"\u02b1\u02b2\u0005\n\u0000\u0000\u02b2\u02b3\u0005\n\u0000\u0000\u02b3"+
		"\u02b4\u0005\u0003\u0000\u0000\u02b4\u02b5\u0005\n\u0000\u0000\u02b5\u02b6"+
		"\u0005\u0003\u0000\u0000\u02b6\u02b7\u0005\n\u0000\u0000\u02b7\u02b8\u0005"+
		"\u0004\u0000\u0000\u02b8\u000f\u0001\u0000\u0000\u0000\u02b9\u02ba\u0005"+
		"\u0005\u0000\u0000\u02ba\u02bb\u0005\u0003\u0000\u0000\u02bb\u02bc\u0005"+
		"\n\u0000\u0000\u02bc\u02bd\u0005\n\u0000\u0000\u02bd\u02be\u0005\n\u0000"+
		"\u0000\u02be\u02bf\u0005\u0003\u0000\u0000\u02bf\u02c0\u0005\n\u0000\u0000"+
		"\u02c0\u02c1\u0005\u0003\u0000\u0000\u02c1\u02c2\u0005\n\u0000\u0000\u02c2"+
		"\u034d\u0005\u0004\u0000\u0000\u02c3\u02c4\u0005\u0005\u0000\u0000\u02c4"+
		"\u02c5\u0005\u0003\u0000\u0000\u02c5\u02c6\u0005\b\u0000\u0000\u02c6\u02c8"+
		"\u0005\u0003\u0000\u0000\u02c7\u02c9\u0003\u0012\t\u0000\u02c8\u02c7\u0001"+
		"\u0000\u0000\u0000\u02c9\u02ca\u0001\u0000\u0000\u0000\u02ca\u02c8\u0001"+
		"\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb\u02cc\u0001"+
		"\u0000\u0000\u0000\u02cc\u0342\u0005\u0004\u0000\u0000\u02cd\u02ce\u0005"+
		"\n\u0000\u0000\u02ce\u02cf\u0005\u0003\u0000\u0000\u02cf\u02d0\u0005\n"+
		"\u0000\u0000\u02d0\u02d1\u0005\u0004\u0000\u0000\u02d1\u02d2\u0005\n\u0000"+
		"\u0000\u02d2\u02d3\u0005\u0003\u0000\u0000\u02d3\u02d4\u0005\n\u0000\u0000"+
		"\u02d4\u02d5\u0005\u0004\u0000\u0000\u02d5\u02d6\u0005\n\u0000\u0000\u02d6"+
		"\u02d7\u0005\u0003\u0000\u0000\u02d7\u02d8\u0005\n\u0000\u0000\u02d8\u02d9"+
		"\u0005\u0003\u0000\u0000\u02d9\u02da\u0005\n\u0000\u0000\u02da\u02db\u0005"+
		"\u0003\u0000\u0000\u02db\u02dc\u0005\n\u0000\u0000\u02dc\u02dd\u0005\u0003"+
		"\u0000\u0000\u02dd\u02de\u0005\n\u0000\u0000\u02de\u02df\u0005\u0003\u0000"+
		"\u0000\u02df\u02e0\u0005\n\u0000\u0000\u02e0\u02e1\u0005\u0003\u0000\u0000"+
		"\u02e1\u02e2\u0005\n\u0000\u0000\u02e2\u02e3\u0005\u0003\u0000\u0000\u02e3"+
		"\u02e4\u0005\n\u0000\u0000\u02e4\u02e5\u0005\u0003\u0000\u0000\u02e5\u02e6"+
		"\u0005\n\u0000\u0000\u02e6\u02e7\u0005\u0003\u0000\u0000\u02e7\u02e8\u0005"+
		"\n\u0000\u0000\u02e8\u02e9\u0005\u0003\u0000\u0000\u02e9\u02ea\u0005\n"+
		"\u0000\u0000\u02ea\u02eb\u0005\u0003\u0000\u0000\u02eb\u02ec\u0005\n\u0000"+
		"\u0000\u02ec\u02ed\u0005\u0003\u0000\u0000\u02ed\u02ee\u0005\u0004\u0000"+
		"\u0000\u02ee\u02ef\u0005\n\u0000\u0000\u02ef\u02f0\u0005\u0003\u0000\u0000"+
		"\u02f0\u02f1\u0005\n\u0000\u0000\u02f1\u02f2\u0005\u0003\u0000\u0000\u02f2"+
		"\u02f3\u0005\n\u0000\u0000\u02f3\u02f4\u0005\u0003\u0000\u0000\u02f4\u02f5"+
		"\u0005\n\u0000\u0000\u02f5\u02f6\u0005\u0003\u0000\u0000\u02f6\u02f7\u0005"+
		"\n\u0000\u0000\u02f7\u02f8\u0005\u0003\u0000\u0000\u02f8\u02f9\u0005\n"+
		"\u0000\u0000\u02f9\u02fa\u0005\u0003\u0000\u0000\u02fa\u033e\u0005\u0004"+
		"\u0000\u0000\u02fb\u02fc\u0005\u0003\u0000\u0000\u02fc\u02fd\u0005\u0003"+
		"\u0000\u0000\u02fd\u02fe\u0005\u0003\u0000\u0000\u02fe\u02ff\u0005\u0003"+
		"\u0000\u0000\u02ff\u0300\u0005\u0003\u0000\u0000\u0300\u0301\u0005\u0003"+
		"\u0000\u0000\u0301\u0302\u0005\u0003\u0000\u0000\u0302\u0303\u0005\u0003"+
		"\u0000\u0000\u0303\u0304\u0005\u0003\u0000\u0000\u0304\u0305\u0005\u0003"+
		"\u0000\u0000\u0305\u0306\u0005\u0003\u0000\u0000\u0306\u0307\u0005\u0003"+
		"\u0000\u0000\u0307\u0308\u0005\u0003\u0000\u0000\u0308\u0309\u0005\u0003"+
		"\u0000\u0000\u0309\u030a\u0005\u0003\u0000\u0000\u030a\u030b\u0005\u0003"+
		"\u0000\u0000\u030b\u030c\u0005\u0003\u0000\u0000\u030c\u033f\u0005\u0004"+
		"\u0000\u0000\u030d\u030e\u0005\u0006\u0000\u0000\u030e\u0310\u0005\u0003"+
		"\u0000\u0000\u030f\u0311\u0005\u0006\u0000\u0000\u0310\u030f\u0001\u0000"+
		"\u0000\u0000\u0310\u0311\u0001\u0000\u0000\u0000\u0311\u0312\u0001\u0000"+
		"\u0000\u0000\u0312\u0314\u0005\u0003\u0000\u0000\u0313\u0315\u0005\u0006"+
		"\u0000\u0000\u0314\u0313\u0001\u0000\u0000\u0000\u0314\u0315\u0001\u0000"+
		"\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316\u0317\u0005\u0003"+
		"\u0000\u0000\u0317\u0318\u0005\b\u0000\u0000\u0318\u031a\u0005\u0003\u0000"+
		"\u0000\u0319\u031b\u0003\u0012\t\u0000\u031a\u0319\u0001\u0000\u0000\u0000"+
		"\u031b\u031c\u0001\u0000\u0000\u0000\u031c\u031a\u0001\u0000\u0000\u0000"+
		"\u031c\u031d\u0001\u0000\u0000\u0000\u031d\u031e\u0001\u0000\u0000\u0000"+
		"\u031e\u031f\u0005\u0003\u0000\u0000\u031f\u0320\u0005\n\u0000\u0000\u0320"+
		"\u0321\u0005\u0003\u0000\u0000\u0321\u0322\u0005\n\u0000\u0000\u0322\u0323"+
		"\u0005\u0003\u0000\u0000\u0323\u0324\u0005\n\u0000\u0000\u0324\u0325\u0005"+
		"\u0003\u0000\u0000\u0325\u0326\u0005\n\u0000\u0000\u0326\u0327\u0005\u0003"+
		"\u0000\u0000\u0327\u0328\u0005\b\u0000\u0000\u0328\u032a\u0005\u0003\u0000"+
		"\u0000\u0329\u032b\u0005\b\u0000\u0000\u032a\u0329\u0001\u0000\u0000\u0000"+
		"\u032a\u032b\u0001\u0000\u0000\u0000\u032b\u032c\u0001\u0000\u0000\u0000"+
		"\u032c\u032d\u0005\u0003\u0000\u0000\u032d\u032e\u0005\b\u0000\u0000\u032e"+
		"\u032f\u0005\u0003\u0000\u0000\u032f\u0330\u0005\b\u0000\u0000\u0330\u0332"+
		"\u0005\u0003\u0000\u0000\u0331\u0333\u0005\b\u0000\u0000\u0332\u0331\u0001"+
		"\u0000\u0000\u0000\u0332\u0333\u0001\u0000\u0000\u0000\u0333\u0334\u0001"+
		"\u0000\u0000\u0000\u0334\u0335\u0005\u0003\u0000\u0000\u0335\u0336\u0005"+
		"\u0003\u0000\u0000\u0336\u0337\u0005\b\u0000\u0000\u0337\u0338\u0005\u0003"+
		"\u0000\u0000\u0338\u0339\u0005\b\u0000\u0000\u0339\u033a\u0005\u0003\u0000"+
		"\u0000\u033a\u033b\u0005\u0004\u0000\u0000\u033b\u033c\u0001\u0000\u0000"+
		"\u0000\u033c\u033d\u0006\b\uffff\uffff\u0000\u033d\u033f\u0001\u0000\u0000"+
		"\u0000\u033e\u02fb\u0001\u0000\u0000\u0000\u033e\u030d\u0001\u0000\u0000"+
		"\u0000\u033f\u0340\u0001\u0000\u0000\u0000\u0340\u033e\u0001\u0000\u0000"+
		"\u0000\u0340\u0341\u0001\u0000\u0000\u0000\u0341\u0343\u0001\u0000\u0000"+
		"\u0000\u0342\u02cd\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000"+
		"\u0000\u0344\u0342\u0001\u0000\u0000\u0000\u0344\u0345\u0001\u0000\u0000"+
		"\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346\u0347\u0005\n\u0000\u0000"+
		"\u0347\u0348\u0005\u0003\u0000\u0000\u0348\u0349\u0005\n\u0000\u0000\u0349"+
		"\u034a\u0005\u0003\u0000\u0000\u034a\u034b\u0005\u0006\u0000\u0000\u034b"+
		"\u034c\u0005\u0004\u0000\u0000\u034c\u034e\u0001\u0000\u0000\u0000\u034d"+
		"\u02c3\u0001\u0000\u0000\u0000\u034e\u034f\u0001\u0000\u0000\u0000\u034f"+
		"\u034d\u0001\u0000\u0000\u0000\u034f\u0350\u0001\u0000\u0000\u0000\u0350"+
		"\u0351\u0001\u0000\u0000\u0000\u0351\u0352\u0005\u0005\u0000\u0000\u0352"+
		"\u0353\u0005\u0003\u0000\u0000\u0353\u0354\u0005\n\u0000\u0000\u0354\u0355"+
		"\u0005\n\u0000\u0000\u0355\u0356\u0005\n\u0000\u0000\u0356\u0357\u0005"+
		"\u0003\u0000\u0000\u0357\u0358\u0005\n\u0000\u0000\u0358\u0359\u0005\u0003"+
		"\u0000\u0000\u0359\u035a\u0005\n\u0000\u0000\u035a\u035b\u0005\u0004\u0000"+
		"\u0000\u035b\u0011\u0001\u0000\u0000\u0000\u035c\u035d\u0007\u0000\u0000"+
		"\u0000\u035d\u0013\u0001\u0000\u0000\u0000\u035e\u0361\u0003\u0012\t\u0000"+
		"\u035f\u0361\u0005\u0003\u0000\u0000\u0360\u035e\u0001\u0000\u0000\u0000"+
		"\u0360\u035f\u0001\u0000\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000"+
		"\u0362\u0360\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000\u0000"+
		"\u0363\u0364\u0001\u0000\u0000\u0000\u0364\u0365\u0005\u0004\u0000\u0000"+
		"\u0365\u0015\u0001\u0000\u0000\u0000\u0366\u036a\u0003\u0012\t\u0000\u0367"+
		"\u036a\u0005\u0003\u0000\u0000\u0368\u036a\u0005\u0004\u0000\u0000\u0369"+
		"\u0366\u0001\u0000\u0000\u0000\u0369\u0367\u0001\u0000\u0000\u0000\u0369"+
		"\u0368\u0001\u0000\u0000\u0000\u036a\u036b\u0001\u0000\u0000\u0000\u036b"+
		"\u0369\u0001\u0000\u0000\u0000\u036b\u036c\u0001\u0000\u0000\u0000\u036c"+
		"\u0017\u0001\u0000\u0000\u0000U 2PTX\\`hmos~\u009c\u00c6\u00c8\u00cc\u00d7"+
		"\u00f6\u00f9\u00fc\u00ff\u0102\u0105\u010a\u0129\u0162\u0168\u017e\u0189"+
		"\u01a8\u01ae\u01b1\u01b4\u01b7\u01ba\u01bd\u01c2\u01c8\u01cb\u01ce\u01d1"+
		"\u01d4\u01d7\u01dc\u01e4\u01f4\u0206\u0209\u020c\u020f\u0212\u0215\u021a"+
		"\u0222\u0253\u0256\u0259\u025c\u025f\u0262\u0267\u0271\u0276\u027a\u027e"+
		"\u0282\u0286\u028a\u029c\u029e\u02a8\u02ca\u0310\u0314\u031c\u032a\u0332"+
		"\u033e\u0340\u0344\u034f\u0360\u0362\u0369\u036b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}