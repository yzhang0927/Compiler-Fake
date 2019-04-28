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

	private HashMap<String, Symbol> globalMap = new HashMap<>();
	private HashMap<String, Symbol> funcVarMap = new HashMap<>();

	private HashMap<String, Symbol> funcMap = new HashMap<>();

	private Stack<HashMap<String, Symbol>> localMapStack = new Stack<>();
	private Stack<HashMap<String,Symbol>> funcMapStack = new Stack<>();

	private Stack<String> NonTouchableFor = new Stack<>();
	private int statusForLoop = 0;
	private int statusFunc = 0;


	//Nested for loop by adding this var by one every time
	private boolean isInSymbolMap(String idName){
		if(statusForLoop!=0 && statusFunc==0 && localMapStack.peek().containsKey(idName)){
			return true;
		} else if (statusForLoop == 0 && statusFunc==0 && globalMap.containsKey(idName)){
			return true;
		} else if (statusFunc != 0 && statusForLoop ==0 && funcVarMap.containsKey(idName)){
			return true;
		} else {//loop inside a function
			if(funcMapStack.peek().containsKey(idName)){
				return true;
			}
			return false;
		}
	}

	private boolean isDefinedInSymbolMap(String idName){
		if(statusForLoop!=0 && statusFunc==0 && localMapStack.peek().containsKey(idName)){
			if (localMapStack.peek().get(idName).isDefined()){ return true;}
		} else if (statusForLoop ==0 && statusFunc==0 && globalMap.containsKey(idName)){
			if (globalMap.get(idName).isDefined()){ return true;}
		} else if (statusFunc != 0 && statusForLoop ==0 && funcVarMap.containsKey(idName)) {
			if (funcVarMap.get(idName).isDefined()) { return true; }
		} else {
			if (funcMapStack.peek().get(idName).isDefined()) {return true;}
		}
		return false;
	}

	public String typeOfSymbol(Symbol s) {
		if (s.getClass() == Intlit.class){
			return "INT_LIT";
		} else if (s.getClass() == Arr.class) {
			return "ARRAY";
		} else if (s.getClass() == Tuple.class) {
			return "Tuple";
		} else {
			return "UNDEFINED";
		}
	}


	private String getType(String idName, HashMap<String, Symbol> symbolMap) {
		try {
			Symbol s = symbolMap.get(idName);
			return typeOfSymbol(s);
		} catch (NoSuchElementException en) {
			System.out.println(String.format("no such element:%s in the symbolmap", idName));
			return "-1";
		}
	}

	private String getType(String idName) {
		if (statusForLoop == 0 && statusFunc == 0) {
			return getType(idName,globalMap);
		} else if (statusForLoop != 0 && statusFunc == 0 ) {
			return getType(idName,localMapStack.peek());
		} else if (statusForLoop == 0 && statusFunc!= 0 ) {
			return getType(idName, funcVarMap);
		} else{
			return getType(idName, funcMapStack.peek());
		}
	}

	private boolean isSameType(String idName1,String idName2){
		return getType(idName1)==getType(idName2);
	}


	private Symbol getSymbolByName(String idName){
		if (statusForLoop == 0 && statusFunc == 0) {
			return globalMap.get(idName);
		} else if (statusForLoop != 0 && statusFunc == 0 ) {
			return localMapStack.peek().get(idName);
		} else if (statusForLoop == 0 && statusFunc!= 0 ) {
			return funcVarMap.get(idName);
		} else {
			return funcMapStack.peek().get(idName);
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
			String idForIndexName = ctx.expr().id().ID().getSymbol().getText();
			int idForIndexLine = ctx.expr().id().ID().getSymbol().getLine();
			Symbol idForIndexSymbol = new Symbol(true,idForIndexName,idForIndexLine);
			HashMap<String,Symbol> tmp = new HashMap<>();
			if(this.statusForLoop==0) {
				tmp.putAll(globalMap);
			} else {
				tmp.putAll(localMapStack.peek());
			}
			tmp.put(idForIndexName,idForIndexSymbol);
			localMapStack.push(tmp);
			this.statusForLoop += 1;

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
		localMapStack.pop();

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWhile_loop(lingBorParser.While_loopContext ctx) {
		HashMap<String,Symbol> tmp = new HashMap<>();
		if(this.statusForLoop==0) {
			tmp.putAll(globalMap);
		} else {
			tmp.putAll(localMapStack.peek());
		}
		localMapStack.push(tmp);
		this.statusForLoop += 1;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWhile_loop(lingBorParser.While_loopContext ctx) {
		this.statusForLoop -= 1;
		localMapStack.pop();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */


	@Override public void enterStatement(lingBorParser.StatementContext ctx) {
		String idName;

		if (statusForLoop == 0 && statusFunc == 0) {
			if (ctx.EXCHANGE()!=null){
				if(ctx.lhs(0)!=null && ctx.lhs(1)!=null){
					//this.IsSameCategory(ctx.lhs(0).lhs_item(0),ctx.lhs(1).lhs_item(0));
				}
			} else if (ctx.ASSIGN()!=null&&ctx.lhs(0)!=null) {
				String idNameLeft = ctx.lhs(0).lhs_item(0).id().ID().getSymbol().getText();
				String typeLeft = this.getType(idNameLeft);
				if (typeLeft == "-1") {
					System.out.println("lefthand item not defined");
					//return;
				} else if (ctx.expr().id() != null) {
					String idNameRight = this.getType(ctx.expr().id().ID().getSymbol().getText());
					String typeRight = this.getType(idNameRight);
					if (typeRight == "-1") {
						System.out.println("righthand item not defined");
					} else {

					}
				}
			} else {
				System.out.println("error"); // not gonna happen
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
				System.out.println(String.format("ID: %s used without declaration",idName));
			} else if(!isDefinedInSymbolMap(idName)){
				System.out.println(String.format("ID: %s used without initilization",idName));
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