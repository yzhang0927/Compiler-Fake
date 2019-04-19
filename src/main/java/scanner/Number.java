package scanner;

public class Number extends Token {
    private int value;
    public Number(String token, int lineNum, int startCharPos, int finishCharPos) {
        super(token, lineNum, startCharPos, finishCharPos);
        this.value = -1;
    }

    public int getValue() {
        return value;
    }

    public String modify() {
        try {
            value = Integer.parseInt(getToken());
            this.setToken(String.valueOf(value));

        } catch (NumberFormatException exp) {
            System.err.println("integer too large");
            this.setToken("-1");
        }
        return this.getToken();
    }

    @Override public boolean validate(char prevChar) {
        try {
            value = Integer.parseInt(getToken());
            this.setToken(String.valueOf(value));
            return true;

        } catch (NumberFormatException exp) {
            System.err.println("integer too large");
            this.setToken("-1");
            return false;
        }
    }
}