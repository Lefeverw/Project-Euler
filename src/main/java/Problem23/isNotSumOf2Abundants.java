package Problem23;

import java.util.function.LongPredicate;
import java.util.stream.LongStream;

/**
 * @author lefeverw
 */
public class isNotSumOf2Abundants implements LongPredicate {
    LongPredicate isAbundant = new isAbundant();
    @Override
    public boolean test(long value) {
       return !LongStream.rangeClosed(12,(long)Math.ceil(value/2.0)-12).anyMatch(x->{
           if(!isAbundant.test(x))
               return false;
           if(!isAbundant.test(value-x))
               return false;
           return true;
          });
    }
}
