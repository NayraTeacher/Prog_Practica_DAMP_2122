/**
 * 
 */
package TallerArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author nayra.deniz
 *
 */
public class Rankings {

	static Scanner letras = new Scanner(System.in);
	static Scanner numeros = new Scanner(System.in);
	static String[] conjunto = new String[6];
	static short[] puntos = new short[] {0,0,0,0,0,0};
		
	public static void main(String[] args) {
		short opcion = -1;
			
		//Menu
		do {
			System.out.println("Pulsa la opcion que quieras realizar:");
			System.out.println("1. Cargar elementos en el conjunto a puntuar");
			System.out.println("2. Puntuar");
			System.out.println("3. Mostrar ranking");
			System.out.println("0. Para salir del programa.");
			opcion = numeros.nextShort();
			
			switch (opcion) {
				case 1:
					System.out.println("1. Cargar elementos en el conjunto a puntuar");
					nuevoConjunto();
					break;
				case 2:
					System.out.println("2. Puntuar");
					puntuarElementos();
					break;
				case 3:
					System.out.println("3. Mostrar ranking");
					pintarConjunto();
					break;
				case 0:
					System.out.println("Muchas gracias por usar la app de ranking.");
					break;
				default:
					System.out.println("Opcion incorrecta, vuelve a intentarlo.");
					break;
			
			}
		}while(opcion !=0);
		
		
		
		
		
	}

	public static void nuevoConjunto() {
		//metodo para leer nuevos elementos del conjunto
		System.out.println("Introduce los elementos a puntuar. Despues de cada elemento pulsa enter (son 6 elemntos)");
		//Recorrer array conjunto, cargando los elementos a puntuar
		for(int i =0; i<6; i++) {
			conjunto[i] = letras.nextLine();
		}
		System.out.println(Arrays.toString(conjunto));
	}
	
	public static void pintarConjunto() {
		System.out.println("Este es el conjunto:");
		for(int i =0; i<6; i++) {
			System.out.println(conjunto[i] + " --> " + puntos[i]);
		}
		
		ordenarElementosMenosMas();
		for(int i =0; i<6; i++) {
			System.out.println(conjunto[i] + " --> " + puntos[i]);
		}
	}
	
	public static void puntuarElementos() {
		System.out.println("Introduce los puntos del 1 al 5 detras de cada elemento");
		for(int i=0; i<6; i++) {
			System.out.println(conjunto[i]);
			puntos[i] = numeros.nextShort();
		}
	}
	
	private static void ordenarElementosMenosMas() {
		short auxN = 0;
		String auxE ="";
		
		for(int j=0;j<5;j++) {
			for(int i=0;i<5;i++) {
				if(puntos[i] > puntos[i+1]) {
					auxN=puntos[i+1];
					puntos[i+1] = puntos[i];
					puntos[i]=auxN;
					//tambien con elemntos
					auxE = conjunto[i+1];
					conjunto[i+1] = conjunto[i];
					conjunto[i]=auxE;
				}
			}
			
		}
		
	}
}
