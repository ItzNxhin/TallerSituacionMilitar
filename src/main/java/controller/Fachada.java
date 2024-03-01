package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import view.Ventana;
import view.VentanaBienvenida;
import view.VentanaBuscar;
import model.*;

/**
 * Controlador principal
 */
public class Fachada implements ActionListener{
    //Atributos necesarios
    private Ventana vista;
    private VentanaBienvenida vb;
    private VentanaBuscar vBuscar;
    private ControlAplazado cAplazado;
    private ControlMenorEdad cMenorEdad;
    private ControlReclutamiento cReclutamiento;
    private ControlReservista cReservista;
    private ControlRemiso cRemiso;
    private ArrayList<String> cedulas;

    //Constructor
    public Fachada(){
        //Instanciacion de la vista
        this.vista = new Ventana();
        this.vb = new VentanaBienvenida();
        this.vBuscar = new VentanaBuscar();
        
        //Instanciacion de los controles
        this.cAplazado = new ControlAplazado();
        this.cMenorEdad = new ControlMenorEdad();
        this.cReclutamiento = new ControlReclutamiento();
        this.cReservista = new ControlReservista();
        this.cRemiso = new ControlRemiso();
        //Escucha a los botones y radioButtons vista
        this.vista.bAplazado.addActionListener(this);
        this.vista.bMenorEdad.addActionListener(this);
        this.vista.bRecluta.addActionListener(this);
        this.vista.bReservista.addActionListener(this);
        this.vista.bRemiso.addActionListener(this);
        this.vista.BntInsertar.addActionListener(this);
        this.vista.btnSalir.addActionListener(this);
        this.vista.BntInsertar.addActionListener(this); 
        this.vista.bVolver.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
        //Escucha a los radiobuttons de la consulta
        this.vBuscar.bAplazado1.addActionListener(this);
        this.vBuscar.bMenorEdad1.addActionListener(this);
        this.vBuscar.bRecluta1.addActionListener(this);
        this.vBuscar.bRemiso1.addActionListener(this);
        this.vBuscar.bReservista1.addActionListener(this);
        this.vBuscar.bVolver.addActionListener(null);
        //Escucha los botones de la ventana de bienvenida
        this.vb.btnInsertar1.addActionListener(this);
        this.vb.btnConsultar1.addActionListener(this);
        //Escucha los botones de la ventana de consulta
        this.vBuscar.btnConsultar2.addActionListener(this);
        this.vBuscar.btnLimpiar1.addActionListener(this);
        this.vBuscar.btnSalir1.addActionListener(this);
        this.vBuscar.bVolver.addActionListener(this);

        this.cedulas = new ArrayList<>();
        
        iniciar();
    

    }

