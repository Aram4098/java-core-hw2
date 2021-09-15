public class MyException extends Exception {
    private String ss;


    public MyException(String str) {
        super(str);
        ss = str;
    }

    public String getF() {
        return ss;
    }
}