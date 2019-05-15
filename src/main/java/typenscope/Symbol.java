package typenscope;

public class Symbol {
    private int line;
    private int start_pos;
    private int end_pos;
    private String name;
    private boolean isLocal;
    private int val;
    private boolean isDefined = false;

    private static final boolean ISLOCAL = true;
    private static final String DEFAULT_NAME = "$DEFAULT$NAME";
    private static final int DEFAULT_LINE = -1;

    public Symbol() {
    }

    public Symbol(String name,int line){
        this.name = name;
        this.line = line;
    }

    // Initialization when you encounter global/local id;

    public void setNameAndLine (String name, int line){
        this.name = name;
        this.line = line;
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

    public String getType(){
        return "UNDEFINED";
    }

    @Override
    public String toString() {
        return String.format("name %s, on line %d", name, line);
    }
}
