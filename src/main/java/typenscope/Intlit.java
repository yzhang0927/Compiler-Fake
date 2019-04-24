package typenscope;

public class Intlit extends Symbol{

    private int line;
    private int startPos;
    private int stopPos;
    private String name;
    private boolean isLocal;
    private boolean isLegal;

    public Intlit(boolean isLocal, String name, int line){
        super(isLocal,name,line);
    }



}
