/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabungan_Siswa;

/**
 *
 * @author Danang
 */
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Danang
 */
public class ProsesDataTabungan extends javax.swing.JFrame {

    /** Creates new form PenentuNilaiMahasiswa */
    public ProsesDataTabungan() {
        initComponents();
           Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            Dimension frameSize = this.getSize();
            if (frameSize.height > screenSize.height) {
                frameSize.height = screenSize.height;
            }
            if (frameSize.width > screenSize.width) {
                frameSize.width = screenSize.width;
            }
            this.setLocation(
                    (screenSize.width - frameSize.width) / 2, 
                    (screenSize.height - frameSize.height) / 2); 
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNpm = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblBULAN1 = new javax.swing.JLabel();
        txtBULAN1 = new javax.swing.JTextField();
        lblBULAN2 = new javax.swing.JLabel();
        txtBULAN2 = new javax.swing.JTextField();
        lblBULAN3 = new javax.swing.JLabel();
        txtBULAN3 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblNama = new javax.swing.JLabel();
        LblTabunganrata = new javax.swing.JLabel();
        LblGrade = new javax.swing.JLabel();
        lblHasil = new javax.swing.JLabel();
        txtnama1 = new javax.swing.JTextField();
        TxtnilaiTabungan2 = new javax.swing.JTextField();
        txtgrade = new javax.swing.JTextField();
        txthasil = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        BtnHitung = new javax.swing.JButton();
        BtnBersihkan = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Pencatatan Tabungan Mahasiswa 3/bln");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("BIODATA :"));

        jLabel1.setText(" NPM : ");

        txtNpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNpmActionPerformed(evt);
            }
        });

        jLabel2.setText(" Nama Lengkap : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNpm, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("TABUNGAN /BLN"));

        lblBULAN1.setText("BULAN (1) : ");

        txtBULAN1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBULAN1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBULAN1KeyTyped(evt);
            }
        });

        lblBULAN2.setText("BULAN (2) : ");

        txtBULAN2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBULAN2KeyTyped(evt);
            }
        });

        lblBULAN3.setText("BULAN (3) : ");

        txtBULAN3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBULAN3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblBULAN3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(txtBULAN3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBULAN1)
                            .addComponent(lblBULAN2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBULAN1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBULAN2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBULAN1)
                    .addComponent(txtBULAN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBULAN2)
                    .addComponent(txtBULAN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBULAN3)
                    .addComponent(txtBULAN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(" Hasil Tabungan "));

        lblNama.setText(" Nama : ");

        LblTabunganrata.setText(" Tabungan Rata-Rata /bln : ");

        LblGrade.setText(" Pencapaian : ");

        lblHasil.setText(" PESAN : ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNama)
                    .addComponent(LblTabunganrata)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblGrade)
                            .addComponent(lblHasil))))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtnilaiTabungan2)
                    .addComponent(txtgrade)
                    .addComponent(txthasil)
                    .addComponent(txtnama1))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNama)
                            .addComponent(txtnama1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtnilaiTabungan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LblTabunganrata)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblGrade)
                    .addComponent(txtgrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHasil)
                    .addComponent(txthasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(" PROSES TABUNGAN !"));

        BtnHitung.setText("Hitung");
        BtnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHitungActionPerformed(evt);
            }
        });

        BtnBersihkan.setText("Hapus");
        BtnBersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBersihkanActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(BtnHitung)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBersihkan, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSimpan)
                .addGap(18, 18, 18)
                .addComponent(btnKeluar)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnHitung)
                    .addComponent(BtnBersihkan)
                    .addComponent(btnSimpan)
                    .addComponent(btnKeluar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {                                          
      int reply = JOptionPane.showConfirmDialog(null, "Yakin Keluar",
             "Konfirmasi Keluar Aplikasi",JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }                                         

    private void BtnHitungActionPerformed(java.awt.event.ActionEvent evt) {                                          

        
      double bulan1 = Double.parseDouble(txtBULAN1.getText());
      double bulan2 = Double.parseDouble(txtBULAN2.getText());
      double bulan3 = Double.parseDouble(txtBULAN3.getText());
      
      double nilaiTabungan = (bulan1 + bulan2 + bulan3) / 3 ;
      txtNpm.getText();
      txtnama1.setText(txtNama.getText());
      TxtnilaiTabungan2.setText(nilaiTabungan + "");
      
      if (nilaiTabungan >= 1200000) {
          txtgrade.setText("NICE");
          txthasil.setText("Alhamdullilah");
      }
      else
          if (nilaiTabungan >= 1000000) {
              txtgrade.setText("GOOD");
              txthasil.setText("Tingkatkan Lagi");
              
          }
      else
              if(nilaiTabungan >= 800000){
                  txtgrade.setText("HMMM ");
                  txthasil.setText("Lebih Semangat Lagi");
              }
      else
              {
                  txtgrade.setText("SAD ANJAY");
                  txthasil.setText("Astaga Parah !!! ");
              }
         
    }                                         

    private void BtnBersihkanActionPerformed(java.awt.event.ActionEvent evt) {                                             
       txtNpm.setText("");
       txtNama.setText("");
       TxtnilaiTabungan2.setText("");
       txtnama1.setText("");
       txtgrade.setText("");
       txthasil.setText("");
       txtBULAN1.setText("");
       txtBULAN3.setText("");
       txtBULAN2.setText("");
       LblGrade.setText("Grade :");
       LblTabunganrata.setText("Tabungan Rata - Rata");
       lblHasil.setText("Hasil");
       lblNama.setText("Nama");
       txtNpm.requestFocus();
    }                                            

    private void txtBULAN1KeyTyped(java.awt.event.KeyEvent evt) {                                
       
    char karakter = evt.getKeyChar();
    if(!(((karakter >= '0') && (karakter <= '9') 
        || (karakter == KeyEvent.VK_BACK_SPACE) 
        || (karakter == KeyEvent.VK_DELETE)))){
    getToolkit().beep();
              JOptionPane.showMessageDialog(null," Hanya Angka YA !");
    evt.consume();
    }                               
    }
    
    private void txtBULAN2KeyTyped(java.awt.event.KeyEvent evt) {                               
            char c = evt.getKeyChar();
      if (! ((Character.isDigit(c) ||
              (c == KeyEvent.VK_BACK_SPACE) ||
              (c == KeyEvent.VK_DELETE))
              )){
          getToolkit().beep();
          JOptionPane.showMessageDialog(null,"Hanya Angka YA !");
          evt.consume();
      }
    }                              

    private void txtBULAN3KeyTyped(java.awt.event.KeyEvent evt) {                                
            char c = evt.getKeyChar();
      if (! ((Character.isDigit(c) ||
              (c == KeyEvent.VK_BACK_SPACE) ||
              (c == KeyEvent.VK_DELETE))
              )){
          getToolkit().beep();
          JOptionPane.showMessageDialog(null,"Hanya Angka YA !");
          evt.consume();
      }
    }                               

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        try{
            
          BufferedWriter out = new BufferedWriter(new FileWriter(" Rincian.txt") );
          out.write(jLabel1.getText());       
          out.write(txtNpm.getText());
          out.write(jLabel2.getText());
          out.write(txtNama.getText());
          
          out.write(lblBULAN1.getText());
          out.write(txtBULAN1.getText());

          out.write(lblBULAN2.getText());
          out.write(txtBULAN2.getText());
          out.write(lblBULAN3.getText());
          out.write(txtBULAN3.getText());
         
          out.write(lblHasil.getText());
          out.write(txthasil.getText());
          out.write(LblGrade.getText());
          out.write(txtgrade.getText());
          
          out.write(LblTabunganrata.getText());
          out.write(TxtnilaiTabungan2.getText());
          
          JOptionPane.showMessageDialog(null, "Berhasil Disimpan Filenya");
          out.close();
        }catch (Exception e) {
            System.err.println("Error " +e.getMessage());
        }
    }                                         

    private void txtBULAN1KeyPressed(java.awt.event.KeyEvent evt) {                                  
        System.out.println(evt.getKeyCode());
        
        if(evt.getKeyCode() == 10){
                int v = Integer.valueOf(txtBULAN1.getText());
                if (v >100)
      {
          JOptionPane.showMessageDialog(null, "Angka");
      }
         }
    }                                 

    private void txtNpmActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ProsesDataTabungan().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton BtnBersihkan;
    private javax.swing.JButton BtnHitung;
    private javax.swing.JLabel LblGrade;
    private javax.swing.JLabel LblTabunganrata;
    private javax.swing.JTextField TxtnilaiTabungan2;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblHasil;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblBULAN1;
    private javax.swing.JLabel lblBULAN2;
    private javax.swing.JLabel lblBULAN3;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNpm;
    private javax.swing.JTextField txtBULAN2;
    private javax.swing.JTextField txtBULAN3;
    private javax.swing.JTextField txtBULAN1;
    private javax.swing.JTextField txtgrade;
    private javax.swing.JTextField txthasil;
    private javax.swing.JTextField txtnama1;
    // End of variables declaration                   
}

