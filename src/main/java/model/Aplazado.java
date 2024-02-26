package model;

public class Aplazado extends Persona{
    private String fechaAplazado;

    public String getFechaAplazado() {
        return this.fechaAplazado;
    }

    public void setFechaAplazado(String fechaAplazado) {
        this.fechaAplazado = fechaAplazado;
    }

    public Aplazado(String cedula, String nombre, String apellido, int edad, String fechaAplazado){
		this.cedula = cedula;
        this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaAplazado = fechaAplazado;
    }
}
