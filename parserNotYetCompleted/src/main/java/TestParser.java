// Generated from /Users/syd/Desktop/scala_proj/javaproj/Compiler-Fake/Test.g4 by ANTLR 4.7.2
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
			if ( listener instanceof TestListener) ((TestListener)listener).enterStart_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener) ((TestListener)listener).exitStart_symbol(this);
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
			if ( listener instanceof TestListener) ((TestListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener) ((TestListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << KW_ARRAY) | (1L << KW_TUPLE) | (1L << KW_LOCAL) | (1L << KW_GLOBAL) | (1L << KW_DEFUN) | (1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN))) != 0)) {
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
				}
				setState(35);
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
			if ( listener instanceof TestListener) ((TestListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener) ((TestListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		int _la;
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(KW_ARRAY);
				setState(37);
				match(ID);
				setState(38);
				match(LBRAK);
				setState(39);
				expr(0);
				setState(40);
				match(OP_DOTDOT);
				setState(41);
				expr(0);
				setState(42);
				match(RBRAK);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(43);
					match(ASSIGN);
					setState(44);
					expr(0);
					}
				}

				setState(47);
				match(SEMI);
				}
				break;
			case KW_TUPLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(KW_TUPLE);
				setState(50);
				match(ID);
				setState(51);
				match(ASSIGN);
				setState(52);
				expr(0);
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(53);
					match(OP_COMMA);
					setState(54);
					expr(0);
					}
					}
					setState(57); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OP_COMMA );
				setState(59);
				match(SEMI);
				}
				break;
			case KW_LOCAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				match(KW_LOCAL);
				setState(62);
				match(ID);
				setState(63);
				match(ASSIGN);
				setState(64);
				expr(0);
				setState(65);
				match(SEMI);
				}
				break;
			case KW_GLOBAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				match(KW_GLOBAL);
				setState(68);
				match(ID);
				setState(69);
				match(ASSIGN);
				setState(70);
				expr(0);
				setState(71);
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
			if ( listener instanceof TestListener) ((TestListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener) ((TestListener)listener).exitDef(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(KW_DEFUN);
			setState(76);
			match(ID);
			setState(77);
			match(LPAR);
			setState(78);
			match(ID);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(79);
				match(OP_COMMA);
				setState(80);
				match(ID);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(RPAR);
			setState(87);
			body();
			setState(88);
			match(KW_END);
			setState(89);
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
			if ( listener instanceof TestListener) ((TestListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener) ((TestListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << KW_ARRAY) | (1L << KW_TUPLE) | (1L << KW_LOCAL) | (1L << KW_GLOBAL) | (1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN))) != 0)) {
				{
				setState(93);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case KW_IF:
				case KW_WHILE:
				case KW_FOREACH:
				case PRINT:
				case RETURN:
					{
					setState(91);
					statement();
					}
					break;
				case KW_ARRAY:
				case KW_TUPLE:
				case KW_LOCAL:
				case KW_GLOBAL:
					{
					setState(92);
					decl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(97);
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
			if ( listener instanceof TestListener) ((TestListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener) ((TestListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				lhs();
				setState(99);
				match(ASSIGN);
				setState(100);
				expr(0);
				setState(101);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				lhs();
				setState(104);
				match(EXCHANGE);
				setState(105);
				lhs();
				setState(106);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(KW_WHILE);
				setState(109);
				bool_expr();
				setState(110);
				match(KW_DO);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN))) != 0)) {
					{
					{
					setState(111);
					statement();
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				match(KW_END);
				setState(118);
				match(KW_WHILE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(KW_IF);
				setState(121);
				bool_expr();
				setState(122);
				match(KW_THEN);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN))) != 0)) {
					{
					{
					setState(123);
					statement();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KW_ELSIF) {
					{
					{
					setState(129);
					match(KW_ELSIF);
					setState(130);
					bool_expr();
					setState(131);
					match(KW_THEN);
					setState(132);
					statement();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ELSE) {
					{
					setState(139);
					match(KW_ELSE);
					setState(140);
					statement();
					}
				}

				setState(143);
				match(KW_END);
				setState(144);
				match(KW_IF);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				match(KW_FOREACH);
				setState(147);
				expr(0);
				setState(148);
				match(KW_IN);
				setState(151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(149);
					range();
					}
					break;
				case 2:
					{
					setState(150);
					match(ID);
					}
					break;
				}
				setState(153);
				match(KW_DO);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN))) != 0)) {
					{
					{
					setState(154);
					statement();
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
				match(KW_END);
				setState(161);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				match(RETURN);
				setState(164);
				expr(0);
				setState(165);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(167);
				match(PRINT);
				setState(168);
				expr(0);
				setState(169);
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
			if ( listener instanceof TestListener) ((TestListener)listener).enterArray_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener) ((TestListener)listener).exitArray_id(this);
		}
	}

	public final Array_idContext array_id() throws RecognitionException {
		Array_idContext _localctx = new Array_idContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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
			if ( listener instanceof TestListener) ((TestListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener) ((TestListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			expr(0);
			setState(176);
			match(OP_DOTDOT);
			setState(177);
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
			if ( listener instanceof TestListener) ((TestListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener) ((TestListener)listener).exitBool_expr(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bool_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			expr(0);
			setState(180);
			bool_op();
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
			if ( listener instanceof TestListener) ((TestListener)listener).enterBool_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener) ((TestListener)listener).exitBool_op(this);
		}
	}

	public final Bool_opContext bool_op() throws RecognitionException {
		Bool_opContext _localctx = new Bool_opContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bool_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
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
			if ( listener instanceof TestListener) ((TestListener)listener).enterLhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener) ((TestListener)listener).exitLhs(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lhs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			lhs_item();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(186);
				match(OP_COMMA);
				setState(187);
				lhs_item();
				}
				}
				setState(192);
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
			if ( listener instanceof TestListener) ((TestListener)listener).enterLhs_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener) ((TestListener)listener).exitLhs_item(this);
		}
	}

	public final Lhs_itemContext lhs_item() throws RecognitionException {
		Lhs_itemContext _localctx = new Lhs_itemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lhs_item);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(ID);
				setState(195);
				match(OP_DOT);
				setState(196);
				match(INT_LIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(ID);
				setState(198);
				match(LBRAK);
				setState(199);
				expr(0);
				setState(200);
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
			if ( listener instanceof TestListener) ((TestListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener) ((TestListener)listener).exitExpr(this);
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
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(205);
				match(LPAR);
				setState(206);
				expr(0);
				setState(207);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(209);
				match(ID);
				}
				break;
			case 3:
				{
				setState(210);
				match(ID);
				setState(211);
				expr(3);
				}
				break;
			case 4:
				{
				setState(212);
				match(ID);
				setState(213);
				match(OP_DOT);
				setState(214);
				match(INT_LIT);
				}
				break;
			case 5:
				{
				setState(215);
				match(ID);
				setState(216);
				match(LBRAK);
				setState(217);
				expr(0);
				setState(218);
				match(RBRAK);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(228);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(223);
						match(OP_COMMA);
						setState(224);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(226);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PLUS) | (1L << OP_MINUS) | (1L << OP_DIV) | (1L << OP_MULT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(227);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(232);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00ec\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\3\7\3\"\n\3\f\3\16\3%"+
		"\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\6\4:\n\4\r\4\16\4;\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5T\n\5\f\5\16"+
		"\5W\13\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\7\6`\n\6\f\6\16\6c\13\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7s\n\7\f\7\16\7v\13\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\177\n\7\f\7\16\7\u0082\13\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7\u0089\n\7\f\7\16\7\u008c\13\7\3\7\3\7\5\7\u0090\n\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009a\n\7\3\7\3\7\7\7\u009e\n\7\f\7\16"+
		"\7\u00a1\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ae\n"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\7\f\u00bf"+
		"\n\f\f\f\16\f\u00c2\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00cd"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00df\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00e7"+
		"\n\16\f\16\16\16\u00ea\13\16\3\16\2\3\32\17\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\2\4\3\2&+\4\2\6\6\b\n\2\u00fe\2\34\3\2\2\2\4#\3\2\2\2\6K\3\2\2"+
		"\2\bM\3\2\2\2\na\3\2\2\2\f\u00ad\3\2\2\2\16\u00af\3\2\2\2\20\u00b1\3\2"+
		"\2\2\22\u00b5\3\2\2\2\24\u00b9\3\2\2\2\26\u00bb\3\2\2\2\30\u00cc\3\2\2"+
		"\2\32\u00de\3\2\2\2\34\35\5\4\3\2\35\3\3\2\2\2\36\"\5\f\7\2\37\"\5\6\4"+
		"\2 \"\5\b\5\2!\36\3\2\2\2!\37\3\2\2\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#"+
		"$\3\2\2\2$\5\3\2\2\2%#\3\2\2\2&\'\7\20\2\2\'(\7\3\2\2()\7\f\2\2)*\5\32"+
		"\16\2*+\7\13\2\2+,\5\32\16\2,/\7\r\2\2-.\7#\2\2.\60\5\32\16\2/-\3\2\2"+
		"\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\7\25\2\2\62L\3\2\2\2\63\64\7\21\2\2"+
		"\64\65\7\3\2\2\65\66\7#\2\2\669\5\32\16\2\678\7\5\2\28:\5\32\16\29\67"+
		"\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7\25\2\2>L\3\2\2\2"+
		"?@\7\22\2\2@A\7\3\2\2AB\7#\2\2BC\5\32\16\2CD\7\25\2\2DL\3\2\2\2EF\7\23"+
		"\2\2FG\7\3\2\2GH\7#\2\2HI\5\32\16\2IJ\7\25\2\2JL\3\2\2\2K&\3\2\2\2K\63"+
		"\3\2\2\2K?\3\2\2\2KE\3\2\2\2L\7\3\2\2\2MN\7\24\2\2NO\7\3\2\2OP\7\16\2"+
		"\2PU\7\3\2\2QR\7\5\2\2RT\7\3\2\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2"+
		"\2VX\3\2\2\2WU\3\2\2\2XY\7\17\2\2YZ\5\n\6\2Z[\7\27\2\2[\\\7\24\2\2\\\t"+
		"\3\2\2\2]`\5\f\7\2^`\5\6\4\2_]\3\2\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2a"+
		"b\3\2\2\2b\13\3\2\2\2ca\3\2\2\2de\5\26\f\2ef\7#\2\2fg\5\32\16\2gh\7\25"+
		"\2\2h\u00ae\3\2\2\2ij\5\26\f\2jk\7%\2\2kl\5\26\f\2lm\7\25\2\2m\u00ae\3"+
		"\2\2\2no\7\33\2\2op\5\22\n\2pt\7\32\2\2qs\5\f\7\2rq\3\2\2\2sv\3\2\2\2"+
		"tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\27\2\2xy\7\33\2\2y\u00ae"+
		"\3\2\2\2z{\7\30\2\2{|\5\22\n\2|\u0080\7\31\2\2}\177\5\f\7\2~}\3\2\2\2"+
		"\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u008a\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\34\2\2\u0084\u0085\5\22\n\2\u0085"+
		"\u0086\7\31\2\2\u0086\u0087\5\f\7\2\u0087\u0089\3\2\2\2\u0088\u0083\3"+
		"\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008f\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\35\2\2\u008e\u0090\5"+
		"\f\7\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\7\27\2\2\u0092\u0093\7\30\2\2\u0093\u00ae\3\2\2\2\u0094\u0095\7"+
		"\36\2\2\u0095\u0096\5\32\16\2\u0096\u0099\7\37\2\2\u0097\u009a\5\20\t"+
		"\2\u0098\u009a\7\3\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009f\7\32\2\2\u009c\u009e\5\f\7\2\u009d\u009c\3\2\2\2"+
		"\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\27\2\2\u00a3\u00a4\7\3\2\2"+
		"\u00a4\u00ae\3\2\2\2\u00a5\u00a6\7\"\2\2\u00a6\u00a7\5\32\16\2\u00a7\u00a8"+
		"\7\25\2\2\u00a8\u00ae\3\2\2\2\u00a9\u00aa\7!\2\2\u00aa\u00ab\5\32\16\2"+
		"\u00ab\u00ac\7\25\2\2\u00ac\u00ae\3\2\2\2\u00add\3\2\2\2\u00adi\3\2\2"+
		"\2\u00adn\3\2\2\2\u00adz\3\2\2\2\u00ad\u0094\3\2\2\2\u00ad\u00a5\3\2\2"+
		"\2\u00ad\u00a9\3\2\2\2\u00ae\r\3\2\2\2\u00af\u00b0\7\3\2\2\u00b0\17\3"+
		"\2\2\2\u00b1\u00b2\5\32\16\2\u00b2\u00b3\7\13\2\2\u00b3\u00b4\5\32\16"+
		"\2\u00b4\21\3\2\2\2\u00b5\u00b6\5\32\16\2\u00b6\u00b7\5\24\13\2\u00b7"+
		"\u00b8\5\32\16\2\u00b8\23\3\2\2\2\u00b9\u00ba\t\2\2\2\u00ba\25\3\2\2\2"+
		"\u00bb\u00c0\5\30\r\2\u00bc\u00bd\7\5\2\2\u00bd\u00bf\5\30\r\2\u00be\u00bc"+
		"\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\27\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00cd\7\3\2\2\u00c4\u00c5\7\3\2"+
		"\2\u00c5\u00c6\7\4\2\2\u00c6\u00cd\7\7\2\2\u00c7\u00c8\7\3\2\2\u00c8\u00c9"+
		"\7\f\2\2\u00c9\u00ca\5\32\16\2\u00ca\u00cb\7\r\2\2\u00cb\u00cd\3\2\2\2"+
		"\u00cc\u00c3\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cd\31"+
		"\3\2\2\2\u00ce\u00cf\b\16\1\2\u00cf\u00d0\7\16\2\2\u00d0\u00d1\5\32\16"+
		"\2\u00d1\u00d2\7\17\2\2\u00d2\u00df\3\2\2\2\u00d3\u00df\7\3\2\2\u00d4"+
		"\u00d5\7\3\2\2\u00d5\u00df\5\32\16\5\u00d6\u00d7\7\3\2\2\u00d7\u00d8\7"+
		"\4\2\2\u00d8\u00df\7\7\2\2\u00d9\u00da\7\3\2\2\u00da\u00db\7\f\2\2\u00db"+
		"\u00dc\5\32\16\2\u00dc\u00dd\7\r\2\2\u00dd\u00df\3\2\2\2\u00de\u00ce\3"+
		"\2\2\2\u00de\u00d3\3\2\2\2\u00de\u00d4\3\2\2\2\u00de\u00d6\3\2\2\2\u00de"+
		"\u00d9\3\2\2\2\u00df\u00e8\3\2\2\2\u00e0\u00e1\f\t\2\2\u00e1\u00e2\7\5"+
		"\2\2\u00e2\u00e7\5\32\16\n\u00e3\u00e4\f\b\2\2\u00e4\u00e5\t\3\2\2\u00e5"+
		"\u00e7\5\32\16\t\u00e6\u00e0\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7\u00ea\3"+
		"\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\33\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\26!#/;KU_at\u0080\u008a\u008f\u0099\u009f\u00ad\u00c0\u00cc"+
		"\u00de\u00e6\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}