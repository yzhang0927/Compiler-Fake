// Generated from /Users/syd/Desktop/scala_proj/javaproj/Compiler-Fake/grammar/lingBor.g4 by ANTLR 4.7.2
package typenscope;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.lingBorListener;
import parser.lingBorParser;

import java.util.HashMap;
import java.util.Stack;

/*
 * This class provides an empty implementation of {@link lingBorListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.




public class lingBorBaseListener implements lingBorListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	private HashMap<String, Stack<Symbol>> localMap = new HashMap<>();
	private HashMap<String, Symbol> globalMap = new HashMap<>();
    private HashMap<String, Symbol> funcMap = new HashMap<>();

    private int status;

    // 0 for normal env
    // 1 for entering code block, foreach
    // 2 for entering function

    public lingBorBaseListener() {
        this.status = 0;
    }

	/*
    private Stack<Scope> scopes;
	public lingBorBaseListener() {
		scopes = new Stack<Scope>();
		scopes.push(new Scope(null));
	}
	*/

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


	public void declarAssignHandle(lingBorParser.DeclContext ctx, boolean isLocal, Token symbolToken){
		Symbol symbolTemp = new Symbol(); // = new Symbol(isLocal,symbolToken.getText(),symbolToken.getLine());
		if (ctx.ASSIGN()!=null){
			if(ctx.expr(0)!=null){
				//global/local a = 10
				if(ctx.expr(0).int_lit()!=null){
					Token tokenTemp = ctx.expr(0).int_lit().INT_LIT().getSymbol();
					symbolTemp = new Intlit(isLocal,symbolToken.getText(),symbolToken.getLine());
				//global/local a = b
				} else if (ctx.expr(0).id()!=null){
					String potentialIdName = ctx.expr(0).id().ID().getSymbol().getText();

					if (isInSymbolMap(potentialIdName)) {
						symbolTemp = getSymbol(potentialIdName);
					} else {
						System.err.println("Error! You are trying to assigning a Id:"+ potentialIdName +" that was not defined");
					}

				// global/local k = a*b+12
				// We need to go deep to see if there is a id in there not representing an int_lit

				} else {


				}

			} else {
				System.out.println("Error! You are trying to assigning withoud a rhs item after =");
			}
		}
		Stack<Symbol> idStackByName = new Stack<>();
		idStackByName.push(symbolTemp);
		symbolMap.put(symbolToken.getText(),idStackByName);
	}

	public void assignHandle(lingBorParser.StatementContext ctx){

	}


	public void pollFromDict(String idName,HashMap<String,Stack<Symbol>> symbolMap){
		if (isInSymbolMap(idName,symbolMap)){
			symbolMap.get(idName).pop();
			if (symbolMap.get(idName).isEmpty()){
				symbolMap.remove(idName);
			}
		}

	}

	public void pushInDict(Symbol s,HashMap<String,Stack<Symbol>> symbolMap){
		if (isInSymbolMap(s.getName(),symbolMap)){
			symbolMap.get(s.getName()).push(s);
		} else {
			Stack<Symbol> stackTmp = new Stack<>();
			stackTmp.push(s);
			symbolMap.put(s.getName(),stackTmp);
		}

	}

	public boolean isInSymbolMap(String idName,HashMap<String,Stack<Symbol>> symbolMap){
		if (symbolMap.containsKey(idName) && !symbolMap.get(idName).isEmpty()){
			return true;
		} else {
			return false;
		}
	}

	public Symbol getSymbol(String idName,HashMap<String,Stack<Symbol>> symbolMap){
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

        if (status==0) {
            if (ctx.KW_LOCAL() != null) {
                System.out.println("local: " + ctx.KW_LOCAL().getSymbol().getText());
                //this means the existance of a local declaration
                //let's make sure there is an id following the 'local' token
                if (ctx.id(0) != null) {
                    declarAssignHandle(ctx, true, ctx.id(0).ID().getSymbol());
                } else {
                    // parser itself will raise an error message if it find a 'local' without id name
                    // we should not do anything here
                }
            } else if (ctx.KW_ARRAY() != null) {

            } else if (ctx.KW_GLOBAL() != null) {

            } else {
                System.out.println("not gonna happen");
            }
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
		//HashMap<String, Stack<Symbol>> symbolMap = new HashMap<>();
        this.status = 2;
        String funcName = ctx.id(0).ID().getSymbol().getText();
        if()
        if(funcMap.containsKey(funcName)){
            System.out.println("duplicate fucntion definition:"+funcName);
        } else {
            funcMap.put(funcName,null);


        }
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
	@Override public void enterStatement(lingBorParser.StatementContext ctx) {



    }
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