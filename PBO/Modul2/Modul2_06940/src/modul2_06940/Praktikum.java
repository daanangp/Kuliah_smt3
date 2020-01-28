package modul2_06940;

//import java scanner
import java.util.Scanner;
 
public class Praktikum {
    int id,kelas,nilai_mtk,nilai_ipa;
    String nama;
    Praktikum next;
    
    public static Scanner in=new Scanner(System.in);
    public static Scanner str=new Scanner(System.in);
    
    public void input(){
        System.out.print("Masukkan id               : ");
        id=in.nextInt();
        System.out.print("Masukkan Nama             : ");
        nama=str.nextLine();
        System.out.print("Masukkan Kelas            : ");
        kelas=in.nextInt();
        System.out.print("Masukan Nilai Matematika  : ");
        nilai_mtk=in.nextInt();
        System.out.print("Masukkan Nilai IPA        : ");
        nilai_ipa=in.nextInt();

        next=null;
    }
    
    //methot view
    public void view(){
        System.out.println("| " +id+ " | "  +nama+  " | "  +kelas+  " | " +nilai_mtk+ " | " +nilai_ipa+ " |");
        System.out.println("==========================================================");
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int menu=0,del;
        linkedlist pilihan=new linkedlist();
        while(menu!=4){
            System.out.println("=== || APLIKASI RAPORT ELEKTRIK ||===");
            //System.out.print("1.Input\n`2.View\n3.Delete\n4.Exit\n : ");
            System.out.println("1. Masukan Data ");
            System.out.println("2. Lihat Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Exit Aplikasi");
            System.out.println("=====================================");
            System.out.print("MASUKAN PILIHAN ANDA : ");
            menu=in.nextInt();
            System.out.println("=====================================");
            
            //pilihan menu
            switch (menu) {
                case 1:
                    pilihan.add();
                    break;
                case 2:
                    pilihan.view();
                    break;
                case 3:
                    System.out.print("1.Data Pertama\n2.Data Terkahir\n : ");
                    del=in.nextInt();
                    

                    break;
                    
                case 4:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Salah");
                    break;
            }
            System.out.println();
            
        }
        //end menu
    }
}
 

//CLASS
class linkedlist{
    Praktikum head,tail;
    public linkedlist(){
        head=null;
        tail=null;
    }
    
    public void add(){
        Praktikum baru=new Praktikum();
        baru.input();
        if(head==null) head=baru;
        else tail.next=baru;
        tail=baru;
    }
    public void view(){
        if(head==null){
            System.out.println("Kosong");
            return;
        }
        System.out.println("| Id | Nama | Kelas | Nilai MTK | NILAI IPA |");
        Praktikum ptr=head;
        while(ptr!=null){
            ptr.view();
            ptr=ptr.next;
        }
    }
}