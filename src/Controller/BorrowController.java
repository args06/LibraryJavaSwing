package Controller;

import MVC.AboutUsMVC;
import MVC.HomeMVC;
import MVC.ReadMVC;
import Model.ProccessModel;
import View.BorrowView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorrowController {
    BorrowView view;

    public BorrowController(String[] data, BorrowView view, ProccessModel model) {
        this.view = view;

        view.btnBorrow.setEnabled(false);

        view.btnRead.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setVisible(false);
                new ReadMVC(data);
            }
        });

        view.btnAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setVisible(false);
                new AboutUsMVC(data);
            }
        });

        view.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setVisible(false);
                new HomeMVC(data);
            }
        });

        view.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });

        view.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.getTfIDAnggota().equals("")){
                    JOptionPane.showMessageDialog(null,"ID Anggota Tidak Boleh Kosong");
                } else if (view.getTfNama().equals("")){
                    JOptionPane.showMessageDialog(null,"Nama Tidak Boleh Kosong");
                } else if (view.getTfIDBuku().equals("")){
                    JOptionPane.showMessageDialog(null,"ID Buku Tidak Boleh Kosong");
                } else if (view.getTfJudulBuku().equals("")){
                    JOptionPane.showMessageDialog(null,"Judul Buku Tidak Boleh Kosong");
                } else {
                    String IDAnggota = view.getTfIDAnggota();
                    String nama = view.getTfNama();
                    String IDBuku = view.getTfIDBuku();
                    String judulBuku = view.getTfJudulBuku();

                    model.insertPeminjam(nama,IDAnggota,IDBuku,judulBuku,data[0]);
                    reset();
                }
            }
        });
    }

    private void reset(){
        view.setTfIDAnggota("");
        view.setTfNama("");
        view.setTfIDBuku("");
        view.setTfJudulBuku("");
    }
}