import java.awt.*;
public class Gridex extends Frame
{
public static void main(String args[])
{
	Gridex g=new Gridex();
	g.setLayout(new GridLayout(3,3,20,25));
	g.setSize(500,500);
	g.setVisible(true);
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
	b1=new Button("1");
	b2=new Button("2");
	b3=new Button("3");
	b4=new Button("4");
	b5=new Button("5");
	b6=new Button("6");
	b7=new Button("7");
	b8=new Button("8");
	b9=new Button("9");
	g.add(b1);g.add(b2);g.add(b3);g.add(b4);g.add(b5);g.add(b6);g.add(b7);g.add(b8);g.add(b9);
}
}