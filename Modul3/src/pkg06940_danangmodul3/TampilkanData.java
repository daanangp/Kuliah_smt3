/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06940_danangmodul3;

import static pkg06940_danangmodul3.Main.adminArr;
import static pkg06940_danangmodul3.Main.pemesanArr;
import static pkg06940_danangmodul3.Main.barangArr;
import static pkg06940_danangmodul3.Main.barangkirimArr;


public class TampilkanData {
 
        
     void tampilkanData() {
         
  
   
        System.out.println("====================================");
        //keyword super
        new Admin();
        System.out.println("\n\n Data Admin : ");
        for (int i = 0; i<adminArr.size(); i++)
        {
            
            System.out.println("ID admin : " + adminArr.get(i).getId() + 
                    ", Nama : " + adminArr.get(i).getNama()+ 
                    ", NomerHP : " + adminArr.get(i).getNoHp());
        
        }
        System.out.println("\n....................................");
        System.out.println("\n");
        
        System.out.println("\n\n Data Pemesan : ");
        for (int i =0; i<pemesanArr.size(); i++)
        {
            System.out.println("ID Pemesan : " + pemesanArr.get(i).getId() + 
                    ", Nama : " + pemesanArr.get(i).getNama()+ 
                    ", NomerHP ; " + pemesanArr.get(i).getNoHp());
        }
        
        System.out.println("\n....................................");
        System.out.println("\n");
        
        System.out.println("\n\n Data Pemesanan Barang AWAL : ");
        for (int i =0; i<barangArr.size(); i++)        
        {
            System.out.println("Nama Admin : " + barangArr.get(i).getAdmin().getNama() +
                    ", || NamaPemesan : " + barangArr.get(i).getPemesan().getNama() + 
                    ", Berat Barang : " + barangArr.get(i).getBerat() + 
                    "KG, Harga TOtal Barang RP: " +barangArr.get(i).getHargaTotal() + 
                   ", Status Barang : " + barangArr.get(i).getStatus1() );

        }
        System.out.println("\n....................................");
        System.out.println("\n");    
        
                System.out.println("\n\n Data Pemesanan Barang KIRIM : ");
        for (int i =0; i<barangkirimArr.size(); i++)        
        {
            System.out.println("Nama Admin : " + barangkirimArr.get(i).getAdmin().getNama() +
                    ", || NamaPemesan : " + barangkirimArr.get(i).getPemesan().getNama() + 
                    ", Berat Barang : " + barangkirimArr.get(i).getBerat() + 
                    "KG, Harga TOtal Barang RP: " +barangkirimArr.get(i).getHargaTotal() + 
                   ", Status Barang : " + barangkirimArr.get(i).getStatus2() );

        }
        System.out.println("====================================");
                
    }
    
}
