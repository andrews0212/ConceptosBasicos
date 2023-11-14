package Array;

import java.util.Arrays;
import java.util.Random;

public class E4d0_NumeroBolas {
    
    static int[] contador = new int[10];            // contado = longitud = 10 0 / 9
    static int[] bolas = {1,2,3,4,5,6,7,8,9,10};
    
    static void bolasExtraidas(){
        Random r = new Random();
        int n = r.nextInt(100) + 1;
        int bolaRandom;
       
        for (int i = 0 ; i <= n; i++){
            bolaRandom = r.nextInt(10) + 1;
             contador[bolaRandom - 1] +=1;
            
            }

    }

    static int MayorBolas(int[] contador, int[] bolas){
        int mayor = 0;  // Inicializa el mayor con el primer valor de contador
        int numeroMayor = 0; // Inicializa el númeroMayor con el primer número de bola
        
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] > mayor) {
                mayor = contador[i];
                numeroMayor = bolas[i]; // Actualiza el númeroMayor con el número de bola correspondiente
            }
        }
        return numeroMayor;
    }

    static int MenorBolas (int[] contador, int[] bolas){
        int menor = 900;
        int menorNumero = 10;

        for (int i = 0; i < contador.length; i++) {
            if (contador[i] < menor){
                menor = contador[i];
                menorNumero = bolas[i];
            }
        }
        return menorNumero;
    }

    public static void main(String[] args){
    bolasExtraidas();
    System.out.println(Arrays.toString(contador));
    System.out.println("El numeor de bola que mas se repite es " + MayorBolas(contador, bolas));
    System.out.println("El numero de bola que menos se repite es " + MenorBolas(contador, bolas));
    
}
}
