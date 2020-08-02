/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Vista;

import ec.ups.edu.Controlador.ControladorAsignatura;
import ec.ups.edu.Controlador.ControladorDocente;
import ec.ups.edu.Controlador.ControladorEspacioFisico;
import ec.ups.edu.Controlador.ControladorGrupo;
import ec.ups.edu.Modelo.Asignatura;
import ec.ups.edu.Modelo.Docente;
import ec.ups.edu.Modelo.EspacioFisico;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author 59396
 */
public class VistaCrearGrupo extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaCrearGrupo
     */
    private ControladorGrupo controladorGrupo;
    private ControladorAsignatura controladorAsignatura;
    private ControladorDocente controladorDocente;
    private ControladorEspacioFisico controladorEspacioFisico;

    public VistaCrearGrupo(ControladorGrupo controladorGrupo, ControladorAsignatura controladorAsignatura, ControladorDocente controladorDocente,
            ControladorEspacioFisico controladorEspacioFisico) {
        this.controladorAsignatura = controladorAsignatura;
        this.controladorDocente = controladorDocente;
        this.controladorEspacioFisico = controladorEspacioFisico;
        this.controladorGrupo = controladorGrupo;
        initComponents();
        cargarAsignatura();
        cargarDocente();
        cargarEspacioFisico();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxas = new javax.swing.JComboBox<>();
        jComboBoxesp = new javax.swing.JComboBox<>();
        jComboBoxdco = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("GESTION GRUPO");

        jLabel1.setText("ASIGNATURA");

        jLabel3.setText("ESPACIO FISICO");

        jLabel4.setText("DOCENTE");

        jComboBoxas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCION" }));

        jComboBoxesp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCION" }));

        jComboBoxdco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCION" }));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CANCEL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxas, 0, 256, Short.MAX_VALUE)
                            .addComponent(jComboBoxesp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxdco, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxesp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxdco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public void cargarAsignatura() {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) jComboBoxas.getModel();
        for (Asignatura na : controladorAsignatura.listarAsignatura()) {
            modelo.addElement(na);
        }
    }
    
    public void cargarDocente(){
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) jComboBoxdco.getModel();
        for (Docente docente : controladorDocente.listarDocente()) {
            modelo.addElement(docente);
        }
    }
    public void cargarEspacioFisico(){
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) jComboBoxesp.getModel();
        for (EspacioFisico ef : controladorEspacioFisico.listarEspacioFisico()) {
            modelo.addElement(ef);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxas;
    private javax.swing.JComboBox<String> jComboBoxdco;
    private javax.swing.JComboBox<String> jComboBoxesp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}