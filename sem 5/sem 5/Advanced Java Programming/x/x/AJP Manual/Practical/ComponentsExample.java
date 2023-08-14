import java.awt.*;

public class ComponentsExample extends Frame
{
 
Label l1,l2,l3,l4,l5,l6,l7,l8;
Button b1,b2;
TextField t1,t2,t3;
Choice c1;
TextArea ta1;
Checkbox cb1,cb2;
CheckboxGroup cgb;
List li1;

public ComponentsExample(){

super("ComponentsExample");
Color c = new Color(255,102,102);
setBackground(c);
setVisible(true);
setSize(500,600);  
setLayout(null); 



l1=new Label("STUDENT REGISTRATION FORM");
l1.setBounds(120,40,300,50); 
add(l1);

l2=new Label("Name");
l2.setBounds(22,100,100,36); 
add(l2);

t1=new TextField();
t1.setBounds(122,100,200,26); 
add(t1);

l3=new Label("Roll Number");
l3.setBounds(22,140,100,36); 
add(l3);

t2=new TextField();
t2.setBounds(122,140,200,26); 
add(t2);

l4=new Label("Department");
l4.setBounds(22,180,100,30); 
add(l4);

c1=new Choice();
c1.setBounds(122,180,200,30); 
c1.add("Computer Science");
c1.add("Artificial Intelligence");
c1.add("Mechanical");
c1.add("Robotics");
c1.add("Information Technology");
c1.add("Chemical");
add(c1); 

l4=new Label("Class");
l4.setBounds(22,220,100,30 ); 
add(l4);

c1=new Choice();
c1.setBounds(122,220,200,30); 
c1.add("TY");
c1.add("SY");
c1.add("FY");
add(c1); 

l6=new Label("Address");
l6.setBounds(22,260,60,36); 
add(l6);

ta1 = new TextArea();
ta1.setBounds(122,260,200,66); 
add(ta1);

l7=new Label("Gender");
l7.setBounds(22,330,60,36); 
add(l7);

cgb = new CheckboxGroup(); 
cb1 = new Checkbox("Male",cgb,true);
cb1.setBounds(122,320,60,36); 

cb2 = new Checkbox("Female",cgb,false);
cb2.setBounds(122,350,60,36); 

add(cb1);
add(cb2);

l8=new Label("State");
l8.setBounds(22,390,60,36); 
add(l8);

li1 = new List(10);
li1.setBounds(122,400,200,56);
li1.add("Maharashtra");
li1.add("Goa");
li1.add("West Bengal");
li1.add("Karnatak");
li1.add("Uttar Pradesh");
add(li1);

b1=new Button("Submit");
b1.setBounds(120,470,60,36);
add(b1);

b2=new Button("Cancel");
b2.setBounds(230,470,60,36);
add(b2);
 
 
}

public static void main(String []args)
{
  ComponentsExample c = new ComponentsExample();

}
}