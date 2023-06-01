package Lab10;

import javax.swing.*;

public class LibrarySystem extends JFrame {

        public LibrarySystem(){
            init();
            setLayout(new java.awt.FlowLayout());
            setTitle("图书管理系统");
            setLocation(600 , 300);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(600, 600);
            setVisible(true);
        }

        void init(){
            JLabel welcome = new JLabel("欢迎使用图书管理系统");
            JMenuBar bar = new JMenuBar();
            JMenu menu = new JMenu("菜单");
            JMenuItem exit = new JMenuItem("退出登录");
            menu.add(exit);
            bar.add(menu);
            setJMenuBar(bar);
            add(welcome);
            exit.addActionListener(e -> {
                new LoginWindow("登陆窗口", 600, 300, 300, 140);
                dispose();
            });
        }
}
