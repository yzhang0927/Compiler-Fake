package typenscope;

public class Intlit extends Symbol{

    private int line;
    private int startPos;
    private int stopPos;
    private String name;
    private boolean isLocal;
    private boolean isLegal;

    public Intlit(boolean isLocal){
        super(isLocal);
    }

    public void ini (String name, int line, int startPos, int stopPos ){
        this.name = name;
        this.line = line;
        this.startPos = startPos;
        this.stopPos = stopPos;
    }



}
