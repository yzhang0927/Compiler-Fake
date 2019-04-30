package typenscope;

public class Func extends Symbol {

    private int line;
    private String name;
    private int returnNum;

    public Func(String name, int line, int returnNum){
        this.line = line;
        this.name = name;
        this.returnNum = returnNum;
    }

    public int getReturnNum() {
        return returnNum;
    }

}
