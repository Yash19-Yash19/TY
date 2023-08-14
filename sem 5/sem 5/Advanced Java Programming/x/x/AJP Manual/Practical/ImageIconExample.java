import java.awt.*;
import javax.swing.*;
@SuppressWarnings("unchecked")
public class ImageIconExample extends JFrame
{
public ImageIconExample()
{
setSize(500,500);
setLayout(null);
ImageIcon i =  new ImageIcon("india.jpg");
JLabel l = new JLabel(i);
l.setBounds(50,50,200,200);
add(l);
setVisible(true);
}
public static void main(String[] args)
{
ImageIconExample j = new ImageIconExample();
}
}