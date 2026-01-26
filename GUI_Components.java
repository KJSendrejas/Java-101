import javax.swing.*;

public class GUI_Components extends JFrame {
    
    public static void main(String[] args) {
       new GUI_Components();
    }

    GUI_Components(){

		JLabel lblRes = new JLabel("0.00");
		add(lblRes).setBounds(25,20,100,30);

        JLabel lbl1Num = new JLabel("First Number:");
		add(lbl1Num).setBounds(25,50,100,30);
		
		JTextField txt1Num = new JTextField();
		add(txt1Num).setBounds(25,80,100,20);

		JLabel lbl2Num = new JLabel("Second Number:");
		add(lbl2Num).setBounds(25,115,100,30);
		
		JTextField txt2Num = new JTextField();
		add(txt2Num).setBounds(25,145,100,20);
		
		// JPasswordField txtPass = new JPasswordField();
		// add(txtPass).setBounds(25,120,100,30);
		
		JButton btnAdd = new JButton("Add");
		add(btnAdd).setBounds(25,175,100,30);

		btnAdd.addActionListener(e-> {
			int num1 = Integer.parseInt(txt1Num.getText());
			int num2 = Integer.parseInt(txt2Num.getText());
			int sum = num1 + num2;
			lblRes.setText((String.valueOf(sum)));
		});

		
		
		
		setSize(530,300);
		setTitle("Basic Calculator");
		setLayout(null);
		setUndecorated(false);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

    }


}

