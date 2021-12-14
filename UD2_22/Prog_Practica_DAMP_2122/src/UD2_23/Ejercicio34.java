package UD2_23;

import java.util.Scanner;

/**
 * 
 * @author nayra.deniz
 *
 * Enunciado:
 *  Realiza un programa que pida el lado de un triángulo rectángulo equilátero
 * (como el de la figura) y lo imprima utilizando el carácter “*” 
 */
public class Ejercicio34 {

	public static void main(String[] args) {
		
		System.out.println("escribe el lado:");
		Scanner teclado = new Scanner(System.in);
		int lado = teclado.nextInt();
		
		int max_linea = 1;
		for(int i = 0; i < lado; i++) {
			
			for (int j = 1; j <= max_linea; j++) {
				
				System.out.print("*");
			}
			System.out.print("\n");
			max_linea++;
			
		}
		
		
		
		
		

	}

}
