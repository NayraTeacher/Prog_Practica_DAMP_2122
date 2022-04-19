/**
 * 
 */
package excepciones;

import java.util.InputMismatchException;

/**
 * @author nayra.deniz
 *
 */
public class Persona {
	private String nombre;
	private int edad;
	private String dni;
	
	public Persona() {}
	
	public Persona(String nombre, int edad, String dni) {
		this.nombre = nombre;
		this.edad = edad;
		setDni(dni);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) throws InputMismatchException{
		if(dniCorrecto(dni))
			this.dni = dni;
		else
			throw new InputMismatchException();
	}

	private boolean dniCorrecto(String dniLetra) {
		boolean validado = true;
		if (dniLetra.length() != 9) {
			validado= false;
		} else {
			String letra = dniLetra.substring(8);
			String numeros = dniLetra.substring(0, 8);
			int dniNoLetra = Integer.parseInt(numeros);
			String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
			int resto = dniNoLetra % 23;
			char letraFinal = caracteres.charAt(resto);
			String letraValor = String.valueOf(letraFinal);

			if (letra.equals(letraValor)) {
				validado = true;
			} else {
				validado = false;
			}		
		}
		return validado;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + "]";
	}
	
	
	
	

}
