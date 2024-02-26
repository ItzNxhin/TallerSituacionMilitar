package controller;

import model.MenorEdad;
import java.util.ArrayList;

public class ControlMenorEdad {
    private ArrayList<MenorEdad> lista;

    public ControlMenorEdad(){
        this.lista=new ArrayList<>();
    }
    public void agregar(String cedula, String nombre, String apellido, int edad){
        if (cedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty()) throw new NullPointerException();
        else lista.add(new MenorEdad(cedula, nombre, apellido, edad));
    }
}
