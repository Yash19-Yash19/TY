import java.awt.*;

class id extends Frame {
    id() {
        setLayout(null);

        MenuBar mb = new MenuBar();

        Menu mn1 = new Menu("File");
        Menu mn2 = new Menu("Edit");
        Menu mn3 = new Menu("View");

        MenuItem m1 = new MenuItem("New Tab");
        MenuItem m2 = new MenuItem("Open");
        MenuItem m3 = new MenuItem("Save");

        mn1.add(m1);
        mn1.add(m2);
        mn1.add(m3);

        mb.add(mn1);

        MenuItem m4 = new MenuItem("Cut");
        MenuItem m5 = new MenuItem("Copy");
        MenuItem m6 = new MenuItem("Paste");
        MenuItem m7 = new MenuItem("Delete");

        mn2.add(m4);
        mn2.add(m5);
        mn2.add(m6);
        mn2.add(m7);

        mb.add(mn2);

        Menu mn4 = new Menu("Zoom");
        MenuItem z1 = new MenuItem("Zoom in");
        mn4.add(z1);
        MenuItem z2 = new MenuItem("Zoom out");
        mn4.add(z2);

        MenuItem m9 = new MenuItem("Status Bar");
        MenuItem m10 = new MenuItem("Word Wrap");

        mn3.add(mn4);
        mn3.add(m9);
        mn3.add(m10);

        mb.add(mn3);

        setMenuBar(mb);

        setSize(300, 350);
        setVisible(true);
        setTitle("Menubar");
    }

    public static void main(String args[]) {
        id d = new id();
    }
}