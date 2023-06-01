/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOImplements;

import java.util.List;
import model.Data;
import model.*;
/**
 *
 * @author PC PRAKTIKUM
 */
public interface Aksi {  
    public void insert(Data d);
    public void update(Data d);
    public void delete(String judul);
    public List<Data> getAll();

}
