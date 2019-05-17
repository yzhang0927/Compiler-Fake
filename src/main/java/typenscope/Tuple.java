package typenscope;

public class Tuple extends Symbol {

    private int length;
    private boolean isLocal;
    private String name;
    private int line;


    public Tuple(int length){
        this.length = length;
    }

    public Tuple(String name, int line, int length){
       this.name = name;
       this.length = length;
       this.line = line;
    }

    public void setNameAndLine(String name, int line) {
        this.name = name;
        this.line = line;
    }

    public int getLength(){
        return this.length;
    }

    @Override
    public boolean isDefined(){
        return true;
    }

    @Override
    public String getType(){
        return String.format("TUPLE,%d",this.getLength());
    }

}
