package Array;

import java.util.Arrays;

public class E7_ArrayDesplazamiento {
    static int[] numeros = {1,2,3,4,5};
    static void desplazar(){
        int primero = numeros[0];

        for (int x = 0; x < numeros.length -1; x ++){
            numeros[x] = numeros[x + 1];
        }

        numeros[numeros.length -1 ] = primero;
        System.out.println(Arrays.toString(numeros));

    }

    public static void main(String[] args) {
    desplazar();
    }

}
