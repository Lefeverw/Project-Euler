package Problem2;

import java.util.function.IntPredicate;

/**
 * @author lefeverw
 */
public class isPositive implements IntPredicate {
    @Override
    public boolean test(int value) {
        return value>0;
    }
}
