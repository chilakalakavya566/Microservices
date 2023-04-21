package FunctionalInterface;
interface Even
{
	public boolean checkEven(int x);
}

public class LambdaExample2 {

	public static void main(String[] args) {
	
		Even e= x -> x%2==0;
		System.out.println(e.checkEven(10));
	}

}
