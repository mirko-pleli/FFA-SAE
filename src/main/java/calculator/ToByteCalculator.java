package calculator;

public class ToByteCalculator {
    public String decToByte(int n) {
        if(n > 0) {
            return decToByte(n/2) + n % 2;
        }
        return "";
    }
}
