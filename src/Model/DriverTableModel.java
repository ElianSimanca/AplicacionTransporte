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
public class DriverTableModel extends AbstractTableModel{
    private ArrayList<Driver> drivers;
    private final String[] columnNames = {"ID de Usuario", "Nombre", "Cedula","Matricula", "Tipo de Usuario","Telefono"};

    public DriverTableModel(ArrayList<Driver> drivers) {
        this.drivers = drivers;
    }

    @Override
    public int getRowCount() {
        return drivers.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Driver driver = drivers.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return driver.getUserID();
            case 1:
                return driver.getName();
            case 2:
                return driver.getCedula();
            case 3:
                return driver.getMatricula();
            case 4:
                return driver.getUserType();
            case 5:
                return driver.getPhoneNumber();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }
    
    public void actualizarDriverTabla(ArrayList<Driver> drivers,JTable table){
        DriverTableModel driverTableModel = new DriverTableModel(drivers);
        table.setModel(driverTableModel);
        
    }

}
