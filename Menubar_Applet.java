import java.awt.*;
import java.applet.*;
/*<Applet code="Menubar_Applet.class" width=400 height=400>
</Applet>*/
public class Menubar_Applet extends Applet {
    Dimension d1=new Dimension(300,300);
    public void init()
    {
       Frame f1=new Format2("My Frame");
       f1.setSize(d1);
       f1.setVisible(true); 
    }
    
}
class Format2 extends Frame
{
    MenuBar mb1;
    Menu m1,m2,m3;
    MenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9;
    public Format2(String S)
    {
        mb1=new MenuBar();
        setMenuBar(mb1);

        m1=new Menu("File");
        m2=new Menu("Edit");
        m3=new Menu("Format");
        m3.setEnabled(false);

        mi1=new MenuItem("Open");
        mi2=new MenuItem("Save");
        mi3=new MenuItem("Save As");
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);

        mi4=new MenuItem("Undo");
        mi5=new MenuItem("Copy");
        mi6=new MenuItem("Paste");
        m2.add(mi4);
        m2.add(mi5);
        m2.add(mi6);

        mi7=new MenuItem("Tools");
        m3.add(mi7);
        mb1.add(m1);
        mb1.add(m2);
        mb1.add(m3);


    }
}