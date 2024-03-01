package controller;

import model.Remiso;
import java.util.ArrayList;

/**
 * Controlador para los remisos
 */
public class ControlRemiso {
    //Almacen de los remisos
    private ArrayList<Remiso> lista;

    //Constructor
    public ControlRemiso(){
        this.lista = new ArrayList<>();
    }

    /**
     * Metodo para almacenar un nuevo remiso
     * @param cedula
     * @param nombre
     * @param apellido
     * @param edad
     */
    public void agregar(String cedula, String nombre, String apellido, int edad){

        if (cedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty()) throw new NullPointerException();
        else lista.add(new Remiso(cedula, nombre, apellido, edad));
    }

    public Remiso buscar(String cedula){
        
        if(lista.isEmpty()) throw new NullPointerException();
        else{
            for(Remiso i : lista){
                if(i.getCedula().equals(cedula)) return i;
            }
        }
        return null; 
        
    }
}
