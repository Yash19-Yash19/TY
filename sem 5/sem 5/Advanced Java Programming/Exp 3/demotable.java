import javax.swing.*;

class demotable extends JFrame {

    demotable() {

        JFrame f = new JFrame();
        String data[][] = { { "1", "n1", "1000" }, { "2", "n2", "2000" }, { "3", "n3", "3000" } };
        String label[] = { "id", "name", "salary" };
        JTable t = new JTable(data, label);
        f.add(t);
        f.add(new JScrollPane(t));
        f.setSize(500, 500);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new demotable();
    }

}
