// Generated from /Users/syd/Desktop/scala_proj/javaproj/Compiler-Fake/grammar/lingBor.g4 by ANTLR 4.7.2
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
public class lingBorParser extends Parser {
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
		RULE_decl = 4, RULE_def = 5, RULE_body = 6, RULE_for_loop = 7, RULE_while_loop = 8, 
		RULE_statement = 9, RULE_array_id = 10, RULE_range = 11, RULE_bool_expr = 12, 
		RULE_bool_op = 13, RULE_lhs = 14, RULE_lhs_item = 15, RULE_expr = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_symbol", "int_lit", "id", "input", "decl", "def", "body", "for_loop", 
			"while_loop", "statement", "array_id", "range", "bool_expr", "bool_op", 
			"lhs", "lhs_item", "expr"
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
	public String getGrammarFileName() { return "lingBor.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lingBorParser(TokenStream input) {
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
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).enterStart_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).exitStart_symbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lingBorVisitor ) return ((lingBorVisitor<? extends T>)visitor).visitStart_symbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_symbolContext start_symbol() throws RecognitionException {
		Start_symbolContext _localctx = new Start_symbolContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
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
		public TerminalNode INT_LIT() { return getToken(lingBorParser.INT_LIT, 0); }
		public Int_litContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).enterInt_lit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).exitInt_lit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lingBorVisitor ) return ((lingBorVisitor<? extends T>)visitor).visitInt_lit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_litContext int_lit() throws RecognitionException {
		Int_litContext _localctx = new Int_litContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_int_lit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
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
		public TerminalNode ID() { return getToken(lingBorParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lingBorVisitor ) return ((lingBorVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
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
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lingBorVisitor ) return ((lingBorVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ARRAY) | (1L << KW_LOCAL) | (1L << KW_GLOBAL) | (1L << KW_DEFUN) | (1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				setState(43);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_IF:
				case KW_WHILE:
				case KW_FOREACH:
				case PRINT:
				case RETURN:
				case ID:
					{
					setState(40);
					statement();
					}
					break;
				case KW_ARRAY:
				case KW_LOCAL:
				case KW_GLOBAL:
					{
					setState(41);
					decl();
					}
					break;
				case KW_DEFUN:
					{
					setState(42);
					def();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(47);
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
		public TerminalNode KW_ARRAY() { return getToken(lingBorParser.KW_ARRAY, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode LBRAK() { return getToken(lingBorParser.LBRAK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP_DOTDOT() { return getToken(lingBorParser.OP_DOTDOT, 0); }
		public TerminalNode RBRAK() { return getToken(lingBorParser.RBRAK, 0); }
		public TerminalNode SEMI() { return getToken(lingBorParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(lingBorParser.ASSIGN, 0); }
		public TerminalNode KW_LOCAL() { return getToken(lingBorParser.KW_LOCAL, 0); }
		public TerminalNode KW_GLOBAL() { return getToken(lingBorParser.KW_GLOBAL, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lingBorVisitor ) return ((lingBorVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl);
		int _la;
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(KW_ARRAY);
				setState(49);
				id();
				setState(50);
				match(LBRAK);
				setState(51);
				expr(0);
				setState(52);
				match(OP_DOTDOT);
				setState(53);
				expr(0);
				setState(54);
				match(RBRAK);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(55);
					id();
					setState(56);
					match(ASSIGN);
					setState(57);
					expr(0);
					}
				}

				setState(61);
				match(SEMI);
				}
				break;
			case KW_LOCAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(KW_LOCAL);
				setState(64);
				id();
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(65);
					match(ASSIGN);
					setState(66);
					expr(0);
					}
				}

				setState(69);
				match(SEMI);
				}
				break;
			case KW_GLOBAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(KW_GLOBAL);
				setState(72);
				id();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(73);
					match(ASSIGN);
					setState(74);
					expr(0);
					}
				}

				setState(77);
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
		public List<TerminalNode> KW_DEFUN() { return getTokens(lingBorParser.KW_DEFUN); }
		public TerminalNode KW_DEFUN(int i) {
			return getToken(lingBorParser.KW_DEFUN, i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(lingBorParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(lingBorParser.RPAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode KW_END() { return getToken(lingBorParser.KW_END, 0); }
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lingBorVisitor ) return ((lingBorVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(KW_DEFUN);
			setState(82);
			id();
			setState(83);
			match(LPAR);
			setState(84);
			id();
			setState(85);
			match(RPAR);
			setState(86);
			body();
			setState(87);
			match(KW_END);
			setState(88);
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
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lingBorVisitor ) return ((lingBorVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ARRAY) | (1L << KW_LOCAL) | (1L << KW_GLOBAL) | (1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				setState(92);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_IF:
				case KW_WHILE:
				case KW_FOREACH:
				case PRINT:
				case RETURN:
				case ID:
					{
					setState(90);
					statement();
					}
					break;
				case KW_ARRAY:
				case KW_LOCAL:
				case KW_GLOBAL:
					{
					setState(91);
					decl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(96);
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode KW_FOREACH() { return getToken(lingBorParser.KW_FOREACH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode KW_IN() { return getToken(lingBorParser.KW_IN, 0); }
		public TerminalNode KW_DO() { return getToken(lingBorParser.KW_DO, 0); }
		public TerminalNode KW_END() { return getToken(lingBorParser.KW_END, 0); }
		public TerminalNode FOR() { return getToken(lingBorParser.FOR, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lingBorVisitor ) return ((lingBorVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(KW_FOREACH);
			setState(98);
			expr(0);
			setState(99);
			match(KW_IN);
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(100);
				range();
				}
				break;
			case 2:
				{
				setState(101);
				array_id();
				}
				break;
			}
			setState(104);
			match(KW_DO);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(105);
				statement();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(KW_END);
			setState(112);
			match(FOR);
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

	public static class While_loopContext extends ParserRuleContext {
		public List<TerminalNode> KW_WHILE() { return getTokens(lingBorParser.KW_WHILE); }
		public TerminalNode KW_WHILE(int i) {
			return getToken(lingBorParser.KW_WHILE, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode KW_DO() { return getToken(lingBorParser.KW_DO, 0); }
		public TerminalNode KW_END() { return getToken(lingBorParser.KW_END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lingBorVisitor ) return ((lingBorVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(KW_WHILE);
			setState(115);
			bool_expr();
			setState(116);
			match(KW_DO);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(117);
				statement();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(KW_END);
			setState(124);
			match(KW_WHILE);
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
		public TerminalNode ASSIGN() { return getToken(lingBorParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(lingBorParser.SEMI, 0); }
		public TerminalNode EXCHANGE() { return getToken(lingBorParser.EXCHANGE, 0); }
		public List<TerminalNode> KW_IF() { return getTokens(lingBorParser.KW_IF); }
		public TerminalNode KW_IF(int i) {
			return getToken(lingBorParser.KW_IF, i);
		}
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public List<TerminalNode> KW_THEN() { return getTokens(lingBorParser.KW_THEN); }
		public TerminalNode KW_THEN(int i) {
			return getToken(lingBorParser.KW_THEN, i);
		}
		public TerminalNode KW_END() { return getToken(lingBorParser.KW_END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> KW_ELSIF() { return getTokens(lingBorParser.KW_ELSIF); }
		public TerminalNode KW_ELSIF(int i) {
			return getToken(lingBorParser.KW_ELSIF, i);
		}
		public TerminalNode KW_ELSE() { return getToken(lingBorParser.KW_ELSE, 0); }
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(lingBorParser.RETURN, 0); }
		public TerminalNode PRINT() { return getToken(lingBorParser.PRINT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lingBorVisitor ) return ((lingBorVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				lhs();
				setState(127);
				match(ASSIGN);
				setState(128);
				expr(0);
				setState(129);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				lhs();
				setState(132);
				match(EXCHANGE);
				setState(133);
				lhs();
				setState(134);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(KW_IF);
				setState(137);
				bool_expr();
				setState(138);
				match(KW_THEN);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN) | (1L << ID))) != 0)) {
					{
					{
					setState(139);
					statement();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KW_ELSIF) {
					{
					{
					setState(145);
					match(KW_ELSIF);
					setState(146);
					bool_expr();
					setState(147);
					match(KW_THEN);
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN) | (1L << ID))) != 0)) {
						{
						{
						setState(148);
						statement();
						}
						}
						setState(153);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ELSE) {
					{
					setState(159);
					match(KW_ELSE);
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN) | (1L << ID))) != 0)) {
						{
						{
						setState(160);
						statement();
						}
						}
						setState(165);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(168);
				match(KW_END);
				setState(169);
				match(KW_IF);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				while_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				match(RETURN);
				setState(174);
				expr(0);
				setState(175);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(177);
				match(PRINT);
				setState(178);
				expr(0);
				setState(179);
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
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).enterArray_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).exitArray_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lingBorVisitor ) return ((lingBorVisitor<? extends T>)visitor).visitArray_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_idContext array_id() throws RecognitionException {
		Array_idContext _localctx = new Array_idContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
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
		public TerminalNode OP_DOTDOT() { return getToken(lingBorParser.OP_DOTDOT, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lingBorVisitor ) return ((lingBorVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			expr(0);
			setState(186);
			match(OP_DOTDOT);
			setState(187);
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
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lingBorVisitor ) return ((lingBorVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bool_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			expr(0);
			setState(190);
			bool_op();
			setState(191);
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
		public TerminalNode OP_LESS() { return getToken(lingBorParser.OP_LESS, 0); }
		public TerminalNode OP_GREATER() { return getToken(lingBorParser.OP_GREATER, 0); }
		public TerminalNode OP_EQUAL() { return getToken(lingBorParser.OP_EQUAL, 0); }
		public TerminalNode OP_NOTEQUA() { return getToken(lingBorParser.OP_NOTEQUA, 0); }
		public TerminalNode OP_LESSEQUAL() { return getToken(lingBorParser.OP_LESSEQUAL, 0); }
		public TerminalNode OP_GREATEREQUAL() { return getToken(lingBorParser.OP_GREATEREQUAL, 0); }
		public Bool_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).enterBool_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).exitBool_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lingBorVisitor ) return ((lingBorVisitor<? extends T>)visitor).visitBool_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_opContext bool_op() throws RecognitionException {
		Bool_opContext _localctx = new Bool_opContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bool_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
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
		public List<TerminalNode> OP_COMMA() { return getTokens(lingBorParser.OP_COMMA); }
		public TerminalNode OP_COMMA(int i) {
			return getToken(lingBorParser.OP_COMMA, i);
		}
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).enterLhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).exitLhs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lingBorVisitor ) return ((lingBorVisitor<? extends T>)visitor).visitLhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lhs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			lhs_item();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(196);
				match(OP_COMMA);
				setState(197);
				lhs_item();
				}
				}
				setState(202);
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
		public TerminalNode OP_DOT() { return getToken(lingBorParser.OP_DOT, 0); }
		public Int_litContext int_lit() {
			return getRuleContext(Int_litContext.class,0);
		}
		public TerminalNode LBRAK() { return getToken(lingBorParser.LBRAK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRAK() { return getToken(lingBorParser.RBRAK, 0); }
		public Lhs_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).enterLhs_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).exitLhs_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lingBorVisitor ) return ((lingBorVisitor<? extends T>)visitor).visitLhs_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lhs_itemContext lhs_item() throws RecognitionException {
		Lhs_itemContext _localctx = new Lhs_itemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lhs_item);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				id();
				setState(205);
				match(OP_DOT);
				setState(206);
				int_lit();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				id();
				setState(209);
				match(LBRAK);
				setState(210);
				expr(0);
				setState(211);
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
		public TerminalNode LPAR() { return getToken(lingBorParser.LPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(lingBorParser.RPAR, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Int_litContext int_lit() {
			return getRuleContext(Int_litContext.class,0);
		}
		public TerminalNode OP_DOT() { return getToken(lingBorParser.OP_DOT, 0); }
		public TerminalNode LBRAK() { return getToken(lingBorParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(lingBorParser.RBRAK, 0); }
		public TerminalNode OP_COMMA() { return getToken(lingBorParser.OP_COMMA, 0); }
		public TerminalNode OP_MULT() { return getToken(lingBorParser.OP_MULT, 0); }
		public TerminalNode OP_DIV() { return getToken(lingBorParser.OP_DIV, 0); }
		public TerminalNode OP_PLUS() { return getToken(lingBorParser.OP_PLUS, 0); }
		public TerminalNode OP_MINUS() { return getToken(lingBorParser.OP_MINUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lingBorListener ) ((lingBorListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lingBorVisitor ) return ((lingBorVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(216);
				match(LPAR);
				setState(217);
				expr(0);
				setState(218);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(220);
				id();
				}
				break;
			case 3:
				{
				setState(221);
				int_lit();
				}
				break;
			case 4:
				{
				setState(222);
				id();
				setState(223);
				match(LPAR);
				setState(224);
				expr(0);
				setState(225);
				match(RPAR);
				}
				break;
			case 5:
				{
				setState(227);
				id();
				setState(228);
				match(OP_DOT);
				setState(229);
				int_lit();
				}
				break;
			case 6:
				{
				setState(231);
				id();
				setState(232);
				match(LBRAK);
				setState(233);
				expr(0);
				setState(234);
				match(RBRAK);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(247);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(238);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(239);
						match(OP_COMMA);
						setState(240);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(242);
						_la = _input.LA(1);
						if ( !(_la==OP_DIV || _la==OP_MULT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(243);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(245);
						_la = _input.LA(1);
						if ( !(_la==OP_PLUS || _la==OP_MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(246);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(251);
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
		case 16:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00ff\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\7\5.\n\5\f\5\16\5\61\13\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6>\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6F\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6N\n\6\3\6\3\6\5\6R\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\7\b_\n\b\f\b\16\bb\13\b\3\t\3\t\3\t"+
		"\3\t\3\t\5\ti\n\t\3\t\3\t\7\tm\n\t\f\t\16\tp\13\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\7\ny\n\n\f\n\16\n|\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u008f\n\13\f\13\16"+
		"\13\u0092\13\13\3\13\3\13\3\13\3\13\7\13\u0098\n\13\f\13\16\13\u009b\13"+
		"\13\7\13\u009d\n\13\f\13\16\13\u00a0\13\13\3\13\3\13\7\13\u00a4\n\13\f"+
		"\13\16\13\u00a7\13\13\5\13\u00a9\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b8\n\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\7\20\u00c9\n\20\f\20"+
		"\16\20\u00cc\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u00d8\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ef\n\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00fa\n\22\f\22\16\22\u00fd"+
		"\13\22\3\22\2\3\"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\5\3\2"+
		"!&\3\2\7\b\3\2\5\6\2\u0110\2$\3\2\2\2\4&\3\2\2\2\6(\3\2\2\2\b/\3\2\2\2"+
		"\nQ\3\2\2\2\fS\3\2\2\2\16`\3\2\2\2\20c\3\2\2\2\22t\3\2\2\2\24\u00b7\3"+
		"\2\2\2\26\u00b9\3\2\2\2\30\u00bb\3\2\2\2\32\u00bf\3\2\2\2\34\u00c3\3\2"+
		"\2\2\36\u00c5\3\2\2\2 \u00d7\3\2\2\2\"\u00ee\3\2\2\2$%\5\b\5\2%\3\3\2"+
		"\2\2&\'\7\'\2\2\'\5\3\2\2\2()\7(\2\2)\7\3\2\2\2*.\5\24\13\2+.\5\n\6\2"+
		",.\5\f\7\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2"+
		"\2\2\60\t\3\2\2\2\61/\3\2\2\2\62\63\7\16\2\2\63\64\5\6\4\2\64\65\7\n\2"+
		"\2\65\66\5\"\22\2\66\67\7\t\2\2\678\5\"\22\28=\7\13\2\29:\5\6\4\2:;\7"+
		"\36\2\2;<\5\"\22\2<>\3\2\2\2=9\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\22\2\2"+
		"@R\3\2\2\2AB\7\17\2\2BE\5\6\4\2CD\7\36\2\2DF\5\"\22\2EC\3\2\2\2EF\3\2"+
		"\2\2FG\3\2\2\2GH\7\22\2\2HR\3\2\2\2IJ\7\20\2\2JM\5\6\4\2KL\7\36\2\2LN"+
		"\5\"\22\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\22\2\2PR\3\2\2\2Q\62\3\2\2"+
		"\2QA\3\2\2\2QI\3\2\2\2R\13\3\2\2\2ST\7\21\2\2TU\5\6\4\2UV\7\f\2\2VW\5"+
		"\6\4\2WX\7\r\2\2XY\5\16\b\2YZ\7\23\2\2Z[\7\21\2\2[\r\3\2\2\2\\_\5\24\13"+
		"\2]_\5\n\6\2^\\\3\2\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\17\3"+
		"\2\2\2b`\3\2\2\2cd\7\32\2\2de\5\"\22\2eh\7\33\2\2fi\5\30\r\2gi\5\26\f"+
		"\2hf\3\2\2\2hg\3\2\2\2ij\3\2\2\2jn\7\26\2\2km\5\24\13\2lk\3\2\2\2mp\3"+
		"\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\23\2\2rs\7\37\2\2s"+
		"\21\3\2\2\2tu\7\27\2\2uv\5\32\16\2vz\7\26\2\2wy\5\24\13\2xw\3\2\2\2y|"+
		"\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\23\2\2~\177\7\27"+
		"\2\2\177\23\3\2\2\2\u0080\u0081\5\36\20\2\u0081\u0082\7\36\2\2\u0082\u0083"+
		"\5\"\22\2\u0083\u0084\7\22\2\2\u0084\u00b8\3\2\2\2\u0085\u0086\5\36\20"+
		"\2\u0086\u0087\7 \2\2\u0087\u0088\5\36\20\2\u0088\u0089\7\22\2\2\u0089"+
		"\u00b8\3\2\2\2\u008a\u008b\7\24\2\2\u008b\u008c\5\32\16\2\u008c\u0090"+
		"\7\25\2\2\u008d\u008f\5\24\13\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2"+
		"\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u009e\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0093\u0094\7\30\2\2\u0094\u0095\5\32\16\2\u0095\u0099\7\25\2"+
		"\2\u0096\u0098\5\24\13\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009c\u0093\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a8\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a5\7\31"+
		"\2\2\u00a2\u00a4\5\24\13\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u00a1\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\7\23\2\2\u00ab\u00ac\7\24\2\2\u00ac\u00b8\3\2\2\2\u00ad\u00b8\5"+
		"\20\t\2\u00ae\u00b8\5\22\n\2\u00af\u00b0\7\35\2\2\u00b0\u00b1\5\"\22\2"+
		"\u00b1\u00b2\7\22\2\2\u00b2\u00b8\3\2\2\2\u00b3\u00b4\7\34\2\2\u00b4\u00b5"+
		"\5\"\22\2\u00b5\u00b6\7\22\2\2\u00b6\u00b8\3\2\2\2\u00b7\u0080\3\2\2\2"+
		"\u00b7\u0085\3\2\2\2\u00b7\u008a\3\2\2\2\u00b7\u00ad\3\2\2\2\u00b7\u00ae"+
		"\3\2\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8\25\3\2\2\2\u00b9"+
		"\u00ba\5\6\4\2\u00ba\27\3\2\2\2\u00bb\u00bc\5\"\22\2\u00bc\u00bd\7\t\2"+
		"\2\u00bd\u00be\5\"\22\2\u00be\31\3\2\2\2\u00bf\u00c0\5\"\22\2\u00c0\u00c1"+
		"\5\34\17\2\u00c1\u00c2\5\"\22\2\u00c2\33\3\2\2\2\u00c3\u00c4\t\2\2\2\u00c4"+
		"\35\3\2\2\2\u00c5\u00ca\5 \21\2\u00c6\u00c7\7\4\2\2\u00c7\u00c9\5 \21"+
		"\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\37\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d8\5\6\4\2\u00ce"+
		"\u00cf\5\6\4\2\u00cf\u00d0\7\3\2\2\u00d0\u00d1\5\4\3\2\u00d1\u00d8\3\2"+
		"\2\2\u00d2\u00d3\5\6\4\2\u00d3\u00d4\7\n\2\2\u00d4\u00d5\5\"\22\2\u00d5"+
		"\u00d6\7\13\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00cd\3\2\2\2\u00d7\u00ce\3"+
		"\2\2\2\u00d7\u00d2\3\2\2\2\u00d8!\3\2\2\2\u00d9\u00da\b\22\1\2\u00da\u00db"+
		"\7\f\2\2\u00db\u00dc\5\"\22\2\u00dc\u00dd\7\r\2\2\u00dd\u00ef\3\2\2\2"+
		"\u00de\u00ef\5\6\4\2\u00df\u00ef\5\4\3\2\u00e0\u00e1\5\6\4\2\u00e1\u00e2"+
		"\7\f\2\2\u00e2\u00e3\5\"\22\2\u00e3\u00e4\7\r\2\2\u00e4\u00ef\3\2\2\2"+
		"\u00e5\u00e6\5\6\4\2\u00e6\u00e7\7\3\2\2\u00e7\u00e8\5\4\3\2\u00e8\u00ef"+
		"\3\2\2\2\u00e9\u00ea\5\6\4\2\u00ea\u00eb\7\n\2\2\u00eb\u00ec\5\"\22\2"+
		"\u00ec\u00ed\7\13\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00d9\3\2\2\2\u00ee\u00de"+
		"\3\2\2\2\u00ee\u00df\3\2\2\2\u00ee\u00e0\3\2\2\2\u00ee\u00e5\3\2\2\2\u00ee"+
		"\u00e9\3\2\2\2\u00ef\u00fb\3\2\2\2\u00f0\u00f1\f\13\2\2\u00f1\u00f2\7"+
		"\4\2\2\u00f2\u00fa\5\"\22\f\u00f3\u00f4\f\n\2\2\u00f4\u00f5\t\3\2\2\u00f5"+
		"\u00fa\5\"\22\13\u00f6\u00f7\f\t\2\2\u00f7\u00f8\t\4\2\2\u00f8\u00fa\5"+
		"\"\22\n\u00f9\u00f0\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9\u00f6\3\2\2\2\u00fa"+
		"\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc#\3\2\2\2"+
		"\u00fd\u00fb\3\2\2\2\30-/=EMQ^`hnz\u0090\u0099\u009e\u00a5\u00a8\u00b7"+
		"\u00ca\u00d7\u00ee\u00f9\u00fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}