package EstructurasControl;

public class E2d2_NumerosEnteros {
    static void NumerosEnteros(int numeroA, int numeroB, int numeroC){
        if (numeroA < 0 && numeroB < 0 && numeroC < 0){
            int producto = (numeroA * numeroB * numeroC);
            System.out.println(producto);
        } else if (numeroA < 0 || numeroB < 0 || numeroC < 0){
            int suma = (numeroA + numeroB + numeroC);
            System.out.println(suma);
        } else {
            int productoSuma = (numeroA * numeroB + numeroC);
            System.out.println(productoSuma);
        }
    }
    public static void main(String[] args){
        NumerosEnteros(10, 10, 10);
    }
}
