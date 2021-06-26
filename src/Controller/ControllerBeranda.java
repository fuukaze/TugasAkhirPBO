/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOBeranda;
import DAO.ImplementBeranda;
import Model.ModBeranda;
import Model.ModTblBeranda;
import View.FormBeranda;
import View.login;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author kahfi
 */
public class ControllerBeranda {
    FormBeranda frame;
    ImplementBeranda impberanda;
    List<ModBeranda> lmb;

    public ControllerBeranda(FormBeranda frame) {
        this.frame = frame;
        impberanda = new DAOBeranda();
        lmb = impberanda.getAll();
    }
    
    public void reset(){
        frame.getTf_noktp().setText("");
        frame.getTf_nama().setText("");
        frame.getTf_nohp().setText("");
        frame.getTf_alamat().setText("");
        frame.getTf_ket().setText("");
    }
    
    public void isitable(){
        lmb = impberanda.getAll();
        ModTblBeranda mtb = new ModTblBeranda(lmb);
        frame.getTbl_beranda().setModel(mtb);
    }
    public void isifield(int row){
        frame.getTf_noktp().setText(String.valueOf(lmb.get(row).getNo_ktp()));
        frame.getTf_nama().setText(lmb.get(row).getNama());
        frame.getTf_nohp().setText(String.valueOf(lmb.get(row).getNo_hp()));
        frame.getTf_alamat().setText(lmb.get(row).getAlamat());
        frame.getTf_ket().setText(lmb.get(row).getKeterangan());
    }    
    public void insert(){
        if(!frame.getTf_nama().getText().trim().isEmpty()& !frame.getTf_nama().getText().trim().isEmpty()){
            ModBeranda mb = new ModBeranda();
            
            mb.setNama(frame.getTf_nama().getText());
            mb.setAlamat(frame.getTf_alamat().getText());
            mb.setNo_hp(Integer.valueOf(frame.getTf_nohp().getText()));
            mb.setKeterangan(frame.getTf_ket().getText());
            
            impberanda.insert(mb);
            JOptionPane.showMessageDialog(null, "Data disimpan");
        } else {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan");
        }
    }
    
    public void delete(){
        if(!frame.getTf_noktp().getText().trim().isEmpty()){
            int no = Integer.parseInt(frame.getTf_noktp().getText());
            
            impberanda.delete(no);
            JOptionPane.showMessageDialog(null, "data dihapus"); 
        } else {
            JOptionPane.showMessageDialog(null, "Data gagal dihapus");
        }
    }
    
    public void update(){
        if(!frame.getTf_noktp().getText().trim().isEmpty()){
            
            ModBeranda ml = new ModBeranda();
            
            ml.setNama(frame.getTf_nama().getText());
            ml.setNo_hp(Integer.valueOf(frame.getTf_nohp().getText()));
            ml.setNo_ktp(Integer.valueOf(frame.getTf_noktp().getText()));
            ml.setAlamat(frame.getTf_alamat().getText());
            ml.setKeterangan(frame.getTf_ket().getText());
            
            impberanda.update(ml);
            JOptionPane.showMessageDialog(null, "data diperbarui"); 
        } else {
            JOptionPane.showMessageDialog(null, "Data gagal diperbarui");
        }
    }
    
}
