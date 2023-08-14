import java.awt.*;

public class MenuExample extends Frame{
	MenuBar mb1;
	Menu m1,m2,m3;
	MenuItem mi1,mi3;
	CheckboxMenuItem mi2;
	public MenuExample(){
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		mb1 = new MenuBar();
		this.setMenuBar(mb1);
		m1 = new Menu("File");
		mb1.add(m1);
		m2 = new Menu("View");
		mb1.add(m2);
		m3 = new Menu("Edit");
		mb1.add(m3);
		mi1 = new MenuItem("New File");
		m1.add(mi1);
		mi2 = new CheckboxMenuItem("New Window",true);
		m1.add(mi2);
		mi3 = new MenuItem("Open");
		m1.add(mi3);
	}
	public static void main(String[] args){
		new MenuExample();
	}
}