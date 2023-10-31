package Cadenas;

public class E13_CHexa {

    static String getHexaDecimal(int n, int base){
        String hexa = "";
        String DIGITOS = "0123456789ABCDEF";
        int resto;
        char letra;
        while (n > 0){
          //  resto = n % 16;
            letra = DIGITOS.charAt(n % base);
            n /= base;
           
            

   /*         switch (resto) {
                case 10:
                    letra = "A";
                    break;
                case 11:
                    letra = "B";
                    break;
                case 12:
                    letra = "C";
                    break;
                case 13:
                    letra = "D";
                    break;
                case 14:
                    letra = "E";
                    break;
                case 15:
                    letra = "F";
                    break;
                
                default:
                letra = "" + resto;
                    break;
            } */

            hexa = letra + hexa;
        }
        return hexa;
    }
    public static void main(String[] args) {
      //  System.out.println(Integer.toHexString(123));
    // System.out.println(Integer.toString(123, 16));
        System.out.println(getHexaDecimal(123, 16));
    }
}
