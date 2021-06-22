/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModMontir;
import java.util.List;

/**
 *
 * @author mabdu
 */
public interface ImplementMontir {
    public void insert(ModMontir mm);
    public void update(ModMontir mm);
    public void delete(String no);
    public List<ModMontir> getAllMontir();
    public ModMontir getByID(String id_montir);
    public List<ModMontir> getByNama(String nama_montir);
}
