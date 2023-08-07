import java.awt.*;

class Myframe extends Frame {

  Myframe() {
    setSize(400, 400);
    setVisible(true);
    setLayout(null);
    setTitle(" Frame 1");
    Label l = new Label("Name :");
    l.setBounds(30, 100, 80, 30);
    add(l);
    TextField t1 = new TextField();
    t1.setBounds(120, 100, 250, 30);
    add(t1);
    Label l1 = new Label("Address :");
    l1.setBounds(30, 150, 80, 30);
    add(l1);
    TextArea t2 = new TextArea();
    t2.setBounds(120, 150, 250, 100);
    add(t2);
    Label l2 = new Label("Gender :");
    l2.setBounds(30, 270, 80, 30);
    add(l2);
    CheckboxGroup g = new CheckboxGroup();
    Checkbox male = new Checkbox("Male", g, true);
    male.setBounds(130, 270, 50, 30);
    add(male);
    Checkbox female = new Checkbox("Female", g, false);
    female.setBounds(185, 270, 65, 30);
    add(female);
    Label l3 = new Label("Department :");
    l3.setBounds(30, 310, 80, 30);
    add(l3);
    Choice d = new Choice();
    d.setBounds(130, 315, 250, 350);
    d.add("computer Science And Enginnering");
    d.add("Mechanical Enginnering");
    d.add("Electrical Enginnering");
    d.add("Electronic Enginnering");
    d.add("Artificial Intelligence Enginnering");
    add(d);
    Label l4 = new Label("Hobbies:");
    l4.setBounds(30, 350, 80, 30);
    add(l4);
    Checkbox Sports = new Checkbox("Sports");
    Sports.setBounds(120, 350, 80, 30);
    add(Sports);
    Checkbox Reading = new Checkbox("Reading");
    Reading.setBounds(120, 385, 80, 30);
    add(Reading);
    Checkbox Drama = new Checkbox("Drama");
    Drama.setBounds(120, 420, 80, 30);
    add(Drama);

    Label lp = new Label("Programming Languages");
    lp.setBounds(30, 500, 140, 30);
    add(lp);

    List list1 = new List(2, true);
    list1.setBounds(180, 500, 150, 40);
    list1.add("c#");
    list1.add("c++");
    list1.add("JavaScript");
    list1.add("Python");

    add(list1);
    Button b1 = new Button("Save");
    b1.setBounds(140, 600, 40, 30);
    add(b1);
    Button b2 = new Button("Clear");
    b2.setBounds(200, 600, 40, 30);
    add(b2);

    Color c5 = new Color(255, 255, 255);
    b2.setForeground(c5);
    Color c2 = new Color(255, 215, 0);
    b1.setBackground(c2);
    Color c3 = new Color(255, 0, 0);
    b2.setBackground(c3);
    Color c1 = new Color(50, 150, 50);
    setBackground(c1);

  }

  public static void main(String args[]) {

    Myframe m = new Myframe();
}

}