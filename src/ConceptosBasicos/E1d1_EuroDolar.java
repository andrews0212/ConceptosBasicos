package ConceptosBasicos;

public class E1d1_EuroDolar {
    /*
    Ejercicio 1 y 2 de conversion de divisas
     */
    static double getDolares(int euros){
        double dolares;
        dolares = euros * 1.14;
        return dolares;
    }
    static double getEuros(int dolares){
        double euros;
        euros =  dolares / 1.14;
        return euros;
    }

    static double getRedondea(double numero){
        return Math.round(numero / 100) * 100;
    }

    public static void main(String[] args){

        System.out.println(getRedondea(getDolares(1200)));
        System.out.println(getRedondea(getEuros(1400)));

    }
}
