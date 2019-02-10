package Problem11;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lefeverw
 */
public class GetProductTest {

    @Test
    public void applyAsInt() {
        int [] line = new int[]{1,2,3,4,5,6};
        GetProduct getProduct=new GetProduct(line,4);
        Assert.assertEquals(24,getProduct.applyAsInt(0));
        Assert.assertEquals(120,getProduct.applyAsInt(1));
        Assert.assertEquals(360,getProduct.applyAsInt(2));
    }
}