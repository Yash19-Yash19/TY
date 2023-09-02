// write a code for  adapter class of mousemotion interface in java frame
import java.awt.*;
import java.awt.event.*;
class demon10 extends Frame implements MouseMotionListener
{
    demon10()
    {
        addMouseMotionListener(this);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public void mouseDragged(MouseEvent e)
    {
        Graphics g=getGraphics();
        g.setColor(Color.red);
        g.fillOval(e.getX(),e.getY(),20,20);
    }
    public void mouseMoved(MouseEvent e)
    {
        Graphics g=getGraphics();
        g.setColor(Color.blue);
        g.fillOval(e.getX(),e.getY(),20,20);
    }
    public static void main(String args[])
    {
        new demon10();
    }
}

