import java.awt.*;
public class Login extends Frame
{
Login()
{
Label l=new Label("Student Name:");
l.setBounds(25,40,100,25);
TextField t=new TextField();
t.setBounds(125,40,100,25);
Label l2=new Label("Password:");
l2.setBounds(25,80,100,25);
TextField t2=new TextField();
t2.setBounds(125,80,100,25);
t2.setEchoChar('*'); 
Label l3=new Label("Address:");
l3.setBounds(25,120,100,25);
TextArea t3=new TextArea();
t3.setBounds(125,120,200,55);
CheckboxGroup cg=new CheckboxGroup();
Label l4=new Label("Gender:");
l4.setBounds(25,180,100,25);
Checkbox c1=new Checkbox("Male",false,cg);
Checkbox c2=new Checkbox("Female",false,cg);
c1.setBounds(125,180,100,25);
c2.setBounds(125,200,100,25);
Label l5=new Label("Department:");
l5.setBounds(25,240,100,25);
Choice co=new Choice();
co.add("Computer Engineering");
co.add("Electrical Engineering");
co.add("Electronics Engineering");
co.add("Mechanical Engineering");
co.add("Civil Engineering");
co.setBounds(125,240,200,25);
Label l6=new Label("Hobbies:");
l6.setBounds(25,280,100,25);
List li=new List(5);
li.setBounds(125,280,200,55);
li.setMultipleMode(true);
li.add("Reading");
li.add("Coding");
li.add("Swimming");
li.add("Playing");
li.add("Cooking");
Scrollbar s1=new Scrollbar(Scrollbar.VERTICAL,1,1,1,50);
s1.setBounds(400,120,10,100);
Button b1=new Button("Click Me");
b1.setBounds(200,400,100,25);
this.setLayout(null);
this.setVisible(true);
this.setSize(1000,1000);
add(l);
add(t);
add(l2);
add(t2);
add(l3);
add(t3);
add(l4);
add(c1);
add(c2);
add(l5);
add(co);
add(l6);
add(li);
add(s1);
add(b1);
}
public static void main(String args[])
{
	Login li=new Login();
}
}
