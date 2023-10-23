package Bucles;

public class Ed3d4_TablaMultiplicar {
    // Diseñar un programa capaz de leer un valor entero, que verifique que esté comprendido entre
    //1 y 10, y mostrar su tabla de multiplicar
    public static void getTablaMultiplicar(int numero){
        if (numero <= 10 && numero > 0){
            int multiplicar;
            for (int i = 1; i <= numero; i++) {
                multiplicar = numero * i;
                System.out.printf("%s * %s = %s", numero, i, multiplicar);
                System.out.println();
            }
        } else {
            System.out.println("el numero tiene que estar comprendido entre 1 y 10");
        }
    }


    public static void main(String[] args){
    getTablaMultiplicar(10);
    }
}
