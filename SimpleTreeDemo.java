import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.BorderLayout;

public class SimpleTreeDemo extends JFrame {

    public SimpleTreeDemo() {
       
        setTitle("Simple JTree Example");
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        
              DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");
        
        
        DefaultMutableTreeNode leaf1 = new DefaultMutableTreeNode("Leaf 1");
        DefaultMutableTreeNode leaf2 = new DefaultMutableTreeNode("Leaf 2");
        DefaultMutableTreeNode leaf3 = new DefaultMutableTreeNode("Leaf 3");

      
        node1.add(leaf1);
        node1.add(leaf2);
        node2.add(leaf3);
        
       
        root.add(node1);
        root.add(node2);
        
       
        JTree tree = new JTree(root);
        
       
        JScrollPane scrollPane = new JScrollPane(tree);
        
       
        add(scrollPane, BorderLayout.CENTER);
        
       
        setSize(400, 300);
        
      
        setVisible(true);
    }

    public static void main(String[] args) {
       
        SwingUtilities.invokeLater(() -> new SimpleTreeDemo());
    }
}