// Generated from D:/2 курс 2 семестр/pbl/back\gr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(grParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#source_code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_code(grParser.Source_codeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(grParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#contact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContact(grParser.ContactContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#coil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoil(grParser.CoilContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#long_contact_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLong_contact_name(grParser.Long_contact_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#long_coil_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLong_coil_name(grParser.Long_coil_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#contact_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContact_name(grParser.Contact_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#coil_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoil_name(grParser.Coil_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperators(grParser.OperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(grParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link grParser#parathesses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParathesses(grParser.ParathessesContext ctx);
}