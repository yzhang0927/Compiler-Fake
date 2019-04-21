package typenscope;

import java.util.ArrayList;
import java.util.List;

public class Func extends Symbol{

    private int line;
    private int startPos;
    private int stopPos;
    private String name;
    private int startLine;
    private int endLine;

    private ArrayList<Symbol> params;
    private Symbol ret; //return Symbol

    public Func(boolean isLocal){
        super(isLocal);
    }


    public void ini(String name, int startLine, int endLine, ArrayList<Symbol> params, Symbol ret){
        this.name = name;
        this.startLine = startLine;
        this.endLine = endLine;
        this.params = params;
        this.ret = ret;
    }

    public Symbol getReturn(){
        return this.ret;
    }

    public List<Symbol> getInputParams(){
        return this.params;
    }

}
