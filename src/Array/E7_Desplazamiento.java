package Array;

import java.util.Arrays;
import java.util.Scanner;

public class E7_Desplazamiento {

    static int[] tabla = new int[10];
    static Scanner teclado = new Scanner(System.in);

    static void Numeros(){
        int contador;
        contador = 0;
        while (contador < tabla.length - 2){
            System.out.println("dime un numero");
            tabla[contador] = teclado.nextInt();
            contador++;
        }
    }
    static int[] NumeroPosicion(int numero, int posicion) {
        int[] tablaN = new int[10];
        tablaN[posicion] = numero;
        for (int i = tabla.length - 1; i >= 0; i--) {
            if (i > posicion)
                tablaN[i] = tabla[i];
            else if (i != 0 && i <= posicion)
                tablaN[i - 1] = tabla[i];
            else
                tablaN[tablaN.length - 1] = tabla[i];
        }
        return tablaN;
    }

    public static void main(String[] args){
        System.out.println(tabla.length);
        Numeros();
        System.out.println(Arrays.toString(tabla));
        System.out.println(Arrays.toString(NumeroPosicion(2, 5)));
    }

}
