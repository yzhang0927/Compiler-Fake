package typenscope;

public class Arr extends Symbol {

    private int startPos;

    private int endPos;

    private final int size;

    public Arr(String name, int line) {
        this(name, line, 0);
    }

    public Arr(String name, int line, int size) {
        super(name, line);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean isDefined(){
        return true;
    }

    @Override
    public String getType(){
        return "ARRAY";
    }

    @Override
    public String toString() {
        return String.format("ARRAY! name %s, on line %d, size %d", getName(), getLine(), size);
    }
}
