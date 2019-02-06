package Problem3;

import java.util.function.IntPredicate;

/**
 * @author lefeverw
 */
public class isDevisor implements IntPredicate {
    long value;
    public isDevisor(long value) {
        this.value = value;
    }

    @Override
    public boolean test(int value) {
        return this.value%value == 0;
    }
}
