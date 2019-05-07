package typenscope;

import java.util.ArrayList;

public class Arr extends Symbol{

    private int line;
    private int startPos;
    private int endPos;
    private String name;

    private int length;

    public Arr(String name,int line)
    {
        this.name = name;
        this.line = line;
    }

    @Override
    public boolean isDefined(){
        return true;
    }

    @Override
    public String getType(){
        return "ARRAY";
    }
}
