/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Danang
 */ 
public class GUI extends Komponen {
    public GUI(){
        

        //npm
        npm.setBounds(20, 30, 200, 30);
        npm.setFont(new Font("Arial",Font.BOLD,15));
        //npm.setForeground(new Color(20, 1, 188));
        nm.setBounds(160, 30, 330, 22);
        nm.setFont(new Font("Arial",Font.BOLD,15));
        //nama
        nama.setBounds(20, 55, 200, 30);
        nama.setFont(new Font("Arial",Font.BOLD,15));
        name.setBounds(160, 55, 330, 22);
        name.setFont(new Font("Arial",Font.BOLD,15));
        //telephone
        telp.setBounds(20, 80, 200, 30);
        telp.setFont(new Font("Arial",Font.BOLD,15));
        phone.setBounds(160, 80, 330, 22);
        phone.setFont(new Font("Arial",Font.BOLD,15));
        //jenis kelamin
        jKelamin.setBounds(20, 105, 200, 30);
        jKelamin.setFont(new Font("Arial",Font.BOLD,15));
        pria.setBounds(160, 105, 50, 25);
        wanita.setBounds(230, 105, 80, 25);
                bg.add(pria);
        bg.add(wanita);
        frame.add(pria);
        frame.add(wanita);

        TTL.setBounds(20, 130, 200, 30);
        TTL.setFont(new Font("Arial",Font.BOLD,15));
        tempat.setBounds(160, 130, 100, 22);
        tempat.setFont(new Font("Arial",Font.BOLD,15));
        tgl.setBounds(270, 130, 40, 22);
        bln.setBounds(320, 130, 90, 22);
        thn.setBounds(430, 130, 60, 22);
        //hobby
        hobby.setBounds(20, 155, 200, 30);
        hobby.setFont(new Font("Arial",Font.BOLD,15));
        coding.setBounds(160, 155, 80, 25);
        baca.setBounds(280, 155, 120, 25);
        desain.setBounds(160, 175, 80, 25);
        makan.setBounds(280, 175, 120, 25);
        game.setBounds(160, 195, 80, 25);
        dll.setBounds(280, 195, 120, 25);
        //alamat
        alamat.setBounds(20, 220, 200, 30);
        alamat.setFont(new Font("Arial",Font.BOLD,15));
        almt.setBounds(160, 220, 330, 40);
        almt.setFont(new Font("Arial",Font.BOLD,15));
        //button
        in.setBounds(160, 270, 90, 22);
        cencel.setBounds(300, 270, 90, 22);
        
        add(npm);
        add(nm);
        
        add(nama);
        add(name);
        
        add(telp);
        add(phone);
        
        add(jKelamin);
        add(pria);
        add(wanita);
        
        add(TTL);
        add(tempat);
        add(tgl);
        add(bln);
        add(thn);
        
        add(hobby);
        add(baca);
        add(coding);
        add(desain);
        add(makan);
        add(game);
        add(dll);
        
        add(alamat);
        add(almt);
        
        add(in);
        add(cencel);
        
        in.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String hobby = "";
                if(coding.isSelected()){
                    hobby += coding.getActionCommand()+", ";
                }
                if(baca.isSelected()){
                    hobby += baca.getActionCommand()+", ";
                }
                if(desain.isSelected()){
                    hobby += desain.getActionCommand()+", ";
                }
                if(makan.isSelected()){
                    hobby += makan.getActionCommand()+", ";
                }
                if(game.isSelected()){
                    hobby += game.getActionCommand()+", ";
                }
                if(dll.isSelected()){
                    hobby += dll.getActionCommand()+",";
                }
                
                String Gender = "";
                if(pria.isSelected()){
                    Gender+= pria.getActionCommand();
                }
                
                if(wanita.isSelected()){
                    Gender+= wanita.getActionCommand();
                }
                
                    JOptionPane.showMessageDialog(null, 
                                "Nama            : "+nm.getText()+"\n"+
                                "NPM           : "+name.getText()+"\n"+
                                "Falkutas           : "+phone.getText()+"\n"+
                                //"Jenis kelamin  : "+Gender+"\n"+
                                //"TTL            : "+tempat.getText()+" "+tgl.getSelectedItem()+" "+bln.getSelectedItem()+" "+thn.getSelectedItem()+"\n"+
                                //"Hobby          : "+hobby+"\n"+
                                "Jurusan         : "+almt.getText()+"\n"
                            );
                }
            });
      
            cencel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    dispose();
                }
            });
        

        setTitle("Data Mahasiswa");
        setSize(700, 500);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
}
