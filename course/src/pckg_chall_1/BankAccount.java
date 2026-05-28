package pckg_chall_1;

public class BankAccount {

    private int accountNumber;

    private double accountBalance;

    private String costumerName;

    private String email;

    private String phoneNumber;

    public BankAccount(){
        this("Bob", "aaaaa", "1234567", 1000, 11);
        System.out.println("emopty construcor");
    }
    public BankAccount(String costumerName,String email,String phoneNumber,double accountBalance,int accountNumber){
        System.out.println("Constructor with parameters called");
        this.costumerName = costumerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;

     }



    public void bankDeposit(double depositedMoney){
        accountBalance += depositedMoney;
        System.out.println("Deposit is " + depositedMoney + " new balance " + this.accountBalance);
    }

    public void bankWithdraw(double moneyTaken){
        if ((accountBalance - moneyTaken) < 0){
            System.out.println("insufficient funds " + "you have: " + this.accountBalance);
        }else {
            accountBalance -= moneyTaken;
            System.out.println("Withdrawn " + moneyTaken + " moneys " + " new balance " + this.accountBalance);
        }
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
