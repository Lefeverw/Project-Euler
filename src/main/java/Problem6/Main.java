package Problem6;

import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class Main {
    public static void main(String[] args) {
        System.out.printf("difference: %.0f",Math.pow(IntStream.rangeClosed(1,100).sum(),2)-IntStream.rangeClosed(1,100).map(x->(int)Math.pow(x,2)).sum());
    }
}
