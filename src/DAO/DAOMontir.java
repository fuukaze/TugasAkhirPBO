/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModMontir;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import koneksi.koneksi;

/**
 *
 * @author mabdu
 */
public class DAOMontir implements ImplementMontir{

    @Override
    public void insert(ModMontir mm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ModMontir mm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String no) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModMontir> getAllMontir() {
        List<ModMontir> Model = new ArrayList<ModMontir>();
        String sql = "Select * from montir";
        try {
            if (koneksi.connection()==null){
                return null;
            }else{
                PreparedStatement statement = koneksi.connection().prepareStatement(sql);

                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    ModMontir m = new ModMontir(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3)
                    );
                    Model.add(m);
                }
                statement.close();
            }
        } catch (Exception ex) {
            
        }
        return Model;
    }

    @Override
    public ModMontir getByID(String id_montir) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModMontir> getByNama(String nama_montir) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
