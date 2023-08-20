import java.awt.*;

class bdrlyt extends Frame {
    bdrlyt() {
        setSize(600, 600);
        setVisible(true);
        setTitle("The Frame Layout Code");
        setLocation(700, 350);
        BorderLayout bl = new BorderLayout(20, 20);
        Button b1 = new Button("Save");
        add(b1, bl.NORTH);
        Button b2 = new Button("Clear");
        add(b2, bl.SOUTH);
        Button b3 = new Button("Cancel");
        add(b3, bl.EAST);
        Button b4 = new Button("Submit");
        add(b4, bl.WEST);
        Label l = new Label("Welcome to Advance Java", Label.CENTER);
        add(l, bl.CENTER);
    }

    public static void main(String args[]) {
        bdrlyt bd = new bdrlyt();
    }
}