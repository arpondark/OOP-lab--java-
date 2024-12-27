package BangkingSystem;

public class SavingsAccount extends Account{
    private String creditCardNo;
    public SavingsAccount(int accountId, String accountName, double accountBalance, double interestRate,
            String creditCardNo) {
        super(accountId, accountName, accountBalance, interestRate);
        this.creditCardNo = creditCardNo;
    }
    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }
    @Override
    public String toString() {
        return "SavingsAccount [accountId=" + super.accountId + ", creditCardNo=" + creditCardNo + ", accountName="
                + accountName + ", accountBalance=" + accountBalance + ", interestRate=" + interestRate + "]";
    }
    
   
}
