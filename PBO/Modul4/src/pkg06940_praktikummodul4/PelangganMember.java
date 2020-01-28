package pkg06940_praktikummodul4;

public class PelangganMember extends Manusia {
    
    private int id;
    String status2=" Member ";
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    
    void setStatus2(){
        //String status2 = " MEMBER ";
        this.status2 = status2;
    }
    
    String getStatus2(){
        return status2;
    } 
    @Override
    public void print()
    {
        System.out.println(" Id Pelanggan : "+this.getId());
        System.out.println(" Nama         : "+this.getNama());
        System.out.println(" No Hp        : "+this.getNoHp());
        System.out.println(" Alamat       : "+this.getAlamat());
        System.out.println(" Status        : "+status2);
    }
}
