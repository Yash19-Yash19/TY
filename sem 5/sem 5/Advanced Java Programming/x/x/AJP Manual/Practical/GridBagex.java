import java.awt.*;
public class GridBagex extends Frame
{
GridBagex()
{
	setLayout(new GridBagLayout());
	setSize(500,500);
	setVisible(true); 
	GridBagConstraints gbc=new GridBagConstraints();
	gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.gridx = 0;  
    gbc.gridy = 0;  
    this.add(new Button("Button One"), gbc);  
	gbc.gridx = 1;
	gbc.gridy = 0;
	this.add(new Button("Button Two"), gbc);
	gbc.fill = GridBagConstraints.HORIZONTAL;
	gbc.ipady=20;
	gbc.gridx=0;
	gbc.gridy=1;
	this.add(new Button("Button Three"),gbc);
	gbc.gridx=1;
	gbc.gridy=1;
	this.add(new Button("Button Four"),gbc);
	gbc.fill = GridBagConstraints.HORIZONTAL;
	gbc.gridwidth=2;
	gbc.gridx=0;
	gbc.gridy=2;
	this.add(new Button("Button Five"),gbc);
}
public static void main(String args[])
{
	GridBagex g=new GridBagex();
}
}
	
	