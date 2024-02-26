package controller;

import model.MenorEdad;
import java.util.ArrayList;

/**
 * Controlador para los menores de edad
 */
public class ControlMenorEdad {
    //Lista almacenadora
    private ArrayList<MenorEdad> lista;

    //Contructor
    public ControlMenorEdad(){
        this.lista=new ArrayList<>();
    }

    /** 
     * Metodo para almacenar un nuevo menor de edad
     * @param cedula
     * @param nombre
     * @param apellido
     * @param edad
     */
    public void agregar(String cedula, String nombre, String apellido, int edad){
        if (cedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty()) throw new NullPointerException();
        else lista.add(new MenorEdad(cedula, nombre, apellido, edad));
    }
}
