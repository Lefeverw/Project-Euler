package utilities;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class PrimeSupplier implements IntSupplier {
    int currentNumber = 1;

    @Override
    public int getAsInt() {
        currentNumber = IntStream.rangeClosed(currentNumber + 1, currentNumber + 1000000).filter(new isPrime()).findFirst().getAsInt();
        return currentNumber;
    }
}
