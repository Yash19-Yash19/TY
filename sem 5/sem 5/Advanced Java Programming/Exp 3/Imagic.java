import java.awt.*;
import javax.swing.*;

public class Imagic extends JFrame {

    Imagic() {
        setTitle("Imagic");
        setSize(500, 500);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        ImageIcon icn = new ImageIcon("C:\\img2.png");
        JLabel l = new JLabel(icn);
        l.setBounds(200, 200, 200, 200);
        c.add(l);

    }

    public static void main(String[] args) {
        new Imagic();
    }

}
