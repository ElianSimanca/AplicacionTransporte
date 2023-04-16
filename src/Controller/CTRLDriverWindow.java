/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Driver;
import View.DriverWindow;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Elian
 */
public class CTRLDriverWindow {
    private DriverWindow view;
    private Driver driver;

    public CTRLDriverWindow(DriverWindow view, Driver Driver) {
        this.view = view;
        this.driver= Driver;
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
    
    
}


