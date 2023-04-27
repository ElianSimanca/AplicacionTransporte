/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

import Controller.CTRLUserLogin;
import View.AdminWindow;
import View.ClientWindow;
import View.DriverWindow;
import View.UserLoginWindow;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Elian
 */
public class AplicacionTransporte {
    private static Listas listas = Listas.getInstance();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User usermodel = new User("","","","","","");
        UserLoginWindow userview = new UserLoginWindow();
        DriverWindow driverw = new DriverWindow();
        AdminWindow adminw= new AdminWindow();
        ClientWindow clientw = new ClientWindow();
        Client client = new Client("","","","","");
        Driver driver = new Driver("","","","","","","");
        
        
        CTRLUserLogin usercontroller = new CTRLUserLogin(usermodel, userview, driver, client, adminw, clientw,driverw);
        usercontroller.start();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                AlarmaAutomatica();
            }
        }, 0, 60000); // Ejecutar cada 1 minuto
 
    }
    public static void AlarmaAutomatica(){
       
        String estado = "Aceptado y en Progreso";
        if(!listas.getServiciosAceptados().isEmpty()){
            for (int i = 0; i < listas.getServiciosAceptados().size(); i++) {
                // Código dentro del bucle
                long TiempoTranscurrido = tiempoTranscurrido(i);
                if(TiempoTranscurrido>60 && listas.getServiciosAceptados().get(i).getEstadoDelServicio().equals(estado)){
                    
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
                    
                    
                    
                    
                
                }else{ //Si Supera el tiempo limite entonces se cancela el servicio:
                    
                      System.out.println("no se cumplen lo requisitos");  
                    
  
                    //Aqui se va a añadir algo para reportar al conductor por no llegar a tiempo
                }
            }
        }    
    }
    
    public static long tiempoTranscurrido(int indice) {
        
        Date ahora = new Date();      
        long tiempo = ahora.getTime() - listas.getServiciosAceptados().get(indice).getHora().getTime();
        return tiempo / 1000; // devuelve el tiempo en segundos
    } 
    
}
