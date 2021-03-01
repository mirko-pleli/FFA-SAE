package searching.calculator;

import calculator.ToByteCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ToByteCalculatorTest {

    @Test
    void decToByte() {
        ToByteCalculator foo = new ToByteCalculator();
        String returned = foo.decToByte(13);
        Assertions.assertEquals("1101", returned);
    }
}