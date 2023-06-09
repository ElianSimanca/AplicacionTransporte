/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Elian
 */
public class ClientRequest extends Client{
    private String Ubicacion;
    private String Destino;
    private Date hora;
    private float payment;

    public ClientRequest( String Ubicacion, String Destino, Date hora, float payment, String userID, String name, String cedula, String PhoneNumber, String userType) {
        super(userID, name, cedula, PhoneNumber, userType);
        this.Ubicacion = Ubicacion;
        this.Destino = Destino;
        this.hora = hora;
        this.payment = payment;
    }

    

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }
    

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }      

    public float getPayment() {
        return payment;
    }

    public void setPayment(float payment) {
        this.payment = payment;
    }
    
    
}