    private void iniciar() {
        vb.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        //Metodos para desabilitar o habilitar los inputs requeridos
        if(e.getSource() == this.vista.bAplazado){
            this.vista.cajaFecha.setVisible(true);
            this.vista.cajaLibreta.setVisible(true);
            this.vista.textoLibreta.setText("Libreta Militar o Código de Reclutamiento");
            this.vista.textoFecha.setText("Fecha de aplazamiento");
        }
        else if(e.getSource() == this.vista.bRemiso){
            this.vista.cajaFecha.setVisible(false);
            this.vista.textoFecha.setText("");
            this.vista.cajaLibreta.setVisible(false);
            this.vista.textoLibreta.setText("");
        }
        else if(e.getSource() == this.vista.bRecluta){
            this.vista.cajaFecha.setVisible(false);
            this.vista.cajaLibreta.setVisible(true);
            this.vista.textoLibreta.setText("Libreta Militar o Código de Reclutamiento");
            this.vista.textoFecha.setText("");
        }
        else if(e.getSource() == this.vista.bReservista){
            this.vista.cajaFecha.setVisible(false);
            this.vista.cajaLibreta.setVisible(true);
            this.vista.textoLibreta.setText("Libreta Militar o Código de Reclutamiento");
            this.vista.textoFecha.setText("");
        }
        else if(e.getSource() == this.vista.bMenorEdad){
            this.vista.cajaFecha.setVisible(false);
            this.vista.textoFecha.setText("");
            this.vista.cajaLibreta.setVisible(false);
            this.vista.textoLibreta.setText("");
        }
        //Se hace visible la ventana de insertar una persona
        else if (e.getSource() == this.vb.btnInsertar1){
            vb.setVisible(false);
            vista.setVisible(true);
        }
        //Se hace visible la ventana de consultar una persona
        else if (e.getSource()== this.vb.btnConsultar1){
            vb.setVisible(false);
            vBuscar.setVisible(true);
        }
        //Boton guardar
        else if(e.getSource() == this.vista.BntInsertar){
            
            if(cedulas.contains(this.vista.cajaCedula.getText()) && !cedulas.isEmpty()){
                this.vista.yaExiste();
            }
            else {
                if(this.vista.bRemiso.isSelected()){
                    try {
                        cRemiso.agregar(this.vista.cajaCedula.getText(), this.vista.cajaNombre.getText(),this.vista.cajaApellido.getText(),Integer.parseInt(this.vista.cajaEdad.getText()));
                        cedulas.add(this.vista.cajaCedula.getText());
                    } catch (NullPointerException e2 ) {
                        this.vista.campoVacio();
                    } catch (NumberFormatException e3) {
                        this.vista.campoInvalido();
                    }
        
                }
                else if(this.vista.bRecluta.isSelected()){
                    try {
                        cReclutamiento.agregar(this.vista.cajaCedula.getText(), this.vista.cajaNombre.getText(),this.vista.cajaApellido.getText(),Integer.parseInt(this.vista.cajaEdad.getText()), this.vista.cajaLibreta.getText());
                        cedulas.add(this.vista.cajaCedula.getText());
                    } catch (NullPointerException e2 ) {
                        this.vista.campoVacio();
                    } catch (NumberFormatException e3) {
                        this.vista.campoInvalido();
                    }
                }
                else if(this.vista.bReservista.isSelected()){
                    try {
                        cReservista.agregar(this.vista.cajaCedula.getText(), this.vista.cajaNombre.getText(),this.vista.cajaApellido.getText(),Integer.parseInt(this.vista.cajaEdad.getText()), this.vista.cajaLibreta.getText());
                        cedulas.add(this.vista.cajaCedula.getText());
                    } catch (NullPointerException e2 ) {
                        this.vista.campoVacio();
                    } catch (NumberFormatException e3) {
                        this.vista.campoInvalido();
                    }
    
                }
                else if(this.vista.bAplazado.isSelected()){
                    try {
                        cAplazado.agregar(this.vista.cajaCedula.getText(), this.vista.cajaNombre.getText(),this.vista.cajaApellido.getText(),Integer.parseInt(this.vista.cajaEdad.getText()), this.vista.cajaFecha.getText());
                        cedulas.add(this.vista.cajaCedula.getText());
                    } catch (NullPointerException e2 ) {
                        this.vista.campoVacio();
                    } catch (NumberFormatException e3) {
                        this.vista.campoInvalido();
                    }
                }
                else if(this.vista.bMenorEdad.isSelected()){
                    try {
                        cMenorEdad.agregar(this.vista.cajaCedula.getText(), this.vista.cajaNombre.getText(),this.vista.cajaApellido.getText(),Integer.parseInt(this.vista.cajaEdad.getText()));
                        cedulas.add(this.vista.cajaCedula.getText());
                    } catch (NullPointerException e2 ) {
                        this.vista.campoVacio();
                    } catch (NumberFormatException e3) {
                        this.vista.campoInvalido();
                    }
    
                }
                else{
                    this.vista.estadoVacio();
                }

            }            
        }
        //Botón consultar 
        else if(e.getSource() == this.vBuscar.btnConsultar2){

            if(this.vBuscar.bRemiso1.isSelected()){
               try {
                    Remiso x = cRemiso.buscar(this.vBuscar.cajaCedula1.getText());
                    if(x!=null){
                        this.vBuscar.cajaNombre1.setText(x.getNombre());
                        this.vBuscar.cajaApellido1.setText(x.getApellido());
                        this.vBuscar.cajaEdad1.setText(String.valueOf(x.getEdad()));
                    }
               } catch (Exception e1) {
                this.vBuscar.listaVacia("remisos");
               }
            }

            else if(this.vBuscar.bRecluta1.isSelected()){
                try {
                    Reclutamiento x = cReclutamiento.buscar(this.vBuscar.cajaCedula1.getText());
                    if(x!=null){
                        this.vBuscar.cajaNombre1.setText(x.getNombre());
                        this.vBuscar.cajaApellido1.setText(x.getApellido());
                        this.vBuscar.cajaEdad1.setText(String.valueOf(x.getEdad()));
                        this.vBuscar.cajaLibreta1.setText(x.getCodReclutamiento());
                    }
                   } catch (Exception e1) {
                    this.vBuscar.listaVacia("reclutas");
                   }
            }

            else if(this.vBuscar.bReservista1.isSelected()){  
                try {
                    Reservista x = cReservista.buscar(this.vBuscar.cajaCedula1.getText());
                    if(x!=null){
                        this.vBuscar.cajaNombre1.setText(x.getNombre());
                        this.vBuscar.cajaApellido1.setText(x.getApellido());
                        this.vBuscar.cajaEdad1.setText(String.valueOf(x.getEdad()));
                        this.vBuscar.cajaLibreta1.setText(x.getLibreta());
                    }
                   } catch (Exception e1) {
                    this.vBuscar.listaVacia("reservistas");
                   }
            }

            else if(this.vBuscar.bAplazado1.isSelected()){
                try {
                    Aplazado x = cAplazado.buscar(this.vBuscar.cajaCedula1.getText());
                    if(x!=null){
                        this.vBuscar.cajaNombre1.setText(x.getNombre());
                        this.vBuscar.cajaApellido1.setText(x.getApellido());
                        this.vBuscar.cajaEdad1.setText(String.valueOf(x.getEdad()));
                        this.vBuscar.cajaFecha1.setText(x.getFechaAplazado());
                    }
                   } catch (Exception e1) {
                    this.vBuscar.listaVacia("aplazados");
                   }                
            }

            else if(this.vBuscar.bMenorEdad1.isSelected()){   
                try {
                    MenorEdad x = cMenorEdad.buscar(this.vBuscar.cajaCedula1.getText());
                    if(x!=null){
                        this.vBuscar.cajaNombre1.setText(x.getNombre());
                        this.vBuscar.cajaApellido1.setText(x.getApellido());
                        this.vBuscar.cajaEdad1.setText(String.valueOf(x.getEdad()));
                    }
                   } catch (Exception e1) {
                    this.vBuscar.listaVacia("reservistas");
                   }
            }
            else{
                this.vista.estadoVacio();
            }
        
        
        }

        //Permite limpiar los campos de la ventana de Insertar persona
        else if(e.getSource() == this.vista.btnLimpiar){
            this.vista.limpiarCampos();
        }
        //Permite cerrar la ventana de insertar persona mediante el botón salir
        else if (e.getSource() == this.vista.btnSalir){
            this.vBuscar.dispose();
            this.vista.dispose();
            this.vb.dispose();
        }
        //Permite limpiar el campo de la ventana de Consultar
        else if (e.getSource() == this.vBuscar.btnLimpiar1){
            this.vBuscar.limpiarCampo();
        }
        //Permite salir de la ventana de Consultar
        else if (e.getSource() == this.vBuscar.btnSalir1){
            this.vBuscar.dispose();
            this.vista.dispose();
            this.vb.dispose();
        }

        else if(e.getSource() == this.vista.bVolver){
            vista.setVisible(false);
            vb.setVisible(true);
            
        }
        else if(e.getSource() == this.vBuscar.bVolver){
            vBuscar.setVisible(false);
            vb.setVisible(true);
        }
    }
}
