package Problem9;

import java.util.function.IntPredicate;

/**
 * @author lefeverw
 */
public class isSum1000 implements IntPredicate {
    int a;
    int b;
    public isSum1000(int a, int b) {
        this.a =a;
        this.b = b;
    }

    @Override
    public boolean test(int c) {
        return a+b+c==1000;
    }
}
