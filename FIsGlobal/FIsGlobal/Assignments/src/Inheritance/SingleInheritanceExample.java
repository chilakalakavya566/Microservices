package Inheritance;


class Mobile{
	
	public void calling()
	{
		System.out.println("You can make calls.");
	}
	public void messaging()
	{
		System.out.println("you can send mesages.");
	}
	public void recording() {
		System.out.println("You can record voices.");
	}
}
class Teams extends Mobile
{
	@Override
	public void recording()
	{
		System.out.println("It records voices along with  sharing content");
		
	}
}
public class SingleInheritanceExample {

	public static void main(String[] args) {
		
		Mobile m= new Mobile();
		m.calling();
		m.messaging();
		m.recording();
		
		Teams t= new Teams();
		t.calling();
		t.messaging();
		t.recording();
		
		Mobile tm = new Teams();
		tm.calling();
		tm.messaging();
		tm.recording();
		
		
		
		

	}

}
