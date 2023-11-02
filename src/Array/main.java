package Array;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        int l;
        l = 10;
        int notas[];//crea un array de 5 componentes o sino se pone -> new int[]{}
        notas=new int[] {1,2,3};
        for (int i = 0; i < notas.length; i++){
            notas[i]++; // con un for normal asi se modifica el conenido del array
                        // enc cambio si lo hacemos en un foresch y modificamos n no se cambiria el valor del componentes
            System.out.println(notas[i]);
        }
        //System.out.println(Arrays.toString(notas));
        /*
         * foresch
         * en cada iteracion coje un valor
         * en un array va cojiendo valores del array hasta sin limitar principiio y fin
         * for (int n:notas){
         * System.out.print(notas)
         * }
         * 
         * 
         * 
         * 
         */
    }
   
    
}
