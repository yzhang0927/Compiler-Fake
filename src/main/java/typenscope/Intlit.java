package typenscope;

public class Intlit extends Symbol {

    private int line;
    private int startPos;
    private int stopPos;
    private String name;
    private boolean isLegal;

    public Intlit(){
    }

    public Intlit(String name,int line){
        this.name = name;
        this.line = line;
    }

    public void setNameAndLine(String name,int line) {
        this.name = name;
        this.line = line;
    }

    @Override
    public boolean isDefined() {
        return true;
    }
}
