/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AcceptedService;
import Model.AcceptedServiceTableModel;
import Model.ClientRequest;
import Model.ColaClientRequest;
import Model.Driver;
import Model.Listas;
import View.AdminWindow;
import View.ClientWindow;
import View.DriverWindow;
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
public class CTRLDriverWindow implements ActionListener{
    private DriverWindow view;
    private Driver driver;

    Listas listas = new Listas();

    public CTRLDriverWindow(DriverWindow view, Driver Driver) {
        this.view = view;
        this.driver= Driver;
        view.jButtonAceptarServicio.addActionListener(this);
        view.jButtonFinalizarServicio.addActionListener(this);
        view.jButtonReportarCliente.addActionListener(this);  
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
        if(e.getSource()== view.jButtonAceptarServicio){
            String DataProgreso="Aceptado y en Progreso";
            String dID= view.jTextFieldDataDriverID.getText();
            String dNombre= view.jTextFieldDataDriverName.getText();
            String dCedula= view.jTextFieldDataDriverCedula.getText();
            String dPassword= "";
            String dTelefono= view.jTextFieldDataDriverTelefono.getText();
            String dUserType= view.jTextFieldDataDriverUserType.getText();
            String dMatricula= view.jTextFieldDataDriverMatricula.getText();
            Driver dataDriver = new Driver( dMatricula,  dID,  dNombre,  dCedula, dTelefono, dUserType, dPassword);
  
            ClientRequest solicitud = ColaClientRequest.desencolar();
            
            
            if(solicitud==null){
                
            }else{
                AcceptedService acceptedService =new AcceptedService(solicitud,dataDriver,DataProgreso);
                
                listas.addAcceptedService(acceptedService);
                JOptionPane.showMessageDialog(view, "Peticion de servicio Aceptada, Dirijase a "+ acceptedService.getUbicacion()+" Para recoger a su cliente","Advertencia",JOptionPane.WARNING_MESSAGE);
                
                //Añade los datos a la tabla de progreso de servicio
                ArrayList<AcceptedService> acs = new ArrayList();
                acs.add(acceptedService);
                AcceptedServiceTableModel tablemodel = new AcceptedServiceTableModel(acs);
                view.jTableEstadoDelServicioAceptado.setModel(tablemodel);
                //Actualiza tabla en ventana del cliente tambien:
                ClientWindow.jTableProgresoServicioUsuario.setModel(tablemodel);
                ClientWindow.jLabeEstadoDelPedido.setText("Un taxi esta en Camino para atenderte...");
                
                System.out.println(solicitud.getDestino());
                System.out.println(solicitud.getName());
                System.out.println(solicitud.getHora());
                System.out.println(solicitud.getUbicacion());
                
            }
            
            
            
            
            
         
            
        }else if(e.getSource()== view.jButtonFinalizarServicio){
            String dID= view.jTextFieldDataDriverID.getText();
            String DataProgreso="Aceptado y en Progreso";
            int posicion = -1;
            ArrayList<AcceptedService> accetepServices = listas.getServiciosAceptados();
            for(int i = 0 ; i< listas.getServiciosAceptados().size(); i++){          
                AcceptedService acceptedService = accetepServices.get(i);
                if(acceptedService.getDriveruserID().equals(dID)&& acceptedService.getEstadoDelServicio().equals(DataProgreso)){
                    posicion = i;
                    break;
                }
            }
            
            String EstadoServicio ="Concluido";
            AcceptedService acceptedService = accetepServices.get(posicion);
            acceptedService.setEstadoDelServicio(EstadoServicio);
            //Actualiza la tabla con la nueva informacion:
            ArrayList<AcceptedService> acs = new ArrayList();
            acs.add(acceptedService);
            AcceptedServiceTableModel tablemodel = new AcceptedServiceTableModel(acs);
            view.jTableEstadoDelServicioAceptado.setModel(tablemodel);
            //Actualiza tabla en ventana del cliente tambien:
            ClientWindow.jLabeEstadoDelPedido.setText("Tu carrera ha terminado con exito");
            ClientWindow.jTableProgresoServicioUsuario.setModel(tablemodel);
            //Actualizar la tabla de finanzas
            ArrayList<AcceptedService> acsm = listas.getServiciosAceptados();
            AcceptedServiceTableModel tablemodelfinanzas = new AcceptedServiceTableModel(acsm);
            AdminWindow.jTableFinanzas.setModel(tablemodelfinanzas);
            float totalrecaudado = acsm.size()*8000;
            String strTotalRecaudado = Float.toString(totalrecaudado);
            AdminWindow.jTextFieldTotalRecaudado.setText(strTotalRecaudado);
            
           
        }else if (e.getSource()== view.jButtonReportarCliente){
            
        }
    }
    
    
}


