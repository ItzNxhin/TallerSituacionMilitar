package controller;

import model.Remiso;
import java.util.ArrayList;
public class ControlRemiso {
    private ArrayList<Remiso> lista;

    public ControlRemiso(){
        this.lista = new ArrayList<>();
    }

    public void agregar(String cedula, String nombre, String apellido, int edad){

        if (cedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty()) throw new NullPointerException();
        else lista.add(new Remiso(cedula, nombre, apellido, edad));
    }
}
