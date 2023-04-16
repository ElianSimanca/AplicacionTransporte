/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author Elian
 */
public class AdminWindow extends javax.swing.JFrame {

    /**
     * Creates new form AdminWindow
     */
    public AdminWindow() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelFinanzas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanelRegistroUsuarios = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanelRegistrarTrabajadores = new javax.swing.JPanel();
        jTextFieldCreateDriverTelefono = new javax.swing.JTextField();
        jTextFieldCreateDriverPassword = new javax.swing.JTextField();
        jTextFieldreateDriverName = new javax.swing.JTextField();
        jTextFieldCreateDriverCedula = new javax.swing.JTextField();
        jTextFieldCreateDriverID = new javax.swing.JTextField();
        jButtonRegistrarConductor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaDriverBuscado = new javax.swing.JTextArea();
        jTextFieldBuscarIDDriver = new javax.swing.JTextField();
        jButtonEliminarConductor = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCreateDriverMatricula = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabelRegisterInfo = new javax.swing.JLabel();
        jPanelReporteTrabajadores = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanelReporteClientes = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanelFinanzas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFinanzas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanelFinanzas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 540, 210));

        jLabel7.setText("Registro de Servicios Concluidos");
        jPanelFinanzas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanelFinanzas.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 110, -1));

        jLabel8.setText("TOTAL RECAUDADO:");
        jPanelFinanzas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jButton4.setText("Imprimir");
        jPanelFinanzas.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 80, -1));

        jTabbedPane1.addTab("Finanzas", jPanelFinanzas);

        jPanelRegistroUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistroUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelRegistroUsuarios.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 74, -1));

        jLabel6.setText("Buscar o eliminar por ID:");
        jPanelRegistroUsuarios.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanelRegistroUsuarios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 370, -1));

        jButton2.setText("Buscar");
        jPanelRegistroUsuarios.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jButton3.setText("Eliminar Usuario");
        jPanelRegistroUsuarios.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        jTabbedPane1.addTab("Administrar Usuarios", jPanelRegistroUsuarios);

        jPanelRegistrarTrabajadores.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistrarTrabajadores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCreateDriverTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCreateDriverTelefonoActionPerformed(evt);
            }
        });
        jPanelRegistrarTrabajadores.add(jTextFieldCreateDriverTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 100, -1));

        jTextFieldCreateDriverPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCreateDriverPasswordActionPerformed(evt);
            }
        });
        jPanelRegistrarTrabajadores.add(jTextFieldCreateDriverPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 100, -1));

        jTextFieldreateDriverName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldreateDriverNameActionPerformed(evt);
            }
        });
        jPanelRegistrarTrabajadores.add(jTextFieldreateDriverName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 100, -1));

        jTextFieldCreateDriverCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCreateDriverCedulaActionPerformed(evt);
            }
        });
        jPanelRegistrarTrabajadores.add(jTextFieldCreateDriverCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 100, -1));

        jTextFieldCreateDriverID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCreateDriverIDActionPerformed(evt);
            }
        });
        jPanelRegistrarTrabajadores.add(jTextFieldCreateDriverID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 100, -1));

        jButtonRegistrarConductor.setText("Registrar Trabajador");
        jButtonRegistrarConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarConductorActionPerformed(evt);
            }
        });
        jPanelRegistrarTrabajadores.add(jButtonRegistrarConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        jLabel1.setText("Nombre");
        jPanelRegistrarTrabajadores.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel2.setText("Cedula");
        jPanelRegistrarTrabajadores.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel3.setText("Telefono");
        jPanelRegistrarTrabajadores.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel4.setText("Contraseña");
        jPanelRegistrarTrabajadores.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        jLabel5.setText("UserID");
        jPanelRegistrarTrabajadores.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jTextAreaDriverBuscado.setColumns(20);
        jTextAreaDriverBuscado.setRows(5);
        jScrollPane3.setViewportView(jTextAreaDriverBuscado);

        jPanelRegistrarTrabajadores.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 330, -1));

        jTextFieldBuscarIDDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarIDDriverActionPerformed(evt);
            }
        });
        jPanelRegistrarTrabajadores.add(jTextFieldBuscarIDDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 100, -1));

        jButtonEliminarConductor.setText("Eliminar por ID");
        jButtonEliminarConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarConductorActionPerformed(evt);
            }
        });
        jPanelRegistrarTrabajadores.add(jButtonEliminarConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        jLabel9.setText("Eliminar por ID");
        jPanelRegistrarTrabajadores.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jTextFieldCreateDriverMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCreateDriverMatriculaActionPerformed(evt);
            }
        });
        jPanelRegistrarTrabajadores.add(jTextFieldCreateDriverMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 100, -1));

        jLabel15.setText("Matricula");
        jPanelRegistrarTrabajadores.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabelRegisterInfo.setText("...");
        jPanelRegistrarTrabajadores.add(jLabelRegisterInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 170, -1));

        jTabbedPane1.addTab("Administrar Trabajadores", jPanelRegistrarTrabajadores);

        jPanelReporteTrabajadores.setBackground(new java.awt.Color(255, 255, 255));
        jPanelReporteTrabajadores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        jPanelReporteTrabajadores.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 420, 290));

        jLabel10.setText("Reportes en espera de Revision");
        jPanelReporteTrabajadores.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel11.setText("Remover Reporte revisado");
        jPanelReporteTrabajadores.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));
        jPanelReporteTrabajadores.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 70, -1));

        jButton7.setText("Eliminar reporte");
        jPanelReporteTrabajadores.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, -1));

        jLabel12.setText("Elegir por ID de trabajador");
        jPanelReporteTrabajadores.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        jTabbedPane1.addTab("Reportes de Trabajadores", jPanelReporteTrabajadores);

        jPanelReporteClientes.setBackground(new java.awt.Color(255, 255, 255));
        jPanelReporteClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable3);

        jPanelReporteClientes.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 410, 340));

        jLabel13.setText("Remover Reportes Revisados");
        jPanelReporteClientes.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));
        jPanelReporteClientes.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 120, -1));

        jButton8.setText("Eliminar Reporte");
        jPanelReporteClientes.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        jLabel14.setText("Elegir por ID de Cliente");
        jPanelReporteClientes.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        jTabbedPane1.addTab("Reportes de clientes", jPanelReporteClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButtonRegistrarConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarConductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegistrarConductorActionPerformed

    private void jButtonEliminarConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarConductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEliminarConductorActionPerformed

    private void jTextFieldCreateDriverIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCreateDriverIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCreateDriverIDActionPerformed

    private void jTextFieldCreateDriverPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCreateDriverPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCreateDriverPasswordActionPerformed

    private void jTextFieldreateDriverNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldreateDriverNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldreateDriverNameActionPerformed

    private void jTextFieldCreateDriverCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCreateDriverCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCreateDriverCedulaActionPerformed

    private void jTextFieldCreateDriverTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCreateDriverTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCreateDriverTelefonoActionPerformed

    private void jTextFieldCreateDriverMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCreateDriverMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCreateDriverMatriculaActionPerformed

    private void jTextFieldBuscarIDDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarIDDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarIDDriverActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    public javax.swing.JButton jButtonEliminarConductor;
    public javax.swing.JButton jButtonRegistrarConductor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLabelRegisterInfo;
    private javax.swing.JPanel jPanelFinanzas;
    private javax.swing.JPanel jPanelRegistrarTrabajadores;
    private javax.swing.JPanel jPanelRegistroUsuarios;
    private javax.swing.JPanel jPanelReporteClientes;
    private javax.swing.JPanel jPanelReporteTrabajadores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextArea jTextAreaDriverBuscado;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    public javax.swing.JTextField jTextFieldBuscarIDDriver;
    public javax.swing.JTextField jTextFieldCreateDriverCedula;
    public javax.swing.JTextField jTextFieldCreateDriverID;
    public javax.swing.JTextField jTextFieldCreateDriverMatricula;
    public javax.swing.JTextField jTextFieldCreateDriverPassword;
    public javax.swing.JTextField jTextFieldCreateDriverTelefono;
    public javax.swing.JTextField jTextFieldreateDriverName;
    // End of variables declaration//GEN-END:variables
}
