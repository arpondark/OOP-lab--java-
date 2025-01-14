import java.util.*;
public class Main {
    private static List<Account> accounts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Account");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Get Balance");
            System.out.println("5. Get Account Info");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> performTransaction("withdraw");
                case 3 -> performTransaction("deposit");
                case 4 -> checkBalance();
                case 5 -> getAccountInfo();
                case 6 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void createAccount() {
        System.out.println("\n1. Checking Account");
        System.out.println("2. Savings Account");
        System.out.print("Enter account type: ");
        int type = scanner.nextInt();

        System.out.print("Enter Account ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Enter Annual Interest Rate (%): ");
        double annualInterestRate = scanner.nextDouble();

        if (type == 1) {
            System.out.print("Enter Overdraft Limit: ");
            double overdraftLimit = scanner.nextDouble();
            accounts.add(new CheckingAccount(id, balance, annualInterestRate, overdraftLimit));
        } else if (type == 2) {
            accounts.add(new SavingsAccount(id, balance, annualInterestRate));
        } else {
            System.out.println("Invalid account type!");
        }
    }

    private static void performTransaction(String transactionType) {
        System.out.print("Enter Account ID: ");
        int id = scanner.nextInt();
        Account account = findAccountById(id);

        if (account != null) {
            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();

            if (transactionType.equals("withdraw")) {
                account.withdraw(amount);
            } else if (transactionType.equals("deposit")) {
                account.deposit(amount);
            }
        } else {
            System.out.println("Account not found!");
        }
    }

    private static void checkBalance() {
        System.out.print("Enter Account ID: ");
        int id = scanner.nextInt();
        Account account = findAccountById(id);

        if (account != null) {
            System.out.println("Current Balance: $" + account.getBalance());
        } else {
            System.out.println("Account not found!");
        }
    }

    private static void getAccountInfo() {
        System.out.print("Enter Account ID: ");
        int id = scanner.nextInt();
        Account account = findAccountById(id);

        if (account != null) {
            System.out.println(account.getAccountDetails());
        } else {
            System.out.println("Account not found!");
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
}