package Controller;

import MVC.AboutUsMVC;
import MVC.LoginMVC;
import MVC.ReadMVC;
import MVC.BorrowMVC;
import View.HomeView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeController {

    public HomeController(String[] data, HomeView view) {
        view.setJudul("Hello, " + data[1]);

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

        view.btnAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setVisible(false);
                new AboutUsMVC(data);
            }
        });

        view.btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setVisible(false);
                new LoginMVC();
            }
        });
    }
}
