package Problem3;

import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class isPrime implements IntPredicate {
    @Override
    public boolean test(int value) {
        System.out.println(IntStream.range(2,(int)Math.sqrt(value)).filter(new isDevisor(value)).boxed().collect(Collectors.toList()).size());
       return  IntStream.range(2,(int)Math.sqrt(value)).filter(new isDevisor(value)).sum()==0;
    }
}
