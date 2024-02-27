package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Ventana;

/**
 * Controlador principal
 */
public class Fachada implements ActionListener{
    //Atributos necesarios
    private Ventana vista;
    private ControlAplazado cAplazado;
    private ControlMenorEdad cMenorEdad;
    private ControlReclutamiento cReclutamiento;
    private ControlReservista cReservista;
    private ControlRemiso cRemiso;

    //Constructor
    public Fachada(){
        //Instanciacion de la vista
        this.vista = new Ventana();
        //Instanciacion de los controles
        this.cAplazado = new ControlAplazado();
        this.cMenorEdad = new ControlMenorEdad();
        this.cReclutamiento = new ControlReclutamiento();
        this.cReservista = new ControlReservista();
        this.cRemiso = new ControlRemiso();
        //Escucha a los botones y radioButtons
        this.vista.jrAplazado.addActionListener(this);
        this.vista.jrMenorEdad.addActionListener(this);
        this.vista.jrRecluta.addActionListener(this);
        this.vista.jrReservista.addActionListener(this);
        this.vista.jrRemiso.addActionListener(this);
        this.vista.BntInsertar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
        this.vista.btnSalir.addActionListener(this);
        this.vista.BntInsertar.addActionListener(this);
        
        iniciar();
    

    }

    private void iniciar() {
        vista.setVisible(true);  //Se hace visible la ventana principal de la aplicación
    }

    public void actionPerformed(ActionEvent e){
        //Metodos para desabilitar o habilitar los inputs requeridos
        if(e.getSource() == this.vista.jrAplazado){
            
        }
        else if(e.getSource() == this.vista.jrRemiso){
            this.vista.jtLibretaCR.setVisible(false);;

        }
        else if(e.getSource() == this.vista.jrRecluta){

        }
        else if(e.getSource() == this.vista.jrReservista){

        }
        else if(e.getSource() == this.vista.jrMenorEdad){

        }
        //Boton guardar
        else if(e.getSource() == this.vista.BntInsertar){
            
            if(this.vista.jrRemiso.isSelected()){
                try {
                    cRemiso.agregar(this.vista.jtCedula.getText(), this.vista.jtNombre.getText(),this.vista.jtApellido.getText(),Integer.parseInt(this.vista.jtEdad.getText()));
                } catch (NullPointerException e2 ) {
                    this.vista.campoVacio();
                } catch (NumberFormatException e3) {
                    this.vista.campoInvalido();
                }
    
            }
            else if(this.vista.jrRecluta.isSelected()){
                try {
                    cReclutamiento.agregar(this.vista.jtCedula.getText(), this.vista.jtNombre.getText(),this.vista.jtApellido.getText(),Integer.parseInt(this.vista.jtEdad.getText()), this.vista.jtLibretaCR.getText());
                } catch (NullPointerException e2 ) {
                    this.vista.campoVacio();
                } catch (NumberFormatException e3) {
                    this.vista.campoInvalido();
                }
            }
            else if(this.vista.jrReservista.isSelected()){
                try {
                    cReservista.agregar(this.vista.jtCedula.getText(), this.vista.jtNombre.getText(),this.vista.jtApellido.getText(),Integer.parseInt(this.vista.jtEdad.getText()), this.vista.jtLibretaCR.getText());
                } catch (NullPointerException e2 ) {
                    this.vista.campoVacio();
                } catch (NumberFormatException e3) {
                    this.vista.campoInvalido();
                }

            }
            else if(this.vista.jrAplazado.isSelected()){
                try {
                    cAplazado.agregar(this.vista.jtCedula.getText(), this.vista.jtNombre.getText(),this.vista.jtApellido.getText(),Integer.parseInt(this.vista.jtEdad.getText()), this.vista.jtAplazamiento.getText());
                } catch (NullPointerException e2 ) {
                    this.vista.campoVacio();
                } catch (NumberFormatException e3) {
                    this.vista.campoInvalido();
                }
            }
            else if(this.vista.jrMenorEdad.isSelected()){
                try {
                    cMenorEdad.agregar(this.vista.jtCedula.getText(), this.vista.jtNombre.getText(),this.vista.jtApellido.getText(),Integer.parseInt(this.vista.jtEdad.getText()));
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

        else if(e.getSource() == this.vista.btnBuscar){

        }

        else if(e.getSource() == this.vista.btnLimpiar){
            this.vista.limpiarCampos();
        }

        else if (e.getSource() == this.vista.btnSalir){
            this.vista.dispose();
        }

        
    }
}
