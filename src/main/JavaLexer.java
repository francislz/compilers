// Generated from /home/franciscone/Faculdade/Codigos/compilers/compiler/src/scanner/JavaLexer.g4 by ANTLR 4.7
package main;
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

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
		IGUAL=53, MAIOR_IGUAL=54, MENOR_IGUAL=55, MENOR=56, MAIOR=57, BITAND=58, 
		BITOR=59, CARET=60, SHIFT_RIGHT=61, SHIFT_LEFT=62, AC=63, FC=64, ACH=65, 
		FCH=66, AP=67, FP=68, PONTO=69, INTERROGACAO=70, EXCLAMACAO=71, DOIS_PONTOS=72, 
		ARROBA=73, PONTOV=74, VIRGULA=75, IF=76, ELSE=77, CASE=78, DEFAULT=79, 
		SWITCH=80, DO=81, WHILE=82, FOR=83, BREAK=84, CONTINUE=85, RETURN=86, 
		TRY=87, CATCH=88, FINALLY=89, STRING=90, ID=91, ERRO=92;
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
		"MAIOR_IGUAL", "MENOR_IGUAL", "MENOR", "MAIOR", "BITAND", "BITOR", "CARET", 
		"SHIFT_RIGHT", "SHIFT_LEFT", "AC", "FC", "ACH", "FCH", "AP", "FP", "PONTO", 
		"INTERROGACAO", "EXCLAMACAO", "DOIS_PONTOS", "ARROBA", "PONTOV", "VIRGULA", 
		"SIMBOLOS", "IF", "ELSE", "CASE", "DEFAULT", "SWITCH", "DO", "WHILE", 
		"FOR", "BREAK", "CONTINUE", "RETURN", "TRY", "CATCH", "FINALLY", "STRING", 
		"ID", "ERRO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'short'", "'byte'", "'int'", "'long'", "'char'", 
		null, "'boolean'", "'new'", "'package'", "'import'", "'const'", "'instanceof'", 
		"'goto'", "'class'", "'abstract'", "'final'", "'public'", "'private'", 
		"'protected'", "'extends'", "'implements'", "'static'", "'this'", "'super'", 
		"'transient'", "'volatile'", "'throw'", "'throws'", "'void'", "'synchronized'", 
		"'native'", "'interface'", "'='", "'*='", "'/='", "'%='", "'+='", "'<<='", 
		"'>>='", "'>>>='", "'&='", "'^='", "'|='", "'+'", "'-'", "'*'", "'/'", 
		"'||'", "'&&'", "'=='", "'>='", "'<='", "'<'", "'>'", "'&'", "'|'", "'^'", 
		"'>>'", "'<<'", "'['", "']'", "'{'", "'}'", "'('", "')'", "'.'", "'?'", 
		"'!'", "':'", "'@'", "';'", "','", "'if'", "'else'", "'case'", "'default'", 
		"'switch'", "'do'", "'while'", "'for'", "'break'", "'continue'", "'return'", 
		"'try'", "'catch'", "'finally'"
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
		"MENOR", "MAIOR", "BITAND", "BITOR", "CARET", "SHIFT_RIGHT", "SHIFT_LEFT", 
		"AC", "FC", "ACH", "FCH", "AP", "FP", "PONTO", "INTERROGACAO", "EXCLAMACAO", 
		"DOIS_PONTOS", "ARROBA", "PONTOV", "VIRGULA", "IF", "ELSE", "CASE", "DEFAULT", 
		"SWITCH", "DO", "WHILE", "FOR", "BREAK", "CONTINUE", "RETURN", "TRY", 
		"CATCH", "FINALLY", "STRING", "ID", "ERRO"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2^\u02a6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\3\2\3\2\3\3\3\3\3\4\6\4\u00c7\n\4\r\4\16\4\u00c8\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\7\5\u00d1\n\5\f\5\16\5\u00d4\13\5\3\5\3\5\3\6\3\6\7\6\u00da\n"+
		"\6\f\6\16\6\u00dd\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0103\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,"+
		"\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3"+
		"\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@"+
		"\3A\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K"+
		"\3L\3L\3M\3M\3N\3N\3O\3O\3O\3O\3O\5O\u0236\nO\3P\3P\3P\3Q\3Q\3Q\3Q\3Q"+
		"\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U"+
		"\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]"+
		"\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\7^\u028e\n^\f^\16^\u0291\13^\3^\3^\3"+
		"_\3_\3_\3_\7_\u0299\n_\f_\16_\u029c\13_\3`\3`\3`\3`\7`\u02a2\n`\f`\16"+
		"`\u02a5\13`\2\2a\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31"+
		"\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32"+
		"\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g"+
		"\63i\64k\65m\66o\67q8s9u:w;y<{=}>\177?\u0081@\u0083A\u0085B\u0087C\u0089"+
		"D\u008bE\u008dF\u008fG\u0091H\u0093I\u0095J\u0097K\u0099L\u009bM\u009d"+
		"\2\u009fN\u00a1O\u00a3P\u00a5Q\u00a7R\u00a9S\u00abT\u00adU\u00afV\u00b1"+
		"W\u00b3X\u00b5Y\u00b7Z\u00b9[\u00bb\\\u00bd]\u00bf^\3\2\5\4\2C\\c|\5\2"+
		"\13\f\16\17\"\"\4\2\f\f\17\17\2\u02b4\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\3\u00c1\3\2\2\2\5\u00c3\3\2\2"+
		"\2\7\u00c6\3\2\2\2\t\u00cc\3\2\2\2\13\u00d7\3\2\2\2\r\u00de\3\2\2\2\17"+
		"\u00e4\3\2\2\2\21\u00e9\3\2\2\2\23\u00ed\3\2\2\2\25\u00f2\3\2\2\2\27\u0102"+
		"\3\2\2\2\31\u0104\3\2\2\2\33\u010c\3\2\2\2\35\u0110\3\2\2\2\37\u0118\3"+
		"\2\2\2!\u011f\3\2\2\2#\u0125\3\2\2\2%\u0130\3\2\2\2\'\u0135\3\2\2\2)\u013b"+
		"\3\2\2\2+\u0144\3\2\2\2-\u014a\3\2\2\2/\u0151\3\2\2\2\61\u0159\3\2\2\2"+
		"\63\u0163\3\2\2\2\65\u016b\3\2\2\2\67\u0176\3\2\2\29\u017d\3\2\2\2;\u0182"+
		"\3\2\2\2=\u0188\3\2\2\2?\u0192\3\2\2\2A\u019b\3\2\2\2C\u01a1\3\2\2\2E"+
		"\u01a8\3\2\2\2G\u01ad\3\2\2\2I\u01ba\3\2\2\2K\u01c1\3\2\2\2M\u01cb\3\2"+
		"\2\2O\u01cd\3\2\2\2Q\u01d0\3\2\2\2S\u01d3\3\2\2\2U\u01d6\3\2\2\2W\u01d9"+
		"\3\2\2\2Y\u01dd\3\2\2\2[\u01e1\3\2\2\2]\u01e6\3\2\2\2_\u01e9\3\2\2\2a"+
		"\u01ec\3\2\2\2c\u01ef\3\2\2\2e\u01f1\3\2\2\2g\u01f3\3\2\2\2i\u01f5\3\2"+
		"\2\2k\u01f7\3\2\2\2m\u01fa\3\2\2\2o\u01fd\3\2\2\2q\u0200\3\2\2\2s\u0203"+
		"\3\2\2\2u\u0206\3\2\2\2w\u0208\3\2\2\2y\u020a\3\2\2\2{\u020c\3\2\2\2}"+
		"\u020e\3\2\2\2\177\u0210\3\2\2\2\u0081\u0213\3\2\2\2\u0083\u0216\3\2\2"+
		"\2\u0085\u0218\3\2\2\2\u0087\u021a\3\2\2\2\u0089\u021c\3\2\2\2\u008b\u021e"+
		"\3\2\2\2\u008d\u0220\3\2\2\2\u008f\u0222\3\2\2\2\u0091\u0224\3\2\2\2\u0093"+
		"\u0226\3\2\2\2\u0095\u0228\3\2\2\2\u0097\u022a\3\2\2\2\u0099\u022c\3\2"+
		"\2\2\u009b\u022e\3\2\2\2\u009d\u0235\3\2\2\2\u009f\u0237\3\2\2\2\u00a1"+
		"\u023a\3\2\2\2\u00a3\u023f\3\2\2\2\u00a5\u0244\3\2\2\2\u00a7\u024c\3\2"+
		"\2\2\u00a9\u0253\3\2\2\2\u00ab\u0256\3\2\2\2\u00ad\u025c\3\2\2\2\u00af"+
		"\u0260\3\2\2\2\u00b1\u0266\3\2\2\2\u00b3\u026f\3\2\2\2\u00b5\u0276\3\2"+
		"\2\2\u00b7\u027a\3\2\2\2\u00b9\u0280\3\2\2\2\u00bb\u0288\3\2\2\2\u00bd"+
		"\u0294\3\2\2\2\u00bf\u029d\3\2\2\2\u00c1\u00c2\t\2\2\2\u00c2\4\3\2\2\2"+
		"\u00c3\u00c4\4\62;\2\u00c4\6\3\2\2\2\u00c5\u00c7\t\3\2\2\u00c6\u00c5\3"+
		"\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\b\4\2\2\u00cb\b\3\2\2\2\u00cc\u00cd\7\61\2"+
		"\2\u00cd\u00ce\7\61\2\2\u00ce\u00d2\3\2\2\2\u00cf\u00d1\n\4\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\b\5\2\2\u00d6"+
		"\n\3\2\2\2\u00d7\u00db\5\5\3\2\u00d8\u00da\5\5\3\2\u00d9\u00d8\3\2\2\2"+
		"\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\f\3"+
		"\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7j\2\2\u00e0"+
		"\u00e1\7q\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7v\2\2\u00e3\16\3\2\2\2\u00e4"+
		"\u00e5\7d\2\2\u00e5\u00e6\7{\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7g\2\2"+
		"\u00e8\20\3\2\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7"+
		"v\2\2\u00ec\22\3\2\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0"+
		"\7p\2\2\u00f0\u00f1\7i\2\2\u00f1\24\3\2\2\2\u00f2\u00f3\7e\2\2\u00f3\u00f4"+
		"\7j\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7t\2\2\u00f6\26\3\2\2\2\u00f7\u00f8"+
		"\7h\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7c\2\2\u00fb"+
		"\u0103\7v\2\2\u00fc\u00fd\7f\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7w\2\2"+
		"\u00ff\u0100\7d\2\2\u0100\u0101\7n\2\2\u0101\u0103\7g\2\2\u0102\u00f7"+
		"\3\2\2\2\u0102\u00fc\3\2\2\2\u0103\30\3\2\2\2\u0104\u0105\7d\2\2\u0105"+
		"\u0106\7q\2\2\u0106\u0107\7q\2\2\u0107\u0108\7n\2\2\u0108\u0109\7g\2\2"+
		"\u0109\u010a\7c\2\2\u010a\u010b\7p\2\2\u010b\32\3\2\2\2\u010c\u010d\7"+
		"p\2\2\u010d\u010e\7g\2\2\u010e\u010f\7y\2\2\u010f\34\3\2\2\2\u0110\u0111"+
		"\7r\2\2\u0111\u0112\7c\2\2\u0112\u0113\7e\2\2\u0113\u0114\7m\2\2\u0114"+
		"\u0115\7c\2\2\u0115\u0116\7i\2\2\u0116\u0117\7g\2\2\u0117\36\3\2\2\2\u0118"+
		"\u0119\7k\2\2\u0119\u011a\7o\2\2\u011a\u011b\7r\2\2\u011b\u011c\7q\2\2"+
		"\u011c\u011d\7t\2\2\u011d\u011e\7v\2\2\u011e \3\2\2\2\u011f\u0120\7e\2"+
		"\2\u0120\u0121\7q\2\2\u0121\u0122\7p\2\2\u0122\u0123\7u\2\2\u0123\u0124"+
		"\7v\2\2\u0124\"\3\2\2\2\u0125\u0126\7k\2\2\u0126\u0127\7p\2\2\u0127\u0128"+
		"\7u\2\2\u0128\u0129\7v\2\2\u0129\u012a\7c\2\2\u012a\u012b\7p\2\2\u012b"+
		"\u012c\7e\2\2\u012c\u012d\7g\2\2\u012d\u012e\7q\2\2\u012e\u012f\7h\2\2"+
		"\u012f$\3\2\2\2\u0130\u0131\7i\2\2\u0131\u0132\7q\2\2\u0132\u0133\7v\2"+
		"\2\u0133\u0134\7q\2\2\u0134&\3\2\2\2\u0135\u0136\7e\2\2\u0136\u0137\7"+
		"n\2\2\u0137\u0138\7c\2\2\u0138\u0139\7u\2\2\u0139\u013a\7u\2\2\u013a("+
		"\3\2\2\2\u013b\u013c\7c\2\2\u013c\u013d\7d\2\2\u013d\u013e\7u\2\2\u013e"+
		"\u013f\7v\2\2\u013f\u0140\7t\2\2\u0140\u0141\7c\2\2\u0141\u0142\7e\2\2"+
		"\u0142\u0143\7v\2\2\u0143*\3\2\2\2\u0144\u0145\7h\2\2\u0145\u0146\7k\2"+
		"\2\u0146\u0147\7p\2\2\u0147\u0148\7c\2\2\u0148\u0149\7n\2\2\u0149,\3\2"+
		"\2\2\u014a\u014b\7r\2\2\u014b\u014c\7w\2\2\u014c\u014d\7d\2\2\u014d\u014e"+
		"\7n\2\2\u014e\u014f\7k\2\2\u014f\u0150\7e\2\2\u0150.\3\2\2\2\u0151\u0152"+
		"\7r\2\2\u0152\u0153\7t\2\2\u0153\u0154\7k\2\2\u0154\u0155\7x\2\2\u0155"+
		"\u0156\7c\2\2\u0156\u0157\7v\2\2\u0157\u0158\7g\2\2\u0158\60\3\2\2\2\u0159"+
		"\u015a\7r\2\2\u015a\u015b\7t\2\2\u015b\u015c\7q\2\2\u015c\u015d\7v\2\2"+
		"\u015d\u015e\7g\2\2\u015e\u015f\7e\2\2\u015f\u0160\7v\2\2\u0160\u0161"+
		"\7g\2\2\u0161\u0162\7f\2\2\u0162\62\3\2\2\2\u0163\u0164\7g\2\2\u0164\u0165"+
		"\7z\2\2\u0165\u0166\7v\2\2\u0166\u0167\7g\2\2\u0167\u0168\7p\2\2\u0168"+
		"\u0169\7f\2\2\u0169\u016a\7u\2\2\u016a\64\3\2\2\2\u016b\u016c\7k\2\2\u016c"+
		"\u016d\7o\2\2\u016d\u016e\7r\2\2\u016e\u016f\7n\2\2\u016f\u0170\7g\2\2"+
		"\u0170\u0171\7o\2\2\u0171\u0172\7g\2\2\u0172\u0173\7p\2\2\u0173\u0174"+
		"\7v\2\2\u0174\u0175\7u\2\2\u0175\66\3\2\2\2\u0176\u0177\7u\2\2\u0177\u0178"+
		"\7v\2\2\u0178\u0179\7c\2\2\u0179\u017a\7v\2\2\u017a\u017b\7k\2\2\u017b"+
		"\u017c\7e\2\2\u017c8\3\2\2\2\u017d\u017e\7v\2\2\u017e\u017f\7j\2\2\u017f"+
		"\u0180\7k\2\2\u0180\u0181\7u\2\2\u0181:\3\2\2\2\u0182\u0183\7u\2\2\u0183"+
		"\u0184\7w\2\2\u0184\u0185\7r\2\2\u0185\u0186\7g\2\2\u0186\u0187\7t\2\2"+
		"\u0187<\3\2\2\2\u0188\u0189\7v\2\2\u0189\u018a\7t\2\2\u018a\u018b\7c\2"+
		"\2\u018b\u018c\7p\2\2\u018c\u018d\7u\2\2\u018d\u018e\7k\2\2\u018e\u018f"+
		"\7g\2\2\u018f\u0190\7p\2\2\u0190\u0191\7v\2\2\u0191>\3\2\2\2\u0192\u0193"+
		"\7x\2\2\u0193\u0194\7q\2\2\u0194\u0195\7n\2\2\u0195\u0196\7c\2\2\u0196"+
		"\u0197\7v\2\2\u0197\u0198\7k\2\2\u0198\u0199\7n\2\2\u0199\u019a\7g\2\2"+
		"\u019a@\3\2\2\2\u019b\u019c\7v\2\2\u019c\u019d\7j\2\2\u019d\u019e\7t\2"+
		"\2\u019e\u019f\7q\2\2\u019f\u01a0\7y\2\2\u01a0B\3\2\2\2\u01a1\u01a2\7"+
		"v\2\2\u01a2\u01a3\7j\2\2\u01a3\u01a4\7t\2\2\u01a4\u01a5\7q\2\2\u01a5\u01a6"+
		"\7y\2\2\u01a6\u01a7\7u\2\2\u01a7D\3\2\2\2\u01a8\u01a9\7x\2\2\u01a9\u01aa"+
		"\7q\2\2\u01aa\u01ab\7k\2\2\u01ab\u01ac\7f\2\2\u01acF\3\2\2\2\u01ad\u01ae"+
		"\7u\2\2\u01ae\u01af\7{\2\2\u01af\u01b0\7p\2\2\u01b0\u01b1\7e\2\2\u01b1"+
		"\u01b2\7j\2\2\u01b2\u01b3\7t\2\2\u01b3\u01b4\7q\2\2\u01b4\u01b5\7p\2\2"+
		"\u01b5\u01b6\7k\2\2\u01b6\u01b7\7|\2\2\u01b7\u01b8\7g\2\2\u01b8\u01b9"+
		"\7f\2\2\u01b9H\3\2\2\2\u01ba\u01bb\7p\2\2\u01bb\u01bc\7c\2\2\u01bc\u01bd"+
		"\7v\2\2\u01bd\u01be\7k\2\2\u01be\u01bf\7x\2\2\u01bf\u01c0\7g\2\2\u01c0"+
		"J\3\2\2\2\u01c1\u01c2\7k\2\2\u01c2\u01c3\7p\2\2\u01c3\u01c4\7v\2\2\u01c4"+
		"\u01c5\7g\2\2\u01c5\u01c6\7t\2\2\u01c6\u01c7\7h\2\2\u01c7\u01c8\7c\2\2"+
		"\u01c8\u01c9\7e\2\2\u01c9\u01ca\7g\2\2\u01caL\3\2\2\2\u01cb\u01cc\7?\2"+
		"\2\u01ccN\3\2\2\2\u01cd\u01ce\7,\2\2\u01ce\u01cf\7?\2\2\u01cfP\3\2\2\2"+
		"\u01d0\u01d1\7\61\2\2\u01d1\u01d2\7?\2\2\u01d2R\3\2\2\2\u01d3\u01d4\7"+
		"\'\2\2\u01d4\u01d5\7?\2\2\u01d5T\3\2\2\2\u01d6\u01d7\7-\2\2\u01d7\u01d8"+
		"\7?\2\2\u01d8V\3\2\2\2\u01d9\u01da\7>\2\2\u01da\u01db\7>\2\2\u01db\u01dc"+
		"\7?\2\2\u01dcX\3\2\2\2\u01dd\u01de\7@\2\2\u01de\u01df\7@\2\2\u01df\u01e0"+
		"\7?\2\2\u01e0Z\3\2\2\2\u01e1\u01e2\7@\2\2\u01e2\u01e3\7@\2\2\u01e3\u01e4"+
		"\7@\2\2\u01e4\u01e5\7?\2\2\u01e5\\\3\2\2\2\u01e6\u01e7\7(\2\2\u01e7\u01e8"+
		"\7?\2\2\u01e8^\3\2\2\2\u01e9\u01ea\7`\2\2\u01ea\u01eb\7?\2\2\u01eb`\3"+
		"\2\2\2\u01ec\u01ed\7~\2\2\u01ed\u01ee\7?\2\2\u01eeb\3\2\2\2\u01ef\u01f0"+
		"\7-\2\2\u01f0d\3\2\2\2\u01f1\u01f2\7/\2\2\u01f2f\3\2\2\2\u01f3\u01f4\7"+
		",\2\2\u01f4h\3\2\2\2\u01f5\u01f6\7\61\2\2\u01f6j\3\2\2\2\u01f7\u01f8\7"+
		"~\2\2\u01f8\u01f9\7~\2\2\u01f9l\3\2\2\2\u01fa\u01fb\7(\2\2\u01fb\u01fc"+
		"\7(\2\2\u01fcn\3\2\2\2\u01fd\u01fe\7?\2\2\u01fe\u01ff\7?\2\2\u01ffp\3"+
		"\2\2\2\u0200\u0201\7@\2\2\u0201\u0202\7?\2\2\u0202r\3\2\2\2\u0203\u0204"+
		"\7>\2\2\u0204\u0205\7?\2\2\u0205t\3\2\2\2\u0206\u0207\7>\2\2\u0207v\3"+
		"\2\2\2\u0208\u0209\7@\2\2\u0209x\3\2\2\2\u020a\u020b\7(\2\2\u020bz\3\2"+
		"\2\2\u020c\u020d\7~\2\2\u020d|\3\2\2\2\u020e\u020f\7`\2\2\u020f~\3\2\2"+
		"\2\u0210\u0211\7@\2\2\u0211\u0212\7@\2\2\u0212\u0080\3\2\2\2\u0213\u0214"+
		"\7>\2\2\u0214\u0215\7>\2\2\u0215\u0082\3\2\2\2\u0216\u0217\7]\2\2\u0217"+
		"\u0084\3\2\2\2\u0218\u0219\7_\2\2\u0219\u0086\3\2\2\2\u021a\u021b\7}\2"+
		"\2\u021b\u0088\3\2\2\2\u021c\u021d\7\177\2\2\u021d\u008a\3\2\2\2\u021e"+
		"\u021f\7*\2\2\u021f\u008c\3\2\2\2\u0220\u0221\7+\2\2\u0221\u008e\3\2\2"+
		"\2\u0222\u0223\7\60\2\2\u0223\u0090\3\2\2\2\u0224\u0225\7A\2\2\u0225\u0092"+
		"\3\2\2\2\u0226\u0227\7#\2\2\u0227\u0094\3\2\2\2\u0228\u0229\7<\2\2\u0229"+
		"\u0096\3\2\2\2\u022a\u022b\7B\2\2\u022b\u0098\3\2\2\2\u022c\u022d\7=\2"+
		"\2\u022d\u009a\3\2\2\2\u022e\u022f\7.\2\2\u022f\u009c\3\2\2\2\u0230\u0236"+
		"\5\u0091I\2\u0231\u0236\5\u0093J\2\u0232\u0236\5\u0095K\2\u0233\u0236"+
		"\5\u0097L\2\u0234\u0236\5\u0099M\2\u0235\u0230\3\2\2\2\u0235\u0231\3\2"+
		"\2\2\u0235\u0232\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0234\3\2\2\2\u0236"+
		"\u009e\3\2\2\2\u0237\u0238\7k\2\2\u0238\u0239\7h\2\2\u0239\u00a0\3\2\2"+
		"\2\u023a\u023b\7g\2\2\u023b\u023c\7n\2\2\u023c\u023d\7u\2\2\u023d\u023e"+
		"\7g\2\2\u023e\u00a2\3\2\2\2\u023f\u0240\7e\2\2\u0240\u0241\7c\2\2\u0241"+
		"\u0242\7u\2\2\u0242\u0243\7g\2\2\u0243\u00a4\3\2\2\2\u0244\u0245\7f\2"+
		"\2\u0245\u0246\7g\2\2\u0246\u0247\7h\2\2\u0247\u0248\7c\2\2\u0248\u0249"+
		"\7w\2\2\u0249\u024a\7n\2\2\u024a\u024b\7v\2\2\u024b\u00a6\3\2\2\2\u024c"+
		"\u024d\7u\2\2\u024d\u024e\7y\2\2\u024e\u024f\7k\2\2\u024f\u0250\7v\2\2"+
		"\u0250\u0251\7e\2\2\u0251\u0252\7j\2\2\u0252\u00a8\3\2\2\2\u0253\u0254"+
		"\7f\2\2\u0254\u0255\7q\2\2\u0255\u00aa\3\2\2\2\u0256\u0257\7y\2\2\u0257"+
		"\u0258\7j\2\2\u0258\u0259\7k\2\2\u0259\u025a\7n\2\2\u025a\u025b\7g\2\2"+
		"\u025b\u00ac\3\2\2\2\u025c\u025d\7h\2\2\u025d\u025e\7q\2\2\u025e\u025f"+
		"\7t\2\2\u025f\u00ae\3\2\2\2\u0260\u0261\7d\2\2\u0261\u0262\7t\2\2\u0262"+
		"\u0263\7g\2\2\u0263\u0264\7c\2\2\u0264\u0265\7m\2\2\u0265\u00b0\3\2\2"+
		"\2\u0266\u0267\7e\2\2\u0267\u0268\7q\2\2\u0268\u0269\7p\2\2\u0269\u026a"+
		"\7v\2\2\u026a\u026b\7k\2\2\u026b\u026c\7p\2\2\u026c\u026d\7w\2\2\u026d"+
		"\u026e\7g\2\2\u026e\u00b2\3\2\2\2\u026f\u0270\7t\2\2\u0270\u0271\7g\2"+
		"\2\u0271\u0272\7v\2\2\u0272\u0273\7w\2\2\u0273\u0274\7t\2\2\u0274\u0275"+
		"\7p\2\2\u0275\u00b4\3\2\2\2\u0276\u0277\7v\2\2\u0277\u0278\7t\2\2\u0278"+
		"\u0279\7{\2\2\u0279\u00b6\3\2\2\2\u027a\u027b\7e\2\2\u027b\u027c\7c\2"+
		"\2\u027c\u027d\7v\2\2\u027d\u027e\7e\2\2\u027e\u027f\7j\2\2\u027f\u00b8"+
		"\3\2\2\2\u0280\u0281\7h\2\2\u0281\u0282\7k\2\2\u0282\u0283\7p\2\2\u0283"+
		"\u0284\7c\2\2\u0284\u0285\7n\2\2\u0285\u0286\7n\2\2\u0286\u0287\7{\2\2"+
		"\u0287\u00ba\3\2\2\2\u0288\u028f\7$\2\2\u0289\u028e\5\3\2\2\u028a\u028e"+
		"\7\"\2\2\u028b\u028e\5\5\3\2\u028c\u028e\5\u009dO\2\u028d\u0289\3\2\2"+
		"\2\u028d\u028a\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028c\3\2\2\2\u028e\u0291"+
		"\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\3\2\2\2\u0291"+
		"\u028f\3\2\2\2\u0292\u0293\7$\2\2\u0293\u00bc\3\2\2\2\u0294\u029a\5\3"+
		"\2\2\u0295\u0299\5\3\2\2\u0296\u0299\5\5\3\2\u0297\u0299\7a\2\2\u0298"+
		"\u0295\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0297\3\2\2\2\u0299\u029c\3\2"+
		"\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u00be\3\2\2\2\u029c"+
		"\u029a\3\2\2\2\u029d\u02a3\5\5\3\2\u029e\u02a2\5\5\3\2\u029f\u02a2\5\3"+
		"\2\2\u02a0\u02a2\5\u009dO\2\u02a1\u029e\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1"+
		"\u02a0\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2"+
		"\2\2\u02a4\u00c0\3\2\2\2\u02a5\u02a3\3\2\2\2\16\2\u00c8\u00d2\u00db\u0102"+
		"\u0235\u028d\u028f\u0298\u029a\u02a1\u02a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}