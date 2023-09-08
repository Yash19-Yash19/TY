import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class mouse3 extends MouseAdapter {
    Frame f;

    mouse3() {
        f = new Frame();
        f.setSize(400, 400);
        f.setVisible(true);
        f.setLayout(null);
        f.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent me) {
        Graphics g = f.getGraphics();

        g.setColor(Color.RED);

        g.fillOval(me.getX(), me.getY(), 50, 50);

        Graphics g1 = f.getGraphics();

        g1.setColor(Color.BLACK);
        g1.drawRect(me.getX(), me.getY(), 50, 50);

    }

    public static void main(String[] args) {
        new mouse3();
    }
}
