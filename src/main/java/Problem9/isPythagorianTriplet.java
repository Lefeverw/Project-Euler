package Problem9;

import java.util.function.IntPredicate;

/**
 * @author lefeverw
 */
public class isPythagorianTriplet implements IntPredicate {
    int a;
    int b;
    public isPythagorianTriplet(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean test(int c) {
        return Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2);
    }
}
