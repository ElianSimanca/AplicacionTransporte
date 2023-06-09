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
public class User implements Serializable{
    private static final long serialVersionUID = -2277466111565383750L;
    
    private String userID;
    private String name;
    private String cedula;
    private String PhoneNumber;
    private String password;
    private String UserType;
    
    //*Constructor

    public User(String userID, String name, String cedula, String PhoneNumber, String password, String userType) {
        this.userID = userID;
        this.name = name;
        this.cedula = cedula;
        this.PhoneNumber = PhoneNumber;
        this.password = password;
        this.UserType = userType;
        
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }
    
    
    
    
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    
    
    
    //*Metodos de validación
    public boolean validarUsuario(String vCedula,String vPhoneNumber){
        // Verificar si los datos ya están registrados:
            Listas listas = Listas.getInstance();
            ArrayList<User> users = listas.getUserslist();
            boolean isRegistered = false;
            for (User user : users) {
                if (user.getUserID().equals(userID)|| user.getCedula().equals(vCedula)||user.getPhoneNumber().equals(vPhoneNumber)) {
                    isRegistered = true;
                    break;
               }
                    
            }
            return isRegistered;
    }
    
    public void registrarUsuario(){
        
    }
    
    public void Login(){
        
    }
    
   
    
    
    
    public boolean ValidatePassword(){
        //Este codigo Valida que la contraseña tenga almenos 8 caracteres y contenga letras y numeros
        if(password.matches("^(?=.*[a-zA-Z])(?=.*[0-9])(?=\\S+$).{8,}$")){
            return true;
        }else{
            return false;
        }
    }
}
