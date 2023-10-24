package metodos;

public class E10d5_saldo {
    public static void main(String[] args) {
        float saldo = 500f;
        saldo = ingresar(saldo, 400f);
        if (ingresar(saldo, 400f)>1000f)
        System.out.println("Ya tienes más de 1000 euros: " + saldo);
        else System.out.println("No tienes más de 1000 euros: " + saldo);
       }
       static float ingresar (float saldo, float increm){ return saldo+increm;} // no incrementa el saldo ni almacena solo lo devuelve
}
