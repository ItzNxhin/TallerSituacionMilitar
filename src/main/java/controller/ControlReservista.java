package controller;

import model.Reservista;
import java.util.ArrayList;

/**
 * Controlador para los reservista
 */
public class ControlReservista {
    //Almacen de los reservista
    private ArrayList<Reservista> lista;

    //Constructor
    public ControlReservista(){
        this.lista = new ArrayList<>();
    }

    /**
     * Metodo para agregar un nuevo reservista
     * @param cedula
     * @param nombre
     * @param apellido
     * @param edad
     * @param libreta
     */
    public void agregar(String cedula, String nombre, String apellido, int edad, String libreta){
        if (cedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || libreta.isEmpty()) throw new NullPointerException();
        else lista.add(new Reservista(cedula, nombre, apellido, edad, libreta));
    }
}
