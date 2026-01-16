package exceptions.banking;

public class BankingApp {
    private int balance;
    private final String customerName;

    public BankingApp(int balance, String customerName) {
        this.balance = balance;
        this.customerName = customerName;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) throws InsufficientBalanceException {
        if(amount > this.balance) {
            throw new InsufficientBalanceException("Hi " + this.customerName + " !, Insufficient balance in your account !! , Balance : " + this.balance);
        }

        this.balance -= amount; // balance = balance - amount;
        System.out.println("Hi " + this.customerName + " !, Withdrawal completed successfully !! , Balance : " + this.balance);

    }
}
