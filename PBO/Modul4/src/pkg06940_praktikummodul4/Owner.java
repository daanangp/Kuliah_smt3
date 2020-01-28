/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06940_praktikummodul4;

/**
 *
 * @author UseR_Daan
 */
public class Owner {
    //private int id, age;
    private final String name;
    private int umur;
    public Owner(String name, int umur) {
        this.name = name;
        this.umur = umur;
        
        
    }
    public void apk (){
        System.out.println("1. Nama : Danang Priambodo");
        
    }
    
    public void apk (int umur) {
        System.out.println("2. Umur Saya " + umur + " Tahun");
            
    }
    public String getName() {
        return name;
    }
}
