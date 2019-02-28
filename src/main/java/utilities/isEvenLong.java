package utilities;

import java.util.function.LongPredicate;

/**
 * @author lefeverw
 */
public class isEvenLong implements LongPredicate {
    @Override
    public boolean test(long value) {
        return value%2==0;
    }
}
