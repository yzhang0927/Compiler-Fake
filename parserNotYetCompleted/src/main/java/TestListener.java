// Generated from /Users/syd/Desktop/scala_proj/javaproj/Compiler-Fake/Test.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestParser}.
 */
public interface TestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestParser#start_symbol}.
	 * @param ctx the parse tree
	 */
	void enterStart_symbol(TestParser.Start_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#start_symbol}.
	 * @param ctx the parse tree
	 */
	void exitStart_symbol(TestParser.Start_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(TestParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(TestParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(TestParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(TestParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(TestParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(TestParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(TestParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(TestParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TestParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TestParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#array_id}.
	 * @param ctx the parse tree
	 */
	void enterArray_id(TestParser.Array_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#array_id}.
	 * @param ctx the parse tree
	 */
	void exitArray_id(TestParser.Array_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(TestParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(TestParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(TestParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(TestParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#bool_op}.
	 * @param ctx the parse tree
	 */
	void enterBool_op(TestParser.Bool_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#bool_op}.
	 * @param ctx the parse tree
	 */
	void exitBool_op(TestParser.Bool_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(TestParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(TestParser.LhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#lhs_item}.
	 * @param ctx the parse tree
	 */
	void enterLhs_item(TestParser.Lhs_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#lhs_item}.
	 * @param ctx the parse tree
	 */
	void exitLhs_item(TestParser.Lhs_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TestParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TestParser.ExprContext ctx);
}