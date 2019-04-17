// Generated from /Users/ZhangYu/workspaces/java_workspace/compilerfake/grammar/Calc.g4 by ANTLR 4.7.2
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
public class CalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, OP_DOT=2, OP_COMMA=3, OP_PLUS=4, INT_LIT=5, OP_MINUS=6, OP_DIV=7, 
		OP_MULT=8, OP_DOTDOT=9, LBRAK=10, RBRAK=11, LPAR=12, RPAR=13, KW_ARRAY=14, 
		KW_LOCAL=15, KW_GLOBAL=16, KW_DEFUN=17, SEMI=18, KW_END=19, KW_IF=20, 
		KW_THEN=21, KW_DO=22, KW_WHILE=23, KW_ELSIF=24, KW_ELSE=25, KW_FOREACH=26, 
		KW_IN=27, PRINT=28, RETURN=29, ASSIGN=30, FOR=31, EXCHANGE=32, OP_LESS=33, 
		OP_EQUAL=34, OP_GREATER=35, OP_NOTEQUA=36, OP_LESSEQUAL=37, OP_GREATEREQUAL=38, 
		WS=39;
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
			null, "'ID'", "'.'", "','", "'+'", "'INT_LIT'", "'-'", "'/'", "'*'", 
			"'..'", "'['", "']'", "'('", "')'", "'array'", "'local'", "'global'", 
			"'defun'", "';'", "'end'", "'if'", "'then'", "'do'", "'while'", "'elsif'", 
			"'else'", "'foreach'", "'in'", "'print'", "'return'", "'='", "'for'", 
			"'<->'", "'<'", "'=='", "'>'", "'!='", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "OP_DOT", "OP_COMMA", "OP_PLUS", "INT_LIT", "OP_MINUS", "OP_DIV", 
			"OP_MULT", "OP_DOTDOT", "LBRAK", "RBRAK", "LPAR", "RPAR", "KW_ARRAY", 
			"KW_LOCAL", "KW_GLOBAL", "KW_DEFUN", "SEMI", "KW_END", "KW_IF", "KW_THEN", 
			"KW_DO", "KW_WHILE", "KW_ELSIF", "KW_ELSE", "KW_FOREACH", "KW_IN", "PRINT", 
			"RETURN", "ASSIGN", "FOR", "EXCHANGE", "OP_LESS", "OP_EQUAL", "OP_GREATER", 
			"OP_NOTEQUA", "OP_LESSEQUAL", "OP_GREATEREQUAL", "WS"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitStart_symbol(this);
			else return visitor.visitChildren(this);
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
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << KW_ARRAY) | (1L << KW_LOCAL) | (1L << KW_GLOBAL) | (1L << KW_DEFUN) | (1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN))) != 0)) {
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
		public TerminalNode KW_ARRAY() { return getToken(CalcParser.KW_ARRAY, 0); }
		public TerminalNode ID() { return getToken(CalcParser.ID, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		int _la;
		try {
			setState(62);
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
			case KW_LOCAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(KW_LOCAL);
				setState(50);
				match(ID);
				setState(51);
				match(ASSIGN);
				setState(52);
				expr(0);
				setState(53);
				match(SEMI);
				}
				break;
			case KW_GLOBAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(KW_GLOBAL);
				setState(56);
				match(ID);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(57);
					match(ASSIGN);
					setState(58);
					expr(0);
					}
				}

				setState(61);
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
		public List<TerminalNode> ID() { return getTokens(CalcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CalcParser.ID, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(KW_DEFUN);
			setState(65);
			match(ID);
			setState(66);
			match(LPAR);
			setState(67);
			match(ID);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(68);
				match(OP_COMMA);
				setState(69);
				match(ID);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(RPAR);
			setState(76);
			body();
			setState(77);
			match(KW_END);
			setState(78);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << KW_ARRAY) | (1L << KW_LOCAL) | (1L << KW_GLOBAL) | (1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN))) != 0)) {
				{
				setState(82);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case KW_IF:
				case KW_WHILE:
				case KW_FOREACH:
				case PRINT:
				case RETURN:
					{
					setState(80);
					statement();
					}
					break;
				case KW_ARRAY:
				case KW_LOCAL:
				case KW_GLOBAL:
					{
					setState(81);
					decl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(86);
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
		public TerminalNode ID() { return getToken(CalcParser.ID, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				lhs();
				setState(88);
				match(ASSIGN);
				setState(89);
				expr(0);
				setState(90);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				lhs();
				setState(93);
				match(EXCHANGE);
				setState(94);
				lhs();
				setState(95);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(KW_WHILE);
				setState(98);
				bool_expr();
				setState(99);
				match(KW_DO);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN))) != 0)) {
					{
					{
					setState(100);
					statement();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				match(KW_END);
				setState(107);
				match(KW_WHILE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				match(KW_IF);
				setState(110);
				bool_expr();
				setState(111);
				match(KW_THEN);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN))) != 0)) {
					{
					{
					setState(112);
					statement();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KW_ELSIF) {
					{
					{
					setState(118);
					match(KW_ELSIF);
					setState(119);
					bool_expr();
					setState(120);
					match(KW_THEN);
					setState(121);
					statement();
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ELSE) {
					{
					setState(128);
					match(KW_ELSE);
					setState(129);
					statement();
					}
				}

				setState(132);
				match(KW_END);
				setState(133);
				match(KW_IF);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				match(KW_FOREACH);
				setState(136);
				expr(0);
				setState(137);
				match(KW_IN);
				setState(140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(138);
					range();
					}
					break;
				case 2:
					{
					setState(139);
					match(ID);
					}
					break;
				}
				setState(142);
				match(KW_DO);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << KW_IF) | (1L << KW_WHILE) | (1L << KW_FOREACH) | (1L << PRINT) | (1L << RETURN))) != 0)) {
					{
					{
					setState(143);
					statement();
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
				match(KW_END);
				setState(150);
				match(FOR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				match(RETURN);
				setState(153);
				expr(0);
				setState(154);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(156);
				match(PRINT);
				setState(157);
				expr(0);
				setState(158);
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
		public TerminalNode ID() { return getToken(CalcParser.ID, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitArray_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_idContext array_id() throws RecognitionException {
		Array_idContext _localctx = new Array_idContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			expr(0);
			setState(165);
			match(OP_DOTDOT);
			setState(166);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bool_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			expr(0);
			setState(169);
			bool_op();
			setState(170);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitBool_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_opContext bool_op() throws RecognitionException {
		Bool_opContext _localctx = new Bool_opContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bool_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitLhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lhs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			lhs_item();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(175);
				match(OP_COMMA);
				setState(176);
				lhs_item();
				}
				}
				setState(181);
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
		public TerminalNode ID() { return getToken(CalcParser.ID, 0); }
		public TerminalNode OP_DOT() { return getToken(CalcParser.OP_DOT, 0); }
		public TerminalNode INT_LIT() { return getToken(CalcParser.INT_LIT, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitLhs_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lhs_itemContext lhs_item() throws RecognitionException {
		Lhs_itemContext _localctx = new Lhs_itemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lhs_item);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(ID);
				setState(184);
				match(OP_DOT);
				setState(185);
				match(INT_LIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(ID);
				setState(187);
				match(LBRAK);
				setState(188);
				expr(0);
				setState(189);
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
		public TerminalNode ID() { return getToken(CalcParser.ID, 0); }
		public TerminalNode INT_LIT() { return getToken(CalcParser.INT_LIT, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(194);
				match(LPAR);
				setState(195);
				expr(0);
				setState(196);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(198);
				match(ID);
				}
				break;
			case 3:
				{
				setState(199);
				match(INT_LIT);
				}
				break;
			case 4:
				{
				setState(200);
				match(ID);
				setState(201);
				expr(3);
				}
				break;
			case 5:
				{
				setState(202);
				match(ID);
				setState(203);
				match(OP_DOT);
				setState(204);
				match(INT_LIT);
				}
				break;
			case 6:
				{
				setState(205);
				match(ID);
				setState(206);
				match(LBRAK);
				setState(207);
				expr(0);
				setState(208);
				match(RBRAK);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(221);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(213);
						match(OP_COMMA);
						setState(214);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(215);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(216);
						_la = _input.LA(1);
						if ( !(_la==OP_DIV || _la==OP_MULT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(217);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(218);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(219);
						_la = _input.LA(1);
						if ( !(_la==OP_PLUS || _la==OP_MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(220);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(225);
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
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00e5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\3\7\3\"\n\3\f\3\16\3%"+
		"\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\4\5\4A\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\7\6U\n\6\f"+
		"\6\16\6X\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\7\7h\n\7\f\7\16\7k\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7t\n\7\f\7\16\7"+
		"w\13\7\3\7\3\7\3\7\3\7\3\7\7\7~\n\7\f\7\16\7\u0081\13\7\3\7\3\7\5\7\u0085"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u008f\n\7\3\7\3\7\7\7\u0093\n"+
		"\7\f\7\16\7\u0096\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u00a3\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\7\f\u00b4\n\f\f\f\16\f\u00b7\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00c2\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d5\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u00e0\n\16\f\16\16\16\u00e3\13\16\3\16\2\3\32"+
		"\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\5\3\2#(\3\2\t\n\4\2\6\6\b\b\2\u00f8"+
		"\2\34\3\2\2\2\4#\3\2\2\2\6@\3\2\2\2\bB\3\2\2\2\nV\3\2\2\2\f\u00a2\3\2"+
		"\2\2\16\u00a4\3\2\2\2\20\u00a6\3\2\2\2\22\u00aa\3\2\2\2\24\u00ae\3\2\2"+
		"\2\26\u00b0\3\2\2\2\30\u00c1\3\2\2\2\32\u00d4\3\2\2\2\34\35\5\4\3\2\35"+
		"\3\3\2\2\2\36\"\5\f\7\2\37\"\5\6\4\2 \"\5\b\5\2!\36\3\2\2\2!\37\3\2\2"+
		"\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\5\3\2\2\2%#\3\2\2\2&\'\7"+
		"\20\2\2\'(\7\3\2\2()\7\f\2\2)*\5\32\16\2*+\7\13\2\2+,\5\32\16\2,/\7\r"+
		"\2\2-.\7 \2\2.\60\5\32\16\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62"+
		"\7\24\2\2\62A\3\2\2\2\63\64\7\21\2\2\64\65\7\3\2\2\65\66\7 \2\2\66\67"+
		"\5\32\16\2\678\7\24\2\28A\3\2\2\29:\7\22\2\2:=\7\3\2\2;<\7 \2\2<>\5\32"+
		"\16\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?A\7\24\2\2@&\3\2\2\2@\63\3\2\2\2@"+
		"9\3\2\2\2A\7\3\2\2\2BC\7\23\2\2CD\7\3\2\2DE\7\16\2\2EJ\7\3\2\2FG\7\5\2"+
		"\2GI\7\3\2\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2"+
		"\2MN\7\17\2\2NO\5\n\6\2OP\7\25\2\2PQ\7\23\2\2Q\t\3\2\2\2RU\5\f\7\2SU\5"+
		"\6\4\2TR\3\2\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\13\3\2\2\2X"+
		"V\3\2\2\2YZ\5\26\f\2Z[\7 \2\2[\\\5\32\16\2\\]\7\24\2\2]\u00a3\3\2\2\2"+
		"^_\5\26\f\2_`\7\"\2\2`a\5\26\f\2ab\7\24\2\2b\u00a3\3\2\2\2cd\7\31\2\2"+
		"de\5\22\n\2ei\7\30\2\2fh\5\f\7\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2"+
		"\2jl\3\2\2\2ki\3\2\2\2lm\7\25\2\2mn\7\31\2\2n\u00a3\3\2\2\2op\7\26\2\2"+
		"pq\5\22\n\2qu\7\27\2\2rt\5\f\7\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2"+
		"\2v\177\3\2\2\2wu\3\2\2\2xy\7\32\2\2yz\5\22\n\2z{\7\27\2\2{|\5\f\7\2|"+
		"~\3\2\2\2}x\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0084\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\33\2\2\u0083\u0085\5\f"+
		"\7\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0087\7\25\2\2\u0087\u0088\7\26\2\2\u0088\u00a3\3\2\2\2\u0089\u008a\7"+
		"\34\2\2\u008a\u008b\5\32\16\2\u008b\u008e\7\35\2\2\u008c\u008f\5\20\t"+
		"\2\u008d\u008f\7\3\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0094\7\30\2\2\u0091\u0093\5\f\7\2\u0092\u0091\3\2\2\2"+
		"\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\25\2\2\u0098\u0099\7!\2\2\u0099"+
		"\u00a3\3\2\2\2\u009a\u009b\7\37\2\2\u009b\u009c\5\32\16\2\u009c\u009d"+
		"\7\24\2\2\u009d\u00a3\3\2\2\2\u009e\u009f\7\36\2\2\u009f\u00a0\5\32\16"+
		"\2\u00a0\u00a1\7\24\2\2\u00a1\u00a3\3\2\2\2\u00a2Y\3\2\2\2\u00a2^\3\2"+
		"\2\2\u00a2c\3\2\2\2\u00a2o\3\2\2\2\u00a2\u0089\3\2\2\2\u00a2\u009a\3\2"+
		"\2\2\u00a2\u009e\3\2\2\2\u00a3\r\3\2\2\2\u00a4\u00a5\7\3\2\2\u00a5\17"+
		"\3\2\2\2\u00a6\u00a7\5\32\16\2\u00a7\u00a8\7\13\2\2\u00a8\u00a9\5\32\16"+
		"\2\u00a9\21\3\2\2\2\u00aa\u00ab\5\32\16\2\u00ab\u00ac\5\24\13\2\u00ac"+
		"\u00ad\5\32\16\2\u00ad\23\3\2\2\2\u00ae\u00af\t\2\2\2\u00af\25\3\2\2\2"+
		"\u00b0\u00b5\5\30\r\2\u00b1\u00b2\7\5\2\2\u00b2\u00b4\5\30\r\2\u00b3\u00b1"+
		"\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\27\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00c2\7\3\2\2\u00b9\u00ba\7\3\2"+
		"\2\u00ba\u00bb\7\4\2\2\u00bb\u00c2\7\7\2\2\u00bc\u00bd\7\3\2\2\u00bd\u00be"+
		"\7\f\2\2\u00be\u00bf\5\32\16\2\u00bf\u00c0\7\r\2\2\u00c0\u00c2\3\2\2\2"+
		"\u00c1\u00b8\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c2\31"+
		"\3\2\2\2\u00c3\u00c4\b\16\1\2\u00c4\u00c5\7\16\2\2\u00c5\u00c6\5\32\16"+
		"\2\u00c6\u00c7\7\17\2\2\u00c7\u00d5\3\2\2\2\u00c8\u00d5\7\3\2\2\u00c9"+
		"\u00d5\7\7\2\2\u00ca\u00cb\7\3\2\2\u00cb\u00d5\5\32\16\5\u00cc\u00cd\7"+
		"\3\2\2\u00cd\u00ce\7\4\2\2\u00ce\u00d5\7\7\2\2\u00cf\u00d0\7\3\2\2\u00d0"+
		"\u00d1\7\f\2\2\u00d1\u00d2\5\32\16\2\u00d2\u00d3\7\r\2\2\u00d3\u00d5\3"+
		"\2\2\2\u00d4\u00c3\3\2\2\2\u00d4\u00c8\3\2\2\2\u00d4\u00c9\3\2\2\2\u00d4"+
		"\u00ca\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d5\u00e1\3\2"+
		"\2\2\u00d6\u00d7\f\13\2\2\u00d7\u00d8\7\5\2\2\u00d8\u00e0\5\32\16\f\u00d9"+
		"\u00da\f\n\2\2\u00da\u00db\t\3\2\2\u00db\u00e0\5\32\16\13\u00dc\u00dd"+
		"\f\t\2\2\u00dd\u00de\t\4\2\2\u00de\u00e0\5\32\16\n\u00df\u00d6\3\2\2\2"+
		"\u00df\u00d9\3\2\2\2\u00df\u00dc\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\33\3\2\2\2\u00e3\u00e1\3\2\2\2\26!"+
		"#/=@JTViu\177\u0084\u008e\u0094\u00a2\u00b5\u00c1\u00d4\u00df\u00e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}