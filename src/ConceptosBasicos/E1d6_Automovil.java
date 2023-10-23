package ConceptosBasicos;
import java.util.Scanner;

public class E1d6_Automovil {

    public static void main(String[] args){
        double costeComprador, costeFabrica;
        final double porcentajeGanacia = 10;
        final double ImpuestoAplicables = 20;
        Scanner teclado = new Scanner(System.in);
        System.out.println("dime el coste de fabrica");
        costeFabrica = teclado.nextDouble();
        costeFabrica = (double) costeFabrica + (costeFabrica / 100 * porcentajeGanacia);
        costeComprador = (double) costeFabrica + (costeFabrica / 100 * ImpuestoAplicables);
        System.out.println("el coste de fabrica es de " + costeFabrica);
        System.out.println("el coste de comprador es de " + costeComprador);

    }
}