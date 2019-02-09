package Problem8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.ToLongFunction;

/**
 * @author lefeverw
 */
public class Multiplier implements ToLongFunction<ArrayList> {

    @Override
    public long applyAsLong(ArrayList value) {
        ArrayList<BigDecimal> listOfIntegers= (ArrayList<BigDecimal>) value;
        return listOfIntegers.stream().reduce(BigDecimal.ONE, (a, b) -> BigDecimal.valueOf(a.longValue() * b.longValue())).longValue();
    }
}
