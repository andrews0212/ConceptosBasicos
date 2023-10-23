package ConceptosBasicos;

import java.util.Scanner;
public class E1d3_Calculadora {

    public static int getSuma(int numeroA, int numeroB){
        return numeroA + numeroB;
    }

    public static int getResta(int numeroA, int numeroB){
        return  numeroA - numeroB;
    }
    public static int getMultiplicacion(int numeroA, int numeroB){
        return  numeroA * numeroB;
    }
    public static double getDivicion(int numeroA, int numeroB){
        return  (double) numeroA / numeroB;
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("dime valor 1 y valor2 separados por espacios");
        int numeroA = teclado.nextInt();
        int numeroB = teclado.nextInt();
        System.out.println("la suma es " + getSuma(numeroA, numeroB));
        System.out.println("la resta es " + getResta(numeroA, numeroB));
        System.out.println("la multiplicacion es " + getMultiplicacion(numeroA, numeroB));
        System.out.println("la  divicion es " + getDivicion(numeroA, numeroB));
    }

}
