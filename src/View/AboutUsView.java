package View;

import javax.swing.*;
import java.awt.*;

public class AboutUsView extends JFrame {
    JLabel text = new JLabel("About Us");

    public JButton btnBorrow = new JButton("Pinjam");
    public JButton btnRead = new JButton("Tampil");
    public JButton btnAbout = new JButton("About Us");
    public JButton back = new JButton();

    Color bgdashboard = new Color(23, 34, 59);
    Color box1 = new Color(62, 134, 160);
    Color label = new Color(207, 117, 0);
    Color font = new Color(255,255,255);
    Color ftitle = new Color(255, 198, 109);

    JLabel lNama = new JLabel("Name");
    JLabel lNIM = new JLabel("NIM");
    JLabel lKelas = new JLabel("Kelas");
    JLabel lNamaDetail = new JLabel(" : Muhammad Anjar Harimurti Rahadi");
    JLabel lNIMDetail = new JLabel(" : 123180056");
    JLabel lKelasDetail = new JLabel(" : Praktikum PBO Plug A");

    public AboutUsView() {
        getContentPane().setBackground(bgdashboard);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(400, 220);
        setTitle("Perpustakaan");

        add(text);
        text.setBounds(145, 50, 110, 20);
        text.setFont(new Font("Gilroy Light",Font.PLAIN,16));
        text.setForeground(ftitle);

        back.setIcon(new ImageIcon("src\\Image\\back1.png"));
        add(back);
        back.setBounds(4,4,30,30);
        back.setBackground(font);

        add(btnBorrow);
        btnBorrow.setBounds(45, 10,90,20);
        btnBorrow.setBackground(box1);
        btnBorrow.setForeground(font);

        add(btnRead);
        btnRead.setBounds(155,10,90,20);
        btnRead.setBackground(box1);
        btnRead.setForeground(font);

        add(btnAbout);
        btnAbout.setBounds(265,10,90,20);
        btnAbout.setBackground(box1);
        btnAbout.setForeground(font);

        add(lNama);
        lNama.setBounds(70,80,90, 20);
        lNama.setForeground(label);
        add(lNamaDetail);
        lNamaDetail.setBounds(110,80,250, 20);
        lNamaDetail.setForeground(label);

        add(lNIM);
        lNIM.setBounds(70,105,90, 20);
        lNIM.setForeground(label);
        add(lNIMDetail);
        lNIMDetail.setBounds(110,105,250, 20);
        lNIMDetail.setForeground(label);

        add(lKelas);
        lKelas.setBounds(70,130,90, 20);
        lKelas.setForeground(label);
        add(lKelasDetail);
        lKelasDetail.setBounds(110,130,250, 20);
        lKelasDetail.setForeground(label);
    }
}
