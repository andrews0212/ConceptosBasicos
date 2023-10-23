package ConceptosBasicos;
import java.util.Scanner;

public class E1d8_Edades3 {
    public static void main(String[] args){
        int media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("dime la edad");
        media =  teclado.nextInt();
        media += media;
        System.out.println("dime la edad");
        media =  teclado.nextInt();
        media += media;
        System.out.println("dime la edad");
        media =  teclado.nextInt();
        media += media;
        System.out.println("dime la edad");
        media =
        media += media;
        media =  media / 4;
        System.out.println("tu media es de " + media);
    }
}
