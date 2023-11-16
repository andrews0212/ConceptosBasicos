package arrayDimencionales;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class D1d8_Empresa2 {

    static final int DIA = 3;
    static final int MES = 2;
    static int[][] caja;
    static int[][] dia;
    static Random rdm = new Random();

    static void llenar(int[][] caja){
        for (int m = 0; m < caja.length; m++) {
            for (int d = 0; d < caja[m].length; d++) {
                caja[m][d] = rdm.nextInt(101); // Genera un número aleatorio entre 0 y 100
            }
        }
    }
    static String getMes(int m){
        return  Month.values()[m].getDisplayName(TextStyle.FULL, new Locale("es")).toString().toUpperCase();
    }

    static void mostrar(int[][] caja){
        for (int i = 0; i < caja.length; i++) {
            System.out.println(getMes(i));
            for (int j = 0; j < caja[i].length; j++) {
                System.out.print(caja[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[] getTotalMes(int[][] array){
        int logitud = array.length;
        int[] mes = new int[logitud];
        int suma;
       
            for (int f = 0; f < array.length; f++) {
                 suma = 0;
                for (int c = 0; c < array[f].length; c++) {
                    suma += array[f][c];
                }
                mes[f] = suma;
     
        }
        return mes;
    }
    static int getTotalAnual(){
        int suma = 0;
        for (int i = 0; i < caja.length; i++) {
            for (int j = 0; j < caja[i].length; j++) {
                suma += caja[i][j];
            }
        }
        return suma;
    }
    static void diaMesMejor(){
        int numero;
        int posicionC;
        int posicionF;
        posicionF = 0;
        numero = caja[0][0];
        for (int i = 0; i < caja.length; i++) {
            for (int j = 0; j < caja[i].length; j++) {
                if (caja[i][j] > numero){
                    numero = caja[i][j];
                    posicionF = j;
                }
            }
            System.out.println(getMes(i) + " del dia " + (posicionF + 1) + " Tiene la mejor caja con : " + caja[i][posicionF]);
            numero = caja[i][0];
        }
        
    }
    static int mesMejor(){
        int mes;
        mes = -1;
        int mejorCaja = caja[0][0];
        for (int i = 0; i < caja.length; i++) {
            for (int j = 0; j < caja[i].length; j++) {
                if (caja[i][j] > mejorCaja) 
                mejorCaja = caja[i][j];
                mes = i;
            }
        }
        return mes;
    }
    static void ordenamiento(){
        dia = new int[MES][DIA];
        int aux;
        int aux2;
        for (int i = 0; i < dia.length; i++) {
            for (int j = 0; j < caja [i].length; j++) {
                dia[i][j] = j + 1;
            }
        }
        
        for (int i = 0; i < caja.length; i++) {
            for (int j = 0; j < caja[i].length - 1 ; j++) {
                while (caja[i][j] > caja[i][j + 1]){
                    aux = caja[i][j];
                    aux2 = dia[i][j];
                    caja[i][j] = caja[i][j + 1];
                    dia[i][j] = dia[i][j + 1];
                    dia[i][j] = aux;
                    caja[i][j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args){
        caja = new int[MES][DIA]; // Inicializa el array caja
        llenar(caja);
        mostrar(caja);
        ordenamiento();
        mostrar(caja);
       
    }
}
