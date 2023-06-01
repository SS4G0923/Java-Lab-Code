package Lab10;

import javax.swing.*;
import java.util.HashMap;

public class RegisterWindow extends JFrame {

    public static HashMap<String, String> accounts = new HashMap<>();
    static JTextField usnField;
    static JPasswordField passwordField;
    static JButton login;
    public RegisterWindow(String name, int x, int y, int width, int height) {
        setLayout(new java.awt.FlowLayout());
        init(name);
        setLocation(x , y);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(width, height);
        setVisible(true);
    }

    void init(String name){
        setTitle(name);
        JLabel username = new JLabel("用户名");
        usnField = new JTextField(10);
        JLabel password = new JLabel("密码");
        passwordField = new JPasswordField(10);
        login = new JButton("注册");
        add(username);
        add(usnField);
        add(password);
        add(passwordField);
        add(login);
        AllChecker ac = new AllChecker();
        login.addActionListener(ac);
    }
}
