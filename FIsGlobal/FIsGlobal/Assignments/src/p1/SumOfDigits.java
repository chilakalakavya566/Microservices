package p1;

public class SumOfDigits {
	public int n;
	public int rem;
	public int sum=0;
	public int q;
	public int digits(int n)
	{
		while(n>0)
		{
			
			rem=n%10;
			sum=sum+rem;
			n=n/10;	}
		
		
		return sum;
		
	}
}
