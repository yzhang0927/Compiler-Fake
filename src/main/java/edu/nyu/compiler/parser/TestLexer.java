// Generated from /Users/student/workspaces/java_workspace/Compiler-Fake/grammar/Test.g4 by ANTLR 4.7.2
package edu.nyu.compiler.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestLexer extends Lexer {
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
		OP_GREATEREQUAL=41, NEWLINE=42, WS=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ID", "OP_DOT", "OP_COMMA", "OP_PLUS", "INT_LIT", "OP_MINUS", "OP_DIV", 
			"OP_MULT", "OP_DOTDOT", "LBRAK", "RBRAK", "LPAR", "RPAR", "KW_ARRAY", 
			"KW_TUPLE", "KW_LOCAL", "KW_GLOBAL", "KW_DEFUN", "SEMI", "DEFUN", "KW_END", 
			"KW_IF", "KW_THEN", "KW_DO", "KW_WHILE", "KW_ELSIF", "KW_ELSE", "KW_FOREACH", 
			"KW_IN", "KW_FOR", "PRINT", "RETURN", "ASSIGN", "FOR", "EXCHANGE", "OP_LESS", 
			"OP_EQUAL", "OP_GREATER", "OP_NOTEQUA", "OP_LESSEQUAL", "OP_GREATEREQUAL", 
			"NEWLINE", "WS"
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
			"NEWLINE", "WS"
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


	public TestLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u01ad\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\5+\u01a0\n+\3+\5+\u01a3\n"+
		"+\3+\3+\3,\6,\u01a8\n,\r,\16,\u01a9\3,\3,\2\2-\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-\3\2\3\5\2\13\f\16\17\"\"\2\u01af\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2"+
		"\2\2\5\\\3\2\2\2\7c\3\2\2\2\tl\3\2\2\2\13t\3\2\2\2\r|\3\2\2\2\17\u0085"+
		"\3\2\2\2\21\u008c\3\2\2\2\23\u0094\3\2\2\2\25\u009e\3\2\2\2\27\u00a4\3"+
		"\2\2\2\31\u00aa\3\2\2\2\33\u00af\3\2\2\2\35\u00b4\3\2\2\2\37\u00bd\3\2"+
		"\2\2!\u00c6\3\2\2\2#\u00cf\3\2\2\2%\u00d9\3\2\2\2\'\u00e2\3\2\2\2)\u00e7"+
		"\3\2\2\2+\u00ed\3\2\2\2-\u00f4\3\2\2\2/\u00fa\3\2\2\2\61\u0102\3\2\2\2"+
		"\63\u0108\3\2\2\2\65\u0111\3\2\2\2\67\u011a\3\2\2\29\u0122\3\2\2\2;\u012d"+
		"\3\2\2\2=\u0133\3\2\2\2?\u013a\3\2\2\2A\u0140\3\2\2\2C\u0147\3\2\2\2E"+
		"\u014e\3\2\2\2G\u0152\3\2\2\2I\u015b\3\2\2\2K\u0163\3\2\2\2M\u016c\3\2"+
		"\2\2O\u0175\3\2\2\2Q\u0180\3\2\2\2S\u018d\3\2\2\2U\u01a2\3\2\2\2W\u01a7"+
		"\3\2\2\2YZ\7K\2\2Z[\7F\2\2[\4\3\2\2\2\\]\7Q\2\2]^\7R\2\2^_\7a\2\2_`\7"+
		"F\2\2`a\7Q\2\2ab\7V\2\2b\6\3\2\2\2cd\7Q\2\2de\7R\2\2ef\7a\2\2fg\7E\2\2"+
		"gh\7Q\2\2hi\7O\2\2ij\7O\2\2jk\7C\2\2k\b\3\2\2\2lm\7Q\2\2mn\7R\2\2no\7"+
		"a\2\2op\7R\2\2pq\7N\2\2qr\7W\2\2rs\7U\2\2s\n\3\2\2\2tu\7K\2\2uv\7P\2\2"+
		"vw\7V\2\2wx\7a\2\2xy\7N\2\2yz\7K\2\2z{\7V\2\2{\f\3\2\2\2|}\7Q\2\2}~\7"+
		"R\2\2~\177\7a\2\2\177\u0080\7O\2\2\u0080\u0081\7K\2\2\u0081\u0082\7P\2"+
		"\2\u0082\u0083\7W\2\2\u0083\u0084\7U\2\2\u0084\16\3\2\2\2\u0085\u0086"+
		"\7Q\2\2\u0086\u0087\7R\2\2\u0087\u0088\7a\2\2\u0088\u0089\7F\2\2\u0089"+
		"\u008a\7K\2\2\u008a\u008b\7X\2\2\u008b\20\3\2\2\2\u008c\u008d\7Q\2\2\u008d"+
		"\u008e\7R\2\2\u008e\u008f\7a\2\2\u008f\u0090\7O\2\2\u0090\u0091\7W\2\2"+
		"\u0091\u0092\7N\2\2\u0092\u0093\7V\2\2\u0093\22\3\2\2\2\u0094\u0095\7"+
		"Q\2\2\u0095\u0096\7R\2\2\u0096\u0097\7a\2\2\u0097\u0098\7F\2\2\u0098\u0099"+
		"\7Q\2\2\u0099\u009a\7V\2\2\u009a\u009b\7F\2\2\u009b\u009c\7Q\2\2\u009c"+
		"\u009d\7V\2\2\u009d\24\3\2\2\2\u009e\u009f\7N\2\2\u009f\u00a0\7D\2\2\u00a0"+
		"\u00a1\7T\2\2\u00a1\u00a2\7C\2\2\u00a2\u00a3\7M\2\2\u00a3\26\3\2\2\2\u00a4"+
		"\u00a5\7T\2\2\u00a5\u00a6\7D\2\2\u00a6\u00a7\7T\2\2\u00a7\u00a8\7C\2\2"+
		"\u00a8\u00a9\7M\2\2\u00a9\30\3\2\2\2\u00aa\u00ab\7N\2\2\u00ab\u00ac\7"+
		"R\2\2\u00ac\u00ad\7C\2\2\u00ad\u00ae\7T\2\2\u00ae\32\3\2\2\2\u00af\u00b0"+
		"\7T\2\2\u00b0\u00b1\7R\2\2\u00b1\u00b2\7C\2\2\u00b2\u00b3\7T\2\2\u00b3"+
		"\34\3\2\2\2\u00b4\u00b5\7M\2\2\u00b5\u00b6\7Y\2\2\u00b6\u00b7\7a\2\2\u00b7"+
		"\u00b8\7C\2\2\u00b8\u00b9\7T\2\2\u00b9\u00ba\7T\2\2\u00ba\u00bb\7C\2\2"+
		"\u00bb\u00bc\7[\2\2\u00bc\36\3\2\2\2\u00bd\u00be\7M\2\2\u00be\u00bf\7"+
		"Y\2\2\u00bf\u00c0\7a\2\2\u00c0\u00c1\7V\2\2\u00c1\u00c2\7W\2\2\u00c2\u00c3"+
		"\7R\2\2\u00c3\u00c4\7N\2\2\u00c4\u00c5\7G\2\2\u00c5 \3\2\2\2\u00c6\u00c7"+
		"\7M\2\2\u00c7\u00c8\7Y\2\2\u00c8\u00c9\7a\2\2\u00c9\u00ca\7N\2\2\u00ca"+
		"\u00cb\7Q\2\2\u00cb\u00cc\7E\2\2\u00cc\u00cd\7C\2\2\u00cd\u00ce\7N\2\2"+
		"\u00ce\"\3\2\2\2\u00cf\u00d0\7M\2\2\u00d0\u00d1\7Y\2\2\u00d1\u00d2\7a"+
		"\2\2\u00d2\u00d3\7I\2\2\u00d3\u00d4\7N\2\2\u00d4\u00d5\7Q\2\2\u00d5\u00d6"+
		"\7D\2\2\u00d6\u00d7\7C\2\2\u00d7\u00d8\7N\2\2\u00d8$\3\2\2\2\u00d9\u00da"+
		"\7M\2\2\u00da\u00db\7Y\2\2\u00db\u00dc\7a\2\2\u00dc\u00dd\7F\2\2\u00dd"+
		"\u00de\7G\2\2\u00de\u00df\7H\2\2\u00df\u00e0\7W\2\2\u00e0\u00e1\7P\2\2"+
		"\u00e1&\3\2\2\2\u00e2\u00e3\7U\2\2\u00e3\u00e4\7G\2\2\u00e4\u00e5\7O\2"+
		"\2\u00e5\u00e6\7K\2\2\u00e6(\3\2\2\2\u00e7\u00e8\7F\2\2\u00e8\u00e9\7"+
		"G\2\2\u00e9\u00ea\7H\2\2\u00ea\u00eb\7W\2\2\u00eb\u00ec\7P\2\2\u00ec*"+
		"\3\2\2\2\u00ed\u00ee\7M\2\2\u00ee\u00ef\7Y\2\2\u00ef\u00f0\7a\2\2\u00f0"+
		"\u00f1\7G\2\2\u00f1\u00f2\7P\2\2\u00f2\u00f3\7F\2\2\u00f3,\3\2\2\2\u00f4"+
		"\u00f5\7M\2\2\u00f5\u00f6\7Y\2\2\u00f6\u00f7\7a\2\2\u00f7\u00f8\7K\2\2"+
		"\u00f8\u00f9\7H\2\2\u00f9.\3\2\2\2\u00fa\u00fb\7M\2\2\u00fb\u00fc\7Y\2"+
		"\2\u00fc\u00fd\7a\2\2\u00fd\u00fe\7V\2\2\u00fe\u00ff\7J\2\2\u00ff\u0100"+
		"\7G\2\2\u0100\u0101\7P\2\2\u0101\60\3\2\2\2\u0102\u0103\7M\2\2\u0103\u0104"+
		"\7Y\2\2\u0104\u0105\7a\2\2\u0105\u0106\7F\2\2\u0106\u0107\7Q\2\2\u0107"+
		"\62\3\2\2\2\u0108\u0109\7M\2\2\u0109\u010a\7Y\2\2\u010a\u010b\7a\2\2\u010b"+
		"\u010c\7Y\2\2\u010c\u010d\7J\2\2\u010d\u010e\7K\2\2\u010e\u010f\7N\2\2"+
		"\u010f\u0110\7G\2\2\u0110\64\3\2\2\2\u0111\u0112\7M\2\2\u0112\u0113\7"+
		"Y\2\2\u0113\u0114\7a\2\2\u0114\u0115\7G\2\2\u0115\u0116\7N\2\2\u0116\u0117"+
		"\7U\2\2\u0117\u0118\7K\2\2\u0118\u0119\7H\2\2\u0119\66\3\2\2\2\u011a\u011b"+
		"\7M\2\2\u011b\u011c\7Y\2\2\u011c\u011d\7a\2\2\u011d\u011e\7G\2\2\u011e"+
		"\u011f\7N\2\2\u011f\u0120\7U\2\2\u0120\u0121\7G\2\2\u01218\3\2\2\2\u0122"+
		"\u0123\7M\2\2\u0123\u0124\7Y\2\2\u0124\u0125\7a\2\2\u0125\u0126\7H\2\2"+
		"\u0126\u0127\7Q\2\2\u0127\u0128\7T\2\2\u0128\u0129\7G\2\2\u0129\u012a"+
		"\7C\2\2\u012a\u012b\7E\2\2\u012b\u012c\7J\2\2\u012c:\3\2\2\2\u012d\u012e"+
		"\7M\2\2\u012e\u012f\7Y\2\2\u012f\u0130\7a\2\2\u0130\u0131\7K\2\2\u0131"+
		"\u0132\7P\2\2\u0132<\3\2\2\2\u0133\u0134\7M\2\2\u0134\u0135\7Y\2\2\u0135"+
		"\u0136\7a\2\2\u0136\u0137\7H\2\2\u0137\u0138\7Q\2\2\u0138\u0139\7T\2\2"+
		"\u0139>\3\2\2\2\u013a\u013b\7R\2\2\u013b\u013c\7T\2\2\u013c\u013d\7K\2"+
		"\2\u013d\u013e\7P\2\2\u013e\u013f\7V\2\2\u013f@\3\2\2\2\u0140\u0141\7"+
		"T\2\2\u0141\u0142\7G\2\2\u0142\u0143\7V\2\2\u0143\u0144\7W\2\2\u0144\u0145"+
		"\7T\2\2\u0145\u0146\7P\2\2\u0146B\3\2\2\2\u0147\u0148\7C\2\2\u0148\u0149"+
		"\7U\2\2\u0149\u014a\7U\2\2\u014a\u014b\7K\2\2\u014b\u014c\7I\2\2\u014c"+
		"\u014d\7P\2\2\u014dD\3\2\2\2\u014e\u014f\7H\2\2\u014f\u0150\7Q\2\2\u0150"+
		"\u0151\7T\2\2\u0151F\3\2\2\2\u0152\u0153\7G\2\2\u0153\u0154\7Z\2\2\u0154"+
		"\u0155\7E\2\2\u0155\u0156\7J\2\2\u0156\u0157\7C\2\2\u0157\u0158\7P\2\2"+
		"\u0158\u0159\7I\2\2\u0159\u015a\7G\2\2\u015aH\3\2\2\2\u015b\u015c\7Q\2"+
		"\2\u015c\u015d\7R\2\2\u015d\u015e\7a\2\2\u015e\u015f\7N\2\2\u015f\u0160"+
		"\7G\2\2\u0160\u0161\7U\2\2\u0161\u0162\7U\2\2\u0162J\3\2\2\2\u0163\u0164"+
		"\7Q\2\2\u0164\u0165\7R\2\2\u0165\u0166\7a\2\2\u0166\u0167\7G\2\2\u0167"+
		"\u0168\7S\2\2\u0168\u0169\7W\2\2\u0169\u016a\7C\2\2\u016a\u016b\7N\2\2"+
		"\u016bL\3\2\2\2\u016c\u016d\7Q\2\2\u016d\u016e\7R\2\2\u016e\u016f\7a\2"+
		"\2\u016f\u0170\7I\2\2\u0170\u0171\7T\2\2\u0171\u0172\7G\2\2\u0172\u0173"+
		"\7C\2\2\u0173\u0174\7V\2\2\u0174N\3\2\2\2\u0175\u0176\7Q\2\2\u0176\u0177"+
		"\7R\2\2\u0177\u0178\7a\2\2\u0178\u0179\7P\2\2\u0179\u017a\7Q\2\2\u017a"+
		"\u017b\7V\2\2\u017b\u017c\7G\2\2\u017c\u017d\7S\2\2\u017d\u017e\7W\2\2"+
		"\u017e\u017f\7C\2\2\u017fP\3\2\2\2\u0180\u0181\7Q\2\2\u0181\u0182\7R\2"+
		"\2\u0182\u0183\7a\2\2\u0183\u0184\7N\2\2\u0184\u0185\7G\2\2\u0185\u0186"+
		"\7U\2\2\u0186\u0187\7U\2\2\u0187\u0188\7G\2\2\u0188\u0189\7S\2\2\u0189"+
		"\u018a\7W\2\2\u018a\u018b\7C\2\2\u018b\u018c\7N\2\2\u018cR\3\2\2\2\u018d"+
		"\u018e\7Q\2\2\u018e\u018f\7R\2\2\u018f\u0190\7a\2\2\u0190\u0191\7I\2\2"+
		"\u0191\u0192\7T\2\2\u0192\u0193\7G\2\2\u0193\u0194\7C\2\2\u0194\u0195"+
		"\7V\2\2\u0195\u0196\7G\2\2\u0196\u0197\7T\2\2\u0197\u0198\7G\2\2\u0198"+
		"\u0199\7S\2\2\u0199\u019a\7W\2\2\u019a\u019b\7C\2\2\u019b\u019c\7N\2\2"+
		"\u019cT\3\2\2\2\u019d\u019f\7\17\2\2\u019e\u01a0\7\f\2\2\u019f\u019e\3"+
		"\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u01a3\7\f\2\2\u01a2"+
		"\u019d\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\b+"+
		"\2\2\u01a5V\3\2\2\2\u01a6\u01a8\t\2\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01a9"+
		"\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01ac\b,\2\2\u01acX\3\2\2\2\6\2\u019f\u01a2\u01a9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}