package Array;

import java.util.Arrays;

public class E5_MezclaTablas {
                        
    static int[] tablaA = {1,2,3,4,5,6,7,8,9,10,11,12};
    static int[] tablaB = {13,14,15,16,17,18,19,20,21,22,23,24};
    static int[] tablaC = new int[24];

    static void visualizar(){
                
        int j = 0;
        int incremento= 0;
       
        for(int i = 0 ; i < tablaC.length;) {

            for(int a = 0; a < 3; a++) {
                tablaC[i] = tablaA[j + a];
                i++;
            }

            for(int a = 0; a <3; a++) {
                tablaC[i] = tablaB[j + a]; //  El numero es igual a j (El numero total + a)
                i++;
            }
            j += 3;
        }
        }
        static void visualizar2(){
            int i = 0;
            int j = 0;
            while(i < tablaC.length){

                for (int a = 0; a < 3; a++) {
                    tablaC[i] = tablaA[j+a];
                    i++;
                }
                for (int a = 0; a < 3; a++){
                    tablaC[i] = tablaB[j+a];
                    i++;
                }

                j += 3;



            }
        }
    
      
 
        // [1, 2, 3, 13, 14, 15, 4, 5, 6, 16, 17, 18, 7, 8, 9, 19, 20, 21, 10, 11, 12, 22, 23, 24]
    public static void main(String[] args){
        visualizar2();
        System.out.println(Arrays.toString(tablaC));
    }
}
