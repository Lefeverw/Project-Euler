package Problem10;

import utilities.isPrimeLong;
import utilities.PrimeSupplierBelowInteger;

import java.util.stream.LongStream;

/**
 * @author lefeverw
 */
public class MainProblem10 {
    public static void main(String[] args) {
        int limit =2000000;
        long start = System.currentTimeMillis();
        System.out.println(LongStream.generate(new PrimeSupplierBelowInteger(limit)).limit(limit).sum());
        System.out.println((System.currentTimeMillis()-start)/1000.);
        start = System.currentTimeMillis();
        System.out.println(LongStream.range(2, limit).filter(new isPrimeLong()).sum());
        System.out.println((System.currentTimeMillis()-start)/1000.);
    }
}
