import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class DataOrganizer {

    public static void main (String args[]){

        Border titleBorder = BorderFactory.createLineBorder(Color.black,3);

        // new main frame
        mainFrame frame = new mainFrame();

        // new button panel
        JPanel buttonPanel = new JPanel();

        // new title
        JLabel title = new JLabel("Data Organizer v1.0");
        title.setForeground(Color.DARK_GRAY);
        title.setBackground(Color.orange);
        title.setOpaque(true);
        title.setFont(new Font("Monospaced", Font.BOLD, 20));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setBorder(titleBorder);
        title.setBounds(80,30,250,40);
        frame.add(title);

        // configuring button panel.
        buttonPanel.setBounds(30,135,340,200);
        buttonPanel.setBackground(Color.orange);
        buttonPanel.setBorder(titleBorder);
        buttonPanel.setOpaque(true);

        // adding 'new' button
        JButton newButton = new JButton();
        newButton.setSize(120,40);
        newButton.setText("New");
        newButton.setLocation(110,20);

        // adding 'open' button
        JButton openButton = new JButton();
        openButton.setSize(120,40);
        openButton.setText("Open");
        openButton.setLocation(110,80);

        // adding credits label
        JLabel credits = new JLabel("By Matthew Mifsud",SwingConstants.CENTER);
        credits.setBounds(110,140,120,40);

        // adding each element together
        buttonPanel.add(newButton);
        buttonPanel.add(openButton);
        buttonPanel.add(credits);
        frame.add(buttonPanel,BorderLayout.CENTER);

    }
}

