package utilities;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class NumberOfDevisors implements IntUnaryOperator {
    @Override
    public int applyAsInt(int operand) {
        return (int) ((int)Math.sqrt(operand)*(int)Math.sqrt(operand)==operand?
                2*IntStream.rangeClosed(1,(int)Math.sqrt(operand)).filter(new isDevisorLong(operand)::test).count()-1:
                2*IntStream.rangeClosed(1,(int)Math.sqrt(operand)).filter(new isDevisorLong(operand)::test).count());
    }
}
