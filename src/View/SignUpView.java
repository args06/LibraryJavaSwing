package View;

import javax.swing.*;
import java.awt.*;

public class SignUpView extends JFrame {
    JLabel title;
    Graphics graphics;

    JPanel panel = new JPanel();

    JLabel lEmail = new JLabel("E-mail");
    JTextField tfEmail = new JTextField();
    JLabel lUsername = new JLabel("Username");
    JTextField tfUsername = new JTextField();
    JLabel lPassword = new JLabel("Password");
    JPasswordField pfPassword = new JPasswordField();

    public JButton btnSignUp = new JButton("Sign Up");
    public JButton back = new JButton();

    Color backgroundPage = new Color(23, 34, 59);
    Color box = new Color(107, 119, 141);
    Color label = new Color(207, 117, 0);
    Color font = new Color(255,255,255);
    Color btn = new Color(73, 156, 84);

    public SignUpView() {
        getContentPane().setBackground(backgroundPage);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Money Record");
        setVisible(true);
        setLayout(null);
        setSize(400, 250);

        title = new JLabel("Sign Up Page");
        graphics = title.getGraphics();
        add(title);
        title.setBounds(125, 25, 150, 20);
        title.setFont(new Font("Gilroy Light",Font.BOLD,16));
        title.setForeground(font);

        back.setIcon(new ImageIcon("src\\Image\\back1.png"));
        add(back);
        back.setBounds(4,4,30,30);
        back.setBackground(font);

        add(lEmail);
        lEmail.setBounds(70,75,90, 20);
        lEmail.setForeground(label);
        add(tfEmail);
        tfEmail.setBounds(160,75,120,20);
        tfEmail.setBackground(box);
        tfEmail.setForeground(font);

        add(lUsername);
        lUsername.setBounds(70,100,90, 20);
        lUsername.setForeground(label);
        add(tfUsername);
        tfUsername.setBounds(160,100,120,20);
        tfUsername.setBackground(box);
        tfUsername.setForeground(font);

        add(lPassword);
        lPassword.setBounds(70,125,90,20);
        lPassword.setForeground(label);
        add(pfPassword);
        pfPassword.setBounds(160, 125, 120, 20);
        pfPassword.setBackground(box);
        pfPassword.setForeground(font);

        add(btnSignUp);
        btnSignUp.setBounds(145, 170,90,20);
        btnSignUp.setBackground(btn);
        btnSignUp.setForeground(font);

    }

    public String getTfEmail() {
        return tfEmail.getText();
    }

    public String getTfUsername() {
        return tfUsername.getText();
    }

    public String getPfPassword() {
        return pfPassword.getText();
    }
}
