/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1;

import java.util.*;

class DecimalBinner {
   public  String ProgramBinner () {
   //Modul1_06940 coba1 = new Modul1_06940();    
        int decimal = Modul1_06940.awal.nextInt();
        String x = "";
        int modulo;
        
            while (decimal > 0){
                modulo = decimal % 2;
                x = modulo + "" + x;
                decimal = decimal /2;
             
            }
            System.out.println("Bilangan Binner : " + x);
            return x;
    }
}


class BinnerDecimal {

    //old public void
  
    public  int ProgramDecimal (){
        int binner = Modul1_06940.awal.nextInt();
        int decimal = 0, pangkat = 0;
            
            while (binner !=0){
                decimal += (binner%10) * Math.pow(2, pangkat);
                binner = binner / 10;
                pangkat ++;
            
            }
            System.out.println("Bilangan Decimal : " + decimal);        
            return decimal;
    }
}


public class Modul1_06940 {
    static Scanner awal = new Scanner (System.in);
    public static void main (String[] args){
       

     for(String kembali = "y"; kembali.equals("y") || kembali.equals("Y");){
         
        System.out.println("Konversi Bilangan by :Daan");
        System.out.println("=========================");
        System.out.println("==========MENU===========");
        System.out.println("1. Decimal -> Binner ");
        System.out.println("2. Binner  -> Decimal");
        System.out.println("3. Exit / Keluar");
        System.out.print("||Masukan Pilihan : ");
        
        //Scanner inputan = new Scanner (System.in);
        int pilihan = awal.nextByte();
        
        //Pilihan menu
        
            if (pilihan == 1) {
                
                System.out.println("===========================");
        System.out.println("Konversi Decimal --> Binner");
        System.out.print("|| Masukan Bilangan Decimal : ");
            
                DecimalBinner panggil = new DecimalBinner();
                String ProgramBinner = panggil.ProgramBinner();

            }
            
            else if (pilihan == 2) {
        System.out.println("===========================");
        System.out.println("Konversi Binner --> Decimal");
        System.out.print("|| Masukan Bilangan Binner : ");
        //
               BinnerDecimal panggil = new BinnerDecimal();
               int ProgramDecimal = panggil.ProgramDecimal();

    
            }
            
            else if (pilihan == 3) {
                
                System.exit(0);
            }
            
            else if (pilihan >= 4) {
                
                System.out.println("Pilihan Tidak Ada !!");
            }
                System.out.print("Apakah Anda Mau Memilih Menu Lain? (Y/T) "); 
        //untuk menginput memilih lagi atau tidak
        kembali = awal.next();
        //System.out.flush(); 
     }
    }
}
