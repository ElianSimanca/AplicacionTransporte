/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Elian
 */
public class AcceptedServiceTableModel extends AbstractTableModel{
    private ArrayList<AcceptedService> acceptedServices;
    private final String[] columnNames = {"Hora", "Ubicacion", "Destino", "Pago", "Id del Conductor","Nombre del conductor","Matricula","Cedula del Conductor","Id del cliente","Nombre del Cliente","cedula","Estado Del Servicio"};

    public AcceptedServiceTableModel(ArrayList<AcceptedService> acceptedServices) {
        this.acceptedServices = acceptedServices;
    }

    @Override
    public int getRowCount() {
        return acceptedServices.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        AcceptedService acceptedService = acceptedServices.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return acceptedService.getHora();
            case 1:
                return acceptedService.getUbicacion();
            case 2:
                return acceptedService.getDestino();
            case 3:
                return acceptedService.getPayment();
            case 4:
                return acceptedService.getDriveruserID();
            case 5:
                return acceptedService.getDrivername();
            case 6:
                return acceptedService.getMatricula();
            case 7:
                return acceptedService.getDrivercedula();
            case 8:
                return acceptedService.getClientuserID();
            case 9:
                return acceptedService.getClientname();
            case 10:
                return acceptedService.getClientcedula();
            case 11:
                return acceptedService.getEstadoDelServicio();       
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }
    
    public void actualizarClientTabla(ArrayList<AcceptedService> acceptedServices,JTable table){
        AcceptedServiceTableModel acceptedServiceTableModel = new AcceptedServiceTableModel(acceptedServices);
        table.setModel(acceptedServiceTableModel);
        
    }


}
