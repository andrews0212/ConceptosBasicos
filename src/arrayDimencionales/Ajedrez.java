package arrayDimencionales;

import java.util.Arrays;
import java.util.Iterator;

public class Ajedrez {
	static final int LONGITUDTABLA = 8;
	static String[][] tablero = new String[LONGITUDTABLA][LONGITUDTABLA];
	
	static void MostrarTablero(String[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				
				System.out.printf("%s" + " ", tablero[i][j]);
				
			}
			System.out.println();
		}
	}
	static void hacerTablero(String[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				
				tablero[i][j] = "[]";
				
			}
			
		}
	}
	
	// Dama 9, Torre 5, Alfil 4, Caballo 4, Peón 1, Rey 4.
	
	static void colocarPiezas() {
		tablero[0][0] = "TN";
		tablero[2][2] = "TB";
		tablero[1][6] = "PN";
		tablero[1][7] = "PN";
		tablero[2][4] = "PN";
		tablero[7][4] = "RB";
		
	}
	static int[] getValoracion(String[][] tablero) {
		int[] contador = new int[2];
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				if (tablero[i][j].charAt(1) == 'B') {
				switch (tablero[i][j].charAt(0)) {
				case 'T': contador[0] += 5;
				break;
				case 'D': contador[0] += 9;
				break;
				case 'A': contador[0] += 4;
				break;
				case 'C': contador[0] += 4;
				break;
				case 'P': contador[0] += 1; 
				break;
				case 'R': contador[0] +=  4;
				break;
				}
				} else {
					switch (tablero[i][j].charAt(0)) {
					case 'T': contador[1] += 5;
					break;
					case 'D': contador[1] += 9;
					break;
					case 'A': contador[1] += 4;
					break;
					case 'C': contador[1] += 4;
					break;
					case 'P': contador[1] += 1; 
					break;
					case 'R': contador[1] +=  4;
					break;
					}
				}
			}
		}
		return contador;
	}
	
	static int[] valoracion(String[][] array) {
		int[] resultado = new int[2];
		int[] valor = {5,9,4,4,1,4};
		String Fichas = "TDACPR";
		
		String color = "BN";
		
		for (int columnas = 0; columnas < valor.length; columnas++) {
			for (int filas = 0; filas < valor.length; filas++) {
				if (array[columnas][filas].charAt(1) != ']') {
					resultado[color.indexOf(array[columnas][filas].charAt(1))] += valor[Fichas.indexOf(array[columnas][filas].charAt(0))];
				}
				
			}
		}
		return resultado;
		
		
		
	}
	
	public static void main(String[] args) {
		hacerTablero(tablero);
		colocarPiezas();
		MostrarTablero(tablero);
		
		System.out.println(Arrays.toString(valoracion(tablero)));
	}


}
