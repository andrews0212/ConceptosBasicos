package metodos;

public class E1_FechaCorrecta {
    static boolean getBisiesto(int anio){
        return ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0));
    }
    static boolean getFechaCorrecta(int dia, int mes, int anio){
        if (dia < 1){
            return false;
        }
        switch (mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (dia <= 31) {
                    return true;
                } else {
                    return false;
                }
            case 4: case 6: case 9: case 11:
                if (dia <= 30) {
                    return true;
                } else {
                    return false;
                }
            case 2:
                if (getBisiesto(anio) && dia <= 29){
                    return true;
                } else if (dia <= 28){
                    return true;
                } else{
                    return false;
                }
        }
        return false;
    }

    public static void main(String[] args){
    System.out.print(getFechaCorrecta(31,4,2001));
    }
}
