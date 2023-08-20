import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

class demo extends JFrame
{
 demo()
{

JFrame fr=new JFrame();

fr.setSize(1000,1000);
fr.setVisible(true);
fr.setTitle("Tree");




   
    DefaultMutableTreeNode clg=new DefaultMutableTreeNode("College");
    DefaultMutableTreeNode dept=new DefaultMutableTreeNode("Department");
    DefaultMutableTreeNode scl=new DefaultMutableTreeNode("School");

    clg.add(dept);
    clg.add(scl);

    DefaultMutableTreeNode d1=new DefaultMutableTreeNode("CSE");
    DefaultMutableTreeNode d2=new DefaultMutableTreeNode("ECE");
    DefaultMutableTreeNode d3=new DefaultMutableTreeNode("CIVIL");
    DefaultMutableTreeNode d4=new DefaultMutableTreeNode("AIDS");
    DefaultMutableTreeNode d5=new DefaultMutableTreeNode("ETC");
    dept.add(d1);
    dept.add(d2);
    dept.add(d3);
    dept.add(d4);
    dept.add(d5);

JTree tr=new JTree(clg, isDefaultLookAndFeelDecorated());
fr.add(tr);



}

 public static void main(String[] args) {
 
new demo();


}


}