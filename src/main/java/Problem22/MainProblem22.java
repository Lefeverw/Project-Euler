package Problem22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class MainProblem22 {
    public static void main(String[] args) throws IOException {
        List<String> names = Files.lines(Paths.get("C:\\Users\\lefeverw\\Documents\\GitHub\\Project-Euler\\src\\main\\java\\Problem22\\names.txt"))
                .flatMap(x -> Arrays.stream(x.replace("\"","").split(",")))
                .collect(Collectors.toList());
        names.sort(String::compareTo);
        System.out.println(IntStream.range(0, names.size()).map(number -> calculateScore(number, names.get(number))).sum());
    }

    private static int calculateScore(int number, String s) {
        return Arrays.stream(s.split("")).mapToInt(MainProblem22::getLetterScore).sum()*(number+1);
    }

    private static int getLetterScore(String s) {
        return s.charAt(0)-64;
    }

}
