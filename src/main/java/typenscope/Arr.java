package typenscope;

import java.util.ArrayList;

public class Arr extends Symbol{

    private int line;
    private int startPos;
    private int endPos;
    private String name;
    private boolean isLocal;

    private int length;

    public Arr(boolean isLocal,String name,int line)
    {
        this.isLocal = isLocal;
        this.name = name;
        this.line = line;
    }

    @Override
    public boolean isDefined(){
        return true;
    }


}
