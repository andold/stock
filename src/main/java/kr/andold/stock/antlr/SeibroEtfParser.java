// Generated from C:\src\eclipse-workspace\stock\src\main\resources\grammar\SeibroEtf.g4 by ANTLR 4.10.1
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
public class SeibroEtfParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANK=1, BLANK_LINE=2, TAB=3, NEWLINE=4, KEYWORD=5, DATE=6, TIME=7, NUMBER=8, 
		STRING=9, WORD=10;
	public static final int
		RULE_seibroEtfDocument = 0, RULE_seibroPriceCurrentEtf = 1, RULE_naverPriceCurrentEtf = 2, 
		RULE_seibroPriceEtf = 3, RULE_seibroItemInfoEtf = 4, RULE_crawlItemEtf = 5, 
		RULE_crawlPriceEtf = 6, RULE_crawlEtfDetailThread = 7, RULE_crawlDividendHistoryEtfThread = 8, 
		RULE_word = 9, RULE_line = 10, RULE_eof = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"seibroEtfDocument", "seibroPriceCurrentEtf", "naverPriceCurrentEtf", 
			"seibroPriceEtf", "seibroItemInfoEtf", "crawlItemEtf", "crawlPriceEtf", 
			"crawlEtfDetailThread", "crawlDividendHistoryEtfThread", "word", "line", 
			"eof"
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
	public String getGrammarFileName() { return "SeibroEtf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private final Logger log = LoggerFactory.getLogger(getClass());

	public SeibroEtfParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SeibroEtfDocumentContext extends ParserRuleContext {
		public CrawlDividendHistoryEtfThreadContext crawlDividendHistoryEtfThread() {
			return getRuleContext(CrawlDividendHistoryEtfThreadContext.class,0);
		}
		public CrawlItemEtfContext crawlItemEtf() {
			return getRuleContext(CrawlItemEtfContext.class,0);
		}
		public CrawlEtfDetailThreadContext crawlEtfDetailThread() {
			return getRuleContext(CrawlEtfDetailThreadContext.class,0);
		}
		public CrawlPriceEtfContext crawlPriceEtf() {
			return getRuleContext(CrawlPriceEtfContext.class,0);
		}
		public SeibroItemInfoEtfContext seibroItemInfoEtf() {
			return getRuleContext(SeibroItemInfoEtfContext.class,0);
		}
		public SeibroPriceEtfContext seibroPriceEtf() {
			return getRuleContext(SeibroPriceEtfContext.class,0);
		}
		public SeibroPriceCurrentEtfContext seibroPriceCurrentEtf() {
			return getRuleContext(SeibroPriceCurrentEtfContext.class,0);
		}
		public SeibroEtfDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seibroEtfDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).enterSeibroEtfDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).exitSeibroEtfDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroEtfVisitor ) return ((SeibroEtfVisitor<? extends T>)visitor).visitSeibroEtfDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeibroEtfDocumentContext seibroEtfDocument() throws RecognitionException {
		SeibroEtfDocumentContext _localctx = new SeibroEtfDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_seibroEtfDocument);
		try {
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				crawlDividendHistoryEtfThread();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				crawlItemEtf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				crawlEtfDetailThread();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				crawlPriceEtf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(28);
				seibroItemInfoEtf();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(29);
				seibroPriceEtf();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(30);
				seibroPriceCurrentEtf();
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
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroEtfParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroEtfParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroEtfParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroEtfParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroEtfParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroEtfParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroEtfParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroEtfParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroEtfParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroEtfParser.DATE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SeibroEtfParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SeibroEtfParser.NUMBER, i);
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
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).enterSeibroPriceCurrentEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).exitSeibroPriceCurrentEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroEtfVisitor ) return ((SeibroEtfVisitor<? extends T>)visitor).visitSeibroPriceCurrentEtf(this);
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
			setState(33);
			match(KEYWORD);
			setState(34);
			match(TAB);
			setState(35);
			match(WORD);
			setState(36);
			match(TAB);
			setState(37);
			match(WORD);
			setState(38);
			match(WORD);
			setState(39);
			match(WORD);
			setState(40);
			match(TAB);
			setState(41);
			match(WORD);
			setState(42);
			match(NEWLINE);
			setState(153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				match(WORD);
				setState(44);
				match(DATE);
				setState(45);
				match(TAB);
				setState(46);
				match(NEWLINE);
				setState(47);
				match(WORD);
				setState(48);
				match(DATE);
				setState(49);
				match(TAB);
				setState(50);
				match(WORD);
				setState(51);
				match(TAB);
				setState(52);
				match(WORD);
				setState(53);
				match(TAB);
				setState(54);
				match(WORD);
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
				match(TAB);
				setState(64);
				match(WORD);
				setState(65);
				match(TAB);
				setState(66);
				match(WORD);
				setState(67);
				match(TAB);
				setState(68);
				match(WORD);
				setState(69);
				match(TAB);
				setState(70);
				match(WORD);
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
				match(NEWLINE);
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						{
						setState(85);
						match(WORD);
						setState(86);
						((SeibroPriceCurrentEtfContext)_localctx).base = match(DATE);
						setState(87);
						match(TAB);
						setState(88);
						match(TAB);
						setState(90); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(89);
							word();
							}
							}
							setState(92); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(94);
						match(TAB);
						setState(95);
						((SeibroPriceCurrentEtfContext)_localctx).code = word();
						setState(96);
						match(TAB);
						setState(98); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(97);
							word();
							}
							}
							setState(100); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
						setState(102);
						match(TAB);
						setState(103);
						match(NUMBER);
						setState(104);
						match(TAB);
						setState(105);
						((SeibroPriceCurrentEtfContext)_localctx).closing = match(NUMBER);
						setState(106);
						match(TAB);
						setState(107);
						((SeibroPriceCurrentEtfContext)_localctx).volume = match(NUMBER);
						setState(108);
						match(TAB);
						setState(109);
						match(NUMBER);
						setState(110);
						match(TAB);
						setState(111);
						match(NUMBER);
						setState(112);
						match(TAB);
						setState(114);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(113);
							match(NUMBER);
							}
						}

						setState(116);
						match(TAB);
						setState(118);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(117);
							match(NUMBER);
							}
						}

						setState(120);
						match(TAB);
						setState(121);
						match(NUMBER);
						setState(122);
						match(TAB);
						setState(124);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(123);
							match(NUMBER);
							}
						}

						setState(126);
						match(TAB);
						setState(128);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(127);
							match(NUMBER);
							}
						}

						setState(130);
						match(TAB);
						setState(132);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(131);
							match(NUMBER);
							}
						}

						setState(134);
						match(TAB);
						setState(135);
						match(NUMBER);
						setState(136);
						match(TAB);
						setState(137);
						match(WORD);
						setState(138);
						match(TAB);
						setState(139);
						match(NEWLINE);

										ParserService.price(20240112
											, (((SeibroPriceCurrentEtfContext)_localctx).code!=null?_input.getText(((SeibroPriceCurrentEtfContext)_localctx).code.start,((SeibroPriceCurrentEtfContext)_localctx).code.stop):null)
											, (((SeibroPriceCurrentEtfContext)_localctx).base!=null?((SeibroPriceCurrentEtfContext)_localctx).base.getText():null), (((SeibroPriceCurrentEtfContext)_localctx).closing!=null?((SeibroPriceCurrentEtfContext)_localctx).closing.getText():null), null, null, null, (((SeibroPriceCurrentEtfContext)_localctx).volume!=null?((SeibroPriceCurrentEtfContext)_localctx).volume.getText():null)
										);
									
						}
						}
						} 
					}
					setState(146);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(147);
				match(WORD);
				setState(148);
				match(TAB);
				setState(149);
				match(WORD);
				setState(150);
				match(TAB);
				setState(151);
				match(DATE);
				setState(152);
				match(NEWLINE);
				}
				}
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(157);
			match(KEYWORD);
			setState(158);
			match(TAB);
			setState(159);
			match(WORD);
			setState(160);
			match(TAB);
			setState(161);
			match(WORD);
			setState(162);
			match(WORD);
			setState(163);
			match(WORD);
			setState(164);
			match(TAB);
			setState(165);
			match(WORD);
			setState(166);
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
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroEtfParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroEtfParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroEtfParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroEtfParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroEtfParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroEtfParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroEtfParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroEtfParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroEtfParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroEtfParser.DATE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SeibroEtfParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SeibroEtfParser.NUMBER, i);
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
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).enterNaverPriceCurrentEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).exitNaverPriceCurrentEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroEtfVisitor ) return ((SeibroEtfVisitor<? extends T>)visitor).visitNaverPriceCurrentEtf(this);
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
			setState(168);
			match(KEYWORD);
			setState(169);
			match(TAB);
			setState(170);
			match(WORD);
			setState(171);
			match(TAB);
			setState(172);
			match(WORD);
			setState(173);
			match(WORD);
			setState(174);
			match(WORD);
			setState(175);
			match(WORD);
			setState(176);
			match(WORD);
			setState(177);
			match(TAB);
			setState(178);
			match(WORD);
			setState(179);
			match(NEWLINE);
			setState(261); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(180);
				match(DATE);
				setState(181);
				match(TAB);
				setState(182);
				match(WORD);
				setState(183);
				match(TAB);
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
				match(TAB);
				setState(190);
				match(WORD);
				setState(191);
				match(TAB);
				setState(192);
				match(WORD);
				setState(193);
				match(TAB);
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
				match(TAB);
				setState(202);
				match(WORD);
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
				match(NEWLINE);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DATE) {
					{
					setState(250);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						{
						setState(217);
						match(DATE);
						setState(218);
						match(TAB);
						setState(219);
						match(TAB);
						setState(220);
						match(NEWLINE);
						}
						}
						break;
					case 2:
						{
						{
						setState(221);
						((NaverPriceCurrentEtfContext)_localctx).base = match(DATE);
						setState(222);
						match(TAB);
						setState(223);
						((NaverPriceCurrentEtfContext)_localctx).code = word();
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
						((NaverPriceCurrentEtfContext)_localctx).closing = match(NUMBER);
						setState(232);
						match(TAB);
						setState(233);
						match(NUMBER);
						setState(234);
						match(TAB);
						setState(235);
						match(WORD);
						setState(236);
						match(TAB);
						setState(237);
						match(NUMBER);
						setState(238);
						match(TAB);
						setState(239);
						match(WORD);
						setState(240);
						match(TAB);
						setState(241);
						((NaverPriceCurrentEtfContext)_localctx).volume = match(NUMBER);
						setState(242);
						match(TAB);
						setState(243);
						match(NUMBER);
						setState(244);
						match(TAB);
						setState(245);
						match(NUMBER);
						setState(246);
						match(TAB);
						setState(247);
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
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				match(WORD);
				setState(256);
				match(TAB);
				setState(257);
				match(WORD);
				setState(258);
				match(TAB);
				setState(259);
				match(DATE);
				setState(260);
				match(NEWLINE);
				}
				}
				setState(263); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DATE );
			setState(265);
			match(KEYWORD);
			setState(266);
			match(TAB);
			setState(267);
			match(WORD);
			setState(268);
			match(TAB);
			setState(269);
			match(WORD);
			setState(270);
			match(WORD);
			setState(271);
			match(WORD);
			setState(272);
			match(WORD);
			setState(273);
			match(WORD);
			setState(274);
			match(TAB);
			setState(275);
			match(WORD);
			setState(276);
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
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroEtfParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroEtfParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroEtfParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroEtfParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroEtfParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroEtfParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroEtfParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroEtfParser.NEWLINE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroEtfParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroEtfParser.DATE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SeibroEtfParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SeibroEtfParser.NUMBER, i);
		}
		public SeibroPriceEtfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seibroPriceEtf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).enterSeibroPriceEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).exitSeibroPriceEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroEtfVisitor ) return ((SeibroEtfVisitor<? extends T>)visitor).visitSeibroPriceEtf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeibroPriceEtfContext seibroPriceEtf() throws RecognitionException {
		SeibroPriceEtfContext _localctx = new SeibroPriceEtfContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_seibroPriceEtf);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(KEYWORD);
			setState(279);
			match(TAB);
			setState(280);
			match(WORD);
			setState(281);
			match(TAB);
			setState(282);
			match(WORD);
			setState(283);
			match(WORD);
			setState(284);
			match(WORD);
			setState(285);
			match(WORD);
			setState(286);
			match(WORD);
			setState(287);
			match(WORD);
			setState(288);
			match(WORD);
			setState(289);
			match(TAB);
			setState(290);
			match(WORD);
			setState(291);
			match(NEWLINE);
			setState(358); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(292);
					word();
					setState(293);
					match(TAB);
					setState(294);
					match(NEWLINE);
					setState(295);
					word();
					setState(296);
					match(TAB);
					setState(297);
					match(WORD);
					setState(298);
					match(TAB);
					setState(299);
					match(WORD);
					setState(300);
					match(TAB);
					setState(301);
					match(WORD);
					setState(302);
					match(TAB);
					setState(303);
					match(WORD);
					setState(304);
					match(TAB);
					setState(305);
					match(WORD);
					setState(306);
					match(TAB);
					setState(307);
					match(WORD);
					setState(308);
					match(TAB);
					setState(309);
					match(WORD);
					setState(310);
					match(TAB);
					setState(311);
					match(WORD);
					setState(312);
					match(TAB);
					setState(313);
					match(NEWLINE);
					setState(347); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(347);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
							case 1:
								{
								{
								setState(314);
								word();
								setState(315);
								match(TAB);
								setState(316);
								match(TAB);
								setState(317);
								match(TAB);
								setState(318);
								match(TAB);
								setState(319);
								match(TAB);
								setState(320);
								match(TAB);
								setState(321);
								match(TAB);
								setState(322);
								match(TAB);
								setState(323);
								match(TAB);
								setState(324);
								match(NEWLINE);
								}
								}
								break;
							case 2:
								{
								{
								setState(326);
								((SeibroPriceEtfContext)_localctx).code = word();
								setState(327);
								match(TAB);
								setState(328);
								((SeibroPriceEtfContext)_localctx).base = match(DATE);
								setState(329);
								match(TAB);
								setState(330);
								((SeibroPriceEtfContext)_localctx).closing = match(NUMBER);
								setState(331);
								match(TAB);
								setState(332);
								match(NUMBER);
								setState(333);
								match(TAB);
								setState(334);
								((SeibroPriceEtfContext)_localctx).market = match(NUMBER);
								setState(335);
								match(TAB);
								setState(336);
								((SeibroPriceEtfContext)_localctx).high = match(NUMBER);
								setState(337);
								match(TAB);
								setState(338);
								((SeibroPriceEtfContext)_localctx).low = match(NUMBER);
								setState(339);
								match(TAB);
								setState(340);
								((SeibroPriceEtfContext)_localctx).volume = match(NUMBER);
								setState(341);
								match(TAB);
								setState(342);
								match(NUMBER);
								setState(343);
								match(TAB);
								setState(344);
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
						setState(349); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(351);
					match(WORD);
					setState(352);
					match(TAB);
					setState(353);
					match(WORD);
					setState(354);
					match(TAB);
					setState(355);
					match(DATE);
					setState(356);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(360); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(362);
			match(KEYWORD);
			setState(363);
			match(TAB);
			setState(364);
			match(WORD);
			setState(365);
			match(TAB);
			setState(366);
			match(WORD);
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
			match(TAB);
			setState(374);
			match(WORD);
			setState(375);
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
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroEtfParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroEtfParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroEtfParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroEtfParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroEtfParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroEtfParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroEtfParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroEtfParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroEtfParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroEtfParser.DATE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SeibroEtfParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SeibroEtfParser.NUMBER, i);
		}
		public SeibroItemInfoEtfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seibroItemInfoEtf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).enterSeibroItemInfoEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).exitSeibroItemInfoEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroEtfVisitor ) return ((SeibroEtfVisitor<? extends T>)visitor).visitSeibroItemInfoEtf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeibroItemInfoEtfContext seibroItemInfoEtf() throws RecognitionException {
		SeibroItemInfoEtfContext _localctx = new SeibroItemInfoEtfContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_seibroItemInfoEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(KEYWORD);
			setState(378);
			match(TAB);
			setState(379);
			match(WORD);
			setState(380);
			match(TAB);
			setState(381);
			match(WORD);
			setState(382);
			match(WORD);
			setState(383);
			match(WORD);
			setState(384);
			match(WORD);
			setState(385);
			match(WORD);
			setState(386);
			match(TAB);
			setState(387);
			match(WORD);
			setState(388);
			match(NEWLINE);
			setState(476); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(465); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(389);
						match(KEYWORD);
						setState(390);
						match(TAB);
						setState(391);
						((SeibroItemInfoEtfContext)_localctx).code = word();
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
						((SeibroItemInfoEtfContext)_localctx).symbol = word();
						setState(401);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
						case 1:
							{
							setState(400);
							((SeibroItemInfoEtfContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(404);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
						case 1:
							{
							setState(403);
							((SeibroItemInfoEtfContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(407);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
						case 1:
							{
							setState(406);
							((SeibroItemInfoEtfContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(410);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
						case 1:
							{
							setState(409);
							((SeibroItemInfoEtfContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(413);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
							{
							setState(412);
							((SeibroItemInfoEtfContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(416);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
						case 1:
							{
							setState(415);
							((SeibroItemInfoEtfContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(421);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(418);
							((SeibroItemInfoEtfContext)_localctx).symbol7 = word();
							}
							}
							setState(423);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(424);
						match(NEWLINE);
						setState(425);
						((SeibroItemInfoEtfContext)_localctx).category = word();
						setState(427);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
						case 1:
							{
							setState(426);
							((SeibroItemInfoEtfContext)_localctx).category1 = word();
							}
							break;
						}
						setState(430);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
						case 1:
							{
							setState(429);
							((SeibroItemInfoEtfContext)_localctx).category2 = word();
							}
							break;
						}
						setState(433);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
						case 1:
							{
							setState(432);
							((SeibroItemInfoEtfContext)_localctx).category3 = word();
							}
							break;
						}
						setState(436);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
						case 1:
							{
							setState(435);
							((SeibroItemInfoEtfContext)_localctx).category4 = word();
							}
							break;
						}
						setState(439);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
						case 1:
							{
							setState(438);
							((SeibroItemInfoEtfContext)_localctx).category5 = word();
							}
							break;
						}
						setState(442);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
						case 1:
							{
							setState(441);
							((SeibroItemInfoEtfContext)_localctx).category6 = word();
							}
							break;
						}
						setState(447);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(444);
							((SeibroItemInfoEtfContext)_localctx).category7 = word();
							}
							}
							setState(449);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(450);
						match(NEWLINE);
						setState(451);
						((SeibroItemInfoEtfContext)_localctx).ipo = match(DATE);
						setState(455);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(452);
							word();
							}
							}
							setState(457);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(458);
						match(NEWLINE);
						setState(459);
						((SeibroItemInfoEtfContext)_localctx).volumeOfListedShares = match(NUMBER);
						setState(460);
						match(NEWLINE);
						setState(461);
						((SeibroItemInfoEtfContext)_localctx).fee = word();
						setState(462);
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
						setState(467); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==KEYWORD );
					setState(469);
					match(WORD);
					setState(470);
					match(TAB);
					setState(471);
					match(WORD);
					setState(472);
					match(TAB);
					setState(473);
					match(DATE);
					setState(474);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(478); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(480);
			match(KEYWORD);
			setState(481);
			match(TAB);
			setState(482);
			match(WORD);
			setState(483);
			match(TAB);
			setState(484);
			match(WORD);
			setState(485);
			match(WORD);
			setState(486);
			match(WORD);
			setState(487);
			match(WORD);
			setState(488);
			match(WORD);
			setState(489);
			match(TAB);
			setState(490);
			match(WORD);
			setState(491);
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
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroEtfParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroEtfParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroEtfParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroEtfParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroEtfParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroEtfParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroEtfParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroEtfParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroEtfParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroEtfParser.DATE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SeibroEtfParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SeibroEtfParser.NUMBER, i);
		}
		public CrawlItemEtfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crawlItemEtf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).enterCrawlItemEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).exitCrawlItemEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroEtfVisitor ) return ((SeibroEtfVisitor<? extends T>)visitor).visitCrawlItemEtf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlItemEtfContext crawlItemEtf() throws RecognitionException {
		CrawlItemEtfContext _localctx = new CrawlItemEtfContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_crawlItemEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(KEYWORD);
			setState(494);
			match(TAB);
			setState(495);
			match(WORD);
			setState(496);
			match(TAB);
			setState(497);
			match(WORD);
			setState(498);
			match(WORD);
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
			match(NEWLINE);
			setState(633); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(505);
				match(WORD);
				setState(506);
				match(TAB);
				setState(507);
				match(NEWLINE);
				setState(508);
				match(WORD);
				setState(509);
				match(TAB);
				setState(510);
				match(WORD);
				setState(511);
				match(TAB);
				setState(512);
				match(WORD);
				setState(513);
				match(TAB);
				setState(514);
				match(TAB);
				setState(515);
				match(WORD);
				setState(516);
				match(TAB);
				setState(517);
				match(WORD);
				setState(518);
				match(TAB);
				setState(519);
				match(WORD);
				setState(520);
				match(TAB);
				setState(521);
				match(WORD);
				setState(522);
				match(NEWLINE);
				setState(523);
				match(WORD);
				setState(524);
				match(TAB);
				setState(525);
				match(TAB);
				setState(526);
				match(TAB);
				setState(527);
				match(WORD);
				setState(528);
				match(TAB);
				setState(529);
				match(TAB);
				setState(530);
				match(TAB);
				setState(531);
				match(TAB);
				setState(532);
				match(TAB);
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
				match(NEWLINE);
				setState(622); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(539);
						((CrawlItemEtfContext)_localctx).type = match(WORD);
						setState(540);
						match(TAB);
						setState(541);
						match(TAB);
						setState(542);
						((CrawlItemEtfContext)_localctx).symbol = word();
						setState(544);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
						case 1:
							{
							setState(543);
							((CrawlItemEtfContext)_localctx).symbol1 = word();
							}
							break;
						}
						setState(547);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
						case 1:
							{
							setState(546);
							((CrawlItemEtfContext)_localctx).symbol2 = word();
							}
							break;
						}
						setState(550);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
						case 1:
							{
							setState(549);
							((CrawlItemEtfContext)_localctx).symbol3 = word();
							}
							break;
						}
						setState(553);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
						case 1:
							{
							setState(552);
							((CrawlItemEtfContext)_localctx).symbol4 = word();
							}
							break;
						}
						setState(556);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
						case 1:
							{
							setState(555);
							((CrawlItemEtfContext)_localctx).symbol5 = word();
							}
							break;
						}
						setState(559);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
						case 1:
							{
							setState(558);
							((CrawlItemEtfContext)_localctx).symbol6 = word();
							}
							break;
						}
						setState(564);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(561);
							((CrawlItemEtfContext)_localctx).symbol7 = word();
							}
							}
							setState(566);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(567);
						match(TAB);
						setState(568);
						((CrawlItemEtfContext)_localctx).code = word();
						setState(569);
						match(TAB);
						setState(570);
						((CrawlItemEtfContext)_localctx).category = word();
						setState(572);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
						case 1:
							{
							setState(571);
							((CrawlItemEtfContext)_localctx).category1 = word();
							}
							break;
						}
						setState(575);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
						case 1:
							{
							setState(574);
							((CrawlItemEtfContext)_localctx).category2 = word();
							}
							break;
						}
						setState(578);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
						case 1:
							{
							setState(577);
							((CrawlItemEtfContext)_localctx).category3 = word();
							}
							break;
						}
						setState(581);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
						case 1:
							{
							setState(580);
							((CrawlItemEtfContext)_localctx).category4 = word();
							}
							break;
						}
						setState(584);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
						case 1:
							{
							setState(583);
							((CrawlItemEtfContext)_localctx).category5 = word();
							}
							break;
						}
						setState(587);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
						case 1:
							{
							setState(586);
							((CrawlItemEtfContext)_localctx).category6 = word();
							}
							break;
						}
						setState(592);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
							{
							{
							setState(589);
							((CrawlItemEtfContext)_localctx).category7 = word();
							}
							}
							setState(594);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(595);
						match(TAB);
						setState(596);
						((CrawlItemEtfContext)_localctx).asset = match(NUMBER);
						setState(597);
						match(TAB);
						setState(598);
						((CrawlItemEtfContext)_localctx).closing = match(NUMBER);
						setState(599);
						match(TAB);
						setState(600);
						((CrawlItemEtfContext)_localctx).amount = match(NUMBER);
						setState(601);
						match(TAB);
						setState(602);
						match(TAB);
						setState(603);
						match(TAB);
						setState(605);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(604);
							((CrawlItemEtfContext)_localctx).priceEarningsRatio = match(NUMBER);
							}
						}

						setState(607);
						match(TAB);
						setState(608);
						match(TAB);
						setState(609);
						match(TAB);
						setState(610);
						match(TAB);
						setState(611);
						match(TAB);
						setState(612);
						match(TAB);
						setState(614);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NUMBER) {
							{
							setState(613);
							((CrawlItemEtfContext)_localctx).fee = match(NUMBER);
							}
						}

						setState(616);
						match(TAB);
						setState(617);
						((CrawlItemEtfContext)_localctx).operator = match(WORD);
						setState(618);
						match(TAB);
						setState(619);
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
					setState(624); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(626);
				match(WORD);
				setState(627);
				match(TAB);
				setState(628);
				match(WORD);
				setState(629);
				match(TAB);
				setState(630);
				match(DATE);
				setState(631);
				match(NEWLINE);
				}
				}
				setState(635); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(637);
			match(KEYWORD);
			setState(638);
			match(TAB);
			setState(639);
			match(WORD);
			setState(640);
			match(TAB);
			setState(641);
			match(WORD);
			setState(642);
			match(WORD);
			setState(643);
			match(WORD);
			setState(644);
			match(TAB);
			setState(645);
			match(WORD);
			setState(646);
			match(TAB);
			setState(647);
			match(WORD);
			setState(648);
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
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroEtfParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroEtfParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroEtfParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroEtfParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroEtfParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroEtfParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroEtfParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroEtfParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroEtfParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroEtfParser.DATE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SeibroEtfParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SeibroEtfParser.NUMBER, i);
		}
		public CrawlPriceEtfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crawlPriceEtf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).enterCrawlPriceEtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).exitCrawlPriceEtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroEtfVisitor ) return ((SeibroEtfVisitor<? extends T>)visitor).visitCrawlPriceEtf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrawlPriceEtfContext crawlPriceEtf() throws RecognitionException {
		CrawlPriceEtfContext _localctx = new CrawlPriceEtfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_crawlPriceEtf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(KEYWORD);
			setState(651);
			match(TAB);
			setState(652);
			match(WORD);
			setState(653);
			match(WORD);
			setState(654);
			match(TAB);
			setState(655);
			match(WORD);
			setState(656);
			match(TAB);
			setState(657);
			match(WORD);
			setState(658);
			match(TAB);
			setState(659);
			match(WORD);
			setState(660);
			match(NEWLINE);
			setState(802); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(661);
					((CrawlPriceEtfContext)_localctx).code = word();
					setState(662);
					match(TAB);
					setState(664); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(663);
						word();
						}
						}
						setState(666); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
					setState(668);
					match(NEWLINE);
					{
					setState(669);
					match(KEYWORD);
					setState(670);
					match(TAB);
					setState(671);
					((CrawlPriceEtfContext)_localctx).symbol = word();
					setState(673);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						setState(672);
						((CrawlPriceEtfContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(676);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						setState(675);
						((CrawlPriceEtfContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(679);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						setState(678);
						((CrawlPriceEtfContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(682);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						setState(681);
						((CrawlPriceEtfContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(685);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						setState(684);
						((CrawlPriceEtfContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(688);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						setState(687);
						((CrawlPriceEtfContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(693);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(690);
						((CrawlPriceEtfContext)_localctx).symbol7 = word();
						}
						}
						setState(695);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(696);
					match(NEWLINE);
					setState(697);
					match(KEYWORD);
					setState(698);
					match(TAB);
					setState(699);
					((CrawlPriceEtfContext)_localctx).category = word();
					setState(701);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						setState(700);
						((CrawlPriceEtfContext)_localctx).category1 = word();
						}
						break;
					}
					setState(704);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(703);
						((CrawlPriceEtfContext)_localctx).category2 = word();
						}
						break;
					}
					setState(707);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(706);
						((CrawlPriceEtfContext)_localctx).category3 = word();
						}
						break;
					}
					setState(710);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						setState(709);
						((CrawlPriceEtfContext)_localctx).category4 = word();
						}
						break;
					}
					setState(713);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(712);
						((CrawlPriceEtfContext)_localctx).category5 = word();
						}
						break;
					}
					setState(716);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						setState(715);
						((CrawlPriceEtfContext)_localctx).category6 = word();
						}
						break;
					}
					setState(721);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(718);
						((CrawlPriceEtfContext)_localctx).category7 = word();
						}
						}
						setState(723);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(724);
					match(NEWLINE);
					setState(725);
					match(KEYWORD);
					setState(726);
					match(TAB);
					setState(727);
					((CrawlPriceEtfContext)_localctx).ea = match(NUMBER);
					setState(728);
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
					setState(791); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
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
							match(NEWLINE);
							setState(787); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								setState(787);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
								case 1:
									{
									{
									setState(748);
									match(TAB);
									setState(749);
									match(TAB);
									setState(750);
									match(TAB);
									setState(751);
									match(TAB);
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
									}
									}
									break;
								case 2:
									{
									{
									setState(758);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==DATE) {
										{
										setState(757);
										((CrawlPriceEtfContext)_localctx).base = match(DATE);
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
										((CrawlPriceEtfContext)_localctx).closing = match(NUMBER);
										}
									}

									setState(764);
									match(TAB);
									setState(766);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==NUMBER) {
										{
										setState(765);
										match(NUMBER);
										}
									}

									setState(768);
									match(TAB);
									setState(770);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==NUMBER) {
										{
										setState(769);
										((CrawlPriceEtfContext)_localctx).market = match(NUMBER);
										}
									}

									setState(772);
									match(TAB);
									setState(774);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==NUMBER) {
										{
										setState(773);
										((CrawlPriceEtfContext)_localctx).high = match(NUMBER);
										}
									}

									setState(776);
									match(TAB);
									setState(777);
									((CrawlPriceEtfContext)_localctx).low = match(NUMBER);
									setState(778);
									match(TAB);
									setState(779);
									((CrawlPriceEtfContext)_localctx).volume = match(NUMBER);
									setState(780);
									match(TAB);
									setState(782);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==NUMBER) {
										{
										setState(781);
										match(NUMBER);
										}
									}

									setState(784);
									match(TAB);
									setState(785);
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
								setState(789); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==TAB || _la==DATE );
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(793); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(795);
					match(WORD);
					setState(796);
					match(TAB);
					setState(797);
					match(WORD);
					setState(798);
					match(TAB);
					setState(799);
					match(DATE);
					setState(800);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(804); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(806);
			match(KEYWORD);
			setState(807);
			match(TAB);
			setState(808);
			match(WORD);
			setState(809);
			match(WORD);
			setState(810);
			match(TAB);
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
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroEtfParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroEtfParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroEtfParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroEtfParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroEtfParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroEtfParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroEtfParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroEtfParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroEtfParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroEtfParser.DATE, i);
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
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).enterCrawlEtfDetailThread(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).exitCrawlEtfDetailThread(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroEtfVisitor ) return ((SeibroEtfVisitor<? extends T>)visitor).visitCrawlEtfDetailThread(this);
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
			setState(818);
			match(KEYWORD);
			setState(819);
			match(TAB);
			setState(820);
			match(WORD);
			setState(821);
			match(WORD);
			setState(822);
			match(TAB);
			setState(823);
			match(WORD);
			setState(824);
			match(TAB);
			setState(825);
			match(WORD);
			setState(826);
			match(NEWLINE);
			setState(908); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(827);
					match(KEYWORD);
					setState(828);
					match(TAB);
					setState(829);
					((CrawlEtfDetailThreadContext)_localctx).code = word();
					setState(830);
					match(TAB);
					setState(834);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(831);
						word();
						}
						}
						setState(836);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(837);
					match(NEWLINE);
					setState(838);
					((CrawlEtfDetailThreadContext)_localctx).symbol = word();
					setState(840);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						setState(839);
						((CrawlEtfDetailThreadContext)_localctx).symbol1 = word();
						}
						break;
					}
					setState(843);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						setState(842);
						((CrawlEtfDetailThreadContext)_localctx).symbol2 = word();
						}
						break;
					}
					setState(846);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(845);
						((CrawlEtfDetailThreadContext)_localctx).symbol3 = word();
						}
						break;
					}
					setState(849);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
					case 1:
						{
						setState(848);
						((CrawlEtfDetailThreadContext)_localctx).symbol4 = word();
						}
						break;
					}
					setState(852);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						setState(851);
						((CrawlEtfDetailThreadContext)_localctx).symbol5 = word();
						}
						break;
					}
					setState(855);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						setState(854);
						((CrawlEtfDetailThreadContext)_localctx).symbol6 = word();
						}
						break;
					}
					setState(860);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(857);
						((CrawlEtfDetailThreadContext)_localctx).symbol7 = word();
						}
						}
						setState(862);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(863);
					match(NEWLINE);
					setState(864);
					((CrawlEtfDetailThreadContext)_localctx).category = word();
					setState(866);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						setState(865);
						((CrawlEtfDetailThreadContext)_localctx).category1 = word();
						}
						break;
					}
					setState(869);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
					case 1:
						{
						setState(868);
						((CrawlEtfDetailThreadContext)_localctx).category2 = word();
						}
						break;
					}
					setState(872);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
					case 1:
						{
						setState(871);
						((CrawlEtfDetailThreadContext)_localctx).category3 = word();
						}
						break;
					}
					setState(875);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
					case 1:
						{
						setState(874);
						((CrawlEtfDetailThreadContext)_localctx).category4 = word();
						}
						break;
					}
					setState(878);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						setState(877);
						((CrawlEtfDetailThreadContext)_localctx).category5 = word();
						}
						break;
					}
					setState(881);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
					case 1:
						{
						setState(880);
						((CrawlEtfDetailThreadContext)_localctx).category6 = word();
						}
						break;
					}
					setState(886);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
						{
						{
						setState(883);
						((CrawlEtfDetailThreadContext)_localctx).category7 = word();
						}
						}
						setState(888);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(889);
					match(NEWLINE);
					setState(890);
					((CrawlEtfDetailThreadContext)_localctx).ipo = match(DATE);
					setState(894);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WORD) {
						{
						{
						setState(891);
						match(WORD);
						}
						}
						setState(896);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(897);
					match(NEWLINE);
					setState(898);
					((CrawlEtfDetailThreadContext)_localctx).fee = word();
					setState(899);
					match(NEWLINE);
					setState(900);
					match(WORD);
					setState(901);
					match(TAB);
					setState(902);
					match(WORD);
					setState(903);
					match(TAB);
					setState(904);
					match(DATE);
					setState(905);
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
				setState(910); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(912);
			match(KEYWORD);
			setState(913);
			match(TAB);
			setState(914);
			match(WORD);
			setState(915);
			match(WORD);
			setState(916);
			match(TAB);
			setState(917);
			match(WORD);
			setState(918);
			match(TAB);
			setState(919);
			match(WORD);
			setState(920);
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
		public List<TerminalNode> KEYWORD() { return getTokens(SeibroEtfParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SeibroEtfParser.KEYWORD, i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroEtfParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroEtfParser.TAB, i);
		}
		public List<TerminalNode> WORD() { return getTokens(SeibroEtfParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SeibroEtfParser.WORD, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroEtfParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroEtfParser.NEWLINE, i);
		}
		public List<TerminalNode> DATE() { return getTokens(SeibroEtfParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SeibroEtfParser.DATE, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SeibroEtfParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SeibroEtfParser.NUMBER, i);
		}
		public CrawlDividendHistoryEtfThreadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crawlDividendHistoryEtfThread; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).enterCrawlDividendHistoryEtfThread(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).exitCrawlDividendHistoryEtfThread(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroEtfVisitor ) return ((SeibroEtfVisitor<? extends T>)visitor).visitCrawlDividendHistoryEtfThread(this);
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
			setState(922);
			match(KEYWORD);
			setState(923);
			match(TAB);
			setState(924);
			match(WORD);
			setState(925);
			match(WORD);
			setState(926);
			match(WORD);
			setState(927);
			match(TAB);
			setState(928);
			match(WORD);
			setState(929);
			match(WORD);
			setState(930);
			match(WORD);
			setState(931);
			match(TAB);
			setState(932);
			match(WORD);
			setState(933);
			match(TAB);
			setState(934);
			match(WORD);
			setState(935);
			match(NEWLINE);
			setState(1040); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(936);
				match(WORD);
				setState(937);
				match(TAB);
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORD) {
					{
					setState(938);
					match(WORD);
					}
				}

				setState(941);
				match(TAB);
				setState(942);
				match(WORD);
				setState(943);
				match(TAB);
				setState(944);
				match(WORD);
				setState(945);
				match(TAB);
				setState(946);
				match(WORD);
				setState(947);
				match(TAB);
				setState(948);
				match(WORD);
				setState(949);
				match(TAB);
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
				match(TAB);
				setState(956);
				match(WORD);
				setState(957);
				match(TAB);
				setState(958);
				match(NEWLINE);
				setState(1030); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(1030);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case TAB:
							{
							{
							setState(959);
							match(TAB);
							setState(960);
							match(TAB);
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
							match(TAB);
							setState(967);
							match(TAB);
							setState(968);
							match(TAB);
							setState(969);
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
							setState(970);
							((CrawlDividendHistoryEtfThreadContext)_localctx).symbol = word();
							setState(972);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
							case 1:
								{
								setState(971);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol1 = word();
								}
								break;
							}
							setState(975);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
							case 1:
								{
								setState(974);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol2 = word();
								}
								break;
							}
							setState(978);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
							case 1:
								{
								setState(977);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol3 = word();
								}
								break;
							}
							setState(981);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
							case 1:
								{
								setState(980);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol4 = word();
								}
								break;
							}
							setState(984);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
							case 1:
								{
								setState(983);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol5 = word();
								}
								break;
							}
							setState(987);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
							case 1:
								{
								setState(986);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol6 = word();
								}
								break;
							}
							setState(992);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(989);
								((CrawlDividendHistoryEtfThreadContext)_localctx).symbol7 = word();
								}
								}
								setState(994);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(995);
							match(TAB);
							setState(996);
							((CrawlDividendHistoryEtfThreadContext)_localctx).code = word();
							setState(997);
							match(TAB);
							setState(998);
							match(WORD);
							setState(999);
							match(TAB);
							setState(1003);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0)) {
								{
								{
								setState(1000);
								word();
								}
								}
								setState(1005);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1006);
							match(TAB);
							setState(1008);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==DATE) {
								{
								setState(1007);
								((CrawlDividendHistoryEtfThreadContext)_localctx).base = match(DATE);
								}
							}

							setState(1010);
							match(TAB);
							setState(1011);
							((CrawlDividendHistoryEtfThreadContext)_localctx).pay = match(DATE);
							setState(1012);
							match(TAB);
							setState(1014);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==WORD) {
								{
								setState(1013);
								match(WORD);
								}
							}

							setState(1016);
							match(TAB);
							setState(1017);
							((CrawlDividendHistoryEtfThreadContext)_localctx).dividend = match(NUMBER);
							setState(1018);
							match(TAB);
							setState(1020);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NUMBER) {
								{
								setState(1019);
								((CrawlDividendHistoryEtfThreadContext)_localctx).price = match(NUMBER);
								}
							}

							setState(1022);
							match(TAB);
							setState(1024);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NUMBER) {
								{
								setState(1023);
								((CrawlDividendHistoryEtfThreadContext)_localctx).ratio = match(NUMBER);
								}
							}

							setState(1026);
							match(TAB);
							setState(1027);
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
					setState(1032); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1034);
				match(WORD);
				setState(1035);
				match(TAB);
				setState(1036);
				match(WORD);
				setState(1037);
				match(TAB);
				setState(1038);
				match(DATE);
				setState(1039);
				match(NEWLINE);
				}
				}
				setState(1042); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(1044);
			match(KEYWORD);
			setState(1045);
			match(TAB);
			setState(1046);
			match(WORD);
			setState(1047);
			match(WORD);
			setState(1048);
			match(WORD);
			setState(1049);
			match(TAB);
			setState(1050);
			match(WORD);
			setState(1051);
			match(WORD);
			setState(1052);
			match(WORD);
			setState(1053);
			match(TAB);
			setState(1054);
			match(WORD);
			setState(1055);
			match(TAB);
			setState(1056);
			match(WORD);
			setState(1057);
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
		public TerminalNode WORD() { return getToken(SeibroEtfParser.WORD, 0); }
		public TerminalNode KEYWORD() { return getToken(SeibroEtfParser.KEYWORD, 0); }
		public TerminalNode NUMBER() { return getToken(SeibroEtfParser.NUMBER, 0); }
		public TerminalNode TIME() { return getToken(SeibroEtfParser.TIME, 0); }
		public TerminalNode DATE() { return getToken(SeibroEtfParser.DATE, 0); }
		public TerminalNode STRING() { return getToken(SeibroEtfParser.STRING, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroEtfVisitor ) return ((SeibroEtfVisitor<? extends T>)visitor).visitWord(this);
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
			setState(1059);
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
		public TerminalNode NEWLINE() { return getToken(SeibroEtfParser.NEWLINE, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> TAB() { return getTokens(SeibroEtfParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroEtfParser.TAB, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroEtfVisitor ) return ((SeibroEtfVisitor<? extends T>)visitor).visitLine(this);
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
			setState(1063); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1063);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(1061);
					word();
					}
					break;
				case TAB:
					{
					setState(1062);
					match(TAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1065); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << KEYWORD) | (1L << DATE) | (1L << TIME) | (1L << NUMBER) | (1L << STRING) | (1L << WORD))) != 0) );
			setState(1067);
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
		public List<TerminalNode> TAB() { return getTokens(SeibroEtfParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(SeibroEtfParser.TAB, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SeibroEtfParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SeibroEtfParser.NEWLINE, i);
		}
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeibroEtfListener ) ((SeibroEtfListener)listener).exitEof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeibroEtfVisitor ) return ((SeibroEtfVisitor<? extends T>)visitor).visitEof(this);
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
			setState(1072); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1072);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case DATE:
				case TIME:
				case NUMBER:
				case STRING:
				case WORD:
					{
					setState(1069);
					word();
					}
					break;
				case TAB:
					{
					setState(1070);
					match(TAB);
					}
					break;
				case NEWLINE:
					{
					setState(1071);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1074); 
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
		"\u0004\u0001\n\u0435\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000 \b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001[\b\u0001\u000b\u0001\f\u0001\\\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001c\b\u0001\u000b\u0001\f\u0001d\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001s\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001w\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001}\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u0081\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0085"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u008f\b\u0001\n\u0001\f\u0001"+
		"\u0092\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001\u009a\b\u0001\u000b\u0001\f\u0001\u009b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u00e3\b\u0002\u000b\u0002\f"+
		"\u0002\u00e4\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00fb\b\u0002\n\u0002"+
		"\f\u0002\u00fe\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0004\u0002\u0106\b\u0002\u000b\u0002\f\u0002"+
		"\u0107\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
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
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u015c"+
		"\b\u0003\u000b\u0003\f\u0003\u015d\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u0167\b\u0003"+
		"\u000b\u0003\f\u0003\u0168\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u018b\b\u0004"+
		"\u000b\u0004\f\u0004\u018c\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0192\b\u0004\u0001\u0004\u0003\u0004\u0195\b\u0004\u0001\u0004\u0003"+
		"\u0004\u0198\b\u0004\u0001\u0004\u0003\u0004\u019b\b\u0004\u0001\u0004"+
		"\u0003\u0004\u019e\b\u0004\u0001\u0004\u0003\u0004\u01a1\b\u0004\u0001"+
		"\u0004\u0005\u0004\u01a4\b\u0004\n\u0004\f\u0004\u01a7\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u01ac\b\u0004\u0001\u0004\u0003\u0004"+
		"\u01af\b\u0004\u0001\u0004\u0003\u0004\u01b2\b\u0004\u0001\u0004\u0003"+
		"\u0004\u01b5\b\u0004\u0001\u0004\u0003\u0004\u01b8\b\u0004\u0001\u0004"+
		"\u0003\u0004\u01bb\b\u0004\u0001\u0004\u0005\u0004\u01be\b\u0004\n\u0004"+
		"\f\u0004\u01c1\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u01c6\b\u0004\n\u0004\f\u0004\u01c9\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u01d2"+
		"\b\u0004\u000b\u0004\f\u0004\u01d3\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u01dd\b\u0004"+
		"\u000b\u0004\f\u0004\u01de\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
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
		"\u0003\u0005\u0221\b\u0005\u0001\u0005\u0003\u0005\u0224\b\u0005\u0001"+
		"\u0005\u0003\u0005\u0227\b\u0005\u0001\u0005\u0003\u0005\u022a\b\u0005"+
		"\u0001\u0005\u0003\u0005\u022d\b\u0005\u0001\u0005\u0003\u0005\u0230\b"+
		"\u0005\u0001\u0005\u0005\u0005\u0233\b\u0005\n\u0005\f\u0005\u0236\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u023d\b\u0005\u0001\u0005\u0003\u0005\u0240\b\u0005\u0001\u0005\u0003"+
		"\u0005\u0243\b\u0005\u0001\u0005\u0003\u0005\u0246\b\u0005\u0001\u0005"+
		"\u0003\u0005\u0249\b\u0005\u0001\u0005\u0003\u0005\u024c\b\u0005\u0001"+
		"\u0005\u0005\u0005\u024f\b\u0005\n\u0005\f\u0005\u0252\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u025e\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0267\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0004\u0005\u026f\b\u0005\u000b\u0005\f\u0005"+
		"\u0270\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0004\u0005\u027a\b\u0005\u000b\u0005\f\u0005\u027b"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u0299\b\u0006\u000b\u0006"+
		"\f\u0006\u029a\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u02a2\b\u0006\u0001\u0006\u0003\u0006\u02a5\b\u0006\u0001"+
		"\u0006\u0003\u0006\u02a8\b\u0006\u0001\u0006\u0003\u0006\u02ab\b\u0006"+
		"\u0001\u0006\u0003\u0006\u02ae\b\u0006\u0001\u0006\u0003\u0006\u02b1\b"+
		"\u0006\u0001\u0006\u0005\u0006\u02b4\b\u0006\n\u0006\f\u0006\u02b7\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u02be\b\u0006\u0001\u0006\u0003\u0006\u02c1\b\u0006\u0001\u0006\u0003"+
		"\u0006\u02c4\b\u0006\u0001\u0006\u0003\u0006\u02c7\b\u0006\u0001\u0006"+
		"\u0003\u0006\u02ca\b\u0006\u0001\u0006\u0003\u0006\u02cd\b\u0006\u0001"+
		"\u0006\u0005\u0006\u02d0\b\u0006\n\u0006\f\u0006\u02d3\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u02f7\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u02fb\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u02ff\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0303\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0307\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u030f\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u0314\b\u0006\u000b\u0006\f"+
		"\u0006\u0315\u0004\u0006\u0318\b\u0006\u000b\u0006\f\u0006\u0319\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0004\u0006\u0323\b\u0006\u000b\u0006\f\u0006\u0324\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u0341\b\u0007\n\u0007\f\u0007\u0344\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0349\b\u0007\u0001\u0007\u0003"+
		"\u0007\u034c\b\u0007\u0001\u0007\u0003\u0007\u034f\b\u0007\u0001\u0007"+
		"\u0003\u0007\u0352\b\u0007\u0001\u0007\u0003\u0007\u0355\b\u0007\u0001"+
		"\u0007\u0003\u0007\u0358\b\u0007\u0001\u0007\u0005\u0007\u035b\b\u0007"+
		"\n\u0007\f\u0007\u035e\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0363\b\u0007\u0001\u0007\u0003\u0007\u0366\b\u0007\u0001\u0007"+
		"\u0003\u0007\u0369\b\u0007\u0001\u0007\u0003\u0007\u036c\b\u0007\u0001"+
		"\u0007\u0003\u0007\u036f\b\u0007\u0001\u0007\u0003\u0007\u0372\b\u0007"+
		"\u0001\u0007\u0005\u0007\u0375\b\u0007\n\u0007\f\u0007\u0378\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u037d\b\u0007\n\u0007\f\u0007"+
		"\u0380\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0004\u0007\u038d\b\u0007\u000b\u0007\f\u0007\u038e\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u03ac\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u03cd\b\b\u0001\b\u0003\b\u03d0\b\b\u0001\b\u0003\b\u03d3\b"+
		"\b\u0001\b\u0003\b\u03d6\b\b\u0001\b\u0003\b\u03d9\b\b\u0001\b\u0003\b"+
		"\u03dc\b\b\u0001\b\u0005\b\u03df\b\b\n\b\f\b\u03e2\t\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u03ea\b\b\n\b\f\b\u03ed\t\b\u0001"+
		"\b\u0001\b\u0003\b\u03f1\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u03f7"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u03fd\b\b\u0001\b\u0001\b"+
		"\u0003\b\u0401\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u0407\b\b\u000b"+
		"\b\f\b\u0408\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u0411"+
		"\b\b\u000b\b\f\b\u0412\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0004\n\u0428\b\n\u000b\n\f\n\u0429"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u0431"+
		"\b\u000b\u000b\u000b\f\u000b\u0432\u0001\u000b\u0000\u0000\f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0001\u0001\u0000"+
		"\u0005\n\u04a1\u0000\u001f\u0001\u0000\u0000\u0000\u0002!\u0001\u0000"+
		"\u0000\u0000\u0004\u00a8\u0001\u0000\u0000\u0000\u0006\u0116\u0001\u0000"+
		"\u0000\u0000\b\u0179\u0001\u0000\u0000\u0000\n\u01ed\u0001\u0000\u0000"+
		"\u0000\f\u028a\u0001\u0000\u0000\u0000\u000e\u0332\u0001\u0000\u0000\u0000"+
		"\u0010\u039a\u0001\u0000\u0000\u0000\u0012\u0423\u0001\u0000\u0000\u0000"+
		"\u0014\u0427\u0001\u0000\u0000\u0000\u0016\u0430\u0001\u0000\u0000\u0000"+
		"\u0018 \u0003\u0010\b\u0000\u0019 \u0003\n\u0005\u0000\u001a \u0003\u000e"+
		"\u0007\u0000\u001b \u0003\f\u0006\u0000\u001c \u0003\b\u0004\u0000\u001d"+
		" \u0003\u0006\u0003\u0000\u001e \u0003\u0002\u0001\u0000\u001f\u0018\u0001"+
		"\u0000\u0000\u0000\u001f\u0019\u0001\u0000\u0000\u0000\u001f\u001a\u0001"+
		"\u0000\u0000\u0000\u001f\u001b\u0001\u0000\u0000\u0000\u001f\u001c\u0001"+
		"\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f\u001e\u0001"+
		"\u0000\u0000\u0000 \u0001\u0001\u0000\u0000\u0000!\"\u0005\u0005\u0000"+
		"\u0000\"#\u0005\u0003\u0000\u0000#$\u0005\n\u0000\u0000$%\u0005\u0003"+
		"\u0000\u0000%&\u0005\n\u0000\u0000&\'\u0005\n\u0000\u0000\'(\u0005\n\u0000"+
		"\u0000()\u0005\u0003\u0000\u0000)*\u0005\n\u0000\u0000*\u0099\u0005\u0004"+
		"\u0000\u0000+,\u0005\n\u0000\u0000,-\u0005\u0006\u0000\u0000-.\u0005\u0003"+
		"\u0000\u0000./\u0005\u0004\u0000\u0000/0\u0005\n\u0000\u000001\u0005\u0006"+
		"\u0000\u000012\u0005\u0003\u0000\u000023\u0005\n\u0000\u000034\u0005\u0003"+
		"\u0000\u000045\u0005\n\u0000\u000056\u0005\u0003\u0000\u000067\u0005\n"+
		"\u0000\u000078\u0005\u0003\u0000\u000089\u0005\n\u0000\u00009:\u0005\u0003"+
		"\u0000\u0000:;\u0005\n\u0000\u0000;<\u0005\u0003\u0000\u0000<=\u0005\n"+
		"\u0000\u0000=>\u0005\u0003\u0000\u0000>?\u0005\n\u0000\u0000?@\u0005\u0003"+
		"\u0000\u0000@A\u0005\n\u0000\u0000AB\u0005\u0003\u0000\u0000BC\u0005\n"+
		"\u0000\u0000CD\u0005\u0003\u0000\u0000DE\u0005\n\u0000\u0000EF\u0005\u0003"+
		"\u0000\u0000FG\u0005\n\u0000\u0000GH\u0005\u0003\u0000\u0000HI\u0005\n"+
		"\u0000\u0000IJ\u0005\u0003\u0000\u0000JK\u0005\n\u0000\u0000KL\u0005\u0003"+
		"\u0000\u0000LM\u0005\n\u0000\u0000MN\u0005\u0003\u0000\u0000NO\u0005\n"+
		"\u0000\u0000OP\u0005\u0003\u0000\u0000PQ\u0005\n\u0000\u0000QR\u0005\u0003"+
		"\u0000\u0000RS\u0005\n\u0000\u0000ST\u0005\u0003\u0000\u0000T\u0090\u0005"+
		"\u0004\u0000\u0000UV\u0005\n\u0000\u0000VW\u0005\u0006\u0000\u0000WX\u0005"+
		"\u0003\u0000\u0000XZ\u0005\u0003\u0000\u0000Y[\u0003\u0012\t\u0000ZY\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0005\u0003\u0000"+
		"\u0000_`\u0003\u0012\t\u0000`b\u0005\u0003\u0000\u0000ac\u0003\u0012\t"+
		"\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0005"+
		"\u0003\u0000\u0000gh\u0005\b\u0000\u0000hi\u0005\u0003\u0000\u0000ij\u0005"+
		"\b\u0000\u0000jk\u0005\u0003\u0000\u0000kl\u0005\b\u0000\u0000lm\u0005"+
		"\u0003\u0000\u0000mn\u0005\b\u0000\u0000no\u0005\u0003\u0000\u0000op\u0005"+
		"\b\u0000\u0000pr\u0005\u0003\u0000\u0000qs\u0005\b\u0000\u0000rq\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"tv\u0005\u0003\u0000\u0000uw\u0005\b\u0000\u0000vu\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0005\u0003\u0000"+
		"\u0000yz\u0005\b\u0000\u0000z|\u0005\u0003\u0000\u0000{}\u0005\b\u0000"+
		"\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u0080\u0005\u0003\u0000\u0000\u007f\u0081\u0005\b\u0000"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0005\u0003\u0000"+
		"\u0000\u0083\u0085\u0005\b\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0005\u0003\u0000\u0000\u0087\u0088\u0005\b\u0000\u0000\u0088"+
		"\u0089\u0005\u0003\u0000\u0000\u0089\u008a\u0005\n\u0000\u0000\u008a\u008b"+
		"\u0005\u0003\u0000\u0000\u008b\u008c\u0005\u0004\u0000\u0000\u008c\u008d"+
		"\u0006\u0001\uffff\uffff\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e"+
		"U\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093"+
		"\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0005\n\u0000\u0000\u0094\u0095\u0005\u0003\u0000\u0000\u0095\u0096\u0005"+
		"\n\u0000\u0000\u0096\u0097\u0005\u0003\u0000\u0000\u0097\u0098\u0005\u0006"+
		"\u0000\u0000\u0098\u009a\u0005\u0004\u0000\u0000\u0099+\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005\u0005\u0000\u0000\u009e\u009f\u0005\u0003\u0000"+
		"\u0000\u009f\u00a0\u0005\n\u0000\u0000\u00a0\u00a1\u0005\u0003\u0000\u0000"+
		"\u00a1\u00a2\u0005\n\u0000\u0000\u00a2\u00a3\u0005\n\u0000\u0000\u00a3"+
		"\u00a4\u0005\n\u0000\u0000\u00a4\u00a5\u0005\u0003\u0000\u0000\u00a5\u00a6"+
		"\u0005\n\u0000\u0000\u00a6\u00a7\u0005\u0004\u0000\u0000\u00a7\u0003\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0005\u0005\u0000\u0000\u00a9\u00aa\u0005"+
		"\u0003\u0000\u0000\u00aa\u00ab\u0005\n\u0000\u0000\u00ab\u00ac\u0005\u0003"+
		"\u0000\u0000\u00ac\u00ad\u0005\n\u0000\u0000\u00ad\u00ae\u0005\n\u0000"+
		"\u0000\u00ae\u00af\u0005\n\u0000\u0000\u00af\u00b0\u0005\n\u0000\u0000"+
		"\u00b0\u00b1\u0005\n\u0000\u0000\u00b1\u00b2\u0005\u0003\u0000\u0000\u00b2"+
		"\u00b3\u0005\n\u0000\u0000\u00b3\u0105\u0005\u0004\u0000\u0000\u00b4\u00b5"+
		"\u0005\u0006\u0000\u0000\u00b5\u00b6\u0005\u0003\u0000\u0000\u00b6\u00b7"+
		"\u0005\n\u0000\u0000\u00b7\u00b8\u0005\u0003\u0000\u0000\u00b8\u00b9\u0005"+
		"\n\u0000\u0000\u00b9\u00ba\u0005\u0003\u0000\u0000\u00ba\u00bb\u0005\n"+
		"\u0000\u0000\u00bb\u00bc\u0005\u0003\u0000\u0000\u00bc\u00bd\u0005\n\u0000"+
		"\u0000\u00bd\u00be\u0005\u0003\u0000\u0000\u00be\u00bf\u0005\n\u0000\u0000"+
		"\u00bf\u00c0\u0005\u0003\u0000\u0000\u00c0\u00c1\u0005\n\u0000\u0000\u00c1"+
		"\u00c2\u0005\u0003\u0000\u0000\u00c2\u00c3\u0005\n\u0000\u0000\u00c3\u00c4"+
		"\u0005\u0003\u0000\u0000\u00c4\u00c5\u0005\n\u0000\u0000\u00c5\u00c6\u0005"+
		"\u0003\u0000\u0000\u00c6\u00c7\u0005\n\u0000\u0000\u00c7\u00c8\u0005\u0003"+
		"\u0000\u0000\u00c8\u00c9\u0005\n\u0000\u0000\u00c9\u00ca\u0005\u0003\u0000"+
		"\u0000\u00ca\u00cb\u0005\n\u0000\u0000\u00cb\u00cc\u0005\u0003\u0000\u0000"+
		"\u00cc\u00cd\u0005\n\u0000\u0000\u00cd\u00ce\u0005\u0003\u0000\u0000\u00ce"+
		"\u00cf\u0005\n\u0000\u0000\u00cf\u00d0\u0005\u0003\u0000\u0000\u00d0\u00d1"+
		"\u0005\n\u0000\u0000\u00d1\u00d2\u0005\u0003\u0000\u0000\u00d2\u00d3\u0005"+
		"\n\u0000\u0000\u00d3\u00d4\u0005\u0003\u0000\u0000\u00d4\u00d5\u0005\n"+
		"\u0000\u0000\u00d5\u00d6\u0005\u0003\u0000\u0000\u00d6\u00d7\u0005\n\u0000"+
		"\u0000\u00d7\u00d8\u0005\u0003\u0000\u0000\u00d8\u00fc\u0005\u0004\u0000"+
		"\u0000\u00d9\u00da\u0005\u0006\u0000\u0000\u00da\u00db\u0005\u0003\u0000"+
		"\u0000\u00db\u00dc\u0005\u0003\u0000\u0000\u00dc\u00fb\u0005\u0004\u0000"+
		"\u0000\u00dd\u00de\u0005\u0006\u0000\u0000\u00de\u00df\u0005\u0003\u0000"+
		"\u0000\u00df\u00e0\u0003\u0012\t\u0000\u00e0\u00e2\u0005\u0003\u0000\u0000"+
		"\u00e1\u00e3\u0003\u0012\t\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0005\u0003\u0000\u0000\u00e7\u00e8\u0005\b\u0000\u0000\u00e8\u00e9"+
		"\u0005\u0003\u0000\u0000\u00e9\u00ea\u0005\b\u0000\u0000\u00ea\u00eb\u0005"+
		"\u0003\u0000\u0000\u00eb\u00ec\u0005\n\u0000\u0000\u00ec\u00ed\u0005\u0003"+
		"\u0000\u0000\u00ed\u00ee\u0005\b\u0000\u0000\u00ee\u00ef\u0005\u0003\u0000"+
		"\u0000\u00ef\u00f0\u0005\n\u0000\u0000\u00f0\u00f1\u0005\u0003\u0000\u0000"+
		"\u00f1\u00f2\u0005\b\u0000\u0000\u00f2\u00f3\u0005\u0003\u0000\u0000\u00f3"+
		"\u00f4\u0005\b\u0000\u0000\u00f4\u00f5\u0005\u0003\u0000\u0000\u00f5\u00f6"+
		"\u0005\b\u0000\u0000\u00f6\u00f7\u0005\u0003\u0000\u0000\u00f7\u00f8\u0005"+
		"\u0004\u0000\u0000\u00f8\u00f9\u0006\u0002\uffff\uffff\u0000\u00f9\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fa\u00d9\u0001\u0000\u0000\u0000\u00fa\u00dd"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00ff"+
		"\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0005\n\u0000\u0000\u0100\u0101\u0005\u0003\u0000\u0000\u0101\u0102\u0005"+
		"\n\u0000\u0000\u0102\u0103\u0005\u0003\u0000\u0000\u0103\u0104\u0005\u0006"+
		"\u0000\u0000\u0104\u0106\u0005\u0004\u0000\u0000\u0105\u00b4\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0005\u0005\u0000\u0000\u010a\u010b\u0005\u0003"+
		"\u0000\u0000\u010b\u010c\u0005\n\u0000\u0000\u010c\u010d\u0005\u0003\u0000"+
		"\u0000\u010d\u010e\u0005\n\u0000\u0000\u010e\u010f\u0005\n\u0000\u0000"+
		"\u010f\u0110\u0005\n\u0000\u0000\u0110\u0111\u0005\n\u0000\u0000\u0111"+
		"\u0112\u0005\n\u0000\u0000\u0112\u0113\u0005\u0003\u0000\u0000\u0113\u0114"+
		"\u0005\n\u0000\u0000\u0114\u0115\u0005\u0004\u0000\u0000\u0115\u0005\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0005\u0005\u0000\u0000\u0117\u0118\u0005"+
		"\u0003\u0000\u0000\u0118\u0119\u0005\n\u0000\u0000\u0119\u011a\u0005\u0003"+
		"\u0000\u0000\u011a\u011b\u0005\n\u0000\u0000\u011b\u011c\u0005\n\u0000"+
		"\u0000\u011c\u011d\u0005\n\u0000\u0000\u011d\u011e\u0005\n\u0000\u0000"+
		"\u011e\u011f\u0005\n\u0000\u0000\u011f\u0120\u0005\n\u0000\u0000\u0120"+
		"\u0121\u0005\n\u0000\u0000\u0121\u0122\u0005\u0003\u0000\u0000\u0122\u0123"+
		"\u0005\n\u0000\u0000\u0123\u0166\u0005\u0004\u0000\u0000\u0124\u0125\u0003"+
		"\u0012\t\u0000\u0125\u0126\u0005\u0003\u0000\u0000\u0126\u0127\u0005\u0004"+
		"\u0000\u0000\u0127\u0128\u0003\u0012\t\u0000\u0128\u0129\u0005\u0003\u0000"+
		"\u0000\u0129\u012a\u0005\n\u0000\u0000\u012a\u012b\u0005\u0003\u0000\u0000"+
		"\u012b\u012c\u0005\n\u0000\u0000\u012c\u012d\u0005\u0003\u0000\u0000\u012d"+
		"\u012e\u0005\n\u0000\u0000\u012e\u012f\u0005\u0003\u0000\u0000\u012f\u0130"+
		"\u0005\n\u0000\u0000\u0130\u0131\u0005\u0003\u0000\u0000\u0131\u0132\u0005"+
		"\n\u0000\u0000\u0132\u0133\u0005\u0003\u0000\u0000\u0133\u0134\u0005\n"+
		"\u0000\u0000\u0134\u0135\u0005\u0003\u0000\u0000\u0135\u0136\u0005\n\u0000"+
		"\u0000\u0136\u0137\u0005\u0003\u0000\u0000\u0137\u0138\u0005\n\u0000\u0000"+
		"\u0138\u0139\u0005\u0003\u0000\u0000\u0139\u015b\u0005\u0004\u0000\u0000"+
		"\u013a\u013b\u0003\u0012\t\u0000\u013b\u013c\u0005\u0003\u0000\u0000\u013c"+
		"\u013d\u0005\u0003\u0000\u0000\u013d\u013e\u0005\u0003\u0000\u0000\u013e"+
		"\u013f\u0005\u0003\u0000\u0000\u013f\u0140\u0005\u0003\u0000\u0000\u0140"+
		"\u0141\u0005\u0003\u0000\u0000\u0141\u0142\u0005\u0003\u0000\u0000\u0142"+
		"\u0143\u0005\u0003\u0000\u0000\u0143\u0144\u0005\u0003\u0000\u0000\u0144"+
		"\u0145\u0005\u0004\u0000\u0000\u0145\u015c\u0001\u0000\u0000\u0000\u0146"+
		"\u0147\u0003\u0012\t\u0000\u0147\u0148\u0005\u0003\u0000\u0000\u0148\u0149"+
		"\u0005\u0006\u0000\u0000\u0149\u014a\u0005\u0003\u0000\u0000\u014a\u014b"+
		"\u0005\b\u0000\u0000\u014b\u014c\u0005\u0003\u0000\u0000\u014c\u014d\u0005"+
		"\b\u0000\u0000\u014d\u014e\u0005\u0003\u0000\u0000\u014e\u014f\u0005\b"+
		"\u0000\u0000\u014f\u0150\u0005\u0003\u0000\u0000\u0150\u0151\u0005\b\u0000"+
		"\u0000\u0151\u0152\u0005\u0003\u0000\u0000\u0152\u0153\u0005\b\u0000\u0000"+
		"\u0153\u0154\u0005\u0003\u0000\u0000\u0154\u0155\u0005\b\u0000\u0000\u0155"+
		"\u0156\u0005\u0003\u0000\u0000\u0156\u0157\u0005\b\u0000\u0000\u0157\u0158"+
		"\u0005\u0003\u0000\u0000\u0158\u0159\u0005\u0004\u0000\u0000\u0159\u015a"+
		"\u0006\u0003\uffff\uffff\u0000\u015a\u015c\u0001\u0000\u0000\u0000\u015b"+
		"\u013a\u0001\u0000\u0000\u0000\u015b\u0146\u0001\u0000\u0000\u0000\u015c"+
		"\u015d\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d"+
		"\u015e\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f"+
		"\u0160\u0005\n\u0000\u0000\u0160\u0161\u0005\u0003\u0000\u0000\u0161\u0162"+
		"\u0005\n\u0000\u0000\u0162\u0163\u0005\u0003\u0000\u0000\u0163\u0164\u0005"+
		"\u0006\u0000\u0000\u0164\u0165\u0005\u0004\u0000\u0000\u0165\u0167\u0001"+
		"\u0000\u0000\u0000\u0166\u0124\u0001\u0000\u0000\u0000\u0167\u0168\u0001"+
		"\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001"+
		"\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016b\u0005"+
		"\u0005\u0000\u0000\u016b\u016c\u0005\u0003\u0000\u0000\u016c\u016d\u0005"+
		"\n\u0000\u0000\u016d\u016e\u0005\u0003\u0000\u0000\u016e\u016f\u0005\n"+
		"\u0000\u0000\u016f\u0170\u0005\n\u0000\u0000\u0170\u0171\u0005\n\u0000"+
		"\u0000\u0171\u0172\u0005\n\u0000\u0000\u0172\u0173\u0005\n\u0000\u0000"+
		"\u0173\u0174\u0005\n\u0000\u0000\u0174\u0175\u0005\n\u0000\u0000\u0175"+
		"\u0176\u0005\u0003\u0000\u0000\u0176\u0177\u0005\n\u0000\u0000\u0177\u0178"+
		"\u0005\u0004\u0000\u0000\u0178\u0007\u0001\u0000\u0000\u0000\u0179\u017a"+
		"\u0005\u0005\u0000\u0000\u017a\u017b\u0005\u0003\u0000\u0000\u017b\u017c"+
		"\u0005\n\u0000\u0000\u017c\u017d\u0005\u0003\u0000\u0000\u017d\u017e\u0005"+
		"\n\u0000\u0000\u017e\u017f\u0005\n\u0000\u0000\u017f\u0180\u0005\n\u0000"+
		"\u0000\u0180\u0181\u0005\n\u0000\u0000\u0181\u0182\u0005\n\u0000\u0000"+
		"\u0182\u0183\u0005\u0003\u0000\u0000\u0183\u0184\u0005\n\u0000\u0000\u0184"+
		"\u01dc\u0005\u0004\u0000\u0000\u0185\u0186\u0005\u0005\u0000\u0000\u0186"+
		"\u0187\u0005\u0003\u0000\u0000\u0187\u0188\u0003\u0012\t\u0000\u0188\u018a"+
		"\u0005\u0003\u0000\u0000\u0189\u018b\u0003\u0012\t\u0000\u018a\u0189\u0001"+
		"\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018a\u0001"+
		"\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018e\u0001"+
		"\u0000\u0000\u0000\u018e\u018f\u0005\u0004\u0000\u0000\u018f\u0191\u0003"+
		"\u0012\t\u0000\u0190\u0192\u0003\u0012\t\u0000\u0191\u0190\u0001\u0000"+
		"\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0194\u0001\u0000"+
		"\u0000\u0000\u0193\u0195\u0003\u0012\t\u0000\u0194\u0193\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0197\u0001\u0000\u0000"+
		"\u0000\u0196\u0198\u0003\u0012\t\u0000\u0197\u0196\u0001\u0000\u0000\u0000"+
		"\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u019a\u0001\u0000\u0000\u0000"+
		"\u0199\u019b\u0003\u0012\t\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019a"+
		"\u019b\u0001\u0000\u0000\u0000\u019b\u019d\u0001\u0000\u0000\u0000\u019c"+
		"\u019e\u0003\u0012\t\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019d\u019e"+
		"\u0001\u0000\u0000\u0000\u019e\u01a0\u0001\u0000\u0000\u0000\u019f\u01a1"+
		"\u0003\u0012\t\u0000\u01a0\u019f\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a1\u01a5\u0001\u0000\u0000\u0000\u01a2\u01a4\u0003"+
		"\u0012\t\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a8\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a9\u0005\u0004\u0000\u0000\u01a9\u01ab\u0003\u0012"+
		"\t\u0000\u01aa\u01ac\u0003\u0012\t\u0000\u01ab\u01aa\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ae\u0001\u0000\u0000"+
		"\u0000\u01ad\u01af\u0003\u0012\t\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000"+
		"\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b1\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b2\u0003\u0012\t\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b1"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b5\u0003\u0012\t\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b4\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01b8"+
		"\u0003\u0012\t\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001"+
		"\u0000\u0000\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9\u01bb\u0003"+
		"\u0012\t\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bf\u0001\u0000\u0000\u0000\u01bc\u01be\u0003\u0012"+
		"\t\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01be\u01c1\u0001\u0000\u0000"+
		"\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000"+
		"\u0000\u01c0\u01c2\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c3\u0005\u0004\u0000\u0000\u01c3\u01c7\u0005\u0006\u0000"+
		"\u0000\u01c4\u01c6\u0003\u0012\t\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c9\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01ca\u0001\u0000\u0000\u0000"+
		"\u01c9\u01c7\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005\u0004\u0000\u0000"+
		"\u01cb\u01cc\u0005\b\u0000\u0000\u01cc\u01cd\u0005\u0004\u0000\u0000\u01cd"+
		"\u01ce\u0003\u0012\t\u0000\u01ce\u01cf\u0005\u0004\u0000\u0000\u01cf\u01d0"+
		"\u0006\u0004\uffff\uffff\u0000\u01d0\u01d2\u0001\u0000\u0000\u0000\u01d1"+
		"\u0185\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d6\u0005\n\u0000\u0000\u01d6\u01d7"+
		"\u0005\u0003\u0000\u0000\u01d7\u01d8\u0005\n\u0000\u0000\u01d8\u01d9\u0005"+
		"\u0003\u0000\u0000\u01d9\u01da\u0005\u0006\u0000\u0000\u01da\u01db\u0005"+
		"\u0004\u0000\u0000\u01db\u01dd\u0001\u0000\u0000\u0000\u01dc\u01d1\u0001"+
		"\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01dc\u0001"+
		"\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e0\u01e1\u0005\u0005\u0000\u0000\u01e1\u01e2\u0005"+
		"\u0003\u0000\u0000\u01e2\u01e3\u0005\n\u0000\u0000\u01e3\u01e4\u0005\u0003"+
		"\u0000\u0000\u01e4\u01e5\u0005\n\u0000\u0000\u01e5\u01e6\u0005\n\u0000"+
		"\u0000\u01e6\u01e7\u0005\n\u0000\u0000\u01e7\u01e8\u0005\n\u0000\u0000"+
		"\u01e8\u01e9\u0005\n\u0000\u0000\u01e9\u01ea\u0005\u0003\u0000\u0000\u01ea"+
		"\u01eb\u0005\n\u0000\u0000\u01eb\u01ec\u0005\u0004\u0000\u0000\u01ec\t"+
		"\u0001\u0000\u0000\u0000\u01ed\u01ee\u0005\u0005\u0000\u0000\u01ee\u01ef"+
		"\u0005\u0003\u0000\u0000\u01ef\u01f0\u0005\n\u0000\u0000\u01f0\u01f1\u0005"+
		"\u0003\u0000\u0000\u01f1\u01f2\u0005\n\u0000\u0000\u01f2\u01f3\u0005\n"+
		"\u0000\u0000\u01f3\u01f4\u0005\n\u0000\u0000\u01f4\u01f5\u0005\u0003\u0000"+
		"\u0000\u01f5\u01f6\u0005\n\u0000\u0000\u01f6\u01f7\u0005\u0003\u0000\u0000"+
		"\u01f7\u01f8\u0005\n\u0000\u0000\u01f8\u0279\u0005\u0004\u0000\u0000\u01f9"+
		"\u01fa\u0005\n\u0000\u0000\u01fa\u01fb\u0005\u0003\u0000\u0000\u01fb\u01fc"+
		"\u0005\u0004\u0000\u0000\u01fc\u01fd\u0005\n\u0000\u0000\u01fd\u01fe\u0005"+
		"\u0003\u0000\u0000\u01fe\u01ff\u0005\n\u0000\u0000\u01ff\u0200\u0005\u0003"+
		"\u0000\u0000\u0200\u0201\u0005\n\u0000\u0000\u0201\u0202\u0005\u0003\u0000"+
		"\u0000\u0202\u0203\u0005\u0003\u0000\u0000\u0203\u0204\u0005\n\u0000\u0000"+
		"\u0204\u0205\u0005\u0003\u0000\u0000\u0205\u0206\u0005\n\u0000\u0000\u0206"+
		"\u0207\u0005\u0003\u0000\u0000\u0207\u0208\u0005\n\u0000\u0000\u0208\u0209"+
		"\u0005\u0003\u0000\u0000\u0209\u020a\u0005\n\u0000\u0000\u020a\u020b\u0005"+
		"\u0004\u0000\u0000\u020b\u020c\u0005\n\u0000\u0000\u020c\u020d\u0005\u0003"+
		"\u0000\u0000\u020d\u020e\u0005\u0003\u0000\u0000\u020e\u020f\u0005\u0003"+
		"\u0000\u0000\u020f\u0210\u0005\n\u0000\u0000\u0210\u0211\u0005\u0003\u0000"+
		"\u0000\u0211\u0212\u0005\u0003\u0000\u0000\u0212\u0213\u0005\u0003\u0000"+
		"\u0000\u0213\u0214\u0005\u0003\u0000\u0000\u0214\u0215\u0005\u0003\u0000"+
		"\u0000\u0215\u0216\u0005\u0003\u0000\u0000\u0216\u0217\u0005\n\u0000\u0000"+
		"\u0217\u0218\u0005\u0003\u0000\u0000\u0218\u0219\u0005\n\u0000\u0000\u0219"+
		"\u021a\u0005\u0003\u0000\u0000\u021a\u026e\u0005\u0004\u0000\u0000\u021b"+
		"\u021c\u0005\n\u0000\u0000\u021c\u021d\u0005\u0003\u0000\u0000\u021d\u021e"+
		"\u0005\u0003\u0000\u0000\u021e\u0220\u0003\u0012\t\u0000\u021f\u0221\u0003"+
		"\u0012\t\u0000\u0220\u021f\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000"+
		"\u0000\u0000\u0221\u0223\u0001\u0000\u0000\u0000\u0222\u0224\u0003\u0012"+
		"\t\u0000\u0223\u0222\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000"+
		"\u0000\u0224\u0226\u0001\u0000\u0000\u0000\u0225\u0227\u0003\u0012\t\u0000"+
		"\u0226\u0225\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000"+
		"\u0227\u0229\u0001\u0000\u0000\u0000\u0228\u022a\u0003\u0012\t\u0000\u0229"+
		"\u0228\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a"+
		"\u022c\u0001\u0000\u0000\u0000\u022b\u022d\u0003\u0012\t\u0000\u022c\u022b"+
		"\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022f"+
		"\u0001\u0000\u0000\u0000\u022e\u0230\u0003\u0012\t\u0000\u022f\u022e\u0001"+
		"\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u0234\u0001"+
		"\u0000\u0000\u0000\u0231\u0233\u0003\u0012\t\u0000\u0232\u0231\u0001\u0000"+
		"\u0000\u0000\u0233\u0236\u0001\u0000\u0000\u0000\u0234\u0232\u0001\u0000"+
		"\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0237\u0001\u0000"+
		"\u0000\u0000\u0236\u0234\u0001\u0000\u0000\u0000\u0237\u0238\u0005\u0003"+
		"\u0000\u0000\u0238\u0239\u0003\u0012\t\u0000\u0239\u023a\u0005\u0003\u0000"+
		"\u0000\u023a\u023c\u0003\u0012\t\u0000\u023b\u023d\u0003\u0012\t\u0000"+
		"\u023c\u023b\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000\u0000"+
		"\u023d\u023f\u0001\u0000\u0000\u0000\u023e\u0240\u0003\u0012\t\u0000\u023f"+
		"\u023e\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240"+
		"\u0242\u0001\u0000\u0000\u0000\u0241\u0243\u0003\u0012\t\u0000\u0242\u0241"+
		"\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0245"+
		"\u0001\u0000\u0000\u0000\u0244\u0246\u0003\u0012\t\u0000\u0245\u0244\u0001"+
		"\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000\u0000\u0246\u0248\u0001"+
		"\u0000\u0000\u0000\u0247\u0249\u0003\u0012\t\u0000\u0248\u0247\u0001\u0000"+
		"\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u024b\u0001\u0000"+
		"\u0000\u0000\u024a\u024c\u0003\u0012\t\u0000\u024b\u024a\u0001\u0000\u0000"+
		"\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c\u0250\u0001\u0000\u0000"+
		"\u0000\u024d\u024f\u0003\u0012\t\u0000\u024e\u024d\u0001\u0000\u0000\u0000"+
		"\u024f\u0252\u0001\u0000\u0000\u0000\u0250\u024e\u0001\u0000\u0000\u0000"+
		"\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0253\u0001\u0000\u0000\u0000"+
		"\u0252\u0250\u0001\u0000\u0000\u0000\u0253\u0254\u0005\u0003\u0000\u0000"+
		"\u0254\u0255\u0005\b\u0000\u0000\u0255\u0256\u0005\u0003\u0000\u0000\u0256"+
		"\u0257\u0005\b\u0000\u0000\u0257\u0258\u0005\u0003\u0000\u0000\u0258\u0259"+
		"\u0005\b\u0000\u0000\u0259\u025a\u0005\u0003\u0000\u0000\u025a\u025b\u0005"+
		"\u0003\u0000\u0000\u025b\u025d\u0005\u0003\u0000\u0000\u025c\u025e\u0005"+
		"\b\u0000\u0000\u025d\u025c\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000"+
		"\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u0260\u0005\u0003"+
		"\u0000\u0000\u0260\u0261\u0005\u0003\u0000\u0000\u0261\u0262\u0005\u0003"+
		"\u0000\u0000\u0262\u0263\u0005\u0003\u0000\u0000\u0263\u0264\u0005\u0003"+
		"\u0000\u0000\u0264\u0266\u0005\u0003\u0000\u0000\u0265\u0267\u0005\b\u0000"+
		"\u0000\u0266\u0265\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000"+
		"\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268\u0269\u0005\u0003\u0000"+
		"\u0000\u0269\u026a\u0005\n\u0000\u0000\u026a\u026b\u0005\u0003\u0000\u0000"+
		"\u026b\u026c\u0005\u0004\u0000\u0000\u026c\u026d\u0006\u0005\uffff\uffff"+
		"\u0000\u026d\u026f\u0001\u0000\u0000\u0000\u026e\u021b\u0001\u0000\u0000"+
		"\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u026e\u0001\u0000\u0000"+
		"\u0000\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000"+
		"\u0000\u0272\u0273\u0005\n\u0000\u0000\u0273\u0274\u0005\u0003\u0000\u0000"+
		"\u0274\u0275\u0005\n\u0000\u0000\u0275\u0276\u0005\u0003\u0000\u0000\u0276"+
		"\u0277\u0005\u0006\u0000\u0000\u0277\u0278\u0005\u0004\u0000\u0000\u0278"+
		"\u027a\u0001\u0000\u0000\u0000\u0279\u01f9\u0001\u0000\u0000\u0000\u027a"+
		"\u027b\u0001\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027b"+
		"\u027c\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027d"+
		"\u027e\u0005\u0005\u0000\u0000\u027e\u027f\u0005\u0003\u0000\u0000\u027f"+
		"\u0280\u0005\n\u0000\u0000\u0280\u0281\u0005\u0003\u0000\u0000\u0281\u0282"+
		"\u0005\n\u0000\u0000\u0282\u0283\u0005\n\u0000\u0000\u0283\u0284\u0005"+
		"\n\u0000\u0000\u0284\u0285\u0005\u0003\u0000\u0000\u0285\u0286\u0005\n"+
		"\u0000\u0000\u0286\u0287\u0005\u0003\u0000\u0000\u0287\u0288\u0005\n\u0000"+
		"\u0000\u0288\u0289\u0005\u0004\u0000\u0000\u0289\u000b\u0001\u0000\u0000"+
		"\u0000\u028a\u028b\u0005\u0005\u0000\u0000\u028b\u028c\u0005\u0003\u0000"+
		"\u0000\u028c\u028d\u0005\n\u0000\u0000\u028d\u028e\u0005\n\u0000\u0000"+
		"\u028e\u028f\u0005\u0003\u0000\u0000\u028f\u0290\u0005\n\u0000\u0000\u0290"+
		"\u0291\u0005\u0003\u0000\u0000\u0291\u0292\u0005\n\u0000\u0000\u0292\u0293"+
		"\u0005\u0003\u0000\u0000\u0293\u0294\u0005\n\u0000\u0000\u0294\u0322\u0005"+
		"\u0004\u0000\u0000\u0295\u0296\u0003\u0012\t\u0000\u0296\u0298\u0005\u0003"+
		"\u0000\u0000\u0297\u0299\u0003\u0012\t\u0000\u0298\u0297\u0001\u0000\u0000"+
		"\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u0298\u0001\u0000\u0000"+
		"\u0000\u029a\u029b\u0001\u0000\u0000\u0000\u029b\u029c\u0001\u0000\u0000"+
		"\u0000\u029c\u029d\u0005\u0004\u0000\u0000\u029d\u029e\u0005\u0005\u0000"+
		"\u0000\u029e\u029f\u0005\u0003\u0000\u0000\u029f\u02a1\u0003\u0012\t\u0000"+
		"\u02a0\u02a2\u0003\u0012\t\u0000\u02a1\u02a0\u0001\u0000\u0000\u0000\u02a1"+
		"\u02a2\u0001\u0000\u0000\u0000\u02a2\u02a4\u0001\u0000\u0000\u0000\u02a3"+
		"\u02a5\u0003\u0012\t\u0000\u02a4\u02a3\u0001\u0000\u0000\u0000\u02a4\u02a5"+
		"\u0001\u0000\u0000\u0000\u02a5\u02a7\u0001\u0000\u0000\u0000\u02a6\u02a8"+
		"\u0003\u0012\t\u0000\u02a7\u02a6\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001"+
		"\u0000\u0000\u0000\u02a8\u02aa\u0001\u0000\u0000\u0000\u02a9\u02ab\u0003"+
		"\u0012\t\u0000\u02aa\u02a9\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000"+
		"\u0000\u0000\u02ab\u02ad\u0001\u0000\u0000\u0000\u02ac\u02ae\u0003\u0012"+
		"\t\u0000\u02ad\u02ac\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000\u0000"+
		"\u0000\u02ae\u02b0\u0001\u0000\u0000\u0000\u02af\u02b1\u0003\u0012\t\u0000"+
		"\u02b0\u02af\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000"+
		"\u02b1\u02b5\u0001\u0000\u0000\u0000\u02b2\u02b4\u0003\u0012\t\u0000\u02b3"+
		"\u02b2\u0001\u0000\u0000\u0000\u02b4\u02b7\u0001\u0000\u0000\u0000\u02b5"+
		"\u02b3\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6"+
		"\u02b8\u0001\u0000\u0000\u0000\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b8"+
		"\u02b9\u0005\u0004\u0000\u0000\u02b9\u02ba\u0005\u0005\u0000\u0000\u02ba"+
		"\u02bb\u0005\u0003\u0000\u0000\u02bb\u02bd\u0003\u0012\t\u0000\u02bc\u02be"+
		"\u0003\u0012\t\u0000\u02bd\u02bc\u0001\u0000\u0000\u0000\u02bd\u02be\u0001"+
		"\u0000\u0000\u0000\u02be\u02c0\u0001\u0000\u0000\u0000\u02bf\u02c1\u0003"+
		"\u0012\t\u0000\u02c0\u02bf\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000"+
		"\u0000\u0000\u02c1\u02c3\u0001\u0000\u0000\u0000\u02c2\u02c4\u0003\u0012"+
		"\t\u0000\u02c3\u02c2\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000"+
		"\u0000\u02c4\u02c6\u0001\u0000\u0000\u0000\u02c5\u02c7\u0003\u0012\t\u0000"+
		"\u02c6\u02c5\u0001\u0000\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000"+
		"\u02c7\u02c9\u0001\u0000\u0000\u0000\u02c8\u02ca\u0003\u0012\t\u0000\u02c9"+
		"\u02c8\u0001\u0000\u0000\u0000\u02c9\u02ca\u0001\u0000\u0000\u0000\u02ca"+
		"\u02cc\u0001\u0000\u0000\u0000\u02cb\u02cd\u0003\u0012\t\u0000\u02cc\u02cb"+
		"\u0001\u0000\u0000\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd\u02d1"+
		"\u0001\u0000\u0000\u0000\u02ce\u02d0\u0003\u0012\t\u0000\u02cf\u02ce\u0001"+
		"\u0000\u0000\u0000\u02d0\u02d3\u0001\u0000\u0000\u0000\u02d1\u02cf\u0001"+
		"\u0000\u0000\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d4\u0001"+
		"\u0000\u0000\u0000\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d4\u02d5\u0005"+
		"\u0004\u0000\u0000\u02d5\u02d6\u0005\u0005\u0000\u0000\u02d6\u02d7\u0005"+
		"\u0003\u0000\u0000\u02d7\u02d8\u0005\b\u0000\u0000\u02d8\u02d9\u0005\u0004"+
		"\u0000\u0000\u02d9\u02da\u0006\u0006\uffff\uffff\u0000\u02da\u0317\u0001"+
		"\u0000\u0000\u0000\u02db\u02dc\u0005\n\u0000\u0000\u02dc\u02dd\u0005\u0003"+
		"\u0000\u0000\u02dd\u02de\u0005\n\u0000\u0000\u02de\u02df\u0005\u0003\u0000"+
		"\u0000\u02df\u02e0\u0005\n\u0000\u0000\u02e0\u02e1\u0005\u0003\u0000\u0000"+
		"\u02e1\u02e2\u0005\n\u0000\u0000\u02e2\u02e3\u0005\u0003\u0000\u0000\u02e3"+
		"\u02e4\u0005\n\u0000\u0000\u02e4\u02e5\u0005\u0003\u0000\u0000\u02e5\u02e6"+
		"\u0005\n\u0000\u0000\u02e6\u02e7\u0005\u0003\u0000\u0000\u02e7\u02e8\u0005"+
		"\n\u0000\u0000\u02e8\u02e9\u0005\u0003\u0000\u0000\u02e9\u02ea\u0005\n"+
		"\u0000\u0000\u02ea\u02eb\u0005\u0003\u0000\u0000\u02eb\u0313\u0005\u0004"+
		"\u0000\u0000\u02ec\u02ed\u0005\u0003\u0000\u0000\u02ed\u02ee\u0005\u0003"+
		"\u0000\u0000\u02ee\u02ef\u0005\u0003\u0000\u0000\u02ef\u02f0\u0005\u0003"+
		"\u0000\u0000\u02f0\u02f1\u0005\u0003\u0000\u0000\u02f1\u02f2\u0005\u0003"+
		"\u0000\u0000\u02f2\u02f3\u0005\u0003\u0000\u0000\u02f3\u02f4\u0005\u0003"+
		"\u0000\u0000\u02f4\u0314\u0005\u0004\u0000\u0000\u02f5\u02f7\u0005\u0006"+
		"\u0000\u0000\u02f6\u02f5\u0001\u0000\u0000\u0000\u02f6\u02f7\u0001\u0000"+
		"\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02fa\u0005\u0003"+
		"\u0000\u0000\u02f9\u02fb\u0005\b\u0000\u0000\u02fa\u02f9\u0001\u0000\u0000"+
		"\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000"+
		"\u0000\u02fc\u02fe\u0005\u0003\u0000\u0000\u02fd\u02ff\u0005\b\u0000\u0000"+
		"\u02fe\u02fd\u0001\u0000\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000\u0000"+
		"\u02ff\u0300\u0001\u0000\u0000\u0000\u0300\u0302\u0005\u0003\u0000\u0000"+
		"\u0301\u0303\u0005\b\u0000\u0000\u0302\u0301\u0001\u0000\u0000\u0000\u0302"+
		"\u0303\u0001\u0000\u0000\u0000\u0303\u0304\u0001\u0000\u0000\u0000\u0304"+
		"\u0306\u0005\u0003\u0000\u0000\u0305\u0307\u0005\b\u0000\u0000\u0306\u0305"+
		"\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000\u0000\u0000\u0307\u0308"+
		"\u0001\u0000\u0000\u0000\u0308\u0309\u0005\u0003\u0000\u0000\u0309\u030a"+
		"\u0005\b\u0000\u0000\u030a\u030b\u0005\u0003\u0000\u0000\u030b\u030c\u0005"+
		"\b\u0000\u0000\u030c\u030e\u0005\u0003\u0000\u0000\u030d\u030f\u0005\b"+
		"\u0000\u0000\u030e\u030d\u0001\u0000\u0000\u0000\u030e\u030f\u0001\u0000"+
		"\u0000\u0000\u030f\u0310\u0001\u0000\u0000\u0000\u0310\u0311\u0005\u0003"+
		"\u0000\u0000\u0311\u0312\u0005\u0004\u0000\u0000\u0312\u0314\u0006\u0006"+
		"\uffff\uffff\u0000\u0313\u02ec\u0001\u0000\u0000\u0000\u0313\u02f6\u0001"+
		"\u0000\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0313\u0001"+
		"\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316\u0318\u0001"+
		"\u0000\u0000\u0000\u0317\u02db\u0001\u0000\u0000\u0000\u0318\u0319\u0001"+
		"\u0000\u0000\u0000\u0319\u0317\u0001\u0000\u0000\u0000\u0319\u031a\u0001"+
		"\u0000\u0000\u0000\u031a\u031b\u0001\u0000\u0000\u0000\u031b\u031c\u0005"+
		"\n\u0000\u0000\u031c\u031d\u0005\u0003\u0000\u0000\u031d\u031e\u0005\n"+
		"\u0000\u0000\u031e\u031f\u0005\u0003\u0000\u0000\u031f\u0320\u0005\u0006"+
		"\u0000\u0000\u0320\u0321\u0005\u0004\u0000\u0000\u0321\u0323\u0001\u0000"+
		"\u0000\u0000\u0322\u0295\u0001\u0000\u0000\u0000\u0323\u0324\u0001\u0000"+
		"\u0000\u0000\u0324\u0322\u0001\u0000\u0000\u0000\u0324\u0325\u0001\u0000"+
		"\u0000\u0000\u0325\u0326\u0001\u0000\u0000\u0000\u0326\u0327\u0005\u0005"+
		"\u0000\u0000\u0327\u0328\u0005\u0003\u0000\u0000\u0328\u0329\u0005\n\u0000"+
		"\u0000\u0329\u032a\u0005\n\u0000\u0000\u032a\u032b\u0005\u0003\u0000\u0000"+
		"\u032b\u032c\u0005\n\u0000\u0000\u032c\u032d\u0005\u0003\u0000\u0000\u032d"+
		"\u032e\u0005\n\u0000\u0000\u032e\u032f\u0005\u0003\u0000\u0000\u032f\u0330"+
		"\u0005\n\u0000\u0000\u0330\u0331\u0005\u0004\u0000\u0000\u0331\r\u0001"+
		"\u0000\u0000\u0000\u0332\u0333\u0005\u0005\u0000\u0000\u0333\u0334\u0005"+
		"\u0003\u0000\u0000\u0334\u0335\u0005\n\u0000\u0000\u0335\u0336\u0005\n"+
		"\u0000\u0000\u0336\u0337\u0005\u0003\u0000\u0000\u0337\u0338\u0005\n\u0000"+
		"\u0000\u0338\u0339\u0005\u0003\u0000\u0000\u0339\u033a\u0005\n\u0000\u0000"+
		"\u033a\u038c\u0005\u0004\u0000\u0000\u033b\u033c\u0005\u0005\u0000\u0000"+
		"\u033c\u033d\u0005\u0003\u0000\u0000\u033d\u033e\u0003\u0012\t\u0000\u033e"+
		"\u0342\u0005\u0003\u0000\u0000\u033f\u0341\u0003\u0012\t\u0000\u0340\u033f"+
		"\u0001\u0000\u0000\u0000\u0341\u0344\u0001\u0000\u0000\u0000\u0342\u0340"+
		"\u0001\u0000\u0000\u0000\u0342\u0343\u0001\u0000\u0000\u0000\u0343\u0345"+
		"\u0001\u0000\u0000\u0000\u0344\u0342\u0001\u0000\u0000\u0000\u0345\u0346"+
		"\u0005\u0004\u0000\u0000\u0346\u0348\u0003\u0012\t\u0000\u0347\u0349\u0003"+
		"\u0012\t\u0000\u0348\u0347\u0001\u0000\u0000\u0000\u0348\u0349\u0001\u0000"+
		"\u0000\u0000\u0349\u034b\u0001\u0000\u0000\u0000\u034a\u034c\u0003\u0012"+
		"\t\u0000\u034b\u034a\u0001\u0000\u0000\u0000\u034b\u034c\u0001\u0000\u0000"+
		"\u0000\u034c\u034e\u0001\u0000\u0000\u0000\u034d\u034f\u0003\u0012\t\u0000"+
		"\u034e\u034d\u0001\u0000\u0000\u0000\u034e\u034f\u0001\u0000\u0000\u0000"+
		"\u034f\u0351\u0001\u0000\u0000\u0000\u0350\u0352\u0003\u0012\t\u0000\u0351"+
		"\u0350\u0001\u0000\u0000\u0000\u0351\u0352\u0001\u0000\u0000\u0000\u0352"+
		"\u0354\u0001\u0000\u0000\u0000\u0353\u0355\u0003\u0012\t\u0000\u0354\u0353"+
		"\u0001\u0000\u0000\u0000\u0354\u0355\u0001\u0000\u0000\u0000\u0355\u0357"+
		"\u0001\u0000\u0000\u0000\u0356\u0358\u0003\u0012\t\u0000\u0357\u0356\u0001"+
		"\u0000\u0000\u0000\u0357\u0358\u0001\u0000\u0000\u0000\u0358\u035c\u0001"+
		"\u0000\u0000\u0000\u0359\u035b\u0003\u0012\t\u0000\u035a\u0359\u0001\u0000"+
		"\u0000\u0000\u035b\u035e\u0001\u0000\u0000\u0000\u035c\u035a\u0001\u0000"+
		"\u0000\u0000\u035c\u035d\u0001\u0000\u0000\u0000\u035d\u035f\u0001\u0000"+
		"\u0000\u0000\u035e\u035c\u0001\u0000\u0000\u0000\u035f\u0360\u0005\u0004"+
		"\u0000\u0000\u0360\u0362\u0003\u0012\t\u0000\u0361\u0363\u0003\u0012\t"+
		"\u0000\u0362\u0361\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000"+
		"\u0000\u0363\u0365\u0001\u0000\u0000\u0000\u0364\u0366\u0003\u0012\t\u0000"+
		"\u0365\u0364\u0001\u0000\u0000\u0000\u0365\u0366\u0001\u0000\u0000\u0000"+
		"\u0366\u0368\u0001\u0000\u0000\u0000\u0367\u0369\u0003\u0012\t\u0000\u0368"+
		"\u0367\u0001\u0000\u0000\u0000\u0368\u0369\u0001\u0000\u0000\u0000\u0369"+
		"\u036b\u0001\u0000\u0000\u0000\u036a\u036c\u0003\u0012\t\u0000\u036b\u036a"+
		"\u0001\u0000\u0000\u0000\u036b\u036c\u0001\u0000\u0000\u0000\u036c\u036e"+
		"\u0001\u0000\u0000\u0000\u036d\u036f\u0003\u0012\t\u0000\u036e\u036d\u0001"+
		"\u0000\u0000\u0000\u036e\u036f\u0001\u0000\u0000\u0000\u036f\u0371\u0001"+
		"\u0000\u0000\u0000\u0370\u0372\u0003\u0012\t\u0000\u0371\u0370\u0001\u0000"+
		"\u0000\u0000\u0371\u0372\u0001\u0000\u0000\u0000\u0372\u0376\u0001\u0000"+
		"\u0000\u0000\u0373\u0375\u0003\u0012\t\u0000\u0374\u0373\u0001\u0000\u0000"+
		"\u0000\u0375\u0378\u0001\u0000\u0000\u0000\u0376\u0374\u0001\u0000\u0000"+
		"\u0000\u0376\u0377\u0001\u0000\u0000\u0000\u0377\u0379\u0001\u0000\u0000"+
		"\u0000\u0378\u0376\u0001\u0000\u0000\u0000\u0379\u037a\u0005\u0004\u0000"+
		"\u0000\u037a\u037e\u0005\u0006\u0000\u0000\u037b\u037d\u0005\n\u0000\u0000"+
		"\u037c\u037b\u0001\u0000\u0000\u0000\u037d\u0380\u0001\u0000\u0000\u0000"+
		"\u037e\u037c\u0001\u0000\u0000\u0000\u037e\u037f\u0001\u0000\u0000\u0000"+
		"\u037f\u0381\u0001\u0000\u0000\u0000\u0380\u037e\u0001\u0000\u0000\u0000"+
		"\u0381\u0382\u0005\u0004\u0000\u0000\u0382\u0383\u0003\u0012\t\u0000\u0383"+
		"\u0384\u0005\u0004\u0000\u0000\u0384\u0385\u0005\n\u0000\u0000\u0385\u0386"+
		"\u0005\u0003\u0000\u0000\u0386\u0387\u0005\n\u0000\u0000\u0387\u0388\u0005"+
		"\u0003\u0000\u0000\u0388\u0389\u0005\u0006\u0000\u0000\u0389\u038a\u0005"+
		"\u0004\u0000\u0000\u038a\u038b\u0006\u0007\uffff\uffff\u0000\u038b\u038d"+
		"\u0001\u0000\u0000\u0000\u038c\u033b\u0001\u0000\u0000\u0000\u038d\u038e"+
		"\u0001\u0000\u0000\u0000\u038e\u038c\u0001\u0000\u0000\u0000\u038e\u038f"+
		"\u0001\u0000\u0000\u0000\u038f\u0390\u0001\u0000\u0000\u0000\u0390\u0391"+
		"\u0005\u0005\u0000\u0000\u0391\u0392\u0005\u0003\u0000\u0000\u0392\u0393"+
		"\u0005\n\u0000\u0000\u0393\u0394\u0005\n\u0000\u0000\u0394\u0395\u0005"+
		"\u0003\u0000\u0000\u0395\u0396\u0005\n\u0000\u0000\u0396\u0397\u0005\u0003"+
		"\u0000\u0000\u0397\u0398\u0005\n\u0000\u0000\u0398\u0399\u0005\u0004\u0000"+
		"\u0000\u0399\u000f\u0001\u0000\u0000\u0000\u039a\u039b\u0005\u0005\u0000"+
		"\u0000\u039b\u039c\u0005\u0003\u0000\u0000\u039c\u039d\u0005\n\u0000\u0000"+
		"\u039d\u039e\u0005\n\u0000\u0000\u039e\u039f\u0005\n\u0000\u0000\u039f"+
		"\u03a0\u0005\u0003\u0000\u0000\u03a0\u03a1\u0005\n\u0000\u0000\u03a1\u03a2"+
		"\u0005\n\u0000\u0000\u03a2\u03a3\u0005\n\u0000\u0000\u03a3\u03a4\u0005"+
		"\u0003\u0000\u0000\u03a4\u03a5\u0005\n\u0000\u0000\u03a5\u03a6\u0005\u0003"+
		"\u0000\u0000\u03a6\u03a7\u0005\n\u0000\u0000\u03a7\u0410\u0005\u0004\u0000"+
		"\u0000\u03a8\u03a9\u0005\n\u0000\u0000\u03a9\u03ab\u0005\u0003\u0000\u0000"+
		"\u03aa\u03ac\u0005\n\u0000\u0000\u03ab\u03aa\u0001\u0000\u0000\u0000\u03ab"+
		"\u03ac\u0001\u0000\u0000\u0000\u03ac\u03ad\u0001\u0000\u0000\u0000\u03ad"+
		"\u03ae\u0005\u0003\u0000\u0000\u03ae\u03af\u0005\n\u0000\u0000\u03af\u03b0"+
		"\u0005\u0003\u0000\u0000\u03b0\u03b1\u0005\n\u0000\u0000\u03b1\u03b2\u0005"+
		"\u0003\u0000\u0000\u03b2\u03b3\u0005\n\u0000\u0000\u03b3\u03b4\u0005\u0003"+
		"\u0000\u0000\u03b4\u03b5\u0005\n\u0000\u0000\u03b5\u03b6\u0005\u0003\u0000"+
		"\u0000\u03b6\u03b7\u0005\n\u0000\u0000\u03b7\u03b8\u0005\u0003\u0000\u0000"+
		"\u03b8\u03b9\u0005\n\u0000\u0000\u03b9\u03ba\u0005\u0003\u0000\u0000\u03ba"+
		"\u03bb\u0005\n\u0000\u0000\u03bb\u03bc\u0005\u0003\u0000\u0000\u03bc\u03bd"+
		"\u0005\n\u0000\u0000\u03bd\u03be\u0005\u0003\u0000\u0000\u03be\u0406\u0005"+
		"\u0004\u0000\u0000\u03bf\u03c0\u0005\u0003\u0000\u0000\u03c0\u03c1\u0005"+
		"\u0003\u0000\u0000\u03c1\u03c2\u0005\u0003\u0000\u0000\u03c2\u03c3\u0005"+
		"\u0003\u0000\u0000\u03c3\u03c4\u0005\u0003\u0000\u0000\u03c4\u03c5\u0005"+
		"\u0003\u0000\u0000\u03c5\u03c6\u0005\u0003\u0000\u0000\u03c6\u03c7\u0005"+
		"\u0003\u0000\u0000\u03c7\u03c8\u0005\u0003\u0000\u0000\u03c8\u03c9\u0005"+
		"\u0003\u0000\u0000\u03c9\u0407\u0005\u0004\u0000\u0000\u03ca\u03cc\u0003"+
		"\u0012\t\u0000\u03cb\u03cd\u0003\u0012\t\u0000\u03cc\u03cb\u0001\u0000"+
		"\u0000\u0000\u03cc\u03cd\u0001\u0000\u0000\u0000\u03cd\u03cf\u0001\u0000"+
		"\u0000\u0000\u03ce\u03d0\u0003\u0012\t\u0000\u03cf\u03ce\u0001\u0000\u0000"+
		"\u0000\u03cf\u03d0\u0001\u0000\u0000\u0000\u03d0\u03d2\u0001\u0000\u0000"+
		"\u0000\u03d1\u03d3\u0003\u0012\t\u0000\u03d2\u03d1\u0001\u0000\u0000\u0000"+
		"\u03d2\u03d3\u0001\u0000\u0000\u0000\u03d3\u03d5\u0001\u0000\u0000\u0000"+
		"\u03d4\u03d6\u0003\u0012\t\u0000\u03d5\u03d4\u0001\u0000\u0000\u0000\u03d5"+
		"\u03d6\u0001\u0000\u0000\u0000\u03d6\u03d8\u0001\u0000\u0000\u0000\u03d7"+
		"\u03d9\u0003\u0012\t\u0000\u03d8\u03d7\u0001\u0000\u0000\u0000\u03d8\u03d9"+
		"\u0001\u0000\u0000\u0000\u03d9\u03db\u0001\u0000\u0000\u0000\u03da\u03dc"+
		"\u0003\u0012\t\u0000\u03db\u03da\u0001\u0000\u0000\u0000\u03db\u03dc\u0001"+
		"\u0000\u0000\u0000\u03dc\u03e0\u0001\u0000\u0000\u0000\u03dd\u03df\u0003"+
		"\u0012\t\u0000\u03de\u03dd\u0001\u0000\u0000\u0000\u03df\u03e2\u0001\u0000"+
		"\u0000\u0000\u03e0\u03de\u0001\u0000\u0000\u0000\u03e0\u03e1\u0001\u0000"+
		"\u0000\u0000\u03e1\u03e3\u0001\u0000\u0000\u0000\u03e2\u03e0\u0001\u0000"+
		"\u0000\u0000\u03e3\u03e4\u0005\u0003\u0000\u0000\u03e4\u03e5\u0003\u0012"+
		"\t\u0000\u03e5\u03e6\u0005\u0003\u0000\u0000\u03e6\u03e7\u0005\n\u0000"+
		"\u0000\u03e7\u03eb\u0005\u0003\u0000\u0000\u03e8\u03ea\u0003\u0012\t\u0000"+
		"\u03e9\u03e8\u0001\u0000\u0000\u0000\u03ea\u03ed\u0001\u0000\u0000\u0000"+
		"\u03eb\u03e9\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001\u0000\u0000\u0000"+
		"\u03ec\u03ee\u0001\u0000\u0000\u0000\u03ed\u03eb\u0001\u0000\u0000\u0000"+
		"\u03ee\u03f0\u0005\u0003\u0000\u0000\u03ef\u03f1\u0005\u0006\u0000\u0000"+
		"\u03f0\u03ef\u0001\u0000\u0000\u0000\u03f0\u03f1\u0001\u0000\u0000\u0000"+
		"\u03f1\u03f2\u0001\u0000\u0000\u0000\u03f2\u03f3\u0005\u0003\u0000\u0000"+
		"\u03f3\u03f4\u0005\u0006\u0000\u0000\u03f4\u03f6\u0005\u0003\u0000\u0000"+
		"\u03f5\u03f7\u0005\n\u0000\u0000\u03f6\u03f5\u0001\u0000\u0000\u0000\u03f6"+
		"\u03f7\u0001\u0000\u0000\u0000\u03f7\u03f8\u0001\u0000\u0000\u0000\u03f8"+
		"\u03f9\u0005\u0003\u0000\u0000\u03f9\u03fa\u0005\b\u0000\u0000\u03fa\u03fc"+
		"\u0005\u0003\u0000\u0000\u03fb\u03fd\u0005\b\u0000\u0000\u03fc\u03fb\u0001"+
		"\u0000\u0000\u0000\u03fc\u03fd\u0001\u0000\u0000\u0000\u03fd\u03fe\u0001"+
		"\u0000\u0000\u0000\u03fe\u0400\u0005\u0003\u0000\u0000\u03ff\u0401\u0005"+
		"\b\u0000\u0000\u0400\u03ff\u0001\u0000\u0000\u0000\u0400\u0401\u0001\u0000"+
		"\u0000\u0000\u0401\u0402\u0001\u0000\u0000\u0000\u0402\u0403\u0005\u0003"+
		"\u0000\u0000\u0403\u0404\u0005\u0004\u0000\u0000\u0404\u0405\u0006\b\uffff"+
		"\uffff\u0000\u0405\u0407\u0001\u0000\u0000\u0000\u0406\u03bf\u0001\u0000"+
		"\u0000\u0000\u0406\u03ca\u0001\u0000\u0000\u0000\u0407\u0408\u0001\u0000"+
		"\u0000\u0000\u0408\u0406\u0001\u0000\u0000\u0000\u0408\u0409\u0001\u0000"+
		"\u0000\u0000\u0409\u040a\u0001\u0000\u0000\u0000\u040a\u040b\u0005\n\u0000"+
		"\u0000\u040b\u040c\u0005\u0003\u0000\u0000\u040c\u040d\u0005\n\u0000\u0000"+
		"\u040d\u040e\u0005\u0003\u0000\u0000\u040e\u040f\u0005\u0006\u0000\u0000"+
		"\u040f\u0411\u0005\u0004\u0000\u0000\u0410\u03a8\u0001\u0000\u0000\u0000"+
		"\u0411\u0412\u0001\u0000\u0000\u0000\u0412\u0410\u0001\u0000\u0000\u0000"+
		"\u0412\u0413\u0001\u0000\u0000\u0000\u0413\u0414\u0001\u0000\u0000\u0000"+
		"\u0414\u0415\u0005\u0005\u0000\u0000\u0415\u0416\u0005\u0003\u0000\u0000"+
		"\u0416\u0417\u0005\n\u0000\u0000\u0417\u0418\u0005\n\u0000\u0000\u0418"+
		"\u0419\u0005\n\u0000\u0000\u0419\u041a\u0005\u0003\u0000\u0000\u041a\u041b"+
		"\u0005\n\u0000\u0000\u041b\u041c\u0005\n\u0000\u0000\u041c\u041d\u0005"+
		"\n\u0000\u0000\u041d\u041e\u0005\u0003\u0000\u0000\u041e\u041f\u0005\n"+
		"\u0000\u0000\u041f\u0420\u0005\u0003\u0000\u0000\u0420\u0421\u0005\n\u0000"+
		"\u0000\u0421\u0422\u0005\u0004\u0000\u0000\u0422\u0011\u0001\u0000\u0000"+
		"\u0000\u0423\u0424\u0007\u0000\u0000\u0000\u0424\u0013\u0001\u0000\u0000"+
		"\u0000\u0425\u0428\u0003\u0012\t\u0000\u0426\u0428\u0005\u0003\u0000\u0000"+
		"\u0427\u0425\u0001\u0000\u0000\u0000\u0427\u0426\u0001\u0000\u0000\u0000"+
		"\u0428\u0429\u0001\u0000\u0000\u0000\u0429\u0427\u0001\u0000\u0000\u0000"+
		"\u0429\u042a\u0001\u0000\u0000\u0000\u042a\u042b\u0001\u0000\u0000\u0000"+
		"\u042b\u042c\u0005\u0004\u0000\u0000\u042c\u0015\u0001\u0000\u0000\u0000"+
		"\u042d\u0431\u0003\u0012\t\u0000\u042e\u0431\u0005\u0003\u0000\u0000\u042f"+
		"\u0431\u0005\u0004\u0000\u0000\u0430\u042d\u0001\u0000\u0000\u0000\u0430"+
		"\u042e\u0001\u0000\u0000\u0000\u0430\u042f\u0001\u0000\u0000\u0000\u0431"+
		"\u0432\u0001\u0000\u0000\u0000\u0432\u0430\u0001\u0000\u0000\u0000\u0432"+
		"\u0433\u0001\u0000\u0000\u0000\u0433\u0017\u0001\u0000\u0000\u0000s\u001f"+
		"\\drv|\u0080\u0084\u0090\u009b\u00e4\u00fa\u00fc\u0107\u015b\u015d\u0168"+
		"\u018c\u0191\u0194\u0197\u019a\u019d\u01a0\u01a5\u01ab\u01ae\u01b1\u01b4"+
		"\u01b7\u01ba\u01bf\u01c7\u01d3\u01de\u0220\u0223\u0226\u0229\u022c\u022f"+
		"\u0234\u023c\u023f\u0242\u0245\u0248\u024b\u0250\u025d\u0266\u0270\u027b"+
		"\u029a\u02a1\u02a4\u02a7\u02aa\u02ad\u02b0\u02b5\u02bd\u02c0\u02c3\u02c6"+
		"\u02c9\u02cc\u02d1\u02f6\u02fa\u02fe\u0302\u0306\u030e\u0313\u0315\u0319"+
		"\u0324\u0342\u0348\u034b\u034e\u0351\u0354\u0357\u035c\u0362\u0365\u0368"+
		"\u036b\u036e\u0371\u0376\u037e\u038e\u03ab\u03cc\u03cf\u03d2\u03d5\u03d8"+
		"\u03db\u03e0\u03eb\u03f0\u03f6\u03fc\u0400\u0406\u0408\u0412\u0427\u0429"+
		"\u0430\u0432";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}