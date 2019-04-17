// Generated from /Users/ZhangYu/workspaces/java_workspace/compilerfake/grammar/Calc.g4 by ANTLR 4.7.2
package edu.nyu.compiler.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalcParser#start_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_symbol(CalcParser.Start_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(CalcParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(CalcParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(CalcParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(CalcParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CalcParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#array_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_id(CalcParser.Array_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(CalcParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(CalcParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#bool_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_op(CalcParser.Bool_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs(CalcParser.LhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#lhs_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs_item(CalcParser.Lhs_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CalcParser.ExprContext ctx);
}