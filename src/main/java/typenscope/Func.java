package typenscope;

import parser.lingBorParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Func extends Symbol {

    private int line;
    private String name;
    private String returnType;
    private String inputVarName;
    private String inputType;
    private boolean isCall = false;
    private lingBorParser.DefContext ctx;
    private HashMap<String, Symbol> funcVarMap;

    public Func(String name, int line, String inputVarName, lingBorParser.DefContext ctx){
        this.line = line;
        this.name = name;
        this.ctx = ctx;
        this.inputVarName = inputVarName;
    }

    public void storeFuncVarMap(HashMap<String, Symbol> funcVarMap) {
        this.funcVarMap = funcVarMap;
    }

    public boolean checkInputValid(String ls){
        return this.inputType.equals(ls);
    }
    public String getInputType() {return this.inputType;}
    public String getReturnType() {
        return this.returnType;
    }
    public void setCalled(){
        this.isCall = true;
    }
    public boolean hasCalled(){
        return this.isCall;
    }
    public void setReturnType(String type) { this.returnType = type; }
    public lingBorParser.DefContext getCtx(){
        return this.ctx;
    }
    public boolean isInputVar(String str){
        if(str.equals(this.inputVarName)){return true;}
        else {return false;}
    }

    public void setInputType(String ls){
        this.inputType = ls;
        setCalled();
    }

}
