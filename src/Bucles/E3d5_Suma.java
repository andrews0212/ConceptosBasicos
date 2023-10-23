package Bucles;

import java.util.Scanner;

public class E3d5_Suma {
    public static void main(String[] args){
        boolean xor;
        xor = true;
        int numero;
        int suma;
        suma = 0;
        Scanner teclado = new Scanner(System.in);
        while (xor){
            System.out.println("introduce un numero");
            numero = teclado.nextInt();
            if (numero < 0){
              xor = false;
            } else {
                suma += numero;
            }
        }
        System.out.println("la suma de los numero es " + suma);
    }
}
