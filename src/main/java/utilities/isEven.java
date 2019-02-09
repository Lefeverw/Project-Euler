package utilities;

import java.util.function.IntPredicate;

/**
 * @author lefeverw
 */
public class isEven implements IntPredicate {
    @Override
    public boolean test(int value) {
        return value%2==0;
    }
}
