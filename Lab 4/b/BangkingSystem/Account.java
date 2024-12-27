package BangkingSystem;

public class Account {
    protected int accountId;
    protected String accountName;
    protected double accountBalance;
    protected double interestRate;
    public Account() {
    }
    public Account(int accountId, String accountName, double accountBalance, double interestRate) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
        this.interestRate = interestRate;
    }
    public int getAccountId() {
        return accountId;
    }
    public String getAccountName() {
        return accountName;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void deposit(double amount){
        if(amount >0){
            this.accountBalance += amount;
            System.out.println("Amount credited successfully!");
        }
        else {
            System.out.println("Amount must be positive");
        }
        
    }
    public void withdraw(double amount){
        if(amount > 0 && this.accountBalance - amount >=0){
            this.accountBalance -= amount;
            System.out.println("Amount withdrawn successfully!");
        }
        else {
            System.out.println("Invalid amount!");
        }

    }
    @Override
    public String toString() {
        return "Account [accountId=" + accountId + ", accountName=" + accountName + ", accountBalance=" + accountBalance
                + ", interestRate=" + interestRate + "]";
    }
    public String getCreditCardNo() {
        return null;
    }
    public double getOverdraftLimit() {
        return 0;
    }
    
}