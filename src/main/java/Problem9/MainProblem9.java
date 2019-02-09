package Problem9;

import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class MainProblem9 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,1000).forEach(a->{
            IntStream.rangeClosed(a,1000).forEach(b->{
                IntStream.rangeClosed(b,1000).filter(new isPythagorianTriplet(a,b)).filter(new isSum1000(a,b)).forEach(c->System.out.print(a+"\t"+b+"\t"+c+":\t"+a*b*c));
                    }
            );
        });
    }
}
