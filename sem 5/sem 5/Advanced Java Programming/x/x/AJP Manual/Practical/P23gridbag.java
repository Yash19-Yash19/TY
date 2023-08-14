import java.awt.*;
public class P23gridbag extends Frame{
P23gridbag(){
setSize(500,500);
setLayout(new GridBagLayout());
GridBagConstraints g = new GridBagConstraints();
g.fill = GridBagConstraints.HORIZONTAL;
g.gridx = 0;
g.gridy = 0;
add(new Button("Button 1"),g);
g.gridx = 1;
g.gridy = 0;
add(new Button("Button 2"),g);
g.gridx = 0;
g.gridy = 1;
add(new Button("Button 3"),g);
g.gridx = 1;
g.gridy = 1;
add(new Button("Button 4"),g);
setTitle("Grid Bag Layout");
setVisible(true);
}
public static void main(String args[]){
new P23gridbag();
}
}

