package Inheritance;
class CaluclatorV1
{
	public void add()
	{
		System.out.println("I can provide addition operation.");
	}
	public void display()
	{
		System.out.println("I am version_1 Only addition method is available.");
	}
}
class CaluclatorV2 extends CaluclatorV1
{
	public void sub()
	{
		System.out.println("I can provide subtraction operation.");
	}
	public void display()
	{
		System.out.println("I am updated version 2 there are 2 methods addition and subtraction also.");
	}
	
	
}
class CaluclatorV3 extends CaluclatorV2
{
	public void mul()
	{
		System.out.println("I can provide Multiplication operation.");
	}
	public void display()
	{
		System.out.println("I am the latest version of calculator u can perform addition,subtraction and multiplication.");
	}
	
	
}

public class MultilevelInheritanceExample {

	public static void main(String[] args) {
		CaluclatorV3 v3= new CaluclatorV3();
		v3.add();
		v3.sub();
		v3.mul();
		v3.display();
		

	}

}
