package view;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.JOptionPane;

/**Venanta encargada para buscar una persona
 *
 * @author nahin
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        setTitle("Insertar Persona");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoPersona = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        BntInsertar = new javax.swing.JButton();
        bReservista = new javax.swing.JRadioButton();
        bRemiso = new javax.swing.JRadioButton();
        bMenorEdad = new javax.swing.JRadioButton();
        bRecluta = new javax.swing.JRadioButton();
        bAplazado = new javax.swing.JRadioButton();
        textoCedula = new javax.swing.JLabel();
        textoNombre = new javax.swing.JLabel();
        textoApellido = new javax.swing.JLabel();
        textoEdad = new javax.swing.JLabel();
        textoLibreta = new javax.swing.JLabel();
        textoFecha = new javax.swing.JLabel();
        cajaCedula = new javax.swing.JTextField();
        cajaNombre = new javax.swing.JTextField();
        cajaApellido = new javax.swing.JTextField();
        cajaEdad = new javax.swing.JTextField();
        cajaLibreta = new javax.swing.JTextField();
        cajaFecha = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setToolTipText("Insertar persona");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BntInsertar.setBackground(new java.awt.Color(204, 255, 204));
        BntInsertar.setText("Insertar");
        jPanel1.add(BntInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        tipoPersona.add(bReservista);
        bReservista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bReservista.setText("Reservista");
        bReservista.setContentAreaFilled(false);
        jPanel1.add(bReservista, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        tipoPersona.add(bRemiso);
        bRemiso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bRemiso.setText("Remiso");
        bRemiso.setContentAreaFilled(false);
        jPanel1.add(bRemiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        tipoPersona.add(bMenorEdad);
        bMenorEdad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bMenorEdad.setText("Menor de edad");
        bMenorEdad.setContentAreaFilled(false);
        jPanel1.add(bMenorEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        tipoPersona.add(bRecluta);
        bRecluta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bRecluta.setText("Recluta");
        bRecluta.setContentAreaFilled(false);
        jPanel1.add(bRecluta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        tipoPersona.add(bAplazado);
        bAplazado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bAplazado.setText("Aplazado");
        bAplazado.setContentAreaFilled(false);
        jPanel1.add(bAplazado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        textoCedula.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        textoCedula.setText("Cédula");
        jPanel1.add(textoCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 132, -1, -1));

        textoNombre.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        textoNombre.setText("Nombre");
        jPanel1.add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 172, -1, -1));

        textoApellido.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        textoApellido.setText("Apellido");
        jPanel1.add(textoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 209, -1, -1));

        textoEdad.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        textoEdad.setText("Edad");
        jPanel1.add(textoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 249, -1, -1));

        textoLibreta.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        textoLibreta.setText("Libreta Militar o Código de Reclutamiento");
        textoLibreta.setAlignmentY(0.0F);
        jPanel1.add(textoLibreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 292, -1, -1));

        textoFecha.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        textoFecha.setText("Fecha de Aplazamiento");
        jPanel1.add(textoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 329, -1, -1));
        jPanel1.add(cajaCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 129, 140, -1));
        jPanel1.add(cajaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 140, -1));
        jPanel1.add(cajaApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 209, 140, -1));
        jPanel1.add(cajaEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 249, 140, -1));
        jPanel1.add(cajaLibreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 289, 140, -1));
        jPanel1.add(cajaFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 329, 140, -1));

        btnLimpiar.setBackground(new java.awt.Color(204, 255, 204));
        btnLimpiar.setText("Limpiar");
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, -1));

        btnSalir.setBackground(new java.awt.Color(204, 255, 204));
        btnSalir.setText("Salir");
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        bVolver.setBackground(new java.awt.Color(204, 255, 204));
        bVolver.setText("Volver");
        jPanel1.add(bVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/fondoventana.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BntInsertar;
    public javax.swing.JRadioButton bAplazado;
    public javax.swing.JRadioButton bMenorEdad;
    public javax.swing.JRadioButton bRecluta;
    public javax.swing.JRadioButton bRemiso;
    public javax.swing.JRadioButton bReservista;
    public javax.swing.JButton bVolver;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnSalir;
    public javax.swing.JTextField cajaApellido;
    public javax.swing.JTextField cajaCedula;
    public javax.swing.JTextField cajaEdad;
    public javax.swing.JTextField cajaFecha;
    public javax.swing.JTextField cajaLibreta;
    public javax.swing.JTextField cajaNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textoApellido;
    private javax.swing.JLabel textoCedula;
    private javax.swing.JLabel textoEdad;
    public javax.swing.JLabel textoFecha;
    public javax.swing.JLabel textoLibreta;
    private javax.swing.JLabel textoNombre;
    private javax.swing.ButtonGroup tipoPersona;
    // End of variables declaration//GEN-END:variables

    public void campoVacio(){
        JOptionPane.showMessageDialog(null, "Hay campos vacios, por favor llenelos", "CAMPOS VACIOS", JOptionPane.ERROR_MESSAGE);
    }

    public void campoInvalido(){
        JOptionPane.showMessageDialog(null, "Hay campos invalidos, por favor corrija", "CAMPOS INVALIDOS", JOptionPane.ERROR_MESSAGE);
    }

    public void estadoVacio(){
        JOptionPane.showMessageDialog(null, "No hay estado militar seleccionado, elija el estado", "ESTADO SIN SLECCIONAR", JOptionPane.ERROR_MESSAGE);
    }
    public void yaExiste(){
        JOptionPane.showMessageDialog(null, "Una persona ya existe con la cedula ingresada", "PERSONA EN EXISTENCIA", JOptionPane.ERROR_MESSAGE);
    }

    public void insertado(){
        JOptionPane.showMessageDialog(null, "Persona insertada con exito", "INSERTADO", JOptionPane.INFORMATION_MESSAGE);
    }

    public void menorsito(){
        JOptionPane.showMessageDialog(null, "Esta persona no puede ser insertada a esta situacion porque no cumple la mayoria de edad", "MENOR DE EDAD", JOptionPane.INFORMATION_MESSAGE);
    }

    public void limpiarCampos() {
        cajaCedula.setText("");
        cajaNombre.setText("");
        cajaEdad.setText("");
        cajaApellido.setText("");
        cajaLibreta.setText("");
        cajaFecha.setText("");

    }

    public void edadImposible() {
        JOptionPane.showMessageDialog(null, "Esta persona no puede ser insertada porque su edad no tiene sentido", "EDAD INVALIDA", JOptionPane.ERROR_MESSAGE);
    }

    public void noMenor() {
        JOptionPane.showMessageDialog(null, "Esta persona no es menor de edad", "MENOR DE EDAD", JOptionPane.ERROR_MESSAGE);
    }
}
