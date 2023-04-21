package FunctionalInterface;

public class InsufficientBalanceException extends RuntimeException {

	InsufficientBalanceException()
	{
		super("No sufficient funds in your account");
	}
}
