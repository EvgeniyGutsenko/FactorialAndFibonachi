import Exception.invalidDataException;

public class FactorialId{

    private FactorialId(){

    }

    public static int[] factorialLoopType(int loopType, int n){
        int [] num = new int[n];
        switch (loopType) {
            case 1:
                num = FactorialId.operationForFactorial(n);
                break;
            case 2:
                num = FactorialId.operationWhileFactorial(n);
                break;
            case 3:
                num = FactorialId.operationDoWhileFactorial(n);
                break;
            default:
                new invalidDataException("Введите от 1 до 3");
        }
        return num;
    }

    public static int[] operationForFactorial(int n){
        int resultForFactorial = 1;
        int[] array = new int[n];
        for (int i = 1; i < array.length; ++i) {
            array[i] = i + 1;
            resultForFactorial *= array[i];
        }
        int[] num = new int[]{resultForFactorial};
        return num;
    }

    public static int[] operationWhileFactorial(int n){
        int resultWhileFactorial = 1;
        int[] array = new int[n];
        int i = 1;
        while(i<array.length) {
            array[i] = i + 1;
            resultWhileFactorial *= array[i];
            i++;
        }
        int [] num = new int[]{resultWhileFactorial};
        return num;
    }

    public static int[] operationDoWhileFactorial(int n){
        int resultDoWhileFactorial = 1;
        int[] array = new int[n];
        int i=1;
        do {array[i] = i + 1;
            resultDoWhileFactorial *= array[i];
            i++;
        }while (i<array.length);
        int[] num = new int[]{resultDoWhileFactorial};
        return num;
    }
}
