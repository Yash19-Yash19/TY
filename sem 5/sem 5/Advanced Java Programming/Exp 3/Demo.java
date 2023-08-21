import java.awt.*;
import javax.swing.*;

class demotree extends JFrame {

    demotree() {
        Container c = getContentPane();

        ImageIcon imgic = new ImageIcon("C:\\app_logo.png");
        JLabel l = new JLabel(imgic);
        l.setBounds(10, 20, 200, 200);
        c.add(l);

        JLabel l1 = new JLabel("Name: Yash L. Amarapurkar");
        l1.setBounds(10, 170, 200, 40);
        c.add(l1);

        JLabel l2 = new JLabel("Branch: Computer Science");
        l2.setBounds(10, 190, 200, 40);
        c.add(l2);

        JLabel l3 = new JLabel("Class: TY A");
        l3.setBounds(10, 210, 200, 40);
        c.add(l3);

        JLabel l4 = new JLabel("Roll No: 41");
        l4.setBounds(10, 230, 200, 40);
        c.add(l4);

    }

    public static void main(String[] args) {
        demotree d3 = new demotree();
        d3.setSize(500, 500);
        d3.setLayout(null);
        d3.setVisible(true);
        d3.setTitle("Img");
        d3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}