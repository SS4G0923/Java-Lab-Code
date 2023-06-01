package Lab10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Lab10.RegisterWindow.accounts;

public class AllChecker implements ActionListener {

    JButton login = LoginWindow.login;
    JButton register = RegisterWindow.login;

    String regex = "^[a-zA-Z0-9]+$";

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == login){

            String usn = LoginWindow.usnField.getText();
            String pwd = new String(LoginWindow.passwordField.getPassword());

            if (accounts.get(usn).equals(pwd)){
                JOptionPane.showMessageDialog(null, "登陆成功");
                new LibrarySystem();
            } else {
                JOptionPane.showMessageDialog(null, "登陆失败");
            }

        }else if(e.getSource() == register){

            String usn = RegisterWindow.usnField.getText();
            String pwd = new String(RegisterWindow.passwordField.getPassword());

            if ((!usn.trim().equals("")) && (!pwd.trim().equals(""))) {

                if (accounts.containsKey(usn))
                    JOptionPane.showMessageDialog(null, "该用户已存在");
                else if(usn.matches(regex) && pwd.matches(regex)){
                    JOptionPane.showMessageDialog(null, "注册成功");
                    accounts.put(usn, pwd);
                }else {
                    JOptionPane.showMessageDialog(null, "用户名或密码只能由字母和数字组成");
                }
            }else{
                JOptionPane.showMessageDialog(null, "用户名和密码不能为空");
            }
        }
    }
}
