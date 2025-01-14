class SavingsAccount extends Account {
    private String creditCardNumber;
    private Calendar cardExpiryDate;

    public SavingsAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
        this.creditCardNumber = generateCreditCardNumber();
        this.cardExpiryDate = Calendar.getInstance();
        this.cardExpiryDate.add(Calendar.YEAR, 3); // Valid for 3 years
    }

    private String generateCreditCardNumber() {
        Random random = new Random();
        StringBuilder cardNumber = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            cardNumber.append(random.nextInt(10));
            if ((i + 1) % 4 == 0 && i != 15) {
                cardNumber.append("-");
            }
        }
        return cardNumber.toString();
    }

    public double getCreditBalance() {
        return getBalance() * 3;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public String getAccountDetails() {
        return "This is a Savings Account\n" +
                "Account ID: " + getId() + "\n" +
                "Date Created: " + getDateCreated().getTime() + "\n" +
                "Current Balance: $" + getBalance() + "\n" +
                "Annual Interest Rate: " + getAnnualInterestRate() + "%\n" +
                "Monthly Interest Amount: $" + getMonthlyInterestAmount() + "\n" +
                "Credit Card Number: " + creditCardNumber + "\n" +
                "Card Expiry Date: " + cardExpiryDate.getTime() + "\n" +
                "Credit Balance: $" + getCreditBalance();
    }
}
