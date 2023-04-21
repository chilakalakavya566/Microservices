package Assignments;

import java.util.Scanner;
import java.lang.Math;

public class SumOfCubesOfNaturalNumbers {

	public static void main(String[] args) {
		int number;
		double result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value :");
		number=sc.nextInt();
		result=Math.pow((number*(number+1))/2,2);
		System.out.printf("Sum of %d natural numbers is %f",number,result);
		sc.close();
	}

}
