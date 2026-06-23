import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame{

Login(){

    JLabel lblWelcome = new JLabel("Welcome to Login Page");
    add(lblWelcome).setBounds(30,50,200,30);

    JLabel lblUsername = new JLabel("Username");
    add(lblUsername).setBounds(30,100,100,30);

    JTextField txtUsername = new JTextField();
    add(txtUsername).setBounds(30,115,150,30);

    JLabel lblPassword = new JLabel("Password");
    add(lblPassword).setBounds(30,150,100,30);

    JPasswordField txtJPasswordField = new JPasswordField();
    add(txtJPasswordField).setBounds(30,165,150,30);

    JButton btnLogin = new JButton("Login");
    add(btnLogin).setBounds(30,200,70,30);

    JLabel lblRegister = new JLabel("Don't have an account? Register here");
    add(lblRegister).setBounds(30,250,250,30);

    btnLogin.addActionListener(e->{
        if(txtUsername.getText().equals("User")&& txtJPasswordField.getText().equals("1234")) {
            new Demo();
            dispose();
        }
        else {
            JOptionPane.showMessageDialog(this, "Invalid username or password");
        }
    });

    lblRegister.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            //new Register();
            dispose();
        }
    });

    setLayout(null);
    setSize(500,500);
    setVisible(true);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

}

    public static void main(String[] args) {
        new Login();
    }
}
