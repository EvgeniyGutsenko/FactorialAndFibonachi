package Test;

import FibonacciAndFactorial.FibonacciId;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FibonacciIdTest {

    @Test
    public void chooseFibonacciLoopType() {
        String expected1 = Arrays.toString(FibonacciId.fibonacciLoopType(1,3));
        String expected2 = Arrays.toString(FibonacciId.fibonacciLoopType(2,3));
        String expected3 = Arrays.toString(FibonacciId.fibonacciLoopType(3,3));

        String actual = Arrays.toString(new int[]{0, 1, 1});

        Assert.assertEquals(expected1,actual);
        Assert.assertEquals(expected2,actual);
        Assert.assertEquals(expected3,actual);
    }
}