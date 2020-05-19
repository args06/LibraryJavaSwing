package View;

import javax.swing.*;
import java.awt.*;


public class LoginView extends JFrame {
    JLabel title;

    JLabel lUsername = new JLabel("Username / E-mail");
    JTextField tfUsername = new JTextField();
    JLabel lPassword = new JLabel("Password");
    JPasswordField pfPassword = new JPasswordField();

    public JButton btnLogin = new JButton("Log In");
    public JButton btnSignup = new JButton("Sign Up");

    Color backgroundPage = new Color(23, 34, 59);
    Color box = new Color(107, 119, 141);
    Color label = new Color(207, 117, 0);
    Color font = new Color(255,255,255);
    Color btn = new Color(33, 230, 193);
    Color btn2 = new Color(73, 156, 84);

    public LoginView() {
        getContentPane().setBackground(backgroundPage);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Perpustakaan");
        setVisible(true);
        setLayout(null);
        setSize(400, 200);

        title = new JLabel("Please Login First!");
        add(title);
        title.setBounds(125, 10, 150, 20);
        title.setFont(new Font("Gilroy Light",Font.BOLD,16));
        title.setForeground(font);

        add(lUsername);
        lUsername.setBounds(50,50,120, 20);
        lUsername.setForeground(label);
        add(tfUsername);
        tfUsername.setBounds(160,50,120,20);
        tfUsername.setBackground(box);
        tfUsername.setForeground(font);

        add(lPassword);
        lPassword.setBounds(50,75,120,20);
        lPassword.setForeground(label);
        add(pfPassword);
        pfPassword.setBounds(160, 75, 120, 20);
        pfPassword.setBackground(box);
        pfPassword.setForeground(font);

        add(btnLogin);
        btnLogin.setBounds(100, 115,90,20);
        btnLogin.setBackground(btn);
        btnLogin.setForeground(font);

        add(btnSignup);
        btnSignup.setBounds(210, 115,90,20);
        btnSignup.setBackground(btn2);
        btnSignup.setForeground(font);

    }

    public String getUser() {
        return tfUsername.getText();
    }

    public String getPass() {
        return pfPassword.getText();
    }
}
