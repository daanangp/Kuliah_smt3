/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.modul.pkg5;
import java.util.*;
/**
 *
 * @author Danang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu=0;
        Scanner in = new Scanner(System.in);
        do{
            try {
            
            System.out.println("\n====PROGRAM  PERHITUNGAN=====");
            System.out.println("GAJI POKOK, TUNJANGAN & PAJAK");
            System.out.println("=============================\n");
            System.out.println("1. Input Data");
            System.out.println("2. Cetak Tunjangan");
            System.out.println("3. Exit\n");
            System.out.print("Inputkan menu pilihan : ");
            menu = in.nextInt();
            System.out.println("================================\n");
            
            }catch(InputMismatchException e)
                {
                    in.nextLine();
                    System.out.println(" \n || Tidak boleh Pakai Huruf harus angka ! ||");
                }
            
            switch(menu)
            {

                case 1:
                    System.out.print("1. Nama      : ");
                    String name = in.next();
                    System.out.println("\n======================");
                    System.out.println(" ex : CEO / CTO / CFO ");
                    System.out.println("======================");
                    System.out.print("2. Jabatan   : ");
                    String jabatan = in.next();
                    System.out.println("\n======================");
                    System.out.println(" Pilihan : BM / SM / MA");
                    System.out.println("======================");
                    System.out.println(" BM : Belum Menikah");
                    System.out.println(" SM : Sudah Menikah"); 
                    System.out.println(" MA : Memiliki Anak");                     
                    System.out.println("======================\n");                    
                    System.out.print("3. Status    : ");
                    String status = in.next();
                    
                    //try {
                    System.out.print("4. Gaji      : ");
                    double gaji = in.nextDouble();
                    Controller.add(jabatan, status, name, gaji);
                    break;
                    //}

                case 2:
                    System.out.print("Masukan nama yang dicari  : ");

                    String cari = in.next();
                    Controller.cetak(cari);
                    break;
                    
                default : 
                    System.err.println("Pilihan hanya 1-3");
                    break;
            }

    
       
        }while(menu>=1);
    }
    
}
