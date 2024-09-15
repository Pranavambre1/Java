import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<Applet code="choice_app.class" width=400 height=400>
</Applet>*/
public class choice_app extends Applet implements ItemListener
{
	String msg=" ";
	Checkbox ch1,ch2,ch3;
	CheckboxGroup cbg;
	public void init()
	{
		cbg=new CheckboxGroup();
		ch1=new Checkbox("OP1",cbg,true);
		ch2=new Checkbox("OP2",cbg,false);
		ch3=new Checkbox("OP3",cbg,false);
		add(ch1);
		add(ch2);
		add(ch3);
		
		
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="u selected"+cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg,40,40);
		repaint();
	}
}