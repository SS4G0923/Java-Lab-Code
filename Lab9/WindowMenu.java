package Lab9;

import javax.swing.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class WindowMenu extends JFrame {

    JMenuBar menuBar;
    JMenu menu, subMenu;
    JMenuItem item1, item2;

    public WindowMenu(){}
    public WindowMenu(String name, int x, int y, int width, int height) {
        init(name);
        setLocation(x , y);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(width, height);
        setVisible(true);
    }

    void init(String name){
        setTitle(name);
        menuBar = new JMenuBar();
        menu = new JMenu("菜单");
        subMenu = new JMenu("子菜单");
        item1 = new JMenuItem("菜单项1");
        item2 = new JMenuItem("菜单项2");
        item1.setAccelerator(KeyStroke.getKeyStroke('A'));
        item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        menu.add(item1);
        menu.addSeparator();
        menu.add(item2);
        menu.add(subMenu);
        subMenu.add(new JMenuItem("子菜单项1"));
        menuBar.add(menu);
        setJMenuBar(menuBar);
    }
}
