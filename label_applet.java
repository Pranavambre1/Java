import java.awt.*;
import java.applet.*;
/*<Applet code="label_applet.class" width=400 height=400>
</Applet>*/
public class label_applet extends Applet
{
	Label l1,l2;
	public void init()
	{
		l1=new Label("Name");
		l2=new Label();
		l2.setText("Pass");
		add(l1);
		add(l2);
	}
	
}