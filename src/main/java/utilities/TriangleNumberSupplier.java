package utilities;

import java.util.function.IntSupplier;

/**
 * @author lefeverw
 */
public class TriangleNumberSupplier implements IntSupplier {
    int number = 0;
    int index = 0;

    @Override
    public int getAsInt() {
        number += (++index);
//        System.out.println(number);
        return number;
    }
}