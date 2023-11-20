package arrayDimencionales;

import java.util.Arrays;

public class MatrizUnitaria {
	
	static int[][] MatrizUnitaria( int longitud) {
	 int[][] array = new int[longitud][longitud];
	 int contador = 0;
	 for (int columna = 0; columna < array.length; columna++) {
		
		for (int fila = 0; fila < array[columna].length; fila++) {
				if (fila == contador) {
					 array[columna][fila] = 1;
				}
		}
		contador += 1;
		
	}
	 return array;
	}
	static int[][] MatrizUnitaria2( int longitud) {
		 int[][] array = new int[longitud][longitud];
		 int contador = 0;
		 int contador2 = array.length - 1;
		 for (int columna = 0; columna < array.length; columna++) {
			
			for (int fila = 0; fila < array[columna].length; fila++) {
					if (fila == contador) {
						 array[columna][fila] = 1;
					} else if (fila == contador2) {
						array[columna][fila] = 1;
					}
			}
			contador += 1;
			contador2 -= 1;
			
		}
		 return array;
		}
	static void mostrarMatri(int[][] array) {

		 for (int columna = 0; columna < array.length; columna++) {
			for (int fila = 0; fila < array[columna].length; fila++) {
					
				System.out.print(array[columna][fila]);
			}
			System.out.println();
			
		}
	}
	
	// correccion profesor
	
	static int[][] unitaria(int longitud) {
		 int[][] array = new int[longitud][longitud];
		 for (int columna = 0; columna < array.length; columna++) {	
			for (int fila = 0; fila < array[columna].length; fila++) {
					if (fila == columna) {
						 array[columna][fila] = 1;
					} else 
						array[columna][fila] = 0;
					}
			}

		 return array;
		}
		 
	static void visualizarMatris(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.printf("%2d", array[i][j]);
			}
			System.out.println();
		}
	}

 public static void main(String[] args) {
	int[][] array = unitaria(7);
	visualizarMatris(array);
}
	
}
