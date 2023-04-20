/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Elian
 */
public class AcceptedService implements Serializable{
    private static final long serialVersionUID = -5285470270309768353L;
    //Servicio
    private String hora;
    private String Ubicacion;
    private String Destino;
    private float payment;
    //Taxista
    private String matricula;
    private String DriveruserID;
    private String Drivername;
    private String Drivercedula;
    private String DriverPhoneNumber;
    
    //Cliente
    private String ClientuserID;
    private String Clientname;
    private String Clientcedula;
    private String ClientPhoneNumber;
    
    private String estadoDelServicio;
    
    
    
    public AcceptedService(ClientRequest c,Driver d,String estadoDelServicio) {
        //servicio
        this.hora= c.getHora();
        this.Ubicacion= c.getUbicacion();
        this.Destino = c.getDestino();
        this.payment = c.getPayment();
        this.estadoDelServicio= estadoDelServicio;
        //Taxista
        this.matricula = d.getMatricula();
        this.DriveruserID = d.getUserID();
        this.Drivername= d.getName();
        this.Drivercedula = d.getCedula();
        this.DriverPhoneNumber= d.getPhoneNumber();
        //Cliente
        this.ClientuserID= c.getUserID();
        this.Clientname= c.getName();
        this.Clientcedula= c.getCedula();
        this.ClientPhoneNumber = c.getPhoneNumber();
    }
    
    

    public void setEstadoDelServicio(String estadoDelServicio) {
        this.estadoDelServicio = estadoDelServicio;
    }
    
    

    public String getEstadoDelServicio() {
        return estadoDelServicio;
    }
    

    public String getHora() {
        return hora;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public String getDestino() {
        return Destino;
    }

    public float getPayment() {
        return payment;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDriveruserID() {
        return DriveruserID;
    }

    public String getDrivername() {
        return Drivername;
    }

    public String getDrivercedula() {
        return Drivercedula;
    }

    public String getDriverPhoneNumber() {
        return DriverPhoneNumber;
    }

    public String getClientuserID() {
        return ClientuserID;
    }

    public String getClientname() {
        return Clientname;
    }

    public String getClientcedula() {
        return Clientcedula;
    }

    public String getClientPhoneNumber() {
        return ClientPhoneNumber;
    }
    
    
    
    
 
    
}
