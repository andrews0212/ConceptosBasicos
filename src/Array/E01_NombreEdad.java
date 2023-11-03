package Array;

import java.util.Scanner;

public class E01_NombreEdad {
    static String[] Nombre = {"andrews", "pedro", "maria"};
    static int[] edad =  {12, 15, 14};
    static int getEdad(String nombre){
        
        for (int i = 0; i < Nombre.length; i++) {
            if(Nombre[i] == nombre){
                return edad[i];
            } 
        }
        System.out.println("desconocido");
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(getEdad("andrews"));
    }
}
