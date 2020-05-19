package Controller;

import MVC.*;
import Model.ProccessModel;
import View.ReadView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ReadController {

    public ReadController(String[] data, ReadView view, ProccessModel model) {
        final String dataPeminjam[][];

        view.btnRead.setEnabled(false);
        dataPeminjam = model.readPeminjam();
        if (model.getBanyakDataPeminjaman() != 0){
            view.tabel.setModel(new JTable(dataPeminjam, view.namaKolom).getModel());
        } else{
            JOptionPane.showMessageDialog(null,"Data Tidak Ada");
        }

        view.btnBorrow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setVisible(false);
                new BorrowMVC(data);
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

        view.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            view.btnEdit.setEnabled(true);
            view.btnDelete.setEnabled(true);
            int baris = view.tabel.getSelectedRow();

            view.btnEdit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String dataTerpilih[] = new String[8];
                    for (int i = 0; i < 8; i++) {
                        dataTerpilih[i] = dataPeminjam[baris][i];
                    }
                    view.setVisible(false);
                    new EditMVC(data,dataTerpilih);
                }
            });

            view.btnDelete.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int input = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menghapus data ini ?","Delete Data",JOptionPane.YES_NO_OPTION);
                    if (input == 0){
                        model.deletePeminjam(dataPeminjam[baris][7]);
                        view.setVisible(false);
                        new ReadMVC(data);
                    }
                }
            });
            }
        });
    }
}