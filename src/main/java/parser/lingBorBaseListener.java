// Generated from /Users/syd/Desktop/scala_proj/javaproj/Compiler-Fake/grammar/lingBor.g4 by ANTLR 4.7.2
package parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import typenscope.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Stack;

/**
 * This class provides an empty implementation of {@link lingBorListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class lingBorBaseListener implements lingBorListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	private Hashtable<String, Stack<Symbol>> symbolTable = new Hashtable<String, Stack<Symbol>>();
	// symbol table

	private Stack<Scope> scopes;

	public lingBorBaseListener() {
		scopes = new Stack<Scope>();
		scopes.push(new Scope(null));
	}

	@Override public void enterStart_symbol(lingBorParser.Start_symbolContext ctx) { }
	@Override public void exitStart_symbol(lingBorParser.Start_symbolContext ctx) { }
	@Override public void enterInt_lit(lingBorParser.Int_litContext ctx) {
		try {
			// character index in entire file
			System.out.println(ctx.INT_LIT().getSymbol().getStartIndex()+ " " +ctx.INT_LIT().getSymbol().getStopIndex());
			// line index in entire file
			System.out.println(ctx.INT_LIT().getSymbol().getLine());
		} catch (NumberFormatException exp){
			//ctx.INT_LIT().getSymbol().getText() = "-1";
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInt_lit(lingBorParser.Int_litContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterId(lingBorParser.IdContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitId(lingBorParser.IdContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInput(lingBorParser.InputContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInput(lingBorParser.InputContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDecl(lingBorParser.DeclContext ctx) {
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDecl(lingBorParser.DeclContext ctx) {
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDef(lingBorParser.DefContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDef(lingBorParser.DefContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBody(lingBorParser.BodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBody(lingBorParser.BodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatement(lingBorParser.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatement(lingBorParser.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArray_id(lingBorParser.Array_idContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArray_id(lingBorParser.Array_idContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRange(lingBorParser.RangeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRange(lingBorParser.RangeContext ctx) {


	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBool_expr(lingBorParser.Bool_exprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBool_expr(lingBorParser.Bool_exprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBool_op(lingBorParser.Bool_opContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBool_op(lingBorParser.Bool_opContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLhs(lingBorParser.LhsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLhs(lingBorParser.LhsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLhs_item(lingBorParser.Lhs_itemContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLhs_item(lingBorParser.Lhs_itemContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpr(lingBorParser.ExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpr(lingBorParser.ExprContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}