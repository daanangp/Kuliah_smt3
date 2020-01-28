package pkg06940_praktikummodul4;

public class Pelanggan extends Manusia {
    
    private int id;
    String status1=" Regular ";
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    
    void setStatus1(){
        String status_1 = " Regular ";
        this.status1 = status_1;
    }
    
    String getStatus1(){
        return status1;
    } 
    @Override
    public void print()
    {
        System.out.println(" Id Pelanggan : "+this.getId());
        System.out.println(" Nama         : "+this.getNama());
        System.out.println(" No Hp        : "+this.getNoHp());
        System.out.println(" Status        : "+status1);
    }
}
