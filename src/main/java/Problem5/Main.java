package Problem5;

import utilities.CheckIfCanBeDevidedBy1To20;

import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(IntStream.range(21, 1000000000)
                .filter(new CheckIfCanBeDevidedBy1To20())
                .findFirst()
                .orElse(0));
    }
}
