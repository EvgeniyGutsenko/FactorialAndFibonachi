package Test;

import FibonacciAndFactorial.FibonacciAndFactorial;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FibonacciAndFactorialTest {

    @Test
    public void fibonacciAndFactorialIdSelection() {
        String expected1 = Arrays.toString(FibonacciAndFactorial.doOperation(2, 2, 3));
        String expected2 = Arrays.toString(FibonacciAndFactorial.doOperation(1, 1, 5));

        String actual1 = Arrays.toString(new int[]{0, 1, 1});
        String actual2 = Arrays.toString(new int[]{120});

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }
}
