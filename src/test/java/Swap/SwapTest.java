package Swap;

import org.junit.Assert;
import org.junit.Test;

/**
 * Get the tests passing.
 */
public class SwapTest {
    @Test
    public void testSwap() throws Exception {
        Double[] array = {1.5, 2.0, 3.0};
        Double[] result = Swap.<Double>swap(0, 1, array);
        Double[] expected = {2.0, 1.5, 3.0};
        Assert.assertArrayEquals(expected, result);
    }
}