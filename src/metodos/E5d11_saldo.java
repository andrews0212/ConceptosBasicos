package metodos;
public class E5d11_saldo {

    public static float saldo;
    public static void main(String[] args) {
    saldo = 500f;
    ingresar(600f);
    if (saldo > 1000f) 
    System.out.println("Ya tienes más de 1000 euros: " + saldo);
    else System.out.println("No tienes más de 1000 euros: "+ saldo);
    }
    
    static void ingresar(float increm) {
       saldo += increm; 
    }
}