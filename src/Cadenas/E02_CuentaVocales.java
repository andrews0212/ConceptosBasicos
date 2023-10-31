package Cadenas;

public class E02_CuentaVocales {
    static int vocales(String cadena){
        int contador;
        contador = 0;
        String VOCALES = "aeiou";
        cadena = cadena.toLowerCase();
        for (int i = 0; i < cadena.length(); i++) {
            /*if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u'){
                contador++;
            }*/
            /* 
            switch (cadena.charAt(i)) {
                case 'a', 'e','i','o', 'u':
                    contador++;
                    break;
            
                default:
                    break;
            }
        }*/
       

    }
     return contador;
    }
    public static void main(String[] args) {
        System.out.println(vocales("hola"));
    }
}
