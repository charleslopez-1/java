import java.io.*;

class BankAccount{

    private String accountHolder;
    private String accountNumber;
    private double balance;


    // setters
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance){
        if (balance >= 0){
        this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative");
        } 
    }

    // getters
    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public double getBalance(){
        return balance;
    
    }

    public double deposit (double amount){

         if (amount > 0){
            balance += amount;
            System.out.println("Successfully deposited PHP " + amount);

        } else {
            System.out.println("Error: Invalid deposit amount.");
        }
        return balance;
    }

    public double withdraw (double amount){
        if ((amount <= 0) || (amount > balance)){
            System.out.println("Error: Insufficient Funds.");

        } else if (amount <= balance){
            balance -= amount;
            System.out.println("Sucessfully withdrawn PHP " + amount);
            System.out.println();
        }
        return balance;
    }

    public void displayInfo(){
        System.out.println();
        System.out.println("--- Account Information ---");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: PHP " + balance);
    }
}


public class EncapsulationBankingSystem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BankAccount bank = new BankAccount();


        System.out.print("Enter account holder name: ");
        String strName = br.readLine();

        System.out.print("Enter account number: ");
        String strAccNum = br.readLine();

        System.out.print("Enter initial balance: ");
        double dblBalance = Double.parseDouble(br.readLine());

        bank.setAccountHolder(strName);
        bank.setAccountNumber(strAccNum);
        bank.setBalance(dblBalance);

        bank.displayInfo();

        System.out.print("Enter amount to deposit: ");
        double depositAmount = Double.parseDouble(br.readLine());
        bank.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = Double.parseDouble(br.readLine());
        bank.withdraw(withdrawAmount);

        bank.displayInfo();
    }    
}
