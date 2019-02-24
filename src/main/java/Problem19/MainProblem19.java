package Problem19;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * @author lefeverw
 */
public class MainProblem19 {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger();

        IntStream.rangeClosed(1901, 2000).forEach(
                year -> IntStream.rangeClosed(1, 12).forEach(
                        month -> IntStream.rangeClosed(1, 31).forEach(
                                day -> {
                                    try {
                                        LocalDate localDate = LocalDate.of(year, month, day);
                                        if (localDate.getDayOfWeek().equals(DayOfWeek.SUNDAY)&& day ==1) {
                                            counter.getAndIncrement();
                                        }
                                    } catch (DateTimeException e) {

                                    }
                                }
                        )
                )
        );


        System.out.println(counter);
    }
}
