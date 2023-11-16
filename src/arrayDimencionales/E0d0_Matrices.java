package arrayDimencionales;

import java.util.Arrays;

public class E0d0_Matrices {

    static void matrizes() {
        int[][] matriz = {{1,2,3,4,5,6}, {1,2,3}};
       // matriz = new int[2][];
       for (int f = 0 ; f < matriz.length; f++){
            for (int c = 0; c < matriz[f].length; c++){
                System.out.print(matriz[f][c]);
            }
            System.out.println();
       }
       for(int[] vector : matriz){
       // System.out.println(Arrays.toString(vector));
        for (int e : vector) {
            System.out.print(e);
        }
        System.err.println();
       }
    }
    
    public static void main(String[] args){
        matrizes();
    }
}
