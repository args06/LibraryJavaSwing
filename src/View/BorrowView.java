package View;

import javax.swing.*;
import java.awt.*;

public class BorrowView extends JFrame {
    JLabel text = new JLabel("Perpustakaan");

    public JButton btnBorrow = new JButton("Pinjam");
    public JButton btnRead = new JButton("Tampil");
    public JButton btnAbout = new JButton("About Us");
    public JButton btnReset = new JButton("Reset");
    public JButton btnAdd = new JButton("Add");
    public JButton back = new JButton();

    JLabel lIDAnggota = new JLabel("ID Anggota");
    JTextField tfIDAnggota = new JTextField();
    JLabel lNama = new JLabel("Nama");
    JTextField tfNama = new JTextField();
    JLabel lIDBuku = new JLabel("ID Buku");
    JTextField tfIDBuku = new JTextField();
    JLabel lJudulBuku = new JLabel("Judul Buku");
    JTextField tfJudulBuku = new JTextField();

    Color bgdashboard = new Color(23, 34, 59);
    Color box = new Color(107, 119, 141);
    Color box1 = new Color(62, 134, 160);
    Color label = new Color(207, 117, 0);
    Color font = new Color(255,255,255);
    Color ftitle = new Color(255, 198, 109);
    Color button1 = new Color(128, 19, 54);
    Color button2 = new Color(73, 156, 84);

    public BorrowView() {
        getContentPane().setBackground(bgdashboard);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(400, 300);
        setTitle("Perpustakaan");

        add(text);
        text.setBounds(145, 60, 110, 20);
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

        add(lIDAnggota);
        lIDAnggota.setBounds(70,100,90, 20);
        lIDAnggota.setForeground(label);
        add(tfIDAnggota);
        tfIDAnggota.setBounds(160,100,120,20);
        tfIDAnggota.setBackground(box);
        tfIDAnggota.setForeground(font);

        add(lNama);
        lNama.setBounds(70,125,90, 20);
        lNama.setForeground(label);
        add(tfNama);
        tfNama.setBounds(160,125,120,20);
        tfNama.setBackground(box);
        tfNama.setForeground(font);

        add(lIDBuku);
        lIDBuku.setBounds(70,150,90, 20);
        lIDBuku.setForeground(label);
        add(tfIDBuku);
        tfIDBuku.setBounds(160,150,120,20);
        tfIDBuku.setBackground(box);
        tfIDBuku.setForeground(font);

        add(lJudulBuku);
        lJudulBuku.setBounds(70,175,90, 20);
        lJudulBuku.setForeground(label);
        add(tfJudulBuku);
        tfJudulBuku.setBounds(160,175,120,20);
        tfJudulBuku.setBackground(box);
        tfJudulBuku.setForeground(font);

        add(btnReset);
        btnReset.setBounds(100,210,90,20);
        btnReset.setBackground(button1);
        btnReset.setForeground(font);

        add(btnAdd);
        btnAdd.setBounds(210,210,90,20);
        btnAdd.setBackground(button2);
        btnAdd.setForeground(font);
    }

    public String getTfIDAnggota() {
        return tfIDAnggota.getText();
    }

    public void setTfIDAnggota(String tfIDAnggota) {
        this.tfIDAnggota.setText(tfIDAnggota);
    }

    public String getTfNama() {
        return tfNama.getText();
    }

    public void setTfNama(String tfNama) {
        this.tfNama.setText(tfNama);
    }

    public String getTfIDBuku() {
        return tfIDBuku.getText();
    }

    public void setTfIDBuku(String tfIDBuku) {
        this.tfIDBuku.setText(tfIDBuku);
    }

    public String getTfJudulBuku() {
        return tfJudulBuku.getText();
    }

    public void setTfJudulBuku(String tfJudulBuku) {
        this.tfJudulBuku.setText(tfJudulBuku);
    }
}
