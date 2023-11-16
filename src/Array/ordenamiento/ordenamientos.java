package Array.ordenamiento;

import java.util.Arrays;

public class ordenamientos {

    static int[] arrayNumeros = {35,50,30,12,23};

    static void burbuja(){
        int aux;
        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayNumeros.length - 1; j++) {
                if (arrayNumeros[j] > arrayNumeros[j + 1]){
                    aux = arrayNumeros[j];
                    arrayNumeros[j] = arrayNumeros[j + 1];
                    arrayNumeros[j+1] = aux;
                    System.out.println(Arrays.toString(arrayNumeros));
                }
            }
        }
    }
    static void insercion(){
        int aux;
        int d;
        for (int i = 1; i < arrayNumeros.length; i++) {
            aux = arrayNumeros[i];
            d = i - 1;
            while (d>=0 && arrayNumeros[d] > aux) {
                arrayNumeros[d + 1] = arrayNumeros[d];
                d--;
            }
            arrayNumeros[d + 1] = aux;
        }
    }
    static void insepcion2(){
        int pos;
        int aux;
        for (int i = 0; i < arrayNumeros.length; i++) {
            pos  = i;
            aux = arrayNumeros[i];
            while ( pos > 0 && arrayNumeros[pos -1] > aux){
                arrayNumeros[pos] = arrayNumeros[pos - 1];
                pos--;
            }
            arrayNumeros[pos] =aux;
        }
    }





    public static void main(String[] args) {
        burbuja();
        System.out.println(Arrays.toString(arrayNumeros));
    }
}
