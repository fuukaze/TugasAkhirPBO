/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOPaket;
import Model.ModPaket;
import java.util.List;

/**
 *
 * @author mabdu
 */
public class ControllerPaket {
    private DAOPaket dao = new DAOPaket();
    
    public List<ModPaket> getAllData() {
        return dao.getAllPaket();
    }
}
