package exceptions.banking;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        // Send emails, messages
        // Risk
        super(message);
    }

}
