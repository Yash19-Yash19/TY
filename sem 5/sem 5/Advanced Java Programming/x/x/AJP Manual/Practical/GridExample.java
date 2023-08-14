 import java.awt.*;
 
 public class GridExample extends Frame
 {
   Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
   public GridExample() 
   {
	   setVisible(true);
	   setSize(500,500);
	   setLayout(new GridLayout(5,3,10,10));
	   
	   
	   b1 = new Button("1");
	   b2 = new Button("2");
	   b3 = new Button("3");
	   b4 = new Button("4");
	   b5 = new Button("5");
	   b6 = new Button("6");
	   b7 = new Button("7");
	   b8 = new Button("8");
	   b9 = new Button("9");
	   b10 = new Button("0");
	   b11 = new Button("+");
	   b12 = new Button("-");
	   b13 = new Button("=");
	   b14 = new Button("x");
	   b15 = new Button("/");
	   
	   add(b1);
	   add(b2);
	   add(b3);
	   add(b4);
	   add(b5);
	   add(b6);
	   add(b7);
	   add(b8);
	   add(b9);
	   add(b10);
	   add(b11);
	   add(b12);
	   add(b13);
	   add(b14);
	   add(b15);
   }
    public static void main(String []args)
	{
		new GridExample();
	}
 }