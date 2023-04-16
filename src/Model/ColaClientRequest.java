/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Model.ClientRequest;
import java.util.NoSuchElementException;

/**
 *
 * @author Elian
 */
public class ColaClientRequest {
    private ClientRequest primero;
    private ClientRequest ultimo;
    private int tamaño;

    public ColaClientRequest() {
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }

    public ClientRequest getPrimero() {
        return primero;
    }
    
    
    
    public boolean estaVacia() {
        return this.primero == null;
    }

    public int getTamano() {
        return this.tamaño;
    }
    
    public void encolar(String Ubicacion, String Destino, String hora, float payment, String userID, String name, String cedula, String PhoneNumber, String userType) {
        ClientRequest x = new ClientRequest(Ubicacion, Destino, hora, payment, userID,name,cedula,PhoneNumber, userType);
        if (estaVacia()) {
            this.primero = x;
            this.ultimo = x;
        } else {
            this.ultimo.setSiguiente(x);
            this.ultimo = x;
        }
        this.tamaño++;
    }
    
    public void desencolar() {
        if (estaVacia()) {
            throw new NoSuchElementException("La cola está vacía.");
        }
        
        this.primero = this.primero.getSiguiente();
        if (this.primero == null) {
            this.ultimo = null;
        }
        this.tamaño--;
    }
    
}
