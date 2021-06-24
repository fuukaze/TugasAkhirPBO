/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import koneksi.koneksi;


/**
 *
 * @author mabdu
 */
public class DAOLogin implements ImplementLogin{

    Connection conn;
    public DAOLogin() {
        conn = koneksi.connection();
    }
    
    String sql = "select * from login where username=? and password=?";
    @Override
    public List<ModLogin> ceklogin(String username, String password) {
        List<ModLogin> ListLogin = null;
        try 
        {
            ListLogin = new ArrayList<ModLogin>();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);

            ResultSet rs = st.executeQuery();
            System.out.println(st);
            rs.next();
            
            ModLogin Login = new ModLogin();
            Login.setUsername(rs.getString("username"));
            Login.setPassword(rs.getString("password"));
            ListLogin.add(Login);

            System.out.println(ListLogin.get(0).getUsername());
            System.out.println(ListLogin.get(0).getPassword());
        } catch (Exception e) 
        {
            System.out.println("Gagal Login, Username Password / Tidak ada di database");
        }
        return ListLogin;
    }
}
