package metodos;

import java.util.Scanner;

public class E5d2_Menu {
    static Scanner teclado = new Scanner(System.in);
    /*
     * esto lo que hace es pedir el numero para la operacion
     * @return devuelve el valor de la operacion
     */
    static int getoperacion(){
    return teclado.nextInt();
    }
    /*
    * Esto lo que hace es mostrar por pantalla el menu
    * 
    */
    static void pintaMenu(){
        System.out.println("1- circulo");
        System.out.println("2- triangulo");
        System.out.println("3- cuadrado");
        System.out.println("0- fin");
    }
    /*
     * Permite calculara el area de un circulo 
     * @param radio aqui se pedira el radio para calcular el area del circulo
     * @return retornará un valor entero que sera el area del circulo
     * 
     */
    static int getAreaCirculo(int radio){
        
        return (int) (Math.PI * Math.pow(radio, 2));
    }
    /*
     * Calcula el area de un triangulo
     * @param base Se introduce cuanto mide la base
     * @param altura Se introduce cuanto mide la altura
     * @return devuelve un valor de tipo entoro dando el area del triangulo
     */
    static int getAreaTriangulo(int base, int altura){
        return (base * altura) / 2;
    }
    /*
     * Calcula el area de un cuadrado
     * @param base Base del cuadrado
     * @param altura altura del cuadrado
     * @return devuelve el area del cuadrado 
     * 
     */
    static int getAreaCuadrado(int base, int altura){
        return (base * altura);
    }

    
    public static void main(String[] args) {
        int numero;
        int radio;
        int base;
        int altura;
        do {
        pintaMenu();
        numero = getoperacion();
        switch (numero){
            case 1:
            
            System.out.println("dime el radio del circulo");
            radio = teclado.nextInt();
            System.out.println(getAreaCirculo(radio));
            break;
            case 2:
            System.out.println("dime la base del triangulo");
            base = teclado.nextInt();
            System.out.println("dime la altura");
            altura = teclado.nextInt();
            System.out.println(getAreaTriangulo(base, numero));
            break;
            case 3:
            System.out.println("dime la base del triangulo");
            base = teclado.nextInt();
            System.out.println("dime la altura");
            altura = teclado.nextInt();
            break;
            default: 
             if (numero > 3 && numero < 0) System.out.println("error");
             else
             System.out.println("adios");
        }
       
        }while(numero > 0);
    }
}
