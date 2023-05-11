package Lab10;

import javax.swing.*;

public class RegisterWindow extends JFrame {
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
        JTextField usnField = new JTextField(10);
        JLabel password = new JLabel("密码");
        JPasswordField passwordField = new JPasswordField(10);
        JButton login = new JButton("注册");
        add(username);
        add(usnField);
        add(password);
        add(passwordField);
        add(login);
        login.addActionListener(e -> {
            String usn = usnField.getText();
            String pwd = new String(passwordField.getPassword());
            if (usn != null && pwd != null) {
                JOptionPane.showMessageDialog(null, "注册成功");
            } else {
                JOptionPane.showMessageDialog(null, "注册失败");
            }
        });
    }
}
