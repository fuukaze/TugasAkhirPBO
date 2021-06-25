/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModBeranda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import koneksi.koneksi;


/**
 *
 * @author kahfi
 */
public class DAOBeranda implements ImplementBeranda {
    Connection connection;
    final String insert = "INSERT INTO baru ( nama, alamat, no_hp, keterangan )VALUES(?, ?, ?, ?)";
    final String delete = "DELETE FROM baru WHERE no_ktp=?";
    final String update = "UPDATE baru SET nama=?, alamat=?, no_hp=?, keterangan=?  WHERE no_ktp=?";
    final String select = "SELECT * FROM baru";
    final String carinama = "SELECT * FROM baru WHERE nama like ?";

    public DAOBeranda() {
        connection = koneksi.connection();
    }

    @Override
    public void insert(ModBeranda ml) {
        PreparedStatement statement = null;
                
        try{
            statement = connection.prepareStatement(insert);
            statement.setString(1, ml.getNama());
            statement.setString(2, ml.getAlamat());
            statement.setInt(3, ml.getNo_hp());
            statement.setString(4, ml.getKeterangan());
            statement.executeUpdate();
            
            
        }catch (SQLException ex){
            ex.printStackTrace();
        } finally{
            try{
                statement.close();
                
            } catch(SQLException ex){
                ex.printStackTrace();
            } 
        }
    }

    @Override
    public void delete(int no_ktp) {
        PreparedStatement statement = null;
        
        try {
            statement = connection.prepareStatement(delete);
            
            statement.setInt(1, no_ktp);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(ModBeranda ml) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(update);
            statement.setString(1, ml.getNama());
            statement.setString(2, ml.getAlamat());
            statement.setInt(3, ml.getNo_hp());
            statement.setString(4, ml.getKeterangan());
            statement.setInt(5, ml.getNo_ktp());
            statement.executeUpdate();
            
        }catch (SQLException ex){
            ex.printStackTrace();
        } finally{
            try{
                statement.close();
            } catch(SQLException ex){
                ex.printStackTrace();
            } 
        }
    }

    @Override
    public List<ModBeranda> getAll() {
        List<ModBeranda> lmb = null;
        
        try {
            lmb = new ArrayList<ModBeranda>();
            Statement st = connection.createStatement();
            
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                ModBeranda mb = new ModBeranda();
                mb.setNo_ktp(rs.getInt("no_ktp"));
                mb.setNama(rs.getString("nama"));
                mb.setAlamat(rs.getString("alamat"));
                mb.setNo_hp(rs.getInt("no_hp")); 
                mb.setKeterangan(rs.getString("keterangan"));
                lmb.add(mb);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lmb;
    }

    @Override
    public List<ModBeranda> getCarinama(String nama) {
        List<ModBeranda> lmb = null;
        try {
            lmb = new ArrayList<ModBeranda>();
            
            PreparedStatement st = connection.prepareStatement(carinama);
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                ModBeranda mb = new ModBeranda();
                mb.setNo_ktp(rs.getInt("no_ktp"));
                mb.setNama(rs.getString("nama"));
                mb.setAlamat(rs.getString("alamat"));
                mb.setNo_hp(rs.getInt("no_hp")); 
                mb.setKeterangan(rs.getString("keterangan"));   
                lmb.add(mb);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lmb;
    }
    
}
