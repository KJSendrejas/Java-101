import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Demo (2x3)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 250);

        frame.setLayout(new GridLayout(2, 3, 10, 10)); // rows, cols, hgap, vgap

        for (int i = 1; i <= 6; i++) {
            frame.add(new JButton("Btn " + i));
        }


        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}