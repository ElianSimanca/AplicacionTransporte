/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Client;
import View.ClientWindow;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
            view.jButtonCancelarTaxi.setEnabled(true);
                
            }else if(e.getSource()== this.view.jButtonCancelarTaxi){
            // Código para el botón Cancelar Taxi
        }else if(e.getSource()== this.view.jButtonReportarTaxista){
            // Código para el botón Reportar Taxista
        }
    }
}
        
    
    

