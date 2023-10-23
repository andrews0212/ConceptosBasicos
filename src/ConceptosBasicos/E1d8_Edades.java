package ConceptosBasicos;

import java.util.Scanner;

public class E1d8_Edades{
    public static void main(String[] args){
        int edad1, edad2, edad3, edad4;
        double media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("dime la edad 1");
        edad1 = teclado.nextInt();
        System.out.println("dime la edad 2");
        edad2 = teclado.nextInt();
        System.out.println("dime la edad 3");
        edad3 = teclado.nextInt();
        System.out.println("dime la edad 4");
        edad4 = teclado.nextInt();
        media = (double) (edad1 + edad2 + edad3 + edad4) / 4;
        System.out.println("tienes una media de " + media);
    }
}