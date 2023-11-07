package Array;

import java.util.Arrays;
import java.util.Scanner;

public class E4_MezclarTablas {
    static Scanner teclado = new Scanner(System.in);
    static int[] tableA;
    static int[] tableB;

    static int[] getMezclatabla(int A, int B){
        tableA = new int[A];
        tableB = new int[B];
        int[] tableC = new int[A+B];
        System.out.println("Tabla A");
        for (int i = 0; i < tableA.length; i++) {
            System.out.println("dime un numero");
            tableA[i] = teclado.nextInt();
        }
        System.out.println("Tabla B");
        for(int i = 0; i < tableB.length; i++){
            System.out.println("dime un numero");
            tableB[i] = teclado.nextInt();
        }
        for(int i = 0, c = 0, d = 0; i < tableC.length; i++){
            if (i % 2 == 0){
                tableC[i] = tableA[c];
                System.out.println(c);
                c++;
            } else if ( i % 2 != 0){
                tableC[i] = tableB[d];
                System.out.println(d);
                d++;
            }
        }
        return tableC;
        // 1 2 3 4 5 6 7 8 9 10
        // 11 12 13 14 15 16 17 18 19 20
    }


    public static void main(String[] args){
        System.out.print(Arrays.toString(getMezclatabla(10, 10)));
    }
}
