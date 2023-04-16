/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Elian
 */
public class Driver extends User implements Serializable{
    private static final long serialVersionUID = 4563326279871677993L;
    private String matricula;
    private AcceptedService servicioAceptado;

    

    public Driver(String matricula, String userID, String name, String cedula, String PhoneNumber, String userType,String password) {
        super(userID, name, cedula, PhoneNumber,password, userType);
        this.matricula = matricula;
    } 

   

    public String getMatricula() {
        return matricula;
    }
    
    //*Metodos
    
    public void AcceptService(ColaClientRequest c){
        if(c.estaVacia()){
            //Guardo el dato desencolado y desencolo el dato
            ClientRequest servicio = c.getPrimero();
            c.desencolar();
            //Guardar el dato Aceptado en memoria
            servicioAceptado = new AcceptedService(servicio,this);          
        }
        
    }
    
    public void CancelService() {
    if (this.servicioAceptado== null) {   
        JOptionPane.showMessageDialog(null,"No hay servicios para cancelar.");
    } else {     
        // imprime la información del servicio antes de eliminarlo
        JOptionPane.showMessageDialog(null, "El servicio ha sido cancelado correctamente: " + servicioAceptado.getHora() + " - " + servicioAceptado.getUbicacion() + " - " + servicioAceptado.getDestino());
        // elimina el servicio de la lista
        servicioAceptado=null;
        }
    }
    
    public void EndService(){
        if (this.servicioAceptado== null) {   
        JOptionPane.showMessageDialog(null,"No hay servicios para Terminar.");
    } else {     
        // imprime la información del servicio antes de eliminarlo
        JOptionPane.showMessageDialog(null, "El servicio ha sido Terminado correctamente: " + servicioAceptado.getHora() + " - " + servicioAceptado.getUbicacion() + " - " + servicioAceptado.getDestino());
        // elimina el servicio de la lista
        
           
        }
    }
}
