package searching.calculator;

import calculator.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialTest {

    @Test
    void fac () {
        Factorial factorial = new Factorial();
        int returned = factorial.fac(6);
        Assertions.assertEquals(720, returned);
    }

}