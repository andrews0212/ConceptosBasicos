package ConceptosBasicos;
import java.util.Scanner;

public class E1d10_Cordenadas {
    public static void main(String[] args){
        int x,y, area;
        Scanner teclado = new Scanner(System.in);
        System.out.println("dime valor de x");
        x = teclado.nextInt();
        System.out.println("dime el valor de Y");
        y = teclado.nextInt();
        area = x * y;
        System.out.println("La area del rectangulo es " + area);
    }
}
