import javax.swing.*;
import java.awt.*;

public class mainFrame extends JFrame {

    mainFrame(){

        Color backgroundColor = new Color(144,238,144);
        this.setSize(420,420);
        this.setTitle("Data Organizer");
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(backgroundColor);
        this.setVisible(true);

    }

}
