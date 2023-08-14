  import java.awt.*;
  
  public class AllControls extends Frame
  {
    AllControls(){
	  Label l1 = new Label("username :");
	  l1.setBounds(50,90,100,50);
      TextField t1 = new TextField("name");
	  t1.setBounds(100,90,300,30);
      Button b1 = new Button("Submit");
	  b1.setBounds(150,150,50,30);
      TextArea t2 = new TextArea("Enter your address",5,3);
	  t2.setBounds(200,200,150,50);
      CheckboxGroup cbg = new CheckboxGroup();
      Checkbox cb1 = new Checkbox("Male",false,cbg);
	  cb1.setBounds(50,200,50,30);
      Checkbox cb2 = new Checkbox ("Female",false,cbg);
	  cb2.setBounds(50,240,50,30);
      Choice c1 = new Choice();
	  c1.setBounds(50,300,50,30);
	  c1.add("CSE");
	  c1.add("AIDS");
	  List lt = new List(4);
	  lt.setBounds(50,400,75,75);
	  lt.add("Java");
	  lt.add("SE");
	  lt.add("CD");
	  lt.add("DSV");
	  Scrollbar s = new Scrollbar();
	  s.setBounds(200,300,50,200);
	  
	  setSize(500,500);
	  setLayout(null);
	  setVisible(true);
	  add(l1);
	  add(t1);
	  add(b1);
	  add(t2);
	  add(cb1);
	  add(cb2);
	  add(c1);
	  add(lt);
	  add(s);
	}
	
	public static void main(String []args){
	   new AllControls();
	}
  }