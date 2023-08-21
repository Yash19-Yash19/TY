import javax.swing.*;

class demotool extends JFrame {

    demotool() {

        JFrame jf = new JFrame();
        jf.setSize(1000, 1000);
        jf.setVisible(true);
        jf.setTitle("tooltip");
        JPasswordField jp = new JPasswordField();
        jp.setBounds(10, 20, 10, 40);
        jp.setToolTipText("password");
        jf.add(jp);

    }

    public static void main(String[] args) {
        new demotool();
    }

}