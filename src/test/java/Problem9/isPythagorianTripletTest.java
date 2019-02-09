package Problem9;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lefeverw
 */
public class isPythagorianTripletTest {

    @Test
    public void testPythagorianTriplet() {
        isPythagorianTriplet triplet = new isPythagorianTriplet(3,4);
        Assert.assertTrue(triplet.test(5));
        Assert.assertFalse(triplet.test(6));
    }
}