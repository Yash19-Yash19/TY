import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class demon1 extends JFrame implements ActionListener {

    demon1() {
        JButton b = new JButton("Click");
        b.setBounds(100, 100, 100, 40);
        b.addActionListener(this);
        add(b);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Hello");
    }

}