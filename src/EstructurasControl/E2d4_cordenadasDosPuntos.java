package EstructurasControl;

public class E2d4_cordenadasDosPuntos {
    static void rectangulo(int x1, int x2, int y1, int y2) {
        int logitudHorizontal, logitudVertical, area;
        logitudHorizontal = x2 - x1;
        logitudVertical = y2 - y1;
        area = logitudHorizontal * logitudVertical;
        if (logitudHorizontal == logitudVertical) {
            System.out.println("es un cuadrado");
        } else {
            System.out.println("es un rectangulo");
        }
        System.out.println("el area es de " + area );
    }

    public static void main(String[] args){
        rectangulo(10, 20 ,10 ,20);

    }


}
