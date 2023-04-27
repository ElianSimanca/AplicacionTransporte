/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AcceptedService;
import Model.AcceptedServiceTableModel;
import Model.Listas;
import Model.Admin;
import Model.User;
import Model.Client;
import Model.ClientTableModel;
import Model.Driver;
import View.AdminWindow;
import View.UserLoginWindow;
import View.ClientWindow;
import View.DriverWindow;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Elian
 */
public class CTRLUserLogin implements ActionListener{
    
    private Driver driver;
    private DriverWindow driverw;
    private Client client;
    private User model;
    private ClientWindow Clientw;    
    private AdminWindow adminwindow;
    private UserLoginWindow view;
    Listas listas= Listas.getInstance();

    public CTRLUserLogin(User model, UserLoginWindow view,Driver Driver,Client Client,AdminWindow Adminw,ClientWindow ClientW, DriverWindow DriverW) {
        this.client= Client;
        this.driverw= DriverW;
        this.driver= Driver;
        this.adminwindow = Adminw;
        this.Clientw= ClientW;
        this.model = model;
        this.view = view;
        this.view.jButtonRegister.addActionListener(this);
        this.view.jButtonLogin.addActionListener(this);
        this.view.jButtonAdminLogin.addActionListener(this);
        this.view.jButtonDriverLogin.addActionListener(this);
        
        
    }
    
