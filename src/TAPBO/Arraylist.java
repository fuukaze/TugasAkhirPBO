/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAPBO;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author GF63
 */
public class Arraylist {
    private String Kendaraan;

    public void setKendaraan(String Kendaraan) {
        this.Kendaraan = Kendaraan;
    }

    public String getKendaraan() {
        return Kendaraan;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int no_hp;
        String nama;
        String alamat;
        String tipe_mobil;
        
        System.out.println("Nama Lengkap    : ");
        nama = input.nextLine();
        System.out.println("Alamat          : ");    
        alamat = input.nextLine();
        System.out.println("tipe mobil      : ");
        tipe_mobil = input.nextLine();
        System.out.println("nomor hp        : ");
        no_hp = input.nextInt();
        System.out.println(" ");
        
        ArrayList<String> data = new ArrayList<>();
        data.add("Tipe Mobil : "+tipe_mobil);
        data.add("nama : " +nama);
        data.add("Alamat :" +alamat);
        Collections.sort(data);
        
        ArrayList<Integer> numb = new ArrayList<Integer>();
        numb.add(no_hp);
        Collections.sort(numb);
        
        System.out.println("============Biodata Customer==========");
        System.out.println("nama        : "+nama);
        System.out.println("alamat      : "+alamat);
        System.out.println("no hp       : "+no_hp);
        System.out.println("tipe mobil  : "+tipe_mobil);
        System.out.println(" ");
        System.out.println(data);
        System.out.println(numb);
    }
}        
        