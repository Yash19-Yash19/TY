import java.awt.*;
import javax.swing.*;

class id extends JFrame {
    id() {
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon("D:\\java_14\\logo.png");
        JLabel l = new JLabel("Logo", img, JLabel.CENTER);
        add(l);
        setVisible(true);
    }

    public static void main(String[] args) {
        id d = new id();
    }
}