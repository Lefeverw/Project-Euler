package Problem16;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class MainProblem16 {
    public static void main(String[] args) {
        final BigInteger[] number = {new BigInteger("1")};
        IntStream.rangeClosed(1,1000).forEach(x->{
            number[0] = number[0].multiply(new BigInteger("2"));});
        System.out.println(Arrays.stream(number[0].toString().split("")).mapToInt(x -> Integer.parseInt(x)).sum());

    }
}
