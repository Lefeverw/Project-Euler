package Problem14;

import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class MainProblem14 {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1, 1000000)
                .mapToObj(x -> new CollatzSequence(x))
                .max(Comparator.comparingInt(CollatzSequence::getLengthOfCollatzSequence))
                .map(x->x.x).get()
                );
    }
}
