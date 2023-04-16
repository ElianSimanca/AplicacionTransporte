/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author Elian
 */
public class ClientWindow extends javax.swing.JFrame {

    /**
     * Creates new form UserWindow
     */
    public ClientWindow() {
        initComponents();
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        
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
        jButtonEnviarPeticion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUbicacionActual = new javax.swing.JTextField();
        jTextFieldDestino = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaRegistroDeProgreso = new javax.swing.JTextArea();
        jButtonCancelarTaxi = new javax.swing.JButton();
        jButtonReportarTaxista = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelBienvenido = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldDataClientUserType = new javax.swing.JTextField();
        jTextFieldDataClientCedula = new javax.swing.JTextField();
        jTextFieldDataClientNombre = new javax.swing.JTextField();
        jTextFieldDataClientID = new javax.swing.JTextField();
        jTextFieldDataClientTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonEnviarPeticion.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEnviarPeticion.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jButtonEnviarPeticion.setText("Enviar peticion");
        jPanel1.add(jButtonEnviarPeticion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel1.setText("Ubicacion actual");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel2.setText("Destino");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));
        jPanel1.add(jTextFieldUbicacionActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 100, -1));
        jPanel1.add(jTextFieldDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 100, -1));

        jTextAreaRegistroDeProgreso.setColumns(20);
        jTextAreaRegistroDeProgreso.setRows(5);
        jScrollPane2.setViewportView(jTextAreaRegistroDeProgreso);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 340, -1));

        jButtonCancelarTaxi.setText("Cancelar Taxi");
        jButtonCancelarTaxi.setEnabled(false);
        jPanel1.add(jButtonCancelarTaxi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jButtonReportarTaxista.setText("Reportar Taxista");
        jButtonReportarTaxista.setEnabled(false);
        jPanel1.add(jButtonReportarTaxista, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));

        jLabel3.setText("Precio de Viaje: 8000 pesos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jLabel4.setText("Estado del Servicio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jButton1.setText("Cerrar Sesion");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 130, -1));

        jLabelBienvenido.setText("Bienvenido");
        jPanel1.add(jLabelBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jTabbedPane1.addTab("Pedir Taxi", jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reportes Activos", jPanel4);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Datos Personales");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jTextFieldDataClientUserType.setEnabled(false);
        jPanel2.add(jTextFieldDataClientUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 120, -1));

        jTextFieldDataClientCedula.setEnabled(false);
        jPanel2.add(jTextFieldDataClientCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 120, -1));

        jTextFieldDataClientNombre.setEnabled(false);
        jPanel2.add(jTextFieldDataClientNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 120, -1));

        jTextFieldDataClientID.setEnabled(false);
        jPanel2.add(jTextFieldDataClientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 120, -1));

        jTextFieldDataClientTelefono.setEnabled(false);
        jPanel2.add(jTextFieldDataClientTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 120, -1));

        jLabel5.setText("Nombre");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel7.setText("Cedula");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel8.setText("Numero Telefonico");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel9.setText("Tipo de Usuario");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel10.setText("ClientID");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jTabbedPane1.addTab("Datos Personales", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButtonCancelarTaxi;
    public javax.swing.JButton jButtonEnviarPeticion;
    public javax.swing.JButton jButtonReportarTaxista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTextArea jTextAreaRegistroDeProgreso;
    public javax.swing.JTextField jTextFieldDataClientCedula;
    public javax.swing.JTextField jTextFieldDataClientID;
    public javax.swing.JTextField jTextFieldDataClientNombre;
    public javax.swing.JTextField jTextFieldDataClientTelefono;
    public javax.swing.JTextField jTextFieldDataClientUserType;
    public javax.swing.JTextField jTextFieldDestino;
    public javax.swing.JTextField jTextFieldUbicacionActual;
    // End of variables declaration//GEN-END:variables
}
