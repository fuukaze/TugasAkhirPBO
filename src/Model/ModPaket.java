/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author mabdu
 */
public class ModPaket {
    private String id_paket;
    private String keterangan;

    public ModPaket(String id_paket, String keterangan) {
        this.id_paket = id_paket;
        this.keterangan = keterangan;
    }
    
    public String getId_paket() {
        return id_paket;
    }

    public void setId_paket(String id_paket) {
        this.id_paket = id_paket;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    @Override
    public String toString() {
        return this.id_paket; //To change body of generated methods, choose Tools | Templates.
    }
    
}
