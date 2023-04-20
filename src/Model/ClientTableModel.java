/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
/**
 *
 * @author Elian
 */

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class ClientTableModel extends AbstractTableModel {

    private ArrayList<Client> clients;
    private final String[] columnNames = {"ID de Usuario", "Nombre", "Cedula", "Telefono", "Tipo de Usuario"};

    public ClientTableModel(ArrayList<Client> clients) {
        this.clients = clients;
    }

    @Override
    public int getRowCount() {
        return clients.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Client client = clients.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return client.getUserID();
            case 1:
                return client.getName();
            case 2:
                return client.getCedula();
            case 3:
                return client.getPhoneNumber();
            case 4:
                return client.getUserType();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }
    
    public void actualizarClientTabla(ArrayList<Client> clients,JTable table){
        ClientTableModel clientTableModel = new ClientTableModel(clients);
        table.setModel(clientTableModel);
        
    }

}
