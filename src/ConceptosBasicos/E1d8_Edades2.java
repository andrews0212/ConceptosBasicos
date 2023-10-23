package ConceptosBasicos;
import java.util.Scanner;

public class E1d8_Edades2 {
    public static void main(String[] args){
        int edad, media = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("dime la edad");
        edad = teclado.nextInt();
        media += edad;
        System.out.println("dime la edad");
        edad = teclado.nextInt();
        media += edad;
        System.out.println("dime la edad");
        edad = teclado.nextInt();
        media += edad;
        System.out.println("dime la edad");
        edad = teclado.nextInt();
        media += edad;
        media = media / 4;
        System.out.println("la media es de " + media);

        
    }
}
