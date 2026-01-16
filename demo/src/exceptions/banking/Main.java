package exceptions.banking;

public class Main {
    static void main() {
        BankingApp bankingApp = new BankingApp(5000, "Keerthi");
        try {
            bankingApp.withdraw(2000); // 3000
            bankingApp.withdraw(2000); // 1000
            bankingApp.withdraw(2000); // Throw InsufficientBalanceException
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
