package utilities;

import java.util.function.LongSupplier;
import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class PrimeSupplierBelowInteger implements LongSupplier {
    int currentNumber = 1;
    int limit;
    int counter = 1;

    public PrimeSupplierBelowInteger(int limit) {
        this.limit = limit;
    }

    @Override
    public long getAsLong() {
        if(currentNumber>=limit)
            return 0;
        currentNumber = IntStream.rangeClosed(currentNumber + 1, currentNumber + 1000).filter(new isPrime()).findFirst().getAsInt();
        counter++;
        if(currentNumber>limit){
            currentNumber=limit;
            return 0;
        }
        return currentNumber;
    }
}
