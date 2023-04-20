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



/**
 *
 * @author Elian
 */
public class AplicacionTransporte {

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
        while(true) {
            AcceptedService.AlarmaAutomatica();
            try {
                Thread.sleep(60000); // Esperar 1 minuto antes de la siguiente ejecución
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
 
    }
    
}
