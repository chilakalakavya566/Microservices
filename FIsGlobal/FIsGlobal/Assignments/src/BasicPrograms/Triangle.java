package BasicPrograms;

class Test1{
	int height,base,areaoftriangle;
	void setData(int h,int b) {
		height=h;
		base=b;
	}
	void getArea()
	{
		areaoftriangle=(height*base)/2;
		System.out.printf(" area of triengle is %d",areaoftriangle);
	}
	
}
public class Triangle{

	public static void main(String[] args) {
		Test1 t =new Test1();
		t.setData(5,12);
		t.getArea();

	}

}

