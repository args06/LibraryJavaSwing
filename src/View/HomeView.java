package View;

import javax.swing.*;
import java.awt.*;

public class HomeView extends JFrame {
    JLabel judul = new JLabel("Hello, ");
    JLabel text = new JLabel("Selamat Datang di Perpustakaan");

    public JButton btnBorrow = new JButton("Pinjam");
    public JButton btnRead = new JButton("Tampil");
    public JButton btnAbout = new JButton("About Us");
    public JButton btnLogout = new JButton("Log Out");

    Color bgdashboard = new Color(23, 34, 59);
    Color box1 = new Color(62, 134, 160);
    Color box2 = new Color(152, 118, 170);
    Color font = new Color(255,255,255);
    Color ftitle = new Color(255, 198, 109);

    public HomeView() {
        getContentPane().setBackground(bgdashboard);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(400, 200);
        setTitle("Perpustakaan");

        add(judul);
        judul.setBounds(155, 10, 90, 20);
        judul.setFont(new Font("Serif",Font.ITALIC,14));
        judul.setForeground(ftitle);

        add(text);
        text.setBounds(75, 50, 250, 20);
        text.setFont(new Font("Gilroy Light",Font.PLAIN,16));
        text.setForeground(ftitle);

        add(btnLogout);
        btnLogout.setBounds(4,4,85,20);
        btnLogout.setBackground(box2);
        btnLogout.setForeground(font);

        add(btnBorrow);
        btnBorrow.setBounds(45, 100,90,20);
        btnBorrow.setBackground(box1);
        btnBorrow.setForeground(font);

        add(btnRead);
        btnRead.setBounds(155,100,90,20);
        btnRead.setBackground(box1);
        btnRead.setForeground(font);

        add(btnAbout);
        btnAbout.setBounds(265,100,90,20);
        btnAbout.setBackground(box1);
        btnAbout.setForeground(font);
    }

    public void setJudul(String title) {
        this.judul.setText(title);
    }
}
