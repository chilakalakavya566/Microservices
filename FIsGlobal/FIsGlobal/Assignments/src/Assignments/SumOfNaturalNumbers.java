package Assignments;
import java.util.Scanner;


public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		int number, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value :");
		number=sc.nextInt();
		result=(number*(number+1))/2;
		System.out.printf("Sum of %d natural numbers is %d",number,result);
		sc.close();
	}

}
