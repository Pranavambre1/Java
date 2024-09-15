import java.awt.*;
import java.applet.*;
/*<Applet code="Border_lay.class" width=400 height=400 >
 * </Applet>
*/
public class Border_lay extends Applet{
    Button b1,b2,b3,b4,b5;
    public void init()
    {
        BorderLayout b=new BorderLayout(10,10);
        setLayout(b); 
        b1=new Button("A");
         b2=new Button("B");
         b3=new Button("C");
         b4=new Button("D");
         b5=new Button("E");

         add("North",b1);
         add("South",b2);
         add("West",b3);
         add("East",b4);
         add("Center",b5);




    }
    public void paint(Graphics g)
    {
        repaint();
    }
    
}
