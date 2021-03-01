package calculator;

public class Factorial {
    public int fac(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fac(n - 1);
    }
}
