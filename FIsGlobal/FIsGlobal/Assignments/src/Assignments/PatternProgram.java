package Assignments;

import java.util.Scanner;

public class PatternProgram {

	public static void main(String[] args) {

		int number,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value :");
		number=sc.nextInt();
		for(i=1;i<=number;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
