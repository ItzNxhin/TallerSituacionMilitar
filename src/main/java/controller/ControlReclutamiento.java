package controller;

import model.Reclutamiento;
import java.util.ArrayList;

public class ControlReclutamiento {
    private ArrayList<Reclutamiento> lista;

    public ControlReclutamiento(){
        this.lista = new ArrayList<>();
    }

    public void agregar(String cedula, String nombre, String apellido, int edad, String codReclutamiento){
        if (cedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || codReclutamiento.isEmpty()) throw new NullPointerException();
        else lista.add(new Reclutamiento(cedula, nombre, apellido, edad, codReclutamiento));
    }
}
