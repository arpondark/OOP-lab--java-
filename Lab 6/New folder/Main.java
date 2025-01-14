import java.util.*;

abstract class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private final Calendar dateCreated;

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

class CheckingAccount extends Account {
    private final double overdraftLimit;

    public CheckingAccount(int id, double balance, double annualInterestRate, double overdraftLimit) {
        super(id, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Error: Overdraft limit exceeded!");
        }
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public String getAccountDetails() {
        return "Checking Account\n" +
                "Account ID: " + getId() + "\n" +
                "Date Created: " + getDateCreated().getTime() + "\n" +
                "Current Balance: $" + getBalance() + "\n" +
                "Annual Interest Rate: " + getAnnualInterestRate() + "%\n" +
                "Monthly Interest Amount: $" + getMonthlyInterestAmount() + "\n" +
                "Overdraft Limit: $" + overdraftLimit;
    }
}

class SavingsAccount extends Account {
    private final String creditCardNumber;
    private final Calendar cardExpiryDate;

    public SavingsAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
        this.creditCardNumber = generateCreditCardNumber();
        this.cardExpiryDate = Calendar.getInstance();
        this.cardExpiryDate.add(Calendar.YEAR, 3);
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
            System.out.println("Error: Insufficient balance!");
        }
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public String getAccountDetails() {
        return "Savings Account\n" +
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

public class Main {
    private static final List<Account> accounts = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = getIntInput("Enter your choice: ");
            switch (choice) {
                case 1 -> createAccount();
                case 2 -> performTransaction("withdraw");
                case 3 -> performTransaction("deposit");
                case 4 -> checkBalance();
                case 5 -> getAccountInfo();
                case 6 -> {
                    System.out.println("Exiting the system. Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n========== Account Management System ==========");
        System.out.println("1. Create Account");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Check Balance");
        System.out.println("5. Get Account Info");
        System.out.println("6. Exit");
        System.out.println("===============================================");
    }

    private static void createAccount() {
        System.out.println("\n1. Checking Account");
        System.out.println("2. Savings Account");
        int type = getIntInput("Enter account type: ");
        int id = getIntInput("Enter Account ID: ");
        double balance = getDoubleInput("Enter Initial Balance: ");
        double annualInterestRate = getDoubleInput("Enter Annual Interest Rate (%): ");

        if (type == 1) {
            double overdraftLimit = getDoubleInput("Enter Overdraft Limit: ");
            accounts.add(new CheckingAccount(id, balance, annualInterestRate, overdraftLimit));
        } else if (type == 2) {
            accounts.add(new SavingsAccount(id, balance, annualInterestRate));
        } else {
            System.out.println("Invalid account type!");
        }
    }

    private static void performTransaction(String transactionType) {
        int id = getIntInput("Enter Account ID: ");
        Account account = findAccountById(id);

        if (account != null) {
            double amount = getDoubleInput("Enter amount: ");
            if (transactionType.equals("withdraw")) {
                account.withdraw(amount);
            } else if (transactionType.equals("deposit")) {
                account.deposit(amount);
            }
        } else {
            System.out.println("Error: Account not found!");
        }
    }

    private static void checkBalance() {
        int id = getIntInput("Enter Account ID: ");
        Account account = findAccountById(id);

        if (account != null) {
            System.out.println("Current Balance: $" + account.getBalance());
        } else {
            System.out.println("Error: Account not found!");
        }
    }

    private static void getAccountInfo() {
        int id = getIntInput("Enter Account ID: ");
        Account account = findAccountById(id);

        if (account != null) {
            System.out.println(account.getAccountDetails());
        } else {
            System.out.println("Error: Account not found!");
        }
    }

    private static Account findAccountById(int id) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                return account;
            }
        }
        return null;
    }

    private static int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static double getDoubleInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a valid number.");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
