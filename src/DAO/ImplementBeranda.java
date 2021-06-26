/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModBeranda;
import java.util.List;

/**
 *
 * @author kahfi
 */
public interface ImplementBeranda {
    public void insert(ModBeranda ml);
    public void delete (int no_ktp);
    public void update (ModBeranda ml);
    public List<ModBeranda> getAll();
}
