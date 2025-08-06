package Day_14.Synchronization;

public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException() {
		super("Insufficient balance in your account");
	}

	public InsufficientBalanceException(String message) {
		super(message);
	}
}
