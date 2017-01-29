// Generated from XQuery.g4 by ANTLR 4.6
package edu.ucsd.cse.xprocessor.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, ID=22, FILE=23, WS=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "ID", "FILE", "CHARS", "ALPHA", "ALNUM", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'doc(\"'", "'\")'", "'/'", "'//'", "'*'", "'.'", "'..'", "'text()'", 
		"'@'", "'('", "')'", "'['", "']'", "','", "'='", "'eq'", "'=='", "'is'", 
		"'and'", "'or'", "'not'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "ID", "FILE", 
		"WS"
	};
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


	public XQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\7\27z\n\27\f\27\16\27}\13"+
		"\27\3\30\6\30\u0080\n\30\r\30\16\30\u0081\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\6\34\u008b\n\34\r\34\16\34\u008c\3\34\3\34\2\2\35\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\2\63\2\65\2\67\32\3\2\6\6\2/\60C\\aac|\5"+
		"\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u008f\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\67\3\2\2\2\39\3\2"+
		"\2\2\5?\3\2\2\2\7B\3\2\2\2\tD\3\2\2\2\13G\3\2\2\2\rI\3\2\2\2\17K\3\2\2"+
		"\2\21N\3\2\2\2\23U\3\2\2\2\25W\3\2\2\2\27Y\3\2\2\2\31[\3\2\2\2\33]\3\2"+
		"\2\2\35_\3\2\2\2\37a\3\2\2\2!c\3\2\2\2#f\3\2\2\2%i\3\2\2\2\'l\3\2\2\2"+
		")p\3\2\2\2+s\3\2\2\2-w\3\2\2\2/\177\3\2\2\2\61\u0083\3\2\2\2\63\u0085"+
		"\3\2\2\2\65\u0087\3\2\2\2\67\u008a\3\2\2\29:\7f\2\2:;\7q\2\2;<\7e\2\2"+
		"<=\7*\2\2=>\7$\2\2>\4\3\2\2\2?@\7$\2\2@A\7+\2\2A\6\3\2\2\2BC\7\61\2\2"+
		"C\b\3\2\2\2DE\7\61\2\2EF\7\61\2\2F\n\3\2\2\2GH\7,\2\2H\f\3\2\2\2IJ\7\60"+
		"\2\2J\16\3\2\2\2KL\7\60\2\2LM\7\60\2\2M\20\3\2\2\2NO\7v\2\2OP\7g\2\2P"+
		"Q\7z\2\2QR\7v\2\2RS\7*\2\2ST\7+\2\2T\22\3\2\2\2UV\7B\2\2V\24\3\2\2\2W"+
		"X\7*\2\2X\26\3\2\2\2YZ\7+\2\2Z\30\3\2\2\2[\\\7]\2\2\\\32\3\2\2\2]^\7_"+
		"\2\2^\34\3\2\2\2_`\7.\2\2`\36\3\2\2\2ab\7?\2\2b \3\2\2\2cd\7g\2\2de\7"+
		"s\2\2e\"\3\2\2\2fg\7?\2\2gh\7?\2\2h$\3\2\2\2ij\7k\2\2jk\7u\2\2k&\3\2\2"+
		"\2lm\7c\2\2mn\7p\2\2no\7f\2\2o(\3\2\2\2pq\7q\2\2qr\7t\2\2r*\3\2\2\2st"+
		"\7p\2\2tu\7q\2\2uv\7v\2\2v,\3\2\2\2w{\5\63\32\2xz\5\65\33\2yx\3\2\2\2"+
		"z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|.\3\2\2\2}{\3\2\2\2~\u0080\5\61\31\2\177"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\60\3\2\2\2\u0083\u0084\t\2\2\2\u0084\62\3\2\2\2\u0085\u0086\t\3\2\2\u0086"+
		"\64\3\2\2\2\u0087\u0088\t\4\2\2\u0088\66\3\2\2\2\u0089\u008b\t\5\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\34\2\2\u008f8\3\2\2\2\6\2{\u0081"+
		"\u008c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}