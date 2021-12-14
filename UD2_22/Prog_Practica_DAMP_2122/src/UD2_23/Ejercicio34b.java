/**
 * 
 */
package UD2_23;

import java.util.Scanner;

/**
 * @author nayra.deniz Ej. 34 pero pintando solo el perimetro del triangulo
 */
public class Ejercicio34b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("escribe el lado:");
		Scanner teclado = new Scanner(System.in);
		int lado = teclado.nextInt();

		int max_linea = 1;
		for (int i = 0; i < lado; i++) {

			for (int j = 1; j <= max_linea; j++) {
				if(i <2 || i == lado-1 || j == 1 || j == max_linea)
					System.out.print("*");
				else
					System.out.print(" ");
					
			}
			System.out.print("\n");
			max_linea++;

		}

//				i --> filas
//				0, 1, lado-1 siempre se pintan
//				j --> columnas
//				0, max_linea siempre se pintan

	}

}
