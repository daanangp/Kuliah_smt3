/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06940_danangmodul3;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author UseR_Daan
 */
public class Main {
    
        static Scanner scan = new Scanner (System.in);
        static ArrayList<Admin> adminArr = new ArrayList <>();
        static ArrayList<Pemesan> pemesanArr = new ArrayList <>();
        static ArrayList<Barang> barangArr = new ArrayList<>();
        static ArrayList<BarangKirim> barangkirimArr = new ArrayList<>();
        
    public static void main(String[] args) {
        // TODO code application logic here

        int menu;
        do {
        System.out.println("\n\n   || SISTEM INFORMASI ||");
        System.out.println("|| PEMESANAN BARANG ONLINE ||");
        new Admin();
            System.out.println("\n\n MENU APLIKASI :");
            System.out.println("1. Tambah Admin");
            System.out.println("2. Tambah Pemesan");
            System.out.println("3. Tambah Data Pemesanan Barang");
            System.out.println("4. Tampilkan Data (CETAK) ");
            System.out.println("5. Antar Barang (KURIR) ");
            System.out.print("Masukan Menu Pilihan : ");
            menu = scan.nextInt();
            
            switch (menu){
                case 1 :
                    Main.tambahAdmin();
                    break;
                case 2 :
                    Main.tambahPemesan();
                    break;
                case 3 : 
                    Main.tambahBarang();
                    break;
                case 4 :
                           TampilkanData panggil = new TampilkanData();
                           panggil.tampilkanData();
                    break;
                case 5 : 
                    Main.kirimBarang();
                    break;
                default:
                    menu = 0;
                    System.out.println("TERIMAKASIH");
            
            }

        }while (menu!=0);

    }
    
   
    
    static void tambahAdmin(){
        
        System.out.print("Tambah Data Admin");
        Admin admin = new Admin();
        System.out.println("ID admin : " + String.valueOf(adminArr.size()+1));
        admin.setId(adminArr.size()+1);
        System.out.print("Nama Admin : ");
        admin.setNama(scan.next());
        System.out.print("Kata Sandi Admin : ");
        admin.setKataSandi(scan.next());
        System.out.print("Nomer Hp Admin : ");
        admin.setNoHp(scan.next());

        adminArr.add(admin);
    }
    
    static void tambahPemesan(){
        System.out.println("Tambah Data Pemesan");
        Pemesan pemesan = new Pemesan();
        System.out.println("ID Pemesan : " + String.valueOf(pemesanArr.size()+1));
        pemesan.setId(pemesanArr.size()+1);
        System.out.print("Nama Pemesan : ");
        pemesan.setNama(scan.next());
        System.out.print("Nomer Hp Pemesan : ");
        pemesan.setNoHp(scan.next());

        pemesanArr.add(pemesan);

    }
    
    static void tambahBarang(){
        System.out.println("Tambah Data Barang : ");
        Barang barang = new Barang();
        System.out.print("ID Admin : ");
        barang.setAdmin(adminArr.get(scan.nextInt()-1));
        System.out.print("ID Pemesan : ");
        barang.setPemesan(pemesanArr.get(scan.nextInt()-1));
        
        System.out.print("Berat Barang (KG) : ");
        barang.setBerat(scan.nextFloat());
        
        System.out.print("Harga Total Rp. " + barang.getHargaTotal());

        barangArr.add(barang);
        
    }
    
    static void kirimBarang(){
     
System.out.println("====================================");
 BarangKirim barangkirim = new BarangKirim();
 
 
        System.out.println("Pilih Data Yang Akan Dikirim : ");
       
        System.out.print("ID Admin : ");
        barangkirim.setAdmin(adminArr.get(scan.nextInt()-1));
        System.out.print("ID Pemesan : ");
        barangkirim.setPemesan(pemesanArr.get(scan.nextInt()-1));
        
        System.out.print("Berat Barang (KG) : ");
        barangkirim.setBerat(scan.nextFloat());
        //System.out.println("Harga Total : " + barangkirim.getHargaTotal());
        System.out.println("BARANG SUDAH DIKIRIM");
        barangkirimArr.add(barangkirim);

    }
}
