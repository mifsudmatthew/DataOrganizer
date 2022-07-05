import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class DataOrganizer implements ActionListener {
    public static JButton newButton;
    public static JButton openButton;

    public static JButton updateButton;
    public static JFrame newMenu;
    public static mainFrame frame;

    public static int structHeight;

    public static void main (String args[]) {
        Dimension buttonDimensions = new Dimension();
        Color backgroundColor = new Color(211,211,211);
        Border titleBorder = BorderFactory.createLineBorder(Color.black, 3);

        // new main frame
        frame = new mainFrame();

        // new menu
        newMenu = new JFrame();
        newMenu.setSize((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(),(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight());
        newMenu.setExtendedState(JFrame.MAXIMIZED_BOTH);
        newMenu.setTitle("Data Organizer");
        newMenu.setResizable(true);
        newMenu.setLayout(null);
        newMenu.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        newMenu.getContentPane().setBackground(Color.LIGHT_GRAY);
        newMenu.setAlwaysOnTop(true);
        newMenu.getContentPane().setBackground(backgroundColor);
        newMenu.setVisible(false);

        // new button panel
        JPanel buttonPanel = new JPanel();

        // new title
        JLabel title = new JLabel("Data Organizer Alpha");
        title.setForeground(Color.DARK_GRAY);
        title.setBackground(backgroundColor);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setOpaque(true);
        title.setFont(new Font("SansSerif", Font.BOLD, 20));
        title.setBorder(titleBorder);

        // configuring button panel.
        buttonPanel.setBackground(new Color(100,100,100));
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        // adding 'new' button
        newButton = new JButton();
        newButton.setText("New");
        newButton.setBackground(backgroundColor);
        newButton.setBorder(titleBorder);
        newButton.setFocusPainted(false);
        newButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        newButton.setFont(new Font("SansSerif", Font.BOLD, 15));
        buttonDimensions.width = 160;
        buttonDimensions.height = 60;
        newButton.setMaximumSize(buttonDimensions);
//
//
//        // adding 'open' button
        openButton = new JButton();
        openButton.setSize(120, 40);
        openButton.setText("Open");
        openButton.setBackground(backgroundColor);
        openButton.setBorder(titleBorder);
        openButton.setFocusPainted(false);
        openButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        openButton.setFont(new Font("SansSerif", Font.BOLD, 15));
        buttonDimensions.width = 160;
        buttonDimensions.height = 60;
        openButton.setMaximumSize(buttonDimensions);

        // adding 'update' button

        updateButton = new JButton();
        updateButton.setSize(120, 40);
        updateButton.setText("Update");
        updateButton.setBackground(backgroundColor);
        updateButton.setBorder(titleBorder);
        updateButton.setFocusPainted(false);
        updateButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        updateButton.setFont(new Font("SansSerif", Font.BOLD, 15));
        buttonDimensions.width = 160;
        buttonDimensions.height = 60;
        updateButton.setMaximumSize(buttonDimensions);

//
//         adds listeners to both buttons
        listener listen = new listener();
//
//         adding credits label
        JLabel credits = new JLabel("By Matthew Mifsud");
        Dimension sizeCredits = credits.getPreferredSize();
        credits.setSize(sizeCredits.width,sizeCredits.height);
        credits.setHorizontalAlignment(SwingConstants.CENTER);
        credits.setBorder(titleBorder);
        credits.setBackground(backgroundColor);

//       adding each element together
        frame.add(buttonPanel,BorderLayout.CENTER);
        frame.add(title,BorderLayout.NORTH);
        buttonPanel.add(Box.createVerticalStrut(50));
        buttonPanel.add(newButton);
        buttonPanel.add(Box.createVerticalStrut(100));
        buttonPanel.add(openButton);
        buttonPanel.add(Box.createVerticalStrut(100));
        buttonPanel.add(updateButton);
        frame.add(credits,BorderLayout.SOUTH);
        frame.setMinimumSize(new Dimension(400, 600));
        frame.setSize(400,600);
    }
        @Override
        public void actionPerformed (ActionEvent e) {
            if (e.getSource() == newButton) {
                System.out.println("New button activated");
                newMenu.setVisible(true);
            }else if(e.getSource() == openButton){
                System.out.println("Open button activated");
            }else if(e.getSource() == updateButton){
                System.out.println("Update button activated");
            }

        }


}

