package utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

/**
 * @author lefeverw
 */
public class MultiplePredicate {
    public static IntPredicate isMultiple(List<Integer> numbers) {
        return x->numbers.stream().anyMatch(number->x%number==0);
    }

}
