package pkg06940_praktikummodul4;

public class Cucian {
    
    private Pegawai pegawai;
    private Pelanggan pelanggan;
    private float berat1,berat2,berat3,hargaTotal;       
    private final float perKilo_Kering = 3500;
    private final float perKilo_Basah = 2500;
    private final float perKilo_Setrika = 5000;        
            
            
    
    public void setPegawai(Pegawai pegawai)
    {
        this.pegawai=pegawai;
    }
    private Pegawai getPegawai()
    {
        return pegawai;
    }
    
    public void setPelanggan(Pelanggan pelanggan)
    {
        this.pelanggan=pelanggan;
    }
    private Pelanggan getPelanggan()
    {
        return pelanggan;
    }
    private float getBerat1()
    {
        return berat1;
    }
        private float getBerat2()
    {
        return berat2;
    }
        private float getBerat3()
    {
        return berat3;
    }
    
    private float getPerKilo_Kering()
    {
        return this.perKilo_Kering;
        
    }
    
    private float getPerKilo_Basah()
    {
        return this.perKilo_Kering;
        
    }
    
    private float getPerKilo_Strika()
    {
        return this.perKilo_Setrika;
        
    }
        
    public float getHargaTotal1(float berat1)
    {
        this.berat1=berat1;
        return this.berat1;
    }
    
        public float getHargaTotal2(float berat2)
    {
        this.berat2=berat2;
        return this.berat2;
    }
        public float getHargaTotal3(float berat3)
    {
        this.berat3=berat3;
        return this.berat3;
    }
        
    private float getHargaTotal1(float berat1, float perKilo_Kering)
    {
        return this.hargaTotal=berat1*perKilo_Kering;
    }
    private float getHargaTotal2(float berat2, float perKilo_Basah)
    {
        return this.hargaTotal=berat2*perKilo_Basah;
    }
    private float getHargaTotal3(float berat3, float perKilo_Setrika)
    {
        return this.hargaTotal=berat3*perKilo_Setrika;
    }
    
    public void print()
    {
        System.out.println(" Nama Pegawai       : "+this.getPegawai().getNama());
        System.out.println(" Nama Pelanggan     : "+this.getPelanggan().getNama());
        System.out.println(" Berat cucian  Kering     : "+this.getBerat1()+" KG.");
        System.out.println(" Berat cucian  Basah      : "+this.getBerat2()+" KG.");
        System.out.println(" Berat cucian  Strika     : "+this.getBerat3()+" KG.");
        System.out.println(" Harga total cucian Kering : Rp."+this.getHargaTotal1(this.getHargaTotal1(berat1),this.getPerKilo_Kering()));
        System.out.println(" Harga total cucian Basah : Rp."+this.getHargaTotal2(this.getHargaTotal2(berat2),this.getPerKilo_Basah()));
        System.out.println(" Harga total cucian Strika : Rp."+this.getHargaTotal3(this.getHargaTotal3(berat3),this.getPerKilo_Strika()));
    }
}
