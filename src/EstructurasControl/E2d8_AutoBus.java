package EstructurasControl;

public class E2d8_AutoBus {
    public static void main(String[] args) {
        int dia, hora;
        dia = 4;
        hora = 11;

      if (dia == 7) {
            System.out.println("tienes un bus");
        } else if ((dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6) && hora == 10) {
            System.out.println("tienes un bus");
        } else if ((dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5) && hora == 14 && dia != 6) {
            System.out.println("tienes un bus");
        } else if (dia == 4 && hora == 12){
            System.out.println("tienes un bus");
        }else {
            System.out.println("no hay bus");
        }

    }
}
