package Test;

import FibonacciAndFactorial.FactorialId;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FactorialIdTest {

    @Test
    public void chooseFactorialLoopType() {

            String expected1 = Arrays.toString(FactorialId.factorialLoopType(1,5));
            String expected2 = Arrays.toString(FactorialId.factorialLoopType(2,5));
            String expected3 = Arrays.toString(FactorialId.factorialLoopType(3,5));

            String actual = Arrays.toString(new int[]{120});

            Assert.assertEquals(expected1,actual);
            Assert.assertEquals(expected2,actual);
            Assert.assertEquals(expected3,actual);

    }
}