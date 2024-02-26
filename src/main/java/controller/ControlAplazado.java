package controller;

import model.Aplazado;
import java.util.ArrayList;

public class ControlAplazado {
    private ArrayList<Aplazado> lista;

    public ControlAplazado(){
        this.lista = new ArrayList<>();
    }

    public void agregar(String cedula, String nombre, String apellido, int edad, String fechaAplazado){
        if (cedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || fechaAplazado.isEmpty()) throw new NullPointerException();
        else lista.add(new Aplazado(cedula, nombre, apellido, edad, fechaAplazado));
    }
    
}
