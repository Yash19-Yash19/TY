import java.awt.*;
public class Menuex extends Frame
{
public static void main(String args[])
{
	Menuex e=new Menuex();
	e.setSize(500,500);
	e.setVisible(true);
	e.setLayout(null);
	MenuBar mb=new MenuBar();
	Menu m1=new Menu("File");
	Menu m2=new Menu("Edit");
	Menu m3=new Menu("Search");
	Menu m4=new Menu("View");
	MenuItem mi1=new MenuItem("New");
	MenuItem mi2=new MenuItem("Open");
	MenuItem mi3=new MenuItem("Save");
	MenuItem mi4=new MenuItem("Copy");
	MenuItem mi5=new MenuItem("Paste");
	MenuItem mi6=new MenuItem("Delete");
	MenuItem mi7=new MenuItem("Find");
	MenuItem mi8=new MenuItem("Go to");
	MenuItem mi9=new MenuItem("Replace");
	MenuItem mi10=new MenuItem("Zoom");
	MenuItem mi11=new MenuItem("Fold all");
	MenuItem mi12=new MenuItem("Unfold all");
	e.setMenuBar(mb);
	m1.add(mi1);
	m1.add(mi2);
	m1.add(mi3);
	m2.add(mi4);
	m2.add(mi5);
	m2.add(mi6);
	m3.add(mi7);
	m3.add(mi8);
	m3.add(mi9);
	m4.add(mi10);
	m4.add(mi11);
	m4.add(mi12);
	mb.add(m1);
	mb.add(m2);
	mb.add(m3);
	mb.add(m4);
}
}
	
	
	
	
	
	