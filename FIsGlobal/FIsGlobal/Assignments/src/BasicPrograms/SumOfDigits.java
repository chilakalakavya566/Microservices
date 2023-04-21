package BasicPrograms;

import java.util.Scanner;

public class SumOfDigits {
	
	
	public static void main(String args[])
	{
		int n,Q,R,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value");
		n=sc.nextInt();
		System.out.println("Value is entered");
		System.out.println(sum);
		while(n>=0)
		{
			System.out.println("Entered into loop");
		Q=n/10;
		R=n%10;
		sum=sum+R;
		n=Q;
		}
		System.out.println(sum);
		

	}
}