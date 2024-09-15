import java.awt.*;
import java.applet.*;

/*<Applet code="Flow_lay.class" width=300 height=300>
 * </Applet>
 */
public class Flow_lay extends Applet 
{
    Button b1,b2,b3,b4;
    public void init()
    {
        FlowLayout f=new FlowLayout(FlowLayout.LEFT,10,10);
        setLayout(f);
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
