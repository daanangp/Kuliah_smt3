package pkg06940_praktikummodul4;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    static Scanner scan=new Scanner(System.in);
    static ArrayList<Pegawai> pegawaiArr=new ArrayList<>();
    static ArrayList<Pelanggan> pelangganArr=new ArrayList<>();
    static ArrayList<Cucian> cucianArr=new ArrayList<>();
    static ArrayList<CucianMember> cucianMemberArr=new ArrayList<>();
    static ArrayList<PelangganMember> pelangganMembersArr=new ArrayList<>();
    
    public static void main(String[] args) {

        
        int menu,addPelanggan,addCucian;
        do
        {
            System.out.println("===========================");
            System.out.println("     SISTEM INFORMASI");
            System.out.println("          LAUNDRY 2.0");
            System.out.println("===========================");
            System.out.println("\n\n ==== Menu ====: ");
            System.out.println(" 1. Tambah Kasir");
            System.out.println(" 2. Tambah Pelanggan (REGULAR)");
            System.out.println(" 3. Tambah Pelanggan (MEMBER)");
            System.out.println(" 4. Tambah Transaksi Cucian");
            System.out.println(" 5. Tampilkan Data ");
            System.out.println("===========================");
            System.out.println(" 6. IN                    FO PEMILIK PROGRAM");
            System.out.println("===========================");
            System.out.println(" 0. Selesai");
            System.out.print(" Masukkan nomor menu : ");
            menu=scan.nextInt();
            
            switch(menu)
            {
                case 1 :
                    Main.tambahKasir();break;
                case 2 :
                    Main.tambahPelanggan();break;
                case 3 :
                    Main.tambahPelangganMember();break;
                    
                case 4 :
                    System.out.println("1.Add_Cucian \n2. Add_Cucian Member\n Masukan:");
                    addCucian=scan.nextInt();
                    
                    switch(addCucian)
                    {
                        case 1:
                            Main.tambahCucian();break;
                        case 2:
                            Main.tambahCucianMember();break;
                        default:
                            System.err.println("Salah");
                            break;
                    }
                    break;
                case 5 :
                    Main.tampilkanData();break;
                    
                case 6 : 
                    Main.pemilikProgram();break;
                    
                default :
                    menu = 0;
                    System.out.println(" Terima kasih telah menggunakan Sistem Informasi Laundry RPL!!!");
            }
        }while(menu !=0 && menu !=6);
        
    }
    static void pemilikProgram()
    {
        Owner pemilik = new Owner("USER",69);
        System.out.println("HALLO "+pemilik.getName());
        pemilik.apk();
        pemilik.apk(18);
        System.out.println("DONASI : NoRec: 02891829821");
    }
    static void tampilkanData()
    {
        System.out.println("========================");
        System.out.println("\n\n Data Pegawai     : ");
        for(int i=0; i<pegawaiArr.size(); i++)
        {
            pegawaiArr.get(i).print();
        }
        System.out.println("\n\n Data Pelanggan   : ");
        for(int i=0; i<pelangganArr.size(); i++)
        {
            pelangganArr.get(i).print();
        }
        
        System.out.println("\n\n Pelanggan Member : ");
        for(int i=0; i<pelangganMembersArr.size(); i++)
        {
            pelangganMembersArr.get(i).print();
        }
        System.out.println("\n\n Data Cucian      : ");
        for(int i=0; i<cucianArr.size(); i++)
        {
            cucianArr.get(i).print();
        }
        
        System.out.println("\n\n Data Cucian Member      : ");
        for(int i=0; i<cucianMemberArr.size(); i++)
        {
            cucianMemberArr.get(i).print();
        }
        System.out.println("========================");

    }
    
    static void tambahKasir()
    {
        System.out.println(" Tambah data pegawai!");
        Pegawai pegawai=new Pegawai();
        
        System.out.println(" ID PEGAWAI : "+String.valueOf(pegawaiArr.size()+1));
        pegawai.setId(pegawaiArr.size()+1);
        System.out.print(" Nama Pegawai       : ");
        pegawai.setNama(scan.next());
        System.out.print(" Kata Sandi Pegawai : ");
        pegawai.setKataSandi(scan.next());
        System.out.print(" Nomor HP Pegawai   : ");
        pegawai.setNoHp(scan.next());
        pegawaiArr.add(pegawai);
    }
    
    static void tambahPelanggan()
    {
        System.out.println(" Tambah data pelanggan!");
        Pelanggan pelanggan=new Pelanggan();
        
        System.out.println(" ID PELANGGAN : "+String.valueOf(pelangganArr.size()+1));
        pelanggan.setId(pelangganArr.size()+1);
        System.out.print(" Nama Pelanggan       : ");
        pelanggan.setNama(scan.next());
        System.out.print(" Nomor HP Pelanggan   : ");
        pelanggan.setNoHp(scan.next());
        pelangganArr.add(pelanggan);
    }
    
        static void tambahPelangganMember()
    {
        System.out.println(" Tambah data pelanggan Member!");
        PelangganMember pelanggan_mem = new PelangganMember();
        
        System.out.println(" ID PELANGGAN Member: "+String.valueOf(pelangganMembersArr.size()+1));
        pelanggan_mem.setId(pelangganMembersArr.size()+1);
        System.out.print(" Nama Pelanggan Member      : ");
        pelanggan_mem.setNama(scan.next());
        System.out.print(" Nomor HP Pelanggan Member  : ");
        pelanggan_mem.setNoHp(scan.next());
        System.out.print(" Alamat Pelanggan Member : ");
        pelanggan_mem.setAlamat(scan.next());
        pelangganMembersArr.add(pelanggan_mem);
    }
    
    
    static void tambahCucian()
    {
        System.out.println(" Tambah data Cucian!");
        Cucian cucian=new Cucian();
        
        System.out.print(" ID Pegawai       : ");
        cucian.setPegawai(pegawaiArr.get(scan.nextInt()-1));
        System.out.print(" ID Pelanggan     : ");
        cucian.setPelanggan(pelangganArr.get(scan.nextInt()-1));
        System.out.print(" Berat Cucian Kering (KG): ");
        cucian.getHargaTotal1(scan.nextFloat());
        System.out.print(" Berat Cucian Basah (KG): ");
        cucian.getHargaTotal2(scan.nextFloat());
        System.out.print(" Berat Cucian Strika (KG): ");
        cucian.getHargaTotal3(scan.nextFloat());
        cucianArr.add(cucian);
    }
    
        static void tambahCucianMember()
    {
        System.out.println(" Tambah data Cucian!");
        CucianMember cucian_member=new CucianMember();
        
        System.out.print(" ID Pegawai       : ");
        cucian_member.setPegawai(pegawaiArr.get(scan.nextInt()-1));
        System.out.print(" ID Pelanggan     : ");
        cucian_member.setPelanggan(pelangganMembersArr.get(scan.nextInt()-1));
        System.out.print(" Berat Cucian Kering (KG): ");
        cucian_member.getHargaTotal1(scan.nextFloat());
        System.out.print(" Berat Cucian Basah (KG): ");
        cucian_member.getHargaTotal2(scan.nextFloat()); 
        System.out.print(" Berat Cucian Setrika (KG): ");
        cucian_member.getHargaTotal3(scan.nextFloat());        
        cucianMemberArr.add(cucian_member);
    }
    
}
