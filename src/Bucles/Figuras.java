package Bucles;

public class Figuras {

    public static void cuadrado(){
        int longitud = 7;
        for (int c = 1; c <= longitud; c++){
            for (int f = 1; f <= longitud; f++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void semiTriangulo(){
        int logitud = 7;
        for (int c = 1; c <= logitud; c++){
            for (int f = 1; f <= c; f++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void semiTrianguloContrario(){
        int logitud = 7;
        for (int c = logitud; c >= 1; c--){
            for (int f = c; f >= 1; f--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void semiTrianguloInv(){
        int logitud = 7;
        for (int c = 1; c <= logitud; c++){
            for (int f = 1; f <= logitud; f++) {
                if (c + f >= 8){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    public static void diamante() {
        int logitud = 10;
        for (int c = 1; c <= 5; c++) {
            for (int f = 1; f <= logitud; f++) {
                if ((f + c == 6 || c == 5) || (f - c == 5) || (f + c == 7 || f - c == 4) || (f + c == 8 && c != 1) || (f - c == 3 && c != 1) || (f + c == 9 && c != 1) || (f - c == 2 && c != 1)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diamanteInv() {
        int logitud = 10;
        for (int c = 5; c >= 1; c--) {
            for (int f = 1; f <= logitud; f++) {
                if ((f + c == 6 || c == 5) || (f - c == 5) || (f + c == 7 || f - c == 4) || (f + c == 8 && c != 1) || (f - c == 3 && c != 1) || (f + c == 9 && c != 1) || (f - c == 2 && c != 1)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
    diamante();
    diamanteInv();
    }
}
