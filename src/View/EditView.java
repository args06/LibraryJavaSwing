package View;

import javax.swing.*;
import java.awt.*;


public class EditView extends JFrame {
    JLabel title;

    JLabel lIDAnggota = new JLabel("ID Anggota");
    JTextField tfIDAnggota = new JTextField();
    JLabel lNama = new JLabel("Nama");
    JTextField tfNama = new JTextField();
    JLabel lIDBuku = new JLabel("ID Buku");
    JTextField tfIDBuku = new JTextField();
    JLabel lJudulBuku = new JLabel("Judul Buku");
    JTextField tfJudulBuku = new JTextField();

    public JButton btnCancel = new JButton("Cancel");
    public JButton btnEdit = new JButton("Edit");

    Color backgroundPage = new Color(23, 34, 59);
    Color box = new Color(107, 119, 141);
    Color label = new Color(207, 117, 0);
    Color font = new Color(255,255,255);
    Color btn = new Color(33, 230, 193);
    Color btn2 = new Color(73, 156, 84);

    public EditView() {
        getContentPane().setBackground(backgroundPage);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Perpustakaan");
        setVisible(true);
        setLayout(null);
        setSize(400, 250);

        title = new JLabel("Edit Page");
        add(title);
        title.setBounds(160, 10, 100, 20);
        title.setFont(new Font("Gilroy Light",Font.BOLD,16));
        title.setForeground(font);

        add(lIDAnggota);
        lIDAnggota.setBounds(70,50,90, 20);
        lIDAnggota.setForeground(label);
        add(tfIDAnggota);
        tfIDAnggota.setBounds(160,50,120,20);
        tfIDAnggota.setBackground(box);
        tfIDAnggota.setForeground(font);
        tfIDAnggota.setEditable(false);

        add(lNama);
        lNama.setBounds(70,75,90, 20);
        lNama.setForeground(label);
        add(tfNama);
        tfNama.setBounds(160,75,120,20);
        tfNama.setBackground(box);
        tfNama.setForeground(font);

        add(lIDBuku);
        lIDBuku.setBounds(70,100,90, 20);
        lIDBuku.setForeground(label);
        add(tfIDBuku);
        tfIDBuku.setBounds(160,100,120,20);
        tfIDBuku.setBackground(box);
        tfIDBuku.setForeground(font);

        add(lJudulBuku);
        lJudulBuku.setBounds(70,125,90, 20);
        lJudulBuku.setForeground(label);
        add(tfJudulBuku);
        tfJudulBuku.setBounds(160,125,120,20);
        tfJudulBuku.setBackground(box);
        tfJudulBuku.setForeground(font);
        tfJudulBuku.setEditable(false);

        add(btnCancel);
        btnCancel.setBounds(100, 170,90,20);
        btnCancel.setBackground(btn);
        btnCancel.setForeground(font);

        add(btnEdit);
        btnEdit.setBounds(210, 170,90,20);
        btnEdit.setBackground(btn2);
        btnEdit.setForeground(font);

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
