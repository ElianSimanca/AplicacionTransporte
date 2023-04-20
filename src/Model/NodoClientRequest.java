/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Elian
 */
public class NodoClientRequest {
    private ClientRequest solicitud;
    private NodoClientRequest siguiente;

    public NodoClientRequest(ClientRequest solicitud) {
        this.solicitud = solicitud;
        this.siguiente = null;
    }

    public ClientRequest getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(ClientRequest solicitud) {
        this.solicitud = solicitud;
    }

    public NodoClientRequest getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoClientRequest siguiente) {
        this.siguiente = siguiente;
    }
}



