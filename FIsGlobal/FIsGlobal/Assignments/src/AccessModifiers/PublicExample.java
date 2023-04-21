package AccessModifiers;

class First
{
	public int x=10;
	private int y=20;
	protected int z=30;
	int w=40;
	public void publicDdisplay()
	{
		System.out.println("I am a public method can be accesseble anywhere .");
	}
	private void privateDisplay(int y)
	{
		System.out.println("I am a private method and works only in this class.");
	}
	protected void protecredDisplay()
	{
		
	}
	
	
}

public class PublicExample {

	public static void main(String[] args) {
		

	}

}
