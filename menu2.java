import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<Applet code="menu2.class" width=400 height=400>
</Applet>*/
public class menu2 extends Applet{
    Dimension d1=new Dimension(300,300);
    public void init()
    {
       Label l1=new Label("Show");
       Frame f1=new Sample("My Frame");
       f1.setSize(d1);
       f1.setVisible(true); 
    }
    
    
}
class Sample extends Frame implements ActionListener
{
    MenuBar mb1;
    Menu m1,m2;
    MenuItem mi1,mi2,mi3,mi4;
    
    public Sample(String s)
    {
        mb1=new MenuBar();
        setMenuBar(mb1);
        m1=new Menu("File");
        mi1=new MenuItem("Open");
        mi2=new MenuItem("Save");
        m1.add(mi1);
        m1.add(mi2);
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mb1.add(m1);

        m2=new Menu("Edit");
        mi3=new MenuItem("Copy");
        mi4=new MenuItem("Paste");
        m2.add(mi3);
        m2.add(mi4);
 
        mi3.addActionListener(this);
        mi4.addActionListener(this);
        mb1.add(m2);

    }
    public void actionPerformed(ActionEvent ae)
    {
        String s=ae.getActionCommand();
        if(s.equals("Open"))
        {
            l1.setText("You are selected Open");
        }
        
        if(s.equals("Save"))
        {
            l1.setText("You are selected Save");
        }
        if(s.equals("Copy"))
        {
            l1.setText("You are selected Copy");
        }
        if(s.equals("Paste"))
        {
            l1.setText("You are selected submenu");
        }
        
    }
}
