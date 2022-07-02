import javax.swing.*;
import java.awt.*;
public class mainFrame extends JFrame {
    Color backgroundColor = new Color(255,140,0);
    mainFrame(){
        UIManager.put("Button.select",backgroundColor);
        this.setSize(420,420);
        this.setTitle("Data Organizer");
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(backgroundColor);
        this.setAlwaysOnTop(true);
        this.setVisible(true);
    }
}
