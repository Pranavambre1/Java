import java.applet.Applet;
import java.awt.*;
/*<Applet code="GridBagLayoutApplet.class" width=400 height=400>
</Applet>*/

public class GridBagLayoutApplet extends Applet {
    
    @Override
    public void init() {
        // Set the layout to GridBagLayout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Create components
        Label nameLabel = new Label("Name");
        TextField nameField = new TextField(15);
        
        Label commentLabel = new Label("Comments");
        TextArea commentArea = new TextArea(5, 15);
        
        Button submitButton = new Button("Submit");
        
        // Set GridBagConstraints for Name Label
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        add(nameLabel, gbc);

        // Set GridBagConstraints for Name TextField
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        add(nameField, gbc);

        // Set GridBagConstraints for Comments Label
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        add(commentLabel, gbc);   

        // Set GridBagConstraints for Comments TextArea
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weighty = 1.0;
        add(commentArea, gbc);

        // Set GridBagConstraints for Submit Button
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.SOUTHEAST;
        gbc.fill = GridBagConstraints.NONE;
        add(submitButton, gbc);
    }
}
