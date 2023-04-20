/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import java.io.Serializable;

/**
 *
 * @author Elian
 */

public class Client extends User implements Serializable{
    
    

    public Client(String userID, String name, String cedula, String PhoneNumber, String userType) {
        super(userID, name, cedula, PhoneNumber,null, userType);
    }
    
    
 
    
    
    
    //*Metodos
       
    public void RequestCab(){
        
              
    }
    
    public void CancelCabRequest(){
        
    }
    
    public void RateCab(){
        
    }   
}
