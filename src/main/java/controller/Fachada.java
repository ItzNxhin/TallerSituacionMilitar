package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Ventana;

public class Fachada implements ActionListener{
    private Ventana vista;
    private ControlAplazado cAplazado;
    private ControlMenorEdad cMenorEdad;
    private ControlReclutamiento cReclutamiento;
    private ControlReservista cReservista;
    private ControlRemiso cRemiso;

    public Fachada(){
        this.vista = new Ventana();
//prueba
        this.vista.jrAplazado.addActionListener(this);
        this.vista.jrMenorEdad.addActionListener(this);
        this.vista.jrRecluta.addActionListener(this);
        this.vista.jrReservista.addActionListener(this);
        this.vista.jrRemiso.addActionListener(this);
        this.vista.BntInsertar.addActionListener(this);
        this.cAplazado = new ControlAplazado();
        this.cMenorEdad = new ControlMenorEdad();
        this.cReclutamiento = new ControlReclutamiento();
        this.cReservista = new ControlReservista();
        this.cRemiso = new ControlRemiso();
        iniciar();
    

    }

    private void iniciar() {
        vista.setVisible(true);  //Se hace visible la ventana principal de la aplicación
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == this.vista.jrAplazado){
            
        }
        else if(e.getSource() == this.vista.jrRemiso){

        }
        else if(e.getSource() == this.vista.jrRecluta){

        }
        else if(e.getSource() == this.vista.jrReservista){

        }
        else if(e.getSource() == this.vista.jrMenorEdad){

        }
        else if(e.getSource() == this.vista.BntInsertar){
            if(this.vista.jrRemiso.isSelected()){

            }
            else if(this.vista.jrRecluta.isSelected()){

            }
            else if(this.vista.jrReservista.isSelected()){

            }
            else if(this.vista.jrAplazado.isSelected()){

            }
            else if(this.vista.jrMenorEdad.isSelected()){

            }
            else{
                
            }
        }

        else if (e.getSource() == this.vista.btnSalir){
            this.vista.dispose();
        }

        
    }
}
