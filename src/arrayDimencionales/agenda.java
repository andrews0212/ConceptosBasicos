package arrayDimencionales;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class agenda {

	static String[][] agenda = new String[3][3];
	static Scanner teclado = new Scanner(System.in);

	static void Datos() {

		agenda[1][0] = "andrews";
		agenda[1][1] = "634127185";
		agenda[1][2] = "18";

		agenda[2][0] = "manolo";
		agenda[2][1] = "636542545";
		agenda[2][2] = "18";

//		for (int columna = 0; columna < agenda.length; columna++) {
//			for (int fila = 0; fila < agenda.length; fila++) {
//				agenda[columna][fila] = teclado.next();
//			}
//		}

	}

	static int BuscarPorNombre(String[][] agenda, String nombre) {
		boolean xor;
		xor = false;
		int pos;
		pos = -1;
		for (int columna = 0; (!xor) && columna < agenda.length; columna++) {
			
			if (agenda[columna][0] != null) {
				if (agenda[columna][0].equals(nombre)) {
					xor = true;
					pos = columna;
				}

			}

			for (int i = 0; (xor) && i < agenda[columna].length; i++) {
				System.out.print(agenda[columna][i] + " ");
			}
			

		}
		System.out.println();
		if (xor == false) {
			System.out.println("No se ha conseguido ningun contacto");
		}
		return pos;
	}
	static void añadirAmigo(String[][] agenda) {
		System.out.println("añadir amigo");
		boolean xor;
		xor = false;
		for (int columna = 0; (!xor) && columna < agenda.length; columna++) {
		if (agenda[columna][0] == null) {
			for (int i = 0; i < agenda[0].length; i++) {
				agenda[0][i] = teclado.next();
			}
			xor = true;
		}
		}
	}
	static void eliminarAmigo(String nombre) {
		int pos =BuscarPorNombre(agenda , nombre);
		System.out.println("contacto eliminado");
		for (int i = 0; i < agenda[pos].length; i++) {
			agenda[pos][i] = null;
		}
		
	}
	
	public static void main(String[] args) {
		Datos();
		BuscarPorNombre(agenda, "andrews");
		eliminarAmigo("andrews");
		BuscarPorNombre(agenda, "andrews");
		añadirAmigo(agenda);
		for (String[] fila : agenda) {
			System.out.println(Arrays.toString(fila));
		}
	}

}
