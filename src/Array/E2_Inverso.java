package Array;

import java.util.Arrays;

public class E2_Inverso {
    static void InvierteVector(int[] numero){
        int t;
        for (int i = 0, d = numero.length - 1; i < numero.length / 2; i++, d--) {
            t = numero[i];
            numero[i] = numero[d];
            numero[d] = t;

        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        InvierteVector(array);
        System.out.println(Arrays.toString(array));
    }
}
