import java.awt.*;
import java.awt.event.*;
import java.awt.Choice;

public class FarbauswahlMenu extends java.applet.Applet implements ItemListener {

  Choice C1 = new Choice();
  Label L1 = new Label("Der Hintergrund ist: Schwarz");
  Label L2 = new Label("Wählen sie eine Farbe um den Hintergrund zu ändern");

  public void init() {
    setLayout(null);
    C1.add("Grün");
    C1.add("Rot");
    C1.add("Blau");
    C1.addItemListener(this);
    setLayout(null);
    setBackground(new Color(0, 0, 0));
    add(C1);
    C1.setBounds(90, 70, 60, 50);
    C1.setBackground(new Color(250, 250, 250));
    add(L1);
    L1.setBounds(40, 120, 170, 50);
    L1.setBackground(new Color(250, 250, 250));
    add(L2);
    L2.setBounds(0, 5, 300, 50);
    L2.setBackground(new Color(250, 250, 250));

  }

  public void itemStateChanged(ItemEvent ie) {
    if (C1.getSelectedItem().equals("Blau")) {
      setBackground(new Color(18, 73, 161));
      L1.setText("Der Hintergrund ist: Blau");
      L1.setBackground(new Color(18, 73, 161));
      L2.setBackground(new Color(18, 73, 161));
    }
    if (C1.getSelectedItem().equals("Rot")) {
      setBackground(new Color(237, 46, 36));
      L1.setText("Der Hintergrund ist: Rot");
      L1.setBackground(new Color(237, 46, 36));
      L2.setBackground(new Color(237, 46, 36));
    }
    if (C1.getSelectedItem().equals("Grün")) {
      setBackground(new Color(42, 184, 52));
      L1.setText("Der Hintergrund ist: Grün");
      L1.setBackground(new Color(42, 184, 52));
      L2.setBackground(new Color(42, 184, 52));
      // L1.setText("Du hast "+C1.getSelectedItem()+" ausgewählt.");
    }

  }
}