/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06940_danangmodul3;

/**
 *
 * @author UseR_Daan
 */
class Manusia {
    String nama;
    String noHp;
    
   Manusia(){
    //clonstructor milik class parent 
        System.out.println("\n   == OWNER APLIKASI ==");
        System.out.println("      Owner : Danang P");
        System.out.println("      NPM   : 06940   ");
    }
    
    void setNama(String nama){
        this.nama = nama;
    }
    
    String getNama(){
        return nama;
    }
    
    void setNoHp(String noHp){
        this.noHp = noHp;
    }
    
    String getNoHp(){
        return noHp;
    
    }    
}
