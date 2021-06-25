/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


/**
 *
 * @author kahfi
 */
public class ModBeranda {
    private int no_ktp;
    private String nama;
    private int no_hp;
    private String alamat;
    private String keterangan;

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String ket) {
        this.keterangan = ket;
    }
    

    public int getNo_ktp() {
        return no_ktp;
    }

    public void setNo_ktp(int no_ktp) {
        this.no_ktp = no_ktp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(int no_hp) {
        this.no_hp = no_hp;
    }
    
    
      
}
