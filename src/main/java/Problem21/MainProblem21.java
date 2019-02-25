package Problem21;

import utilities.isDevisor;

import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class MainProblem21 {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1, 10000)
                .filter(number -> {
                    int potAmical = getAmical(number);
                    int checkReturnNumber = getAmical(potAmical);
                    if (checkReturnNumber == number && number!=potAmical){
                        return true;
                    }
                    return false;

                }).sum());
    }

    private static int getAmical(int number) {
        return IntStream.range(1, number)
                .filter(new isDevisor(number)).sum();
    }
}
