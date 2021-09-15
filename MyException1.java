import java.time.LocalDate;

public class MyException1 extends Exception {
    private LocalDate ld;


    public MyException1(LocalDate str) {
        ld = str;
    }

    public LocalDate getF() {
        return ld;
    }
}