package EstructurasControl;


public class E2d7_AnioBisiesto {

    static boolean getBisiesto(int anio){
       return ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0));
    }
    public static void main(String[] args){
        System.out.println(getBisiesto(2001));
    }
}
