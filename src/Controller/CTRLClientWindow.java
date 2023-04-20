/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Client;
import Model.ClientRequest;
import Model.ColaClientRequest;
import View.ClientWindow;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Elian
 */
public class CTRLClientWindow implements ActionListener{
    private Client model;
    private ClientWindow view;

    public CTRLClientWindow(ClientWindow View,Client Model) {
        this.view= View;
        this.model=Model;
        this.view.jButtonEnviarPeticion.addActionListener(this);
        this.view.jButtonCancelarTaxi.addActionListener(this);
        this.view.jButtonReportarTaxista.addActionListener(this);
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
    
    
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== this.view.jButtonEnviarPeticion){
            // Código para el botón Enviar Petición
            if(view.jTextFieldUbicacionActual.getText().isEmpty()||view.jTextFieldDestino.getText().isEmpty()){
                JOptionPane.showMessageDialog(view,"Por favor rellena los campos","Advertencia",JOptionPane.WARNING_MESSAGE);
                return;
            }
            String UbicacionActual= view.jTextFieldUbicacionActual.getText();
            String Destino= view.jTextFieldDestino.getText();
            String Nombre = view.jTextFieldDataClientNombre.getText();
            String ClientID = view.jTextFieldDataClientID.getText();
            String Cedula = view.jTextFieldDataClientCedula.getText();
            String Telefono= view.jTextFieldDataClientTelefono.getText();
            String UserType= view.jTextFieldDataClientUserType.getText();
            LocalTime horaActual= LocalTime.now();
            String hora= horaActual.toString();
            float payment = 8000;
            //UbicacionActual, Destino, hora,  payment, ClientID, Nombre, Cedula, Telefono, UserType
            ClientRequest clientRequest = new ClientRequest(UbicacionActual, Destino, hora,  payment, ClientID, Nombre, Cedula, Telefono, UserType);
            ColaClientRequest.encolar(clientRequest); 
            ClientWindow.jLabeEstadoDelPedido.setText("Tu peticion esta en espera...");
            //Habilitar boton de cancelar taxi y inhabilitar el de pedir taxi:
            view.jButtonCancelarTaxi.setEnabled(true);                     
            
            }else if(e.getSource()== this.view.jButtonCancelarTaxi){
            // Código para el botón Cancelar Taxi
            
            ColaClientRequest.desencolarSinRetorno();         
            ClientWindow.jLabeEstadoDelPedido.setText("Se ha cancelado tu peticion correctamente...");
            
        }else if(e.getSource()== this.view.jButtonReportarTaxista){
            // Código para el botón Reportar Taxista
        }
    }
}
        
    
    

