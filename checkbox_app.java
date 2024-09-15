import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<Applet code="checkbox_app.class" width=400 height=400>
</Applet>*/
public class checkbox_app extends Applet implements ItemListener
{
	String msg;
	Checkbox ch1,ch2,ch3;
	public void init()
	{
		ch1=new Checkbox("Option 1",null,true);
		ch2=new Checkbox("Option 2",null,false);
		ch3=new Checkbox("Option 3",null,false);
		add(ch1);
		add(ch2);
		add(ch3);
		
		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);
		
		
	}
	public void paint(Graphics g)
	{
		msg="1" +ch1.getState();
		g.drawString(msg,100,200);
		
		msg="2" +ch2.getState();
		g.drawString(msg,100,300);
		
		msg="3" +ch3.getState();
		g.drawString(msg,100,400);
		
		
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
}