// Generated from D:/2 курс 2 семестр/pbl/back\gr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, VALUE=3, DIGIT=4, INPUT_NAME=5, MEMORY_NAME=6, OUTPUT_NAME=7, 
		NEWLINE=8, TYPE_CONTACT=9, TYPE_COIL=10, START=11, END=12, AND=13, OR=14, 
		OPEN_PARANTHESSES=15, CLOSED_PARANTHESSES=16;
	public static final int
		RULE_input = 0, RULE_source_code = 1, RULE_program = 2, RULE_contact = 3, 
		RULE_coil = 4, RULE_long_contact_name = 5, RULE_long_coil_name = 6, RULE_contact_name = 7, 
		RULE_coil_name = 8, RULE_operators = 9, RULE_operation = 10, RULE_parathesses = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"input", "source_code", "program", "contact", "coil", "long_contact_name", 
			"long_coil_name", "contact_name", "coil_name", "operators", "operation", 
			"parathesses"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'contact '", "'coil '", null, null, "'I'", "'M'", "'Q'", "'\r\n'", 
			null, null, "'start'", "'end'", "' & '", "'V'", "' ('", "') '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "VALUE", "DIGIT", "INPUT_NAME", "MEMORY_NAME", "OUTPUT_NAME", 
			"NEWLINE", "TYPE_CONTACT", "TYPE_COIL", "START", "END", "AND", "OR", 
			"OPEN_PARANTHESSES", "CLOSED_PARANTHESSES"
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
	public String getGrammarFileName() { return "gr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InputContext extends ParserRuleContext {
		public TerminalNode INPUT_NAME() { return getToken(grParser.INPUT_NAME, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(grParser.VALUE, 0); }
		public TerminalNode NEWLINE() { return getToken(grParser.NEWLINE, 0); }
		public Source_codeContext source_code() {
			return getRuleContext(Source_codeContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grVisitor ) return ((grVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(INPUT_NAME);
				setState(25);
				input();
				}
				break;
			case VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(VALUE);
				setState(27);
				input();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				match(NEWLINE);
				setState(29);
				source_code();
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

	public static class Source_codeContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(grParser.START, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public Source_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterSource_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitSource_code(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grVisitor ) return ((grVisitor<? extends T>)visitor).visitSource_code(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_codeContext source_code() throws RecognitionException {
		Source_codeContext _localctx = new Source_codeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_source_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(START);
			setState(33);
			program();
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode OPEN_PARANTHESSES() { return getToken(grParser.OPEN_PARANTHESSES, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public ContactContext contact() {
			return getRuleContext(ContactContext.class,0);
		}
		public CoilContext coil() {
			return getRuleContext(CoilContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grVisitor ) return ((grVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PARANTHESSES:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(OPEN_PARANTHESSES);
				setState(36);
				program();
				}
				break;
			case TYPE_CONTACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				contact();
				}
				break;
			case TYPE_COIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				coil();
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

	public static class ContactContext extends ParserRuleContext {
		public Long_contact_nameContext long_contact_name() {
			return getRuleContext(Long_contact_nameContext.class,0);
		}
		public TerminalNode DIGIT() { return getToken(grParser.DIGIT, 0); }
		public OperatorsContext operators() {
			return getRuleContext(OperatorsContext.class,0);
		}
		public ContactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterContact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitContact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grVisitor ) return ((grVisitor<? extends T>)visitor).visitContact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContactContext contact() throws RecognitionException {
		ContactContext _localctx = new ContactContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_contact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			long_contact_name();
			setState(42);
			match(DIGIT);
			setState(43);
			operators();
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

	public static class CoilContext extends ParserRuleContext {
		public Long_coil_nameContext long_coil_name() {
			return getRuleContext(Long_coil_nameContext.class,0);
		}
		public TerminalNode DIGIT() { return getToken(grParser.DIGIT, 0); }
		public OperatorsContext operators() {
			return getRuleContext(OperatorsContext.class,0);
		}
		public CoilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coil; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterCoil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitCoil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grVisitor ) return ((grVisitor<? extends T>)visitor).visitCoil(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoilContext coil() throws RecognitionException {
		CoilContext _localctx = new CoilContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_coil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			long_coil_name();
			setState(46);
			match(DIGIT);
			setState(47);
			operators();
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

	public static class Long_contact_nameContext extends ParserRuleContext {
		public TerminalNode TYPE_CONTACT() { return getToken(grParser.TYPE_CONTACT, 0); }
		public Contact_nameContext contact_name() {
			return getRuleContext(Contact_nameContext.class,0);
		}
		public Long_contact_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_long_contact_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterLong_contact_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitLong_contact_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grVisitor ) return ((grVisitor<? extends T>)visitor).visitLong_contact_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Long_contact_nameContext long_contact_name() throws RecognitionException {
		Long_contact_nameContext _localctx = new Long_contact_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_long_contact_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(TYPE_CONTACT);
			setState(50);
			match(T__0);
			setState(51);
			contact_name();
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

	public static class Long_coil_nameContext extends ParserRuleContext {
		public TerminalNode TYPE_COIL() { return getToken(grParser.TYPE_COIL, 0); }
		public Coil_nameContext coil_name() {
			return getRuleContext(Coil_nameContext.class,0);
		}
		public Long_coil_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_long_coil_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterLong_coil_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitLong_coil_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grVisitor ) return ((grVisitor<? extends T>)visitor).visitLong_coil_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Long_coil_nameContext long_coil_name() throws RecognitionException {
		Long_coil_nameContext _localctx = new Long_coil_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_long_coil_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(TYPE_COIL);
			setState(54);
			match(T__1);
			setState(55);
			coil_name();
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

	public static class Contact_nameContext extends ParserRuleContext {
		public TerminalNode INPUT_NAME() { return getToken(grParser.INPUT_NAME, 0); }
		public TerminalNode MEMORY_NAME() { return getToken(grParser.MEMORY_NAME, 0); }
		public Contact_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contact_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterContact_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitContact_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grVisitor ) return ((grVisitor<? extends T>)visitor).visitContact_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Contact_nameContext contact_name() throws RecognitionException {
		Contact_nameContext _localctx = new Contact_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_contact_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if ( !(_la==INPUT_NAME || _la==MEMORY_NAME) ) {
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

	public static class Coil_nameContext extends ParserRuleContext {
		public TerminalNode OUTPUT_NAME() { return getToken(grParser.OUTPUT_NAME, 0); }
		public TerminalNode MEMORY_NAME() { return getToken(grParser.MEMORY_NAME, 0); }
		public Coil_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coil_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterCoil_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitCoil_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grVisitor ) return ((grVisitor<? extends T>)visitor).visitCoil_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Coil_nameContext coil_name() throws RecognitionException {
		Coil_nameContext _localctx = new Coil_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_coil_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !(_la==MEMORY_NAME || _la==OUTPUT_NAME) ) {
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

	public static class OperatorsContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public List<OperatorsContext> operators() {
			return getRuleContexts(OperatorsContext.class);
		}
		public OperatorsContext operators(int i) {
			return getRuleContext(OperatorsContext.class,i);
		}
		public ContactContext contact() {
			return getRuleContext(ContactContext.class,0);
		}
		public CoilContext coil() {
			return getRuleContext(CoilContext.class,0);
		}
		public ParathessesContext parathesses() {
			return getRuleContext(ParathessesContext.class,0);
		}
		public TerminalNode END() { return getToken(grParser.END, 0); }
		public OperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grVisitor ) return ((grVisitor<? extends T>)visitor).visitOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorsContext operators() throws RecognitionException {
		OperatorsContext _localctx = new OperatorsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operators);
		try {
			int _alt;
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				operation();
				setState(62);
				operators();
				}
				break;
			case TYPE_CONTACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				contact();
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(65);
						operators();
						}
						} 
					}
					setState(70);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				break;
			case TYPE_COIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				coil();
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(72);
						operators();
						}
						} 
					}
					setState(77);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				break;
			case OPEN_PARANTHESSES:
			case CLOSED_PARANTHESSES:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				parathesses();
				setState(79);
				operators();
				}
				break;
			case END:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				match(END);
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

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(grParser.AND, 0); }
		public TerminalNode OR() { return getToken(grParser.OR, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grVisitor ) return ((grVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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

	public static class ParathessesContext extends ParserRuleContext {
		public TerminalNode OPEN_PARANTHESSES() { return getToken(grParser.OPEN_PARANTHESSES, 0); }
		public TerminalNode CLOSED_PARANTHESSES() { return getToken(grParser.CLOSED_PARANTHESSES, 0); }
		public ParathessesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parathesses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).enterParathesses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grListener ) ((grListener)listener).exitParathesses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grVisitor ) return ((grVisitor<? extends T>)visitor).visitParathesses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParathessesContext parathesses() throws RecognitionException {
		ParathessesContext _localctx = new ParathessesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parathesses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==OPEN_PARANTHESSES || _la==CLOSED_PARANTHESSES) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\5\2!\n\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\5\4*\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13E\n\13\f\13\16"+
		"\13H\13\13\3\13\3\13\7\13L\n\13\f\13\16\13O\13\13\3\13\3\13\3\13\3\13"+
		"\5\13U\n\13\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2"+
		"\6\3\2\7\b\3\2\b\t\3\2\17\20\3\2\21\22\2X\2 \3\2\2\2\4\"\3\2\2\2\6)\3"+
		"\2\2\2\b+\3\2\2\2\n/\3\2\2\2\f\63\3\2\2\2\16\67\3\2\2\2\20;\3\2\2\2\22"+
		"=\3\2\2\2\24T\3\2\2\2\26V\3\2\2\2\30X\3\2\2\2\32\33\7\7\2\2\33!\5\2\2"+
		"\2\34\35\7\5\2\2\35!\5\2\2\2\36\37\7\n\2\2\37!\5\4\3\2 \32\3\2\2\2 \34"+
		"\3\2\2\2 \36\3\2\2\2!\3\3\2\2\2\"#\7\r\2\2#$\5\6\4\2$\5\3\2\2\2%&\7\21"+
		"\2\2&*\5\6\4\2\'*\5\b\5\2(*\5\n\6\2)%\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\7"+
		"\3\2\2\2+,\5\f\7\2,-\7\6\2\2-.\5\24\13\2.\t\3\2\2\2/\60\5\16\b\2\60\61"+
		"\7\6\2\2\61\62\5\24\13\2\62\13\3\2\2\2\63\64\7\13\2\2\64\65\7\3\2\2\65"+
		"\66\5\20\t\2\66\r\3\2\2\2\678\7\f\2\289\7\4\2\29:\5\22\n\2:\17\3\2\2\2"+
		";<\t\2\2\2<\21\3\2\2\2=>\t\3\2\2>\23\3\2\2\2?@\5\26\f\2@A\5\24\13\2AU"+
		"\3\2\2\2BF\5\b\5\2CE\5\24\13\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2"+
		"GU\3\2\2\2HF\3\2\2\2IM\5\n\6\2JL\5\24\13\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2"+
		"\2MN\3\2\2\2NU\3\2\2\2OM\3\2\2\2PQ\5\30\r\2QR\5\24\13\2RU\3\2\2\2SU\7"+
		"\16\2\2T?\3\2\2\2TB\3\2\2\2TI\3\2\2\2TP\3\2\2\2TS\3\2\2\2U\25\3\2\2\2"+
		"VW\t\4\2\2W\27\3\2\2\2XY\t\5\2\2Y\31\3\2\2\2\7 )FMT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}