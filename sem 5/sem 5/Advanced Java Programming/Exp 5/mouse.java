
// Write a program to mouse motion adapter class to implement only one method mouse dragged using frame 
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class mouse extends Frame {
    mouse() {
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Graphics g = getGraphics();
                g.setColor(Color.red);
                g.fillOval(e.getX(), e.getY(), 20, 20);
            }
        });
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String args[]) {
        new mouse();
    }
}
