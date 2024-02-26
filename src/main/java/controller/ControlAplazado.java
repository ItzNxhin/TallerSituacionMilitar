package controller;

import model.Aplazado;
import java.util.ArrayList;

/**
 * Controlador para los aplazados
 */
public class ControlAplazado {
    //Lista almacenadora
    private ArrayList<Aplazado> lista;

    //Cosntructor
    public ControlAplazado(){
        this.lista = new ArrayList<>();
    }

    /** Metodo encarcado de añadir una nueva persona a la lista
     * 
     * @param cedula
     * @param nombre
     * @param apellido
     * @param edad
     * @param fechaAplazado
     */
    public void agregar(String cedula, String nombre, String apellido, int edad, String fechaAplazado){
        if (cedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || fechaAplazado.isEmpty()) throw new NullPointerException();
        else lista.add(new Aplazado(cedula, nombre, apellido, edad, fechaAplazado));
    }
    
}
