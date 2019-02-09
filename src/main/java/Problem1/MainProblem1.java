package Problem1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static utilities.MultiplePredicate.isMultiple;

/**
 * @author lefeverw
 */
public class MainProblem1 {
    public static void main(String[] args) {
        IntStream numbers = IntStream.of(3, 5);
        System.out.println(IntStream.range(1,1000)
                .filter(isMultiple(numbers.boxed().collect(Collectors.toList()))).sum());

    }

}
