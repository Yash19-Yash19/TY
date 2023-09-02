
import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

class panel1 extends JPanel {
    panel1() {
        String data[][] = { { "1", "n1", "1000" }, { "2", "n2", "2000" }, { "3", "n3", "3000" } };
        String label[] = { "id", "name", "salary" };
        JTable jt = new JTable(data, label);
        JScrollPane jp = new JScrollPane(jt);
        add(jp);
    }
}

class panel2 extends JPanel {
    panel2() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("India");
        JTree t = new JTree(root);
        add(t);
        DefaultMutableTreeNode r1 = new DefaultMutableTreeNode("Maharashtra");
        root.add(r1);
        DefaultMutableTreeNode r2 = new DefaultMutableTreeNode("Pune");
        r1.add(r2);
        DefaultMutableTreeNode r3 = new DefaultMutableTreeNode("Mumbai");
        r1.add(r3);
        DefaultMutableTreeNode r4 = new DefaultMutableTreeNode("Nashik");
        r1.add(r4);
        DefaultMutableTreeNode r5 = new DefaultMutableTreeNode("Thane");
        r1.add(r5);
        DefaultMutableTreeNode root2 = new DefaultMutableTreeNode("US");
        root.add(root2);
    }
}

class panel3 extends JPanel {
    panel3() {
        GridLayout gd = new GridLayout(3, 2);
        setLayout(gd);
        JLabel l = new JLabel("UserName");
        add(l);
        JTextField tf = new JTextField();
        add(tf);
        tf.setToolTipText("Enter correct Username!!");
        JLabel l2 = new JLabel("Password");
        add(l2);
        JPasswordField jp = new JPasswordField();
        jp.setToolTipText("Enter correct password!!");
        add(jp);
        JButton b1 = new JButton("Submit");
        add(b1);

    }
}

class panel4 extends JPanel {
    panel4() {
        JLabel l5 = new JLabel("known LangA");
        add(l5);
        String st[] = { "C", "c++", "Java" };
        JComboBox jcb = new JComboBox(st);
        jcb.addItem("Operating system");
        jcb.addItem("Advance Java");
        jcb.addItem("MySQL");
        add(jcb);
        JLabel l4 = new JLabel("Gender");
        add(l4);
        JRadioButton jb1 = new JRadioButton("Male", true);
        add(jb1);
        JRadioButton jb2 = new JRadioButton("female");
        add(jb2);
        ButtonGroup rg = new ButtonGroup();
        rg.add(jb1);
        rg.add(jb2);
        // add(rg);
    }
}

class tab extends JFrame {
    tab() {
        Container ct = getContentPane();
        JTabbedPane jta = new JTabbedPane();
        jta.addTab("JTree", new panel2());
        jta.addTab("JTable", new panel1());
        jta.addTab("ToolTip", new panel3());
        jta.addTab("JComboBox", new panel4());
        ct.add(jta);
    }

    public static void main(String arg[]) {
        tab tb = new tab();
        tb.setSize(600, 600);
        tb.setVisible(true);
        tb.setLayout(new FlowLayout());
    }
}
