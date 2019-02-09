package Problem2;

import utilities.DoesNotExceedNumber;
import utilities.FibonacciSupplier;
import utilities.isEven;

import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class MainProblem2 {
    public static void main(String[] args) {
        int sum = IntStream.generate(new FibonacciSupplier())
                .limit(45)
                .filter(new DoesNotExceedNumber(4000000))
                .filter(new isEven())
                .sum();
        System.out.println(sum);
    }


}
