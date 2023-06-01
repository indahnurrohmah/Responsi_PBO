/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author PC PRAKTIKUM
 */
public class ModelTabel extends AbstractTableModel{

    List<Data> data;
    
    public ModelTabel(List<Data>data){
        this.data = data;
    }
    
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "Judul";
            case 1:
                return "Alur";
            case 2:
                return "Orisinalitas";
            case 3:
                return "Pemilihan_Kata";
            case 4:
                return "Nilai";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return data.get(row).getJudul();
            case 1:
                return data.get(row).getAlur();
            case 2:
                return data.get(row).getOrisinalitas();
            case 3:
                return data.get(row).getPemilihanKata();
            case 4:
                return data.get(row).getNilai();
            default:
                return null;
        }
    }

    
}
