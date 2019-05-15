package typenscope;

import java.util.ArrayList;

public class Arr extends Symbol {

    private int startPos;

    private int endPos;

    private final int size;

    public Arr(String name, int line) {
        this(name, line, 0);
    }

    public Arr(String name, int line, int size) {
        super(name, line);
        this.size = size;
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
