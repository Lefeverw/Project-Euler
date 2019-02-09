package utilities;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class CheckIfCanBeDevidedBy1To20 implements IntPredicate {

    @Override
    public boolean test(int value) {
        return IntStream.rangeClosed(1,20).allMatch(CanBeDevided(value));
    }

    private IntPredicate CanBeDevided(int value) {
        return x->value%x==0;
    }
}
