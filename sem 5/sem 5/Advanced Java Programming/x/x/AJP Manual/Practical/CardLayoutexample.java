import java.awt.*;
import java.awt.event.*;

class CardLayoutid extends Frame implements ActionListener {
  CardLayout card = new CardLayout(10, 20);

  CardLayoutid() {
    setLayout(card);
    Button b1 = new Button("First");
    Button b2 = new Button("Second");
    Button b3 = new Button("Third");

    add(b1, "Card1");
    add(b2, "Card2");
    add(b3, "Card3");

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    card.next(this);
  }
}

class CardLayoutexample {
  public static void main(String args[]) {
    CardLayoutid obj = new CardLayoutid();
    obj.setTitle("CardLayout Java Example");
    obj.setSize(300, 400);
    obj.setResizable(false);
    obj.setVisible(true);
  }
}
