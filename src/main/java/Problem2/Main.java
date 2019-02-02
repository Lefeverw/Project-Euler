package Problem2;

import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(IntStream.generate(new FibonacciSupplier()).limit(45).filter(new DoesNotExceedNumber(4000000)).filter(new isEven()).sum());
    }


}
