package Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class E00_AlumnosEdades {
    static Scanner teclado = new Scanner(System.in);
    static int edad[]; // variable global propiedad estaticas
    static String nombreAlumno[];
    static int nAlumno;
    static Random r = new Random();
    /*
    * 
    * 
    * 
    * 
    */
    static void carga(int n){
        nAlumno = n;
        edad = new int[n];
        nombreAlumno = new String[n];
        for (int i = 0; i < edad.length; i++) {
            System.out.println("Dime el nombre del alumno " + i);
            nombreAlumno[i] = teclado.nextLine();
            System.out.printf(" Edad alumno %d\n" , i);
            edad[i] = r.nextInt(10, 20); // va almacenando edad de alumno en el array 
            // si creas un objeto Random de esta forma hace que adicine un numero del 10 al 20
        }
    }
    static void visualizar(){
        int a = 0;
        System.out.println("Listado de alumno");
        for (int e : edad) {
            System.out.printf("%d %d \n", a++, e); // para imprimir toda la lista tenemos que utilizar Array.toString
           
        }
    }
    static double getMedia(){
        int suma;
        suma = 0;
        for (int i = 0; i < edad.length; i++) {
            suma += edad[i];
        }
        
       
        return (double) suma / edad.length;
       
    }
   /*  static int getMayorEdad(){
        int mayor;
        mayor = 0;
        for (int e : edad) {
            mayor = Math.max(mayor, e);
        }
        for (int i = 0; i < edad.length; i++) {
            if (mayor == edad[i]){
                System.out.println("el alumno mayor de edad es " + (i+ 1));
            }
        }
       
        return mayor;

    }*/
    

    static int getMayor(){
        int mayorEdad;
        int mayorAlumno;
        mayorAlumno = 0;
        mayorEdad=edad[0];
        for (int i = 1; i < edad.length; i++) {
            if (edad[i] > mayorEdad){
                mayorAlumno = i;
                mayorEdad = edad[i];
            }
            
        }
        return mayorAlumno;
    }
    static int getEdad(String nombre){
        for (int i = 0; i < nombreAlumno.length; i++) {
            if (nombreAlumno[i].equals(nombre)){
                return edad[i];
            }
        }
        System.out.println("desconocido");
        return 0;
    }
        public static void main(String[] args){
        
        carga(5);
        visualizar();
        System.out.println("esta es la media " + getMedia());
        System.out.println(getMayor());
        System.out.println("su edad es " + edad[getMayor()]);
        System.out.println(Arrays.toString(nombreAlumno));
        System.out.println(getEdad("andrews"));
        
    }
// falta hacer la parte que este relacionado la edad con los nombres
}
