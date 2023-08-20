import java.awt.*;
public class gridbag extends Frame{ 

public gridbag() 
{ 
setVisible(true); 
setSize(300, 300); 
setTitle("GridBag Layout Example"); 
GridBagLayout grid = new GridBagLayout(); 
 GridBagConstraints gbc = new GridBagConstraints(); 
 setLayout(grid); 
 
 GridBagLayout layout = new GridBagLayout(); 
this.setLayout(layout); 
gbc.gridx = 0; 
gbc.gridy = 0; 
this.add(new Button("Button One"), gbc); 
gbc.gridx = 1; 
gbc.gridy = 0; 
this.add(new Button("Button two"), gbc); 
gbc.gridx = 0; 
gbc.gridy = 1; 
this.add(new Button("Button Three"), gbc); 
gbc.gridx = 1; 
gbc.gridy = 1; 
this.add(new Button("Button Four"), gbc); 
} 

public static void main(String[] args) { 
 new gridbag(); 
 } 
}