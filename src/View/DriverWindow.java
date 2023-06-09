/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author Elian
 */
public class DriverWindow extends javax.swing.JFrame {

    /**
     * Creates new form CabWindow
     */
    public DriverWindow() {
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
        jPanel1 = new javax.swing.JPanel();
        jButtonReportarCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonAceptarServicio = new javax.swing.JButton();
        jButtonFinalizarServicio = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableEstadoDelServicioAceptado = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDataDriverCedula = new javax.swing.JTextField();
        jTextFieldDataDriverTelefono = new javax.swing.JTextField();
        jTextFieldDataDriverID = new javax.swing.JTextField();
        jTextFieldDataDriverMatricula = new javax.swing.JTextField();
        jTextFieldDataDriverUserType = new javax.swing.JTextField();
        jTextFieldDataDriverName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonReportarCliente.setText("Reportar Cliente");
        jButtonReportarCliente.setEnabled(false);
        jPanel1.add(jButtonReportarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 110, 30));

        jLabel2.setText("Estado del Servicio");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jButtonAceptarServicio.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAceptarServicio.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jButtonAceptarServicio.setText("Acceptar una Carrera");
        jButtonAceptarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarServicioActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAceptarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 290, 100));

        jButtonFinalizarServicio.setText("Finalizar Servicio");
        jPanel1.add(jButtonFinalizarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 170, 70));

        jTableEstadoDelServicioAceptado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "...", "...", "...", "..."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableEstadoDelServicioAceptado);
        if (jTableEstadoDelServicioAceptado.getColumnModel().getColumnCount() > 0) {
            jTableEstadoDelServicioAceptado.getColumnModel().getColumn(0).setResizable(false);
            jTableEstadoDelServicioAceptado.getColumnModel().getColumn(1).setResizable(false);
            jTableEstadoDelServicioAceptado.getColumnModel().getColumn(2).setResizable(false);
            jTableEstadoDelServicioAceptado.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 630, 40));

        jTabbedPane1.addTab("Driver Panel", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Reportes activos", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Datos de Usuario");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 30, 110, -1));
        jPanel3.add(jTextFieldDataDriverCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 100, -1));
        jPanel3.add(jTextFieldDataDriverTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 100, -1));
        jPanel3.add(jTextFieldDataDriverID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 100, -1));
        jPanel3.add(jTextFieldDataDriverMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 100, -1));
        jPanel3.add(jTextFieldDataDriverUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 100, -1));
        jPanel3.add(jTextFieldDataDriverName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 100, -1));

        jTabbedPane1.addTab("Datos de Usuario", jPanel3);

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

    private void jButtonAceptarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAceptarServicioActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonAceptarServicio;
    public javax.swing.JButton jButtonFinalizarServicio;
    public javax.swing.JButton jButtonReportarCliente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable jTableEstadoDelServicioAceptado;
    public javax.swing.JTextField jTextFieldDataDriverCedula;
    public javax.swing.JTextField jTextFieldDataDriverID;
    public javax.swing.JTextField jTextFieldDataDriverMatricula;
    public javax.swing.JTextField jTextFieldDataDriverName;
    public javax.swing.JTextField jTextFieldDataDriverTelefono;
    public javax.swing.JTextField jTextFieldDataDriverUserType;
    // End of variables declaration//GEN-END:variables
}
