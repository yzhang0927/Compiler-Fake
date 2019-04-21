package typenscope;

public class Tuple extends Symbol{

    private int length;
    private String memberType;
    public Tuple(boolean isLocal){
        super(isLocal);
    }

    public void ini(String name,int line,int length, String memberType){
        this.length = length;
        this.memberType = memberType;
    }

    public int getLength(){
        return this.length;
    }
}
