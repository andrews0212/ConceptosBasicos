package Array;

import java.util.Arrays;

public class inverso {
    static int[] c = {1,2,3};
    public static void main(String[] args) {
        int j;
        for (int i = 0, d = c.length -1 ; i < d; i++, d--) {
            j = c[i];
            c[i] = c[d];
            c[d] = j;
        }
        System.out.println(Arrays.toString(c));
    }
}
