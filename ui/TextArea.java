// ui/TextArea.java
// Using the JTextArea control.
import javax.swing.*;
import java.awt.*;
import java.util.*;
import onjava.*;
import static onjava.SwingConsole.*;

public class TextArea extends JFrame {
  private JButton
    b = new JButton("Add Data"),
    c = new JButton("Clear Data");
  private JTextArea t = new JTextArea(20, 40);
  private Map<String,String> m = new HashMap<>();
  public TextArea() {
    // Use up all the data:
    m.putAll(Countries.capitals());
    b.addActionListener(e -> {
      for(Map.Entry me : m.entrySet())
        t.append(me.getKey() + ": "+ me.getValue()+"\n");
    });
    c.addActionListener(e -> t.setText(""));
    setLayout(new FlowLayout());
    add(new JScrollPane(t));
    add(b);
    add(c);
  }
  public static void main(String[] args) {
    run(new TextArea(), 475, 425);
  }
}