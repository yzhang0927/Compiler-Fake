// Generated from /Users/syd/Desktop/scala_proj/javaproj/Compiler-Fake/grammar/lingBor.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lingBorParser}.
 */
public interface lingBorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lingBorParser#start_symbol}.
	 * @param ctx the parse tree
	 */
	void enterStart_symbol(lingBorParser.Start_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link lingBorParser#start_symbol}.
	 * @param ctx the parse tree
	 */
	void exitStart_symbol(lingBorParser.Start_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link lingBorParser#int_lit}.
	 * @param ctx the parse tree
	 */
	void enterInt_lit(lingBorParser.Int_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link lingBorParser#int_lit}.
	 * @param ctx the parse tree
	 */
	void exitInt_lit(lingBorParser.Int_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link lingBorParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(lingBorParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link lingBorParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(lingBorParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link lingBorParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(lingBorParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link lingBorParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(lingBorParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link lingBorParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(lingBorParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link lingBorParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(lingBorParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link lingBorParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(lingBorParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link lingBorParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(lingBorParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link lingBorParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(lingBorParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link lingBorParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(lingBorParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link lingBorParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(lingBorParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link lingBorParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(lingBorParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link lingBorParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(lingBorParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link lingBorParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(lingBorParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link lingBorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(lingBorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link lingBorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(lingBorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link lingBorParser#array_id}.
	 * @param ctx the parse tree
	 */
	void enterArray_id(lingBorParser.Array_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link lingBorParser#array_id}.
	 * @param ctx the parse tree
	 */
	void exitArray_id(lingBorParser.Array_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link lingBorParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(lingBorParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link lingBorParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(lingBorParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link lingBorParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(lingBorParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link lingBorParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(lingBorParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link lingBorParser#bool_op}.
	 * @param ctx the parse tree
	 */
	void enterBool_op(lingBorParser.Bool_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link lingBorParser#bool_op}.
	 * @param ctx the parse tree
	 */
	void exitBool_op(lingBorParser.Bool_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link lingBorParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(lingBorParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lingBorParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(lingBorParser.LhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lingBorParser#tuple_ele}.
	 * @param ctx the parse tree
	 */
	void enterTuple_ele(lingBorParser.Tuple_eleContext ctx);
	/**
	 * Exit a parse tree produced by {@link lingBorParser#tuple_ele}.
	 * @param ctx the parse tree
	 */
	void exitTuple_ele(lingBorParser.Tuple_eleContext ctx);
	/**
	 * Enter a parse tree produced by {@link lingBorParser#array_ele}.
	 * @param ctx the parse tree
	 */
	void enterArray_ele(lingBorParser.Array_eleContext ctx);
	/**
	 * Exit a parse tree produced by {@link lingBorParser#array_ele}.
	 * @param ctx the parse tree
	 */
	void exitArray_ele(lingBorParser.Array_eleContext ctx);
	/**
	 * Enter a parse tree produced by {@link lingBorParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(lingBorParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link lingBorParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(lingBorParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link lingBorParser#lhs_item}.
	 * @param ctx the parse tree
	 */
	void enterLhs_item(lingBorParser.Lhs_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link lingBorParser#lhs_item}.
	 * @param ctx the parse tree
	 */
	void exitLhs_item(lingBorParser.Lhs_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link lingBorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(lingBorParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link lingBorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(lingBorParser.ExprContext ctx);
}