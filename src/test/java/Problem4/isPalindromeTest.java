package Problem4;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.*;

/**
 * @author lefeverw
 */
public class isPalindromeTest {

    @Test
    public void getLengthTest() {
        isPalindrome ipd = new isPalindrome();
        Assert.assertEquals(ipd.getLength(1), 1);
        Assert.assertEquals(ipd.getLength(9), 1);
        Assert.assertEquals(ipd.getLength(10), 2);
        Assert.assertEquals(ipd.getLength(99), 2);
        Assert.assertEquals(ipd.getLength(100), 3);
        Assert.assertEquals(ipd.getLength(999), 3);
    }


    @Test
    public void test1() {
        isPalindrome ipd = new isPalindrome();
        IntStream.of(151, 111, 999, 11, 143341).forEach(number -> {
            Assert.assertEquals(ipd.test(number),true);
        });
    }

    @Test
    public void digitEqualsOppositeDigitTest() {
        isPalindrome ipd = new isPalindrome();
        IntStream.range(0,3).forEach(number -> {
            ipd.setLength(ipd.getLength(143341)-1);
            ipd.setValue(143341);
            ipd.digitEqualsOppositeDigit().test(number);
            Assert.assertEquals(ipd.digitEqualsOppositeDigit().test(number),true);
        });


    }
}