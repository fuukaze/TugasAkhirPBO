/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOMontir;
import Model.ModMontir;
import java.util.List;

/**
 *
 * @author mabdu
 */
public class ControllerMontir {
    private DAOMontir dao = new DAOMontir();
    
    public List<ModMontir> getAllData() {
        return dao.getAllMontir();
    }
}
