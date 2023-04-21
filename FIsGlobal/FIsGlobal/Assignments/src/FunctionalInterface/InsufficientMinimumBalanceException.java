package FunctionalInterface;

public class InsufficientMinimumBalanceException extends RuntimeException {
	InsufficientMinimumBalanceException()
	{
		super("You should maintain minimum balance of 500 in your account.");
	}

}
