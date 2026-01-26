import javax.swing.*;

public class GUI_Components extends JFrame {
    
    public static void main(String[] args) {
       new GUI_Components();
    }

    GUI_Components(){
        	JLabel lblHeader = new JLabel("Full Name");
		add(lblHeader).setBounds(25,50,100,30);
		
		JTextField txtName = new JTextField("Enter your name");
		add(txtName).setBounds(25,85,100,30);
		
		JPasswordField txtPass = new JPasswordField();
		add(txtPass).setBounds(25,120,100,30);
		
		JButton btnAdd = new JButton("Submit");
		add(btnAdd).setBounds(25,155,100,50);
		
//		btnAdd.setEnabled(false);
//		txtName.setEditable(false);
//		txtName.setText("ENTER");
//		btnAdd.setBackground(Color.CYAN);
//		lblHeader.setForeground(Color.green);
		
		setSize(530,300);
		setTitle("Sample");
		setLayout(null);
		setUndecorated(false);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

    }


}

