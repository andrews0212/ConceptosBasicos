package Bucles;

import java.util.Scanner;

public class E3d2_NumNaturales {
    public static void main(String[] args){
        int numero;
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        for (int i = 0; i < numero; i++) {
            System.out.println(i);
        }
    }
}
