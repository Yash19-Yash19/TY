import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class id extends JFrame {
    id() {
        Container c = getContentPane();
        c.setLayout(null);

        ImageIcon ig = new ImageIcon("D:/download.jpg");
        JLabel l = new JLabel(ig);
        l.setBounds(10, 20, 200, 200);
        c.add(l);

        JLabel l1 = new JLabel("null");
        l1.setBounds(10, 170, 200, 40);
        c.add(l1);

        JLabel l2 = new JLabel("Branch:");
        l2.setBounds(10, 200, 200, 40);
        c.add(l2);

        String[] branches = {"CSE", "ECE", "ENTC", "AIDS", "MECH", "AR"};
        JComboBox<String> branchComboBox = new JComboBox<>(branches);
        branchComboBox.setBounds(80, 210, 100, 20);
        c.add(branchComboBox);

        JLabel l3 = new JLabel("DOB:");
        l3.setBounds(10, 230, 200, 40);
        c.add(l3);

        JTextField dobTextField = new JTextField();
        dobTextField.setBounds(80, 240, 100, 20);
        c.add(dobTextField);

        JLabel l4 = new JLabel("Address:");
        l4.setBounds(10, 260, 200, 40);
        c.add(l4);

        JTextArea addressTextArea = new JTextArea();
        addressTextArea.setBounds(80, 270, 300, 100);
        c.add(addressTextArea);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(10, 400, 80, 30);
        c.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = "null";
                String branch = (String) branchComboBox.getSelectedItem();
                String dob = dobTextField.getText();
                String address = addressTextArea.getText();

                String message = "Name: " + name + "\nBranch: " + branch + "\nDOB: " + dob + "\nAddress: " + address;
                JOptionPane.showMessageDialog(null, message, "User Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        id d = new id();
        d.setTitle("hii");
        d.setVisible(true);
        d.setLayout(null);
        d.setSize(600, 500);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}