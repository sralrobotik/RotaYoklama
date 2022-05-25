package com.cdev.rotayoklama.desktop;

import javax.swing.*;
import java.awt.*;

public class FormMain {
    public JPanel panel1;
    private JButton btnLogin;
    private JTextField txtUsername;
    private JTextField txtPassword;
    private JList list;
    private JButton btnNO;
    private JButton btnOK;
    private JLabel lblName;
    private JLabel lblNumber;

    public  FormMain(){
        btnLogin.addActionListener(e -> {
            System.out.println(e.getActionCommand());
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        var size = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(size.width / 2 - 500, size.height / 2 - 500);
        frame.setContentPane(new FormMain().panel1);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setVisible(true);

    }
}
