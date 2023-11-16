package Array;

import java.util.Arrays;
import java.util.Iterator;
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
    // metodo mio 
    static void ordenacio(int[] temp) {
    	int menor;
    	int t;
    	for (int j = 0; j < temp.length - 1; j++) {
    	menor = j;
    	for (int i = j + 1; i < temp.length; i++) {
    		if (temp[i] < temp[menor]) {
    			menor = i;
    		}
    				
    	}
    	t = temp[j];
    	temp[j] = temp[menor];
    	temp[menor] = t;
    	}
    }
    // tercera parte
    
    static void llenar(int[] array) {
    	Random numeroAleatorio = new Random();
    	for (int i = 0 ; i < array.length; i++) {
    		if (i == 0 || i == 1 || i == 2 || i == 11 || i == 10) {
    			array[i] = numeroAleatorio.nextInt(-10, 20);
    			
    		} else {
    			array[i] = numeroAleatorio.nextInt(10, 40);
    		}
    	}
    }
    static void meses(int[] array) {
    	for (int i = 0 ; i < array.length; i++) {
    		
    	}
    }
    
    public static void main(String[] args) {
        llenar(temperaturasMeses);
        System.out.println(Arrays.toString(temperaturasMeses));
    }

}
