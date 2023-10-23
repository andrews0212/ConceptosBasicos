package Bucles;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class E3d3_NumParImpar {
    public static void primeraVersion(){
        boolean xor;
        xor = true;
        int numero;
        Scanner teclado = new Scanner(System.in);

        while (xor){
            System.out.println("dime un numero");
            numero = teclado.nextInt();
            if (numero < 0){
                xor = false;
            } else if (numero % 2 == 0){
                System.out.println("numero es par");
            } else {
                System.out.println("numero es impar");
            }
        }
    }
    public static void segundaVersion(){
        int numero;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("dime un numero");
            numero = teclado.nextInt();
            if (numero < 0){
                System.out.println("adios");
            } else if (numero % 2 == 0){
                System.out.println("numero es par");
            } else {
                System.out.println("numero es impar");
            }
        }while(!(numero < 0));
        }


    public static void main(String[] args){
    segundaVersion();
    }
}
