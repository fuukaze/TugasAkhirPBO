/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOLogin;
import Model.ModLogin;
import DAO.ImplementLogin;
import View.FormBeranda;
import View.login;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author mabdu
 */
public class ControllerLogin {
    login frame;
    DAOLogin Login;
    List<ModLogin> ListLogin;
    
    public ControllerLogin(login frame) {
        this.frame = frame;
        Login = new DAOLogin();
    }
    
    public void reset(){
        frame.getJf_username().setText(null);
        frame.getJf_pass().setText(null);
    }
    
    public void exit(){
        System.exit(0);
    }
    
    public void CekLogin(){
        String InputUser = frame.getJf_username().getText();
        String InputPass = frame.getJf_pass().getText();
        ListLogin = Login.ceklogin(InputUser, InputPass);
        
        if(ListLogin.size()>0)
        {
            String DBUser = ListLogin.get(0).getUsername();
            String DBPass = ListLogin.get(0).getPassword();
            if(InputUser.equals(DBUser) && InputPass.equals(DBPass))
            {
                //frame.dispose();
                new FormBeranda().setVisible(true);
                System.out.println("Berhasil Login");            
            }
        }else
        {
           
            JOptionPane.showMessageDialog(null, "Username atau Password Salah","Login Gagal",JOptionPane.ERROR_MESSAGE);
            
        }
    }
}
