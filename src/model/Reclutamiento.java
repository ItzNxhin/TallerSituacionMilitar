package model;

public class Reclutamiento extends Persona{
    private String codReclutamiento;

    public String getCodReclutamiento() {
        return this.codReclutamiento;
    }

    public void setCodReclutamiento(String codReclutamiento) {
        this.codReclutamiento = codReclutamiento;
    }

    private Reclutamiento(String cedula, String nombre, String apellido, int edad, String codReclutamiento){
		this.cedula = cedula;
        this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
        this.codReclutamiento = codReclutamiento;
    }
}
