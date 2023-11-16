package arrayDimencionales;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class E1d8_Empresa {

    static int[][] caja;

    static final int DIA = 2;
    static final int MESES = 2;
    static Scanner teclado = new Scanner(System.in);
    
    static void entrada(){
        caja = new int[MESES][DIA];
        for (int f = 0; f < caja.length; f++) {
            System.out.println("mes " + (f + 1));
            for (int c = 0; c < caja[f].length; c++) {
                System.out.print("día " + (c + 1) + ":  ");

                caja[f][c] = teclado.nextInt();

            }
        }
    }
    static void visualizar(){
        caja = new int[][] {{1,2,3,4}, {1,2,3,4}};
        for (int f = 0; f < caja.length; f++) {
            System.out.println("mes " + (f + 1));
            for (int c = 0; c < caja[f].length; c++) {
                System.out.print("día " + (c + 1) + " :");

                System.out.println(caja[f][c]);

            }
        }
    }
  
    static void visualizarPorColumna(){
         caja = new int[][] {{1,2,3,4}, {2,5,7,14}};
        for (int d = 0; d < caja[0].length; d++) {
            System.out.println("dia " + (d + 1));
            for (int mes = 0; mes < caja.length; mes++) {
                System.out.print(getMes(mes) + " :");

                System.out.println(caja[mes][d]);

            }
        }
    }
    static String getMes(int m){
        return  Month.values()[m].getDisplayName(TextStyle.FULL, new Locale("es")).toString().toUpperCase();
    }
    public static void main(String[] args){
    visualizarPorColumna();
    System.out.println(Arrays.toString(caja));

    }
}
