import java.awt.*;
public class Flowex extends Frame
{
public static void main(String args[])
{
	Flowex e=new Flowex();
	e.setSize(100,100);
	e.setVisible(true);
	e.setLayout(new FlowLayout());
	Button b1,b2,b3,b4,b5,b6,b7;
	b1=new Button("Hello 1");
	b2=new Button("Hello 2");
	b3=new Button("Hello 3");
	b4=new Button("Hello 4");
	b5=new Button("Hello 5");
	b6=new Button("Hello 6");
	b7=new Button("Hello 7");
	e.add(b1);e.add(b2);e.add(b3);e.add(b4);e.add(b5);e.add(b6);e.add(b7);
}
}