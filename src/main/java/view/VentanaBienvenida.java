/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Sara
 */
public class VentanaBienvenida extends javax.swing.JFrame {

    /**
     * Creates new form VentanaBienvenida
     */
    public VentanaBienvenida() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInsertar1 = new javax.swing.JButton();
        btnConsultar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInsertar1.setBackground(new java.awt.Color(153, 255, 153));
        btnInsertar1.setText("INSERTAR");
        btnInsertar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 120, 50));

        btnConsultar1.setBackground(new java.awt.Color(153, 255, 153));
        btnConsultar1.setText("CONSULTAR");
        getContentPane().add(btnConsultar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 120, 50));

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("SISTEMA DE GESTIÓN "); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 230, 40));

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 153));
        jLabel1.setText("MILITAR COLOMBIANO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(VentanaBienvenida.class.getResource("/view/Imagen1.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnConsultar1;
    public javax.swing.JButton btnInsertar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
