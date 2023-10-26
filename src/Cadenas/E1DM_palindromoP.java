package Cadenas;

public class E1DM_palindromoP {
    static boolean esPalindromo(String cadena){
        cadena = cadena.toLowerCase();
        boolean Palindromo = true;
        for (int i = 0; i < cadena.length() / 2; i++) {
           
            if (cadena.charAt(i) != cadena.charAt(cadena.length() - i - 1)){
               Palindromo = false;
            } 
        }
        return Palindromo;
        
    }
    public static void main(String[] args) {
        
    }
}
