package Controller;

import MVC.HomeMVC;
import MVC.ReadMVC;
import MVC.BorrowMVC;
import View.AboutUsView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutUsController {

    public AboutUsController(String[] data, AboutUsView view) {

        view.btnAbout.setEnabled(false);

        view.btnBorrow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setVisible(false);
                new BorrowMVC(data);
            }
        });

        view.btnRead.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setVisible(false);
                new ReadMVC(data);
            }
        });

        view.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setVisible(false);
                new HomeMVC(data);
            }
        });
    }
}
