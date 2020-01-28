package pkg06940_praktikummodul4;

public class Manusia {
    
    private String nama;
    private String noHp;
    private String alamat;
    
    public void setNama(String nama)
    {
        this.nama=nama;
    }
    protected String getNama()
    {
        return nama;
    }
    public void setNoHp(String noHp)
    {
        this.noHp=noHp;
    }
    protected String getNoHp()
    {
        return noHp;
    }
    
    public void setAlamat(String alamat)
    {
        this.alamat=alamat;
    
    }
    
    protected String getAlamat()
    {
       return alamat;
    }
    
    public void print()
    {
        System.out.println(" Nama   : "+this.getNama());
        System.out.println(" No HP  : "+this.getNoHp());
        System.out.println(" Alamat : "+this.getAlamat());
    }
    
}
