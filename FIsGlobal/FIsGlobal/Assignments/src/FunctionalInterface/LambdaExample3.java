package FunctionalInterface;

interface Factorial
{
	public int fact(int x);
}
class Factorialclass
{
	/*public int fact(int x)
	{
		if( x<=1)
		{
			return x;
			
		}
		else
		{
			return x*fact(x-1);
		}
	}*/
}

public class LambdaExample3 {

	public static void main(String[] args) {
		
		Factorial f= (x)-> { int i,fact = 1;
			for(i=2;i<=x;i++)
				fact=i*fact;
			return fact;
		
		};
		System.out.println(f.fact(6));
			
	}

}
