import java.awt.*;
import javax.swing.*;

class JframeEx extends JFrame
{
	JframeEx()
	{
		Container c=getContentPane();
		setSize(500,500);
		setVisible(true);
		setLayout(null);
		setTitle("Swing example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel l=new JLabel("First Name:");
		l.setBounds(30,50,150,30);
		c.add(l);
		
		JTextField tx=new JTextField();
		tx.setBounds(100,50,100,30);
		c.add(tx);
		
		JLabel l2=new JLabel("Middle Name:");
		l2.setBounds(30,120,150,30);
		c.add(l2);
		
		JTextField tx2=new JTextField();
		tx2.setBounds(110,120,100,30);
		c.add(tx2);
		
		JLabel l3=new JLabel("Last Name:");
		l3.setBounds(30,180,150,30);
		c.add(l3);
		
		JTextField tx3=new JTextField();
		tx3.setBounds(100,180,100,30);
		c.add(tx3);
		
		JLabel l4=new JLabel("Gender:");
		l4.setBounds(30,220,150,30);
		c.add(l4);
		
		JRadioButton jr=new JRadioButton("Male",false);
		jr.setBounds(100,220,60,30);
		c.add(jr);
		
		JRadioButton jr1=new JRadioButton("Female",true);
		jr1.setBounds(100,250,100,30);
		c.add(jr1);
		
		ButtonGroup gp=new ButtonGroup();
		gp.add(jr);
		gp.add(jr1);
		
		JLabel l5=new JLabel("Address:");
		l5.setBounds(30,290,150,30);
		c.add(l5);
		
		JTextArea t1=new JTextArea();
		t1.setBounds(100,290,150,50);
		c.add(t1);
		
		JLabel l6=new JLabel("City:");
		l6.setBounds(30,360,150,30);
		c.add(l6);
		
		JComboBox jc=new JComboBox();
		jc.addItem("Kolhapur");
		jc.addItem("Pune");
		jc.addItem("Mumbai");
		jc.addItem("Solapur");
		jc.addItem("Satara");
		jc.setBounds(100,360,150,50);
		c.add(jc);
		
		ImageIcon m=new ImageIcon("D:/AJP-70/download.png");
		JLabel l7=new JLabel(m);
		l7.setBounds(10,20,200,200);
		c.add(l7);
		
		
		
	}
	public static void main(String args[])
	{
		JframeEx jx=new JframeEx();
	}
}