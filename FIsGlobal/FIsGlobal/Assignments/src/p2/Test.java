package p2;
import java.util.Scanner;

import p1.SumOfDigits;

public class Test {

	public static void main(String[] args) {
		
		
		Scanner sc= new  Scanner(System.in);
		System.out.println("Enter a value");
		int n=sc.nextInt();
		SumOfDigits s= new SumOfDigits();
		System.out.println(s.digits(n));
		
		
		
		
		sc.close();
	}

}
