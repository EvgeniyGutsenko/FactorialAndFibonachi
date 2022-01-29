package FibonacciAndFactorial;

import Exception.InvalidDataException;

public class FibonacciId{

    private FibonacciId(){
    }

    public static int[] fibonacciLoopType(int loopType, int n) {
        int[] num = new int[n];
        switch (loopType) {
            case 1:
                num = FibonacciId.operationForFibonacci(n);
                break;
            case 2:
                num = FibonacciId.operationWhileFibonacci(n);
                break;
            case 3:
                num = FibonacciId.operationDoWhileFibonacci(n);
                break;
            default:
                new InvalidDataException("Введите от 1 до 3");
        }
        return num;
    }
    public static int[] operationForFibonacci(int n){
        int[] num = new int[n];
        num[0] = 0;
        num[1] = 1;
        for (int i = 2; i < num.length; ++i) {
            num[i] = num[i - 1] + num[i - 2];
        }return num;
    }

    public static int[] operationWhileFibonacci(int n){
        int[] num = new int[n];
        num[0] = 0;
        num[1] = 1;
        int i = 2;
        while(i<num.length) {
            num[i] = num[i - 1] + num[i - 2];
            i++;
        } return num;
    }

    public static int[] operationDoWhileFibonacci(int n){
        int[] num = new int[n];
        num[0] = 0;
        num[1] = 1;
        int i = 2;
        do {num[i] = num[i - 1] + num[i - 2];
            ++i;
        }while (i < num.length);
        return num;
    }
}
