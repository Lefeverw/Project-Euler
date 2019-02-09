package Problem7;

import utilities.PrimeSupplier;

import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(IntStream.generate(new PrimeSupplier()).limit(10001).max().getAsInt());
    }
}
