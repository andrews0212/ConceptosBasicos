package Cadenas;

import java.util.Scanner;

public class E4d1_cadenasDatos {

    /*
     * Esto lo que hace es pasar una cadena de caracteles en mayusculas
     * @param caracter caracter que queremos pasar a mayusculas
     * @return caracter devuelve el caracter en mayusculas
     * 
     */
    static String getMay(String caracter){   
        return caracter.toUpperCase();
    }
    /*
     * Esto lo que hace es covertir toda una cadena de caracteres en minusculas
     * @param caracter cadena que queremos convertir
     * @return cadenas convertida
     */
    static String getMin(String caracter){
        return caracter.toLowerCase();
    }
    /*
     * busca dentro de una cadena de caracteres una letra y dice si aparace
     * @param caracter colocamos el caracter que queremos buscar
     * @return devuelve true o false
     * 
     */
    /*
    static boolean getCaracter(char caracter){
        
    } */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("dime la cadena de caracter");
        String caracteres = teclado.nextLine();
        System.out.println(getMay(caracteres));
        System.out.println(getMin(caracteres));
    }
}
