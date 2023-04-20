/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Model.ClientRequest;
import javax.swing.JOptionPane;

/**
 *
 * @author Elian
 */
public class ColaClientRequest {
    private static NodoClientRequest primerNodo;
    private static NodoClientRequest ultimoNodo;

    public ColaClientRequest() {
        ColaClientRequest.primerNodo = null;
        ColaClientRequest.ultimoNodo = null;
    }

    public static void encolar(ClientRequest solicitud) {
        NodoClientRequest nuevoNodo = new NodoClientRequest(solicitud);
        if (ColaClientRequest.primerNodo == null) {
            // La cola está vacía
            ColaClientRequest.primerNodo = nuevoNodo;
            ColaClientRequest.ultimoNodo = nuevoNodo;
        } else {
            // La cola ya tiene elementos
            ColaClientRequest.ultimoNodo.setSiguiente(nuevoNodo);
            ColaClientRequest.ultimoNodo = nuevoNodo;
        }
    }

    public static ClientRequest desencolar() {
        if (ColaClientRequest.primerNodo == null) {
            
            // La cola está vacía
            JOptionPane.showMessageDialog(null, "No hay servicios disponibles","Advertencia",JOptionPane.WARNING_MESSAGE);
            return null;
        } else {
            // Obtenemos el primer elemento de la cola
            ClientRequest solicitud = ColaClientRequest.primerNodo.getSolicitud();
            ColaClientRequest.primerNodo = ColaClientRequest.primerNodo.getSiguiente();

            if (ColaClientRequest.primerNodo == null) {
                // Si eliminamos el último elemento de la cola, también actualizamos el último nodo
                ColaClientRequest.ultimoNodo = null;
            }

            return solicitud;
        }
    }
    
    public static void desencolarSinRetorno(){
        if (ColaClientRequest.primerNodo == null) {
        // La cola está vacía
        JOptionPane.showMessageDialog(null, "No hay servicios disponibles para cancelar", "Advertencia", JOptionPane.WARNING_MESSAGE);
    } else {
        // Obtenemos el primer elemento de la cola
        ColaClientRequest.primerNodo = ColaClientRequest.primerNodo.getSiguiente();

        if (ColaClientRequest.primerNodo == null) {
            // Si eliminamos el último elemento de la cola, también actualizamos el último nodo
            ColaClientRequest.ultimoNodo = null;
        }
        JOptionPane.showMessageDialog(null, "Se ha cancelado la peticion correctamente","Advertencia",JOptionPane.WARNING_MESSAGE);
    }
    }
    
    public static boolean estaVacia() {
        return ColaClientRequest.primerNodo == null;
    }
}
