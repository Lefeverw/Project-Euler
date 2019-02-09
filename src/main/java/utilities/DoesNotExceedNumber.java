package utilities;

import java.util.function.IntPredicate;

/**
 * @author lefeverw
 */
public class DoesNotExceedNumber implements IntPredicate {
    private static int NUMBER;

    public DoesNotExceedNumber(int number) {
        NUMBER = number;
    }

    @Override
    public boolean test(int value) {
        return value<NUMBER;
    }

    public static int getNUMBER() {
        return NUMBER;
    }

    public static void setNUMBER(int NUMBER) {
        DoesNotExceedNumber.NUMBER = NUMBER;
    }
}
