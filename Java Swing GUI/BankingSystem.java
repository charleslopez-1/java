import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class BankingSystem extends JFrame implements ActionListener {
 
    private float balance = 1000;
    private JLabel title, currentBalance, withdrawLabel;
    private JTextField amountTextField;
    private JRadioButton depositRdBtn, withdrawRdBtn;
    private ButtonGroup buttonGroup;
    private JButton processButton;

    BankingSystem(){

        super("Banking System");

        balance = 1000;

        JPanel transacPanel = new JPanel(new GridLayout(4,1));

        title = new JLabel("BANKING SYSTEM");
        title.setHorizontalAlignment(JLabel.CENTER);
        currentBalance = new JLabel("Current Balance: " + balance);
        withdrawLabel = new JLabel("Enter Amount: ");

        amountTextField = new JTextField(15);

        transacPanel.add(title);
        transacPanel.add(currentBalance);
        transacPanel.add(amountTextField);
        transacPanel.add(withdrawLabel);

        JPanel rdnButtonPanel = new JPanel(new FlowLayout());

        depositRdBtn = new JRadioButton("Deposit");
        withdrawRdBtn = new JRadioButton("Withdraw");

        ButtonGroup buttonGroup = new ButtonGroup();

        buttonGroup.add(depositRdBtn);
        buttonGroup.add(withdrawRdBtn);

        rdnButtonPanel.add(depositRdBtn);
        rdnButtonPanel.add(withdrawRdBtn);

        JPanel processPanel = new JPanel(new FlowLayout());

        processButton = new JButton("Process");
        processButton.addActionListener(this);
    
        processPanel.add(processButton);

        this.setLayout(new GridLayout(3,1,0,0));
        this.add(transacPanel);
        this.add(rdnButtonPanel);
        this.add(processPanel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        pack();
        this.setVisible(true);

    }
        public void actionPerformed(ActionEvent e){
            
            float amount = Float.parseFloat(amountTextField.getText());
        
            if(e.getSource() == processButton){

                if (depositRdBtn.isSelected()){

                    balance += amount;

                } else if (withdrawRdBtn.isSelected()){
                    if (amount > balance){

                        JOptionPane.showMessageDialog(this, "Insufficient Funds!");
                            amountTextField.setText("");
                                return;

                    } else
                    balance -= amount;

                } else {
                    JOptionPane.showMessageDialog(this, "PLEASE SELECT 'WITHDRAW' OR 'DEPOSIT' ");
                    return;
                }

                }
            

                currentBalance.setText("Current Balance: " + balance);
                amountTextField.setText("");

            }

        






        public static void main(String[] args) {
            new BankingSystem();
        }
    }
