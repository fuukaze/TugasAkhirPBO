/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModPaket;
import java.util.List;

/**
 *
 * @author mabdu
 */
public interface ImplementPaket {
    public void insert(ModPaket mp);
    public void update(ModPaket mm); 
    public void delete(String no);
    public List<ModPaket> getAllPaket();
    public ModPaket getByID(String id_paket);
    public List<ModPaket> getByPaket(String id_paket);
}
