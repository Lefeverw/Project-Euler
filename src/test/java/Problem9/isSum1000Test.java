package Problem9;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lefeverw
 */
public class isSum1000Test {

    @Test
    public void testIsSum1000() {
        isSum1000 testSum = new isSum1000(10, 10);
        Assert.assertTrue(testSum.test(980));
        Assert.assertFalse(testSum.test(981));
    }
}