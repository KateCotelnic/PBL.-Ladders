// Generated from D:/2 курс 2 семестр/pbl/back\gr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grParser}.
 */
public interface grListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(grParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(grParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#source_code}.
	 * @param ctx the parse tree
	 */
	void enterSource_code(grParser.Source_codeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#source_code}.
	 * @param ctx the parse tree
	 */
	void exitSource_code(grParser.Source_codeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(grParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(grParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#contact}.
	 * @param ctx the parse tree
	 */
	void enterContact(grParser.ContactContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#contact}.
	 * @param ctx the parse tree
	 */
	void exitContact(grParser.ContactContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#coil}.
	 * @param ctx the parse tree
	 */
	void enterCoil(grParser.CoilContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#coil}.
	 * @param ctx the parse tree
	 */
	void exitCoil(grParser.CoilContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#long_contact_name}.
	 * @param ctx the parse tree
	 */
	void enterLong_contact_name(grParser.Long_contact_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#long_contact_name}.
	 * @param ctx the parse tree
	 */
	void exitLong_contact_name(grParser.Long_contact_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#long_coil_name}.
	 * @param ctx the parse tree
	 */
	void enterLong_coil_name(grParser.Long_coil_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#long_coil_name}.
	 * @param ctx the parse tree
	 */
	void exitLong_coil_name(grParser.Long_coil_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#contact_name}.
	 * @param ctx the parse tree
	 */
	void enterContact_name(grParser.Contact_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#contact_name}.
	 * @param ctx the parse tree
	 */
	void exitContact_name(grParser.Contact_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#coil_name}.
	 * @param ctx the parse tree
	 */
	void enterCoil_name(grParser.Coil_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#coil_name}.
	 * @param ctx the parse tree
	 */
	void exitCoil_name(grParser.Coil_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#operators}.
	 * @param ctx the parse tree
	 */
	void enterOperators(grParser.OperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#operators}.
	 * @param ctx the parse tree
	 */
	void exitOperators(grParser.OperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(grParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(grParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link grParser#parathesses}.
	 * @param ctx the parse tree
	 */
	void enterParathesses(grParser.ParathessesContext ctx);
	/**
	 * Exit a parse tree produced by {@link grParser#parathesses}.
	 * @param ctx the parse tree
	 */
	void exitParathesses(grParser.ParathessesContext ctx);
}