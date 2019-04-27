package typenscope;

public class Tuple extends Symbol{

    private int length;
    private boolean isLocal;
    private String name;
    private int line;


    public Tuple(boolean isLocal,String name,int line){
        this.isLocal = isLocal;
        this.name = name;
        this.line = line;
    }

    public void ini(int length){
        this.length = length;
    }

    public int getLength(){
        return this.length;
    }
}
