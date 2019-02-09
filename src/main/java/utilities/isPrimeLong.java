package utilities;

import java.util.function.LongPredicate;
import java.util.stream.LongStream;

/**
 * @author lefeverw
 */
public class isPrimeLong implements LongPredicate {
    @Override
    public boolean test(long value) {
        if(value ==2)
            return true;
        return  !LongStream.range(2,(int)Math.ceil(Math.sqrt(value))+1).anyMatch(new isDevisorLong(value));
    }
}
