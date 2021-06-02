/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectuas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author My MSI
 */
public class Hari {
    private String hari;
    public String getHari() {
        return hari;
    }
    public void setHari(String hari) {
        this.hari = hari;
    }
    public static void  main(String[]agrs){
        
    Scanner input = new Scanner (System.in);
    int no;
    
    System.out.print("Silahkan Pilih Hari : ");
    no = input.nextInt();
    
    String[] days= {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
    
    if (no == 1){
        System.out.println("Hari "+days[0]);
        ArrayList<Integer> plat = new ArrayList<Integer>();
        plat.add(3337);
        plat.add(1239);
        plat.add(1259);
        Collections.sort(plat);
        System.out.print("Plat yang di periksa adalah : ");
        for (int i : plat) {
        System.out.print(i+" , ");
        }
    }
    else if (no==2){
        System.out.println("Hari "+days[1]);
        ArrayList<Integer> plat = new ArrayList<Integer>();
        plat.add(8888);
        plat.add(1222);
        plat.add(1200);
        
         Collections.sort(plat);
        System.out.print("Plat yang di periksa adalah : ");
        for (int i : plat) {
        System.out.print(i+" , ");
        }
    }
    else if (no==3){
        System.out.println("Hari "+days[2]);
        ArrayList<Integer> plat = new ArrayList<Integer>();
        plat.add(8512);
        plat.add(7815);
        plat.add(7765);
        
         Collections.sort(plat);
        System.out.print("Plat yang di periksa adalah : ");
        for (int i : plat) {
        System.out.print(i+" , ");
        }
    }
    else if (no==4){
        System.out.println("Hari "+days[3]);
        ArrayList<Integer> plat = new ArrayList<Integer>();
        plat.add(7915);
        plat.add(5160);
        plat.add(1785);
        
         Collections.sort(plat);
        System.out.print("Plat yang di periksa adalah : ");
        for (int i : plat) {
        System.out.print(i+" , ");
        }
    }
    else if (no==5){
        System.out.println("Hari "+days[4]);
        ArrayList<Integer> plat = new ArrayList<Integer>();
        plat.add(7896);
        plat.add(4561);
        plat.add(1238);
        
         Collections.sort(plat);
        System.out.print("Plat yang di periksa adalah : ");
        for (int i : plat) {
        System.out.print(i+" , ");
        }
    }
    else if (no==6){
        System.out.println("Hari "+days[5]);
        ArrayList<Integer> plat = new ArrayList<Integer>();
        plat.add(7851);
        plat.add(7156);
        plat.add(7465);
        
         Collections.sort(plat);
        System.out.print("Plat yang di periksa adalah : ");
        for (int i : plat) {
        System.out.print(i+" , ");
        }
    }
    else if (no==7){
        System.out.println("Hari "+days[6]);
        ArrayList<Integer> plat = new ArrayList<Integer>();
        plat.add(7156);
        plat.add(9422);
        plat.add(1126);
        
         Collections.sort(plat);
        System.out.print("Plat yang di periksa adalah : ");
        for (int i : plat) {
        System.out.print(i+" , ");
        }
    }
  }
}