    public void start(){
        // Obtener la resolución de la pantalla
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension windowSize = view.getSize();
        // Calcular la posición x e y de la ventana para centrarla en la pantalla
        int x = (screenSize.width - windowSize.width) / 2;
        int y = (screenSize.height - windowSize.height) / 2;
        view.setLocation(x, y);    
        view.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== this.view.jButtonRegister){
            // Verificar si los campos están vacíos
    if (view.jTextFieldCreateUserID.getText().isEmpty() || view.jTextFieldCreateName.getText().isEmpty()||view.jTextFieldCreateCedula.getText().isEmpty()|| view.jTextFieldCreatePassword.getText().isEmpty()||view.jTextFieldCreateTelefono.getText().isEmpty()) {
        JOptionPane.showMessageDialog(view, "Por favor Rellene los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }
            
            // Asignacion de Datos a variables:
            String userID = view.jTextFieldCreateUserID.getText();         
            String name = view.jTextFieldCreateName.getText();
            String cedula = view.jTextFieldCreateCedula.getText();
            String phoneNumber = view.jTextFieldCreateTelefono.getText();
            String password = view.jTextFieldCreatePassword.getText();           
            String usertype = "cliente";
            
            // Verificar si los datos ya están registrados:
            ArrayList<User> users = listas.getUserslist();
            boolean isRegistered = false;
            for (User user : users) {
                    if (user.getUserID().equals(userID)) {
                        isRegistered = true;
                        break;
                    }
                    if (user.getCedula().equals(cedula)) {
                        isRegistered = true;
                        break;
                    }
                    if (user.getPhoneNumber().equals(phoneNumber)) {
                        isRegistered = true;
                        break;
                    }
                }
                //Si esta registrado sale un mensaje en pantalla y se detiene la ejecucion
                if (isRegistered == true) {
                    //Vaciar los textfield
                    view.jTextFieldCreateCedula.setText("");
                    view.jTextFieldCreatePassword.setText("");
                    view.jTextFieldCreateUserID.setText("");
                    view.jTextFieldCreateName.setText("");
                    view.jTextFieldCreateTelefono.setText("");
                    JOptionPane.showMessageDialog(view, "Los datos ya están registrados", "Error", JOptionPane.ERROR_MESSAGE);            
                  
                    
                // Si los datos no están registrados, registrar el usuario
                }else{
                    //Persistencia de datos
                    User newuser = new User( userID, name, cedula, phoneNumber, password, usertype);
                    Client newClient = new Client(userID, name, cedula, phoneNumber,usertype);

                    listas.addUser(newuser);
                    listas.addClient(newClient);
                    view.jLabelRegisterInfo.setText("Registro exitoso");
                    view.jLabelRegisterInfo.setForeground(Color.GREEN);
                    //Actualizar tabla de clientes:
                    ArrayList<Client>clients = listas.getClientslist();
                    ClientTableModel clientTableModel = new ClientTableModel(clients);
                    AdminWindow Adminw= new AdminWindow();
                    clientTableModel.actualizarClientTabla(clients, Adminw.jTableClientes);


                    //Vaciar los textfield
                    view.jTextFieldCreateCedula.setText("");
                    view.jTextFieldCreatePassword.setText("");
                    view.jTextFieldCreateUserID.setText("");
                    view.jTextFieldCreateName.setText("");
                    view.jTextFieldCreateTelefono.setText("");
                }
  
        //Si se presiona el boton login
        }else if(e.getSource()== this.view.jButtonLogin){
                    // Verificar si los campos están vacíos
            if (view.jTextFieldLoginClientID.getText().isEmpty()||view.jTextFieldLoginClientPassword.getText().isEmpty()) {
                JOptionPane.showMessageDialog(view, "Por favor Rellene los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String userid = view.jTextFieldLoginClientID.getText();
            String password = view.jTextFieldLoginClientPassword.getText();
            //Se verifica si el ID de usuario esta registrado
            ArrayList<User> users = listas.getUserslist();
            boolean isRegistered = false;
            for(User user : users){
                
                if(user.getUserID().equals(userid)&& user.getPassword().equals(password)){
                    isRegistered = true;
                    break;
                    
                }              
            }
            
            
            if(isRegistered== true){
                
                //Buscamos la posicion de los datos del Usuario que se acaba de logear
                int position = -1; // inicializamos la posición en -1
                for (int i = 0; i < users.size(); i++) {
                    User user = users.get(i);
                    if (user.getUserID().equals(userid) && user.getPassword().equals(password)) {
                        position = i; // guardamos la posición actual
                        break;
                    }
                }
                
                User user = users.get(position);
                String name = user.getName();
                String cedula = user.getCedula();
                String phoneNumber = user.getPhoneNumber();
                String UserType = user.getUserType();
                String UserID = user.getUserID();
                    
                
                // Se inicia la ventana ClientWindow y se ponen los datos del usuario en la ventana
                CTRLClientWindow clientw = new CTRLClientWindow(Clientw,client);
                clientw.start();
                             
                // ... hacer algo con los otros datos recuperados ... 
                Clientw.jTextFieldDataClientID.setText(UserID);
                Clientw.jTextFieldDataClientNombre.setText(name);
                Clientw.jTextFieldDataClientCedula.setText(cedula);
                Clientw.jTextFieldDataClientTelefono.setText(phoneNumber);
                Clientw.jTextFieldDataClientUserType.setText(UserType);                      
            }else{
                view.jTextFieldLoginClientID.setText("");
                view.jTextFieldLoginClientPassword.setText("");
                JOptionPane.showMessageDialog(view, "El UserID o la contraseña no estan correctas", "Arvertencia", JOptionPane.ERROR_MESSAGE);
            }
            
            
            //Si se presiona el Boton Login Driver
        } else if(e.getSource()==this.view.jButtonDriverLogin){
                    // Verificar si los campos están vacíos
            if (view.jTextFieldLoginDriverID.getText().isEmpty()||view.jTextFieldLoginDriverPassword.getText().isEmpty()) {
                JOptionPane.showMessageDialog(view, "Por favor Rellene los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String driverid = view.jTextFieldLoginDriverID.getText();
            String driverPassword = view.jTextFieldLoginDriverPassword.getText();
            
            //Validar contraseña y id del conductor 
            ArrayList<Driver> drivers = listas.getDriverlist();
            boolean isRegistered= false;
            for(Driver driver: drivers){
                if(driver.getUserID().equals(driverid) && driver.getPassword().equals(driverPassword)){
                    isRegistered = true;
                        break;
                }
            }
            
            
            if(isRegistered ==true){
                
                CTRLDriverWindow cdw = new CTRLDriverWindow(driverw,driver);
                cdw.start();
                
                int position = -1;
                for(int i=0; i < drivers.size();i++){
                    Driver driver = drivers.get(i);
                    if(driver.getUserID().equals(driverid) && driver.getPassword().equals(driverPassword)){
                        position = i; //Guardamos la posicion actual
                        break;
                    }
                }
                
                
                driverw.jTextFieldDataDriverMatricula.setText(drivers.get(position).getMatricula());
                driverw.jTextFieldDataDriverID.setText(drivers.get(position).getUserID());
                driverw.jTextFieldDataDriverCedula.setText(drivers.get(position).getCedula());
                driverw.jTextFieldDataDriverTelefono.setText(drivers.get(position).getPhoneNumber());
                driverw.jTextFieldDataDriverName.setText(drivers.get(position).getName());
                driverw.jTextFieldDataDriverUserType.setText(drivers.get(position).getUserType());
            }else{
                JOptionPane.showMessageDialog(view, "El USerID o la Contraseña son Incorrectas");
            }
  
            
            // Si se presiona el Boton Login Admin
        }else if(e.getSource()== this.view.jButtonAdminLogin){
                    // Verificar si los campos están vacíos
            if (view.jTextFieldAdminID.getText().isEmpty()||view.jTextFieldAdminPassword.getText().isEmpty()) {
                JOptionPane.showMessageDialog(view, "Por favor Rellene los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Admin admin= new Admin();          
            if(view.jTextFieldAdminID.getText().equals(admin.getAmindID()) && view.jTextFieldAdminPassword.getText().equals(admin.getPassword()) ){
                CTRLAdminWindow admincontrol = new CTRLAdminWindow(driver,adminwindow);
                //Ponemos los datos de las finanzas en la tabla
                ArrayList<AcceptedService> listaservicios= listas.getServiciosAceptados();
                AcceptedServiceTableModel model = new AcceptedServiceTableModel(listaservicios);
                AdminWindow.jTableFinanzas.setModel(model);
                
                //Ponemos el valor total recaudado en el jtextfield:
                ArrayList<AcceptedService> acsm = listas.getServiciosAceptados();    
                float totalrecaudado = acsm.size()*8000;
                String strTotalRecaudado = Float.toString(totalrecaudado);
                AdminWindow.jTextFieldTotalRecaudado.setText(strTotalRecaudado);
                admincontrol.start();
                
            }else{
                JOptionPane.showMessageDialog(view, "El AdminID o la contraseña no estan correctas", "Arvertencia", JOptionPane.ERROR_MESSAGE);
            }
        } 
    }   
}


        