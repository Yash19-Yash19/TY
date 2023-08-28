import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class demon4 extends Frame implements MouseListener {
    demon4() {

        // Frame f = new Frame();
        // f.setSize(1000, 1000);
        // f.setVisible(true);
        // f.setLayout(null);
        // Button b = new Button("Color");
        // b.setBounds(100, 100, 100, 40);
        // f.add(b);

        setSize(500, 500);
        setVisible(true);

        addMouseListener(this);

    }

    public void mouseClicked(MouseEvent ae) {
        this.setBackground(Color.RED);

    }

    public void mousePressed(MouseEvent e) {
        this.setBackground(Color.BLACK);
    }

    public void mouseReleased(MouseEvent e) {
        this.setBackground(Color.PINK);
    }

    public void mouseEntered(MouseEvent e) {
        this.setBackground(Color.BLUE);
    }

    public void mouseExited(MouseEvent e) {
        this.setBackground(Color.GREEN);
    }

    public static void main(String[] args) {
        demon4 m = new demon4();
    }
}
