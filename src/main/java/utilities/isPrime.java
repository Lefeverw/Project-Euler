package utilities;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class isPrime implements IntPredicate {
    @Override
    public boolean test(int value) {
        if(value ==2)
            return true;
       return  !IntStream.range(2,(int)Math.ceil(Math.sqrt(value))+1).anyMatch(new isDevisor(value));
    }
}
