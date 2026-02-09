import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(520, 320);

        frame.setLayout(new BorderLayout(10, 10));

        frame.add(new JButton("NORTH"), BorderLayout.NORTH);
        frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        frame.add(new JButton("WEST"), BorderLayout.WEST);
        frame.add(new JButton("EAST"), BorderLayout.EAST);

        JTextArea centerArea = new JTextArea("CENTER expands to fill remaining space.");
        frame.add(new JScrollPane(centerArea), BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}