public class listener extends DataOrganizer{
    listener() {
       newButton.addActionListener(this);
       openButton.addActionListener(this);
       updateButton.addActionListener(this);
       addRowButton.addActionListener(this);
       removeRowButton.addActionListener(this);
       addColumnButton.addActionListener(this);
       removeColumnButton.addActionListener(this);
    }
}
