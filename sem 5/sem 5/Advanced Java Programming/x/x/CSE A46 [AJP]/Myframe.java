import java.awt.*;

class Myframe extends Frame
{
 Myframe()
 {
setLayout(null);

Label l=new Label("Name:-");
l.setBounds(30,100,50,30);
add(l);

TextField t= new TextField();
t.setBounds(100,100,150,25);
add(t);

Label l1=new Label("Address:-");
l1.setBounds(30,150,60,30);
add(l1);

TextArea t1=new TextArea();
t1.setBounds(100,150,200,70);
add(t1);

Label l2=new Label("Gender:-");
l2.setBounds(30,250,50,30);
add(l2);

CheckboxGroup c=new CheckboxGroup();

Checkbox male=new Checkbox("Male",c,true);
male.setBounds(100,255,50,30);
add(male);

Checkbox female=new Checkbox("Female",c,false);
female.setBounds(170,255,70,30);
add(female);

Label l3=new Label("Department:-");
l3.setBounds(30,290,90,30);
add(l3);

Choice c1=new Choice();
c1.setBounds(120,290,250,30);
c1.add("Computer Science And Enggineering");
c1.add("Artificial Intelligence");
c1.add("Robotics Enggineering");
c1.add("Civil Enggineering");
add(c1);

Label l4=new Label("Hobbies:-");
l4.setBounds(30,350,60,30);
add(l4);

Checkbox h1=new Checkbox("Travelling");
h1.setBounds(110,350,90,20);
add(h1);
Checkbox h2=new Checkbox("Singing");
h2.setBounds(110,375,90,20);
add(h2);
Checkbox h3=new Checkbox("Coding");
h3.setBounds(110,400,90,20);
add(h3);


Label l5=new Label("Programing language:-");
l5.setBounds(30,440,150,20);
add(l5);
List L1=new List();
List L2=new List(2);
List L3=new List(3,true);
L1.setBounds(180,440,100,50);
L2.setBounds(180,510,100,50);
L3.setBounds(180,580,100,50);

L1.add("C");
L1.add("C++");
L1.add("C#");

L2.add("HTML");
L2.add("CSS");
L2.add("Javascript");

L3.add("Python");
L3.add("Java");
L3.add("C");

add(L1);
add(L2);
add(L3);


Color clr=new Color(50,150,50);
setBackground(clr);

Button b =new Button("Submit");
b.setBounds(170,650,60,30);
add(b);

setSize(500,800);
setVisible(true);

setTitle("MyFrame");
}
public static void main(String args[])
 {
  Myframe m= new Myframe();
 }
}

