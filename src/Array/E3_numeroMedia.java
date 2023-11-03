package Array;

import java.util.Arrays;
import java.util.Scanner;

public class E3_numeroMedia {
    static Scanner teclado = new Scanner(System.in);
    static int[] numero;


    static void cargaNumeros() {
        numero = new int[5];
        
        for (int i = 0; i < numero.length; i++) {
            System.out.println("dime un numero");
            numero[i] = teclado.nextInt();
        }
    }
    

    static double getMedia(boolean xor) {
        int contadorP;
        int contadorN;
        int suma;
        suma = 0;
        contadorP = 0;
        contadorN = 0;
        if (xor == true){
        for (int n : numero) {
         if (n > 0){
         suma += n;
         contadorP++;
        }
        }
        return (double) suma / contadorP;
        } else {
            for (int n : numero) {
            if (n < 0){
            suma += n;
            contadorN++;
        }
        }
        return (double) suma / contadorN;
        }
    }
    public static void main(String[] args) {
        double mediaPositiva;
        double mediaNegativa;
        cargaNumeros();
        System.out.println(Arrays.toString(numero));
        
        mediaPositiva = getMedia(true);
        mediaNegativa = getMedia(false);
        System.out.printf("MediaPositiva = %s \n MediaNegativa = %s", mediaPositiva, mediaNegativa);
    }
}
