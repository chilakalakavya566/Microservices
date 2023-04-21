package FunctionalInterface;

public class ExceptionExample {

	public static void main(String[] args) {
		int a=10,b=0,c;
		try {
			
		c=a/b;
		System.out.println("Result is :"+c);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("provide b value grater than 0.");
		}
		finally
		{
			System.out.println("Follow the instruction  specified.");
		}
		

	}

}
