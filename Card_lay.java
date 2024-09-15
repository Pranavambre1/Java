import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<Applet code="Card_lay.class" width=400 height=400>
 * </Applet>
 */
public class Card_lay extends Applet implements ActionListener {
    Button b1, b2, b3, b4;
    CardLayout c;
    Panel p;

    public void init() {
        c = new CardLayout(10, 10);
        p = new Panel();
        p.setLayout(c);

        b1 = new Button("A");
        b2 = new Button("B");
        b3 = new Button("C");
        b4 = new Button("D");

        
        p.add(b1, "1");
        p.add(b2, "2");
        p.add(b3, "3");
        p.add(b4, "4");

      
        add(p);

      
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    
    public void actionPerformed(ActionEvent e) {
        c.next(p);
    }
}
