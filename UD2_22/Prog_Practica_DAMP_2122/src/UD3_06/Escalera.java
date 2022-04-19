package UD3_06;

import java.util.Arrays;
import java.util.Scanner;

public class Escalera {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String[] cartas = new String[8];
		int[] numerosCartas = new int[4];
		int indexCartas = 0;
		String palo = "";
		boolean escalera = true;
		
		System.out.println("Introduce las cartas indicando numero [intro] palo [intro] hasta 4 veces:");
		for(int i = 0; i < 8; i++)
			cartas[i] = teclado.nextLine();
		
		//Meter el palo de la primera carta
		palo = cartas[1];
		
		for(int j = 0; j < 7; j=j+2) {
			numerosCartas[indexCartas]=Integer.parseInt(cartas[j]);
			indexCartas++;
		}
		
		for(int k = 3; k < 8; k=k+2) {
			if (!palo.equals(cartas[k]))
				escalera = false;
		}
		
		if(escalera) {
			//Buscar en numeros cartas el numero que nos falta
			Arrays.sort(numerosCartas);
			
			
		}
		
		
		
	}

}
