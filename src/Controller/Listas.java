/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import Model.AcceptedService;
import Model.Client;
import Model.ClientRequest;
import Model.Driver;
import Model.User;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Elian
 */
public class Listas implements Serializable{
    private static final String ARCHIVO = "src/resources/datos.dat";
    //Lista de Usuarios en general
    private ArrayList<User> userslist;
    //Lista de Clientes
    private ArrayList<Client> clientslist;
    //Lista Trabajadores
    private ArrayList<Driver> driverlist;
    //Lista de servicios concluidos
    private ArrayList<AcceptedService> serviciosTerminados;

    public Listas() {
        clientslist = new ArrayList<>();
        driverlist = new ArrayList<>();
        serviciosTerminados = new ArrayList<>();
        userslist = new ArrayList<>();
        leerDatos();
    System.out.println("Tamaño de clientslist: " + clientslist.size());
    System.out.println("Tamaño de driverlist: " + driverlist.size());
    System.out.println("Tamaño de serviciosTerminados: " + serviciosTerminados.size());
    System.out.println("Tamaño de userslist: " + userslist.size());
    }

    public ArrayList<Driver> getDriverlist() {
        return driverlist;
    }
    
    

    public ArrayList<User> getUserslist() {
        return userslist;
    }

    public  ArrayList<Client> getClientslist() {
        return clientslist;
    }

    public  ArrayList<AcceptedService> getServiciosTerminados() {
        return serviciosTerminados;
    }
    
    
    
    
    
    public void addDriver(Driver driver){
        driverlist.add(driver);
        escribirDatos();
    }
    
    public void deleteDriver(int indice){
        driverlist.remove(indice);
        escribirDatos();
    }
    //*Para que el usuario pueda registrarse
    public void addUser(User user){    
        userslist.add(user);
        escribirDatos();      
    }   
   
    //*Para que el administrador pueda eliminar usuarios
    public void deleteUser(int indice){    
        userslist.remove(indice);        
        escribirDatos();
    }
    
    //Añadir clientes a lista
    public void addClient(Client c){
        clientslist.add(c);
        escribirDatos();
    }
    
    //Para eliminar a un cliente del sistema
    public void deleteClient(int indice){
        clientslist.remove(indice);
        escribirDatos();
    }
    
    public void addEndService(AcceptedService a){
        serviciosTerminados.add(a);
        escribirDatos();
    }
    
    private void escribirDatos() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ARCHIVO));
            out.writeObject(userslist);
            out.writeObject(clientslist);
            out.writeObject(serviciosTerminados);
            out.writeObject(driverlist);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void leerDatos() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARCHIVO));
            userslist = (ArrayList<User>) in.readObject();
            clientslist = (ArrayList<Client>) in.readObject();
            serviciosTerminados = (ArrayList<AcceptedService>) in.readObject();
            driverlist = (ArrayList<Driver>) in.readObject();
            in.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
}
