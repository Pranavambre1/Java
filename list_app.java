import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="list_app.class" width=400 height=400>
</applet> */
public class list_app extends Applet implements ItemListener,ActionListener
{
	String msg;
	List l1;
	Button b1,b2;
	TextField result=new TextField();
	public void init()
	{
		l1=new List();
		l1.addItemListener(this);
		l1.add("Pink");
		l1.add("Red");
		l1.add("Blue");
		add(l1);
		
		b1=new Button("Count");
		b1.addActionListener(this);
		add(b1);
		add(result);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			msg="Count is::"+l1.getItemCount();
			repaint();
		}
	}
	public void itemStateChanged(ItemEvent ie)
	{
		result.setText(" "+l1.getSelectedItem());
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,100,100);
		
	}
}