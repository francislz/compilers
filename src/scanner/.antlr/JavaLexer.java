// Generated from /home/franciscone/Faculdade/Codigos/compilers/compiler/src/scanner/JavaLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ESPACO=1, COMENTARIO=2, NUMERO=3, SHORT=4, BYTE=5, INT=6, LONG=7, CHAR=8, 
		FLOAT=9, LOGICAL=10, NEW=11, PACKAGE=12, IMPORT=13, CONST=14, INSTANCEOF=15, 
		GOTO=16, CLASS=17, ABSTRACT=18, FINAL=19, PUBLIC=20, PRIVATE=21, PROTECTED=22, 
		EXTENDS=23, IMPLEMENTS=24, STATIC=25, THIS=26, SUPER=27, TRANSIENT=28, 
		VOLATILE=29, THROW=30, THROWS=31, VOID=32, SYNCHNOZED=33, NATIVE=34, INTERFACE=35, 
		IGUAL_ATRIB=36, MULT_ATRIB=37, DIV_ATRIB=38, MOD_ATRIB=39, ADD_ATRIB=40, 
		BIT_LEFT_ATRIB=41, BIT_RIGHT_ATRIB=42, U_BIT_RIGHT_ATRIB=43, AND_ATRIB=44, 
		XOR_ATRIB=45, OR_ATRIB=46, ADD=47, SUB=48, MULT=49, DIV=50, OR=51, AND=52, 
		IGUAL=53, MAIOR_IGUAL=54, MENOR_IGUAL=55, BITAND=56, BITOR=57, CARET=58, 
		SHIFT_RIGHT=59, SHIFT_LEFT=60, AC=61, FC=62, ACH=63, FCH=64, AP=65, FP=66, 
		PONTO=67, INTERROGACAO=68, EXCLAMACAO=69, DOIS_PONTOS=70, ARROBA=71, PONTOV=72, 
		IF=73, ELSE=74, CASE=75, DEFAULT=76, SWITCH=77, DO=78, WHILE=79, FOR=80, 
		BREAK=81, CONTINUE=82, RETURN=83, TRY=84, CATCH=85, FINALLY=86, STRING=87, 
		ID=88, ERRO=89;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LETRA", "DIGITO", "ESPACO", "COMENTARIO", "NUMERO", "SHORT", "BYTE", 
		"INT", "LONG", "CHAR", "FLOAT", "LOGICAL", "NEW", "PACKAGE", "IMPORT", 
		"CONST", "INSTANCEOF", "GOTO", "CLASS", "ABSTRACT", "FINAL", "PUBLIC", 
		"PRIVATE", "PROTECTED", "EXTENDS", "IMPLEMENTS", "STATIC", "THIS", "SUPER", 
		"TRANSIENT", "VOLATILE", "THROW", "THROWS", "VOID", "SYNCHNOZED", "NATIVE", 
		"INTERFACE", "IGUAL_ATRIB", "MULT_ATRIB", "DIV_ATRIB", "MOD_ATRIB", "ADD_ATRIB", 
		"BIT_LEFT_ATRIB", "BIT_RIGHT_ATRIB", "U_BIT_RIGHT_ATRIB", "AND_ATRIB", 
		"XOR_ATRIB", "OR_ATRIB", "ADD", "SUB", "MULT", "DIV", "OR", "AND", "IGUAL", 
		"MAIOR_IGUAL", "MENOR_IGUAL", "BITAND", "BITOR", "CARET", "SHIFT_RIGHT", 
		"SHIFT_LEFT", "AC", "FC", "ACH", "FCH", "AP", "FP", "PONTO", "INTERROGACAO", 
		"EXCLAMACAO", "DOIS_PONTOS", "ARROBA", "PONTOV", "SIMBOLOS", "IF", "ELSE", 
		"CASE", "DEFAULT", "SWITCH", "DO", "WHILE", "FOR", "BREAK", "CONTINUE", 
		"RETURN", "TRY", "CATCH", "FINALLY", "STRING", "ID", "ERRO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'short'", "'byte'", "'int'", "'long'", "'char'", 
		null, "'boolean'", "'new'", "'package'", "'import'", "'const'", "'instanceof'", 
		"'goto'", "'class'", "'abstract'", "'final'", "'public'", "'private'", 
		"'protected'", "'extends'", "'implements'", "'static'", "'this'", "'super'", 
		"'transient'", "'volatile'", "'throw'", "'throws'", "'void'", "'synchronized'", 
		"'native'", "'interface'", "'='", "'*='", "'/='", "'%='", "'+='", "'<<='", 
		"'>>='", "'>>>='", "'&='", "'^='", "'|='", "'+'", "'-'", "'*'", "'/'", 
		"'||'", "'&&'", "'=='", "'>='", "'<='", "'&'", "'|'", "'^'", "'>>'", "'<<'", 
		"'['", "']'", "'{'", "'}'", "'('", "')'", "'.'", "'?'", "'!'", "':'", 
		"'@'", "';'", "'if'", "'else'", "'case'", "'default'", "'switch'", "'do'", 
		"'while'", "'for'", "'break'", "'continue'", "'return'", "'try'", "'catch'", 
		"'finally'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ESPACO", "COMENTARIO", "NUMERO", "SHORT", "BYTE", "INT", "LONG", 
		"CHAR", "FLOAT", "LOGICAL", "NEW", "PACKAGE", "IMPORT", "CONST", "INSTANCEOF", 
		"GOTO", "CLASS", "ABSTRACT", "FINAL", "PUBLIC", "PRIVATE", "PROTECTED", 
		"EXTENDS", "IMPLEMENTS", "STATIC", "THIS", "SUPER", "TRANSIENT", "VOLATILE", 
		"THROW", "THROWS", "VOID", "SYNCHNOZED", "NATIVE", "INTERFACE", "IGUAL_ATRIB", 
		"MULT_ATRIB", "DIV_ATRIB", "MOD_ATRIB", "ADD_ATRIB", "BIT_LEFT_ATRIB", 
		"BIT_RIGHT_ATRIB", "U_BIT_RIGHT_ATRIB", "AND_ATRIB", "XOR_ATRIB", "OR_ATRIB", 
		"ADD", "SUB", "MULT", "DIV", "OR", "AND", "IGUAL", "MAIOR_IGUAL", "MENOR_IGUAL", 
		"BITAND", "BITOR", "CARET", "SHIFT_RIGHT", "SHIFT_LEFT", "AC", "FC", "ACH", 
		"FCH", "AP", "FP", "PONTO", "INTERROGACAO", "EXCLAMACAO", "DOIS_PONTOS", 
		"ARROBA", "PONTOV", "IF", "ELSE", "CASE", "DEFAULT", "SWITCH", "DO", "WHILE", 
		"FOR", "BREAK", "CONTINUE", "RETURN", "TRY", "CATCH", "FINALLY", "STRING", 
		"ID", "ERRO"
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


	public JavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2[\u029a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\3\2\3\2\3\3\3"+
		"\3\3\4\6\4\u00c1\n\4\r\4\16\4\u00c2\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u00cb"+
		"\n\5\f\5\16\5\u00ce\13\5\3\5\3\5\3\6\3\6\7\6\u00d4\n\6\f\6\16\6\u00d7"+
		"\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u00fd\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!"+
		"\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-"+
		"\3-\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3"+
		"\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\3"+
		"9\39\39\3:\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3A\3A\3B\3"+
		"B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3L\3L\3"+
		"L\5L\u022a\nL\3M\3M\3M\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3"+
		"P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3"+
		"U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3X\3"+
		"X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\7[\u0282"+
		"\n[\f[\16[\u0285\13[\3[\3[\3\\\3\\\3\\\3\\\7\\\u028d\n\\\f\\\16\\\u0290"+
		"\13\\\3]\3]\3]\3]\7]\u0296\n]\f]\16]\u0299\13]\2\2^\3\2\5\2\7\3\t\4\13"+
		"\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23"+
		")\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%"+
		"M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64k\65m\66o\67q8s9u:w;y<{=}>\177"+
		"?\u0081@\u0083A\u0085B\u0087C\u0089D\u008bE\u008dF\u008fG\u0091H\u0093"+
		"I\u0095J\u0097\2\u0099K\u009bL\u009dM\u009fN\u00a1O\u00a3P\u00a5Q\u00a7"+
		"R\u00a9S\u00abT\u00adU\u00afV\u00b1W\u00b3X\u00b5Y\u00b7Z\u00b9[\3\2\5"+
		"\4\2C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u02a8\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2"+
		"\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2"+
		"\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9"+
		"\3\2\2\2\3\u00bb\3\2\2\2\5\u00bd\3\2\2\2\7\u00c0\3\2\2\2\t\u00c6\3\2\2"+
		"\2\13\u00d1\3\2\2\2\r\u00d8\3\2\2\2\17\u00de\3\2\2\2\21\u00e3\3\2\2\2"+
		"\23\u00e7\3\2\2\2\25\u00ec\3\2\2\2\27\u00fc\3\2\2\2\31\u00fe\3\2\2\2\33"+
		"\u0106\3\2\2\2\35\u010a\3\2\2\2\37\u0112\3\2\2\2!\u0119\3\2\2\2#\u011f"+
		"\3\2\2\2%\u012a\3\2\2\2\'\u012f\3\2\2\2)\u0135\3\2\2\2+\u013e\3\2\2\2"+
		"-\u0144\3\2\2\2/\u014b\3\2\2\2\61\u0153\3\2\2\2\63\u015d\3\2\2\2\65\u0165"+
		"\3\2\2\2\67\u0170\3\2\2\29\u0177\3\2\2\2;\u017c\3\2\2\2=\u0182\3\2\2\2"+
		"?\u018c\3\2\2\2A\u0195\3\2\2\2C\u019b\3\2\2\2E\u01a2\3\2\2\2G\u01a7\3"+
		"\2\2\2I\u01b4\3\2\2\2K\u01bb\3\2\2\2M\u01c5\3\2\2\2O\u01c7\3\2\2\2Q\u01ca"+
		"\3\2\2\2S\u01cd\3\2\2\2U\u01d0\3\2\2\2W\u01d3\3\2\2\2Y\u01d7\3\2\2\2["+
		"\u01db\3\2\2\2]\u01e0\3\2\2\2_\u01e3\3\2\2\2a\u01e6\3\2\2\2c\u01e9\3\2"+
		"\2\2e\u01eb\3\2\2\2g\u01ed\3\2\2\2i\u01ef\3\2\2\2k\u01f1\3\2\2\2m\u01f4"+
		"\3\2\2\2o\u01f7\3\2\2\2q\u01fa\3\2\2\2s\u01fd\3\2\2\2u\u0200\3\2\2\2w"+
		"\u0202\3\2\2\2y\u0204\3\2\2\2{\u0206\3\2\2\2}\u0209\3\2\2\2\177\u020c"+
		"\3\2\2\2\u0081\u020e\3\2\2\2\u0083\u0210\3\2\2\2\u0085\u0212\3\2\2\2\u0087"+
		"\u0214\3\2\2\2\u0089\u0216\3\2\2\2\u008b\u0218\3\2\2\2\u008d\u021a\3\2"+
		"\2\2\u008f\u021c\3\2\2\2\u0091\u021e\3\2\2\2\u0093\u0220\3\2\2\2\u0095"+
		"\u0222\3\2\2\2\u0097\u0229\3\2\2\2\u0099\u022b\3\2\2\2\u009b\u022e\3\2"+
		"\2\2\u009d\u0233\3\2\2\2\u009f\u0238\3\2\2\2\u00a1\u0240\3\2\2\2\u00a3"+
		"\u0247\3\2\2\2\u00a5\u024a\3\2\2\2\u00a7\u0250\3\2\2\2\u00a9\u0254\3\2"+
		"\2\2\u00ab\u025a\3\2\2\2\u00ad\u0263\3\2\2\2\u00af\u026a\3\2\2\2\u00b1"+
		"\u026e\3\2\2\2\u00b3\u0274\3\2\2\2\u00b5\u027c\3\2\2\2\u00b7\u0288\3\2"+
		"\2\2\u00b9\u0291\3\2\2\2\u00bb\u00bc\t\2\2\2\u00bc\4\3\2\2\2\u00bd\u00be"+
		"\4\62;\2\u00be\6\3\2\2\2\u00bf\u00c1\t\3\2\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c5\b\4\2\2\u00c5\b\3\2\2\2\u00c6\u00c7\7\61\2\2\u00c7\u00c8"+
		"\7\61\2\2\u00c8\u00cc\3\2\2\2\u00c9\u00cb\n\4\2\2\u00ca\u00c9\3\2\2\2"+
		"\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\b\5\2\2\u00d0\n\3\2\2\2\u00d1"+
		"\u00d5\5\5\3\2\u00d2\u00d4\5\5\3\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2"+
		"\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\f\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7j\2\2\u00da\u00db\7q\2\2\u00db"+
		"\u00dc\7t\2\2\u00dc\u00dd\7v\2\2\u00dd\16\3\2\2\2\u00de\u00df\7d\2\2\u00df"+
		"\u00e0\7{\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7g\2\2\u00e2\20\3\2\2\2\u00e3"+
		"\u00e4\7k\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7v\2\2\u00e6\22\3\2\2\2\u00e7"+
		"\u00e8\7n\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7i\2\2"+
		"\u00eb\24\3\2\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7j\2\2\u00ee\u00ef\7"+
		"c\2\2\u00ef\u00f0\7t\2\2\u00f0\26\3\2\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3"+
		"\7n\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7c\2\2\u00f5\u00fd\7v\2\2\u00f6"+
		"\u00f7\7f\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa\7d\2\2"+
		"\u00fa\u00fb\7n\2\2\u00fb\u00fd\7g\2\2\u00fc\u00f1\3\2\2\2\u00fc\u00f6"+
		"\3\2\2\2\u00fd\30\3\2\2\2\u00fe\u00ff\7d\2\2\u00ff\u0100\7q\2\2\u0100"+
		"\u0101\7q\2\2\u0101\u0102\7n\2\2\u0102\u0103\7g\2\2\u0103\u0104\7c\2\2"+
		"\u0104\u0105\7p\2\2\u0105\32\3\2\2\2\u0106\u0107\7p\2\2\u0107\u0108\7"+
		"g\2\2\u0108\u0109\7y\2\2\u0109\34\3\2\2\2\u010a\u010b\7r\2\2\u010b\u010c"+
		"\7c\2\2\u010c\u010d\7e\2\2\u010d\u010e\7m\2\2\u010e\u010f\7c\2\2\u010f"+
		"\u0110\7i\2\2\u0110\u0111\7g\2\2\u0111\36\3\2\2\2\u0112\u0113\7k\2\2\u0113"+
		"\u0114\7o\2\2\u0114\u0115\7r\2\2\u0115\u0116\7q\2\2\u0116\u0117\7t\2\2"+
		"\u0117\u0118\7v\2\2\u0118 \3\2\2\2\u0119\u011a\7e\2\2\u011a\u011b\7q\2"+
		"\2\u011b\u011c\7p\2\2\u011c\u011d\7u\2\2\u011d\u011e\7v\2\2\u011e\"\3"+
		"\2\2\2\u011f\u0120\7k\2\2\u0120\u0121\7p\2\2\u0121\u0122\7u\2\2\u0122"+
		"\u0123\7v\2\2\u0123\u0124\7c\2\2\u0124\u0125\7p\2\2\u0125\u0126\7e\2\2"+
		"\u0126\u0127\7g\2\2\u0127\u0128\7q\2\2\u0128\u0129\7h\2\2\u0129$\3\2\2"+
		"\2\u012a\u012b\7i\2\2\u012b\u012c\7q\2\2\u012c\u012d\7v\2\2\u012d\u012e"+
		"\7q\2\2\u012e&\3\2\2\2\u012f\u0130\7e\2\2\u0130\u0131\7n\2\2\u0131\u0132"+
		"\7c\2\2\u0132\u0133\7u\2\2\u0133\u0134\7u\2\2\u0134(\3\2\2\2\u0135\u0136"+
		"\7c\2\2\u0136\u0137\7d\2\2\u0137\u0138\7u\2\2\u0138\u0139\7v\2\2\u0139"+
		"\u013a\7t\2\2\u013a\u013b\7c\2\2\u013b\u013c\7e\2\2\u013c\u013d\7v\2\2"+
		"\u013d*\3\2\2\2\u013e\u013f\7h\2\2\u013f\u0140\7k\2\2\u0140\u0141\7p\2"+
		"\2\u0141\u0142\7c\2\2\u0142\u0143\7n\2\2\u0143,\3\2\2\2\u0144\u0145\7"+
		"r\2\2\u0145\u0146\7w\2\2\u0146\u0147\7d\2\2\u0147\u0148\7n\2\2\u0148\u0149"+
		"\7k\2\2\u0149\u014a\7e\2\2\u014a.\3\2\2\2\u014b\u014c\7r\2\2\u014c\u014d"+
		"\7t\2\2\u014d\u014e\7k\2\2\u014e\u014f\7x\2\2\u014f\u0150\7c\2\2\u0150"+
		"\u0151\7v\2\2\u0151\u0152\7g\2\2\u0152\60\3\2\2\2\u0153\u0154\7r\2\2\u0154"+
		"\u0155\7t\2\2\u0155\u0156\7q\2\2\u0156\u0157\7v\2\2\u0157\u0158\7g\2\2"+
		"\u0158\u0159\7e\2\2\u0159\u015a\7v\2\2\u015a\u015b\7g\2\2\u015b\u015c"+
		"\7f\2\2\u015c\62\3\2\2\2\u015d\u015e\7g\2\2\u015e\u015f\7z\2\2\u015f\u0160"+
		"\7v\2\2\u0160\u0161\7g\2\2\u0161\u0162\7p\2\2\u0162\u0163\7f\2\2\u0163"+
		"\u0164\7u\2\2\u0164\64\3\2\2\2\u0165\u0166\7k\2\2\u0166\u0167\7o\2\2\u0167"+
		"\u0168\7r\2\2\u0168\u0169\7n\2\2\u0169\u016a\7g\2\2\u016a\u016b\7o\2\2"+
		"\u016b\u016c\7g\2\2\u016c\u016d\7p\2\2\u016d\u016e\7v\2\2\u016e\u016f"+
		"\7u\2\2\u016f\66\3\2\2\2\u0170\u0171\7u\2\2\u0171\u0172\7v\2\2\u0172\u0173"+
		"\7c\2\2\u0173\u0174\7v\2\2\u0174\u0175\7k\2\2\u0175\u0176\7e\2\2\u0176"+
		"8\3\2\2\2\u0177\u0178\7v\2\2\u0178\u0179\7j\2\2\u0179\u017a\7k\2\2\u017a"+
		"\u017b\7u\2\2\u017b:\3\2\2\2\u017c\u017d\7u\2\2\u017d\u017e\7w\2\2\u017e"+
		"\u017f\7r\2\2\u017f\u0180\7g\2\2\u0180\u0181\7t\2\2\u0181<\3\2\2\2\u0182"+
		"\u0183\7v\2\2\u0183\u0184\7t\2\2\u0184\u0185\7c\2\2\u0185\u0186\7p\2\2"+
		"\u0186\u0187\7u\2\2\u0187\u0188\7k\2\2\u0188\u0189\7g\2\2\u0189\u018a"+
		"\7p\2\2\u018a\u018b\7v\2\2\u018b>\3\2\2\2\u018c\u018d\7x\2\2\u018d\u018e"+
		"\7q\2\2\u018e\u018f\7n\2\2\u018f\u0190\7c\2\2\u0190\u0191\7v\2\2\u0191"+
		"\u0192\7k\2\2\u0192\u0193\7n\2\2\u0193\u0194\7g\2\2\u0194@\3\2\2\2\u0195"+
		"\u0196\7v\2\2\u0196\u0197\7j\2\2\u0197\u0198\7t\2\2\u0198\u0199\7q\2\2"+
		"\u0199\u019a\7y\2\2\u019aB\3\2\2\2\u019b\u019c\7v\2\2\u019c\u019d\7j\2"+
		"\2\u019d\u019e\7t\2\2\u019e\u019f\7q\2\2\u019f\u01a0\7y\2\2\u01a0\u01a1"+
		"\7u\2\2\u01a1D\3\2\2\2\u01a2\u01a3\7x\2\2\u01a3\u01a4\7q\2\2\u01a4\u01a5"+
		"\7k\2\2\u01a5\u01a6\7f\2\2\u01a6F\3\2\2\2\u01a7\u01a8\7u\2\2\u01a8\u01a9"+
		"\7{\2\2\u01a9\u01aa\7p\2\2\u01aa\u01ab\7e\2\2\u01ab\u01ac\7j\2\2\u01ac"+
		"\u01ad\7t\2\2\u01ad\u01ae\7q\2\2\u01ae\u01af\7p\2\2\u01af\u01b0\7k\2\2"+
		"\u01b0\u01b1\7|\2\2\u01b1\u01b2\7g\2\2\u01b2\u01b3\7f\2\2\u01b3H\3\2\2"+
		"\2\u01b4\u01b5\7p\2\2\u01b5\u01b6\7c\2\2\u01b6\u01b7\7v\2\2\u01b7\u01b8"+
		"\7k\2\2\u01b8\u01b9\7x\2\2\u01b9\u01ba\7g\2\2\u01baJ\3\2\2\2\u01bb\u01bc"+
		"\7k\2\2\u01bc\u01bd\7p\2\2\u01bd\u01be\7v\2\2\u01be\u01bf\7g\2\2\u01bf"+
		"\u01c0\7t\2\2\u01c0\u01c1\7h\2\2\u01c1\u01c2\7c\2\2\u01c2\u01c3\7e\2\2"+
		"\u01c3\u01c4\7g\2\2\u01c4L\3\2\2\2\u01c5\u01c6\7?\2\2\u01c6N\3\2\2\2\u01c7"+
		"\u01c8\7,\2\2\u01c8\u01c9\7?\2\2\u01c9P\3\2\2\2\u01ca\u01cb\7\61\2\2\u01cb"+
		"\u01cc\7?\2\2\u01ccR\3\2\2\2\u01cd\u01ce\7\'\2\2\u01ce\u01cf\7?\2\2\u01cf"+
		"T\3\2\2\2\u01d0\u01d1\7-\2\2\u01d1\u01d2\7?\2\2\u01d2V\3\2\2\2\u01d3\u01d4"+
		"\7>\2\2\u01d4\u01d5\7>\2\2\u01d5\u01d6\7?\2\2\u01d6X\3\2\2\2\u01d7\u01d8"+
		"\7@\2\2\u01d8\u01d9\7@\2\2\u01d9\u01da\7?\2\2\u01daZ\3\2\2\2\u01db\u01dc"+
		"\7@\2\2\u01dc\u01dd\7@\2\2\u01dd\u01de\7@\2\2\u01de\u01df\7?\2\2\u01df"+
		"\\\3\2\2\2\u01e0\u01e1\7(\2\2\u01e1\u01e2\7?\2\2\u01e2^\3\2\2\2\u01e3"+
		"\u01e4\7`\2\2\u01e4\u01e5\7?\2\2\u01e5`\3\2\2\2\u01e6\u01e7\7~\2\2\u01e7"+
		"\u01e8\7?\2\2\u01e8b\3\2\2\2\u01e9\u01ea\7-\2\2\u01ead\3\2\2\2\u01eb\u01ec"+
		"\7/\2\2\u01ecf\3\2\2\2\u01ed\u01ee\7,\2\2\u01eeh\3\2\2\2\u01ef\u01f0\7"+
		"\61\2\2\u01f0j\3\2\2\2\u01f1\u01f2\7~\2\2\u01f2\u01f3\7~\2\2\u01f3l\3"+
		"\2\2\2\u01f4\u01f5\7(\2\2\u01f5\u01f6\7(\2\2\u01f6n\3\2\2\2\u01f7\u01f8"+
		"\7?\2\2\u01f8\u01f9\7?\2\2\u01f9p\3\2\2\2\u01fa\u01fb\7@\2\2\u01fb\u01fc"+
		"\7?\2\2\u01fcr\3\2\2\2\u01fd\u01fe\7>\2\2\u01fe\u01ff\7?\2\2\u01fft\3"+
		"\2\2\2\u0200\u0201\7(\2\2\u0201v\3\2\2\2\u0202\u0203\7~\2\2\u0203x\3\2"+
		"\2\2\u0204\u0205\7`\2\2\u0205z\3\2\2\2\u0206\u0207\7@\2\2\u0207\u0208"+
		"\7@\2\2\u0208|\3\2\2\2\u0209\u020a\7>\2\2\u020a\u020b\7>\2\2\u020b~\3"+
		"\2\2\2\u020c\u020d\7]\2\2\u020d\u0080\3\2\2\2\u020e\u020f\7_\2\2\u020f"+
		"\u0082\3\2\2\2\u0210\u0211\7}\2\2\u0211\u0084\3\2\2\2\u0212\u0213\7\177"+
		"\2\2\u0213\u0086\3\2\2\2\u0214\u0215\7*\2\2\u0215\u0088\3\2\2\2\u0216"+
		"\u0217\7+\2\2\u0217\u008a\3\2\2\2\u0218\u0219\7\60\2\2\u0219\u008c\3\2"+
		"\2\2\u021a\u021b\7A\2\2\u021b\u008e\3\2\2\2\u021c\u021d\7#\2\2\u021d\u0090"+
		"\3\2\2\2\u021e\u021f\7<\2\2\u021f\u0092\3\2\2\2\u0220\u0221\7B\2\2\u0221"+
		"\u0094\3\2\2\2\u0222\u0223\7=\2\2\u0223\u0096\3\2\2\2\u0224\u022a\5\u008d"+
		"G\2\u0225\u022a\5\u008fH\2\u0226\u022a\5\u0091I\2\u0227\u022a\5\u0093"+
		"J\2\u0228\u022a\5\u0095K\2\u0229\u0224\3\2\2\2\u0229\u0225\3\2\2\2\u0229"+
		"\u0226\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u0228\3\2\2\2\u022a\u0098\3\2"+
		"\2\2\u022b\u022c\7k\2\2\u022c\u022d\7h\2\2\u022d\u009a\3\2\2\2\u022e\u022f"+
		"\7g\2\2\u022f\u0230\7n\2\2\u0230\u0231\7u\2\2\u0231\u0232\7g\2\2\u0232"+
		"\u009c\3\2\2\2\u0233\u0234\7e\2\2\u0234\u0235\7c\2\2\u0235\u0236\7u\2"+
		"\2\u0236\u0237\7g\2\2\u0237\u009e\3\2\2\2\u0238\u0239\7f\2\2\u0239\u023a"+
		"\7g\2\2\u023a\u023b\7h\2\2\u023b\u023c\7c\2\2\u023c\u023d\7w\2\2\u023d"+
		"\u023e\7n\2\2\u023e\u023f\7v\2\2\u023f\u00a0\3\2\2\2\u0240\u0241\7u\2"+
		"\2\u0241\u0242\7y\2\2\u0242\u0243\7k\2\2\u0243\u0244\7v\2\2\u0244\u0245"+
		"\7e\2\2\u0245\u0246\7j\2\2\u0246\u00a2\3\2\2\2\u0247\u0248\7f\2\2\u0248"+
		"\u0249\7q\2\2\u0249\u00a4\3\2\2\2\u024a\u024b\7y\2\2\u024b\u024c\7j\2"+
		"\2\u024c\u024d\7k\2\2\u024d\u024e\7n\2\2\u024e\u024f\7g\2\2\u024f\u00a6"+
		"\3\2\2\2\u0250\u0251\7h\2\2\u0251\u0252\7q\2\2\u0252\u0253\7t\2\2\u0253"+
		"\u00a8\3\2\2\2\u0254\u0255\7d\2\2\u0255\u0256\7t\2\2\u0256\u0257\7g\2"+
		"\2\u0257\u0258\7c\2\2\u0258\u0259\7m\2\2\u0259\u00aa\3\2\2\2\u025a\u025b"+
		"\7e\2\2\u025b\u025c\7q\2\2\u025c\u025d\7p\2\2\u025d\u025e\7v\2\2\u025e"+
		"\u025f\7k\2\2\u025f\u0260\7p\2\2\u0260\u0261\7w\2\2\u0261\u0262\7g\2\2"+
		"\u0262\u00ac\3\2\2\2\u0263\u0264\7t\2\2\u0264\u0265\7g\2\2\u0265\u0266"+
		"\7v\2\2\u0266\u0267\7w\2\2\u0267\u0268\7t\2\2\u0268\u0269\7p\2\2\u0269"+
		"\u00ae\3\2\2\2\u026a\u026b\7v\2\2\u026b\u026c\7t\2\2\u026c\u026d\7{\2"+
		"\2\u026d\u00b0\3\2\2\2\u026e\u026f\7e\2\2\u026f\u0270\7c\2\2\u0270\u0271"+
		"\7v\2\2\u0271\u0272\7e\2\2\u0272\u0273\7j\2\2\u0273\u00b2\3\2\2\2\u0274"+
		"\u0275\7h\2\2\u0275\u0276\7k\2\2\u0276\u0277\7p\2\2\u0277\u0278\7c\2\2"+
		"\u0278\u0279\7n\2\2\u0279\u027a\7n\2\2\u027a\u027b\7{\2\2\u027b\u00b4"+
		"\3\2\2\2\u027c\u0283\7$\2\2\u027d\u0282\5\3\2\2\u027e\u0282\7\"\2\2\u027f"+
		"\u0282\5\5\3\2\u0280\u0282\5\u0097L\2\u0281\u027d\3\2\2\2\u0281\u027e"+
		"\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0280\3\2\2\2\u0282\u0285\3\2\2\2\u0283"+
		"\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0286\3\2\2\2\u0285\u0283\3\2"+
		"\2\2\u0286\u0287\7$\2\2\u0287\u00b6\3\2\2\2\u0288\u028e\5\3\2\2\u0289"+
		"\u028d\5\3\2\2\u028a\u028d\5\5\3\2\u028b\u028d\7a\2\2\u028c\u0289\3\2"+
		"\2\2\u028c\u028a\3\2\2\2\u028c\u028b\3\2\2\2\u028d\u0290\3\2\2\2\u028e"+
		"\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u00b8\3\2\2\2\u0290\u028e\3\2"+
		"\2\2\u0291\u0297\5\5\3\2\u0292\u0296\5\5\3\2\u0293\u0296\5\3\2\2\u0294"+
		"\u0296\5\u0097L\2\u0295\u0292\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0294"+
		"\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298"+
		"\u00ba\3\2\2\2\u0299\u0297\3\2\2\2\16\2\u00c2\u00cc\u00d5\u00fc\u0229"+
		"\u0281\u0283\u028c\u028e\u0295\u0297\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}