package BangkingSystem;

public class CheckingAccount extends Account{
    private double overdraftLimit;
    public CheckingAccount(int accountId, String accountName, double accountBalance, double interestRate,
            double overdraftLimit) {
        super(accountId, accountName, accountBalance, interestRate);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    public void withdraw(double amount){
        if(amount > 0 && this.accountBalance - amount >= -this.overdraftLimit){
            this.accountBalance -= amount;
            System.out.println("Amount withdrawn successfully!");
        }
        else {
            System.out.println("Invalid amount!");
        }
    }
    @Override
    public String toString() {
        return "CheckingAccount [accountId=" + accountId + ", overdraftLimit=" + overdraftLimit + ", accountName="
                + accountName + ", accountBalance=" + accountBalance + ", interestRate=" + interestRate + "]";
    }
}
