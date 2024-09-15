import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<Applet code="textfield_app.class" width=400 height=400>
 * </Applet>
 */
public class textfield_app extends Applet implements ActionListener {
    TextField name,pass;
    
    public void init()
    {
        Label namep=new Label("Name=",Label.LEFT);
        Label passp=new Label("Pass=",Label.LEFT);

        name=new TextField(12);
        pass=new TextField(10);
        
        add(namep);
        add(name);
        name.addActionListener(this);
        add(passp);
        add(pass);
       
        pass.addActionListener(this);        

    }
    public void actionPerformed(ActionEvent e)
    {
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString("name="+name.getText(),6,150);
        g.drawString("Selected text in name="+name.getSelectedText(),6,100);
        g.drawString("Password="+pass.getSelectedText(),6,200);


    }
}
