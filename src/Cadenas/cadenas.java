package Cadenas;

public class cadenas {
    public static void main(String[] args) {
       
        // se puededn crear de estas dos maneras
        // String hola;
       String hola;
        hola = new String("hola mundo");
        //--------------------------------------
        System.out.println(hola);
        // los String se guarda en la misma zona de memoria
        // los String no se pueden manipular
        String hola1, lol;
        String hola2;
        hola1 = "hola1";
        hola2 = "hola2";
        lol = "ruta";
        System.out.println(hola1);

        /*
         * a = new String("cadenas");
         * b = new String("cadenas");
         * apuntan a direcciones distintas
         * a = "cadena";
         * b = "cadenas";
         * apuntan a las mismas
         * 
         * 
         * 
         * 
         */
        String nuevo, nuevo2;
        nuevo = "abc";
        nuevo2 = "bad";
    
        if (nuevo == nuevo2){
            System.out.println("misma ruta");
        } else {
            System.out.println("no igual");
        }


        // para comparar contenido del String es
        if (hola.equals(hola2)){ // con el metodo equals() podemos ver si es igual el contenido del String
            System.out.println("es igual");
        } else{
            System.out.println("no es igual");
        }

        if (nuevo.compareTo(nuevo2) > 0){  // buscar en casa como se desarrolla correctamente
            System.out.println( "1 > 2");
        } else {
            System.out.println( "2 < 1");
        }

        /*
         * metodos de String
         * 
         * equals = compara si las cadenas son iguales de contenido
         * equalsIgnoreCase = lo mismo con el equals pero no tiene relevancia con mayusculas y mayusculas
         * compareTO =  compara letra por letra si es mayor menor igual
         * 
         * 
         */
    }
}
