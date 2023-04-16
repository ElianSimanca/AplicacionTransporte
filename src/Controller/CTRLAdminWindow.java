/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Client;
import Model.Driver;
import Model.User;
import View.AdminWindow;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Elian
 */
public class CTRLAdminWindow implements ActionListener{
    private Driver driver;
    private AdminWindow view;
    Listas listas = new Listas();

    public CTRLAdminWindow(Driver driver, AdminWindow view) {
        this.driver = driver;
        this.view = view;
        this.view.jButtonRegistrarConductor.addActionListener(this);
        this.view.jButtonEliminarConductor.addActionListener(this);
        this.view.jButtonEliminarCliente.addActionListener(this);
    }
    
    public void start(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension windowSize = view.getSize();
        // Calcular la posición x e y de la ventana para centrarla en la pantalla
        int x = (screenSize.width - windowSize.width) / 2;
        int y = (screenSize.height - windowSize.height) / 2;
        view.setLocation(x, y); 
        view.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e){
            view.requestFocus();
        }
        });
        view.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== this.view.jButtonRegistrarConductor){
            //Verificar si los campos estan vacios
            if(view.jTextFieldCreateDriverID.getText().isEmpty()|| view.jTextFieldreateDriverName.getText().isEmpty()||view.jTextFieldCreateDriverCedula.getText().isEmpty()||view.jTextFieldCreateDriverPassword.getText().isEmpty()||view.jTextFieldCreateDriverTelefono.getText().isEmpty() || view.jTextFieldCreateDriverMatricula.getText().isEmpty()){
                JOptionPane.showMessageDialog(view, "Por favor Rellene los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }           
                //Asignacion de datos a las variables
                String driverID= view.jTextFieldCreateDriverID.getText();
                String driverName= view.jTextFieldreateDriverName.getText();
                String driverCedula= view.jTextFieldCreateDriverCedula.getText();
                String driverTelefono= view.jTextFieldCreateDriverTelefono.getText();
                String usertype= "Conductor";
                String driverMatricula = view.jTextFieldCreateDriverMatricula.getText();
                
                String driverPassword= view.jTextFieldCreateDriverPassword.getText();
                
                // Verificar si los datos ya están registrados:                
                ArrayList<Driver> drivers = listas.getDriverlist();
                boolean isRegistered = false;
                for (Driver driver: drivers) {
                    if (driver.getUserID().equals(driverID)) {
                        isRegistered = true;
                        break;
                    }
                    if (driver.getCedula().equals(driverCedula)) {
                        isRegistered = true;
                        break;
                    }
                    if (driver.getPhoneNumber().equals(driverTelefono)) {
                        isRegistered = true;
                        break;
                    }
                }
                if(isRegistered== true){
                    //Vaciar los textfield
                    view.jTextFieldCreateDriverID.setText("");
                    view.jTextFieldreateDriverName.setText("");
                    view.jTextFieldCreateDriverCedula.setText("");
                    view.jTextFieldCreateDriverMatricula.setText("");
                    view.jTextFieldCreateDriverPassword.setText("");
                    view.jTextFieldCreateDriverTelefono.setText("");
                    JOptionPane.showMessageDialog(view, "Los datos ya están registrados", "Error", JOptionPane.ERROR_MESSAGE);
                }else{
                    Driver newdriver= new Driver(driverMatricula,  driverID,  driverName,  driverCedula, driverTelefono,  usertype,driverPassword);
                    User newUser= new User(driverID,  driverName,  driverCedula,  driverTelefono, driverPassword,  usertype);
                    listas.addUser(newUser);
                    listas.addDriver(newdriver);
                 
                    view.jLabelRegisterInfo.setText("Registro exitoso");
                    view.jLabelRegisterInfo.setForeground(Color.GREEN);
                    //Vaciar los textfield
                    view.jTextFieldCreateDriverID.setText("");
                    view.jTextFieldreateDriverName.setText("");
                    view.jTextFieldCreateDriverCedula.setText("");
                    view.jTextFieldCreateDriverMatricula.setText("");
                    view.jTextFieldCreateDriverPassword.setText("");
                    view.jTextFieldCreateDriverTelefono.setText("");
                } 
            
        }else if(e.getSource()== this.view.jButtonEliminarConductor){
            if(view.jTextFieldBuscarIDDriver.getText().isEmpty()){
                JOptionPane.showMessageDialog(view, "Por favor Rellene el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            } 
            String driverID= view.jTextFieldBuscarIDDriver.getText();
             //Buscamos la posicion del Conductor el cual se quiere eliminar:
            ArrayList<Driver> drivers = listas.getDriverlist();
            int Dposition = -1; // inicializamos la posición en -1
            for (int i = 0; i < drivers.size(); i++) {
                Driver Driver = drivers.get(i);
                if (Driver.getUserID().equals(driverID)) {
                    Dposition = i; // guardamos la posición actual
                    break;
                }
            }
            //Con la posicion sel conductor obtenida, se procede a eliminar al conductor:
            if (Dposition == -1) {                   
                
                JOptionPane.showMessageDialog(view, "Ese Trabajador no existe en el sistema", "Error", JOptionPane.ERROR_MESSAGE);
                
            }else{  
                JOptionPane.showMessageDialog(view, "El Trabajador "+ listas.getDriverlist().get(Dposition).getName()+" ha sido eliminado del Sistema.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                listas.deleteDriver(Dposition);
                
                //El mismo codigo anterior pero para buscar y eliminarlo de la lista general de usuarios:
                 ArrayList<User> users = listas.getUserslist();
                int Sposition = -1; // inicializamos la posición en -1
                for (int i = 0; i < users.size(); i++) {
                    User user = users.get(i);
                    if (user.getUserID().equals(driverID)) {
                        Sposition = i; // guardamos la posición actual
                        break;
                    }             
                }
                //Eliminar Usuario tambien
                listas.deleteUser(Sposition);
            }
            
        }else if(e.getSource()== this.view.jButtonEliminarCliente){
            if(view.jTextFieldBuscarClienteID.getText().isEmpty()){
                JOptionPane.showMessageDialog(view, "Por favor Rellene el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;         
            }
            String ClientID = view.jTextFieldBuscarClienteID.getText();
            //Buscamos la posicion del cliente el cual se quiere eliminar:
            ArrayList<Client> clients = listas.getClientslist();
            int Cposition = -1;
            for(int i= 0; i > clients.size();i++){
                Client client = clients.get(i);
                if(client.getUserID().equals(ClientID)){
                    Cposition = i;
                    break;
                }
                
            }
            
            if(Cposition == -1){
                JOptionPane.showMessageDialog(view, "El cliente no existe en el sistema", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(view, "El Trabajador "+ listas.getClientslist().get(Cposition).getName()+" ha sido eliminado del Sistema.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                listas.deleteClient(Cposition);
                
                //El mismo codigo anterior pero para buscar y eliminarlo de la lista general de usuarios:
                 ArrayList<User> users = listas.getUserslist();
                int Sposition = -1; // inicializamos la posición en -1
                for (int i = 0; i < users.size(); i++) {
                    User user = users.get(i);
                    if (user.getUserID().equals(ClientID)) {
                        Sposition = i; // guardamos la posición actual
                        break;
                    }             
                }
                //Eliminar Usuario tambien
                listas.deleteUser(Sposition);
            }
            
        }     
    }    
}
    
    

