package Problem12;

import javafx.util.Pair;
import utilities.NumberOfDevisors;
import utilities.TriangleNumberSupplier;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * @author lefeverw
 */
public class MainProblem12 {
    public static void main(String[] args) {
        AtomicInteger maxValue= new AtomicInteger();
        long start = System.currentTimeMillis();
        System.out.println(IntStream.generate(new TriangleNumberSupplier())
                .limit(100000)
                .mapToObj(x -> new Pair<>(x, new NumberOfDevisors().applyAsInt(x)))
                .filter(x -> {
                    if(x.getValue()> maxValue.get()){
                        maxValue.set(x.getValue());
                        System.out.println(x.toString());
                    }
                    return x.getValue() >= 500;})
                .findFirst().orElse(new Pair(0, 0)));
        LOGGER.info("Time " + (System.currentTimeMillis() - start) / 1000.);
    }

}
