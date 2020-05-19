package Controller;

import MVC.HomeMVC;
import MVC.SignUpMVC;
import Model.UserModel;
import View.LoginView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {

    public LoginController(LoginView view, UserModel model) {
        view.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.getUser().equals("") && view.getPass().equals("")){
                    JOptionPane.showMessageDialog(null,"Username dan Password Tidak Boleh Kosong");
                } else if (view.getUser().equals("")){
                    JOptionPane.showMessageDialog(null,"Username Tidak Boleh Kosong");
                }else if (view.getPass().equals("")){
                    JOptionPane.showMessageDialog(null,"Password Tidak Boleh Kosong");
                }else{
                    try{
                        String sUsername = view.getUser();
                        String sPassword = view.getPass();
                        String data[] = model.login(sUsername,sPassword);
                        if ((sUsername.equals(data[1]) || sUsername.equals(data[2])) && sPassword.equals(data[3])){
                            System.out.println("Login Success");
                            JOptionPane.showMessageDialog(null, "Login Success!");
                            view.setVisible(false);
                            new HomeMVC(data);
                        } else{
                            System.out.println("Login Gagal");
                            JOptionPane.showMessageDialog(null, "Username/Password Salah");
                        }
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }
            }
        });

        view.btnSignup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setVisible(false);
                new SignUpMVC();
            }
        });
    }
}
