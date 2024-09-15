import java.awt.*;
import java.applet.*;
/*<Applet code="Grid_lay.class"width=400 height=400>
 * </Applet>
 */

public class Grid_lay extends Applet {
    Button b1,b2,b3,b4;
    public void init()
    {
        GridLayout g=new GridLayout(2,2,10,10);
        setLayout(g);
        b1=new Button("A");
        b2=new Button("B");
        b3=new Button("C");
        b4=new Button("D");

        add(b1);
        add(b2);
        add(b3);
        add(b4);

    }
    public void paint(Graphics g)
    {

        repaint();
    }
    
    
}
