package ConceptosBasicos;
import java.util.Scanner;

public class E1d5_Climatologia2 {

    /*
     * 10mm === 1cm
     * D ====== x
     * 
     * 1P  ====  25.5
     * D       ===== x
     */
    public static void main(String[] args){
        double mm, pulgada, centimetro;
        Scanner teclado = new Scanner(System.in);
        pulgada = teclado.nextDouble();
        mm = (double) pulgada * 25.5;
        centimetro = (double) mm / 10;
        centimetro = (double) Math.round(centimetro * 100) / 100;
        System.out.println(" en centimetro es " + centimetro);
        }
}
