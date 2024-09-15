import java.awt.*;
import java.applet.*;
/*<Applet code="button_app.class" width=400 height=400>
</Applet>*/
public class button_app extends Applet 
{
	Button b1,b2;
	public void init()
	{
		b1=new Button("one");
		b2=new Button("Two");
		add(b1);
		add(b2);
	}
}