package Problem3;

import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class Main {
    public static void main(String[] args) {
        BigDecimal number = new BigDecimal("600851475143");
        System.out.println(IntStream.range(2, (int) Math.ceil(Math.sqrt(number.longValue())))
                .filter(new isDevisor(number.longValue()))
                .filter(new isPrime())
                .max().getAsInt());
    }

}
