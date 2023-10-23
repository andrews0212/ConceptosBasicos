package EstructurasControl;

import java.util.Scanner;

public class E2d6_SistemaEcuacion {

    static int getCalcularValor(int a, int b, int c, int d, int e, int f, char desicion){
        int x, y;

        x = ((c*e) - (b*f)) / ((a*e) - (b*d));
        y = ((a*f) - (c*d)) / ((a*e) - (b*d));
        if (desicion == 'x')   {
            return x;
        } else if (desicion == 'y'){
            return y;
        }
        return 0;
    }

    public static void main(String[] args){
        int a, b,c,d,e,f;
        char desicion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("dime los valores de a,b,c,d,e,f con espacio entre ellos");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();
        e = teclado.nextInt();
        f = teclado.nextInt();
        System.out.println("quieres hacer la formula de x o de y");
        desicion = teclado.next().charAt(0);
        System.out.println(getCalcularValor(a,b,c,d,e,f,desicion));
    }
}
