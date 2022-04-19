/**
 * 
 */
package Taller_Herencia;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author nayra.deniz
 *
 */
public class Rankings {

	static Scanner letras = new Scanner(System.in);
	static Scanner numeros = new Scanner(System.in);
	
	static TreeSet<Libro> conjunto = new TreeSet<Libro>();
			
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
		conjunto.add(new Libro("It", "Stephen King", 1965));
		conjunto.add(new Libro("Africanus", "Posteguillo", 1992));
	}
	
	public static void pintarConjunto() {
//		System.out.println("Este es el conjunto:");
//		for(int i =0; i<6; i++) {
//			System.out.println(conjunto[i] + " --> " + puntos[i]);
//		}
//		
//		ordenarElementosMenosMas();
//		for(int i =0; i<6; i++) {
//			System.out.println(conjunto[i] + " --> " + puntos[i]);
//		}
	}
	
	public static void puntuarElementos() {
//		System.out.println("Introduce los puntos del 1 al 5 detras de cada elemento");
//		for(int i=0; i<6; i++) {
//			System.out.println(conjunto[i]);
//			puntos[i] = numeros.nextShort();
//		}
	}
	
	
		
	
}
