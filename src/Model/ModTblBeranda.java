/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kahfi
 */
public class ModTblBeranda extends AbstractTableModel{
    List<ModBeranda> lmb;

    public ModTblBeranda(List<ModBeranda> lmb) {
        this.lmb = lmb;
    }

    @Override
    public int getRowCount() {
        return lmb.size();       
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return lmb.get(rowIndex).getNo_ktp();
            case 1:
                return lmb.get(rowIndex).getNama();    
            case 2:
                return lmb.get(rowIndex).getNo_hp();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column){
            case 0:
                return"no_ktp";
            case 1:
                return"nama";
            case 2:
                return"no_hp";
            default:
                return null;
        }
    }
    
    
}
