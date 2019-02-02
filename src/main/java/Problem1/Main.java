package Problem1;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static Problem1.MultiplePredicate.isMultiple;

/**
 * @author lefeverw
 */
public class Main {
    public static void main(String[] args) {
        IntStream numbers = IntStream.of(3, 5);
        System.out.println(IntStream.range(1,1000)
                .filter(isMultiple(numbers.boxed().collect(Collectors.toList()))).sum());

    }

}
