// Generated from /Users/syd/Desktop/scala_proj/javaproj/Compiler-Fake/grammar/lingBor.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lingBorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lingBorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link lingBorParser#start_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_symbol(lingBorParser.Start_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#int_lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_lit(lingBorParser.Int_litContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(lingBorParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(lingBorParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(lingBorParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(lingBorParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(lingBorParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(lingBorParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(lingBorParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(lingBorParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#array_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_id(lingBorParser.Array_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(lingBorParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#ifs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfs(lingBorParser.IfsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#elsifs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsifs(lingBorParser.ElsifsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#elses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElses(lingBorParser.ElsesContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(lingBorParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(lingBorParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#bool_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_op(lingBorParser.Bool_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs(lingBorParser.LhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#tuple_ele}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_ele(lingBorParser.Tuple_eleContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#array_ele}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_ele(lingBorParser.Array_eleContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(lingBorParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#lhs_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs_item(lingBorParser.Lhs_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link lingBorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(lingBorParser.ExprContext ctx);
}