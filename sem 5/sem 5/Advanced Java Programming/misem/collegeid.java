import java.awt.*;
import javax.swing.*;

class collegeid extends JFrame {
    collegeid() {
        Container ct = getContentPane();
        ImageIcon i = new ImageIcon("logo.png");
        JLabel l = new JLabel(i);
        l.setBounds(170, 40, 150, 190);
        ct.add(l);
        JLabel l1 = new JLabel("Sharad Institute of Technology");
        l1.setBounds(160, 170, 180, 50);
        Color c1 = new Color(255, 0, 0);
        l1.setForeground(c1);
        ct.add(l1);
        JLabel l2 = new JLabel("college of Engineering");
        l2.setBounds(180, 190, 180, 50);
        Color c2 = new Color(0, 0, 255);
        l2.setForeground(c2);
        ct.add(l2);
        JLabel l3 = new JLabel("An Autonomous Institute");
        l3.setBounds(170, 210, 180, 50);
        Color co = new Color(255, 0, 0);
        l3.setForeground(co);
        ct.add(l3);
        ImageIcon i1 = new ImageIcon("app_logo.png");
        JLabel l4 = new JLabel(i1);
        l4.setBounds(200, 230, 90, 90);
        ct.add(l4);
        JLabel l5 = new JLabel("Amarapurkar Yash Liladhar");
        l5.setBounds(180, 300, 180, 50);
        ct.add(l5);
        JLabel l6 = new JLabel("Branch:");
        l6.setBounds(160, 320, 100, 50);
        ct.add(l6);
        String tread[] = { "Computer Science and engg", "Electrical Engg", "Civil Engg", "Mechanical       Engg" };
        JComboBox jc1 = new JComboBox(tread);
        jc1.setBounds(230, 340, 160, 20);
        ct.add(jc1);
        JLabel l7 = new JLabel("DOB:");
        l7.setBounds(160, 360, 100, 50);
        ct.add(l7);
        JTextField t2 = new JTextField("DOB");
        t2.setBounds(230, 375, 160, 20);
        ct.add(t2);
        JLabel l8 = new JLabel("Address:");
        l8.setBounds(160, 390, 100, 50);
        ct.add(l8);

        JTextArea t3 = new JTextArea("Address");
        t3.setBounds(230, 405, 160, 20);
        ct.add(t3);
        JLabel l9 = new JLabel("ph./cell:");
        l9.setBounds(160, 420, 100, 50);
        ct.add(l9);
        JTextField t4 = new JTextField("Number should be 10 digit");
        t4.setBounds(230, 435, 160, 20);
        ct.add(t4);
    }

    public static void main(String arg[]) {
        collegeid c = new collegeid();
        c.setLayout(null);
        c.setSize(500, 600);
        c.setVisible(true);
    }
}
