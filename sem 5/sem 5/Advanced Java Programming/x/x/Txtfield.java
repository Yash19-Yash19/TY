
import java.awt.*;
 
 public class Txtfield extends Frame
 {
 Txtfield()
 {
 Label l=new Label("Name:");
TextField t=new  TextField();
 Button b=new Button("Submit");
 Label l1=new Label("Adress:");
 TextArea ta=new TextArea();
 l.setBounds(30,100,50,30);
 t.setBounds(80,100,100,30);
 b.setBounds(70,250,100,30);
 l1.setBounds(30,150,50,30);
 ta.setBounds(80,150,150,50);
 setSize(300,300);
 setLayout(null);
 setVisible(true);
 add(l);
 add(t);
 add(b);
 add(l1);
 add(ta);
 

 }
 public static void main(String args[])
 {
	 Txtfield tf=new Txtfield();
 }
 }