package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Ventana;
import view.VentanaBienvenida;
import view.VentanaBuscar;

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
        //Escucha a los botones y radioButtons
        this.vista.bAplazado.addActionListener(this);
        this.vista.bMenorEdad.addActionListener(this);
        this.vista.bRecluta.addActionListener(this);
        this.vista.bReservista.addActionListener(this);
        this.vista.bRemiso.addActionListener(this);
        this.vista.BntInsertar.addActionListener(this);
        //this.vista.btnBuscar.addActionListener(this);
        this.vista.btnSalir.addActionListener(this);
        this.vista.BntInsertar.addActionListener(this);
        //Escucha los botones de la ventana de bienvenida
        this.vb.btnInsertar1.addActionListener(this);
        this.vb.btnConsultar1.addActionListener(this);
        //Escucha los botones de la ventana de consulta
        this.vBuscar.btnConsultar2.addActionListener(this);
        this.vBuscar.btnLimpiar1.addActionListener(this);
        this.vBuscar.btnSalir1.addActionListener(this);
        
        iniciar();
    

    }

    private void iniciar() {
        vb.setVisible(true);
        vista.setVisible(false);  //Se hace visible la ventana principal de la aplicación
    }

    public void actionPerformed(ActionEvent e){
        //Metodos para desabilitar o habilitar los inputs requeridos
        if(e.getSource() == this.vista.bAplazado){
            this.vista.cajaFecha.setVisible(true);
            this.vista.cajaLibreta.setVisible(true);
        }
        else if(e.getSource() == this.vista.bRemiso){
            this.vista.cajaFecha.setVisible(false);
            this.vista.cajaLibreta.setVisible(false);
        }
        else if(e.getSource() == this.vista.bRecluta){
            this.vista.cajaFecha.setVisible(false);
            this.vista.cajaLibreta.setVisible(true);
        }
        else if(e.getSource() == this.vista.bReservista){
            this.vista.cajaFecha.setVisible(false);
            this.vista.cajaLibreta.setVisible(true);
        }
        else if(e.getSource() == this.vista.bMenorEdad){
            this.vista.cajaFecha.setVisible(false);
            this.vista.cajaLibreta.setVisible(false);
        }
        //Se hace visible la ventana de insertar una persona
        else if (e.getSource() == this.vb.btnInsertar1){
            vista.setVisible(true);
        }
        //Se hace visible la ventana de consultar una persona
        else if (e.getSource()== this.vb.btnConsultar1){
            vBuscar.setVisible(true);
        }
        //Boton guardar
        else if(e.getSource() == this.vista.BntInsertar){
            
            if(this.vista.bRemiso.isSelected()){
                try {
                    cRemiso.agregar(this.vista.cajaCedula.getText(), this.vista.cajaNombre.getText(),this.vista.cajaApellido.getText(),Integer.parseInt(this.vista.cajaEdad.getText()));
                } catch (NullPointerException e2 ) {
                    this.vista.campoVacio();
                } catch (NumberFormatException e3) {
                    this.vista.campoInvalido();
                }
    
            }
            else if(this.vista.bRecluta.isSelected()){
                try {
                    cReclutamiento.agregar(this.vista.cajaCedula.getText(), this.vista.cajaNombre.getText(),this.vista.cajaApellido.getText(),Integer.parseInt(this.vista.cajaEdad.getText()), this.vista.cajaLibreta.getText());
                } catch (NullPointerException e2 ) {
                    this.vista.campoVacio();
                } catch (NumberFormatException e3) {
                    this.vista.campoInvalido();
                }
            }
            else if(this.vista.bReservista.isSelected()){
                try {
                    cReservista.agregar(this.vista.cajaCedula.getText(), this.vista.cajaNombre.getText(),this.vista.cajaApellido.getText(),Integer.parseInt(this.vista.cajaEdad.getText()), this.vista.cajaLibreta.getText());
                } catch (NullPointerException e2 ) {
                    this.vista.campoVacio();
                } catch (NumberFormatException e3) {
                    this.vista.campoInvalido();
                }

            }
            else if(this.vista.bAplazado.isSelected()){
                try {
                    cAplazado.agregar(this.vista.cajaCedula.getText(), this.vista.cajaNombre.getText(),this.vista.cajaApellido.getText(),Integer.parseInt(this.vista.cajaEdad.getText()), this.vista.cajaFecha.getText());
                } catch (NullPointerException e2 ) {
                    this.vista.campoVacio();
                } catch (NumberFormatException e3) {
                    this.vista.campoInvalido();
                }
            }
            else if(this.vista.bMenorEdad.isSelected()){
                try {
                    cMenorEdad.agregar(this.vista.cajaCedula.getText(), this.vista.cajaNombre.getText(),this.vista.cajaApellido.getText(),Integer.parseInt(this.vista.cajaEdad.getText()));
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
        //Botón consultar 
        else if(e.getSource() == this.vBuscar.btnConsultar2){
        
        }

        
        //Permite limpiar los campos de la ventana de Insertar persona
        else if(e.getSource() == this.vista.btnLimpiar){
            this.vista.limpiarCampos();
        }
        //Permite cerrar la ventana de insertar persona mediante el botón salir
        else if (e.getSource() == this.vista.btnSalir){
            this.vista.dispose();
        }
        //Permite limpiar el campo de la ventana de Consultar
        else if (e.getSource() == this.vBuscar.btnLimpiar1){
            this.vBuscar.limpiarCampo();
        }
        //Permite salir de la ventana de Consultar
        else if (e.getSource() == this.vBuscar.btnSalir1){
            this.vBuscar.dispose();
        }
    }
}
