/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModLogin;
import java.util.List;

/**
 *
 * @author mabdu
 */
public interface ImplementLogin {
    public List<ModLogin> ceklogin(String username, String password);
}
