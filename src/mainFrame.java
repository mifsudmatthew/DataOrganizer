import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
public class mainFrame extends JFrame {
;
    ImageIcon icon = new ImageIcon("icon.PNG");
    Image image = icon.getImage();

    Border titleBorder = BorderFactory.createLineBorder(Color.black, 1);


    mainFrame(){
        UIManager.put("Button.select",Color.gray);
        UIManager.put("OptionPane.background",Color.gray);
        UIManager.put("Panel.background",Color.gray);
        UIManager.put("text", Color.darkGray);
        UIManager.put("Button.background",new Color(211,211,211));
        UIManager.put("Button.focus", new Color(0, 0, 0, 0));
        UIManager.put("ToggleButton.focus", new Color(0, 0, 0, 0));
        UIManager.put("Button.border", titleBorder);

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
