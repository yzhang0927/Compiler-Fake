package typenscope;

public class Symbol {
    private int line;
    private int start_pos;
    private int end_pos;
    private String name;
    private boolean isLocal;

    private boolean isDefined = false;

    private static final boolean ISLOCAL = true;
    private static final String DEFAULT_NAME = "$DEFAULT$NAME";
    private static final int DEFAULT_LINE = -1;

    public Symbol() {
        this(ISLOCAL, DEFAULT_NAME, DEFAULT_LINE);
    }

    // Initialization when you encounter global/local id;
    public Symbol(boolean isLocal,String name, int line){
        this.isLocal = isLocal;
        this.line = line;
        this.name = name;
    }


    public boolean isDefined(){
        return this.isDefined;
    }

    public String getName(){
        return this.name;
    }

    public int getLine(){
        return this.line;
    }
    // Set attributes when you see id = int_lit/array
    public boolean isLocal(){
        return this.isLocal;
    }


}
