package controller;

import model.Reservista;
import java.util.ArrayList;

public class ControlReservista {
    private ArrayList<Reservista> lista;

    public ControlReservista(){
        this.lista = new ArrayList<>();
    }

    public void agregar(String cedula, String nombre, String apellido, int edad, String libreta){
        if (cedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || libreta.isEmpty()) throw new NullPointerException();
        else lista.add(new Reservista(cedula, nombre, apellido, edad, libreta));
    }
}
