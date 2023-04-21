package BasicPrograms;

import java.util.Scanner;

 class Square {

	public static void main(String[] args) {
		int side,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side value");
		side= sc.nextInt();
		area= side*side;
		System.out.printf("Area of square is:%d",area);
		sc.close();
		
		

	}

}
