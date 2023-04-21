package BasicPrograms;

class Test{
	int side,area;
	void setData(int s) {
		side=s;
	}
	void getArea()
	{
		area=side*side;
		System.out.printf(" area of side is %d",area);
	}
	
}
public class Square2 {

	public static void main(String[] args) {
		Test t =new Test();
		t.setData(5);
		t.getArea();

	}

}
