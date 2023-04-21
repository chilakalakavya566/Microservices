package Inheritance;

interface WoodProducts
{
	public void finalWoodProduct();
	
}
interface DesignedProducts
{
	public void productshape();
}
class WoodChair implements WoodProducts,DesignedProducts
{
	@Override
	public void finalWoodProduct()
	{
		System.out.println("I am a  wood chair.");
	}

	@Override
	public void productshape() {
		System.out.println("I turned into chair shape.");
		
	}
}


public class MultipleInheritanceExample {

	public static void main(String[] args) {
		WoodChair wc = new WoodChair();
		wc.finalWoodProduct();
		wc.productshape();
		

	}

}
