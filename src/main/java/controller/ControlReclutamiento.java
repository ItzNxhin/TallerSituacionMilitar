package controller;

import model.Reclutamiento;
import java.util.ArrayList;

/**
 * Controlador para los reclutas
 */
public class ControlReclutamiento {
    //Almacen para los reclutas
    private ArrayList<Reclutamiento> lista;

    //Constructor
    public ControlReclutamiento(){
        this.lista = new ArrayList<>();
    }

    /**
     * Metodo para almacenar un nuevo recluta
     * @param cedula
     * @param nombre
     * @param apellido
     * @param edad
     * @param codReclutamiento
     */
    public void agregar(String cedula, String nombre, String apellido, int edad, String codReclutamiento){
        if (cedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || codReclutamiento.isEmpty()) throw new NullPointerException();
        else lista.add(new Reclutamiento(cedula, nombre, apellido, edad, codReclutamiento));
    }

    public Reclutamiento buscar(String cedula){
        
        if(lista.isEmpty()) throw new NullPointerException();
        else{
            for(Reclutamiento i : lista){
                if(i.getCedula().equals(cedula)) return i;
            }
        }
        return null; 
        
    }
}
