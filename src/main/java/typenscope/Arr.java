package typenscope;

import java.util.ArrayList;

public class Arr extends Symbol{

    private int line;
    private int startPos;
    private int endPos;
    private String name;
    private boolean isLocal;

    private ArrayList<Symbol> members;
    private String memberType;
    private int length;

    public Arr(boolean isLocal,String name,int line)
    {
        this.isLocal = isLocal;
        this.name = name;
        this.line = line;
    }

    public void ini(String name, int startPos, int endPos, ArrayList<Symbol> members, String member,int length){
        this.name  = name;
        this.startPos = startPos;
        this.endPos = endPos;
        this.members = members;
        this.length = length;
    }



}
