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
        this.vista.btnSalir.addActionListener(this);; 
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
            this.vista.limpiarCampos();
            this.vista.cajaFecha.setVisible(true);
            this.vista.cajaLibreta.setVisible(true);
            this.vista.textoLibreta.setText("Libreta Militar o Código de Reclutamiento");
            this.vista.textoFecha.setText("Fecha de aplazamiento");
        }
        else if(e.getSource() == this.vista.bRemiso){
            this.vista.limpiarCampos();
            this.vista.cajaFecha.setVisible(false);
            this.vista.textoFecha.setText("");
            this.vista.cajaLibreta.setVisible(false);
            this.vista.textoLibreta.setText("");
        }
        else if(e.getSource() == this.vista.bRecluta){
            this.vista.limpiarCampos();
            this.vista.cajaFecha.setVisible(false);
            this.vista.cajaLibreta.setVisible(true);
            this.vista.textoLibreta.setText("Libreta Militar o Código de Reclutamiento");
            this.vista.textoFecha.setText("");
        }
        else if(e.getSource() == this.vista.bReservista){
            this.vista.limpiarCampos();
            this.vista.cajaFecha.setVisible(false);
            this.vista.cajaLibreta.setVisible(true);
            this.vista.textoLibreta.setText("Libreta Militar o Código de Reclutamiento");
            this.vista.textoFecha.setText("");
        }
        else if(e.getSource() == this.vista.bMenorEdad){
            this.vista.limpiarCampos();
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
            
            //Condicional en caso de que la cedula ya exista
            if(cedulas.contains(this.vista.cajaCedula.getText()) && !cedulas.isEmpty()){
                this.vista.yaExiste();
            }
            else {
                //Manejo de errores
                try {
                    //Condicional para que este seleccionado el estado a insertar una persona
                    if(!this.vista.bRemiso.isSelected() && !this.vista.bReservista.isSelected() && !this.vista.bMenorEdad.isSelected() 
                    && !this.vista.bAplazado.isSelected() && !this.vista.bRecluta.isSelected()){
                        this.vista.estadoVacio();
                    }
                    //Condicional para estados que no pueden entrar menores
                    else if(Integer.parseInt(this.vista.cajaEdad.getText())<18 && (this.vista.bRemiso.isSelected() || this.vista.bReservista.isSelected()) 
                        || this.vista.bAplazado.isSelected() || this.vista.bRecluta.isSelected()){
                            this.vista.menorsito();
                    }
                    //Condicional para edad invalida
                    else if(Integer.parseInt(this.vista.cajaEdad.getText())<0){
                        this.vista.edadImposible();
                    }
                    //Condionales para dependiendo del estado sleccionado, sea agregado en su respectivo control
                    else if(this.vista.bRemiso.isSelected()){
                        cRemiso.agregar(this.vista.cajaCedula.getText(), this.vista.cajaNombre.getText(),this.vista.cajaApellido.getText(),Integer.parseInt(this.vista.cajaEdad.getText()));
                        cedulas.add(this.vista.cajaCedula.getText());
                        this.vista.limpiarCampos();
                        this.vista.insertado();
                    }
                    else if(this.vista.bRecluta.isSelected()){
                        cReclutamiento.agregar(this.vista.cajaCedula.getText(), this.vista.cajaNombre.getText(),this.vista.cajaApellido.getText(),Integer.parseInt(this.vista.cajaEdad.getText()), this.vista.cajaLibreta.getText());
                        cedulas.add(this.vista.cajaCedula.getText());
                        this.vista.limpiarCampos();
                        this.vista.insertado();
                    }
                    else if(this.vista.bReservista.isSelected()){
                        cReservista.agregar(this.vista.cajaCedula.getText(), this.vista.cajaNombre.getText(),this.vista.cajaApellido.getText(),Integer.parseInt(this.vista.cajaEdad.getText()), this.vista.cajaLibreta.getText());
                        cedulas.add(this.vista.cajaCedula.getText());
                        this.vista.limpiarCampos();
                        this.vista.insertado();
                    }
                    else if(this.vista.bAplazado.isSelected()){
                        cAplazado.agregar(this.vista.cajaCedula.getText(), this.vista.cajaNombre.getText(),this.vista.cajaApellido.getText(),Integer.parseInt(this.vista.cajaEdad.getText()), this.vista.cajaFecha.getText());
                        cedulas.add(this.vista.cajaCedula.getText());
                        this.vista.limpiarCampos();
                        this.vista.insertado();    
                    }
                    else if(this.vista.bMenorEdad.isSelected()){
                        //Condional para ver si la persona efectivamente es menor de edad
                        if(Integer.parseInt(this.vista.cajaEdad.getText())<18){
                            cMenorEdad.agregar(this.vista.cajaCedula.getText(), this.vista.cajaNombre.getText(),this.vista.cajaApellido.getText(),Integer.parseInt(this.vista.cajaEdad.getText()));
                            cedulas.add(this.vista.cajaCedula.getText());
                            this.vista.limpiarCampos();
                            this.vista.insertado();
                        }
                        else{
                            this.vista.noMenor();
                        }
                        
                    }
                    
                } catch (NullPointerException e2 ) {
                    this.vista.campoVacio();    //Campo vacio
                } catch (NumberFormatException e3) {
                    this.vista.campoInvalido(); //Campo invalido
                }
            }            
        }
        //Botón consultar 
        else if(e.getSource() == this.vBuscar.btnConsultar2){
            
            //Condicional para que este seleccionado el estado a consultar una persona
            if(!this.vBuscar.bAplazado1.isSelected() && !this.vBuscar.bRemiso1.isSelected() && !this.vBuscar.bMenorEdad1.isSelected()
                && !this.vBuscar.bRecluta1.isSelected() && !this.vBuscar.bReservista1.isSelected()){
                        this.vBuscar.radiosVacios();
            }
            //Ver si efectivamente existen personas
            else if(cedulas.isEmpty()){
                this.vBuscar.listaVacia("personas");
            }
            //No hay cedula para consular
            else if(this.vBuscar.cajaCedula1.getText()==null){
                this.vBuscar.cedulaVacia();
            }
            //Condionales para dependiendo del estado seleccionado, sea consultado en su respectivo control si es es que la persona existe
            else if(cedulas.contains(this.vBuscar.cajaCedula1.getText())){
                //Ciclo para recorrer caso por caso
                while (true) {
                    //Ver si la persona existe en los controles, y si es asi mostrarla, pero si el controlador esta vacio, decir que no hay personas
                    if(this.vBuscar.bRemiso1.isSelected()){
                        try {
                            Remiso x = cRemiso.buscar(this.vBuscar.cajaCedula1.getText());
                            if(x!=null){
                                this.vBuscar.cajaNombre1.setText(x.getNombre());
                                this.vBuscar.cajaApellido1.setText(x.getApellido());
                                this.vBuscar.cajaEdad1.setText(String.valueOf(x.getEdad()));
                                break;
                            }
                        } catch (Exception e1) {
                            this.vBuscar.listaVacia("remisos");
                            break;
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
                                break;
                            }
                        } catch (Exception e1) {
                            this.vBuscar.listaVacia("reclutas");
                            break;
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
                                break;
                            }
                        } catch (Exception e1) {
                            this.vBuscar.listaVacia("reservistas");
                            break;
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
                                break;
                            }
                        } catch (Exception e1) {
                            this.vBuscar.listaVacia("aplazados");
                            break;
                        }                
                     }
         
                    else if(this.vBuscar.bMenorEdad1.isSelected()){   
                        try {
                            MenorEdad x = cMenorEdad.buscar(this.vBuscar.cajaCedula1.getText());
                            if(x!=null){
                                this.vBuscar.cajaNombre1.setText(x.getNombre());
                                this.vBuscar.cajaApellido1.setText(x.getApellido());
                                this.vBuscar.cajaEdad1.setText(String.valueOf(x.getEdad()));
                                break;
                            }
                        } catch (Exception e1) {
                            this.vBuscar.listaVacia("reservistas");
                            break;
                        }
                    }

                    //Si no esta en el controlador seleccionado, pero sabemos que la persona existe, se concluye que esta en otro estado (en otro control)
                    this.vBuscar.tieneOtraSituacion();
                    break;
                }
            }
            //No hay persona con esa cedula
            else if(!cedulas.contains(this.vBuscar.cajaCedula1.getText())){
                this.vBuscar.personaNoExiste();
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

        //Botenes para volver
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
