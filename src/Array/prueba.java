package Array;

public class prueba {
    public static void main(String[] args) {
        int base, exponente, resultado;
        base = 3;
        exponente = 4; 
        resultado = base;
        for (int i = 2; i <= exponente;i++) {
            resultado *= base;
        }
        System.out.println(resultado);
    }
}
