package FunctionalInterface;

public class Banking {
	int balance;
	int minimumBalance;
	
	Banking()
	{
		balance=10000;
		minimumBalance=500;
		
	}

	public void withDraw(int amount)
	{
		int temp;
		temp=balance-amount;
		if(balance<amount)
			throw new InsufficientBalanceException();
		else if(temp<minimumBalance)
		{
			throw new InsufficientMinimumBalanceException();
		}
		 
		else
			
			System.out.println("Processing.....");
			System.out.println("your account Balance is: "+(temp));
			
	
	}

}

