package Cadenas;

public class CifradoCesar {
	
	static String cifrar(String cadena) {
		String CIFRADO = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%^&*!?";
		String cifrado;
		cifrado = "";
		for (int i = 0; i < CIFRADO.length(); i++) {
			for (int j = 0; j < cadena.length(); j++) {
				if (cadena.charAt(j) == CIFRADO.charAt(i)) {
					cifrado += CIFRADO.charAt(i + 5);
					
				}
			}
		}
		return cifrado;
	}
	
	
	public static void main(String[] args) {
		System.out.println(cifrar("Andesinf12"));
	}
	
}
