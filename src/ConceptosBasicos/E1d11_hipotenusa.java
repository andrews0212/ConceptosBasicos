
package ConceptosBasicos;

public class E1d11_hipotenusa {

    static int getHipotenusa(int catetoA, int catetoB){
        int hipotenusa;
        hipotenusa = (int) Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
        return hipotenusa;
    }

    public static void main(String[] args){
        System.out.println(getHipotenusa(10,10));

        // se puede tambien hacer de esta manera

        // Math.hypot(10, 10);
    }
}
