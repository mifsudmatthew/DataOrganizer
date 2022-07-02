import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// possible fix https://stackoverflow.com/questions/54985017/java-swing-components-layout-position-changes-after-restoring-a-minimized-window
public class DataOrganizer implements ActionListener {

    public static JButton newButton;
    public static JButton openButton;
    public static JFrame newMenu;


    public static void main (String args[]) {

        Border titleBorder = BorderFactory.createLineBorder(Color.black, 3);
        // new main frame
        mainFrame frame = new mainFrame();

        // new menu
        newMenu = new JFrame();
        newMenu.setSize(420, 420);
        newMenu.setTitle("Data Organizer");
        newMenu.setResizable(false);
        newMenu.setLayout(null);
        newMenu.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        newMenu.getContentPane().setBackground(Color.LIGHT_GRAY);
        newMenu.setAlwaysOnTop(true);
        newMenu.setVisible(false);

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
        title.setBounds(80, 30, 250, 40);
        frame.add(title);
        //yo

        // configuring button panel.
        buttonPanel.setBounds(30, 135, 340, 200);
        buttonPanel.setBackground(Color.orange);
        buttonPanel.setBorder(titleBorder);
        buttonPanel.setOpaque(true);

        // adding 'new' button

        newButton = new JButton();
        newButton.setSize(120, 40);
        newButton.setText("New");
        newButton.setLocation(110, 20);
        newButton.setBackground(Color.ORANGE);
        newButton.setBorder(titleBorder);
        newButton.setFocusPainted(false);


        // adding 'open' button
        openButton = new JButton();
        openButton.setSize(120, 40);
        openButton.setText("Open");
        openButton.setLocation(110, 80);
        openButton.setBackground(Color.ORANGE);
        openButton.setBorder(titleBorder);
        openButton.setFocusPainted(false);

        // adds listeners to both buttons
        listener listen = new listener();

        // adding credits label
        JLabel credits = new JLabel("By Matthew Mifsud", SwingConstants.CENTER);
        credits.setBounds(110, 140, 120, 40);

        // adding each element together
        buttonPanel.add(newButton);
        buttonPanel.add(openButton);
        buttonPanel.add(credits);
        frame.add(buttonPanel, BorderLayout.CENTER);

    }
        @Override
        public void actionPerformed (ActionEvent e) {
            if (e.getSource() == newButton) {
                System.out.println("New button activated");
                newMenu.setVisible(true);


            }else if(e.getSource() == openButton){
                System.out.println("Open button activated");
            }
        }
}

