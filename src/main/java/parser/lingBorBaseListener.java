// Generated from /Users/syd/Desktop/scala_proj/javaproj/Compiler-Fake/grammar/lingBor.g4 by ANTLR 4.7.2
package parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import typenscope.Arr;
import typenscope.Intlit;
import typenscope.Symbol;
import typenscope.Tuple;

import java.util.*;

/**
 * This class provides an empty implementation of {@link lingBorListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class lingBorBaseListener implements lingBorListener {

	//private HashMap<String, Stack<Symbol>> localMap = new HashMap<>();
	//private Stack<HashSet<String>> forLocalLocalVars = new Stack<HashSet<String>>();
	//private HashSet<String> forLocalVar = new HashSet<>();

	private Stack<HashMap<String, Symbol>> localMapStack = new Stack<>();
	private HashMap<String, Symbol> globalMap = new HashMap<>();
	private HashMap<String, Symbol> funcMap = new HashMap<>();
	private HashMap<String, Symbol> funcVarMap = new HashMap<>();
	private Stack<String> NonTouchableFor = new Stack<>();
	private int statusForLoop = 0;
	private int statusFunc = 0;


	//Nested for loop by adding this var by one every time
	private boolean isInSymbolMap(String idName){

		if(statusForLoop!=0 && statusFunc==0 && localMapStack.peek().containsKey(idName)){
			return true;
		} else if (statusForLoop ==0 && statusFunc==0 && globalMap.containsKey(idName)){
			return true;
		} else if (statusFunc != 0 && statusForLoop ==0 && funcVarMap.containsKey(idName)){
			return true;
		} else {
			return false;
		}
	}

	public String typeOfSymbol(Symbol s) {
		if (s.getClass() == Intlit.class){
			return "INT_LIT";
		} else if (s.getClass() == Arr.class) {
			return "ARRAY";
		} else if (s.getClass() == Tuple.class) {
			return "Tuple";
		} else {
			return "NOT_INITILIZED";
		}
	}


	private String getType(String idName, HashMap<String, Symbol> symbolMap) {
		try{
			Symbol s = symbolMap.get(idName);
			return typeOfSymbol(s);
		} catch(NoSuchElementException en){
		 	System.out.println("no such element in the symbolmap");
		} catch(AssertionError ea){
			System.out.println("this symbol has not been initialized");
		}
		return "-1";
	}

	private boolean isSameType(String idName1,String idName2){
		if (statusForLoop == 0 && statusFunc == 0) {
			return getType(idName1,globalMap)==getType(idName2,globalMap);
		} else if (statusForLoop != 0 && statusFunc == 0 ) {
			return getType(idName1,localMapStack.peek())==getType(idName2,localMapStack.peek());
		} else if (statusForLoop == 0 && statusFunc!= 0 ) {
			return getType(idName1,funcVarMap)==getType(idName2,funcVarMap);
		} else {
			return false;
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStart_symbol(lingBorParser.Start_symbolContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStart_symbol(lingBorParser.Start_symbolContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInt_lit(lingBorParser.Int_litContext ctx) { }
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

	    String idName;
	    int line;
	    boolean isLegalDcrl = false;

		if (ctx.id()!=null) {
			idName = ctx.id(0).ID().getSymbol().getText();
			line = ctx.id(0).ID().getSymbol().getLine();
		} else{
			System.out.println("error in declaration format");
			return;
		}


		// outside loop, outside function, only global allowed
		if (statusForLoop == 0 && statusFunc == 0) {
			if (ctx.KW_LOCAL() != null) {
				System.out.println("local only exists in code block and function, it is not support here");
			} else if (ctx.KW_ARRAY() != null) {
				if(globalMap.containsKey(idName)){
					if(typeOfSymbol(globalMap.get(idName))=="NOT_INITIALIZED"){
						boolean isLocal = globalMap.get(idName).isLocal();
						globalMap.remove(idName);
						globalMap.put(idName,new Arr(isLocal,idName,line));
					} else{
						System.out.println(String.format("The array:%s has been initialized before",idName));
					}
				}else {
					System.out.println(String.format("The array:%s has not been declared before", idName));
				}

			} else if (ctx.KW_GLOBAL() != null) {
				if(!globalMap.containsKey(idName)) {
					globalMap.put(idName, new Symbol(false, idName, line));
				} else {
					System.out.println(String.format("The global var:%s has been declared before", idName));
				}
			} else {
				System.out.println("not gonna happen");
			}


		//	inside loop, outside function
		} else if (statusForLoop != 0 && statusFunc == 0 ) {




		//	outside loop, inside function
		} else if (statusForLoop == 0 && statusFunc != 0 ) {



        // no function inside loop
		} else {
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
		if (this.funcMap.containsKey(ctx.id(0))) {
			this.statusFunc = 1;
		} else{
			System.out.println("this function name has been defined already.");
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDef(lingBorParser.DefContext ctx) {
		this.statusFunc = 0;
	}
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
	@Override public void exitBody(lingBorParser.BodyContext ctx) {



	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFor_loop(lingBorParser.For_loopContext ctx) {

		if(ctx.expr().id()!= null) {
			String idForIndex = ctx.expr().id().ID().getSymbol().getText();
			/*
				if (!NonTouchableFor.contains(idForIndex)){
					NonTouchableFor.push(idForIndex);
					this.statusForLoop += 1;
					if(this.statusForLoop > 1){
						forLocalLocalVars.push(forLocalVar);
				}
				forLocalVar.clear();

			//deal those var in statement and dclr listener
			} else{
				System.out.println("duplicate index var found, no duplicate index var in nested loop");
			}
			*/

			
		} else {
			System.out.println("illegal expr found as foreach index var, id only!");
		}

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFor_loop(lingBorParser.For_loopContext ctx) {
		this.statusForLoop -= 1;
		/*
		NonTouchableFor.pop();
		HashSet<String> varsToPop =  forLocalLocalVars.pop();
		for(String e:varsToPop){
			localMap.get(e).pop();
		}
		*/



	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWhile_loop(lingBorParser.While_loopContext ctx) {
		//desperate

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWhile_loop(lingBorParser.While_loopContext ctx) {
		this.statusForLoop -= 1;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatement(lingBorParser.StatementContext ctx) {

		if (statusForLoop == 0 && statusFunc == 0) {
			if (ctx.EXCHANGE()!=null){

			}

		} else if (statusForLoop != 0 && statusFunc == 0 ) {

		} else if (statusForLoop == 0 && statusFunc!= 0 ) {

		} else {

		}


	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatement(lingBorParser.StatementContext ctx) {




	}
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
	@Override public void exitRange(lingBorParser.RangeContext ctx) { }
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
	@Override public void enterExpr(lingBorParser.ExprContext ctx) {
		// Once we find a expr during traversal sub tree of expr, we have to make sure it is defined beforehand
		if(ctx.id()!=null){
			String idName = ctx.id().ID().getSymbol().getText();
			if(!isInSymbolMap(idName)){
				System.out.println(String.format("ID: %s used without initilization",idName));
			} else {
				//we may replace the error
			}
		}

	}
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