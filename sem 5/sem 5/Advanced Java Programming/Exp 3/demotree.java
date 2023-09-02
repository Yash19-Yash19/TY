// import javax.swing.*;
// import javax.swing.tree.DefaultMutableTreeNode;

// class demotree extends JFrame {
//     demotree() {

//         JFrame fr = new JFrame();

//         fr.setSize(1000, 1000);
//         fr.setVisible(true);
//         fr.setTitle("Tree");

//         DefaultMutableTreeNode cnt = new DefaultMutableTreeNode("Country");
//         DefaultMutableTreeNode ind = new DefaultMutableTreeNode("India");
//         DefaultMutableTreeNode stat = new DefaultMutableTreeNode("State");
//         DefaultMutableTreeNode maha = new DefaultMutableTreeNode("Maharashtra");
//         DefaultMutableTreeNode delhi = new DefaultMutableTreeNode("Delhi");

//         cnt.add(ind);
//         // cnt.add(stat);
//         ind.add(stat);

//         DefaultMutableTreeNode d1 = new DefaultMutableTreeNode("Maharashtra");
//         DefaultMutableTreeNode d2 = new DefaultMutableTreeNode("Delhi");
//         DefaultMutableTreeNode d3 = new DefaultMutableTreeNode("Pune");
//         DefaultMutableTreeNode d4 = new DefaultMutableTreeNode("Kolhapur");
//         DefaultMutableTreeNode d5 = new DefaultMutableTreeNode("d1");
//         DefaultMutableTreeNode d6 = new DefaultMutableTreeNode("d2");
//         // DefaultMutableTreeNode d5 = new DefaultMutableTreeNode("ETC");
//         // stat.add(d1);
//         // stat.add(d2);

//         stat.add(maha);
//         stat.add(delhi);

//         maha.add(d3);
//         maha.add(d4);
//         delhi.add(d5);
//         delhi.add(d6);
//         // ind.add(d5);

//         JTree tr = new JTree(cnt, isDefaultLookAndFeelDecorated());
//         fr.add(tr);

//     }

//     public static void main(String[] args) {

//         new demotree();

//     }

// }