// Generated from /Users/student/workspaces/java_workspace/Compiler-Fake/grammar/Test.g4 by ANTLR 4.7.2
package edu.nyu.compiler.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, OP_DOT=2, OP_COMMA=3, OP_PLUS=4, INT_LIT=5, OP_MINUS=6, OP_DIV=7, 
		OP_MULT=8, OP_DOTDOT=9, LBRAK=10, RBRAK=11, LPAR=12, RPAR=13, KW_ARRAY=14, 
		KW_TUPLE=15, KW_LOCAL=16, KW_GLOBAL=17, KW_DEFUN=18, SEMI=19, DEFUN=20, 
		KW_END=21, KW_IF=22, KW_THEN=23, KW_DO=24, KW_WHILE=25, KW_ELSIF=26, KW_ELSE=27, 
		KW_FOREACH=28, KW_IN=29, KW_FOR=30, PRINT=31, RETURN=32, ASSIGN=33, FOR=34, 
		EXCHANGE=35, OP_LESS=36, OP_EQUAL=37, OP_GREATER=38, OP_NOTEQUA=39, OP_LESSEQUAL=40, 
		OP_GREATEREQUAL=41, NEWLINE=42;
	public static final int
		RULE_start_symbol = 0, RULE_input = 1, RULE_decl = 2, RULE_def = 3, RULE_body = 4, 
		RULE_statement = 5, RULE_array_id = 6, RULE_range = 7, RULE_bool_expr = 8, 
		RULE_bool_op = 9, RULE_lhs = 10, RULE_lhs_item = 11, RULE_expr = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_symbol", "input", "decl", "def", "body", "statement", "array_id", 
			"range", "bool_expr", "bool_op", "lhs", "lhs_item", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ID'", "'OP_DOT'", "'OP_COMMA'", "'OP_PLUS'", "'INT_LIT'", "'OP_MINUS'", 
			"'OP_DIV'", "'OP_MULT'", "'OP_DOTDOT'", "'LBRAK'", "'RBRAK'", "'LPAR'", 
			"'RPAR'", "'KW_ARRAY'", "'KW_TUPLE'", "'KW_LOCAL'", "'KW_GLOBAL'", "'KW_DEFUN'", 
			"'SEMI'", "'DEFUN'", "'KW_END'", "'KW_IF'", "'KW_THEN'", "'KW_DO'", "'KW_WHILE'", 
			"'KW_ELSIF'", "'KW_ELSE'", "'KW_FOREACH'", "'KW_IN'", "'KW_FOR'", "'PRINT'", 
			"'RETURN'", "'ASSIGN'", "'FOR'", "'EXCHANGE'", "'OP_LESS'", "'OP_EQUAL'", 
			"'OP_GREAT'", "'OP_NOTEQUA'", "'OP_LESSEQUAL'", "'OP_GREATEREQUAL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "OP_DOT", "OP_COMMA", "OP_PLUS", "INT_LIT", "OP_MINUS", "OP_DIV", 
			"OP_MULT", "OP_DOTDOT", "LBRAK", "RBRAK", "LPAR", "RPAR", "KW_ARRAY", 
			"KW_TUPLE", "KW_LOCAL", "KW_GLOBAL", "KW_DEFUN", "SEMI", "DEFUN", "KW_END", 
			"KW_IF", "KW_THEN", "KW_DO", "KW_WHILE", "KW_ELSIF", "KW_ELSE", "KW_FOREACH", 
			"KW_IN", "KW_FOR", "PRINT", "RETURN", "ASSIGN", "FOR", "EXCHANGE", "OP_LESS", 
			"OP_EQUAL", "OP_GREATER", "OP_NOTEQUA", "OP_LESSEQUAL", "OP_GREATEREQUAL", 
			"NEWLINE"
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
	public String getGrammarFileName() { return "Test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TestParser(TokenStream input) {
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
			if ( listener instanceof TestListener ) ((TestListener)listener).enterStart_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitStart_symbol(this);
		}
	}

	public final Start_symbolContext start_symbol() throws RecognitionException {
		Start_symbolContext _localctx = new Start_symbolContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
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

	public static class InputContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(TestParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TestParser.NEWLINE, i);
		}
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
			if ( listener instanceof TestListener ) ((TestListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << KW_ARRAY) | (1L << KW_TUPLE) | (1L << KW_LOCAL) | (1L << KW_GLOBAL) | (1L << KW_DEFUN) | (1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN))) != 0)) {
				{
				{
				setState(31);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case KW_IF:
				case KW_WHILE:
				case KW_FOREACH:
				case PRINT:
				case RETURN:
					{
					setState(28);
					statement();
					}
					break;
				case KW_ARRAY:
				case KW_TUPLE:
				case KW_LOCAL:
				case KW_GLOBAL:
					{
					setState(29);
					decl();
					}
					break;
				case KW_DEFUN:
					{
					setState(30);
					def();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(33);
				match(NEWLINE);
				}
				}
				setState(39);
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
		public TerminalNode KW_ARRAY() { return getToken(TestParser.KW_ARRAY, 0); }
		public TerminalNode ID() { return getToken(TestParser.ID, 0); }
		public TerminalNode LBRAK() { return getToken(TestParser.LBRAK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP_DOTDOT() { return getToken(TestParser.OP_DOTDOT, 0); }
		public TerminalNode RBRAK() { return getToken(TestParser.RBRAK, 0); }
		public TerminalNode SEMI() { return getToken(TestParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(TestParser.ASSIGN, 0); }
		public TerminalNode KW_TUPLE() { return getToken(TestParser.KW_TUPLE, 0); }
		public List<TerminalNode> OP_COMMA() { return getTokens(TestParser.OP_COMMA); }
		public TerminalNode OP_COMMA(int i) {
			return getToken(TestParser.OP_COMMA, i);
		}
		public TerminalNode KW_LOCAL() { return getToken(TestParser.KW_LOCAL, 0); }
		public TerminalNode KW_GLOBAL() { return getToken(TestParser.KW_GLOBAL, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		int _la;
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(KW_ARRAY);
				setState(41);
				match(ID);
				setState(42);
				match(LBRAK);
				setState(43);
				expr(0);
				setState(44);
				match(OP_DOTDOT);
				setState(45);
				expr(0);
				setState(46);
				match(RBRAK);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(47);
					match(ASSIGN);
					setState(48);
					expr(0);
					}
				}

				setState(51);
				match(SEMI);
				}
				break;
			case KW_TUPLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(KW_TUPLE);
				setState(54);
				match(ID);
				setState(55);
				match(ASSIGN);
				setState(56);
				expr(0);
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(57);
					match(OP_COMMA);
					setState(58);
					expr(0);
					}
					}
					setState(61); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OP_COMMA );
				setState(63);
				match(SEMI);
				}
				break;
			case KW_LOCAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				match(KW_LOCAL);
				setState(66);
				match(ID);
				setState(67);
				match(ASSIGN);
				setState(68);
				expr(0);
				setState(69);
				match(SEMI);
				}
				break;
			case KW_GLOBAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				match(KW_GLOBAL);
				setState(72);
				match(ID);
				setState(73);
				match(ASSIGN);
				setState(74);
				expr(0);
				setState(75);
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
		public List<TerminalNode> KW_DEFUN() { return getTokens(TestParser.KW_DEFUN); }
		public TerminalNode KW_DEFUN(int i) {
			return getToken(TestParser.KW_DEFUN, i);
		}
		public List<TerminalNode> ID() { return getTokens(TestParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TestParser.ID, i);
		}
		public TerminalNode LPAR() { return getToken(TestParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(TestParser.RPAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode KW_END() { return getToken(TestParser.KW_END, 0); }
		public List<TerminalNode> OP_COMMA() { return getTokens(TestParser.OP_COMMA); }
		public TerminalNode OP_COMMA(int i) {
			return getToken(TestParser.OP_COMMA, i);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitDef(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(KW_DEFUN);
			setState(80);
			match(ID);
			setState(81);
			match(LPAR);
			setState(82);
			match(ID);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(83);
				match(OP_COMMA);
				setState(84);
				match(ID);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(RPAR);
			setState(91);
			body();
			setState(92);
			match(KW_END);
			setState(93);
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
			if ( listener instanceof TestListener ) ((TestListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << KW_ARRAY) | (1L << KW_TUPLE) | (1L << KW_LOCAL) | (1L << KW_GLOBAL) | (1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN))) != 0)) {
				{
				setState(97);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case KW_IF:
				case KW_WHILE:
				case KW_FOREACH:
				case PRINT:
				case RETURN:
					{
					setState(95);
					statement();
					}
					break;
				case KW_ARRAY:
				case KW_TUPLE:
				case KW_LOCAL:
				case KW_GLOBAL:
					{
					setState(96);
					decl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(101);
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
		public TerminalNode ASSIGN() { return getToken(TestParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(TestParser.SEMI, 0); }
		public TerminalNode EXCHANGE() { return getToken(TestParser.EXCHANGE, 0); }
		public List<TerminalNode> KW_WHILE() { return getTokens(TestParser.KW_WHILE); }
		public TerminalNode KW_WHILE(int i) {
			return getToken(TestParser.KW_WHILE, i);
		}
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode KW_DO() { return getToken(TestParser.KW_DO, 0); }
		public TerminalNode KW_END() { return getToken(TestParser.KW_END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> KW_IF() { return getTokens(TestParser.KW_IF); }
		public TerminalNode KW_IF(int i) {
			return getToken(TestParser.KW_IF, i);
		}
		public List<TerminalNode> KW_THEN() { return getTokens(TestParser.KW_THEN); }
		public TerminalNode KW_THEN(int i) {
			return getToken(TestParser.KW_THEN, i);
		}
		public List<TerminalNode> KW_ELSIF() { return getTokens(TestParser.KW_ELSIF); }
		public TerminalNode KW_ELSIF(int i) {
			return getToken(TestParser.KW_ELSIF, i);
		}
		public TerminalNode KW_ELSE() { return getToken(TestParser.KW_ELSE, 0); }
		public TerminalNode KW_FOREACH() { return getToken(TestParser.KW_FOREACH, 0); }
		public TerminalNode KW_IN() { return getToken(TestParser.KW_IN, 0); }
		public List<TerminalNode> ID() { return getTokens(TestParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TestParser.ID, i);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(TestParser.RETURN, 0); }
		public TerminalNode PRINT() { return getToken(TestParser.PRINT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				lhs();
				setState(103);
				match(ASSIGN);
				setState(104);
				expr(0);
				setState(105);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				lhs();
				setState(108);
				match(EXCHANGE);
				setState(109);
				lhs();
				setState(110);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(KW_WHILE);
				setState(113);
				bool_expr();
				setState(114);
				match(KW_DO);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN))) != 0)) {
					{
					{
					setState(115);
					statement();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				match(KW_END);
				setState(122);
				match(KW_WHILE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				match(KW_IF);
				setState(125);
				bool_expr();
				setState(126);
				match(KW_THEN);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN))) != 0)) {
					{
					{
					setState(127);
					statement();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KW_ELSIF) {
					{
					{
					setState(133);
					match(KW_ELSIF);
					setState(134);
					bool_expr();
					setState(135);
					match(KW_THEN);
					setState(136);
					statement();
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ELSE) {
					{
					setState(143);
					match(KW_ELSE);
					setState(144);
					statement();
					}
				}

				setState(147);
				match(KW_END);
				setState(148);
				match(KW_IF);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				match(KW_FOREACH);
				setState(151);
				expr(0);
				setState(152);
				match(KW_IN);
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(153);
					range();
					}
					break;
				case 2:
					{
					setState(154);
					match(ID);
					}
					break;
				}
				setState(157);
				match(KW_DO);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN))) != 0)) {
					{
					{
					setState(158);
					statement();
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164);
				match(KW_END);
				setState(165);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				match(RETURN);
				setState(168);
				expr(0);
				setState(169);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				match(PRINT);
				setState(172);
				expr(0);
				setState(173);
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
		public TerminalNode ID() { return getToken(TestParser.ID, 0); }
		public Array_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterArray_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitArray_id(this);
		}
	}

	public final Array_idContext array_id() throws RecognitionException {
		Array_idContext _localctx = new Array_idContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
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

	public static class RangeContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP_DOTDOT() { return getToken(TestParser.OP_DOTDOT, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			expr(0);
			setState(180);
			match(OP_DOTDOT);
			setState(181);
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
			if ( listener instanceof TestListener ) ((TestListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitBool_expr(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bool_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			expr(0);
			setState(184);
			bool_op();
			setState(185);
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
		public TerminalNode OP_LESS() { return getToken(TestParser.OP_LESS, 0); }
		public TerminalNode OP_GREATER() { return getToken(TestParser.OP_GREATER, 0); }
		public TerminalNode OP_EQUAL() { return getToken(TestParser.OP_EQUAL, 0); }
		public TerminalNode OP_NOTEQUA() { return getToken(TestParser.OP_NOTEQUA, 0); }
		public TerminalNode OP_LESSEQUAL() { return getToken(TestParser.OP_LESSEQUAL, 0); }
		public TerminalNode OP_GREATEREQUAL() { return getToken(TestParser.OP_GREATEREQUAL, 0); }
		public Bool_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterBool_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitBool_op(this);
		}
	}

	public final Bool_opContext bool_op() throws RecognitionException {
		Bool_opContext _localctx = new Bool_opContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bool_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
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
		public List<TerminalNode> OP_COMMA() { return getTokens(TestParser.OP_COMMA); }
		public TerminalNode OP_COMMA(int i) {
			return getToken(TestParser.OP_COMMA, i);
		}
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterLhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitLhs(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lhs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			lhs_item();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(190);
				match(OP_COMMA);
				setState(191);
				lhs_item();
				}
				}
				setState(196);
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
		public TerminalNode ID() { return getToken(TestParser.ID, 0); }
		public TerminalNode OP_DOT() { return getToken(TestParser.OP_DOT, 0); }
		public TerminalNode INT_LIT() { return getToken(TestParser.INT_LIT, 0); }
		public TerminalNode LBRAK() { return getToken(TestParser.LBRAK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRAK() { return getToken(TestParser.RBRAK, 0); }
		public Lhs_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterLhs_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitLhs_item(this);
		}
	}

	public final Lhs_itemContext lhs_item() throws RecognitionException {
		Lhs_itemContext _localctx = new Lhs_itemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lhs_item);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(ID);
				setState(199);
				match(OP_DOT);
				setState(200);
				match(INT_LIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(ID);
				setState(202);
				match(LBRAK);
				setState(203);
				expr(0);
				setState(204);
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
		public TerminalNode LPAR() { return getToken(TestParser.LPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(TestParser.RPAR, 0); }
		public TerminalNode ID() { return getToken(TestParser.ID, 0); }
		public TerminalNode OP_DOT() { return getToken(TestParser.OP_DOT, 0); }
		public TerminalNode INT_LIT() { return getToken(TestParser.INT_LIT, 0); }
		public TerminalNode LBRAK() { return getToken(TestParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(TestParser.RBRAK, 0); }
		public TerminalNode OP_COMMA() { return getToken(TestParser.OP_COMMA, 0); }
		public TerminalNode OP_PLUS() { return getToken(TestParser.OP_PLUS, 0); }
		public TerminalNode OP_MINUS() { return getToken(TestParser.OP_MINUS, 0); }
		public TerminalNode OP_MULT() { return getToken(TestParser.OP_MULT, 0); }
		public TerminalNode OP_DIV() { return getToken(TestParser.OP_DIV, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitExpr(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(209);
				match(LPAR);
				setState(210);
				expr(0);
				setState(211);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(213);
				match(ID);
				}
				break;
			case 3:
				{
				setState(214);
				match(ID);
				setState(215);
				expr(3);
				}
				break;
			case 4:
				{
				setState(216);
				match(ID);
				setState(217);
				match(OP_DOT);
				setState(218);
				match(INT_LIT);
				}
				break;
			case 5:
				{
				setState(219);
				match(ID);
				setState(220);
				match(LBRAK);
				setState(221);
				expr(0);
				setState(222);
				match(RBRAK);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(232);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(227);
						match(OP_COMMA);
						setState(228);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(229);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(230);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PLUS) | (1L << OP_MINUS) | (1L << OP_DIV) | (1L << OP_MULT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(231);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\3\5\3\"\n\3\3\3\3\3\7"+
		"\3&\n\3\f\3\16\3)\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\64\n\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4>\n\4\r\4\16\4?\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5X\n\5\f\5\16\5[\13\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\7\6d\n\6\f\6\16"+
		"\6g\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7w"+
		"\n\7\f\7\16\7z\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0083\n\7\f\7\16\7"+
		"\u0086\13\7\3\7\3\7\3\7\3\7\3\7\7\7\u008d\n\7\f\7\16\7\u0090\13\7\3\7"+
		"\3\7\5\7\u0094\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009e\n\7\3\7\3"+
		"\7\7\7\u00a2\n\7\f\7\16\7\u00a5\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u00b2\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\7\f\u00c3\n\f\f\f\16\f\u00c6\13\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00d1\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e3\n\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u00eb\n\16\f\16\16\16\u00ee\13\16\3\16\2\3\32"+
		"\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\3\2&+\4\2\6\6\b\n\2\u0102\2\34"+
		"\3\2\2\2\4\'\3\2\2\2\6O\3\2\2\2\bQ\3\2\2\2\ne\3\2\2\2\f\u00b1\3\2\2\2"+
		"\16\u00b3\3\2\2\2\20\u00b5\3\2\2\2\22\u00b9\3\2\2\2\24\u00bd\3\2\2\2\26"+
		"\u00bf\3\2\2\2\30\u00d0\3\2\2\2\32\u00e2\3\2\2\2\34\35\5\4\3\2\35\3\3"+
		"\2\2\2\36\"\5\f\7\2\37\"\5\6\4\2 \"\5\b\5\2!\36\3\2\2\2!\37\3\2\2\2! "+
		"\3\2\2\2\"#\3\2\2\2#$\7,\2\2$&\3\2\2\2%!\3\2\2\2&)\3\2\2\2\'%\3\2\2\2"+
		"\'(\3\2\2\2(\5\3\2\2\2)\'\3\2\2\2*+\7\20\2\2+,\7\3\2\2,-\7\f\2\2-.\5\32"+
		"\16\2./\7\13\2\2/\60\5\32\16\2\60\63\7\r\2\2\61\62\7#\2\2\62\64\5\32\16"+
		"\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\25\2\2\66P\3\2\2"+
		"\2\678\7\21\2\289\7\3\2\29:\7#\2\2:=\5\32\16\2;<\7\5\2\2<>\5\32\16\2="+
		";\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\25\2\2BP\3\2\2\2"+
		"CD\7\22\2\2DE\7\3\2\2EF\7#\2\2FG\5\32\16\2GH\7\25\2\2HP\3\2\2\2IJ\7\23"+
		"\2\2JK\7\3\2\2KL\7#\2\2LM\5\32\16\2MN\7\25\2\2NP\3\2\2\2O*\3\2\2\2O\67"+
		"\3\2\2\2OC\3\2\2\2OI\3\2\2\2P\7\3\2\2\2QR\7\24\2\2RS\7\3\2\2ST\7\16\2"+
		"\2TY\7\3\2\2UV\7\5\2\2VX\7\3\2\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2"+
		"\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\17\2\2]^\5\n\6\2^_\7\27\2\2_`\7\24\2\2`\t"+
		"\3\2\2\2ad\5\f\7\2bd\5\6\4\2ca\3\2\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2e"+
		"f\3\2\2\2f\13\3\2\2\2ge\3\2\2\2hi\5\26\f\2ij\7#\2\2jk\5\32\16\2kl\7\25"+
		"\2\2l\u00b2\3\2\2\2mn\5\26\f\2no\7%\2\2op\5\26\f\2pq\7\25\2\2q\u00b2\3"+
		"\2\2\2rs\7\33\2\2st\5\22\n\2tx\7\32\2\2uw\5\f\7\2vu\3\2\2\2wz\3\2\2\2"+
		"xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7\27\2\2|}\7\33\2\2}\u00b2"+
		"\3\2\2\2~\177\7\30\2\2\177\u0080\5\22\n\2\u0080\u0084\7\31\2\2\u0081\u0083"+
		"\5\f\7\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u008e\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\34"+
		"\2\2\u0088\u0089\5\22\n\2\u0089\u008a\7\31\2\2\u008a\u008b\5\f\7\2\u008b"+
		"\u008d\3\2\2\2\u008c\u0087\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0093\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0092\7\35\2\2\u0092\u0094\5\f\7\2\u0093\u0091\3\2\2\2\u0093\u0094\3"+
		"\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\27\2\2\u0096\u0097\7\30\2\2\u0097"+
		"\u00b2\3\2\2\2\u0098\u0099\7\36\2\2\u0099\u009a\5\32\16\2\u009a\u009d"+
		"\7\37\2\2\u009b\u009e\5\20\t\2\u009c\u009e\7\3\2\2\u009d\u009b\3\2\2\2"+
		"\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a3\7\32\2\2\u00a0\u00a2"+
		"\5\f\7\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7\27"+
		"\2\2\u00a7\u00a8\7\3\2\2\u00a8\u00b2\3\2\2\2\u00a9\u00aa\7\"\2\2\u00aa"+
		"\u00ab\5\32\16\2\u00ab\u00ac\7\25\2\2\u00ac\u00b2\3\2\2\2\u00ad\u00ae"+
		"\7!\2\2\u00ae\u00af\5\32\16\2\u00af\u00b0\7\25\2\2\u00b0\u00b2\3\2\2\2"+
		"\u00b1h\3\2\2\2\u00b1m\3\2\2\2\u00b1r\3\2\2\2\u00b1~\3\2\2\2\u00b1\u0098"+
		"\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b2\r\3\2\2\2\u00b3"+
		"\u00b4\7\3\2\2\u00b4\17\3\2\2\2\u00b5\u00b6\5\32\16\2\u00b6\u00b7\7\13"+
		"\2\2\u00b7\u00b8\5\32\16\2\u00b8\21\3\2\2\2\u00b9\u00ba\5\32\16\2\u00ba"+
		"\u00bb\5\24\13\2\u00bb\u00bc\5\32\16\2\u00bc\23\3\2\2\2\u00bd\u00be\t"+
		"\2\2\2\u00be\25\3\2\2\2\u00bf\u00c4\5\30\r\2\u00c0\u00c1\7\5\2\2\u00c1"+
		"\u00c3\5\30\r\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3"+
		"\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\27\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00d1\7\3\2\2\u00c8\u00c9\7\3\2\2\u00c9\u00ca\7\4\2\2\u00ca\u00d1\7\7"+
		"\2\2\u00cb\u00cc\7\3\2\2\u00cc\u00cd\7\f\2\2\u00cd\u00ce\5\32\16\2\u00ce"+
		"\u00cf\7\r\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00c7\3\2\2\2\u00d0\u00c8\3\2"+
		"\2\2\u00d0\u00cb\3\2\2\2\u00d1\31\3\2\2\2\u00d2\u00d3\b\16\1\2\u00d3\u00d4"+
		"\7\16\2\2\u00d4\u00d5\5\32\16\2\u00d5\u00d6\7\17\2\2\u00d6\u00e3\3\2\2"+
		"\2\u00d7\u00e3\7\3\2\2\u00d8\u00d9\7\3\2\2\u00d9\u00e3\5\32\16\5\u00da"+
		"\u00db\7\3\2\2\u00db\u00dc\7\4\2\2\u00dc\u00e3\7\7\2\2\u00dd\u00de\7\3"+
		"\2\2\u00de\u00df\7\f\2\2\u00df\u00e0\5\32\16\2\u00e0\u00e1\7\r\2\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00d2\3\2\2\2\u00e2\u00d7\3\2\2\2\u00e2\u00d8\3\2"+
		"\2\2\u00e2\u00da\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e3\u00ec\3\2\2\2\u00e4"+
		"\u00e5\f\t\2\2\u00e5\u00e6\7\5\2\2\u00e6\u00eb\5\32\16\n\u00e7\u00e8\f"+
		"\b\2\2\u00e8\u00e9\t\3\2\2\u00e9\u00eb\5\32\16\t\u00ea\u00e4\3\2\2\2\u00ea"+
		"\u00e7\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\33\3\2\2\2\u00ee\u00ec\3\2\2\2\26!\'\63?OYcex\u0084\u008e\u0093"+
		"\u009d\u00a3\u00b1\u00c4\u00d0\u00e2\u00ea\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}