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
        if (abundants.stream().anyMatch(abundant -> {
            if (value % abundant == 0)
                return true;
            return false;
        }))
            return true;
//        System.out.println("\t"+abundants.size());
        long sumOfDevisors = LongStream.range(1, value).filter(new isDevisorLong(value)).sum();
        if (sumOfDevisors > value){
            abundants.add(value);
            return true;
        }else{
            return false;
        }
    }
}
