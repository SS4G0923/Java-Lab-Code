package Lab10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Lab10.RegisterWindow.accounts;

public class LoginChecker implements ActionListener {
    LoginWindow view;
    void setView(LoginWindow view){
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String usn = LoginWindow.usnField.getText();
        String pwd = new String(LoginWindow.passwordField.getPassword());

        if (accounts.get(usn).equals(pwd)){
            JOptionPane.showMessageDialog(null, "登陆成功");
            new LibrarySystem();
            view.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "登陆失败");
        }
    }
}
