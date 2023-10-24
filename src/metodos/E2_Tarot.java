package metodos;

public class E2_Tarot {
    /*
    Calcular el número del tarot de una persona a partir de la fecha de su nacimiento. El cálculo consiste en sumar el día, mes y año;
    del resultado obtenido se suman sus dígitos y así sucesivamente hasta reducir a un sólo dígito. Antes de hacer los cálculos debes comprobar
    que la fecha introducida es correcta: día, mes y año.
     */
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

    static int getSumaDigitos(int numero){
        int suma;
        suma = 0;
        while (numero > 0){
            suma += numero % 10;
            numero = numero / 10;

        }
        return suma;
    }
    static int tarot(int dia, int mes, int anio){
        int suma;
        suma = 0;
        if (getFechaCorrecta(dia, mes, anio)){
            suma = dia + mes + anio;
            while (suma > 9) {
                suma = getSumaDigitos(suma);
            }
             return suma;
        }
        return -1;
       
    }
    public static void main(String[] args){
        System.out.println(tarot(2,12,2002));
    }
}
