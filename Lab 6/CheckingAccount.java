class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int id, double balance, double annualInterestRate, double overdraftLimit) {
        super(id, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public String getAccountDetails() {
        return "This is a Checking Account\n" +
                "Account ID: " + getId() + "\n" +
                "Date Created: " + getDateCreated().getTime() + "\n" +
                "Current Balance: $" + getBalance() + "\n" +
                "Annual Interest Rate: " + getAnnualInterestRate() + "%\n" +
                "Monthly Interest Amount: $" + getMonthlyInterestAmount() + "\n" +
                "Overdraft Limit: $" + overdraftLimit;
    }
}
