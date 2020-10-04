package academy.learnprogramming;

public class BankAccount {

    public static void main(String[] args) {

        BankAccount savingsAccount = new BankAccount(123,100,"Srinivas","srinivas@email.com","1234567890");

        System.out.println("Start of Day Balance of Mr."+savingsAccount.getCustomerName()+"="+savingsAccount.getBalance());
        System.out.println("Depositing Rs100="+savingsAccount.depositAmount(100));
        System.out.println("Mid day Balance of Mr."+savingsAccount.getCustomerName()+"="+savingsAccount.getBalance());
        System.out.println("Balance after Withdrawing Rs150="+savingsAccount.withDrawAmount(150));
        System.out.println("End of Day Balance of Mr."+savingsAccount.getCustomerName()+"="+savingsAccount.getBalance());

    }

    private long accountNumber;
    private double balance;
    private String customerName;
    private String emailId;
    private String phoneNo;

    public BankAccount(long accountNumber, double balance, String customerName, String emailId, String phoneNo) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.emailId = emailId;
        this.phoneNo = phoneNo;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public double depositAmount(double amount){
        this.balance=this.balance+amount;
        return (this.balance);
    }

    public double withDrawAmount(double amount){
        if(amount<this.balance){
            this.balance=this.balance-amount;
            return this.balance;
        }
        return(-1);
    }
}
