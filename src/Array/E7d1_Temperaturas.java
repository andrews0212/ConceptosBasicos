package Array;

import java.util.Arrays;
import java.util.Random;

public class E7d1_Temperaturas {
    static int[] temperaturasMeses = new int[12];

    
    static void llenarArray(int[] temp){
        Random numeroRandom = new Random();
        boolean xor;
        int d;
        for (int i = 0; i < temp.length; i++) {
            d = 0;
            temp[i] = numeroRandom.nextInt(0,40);
            do{
            xor = false;
            temp[i] = numeroRandom.nextInt(0,40);
            for (int j = 0; j < i && i > 1 && xor == false; j++)
            if (temp[j] == temp[i]){
                xor = true;
            }
        }while(xor);
        }
    }
   
    static void ContenidoArrray(int[] temp){
        System.out.println(Arrays.toString(temp));
    }
    static void ContenidoArrrayInv(int[] temp){
        System.out.print("[");
        for (int i = temp.length - 1; i >= 0; i--) {
            System.out.print( temp[i] + " ");
        }
        System.out.println("]");
    }
    // segunda parte

    static double calcularMedia(int[] temp){
        int suma;
        suma = 0;
        for (int i : temp) {
            suma += i;
        }
        return (double) suma / temp.length;

    }
    static void getMayortemperatura(int[] temp){
        System.out.println("Meses con mas de 30 grados");
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > 30){
                System.out.println("Mes:"+ (i + 1));
            }
        }
    }
    static boolean TemperaturaMayor(int[] temp){
        for (int i : temp) {
            if (i > 30){
                return true;
            }
        }
        return false;
    }
    static boolean temperaturaMenor(int[] temp){
        int i;
        i = 0;
        boolean xor;
        xor = false;
        while ( i < temp.length && !xor){
            if (temp[i] < 30){
                xor = true;
            }
            i++;
        }
        return xor;
    }
    static boolean repetidas(int[] temp){
        for (int i = 0; i < temp.length - 1; i++) {
           if (temp[i] == temp[i + 1]){
            return true;
           }
        }
        return false;
    }
    public static void main(String[] args) {
        llenarArray(temperaturasMeses);
        ContenidoArrray(temperaturasMeses);
        ContenidoArrrayInv(temperaturasMeses);
        System.out.println("La media de la temperatura es de " + calcularMedia(temperaturasMeses));
        getMayortemperatura(temperaturasMeses);
        System.out.println(TemperaturaMayor(temperaturasMeses));
        System.out.println(temperaturaMenor(temperaturasMeses));
        System.out.println(repetidas(temperaturasMeses));
    }

}
