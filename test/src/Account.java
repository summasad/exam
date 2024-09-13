public class Account {
    private String owner;
    private int balance;
    private String accountNo;

    public String getAccountNo() {
        return accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}