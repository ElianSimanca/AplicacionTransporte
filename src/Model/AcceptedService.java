/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import View.AdminWindow;
import View.ClientWindow;
import View.DriverWindow;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elian
 */
public class AcceptedService implements Serializable{
    private static final long serialVersionUID = -5285470270309768353L;
    //Servicio
    private Date hora;
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
    

    public Date getHora() {
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
    
    public static void AlarmaAutomatica(){
        Listas listas = new Listas();
        String estado = "Aceptado y en Progreso";
        if(listas.getServiciosAceptados().size()!=0){
            for (int i = 0; i < listas.getServiciosAceptados().size(); i++) {
                // Código dentro del bucle
                long TiempoTranscurrido = tiempoTranscurrido(i);
                if(TiempoTranscurrido>60&& listas.getServiciosAceptados().get(i).getEstadoDelServicio().equals(estado)){
                    
                }else{ //Si Supera el tiempo limite entonces se cancela el servicio:
                    JOptionPane.showMessageDialog(null,"El servicio de transporte de " +listas.getServiciosAceptados().get(i).getUbicacion()+ "hasta "+listas.getServiciosAceptados().get(i).getDestino() +"se ha cancelado automaticamente debido ha que ha superado el tiempo limite de espera","Advertencia",JOptionPane.WARNING_MESSAGE);
                    listas.deleteAcceptedService(i);
                    DefaultTableModel model = new DefaultTableModel();
                    model.setRowCount(0);
                    ClientWindow.jTableProgresoServicioUsuario.setModel(model);
                    DriverWindow.jTableEstadoDelServicioAceptado.setModel(model);
                    ClientWindow.jLabeEstadoDelPedido.setText("Se ha llegado al limite de espera, pida servicio en otro momento");
                    ArrayList<AcceptedService> acceptedServices = listas.getServiciosAceptados();
                    AcceptedServiceTableModel actm = new AcceptedServiceTableModel(acceptedServices);
                    AdminWindow.jTableFinanzas.setModel(actm);
                    
                    

                    //Aqui se va a añadir algo para reportar al conductor por no llegar a tiempo
                }
            }
        }    
    }
    
    public static long tiempoTranscurrido(int indice) {
        Listas listas = new Listas();
        Date ahora = new Date();      
        long tiempo = ahora.getTime() - listas.getServiciosAceptados().get(indice).getHora().getTime();
        return tiempo / 1000; // devuelve el tiempo en segundos
    }    
}
