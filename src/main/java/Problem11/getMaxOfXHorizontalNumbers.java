package Problem11;

import java.util.function.Function;
import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class getMaxOfXHorizontalNumbers implements Function<int[], Integer> {
    private final int index;

    public getMaxOfXHorizontalNumbers(int index) {
        this.index = index;
    }

    @Override
    public Integer apply(int[] ints) {
        if(ints.length<index)
            return 0;
        return IntStream.rangeClosed(0,ints.length-index).map(new GetProduct(ints, index)).max().getAsInt();
    }
}
