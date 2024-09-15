import java.awt.*;
import java.applet.*;
import java.awt.event.*;
 /*<Applet code="buttonEvent_app.class" width=400 height=400>
 </Applet>*/
 
 public class buttonEvent_app extends Applet implements ActionListener
 {
	 Button b1,b2;
	 String msg=" ";
	 
	 public void init()
	 {
		 b1=new Button("One");
		 add(b1);
		 b1.addActionListener(this);
		 b2=new Button("Two");
		 add(b2);
		 b2.addActionListener(this);
		 
	 }
	 public void actionPerformed(ActionEvent e)
	 {
		 String s=e.getActionCommand();
		 if("One".equals(s))
		 {
			 msg="one clicked";
			 
		 }
		 if("Two".equals(s))
		 {
			 msg="two clicked";
		 }
		 repaint();
		 	 
	 }
	 public void paint(Graphics g)
	 {
		 g.drawString(msg,40,50);
	 }
	 
 }