package ConceptosBasicos;
import java.util.Scanner;

public class EJ1d4_asignatura {
    /*
     * Total alumno = 100%
     * D = x
     * 
     * (D*100) / total alumno = x
     * 
     */
    public static void main(String[] args){
        int suspensos, suficientes, notables, sobresaliente;
        int totalAlumno, totalAprobado;
        double porcentajeAprobados;
        double porcentajeNotable;
        double porcertajeSobresaliente;
        Scanner teclado = new Scanner(System.in);
        System.out.println("dime la cantidad de suspensos");
        suspensos = teclado.nextInt();
        System.out.println("dime la cantidad de suficiente");
        suficientes = teclado.nextInt();
        System.out.println("dime la cantidad de notables");
        notables = teclado.nextInt();
        System.out.println("dime la cantidad de sobresaliente");
        sobresaliente = teclado.nextInt();
        totalAlumno = suspensos + suficientes + notables + sobresaliente;
        totalAprobado = suficientes + notables + sobresaliente;
        porcentajeAprobados = (double) totalAprobado * 100 / totalAlumno;
        porcentajeNotable = (double) notables * 100 / totalAlumno;
        porcertajeSobresaliente = (double) sobresaliente * 100 / totalAlumno;
        System.out.println("el porcentajes de aprobados es " + porcentajeAprobados);
        System.out.println("el porcentajes de notables es " + porcentajeNotable);
        System.out.println("el porcentajes de sobresaliente es " + porcertajeSobresaliente);
    }
}
