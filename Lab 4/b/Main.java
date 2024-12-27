import BangkingSystem.Account;
import BangkingSystem.CheckingAccount;
import BangkingSystem.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        int i = 0;
        SavingsAccount s1 = new SavingsAccount(1001, "Alice", 2000, 10.0, "12345679");
        SavingsAccount s2 = new SavingsAccount(1002, "Bob", 5000, 10.0, "123456790");
        CheckingAccount c1 = new CheckingAccount(2001, "UIU", 500000, 2.0, 50000);
        CheckingAccount c2 = new CheckingAccount(2002, "DIU", 400000, 2.0, 40000);
        accounts[i++] = s1;
        accounts[i++] = s2;
        accounts[i++] = c1;
        accounts[i++] = c2;

        for(int j = 0; j<i; j++){
            System.out.println(accounts[j].getCreditCardNo());
            System.out.println(accounts[j].getOverdraftLimit());
        }
    }
}
