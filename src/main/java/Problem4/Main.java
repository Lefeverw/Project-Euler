package Problem4;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(IntStream.range(100, 999)
                .map(number1 ->
                    IntStream.range(number1, 999).map(mapToMultiplication(number1)).filter(new isPalindrome()).max().orElse(0)
                ).max().getAsInt());
    }

    private static IntUnaryOperator mapToMultiplication(int number1) {
        return number2-> number1*number2;
    }
}
