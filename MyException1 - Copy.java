public class MyException2 extends Exception {
    private int ld;


    public MyException2(int str) {
        ld = str;
    }

    public int getF() {
        return ld;
    }
}