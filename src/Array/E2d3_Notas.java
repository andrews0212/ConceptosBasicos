package Array;

import java.util.Scanner;

public class E2d3_Notas {


    public static void main(String[] args) {
        int nota;
        Scanner teclado = new Scanner(System.in);
        int f1,f2,f3,f4,f5,f6,f7,f8,f9,f10;
        f1 = f2 = f3 = f4 = f5 = f6 = f7 = f8 = f9 = f10 = 0;
        do {
            System.out.println("dime una nota");
            nota = teclado.nextInt();
            switch (nota){
                case 1: f1++; break;
                case 2: f2++; break;
                case 3: f3++; break;
                case 4:f4++; break;
                case 5:f5++;break;
                case 6:f6++;break;
                case 7:f7++;break;
                case 8:f8++;break;
                case 9:f9++;break;
                case 10: f10++; break;
                default: break;

            }
        } while(nota <= 10 && nota > 0);
        System.out.println(f1 + "" + f2 + "" +f3 + "" + f4+ "" +f5+ "" +f6+ "" +f7+ "" +f8+ "" +f9+ "" +f10);
    }


}
