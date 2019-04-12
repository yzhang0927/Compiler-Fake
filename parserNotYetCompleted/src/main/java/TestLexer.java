// Generated from /Users/syd/Desktop/scala_proj/javaproj/Compiler-Fake/Test.g4 by ANTLR 4.7.2
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
		OP_GREATEREQUAL=41, NEWLINE=42;
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
			"NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u01a4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\5+\u019e\n+\3+\5+\u01a1\n+\3+\3"+
		"+\2\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\2\2\u01a5\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5"+
		"Z\3\2\2\2\7a\3\2\2\2\tj\3\2\2\2\13r\3\2\2\2\rz\3\2\2\2\17\u0083\3\2\2"+
		"\2\21\u008a\3\2\2\2\23\u0092\3\2\2\2\25\u009c\3\2\2\2\27\u00a2\3\2\2\2"+
		"\31\u00a8\3\2\2\2\33\u00ad\3\2\2\2\35\u00b2\3\2\2\2\37\u00bb\3\2\2\2!"+
		"\u00c4\3\2\2\2#\u00cd\3\2\2\2%\u00d7\3\2\2\2\'\u00e0\3\2\2\2)\u00e5\3"+
		"\2\2\2+\u00eb\3\2\2\2-\u00f2\3\2\2\2/\u00f8\3\2\2\2\61\u0100\3\2\2\2\63"+
		"\u0106\3\2\2\2\65\u010f\3\2\2\2\67\u0118\3\2\2\29\u0120\3\2\2\2;\u012b"+
		"\3\2\2\2=\u0131\3\2\2\2?\u0138\3\2\2\2A\u013e\3\2\2\2C\u0145\3\2\2\2E"+
		"\u014c\3\2\2\2G\u0150\3\2\2\2I\u0159\3\2\2\2K\u0161\3\2\2\2M\u016a\3\2"+
		"\2\2O\u0173\3\2\2\2Q\u017e\3\2\2\2S\u018b\3\2\2\2U\u01a0\3\2\2\2WX\7K"+
		"\2\2XY\7F\2\2Y\4\3\2\2\2Z[\7Q\2\2[\\\7R\2\2\\]\7a\2\2]^\7F\2\2^_\7Q\2"+
		"\2_`\7V\2\2`\6\3\2\2\2ab\7Q\2\2bc\7R\2\2cd\7a\2\2de\7E\2\2ef\7Q\2\2fg"+
		"\7O\2\2gh\7O\2\2hi\7C\2\2i\b\3\2\2\2jk\7Q\2\2kl\7R\2\2lm\7a\2\2mn\7R\2"+
		"\2no\7N\2\2op\7W\2\2pq\7U\2\2q\n\3\2\2\2rs\7K\2\2st\7P\2\2tu\7V\2\2uv"+
		"\7a\2\2vw\7N\2\2wx\7K\2\2xy\7V\2\2y\f\3\2\2\2z{\7Q\2\2{|\7R\2\2|}\7a\2"+
		"\2}~\7O\2\2~\177\7K\2\2\177\u0080\7P\2\2\u0080\u0081\7W\2\2\u0081\u0082"+
		"\7U\2\2\u0082\16\3\2\2\2\u0083\u0084\7Q\2\2\u0084\u0085\7R\2\2\u0085\u0086"+
		"\7a\2\2\u0086\u0087\7F\2\2\u0087\u0088\7K\2\2\u0088\u0089\7X\2\2\u0089"+
		"\20\3\2\2\2\u008a\u008b\7Q\2\2\u008b\u008c\7R\2\2\u008c\u008d\7a\2\2\u008d"+
		"\u008e\7O\2\2\u008e\u008f\7W\2\2\u008f\u0090\7N\2\2\u0090\u0091\7V\2\2"+
		"\u0091\22\3\2\2\2\u0092\u0093\7Q\2\2\u0093\u0094\7R\2\2\u0094\u0095\7"+
		"a\2\2\u0095\u0096\7F\2\2\u0096\u0097\7Q\2\2\u0097\u0098\7V\2\2\u0098\u0099"+
		"\7F\2\2\u0099\u009a\7Q\2\2\u009a\u009b\7V\2\2\u009b\24\3\2\2\2\u009c\u009d"+
		"\7N\2\2\u009d\u009e\7D\2\2\u009e\u009f\7T\2\2\u009f\u00a0\7C\2\2\u00a0"+
		"\u00a1\7M\2\2\u00a1\26\3\2\2\2\u00a2\u00a3\7T\2\2\u00a3\u00a4\7D\2\2\u00a4"+
		"\u00a5\7T\2\2\u00a5\u00a6\7C\2\2\u00a6\u00a7\7M\2\2\u00a7\30\3\2\2\2\u00a8"+
		"\u00a9\7N\2\2\u00a9\u00aa\7R\2\2\u00aa\u00ab\7C\2\2\u00ab\u00ac\7T\2\2"+
		"\u00ac\32\3\2\2\2\u00ad\u00ae\7T\2\2\u00ae\u00af\7R\2\2\u00af\u00b0\7"+
		"C\2\2\u00b0\u00b1\7T\2\2\u00b1\34\3\2\2\2\u00b2\u00b3\7M\2\2\u00b3\u00b4"+
		"\7Y\2\2\u00b4\u00b5\7a\2\2\u00b5\u00b6\7C\2\2\u00b6\u00b7\7T\2\2\u00b7"+
		"\u00b8\7T\2\2\u00b8\u00b9\7C\2\2\u00b9\u00ba\7[\2\2\u00ba\36\3\2\2\2\u00bb"+
		"\u00bc\7M\2\2\u00bc\u00bd\7Y\2\2\u00bd\u00be\7a\2\2\u00be\u00bf\7V\2\2"+
		"\u00bf\u00c0\7W\2\2\u00c0\u00c1\7R\2\2\u00c1\u00c2\7N\2\2\u00c2\u00c3"+
		"\7G\2\2\u00c3 \3\2\2\2\u00c4\u00c5\7M\2\2\u00c5\u00c6\7Y\2\2\u00c6\u00c7"+
		"\7a\2\2\u00c7\u00c8\7N\2\2\u00c8\u00c9\7Q\2\2\u00c9\u00ca\7E\2\2\u00ca"+
		"\u00cb\7C\2\2\u00cb\u00cc\7N\2\2\u00cc\"\3\2\2\2\u00cd\u00ce\7M\2\2\u00ce"+
		"\u00cf\7Y\2\2\u00cf\u00d0\7a\2\2\u00d0\u00d1\7I\2\2\u00d1\u00d2\7N\2\2"+
		"\u00d2\u00d3\7Q\2\2\u00d3\u00d4\7D\2\2\u00d4\u00d5\7C\2\2\u00d5\u00d6"+
		"\7N\2\2\u00d6$\3\2\2\2\u00d7\u00d8\7M\2\2\u00d8\u00d9\7Y\2\2\u00d9\u00da"+
		"\7a\2\2\u00da\u00db\7F\2\2\u00db\u00dc\7G\2\2\u00dc\u00dd\7H\2\2\u00dd"+
		"\u00de\7W\2\2\u00de\u00df\7P\2\2\u00df&\3\2\2\2\u00e0\u00e1\7U\2\2\u00e1"+
		"\u00e2\7G\2\2\u00e2\u00e3\7O\2\2\u00e3\u00e4\7K\2\2\u00e4(\3\2\2\2\u00e5"+
		"\u00e6\7F\2\2\u00e6\u00e7\7G\2\2\u00e7\u00e8\7H\2\2\u00e8\u00e9\7W\2\2"+
		"\u00e9\u00ea\7P\2\2\u00ea*\3\2\2\2\u00eb\u00ec\7M\2\2\u00ec\u00ed\7Y\2"+
		"\2\u00ed\u00ee\7a\2\2\u00ee\u00ef\7G\2\2\u00ef\u00f0\7P\2\2\u00f0\u00f1"+
		"\7F\2\2\u00f1,\3\2\2\2\u00f2\u00f3\7M\2\2\u00f3\u00f4\7Y\2\2\u00f4\u00f5"+
		"\7a\2\2\u00f5\u00f6\7K\2\2\u00f6\u00f7\7H\2\2\u00f7.\3\2\2\2\u00f8\u00f9"+
		"\7M\2\2\u00f9\u00fa\7Y\2\2\u00fa\u00fb\7a\2\2\u00fb\u00fc\7V\2\2\u00fc"+
		"\u00fd\7J\2\2\u00fd\u00fe\7G\2\2\u00fe\u00ff\7P\2\2\u00ff\60\3\2\2\2\u0100"+
		"\u0101\7M\2\2\u0101\u0102\7Y\2\2\u0102\u0103\7a\2\2\u0103\u0104\7F\2\2"+
		"\u0104\u0105\7Q\2\2\u0105\62\3\2\2\2\u0106\u0107\7M\2\2\u0107\u0108\7"+
		"Y\2\2\u0108\u0109\7a\2\2\u0109\u010a\7Y\2\2\u010a\u010b\7J\2\2\u010b\u010c"+
		"\7K\2\2\u010c\u010d\7N\2\2\u010d\u010e\7G\2\2\u010e\64\3\2\2\2\u010f\u0110"+
		"\7M\2\2\u0110\u0111\7Y\2\2\u0111\u0112\7a\2\2\u0112\u0113\7G\2\2\u0113"+
		"\u0114\7N\2\2\u0114\u0115\7U\2\2\u0115\u0116\7K\2\2\u0116\u0117\7H\2\2"+
		"\u0117\66\3\2\2\2\u0118\u0119\7M\2\2\u0119\u011a\7Y\2\2\u011a\u011b\7"+
		"a\2\2\u011b\u011c\7G\2\2\u011c\u011d\7N\2\2\u011d\u011e\7U\2\2\u011e\u011f"+
		"\7G\2\2\u011f8\3\2\2\2\u0120\u0121\7M\2\2\u0121\u0122\7Y\2\2\u0122\u0123"+
		"\7a\2\2\u0123\u0124\7H\2\2\u0124\u0125\7Q\2\2\u0125\u0126\7T\2\2\u0126"+
		"\u0127\7G\2\2\u0127\u0128\7C\2\2\u0128\u0129\7E\2\2\u0129\u012a\7J\2\2"+
		"\u012a:\3\2\2\2\u012b\u012c\7M\2\2\u012c\u012d\7Y\2\2\u012d\u012e\7a\2"+
		"\2\u012e\u012f\7K\2\2\u012f\u0130\7P\2\2\u0130<\3\2\2\2\u0131\u0132\7"+
		"M\2\2\u0132\u0133\7Y\2\2\u0133\u0134\7a\2\2\u0134\u0135\7H\2\2\u0135\u0136"+
		"\7Q\2\2\u0136\u0137\7T\2\2\u0137>\3\2\2\2\u0138\u0139\7R\2\2\u0139\u013a"+
		"\7T\2\2\u013a\u013b\7K\2\2\u013b\u013c\7P\2\2\u013c\u013d\7V\2\2\u013d"+
		"@\3\2\2\2\u013e\u013f\7T\2\2\u013f\u0140\7G\2\2\u0140\u0141\7V\2\2\u0141"+
		"\u0142\7W\2\2\u0142\u0143\7T\2\2\u0143\u0144\7P\2\2\u0144B\3\2\2\2\u0145"+
		"\u0146\7C\2\2\u0146\u0147\7U\2\2\u0147\u0148\7U\2\2\u0148\u0149\7K\2\2"+
		"\u0149\u014a\7I\2\2\u014a\u014b\7P\2\2\u014bD\3\2\2\2\u014c\u014d\7H\2"+
		"\2\u014d\u014e\7Q\2\2\u014e\u014f\7T\2\2\u014fF\3\2\2\2\u0150\u0151\7"+
		"G\2\2\u0151\u0152\7Z\2\2\u0152\u0153\7E\2\2\u0153\u0154\7J\2\2\u0154\u0155"+
		"\7C\2\2\u0155\u0156\7P\2\2\u0156\u0157\7I\2\2\u0157\u0158\7G\2\2\u0158"+
		"H\3\2\2\2\u0159\u015a\7Q\2\2\u015a\u015b\7R\2\2\u015b\u015c\7a\2\2\u015c"+
		"\u015d\7N\2\2\u015d\u015e\7G\2\2\u015e\u015f\7U\2\2\u015f\u0160\7U\2\2"+
		"\u0160J\3\2\2\2\u0161\u0162\7Q\2\2\u0162\u0163\7R\2\2\u0163\u0164\7a\2"+
		"\2\u0164\u0165\7G\2\2\u0165\u0166\7S\2\2\u0166\u0167\7W\2\2\u0167\u0168"+
		"\7C\2\2\u0168\u0169\7N\2\2\u0169L\3\2\2\2\u016a\u016b\7Q\2\2\u016b\u016c"+
		"\7R\2\2\u016c\u016d\7a\2\2\u016d\u016e\7I\2\2\u016e\u016f\7T\2\2\u016f"+
		"\u0170\7G\2\2\u0170\u0171\7C\2\2\u0171\u0172\7V\2\2\u0172N\3\2\2\2\u0173"+
		"\u0174\7Q\2\2\u0174\u0175\7R\2\2\u0175\u0176\7a\2\2\u0176\u0177\7P\2\2"+
		"\u0177\u0178\7Q\2\2\u0178\u0179\7V\2\2\u0179\u017a\7G\2\2\u017a\u017b"+
		"\7S\2\2\u017b\u017c\7W\2\2\u017c\u017d\7C\2\2\u017dP\3\2\2\2\u017e\u017f"+
		"\7Q\2\2\u017f\u0180\7R\2\2\u0180\u0181\7a\2\2\u0181\u0182\7N\2\2\u0182"+
		"\u0183\7G\2\2\u0183\u0184\7U\2\2\u0184\u0185\7U\2\2\u0185\u0186\7G\2\2"+
		"\u0186\u0187\7S\2\2\u0187\u0188\7W\2\2\u0188\u0189\7C\2\2\u0189\u018a"+
		"\7N\2\2\u018aR\3\2\2\2\u018b\u018c\7Q\2\2\u018c\u018d\7R\2\2\u018d\u018e"+
		"\7a\2\2\u018e\u018f\7I\2\2\u018f\u0190\7T\2\2\u0190\u0191\7G\2\2\u0191"+
		"\u0192\7C\2\2\u0192\u0193\7V\2\2\u0193\u0194\7G\2\2\u0194\u0195\7T\2\2"+
		"\u0195\u0196\7G\2\2\u0196\u0197\7S\2\2\u0197\u0198\7W\2\2\u0198\u0199"+
		"\7C\2\2\u0199\u019a\7N\2\2\u019aT\3\2\2\2\u019b\u019d\7\17\2\2\u019c\u019e"+
		"\7\f\2\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a1\3\2\2\2\u019f"+
		"\u01a1\7\f\2\2\u01a0\u019b\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a2\3\2"+
		"\2\2\u01a2\u01a3\b+\2\2\u01a3V\3\2\2\2\5\2\u019d\u01a0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}