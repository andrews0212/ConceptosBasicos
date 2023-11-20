package arrayDimencionales;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;

public class Ej1d8_empresa2 {
	
	 static final int DIA = 3;
	    static final int MES = 2;
	    static int[][] caja = new int[MES][DIA];;
	    static int[][] dia;
	    static Random rdm = new Random();
	    static void llenar(int[][] caja){
	    	
	        for (int m = 0; m < caja.length; m++) {
	            for (int d = 0; d < caja[m].length; d++) {
	                caja[m][d] = rdm.nextInt(101); // Genera un número aleatorio entre 0 y 100
	            }
	        }
	    }
	    static String getMes(int m){
	       // return  Month.values()[m].getDisplayName(TextStyle.FULL, new Locale("es")).toString().toUpperCase();
	    	switch (m) {
	    	case 0: return "Enero"; 
	    	case 1:return "Febrero";
	    	case 2:return "Marzo";
	    	case 3: return "Abril";
	    	case 4: return "Mayo";
	    	case 5: return "Junio";
	    	case 6: return "Julio";
	    	case 7: return "Agosto";
	    	case 8: return "Septiembre";
	    	case 9: return "Octubre";
	    	case 10: return "Noviembre";
	    	case 11: return "Diciembre";
	    	default: return "Mes no existe";
	    	}
	    }
	    static void mostrar(int[][] caja){
	        for (int i = 0; i < caja.length; i++) {
	            System.out.println(getMes(i));
	            for (int j = 0; j < caja[i].length; j++) {
	                System.out.print(caja[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	    static int sumaDias(int mes) {
	    	int suma;
	    	suma = 0;
	    	for (int dia = 0; dia < caja[mes].length; dia++) {
	    		suma += caja[mes][dia];
			}
	    	return suma;
	    }
	    static void sumaCajaMeses(){
	    for (int mes = 0; mes < caja.length; mes++) {
			sumaDias(mes);
		}
	   
	    
	    }
	    static void mostrarSumaMeses(){
	    	
	    	for (int mes = 0; mes < caja.length; mes++) {
				System.out.println(getMes(mes) + " " + sumaDias(mes)); 
	    		
			}
	    
	    }
	    static int mejorCajaMes(int m) {
	    	
	    	int aux;
	    	aux = 0;
	    	aux = caja[m][0];
	    	for (int dia = 1; dia < caja[m].length; dia++) {
	    		
	    		if (caja[m][dia] > aux) {
	    			aux = caja[m][dia];
	    		} 
			}
	    	return aux;
	    }
	    
	    static int getDiaMejorCajaMesPosicion(int mes) {
	    	boolean xor;
	    	int posicion;
	    	posicion = -1;
	    	xor = false;
	    	for (int dia = 0; xor == false && dia < caja[mes].length; dia++) {
				if (caja[mes][dia] == mejorCajaMes(mes)){
					xor = true;
					posicion = dia;
				}
			} 
	    	return posicion;
	    }
	    
	    static void getMesesConMejoresCajas() {
	    	for (int mes = 0; mes < caja.length; mes++) {
	    		System.out.print(getMes(mes) + " " + (getDiaMejorCajaMesPosicion(mes) + 1) + " : ");
		    	System.out.println( + mejorCajaMes(mes));
			}
	    }
	    static void mostrarMesConMejorCaja(int mes) {
	    	System.out.print(getMes(mes) + " " + (getDiaMejorCajaMesPosicion(mes) + 1) + " : ");
	    	System.out.print( + mejorCajaMes(mes));
	    }
	    static int TotalAnio() {
	    	int suma;
	    	suma = 0;
	    	for (int mes = 0; mes < caja.length; mes++) { 
				suma += sumaDias(mes);
			}
	    	System.out.println("la suma total del año es de "  + suma);
	    	return suma;
	    }
	
	public static void main(String[] args) {
		llenar(caja);
		mostrar(caja);
		mostrarSumaMeses();
		TotalAnio();
		getMesesConMejoresCajas();
		
		
		
	}
}
