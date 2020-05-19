package Controller;

import MVC.LoginMVC;
import Model.UserModel;
import View.SignUpView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpController {
    public SignUpController(SignUpView view, UserModel model) {
        view.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setVisible(false);
                new LoginMVC();
            }
        });

        view.btnSignUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sEmail = view.getTfEmail();
                String sUser = view.getTfUsername();
                String sPass = view.getPfPassword();

                model.insertUser(sEmail,sUser,sPass);
                view.setVisible(false);
                new LoginMVC();
            }
        });
    }
}
