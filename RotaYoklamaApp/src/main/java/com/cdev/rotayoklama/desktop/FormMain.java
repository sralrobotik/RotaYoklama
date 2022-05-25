package com.cdev.rotayoklama.desktop;

import com.cdev.rotayoklama.common.Account;
import com.cdev.rotayoklama.common.MySQLService;

import javax.swing.*;
import java.awt.*;

public class FormMain {
    public static MySQLService mysql;
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
        try{
            mysql = new MySQLService();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        btnLogin.addActionListener(e -> {
            if (mysql.checkLogin(txtUsername.getText(), txtPassword.getText())){
                var account = mysql.getAccount(txtUsername.getText());
                if (account.type == Account.AccountType.TEACHER){

                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Yanlış kullanıcı adı veya şifre.");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        var size = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(size.width / 2 - 500, size.height / 2 - 100);
        frame.setContentPane(new FormMain().panel1);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1000, 200);
        frame.setVisible(true);

    }
}
