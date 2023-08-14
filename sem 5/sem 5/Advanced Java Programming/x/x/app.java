import java.applet.Applet;
import java.awt.*;
 
 public class app extends Frame
 {
 Label l;
 
 app()
 {
 l=new Label("Name");
 l.setBounds(30,100,50,30);
 setSize(300,300);
 setLayout(null);
 setVisible(true);
 add(l);

 }
 public static void main(String args[])
 {
	 app ap=new app();
 }
 }