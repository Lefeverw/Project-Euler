package Problem11;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

/**
 * @author lefeverw
 */
public class getMaxOfXHorizontalNumbersTest {

    @Test
    public void testgetMaxofXHorizontalNumbers() {
        int [] line = new int[]{1,2,3,4,5,6};
        getMaxOfXHorizontalNumbers max = new getMaxOfXHorizontalNumbers(4);
        Assert.assertEquals(Optional.of(360),max.apply(line));
    }
}