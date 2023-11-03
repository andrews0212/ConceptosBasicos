package Array;

import java.util.Arrays;
import java.util.Scanner;

public class E1d0_numero{
static Scanner teclado = new Scanner(System.in);
static int[] numero;

static void getNumero() {
    numero = new int[5];
    String numeros = "";
    for (int i = 0; i < numero.length; i++) {
        System.out.println("dime la edad");
        numero[i] = teclado.nextInt();
    //    numeros += numero[i] + " ";
    }
    //System.out.println(Arrays.toString(numero)); // esta seria una forma que se puden mostrar los numeros
    // la otra forma seria que se concatenaran y los mostrara por pantalla
    // 
    for (int i = 0; i < numero.length; i++) {
        System.out.print(numero[i] + " ");
    }
    System.out.println();
    for (int i = numero.length - 1; i >= 0; i--) {
        System.out.print(numero[i] + " ");
    }
    //System.out.println(numeros);
}
public static void main(String[] args) {
    getNumero();
}
}