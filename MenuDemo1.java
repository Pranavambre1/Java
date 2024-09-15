import java.awt.*;
import java.awt.event.*;

public class MenuDemo1 extends Frame {
    MenuBar mb;
    MenuItem m1, m2, m3, m4;
    Menu mn;
    MenuShortcut ms;

    MenuDemo1() {
        setTitle("MenuBar Demo");
        setSize(500, 500);
        setLayout(null);  // Not required for this example; could use default layout
        
        // Create a MenuShortcut for the Exit menu item
        ms = new MenuShortcut(KeyEvent.VK_X);

        // Create a Menu and MenuItems
        mn = new Menu("File");
        mb = new MenuBar();
        m1 = new MenuItem("New...");
        m2 = new MenuItem("Open...");
        m3 = new MenuItem("Save As...");
        m4 = new MenuItem("Exit", ms);

        // Add MenuItems to Menu
        mn.add(m1);
        mn.add(m2);
        mn.add(m3);
        mn.addSeparator();
        mn.add(m4);

        // Add Menu to MenuBar
        mb.add(mn);

        // Set MenuBar for the Frame
        setMenuBar(mb);

        // // Add WindowListener to handle window close
        // addWindowListener(new WindowAdapter() {
        //     public void windowClosing(WindowEvent e) {
        //         System.exit(0);
        //     }
        // });
    }

    public static void main(String[] args) {
        // Create an instance of MenuDemo1 and make it visible
        MenuDemo1 md = new MenuDemo1();
        md.setVisible(true);
    }
}
