package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Persona yo = new Persona();
		boolean correcto = false;
		
		System.out.println("Nombre: ");
		yo.setNombre(sc.nextLine());
		System.out.println("Edad:");
		yo.setEdad(Integer.parseInt(sc.nextLine()));
		System.out.println("DNI:");
		
		//Manejamos la posible excepcion
		do {
			try {
				yo.setDni(sc.nextLine());
				correcto = true;
			}catch(InputMismatchException e) {
				System.out.println("DNI invalido");
			}
		}while(!correcto);
		
		System.out.println(yo);
		
	}

}
