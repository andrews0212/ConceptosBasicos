package metodos;

public class E7_CoeficienteBinomial {

    static int getFactorial(int numero){
        int factorial;
        factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
    static int getCofBinomial(int n, int k){
    int factorialN, factorialK, C;
    factorialN = getFactorial(n);
    factorialK = getFactorial(k);
    C = factorialN / (factorialK * getFactorial(n - k));
    return C;
    }

    public static void main(String[] args){
        System.out.println(getCofBinomial(20,20));
    }
}
