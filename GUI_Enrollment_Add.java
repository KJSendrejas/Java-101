import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.table.*;


public class GUI_Enrollment_Add extends JFrame {

	static DefaultTableModel model;
	static JTable table;
	static JScrollPane scrollPane;

    public static void main(String[] args) {
        new GUI_Enrollment_Add();
    }
    
    GUI_Enrollment_Add(){

        JButton btnNewButton = new JButton("Enroll Student");
		btnNewButton.setBounds(86, 402, 114, 39);
		add(btnNewButton);
		
		JLabel lblCategory = new JLabel("Address");
		lblCategory.setBounds(48, 116, 175, 19);
		add(lblCategory);
		
		JTextField txtName = new JTextField();
		txtName.setBounds(48, 78, 188, 27);
		add(txtName);
		txtName.setColumns(10);
   
		JTextField txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(48, 146, 188, 27);
	    add(txtAddress);
		
		JTextField txtCourse = new JTextField();
		txtCourse.setColumns(10);
		txtCourse.setBounds(48, 211, 188, 27);
		add(txtCourse);
		
		JLabel lblCategory_1_1 = new JLabel("Student Name");
		lblCategory_1_1.setBounds(47, 53, 175, 19);
		add(lblCategory_1_1);
		
		JLabel lblTotalBill = new JLabel("Course");
		lblTotalBill.setBounds(48, 181, 175, 19);
		add(lblTotalBill);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(48, 249, 175, 19);
		add(lblAge);
		
		JTextField txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(48, 279, 188, 27);
		add(txtAge);
		
		JLabel lblTotalBill_1 = new JLabel("Last School Attended");
		lblTotalBill_1.setBounds(48, 324, 175, 19);
		add(lblTotalBill_1);
		
		JTextField textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(48, 354, 188, 27);
		add(textField_4);

		String[] columns = {"Name", "Address", "Course", "Age", "Last School"};
		model = new DefaultTableModel(columns, 0);
		table = new JTable(model);
		scrollPane = new JScrollPane(table);
		add(scrollPane).setBounds(250,50,400,300);

		refreshTable();


        btnNewButton.addActionListener(e-> {
        
            String name = txtName.getText();
            String address = txtAddress.getText();
            String course = txtCourse.getText();
            String age = txtAge.getText();
            String school = textField_4.getText();
            try {
                savetoFile(name, address, course, age, school);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

			refreshTable();
        });


        setSize(700,500);
		setTitle("Enrollment");
		setLayout(null);
		setUndecorated(false);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
    }


    public static void savetoFile(String name, String address, String course, String age, String school) throws Exception {
        FileWriter fw = new FileWriter("EnrolledStudent.txt", true);
        fw.write(name + "#" + address + "#" + course + "#" + age + "#" + school + "\n");
        fw.close();
    }

	public static void refreshTable(){
		model.setRowCount(0);
		try(BufferedReader br = new BufferedReader(new FileReader("EnrolledStudent.txt"))){
			String line;
			while((line = br.readLine()) != null){
				String[] row = line.split("#");
				model.addRow(row);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
