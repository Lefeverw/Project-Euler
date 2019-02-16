package Problem13;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lefeverw
 */
public class MainProblem13 {
    public static void main(String[] args) throws IOException {
        List<BigInteger> listOfIntegers = Files.lines(Paths.get("C:\\Users\\lefeverw\\Documents\\GitHub\\Project-Euler\\src\\main\\java\\Problem13\\number.csv")).map(x -> new BigInteger(x)).collect(Collectors.toList());
        //use 1 so that BigInteger has positive sign
        final BigInteger[] result = {new BigInteger("1")};
        listOfIntegers.stream().forEach(x -> {
           result[0] = result[0].add(x);
        });
        result[0]=result[0].subtract(new BigInteger("1"));
        System.out.println(result[0].toString().substring(0, 10));
    }

}
