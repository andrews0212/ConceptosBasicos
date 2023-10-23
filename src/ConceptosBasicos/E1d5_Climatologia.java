package ConceptosBasicos;

import java.util.Scanner;

public class E1d5_Climatologia {
    public static void main(String[] args){
        double cersius, coversion;
        Scanner teclado = new Scanner(System.in);
        cersius = teclado.nextDouble();
        coversion = (double) 9/5 * cersius + 32;
        coversion = (double) Math.round(coversion * 100) / 100;
        System.out.println("El resultado a farenger es " + coversion);
    }
}
