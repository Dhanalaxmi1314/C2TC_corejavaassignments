package userdefinedexception_assignments;

// Custom Exception: Thrown when withdrawal exceeds balance
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
