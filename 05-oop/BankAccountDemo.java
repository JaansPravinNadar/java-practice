/*
 * Problem: Bank Account with Encapsulation
 *
 * Description:
 * Create a BankAccount class with proper encapsulation.
 * Validate deposits and withdrawals.
 *
 * Expected Output:
 * --- Bank Account ---
 * Account Holder: Jaans Pravin
 * Account Number: 12345
 * Balance: 5000.0
 *
 * Depositing 2000.0...
 * Balance: 7000.0
 *
 * Withdrawing 3000.0...
 * Balance: 4000.0
 *
 * Trying to withdraw 10000.0...
 * INVALID: Insufficient balance!
 * Balance: 4000.0
 *
 * Trying to deposit -500.0...
 * INVALID: Deposit amount must be positive!
 * Balance: 4000.0
 *
 * Concepts used: Encapsulation, private, getters, setters, validation
 */

class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;
    public void setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount<=0){
            System.out.println("The depositing Amount cannot be negative or 0");
        }else{
            balance=balance+amount;
        }
    }
    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("The withdrawing amount cannot be 0 or negative");
        }else if(amount>balance){
            System.out.println("Insufficient Balance");
        }else{
            balance=balance-amount;
        }
    }
    public void displayinfo(){
        System.out.println("Name of the Account Holder: "+getAccountHolder());
        System.out.println("Account Number of the Person: "+getAccountNumber());
        System.out.println("Balance: "+getBalance());
        System.out.println();
    }
}

public class BankAccountDemo {
    public static void main(String[] args){
                BankAccount acc = new BankAccount();
        acc.setAccountHolder("Jaans Pravin");
        acc.setAccountNumber(12345);
        acc.setBalance(5000);

        acc.displayinfo();

        System.out.println("--- Actions ---");
        acc.deposit(2000);
        System.out.println("Deposit: 2000");
        System.out.println("Balance: "+acc.getBalance());
        acc.withdraw(3000);
        System.out.println("Withdraw: 3000");
        System.out.println("Balance: "+acc.getBalance());
    } 

}
    
