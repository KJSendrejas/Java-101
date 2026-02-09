import javax.swing.*;

public class NoLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("No Layout (Absolute Positioning)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 250);

        // Disable layout manager
        frame.setLayout(null);

        JLabel label = new JLabel("Username:");
        JTextField tf = new JTextField();
        JButton btn = new JButton("Login");

        // Manually set x, y, width, height
        label.setBounds(30, 30, 100, 25);
        tf.setBounds(120, 30, 200, 25);
        btn.setBounds(120, 70, 100, 30);

        frame.add(label);
        frame.add(tf);
        frame.add(btn);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}