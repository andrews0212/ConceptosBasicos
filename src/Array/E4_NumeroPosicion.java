package Array;

import java.util.Arrays;
import java.util.Scanner;

public class E4_NumeroPosicion {
    static Scanner teclado = new Scanner(System.in);
    static int[] numeros;
    
    static int[] getNumero(int n) {

        numeros = new int[] {1,2,3,4,5,6,7,8,9,10};
        int i;
        i = 0;
        int valor;
    //    while (i < numeros.length) {
    //    System.out.println("dime un numero");
    //    numeros[i] = teclado.nextInt();
          
    //    i++;
    //    }
       return numeros; 
    }
    static int[] getVisualizacion() {
        int[] visualizacion;
        visualizacion = new int[numeros.length];
        
        for (int ubicacion = 0, valoresNumeros = 0, valoresNumDevuelta= numeros.length - 1; ubicacion < visualizacion.length; ubicacion++) {
            
            if (ubicacion % 2 == 0){
            visualizacion[ubicacion] = numeros[valoresNumeros];
            valoresNumeros++;
            } else {
            visualizacion[ubicacion] = numeros[valoresNumDevuelta];
            valoresNumDevuelta--;
            }
            
        
        }
           return visualizacion;
        }
        
    

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNumero(10)));
        System.out.println(Arrays.toString(getVisualizacion()));
    }
}
