import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

// Custom WindowAdapter class
class MyWindowAdapter extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
        System.out.println("Window is closing");
        System.exit(0);
    }
}

public class mouse2 {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Window Adapter Demo");

        // Create a label to display a message
        JLabel label = new JLabel("This is a JFrame with a WindowAdapter.");

        // Add the label to the frame
        frame.add(label);

        // Add a custom WindowAdapter to handle window closing event
        frame.addWindowListener(new MyWindowAdapter());

        // Set the size of the frame
        frame.setSize(300, 200);

        // Make the frame visible
        frame.setVisible(true);
    }
}
