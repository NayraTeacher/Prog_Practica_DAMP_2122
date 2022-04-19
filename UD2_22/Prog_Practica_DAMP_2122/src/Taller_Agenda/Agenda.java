/**
 * 
 */
package Taller_Agenda;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author nayra.deniz
 *
 */
public class Agenda {
	
	static Scanner numeros = new Scanner(System.in);
	static Scanner cadenas = new Scanner(System.in);
	
	//Declarar objeto coleccion agenda
	static TreeMap<String, Contacto> miAgenda = new TreeMap<>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		short opcion = -1;
		
		inicializaAgenda();
		
		//Menu
		do {
			System.out.println("Pulsa la opcion que quieras realizar:");
			System.out.println("1. Nuevo contacto");
			System.out.println("2. Buscar contacto");
			System.out.println("3. Mostrar agenda");
			System.out.println("4. Eliminar contacto");
			System.out.println("0. Para salir del programa.");
			opcion = numeros.nextShort();
			
			switch (opcion) {
				case 1:
					System.out.println("1. Cargar elementos en el conjunto a puntuar");
					nuevoContacto();
					break;
				case 2:
					System.out.println("2. Buscar");
					//BuscarContacto();
					break;
				case 3:
					System.out.println("3. Mostrar agenda");
					mostrarAgenda();
					break;
				case 4:
					System.out.println("4. Eliminar contacto");
					//eliminarContacto();
					break;
				case 0:
					System.out.println("Muchas gracias por usar la app de agenda.");
					break;
				default:
					System.out.println("Opcion incorrecta, vuelve a intentarlo.");
					break;
			
			}
		}while(opcion !=0);
		

	}
	
	private static void inicializaAgenda() {
		miAgenda.put("Nayra", new Contacto("Nayra", "789627452", "nay@mail.com"));
		miAgenda.put("Gemma", new Contacto("Gemma", "345678", "gem@mail.com"));
		miAgenda.put("Joaquin", new Contacto("Joaquin", "98765434", "joa@mail.com"));
	}
	
	private static void nuevoContacto() {
		Contacto nuevo = new Contacto();
		System.out.println("Escribe un nombre: ");
		nuevo.setNombre(cadenas.nextLine());
		System.out.println("Escribe un telefono: ");
		nuevo.setTelefono(cadenas.nextLine());
		System.out.println("Escribe un email: ");
		nuevo.setEmail(cadenas.nextLine());
		
		miAgenda.put(nuevo.getNombre(), nuevo);
		
	}
	
	private static void mostrarAgenda() {
		for (Entry<String, Contacto> entry : miAgenda.entrySet()) {
			//String key = entry.getKey();
			//Contacto val = entry.getValue();
			System.out.println(entry.getValue());
			
		} 
	}

}
