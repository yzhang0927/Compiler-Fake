// Generated from /Users/syd/Desktop/scala_proj/javaproj/Compiler-Fake/grammar/Calc.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#start_symbol}.
	 * @param ctx the parse tree
	 */
	void enterStart_symbol(CalcParser.Start_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#start_symbol}.
	 * @param ctx the parse tree
	 */
	void exitStart_symbol(CalcParser.Start_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#int_lit}.
	 * @param ctx the parse tree
	 */
	void enterInt_lit(CalcParser.Int_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#int_lit}.
	 * @param ctx the parse tree
	 */
	void exitInt_lit(CalcParser.Int_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(CalcParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(CalcParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(CalcParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(CalcParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(CalcParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(CalcParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(CalcParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(CalcParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CalcParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CalcParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CalcParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CalcParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#array_id}.
	 * @param ctx the parse tree
	 */
	void enterArray_id(CalcParser.Array_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#array_id}.
	 * @param ctx the parse tree
	 */
	void exitArray_id(CalcParser.Array_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(CalcParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(CalcParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(CalcParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(CalcParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#bool_op}.
	 * @param ctx the parse tree
	 */
	void enterBool_op(CalcParser.Bool_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#bool_op}.
	 * @param ctx the parse tree
	 */
	void exitBool_op(CalcParser.Bool_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(CalcParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(CalcParser.LhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#lhs_item}.
	 * @param ctx the parse tree
	 */
	void enterLhs_item(CalcParser.Lhs_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#lhs_item}.
	 * @param ctx the parse tree
	 */
	void exitLhs_item(CalcParser.Lhs_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalcParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalcParser.ExprContext ctx);
}