package FibonacciAndFactorial;

import Exception.InvalidDataException;

public class FibonacciAndFactorial {

    private FibonacciAndFactorial() {
    }

    public static int[] doOperation(int algorithmId, int loopType, int n) {

        int [] num = new int[0];
        switch (algorithmId) {

            case 1:
                num = FactorialId.factorialLoopType(loopType,n);
                break;
            case 2:
                num = FibonacciId.fibonacciLoopType(loopType,n);
                break;
            default:
                new InvalidDataException("Не верно введен тип операции");
        }
        return num;
        }
}

