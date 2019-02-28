package Problem23;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * @author lefeverw
 */
public class MainProblem23 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long limit = 28123;
        HashSet<Long> allNumbers = (HashSet<Long>) LongStream.rangeClosed(1, limit).boxed().collect(Collectors.toSet());
        List<Long> abundants = LongStream.rangeClosed(1, limit).filter( new isAbundant()).boxed().collect(Collectors.toList());
        abundants.stream().forEach(abundant1 -> {
            System.out.println(abundant1);
            abundants.stream()
                    .filter(abundant2 -> abundant2 >= abundant1)
                    .filter(abundant2 -> abundant1 + abundant2 <= limit)
                    .forEach(abundant2 -> {
                        allNumbers.remove(abundant1 + abundant2);
                    });
        });
        System.out.println(allNumbers.stream().mapToInt(Long::intValue).sum());
        System.out.printf("Solution took %s s",(System.currentTimeMillis()-start)/1000.);
    }
}
