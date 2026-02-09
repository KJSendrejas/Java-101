import java.awt.*;
import javax.swing.*;

public class GUI_StudentEnrollment_Grid extends JFrame{

    public static void main(String []args){
        new GUI_StudentEnrollment_Grid();
    }

    GUI_StudentEnrollment_Grid(){

        JPanel pnlInformation = new JPanel();
        pnlInformation.setLayout(new GridLayout(3,2,10,10));
        //pnlInformation.setBackground(Color.GREEN);
        add(pnlInformation).setBounds(10,10,300,100);

        JLabel lblName = new JLabel("Name");
        JTextArea txtName = new JTextArea();

        JLabel lblAge = new JLabel("Age");
        JTextArea txtAge = new JTextArea();

        JLabel lblAddress = new JLabel("Addresss");
        JTextArea txtAddress = new JTextArea();

        pnlInformation.add(lblName);
        pnlInformation.add(txtName);
        pnlInformation.add(lblAge);
        pnlInformation.add(txtAge);
        pnlInformation.add(lblAddress);
        pnlInformation.add(txtAddress);

        JPanel pnlButtons = new JPanel();
        pnlButtons.setLayout(new FlowLayout(FlowLayout.CENTER));
       // pnlButtons.setBackground(Color.BLUE);
        add(pnlButtons).setBounds(10,150,300,30);

        JButton btnAdd = new JButton("Add");
        JButton btnDel = new JButton("Delete");
        JButton btnUpd = new JButton("Update");

        pnlButtons.add(btnAdd);
        pnlButtons.add(btnDel);
        pnlButtons.add(btnUpd);


        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700,500);
        setVisible(true);
    }
    
}
