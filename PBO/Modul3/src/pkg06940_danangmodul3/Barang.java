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
class Barang {
    Admin pegawai;
    Pemesan pelanggan;
    float berat, hargaTotal;
    String status1=" PROSES ";
    
    
    void setAdmin ( Admin pegawai){
        this.pegawai = pegawai;
    
    }
    Admin getAdmin(){
        return pegawai;
    }
    
    void setPemesan ( Pemesan pelanggan) {
        this.pelanggan = pelanggan;
    }
    Pemesan getPemesan(){
        return pelanggan;
    }
    
    void setBerat (float berat){
        float perKilo = 5000;
        this.berat = berat;
        this.hargaTotal = this.getBerat()*perKilo;
    }
    
    float getBerat(){
        return berat;
    }
    
    float getHargaTotal(){
        return hargaTotal;
    }
    
    
    void setStatus1(){
        String status1 = " PROSES ";
        this.status1 = status1;
    }
    
    String getStatus1(){
        return status1;
    }

            
    
}
