import java.awt.*;
import javax.swing.*;
/*<applet code="JappletEx" width=300 height=300></applet>*/

class JappletEx extends JApplet
{
	public void start()
	{
		Container c=getContentPane();
		JLabel l=new JLabel("Welcome",JLabel.CENTER);
		c.add(l);
		
	}
}