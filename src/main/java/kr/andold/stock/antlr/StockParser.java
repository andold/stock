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
		RULE_stockDocument = 0, RULE_krxPriceCompany = 1, RULE_krxItemInfoCompany = 2, 
		RULE_krxBasicInfoCompany = 3, RULE_companyAllPrice = 4, RULE_word = 5, 
		RULE_line = 6, RULE_eof = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"stockDocument", "krxPriceCompany", "krxItemInfoCompany", "krxBasicInfoCompany", 
			"companyAllPrice", "word", "line", "eof"
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
		public CompanyAllPriceContext companyAllPrice() {
			return getRuleContext(CompanyAllPriceContext.class,0);
		}
		public KrxBasicInfoCompanyContext krxBasicInfoCompany() {
			return getRuleContext(KrxBasicInfoCompanyContext.class,0);
		}
		public KrxItemInfoCompanyContext krxItemInfoCompany() {
			return getRuleContext(KrxItemInfoCompanyContext.class,0);
		}
		public KrxPriceCompanyContext krxPriceCompany() {
			return getRuleContext(KrxPriceCompanyContext.class,0);
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
			setState(20);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				companyAllPrice();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				krxBasicInfoCompany();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
				krxItemInfoCompany();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(19);
				krxPriceCompany();
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
			setState(22);
			match(KEYWORD);
			setState(23);
			match(TAB);
			setState(24);
			match(WORD);
			setState(25);
			match(TAB);
			setState(26);
			match(WORD);
			setState(27);
			match(WORD);
			setState(28);
			match(WORD);
			setState(29);
			match(WORD);
			setState(30);
			match(WORD);
			setState(31);
			match(WORD);
			setState(32);
			match(WORD);
			setState(33);
			match(TAB);
			setState(34);
			match(WORD);
			setState(35);
			match(NEWLINE);
			setState(267); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(256); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(40); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(36);
									word();
									setState(37);
									match(TAB);
									setState(38);
									match(NEWLINE);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(42); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(44);
							word();
							setState(45);
							match(TAB);
							setState(46);
							match(TAB);
							setState(47);
							match(TAB);
							setState(48);
							match(TAB);
							setState(49);
							match(TAB);
							setState(50);
							match(NEWLINE);
							setState(51);
							word();
							setState(52);
							match(TAB);
							setState(53);
							match(TAB);
							setState(54);
							match(TAB);
							setState(55);
							match(NEWLINE);
							setState(56);
							word();
							setState(57);
							match(TAB);
							setState(58);
							match(TAB);
							setState(59);
							match(TAB);
							setState(60);
							match(TAB);
							setState(61);
							match(TAB);
							setState(62);
							match(NEWLINE);
							setState(63);
							word();
							setState(64);
							match(TAB);
							setState(65);
							match(TAB);
							setState(66);
							match(TAB);
							setState(67);
							match(TAB);
							setState(68);
							match(TAB);
							setState(69);
							match(NEWLINE);
							setState(70);
							word();
							setState(71);
							match(TAB);
							setState(72);
							match(TAB);
							setState(73);
							match(TAB);
							setState(74);
							match(TAB);
							setState(75);
							match(NEWLINE);
							setState(76);
							word();
							setState(77);
							match(TAB);
							setState(78);
							match(NEWLINE);
							setState(79);
							word();
							setState(80);
							match(TAB);
							setState(81);
							match(TAB);
							setState(82);
							match(TAB);
							setState(83);
							match(TAB);
							setState(84);
							match(TAB);
							setState(85);
							match(NEWLINE);
							setState(86);
							word();
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
							match(TAB);
							setState(94);
							match(TAB);
							setState(95);
							match(TAB);
							setState(96);
							match(TAB);
							setState(97);
							match(NEWLINE);
							setState(98);
							word();
							setState(99);
							match(TAB);
							setState(100);
							match(TAB);
							setState(101);
							match(TAB);
							setState(102);
							match(TAB);
							setState(103);
							match(TAB);
							setState(104);
							match(NEWLINE);
							setState(105);
							word();
							setState(106);
							match(TAB);
							setState(107);
							match(TAB);
							setState(108);
							match(TAB);
							setState(109);
							match(TAB);
							setState(110);
							match(NEWLINE);
							setState(111);
							word();
							setState(112);
							match(TAB);
							setState(113);
							match(NEWLINE);
							setState(114);
							word();
							setState(115);
							match(TAB);
							setState(116);
							match(NEWLINE);
							setState(117);
							word();
							setState(118);
							match(TAB);
							setState(119);
							match(NEWLINE);
							setState(120);
							word();
							setState(121);
							match(TAB);
							setState(122);
							match(NEWLINE);
							setState(123);
							word();
							setState(124);
							match(TAB);
							setState(125);
							match(TAB);
							setState(126);
							match(TAB);
							setState(127);
							match(TAB);
							setState(128);
							match(TAB);
							setState(129);
							match(NEWLINE);
							setState(130);
							word();
							setState(131);
							match(TAB);
							setState(132);
							match(TAB);
							setState(133);
							match(TAB);
							setState(134);
							match(NEWLINE);
							setState(135);
							word();
							setState(136);
							match(TAB);
							setState(137);
							match(TAB);
							setState(138);
							match(TAB);
							setState(139);
							match(TAB);
							setState(140);
							match(TAB);
							setState(141);
							match(NEWLINE);
							setState(142);
							word();
							setState(143);
							match(TAB);
							setState(144);
							match(TAB);
							setState(145);
							match(TAB);
							setState(146);
							match(TAB);
							setState(147);
							match(TAB);
							setState(148);
							match(NEWLINE);
							setState(149);
							word();
							setState(150);
							match(TAB);
							setState(151);
							match(TAB);
							setState(152);
							match(TAB);
							setState(153);
							match(TAB);
							setState(154);
							match(NEWLINE);
							setState(155);
							word();
							setState(156);
							match(TAB);
							setState(157);
							match(NEWLINE);
							setState(158);
							word();
							setState(159);
							match(TAB);
							setState(160);
							match(NEWLINE);
							setState(161);
							word();
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
							match(TAB);
							setState(170);
							match(NEWLINE);
							setState(171);
							word();
							setState(172);
							match(TAB);
							setState(173);
							match(TAB);
							setState(174);
							match(TAB);
							setState(175);
							match(NEWLINE);
							setState(176);
							word();
							setState(177);
							match(TAB);
							setState(178);
							match(TAB);
							setState(179);
							match(TAB);
							setState(180);
							match(TAB);
							setState(181);
							match(TAB);
							setState(182);
							match(NEWLINE);
							setState(183);
							word();
							setState(184);
							match(TAB);
							setState(185);
							match(TAB);
							setState(186);
							match(TAB);
							setState(187);
							match(TAB);
							setState(188);
							match(TAB);
							setState(189);
							match(NEWLINE);
							setState(190);
							word();
							setState(191);
							match(TAB);
							setState(192);
							match(TAB);
							setState(193);
							match(TAB);
							setState(194);
							match(TAB);
							setState(195);
							match(NEWLINE);
							setState(196);
							word();
							setState(197);
							match(TAB);
							setState(198);
							match(WORD);
							setState(199);
							match(NEWLINE);
							setState(200);
							word();
							setState(201);
							match(TAB);
							setState(202);
							match(NEWLINE);
							setState(252); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(203);
									((KrxPriceCompanyContext)_localctx).code = word();
									setState(204);
									match(TAB);
									setState(205);
									((KrxPriceCompanyContext)_localctx).base = match(DATE);
									setState(206);
									match(NEWLINE);
									setState(207);
									word();
									setState(208);
									match(TAB);
									setState(209);
									((KrxPriceCompanyContext)_localctx).closing = match(NUMBER);
									setState(210);
									match(NEWLINE);
									setState(211);
									word();
									setState(212);
									match(TAB);
									setState(213);
									match(NUMBER);
									setState(214);
									match(NEWLINE);
									setState(215);
									word();
									setState(216);
									match(TAB);
									setState(217);
									match(NUMBER);
									setState(218);
									match(NEWLINE);
									setState(219);
									word();
									setState(220);
									match(TAB);
									setState(221);
									((KrxPriceCompanyContext)_localctx).market = match(NUMBER);
									setState(222);
									match(NEWLINE);
									setState(223);
									word();
									setState(224);
									match(TAB);
									setState(225);
									((KrxPriceCompanyContext)_localctx).high = match(NUMBER);
									setState(226);
									match(NEWLINE);
									setState(227);
									word();
									setState(228);
									match(TAB);
									setState(229);
									((KrxPriceCompanyContext)_localctx).low = match(NUMBER);
									setState(230);
									match(NEWLINE);
									setState(231);
									word();
									setState(232);
									match(TAB);
									setState(233);
									((KrxPriceCompanyContext)_localctx).volume = match(NUMBER);
									setState(234);
									match(NEWLINE);
									setState(235);
									word();
									setState(236);
									match(TAB);
									setState(237);
									match(NUMBER);
									setState(238);
									match(NEWLINE);
									setState(239);
									word();
									setState(240);
									match(TAB);
									setState(241);
									match(NUMBER);
									setState(242);
									match(NEWLINE);
									setState(243);
									word();
									setState(244);
									match(TAB);
									setState(245);
									((KrxPriceCompanyContext)_localctx).volumeOfListedShares = match(NUMBER);
									setState(246);
									match(NEWLINE);
									setState(247);
									word();
									setState(248);
									match(TAB);
									setState(249);
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
								setState(254); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(258); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(260);
					match(WORD);
					setState(261);
					match(TAB);
					setState(262);
					match(WORD);
					setState(263);
					match(TAB);
					setState(264);
					match(DATE);
					setState(265);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(269); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(271);
			match(KEYWORD);
			setState(272);
			match(TAB);
			setState(273);
			match(WORD);
			setState(274);
			match(TAB);
			setState(275);
			match(WORD);
			setState(276);
			match(WORD);
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
			match(TAB);
			setState(283);
			match(WORD);
			setState(284);
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
		enterRule(_localctx, 4, RULE_krxItemInfoCompany);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
			match(TAB);
			setState(297);
			match(WORD);
			setState(298);
			match(NEWLINE);
			setState(299);
			match(KEYWORD);
			setState(300);
			match(TAB);
			setState(301);
			((KrxItemInfoCompanyContext)_localctx).type = match(WORD);
			setState(302);
			match(NEWLINE);
			setState(303);
			match(WORD);
			setState(304);
			match(TAB);
			setState(305);
			match(WORD);
			setState(306);
			match(TAB);
			setState(307);
			((KrxItemInfoCompanyContext)_localctx).symbol = word();
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(308);
				((KrxItemInfoCompanyContext)_localctx).symbol1 = word();
				}
				break;
			}
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(311);
				((KrxItemInfoCompanyContext)_localctx).symbol2 = word();
				}
				break;
			}
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(314);
				((KrxItemInfoCompanyContext)_localctx).symbol3 = word();
				}
				break;
			}
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(317);
				((KrxItemInfoCompanyContext)_localctx).symbol4 = word();
				}
				break;
			}
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(320);
				((KrxItemInfoCompanyContext)_localctx).symbol5 = word();
				}
				break;
			}
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(323);
				((KrxItemInfoCompanyContext)_localctx).symbol6 = word();
				}
				break;
			}
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(326);
				((KrxItemInfoCompanyContext)_localctx).symbol7 = word();
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
			match(TAB);
			setState(334); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(333);
				word();
				}
				}
				setState(336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(338);
			match(TAB);
			setState(339);
			match(NEWLINE);
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
			((KrxItemInfoCompanyContext)_localctx).code = word();
			setState(347);
			match(TAB);
			setState(348);
			match(NEWLINE);
			setState(349);
			match(WORD);
			setState(350);
			match(TAB);
			setState(351);
			match(WORD);
			setState(352);
			match(TAB);
			setState(353);
			word();
			setState(354);
			match(TAB);
			setState(355);
			match(NUMBER);
			setState(356);
			match(TAB);
			setState(357);
			match(NEWLINE);
			setState(358);
			match(WORD);
			setState(359);
			match(TAB);
			setState(360);
			match(WORD);
			setState(361);
			match(TAB);
			setState(362);
			((KrxItemInfoCompanyContext)_localctx).volumeOfListedShares = match(NUMBER);
			setState(363);
			match(TAB);
			setState(364);
			match(WORD);
			setState(365);
			match(TAB);
			setState(366);
			match(NEWLINE);
			setState(367);
			match(WORD);
			setState(368);
			match(TAB);
			setState(369);
			match(WORD);
			setState(370);
			match(TAB);
			setState(371);
			((KrxItemInfoCompanyContext)_localctx).ipo = match(DATE);
			setState(372);
			match(TAB);
			setState(373);
			match(DATE);
			setState(374);
			match(TAB);
			setState(375);
			match(NEWLINE);
			setState(376);
			match(WORD);
			setState(377);
			match(TAB);
			setState(378);
			match(WORD);
			setState(379);
			match(TAB);
			setState(380);
			((KrxItemInfoCompanyContext)_localctx).category = word();
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(381);
				((KrxItemInfoCompanyContext)_localctx).category1 = word();
				}
				break;
			}
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(384);
				((KrxItemInfoCompanyContext)_localctx).category2 = word();
				}
				break;
			}
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(387);
				((KrxItemInfoCompanyContext)_localctx).category3 = word();
				}
				break;
			}
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(390);
				((KrxItemInfoCompanyContext)_localctx).category4 = word();
				}
				break;
			}
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(393);
				((KrxItemInfoCompanyContext)_localctx).category5 = word();
				}
				break;
			}
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(396);
				((KrxItemInfoCompanyContext)_localctx).category6 = word();
				}
				break;
			}
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(399);
				((KrxItemInfoCompanyContext)_localctx).category7 = word();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
			match(TAB);
			setState(407); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(406);
				word();
				}
				}
				setState(409); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(411);
			match(TAB);
			setState(412);
			match(NEWLINE);
			setState(413);
			match(WORD);
			setState(414);
			match(TAB);
			setState(416); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(415);
				word();
				}
				}
				setState(418); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(420);
			match(TAB);
			setState(421);
			match(NEWLINE);
			setState(422);
			match(WORD);
			setState(423);
			match(TAB);
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(424);
				match(NUMBER);
				setState(425);
				match(TAB);
				}
				break;
			}
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(428);
				word();
				}
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(434);
			match(TAB);
			setState(435);
			match(NEWLINE);
			setState(436);
			match(WORD);
			setState(437);
			match(TAB);
			setState(438);
			match(WORD);
			setState(439);
			match(TAB);
			setState(440);
			match(NEWLINE);
			setState(441);
			match(WORD);
			setState(442);
			match(TAB);
			setState(443);
			match(WORD);
			setState(444);
			match(TAB);
			setState(445);
			match(DATE);
			setState(446);
			match(NEWLINE);
			setState(447);
			match(KEYWORD);
			setState(448);
			match(TAB);
			setState(449);
			match(WORD);
			setState(450);
			match(TAB);
			setState(451);
			match(WORD);
			setState(452);
			match(WORD);
			setState(453);
			match(WORD);
			setState(454);
			match(WORD);
			setState(455);
			match(WORD);
			setState(456);
			match(WORD);
			setState(457);
			match(TAB);
			setState(458);
			match(WORD);
			setState(459);
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
		enterRule(_localctx, 6, RULE_krxBasicInfoCompany);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(KEYWORD);
			setState(463);
			match(TAB);
			setState(464);
			match(WORD);
			setState(465);
			match(TAB);
			setState(466);
			match(WORD);
			setState(467);
			match(WORD);
			setState(468);
			match(WORD);
			setState(469);
			match(WORD);
			setState(470);
			match(WORD);
			setState(471);
			match(WORD);
			setState(472);
			match(TAB);
			setState(473);
			match(WORD);
			setState(474);
			match(NEWLINE);
			setState(912); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(478); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(475);
							match(KEYWORD);
							setState(476);
							match(TAB);
							setState(477);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(480); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(482);
					match(KEYWORD);
					setState(483);
					match(TAB);
					setState(484);
					match(TAB);
					setState(485);
					match(TAB);
					setState(486);
					match(TAB);
					setState(487);
					match(TAB);
					setState(488);
					match(NEWLINE);
					setState(489);
					match(KEYWORD);
					setState(490);
					match(TAB);
					setState(491);
					match(TAB);
					setState(492);
					match(TAB);
					setState(493);
					match(NEWLINE);
					setState(494);
					match(KEYWORD);
					setState(495);
					match(TAB);
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
					match(KEYWORD);
					setState(502);
					match(TAB);
					setState(503);
					match(TAB);
					setState(504);
					match(TAB);
					setState(505);
					match(TAB);
					setState(506);
					match(TAB);
					setState(507);
					match(NEWLINE);
					setState(508);
					match(KEYWORD);
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
					match(NEWLINE);
					setState(517);
					match(KEYWORD);
					setState(518);
					match(TAB);
					setState(519);
					match(TAB);
					setState(520);
					match(TAB);
					setState(521);
					match(TAB);
					setState(522);
					match(TAB);
					setState(523);
					match(NEWLINE);
					setState(524);
					match(KEYWORD);
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
					match(KEYWORD);
					setState(531);
					match(TAB);
					setState(532);
					match(TAB);
					setState(533);
					match(TAB);
					setState(534);
					match(NEWLINE);
					setState(535);
					match(KEYWORD);
					setState(536);
					match(TAB);
					setState(537);
					match(TAB);
					setState(538);
					match(TAB);
					setState(539);
					match(NEWLINE);
					setState(540);
					match(KEYWORD);
					setState(541);
					match(TAB);
					setState(542);
					match(TAB);
					setState(543);
					match(TAB);
					setState(544);
					match(TAB);
					setState(545);
					match(TAB);
					setState(546);
					match(NEWLINE);
					setState(547);
					match(KEYWORD);
					setState(548);
					match(TAB);
					setState(549);
					match(TAB);
					setState(550);
					match(TAB);
					setState(551);
					match(TAB);
					setState(552);
					match(TAB);
					setState(553);
					match(NEWLINE);
					setState(554);
					match(KEYWORD);
					setState(555);
					match(TAB);
					setState(556);
					match(TAB);
					setState(557);
					match(NEWLINE);
					setState(558);
					match(KEYWORD);
					setState(559);
					match(TAB);
					setState(560);
					match(NEWLINE);
					setState(561);
					match(KEYWORD);
					setState(562);
					match(TAB);
					setState(563);
					match(TAB);
					setState(564);
					match(TAB);
					setState(565);
					match(TAB);
					setState(566);
					match(TAB);
					setState(567);
					match(NEWLINE);
					setState(568);
					match(KEYWORD);
					setState(569);
					match(TAB);
					setState(570);
					match(TAB);
					setState(571);
					match(TAB);
					setState(572);
					match(NEWLINE);
					setState(573);
					match(KEYWORD);
					setState(574);
					match(TAB);
					setState(575);
					match(TAB);
					setState(576);
					match(TAB);
					setState(577);
					match(TAB);
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
					match(TAB);
					setState(592);
					match(NEWLINE);
					setState(593);
					match(KEYWORD);
					setState(594);
					match(TAB);
					setState(595);
					match(NEWLINE);
					setState(596);
					match(KEYWORD);
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
					match(KEYWORD);
					setState(604);
					match(TAB);
					setState(605);
					match(TAB);
					setState(606);
					match(TAB);
					setState(607);
					match(NEWLINE);
					setState(608);
					match(KEYWORD);
					setState(609);
					match(TAB);
					setState(610);
					match(TAB);
					setState(611);
					match(TAB);
					setState(612);
					match(TAB);
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
					match(TAB);
					setState(627);
					match(NEWLINE);
					setState(628);
					match(KEYWORD);
					setState(629);
					match(TAB);
					setState(630);
					match(NEWLINE);
					setState(631);
					match(KEYWORD);
					setState(632);
					match(TAB);
					setState(633);
					match(TAB);
					setState(634);
					match(TAB);
					setState(635);
					match(TAB);
					setState(636);
					match(TAB);
					setState(637);
					match(NEWLINE);
					setState(638);
					match(KEYWORD);
					setState(639);
					match(TAB);
					setState(640);
					match(TAB);
					setState(641);
					match(TAB);
					setState(642);
					match(NEWLINE);
					setState(643);
					match(KEYWORD);
					setState(644);
					match(TAB);
					setState(645);
					match(TAB);
					setState(646);
					match(TAB);
					setState(647);
					match(TAB);
					setState(648);
					match(TAB);
					setState(649);
					match(NEWLINE);
					setState(650);
					match(KEYWORD);
					setState(651);
					match(TAB);
					setState(652);
					match(TAB);
					setState(653);
					match(TAB);
					setState(654);
					match(TAB);
					setState(655);
					match(TAB);
					setState(656);
					match(NEWLINE);
					setState(657);
					match(KEYWORD);
					setState(658);
					match(TAB);
					setState(659);
					match(TAB);
					setState(660);
					match(TAB);
					setState(661);
					match(TAB);
					setState(662);
					match(NEWLINE);
					setState(663);
					match(KEYWORD);
					setState(664);
					match(TAB);
					setState(665);
					match(NEWLINE);
					setState(666);
					match(KEYWORD);
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
					setState(673);
					match(TAB);
					setState(674);
					match(TAB);
					setState(675);
					match(NEWLINE);
					setState(676);
					match(KEYWORD);
					setState(677);
					match(TAB);
					setState(678);
					match(TAB);
					setState(679);
					match(TAB);
					setState(680);
					match(NEWLINE);
					setState(681);
					match(KEYWORD);
					setState(682);
					match(TAB);
					setState(683);
					match(TAB);
					setState(684);
					match(TAB);
					setState(685);
					match(TAB);
					setState(686);
					match(TAB);
					setState(687);
					match(NEWLINE);
					setState(688);
					match(KEYWORD);
					setState(689);
					match(TAB);
					setState(690);
					match(TAB);
					setState(691);
					match(TAB);
					setState(692);
					match(TAB);
					setState(693);
					match(TAB);
					setState(694);
					match(NEWLINE);
					setState(695);
					match(KEYWORD);
					setState(696);
					match(TAB);
					setState(697);
					match(TAB);
					setState(698);
					match(TAB);
					setState(699);
					match(TAB);
					setState(700);
					match(NEWLINE);
					setState(701);
					match(KEYWORD);
					setState(702);
					match(TAB);
					setState(703);
					match(NEWLINE);
					setState(704);
					match(KEYWORD);
					setState(705);
					match(TAB);
					setState(706);
					match(TAB);
					setState(707);
					match(TAB);
					setState(708);
					match(TAB);
					setState(709);
					match(TAB);
					setState(710);
					match(NEWLINE);
					setState(711);
					match(KEYWORD);
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
					match(TAB);
					setState(721);
					match(TAB);
					setState(722);
					match(NEWLINE);
					setState(723);
					match(KEYWORD);
					setState(724);
					match(TAB);
					setState(725);
					match(TAB);
					setState(726);
					match(TAB);
					setState(727);
					match(TAB);
					setState(728);
					match(TAB);
					setState(729);
					match(NEWLINE);
					setState(730);
					match(KEYWORD);
					setState(731);
					match(TAB);
					setState(732);
					match(TAB);
					setState(733);
					match(TAB);
					setState(734);
					match(TAB);
					setState(735);
					match(NEWLINE);
					setState(736);
					match(KEYWORD);
					setState(737);
					match(TAB);
					setState(738);
					match(NEWLINE);
					setState(739);
					match(KEYWORD);
					setState(740);
					match(TAB);
					setState(741);
					match(TAB);
					setState(742);
					match(TAB);
					setState(743);
					match(TAB);
					setState(744);
					match(TAB);
					setState(745);
					match(NEWLINE);
					setState(746);
					match(KEYWORD);
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
					match(TAB);
					setState(757);
					match(NEWLINE);
					setState(758);
					match(KEYWORD);
					setState(759);
					match(TAB);
					setState(760);
					match(TAB);
					setState(761);
					match(TAB);
					setState(762);
					match(TAB);
					setState(763);
					match(TAB);
					setState(764);
					match(NEWLINE);
					setState(765);
					match(KEYWORD);
					setState(766);
					match(TAB);
					setState(767);
					match(TAB);
					setState(768);
					match(TAB);
					setState(769);
					match(TAB);
					setState(770);
					match(NEWLINE);
					setState(771);
					match(KEYWORD);
					setState(772);
					match(TAB);
					setState(773);
					match(WORD);
					setState(774);
					match(NEWLINE);
					setState(775);
					match(KEYWORD);
					setState(776);
					match(TAB);
					setState(777);
					match(NEWLINE);
					setState(901); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						{
						setState(778);
						match(KEYWORD);
						setState(779);
						match(TAB);
						setState(780);
						match(WORD);
						setState(781);
						match(NEWLINE);
						setState(782);
						match(KEYWORD);
						setState(783);
						match(TAB);
						setState(784);
						((KrxBasicInfoCompanyContext)_localctx).code = word();
						setState(785);
						match(NEWLINE);
						setState(786);
						match(KEYWORD);
						setState(787);
						match(TAB);
						setState(788);
						match(NEWLINE);
						setState(789);
						match(KEYWORD);
						setState(790);
						match(TAB);
						setState(791);
						match(TAB);
						setState(792);
						match(NEWLINE);
						setState(793);
						match(KEYWORD);
						setState(794);
						match(TAB);
						setState(795);
						match(TAB);
						setState(796);
						match(TAB);
						setState(798); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(797);
							word();
							}
							}
							setState(800); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(802);
						match(NEWLINE);
						setState(803);
						match(KEYWORD);
						setState(804);
						match(TAB);
						setState(805);
						match(TAB);
						setState(806);
						match(TAB);
						setState(807);
						((KrxBasicInfoCompanyContext)_localctx).symbol = word();
						setState(809);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
						case 1:
							{
							setState(808);
							((KrxBasicInfoCompanyContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(812);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
						case 1:
							{
							setState(811);
							((KrxBasicInfoCompanyContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(815);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
						case 1:
							{
							setState(814);
							((KrxBasicInfoCompanyContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(818);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
						case 1:
							{
							setState(817);
							((KrxBasicInfoCompanyContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(821);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
						case 1:
							{
							setState(820);
							((KrxBasicInfoCompanyContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(824);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
						case 1:
							{
							setState(823);
							((KrxBasicInfoCompanyContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(829);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(826);
							((KrxBasicInfoCompanyContext)_localctx).symbol7 = word();
							}
							}
							setState(831);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(832);
						match(NEWLINE);
						setState(833);
						match(KEYWORD);
						setState(834);
						match(TAB);
						setState(835);
						match(TAB);
						setState(836);
						match(TAB);
						setState(838); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(837);
							word();
							}
							}
							setState(840); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(842);
						match(NEWLINE);
						setState(843);
						match(KEYWORD);
						setState(844);
						match(TAB);
						setState(845);
						match(TAB);
						setState(846);
						match(TAB);
						setState(847);
						match(NEWLINE);
						setState(848);
						match(KEYWORD);
						setState(849);
						match(TAB);
						setState(850);
						match(TAB);
						setState(851);
						match(TAB);
						setState(852);
						match(NEWLINE);
						setState(853);
						match(KEYWORD);
						setState(854);
						match(TAB);
						setState(855);
						match(TAB);
						setState(856);
						match(NEWLINE);
						setState(857);
						match(KEYWORD);
						setState(858);
						match(TAB);
						setState(859);
						((KrxBasicInfoCompanyContext)_localctx).ipo = match(DATE);
						setState(860);
						match(NEWLINE);
						setState(861);
						match(KEYWORD);
						setState(862);
						match(TAB);
						setState(863);
						((KrxBasicInfoCompanyContext)_localctx).type = match(WORD);
						setState(867);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(864);
							word();
							}
							}
							setState(869);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(870);
						match(NEWLINE);
						setState(871);
						match(KEYWORD);
						setState(872);
						match(TAB);
						setState(873);
						match(WORD);
						setState(874);
						match(NEWLINE);
						setState(875);
						match(KEYWORD);
						setState(876);
						match(TAB);
						setState(880);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(877);
							word();
							}
							}
							setState(882);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(883);
						match(NEWLINE);
						setState(884);
						match(KEYWORD);
						setState(885);
						match(TAB);
						setState(886);
						match(WORD);
						setState(887);
						match(NEWLINE);
						setState(888);
						match(KEYWORD);
						setState(889);
						match(TAB);
						setState(890);
						word();
						setState(891);
						match(NEWLINE);
						setState(892);
						match(KEYWORD);
						setState(893);
						match(TAB);
						setState(894);
						((KrxBasicInfoCompanyContext)_localctx).volumeOfListedShares = match(NUMBER);
						setState(895);
						match(NEWLINE);
						setState(896);
						match(KEYWORD);
						setState(897);
						match(TAB);
						setState(898);
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
						setState(903); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==KEYWORD );
					setState(905);
					match(WORD);
					setState(906);
					match(TAB);
					setState(907);
					match(WORD);
					setState(908);
					match(TAB);
					setState(909);
					match(DATE);
					setState(910);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(914); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(916);
			match(KEYWORD);
			setState(917);
			match(TAB);
			setState(918);
			match(WORD);
			setState(919);
			match(TAB);
			setState(920);
			match(WORD);
			setState(921);
			match(WORD);
			setState(922);
			match(WORD);
			setState(923);
			match(WORD);
			setState(924);
			match(WORD);
			setState(925);
			match(WORD);
			setState(926);
			match(TAB);
			setState(927);
			match(WORD);
			setState(928);
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
			setState(930);
			match(KEYWORD);
			setState(931);
			match(TAB);
			setState(932);
			match(WORD);
			setState(933);
			match(TAB);
			setState(934);
			match(WORD);
			setState(935);
			match(WORD);
			setState(936);
			match(WORD);
			setState(937);
			match(WORD);
			setState(938);
			match(WORD);
			setState(939);
			match(WORD);
			setState(940);
			match(TAB);
			setState(941);
			match(WORD);
			setState(942);
			match(NEWLINE);
			setState(1425); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(943);
				match(WORD);
				setState(944);
				match(TAB);
				setState(945);
				match(DATE);
				setState(946);
				match(TAB);
				setState(947);
				match(NEWLINE);
				setState(948);
				match(WORD);
				setState(949);
				match(TAB);
				setState(950);
				match(DATE);
				setState(951);
				match(TAB);
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
				match(NEWLINE);
				setState(958);
				match(WORD);
				setState(959);
				match(TAB);
				setState(960);
				match(DATE);
				setState(961);
				match(TAB);
				setState(962);
				match(TAB);
				setState(963);
				match(TAB);
				setState(964);
				match(TAB);
				setState(965);
				match(TAB);
				setState(966);
				match(NEWLINE);
				setState(967);
				match(WORD);
				setState(968);
				match(TAB);
				setState(969);
				match(DATE);
				setState(970);
				match(TAB);
				setState(971);
				match(TAB);
				setState(972);
				match(TAB);
				setState(973);
				match(NEWLINE);
				setState(974);
				match(WORD);
				setState(975);
				match(TAB);
				setState(976);
				match(DATE);
				setState(977);
				match(TAB);
				setState(978);
				match(TAB);
				setState(979);
				match(TAB);
				setState(980);
				match(TAB);
				setState(981);
				match(TAB);
				setState(982);
				match(NEWLINE);
				setState(983);
				match(WORD);
				setState(984);
				match(TAB);
				setState(985);
				match(DATE);
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
				match(WORD);
				setState(993);
				match(TAB);
				setState(994);
				match(DATE);
				setState(995);
				match(TAB);
				setState(996);
				match(TAB);
				setState(997);
				match(TAB);
				setState(998);
				match(TAB);
				setState(999);
				match(NEWLINE);
				setState(1000);
				match(WORD);
				setState(1001);
				match(TAB);
				setState(1002);
				match(DATE);
				setState(1003);
				match(TAB);
				setState(1004);
				match(NEWLINE);
				setState(1005);
				match(WORD);
				setState(1006);
				match(TAB);
				setState(1007);
				match(DATE);
				setState(1008);
				match(TAB);
				setState(1009);
				match(NEWLINE);
				setState(1010);
				match(WORD);
				setState(1011);
				match(TAB);
				setState(1012);
				match(DATE);
				setState(1013);
				match(TAB);
				setState(1014);
				match(TAB);
				setState(1015);
				match(TAB);
				setState(1016);
				match(TAB);
				setState(1017);
				match(TAB);
				setState(1018);
				match(NEWLINE);
				setState(1019);
				match(WORD);
				setState(1020);
				match(TAB);
				setState(1021);
				match(DATE);
				setState(1022);
				match(TAB);
				setState(1023);
				match(TAB);
				setState(1024);
				match(TAB);
				setState(1025);
				match(NEWLINE);
				setState(1026);
				match(WORD);
				setState(1027);
				match(TAB);
				setState(1028);
				match(DATE);
				setState(1029);
				match(TAB);
				setState(1030);
				match(TAB);
				setState(1031);
				match(TAB);
				setState(1032);
				match(TAB);
				setState(1033);
				match(TAB);
				setState(1034);
				match(NEWLINE);
				setState(1035);
				match(WORD);
				setState(1036);
				match(TAB);
				setState(1037);
				match(DATE);
				setState(1038);
				match(TAB);
				setState(1039);
				match(TAB);
				setState(1040);
				match(TAB);
				setState(1041);
				match(TAB);
				setState(1042);
				match(TAB);
				setState(1043);
				match(NEWLINE);
				setState(1044);
				match(WORD);
				setState(1045);
				match(TAB);
				setState(1046);
				match(DATE);
				setState(1047);
				match(TAB);
				setState(1048);
				match(TAB);
				setState(1049);
				match(TAB);
				setState(1050);
				match(TAB);
				setState(1051);
				match(NEWLINE);
				setState(1052);
				match(WORD);
				setState(1053);
				match(TAB);
				setState(1054);
				match(DATE);
				setState(1055);
				match(TAB);
				setState(1056);
				match(NEWLINE);
				setState(1057);
				match(WORD);
				setState(1058);
				match(TAB);
				setState(1059);
				match(DATE);
				setState(1060);
				match(TAB);
				setState(1061);
				match(NEWLINE);
				setState(1062);
				match(WORD);
				setState(1063);
				match(TAB);
				setState(1064);
				match(DATE);
				setState(1065);
				match(TAB);
				setState(1066);
				match(NEWLINE);
				setState(1067);
				match(WORD);
				setState(1068);
				match(TAB);
				setState(1069);
				match(DATE);
				setState(1070);
				match(TAB);
				setState(1071);
				match(NEWLINE);
				setState(1072);
				match(WORD);
				setState(1073);
				match(TAB);
				setState(1074);
				match(DATE);
				setState(1075);
				match(TAB);
				setState(1076);
				match(TAB);
				setState(1077);
				match(TAB);
				setState(1078);
				match(TAB);
				setState(1079);
				match(TAB);
				setState(1080);
				match(NEWLINE);
				setState(1081);
				match(WORD);
				setState(1082);
				match(TAB);
				setState(1083);
				match(DATE);
				setState(1084);
				match(TAB);
				setState(1085);
				match(TAB);
				setState(1086);
				match(TAB);
				setState(1087);
				match(TAB);
				setState(1088);
				match(NEWLINE);
				setState(1089);
				match(WORD);
				setState(1090);
				match(TAB);
				setState(1091);
				match(DATE);
				setState(1092);
				match(TAB);
				setState(1093);
				match(TAB);
				setState(1094);
				match(TAB);
				setState(1095);
				match(TAB);
				setState(1096);
				match(TAB);
				setState(1097);
				match(NEWLINE);
				setState(1098);
				match(WORD);
				setState(1099);
				match(TAB);
				setState(1100);
				match(DATE);
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
				match(NEWLINE);
				setState(1115);
				match(WORD);
				setState(1116);
				match(TAB);
				setState(1117);
				match(DATE);
				setState(1118);
				match(TAB);
				setState(1119);
				match(NEWLINE);
				setState(1120);
				match(WORD);
				setState(1121);
				match(TAB);
				setState(1122);
				match(DATE);
				setState(1123);
				match(TAB);
				setState(1124);
				match(NEWLINE);
				setState(1125);
				match(WORD);
				setState(1126);
				match(TAB);
				setState(1127);
				match(DATE);
				setState(1128);
				match(TAB);
				setState(1129);
				match(NEWLINE);
				setState(1130);
				match(WORD);
				setState(1131);
				match(TAB);
				setState(1132);
				match(DATE);
				setState(1133);
				match(TAB);
				setState(1134);
				match(NEWLINE);
				setState(1135);
				match(WORD);
				setState(1136);
				match(TAB);
				setState(1137);
				match(DATE);
				setState(1138);
				match(TAB);
				setState(1139);
				match(TAB);
				setState(1140);
				match(TAB);
				setState(1141);
				match(TAB);
				setState(1142);
				match(TAB);
				setState(1143);
				match(NEWLINE);
				setState(1144);
				match(WORD);
				setState(1145);
				match(TAB);
				setState(1146);
				match(DATE);
				setState(1147);
				match(TAB);
				setState(1148);
				match(TAB);
				setState(1149);
				match(TAB);
				setState(1150);
				match(NEWLINE);
				setState(1151);
				match(WORD);
				setState(1152);
				match(TAB);
				setState(1153);
				match(DATE);
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
				match(WORD);
				setState(1161);
				match(TAB);
				setState(1162);
				match(DATE);
				setState(1163);
				match(TAB);
				setState(1164);
				match(TAB);
				setState(1165);
				match(TAB);
				setState(1166);
				match(TAB);
				setState(1167);
				match(TAB);
				setState(1168);
				match(NEWLINE);
				setState(1169);
				match(WORD);
				setState(1170);
				match(TAB);
				setState(1171);
				match(DATE);
				setState(1172);
				match(TAB);
				setState(1173);
				match(TAB);
				setState(1174);
				match(TAB);
				setState(1175);
				match(TAB);
				setState(1176);
				match(NEWLINE);
				setState(1177);
				match(WORD);
				setState(1178);
				match(TAB);
				setState(1179);
				match(DATE);
				setState(1180);
				match(TAB);
				setState(1181);
				match(NEWLINE);
				setState(1182);
				match(WORD);
				setState(1183);
				match(TAB);
				setState(1184);
				match(DATE);
				setState(1185);
				match(TAB);
				setState(1186);
				match(NEWLINE);
				setState(1187);
				match(WORD);
				setState(1188);
				match(TAB);
				setState(1189);
				match(DATE);
				setState(1190);
				match(TAB);
				setState(1191);
				match(NEWLINE);
				setState(1192);
				match(WORD);
				setState(1193);
				match(TAB);
				setState(1194);
				match(DATE);
				setState(1195);
				match(TAB);
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
				match(TAB);
				setState(1206);
				match(TAB);
				setState(1207);
				match(NEWLINE);
				setState(1208);
				match(WORD);
				setState(1209);
				match(TAB);
				setState(1210);
				match(DATE);
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
				match(WORD);
				setState(1218);
				match(TAB);
				setState(1219);
				match(DATE);
				setState(1220);
				match(TAB);
				setState(1221);
				match(TAB);
				setState(1222);
				match(TAB);
				setState(1223);
				match(TAB);
				setState(1224);
				match(TAB);
				setState(1225);
				match(NEWLINE);
				setState(1226);
				match(WORD);
				setState(1227);
				match(TAB);
				setState(1228);
				match(DATE);
				setState(1229);
				match(TAB);
				setState(1230);
				match(TAB);
				setState(1231);
				match(TAB);
				setState(1232);
				match(TAB);
				setState(1233);
				match(NEWLINE);
				setState(1234);
				match(WORD);
				setState(1235);
				match(TAB);
				setState(1236);
				match(DATE);
				setState(1237);
				match(TAB);
				setState(1238);
				match(WORD);
				setState(1239);
				match(NEWLINE);
				setState(1240);
				match(WORD);
				setState(1241);
				match(TAB);
				setState(1242);
				match(DATE);
				setState(1243);
				match(TAB);
				setState(1244);
				match(NEWLINE);
				setState(1414); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(1414);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
						case 1:
							{
							{
							setState(1245);
							match(WORD);
							setState(1246);
							match(TAB);
							setState(1247);
							match(DATE);
							setState(1248);
							match(TAB);
							setState(1249);
							((CompanyAllPriceContext)_localctx).code = word();
							setState(1250);
							match(NEWLINE);
							setState(1251);
							match(WORD);
							setState(1252);
							match(TAB);
							setState(1253);
							match(DATE);
							setState(1254);
							match(TAB);
							setState(1255);
							((CompanyAllPriceContext)_localctx).symbol = word();
							setState(1257);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
							case 1:
								{
								setState(1256);
								((CompanyAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(1260);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
							case 1:
								{
								setState(1259);
								((CompanyAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(1263);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
							case 1:
								{
								setState(1262);
								((CompanyAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(1266);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
							case 1:
								{
								setState(1265);
								((CompanyAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(1269);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
							case 1:
								{
								setState(1268);
								((CompanyAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(1272);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
							case 1:
								{
								setState(1271);
								((CompanyAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(1277);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(1274);
								((CompanyAllPriceContext)_localctx).symbol7 = word();
								}
								}
								setState(1279);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1280);
							match(NEWLINE);
							setState(1281);
							match(WORD);
							setState(1282);
							match(TAB);
							setState(1283);
							match(DATE);
							setState(1284);
							match(TAB);
							setState(1285);
							((CompanyAllPriceContext)_localctx).type = word();
							setState(1289);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(1286);
								word();
								}
								}
								setState(1291);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
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
							setState(1298);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==WORD) {
								{
								setState(1297);
								match(WORD);
								}
							}

							setState(1300);
							match(NEWLINE);
							setState(1301);
							match(WORD);
							setState(1302);
							match(TAB);
							setState(1303);
							match(DATE);
							setState(1304);
							match(TAB);
							setState(1305);
							((CompanyAllPriceContext)_localctx).closing = match(NUMBER);
							setState(1306);
							match(NEWLINE);
							setState(1307);
							match(WORD);
							setState(1308);
							match(TAB);
							setState(1309);
							match(DATE);
							setState(1310);
							match(TAB);
							setState(1311);
							match(NUMBER);
							setState(1312);
							match(NEWLINE);
							setState(1313);
							match(WORD);
							setState(1314);
							match(TAB);
							setState(1315);
							match(DATE);
							setState(1316);
							match(TAB);
							setState(1317);
							match(NUMBER);
							setState(1318);
							match(NEWLINE);
							setState(1319);
							match(WORD);
							setState(1320);
							match(TAB);
							setState(1321);
							match(DATE);
							setState(1322);
							match(TAB);
							setState(1323);
							((CompanyAllPriceContext)_localctx).market = match(NUMBER);
							setState(1324);
							match(NEWLINE);
							setState(1325);
							match(WORD);
							setState(1326);
							match(TAB);
							setState(1327);
							match(DATE);
							setState(1328);
							match(TAB);
							setState(1329);
							((CompanyAllPriceContext)_localctx).high = match(NUMBER);
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
							((CompanyAllPriceContext)_localctx).low = match(NUMBER);
							setState(1336);
							match(NEWLINE);
							setState(1337);
							match(WORD);
							setState(1338);
							match(TAB);
							setState(1339);
							match(DATE);
							setState(1340);
							match(TAB);
							setState(1341);
							((CompanyAllPriceContext)_localctx).volume = match(NUMBER);
							setState(1342);
							match(NEWLINE);
							setState(1343);
							match(WORD);
							setState(1344);
							match(TAB);
							setState(1345);
							match(DATE);
							setState(1346);
							match(TAB);
							setState(1347);
							match(NUMBER);
							setState(1348);
							match(NEWLINE);
							setState(1349);
							match(WORD);
							setState(1350);
							match(TAB);
							setState(1351);
							match(DATE);
							setState(1352);
							match(TAB);
							setState(1353);
							match(NUMBER);
							setState(1354);
							match(NEWLINE);
							setState(1355);
							match(WORD);
							setState(1356);
							match(TAB);
							setState(1357);
							match(DATE);
							setState(1358);
							match(TAB);
							setState(1359);
							((CompanyAllPriceContext)_localctx).volumeOfListedShares = match(NUMBER);
							setState(1360);
							match(NEWLINE);
							setState(1361);
							match(WORD);
							setState(1362);
							match(TAB);
							setState(1363);
							((CompanyAllPriceContext)_localctx).base = match(DATE);
							setState(1364);
							match(TAB);
							setState(1365);
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
							setState(1368);
							match(WORD);
							setState(1369);
							match(TAB);
							setState(1370);
							match(DATE);
							setState(1371);
							match(TAB);
							setState(1372);
							word();
							setState(1373);
							((CompanyAllPriceContext)_localctx).symbol = word();
							setState(1375);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
							case 1:
								{
								setState(1374);
								((CompanyAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(1378);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
							case 1:
								{
								setState(1377);
								((CompanyAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(1381);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
							case 1:
								{
								setState(1380);
								((CompanyAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(1384);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
							case 1:
								{
								setState(1383);
								((CompanyAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(1387);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
							case 1:
								{
								setState(1386);
								((CompanyAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(1390);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
							case 1:
								{
								setState(1389);
								((CompanyAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(1395);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1392);
									((CompanyAllPriceContext)_localctx).symbol7 = word();
									}
									} 
								}
								setState(1397);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
							}
							setState(1398);
							((CompanyAllPriceContext)_localctx).closing = match(NUMBER);
							setState(1399);
							match(NEWLINE);
							setState(1400);
							match(WORD);
							setState(1401);
							match(TAB);
							setState(1402);
							((CompanyAllPriceContext)_localctx).base = match(DATE);
							setState(1403);
							match(TAB);
							setState(1404);
							match(NUMBER);
							setState(1405);
							match(NUMBER);
							setState(1406);
							match(NUMBER);
							setState(1407);
							match(NUMBER);
							setState(1408);
							match(NUMBER);
							setState(1409);
							match(NUMBER);
							setState(1410);
							match(NUMBER);
							setState(1411);
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
					setState(1416); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1418);
				match(WORD);
				setState(1419);
				match(TAB);
				setState(1420);
				match(WORD);
				setState(1421);
				match(TAB);
				setState(1422);
				match(DATE);
				setState(1423);
				match(NEWLINE);
				}
				}
				setState(1427); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1429);
			match(KEYWORD);
			setState(1430);
			match(TAB);
			setState(1431);
			match(WORD);
			setState(1432);
			match(TAB);
			setState(1433);
			match(WORD);
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
			match(TAB);
			setState(1440);
			match(WORD);
			setState(1441);
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
		enterRule(_localctx, 10, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
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
		enterRule(_localctx, 12, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1447);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(1445);
					word();
					}
					break;
				case TAB:
					{
					setState(1446);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1449); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(1451);
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
		enterRule(_localctx, 14, RULE_eof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1456);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(1453);
					word();
					}
					break;
				case TAB:
					{
					setState(1454);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(1455);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1458); 
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
		"\u0004\u0001\n\u05b5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0015\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001)\b\u0001\u000b\u0001\f\u0001*\u0001\u0001\u0001\u0001\u0001\u0001"+
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
		"\u0001\u0001\u0004\u0001\u00fd\b\u0001\u000b\u0001\f\u0001\u00fe\u0004"+
		"\u0001\u0101\b\u0001\u000b\u0001\f\u0001\u0102\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"\u010c\b\u0001\u000b\u0001\f\u0001\u010d\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u0136\b\u0002\u0001\u0002\u0003\u0002\u0139\b\u0002\u0001\u0002"+
		"\u0003\u0002\u013c\b\u0002\u0001\u0002\u0003\u0002\u013f\b\u0002\u0001"+
		"\u0002\u0003\u0002\u0142\b\u0002\u0001\u0002\u0003\u0002\u0145\b\u0002"+
		"\u0001\u0002\u0005\u0002\u0148\b\u0002\n\u0002\f\u0002\u014b\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0004\u0002\u014f\b\u0002\u000b\u0002\f\u0002\u0150"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u017f\b\u0002\u0001\u0002\u0003\u0002"+
		"\u0182\b\u0002\u0001\u0002\u0003\u0002\u0185\b\u0002\u0001\u0002\u0003"+
		"\u0002\u0188\b\u0002\u0001\u0002\u0003\u0002\u018b\b\u0002\u0001\u0002"+
		"\u0003\u0002\u018e\b\u0002\u0001\u0002\u0005\u0002\u0191\b\u0002\n\u0002"+
		"\f\u0002\u0194\t\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u0198\b\u0002"+
		"\u000b\u0002\f\u0002\u0199\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0004\u0002\u01a1\b\u0002\u000b\u0002\f\u0002\u01a2\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u01ab\b\u0002\u0001\u0002\u0005\u0002\u01ae\b\u0002\n\u0002\f\u0002"+
		"\u01b1\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u01df\b\u0003\u000b\u0003"+
		"\f\u0003\u01e0\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
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
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003"+
		"\u031f\b\u0003\u000b\u0003\f\u0003\u0320\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u032a"+
		"\b\u0003\u0001\u0003\u0003\u0003\u032d\b\u0003\u0001\u0003\u0003\u0003"+
		"\u0330\b\u0003\u0001\u0003\u0003\u0003\u0333\b\u0003\u0001\u0003\u0003"+
		"\u0003\u0336\b\u0003\u0001\u0003\u0003\u0003\u0339\b\u0003\u0001\u0003"+
		"\u0005\u0003\u033c\b\u0003\n\u0003\f\u0003\u033f\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u0347"+
		"\b\u0003\u000b\u0003\f\u0003\u0348\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u0362\b\u0003\n\u0003\f\u0003\u0365"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u036f\b\u0003\n\u0003\f\u0003"+
		"\u0372\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0004\u0003\u0386\b\u0003\u000b\u0003\f\u0003\u0387\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0004\u0003\u0391\b\u0003\u000b\u0003\f\u0003\u0392\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
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
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u04ea\b\u0004"+
		"\u0001\u0004\u0003\u0004\u04ed\b\u0004\u0001\u0004\u0003\u0004\u04f0\b"+
		"\u0004\u0001\u0004\u0003\u0004\u04f3\b\u0004\u0001\u0004\u0003\u0004\u04f6"+
		"\b\u0004\u0001\u0004\u0003\u0004\u04f9\b\u0004\u0001\u0004\u0005\u0004"+
		"\u04fc\b\u0004\n\u0004\f\u0004\u04ff\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0508"+
		"\b\u0004\n\u0004\f\u0004\u050b\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0513\b\u0004\u0001\u0004"+
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
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0560\b\u0004\u0001\u0004\u0003\u0004"+
		"\u0563\b\u0004\u0001\u0004\u0003\u0004\u0566\b\u0004\u0001\u0004\u0003"+
		"\u0004\u0569\b\u0004\u0001\u0004\u0003\u0004\u056c\b\u0004\u0001\u0004"+
		"\u0003\u0004\u056f\b\u0004\u0001\u0004\u0005\u0004\u0572\b\u0004\n\u0004"+
		"\f\u0004\u0575\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0004\u0004\u0587\b\u0004\u000b\u0004\f\u0004\u0588\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004"+
		"\u0004\u0592\b\u0004\u000b\u0004\f\u0004\u0593\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0004\u0006\u05a8\b\u0006"+
		"\u000b\u0006\f\u0006\u05a9\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0004\u0007\u05b1\b\u0007\u000b\u0007\f\u0007\u05b2\u0001"+
		"\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0001\u0001"+
		"\u0000\u0005\n\u05ec\u0000\u0014\u0001\u0000\u0000\u0000\u0002\u0016\u0001"+
		"\u0000\u0000\u0000\u0004\u011e\u0001\u0000\u0000\u0000\u0006\u01ce\u0001"+
		"\u0000\u0000\u0000\b\u03a2\u0001\u0000\u0000\u0000\n\u05a3\u0001\u0000"+
		"\u0000\u0000\f\u05a7\u0001\u0000\u0000\u0000\u000e\u05b0\u0001\u0000\u0000"+
		"\u0000\u0010\u0015\u0003\b\u0004\u0000\u0011\u0015\u0003\u0006\u0003\u0000"+
		"\u0012\u0015\u0003\u0004\u0002\u0000\u0013\u0015\u0003\u0002\u0001\u0000"+
		"\u0014\u0010\u0001\u0000\u0000\u0000\u0014\u0011\u0001\u0000\u0000\u0000"+
		"\u0014\u0012\u0001\u0000\u0000\u0000\u0014\u0013\u0001\u0000\u0000\u0000"+
		"\u0015\u0001\u0001\u0000\u0000\u0000\u0016\u0017\u0005\u0005\u0000\u0000"+
		"\u0017\u0018\u0005\u0003\u0000\u0000\u0018\u0019\u0005\n\u0000\u0000\u0019"+
		"\u001a\u0005\u0003\u0000\u0000\u001a\u001b\u0005\n\u0000\u0000\u001b\u001c"+
		"\u0005\n\u0000\u0000\u001c\u001d\u0005\n\u0000\u0000\u001d\u001e\u0005"+
		"\n\u0000\u0000\u001e\u001f\u0005\n\u0000\u0000\u001f \u0005\n\u0000\u0000"+
		" !\u0005\n\u0000\u0000!\"\u0005\u0003\u0000\u0000\"#\u0005\n\u0000\u0000"+
		"#\u010b\u0005\u0004\u0000\u0000$%\u0003\n\u0005\u0000%&\u0005\u0003\u0000"+
		"\u0000&\'\u0005\u0004\u0000\u0000\')\u0001\u0000\u0000\u0000($\u0001\u0000"+
		"\u0000\u0000)*\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0003\n\u0005\u0000-.\u0005"+
		"\u0003\u0000\u0000./\u0005\u0003\u0000\u0000/0\u0005\u0003\u0000\u0000"+
		"01\u0005\u0003\u0000\u000012\u0005\u0003\u0000\u000023\u0005\u0004\u0000"+
		"\u000034\u0003\n\u0005\u000045\u0005\u0003\u0000\u000056\u0005\u0003\u0000"+
		"\u000067\u0005\u0003\u0000\u000078\u0005\u0004\u0000\u000089\u0003\n\u0005"+
		"\u00009:\u0005\u0003\u0000\u0000:;\u0005\u0003\u0000\u0000;<\u0005\u0003"+
		"\u0000\u0000<=\u0005\u0003\u0000\u0000=>\u0005\u0003\u0000\u0000>?\u0005"+
		"\u0004\u0000\u0000?@\u0003\n\u0005\u0000@A\u0005\u0003\u0000\u0000AB\u0005"+
		"\u0003\u0000\u0000BC\u0005\u0003\u0000\u0000CD\u0005\u0003\u0000\u0000"+
		"DE\u0005\u0003\u0000\u0000EF\u0005\u0004\u0000\u0000FG\u0003\n\u0005\u0000"+
		"GH\u0005\u0003\u0000\u0000HI\u0005\u0003\u0000\u0000IJ\u0005\u0003\u0000"+
		"\u0000JK\u0005\u0003\u0000\u0000KL\u0005\u0004\u0000\u0000LM\u0003\n\u0005"+
		"\u0000MN\u0005\u0003\u0000\u0000NO\u0005\u0004\u0000\u0000OP\u0003\n\u0005"+
		"\u0000PQ\u0005\u0003\u0000\u0000QR\u0005\u0003\u0000\u0000RS\u0005\u0003"+
		"\u0000\u0000ST\u0005\u0003\u0000\u0000TU\u0005\u0003\u0000\u0000UV\u0005"+
		"\u0004\u0000\u0000VW\u0003\n\u0005\u0000WX\u0005\u0003\u0000\u0000XY\u0005"+
		"\u0003\u0000\u0000YZ\u0005\u0003\u0000\u0000Z[\u0005\u0004\u0000\u0000"+
		"[\\\u0003\n\u0005\u0000\\]\u0005\u0003\u0000\u0000]^\u0005\u0003\u0000"+
		"\u0000^_\u0005\u0003\u0000\u0000_`\u0005\u0003\u0000\u0000`a\u0005\u0003"+
		"\u0000\u0000ab\u0005\u0004\u0000\u0000bc\u0003\n\u0005\u0000cd\u0005\u0003"+
		"\u0000\u0000de\u0005\u0003\u0000\u0000ef\u0005\u0003\u0000\u0000fg\u0005"+
		"\u0003\u0000\u0000gh\u0005\u0003\u0000\u0000hi\u0005\u0004\u0000\u0000"+
		"ij\u0003\n\u0005\u0000jk\u0005\u0003\u0000\u0000kl\u0005\u0003\u0000\u0000"+
		"lm\u0005\u0003\u0000\u0000mn\u0005\u0003\u0000\u0000no\u0005\u0004\u0000"+
		"\u0000op\u0003\n\u0005\u0000pq\u0005\u0003\u0000\u0000qr\u0005\u0004\u0000"+
		"\u0000rs\u0003\n\u0005\u0000st\u0005\u0003\u0000\u0000tu\u0005\u0004\u0000"+
		"\u0000uv\u0003\n\u0005\u0000vw\u0005\u0003\u0000\u0000wx\u0005\u0004\u0000"+
		"\u0000xy\u0003\n\u0005\u0000yz\u0005\u0003\u0000\u0000z{\u0005\u0004\u0000"+
		"\u0000{|\u0003\n\u0005\u0000|}\u0005\u0003\u0000\u0000}~\u0005\u0003\u0000"+
		"\u0000~\u007f\u0005\u0003\u0000\u0000\u007f\u0080\u0005\u0003\u0000\u0000"+
		"\u0080\u0081\u0005\u0003\u0000\u0000\u0081\u0082\u0005\u0004\u0000\u0000"+
		"\u0082\u0083\u0003\n\u0005\u0000\u0083\u0084\u0005\u0003\u0000\u0000\u0084"+
		"\u0085\u0005\u0003\u0000\u0000\u0085\u0086\u0005\u0003\u0000\u0000\u0086"+
		"\u0087\u0005\u0004\u0000\u0000\u0087\u0088\u0003\n\u0005\u0000\u0088\u0089"+
		"\u0005\u0003\u0000\u0000\u0089\u008a\u0005\u0003\u0000\u0000\u008a\u008b"+
		"\u0005\u0003\u0000\u0000\u008b\u008c\u0005\u0003\u0000\u0000\u008c\u008d"+
		"\u0005\u0003\u0000\u0000\u008d\u008e\u0005\u0004\u0000\u0000\u008e\u008f"+
		"\u0003\n\u0005\u0000\u008f\u0090\u0005\u0003\u0000\u0000\u0090\u0091\u0005"+
		"\u0003\u0000\u0000\u0091\u0092\u0005\u0003\u0000\u0000\u0092\u0093\u0005"+
		"\u0003\u0000\u0000\u0093\u0094\u0005\u0003\u0000\u0000\u0094\u0095\u0005"+
		"\u0004\u0000\u0000\u0095\u0096\u0003\n\u0005\u0000\u0096\u0097\u0005\u0003"+
		"\u0000\u0000\u0097\u0098\u0005\u0003\u0000\u0000\u0098\u0099\u0005\u0003"+
		"\u0000\u0000\u0099\u009a\u0005\u0003\u0000\u0000\u009a\u009b\u0005\u0004"+
		"\u0000\u0000\u009b\u009c\u0003\n\u0005\u0000\u009c\u009d\u0005\u0003\u0000"+
		"\u0000\u009d\u009e\u0005\u0004\u0000\u0000\u009e\u009f\u0003\n\u0005\u0000"+
		"\u009f\u00a0\u0005\u0003\u0000\u0000\u00a0\u00a1\u0005\u0004\u0000\u0000"+
		"\u00a1\u00a2\u0003\n\u0005\u0000\u00a2\u00a3\u0005\u0003\u0000\u0000\u00a3"+
		"\u00a4\u0005\u0004\u0000\u0000\u00a4\u00a5\u0003\n\u0005\u0000\u00a5\u00a6"+
		"\u0005\u0003\u0000\u0000\u00a6\u00a7\u0005\u0003\u0000\u0000\u00a7\u00a8"+
		"\u0005\u0003\u0000\u0000\u00a8\u00a9\u0005\u0003\u0000\u0000\u00a9\u00aa"+
		"\u0005\u0003\u0000\u0000\u00aa\u00ab\u0005\u0004\u0000\u0000\u00ab\u00ac"+
		"\u0003\n\u0005\u0000\u00ac\u00ad\u0005\u0003\u0000\u0000\u00ad\u00ae\u0005"+
		"\u0003\u0000\u0000\u00ae\u00af\u0005\u0003\u0000\u0000\u00af\u00b0\u0005"+
		"\u0004\u0000\u0000\u00b0\u00b1\u0003\n\u0005\u0000\u00b1\u00b2\u0005\u0003"+
		"\u0000\u0000\u00b2\u00b3\u0005\u0003\u0000\u0000\u00b3\u00b4\u0005\u0003"+
		"\u0000\u0000\u00b4\u00b5\u0005\u0003\u0000\u0000\u00b5\u00b6\u0005\u0003"+
		"\u0000\u0000\u00b6\u00b7\u0005\u0004\u0000\u0000\u00b7\u00b8\u0003\n\u0005"+
		"\u0000\u00b8\u00b9\u0005\u0003\u0000\u0000\u00b9\u00ba\u0005\u0003\u0000"+
		"\u0000\u00ba\u00bb\u0005\u0003\u0000\u0000\u00bb\u00bc\u0005\u0003\u0000"+
		"\u0000\u00bc\u00bd\u0005\u0003\u0000\u0000\u00bd\u00be\u0005\u0004\u0000"+
		"\u0000\u00be\u00bf\u0003\n\u0005\u0000\u00bf\u00c0\u0005\u0003\u0000\u0000"+
		"\u00c0\u00c1\u0005\u0003\u0000\u0000\u00c1\u00c2\u0005\u0003\u0000\u0000"+
		"\u00c2\u00c3\u0005\u0003\u0000\u0000\u00c3\u00c4\u0005\u0004\u0000\u0000"+
		"\u00c4\u00c5\u0003\n\u0005\u0000\u00c5\u00c6\u0005\u0003\u0000\u0000\u00c6"+
		"\u00c7\u0005\n\u0000\u0000\u00c7\u00c8\u0005\u0004\u0000\u0000\u00c8\u00c9"+
		"\u0003\n\u0005\u0000\u00c9\u00ca\u0005\u0003\u0000\u0000\u00ca\u00fc\u0005"+
		"\u0004\u0000\u0000\u00cb\u00cc\u0003\n\u0005\u0000\u00cc\u00cd\u0005\u0003"+
		"\u0000\u0000\u00cd\u00ce\u0005\u0006\u0000\u0000\u00ce\u00cf\u0005\u0004"+
		"\u0000\u0000\u00cf\u00d0\u0003\n\u0005\u0000\u00d0\u00d1\u0005\u0003\u0000"+
		"\u0000\u00d1\u00d2\u0005\b\u0000\u0000\u00d2\u00d3\u0005\u0004\u0000\u0000"+
		"\u00d3\u00d4\u0003\n\u0005\u0000\u00d4\u00d5\u0005\u0003\u0000\u0000\u00d5"+
		"\u00d6\u0005\b\u0000\u0000\u00d6\u00d7\u0005\u0004\u0000\u0000\u00d7\u00d8"+
		"\u0003\n\u0005\u0000\u00d8\u00d9\u0005\u0003\u0000\u0000\u00d9\u00da\u0005"+
		"\b\u0000\u0000\u00da\u00db\u0005\u0004\u0000\u0000\u00db\u00dc\u0003\n"+
		"\u0005\u0000\u00dc\u00dd\u0005\u0003\u0000\u0000\u00dd\u00de\u0005\b\u0000"+
		"\u0000\u00de\u00df\u0005\u0004\u0000\u0000\u00df\u00e0\u0003\n\u0005\u0000"+
		"\u00e0\u00e1\u0005\u0003\u0000\u0000\u00e1\u00e2\u0005\b\u0000\u0000\u00e2"+
		"\u00e3\u0005\u0004\u0000\u0000\u00e3\u00e4\u0003\n\u0005\u0000\u00e4\u00e5"+
		"\u0005\u0003\u0000\u0000\u00e5\u00e6\u0005\b\u0000\u0000\u00e6\u00e7\u0005"+
		"\u0004\u0000\u0000\u00e7\u00e8\u0003\n\u0005\u0000\u00e8\u00e9\u0005\u0003"+
		"\u0000\u0000\u00e9\u00ea\u0005\b\u0000\u0000\u00ea\u00eb\u0005\u0004\u0000"+
		"\u0000\u00eb\u00ec\u0003\n\u0005\u0000\u00ec\u00ed\u0005\u0003\u0000\u0000"+
		"\u00ed\u00ee\u0005\b\u0000\u0000\u00ee\u00ef\u0005\u0004\u0000\u0000\u00ef"+
		"\u00f0\u0003\n\u0005\u0000\u00f0\u00f1\u0005\u0003\u0000\u0000\u00f1\u00f2"+
		"\u0005\b\u0000\u0000\u00f2\u00f3\u0005\u0004\u0000\u0000\u00f3\u00f4\u0003"+
		"\n\u0005\u0000\u00f4\u00f5\u0005\u0003\u0000\u0000\u00f5\u00f6\u0005\b"+
		"\u0000\u0000\u00f6\u00f7\u0005\u0004\u0000\u0000\u00f7\u00f8\u0003\n\u0005"+
		"\u0000\u00f8\u00f9\u0005\u0003\u0000\u0000\u00f9\u00fa\u0005\u0004\u0000"+
		"\u0000\u00fa\u00fb\u0006\u0001\uffff\uffff\u0000\u00fb\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fc\u00cb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000"+
		"\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100(\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0005\n\u0000\u0000\u0105\u0106\u0005\u0003\u0000\u0000"+
		"\u0106\u0107\u0005\n\u0000\u0000\u0107\u0108\u0005\u0003\u0000\u0000\u0108"+
		"\u0109\u0005\u0006\u0000\u0000\u0109\u010a\u0005\u0004\u0000\u0000\u010a"+
		"\u010c\u0001\u0000\u0000\u0000\u010b\u0100\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0005\u0005\u0000\u0000\u0110\u0111\u0005\u0003\u0000\u0000\u0111"+
		"\u0112\u0005\n\u0000\u0000\u0112\u0113\u0005\u0003\u0000\u0000\u0113\u0114"+
		"\u0005\n\u0000\u0000\u0114\u0115\u0005\n\u0000\u0000\u0115\u0116\u0005"+
		"\n\u0000\u0000\u0116\u0117\u0005\n\u0000\u0000\u0117\u0118\u0005\n\u0000"+
		"\u0000\u0118\u0119\u0005\n\u0000\u0000\u0119\u011a\u0005\n\u0000\u0000"+
		"\u011a\u011b\u0005\u0003\u0000\u0000\u011b\u011c\u0005\n\u0000\u0000\u011c"+
		"\u011d\u0005\u0004\u0000\u0000\u011d\u0003\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0005\u0005\u0000\u0000\u011f\u0120\u0005\u0003\u0000\u0000\u0120"+
		"\u0121\u0005\n\u0000\u0000\u0121\u0122\u0005\u0003\u0000\u0000\u0122\u0123"+
		"\u0005\n\u0000\u0000\u0123\u0124\u0005\n\u0000\u0000\u0124\u0125\u0005"+
		"\n\u0000\u0000\u0125\u0126\u0005\n\u0000\u0000\u0126\u0127\u0005\n\u0000"+
		"\u0000\u0127\u0128\u0005\n\u0000\u0000\u0128\u0129\u0005\u0003\u0000\u0000"+
		"\u0129\u012a\u0005\n\u0000\u0000\u012a\u012b\u0005\u0004\u0000\u0000\u012b"+
		"\u012c\u0005\u0005\u0000\u0000\u012c\u012d\u0005\u0003\u0000\u0000\u012d"+
		"\u012e\u0005\n\u0000\u0000\u012e\u012f\u0005\u0004\u0000\u0000\u012f\u0130"+
		"\u0005\n\u0000\u0000\u0130\u0131\u0005\u0003\u0000\u0000\u0131\u0132\u0005"+
		"\n\u0000\u0000\u0132\u0133\u0005\u0003\u0000\u0000\u0133\u0135\u0003\n"+
		"\u0005\u0000\u0134\u0136\u0003\n\u0005\u0000\u0135\u0134\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0138\u0001\u0000\u0000"+
		"\u0000\u0137\u0139\u0003\n\u0005\u0000\u0138\u0137\u0001\u0000\u0000\u0000"+
		"\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013b\u0001\u0000\u0000\u0000"+
		"\u013a\u013c\u0003\n\u0005\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0001\u0000\u0000\u0000\u013c\u013e\u0001\u0000\u0000\u0000\u013d"+
		"\u013f\u0003\n\u0005\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013e\u013f"+
		"\u0001\u0000\u0000\u0000\u013f\u0141\u0001\u0000\u0000\u0000\u0140\u0142"+
		"\u0003\n\u0005\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0141\u0142\u0001"+
		"\u0000\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0145\u0003"+
		"\n\u0005\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000"+
		"\u0000\u0000\u0145\u0149\u0001\u0000\u0000\u0000\u0146\u0148\u0003\n\u0005"+
		"\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000\u0000"+
		"\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000"+
		"\u0000\u014a\u014c\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000"+
		"\u0000\u014c\u014e\u0005\u0003\u0000\u0000\u014d\u014f\u0003\n\u0005\u0000"+
		"\u014e\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000"+
		"\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0153\u0005\u0003\u0000\u0000"+
		"\u0153\u0154\u0005\u0004\u0000\u0000\u0154\u0155\u0005\n\u0000\u0000\u0155"+
		"\u0156\u0005\u0003\u0000\u0000\u0156\u0157\u0005\n\u0000\u0000\u0157\u0158"+
		"\u0005\u0003\u0000\u0000\u0158\u0159\u0005\n\u0000\u0000\u0159\u015a\u0005"+
		"\u0003\u0000\u0000\u015a\u015b\u0003\n\u0005\u0000\u015b\u015c\u0005\u0003"+
		"\u0000\u0000\u015c\u015d\u0005\u0004\u0000\u0000\u015d\u015e\u0005\n\u0000"+
		"\u0000\u015e\u015f\u0005\u0003\u0000\u0000\u015f\u0160\u0005\n\u0000\u0000"+
		"\u0160\u0161\u0005\u0003\u0000\u0000\u0161\u0162\u0003\n\u0005\u0000\u0162"+
		"\u0163\u0005\u0003\u0000\u0000\u0163\u0164\u0005\b\u0000\u0000\u0164\u0165"+
		"\u0005\u0003\u0000\u0000\u0165\u0166\u0005\u0004\u0000\u0000\u0166\u0167"+
		"\u0005\n\u0000\u0000\u0167\u0168\u0005\u0003\u0000\u0000\u0168\u0169\u0005"+
		"\n\u0000\u0000\u0169\u016a\u0005\u0003\u0000\u0000\u016a\u016b\u0005\b"+
		"\u0000\u0000\u016b\u016c\u0005\u0003\u0000\u0000\u016c\u016d\u0005\n\u0000"+
		"\u0000\u016d\u016e\u0005\u0003\u0000\u0000\u016e\u016f\u0005\u0004\u0000"+
		"\u0000\u016f\u0170\u0005\n\u0000\u0000\u0170\u0171\u0005\u0003\u0000\u0000"+
		"\u0171\u0172\u0005\n\u0000\u0000\u0172\u0173\u0005\u0003\u0000\u0000\u0173"+
		"\u0174\u0005\u0006\u0000\u0000\u0174\u0175\u0005\u0003\u0000\u0000\u0175"+
		"\u0176\u0005\u0006\u0000\u0000\u0176\u0177\u0005\u0003\u0000\u0000\u0177"+
		"\u0178\u0005\u0004\u0000\u0000\u0178\u0179\u0005\n\u0000\u0000\u0179\u017a"+
		"\u0005\u0003\u0000\u0000\u017a\u017b\u0005\n\u0000\u0000\u017b\u017c\u0005"+
		"\u0003\u0000\u0000\u017c\u017e\u0003\n\u0005\u0000\u017d\u017f\u0003\n"+
		"\u0005\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000"+
		"\u0000\u0000\u017f\u0181\u0001\u0000\u0000\u0000\u0180\u0182\u0003\n\u0005"+
		"\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000"+
		"\u0000\u0182\u0184\u0001\u0000\u0000\u0000\u0183\u0185\u0003\n\u0005\u0000"+
		"\u0184\u0183\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000"+
		"\u0185\u0187\u0001\u0000\u0000\u0000\u0186\u0188\u0003\n\u0005\u0000\u0187"+
		"\u0186\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188"+
		"\u018a\u0001\u0000\u0000\u0000\u0189\u018b\u0003\n\u0005\u0000\u018a\u0189"+
		"\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018d"+
		"\u0001\u0000\u0000\u0000\u018c\u018e\u0003\n\u0005\u0000\u018d\u018c\u0001"+
		"\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u0192\u0001"+
		"\u0000\u0000\u0000\u018f\u0191\u0003\n\u0005\u0000\u0190\u018f\u0001\u0000"+
		"\u0000\u0000\u0191\u0194\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000"+
		"\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0195\u0001\u0000"+
		"\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195\u0197\u0005\u0003"+
		"\u0000\u0000\u0196\u0198\u0003\n\u0005\u0000\u0197\u0196\u0001\u0000\u0000"+
		"\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000"+
		"\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0005\u0003\u0000\u0000\u019c\u019d\u0005\u0004\u0000"+
		"\u0000\u019d\u019e\u0005\n\u0000\u0000\u019e\u01a0\u0005\u0003\u0000\u0000"+
		"\u019f\u01a1\u0003\n\u0005\u0000\u01a0\u019f\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a5\u0005\u0003\u0000\u0000\u01a5\u01a6\u0005\u0004\u0000\u0000\u01a6"+
		"\u01a7\u0005\n\u0000\u0000\u01a7\u01aa\u0005\u0003\u0000\u0000\u01a8\u01a9"+
		"\u0005\b\u0000\u0000\u01a9\u01ab\u0005\u0003\u0000\u0000\u01aa\u01a8\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01af\u0001"+
		"\u0000\u0000\u0000\u01ac\u01ae\u0003\n\u0005\u0000\u01ad\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ae\u01b1\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000"+
		"\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005\u0003"+
		"\u0000\u0000\u01b3\u01b4\u0005\u0004\u0000\u0000\u01b4\u01b5\u0005\n\u0000"+
		"\u0000\u01b5\u01b6\u0005\u0003\u0000\u0000\u01b6\u01b7\u0005\n\u0000\u0000"+
		"\u01b7\u01b8\u0005\u0003\u0000\u0000\u01b8\u01b9\u0005\u0004\u0000\u0000"+
		"\u01b9\u01ba\u0005\n\u0000\u0000\u01ba\u01bb\u0005\u0003\u0000\u0000\u01bb"+
		"\u01bc\u0005\n\u0000\u0000\u01bc\u01bd\u0005\u0003\u0000\u0000\u01bd\u01be"+
		"\u0005\u0006\u0000\u0000\u01be\u01bf\u0005\u0004\u0000\u0000\u01bf\u01c0"+
		"\u0005\u0005\u0000\u0000\u01c0\u01c1\u0005\u0003\u0000\u0000\u01c1\u01c2"+
		"\u0005\n\u0000\u0000\u01c2\u01c3\u0005\u0003\u0000\u0000\u01c3\u01c4\u0005"+
		"\n\u0000\u0000\u01c4\u01c5\u0005\n\u0000\u0000\u01c5\u01c6\u0005\n\u0000"+
		"\u0000\u01c6\u01c7\u0005\n\u0000\u0000\u01c7\u01c8\u0005\n\u0000\u0000"+
		"\u01c8\u01c9\u0005\n\u0000\u0000\u01c9\u01ca\u0005\u0003\u0000\u0000\u01ca"+
		"\u01cb\u0005\n\u0000\u0000\u01cb\u01cc\u0005\u0004\u0000\u0000\u01cc\u01cd"+
		"\u0006\u0002\uffff\uffff\u0000\u01cd\u0005\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cf\u0005\u0005\u0000\u0000\u01cf\u01d0\u0005\u0003\u0000\u0000\u01d0"+
		"\u01d1\u0005\n\u0000\u0000\u01d1\u01d2\u0005\u0003\u0000\u0000\u01d2\u01d3"+
		"\u0005\n\u0000\u0000\u01d3\u01d4\u0005\n\u0000\u0000\u01d4\u01d5\u0005"+
		"\n\u0000\u0000\u01d5\u01d6\u0005\n\u0000\u0000\u01d6\u01d7\u0005\n\u0000"+
		"\u0000\u01d7\u01d8\u0005\n\u0000\u0000\u01d8\u01d9\u0005\u0003\u0000\u0000"+
		"\u01d9\u01da\u0005\n\u0000\u0000\u01da\u0390\u0005\u0004\u0000\u0000\u01db"+
		"\u01dc\u0005\u0005\u0000\u0000\u01dc\u01dd\u0005\u0003\u0000\u0000\u01dd"+
		"\u01df\u0005\u0004\u0000\u0000\u01de\u01db\u0001\u0000\u0000\u0000\u01df"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e3\u0005\u0005\u0000\u0000\u01e3\u01e4\u0005\u0003\u0000\u0000\u01e4"+
		"\u01e5\u0005\u0003\u0000\u0000\u01e5\u01e6\u0005\u0003\u0000\u0000\u01e6"+
		"\u01e7\u0005\u0003\u0000\u0000\u01e7\u01e8\u0005\u0003\u0000\u0000\u01e8"+
		"\u01e9\u0005\u0004\u0000\u0000\u01e9\u01ea\u0005\u0005\u0000\u0000\u01ea"+
		"\u01eb\u0005\u0003\u0000\u0000\u01eb\u01ec\u0005\u0003\u0000\u0000\u01ec"+
		"\u01ed\u0005\u0003\u0000\u0000\u01ed\u01ee\u0005\u0004\u0000\u0000\u01ee"+
		"\u01ef\u0005\u0005\u0000\u0000\u01ef\u01f0\u0005\u0003\u0000\u0000\u01f0"+
		"\u01f1\u0005\u0003\u0000\u0000\u01f1\u01f2\u0005\u0003\u0000\u0000\u01f2"+
		"\u01f3\u0005\u0003\u0000\u0000\u01f3\u01f4\u0005\u0003\u0000\u0000\u01f4"+
		"\u01f5\u0005\u0004\u0000\u0000\u01f5\u01f6\u0005\u0005\u0000\u0000\u01f6"+
		"\u01f7\u0005\u0003\u0000\u0000\u01f7\u01f8\u0005\u0003\u0000\u0000\u01f8"+
		"\u01f9\u0005\u0003\u0000\u0000\u01f9\u01fa\u0005\u0003\u0000\u0000\u01fa"+
		"\u01fb\u0005\u0003\u0000\u0000\u01fb\u01fc\u0005\u0004\u0000\u0000\u01fc"+
		"\u01fd\u0005\u0005\u0000\u0000\u01fd\u01fe\u0005\u0003\u0000\u0000\u01fe"+
		"\u01ff\u0005\u0003\u0000\u0000\u01ff\u0200\u0005\u0003\u0000\u0000\u0200"+
		"\u0201\u0005\u0003\u0000\u0000\u0201\u0202\u0005\u0004\u0000\u0000\u0202"+
		"\u0203\u0005\u0005\u0000\u0000\u0203\u0204\u0005\u0003\u0000\u0000\u0204"+
		"\u0205\u0005\u0004\u0000\u0000\u0205\u0206\u0005\u0005\u0000\u0000\u0206"+
		"\u0207\u0005\u0003\u0000\u0000\u0207\u0208\u0005\u0003\u0000\u0000\u0208"+
		"\u0209\u0005\u0003\u0000\u0000\u0209\u020a\u0005\u0003\u0000\u0000\u020a"+
		"\u020b\u0005\u0003\u0000\u0000\u020b\u020c\u0005\u0004\u0000\u0000\u020c"+
		"\u020d\u0005\u0005\u0000\u0000\u020d\u020e\u0005\u0003\u0000\u0000\u020e"+
		"\u020f\u0005\u0003\u0000\u0000\u020f\u0210\u0005\u0003\u0000\u0000\u0210"+
		"\u0211\u0005\u0003\u0000\u0000\u0211\u0212\u0005\u0004\u0000\u0000\u0212"+
		"\u0213\u0005\u0005\u0000\u0000\u0213\u0214\u0005\u0003\u0000\u0000\u0214"+
		"\u0215\u0005\u0003\u0000\u0000\u0215\u0216\u0005\u0003\u0000\u0000\u0216"+
		"\u0217\u0005\u0004\u0000\u0000\u0217\u0218\u0005\u0005\u0000\u0000\u0218"+
		"\u0219\u0005\u0003\u0000\u0000\u0219\u021a\u0005\u0003\u0000\u0000\u021a"+
		"\u021b\u0005\u0003\u0000\u0000\u021b\u021c\u0005\u0004\u0000\u0000\u021c"+
		"\u021d\u0005\u0005\u0000\u0000\u021d\u021e\u0005\u0003\u0000\u0000\u021e"+
		"\u021f\u0005\u0003\u0000\u0000\u021f\u0220\u0005\u0003\u0000\u0000\u0220"+
		"\u0221\u0005\u0003\u0000\u0000\u0221\u0222\u0005\u0003\u0000\u0000\u0222"+
		"\u0223\u0005\u0004\u0000\u0000\u0223\u0224\u0005\u0005\u0000\u0000\u0224"+
		"\u0225\u0005\u0003\u0000\u0000\u0225\u0226\u0005\u0003\u0000\u0000\u0226"+
		"\u0227\u0005\u0003\u0000\u0000\u0227\u0228\u0005\u0003\u0000\u0000\u0228"+
		"\u0229\u0005\u0003\u0000\u0000\u0229\u022a\u0005\u0004\u0000\u0000\u022a"+
		"\u022b\u0005\u0005\u0000\u0000\u022b\u022c\u0005\u0003\u0000\u0000\u022c"+
		"\u022d\u0005\u0003\u0000\u0000\u022d\u022e\u0005\u0004\u0000\u0000\u022e"+
		"\u022f\u0005\u0005\u0000\u0000\u022f\u0230\u0005\u0003\u0000\u0000\u0230"+
		"\u0231\u0005\u0004\u0000\u0000\u0231\u0232\u0005\u0005\u0000\u0000\u0232"+
		"\u0233\u0005\u0003\u0000\u0000\u0233\u0234\u0005\u0003\u0000\u0000\u0234"+
		"\u0235\u0005\u0003\u0000\u0000\u0235\u0236\u0005\u0003\u0000\u0000\u0236"+
		"\u0237\u0005\u0003\u0000\u0000\u0237\u0238\u0005\u0004\u0000\u0000\u0238"+
		"\u0239\u0005\u0005\u0000\u0000\u0239\u023a\u0005\u0003\u0000\u0000\u023a"+
		"\u023b\u0005\u0003\u0000\u0000\u023b\u023c\u0005\u0003\u0000\u0000\u023c"+
		"\u023d\u0005\u0004\u0000\u0000\u023d\u023e\u0005\u0005\u0000\u0000\u023e"+
		"\u023f\u0005\u0003\u0000\u0000\u023f\u0240\u0005\u0003\u0000\u0000\u0240"+
		"\u0241\u0005\u0003\u0000\u0000\u0241\u0242\u0005\u0003\u0000\u0000\u0242"+
		"\u0243\u0005\u0003\u0000\u0000\u0243\u0244\u0005\u0004\u0000\u0000\u0244"+
		"\u0245\u0005\u0005\u0000\u0000\u0245\u0246\u0005\u0003\u0000\u0000\u0246"+
		"\u0247\u0005\u0003\u0000\u0000\u0247\u0248\u0005\u0003\u0000\u0000\u0248"+
		"\u0249\u0005\u0003\u0000\u0000\u0249\u024a\u0005\u0003\u0000\u0000\u024a"+
		"\u024b\u0005\u0004\u0000\u0000\u024b\u024c\u0005\u0005\u0000\u0000\u024c"+
		"\u024d\u0005\u0003\u0000\u0000\u024d\u024e\u0005\u0003\u0000\u0000\u024e"+
		"\u024f\u0005\u0003\u0000\u0000\u024f\u0250\u0005\u0003\u0000\u0000\u0250"+
		"\u0251\u0005\u0004\u0000\u0000\u0251\u0252\u0005\u0005\u0000\u0000\u0252"+
		"\u0253\u0005\u0003\u0000\u0000\u0253\u0254\u0005\u0004\u0000\u0000\u0254"+
		"\u0255\u0005\u0005\u0000\u0000\u0255\u0256\u0005\u0003\u0000\u0000\u0256"+
		"\u0257\u0005\u0003\u0000\u0000\u0257\u0258\u0005\u0003\u0000\u0000\u0258"+
		"\u0259\u0005\u0003\u0000\u0000\u0259\u025a\u0005\u0003\u0000\u0000\u025a"+
		"\u025b\u0005\u0004\u0000\u0000\u025b\u025c\u0005\u0005\u0000\u0000\u025c"+
		"\u025d\u0005\u0003\u0000\u0000\u025d\u025e\u0005\u0003\u0000\u0000\u025e"+
		"\u025f\u0005\u0003\u0000\u0000\u025f\u0260\u0005\u0004\u0000\u0000\u0260"+
		"\u0261\u0005\u0005\u0000\u0000\u0261\u0262\u0005\u0003\u0000\u0000\u0262"+
		"\u0263\u0005\u0003\u0000\u0000\u0263\u0264\u0005\u0003\u0000\u0000\u0264"+
		"\u0265\u0005\u0003\u0000\u0000\u0265\u0266\u0005\u0003\u0000\u0000\u0266"+
		"\u0267\u0005\u0004\u0000\u0000\u0267\u0268\u0005\u0005\u0000\u0000\u0268"+
		"\u0269\u0005\u0003\u0000\u0000\u0269\u026a\u0005\u0003\u0000\u0000\u026a"+
		"\u026b\u0005\u0003\u0000\u0000\u026b\u026c\u0005\u0003\u0000\u0000\u026c"+
		"\u026d\u0005\u0003\u0000\u0000\u026d\u026e\u0005\u0004\u0000\u0000\u026e"+
		"\u026f\u0005\u0005\u0000\u0000\u026f\u0270\u0005\u0003\u0000\u0000\u0270"+
		"\u0271\u0005\u0003\u0000\u0000\u0271\u0272\u0005\u0003\u0000\u0000\u0272"+
		"\u0273\u0005\u0003\u0000\u0000\u0273\u0274\u0005\u0004\u0000\u0000\u0274"+
		"\u0275\u0005\u0005\u0000\u0000\u0275\u0276\u0005\u0003\u0000\u0000\u0276"+
		"\u0277\u0005\u0004\u0000\u0000\u0277\u0278\u0005\u0005\u0000\u0000\u0278"+
		"\u0279\u0005\u0003\u0000\u0000\u0279\u027a\u0005\u0003\u0000\u0000\u027a"+
		"\u027b\u0005\u0003\u0000\u0000\u027b\u027c\u0005\u0003\u0000\u0000\u027c"+
		"\u027d\u0005\u0003\u0000\u0000\u027d\u027e\u0005\u0004\u0000\u0000\u027e"+
		"\u027f\u0005\u0005\u0000\u0000\u027f\u0280\u0005\u0003\u0000\u0000\u0280"+
		"\u0281\u0005\u0003\u0000\u0000\u0281\u0282\u0005\u0003\u0000\u0000\u0282"+
		"\u0283\u0005\u0004\u0000\u0000\u0283\u0284\u0005\u0005\u0000\u0000\u0284"+
		"\u0285\u0005\u0003\u0000\u0000\u0285\u0286\u0005\u0003\u0000\u0000\u0286"+
		"\u0287\u0005\u0003\u0000\u0000\u0287\u0288\u0005\u0003\u0000\u0000\u0288"+
		"\u0289\u0005\u0003\u0000\u0000\u0289\u028a\u0005\u0004\u0000\u0000\u028a"+
		"\u028b\u0005\u0005\u0000\u0000\u028b\u028c\u0005\u0003\u0000\u0000\u028c"+
		"\u028d\u0005\u0003\u0000\u0000\u028d\u028e\u0005\u0003\u0000\u0000\u028e"+
		"\u028f\u0005\u0003\u0000\u0000\u028f\u0290\u0005\u0003\u0000\u0000\u0290"+
		"\u0291\u0005\u0004\u0000\u0000\u0291\u0292\u0005\u0005\u0000\u0000\u0292"+
		"\u0293\u0005\u0003\u0000\u0000\u0293\u0294\u0005\u0003\u0000\u0000\u0294"+
		"\u0295\u0005\u0003\u0000\u0000\u0295\u0296\u0005\u0003\u0000\u0000\u0296"+
		"\u0297\u0005\u0004\u0000\u0000\u0297\u0298\u0005\u0005\u0000\u0000\u0298"+
		"\u0299\u0005\u0003\u0000\u0000\u0299\u029a\u0005\u0004\u0000\u0000\u029a"+
		"\u029b\u0005\u0005\u0000\u0000\u029b\u029c\u0005\u0003\u0000\u0000\u029c"+
		"\u029d\u0005\u0004\u0000\u0000\u029d\u029e\u0005\u0005\u0000\u0000\u029e"+
		"\u029f\u0005\u0003\u0000\u0000\u029f\u02a0\u0005\u0003\u0000\u0000\u02a0"+
		"\u02a1\u0005\u0003\u0000\u0000\u02a1\u02a2\u0005\u0003\u0000\u0000\u02a2"+
		"\u02a3\u0005\u0003\u0000\u0000\u02a3\u02a4\u0005\u0004\u0000\u0000\u02a4"+
		"\u02a5\u0005\u0005\u0000\u0000\u02a5\u02a6\u0005\u0003\u0000\u0000\u02a6"+
		"\u02a7\u0005\u0003\u0000\u0000\u02a7\u02a8\u0005\u0003\u0000\u0000\u02a8"+
		"\u02a9\u0005\u0004\u0000\u0000\u02a9\u02aa\u0005\u0005\u0000\u0000\u02aa"+
		"\u02ab\u0005\u0003\u0000\u0000\u02ab\u02ac\u0005\u0003\u0000\u0000\u02ac"+
		"\u02ad\u0005\u0003\u0000\u0000\u02ad\u02ae\u0005\u0003\u0000\u0000\u02ae"+
		"\u02af\u0005\u0003\u0000\u0000\u02af\u02b0\u0005\u0004\u0000\u0000\u02b0"+
		"\u02b1\u0005\u0005\u0000\u0000\u02b1\u02b2\u0005\u0003\u0000\u0000\u02b2"+
		"\u02b3\u0005\u0003\u0000\u0000\u02b3\u02b4\u0005\u0003\u0000\u0000\u02b4"+
		"\u02b5\u0005\u0003\u0000\u0000\u02b5\u02b6\u0005\u0003\u0000\u0000\u02b6"+
		"\u02b7\u0005\u0004\u0000\u0000\u02b7\u02b8\u0005\u0005\u0000\u0000\u02b8"+
		"\u02b9\u0005\u0003\u0000\u0000\u02b9\u02ba\u0005\u0003\u0000\u0000\u02ba"+
		"\u02bb\u0005\u0003\u0000\u0000\u02bb\u02bc\u0005\u0003\u0000\u0000\u02bc"+
		"\u02bd\u0005\u0004\u0000\u0000\u02bd\u02be\u0005\u0005\u0000\u0000\u02be"+
		"\u02bf\u0005\u0003\u0000\u0000\u02bf\u02c0\u0005\u0004\u0000\u0000\u02c0"+
		"\u02c1\u0005\u0005\u0000\u0000\u02c1\u02c2\u0005\u0003\u0000\u0000\u02c2"+
		"\u02c3\u0005\u0003\u0000\u0000\u02c3\u02c4\u0005\u0003\u0000\u0000\u02c4"+
		"\u02c5\u0005\u0003\u0000\u0000\u02c5\u02c6\u0005\u0003\u0000\u0000\u02c6"+
		"\u02c7\u0005\u0004\u0000\u0000\u02c7\u02c8\u0005\u0005\u0000\u0000\u02c8"+
		"\u02c9\u0005\u0003\u0000\u0000\u02c9\u02ca\u0005\u0003\u0000\u0000\u02ca"+
		"\u02cb\u0005\u0003\u0000\u0000\u02cb\u02cc\u0005\u0004\u0000\u0000\u02cc"+
		"\u02cd\u0005\u0005\u0000\u0000\u02cd\u02ce\u0005\u0003\u0000\u0000\u02ce"+
		"\u02cf\u0005\u0003\u0000\u0000\u02cf\u02d0\u0005\u0003\u0000\u0000\u02d0"+
		"\u02d1\u0005\u0003\u0000\u0000\u02d1\u02d2\u0005\u0003\u0000\u0000\u02d2"+
		"\u02d3\u0005\u0004\u0000\u0000\u02d3\u02d4\u0005\u0005\u0000\u0000\u02d4"+
		"\u02d5\u0005\u0003\u0000\u0000\u02d5\u02d6\u0005\u0003\u0000\u0000\u02d6"+
		"\u02d7\u0005\u0003\u0000\u0000\u02d7\u02d8\u0005\u0003\u0000\u0000\u02d8"+
		"\u02d9\u0005\u0003\u0000\u0000\u02d9\u02da\u0005\u0004\u0000\u0000\u02da"+
		"\u02db\u0005\u0005\u0000\u0000\u02db\u02dc\u0005\u0003\u0000\u0000\u02dc"+
		"\u02dd\u0005\u0003\u0000\u0000\u02dd\u02de\u0005\u0003\u0000\u0000\u02de"+
		"\u02df\u0005\u0003\u0000\u0000\u02df\u02e0\u0005\u0004\u0000\u0000\u02e0"+
		"\u02e1\u0005\u0005\u0000\u0000\u02e1\u02e2\u0005\u0003\u0000\u0000\u02e2"+
		"\u02e3\u0005\u0004\u0000\u0000\u02e3\u02e4\u0005\u0005\u0000\u0000\u02e4"+
		"\u02e5\u0005\u0003\u0000\u0000\u02e5\u02e6\u0005\u0003\u0000\u0000\u02e6"+
		"\u02e7\u0005\u0003\u0000\u0000\u02e7\u02e8\u0005\u0003\u0000\u0000\u02e8"+
		"\u02e9\u0005\u0003\u0000\u0000\u02e9\u02ea\u0005\u0004\u0000\u0000\u02ea"+
		"\u02eb\u0005\u0005\u0000\u0000\u02eb\u02ec\u0005\u0003\u0000\u0000\u02ec"+
		"\u02ed\u0005\u0003\u0000\u0000\u02ed\u02ee\u0005\u0003\u0000\u0000\u02ee"+
		"\u02ef\u0005\u0004\u0000\u0000\u02ef\u02f0\u0005\u0005\u0000\u0000\u02f0"+
		"\u02f1\u0005\u0003\u0000\u0000\u02f1\u02f2\u0005\u0003\u0000\u0000\u02f2"+
		"\u02f3\u0005\u0003\u0000\u0000\u02f3\u02f4\u0005\u0003\u0000\u0000\u02f4"+
		"\u02f5\u0005\u0003\u0000\u0000\u02f5\u02f6\u0005\u0004\u0000\u0000\u02f6"+
		"\u02f7\u0005\u0005\u0000\u0000\u02f7\u02f8\u0005\u0003\u0000\u0000\u02f8"+
		"\u02f9\u0005\u0003\u0000\u0000\u02f9\u02fa\u0005\u0003\u0000\u0000\u02fa"+
		"\u02fb\u0005\u0003\u0000\u0000\u02fb\u02fc\u0005\u0003\u0000\u0000\u02fc"+
		"\u02fd\u0005\u0004\u0000\u0000\u02fd\u02fe\u0005\u0005\u0000\u0000\u02fe"+
		"\u02ff\u0005\u0003\u0000\u0000\u02ff\u0300\u0005\u0003\u0000\u0000\u0300"+
		"\u0301\u0005\u0003\u0000\u0000\u0301\u0302\u0005\u0003\u0000\u0000\u0302"+
		"\u0303\u0005\u0004\u0000\u0000\u0303\u0304\u0005\u0005\u0000\u0000\u0304"+
		"\u0305\u0005\u0003\u0000\u0000\u0305\u0306\u0005\n\u0000\u0000\u0306\u0307"+
		"\u0005\u0004\u0000\u0000\u0307\u0308\u0005\u0005\u0000\u0000\u0308\u0309"+
		"\u0005\u0003\u0000\u0000\u0309\u0385\u0005\u0004\u0000\u0000\u030a\u030b"+
		"\u0005\u0005\u0000\u0000\u030b\u030c\u0005\u0003\u0000\u0000\u030c\u030d"+
		"\u0005\n\u0000\u0000\u030d\u030e\u0005\u0004\u0000\u0000\u030e\u030f\u0005"+
		"\u0005\u0000\u0000\u030f\u0310\u0005\u0003\u0000\u0000\u0310\u0311\u0003"+
		"\n\u0005\u0000\u0311\u0312\u0005\u0004\u0000\u0000\u0312\u0313\u0005\u0005"+
		"\u0000\u0000\u0313\u0314\u0005\u0003\u0000\u0000\u0314\u0315\u0005\u0004"+
		"\u0000\u0000\u0315\u0316\u0005\u0005\u0000\u0000\u0316\u0317\u0005\u0003"+
		"\u0000\u0000\u0317\u0318\u0005\u0003\u0000\u0000\u0318\u0319\u0005\u0004"+
		"\u0000\u0000\u0319\u031a\u0005\u0005\u0000\u0000\u031a\u031b\u0005\u0003"+
		"\u0000\u0000\u031b\u031c\u0005\u0003\u0000\u0000\u031c\u031e\u0005\u0003"+
		"\u0000\u0000\u031d\u031f\u0003\n\u0005\u0000\u031e\u031d\u0001\u0000\u0000"+
		"\u0000\u031f\u0320\u0001\u0000\u0000\u0000\u0320\u031e\u0001\u0000\u0000"+
		"\u0000\u0320\u0321\u0001\u0000\u0000\u0000\u0321\u0322\u0001\u0000\u0000"+
		"\u0000\u0322\u0323\u0005\u0004\u0000\u0000\u0323\u0324\u0005\u0005\u0000"+
		"\u0000\u0324\u0325\u0005\u0003\u0000\u0000\u0325\u0326\u0005\u0003\u0000"+
		"\u0000\u0326\u0327\u0005\u0003\u0000\u0000\u0327\u0329\u0003\n\u0005\u0000"+
		"\u0328\u032a\u0003\n\u0005\u0000\u0329\u0328\u0001\u0000\u0000\u0000\u0329"+
		"\u032a\u0001\u0000\u0000\u0000\u032a\u032c\u0001\u0000\u0000\u0000\u032b"+
		"\u032d\u0003\n\u0005\u0000\u032c\u032b\u0001\u0000\u0000\u0000\u032c\u032d"+
		"\u0001\u0000\u0000\u0000\u032d\u032f\u0001\u0000\u0000\u0000\u032e\u0330"+
		"\u0003\n\u0005\u0000\u032f\u032e\u0001\u0000\u0000\u0000\u032f\u0330\u0001"+
		"\u0000\u0000\u0000\u0330\u0332\u0001\u0000\u0000\u0000\u0331\u0333\u0003"+
		"\n\u0005\u0000\u0332\u0331\u0001\u0000\u0000\u0000\u0332\u0333\u0001\u0000"+
		"\u0000\u0000\u0333\u0335\u0001\u0000\u0000\u0000\u0334\u0336\u0003\n\u0005"+
		"\u0000\u0335\u0334\u0001\u0000\u0000\u0000\u0335\u0336\u0001\u0000\u0000"+
		"\u0000\u0336\u0338\u0001\u0000\u0000\u0000\u0337\u0339\u0003\n\u0005\u0000"+
		"\u0338\u0337\u0001\u0000\u0000\u0000\u0338\u0339\u0001\u0000\u0000\u0000"+
		"\u0339\u033d\u0001\u0000\u0000\u0000\u033a\u033c\u0003\n\u0005\u0000\u033b"+
		"\u033a\u0001\u0000\u0000\u0000\u033c\u033f\u0001\u0000\u0000\u0000\u033d"+
		"\u033b\u0001\u0000\u0000\u0000\u033d\u033e\u0001\u0000\u0000\u0000\u033e"+
		"\u0340\u0001\u0000\u0000\u0000\u033f\u033d\u0001\u0000\u0000\u0000\u0340"+
		"\u0341\u0005\u0004\u0000\u0000\u0341\u0342\u0005\u0005\u0000\u0000\u0342"+
		"\u0343\u0005\u0003\u0000\u0000\u0343\u0344\u0005\u0003\u0000\u0000\u0344"+
		"\u0346\u0005\u0003\u0000\u0000\u0345\u0347\u0003\n\u0005\u0000\u0346\u0345"+
		"\u0001\u0000\u0000\u0000\u0347\u0348\u0001\u0000\u0000\u0000\u0348\u0346"+
		"\u0001\u0000\u0000\u0000\u0348\u0349\u0001\u0000\u0000\u0000\u0349\u034a"+
		"\u0001\u0000\u0000\u0000\u034a\u034b\u0005\u0004\u0000\u0000\u034b\u034c"+
		"\u0005\u0005\u0000\u0000\u034c\u034d\u0005\u0003\u0000\u0000\u034d\u034e"+
		"\u0005\u0003\u0000\u0000\u034e\u034f\u0005\u0003\u0000\u0000\u034f\u0350"+
		"\u0005\u0004\u0000\u0000\u0350\u0351\u0005\u0005\u0000\u0000\u0351\u0352"+
		"\u0005\u0003\u0000\u0000\u0352\u0353\u0005\u0003\u0000\u0000\u0353\u0354"+
		"\u0005\u0003\u0000\u0000\u0354\u0355\u0005\u0004\u0000\u0000\u0355\u0356"+
		"\u0005\u0005\u0000\u0000\u0356\u0357\u0005\u0003\u0000\u0000\u0357\u0358"+
		"\u0005\u0003\u0000\u0000\u0358\u0359\u0005\u0004\u0000\u0000\u0359\u035a"+
		"\u0005\u0005\u0000\u0000\u035a\u035b\u0005\u0003\u0000\u0000\u035b\u035c"+
		"\u0005\u0006\u0000\u0000\u035c\u035d\u0005\u0004\u0000\u0000\u035d\u035e"+
		"\u0005\u0005\u0000\u0000\u035e\u035f\u0005\u0003\u0000\u0000\u035f\u0363"+
		"\u0005\n\u0000\u0000\u0360\u0362\u0003\n\u0005\u0000\u0361\u0360\u0001"+
		"\u0000\u0000\u0000\u0362\u0365\u0001\u0000\u0000\u0000\u0363\u0361\u0001"+
		"\u0000\u0000\u0000\u0363\u0364\u0001\u0000\u0000\u0000\u0364\u0366\u0001"+
		"\u0000\u0000\u0000\u0365\u0363\u0001\u0000\u0000\u0000\u0366\u0367\u0005"+
		"\u0004\u0000\u0000\u0367\u0368\u0005\u0005\u0000\u0000\u0368\u0369\u0005"+
		"\u0003\u0000\u0000\u0369\u036a\u0005\n\u0000\u0000\u036a\u036b\u0005\u0004"+
		"\u0000\u0000\u036b\u036c\u0005\u0005\u0000\u0000\u036c\u0370\u0005\u0003"+
		"\u0000\u0000\u036d\u036f\u0003\n\u0005\u0000\u036e\u036d\u0001\u0000\u0000"+
		"\u0000\u036f\u0372\u0001\u0000\u0000\u0000\u0370\u036e\u0001\u0000\u0000"+
		"\u0000\u0370\u0371\u0001\u0000\u0000\u0000\u0371\u0373\u0001\u0000\u0000"+
		"\u0000\u0372\u0370\u0001\u0000\u0000\u0000\u0373\u0374\u0005\u0004\u0000"+
		"\u0000\u0374\u0375\u0005\u0005\u0000\u0000\u0375\u0376\u0005\u0003\u0000"+
		"\u0000\u0376\u0377\u0005\n\u0000\u0000\u0377\u0378\u0005\u0004\u0000\u0000"+
		"\u0378\u0379\u0005\u0005\u0000\u0000\u0379\u037a\u0005\u0003\u0000\u0000"+
		"\u037a\u037b\u0003\n\u0005\u0000\u037b\u037c\u0005\u0004\u0000\u0000\u037c"+
		"\u037d\u0005\u0005\u0000\u0000\u037d\u037e\u0005\u0003\u0000\u0000\u037e"+
		"\u037f\u0005\b\u0000\u0000\u037f\u0380\u0005\u0004\u0000\u0000\u0380\u0381"+
		"\u0005\u0005\u0000\u0000\u0381\u0382\u0005\u0003\u0000\u0000\u0382\u0383"+
		"\u0005\u0004\u0000\u0000\u0383\u0384\u0006\u0003\uffff\uffff\u0000\u0384"+
		"\u0386\u0001\u0000\u0000\u0000\u0385\u030a\u0001\u0000\u0000\u0000\u0386"+
		"\u0387\u0001\u0000\u0000\u0000\u0387\u0385\u0001\u0000\u0000\u0000\u0387"+
		"\u0388\u0001\u0000\u0000\u0000\u0388\u0389\u0001\u0000\u0000\u0000\u0389"+
		"\u038a\u0005\n\u0000\u0000\u038a\u038b\u0005\u0003\u0000\u0000\u038b\u038c"+
		"\u0005\n\u0000\u0000\u038c\u038d\u0005\u0003\u0000\u0000\u038d\u038e\u0005"+
		"\u0006\u0000\u0000\u038e\u038f\u0005\u0004\u0000\u0000\u038f\u0391\u0001"+
		"\u0000\u0000\u0000\u0390\u01de\u0001\u0000\u0000\u0000\u0391\u0392\u0001"+
		"\u0000\u0000\u0000\u0392\u0390\u0001\u0000\u0000\u0000\u0392\u0393\u0001"+
		"\u0000\u0000\u0000\u0393\u0394\u0001\u0000\u0000\u0000\u0394\u0395\u0005"+
		"\u0005\u0000\u0000\u0395\u0396\u0005\u0003\u0000\u0000\u0396\u0397\u0005"+
		"\n\u0000\u0000\u0397\u0398\u0005\u0003\u0000\u0000\u0398\u0399\u0005\n"+
		"\u0000\u0000\u0399\u039a\u0005\n\u0000\u0000\u039a\u039b\u0005\n\u0000"+
		"\u0000\u039b\u039c\u0005\n\u0000\u0000\u039c\u039d\u0005\n\u0000\u0000"+
		"\u039d\u039e\u0005\n\u0000\u0000\u039e\u039f\u0005\u0003\u0000\u0000\u039f"+
		"\u03a0\u0005\n\u0000\u0000\u03a0\u03a1\u0005\u0004\u0000\u0000\u03a1\u0007"+
		"\u0001\u0000\u0000\u0000\u03a2\u03a3\u0005\u0005\u0000\u0000\u03a3\u03a4"+
		"\u0005\u0003\u0000\u0000\u03a4\u03a5\u0005\n\u0000\u0000\u03a5\u03a6\u0005"+
		"\u0003\u0000\u0000\u03a6\u03a7\u0005\n\u0000\u0000\u03a7\u03a8\u0005\n"+
		"\u0000\u0000\u03a8\u03a9\u0005\n\u0000\u0000\u03a9\u03aa\u0005\n\u0000"+
		"\u0000\u03aa\u03ab\u0005\n\u0000\u0000\u03ab\u03ac\u0005\n\u0000\u0000"+
		"\u03ac\u03ad\u0005\u0003\u0000\u0000\u03ad\u03ae\u0005\n\u0000\u0000\u03ae"+
		"\u0591\u0005\u0004\u0000\u0000\u03af\u03b0\u0005\n\u0000\u0000\u03b0\u03b1"+
		"\u0005\u0003\u0000\u0000\u03b1\u03b2\u0005\u0006\u0000\u0000\u03b2\u03b3"+
		"\u0005\u0003\u0000\u0000\u03b3\u03b4\u0005\u0004\u0000\u0000\u03b4\u03b5"+
		"\u0005\n\u0000\u0000\u03b5\u03b6\u0005\u0003\u0000\u0000\u03b6\u03b7\u0005"+
		"\u0006\u0000\u0000\u03b7\u03b8\u0005\u0003\u0000\u0000\u03b8\u03b9\u0005"+
		"\u0004\u0000\u0000\u03b9\u03ba\u0005\n\u0000\u0000\u03ba\u03bb\u0005\u0003"+
		"\u0000\u0000\u03bb\u03bc\u0005\u0006\u0000\u0000\u03bc\u03bd\u0005\u0003"+
		"\u0000\u0000\u03bd\u03be\u0005\u0004\u0000\u0000\u03be\u03bf\u0005\n\u0000"+
		"\u0000\u03bf\u03c0\u0005\u0003\u0000\u0000\u03c0\u03c1\u0005\u0006\u0000"+
		"\u0000\u03c1\u03c2\u0005\u0003\u0000\u0000\u03c2\u03c3\u0005\u0003\u0000"+
		"\u0000\u03c3\u03c4\u0005\u0003\u0000\u0000\u03c4\u03c5\u0005\u0003\u0000"+
		"\u0000\u03c5\u03c6\u0005\u0003\u0000\u0000\u03c6\u03c7\u0005\u0004\u0000"+
		"\u0000\u03c7\u03c8\u0005\n\u0000\u0000\u03c8\u03c9\u0005\u0003\u0000\u0000"+
		"\u03c9\u03ca\u0005\u0006\u0000\u0000\u03ca\u03cb\u0005\u0003\u0000\u0000"+
		"\u03cb\u03cc\u0005\u0003\u0000\u0000\u03cc\u03cd\u0005\u0003\u0000\u0000"+
		"\u03cd\u03ce\u0005\u0004\u0000\u0000\u03ce\u03cf\u0005\n\u0000\u0000\u03cf"+
		"\u03d0\u0005\u0003\u0000\u0000\u03d0\u03d1\u0005\u0006\u0000\u0000\u03d1"+
		"\u03d2\u0005\u0003\u0000\u0000\u03d2\u03d3\u0005\u0003\u0000\u0000\u03d3"+
		"\u03d4\u0005\u0003\u0000\u0000\u03d4\u03d5\u0005\u0003\u0000\u0000\u03d5"+
		"\u03d6\u0005\u0003\u0000\u0000\u03d6\u03d7\u0005\u0004\u0000\u0000\u03d7"+
		"\u03d8\u0005\n\u0000\u0000\u03d8\u03d9\u0005\u0003\u0000\u0000\u03d9\u03da"+
		"\u0005\u0006\u0000\u0000\u03da\u03db\u0005\u0003\u0000\u0000\u03db\u03dc"+
		"\u0005\u0003\u0000\u0000\u03dc\u03dd\u0005\u0003\u0000\u0000\u03dd\u03de"+
		"\u0005\u0003\u0000\u0000\u03de\u03df\u0005\u0003\u0000\u0000\u03df\u03e0"+
		"\u0005\u0004\u0000\u0000\u03e0\u03e1\u0005\n\u0000\u0000\u03e1\u03e2\u0005"+
		"\u0003\u0000\u0000\u03e2\u03e3\u0005\u0006\u0000\u0000\u03e3\u03e4\u0005"+
		"\u0003\u0000\u0000\u03e4\u03e5\u0005\u0003\u0000\u0000\u03e5\u03e6\u0005"+
		"\u0003\u0000\u0000\u03e6\u03e7\u0005\u0003\u0000\u0000\u03e7\u03e8\u0005"+
		"\u0004\u0000\u0000\u03e8\u03e9\u0005\n\u0000\u0000\u03e9\u03ea\u0005\u0003"+
		"\u0000\u0000\u03ea\u03eb\u0005\u0006\u0000\u0000\u03eb\u03ec\u0005\u0003"+
		"\u0000\u0000\u03ec\u03ed\u0005\u0004\u0000\u0000\u03ed\u03ee\u0005\n\u0000"+
		"\u0000\u03ee\u03ef\u0005\u0003\u0000\u0000\u03ef\u03f0\u0005\u0006\u0000"+
		"\u0000\u03f0\u03f1\u0005\u0003\u0000\u0000\u03f1\u03f2\u0005\u0004\u0000"+
		"\u0000\u03f2\u03f3\u0005\n\u0000\u0000\u03f3\u03f4\u0005\u0003\u0000\u0000"+
		"\u03f4\u03f5\u0005\u0006\u0000\u0000\u03f5\u03f6\u0005\u0003\u0000\u0000"+
		"\u03f6\u03f7\u0005\u0003\u0000\u0000\u03f7\u03f8\u0005\u0003\u0000\u0000"+
		"\u03f8\u03f9\u0005\u0003\u0000\u0000\u03f9\u03fa\u0005\u0003\u0000\u0000"+
		"\u03fa\u03fb\u0005\u0004\u0000\u0000\u03fb\u03fc\u0005\n\u0000\u0000\u03fc"+
		"\u03fd\u0005\u0003\u0000\u0000\u03fd\u03fe\u0005\u0006\u0000\u0000\u03fe"+
		"\u03ff\u0005\u0003\u0000\u0000\u03ff\u0400\u0005\u0003\u0000\u0000\u0400"+
		"\u0401\u0005\u0003\u0000\u0000\u0401\u0402\u0005\u0004\u0000\u0000\u0402"+
		"\u0403\u0005\n\u0000\u0000\u0403\u0404\u0005\u0003\u0000\u0000\u0404\u0405"+
		"\u0005\u0006\u0000\u0000\u0405\u0406\u0005\u0003\u0000\u0000\u0406\u0407"+
		"\u0005\u0003\u0000\u0000\u0407\u0408\u0005\u0003\u0000\u0000\u0408\u0409"+
		"\u0005\u0003\u0000\u0000\u0409\u040a\u0005\u0003\u0000\u0000\u040a\u040b"+
		"\u0005\u0004\u0000\u0000\u040b\u040c\u0005\n\u0000\u0000\u040c\u040d\u0005"+
		"\u0003\u0000\u0000\u040d\u040e\u0005\u0006\u0000\u0000\u040e\u040f\u0005"+
		"\u0003\u0000\u0000\u040f\u0410\u0005\u0003\u0000\u0000\u0410\u0411\u0005"+
		"\u0003\u0000\u0000\u0411\u0412\u0005\u0003\u0000\u0000\u0412\u0413\u0005"+
		"\u0003\u0000\u0000\u0413\u0414\u0005\u0004\u0000\u0000\u0414\u0415\u0005"+
		"\n\u0000\u0000\u0415\u0416\u0005\u0003\u0000\u0000\u0416\u0417\u0005\u0006"+
		"\u0000\u0000\u0417\u0418\u0005\u0003\u0000\u0000\u0418\u0419\u0005\u0003"+
		"\u0000\u0000\u0419\u041a\u0005\u0003\u0000\u0000\u041a\u041b\u0005\u0003"+
		"\u0000\u0000\u041b\u041c\u0005\u0004\u0000\u0000\u041c\u041d\u0005\n\u0000"+
		"\u0000\u041d\u041e\u0005\u0003\u0000\u0000\u041e\u041f\u0005\u0006\u0000"+
		"\u0000\u041f\u0420\u0005\u0003\u0000\u0000\u0420\u0421\u0005\u0004\u0000"+
		"\u0000\u0421\u0422\u0005\n\u0000\u0000\u0422\u0423\u0005\u0003\u0000\u0000"+
		"\u0423\u0424\u0005\u0006\u0000\u0000\u0424\u0425\u0005\u0003\u0000\u0000"+
		"\u0425\u0426\u0005\u0004\u0000\u0000\u0426\u0427\u0005\n\u0000\u0000\u0427"+
		"\u0428\u0005\u0003\u0000\u0000\u0428\u0429\u0005\u0006\u0000\u0000\u0429"+
		"\u042a\u0005\u0003\u0000\u0000\u042a\u042b\u0005\u0004\u0000\u0000\u042b"+
		"\u042c\u0005\n\u0000\u0000\u042c\u042d\u0005\u0003\u0000\u0000\u042d\u042e"+
		"\u0005\u0006\u0000\u0000\u042e\u042f\u0005\u0003\u0000\u0000\u042f\u0430"+
		"\u0005\u0004\u0000\u0000\u0430\u0431\u0005\n\u0000\u0000\u0431\u0432\u0005"+
		"\u0003\u0000\u0000\u0432\u0433\u0005\u0006\u0000\u0000\u0433\u0434\u0005"+
		"\u0003\u0000\u0000\u0434\u0435\u0005\u0003\u0000\u0000\u0435\u0436\u0005"+
		"\u0003\u0000\u0000\u0436\u0437\u0005\u0003\u0000\u0000\u0437\u0438\u0005"+
		"\u0003\u0000\u0000\u0438\u0439\u0005\u0004\u0000\u0000\u0439\u043a\u0005"+
		"\n\u0000\u0000\u043a\u043b\u0005\u0003\u0000\u0000\u043b\u043c\u0005\u0006"+
		"\u0000\u0000\u043c\u043d\u0005\u0003\u0000\u0000\u043d\u043e\u0005\u0003"+
		"\u0000\u0000\u043e\u043f\u0005\u0003\u0000\u0000\u043f\u0440\u0005\u0003"+
		"\u0000\u0000\u0440\u0441\u0005\u0004\u0000\u0000\u0441\u0442\u0005\n\u0000"+
		"\u0000\u0442\u0443\u0005\u0003\u0000\u0000\u0443\u0444\u0005\u0006\u0000"+
		"\u0000\u0444\u0445\u0005\u0003\u0000\u0000\u0445\u0446\u0005\u0003\u0000"+
		"\u0000\u0446\u0447\u0005\u0003\u0000\u0000\u0447\u0448\u0005\u0003\u0000"+
		"\u0000\u0448\u0449\u0005\u0003\u0000\u0000\u0449\u044a\u0005\u0004\u0000"+
		"\u0000\u044a\u044b\u0005\n\u0000\u0000\u044b\u044c\u0005\u0003\u0000\u0000"+
		"\u044c\u044d\u0005\u0006\u0000\u0000\u044d\u044e\u0005\u0003\u0000\u0000"+
		"\u044e\u044f\u0005\u0003\u0000\u0000\u044f\u0450\u0005\u0003\u0000\u0000"+
		"\u0450\u0451\u0005\u0003\u0000\u0000\u0451\u0452\u0005\u0003\u0000\u0000"+
		"\u0452\u0453\u0005\u0004\u0000\u0000\u0453\u0454\u0005\n\u0000\u0000\u0454"+
		"\u0455\u0005\u0003\u0000\u0000\u0455\u0456\u0005\u0006\u0000\u0000\u0456"+
		"\u0457\u0005\u0003\u0000\u0000\u0457\u0458\u0005\u0003\u0000\u0000\u0458"+
		"\u0459\u0005\u0003\u0000\u0000\u0459\u045a\u0005\u0003\u0000\u0000\u045a"+
		"\u045b\u0005\u0004\u0000\u0000\u045b\u045c\u0005\n\u0000\u0000\u045c\u045d"+
		"\u0005\u0003\u0000\u0000\u045d\u045e\u0005\u0006\u0000\u0000\u045e\u045f"+
		"\u0005\u0003\u0000\u0000\u045f\u0460\u0005\u0004\u0000\u0000\u0460\u0461"+
		"\u0005\n\u0000\u0000\u0461\u0462\u0005\u0003\u0000\u0000\u0462\u0463\u0005"+
		"\u0006\u0000\u0000\u0463\u0464\u0005\u0003\u0000\u0000\u0464\u0465\u0005"+
		"\u0004\u0000\u0000\u0465\u0466\u0005\n\u0000\u0000\u0466\u0467\u0005\u0003"+
		"\u0000\u0000\u0467\u0468\u0005\u0006\u0000\u0000\u0468\u0469\u0005\u0003"+
		"\u0000\u0000\u0469\u046a\u0005\u0004\u0000\u0000\u046a\u046b\u0005\n\u0000"+
		"\u0000\u046b\u046c\u0005\u0003\u0000\u0000\u046c\u046d\u0005\u0006\u0000"+
		"\u0000\u046d\u046e\u0005\u0003\u0000\u0000\u046e\u046f\u0005\u0004\u0000"+
		"\u0000\u046f\u0470\u0005\n\u0000\u0000\u0470\u0471\u0005\u0003\u0000\u0000"+
		"\u0471\u0472\u0005\u0006\u0000\u0000\u0472\u0473\u0005\u0003\u0000\u0000"+
		"\u0473\u0474\u0005\u0003\u0000\u0000\u0474\u0475\u0005\u0003\u0000\u0000"+
		"\u0475\u0476\u0005\u0003\u0000\u0000\u0476\u0477\u0005\u0003\u0000\u0000"+
		"\u0477\u0478\u0005\u0004\u0000\u0000\u0478\u0479\u0005\n\u0000\u0000\u0479"+
		"\u047a\u0005\u0003\u0000\u0000\u047a\u047b\u0005\u0006\u0000\u0000\u047b"+
		"\u047c\u0005\u0003\u0000\u0000\u047c\u047d\u0005\u0003\u0000\u0000\u047d"+
		"\u047e\u0005\u0003\u0000\u0000\u047e\u047f\u0005\u0004\u0000\u0000\u047f"+
		"\u0480\u0005\n\u0000\u0000\u0480\u0481\u0005\u0003\u0000\u0000\u0481\u0482"+
		"\u0005\u0006\u0000\u0000\u0482\u0483\u0005\u0003\u0000\u0000\u0483\u0484"+
		"\u0005\u0003\u0000\u0000\u0484\u0485\u0005\u0003\u0000\u0000\u0485\u0486"+
		"\u0005\u0003\u0000\u0000\u0486\u0487\u0005\u0003\u0000\u0000\u0487\u0488"+
		"\u0005\u0004\u0000\u0000\u0488\u0489\u0005\n\u0000\u0000\u0489\u048a\u0005"+
		"\u0003\u0000\u0000\u048a\u048b\u0005\u0006\u0000\u0000\u048b\u048c\u0005"+
		"\u0003\u0000\u0000\u048c\u048d\u0005\u0003\u0000\u0000\u048d\u048e\u0005"+
		"\u0003\u0000\u0000\u048e\u048f\u0005\u0003\u0000\u0000\u048f\u0490\u0005"+
		"\u0003\u0000\u0000\u0490\u0491\u0005\u0004\u0000\u0000\u0491\u0492\u0005"+
		"\n\u0000\u0000\u0492\u0493\u0005\u0003\u0000\u0000\u0493\u0494\u0005\u0006"+
		"\u0000\u0000\u0494\u0495\u0005\u0003\u0000\u0000\u0495\u0496\u0005\u0003"+
		"\u0000\u0000\u0496\u0497\u0005\u0003\u0000\u0000\u0497\u0498\u0005\u0003"+
		"\u0000\u0000\u0498\u0499\u0005\u0004\u0000\u0000\u0499\u049a\u0005\n\u0000"+
		"\u0000\u049a\u049b\u0005\u0003\u0000\u0000\u049b\u049c\u0005\u0006\u0000"+
		"\u0000\u049c\u049d\u0005\u0003\u0000\u0000\u049d\u049e\u0005\u0004\u0000"+
		"\u0000\u049e\u049f\u0005\n\u0000\u0000\u049f\u04a0\u0005\u0003\u0000\u0000"+
		"\u04a0\u04a1\u0005\u0006\u0000\u0000\u04a1\u04a2\u0005\u0003\u0000\u0000"+
		"\u04a2\u04a3\u0005\u0004\u0000\u0000\u04a3\u04a4\u0005\n\u0000\u0000\u04a4"+
		"\u04a5\u0005\u0003\u0000\u0000\u04a5\u04a6\u0005\u0006\u0000\u0000\u04a6"+
		"\u04a7\u0005\u0003\u0000\u0000\u04a7\u04a8\u0005\u0004\u0000\u0000\u04a8"+
		"\u04a9\u0005\n\u0000\u0000\u04a9\u04aa\u0005\u0003\u0000\u0000\u04aa\u04ab"+
		"\u0005\u0006\u0000\u0000\u04ab\u04ac\u0005\u0003\u0000\u0000\u04ac\u04ad"+
		"\u0005\u0003\u0000\u0000\u04ad\u04ae\u0005\u0003\u0000\u0000\u04ae\u04af"+
		"\u0005\u0003\u0000\u0000\u04af\u04b0\u0005\u0003\u0000\u0000\u04b0\u04b1"+
		"\u0005\u0004\u0000\u0000\u04b1\u04b2\u0005\n\u0000\u0000\u04b2\u04b3\u0005"+
		"\u0003\u0000\u0000\u04b3\u04b4\u0005\u0006\u0000\u0000\u04b4\u04b5\u0005"+
		"\u0003\u0000\u0000\u04b5\u04b6\u0005\u0003\u0000\u0000\u04b6\u04b7\u0005"+
		"\u0003\u0000\u0000\u04b7\u04b8\u0005\u0004\u0000\u0000\u04b8\u04b9\u0005"+
		"\n\u0000\u0000\u04b9\u04ba\u0005\u0003\u0000\u0000\u04ba\u04bb\u0005\u0006"+
		"\u0000\u0000\u04bb\u04bc\u0005\u0003\u0000\u0000\u04bc\u04bd\u0005\u0003"+
		"\u0000\u0000\u04bd\u04be\u0005\u0003\u0000\u0000\u04be\u04bf\u0005\u0003"+
		"\u0000\u0000\u04bf\u04c0\u0005\u0003\u0000\u0000\u04c0\u04c1\u0005\u0004"+
		"\u0000\u0000\u04c1\u04c2\u0005\n\u0000\u0000\u04c2\u04c3\u0005\u0003\u0000"+
		"\u0000\u04c3\u04c4\u0005\u0006\u0000\u0000\u04c4\u04c5\u0005\u0003\u0000"+
		"\u0000\u04c5\u04c6\u0005\u0003\u0000\u0000\u04c6\u04c7\u0005\u0003\u0000"+
		"\u0000\u04c7\u04c8\u0005\u0003\u0000\u0000\u04c8\u04c9\u0005\u0003\u0000"+
		"\u0000\u04c9\u04ca\u0005\u0004\u0000\u0000\u04ca\u04cb\u0005\n\u0000\u0000"+
		"\u04cb\u04cc\u0005\u0003\u0000\u0000\u04cc\u04cd\u0005\u0006\u0000\u0000"+
		"\u04cd\u04ce\u0005\u0003\u0000\u0000\u04ce\u04cf\u0005\u0003\u0000\u0000"+
		"\u04cf\u04d0\u0005\u0003\u0000\u0000\u04d0\u04d1\u0005\u0003\u0000\u0000"+
		"\u04d1\u04d2\u0005\u0004\u0000\u0000\u04d2\u04d3\u0005\n\u0000\u0000\u04d3"+
		"\u04d4\u0005\u0003\u0000\u0000\u04d4\u04d5\u0005\u0006\u0000\u0000\u04d5"+
		"\u04d6\u0005\u0003\u0000\u0000\u04d6\u04d7\u0005\n\u0000\u0000\u04d7\u04d8"+
		"\u0005\u0004\u0000\u0000\u04d8\u04d9\u0005\n\u0000\u0000\u04d9\u04da\u0005"+
		"\u0003\u0000\u0000\u04da\u04db\u0005\u0006\u0000\u0000\u04db\u04dc\u0005"+
		"\u0003\u0000\u0000\u04dc\u0586\u0005\u0004\u0000\u0000\u04dd\u04de\u0005"+
		"\n\u0000\u0000\u04de\u04df\u0005\u0003\u0000\u0000\u04df\u04e0\u0005\u0006"+
		"\u0000\u0000\u04e0\u04e1\u0005\u0003\u0000\u0000\u04e1\u04e2\u0003\n\u0005"+
		"\u0000\u04e2\u04e3\u0005\u0004\u0000\u0000\u04e3\u04e4\u0005\n\u0000\u0000"+
		"\u04e4\u04e5\u0005\u0003\u0000\u0000\u04e5\u04e6\u0005\u0006\u0000\u0000"+
		"\u04e6\u04e7\u0005\u0003\u0000\u0000\u04e7\u04e9\u0003\n\u0005\u0000\u04e8"+
		"\u04ea\u0003\n\u0005\u0000\u04e9\u04e8\u0001\u0000\u0000\u0000\u04e9\u04ea"+
		"\u0001\u0000\u0000\u0000\u04ea\u04ec\u0001\u0000\u0000\u0000\u04eb\u04ed"+
		"\u0003\n\u0005\u0000\u04ec\u04eb\u0001\u0000\u0000\u0000\u04ec\u04ed\u0001"+
		"\u0000\u0000\u0000\u04ed\u04ef\u0001\u0000\u0000\u0000\u04ee\u04f0\u0003"+
		"\n\u0005\u0000\u04ef\u04ee\u0001\u0000\u0000\u0000\u04ef\u04f0\u0001\u0000"+
		"\u0000\u0000\u04f0\u04f2\u0001\u0000\u0000\u0000\u04f1\u04f3\u0003\n\u0005"+
		"\u0000\u04f2\u04f1\u0001\u0000\u0000\u0000\u04f2\u04f3\u0001\u0000\u0000"+
		"\u0000\u04f3\u04f5\u0001\u0000\u0000\u0000\u04f4\u04f6\u0003\n\u0005\u0000"+
		"\u04f5\u04f4\u0001\u0000\u0000\u0000\u04f5\u04f6\u0001\u0000\u0000\u0000"+
		"\u04f6\u04f8\u0001\u0000\u0000\u0000\u04f7\u04f9\u0003\n\u0005\u0000\u04f8"+
		"\u04f7\u0001\u0000\u0000\u0000\u04f8\u04f9\u0001\u0000\u0000\u0000\u04f9"+
		"\u04fd\u0001\u0000\u0000\u0000\u04fa\u04fc\u0003\n\u0005\u0000\u04fb\u04fa"+
		"\u0001\u0000\u0000\u0000\u04fc\u04ff\u0001\u0000\u0000\u0000\u04fd\u04fb"+
		"\u0001\u0000\u0000\u0000\u04fd\u04fe\u0001\u0000\u0000\u0000\u04fe\u0500"+
		"\u0001\u0000\u0000\u0000\u04ff\u04fd\u0001\u0000\u0000\u0000\u0500\u0501"+
		"\u0005\u0004\u0000\u0000\u0501\u0502\u0005\n\u0000\u0000\u0502\u0503\u0005"+
		"\u0003\u0000\u0000\u0503\u0504\u0005\u0006\u0000\u0000\u0504\u0505\u0005"+
		"\u0003\u0000\u0000\u0505\u0509\u0003\n\u0005\u0000\u0506\u0508\u0003\n"+
		"\u0005\u0000\u0507\u0506\u0001\u0000\u0000\u0000\u0508\u050b\u0001\u0000"+
		"\u0000\u0000\u0509\u0507\u0001\u0000\u0000\u0000\u0509\u050a\u0001\u0000"+
		"\u0000\u0000\u050a\u050c\u0001\u0000\u0000\u0000\u050b\u0509\u0001\u0000"+
		"\u0000\u0000\u050c\u050d\u0005\u0004\u0000\u0000\u050d\u050e\u0005\n\u0000"+
		"\u0000\u050e\u050f\u0005\u0003\u0000\u0000\u050f\u0510\u0005\u0006\u0000"+
		"\u0000\u0510\u0512\u0005\u0003\u0000\u0000\u0511\u0513\u0005\n\u0000\u0000"+
		"\u0512\u0511\u0001\u0000\u0000\u0000\u0512\u0513\u0001\u0000\u0000\u0000"+
		"\u0513\u0514\u0001\u0000\u0000\u0000\u0514\u0515\u0005\u0004\u0000\u0000"+
		"\u0515\u0516\u0005\n\u0000\u0000\u0516\u0517\u0005\u0003\u0000\u0000\u0517"+
		"\u0518\u0005\u0006\u0000\u0000\u0518\u0519\u0005\u0003\u0000\u0000\u0519"+
		"\u051a\u0005\b\u0000\u0000\u051a\u051b\u0005\u0004\u0000\u0000\u051b\u051c"+
		"\u0005\n\u0000\u0000\u051c\u051d\u0005\u0003\u0000\u0000\u051d\u051e\u0005"+
		"\u0006\u0000\u0000\u051e\u051f\u0005\u0003\u0000\u0000\u051f\u0520\u0005"+
		"\b\u0000\u0000\u0520\u0521\u0005\u0004\u0000\u0000\u0521\u0522\u0005\n"+
		"\u0000\u0000\u0522\u0523\u0005\u0003\u0000\u0000\u0523\u0524\u0005\u0006"+
		"\u0000\u0000\u0524\u0525\u0005\u0003\u0000\u0000\u0525\u0526\u0005\b\u0000"+
		"\u0000\u0526\u0527\u0005\u0004\u0000\u0000\u0527\u0528\u0005\n\u0000\u0000"+
		"\u0528\u0529\u0005\u0003\u0000\u0000\u0529\u052a\u0005\u0006\u0000\u0000"+
		"\u052a\u052b\u0005\u0003\u0000\u0000\u052b\u052c\u0005\b\u0000\u0000\u052c"+
		"\u052d\u0005\u0004\u0000\u0000\u052d\u052e\u0005\n\u0000\u0000\u052e\u052f"+
		"\u0005\u0003\u0000\u0000\u052f\u0530\u0005\u0006\u0000\u0000\u0530\u0531"+
		"\u0005\u0003\u0000\u0000\u0531\u0532\u0005\b\u0000\u0000\u0532\u0533\u0005"+
		"\u0004\u0000\u0000\u0533\u0534\u0005\n\u0000\u0000\u0534\u0535\u0005\u0003"+
		"\u0000\u0000\u0535\u0536\u0005\u0006\u0000\u0000\u0536\u0537\u0005\u0003"+
		"\u0000\u0000\u0537\u0538\u0005\b\u0000\u0000\u0538\u0539\u0005\u0004\u0000"+
		"\u0000\u0539\u053a\u0005\n\u0000\u0000\u053a\u053b\u0005\u0003\u0000\u0000"+
		"\u053b\u053c\u0005\u0006\u0000\u0000\u053c\u053d\u0005\u0003\u0000\u0000"+
		"\u053d\u053e\u0005\b\u0000\u0000\u053e\u053f\u0005\u0004\u0000\u0000\u053f"+
		"\u0540\u0005\n\u0000\u0000\u0540\u0541\u0005\u0003\u0000\u0000\u0541\u0542"+
		"\u0005\u0006\u0000\u0000\u0542\u0543\u0005\u0003\u0000\u0000\u0543\u0544"+
		"\u0005\b\u0000\u0000\u0544\u0545\u0005\u0004\u0000\u0000\u0545\u0546\u0005"+
		"\n\u0000\u0000\u0546\u0547\u0005\u0003\u0000\u0000\u0547\u0548\u0005\u0006"+
		"\u0000\u0000\u0548\u0549\u0005\u0003\u0000\u0000\u0549\u054a\u0005\b\u0000"+
		"\u0000\u054a\u054b\u0005\u0004\u0000\u0000\u054b\u054c\u0005\n\u0000\u0000"+
		"\u054c\u054d\u0005\u0003\u0000\u0000\u054d\u054e\u0005\u0006\u0000\u0000"+
		"\u054e\u054f\u0005\u0003\u0000\u0000\u054f\u0550\u0005\b\u0000\u0000\u0550"+
		"\u0551\u0005\u0004\u0000\u0000\u0551\u0552\u0005\n\u0000\u0000\u0552\u0553"+
		"\u0005\u0003\u0000\u0000\u0553\u0554\u0005\u0006\u0000\u0000\u0554\u0555"+
		"\u0005\u0003\u0000\u0000\u0555\u0556\u0005\u0004\u0000\u0000\u0556\u0557"+
		"\u0006\u0004\uffff\uffff\u0000\u0557\u0587\u0001\u0000\u0000\u0000\u0558"+
		"\u0559\u0005\n\u0000\u0000\u0559\u055a\u0005\u0003\u0000\u0000\u055a\u055b"+
		"\u0005\u0006\u0000\u0000\u055b\u055c\u0005\u0003\u0000\u0000\u055c\u055d"+
		"\u0003\n\u0005\u0000\u055d\u055f\u0003\n\u0005\u0000\u055e\u0560\u0003"+
		"\n\u0005\u0000\u055f\u055e\u0001\u0000\u0000\u0000\u055f\u0560\u0001\u0000"+
		"\u0000\u0000\u0560\u0562\u0001\u0000\u0000\u0000\u0561\u0563\u0003\n\u0005"+
		"\u0000\u0562\u0561\u0001\u0000\u0000\u0000\u0562\u0563\u0001\u0000\u0000"+
		"\u0000\u0563\u0565\u0001\u0000\u0000\u0000\u0564\u0566\u0003\n\u0005\u0000"+
		"\u0565\u0564\u0001\u0000\u0000\u0000\u0565\u0566\u0001\u0000\u0000\u0000"+
		"\u0566\u0568\u0001\u0000\u0000\u0000\u0567\u0569\u0003\n\u0005\u0000\u0568"+
		"\u0567\u0001\u0000\u0000\u0000\u0568\u0569\u0001\u0000\u0000\u0000\u0569"+
		"\u056b\u0001\u0000\u0000\u0000\u056a\u056c\u0003\n\u0005\u0000\u056b\u056a"+
		"\u0001\u0000\u0000\u0000\u056b\u056c\u0001\u0000\u0000\u0000\u056c\u056e"+
		"\u0001\u0000\u0000\u0000\u056d\u056f\u0003\n\u0005\u0000\u056e\u056d\u0001"+
		"\u0000\u0000\u0000\u056e\u056f\u0001\u0000\u0000\u0000\u056f\u0573\u0001"+
		"\u0000\u0000\u0000\u0570\u0572\u0003\n\u0005\u0000\u0571\u0570\u0001\u0000"+
		"\u0000\u0000\u0572\u0575\u0001\u0000\u0000\u0000\u0573\u0571\u0001\u0000"+
		"\u0000\u0000\u0573\u0574\u0001\u0000\u0000\u0000\u0574\u0576\u0001\u0000"+
		"\u0000\u0000\u0575\u0573\u0001\u0000\u0000\u0000\u0576\u0577\u0005\b\u0000"+
		"\u0000\u0577\u0578\u0005\u0004\u0000\u0000\u0578\u0579\u0005\n\u0000\u0000"+
		"\u0579\u057a\u0005\u0003\u0000\u0000\u057a\u057b\u0005\u0006\u0000\u0000"+
		"\u057b\u057c\u0005\u0003\u0000\u0000\u057c\u057d\u0005\b\u0000\u0000\u057d"+
		"\u057e\u0005\b\u0000\u0000\u057e\u057f\u0005\b\u0000\u0000\u057f\u0580"+
		"\u0005\b\u0000\u0000\u0580\u0581\u0005\b\u0000\u0000\u0581\u0582\u0005"+
		"\b\u0000\u0000\u0582\u0583\u0005\b\u0000\u0000\u0583\u0584\u0005\u0004"+
		"\u0000\u0000\u0584\u0585\u0006\u0004\uffff\uffff\u0000\u0585\u0587\u0001"+
		"\u0000\u0000\u0000\u0586\u04dd\u0001\u0000\u0000\u0000\u0586\u0558\u0001"+
		"\u0000\u0000\u0000\u0587\u0588\u0001\u0000\u0000\u0000\u0588\u0586\u0001"+
		"\u0000\u0000\u0000\u0588\u0589\u0001\u0000\u0000\u0000\u0589\u058a\u0001"+
		"\u0000\u0000\u0000\u058a\u058b\u0005\n\u0000\u0000\u058b\u058c\u0005\u0003"+
		"\u0000\u0000\u058c\u058d\u0005\n\u0000\u0000\u058d\u058e\u0005\u0003\u0000"+
		"\u0000\u058e\u058f\u0005\u0006\u0000\u0000\u058f\u0590\u0005\u0004\u0000"+
		"\u0000\u0590\u0592\u0001\u0000\u0000\u0000\u0591\u03af\u0001\u0000\u0000"+
		"\u0000\u0592\u0593\u0001\u0000\u0000\u0000\u0593\u0591\u0001\u0000\u0000"+
		"\u0000\u0593\u0594\u0001\u0000\u0000\u0000\u0594\u0595\u0001\u0000\u0000"+
		"\u0000\u0595\u0596\u0005\u0005\u0000\u0000\u0596\u0597\u0005\u0003\u0000"+
		"\u0000\u0597\u0598\u0005\n\u0000\u0000\u0598\u0599\u0005\u0003\u0000\u0000"+
		"\u0599\u059a\u0005\n\u0000\u0000\u059a\u059b\u0005\n\u0000\u0000\u059b"+
		"\u059c\u0005\n\u0000\u0000\u059c\u059d\u0005\n\u0000\u0000\u059d\u059e"+
		"\u0005\n\u0000\u0000\u059e\u059f\u0005\n\u0000\u0000\u059f\u05a0\u0005"+
		"\u0003\u0000\u0000\u05a0\u05a1\u0005\n\u0000\u0000\u05a1\u05a2\u0005\u0004"+
		"\u0000\u0000\u05a2\t\u0001\u0000\u0000\u0000\u05a3\u05a4\u0007\u0000\u0000"+
		"\u0000\u05a4\u000b\u0001\u0000\u0000\u0000\u05a5\u05a8\u0003\n\u0005\u0000"+
		"\u05a6\u05a8\u0005\u0003\u0000\u0000\u05a7\u05a5\u0001\u0000\u0000\u0000"+
		"\u05a7\u05a6\u0001\u0000\u0000\u0000\u05a8\u05a9\u0001\u0000\u0000\u0000"+
		"\u05a9\u05a7\u0001\u0000\u0000\u0000\u05a9\u05aa\u0001\u0000\u0000\u0000"+
		"\u05aa\u05ab\u0001\u0000\u0000\u0000\u05ab\u05ac\u0005\u0004\u0000\u0000"+
		"\u05ac\r\u0001\u0000\u0000\u0000\u05ad\u05b1\u0003\n\u0005\u0000\u05ae"+
		"\u05b1\u0005\u0003\u0000\u0000\u05af\u05b1\u0005\u0004\u0000\u0000\u05b0"+
		"\u05ad\u0001\u0000\u0000\u0000\u05b0\u05ae\u0001\u0000\u0000\u0000\u05b0"+
		"\u05af\u0001\u0000\u0000\u0000\u05b1\u05b2\u0001\u0000\u0000\u0000\u05b2"+
		"\u05b0\u0001\u0000\u0000\u0000\u05b2\u05b3\u0001\u0000\u0000\u0000\u05b3"+
		"\u000f\u0001\u0000\u0000\u0000=\u0014*\u00fe\u0102\u010d\u0135\u0138\u013b"+
		"\u013e\u0141\u0144\u0149\u0150\u017e\u0181\u0184\u0187\u018a\u018d\u0192"+
		"\u0199\u01a2\u01aa\u01af\u01e0\u0320\u0329\u032c\u032f\u0332\u0335\u0338"+
		"\u033d\u0348\u0363\u0370\u0387\u0392\u04e9\u04ec\u04ef\u04f2\u04f5\u04f8"+
		"\u04fd\u0509\u0512\u055f\u0562\u0565\u0568\u056b\u056e\u0573\u0586\u0588"+
		"\u0593\u05a7\u05a9\u05b0\u05b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}