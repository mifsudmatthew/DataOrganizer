import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static javax.swing.JTable.AUTO_RESIZE_OFF;


public class DataOrganizer implements ActionListener {

    ImageIcon icon = new ImageIcon("icon.PNG");

    Image image = icon.getImage();
    public static JButton newButton;
    public static JButton openButton;
    public static JButton updateButton;

    public static JButton addRowButton;

    public static JButton removeRowButton;

    public static JButton addColumnButton;

    public static JButton removeColumnButton;
    public static JFrame newMenu;
    public static mainFrame frame;
    public static JTable jtable;
    public static DefaultTableModel model;

    public static JScrollPane scrollPane;

    public static int columnNumber;

    public static String strColumnNumber;

    public static ArrayList<Object> column;

    public static Object[] row = new Object[0];

    public static String tempColumn;

    public static int rowsAdded = 0;

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
        newMenu.setLayout(new FlowLayout());
        newMenu.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        newMenu.setAlwaysOnTop(true);
        newMenu.getContentPane().setBackground(backgroundColor);
        newMenu.setVisible(false);

        // new table

        // instantiation
        jtable = new JTable();
        scrollPane = new JScrollPane();
        model = new DefaultTableModel();
        jtable.setBackground(backgroundColor);
        jtable.setPreferredScrollableViewportSize(new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth()-20,(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()-160));
        jtable.setModel(model);
        scrollPane.setViewportView(jtable);
        jtable.setAutoResizeMode(AUTO_RESIZE_OFF);
        jtable.setPreferredSize(null);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

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

        addRowButton = new JButton();
        addRowButton.setSize(120, 40);
        addRowButton.setText("Add Row");
        addRowButton.setBackground(backgroundColor);
        addRowButton.setBorder(titleBorder);
        addRowButton.setFocusPainted(false);
        addRowButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        addRowButton.setFont(new Font("SansSerif", Font.BOLD, 15));
        buttonDimensions.width = 160;
        buttonDimensions.height = 60;
        addRowButton.setMaximumSize(buttonDimensions);

        addColumnButton = new JButton();
        addColumnButton.setSize(120, 40);
        addColumnButton.setText("Add Column");
        addColumnButton.setBackground(backgroundColor);
        addColumnButton.setBorder(titleBorder);
        addColumnButton.setFocusPainted(false);
        addColumnButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        addColumnButton.setFont(new Font("SansSerif", Font.BOLD, 15));
        buttonDimensions.width = 160;
        buttonDimensions.height = 60;
        addColumnButton.setMaximumSize(buttonDimensions);

        removeColumnButton = new JButton();
        removeColumnButton.setSize(120, 40);
        removeColumnButton.setText("Remove Column");
        removeColumnButton.setBackground(backgroundColor);
        removeColumnButton.setBorder(titleBorder);
        removeColumnButton.setFocusPainted(false);
        removeColumnButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        removeColumnButton.setFont(new Font("SansSerif", Font.BOLD, 15));
        buttonDimensions.width = 160;
        buttonDimensions.height = 60;
        removeColumnButton.setMaximumSize(buttonDimensions);

        removeRowButton = new JButton();
        removeRowButton.setSize(120, 40);
        removeRowButton.setText("Remove Row");
        removeRowButton.setBackground(backgroundColor);
        removeRowButton.setBorder(titleBorder);
        removeRowButton.setFocusPainted(false);
        removeRowButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        removeRowButton.setFont(new Font("SansSerif", Font.BOLD, 15));
        buttonDimensions.width = 160;
        buttonDimensions.height = 60;
        removeRowButton.setMaximumSize(buttonDimensions);

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
        newMenu.add(scrollPane);
        newMenu.add(addRowButton,FlowLayout.CENTER);
        newMenu.add(removeRowButton,FlowLayout.RIGHT);
        newMenu.add(removeColumnButton,FlowLayout.RIGHT);
        newMenu.add(addColumnButton,FlowLayout.RIGHT);

    }
        @Override
        public void actionPerformed (ActionEvent e) {
            if (e.getSource() == newButton) {
                System.out.println("New button activated");
                frame.setAlwaysOnTop(false);
               strColumnNumber = JOptionPane.showInputDialog(null,"Enter number of columns","2");
                if(strColumnNumber!=null) {

                    columnNumber = Integer.parseInt(strColumnNumber);
                    column = new ArrayList<Object>();
                    // setting up each column
                    for (int i = 0; i < columnNumber; i++) {
                        tempColumn = JOptionPane.showInputDialog(null,"Enter name of column " + (i + 1));
                        column.add(tempColumn);
                    }
                    model.setColumnIdentifiers(column.toArray());
                    // setting default column size
                    for(int i = 0;i<column.size();i++) {
                        jtable.getColumnModel().getColumn(i).setPreferredWidth(150);
                    }
                    newMenu.setVisible(true);
                }
            }else if(e.getSource() == openButton){
                System.out.println("Open button activated");
            }else if(e.getSource() == updateButton){
                System.out.println("Update button activated");
            }else if(e.getSource() == addRowButton){
                model.addRow(row);
                rowsAdded++;
                System.out.println("Adding row");

            }else if(e.getSource() == removeRowButton){
                if(rowsAdded>0) {
                    model.removeRow(rowsAdded - 1);  //  -1 since remove row starts from Row 0
                    rowsAdded--;
                }else{

                    newMenu.setAlwaysOnTop(false);
                    JOptionPane.showMessageDialog(null,"There are no records.");
                    newMenu.setAlwaysOnTop(true);
                }
            }else if(e.getSource() == addColumnButton){
                System.out.println("Adding column");
                newMenu.setAlwaysOnTop(false);
                tempColumn = JOptionPane.showInputDialog(null,"Enter name of column");
                newMenu.setAlwaysOnTop(true);
                column.add(tempColumn);
                model.setColumnIdentifiers(column.toArray());
                for(int i = 0;i<column.size();i++) {
                    jtable.getColumnModel().getColumn(i).setPreferredWidth(150);
                }
            }else if(e.getSource() == removeColumnButton){

                column.remove(column.size()-1);
                model.setColumnIdentifiers(column.toArray());
                // setting column width

                for(int i = 0;i<column.size();i++) {
                    jtable.getColumnModel().getColumn(i).setPreferredWidth(150);
                }
            }
        }
}