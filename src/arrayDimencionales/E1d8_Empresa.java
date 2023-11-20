package arrayDimencionales;
import java.time.Month;

import java.time.format.TextStyle;

import java.util.Arrays;

import java.util.Locale;

import java.util.Scanner;


public class E1d8_Empresa {



//	static final int DIAS=3;

//	static final int MESES=2;



	static int[][] caja;

	static Scanner teclado = new Scanner(System.in);

	static final String[] nombreMes = { "enero", "febrero", "marzo" };



	static void entrada() {

		caja = new int[][] { { 4, 5, 2, 5 }, { 3, 8, 5, 2 } };

//		for(int mes(fila)=0; mes < caja.length; mes++) {

//			System.out.printf("mes %d:\n ", mes);

//			for(int dia(columna)=0; dia < caja[mes].length; dia++) {

//				System.out.printf("dia %d: ", dia);

//					caja[mes][dia]=teclado.nextInt();

//			}

//		}

	}



	static String getMes(int m) {

		return Month.values()[m].getDisplayName(TextStyle.FULL, new Locale("es", "ES"));

	}



	static void visualizaPorFilas() {

		for (int mes = 0; mes < caja.length; mes++) {

			System.out.printf(" %s:\n ", getMes(mes));

			for (int dia = 0; dia < caja[mes].length; dia++) {

				System.out.printf("dia %d: ", dia);

				System.out.printf("%d\n ", caja[mes][dia]);



			}

			System.out.println();

		}

	}



	static void visualizaPorColumnas() {

		for (int dia = 0; dia < caja[0].length; dia++) {

			System.out.printf("dia %d:\n ", dia);

			for (int mes = 0; mes < caja.length; mes++) {

				System.out.printf(" %s: ", getMes(mes));

				System.out.printf("%d\n ", caja[mes][dia]);

			}

			System.out.println();

		}

	}

	static int sumaMes1(int nMes) {

		int suma=0;

		for (int dia=0; dia<caja[nMes].length; dia++) {

			suma+= caja[nMes][dia];

		}

		return suma;

	}

	

	static int sumaMes2(int[] cMes) {

		int suma=0;

		for (int dia=0; dia<cMes.length; dia++) {

			suma+= cMes[dia];

		}

		return suma;

	}

	

	static void totalMes() {

		int suma;

		int sumaA=0;

		for(int mes=0; mes<caja.length; mes++) {

//			suma= sumaMes(mes);

			suma= sumaMes2(caja[mes]);

			sumaA+= suma;

			System.out.printf("%s --> %d\n" ,nombreMes[mes], suma);

			}

	

		}



		static int[] totalMesArr() {

			int[] suma;

			suma= new int[caja.length];

			Arrays.fill(suma, 0);

			for (int mes = 0; mes < caja.length; mes++) {

//			suma= sumaMes(mes);

				suma[mes] = sumaMes2(caja[mes]);

				//System.out.printf("%s --> %d\n", nombreMes[mes], suma);

			}

			return null;

		}

		

		static void visualizaTotalMes(int[]totalMes) {

			for (int mes = 0; mes < totalMes.length ; mes++) {

				System.out.printf("%s --> %d\n", nombreMes[mes], totalMes[mes]);

			}

		}

		

		static void fechaMejorCaja() {

			int diaM;

			int mesM;

			diaM=mesM=0;

			for(int mes = 0; mes < caja.length ; mes++) {

				for (int dia = 0; dia < caja[mes].length; dia++) {

					if(caja[mes][dia] > caja[mesM][diaM]) {

						diaM=dia;

						mesM=mes;

					}	

				}

			}

			System.out.printf(" %d de %s --> %d" , diaM , nombreMes[mesM], caja[mesM][diaM]);

		}
		
	

	public static void main(String[] args) {

		entrada();

		System.out.println(Arrays.toString(caja[0]));

		visualizaPorFilas();

		visualizaPorColumnas();

		totalMes();

		fechaMejorCaja();

	}



}
