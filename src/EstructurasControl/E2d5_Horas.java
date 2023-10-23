package EstructurasControl;

public class E2d5_Horas {

    static boolean getHoraCorrecta(int h, int m, int s){
        if (s > 59){
            return false;
        } else if (m > 59) {
            return false;
        } else if (h > 23){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(getHoraCorrecta(2,50,80));
    }
}
