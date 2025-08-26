package userdefinedexception_assignments;

// Custom Exception: Thrown when deposit/withdraw amount is invalid
public class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}
