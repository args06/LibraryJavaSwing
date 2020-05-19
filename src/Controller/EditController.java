package Controller;

import MVC.ReadMVC;
import Model.ProccessModel;
import View.EditView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditController {
    public EditController(String[] data, String[] dataTerpilih, EditView view, ProccessModel model) {
        view.setTfIDAnggota(dataTerpilih[2]);
        view.setTfNama(dataTerpilih[3]);
        view.setTfIDBuku(dataTerpilih[4]);
        view.setTfJudulBuku(dataTerpilih[5]);

        view.btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setVisible(false);
                new ReadMVC(data);
            }
        });

        view.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = view.getTfNama();
                String IDBuku = view.getTfIDBuku();

                model.updatePeminjam(nama,IDBuku,dataTerpilih[7]);
                view.setVisible(false);
                new ReadMVC(data);
            }
        });
    }
}
