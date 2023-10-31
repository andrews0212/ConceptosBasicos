package Examen1;

public class Formas {
    static void getTriangulo(int longitud){
        for (int c = 0; c < longitud; c++) {

            for (int f1 = 0; f1 <= longitud - c - 1; f1++) {
                System.out.print(" ");
                
            }
            for (int f2 = c; f2 > 0 ; f2--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void getTrianguloInv(int longitud){
        for (int c = 0; c < longitud; c++) {
            // Imprimir espacios en blanco antes de los asteriscos
            for (int f1 = 0; f1 < c; f1++) {
                System.out.print(" ");
            }
            
            // Imprimir asteriscos
            for (int f2 = longitud - c; f2 > 0; f2--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void getTrianguloRectanguloInv(int longitud){
        for (int c = 1; c <= longitud; c++){
            for (int f = 0; f < c; f++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void getTrianguloRectangulo(int longitud){
        for (int c = longitud; c > 0; c--) {
            for (int f = 0; f < c; f++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        getTriangulo(10);
       getTrianguloInv(10);
      
    }
}
