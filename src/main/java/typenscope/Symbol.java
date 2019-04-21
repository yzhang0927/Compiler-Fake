package typenscope;

public class Symbol {
    private int line;
    private int start_pos;
    private int end_pos;
    private String name;
    private boolean isLocal;

    // Initialization when you encounter global/local id;
    public Symbol(boolean isLocal){
        this.isLocal = isLocal;
    }

    // Set attributes when you see id = int_lit/array
    public void ini(String name, int line){
        this.name = name;
        this.line = line;
    }


}
