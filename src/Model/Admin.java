/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Elian
 */
public class Admin {
    private final String AmindID = "3131";
    private final String password = "Admin";
    Listas listas;

    public Admin() {
        this.listas= Listas.getInstance();
    }
     

    public String getPassword() {
        return password;
    }
        
    public String getAmindID() {
        return AmindID;
    } 
    
    // Métodos específicos para el administrador
    public void AddCab() {
        // Implementar lógica para agregar un nuevo taxista
    }
    
    public void DeleteCab() {
        // Implementar lógica para eliminar un taxista existente
    }
    
    public void DeleteClient() {
        // Implementar lógica para eliminar un cliente existente
    }
    
    public void ViewReports() {
        // Implementar lógica para ver reportes de la aplicación
    }
    
    public void RegistrarConductor(String matricula, String userID, String name, String cedula, String PhoneNumber, String userType,String password){
        Driver driver = new Driver(matricula,userID,name,cedula,PhoneNumber,userType,password);       
        listas.addDriver(driver);
        
    }
    
    public void EliminarConductor(int indice){ 
        listas.deleteDriver(indice);
    }
    public void EliminarUsuario(int indice){
        listas.deleteUser(indice);
    }
}
