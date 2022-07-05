import javax.swing.*;
import java.awt.*;
public class mainFrame extends JFrame {
;
    ImageIcon icon = new ImageIcon("icon.PNG");
    Image image = icon.getImage();

    mainFrame(){
        UIManager.put("Button.select",Color.gray);
        this.setTitle("Data Organizer");
        this.setResizable(true);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.getContentPane().setBackground(backgroundColor);
        this.setIconImage(image);
        this.setAlwaysOnTop(true);
        this.setVisible(true);
    }
}
