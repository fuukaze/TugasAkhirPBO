/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModPaket;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import koneksi.koneksi;

/**
 *
 * @author mabdu
 */
public class DAOPaket implements ImplementPaket{

    @Override
    public void insert(ModPaket mp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ModPaket mm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String no) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModPaket> getAllPaket() {
        List<ModPaket> Model = new ArrayList<ModPaket>();
        String sql = "Select * from paket";
        try {
            if (koneksi.connection()==null){
                return null;
            }else{
                PreparedStatement statement = koneksi.connection().prepareStatement(sql);

                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    ModPaket mp = new ModPaket(
                            rs.getString(1),
                            rs.getString(2)
                    );
                    Model.add(mp);
                }
                statement.close();
            }
        } catch (Exception ex) {
            
        }
        return Model;
    }

    @Override
    public ModPaket getByID(String id_paket) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModPaket> getByPaket(String keterangan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
