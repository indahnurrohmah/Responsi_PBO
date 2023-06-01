/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
import java.util.*;
import koneksi.connector;
import model.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import DAOImplements.Aksi;
/**
 *
 * @author PC PRAKTIKUM
 */
public class DAOdata implements Aksi{
    
    Connection connection;
    
    final String select = "Select * from lomba";
    final String insert = "INSERT INTO lomba (judul, alur, orisinalitas, "
            + "pemilihanKata, nilai) VALUES (?,?,?,?,?)";
    final String update = "UPDATE lomba set judul=?, alur=?, orisinalitas=?, "
            + "pemilihanKata=?, nilai=?";
    final String delete = "Delete from lomba where judul=?";
    
    public DAOdata(){
        connection = connector.connection();
    }
    
    @Override
    public void insert(Data d) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(insert, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, d.getJudul());
            statement.setDouble(2, d.getAlur());
            statement.setDouble(3, d.getOrisinalitas());
            statement.setDouble(4, d.getPemilihanKata());
            statement.setDouble(2, d.getNilai());
            statement.executeUpdate();
        }   
        catch(SQLException ex){
           Logger.getLogger(DAOdata.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }

    @Override
    public void update(Data d) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(update, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, d.getJudul());
            statement.setDouble(2, d.getAlur());
            statement.setDouble(3, d.getOrisinalitas());
            statement.setDouble(4, d.getPemilihanKata());
            statement.setDouble(2, d.getNilai());
            statement.executeUpdate();
            statement.close();
        }   
        catch(SQLException ex){
           Logger.getLogger(DAOdata.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }

    @Override
    public void delete(String judul) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(delete);
            statement.setString(1, judul);
            statement.executeUpdate();
        }catch(SQLException ex){
             Logger.getLogger(DAOdata.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @Override
    public List<Data> getAll() {
        List<Data> data = null;
        try{
            data = new ArrayList<Data>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            
            while(rs.next()){
                Data d = new Data();
                d.setJudul(rs.getString("judul"));
                d.setAlur(rs.getDouble("alur"));
                d.setOrisinalitas(rs.getDouble("orisinalitas"));
                d.setPemilihanKata(rs.getDouble("pemilihanKata"));
                d.setNilai(rs.getDouble("nilai"));
                data.add(d);
            }
            
        }catch(SQLException ex){
             Logger.getLogger(DAOdata.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
}
