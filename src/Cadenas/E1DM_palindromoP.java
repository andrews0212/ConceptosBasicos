package Cadenas;

public class E1DM_palindromoP {
    static boolean esPalindromo2(String cadena){
        cadena.toLowerCase();
        boolean Palindromo = true;

        for (int d = 0, i = cadena.length() - 1; d < i; d++, i--) {

            while (!Character.isLetter(cadena.charAt(d))){
                d++;
            }
            while (!Character.isLetter(cadena.charAt(i))){
                i--;
            }

             if (cadena.charAt(i) != cadena.charAt(d)){
               Palindromo = false;
            }
            
        }
        
        return Palindromo;

    }

    static boolean esPalindromoP(String cadena){
        StringBuilder sb = new StringBuilder(cadena);
        sb.reverse();
        return cadena.equals(sb.toString());

    }

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
        System.out.println(esPalindromo2("o?s?a"));
    }
}
