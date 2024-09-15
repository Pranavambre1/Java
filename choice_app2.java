import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<Applet code="choice_app2.class" width=400 height=400>
 * </Applet>
 */

public class choice_app2 extends Applet implements ItemListener{
    Choice c1;
    TextField t1;
    public void init()
    {
        c1=new Choice();
        t1=new TextField();
        c1.addItem("Red");
        c1.addItem("Blue");
        add(c1);
        c1.addItemListener(this);

    }
    public void itemStateChanged(ItemEvent ie)
    {
        t1.setText(c1.getSelectedItem());
        repaint();
    }

    
}
