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
		RULE_crawlPriceKrx = 9, RULE_word = 10, RULE_line = 11, RULE_eof = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"stockDocument", "krxPriceCompany", "krxPriceEtf", "krxItemInfoCompany", 
			"krxItemInfoEtf", "krxBasicInfoEtf", "krxBasicInfoCompany", "etfAllPrice", 
			"companyAllPrice", "crawlPriceKrx", "word", "line", "eof"
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
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				crawlPriceKrx();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				companyAllPrice();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				etfAllPrice();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				krxBasicInfoCompany();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(30);
				krxBasicInfoEtf();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(31);
				krxItemInfoCompany();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(32);
				krxItemInfoEtf();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(33);
				krxPriceCompany();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(34);
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
		public WordContext code;
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
			match(WORD);
			setState(43);
			match(WORD);
			setState(44);
			match(WORD);
			setState(45);
			match(WORD);
			setState(46);
			match(WORD);
			setState(47);
			match(WORD);
			setState(48);
			match(TAB);
			setState(49);
			match(WORD);
			setState(50);
			match(NEWLINE);
			setState(282); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(271); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(55); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(51);
									word();
									setState(52);
									match(TAB);
									setState(53);
									match(NEWLINE);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(57); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(59);
							word();
							setState(60);
							match(TAB);
							setState(61);
							match(TAB);
							setState(62);
							match(TAB);
							setState(63);
							match(TAB);
							setState(64);
							match(TAB);
							setState(65);
							match(NEWLINE);
							setState(66);
							word();
							setState(67);
							match(TAB);
							setState(68);
							match(TAB);
							setState(69);
							match(TAB);
							setState(70);
							match(NEWLINE);
							setState(71);
							word();
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
							match(NEWLINE);
							setState(78);
							word();
							setState(79);
							match(TAB);
							setState(80);
							match(TAB);
							setState(81);
							match(TAB);
							setState(82);
							match(TAB);
							setState(83);
							match(TAB);
							setState(84);
							match(NEWLINE);
							setState(85);
							word();
							setState(86);
							match(TAB);
							setState(87);
							match(TAB);
							setState(88);
							match(TAB);
							setState(89);
							match(TAB);
							setState(90);
							match(NEWLINE);
							setState(91);
							word();
							setState(92);
							match(TAB);
							setState(93);
							match(NEWLINE);
							setState(94);
							word();
							setState(95);
							match(TAB);
							setState(96);
							match(TAB);
							setState(97);
							match(TAB);
							setState(98);
							match(TAB);
							setState(99);
							match(TAB);
							setState(100);
							match(NEWLINE);
							setState(101);
							word();
							setState(102);
							match(TAB);
							setState(103);
							match(TAB);
							setState(104);
							match(TAB);
							setState(105);
							match(NEWLINE);
							setState(106);
							word();
							setState(107);
							match(TAB);
							setState(108);
							match(TAB);
							setState(109);
							match(TAB);
							setState(110);
							match(TAB);
							setState(111);
							match(TAB);
							setState(112);
							match(NEWLINE);
							setState(113);
							word();
							setState(114);
							match(TAB);
							setState(115);
							match(TAB);
							setState(116);
							match(TAB);
							setState(117);
							match(TAB);
							setState(118);
							match(TAB);
							setState(119);
							match(NEWLINE);
							setState(120);
							word();
							setState(121);
							match(TAB);
							setState(122);
							match(TAB);
							setState(123);
							match(TAB);
							setState(124);
							match(TAB);
							setState(125);
							match(NEWLINE);
							setState(126);
							word();
							setState(127);
							match(TAB);
							setState(128);
							match(NEWLINE);
							setState(129);
							word();
							setState(130);
							match(TAB);
							setState(131);
							match(NEWLINE);
							setState(132);
							word();
							setState(133);
							match(TAB);
							setState(134);
							match(NEWLINE);
							setState(135);
							word();
							setState(136);
							match(TAB);
							setState(137);
							match(NEWLINE);
							setState(138);
							word();
							setState(139);
							match(TAB);
							setState(140);
							match(TAB);
							setState(141);
							match(TAB);
							setState(142);
							match(TAB);
							setState(143);
							match(TAB);
							setState(144);
							match(NEWLINE);
							setState(145);
							word();
							setState(146);
							match(TAB);
							setState(147);
							match(TAB);
							setState(148);
							match(TAB);
							setState(149);
							match(NEWLINE);
							setState(150);
							word();
							setState(151);
							match(TAB);
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
							word();
							setState(158);
							match(TAB);
							setState(159);
							match(TAB);
							setState(160);
							match(TAB);
							setState(161);
							match(TAB);
							setState(162);
							match(TAB);
							setState(163);
							match(NEWLINE);
							setState(164);
							word();
							setState(165);
							match(TAB);
							setState(166);
							match(TAB);
							setState(167);
							match(TAB);
							setState(168);
							match(TAB);
							setState(169);
							match(NEWLINE);
							setState(170);
							word();
							setState(171);
							match(TAB);
							setState(172);
							match(NEWLINE);
							setState(173);
							word();
							setState(174);
							match(TAB);
							setState(175);
							match(NEWLINE);
							setState(176);
							word();
							setState(177);
							match(TAB);
							setState(178);
							match(NEWLINE);
							setState(179);
							word();
							setState(180);
							match(TAB);
							setState(181);
							match(TAB);
							setState(182);
							match(TAB);
							setState(183);
							match(TAB);
							setState(184);
							match(TAB);
							setState(185);
							match(NEWLINE);
							setState(186);
							word();
							setState(187);
							match(TAB);
							setState(188);
							match(TAB);
							setState(189);
							match(TAB);
							setState(190);
							match(NEWLINE);
							setState(191);
							word();
							setState(192);
							match(TAB);
							setState(193);
							match(TAB);
							setState(194);
							match(TAB);
							setState(195);
							match(TAB);
							setState(196);
							match(TAB);
							setState(197);
							match(NEWLINE);
							setState(198);
							word();
							setState(199);
							match(TAB);
							setState(200);
							match(TAB);
							setState(201);
							match(TAB);
							setState(202);
							match(TAB);
							setState(203);
							match(TAB);
							setState(204);
							match(NEWLINE);
							setState(205);
							word();
							setState(206);
							match(TAB);
							setState(207);
							match(TAB);
							setState(208);
							match(TAB);
							setState(209);
							match(TAB);
							setState(210);
							match(NEWLINE);
							setState(211);
							word();
							setState(212);
							match(TAB);
							setState(213);
							match(WORD);
							setState(214);
							match(NEWLINE);
							setState(215);
							word();
							setState(216);
							match(TAB);
							setState(217);
							match(NEWLINE);
							setState(267); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(218);
									((KrxPriceCompanyContext)_localctx).code = word();
									setState(219);
									match(TAB);
									setState(220);
									((KrxPriceCompanyContext)_localctx).base = match(DATE);
									setState(221);
									match(NEWLINE);
									setState(222);
									word();
									setState(223);
									match(TAB);
									setState(224);
									((KrxPriceCompanyContext)_localctx).closing = match(NUMBER);
									setState(225);
									match(NEWLINE);
									setState(226);
									word();
									setState(227);
									match(TAB);
									setState(228);
									match(NUMBER);
									setState(229);
									match(NEWLINE);
									setState(230);
									word();
									setState(231);
									match(TAB);
									setState(232);
									match(NUMBER);
									setState(233);
									match(NEWLINE);
									setState(234);
									word();
									setState(235);
									match(TAB);
									setState(236);
									((KrxPriceCompanyContext)_localctx).market = match(NUMBER);
									setState(237);
									match(NEWLINE);
									setState(238);
									word();
									setState(239);
									match(TAB);
									setState(240);
									((KrxPriceCompanyContext)_localctx).high = match(NUMBER);
									setState(241);
									match(NEWLINE);
									setState(242);
									word();
									setState(243);
									match(TAB);
									setState(244);
									((KrxPriceCompanyContext)_localctx).low = match(NUMBER);
									setState(245);
									match(NEWLINE);
									setState(246);
									word();
									setState(247);
									match(TAB);
									setState(248);
									((KrxPriceCompanyContext)_localctx).volume = match(NUMBER);
									setState(249);
									match(NEWLINE);
									setState(250);
									word();
									setState(251);
									match(TAB);
									setState(252);
									match(NUMBER);
									setState(253);
									match(NEWLINE);
									setState(254);
									word();
									setState(255);
									match(TAB);
									setState(256);
									match(NUMBER);
									setState(257);
									match(NEWLINE);
									setState(258);
									word();
									setState(259);
									match(TAB);
									setState(260);
									((KrxPriceCompanyContext)_localctx).volumeOfListedShares = match(NUMBER);
									setState(261);
									match(NEWLINE);
									setState(262);
									word();
									setState(263);
									match(TAB);
									setState(264);
									match(NEWLINE);

														ParserService.price(20240112
															, (((KrxPriceCompanyContext)_localctx).code!=null?_input.getText(((KrxPriceCompanyContext)_localctx).code.start,((KrxPriceCompanyContext)_localctx).code.stop):null)
															, (((KrxPriceCompanyContext)_localctx).base!=null?((KrxPriceCompanyContext)_localctx).base.getText():null), (((KrxPriceCompanyContext)_localctx).closing!=null?((KrxPriceCompanyContext)_localctx).closing.getText():null), (((KrxPriceCompanyContext)_localctx).market!=null?((KrxPriceCompanyContext)_localctx).market.getText():null), (((KrxPriceCompanyContext)_localctx).high!=null?((KrxPriceCompanyContext)_localctx).high.getText():null), (((KrxPriceCompanyContext)_localctx).low!=null?((KrxPriceCompanyContext)_localctx).low.getText():null), (((KrxPriceCompanyContext)_localctx).volume!=null?((KrxPriceCompanyContext)_localctx).volume.getText():null)
														);
													
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(269); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(273); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(275);
					match(WORD);
					setState(276);
					match(TAB);
					setState(277);
					match(WORD);
					setState(278);
					match(TAB);
					setState(279);
					match(DATE);
					setState(280);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(284); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(286);
			match(KEYWORD);
			setState(287);
			match(TAB);
			setState(288);
			match(WORD);
			setState(289);
			match(TAB);
			setState(290);
			match(WORD);
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
			match(WORD);
			setState(297);
			match(TAB);
			setState(298);
			match(WORD);
			setState(299);
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
			setState(301);
			match(KEYWORD);
			setState(302);
			match(TAB);
			setState(303);
			match(WORD);
			setState(304);
			match(TAB);
			setState(305);
			match(WORD);
			setState(306);
			match(WORD);
			setState(307);
			match(WORD);
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
			setState(431); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(420); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(315);
							word();
							setState(316);
							match(TAB);
							setState(317);
							match(NEWLINE);
							setState(324); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(318);
									word();
									setState(319);
									match(TAB);
									setState(320);
									match(TAB);
									setState(321);
									match(TAB);
									setState(322);
									match(NEWLINE);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(326); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(328);
							word();
							setState(329);
							match(TAB);
							setState(330);
							match(TAB);
							setState(331);
							match(TAB);
							setState(332);
							match(WORD);
							setState(333);
							match(NEWLINE);
							setState(334);
							word();
							setState(335);
							match(TAB);
							setState(336);
							match(TAB);
							setState(337);
							match(TAB);
							setState(338);
							match(NEWLINE);
							setState(416); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(339);
									((KrxPriceEtfContext)_localctx).code = word();
									setState(340);
									match(TAB);
									setState(341);
									((KrxPriceEtfContext)_localctx).base = match(DATE);
									setState(342);
									match(NEWLINE);
									setState(343);
									word();
									setState(344);
									match(TAB);
									setState(345);
									((KrxPriceEtfContext)_localctx).closing = match(NUMBER);
									setState(346);
									match(NEWLINE);
									setState(347);
									word();
									setState(348);
									match(TAB);
									setState(349);
									match(NUMBER);
									setState(350);
									match(NEWLINE);
									setState(351);
									word();
									setState(352);
									match(TAB);
									setState(353);
									match(NUMBER);
									setState(354);
									match(NEWLINE);
									setState(355);
									word();
									setState(356);
									match(TAB);
									setState(357);
									((KrxPriceEtfContext)_localctx).nav = match(NUMBER);
									setState(358);
									match(NEWLINE);
									setState(359);
									word();
									setState(360);
									match(TAB);
									setState(361);
									((KrxPriceEtfContext)_localctx).market = match(NUMBER);
									setState(362);
									match(NEWLINE);
									setState(363);
									word();
									setState(364);
									match(TAB);
									setState(365);
									((KrxPriceEtfContext)_localctx).high = match(NUMBER);
									setState(366);
									match(NEWLINE);
									setState(367);
									word();
									setState(368);
									match(TAB);
									setState(369);
									((KrxPriceEtfContext)_localctx).low = match(NUMBER);
									setState(370);
									match(NEWLINE);
									setState(371);
									word();
									setState(372);
									match(TAB);
									setState(373);
									((KrxPriceEtfContext)_localctx).volume = match(NUMBER);
									setState(374);
									match(NEWLINE);
									setState(375);
									word();
									setState(376);
									match(TAB);
									setState(377);
									match(NUMBER);
									setState(378);
									match(NEWLINE);
									setState(379);
									word();
									setState(380);
									match(TAB);
									setState(381);
									match(NUMBER);
									setState(382);
									match(NEWLINE);
									setState(383);
									word();
									setState(384);
									match(TAB);
									setState(385);
									match(NUMBER);
									setState(386);
									match(NEWLINE);
									setState(387);
									word();
									setState(388);
									match(TAB);
									setState(389);
									((KrxPriceEtfContext)_localctx).volumeOfListedShares = match(NUMBER);
									setState(390);
									match(NEWLINE);
									setState(391);
									word();
									setState(392);
									match(TAB);
									setState(394); 
									_errHandler.sync(this);
									_la = _input.LA(1);
									do {
										{
										{
										setState(393);
										word();
										}
										}
										setState(396); 
										_errHandler.sync(this);
										_la = _input.LA(1);
									} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
									setState(398);
									match(NEWLINE);
									setState(399);
									word();
									setState(400);
									match(TAB);
									setState(401);
									word();
									setState(402);
									match(NEWLINE);
									setState(403);
									word();
									setState(404);
									match(TAB);
									setState(405);
									word();
									setState(406);
									match(NEWLINE);
									setState(407);
									word();
									setState(408);
									match(TAB);
									setState(409);
									word();
									setState(410);
									match(NEWLINE);
									setState(411);
									word();
									setState(412);
									match(TAB);
									setState(413);
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
								setState(418); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(422); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(424);
					match(WORD);
					setState(425);
					match(TAB);
					setState(426);
					match(WORD);
					setState(427);
					match(TAB);
					setState(428);
					match(DATE);
					setState(429);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(433); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(435);
			match(KEYWORD);
			setState(436);
			match(TAB);
			setState(437);
			match(WORD);
			setState(438);
			match(TAB);
			setState(439);
			match(WORD);
			setState(440);
			match(WORD);
			setState(441);
			match(WORD);
			setState(442);
			match(WORD);
			setState(443);
			match(WORD);
			setState(444);
			match(WORD);
			setState(445);
			match(WORD);
			setState(446);
			match(TAB);
			setState(447);
			match(WORD);
			setState(448);
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
		enterRule(_localctx, 6, RULE_krxItemInfoCompany);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(KEYWORD);
			setState(451);
			match(TAB);
			setState(452);
			match(WORD);
			setState(453);
			match(TAB);
			setState(454);
			match(WORD);
			setState(455);
			match(WORD);
			setState(456);
			match(WORD);
			setState(457);
			match(WORD);
			setState(458);
			match(WORD);
			setState(459);
			match(WORD);
			setState(460);
			match(TAB);
			setState(461);
			match(WORD);
			setState(462);
			match(NEWLINE);
			setState(463);
			match(KEYWORD);
			setState(464);
			match(TAB);
			setState(465);
			((KrxItemInfoCompanyContext)_localctx).type = match(WORD);
			setState(466);
			match(NEWLINE);
			setState(467);
			match(WORD);
			setState(468);
			match(TAB);
			setState(469);
			match(WORD);
			setState(470);
			match(TAB);
			setState(471);
			((KrxItemInfoCompanyContext)_localctx).symbol = word();
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(472);
				((KrxItemInfoCompanyContext)_localctx).symbol1 = word();
				}
				break;
			}
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(475);
				((KrxItemInfoCompanyContext)_localctx).symbol2 = word();
				}
				break;
			}
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(478);
				((KrxItemInfoCompanyContext)_localctx).symbol3 = word();
				}
				break;
			}
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(481);
				((KrxItemInfoCompanyContext)_localctx).symbol4 = word();
				}
				break;
			}
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(484);
				((KrxItemInfoCompanyContext)_localctx).symbol5 = word();
				}
				break;
			}
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(487);
				((KrxItemInfoCompanyContext)_localctx).symbol6 = word();
				}
				break;
			}
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(490);
				((KrxItemInfoCompanyContext)_localctx).symbol7 = word();
				}
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(496);
			match(TAB);
			setState(498); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(497);
				word();
				}
				}
				setState(500); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(502);
			match(TAB);
			setState(503);
			match(NEWLINE);
			setState(504);
			match(WORD);
			setState(505);
			match(TAB);
			setState(506);
			match(WORD);
			setState(507);
			match(TAB);
			setState(508);
			match(WORD);
			setState(509);
			match(TAB);
			setState(510);
			((KrxItemInfoCompanyContext)_localctx).code = word();
			setState(511);
			match(TAB);
			setState(512);
			match(NEWLINE);
			setState(513);
			match(WORD);
			setState(514);
			match(TAB);
			setState(515);
			match(WORD);
			setState(516);
			match(TAB);
			setState(517);
			word();
			setState(518);
			match(TAB);
			setState(519);
			match(NUMBER);
			setState(520);
			match(TAB);
			setState(521);
			match(NEWLINE);
			setState(522);
			match(WORD);
			setState(523);
			match(TAB);
			setState(524);
			match(WORD);
			setState(525);
			match(TAB);
			setState(526);
			((KrxItemInfoCompanyContext)_localctx).volumeOfListedShares = match(NUMBER);
			setState(527);
			match(TAB);
			setState(528);
			match(WORD);
			setState(529);
			match(TAB);
			setState(530);
			match(NEWLINE);
			setState(531);
			match(WORD);
			setState(532);
			match(TAB);
			setState(533);
			match(WORD);
			setState(534);
			match(TAB);
			setState(535);
			((KrxItemInfoCompanyContext)_localctx).ipo = match(DATE);
			setState(536);
			match(TAB);
			setState(537);
			match(DATE);
			setState(538);
			match(TAB);
			setState(539);
			match(NEWLINE);
			setState(540);
			match(WORD);
			setState(541);
			match(TAB);
			setState(542);
			match(WORD);
			setState(543);
			match(TAB);
			setState(544);
			((KrxItemInfoCompanyContext)_localctx).category = word();
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(545);
				((KrxItemInfoCompanyContext)_localctx).category1 = word();
				}
				break;
			}
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(548);
				((KrxItemInfoCompanyContext)_localctx).category2 = word();
				}
				break;
			}
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(551);
				((KrxItemInfoCompanyContext)_localctx).category3 = word();
				}
				break;
			}
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(554);
				((KrxItemInfoCompanyContext)_localctx).category4 = word();
				}
				break;
			}
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(557);
				((KrxItemInfoCompanyContext)_localctx).category5 = word();
				}
				break;
			}
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(560);
				((KrxItemInfoCompanyContext)_localctx).category6 = word();
				}
				break;
			}
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(563);
				((KrxItemInfoCompanyContext)_localctx).category7 = word();
				}
				}
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(569);
			match(TAB);
			setState(571); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(570);
				word();
				}
				}
				setState(573); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(575);
			match(TAB);
			setState(576);
			match(NEWLINE);
			setState(577);
			match(WORD);
			setState(578);
			match(TAB);
			setState(580); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(579);
				word();
				}
				}
				setState(582); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(584);
			match(TAB);
			setState(585);
			match(NEWLINE);
			setState(586);
			match(WORD);
			setState(587);
			match(TAB);
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(588);
				match(NUMBER);
				setState(589);
				match(TAB);
				}
				break;
			}
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(592);
				word();
				}
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(598);
			match(TAB);
			setState(599);
			match(NEWLINE);
			setState(600);
			match(WORD);
			setState(601);
			match(TAB);
			setState(602);
			match(WORD);
			setState(603);
			match(TAB);
			setState(604);
			match(NEWLINE);
			setState(605);
			match(WORD);
			setState(606);
			match(TAB);
			setState(607);
			match(WORD);
			setState(608);
			match(TAB);
			setState(609);
			match(DATE);
			setState(610);
			match(NEWLINE);
			setState(611);
			match(KEYWORD);
			setState(612);
			match(TAB);
			setState(613);
			match(WORD);
			setState(614);
			match(TAB);
			setState(615);
			match(WORD);
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
		enterRule(_localctx, 8, RULE_krxItemInfoEtf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(KEYWORD);
			setState(627);
			match(TAB);
			setState(628);
			match(WORD);
			setState(629);
			match(TAB);
			setState(630);
			match(WORD);
			setState(631);
			match(WORD);
			setState(632);
			match(WORD);
			setState(633);
			match(WORD);
			setState(634);
			match(WORD);
			setState(635);
			match(WORD);
			setState(636);
			match(TAB);
			setState(637);
			match(WORD);
			setState(638);
			match(NEWLINE);
			setState(639);
			match(KEYWORD);
			setState(640);
			match(TAB);
			setState(641);
			((KrxItemInfoEtfContext)_localctx).symbol = word();
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(642);
				((KrxItemInfoEtfContext)_localctx).symbol1 = word();
				}
				break;
			}
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(645);
				((KrxItemInfoEtfContext)_localctx).symbol2 = word();
				}
				break;
			}
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(648);
				((KrxItemInfoEtfContext)_localctx).symbol3 = word();
				}
				break;
			}
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(651);
				((KrxItemInfoEtfContext)_localctx).symbol4 = word();
				}
				break;
			}
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(654);
				((KrxItemInfoEtfContext)_localctx).symbol5 = word();
				}
				break;
			}
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(657);
				((KrxItemInfoEtfContext)_localctx).symbol6 = word();
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
				((KrxItemInfoEtfContext)_localctx).symbol7 = word();
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
			match(WORD);
			setState(670);
			match(TAB);
			setState(672); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(671);
				word();
				}
				}
				setState(674); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(676);
			match(TAB);
			setState(678); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(677);
				word();
				}
				}
				setState(680); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(682);
			match(TAB);
			setState(683);
			match(NEWLINE);
			setState(684);
			match(WORD);
			setState(685);
			match(TAB);
			setState(686);
			match(WORD);
			setState(687);
			match(TAB);
			setState(688);
			match(WORD);
			setState(689);
			match(TAB);
			setState(690);
			((KrxItemInfoEtfContext)_localctx).code = word();
			setState(691);
			match(TAB);
			setState(692);
			match(NEWLINE);
			setState(693);
			match(WORD);
			setState(694);
			match(TAB);
			setState(695);
			match(WORD);
			setState(696);
			match(TAB);
			setState(698); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(697);
				word();
				}
				}
				setState(700); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(702);
			match(TAB);
			setState(704); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(703);
				word();
				}
				}
				setState(706); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(708);
			match(TAB);
			setState(709);
			match(NEWLINE);
			setState(710);
			match(WORD);
			setState(711);
			match(TAB);
			setState(712);
			match(WORD);
			setState(713);
			match(TAB);
			setState(714);
			match(NUMBER);
			setState(715);
			match(TAB);
			setState(716);
			((KrxItemInfoEtfContext)_localctx).volumeOfListedShares = match(NUMBER);
			setState(717);
			match(TAB);
			setState(718);
			match(NEWLINE);
			setState(719);
			match(WORD);
			setState(720);
			match(TAB);
			setState(721);
			match(WORD);
			setState(722);
			match(TAB);
			setState(723);
			match(NUMBER);
			setState(724);
			match(TAB);
			setState(725);
			((KrxItemInfoEtfContext)_localctx).ipo = match(DATE);
			setState(726);
			match(TAB);
			setState(727);
			match(NEWLINE);
			setState(728);
			match(WORD);
			setState(729);
			match(TAB);
			setState(730);
			match(WORD);
			setState(731);
			match(TAB);
			setState(732);
			match(WORD);
			setState(733);
			match(TAB);
			setState(734);
			match(WORD);
			setState(735);
			match(TAB);
			setState(736);
			match(NEWLINE);
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
			match(NEWLINE);
			setState(746);
			match(WORD);
			setState(747);
			match(TAB);
			setState(748);
			match(WORD);
			setState(749);
			match(TAB);
			setState(750);
			match(WORD);
			setState(751);
			match(TAB);
			setState(752);
			((KrxItemInfoEtfContext)_localctx).category = word();
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(753);
				((KrxItemInfoEtfContext)_localctx).category1 = word();
				}
				break;
			}
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(756);
				((KrxItemInfoEtfContext)_localctx).category2 = word();
				}
				break;
			}
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(759);
				((KrxItemInfoEtfContext)_localctx).category3 = word();
				}
				break;
			}
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(762);
				((KrxItemInfoEtfContext)_localctx).category4 = word();
				}
				break;
			}
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(765);
				((KrxItemInfoEtfContext)_localctx).category5 = word();
				}
				break;
			}
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(768);
				((KrxItemInfoEtfContext)_localctx).category6 = word();
				}
				break;
			}
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(771);
				((KrxItemInfoEtfContext)_localctx).category7 = word();
				}
				}
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(777);
			match(TAB);
			setState(778);
			match(NEWLINE);
			setState(779);
			match(WORD);
			setState(780);
			match(WORD);
			setState(781);
			match(TAB);
			setState(783); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(782);
				word();
				}
				}
				setState(785); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(787);
			match(TAB);
			setState(788);
			match(NEWLINE);
			setState(789);
			match(WORD);
			setState(790);
			match(TAB);
			setState(792); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(791);
				word();
				}
				}
				setState(794); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(796);
			match(TAB);
			setState(797);
			match(NEWLINE);
			setState(798);
			match(WORD);
			setState(799);
			match(TAB);
			setState(800);
			match(WORD);
			setState(801);
			match(TAB);
			setState(802);
			match(DATE);
			setState(803);
			match(NEWLINE);
			setState(804);
			match(KEYWORD);
			setState(805);
			match(TAB);
			setState(806);
			match(WORD);
			setState(807);
			match(TAB);
			setState(808);
			match(WORD);
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
		enterRule(_localctx, 10, RULE_krxBasicInfoEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(KEYWORD);
			setState(820);
			match(TAB);
			setState(821);
			match(WORD);
			setState(822);
			match(TAB);
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
			setState(1004); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(832);
				match(WORD);
				setState(833);
				match(TAB);
				setState(834);
				match(NEWLINE);
				setState(840); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(835);
						match(WORD);
						setState(836);
						match(TAB);
						setState(837);
						match(TAB);
						setState(838);
						match(TAB);
						setState(839);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(842); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(844);
				match(WORD);
				setState(845);
				match(TAB);
				setState(846);
				match(TAB);
				setState(847);
				match(TAB);
				setState(848);
				match(WORD);
				setState(849);
				match(NEWLINE);
				setState(850);
				match(WORD);
				setState(851);
				match(TAB);
				setState(852);
				match(TAB);
				setState(853);
				match(TAB);
				setState(854);
				match(NEWLINE);
				setState(993); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						{
						setState(855);
						match(WORD);
						setState(856);
						match(TAB);
						setState(857);
						match(WORD);
						setState(858);
						match(NEWLINE);
						setState(859);
						match(WORD);
						setState(860);
						match(TAB);
						setState(861);
						((KrxBasicInfoEtfContext)_localctx).code = word();
						setState(862);
						match(NEWLINE);
						setState(863);
						match(WORD);
						setState(864);
						match(TAB);
						setState(865);
						match(NEWLINE);
						setState(866);
						match(WORD);
						setState(867);
						match(TAB);
						setState(868);
						match(TAB);
						setState(870); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(869);
							word();
							}
							}
							setState(872); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(874);
						match(NEWLINE);
						setState(875);
						match(WORD);
						setState(876);
						match(TAB);
						setState(877);
						match(TAB);
						setState(878);
						((KrxBasicInfoEtfContext)_localctx).symbol = word();
						setState(880);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
						case 1:
							{
							setState(879);
							((KrxBasicInfoEtfContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(883);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
						case 1:
							{
							setState(882);
							((KrxBasicInfoEtfContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(886);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
						case 1:
							{
							setState(885);
							((KrxBasicInfoEtfContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(889);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
						case 1:
							{
							setState(888);
							((KrxBasicInfoEtfContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(892);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
						case 1:
							{
							setState(891);
							((KrxBasicInfoEtfContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(895);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
						case 1:
							{
							setState(894);
							((KrxBasicInfoEtfContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(900);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(897);
							((KrxBasicInfoEtfContext)_localctx).symbol7 = word();
							}
							}
							setState(902);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(903);
						match(NEWLINE);
						setState(904);
						match(WORD);
						setState(905);
						match(TAB);
						setState(906);
						match(NEWLINE);
						setState(907);
						match(WORD);
						setState(908);
						match(TAB);
						setState(910); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(909);
							word();
							}
							}
							setState(912); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(914);
						match(NEWLINE);
						setState(915);
						match(WORD);
						setState(916);
						match(TAB);
						setState(917);
						((KrxBasicInfoEtfContext)_localctx).ipo = match(DATE);
						setState(918);
						match(NEWLINE);
						setState(919);
						match(WORD);
						setState(920);
						match(TAB);
						setState(922); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(921);
							word();
							}
							}
							setState(924); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(926);
						match(NEWLINE);
						setState(927);
						match(WORD);
						setState(928);
						match(TAB);
						setState(930); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(929);
							word();
							}
							}
							setState(932); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(934);
						match(NEWLINE);
						setState(935);
						match(WORD);
						setState(936);
						match(TAB);
						setState(938); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(937);
							word();
							}
							}
							setState(940); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(942);
						match(NEWLINE);
						setState(943);
						match(WORD);
						setState(944);
						match(TAB);
						setState(945);
						match(WORD);
						setState(946);
						match(NEWLINE);
						setState(947);
						match(WORD);
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
						match(WORD);
						setState(954);
						match(NEWLINE);
						setState(955);
						match(WORD);
						setState(956);
						match(TAB);
						setState(957);
						match(TAB);
						setState(958);
						match(WORD);
						setState(959);
						match(NEWLINE);
						setState(960);
						match(WORD);
						setState(961);
						match(TAB);
						setState(962);
						match(TAB);
						setState(963);
						match(NEWLINE);
						setState(964);
						match(WORD);
						setState(965);
						match(TAB);
						setState(966);
						((KrxBasicInfoEtfContext)_localctx).volumeOfListedShares = match(NUMBER);
						setState(967);
						match(NEWLINE);
						setState(968);
						match(WORD);
						setState(969);
						match(TAB);
						setState(971); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(970);
							word();
							}
							}
							setState(973); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(975);
						match(NEWLINE);
						setState(976);
						match(WORD);
						setState(977);
						match(TAB);
						setState(978);
						match(NUMBER);
						setState(979);
						match(NEWLINE);
						setState(980);
						match(WORD);
						setState(981);
						match(TAB);
						setState(982);
						((KrxBasicInfoEtfContext)_localctx).fee = match(NUMBER);
						setState(983);
						match(NEWLINE);
						setState(984);
						match(WORD);
						setState(985);
						match(TAB);
						setState(986);
						match(WORD);
						setState(987);
						match(NEWLINE);
						setState(988);
						match(WORD);
						setState(989);
						match(TAB);
						setState(990);
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
					setState(995); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(997);
				match(WORD);
				setState(998);
				match(TAB);
				setState(999);
				match(WORD);
				setState(1000);
				match(TAB);
				setState(1001);
				match(DATE);
				setState(1002);
				match(NEWLINE);
				}
				}
				setState(1006); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1008);
			match(KEYWORD);
			setState(1009);
			match(TAB);
			setState(1010);
			match(WORD);
			setState(1011);
			match(TAB);
			setState(1012);
			match(WORD);
			setState(1013);
			match(WORD);
			setState(1014);
			match(WORD);
			setState(1015);
			match(WORD);
			setState(1016);
			match(WORD);
			setState(1017);
			match(WORD);
			setState(1018);
			match(TAB);
			setState(1019);
			match(WORD);
			setState(1020);
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
			setState(1022);
			match(KEYWORD);
			setState(1023);
			match(TAB);
			setState(1024);
			match(WORD);
			setState(1025);
			match(TAB);
			setState(1026);
			match(WORD);
			setState(1027);
			match(WORD);
			setState(1028);
			match(WORD);
			setState(1029);
			match(WORD);
			setState(1030);
			match(WORD);
			setState(1031);
			match(WORD);
			setState(1032);
			match(TAB);
			setState(1033);
			match(WORD);
			setState(1034);
			match(NEWLINE);
			setState(1472); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1038); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1035);
							match(KEYWORD);
							setState(1036);
							match(TAB);
							setState(1037);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1040); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(1042);
					match(KEYWORD);
					setState(1043);
					match(TAB);
					setState(1044);
					match(TAB);
					setState(1045);
					match(TAB);
					setState(1046);
					match(TAB);
					setState(1047);
					match(TAB);
					setState(1048);
					match(NEWLINE);
					setState(1049);
					match(KEYWORD);
					setState(1050);
					match(TAB);
					setState(1051);
					match(TAB);
					setState(1052);
					match(TAB);
					setState(1053);
					match(NEWLINE);
					setState(1054);
					match(KEYWORD);
					setState(1055);
					match(TAB);
					setState(1056);
					match(TAB);
					setState(1057);
					match(TAB);
					setState(1058);
					match(TAB);
					setState(1059);
					match(TAB);
					setState(1060);
					match(NEWLINE);
					setState(1061);
					match(KEYWORD);
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
					match(NEWLINE);
					setState(1068);
					match(KEYWORD);
					setState(1069);
					match(TAB);
					setState(1070);
					match(TAB);
					setState(1071);
					match(TAB);
					setState(1072);
					match(TAB);
					setState(1073);
					match(NEWLINE);
					setState(1074);
					match(KEYWORD);
					setState(1075);
					match(TAB);
					setState(1076);
					match(NEWLINE);
					setState(1077);
					match(KEYWORD);
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
					match(NEWLINE);
					setState(1084);
					match(KEYWORD);
					setState(1085);
					match(TAB);
					setState(1086);
					match(TAB);
					setState(1087);
					match(TAB);
					setState(1088);
					match(TAB);
					setState(1089);
					match(NEWLINE);
					setState(1090);
					match(KEYWORD);
					setState(1091);
					match(TAB);
					setState(1092);
					match(TAB);
					setState(1093);
					match(TAB);
					setState(1094);
					match(NEWLINE);
					setState(1095);
					match(KEYWORD);
					setState(1096);
					match(TAB);
					setState(1097);
					match(TAB);
					setState(1098);
					match(TAB);
					setState(1099);
					match(NEWLINE);
					setState(1100);
					match(KEYWORD);
					setState(1101);
					match(TAB);
					setState(1102);
					match(TAB);
					setState(1103);
					match(TAB);
					setState(1104);
					match(TAB);
					setState(1105);
					match(TAB);
					setState(1106);
					match(NEWLINE);
					setState(1107);
					match(KEYWORD);
					setState(1108);
					match(TAB);
					setState(1109);
					match(TAB);
					setState(1110);
					match(TAB);
					setState(1111);
					match(TAB);
					setState(1112);
					match(TAB);
					setState(1113);
					match(NEWLINE);
					setState(1114);
					match(KEYWORD);
					setState(1115);
					match(TAB);
					setState(1116);
					match(TAB);
					setState(1117);
					match(NEWLINE);
					setState(1118);
					match(KEYWORD);
					setState(1119);
					match(TAB);
					setState(1120);
					match(NEWLINE);
					setState(1121);
					match(KEYWORD);
					setState(1122);
					match(TAB);
					setState(1123);
					match(TAB);
					setState(1124);
					match(TAB);
					setState(1125);
					match(TAB);
					setState(1126);
					match(TAB);
					setState(1127);
					match(NEWLINE);
					setState(1128);
					match(KEYWORD);
					setState(1129);
					match(TAB);
					setState(1130);
					match(TAB);
					setState(1131);
					match(TAB);
					setState(1132);
					match(NEWLINE);
					setState(1133);
					match(KEYWORD);
					setState(1134);
					match(TAB);
					setState(1135);
					match(TAB);
					setState(1136);
					match(TAB);
					setState(1137);
					match(TAB);
					setState(1138);
					match(TAB);
					setState(1139);
					match(NEWLINE);
					setState(1140);
					match(KEYWORD);
					setState(1141);
					match(TAB);
					setState(1142);
					match(TAB);
					setState(1143);
					match(TAB);
					setState(1144);
					match(TAB);
					setState(1145);
					match(TAB);
					setState(1146);
					match(NEWLINE);
					setState(1147);
					match(KEYWORD);
					setState(1148);
					match(TAB);
					setState(1149);
					match(TAB);
					setState(1150);
					match(TAB);
					setState(1151);
					match(TAB);
					setState(1152);
					match(NEWLINE);
					setState(1153);
					match(KEYWORD);
					setState(1154);
					match(TAB);
					setState(1155);
					match(NEWLINE);
					setState(1156);
					match(KEYWORD);
					setState(1157);
					match(TAB);
					setState(1158);
					match(TAB);
					setState(1159);
					match(TAB);
					setState(1160);
					match(TAB);
					setState(1161);
					match(TAB);
					setState(1162);
					match(NEWLINE);
					setState(1163);
					match(KEYWORD);
					setState(1164);
					match(TAB);
					setState(1165);
					match(TAB);
					setState(1166);
					match(TAB);
					setState(1167);
					match(NEWLINE);
					setState(1168);
					match(KEYWORD);
					setState(1169);
					match(TAB);
					setState(1170);
					match(TAB);
					setState(1171);
					match(TAB);
					setState(1172);
					match(TAB);
					setState(1173);
					match(TAB);
					setState(1174);
					match(NEWLINE);
					setState(1175);
					match(KEYWORD);
					setState(1176);
					match(TAB);
					setState(1177);
					match(TAB);
					setState(1178);
					match(TAB);
					setState(1179);
					match(TAB);
					setState(1180);
					match(TAB);
					setState(1181);
					match(NEWLINE);
					setState(1182);
					match(KEYWORD);
					setState(1183);
					match(TAB);
					setState(1184);
					match(TAB);
					setState(1185);
					match(TAB);
					setState(1186);
					match(TAB);
					setState(1187);
					match(NEWLINE);
					setState(1188);
					match(KEYWORD);
					setState(1189);
					match(TAB);
					setState(1190);
					match(NEWLINE);
					setState(1191);
					match(KEYWORD);
					setState(1192);
					match(TAB);
					setState(1193);
					match(TAB);
					setState(1194);
					match(TAB);
					setState(1195);
					match(TAB);
					setState(1196);
					match(TAB);
					setState(1197);
					match(NEWLINE);
					setState(1198);
					match(KEYWORD);
					setState(1199);
					match(TAB);
					setState(1200);
					match(TAB);
					setState(1201);
					match(TAB);
					setState(1202);
					match(NEWLINE);
					setState(1203);
					match(KEYWORD);
					setState(1204);
					match(TAB);
					setState(1205);
					match(TAB);
					setState(1206);
					match(TAB);
					setState(1207);
					match(TAB);
					setState(1208);
					match(TAB);
					setState(1209);
					match(NEWLINE);
					setState(1210);
					match(KEYWORD);
					setState(1211);
					match(TAB);
					setState(1212);
					match(TAB);
					setState(1213);
					match(TAB);
					setState(1214);
					match(TAB);
					setState(1215);
					match(TAB);
					setState(1216);
					match(NEWLINE);
					setState(1217);
					match(KEYWORD);
					setState(1218);
					match(TAB);
					setState(1219);
					match(TAB);
					setState(1220);
					match(TAB);
					setState(1221);
					match(TAB);
					setState(1222);
					match(NEWLINE);
					setState(1223);
					match(KEYWORD);
					setState(1224);
					match(TAB);
					setState(1225);
					match(NEWLINE);
					setState(1226);
					match(KEYWORD);
					setState(1227);
					match(TAB);
					setState(1228);
					match(NEWLINE);
					setState(1229);
					match(KEYWORD);
					setState(1230);
					match(TAB);
					setState(1231);
					match(TAB);
					setState(1232);
					match(TAB);
					setState(1233);
					match(TAB);
					setState(1234);
					match(TAB);
					setState(1235);
					match(NEWLINE);
					setState(1236);
					match(KEYWORD);
					setState(1237);
					match(TAB);
					setState(1238);
					match(TAB);
					setState(1239);
					match(TAB);
					setState(1240);
					match(NEWLINE);
					setState(1241);
					match(KEYWORD);
					setState(1242);
					match(TAB);
					setState(1243);
					match(TAB);
					setState(1244);
					match(TAB);
					setState(1245);
					match(TAB);
					setState(1246);
					match(TAB);
					setState(1247);
					match(NEWLINE);
					setState(1248);
					match(KEYWORD);
					setState(1249);
					match(TAB);
					setState(1250);
					match(TAB);
					setState(1251);
					match(TAB);
					setState(1252);
					match(TAB);
					setState(1253);
					match(TAB);
					setState(1254);
					match(NEWLINE);
					setState(1255);
					match(KEYWORD);
					setState(1256);
					match(TAB);
					setState(1257);
					match(TAB);
					setState(1258);
					match(TAB);
					setState(1259);
					match(TAB);
					setState(1260);
					match(NEWLINE);
					setState(1261);
					match(KEYWORD);
					setState(1262);
					match(TAB);
					setState(1263);
					match(NEWLINE);
					setState(1264);
					match(KEYWORD);
					setState(1265);
					match(TAB);
					setState(1266);
					match(TAB);
					setState(1267);
					match(TAB);
					setState(1268);
					match(TAB);
					setState(1269);
					match(TAB);
					setState(1270);
					match(NEWLINE);
					setState(1271);
					match(KEYWORD);
					setState(1272);
					match(TAB);
					setState(1273);
					match(TAB);
					setState(1274);
					match(TAB);
					setState(1275);
					match(NEWLINE);
					setState(1276);
					match(KEYWORD);
					setState(1277);
					match(TAB);
					setState(1278);
					match(TAB);
					setState(1279);
					match(TAB);
					setState(1280);
					match(TAB);
					setState(1281);
					match(TAB);
					setState(1282);
					match(NEWLINE);
					setState(1283);
					match(KEYWORD);
					setState(1284);
					match(TAB);
					setState(1285);
					match(TAB);
					setState(1286);
					match(TAB);
					setState(1287);
					match(TAB);
					setState(1288);
					match(TAB);
					setState(1289);
					match(NEWLINE);
					setState(1290);
					match(KEYWORD);
					setState(1291);
					match(TAB);
					setState(1292);
					match(TAB);
					setState(1293);
					match(TAB);
					setState(1294);
					match(TAB);
					setState(1295);
					match(NEWLINE);
					setState(1296);
					match(KEYWORD);
					setState(1297);
					match(TAB);
					setState(1298);
					match(NEWLINE);
					setState(1299);
					match(KEYWORD);
					setState(1300);
					match(TAB);
					setState(1301);
					match(TAB);
					setState(1302);
					match(TAB);
					setState(1303);
					match(TAB);
					setState(1304);
					match(TAB);
					setState(1305);
					match(NEWLINE);
					setState(1306);
					match(KEYWORD);
					setState(1307);
					match(TAB);
					setState(1308);
					match(TAB);
					setState(1309);
					match(TAB);
					setState(1310);
					match(NEWLINE);
					setState(1311);
					match(KEYWORD);
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
					match(KEYWORD);
					setState(1319);
					match(TAB);
					setState(1320);
					match(TAB);
					setState(1321);
					match(TAB);
					setState(1322);
					match(TAB);
					setState(1323);
					match(TAB);
					setState(1324);
					match(NEWLINE);
					setState(1325);
					match(KEYWORD);
					setState(1326);
					match(TAB);
					setState(1327);
					match(TAB);
					setState(1328);
					match(TAB);
					setState(1329);
					match(TAB);
					setState(1330);
					match(NEWLINE);
					setState(1331);
					match(KEYWORD);
					setState(1332);
					match(TAB);
					setState(1333);
					match(WORD);
					setState(1334);
					match(NEWLINE);
					setState(1335);
					match(KEYWORD);
					setState(1336);
					match(TAB);
					setState(1337);
					match(NEWLINE);
					setState(1461); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						{
						setState(1338);
						match(KEYWORD);
						setState(1339);
						match(TAB);
						setState(1340);
						match(WORD);
						setState(1341);
						match(NEWLINE);
						setState(1342);
						match(KEYWORD);
						setState(1343);
						match(TAB);
						setState(1344);
						((KrxBasicInfoCompanyContext)_localctx).code = word();
						setState(1345);
						match(NEWLINE);
						setState(1346);
						match(KEYWORD);
						setState(1347);
						match(TAB);
						setState(1348);
						match(NEWLINE);
						setState(1349);
						match(KEYWORD);
						setState(1350);
						match(TAB);
						setState(1351);
						match(TAB);
						setState(1352);
						match(NEWLINE);
						setState(1353);
						match(KEYWORD);
						setState(1354);
						match(TAB);
						setState(1355);
						match(TAB);
						setState(1356);
						match(TAB);
						setState(1358); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1357);
							word();
							}
							}
							setState(1360); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(1362);
						match(NEWLINE);
						setState(1363);
						match(KEYWORD);
						setState(1364);
						match(TAB);
						setState(1365);
						match(TAB);
						setState(1366);
						match(TAB);
						setState(1367);
						((KrxBasicInfoCompanyContext)_localctx).symbol = word();
						setState(1369);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
						case 1:
							{
							setState(1368);
							((KrxBasicInfoCompanyContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(1372);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
						case 1:
							{
							setState(1371);
							((KrxBasicInfoCompanyContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(1375);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
						case 1:
							{
							setState(1374);
							((KrxBasicInfoCompanyContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(1378);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
						case 1:
							{
							setState(1377);
							((KrxBasicInfoCompanyContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(1381);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
						case 1:
							{
							setState(1380);
							((KrxBasicInfoCompanyContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(1384);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
						case 1:
							{
							setState(1383);
							((KrxBasicInfoCompanyContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(1389);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(1386);
							((KrxBasicInfoCompanyContext)_localctx).symbol7 = word();
							}
							}
							setState(1391);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1392);
						match(NEWLINE);
						setState(1393);
						match(KEYWORD);
						setState(1394);
						match(TAB);
						setState(1395);
						match(TAB);
						setState(1396);
						match(TAB);
						setState(1398); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1397);
							word();
							}
							}
							setState(1400); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(1402);
						match(NEWLINE);
						setState(1403);
						match(KEYWORD);
						setState(1404);
						match(TAB);
						setState(1405);
						match(TAB);
						setState(1406);
						match(TAB);
						setState(1407);
						match(NEWLINE);
						setState(1408);
						match(KEYWORD);
						setState(1409);
						match(TAB);
						setState(1410);
						match(TAB);
						setState(1411);
						match(TAB);
						setState(1412);
						match(NEWLINE);
						setState(1413);
						match(KEYWORD);
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
						((KrxBasicInfoCompanyContext)_localctx).ipo = match(DATE);
						setState(1420);
						match(NEWLINE);
						setState(1421);
						match(KEYWORD);
						setState(1422);
						match(TAB);
						setState(1423);
						((KrxBasicInfoCompanyContext)_localctx).type = match(WORD);
						setState(1427);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(1424);
							word();
							}
							}
							setState(1429);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1430);
						match(NEWLINE);
						setState(1431);
						match(KEYWORD);
						setState(1432);
						match(TAB);
						setState(1433);
						match(WORD);
						setState(1434);
						match(NEWLINE);
						setState(1435);
						match(KEYWORD);
						setState(1436);
						match(TAB);
						setState(1440);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(1437);
							word();
							}
							}
							setState(1442);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1443);
						match(NEWLINE);
						setState(1444);
						match(KEYWORD);
						setState(1445);
						match(TAB);
						setState(1446);
						match(WORD);
						setState(1447);
						match(NEWLINE);
						setState(1448);
						match(KEYWORD);
						setState(1449);
						match(TAB);
						setState(1450);
						word();
						setState(1451);
						match(NEWLINE);
						setState(1452);
						match(KEYWORD);
						setState(1453);
						match(TAB);
						setState(1454);
						((KrxBasicInfoCompanyContext)_localctx).volumeOfListedShares = match(NUMBER);
						setState(1455);
						match(NEWLINE);
						setState(1456);
						match(KEYWORD);
						setState(1457);
						match(TAB);
						setState(1458);
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
						setState(1463); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==KEYWORD );
					setState(1465);
					match(WORD);
					setState(1466);
					match(TAB);
					setState(1467);
					match(WORD);
					setState(1468);
					match(TAB);
					setState(1469);
					match(DATE);
					setState(1470);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1474); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1476);
			match(KEYWORD);
			setState(1477);
			match(TAB);
			setState(1478);
			match(WORD);
			setState(1479);
			match(TAB);
			setState(1480);
			match(WORD);
			setState(1481);
			match(WORD);
			setState(1482);
			match(WORD);
			setState(1483);
			match(WORD);
			setState(1484);
			match(WORD);
			setState(1485);
			match(WORD);
			setState(1486);
			match(TAB);
			setState(1487);
			match(WORD);
			setState(1488);
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
		public WordContext code;
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
			setState(1490);
			match(KEYWORD);
			setState(1491);
			match(TAB);
			setState(1492);
			match(WORD);
			setState(1493);
			match(TAB);
			setState(1494);
			match(WORD);
			setState(1495);
			match(WORD);
			setState(1496);
			match(WORD);
			setState(1497);
			match(WORD);
			setState(1498);
			match(TAB);
			setState(1499);
			match(WORD);
			setState(1500);
			match(NEWLINE);
			setState(1721); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1506); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1501);
						match(WORD);
						setState(1502);
						match(TAB);
						setState(1503);
						match(DATE);
						setState(1504);
						match(TAB);
						setState(1505);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1508); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1510);
				match(WORD);
				setState(1511);
				match(TAB);
				setState(1512);
				match(DATE);
				setState(1513);
				match(TAB);
				setState(1514);
				match(WORD);
				setState(1515);
				match(NEWLINE);
				setState(1516);
				match(WORD);
				setState(1517);
				match(TAB);
				setState(1518);
				match(DATE);
				setState(1519);
				match(TAB);
				setState(1520);
				match(NEWLINE);
				setState(1710); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(1710);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
						case 1:
							{
							{
							setState(1521);
							match(WORD);
							setState(1522);
							match(TAB);
							setState(1523);
							match(DATE);
							setState(1524);
							match(TAB);
							setState(1525);
							((EtfAllPriceContext)_localctx).code = word();
							setState(1526);
							match(NEWLINE);
							setState(1527);
							match(WORD);
							setState(1528);
							match(TAB);
							setState(1529);
							match(DATE);
							setState(1530);
							match(TAB);
							setState(1531);
							((EtfAllPriceContext)_localctx).symbol = word();
							setState(1533);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
							case 1:
								{
								setState(1532);
								((EtfAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(1536);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
							case 1:
								{
								setState(1535);
								((EtfAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(1539);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
							case 1:
								{
								setState(1538);
								((EtfAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(1542);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
							case 1:
								{
								setState(1541);
								((EtfAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(1545);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
							case 1:
								{
								setState(1544);
								((EtfAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(1548);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
							case 1:
								{
								setState(1547);
								((EtfAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(1553);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(1550);
								((EtfAllPriceContext)_localctx).symbol7 = word();
								}
								}
								setState(1555);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
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
							((EtfAllPriceContext)_localctx).closing = match(NUMBER);
							setState(1562);
							match(NEWLINE);
							setState(1563);
							match(WORD);
							setState(1564);
							match(TAB);
							setState(1565);
							match(DATE);
							setState(1566);
							match(TAB);
							setState(1567);
							match(NUMBER);
							setState(1568);
							match(NEWLINE);
							setState(1569);
							match(WORD);
							setState(1570);
							match(TAB);
							setState(1571);
							match(DATE);
							setState(1572);
							match(TAB);
							setState(1573);
							match(NUMBER);
							setState(1574);
							match(NEWLINE);
							setState(1575);
							match(WORD);
							setState(1576);
							match(TAB);
							setState(1577);
							match(DATE);
							setState(1578);
							match(TAB);
							setState(1579);
							match(NUMBER);
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
							((EtfAllPriceContext)_localctx).market = match(NUMBER);
							setState(1586);
							match(NEWLINE);
							setState(1587);
							match(WORD);
							setState(1588);
							match(TAB);
							setState(1589);
							match(DATE);
							setState(1590);
							match(TAB);
							setState(1591);
							((EtfAllPriceContext)_localctx).high = match(NUMBER);
							setState(1592);
							match(NEWLINE);
							setState(1593);
							match(WORD);
							setState(1594);
							match(TAB);
							setState(1595);
							match(DATE);
							setState(1596);
							match(TAB);
							setState(1597);
							((EtfAllPriceContext)_localctx).low = match(NUMBER);
							setState(1598);
							match(NEWLINE);
							setState(1599);
							match(WORD);
							setState(1600);
							match(TAB);
							setState(1601);
							match(DATE);
							setState(1602);
							match(TAB);
							setState(1603);
							((EtfAllPriceContext)_localctx).volume = match(NUMBER);
							setState(1604);
							match(NEWLINE);
							setState(1605);
							match(WORD);
							setState(1606);
							match(TAB);
							setState(1607);
							match(DATE);
							setState(1608);
							match(TAB);
							setState(1609);
							match(NUMBER);
							setState(1610);
							match(NEWLINE);
							setState(1611);
							match(WORD);
							setState(1612);
							match(TAB);
							setState(1613);
							match(DATE);
							setState(1614);
							match(TAB);
							setState(1615);
							match(NUMBER);
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
							match(NUMBER);
							setState(1622);
							match(NEWLINE);
							setState(1623);
							match(WORD);
							setState(1624);
							match(TAB);
							setState(1625);
							match(DATE);
							setState(1626);
							match(TAB);
							setState(1627);
							((EtfAllPriceContext)_localctx).volumeOfListedShares = match(NUMBER);
							setState(1628);
							match(NEWLINE);
							setState(1629);
							match(WORD);
							setState(1630);
							match(TAB);
							setState(1631);
							match(DATE);
							setState(1632);
							match(TAB);
							setState(1634); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(1633);
								word();
								}
								}
								setState(1636); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
							setState(1638);
							match(NEWLINE);
							setState(1639);
							match(WORD);
							setState(1640);
							match(TAB);
							setState(1641);
							match(DATE);
							setState(1642);
							match(TAB);
							setState(1643);
							word();
							setState(1644);
							match(NEWLINE);
							setState(1645);
							match(WORD);
							setState(1646);
							match(TAB);
							setState(1647);
							match(DATE);
							setState(1648);
							match(TAB);
							setState(1649);
							word();
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
							word();
							setState(1656);
							match(NEWLINE);
							setState(1657);
							match(WORD);
							setState(1658);
							match(TAB);
							setState(1659);
							((EtfAllPriceContext)_localctx).base = match(DATE);
							setState(1660);
							match(TAB);
							setState(1661);
							match(NEWLINE);

											ParserService.price(20240112
												, (((EtfAllPriceContext)_localctx).code!=null?_input.getText(((EtfAllPriceContext)_localctx).code.start,((EtfAllPriceContext)_localctx).code.stop):null)
												, (((EtfAllPriceContext)_localctx).base!=null?((EtfAllPriceContext)_localctx).base.getText():null), (((EtfAllPriceContext)_localctx).closing!=null?((EtfAllPriceContext)_localctx).closing.getText():null), (((EtfAllPriceContext)_localctx).market!=null?((EtfAllPriceContext)_localctx).market.getText():null), (((EtfAllPriceContext)_localctx).high!=null?((EtfAllPriceContext)_localctx).high.getText():null), (((EtfAllPriceContext)_localctx).low!=null?((EtfAllPriceContext)_localctx).low.getText():null), (((EtfAllPriceContext)_localctx).volume!=null?((EtfAllPriceContext)_localctx).volume.getText():null)
											);
											ParserService.item(20240112
												, (((EtfAllPriceContext)_localctx).code!=null?_input.getText(((EtfAllPriceContext)_localctx).code.start,((EtfAllPriceContext)_localctx).code.stop):null)
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
							setState(1664);
							match(WORD);
							setState(1665);
							match(TAB);
							setState(1666);
							match(DATE);
							setState(1667);
							match(TAB);
							setState(1668);
							word();
							setState(1669);
							((EtfAllPriceContext)_localctx).symbol = word();
							setState(1671);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
							case 1:
								{
								setState(1670);
								((EtfAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(1674);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
							case 1:
								{
								setState(1673);
								((EtfAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(1677);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
							case 1:
								{
								setState(1676);
								((EtfAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(1680);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
							case 1:
								{
								setState(1679);
								((EtfAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(1683);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
							case 1:
								{
								setState(1682);
								((EtfAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(1686);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
							case 1:
								{
								setState(1685);
								((EtfAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(1691);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1688);
									((EtfAllPriceContext)_localctx).symbol7 = word();
									}
									} 
								}
								setState(1693);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
							}
							setState(1694);
							((EtfAllPriceContext)_localctx).closing = match(NUMBER);
							setState(1695);
							match(NEWLINE);
							setState(1696);
							match(WORD);
							setState(1697);
							match(TAB);
							setState(1698);
							((EtfAllPriceContext)_localctx).base = match(DATE);
							setState(1699);
							match(TAB);
							setState(1700);
							match(NUMBER);
							setState(1701);
							match(NUMBER);
							setState(1702);
							match(NUMBER);
							setState(1703);
							match(NUMBER);
							setState(1704);
							match(NUMBER);
							setState(1705);
							match(NUMBER);
							setState(1706);
							match(NUMBER);
							setState(1707);
							match(NEWLINE);

											ParserService.price(20240112
												, (((EtfAllPriceContext)_localctx).code!=null?_input.getText(((EtfAllPriceContext)_localctx).code.start,((EtfAllPriceContext)_localctx).code.stop):null)
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
					setState(1712); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1714);
				match(WORD);
				setState(1715);
				match(TAB);
				setState(1716);
				match(WORD);
				setState(1717);
				match(TAB);
				setState(1718);
				match(DATE);
				setState(1719);
				match(NEWLINE);
				}
				}
				setState(1723); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1725);
			match(KEYWORD);
			setState(1726);
			match(TAB);
			setState(1727);
			match(WORD);
			setState(1728);
			match(TAB);
			setState(1729);
			match(WORD);
			setState(1730);
			match(WORD);
			setState(1731);
			match(WORD);
			setState(1732);
			match(WORD);
			setState(1733);
			match(TAB);
			setState(1734);
			match(WORD);
			setState(1735);
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
			setState(1737);
			match(KEYWORD);
			setState(1738);
			match(TAB);
			setState(1739);
			match(WORD);
			setState(1740);
			match(TAB);
			setState(1741);
			match(WORD);
			setState(1742);
			match(WORD);
			setState(1743);
			match(WORD);
			setState(1744);
			match(WORD);
			setState(1745);
			match(WORD);
			setState(1746);
			match(WORD);
			setState(1747);
			match(TAB);
			setState(1748);
			match(WORD);
			setState(1749);
			match(NEWLINE);
			setState(2232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1750);
				match(WORD);
				setState(1751);
				match(TAB);
				setState(1752);
				match(DATE);
				setState(1753);
				match(TAB);
				setState(1754);
				match(NEWLINE);
				setState(1755);
				match(WORD);
				setState(1756);
				match(TAB);
				setState(1757);
				match(DATE);
				setState(1758);
				match(TAB);
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
				match(NEWLINE);
				setState(1765);
				match(WORD);
				setState(1766);
				match(TAB);
				setState(1767);
				match(DATE);
				setState(1768);
				match(TAB);
				setState(1769);
				match(TAB);
				setState(1770);
				match(TAB);
				setState(1771);
				match(TAB);
				setState(1772);
				match(TAB);
				setState(1773);
				match(NEWLINE);
				setState(1774);
				match(WORD);
				setState(1775);
				match(TAB);
				setState(1776);
				match(DATE);
				setState(1777);
				match(TAB);
				setState(1778);
				match(TAB);
				setState(1779);
				match(TAB);
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
				match(TAB);
				setState(1786);
				match(TAB);
				setState(1787);
				match(TAB);
				setState(1788);
				match(TAB);
				setState(1789);
				match(NEWLINE);
				setState(1790);
				match(WORD);
				setState(1791);
				match(TAB);
				setState(1792);
				match(DATE);
				setState(1793);
				match(TAB);
				setState(1794);
				match(TAB);
				setState(1795);
				match(TAB);
				setState(1796);
				match(TAB);
				setState(1797);
				match(TAB);
				setState(1798);
				match(NEWLINE);
				setState(1799);
				match(WORD);
				setState(1800);
				match(TAB);
				setState(1801);
				match(DATE);
				setState(1802);
				match(TAB);
				setState(1803);
				match(TAB);
				setState(1804);
				match(TAB);
				setState(1805);
				match(TAB);
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
				match(NEWLINE);
				setState(1812);
				match(WORD);
				setState(1813);
				match(TAB);
				setState(1814);
				match(DATE);
				setState(1815);
				match(TAB);
				setState(1816);
				match(NEWLINE);
				setState(1817);
				match(WORD);
				setState(1818);
				match(TAB);
				setState(1819);
				match(DATE);
				setState(1820);
				match(TAB);
				setState(1821);
				match(TAB);
				setState(1822);
				match(TAB);
				setState(1823);
				match(TAB);
				setState(1824);
				match(TAB);
				setState(1825);
				match(NEWLINE);
				setState(1826);
				match(WORD);
				setState(1827);
				match(TAB);
				setState(1828);
				match(DATE);
				setState(1829);
				match(TAB);
				setState(1830);
				match(TAB);
				setState(1831);
				match(TAB);
				setState(1832);
				match(NEWLINE);
				setState(1833);
				match(WORD);
				setState(1834);
				match(TAB);
				setState(1835);
				match(DATE);
				setState(1836);
				match(TAB);
				setState(1837);
				match(TAB);
				setState(1838);
				match(TAB);
				setState(1839);
				match(TAB);
				setState(1840);
				match(TAB);
				setState(1841);
				match(NEWLINE);
				setState(1842);
				match(WORD);
				setState(1843);
				match(TAB);
				setState(1844);
				match(DATE);
				setState(1845);
				match(TAB);
				setState(1846);
				match(TAB);
				setState(1847);
				match(TAB);
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
				match(DATE);
				setState(1854);
				match(TAB);
				setState(1855);
				match(TAB);
				setState(1856);
				match(TAB);
				setState(1857);
				match(TAB);
				setState(1858);
				match(NEWLINE);
				setState(1859);
				match(WORD);
				setState(1860);
				match(TAB);
				setState(1861);
				match(DATE);
				setState(1862);
				match(TAB);
				setState(1863);
				match(NEWLINE);
				setState(1864);
				match(WORD);
				setState(1865);
				match(TAB);
				setState(1866);
				match(DATE);
				setState(1867);
				match(TAB);
				setState(1868);
				match(NEWLINE);
				setState(1869);
				match(WORD);
				setState(1870);
				match(TAB);
				setState(1871);
				match(DATE);
				setState(1872);
				match(TAB);
				setState(1873);
				match(NEWLINE);
				setState(1874);
				match(WORD);
				setState(1875);
				match(TAB);
				setState(1876);
				match(DATE);
				setState(1877);
				match(TAB);
				setState(1878);
				match(NEWLINE);
				setState(1879);
				match(WORD);
				setState(1880);
				match(TAB);
				setState(1881);
				match(DATE);
				setState(1882);
				match(TAB);
				setState(1883);
				match(TAB);
				setState(1884);
				match(TAB);
				setState(1885);
				match(TAB);
				setState(1886);
				match(TAB);
				setState(1887);
				match(NEWLINE);
				setState(1888);
				match(WORD);
				setState(1889);
				match(TAB);
				setState(1890);
				match(DATE);
				setState(1891);
				match(TAB);
				setState(1892);
				match(TAB);
				setState(1893);
				match(TAB);
				setState(1894);
				match(TAB);
				setState(1895);
				match(NEWLINE);
				setState(1896);
				match(WORD);
				setState(1897);
				match(TAB);
				setState(1898);
				match(DATE);
				setState(1899);
				match(TAB);
				setState(1900);
				match(TAB);
				setState(1901);
				match(TAB);
				setState(1902);
				match(TAB);
				setState(1903);
				match(TAB);
				setState(1904);
				match(NEWLINE);
				setState(1905);
				match(WORD);
				setState(1906);
				match(TAB);
				setState(1907);
				match(DATE);
				setState(1908);
				match(TAB);
				setState(1909);
				match(TAB);
				setState(1910);
				match(TAB);
				setState(1911);
				match(TAB);
				setState(1912);
				match(TAB);
				setState(1913);
				match(NEWLINE);
				setState(1914);
				match(WORD);
				setState(1915);
				match(TAB);
				setState(1916);
				match(DATE);
				setState(1917);
				match(TAB);
				setState(1918);
				match(TAB);
				setState(1919);
				match(TAB);
				setState(1920);
				match(TAB);
				setState(1921);
				match(NEWLINE);
				setState(1922);
				match(WORD);
				setState(1923);
				match(TAB);
				setState(1924);
				match(DATE);
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
				match(NEWLINE);
				setState(1932);
				match(WORD);
				setState(1933);
				match(TAB);
				setState(1934);
				match(DATE);
				setState(1935);
				match(TAB);
				setState(1936);
				match(NEWLINE);
				setState(1937);
				match(WORD);
				setState(1938);
				match(TAB);
				setState(1939);
				match(DATE);
				setState(1940);
				match(TAB);
				setState(1941);
				match(NEWLINE);
				setState(1942);
				match(WORD);
				setState(1943);
				match(TAB);
				setState(1944);
				match(DATE);
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
				match(NEWLINE);
				setState(1951);
				match(WORD);
				setState(1952);
				match(TAB);
				setState(1953);
				match(DATE);
				setState(1954);
				match(TAB);
				setState(1955);
				match(TAB);
				setState(1956);
				match(TAB);
				setState(1957);
				match(NEWLINE);
				setState(1958);
				match(WORD);
				setState(1959);
				match(TAB);
				setState(1960);
				match(DATE);
				setState(1961);
				match(TAB);
				setState(1962);
				match(TAB);
				setState(1963);
				match(TAB);
				setState(1964);
				match(TAB);
				setState(1965);
				match(TAB);
				setState(1966);
				match(NEWLINE);
				setState(1967);
				match(WORD);
				setState(1968);
				match(TAB);
				setState(1969);
				match(DATE);
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
				match(WORD);
				setState(1977);
				match(TAB);
				setState(1978);
				match(DATE);
				setState(1979);
				match(TAB);
				setState(1980);
				match(TAB);
				setState(1981);
				match(TAB);
				setState(1982);
				match(TAB);
				setState(1983);
				match(NEWLINE);
				setState(1984);
				match(WORD);
				setState(1985);
				match(TAB);
				setState(1986);
				match(DATE);
				setState(1987);
				match(TAB);
				setState(1988);
				match(NEWLINE);
				setState(1989);
				match(WORD);
				setState(1990);
				match(TAB);
				setState(1991);
				match(DATE);
				setState(1992);
				match(TAB);
				setState(1993);
				match(NEWLINE);
				setState(1994);
				match(WORD);
				setState(1995);
				match(TAB);
				setState(1996);
				match(DATE);
				setState(1997);
				match(TAB);
				setState(1998);
				match(NEWLINE);
				setState(1999);
				match(WORD);
				setState(2000);
				match(TAB);
				setState(2001);
				match(DATE);
				setState(2002);
				match(TAB);
				setState(2003);
				match(TAB);
				setState(2004);
				match(TAB);
				setState(2005);
				match(TAB);
				setState(2006);
				match(TAB);
				setState(2007);
				match(NEWLINE);
				setState(2008);
				match(WORD);
				setState(2009);
				match(TAB);
				setState(2010);
				match(DATE);
				setState(2011);
				match(TAB);
				setState(2012);
				match(TAB);
				setState(2013);
				match(TAB);
				setState(2014);
				match(NEWLINE);
				setState(2015);
				match(WORD);
				setState(2016);
				match(TAB);
				setState(2017);
				match(DATE);
				setState(2018);
				match(TAB);
				setState(2019);
				match(TAB);
				setState(2020);
				match(TAB);
				setState(2021);
				match(TAB);
				setState(2022);
				match(TAB);
				setState(2023);
				match(NEWLINE);
				setState(2024);
				match(WORD);
				setState(2025);
				match(TAB);
				setState(2026);
				match(DATE);
				setState(2027);
				match(TAB);
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
				match(NEWLINE);
				setState(2041);
				match(WORD);
				setState(2042);
				match(TAB);
				setState(2043);
				match(DATE);
				setState(2044);
				match(TAB);
				setState(2045);
				match(WORD);
				setState(2046);
				match(NEWLINE);
				setState(2047);
				match(WORD);
				setState(2048);
				match(TAB);
				setState(2049);
				match(DATE);
				setState(2050);
				match(TAB);
				setState(2051);
				match(NEWLINE);
				setState(2221); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(2221);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
						case 1:
							{
							{
							setState(2052);
							match(WORD);
							setState(2053);
							match(TAB);
							setState(2054);
							match(DATE);
							setState(2055);
							match(TAB);
							setState(2056);
							((CompanyAllPriceContext)_localctx).code = word();
							setState(2057);
							match(NEWLINE);
							setState(2058);
							match(WORD);
							setState(2059);
							match(TAB);
							setState(2060);
							match(DATE);
							setState(2061);
							match(TAB);
							setState(2062);
							((CompanyAllPriceContext)_localctx).symbol = word();
							setState(2064);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
							case 1:
								{
								setState(2063);
								((CompanyAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(2067);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
							case 1:
								{
								setState(2066);
								((CompanyAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(2070);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
							case 1:
								{
								setState(2069);
								((CompanyAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(2073);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
							case 1:
								{
								setState(2072);
								((CompanyAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(2076);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
							case 1:
								{
								setState(2075);
								((CompanyAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(2079);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
							case 1:
								{
								setState(2078);
								((CompanyAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(2084);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(2081);
								((CompanyAllPriceContext)_localctx).symbol7 = word();
								}
								}
								setState(2086);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
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
							((CompanyAllPriceContext)_localctx).type = word();
							setState(2096);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(2093);
								word();
								}
								}
								setState(2098);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(2099);
							match(NEWLINE);
							setState(2100);
							match(WORD);
							setState(2101);
							match(TAB);
							setState(2102);
							match(DATE);
							setState(2103);
							match(TAB);
							setState(2105);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==WORD) {
								{
								setState(2104);
								match(WORD);
								}
							}

							setState(2107);
							match(NEWLINE);
							setState(2108);
							match(WORD);
							setState(2109);
							match(TAB);
							setState(2110);
							match(DATE);
							setState(2111);
							match(TAB);
							setState(2112);
							((CompanyAllPriceContext)_localctx).closing = match(NUMBER);
							setState(2113);
							match(NEWLINE);
							setState(2114);
							match(WORD);
							setState(2115);
							match(TAB);
							setState(2116);
							match(DATE);
							setState(2117);
							match(TAB);
							setState(2118);
							match(NUMBER);
							setState(2119);
							match(NEWLINE);
							setState(2120);
							match(WORD);
							setState(2121);
							match(TAB);
							setState(2122);
							match(DATE);
							setState(2123);
							match(TAB);
							setState(2124);
							match(NUMBER);
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
							((CompanyAllPriceContext)_localctx).market = match(NUMBER);
							setState(2131);
							match(NEWLINE);
							setState(2132);
							match(WORD);
							setState(2133);
							match(TAB);
							setState(2134);
							match(DATE);
							setState(2135);
							match(TAB);
							setState(2136);
							((CompanyAllPriceContext)_localctx).high = match(NUMBER);
							setState(2137);
							match(NEWLINE);
							setState(2138);
							match(WORD);
							setState(2139);
							match(TAB);
							setState(2140);
							match(DATE);
							setState(2141);
							match(TAB);
							setState(2142);
							((CompanyAllPriceContext)_localctx).low = match(NUMBER);
							setState(2143);
							match(NEWLINE);
							setState(2144);
							match(WORD);
							setState(2145);
							match(TAB);
							setState(2146);
							match(DATE);
							setState(2147);
							match(TAB);
							setState(2148);
							((CompanyAllPriceContext)_localctx).volume = match(NUMBER);
							setState(2149);
							match(NEWLINE);
							setState(2150);
							match(WORD);
							setState(2151);
							match(TAB);
							setState(2152);
							match(DATE);
							setState(2153);
							match(TAB);
							setState(2154);
							match(NUMBER);
							setState(2155);
							match(NEWLINE);
							setState(2156);
							match(WORD);
							setState(2157);
							match(TAB);
							setState(2158);
							match(DATE);
							setState(2159);
							match(TAB);
							setState(2160);
							match(NUMBER);
							setState(2161);
							match(NEWLINE);
							setState(2162);
							match(WORD);
							setState(2163);
							match(TAB);
							setState(2164);
							match(DATE);
							setState(2165);
							match(TAB);
							setState(2166);
							((CompanyAllPriceContext)_localctx).volumeOfListedShares = match(NUMBER);
							setState(2167);
							match(NEWLINE);
							setState(2168);
							match(WORD);
							setState(2169);
							match(TAB);
							setState(2170);
							((CompanyAllPriceContext)_localctx).base = match(DATE);
							setState(2171);
							match(TAB);
							setState(2172);
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
							setState(2175);
							match(WORD);
							setState(2176);
							match(TAB);
							setState(2177);
							match(DATE);
							setState(2178);
							match(TAB);
							setState(2179);
							word();
							setState(2180);
							((CompanyAllPriceContext)_localctx).symbol = word();
							setState(2182);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
							case 1:
								{
								setState(2181);
								((CompanyAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(2185);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
							case 1:
								{
								setState(2184);
								((CompanyAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(2188);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
							case 1:
								{
								setState(2187);
								((CompanyAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(2191);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
							case 1:
								{
								setState(2190);
								((CompanyAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(2194);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
							case 1:
								{
								setState(2193);
								((CompanyAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(2197);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
							case 1:
								{
								setState(2196);
								((CompanyAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(2202);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(2199);
									((CompanyAllPriceContext)_localctx).symbol7 = word();
									}
									} 
								}
								setState(2204);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
							}
							setState(2205);
							((CompanyAllPriceContext)_localctx).closing = match(NUMBER);
							setState(2206);
							match(NEWLINE);
							setState(2207);
							match(WORD);
							setState(2208);
							match(TAB);
							setState(2209);
							((CompanyAllPriceContext)_localctx).base = match(DATE);
							setState(2210);
							match(TAB);
							setState(2211);
							match(NUMBER);
							setState(2212);
							match(NUMBER);
							setState(2213);
							match(NUMBER);
							setState(2214);
							match(NUMBER);
							setState(2215);
							match(NUMBER);
							setState(2216);
							match(NUMBER);
							setState(2217);
							match(NUMBER);
							setState(2218);
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
					setState(2223); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2225);
				match(WORD);
				setState(2226);
				match(TAB);
				setState(2227);
				match(WORD);
				setState(2228);
				match(TAB);
				setState(2229);
				match(DATE);
				setState(2230);
				match(NEWLINE);
				}
				}
				setState(2234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(2236);
			match(KEYWORD);
			setState(2237);
			match(TAB);
			setState(2238);
			match(WORD);
			setState(2239);
			match(TAB);
			setState(2240);
			match(WORD);
			setState(2241);
			match(WORD);
			setState(2242);
			match(WORD);
			setState(2243);
			match(WORD);
			setState(2244);
			match(WORD);
			setState(2245);
			match(WORD);
			setState(2246);
			match(TAB);
			setState(2247);
			match(WORD);
			setState(2248);
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
		public WordContext code;
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
			setState(2250);
			match(KEYWORD);
			setState(2251);
			match(TAB);
			setState(2252);
			match(WORD);
			setState(2253);
			match(TAB);
			setState(2254);
			match(WORD);
			setState(2255);
			match(TAB);
			setState(2256);
			match(WORD);
			setState(2257);
			match(NEWLINE);
			setState(2446); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(2446);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
					case 1:
						{
						{
						setState(2258);
						word();
						setState(2259);
						match(TAB);
						setState(2260);
						match(WORD);
						setState(2261);
						match(WORD);
						setState(2262);
						match(TAB);
						setState(2263);
						match(NEWLINE);
						}
						}
						break;
					case 2:
						{
						setState(2435); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(2433);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
								case 1:
									{
									{
									setState(2265);
									match(WORD);
									setState(2266);
									match(TAB);
									setState(2267);
									word();
									setState(2268);
									match(TAB);
									setState(2269);
									match(WORD);
									setState(2270);
									match(TAB);
									setState(2271);
									match(WORD);
									setState(2272);
									match(TAB);
									setState(2273);
									match(WORD);
									setState(2274);
									match(TAB);
									setState(2275);
									match(WORD);
									setState(2276);
									match(TAB);
									setState(2277);
									match(WORD);
									setState(2278);
									match(TAB);
									setState(2279);
									match(WORD);
									setState(2280);
									match(TAB);
									setState(2281);
									match(WORD);
									setState(2282);
									match(TAB);
									setState(2283);
									match(WORD);
									setState(2284);
									match(TAB);
									setState(2285);
									match(WORD);
									setState(2286);
									match(TAB);
									setState(2287);
									match(WORD);
									setState(2288);
									match(TAB);
									setState(2289);
									match(WORD);
									setState(2290);
									match(TAB);
									setState(2291);
									match(NEWLINE);
									setState(2321); 
									_errHandler.sync(this);
									_alt = 1;
									do {
										switch (_alt) {
										case 1:
											{
											{
											setState(2292);
											match(WORD);
											setState(2293);
											match(TAB);
											setState(2294);
											((CrawlPriceKrxContext)_localctx).code = word();
											setState(2295);
											match(TAB);
											setState(2296);
											((CrawlPriceKrxContext)_localctx).base = match(DATE);
											setState(2297);
											match(TAB);
											setState(2298);
											((CrawlPriceKrxContext)_localctx).closing = match(NUMBER);
											setState(2299);
											match(TAB);
											setState(2300);
											match(NUMBER);
											setState(2301);
											match(TAB);
											setState(2302);
											match(NUMBER);
											setState(2303);
											match(TAB);
											setState(2304);
											((CrawlPriceKrxContext)_localctx).market = match(NUMBER);
											setState(2305);
											match(TAB);
											setState(2306);
											((CrawlPriceKrxContext)_localctx).high = match(NUMBER);
											setState(2307);
											match(TAB);
											setState(2308);
											((CrawlPriceKrxContext)_localctx).low = match(NUMBER);
											setState(2309);
											match(TAB);
											setState(2310);
											((CrawlPriceKrxContext)_localctx).volume = match(NUMBER);
											setState(2311);
											match(TAB);
											setState(2312);
											match(NUMBER);
											setState(2313);
											match(TAB);
											setState(2314);
											match(NUMBER);
											setState(2315);
											match(TAB);
											setState(2316);
											match(NUMBER);
											setState(2317);
											match(TAB);
											setState(2318);
											match(NEWLINE);

																	ParserService.price(20240112
																		, (((CrawlPriceKrxContext)_localctx).code!=null?_input.getText(((CrawlPriceKrxContext)_localctx).code.start,((CrawlPriceKrxContext)_localctx).code.stop):null)
																		, (((CrawlPriceKrxContext)_localctx).base!=null?((CrawlPriceKrxContext)_localctx).base.getText():null), (((CrawlPriceKrxContext)_localctx).closing!=null?((CrawlPriceKrxContext)_localctx).closing.getText():null), (((CrawlPriceKrxContext)_localctx).market!=null?((CrawlPriceKrxContext)_localctx).market.getText():null), (((CrawlPriceKrxContext)_localctx).high!=null?((CrawlPriceKrxContext)_localctx).high.getText():null), (((CrawlPriceKrxContext)_localctx).low!=null?((CrawlPriceKrxContext)_localctx).low.getText():null), (((CrawlPriceKrxContext)_localctx).volume!=null?((CrawlPriceKrxContext)_localctx).volume.getText():null)
																	);
																
											}
											}
											break;
										default:
											throw new NoViableAltException(this);
										}
										setState(2323); 
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
									} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
									}
									}
									break;
								case 2:
									{
									{
									setState(2325);
									match(WORD);
									setState(2326);
									match(TAB);
									setState(2327);
									word();
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
									match(WORD);
									setState(2334);
									match(TAB);
									setState(2335);
									match(WORD);
									setState(2336);
									match(TAB);
									setState(2337);
									match(WORD);
									setState(2338);
									match(TAB);
									setState(2339);
									match(WORD);
									setState(2340);
									match(TAB);
									setState(2341);
									match(WORD);
									setState(2342);
									match(TAB);
									setState(2343);
									match(WORD);
									setState(2344);
									match(TAB);
									setState(2345);
									match(WORD);
									setState(2346);
									match(TAB);
									setState(2347);
									match(WORD);
									setState(2348);
									match(TAB);
									setState(2349);
									match(WORD);
									setState(2350);
									match(TAB);
									setState(2351);
									match(WORD);
									setState(2352);
									match(TAB);
									setState(2353);
									match(WORD);
									setState(2354);
									match(TAB);
									setState(2355);
									match(WORD);
									setState(2356);
									match(TAB);
									setState(2357);
									match(WORD);
									setState(2358);
									match(TAB);
									setState(2359);
									match(WORD);
									setState(2360);
									match(TAB);
									setState(2361);
									match(WORD);
									setState(2362);
									match(TAB);
									setState(2363);
									match(NEWLINE);
									setState(2429); 
									_errHandler.sync(this);
									_alt = 1;
									do {
										switch (_alt) {
										case 1:
											{
											{
											setState(2364);
											match(WORD);
											setState(2365);
											match(TAB);
											setState(2366);
											((CrawlPriceKrxContext)_localctx).code = word();
											setState(2367);
											match(TAB);
											setState(2368);
											((CrawlPriceKrxContext)_localctx).base = match(DATE);
											setState(2369);
											match(TAB);
											setState(2370);
											((CrawlPriceKrxContext)_localctx).closing = match(NUMBER);
											setState(2371);
											match(TAB);
											setState(2372);
											match(NUMBER);
											setState(2373);
											match(TAB);
											setState(2374);
											match(NUMBER);
											setState(2375);
											match(TAB);
											setState(2376);
											match(NUMBER);
											setState(2377);
											match(TAB);
											setState(2378);
											((CrawlPriceKrxContext)_localctx).market = match(NUMBER);
											setState(2379);
											match(TAB);
											setState(2380);
											((CrawlPriceKrxContext)_localctx).high = match(NUMBER);
											setState(2381);
											match(TAB);
											setState(2382);
											((CrawlPriceKrxContext)_localctx).low = match(NUMBER);
											setState(2383);
											match(TAB);
											setState(2384);
											((CrawlPriceKrxContext)_localctx).volume = match(NUMBER);
											setState(2385);
											match(TAB);
											setState(2386);
											match(NUMBER);
											setState(2387);
											match(TAB);
											setState(2388);
											match(NUMBER);
											setState(2389);
											match(TAB);
											setState(2390);
											match(NUMBER);
											setState(2391);
											match(TAB);
											setState(2392);
											match(NUMBER);
											setState(2393);
											match(TAB);
											setState(2394);
											((CrawlPriceKrxContext)_localctx).symbol = word();
											setState(2396);
											_errHandler.sync(this);
											switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
											case 1:
												{
												setState(2395);
												((CrawlPriceKrxContext)_localctx).symbol1 = word();
												}
												break;
											}
											setState(2399);
											_errHandler.sync(this);
											switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
											case 1:
												{
												setState(2398);
												((CrawlPriceKrxContext)_localctx).symbol2 = word();
												}
												break;
											}
											setState(2402);
											_errHandler.sync(this);
											switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
											case 1:
												{
												setState(2401);
												((CrawlPriceKrxContext)_localctx).symbol3 = word();
												}
												break;
											}
											setState(2405);
											_errHandler.sync(this);
											switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
											case 1:
												{
												setState(2404);
												((CrawlPriceKrxContext)_localctx).symbol4 = word();
												}
												break;
											}
											setState(2408);
											_errHandler.sync(this);
											switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
											case 1:
												{
												setState(2407);
												((CrawlPriceKrxContext)_localctx).symbol5 = word();
												}
												break;
											}
											setState(2411);
											_errHandler.sync(this);
											switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
											case 1:
												{
												setState(2410);
												((CrawlPriceKrxContext)_localctx).symbol6 = word();
												}
												break;
											}
											setState(2416);
											_errHandler.sync(this);
											_la = _input.LA(1);
											while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
												{
												{
												setState(2413);
												((CrawlPriceKrxContext)_localctx).symbol7 = word();
												}
												}
												setState(2418);
												_errHandler.sync(this);
												_la = _input.LA(1);
											}
											setState(2419);
											match(TAB);
											setState(2420);
											match(NUMBER);
											setState(2421);
											match(TAB);
											setState(2422);
											match(NUMBER);
											setState(2423);
											match(TAB);
											setState(2424);
											match(NUMBER);
											setState(2425);
											match(TAB);
											setState(2426);
											match(NEWLINE);

																	ParserService.price(20240112
																		, (((CrawlPriceKrxContext)_localctx).code!=null?_input.getText(((CrawlPriceKrxContext)_localctx).code.start,((CrawlPriceKrxContext)_localctx).code.stop):null)
																		, (((CrawlPriceKrxContext)_localctx).base!=null?((CrawlPriceKrxContext)_localctx).base.getText():null), (((CrawlPriceKrxContext)_localctx).closing!=null?((CrawlPriceKrxContext)_localctx).closing.getText():null), (((CrawlPriceKrxContext)_localctx).market!=null?((CrawlPriceKrxContext)_localctx).market.getText():null), (((CrawlPriceKrxContext)_localctx).high!=null?((CrawlPriceKrxContext)_localctx).high.getText():null), (((CrawlPriceKrxContext)_localctx).low!=null?((CrawlPriceKrxContext)_localctx).low.getText():null), (((CrawlPriceKrxContext)_localctx).volume!=null?((CrawlPriceKrxContext)_localctx).volume.getText():null)
																	);
																
											}
											}
											break;
										default:
											throw new NoViableAltException(this);
										}
										setState(2431); 
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
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
							setState(2437); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(2439);
						match(WORD);
						setState(2440);
						match(TAB);
						setState(2441);
						match(WORD);
						setState(2442);
						match(TAB);
						setState(2443);
						match(DATE);
						setState(2444);
						match(NEWLINE);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2448); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(2450);
			match(KEYWORD);
			setState(2451);
			match(TAB);
			setState(2452);
			match(WORD);
			setState(2453);
			match(TAB);
			setState(2454);
			match(WORD);
			setState(2455);
			match(TAB);
			setState(2456);
			match(WORD);
			setState(2457);
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
			setState(2459);
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
			setState(2463); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(2463);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(2461);
					word();
					}
					break;
				case TAB:
					{
					setState(2462);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2465); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(2467);
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
			setState(2472); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(2472);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(2469);
					word();
					}
					break;
				case TAB:
					{
					setState(2470);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(2471);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2474); 
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
		"\u0004\u0001\n\u09ad\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000$\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u00018\b\u0001\u000b\u0001\f\u00019\u0001\u0001\u0001\u0001\u0001"+
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
		"\u0001\u0001\u0001\u0004\u0001\u010c\b\u0001\u000b\u0001\f\u0001\u010d"+
		"\u0004\u0001\u0110\b\u0001\u000b\u0001\f\u0001\u0111\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001\u011b\b\u0001\u000b\u0001\f\u0001\u011c\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0004\u0002\u0145\b\u0002\u000b\u0002\f\u0002\u0146\u0001\u0002\u0001"+
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
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u018b"+
		"\b\u0002\u000b\u0002\f\u0002\u018c\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u01a1\b\u0002\u000b\u0002"+
		"\f\u0002\u01a2\u0004\u0002\u01a5\b\u0002\u000b\u0002\f\u0002\u01a6\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0004\u0002\u01b0\b\u0002\u000b\u0002\f\u0002\u01b1\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u01da\b\u0003\u0001\u0003\u0003\u0003\u01dd\b"+
		"\u0003\u0001\u0003\u0003\u0003\u01e0\b\u0003\u0001\u0003\u0003\u0003\u01e3"+
		"\b\u0003\u0001\u0003\u0003\u0003\u01e6\b\u0003\u0001\u0003\u0003\u0003"+
		"\u01e9\b\u0003\u0001\u0003\u0005\u0003\u01ec\b\u0003\n\u0003\f\u0003\u01ef"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u01f3\b\u0003\u000b\u0003"+
		"\f\u0003\u01f4\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0223\b\u0003\u0001\u0003"+
		"\u0003\u0003\u0226\b\u0003\u0001\u0003\u0003\u0003\u0229\b\u0003\u0001"+
		"\u0003\u0003\u0003\u022c\b\u0003\u0001\u0003\u0003\u0003\u022f\b\u0003"+
		"\u0001\u0003\u0003\u0003\u0232\b\u0003\u0001\u0003\u0005\u0003\u0235\b"+
		"\u0003\n\u0003\f\u0003\u0238\t\u0003\u0001\u0003\u0001\u0003\u0004\u0003"+
		"\u023c\b\u0003\u000b\u0003\f\u0003\u023d\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u0245\b\u0003\u000b\u0003\f"+
		"\u0003\u0246\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u024f\b\u0003\u0001\u0003\u0005\u0003\u0252\b"+
		"\u0003\n\u0003\f\u0003\u0255\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u0284\b\u0004\u0001\u0004\u0003\u0004\u0287\b\u0004\u0001"+
		"\u0004\u0003\u0004\u028a\b\u0004\u0001\u0004\u0003\u0004\u028d\b\u0004"+
		"\u0001\u0004\u0003\u0004\u0290\b\u0004\u0001\u0004\u0003\u0004\u0293\b"+
		"\u0004\u0001\u0004\u0005\u0004\u0296\b\u0004\n\u0004\f\u0004\u0299\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0004\u0004\u02a1\b\u0004\u000b\u0004\f\u0004\u02a2\u0001\u0004\u0001"+
		"\u0004\u0004\u0004\u02a7\b\u0004\u000b\u0004\f\u0004\u02a8\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u02bb\b\u0004\u000b\u0004"+
		"\f\u0004\u02bc\u0001\u0004\u0001\u0004\u0004\u0004\u02c1\b\u0004\u000b"+
		"\u0004\f\u0004\u02c2\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u02f3\b\u0004\u0001\u0004\u0003\u0004\u02f6\b\u0004\u0001\u0004"+
		"\u0003\u0004\u02f9\b\u0004\u0001\u0004\u0003\u0004\u02fc\b\u0004\u0001"+
		"\u0004\u0003\u0004\u02ff\b\u0004\u0001\u0004\u0003\u0004\u0302\b\u0004"+
		"\u0001\u0004\u0005\u0004\u0305\b\u0004\n\u0004\f\u0004\u0308\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004"+
		"\u0004\u0310\b\u0004\u000b\u0004\f\u0004\u0311\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u0319\b\u0004\u000b\u0004"+
		"\f\u0004\u031a\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u0349\b\u0005\u000b\u0005"+
		"\f\u0005\u034a\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u0367\b\u0005\u000b\u0005"+
		"\f\u0005\u0368\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u0371\b\u0005\u0001\u0005\u0003\u0005\u0374\b"+
		"\u0005\u0001\u0005\u0003\u0005\u0377\b\u0005\u0001\u0005\u0003\u0005\u037a"+
		"\b\u0005\u0001\u0005\u0003\u0005\u037d\b\u0005\u0001\u0005\u0003\u0005"+
		"\u0380\b\u0005\u0001\u0005\u0005\u0005\u0383\b\u0005\n\u0005\f\u0005\u0386"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0004\u0005\u038f\b\u0005\u000b\u0005\f\u0005\u0390"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0004\u0005\u039b\b\u0005\u000b\u0005\f\u0005"+
		"\u039c\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u03a3"+
		"\b\u0005\u000b\u0005\f\u0005\u03a4\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0004\u0005\u03ab\b\u0005\u000b\u0005\f\u0005\u03ac\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u03cc"+
		"\b\u0005\u000b\u0005\f\u0005\u03cd\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u03e2\b\u0005\u000b\u0005"+
		"\f\u0005\u03e3\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0004\u0005\u03ed\b\u0005\u000b\u0005\f\u0005"+
		"\u03ee\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0004\u0006\u040f\b\u0006\u000b\u0006\f\u0006\u0410\u0001\u0006"+
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
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u054f\b\u0006\u000b\u0006"+
		"\f\u0006\u0550\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u055a\b\u0006\u0001\u0006\u0003\u0006"+
		"\u055d\b\u0006\u0001\u0006\u0003\u0006\u0560\b\u0006\u0001\u0006\u0003"+
		"\u0006\u0563\b\u0006\u0001\u0006\u0003\u0006\u0566\b\u0006\u0001\u0006"+
		"\u0003\u0006\u0569\b\u0006\u0001\u0006\u0005\u0006\u056c\b\u0006\n\u0006"+
		"\f\u0006\u056f\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0004\u0006\u0577\b\u0006\u000b\u0006\f\u0006"+
		"\u0578\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u0592\b\u0006\n\u0006\f\u0006\u0595\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u059f\b\u0006\n\u0006\f\u0006\u05a2\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u05b6"+
		"\b\u0006\u000b\u0006\f\u0006\u05b7\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u05c1\b\u0006"+
		"\u000b\u0006\f\u0006\u05c2\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007\u05e3\b\u0007\u000b\u0007\f\u0007"+
		"\u05e4\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u05fe\b\u0007\u0001\u0007\u0003\u0007\u0601\b\u0007\u0001\u0007"+
		"\u0003\u0007\u0604\b\u0007\u0001\u0007\u0003\u0007\u0607\b\u0007\u0001"+
		"\u0007\u0003\u0007\u060a\b\u0007\u0001\u0007\u0003\u0007\u060d\b\u0007"+
		"\u0001\u0007\u0005\u0007\u0610\b\u0007\n\u0007\f\u0007\u0613\t\u0007\u0001"+
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
		"\u0007\u0663\b\u0007\u000b\u0007\f\u0007\u0664\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0688\b\u0007\u0001\u0007\u0003\u0007\u068b\b"+
		"\u0007\u0001\u0007\u0003\u0007\u068e\b\u0007\u0001\u0007\u0003\u0007\u0691"+
		"\b\u0007\u0001\u0007\u0003\u0007\u0694\b\u0007\u0001\u0007\u0003\u0007"+
		"\u0697\b\u0007\u0001\u0007\u0005\u0007\u069a\b\u0007\n\u0007\f\u0007\u069d"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u06af"+
		"\b\u0007\u000b\u0007\f\u0007\u06b0\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u06ba\b\u0007"+
		"\u000b\u0007\f\u0007\u06bb\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
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
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0811\b\b\u0001"+
		"\b\u0003\b\u0814\b\b\u0001\b\u0003\b\u0817\b\b\u0001\b\u0003\b\u081a\b"+
		"\b\u0001\b\u0003\b\u081d\b\b\u0001\b\u0003\b\u0820\b\b\u0001\b\u0005\b"+
		"\u0823\b\b\n\b\f\b\u0826\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u082f\b\b\n\b\f\b\u0832\t\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u083a\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u0887\b\b\u0001\b\u0003\b\u088a\b\b\u0001\b\u0003\b\u088d\b\b\u0001"+
		"\b\u0003\b\u0890\b\b\u0001\b\u0003\b\u0893\b\b\u0001\b\u0003\b\u0896\b"+
		"\b\u0001\b\u0005\b\u0899\b\b\n\b\f\b\u089c\t\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u08ae\b\b\u000b\b\f\b\u08af"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u08b9"+
		"\b\b\u000b\b\f\b\u08ba\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u0912"+
		"\b\t\u000b\t\f\t\u0913\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u095d\b\t\u0001\t\u0003\t\u0960\b\t\u0001\t"+
		"\u0003\t\u0963\b\t\u0001\t\u0003\t\u0966\b\t\u0001\t\u0003\t\u0969\b\t"+
		"\u0001\t\u0003\t\u096c\b\t\u0001\t\u0005\t\u096f\b\t\n\t\f\t\u0972\t\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0004\t\u097e\b\t\u000b\t\f\t\u097f\u0003\t\u0982\b\t\u0004"+
		"\t\u0984\b\t\u000b\t\f\t\u0985\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0004\t\u098f\b\t\u000b\t\f\t\u0990\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0004\u000b\u09a0\b\u000b\u000b\u000b\f\u000b\u09a1"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0004\f\u09a9\b\f\u000b"+
		"\f\f\f\u09aa\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u0000\u0001\u0001\u0000\u0005\n\u0a2d\u0000"+
		"#\u0001\u0000\u0000\u0000\u0002%\u0001\u0000\u0000\u0000\u0004\u012d\u0001"+
		"\u0000\u0000\u0000\u0006\u01c2\u0001\u0000\u0000\u0000\b\u0272\u0001\u0000"+
		"\u0000\u0000\n\u0333\u0001\u0000\u0000\u0000\f\u03fe\u0001\u0000\u0000"+
		"\u0000\u000e\u05d2\u0001\u0000\u0000\u0000\u0010\u06c9\u0001\u0000\u0000"+
		"\u0000\u0012\u08ca\u0001\u0000\u0000\u0000\u0014\u099b\u0001\u0000\u0000"+
		"\u0000\u0016\u099f\u0001\u0000\u0000\u0000\u0018\u09a8\u0001\u0000\u0000"+
		"\u0000\u001a$\u0003\u0012\t\u0000\u001b$\u0003\u0010\b\u0000\u001c$\u0003"+
		"\u000e\u0007\u0000\u001d$\u0003\f\u0006\u0000\u001e$\u0003\n\u0005\u0000"+
		"\u001f$\u0003\u0006\u0003\u0000 $\u0003\b\u0004\u0000!$\u0003\u0002\u0001"+
		"\u0000\"$\u0003\u0004\u0002\u0000#\u001a\u0001\u0000\u0000\u0000#\u001b"+
		"\u0001\u0000\u0000\u0000#\u001c\u0001\u0000\u0000\u0000#\u001d\u0001\u0000"+
		"\u0000\u0000#\u001e\u0001\u0000\u0000\u0000#\u001f\u0001\u0000\u0000\u0000"+
		"# \u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000"+
		"\u0000$\u0001\u0001\u0000\u0000\u0000%&\u0005\u0005\u0000\u0000&\'\u0005"+
		"\u0003\u0000\u0000\'(\u0005\n\u0000\u0000()\u0005\u0003\u0000\u0000)*"+
		"\u0005\n\u0000\u0000*+\u0005\n\u0000\u0000+,\u0005\n\u0000\u0000,-\u0005"+
		"\n\u0000\u0000-.\u0005\n\u0000\u0000./\u0005\n\u0000\u0000/0\u0005\n\u0000"+
		"\u000001\u0005\u0003\u0000\u000012\u0005\n\u0000\u00002\u011a\u0005\u0004"+
		"\u0000\u000034\u0003\u0014\n\u000045\u0005\u0003\u0000\u000056\u0005\u0004"+
		"\u0000\u000068\u0001\u0000\u0000\u000073\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;<\u0003\u0014\n\u0000<=\u0005\u0003\u0000\u0000"+
		"=>\u0005\u0003\u0000\u0000>?\u0005\u0003\u0000\u0000?@\u0005\u0003\u0000"+
		"\u0000@A\u0005\u0003\u0000\u0000AB\u0005\u0004\u0000\u0000BC\u0003\u0014"+
		"\n\u0000CD\u0005\u0003\u0000\u0000DE\u0005\u0003\u0000\u0000EF\u0005\u0003"+
		"\u0000\u0000FG\u0005\u0004\u0000\u0000GH\u0003\u0014\n\u0000HI\u0005\u0003"+
		"\u0000\u0000IJ\u0005\u0003\u0000\u0000JK\u0005\u0003\u0000\u0000KL\u0005"+
		"\u0003\u0000\u0000LM\u0005\u0003\u0000\u0000MN\u0005\u0004\u0000\u0000"+
		"NO\u0003\u0014\n\u0000OP\u0005\u0003\u0000\u0000PQ\u0005\u0003\u0000\u0000"+
		"QR\u0005\u0003\u0000\u0000RS\u0005\u0003\u0000\u0000ST\u0005\u0003\u0000"+
		"\u0000TU\u0005\u0004\u0000\u0000UV\u0003\u0014\n\u0000VW\u0005\u0003\u0000"+
		"\u0000WX\u0005\u0003\u0000\u0000XY\u0005\u0003\u0000\u0000YZ\u0005\u0003"+
		"\u0000\u0000Z[\u0005\u0004\u0000\u0000[\\\u0003\u0014\n\u0000\\]\u0005"+
		"\u0003\u0000\u0000]^\u0005\u0004\u0000\u0000^_\u0003\u0014\n\u0000_`\u0005"+
		"\u0003\u0000\u0000`a\u0005\u0003\u0000\u0000ab\u0005\u0003\u0000\u0000"+
		"bc\u0005\u0003\u0000\u0000cd\u0005\u0003\u0000\u0000de\u0005\u0004\u0000"+
		"\u0000ef\u0003\u0014\n\u0000fg\u0005\u0003\u0000\u0000gh\u0005\u0003\u0000"+
		"\u0000hi\u0005\u0003\u0000\u0000ij\u0005\u0004\u0000\u0000jk\u0003\u0014"+
		"\n\u0000kl\u0005\u0003\u0000\u0000lm\u0005\u0003\u0000\u0000mn\u0005\u0003"+
		"\u0000\u0000no\u0005\u0003\u0000\u0000op\u0005\u0003\u0000\u0000pq\u0005"+
		"\u0004\u0000\u0000qr\u0003\u0014\n\u0000rs\u0005\u0003\u0000\u0000st\u0005"+
		"\u0003\u0000\u0000tu\u0005\u0003\u0000\u0000uv\u0005\u0003\u0000\u0000"+
		"vw\u0005\u0003\u0000\u0000wx\u0005\u0004\u0000\u0000xy\u0003\u0014\n\u0000"+
		"yz\u0005\u0003\u0000\u0000z{\u0005\u0003\u0000\u0000{|\u0005\u0003\u0000"+
		"\u0000|}\u0005\u0003\u0000\u0000}~\u0005\u0004\u0000\u0000~\u007f\u0003"+
		"\u0014\n\u0000\u007f\u0080\u0005\u0003\u0000\u0000\u0080\u0081\u0005\u0004"+
		"\u0000\u0000\u0081\u0082\u0003\u0014\n\u0000\u0082\u0083\u0005\u0003\u0000"+
		"\u0000\u0083\u0084\u0005\u0004\u0000\u0000\u0084\u0085\u0003\u0014\n\u0000"+
		"\u0085\u0086\u0005\u0003\u0000\u0000\u0086\u0087\u0005\u0004\u0000\u0000"+
		"\u0087\u0088\u0003\u0014\n\u0000\u0088\u0089\u0005\u0003\u0000\u0000\u0089"+
		"\u008a\u0005\u0004\u0000\u0000\u008a\u008b\u0003\u0014\n\u0000\u008b\u008c"+
		"\u0005\u0003\u0000\u0000\u008c\u008d\u0005\u0003\u0000\u0000\u008d\u008e"+
		"\u0005\u0003\u0000\u0000\u008e\u008f\u0005\u0003\u0000\u0000\u008f\u0090"+
		"\u0005\u0003\u0000\u0000\u0090\u0091\u0005\u0004\u0000\u0000\u0091\u0092"+
		"\u0003\u0014\n\u0000\u0092\u0093\u0005\u0003\u0000\u0000\u0093\u0094\u0005"+
		"\u0003\u0000\u0000\u0094\u0095\u0005\u0003\u0000\u0000\u0095\u0096\u0005"+
		"\u0004\u0000\u0000\u0096\u0097\u0003\u0014\n\u0000\u0097\u0098\u0005\u0003"+
		"\u0000\u0000\u0098\u0099\u0005\u0003\u0000\u0000\u0099\u009a\u0005\u0003"+
		"\u0000\u0000\u009a\u009b\u0005\u0003\u0000\u0000\u009b\u009c\u0005\u0003"+
		"\u0000\u0000\u009c\u009d\u0005\u0004\u0000\u0000\u009d\u009e\u0003\u0014"+
		"\n\u0000\u009e\u009f\u0005\u0003\u0000\u0000\u009f\u00a0\u0005\u0003\u0000"+
		"\u0000\u00a0\u00a1\u0005\u0003\u0000\u0000\u00a1\u00a2\u0005\u0003\u0000"+
		"\u0000\u00a2\u00a3\u0005\u0003\u0000\u0000\u00a3\u00a4\u0005\u0004\u0000"+
		"\u0000\u00a4\u00a5\u0003\u0014\n\u0000\u00a5\u00a6\u0005\u0003\u0000\u0000"+
		"\u00a6\u00a7\u0005\u0003\u0000\u0000\u00a7\u00a8\u0005\u0003\u0000\u0000"+
		"\u00a8\u00a9\u0005\u0003\u0000\u0000\u00a9\u00aa\u0005\u0004\u0000\u0000"+
		"\u00aa\u00ab\u0003\u0014\n\u0000\u00ab\u00ac\u0005\u0003\u0000\u0000\u00ac"+
		"\u00ad\u0005\u0004\u0000\u0000\u00ad\u00ae\u0003\u0014\n\u0000\u00ae\u00af"+
		"\u0005\u0003\u0000\u0000\u00af\u00b0\u0005\u0004\u0000\u0000\u00b0\u00b1"+
		"\u0003\u0014\n\u0000\u00b1\u00b2\u0005\u0003\u0000\u0000\u00b2\u00b3\u0005"+
		"\u0004\u0000\u0000\u00b3\u00b4\u0003\u0014\n\u0000\u00b4\u00b5\u0005\u0003"+
		"\u0000\u0000\u00b5\u00b6\u0005\u0003\u0000\u0000\u00b6\u00b7\u0005\u0003"+
		"\u0000\u0000\u00b7\u00b8\u0005\u0003\u0000\u0000\u00b8\u00b9\u0005\u0003"+
		"\u0000\u0000\u00b9\u00ba\u0005\u0004\u0000\u0000\u00ba\u00bb\u0003\u0014"+
		"\n\u0000\u00bb\u00bc\u0005\u0003\u0000\u0000\u00bc\u00bd\u0005\u0003\u0000"+
		"\u0000\u00bd\u00be\u0005\u0003\u0000\u0000\u00be\u00bf\u0005\u0004\u0000"+
		"\u0000\u00bf\u00c0\u0003\u0014\n\u0000\u00c0\u00c1\u0005\u0003\u0000\u0000"+
		"\u00c1\u00c2\u0005\u0003\u0000\u0000\u00c2\u00c3\u0005\u0003\u0000\u0000"+
		"\u00c3\u00c4\u0005\u0003\u0000\u0000\u00c4\u00c5\u0005\u0003\u0000\u0000"+
		"\u00c5\u00c6\u0005\u0004\u0000\u0000\u00c6\u00c7\u0003\u0014\n\u0000\u00c7"+
		"\u00c8\u0005\u0003\u0000\u0000\u00c8\u00c9\u0005\u0003\u0000\u0000\u00c9"+
		"\u00ca\u0005\u0003\u0000\u0000\u00ca\u00cb\u0005\u0003\u0000\u0000\u00cb"+
		"\u00cc\u0005\u0003\u0000\u0000\u00cc\u00cd\u0005\u0004\u0000\u0000\u00cd"+
		"\u00ce\u0003\u0014\n\u0000\u00ce\u00cf\u0005\u0003\u0000\u0000\u00cf\u00d0"+
		"\u0005\u0003\u0000\u0000\u00d0\u00d1\u0005\u0003\u0000\u0000\u00d1\u00d2"+
		"\u0005\u0003\u0000\u0000\u00d2\u00d3\u0005\u0004\u0000\u0000\u00d3\u00d4"+
		"\u0003\u0014\n\u0000\u00d4\u00d5\u0005\u0003\u0000\u0000\u00d5\u00d6\u0005"+
		"\n\u0000\u0000\u00d6\u00d7\u0005\u0004\u0000\u0000\u00d7\u00d8\u0003\u0014"+
		"\n\u0000\u00d8\u00d9\u0005\u0003\u0000\u0000\u00d9\u010b\u0005\u0004\u0000"+
		"\u0000\u00da\u00db\u0003\u0014\n\u0000\u00db\u00dc\u0005\u0003\u0000\u0000"+
		"\u00dc\u00dd\u0005\u0006\u0000\u0000\u00dd\u00de\u0005\u0004\u0000\u0000"+
		"\u00de\u00df\u0003\u0014\n\u0000\u00df\u00e0\u0005\u0003\u0000\u0000\u00e0"+
		"\u00e1\u0005\b\u0000\u0000\u00e1\u00e2\u0005\u0004\u0000\u0000\u00e2\u00e3"+
		"\u0003\u0014\n\u0000\u00e3\u00e4\u0005\u0003\u0000\u0000\u00e4\u00e5\u0005"+
		"\b\u0000\u0000\u00e5\u00e6\u0005\u0004\u0000\u0000\u00e6\u00e7\u0003\u0014"+
		"\n\u0000\u00e7\u00e8\u0005\u0003\u0000\u0000\u00e8\u00e9\u0005\b\u0000"+
		"\u0000\u00e9\u00ea\u0005\u0004\u0000\u0000\u00ea\u00eb\u0003\u0014\n\u0000"+
		"\u00eb\u00ec\u0005\u0003\u0000\u0000\u00ec\u00ed\u0005\b\u0000\u0000\u00ed"+
		"\u00ee\u0005\u0004\u0000\u0000\u00ee\u00ef\u0003\u0014\n\u0000\u00ef\u00f0"+
		"\u0005\u0003\u0000\u0000\u00f0\u00f1\u0005\b\u0000\u0000\u00f1\u00f2\u0005"+
		"\u0004\u0000\u0000\u00f2\u00f3\u0003\u0014\n\u0000\u00f3\u00f4\u0005\u0003"+
		"\u0000\u0000\u00f4\u00f5\u0005\b\u0000\u0000\u00f5\u00f6\u0005\u0004\u0000"+
		"\u0000\u00f6\u00f7\u0003\u0014\n\u0000\u00f7\u00f8\u0005\u0003\u0000\u0000"+
		"\u00f8\u00f9\u0005\b\u0000\u0000\u00f9\u00fa\u0005\u0004\u0000\u0000\u00fa"+
		"\u00fb\u0003\u0014\n\u0000\u00fb\u00fc\u0005\u0003\u0000\u0000\u00fc\u00fd"+
		"\u0005\b\u0000\u0000\u00fd\u00fe\u0005\u0004\u0000\u0000\u00fe\u00ff\u0003"+
		"\u0014\n\u0000\u00ff\u0100\u0005\u0003\u0000\u0000\u0100\u0101\u0005\b"+
		"\u0000\u0000\u0101\u0102\u0005\u0004\u0000\u0000\u0102\u0103\u0003\u0014"+
		"\n\u0000\u0103\u0104\u0005\u0003\u0000\u0000\u0104\u0105\u0005\b\u0000"+
		"\u0000\u0105\u0106\u0005\u0004\u0000\u0000\u0106\u0107\u0003\u0014\n\u0000"+
		"\u0107\u0108\u0005\u0003\u0000\u0000\u0108\u0109\u0005\u0004\u0000\u0000"+
		"\u0109\u010a\u0006\u0001\uffff\uffff\u0000\u010a\u010c\u0001\u0000\u0000"+
		"\u0000\u010b\u00da\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000"+
		"\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000"+
		"\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f7\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0005\n\u0000\u0000\u0114\u0115\u0005\u0003\u0000\u0000\u0115"+
		"\u0116\u0005\n\u0000\u0000\u0116\u0117\u0005\u0003\u0000\u0000\u0117\u0118"+
		"\u0005\u0006\u0000\u0000\u0118\u0119\u0005\u0004\u0000\u0000\u0119\u011b"+
		"\u0001\u0000\u0000\u0000\u011a\u010f\u0001\u0000\u0000\u0000\u011b\u011c"+
		"\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011f"+
		"\u0005\u0005\u0000\u0000\u011f\u0120\u0005\u0003\u0000\u0000\u0120\u0121"+
		"\u0005\n\u0000\u0000\u0121\u0122\u0005\u0003\u0000\u0000\u0122\u0123\u0005"+
		"\n\u0000\u0000\u0123\u0124\u0005\n\u0000\u0000\u0124\u0125\u0005\n\u0000"+
		"\u0000\u0125\u0126\u0005\n\u0000\u0000\u0126\u0127\u0005\n\u0000\u0000"+
		"\u0127\u0128\u0005\n\u0000\u0000\u0128\u0129\u0005\n\u0000\u0000\u0129"+
		"\u012a\u0005\u0003\u0000\u0000\u012a\u012b\u0005\n\u0000\u0000\u012b\u012c"+
		"\u0005\u0004\u0000\u0000\u012c\u0003\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0005\u0005\u0000\u0000\u012e\u012f\u0005\u0003\u0000\u0000\u012f\u0130"+
		"\u0005\n\u0000\u0000\u0130\u0131\u0005\u0003\u0000\u0000\u0131\u0132\u0005"+
		"\n\u0000\u0000\u0132\u0133\u0005\n\u0000\u0000\u0133\u0134\u0005\n\u0000"+
		"\u0000\u0134\u0135\u0005\n\u0000\u0000\u0135\u0136\u0005\n\u0000\u0000"+
		"\u0136\u0137\u0005\n\u0000\u0000\u0137\u0138\u0005\n\u0000\u0000\u0138"+
		"\u0139\u0005\u0003\u0000\u0000\u0139\u013a\u0005\n\u0000\u0000\u013a\u01af"+
		"\u0005\u0004\u0000\u0000\u013b\u013c\u0003\u0014\n\u0000\u013c\u013d\u0005"+
		"\u0003\u0000\u0000\u013d\u0144\u0005\u0004\u0000\u0000\u013e\u013f\u0003"+
		"\u0014\n\u0000\u013f\u0140\u0005\u0003\u0000\u0000\u0140\u0141\u0005\u0003"+
		"\u0000\u0000\u0141\u0142\u0005\u0003\u0000\u0000\u0142\u0143\u0005\u0004"+
		"\u0000\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u013e\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0003\u0014\n\u0000\u0149\u014a\u0005\u0003\u0000"+
		"\u0000\u014a\u014b\u0005\u0003\u0000\u0000\u014b\u014c\u0005\u0003\u0000"+
		"\u0000\u014c\u014d\u0005\n\u0000\u0000\u014d\u014e\u0005\u0004\u0000\u0000"+
		"\u014e\u014f\u0003\u0014\n\u0000\u014f\u0150\u0005\u0003\u0000\u0000\u0150"+
		"\u0151\u0005\u0003\u0000\u0000\u0151\u0152\u0005\u0003\u0000\u0000\u0152"+
		"\u01a0\u0005\u0004\u0000\u0000\u0153\u0154\u0003\u0014\n\u0000\u0154\u0155"+
		"\u0005\u0003\u0000\u0000\u0155\u0156\u0005\u0006\u0000\u0000\u0156\u0157"+
		"\u0005\u0004\u0000\u0000\u0157\u0158\u0003\u0014\n\u0000\u0158\u0159\u0005"+
		"\u0003\u0000\u0000\u0159\u015a\u0005\b\u0000\u0000\u015a\u015b\u0005\u0004"+
		"\u0000\u0000\u015b\u015c\u0003\u0014\n\u0000\u015c\u015d\u0005\u0003\u0000"+
		"\u0000\u015d\u015e\u0005\b\u0000\u0000\u015e\u015f\u0005\u0004\u0000\u0000"+
		"\u015f\u0160\u0003\u0014\n\u0000\u0160\u0161\u0005\u0003\u0000\u0000\u0161"+
		"\u0162\u0005\b\u0000\u0000\u0162\u0163\u0005\u0004\u0000\u0000\u0163\u0164"+
		"\u0003\u0014\n\u0000\u0164\u0165\u0005\u0003\u0000\u0000\u0165\u0166\u0005"+
		"\b\u0000\u0000\u0166\u0167\u0005\u0004\u0000\u0000\u0167\u0168\u0003\u0014"+
		"\n\u0000\u0168\u0169\u0005\u0003\u0000\u0000\u0169\u016a\u0005\b\u0000"+
		"\u0000\u016a\u016b\u0005\u0004\u0000\u0000\u016b\u016c\u0003\u0014\n\u0000"+
		"\u016c\u016d\u0005\u0003\u0000\u0000\u016d\u016e\u0005\b\u0000\u0000\u016e"+
		"\u016f\u0005\u0004\u0000\u0000\u016f\u0170\u0003\u0014\n\u0000\u0170\u0171"+
		"\u0005\u0003\u0000\u0000\u0171\u0172\u0005\b\u0000\u0000\u0172\u0173\u0005"+
		"\u0004\u0000\u0000\u0173\u0174\u0003\u0014\n\u0000\u0174\u0175\u0005\u0003"+
		"\u0000\u0000\u0175\u0176\u0005\b\u0000\u0000\u0176\u0177\u0005\u0004\u0000"+
		"\u0000\u0177\u0178\u0003\u0014\n\u0000\u0178\u0179\u0005\u0003\u0000\u0000"+
		"\u0179\u017a\u0005\b\u0000\u0000\u017a\u017b\u0005\u0004\u0000\u0000\u017b"+
		"\u017c\u0003\u0014\n\u0000\u017c\u017d\u0005\u0003\u0000\u0000\u017d\u017e"+
		"\u0005\b\u0000\u0000\u017e\u017f\u0005\u0004\u0000\u0000\u017f\u0180\u0003"+
		"\u0014\n\u0000\u0180\u0181\u0005\u0003\u0000\u0000\u0181\u0182\u0005\b"+
		"\u0000\u0000\u0182\u0183\u0005\u0004\u0000\u0000\u0183\u0184\u0003\u0014"+
		"\n\u0000\u0184\u0185\u0005\u0003\u0000\u0000\u0185\u0186\u0005\b\u0000"+
		"\u0000\u0186\u0187\u0005\u0004\u0000\u0000\u0187\u0188\u0003\u0014\n\u0000"+
		"\u0188\u018a\u0005\u0003\u0000\u0000\u0189\u018b\u0003\u0014\n\u0000\u018a"+
		"\u0189\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c"+
		"\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d"+
		"\u018e\u0001\u0000\u0000\u0000\u018e\u018f\u0005\u0004\u0000\u0000\u018f"+
		"\u0190\u0003\u0014\n\u0000\u0190\u0191\u0005\u0003\u0000\u0000\u0191\u0192"+
		"\u0003\u0014\n\u0000\u0192\u0193\u0005\u0004\u0000\u0000\u0193\u0194\u0003"+
		"\u0014\n\u0000\u0194\u0195\u0005\u0003\u0000\u0000\u0195\u0196\u0003\u0014"+
		"\n\u0000\u0196\u0197\u0005\u0004\u0000\u0000\u0197\u0198\u0003\u0014\n"+
		"\u0000\u0198\u0199\u0005\u0003\u0000\u0000\u0199\u019a\u0003\u0014\n\u0000"+
		"\u019a\u019b\u0005\u0004\u0000\u0000\u019b\u019c\u0003\u0014\n\u0000\u019c"+
		"\u019d\u0005\u0003\u0000\u0000\u019d\u019e\u0005\u0004\u0000\u0000\u019e"+
		"\u019f\u0006\u0002\uffff\uffff\u0000\u019f\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a0\u0153\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a5\u0001\u0000\u0000\u0000\u01a4\u013b\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a9\u0005\n\u0000\u0000\u01a9\u01aa\u0005\u0003\u0000\u0000\u01aa"+
		"\u01ab\u0005\n\u0000\u0000\u01ab\u01ac\u0005\u0003\u0000\u0000\u01ac\u01ad"+
		"\u0005\u0006\u0000\u0000\u01ad\u01ae\u0005\u0004\u0000\u0000\u01ae\u01b0"+
		"\u0001\u0000\u0000\u0000\u01af\u01a4\u0001\u0000\u0000\u0000\u01b0\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b4"+
		"\u0005\u0005\u0000\u0000\u01b4\u01b5\u0005\u0003\u0000\u0000\u01b5\u01b6"+
		"\u0005\n\u0000\u0000\u01b6\u01b7\u0005\u0003\u0000\u0000\u01b7\u01b8\u0005"+
		"\n\u0000\u0000\u01b8\u01b9\u0005\n\u0000\u0000\u01b9\u01ba\u0005\n\u0000"+
		"\u0000\u01ba\u01bb\u0005\n\u0000\u0000\u01bb\u01bc\u0005\n\u0000\u0000"+
		"\u01bc\u01bd\u0005\n\u0000\u0000\u01bd\u01be\u0005\n\u0000\u0000\u01be"+
		"\u01bf\u0005\u0003\u0000\u0000\u01bf\u01c0\u0005\n\u0000\u0000\u01c0\u01c1"+
		"\u0005\u0004\u0000\u0000\u01c1\u0005\u0001\u0000\u0000\u0000\u01c2\u01c3"+
		"\u0005\u0005\u0000\u0000\u01c3\u01c4\u0005\u0003\u0000\u0000\u01c4\u01c5"+
		"\u0005\n\u0000\u0000\u01c5\u01c6\u0005\u0003\u0000\u0000\u01c6\u01c7\u0005"+
		"\n\u0000\u0000\u01c7\u01c8\u0005\n\u0000\u0000\u01c8\u01c9\u0005\n\u0000"+
		"\u0000\u01c9\u01ca\u0005\n\u0000\u0000\u01ca\u01cb\u0005\n\u0000\u0000"+
		"\u01cb\u01cc\u0005\n\u0000\u0000\u01cc\u01cd\u0005\u0003\u0000\u0000\u01cd"+
		"\u01ce\u0005\n\u0000\u0000\u01ce\u01cf\u0005\u0004\u0000\u0000\u01cf\u01d0"+
		"\u0005\u0005\u0000\u0000\u01d0\u01d1\u0005\u0003\u0000\u0000\u01d1\u01d2"+
		"\u0005\n\u0000\u0000\u01d2\u01d3\u0005\u0004\u0000\u0000\u01d3\u01d4\u0005"+
		"\n\u0000\u0000\u01d4\u01d5\u0005\u0003\u0000\u0000\u01d5\u01d6\u0005\n"+
		"\u0000\u0000\u01d6\u01d7\u0005\u0003\u0000\u0000\u01d7\u01d9\u0003\u0014"+
		"\n\u0000\u01d8\u01da\u0003\u0014\n\u0000\u01d9\u01d8\u0001\u0000\u0000"+
		"\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01dc\u0001\u0000\u0000"+
		"\u0000\u01db\u01dd\u0003\u0014\n\u0000\u01dc\u01db\u0001\u0000\u0000\u0000"+
		"\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01df\u0001\u0000\u0000\u0000"+
		"\u01de\u01e0\u0003\u0014\n\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01df"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e2\u0001\u0000\u0000\u0000\u01e1"+
		"\u01e3\u0003\u0014\n\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e2\u01e3"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e5\u0001\u0000\u0000\u0000\u01e4\u01e6"+
		"\u0003\u0014\n\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e8\u0001\u0000\u0000\u0000\u01e7\u01e9\u0003"+
		"\u0014\n\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000"+
		"\u0000\u0000\u01e9\u01ed\u0001\u0000\u0000\u0000\u01ea\u01ec\u0003\u0014"+
		"\n\u0000\u01eb\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ef\u0001\u0000\u0000"+
		"\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000"+
		"\u0000\u01ee\u01f0\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f2\u0005\u0003\u0000\u0000\u01f1\u01f3\u0003\u0014\n\u0000"+
		"\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005\u0003\u0000\u0000"+
		"\u01f7\u01f8\u0005\u0004\u0000\u0000\u01f8\u01f9\u0005\n\u0000\u0000\u01f9"+
		"\u01fa\u0005\u0003\u0000\u0000\u01fa\u01fb\u0005\n\u0000\u0000\u01fb\u01fc"+
		"\u0005\u0003\u0000\u0000\u01fc\u01fd\u0005\n\u0000\u0000\u01fd\u01fe\u0005"+
		"\u0003\u0000\u0000\u01fe\u01ff\u0003\u0014\n\u0000\u01ff\u0200\u0005\u0003"+
		"\u0000\u0000\u0200\u0201\u0005\u0004\u0000\u0000\u0201\u0202\u0005\n\u0000"+
		"\u0000\u0202\u0203\u0005\u0003\u0000\u0000\u0203\u0204\u0005\n\u0000\u0000"+
		"\u0204\u0205\u0005\u0003\u0000\u0000\u0205\u0206\u0003\u0014\n\u0000\u0206"+
		"\u0207\u0005\u0003\u0000\u0000\u0207\u0208\u0005\b\u0000\u0000\u0208\u0209"+
		"\u0005\u0003\u0000\u0000\u0209\u020a\u0005\u0004\u0000\u0000\u020a\u020b"+
		"\u0005\n\u0000\u0000\u020b\u020c\u0005\u0003\u0000\u0000\u020c\u020d\u0005"+
		"\n\u0000\u0000\u020d\u020e\u0005\u0003\u0000\u0000\u020e\u020f\u0005\b"+
		"\u0000\u0000\u020f\u0210\u0005\u0003\u0000\u0000\u0210\u0211\u0005\n\u0000"+
		"\u0000\u0211\u0212\u0005\u0003\u0000\u0000\u0212\u0213\u0005\u0004\u0000"+
		"\u0000\u0213\u0214\u0005\n\u0000\u0000\u0214\u0215\u0005\u0003\u0000\u0000"+
		"\u0215\u0216\u0005\n\u0000\u0000\u0216\u0217\u0005\u0003\u0000\u0000\u0217"+
		"\u0218\u0005\u0006\u0000\u0000\u0218\u0219\u0005\u0003\u0000\u0000\u0219"+
		"\u021a\u0005\u0006\u0000\u0000\u021a\u021b\u0005\u0003\u0000\u0000\u021b"+
		"\u021c\u0005\u0004\u0000\u0000\u021c\u021d\u0005\n\u0000\u0000\u021d\u021e"+
		"\u0005\u0003\u0000\u0000\u021e\u021f\u0005\n\u0000\u0000\u021f\u0220\u0005"+
		"\u0003\u0000\u0000\u0220\u0222\u0003\u0014\n\u0000\u0221\u0223\u0003\u0014"+
		"\n\u0000\u0222\u0221\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000"+
		"\u0000\u0223\u0225\u0001\u0000\u0000\u0000\u0224\u0226\u0003\u0014\n\u0000"+
		"\u0225\u0224\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000"+
		"\u0226\u0228\u0001\u0000\u0000\u0000\u0227\u0229\u0003\u0014\n\u0000\u0228"+
		"\u0227\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229"+
		"\u022b\u0001\u0000\u0000\u0000\u022a\u022c\u0003\u0014\n\u0000\u022b\u022a"+
		"\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022e"+
		"\u0001\u0000\u0000\u0000\u022d\u022f\u0003\u0014\n\u0000\u022e\u022d\u0001"+
		"\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0231\u0001"+
		"\u0000\u0000\u0000\u0230\u0232\u0003\u0014\n\u0000\u0231\u0230\u0001\u0000"+
		"\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0236\u0001\u0000"+
		"\u0000\u0000\u0233\u0235\u0003\u0014\n\u0000\u0234\u0233\u0001\u0000\u0000"+
		"\u0000\u0235\u0238\u0001\u0000\u0000\u0000\u0236\u0234\u0001\u0000\u0000"+
		"\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u0239\u0001\u0000\u0000"+
		"\u0000\u0238\u0236\u0001\u0000\u0000\u0000\u0239\u023b\u0005\u0003\u0000"+
		"\u0000\u023a\u023c\u0003\u0014\n\u0000\u023b\u023a\u0001\u0000\u0000\u0000"+
		"\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000"+
		"\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000"+
		"\u023f\u0240\u0005\u0003\u0000\u0000\u0240\u0241\u0005\u0004\u0000\u0000"+
		"\u0241\u0242\u0005\n\u0000\u0000\u0242\u0244\u0005\u0003\u0000\u0000\u0243"+
		"\u0245\u0003\u0014\n\u0000\u0244\u0243\u0001\u0000\u0000\u0000\u0245\u0246"+
		"\u0001\u0000\u0000\u0000\u0246\u0244\u0001\u0000\u0000\u0000\u0246\u0247"+
		"\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u0249"+
		"\u0005\u0003\u0000\u0000\u0249\u024a\u0005\u0004\u0000\u0000\u024a\u024b"+
		"\u0005\n\u0000\u0000\u024b\u024e\u0005\u0003\u0000\u0000\u024c\u024d\u0005"+
		"\b\u0000\u0000\u024d\u024f\u0005\u0003\u0000\u0000\u024e\u024c\u0001\u0000"+
		"\u0000\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024f\u0253\u0001\u0000"+
		"\u0000\u0000\u0250\u0252\u0003\u0014\n\u0000\u0251\u0250\u0001\u0000\u0000"+
		"\u0000\u0252\u0255\u0001\u0000\u0000\u0000\u0253\u0251\u0001\u0000\u0000"+
		"\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0256\u0001\u0000\u0000"+
		"\u0000\u0255\u0253\u0001\u0000\u0000\u0000\u0256\u0257\u0005\u0003\u0000"+
		"\u0000\u0257\u0258\u0005\u0004\u0000\u0000\u0258\u0259\u0005\n\u0000\u0000"+
		"\u0259\u025a\u0005\u0003\u0000\u0000\u025a\u025b\u0005\n\u0000\u0000\u025b"+
		"\u025c\u0005\u0003\u0000\u0000\u025c\u025d\u0005\u0004\u0000\u0000\u025d"+
		"\u025e\u0005\n\u0000\u0000\u025e\u025f\u0005\u0003\u0000\u0000\u025f\u0260"+
		"\u0005\n\u0000\u0000\u0260\u0261\u0005\u0003\u0000\u0000\u0261\u0262\u0005"+
		"\u0006\u0000\u0000\u0262\u0263\u0005\u0004\u0000\u0000\u0263\u0264\u0005"+
		"\u0005\u0000\u0000\u0264\u0265\u0005\u0003\u0000\u0000\u0265\u0266\u0005"+
		"\n\u0000\u0000\u0266\u0267\u0005\u0003\u0000\u0000\u0267\u0268\u0005\n"+
		"\u0000\u0000\u0268\u0269\u0005\n\u0000\u0000\u0269\u026a\u0005\n\u0000"+
		"\u0000\u026a\u026b\u0005\n\u0000\u0000\u026b\u026c\u0005\n\u0000\u0000"+
		"\u026c\u026d\u0005\n\u0000\u0000\u026d\u026e\u0005\u0003\u0000\u0000\u026e"+
		"\u026f\u0005\n\u0000\u0000\u026f\u0270\u0005\u0004\u0000\u0000\u0270\u0271"+
		"\u0006\u0003\uffff\uffff\u0000\u0271\u0007\u0001\u0000\u0000\u0000\u0272"+
		"\u0273\u0005\u0005\u0000\u0000\u0273\u0274\u0005\u0003\u0000\u0000\u0274"+
		"\u0275\u0005\n\u0000\u0000\u0275\u0276\u0005\u0003\u0000\u0000\u0276\u0277"+
		"\u0005\n\u0000\u0000\u0277\u0278\u0005\n\u0000\u0000\u0278\u0279\u0005"+
		"\n\u0000\u0000\u0279\u027a\u0005\n\u0000\u0000\u027a\u027b\u0005\n\u0000"+
		"\u0000\u027b\u027c\u0005\n\u0000\u0000\u027c\u027d\u0005\u0003\u0000\u0000"+
		"\u027d\u027e\u0005\n\u0000\u0000\u027e\u027f\u0005\u0004\u0000\u0000\u027f"+
		"\u0280\u0005\u0005\u0000\u0000\u0280\u0281\u0005\u0003\u0000\u0000\u0281"+
		"\u0283\u0003\u0014\n\u0000\u0282\u0284\u0003\u0014\n\u0000\u0283\u0282"+
		"\u0001\u0000\u0000\u0000\u0283\u0284\u0001\u0000\u0000\u0000\u0284\u0286"+
		"\u0001\u0000\u0000\u0000\u0285\u0287\u0003\u0014\n\u0000\u0286\u0285\u0001"+
		"\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0289\u0001"+
		"\u0000\u0000\u0000\u0288\u028a\u0003\u0014\n\u0000\u0289\u0288\u0001\u0000"+
		"\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028c\u0001\u0000"+
		"\u0000\u0000\u028b\u028d\u0003\u0014\n\u0000\u028c\u028b\u0001\u0000\u0000"+
		"\u0000\u028c\u028d\u0001\u0000\u0000\u0000\u028d\u028f\u0001\u0000\u0000"+
		"\u0000\u028e\u0290\u0003\u0014\n\u0000\u028f\u028e\u0001\u0000\u0000\u0000"+
		"\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u0292\u0001\u0000\u0000\u0000"+
		"\u0291\u0293\u0003\u0014\n\u0000\u0292\u0291\u0001\u0000\u0000\u0000\u0292"+
		"\u0293\u0001\u0000\u0000\u0000\u0293\u0297\u0001\u0000\u0000\u0000\u0294"+
		"\u0296\u0003\u0014\n\u0000\u0295\u0294\u0001\u0000\u0000\u0000\u0296\u0299"+
		"\u0001\u0000\u0000\u0000\u0297\u0295\u0001\u0000\u0000\u0000\u0297\u0298"+
		"\u0001\u0000\u0000\u0000\u0298\u029a\u0001\u0000\u0000\u0000\u0299\u0297"+
		"\u0001\u0000\u0000\u0000\u029a\u029b\u0005\u0004\u0000\u0000\u029b\u029c"+
		"\u0005\n\u0000\u0000\u029c\u029d\u0005\u0003\u0000\u0000\u029d\u029e\u0005"+
		"\n\u0000\u0000\u029e\u02a0\u0005\u0003\u0000\u0000\u029f\u02a1\u0003\u0014"+
		"\n\u0000\u02a0\u029f\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001\u0000\u0000"+
		"\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000"+
		"\u0000\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4\u02a6\u0005\u0003\u0000"+
		"\u0000\u02a5\u02a7\u0003\u0014\n\u0000\u02a6\u02a5\u0001\u0000\u0000\u0000"+
		"\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000"+
		"\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000"+
		"\u02aa\u02ab\u0005\u0003\u0000\u0000\u02ab\u02ac\u0005\u0004\u0000\u0000"+
		"\u02ac\u02ad\u0005\n\u0000\u0000\u02ad\u02ae\u0005\u0003\u0000\u0000\u02ae"+
		"\u02af\u0005\n\u0000\u0000\u02af\u02b0\u0005\u0003\u0000\u0000\u02b0\u02b1"+
		"\u0005\n\u0000\u0000\u02b1\u02b2\u0005\u0003\u0000\u0000\u02b2\u02b3\u0003"+
		"\u0014\n\u0000\u02b3\u02b4\u0005\u0003\u0000\u0000\u02b4\u02b5\u0005\u0004"+
		"\u0000\u0000\u02b5\u02b6\u0005\n\u0000\u0000\u02b6\u02b7\u0005\u0003\u0000"+
		"\u0000\u02b7\u02b8\u0005\n\u0000\u0000\u02b8\u02ba\u0005\u0003\u0000\u0000"+
		"\u02b9\u02bb\u0003\u0014\n\u0000\u02ba\u02b9\u0001\u0000\u0000\u0000\u02bb"+
		"\u02bc\u0001\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bc"+
		"\u02bd\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000\u0000\u0000\u02be"+
		"\u02c0\u0005\u0003\u0000\u0000\u02bf\u02c1\u0003\u0014\n\u0000\u02c0\u02bf"+
		"\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u02c0"+
		"\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c4"+
		"\u0001\u0000\u0000\u0000\u02c4\u02c5\u0005\u0003\u0000\u0000\u02c5\u02c6"+
		"\u0005\u0004\u0000\u0000\u02c6\u02c7\u0005\n\u0000\u0000\u02c7\u02c8\u0005"+
		"\u0003\u0000\u0000\u02c8\u02c9\u0005\n\u0000\u0000\u02c9\u02ca\u0005\u0003"+
		"\u0000\u0000\u02ca\u02cb\u0005\b\u0000\u0000\u02cb\u02cc\u0005\u0003\u0000"+
		"\u0000\u02cc\u02cd\u0005\b\u0000\u0000\u02cd\u02ce\u0005\u0003\u0000\u0000"+
		"\u02ce\u02cf\u0005\u0004\u0000\u0000\u02cf\u02d0\u0005\n\u0000\u0000\u02d0"+
		"\u02d1\u0005\u0003\u0000\u0000\u02d1\u02d2\u0005\n\u0000\u0000\u02d2\u02d3"+
		"\u0005\u0003\u0000\u0000\u02d3\u02d4\u0005\b\u0000\u0000\u02d4\u02d5\u0005"+
		"\u0003\u0000\u0000\u02d5\u02d6\u0005\u0006\u0000\u0000\u02d6\u02d7\u0005"+
		"\u0003\u0000\u0000\u02d7\u02d8\u0005\u0004\u0000\u0000\u02d8\u02d9\u0005"+
		"\n\u0000\u0000\u02d9\u02da\u0005\u0003\u0000\u0000\u02da\u02db\u0005\n"+
		"\u0000\u0000\u02db\u02dc\u0005\u0003\u0000\u0000\u02dc\u02dd\u0005\n\u0000"+
		"\u0000\u02dd\u02de\u0005\u0003\u0000\u0000\u02de\u02df\u0005\n\u0000\u0000"+
		"\u02df\u02e0\u0005\u0003\u0000\u0000\u02e0\u02e1\u0005\u0004\u0000\u0000"+
		"\u02e1\u02e2\u0005\n\u0000\u0000\u02e2\u02e3\u0005\u0003\u0000\u0000\u02e3"+
		"\u02e4\u0005\n\u0000\u0000\u02e4\u02e5\u0005\u0003\u0000\u0000\u02e5\u02e6"+
		"\u0005\n\u0000\u0000\u02e6\u02e7\u0005\u0003\u0000\u0000\u02e7\u02e8\u0005"+
		"\n\u0000\u0000\u02e8\u02e9\u0005\u0003\u0000\u0000\u02e9\u02ea\u0005\u0004"+
		"\u0000\u0000\u02ea\u02eb\u0005\n\u0000\u0000\u02eb\u02ec\u0005\u0003\u0000"+
		"\u0000\u02ec\u02ed\u0005\n\u0000\u0000\u02ed\u02ee\u0005\u0003\u0000\u0000"+
		"\u02ee\u02ef\u0005\n\u0000\u0000\u02ef\u02f0\u0005\u0003\u0000\u0000\u02f0"+
		"\u02f2\u0003\u0014\n\u0000\u02f1\u02f3\u0003\u0014\n\u0000\u02f2\u02f1"+
		"\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f5"+
		"\u0001\u0000\u0000\u0000\u02f4\u02f6\u0003\u0014\n\u0000\u02f5\u02f4\u0001"+
		"\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6\u02f8\u0001"+
		"\u0000\u0000\u0000\u02f7\u02f9\u0003\u0014\n\u0000\u02f8\u02f7\u0001\u0000"+
		"\u0000\u0000\u02f8\u02f9\u0001\u0000\u0000\u0000\u02f9\u02fb\u0001\u0000"+
		"\u0000\u0000\u02fa\u02fc\u0003\u0014\n\u0000\u02fb\u02fa\u0001\u0000\u0000"+
		"\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc\u02fe\u0001\u0000\u0000"+
		"\u0000\u02fd\u02ff\u0003\u0014\n\u0000\u02fe\u02fd\u0001\u0000\u0000\u0000"+
		"\u02fe\u02ff\u0001\u0000\u0000\u0000\u02ff\u0301\u0001\u0000\u0000\u0000"+
		"\u0300\u0302\u0003\u0014\n\u0000\u0301\u0300\u0001\u0000\u0000\u0000\u0301"+
		"\u0302\u0001\u0000\u0000\u0000\u0302\u0306\u0001\u0000\u0000\u0000\u0303"+
		"\u0305\u0003\u0014\n\u0000\u0304\u0303\u0001\u0000\u0000\u0000\u0305\u0308"+
		"\u0001\u0000\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000\u0306\u0307"+
		"\u0001\u0000\u0000\u0000\u0307\u0309\u0001\u0000\u0000\u0000\u0308\u0306"+
		"\u0001\u0000\u0000\u0000\u0309\u030a\u0005\u0003\u0000\u0000\u030a\u030b"+
		"\u0005\u0004\u0000\u0000\u030b\u030c\u0005\n\u0000\u0000\u030c\u030d\u0005"+
		"\n\u0000\u0000\u030d\u030f\u0005\u0003\u0000\u0000\u030e\u0310\u0003\u0014"+
		"\n\u0000\u030f\u030e\u0001\u0000\u0000\u0000\u0310\u0311\u0001\u0000\u0000"+
		"\u0000\u0311\u030f\u0001\u0000\u0000\u0000\u0311\u0312\u0001\u0000\u0000"+
		"\u0000\u0312\u0313\u0001\u0000\u0000\u0000\u0313\u0314\u0005\u0003\u0000"+
		"\u0000\u0314\u0315\u0005\u0004\u0000\u0000\u0315\u0316\u0005\n\u0000\u0000"+
		"\u0316\u0318\u0005\u0003\u0000\u0000\u0317\u0319\u0003\u0014\n\u0000\u0318"+
		"\u0317\u0001\u0000\u0000\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031a"+
		"\u0318\u0001\u0000\u0000\u0000\u031a\u031b\u0001\u0000\u0000\u0000\u031b"+
		"\u031c\u0001\u0000\u0000\u0000\u031c\u031d\u0005\u0003\u0000\u0000\u031d"+
		"\u031e\u0005\u0004\u0000\u0000\u031e\u031f\u0005\n\u0000\u0000\u031f\u0320"+
		"\u0005\u0003\u0000\u0000\u0320\u0321\u0005\n\u0000\u0000\u0321\u0322\u0005"+
		"\u0003\u0000\u0000\u0322\u0323\u0005\u0006\u0000\u0000\u0323\u0324\u0005"+
		"\u0004\u0000\u0000\u0324\u0325\u0005\u0005\u0000\u0000\u0325\u0326\u0005"+
		"\u0003\u0000\u0000\u0326\u0327\u0005\n\u0000\u0000\u0327\u0328\u0005\u0003"+
		"\u0000\u0000\u0328\u0329\u0005\n\u0000\u0000\u0329\u032a\u0005\n\u0000"+
		"\u0000\u032a\u032b\u0005\n\u0000\u0000\u032b\u032c\u0005\n\u0000\u0000"+
		"\u032c\u032d\u0005\n\u0000\u0000\u032d\u032e\u0005\n\u0000\u0000\u032e"+
		"\u032f\u0005\u0003\u0000\u0000\u032f\u0330\u0005\n\u0000\u0000\u0330\u0331"+
		"\u0005\u0004\u0000\u0000\u0331\u0332\u0006\u0004\uffff\uffff\u0000\u0332"+
		"\t\u0001\u0000\u0000\u0000\u0333\u0334\u0005\u0005\u0000\u0000\u0334\u0335"+
		"\u0005\u0003\u0000\u0000\u0335\u0336\u0005\n\u0000\u0000\u0336\u0337\u0005"+
		"\u0003\u0000\u0000\u0337\u0338\u0005\n\u0000\u0000\u0338\u0339\u0005\n"+
		"\u0000\u0000\u0339\u033a\u0005\n\u0000\u0000\u033a\u033b\u0005\n\u0000"+
		"\u0000\u033b\u033c\u0005\n\u0000\u0000\u033c\u033d\u0005\n\u0000\u0000"+
		"\u033d\u033e\u0005\u0003\u0000\u0000\u033e\u033f\u0005\n\u0000\u0000\u033f"+
		"\u03ec\u0005\u0004\u0000\u0000\u0340\u0341\u0005\n\u0000\u0000\u0341\u0342"+
		"\u0005\u0003\u0000\u0000\u0342\u0348\u0005\u0004\u0000\u0000\u0343\u0344"+
		"\u0005\n\u0000\u0000\u0344\u0345\u0005\u0003\u0000\u0000\u0345\u0346\u0005"+
		"\u0003\u0000\u0000\u0346\u0347\u0005\u0003\u0000\u0000\u0347\u0349\u0005"+
		"\u0004\u0000\u0000\u0348\u0343\u0001\u0000\u0000\u0000\u0349\u034a\u0001"+
		"\u0000\u0000\u0000\u034a\u0348\u0001\u0000\u0000\u0000\u034a\u034b\u0001"+
		"\u0000\u0000\u0000\u034b\u034c\u0001\u0000\u0000\u0000\u034c\u034d\u0005"+
		"\n\u0000\u0000\u034d\u034e\u0005\u0003\u0000\u0000\u034e\u034f\u0005\u0003"+
		"\u0000\u0000\u034f\u0350\u0005\u0003\u0000\u0000\u0350\u0351\u0005\n\u0000"+
		"\u0000\u0351\u0352\u0005\u0004\u0000\u0000\u0352\u0353\u0005\n\u0000\u0000"+
		"\u0353\u0354\u0005\u0003\u0000\u0000\u0354\u0355\u0005\u0003\u0000\u0000"+
		"\u0355\u0356\u0005\u0003\u0000\u0000\u0356\u03e1\u0005\u0004\u0000\u0000"+
		"\u0357\u0358\u0005\n\u0000\u0000\u0358\u0359\u0005\u0003\u0000\u0000\u0359"+
		"\u035a\u0005\n\u0000\u0000\u035a\u035b\u0005\u0004\u0000\u0000\u035b\u035c"+
		"\u0005\n\u0000\u0000\u035c\u035d\u0005\u0003\u0000\u0000\u035d\u035e\u0003"+
		"\u0014\n\u0000\u035e\u035f\u0005\u0004\u0000\u0000\u035f\u0360\u0005\n"+
		"\u0000\u0000\u0360\u0361\u0005\u0003\u0000\u0000\u0361\u0362\u0005\u0004"+
		"\u0000\u0000\u0362\u0363\u0005\n\u0000\u0000\u0363\u0364\u0005\u0003\u0000"+
		"\u0000\u0364\u0366\u0005\u0003\u0000\u0000\u0365\u0367\u0003\u0014\n\u0000"+
		"\u0366\u0365\u0001\u0000\u0000\u0000\u0367\u0368\u0001\u0000\u0000\u0000"+
		"\u0368\u0366\u0001\u0000\u0000\u0000\u0368\u0369\u0001\u0000\u0000\u0000"+
		"\u0369\u036a\u0001\u0000\u0000\u0000\u036a\u036b\u0005\u0004\u0000\u0000"+
		"\u036b\u036c\u0005\n\u0000\u0000\u036c\u036d\u0005\u0003\u0000\u0000\u036d"+
		"\u036e\u0005\u0003\u0000\u0000\u036e\u0370\u0003\u0014\n\u0000\u036f\u0371"+
		"\u0003\u0014\n\u0000\u0370\u036f\u0001\u0000\u0000\u0000\u0370\u0371\u0001"+
		"\u0000\u0000\u0000\u0371\u0373\u0001\u0000\u0000\u0000\u0372\u0374\u0003"+
		"\u0014\n\u0000\u0373\u0372\u0001\u0000\u0000\u0000\u0373\u0374\u0001\u0000"+
		"\u0000\u0000\u0374\u0376\u0001\u0000\u0000\u0000\u0375\u0377\u0003\u0014"+
		"\n\u0000\u0376\u0375\u0001\u0000\u0000\u0000\u0376\u0377\u0001\u0000\u0000"+
		"\u0000\u0377\u0379\u0001\u0000\u0000\u0000\u0378\u037a\u0003\u0014\n\u0000"+
		"\u0379\u0378\u0001\u0000\u0000\u0000\u0379\u037a\u0001\u0000\u0000\u0000"+
		"\u037a\u037c\u0001\u0000\u0000\u0000\u037b\u037d\u0003\u0014\n\u0000\u037c"+
		"\u037b\u0001\u0000\u0000\u0000\u037c\u037d\u0001\u0000\u0000\u0000\u037d"+
		"\u037f\u0001\u0000\u0000\u0000\u037e\u0380\u0003\u0014\n\u0000\u037f\u037e"+
		"\u0001\u0000\u0000\u0000\u037f\u0380\u0001\u0000\u0000\u0000\u0380\u0384"+
		"\u0001\u0000\u0000\u0000\u0381\u0383\u0003\u0014\n\u0000\u0382\u0381\u0001"+
		"\u0000\u0000\u0000\u0383\u0386\u0001\u0000\u0000\u0000\u0384\u0382\u0001"+
		"\u0000\u0000\u0000\u0384\u0385\u0001\u0000\u0000\u0000\u0385\u0387\u0001"+
		"\u0000\u0000\u0000\u0386\u0384\u0001\u0000\u0000\u0000\u0387\u0388\u0005"+
		"\u0004\u0000\u0000\u0388\u0389\u0005\n\u0000\u0000\u0389\u038a\u0005\u0003"+
		"\u0000\u0000\u038a\u038b\u0005\u0004\u0000\u0000\u038b\u038c\u0005\n\u0000"+
		"\u0000\u038c\u038e\u0005\u0003\u0000\u0000\u038d\u038f\u0003\u0014\n\u0000"+
		"\u038e\u038d\u0001\u0000\u0000\u0000\u038f\u0390\u0001\u0000\u0000\u0000"+
		"\u0390\u038e\u0001\u0000\u0000\u0000\u0390\u0391\u0001\u0000\u0000\u0000"+
		"\u0391\u0392\u0001\u0000\u0000\u0000\u0392\u0393\u0005\u0004\u0000\u0000"+
		"\u0393\u0394\u0005\n\u0000\u0000\u0394\u0395\u0005\u0003\u0000\u0000\u0395"+
		"\u0396\u0005\u0006\u0000\u0000\u0396\u0397\u0005\u0004\u0000\u0000\u0397"+
		"\u0398\u0005\n\u0000\u0000\u0398\u039a\u0005\u0003\u0000\u0000\u0399\u039b"+
		"\u0003\u0014\n\u0000\u039a\u0399\u0001\u0000\u0000\u0000\u039b\u039c\u0001"+
		"\u0000\u0000\u0000\u039c\u039a\u0001\u0000\u0000\u0000\u039c\u039d\u0001"+
		"\u0000\u0000\u0000\u039d\u039e\u0001\u0000\u0000\u0000\u039e\u039f\u0005"+
		"\u0004\u0000\u0000\u039f\u03a0\u0005\n\u0000\u0000\u03a0\u03a2\u0005\u0003"+
		"\u0000\u0000\u03a1\u03a3\u0003\u0014\n\u0000\u03a2\u03a1\u0001\u0000\u0000"+
		"\u0000\u03a3\u03a4\u0001\u0000\u0000\u0000\u03a4\u03a2\u0001\u0000\u0000"+
		"\u0000\u03a4\u03a5\u0001\u0000\u0000\u0000\u03a5\u03a6\u0001\u0000\u0000"+
		"\u0000\u03a6\u03a7\u0005\u0004\u0000\u0000\u03a7\u03a8\u0005\n\u0000\u0000"+
		"\u03a8\u03aa\u0005\u0003\u0000\u0000\u03a9\u03ab\u0003\u0014\n\u0000\u03aa"+
		"\u03a9\u0001\u0000\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000\u0000\u03ac"+
		"\u03aa\u0001\u0000\u0000\u0000\u03ac\u03ad\u0001\u0000\u0000\u0000\u03ad"+
		"\u03ae\u0001\u0000\u0000\u0000\u03ae\u03af\u0005\u0004\u0000\u0000\u03af"+
		"\u03b0\u0005\n\u0000\u0000\u03b0\u03b1\u0005\u0003\u0000\u0000\u03b1\u03b2"+
		"\u0005\n\u0000\u0000\u03b2\u03b3\u0005\u0004\u0000\u0000\u03b3\u03b4\u0005"+
		"\n\u0000\u0000\u03b4\u03b5\u0005\u0003\u0000\u0000\u03b5\u03b6\u0005\u0004"+
		"\u0000\u0000\u03b6\u03b7\u0005\n\u0000\u0000\u03b7\u03b8\u0005\u0003\u0000"+
		"\u0000\u03b8\u03b9\u0005\u0003\u0000\u0000\u03b9\u03ba\u0005\n\u0000\u0000"+
		"\u03ba\u03bb\u0005\u0004\u0000\u0000\u03bb\u03bc\u0005\n\u0000\u0000\u03bc"+
		"\u03bd\u0005\u0003\u0000\u0000\u03bd\u03be\u0005\u0003\u0000\u0000\u03be"+
		"\u03bf\u0005\n\u0000\u0000\u03bf\u03c0\u0005\u0004\u0000\u0000\u03c0\u03c1"+
		"\u0005\n\u0000\u0000\u03c1\u03c2\u0005\u0003\u0000\u0000\u03c2\u03c3\u0005"+
		"\u0003\u0000\u0000\u03c3\u03c4\u0005\u0004\u0000\u0000\u03c4\u03c5\u0005"+
		"\n\u0000\u0000\u03c5\u03c6\u0005\u0003\u0000\u0000\u03c6\u03c7\u0005\b"+
		"\u0000\u0000\u03c7\u03c8\u0005\u0004\u0000\u0000\u03c8\u03c9\u0005\n\u0000"+
		"\u0000\u03c9\u03cb\u0005\u0003\u0000\u0000\u03ca\u03cc\u0003\u0014\n\u0000"+
		"\u03cb\u03ca\u0001\u0000\u0000\u0000\u03cc\u03cd\u0001\u0000\u0000\u0000"+
		"\u03cd\u03cb\u0001\u0000\u0000\u0000\u03cd\u03ce\u0001\u0000\u0000\u0000"+
		"\u03ce\u03cf\u0001\u0000\u0000\u0000\u03cf\u03d0\u0005\u0004\u0000\u0000"+
		"\u03d0\u03d1\u0005\n\u0000\u0000\u03d1\u03d2\u0005\u0003\u0000\u0000\u03d2"+
		"\u03d3\u0005\b\u0000\u0000\u03d3\u03d4\u0005\u0004\u0000\u0000\u03d4\u03d5"+
		"\u0005\n\u0000\u0000\u03d5\u03d6\u0005\u0003\u0000\u0000\u03d6\u03d7\u0005"+
		"\b\u0000\u0000\u03d7\u03d8\u0005\u0004\u0000\u0000\u03d8\u03d9\u0005\n"+
		"\u0000\u0000\u03d9\u03da\u0005\u0003\u0000\u0000\u03da\u03db\u0005\n\u0000"+
		"\u0000\u03db\u03dc\u0005\u0004\u0000\u0000\u03dc\u03dd\u0005\n\u0000\u0000"+
		"\u03dd\u03de\u0005\u0003\u0000\u0000\u03de\u03df\u0005\u0004\u0000\u0000"+
		"\u03df\u03e0\u0006\u0005\uffff\uffff\u0000\u03e0\u03e2\u0001\u0000\u0000"+
		"\u0000\u03e1\u0357\u0001\u0000\u0000\u0000\u03e2\u03e3\u0001\u0000\u0000"+
		"\u0000\u03e3\u03e1\u0001\u0000\u0000\u0000\u03e3\u03e4\u0001\u0000\u0000"+
		"\u0000\u03e4\u03e5\u0001\u0000\u0000\u0000\u03e5\u03e6\u0005\n\u0000\u0000"+
		"\u03e6\u03e7\u0005\u0003\u0000\u0000\u03e7\u03e8\u0005\n\u0000\u0000\u03e8"+
		"\u03e9\u0005\u0003\u0000\u0000\u03e9\u03ea\u0005\u0006\u0000\u0000\u03ea"+
		"\u03eb\u0005\u0004\u0000\u0000\u03eb\u03ed\u0001\u0000\u0000\u0000\u03ec"+
		"\u0340\u0001\u0000\u0000\u0000\u03ed\u03ee\u0001\u0000\u0000\u0000\u03ee"+
		"\u03ec\u0001\u0000\u0000\u0000\u03ee\u03ef\u0001\u0000\u0000\u0000\u03ef"+
		"\u03f0\u0001\u0000\u0000\u0000\u03f0\u03f1\u0005\u0005\u0000\u0000\u03f1"+
		"\u03f2\u0005\u0003\u0000\u0000\u03f2\u03f3\u0005\n\u0000\u0000\u03f3\u03f4"+
		"\u0005\u0003\u0000\u0000\u03f4\u03f5\u0005\n\u0000\u0000\u03f5\u03f6\u0005"+
		"\n\u0000\u0000\u03f6\u03f7\u0005\n\u0000\u0000\u03f7\u03f8\u0005\n\u0000"+
		"\u0000\u03f8\u03f9\u0005\n\u0000\u0000\u03f9\u03fa\u0005\n\u0000\u0000"+
		"\u03fa\u03fb\u0005\u0003\u0000\u0000\u03fb\u03fc\u0005\n\u0000\u0000\u03fc"+
		"\u03fd\u0005\u0004\u0000\u0000\u03fd\u000b\u0001\u0000\u0000\u0000\u03fe"+
		"\u03ff\u0005\u0005\u0000\u0000\u03ff\u0400\u0005\u0003\u0000\u0000\u0400"+
		"\u0401\u0005\n\u0000\u0000\u0401\u0402\u0005\u0003\u0000\u0000\u0402\u0403"+
		"\u0005\n\u0000\u0000\u0403\u0404\u0005\n\u0000\u0000\u0404\u0405\u0005"+
		"\n\u0000\u0000\u0405\u0406\u0005\n\u0000\u0000\u0406\u0407\u0005\n\u0000"+
		"\u0000\u0407\u0408\u0005\n\u0000\u0000\u0408\u0409\u0005\u0003\u0000\u0000"+
		"\u0409\u040a\u0005\n\u0000\u0000\u040a\u05c0\u0005\u0004\u0000\u0000\u040b"+
		"\u040c\u0005\u0005\u0000\u0000\u040c\u040d\u0005\u0003\u0000\u0000\u040d"+
		"\u040f\u0005\u0004\u0000\u0000\u040e\u040b\u0001\u0000\u0000\u0000\u040f"+
		"\u0410\u0001\u0000\u0000\u0000\u0410\u040e\u0001\u0000\u0000\u0000\u0410"+
		"\u0411\u0001\u0000\u0000\u0000\u0411\u0412\u0001\u0000\u0000\u0000\u0412"+
		"\u0413\u0005\u0005\u0000\u0000\u0413\u0414\u0005\u0003\u0000\u0000\u0414"+
		"\u0415\u0005\u0003\u0000\u0000\u0415\u0416\u0005\u0003\u0000\u0000\u0416"+
		"\u0417\u0005\u0003\u0000\u0000\u0417\u0418\u0005\u0003\u0000\u0000\u0418"+
		"\u0419\u0005\u0004\u0000\u0000\u0419\u041a\u0005\u0005\u0000\u0000\u041a"+
		"\u041b\u0005\u0003\u0000\u0000\u041b\u041c\u0005\u0003\u0000\u0000\u041c"+
		"\u041d\u0005\u0003\u0000\u0000\u041d\u041e\u0005\u0004\u0000\u0000\u041e"+
		"\u041f\u0005\u0005\u0000\u0000\u041f\u0420\u0005\u0003\u0000\u0000\u0420"+
		"\u0421\u0005\u0003\u0000\u0000\u0421\u0422\u0005\u0003\u0000\u0000\u0422"+
		"\u0423\u0005\u0003\u0000\u0000\u0423\u0424\u0005\u0003\u0000\u0000\u0424"+
		"\u0425\u0005\u0004\u0000\u0000\u0425\u0426\u0005\u0005\u0000\u0000\u0426"+
		"\u0427\u0005\u0003\u0000\u0000\u0427\u0428\u0005\u0003\u0000\u0000\u0428"+
		"\u0429\u0005\u0003\u0000\u0000\u0429\u042a\u0005\u0003\u0000\u0000\u042a"+
		"\u042b\u0005\u0003\u0000\u0000\u042b\u042c\u0005\u0004\u0000\u0000\u042c"+
		"\u042d\u0005\u0005\u0000\u0000\u042d\u042e\u0005\u0003\u0000\u0000\u042e"+
		"\u042f\u0005\u0003\u0000\u0000\u042f\u0430\u0005\u0003\u0000\u0000\u0430"+
		"\u0431\u0005\u0003\u0000\u0000\u0431\u0432\u0005\u0004\u0000\u0000\u0432"+
		"\u0433\u0005\u0005\u0000\u0000\u0433\u0434\u0005\u0003\u0000\u0000\u0434"+
		"\u0435\u0005\u0004\u0000\u0000\u0435\u0436\u0005\u0005\u0000\u0000\u0436"+
		"\u0437\u0005\u0003\u0000\u0000\u0437\u0438\u0005\u0003\u0000\u0000\u0438"+
		"\u0439\u0005\u0003\u0000\u0000\u0439\u043a\u0005\u0003\u0000\u0000\u043a"+
		"\u043b\u0005\u0003\u0000\u0000\u043b\u043c\u0005\u0004\u0000\u0000\u043c"+
		"\u043d\u0005\u0005\u0000\u0000\u043d\u043e\u0005\u0003\u0000\u0000\u043e"+
		"\u043f\u0005\u0003\u0000\u0000\u043f\u0440\u0005\u0003\u0000\u0000\u0440"+
		"\u0441\u0005\u0003\u0000\u0000\u0441\u0442\u0005\u0004\u0000\u0000\u0442"+
		"\u0443\u0005\u0005\u0000\u0000\u0443\u0444\u0005\u0003\u0000\u0000\u0444"+
		"\u0445\u0005\u0003\u0000\u0000\u0445\u0446\u0005\u0003\u0000\u0000\u0446"+
		"\u0447\u0005\u0004\u0000\u0000\u0447\u0448\u0005\u0005\u0000\u0000\u0448"+
		"\u0449\u0005\u0003\u0000\u0000\u0449\u044a\u0005\u0003\u0000\u0000\u044a"+
		"\u044b\u0005\u0003\u0000\u0000\u044b\u044c\u0005\u0004\u0000\u0000\u044c"+
		"\u044d\u0005\u0005\u0000\u0000\u044d\u044e\u0005\u0003\u0000\u0000\u044e"+
		"\u044f\u0005\u0003\u0000\u0000\u044f\u0450\u0005\u0003\u0000\u0000\u0450"+
		"\u0451\u0005\u0003\u0000\u0000\u0451\u0452\u0005\u0003\u0000\u0000\u0452"+
		"\u0453\u0005\u0004\u0000\u0000\u0453\u0454\u0005\u0005\u0000\u0000\u0454"+
		"\u0455\u0005\u0003\u0000\u0000\u0455\u0456\u0005\u0003\u0000\u0000\u0456"+
		"\u0457\u0005\u0003\u0000\u0000\u0457\u0458\u0005\u0003\u0000\u0000\u0458"+
		"\u0459\u0005\u0003\u0000\u0000\u0459\u045a\u0005\u0004\u0000\u0000\u045a"+
		"\u045b\u0005\u0005\u0000\u0000\u045b\u045c\u0005\u0003\u0000\u0000\u045c"+
		"\u045d\u0005\u0003\u0000\u0000\u045d\u045e\u0005\u0004\u0000\u0000\u045e"+
		"\u045f\u0005\u0005\u0000\u0000\u045f\u0460\u0005\u0003\u0000\u0000\u0460"+
		"\u0461\u0005\u0004\u0000\u0000\u0461\u0462\u0005\u0005\u0000\u0000\u0462"+
		"\u0463\u0005\u0003\u0000\u0000\u0463\u0464\u0005\u0003\u0000\u0000\u0464"+
		"\u0465\u0005\u0003\u0000\u0000\u0465\u0466\u0005\u0003\u0000\u0000\u0466"+
		"\u0467\u0005\u0003\u0000\u0000\u0467\u0468\u0005\u0004\u0000\u0000\u0468"+
		"\u0469\u0005\u0005\u0000\u0000\u0469\u046a\u0005\u0003\u0000\u0000\u046a"+
		"\u046b\u0005\u0003\u0000\u0000\u046b\u046c\u0005\u0003\u0000\u0000\u046c"+
		"\u046d\u0005\u0004\u0000\u0000\u046d\u046e\u0005\u0005\u0000\u0000\u046e"+
		"\u046f\u0005\u0003\u0000\u0000\u046f\u0470\u0005\u0003\u0000\u0000\u0470"+
		"\u0471\u0005\u0003\u0000\u0000\u0471\u0472\u0005\u0003\u0000\u0000\u0472"+
		"\u0473\u0005\u0003\u0000\u0000\u0473\u0474\u0005\u0004\u0000\u0000\u0474"+
		"\u0475\u0005\u0005\u0000\u0000\u0475\u0476\u0005\u0003\u0000\u0000\u0476"+
		"\u0477\u0005\u0003\u0000\u0000\u0477\u0478\u0005\u0003\u0000\u0000\u0478"+
		"\u0479\u0005\u0003\u0000\u0000\u0479\u047a\u0005\u0003\u0000\u0000\u047a"+
		"\u047b\u0005\u0004\u0000\u0000\u047b\u047c\u0005\u0005\u0000\u0000\u047c"+
		"\u047d\u0005\u0003\u0000\u0000\u047d\u047e\u0005\u0003\u0000\u0000\u047e"+
		"\u047f\u0005\u0003\u0000\u0000\u047f\u0480\u0005\u0003\u0000\u0000\u0480"+
		"\u0481\u0005\u0004\u0000\u0000\u0481\u0482\u0005\u0005\u0000\u0000\u0482"+
		"\u0483\u0005\u0003\u0000\u0000\u0483\u0484\u0005\u0004\u0000\u0000\u0484"+
		"\u0485\u0005\u0005\u0000\u0000\u0485\u0486\u0005\u0003\u0000\u0000\u0486"+
		"\u0487\u0005\u0003\u0000\u0000\u0487\u0488\u0005\u0003\u0000\u0000\u0488"+
		"\u0489\u0005\u0003\u0000\u0000\u0489\u048a\u0005\u0003\u0000\u0000\u048a"+
		"\u048b\u0005\u0004\u0000\u0000\u048b\u048c\u0005\u0005\u0000\u0000\u048c"+
		"\u048d\u0005\u0003\u0000\u0000\u048d\u048e\u0005\u0003\u0000\u0000\u048e"+
		"\u048f\u0005\u0003\u0000\u0000\u048f\u0490\u0005\u0004\u0000\u0000\u0490"+
		"\u0491\u0005\u0005\u0000\u0000\u0491\u0492\u0005\u0003\u0000\u0000\u0492"+
		"\u0493\u0005\u0003\u0000\u0000\u0493\u0494\u0005\u0003\u0000\u0000\u0494"+
		"\u0495\u0005\u0003\u0000\u0000\u0495\u0496\u0005\u0003\u0000\u0000\u0496"+
		"\u0497\u0005\u0004\u0000\u0000\u0497\u0498\u0005\u0005\u0000\u0000\u0498"+
		"\u0499\u0005\u0003\u0000\u0000\u0499\u049a\u0005\u0003\u0000\u0000\u049a"+
		"\u049b\u0005\u0003\u0000\u0000\u049b\u049c\u0005\u0003\u0000\u0000\u049c"+
		"\u049d\u0005\u0003\u0000\u0000\u049d\u049e\u0005\u0004\u0000\u0000\u049e"+
		"\u049f\u0005\u0005\u0000\u0000\u049f\u04a0\u0005\u0003\u0000\u0000\u04a0"+
		"\u04a1\u0005\u0003\u0000\u0000\u04a1\u04a2\u0005\u0003\u0000\u0000\u04a2"+
		"\u04a3\u0005\u0003\u0000\u0000\u04a3\u04a4\u0005\u0004\u0000\u0000\u04a4"+
		"\u04a5\u0005\u0005\u0000\u0000\u04a5\u04a6\u0005\u0003\u0000\u0000\u04a6"+
		"\u04a7\u0005\u0004\u0000\u0000\u04a7\u04a8\u0005\u0005\u0000\u0000\u04a8"+
		"\u04a9\u0005\u0003\u0000\u0000\u04a9\u04aa\u0005\u0003\u0000\u0000\u04aa"+
		"\u04ab\u0005\u0003\u0000\u0000\u04ab\u04ac\u0005\u0003\u0000\u0000\u04ac"+
		"\u04ad\u0005\u0003\u0000\u0000\u04ad\u04ae\u0005\u0004\u0000\u0000\u04ae"+
		"\u04af\u0005\u0005\u0000\u0000\u04af\u04b0\u0005\u0003\u0000\u0000\u04b0"+
		"\u04b1\u0005\u0003\u0000\u0000\u04b1\u04b2\u0005\u0003\u0000\u0000\u04b2"+
		"\u04b3\u0005\u0004\u0000\u0000\u04b3\u04b4\u0005\u0005\u0000\u0000\u04b4"+
		"\u04b5\u0005\u0003\u0000\u0000\u04b5\u04b6\u0005\u0003\u0000\u0000\u04b6"+
		"\u04b7\u0005\u0003\u0000\u0000\u04b7\u04b8\u0005\u0003\u0000\u0000\u04b8"+
		"\u04b9\u0005\u0003\u0000\u0000\u04b9\u04ba\u0005\u0004\u0000\u0000\u04ba"+
		"\u04bb\u0005\u0005\u0000\u0000\u04bb\u04bc\u0005\u0003\u0000\u0000\u04bc"+
		"\u04bd\u0005\u0003\u0000\u0000\u04bd\u04be\u0005\u0003\u0000\u0000\u04be"+
		"\u04bf\u0005\u0003\u0000\u0000\u04bf\u04c0\u0005\u0003\u0000\u0000\u04c0"+
		"\u04c1\u0005\u0004\u0000\u0000\u04c1\u04c2\u0005\u0005\u0000\u0000\u04c2"+
		"\u04c3\u0005\u0003\u0000\u0000\u04c3\u04c4\u0005\u0003\u0000\u0000\u04c4"+
		"\u04c5\u0005\u0003\u0000\u0000\u04c5\u04c6\u0005\u0003\u0000\u0000\u04c6"+
		"\u04c7\u0005\u0004\u0000\u0000\u04c7\u04c8\u0005\u0005\u0000\u0000\u04c8"+
		"\u04c9\u0005\u0003\u0000\u0000\u04c9\u04ca\u0005\u0004\u0000\u0000\u04ca"+
		"\u04cb\u0005\u0005\u0000\u0000\u04cb\u04cc\u0005\u0003\u0000\u0000\u04cc"+
		"\u04cd\u0005\u0004\u0000\u0000\u04cd\u04ce\u0005\u0005\u0000\u0000\u04ce"+
		"\u04cf\u0005\u0003\u0000\u0000\u04cf\u04d0\u0005\u0003\u0000\u0000\u04d0"+
		"\u04d1\u0005\u0003\u0000\u0000\u04d1\u04d2\u0005\u0003\u0000\u0000\u04d2"+
		"\u04d3\u0005\u0003\u0000\u0000\u04d3\u04d4\u0005\u0004\u0000\u0000\u04d4"+
		"\u04d5\u0005\u0005\u0000\u0000\u04d5\u04d6\u0005\u0003\u0000\u0000\u04d6"+
		"\u04d7\u0005\u0003\u0000\u0000\u04d7\u04d8\u0005\u0003\u0000\u0000\u04d8"+
		"\u04d9\u0005\u0004\u0000\u0000\u04d9\u04da\u0005\u0005\u0000\u0000\u04da"+
		"\u04db\u0005\u0003\u0000\u0000\u04db\u04dc\u0005\u0003\u0000\u0000\u04dc"+
		"\u04dd\u0005\u0003\u0000\u0000\u04dd\u04de\u0005\u0003\u0000\u0000\u04de"+
		"\u04df\u0005\u0003\u0000\u0000\u04df\u04e0\u0005\u0004\u0000\u0000\u04e0"+
		"\u04e1\u0005\u0005\u0000\u0000\u04e1\u04e2\u0005\u0003\u0000\u0000\u04e2"+
		"\u04e3\u0005\u0003\u0000\u0000\u04e3\u04e4\u0005\u0003\u0000\u0000\u04e4"+
		"\u04e5\u0005\u0003\u0000\u0000\u04e5\u04e6\u0005\u0003\u0000\u0000\u04e6"+
		"\u04e7\u0005\u0004\u0000\u0000\u04e7\u04e8\u0005\u0005\u0000\u0000\u04e8"+
		"\u04e9\u0005\u0003\u0000\u0000\u04e9\u04ea\u0005\u0003\u0000\u0000\u04ea"+
		"\u04eb\u0005\u0003\u0000\u0000\u04eb\u04ec\u0005\u0003\u0000\u0000\u04ec"+
		"\u04ed\u0005\u0004\u0000\u0000\u04ed\u04ee\u0005\u0005\u0000\u0000\u04ee"+
		"\u04ef\u0005\u0003\u0000\u0000\u04ef\u04f0\u0005\u0004\u0000\u0000\u04f0"+
		"\u04f1\u0005\u0005\u0000\u0000\u04f1\u04f2\u0005\u0003\u0000\u0000\u04f2"+
		"\u04f3\u0005\u0003\u0000\u0000\u04f3\u04f4\u0005\u0003\u0000\u0000\u04f4"+
		"\u04f5\u0005\u0003\u0000\u0000\u04f5\u04f6\u0005\u0003\u0000\u0000\u04f6"+
		"\u04f7\u0005\u0004\u0000\u0000\u04f7\u04f8\u0005\u0005\u0000\u0000\u04f8"+
		"\u04f9\u0005\u0003\u0000\u0000\u04f9\u04fa\u0005\u0003\u0000\u0000\u04fa"+
		"\u04fb\u0005\u0003\u0000\u0000\u04fb\u04fc\u0005\u0004\u0000\u0000\u04fc"+
		"\u04fd\u0005\u0005\u0000\u0000\u04fd\u04fe\u0005\u0003\u0000\u0000\u04fe"+
		"\u04ff\u0005\u0003\u0000\u0000\u04ff\u0500\u0005\u0003\u0000\u0000\u0500"+
		"\u0501\u0005\u0003\u0000\u0000\u0501\u0502\u0005\u0003\u0000\u0000\u0502"+
		"\u0503\u0005\u0004\u0000\u0000\u0503\u0504\u0005\u0005\u0000\u0000\u0504"+
		"\u0505\u0005\u0003\u0000\u0000\u0505\u0506\u0005\u0003\u0000\u0000\u0506"+
		"\u0507\u0005\u0003\u0000\u0000\u0507\u0508\u0005\u0003\u0000\u0000\u0508"+
		"\u0509\u0005\u0003\u0000\u0000\u0509\u050a\u0005\u0004\u0000\u0000\u050a"+
		"\u050b\u0005\u0005\u0000\u0000\u050b\u050c\u0005\u0003\u0000\u0000\u050c"+
		"\u050d\u0005\u0003\u0000\u0000\u050d\u050e\u0005\u0003\u0000\u0000\u050e"+
		"\u050f\u0005\u0003\u0000\u0000\u050f\u0510\u0005\u0004\u0000\u0000\u0510"+
		"\u0511\u0005\u0005\u0000\u0000\u0511\u0512\u0005\u0003\u0000\u0000\u0512"+
		"\u0513\u0005\u0004\u0000\u0000\u0513\u0514\u0005\u0005\u0000\u0000\u0514"+
		"\u0515\u0005\u0003\u0000\u0000\u0515\u0516\u0005\u0003\u0000\u0000\u0516"+
		"\u0517\u0005\u0003\u0000\u0000\u0517\u0518\u0005\u0003\u0000\u0000\u0518"+
		"\u0519\u0005\u0003\u0000\u0000\u0519\u051a\u0005\u0004\u0000\u0000\u051a"+
		"\u051b\u0005\u0005\u0000\u0000\u051b\u051c\u0005\u0003\u0000\u0000\u051c"+
		"\u051d\u0005\u0003\u0000\u0000\u051d\u051e\u0005\u0003\u0000\u0000\u051e"+
		"\u051f\u0005\u0004\u0000\u0000\u051f\u0520\u0005\u0005\u0000\u0000\u0520"+
		"\u0521\u0005\u0003\u0000\u0000\u0521\u0522\u0005\u0003\u0000\u0000\u0522"+
		"\u0523\u0005\u0003\u0000\u0000\u0523\u0524\u0005\u0003\u0000\u0000\u0524"+
		"\u0525\u0005\u0003\u0000\u0000\u0525\u0526\u0005\u0004\u0000\u0000\u0526"+
		"\u0527\u0005\u0005\u0000\u0000\u0527\u0528\u0005\u0003\u0000\u0000\u0528"+
		"\u0529\u0005\u0003\u0000\u0000\u0529\u052a\u0005\u0003\u0000\u0000\u052a"+
		"\u052b\u0005\u0003\u0000\u0000\u052b\u052c\u0005\u0003\u0000\u0000\u052c"+
		"\u052d\u0005\u0004\u0000\u0000\u052d\u052e\u0005\u0005\u0000\u0000\u052e"+
		"\u052f\u0005\u0003\u0000\u0000\u052f\u0530\u0005\u0003\u0000\u0000\u0530"+
		"\u0531\u0005\u0003\u0000\u0000\u0531\u0532\u0005\u0003\u0000\u0000\u0532"+
		"\u0533\u0005\u0004\u0000\u0000\u0533\u0534\u0005\u0005\u0000\u0000\u0534"+
		"\u0535\u0005\u0003\u0000\u0000\u0535\u0536\u0005\n\u0000\u0000\u0536\u0537"+
		"\u0005\u0004\u0000\u0000\u0537\u0538\u0005\u0005\u0000\u0000\u0538\u0539"+
		"\u0005\u0003\u0000\u0000\u0539\u05b5\u0005\u0004\u0000\u0000\u053a\u053b"+
		"\u0005\u0005\u0000\u0000\u053b\u053c\u0005\u0003\u0000\u0000\u053c\u053d"+
		"\u0005\n\u0000\u0000\u053d\u053e\u0005\u0004\u0000\u0000\u053e\u053f\u0005"+
		"\u0005\u0000\u0000\u053f\u0540\u0005\u0003\u0000\u0000\u0540\u0541\u0003"+
		"\u0014\n\u0000\u0541\u0542\u0005\u0004\u0000\u0000\u0542\u0543\u0005\u0005"+
		"\u0000\u0000\u0543\u0544\u0005\u0003\u0000\u0000\u0544\u0545\u0005\u0004"+
		"\u0000\u0000\u0545\u0546\u0005\u0005\u0000\u0000\u0546\u0547\u0005\u0003"+
		"\u0000\u0000\u0547\u0548\u0005\u0003\u0000\u0000\u0548\u0549\u0005\u0004"+
		"\u0000\u0000\u0549\u054a\u0005\u0005\u0000\u0000\u054a\u054b\u0005\u0003"+
		"\u0000\u0000\u054b\u054c\u0005\u0003\u0000\u0000\u054c\u054e\u0005\u0003"+
		"\u0000\u0000\u054d\u054f\u0003\u0014\n\u0000\u054e\u054d\u0001\u0000\u0000"+
		"\u0000\u054f\u0550\u0001\u0000\u0000\u0000\u0550\u054e\u0001\u0000\u0000"+
		"\u0000\u0550\u0551\u0001\u0000\u0000\u0000\u0551\u0552\u0001\u0000\u0000"+
		"\u0000\u0552\u0553\u0005\u0004\u0000\u0000\u0553\u0554\u0005\u0005\u0000"+
		"\u0000\u0554\u0555\u0005\u0003\u0000\u0000\u0555\u0556\u0005\u0003\u0000"+
		"\u0000\u0556\u0557\u0005\u0003\u0000\u0000\u0557\u0559\u0003\u0014\n\u0000"+
		"\u0558\u055a\u0003\u0014\n\u0000\u0559\u0558\u0001\u0000\u0000\u0000\u0559"+
		"\u055a\u0001\u0000\u0000\u0000\u055a\u055c\u0001\u0000\u0000\u0000\u055b"+
		"\u055d\u0003\u0014\n\u0000\u055c\u055b\u0001\u0000\u0000\u0000\u055c\u055d"+
		"\u0001\u0000\u0000\u0000\u055d\u055f\u0001\u0000\u0000\u0000\u055e\u0560"+
		"\u0003\u0014\n\u0000\u055f\u055e\u0001\u0000\u0000\u0000\u055f\u0560\u0001"+
		"\u0000\u0000\u0000\u0560\u0562\u0001\u0000\u0000\u0000\u0561\u0563\u0003"+
		"\u0014\n\u0000\u0562\u0561\u0001\u0000\u0000\u0000\u0562\u0563\u0001\u0000"+
		"\u0000\u0000\u0563\u0565\u0001\u0000\u0000\u0000\u0564\u0566\u0003\u0014"+
		"\n\u0000\u0565\u0564\u0001\u0000\u0000\u0000\u0565\u0566\u0001\u0000\u0000"+
		"\u0000\u0566\u0568\u0001\u0000\u0000\u0000\u0567\u0569\u0003\u0014\n\u0000"+
		"\u0568\u0567\u0001\u0000\u0000\u0000\u0568\u0569\u0001\u0000\u0000\u0000"+
		"\u0569\u056d\u0001\u0000\u0000\u0000\u056a\u056c\u0003\u0014\n\u0000\u056b"+
		"\u056a\u0001\u0000\u0000\u0000\u056c\u056f\u0001\u0000\u0000\u0000\u056d"+
		"\u056b\u0001\u0000\u0000\u0000\u056d\u056e\u0001\u0000\u0000\u0000\u056e"+
		"\u0570\u0001\u0000\u0000\u0000\u056f\u056d\u0001\u0000\u0000\u0000\u0570"+
		"\u0571\u0005\u0004\u0000\u0000\u0571\u0572\u0005\u0005\u0000\u0000\u0572"+
		"\u0573\u0005\u0003\u0000\u0000\u0573\u0574\u0005\u0003\u0000\u0000\u0574"+
		"\u0576\u0005\u0003\u0000\u0000\u0575\u0577\u0003\u0014\n\u0000\u0576\u0575"+
		"\u0001\u0000\u0000\u0000\u0577\u0578\u0001\u0000\u0000\u0000\u0578\u0576"+
		"\u0001\u0000\u0000\u0000\u0578\u0579\u0001\u0000\u0000\u0000\u0579\u057a"+
		"\u0001\u0000\u0000\u0000\u057a\u057b\u0005\u0004\u0000\u0000\u057b\u057c"+
		"\u0005\u0005\u0000\u0000\u057c\u057d\u0005\u0003\u0000\u0000\u057d\u057e"+
		"\u0005\u0003\u0000\u0000\u057e\u057f\u0005\u0003\u0000\u0000\u057f\u0580"+
		"\u0005\u0004\u0000\u0000\u0580\u0581\u0005\u0005\u0000\u0000\u0581\u0582"+
		"\u0005\u0003\u0000\u0000\u0582\u0583\u0005\u0003\u0000\u0000\u0583\u0584"+
		"\u0005\u0003\u0000\u0000\u0584\u0585\u0005\u0004\u0000\u0000\u0585\u0586"+
		"\u0005\u0005\u0000\u0000\u0586\u0587\u0005\u0003\u0000\u0000\u0587\u0588"+
		"\u0005\u0003\u0000\u0000\u0588\u0589\u0005\u0004\u0000\u0000\u0589\u058a"+
		"\u0005\u0005\u0000\u0000\u058a\u058b\u0005\u0003\u0000\u0000\u058b\u058c"+
		"\u0005\u0006\u0000\u0000\u058c\u058d\u0005\u0004\u0000\u0000\u058d\u058e"+
		"\u0005\u0005\u0000\u0000\u058e\u058f\u0005\u0003\u0000\u0000\u058f\u0593"+
		"\u0005\n\u0000\u0000\u0590\u0592\u0003\u0014\n\u0000\u0591\u0590\u0001"+
		"\u0000\u0000\u0000\u0592\u0595\u0001\u0000\u0000\u0000\u0593\u0591\u0001"+
		"\u0000\u0000\u0000\u0593\u0594\u0001\u0000\u0000\u0000\u0594\u0596\u0001"+
		"\u0000\u0000\u0000\u0595\u0593\u0001\u0000\u0000\u0000\u0596\u0597\u0005"+
		"\u0004\u0000\u0000\u0597\u0598\u0005\u0005\u0000\u0000\u0598\u0599\u0005"+
		"\u0003\u0000\u0000\u0599\u059a\u0005\n\u0000\u0000\u059a\u059b\u0005\u0004"+
		"\u0000\u0000\u059b\u059c\u0005\u0005\u0000\u0000\u059c\u05a0\u0005\u0003"+
		"\u0000\u0000\u059d\u059f\u0003\u0014\n\u0000\u059e\u059d\u0001\u0000\u0000"+
		"\u0000\u059f\u05a2\u0001\u0000\u0000\u0000\u05a0\u059e\u0001\u0000\u0000"+
		"\u0000\u05a0\u05a1\u0001\u0000\u0000\u0000\u05a1\u05a3\u0001\u0000\u0000"+
		"\u0000\u05a2\u05a0\u0001\u0000\u0000\u0000\u05a3\u05a4\u0005\u0004\u0000"+
		"\u0000\u05a4\u05a5\u0005\u0005\u0000\u0000\u05a5\u05a6\u0005\u0003\u0000"+
		"\u0000\u05a6\u05a7\u0005\n\u0000\u0000\u05a7\u05a8\u0005\u0004\u0000\u0000"+
		"\u05a8\u05a9\u0005\u0005\u0000\u0000\u05a9\u05aa\u0005\u0003\u0000\u0000"+
		"\u05aa\u05ab\u0003\u0014\n\u0000\u05ab\u05ac\u0005\u0004\u0000\u0000\u05ac"+
		"\u05ad\u0005\u0005\u0000\u0000\u05ad\u05ae\u0005\u0003\u0000\u0000\u05ae"+
		"\u05af\u0005\b\u0000\u0000\u05af\u05b0\u0005\u0004\u0000\u0000\u05b0\u05b1"+
		"\u0005\u0005\u0000\u0000\u05b1\u05b2\u0005\u0003\u0000\u0000\u05b2\u05b3"+
		"\u0005\u0004\u0000\u0000\u05b3\u05b4\u0006\u0006\uffff\uffff\u0000\u05b4"+
		"\u05b6\u0001\u0000\u0000\u0000\u05b5\u053a\u0001\u0000\u0000\u0000\u05b6"+
		"\u05b7\u0001\u0000\u0000\u0000\u05b7\u05b5\u0001\u0000\u0000\u0000\u05b7"+
		"\u05b8\u0001\u0000\u0000\u0000\u05b8\u05b9\u0001\u0000\u0000\u0000\u05b9"+
		"\u05ba\u0005\n\u0000\u0000\u05ba\u05bb\u0005\u0003\u0000\u0000\u05bb\u05bc"+
		"\u0005\n\u0000\u0000\u05bc\u05bd\u0005\u0003\u0000\u0000\u05bd\u05be\u0005"+
		"\u0006\u0000\u0000\u05be\u05bf\u0005\u0004\u0000\u0000\u05bf\u05c1\u0001"+
		"\u0000\u0000\u0000\u05c0\u040e\u0001\u0000\u0000\u0000\u05c1\u05c2\u0001"+
		"\u0000\u0000\u0000\u05c2\u05c0\u0001\u0000\u0000\u0000\u05c2\u05c3\u0001"+
		"\u0000\u0000\u0000\u05c3\u05c4\u0001\u0000\u0000\u0000\u05c4\u05c5\u0005"+
		"\u0005\u0000\u0000\u05c5\u05c6\u0005\u0003\u0000\u0000\u05c6\u05c7\u0005"+
		"\n\u0000\u0000\u05c7\u05c8\u0005\u0003\u0000\u0000\u05c8\u05c9\u0005\n"+
		"\u0000\u0000\u05c9\u05ca\u0005\n\u0000\u0000\u05ca\u05cb\u0005\n\u0000"+
		"\u0000\u05cb\u05cc\u0005\n\u0000\u0000\u05cc\u05cd\u0005\n\u0000\u0000"+
		"\u05cd\u05ce\u0005\n\u0000\u0000\u05ce\u05cf\u0005\u0003\u0000\u0000\u05cf"+
		"\u05d0\u0005\n\u0000\u0000\u05d0\u05d1\u0005\u0004\u0000\u0000\u05d1\r"+
		"\u0001\u0000\u0000\u0000\u05d2\u05d3\u0005\u0005\u0000\u0000\u05d3\u05d4"+
		"\u0005\u0003\u0000\u0000\u05d4\u05d5\u0005\n\u0000\u0000\u05d5\u05d6\u0005"+
		"\u0003\u0000\u0000\u05d6\u05d7\u0005\n\u0000\u0000\u05d7\u05d8\u0005\n"+
		"\u0000\u0000\u05d8\u05d9\u0005\n\u0000\u0000\u05d9\u05da\u0005\n\u0000"+
		"\u0000\u05da\u05db\u0005\u0003\u0000\u0000\u05db\u05dc\u0005\n\u0000\u0000"+
		"\u05dc\u06b9\u0005\u0004\u0000\u0000\u05dd\u05de\u0005\n\u0000\u0000\u05de"+
		"\u05df\u0005\u0003\u0000\u0000\u05df\u05e0\u0005\u0006\u0000\u0000\u05e0"+
		"\u05e1\u0005\u0003\u0000\u0000\u05e1\u05e3\u0005\u0004\u0000\u0000\u05e2"+
		"\u05dd\u0001\u0000\u0000\u0000\u05e3\u05e4\u0001\u0000\u0000\u0000\u05e4"+
		"\u05e2\u0001\u0000\u0000\u0000\u05e4\u05e5\u0001\u0000\u0000\u0000\u05e5"+
		"\u05e6\u0001\u0000\u0000\u0000\u05e6\u05e7\u0005\n\u0000\u0000\u05e7\u05e8"+
		"\u0005\u0003\u0000\u0000\u05e8\u05e9\u0005\u0006\u0000\u0000\u05e9\u05ea"+
		"\u0005\u0003\u0000\u0000\u05ea\u05eb\u0005\n\u0000\u0000\u05eb\u05ec\u0005"+
		"\u0004\u0000\u0000\u05ec\u05ed\u0005\n\u0000\u0000\u05ed\u05ee\u0005\u0003"+
		"\u0000\u0000\u05ee\u05ef\u0005\u0006\u0000\u0000\u05ef\u05f0\u0005\u0003"+
		"\u0000\u0000\u05f0\u06ae\u0005\u0004\u0000\u0000\u05f1\u05f2\u0005\n\u0000"+
		"\u0000\u05f2\u05f3\u0005\u0003\u0000\u0000\u05f3\u05f4\u0005\u0006\u0000"+
		"\u0000\u05f4\u05f5\u0005\u0003\u0000\u0000\u05f5\u05f6\u0003\u0014\n\u0000"+
		"\u05f6\u05f7\u0005\u0004\u0000\u0000\u05f7\u05f8\u0005\n\u0000\u0000\u05f8"+
		"\u05f9\u0005\u0003\u0000\u0000\u05f9\u05fa\u0005\u0006\u0000\u0000\u05fa"+
		"\u05fb\u0005\u0003\u0000\u0000\u05fb\u05fd\u0003\u0014\n\u0000\u05fc\u05fe"+
		"\u0003\u0014\n\u0000\u05fd\u05fc\u0001\u0000\u0000\u0000\u05fd\u05fe\u0001"+
		"\u0000\u0000\u0000\u05fe\u0600\u0001\u0000\u0000\u0000\u05ff\u0601\u0003"+
		"\u0014\n\u0000\u0600\u05ff\u0001\u0000\u0000\u0000\u0600\u0601\u0001\u0000"+
		"\u0000\u0000\u0601\u0603\u0001\u0000\u0000\u0000\u0602\u0604\u0003\u0014"+
		"\n\u0000\u0603\u0602\u0001\u0000\u0000\u0000\u0603\u0604\u0001\u0000\u0000"+
		"\u0000\u0604\u0606\u0001\u0000\u0000\u0000\u0605\u0607\u0003\u0014\n\u0000"+
		"\u0606\u0605\u0001\u0000\u0000\u0000\u0606\u0607\u0001\u0000\u0000\u0000"+
		"\u0607\u0609\u0001\u0000\u0000\u0000\u0608\u060a\u0003\u0014\n\u0000\u0609"+
		"\u0608\u0001\u0000\u0000\u0000\u0609\u060a\u0001\u0000\u0000\u0000\u060a"+
		"\u060c\u0001\u0000\u0000\u0000\u060b\u060d\u0003\u0014\n\u0000\u060c\u060b"+
		"\u0001\u0000\u0000\u0000\u060c\u060d\u0001\u0000\u0000\u0000\u060d\u0611"+
		"\u0001\u0000\u0000\u0000\u060e\u0610\u0003\u0014\n\u0000\u060f\u060e\u0001"+
		"\u0000\u0000\u0000\u0610\u0613\u0001\u0000\u0000\u0000\u0611\u060f\u0001"+
		"\u0000\u0000\u0000\u0611\u0612\u0001\u0000\u0000\u0000\u0612\u0614\u0001"+
		"\u0000\u0000\u0000\u0613\u0611\u0001\u0000\u0000\u0000\u0614\u0615\u0005"+
		"\u0004\u0000\u0000\u0615\u0616\u0005\n\u0000\u0000\u0616\u0617\u0005\u0003"+
		"\u0000\u0000\u0617\u0618\u0005\u0006\u0000\u0000\u0618\u0619\u0005\u0003"+
		"\u0000\u0000\u0619\u061a\u0005\b\u0000\u0000\u061a\u061b\u0005\u0004\u0000"+
		"\u0000\u061b\u061c\u0005\n\u0000\u0000\u061c\u061d\u0005\u0003\u0000\u0000"+
		"\u061d\u061e\u0005\u0006\u0000\u0000\u061e\u061f\u0005\u0003\u0000\u0000"+
		"\u061f\u0620\u0005\b\u0000\u0000\u0620\u0621\u0005\u0004\u0000\u0000\u0621"+
		"\u0622\u0005\n\u0000\u0000\u0622\u0623\u0005\u0003\u0000\u0000\u0623\u0624"+
		"\u0005\u0006\u0000\u0000\u0624\u0625\u0005\u0003\u0000\u0000\u0625\u0626"+
		"\u0005\b\u0000\u0000\u0626\u0627\u0005\u0004\u0000\u0000\u0627\u0628\u0005"+
		"\n\u0000\u0000\u0628\u0629\u0005\u0003\u0000\u0000\u0629\u062a\u0005\u0006"+
		"\u0000\u0000\u062a\u062b\u0005\u0003\u0000\u0000\u062b\u062c\u0005\b\u0000"+
		"\u0000\u062c\u062d\u0005\u0004\u0000\u0000\u062d\u062e\u0005\n\u0000\u0000"+
		"\u062e\u062f\u0005\u0003\u0000\u0000\u062f\u0630\u0005\u0006\u0000\u0000"+
		"\u0630\u0631\u0005\u0003\u0000\u0000\u0631\u0632\u0005\b\u0000\u0000\u0632"+
		"\u0633\u0005\u0004\u0000\u0000\u0633\u0634\u0005\n\u0000\u0000\u0634\u0635"+
		"\u0005\u0003\u0000\u0000\u0635\u0636\u0005\u0006\u0000\u0000\u0636\u0637"+
		"\u0005\u0003\u0000\u0000\u0637\u0638\u0005\b\u0000\u0000\u0638\u0639\u0005"+
		"\u0004\u0000\u0000\u0639\u063a\u0005\n\u0000\u0000\u063a\u063b\u0005\u0003"+
		"\u0000\u0000\u063b\u063c\u0005\u0006\u0000\u0000\u063c\u063d\u0005\u0003"+
		"\u0000\u0000\u063d\u063e\u0005\b\u0000\u0000\u063e\u063f\u0005\u0004\u0000"+
		"\u0000\u063f\u0640\u0005\n\u0000\u0000\u0640\u0641\u0005\u0003\u0000\u0000"+
		"\u0641\u0642\u0005\u0006\u0000\u0000\u0642\u0643\u0005\u0003\u0000\u0000"+
		"\u0643\u0644\u0005\b\u0000\u0000\u0644\u0645\u0005\u0004\u0000\u0000\u0645"+
		"\u0646\u0005\n\u0000\u0000\u0646\u0647\u0005\u0003\u0000\u0000\u0647\u0648"+
		"\u0005\u0006\u0000\u0000\u0648\u0649\u0005\u0003\u0000\u0000\u0649\u064a"+
		"\u0005\b\u0000\u0000\u064a\u064b\u0005\u0004\u0000\u0000\u064b\u064c\u0005"+
		"\n\u0000\u0000\u064c\u064d\u0005\u0003\u0000\u0000\u064d\u064e\u0005\u0006"+
		"\u0000\u0000\u064e\u064f\u0005\u0003\u0000\u0000\u064f\u0650\u0005\b\u0000"+
		"\u0000\u0650\u0651\u0005\u0004\u0000\u0000\u0651\u0652\u0005\n\u0000\u0000"+
		"\u0652\u0653\u0005\u0003\u0000\u0000\u0653\u0654\u0005\u0006\u0000\u0000"+
		"\u0654\u0655\u0005\u0003\u0000\u0000\u0655\u0656\u0005\b\u0000\u0000\u0656"+
		"\u0657\u0005\u0004\u0000\u0000\u0657\u0658\u0005\n\u0000\u0000\u0658\u0659"+
		"\u0005\u0003\u0000\u0000\u0659\u065a\u0005\u0006\u0000\u0000\u065a\u065b"+
		"\u0005\u0003\u0000\u0000\u065b\u065c\u0005\b\u0000\u0000\u065c\u065d\u0005"+
		"\u0004\u0000\u0000\u065d\u065e\u0005\n\u0000\u0000\u065e\u065f\u0005\u0003"+
		"\u0000\u0000\u065f\u0660\u0005\u0006\u0000\u0000\u0660\u0662\u0005\u0003"+
		"\u0000\u0000\u0661\u0663\u0003\u0014\n\u0000\u0662\u0661\u0001\u0000\u0000"+
		"\u0000\u0663\u0664\u0001\u0000\u0000\u0000\u0664\u0662\u0001\u0000\u0000"+
		"\u0000\u0664\u0665\u0001\u0000\u0000\u0000\u0665\u0666\u0001\u0000\u0000"+
		"\u0000\u0666\u0667\u0005\u0004\u0000\u0000\u0667\u0668\u0005\n\u0000\u0000"+
		"\u0668\u0669\u0005\u0003\u0000\u0000\u0669\u066a\u0005\u0006\u0000\u0000"+
		"\u066a\u066b\u0005\u0003\u0000\u0000\u066b\u066c\u0003\u0014\n\u0000\u066c"+
		"\u066d\u0005\u0004\u0000\u0000\u066d\u066e\u0005\n\u0000\u0000\u066e\u066f"+
		"\u0005\u0003\u0000\u0000\u066f\u0670\u0005\u0006\u0000\u0000\u0670\u0671"+
		"\u0005\u0003\u0000\u0000\u0671\u0672\u0003\u0014\n\u0000\u0672\u0673\u0005"+
		"\u0004\u0000\u0000\u0673\u0674\u0005\n\u0000\u0000\u0674\u0675\u0005\u0003"+
		"\u0000\u0000\u0675\u0676\u0005\u0006\u0000\u0000\u0676\u0677\u0005\u0003"+
		"\u0000\u0000\u0677\u0678\u0003\u0014\n\u0000\u0678\u0679\u0005\u0004\u0000"+
		"\u0000\u0679\u067a\u0005\n\u0000\u0000\u067a\u067b\u0005\u0003\u0000\u0000"+
		"\u067b\u067c\u0005\u0006\u0000\u0000\u067c\u067d\u0005\u0003\u0000\u0000"+
		"\u067d\u067e\u0005\u0004\u0000\u0000\u067e\u067f\u0006\u0007\uffff\uffff"+
		"\u0000\u067f\u06af\u0001\u0000\u0000\u0000\u0680\u0681\u0005\n\u0000\u0000"+
		"\u0681\u0682\u0005\u0003\u0000\u0000\u0682\u0683\u0005\u0006\u0000\u0000"+
		"\u0683\u0684\u0005\u0003\u0000\u0000\u0684\u0685\u0003\u0014\n\u0000\u0685"+
		"\u0687\u0003\u0014\n\u0000\u0686\u0688\u0003\u0014\n\u0000\u0687\u0686"+
		"\u0001\u0000\u0000\u0000\u0687\u0688\u0001\u0000\u0000\u0000\u0688\u068a"+
		"\u0001\u0000\u0000\u0000\u0689\u068b\u0003\u0014\n\u0000\u068a\u0689\u0001"+
		"\u0000\u0000\u0000\u068a\u068b\u0001\u0000\u0000\u0000\u068b\u068d\u0001"+
		"\u0000\u0000\u0000\u068c\u068e\u0003\u0014\n\u0000\u068d\u068c\u0001\u0000"+
		"\u0000\u0000\u068d\u068e\u0001\u0000\u0000\u0000\u068e\u0690\u0001\u0000"+
		"\u0000\u0000\u068f\u0691\u0003\u0014\n\u0000\u0690\u068f\u0001\u0000\u0000"+
		"\u0000\u0690\u0691\u0001\u0000\u0000\u0000\u0691\u0693\u0001\u0000\u0000"+
		"\u0000\u0692\u0694\u0003\u0014\n\u0000\u0693\u0692\u0001\u0000\u0000\u0000"+
		"\u0693\u0694\u0001\u0000\u0000\u0000\u0694\u0696\u0001\u0000\u0000\u0000"+
		"\u0695\u0697\u0003\u0014\n\u0000\u0696\u0695\u0001\u0000\u0000\u0000\u0696"+
		"\u0697\u0001\u0000\u0000\u0000\u0697\u069b\u0001\u0000\u0000\u0000\u0698"+
		"\u069a\u0003\u0014\n\u0000\u0699\u0698\u0001\u0000\u0000\u0000\u069a\u069d"+
		"\u0001\u0000\u0000\u0000\u069b\u0699\u0001\u0000\u0000\u0000\u069b\u069c"+
		"\u0001\u0000\u0000\u0000\u069c\u069e\u0001\u0000\u0000\u0000\u069d\u069b"+
		"\u0001\u0000\u0000\u0000\u069e\u069f\u0005\b\u0000\u0000\u069f\u06a0\u0005"+
		"\u0004\u0000\u0000\u06a0\u06a1\u0005\n\u0000\u0000\u06a1\u06a2\u0005\u0003"+
		"\u0000\u0000\u06a2\u06a3\u0005\u0006\u0000\u0000\u06a3\u06a4\u0005\u0003"+
		"\u0000\u0000\u06a4\u06a5\u0005\b\u0000\u0000\u06a5\u06a6\u0005\b\u0000"+
		"\u0000\u06a6\u06a7\u0005\b\u0000\u0000\u06a7\u06a8\u0005\b\u0000\u0000"+
		"\u06a8\u06a9\u0005\b\u0000\u0000\u06a9\u06aa\u0005\b\u0000\u0000\u06aa"+
		"\u06ab\u0005\b\u0000\u0000\u06ab\u06ac\u0005\u0004\u0000\u0000\u06ac\u06ad"+
		"\u0006\u0007\uffff\uffff\u0000\u06ad\u06af\u0001\u0000\u0000\u0000\u06ae"+
		"\u05f1\u0001\u0000\u0000\u0000\u06ae\u0680\u0001\u0000\u0000\u0000\u06af"+
		"\u06b0\u0001\u0000\u0000\u0000\u06b0\u06ae\u0001\u0000\u0000\u0000\u06b0"+
		"\u06b1\u0001\u0000\u0000\u0000\u06b1\u06b2\u0001\u0000\u0000\u0000\u06b2"+
		"\u06b3\u0005\n\u0000\u0000\u06b3\u06b4\u0005\u0003\u0000\u0000\u06b4\u06b5"+
		"\u0005\n\u0000\u0000\u06b5\u06b6\u0005\u0003\u0000\u0000\u06b6\u06b7\u0005"+
		"\u0006\u0000\u0000\u06b7\u06b8\u0005\u0004\u0000\u0000\u06b8\u06ba\u0001"+
		"\u0000\u0000\u0000\u06b9\u05e2\u0001\u0000\u0000\u0000\u06ba\u06bb\u0001"+
		"\u0000\u0000\u0000\u06bb\u06b9\u0001\u0000\u0000\u0000\u06bb\u06bc\u0001"+
		"\u0000\u0000\u0000\u06bc\u06bd\u0001\u0000\u0000\u0000\u06bd\u06be\u0005"+
		"\u0005\u0000\u0000\u06be\u06bf\u0005\u0003\u0000\u0000\u06bf\u06c0\u0005"+
		"\n\u0000\u0000\u06c0\u06c1\u0005\u0003\u0000\u0000\u06c1\u06c2\u0005\n"+
		"\u0000\u0000\u06c2\u06c3\u0005\n\u0000\u0000\u06c3\u06c4\u0005\n\u0000"+
		"\u0000\u06c4\u06c5\u0005\n\u0000\u0000\u06c5\u06c6\u0005\u0003\u0000\u0000"+
		"\u06c6\u06c7\u0005\n\u0000\u0000\u06c7\u06c8\u0005\u0004\u0000\u0000\u06c8"+
		"\u000f\u0001\u0000\u0000\u0000\u06c9\u06ca\u0005\u0005\u0000\u0000\u06ca"+
		"\u06cb\u0005\u0003\u0000\u0000\u06cb\u06cc\u0005\n\u0000\u0000\u06cc\u06cd"+
		"\u0005\u0003\u0000\u0000\u06cd\u06ce\u0005\n\u0000\u0000\u06ce\u06cf\u0005"+
		"\n\u0000\u0000\u06cf\u06d0\u0005\n\u0000\u0000\u06d0\u06d1\u0005\n\u0000"+
		"\u0000\u06d1\u06d2\u0005\n\u0000\u0000\u06d2\u06d3\u0005\n\u0000\u0000"+
		"\u06d3\u06d4\u0005\u0003\u0000\u0000\u06d4\u06d5\u0005\n\u0000\u0000\u06d5"+
		"\u08b8\u0005\u0004\u0000\u0000\u06d6\u06d7\u0005\n\u0000\u0000\u06d7\u06d8"+
		"\u0005\u0003\u0000\u0000\u06d8\u06d9\u0005\u0006\u0000\u0000\u06d9\u06da"+
		"\u0005\u0003\u0000\u0000\u06da\u06db\u0005\u0004\u0000\u0000\u06db\u06dc"+
		"\u0005\n\u0000\u0000\u06dc\u06dd\u0005\u0003\u0000\u0000\u06dd\u06de\u0005"+
		"\u0006\u0000\u0000\u06de\u06df\u0005\u0003\u0000\u0000\u06df\u06e0\u0005"+
		"\u0004\u0000\u0000\u06e0\u06e1\u0005\n\u0000\u0000\u06e1\u06e2\u0005\u0003"+
		"\u0000\u0000\u06e2\u06e3\u0005\u0006\u0000\u0000\u06e3\u06e4\u0005\u0003"+
		"\u0000\u0000\u06e4\u06e5\u0005\u0004\u0000\u0000\u06e5\u06e6\u0005\n\u0000"+
		"\u0000\u06e6\u06e7\u0005\u0003\u0000\u0000\u06e7\u06e8\u0005\u0006\u0000"+
		"\u0000\u06e8\u06e9\u0005\u0003\u0000\u0000\u06e9\u06ea\u0005\u0003\u0000"+
		"\u0000\u06ea\u06eb\u0005\u0003\u0000\u0000\u06eb\u06ec\u0005\u0003\u0000"+
		"\u0000\u06ec\u06ed\u0005\u0003\u0000\u0000\u06ed\u06ee\u0005\u0004\u0000"+
		"\u0000\u06ee\u06ef\u0005\n\u0000\u0000\u06ef\u06f0\u0005\u0003\u0000\u0000"+
		"\u06f0\u06f1\u0005\u0006\u0000\u0000\u06f1\u06f2\u0005\u0003\u0000\u0000"+
		"\u06f2\u06f3\u0005\u0003\u0000\u0000\u06f3\u06f4\u0005\u0003\u0000\u0000"+
		"\u06f4\u06f5\u0005\u0004\u0000\u0000\u06f5\u06f6\u0005\n\u0000\u0000\u06f6"+
		"\u06f7\u0005\u0003\u0000\u0000\u06f7\u06f8\u0005\u0006\u0000\u0000\u06f8"+
		"\u06f9\u0005\u0003\u0000\u0000\u06f9\u06fa\u0005\u0003\u0000\u0000\u06fa"+
		"\u06fb\u0005\u0003\u0000\u0000\u06fb\u06fc\u0005\u0003\u0000\u0000\u06fc"+
		"\u06fd\u0005\u0003\u0000\u0000\u06fd\u06fe\u0005\u0004\u0000\u0000\u06fe"+
		"\u06ff\u0005\n\u0000\u0000\u06ff\u0700\u0005\u0003\u0000\u0000\u0700\u0701"+
		"\u0005\u0006\u0000\u0000\u0701\u0702\u0005\u0003\u0000\u0000\u0702\u0703"+
		"\u0005\u0003\u0000\u0000\u0703\u0704\u0005\u0003\u0000\u0000\u0704\u0705"+
		"\u0005\u0003\u0000\u0000\u0705\u0706\u0005\u0003\u0000\u0000\u0706\u0707"+
		"\u0005\u0004\u0000\u0000\u0707\u0708\u0005\n\u0000\u0000\u0708\u0709\u0005"+
		"\u0003\u0000\u0000\u0709\u070a\u0005\u0006\u0000\u0000\u070a\u070b\u0005"+
		"\u0003\u0000\u0000\u070b\u070c\u0005\u0003\u0000\u0000\u070c\u070d\u0005"+
		"\u0003\u0000\u0000\u070d\u070e\u0005\u0003\u0000\u0000\u070e\u070f\u0005"+
		"\u0004\u0000\u0000\u070f\u0710\u0005\n\u0000\u0000\u0710\u0711\u0005\u0003"+
		"\u0000\u0000\u0711\u0712\u0005\u0006\u0000\u0000\u0712\u0713\u0005\u0003"+
		"\u0000\u0000\u0713\u0714\u0005\u0004\u0000\u0000\u0714\u0715\u0005\n\u0000"+
		"\u0000\u0715\u0716\u0005\u0003\u0000\u0000\u0716\u0717\u0005\u0006\u0000"+
		"\u0000\u0717\u0718\u0005\u0003\u0000\u0000\u0718\u0719\u0005\u0004\u0000"+
		"\u0000\u0719\u071a\u0005\n\u0000\u0000\u071a\u071b\u0005\u0003\u0000\u0000"+
		"\u071b\u071c\u0005\u0006\u0000\u0000\u071c\u071d\u0005\u0003\u0000\u0000"+
		"\u071d\u071e\u0005\u0003\u0000\u0000\u071e\u071f\u0005\u0003\u0000\u0000"+
		"\u071f\u0720\u0005\u0003\u0000\u0000\u0720\u0721\u0005\u0003\u0000\u0000"+
		"\u0721\u0722\u0005\u0004\u0000\u0000\u0722\u0723\u0005\n\u0000\u0000\u0723"+
		"\u0724\u0005\u0003\u0000\u0000\u0724\u0725\u0005\u0006\u0000\u0000\u0725"+
		"\u0726\u0005\u0003\u0000\u0000\u0726\u0727\u0005\u0003\u0000\u0000\u0727"+
		"\u0728\u0005\u0003\u0000\u0000\u0728\u0729\u0005\u0004\u0000\u0000\u0729"+
		"\u072a\u0005\n\u0000\u0000\u072a\u072b\u0005\u0003\u0000\u0000\u072b\u072c"+
		"\u0005\u0006\u0000\u0000\u072c\u072d\u0005\u0003\u0000\u0000\u072d\u072e"+
		"\u0005\u0003\u0000\u0000\u072e\u072f\u0005\u0003\u0000\u0000\u072f\u0730"+
		"\u0005\u0003\u0000\u0000\u0730\u0731\u0005\u0003\u0000\u0000\u0731\u0732"+
		"\u0005\u0004\u0000\u0000\u0732\u0733\u0005\n\u0000\u0000\u0733\u0734\u0005"+
		"\u0003\u0000\u0000\u0734\u0735\u0005\u0006\u0000\u0000\u0735\u0736\u0005"+
		"\u0003\u0000\u0000\u0736\u0737\u0005\u0003\u0000\u0000\u0737\u0738\u0005"+
		"\u0003\u0000\u0000\u0738\u0739\u0005\u0003\u0000\u0000\u0739\u073a\u0005"+
		"\u0003\u0000\u0000\u073a\u073b\u0005\u0004\u0000\u0000\u073b\u073c\u0005"+
		"\n\u0000\u0000\u073c\u073d\u0005\u0003\u0000\u0000\u073d\u073e\u0005\u0006"+
		"\u0000\u0000\u073e\u073f\u0005\u0003\u0000\u0000\u073f\u0740\u0005\u0003"+
		"\u0000\u0000\u0740\u0741\u0005\u0003\u0000\u0000\u0741\u0742\u0005\u0003"+
		"\u0000\u0000\u0742\u0743\u0005\u0004\u0000\u0000\u0743\u0744\u0005\n\u0000"+
		"\u0000\u0744\u0745\u0005\u0003\u0000\u0000\u0745\u0746\u0005\u0006\u0000"+
		"\u0000\u0746\u0747\u0005\u0003\u0000\u0000\u0747\u0748\u0005\u0004\u0000"+
		"\u0000\u0748\u0749\u0005\n\u0000\u0000\u0749\u074a\u0005\u0003\u0000\u0000"+
		"\u074a\u074b\u0005\u0006\u0000\u0000\u074b\u074c\u0005\u0003\u0000\u0000"+
		"\u074c\u074d\u0005\u0004\u0000\u0000\u074d\u074e\u0005\n\u0000\u0000\u074e"+
		"\u074f\u0005\u0003\u0000\u0000\u074f\u0750\u0005\u0006\u0000\u0000\u0750"+
		"\u0751\u0005\u0003\u0000\u0000\u0751\u0752\u0005\u0004\u0000\u0000\u0752"+
		"\u0753\u0005\n\u0000\u0000\u0753\u0754\u0005\u0003\u0000\u0000\u0754\u0755"+
		"\u0005\u0006\u0000\u0000\u0755\u0756\u0005\u0003\u0000\u0000\u0756\u0757"+
		"\u0005\u0004\u0000\u0000\u0757\u0758\u0005\n\u0000\u0000\u0758\u0759\u0005"+
		"\u0003\u0000\u0000\u0759\u075a\u0005\u0006\u0000\u0000\u075a\u075b\u0005"+
		"\u0003\u0000\u0000\u075b\u075c\u0005\u0003\u0000\u0000\u075c\u075d\u0005"+
		"\u0003\u0000\u0000\u075d\u075e\u0005\u0003\u0000\u0000\u075e\u075f\u0005"+
		"\u0003\u0000\u0000\u075f\u0760\u0005\u0004\u0000\u0000\u0760\u0761\u0005"+
		"\n\u0000\u0000\u0761\u0762\u0005\u0003\u0000\u0000\u0762\u0763\u0005\u0006"+
		"\u0000\u0000\u0763\u0764\u0005\u0003\u0000\u0000\u0764\u0765\u0005\u0003"+
		"\u0000\u0000\u0765\u0766\u0005\u0003\u0000\u0000\u0766\u0767\u0005\u0003"+
		"\u0000\u0000\u0767\u0768\u0005\u0004\u0000\u0000\u0768\u0769\u0005\n\u0000"+
		"\u0000\u0769\u076a\u0005\u0003\u0000\u0000\u076a\u076b\u0005\u0006\u0000"+
		"\u0000\u076b\u076c\u0005\u0003\u0000\u0000\u076c\u076d\u0005\u0003\u0000"+
		"\u0000\u076d\u076e\u0005\u0003\u0000\u0000\u076e\u076f\u0005\u0003\u0000"+
		"\u0000\u076f\u0770\u0005\u0003\u0000\u0000\u0770\u0771\u0005\u0004\u0000"+
		"\u0000\u0771\u0772\u0005\n\u0000\u0000\u0772\u0773\u0005\u0003\u0000\u0000"+
		"\u0773\u0774\u0005\u0006\u0000\u0000\u0774\u0775\u0005\u0003\u0000\u0000"+
		"\u0775\u0776\u0005\u0003\u0000\u0000\u0776\u0777\u0005\u0003\u0000\u0000"+
		"\u0777\u0778\u0005\u0003\u0000\u0000\u0778\u0779\u0005\u0003\u0000\u0000"+
		"\u0779\u077a\u0005\u0004\u0000\u0000\u077a\u077b\u0005\n\u0000\u0000\u077b"+
		"\u077c\u0005\u0003\u0000\u0000\u077c\u077d\u0005\u0006\u0000\u0000\u077d"+
		"\u077e\u0005\u0003\u0000\u0000\u077e\u077f\u0005\u0003\u0000\u0000\u077f"+
		"\u0780\u0005\u0003\u0000\u0000\u0780\u0781\u0005\u0003\u0000\u0000\u0781"+
		"\u0782\u0005\u0004\u0000\u0000\u0782\u0783\u0005\n\u0000\u0000\u0783\u0784"+
		"\u0005\u0003\u0000\u0000\u0784\u0785\u0005\u0006\u0000\u0000\u0785\u0786"+
		"\u0005\u0003\u0000\u0000\u0786\u0787\u0005\u0004\u0000\u0000\u0787\u0788"+
		"\u0005\n\u0000\u0000\u0788\u0789\u0005\u0003\u0000\u0000\u0789\u078a\u0005"+
		"\u0006\u0000\u0000\u078a\u078b\u0005\u0003\u0000\u0000\u078b\u078c\u0005"+
		"\u0004\u0000\u0000\u078c\u078d\u0005\n\u0000\u0000\u078d\u078e\u0005\u0003"+
		"\u0000\u0000\u078e\u078f\u0005\u0006\u0000\u0000\u078f\u0790\u0005\u0003"+
		"\u0000\u0000\u0790\u0791\u0005\u0004\u0000\u0000\u0791\u0792\u0005\n\u0000"+
		"\u0000\u0792\u0793\u0005\u0003\u0000\u0000\u0793\u0794\u0005\u0006\u0000"+
		"\u0000\u0794\u0795\u0005\u0003\u0000\u0000\u0795\u0796\u0005\u0004\u0000"+
		"\u0000\u0796\u0797\u0005\n\u0000\u0000\u0797\u0798\u0005\u0003\u0000\u0000"+
		"\u0798\u0799\u0005\u0006\u0000\u0000\u0799\u079a\u0005\u0003\u0000\u0000"+
		"\u079a\u079b\u0005\u0003\u0000\u0000\u079b\u079c\u0005\u0003\u0000\u0000"+
		"\u079c\u079d\u0005\u0003\u0000\u0000\u079d\u079e\u0005\u0003\u0000\u0000"+
		"\u079e\u079f\u0005\u0004\u0000\u0000\u079f\u07a0\u0005\n\u0000\u0000\u07a0"+
		"\u07a1\u0005\u0003\u0000\u0000\u07a1\u07a2\u0005\u0006\u0000\u0000\u07a2"+
		"\u07a3\u0005\u0003\u0000\u0000\u07a3\u07a4\u0005\u0003\u0000\u0000\u07a4"+
		"\u07a5\u0005\u0003\u0000\u0000\u07a5\u07a6\u0005\u0004\u0000\u0000\u07a6"+
		"\u07a7\u0005\n\u0000\u0000\u07a7\u07a8\u0005\u0003\u0000\u0000\u07a8\u07a9"+
		"\u0005\u0006\u0000\u0000\u07a9\u07aa\u0005\u0003\u0000\u0000\u07aa\u07ab"+
		"\u0005\u0003\u0000\u0000\u07ab\u07ac\u0005\u0003\u0000\u0000\u07ac\u07ad"+
		"\u0005\u0003\u0000\u0000\u07ad\u07ae\u0005\u0003\u0000\u0000\u07ae\u07af"+
		"\u0005\u0004\u0000\u0000\u07af\u07b0\u0005\n\u0000\u0000\u07b0\u07b1\u0005"+
		"\u0003\u0000\u0000\u07b1\u07b2\u0005\u0006\u0000\u0000\u07b2\u07b3\u0005"+
		"\u0003\u0000\u0000\u07b3\u07b4\u0005\u0003\u0000\u0000\u07b4\u07b5\u0005"+
		"\u0003\u0000\u0000\u07b5\u07b6\u0005\u0003\u0000\u0000\u07b6\u07b7\u0005"+
		"\u0003\u0000\u0000\u07b7\u07b8\u0005\u0004\u0000\u0000\u07b8\u07b9\u0005"+
		"\n\u0000\u0000\u07b9\u07ba\u0005\u0003\u0000\u0000\u07ba\u07bb\u0005\u0006"+
		"\u0000\u0000\u07bb\u07bc\u0005\u0003\u0000\u0000\u07bc\u07bd\u0005\u0003"+
		"\u0000\u0000\u07bd\u07be\u0005\u0003\u0000\u0000\u07be\u07bf\u0005\u0003"+
		"\u0000\u0000\u07bf\u07c0\u0005\u0004\u0000\u0000\u07c0\u07c1\u0005\n\u0000"+
		"\u0000\u07c1\u07c2\u0005\u0003\u0000\u0000\u07c2\u07c3\u0005\u0006\u0000"+
		"\u0000\u07c3\u07c4\u0005\u0003\u0000\u0000\u07c4\u07c5\u0005\u0004\u0000"+
		"\u0000\u07c5\u07c6\u0005\n\u0000\u0000\u07c6\u07c7\u0005\u0003\u0000\u0000"+
		"\u07c7\u07c8\u0005\u0006\u0000\u0000\u07c8\u07c9\u0005\u0003\u0000\u0000"+
		"\u07c9\u07ca\u0005\u0004\u0000\u0000\u07ca\u07cb\u0005\n\u0000\u0000\u07cb"+
		"\u07cc\u0005\u0003\u0000\u0000\u07cc\u07cd\u0005\u0006\u0000\u0000\u07cd"+
		"\u07ce\u0005\u0003\u0000\u0000\u07ce\u07cf\u0005\u0004\u0000\u0000\u07cf"+
		"\u07d0\u0005\n\u0000\u0000\u07d0\u07d1\u0005\u0003\u0000\u0000\u07d1\u07d2"+
		"\u0005\u0006\u0000\u0000\u07d2\u07d3\u0005\u0003\u0000\u0000\u07d3\u07d4"+
		"\u0005\u0003\u0000\u0000\u07d4\u07d5\u0005\u0003\u0000\u0000\u07d5\u07d6"+
		"\u0005\u0003\u0000\u0000\u07d6\u07d7\u0005\u0003\u0000\u0000\u07d7\u07d8"+
		"\u0005\u0004\u0000\u0000\u07d8\u07d9\u0005\n\u0000\u0000\u07d9\u07da\u0005"+
		"\u0003\u0000\u0000\u07da\u07db\u0005\u0006\u0000\u0000\u07db\u07dc\u0005"+
		"\u0003\u0000\u0000\u07dc\u07dd\u0005\u0003\u0000\u0000\u07dd\u07de\u0005"+
		"\u0003\u0000\u0000\u07de\u07df\u0005\u0004\u0000\u0000\u07df\u07e0\u0005"+
		"\n\u0000\u0000\u07e0\u07e1\u0005\u0003\u0000\u0000\u07e1\u07e2\u0005\u0006"+
		"\u0000\u0000\u07e2\u07e3\u0005\u0003\u0000\u0000\u07e3\u07e4\u0005\u0003"+
		"\u0000\u0000\u07e4\u07e5\u0005\u0003\u0000\u0000\u07e5\u07e6\u0005\u0003"+
		"\u0000\u0000\u07e6\u07e7\u0005\u0003\u0000\u0000\u07e7\u07e8\u0005\u0004"+
		"\u0000\u0000\u07e8\u07e9\u0005\n\u0000\u0000\u07e9\u07ea\u0005\u0003\u0000"+
		"\u0000\u07ea\u07eb\u0005\u0006\u0000\u0000\u07eb\u07ec\u0005\u0003\u0000"+
		"\u0000\u07ec\u07ed\u0005\u0003\u0000\u0000\u07ed\u07ee\u0005\u0003\u0000"+
		"\u0000\u07ee\u07ef\u0005\u0003\u0000\u0000\u07ef\u07f0\u0005\u0003\u0000"+
		"\u0000\u07f0\u07f1\u0005\u0004\u0000\u0000\u07f1\u07f2\u0005\n\u0000\u0000"+
		"\u07f2\u07f3\u0005\u0003\u0000\u0000\u07f3\u07f4\u0005\u0006\u0000\u0000"+
		"\u07f4\u07f5\u0005\u0003\u0000\u0000\u07f5\u07f6\u0005\u0003\u0000\u0000"+
		"\u07f6\u07f7\u0005\u0003\u0000\u0000\u07f7\u07f8\u0005\u0003\u0000\u0000"+
		"\u07f8\u07f9\u0005\u0004\u0000\u0000\u07f9\u07fa\u0005\n\u0000\u0000\u07fa"+
		"\u07fb\u0005\u0003\u0000\u0000\u07fb\u07fc\u0005\u0006\u0000\u0000\u07fc"+
		"\u07fd\u0005\u0003\u0000\u0000\u07fd\u07fe\u0005\n\u0000\u0000\u07fe\u07ff"+
		"\u0005\u0004\u0000\u0000\u07ff\u0800\u0005\n\u0000\u0000\u0800\u0801\u0005"+
		"\u0003\u0000\u0000\u0801\u0802\u0005\u0006\u0000\u0000\u0802\u0803\u0005"+
		"\u0003\u0000\u0000\u0803\u08ad\u0005\u0004\u0000\u0000\u0804\u0805\u0005"+
		"\n\u0000\u0000\u0805\u0806\u0005\u0003\u0000\u0000\u0806\u0807\u0005\u0006"+
		"\u0000\u0000\u0807\u0808\u0005\u0003\u0000\u0000\u0808\u0809\u0003\u0014"+
		"\n\u0000\u0809\u080a\u0005\u0004\u0000\u0000\u080a\u080b\u0005\n\u0000"+
		"\u0000\u080b\u080c\u0005\u0003\u0000\u0000\u080c\u080d\u0005\u0006\u0000"+
		"\u0000\u080d\u080e\u0005\u0003\u0000\u0000\u080e\u0810\u0003\u0014\n\u0000"+
		"\u080f\u0811\u0003\u0014\n\u0000\u0810\u080f\u0001\u0000\u0000\u0000\u0810"+
		"\u0811\u0001\u0000\u0000\u0000\u0811\u0813\u0001\u0000\u0000\u0000\u0812"+
		"\u0814\u0003\u0014\n\u0000\u0813\u0812\u0001\u0000\u0000\u0000\u0813\u0814"+
		"\u0001\u0000\u0000\u0000\u0814\u0816\u0001\u0000\u0000\u0000\u0815\u0817"+
		"\u0003\u0014\n\u0000\u0816\u0815\u0001\u0000\u0000\u0000\u0816\u0817\u0001"+
		"\u0000\u0000\u0000\u0817\u0819\u0001\u0000\u0000\u0000\u0818\u081a\u0003"+
		"\u0014\n\u0000\u0819\u0818\u0001\u0000\u0000\u0000\u0819\u081a\u0001\u0000"+
		"\u0000\u0000\u081a\u081c\u0001\u0000\u0000\u0000\u081b\u081d\u0003\u0014"+
		"\n\u0000\u081c\u081b\u0001\u0000\u0000\u0000\u081c\u081d\u0001\u0000\u0000"+
		"\u0000\u081d\u081f\u0001\u0000\u0000\u0000\u081e\u0820\u0003\u0014\n\u0000"+
		"\u081f\u081e\u0001\u0000\u0000\u0000\u081f\u0820\u0001\u0000\u0000\u0000"+
		"\u0820\u0824\u0001\u0000\u0000\u0000\u0821\u0823\u0003\u0014\n\u0000\u0822"+
		"\u0821\u0001\u0000\u0000\u0000\u0823\u0826\u0001\u0000\u0000\u0000\u0824"+
		"\u0822\u0001\u0000\u0000\u0000\u0824\u0825\u0001\u0000\u0000\u0000\u0825"+
		"\u0827\u0001\u0000\u0000\u0000\u0826\u0824\u0001\u0000\u0000\u0000\u0827"+
		"\u0828\u0005\u0004\u0000\u0000\u0828\u0829\u0005\n\u0000\u0000\u0829\u082a"+
		"\u0005\u0003\u0000\u0000\u082a\u082b\u0005\u0006\u0000\u0000\u082b\u082c"+
		"\u0005\u0003\u0000\u0000\u082c\u0830\u0003\u0014\n\u0000\u082d\u082f\u0003"+
		"\u0014\n\u0000\u082e\u082d\u0001\u0000\u0000\u0000\u082f\u0832\u0001\u0000"+
		"\u0000\u0000\u0830\u082e\u0001\u0000\u0000\u0000\u0830\u0831\u0001\u0000"+
		"\u0000\u0000\u0831\u0833\u0001\u0000\u0000\u0000\u0832\u0830\u0001\u0000"+
		"\u0000\u0000\u0833\u0834\u0005\u0004\u0000\u0000\u0834\u0835\u0005\n\u0000"+
		"\u0000\u0835\u0836\u0005\u0003\u0000\u0000\u0836\u0837\u0005\u0006\u0000"+
		"\u0000\u0837\u0839\u0005\u0003\u0000\u0000\u0838\u083a\u0005\n\u0000\u0000"+
		"\u0839\u0838\u0001\u0000\u0000\u0000\u0839\u083a\u0001\u0000\u0000\u0000"+
		"\u083a\u083b\u0001\u0000\u0000\u0000\u083b\u083c\u0005\u0004\u0000\u0000"+
		"\u083c\u083d\u0005\n\u0000\u0000\u083d\u083e\u0005\u0003\u0000\u0000\u083e"+
		"\u083f\u0005\u0006\u0000\u0000\u083f\u0840\u0005\u0003\u0000\u0000\u0840"+
		"\u0841\u0005\b\u0000\u0000\u0841\u0842\u0005\u0004\u0000\u0000\u0842\u0843"+
		"\u0005\n\u0000\u0000\u0843\u0844\u0005\u0003\u0000\u0000\u0844\u0845\u0005"+
		"\u0006\u0000\u0000\u0845\u0846\u0005\u0003\u0000\u0000\u0846\u0847\u0005"+
		"\b\u0000\u0000\u0847\u0848\u0005\u0004\u0000\u0000\u0848\u0849\u0005\n"+
		"\u0000\u0000\u0849\u084a\u0005\u0003\u0000\u0000\u084a\u084b\u0005\u0006"+
		"\u0000\u0000\u084b\u084c\u0005\u0003\u0000\u0000\u084c\u084d\u0005\b\u0000"+
		"\u0000\u084d\u084e\u0005\u0004\u0000\u0000\u084e\u084f\u0005\n\u0000\u0000"+
		"\u084f\u0850\u0005\u0003\u0000\u0000\u0850\u0851\u0005\u0006\u0000\u0000"+
		"\u0851\u0852\u0005\u0003\u0000\u0000\u0852\u0853\u0005\b\u0000\u0000\u0853"+
		"\u0854\u0005\u0004\u0000\u0000\u0854\u0855\u0005\n\u0000\u0000\u0855\u0856"+
		"\u0005\u0003\u0000\u0000\u0856\u0857\u0005\u0006\u0000\u0000\u0857\u0858"+
		"\u0005\u0003\u0000\u0000\u0858\u0859\u0005\b\u0000\u0000\u0859\u085a\u0005"+
		"\u0004\u0000\u0000\u085a\u085b\u0005\n\u0000\u0000\u085b\u085c\u0005\u0003"+
		"\u0000\u0000\u085c\u085d\u0005\u0006\u0000\u0000\u085d\u085e\u0005\u0003"+
		"\u0000\u0000\u085e\u085f\u0005\b\u0000\u0000\u085f\u0860\u0005\u0004\u0000"+
		"\u0000\u0860\u0861\u0005\n\u0000\u0000\u0861\u0862\u0005\u0003\u0000\u0000"+
		"\u0862\u0863\u0005\u0006\u0000\u0000\u0863\u0864\u0005\u0003\u0000\u0000"+
		"\u0864\u0865\u0005\b\u0000\u0000\u0865\u0866\u0005\u0004\u0000\u0000\u0866"+
		"\u0867\u0005\n\u0000\u0000\u0867\u0868\u0005\u0003\u0000\u0000\u0868\u0869"+
		"\u0005\u0006\u0000\u0000\u0869\u086a\u0005\u0003\u0000\u0000\u086a\u086b"+
		"\u0005\b\u0000\u0000\u086b\u086c\u0005\u0004\u0000\u0000\u086c\u086d\u0005"+
		"\n\u0000\u0000\u086d\u086e\u0005\u0003\u0000\u0000\u086e\u086f\u0005\u0006"+
		"\u0000\u0000\u086f\u0870\u0005\u0003\u0000\u0000\u0870\u0871\u0005\b\u0000"+
		"\u0000\u0871\u0872\u0005\u0004\u0000\u0000\u0872\u0873\u0005\n\u0000\u0000"+
		"\u0873\u0874\u0005\u0003\u0000\u0000\u0874\u0875\u0005\u0006\u0000\u0000"+
		"\u0875\u0876\u0005\u0003\u0000\u0000\u0876\u0877\u0005\b\u0000\u0000\u0877"+
		"\u0878\u0005\u0004\u0000\u0000\u0878\u0879\u0005\n\u0000\u0000\u0879\u087a"+
		"\u0005\u0003\u0000\u0000\u087a\u087b\u0005\u0006\u0000\u0000\u087b\u087c"+
		"\u0005\u0003\u0000\u0000\u087c\u087d\u0005\u0004\u0000\u0000\u087d\u087e"+
		"\u0006\b\uffff\uffff\u0000\u087e\u08ae\u0001\u0000\u0000\u0000\u087f\u0880"+
		"\u0005\n\u0000\u0000\u0880\u0881\u0005\u0003\u0000\u0000\u0881\u0882\u0005"+
		"\u0006\u0000\u0000\u0882\u0883\u0005\u0003\u0000\u0000\u0883\u0884\u0003"+
		"\u0014\n\u0000\u0884\u0886\u0003\u0014\n\u0000\u0885\u0887\u0003\u0014"+
		"\n\u0000\u0886\u0885\u0001\u0000\u0000\u0000\u0886\u0887\u0001\u0000\u0000"+
		"\u0000\u0887\u0889\u0001\u0000\u0000\u0000\u0888\u088a\u0003\u0014\n\u0000"+
		"\u0889\u0888\u0001\u0000\u0000\u0000\u0889\u088a\u0001\u0000\u0000\u0000"+
		"\u088a\u088c\u0001\u0000\u0000\u0000\u088b\u088d\u0003\u0014\n\u0000\u088c"+
		"\u088b\u0001\u0000\u0000\u0000\u088c\u088d\u0001\u0000\u0000\u0000\u088d"+
		"\u088f\u0001\u0000\u0000\u0000\u088e\u0890\u0003\u0014\n\u0000\u088f\u088e"+
		"\u0001\u0000\u0000\u0000\u088f\u0890\u0001\u0000\u0000\u0000\u0890\u0892"+
		"\u0001\u0000\u0000\u0000\u0891\u0893\u0003\u0014\n\u0000\u0892\u0891\u0001"+
		"\u0000\u0000\u0000\u0892\u0893\u0001\u0000\u0000\u0000\u0893\u0895\u0001"+
		"\u0000\u0000\u0000\u0894\u0896\u0003\u0014\n\u0000\u0895\u0894\u0001\u0000"+
		"\u0000\u0000\u0895\u0896\u0001\u0000\u0000\u0000\u0896\u089a\u0001\u0000"+
		"\u0000\u0000\u0897\u0899\u0003\u0014\n\u0000\u0898\u0897\u0001\u0000\u0000"+
		"\u0000\u0899\u089c\u0001\u0000\u0000\u0000\u089a\u0898\u0001\u0000\u0000"+
		"\u0000\u089a\u089b\u0001\u0000\u0000\u0000\u089b\u089d\u0001\u0000\u0000"+
		"\u0000\u089c\u089a\u0001\u0000\u0000\u0000\u089d\u089e\u0005\b\u0000\u0000"+
		"\u089e\u089f\u0005\u0004\u0000\u0000\u089f\u08a0\u0005\n\u0000\u0000\u08a0"+
		"\u08a1\u0005\u0003\u0000\u0000\u08a1\u08a2\u0005\u0006\u0000\u0000\u08a2"+
		"\u08a3\u0005\u0003\u0000\u0000\u08a3\u08a4\u0005\b\u0000\u0000\u08a4\u08a5"+
		"\u0005\b\u0000\u0000\u08a5\u08a6\u0005\b\u0000\u0000\u08a6\u08a7\u0005"+
		"\b\u0000\u0000\u08a7\u08a8\u0005\b\u0000\u0000\u08a8\u08a9\u0005\b\u0000"+
		"\u0000\u08a9\u08aa\u0005\b\u0000\u0000\u08aa\u08ab\u0005\u0004\u0000\u0000"+
		"\u08ab\u08ac\u0006\b\uffff\uffff\u0000\u08ac\u08ae\u0001\u0000\u0000\u0000"+
		"\u08ad\u0804\u0001\u0000\u0000\u0000\u08ad\u087f\u0001\u0000\u0000\u0000"+
		"\u08ae\u08af\u0001\u0000\u0000\u0000\u08af\u08ad\u0001\u0000\u0000\u0000"+
		"\u08af\u08b0\u0001\u0000\u0000\u0000\u08b0\u08b1\u0001\u0000\u0000\u0000"+
		"\u08b1\u08b2\u0005\n\u0000\u0000\u08b2\u08b3\u0005\u0003\u0000\u0000\u08b3"+
		"\u08b4\u0005\n\u0000\u0000\u08b4\u08b5\u0005\u0003\u0000\u0000\u08b5\u08b6"+
		"\u0005\u0006\u0000\u0000\u08b6\u08b7\u0005\u0004\u0000\u0000\u08b7\u08b9"+
		"\u0001\u0000\u0000\u0000\u08b8\u06d6\u0001\u0000\u0000\u0000\u08b9\u08ba"+
		"\u0001\u0000\u0000\u0000\u08ba\u08b8\u0001\u0000\u0000\u0000\u08ba\u08bb"+
		"\u0001\u0000\u0000\u0000\u08bb\u08bc\u0001\u0000\u0000\u0000\u08bc\u08bd"+
		"\u0005\u0005\u0000\u0000\u08bd\u08be\u0005\u0003\u0000\u0000\u08be\u08bf"+
		"\u0005\n\u0000\u0000\u08bf\u08c0\u0005\u0003\u0000\u0000\u08c0\u08c1\u0005"+
		"\n\u0000\u0000\u08c1\u08c2\u0005\n\u0000\u0000\u08c2\u08c3\u0005\n\u0000"+
		"\u0000\u08c3\u08c4\u0005\n\u0000\u0000\u08c4\u08c5\u0005\n\u0000\u0000"+
		"\u08c5\u08c6\u0005\n\u0000\u0000\u08c6\u08c7\u0005\u0003\u0000\u0000\u08c7"+
		"\u08c8\u0005\n\u0000\u0000\u08c8\u08c9\u0005\u0004\u0000\u0000\u08c9\u0011"+
		"\u0001\u0000\u0000\u0000\u08ca\u08cb\u0005\u0005\u0000\u0000\u08cb\u08cc"+
		"\u0005\u0003\u0000\u0000\u08cc\u08cd\u0005\n\u0000\u0000\u08cd\u08ce\u0005"+
		"\u0003\u0000\u0000\u08ce\u08cf\u0005\n\u0000\u0000\u08cf\u08d0\u0005\u0003"+
		"\u0000\u0000\u08d0\u08d1\u0005\n\u0000\u0000\u08d1\u098e\u0005\u0004\u0000"+
		"\u0000\u08d2\u08d3\u0003\u0014\n\u0000\u08d3\u08d4\u0005\u0003\u0000\u0000"+
		"\u08d4\u08d5\u0005\n\u0000\u0000\u08d5\u08d6\u0005\n\u0000\u0000\u08d6"+
		"\u08d7\u0005\u0003\u0000\u0000\u08d7\u08d8\u0005\u0004\u0000\u0000\u08d8"+
		"\u098f\u0001\u0000\u0000\u0000\u08d9\u08da\u0005\n\u0000\u0000\u08da\u08db"+
		"\u0005\u0003\u0000\u0000\u08db\u08dc\u0003\u0014\n\u0000\u08dc\u08dd\u0005"+
		"\u0003\u0000\u0000\u08dd\u08de\u0005\n\u0000\u0000\u08de\u08df\u0005\u0003"+
		"\u0000\u0000\u08df\u08e0\u0005\n\u0000\u0000\u08e0\u08e1\u0005\u0003\u0000"+
		"\u0000\u08e1\u08e2\u0005\n\u0000\u0000\u08e2\u08e3\u0005\u0003\u0000\u0000"+
		"\u08e3\u08e4\u0005\n\u0000\u0000\u08e4\u08e5\u0005\u0003\u0000\u0000\u08e5"+
		"\u08e6\u0005\n\u0000\u0000\u08e6\u08e7\u0005\u0003\u0000\u0000\u08e7\u08e8"+
		"\u0005\n\u0000\u0000\u08e8\u08e9\u0005\u0003\u0000\u0000\u08e9\u08ea\u0005"+
		"\n\u0000\u0000\u08ea\u08eb\u0005\u0003\u0000\u0000\u08eb\u08ec\u0005\n"+
		"\u0000\u0000\u08ec\u08ed\u0005\u0003\u0000\u0000\u08ed\u08ee\u0005\n\u0000"+
		"\u0000\u08ee\u08ef\u0005\u0003\u0000\u0000\u08ef\u08f0\u0005\n\u0000\u0000"+
		"\u08f0\u08f1\u0005\u0003\u0000\u0000\u08f1\u08f2\u0005\n\u0000\u0000\u08f2"+
		"\u08f3\u0005\u0003\u0000\u0000\u08f3\u0911\u0005\u0004\u0000\u0000\u08f4"+
		"\u08f5\u0005\n\u0000\u0000\u08f5\u08f6\u0005\u0003\u0000\u0000\u08f6\u08f7"+
		"\u0003\u0014\n\u0000\u08f7\u08f8\u0005\u0003\u0000\u0000\u08f8\u08f9\u0005"+
		"\u0006\u0000\u0000\u08f9\u08fa\u0005\u0003\u0000\u0000\u08fa\u08fb\u0005"+
		"\b\u0000\u0000\u08fb\u08fc\u0005\u0003\u0000\u0000\u08fc\u08fd\u0005\b"+
		"\u0000\u0000\u08fd\u08fe\u0005\u0003\u0000\u0000\u08fe\u08ff\u0005\b\u0000"+
		"\u0000\u08ff\u0900\u0005\u0003\u0000\u0000\u0900\u0901\u0005\b\u0000\u0000"+
		"\u0901\u0902\u0005\u0003\u0000\u0000\u0902\u0903\u0005\b\u0000\u0000\u0903"+
		"\u0904\u0005\u0003\u0000\u0000\u0904\u0905\u0005\b\u0000\u0000\u0905\u0906"+
		"\u0005\u0003\u0000\u0000\u0906\u0907\u0005\b\u0000\u0000\u0907\u0908\u0005"+
		"\u0003\u0000\u0000\u0908\u0909\u0005\b\u0000\u0000\u0909\u090a\u0005\u0003"+
		"\u0000\u0000\u090a\u090b\u0005\b\u0000\u0000\u090b\u090c\u0005\u0003\u0000"+
		"\u0000\u090c\u090d\u0005\b\u0000\u0000\u090d\u090e\u0005\u0003\u0000\u0000"+
		"\u090e\u090f\u0005\u0004\u0000\u0000\u090f\u0910\u0006\t\uffff\uffff\u0000"+
		"\u0910\u0912\u0001\u0000\u0000\u0000\u0911\u08f4\u0001\u0000\u0000\u0000"+
		"\u0912\u0913\u0001\u0000\u0000\u0000\u0913\u0911\u0001\u0000\u0000\u0000"+
		"\u0913\u0914\u0001\u0000\u0000\u0000\u0914\u0982\u0001\u0000\u0000\u0000"+
		"\u0915\u0916\u0005\n\u0000\u0000\u0916\u0917\u0005\u0003\u0000\u0000\u0917"+
		"\u0918\u0003\u0014\n\u0000\u0918\u0919\u0005\u0003\u0000\u0000\u0919\u091a"+
		"\u0005\n\u0000\u0000\u091a\u091b\u0005\u0003\u0000\u0000\u091b\u091c\u0005"+
		"\n\u0000\u0000\u091c\u091d\u0005\u0003\u0000\u0000\u091d\u091e\u0005\n"+
		"\u0000\u0000\u091e\u091f\u0005\u0003\u0000\u0000\u091f\u0920\u0005\n\u0000"+
		"\u0000\u0920\u0921\u0005\u0003\u0000\u0000\u0921\u0922\u0005\n\u0000\u0000"+
		"\u0922\u0923\u0005\u0003\u0000\u0000\u0923\u0924\u0005\n\u0000\u0000\u0924"+
		"\u0925\u0005\u0003\u0000\u0000\u0925\u0926\u0005\n\u0000\u0000\u0926\u0927"+
		"\u0005\u0003\u0000\u0000\u0927\u0928\u0005\n\u0000\u0000\u0928\u0929\u0005"+
		"\u0003\u0000\u0000\u0929\u092a\u0005\n\u0000\u0000\u092a\u092b\u0005\u0003"+
		"\u0000\u0000\u092b\u092c\u0005\n\u0000\u0000\u092c\u092d\u0005\u0003\u0000"+
		"\u0000\u092d\u092e\u0005\n\u0000\u0000\u092e\u092f\u0005\u0003\u0000\u0000"+
		"\u092f\u0930\u0005\n\u0000\u0000\u0930\u0931\u0005\u0003\u0000\u0000\u0931"+
		"\u0932\u0005\n\u0000\u0000\u0932\u0933\u0005\u0003\u0000\u0000\u0933\u0934"+
		"\u0005\n\u0000\u0000\u0934\u0935\u0005\u0003\u0000\u0000\u0935\u0936\u0005"+
		"\n\u0000\u0000\u0936\u0937\u0005\u0003\u0000\u0000\u0937\u0938\u0005\n"+
		"\u0000\u0000\u0938\u0939\u0005\u0003\u0000\u0000\u0939\u093a\u0005\n\u0000"+
		"\u0000\u093a\u093b\u0005\u0003\u0000\u0000\u093b\u097d\u0005\u0004\u0000"+
		"\u0000\u093c\u093d\u0005\n\u0000\u0000\u093d\u093e\u0005\u0003\u0000\u0000"+
		"\u093e\u093f\u0003\u0014\n\u0000\u093f\u0940\u0005\u0003\u0000\u0000\u0940"+
		"\u0941\u0005\u0006\u0000\u0000\u0941\u0942\u0005\u0003\u0000\u0000\u0942"+
		"\u0943\u0005\b\u0000\u0000\u0943\u0944\u0005\u0003\u0000\u0000\u0944\u0945"+
		"\u0005\b\u0000\u0000\u0945\u0946\u0005\u0003\u0000\u0000\u0946\u0947\u0005"+
		"\b\u0000\u0000\u0947\u0948\u0005\u0003\u0000\u0000\u0948\u0949\u0005\b"+
		"\u0000\u0000\u0949\u094a\u0005\u0003\u0000\u0000\u094a\u094b\u0005\b\u0000"+
		"\u0000\u094b\u094c\u0005\u0003\u0000\u0000\u094c\u094d\u0005\b\u0000\u0000"+
		"\u094d\u094e\u0005\u0003\u0000\u0000\u094e\u094f\u0005\b\u0000\u0000\u094f"+
		"\u0950\u0005\u0003\u0000\u0000\u0950\u0951\u0005\b\u0000\u0000\u0951\u0952"+
		"\u0005\u0003\u0000\u0000\u0952\u0953\u0005\b\u0000\u0000\u0953\u0954\u0005"+
		"\u0003\u0000\u0000\u0954\u0955\u0005\b\u0000\u0000\u0955\u0956\u0005\u0003"+
		"\u0000\u0000\u0956\u0957\u0005\b\u0000\u0000\u0957\u0958\u0005\u0003\u0000"+
		"\u0000\u0958\u0959\u0005\b\u0000\u0000\u0959\u095a\u0005\u0003\u0000\u0000"+
		"\u095a\u095c\u0003\u0014\n\u0000\u095b\u095d\u0003\u0014\n\u0000\u095c"+
		"\u095b\u0001\u0000\u0000\u0000\u095c\u095d\u0001\u0000\u0000\u0000\u095d"+
		"\u095f\u0001\u0000\u0000\u0000\u095e\u0960\u0003\u0014\n\u0000\u095f\u095e"+
		"\u0001\u0000\u0000\u0000\u095f\u0960\u0001\u0000\u0000\u0000\u0960\u0962"+
		"\u0001\u0000\u0000\u0000\u0961\u0963\u0003\u0014\n\u0000\u0962\u0961\u0001"+
		"\u0000\u0000\u0000\u0962\u0963\u0001\u0000\u0000\u0000\u0963\u0965\u0001"+
		"\u0000\u0000\u0000\u0964\u0966\u0003\u0014\n\u0000\u0965\u0964\u0001\u0000"+
		"\u0000\u0000\u0965\u0966\u0001\u0000\u0000\u0000\u0966\u0968\u0001\u0000"+
		"\u0000\u0000\u0967\u0969\u0003\u0014\n\u0000\u0968\u0967\u0001\u0000\u0000"+
		"\u0000\u0968\u0969\u0001\u0000\u0000\u0000\u0969\u096b\u0001\u0000\u0000"+
		"\u0000\u096a\u096c\u0003\u0014\n\u0000\u096b\u096a\u0001\u0000\u0000\u0000"+
		"\u096b\u096c\u0001\u0000\u0000\u0000\u096c\u0970\u0001\u0000\u0000\u0000"+
		"\u096d\u096f\u0003\u0014\n\u0000\u096e\u096d\u0001\u0000\u0000\u0000\u096f"+
		"\u0972\u0001\u0000\u0000\u0000\u0970\u096e\u0001\u0000\u0000\u0000\u0970"+
		"\u0971\u0001\u0000\u0000\u0000\u0971\u0973\u0001\u0000\u0000\u0000\u0972"+
		"\u0970\u0001\u0000\u0000\u0000\u0973\u0974\u0005\u0003\u0000\u0000\u0974"+
		"\u0975\u0005\b\u0000\u0000\u0975\u0976\u0005\u0003\u0000\u0000\u0976\u0977"+
		"\u0005\b\u0000\u0000\u0977\u0978\u0005\u0003\u0000\u0000\u0978\u0979\u0005"+
		"\b\u0000\u0000\u0979\u097a\u0005\u0003\u0000\u0000\u097a\u097b\u0005\u0004"+
		"\u0000\u0000\u097b\u097c\u0006\t\uffff\uffff\u0000\u097c\u097e\u0001\u0000"+
		"\u0000\u0000\u097d\u093c\u0001\u0000\u0000\u0000\u097e\u097f\u0001\u0000"+
		"\u0000\u0000\u097f\u097d\u0001\u0000\u0000\u0000\u097f\u0980\u0001\u0000"+
		"\u0000\u0000\u0980\u0982\u0001\u0000\u0000\u0000\u0981\u08d9\u0001\u0000"+
		"\u0000\u0000\u0981\u0915\u0001\u0000\u0000\u0000\u0982\u0984\u0001\u0000"+
		"\u0000\u0000\u0983\u0981\u0001\u0000\u0000\u0000\u0984\u0985\u0001\u0000"+
		"\u0000\u0000\u0985\u0983\u0001\u0000\u0000\u0000\u0985\u0986\u0001\u0000"+
		"\u0000\u0000\u0986\u0987\u0001\u0000\u0000\u0000\u0987\u0988\u0005\n\u0000"+
		"\u0000\u0988\u0989\u0005\u0003\u0000\u0000\u0989\u098a\u0005\n\u0000\u0000"+
		"\u098a\u098b\u0005\u0003\u0000\u0000\u098b\u098c\u0005\u0006\u0000\u0000"+
		"\u098c\u098d\u0005\u0004\u0000\u0000\u098d\u098f\u0001\u0000\u0000\u0000"+
		"\u098e\u08d2\u0001\u0000\u0000\u0000\u098e\u0983\u0001\u0000\u0000\u0000"+
		"\u098f\u0990\u0001\u0000\u0000\u0000\u0990\u098e\u0001\u0000\u0000\u0000"+
		"\u0990\u0991\u0001\u0000\u0000\u0000\u0991\u0992\u0001\u0000\u0000\u0000"+
		"\u0992\u0993\u0005\u0005\u0000\u0000\u0993\u0994\u0005\u0003\u0000\u0000"+
		"\u0994\u0995\u0005\n\u0000\u0000\u0995\u0996\u0005\u0003\u0000\u0000\u0996"+
		"\u0997\u0005\n\u0000\u0000\u0997\u0998\u0005\u0003\u0000\u0000\u0998\u0999"+
		"\u0005\n\u0000\u0000\u0999\u099a\u0005\u0004\u0000\u0000\u099a\u0013\u0001"+
		"\u0000\u0000\u0000\u099b\u099c\u0007\u0000\u0000\u0000\u099c\u0015\u0001"+
		"\u0000\u0000\u0000\u099d\u09a0\u0003\u0014\n\u0000\u099e\u09a0\u0005\u0003"+
		"\u0000\u0000\u099f\u099d\u0001\u0000\u0000\u0000\u099f\u099e\u0001\u0000"+
		"\u0000\u0000\u09a0\u09a1\u0001\u0000\u0000\u0000\u09a1\u099f\u0001\u0000"+
		"\u0000\u0000\u09a1\u09a2\u0001\u0000\u0000\u0000\u09a2\u09a3\u0001\u0000"+
		"\u0000\u0000\u09a3\u09a4\u0005\u0004\u0000\u0000\u09a4\u0017\u0001\u0000"+
		"\u0000\u0000\u09a5\u09a9\u0003\u0014\n\u0000\u09a6\u09a9\u0005\u0003\u0000"+
		"\u0000\u09a7\u09a9\u0005\u0004\u0000\u0000\u09a8\u09a5\u0001\u0000\u0000"+
		"\u0000\u09a8\u09a6\u0001\u0000\u0000\u0000\u09a8\u09a7\u0001\u0000\u0000"+
		"\u0000\u09a9\u09aa\u0001\u0000\u0000\u0000\u09aa\u09a8\u0001\u0000\u0000"+
		"\u0000\u09aa\u09ab\u0001\u0000\u0000\u0000\u09ab\u0019\u0001\u0000\u0000"+
		"\u0000\u0086#9\u010d\u0111\u011c\u0146\u018c\u01a2\u01a6\u01b1\u01d9\u01dc"+
		"\u01df\u01e2\u01e5\u01e8\u01ed\u01f4\u0222\u0225\u0228\u022b\u022e\u0231"+
		"\u0236\u023d\u0246\u024e\u0253\u0283\u0286\u0289\u028c\u028f\u0292\u0297"+
		"\u02a2\u02a8\u02bc\u02c2\u02f2\u02f5\u02f8\u02fb\u02fe\u0301\u0306\u0311"+
		"\u031a\u034a\u0368\u0370\u0373\u0376\u0379\u037c\u037f\u0384\u0390\u039c"+
		"\u03a4\u03ac\u03cd\u03e3\u03ee\u0410\u0550\u0559\u055c\u055f\u0562\u0565"+
		"\u0568\u056d\u0578\u0593\u05a0\u05b7\u05c2\u05e4\u05fd\u0600\u0603\u0606"+
		"\u0609\u060c\u0611\u0664\u0687\u068a\u068d\u0690\u0693\u0696\u069b\u06ae"+
		"\u06b0\u06bb\u0810\u0813\u0816\u0819\u081c\u081f\u0824\u0830\u0839\u0886"+
		"\u0889\u088c\u088f\u0892\u0895\u089a\u08ad\u08af\u08ba\u0913\u095c\u095f"+
		"\u0962\u0965\u0968\u096b\u0970\u097f\u0981\u0985\u098e\u0990\u099f\u09a1"+
		"\u09a8\u09aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}