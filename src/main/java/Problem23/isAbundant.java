package Problem23;

import com.google.common.collect.Lists;
import utilities.isDevisorLong;

import java.util.ArrayList;
import java.util.function.LongPredicate;
import java.util.stream.LongStream;

/**
 * @author lefeverw
 */
public class isAbundant implements LongPredicate {
    private ArrayList<Long> abundants = Lists.newArrayList();

    @Override
    public boolean test(long value) {
        if(value%2!=0&&value%5!=0)
            return false;
        if(value%12==0)
            return true;
        return LongStream.range(1, value).filter(new isDevisorLong(value)).sum()>value;
    }
}
