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
     * @param cadena colocamos la cadena que queremos que se busque
     * @param caracter colocamos el caracter que queremos buscar
     * @return devuelve un true o false, dependiendo de si consigue el caracter o no
     * 
     */
    static boolean getCaracter(String cadena, char caracter){
       return (cadena.indexOf(caracter) > 0);
        
    }
    /*
     * busca dentro de una cadena de caracteres una letra y dice si aparace
     * @param cadena colocamos la cadena que queremos que se busque
     * @param caracter colocamos el caracter que queremos buscar
     * @param logitud la logitud de la cadena de donde va a EMPEZAR a buscar
     * @return devuelve un true o false, dependiendo de si consigue el caracter o no
     * 
     */
    static boolean getCaracter(String cadena, char caracter, int logitud){
       return (cadena.indexOf(caracter, logitud) > 0);
        
    }
    /*
     * Comprueba si la cadena supera la logitud maxima prestablecida por parametro
     * @param MAX numero maximo de logitud
     * @param cadena introduccion de la cadena
     * @return comprobacion si la logitud de la cadena es mayor que el MAX
     */
    static boolean getCaracterMAY(int MAX, String cadena){
        return (cadena.length() > MAX);
    }

    /*
     * devuelve las caracteres de la cadena que comienzan desde numeroMin a numeroMax
     * @param numeroMin coloca el numero de la longitud donde comienza
     * @param numeroMax coloca el numero de la longitud donde acaba
     * @param cadena la cadena que queremos coger dicho pedaso de caracteres
     * @return devuelve el String con la cadena desde numeroMin a numeroMax
     */
    static String getCrearCadena(int numeroMin, int numeroMax, String cadena){
        return cadena.substring(numeroMin, numeroMax);
    }
    /*
     * devuelve los ultimos digitos que introduzca de una cadena de caracteres
     * @param numeroCaracteres Ultimos caracteres
     * @param cadena esta sera de donde se van a obtener los ultimos caracteres
     * @return aqui devolveremos el String con los ultimos caracteres
     * 
     */
    static String getCrearCadena(int numeroCaracteres, String cadena){
        return cadena.substring((cadena.length() - numeroCaracteres), cadena.length());
    }

    /*
     * comparador de cadenas de caracteres
     * @param cadena1   cadena1 que vamos a comparar
     * @param cadena2   cadena2 que vamos a comparar
     * @return devuelve un true si la cadena es igual y un false si la cadena no es igual
     */
    static boolean getCadenaIgual(String cadena1, String cadena2){
        return (cadena1.equals(cadena2));
    }
    static Integer getIntString(String cadena){
        if (cadena.matches("[a-zA-Z]+")){
            System.out.println("No se puede convertir porque tiene caracteres");
        } else {
            return Integer.parseInt(cadena);
        }
        return null;
    }
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("dime la cadena de caracter");
        String caracteres = teclado.nextLine();
        System.out.println(getIntString(caracteres));
    }
}
