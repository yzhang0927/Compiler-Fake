// Generated from /Users/syd/Desktop/scala_proj/javaproj/Compiler-Fake/grammar/Calc.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OP_DOT=1, OP_COMMA=2, OP_PLUS=3, OP_MINUS=4, OP_DIV=5, OP_MULT=6, OP_DOTDOT=7, 
		LBRAK=8, RBRAK=9, LPAR=10, RPAR=11, KW_ARRAY=12, KW_LOCAL=13, KW_GLOBAL=14, 
		KW_DEFUN=15, SEMI=16, KW_END=17, KW_IF=18, KW_THEN=19, KW_DO=20, KW_WHILE=21, 
		KW_ELSIF=22, KW_ELSE=23, KW_FOREACH=24, KW_IN=25, PRINT=26, RETURN=27, 
		ASSIGN=28, FOR=29, EXCHANGE=30, OP_LESS=31, OP_EQUAL=32, OP_GREATER=33, 
		OP_NOTEQUA=34, OP_LESSEQUAL=35, OP_GREATEREQUAL=36, INT_LIT=37, ID=38, 
		WS=39, LINE_COMMENT=40;
	public static final int
		RULE_start_symbol = 0, RULE_int_lit = 1, RULE_id = 2, RULE_input = 3, 
		RULE_decl = 4, RULE_def = 5, RULE_body = 6, RULE_statement = 7, RULE_array_id = 8, 
		RULE_range = 9, RULE_bool_expr = 10, RULE_bool_op = 11, RULE_lhs = 12, 
		RULE_lhs_item = 13, RULE_expr = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_symbol", "int_lit", "id", "input", "decl", "def", "body", "statement", 
			"array_id", "range", "bool_expr", "bool_op", "lhs", "lhs_item", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "'+'", "'-'", "'/'", "'*'", "'..'", "'['", "']'", 
			"'('", "')'", "'array'", "'local'", "'global'", "'defun'", "';'", "'end'", 
			"'if'", "'then'", "'do'", "'while'", "'elsif'", "'else'", "'foreach'", 
			"'in'", "'print'", "'return'", "'='", "'for'", "'<->'", "'<'", "'=='", 
			"'>'", "'!='", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OP_DOT", "OP_COMMA", "OP_PLUS", "OP_MINUS", "OP_DIV", "OP_MULT", 
			"OP_DOTDOT", "LBRAK", "RBRAK", "LPAR", "RPAR", "KW_ARRAY", "KW_LOCAL", 
			"KW_GLOBAL", "KW_DEFUN", "SEMI", "KW_END", "KW_IF", "KW_THEN", "KW_DO", 
			"KW_WHILE", "KW_ELSIF", "KW_ELSE", "KW_FOREACH", "KW_IN", "PRINT", "RETURN", 
			"ASSIGN", "FOR", "EXCHANGE", "OP_LESS", "OP_EQUAL", "OP_GREATER", "OP_NOTEQUA", 
			"OP_LESSEQUAL", "OP_GREATEREQUAL", "INT_LIT", "ID", "WS", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Start_symbolContext extends ParserRuleContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public Start_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterStart_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitStart_symbol(this);
		}
	}

	public final Start_symbolContext start_symbol() throws RecognitionException {
		Start_symbolContext _localctx = new Start_symbolContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			input();
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

	public static class Int_litContext extends ParserRuleContext {
		public TerminalNode INT_LIT() { return getToken(CalcParser.INT_LIT, 0); }
		public Int_litContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterInt_lit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitInt_lit(this);
		}
	}

	public final Int_litContext int_lit() throws RecognitionException {
		Int_litContext _localctx = new Int_litContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_int_lit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(INT_LIT);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CalcParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(ID);
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

	public static class InputContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ARRAY) | (1L << KW_LOCAL) | (1L << KW_GLOBAL) | (1L << KW_DEFUN) | (1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				setState(39);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_IF:
				case KW_WHILE:
				case KW_FOREACH:
				case PRINT:
				case RETURN:
				case ID:
					{
					setState(36);
					statement();
					}
					break;
				case KW_ARRAY:
				case KW_LOCAL:
				case KW_GLOBAL:
					{
					setState(37);
					decl();
					}
					break;
				case KW_DEFUN:
					{
					setState(38);
					def();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DeclContext extends ParserRuleContext {
		public TerminalNode KW_ARRAY() { return getToken(CalcParser.KW_ARRAY, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode LBRAK() { return getToken(CalcParser.LBRAK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP_DOTDOT() { return getToken(CalcParser.OP_DOTDOT, 0); }
		public TerminalNode RBRAK() { return getToken(CalcParser.RBRAK, 0); }
		public TerminalNode SEMI() { return getToken(CalcParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(CalcParser.ASSIGN, 0); }
		public TerminalNode KW_LOCAL() { return getToken(CalcParser.KW_LOCAL, 0); }
		public TerminalNode KW_GLOBAL() { return getToken(CalcParser.KW_GLOBAL, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl);
		int _la;
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(KW_ARRAY);
				setState(45);
				id();
				setState(46);
				match(LBRAK);
				setState(47);
				expr(0);
				setState(48);
				match(OP_DOTDOT);
				setState(49);
				expr(0);
				setState(50);
				match(RBRAK);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(51);
					id();
					setState(52);
					match(ASSIGN);
					setState(53);
					expr(0);
					}
				}

				setState(57);
				match(SEMI);
				}
				break;
			case KW_LOCAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(KW_LOCAL);
				setState(60);
				id();
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(61);
					match(ASSIGN);
					setState(62);
					expr(0);
					}
				}

				setState(65);
				match(SEMI);
				}
				break;
			case KW_GLOBAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(KW_GLOBAL);
				setState(68);
				id();
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(69);
					match(ASSIGN);
					setState(70);
					expr(0);
					}
				}

				setState(73);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DefContext extends ParserRuleContext {
		public List<TerminalNode> KW_DEFUN() { return getTokens(CalcParser.KW_DEFUN); }
		public TerminalNode KW_DEFUN(int i) {
			return getToken(CalcParser.KW_DEFUN, i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(CalcParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CalcParser.RPAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode KW_END() { return getToken(CalcParser.KW_END, 0); }
		public List<TerminalNode> OP_COMMA() { return getTokens(CalcParser.OP_COMMA); }
		public TerminalNode OP_COMMA(int i) {
			return getToken(CalcParser.OP_COMMA, i);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitDef(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(KW_DEFUN);
			setState(78);
			id();
			setState(79);
			match(LPAR);
			setState(80);
			id();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(81);
				match(OP_COMMA);
				setState(82);
				id();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(RPAR);
			setState(89);
			body();
			setState(90);
			match(KW_END);
			setState(91);
			match(KW_DEFUN);
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

	public static class BodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ARRAY) | (1L << KW_LOCAL) | (1L << KW_GLOBAL) | (1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				setState(95);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_IF:
				case KW_WHILE:
				case KW_FOREACH:
				case PRINT:
				case RETURN:
				case ID:
					{
					setState(93);
					statement();
					}
					break;
				case KW_ARRAY:
				case KW_LOCAL:
				case KW_GLOBAL:
					{
					setState(94);
					decl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatementContext extends ParserRuleContext {
		public List<LhsContext> lhs() {
			return getRuleContexts(LhsContext.class);
		}
		public LhsContext lhs(int i) {
			return getRuleContext(LhsContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(CalcParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CalcParser.SEMI, 0); }
		public TerminalNode EXCHANGE() { return getToken(CalcParser.EXCHANGE, 0); }
		public List<TerminalNode> KW_WHILE() { return getTokens(CalcParser.KW_WHILE); }
		public TerminalNode KW_WHILE(int i) {
			return getToken(CalcParser.KW_WHILE, i);
		}
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode KW_DO() { return getToken(CalcParser.KW_DO, 0); }
		public TerminalNode KW_END() { return getToken(CalcParser.KW_END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> KW_IF() { return getTokens(CalcParser.KW_IF); }
		public TerminalNode KW_IF(int i) {
			return getToken(CalcParser.KW_IF, i);
		}
		public List<TerminalNode> KW_THEN() { return getTokens(CalcParser.KW_THEN); }
		public TerminalNode KW_THEN(int i) {
			return getToken(CalcParser.KW_THEN, i);
		}
		public List<TerminalNode> KW_ELSIF() { return getTokens(CalcParser.KW_ELSIF); }
		public TerminalNode KW_ELSIF(int i) {
			return getToken(CalcParser.KW_ELSIF, i);
		}
		public TerminalNode KW_ELSE() { return getToken(CalcParser.KW_ELSE, 0); }
		public TerminalNode KW_FOREACH() { return getToken(CalcParser.KW_FOREACH, 0); }
		public TerminalNode KW_IN() { return getToken(CalcParser.KW_IN, 0); }
		public TerminalNode FOR() { return getToken(CalcParser.FOR, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(CalcParser.RETURN, 0); }
		public TerminalNode PRINT() { return getToken(CalcParser.PRINT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				lhs();
				setState(101);
				match(ASSIGN);
				setState(102);
				expr(0);
				setState(103);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				lhs();
				setState(106);
				match(EXCHANGE);
				setState(107);
				lhs();
				setState(108);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(KW_WHILE);
				setState(111);
				bool_expr();
				setState(112);
				match(KW_DO);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN) | (1L << ID))) != 0)) {
					{
					{
					setState(113);
					statement();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				match(KW_END);
				setState(120);
				match(KW_WHILE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				match(KW_IF);
				setState(123);
				bool_expr();
				setState(124);
				match(KW_THEN);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN) | (1L << ID))) != 0)) {
					{
					{
					setState(125);
					statement();
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KW_ELSIF) {
					{
					{
					setState(131);
					match(KW_ELSIF);
					setState(132);
					bool_expr();
					setState(133);
					match(KW_THEN);
					setState(134);
					statement();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ELSE) {
					{
					setState(141);
					match(KW_ELSE);
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN) | (1L << ID))) != 0)) {
						{
						{
						setState(142);
						statement();
						}
						}
						setState(147);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(150);
				match(KW_END);
				setState(151);
				match(KW_IF);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				match(KW_FOREACH);
				setState(154);
				expr(0);
				setState(155);
				match(KW_IN);
				setState(158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(156);
					range();
					}
					break;
				case 2:
					{
					setState(157);
					array_id();
					}
					break;
				}
				setState(160);
				match(KW_DO);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN) | (1L << ID))) != 0)) {
					{
					{
					setState(161);
					statement();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167);
				match(KW_END);
				setState(168);
				match(FOR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				match(RETURN);
				setState(171);
				expr(0);
				setState(172);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				match(PRINT);
				setState(175);
				expr(0);
				setState(176);
				match(SEMI);
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

	public static class Array_idContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Array_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterArray_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitArray_id(this);
		}
	}

	public final Array_idContext array_id() throws RecognitionException {
		Array_idContext _localctx = new Array_idContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			id();
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

	public static class RangeContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP_DOTDOT() { return getToken(CalcParser.OP_DOTDOT, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			expr(0);
			setState(183);
			match(OP_DOTDOT);
			setState(184);
			expr(0);
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

	public static class Bool_exprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bool_opContext bool_op() {
			return getRuleContext(Bool_opContext.class,0);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitBool_expr(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bool_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			expr(0);
			setState(187);
			bool_op();
			setState(188);
			expr(0);
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

	public static class Bool_opContext extends ParserRuleContext {
		public TerminalNode OP_LESS() { return getToken(CalcParser.OP_LESS, 0); }
		public TerminalNode OP_GREATER() { return getToken(CalcParser.OP_GREATER, 0); }
		public TerminalNode OP_EQUAL() { return getToken(CalcParser.OP_EQUAL, 0); }
		public TerminalNode OP_NOTEQUA() { return getToken(CalcParser.OP_NOTEQUA, 0); }
		public TerminalNode OP_LESSEQUAL() { return getToken(CalcParser.OP_LESSEQUAL, 0); }
		public TerminalNode OP_GREATEREQUAL() { return getToken(CalcParser.OP_GREATEREQUAL, 0); }
		public Bool_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterBool_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitBool_op(this);
		}
	}

	public final Bool_opContext bool_op() throws RecognitionException {
		Bool_opContext _localctx = new Bool_opContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bool_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_LESS) | (1L << OP_EQUAL) | (1L << OP_GREATER) | (1L << OP_NOTEQUA) | (1L << OP_LESSEQUAL) | (1L << OP_GREATEREQUAL))) != 0)) ) {
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

	public static class LhsContext extends ParserRuleContext {
		public List<Lhs_itemContext> lhs_item() {
			return getRuleContexts(Lhs_itemContext.class);
		}
		public Lhs_itemContext lhs_item(int i) {
			return getRuleContext(Lhs_itemContext.class,i);
		}
		public List<TerminalNode> OP_COMMA() { return getTokens(CalcParser.OP_COMMA); }
		public TerminalNode OP_COMMA(int i) {
			return getToken(CalcParser.OP_COMMA, i);
		}
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterLhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitLhs(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lhs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			lhs_item();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(193);
				match(OP_COMMA);
				setState(194);
				lhs_item();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Lhs_itemContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode OP_DOT() { return getToken(CalcParser.OP_DOT, 0); }
		public Int_litContext int_lit() {
			return getRuleContext(Int_litContext.class,0);
		}
		public TerminalNode LBRAK() { return getToken(CalcParser.LBRAK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRAK() { return getToken(CalcParser.RBRAK, 0); }
		public Lhs_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterLhs_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitLhs_item(this);
		}
	}

	public final Lhs_itemContext lhs_item() throws RecognitionException {
		Lhs_itemContext _localctx = new Lhs_itemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lhs_item);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				id();
				setState(202);
				match(OP_DOT);
				setState(203);
				int_lit();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				id();
				setState(206);
				match(LBRAK);
				setState(207);
				expr(0);
				setState(208);
				match(RBRAK);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(CalcParser.LPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(CalcParser.RPAR, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Int_litContext int_lit() {
			return getRuleContext(Int_litContext.class,0);
		}
		public TerminalNode OP_DOT() { return getToken(CalcParser.OP_DOT, 0); }
		public TerminalNode LBRAK() { return getToken(CalcParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(CalcParser.RBRAK, 0); }
		public TerminalNode OP_COMMA() { return getToken(CalcParser.OP_COMMA, 0); }
		public TerminalNode OP_MULT() { return getToken(CalcParser.OP_MULT, 0); }
		public TerminalNode OP_DIV() { return getToken(CalcParser.OP_DIV, 0); }
		public TerminalNode OP_PLUS() { return getToken(CalcParser.OP_PLUS, 0); }
		public TerminalNode OP_MINUS() { return getToken(CalcParser.OP_MINUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(213);
				match(LPAR);
				setState(214);
				expr(0);
				setState(215);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(217);
				id();
				}
				break;
			case 3:
				{
				setState(218);
				int_lit();
				}
				break;
			case 4:
				{
				setState(219);
				id();
				setState(220);
				expr(3);
				}
				break;
			case 5:
				{
				setState(222);
				id();
				setState(223);
				match(OP_DOT);
				setState(224);
				int_lit();
				}
				break;
			case 6:
				{
				setState(226);
				id();
				setState(227);
				match(LBRAK);
				setState(228);
				expr(0);
				setState(229);
				match(RBRAK);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(242);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(234);
						match(OP_COMMA);
						setState(235);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(237);
						_la = _input.LA(1);
						if ( !(_la==OP_DIV || _la==OP_MULT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(238);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(240);
						_la = _input.LA(1);
						if ( !(_la==OP_PLUS || _la==OP_MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(241);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00fa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\5\7\5*\n\5\f\5\16\5-\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6:\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6J\n\6\3\6\3\6\5\6N\n\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7V\n\7"+
		"\f\7\16\7Y\13\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\7\bb\n\b\f\b\16\be\13\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tu\n\t\f\t\16"+
		"\tx\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0081\n\t\f\t\16\t\u0084\13\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u008b\n\t\f\t\16\t\u008e\13\t\3\t\3\t\7\t\u0092"+
		"\n\t\f\t\16\t\u0095\13\t\5\t\u0097\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u00a1\n\t\3\t\3\t\7\t\u00a5\n\t\f\t\16\t\u00a8\13\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b5\n\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\7\16\u00c6\n\16\f\16\16\16"+
		"\u00c9\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d5"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ea\n\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u00f5\n\20\f\20\16\20\u00f8\13\20\3\20\2\3\36"+
		"\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\5\3\2!&\3\2\7\b\3\2\5\6\2"+
		"\u010d\2 \3\2\2\2\4\"\3\2\2\2\6$\3\2\2\2\b+\3\2\2\2\nM\3\2\2\2\fO\3\2"+
		"\2\2\16c\3\2\2\2\20\u00b4\3\2\2\2\22\u00b6\3\2\2\2\24\u00b8\3\2\2\2\26"+
		"\u00bc\3\2\2\2\30\u00c0\3\2\2\2\32\u00c2\3\2\2\2\34\u00d4\3\2\2\2\36\u00e9"+
		"\3\2\2\2 !\5\b\5\2!\3\3\2\2\2\"#\7\'\2\2#\5\3\2\2\2$%\7(\2\2%\7\3\2\2"+
		"\2&*\5\20\t\2\'*\5\n\6\2(*\5\f\7\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*-\3"+
		"\2\2\2+)\3\2\2\2+,\3\2\2\2,\t\3\2\2\2-+\3\2\2\2./\7\16\2\2/\60\5\6\4\2"+
		"\60\61\7\n\2\2\61\62\5\36\20\2\62\63\7\t\2\2\63\64\5\36\20\2\649\7\13"+
		"\2\2\65\66\5\6\4\2\66\67\7\36\2\2\678\5\36\20\28:\3\2\2\29\65\3\2\2\2"+
		"9:\3\2\2\2:;\3\2\2\2;<\7\22\2\2<N\3\2\2\2=>\7\17\2\2>A\5\6\4\2?@\7\36"+
		"\2\2@B\5\36\20\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\22\2\2DN\3\2\2\2EF"+
		"\7\20\2\2FI\5\6\4\2GH\7\36\2\2HJ\5\36\20\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2"+
		"\2KL\7\22\2\2LN\3\2\2\2M.\3\2\2\2M=\3\2\2\2ME\3\2\2\2N\13\3\2\2\2OP\7"+
		"\21\2\2PQ\5\6\4\2QR\7\f\2\2RW\5\6\4\2ST\7\4\2\2TV\5\6\4\2US\3\2\2\2VY"+
		"\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\r\2\2[\\\5\16\b\2"+
		"\\]\7\23\2\2]^\7\21\2\2^\r\3\2\2\2_b\5\20\t\2`b\5\n\6\2a_\3\2\2\2a`\3"+
		"\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\17\3\2\2\2ec\3\2\2\2fg\5\32\16\2"+
		"gh\7\36\2\2hi\5\36\20\2ij\7\22\2\2j\u00b5\3\2\2\2kl\5\32\16\2lm\7 \2\2"+
		"mn\5\32\16\2no\7\22\2\2o\u00b5\3\2\2\2pq\7\27\2\2qr\5\26\f\2rv\7\26\2"+
		"\2su\5\20\t\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2"+
		"\2\2yz\7\23\2\2z{\7\27\2\2{\u00b5\3\2\2\2|}\7\24\2\2}~\5\26\f\2~\u0082"+
		"\7\25\2\2\177\u0081\5\20\t\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u008c\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0085\u0086\7\30\2\2\u0086\u0087\5\26\f\2\u0087\u0088\7\25\2\2\u0088"+
		"\u0089\5\20\t\2\u0089\u008b\3\2\2\2\u008a\u0085\3\2\2\2\u008b\u008e\3"+
		"\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0096\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0093\7\31\2\2\u0090\u0092\5\20\t\2\u0091\u0090\3"+
		"\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u008f\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\23\2\2\u0099\u009a\7\24\2\2\u009a"+
		"\u00b5\3\2\2\2\u009b\u009c\7\32\2\2\u009c\u009d\5\36\20\2\u009d\u00a0"+
		"\7\33\2\2\u009e\u00a1\5\24\13\2\u009f\u00a1\5\22\n\2\u00a0\u009e\3\2\2"+
		"\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a6\7\26\2\2\u00a3"+
		"\u00a5\5\20\t\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00aa\7\23\2\2\u00aa\u00ab\7\37\2\2\u00ab\u00b5\3\2\2\2\u00ac\u00ad\7"+
		"\35\2\2\u00ad\u00ae\5\36\20\2\u00ae\u00af\7\22\2\2\u00af\u00b5\3\2\2\2"+
		"\u00b0\u00b1\7\34\2\2\u00b1\u00b2\5\36\20\2\u00b2\u00b3\7\22\2\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4f\3\2\2\2\u00b4k\3\2\2\2\u00b4p\3\2\2\2\u00b4|\3\2"+
		"\2\2\u00b4\u009b\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5"+
		"\21\3\2\2\2\u00b6\u00b7\5\6\4\2\u00b7\23\3\2\2\2\u00b8\u00b9\5\36\20\2"+
		"\u00b9\u00ba\7\t\2\2\u00ba\u00bb\5\36\20\2\u00bb\25\3\2\2\2\u00bc\u00bd"+
		"\5\36\20\2\u00bd\u00be\5\30\r\2\u00be\u00bf\5\36\20\2\u00bf\27\3\2\2\2"+
		"\u00c0\u00c1\t\2\2\2\u00c1\31\3\2\2\2\u00c2\u00c7\5\34\17\2\u00c3\u00c4"+
		"\7\4\2\2\u00c4\u00c6\5\34\17\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3\2\2\2"+
		"\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\33\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00ca\u00d5\5\6\4\2\u00cb\u00cc\5\6\4\2\u00cc\u00cd\7\3\2\2\u00cd"+
		"\u00ce\5\4\3\2\u00ce\u00d5\3\2\2\2\u00cf\u00d0\5\6\4\2\u00d0\u00d1\7\n"+
		"\2\2\u00d1\u00d2\5\36\20\2\u00d2\u00d3\7\13\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00ca\3\2\2\2\u00d4\u00cb\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d5\35\3\2\2"+
		"\2\u00d6\u00d7\b\20\1\2\u00d7\u00d8\7\f\2\2\u00d8\u00d9\5\36\20\2\u00d9"+
		"\u00da\7\r\2\2\u00da\u00ea\3\2\2\2\u00db\u00ea\5\6\4\2\u00dc\u00ea\5\4"+
		"\3\2\u00dd\u00de\5\6\4\2\u00de\u00df\5\36\20\5\u00df\u00ea\3\2\2\2\u00e0"+
		"\u00e1\5\6\4\2\u00e1\u00e2\7\3\2\2\u00e2\u00e3\5\4\3\2\u00e3\u00ea\3\2"+
		"\2\2\u00e4\u00e5\5\6\4\2\u00e5\u00e6\7\n\2\2\u00e6\u00e7\5\36\20\2\u00e7"+
		"\u00e8\7\13\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00d6\3\2\2\2\u00e9\u00db\3"+
		"\2\2\2\u00e9\u00dc\3\2\2\2\u00e9\u00dd\3\2\2\2\u00e9\u00e0\3\2\2\2\u00e9"+
		"\u00e4\3\2\2\2\u00ea\u00f6\3\2\2\2\u00eb\u00ec\f\13\2\2\u00ec\u00ed\7"+
		"\4\2\2\u00ed\u00f5\5\36\20\f\u00ee\u00ef\f\n\2\2\u00ef\u00f0\t\3\2\2\u00f0"+
		"\u00f5\5\36\20\13\u00f1\u00f2\f\t\2\2\u00f2\u00f3\t\4\2\2\u00f3\u00f5"+
		"\5\36\20\n\u00f4\u00eb\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f4\u00f1\3\2\2\2"+
		"\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\37"+
		"\3\2\2\2\u00f8\u00f6\3\2\2\2\30)+9AIMWacv\u0082\u008c\u0093\u0096\u00a0"+
		"\u00a6\u00b4\u00c7\u00d4\u00e9\u00f4\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}