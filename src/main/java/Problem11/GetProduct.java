package Problem11;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class GetProduct implements IntUnaryOperator {
    int[] ints;
    int index;
    public GetProduct(int[] ints, int index) {
        this.index=index;
        this.ints=ints.clone();
    }

    @Override
    public int applyAsInt(int operand) {
        return IntStream.range(operand, operand+index).map(x->ints[x]).reduce(1,(a,b)->a*b);
    }
}
