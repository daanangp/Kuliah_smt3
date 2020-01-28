/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.modul.pkg5;
import pajak.pajak;
/**
 *
 * @author Danang
 */
public class karyawan extends bonus{
    private String jabatan;
    private String status;
    private String nama;
    private double gaji;
    pajak pajak = new pajak();
    
    public void karyawan()
    {
        
    }

    public karyawan(String jabatan, String status, String nama, double gaji) {
        this.jabatan = jabatan;
        this.status = status;
        this.nama = nama;
        this.gaji = gaji;
    }
    
    
    @Override
    public double tunjangan(String status) {
        double hasil =0;
        double tunjangan;
  
            switch (status) {
            //belum menikah
                case "BM":
                    hasil = getGaji();
                    tunjangan = getGaji() * 0;
                    System.out.println("=======================");
                    System.out.print("GAJI Rp. " + getGaji() + " |");
                    System.out.println("TUnjangan BM 0% = Rp. " + tunjangan );
                    System.out.println("=======================");
                    break;
            //sudah menikah
                case "SM":
                    hasil = getGaji()+(getGaji()*0.1);
                    tunjangan = getGaji() *0.1;
                    System.out.println("=======================");
                    System.out.print("GAJI Rp. " + getGaji() + " ");
                    System.out.println("Tunjangan SM 10% = Rp. " + tunjangan );
                    System.out.println("=======================");
                    break;
            //memiliki
                case "MA":
                    hasil =  getGaji()+(getGaji()*0.2);
                    tunjangan = getGaji() *0.2;
                    System.out.println("=======================");
                    System.out.print("GAJI Rp. " + getGaji());
                    System.out.println("Tunjangan MA 20% = Rp. " + tunjangan );
                    System.out.println("=======================");
                    break;
                    
                default:
                    break;
            }
        
 
        return hasil;
    }
    
    public double hasil(String jabatan, String status)
    {
        double hasil = 0;
        System.out.println("============"  );        
        System.out.println("PRINT DATA :"  );
        System.out.println("============"  );        
        hasil = tunjangan(status) - pajak.pjk(jabatan, tunjangan(status));
        System.out.print("PENDAPATAN : Rp. "  );
        return hasil;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
