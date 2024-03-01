/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Sara
 */
public class VentanaBuscar extends javax.swing.JFrame {

    /**
     * Creates new form VentanaBuscar
     */
    public VentanaBuscar() {
        setTitle("Consultar Estado Militar");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Buscar = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        bReservista1 = new javax.swing.JRadioButton();
        bRemiso1 = new javax.swing.JRadioButton();
        bMenorEdad1 = new javax.swing.JRadioButton();
        bRecluta1 = new javax.swing.JRadioButton();
        bAplazado1 = new javax.swing.JRadioButton();
        textoCedula1 = new javax.swing.JLabel();
        textoNombre1 = new javax.swing.JLabel();
        textoApellido1 = new javax.swing.JLabel();
        textoEdad1 = new javax.swing.JLabel();
        textoLibreta1 = new javax.swing.JLabel();
        textoFecha1 = new javax.swing.JLabel();
        cajaCedula1 = new javax.swing.JTextField();
        cajaNombre1 = new javax.swing.JTextField();
        cajaApellido1 = new javax.swing.JTextField();
        cajaEdad1 = new javax.swing.JTextField();
        cajaLibreta1 = new javax.swing.JTextField();
        cajaFecha1 = new javax.swing.JTextField();
        btnConsultar2 = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        Buscar.add(bReservista1);
        bReservista1.setText("Reservista");

        Buscar.add(bRemiso1);
        bRemiso1.setText("Remiso");

        Buscar.add(bMenorEdad1);
        bMenorEdad1.setText("Menor de edad");

        Buscar.add(bRecluta1);
        bRecluta1.setText("Recluta");

        Buscar.add(bAplazado1);
        bAplazado1.setText("Aplazado");

        textoCedula1.setText("Cédula");

        textoNombre1.setText("Nombre");

        textoApellido1.setText("Apellido");

        textoEdad1.setText("Edad");

        textoLibreta1.setText("Libreta Militar o Código de Reclutamiento");

        textoFecha1.setText("Fecha de Aplazamiento");

        cajaNombre1.setEditable(false);

        cajaApellido1.setEditable(false);

        cajaEdad1.setEditable(false);

        cajaLibreta1.setEditable(false);

        cajaFecha1.setEditable(false);

        btnConsultar2.setText("Consultar");
        btnConsultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultar2ActionPerformed(evt);
            }
        });

        btnLimpiar1.setText("Limpiar");

        btnSalir1.setText("Salir");

        bVolver.setText("Volver");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(bRecluta1)
                        .addGap(73, 73, 73)
                        .addComponent(bAplazado1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoCedula1)
                                    .addComponent(textoFecha1)
                                    .addComponent(textoLibreta1)
                                    .addComponent(textoEdad1)
                                    .addComponent(textoApellido1)
                                    .addComponent(textoNombre1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cajaCedula1)
                                    .addComponent(cajaNombre1)
                                    .addComponent(cajaApellido1)
                                    .addComponent(cajaEdad1)
                                    .addComponent(cajaLibreta1)
                                    .addComponent(cajaFecha1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bReservista1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(bRemiso1)
                                .addGap(85, 85, 85)
                                .addComponent(bMenorEdad1)))
                        .addGap(29, 29, 29))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnLimpiar1)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir1)
                        .addGap(70, 70, 70))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnConsultar2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bReservista1)
                    .addComponent(bRemiso1)
                    .addComponent(bMenorEdad1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRecluta1)
                    .addComponent(bAplazado1))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCedula1)
                    .addComponent(cajaCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNombre1)
                    .addComponent(cajaNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoApellido1)
                    .addComponent(cajaApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoEdad1)
                    .addComponent(cajaEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoLibreta1)
                    .addComponent(cajaLibreta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoFecha1)
                    .addComponent(cajaFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConsultar2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bVolver)
                        .addComponent(btnSalir1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultar2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Buscar;
    public javax.swing.JRadioButton bAplazado1;
    public javax.swing.JRadioButton bMenorEdad1;
    public javax.swing.JRadioButton bRecluta1;
    public javax.swing.JRadioButton bRemiso1;
    public javax.swing.JRadioButton bReservista1;
    public javax.swing.JButton bVolver;
    public javax.swing.JButton btnConsultar2;
    public javax.swing.JButton btnLimpiar1;
    public javax.swing.JButton btnSalir1;
    public javax.swing.JTextField cajaApellido1;
    public javax.swing.JTextField cajaCedula1;
    public javax.swing.JTextField cajaEdad1;
    public javax.swing.JTextField cajaFecha1;
    public javax.swing.JTextField cajaLibreta1;
    public javax.swing.JTextField cajaNombre1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textoApellido1;
    private javax.swing.JLabel textoCedula1;
    private javax.swing.JLabel textoEdad1;
    private javax.swing.JLabel textoFecha1;
    private javax.swing.JLabel textoLibreta1;
    private javax.swing.JLabel textoNombre1;
    // End of variables declaration//GEN-END:variables

    //Metodo para limpiar el campo de cédula
    public void limpiarCampo(){
        cajaCedula1.setText("");
        cajaNombre1.setText("");
        cajaEdad1.setText("");
        cajaApellido1.setText("");
        cajaLibreta1.setText("");
        cajaFecha1.setText("");
    }
    public void cedulaVacia(){
        JOptionPane.showMessageDialog(null, "No hay cedula que consultar", "CAMPO CEDULA VACIO", JOptionPane.ERROR_MESSAGE);
    }
    public void radiosVacios(){
        JOptionPane.showMessageDialog(null, "Para consultar una persona, escoja su situacion militar", "SITUACION MILITAR SIN SELECCIONAR", JOptionPane.ERROR_MESSAGE);
    }

    public void listaVacia(String cadena){
        JOptionPane.showMessageDialog(null, "No hay " +cadena+" para consultar", "NO HAY PERSONAS EN EL SISTEMAS", JOptionPane.ERROR_MESSAGE);
    }

    public void personaNoExiste(){
        JOptionPane.showMessageDialog(null, "Esta persona no esta en la base de datos", "NO EXISTE", JOptionPane.ERROR_MESSAGE);
    }

    public void tieneOtraSituacion(){
        JOptionPane.showMessageDialog(null, "Esta persona no tiene la situacion militar seleccionada", "SITUACION MILITAR NO COINCEDENTE", JOptionPane.ERROR_MESSAGE);
    }
}

