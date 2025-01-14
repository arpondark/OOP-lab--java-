import java.util.*;

abstract class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Calendar dateCreated;

    public Account() {
        this(0, 0.0, 0.0);
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = Calendar.getInstance();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }

    public double getMonthlyInterestAmount() {
        return balance * getMonthlyInterestRate();
    }

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    public abstract String getAccountDetails();
}
