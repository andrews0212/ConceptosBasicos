package metodos;

public class E8_FactoresPrimos {

    static boolean getNumerosPrimos(int numero){
        int contador;
        contador = 0;
        if ( numero == 1){
            return true;
        }
        for (int i = 2; i <= numero; i++) {
            if (numero % i == 0){
                contador++;
            }
        }
        if (contador == 1){
            return true;
        } else {
            return false;
        }
    }
    static int getFactorialP(int numero){
        int factorial;
        factorial = 1;
        for (int i = 1; i <= numero; i++) {
            if (getNumerosPrimos(i)){
                factorial *= i;
                System.out.println(i);
            }

        }

        return factorial;
    }
    public static void main(String[] args){
        System.out.println(getFactorialP(10));
    }
}
