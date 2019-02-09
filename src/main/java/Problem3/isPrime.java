package Problem3;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class isPrime implements IntPredicate {
    @Override
    public boolean test(int value) {
       return  !IntStream.range(2,(int)Math.ceil(Math.sqrt(value))).anyMatch(new isDevisor(value));
    }
}
