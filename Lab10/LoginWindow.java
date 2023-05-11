package Lab10;

import javax.swing.*;

public class LoginWindow extends JFrame {
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem item1, item2;
    public LoginWindow(String name, int x, int y, int width, int height) {
        setLayout(new java.awt.FlowLayout());
        init(name);
        setLocation(x , y);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(width, height);
        setVisible(true);
    }

    void init(String name){
        setTitle(name);
        JLabel username = new JLabel("用户名");
        JTextField usnField = new JTextField(10);
        JLabel password = new JLabel("密码");
        JPasswordField passwordField = new JPasswordField(10);
        JButton login = new JButton("登陆");
        add(username);
        add(usnField);
        add(password);
        add(passwordField);
        add(login);
        login.addActionListener(e -> {
            String usn = usnField.getText();
            String pwd = new String(passwordField.getPassword());
            if (usn.equals("admin") && pwd.equals("123456")) {
                JOptionPane.showMessageDialog(null, "登陆成功");
            } else {
                JOptionPane.showMessageDialog(null, "登陆失败");
            }
        });


        menuBar = new JMenuBar();
        menu = new JMenu("菜单");
        item1 = new JMenuItem("注册账户");
        item2 = new JMenuItem("帮助");
        menu.add(item1);
        menu.addSeparator();
        menu.add(item2);
        menuBar.add(menu);
        setJMenuBar(menuBar);
        item1.addActionListener(e -> {
            RegisterWindow registerWindow = new RegisterWindow("注册账户", 600, 300, 300, 100);
        });
    }
}
