package Taller_Agenda;

public class Contacto {
	private String nombre;
	private String telefono;
	private String email;
	
	//Constructor vacio
	public Contacto() {
		
	}
	
	//Constructor con todos los parámetros
	public Contacto(String nombre, String telefono, String email) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Nombre=" + nombre + ", \n  telefono=" + telefono + ", \n  email=" + email + "\n";
	}

	
	
	

}
