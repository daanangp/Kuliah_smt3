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
class BarangKirim {
    Admin pegawai;
    Pemesan pelanggan;
    float berat, hargaTotal;
    String status1=" PROSES ";
    String status2=" SELESAI";
    
    
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
    
    
    void setStatus2(){
        String status2 = " SELESAI";
        this.status2 = status2;
    }
    
    String getStatus2(){
        return status2;
    }
            
    
}
