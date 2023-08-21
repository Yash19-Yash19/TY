import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

class demotable extends JPanel {

     demotable() {

          // JFrame f = new JFrame();
          String data[][] = { { "1", "n1", "1000" }, { "2", "n2", "2000" }, { "3", "n3", "3000" } };
          String label[] = { "id", "name", "salary" };
          JTable t = new JTable(data, label);
          add(t);
          add(new JScrollPane(t));
          // setSize(500, 500);
          setVisible(true);
          setBounds(400, 400, 10, 30);

     }

}

public class tab_1 extends JFrame {

     tab_1() {

          setSize(1000, 100);
          setVisible(true);
          // setLayout(null);

          JTabbedPane tb = new JTabbedPane();
          demotable p1 = new demotable();
          tb.add("Tab 1", p1);
          demotree p2 = new demotree();
          tb.add("Tab 2", p2);
          add(tb);

     }

     public static void main(String[] args) {
          new tab_1();
     }

}

class demotree extends JPanel {
     demotree() {

          // JFrame fr = new JFrame();

          // fr.setSize(1000, 1000);
          // fr.setVisible(true);
          // fr.setTitle("Tree");

          DefaultMutableTreeNode cnt = new DefaultMutableTreeNode("Country");
          DefaultMutableTreeNode ind = new DefaultMutableTreeNode("India");
          DefaultMutableTreeNode stat = new DefaultMutableTreeNode("State");
          DefaultMutableTreeNode maha = new DefaultMutableTreeNode("Maharashtra");
          DefaultMutableTreeNode delhi = new DefaultMutableTreeNode("Delhi");

          cnt.add(ind);
          // cnt.add(stat);
          ind.add(stat);

          DefaultMutableTreeNode d1 = new DefaultMutableTreeNode("Maharashtra");
          DefaultMutableTreeNode d2 = new DefaultMutableTreeNode("Delhi");
          DefaultMutableTreeNode d3 = new DefaultMutableTreeNode("Pune");
          DefaultMutableTreeNode d4 = new DefaultMutableTreeNode("Kolhapur");
          DefaultMutableTreeNode d5 = new DefaultMutableTreeNode("d1");
          DefaultMutableTreeNode d6 = new DefaultMutableTreeNode("d2");
          // DefaultMutableTreeNode d5 = new DefaultMutableTreeNode("ETC");
          // stat.add(d1);
          // stat.add(d2);

          stat.add(maha);
          stat.add(delhi);

          maha.add(d3);
          maha.add(d4);
          delhi.add(d5);
          delhi.add(d6);
          // ind.add(d5);

          JTree tr = new JTree(cnt);
          add(tr);

     }

}
