package EstructurasControl;

public class E2d3_Nota {
    static boolean getAprobado(int notaExamen, int notaTrabajoClase, int notaTrabajoPractico) {

        if (notaExamen >= 5) {
            return true;
        } else if ((notaExamen >= 4 && notaExamen <= 5) && (notaTrabajoClase > 5) && (notaTrabajoPractico > 5)) {
            return true;
        } else if ((notaExamen >= 4 && notaExamen <= 5) && (notaTrabajoPractico > 8 || notaTrabajoClase > 8)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(getAprobado(4,6,6));
    }

}
