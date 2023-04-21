package p2;

import java.util.Scanner;

import p1.SumOfRoundedValues;

public class Test2 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		SumOfRoundedValues s= new SumOfRoundedValues();
		System.out.println("Enter 3 values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println(s.sumOfRoundedValues(a, b, c));
		sc.close();
		}
}
