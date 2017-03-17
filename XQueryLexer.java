// Generated from XQuery.g4 by ANTLR 4.6
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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, ID=37, FILE=38, STRING=39, 
		VAR=40, WS=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "ID", "FILE", "STRING", "VAR", "CHARS", "ALPHA", 
		"ALNUM", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'/'", "'//'", "'<'", "'>'", "'{'", "'}'", 
		"'</'", "'for'", "'in'", "'let'", "':='", "'where'", "'return'", "'='", 
		"'eq'", "'=='", "'is'", "'empty'", "'some'", "'satisfies'", "'and'", "'or'", 
		"'not'", "'join'", "'['", "']'", "'doc(\"'", "'\")'", "'*'", "'.'", "'..'", 
		"'text()'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "ID", "FILE", "STRING", "VAR", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u0105\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3$\3%\3%\3&\3&\7&\u00dc\n&\f&\16&\u00df\13&\3\'\6\'\u00e2\n"+
		"\'\r\'\16\'\u00e3\3(\3(\3(\3(\7(\u00ea\n(\f(\16(\u00ed\13(\3(\3(\3)\3"+
		")\3)\7)\u00f4\n)\f)\16)\u00f7\13)\3*\3*\3+\3+\3,\3,\3-\6-\u0100\n-\r-"+
		"\16-\u0101\3-\3-\3\u00eb\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2U\2W\2Y+\3\2\7\4"+
		"\2\f\f\17\17\6\2/\60C\\aac|\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\""+
		"\"\u0107\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2Y"+
		"\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7_\3\2\2\2\ta\3\2\2\2\13c\3\2\2\2\rf\3"+
		"\2\2\2\17h\3\2\2\2\21j\3\2\2\2\23l\3\2\2\2\25n\3\2\2\2\27q\3\2\2\2\31"+
		"u\3\2\2\2\33x\3\2\2\2\35|\3\2\2\2\37\177\3\2\2\2!\u0085\3\2\2\2#\u008c"+
		"\3\2\2\2%\u008e\3\2\2\2\'\u0091\3\2\2\2)\u0094\3\2\2\2+\u0097\3\2\2\2"+
		"-\u009d\3\2\2\2/\u00a2\3\2\2\2\61\u00ac\3\2\2\2\63\u00b0\3\2\2\2\65\u00b3"+
		"\3\2\2\2\67\u00b7\3\2\2\29\u00bc\3\2\2\2;\u00be\3\2\2\2=\u00c0\3\2\2\2"+
		"?\u00c6\3\2\2\2A\u00c9\3\2\2\2C\u00cb\3\2\2\2E\u00cd\3\2\2\2G\u00d0\3"+
		"\2\2\2I\u00d7\3\2\2\2K\u00d9\3\2\2\2M\u00e1\3\2\2\2O\u00e5\3\2\2\2Q\u00f0"+
		"\3\2\2\2S\u00f8\3\2\2\2U\u00fa\3\2\2\2W\u00fc\3\2\2\2Y\u00ff\3\2\2\2["+
		"\\\7*\2\2\\\4\3\2\2\2]^\7+\2\2^\6\3\2\2\2_`\7.\2\2`\b\3\2\2\2ab\7\61\2"+
		"\2b\n\3\2\2\2cd\7\61\2\2de\7\61\2\2e\f\3\2\2\2fg\7>\2\2g\16\3\2\2\2hi"+
		"\7@\2\2i\20\3\2\2\2jk\7}\2\2k\22\3\2\2\2lm\7\177\2\2m\24\3\2\2\2no\7>"+
		"\2\2op\7\61\2\2p\26\3\2\2\2qr\7h\2\2rs\7q\2\2st\7t\2\2t\30\3\2\2\2uv\7"+
		"k\2\2vw\7p\2\2w\32\3\2\2\2xy\7n\2\2yz\7g\2\2z{\7v\2\2{\34\3\2\2\2|}\7"+
		"<\2\2}~\7?\2\2~\36\3\2\2\2\177\u0080\7y\2\2\u0080\u0081\7j\2\2\u0081\u0082"+
		"\7g\2\2\u0082\u0083\7t\2\2\u0083\u0084\7g\2\2\u0084 \3\2\2\2\u0085\u0086"+
		"\7t\2\2\u0086\u0087\7g\2\2\u0087\u0088\7v\2\2\u0088\u0089\7w\2\2\u0089"+
		"\u008a\7t\2\2\u008a\u008b\7p\2\2\u008b\"\3\2\2\2\u008c\u008d\7?\2\2\u008d"+
		"$\3\2\2\2\u008e\u008f\7g\2\2\u008f\u0090\7s\2\2\u0090&\3\2\2\2\u0091\u0092"+
		"\7?\2\2\u0092\u0093\7?\2\2\u0093(\3\2\2\2\u0094\u0095\7k\2\2\u0095\u0096"+
		"\7u\2\2\u0096*\3\2\2\2\u0097\u0098\7g\2\2\u0098\u0099\7o\2\2\u0099\u009a"+
		"\7r\2\2\u009a\u009b\7v\2\2\u009b\u009c\7{\2\2\u009c,\3\2\2\2\u009d\u009e"+
		"\7u\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7o\2\2\u00a0\u00a1\7g\2\2\u00a1"+
		".\3\2\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7v\2\2\u00a5"+
		"\u00a6\7k\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7h\2\2\u00a8\u00a9\7k\2\2"+
		"\u00a9\u00aa\7g\2\2\u00aa\u00ab\7u\2\2\u00ab\60\3\2\2\2\u00ac\u00ad\7"+
		"c\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7f\2\2\u00af\62\3\2\2\2\u00b0\u00b1"+
		"\7q\2\2\u00b1\u00b2\7t\2\2\u00b2\64\3\2\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5"+
		"\7q\2\2\u00b5\u00b6\7v\2\2\u00b6\66\3\2\2\2\u00b7\u00b8\7l\2\2\u00b8\u00b9"+
		"\7q\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7p\2\2\u00bb8\3\2\2\2\u00bc\u00bd"+
		"\7]\2\2\u00bd:\3\2\2\2\u00be\u00bf\7_\2\2\u00bf<\3\2\2\2\u00c0\u00c1\7"+
		"f\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7e\2\2\u00c3\u00c4\7*\2\2\u00c4\u00c5"+
		"\7$\2\2\u00c5>\3\2\2\2\u00c6\u00c7\7$\2\2\u00c7\u00c8\7+\2\2\u00c8@\3"+
		"\2\2\2\u00c9\u00ca\7,\2\2\u00caB\3\2\2\2\u00cb\u00cc\7\60\2\2\u00ccD\3"+
		"\2\2\2\u00cd\u00ce\7\60\2\2\u00ce\u00cf\7\60\2\2\u00cfF\3\2\2\2\u00d0"+
		"\u00d1\7v\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7z\2\2\u00d3\u00d4\7v\2\2"+
		"\u00d4\u00d5\7*\2\2\u00d5\u00d6\7+\2\2\u00d6H\3\2\2\2\u00d7\u00d8\7B\2"+
		"\2\u00d8J\3\2\2\2\u00d9\u00dd\5U+\2\u00da\u00dc\5W,\2\u00db\u00da\3\2"+
		"\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"L\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e2\5S*\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4N\3\2\2\2"+
		"\u00e5\u00eb\7$\2\2\u00e6\u00e7\7^\2\2\u00e7\u00ea\7$\2\2\u00e8\u00ea"+
		"\n\2\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ee\u00ef\7$\2\2\u00efP\3\2\2\2\u00f0\u00f1\7&\2\2\u00f1\u00f5"+
		"\5U+\2\u00f2\u00f4\5W,\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6R\3\2\2\2\u00f7\u00f5\3\2\2\2"+
		"\u00f8\u00f9\t\3\2\2\u00f9T\3\2\2\2\u00fa\u00fb\t\4\2\2\u00fbV\3\2\2\2"+
		"\u00fc\u00fd\t\5\2\2\u00fdX\3\2\2\2\u00fe\u0100\t\6\2\2\u00ff\u00fe\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0104\b-\2\2\u0104Z\3\2\2\2\t\2\u00dd\u00e3\u00e9"+
		"\u00eb\u00f5\u0101\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}