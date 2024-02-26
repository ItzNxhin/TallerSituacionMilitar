package model;

public class Reservista extends Persona{
    private String libreta;

    private Reservista(String cedula, String nombre, String apellido, int edad, String libreta){
		this.cedula = cedula;
        this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.libreta = libreta;
    }

	public String getLibreta() {
		return this.libreta;
	}

	public void setLibreta(String libreta) {
		this.libreta = libreta;
	}

    
}
 
