import javax.swing.*;
import java.awt.*;

public class id1 extends JFrame {
    id1() {
        Container c = getContentPane();
        c.setLayout(null);

        ImageIcon ig = new ImageIcon("C:\\img2.png");
        JLabel l = new JLabel(ig);
        l.setBounds(10, 20, 200, 200);
        c.add(l);

        JLabel l1 = new JLabel("");
        l1.setBounds(10, 170, 200, 40);
        c.add(l1);

        JLabel l2 = new JLabel("Branch: ");
        l2.setBounds(10, 220, 100, 40);
        c.add(l2);

        JTextField t1 = new JTextField();
        t1.setBounds(110, 230, 100, 20);
        c.add(t1);

        JButton branchButton = new JButton("Edit");
        branchButton.setBounds(220, 230, 70, 20);
        c.add(branchButton);
        branchButton.addActionListener(e -> {
            String newBranch = JOptionPane.showInputDialog(null, "Enter new branch:");
            if (newBranch != null) {
                t1.setText(newBranch);
            }
        });

        JLabel l3 = new JLabel("DOB: ");
        l3.setBounds(10, 260, 100, 40);
        c.add(l3);

        JTextField dobField = new JTextField();
        dobField.setBounds(110, 270, 100, 20);
        c.add(dobField);

        JLabel l4 = new JLabel("Address: ");
        l4.setBounds(10, 300, 100, 40);
        c.add(l4);

        JTextArea addressArea = new JTextArea();
        addressArea.setBounds(110, 310, 300, 100);
        c.add(addressArea);

    }

    public static void main(String[] args) {
        id1 d = new id1();

        d.setTitle("Sukhankar");
        d.setVisible(true);
        d.setLayout(null);
        d.setSize(600, 600);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
