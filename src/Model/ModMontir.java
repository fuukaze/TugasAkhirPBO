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
public class ModMontir {
    private String id_montir;
    private String nama_montir;
    private String skill;

    public ModMontir(String id_montir, String nama_montir, String skill) {
        this.id_montir = id_montir;
        this.nama_montir = nama_montir;
        this.skill = skill;
    }

    public String getId_montir() {
        return id_montir;
    }

    public void setId_montir(String id_montir) {
        this.id_montir = id_montir;
    }

    public String getNama_montir() {
        return nama_montir;
    }

    public void setNama_montir(String nama_montir) {
        this.nama_montir = nama_montir;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return this.nama_montir; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
