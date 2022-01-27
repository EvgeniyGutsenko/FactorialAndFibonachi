import java.util.Arrays;

public class Test {

    public static void main(String [] args){
        FibonacciAndFactorial d = new FibonacciAndFactorial();
        FibonacciAndFactorial e = new FibonacciAndFactorial();
        int[] a = d.doOperation(2,1,6);
        System.out.println(Arrays.toString(a));
    }
}
