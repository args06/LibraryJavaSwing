package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ReadView extends JFrame {
    JLabel text = new JLabel("Perpustakaan");
    JLabel judul = new JLabel("List Buku yang Dipinjam");

    public JButton btnBorrow = new JButton("Pinjam");
    public JButton btnRead = new JButton("Tampil");
    public JButton btnAbout = new JButton("About Us");
    public JButton back = new JButton();

    public JButton btnEdit = new JButton("Edit");
    public JButton btnDelete = new JButton("Delete");

    Color bgdashboard = new Color(23, 34, 59);
    Color box1 = new Color(62, 134, 160);
    Color font = new Color(255,255,255);
    Color ftitle = new Color(255, 198, 109);
    Color button1 = new Color(128, 19, 54);
    Color button2 = new Color(73, 156, 84);

    public JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    public Object namaKolom[] = {"No","Tanggal","ID","Nama","ID Buku","Judul Buku","Dilayani Oleh"};

    public ReadView() {
        getContentPane().setBackground(bgdashboard);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(700, 500);
        setTitle("Perpustakaan");

        add(text);
        text.setBounds(295, 60, 110, 20);
        text.setFont(new Font("Gilroy Light",Font.PLAIN,16));
        text.setForeground(ftitle);

        back.setIcon(new ImageIcon("src\\Image\\back1.png"));
        add(back);
        back.setBounds(4,4,30,30);
        back.setBackground(font);

        add(btnBorrow);
        btnBorrow.setBounds(195, 10,90,20);
        btnBorrow.setBackground(box1);
        btnBorrow.setForeground(font);

        add(btnRead);
        btnRead.setBounds(305,10,90,20);
        btnRead.setBackground(box1);
        btnRead.setForeground(font);

        add(btnAbout);
        btnAbout.setBounds(415,10,90,20);
        btnAbout.setBackground(box1);
        btnAbout.setForeground(font);

        add(btnDelete);
        btnDelete.setBounds(240,95,90,20);
        btnDelete.setBackground(button1);
        btnDelete.setForeground(font);
        btnDelete.setEnabled(false);

        add(btnEdit);
        btnEdit.setBounds(370,95,90,20);
        btnEdit.setBackground(button2);
        btnEdit.setForeground(font);
        btnEdit.setEnabled(false);

        add(judul);
        judul.setBounds(260, 150, 180, 20);
        judul.setFont(new Font("Gilroy Light",Font.PLAIN,16));
        judul.setForeground(ftitle);

        tableModel = new DefaultTableModel(namaKolom,0);
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);

        add(scrollPane);
        scrollPane.setBounds(30,180,630,250);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }
}