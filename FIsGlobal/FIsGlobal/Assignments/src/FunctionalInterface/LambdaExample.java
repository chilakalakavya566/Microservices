package FunctionalInterface;

interface Maths
{
	public int sub(int a, int b);
}
/*class Mathematics implements Maths
{

	@Override
	public void sub(int a, int b) {
		System.out.println("Subtraction : "+(a-b));
		
	}
	
}*/
public class LambdaExample {
	public static void main(String[] ars)
	{

	
	//Mathematics m1 = new Mathematics();
		Maths m1 = (a,b) -> a-b;
		System.out.println(m1.sub(50,10));
	
	m1.sub(40,10);
}
}
