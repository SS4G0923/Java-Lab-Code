package Lab10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Lab10.RegisterWindow.accounts;

public class RegisterChecker implements ActionListener {
    RegisterWindow view;
    void setView(RegisterWindow view){
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String usn = RegisterWindow.usnField.getText();
        String pwd = new String(RegisterWindow.passwordField.getPassword());
        if ((!usn.trim().equals("")) && (!pwd.trim().equals(""))) {
            if(accounts.containsKey(usn))
                JOptionPane.showMessageDialog(null, "该用户已存在");
            else {
                JOptionPane.showMessageDialog(null, "注册成功");
                accounts.put(usn, pwd);
                view.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "注册失败");
        }
    }
}

