import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EnrollmentForm extends JFrame implements ActionListener{
    
JLabel FNameLabel, LNameLabel;
JTextField fNameTextField, lNameTextField;
JRadioButton maleRdButton,fMaleRdButton;
JComboBox<String> courseBox;
JCheckBox termsCheckBox;
JButton submitBtn;
JTextArea areaTextArea;

EnrollmentForm(){

    JPanel selectionPanel = new JPanel(new GridLayout(0,2,0,0));

    FNameLabel = new JLabel("First Name: ");
    LNameLabel = new JLabel("Last Name: ");

    fNameTextField = new JTextField(15);
    lNameTextField = new JTextField(15);

    maleRdButton = new JRadioButton("Male");
    fMaleRdButton = new JRadioButton("Female");

    ButtonGroup buttonGroup = new ButtonGroup();

    buttonGroup.add(maleRdButton);
    buttonGroup.add(fMaleRdButton);

    selectionPanel.add(FNameLabel);
    selectionPanel.add(fNameTextField);
    selectionPanel.add(LNameLabel);
    selectionPanel.add(lNameTextField);
    selectionPanel.add(maleRdButton);
    selectionPanel.add(fMaleRdButton);

    JPanel choosePanel = new JPanel(new GridLayout(2,1,0,0));

    String [] courseStrings = {"BSCS", "BSIT", "BSED"};

    courseBox = new JComboBox<String>(courseStrings);
    termsCheckBox = new JCheckBox("Agree to terms and conditions");

    choosePanel.add(courseBox);
    choosePanel.add(termsCheckBox);

    JPanel buttonPanel = new JPanel(new FlowLayout());

    submitBtn = new JButton("Submit");
    submitBtn.addActionListener(this);

    buttonPanel.add(submitBtn);

    JPanel displayPanel = new JPanel(new FlowLayout());

    areaTextArea = new JTextArea(10,40);
    areaTextArea.setEditable(false);

    JScrollPane scrollPane = new JScrollPane(areaTextArea);
    displayPanel.add(scrollPane);


this.setLayout(new GridLayout(4,1,0,0));
this.add(selectionPanel);
this.add(choosePanel);
this.add(displayPanel);
this.add(buttonPanel);

pack();
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLocationRelativeTo(null);
this.setVisible(true);

}

public void actionPerformed(ActionEvent e){

    

    if (e.getSource() == submitBtn){

        if (!(termsCheckBox.isSelected())){
        JOptionPane.showMessageDialog(this, "Please agree to terms and conditions first");
        return;
        }

        String Fname = fNameTextField.getText();
        String Lname = lNameTextField.getText();
        String course = (String) courseBox.getSelectedItem();
        String gender = maleRdButton.isSelected()? "Male" : (fMaleRdButton.isSelected()? "Female" : "Not Selected");
    
        areaTextArea.append("\n== STUDENT RECORD ==" + "\n" +
                            "First Name: " + Fname + "\n" + 
                            "Last Name: " + Lname + "\n" +
                            "Course: " + course + "\n" +
                            "Gender: " + gender 
                        );
    
    }

    
}






public static void main(String[] args) {

    new EnrollmentForm();

    }
}
