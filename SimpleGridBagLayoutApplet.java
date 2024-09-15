import java.applet.Applet;
import java.awt.*;
/*<Applet code="SimpleGridBagLayoutApplet.class" width=400 height=400>
</Applet>*/

public class SimpleGridBagLayoutApplet extends Applet {

    @Override
    public void init() {
        // Set layout to GridBagLayout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Create buttons
        Button button1 = new Button("Button One");
        Button button2 = new Button("Button two");
        Button button3 = new Button("Button Three");
        Button button4 = new Button("Button Four");
        Button button5 = new Button("Button Five");

        // Add Button One (position 0,0)
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(button1, gbc);

        // Add Button Two (position 1,0)
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(button2, gbc);

        // Add Button Three (position 0,1)
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(button3, gbc);

        // Add Button Four (position 1,1)
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(button4, gbc);

        // Add Button Five (position 0,2 spanning 2 columns)
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;  // Span across two columns
        add(button5, gbc);
    }
}
