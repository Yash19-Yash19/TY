import java.awt.*;

class gl extends Frame {
    gl() {
        setVisible(true);
        setSize(500, 500);
        setTitle("Example of Grid Layout");
        GridLayout gl = new GridLayout(5, 5);
        Label ll = new Label("Name : ");
        add(ll);
        TextField name = new TextField();
        add(name);
        Label l = new Label("Username : ");
        add(l);
        TextField user = new TextField();
        add(user);
        Label ll1 = new Label("Email : ");
        add(ll1);
        TextField email = new TextField();
        add(email);
        Label l1 = new Label("Password : ");
        add(l1);
        TextField pass = new TextField();
        pass.setEchoChar('@');
        add(pass);
        Button b = new Button("SUBMIT");
        add(b);
        setLayout(gl);
    }

    public static void main(String args[]) {
        new gl();
    }
}
