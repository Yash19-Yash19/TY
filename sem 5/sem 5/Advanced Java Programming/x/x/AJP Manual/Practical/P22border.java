import java.awt.*;
public class P22border extends Frame
{
public static void main(String args[])
{
P22border b=new P22border();
b.setLayout(new BorderLayout());
b.setVisible(true);
b.setSize(500,500);
Button b1,b2,b3,b4,b5;
b1=new Button("North");
b2=new Button("South");
b3=new Button("East");
b4=new Button("West");
b5=new Button("Center");
b.add(b1,BorderLayout.NORTH);
b.add(b2,BorderLayout.SOUTH);
b.add(b3,BorderLayout.EAST);
b.add(b4,BorderLayout.WEST);
b.add(b5,BorderLayout.CENTER);
}
}