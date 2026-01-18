import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class LogIn extends JFrame implements ActionListener {

private JLabel emaiLabel, passwordLabel;
private JPasswordField passField;
private JTextField emailField;
private JButton logIN;
private JTextArea outputArea;

    LogIn(){
        
        this.setTitle("Student Info System");
        this.setSize(450,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel topPanel = new JPanel();

        emaiLabel = new JLabel("Email");
        passwordLabel = new JLabel("Password");

        emailField = new JTextField(15);
        passField = new JPasswordField(15);

        logIN = new JButton("LOG IN");
        logIN.addActionListener(this);

        topPanel.setLayout(new GridLayout(2,2));
        topPanel.add(emaiLabel);
        topPanel.add(emailField);
        
        topPanel.add(passwordLabel);
        topPanel.add(passField);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());
        bottomPanel.add(logIN);

        this.setLayout(new BorderLayout());
        this.add(topPanel, BorderLayout.CENTER);
        this.add(bottomPanel, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == logIN){
            String email = emailField.getText();
            String password = new String(passField.getPassword());

            JOptionPane.showMessageDialog(this, "Log In Successful!");
            this.dispose();
        }
    }

    public static void main(String[] args) {
        new LogIn();
    }
}
    




