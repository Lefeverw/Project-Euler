package Problem20;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class MainProblem20 {
    public static void main(String[] args) {
        final BigInteger[] product = {BigInteger.ONE};
        IntStream.rangeClosed(1, 100)
                .map(x -> {
            if (x % 10 == 0) return x / 10;
            return x;
        })
                .mapToObj(x -> {
                    return new BigInteger("" + x);
                }).forEach(x -> {
            product[0] = product[0].multiply(x);
        })        ;
        System.out.println(product[0].toString());
        System.out.println(Arrays.stream(product[0].toString().split("")).mapToInt(Integer::parseInt).sum());
    }
}
