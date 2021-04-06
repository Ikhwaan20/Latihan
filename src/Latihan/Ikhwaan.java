/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author ASUS
 */
public class Ikhwaan extends Siswa {
    public static void main(String[]args) {

        Siswa baru = new Siswa();
        
         baru.setNama("Ikhwaan");
         baru.setAlamat("Jl.Mt Haryono");
         baru.setUmur (16);
         baru.setBerat(50);
         baru.setHobi("MAIN");
         
         
         System.out.println("Nama =" +baru.getNama());
         System.out.println("Alamat =" +baru.getAlamat());
         System.out.println("Umur =" +baru.getUmur());
         System.out.println("Hobi =" +baru.getHobi()); 
         System.out.println("==================");
         
         baru.setNama("Rizky");
         baru.setAlamat("Jl. Arjuno");
         baru.setUmur (16);
         baru.setBerat(40);
         baru.setHobi("main game");
         
         System.out.println("Nama Teman=" +baru.getNama());
         System.out.println("Alamat Teman=" +baru.getAlamat());
         System.out.println("Umur Teman=" +baru.getUmur());
         System.out.println("Hobi Teman=" +baru.getHobi()); 
         
    }         
}
