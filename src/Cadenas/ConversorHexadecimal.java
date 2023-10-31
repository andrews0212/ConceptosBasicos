package Cadenas;

public class ConversorHexadecimal {
    static String getHexaDecimal2(int numero){
        String DIGITOS = "0123456789ABCDEF";
        int restos;
        String hexadecimal = "";
        char letras;
         while (numero > 0){
            restos = numero % 16;
            numero = numero / 16;
            letras = DIGITOS.charAt(restos);
            hexadecimal = letras + hexadecimal;  
         }
         return hexadecimal;
    }

    static String getHexaDecimal(int numero, int base){
    String hexadecimal = "";
    int restos;
    String letra;
    
    while (numero > 0){
    restos = numero % base;
    numero = numero / base;

    switch (restos){
        case 10 -> letra = "A";
        case 11 -> letra = "B";
        case 12 -> letra = "C";
        case 13 -> letra = "D";
        case 14 -> letra = "E";
        case 15 -> letra = "F";
        default ->  letra = "" + restos;      
    }
    hexadecimal =  letra + hexadecimal;
    }
    return hexadecimal;
    }

    public static void main(String[] args) {
        System.out.println(getHexaDecimal2(123));
    }
    
}

// hay metodos que sirver para hacer las conversiones
   //  System.out.println(Integer.toHexString(123));
    // System.out.println(Integer.toString(123, 16));