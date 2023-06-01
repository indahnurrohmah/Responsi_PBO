/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import DAO.DAOdata;
import model.*;
import view.ViewProgram;
import DAOImplements.Aksi;
import java.sql.SQLException;


/**
 *
 * @author PC PRAKTIKUM
 */
public class ControllerData {
    ViewProgram frame;
    Aksi impldata;
    List<Data> data;
    
    public ControllerData(ViewProgram frame){
       this.frame = frame;
       impldata = new DAOdata();
       data = impldata.getAll();
    }
    
    public void isitabel(){
        data = impldata.getAll();
        ModelTabel mod = new ModelTabel(data);
    }
    public void insert(){
        //if(frame.getJudul().getText().trim().isEmpty()){
            
        //}
        Data data = new Data();
        data.setJudul(frame.getJudul().getText());
        data.setAlur(Double.parseDouble(frame.getAlur().getText()));
        data.setOrisinalitas(Double.parseDouble(frame.getOrisinalitas().getText()));
        data.setNilai(data.getNilai());
        impldata.insert(data);
    }   
    public void update(){
        //if(frame.getJudul().getText().trim().isEmpty()){
            
        //}
        Data data = new Data();
        data.setJudul(frame.getJudul().getText());
        data.setAlur(Double.parseDouble(frame.getAlur().getText()));
        data.setOrisinalitas(Double.parseDouble(frame.getOrisinalitas().getText()));
        data.setNilai(data.getNilai());
        impldata.update(data);
    }  
    public void delete(){
        //if(frame.getJudul().getText().trim().isEmpty()){
            
        //}
        String judul = frame.getJudul().getText();
        impldata.delete(judul);
    } 
    public void isitabel(){
        data = impldata.getAll();
        ModelTabel mod = new ModelTabel();
        frame.getTabel().setModel(mod);
    }
    
}
