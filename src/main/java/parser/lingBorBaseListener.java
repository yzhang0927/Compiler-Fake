// Generated from /Users/syd/Desktop/scala_proj/javaproj/Compiler-Fake/grammar/lingBor.g4 by ANTLR 4.7.2
package parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import typenscope.*;

import java.util.*;

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
	private HashMap<String, Stack<Symbol>> symbolMap = new HashMap<>();

	private Stack<Scope> scopes;

	public lingBorBaseListener() {
		scopes = new Stack<Scope>();
		scopes.push(new Scope(null));
	}

	public String typeOfSymbol(Symbol s) {
		if (s.getClass() == Intlit.class){
			return "INT_LIT";
		} else if (s.getClass() == Arr.class) {
			return "ARRAY";
		} else if (s.getClass() == Tuple.class) {
			return "Tuple";
		} else {
			throw new AssertionError();
		}
	}

	public void arithHandle(){

	}


	public void dclrHandle(lingBorParser.DeclContext declContext, boolean isLocal, Token symbolToken){
		Symbol symbolTemp = new Symbol(isLocal);
		if (declContext.ASSIGN() != null) {
			if (declContext.expr(0) != null) {
				//global/local a = 10
				if (declContext.expr(0).int_lit() != null) {
					Token tokenTemp = declContext.expr(0).int_lit().INT_LIT().getSymbol();
					symbolTemp = new Intlit(isLocal);
					symbolTemp.ini(tokenTemp.getText(), tokenTemp.getLine());

				//global/local a = b

				} else if (declContext.expr(0).id() != null) {
					String potentialIdName = declContext.expr(0).id().ID().getSymbol().getText();
					if (isInSymbolMap(potentialIdName)) {
						symbolTemp = getSymbol(potentialIdName);
					} else {
						System.err.println("Error! You are trying to assigning a Id:"+ potentialIdName +" that was not defined");
					}

				// global/local k = a*b+12
				// We need to go deep to see if there is a id in there not representing an int_lit

				} else {
					arithHandle();
				}

			} else {
				System.err.println("Error! You are trying to assigning without a rhs item after =");
			}
		} else {
			symbolTemp.ini(symbolToken.getText(),symbolToken.getLine());
		}
		Stack<Symbol> idStackByName = new Stack<>();
		idStackByName.push(symbolTemp);
		symbolMap.put(symbolToken.getText(),idStackByName);
	}

	public void assignHandle(lingBorParser.StatementContext ctx){

	}

	public boolean isInSymbolMap(String idName){
		if (symbolMap.containsKey(idName) && !symbolMap.get(idName).isEmpty()){
			return true;
		} else {
			return false;
		}
	}

	public Symbol getSymbol(String idName){
		return symbolMap.get(idName).peek();
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
		// Every time you meet a declaration action.
		// We will create a object, initialized with its property.
		if (ctx.KW_LOCAL() != null) {
			System.out.println("local: " + ctx.KW_LOCAL().getSymbol().getText());
			//this means the existance of a local declaration
			//let's make sure there is an id following the 'local' token
			if (ctx.id(0) != null) {
				dclrHandle(ctx, true, ctx.id(0).ID().getSymbol());
			} else {
				// parser itself will raise an error message if it find a 'local' without id name
				// we should not do anything here
			}


		} else if (ctx.KW_ARRAY() != null) {
			System.out.println("Array: " + ctx.KW_ARRAY().getSymbol().getText());
			//this means the existance of a array declaration
			if (ctx.id(0) != null) {
				if(ctx.expr(0)!=null){
					//TBI
					//check if it belongs to int_lit
				}
				if(ctx.expr(1)!=null){
					//TBI
				}
				
			}
		} else if (ctx.KW_GLOBAL() != null) {
			System.out.println("global: " + ctx.KW_GLOBAL().getSymbol().getText());

			if (ctx.id(0) != null) {
				String idName = ctx.id(0).ID().getSymbol().getText();
				if (symbolMap.containsKey(idName)) {
					// a previous declr has already occupy this idname, unlike local case, global
					// declr uncder any predefined var is not allowed
					// we should prob make it an exception
					System.out.println("Error! global var: " + idName + " has been declared before");
					return;
				}

				dclrHandle(ctx, false, ctx.id(0).ID().getSymbol());

			} else {
				System.out.println("global cannot be written alone");
			}
		} else{
			System.out.println("not gonna happen");
		}

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
	@Override public void enterDef(lingBorParser.DefContext ctx) {
		//local hashmap for one function, everything need to be declared before using
		//params are used as local inside the fucntion
		HashMap<String, Stack<Symbol>> symbolMap = new HashMap<>();



	}
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
	@Override public void enterBody(lingBorParser.BodyContext ctx) {


		}
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