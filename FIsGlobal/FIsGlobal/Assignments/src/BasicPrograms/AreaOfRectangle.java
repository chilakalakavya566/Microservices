package BasicPrograms;

import java.util.Scanner;


public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int length,breadth,area;
		System.out.println("Enter Length:");
		length = sc.nextInt();
		System.out.println("Enter Breadth:");
		breadth= sc.nextInt();
		area=length*breadth;
		System.out.printf("Area of the Rectangle is:%d",area);
		sc.close();
		}

}
