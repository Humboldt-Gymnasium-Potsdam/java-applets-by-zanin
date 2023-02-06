import java.awt.*;
import java.awt.event.*;

public class FarbauswahlEingabe extends java.applet.Applet implements ActionListener {
    Label l1 = new Label("Geben sie die RGB Werte für die Gewünschte Farbe ein.");
    Label l2 = new Label("R");
    Label l3 = new Label("G");
    Label l4 = new Label("B");
    Label l5 = new Label();
    TextField t1 = new TextField("0");
    TextField t2 = new TextField("0");
    TextField t3 = new TextField("0");

    public void init() {
        setLayout(null);
        add(l1);
        l1.setBounds(10, 20, 310, 20);
        add(l2);
        l2.setBounds(40, 50, 60, 20);
        add(l3);
        l3.setBounds(110, 50, 60, 20);
        add(l4);
        l4.setBounds(180, 50, 60, 20);
        add(t1);
        t1.setBounds(40, 80, 60, 20);
        t1.addActionListener(this);
        t1.setBackground(Color.gray);
        add(t2);
        t2.setBounds(110, 80, 60, 20);
        t2.addActionListener(this);
        t2.setBackground(Color.gray);
        add(t3);
        t3.setBounds(180, 80, 60, 20);
        t3.addActionListener(this);
        t3.setBackground(Color.gray);
        add(l5);
        l5.setBounds(40, 110, 200, 20);
        l5.setBackground(Color.black);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(t1) || e.getSource().equals(t2) || e.getSource().equals(t3)) {
            l5.setBackground(new Color(Integer.parseInt(t1.getText()), Integer.parseInt(t2.getText()),
                    Integer.parseInt(t3.getText())));
        }
    }
}
