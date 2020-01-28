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
class Admin extends Manusia {
    int id;
    String kataSandi;
  
//construktor admin  
  Admin(){
      super ();
      //menggunakan keyword super panggil construktor parent
      System.out.println("   ====================");
  
  }
    
    void setId( int id){
        this.id = id;
    }
    
    int getId(){
        return id;
    }
    
    void setKataSandi(String kataSandi){
        this.kataSandi = kataSandi;
    }
    
    String getKataSandi() {
        return kataSandi;
    }
    
}
