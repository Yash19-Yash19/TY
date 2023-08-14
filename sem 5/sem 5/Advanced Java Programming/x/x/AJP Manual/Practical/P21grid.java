import java.awt.*;
import java.awt.event.*;
public class P21grid extends Frame{
P21grid(){
setSize(500,500);
Button b[] = new Button[25];
for(int i = 0; i <= 24; i++){
b[i] = new Button(Integer.toString(i+1));
add(b[i]);
}
setLayout(new GridLayout(5,5,20,25));
setTitle("Grid Layout Siddhesh");
setVisible(true);
}
public static void main(String args[]){
new P21grid();
}
}

