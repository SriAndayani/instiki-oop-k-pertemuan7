/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author Sri Andayani
 * Tanggal 9 Mei 2025
 */
public class Salam {
     private String tx="Selamat Pagi, Jangan lupa beli TIKET Diesteria! Harga mulai dari 100K ";
      
     public void tulisPesan() {
         System.out.println(this.tx);
     }
     
     public void tulisPesan(String txt1){
         System.out.println(txt1);
     }
     
     public void tulisPesan(String pesan, String txt2){
         System.out.println("Presale 1 : " +pesan+ "\nPresale 2 : " +txt2);
     }
}
