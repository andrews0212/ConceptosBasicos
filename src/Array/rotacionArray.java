package Array;

import java.util.Arrays;

public class rotacionArray {


    static void dezplazar(int numero, int[] array){
        int f;
        f = array[0];
        if (!(numero >= array.length)) {
            for (int i = 0; i < array.length - numero; i++) {

                array[i] = array[i + numero];

            }
            array[array.length -1] = f;
        } else {
            System.out.println("no se puede rotar porque el numero es mayor que la longitud");
        }


    }
    public static void main(String[] args){

        int numeros[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(numeros)  + " " + numeros.toString());
        dezplazar(9, numeros);
        System.out.print(Arrays.toString(numeros) + " " + numeros.toString());

    }
}
