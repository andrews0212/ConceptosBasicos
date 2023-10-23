package ConceptosBasicos;
import java.util.Scanner;

public class E1d7_Kilometraje {
/*
 * kilometrajeU = 20km
 * kilometrajeA = 30km
 * kilometrosR = 10km
 * litros ul = 20l
 * litros ac = 10l
 * litrosC = 10l
 * kilometrosR === litrosC
 * 100km    === x
*/
    public static void main(String[] args){
    double kilometrajeU, kilometrajeA, litrosU, litrosA, kilometrosR, litrosC, cienKilometroL;
    Scanner teclado = new Scanner(System.in);
    System.out.println("dime el kilometraje de la ultima vez");
    kilometrajeU = teclado.nextDouble();
    System.out.println("dime el kilometraje actual");
    kilometrajeA = teclado.nextDouble();
    System.out.println("dime los litros de la ultima vez");
    litrosU = teclado.nextDouble();
    System.out.println("dime los litros actuales");
    litrosA = teclado.nextDouble();
    //operacion
    kilometrosR = (double) kilometrajeA - kilometrajeU;
    litrosC = (double) litrosU - litrosA;
    cienKilometroL = (double) 100 * litrosC / kilometrosR;
    System.out.println("cada cien kilometros consume " + cienKilometroL);
    }


    
}
