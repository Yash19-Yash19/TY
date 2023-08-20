import java.awt.*;

class id extends Frame {

    id() {
        setLayout(null);
        setSize(500, 500);
        setVisible(true);
        setTitle("Exp");

        MenuBar mb = new MenuBar();

        Menu mn1 = new Menu("File");
        MenuItem m1 = new MenuItem("New");
        MenuItem m2 = new MenuItem("Open");
        MenuItem m3 = new MenuItem("Save");

        Menu mn2 = new Menu("Edit");
        MenuItem m4 = new MenuItem("Copy");
        MenuItem m5 = new MenuItem("Cut");
        MenuItem m6 = new MenuItem("Paste");

        Menu mn3 = new Menu("View");
        Menu mn4 = new Menu("Zoom");
        MenuItem m8 = new MenuItem("Zoon In");
        MenuItem m9 = new MenuItem("Zoon Out");
        MenuItem mn5 = new MenuItem("Status Bar");

        mn1.add(m1);
        mn1.add(m2);
        mn1.add(m3);

        mn2.add(m4);
        mn2.add(m5);
        mn2.add(m6);

        mn4.add(m8);
        mn4.add(m9);

        mn3.add(mn4);
        mn3.add(mn5);

        mb.add(mn1);
        mb.add(mn2);
        mb.add(mn3);

        setMenuBar(mb);

       

    }

    public static void main(String args[]) {

        new id();

    }
}