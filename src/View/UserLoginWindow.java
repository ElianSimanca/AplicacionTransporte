/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Component;

/**
 *
 * @author Elian
 */
public class UserLoginWindow extends javax.swing.JFrame {
    ;
    /**
     * Creates new form UserLoginWindow
     */
    
    public UserLoginWindow() {
       
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

        jTabbedPaneVentanas = new javax.swing.JTabbedPane();
        jPanelLoginWindow = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelRegister = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelLogin = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelUserID = new javax.swing.JLabel();
        jTextFieldLoginClientID = new javax.swing.JTextField();
        jTextFieldLoginClientPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonLogin = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTextFieldCreateName = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jLabelCreateUserID = new javax.swing.JLabel();
        jTextFieldCreateUserID = new javax.swing.JTextField();
        jTextFieldCreatePassword = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCreateCedula = new javax.swing.JTextField();
        jTextFieldCreateTelefono = new javax.swing.JTextField();
        jLabelCedula = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonRegister = new javax.swing.JButton();
        jLabelRegisterInfo = new javax.swing.JLabel();
        jPanelCabLogin = new javax.swing.JPanel();
        jTextFieldLoginDriverID = new javax.swing.JTextField();
        jTextFieldLoginDriverPassword = new javax.swing.JTextField();
        jButtonDriverLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabelLogin5 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanelAdministradorLogin = new javax.swing.JPanel();
        jButtonAdminLogin = new javax.swing.JButton();
        jTextFieldAdminID = new javax.swing.JTextField();
        jTextFieldAdminPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabelLogin2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPaneVentanas.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPaneVentanas.setPreferredSize(new java.awt.Dimension(550, 575));
        jTabbedPaneVentanas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPaneVentanasMouseClicked(evt);
            }
        });

        jPanelLoginWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRegister.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabelRegister.setText("Register");
        jPanel1.add(jLabelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 100, 40));

        jPanelLoginWindow.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 280, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogin.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabelLogin.setText("Login");
        jPanel2.add(jLabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 80, 40));

        jPanelLoginWindow.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUserID.setText("User ID:");
        jPanel3.add(jLabelUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        jPanel3.add(jTextFieldLoginClientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 120, -1));
        jPanel3.add(jTextFieldLoginClientPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 120, -1));

        jLabel4.setText("Password:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 120, 30));

        jPanelLoginWindow.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 270, 390));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCreateName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCreateNameActionPerformed(evt);
            }
        });
        jTextFieldCreateName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCreateNameKeyPressed(evt);
            }
        });
        jPanel4.add(jTextFieldCreateName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 110, -1));

        jLabelName.setText("Name:");
        jPanel4.add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jLabelCreateUserID.setText("CreateUser ID:");
        jPanel4.add(jLabelCreateUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 90, -1));

        jTextFieldCreateUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCreateUserIDActionPerformed(evt);
            }
        });
        jTextFieldCreateUserID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCreateUserIDKeyPressed(evt);
            }
        });
        jPanel4.add(jTextFieldCreateUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 110, -1));

        jTextFieldCreatePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCreatePasswordActionPerformed(evt);
            }
        });
        jTextFieldCreatePassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCreatePasswordKeyPressed(evt);
            }
        });
        jPanel4.add(jTextFieldCreatePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 110, -1));

        jLabel8.setText("Create Password:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 100, -1));

        jTextFieldCreateCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCreateCedulaActionPerformed(evt);
            }
        });
        jTextFieldCreateCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCreateCedulaKeyPressed(evt);
            }
        });
        jPanel4.add(jTextFieldCreateCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 110, -1));

        jTextFieldCreateTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCreateTelefonoActionPerformed(evt);
            }
        });
        jTextFieldCreateTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCreateTelefonoKeyPressed(evt);
            }
        });
        jPanel4.add(jTextFieldCreateTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 110, -1));

        jLabelCedula.setText("Cedula:");
        jPanel4.add(jLabelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel7.setText("Telefono:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jButtonRegister.setText("Register");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 220, 30));

        jLabelRegisterInfo.setText("...");
        jPanel4.add(jLabelRegisterInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 220, 20));

        jPanelLoginWindow.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 280, 390));

        jTabbedPaneVentanas.addTab("User Login", jPanelLoginWindow);

        jPanelCabLogin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCabLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelCabLogin.add(jTextFieldLoginDriverID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 90, -1));
        jPanelCabLogin.add(jTextFieldLoginDriverPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 90, -1));

        jButtonDriverLogin.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDriverLogin.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jButtonDriverLogin.setText("Login");
        jPanelCabLogin.add(jButtonDriverLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 150, 30));

        jLabel1.setText("Drive ID");
        jPanelCabLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabel2.setText("Password");
        jPanelCabLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogin5.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabelLogin5.setText("Login");
        jPanel5.add(jLabelLogin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 70, 40));

        jPanelCabLogin.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 60));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelCabLogin.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 170, 390));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelCabLogin.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 30, 390));

        jTabbedPaneVentanas.addTab("CabLogin", jPanelCabLogin);

        jPanelAdministradorLogin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAdministradorLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAdminLogin.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAdminLogin.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jButtonAdminLogin.setText("Login");
        jPanelAdministradorLogin.add(jButtonAdminLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 200, 30));
        jPanelAdministradorLogin.add(jTextFieldAdminID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 100, -1));
        jPanelAdministradorLogin.add(jTextFieldAdminPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 100, -1));

        jLabel3.setText("Admin ID");
        jPanelAdministradorLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jLabel5.setText("Admin Password");
        jPanelAdministradorLogin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogin2.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabelLogin2.setText("Login");
        jPanel6.add(jLabelLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 80, 40));

        jPanelAdministradorLogin.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 60));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelAdministradorLogin.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 140, 390));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelAdministradorLogin.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 160, 390));

        jTabbedPaneVentanas.addTab("Admin Login", jPanelAdministradorLogin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneVentanas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneVentanas, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPaneVentanas.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // TODO add your handling code here:
        
        
        
       
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jTextFieldCreateNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCreateNameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldCreateNameActionPerformed

    private void jTextFieldCreateUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCreateUserIDActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldCreateUserIDActionPerformed

    private void jTextFieldCreatePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCreatePasswordActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldCreatePasswordActionPerformed

    private void jTextFieldCreateCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCreateCedulaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldCreateCedulaActionPerformed

    private void jTextFieldCreateTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCreateTelefonoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldCreateTelefonoActionPerformed

    private void jTextFieldCreateNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCreateNameKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldCreateNameKeyPressed

    private void jTextFieldCreateUserIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCreateUserIDKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldCreateUserIDKeyPressed

    private void jTextFieldCreatePasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCreatePasswordKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldCreatePasswordKeyPressed

    private void jTextFieldCreateCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCreateCedulaKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldCreateCedulaKeyPressed

    private void jTextFieldCreateTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCreateTelefonoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCreateTelefonoKeyPressed

    private void jTabbedPaneVentanasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPaneVentanasMouseClicked
        // TODO add your handling code here:
        int tabIndex = jTabbedPaneVentanas.getSelectedIndex(); // Obtener el índice de la pestaña seleccionada
    Component selectedComponent = jTabbedPaneVentanas.getComponentAt(tabIndex); // Obtener el componente asociado a la pestaña seleccionada
    selectedComponent.requestFocus(); // Solicitar el foco en el componente asociado a la pestaña seleccionada
    }//GEN-LAST:event_jTabbedPaneVentanasMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonAdminLogin;
    public javax.swing.JButton jButtonDriverLogin;
    public javax.swing.JButton jButtonLogin;
    public javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabelCedula;
    public javax.swing.JLabel jLabelCreateUserID;
    public javax.swing.JLabel jLabelLogin;
    public javax.swing.JLabel jLabelLogin2;
    public javax.swing.JLabel jLabelLogin5;
    public javax.swing.JLabel jLabelName;
    public javax.swing.JLabel jLabelRegister;
    public javax.swing.JLabel jLabelRegisterInfo;
    public javax.swing.JLabel jLabelUserID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelAdministradorLogin;
    private javax.swing.JPanel jPanelCabLogin;
    private javax.swing.JPanel jPanelLoginWindow;
    public javax.swing.JTabbedPane jTabbedPaneVentanas;
    public javax.swing.JTextField jTextFieldAdminID;
    public javax.swing.JTextField jTextFieldAdminPassword;
    public javax.swing.JTextField jTextFieldCreateCedula;
    public javax.swing.JTextField jTextFieldCreateName;
    public javax.swing.JTextField jTextFieldCreatePassword;
    public javax.swing.JTextField jTextFieldCreateTelefono;
    public javax.swing.JTextField jTextFieldCreateUserID;
    public javax.swing.JTextField jTextFieldLoginClientID;
    public javax.swing.JTextField jTextFieldLoginClientPassword;
    public javax.swing.JTextField jTextFieldLoginDriverID;
    public javax.swing.JTextField jTextFieldLoginDriverPassword;
    // End of variables declaration//GEN-END:variables
}
