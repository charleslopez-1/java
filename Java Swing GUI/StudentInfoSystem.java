import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentInfoSystem extends JFrame implements ActionListener{

    private JLabel nameLabel, mobileNumLabel, emailAddLabel, emailAddConfirmLabel, passLabel,confirmPassLabel, courseLabel;
    private JTextField nameField, mobileNumField, emailAddField, emailAddConfirmField;
    private JPasswordField passwordField, confirmPasswordField;
    private JRadioButton sem1, sem2;
    private JComboBox<String> courseCBox;
    private JButton saveBtn, clearBtn, resetBtn;
    private ButtonGroup buttonGroup;
    private JTextArea outputTextArea;

    StudentInfoSystem(){

        super("Account Register");

        JPanel infoPanel = new JPanel(new GridLayout(6,2,10,10));
        
        nameLabel = new JLabel("Name: ");
        mobileNumLabel = new JLabel("Mobile Number: ");
        emailAddLabel = new JLabel("Email:");
        emailAddConfirmLabel = new JLabel("Confirm Email: ");
        passLabel = new JLabel("Password: ");
        confirmPassLabel = new JLabel("Confirm Password");

        nameField = new JTextField(15);
        mobileNumField = new JTextField(15);
        emailAddField = new JTextField(15);
        emailAddConfirmField = new JTextField(15);
        
        passwordField = new JPasswordField(15);
        confirmPasswordField = new JPasswordField(15);

        infoPanel.add(nameLabel);
        infoPanel.add(nameField);

        infoPanel.add(mobileNumLabel);
        infoPanel.add(mobileNumField);

        infoPanel.add(emailAddLabel);
        infoPanel.add(emailAddField);

        infoPanel.add(emailAddConfirmLabel);
        infoPanel.add(emailAddConfirmField);

        infoPanel.add(passLabel);
        infoPanel.add(passwordField);

        infoPanel.add(confirmPassLabel);
        infoPanel.add(confirmPasswordField);


        JPanel selectionPanel = new JPanel(new FlowLayout());

        String [] courses = {"SELECT", "BSCS","BSIT","BSED"};

        courseLabel = new JLabel("Select Course: ");
        courseCBox = new JComboBox<String>(courses);

        selectionPanel.add(courseLabel);
        selectionPanel.add(courseCBox);

        sem1 = new JRadioButton("1st SEMESTER");
        sem2 = new JRadioButton("2nd SEMESTER");

        buttonGroup = new ButtonGroup();

        buttonGroup.add(sem1);
        buttonGroup.add(sem2);

        selectionPanel.add(sem1);
        selectionPanel.add(sem2);

        JPanel areaPanel = new JPanel(new FlowLayout());
        outputTextArea = new JTextArea(10,40);
        outputTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(outputTextArea);

        areaPanel.add(scrollPane);

        JPanel buttonPanel = new JPanel(new FlowLayout());

        saveBtn = new JButton("Save");
        saveBtn.addActionListener(this);

        resetBtn = new JButton("Reset");
        resetBtn.addActionListener(this);

        clearBtn = new JButton("Clear");
        clearBtn.addActionListener(this);

        buttonPanel.add(saveBtn);
        buttonPanel.add(resetBtn);
        buttonPanel.add(clearBtn);

        this.setLayout(new GridLayout(4,1));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        this.add(infoPanel);
        this.add(selectionPanel);
        this.add(areaPanel);
        this.add(buttonPanel);
        pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

}

public void actionPerformed(ActionEvent e){
    if (e.getSource() == saveBtn){
        String name = nameField.getText();
        String mobileNum = mobileNumField.getText();
        String emailAdd = emailAddField.getText();
        String confirmEmail = emailAddConfirmField.getText();
        String password = new String(passwordField.getPassword());
        String course = (String) courseCBox.getSelectedItem();
        String semester = sem1.isSelected()? "1st Semester" : (sem2.isSelected()? "2nd Semester" : "Not Selected");

            if (course.equals("SELECT")){
                JOptionPane.showMessageDialog(this, "Please select a course");
                return;
            }

            if (!(emailAdd.endsWith("@gmail.com") || (emailAdd.endsWith("@yahoo.com")))){
                JOptionPane.showMessageDialog(this, "gmail and yahoo are only accepted");
                return;
            }
            
            if (!(emailAdd.equals(confirmEmail))){
                JOptionPane.showMessageDialog(this, "Email dont match");
                return;
            }
            if (!mobileNum.matches("^09\\d{9}$")) {
                JOptionPane.showMessageDialog(this, "Please enter a valid mobile number");
                return;
            }

            
        outputTextArea.append("\n=== Student Record ===\n" +
                                "Name: " + name + "\n" +
                                "Course: " + course + "\n" +
                                "Semester: " + semester
        );
        
        JOptionPane.showMessageDialog(this, "LOG IN SUCCESFULLY");
                        
    
    } else if (e.getSource() == resetBtn){
        nameField.setText("");
        mobileNumField.setText("");
        emailAddField.setText("");
        emailAddConfirmField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
        courseCBox.setSelectedIndex(0);
        buttonGroup.clearSelection();

    } else if (e.getSource() == clearBtn){
        outputTextArea.setText(" ");
    }


}













    public static void main(String[] args) {
        new StudentInfoSystem();
    }
    
}