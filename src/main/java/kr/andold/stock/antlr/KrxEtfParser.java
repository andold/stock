// Generated from C:\src\eclipse-workspace\stock\src\main\resources\grammar\KrxEtf.g4 by ANTLR 4.10.1
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
public class KrxEtfParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANK=1, BLANK_LINE=2, TAB=3, NEWLINE=4, KEYWORD=5, DATE=6, TIME=7, NUMBER=8, 
		STRING=9, WORD=10;
	public static final int
		RULE_krxEtfDocument = 0, RULE_krxPriceEtf = 1, RULE_krxItemInfoEtf = 2, 
		RULE_krxBasicInfoEtf = 3, RULE_etfAllPrice = 4, RULE_crawlPriceKrx = 5, 
		RULE_word = 6, RULE_line = 7, RULE_eof = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"krxEtfDocument", "krxPriceEtf", "krxItemInfoEtf", "krxBasicInfoEtf", 
			"etfAllPrice", "crawlPriceKrx", "word", "line", "eof"
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
	public String getGrammarFileName() { return "KrxEtf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private final Logger log = LoggerFactory.getLogger(getClass());

	public KrxEtfParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class KrxEtfDocumentContext extends ParserRuleContext {
		public CrawlPriceKrxContext crawlPriceKrx() {
			return getRuleContext(CrawlPriceKrxContext.class,0);
		}
		public EtfAllPriceContext etfAllPrice() {
			return getRuleContext(EtfAllPriceContext.class,0);
		}
		public KrxBasicInfoEtfContext krxBasicInfoEtf() {
			return getRuleContext(KrxBasicInfoEtfContext.class,0);
		}
		public KrxItemInfoEtfContext krxItemInfoEtf() {
			return getRuleContext(KrxItemInfoEtfContext.class,0);
		}
		public KrxPriceEtfContext krxPriceEtf() {
			return getRuleContext(KrxPriceEtfContext.class,0);
		}
		public KrxEtfDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_krxEtfDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrxEtfListener ) ((KrxEtfListener)listener).enterKrxEtfDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrxEtfListener ) ((KrxEtfListener)listener).exitKrxEtfDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrxEtfVisitor ) return ((KrxEtfVisitor<? extends T>)visitor).visitKrxEtfDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KrxEtfDocumentContext krxEtfDocument() throws RecognitionException {
		KrxEtfDocumentContext _localctx = new KrxEtfDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_krxEtfDocument);
		try {
			setState(23);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				crawlPriceKrx();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				etfAllPrice();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				krxBasicInfoEtf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(21);
				krxItemInfoEtf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(22);
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
		public List<TerminalNode> KEYWORD() { return getTokens(KrxEtfParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(KrxEtfParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(KrxEtfParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(KrxEtfParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(KrxEtfParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(KrxEtfParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(KrxEtfParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KrxEtfParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(KrxEtfParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(KrxEtfParser.DATE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(KrxEtfParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(KrxEtfParser.NUMBER, i);
		}
		public KrxPriceEtfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_krxPriceEtf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrxEtfListener ) ((KrxEtfListener)listener).enterKrxPriceEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrxEtfListener ) ((KrxEtfListener)listener).exitKrxPriceEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrxEtfVisitor ) return ((KrxEtfVisitor<? extends T>)visitor).visitKrxPriceEtf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KrxPriceEtfContext krxPriceEtf() throws RecognitionException {
		KrxPriceEtfContext _localctx = new KrxPriceEtfContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_krxPriceEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(KEYWORD);
			setState(26);
			match(TAB);
			setState(27);
			match(WORD);
			setState(28);
			match(TAB);
			setState(29);
			match(WORD);
			setState(30);
			match(WORD);
			setState(31);
			match(WORD);
			setState(32);
			match(WORD);
			setState(33);
			match(WORD);
			setState(34);
			match(WORD);
			setState(35);
			match(WORD);
			setState(36);
			match(TAB);
			setState(37);
			match(WORD);
			setState(38);
			match(NEWLINE);
			setState(155); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(144); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(39);
							word();
							setState(40);
							match(TAB);
							setState(41);
							match(NEWLINE);
							setState(48); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(42);
									word();
									setState(43);
									match(TAB);
									setState(44);
									match(TAB);
									setState(45);
									match(TAB);
									setState(46);
									match(NEWLINE);
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(50); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(52);
							word();
							setState(53);
							match(TAB);
							setState(54);
							match(TAB);
							setState(55);
							match(TAB);
							setState(56);
							match(WORD);
							setState(57);
							match(NEWLINE);
							setState(58);
							word();
							setState(59);
							match(TAB);
							setState(60);
							match(TAB);
							setState(61);
							match(TAB);
							setState(62);
							match(NEWLINE);
							setState(140); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(63);
									((KrxPriceEtfContext)_localctx).code = word();
									setState(64);
									match(TAB);
									setState(65);
									((KrxPriceEtfContext)_localctx).base = match(DATE);
									setState(66);
									match(NEWLINE);
									setState(67);
									word();
									setState(68);
									match(TAB);
									setState(69);
									((KrxPriceEtfContext)_localctx).closing = match(NUMBER);
									setState(70);
									match(NEWLINE);
									setState(71);
									word();
									setState(72);
									match(TAB);
									setState(73);
									match(NUMBER);
									setState(74);
									match(NEWLINE);
									setState(75);
									word();
									setState(76);
									match(TAB);
									setState(77);
									match(NUMBER);
									setState(78);
									match(NEWLINE);
									setState(79);
									word();
									setState(80);
									match(TAB);
									setState(81);
									((KrxPriceEtfContext)_localctx).nav = match(NUMBER);
									setState(82);
									match(NEWLINE);
									setState(83);
									word();
									setState(84);
									match(TAB);
									setState(85);
									((KrxPriceEtfContext)_localctx).market = match(NUMBER);
									setState(86);
									match(NEWLINE);
									setState(87);
									word();
									setState(88);
									match(TAB);
									setState(89);
									((KrxPriceEtfContext)_localctx).high = match(NUMBER);
									setState(90);
									match(NEWLINE);
									setState(91);
									word();
									setState(92);
									match(TAB);
									setState(93);
									((KrxPriceEtfContext)_localctx).low = match(NUMBER);
									setState(94);
									match(NEWLINE);
									setState(95);
									word();
									setState(96);
									match(TAB);
									setState(97);
									((KrxPriceEtfContext)_localctx).volume = match(NUMBER);
									setState(98);
									match(NEWLINE);
									setState(99);
									word();
									setState(100);
									match(TAB);
									setState(101);
									match(NUMBER);
									setState(102);
									match(NEWLINE);
									setState(103);
									word();
									setState(104);
									match(TAB);
									setState(105);
									match(NUMBER);
									setState(106);
									match(NEWLINE);
									setState(107);
									word();
									setState(108);
									match(TAB);
									setState(109);
									match(NUMBER);
									setState(110);
									match(NEWLINE);
									setState(111);
									word();
									setState(112);
									match(TAB);
									setState(113);
									((KrxPriceEtfContext)_localctx).volumeOfListedShares = match(NUMBER);
									setState(114);
									match(NEWLINE);
									setState(115);
									word();
									setState(116);
									match(TAB);
									setState(118); 
									_errHandler.sync(this);
									_la = _input.LA(1);
									do {
										{
										{
										setState(117);
										word();
										}
										}
										setState(120); 
										_errHandler.sync(this);
										_la = _input.LA(1);
									} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
									setState(122);
									match(NEWLINE);
									setState(123);
									word();
									setState(124);
									match(TAB);
									setState(125);
									word();
									setState(126);
									match(NEWLINE);
									setState(127);
									word();
									setState(128);
									match(TAB);
									setState(129);
									word();
									setState(130);
									match(NEWLINE);
									setState(131);
									word();
									setState(132);
									match(TAB);
									setState(133);
									word();
									setState(134);
									match(NEWLINE);
									setState(135);
									word();
									setState(136);
									match(TAB);
									setState(137);
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
								setState(142); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(146); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(148);
					match(WORD);
					setState(149);
					match(TAB);
					setState(150);
					match(WORD);
					setState(151);
					match(TAB);
					setState(152);
					match(DATE);
					setState(153);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(157); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(159);
			match(KEYWORD);
			setState(160);
			match(TAB);
			setState(161);
			match(WORD);
			setState(162);
			match(TAB);
			setState(163);
			match(WORD);
			setState(164);
			match(WORD);
			setState(165);
			match(WORD);
			setState(166);
			match(WORD);
			setState(167);
			match(WORD);
			setState(168);
			match(WORD);
			setState(169);
			match(WORD);
			setState(170);
			match(TAB);
			setState(171);
			match(WORD);
			setState(172);
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
		public List<TerminalNode> KEYWORD() { return getTokens(KrxEtfParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(KrxEtfParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(KrxEtfParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(KrxEtfParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(KrxEtfParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(KrxEtfParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(KrxEtfParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KrxEtfParser.NEWLINE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(KrxEtfParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(KrxEtfParser.NUMBER, i);
		}
		public List<TerminalNode> DATE() { return getTokens(KrxEtfParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(KrxEtfParser.DATE, i);
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
			if ( listener instanceof KrxEtfListener ) ((KrxEtfListener)listener).enterKrxItemInfoEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrxEtfListener ) ((KrxEtfListener)listener).exitKrxItemInfoEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrxEtfVisitor ) return ((KrxEtfVisitor<? extends T>)visitor).visitKrxItemInfoEtf(this);
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
			setState(174);
			match(KEYWORD);
			setState(175);
			match(TAB);
			setState(176);
			match(WORD);
			setState(177);
			match(TAB);
			setState(178);
			match(WORD);
			setState(179);
			match(WORD);
			setState(180);
			match(WORD);
			setState(181);
			match(WORD);
			setState(182);
			match(WORD);
			setState(183);
			match(WORD);
			setState(184);
			match(TAB);
			setState(185);
			match(WORD);
			setState(186);
			match(NEWLINE);
			setState(187);
			match(KEYWORD);
			setState(188);
			match(TAB);
			setState(189);
			((KrxItemInfoEtfContext)_localctx).symbol = word();
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(190);
				((KrxItemInfoEtfContext)_localctx).symbol1 = word();
				}
				break;
			}
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(193);
				((KrxItemInfoEtfContext)_localctx).symbol2 = word();
				}
				break;
			}
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(196);
				((KrxItemInfoEtfContext)_localctx).symbol3 = word();
				}
				break;
			}
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(199);
				((KrxItemInfoEtfContext)_localctx).symbol4 = word();
				}
				break;
			}
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(202);
				((KrxItemInfoEtfContext)_localctx).symbol5 = word();
				}
				break;
			}
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(205);
				((KrxItemInfoEtfContext)_localctx).symbol6 = word();
				}
				break;
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(208);
				((KrxItemInfoEtfContext)_localctx).symbol7 = word();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(NEWLINE);
			setState(215);
			match(WORD);
			setState(216);
			match(TAB);
			setState(217);
			match(WORD);
			setState(218);
			match(TAB);
			setState(220); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(219);
				word();
				}
				}
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(224);
			match(TAB);
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(225);
				word();
				}
				}
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(230);
			match(TAB);
			setState(231);
			match(NEWLINE);
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
			((KrxItemInfoEtfContext)_localctx).code = word();
			setState(239);
			match(TAB);
			setState(240);
			match(NEWLINE);
			setState(241);
			match(WORD);
			setState(242);
			match(TAB);
			setState(243);
			match(WORD);
			setState(244);
			match(TAB);
			setState(246); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(245);
				word();
				}
				}
				setState(248); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(250);
			match(TAB);
			setState(252); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(251);
				word();
				}
				}
				setState(254); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
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
			match(NUMBER);
			setState(263);
			match(TAB);
			setState(264);
			((KrxItemInfoEtfContext)_localctx).volumeOfListedShares = match(NUMBER);
			setState(265);
			match(TAB);
			setState(266);
			match(NEWLINE);
			setState(267);
			match(WORD);
			setState(268);
			match(TAB);
			setState(269);
			match(WORD);
			setState(270);
			match(TAB);
			setState(271);
			match(NUMBER);
			setState(272);
			match(TAB);
			setState(273);
			((KrxItemInfoEtfContext)_localctx).ipo = match(DATE);
			setState(274);
			match(TAB);
			setState(275);
			match(NEWLINE);
			setState(276);
			match(WORD);
			setState(277);
			match(TAB);
			setState(278);
			match(WORD);
			setState(279);
			match(TAB);
			setState(280);
			match(WORD);
			setState(281);
			match(TAB);
			setState(282);
			match(WORD);
			setState(283);
			match(TAB);
			setState(284);
			match(NEWLINE);
			setState(285);
			match(WORD);
			setState(286);
			match(TAB);
			setState(287);
			match(WORD);
			setState(288);
			match(TAB);
			setState(289);
			match(WORD);
			setState(290);
			match(TAB);
			setState(291);
			match(WORD);
			setState(292);
			match(TAB);
			setState(293);
			match(NEWLINE);
			setState(294);
			match(WORD);
			setState(295);
			match(TAB);
			setState(296);
			match(WORD);
			setState(297);
			match(TAB);
			setState(298);
			match(WORD);
			setState(299);
			match(TAB);
			setState(300);
			((KrxItemInfoEtfContext)_localctx).category = word();
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(301);
				((KrxItemInfoEtfContext)_localctx).category1 = word();
				}
				break;
			}
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(304);
				((KrxItemInfoEtfContext)_localctx).category2 = word();
				}
				break;
			}
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(307);
				((KrxItemInfoEtfContext)_localctx).category3 = word();
				}
				break;
			}
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(310);
				((KrxItemInfoEtfContext)_localctx).category4 = word();
				}
				break;
			}
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(313);
				((KrxItemInfoEtfContext)_localctx).category5 = word();
				}
				break;
			}
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(316);
				((KrxItemInfoEtfContext)_localctx).category6 = word();
				}
				break;
			}
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				{
				setState(319);
				((KrxItemInfoEtfContext)_localctx).category7 = word();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			match(TAB);
			setState(326);
			match(NEWLINE);
			setState(327);
			match(WORD);
			setState(328);
			match(WORD);
			setState(329);
			match(TAB);
			setState(331); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(330);
				word();
				}
				}
				setState(333); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(335);
			match(TAB);
			setState(336);
			match(NEWLINE);
			setState(337);
			match(WORD);
			setState(338);
			match(TAB);
			setState(340); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(339);
				word();
				}
				}
				setState(342); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(344);
			match(TAB);
			setState(345);
			match(NEWLINE);
			setState(346);
			match(WORD);
			setState(347);
			match(TAB);
			setState(348);
			match(WORD);
			setState(349);
			match(TAB);
			setState(350);
			match(DATE);
			setState(351);
			match(NEWLINE);
			setState(352);
			match(KEYWORD);
			setState(353);
			match(TAB);
			setState(354);
			match(WORD);
			setState(355);
			match(TAB);
			setState(356);
			match(WORD);
			setState(357);
			match(WORD);
			setState(358);
			match(WORD);
			setState(359);
			match(WORD);
			setState(360);
			match(WORD);
			setState(361);
			match(WORD);
			setState(362);
			match(TAB);
			setState(363);
			match(WORD);
			setState(364);
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
		public List<TerminalNode> KEYWORD() { return getTokens(KrxEtfParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(KrxEtfParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(KrxEtfParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(KrxEtfParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(KrxEtfParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(KrxEtfParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(KrxEtfParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KrxEtfParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(KrxEtfParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(KrxEtfParser.DATE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(KrxEtfParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(KrxEtfParser.NUMBER, i);
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
			if ( listener instanceof KrxEtfListener ) ((KrxEtfListener)listener).enterKrxBasicInfoEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrxEtfListener ) ((KrxEtfListener)listener).exitKrxBasicInfoEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrxEtfVisitor ) return ((KrxEtfVisitor<? extends T>)visitor).visitKrxBasicInfoEtf(this);
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
			setState(367);
			match(KEYWORD);
			setState(368);
			match(TAB);
			setState(369);
			match(WORD);
			setState(370);
			match(TAB);
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
			match(WORD);
			setState(379);
			match(NEWLINE);
			setState(552); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(380);
				match(WORD);
				setState(381);
				match(TAB);
				setState(382);
				match(NEWLINE);
				setState(388); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(383);
						match(WORD);
						setState(384);
						match(TAB);
						setState(385);
						match(TAB);
						setState(386);
						match(TAB);
						setState(387);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(390); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(392);
				match(WORD);
				setState(393);
				match(TAB);
				setState(394);
				match(TAB);
				setState(395);
				match(TAB);
				setState(396);
				match(WORD);
				setState(397);
				match(NEWLINE);
				setState(398);
				match(WORD);
				setState(399);
				match(TAB);
				setState(400);
				match(TAB);
				setState(401);
				match(TAB);
				setState(402);
				match(NEWLINE);
				setState(541); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						{
						setState(403);
						match(WORD);
						setState(404);
						match(TAB);
						setState(405);
						match(WORD);
						setState(406);
						match(NEWLINE);
						setState(407);
						match(WORD);
						setState(408);
						match(TAB);
						setState(409);
						((KrxBasicInfoEtfContext)_localctx).code = word();
						setState(410);
						match(NEWLINE);
						setState(411);
						match(WORD);
						setState(412);
						match(TAB);
						setState(413);
						match(NEWLINE);
						setState(414);
						match(WORD);
						setState(415);
						match(TAB);
						setState(416);
						match(TAB);
						setState(418); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(417);
							word();
							}
							}
							setState(420); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(422);
						match(NEWLINE);
						setState(423);
						match(WORD);
						setState(424);
						match(TAB);
						setState(425);
						match(TAB);
						setState(426);
						((KrxBasicInfoEtfContext)_localctx).symbol = word();
						setState(428);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
						case 1:
							{
							setState(427);
							((KrxBasicInfoEtfContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(431);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
						case 1:
							{
							setState(430);
							((KrxBasicInfoEtfContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(434);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
						case 1:
							{
							setState(433);
							((KrxBasicInfoEtfContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(437);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
						case 1:
							{
							setState(436);
							((KrxBasicInfoEtfContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(440);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
						case 1:
							{
							setState(439);
							((KrxBasicInfoEtfContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(443);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(442);
							((KrxBasicInfoEtfContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(448);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(445);
							((KrxBasicInfoEtfContext)_localctx).symbol7 = word();
							}
							}
							setState(450);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(451);
						match(NEWLINE);
						setState(452);
						match(WORD);
						setState(453);
						match(TAB);
						setState(454);
						match(NEWLINE);
						setState(455);
						match(WORD);
						setState(456);
						match(TAB);
						setState(458); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(457);
							word();
							}
							}
							setState(460); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(462);
						match(NEWLINE);
						setState(463);
						match(WORD);
						setState(464);
						match(TAB);
						setState(465);
						((KrxBasicInfoEtfContext)_localctx).ipo = match(DATE);
						setState(466);
						match(NEWLINE);
						setState(467);
						match(WORD);
						setState(468);
						match(TAB);
						setState(470); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(469);
							word();
							}
							}
							setState(472); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(474);
						match(NEWLINE);
						setState(475);
						match(WORD);
						setState(476);
						match(TAB);
						setState(478); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(477);
							word();
							}
							}
							setState(480); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(482);
						match(NEWLINE);
						setState(483);
						match(WORD);
						setState(484);
						match(TAB);
						setState(486); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(485);
							word();
							}
							}
							setState(488); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(490);
						match(NEWLINE);
						setState(491);
						match(WORD);
						setState(492);
						match(TAB);
						setState(493);
						match(WORD);
						setState(494);
						match(NEWLINE);
						setState(495);
						match(WORD);
						setState(496);
						match(TAB);
						setState(497);
						match(NEWLINE);
						setState(498);
						match(WORD);
						setState(499);
						match(TAB);
						setState(500);
						match(TAB);
						setState(501);
						match(WORD);
						setState(502);
						match(NEWLINE);
						setState(503);
						match(WORD);
						setState(504);
						match(TAB);
						setState(505);
						match(TAB);
						setState(506);
						match(WORD);
						setState(507);
						match(NEWLINE);
						setState(508);
						match(WORD);
						setState(509);
						match(TAB);
						setState(510);
						match(TAB);
						setState(511);
						match(NEWLINE);
						setState(512);
						match(WORD);
						setState(513);
						match(TAB);
						setState(514);
						((KrxBasicInfoEtfContext)_localctx).volumeOfListedShares = match(NUMBER);
						setState(515);
						match(NEWLINE);
						setState(516);
						match(WORD);
						setState(517);
						match(TAB);
						setState(519); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(518);
							word();
							}
							}
							setState(521); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(523);
						match(NEWLINE);
						setState(524);
						match(WORD);
						setState(525);
						match(TAB);
						setState(526);
						match(NUMBER);
						setState(527);
						match(NEWLINE);
						setState(528);
						match(WORD);
						setState(529);
						match(TAB);
						setState(530);
						((KrxBasicInfoEtfContext)_localctx).fee = match(NUMBER);
						setState(531);
						match(NEWLINE);
						setState(532);
						match(WORD);
						setState(533);
						match(TAB);
						setState(534);
						match(WORD);
						setState(535);
						match(NEWLINE);
						setState(536);
						match(WORD);
						setState(537);
						match(TAB);
						setState(538);
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
					setState(543); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
			} while ( _la==WORD );
			setState(556);
			match(KEYWORD);
			setState(557);
			match(TAB);
			setState(558);
			match(WORD);
			setState(559);
			match(TAB);
			setState(560);
			match(WORD);
			setState(561);
			match(WORD);
			setState(562);
			match(WORD);
			setState(563);
			match(WORD);
			setState(564);
			match(WORD);
			setState(565);
			match(WORD);
			setState(566);
			match(TAB);
			setState(567);
			match(WORD);
			setState(568);
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
		public List<TerminalNode> KEYWORD() { return getTokens(KrxEtfParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(KrxEtfParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(KrxEtfParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(KrxEtfParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(KrxEtfParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(KrxEtfParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(KrxEtfParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KrxEtfParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(KrxEtfParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(KrxEtfParser.DATE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(KrxEtfParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(KrxEtfParser.NUMBER, i);
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
			if ( listener instanceof KrxEtfListener ) ((KrxEtfListener)listener).enterEtfAllPrice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrxEtfListener ) ((KrxEtfListener)listener).exitEtfAllPrice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrxEtfVisitor ) return ((KrxEtfVisitor<? extends T>)visitor).visitEtfAllPrice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EtfAllPriceContext etfAllPrice() throws RecognitionException {
		EtfAllPriceContext _localctx = new EtfAllPriceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_etfAllPrice);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(KEYWORD);
			setState(571);
			match(TAB);
			setState(572);
			match(WORD);
			setState(573);
			match(TAB);
			setState(574);
			match(WORD);
			setState(575);
			match(WORD);
			setState(576);
			match(WORD);
			setState(577);
			match(WORD);
			setState(578);
			match(TAB);
			setState(579);
			match(WORD);
			setState(580);
			match(NEWLINE);
			setState(801); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(586); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(581);
						match(WORD);
						setState(582);
						match(TAB);
						setState(583);
						match(DATE);
						setState(584);
						match(TAB);
						setState(585);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(588); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(590);
				match(WORD);
				setState(591);
				match(TAB);
				setState(592);
				match(DATE);
				setState(593);
				match(TAB);
				setState(594);
				match(WORD);
				setState(595);
				match(NEWLINE);
				setState(596);
				match(WORD);
				setState(597);
				match(TAB);
				setState(598);
				match(DATE);
				setState(599);
				match(TAB);
				setState(600);
				match(NEWLINE);
				setState(790); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(790);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
						case 1:
							{
							{
							setState(601);
							match(WORD);
							setState(602);
							match(TAB);
							setState(603);
							match(DATE);
							setState(604);
							match(TAB);
							setState(605);
							((EtfAllPriceContext)_localctx).code = word();
							setState(606);
							match(NEWLINE);
							setState(607);
							match(WORD);
							setState(608);
							match(TAB);
							setState(609);
							match(DATE);
							setState(610);
							match(TAB);
							setState(611);
							((EtfAllPriceContext)_localctx).symbol = word();
							setState(613);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
							case 1:
								{
								setState(612);
								((EtfAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(616);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
							case 1:
								{
								setState(615);
								((EtfAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(619);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
							case 1:
								{
								setState(618);
								((EtfAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(622);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
							case 1:
								{
								setState(621);
								((EtfAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(625);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
							case 1:
								{
								setState(624);
								((EtfAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(628);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
							case 1:
								{
								setState(627);
								((EtfAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(633);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(630);
								((EtfAllPriceContext)_localctx).symbol7 = word();
								}
								}
								setState(635);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
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
							((EtfAllPriceContext)_localctx).closing = match(NUMBER);
							setState(642);
							match(NEWLINE);
							setState(643);
							match(WORD);
							setState(644);
							match(TAB);
							setState(645);
							match(DATE);
							setState(646);
							match(TAB);
							setState(647);
							match(NUMBER);
							setState(648);
							match(NEWLINE);
							setState(649);
							match(WORD);
							setState(650);
							match(TAB);
							setState(651);
							match(DATE);
							setState(652);
							match(TAB);
							setState(653);
							match(NUMBER);
							setState(654);
							match(NEWLINE);
							setState(655);
							match(WORD);
							setState(656);
							match(TAB);
							setState(657);
							match(DATE);
							setState(658);
							match(TAB);
							setState(659);
							match(NUMBER);
							setState(660);
							match(NEWLINE);
							setState(661);
							match(WORD);
							setState(662);
							match(TAB);
							setState(663);
							match(DATE);
							setState(664);
							match(TAB);
							setState(665);
							((EtfAllPriceContext)_localctx).market = match(NUMBER);
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
							((EtfAllPriceContext)_localctx).high = match(NUMBER);
							setState(672);
							match(NEWLINE);
							setState(673);
							match(WORD);
							setState(674);
							match(TAB);
							setState(675);
							match(DATE);
							setState(676);
							match(TAB);
							setState(677);
							((EtfAllPriceContext)_localctx).low = match(NUMBER);
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
							setState(683);
							((EtfAllPriceContext)_localctx).volume = match(NUMBER);
							setState(684);
							match(NEWLINE);
							setState(685);
							match(WORD);
							setState(686);
							match(TAB);
							setState(687);
							match(DATE);
							setState(688);
							match(TAB);
							setState(689);
							match(NUMBER);
							setState(690);
							match(NEWLINE);
							setState(691);
							match(WORD);
							setState(692);
							match(TAB);
							setState(693);
							match(DATE);
							setState(694);
							match(TAB);
							setState(695);
							match(NUMBER);
							setState(696);
							match(NEWLINE);
							setState(697);
							match(WORD);
							setState(698);
							match(TAB);
							setState(699);
							match(DATE);
							setState(700);
							match(TAB);
							setState(701);
							match(NUMBER);
							setState(702);
							match(NEWLINE);
							setState(703);
							match(WORD);
							setState(704);
							match(TAB);
							setState(705);
							match(DATE);
							setState(706);
							match(TAB);
							setState(707);
							((EtfAllPriceContext)_localctx).volumeOfListedShares = match(NUMBER);
							setState(708);
							match(NEWLINE);
							setState(709);
							match(WORD);
							setState(710);
							match(TAB);
							setState(711);
							match(DATE);
							setState(712);
							match(TAB);
							setState(714); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(713);
								word();
								}
								}
								setState(716); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
							setState(718);
							match(NEWLINE);
							setState(719);
							match(WORD);
							setState(720);
							match(TAB);
							setState(721);
							match(DATE);
							setState(722);
							match(TAB);
							setState(723);
							word();
							setState(724);
							match(NEWLINE);
							setState(725);
							match(WORD);
							setState(726);
							match(TAB);
							setState(727);
							match(DATE);
							setState(728);
							match(TAB);
							setState(729);
							word();
							setState(730);
							match(NEWLINE);
							setState(731);
							match(WORD);
							setState(732);
							match(TAB);
							setState(733);
							match(DATE);
							setState(734);
							match(TAB);
							setState(735);
							word();
							setState(736);
							match(NEWLINE);
							setState(737);
							match(WORD);
							setState(738);
							match(TAB);
							setState(739);
							((EtfAllPriceContext)_localctx).base = match(DATE);
							setState(740);
							match(TAB);
							setState(741);
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
							setState(744);
							match(WORD);
							setState(745);
							match(TAB);
							setState(746);
							match(DATE);
							setState(747);
							match(TAB);
							setState(748);
							word();
							setState(749);
							((EtfAllPriceContext)_localctx).symbol = word();
							setState(751);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
							case 1:
								{
								setState(750);
								((EtfAllPriceContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(754);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
							case 1:
								{
								setState(753);
								((EtfAllPriceContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(757);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
							case 1:
								{
								setState(756);
								((EtfAllPriceContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(760);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
							case 1:
								{
								setState(759);
								((EtfAllPriceContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(763);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
							case 1:
								{
								setState(762);
								((EtfAllPriceContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(766);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
							case 1:
								{
								setState(765);
								((EtfAllPriceContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(771);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(768);
									((EtfAllPriceContext)_localctx).symbol7 = word();
									}
									} 
								}
								setState(773);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
							}
							setState(774);
							((EtfAllPriceContext)_localctx).closing = match(NUMBER);
							setState(775);
							match(NEWLINE);
							setState(776);
							match(WORD);
							setState(777);
							match(TAB);
							setState(778);
							((EtfAllPriceContext)_localctx).base = match(DATE);
							setState(779);
							match(TAB);
							setState(780);
							match(NUMBER);
							setState(781);
							match(NUMBER);
							setState(782);
							match(NUMBER);
							setState(783);
							match(NUMBER);
							setState(784);
							match(NUMBER);
							setState(785);
							match(NUMBER);
							setState(786);
							match(NUMBER);
							setState(787);
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
					setState(792); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
				setState(803); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
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
			match(TAB);
			setState(814);
			match(WORD);
			setState(815);
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
		public List<TerminalNode> KEYWORD() { return getTokens(KrxEtfParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(KrxEtfParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(KrxEtfParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(KrxEtfParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(KrxEtfParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(KrxEtfParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(KrxEtfParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KrxEtfParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(KrxEtfParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(KrxEtfParser.DATE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(KrxEtfParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(KrxEtfParser.NUMBER, i);
		}
		public CrawlPriceKrxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crawlPriceKrx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrxEtfListener ) ((KrxEtfListener)listener).enterCrawlPriceKrx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrxEtfListener ) ((KrxEtfListener)listener).exitCrawlPriceKrx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrxEtfVisitor ) return ((KrxEtfVisitor<? extends T>)visitor).visitCrawlPriceKrx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlPriceKrxContext crawlPriceKrx() throws RecognitionException {
		CrawlPriceKrxContext _localctx = new CrawlPriceKrxContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_crawlPriceKrx);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(KEYWORD);
			setState(818);
			match(TAB);
			setState(819);
			match(WORD);
			setState(820);
			match(TAB);
			setState(821);
			match(WORD);
			setState(822);
			match(TAB);
			setState(823);
			match(WORD);
			setState(824);
			match(NEWLINE);
			setState(1013); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1013);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						{
						setState(825);
						word();
						setState(826);
						match(TAB);
						setState(827);
						match(WORD);
						setState(828);
						match(WORD);
						setState(829);
						match(TAB);
						setState(830);
						match(NEWLINE);
						}
						}
						break;
					case 2:
						{
						setState(1002); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1000);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
								case 1:
									{
									{
									setState(832);
									match(WORD);
									setState(833);
									match(TAB);
									setState(834);
									word();
									setState(835);
									match(TAB);
									setState(836);
									match(WORD);
									setState(837);
									match(TAB);
									setState(838);
									match(WORD);
									setState(839);
									match(TAB);
									setState(840);
									match(WORD);
									setState(841);
									match(TAB);
									setState(842);
									match(WORD);
									setState(843);
									match(TAB);
									setState(844);
									match(WORD);
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
									match(WORD);
									setState(851);
									match(TAB);
									setState(852);
									match(WORD);
									setState(853);
									match(TAB);
									setState(854);
									match(WORD);
									setState(855);
									match(TAB);
									setState(856);
									match(WORD);
									setState(857);
									match(TAB);
									setState(858);
									match(NEWLINE);
									setState(888); 
									_errHandler.sync(this);
									_alt = 1;
									do {
										switch (_alt) {
										case 1:
											{
											{
											setState(859);
											match(WORD);
											setState(860);
											match(TAB);
											setState(861);
											((CrawlPriceKrxContext)_localctx).code = word();
											setState(862);
											match(TAB);
											setState(863);
											((CrawlPriceKrxContext)_localctx).base = match(DATE);
											setState(864);
											match(TAB);
											setState(865);
											((CrawlPriceKrxContext)_localctx).closing = match(NUMBER);
											setState(866);
											match(TAB);
											setState(867);
											match(NUMBER);
											setState(868);
											match(TAB);
											setState(869);
											match(NUMBER);
											setState(870);
											match(TAB);
											setState(871);
											((CrawlPriceKrxContext)_localctx).market = match(NUMBER);
											setState(872);
											match(TAB);
											setState(873);
											((CrawlPriceKrxContext)_localctx).high = match(NUMBER);
											setState(874);
											match(TAB);
											setState(875);
											((CrawlPriceKrxContext)_localctx).low = match(NUMBER);
											setState(876);
											match(TAB);
											setState(877);
											((CrawlPriceKrxContext)_localctx).volume = match(NUMBER);
											setState(878);
											match(TAB);
											setState(879);
											match(NUMBER);
											setState(880);
											match(TAB);
											setState(881);
											match(NUMBER);
											setState(882);
											match(TAB);
											setState(883);
											match(NUMBER);
											setState(884);
											match(TAB);
											setState(885);
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
										setState(890); 
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
									} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
									}
									}
									break;
								case 2:
									{
									{
									setState(892);
									match(WORD);
									setState(893);
									match(TAB);
									setState(894);
									word();
									setState(895);
									match(TAB);
									setState(896);
									match(WORD);
									setState(897);
									match(TAB);
									setState(898);
									match(WORD);
									setState(899);
									match(TAB);
									setState(900);
									match(WORD);
									setState(901);
									match(TAB);
									setState(902);
									match(WORD);
									setState(903);
									match(TAB);
									setState(904);
									match(WORD);
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
									match(NEWLINE);
									setState(996); 
									_errHandler.sync(this);
									_alt = 1;
									do {
										switch (_alt) {
										case 1:
											{
											{
											setState(931);
											match(WORD);
											setState(932);
											match(TAB);
											setState(933);
											((CrawlPriceKrxContext)_localctx).code = word();
											setState(934);
											match(TAB);
											setState(935);
											((CrawlPriceKrxContext)_localctx).base = match(DATE);
											setState(936);
											match(TAB);
											setState(937);
											((CrawlPriceKrxContext)_localctx).closing = match(NUMBER);
											setState(938);
											match(TAB);
											setState(939);
											match(NUMBER);
											setState(940);
											match(TAB);
											setState(941);
											match(NUMBER);
											setState(942);
											match(TAB);
											setState(943);
											match(NUMBER);
											setState(944);
											match(TAB);
											setState(945);
											((CrawlPriceKrxContext)_localctx).market = match(NUMBER);
											setState(946);
											match(TAB);
											setState(947);
											((CrawlPriceKrxContext)_localctx).high = match(NUMBER);
											setState(948);
											match(TAB);
											setState(949);
											((CrawlPriceKrxContext)_localctx).low = match(NUMBER);
											setState(950);
											match(TAB);
											setState(951);
											((CrawlPriceKrxContext)_localctx).volume = match(NUMBER);
											setState(952);
											match(TAB);
											setState(953);
											match(NUMBER);
											setState(954);
											match(TAB);
											setState(955);
											match(NUMBER);
											setState(956);
											match(TAB);
											setState(957);
											match(NUMBER);
											setState(958);
											match(TAB);
											setState(959);
											match(NUMBER);
											setState(960);
											match(TAB);
											setState(961);
											((CrawlPriceKrxContext)_localctx).symbol = word();
											setState(963);
											_errHandler.sync(this);
											switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
											case 1:
												{
												setState(962);
												((CrawlPriceKrxContext)_localctx).symbol1 = word();
												}
												break;
											}
											setState(966);
											_errHandler.sync(this);
											switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
											case 1:
												{
												setState(965);
												((CrawlPriceKrxContext)_localctx).symbol2 = word();
												}
												break;
											}
											setState(969);
											_errHandler.sync(this);
											switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
											case 1:
												{
												setState(968);
												((CrawlPriceKrxContext)_localctx).symbol3 = word();
												}
												break;
											}
											setState(972);
											_errHandler.sync(this);
											switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
											case 1:
												{
												setState(971);
												((CrawlPriceKrxContext)_localctx).symbol4 = word();
												}
												break;
											}
											setState(975);
											_errHandler.sync(this);
											switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
											case 1:
												{
												setState(974);
												((CrawlPriceKrxContext)_localctx).symbol5 = word();
												}
												break;
											}
											setState(978);
											_errHandler.sync(this);
											switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
											case 1:
												{
												setState(977);
												((CrawlPriceKrxContext)_localctx).symbol6 = word();
												}
												break;
											}
											setState(983);
											_errHandler.sync(this);
											_la = _input.LA(1);
											while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
												{
												{
												setState(980);
												((CrawlPriceKrxContext)_localctx).symbol7 = word();
												}
												}
												setState(985);
												_errHandler.sync(this);
												_la = _input.LA(1);
											}
											setState(986);
											match(TAB);
											setState(987);
											match(NUMBER);
											setState(988);
											match(TAB);
											setState(989);
											match(NUMBER);
											setState(990);
											match(TAB);
											setState(991);
											match(NUMBER);
											setState(992);
											match(TAB);
											setState(993);
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
										setState(998); 
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
							setState(1004); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(1006);
						match(WORD);
						setState(1007);
						match(TAB);
						setState(1008);
						match(WORD);
						setState(1009);
						match(TAB);
						setState(1010);
						match(DATE);
						setState(1011);
						match(NEWLINE);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1015); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1017);
			match(KEYWORD);
			setState(1018);
			match(TAB);
			setState(1019);
			match(WORD);
			setState(1020);
			match(TAB);
			setState(1021);
			match(WORD);
			setState(1022);
			match(TAB);
			setState(1023);
			match(WORD);
			setState(1024);
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
		public TerminalNode WORD() { return getToken(KrxEtfParser.WORD, 0); }
		public TerminalNode KEYWORD() { return getToken(KrxEtfParser.KEYWORD, 0); }
		public TerminalNode NUMBER() { return getToken(KrxEtfParser.NUMBER, 0); }
		public TerminalNode TIME() { return getToken(KrxEtfParser.TIME, 0); }
		public TerminalNode DATE() { return getToken(KrxEtfParser.DATE, 0); }
		public TerminalNode STRING() { return getToken(KrxEtfParser.STRING, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrxEtfListener ) ((KrxEtfListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrxEtfListener ) ((KrxEtfListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrxEtfVisitor ) return ((KrxEtfVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
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
		public TerminalNode NEWLINE() { return getToken(KrxEtfParser.NEWLINE, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> TAB() { return getTokens(KrxEtfParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(KrxEtfParser.TAB, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrxEtfListener ) ((KrxEtfListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrxEtfListener ) ((KrxEtfListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrxEtfVisitor ) return ((KrxEtfVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1030);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(1028);
					word();
					}
					break;
				case TAB:
					{
					setState(1029);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1032); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(1034);
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
		public List<TerminalNode> TAB() { return getTokens(KrxEtfParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(KrxEtfParser.TAB, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(KrxEtfParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(KrxEtfParser.NEWLINE, i);
		}
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrxEtfListener ) ((KrxEtfListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrxEtfListener ) ((KrxEtfListener)listener).exitEof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrxEtfVisitor ) return ((KrxEtfVisitor<? extends T>)visitor).visitEof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_eof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1039);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(1036);
					word();
					}
					break;
				case TAB:
					{
					setState(1037);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(1038);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1041); 
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
		"\u0004\u0001\n\u0414\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000\u0018\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u00011\b\u0001\u000b\u0001\f\u00012\u0001\u0001\u0001"+
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
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001w\b"+
		"\u0001\u000b\u0001\f\u0001x\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u008d\b\u0001\u000b\u0001\f"+
		"\u0001\u008e\u0004\u0001\u0091\b\u0001\u000b\u0001\f\u0001\u0092\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u0001\u009c\b\u0001\u000b\u0001\f\u0001\u009d\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00c0\b\u0002\u0001\u0002\u0003\u0002\u00c3\b"+
		"\u0002\u0001\u0002\u0003\u0002\u00c6\b\u0002\u0001\u0002\u0003\u0002\u00c9"+
		"\b\u0002\u0001\u0002\u0003\u0002\u00cc\b\u0002\u0001\u0002\u0003\u0002"+
		"\u00cf\b\u0002\u0001\u0002\u0005\u0002\u00d2\b\u0002\n\u0002\f\u0002\u00d5"+
		"\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0004\u0002\u00dd\b\u0002\u000b\u0002\f\u0002\u00de\u0001\u0002"+
		"\u0001\u0002\u0004\u0002\u00e3\b\u0002\u000b\u0002\f\u0002\u00e4\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u00f7\b\u0002\u000b"+
		"\u0002\f\u0002\u00f8\u0001\u0002\u0001\u0002\u0004\u0002\u00fd\b\u0002"+
		"\u000b\u0002\f\u0002\u00fe\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u012f\b\u0002\u0001\u0002\u0003\u0002\u0132\b\u0002\u0001"+
		"\u0002\u0003\u0002\u0135\b\u0002\u0001\u0002\u0003\u0002\u0138\b\u0002"+
		"\u0001\u0002\u0003\u0002\u013b\b\u0002\u0001\u0002\u0003\u0002\u013e\b"+
		"\u0002\u0001\u0002\u0005\u0002\u0141\b\u0002\n\u0002\f\u0002\u0144\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0004\u0002\u014c\b\u0002\u000b\u0002\f\u0002\u014d\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u0155\b\u0002\u000b"+
		"\u0002\f\u0002\u0156\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u0185\b\u0003\u000b"+
		"\u0003\f\u0003\u0186\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u01a3\b\u0003\u000b"+
		"\u0003\f\u0003\u01a4\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u01ad\b\u0003\u0001\u0003\u0003\u0003\u01b0"+
		"\b\u0003\u0001\u0003\u0003\u0003\u01b3\b\u0003\u0001\u0003\u0003\u0003"+
		"\u01b6\b\u0003\u0001\u0003\u0003\u0003\u01b9\b\u0003\u0001\u0003\u0003"+
		"\u0003\u01bc\b\u0003\u0001\u0003\u0005\u0003\u01bf\b\u0003\n\u0003\f\u0003"+
		"\u01c2\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0004\u0003\u01cb\b\u0003\u000b\u0003\f\u0003"+
		"\u01cc\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u01d7\b\u0003\u000b\u0003\f"+
		"\u0003\u01d8\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003"+
		"\u01df\b\u0003\u000b\u0003\f\u0003\u01e0\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0004\u0003\u01e7\b\u0003\u000b\u0003\f\u0003\u01e8"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003"+
		"\u0208\b\u0003\u000b\u0003\f\u0003\u0209\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u021e\b\u0003\u000b"+
		"\u0003\f\u0003\u021f\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u0229\b\u0003\u000b\u0003\f"+
		"\u0003\u022a\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0004\u0004\u024b\b\u0004\u000b\u0004\f\u0004\u024c\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0266"+
		"\b\u0004\u0001\u0004\u0003\u0004\u0269\b\u0004\u0001\u0004\u0003\u0004"+
		"\u026c\b\u0004\u0001\u0004\u0003\u0004\u026f\b\u0004\u0001\u0004\u0003"+
		"\u0004\u0272\b\u0004\u0001\u0004\u0003\u0004\u0275\b\u0004\u0001\u0004"+
		"\u0005\u0004\u0278\b\u0004\n\u0004\f\u0004\u027b\t\u0004\u0001\u0004\u0001"+
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
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u02cb"+
		"\b\u0004\u000b\u0004\f\u0004\u02cc\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u02f0\b\u0004\u0001\u0004\u0003\u0004\u02f3\b\u0004\u0001"+
		"\u0004\u0003\u0004\u02f6\b\u0004\u0001\u0004\u0003\u0004\u02f9\b\u0004"+
		"\u0001\u0004\u0003\u0004\u02fc\b\u0004\u0001\u0004\u0003\u0004\u02ff\b"+
		"\u0004\u0001\u0004\u0005\u0004\u0302\b\u0004\n\u0004\f\u0004\u0305\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u0317\b\u0004"+
		"\u000b\u0004\f\u0004\u0318\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u0322\b\u0004\u000b\u0004"+
		"\f\u0004\u0323\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
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
		"\u0004\u0005\u0379\b\u0005\u000b\u0005\f\u0005\u037a\u0001\u0005\u0001"+
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
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u03c4\b\u0005\u0001"+
		"\u0005\u0003\u0005\u03c7\b\u0005\u0001\u0005\u0003\u0005\u03ca\b\u0005"+
		"\u0001\u0005\u0003\u0005\u03cd\b\u0005\u0001\u0005\u0003\u0005\u03d0\b"+
		"\u0005\u0001\u0005\u0003\u0005\u03d3\b\u0005\u0001\u0005\u0005\u0005\u03d6"+
		"\b\u0005\n\u0005\f\u0005\u03d9\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0004\u0005\u03e5\b\u0005\u000b\u0005\f\u0005\u03e6\u0003"+
		"\u0005\u03e9\b\u0005\u0004\u0005\u03eb\b\u0005\u000b\u0005\f\u0005\u03ec"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0004\u0005\u03f6\b\u0005\u000b\u0005\f\u0005\u03f7\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0004\u0007\u0407\b\u0007\u000b\u0007\f\u0007\u0408\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0004\b\u0410\b\b\u000b\b\f\b\u0411"+
		"\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000"+
		"\u0001\u0001\u0000\u0005\n\u045c\u0000\u0017\u0001\u0000\u0000\u0000\u0002"+
		"\u0019\u0001\u0000\u0000\u0000\u0004\u00ae\u0001\u0000\u0000\u0000\u0006"+
		"\u016f\u0001\u0000\u0000\u0000\b\u023a\u0001\u0000\u0000\u0000\n\u0331"+
		"\u0001\u0000\u0000\u0000\f\u0402\u0001\u0000\u0000\u0000\u000e\u0406\u0001"+
		"\u0000\u0000\u0000\u0010\u040f\u0001\u0000\u0000\u0000\u0012\u0018\u0003"+
		"\n\u0005\u0000\u0013\u0018\u0003\b\u0004\u0000\u0014\u0018\u0003\u0006"+
		"\u0003\u0000\u0015\u0018\u0003\u0004\u0002\u0000\u0016\u0018\u0003\u0002"+
		"\u0001\u0000\u0017\u0012\u0001\u0000\u0000\u0000\u0017\u0013\u0001\u0000"+
		"\u0000\u0000\u0017\u0014\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000"+
		"\u0000\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0001\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0005\u0005\u0000\u0000\u001a\u001b\u0005\u0003"+
		"\u0000\u0000\u001b\u001c\u0005\n\u0000\u0000\u001c\u001d\u0005\u0003\u0000"+
		"\u0000\u001d\u001e\u0005\n\u0000\u0000\u001e\u001f\u0005\n\u0000\u0000"+
		"\u001f \u0005\n\u0000\u0000 !\u0005\n\u0000\u0000!\"\u0005\n\u0000\u0000"+
		"\"#\u0005\n\u0000\u0000#$\u0005\n\u0000\u0000$%\u0005\u0003\u0000\u0000"+
		"%&\u0005\n\u0000\u0000&\u009b\u0005\u0004\u0000\u0000\'(\u0003\f\u0006"+
		"\u0000()\u0005\u0003\u0000\u0000)0\u0005\u0004\u0000\u0000*+\u0003\f\u0006"+
		"\u0000+,\u0005\u0003\u0000\u0000,-\u0005\u0003\u0000\u0000-.\u0005\u0003"+
		"\u0000\u0000./\u0005\u0004\u0000\u0000/1\u0001\u0000\u0000\u00000*\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u0000"+
		"23\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0003\f\u0006\u0000"+
		"56\u0005\u0003\u0000\u000067\u0005\u0003\u0000\u000078\u0005\u0003\u0000"+
		"\u000089\u0005\n\u0000\u00009:\u0005\u0004\u0000\u0000:;\u0003\f\u0006"+
		"\u0000;<\u0005\u0003\u0000\u0000<=\u0005\u0003\u0000\u0000=>\u0005\u0003"+
		"\u0000\u0000>\u008c\u0005\u0004\u0000\u0000?@\u0003\f\u0006\u0000@A\u0005"+
		"\u0003\u0000\u0000AB\u0005\u0006\u0000\u0000BC\u0005\u0004\u0000\u0000"+
		"CD\u0003\f\u0006\u0000DE\u0005\u0003\u0000\u0000EF\u0005\b\u0000\u0000"+
		"FG\u0005\u0004\u0000\u0000GH\u0003\f\u0006\u0000HI\u0005\u0003\u0000\u0000"+
		"IJ\u0005\b\u0000\u0000JK\u0005\u0004\u0000\u0000KL\u0003\f\u0006\u0000"+
		"LM\u0005\u0003\u0000\u0000MN\u0005\b\u0000\u0000NO\u0005\u0004\u0000\u0000"+
		"OP\u0003\f\u0006\u0000PQ\u0005\u0003\u0000\u0000QR\u0005\b\u0000\u0000"+
		"RS\u0005\u0004\u0000\u0000ST\u0003\f\u0006\u0000TU\u0005\u0003\u0000\u0000"+
		"UV\u0005\b\u0000\u0000VW\u0005\u0004\u0000\u0000WX\u0003\f\u0006\u0000"+
		"XY\u0005\u0003\u0000\u0000YZ\u0005\b\u0000\u0000Z[\u0005\u0004\u0000\u0000"+
		"[\\\u0003\f\u0006\u0000\\]\u0005\u0003\u0000\u0000]^\u0005\b\u0000\u0000"+
		"^_\u0005\u0004\u0000\u0000_`\u0003\f\u0006\u0000`a\u0005\u0003\u0000\u0000"+
		"ab\u0005\b\u0000\u0000bc\u0005\u0004\u0000\u0000cd\u0003\f\u0006\u0000"+
		"de\u0005\u0003\u0000\u0000ef\u0005\b\u0000\u0000fg\u0005\u0004\u0000\u0000"+
		"gh\u0003\f\u0006\u0000hi\u0005\u0003\u0000\u0000ij\u0005\b\u0000\u0000"+
		"jk\u0005\u0004\u0000\u0000kl\u0003\f\u0006\u0000lm\u0005\u0003\u0000\u0000"+
		"mn\u0005\b\u0000\u0000no\u0005\u0004\u0000\u0000op\u0003\f\u0006\u0000"+
		"pq\u0005\u0003\u0000\u0000qr\u0005\b\u0000\u0000rs\u0005\u0004\u0000\u0000"+
		"st\u0003\f\u0006\u0000tv\u0005\u0003\u0000\u0000uw\u0003\f\u0006\u0000"+
		"vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0005\u0004"+
		"\u0000\u0000{|\u0003\f\u0006\u0000|}\u0005\u0003\u0000\u0000}~\u0003\f"+
		"\u0006\u0000~\u007f\u0005\u0004\u0000\u0000\u007f\u0080\u0003\f\u0006"+
		"\u0000\u0080\u0081\u0005\u0003\u0000\u0000\u0081\u0082\u0003\f\u0006\u0000"+
		"\u0082\u0083\u0005\u0004\u0000\u0000\u0083\u0084\u0003\f\u0006\u0000\u0084"+
		"\u0085\u0005\u0003\u0000\u0000\u0085\u0086\u0003\f\u0006\u0000\u0086\u0087"+
		"\u0005\u0004\u0000\u0000\u0087\u0088\u0003\f\u0006\u0000\u0088\u0089\u0005"+
		"\u0003\u0000\u0000\u0089\u008a\u0005\u0004\u0000\u0000\u008a\u008b\u0006"+
		"\u0001\uffff\uffff\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c?\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0091\u0001"+
		"\u0000\u0000\u0000\u0090\'\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0005\n\u0000"+
		"\u0000\u0095\u0096\u0005\u0003\u0000\u0000\u0096\u0097\u0005\n\u0000\u0000"+
		"\u0097\u0098\u0005\u0003\u0000\u0000\u0098\u0099\u0005\u0006\u0000\u0000"+
		"\u0099\u009a\u0005\u0004\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000"+
		"\u009b\u0090\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0005\u0000\u0000"+
		"\u00a0\u00a1\u0005\u0003\u0000\u0000\u00a1\u00a2\u0005\n\u0000\u0000\u00a2"+
		"\u00a3\u0005\u0003\u0000\u0000\u00a3\u00a4\u0005\n\u0000\u0000\u00a4\u00a5"+
		"\u0005\n\u0000\u0000\u00a5\u00a6\u0005\n\u0000\u0000\u00a6\u00a7\u0005"+
		"\n\u0000\u0000\u00a7\u00a8\u0005\n\u0000\u0000\u00a8\u00a9\u0005\n\u0000"+
		"\u0000\u00a9\u00aa\u0005\n\u0000\u0000\u00aa\u00ab\u0005\u0003\u0000\u0000"+
		"\u00ab\u00ac\u0005\n\u0000\u0000\u00ac\u00ad\u0005\u0004\u0000\u0000\u00ad"+
		"\u0003\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0005\u0000\u0000\u00af"+
		"\u00b0\u0005\u0003\u0000\u0000\u00b0\u00b1\u0005\n\u0000\u0000\u00b1\u00b2"+
		"\u0005\u0003\u0000\u0000\u00b2\u00b3\u0005\n\u0000\u0000\u00b3\u00b4\u0005"+
		"\n\u0000\u0000\u00b4\u00b5\u0005\n\u0000\u0000\u00b5\u00b6\u0005\n\u0000"+
		"\u0000\u00b6\u00b7\u0005\n\u0000\u0000\u00b7\u00b8\u0005\n\u0000\u0000"+
		"\u00b8\u00b9\u0005\u0003\u0000\u0000\u00b9\u00ba\u0005\n\u0000\u0000\u00ba"+
		"\u00bb\u0005\u0004\u0000\u0000\u00bb\u00bc\u0005\u0005\u0000\u0000\u00bc"+
		"\u00bd\u0005\u0003\u0000\u0000\u00bd\u00bf\u0003\f\u0006\u0000\u00be\u00c0"+
		"\u0003\f\u0006\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00c3\u0003"+
		"\f\u0006\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00c6\u0003\f\u0006"+
		"\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c9\u0003\f\u0006\u0000"+
		"\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00cc\u0003\f\u0006\u0000\u00cb"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cd\u00cf\u0003\f\u0006\u0000\u00ce\u00cd"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d2\u0003\f\u0006\u0000\u00d1\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005"+
		"\u0004\u0000\u0000\u00d7\u00d8\u0005\n\u0000\u0000\u00d8\u00d9\u0005\u0003"+
		"\u0000\u0000\u00d9\u00da\u0005\n\u0000\u0000\u00da\u00dc\u0005\u0003\u0000"+
		"\u0000\u00db\u00dd\u0003\f\u0006\u0000\u00dc\u00db\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e2\u0005\u0003\u0000\u0000\u00e1\u00e3\u0003\f\u0006\u0000\u00e2"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u0003\u0000\u0000\u00e7"+
		"\u00e8\u0005\u0004\u0000\u0000\u00e8\u00e9\u0005\n\u0000\u0000\u00e9\u00ea"+
		"\u0005\u0003\u0000\u0000\u00ea\u00eb\u0005\n\u0000\u0000\u00eb\u00ec\u0005"+
		"\u0003\u0000\u0000\u00ec\u00ed\u0005\n\u0000\u0000\u00ed\u00ee\u0005\u0003"+
		"\u0000\u0000\u00ee\u00ef\u0003\f\u0006\u0000\u00ef\u00f0\u0005\u0003\u0000"+
		"\u0000\u00f0\u00f1\u0005\u0004\u0000\u0000\u00f1\u00f2\u0005\n\u0000\u0000"+
		"\u00f2\u00f3\u0005\u0003\u0000\u0000\u00f3\u00f4\u0005\n\u0000\u0000\u00f4"+
		"\u00f6\u0005\u0003\u0000\u0000\u00f5\u00f7\u0003\f\u0006\u0000\u00f6\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fc\u0005\u0003\u0000\u0000\u00fb\u00fd"+
		"\u0003\f\u0006\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0005"+
		"\u0003\u0000\u0000\u0101\u0102\u0005\u0004\u0000\u0000\u0102\u0103\u0005"+
		"\n\u0000\u0000\u0103\u0104\u0005\u0003\u0000\u0000\u0104\u0105\u0005\n"+
		"\u0000\u0000\u0105\u0106\u0005\u0003\u0000\u0000\u0106\u0107\u0005\b\u0000"+
		"\u0000\u0107\u0108\u0005\u0003\u0000\u0000\u0108\u0109\u0005\b\u0000\u0000"+
		"\u0109\u010a\u0005\u0003\u0000\u0000\u010a\u010b\u0005\u0004\u0000\u0000"+
		"\u010b\u010c\u0005\n\u0000\u0000\u010c\u010d\u0005\u0003\u0000\u0000\u010d"+
		"\u010e\u0005\n\u0000\u0000\u010e\u010f\u0005\u0003\u0000\u0000\u010f\u0110"+
		"\u0005\b\u0000\u0000\u0110\u0111\u0005\u0003\u0000\u0000\u0111\u0112\u0005"+
		"\u0006\u0000\u0000\u0112\u0113\u0005\u0003\u0000\u0000\u0113\u0114\u0005"+
		"\u0004\u0000\u0000\u0114\u0115\u0005\n\u0000\u0000\u0115\u0116\u0005\u0003"+
		"\u0000\u0000\u0116\u0117\u0005\n\u0000\u0000\u0117\u0118\u0005\u0003\u0000"+
		"\u0000\u0118\u0119\u0005\n\u0000\u0000\u0119\u011a\u0005\u0003\u0000\u0000"+
		"\u011a\u011b\u0005\n\u0000\u0000\u011b\u011c\u0005\u0003\u0000\u0000\u011c"+
		"\u011d\u0005\u0004\u0000\u0000\u011d\u011e\u0005\n\u0000\u0000\u011e\u011f"+
		"\u0005\u0003\u0000\u0000\u011f\u0120\u0005\n\u0000\u0000\u0120\u0121\u0005"+
		"\u0003\u0000\u0000\u0121\u0122\u0005\n\u0000\u0000\u0122\u0123\u0005\u0003"+
		"\u0000\u0000\u0123\u0124\u0005\n\u0000\u0000\u0124\u0125\u0005\u0003\u0000"+
		"\u0000\u0125\u0126\u0005\u0004\u0000\u0000\u0126\u0127\u0005\n\u0000\u0000"+
		"\u0127\u0128\u0005\u0003\u0000\u0000\u0128\u0129\u0005\n\u0000\u0000\u0129"+
		"\u012a\u0005\u0003\u0000\u0000\u012a\u012b\u0005\n\u0000\u0000\u012b\u012c"+
		"\u0005\u0003\u0000\u0000\u012c\u012e\u0003\f\u0006\u0000\u012d\u012f\u0003"+
		"\f\u0006\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000"+
		"\u0000\u0000\u012f\u0131\u0001\u0000\u0000\u0000\u0130\u0132\u0003\f\u0006"+
		"\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000"+
		"\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u0135\u0003\f\u0006\u0000"+
		"\u0134\u0133\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000"+
		"\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0138\u0003\f\u0006\u0000\u0137"+
		"\u0136\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138"+
		"\u013a\u0001\u0000\u0000\u0000\u0139\u013b\u0003\f\u0006\u0000\u013a\u0139"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013d"+
		"\u0001\u0000\u0000\u0000\u013c\u013e\u0003\f\u0006\u0000\u013d\u013c\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0142\u0001"+
		"\u0000\u0000\u0000\u013f\u0141\u0003\f\u0006\u0000\u0140\u013f\u0001\u0000"+
		"\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0145\u0001\u0000"+
		"\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u0003"+
		"\u0000\u0000\u0146\u0147\u0005\u0004\u0000\u0000\u0147\u0148\u0005\n\u0000"+
		"\u0000\u0148\u0149\u0005\n\u0000\u0000\u0149\u014b\u0005\u0003\u0000\u0000"+
		"\u014a\u014c\u0003\f\u0006\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f"+
		"\u0150\u0005\u0003\u0000\u0000\u0150\u0151\u0005\u0004\u0000\u0000\u0151"+
		"\u0152\u0005\n\u0000\u0000\u0152\u0154\u0005\u0003\u0000\u0000\u0153\u0155"+
		"\u0003\f\u0006\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001"+
		"\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001"+
		"\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0159\u0005"+
		"\u0003\u0000\u0000\u0159\u015a\u0005\u0004\u0000\u0000\u015a\u015b\u0005"+
		"\n\u0000\u0000\u015b\u015c\u0005\u0003\u0000\u0000\u015c\u015d\u0005\n"+
		"\u0000\u0000\u015d\u015e\u0005\u0003\u0000\u0000\u015e\u015f\u0005\u0006"+
		"\u0000\u0000\u015f\u0160\u0005\u0004\u0000\u0000\u0160\u0161\u0005\u0005"+
		"\u0000\u0000\u0161\u0162\u0005\u0003\u0000\u0000\u0162\u0163\u0005\n\u0000"+
		"\u0000\u0163\u0164\u0005\u0003\u0000\u0000\u0164\u0165\u0005\n\u0000\u0000"+
		"\u0165\u0166\u0005\n\u0000\u0000\u0166\u0167\u0005\n\u0000\u0000\u0167"+
		"\u0168\u0005\n\u0000\u0000\u0168\u0169\u0005\n\u0000\u0000\u0169\u016a"+
		"\u0005\n\u0000\u0000\u016a\u016b\u0005\u0003\u0000\u0000\u016b\u016c\u0005"+
		"\n\u0000\u0000\u016c\u016d\u0005\u0004\u0000\u0000\u016d\u016e\u0006\u0002"+
		"\uffff\uffff\u0000\u016e\u0005\u0001\u0000\u0000\u0000\u016f\u0170\u0005"+
		"\u0005\u0000\u0000\u0170\u0171\u0005\u0003\u0000\u0000\u0171\u0172\u0005"+
		"\n\u0000\u0000\u0172\u0173\u0005\u0003\u0000\u0000\u0173\u0174\u0005\n"+
		"\u0000\u0000\u0174\u0175\u0005\n\u0000\u0000\u0175\u0176\u0005\n\u0000"+
		"\u0000\u0176\u0177\u0005\n\u0000\u0000\u0177\u0178\u0005\n\u0000\u0000"+
		"\u0178\u0179\u0005\n\u0000\u0000\u0179\u017a\u0005\u0003\u0000\u0000\u017a"+
		"\u017b\u0005\n\u0000\u0000\u017b\u0228\u0005\u0004\u0000\u0000\u017c\u017d"+
		"\u0005\n\u0000\u0000\u017d\u017e\u0005\u0003\u0000\u0000\u017e\u0184\u0005"+
		"\u0004\u0000\u0000\u017f\u0180\u0005\n\u0000\u0000\u0180\u0181\u0005\u0003"+
		"\u0000\u0000\u0181\u0182\u0005\u0003\u0000\u0000\u0182\u0183\u0005\u0003"+
		"\u0000\u0000\u0183\u0185\u0005\u0004\u0000\u0000\u0184\u017f\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000"+
		"\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000"+
		"\u0000\u0000\u0188\u0189\u0005\n\u0000\u0000\u0189\u018a\u0005\u0003\u0000"+
		"\u0000\u018a\u018b\u0005\u0003\u0000\u0000\u018b\u018c\u0005\u0003\u0000"+
		"\u0000\u018c\u018d\u0005\n\u0000\u0000\u018d\u018e\u0005\u0004\u0000\u0000"+
		"\u018e\u018f\u0005\n\u0000\u0000\u018f\u0190\u0005\u0003\u0000\u0000\u0190"+
		"\u0191\u0005\u0003\u0000\u0000\u0191\u0192\u0005\u0003\u0000\u0000\u0192"+
		"\u021d\u0005\u0004\u0000\u0000\u0193\u0194\u0005\n\u0000\u0000\u0194\u0195"+
		"\u0005\u0003\u0000\u0000\u0195\u0196\u0005\n\u0000\u0000\u0196\u0197\u0005"+
		"\u0004\u0000\u0000\u0197\u0198\u0005\n\u0000\u0000\u0198\u0199\u0005\u0003"+
		"\u0000\u0000\u0199\u019a\u0003\f\u0006\u0000\u019a\u019b\u0005\u0004\u0000"+
		"\u0000\u019b\u019c\u0005\n\u0000\u0000\u019c\u019d\u0005\u0003\u0000\u0000"+
		"\u019d\u019e\u0005\u0004\u0000\u0000\u019e\u019f\u0005\n\u0000\u0000\u019f"+
		"\u01a0\u0005\u0003\u0000\u0000\u01a0\u01a2\u0005\u0003\u0000\u0000\u01a1"+
		"\u01a3\u0003\f\u0006\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0005\u0004\u0000\u0000\u01a7\u01a8\u0005\n\u0000\u0000\u01a8\u01a9\u0005"+
		"\u0003\u0000\u0000\u01a9\u01aa\u0005\u0003\u0000\u0000\u01aa\u01ac\u0003"+
		"\f\u0006\u0000\u01ab\u01ad\u0003\f\u0006\u0000\u01ac\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01af\u0001\u0000"+
		"\u0000\u0000\u01ae\u01b0\u0003\f\u0006\u0000\u01af\u01ae\u0001\u0000\u0000"+
		"\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b3\u0003\f\u0006\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b6\u0003\f\u0006\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b9\u0003\f\u0006\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b8\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b9\u01bb\u0001\u0000\u0000\u0000\u01ba\u01bc"+
		"\u0003\f\u0006\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bc\u01c0\u0001\u0000\u0000\u0000\u01bd\u01bf\u0003"+
		"\f\u0006\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c3\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c4\u0005\u0004\u0000\u0000\u01c4\u01c5\u0005\n\u0000"+
		"\u0000\u01c5\u01c6\u0005\u0003\u0000\u0000\u01c6\u01c7\u0005\u0004\u0000"+
		"\u0000\u01c7\u01c8\u0005\n\u0000\u0000\u01c8\u01ca\u0005\u0003\u0000\u0000"+
		"\u01c9\u01cb\u0003\f\u0006\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000\u01cb"+
		"\u01cc\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cc"+
		"\u01cd\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cf\u0005\u0004\u0000\u0000\u01cf\u01d0\u0005\n\u0000\u0000\u01d0\u01d1"+
		"\u0005\u0003\u0000\u0000\u01d1\u01d2\u0005\u0006\u0000\u0000\u01d2\u01d3"+
		"\u0005\u0004\u0000\u0000\u01d3\u01d4\u0005\n\u0000\u0000\u01d4\u01d6\u0005"+
		"\u0003\u0000\u0000\u01d5\u01d7\u0003\f\u0006\u0000\u01d6\u01d5\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000"+
		"\u0000\u0000\u01da\u01db\u0005\u0004\u0000\u0000\u01db\u01dc\u0005\n\u0000"+
		"\u0000\u01dc\u01de\u0005\u0003\u0000\u0000\u01dd\u01df\u0003\f\u0006\u0000"+
		"\u01de\u01dd\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000"+
		"\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005\u0004\u0000\u0000"+
		"\u01e3\u01e4\u0005\n\u0000\u0000\u01e4\u01e6\u0005\u0003\u0000\u0000\u01e5"+
		"\u01e7\u0003\f\u0006\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e9"+
		"\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01eb"+
		"\u0005\u0004\u0000\u0000\u01eb\u01ec\u0005\n\u0000\u0000\u01ec\u01ed\u0005"+
		"\u0003\u0000\u0000\u01ed\u01ee\u0005\n\u0000\u0000\u01ee\u01ef\u0005\u0004"+
		"\u0000\u0000\u01ef\u01f0\u0005\n\u0000\u0000\u01f0\u01f1\u0005\u0003\u0000"+
		"\u0000\u01f1\u01f2\u0005\u0004\u0000\u0000\u01f2\u01f3\u0005\n\u0000\u0000"+
		"\u01f3\u01f4\u0005\u0003\u0000\u0000\u01f4\u01f5\u0005\u0003\u0000\u0000"+
		"\u01f5\u01f6\u0005\n\u0000\u0000\u01f6\u01f7\u0005\u0004\u0000\u0000\u01f7"+
		"\u01f8\u0005\n\u0000\u0000\u01f8\u01f9\u0005\u0003\u0000\u0000\u01f9\u01fa"+
		"\u0005\u0003\u0000\u0000\u01fa\u01fb\u0005\n\u0000\u0000\u01fb\u01fc\u0005"+
		"\u0004\u0000\u0000\u01fc\u01fd\u0005\n\u0000\u0000\u01fd\u01fe\u0005\u0003"+
		"\u0000\u0000\u01fe\u01ff\u0005\u0003\u0000\u0000\u01ff\u0200\u0005\u0004"+
		"\u0000\u0000\u0200\u0201\u0005\n\u0000\u0000\u0201\u0202\u0005\u0003\u0000"+
		"\u0000\u0202\u0203\u0005\b\u0000\u0000\u0203\u0204\u0005\u0004\u0000\u0000"+
		"\u0204\u0205\u0005\n\u0000\u0000\u0205\u0207\u0005\u0003\u0000\u0000\u0206"+
		"\u0208\u0003\f\u0006\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0208\u0209"+
		"\u0001\u0000\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u020a"+
		"\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020c"+
		"\u0005\u0004\u0000\u0000\u020c\u020d\u0005\n\u0000\u0000\u020d\u020e\u0005"+
		"\u0003\u0000\u0000\u020e\u020f\u0005\b\u0000\u0000\u020f\u0210\u0005\u0004"+
		"\u0000\u0000\u0210\u0211\u0005\n\u0000\u0000\u0211\u0212\u0005\u0003\u0000"+
		"\u0000\u0212\u0213\u0005\b\u0000\u0000\u0213\u0214\u0005\u0004\u0000\u0000"+
		"\u0214\u0215\u0005\n\u0000\u0000\u0215\u0216\u0005\u0003\u0000\u0000\u0216"+
		"\u0217\u0005\n\u0000\u0000\u0217\u0218\u0005\u0004\u0000\u0000\u0218\u0219"+
		"\u0005\n\u0000\u0000\u0219\u021a\u0005\u0003\u0000\u0000\u021a\u021b\u0005"+
		"\u0004\u0000\u0000\u021b\u021c\u0006\u0003\uffff\uffff\u0000\u021c\u021e"+
		"\u0001\u0000\u0000\u0000\u021d\u0193\u0001\u0000\u0000\u0000\u021e\u021f"+
		"\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u021f\u0220"+
		"\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0221\u0222"+
		"\u0005\n\u0000\u0000\u0222\u0223\u0005\u0003\u0000\u0000\u0223\u0224\u0005"+
		"\n\u0000\u0000\u0224\u0225\u0005\u0003\u0000\u0000\u0225\u0226\u0005\u0006"+
		"\u0000\u0000\u0226\u0227\u0005\u0004\u0000\u0000\u0227\u0229\u0001\u0000"+
		"\u0000\u0000\u0228\u017c\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000"+
		"\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000"+
		"\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022d\u0005\u0005"+
		"\u0000\u0000\u022d\u022e\u0005\u0003\u0000\u0000\u022e\u022f\u0005\n\u0000"+
		"\u0000\u022f\u0230\u0005\u0003\u0000\u0000\u0230\u0231\u0005\n\u0000\u0000"+
		"\u0231\u0232\u0005\n\u0000\u0000\u0232\u0233\u0005\n\u0000\u0000\u0233"+
		"\u0234\u0005\n\u0000\u0000\u0234\u0235\u0005\n\u0000\u0000\u0235\u0236"+
		"\u0005\n\u0000\u0000\u0236\u0237\u0005\u0003\u0000\u0000\u0237\u0238\u0005"+
		"\n\u0000\u0000\u0238\u0239\u0005\u0004\u0000\u0000\u0239\u0007\u0001\u0000"+
		"\u0000\u0000\u023a\u023b\u0005\u0005\u0000\u0000\u023b\u023c\u0005\u0003"+
		"\u0000\u0000\u023c\u023d\u0005\n\u0000\u0000\u023d\u023e\u0005\u0003\u0000"+
		"\u0000\u023e\u023f\u0005\n\u0000\u0000\u023f\u0240\u0005\n\u0000\u0000"+
		"\u0240\u0241\u0005\n\u0000\u0000\u0241\u0242\u0005\n\u0000\u0000\u0242"+
		"\u0243\u0005\u0003\u0000\u0000\u0243\u0244\u0005\n\u0000\u0000\u0244\u0321"+
		"\u0005\u0004\u0000\u0000\u0245\u0246\u0005\n\u0000\u0000\u0246\u0247\u0005"+
		"\u0003\u0000\u0000\u0247\u0248\u0005\u0006\u0000\u0000\u0248\u0249\u0005"+
		"\u0003\u0000\u0000\u0249\u024b\u0005\u0004\u0000\u0000\u024a\u0245\u0001"+
		"\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c\u024a\u0001"+
		"\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024d\u024e\u0001"+
		"\u0000\u0000\u0000\u024e\u024f\u0005\n\u0000\u0000\u024f\u0250\u0005\u0003"+
		"\u0000\u0000\u0250\u0251\u0005\u0006\u0000\u0000\u0251\u0252\u0005\u0003"+
		"\u0000\u0000\u0252\u0253\u0005\n\u0000\u0000\u0253\u0254\u0005\u0004\u0000"+
		"\u0000\u0254\u0255\u0005\n\u0000\u0000\u0255\u0256\u0005\u0003\u0000\u0000"+
		"\u0256\u0257\u0005\u0006\u0000\u0000\u0257\u0258\u0005\u0003\u0000\u0000"+
		"\u0258\u0316\u0005\u0004\u0000\u0000\u0259\u025a\u0005\n\u0000\u0000\u025a"+
		"\u025b\u0005\u0003\u0000\u0000\u025b\u025c\u0005\u0006\u0000\u0000\u025c"+
		"\u025d\u0005\u0003\u0000\u0000\u025d\u025e\u0003\f\u0006\u0000\u025e\u025f"+
		"\u0005\u0004\u0000\u0000\u025f\u0260\u0005\n\u0000\u0000\u0260\u0261\u0005"+
		"\u0003\u0000\u0000\u0261\u0262\u0005\u0006\u0000\u0000\u0262\u0263\u0005"+
		"\u0003\u0000\u0000\u0263\u0265\u0003\f\u0006\u0000\u0264\u0266\u0003\f"+
		"\u0006\u0000\u0265\u0264\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000"+
		"\u0000\u0000\u0266\u0268\u0001\u0000\u0000\u0000\u0267\u0269\u0003\f\u0006"+
		"\u0000\u0268\u0267\u0001\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000"+
		"\u0000\u0269\u026b\u0001\u0000\u0000\u0000\u026a\u026c\u0003\f\u0006\u0000"+
		"\u026b\u026a\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000"+
		"\u026c\u026e\u0001\u0000\u0000\u0000\u026d\u026f\u0003\f\u0006\u0000\u026e"+
		"\u026d\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f"+
		"\u0271\u0001\u0000\u0000\u0000\u0270\u0272\u0003\f\u0006\u0000\u0271\u0270"+
		"\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u0274"+
		"\u0001\u0000\u0000\u0000\u0273\u0275\u0003\f\u0006\u0000\u0274\u0273\u0001"+
		"\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0279\u0001"+
		"\u0000\u0000\u0000\u0276\u0278\u0003\f\u0006\u0000\u0277\u0276\u0001\u0000"+
		"\u0000\u0000\u0278\u027b\u0001\u0000\u0000\u0000\u0279\u0277\u0001\u0000"+
		"\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000\u027a\u027c\u0001\u0000"+
		"\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027c\u027d\u0005\u0004"+
		"\u0000\u0000\u027d\u027e\u0005\n\u0000\u0000\u027e\u027f\u0005\u0003\u0000"+
		"\u0000\u027f\u0280\u0005\u0006\u0000\u0000\u0280\u0281\u0005\u0003\u0000"+
		"\u0000\u0281\u0282\u0005\b\u0000\u0000\u0282\u0283\u0005\u0004\u0000\u0000"+
		"\u0283\u0284\u0005\n\u0000\u0000\u0284\u0285\u0005\u0003\u0000\u0000\u0285"+
		"\u0286\u0005\u0006\u0000\u0000\u0286\u0287\u0005\u0003\u0000\u0000\u0287"+
		"\u0288\u0005\b\u0000\u0000\u0288\u0289\u0005\u0004\u0000\u0000\u0289\u028a"+
		"\u0005\n\u0000\u0000\u028a\u028b\u0005\u0003\u0000\u0000\u028b\u028c\u0005"+
		"\u0006\u0000\u0000\u028c\u028d\u0005\u0003\u0000\u0000\u028d\u028e\u0005"+
		"\b\u0000\u0000\u028e\u028f\u0005\u0004\u0000\u0000\u028f\u0290\u0005\n"+
		"\u0000\u0000\u0290\u0291\u0005\u0003\u0000\u0000\u0291\u0292\u0005\u0006"+
		"\u0000\u0000\u0292\u0293\u0005\u0003\u0000\u0000\u0293\u0294\u0005\b\u0000"+
		"\u0000\u0294\u0295\u0005\u0004\u0000\u0000\u0295\u0296\u0005\n\u0000\u0000"+
		"\u0296\u0297\u0005\u0003\u0000\u0000\u0297\u0298\u0005\u0006\u0000\u0000"+
		"\u0298\u0299\u0005\u0003\u0000\u0000\u0299\u029a\u0005\b\u0000\u0000\u029a"+
		"\u029b\u0005\u0004\u0000\u0000\u029b\u029c\u0005\n\u0000\u0000\u029c\u029d"+
		"\u0005\u0003\u0000\u0000\u029d\u029e\u0005\u0006\u0000\u0000\u029e\u029f"+
		"\u0005\u0003\u0000\u0000\u029f\u02a0\u0005\b\u0000\u0000\u02a0\u02a1\u0005"+
		"\u0004\u0000\u0000\u02a1\u02a2\u0005\n\u0000\u0000\u02a2\u02a3\u0005\u0003"+
		"\u0000\u0000\u02a3\u02a4\u0005\u0006\u0000\u0000\u02a4\u02a5\u0005\u0003"+
		"\u0000\u0000\u02a5\u02a6\u0005\b\u0000\u0000\u02a6\u02a7\u0005\u0004\u0000"+
		"\u0000\u02a7\u02a8\u0005\n\u0000\u0000\u02a8\u02a9\u0005\u0003\u0000\u0000"+
		"\u02a9\u02aa\u0005\u0006\u0000\u0000\u02aa\u02ab\u0005\u0003\u0000\u0000"+
		"\u02ab\u02ac\u0005\b\u0000\u0000\u02ac\u02ad\u0005\u0004\u0000\u0000\u02ad"+
		"\u02ae\u0005\n\u0000\u0000\u02ae\u02af\u0005\u0003\u0000\u0000\u02af\u02b0"+
		"\u0005\u0006\u0000\u0000\u02b0\u02b1\u0005\u0003\u0000\u0000\u02b1\u02b2"+
		"\u0005\b\u0000\u0000\u02b2\u02b3\u0005\u0004\u0000\u0000\u02b3\u02b4\u0005"+
		"\n\u0000\u0000\u02b4\u02b5\u0005\u0003\u0000\u0000\u02b5\u02b6\u0005\u0006"+
		"\u0000\u0000\u02b6\u02b7\u0005\u0003\u0000\u0000\u02b7\u02b8\u0005\b\u0000"+
		"\u0000\u02b8\u02b9\u0005\u0004\u0000\u0000\u02b9\u02ba\u0005\n\u0000\u0000"+
		"\u02ba\u02bb\u0005\u0003\u0000\u0000\u02bb\u02bc\u0005\u0006\u0000\u0000"+
		"\u02bc\u02bd\u0005\u0003\u0000\u0000\u02bd\u02be\u0005\b\u0000\u0000\u02be"+
		"\u02bf\u0005\u0004\u0000\u0000\u02bf\u02c0\u0005\n\u0000\u0000\u02c0\u02c1"+
		"\u0005\u0003\u0000\u0000\u02c1\u02c2\u0005\u0006\u0000\u0000\u02c2\u02c3"+
		"\u0005\u0003\u0000\u0000\u02c3\u02c4\u0005\b\u0000\u0000\u02c4\u02c5\u0005"+
		"\u0004\u0000\u0000\u02c5\u02c6\u0005\n\u0000\u0000\u02c6\u02c7\u0005\u0003"+
		"\u0000\u0000\u02c7\u02c8\u0005\u0006\u0000\u0000\u02c8\u02ca\u0005\u0003"+
		"\u0000\u0000\u02c9\u02cb\u0003\f\u0006\u0000\u02ca\u02c9\u0001\u0000\u0000"+
		"\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000"+
		"\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000"+
		"\u0000\u02ce\u02cf\u0005\u0004\u0000\u0000\u02cf\u02d0\u0005\n\u0000\u0000"+
		"\u02d0\u02d1\u0005\u0003\u0000\u0000\u02d1\u02d2\u0005\u0006\u0000\u0000"+
		"\u02d2\u02d3\u0005\u0003\u0000\u0000\u02d3\u02d4\u0003\f\u0006\u0000\u02d4"+
		"\u02d5\u0005\u0004\u0000\u0000\u02d5\u02d6\u0005\n\u0000\u0000\u02d6\u02d7"+
		"\u0005\u0003\u0000\u0000\u02d7\u02d8\u0005\u0006\u0000\u0000\u02d8\u02d9"+
		"\u0005\u0003\u0000\u0000\u02d9\u02da\u0003\f\u0006\u0000\u02da\u02db\u0005"+
		"\u0004\u0000\u0000\u02db\u02dc\u0005\n\u0000\u0000\u02dc\u02dd\u0005\u0003"+
		"\u0000\u0000\u02dd\u02de\u0005\u0006\u0000\u0000\u02de\u02df\u0005\u0003"+
		"\u0000\u0000\u02df\u02e0\u0003\f\u0006\u0000\u02e0\u02e1\u0005\u0004\u0000"+
		"\u0000\u02e1\u02e2\u0005\n\u0000\u0000\u02e2\u02e3\u0005\u0003\u0000\u0000"+
		"\u02e3\u02e4\u0005\u0006\u0000\u0000\u02e4\u02e5\u0005\u0003\u0000\u0000"+
		"\u02e5\u02e6\u0005\u0004\u0000\u0000\u02e6\u02e7\u0006\u0004\uffff\uffff"+
		"\u0000\u02e7\u0317\u0001\u0000\u0000\u0000\u02e8\u02e9\u0005\n\u0000\u0000"+
		"\u02e9\u02ea\u0005\u0003\u0000\u0000\u02ea\u02eb\u0005\u0006\u0000\u0000"+
		"\u02eb\u02ec\u0005\u0003\u0000\u0000\u02ec\u02ed\u0003\f\u0006\u0000\u02ed"+
		"\u02ef\u0003\f\u0006\u0000\u02ee\u02f0\u0003\f\u0006\u0000\u02ef\u02ee"+
		"\u0001\u0000\u0000\u0000\u02ef\u02f0\u0001\u0000\u0000\u0000\u02f0\u02f2"+
		"\u0001\u0000\u0000\u0000\u02f1\u02f3\u0003\f\u0006\u0000\u02f2\u02f1\u0001"+
		"\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f5\u0001"+
		"\u0000\u0000\u0000\u02f4\u02f6\u0003\f\u0006\u0000\u02f5\u02f4\u0001\u0000"+
		"\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6\u02f8\u0001\u0000"+
		"\u0000\u0000\u02f7\u02f9\u0003\f\u0006\u0000\u02f8\u02f7\u0001\u0000\u0000"+
		"\u0000\u02f8\u02f9\u0001\u0000\u0000\u0000\u02f9\u02fb\u0001\u0000\u0000"+
		"\u0000\u02fa\u02fc\u0003\f\u0006\u0000\u02fb\u02fa\u0001\u0000\u0000\u0000"+
		"\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc\u02fe\u0001\u0000\u0000\u0000"+
		"\u02fd\u02ff\u0003\f\u0006\u0000\u02fe\u02fd\u0001\u0000\u0000\u0000\u02fe"+
		"\u02ff\u0001\u0000\u0000\u0000\u02ff\u0303\u0001\u0000\u0000\u0000\u0300"+
		"\u0302\u0003\f\u0006\u0000\u0301\u0300\u0001\u0000\u0000\u0000\u0302\u0305"+
		"\u0001\u0000\u0000\u0000\u0303\u0301\u0001\u0000\u0000\u0000\u0303\u0304"+
		"\u0001\u0000\u0000\u0000\u0304\u0306\u0001\u0000\u0000\u0000\u0305\u0303"+
		"\u0001\u0000\u0000\u0000\u0306\u0307\u0005\b\u0000\u0000\u0307\u0308\u0005"+
		"\u0004\u0000\u0000\u0308\u0309\u0005\n\u0000\u0000\u0309\u030a\u0005\u0003"+
		"\u0000\u0000\u030a\u030b\u0005\u0006\u0000\u0000\u030b\u030c\u0005\u0003"+
		"\u0000\u0000\u030c\u030d\u0005\b\u0000\u0000\u030d\u030e\u0005\b\u0000"+
		"\u0000\u030e\u030f\u0005\b\u0000\u0000\u030f\u0310\u0005\b\u0000\u0000"+
		"\u0310\u0311\u0005\b\u0000\u0000\u0311\u0312\u0005\b\u0000\u0000\u0312"+
		"\u0313\u0005\b\u0000\u0000\u0313\u0314\u0005\u0004\u0000\u0000\u0314\u0315"+
		"\u0006\u0004\uffff\uffff\u0000\u0315\u0317\u0001\u0000\u0000\u0000\u0316"+
		"\u0259\u0001\u0000\u0000\u0000\u0316\u02e8\u0001\u0000\u0000\u0000\u0317"+
		"\u0318\u0001\u0000\u0000\u0000\u0318\u0316\u0001\u0000\u0000\u0000\u0318"+
		"\u0319\u0001\u0000\u0000\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031a"+
		"\u031b\u0005\n\u0000\u0000\u031b\u031c\u0005\u0003\u0000\u0000\u031c\u031d"+
		"\u0005\n\u0000\u0000\u031d\u031e\u0005\u0003\u0000\u0000\u031e\u031f\u0005"+
		"\u0006\u0000\u0000\u031f\u0320\u0005\u0004\u0000\u0000\u0320\u0322\u0001"+
		"\u0000\u0000\u0000\u0321\u024a\u0001\u0000\u0000\u0000\u0322\u0323\u0001"+
		"\u0000\u0000\u0000\u0323\u0321\u0001\u0000\u0000\u0000\u0323\u0324\u0001"+
		"\u0000\u0000\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325\u0326\u0005"+
		"\u0005\u0000\u0000\u0326\u0327\u0005\u0003\u0000\u0000\u0327\u0328\u0005"+
		"\n\u0000\u0000\u0328\u0329\u0005\u0003\u0000\u0000\u0329\u032a\u0005\n"+
		"\u0000\u0000\u032a\u032b\u0005\n\u0000\u0000\u032b\u032c\u0005\n\u0000"+
		"\u0000\u032c\u032d\u0005\n\u0000\u0000\u032d\u032e\u0005\u0003\u0000\u0000"+
		"\u032e\u032f\u0005\n\u0000\u0000\u032f\u0330\u0005\u0004\u0000\u0000\u0330"+
		"\t\u0001\u0000\u0000\u0000\u0331\u0332\u0005\u0005\u0000\u0000\u0332\u0333"+
		"\u0005\u0003\u0000\u0000\u0333\u0334\u0005\n\u0000\u0000\u0334\u0335\u0005"+
		"\u0003\u0000\u0000\u0335\u0336\u0005\n\u0000\u0000\u0336\u0337\u0005\u0003"+
		"\u0000\u0000\u0337\u0338\u0005\n\u0000\u0000\u0338\u03f5\u0005\u0004\u0000"+
		"\u0000\u0339\u033a\u0003\f\u0006\u0000\u033a\u033b\u0005\u0003\u0000\u0000"+
		"\u033b\u033c\u0005\n\u0000\u0000\u033c\u033d\u0005\n\u0000\u0000\u033d"+
		"\u033e\u0005\u0003\u0000\u0000\u033e\u033f\u0005\u0004\u0000\u0000\u033f"+
		"\u03f6\u0001\u0000\u0000\u0000\u0340\u0341\u0005\n\u0000\u0000\u0341\u0342"+
		"\u0005\u0003\u0000\u0000\u0342\u0343\u0003\f\u0006\u0000\u0343\u0344\u0005"+
		"\u0003\u0000\u0000\u0344\u0345\u0005\n\u0000\u0000\u0345\u0346\u0005\u0003"+
		"\u0000\u0000\u0346\u0347\u0005\n\u0000\u0000\u0347\u0348\u0005\u0003\u0000"+
		"\u0000\u0348\u0349\u0005\n\u0000\u0000\u0349\u034a\u0005\u0003\u0000\u0000"+
		"\u034a\u034b\u0005\n\u0000\u0000\u034b\u034c\u0005\u0003\u0000\u0000\u034c"+
		"\u034d\u0005\n\u0000\u0000\u034d\u034e\u0005\u0003\u0000\u0000\u034e\u034f"+
		"\u0005\n\u0000\u0000\u034f\u0350\u0005\u0003\u0000\u0000\u0350\u0351\u0005"+
		"\n\u0000\u0000\u0351\u0352\u0005\u0003\u0000\u0000\u0352\u0353\u0005\n"+
		"\u0000\u0000\u0353\u0354\u0005\u0003\u0000\u0000\u0354\u0355\u0005\n\u0000"+
		"\u0000\u0355\u0356\u0005\u0003\u0000\u0000\u0356\u0357\u0005\n\u0000\u0000"+
		"\u0357\u0358\u0005\u0003\u0000\u0000\u0358\u0359\u0005\n\u0000\u0000\u0359"+
		"\u035a\u0005\u0003\u0000\u0000\u035a\u0378\u0005\u0004\u0000\u0000\u035b"+
		"\u035c\u0005\n\u0000\u0000\u035c\u035d\u0005\u0003\u0000\u0000\u035d\u035e"+
		"\u0003\f\u0006\u0000\u035e\u035f\u0005\u0003\u0000\u0000\u035f\u0360\u0005"+
		"\u0006\u0000\u0000\u0360\u0361\u0005\u0003\u0000\u0000\u0361\u0362\u0005"+
		"\b\u0000\u0000\u0362\u0363\u0005\u0003\u0000\u0000\u0363\u0364\u0005\b"+
		"\u0000\u0000\u0364\u0365\u0005\u0003\u0000\u0000\u0365\u0366\u0005\b\u0000"+
		"\u0000\u0366\u0367\u0005\u0003\u0000\u0000\u0367\u0368\u0005\b\u0000\u0000"+
		"\u0368\u0369\u0005\u0003\u0000\u0000\u0369\u036a\u0005\b\u0000\u0000\u036a"+
		"\u036b\u0005\u0003\u0000\u0000\u036b\u036c\u0005\b\u0000\u0000\u036c\u036d"+
		"\u0005\u0003\u0000\u0000\u036d\u036e\u0005\b\u0000\u0000\u036e\u036f\u0005"+
		"\u0003\u0000\u0000\u036f\u0370\u0005\b\u0000\u0000\u0370\u0371\u0005\u0003"+
		"\u0000\u0000\u0371\u0372\u0005\b\u0000\u0000\u0372\u0373\u0005\u0003\u0000"+
		"\u0000\u0373\u0374\u0005\b\u0000\u0000\u0374\u0375\u0005\u0003\u0000\u0000"+
		"\u0375\u0376\u0005\u0004\u0000\u0000\u0376\u0377\u0006\u0005\uffff\uffff"+
		"\u0000\u0377\u0379\u0001\u0000\u0000\u0000\u0378\u035b\u0001\u0000\u0000"+
		"\u0000\u0379\u037a\u0001\u0000\u0000\u0000\u037a\u0378\u0001\u0000\u0000"+
		"\u0000\u037a\u037b\u0001\u0000\u0000\u0000\u037b\u03e9\u0001\u0000\u0000"+
		"\u0000\u037c\u037d\u0005\n\u0000\u0000\u037d\u037e\u0005\u0003\u0000\u0000"+
		"\u037e\u037f\u0003\f\u0006\u0000\u037f\u0380\u0005\u0003\u0000\u0000\u0380"+
		"\u0381\u0005\n\u0000\u0000\u0381\u0382\u0005\u0003\u0000\u0000\u0382\u0383"+
		"\u0005\n\u0000\u0000\u0383\u0384\u0005\u0003\u0000\u0000\u0384\u0385\u0005"+
		"\n\u0000\u0000\u0385\u0386\u0005\u0003\u0000\u0000\u0386\u0387\u0005\n"+
		"\u0000\u0000\u0387\u0388\u0005\u0003\u0000\u0000\u0388\u0389\u0005\n\u0000"+
		"\u0000\u0389\u038a\u0005\u0003\u0000\u0000\u038a\u038b\u0005\n\u0000\u0000"+
		"\u038b\u038c\u0005\u0003\u0000\u0000\u038c\u038d\u0005\n\u0000\u0000\u038d"+
		"\u038e\u0005\u0003\u0000\u0000\u038e\u038f\u0005\n\u0000\u0000\u038f\u0390"+
		"\u0005\u0003\u0000\u0000\u0390\u0391\u0005\n\u0000\u0000\u0391\u0392\u0005"+
		"\u0003\u0000\u0000\u0392\u0393\u0005\n\u0000\u0000\u0393\u0394\u0005\u0003"+
		"\u0000\u0000\u0394\u0395\u0005\n\u0000\u0000\u0395\u0396\u0005\u0003\u0000"+
		"\u0000\u0396\u0397\u0005\n\u0000\u0000\u0397\u0398\u0005\u0003\u0000\u0000"+
		"\u0398\u0399\u0005\n\u0000\u0000\u0399\u039a\u0005\u0003\u0000\u0000\u039a"+
		"\u039b\u0005\n\u0000\u0000\u039b\u039c\u0005\u0003\u0000\u0000\u039c\u039d"+
		"\u0005\n\u0000\u0000\u039d\u039e\u0005\u0003\u0000\u0000\u039e\u039f\u0005"+
		"\n\u0000\u0000\u039f\u03a0\u0005\u0003\u0000\u0000\u03a0\u03a1\u0005\n"+
		"\u0000\u0000\u03a1\u03a2\u0005\u0003\u0000\u0000\u03a2\u03e4\u0005\u0004"+
		"\u0000\u0000\u03a3\u03a4\u0005\n\u0000\u0000\u03a4\u03a5\u0005\u0003\u0000"+
		"\u0000\u03a5\u03a6\u0003\f\u0006\u0000\u03a6\u03a7\u0005\u0003\u0000\u0000"+
		"\u03a7\u03a8\u0005\u0006\u0000\u0000\u03a8\u03a9\u0005\u0003\u0000\u0000"+
		"\u03a9\u03aa\u0005\b\u0000\u0000\u03aa\u03ab\u0005\u0003\u0000\u0000\u03ab"+
		"\u03ac\u0005\b\u0000\u0000\u03ac\u03ad\u0005\u0003\u0000\u0000\u03ad\u03ae"+
		"\u0005\b\u0000\u0000\u03ae\u03af\u0005\u0003\u0000\u0000\u03af\u03b0\u0005"+
		"\b\u0000\u0000\u03b0\u03b1\u0005\u0003\u0000\u0000\u03b1\u03b2\u0005\b"+
		"\u0000\u0000\u03b2\u03b3\u0005\u0003\u0000\u0000\u03b3\u03b4\u0005\b\u0000"+
		"\u0000\u03b4\u03b5\u0005\u0003\u0000\u0000\u03b5\u03b6\u0005\b\u0000\u0000"+
		"\u03b6\u03b7\u0005\u0003\u0000\u0000\u03b7\u03b8\u0005\b\u0000\u0000\u03b8"+
		"\u03b9\u0005\u0003\u0000\u0000\u03b9\u03ba\u0005\b\u0000\u0000\u03ba\u03bb"+
		"\u0005\u0003\u0000\u0000\u03bb\u03bc\u0005\b\u0000\u0000\u03bc\u03bd\u0005"+
		"\u0003\u0000\u0000\u03bd\u03be\u0005\b\u0000\u0000\u03be\u03bf\u0005\u0003"+
		"\u0000\u0000\u03bf\u03c0\u0005\b\u0000\u0000\u03c0\u03c1\u0005\u0003\u0000"+
		"\u0000\u03c1\u03c3\u0003\f\u0006\u0000\u03c2\u03c4\u0003\f\u0006\u0000"+
		"\u03c3\u03c2\u0001\u0000\u0000\u0000\u03c3\u03c4\u0001\u0000\u0000\u0000"+
		"\u03c4\u03c6\u0001\u0000\u0000\u0000\u03c5\u03c7\u0003\f\u0006\u0000\u03c6"+
		"\u03c5\u0001\u0000\u0000\u0000\u03c6\u03c7\u0001\u0000\u0000\u0000\u03c7"+
		"\u03c9\u0001\u0000\u0000\u0000\u03c8\u03ca\u0003\f\u0006\u0000\u03c9\u03c8"+
		"\u0001\u0000\u0000\u0000\u03c9\u03ca\u0001\u0000\u0000\u0000\u03ca\u03cc"+
		"\u0001\u0000\u0000\u0000\u03cb\u03cd\u0003\f\u0006\u0000\u03cc\u03cb\u0001"+
		"\u0000\u0000\u0000\u03cc\u03cd\u0001\u0000\u0000\u0000\u03cd\u03cf\u0001"+
		"\u0000\u0000\u0000\u03ce\u03d0\u0003\f\u0006\u0000\u03cf\u03ce\u0001\u0000"+
		"\u0000\u0000\u03cf\u03d0\u0001\u0000\u0000\u0000\u03d0\u03d2\u0001\u0000"+
		"\u0000\u0000\u03d1\u03d3\u0003\f\u0006\u0000\u03d2\u03d1\u0001\u0000\u0000"+
		"\u0000\u03d2\u03d3\u0001\u0000\u0000\u0000\u03d3\u03d7\u0001\u0000\u0000"+
		"\u0000\u03d4\u03d6\u0003\f\u0006\u0000\u03d5\u03d4\u0001\u0000\u0000\u0000"+
		"\u03d6\u03d9\u0001\u0000\u0000\u0000\u03d7\u03d5\u0001\u0000\u0000\u0000"+
		"\u03d7\u03d8\u0001\u0000\u0000\u0000\u03d8\u03da\u0001\u0000\u0000\u0000"+
		"\u03d9\u03d7\u0001\u0000\u0000\u0000\u03da\u03db\u0005\u0003\u0000\u0000"+
		"\u03db\u03dc\u0005\b\u0000\u0000\u03dc\u03dd\u0005\u0003\u0000\u0000\u03dd"+
		"\u03de\u0005\b\u0000\u0000\u03de\u03df\u0005\u0003\u0000\u0000\u03df\u03e0"+
		"\u0005\b\u0000\u0000\u03e0\u03e1\u0005\u0003\u0000\u0000\u03e1\u03e2\u0005"+
		"\u0004\u0000\u0000\u03e2\u03e3\u0006\u0005\uffff\uffff\u0000\u03e3\u03e5"+
		"\u0001\u0000\u0000\u0000\u03e4\u03a3\u0001\u0000\u0000\u0000\u03e5\u03e6"+
		"\u0001\u0000\u0000\u0000\u03e6\u03e4\u0001\u0000\u0000\u0000\u03e6\u03e7"+
		"\u0001\u0000\u0000\u0000\u03e7\u03e9\u0001\u0000\u0000\u0000\u03e8\u0340"+
		"\u0001\u0000\u0000\u0000\u03e8\u037c\u0001\u0000\u0000\u0000\u03e9\u03eb"+
		"\u0001\u0000\u0000\u0000\u03ea\u03e8\u0001\u0000\u0000\u0000\u03eb\u03ec"+
		"\u0001\u0000\u0000\u0000\u03ec\u03ea\u0001\u0000\u0000\u0000\u03ec\u03ed"+
		"\u0001\u0000\u0000\u0000\u03ed\u03ee\u0001\u0000\u0000\u0000\u03ee\u03ef"+
		"\u0005\n\u0000\u0000\u03ef\u03f0\u0005\u0003\u0000\u0000\u03f0\u03f1\u0005"+
		"\n\u0000\u0000\u03f1\u03f2\u0005\u0003\u0000\u0000\u03f2\u03f3\u0005\u0006"+
		"\u0000\u0000\u03f3\u03f4\u0005\u0004\u0000\u0000\u03f4\u03f6\u0001\u0000"+
		"\u0000\u0000\u03f5\u0339\u0001\u0000\u0000\u0000\u03f5\u03ea\u0001\u0000"+
		"\u0000\u0000\u03f6\u03f7\u0001\u0000\u0000\u0000\u03f7\u03f5\u0001\u0000"+
		"\u0000\u0000\u03f7\u03f8\u0001\u0000\u0000\u0000\u03f8\u03f9\u0001\u0000"+
		"\u0000\u0000\u03f9\u03fa\u0005\u0005\u0000\u0000\u03fa\u03fb\u0005\u0003"+
		"\u0000\u0000\u03fb\u03fc\u0005\n\u0000\u0000\u03fc\u03fd\u0005\u0003\u0000"+
		"\u0000\u03fd\u03fe\u0005\n\u0000\u0000\u03fe\u03ff\u0005\u0003\u0000\u0000"+
		"\u03ff\u0400\u0005\n\u0000\u0000\u0400\u0401\u0005\u0004\u0000\u0000\u0401"+
		"\u000b\u0001\u0000\u0000\u0000\u0402\u0403\u0007\u0000\u0000\u0000\u0403"+
		"\r\u0001\u0000\u0000\u0000\u0404\u0407\u0003\f\u0006\u0000\u0405\u0407"+
		"\u0005\u0003\u0000\u0000\u0406\u0404\u0001\u0000\u0000\u0000\u0406\u0405"+
		"\u0001\u0000\u0000\u0000\u0407\u0408\u0001\u0000\u0000\u0000\u0408\u0406"+
		"\u0001\u0000\u0000\u0000\u0408\u0409\u0001\u0000\u0000\u0000\u0409\u040a"+
		"\u0001\u0000\u0000\u0000\u040a\u040b\u0005\u0004\u0000\u0000\u040b\u000f"+
		"\u0001\u0000\u0000\u0000\u040c\u0410\u0003\f\u0006\u0000\u040d\u0410\u0005"+
		"\u0003\u0000\u0000\u040e\u0410\u0005\u0004\u0000\u0000\u040f\u040c\u0001"+
		"\u0000\u0000\u0000\u040f\u040d\u0001\u0000\u0000\u0000\u040f\u040e\u0001"+
		"\u0000\u0000\u0000\u0410\u0411\u0001\u0000\u0000\u0000\u0411\u040f\u0001"+
		"\u0000\u0000\u0000\u0411\u0412\u0001\u0000\u0000\u0000\u0412\u0011\u0001"+
		"\u0000\u0000\u0000N\u00172x\u008e\u0092\u009d\u00bf\u00c2\u00c5\u00c8"+
		"\u00cb\u00ce\u00d3\u00de\u00e4\u00f8\u00fe\u012e\u0131\u0134\u0137\u013a"+
		"\u013d\u0142\u014d\u0156\u0186\u01a4\u01ac\u01af\u01b2\u01b5\u01b8\u01bb"+
		"\u01c0\u01cc\u01d8\u01e0\u01e8\u0209\u021f\u022a\u024c\u0265\u0268\u026b"+
		"\u026e\u0271\u0274\u0279\u02cc\u02ef\u02f2\u02f5\u02f8\u02fb\u02fe\u0303"+
		"\u0316\u0318\u0323\u037a\u03c3\u03c6\u03c9\u03cc\u03cf\u03d2\u03d7\u03e6"+
		"\u03e8\u03ec\u03f5\u03f7\u0406\u0408\u040f\u0411";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}