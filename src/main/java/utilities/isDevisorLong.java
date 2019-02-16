package utilities;

import java.util.function.LongPredicate;

/**
 * @author lefeverw
 */
public class isDevisorLong implements LongPredicate {
    long value;
    public isDevisorLong(long value) {
        this.value = value;
    }

    @Override
    public boolean test(long devisor) {
        return this.value%devisor == 0;
    }
}
