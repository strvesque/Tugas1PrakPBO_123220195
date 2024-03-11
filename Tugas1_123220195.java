/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1_123220195;

import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
class LoginFrame extends JFrame {
    
    JLabel headersatu = new JLabel("Selamat Datang!");
    JLabel infosatu = new JLabel("Silahkan masuk untuk melanjutkan.");
    JLabel username = new JLabel("Username");
    JLabel password = new JLabel("Password");
    JLabel jk = new JLabel("Jenis Kelamin");
    
    JTextField inputusername = new JTextField();
    JPasswordField inputpassword = new JPasswordField();
    
    JRadioButton jklaki = new JRadioButton("Laki-Laki");
    JRadioButton jkperempuan = new JRadioButton("Perempuan");
    
    JButton loginbutton = new JButton("Login");
    
    LoginFrame(){
        
        setVisible(true);
        setSize(560, 550); 
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(null);
        
        add(headersatu);
        headersatu.setFont(new Font("arial", Font.BOLD, 19));
        headersatu.setBounds(25,25,150,35);
        
        add(infosatu);
        infosatu.setFont (new Font("arial", Font.BOLD, 13));
        infosatu.setBounds(25,50,250,35);
        
        add(username);
        username.setBounds(25,80,150,35);
        
        add(password);
        password.setBounds(25,140,150,35);
        
        add(jk);
        jk.setBounds(25,200,150,35);
        
        add(inputusername);
        inputusername.setBounds(25,110,435,25);
        
        add(inputpassword);
        inputpassword.setBounds(25,170,435,25);
        
        ButtonGroup pilihJenisKelamin = new ButtonGroup();
        pilihJenisKelamin.add(jklaki);
        pilihJenisKelamin.add(jkperempuan);
        
        add(jklaki);
        jklaki.setBounds(25, 225, 100, 25);
        
        add(jkperempuan);
        jkperempuan.setBounds(200, 225, 100, 25);
        
        add(loginbutton);
        loginbutton.setBounds(15, 275, 455, 35);
        
    }
    
}
 
class UtamaFrame extends JFrame {
    
    JLabel headerdua = new JLabel("Welcome, [Mr./Mrs.][username]");
    JLabel infodua = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung Balok");
    JLabel panjang = new JLabel("Panjang");
    JLabel lebar = new JLabel("Lebar");
    JLabel tinggi = new JLabel("Tinggi");
    JLabel hasil = new JLabel("Hasil");
    JLabel Lpersegi = new JLabel("Luas Persegi");
    JLabel Kelpersegi = new JLabel("Keliling Persegi");
    JLabel Volbalok = new JLabel("Volume Balok");
    JLabel LPbalok = new JLabel("Luas Permukaan Balok");
    JLabel hasilLpersegi = new JLabel("[Hasil berupa angka]");
    JLabel hasilKelpersegi = new JLabel("[Hasil berupa angka]");
    JLabel hasilVolbalok = new JLabel("[Hasil berupa angka]");
    JLabel hasilLPbalok = new JLabel("[Hasil berupa angka]");
    
    
    JTextField Panjang = new JTextField();
    JTextField Lebar = new JTextField();
    JTextField Tinggi = new JTextField();
    
    JButton hitung = new JButton("Hitung");
    JButton reset = new JButton("Reset");
    
    UtamaFrame(){
        
        setVisible(true);
        setSize(560, 550); 
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(null);
        
        add(headerdua);
        headerdua.setFont(new Font("arial", Font.BOLD, 19));
        headerdua.setBounds(25,25,310,35);
        
        add(infodua);
        infodua.setFont(new Font("arial", Font.BOLD, 13));
        infodua.setBounds(25,50,400,35);
        
        add(panjang);
        panjang.setBounds(25,100,50,15);
        
        add(lebar);
        lebar.setBounds(25,140,50,15);
        
        add(tinggi);
        tinggi.setBounds(25,180,50,15);
        
        add(hasil);
        hasil.setBounds(241,330,50,15);
        
        add(Lpersegi);
        Lpersegi.setBounds(25,360,100,15);
        
        add(hasilLpersegi);
        hasilLpersegi.setBounds(195,360,150,15);
        
        add(Kelpersegi);
        Kelpersegi.setBounds(25,385,100,15);
        
        add(hasilKelpersegi);
        hasilKelpersegi.setBounds(195,385,150,15);
        
        add(Volbalok);
        Volbalok.setBounds(25,410,100,15);
        
        add(hasilVolbalok);
        hasilVolbalok.setBounds(195,410,150,15);
        
        add(LPbalok);
        LPbalok.setBounds(25,435,150,15);
        
        add(hasilLPbalok);
        hasilLPbalok.setBounds(195,435,150,15);
        
        add(Panjang);
        Panjang.setBounds(150,95,335,30);
        
        add(Lebar);
        Lebar.setBounds(150,135,335,30);
        
        add(Tinggi);
        Tinggi.setBounds(150,175,335,30);
        
        add(hitung);
        hitung.setBounds(25,230,460,35);
        
        add(reset);
        reset.setBounds(25,275,460,35);
        
    }
    
}

public class Tugas1_123220195 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LoginFrame halamansatu = new LoginFrame();
        UtamaFrame halamandua = new UtamaFrame();
        
        
    }
    
}
